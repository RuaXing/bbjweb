package cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtdisposaldisorder.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtdisposaldisorder.mapper.BbjZcDebtDisposalDisorderMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtdisposaldisorder.entity.BbjZcDebtDisposalDisorder;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcdebtdisposaldisorder.service.IBbjZcDebtDisposalDisorderService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 债权处置障碍
 * @Description: 债权处置障碍
 * @author somuns
 * @date 2018-01-24 20:00:45
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcDebtDisposalDisorderService")
public class BbjZcDebtDisposalDisorderServiceImpl  extends CommonServiceImpl<BbjZcDebtDisposalDisorderMapper,BbjZcDebtDisposalDisorder> implements  IBbjZcDebtDisposalDisorderService {

}
