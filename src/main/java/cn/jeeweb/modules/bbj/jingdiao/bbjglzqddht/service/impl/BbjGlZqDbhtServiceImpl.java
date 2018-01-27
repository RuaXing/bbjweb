package cn.jeeweb.modules.bbj.jingdiao.bbjglzqddht.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqddht.mapper.BbjGlZqDbhtMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqddht.entity.BbjGlZqDbht;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqddht.service.IBbjGlZqDbhtService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权_担保合同
 * @Description: 债权_担保合同
 * @author even
 * @date 2018-01-27 17:59:05
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZqDbhtService")
public class BbjGlZqDbhtServiceImpl  extends CommonServiceImpl<BbjGlZqDbhtMapper,BbjGlZqDbht> implements  IBbjGlZqDbhtService {

}
