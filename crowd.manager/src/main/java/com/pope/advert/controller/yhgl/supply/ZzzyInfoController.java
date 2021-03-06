package com.pope.advert.controller.yhgl.supply;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.pope.advert.common.code.DictionaryEnum;
import com.pope.advert.controller.BaseController;
import com.pope.advert.entity.dictionary.DictionaryInfo;
import com.pope.advert.entity.gggl.bzzy.extend.BzzyExtInfoExtend;
import com.pope.advert.entity.gggl.bzzy.extend.BzzyGsygInfoExtend;
import com.pope.advert.entity.gggl.bzzy.extend.BzzyInfoExtend;
import com.pope.advert.entity.gggl.bzzy.extend.BzzyJyInfoExtend;
import com.pope.advert.entity.gggl.bzzy.extend.BzzyRwInfoExtend;
import com.pope.advert.entity.gggl.bzzy.extend.BzzyXbmggInfoExtend;
import com.pope.advert.entity.gggl.zzzy.extend.ZzzyExtInfoExtend;
import com.pope.advert.entity.gggl.zzzy.extend.ZzzyGsygInfoExtend;
import com.pope.advert.entity.gggl.zzzy.extend.ZzzyInfoExtend;
import com.pope.advert.entity.gggl.zzzy.extend.ZzzyJyInfoExtend;
import com.pope.advert.entity.gggl.zzzy.extend.ZzzyRwInfoExtend;
import com.pope.advert.service.dictionary.DictionaryService;
import com.pope.advert.service.dto.DataResult;
import com.pope.advert.service.supply.zzzy.ZzzyExtInfoService;
import com.pope.advert.service.supply.zzzy.ZzzyGsygInfoService;
import com.pope.advert.service.supply.zzzy.ZzzyInfoService;
import com.pope.advert.service.supply.zzzy.ZzzyJyInfoService;
import com.pope.advert.service.supply.zzzy.ZzzyRwInfoService;
import com.wisedu.crowd.common.util.CommonUtil;
import com.wisedu.crowd.common.util.ConditionUtil;
import com.wisedu.crowd.common.util.StringUtil;

@Controller
@RequestMapping("zzzyInfo")
public class ZzzyInfoController extends BaseController{
	@Autowired
	private DictionaryService dictionaryService;
	@Autowired
	private ZzzyInfoService zzzyInfoService;
	@Autowired
	private ZzzyExtInfoService zzzyExtInfoService;
	@Autowired
	private ZzzyGsygInfoService zzzyGsygInfoService;
	@Autowired
	private ZzzyRwInfoService zzzyRwInfoService;
	@Autowired
	private ZzzyJyInfoService zzzyJyInfoService;
	@RequestMapping("index")
	public ModelAndView index() throws Exception {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("supply/zzzy");
		mv.addObject("shzt", dictionaryService.selectAllByTable(DictionaryEnum.T_ADVERT_SJZD_SHZT));
		return mv;
	}
	
	
	@RequestMapping("selectZzzyInfo")
	@ResponseBody
	public DataResult<ZzzyInfoExtend> selectZzzyInfo(String wid) throws Exception {
		ZzzyInfoExtend queryZzzyInfoExtend = new ZzzyInfoExtend();
		queryZzzyInfoExtend.setWid(wid);

		List<ZzzyInfoExtend> datas = zzzyInfoService.selectDisplayByCondition(
				ConditionUtil.createCondition(queryZzzyInfoExtend), this.createCustomOperateLog()).getDatas();
		if (CommonUtil.isNotEmptyList(datas)) {
			return DataResult.success(datas.get(0));
		} else {
			return DataResult.success(new ZzzyInfoExtend());
		}
	}
	@RequestMapping("selectZzzyExtInfo")
	@ResponseBody
	public DataResult<ZzzyExtInfoExtend> selectZzzyExtInfo(String zzzyId) throws Exception{
		
		
		ZzzyExtInfoExtend queryZzzyExtInfoExtend=new ZzzyExtInfoExtend();
		queryZzzyExtInfoExtend.setDszyId(zzzyId);
		
		List<ZzzyExtInfoExtend> datas=zzzyExtInfoService.selectDisplayByCondition(ConditionUtil.createCondition(queryZzzyExtInfoExtend), this.createCustomOperateLog()).getDatas();
		if(CommonUtil.isNotEmptyList(datas)){
			ZzzyExtInfoExtend zzzyExtInfoExtend=datas.get(0);
			
			return DataResult.success(zzzyExtInfoExtend);
		}else{
			return DataResult.success(new ZzzyExtInfoExtend());
		}
	}

	@RequestMapping("selectZzzyOtherInfo")
	@ResponseBody
	public DataResult<Object> selectZzzyOtherInfo(String zzzyId,String ggxs) throws Exception{
		if("1".equals(ggxs)){
			ZzzyGsygInfoExtend queryZzzyGsygInfoExtend=new ZzzyGsygInfoExtend();
			queryZzzyGsygInfoExtend.setZzzyId(zzzyId);
			List<ZzzyGsygInfoExtend> datas=zzzyGsygInfoService.selectByCondition(ConditionUtil.createCondition(queryZzzyGsygInfoExtend), this.createCustomOperateLog()).getDatas();
			if(CommonUtil.isNotEmptyList(datas)){
				return DataResult.success((Object)datas.get(0));
			}
			
		}else if("2".equals(ggxs)){
			ZzzyRwInfoExtend queryZzzyRwInfoExtend=new ZzzyRwInfoExtend();
			queryZzzyRwInfoExtend.setZzzyId(zzzyId);
			List<ZzzyRwInfoExtend> datas=zzzyRwInfoService.selectByCondition(ConditionUtil.createCondition(queryZzzyRwInfoExtend),this.createCustomOperateLog()).getDatas();
			if(CommonUtil.isNotEmptyList(datas)){
				return DataResult.success((Object)datas.get(0));
			}
			
		}else if("3".equals(ggxs)){
			ZzzyJyInfoExtend queryZzzyJyInfoExtend=new ZzzyJyInfoExtend();
			queryZzzyJyInfoExtend.setZzzyId(zzzyId);
			
			List<ZzzyJyInfoExtend> datas=zzzyJyInfoService.selectByCondition(ConditionUtil.createCondition(queryZzzyJyInfoExtend), this.createCustomOperateLog()).getDatas();
			if(CommonUtil.isNotEmptyList(datas)){
				return DataResult.success((Object)datas.get(0));
			}
		}
		return DataResult.success(null);
	}
	@ResponseBody
	@RequestMapping("delete")
	public DataResult<Integer> delete(String wid,String ggxs) throws Exception{
		if("1".equals(ggxs)){
			zzzyGsygInfoService.delete(wid, this.createCustomOperateLog());
		}else if("2".equals(ggxs)){
			zzzyRwInfoService.delete(wid, this.createCustomOperateLog());
		}else if("3".equals(ggxs)){
			zzzyJyInfoService.delete(wid, this.createCustomOperateLog());
		}
		return DataResult.success(1);
	}
	@ResponseBody
	@RequestMapping("sh")
	public DataResult<Integer> sh(String wid,String shzt)throws Exception{
		return zzzyInfoService.sh(wid, shzt, this.createCustomOperateLog());
	}
}
