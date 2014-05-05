/*
 * ******************************************************************************
 *   Copyright 2014 Spectra Logic Corporation. All Rights Reserved.
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

package com.spectralogic.ds3client.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import com.spectralogic.ds3client.helpers.Ds3ClientHelpers.ObjectPutter;


public class FileObjectPutter implements ObjectPutter {
    private final File root;

    public FileObjectPutter(final File root) {
        this.root = root;
    }

    @Override
    public InputStream getContent(final String key) throws IOException {
        return new FileInputStream(new File(this.root, key));
    }
}
