/**
 * 生成回复对话框
 
function generatebackbox(){
	var back_box=
	"<div class='comment-box-wrap' >"+
	"<div class='qz-poster bg qz-poster-show-setter qz-poster-active'>"+
		"<div class='qz-poster-inner '>"+
			"<div class='qz-poster-bd'>"+
				"<div class='qz-poster-editor-cont' id='qz_poster_v4_editor_container_2'>"+
					"<div class='qz-inputer bor2' data-version='20130625'>"+
						"<div idprefix='$2'>"+
							"<div x:id='content_content' spellcheck='false' x:idprefix='content' class='textinput textarea c_tx2' contenteditable='true' accesskey='q' style='' id='$2_content_content' idprefix='$2_content'>"+
								" <span>回复 我是少根筋姐姐</span>"+
							"</div>"+
						"</div>"+
					"</div>"+
				"</div>"+
			"</div>"+
			"<div class='qz-poster-ft'>"+
				"<div class='op'>"+
					 "<a href='javascript:void(0)' onclick='return false;'	class='btn-post gb_bt  evt_click'>"+
					 "<span class='txt'>发表</span>"+
					"</a>"+
				"</div>"+
			"</div>"+
		"</div>"+
	"</div>"+
"</div>";
	$back_box=$(back_box);
	$back_box.blur(function (){
		alert(11);
		//var giveup=confirm("确认放弃正在编辑的评论吗?");
		 
	});
	return $back_box;
}
*/
 
