package com.example;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JacksonExample {
    public static void main(String[] args) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.enable(SerializationFeature.INDENT_OUTPUT);

        // **JSON String**
        String jsonString = """
                {
                "id": null,
                "name": "Shashidhar Reddy",
                "email": "shashi@example.com",
                "address": {
                    "street": "123 Aesthetic Lane",
                    "city": "Hyderabad",
                    "state": "Telangana",
                    "zipcode": "500001"
                },
                "phoneNumbers": [
                    {
                    "type": "home",
                    "number": "040-1234567"
                    },
                    {
                    "type": "mobile",
                    "number": "+91-9876543210"
                    }
                ],
                "skills": [null, "Spring Boot", "Angular", "GCP"],
                "projects": [
                    {
                    "title": "Airline Management System",
                    "role": "Backend Developer",
                    "technologies": ["Java", "JDBC", "JSP", "Servlets"]
                    },
                    {
                    "title": "Healthcare Management System",
                    "role": "Full Stack Developer",
                    "technologies": ["Spring Boot", "Angular", "MySQL"]
                    }
                ],
                "isCertified": true,
                "experienceYears": 3.5
                }

                """;

        // **Deserialization (JSON → Java Object)**
        User user = mapper.readValue(jsonString, User.class);
        System.out.println("Deserialized Object: " + user.getName());
        System.out.println("Skills: " + user.getSkills());

        // **Serialization (Java Object → JSON)**
        String serializedJson = mapper.writeValueAsString(user);
        System.out.println("\nSerialized JSON:\n" + serializedJson);
    }
}
