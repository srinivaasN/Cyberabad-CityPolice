
<%@page import="com.dts.core.util.CoreList"%>
<%@page import="java.util.Enumeration"%>
<%@page import="com.dts.ManagePrison.model.CriminalMasterForm"%><!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
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
      <h1><font color="#FFFF00">View Criminals Information </font></h1>
    </center>
        <table><tr bgcolor="#0E5519"><td><div align="center"><strong><span class="style4">Criminal Name</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Dob</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Dor</span></strong></div></td>
<%--        <td>CrimnalPhoto</td>--%>
        <td><div align="center"><strong><span class="style4"> Crimeno</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Court Name</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Court Place</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">Laywername</span></strong></div></td>
        <td><div align="center"><strong><span class="style4">CrimePeriod</span></strong></div></td>
        
        <td><div align="center"><strong><span class="style4">ExpectedReleaseDate</span></strong></div></td>
        </tr>
        <%
         String report="";
        report+="<table><tr bgcolor=#0E5519><td><div align=center><strong><span class=style4>Criminal Name</span></strong></div></td>        <td><div align=center><strong><span class=style4>Dob</span></strong></div></td>        <td><div align=center><strong><span class=style4>Dor</span></strong></div></td>         <td><div align=center><strong><span class=style4> Crimeno</span></strong></div></td>        <td><div align=center><strong><span class=style4>Court Name</span></strong></div></td>        <td><div align=center><strong><span class=style4>Court Place</span></strong></div></td>        <td><div align=center><strong><span class=style4>Laywername</span></strong></div></td>        <td><div align=center><strong><span class=style4>CrimePeriod</span></strong></div></td>                <td><div align=center><strong><span class=style4>ExpectedReleaseDate</span></strong></div></td>        </tr>";         
       
         CoreList acorelist=(CoreList)request.getAttribute("ViewCriminals");
        Enumeration aenumeration=acorelist.elements();
        while(aenumeration.hasMoreElements()){
        CriminalMasterForm aform=(CriminalMasterForm)aenumeration.nextElement();
        String criminalname=aform.getCriminalFristName();
        String Dob=aform.getDob();
        String dor=aform.getDor();
        String crimeno=aform.getCrimeNo();
        String courtname=aform.getCourtName();
        String courtplace=aform.getCourtPlace();
        String crimeperiod=aform.getCrimeperiod();
        String lawername=aform.getLawyerName();
        String expreleasedate=aform.getExpectedRelDate();
         report+="<tr bgcolor=#8DD79C>   <td><div align=center><strong>"+criminalname+"</strong></div></td>         <td><div align=center><strong>"+Dob+" </strong></div></td>         <td><div align=center><strong>"+ dor+"</strong></div></td>         <td><div align=center><strong>"+crimeno+" </strong></div></td>         <td><div align=center><strong>"+courtname+" </strong></div></td>         <td><div align=center><strong>"+ courtplace+"</strong></div></td>         <td><div align=center><strong>"+lawername+" </strong></div></td>         <td><div align=center><strong>"+crimeperiod+" </strong></div></td>         <td><div align=center><strong>"+expreleasedate+" </strong></div></td></tr>";     
        %>
        <tr bgcolor="#8DD79C">
        <td><div align="center"><strong><%=criminalname %></strong></div></td>
         <td><div align="center"><strong><%=Dob %></strong></div></td>
         <td><div align="center"><strong><%= dor%></strong></div></td>
         <td><div align="center"><strong><%=crimeno %></strong></div></td>
         <td><div align="center"><strong><%=courtname %></strong></div></td>
         <td><div align="center"><strong><%= courtplace%></strong></div></td>
         <td><div align="center"><strong><%=lawername %></strong></div></td>
         <td><div align="center"><strong><%=crimeperiod %></strong></div></td>
         <td><div align="center"><strong><%=expreleasedate %></strong></div></td>
         <%} report+="</table>";
session.setAttribute("Report",report);  %></tr></table>
         
                    
                    
                    
                    
                    
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

