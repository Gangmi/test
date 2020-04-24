package model;

import java.util.ArrayList;

public interface RentDao {
	//렌트시에 구현되어야 할 기능들
	public String selectBytel(String tel)throws Exception; 
	public int rentVideo(String tel , String vnum)throws Exception;
	public int returnVideo(String vnum , String tel)throws Exception;
	public ArrayList<ArrayList> selectList()throws Exception ;
}
