package cn.jeeweb.modules.bbj.jingdiao.bbjglclaimslitigationinfo.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglclaimslitigationinfo.mapper.BbjGlClaimsLitigationInfoMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglclaimslitigationinfo.entity.BbjGlClaimsLitigationInfo;
import cn.jeeweb.modules.bbj.jingdiao.bbjglclaimslitigationinfo.service.IBbjGlClaimsLitigationInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权_诉讼信息
 * @Description: 债权_诉讼信息
 * @author somuns
 * @date 2018-01-24 22:58:09
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlClaimsLitigationInfoService")
public class BbjGlClaimsLitigationInfoServiceImpl  extends CommonServiceImpl<BbjGlClaimsLitigationInfoMapper,BbjGlClaimsLitigationInfo> implements  IBbjGlClaimsLitigationInfoService {

}
