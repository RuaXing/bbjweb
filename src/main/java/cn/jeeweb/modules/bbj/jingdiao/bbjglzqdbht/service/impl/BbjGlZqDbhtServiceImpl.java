package cn.jeeweb.modules.bbj.jingdiao.bbjglzqdbht.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqdbht.mapper.BbjGlZqDbhtMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqdbht.entity.BbjGlZqDbht;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqdbht.service.IBbjGlZqDbhtService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权_担保合同
 * @Description: 债权_担保合同
 * @author even
 * @date 2018-01-28 00:48:13
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZqDbhtService")
public class BbjGlZqDbhtServiceImpl  extends CommonServiceImpl<BbjGlZqDbhtMapper,BbjGlZqDbht> implements  IBbjGlZqDbhtService {

}
