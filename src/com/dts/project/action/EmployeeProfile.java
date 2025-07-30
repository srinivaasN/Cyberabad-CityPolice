package com.dts.project.action;

import com.dts.dae.dao.ProfileDAO;
import javax.servlet.http.*;
import org.apache.struts.action.*;

public class EmployeeProfile extends Action
{

    public EmployeeProfile()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        try
        {
            HttpSession session = request.getSession();
            String loginname = (String)session.getAttribute("user");
            com.dts.dae.model.Profile aprofile = (new ProfileDAO()).getProfile(loginname);
            request.setAttribute("Profile", aprofile);
        }
        catch(Exception exception) { }
        return mapping.findForward("ViewProfile");
    }
}
