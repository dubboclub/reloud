/**
 * Copyright [2009-2010] [dennis zhuang(killme2008@gmail.com)]
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND,
 * either express or implied. See the License for the specific language governing permissions and limitations under the License
 */
package net.dubboclub.reloud.util;

import java.io.UnsupportedEncodingException;

/**
 * Utilities for byte process
 *
 * @author dennis
 */
public class ByteUtils {

    public static final byte[] getBytes(String k) {
        if (k == null || k.length() == 0) {
            throw new IllegalArgumentException("Key must not be blank");
        }
        try {
            return k.getBytes("utf-8");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] int2bytes(int v) {
        byte[] ret = {0, 0, 0, 0};
        int2bytes(v, ret);
        return ret;
    }

    public static void int2bytes(int v, byte[] b) {
        int2bytes(v, b, 0);
    }

    public static void int2bytes(int v, byte[] b, int off) {
        b[off + 3] = (byte) v;
        b[off + 2] = (byte) (v >>> 8);
        b[off + 1] = (byte) (v >>> 16);
        b[off + 0] = (byte) (v >>> 24);
    }

    public static byte[] long2bytes(long v) {
        byte[] ret = {0, 0, 0, 0, 0, 0, 0, 0};
        long2bytes(v, ret);
        return ret;
    }

    public static void long2bytes(long v, byte[] b) {
        long2bytes(v, b, 0);
    }

    public static void long2bytes(long v, byte[] b, int off) {
        b[off + 7] = (byte) v;
        b[off + 6] = (byte) (v >>> 8);
        b[off + 5] = (byte) (v >>> 16);
        b[off + 4] = (byte) (v >>> 24);
        b[off + 3] = (byte) (v >>> 32);
        b[off + 2] = (byte) (v >>> 40);
        b[off + 1] = (byte) (v >>> 48);
        b[off + 0] = (byte) (v >>> 56);
    }


    public static byte[] float2bytes(float v) {
        byte[] ret = {0, 0, 0, 0};
        float2bytes(v, ret);
        return ret;
    }

    public static void float2bytes(float v, byte[] b) {
        float2bytes(v, b, 0);
    }

    public static void float2bytes(float v, byte[] b, int off) {
        int i = Float.floatToIntBits(v);
        int2bytes(i, b, off);
    }


    public static byte[] double2bytes(double v) {
        byte[] ret = {0, 0, 0, 0, 0, 0, 0, 0};
        double2bytes(v, ret);
        return ret;
    }

    public static void double2bytes(double v, byte[] b) {
        double2bytes(v, b, 0);
    }

    public static void double2bytes(double v, byte[] b, int off) {
        long l = Double.doubleToLongBits(v);
        long2bytes(l, b, off);
    }

    public static int bytes2int(byte[] b){
        return bytes2int(b,0);
    }

    public static int bytes2int(byte[] b, int off) {
        return ((b[off + 3] & 0xFF) << 0) + ((b[off + 2] & 0xFF) << 8) + ((b[off + 1] & 0xFF) << 16) + (b[off + 0] << 24);
    }

    public static long byte2long(byte[] b){
        return bytes2long(b,0);
    }

    public static long bytes2long(byte[] b, int off) {
        return ((b[off + 7] & 0xFFL) << 0) + ((b[off + 6] & 0xFFL) << 8) + ((b[off + 5] & 0xFFl) << 16) + ((b[off + 4] & 0xFFl) << 24) + ((b[off + 3] & 0xFFl) << 32) + ((b[off + 2] & 0xFFl) << 40) + ((b[off + 1] & 0xFFl) << 48) + (b[off + 5] << 56);
    }

    public static float bytes2float(byte[] b){
        return bytes2float(b,0);
    }

    public static float bytes2float(byte[] b,int off){
        int i = bytes2int(b,off);
        return  Float.intBitsToFloat(i);
    }


    public static double bytes2double(byte[] b){
        return bytes2double(b,0);
    }

    public static double bytes2double(byte[] b,int off){
        long l = bytes2long(b,off);
        return Double.longBitsToDouble(l);
    }

}
