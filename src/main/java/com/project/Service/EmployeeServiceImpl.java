package com.project.Service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.DAO.EmployeeDAO;
import com.project.DTO.Employee;
import com.project.DTO.Position;
import com.project.DTO.SearchCondition;
import com.project.DTO.Team;
import com.project.DTO.User;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	@Autowired
	private EmployeeDAO employeeDao;
	
	@Override
	public int insertEmployee(Employee employee) throws Exception{
		return employeeDao.insertEmployee(employee);
	}
	
	@Override
	public List<Employee> getList() throws Exception{
		return employeeDao.selectEmployee();
	}
	
	@Override
	public List<Employee> getPage(SearchCondition sc) throws Exception{
		return employeeDao.selectPage(sc);
	}
	
	@Override
	public int getCount(SearchCondition sc) throws Exception{
		return employeeDao.count(sc);
	}

	@Override
	public List<Team> getTeamList() throws Exception {
		return employeeDao.selectTeamAll();
	}

	@Override
	public int teamInsert(Team team) throws Exception{
		return employeeDao.teamInsert(team);
	}
	
	@Override
	public List<Position> getPositionList() throws Exception {
		return employeeDao.selectPositionAll();
	}

	@Override
	public int getTeamCount(SearchCondition sc) throws Exception {
		return employeeDao.teamCount(sc);
	}

	@Override
	public List<Team> getTeamList(SearchCondition sc) throws Exception {
		return employeeDao.selectTeam(sc);
	}
	
	@Override
	public int removeEmployee(Integer EmployeeEno) throws Exception{
		return employeeDao.removeEmployee(EmployeeEno);
	}

	@Override
	public List<Employee> getTeamMember(SearchCondition sc) throws Exception {
		return employeeDao.selectTeamMember(sc);
	}

	@Override
	public int getTeamMemberCount(SearchCondition sc) throws Exception {
		return employeeDao.selectTeamMemberCnt(sc);
	}
	
	
}
