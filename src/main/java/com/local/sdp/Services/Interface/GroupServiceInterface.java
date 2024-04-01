package com.local.sdp.Services.Interface;

import com.local.sdp.Entity.Group;

import java.util.List;

public interface GroupServiceInterface {
    void save(Group group);
    int delete(int id);
    List<Group> groupList();
    Group getGroupById(int id);
}
