package com.dts.project.action;

import com.dts.core.util.CoreList;
import com.dts.dae.dao.ProfileDAO;
import java.io.PrintStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewEmployeeAction extends Action
{

    public ViewEmployeeAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        ProfileDAO adao = new ProfileDAO();
        CoreList acorelist = adao.getProfile();
        int size = acorelist.size();
        System.out.println((new StringBuilder(String.valueOf(size))).append("------------------->>>>").toString());
        if(size > 0)
        {
            request.setAttribute("ViewEmployees", acorelist);
            return mapping.findForward("ViewEmployees");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
