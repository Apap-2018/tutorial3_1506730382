package com.apap.tutorial3.service;

import java.util.List;

import com.apap.tutorial3.model.PilotModel;

public interface PilotService {
	void addPilot (PilotModel pilot);
	List<PilotModel> getPilotList();
	PilotModel getPilotDetailByLicenseNumber(String licenseNumber);
	boolean searchByLicenseNumber(String licenseNumber);
	void updateFlyHours (String licenseNumber, int flyHours);
	void deletePilot (String id);
}
