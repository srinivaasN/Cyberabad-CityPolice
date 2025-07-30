package com.dts.project.action;

import com.dts.ManagePrison.dao.ReleasedCriminalsDao;
import com.dts.ManagePrison.model.ReleasedCriminalsForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class UpdateCriminalReleaseMaster extends Action
{

    public UpdateCriminalReleaseMaster()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        ReleasedCriminalsForm releasedCriminalsForm = (ReleasedCriminalsForm)form;
        ReleasedCriminalsDao adao = new ReleasedCriminalsDao();
        boolean flag = adao.UpdateReleasedCriminals(releasedCriminalsForm);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}