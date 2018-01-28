package cn.jeeweb.modules.bbj.jingdiao.bbjxmgl.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjxmgl.mapper.BbjZcProjectManagementMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjxmgl.entity.BbjZcProjectManagement;
import cn.jeeweb.modules.bbj.jingdiao.bbjxmgl.service.IBbjZcProjectManagementService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 项目管理
 * @Description: 项目管理
 * @author somuns
 * @date 2018-01-28 14:31:20
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcProjectManagementService")
public class BbjZcProjectManagementServiceImpl  extends CommonServiceImpl<BbjZcProjectManagementMapper,BbjZcProjectManagement> implements  IBbjZcProjectManagementService {

}
