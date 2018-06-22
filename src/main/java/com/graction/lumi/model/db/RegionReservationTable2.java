package com.graction.lumi.model.db;

public class RegionReservationTable2 {
	private int regionReservation_index
				, regionReservation_background_ref_file_index
				, regionReservation_character_ref_file_index
				, regionReservation_effect_ref_file_index;
	private String regionReservation_state
					, regionReservation_region
					, regionReservation_prioritization
					;
	private String regionReservation_set_time
					, regionReservation_active_time
					, regionReservation_end_time;

	public RegionReservationTable2() {
		
	}
	
	public RegionReservationTable2(int regionReservation_background_ref_file_index,
			int regionReservation_character_ref_file_index, int regionReservation_effect_ref_file_index,
			String regionReservation_region, String regionReservation_prioritization, String regionReservation_set_time,
			String regionReservation_active_time, String regionReservation_end_time) {
		this.regionReservation_background_ref_file_index = regionReservation_background_ref_file_index;
		this.regionReservation_character_ref_file_index = regionReservation_character_ref_file_index;
		this.regionReservation_effect_ref_file_index = regionReservation_effect_ref_file_index;
		this.regionReservation_region = regionReservation_region;
		this.regionReservation_prioritization = regionReservation_prioritization;
		this.regionReservation_set_time = regionReservation_set_time;
		this.regionReservation_active_time = regionReservation_active_time;
		this.regionReservation_end_time = regionReservation_end_time;
	}

	public RegionReservationTable2(int regionReservation_index, int regionReservation_background_ref_file_index,
			int regionReservation_character_ref_file_index, int regionReservation_effect_ref_file_index,
			String regionReservation_region, String regionReservation_prioritization, String regionReservation_set_time,
			String regionReservation_active_time, String regionReservation_end_time) {
		this.regionReservation_index = regionReservation_index;
		this.regionReservation_background_ref_file_index = regionReservation_background_ref_file_index;
		this.regionReservation_character_ref_file_index = regionReservation_character_ref_file_index;
		this.regionReservation_effect_ref_file_index = regionReservation_effect_ref_file_index;
		this.regionReservation_region = regionReservation_region;
		this.regionReservation_prioritization = regionReservation_prioritization;
		this.regionReservation_set_time = regionReservation_set_time;
		this.regionReservation_active_time = regionReservation_active_time;
		this.regionReservation_end_time = regionReservation_end_time;
	}
	
	public int getRegionReservation_index() {
		return regionReservation_index;
	}

	public void setRegionReservation_index(int regionReservation_index) {
		this.regionReservation_index = regionReservation_index;
	}

	public String getRegionReservation_region() {
		return regionReservation_region;
	}

	public void setRegionReservation_region(String regionReservation_region) {
		this.regionReservation_region = regionReservation_region;
	}

	public int getRegionReservation_background_ref_file_index() {
		return regionReservation_background_ref_file_index;
	}

	public void setRegionReservation_background_ref_file_index(int regionReservation_background_ref_file_index) {
		this.regionReservation_background_ref_file_index = regionReservation_background_ref_file_index;
	}

	public int getRegionReservation_character_ref_file_index() {
		return regionReservation_character_ref_file_index;
	}

	public void setRegionReservation_character_ref_file_index(int regionReservation_character_ref_file_index) {
		this.regionReservation_character_ref_file_index = regionReservation_character_ref_file_index;
	}

	public int getRegionReservation_effect_ref_file_index() {
		return regionReservation_effect_ref_file_index;
	}

	public void setRegionReservation_effect_ref_file_index(int regionReservation_effect_ref_file_index) {
		this.regionReservation_effect_ref_file_index = regionReservation_effect_ref_file_index;
	}

	public String getRegionReservation_state() {
		return regionReservation_state;
	}

	public void setRegionReservation_state(String regionReservation_state) {
		this.regionReservation_state = regionReservation_state;
	}

	public String getRegionReservation_set_time() {
		return regionReservation_set_time;
	}

	public void setRegionReservation_set_time(String regionReservation_set_time) {
		this.regionReservation_set_time = regionReservation_set_time;
	}

	public String getRegionReservation_active_time() {
		return regionReservation_active_time;
	}

	public void setRegionReservation_active_time(String regionReservation_active_time) {
		this.regionReservation_active_time = regionReservation_active_time;
	}

	public String getRegionReservation_end_time() {
		return regionReservation_end_time;
	}

	public void setRegionReservation_end_time(String regionReservation_end_time) {
		this.regionReservation_end_time = regionReservation_end_time;
	}

	public String getRegionReservation_prioritization() {
		return regionReservation_prioritization;
	}

	public void setRegionReservation_prioritization(String regionReservation_prioritization) {
		this.regionReservation_prioritization = regionReservation_prioritization;
	}

	@Override
	public String toString() {
		return "RegionReservationTable [regionReservation_index=" + regionReservation_index
				+ ", regionReservation_background_ref_file_index=" + regionReservation_background_ref_file_index
				+ ", regionReservation_character_ref_file_index=" + regionReservation_character_ref_file_index
				+ ", regionReservation_effect_ref_file_index=" + regionReservation_effect_ref_file_index
				+ ", regionReservation_state=" + regionReservation_state + ", regionReservation_region="
				+ regionReservation_region + ", regionReservation_prioritization=" + regionReservation_prioritization
				+ ", regionReservation_set_time=" + regionReservation_set_time + ", regionReservation_active_time="
				+ regionReservation_active_time + ", regionReservation_end_time=" + regionReservation_end_time + "]";
	}

}