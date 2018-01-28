package cn.jeeweb.modules.bbj.jingdiao.bbjzqczza.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzqczza.mapper.BbjZcDebtDisposalDisorderMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzqczza.entity.BbjZcDebtDisposalDisorder;
import cn.jeeweb.modules.bbj.jingdiao.bbjzqczza.service.IBbjZcDebtDisposalDisorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权处置障碍
 * @Description: 债权处置障碍
 * @author somuns
 * @date 2018-01-28 14:33:56
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcDebtDisposalDisorderService")
public class BbjZcDebtDisposalDisorderServiceImpl  extends CommonServiceImpl<BbjZcDebtDisposalDisorderMapper,BbjZcDebtDisposalDisorder> implements  IBbjZcDebtDisposalDisorderService {

}
