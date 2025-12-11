# 🧭 CS 301 Group Project — README
---

## 📘 Assistant for Developers
A desktop productivity assistant designed to help programmers manage stress and maintain efficiency through friendly pop-up reminders, productivity suggestions, and time management guidance based on their work habits and preferences.

---

## 👥 Group Members / Contributors
**Your Entry:**  
| Name | Role | GitHub Username |
|------|------|-----------------|
| Avery Rochon | Developer / UI & UX Engineer | @aroch0 |
| Christopher Iverson | Database Engineer | @Christopher-iverson |
| Luci Crow | Project Manager / Database Engineer | @Lucislight |
| Bryan (Lawrence) Branch | Developer/ UI & UX Engineer| @LawrenceBranch |

---

## 🧭 Brief Background About the Project
**Your Entry:**  Programmers often face stress and productivity loss due to poor time management and lack of structured workflow tools. This can lead to burnout and inefficient work habits. Computer based professionals who want to improve focus, maintain work-life balance, and reduce stress while coding or managing software projects. This application is for Developers that provides a welcoming desktop app that delivers personalized reminders, tips, and breaks through pop-ups. These prompts are informed by research-based productivity and stress-management techniques, helping users maintain healthy, sustainable work habits. This assistant will also create and implement a knowledge base of previous programming issues to increase efficiency and reduce stress. 
---

## ⚙️ Current Features
**Your Entry:**  
- Display Form, show an initial JavaFX form with questions about work habits and problem-solving syle.
- Collect answers entered by user into Text Fields or radio buttons.
- Store user responses in local CSV or JSON file.(Online database now)
- Allow users to pause and resume timer temporarily.
- Provide form for users to input problem and solution text.
- Store problem and solution in local database or CSV.
- All users to view all past entries in a table.
- App Creates CSV/noSQL database on first launch.
- Add text input for keyword search.(Search still non-functional but box exists).

---

## 🧩 Planned Features / Future Work    

---

## 📅 Week-by-Week Plan
*(This should align with your project’s real timeline — update each week’s goals.)*

| **Week** | **Milestone / Deliverables** | **Owners** | **Evidence (PRs/Links/Demos)** |
|-----------|------------------------------|-------------|--------------------------------|
| 1 | Proposal completion, assign roles, and plan structure | Team | Initial commits, requirements doc, meeting notes |
| 2 | Initial UI prototype created; FIRST popup + reminder mockups only. Database and class structure agreed upon and drawn up | Avery, Luci, Chris | working structure branch, README, WIKI|
| 3 | Java classes created and structure setup for database/ database agreed upon for future usage | Luci, Chris, Avery | WIKI: Design elements- Json, java, and fxml files|
| 4 | UI screens mostly created in SceneBuilder. Framework established but not fully functional. | Avery | fxml files |
| 5 |  Timer worked on and tester methods implemented to make sure it works. Database logic for MongoDB Compass finished and tested in main class | Luci & Chris | java files |
| 6 | Time off (Thanksgiving) | N/A | N/A |
| 7 | Controllers created and implemented to work with timer, database logic. Classes packaged in maven. Changed structure of folders in github to reflect our own. | Luci, Chris, Bryan | java files |
| 8 | pom finalized for app packaging and runtime. .exe packaged using Jar file. Final files pushed to main. Delivered application and presentation with the product in its current working state. | Team | Project submission, pom, Final tagged v1.0, .exe upload to git, demo |

---

## 🧠 Definition of Done (DoD) (Changes to weekly tasks)
> A feature is **done** when:
- Code is reviewed and merged into main / wiki
- All acceptance criteria are met
- Unit tests pass in CI/CD
- Demo shows functional feature without breaking existing functionality
- Documentation (README / inline comments) is up to date

## 💻 How to Run
**Your Entry:** > Assistant for Developers 
### 1. Clone Repository
git clone https://github.com/don-strong/project-assistant-for-software-development.git

### 2. Code Setup

Install vscode

Download the following extensions:
extension pack for java
maven for java
debugger for java

run these commands in powershell:

winget install EclipseAdoptium.Temurin.17.JDK

winget install Apache.Maven

open folder in vscode using the open folder tab using maven
create a new project utilizing the database folders utilizing maven

run this in the terminal for vscode using powershell while
in the main folder of the program the (top most folder)

utilize cd and ls to find directory and correct folder and move to it
mvn clean install

mvn javafx:run
