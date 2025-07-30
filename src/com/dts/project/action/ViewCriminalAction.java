package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalMasterDao;
import com.dts.ManagePrison.model.CriminalMasterForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewCriminalAction extends Action
{

    public ViewCriminalAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalMasterForm criminalmasterform = (CriminalMasterForm)form;
        CriminalMasterDao adao = new CriminalMasterDao();
        String storepath = request.getRealPath("/images");
        CoreList acorelist = adao.ViewCriminalMaster(storepath);
        int size = acorelist.size();
        if(size != 0)
        {
            request.setAttribute("ViewCriminals", acorelist);
            return mapping.findForward("ViewCriminals");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}