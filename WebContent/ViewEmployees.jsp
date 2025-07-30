<%@page import="com.dts.core.util.CoreList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.dts.dae.model.Profile"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Bureaucrat Defended Entity</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../includes/style.css" rel="stylesheet" type="text/css">
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
        </tr><tr><td align=center width=1500><font color=white><jsp:include page="Adminoptions.jsp"/></font></td></tr>
      </table> 
  
      <table bgcolor="white" width="780" border="0" cellspacing="0" cellpadding="0" background="images/body.jpg">
        <tr>
          <td height="314" align="center"><br>
         Export to : <a href="ExportXLS" target="_blank">XLS</a>
         
         <center><h1><font color="#FFFF00">VIEW ALL EMPLOYEES</font></h1></center>
    <form action="DeleteEmployeeAction.jsp" method="Post">
    <table>
    <tr bgcolor="#D4F101">
    
    <td colspan="2"><div align="center"><strong>Login Name</strong></div></td>
    <td><div align="center"><strong>First Name</strong></div></td>
    <td><div align="center"><strong>Last Name</strong></div></td>
    <td><div align="center"><strong>DOB</strong></div></td>
    <td><div align="center"><strong>city</strong></div></td>
    <td><div align="center"><strong>State</strong></div></td>
    <td><div align="center"><strong>Country</strong></div></td>
    </tr>
    <%
    String report="";
    report+="<table><tr bgcolor=#D4F101><td colspan=2><div align=center><strong>Login Name</strong></div></td>    <td><div align=center><strong>First Name</strong></div></td>    <td><div align=center><strong>Last Name</strong></div></td>    <td><div align=center><strong>DOB</strong></div></td>    <td><div align=center><strong>city</strong></div></td>    <td><div align=center><strong>State</strong></div></td>    <td><div align=center><strong>Country</strong></div></td>    </tr>";
    CoreList acorelist=(CoreList)request.getAttribute("ViewEmployees");
    Enumeration aEnumeration=acorelist.elements();
    while(aEnumeration.hasMoreElements())
    {
    Profile aprofile=(Profile)aEnumeration.nextElement();
  
  report+="<tr bgcolor=#3D874C><td></td><td><span class=style1>"+aprofile.getLoginID()+"</span></td>     <td><span class=style1>"+aprofile.getFirstname()+"</span></td>     <td><span class=style1>"+aprofile.getLastName() +"</span></td>     <td><span class=style1>"+aprofile.getBirthDate1()+"</span></td>     <td><span class=style1>"+aprofile.getCity() +"</span></td>     <td><span class=style1>"+aprofile.getState() +"</span></td>     <td><span class=style1>"+aprofile.getCountry() +"</span></td>     </tr>";
     %>
     <tr bgcolor="#3D874C">
          <td><input type="checkbox" name="loginnames" value="<%=aprofile.getLoginID() %>"/></td>
          <td><span class="style1"><%=aprofile.getLoginID() %></span></td>
     <td><span class="style1"><%=aprofile.getFirstname() %></span></td>
     <td><span class="style1"><%=aprofile.getLastName() %></span></td>
     <td><span class="style1"><%=aprofile.getBirthDate1() %></span></td>
     <td><span class="style1"><%=aprofile.getCity() %></span></td>
     <td><span class="style1"><%=aprofile.getState() %></span></td>
     <td><span class="style1"><%=aprofile.getCountry() %></span></td>
     </tr><%}report+="</table>"; 
     session.setAttribute("Report",report);
     %>
     <tr align="center"><td></td><td></td><td></td><td></td><td><input type="submit" name="send" value="delete"/> </td>   </tr>   
     <tr></tr>
     <tr></tr>
     <tr></tr>
     <tr></tr>
     <tr></tr>
     <tr></tr>
    
              </table>
         
                    
                    
                    
                    
                    
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

