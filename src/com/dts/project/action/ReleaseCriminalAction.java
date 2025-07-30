package com.dts.project.action;

import com.dts.ManagePrison.dao.ReleasedCriminalsDao;
import com.dts.ManagePrison.model.ReleasedCriminalsForm;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.*;

public class ReleaseCriminalAction extends Action {

	public ReleaseCriminalAction() {
	}

	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		ReleasedCriminalsForm aform = (ReleasedCriminalsForm) form;
		ReleasedCriminalsDao adao = new ReleasedCriminalsDao();
		boolean flag = adao.insertReleasedCriminals(aform);
		if (flag)
			return mapping.findForward("success");
		else
			return mapping.findForward("fail");
	}
}
