package com.spectralogic.ds3client.networking;

import com.google.common.base.Function;
import com.google.common.base.Joiner;
import com.google.common.collect.Iterators;
import com.spectralogic.ds3client.BulkCommand;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

public class NetUtils {

    public static URL buildUrl(final ConnectionDetails connectionDetails, final String path) throws MalformedURLException {
        return buildUrl(connectionDetails, path, null);
    }

    public static URL buildUrl(final ConnectionDetails connectionDetails, final String path, final Map<String, String> params) throws MalformedURLException {
        final StringBuilder builder = new StringBuilder();
        builder.append(connectionDetails.isSecure()? "https": "http").append("://");
        builder.append(connectionDetails.getEndpoint());
        if(!path.startsWith("/")) {
            builder.append('/');
        }

        builder.append(path);

        if(params != null && params.size() > 0) {
            builder.append('?');

            final Set<Map.Entry<String, String>> paramSet = params.entrySet();
            final Iterator<Map.Entry<String, String>> paramIterator = paramSet.iterator();
            Map.Entry<String, String> paramEntry = paramIterator.next();

            addQueryParam(builder, paramEntry);
            while(paramIterator.hasNext()) {
                paramEntry = paramIterator.next();
                builder.append('&');
                addQueryParam(builder, paramEntry);
            }
        }

        return new URL(builder.toString());
    }

    public static String buildQueryString(final Map<String, String> queryParams) {
        final Iterator<String> stringIter = Iterators.transform(queryParams.entrySet().iterator(), new Function<Map.Entry<String, String>, String>() {
            @Override
            public String apply(Map.Entry<String, String> input) {
                return input.getKey() + "=" + input.getValue();
            }
        });

        final Joiner join = Joiner.on('&');
        return join.join(stringIter);
    }

    private static void addQueryParam(StringBuilder builder, Map.Entry<String, String> entry) {
        builder.append(entry.getKey());
        if(entry.getValue() != null) {
            builder.append('=');
            builder.append(entry.getValue());
        }
    }

    public static String buildPath(final String basePath, final String path) {
        //Make sure to have some guard statements for null.
        if(basePath == null && path == null) {
            return "";
        }

        if(basePath == null) {
            return path;
        }

        if(path == null) {
            return basePath;
        }

        final StringBuilder builder = new StringBuilder();
        if(!basePath.startsWith("/")) {
            builder.append('/');
        }
        builder.append(basePath);

        if(!(path.startsWith("/") || basePath.endsWith("/"))) {
            builder.append('/');
        }

        if(path.startsWith("/") && basePath.endsWith("/")) {
            builder.append(path.substring(1));
        }
        else{
            builder.append(path);
        }

        return builder.toString();
    }

    public static URL buildBucketPath(final String bucketName, final ConnectionDetails connectionDetails, final BulkCommand command) throws MalformedURLException {
        final Map<String, String> queryParams = new HashMap<String,String>();
        queryParams.put("operation", command.toString());
        return NetUtils.buildUrl(connectionDetails, bucketPath(bucketName), queryParams);
    }

    private static String bucketPath(final String bucket) {
        final StringBuilder builder = new StringBuilder();
        builder.append("/_rest_/buckets/").append(bucket);
        return builder.toString();
    }

    public static String buildHostField(final ConnectionDetails details) {
        return details.getEndpoint();
    }
}