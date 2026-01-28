# Password Strength Regex Tester

## 1. Project Title & Goal
A Java console utility that validates password strength using regex-based security rules.

## 2. Setup Instructions
    javac PasswordStrengthTester.java
    java PasswordStrengthTester

## 3. The Logic (How I thought)
   Why did I choose this approach?
   I used Java regex to efficiently check password complexity rules like numeric and special character presence without manual iteration.

   What was the hardest bug I faced, and how did I fix it?
   Identifying special characters correctly was tricky. I solved it using a regex that excludes alphanumeric characters.

## 4.Output Screenshot
    [Output Screenshots](Screenshots)

## 5. Future Improvements
    If I had 2 more days, I would:
    - Accept user input passwords via console to validate dynamically instead of using a fixed list
    - Add uppercase and lowercase validation
    - Include unit tests for validation logic