package cn.jeeweb.modules.bbj.bbjzchouseinfo.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.bbjzchouseinfo.mapper.BbjZcHouseInfoMapper;
import cn.jeeweb.modules.bbj.bbjzchouseinfo.entity.BbjZcHouseInfo;
import cn.jeeweb.modules.bbj.bbjzchouseinfo.service.IBbjZcHouseInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 房产信息
 * @Description: 房产信息
 * @author harvey
 * @date 2018-01-19 11:04:45
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcHouseInfoService")
public class BbjZcHouseInfoServiceImpl  extends CommonServiceImpl<BbjZcHouseInfoMapper,BbjZcHouseInfo> implements  IBbjZcHouseInfoService {

}
