package com.dts.ManagePrison.dao;

import com.dts.ManagePrison.model.CriminalDutyDetails;
import com.dts.core.dao.AbstractDataAccessObject;
import com.dts.core.util.CoreList;
import com.dts.dae.dao.DBConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class CriminalDutyDetailsDao extends AbstractDataAccessObject {


            public boolean insertCriminalDuty(CriminalDutyDetails cdform) {
/*  17*/        Connection con = null;
/*  18*/        boolean flag = false;
/*  21*/        try {
/*  21*/            con = new DBConnection().getConnection();
/*  22*/            PreparedStatement ps = con.prepareStatement("insert into CriminalDutyDetails values(?,?,?)");
/*  23*/            ps.setInt(1, cdform.getCriminaldutyid());
/*  24*/            ps.setString(2, cdform.getCriminalname());
/*  25*/            ps.setString(3, cdform.getRemarks());
/*  26*/            int i = ps.executeUpdate();
/*  27*/            if (i > 0) {
/*  28*/                flag = true;
                    }
                }
/*  30*/        catch (Exception e) {
/*  32*/            e.printStackTrace();
                }
/*  34*/        return flag;
            }

            public String ViewCriminalDuty() {
/*  39*/        CoreList v = new CoreList();
/*  40*/        Connection con = null;
/*  41*/        CriminalDutyDetails cdform = null;
/*  42*/        String remark = "";
/*  45*/        try {
/*  45*/            con = new DBConnection().getConnection();
/*  46*/            Statement st = con.createStatement();
/*  47*/            for (ResultSet rs = st.executeQuery("select Remarks from CriminalDutyDetails"); rs.next();) {
/*  48*/                remark = rs.getString(1);
                    }

                }
/*  51*/        catch (Exception e) {
/*  53*/            e.printStackTrace();
                }
/*  55*/        return remark;
            }
}

