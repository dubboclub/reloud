/**
 *Copyright [2009-2010] [dennis zhuang(killme2008@gmail.com)]
 *Licensed under the Apache License, Version 2.0 (the "License");
 *you may not use this file except in compliance with the License.
 *You may obtain a copy of the License at
 *             http://www.apache.org/licenses/LICENSE-2.0
 *Unless required by applicable law or agreed to in writing,
 *software distributed under the License is distributed on an "AS IS" BASIS,
 *WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 *either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package net.dubboclub.reloud.util;

import java.io.UnsupportedEncodingException;

/**
 * Utilities for byte process
 * 
 * @author dennis
 * 
 */
class ByteUtils {
	public static final byte[] getBytes(String k) {
        if (k == null || k.length() == 0) {
            throw new IllegalArgumentException("Key must not be blank");
        }
        try {
            return k.getBytes("utf-8");
        }
        catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }
}
