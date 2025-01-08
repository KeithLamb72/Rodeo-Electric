# Rodeo-Electric
Rodeo Electric Website Case Study
# Project Structure
``` bash
Rodeo-Electric/
├── .idea/                        # IntelliJ IDEA project configuration
├── .mvn/                         # Maven wrapper
│   └── wrapper/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── rodeoelectric/
│   │   │           ├── config/            # Configuration files
│   │   │           │   └── SecurityConfig.java
│   │   │           ├── myapp/             # Application logic
│   │   │           │   ├── controller/    # Controllers for handling HTTP requests
│   │   │           │   ├── database/      # Database-related logic
│   │   │           │   └── form/          # Form beans for input validation
│   │   │           ├── RodeoElectricApplication.java # Main Spring Boot Application
│   │   │           └── ServletInitializer.java       # Servlet initializer
│   ├── resources/
│   │   ├── static/                 # Static files (CSS, JS, images)
│   │   ├── templates/              # Templates folder
│   │   └── application.properties  # Spring Boot configuration
│   ├── webapp/
│   │   ├── pub/                    # Public assets like CSS, JS, and images
│   │   └── WEB-INF/
│   │       ├── jsp/                # JSP views
│   │       │   ├── customer/       # Customer-related JSPs
│   │       │   ├── include/        # Shared JSP components
│   │       │   ├── login/          # Login-related JSPs
│   │       │   ├── about.jsp       # About page
│   │       │   ├── contact.jsp     # Contact page
│   │       │   ├── error.jsp       # Error page
│   │       │   ├── index.jsp       # Homepage
│   │       │   └── services.jsp    # Services page
├── test/
├── target/
├── .gitignore                     # Git ignore rules
├── HELP.md                        # Project help file
├── mvnw                           # Maven wrapper script
├── mvnw.cmd
├── pom.xml                        # Maven configuration
└── README.md                      # Project documentation
