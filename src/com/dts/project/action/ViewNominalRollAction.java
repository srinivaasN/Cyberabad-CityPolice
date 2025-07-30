package com.dts.project.action;

import com.dts.ManagePrison.dao.NominalRoleMasterDao;
import com.dts.ManagePrison.model.NominalRoleMasterForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewNominalRollAction extends Action
{

    public ViewNominalRollAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        NominalRoleMasterForm nominalRoleMasterForm = (NominalRoleMasterForm)form;
        NominalRoleMasterDao adao = new NominalRoleMasterDao();
        CoreList acorelist = adao.ViewNominalRoleMaster();
        int size = acorelist.size();
        if(size > 0)
        {
            request.setAttribute("ViewNominalRolls", acorelist);
            return mapping.findForward("ViewNominalRolls");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
