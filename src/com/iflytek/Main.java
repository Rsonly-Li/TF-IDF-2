package com.iflytek;

import java.io.IOException;
import java.util.HashMap;

public class Main {

    public static void main(String[] args) throws IOException{
	// write your code here
        String file = "D:/TF-IDF-test";

        HashMap<String,HashMap<String, Float>> all_tf = ReadFiles.tfAllFiles(file);
        System.out.println();
        HashMap<String, Float> idfs = ReadFiles.idf(all_tf);
        System.out.println();
        ReadFiles.tf_idf(all_tf, idfs);
    }
}
