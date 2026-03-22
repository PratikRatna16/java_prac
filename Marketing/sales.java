package Marketing;
import General.employee;

    public class sales extends employee{
        public sales(int empid, String ename, double earning) {
            super(empid, ename, earning);
        }
        public void tallowance(){
            double allowance = 0.05f * earning;
        }
    }