function loadmyss(){
	//alert(111);
	var userName;
	 $.ajax({
				url : "http://localhost:8088/QQZone/ss/loadss.do",
				type : "post",
				dataType : "json",
				data : {
					"userId" : userId
				},
		success : function(result) {
					var date_ss = new Date();// 说说发表时间
					var date_ss_op = new Date();// 评论发表时间
					var status = result.status;
					$("#feed_friend_list").empty();
					// alert($("#feed_friend_list").html());
					if (status == 0) {
						var sslist = result.data;
						// alert(sslist.length); 2
						for ( var i = 0; i < sslist.length; i++) {
							// alert(i);只执行1次输出0
							var ss = sslist[i];
							date_ss.setTime(ss.qq_ss_create_time);
							var ssid = ss.qq_ss_id;
							var zannum = loadzan(ssid);
							var ssops = loadssop(ssid);// 判断返回的说说评论是否为空为空就不添加到html页面中
														// 不为空添加到页面中
               
             // alert(zannum);
				//console.log(ssid);
							var s_li = "";
							s_li = "<li class='f-single f-s-s' id='fct_670095323_311_0_1475039212_0_1' >"
									+ "<div class='f-aside'>  "
									+ "  <div class='f-user-info'>"
									+ "  <div class='f-nick'>"
									+ "<a target='_blank'   "
									+ " class='f-name q_namecard '  >" + ""
									+ ss.qq_user_name
									+ "</a>  "
									+ "</div>"
									+ "<div class='info-detail'><span class=' ui-mr8 state'>"
									+ ""
									+ date_ss
									+ "</span>"
									+ "<span class='state ui-mr10'>"
									+

									"</span>"
									+ "</div>"
									+ "</div>"
									+ "</div>"
									+ "<div class='f-wrap'>"
									+ "  <div class='f-item f-s-i' id='feed_670095323_311_0_1475039212_0_1'  "
									+ ">"
									+ "<div class='f-info f-name'> "
									+ ""
									+ ss.qq_ss_body
									+ "</div><div class='qz_summary wupfeed' id='hex_670095323_311_0_1475039212_0_1'>"
									+ "<div class='f-ct '><div class='f-ct-txtimg '>"
									+ "<div class='txt-box '>                            "
									+ "        </div>"
									+ "<div class='img-box'></div></div></div>"
									+ "<div class='f-op-wrap'>"
									+ "<p class='f-detail'>&nbsp;"
									+ "<a href='javascript:;'   class=' qz_btn_reply item '>"
									+ "评论</a>&nbsp;<span class='item-line'></span>"
									+ "<a class='item qz_like_btn_v3' href='javascript:;'  >"
									+ "赞"
									+ "("
									+ zannum
									+ ")"
									+

									"</a>"
									+ "<a href='javascript:;' class='qz_btn_del item '>删除</a>"
									+ "</p>"
									+ "<div class='qz-poster  bg b-test qz-poster-active' id='QM_Mood_Poster_Inner'>"
									+ "<div class='qz-poster-inner qz-poster-2016-09-28'>"
									+ "<div class='qz-poster-top none'></div>"
									+ "<div class='qz-poster-bd'>"
									+ "<div class='qz-poster-editor-cont' id='qz_poster_v4_editor_container_1'>"
									+ "<div class='qz-inputer bor2' data-version='20130625'>"
									+ "<div idprefix='$1'>"
									+ "<div x:id='content_content' spellcheck='false' x:idprefix='content' class='textinput textarea c_tx2' contenteditable='true' accesskey='q' style='display: none;' id='$1_content_content' idprefix='$1_content'></div>"
									+ "<div class='textinput textarea c_tx3' contenteditable='true' tabindex='0' accesskey='q' id='1_op_content'>说点儿什么吧</div>"
									+ "</div>"
									+ "</div>"
									+ "</div>"
									+ "</div>"
									+ "<div class='qz-poster-ft'>"
									+ "<div class='op'>"
									+ "<a href='javascript:;'  id='post-ss-op' class='btn-post gb_bt  evt_click'  >"
									+ "<span class='txt'>评论</span>"
									+ "</a>"
									+ "</div>"
									+ "</div>"
									+ "</div>"
									+ "</div>"
									+
									"</div></div></div></div></li>;";	
										 var $li = $(s_li);
							$li.data("ssid", ssid);
							var $op_li_1 = $("<div class='mod-comments'></div>");
							var $op_li_2 = $("<div class='comments-list '></div>");

							var $op_li_ul = $("<ul></ul>");
			 if(ssops!=null){
				// alert(ssops.length);
				 for(var m=0;m<ssops.length;m++){
					 var ssop=ssops[m];
					 
					 //alert(time1);
					 date_ss_op.setTime(ssop.ss_op_create_time);
					 var reply_name=ssop.qq_user_name+"";
					 var $op_li_ul_li=
 					 $(" <li class='comments-item bor3' id='reply_op_li'>"
											+ "<div class='comments-item-bd'>"
											+ "<div class='comments-content f-name'>"
											+ "&nbsp;"
											+ "<a class='c_tx q_namecard f-name' target='_blank' href='http://user.qzone.qq.com/1003933958'>"
											+ ssop.qq_user_name
											+ "</a>"
											+ "&nbsp; :"
											+ ssop.ss_op_body
											+ "<div class='comments-op'>"
											+ "<span class=' ui-mr10 state  '> "
											+ ""
											//+ date_ss_op
											+ "</span>"
											+ "<a   href='javascript:;' onclick='show_reply_op(\"" +
											 ssop.qq_user_name+" \" ,\" "+ 
											 ssop.ss_op_id+ 
											 //注意字符串嵌套引起的问题字符串里面有一个字符串类型的变量需要用''引起来  也可以用转义字符
													"\");'  >"
											+ " <span>回复</span>"
											+ "</a>"
											+ "</div>"
											+ "</div>"
											+ "</div>" + "</li>");
                     
					 $op_li_ul_li.data("ss_op_id",ssop.ss_op_id);
					// $op_li_ul_li.on("click","#reply_a",function(){$op_li_ul_li.children(".comments-item-bd").append(generatebackbox());});
					 $op_li_ul.append($op_li_ul_li);
				 }
				 /*
				  * 先将每一条评论加到评论区的ul中
				  * 再将ul加到评论区中
				  * 最后将评论区加到说说区域中
				  */
				 $op_li_2.append($op_li_ul);
				 $op_li_1.append($op_li_2);
				 $li.append($op_li_1); 
			 } 
			 //alert(i);
			 $("#feed_friend_list").append($li);
			}
					} else {

						alert(result.msg);

					}

				},
				error : function() {
					alert("加载失败");
				}

			});
	 
}

 function show_reply_op(reply_name,ss_op_id ){
	// alert(userName);
	// alert(reply_name);
	 $("#can").load(
			 "./alert/alert_op_reply.jsp",
			 {"reply_name":reply_name,"ss_op_id":ss_op_id,"currentuserName":currentuserName}
			 );
	 $(".opacity_bg").show();
 }

function loadzan(ssid){
	 var num;
	$.ajax({
		url:"http://localhost:8088/QQZone/zan/loadzan.do",
		type:"post",
		dataType:"json",
		async:false,
		data:{"userId":userId,"ssid":ssid},
		success:function(result){		
			if(result.status==0){
				num=result.data.length;	
			}
		} 
		
	});
	return num;
	
}
 
