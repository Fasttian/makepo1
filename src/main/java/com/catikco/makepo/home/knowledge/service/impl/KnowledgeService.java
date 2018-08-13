package com.catikco.makepo.home.knowledge.service.impl;

import com.catikco.makepo.home.knowledge.model.KnowledgeListPageModel;

import java.util.Map;

/**
 * Create By: TianJiaXing @Gui Yang
 * Time: 2018/8/13  下午5:00
 * Description：
 */

public interface KnowledgeService {
    /**
     * 根据条件查处百科
     * @param queryCriteria
     * @return
     */
    public KnowledgeListPageModel getKnowledgeList(Map<String,Object> queryCriteria);

}
