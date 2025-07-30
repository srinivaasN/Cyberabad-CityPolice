<html>
   <%if(session.getAttribute("role")==null || session.getAttribute("user")==null)
{
   RequestDispatcher rd = request.getRequestDispatcher("LoginForm.jsp?ls=Session Expired");
   rd.forward(request,response);
}%>
  

<script language="JavaScript">
<!--
function mmLoadMenus() {
  if (window.mm_menu_1224101012_0) return;
      window.mm_menu_1224101012_0 = new Menu("root",134,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224101012_0.addMenuItem("Register Criminals","location='CriminalMaster.jsp'");
  mm_menu_1224101012_0.addMenuItem("View Criminals","location='viewCriminalsAction.do'");
   mm_menu_1224101012_0.addMenuItem("View Case Register","location='viewCriminalCaseRegister.do'");
  // mm_menu_1224101012_0.addMenuItem("AccountTypes","location='ViewEmployeeBranchAccountTypes.jsp'");
   //mm_menu_1224101012_0.addMenuItem("Branch Services","location='EmployeeViewBranchServices.jsp'");
   //  mm_menu_1224101012_0.addMenuItem("View Branches","location='employeeviewBranchAction.do'");
   
   mm_menu_1224101012_0.fontWeight="bold";
   mm_menu_1224101012_0.hideOnMouseOut=true;
   mm_menu_1224101012_0.bgColor='#DCF8C0';
   mm_menu_1224101012_0.menuBorder=0;
   mm_menu_1224101012_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101012_0.menuBorderBgColor='';
window.mm_menu_1224101649_0 = new Menu("root",134,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224101649_0.addMenuItem("Court Hearing Date","location='CriminalCourtMaster.jsp'"); 
 mm_menu_1224101649_0.addMenuItem("View Hearing Details","location='viewHearingDetails.do'"); 
  //  mm_menu_1224101649_0.addMenuItem("Branch Services","location='branchServices.do'");
  //  mm_menu_1224101649_0.addMenuItem("View Branch Services","location='ViewBranchServices.jsp'");
  //  mm_menu_1224101649_0.fontWeight="bold";
   mm_menu_1224101649_0.hideOnMouseOut=true;
   mm_menu_1224101649_0.bgColor='#DCF8C0';
   mm_menu_1224101649_0.menuBorder=3;
   mm_menu_1224101649_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101649_0.menuBorderBgColor='#FFFFFF';
  window.mm_menu_1224101802_0 = new Menu("root",150,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  // mm_menu_1224101802_0.addMenuItem("Register Employees","location='EmployeMaster.jsp'");
  mm_menu_1224101802_0.addMenuItem("View Profile","location='employeeProfile.do'");
   
   mm_menu_1224101802_0.fontWeight="bold";
   mm_menu_1224101802_0.hideOnMouseOut=true;
   mm_menu_1224101802_0.bgColor='#DCF8C0';
   mm_menu_1224101802_0.menuBorder=3;
   mm_menu_1224101802_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101802_0.menuBorderBgColor='#FFFFFF';
   
   window.mm_menu_1224101903_0 = new Menu("root",155,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
 // mm_menu_1224101903_0.addMenuItem("View Dealer Orders","location='UpdateDealerOrder.jsp'");-->
   mm_menu_1224101903_0.addMenuItem("Add Nominal Register","location='NominalRollMaster.jsp'");
   mm_menu_1224101903_0.addMenuItem("View Nominal Rolls","location='viewNominalRollAction.do'");
   mm_menu_1224101903_0.addMenuItem("ViewCriminalMovement","location='viewEmployeeCriminalmovementAction.do'");
mm_menu_1224101903_0.addMenuItem("View Employee Dutys","location='EmployeeviewEmployeeDutyAction.do'");
mm_menu_1224101903_0.addMenuItem("ViewReleased Criminals","location='EmployeeviewCriminalreleasAction.do'");
  
   mm_menu_1224101903_0.fontWeight="bold";
   mm_menu_1224101903_0.hideOnMouseOut=true;
   mm_menu_1224101903_0.bgColor='#DCF8C0';
   mm_menu_1224101903_0.menuBorder=3;
   mm_menu_1224101903_0.menuLiteBgColor='#DCF8C0';
   mm_menu_1224101903_0.menuBorderBgColor='#FFFFFF';
   
   window.mm_menu_1224122939_0 = new Menu("root",134,25,"Georgia, Times New Roman, Times, serif",12,"#993333","#333366","#B6B6B6","#E7D398","left","middle",3,0,500,-5,7,true,false,true,0,true,false);
  mm_menu_1224122939_0.addMenuItem("RegisterCriminalDutys","location='CriminaDutyMaster.jsp'");
  mm_menu_1224122939_0.addMenuItem("View CriminalDuty","location='viewCriminalDutyAction.do'");
 
            
 // mm_menu_1224122939_0.addMenuItem("Change&nbsp;Question","location='ChangeQuestion.jsp?role=admin'"); 
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

<a href="EmployeeHome.jsp"  class="style1">Home</a>&nbsp;&nbsp;|
<a href="#"  class="style1" name="link7" id="link1" onMouseOver="MM_showMenu(window.mm_menu_1224101012_0,0,25,null,'link7')" onMouseOut="MM_startTimeout();" >Criminals </a>&nbsp;&nbsp;|
<a href="#" class="style1" name="link6" id="link2" onMouseOver="MM_showMenu(window.mm_menu_1224101649_0,0,25,null,'link6')" onMouseOut="MM_startTimeout();" >Court Details</a>&nbsp;&nbsp;|
 <a href="#" class="style1" name="link5" id="link3" onMouseOver="MM_showMenu(window.mm_menu_1224101802_0,0,25,null,'link5')" onMouseOut="MM_startTimeout();">Profile</a>&nbsp;&nbsp;|
<%--<a href="ViewQueries.jsp" class="style1" >Queries</a>&nbsp;&nbsp;|&nbsp;&nbsp;--%>
<a href="#" name="link4" id="link4" class="style1" onMouseOver="MM_showMenu(window.mm_menu_1224101903_0,0,25,null,'link4')" onMouseOut="MM_startTimeout();">Nominal Rolls</a>&nbsp;&nbsp;|
<a href="#" name="link8" id="link8" class="style1" onMouseOver="MM_showMenu(window.mm_menu_1224122939_0,0,25,null,'link8')" onMouseOut="MM_startTimeout();">Criminal Dutys</a>&nbsp;&nbsp;|
<a href="ManagerChangePassword.jsp" class="style1"><strong>Security</strong></a>&nbsp;&nbsp;|
<a href="LogoutAction.jsp" class="style1" >Logout</a>


</body>
</html>                      