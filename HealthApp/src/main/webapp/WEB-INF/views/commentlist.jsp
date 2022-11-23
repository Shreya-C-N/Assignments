<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List</title>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css"
	rel="stylesheet"
	integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi"
	crossorigin="anonymous">
</head>

<style>
body {
	background-image: url("https://wallpapercave.com/wp/wp2919299.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
}
</style>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<body>
	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
	<div class="container-fluid">
		<a class="navbar-brand" href="#"> <img
			th:src="@{/images/logo.png}" src="../static/images/logo.png"
			width="auto" height="40" class="d-inline-block align-top" alt="" />
		</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>



		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto"></ul>
			<ul class="navbar-nav">
			<!--  <form action="/dashboard" method="get">
                       <input type="image" src="data:image/jpeg;base64,/9j/4AAQSkZJRgABAQAAAQABAAD/2wBDAAsJCQcJCQcJCQkJCwkJCQkJCQsJCwsMCwsLDA0QDBEODQ4MEhkSJRodJR0ZHxwpKRYlNzU2GioyPi0pMBk7IRP/2wBDAQcICAsJCxULCxUsHRkdLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCwsLCz/wAARCACsASMDASIAAhEBAxEB/8QAHAABAAIDAQEBAAAAAAAAAAAAAAYHAQQIBQMC/8QAPBAAAQMCAQgJAgYBBAMBAAAAAAECBAMFEQYSITFBVZHSFRc1UVJxdZS0BxMUIjJCgaGxI1Nh8DNjkuH/xAAUAQEAAAAAAAAAAAAAAAAAAAAA/8QAFBEBAAAAAAAAAAAAAAAAAAAAAP/aAAwDAQACEQMRAD8AtUA1bhPh2uHJnzH5lCg1Fdm6Xucq4NYxNqquhAPvUqUqNOpWrVGU6NNqvqVKjmsYxqbXOdoIfcfqJk/FzmQqUifVTFEc1Pw8fFMU/wDJURX8GFf5QZSXO/18a7lpw6b3LGisX/TptXUrsP1O71X+MDwwJ4/6mXhXuWnbbc1iqqsa90hzmp3K5HIi/wDyhjrLvm7rZxk85BABO+su+butnGTzjrLvm7rZxk85BABO+su+butnGTzjrLvm7rZxk85BABOusu+butnGTzjrLvm7rZxk85BQBO+su+butnGTzjrLvm7rZxk85BABO+su+butnGTzjrLvm7rZxk85BABOusu+butnGTzmesu+butnGTzkEAE76y75u62cZPOOsu+butnGTzkEAE66y75u62cZPOZ6y75u62cZPOQQATrrLvm7rZxk85nrLvm7rZxk85BABO+su+butnGTzmOsu+butnGTzkFAE66zL5u62cZPOZ6y75u62cZPOQQATvrLvm7rZxk846y75u62cZPOQQATvrLvm7rZxk85uw/qauLGz7U3DFc+pCrKiomKYZtKsnH85W4Avi05R2G94tgyca6NRzo9dq0q6J3o12hf4VT1znJrnsc17HuY9io5jmOVrmqm1FTSWlkfllUuD6drur0Wa5MIsnBESRgirmVETRndy7fPWE7AAAAACpvqDenzLl0VScv4W2qiVETVUlubi5y6P2ouan8lsOcjGufhjmNc/DVjmtV2BztIkVJUiTKqqq1JNarIeq6VV1V6vXFf5A+QAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB+mPfTfTqU3OZUpvbUY9uhzHtXOa5F70PyAL3ybu3TVnhTnYffVHUJaImGEikua9UTuXQ5PM9grf6YyqmN/grj9tv4SaxcdCOfnUXJhhtzW8CyAAAA0Lyqts1+c1VRUtVxVFTQqKkd+lDn/u8kL/vXYt/9JuPx3lAJqTyQAAAAAAAAAAAAAAAAAfeNDnzc78HDlyUb+pYsetWa3ZpWm1UJTkjkhUvT2XC4Ncy0U3YsZpa6c5q/pauv7afuXbqTvLcpUqEenTo0KdOlRpojadOk1GU2ImxrW6AOdalOrSe+nVp1KdRi4Pp1WOY9q6U0teiL/R+S+L9YbffolWhXpsSUjHfhJOb/q0KmhUwdrzV1KhRdalUoVa9Cq3Nq0alSlUb4XscrXJxQD5gAAAAAAAAAAAAAAAAAAAAJp9NlXp6amOhbRXVU71SRHw/ypbZUn027fmekSPkRy2wAAA0L12Lf/Sbj8d5z+mpPJC/712Lf/Sbj8d5QCak8kAAAAAAAAAAAAAABL8kMkal6ey4XBjmWim7FjFxa6c5q/pbt+2m1dupO8ZIZI1L09lwuDXMtFN2LGaWunOav6W7ftp+5dupO8t5jKdNlOnTa1lOm1rGMYiNa1rUwRGomjAAxlOmxlOmxrKdNrWMYxERrGtTBGtRNGCH6BhVREc5yojWornOcqI1rU0qqquwDDn06TH1ajkZTpNdVqPdoaxjEznOVe5Dny4yKcufcpVNFSnJmSa9NF15lSq56Y8SX5Y5YLclq2u11FS3NVWyK7cUdMcmxv8A6/8APlrgwAAAAAAAAAAAAAAAAAAAAABNPpt2/M9IkfIjltlSfTbt+Z6RI+RHLbAAADz712Lf/Sbj8d5QCak8kOgL12Lf/Sbj8d5z+mpPJAAAAAAAAAAAAEvyRyQfensuFwa5loY78jFxa6c5F0tauv7afuXbqTvGSGSNS9vZcJ7XMtFN/wCRq4tdOe1f0tX/AG0/cu3UneW8xlOkynTpsaynTa1lNjERrWNamCNaiaMEAMZTpsZTpsaymxrWMYxEa1rWpgjWomjBD9AAYVURHOcqNa1Fc5zlRGtaiYqqquwqvLHLFbgtW12uorbe1c2TXaqostybGr/t/wCfLXP77aK96iJCbcpEKO9VWSkanTc+QmjBj3P/AGp3JrIp1YW/fM728YCsQWd1YW/fM728YdWFv3zO9vGArEFndWFv3zO9vGHVhb98zvbxgKxBZ3Vhb98zvbxh1YW/fM728YCsQWd1YW/fM728YdWFv3zO9vGArEFkSPpi1KTlh3iotZEVWtlx2fbdo0JjRVFTzwXyIFcbdOtUuvBm0/tyKOGciKjmua5MWvY5NaLs/wDwDUAAAAAAAAAAE0+m3b8z0iR8iOW2VJ9Nu35npEj5EctsAAANC9di3/0m4/Hec/pqTyQ6AvXYt/8ASbj8d5z+mpPJAAAAAAAAABnNz1azVnuaxV1YI5UQwNOxVRdi9ygdFR6FCLQjxqDEZRj0qdGkxuprGNRqIfUj2S2UUa/Qaec9G3GNTYybRXBHKqJm/eYm1rv6XR5yEAAAACIq6kXgZzXdy8FAwDOa7uXgozXdy8FAwDOa7uXgozXdy8FAwDOa7uXgozXdy8FAwDOa7uXgozXdy8FAwVz9TqNLMsEhGolVXTKDnJrcxEpvRq/8Iqrh5ljO/K1znrmta1XOc9Ua1ETSqqq6Cocu7/Fu82LFhPbUiW5tVPvNT8tWvUVEerF2tTBERdunYBDgAAAAAAAAABNPpt2/M9IkfIjltlSfTbt+Z6RI+RHLbAAADz712Lf/AEm4/HeUAmpPJC/712Lf/Sbj8d5QCak8kAAAAAAAAAAADZgzZlulUJsOq6lIouzmObqVNrXJqVq6lQujJvKSHlBFzm5tKdRan4uNjpaur7lParF/rUUcbMGdNtsqhMhVnUpFF2cxyaUVNrXJqVF2oB0MDwcm8pIWUEVXMzaU2i1PxcbO0tVdH3KeOlWL/Wrz94Dyb7Z+mIa0qcmvFl0s58WRQq1Kea9U/TURipi1dGP9atNNz6mUltlV4UyXcKUiiuDmrKkKipsex2dgrV2L/wBS+jw8osnIWUEX7dTNpTKKOWJJwxVir+yp3sXan8+YUv0nd94TvdV+cdJ3feE73VfnMT4E62Sq8KbSdSkUVwe1dKKi6nsdqVq60X/qaoG30nd94TvdV+cdJ3feE73VfnNQAbfSd33hO91X5zPSd33hO91X5zTAG30nd94TvdV+cdJ3feE73VfnNQAfetLnSGo2vKk1mouKNrVqlRqLhhiiPVUPgAAAAAAAAAAAAE0+m3b8z0iR8iOW2VJ9Nu35npEj5EctsAAAPPvXYt/9JuPx3lAJqTyQ6AvXYt/9JuPx3nP6ak8kAAAAAAAAAAAAAANmDOm22VQmQqrqUii7OY5upU2tcmpWrqVC6Mm8pIWUEXOYjaU6i1qS42OKtXV9ynjrYuzu1edHGzBnTbdKoTIdV1KRRdnMcmpU2tcmpUXagHQwPCybyjhZQRc9ubSnUWt/FxlX9K6vuU1XWxf61efugeDlLk5EyghOarUZPjsesGumCOR2GP2nqutjtvdr86Qex9N9Sm9qtfTc5j2uTS1zVzVRfI6Nxa38zlRGt/MqqqIiImlVVVOfLpWpSLldZFJcaVedLrUl1YsfVc5q4eQGmAAAAAAAAAAAAAAAAAAAAAmn027fmekSPkRy2ypPpt2/M9IkfIjltgAAB5967Fv/AKTcfjvKATUnkh0NPopJgXOMrlakiFLoK5ExzUqUXNxwOeU1Jo2IAAAAAAAAAAAAAAAABswZ022yqE2HWdSkUHYsc3UqbWuTUrV1KhY8H6lW11JOkrfJpVkRMVg/bq0nr3o2q9rk4qVeAJvlFl5IukevAt0d8WJXa6nXq1XI6RWpqv6URn5Wou3SuPem2EAAAAAAAAAAAAAAAAAAAAAAAE0+m3b8z0iR8iOW2VT9NKKOu93r52mhbadNG4a/v10VVx/4zP7LWAAAAi4Ki9xQ2UVuda7zdYao5KbZD6tBXY/moVl+4xcfJcP4L5Idlxk6+7Q2z4lNX3CCxUVjExdIjY4qxE726VT+U2gVCBgu1OIAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAB61gscq/3GlDpo5sZqtfPrtRcKNDWqY+J2pvnjsAsL6cW90azyp9RHI66SlqU0XbHoJ9pjk81zl4dxNz5UKFCNQoRqDEp0aFJlGkxNTWMRGtRD6gAAAAAEMykyGh3V1WbbnU4k9yvfVa5F/DyXKmOlE/S7/lO/ShWdwst8tSr0hAkUGJj/AKqtz6C4Y6UqsxZs7/8AJf5hcFRUVEVF1oqYovmigc4ZzPGzigzmeNvFDoF9nsNR76lS1Wx73qrnufDjOc5V1qqqzEx0Jk7ue1exi8gHP+czxt4oM5njbxQv/oTJ3c9q9jF5B0Jk7ue1exi8gFAZzPG3igzmeNvFDoDoTJ3c9q9jF5DHQmTu57V7GLyAUBnM8beKDOZ428UL/wChMndz2r2MXkHQmTu57V7GLyAUBnM8beKDOZ428UOgOhMndz2r2MXkMdCZO7ntXsYvIBQGczxt4oM5njbxQ6A6Eyd3PavYxeQx0Jk7ue1exi8gFAZzPG3igzmeNvFC/wDoTJ3c9q9jF5DPQmTu57V7GLyAc/5zPG3igzmeNvFC/wDoTJ3c9q9jF5B0Jk7ue1exi8gFAZzPG3igzmeNvFC/+hMndz2r2MXkM9CZO7ntXsYvIBz/AJzPG3igzmeNvFC/+hMndz2r2MXkM9CZO7ntXsYvIBz/AJzPG3igzmeNvFC/+hMndz2r2MXkHQmTu57V7GLyAUBnM8beKDOZ428UL/6Eyd3PavYxeQz0Jk7ue1exi8gHP+czxt4oM5njbxQ6A6Eyd3PavYxeQx0Jk7ue1exi8gFAZzPG3ih+qaLVe2lRR1Wq5cG06LVqVHLjhoazFf6L96Eye3PavYxeQ26EWFFajIsaPHYmODY9GnSTTr0MRNYFRWbITKC5uR81j7ZD/Kqurtasqoi6cKdHHR5uw8i1bXarZZ4rIdvoJSoouc/Srn1HrrfUeulVU3gAAAAAAf/Z" width="50" height="50" alt="submit"/>
                </form> -->
				<li class="nav-item active"><a class="nav-link" href="/index">HOME
						PAGE</a></li>
			
			</ul>

		</div>
	</div>
	</nav>
	<form>
		<!-- <div class="w-75" align="center"> -->
		<h2>List</h2>
		<table class="table table-striped">
			<thead>
				<tr>
					<td>Id</td>
					<td>Doctor's Name</td>
					<td>Patient's Name</td>
					<td>Doctor Comment</td>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${d}" var="d">
					<tr>
						<td>${d.id}</td>
						<td>${d.doctorsname}</td>
						<td>${d.patients_name}</td>
						<td>${d.doctor_comments}</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
	</form>

</body>
</html>