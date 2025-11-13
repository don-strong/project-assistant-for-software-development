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
- README.md

---

## 🧩 Planned Features / Future Work    
-Fully functional pop-up reminder system (JavaFX + SceneBuilder) | In Progress |
-Enhanced data storage system (user responses and preferences) | In Progress |
- Questions for pop-up | In Progress |
-Smart timer system that adjusts to user input | In Progress |
-Option to ignore or pause reminders / self-shutdown timer | In Progress |
-Expanded question pool for different work types
-Search for results
-UX testing and refinement

---

## 📅 Week-by-Week Plan
*(This should align with your project’s real timeline — update each week’s goals.)*

| **Week** | **Milestone / Deliverables** | **Owners** | **Evidence (PRs/Links/Demos)** |
|-----------|------------------------------|-------------|--------------------------------|
| 1 | Proposal completion, assign roles, and plan structure | Avery & Luci | Initial commits, requirements doc, meeting notes |
| 2 | Define main controllers, implement storage layer, UI prototype classes (pop up and reminders) | Avery, Luci, Chris | working structure branch, README, WIKI|
| 3 | Functioning prototype starts and stores user input | Luci, Chris, Avery | WIKI: Design elements- Json, java, and fxml files|
| 4 | UI screens in SceneBuilder core framework are finished. | Avery & Bryan | In Progress... |
| 5 | Integrate pop ups with timer logic, implement independent popups in JavaFX.  | Team | Demo with popups, demo video |
| 6 | Refine UI and test, begin documentation for final submission (Thanksgiving). | Avery & Bryan | User testing feedback, UI refinement commits |
| 7 | Integrate any other modules, Fix bugs and polish, prepare .exe, finish documentation and presentation practice | Team | Final tagged v1.0, .exe upload to git, screenshots and demo |
| 8 | All files uploaded and pushed to main. Deliver application with presentation | Team | Project submission | 

---

## 🧠 Definition of Done (DoD) (Changes to weekly tasks)
> A feature is **done** when:
- Code is reviewed and merged into main / wiki
- All acceptance criteria are met
- Unit tests pass in CI/CD
- Demo shows functional feature without breaking existing functionality
- Documentation (README / inline comments) is up to date

## 💻 How to Run

**Your Entry:** > Assistant for Developers ### 1. Clone Repository
git clone https://github.com/example-url/flowspace.git
cd flowspace

### 2. Backend Setup (Java)
python -m venv venv
source venv/bin/activate
pip install -r requirements.txt
flask run

### 3. Frontend Setup (React)
cd client
npm install
npm start
