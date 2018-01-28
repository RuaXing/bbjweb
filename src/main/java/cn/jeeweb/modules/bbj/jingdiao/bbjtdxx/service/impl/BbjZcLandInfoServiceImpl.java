package cn.jeeweb.modules.bbj.jingdiao.bbjtdxx.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjtdxx.mapper.BbjZcLandInfoMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjtdxx.entity.BbjZcLandInfo;
import cn.jeeweb.modules.bbj.jingdiao.bbjtdxx.service.IBbjZcLandInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 土地信息
 * @Description: 土地信息
 * @author harvey
 * @date 2018-01-28 14:10:00
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcLandInfoService")
public class BbjZcLandInfoServiceImpl  extends CommonServiceImpl<BbjZcLandInfoMapper,BbjZcLandInfo> implements  IBbjZcLandInfoService {

}
