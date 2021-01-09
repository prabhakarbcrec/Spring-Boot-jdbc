package com.juniper.stater.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.juniper.stater.model.NomineeFormApprovalEntity;

@Repository
public class JuniperRepositotyApprovalStage_2 {

	@Autowired
	JdbcTemplate jdbcTemplate;

	/* Getting all Items from table */
	public List<NomineeFormApprovalEntity> getAllFormsFromApprocvalStage_2_service() {
		List<NomineeFormApprovalEntity> forms = jdbcTemplate.query("select * from awardbyuserapproval_2",
				(result, rowNum) -> new NomineeFormApprovalEntity(result.getInt("formid"), result.getDate("data_time"),
						result.getString("nominee"), result.getString("nominator"), result.getString("nomineeemail"),
						result.getString("awardcode"), result.getInt("point"), result.getInt("approvallevel"),
						result.getString("approval")));
		return forms;
	}

	public List<NomineeFormApprovalEntity> getformFromApprovalStage_2_service(String getForOnTheBasisOfApprovalString) {
		String query = "SELECT * FROM awardbyuserapproval_2 WHERE approval='" + getForOnTheBasisOfApprovalString + "'";
		List<NomineeFormApprovalEntity> forms = (List<NomineeFormApprovalEntity>) jdbcTemplate.query(query,
				(result, rowNum) -> new NomineeFormApprovalEntity(result.getInt("formid"), result.getDate("data_time"),
						result.getString("nominee"), result.getString("nominator"), result.getString("nomineeemail"),
						result.getString("awardcode"), result.getInt("point"), result.getInt("approvallevel"),
						result.getString("approval")));
		return forms;
	}

	public int approvOrRejectForm(int formid, String actionString) {

		String query = "update awardbyuserapproval_2 set approval='" + actionString + "' where formid='" + formid + "'";
		System.out.println("Query which you are running: " + query);
		return jdbcTemplate.update(query);

	}



}
