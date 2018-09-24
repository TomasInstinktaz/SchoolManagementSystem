//package com.vcs.mvn.main;
//
//import com.vcs.mvn.persons.Student;
//import com.vcs.mvn.persons.Teacher;
//import com.vcs.mvn.register.Register;
//
//import java.util.*;
//
//public class Main {
//
//    public static void main(String[] args) {
//        // TODO Auto-generated method stub
//
//        List<Teacher> teachersList = new ArrayList<>();
//        teachersList.add(new Teacher(1,"Antanas", "Antanavicius", 40, "Matematika"));
//        teachersList.add(new Teacher(2,"Simas", "Simaitis", 32, "Matematika"));
//        teachersList.add(new Teacher(3,"Arturas", "Artuinas", 40, "Fizika"));
//        teachersList.add(new Teacher(4,"Inga", "Inaviciene", 35, "Lietuviu"));
//        teachersList.add(new Teacher(5,"Loreta", "Loreviciene", 30, "Anglu"));
//
//        List<Student> studentsList = new ArrayList<>();
//        studentsList.add(new Student(1,"Simas", "Sitanavicius", 10));
//        studentsList.add(new Student(2,"Simas", "Binaitis", 11));
//        studentsList.add(new Student(3,"Arturas", "Gai", 12));
//        studentsList.add(new Student(4,"Inga", "Virtuvine", 13));
//        studentsList.add(new Student(5,"Loreta", "Lounge", 10));
//
//        List<Integer> markList = new ArrayList<>();
//        markList.add(5);
//        markList.add(8);
//        markList.add(10);
//        markList.add(2);
//        markList.add(3);
//        List<Register> registerList = new ArrayList<>();
//        for (int i = 0; i < studentsList.size(); i++) {
//            int new_int = i + 1;
//            registerList.add(new Register(new_int, studentsList.get(i), teachersList.get(i), markList.get(i)));
//        }
//
//
//        /**
//         * Created Map array
//         */
////        Map<String, String> hashMap = new HashMap<>();
////
//        HashMap<String, HashMap<String, HashMap<String, String>>> finalArrayTotal = new HashMap<String, HashMap<String, HashMap<String, String>>>();
//        HashMap<String, HashMap<String, String>> finalArraySmall = new HashMap<String, HashMap<String, String>>();
//
//        String[] dateArray = {"1","2","3","4","5"};
//        String[] studentArray = {"1","2","3","4","5","6","7"};
//        String[] teacherArray = {"1","2","3","4","5","6", "7", "8", "9", "10"};
//        String[] marksArray = {"1","2","3","4","5","6", "7", "8", "9", "10"};
//
//
//        for (int i = 0; i < dateArray.length; i++) {
//            finalArraySmall.put(dateArray[i], new HashMap<String, String>());
//        }
//        System.out.println(finalArraySmall.get(dateArray[2]));
//
//
////        for (int i = 0; i < dateArray.length; i++) {
////            for (int j = 0; j < studentArray.length; j++) {
////                finalArrayTotal.get(dateArray[i]).put(studentArray[j], new HashMap<String, String>());
////
////            }
////        }
////        System.out.println(finalArrayTotal.get(dateArray[2]).get(studentArray[3]));
////
////        for (int i = 0; i < dateArray.length; i++) {
////            for (int j = 0; j < studentArray.length; j++) {
////                for (int k = 0; k < teacherArray.length; k++) {
////                    finalArrayTotal.get(dateArray[i]).get(studentArray[j]).put(teacherArray[k], marksArray[k]);
////                }
////            }
////        }
//
//        for (int i = 0; i < dateArray.length; i++) {
//            for (int j = 0; j < studentArray.length; j++) {
//                for (int k = 0; k < teacherArray.length; k++) {
//                    finalArrayTotal.get(dateArray[i]).get(studentArray[j]).put(teacherArray[k], marksArray[k]);
//                }
//            }
//        }
//
////        System.out.println(finalArrayTotal.get(dateArray[2]).get(studentArray[3]).get(teacherArray[3]));
//
//        System.out.println(finalArrayTotal.get("2").get("3").get("3"));
//
//        private Map<String, Integer> registras = new HashMap<>();
//
//
//
//
//        int mokinysId;
//        int mokytojoId;
//        int diena;
//
//        public void addToMap( int mokinysId;
//        int mokytojoId;
//        int pazymis;) {
//            registras.construckey(mokinysId, mokytojoId, pazymis);
//        }
//
//        Mapai m = new Mapai();
//
//        m.addToMap(1, 1, 1, 2);
//        System.out.println(m.findBy(1,1,1));
//
//        fpublic void FindBy( int mokinysId;
//        int mokytojoId;
//        int diena,
//        int diena;) {
//
//        }
//
//        public String ConstructKey( int mokinysId;
//        int mokytojoId;
//        int diena;) {
//            return "" + mokinysId + " " + mokytojoId + " " + diena;
//        }
//
//
//
//
//
//
//
//
//
//
////        HashMap<String, HashMap<String, String>> finalArray = new HashMap<String, HashMap<String, String>>();
//
//        //Initialize each day key ahead of time
////        for(String date : dateArray) { // foreach date in dateArray
////            if (!finalArray.containsKey(date)) {
////                finalArray.put(date, new HashMap<String, String>());
////            }
////        }
//
//
////        for (int i = 0; i < dateArray.length; i++) {
////            for (int j = 0; j < studentArray.length; j++) {
////                finalArray.get(dateArray[i]).put("student_id" + j, studentArray[j]);
////            }
////        }
//        //display output
////        for(String date : dateArray) {
////            System.out.println("Days: " + date);
////            System.out.println(finalArray.get(date));
//////            System.out.println(finalArray.get(date).get("desc"));
//////            System.out.println(finalArray.get(date).get("keys"));
////        }
//
//
//
//
//
//
//
//
//
//
//
//
//
////        System.out.println(registerList.get(2).getMark());
//
//
//        /**
//         * trimatis masyvas
//         */
//        int[][][] marks = new int[5][100][10];
//        for (int i = 0; i < marks.length; i++) {
//            for (int j = 0; j <  marks[i].length; j++) {
//                for (int k = 0; k <  marks[i][j].length; k++) {
//                    marks[i][j][k] = (int)(Math.random() * ((10 - 1) + 1));
//                }
//            }
//        }
//        System.out.println(Arrays.toString(marks[2][7]));
//        System.out.println(Arrays.deepToString(marks[2]));
//
//
//
//
//
//
//
//
////        Register register = new Register(2, 2, 4, 5);
////        System.out.println(register.getMark());
//
//        /**
//         * TEST with simple data
//         */
//
//        // diena - number
//        List<Integer> l1 = new ArrayList<>();
//
//        l1.add(1);
//        l1.add(2);
//        l1.add(3);
//        l1.add(4);
//        l1.add(5);
//
//        // mokinys - id
//        List<Integer> l2 = new ArrayList<>();
//        l2.add(1);
//        l2.add(2);
//        l2.add(3);
//        l2.add(4);
//        l2.add(5);
//        l2.add(6);
//        l2.add(7);
//        l2.add(8);
//        l2.add(9);
//        l2.add(10);
//
//        // mokomasis dalykas - speciafication
//        List<Integer> l3 = new ArrayList<>();
//        l3.add(1);
//        l3.add(2);
//        l3.add(3);
//        l3.add(4);
//        l3.add(5);
//        l3.add(6);
//        l3.add(7);
//
//
//        List<Integer>[] arrayOfList = new List[3];
//        arrayOfList[0] = l1;
//        arrayOfList[1] = l2;
//        arrayOfList[2] = l3;
//
////        int[][][] marks = new int[3][9][4];
////        marks[2][7][3] = 5;
////        System.out.println(Arrays.toString(marks[2][7]));
//
//
//
//
//
////        List<Integer[]> arrayOfList =  new ArrayList<Integer[]>();
////        arrayOfList.add(l1);
////        arrayOfList.add(l2);
////        arrayOfList.add(l3);
//
////        for (int i = 0; i < arrayOfList.length; i++) {
//////            List<Integer> l = arrayOfList[i];
//////            System.out.println(l);
////////            for (int j = 0; j < arrayOfList[i].size(); j++) {
////////                System.out.println(i +  "array: " + arrayOfList[i].get(j));
////////            }
//////        }
//
////        List<List<Integer>> arrayORegister = new ArrayList<>();
////        List<List<Integer>> arrayORegister = new ArrayList<>();
////        List<List<Integer>> arrayORegister = new ArrayList<List<Integer>>();.
////        List<List<Integer>> arrayORegister = new ArrayList<List<Integer>>();
////        ArrayList<ArrayList> arrayORegister = new ArrayList<ArrayList>();
////            List<int[][][]> arrayORegister=new ArrayList<>();
////        List<Integer>[] arrayORegister = new List[1];
////        arrayORegister[0] = l1;
//
////        System.out.print(Arrays.toString(arrayORegister));
//////        for (int i = 0; i < arrayORegister.length; i++) {
//////            if (i == 0) {
//////                for (int j = 0; j < arrayORegister[0].size(); j++) {
//////                    arrayORegister[j] = l2;
////////                    System.out.print(Arrays.toString(arrayORegister));
//////                }
//////            }
//////        }
//
//
//
//
//    }
//
//
//    /**
//     * {diena {
//     *     mokinys: {
//     *         mokytojai: {
//     *
//     *         }
//     *     }
//     * }}
//     *
//     * param diena
//     * return mokinius , prie kiekvieno mokinio, jo visus mokytojus ir prie kiekvieno mokytojo po pazimi
//     * param diena ir mokinys
//     * return pazymi prie kiekvieno mokytojo
//     * param diena ir mokinis ir mokytojas
//     * return pazimys
//     */
//}
