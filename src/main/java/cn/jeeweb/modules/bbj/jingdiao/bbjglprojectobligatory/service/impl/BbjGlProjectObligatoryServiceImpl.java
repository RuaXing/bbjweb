package cn.jeeweb.modules.bbj.jingdiao.bbjglprojectobligatory.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglprojectobligatory.mapper.BbjGlProjectObligatoryMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglprojectobligatory.entity.BbjGlProjectObligatory;
import cn.jeeweb.modules.bbj.jingdiao.bbjglprojectobligatory.service.IBbjGlProjectObligatoryService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 项目_债权
 * @Description: 项目_债权
 * @author somuns
 * @date 2018-01-24 23:07:47
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlProjectObligatoryService")
public class BbjGlProjectObligatoryServiceImpl  extends CommonServiceImpl<BbjGlProjectObligatoryMapper,BbjGlProjectObligatory> implements  IBbjGlProjectObligatoryService {

}
