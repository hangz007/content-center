package com.itmuch.contentcenter;

import com.itmuch.contentcenter.dao.content.ShareMapper;
import com.itmuch.contentcenter.domain.entity.content.Share;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.Date;
import java.util.List;

@RestController
public class TestController {

    @Resource
    private ShareMapper shareMapper;

    @GetMapping("/test")
    public List<Share> testInsert() {
        Share share = new Share();
        share.setCreateTime(new Date());
        share.setUpdateTime(new Date());
        share.setTitle("xxx");
        share.setCover("xxxx");
        share.setAuthor("大目");
        share.setAuthor("xxxxx");
        share.setUserId(1);
        this.shareMapper.insertSelective(share);
        List<Share> shares = shareMapper.selectAll();
        return shares;
    }

}
