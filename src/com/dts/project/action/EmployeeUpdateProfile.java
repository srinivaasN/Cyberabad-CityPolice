package com.dts.project.action;

import com.dts.dae.dao.ProfileDAO;
import com.dts.dae.model.Profile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class EmployeeUpdateProfile extends Action
{

    public EmployeeUpdateProfile()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        Profile aprofile = (Profile)form;
        boolean flag = (new ProfileDAO()).modifyProfile(aprofile);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
