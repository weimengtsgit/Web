<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/jsp/commons/taglibs.jsp"%>
<div class="pageContent">
		<input type="hidden" name="id" value="${shopPromotion.id}" />
		<div class="pageFormContent" layoutH="56">
		
			<dl>
				<dt>商铺：</dt>
				<dd>
					<c:if test="${not empty shopPromotion.shop.name}">
						<a class="ghbutton search right" href="${ctx}/view?id=${shopPromotion.shop.id}" target="dialog" mask="true" title="查看商铺详情">${shopPromotion.shop.name}</a>
					</c:if>
					<span class="info"></span>
				</dd>
			</dl>
		
			<dl>
				<dt>优惠活动简介：</dt>
				<dd>
					<input id="intro" readonly="readonly" name="intro" type="text" value="${shopPromotion.intro}" size="30"  />
					<span class="info"></span>
				</dd>
			</dl>
		
			<div class="divider"></div>
		
			<dl>
				<dt>活动图片url：</dt>
				<dd>
					<input id="image" readonly="readonly" name="image" type="text" value="${shopPromotion.image}" size="30"  />
					<span class="info"></span>
				</dd>
			</dl>
		
			<dl>
				<dt>活动图片：</dt>
				<dd>
					<c:if test="${not empty shopPromotion.imageAttachment.attachName}">
						<a class="ghbutton search right" href="${ctx}/attachment/attachment/view?id=${shopPromotion.imageAttachment.id}" target="dialog" mask="true" title="查看活动图片详情">${shopPromotion.imageAttachment.attachName}</a>
					</c:if>
					<span class="info"></span>
				</dd>
			</dl>
		
			<div class="divider"></div>
		
			<dl>
				<dt>开始展示时间：</dt>
				
				<dd>
					<input id="beginTime" readonly="readonly" name="beginTime" type="text" class="date" dateFmt="yyyy-MM-dd HH:mm:ss" size="30" value="<fmt:formatDate value="${shopPromotion.beginTime}" type="time" timeStyle="full" pattern="yyyy-MM-dd HH:mm:ss"/>" />
					<span class="info"></span>
				</dd>
			</dl>
		
			<dl>
				<dt>结束展示时间：</dt>
				
				<dd>
					<input id="endTime" readonly="readonly" name="endTime" type="text" class="date" dateFmt="yyyy-MM-dd HH:mm:ss" size="30" value="<fmt:formatDate value="${shopPromotion.endTime}" type="time" timeStyle="full" pattern="yyyy-MM-dd HH:mm:ss"/>" />
					<span class="info"></span>
				</dd>
			</dl>
		
			<div class="divider"></div>
		
			<dl>
				<dt>审核状态：</dt>
				<dd>
					<tag:enum tagType="view"   enumName="shopAuditStatus" enumKey="${shopPromotion.auditStatus}" />
				</dd>
				<span class="info"></span>
			</dl>
		
			<dl>
				<dt>状态：</dt>
				<dd>
					<tag:enum tagType="view"   enumName="promotionStatus" enumKey="${shopPromotion.status}" />
				</dd>
				<span class="info"></span>
			</dl>
		
			<div class="divider"></div>
		
			<dl class="nowrap">
				<dt>活动具体内容：</dt>
				<dd>
					<textarea readonly="readonly" id="details" cols="91" rows="5" width="480">${shopPromotion.details}</textarea>
				</dd>
				<span class="info"></span>
			</dl>
			<div class="divider"></div>
		
			<dl class="nowrap">
				<dt>审核失败原因：</dt>
				<dd>
					<textarea readonly="readonly" id="auditRejectReason" cols="91" rows="5" width="480">${shopPromotion.auditRejectReason}</textarea>
				</dd>
				<span class="info"></span>
			</dl>
			<div class="divider"></div>
		
		</div>
		<div class="formBar">
			<ul>
				<li>
					<div class="button"><div class="buttonContent"><button type="button" class="close">关闭</button></div></div>
				</li>
			</ul>
		</div>
</div>
