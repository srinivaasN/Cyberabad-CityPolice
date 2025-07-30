package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalCaseRegisterForm;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.dae.dao.DBConnection;

//import com.dts.core.util.LoggerManager;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class CriminalCaseRegisterDetailsDao extends AbstractDataAccessObject {


            public boolean insertEmployeMaster(CriminalCaseRegisterForm aform, int n) {
/*  20*/        Connection con = null;
/*  21*/        boolean flag = false;
/*  24*/        try {
/*  24*/            con = new DBConnection().getConnection();
/*  25*/            PreparedStatement ps = con.prepareStatement("insert into CriminalCaseRegisterDetails values(?,?,?,?,?,?)");
/*  26*/            ps.setInt(1, n);
/*  27*/            ps.setString(2, aform.getCaseno());
/*  28*/            ps.setString(3, aform.getRemandno());
/*  29*/            ps.setString(4, aform.getConvectionno());
/*  30*/            ps.setString(5, aform.getSectioncovered());
/*  31*/            ps.setString(6, aform.getCrimeperiod());
/*  32*/            int i = ps.executeUpdate();
/*  33*/            if (i > 0) {
/*  34*/                flag = true;
                    }
                }
/*  37*/        catch (Exception e) {
/*  39*/            e.printStackTrace();
                }
/*  43*/        try {
/*  43*/            con.close();
                }
/*  45*/        catch (Exception e) {
	                   e.printStackTrace();
/*  47*/           // LoggerManager.writeLogInfo(e);
                }
/*  50*/        return flag;
            }
}

