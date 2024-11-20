package com.hib.dao;

import java.util.ArrayList;

import com.hib.entity.StudentDemo;
import com.hib.entity.StudentDetails;

public interface HibernateDAO {

	void insertStudent(StudentDemo s);
	ArrayList<StudentDemo> fetchAll();
	StudentDemo fetchOne(int sid);
	void delete(int sid);
	void updateStudent(String email,int sid);
	void insertStudentDetails(StudentDetails sds);
}
