package cn.jeeweb.modules.bbj.jingdiao.bbjglzqzwr.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqzwr.mapper.BbjGlZqZwrMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqzwr.entity.BbjGlZqZwr;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqzwr.service.IBbjGlZqZwrService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权_债务人
 * @Description: 债权_债务人
 * @author even
 * @date 2018-01-28 14:30:57
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZqZwrService")
public class BbjGlZqZwrServiceImpl  extends CommonServiceImpl<BbjGlZqZwrMapper,BbjGlZqZwr> implements  IBbjGlZqZwrService {

}
