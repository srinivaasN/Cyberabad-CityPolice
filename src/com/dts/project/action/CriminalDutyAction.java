package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalDutyMasterDao;
import com.dts.ManagePrison.model.CriminalDutyMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class CriminalDutyAction extends Action
{

    public CriminalDutyAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalDutyMasterForm aform = (CriminalDutyMasterForm)form;
        CriminalDutyMasterDao adao = new CriminalDutyMasterDao();
        boolean flag = adao.insertCriminalDuty(aform);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
