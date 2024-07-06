import axios from 'axios';

const axiosInstance = axios.create({
  baseURL: 'http://localhost:8080', // Replace with your Spring Boot API base URL
  headers: {"ngrok-skip-browser-warning": "true"}
});

export default axiosInstance;