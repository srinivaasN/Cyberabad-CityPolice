<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Administrator secure Unit</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../includes/style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="scripts/gen_validatorv31.js" type="text/javascript"></script>
<script language="JavaScript" type="text/javascript" src="scripts/ts_picker.js"></script>
<script language="JavaScript1.1" src="scripts/pass.js">


</script> <script type="text/javascript" src="scripts/image.js"> </script>
 <script type="text/javascript" src="scripts/general.js"> </script>
 <script type="text/javascript" src="scripts/adi.js"> </script>
 <script type="text/javascript" src="scripts/form_validation.js"> </script>

<script type="text/javascript" src="scripts/moveclock.js"></script>

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
         <center>
      <h3><em><font color="#FFFF00">Employee  Change Password</font></em></h3>
    </center>
    <%if(request.getParameter("status")!=null){
     %>
     <%=request.getParameter("status") %><%} %>
         <form name="changepassword" action="employeeChangePassword.do" onSubmit="return validate()">
                      <table width="400" border="0" align="center" bgcolor="#8ED89D">
                        <tr>
                          <td class="style36"><span class="style3"><strong>User Name</strong></span></td>
                          <td><label>
                            <input type="text" name="username" emsg="Username is required" value="<%=(String)session.getAttribute("user") %>"/>
                          </label></td>
                        </tr>
                        <tr>
                          <td class="style36"><span class="style3"><strong>Old Password</strong></span></td>
                          <td><label>
                            <input type="password" name="oldpassword" emsg="Password is required" />
                          </label></td>
                        </tr>
                        <tr>
                          <td class="style36"><span class="style3"><strong>New Password </strong></span></td>
                          <td><label>
                            <input type="password" name="newpassword" emsg="Password is required" />
                          </label></td>
                        </tr>
                        <tr>
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
           <script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("changepassword");
  
 
  frmvalidator.addValidation("oldpassword","req","Please Enter Your Old Password ");
  
  frmvalidator.addValidation("newpassword","req","Please enter your Password");
    
 </script> 
         
                    
         
                    
                    
                    
                    
                    
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

