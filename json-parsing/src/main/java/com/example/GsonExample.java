package com.example;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class GsonExample {
    public static void main(String[] args) {
        Gson gson = new GsonBuilder().setPrettyPrinting().create();

        // JSON to Java Object (Deserialization)
        String jsonString = "{\r\n" + //
                        "  \"id\": 1,\r\n" + //
                        "  \"name\": \"Shashidhar Reddy\",\r\n" + //
                        "  \"email\": \"shashi@example.com\",\r\n" + //
                        "  \"address\": {\r\n" + //
                        "    \"street\": \"123 Aesthetic Lane\",\r\n" + //
                        "    \"city\": \"Hyderabad\",\r\n" + //
                        "    \"state\": \"Telangana\",\r\n" + //
                        "    \"zipcode\": \"500001\"\r\n" + //
                        "  },\r\n" + //
                        "  \"phoneNumbers\": [\r\n" + //
                        "    {\r\n" + //
                        "      \"type\": \"home\",\r\n" + //
                        "      \"number\": \"040-1234567\"\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"type\": \"mobile\",\r\n" + //
                        "      \"number\": \"+91-9876543210\"\r\n" + //
                        "    }\r\n" + //
                        "  ],\r\n" + //
                        "  \"skills\": [\"Java\", \"Spring Boot\", \"Angular\", \"GCP\"],\r\n" + //
                        "  \"projects\": [\r\n" + //
                        "    {\r\n" + //
                        "      \"title\": \"Airline Management System\",\r\n" + //
                        "      \"role\": \"Backend Developer\",\r\n" + //
                        "      \"technologies\": [\"Java\", \"JDBC\", \"JSP\", \"Servlets\"]\r\n" + //
                        "    },\r\n" + //
                        "    {\r\n" + //
                        "      \"title\": \"Healthcare Management System\",\r\n" + //
                        "      \"role\": \"Full Stack Developer\",\r\n" + //
                        "      \"technologies\": [\"Spring Boot\", \"Angular\", \"MySQL\"]\r\n" + //
                        "    }\r\n" + //
                        "  ],\r\n" + //
                        "  \"isCertified\": true,\r\n" + //
                        "  \"experienceYears\": 3.5\r\n" + //
                        "}\r\n" + //
                        "";
        User user = gson.fromJson(jsonString, User.class);
        System.out.println("Deserialized Object: " + user);

        // Java Object to JSON (Serialization)
        String outputJson = gson.toJson(user);
        System.out.println("Serialized JSON: " + outputJson);
    }
}
    
