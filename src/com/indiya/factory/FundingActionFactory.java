package com.indiya.factory;

import com.indiya.action.Action;
import com.indiya.action.funding.FundingBackingAction;
import com.indiya.action.funding.FundingDeleteAction;
import com.indiya.action.funding.FundingListAction;
import com.indiya.action.funding.FundingModifyAction;
import com.indiya.action.funding.FundingRewardListAction;
import com.indiya.action.funding.FundingStatusAction;
import com.indiya.action.funding.FundingViewAction;
import com.indiya.action.funding.FundingWriteAction;

public class FundingActionFactory {
	private static Action fundingListAction;
	private static Action fundingRewardListAction;
	private static Action fundingViewAction;
	private static Action fundingStatusAction;
	private static Action fundingWriteAction;
	private static Action fundingModifyAction;
	private static Action fundingDeleteAction;
	private static Action fundingBackingAction;

	static {
		fundingListAction = FundingListAction.getFundingListAction();
		fundingRewardListAction = FundingRewardListAction.getFundingRewardListAction();
		fundingViewAction = FundingViewAction.getFundingViewAction();
		fundingStatusAction = FundingStatusAction.getFundingStatusAction();
		fundingWriteAction = FundingWriteAction.getFundingWriteAction();
		fundingModifyAction = FundingModifyAction.getFundingModifyAction();
		fundingDeleteAction = FundingDeleteAction.getFundingDeleteAction();
		fundingBackingAction = FundingBackingAction.getFundingBackingAction();
	}

	public static Action getFundingListAction() {
		return fundingListAction;
	}

	public static Action getFundingRewardListAction() {
		return fundingRewardListAction;
	}

	public static Action getFundingViewAction() {
		return fundingViewAction;
	}

	public static Action getFundingStatusAction() {
		return fundingStatusAction;
	}

	public static Action getFundingWriteAction() {
		return fundingWriteAction;
	}

	public static Action getFundingModifyAction() {
		return fundingModifyAction;
	}

	public static Action getFundingDeleteAction() {
		return fundingDeleteAction;
	}

	public static Action getFundingBackingAction() {
		return fundingBackingAction;
	}

}
