package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalMovementMasterDao;
import com.dts.ManagePrison.model.CriminalMovementMasterForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewCriminalMovementAction extends Action
{

    public ViewCriminalMovementAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalMovementMasterForm criminalmovementmasterform = (CriminalMovementMasterForm)form;
        CriminalMovementMasterDao adao = new CriminalMovementMasterDao();
        CoreList acorelist = adao.ViewCriminalMovementMaster();
        int size = acorelist.size();
        if(size > 0)
        {
            request.setAttribute("ViewCriminalMovement", acorelist);
            return mapping.findForward("ViewCriminalMovement");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
