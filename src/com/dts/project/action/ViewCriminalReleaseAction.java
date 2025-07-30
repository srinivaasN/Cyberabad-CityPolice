package com.dts.project.action;

import com.dts.ManagePrison.dao.ReleasedCriminalsDao;
import com.dts.ManagePrison.model.ReleasedCriminalsForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewCriminalReleaseAction extends Action
{

    public ViewCriminalReleaseAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        ReleasedCriminalsForm releasedCriminalsForm = (ReleasedCriminalsForm)form;
        ReleasedCriminalsDao adao = new ReleasedCriminalsDao();
        CoreList acorelist = adao.ViewReleasedCriminals();
        int size = acorelist.size();
        if(size > 0)
        {
            request.setAttribute("viewCriminalRelease", acorelist);
            return mapping.findForward("viewCriminalRelease");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
