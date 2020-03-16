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
				<form action="${pageContext.request.contextPath}${requestScope.record != null ?  '/device/devicesout/update.do' :'/device/devicesout/insert.do'}" method="post" class="form form-horizontal" id="form">
					<!-- 隐藏表单 -->
					<c:if test="${requestScope.record != null }">
						<input type="hidden" name="id" value="${requestScope.record.id }">
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
							<select id="outter" name="outter" onfocus="this.defaultIndex=this.selectedIndex;" onchange="this.selectedIndex=this.defaultIndex;" >
								<c:forEach items="${requestScope.users }" var="user">
								<option value="${user.id }" <c:if test="${requestScope.record.outter eq user.id }">selected="selected"</c:if>>${user.name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>报废日期：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input class="input-text" id="outdate" name="outdate" <c:if test="${requestScope.record != null }">type="text"  readonly="readonly" value="<fmt:formatDate value="${record.outdate }" pattern="yyyy-MM-dd"/>"</c:if> <c:if test="${requestScope.record == null }">type="date"</c:if>>
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>报废备注：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" id="remarks" name="remarks" value="${record.remarks }" readonly="readonly">
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>审批人：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<!--<input type="text" class="input-text" value="${requestScope.user.name }" placeholder="" id="original" name="original">-->
							<select id="approver" name="approver">
								<c:forEach items="${requestScope.users }" var="user">
								<option value="${user.id }">${user.name }</option>
								</c:forEach>
							</select>
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>申请日期：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input class="input-text" id="approvaldate" name="approvaldate" type="date">
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>审批意见：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<input type="text" class="input-text" id="approvalremarks" name="approvalremarks">
						</div>
					</div>
					<div class="row clearfix">
						<label class="form-label col-xs-4 col-sm-3"><span class="c-red">*</span>是否批准：</label>
						<div class="formControls col-xs-8 col-sm-9">
							<!--<input type="text" class="input-text" value="${requestScope.user.name }" placeholder="" id="original" name="original">-->
							<%-- <select id="status" name="status">
								<option value="1"<c:if test="${requestScope.record.status eq 1 }">selected="selected"</c:if>>申请</option>
								<option value="2"<c:if test="${requestScope.record.status eq 2 }">selected="selected"</c:if>>准许</option>
								<option value="3"<c:if test="${requestScope.record.status eq 3 }">selected="selected"</c:if>>拒绝</option>
							</select> --%>
							<label><input type="radio" name="status" id="status" value="1">申请</label>
							<label><input type="radio" name="status" id="status" value="2">批准</label>
							<label><input type="radio" name="status" id="status" value="3">拒绝</label>
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
