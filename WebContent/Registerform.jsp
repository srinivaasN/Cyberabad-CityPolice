<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Bureaucrat Defended Entity</title>
<script language="JavaScript" src="scripts/gen_validatorv31.js" type="text/javascript"></script>
<script language="JavaScript" type="text/javascript" src="scripts/ts_picker.js"></script>
<script language="JavaScript1.1" src="scripts/pass.js">


</script> <script type="text/javascript" src="scripts/image.js"> </script>
 <script type="text/javascript" src="scripts/general.js"> </script>
 <script type="text/javascript" src="scripts/adi.js"> </script>
 <script type="text/javascript" src="scripts/form_validation.js"> </script>

<script type="text/javascript" src="scripts/moveclock.js"></script>
</head>

<body bgcolor="004B10" leftmargin="0" topmargin="0" onLoad="goforit()">
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

      <table width="780" border="0" cellspacing="0" cellpadding="0" >
        <tr>
          <td><img src="images/ib_banner2.jpg" width="780" height="101"></td>
        </tr>
      </table>
       <jsp:include page="Adminoptions.jsp"/>
      <table bgcolor="white" width="780" border="0" cellspacing="0" cellpadding="0" background="images/body.jpg">
        <tr><td><%if(request.getParameter("status")!=null){ %>
	<font color=red><b><%=request.getParameter("status") %></b></font><%} %></td></tr>
          <tr><td height="314" align="center"><br/>
          
           <form action="customerregisterAction.do" method="post" name="register" onSubmit="return validate()"><fieldset>
					  <div align="center">
                    <%
					  if(request.getParameter("status")!=null)
					  {
					%>
                    <span class="style2"><%=request.getParameter("status")%>					</span>
                    <%
					  }
					%>     
                    </div>
                    <br />
                      <table border="0" align="center" bgcolor="#8DD79C">
                      <tr bgcolor="#0E5519"><td colspan="2" align="center"><h2><font color="#FFFF00">Registration Form</font></h2></td></tr>
                         <tr>
                          <td class="tiny"><strong><em><strong>First Name </strong></em></strong></td>
                          <td><input type="text" name="firstname" class="textfield"/>                          </td>
                        </tr>
                        <tr>
                          <td><em><strong><strong>Last Name </strong></strong></em></td>
                          <td><input type="text" name="lastname" class="textfield"/>                          </td>
                        </tr>
                        <tr>
                          <td><em><strong>Birth Date </strong></em></td>
                          <td><input type="text" name="bdate" readonly="readonly" />
                            <a href="javascript:show_calendar('document.register.bdate', document.register.bdate.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a> </td>
                        </tr>
                        <tr>
                          <td><em><strong>House No</strong></em></td>
                          <td><input type="text" name="hno" class="textfield"/></td>
                        </tr>
                        <tr>
                          <td><em><strong>Street</strong></em></td>
                          <td><input type="text" name="street" class="textfield"/></td>
                        </tr>
                        <tr>
                          <td><em><strong>City</strong></em></td>
<td><select name="city">
<option value="--Select Any One--">----Select Any One---</option>
                              <option value="Hyderabad">Hyderabad</option>
                              <option value="Mumbai">Mumbai</option>
                            </select>                          </td>
                        </tr>
                        <tr>
                          <td><em><strong>State</strong></em></td>
<td><select name="state"><option value="--Select Any One--">----Select Any One---</option>
                              <option value="Andhara pradesh">Andhara pradesh</option>
                              <option value="Maharashtra">Maharashtra</option>
                            </select>                          </td>
                        </tr>
                        <tr>
                          <td><em><strong>Country</strong></em></td>
<td><select name="country"><option value="--Select Any One--">----Select Any One---</option>
                              <option value="India">India</option>
                            </select>                          </td>
                        </tr>
                        <tr>
                          <td><em><strong>Pincode</strong></em></td>
                          <td><input type="text" name="pincode" class="textfield"/></td>
                        </tr>
                        <tr>
                          <td><em><strong>Contact No</strong></em></td>
                          <td><input type="text" name="phoneNo" class="textfield"/></td>
                        </tr>
                        <tr>
                          <td><em><strong>Email</strong></em></td>
                          <td><input type="text" name="email" class="textfield"/></td>
                        </tr>
                        <input type="hidden" name="loginType" value="Employee"/>
                        <tr>
                          <td><em><strong>Login Name</strong></em></td>
                          <td><input type="text" name="loginID" />                          </td>
                        </tr>
                        <tr>
                          <td><em><strong>Password</strong></em></td>
                          <td><input name="password" type="password" id="password" />                          </td>
                        </tr>
                        <tr>
                          <td><em><strong> Secret Question </strong></em></td>
<td><select name="secretqid"><option value="--Select Any One--">--Select Any One</option>
                              <option value="1">What is your favorite pastime?</option>
                              <option value="2">Who your childhood hero?</option>
                              <option value="3">What is the name of your first school?</option>
                              <option value="4">Where did you meet your spouse?</option>
                              <option value="5">What is your favorite sports team?</option>
                              <option value="6">What is your father's middle name?</option>
                              <option value="7">What was your high school mascot?</option>
                              <option value="8">What make was your first car or bike?</option>
                              <option value="9">What is your pet's name?</option>
                          </select></td>
                        </tr>
                          <tr>
                          <td><em><strong>Secret Answer</strong></em></td>
                          <td><input name="secretqans" type="text" /></td>
                        </tr>
                        <tr>
                          <td height="11" colspan="2"></td>
                        </tr>
                        <tr>
                          <td colspan="2"><div align="center"><em><strong>
                          <input name="Input" type="submit" value="Register" />
                          </strong></em></div></td>
                        </tr>
            </table>
                   
					</fieldset>
				</form>    
                    <script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("register");
  
 
  frmvalidator.addValidation("firstname","req","Please enter Employee First Name");
  frmvalidator.addValidation("firstname","maxlen=20",	"Max length for FirstName is 20");
  frmvalidator.addValidation("firstname","alpha"," First Name Alphabetic chars only");
  
  frmvalidator.addValidation("lastname","req","Please enter Employee Last Name");
  frmvalidator.addValidation("lastname","maxlen=20","Max length is 20");
  frmvalidator.addValidation("lastname","alpha"," Last Name Alphabetic chars only");
  
   
   frmvalidator.addValidation("bdate","req","Please enter your DOB"); 
  
   frmvalidator.addValidation("hno","req","Please Enter Employee Houseno"); 
  
   frmvalidator.addValidation("street","req","Please enter Employee Street");
    
    frmvalidator.addValidation("city","dontselect=0");
    
    frmvalidator.addValidation("state","dontselect=0");
    
    frmvalidator.addValidation("country","dontselect=0");
  
  frmvalidator.addValidation("pincode","req","Please enter Employee Pincode");
  frmvalidator.addValidation("pincode","age");
  
  frmvalidator.addValidation("email","maxlen=50");
  frmvalidator.addValidation("email","req");
  frmvalidator.addValidation("email","email");
  frmvalidator.addValidation("secretqid","dontselect=0");
   
     
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

