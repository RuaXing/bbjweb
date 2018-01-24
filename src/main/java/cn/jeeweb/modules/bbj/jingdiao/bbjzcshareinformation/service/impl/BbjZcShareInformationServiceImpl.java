package cn.jeeweb.modules.bbj.jingdiao.bbjzcshareinformation.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcshareinformation.mapper.BbjZcShareInformationMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcshareinformation.entity.BbjZcShareInformation;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcshareinformation.service.IBbjZcShareInformationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 股权信息
 * @Description: 股权信息
 * @author somuns
 * @date 2018-01-24 19:17:58
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcShareInformationService")
public class BbjZcShareInformationServiceImpl  extends CommonServiceImpl<BbjZcShareInformationMapper,BbjZcShareInformation> implements  IBbjZcShareInformationService {

}
