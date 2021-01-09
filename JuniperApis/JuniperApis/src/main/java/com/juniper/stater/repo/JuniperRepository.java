package com.juniper.stater.repo;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.juniper.stater.model.NomineeEntity;

@Repository
public class JuniperRepository {
	@Autowired
	JdbcTemplate template;

	/* Getting all Items from table */
	public List<NomineeEntity> getAllForms() {
		List<NomineeEntity> items = template.query("select * from awardbyuser",
				(result, rowNum) -> new NomineeEntity(result.getInt("formid"), result.getDate("data_time"),
						result.getString("nominee"), result.getString("nominator"), result.getString("nomineeemail"),
						result.getString("awardcode"), result.getInt("point"), result.getString("formstatus"),
						result.getString("typeteamorindv"), result.getInt("approvallevel"),
						result.getInt("whichstageapprovalnow"), result.getString("approval")));
		return items;
	}

	public NomineeEntity getform(int formid) {
		String query = "SELECT * FROM awardbyuser WHERE formid=" + formid;
		NomineeEntity item = template.queryForObject(query,
				(result, rowNum) -> new NomineeEntity(result.getInt("formid"), result.getDate("data_time"),
						result.getString("nominee"), result.getString("nominator"), result.getString("nomineeemail"),
						result.getString("awardcode"), result.getInt("point"), result.getString("formstatus"),
						result.getString("typeteamorindv"), result.getInt("approvallevel"),
						result.getInt("whichstageapprovalnow"), result.getString("approval")));

		// we can yous later on
//				new Object[] { formid },
//				new BeanPropertyRowMapper<>(NomineeEntity.class));

		return item;
	}

// ,,Date date_time,
	public int addForm(int formId, String nominee, String nominator, String nomineeemail, String awardcode, int point,
			String formstatus, String typeteamorindv, int approvallevel, int whichstageapprovalnow, String approval) {
		String query = "INSERT INTO awardbyuser(formid,nominee,nominator,nomineeemail,awardcode,point,formstatus,typeteamorindv"
				+ ",approvallevel,whichstageapprovalnow,approval) VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		return template.update(query, formId, nominee, nominator, nomineeemail, awardcode, point, formstatus,
				typeteamorindv, approvallevel, whichstageapprovalnow, approval);
	}

	/* delete an item from database */
	public int deleteForm(int id) {
		String query = "DELETE FROM awardbyuser WHERE formid =?";
		return template.update(query, id);
	}
}
