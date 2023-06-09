import java.util.ArrayList;
import java.util.HashMap;


public class MedicalCheckupWithoutDB {
    public static void main(String[] args) {
        try {
            ArrayList<HashMap> medicList = new ArrayList<HashMap>();
            HashMap<String, String> medicalCheck = new HashMap<String, String>();
            medicalCheck.put("이름", "홍길동");
            medicalCheck.put("성별", "남");
            medicalCheck.put("나이", "30");
            medicalCheck.put("키", "175");
            medicalCheck.put("혈압", "120/80");
            medicalCheck.put("유지방안", " ");
            medicalCheck.put("체중", "75");
            medicalCheck.put("혈당", "90");
            medicList.add(medicalCheck);
            
            medicalCheck = new HashMap<String, String>();
            medicalCheck.put("이름", "김영희");
            medicalCheck.put("성별", "여");
            medicalCheck.put("나이", "25");
            medicalCheck.put("키", "160");
            medicalCheck.put("혈압", "110/70");
            medicalCheck.put("유지방안", " ");
            medicalCheck.put("체중", "55");
            medicalCheck.put("혈당", "85");
            medicList.add(medicalCheck);

            medicalCheck = new HashMap<String, String>();
            medicalCheck.put("이름", "박철수");
            medicalCheck.put("성별", "남");
            medicalCheck.put("나이", "45");
            medicalCheck.put("키", "180");
            medicalCheck.put("혈압", "130/85");
            medicalCheck.put("유지방안", "식습관 게산,운동 계획");
            medicalCheck.put("체중", "85");
            medicalCheck.put("혈당", "100");
            medicList.add(medicalCheck);

            medicalCheck = new HashMap<String, String>();
            medicalCheck.put("이름", "이지은");
            medicalCheck.put("성별", "여");
            medicalCheck.put("나이", "35");
            medicalCheck.put("키", "165");
            medicalCheck.put("혈압", "115/95");
            medicalCheck.put("유지방안", " ");
            medicalCheck.put("체중", "60");
            medicalCheck.put("혈당", "95");
            medicList.add(medicalCheck);

            medicalCheck = new HashMap<String, String>();
            medicalCheck.put("이름", "최민호");
            medicalCheck.put("성별", "남");
            medicalCheck.put("나이", "28");
            medicalCheck.put("키", "170");
            medicalCheck.put("혈압", "125/80");
            medicalCheck.put("유지방안", " ");
            medicalCheck.put("체중", "70");
            medicalCheck.put("혈당", "92");
            medicList.add(medicalCheck);

            for (HashMap<String, String> medic:medicList){
                System.out.println(medic.get("이름")
                +medic.get("성별")
                +medic.get("나이")
                +medic.get("키")
                +medic.get("혈압")
                +medic.get("체중")
                +medic.get("혈당")
                +medic.get("유지방안"));
            }

            System.out.println();
        } catch (Exception e) {
            // TODO: handle exception
        }
        // return 0;
    }
}
