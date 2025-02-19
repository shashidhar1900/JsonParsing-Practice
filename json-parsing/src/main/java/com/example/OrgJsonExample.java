package com.example;
import org.json.JSONArray;
import org.json.JSONObject;


public class OrgJsonExample {
    public static void main(String[] args) {
        // JSON String
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
        // Deserialize JSON to Java object
        JSONObject jsonObject = new JSONObject(jsonString);
        JSONObject addressJson = jsonObject.getJSONObject("address");

        Integer id = jsonObject.optInt("id",0);
        System.out.println("id is:"+id);

        System.out.println(jsonObject.getJSONArray("skills").get(0));

        Address address = new Address();
        address.setCity(addressJson.getString("city"));
        address.setState(addressJson.getString("state"));

        User user = new User();
        user.setId(jsonObject.optInt("id",0));
        user.setName(jsonObject.getString("name"));
        user.setEmail(jsonObject.getString("email"));
        user.setAddress(address);

        System.out.println("Deserialized Object: " + user);

        // Serialize Java object to JSON
        JSONObject outputJson = new JSONObject();
        outputJson.put("id", user.getId());
        outputJson.put("name", user.getName());
        outputJson.put("email", user.getEmail());

        JSONObject addressOut = new JSONObject();
        addressOut.put("city", user.getAddress().getCity());
        addressOut.put("state", user.getAddress().getState());

        outputJson.put("address", addressOut);
        System.out.println("Serialized JSON: " + outputJson.toString(4));

        JSONArray phnNum = jsonObject.getJSONArray("phoneNumbers");
        System.out.println(phnNum.length()==0?"Empty Array":"Not Empty");

        JSONArray projects = jsonObject.getJSONArray("projects");

        for(int i=0; i<projects.length(); i++) {
            JSONObject project = projects.getJSONObject(i);
            System.out.println(project.getString("title"));
        }
    }
}
