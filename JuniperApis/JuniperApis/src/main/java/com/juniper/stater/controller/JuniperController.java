package com.juniper.stater.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.juniper.stater.model.NomineeEntity;
import com.juniper.stater.model.NomineeFormApprovalEntity;
import com.juniper.stater.repo.JuniperRepository;
import com.juniper.stater.repo.JuniperRepositoryApprovalStage_1;
import com.juniper.stater.repo.JuniperRepositotyApprovalStage_2;

@RestController
public class JuniperController {
	@Autowired
	JuniperRepository juniperRepository;
	@Autowired
	JuniperRepositoryApprovalStage_1 juniperrepositoryapprovalstage_1;
	@Autowired
	JuniperRepositotyApprovalStage_2 juniperrepositoryapprovalstage_2;

	@RequestMapping("/getAllForms")
	@ResponseBody
	public List<NomineeEntity> getAllForms() {
		return juniperRepository.getAllForms();
	}

	@RequestMapping("/getForm")
	@ResponseBody
	public NomineeEntity getForm(@RequestParam("formid") int formid) {
		return juniperRepository.getform(formid);
	}

	// ,@RequestParam("date_time") Date date_time
	@RequestMapping("/addForm")
	@ResponseBody
	public String addForm(@RequestParam("formId") int formId, @RequestParam("nominee") String nominee,
			@RequestParam("nominator") String nominator, @RequestParam("nomineeemail") String nomineeemail,
			@RequestParam("awardcode") String awardcode, @RequestParam("point") int point,
			@RequestParam("formstatus") String formstatus, @RequestParam("typeteamorindv") String typeteamorindv,
			@RequestParam("approvallevel") int approvallevel,
			@RequestParam("whichstageapprovalnow") int whichstageapprovalnow,
			@RequestParam("approval") String approval) {
		if (juniperRepository.addForm(formId, nominee, nominator, nomineeemail, awardcode, point, formstatus,
				typeteamorindv, approvallevel, whichstageapprovalnow, approval) >= 1) {
			return "Form Added Successfully";
		} else {
			return "Something went wrong !";
		}
	}

	@RequestMapping("/deteteForm")
	@ResponseBody
	public String deteteForm(@RequestParam("formid") int formid) {
		if (juniperRepository.deleteForm(formid) >= 1) {
			return "form Deleted Successfully";
		} else {
			return "Something went wrong !";
		}
	}

// approval api we need to fatch, rejeted form approval_stage_1

	@RequestMapping("/getAllFormApprovalStage_1")
	@ResponseBody
	public List<NomineeFormApprovalEntity> getAllFormsFromApprovalStage_1() {
		return juniperrepositoryapprovalstage_1.getAllFormsFromApprocvalStage_1_service();
	}

	@RequestMapping("/getFormApprovalStage_1")
	@ResponseBody
	public List<NomineeFormApprovalEntity> getFormFormApprovalStage_1(
			@RequestParam("approvalCheckString") String approvalCheckString) {
		return juniperrepositoryapprovalstage_1.getformFromApprovalStage_1_service(approvalCheckString);

	}

	@RequestMapping("/updateFormApprovalStage_1")
	@ResponseBody
	public String updateFormApproval_stage_1(@RequestParam("formid") int formid,
			@RequestParam("actionString") String actionString) {
		if (juniperrepositoryapprovalstage_1.approvOrRejectForm(formid, actionString) >= 1) {
			return "form updated Successfully";
		} else {
			return "Something went wrong !";
		}
	}

	// approval api_stage_2 we need to fatch, rejeted form approval_stage_2
	@RequestMapping("/getAllFormApprovalStage_2")
	@ResponseBody
	public List<NomineeFormApprovalEntity> getAllFormsFromApprovalStage_2() {
		return juniperrepositoryapprovalstage_2.getAllFormsFromApprocvalStage_2_service();
	}

	@RequestMapping("/getFormApprovalStage_2")
	@ResponseBody
	public List<NomineeFormApprovalEntity> getFormFormApprovalStage_2(
			@RequestParam("approvalCheckString") String approvalCheckString) {
		return juniperrepositoryapprovalstage_2.getformFromApprovalStage_2_service(approvalCheckString);

	}

	@RequestMapping("/updateFormApprovalStage_2")
	@ResponseBody
	public String updateFormApproval_stage_2(@RequestParam("formid") int formid,
			@RequestParam("actionString") String actionString) {
		if (juniperrepositoryapprovalstage_2.approvOrRejectForm(formid, actionString) >= 1) {
			return "form updated Successfully";
		} else {
			return "Something went wrong !";
		}
	}

}
