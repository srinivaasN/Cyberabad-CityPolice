<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Internet Banking</title>

</head>

<body bgcolor="004B10" leftmargin="0" topmargin="0" onLoad="goforit()">
<table width="100%" height="100%" border="0" cellpadding="0" cellspacing="0">
  <tr>
    <td align="center" valign="middle"><table width="780" border="0" cellspacing="0" cellpadding="0">
        <tr>

          <td height="71" valign="bottom" background="./images/satya.JPG"><table width="100%" height="25" border="0" cellpadding="0" cellspacing="0">
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
  
      <table bgcolor="white" width="780" border="0" cellspacing="0" cellpadding="0">
        <tr>
          <td height="314" align="center"><br/>
          
          
          
    <center>
      <h3><em>Customer Change Password</em></h3>
    </center>
    <%if(request.getParameter("status")!=null){
     %>
     <%=request.getParameter("status") %><%} %>
         <form name="changepassword" action="customerChangePassword.do" onSubmit="return validate()">
                      <table width="261" border="0" align="center">
                        <tr>
                          <td bgcolor="#489257" class="style36"><span class="style3"><strong>User Name</strong></span></td>
                          <td><label>
                            <input type="text" name="username" emsg="Username is required" value="<%=(String)session.getAttribute("user") %>"/>
                          </label></td>
                        </tr>
                        <tr>
                          <td bgcolor="#489257" class="style36"><span class="style3"><strong>Old Password</strong></span></td>
                          <td><label>
                            <input type="password" name="oldpassword" emsg="Password is required" />
                          </label></td>
                        </tr>
                        <tr>
                          <td bgcolor="#489257" class="style36"><span class="style3"><strong>New Password </strong></span></td>
                          <td><label>
                            <input type="password" name="newpassword" emsg="Password is required" />
                          </label></td>
                        </tr>
                        <tr bgcolor="#489257">
                          <td colspan="2"><label>
                              <div align="center">
                                <input type="submit" name="Submit" value="Change" />
                                &nbsp;
                                <input type="reset" name="Submit2" value="Reset" />
                              </div>
                          </label></td>
                        </tr>
            </table>
                      <div align="center"></div>
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

