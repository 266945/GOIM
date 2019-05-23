package ec.mark.im.common.base;

import io.jboot.db.model.JbootModel;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by Jboot, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseGroups<M extends BaseGroups<M>> extends JbootModel<M> implements IBean {

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setGroupName(java.lang.String groupName) {
		set("group_name", groupName);
	}
	
	public java.lang.String getGroupName() {
		return getStr("group_name");
	}

	public void setGroupAvatar(java.lang.String groupAvatar) {
		set("group_avatar", groupAvatar);
	}
	
	public java.lang.String getGroupAvatar() {
		return getStr("group_avatar");
	}

	public void setGroupSign(java.lang.String groupSign) {
		set("group_sign", groupSign);
	}
	
	public java.lang.String getGroupSign() {
		return getStr("group_sign");
	}

	public void setGroupStatus(java.lang.Integer groupStatus) {
		set("group_status", groupStatus);
	}
	
	public java.lang.Integer getGroupStatus() {
		return getInt("group_status");
	}

	public void setCreateTime(java.util.Date createTime) {
		set("create_time", createTime);
	}
	
	public java.util.Date getCreateTime() {
		return get("create_time");
	}

	public void setUpdaeTime(java.util.Date updaeTime) {
		set("updae_time", updaeTime);
	}
	
	public java.util.Date getUpdaeTime() {
		return get("updae_time");
	}

}
