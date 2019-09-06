<!DOCTYPE Html>
<html lang="en">
	
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<head>
	<link rel="stylesheet" type="text/css" href="vendors/css/normalize.css">
	<link rel="stylesheet" type="text/css" href="vendors/css/grid.css">
	<link rel="stylesheet" type="text/css" href="vendors/css/ionicons.min.css">
	<link rel="stylesheet" type="text/css" href="Resources/css/style.css">
	<link rel="stylesheet" type="text/css" href="Resources/css/queries.css">
	<link href="https://fonts.googleapis.com/css?family=Lato:100,300,300i,400" rel="stylesheet">
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
	<title>Travel Line</title>
	
	</head>

	<body>
		<header>
			
				<div class="row">
					<img src="Resources/img/travelline.jpg" alt="Travelline logo" class="logo">
					
					<ul class="main-nav">
						<li><a href="#">Home</a></li>
						<li><a href="contacts.html">Contacts</a></li>
						<li><a href="#">Retrieval</a></li>
						<li><a href="feedback.jsp">Feedback</a></li>
						<li><a href="gallery.html">Gallery</a></li>
						<li><a href="Schedules1">Schedules</a></li>
						<li><a href="admin.jsp">Admin Login</a></li>
					</ul>
				</div>
			</header>
		<section>
			<div class="hero-text-box">
			<h4>Please Give Your Valuable Feedback</h4>
			<div class="Admin-Login" >
				<form action="Feedback" method="post">
				<div class="form-group">
				    <label for="text" class="Admin">Name:</label>
				    <input type="text" class="form-control frm-control" id="Admin Names" name="name" placeholder="Enter Name" required>
				</div>
				<div class="form-group">
				    <label for="pwd" class="Admin">Email:</label>
				    <input type="email" class="form-control frm-control" id="email"  name="email" placeholder="Enter email" required>
                </div>
                <div class="form-group">
                    <label for="pwd" class="Admin">Comment:</label>
                    <textarea name="comments"  class="form-control frm-control"  placeholder="Your Message"></textarea>

                </div>
				<input type="submit" class="btn btn-warning btn-col" >
				<input type="reset" class="btn btn-warning btn-col" value="Cancel" >
				</form>
			</div>
			
			</div>
</section>


	
	</body>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/respond.js/1.4.2/respond.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/html5shiv/3.7.2/html5shiv.min.js"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/selectivizr/1.0.2/selectivizr-min.js"></script>
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
		<script src="Resources/js/script.js"></script>

		<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
		<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
		<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
		
</html>




