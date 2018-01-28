package cn.jeeweb.modules.bbj.jingdiao.bbjzcpropertypkg.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcpropertypkg.mapper.BbjZcPropertyPkgMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcpropertypkg.entity.BbjZcPropertyPkg;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcpropertypkg.service.IBbjZcPropertyPkgService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 资产包
 * @Description: 资产包
 * @author even
 * @date 2018-01-27 23:30:25
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcPropertyPkgService")
public class BbjZcPropertyPkgServiceImpl  extends CommonServiceImpl<BbjZcPropertyPkgMapper,BbjZcPropertyPkg> implements  IBbjZcPropertyPkgService {

}
