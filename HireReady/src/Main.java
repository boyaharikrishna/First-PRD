
public class Main {

    public static void main(String[] args) {
        // ------------------------------------------------
        // 1. Candidate Profile (Hardcoded Data)
        // ------------------------------------------------
        String candidateName = "Aarav";
        int registrationNumber = 24031;
        String degree = "B.E. Computer Science";
        int graduationYear = 2026;
        double degreePercentage = 72.5;
        int activeBacklogs = 0;

        int aptitudeCorrectAnswers = 38;
        int aptitudeTotalQuestions = 50;
        int codingTestCasesPassed = 8;
        int codingTotalTestCases = 10;
        int communicationScore = 68;
        boolean projectCompleted = true;
        boolean profileVerified = true;

        // ------------------------------------------------
        // 2. Calculations (Avoiding Integer Division)
        // ------------------------------------------------
        double aptitudePercentage = (double) aptitudeCorrectAnswers / aptitudeTotalQuestions * 100;
        double codingPercentage = (double) codingTestCasesPassed / codingTotalTestCases * 100;

        // ------------------------------------------------
        // 3. Boolean Eligibility Conditions
        // ------------------------------------------------
        boolean degreeEligible = degreePercentage >= 60;
        boolean backlogEligible = activeBacklogs == 0;
        boolean graduationYearEligible = graduationYear >= 2025 && graduationYear <= 2027;
        boolean aptitudeEligible = aptitudePercentage >= 60;
        boolean codingEligible = codingPercentage >= 70;
        boolean communicationEligible = communicationScore >= 60;
        boolean projectEligible = projectCompleted;
        boolean verificationEligible = profileVerified;

        // Combined eligibility condition using compound logical operators
        boolean applicationEligible = degreeEligible && backlogEligible && graduationYearEligible
                && aptitudeEligible && codingEligible && communicationEligible
                && projectEligible && verificationEligible;

        // ------------------------------------------------
        // 4. Candidate Profile & Assessment Report Display
        // ------------------------------------------------
        System.out.println("================================================");
        System.out.println("        CAMPUS PLACEMENT APPLICATION REPORT      ");
        System.out.println("================================================");

        System.out.println("Candidate Name          : " + candidateName);
        System.out.println("Registration Number     : " + registrationNumber);
        System.out.println("Degree                  : " + degree);
        System.out.println("Graduation Year         : " + graduationYear);
        System.out.println("Degree Percentage       : " + degreePercentage);
        System.out.println("Active Backlogs         : " + activeBacklogs);

        System.out.println("\n------------------------------------------------");
        System.out.println("Aptitude Score          : " + aptitudeCorrectAnswers + " / " + aptitudeTotalQuestions);
        System.out.println("Aptitude Percentage     : " + aptitudePercentage);
        System.out.println("Coding Test Cases       : " + codingTestCasesPassed + " / " + codingTotalTestCases);
        System.out.println("Coding Percentage       : " + codingPercentage);
        System.out.println("Communication Score     : " + communicationScore);

        System.out.print("Project Completed       : ");
        if (projectCompleted) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        System.out.print("Profile Verified        : ");
        if (profileVerified) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        // ------------------------------------------------
        // 5. Individual Eligibility Results Display
        // ------------------------------------------------
        System.out.println("\n------------------------------------------------");
        System.out.println("Degree Eligibility      : " + (degreeEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Backlog Eligibility     : " + (backlogEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Graduation Year         : " + (graduationYearEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Aptitude Eligibility    : " + (aptitudeEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Coding Eligibility      : " + (codingEligible ? "Eligible" : "Not Eligible"));
        System.out.println("Communication Status    : " + (communicationEligible ? "Eligible" : "Not Eligible"));

        // ------------------------------------------------
        // 6. Decision Logic (Final Status & Next Action)
        // ------------------------------------------------
        System.out.println("\n------------------------------------------------");
        if (!degreeEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve the required degree percentage.");
        } else if (!backlogEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Clear all active backlogs.");
        } else if (!graduationYearEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Check the eligible graduation-year criteria.");
        } else if (!aptitudeEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve aptitude assessment performance.");
        } else if (!codingEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve coding assessment performance.");
        } else if (!communicationEligible) {
            System.out.println("Application Status : Not Eligible");
            System.out.println("Next Action        : Improve communication assessment performance.");
        } else if (!projectEligible) {
            System.out.println("Application Status : Application On Hold");
            System.out.println("Next Action        : Complete the required project.");
        } else if (!verificationEligible) {
            System.out.println("Application Status : Application On Hold");
            System.out.println("Next Action        : Complete profile verification.");
        } else {
            System.out.println("Application Status : Eligible to Apply");
            System.out.println("Next Action        : Submit the company application.");
        }
        System.out.println("================================================");
    }
}
