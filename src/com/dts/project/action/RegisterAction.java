package com.dts.project.action;

import com.dts.dae.dao.ProfileDAO;
import com.dts.dae.model.Profile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class RegisterAction extends Action
{

    public RegisterAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        Profile rb = (Profile)form;
        boolean flag = (new ProfileDAO()).registration(rb);
        if(flag)
            return mapping.findForward("registerSuccess");
        else
            return mapping.findForward("registerFail");
    }
}
