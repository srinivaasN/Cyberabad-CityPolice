package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalMovementMasterDao;
import com.dts.ManagePrison.model.CriminalMovementMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class CriminalMovementAction extends Action
{

    public CriminalMovementAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalMovementMasterForm aform = (CriminalMovementMasterForm)form;
        CriminalMovementMasterDao adao = new CriminalMovementMasterDao();
        boolean flag = adao.insertCriminalMovementMaster(aform);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}