package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalMasterDao;
import com.dts.ManagePrison.model.CriminalMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class UpdateCriminalAction extends Action
{

    public UpdateCriminalAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalMasterForm criminalmasterform = (CriminalMasterForm)form;
        CriminalMasterDao adao = new CriminalMasterDao();
        String file = request.getParameter("criminalPhoto");
        boolean flag = adao.UpdateCriminalMaster(criminalmasterform, file);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}