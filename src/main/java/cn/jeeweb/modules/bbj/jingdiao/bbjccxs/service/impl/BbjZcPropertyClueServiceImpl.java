package cn.jeeweb.modules.bbj.jingdiao.bbjccxs.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjccxs.mapper.BbjZcPropertyClueMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjccxs.entity.BbjZcPropertyClue;
import cn.jeeweb.modules.bbj.jingdiao.bbjccxs.service.IBbjZcPropertyClueService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 财产线索
 * @Description: 财产线索
 * @author lqz
 * @date 2018-01-28 14:29:12
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcPropertyClueService")
public class BbjZcPropertyClueServiceImpl  extends CommonServiceImpl<BbjZcPropertyClueMapper,BbjZcPropertyClue> implements  IBbjZcPropertyClueService {

}
