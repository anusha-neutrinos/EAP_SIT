package com.myteam.tts_connected_claims;

/**
 * This class was automatically generated by the data modeler tool.
 */

@javax.persistence.Entity(name = "CaseStatusTable")
@javax.persistence.Table(name = "CaseStatusTable")
public class caseStatusBO implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@javax.persistence.GeneratedValue(strategy = javax.persistence.GenerationType.AUTO, generator = "CASESTATUSBO_ID_GENERATOR")
	@javax.persistence.Id
	@javax.persistence.SequenceGenerator(sequenceName = "CASESTATUSBO_ID_SEQ", name = "CASESTATUSBO_ID_GENERATOR")
	private java.lang.Long id;

	@org.kie.api.definition.type.Label("isReopenedCase")
	private java.lang.Boolean isReopenedCase;

	@org.kie.api.definition.type.Label("processInstanceId")
	private java.lang.Long processInstanceId;

	@org.kie.api.definition.type.Label("startDate")
	private java.lang.String startDate;

	public caseStatusBO() {
	}

	public java.lang.Long getId() {
		return this.id;
	}

	public void setId(java.lang.Long id) {
		this.id = id;
	}

	public java.lang.Boolean getIsReopenedCase() {
		return this.isReopenedCase;
	}

	public void setIsReopenedCase(java.lang.Boolean isReopenedCase) {
		this.isReopenedCase = isReopenedCase;
	}

	public java.lang.Long getProcessInstanceId() {
		return this.processInstanceId;
	}

	public void setProcessInstanceId(java.lang.Long processInstanceId) {
		this.processInstanceId = processInstanceId;
	}

	public java.lang.String getStartDate() {
		return this.startDate;
	}

	public void setStartDate(java.lang.String startDate) {
		this.startDate = startDate;
	}

	public caseStatusBO(java.lang.Long id, java.lang.Boolean isReopenedCase,
			java.lang.Long processInstanceId, java.lang.String startDate) {
		this.id = id;
		this.isReopenedCase = isReopenedCase;
		this.processInstanceId = processInstanceId;
		this.startDate = startDate;
	}

}