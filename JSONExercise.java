package jsonexercise;

import java.util.Scanner;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONExercise {

	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter Student Name: ");
		
		String name = input.nextLine();
		
		System.out.println("Enter course name: ");
		
		String course1 = input.nextLine();
		
		System.out.println("Enter grade: ");
		
		int grade1 = input.nextInt();
		
		//create new JSON object
		JSONObject root = new JSONObject();
		
		//put the name name-value pair
		root.put("name", name);
		
		//create a JSON object and array and store a class object in it
		JSONObject courseObject1 = new JSONObject();
		courseObject1.put("grade", grade1);
		courseObject1.put("name", course1);
		
		JSONArray courses = new JSONArray();
		courses.add(courseObject1);
		
		//add array to root object
		root.put("courses", courses);
		
		System.out.println(root.toJSONString());
		
	}

}