package cn.jeeweb.modules.bbj.jingdiao.bbjfcxx.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjfcxx.mapper.BbjZcHouseInfoMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjfcxx.entity.BbjZcHouseInfo;
import cn.jeeweb.modules.bbj.jingdiao.bbjfcxx.service.IBbjZcHouseInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 房产信息
 * @Description: 房产信息
 * @author harvey
 * @date 2018-01-28 14:30:11
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcHouseInfoService")
public class BbjZcHouseInfoServiceImpl  extends CommonServiceImpl<BbjZcHouseInfoMapper,BbjZcHouseInfo> implements  IBbjZcHouseInfoService {

}
