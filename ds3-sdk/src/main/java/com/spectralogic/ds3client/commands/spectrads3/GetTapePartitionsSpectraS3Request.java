/*
 * ******************************************************************************
 *   Copyright 2014-2015 Spectra Logic Corporation. All Rights Reserved.
 *   Licensed under the Apache License, Version 2.0 (the "License"). You may not use
 *   this file except in compliance with the License. A copy of the License is located at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   or in the "license" file accompanying this file.
 *   This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 *   CONDITIONS OF ANY KIND, either express or implied. See the License for the
 *   specific language governing permissions and limitations under the License.
 * ****************************************************************************
 */

// This code is auto-generated, do not modify
package com.spectralogic.ds3client.commands.spectrads3;

import com.spectralogic.ds3client.commands.AbstractRequest;
import com.spectralogic.ds3client.HttpVerb;
import com.spectralogic.ds3client.models.ImportExportConfiguration;
import java.util.UUID;
import java.lang.String;
import com.spectralogic.ds3client.models.Quiesced;
import com.spectralogic.ds3client.models.TapePartitionState;

public class GetTapePartitionsSpectraS3Request extends AbstractRequest {

    // Variables
    
    private boolean fullDetails;
    private ImportExportConfiguration importExportConfiguration;
    private boolean lastPage;
    private UUID libraryId;
    private String name;
    private int pageLength;
    private int pageOffset;
    private UUID pageStartMarker;
    private Quiesced quiesced;
    private String serialNumber;
    private TapePartitionState state;

    // Constructor
    public GetTapePartitionsSpectraS3Request() {
        
    }
    public GetTapePartitionsSpectraS3Request withFullDetails(final boolean fullDetails) {
        this.fullDetails = fullDetails;
        if (this.fullDetails) {
            this.getQueryParams().put("full_details", null);
        } else {
            this.getQueryParams().remove("full_details");
        }
        return this;
    }

    public GetTapePartitionsSpectraS3Request withImportExportConfiguration(final ImportExportConfiguration importExportConfiguration) {
        this.importExportConfiguration = importExportConfiguration;
        this.updateQueryParam("import_export_configuration", importExportConfiguration.toString());
        return this;
    }

    public GetTapePartitionsSpectraS3Request withLastPage(final boolean lastPage) {
        this.lastPage = lastPage;
        if (this.lastPage) {
            this.getQueryParams().put("last_page", null);
        } else {
            this.getQueryParams().remove("last_page");
        }
        return this;
    }

    public GetTapePartitionsSpectraS3Request withLibraryId(final UUID libraryId) {
        this.libraryId = libraryId;
        this.updateQueryParam("library_id", libraryId.toString());
        return this;
    }

    public GetTapePartitionsSpectraS3Request withName(final String name) {
        this.name = name;
        this.updateQueryParam("name", name);
        return this;
    }

    public GetTapePartitionsSpectraS3Request withPageLength(final int pageLength) {
        this.pageLength = pageLength;
        this.updateQueryParam("page_length", Integer.toString(pageLength));
        return this;
    }

    public GetTapePartitionsSpectraS3Request withPageOffset(final int pageOffset) {
        this.pageOffset = pageOffset;
        this.updateQueryParam("page_offset", Integer.toString(pageOffset));
        return this;
    }

    public GetTapePartitionsSpectraS3Request withPageStartMarker(final UUID pageStartMarker) {
        this.pageStartMarker = pageStartMarker;
        this.updateQueryParam("page_start_marker", pageStartMarker.toString());
        return this;
    }

    public GetTapePartitionsSpectraS3Request withQuiesced(final Quiesced quiesced) {
        this.quiesced = quiesced;
        this.updateQueryParam("quiesced", quiesced.toString());
        return this;
    }

    public GetTapePartitionsSpectraS3Request withSerialNumber(final String serialNumber) {
        this.serialNumber = serialNumber;
        this.updateQueryParam("serial_number", serialNumber);
        return this;
    }

    public GetTapePartitionsSpectraS3Request withState(final TapePartitionState state) {
        this.state = state;
        this.updateQueryParam("state", state.toString());
        return this;
    }


    @Override
    public HttpVerb getVerb() {
        return HttpVerb.GET;
    }

    @Override
    public String getPath() {
        return "/_rest_/tape_partition/";
    }
    
    public boolean getFullDetails() {
        return this.fullDetails;
    }

    public ImportExportConfiguration getImportExportConfiguration() {
        return this.importExportConfiguration;
    }

    public boolean getLastPage() {
        return this.lastPage;
    }

    public UUID getLibraryId() {
        return this.libraryId;
    }

    public String getName() {
        return this.name;
    }

    public int getPageLength() {
        return this.pageLength;
    }

    public int getPageOffset() {
        return this.pageOffset;
    }

    public UUID getPageStartMarker() {
        return this.pageStartMarker;
    }

    public Quiesced getQuiesced() {
        return this.quiesced;
    }

    public String getSerialNumber() {
        return this.serialNumber;
    }

    public TapePartitionState getState() {
        return this.state;
    }

}