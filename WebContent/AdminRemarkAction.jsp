
<%@page import="com.dts.ManagePrison.dao.EmployeesDutyDetailsDao"%>
<%@page import="com.dts.ManagePrison.model.EmployeDutyDetailsForm"%>
<%
	int employeeregisterid = Integer.parseInt(request
			.getParameter("employeeregisterid"));
	String employeename = request.getParameter("employeename");
	String remarks = request.getParameter("remarks");
	EmployeDutyDetailsForm aform = new EmployeDutyDetailsForm();
	aform.setEmployeDutyId(employeeregisterid);
	aform.setEmployeename(employeename);
	aform.setRemarks(remarks);
	EmployeesDutyDetailsDao adao = new EmployeesDutyDetailsDao();
	boolean flag = adao.insertEmployeeDutyDetails(aform);
	System.out.println("this is flage" + flag);

	RequestDispatcher rd = request
			.getRequestDispatcher("Success.jsp?status=Remarks Registerd Successfully");
	rd.forward(request, response);
%>
