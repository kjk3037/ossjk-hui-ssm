<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/inc/taglib.jsp"%>
<!--_meta 作为公共模版分离出去-->
<!DOCTYPE HTML>
<html>
<head>
<title>添加</title>
<jsp:include page="/WEB-INF/inc/common.jsp"></jsp:include>
</head>
<body style="background-color: #fff">
	<div class="wap-container">
		<div class="panel">
			<div class="panel-body">
				<form action="${pageContext.request.contextPath}${requestScope.record != null ?  '/device/devicerepair/update.do' :'/device/devicerepair/insert.do'}" method="post" class="form form-horizontal" id="form">
					<!-- 隐藏表单 -->
					<c:if test="${requestScope.record != null }">
						<input type="hidden" name="id" value="${requestScope.record.id }">
					</c:if>
					<c:if test="${requestScope.record != null }">
						<input type="hidden" name="status" id="status" value="2">
					</c:if>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>设备流水号</label>
						<div class="formControls col-xs-8 col-sm-9">
						  <select id="did" name="did" class="input-text" onfocus="this.defaultIndex=this.selectedIndex;" onchange="this.selectedIndex=this.defaultIndex;" >
						     <option value="0">--请选择--</option>
						     <c:forEach items="${requestScope.devices}" var="device">
						     <option value="${device.id}"<c:if test="${device.id eq record.did }">selected="selected"</c:if>>${device.dtname}-${device.code }-${device.brand }-${device.model}</option>
						     </c:forEach>
						  </select>
						</div>
					</div>
					
					
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>申请人：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<!--<input type="text" class="input-text" value="${requestScope.user.name }" placeholder="" id="original" name="original">-->
							<select id="damager" name="damager" onfocus="this.defaultIndex=this.selectedIndex;" onchange="this.selectedIndex=this.defaultIndex;" >
								<c:forEach items="${requestScope.users }" var="user">
								<option value="${user.id }" <c:if test="${requestScope.record.damager eq user.id }">selected="selected"</c:if>>${user.name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>报修日期：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input class="input-text" id="damagedate" name="damagedate" <c:if test="${requestScope.record != null }">type="text"  readonly="readonly" value="<fmt:formatDate value="${record.damagedate }" pattern="yyyy-MM-dd"/>"</c:if> <c:if test="${requestScope.record == null }">type="date"</c:if>>
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>报修备注：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" id="damageremarks" name="damageremarks" value="${record.damageremarks }" readonly="readonly">
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>维修人：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<!--<input type="text" class="input-text" value="${requestScope.user.name }" placeholder="" id="original" name="original">-->
							<select id="repairer" name="repairer">
								<c:forEach items="${requestScope.users }" var="user">
								<option value="${user.id }">${user.name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>维修日期：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input class="input-text" id="repairdate" name="repairdate" type="date">
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>维修备注：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" id="repairremarks" name="repairremarks">
						</div>
					</div>
					
					<div class="row clearfix">
						<div class="col-xs-8 col-sm-9 col-xs-offset-4 col-sm-offset-3">
							<input class="btn btn-primary radius" type="submit" value="&nbsp;&nbsp;提交&nbsp;&nbsp;">
						</div>
					</div>
					
				</form>
			</div>
		</div>
	</div>
	<script type="text/javascript" src="${pageContext.request.contextPath}/static/common/js/main.js"></script>
	<script type="text/javascript">
		//验证表单
		$("#form").validate({
			rules : {
				ogid : {
					required : true,//必填
				},
				dtid : {
					required : true,
				},
				residual : {
					required : true,
				},
				original : {
					required : true,
				},
				status : {
					required : true,
				},
				proddate : {
					required : true,
				},
				creator : {
					required : true,
				},
				createtime : {
					required : true,
				},
				buyer : {
					required : true,
				},
				bugdate : {
					required : true,
				}
			},
			
			
			
			
			
			
			onkeyup : false,
			focusCleanup : true,
			submitHandler : function(form) {
				$(form).ajaxSubmit({
					type : form.method,
					url : form.action,
					success : function(data) {
						commonreuslt(data);
					}
				});
			}
		});
	</script>
	<!--/请在上方写此页面业务相关的脚本-->
</body>
</html>
