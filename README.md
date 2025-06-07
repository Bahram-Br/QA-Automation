# Quick Guide: Upload Eclipse Project to GitHub

## 1. Create a New Repository on GitHub
- Log in to GitHub and click "New repository"
- Enter the repository name (e.g., `QA-Automation`)
- Create the repo without initializing README or .gitignore

## 2. Open Command Prompt in Your Project Root
- Navigate to your project root folder (e.g., `D:\wps\Workspace\QA-Automation`)

## 3. Initialize Git Repository (if not done yet)
```bash
git init
git add .
git config --global user.name "Your Name"
git config --global user.email "your.email@example.com"
git commit -m "Initial commit with Selenium TestNG framework"
git remote add origin https://github.com/your-username/repository-name.git
git push -u origin main

## 4. If you need to change your code
git add .
git commit -m "commit message"
git push
