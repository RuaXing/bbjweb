package cn.jeeweb.modules.bbj.jingdiao.bbjzclitigationinformation.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzclitigationinformation.mapper.BbjZcLitigationInformationMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzclitigationinformation.entity.BbjZcLitigationInformation;
import cn.jeeweb.modules.bbj.jingdiao.bbjzclitigationinformation.service.IBbjZcLitigationInformationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 诉讼信息
 * @Description: 诉讼信息
 * @author somuns
 * @date 2018-01-24 19:50:28
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcLitigationInformationService")
public class BbjZcLitigationInformationServiceImpl  extends CommonServiceImpl<BbjZcLitigationInformationMapper,BbjZcLitigationInformation> implements  IBbjZcLitigationInformationService {

}
