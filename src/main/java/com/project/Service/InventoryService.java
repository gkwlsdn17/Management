package com.project.Service;

import java.util.List;

import com.project.DTO.IGroup;
import com.project.DTO.Location;

public interface InventoryService {

	List<Location> getLocationList() throws Exception;

	List<IGroup> getGroupList() throws Exception;

	int locationInsert(Location location) throws Exception;

	int igroupInsert(IGroup igroup) throws Exception;
}