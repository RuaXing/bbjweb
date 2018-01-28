package cn.jeeweb.modules.bbj.jingdiao.bbjgs.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjgs.mapper.BbjZcCompanyMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjgs.entity.BbjZcCompany;
import cn.jeeweb.modules.bbj.jingdiao.bbjgs.service.IBbjZcCompanyService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 公司
 * @Description: 公司
 * @author lqz
 * @date 2018-01-28 14:30:35
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcCompanyService")
public class BbjZcCompanyServiceImpl  extends CommonServiceImpl<BbjZcCompanyMapper,BbjZcCompany> implements  IBbjZcCompanyService {

}
