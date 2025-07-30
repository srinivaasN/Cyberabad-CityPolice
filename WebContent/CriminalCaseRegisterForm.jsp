<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Manage Prision</title>
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
          
          
          
    <center><h1><font color="#FFFF00"></font></h1></center>
         <form action="criminalCaseRegisterAction.do" name="register">
         <table bgcolor="#8DD79C">
         <tr bgcolor="#0E5519">
         <td colspan="2"><h2><font color="#FFFF00">Criminal Case Register Form</font></h2></td></tr>
         <tr><td><b>Criminal Name</b></td><td><input type="text" name="criminalname" value="<%=request.getParameter("criminalFristName") %>"/></td></tr>
          <tr><td><b>Case Register Date</b></td><td><input type="text" name="caseRegDate"/><a href="javascript:show_calendar('document.register.caseRegDate', document.register.caseRegDate.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a></td></tr>
          <tr><td><b>Fir No</b></td><td><input type="text" name="firNo"/></td></tr>
          <tr><td><b>Police Station Name</b></td><td><input type="text" name="policeStationName"/></td></tr>
          <tr><td><b>Fir Date</b></td><td><input type="text" name="firDate"/><a href="javascript:show_calendar('document.register.firDate', document.register.firDate.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a></td></tr>
          <tr><td><b>Inspector Name</b></td><td><input type="text" name="inspectorName"/></td></tr>
          <tr><td><b>Case No</b></td><td><input type="text" name="caseno"/></td></tr>
          <tr><td><b>Remand No</b></td><td><input type="text" name="remandno"/></td></tr>
          <tr><td><b>Sections Covered </b></td><td><input type="text" name="sectioncovered"/></td></tr>
           <input type="hidden" name="loginname" value="<%=(String)session.getAttribute("user") %>"/>
                      <tr><td></td><td><input type="submit" name="send" value="Register"/></td></tr>
                    
                  </table></form>  
                      <script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("register");
  
 
  frmvalidator.addValidation("criminalname","req","Please enter Criminal FristName");
  frmvalidator.addValidation("criminalname","maxlen=20",	"Max length for FirstName is 20");
  frmvalidator.addValidation("criminalname","alpha"," First Name Alphabetic chars only");
   
   frmvalidator.addValidation("caseRegDate","req","Please enter Criminal DOB");
   frmvalidator.addValidation("firNo","req","Please enter Fir No");
     
    
  
   frmvalidator.addValidation("policeStationName","req","Please Enter Police Station Name"); 
    frmvalidator.addValidation("firDate","req","Please enter FIR DAIE");
    
  frmvalidator.addValidation("inspectorName","req","Please enter Inspector Name");
  frmvalidator.addValidation("caseno","req","Please enter Caseno");
   frmvalidator.addValidation("remandno","req","Please enter Remand No");
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

