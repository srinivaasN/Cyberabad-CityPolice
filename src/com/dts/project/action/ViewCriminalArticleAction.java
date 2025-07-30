package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalArticlesMasterDao;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ViewCriminalArticleAction extends Action
{

    public ViewCriminalArticleAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalArticlesMasterDao adao = new CriminalArticlesMasterDao();
        CoreList acorelist = adao.ViewCriminalArticlesMaster();
        int size = acorelist.size();
        if(size != 0)
        {
            request.setAttribute("viewArticlemaster", acorelist);
            return mapping.findForward("viewArticlemaster");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}