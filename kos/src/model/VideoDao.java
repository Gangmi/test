package model;

import java.util.ArrayList;

import model.vo.Video;

public interface VideoDao {
	
	
	
	public void insertVideo(Video vo, int count) throws Exception;
	public ArrayList searchVideo(int index, String word) throws Exception; 
	public Video selectByPK(String vnum) throws Exception; 
	


}
