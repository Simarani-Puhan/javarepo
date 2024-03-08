package com.inter.basics;

public class FileDetails {
    public static void main(String[] args) {
        ICompressor iCompressor=new ZipCompressor();
        String[] zip=iCompressor.compressFiles("file1.doc","image.jpeg");
    }
}
