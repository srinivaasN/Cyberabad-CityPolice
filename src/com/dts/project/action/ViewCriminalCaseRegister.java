package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalCaseRegisterDao;
import com.dts.ManagePrison.model.CriminalCaseRegisterForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewCriminalCaseRegister extends Action
{

    public ViewCriminalCaseRegister()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalCaseRegisterForm criminalCaseRegisterForm = (CriminalCaseRegisterForm)form;
        CriminalCaseRegisterDao adao = new CriminalCaseRegisterDao();
        CoreList acorelist = adao.ViewCriminalCaseRegister();
        int size = acorelist.size();
        if(size > 0)
        {
            request.setAttribute("ViewCriminalCaseRegister", acorelist);
            return mapping.findForward("ViewCriminalCaseRegister");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
