package cn.jeeweb.modules.bbj.jingdiao.bbjglxmzq.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglxmzq.mapper.BbjGlProjectObligatoryMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglxmzq.entity.BbjGlProjectObligatory;
import cn.jeeweb.modules.bbj.jingdiao.bbjglxmzq.service.IBbjGlProjectObligatoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 项目_债权
 * @Description: 项目_债权
 * @author somuns
 * @date 2018-01-28 14:14:05
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlProjectObligatoryService")
public class BbjGlProjectObligatoryServiceImpl  extends CommonServiceImpl<BbjGlProjectObligatoryMapper,BbjGlProjectObligatory> implements  IBbjGlProjectObligatoryService {

}
