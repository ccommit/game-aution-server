package com.ccommit.gameauctionserver.dto.user;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
public class RequestUserInfo {

    private int id;
    private String userId;

    private String nickname;
    private String phoneNumber;

    private int gold;
    private int userLevel;

    private UserType userType;

}
