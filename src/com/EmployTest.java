package com;

import java.util.HashMap;

public class EmployTest {
	public static void main(String[] args) {
	    //Create properties
	    HashMap<String, Object> properties = new HashMap<>();

	    //Add name and age
	    properties.put("name", "John Doe");
	    properties.put("age", 25);

	    //Create person
	    MyObject person = new MyObject(properties);

	    //Get properties
	    System.out.println(person.getProperty("age")); //Result: 25
	    System.out.println(person.getProperty("name")); //Result: John Doe
	}
}
class MyObject {
    private HashMap<String, Object> properties;

    //Create object with properties
    public MyObject(HashMap<String, Object> properties) {
        this.properties = properties;
    }   

    //Get properties
    public Object getProperty(String key) {
        return this.properties.get(key);
    }
}