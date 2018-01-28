package cn.jeeweb.modules.bbj.jingdiao.bbjglzqssxx.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqssxx.mapper.BbjGlClaimsLitigationInfoMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqssxx.entity.BbjGlClaimsLitigationInfo;
import cn.jeeweb.modules.bbj.jingdiao.bbjglzqssxx.service.IBbjGlClaimsLitigationInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权_诉讼信息
 * @Description: 债权_诉讼信息
 * @author somuns
 * @date 2018-01-28 14:34:11
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlClaimsLitigationInfoService")
public class BbjGlClaimsLitigationInfoServiceImpl  extends CommonServiceImpl<BbjGlClaimsLitigationInfoMapper,BbjGlClaimsLitigationInfo> implements  IBbjGlClaimsLitigationInfoService {

}
