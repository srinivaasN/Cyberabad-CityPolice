
<%@page import="com.dts.dae.dao.ProfileDAO"%><%
String loginname[]=request.getParameterValues("loginnames");
boolean flag=false;
for(int i=0;i<loginname.length;i++)
{
flag=new ProfileDAO().deleteEmployees(loginname[i]);
}

RequestDispatcher rd=request.getRequestDispatcher("viewEmployeeAction.do");
rd.forward(request,response);

%>