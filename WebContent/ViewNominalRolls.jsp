
<%@page import="com.dts.dae.model.Profile"%>
<%@page import="com.dts.core.util.CoreList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.dts.ManagePrison.model.NominalRoleMasterForm"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Bureaucrat Defended Entity</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../includes/style.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style8 {color: #FFFF00; font-weight: bold; }
-->
</style>
</head>

<body bgcolor="004B10" leftmargin="0" topmargin="0">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" valign="middle"><table width="780" border="0" cellspacing="0" cellpadding="0">
        <tr>

          <td height="71" valign="bottom" background="images/toplogo.jpg"><table width="100%" height="25" border="0" cellpadding="0" cellspacing="0">
              <tr> 
                <td><div align="right"> 
               
<span id="clock"></span>
                  </div></td>
              </tr>
            </table></td>
        </tr>
      </table>

      <table width="780" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td><img src="images/ib_banner2.jpg" width="780" height="101"></td>
        </tr><tr><td align=center width=1500><font color=white>
        <jsp:include page="EmployeeOptions.jsp"/></font></td></tr>
      </table> 
  
      <table bgcolor="white" width="780" border="0" cellspacing="0" cellpadding="0" background="images/body.jpg">
        <tr>
          <td height="314" align="center"><span class="style8">VIEW NOMINAL REGISTER </span><br>
          <table>
          <tr bgcolor="#0E5519"><td><div align="center" class="style8"><span class="style3">Role Date</span></div></td>
          <td><div align="center" class="style8"><span class="style3">Criminal Name</span></div></td>
          <td><div align="center" class="style8"><span class="style3">Employee Name</span></div></td>
          <td><div align="center" class="style8"><span class="style3">Cell No</span></div></td>
          </tr>
          <%
          CoreList acorelist=(CoreList)request.getAttribute("ViewNominalRolls");
          Enumeration aenumeration=acorelist.elements();
          while(aenumeration.hasMoreElements())
          {
          NominalRoleMasterForm aform=(NominalRoleMasterForm)aenumeration.nextElement();
            %>
          <tr bgcolor="#8DD79C"><td><div align="center"><strong><%=aform.getRoleDateTime() %></strong></div></td>
          <td><div align="center"><strong><%=aform.getCriminalname() %></strong></div></td>
          <td><div align="center"><strong><%=aform.getEmployeename() %></strong></div></td>
          <td><div align="center"><strong><%=aform.getCellno() %></strong></div></td></tr>
          <%} %></table>
          
          
   
  
         
         
                    
                    
                    
                    
                    
		   <table width="85%" border="0" align="center" cellpadding="2" cellspacing="0">

                    <tr> 
                      <td height="18" valign="top"><img src="../images/trans.gif" width="5" height="5"></td>
                    </tr>
                    <tr> 
                      <td height="18" valign="top">&nbsp;</td>
                    </tr>
      </table></td>
  </tr>
</table>
</body>
</html>

