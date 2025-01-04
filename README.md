# Rodeo-Electric
Rodeo Electric Website Case Study
# Project Structure

```bash
Rodeo-Electric/
├── .idea/                      # IntelliJ IDEA project configuration
├── .mvn/                       # Maven wrapper
│   └── wrapper/
│       └── maven-wrapper.properties
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/
│   │   │       └── rodeoelectric/
│   │   │           ├── config/              # Configuration files
│   │   │           │   └── SecurityConfig.java
│   │   │           ├── webapp/              # Web application logic
│   │   │           │   ├── controller/      # Controllers for handling HTTP requests
│   │   │           │   ├── dao/             # Data Access Objects
│   │   │           │   ├── entity/          # Entities representing database tables
│   │   │           │   ├── form/            # Form beans for input validation
│   │   │           │   └── ServletInitializer.java
│   │   │           └── RodeoElectricApplication.java # Main Spring Boot Application
│   │   ├── resources/
│   │   │   ├── application.properties       # Spring Boot configuration
│   │   │   ├── static/                      # Static files
│   │   │   │   ├── css/                     # CSS files
│   │   │   │   ├── images/                  # Image assets
│   │   │   │   └── js/                      # JavaScript files
│   │   │   └── webapp/                      # JSP and public resources
│   │   │       ├── pub/                     # Public assets like CSS, JS, and images
│   │   │       │   ├── css/
│   │   │       │   ├── images/
│   │   │       │   └── js/
│   │   │       └── WEB-INF/
│   │   │           ├── jsp/                 # JSP views
│   │   │           │   ├── customer/        # Customer-related JSPs
│   │   │           │   │   ├── create.jsp
│   │   │           │   │   ├── edit.jsp
│   │   │           │   │   └── list.jsp
│   │   │           │   ├── include/         # Shared JSP components
│   │   │           │   │   ├── footer.jsp
│   │   │           │   │   ├── header.jsp
│   │   │           │   │   └── navbar.jsp
│   │   │           │   ├── login/           # Login-related JSPs
│   │   │           │   │   ├── loginPage.jsp
│   │   │           │   │   └── signup.jsp
│   │   │           │   └── index.jsp        # Homepage JSP
│   │   │           └── error.jsp            # Error page
├── test/
│   ├── java/
│   │   └── com/
│   │       └── rodeoelectric/
│   │           ├── dao/                     # DAO tests
│   │           │   ├── CustomerDAOTest.java
│   │           │   ├── ServiceDAOTest.java
│   │           │   └── UserDAOTest.java
│   │           ├── controller/              # Controller tests
│   │           │   └── CustomerControllerTest.java
│   │           └── RodeoElectricApplicationTests.java # Application tests
├── .gitignore                   # Git ignore rules
├── HELP.md                      # Project help file
├── mvnw                         # Maven wrapper scripts
├── mvnw.cmd
├── pom.xml                      # Maven configuration
└── README.md                    # Project documentation
