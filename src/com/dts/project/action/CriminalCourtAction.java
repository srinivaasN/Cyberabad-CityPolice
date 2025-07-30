package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalCourtMasterDao;
import com.dts.ManagePrison.model.CriminalCourtMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class CriminalCourtAction extends Action
{

    public CriminalCourtAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalCourtMasterForm criminalCourtMasterForm = (CriminalCourtMasterForm)form;
        CriminalCourtMasterDao adao = new CriminalCourtMasterDao();
        boolean flag = adao.insertCriminalCourtMaster(criminalCourtMasterForm);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}