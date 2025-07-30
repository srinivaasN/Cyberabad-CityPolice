package com.dts.project.action;

import com.dts.ManagePrison.dao.CriminalArticlesMasterDao;
import com.dts.ManagePrison.model.CriminalArticlesMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class CriminalArticalAction extends Action
{

    public CriminalArticalAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        CriminalArticlesMasterForm aform = (CriminalArticlesMasterForm)form;
        CriminalArticlesMasterDao adao = new CriminalArticlesMasterDao();
        boolean flag = adao.insertCriminalArticlesMaster(aform);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
