package com.dts.project.action;

import com.dts.ManagePrison.dao.ParoleDao;
import com.dts.ManagePrison.model.ParolForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ParoleAction extends Action
{

    public ParoleAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        ParolForm paroleform = (ParolForm)form;
        ParoleDao adao = new ParoleDao();
        boolean flag = adao.register(paroleform);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}