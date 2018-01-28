package cn.jeeweb.modules.bbj.jingdiao.bbjglzrrgs.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzrrgs.mapper.BbjGlZrrGsMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzrrgs.entity.BbjGlZrrGs;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzrrgs.service.IBbjGlZrrGsService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 自然人_公司
 * @Description: 自然人_公司
 * @author lqz
 * @date 2018-01-28 14:33:04
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZrrGsService")
public class BbjGlZrrGsServiceImpl  extends CommonServiceImpl<BbjGlZrrGsMapper,BbjGlZrrGs> implements  IBbjGlZrrGsService {

}
