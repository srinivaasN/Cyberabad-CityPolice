package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalMasterDao;
import com.dts.ManagePrison.model.CriminalMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class CriminalRegisterAction extends Action
{

    public CriminalRegisterAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalMasterForm aform = (CriminalMasterForm)form;
        CriminalMasterDao adao = new CriminalMasterDao();
        boolean flag = adao.insertCriminalMaster(aform);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
