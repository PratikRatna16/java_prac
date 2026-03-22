package General;

public class employee {
        protected int empid;
        private String ename;
        public double earning;
        public employee(int empid, String ename, double earning) {
            this.empid = empid;
            this.ename = ename;
            this.earning = earning;
        }
        public void earnings(){
            earning = earning + (80/100f)*earning + (15/100f)*earning;
            System.out.println("The employee id is: "+empid);
            System.out.println("The total earning is: "+earning);
        }
    }

