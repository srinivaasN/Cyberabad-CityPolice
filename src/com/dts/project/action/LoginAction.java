package com.dts.project.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.dts.dae.dao.SecurityDAO;

public class LoginAction extends Action
{

    public LoginAction()
    {
    	System.out.println("entered into login action");
    }

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        HttpSession session = request.getSession();
        SecurityDAO sc=new SecurityDAO();
        String role=sc.loginCheck(username, password);
       // String role = (new SecurityDAO()).loginCheck(username, password);
        System.out.println((new StringBuilder("this is Role=")).append(role).toString());
        if(role.equals("Admin"))
        {
            System.out.println((new StringBuilder("this is Role=")).append(role).toString());
            session.setAttribute("user", username);
            session.setAttribute("role", role);
            return mapping.findForward("admin");
        }
        if(role.equals("Employee"))
        {
            session.setAttribute("user", username);
            session.setAttribute("role", role);
            return mapping.findForward("Employee");
        }
        if(role.equalsIgnoreCase("customer"))
        {
            session.setAttribute("user", username);
            session.setAttribute("role", role);
            return mapping.findForward("Customer");
        } else
        {
            return mapping.findForward("invalid");
        }
    }
}
