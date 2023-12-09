package com.example.project_4.user.servlet;

import com.example.project_4.dao.AppointmentDAO;
import com.example.project_4.db.DBConnection;
import com.example.project_4.entity.Appointment;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/addAppointment")
public class AppointmentServlet extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	int userId	= Integer.parseInt(req.getParameter("userId"));
	String fullName = req.getParameter("fullName");
	String gender = req.getParameter("gender");
	String age = req.getParameter("age");
	String appointmentDate = req.getParameter("appointmentDate");
	String email = req.getParameter("email");
	String phone = req.getParameter("phone");
	String diseases = req.getParameter("diseases");
	int doctorId = Integer.parseInt(req.getParameter("doctorNameSelect"));
	String slot = req.getParameter("slot");
	String address = req.getParameter("address");
	
	
	Appointment appointment = new Appointment(userId, fullName, gender, age, appointmentDate, email, phone, diseases, doctorId,slot, address, "Pending");
	
	AppointmentDAO appointmentDAO = new AppointmentDAO(DBConnection.getConn());
	boolean f = appointmentDAO.addAppointment(appointment);
	
	//get session
	HttpSession session = req.getSession();
	
	if(f==true) {
		
		session.setAttribute("successMsg", "Appointment is recorded Successfully.");
		resp.sendRedirect("user_appointment.jsp");
		
		
	}
	else {
		
		session.setAttribute("errorMsg", "Something went wrong on server!");
		resp.sendRedirect("user_appointment.jsp");
		
	}
	
	
	
	
		
	}

	
}
