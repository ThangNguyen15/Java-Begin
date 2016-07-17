import java.util.ArrayList;

/**
 * Created by ThangNguyen on 7/17/2016.
 */
public class PhoneEntry {
        private String name;
        private ArrayList<String> phoneNumber = new ArrayList<String>();

        PhoneEntry() {
        }

        PhoneEntry(String name, ArrayList phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public ArrayList<String> getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(ArrayList phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String toString() {
            return this.getName() + "\t" + this.getPhoneNumber();
        }
}

