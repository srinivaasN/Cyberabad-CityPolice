package com.dts.project.action;

import com.dts.ManagePrison.dao.EmpoyeesDutyMasterDao;
import com.dts.ManagePrison.model.EmployeDutyMasterForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewEmployeeDutyAction extends Action
{

    public ViewEmployeeDutyAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        EmployeDutyMasterForm employeDutyMasterForm = (EmployeDutyMasterForm)form;
        EmpoyeesDutyMasterDao adao = new EmpoyeesDutyMasterDao();
        CoreList acorelist = adao.ViewEmployeesDuties();
        int size = acorelist.size();
        if(size > 0)
        {
            request.setAttribute("viewEmployeeDutys", acorelist);
            return mapping.findForward("viewEmployeeDutys");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
