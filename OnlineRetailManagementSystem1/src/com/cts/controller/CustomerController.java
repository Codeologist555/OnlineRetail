package com.cts.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cts.bean.Customer;
import com.cts.service.CustomerService;

/**
 * Servlet implementation class CustomerController
 */
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String source = request.getParameter("source");
		CustomerService service = new CustomerService();
		if(source.equals("addCustomer")) {
			try {
				long cId = Long.valueOf(request.getParameter("cId"));
				String cName = request.getParameter("cName");
				String email = request.getParameter("email");
				String password = request.getParameter("password");
				String phoneNumber = request.getParameter("phoneNumber");
				String address = request.getParameter("address");
				Customer customer = new Customer(cId, cName, email, password, phoneNumber, address);
				if(service.addCustomer(customer)) request.setAttribute("errorMsg", "Customer Added Successfully");
				else request.setAttribute("errorMsg", "Invalid Input");
			}catch(Exception ex) {
				request.setAttribute("errorMsg", "Invalid Input");
			}
			request.getRequestDispatcher("index.jsp").forward(request, response);
		}
	}

}
