/**
 * 
 */

$(document).ready(function(){
	//$('.dataStatistics').dataStatistics({min:100,max:1500,time:30000,len:6});
	
	$("#paralist a").click(function(){
		var data_option=$(this).attr("data-option");
		$("#paralist a[data-option='"+data_option+"']").removeClass("queryActive");
		$(this).addClass("queryActive");
		getDllb(1,true);
	});
	getDllb(1,true);
	function getDllb(pageNum,needPage){
		if(pageNum==undefined){
			pageNum=1;
		}
		var _sjlx=$("#paralist a.queryActive").attr("data-key");
		doGet(basePath+"/sjglCenter/queryAllList","pageNum="+pageNum+"&sjlx="+_sjlx,function(data){
			if(data && data.datas){
				if(needPage){
					$('#pageContent').pagination({
						pageCount:data.pageInfo.totalPage,
					    showData:data.pageInfo.pageSize,
					    coping:true,
					    callback:function(api){
					    	var _cPage=api.getCurrent();
					    	getDllb(_cPage,false);
					    }
					});
				}
				var html="";
				for(var i=0;i<data.datas.length;i++){
					var _data=data.datas[i];
					html+='<div class="center-left-body-block">';
					html+='		<div class="child">';
					html+='			<div class="img-div col-xs-2 col-sm-2">';
					html+='				<a href="'+basePath+'/dlglView/view?wid='+_data.wid+'" target="_blank" style="display:block;">';
					html+='					<img class="img-responsive" src="'+basePath+'/image/preView?wid='+_data.imgid+'">';
					html+='				</a>';
					html+='			</div>';
					html+='			<div class="left-bolck col-xs-9 col-sm-9">';
					html+='				<div class="info-body">';
					html+='					<div class="info-body-title">';
					html+='						<a href="'+basePath+'/dlglView/view?wid='+_data.wid+'" target="_blank"	class="info-body-title-name">';
					html+='							<span class="number-title">';
					html+='								<span class="">'+_data.title+'</span>';
					html+='							</span>';
					html+='						<span class="tsxx tsxx-red">'+_data.sjlxDisplay+'</span>';
					html+='						</a>';
					html+='					</div>';
					html+='				</div>';
					html+='				<div class="content1">';
					html+='					<span>'+_data.ztnr+'<span>';
					html+='				</div>';
					
					
					html+='				<div class="time-content">';
					html+='					<span> <!-- react-text: 421 -->'+_data.cjsj+'<!-- /react-text -->';
					html+='						<!-- react-text: 422 -->发布<!-- /react-text -->';
					html+='					</span>';
					html+='					<!-- react-text: 423 -->|<!-- /react-text -->';
					html+='					<span> <!-- react-text: 425 -->100<!-- /react-text -->';
					html+='						<!-- react-text: 426 --> 人阅读<!-- /react-text -->';
					html+='					</span>';
					html+=' 			</div>';
					html+='			</div>';
					html+='		</div>';
					html+='</div>';
				}
				$("#divContent").html(html);
			}
		});
		
		
		
	}
	
});