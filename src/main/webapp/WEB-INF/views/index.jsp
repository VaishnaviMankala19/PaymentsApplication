<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Payments App</title>
    <link rel="stylesheet" type="text/css" href="/css/index.css">
    <script type="module" src="https://unpkg.com/@splinetool/viewer@1.9.82/build/spline-viewer.js"></script>
</head>
<body>

    <!-- 🌟 Navbar -->
    <nav class="navbar">
        <div class="logo">PaymentsApp</div>
        <ul class="nav-links">
            <li><a href="/">Home</a></li>
            <li><a href="#features">Features</a></li>
            <li><a href="#contact">Contact Us</a></li>
            <li><a href="/register">Register</a></li>
            <li><a href="/login" class="gradient-btn">Login</a></li>
        </ul>
    </nav>

    <!-- 🌟 Hero Section with Spline -->
    <div class="hero">
        <spline-viewer url="https://prod.spline.design/EURraSewp11m-RaS/scene.splinecode"></spline-viewer>
        <div class="hero-text">
            <h1>Welcome to Payments App</h1>
            <p>Empowering Your Finances, One Click at a Time.</p>
        </div>
    </div>

    <!-- 🎯 Gradient Wrapper Starts Here -->
    <div class="gradient-wrapper">

        <!-- 🚀 Features Section -->
        <section id="features" class="features-section">
            <h2 class="features-heading">Why Choose Us</h2>
            <div class="feature-cards">
                <div class="card">
                    <img src="https://img.icons8.com/fluency/96/headset.png" alt="Support 24/7" />
                    <h1>24/7 Support</h1>
                    <p>We’re always here for you. Reach out to our support team anytime, any day, and get instant help with your needs.</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/fluency/96/money-transfer.png" alt="Easy Transactions" />
                    <h1>Easy Transactions</h1>
                    <p>Transfer money instantly with our smooth and secure interface—no hassle, just tap and done.</p>
                </div>
                <div class="card">
                    <img src="https://img.icons8.com/fluency/96/lock--v1.png" alt="Secure" />
                    <h1>Top-Notch Security</h1>
                    <p>Your data and transactions are protected with industry-standard encryption and privacy controls.</p>
                </div>
            </div>
        </section>

        <!-- 🌟 Contact Us Section -->
        <section id="contact" class="contact-section">
            <div class="contact-card">
                <div class="contact-info">
                    <h2>Contact Us</h2>
                </div>
                <div class="contact-form">
                    <form>
                        <input type="text" placeholder="Your Name" required>
                        <input type="email" placeholder="Your Email" required>
                        <textarea placeholder="Your Message" rows="4" required></textarea>
                        <button type="submit">Send Message</button>
                    </form>
                </div>
            </div>
        </section>

        <!-- 🌟 Footer -->
        <footer class="footer">
            <p>&copy; 2025 PaymentsApp. All rights reserved.</p>
        </footer>

    </div>
    <!-- 🎯 Gradient Wrapper Ends Here -->

</body>
</html>
