<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Manage Prision</title>
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

	<%--<script>document.location.replace("http://localhost:8081/ManagePrision");</script>--%>



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
				</table> <%-- <jsp:include page="UserOptions.jsp"/> --%>
				<table bgcolor="white" width="780" border="0" cellspacing="0"
					cellpadding="0" background="images/body.jpg">
					<tr>
						<td>
							<%
								if (request.getParameter("status") != null) {
							%> <font color=red><b><%=request.getParameter("status")%></b></font>
							<%
								}
							%>
						</td>
					</tr>
					<tr>
						<td height="314" align="center"><br /> <font size="4"
							color="white"> This project is aimed at developing a
								prison management system that is a collection of registers and
								reports for the effective management of prisons. This system
								should contain the modules like nominal roll, case register,
								parole register, Education, Training, Interview requests, In-out
								register and an automated release diary generator. 1. Nominal
								Roll: The details of the prisoner and his/her demographic
								details should be captured. A digital photo comprising different
								views of the prisoner and the list of articles surrendered by
								prisoner during nominal roll are to be recorded. 2. Case
								register: All the details of the cases against the prisoner
								should be captured. This must include the sentence details,
								remand/conviction details, etc. 3. Automated release diary
								generator: This report should be display the list of prisoners
								to be released on a day, the next day, the next week, the next
								month, or any given duration of time. 4. Parole register: This
								module should track all prisoners on parole and provide
								necessary reports on this data.</font> <br /> <br /> <br /> <br />
							<br /> <br /></td>
						<td>
							<%
								if (request.getParameter("status") != null) {
							%> <span class="style2"><font color="yellow"><b><%=request.getParameter("status")%></b></font>
						</span> <%
 	}
 %>

							<form action="loginAction.do" method="post" name="register">

								<table width="200" border="0" align="right" bgcolor="#7DD4F2">
									<tr>
										<td><div align="right">
												<h3>LoginForm&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</h3>
											</div></td>
									</tr>
									<tr>
										<td><table border="0" align="right">
												<tr>
													<td height="120" align="right"></td>

													<td><table border="0" align="right">
															<tr>
																<td><font color="black"><b>UserID</b></font></td>
																<td><input type="text" name="username" /></td>
															</tr>
															<tr>
																<td><font color="black"><b>Password</b></td>
																<td><input type="password" name="password" /></td>
															</tr>
															<tr>
																<td colspan="2">
																	<div align="center">
																		<input type="submit" name="Submit" value="Sign In" />
																		&nbsp; <input name="Input2" type="reset" value="Clear" />
																	</div>
																</td>
															</tr>
														</table></td>
													<td>&nbsp;</td>
												</tr>
												<tr>
													<td>&nbsp;</td>
													<td valign="baseline">
														<div align="center">
															<a href="RecoverPassword.jsp"><font color="red">Forgot
																	Password ! !......</a>
														</div>
													</td>

													<td>&nbsp;</td>
												</tr>


											</table></td>
									</tr>
								</table>
							</form> <script language="JavaScript" type="text/javascript">
								//You should create the validator only after the definition of the HTML form
								var frmvalidator = new Validator("register");

								frmvalidator.addValidation("username", "req",
										"Please Enter Your Username ");

								frmvalidator.addValidation("password", "req",
										"Please enter your Password");
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

							</table>
						</td>
					</tr>
				</table>
</body>
</html>

