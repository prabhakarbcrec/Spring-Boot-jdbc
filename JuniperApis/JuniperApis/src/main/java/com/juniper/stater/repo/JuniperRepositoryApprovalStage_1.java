package com.juniper.stater.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.juniper.stater.model.NomineeFormApprovalEntity;

@Repository
public class JuniperRepositoryApprovalStage_1 {
	@Autowired
	JdbcTemplate jdbcTemplate;

	/* Getting all Items from table */
	public List<NomineeFormApprovalEntity> getAllFormsFromApprocvalStage_1_service() {
		List<NomineeFormApprovalEntity> items = jdbcTemplate.query("select * from awardbyuserapproval_1",
				(result, rowNum) -> new NomineeFormApprovalEntity(result.getInt("formid"), result.getDate("data_time"),
						result.getString("nominee"), result.getString("nominator"), result.getString("nomineeemail"),
						result.getString("awardcode"), result.getInt("point"), result.getInt("approvallevel"),
						result.getString("approval")));
		return items;
	}

	public List<NomineeFormApprovalEntity> getformFromApprovalStage_1_service(String getForOnTheBasisOfApprovalString) {
		String query = "SELECT * FROM awardbyuserapproval_1 WHERE approval='" + getForOnTheBasisOfApprovalString + "'";
		List<NomineeFormApprovalEntity> items = (List<NomineeFormApprovalEntity>) jdbcTemplate.query(query,
				(result, rowNum) -> new NomineeFormApprovalEntity(result.getInt("formid"), result.getDate("data_time"),
						result.getString("nominee"), result.getString("nominator"), result.getString("nomineeemail"),
						result.getString("awardcode"), result.getInt("point"), result.getInt("approvallevel"),
						result.getString("approval")));
		return items;
	}

	public int approvOrRejectForm(int formid, String actionString) {

		String query = "update awardbyuserapproval_1 set approval='" + actionString + "' where formid='" + formid + "'";
		System.out.println("Query which you are running: " + query);
		return jdbcTemplate.update(query);

	}

}
