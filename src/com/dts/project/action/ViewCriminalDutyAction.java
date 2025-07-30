package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalDutyMasterDao;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewCriminalDutyAction extends Action
{

    public ViewCriminalDutyAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalDutyMasterDao adao = new CriminalDutyMasterDao();
        CoreList acorelist = adao.ViewCriminalDuty();
        int size = acorelist.size();
        if(size != 0)
        {
            request.setAttribute("ViewCrimnalDutys", acorelist);
            return mapping.findForward("ViewCrimnalDutys");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
