package category_one;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class application {
	 
	static List<business> businesses = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	 
	public static void main(String[] args) {
		
		menu();
	}

	public static void create() {

		System.out.println("Enter ID");
		int id = scan.nextInt();
		System.out.println("Enter Certificate Number");
		int cert = scan.nextInt();
		System.out.println("Enter Business Name");
		String name = scan.next();
		System.out.println("Enter Date: mmddyy");
		int date = scan.nextInt();
		System.out.println("Enter Result");
		String result = scan.next();
		System.out.println("Enter Sector");
		String sector = scan.next();
		
		
		business busName = new business(id, cert, name, date, result, sector);
		businesses.add(busName);
	
		busName.findBusiness();
		menu();
	}
	
	public static  void read() {
		
		System.out.println("Enter 1: Search by ID");
		System.out.println("Enter 2: Search by Certificate #");
		System.out.println("Enter 3: Search by Business Name");
		System.out.println("Enter 4: Search by Date");
		System.out.println("Enter 5: Search by Result");
		System.out.println("Enter 6: Search by Sector");
		int in = scan.nextInt();
		
		if (in == 1) {
			System.out.println("Enter ID");
			int id = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getID() == id) {
					j.findBusiness();
				}
				i++;
			}
			menu();
		}
		
		else if (in == 2) {
			System.out.println("Enter Certificate #");
			int cert = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
			
				business j = businesses.get(i);
				if (j.getCert() == cert) {
					j.findBusiness();
			}
			i++;
		}
			menu();
		}
		
		else if (in == 3) {
			System.out.println("Enter Business Name");
			String name = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (name.compareTo(j.getName()) == 0) {
					j.findBusiness();
			}
			i++;
		}
			menu();
		}
		
		else if (in == 4) {
			System.out.println("Enter Date (mmddyy)");
			int date = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getDate() == date) {
					j.findBusiness();
			}
			i++;	
		}
			menu();
		}
		
		else if (in == 5) {
			System.out.println("Enter Result");
			String result = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (result.compareTo(j.getResult()) == 0) {
					j.findBusiness();
			}
			i++;
		}
			menu();
		}
		
		else if (in == 6) {
			System.out.println("Enter Sector");
			String sector = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (sector.compareTo(j.getSector()) == 0) {
					j.findBusiness();
			}
			i++;
		}
			menu();
		}
		
		else {
			System.out.println("invalid entry");
			read();
		}
		
	}
	
	public static void update() {
		System.out.println("Enter 1: Update by ID");
		System.out.println("Enter 2: Update by Certificate #");
		System.out.println("Enter 3: Update by Business Name");
		System.out.println("Enter 4: Update by Date");
		System.out.println("Enter 5: Update by Result");
		System.out.println("Enter 6: Update by Sector");
		int in = scan.nextInt();
		
		if (in == 1) {
			System.out.println("Enter Old ID");
			int id = scan.nextInt();
			System.out.println("Enter New ID");
			int newId = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getID() == id) {
					j.setID(newId);
				}
				i++;
			}
			menu();
		}
		
		else if (in == 2) {
			System.out.println("Enter Certificate #");
			int cert = scan.nextInt();
			System.out.println("Enter New Certificate #");
			int newCert = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getCert() == cert) {
					j.setCert(newCert);
			}
			i++;
		}
			menu();
		}
		
		else if (in == 3) {
			System.out.println("Enter Business Name");
			String name = scan.next();
			System.out.println("Enter New Business Name");
			String newName = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (name.compareTo(j.getName()) == 0) {
					j.setName(newName);
			}
			i++;
		}
			menu();
		}
		
		else if (in == 4) {
			System.out.println("Enter Date (mmddyy)");
			int date = scan.nextInt();
			System.out.println("Enter New Date (mmddyy)");
			int newDate = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getDate() == date) {
					j.setDate(newDate);
			}
			i++;	
		}
			menu();
		}
		
		else if (in == 5) {
			System.out.println("Enter Result");
			String result = scan.next();
			System.out.println("Enter New Result");
			String newResult = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (result.compareTo(j.getResult()) == 0) {
					j.setResult(newResult);
			}
			i++;	
		}
			menu();
		}
		
		else if (in == 6) {
			System.out.println("Enter Sector");
			String sector = scan.next();
			System.out.println("Enter New Sector");
			String newSector = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (sector.compareTo(j.getSector()) == 0) {
					j.setSector(newSector);
			}
			i++;	
		}
			menu();
		}
		
		else {
			System.out.println("invalid entry");
			update();
		}
		
	}
	
	public static void delete() {
		System.out.println("Enter 1: Search by ID");
		System.out.println("Enter 2: Search by Certificate #");
		System.out.println("Enter 3: Search by Business Name");
		System.out.println("Enter 4: Search by Date");
		System.out.println("Enter 5: Search by Result");
		System.out.println("Enter 6: Search by Sector");
		int in = scan.nextInt();
		
		if (in == 1) {
			System.out.println("Enter ID");
			int id = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getID() == id) {
					businesses.remove(i);
				}
				i++;
			}
			menu();
		}
		
		else if (in == 2) {
			System.out.println("Enter Certificate #");
			int cert = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getCert() == cert) {
					businesses.remove(i);
			}
			i++;
		}
			menu();
		}
		
		else if (in == 3) {
			System.out.println("Enter Business Name");
			String name = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (name.compareTo(j.getName()) == 0) {
					businesses.remove(i);
			}
			i++;
		}
			menu();
		}
		
		else if (in == 4) {
			System.out.println("Enter Date (mmddyy)");
			int date = scan.nextInt();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (j.getDate() == date) {
					businesses.remove(i);
			}
			i++;
		}
			menu();
		}
		
		else if (in == 5) {
			System.out.println("Enter Result");
			String result = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (result.compareTo(j.getResult()) == 0) {
					businesses.remove(i);
			}
			i++;
		}
			menu();
		}
		
		else if (in == 6) {
			System.out.println("Enter Sector");
			String sector = scan.next();
			
			int i = 0;
			while (i < businesses.size()){
				
				business j = businesses.get(i);
				if (sector.compareTo(j.getSector()) == 0) {
					businesses.remove(i);
			}
			i++;
		}
			menu();
		}
		
		else {
			System.out.println("invalid entry");
			delete();
		}
	}
		
	
	
	public static void menu() {
		System.out.println("Enter 1: Create a Business Record");
		System.out.println("Enter 2: Find a Business Record");
		System.out.println("Enter 3: Update a Business Record");
		System.out.println("Enter 4: Delete a Business");
		System.out.println("Enter 5: Exit");
		
		int input = scan.nextInt();
		
		if (input == 1) {
			create();
		}
		
		else if (input == 2) {
			read();
		}
		
		else if (input == 3) {
			update();
		}
		
		else if (input == 4) {
			delete();
		}
		
		else if (input == 5) {
			System.exit(0);
		}
		
		else {
			System.out.println("invalid entry");
			menu();
		}
	}
}