package com.example;
import org.json.JSONObject;
import java.nio.file.Files;
import java.nio.file.Paths;

public class ReadJSONFromFile {
    public static void main(String[] args) throws Exception {
        // Path to the JSON file
        String filePath = "C:\\VS-WORKSPACE\\json-parsing\\src\\main\\java\\com\\example\\data.json";

        // Read the file content as a string
        String content = new String(Files.readAllBytes(Paths.get(filePath)));

        // Convert content into a JSONObject
        JSONObject jsonObject = new JSONObject(content);

        // Print extracted values
        System.out.println("User Name: " + jsonObject.getString("name"));
        System.out.println("User Email: " + jsonObject.getString("email"));
    }
}
