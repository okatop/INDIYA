package com.indiya.factory;

import com.indiya.action.Action;
import com.indiya.action.musician.*;

public class MusicianFactory {

	private static Action musicianMusicWriteAction;
	private static Action musicianMusicModifyAction;
	private static Action musicianMusicDeleteAction;
	private static Action musicianShowMovieWriteAction;
	private static Action musicianShowMovieModifyAction;
	private static Action musicianShowMovieDeleteAction;
	private static Action musicianShowWriteAction;
	private static Action musicianShowModifyAction;
	private static Action musicianShowDeleteAction;
	private static Action musicianCommentWriteAction;
	private static Action musicianCommentModifyAction;
	private static Action musicianCommentDeleteAction;
	private static Action musicianMemberWriteAction;
	private static Action musicianMemberModifyAction;
	private static Action musicianMemberDeleteAction;

	static { 
		
		musicianMusicWriteAction = MusicianMusicWriteAction.getMusicianMusicWriteAction();
		musicianMusicModifyAction = MusicianMusicModifyAction.getMusicianMusicModifyAction();
		musicianMusicDeleteAction = MusicianMusicDeleteAction.getMusicianMusicDeleteAction();
		musicianShowMovieWriteAction = MusicianShowMovieWriteAction.getMusicianShowMovieWriteAction();
		musicianShowMovieModifyAction = MusicianShowMovieModifyAction.getMusicianShowMovieModifyAction();
		musicianShowMovieDeleteAction = MusicianShowMovieDeleteAction.getMusicianShowMovieDeleteAction();
		musicianShowWriteAction = MusicianShowWriteAction.getMusicianShowWriteAction();
		musicianShowModifyAction = MusicianShowModifyAction.getMusicianShowModifyAction();
		musicianShowDeleteAction = MusicianShowDeleteAction.getMusicianShowDeleteAction();
		musicianCommentWriteAction = MusicianCommentWriteAction.getMusicianCommentWriteAction();
		musicianCommentModifyAction = MusicianCommentModifyAction.getMusicianCommentModifyAction();
		musicianCommentDeleteAction = MusicianCommentDeleteAction.getMusicianCommentDeleteAction();
		musicianMemberWriteAction = MusicianMemberWriteAction.getMusicianMemberWriteAction();
		musicianMemberModifyAction = MusicianMemberModifyAction.getMusicianMemberModifyAction();
		musicianMemberDeleteAction = MusicianMemberDeleteAction.getMusicianMemberDeleteAction();
		

	}
	
	

	public static Action getMusicianMusicWriteAction() {
		return musicianMusicWriteAction;
	}


	public static Action getMusicianMusicModifyAction() {
		return musicianMusicModifyAction;
	}


	public static Action getMusicianMusicDeleteAction() {
		return musicianMusicDeleteAction;
	}


	public static Action getMusicianShowMovieWriteAction() {
		return musicianShowMovieWriteAction;
	}


	public static Action getMusicianShowMovieModifyAction() {
		return musicianShowMovieModifyAction;
	}


	public static Action getMusicianShowMovieDeleteAction() {
		return musicianShowMovieDeleteAction;
	}


	public static Action getMusicianShowWriteAction() {
		return musicianShowWriteAction;
	}


	public static Action getMusicianShowModifyAction() {
		return musicianShowModifyAction;
	}


	public static Action getMusicianShowDeleteAction() {
		return musicianShowDeleteAction;
	}


	public static Action getMusicianCommentWriteAction() {
		return musicianCommentWriteAction;
	}


	public static Action getMusicianCommentModifyAction() {
		return musicianCommentModifyAction;
	}


	public static Action getMusicianCommentDeleteAction() {
		return musicianCommentDeleteAction;
	}


	public static Action getMusicianMemberWriteAction() {
		return musicianMemberWriteAction;
	}


	public static Action getMusicianMemberModifyAction() {
		return musicianMemberModifyAction;
	}


	public static Action getMusicianMemberDeleteAction() {
		return musicianMemberDeleteAction;
	}
	
}
