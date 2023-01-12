<%@  include file="common/header.jspf"  %>
<%@  include file="common/navigation.jspf"  %>
	<div class="container">
		<h1>Add ToDo page</h1>
		<form:form method="post" modelAttribute="todo">
			<fieldset class="mb-3">
				<form:label path="description">Description : </form:label>
				<form:input type="text"   path="description"/>
				<form:errors path="description"  cssClass="text-warning" />
			</fieldset>
			
			<fieldset class="mb-3">
				<form:label path="targetDate">Target Date : </form:label>
				<form:input type="text"   path="targetDate"/>
			</fieldset>
			
			<input type="submit" class="btn btn-success">
		</form:form>
		
	</div>
	<%@  include file="common/footer.jspf"  %>
	
		<script type="text/javascript">
		$('#targetDate').datepicker({
		    format: 'yyyy-mm-dd',
		});
		</script>