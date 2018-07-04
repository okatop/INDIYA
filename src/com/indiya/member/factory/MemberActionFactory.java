package com.indiya.member.factory;

import com.indiya.action.Action;
import com.indiya.action.member.MemberIdCheckAction;
import com.indiya.action.member.MemberIdSearchAction;
import com.indiya.action.member.MemberModifyAction;
import com.indiya.action.member.MemberZipAction;
import com.indiya.action.member.MusicianChangeAction;

public class MemberActionFactory {

	private static Action memberIdCheckAction;
	private static Action memberIdSearchAction;
	private static Action memberZipAction;
	private static Action memberModifyAction;
	private static Action memberRegisterAction;
	private static Action musicianChangeAction;
	
	static {
		memberIdSearchAction = MemberIdSearchAction.getMemberIdSearchAction();
		memberIdCheckAction = MemberIdCheckAction.getMemberIdCheckAction();
		memberZipAction = MemberZipAction.getMemberZipAction();
		memberModifyAction = MemberModifyAction.getMemberModifyAction();
		musicianChangeAction = MusicianChangeAction.getMusicianChangeAction();
	}

	public static Action getMemberIdCheckAction() {
		return memberIdCheckAction;
	}

	public static Action getMemberZipAction() {
		return memberZipAction;
	}

	public static Action getMemberModifyAction() {
		return memberModifyAction;
	}

	public static Action getMemberIdSearchAction() {
		return memberIdSearchAction;
	}

	public static Action getMemberRegisterAction() {
		return memberRegisterAction;
	}

	public static Action getMusicianChangeAction() {
		return musicianChangeAction;
	}
}
