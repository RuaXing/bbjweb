package cn.jeeweb.modules.bbj.jingdiao.bbjzcassetdisposal.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcassetdisposal.mapper.BbjZcAssetDisposalMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcassetdisposal.entity.BbjZcAssetDisposal;
import cn.jeeweb.modules.bbj.jingdiao.bbjzcassetdisposal.service.IBbjZcAssetDisposalService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 资产处置障碍
 * @Description: 资产处置障碍
 * @author somuns
 * @date 2018-01-24 22:42:00
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcAssetDisposalService")
public class BbjZcAssetDisposalServiceImpl  extends CommonServiceImpl<BbjZcAssetDisposalMapper,BbjZcAssetDisposal> implements  IBbjZcAssetDisposalService {

}
