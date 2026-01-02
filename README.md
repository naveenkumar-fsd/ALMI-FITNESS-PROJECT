# 🏋️ ALMI_S Fitness Center – Full Stack Web Application

ALMI_S Fitness Center is a full-stack fitness management web application designed to represent a modern gym’s digital platform.  
This project demonstrates real-world frontend design, backend development, authentication, database integration, and production-ready workflows.

---

## 🚀 Project Objective

• Build a real-world fitness website using Java Full Stack  
• Apply Spring Boot backend with REST APIs  
• Implement authentication, payments, and email services  
• Design a responsive, professional UI  
• Create a strong portfolio project for interviews  

---

## ✨ Key Features

### 👤 User Features
• User login & logout  
• Session handling using localStorage  
• Auto-fill logged-in user email across forms  
• View fitness programs & trainers  
• Membership plans (Basic / Standard / Premium)  
• Demo payment flow with success confirmation  
• QR / UPI payment UI (frontend demo)  
• Contact form with email notification  
• Toast notifications for user actions  
• Fully responsive UI (mobile, tablet, desktop)  

---

### 🧑‍💼 Backend Features
• RESTful APIs using Spring Boot  
• Layered architecture (Controller → Service → Repository)  
• MySQL database integration  
• Contact messages stored in database  
• Email service using SMTP  
• Payment API endpoint  
• Secure credential handling using environment variables  

---

## 🛠️ Tech Stack

### Frontend
• HTML5  
• CSS3 (custom responsive design, animations)  
• JavaScript (Vanilla JS)  

### Backend
• Java  
• Spring Boot  
• Spring MVC  
• Spring Data JPA  
• REST APIs  

### Database
• MySQL  

### Tools
• VS Code  
• Spring Tool Suite (STS)  
• Postman  
• Git & GitHub  

---

## 📂 Project Structure

ALMI_Fitness_Project  
├── frontend  
│   ├── home.html  
│   ├── programs.html  
│   ├── trainers_profile.html  
│   ├── membership.html  
│   ├── contact.html  
│   ├── login.html  
│   ├── style.css  
│   └── images  
│  
├── backend  
│   ├── controller  
│   ├── service  
│   ├── repository  
│   ├── entity  
│   └── application.properties  
│  
└── README.md  

---

## 🔐 Authentication Workflow

• User logs in → email stored in localStorage  
• Navbar dynamically updates based on login state  
• Only logged-in users can proceed with membership payment  
• Logout clears user session  

---

## 💳 Payment Workflow (Demo)

• User selects a membership plan  
• Payment modal opens with plan & amount  
• Payment details sent to backend API  
• Backend responds with success  
• UI shows success toast & disables repeat payment  

⚠️ Note: This is a demo payment flow, not a real payment gateway.

---

## 📧 Email Workflow

• User submits contact form  
• Data saved in MySQL  
• Email notification sent to admin email  
• SMTP credentials secured using environment variables  

---

## 📱 Responsive Design

• Mobile-first design  
• Hamburger menu for mobile view  
• Tablet & desktop optimized layouts  
• Smooth animations without layout shifting  

---

## 🌟 Why This Project Is Strong

• Complete frontend + backend integration  
• Real-world features (auth, payment, email)  
• Clean & scalable architecture  
• Interview-ready project explanation  
• Suitable for startup & product company roles  

---

## 🔮 Future Enhancements

• Admin dashboard (users, payments, memberships)  
• JWT-based authentication  
• Real payment gateway (Razorpay / Stripe)  
• User profile & payment history  
• Deployment on AWS / Render / Railway  
• CI/CD pipeline  

---

## 🧑‍💻 Author

Naveen Kumar M  
Aspiring Java Full Stack Developer  

---

## 📌 Final Note

This project is built to demonstrate industry-level full-stack development skills.  
It reflects practical knowledge, problem-solving ability, and readiness for real-world software development roles.
