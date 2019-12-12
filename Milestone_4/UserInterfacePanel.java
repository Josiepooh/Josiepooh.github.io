package category_one;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UserInterfacePanel extends JPanel {
	static List<business> businesses = new ArrayList<>();
	public static Scanner scan = new Scanner(System.in);
	
	private JButton create, find, update, delete, exit;
	
	public UserInterfacePanel () {
		setLayout (new BoxLayout (this, BoxLayout.Y_AXIS));
		
		create = new JButton("Create a Business Record");
		create.addActionListener(new CreateListener());
		
		find = new JButton("Find a Business Record");
		find.addActionListener(new FindListener());
		
		update = new JButton("Update a Business Record");
		update.addActionListener(new UpdateListener());
		
		delete = new JButton("Delete a Business Record");
		delete.addActionListener(new DeleteListener());
		
		exit = new JButton("Exit Program");
		exit.addActionListener(new ExitListener());
		
		add(create);
		add(Box.createRigidArea(new Dimension (0, 20)));
		add(update);
		add(Box.createRigidArea(new Dimension (0, 20)));
		add(find);
		add(Box.createRigidArea(new Dimension (0, 20)));
		add(delete);
		add(Box.createRigidArea(new Dimension (0, 20)));
		add(exit);

		
		setBackground(Color.cyan);
		setPreferredSize(new Dimension(200,240));
	}
	
	private class CreateListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
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
			System.out.println();
		}
		}
	
	private class FindListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
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
						System.out.println();
					}
					i++;
				}
			}
			
			else if (in == 2) {
				System.out.println("Enter Certificate #");
				int cert = scan.nextInt();
				
				int i = 0;
				while (i < businesses.size()){
				
					business j = businesses.get(i);
					if (j.getCert() == cert) {
						j.findBusiness();
						System.out.println();
				}
				i++;
			}
			}
			
			else if (in == 3) {
				System.out.println("Enter Business Name");
				String name = scan.next();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (name.compareTo(j.getName()) == 0) {
						j.findBusiness();
						System.out.println();
				}
				i++;
			}
			}
			
			else if (in == 4) {
				System.out.println("Enter Date (mmddyy)");
				int date = scan.nextInt();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (j.getDate() == date) {
						j.findBusiness();
						System.out.println();
				}
				i++;	
			}
			}
			
			else if (in == 5) {
				System.out.println("Enter Result");
				String result = scan.next();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (result.compareTo(j.getResult()) == 0) {
						j.findBusiness();
						System.out.println();
				}
				i++;
			}
			}
			
			else if (in == 6) {
				System.out.println("Enter Sector");
				String sector = scan.next();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (sector.compareTo(j.getSector()) == 0) {
						j.findBusiness();
						System.out.println();
				}
				i++;
			}
			}
			
			else {
				System.out.println("invalid entry");
				System.out.println();		
			}
		}
	}
	
	private class UpdateListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
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
						System.out.println();
					}
					i++;
				}
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
						System.out.println();
				}
				i++;
			}
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
						System.out.println();
				}
				i++;
			}
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
						System.out.println();
				}
				i++;	
			}
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
						System.out.println();
				}
				i++;	
			}
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
						System.out.println();
				}
				i++;	
			}
			}
			
			else {
				System.out.println("invalid entry");
				System.out.println();
			}
		}
	}
	
	private class DeleteListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
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
						System.out.println("Entry Deleted");
						System.out.println();
					}
					i++;
				}

			}
			
			else if (in == 2) {
				System.out.println("Enter Certificate #");
				int cert = scan.nextInt();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (j.getCert() == cert) {
						businesses.remove(i);
						System.out.println("Entry Deleted");
						System.out.println();
				}
				i++;
			}

			}
			
			else if (in == 3) {
				System.out.println("Enter Business Name");
				String name = scan.next();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (name.compareTo(j.getName()) == 0) {
						businesses.remove(i);
						System.out.println("Entry Deleted");
						System.out.println();
				}
				i++;
			}
			}
			
			else if (in == 4) {
				System.out.println("Enter Date (mmddyy)");
				int date = scan.nextInt();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (j.getDate() == date) {
						businesses.remove(i);
						System.out.println("Entry Deleted");
						System.out.println();
				}
				i++;
				}
			}
			
			else if (in == 5) {
				System.out.println("Enter Result");
				String result = scan.next();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (result.compareTo(j.getResult()) == 0) {
						businesses.remove(i);
						System.out.println("Entry Deleted");
						System.out.println();
				}
				i++;
			}
			}
			
			else if (in == 6) {
				System.out.println("Enter Sector");
				String sector = scan.next();
				
				int i = 0;
				while (i < businesses.size()){
					
					business j = businesses.get(i);
					if (sector.compareTo(j.getSector()) == 0) {
						businesses.remove(i);
						System.out.println("Entry Deleted");
						System.out.println();
				}
				i++;
			}
			}
			
			else {
				System.out.println("invalid entry");
				System.out.println();
			}
		}
	}
	
	private class ExitListener implements ActionListener {
		public void actionPerformed(ActionEvent event) {
			System.exit(0);
		}
	}
}
