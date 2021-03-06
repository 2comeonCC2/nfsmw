package com.ea.eamobile.nfsmw.model.bean;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import com.ea.eamobile.nfsmw.utils.CommonUtil;

public class RechargeDataBean implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public int id = 0;
	public String transactionId = "";
	public String name = "";
	public int expense = 0;
	public int vipId = 0;
	public int lastTime = 0;
	private List<RewardBean> rewardList = new ArrayList<RewardBean>();
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getExpense() {
		return expense;
	}
	public void setExpense(int expense) {
		this.expense = expense;
	}
	public List<RewardBean> getRewardList() {
		return rewardList;
	}
	public void setRewardList(List<RewardBean> rewardList) {
		this.rewardList = rewardList;
	}
	public int getVipId() {
		return vipId;
	}
	public void setVipId(int vipId) {
		this.vipId = vipId;
	}
	public int getLastTime() {
		return lastTime;
	}
	public void setLastTime(int lastTime) {
		this.lastTime = lastTime;
	}
	public String toJson() {
		JSONObject json = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		try {
			json.put("id", id);
			json.put("transactionId", transactionId);
			json.put("name", name);
			json.put("expense", expense);
			json.put("vipId", vipId);
			json.put("lastTime", lastTime);
			for (RewardBean reward : rewardList) {
				jsonArray.put(reward.toJsonObject());
			}
			json.put("rewardList", jsonArray);
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return json.toString();
	}
	public static RechargeDataBean fromJson(String rechargeInfoStr) {
		if (rechargeInfoStr == null)
			return null;
		RechargeDataBean recharge = new RechargeDataBean();
		JSONObject json = null;
		try {
			json = new JSONObject(rechargeInfoStr);
		} catch (JSONException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		recharge.setId(CommonUtil.jsonGetInt(json, "id"));
		recharge.setTransactionId(CommonUtil.jsonGetString(json, "transactionId"));
		recharge.setName(CommonUtil.jsonGetString(json, "name"));
		recharge.setExpense(CommonUtil.jsonGetInt(json, "expense"));
		recharge.setVipId(CommonUtil.jsonGetInt(json, "vipId"));
		recharge.setLastTime(CommonUtil.jsonGetInt(json, "lastTime"));
		
		List<RewardBean> rewardList = new ArrayList<RewardBean>();
		JSONArray lotteryRewardArray = CommonUtil.jsonGetArray(json, "rewardList");
		for (int i = 0;i < lotteryRewardArray.length(); ++i) {
			String rewardStr = "";
			try {
				rewardStr = lotteryRewardArray.getString(i);
			} catch (JSONException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			RewardBean reward = RewardBean.fromJson(rewardStr);
			rewardList.add(reward);
		}
		recharge.setRewardList(rewardList);

		return recharge;
	}
}
