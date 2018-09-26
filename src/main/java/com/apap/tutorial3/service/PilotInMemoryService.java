package com.apap.tutorial3.service;

import java.util.ArrayList;
import java.util.List;


import com.apap.tutorial3.model.PilotModel;
import org.springframework.stereotype.Service;

@Service
public class PilotInMemoryService implements PilotService {
	private List<PilotModel> archivePilot;
	
	public PilotInMemoryService() {
		archivePilot = new ArrayList<>();
	}
	
	@Override
	public void addPilot(PilotModel pilot) {
		archivePilot.add(pilot);
	}
	
	@Override
	public List<PilotModel> getPilotList() {
		return archivePilot;
	}

	@Override
	public PilotModel getPilotDetailByLicenseNumber(String licenseNumber) {
		// TODO Auto-generated method stub
		PilotModel temp = null;
		for (PilotModel pilot : archivePilot) {
			if (pilot.getLicenseNumber().equals(licenseNumber)) {
				temp = pilot;
			}
		}
		return temp;
	}
	
	@Override
	public void updateFlyHours(String licenseNumber, int flyHours) {
		for (PilotModel pilot : archivePilot) {
			if (pilot.getLicenseNumber().equals(licenseNumber)) {
				pilot.setFlyHour(flyHours);
			}
		}
	}
	
	@Override
	public boolean searchByLicenseNumber(String licenseNumber) {
		boolean temp = false;
		for (PilotModel pilot : archivePilot) {
			if (pilot.getLicenseNumber().equals(licenseNumber)) {
				temp = true;
			}
		}
		return temp;
	}
	
	@Override
	public void deletePilot(String id) {
//		archivePilot.remove(id);
		for (PilotModel pilot : archivePilot) {
			if (pilot.getId().equals(id)) {
				archivePilot.remove(pilot);
			}
		}
	}
}
