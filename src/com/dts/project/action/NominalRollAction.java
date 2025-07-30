package com.dts.project.action;

import com.dts.ManagePrison.dao.NominalRoleMasterDao;
import com.dts.ManagePrison.model.NominalRoleMasterForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class NominalRollAction extends Action
{

    public NominalRollAction()
    {
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        NominalRoleMasterForm aform = (NominalRoleMasterForm)form;
        NominalRoleMasterDao adao = new NominalRoleMasterDao();
        boolean flag = adao.insertNominalRoleMaster(aform);
        if(flag)
            return mapping.findForward("success");
        else
            return mapping.findForward("fail");
    }
}
