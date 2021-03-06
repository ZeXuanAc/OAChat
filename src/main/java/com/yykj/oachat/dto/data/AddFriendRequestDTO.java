package com.yykj.oachat.dto.data;

import java.util.Date;

/**
 * Created by Lee on 2017/11/23.
 */
public class AddFriendRequestDTO {

    private Long fromUserId;

    private String fromUsername;

    private String fromNickName;

    private String fromIcon;

    private String fromGender;

    private Long toUserId;

    private Long sendTime;

    private Boolean accepted;

    public Boolean getAccepted() {
        return accepted;
    }

    public void setAccepted(Boolean accepted) {
        this.accepted = accepted;
    }

    public Long getFromUserId() {
        return fromUserId;
    }

    public void setFromUserId(Long fromUserId) {
        this.fromUserId = fromUserId;
    }

    public String getFromUsername() {
        return fromUsername;
    }

    public void setFromUsername(String fromUsername) {
        this.fromUsername = fromUsername;
    }

    public String getFromNickName() {
        return fromNickName;
    }

    public void setFromNickName(String fromNickName) {
        this.fromNickName = fromNickName;
    }

    public String getFromIcon() {
        return fromIcon;
    }

    public void setFromIcon(String fromIcon) {
        this.fromIcon = fromIcon;
    }

    public String getFromGender() {
        return fromGender;
    }

    public void setFromGender(String fromGender) {
        this.fromGender = fromGender;
    }

    public Long getToUserId() {
        return toUserId;
    }

    public void setToUserId(Long toUserId) {
        this.toUserId = toUserId;
    }

    public Long getSendTime() {
        return sendTime;
    }

    public void setSendTime(Long sendTime) {
        this.sendTime = sendTime;
    }
}
