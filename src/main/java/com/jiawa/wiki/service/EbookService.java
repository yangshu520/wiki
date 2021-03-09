package com.jiawa.wiki.service;

import com.jiawa.wiki.entity.Ebook;
import com.jiawa.wiki.entity.EbookExample;
import com.jiawa.wiki.mapper.EbookMapper;
import com.jiawa.wiki.req.EbookReq;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EbookService {
    @Autowired
    private EbookMapper ebookMapper;

    public List<Ebook> list(EbookReq req){
        //这两行都是固定的  内部类
        EbookExample ebookExample=new EbookExample();
        EbookExample.Criteria criteria=ebookExample.createCriteria();

        criteria.andNameLike("%"+req.getName()+"%");
        return ebookMapper.selectByExample(ebookExample);
    }
}
