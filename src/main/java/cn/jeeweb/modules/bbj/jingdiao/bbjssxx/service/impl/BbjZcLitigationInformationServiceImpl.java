package cn.jeeweb.modules.bbj.jingdiao.bbjssxx.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjssxx.mapper.BbjZcLitigationInformationMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjssxx.entity.BbjZcLitigationInformation;
import cn.jeeweb.modules.bbj.jingdiao.bbjssxx.service.IBbjZcLitigationInformationService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 诉讼信息
 * @Description: 诉讼信息
 * @author somuns
 * @date 2018-01-28 14:07:00
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcLitigationInformationService")
public class BbjZcLitigationInformationServiceImpl  extends CommonServiceImpl<BbjZcLitigationInformationMapper,BbjZcLitigationInformation> implements  IBbjZcLitigationInformationService {

}
