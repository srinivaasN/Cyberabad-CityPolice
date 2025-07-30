<html>
  <%if(session.getAttribute("role")==null || session.getAttribute("user")==null)
{
System.out.println("hello"+session.getAttribute("user"));
   RequestDispatcher rd = request.getRequestDispatcher("LoginForm.jsp?ls=Session Expired");
   rd.forward(request,response);
}%>

<script language="JavaScript">
<!--
function mmLoadMenus() {
  if (window.mm_menu_1224101012_0) return;
      window.mm_menu_1224101012_0 = new Menu("root",134,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224101012_0.addMenuItem("Register Employees","location='Registerform.jsp'");
  mm_menu_1224101012_0.addMenuItem("View Employees","location='viewEmployeeAction.do'");
  // mm_menu_1224101012_0.addMenuItem("Account Types","location='AccountTypeMaster.jsp'");
  // mm_menu_1224101012_0.addMenuItem("View Account Types","location='viewAccountTypes.do'");
  // mm_menu_1224101012_0.addMenuItem("BranchAccounts","location='RegisterAccountServiceMaster.jsp'");
   // mm_menu_1224101012_0.addMenuItem("View Branch Account Types","location='ViewBranchAccountTypes.jsp'");
   
   mm_menu_1224101012_0.fontWeight="bold";
   mm_menu_1224101012_0.hideOnMouseOut=true;
   mm_menu_1224101012_0.bgColor='#DCF8C0';
   mm_menu_1224101012_0.menuBorder=0;
   mm_menu_1224101012_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101012_0.menuBorderBgColor='';
window.mm_menu_1224101649_0 = new Menu("root",134,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224101649_0.addMenuItem("View Criminals","location='viewAdminCriminalsAction.do'"); 
  mm_menu_1224101649_0.addMenuItem("View Case Registers","location='viewAdminCriminalCaseRegister.do'"); 
   mm_menu_1224101649_0.addMenuItem("Hearing Details","location='viewAdminHearingDetails.do'");
   mm_menu_1224101649_0.addMenuItem("ViewCriminalDutys","location='viewAdminCriminalDutyAction.do'");
   mm_menu_1224101649_0.fontWeight="bold";
   mm_menu_1224101649_0.hideOnMouseOut=true;
   mm_menu_1224101649_0.bgColor='#DCF8C0';
   mm_menu_1224101649_0.menuBorder=3;
   mm_menu_1224101649_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101649_0.menuBorderBgColor='#FFFFFF';
  window.mm_menu_1224101802_0 = new Menu("root",150,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224101802_0.addMenuItem("Criminal Article","location='CriminaArticleMaster.jsp'");
  mm_menu_1224101802_0.addMenuItem("View Article","location='viewCriminalArticleAction.do'");
  mm_menu_1224101802_0.addMenuItem("ViewNominalRegister","location='viewAdminNominalRollAction.do'");
  mm_menu_1224101802_0.addMenuItem("Add Release Master","location='ReleasedCriminals.jsp'");
  mm_menu_1224101802_0.addMenuItem("View Release Master","location='viewCriminalreleasAction.do'");
  mm_menu_1224101802_0.fontWeight="bold";
  mm_menu_1224101802_0.hideOnMouseOut=true;
  mm_menu_1224101802_0.bgColor='#DCF8C0';
   mm_menu_1224101802_0.menuBorder=3;
   mm_menu_1224101802_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101802_0.menuBorderBgColor='#FFFFFF';
   
   window.mm_menu_1224101903_0 = new Menu("root",155,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
 mm_menu_1224101903_0.addMenuItem("Register PayRoles","location='ParoleForm.jsp'");
 mm_menu_1224101903_0.addMenuItem("View PayRoles","location='viewParoleAction.do'");
 
   mm_menu_1224101903_0.addMenuItem("View Profile","location='adminProfile.do'");
  //  mm_menu_1224101903_0.addMenuItem("view AdvtTypes","location='ViewAdvtTypeMaster.jsp?submit=viewvolunteers'");
   //mm_menu_1224101903_0.addMenuItem("Add AdvtTypeTariff","location='AdvtTypeTariffMaster.jsp?submit=viewDetails'");
  // mm_menu_1224101903_0.addMenuItem("view AdvtTypeTariff","location='ViewAdvtTariffMaster.jsp?submit=viewAnswers'");
  
   mm_menu_1224101903_0.fontWeight="bold";
   mm_menu_1224101903_0.hideOnMouseOut=true;
   mm_menu_1224101903_0.bgColor='#DCF8C0';
   mm_menu_1224101903_0.menuBorder=3;
   mm_menu_1224101903_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101903_0.menuBorderBgColor='#FFFFFF';
   
   window.mm_menu_1224122939_0 = new Menu("root",134,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224122939_0.addMenuItem("AddEmployee Duty","location='AdminEmployeeDutyMaster.jsp'");
  mm_menu_1224122939_0.addMenuItem("ViewEmployeeDutys","location='viewEmployeeDutyAction.do'");
 
            
 mm_menu_1224122939_0.addMenuItem("AddCriminalMovement","location='CriminalMovementMaster.jsp'"); 
 mm_menu_1224122939_0.addMenuItem("ViewCriminalMovement","location='viewCriminalmovementAction.do'"); 
 
   mm_menu_1224122939_0.fontWeight="bold";
   mm_menu_1224122939_0.hideOnMouseOut=true;
   mm_menu_1224122939_0.bgColor='#DCF8C0';
   mm_menu_1224122939_0.menuBorder=0;
   mm_menu_1224122939_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224122939_0.menuBorderBgColor='#777777';

mm_menu_1224101903_0.writeMenus();
} // mmLoadMenus()
//-->
</script>


<script language="JavaScript" src="scripts/mm_menu.js"></script>
<script language="JavaScript1.2">mmLoadMenus();</script>
<style type="text/css">
<!--
.style1 {
	color: yellow;
	font-weight: bold;
}
a:link {
	text-decoration: none;
}
a:visited {
	text-decoration: none;
}
a:hover {
	text-decoration: none;
}
a:active {
	text-decoration: none;
}
.style2 {color: #B6B6B6}

-->
</style>
<body>

<a href="AdminHome.jsp"  class="style1">Home</a>&nbsp;&nbsp;|
<a href="#"  class="style1" name="link7" id="link1" onMouseOver="MM_showMenu(window.mm_menu_1224101012_0,0,25,null,'link7')" onMouseOut="MM_startTimeout();" >Employees</a>&nbsp;&nbsp;|
<a href="#" class="style1" name="link6" id="link2" onMouseOver="MM_showMenu(window.mm_menu_1224101649_0,0,25,null,'link6')" onMouseOut="MM_startTimeout();" >Criminals</a>&nbsp;&nbsp;| 
 <a href="#" class="style1" name="link5" id="link3" onMouseOver="MM_showMenu(window.mm_menu_1224101802_0,0,25,null,'link5')" onMouseOut="MM_startTimeout();">Article</a>&nbsp;&nbsp;|
<%--<a href="ViewQueries.jsp" class="style1" >Queries</a>&nbsp;&nbsp;|&nbsp;&nbsp;--%>
<a href="#" name="link4" id="link4" class="style1" onMouseOver="MM_showMenu(window.mm_menu_1224101903_0,0,25,null,'link4')" onMouseOut="MM_startTimeout();">Profile</a>&nbsp;&nbsp;|
<a href="#" name="link8" id="link8" class="style1" onMouseOver="MM_showMenu(window.mm_menu_1224122939_0,0,25,null,'link8')" onMouseOut="MM_startTimeout();">Employee Dutys</a>&nbsp;&nbsp;|
<a href="ChangePassword.jsp" class="style1"><strong>Security</strong></a>&nbsp;&nbsp;|
<a href="LogoutAction.jsp" class="style1" >Logout</a>


</body>
</html>                      