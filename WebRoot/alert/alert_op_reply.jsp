﻿	<%@page pageEncoding="utf-8" %>
	<%
	 String reply_name=request.getParameter("reply_name");
	 String ss_op_id=request.getParameter("ss_op_id");
	 String currentuserName=request.getParameter("currentuserName");
	 %>
	   
 
			<div class="modal fade in" id="modalBasic_2" tabindex="-1" role="dialog" aria-labelledby="modalBasicLabel" aria-hidden="false">
					<div class="modal-dialog">
						<div class="modal-content">
							<div class="modal-header">
								<button type="button" class="close" data-dismiss="modal" aria-hidden="true">×</button>
								<h4 class="modal-title" id="modalBasicLabel_2">评论回复</h4>
							</div>
							<div class="modal-body">
								<div class="form-group">
                                   <label class="col-sm-3 control-label" for="input" style='margin-top:5px;'><%=currentuserName%>回复<%=reply_name %></label>
                                     
                                    <div class="col-sm-8">
                                        <textarea class="form-control" id="input_reply_ss_op"
                                        style="width:200px;height:100px; "
                                        />
                                         <span id="ss_op_id_span"style="display:none;"><%=ss_op_id %></span>
                                    </div>
                  
	 
                                </div>
							</div>
							<div class="modal-footer" style='margin-top:20px;'>
							
								<button type="button" class="btn btn-default cancle" data-dismiss="modal">取 消</button>
								<button type="button" class="btn btn-primary sure" id="alert_reply_op">回复</button>
							</div>
						</div>
					</div>
				</div>