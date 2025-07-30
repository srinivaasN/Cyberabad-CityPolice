package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalCaseRegisterDao;
import com.dts.ManagePrison.model.CriminalCaseRegisterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class CriminalCaseRegisterAction extends Action
{

    public CriminalCaseRegisterAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalCaseRegisterForm criminalCaseRegisterForm = (CriminalCaseRegisterForm)form;
        CriminalCaseRegisterDao adao = new CriminalCaseRegisterDao();
        boolean flag = adao.insertCriminalCaseRegister(criminalCaseRegisterForm);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
