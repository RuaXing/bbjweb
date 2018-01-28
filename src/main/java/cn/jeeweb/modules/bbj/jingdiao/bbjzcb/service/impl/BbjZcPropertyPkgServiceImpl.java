package cn.jeeweb.modules.bbj.jingdiao.bbjzcb.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcb.mapper.BbjZcPropertyPkgMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcb.entity.BbjZcPropertyPkg;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcb.service.IBbjZcPropertyPkgService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 资产包
 * @Description: 资产包
 * @author even
 * @date 2018-01-28 14:32:21
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcPropertyPkgService")
public class BbjZcPropertyPkgServiceImpl  extends CommonServiceImpl<BbjZcPropertyPkgMapper,BbjZcPropertyPkg> implements  IBbjZcPropertyPkgService {

}
