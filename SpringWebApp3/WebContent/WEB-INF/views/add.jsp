<%@ taglib uri="http://www.springframework.org/tags/form" prefix="f"%>

<f:form commandName="student" method="POST">
	<table>
		<tr>
			<td>Sid</td>
			<td><f:input path="sid" /></td>
		</tr>

		<tr>
			<td>Sname</td>
			<td><f:input path="sname" /></td>
		</tr>

		<tr>
			<td>Age</td>
			<td><f:input path="age" /></td>
		</tr>

		<tr>
			<td>Marks</td>
			<td><f:input path="marks" /></td>
		</tr>

		<tr>
			<td>Grades</td>
			<td><f:input path="grade" /></td>
		</tr>

		<tr>
			<td>Date of Birth</td>
			<td><f:input path="dob" /></td>
		</tr>

		

	</table>

<input type="submit" value="Add Records" />
</f:form>