package com.dts.project.action;

import com.dts.dae.dao.SecurityDAO;
import com.dts.dae.model.Profile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ChangePassword extends Action
{

    public ChangePassword()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        Profile rb = new Profile();
        rb.setPassword(request.getParameter("oldpassword"));
        rb.setLoginID(request.getParameter("username"));
        rb.setNewPassword(request.getParameter("newpassword"));
        boolean flag = (new SecurityDAO()).changePassword(rb);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
