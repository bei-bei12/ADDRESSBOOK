package com.dice.backend.service.impl.user.bot;

import com.dice.backend.mapper.BotMapper;
import com.dice.backend.pojo.Bot;
import com.dice.backend.pojo.User;
import com.dice.backend.service.impl.utils.UserDetailsImpl;
import com.dice.backend.service.user.bot.AddService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Service
public class AddServiceImpl implements AddService {

    @Autowired
    private BotMapper botMapper;

    @Override
    public Map<String, String> add(Map<String, String> data) {
        UsernamePasswordAuthenticationToken authenticationToken =
                (UsernamePasswordAuthenticationToken) SecurityContextHolder.getContext().getAuthentication();
        UserDetailsImpl loginUser = (UserDetailsImpl) authenticationToken.getPrincipal();
        User user = loginUser.getUser();

        String title = data.get("title");
        String description = data.get("description");
        String content = data.get("content");

        Map<String, String> map = new HashMap<>();

        if (title == null || title.length() == 0) {
            map.put("error_message", "联系人姓名不能为空");
            return map;
        }

        if (title.length() > 100) {
            map.put("error_message", "联系人姓名长度不能大于100");
            return map;
        }


        if (description.length() != 11) {
            map.put("error_message", "电话号码长度必须为11位");
            return map;
        }

        if (description == null || description.length() == 0) {
            map.put("error_message", "电话号码不能为空");
            return map;
        }



        Date now = new Date();
        Bot bot = new Bot(null, user.getId(), title, description, content, 1500, now, now);

        botMapper.insert(bot);
        map.put("error_message", "success");

        return map;
    }
}
