package com.graction.lumi.model.db;

public class FineDustTable {
	private int fineDust_index, fineDust_min, fineDust_max, fineDust_background_ref_file_index, fineDust_character_ref_file_index, fineDust_effect_ref_file_index;;
	private String fineDust_grade, fineDust_activation;
	
	public FineDustTable() {
		super();
	}

	public FineDustTable(int fineDust_index, int fineDust_min, int fineDust_max, int fineDust_background_ref_file_index, int fineDust_character_ref_file_index, int fineDust_effect_ref_file_index, String fineDust_grade, String fineDust_activation) {
		this.fineDust_index = fineDust_index;
		this.fineDust_min = fineDust_min;
		this.fineDust_max = fineDust_max;
		this.fineDust_background_ref_file_index = fineDust_background_ref_file_index;
		this.fineDust_character_ref_file_index = fineDust_character_ref_file_index;
		this.fineDust_effect_ref_file_index = fineDust_effect_ref_file_index;
		this.fineDust_grade = fineDust_grade;
		this.fineDust_activation = fineDust_activation;
	}
	
	public FineDustTable(int fineDust_background_ref_file_index, int fineDust_character_ref_file_index, int fineDust_effect_ref_file_index) {
		this.fineDust_background_ref_file_index = fineDust_background_ref_file_index;
		this.fineDust_character_ref_file_index = fineDust_character_ref_file_index;
		this.fineDust_effect_ref_file_index = fineDust_effect_ref_file_index;
	}

	public int getFineDust_index() {
		return fineDust_index;
	}
	public void setFineDust_index(int fineDust_index) {
		this.fineDust_index = fineDust_index;
	}
	public int getFineDust_min() {
		return fineDust_min;
	}
	public void setFineDust_min(int fineDust_min) {
		this.fineDust_min = fineDust_min;
	}
	public int getFineDust_max() {
		return fineDust_max;
	}
	public void setFineDust_max(int fineDust_max) {
		this.fineDust_max = fineDust_max;
	}
	public String getFineDust_grade() {
		return fineDust_grade;
	}
	public void setFineDust_grade(String fineDust_grade) {
		this.fineDust_grade = fineDust_grade;
	}
	public int getFineDust_background_ref_file_index() {
		return fineDust_background_ref_file_index;
	}
	public void setFineDust_background_ref_file_index(int fineDust_background_ref_file_index) {
		this.fineDust_background_ref_file_index = fineDust_background_ref_file_index;
	}
	public int getFineDust_character_ref_file_index() {
		return fineDust_character_ref_file_index;
	}
	public void setFineDust_character_ref_file_index(int fineDust_character_ref_file_index) {
		this.fineDust_character_ref_file_index = fineDust_character_ref_file_index;
	}
	public int getFineDust_effect_ref_file_index() {
		return fineDust_effect_ref_file_index;
	}
	public void setFineDust_effect_ref_file_index(int fineDust_effect_ref_file_index) {
		this.fineDust_effect_ref_file_index = fineDust_effect_ref_file_index;
	}
	
	public String getFineDust_activation() {
		return fineDust_activation;
	}

	public void setFineDust_activation(String fineDust_activation) {
		this.fineDust_activation = fineDust_activation;
	}

	@Override
	public String toString() {
		return "FineDustTable [fineDust_index=" + fineDust_index + ", fineDust_min=" + fineDust_min + ", fineDust_max="
				+ fineDust_max + ", fineDust_background_ref_file_index=" + fineDust_background_ref_file_index
				+ ", fineDust_character_ref_file_index=" + fineDust_character_ref_file_index
				+ ", fineDust_effect_ref_file_index=" + fineDust_effect_ref_file_index + ", fineDust_grade="
				+ fineDust_grade + ", fineDust_activation=" + fineDust_activation + "]";
	}

}
