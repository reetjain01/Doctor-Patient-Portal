package com.example.project_4.admin.servlet;

import com.example.project_4.dao.DoctorDAO;
import com.example.project_4.db.DBConnection;
import com.example.project_4.entity.Doctor;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;

@WebServlet("/addDoctor")
public class DoctorServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		try {
			
			//get all data which is coming from doctor.jsp doctor details
			String fullNameDoc = req.getParameter("fullNameDoc");
			String dateOfBirth = req.getParameter("dateOfBirth");
			String qualification = req.getParameter("qualification");
			String specialist = req.getParameter("specialist");
			String email = req.getParameter("email");
			String phone = req.getParameter("phone");
			String password = req.getParameter("password");
			
			
			Doctor doctor = new Doctor(fullNameDoc, dateOfBirth, qualification, specialist, email, phone, password);
			
			DoctorDAO docDAO = new DoctorDAO(DBConnection.getConn());
			
			boolean f = docDAO.registerDoctor(doctor);

			HttpSession session = req.getSession();
			
			if(f == true) {
				session.setAttribute("successMsg", "Doctor added Successfully");
				resp.sendRedirect("admin/doctor.jsp");
				
			}
			else {
				session.setAttribute("errorMsg", "Something went wrong on server!");
				resp.sendRedirect("admin/doctor.jsp");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	
}
