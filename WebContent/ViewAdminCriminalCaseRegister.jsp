
<%@page import="com.dts.core.util.CoreList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.dts.ManagePrison.model.CriminalMasterForm"%>
<%@page import="com.dts.ManagePrison.model.CriminalCaseRegisterForm"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>

<title>Bureaucrat Defended Entity</title>
<meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1">
<link href="../includes/style.css" rel="stylesheet" type="text/css">
<style type="text/css">
<!--
.style4 {color: #FFFF00}
-->
</style>
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
        <jsp:include page="Adminoptions.jsp"/>
        </font></td></tr>
      </table> 
  
      <table bgcolor="white" width="780" border="0" cellspacing="0" cellpadding="0" background="images/body.jpg">
        <tr>
          <td height="314" align="center"><br>
          
          Export to : <a href="ExportXLS" target="_blank">XLS</a>
          
    <center>
      <h1><font color="#FFFF00">View Criminals Case Register Information </font></h1>
    </center>
        <table><tr bgcolor="#0E5519"><td><div align="center"><strong><span class="style4">Criminal Name</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">CaseRegisterDate</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Case no</span></strong></div></td>
<%--        <td>CrimnalPhoto</td>--%>
        <td><div align="center"><strong><span class="style4"> Fir No</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Remand no</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Section covered</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Police Station name</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">FirDate</span></strong></div></td>
        
        <td><div align="center"><strong><span class="style4">InspectorName</span></strong></div></td>
        </tr>
        <%
        String report="";
        report+="<table><tr bgcolor=#0E5519><td><div align=center><strong><span class=style4>Criminal Name</span></strong></div></td>        <td><div align=center><strong><span class=style4>CaseRegisterDate</span></strong></div></td>        <td><div align=center><strong><span class=style4>Case no</span></strong></div></td><td>CrimnalPhoto</td>        <td><div align=center><strong><span class=style4> Fir No</span></strong></div></td>        <td><div align=center><strong><span class=style4>Remand no</span></strong></div></td>        <td><div align=center><strong><span class=style4>Section covered</span></strong></div></td>        <td><div align=center><strong><span class=style4>Police Station name</span></strong></div></td>        <td><div align=center><strong><span class=style4>FirDate</span></strong></div></td>                <td><div align=center><strong><span class=style4>InspectorName</span></strong></div></td>        </tr>";
         CoreList acorelist=(CoreList)request.getAttribute("ViewCriminalCaseRegister");
        Enumeration aenumeration=acorelist.elements();
        while(aenumeration.hasMoreElements()){
        CriminalCaseRegisterForm aform=(CriminalCaseRegisterForm)aenumeration.nextElement();
        String criminalname=aform.getCriminalname();
        String  caseregisterdate=aform.getCaseRegDate();
        String caseno=aform.getCaseno();
        String firno=aform.getFirNo();
        String remandno=aform.getRemandno();
        String sectioncovered=aform.getSectioncovered();
        String policename=aform.getPoliceStationName();
        String firdate=aform.getFirDate();
        String inspectorname=aform.getInspectorName();
        report+="<tr bgcolor=#8DD79C><td><div align=center><strong>"+criminalname +"</strong></div></td>         <td><div align=center><strong>"+caseregisterdate +"</strong></div></td>                  <td><div align=center><strong>"+caseno +"</strong></div></td>         <td><div align=center><strong>"+ firno+"</strong></div></td>         <td><div align=center><strong>"+remandno +"</strong></div></td>         <td><div align=center><strong>"+sectioncovered+"</strong></div></td>         <td><div align=center><strong>"+ policename+"</strong></div></td>         <td><div align=center><strong>"+firdate+"</strong></div></td>         <td><div align=center><strong>"+inspectorname+"</strong></div></td>        </tr>";
        %>
        <tr bgcolor="#8DD79C">
        <td><div align="center"><strong><%=criminalname %></strong></div></td>
         <td><div align="center"><strong><%=caseregisterdate %></strong></div></td>
         
         <td><div align="center"><strong><%=caseno %></strong></div></td>
         <td><div align="center"><strong><%= firno%></strong></div></td>
         <td><div align="center"><strong><%=remandno %></strong></div></td>
         <td><div align="center"><strong><%=sectioncovered%></strong></div></td>
         <td><div align="center"><strong><%= policename%></strong></div></td>
         <td><div align="center"><strong><%=firdate%></strong></div></td>
         <td><div align="center"><strong><%=inspectorname%></strong></div></td>
        </tr>
         <%}
         report+="</table>";
         session.setAttribute("Report",report); %></table>
         
                    
                    
                    
                    
                    
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

