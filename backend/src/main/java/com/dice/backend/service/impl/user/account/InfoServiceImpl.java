package com.dice.backend.service.impl.user.account;

import com.dice.backend.pojo.User;
import com.dice.backend.service.impl.utils.UserDetailsImpl;
import com.dice.backend.service.user.account.InfoService;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
// InfoService接口的具体实现，返回一个json数据，包含数据库各列信息
public class InfoServiceImpl implements InfoService {
    @Override
    public Map<String, String> getinfo() {
        // 背过即可，暂且不需要了解原理
        UsernamePasswordAuthenticationToken authentication =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();

        UserDetailsImpl loginUser = (UserDetailsImpl) authentication.getPrincipal();
        // 返回pojo层的一个对象
        User user = loginUser.getUser();

        Map<String, String> map = new HashMap<>();
        map.put("error_message", "success");
        map.put("id", user.getId().toString());
        map.put("username", user.getUsername());
        map.put("photo", user.getPhoto());

        return map;

    }
}
