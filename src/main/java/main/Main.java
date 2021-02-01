package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("/media/gurovich/CCCOMA_X64FRE_RU-RU_DV9/test1");
            int result;
            List<Character> integers = new ArrayList<>();
            while ((result = in.read()) != -1){
                integers.add((char) result);
            }
            System.out.println(integers);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
