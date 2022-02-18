package hwOOPLesson10;

public class App {
    public static void main(String[] args) {
        // For QADep

        QADep dmitrii = new QADep("Dmitrii", "Semenov", 2022,
                Employees.Departments.QADep, Employees.TypeOfWork.Remote, QADep.TypeOfQA.Automation);
        String dmitriiInfo = dmitrii.getQAInfo();
        System.out.println(dmitriiInfo);

        QADep angelina = new QADep("Angelina", "Iksanova", 2021,
                Employees.Departments.QADep, Employees.TypeOfWork.OnSite, QADep.TypeOfQA.Manual);
        String angelinaInfo = angelina.getQAInfo();
        System.out.println(angelinaInfo);

        // For Employees
        Employees ivan = new Employees("Ivan", "Yarochkin", 2022,
                Employees.TypeOfWork.Remote);
        String ivanInfo = ivan.getEmployeeInfo();
        System.out.println(ivanInfo);

        Employees katya = new Employees("Katya", "Gluchova", 2020, Employees.TypeOfWork.Hybrid);
        String katyaInfo = katya.getEmployeeInfo();
        System.out.println(katyaInfo);

        // For DevDep
        DevDep jim = new DevDep("Jimmy", "Jameson", 1999,
                Employees.Departments.DEVDep, Employees.TypeOfWork.Remote, DevDep.TypeOfDev.FullStack, DevDep.ProgLanguage.Java);
        String jimInfo = jim.getDevInfo();
        System.out.println(jimInfo);

        DevDep gordon = new DevDep("Gordon", "Ramsey", 2005,
                Employees.Departments.DEVDep, Employees.TypeOfWork.OnSite, DevDep.TypeOfDev.FrontEnd, DevDep.ProgLanguage.CSS);
        String gordonInfo = gordon.getDevInfo();
        System.out.println(gordonInfo);

        // MarkDep
        MarkDep sonya = new MarkDep("Sonya", "Kim", 2017,
                Employees.Departments.MARKDep, Employees.TypeOfWork.OnSite, MarkDep.TypeOfMark.Digital);
        String sonyaInfo = sonya.getMarkInfo();
        System.out.println(sonyaInfo);

        MarkDep kenny = new MarkDep("Kenny", "South", 1999,
                Employees.Departments.MARKDep, Employees.TypeOfWork.OnSite, MarkDep.TypeOfMark.Content);
        String kennyInfo = kenny.getMarkInfo();
        System.out.println(kennyInfo);

    }
}

