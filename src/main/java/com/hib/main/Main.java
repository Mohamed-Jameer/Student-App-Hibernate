package com.hib.main;

import java.util.ArrayList;
import java.util.List;

import com.hib.daoImpl.HibernateDAOImpl;
import com.hib.entity.Project;
import com.hib.entity.StudentDemo;
import com.hib.entity.StudentDetails;
import com.hib.entity.Subject;

public class Main {

	public static void main(String[] args) {
		
		HibernateDAOImpl hDAOI = new HibernateDAOImpl();
	 
		// One To One Mapping
		
	      	//  Uni Direaction 
		
//		 StudentDemo std = new StudentDemo("Sachin","Sachin10@gmail.com","BTM",1077);
//		 StudentDetails sds= new StudentDetails("1234","Mumbai","Maharastra");
//       std.setStudentDetails(sds);
		// hDAOI.insertStudent(std);
		// Error - > hDAOI.insertStudentDetails(sds);
		
		
//		ArrayList<StudentDemo> sList = hDAOI.fetchAll();
//		Iterator itr = sList.iterator();
//		while(itr.hasNext()) {
//			
//			 StudentDemo s = (StudentDemo)itr.next();
//			 
//			 System.out.println(s);
			 
//	Error ->		 System.out.println("Id : "+s.getSid());
//			 System.out.println("Name : "+s.getSname());
//			 System.out.println("Email : "+s.getEmail());
//			 System.out.println("Address : "+s.getAddress());
//			 System.out.println("PinCode : "+s.getPincode());
//			 
//			 StudentDetails sd = s.getStudentDetails();
//			 System.out.println("SDId :"+sd.getSid());
//			 System.out.println("Mobile :"+sd.getMobile());
//			 System.out.println("City: "+sd.getCity());
//			 System.out.println("State: "+sd.getState());
	 
//		}
		
		// Update One To One 
		
	//	hDAOI.updateStudentDetails("sachin@yahoo.com", "Pune", 102);
		
	         //  BI Direaction 
		
//			 StudentDemo std = new StudentDemo("Virat","Virat18@gmail.com","MG Road",1018);
//			 StudentDetails sds= new StudentDetails("1234","Delhi","Delhi");
//			 std.setStudentDetails(sds);
//			 sds.setStudent(std);			 
//			 hDAOI.insertStudentDetails(sds);  
			
				
//			System.out.println("Data Inserted");
		
		
//-------------- x-------------------- x ---------------------- //
		
               // One To Many  and Many To One
//		
//		Subject sb1 = new Subject("Html",10);
//		Subject sb2 = new Subject("Css",20);
//		Subject sb3 = new Subject("JavaScript",30);
//		Subject sb4 = new Subject("Hibrenate",40);
//		Subject sb5 = new Subject("Spring",50);
//		
//		List set1 = new ArrayList();
//		set1.add(sb1);
//		set1.add(sb2);
//		set1.add(sb3);
//		
//		
//		
//		List set2 = new ArrayList();
//		set2.add(sb3);
//		set2.add(sb4);
//		set2.add(sb5);
//		
//		 StudentDemo std = new StudentDemo("KL","KL@gmail.com","Road",23);
//		 StudentDetails sds= new StudentDetails("8765","Hy","Hydrabed");
//		 std.setStudentDetails(sds);	
//		 sds.setStudent(std);
//		 
//		 // One To Many
//		 std.setSubject(set1);
//		 
//		 //Many To One
//		 sb1.setStudent(std);
//		 sb2.setStudent(std);
//		 sb3.setStudent(std);
		 
//		 StudentDemo std1 = new StudentDemo("Akhil","Akhil11@gmail.com","Skil Bord Road",3456);
//		 StudentDetails sds1 = new StudentDetails("7890","Bengalore","Karnataka");
//		 std1.setStudentDetails(sds1);		
//		 sds1.setStudent(std1);
//		 
//		 // One To Many
//		 std1.setSubject(set2);
//		 
//		 //Many To One
//		 sb3.setStudent(std1);
//		 sb4.setStudent(std1);
//		 sb5.setStudent(std1);
		 
  //		 hDAOI.insertStudent(std1);
//  		 hDAOI.insertStudent(std);
//		 
//		 System.out.println("Success");
//-------------- x-------------------- x ---------------------- //
	
		       // Many To Many
		
//		Subject sb1 = new Subject("Maths",10);
//		Subject sb2 = new Subject("Science",20);
//		Subject sb3 = new Subject("Social",30);
//		Subject sb4 = new Subject("Logic Building",40);
//		Subject sb5 = new Subject("Spring",50);
//		
//		Project p1 = new Project("LMS",30,80);
//		Project p2 = new Project("Front End",40,70);
//		Project p3 = new Project("Drive Protal",50,60);
//		
//		List<Project> plist = new ArrayList<>();
//		plist.add(p1);
//		plist.add(p2);
//		
//		List<Project> plist1 = new ArrayList<>();
//		plist.add(p2);
//		plist.add(p3);
//		
//		
//		List set1 = new ArrayList();
//		set1.add(sb1);
//		set1.add(sb2);
//		set1.add(sb3);
		
//		
//		
//		List set2 = new ArrayList();
//		set2.add(sb3);
//		set2.add(sb4);
//		set2.add(sb5);
		
//		 StudentDemo std = new StudentDemo("Gathum","Gathum@gmail.com","MGRoad",24);
//		 StudentDetails sds= new StudentDetails("8765","Bengaluru","Karnataka");
//		 std.setStudentDetails(sds);	
//		 sds.setStudent(std);
	 
		 // One To Many
//		 std.setSubject(set1);
//		 
//		 //Many To One
//		 sb1.setStudent(std);
//		 sb2.setStudent(std);
//		 sb3.setStudent(std);
		 
		 //Many To Many
//		 std.setProjectList(plist);
//		 
//		 StudentDemo std1 = new StudentDemo("Dube","Dubel11@gmail.com","MG Road",2356);
//		 StudentDetails sds1 = new StudentDetails("7890","Bengalore","Karnataka");
//		 std1.setStudentDetails(sds1);		
//		 sds1.setStudent(std1);
//		 
		 // One To Many
//		 std1.setSubject(set2);
		 
		 //Many To One
//		 sb3.setStudent(std1);
//		 sb4.setStudent(std1);
//		 sb5.setStudent(std1);
		 
		 //Many To Many
//		 std1.setProjectList(plist1);
//		
//		 hDAOI.insertStudent(std);
//		 System.out.println("Succes 1");
//		 hDAOI.insertStudent(std1);
//		 System.out.println("Succes 2");
		
		 StudentDemo s = hDAOI.fetchOne(452);
		 System.out.println(s);
		 
		 
		 System.out.println(s.getStudentDetails());
		 
		 
		 for(Subject subs : s.getSubject()) {
			 System.out.println(subs);
		 }
		 
		 
		 for(Project p : s.getProjectList()) {
			 System.out.println(p.getPname());
		 }
//-------------- x-------------------- x ---------------------- //
		    //CRUD Operation
	
		 // Insert 
		// hDAOI.insertStudent(std);
		 
		 //Fetch All
//		 ArrayList<StudentDemo> sList = hDAOI.fetchAll();
//		 for(StudentDemo s : sList ) {
//			 System.out.println(s);
//		 }
		 
		 
		 //FetchOne
	//	StudentDemo student = hDAOI.fetchOne(1);
	//	System.out.println(hDAOI.fetchOne(1));
		 
		 //Delete
		// hDAOI.delete(52);
		 
		// Update
		// hDAOI.updateStudent("mohamedjameer2003@gmail.com",2);
		 
		
		
	}

}
