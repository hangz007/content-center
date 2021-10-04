package com.itmuch.contentcenter.controller.content;

import com.itmuch.contentcenter.domain.dto.content.ShareDTO;
import com.itmuch.contentcenter.service.content.ShareService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/shares")
public class ShareController {

    @Resource
    private ShareService shareService;

    @GetMapping("{id}")
    public ShareDTO findBYId(@PathVariable Integer id) {
       return shareService.findById(id);
    }

}
