/*
 * Copyright (C) 2013 The MoKee OpenSource Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.mokee.hardware;

import java.io.File;

/**
 * Long Term Orbits (LTO) support.
 */
public class LongTermOrbits {

    /**
     * Whether device supports the LTO technology.
     *
     * @return boolean Supported devices must return always true.
     */
    public static boolean isSupported() { return false; }

    /**
     * Returns the source location of the LTO data.
     *
     * @return String The LTO source location.
     */
    public static String getSourceLocation() { return null; }

    /**
     * Returns the source location of the LTO data.
     *
     * @return File The LTO source location.
     */
    public static File getDestinationLocation() { return null; }

    /**
     * Returns the interval in milliseconds to trigger the LTO data download.<br/>
     * <br/>
     * As convenience, implementations should set the download interval to the half of the
     * validity of the downloaded data.
     *
     * @return long The download interval in milliseconds
     */
    public static long getDownloadInterval() { return 0; }

}
