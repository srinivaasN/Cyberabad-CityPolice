
<%@page import="com.dts.ManagePrison.dao.CriminalCourtMasterDao"%>
<%@page import="com.dts.ManagePrison.dao.CriminalMasterDao"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.dts.core.util.CoreList"%>
<%@page import="com.dts.ManagePrison.model.CriminalMasterForm"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
         <form action="criminalDutyAction.do" name="register">
         <table bgcolor="#8DD79C">
         <tr bgcolor="#0E5519">
         <td colspan="2"><h2><font color="#FFFF00">Criminal Duty Register Form</font></h2></td></tr>
         <tr><td><b>Criminal Name</b></td><td><select name="criminalname">
          <option value="--select Any One--">--select Any One--</option> 
          <%
         
          CriminalMasterDao adao=new CriminalMasterDao();
          CoreList acorelist=adao.getCriminalNames(); 
          Enumeration aEnumeration=acorelist.elements();
          while(aEnumeration.hasMoreElements())
          {
          CriminalMasterForm aform=(CriminalMasterForm)aEnumeration.nextElement();
          
          %>
          <option value="<%=aform.getCriminalFristName() %>"><%=aform.getCriminalFristName() %></option>
         <%} %> </select></td></tr>
         
           <tr><td><b>DayofDuty</b></td><td><input type="text" name="dayOfDuty"/>                            <a href="javascript:show_calendar('document.register.dayOfDuty', document.register.dayOfDuty.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a> </td>
          </tr>
          <tr><td><b>From Time</b></td><td><input type="text" name="formTime"/></td></tr>
          <tr><td><b>To Time</b></td><td><input type="text" name="toTime"/></td></tr>
          <tr><td><b>Place Of duty</b></td><td><input type="text" name="placeOfDuty"/></td></tr>
          

                      <tr><td></td><td><input type="submit" name="send" value="Register"/></td></tr>
                    
                  </table></form>  
                      <script language="JavaScript" type="text/javascript">
//You should create the validator only after the definition of the HTML form
  var frmvalidator  = new Validator("register");
  
 frmvalidator.addValidation("criminalname","dontselect=0");
  frmvalidator.addValidation("dayOfDuty","req","Please enter Day Of Duty");
  frmvalidator.addValidation("formTime","maxlen=20","Please Enter From Time");
   
   frmvalidator.addValidation("toTime","req","Please enter To Time");
    
   frmvalidator.addValidation("placeOfDuty","req","Please enter Place Of Duty");
    
    
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

