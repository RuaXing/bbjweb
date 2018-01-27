package cn.jeeweb.modules.bbj.jingdiao.bbjglzqjkht.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqjkht.mapper.BbjGlZqJkhtMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqjkht.entity.BbjGlZqJkht;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqjkht.service.IBbjGlZqJkhtService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权_借款合同
 * @Description: 债权_借款合同
 * @author even
 * @date 2018-01-28 00:43:35
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlZqJkhtService")
public class BbjGlZqJkhtServiceImpl  extends CommonServiceImpl<BbjGlZqJkhtMapper,BbjGlZqJkht> implements  IBbjGlZqJkhtService {

}
