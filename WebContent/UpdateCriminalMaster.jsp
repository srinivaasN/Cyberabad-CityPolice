
<%@page import="com.dts.ManagePrison.model.CriminalMasterForm"%>
<%@page import="com.dts.ManagePrison.dao.CriminalMasterDao"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Bureaucrat Defended Entity</title>
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
   <%
   String storepath=request.getRealPath("/images"); 
   CriminalMasterForm aform=new CriminalMasterDao().ViewCriminalMasterById(storepath,request.getParameter("criminalname"));
        String criminalname=aform.getCriminalFristName();
        String Dob=aform.getDob();
        String dor=aform.getDor();
        String crimeno=aform.getCrimeNo();
        String courtname=aform.getCourtName();
        String courtplace=aform.getCourtPlace();
        String crimeperiod=aform.getCrimeperiod();
        String lawername=aform.getLawyerName();
        String expreleasedate=aform.getExpectedRelDate();%>
         <form action="updateCriminalAction.do" name="register">
         <table bgcolor="#8DD79C">
         <tr bgcolor="#0E5519"><td colspan="2"><h2><font color="#FFFF00">Criminal Register Form</font></h2></td></tr>
         <tr><td><b>Criminal Name</b></td><td><input type="text" name="criminalFristName" value="<%=criminalname %>" readonly="readonly"/></td></tr>
          <tr><td><b>Date Of Birth</b></td><td><input type="text" name="dob" value="<%=Dob %>"/><a href="javascript:show_calendar('document.register.dob', document.register.dob.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a> </td></tr>
          <tr><td><b>Crime No</b></td><td><input type="text" name="crimeNo"  value="<%=crimeno %>"/></td></tr>
          <tr><td><b>Conviction No</b></td><td><input type="text" name="convictionNo"  value="<%=aform.getConvictionNo() %>"/></td></tr>
          <tr><td><b>Court Name</b></td><td><input type="text" name="courtName"  value="<%=aform.getCourtName() %>"/></td></tr>
          <tr><td><b>Court Place</b></td><td><input type="text" name="courtPlace"  value="<%=aform.getCourtPlace() %>"/></td></tr>
          <tr><td><b>Lawyer Name</b></td><td><input type="text" name="lawyerName"  value="<%=aform.getLawyerName() %>"/></td></tr>
          <tr><td><b>Crime Period</b></td><td><input type="text" name="crimeperiod"  value="<%=crimeperiod %>"/></td></tr>
           <input type="hidden" name="loginname" value="<%=(String)session.getAttribute("user") %>"/>
          <tr><td><b>Expected Release Date</b></td><td><input type="text" name="expectedRelDate"  value="<%=expreleasedate %>"/><a href="javascript:show_calendar('document.register.expectedRelDate',document.register.expectedRelDate.value);"> <img src="images/cal.gif" alt="a" width="18" height="18" border="0"/></a> </td></tr>
                    <tr><td></td><td><input type="submit" name="send" value="Update"/></td></tr>
                    
                  </table></form>  
                    
                    
                    
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

