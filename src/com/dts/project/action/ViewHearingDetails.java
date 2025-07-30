package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalCourtMasterDao;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewHearingDetails extends Action
{

    public ViewHearingDetails()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalCourtMasterDao adao = new CriminalCourtMasterDao();
        CoreList acorelist = adao.ViewCriminalCourtMaster();
        int size = acorelist.size();
        if(size != 0)
        {
            request.setAttribute("ViewHearingdetails", acorelist);
            return mapping.findForward("ViewHearingdetails");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
