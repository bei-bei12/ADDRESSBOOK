package com.dice.backend.service.user.bot;

import java.util.Map;


// 删除一个bot
public interface RemoveService {
    Map<String, String> remove(Map<String, String> data);
}
