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
        </tr><tr><td align=center width=1500><font color=white>
        <jsp:include page="EmployeeOptions.jsp"/>
        </font></td></tr>
      </table> 
  
      <table bgcolor="white" width="780" border="0" cellspacing="0" cellpadding="0" background="images/body.jpg">
        <tr>
          <td height="314" align="center"><br>
          
          
          
    <center><h1><font color="#FFFF00">Welcome To The Employee</font></h1></center>
         
         <%
         String criminaldutyid=request.getParameter("criminalregisterid");
         String criminalname=request.getParameter("criminalname");
         
          %>
         <form action="RemarksAction.jsp" method="post">
         <input type="hidden" name="criminaldutyid" value="<%=criminaldutyid %>"/>
<input type="hidden" name="criminalname" value="<%=criminalname %>"/>
<table>
<tr><td>Remarks</td><td><textarea name="remarks"></textarea></td></tr>
<tr><td></td><td><input type="submit" name="Send" value="Send"/></td></tr>
</table>
         </form>
                    
                    
                    
                    
                    
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

