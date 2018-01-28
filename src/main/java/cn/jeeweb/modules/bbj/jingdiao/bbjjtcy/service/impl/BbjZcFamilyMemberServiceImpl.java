package cn.jeeweb.modules.bbj.jingdiao.bbjjtcy.service.impl;

import cn.jeeweb.core.common.service.impl.CommonServiceImpl;
import cn.jeeweb.modules.bbj.jingdiao.bbjjtcy.mapper.BbjZcFamilyMemberMapper;
import cn.jeeweb.modules.bbj.jingdiao.bbjjtcy.entity.BbjZcFamilyMember;
import cn.jeeweb.modules.bbj.jingdiao.bbjjtcy.service.IBbjZcFamilyMemberService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**   
 * @Title: 家庭成员
 * @Description: 家庭成员
 * @author lqz
 * @date 2018-01-28 14:29:46
 * @version V1.0   
 *
 */
@Transactional
@Service("bbjZcFamilyMemberService")
public class BbjZcFamilyMemberServiceImpl  extends CommonServiceImpl<BbjZcFamilyMemberMapper,BbjZcFamilyMember> implements  IBbjZcFamilyMemberService {

}
