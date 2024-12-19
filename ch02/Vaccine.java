import javax.swing.*;

public class Vaccine {
    public static void main(String[] args) {
        String vaccine = JOptionPane.showInputDialog("請輸入疫苗名稱(選項包含:AZ,Moderna,BNT,Janssen): ");
        vaccine = vaccine.toLowerCase();
        if (vaccine.equals("az")) {
            JOptionPane.showMessageDialog(null, "AZ\n研發國:英國、瑞典\n疫苗類型:腸病毒疫苗\n劑量:2\n保護力:81%");
        } else if (vaccine.equals("moderna")) {
            JOptionPane.showMessageDialog(null, "Moderna\n研發國:英國、瑞典\n疫苗類型:腸病毒疫苗\n劑量:5\n保護力:63%");
        } else if (vaccine.equals("bnt")) {
            JOptionPane.showMessageDialog(null, "BNT\n研發國:英國、瑞典\n疫苗類型:腸病毒疫苗\n劑量:10\n保護力:22%");
        } else if (vaccine.equals("janssen")) {
            JOptionPane.showMessageDialog(null, "Janssen\n研發國:英國、瑞典\n疫苗類型:腸病毒疫苗\n劑量:12\n保護力:45%");
        } else {
            JOptionPane.showMessageDialog(null, "請重新確認輸入內容是否符合選項!!");
        }
    }
}
