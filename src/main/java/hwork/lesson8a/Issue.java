package hwork.lesson8a;

public class Issue {
    public int dateOfissue;
    public String description;
    public IssueStatus issueStatus;

    public void printIssue(){
        System.out.println("Issue happened is " + description + "\nOn a date : "
                + dateOfissue + "\nCurrent status of the issue: " + issueStatus);
        System.out.println();
    }
}