function createss(){
	 var qq_ss_body=$("#1_substitutor_content").text();
	 $.ajax({
		 url:"http://localhost:8088/QQZone/ss/create.do",
		 type:"post",
		 dataType:"json",
		 data:{"userId":userId,"qq_ss_body":qq_ss_body},
		 success:function(result){
			 if(result.status==0){
				 $("#1_substitutor_content").html("说点什么吧");
				 loadmyss();
			 } else{
				 alert(result.msg);
			 }
			 
		 } 
		 
		 
	 });
	
}

function createzan(){
	 var ssid=$(this).
	 parents("#fct_670095323_311_0_1475039212_0_1").data("ssid");
	 var $li1=$(this);
	 
	 $.ajax({
		 url:"http://localhost:8088/QQZone/zan/createandzan.do",
		 type:"post",
		 data:{"userId":userId,"ssid":ssid},
		 dataType:"json",
		 success:function(result){
			 if(result.status==0){
			  $li1.html("赞("+result.data.length+")");
			 }
		 },
		 error:function(){
			 alert("赞失败可能是对方设置了权限");
			 
		 }
		 
		 
	 });
	
}

 
	       function  create_reply(){
	    	   var ss_op_id=$("#ss_op_id_span").html();
	       var reply_content=$("#input_reply_ss_op").val();
	        $.ajax({
	        url:"http://localhost:8088/QQZone/ss_op_reply/create_reply.do",
	        type:"post",
	        dataType:"json",
	        data:{"ss_op_id":ss_op_id,"reply_content":reply_content},
	        async:false,
	        success:function(result){
	         if(result.status==0){
	        	 alert(result.msg);
	         }
	        },
	        error:function(){
	        	alert("回复失败可能是网络原因");
	        }
	        });
	       }

function show_del_ss_window(){
	var ssid=$(this).
	 parents("#fct_670095323_311_0_1475039212_0_1").data("ssid");
	//alert(ssid);
	glob_del_ss=ssid;
	//addCookie("ssid",ssid, 0.5);
	$("#can").load("./alert/alert_del_ss.html");
	$(".opacity_bg").show();
	return ssid;
	
	
}
function close_del_ss_window(){
	$(".opacity_bg").hide();
	$("#can").empty();
}


function update_ss_status(){
	
	   var ssid=glob_del_ss;
	   $.ajax({
		   url:"http://localhost:8088/QQZone/ss/del_ss.do",
		   type:"post",
		   data:{"ssid":ssid},
		   dataType:"json",
		   success:function(result){
			   
			   if(result.status==0){
				   loadmyss();
				   
			   }
		   },
		   error:function(){
			   
			   alert("删除说说失败可能是网络原因");
		   }
		   
		   
	   });
	
} 

function createssop(){
var ssid=$(this).parents("#fct_670095323_311_0_1475039212_0_1").data("ssid");
var opbody=$("#1_op_content").html();
 //alert(opbody);
//alert(ssid);
 
	$.ajax({
		url:"http://localhost:8088/QQZone/ssop/createop.do",
		type:"post",
		dataType:"json",
		async:false,
		data:{"ssid":ssid ,"userId":userId,"opbody":opbody},
		success:function(result){
			//alert(result.msg);
			loadmyss();
		},
		error:function(){
			alert("发表评论失败可能是网络原因");
			
		}
		
		
	});
	 
	
	
}
/**
 * 返回每一条说说的所有的评论
 * 在加载说说load
 * 的时候会传给这个函数每个说说的ssid
 * function loadmyss(){
 * for(var i=0;i<sslist.length;i++){
				
				var ss=sslist[i];
				 date_ss.setTime(ss.qq_ss_create_time);
				var ssid=ss.qq_ss_id;
				这里有ssid将此传给这个函数
 * @returns
 */
function loadssop(ssid){
	var op=null;
	 
   $.ajax({
	   url:"http://localhost:8088/QQZone/ssop/loadssop.do",
	   type:"post",
	   dataType:"json",
	   async:false,
	   data:{"ssid":ssid},
	   success:function(result){
		   if(result.status==0){
			  op=result.data;
			   //alert(op);
		   }
		   
	   }
	   
   });
   return op;
   
}



function set_textarea_length(){
	
	 
		   var value = this.value,
		       allLine = value.split('\n'),
		       lastLine = allLine.pop();

		 if (lastLine.length >= 15) {
		     lastLine = lastLine.substr(0, 15) + '\n' + lastLine.substr(15);
		     allLine.push(lastLine)
		     this.value = allLine.join('\n');
		 }   
		 
}
 
