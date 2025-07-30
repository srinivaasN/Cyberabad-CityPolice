package com.dts.project.action;

import com.dts.ManagePrison.dao.ParoleDao;
import com.dts.ManagePrison.model.ParolForm;
import com.dts.core.util.CoreList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class viewParoleAction extends Action
{

    public viewParoleAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        ParolForm paroleform = (ParolForm)form;
        ParoleDao adao = new ParoleDao();
        CoreList acorelist = adao.viewParols();
        int size = acorelist.size();
        if(size > 0)
        {
            request.setAttribute("ViewParoles", acorelist);
            return mapping.findForward("ViewParoles");
        } else
        {
            return mapping.findForward("norecords");
        }
    }
}
