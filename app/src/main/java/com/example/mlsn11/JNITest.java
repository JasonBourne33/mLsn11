package com.example.mlsn11;

public class JNITest {
    static {
        System.loadLibrary("jnilib");
    }

    public native String getString();
}
