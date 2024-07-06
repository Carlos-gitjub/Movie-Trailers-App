# Movie-Trailers-App
App taken from the youtube video https://www.youtube.com/watch?v=5PdEmeopJVQ&list=LL&index=4&t=383s.

This is a full Stack Development.

The code of this repository is the necessary if you want to replicate the whole Web App (API + Client side). Because it is not going to production, it contains the .env file (for guidance porpuses), but in reality it should not be made public. Thats why it is in the .gitignore file, so that when a push is made to the public repo, it does not leave the production environment.

The code required some modifications in order to be able to connect React to the API endpoints. Because the two technologies, Spring and React, use different domains (http://localhost:8080 and http://localhost:3000 respectively), there may be CORS (Cross Origin Resource Sharing) issues. The video offers a solution that uses only Axios to work around this issues without touching the code in the Spring app, but it does not work. So we did two things: 1. configure Axios (axiosConfig.js) to put the baseURL for the api calls in React to http://localhost:8080 and 2. allow CORS with the React domain (http://localhost:3000) in the Spring application through the WebConfig class. The configuration with WebConfig Class is global and applys CORS rules application-wide as we wanted (for specific controllers or methods use `@CrossOrigin` annotation).

Other minor differences from the code of the video ocurred in the Frontend side: the use of `useState([])` instead of `useState()` and proper initialization of some variables as an empty array (`reviews = []`) instead of undefined or null.

We added folders for the controllers, repositories, entities and services. 

Changed the `Review` class by setting the `collection` attribute of the `@Document` annotation  to "reviews" instead of "movies". This way, and thanks to the @DocumentReference annotation of the `Movie` Class, the `createReview` method of the `ReviewService` class inserts a new review document in reviews collection and pushes an object containing the review’s id and body into the Movie document’s reviewIds array. This way the annotation @DocumentReference works as expected (this annotation helps to create relationships between documents stored in different collections, similar to the concept of foreign keys in relational databases).


## Backend
Made with Spring Boot.

Is an API.

## Frontend
Made with React.

Use of Bootstrap and CSS.

React Player for the movie trailers.

## Database
MongoDB.

In the Cloud (MongoDB Atlas).
