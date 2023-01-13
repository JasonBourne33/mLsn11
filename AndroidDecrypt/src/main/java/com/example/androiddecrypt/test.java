package com.example.androiddecrypt;

public class test {

    static {
        System.loadLibrary("mlsn11");
    }

    public static void main(String[] args) {
        String s = stringFromJNI();
    }

    public static native String stringFromJNI();
}
