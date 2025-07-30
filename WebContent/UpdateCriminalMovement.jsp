
<%@page import="com.dts.ManagePrison.dao.CriminalMasterDao"%>
<%@page import="com.dts.ManagePrison.model.CriminalMasterForm"%>
<%@page import="com.dts.core.util.CoreList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.dts.dae.dao.ProfileDAO"%>
<%@page import="com.dts.dae.model.Profile"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Bureaucrat Defended Entity</title>
<script language="JavaScript" src="scripts/gen_validatorv31.js"
	type="text/javascript"></script>
<script language="JavaScript" type="text/javascript"
	src="scripts/ts_picker.js"></script>
<script language="JavaScript1.1" src="scripts/pass.js">
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





























</script>
<script type="text/javascript" src="scripts/image.js">
	
</script>
<script type="text/javascript" src="scripts/general.js">
	
</script>
<script type="text/javascript" src="scripts/adi.js">
	
</script>
<script type="text/javascript" src="scripts/form_validation.js">
	
</script>

<script type="text/javascript" src="scripts/moveclock.js"></script>
</head>

<body bgcolor="004B10" leftmargin="0" topmargin="0" onLoad="goforit()">
	<table width="100%" height="100%" border="0" cellpadding="0"
		cellspacing="0">
		<tr>
			<td align="center" valign="middle"><table width="780" border="0"
					cellspacing="0" cellpadding="0">
					<tr>

						<td height="71" valign="bottom" background="images/toplogo.jpg"><table
								width="100%" height="25" border="0" cellpadding="0"
								cellspacing="0">
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
					</tr>
				</table> <jsp:include page="Adminoptions.jsp" />
				<table bgcolor="white" width="780" border="0" cellspacing="0"
					cellpadding="0" background="images/body.jpg">
					<tr>
						<td>
							<%if(request.getParameter("status")!=null){ %> <font color=red><b><%=request.getParameter("status") %></b></font>
							<%} %>
						</td>
					</tr>
					<tr>
						<td height="314" align="center"><br />

							<form action="criminalmovementAction.do" method="post"
								name="register" onSubmit="return validate()">
								<fieldset>
									<div align="center">
										<%
					  if(request.getParameter("status")!=null)
					  {
					%>
										<span class="style2"><%=request.getParameter("status")%>
										</span>
										<%
					  }
					%>
									</div>
									<%CoreList acorelist=(CoreList)request.getAttribute("ViewCriminalMovement");
        Enumeration aenumeration=acorelist.elements();
        while(aenumeration.hasMoreElements()){
        CriminalMovementMasterForm aform=(CriminalMovementMasterForm)aenumeration.nextElement();
        String criminalname=aform.getCriminalname();
        String  fromMovementDateTime=aform.getFromMovementDateTime();
        String fromjail=aform.getFromjail();
        String tojail=aform.getTojail();
        String reasonformovement=aform.getReasonForMovement();
        
        String expreldate=aform.getCriminalExprelDate();
        String employeename=aform.getEmployeename();
        String actreldate=aform.getCriminalActrelDate();
        String reasonfordelay=aform.getReasonFordelay(); %>
									<br />
									<table border="0" align="center" bgcolor="#8DD79C">
										<tr bgcolor="#0E5519">
											<td colspan="2" align="center"><h2>
													<font color="#FFFF00">Registration Form</font>
												</h2></td>
										</tr>
										<tr>
											<td><b>Criminal Name</b></td>
											<td><select name="criminalname">
													<option value="<%=criminalname %>"><%=criminalname %></option>
													<%
         
          CriminalMasterDao adao=new CriminalMasterDao();
          CoreList acorelist=adao.getCriminalNames(); 
          Enumeration aEnumeration=acorelist.elements();
          while(aEnumeration.hasMoreElements())
          {
          CriminalMasterForm aform=(CriminalMasterForm)aEnumeration.nextElement();
          
          %>
													<option value="<%=aform.getCriminalFristName() %>"><%=aform.getCriminalFristName() %></option>
													<%} %>
											</select></td>
										</tr>
										<tr>
											<td><b>Employeename</b></td>
											<td><select name="employeename">
													<option value="employeename">--Select Any One--</option>
													<%ProfileDAO adao1=new ProfileDAO();
           CoreList acorelist1=adao1.viewNames();
           Enumeration aenumeration1=acorelist1.elements();
           while(aenumeration1.hasMoreElements())
           {
           Profile aproifle=(Profile)aenumeration1.nextElement();
             %><option value="<%=aproifle.getLoginID() %>"><%=proifle.getLoginID() %></option>
											</td>
										</tr>
										<tr>
											<td><em><strong><strong>From Jail
													</strong></strong></em></td>
											<td><input type="text" name="fromjail" class="textfield" />
											</td>
										</tr>
										<tr>
											<td><em><strong>To Jail </strong></em></td>
											<td><input type="text" name="tojail" /></td>
										</tr>
										<tr>
											<td><em><strong>Reason For Movement</strong></em></td>
											<td><input type="text" name="reasonForMovement"
												class="textfield" /></td>
										</tr>
										<tr>
											<td><em><strong>Criminal Expected Release
														Date</strong></em></td>
											<td><input type="text" name="criminalExprelDate" /></td>
										</tr>
										<tr>
											<td><em><strong>Criminal Actual Release
														Date</strong></em></td>
											<td><input type="text" name="criminalActrelDate" /></td>
										</tr>
										<tr>
											<td><em><strong>Reason For Delay</strong></em></td>
											<td><input type="text" name="reasonFordelay" /></td>
										</tr>

										<tr>
											<td colspan="2"><div align="center">
													<em><strong> <input name="Input"
															type="submit" value="Register" />
													</strong></em>
												</div></td>
										</tr>
									</table>

								</fieldset>
							</form> <script language="JavaScript" type="text/javascript">
								//You should create the validator only after the definition of the HTML form
								var frmvalidator = new Validator("register");
								frmvalidator.addValidation("criminalname",
										"dontselect=0");

								frmvalidator.addValidation("employeename",
										"dontselect=0");

								frmvalidator.addValidation("fromjail", "req",
										"Please enter From Jail");

								frmvalidator.addValidation("tojail", "alpha",
										" Last Name Alphabetic chars only");

								frmvalidator.addValidation("reasonForMovement",
										"req",
										"Please enter Reason  For Movement");

								frmvalidator.addValidation(
										"criminalExprelDate", "req",
										"Please Enter Criminal ExprelDate");

								frmvalidator.addValidation(
										"criminalActrelDate", "req",
										"Please enter Criminal ActrelDate");

								frmvalidator.addValidation("reasonFordelay",
										"req", "Please enter Reason Fordelay");
							</script>

							<table width="85%" border="0" align="center" cellpadding="2"
								cellspacing="0">

								<tr>
									<td height="18" valign="top"><img
										src="../images/trans.gif" width="5" height="5"></td>
								</tr>
								<tr>
									<td height="18" valign="top">&nbsp;</td>
								</tr>

							</table></td>
					</tr>
				</table>
</body>
</html>

