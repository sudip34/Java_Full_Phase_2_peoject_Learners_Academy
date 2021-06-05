package com.LearnersAcademy;

import java.io.IOException;

import java.io.PrintWriter;
import java.util.List;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;




@WebServlet("/ClassReport")
public class ClassReport extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		try {
			SessionFactory factory = HibernateUtil.getSessionFactory();

			Session session = factory.openSession();

			List<StudentClass> list = session.createQuery("from StudentClass").list();
//			List<Teachers> teachersList=session.createQuery("from Teachers").list();
//			List<Student> studentList=session.createQuery("from Student").list();
			PrintWriter out = response.getWriter();
			out.println("<html><body>");
			out.println("<b>Class Report of Learners Academy</b><br>");

			for (StudentClass p : list) {
				out.println("ID: " + String.valueOf(p.getID()) + ",Class Name: " + p.getName()  );
				List<Subjects> subjects = p.getSubjects();
				out.println("\t Student: ");
				List<Student> studentList=p.getStudent();
				for (Student c : studentList) {
					out.print(c.getName() );
				}
				out.println(", Subjects : ");
				for (Subjects o : subjects) {
					out.print(o.getSubjects() + "&nbsp;");
					out.print("teacher:"+o.getTeachers() + "&nbsp;");

						out.println("<hr>");
				}
		
				out.println("<hr>");
			}
			session.close();

		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
