package com.example;

import java.io.File;

public class RxJavaFiles {
    public static void findPng(final File[] folders){
        new Thread() {
            @Override
            public void run() {
                super.run();
                for (File folder : folders) {
                    File[] files = folder.listFiles();
                    for (File file : files) {
                        if (file.getName().endsWith(".png")) {
                            System.out.println(file.getAbsolutePath());
                        }
                    }
                }
            }
        }.start();
    }


    public static void main(String[] args){

    }
}
