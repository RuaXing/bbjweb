package cn.jeeweb.modules.bbj.jingdiao.bbjgqxx.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjgqxx.mapper.BbjZcShareInformationMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjgqxx.entity.BbjZcShareInformation;
import cn.jeeweb.modules.bbj.jingdiao.bbjgqxx.service.IBbjZcShareInformationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 股权信息
 * @Description: 股权信息
 * @author somuns
 * @date 2018-01-28 14:23:00
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcShareInformationService")
public class BbjZcShareInformationServiceImpl  extends CommonServiceImpl<BbjZcShareInformationMapper,BbjZcShareInformation> implements  IBbjZcShareInformationService {

}
