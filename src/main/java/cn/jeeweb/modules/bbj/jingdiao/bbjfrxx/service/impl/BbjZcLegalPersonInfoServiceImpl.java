package cn.jeeweb.modules.bbj.jingdiao.bbjfrxx.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjfrxx.mapper.BbjZcLegalPersonInfoMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjfrxx.entity.BbjZcLegalPersonInfo;
import cn.jeeweb.modules.bbj.jingdiao.bbjfrxx.service.IBbjZcLegalPersonInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 法人信息
 * @Description: 法人信息
 * @author lqz
 * @date 2018-01-28 14:22:39
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcLegalPersonInfoService")
public class BbjZcLegalPersonInfoServiceImpl  extends CommonServiceImpl<BbjZcLegalPersonInfoMapper,BbjZcLegalPersonInfo> implements  IBbjZcLegalPersonInfoService {

}
