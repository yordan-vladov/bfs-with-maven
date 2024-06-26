package com.example;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class HashMapUtils {

    public static void saveHashMapToFile(HashMap<?, ?> map, String filename) {
        JSONObject json = new JSONObject(map);
        saveToFile(filename, json.toString()); // 4 is the number of spaces to indent
    }

    public static HashMap<String, Integer> extractDistanceHashMapFromFile(String filename) {
        HashMap<String, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            JSONObject json = new JSONObject(sb.toString());
            for (String key : json.keySet()) {
                map.put(key, json.getInt(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    public static HashMap<Pair, Integer> extractDistancePairHashMapFromFile(String filename) {
        HashMap<Pair, Integer> map = new HashMap<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            StringBuilder sb = new StringBuilder();
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            JSONObject json = new JSONObject(sb.toString());
            for (String key : json.keySet()) {
                String[] products = key.split(",");
                map.put(new Pair(products[0], products[1]), json.getInt(key));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return map;
    }

    private static void saveToFile(String filename, String content) {
        try (FileWriter fileWriter = new FileWriter(filename)) {
            fileWriter.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
