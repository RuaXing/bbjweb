package cn.jeeweb.modules.bbj.jingdiao.bbjglpropkgoblright.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjglpropkgoblright.mapper.BbjGlProPkgOblRightMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjglpropkgoblright.entity.BbjGlProPkgOblRight;
import cn.jeeweb.modules.bbj.jingdiao.bbjglpropkgoblright.service.IBbjGlProPkgOblRightService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 资产包_债权
 * @Description: 资产包_债权
 * @author even
 * @date 2018-01-27 20:16:37
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjGlProPkgOblRightService")
public class BbjGlProPkgOblRightServiceImpl  extends CommonServiceImpl<BbjGlProPkgOblRightMapper,BbjGlProPkgOblRight> implements  IBbjGlProPkgOblRightService {

}
