package com.dts.project.action;

import com.dts.ManagePrison.dao.EmpoyeesDutyMasterDao;
import com.dts.ManagePrison.model.EmployeDutyMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class EmployeeDutyAction extends Action
{

    public EmployeeDutyAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        EmployeDutyMasterForm employeDutyMasterForm = (EmployeDutyMasterForm)form;
        EmpoyeesDutyMasterDao adao = new EmpoyeesDutyMasterDao();
        boolean flag = adao.insertEmployeeDuty(employeDutyMasterForm);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
