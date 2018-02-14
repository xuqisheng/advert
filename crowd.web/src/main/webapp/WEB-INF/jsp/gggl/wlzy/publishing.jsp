<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE HTML>
<html>
<%@ include file="/jsp/top/top.jsp"%>
<%@ include file="/jsp/top/other.jsp"%>
<%@ include file="/jsp/param.jsp"%>
<!--[if lte IE 8]>
<div class="text-xs-center m-b-0 bg-blue-grey-100 alert">
    <button type="button" class="close" aria-label="Close" data-dismiss="alert">
        <span aria-hidden="true">×</span>
    </button>
    你正在使用一个 <strong>过时</strong> 的浏览器。请 <a href="http://browsehappy.com/" target="_blank">升级您的浏览器</a>，以提高您的体验。
</div>
<![endif]-->

<style>
</style>
<body>
	<%@include file="/jsp/header.jsp"%>
	<div class="page bg-pagebg1">
		<div class="container">
			<div class="page-content row">

				<div class="col-lg-3">
					<%@include file="/jsp/supply/left_menu.jsp"%>

				</div>

				<div class="col-lg-9">
					<div class="panel m-b-0">
						<div class="panel-body">
							<div class="row" style="border-bottom: 1px solid #999">
								<h3>
									<i class="fa fa-edit my-text-color" aria-hidden="true"
										style="margin-right: 10px;"></i>发布新广告资源
								</h3>
							</div>
							<div class="row my-mt-20">
								<div class="col-xs-6 col-sm-3"
									style="padding-left: 0px; padding-right: 0px;">
									<button type="button" class="btn btn-primary btn-sm btn-block"
										id="btnSupply">媒体广告资源</button>
								</div>
								<div class="col-xs-6 col-sm-3"
									style="padding-left: 0px; padding-right: 0px;">
									<button type="button" class="btn btn-default btn-sm btn-block"
										id="btnBuy">服务/设备/非广告资源</button>
								</div>
							</div>
							<div class="row my-mt-10">
								<%@ include file="/jsp/supply/gglx_header.jsp"%>
							</div>
							<div class="row my-mt-10">
								<form class="form-register met-form form-horizontal"
									method="post" action="" role="form" id="formZzzy">
									<input type="hidden" name="zzzyInfo.wid">
									<h4>网络广告资源信息添加</h4>
									<div class="well well-sm my-padding-12">广告基本信息</div>

									<input type="hidden" name="flag" value="1" />
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">输入网站</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<input type="text" class="form-control " name="wlzyInfo.wz"
													required data-fv-notempty-message="此项不能为空">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">版面</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<input type="text" class="form-control " name="wlzyInfo.wz"
													required data-fv-notempty-message="此项不能为空">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">广告位置</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<table style="width: 100%">
													<tr>
														<c:forEach var="data" items="${zywz}">
															<td><input type="radio" name="wlzywz"
																value="${data.lbdm}">${data.lbmc}</td>
														</c:forEach>
													</tr>
												</table>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">位置描述</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<textarea cols="5" class="form-control " name="wlzyInfo.wz"
													required data-fv-notempty-message="此项不能为空">
													
												</textarea>
											</div>
										</div>
									</div>

									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">资源图片</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<div class="fileImg" id="fileImg2">
													<ul>
														<li><input name="FileImage1" type="file"
															id="FileImage1" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage2" type="file"
															id="FileImage2" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage3" type="file"
															id="FileImage3" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage4" type="file"
															id="FileImage4" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage5" type="file"
															id="FileImage5" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage6" type="file"
															id="FileImage6" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage7" type="file"
															id="FileImage7" class="upfile">
															<div>
																<span></span>
															</div></li>
														<li><input name="FileImage8" type="file"
															id="FileImage8" class="upfile">
															<div>
																<span></span>
															</div></li>
													</ul>
												</div>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="well well-sm my-padding-12 col-sm-12 col-md-12 control-label text-left">展现形态及尺寸</label>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">展示形态</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<select  class="form-control " name="wlzyInfo.wz"
													required data-fv-notempty-message="此项不能为空">
													</select>
											</div>
											<div class="col-sm-4">
												<select  class="form-control " name="wlzyInfo.wz"
													required data-fv-notempty-message="此项不能为空">
													</select>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">尺寸</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<select  class="form-control " name="wlzyInfo.wz"
													required data-fv-notempty-message="此项不能为空">
													</select>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="well well-sm my-padding-12 col-sm-12 col-md-12 control-label text-left">计费及价格</label>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">尺寸</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<table style="width:100%;">
													<tr>
														<td>
															<input type="radio" >时长计费
														</td>
													</tr>
												</table>
											</div>
										</div>
									</div>
								</form>
								<form class="form-register met-form form-horizontal"
									method="post" action="" role="form" id="formZzzyGsyg"
									enctype="multipart/form-data">
									<input type="hidden" name="zzzyGsygInfo.wid">
									<div class="form-group">
										<label for="firstname"
											class="well well-sm my-padding-12 col-sm-12 col-md-12 control-label text-left">发布报纸工商硬广广告代理信息详情</label>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">标题</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<input type="text" name="zzzyGsygInfo.name"
													class="form-control" required
													data-fv-notempty-message="此项不能为空">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">折扣</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<input type="text" name="zzzyGsygInfo.zk"
													class="form-control" required
													data-fv-notempty-message="此项不能为空">
											</div>
											<div class="col-sm-4">折</div>
										</div>
									</div>

								</form>


								<form class="form-register met-form form-horizontal"
									method="post" action="" role="form" style="display: none;"
									id="formZzzyRw" enctype="multipart/form-data">
									<input type="hidden" name="zzzyRwInfo.wid">
									<div class="form-group">
										<label for="firstname"
											class="well well-sm my-padding-12 col-sm-12 col-md-12 control-label text-left">发布报纸软文广告代理信息详情</label>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">标题</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<input type="text" name="zzzyRwInfo.name"
													class="form-control" required
													data-fv-notempty-message="此项不能为空">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">报价</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-12">
												<table>
													<tr>
														<td><input type="radio" name="zzzyRwInfo.bjlx"
															value="1"></td>
														<td>价格</td>
														<td><input type="text" name="zzzyRwInfo.jg"
															style="width: 150px"></td>
														<td>元/篇</td>
													</tr>
													<tr>
														<td><input type="radio" name="zzzyRwInfo.bjlx"
															value="2"></td>
														<td>折扣</td>
														<td><input type="text" name="zzzyRwInfo.zk"
															style="width: 150px"></td>
														<td>折</td>
													</tr>
												</table>
											</div>
										</div>
									</div>

								</form>

								<form class="form-register met-form form-horizontal"
									method="post" action="" role="form" style="display: none;"
									id="formZzzyJy" enctype="multipart/form-data">
									<input type="hidden" name="zzzyJyInfo.wid">
									<div class="form-group">
										<label for="firstname"
											class="well well-sm my-padding-12 col-sm-12 col-md-12 control-label text-left">发布报纸软文广告代理信息详情</label>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">标题</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<input type="text" name="zzzyJyInfo.name"
													class="form-control" required
													data-fv-notempty-message="此项不能为空">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">单页价格</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<input type="text" name="zzzyJyInfo.dyjg"
													class="form-control" required
													data-fv-notempty-message="此项不能为空">
											</div>
											<div class="col-sm-4">元/份</div>
										</div>
									</div>

								</form>

								<form class="form-register met-form form-horizontal"
									method="post" action="" role="form" id="formZzzyExt">
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">行业</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<input type="radio" name="zzzyExtInfo.sfxzhy" required
													data-fv-notempty-message="此项不能为空" value=0 checked>不限行业
												<input type="radio" name="zzzyExtInfo.sfxzhy" required
													data-fv-notempty-message="此项不能为空" value=1>限制行业

											</div>
										</div>
									</div>
									<div class="form-group" name="divHy" style="display: none;">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">&nbsp;</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<c:forEach items="${hy}" var="data">
													<input type="checkbox" name='zzzyExtInfo.hy'
														value="${data.lbdm}" />${data.lbmc}
												</c:forEach>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">补充说明</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-8">
												<textarea rows="5" class="form-control"
													name="zzzyExtInfo.bcsm">
													</textarea>
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">广告代理方式</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<select class="form-control " name="zzzyExtInfo.ggdlfs"
													required data-fv-notempty-message="此项不能为空">
													<option value="">--请选择--</option>
													<c:forEach items="${ggdlfs}" var="data">
														<option value="${data.lbdm}">${data.lbmc}</option>
													</c:forEach>
												</select>
											</div>
											<div class="col-sm-4">
												<a href="javascript:void(0);" name="aScdlzs">上传代理证书</a>
											</div>
										</div>
									</div>
									<div class="form-group" name="divScdlzs" style="display: none;">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">上传代理证书</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<input type="file">
											</div>
										</div>
									</div>
									<div class="form-group">
										<label for="firstname"
											class="col-sm-2 col-md-2 control-label text-right">上传图片</label>
										<div class="col-sm-10 col-md-10">
											<div class="col-sm-4">
												<input type="file">
											</div>
											<div class="col-sm-4"></div>
										</div>
									</div>
									<button class="btn btn-lg btn-primary btn-block" type="button"
										id="btnPublishingSd">马上发布</button>
								</form>
							</div>



						</div>
					</div>
				</div>
			</div>
		</div>
	</div>

	<%@include file="/jsp/footer/footer2.jsp"%>
	<button type="button"
		class="btn btn-icon btn-primary btn-squared met-scroll-top" hidden>
		<i class="icon wb-chevron-up" aria-hidden="true"></i>
	</button>
	<script>
		var page_type = "";
	</script>
	<%@ include file="/jsp/bottom.jsp"%>
</body>
</html>