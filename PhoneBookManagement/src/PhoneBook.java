import java.util.ArrayList;

/**
 * Created by ThangNguyen on 7/17/2016.
 */
public class PhoneBook {

        private ArrayList<PhoneEntry> phoneEntries = new ArrayList();

        public PhoneBook() {
        }

        public boolean addEntry(PhoneEntry entry) {
            if (!isDuplicateName(entry.getName()) && !isDuplicateNumber(entry.getPhoneNumber())) {
                phoneEntries.add(entry);
                return true;
            }
            return false;
        }

        public boolean modifyEntryName(String oldName, String newName) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(oldName)) {
                    phoneEntries.get(i).setName(newName);
                    return true;
                }
            }
            return false;
        }

        public boolean modifyEntryNumber(String entryName, ArrayList<String> newNumber) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    phoneEntries.get(i).setPhoneNumber(newNumber);
                    return true;
                }
            }
            return false;
        }

        public boolean deleteEntry(String entryName) {
            if (isDuplicateName(entryName)) {
                for (int i = 0; i < phoneEntries.size(); i++) {
                    if (phoneEntries.get(i).getName().equals(entryName)) {
                        phoneEntries.remove(i);
                    }
                }
                return true;
            }
            return false;
        }

        public PhoneEntry findEntryByName(String entryName) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    return phoneEntries.get(i);
                }
            }
            return null;
        }

        public PhoneEntry findEntryByNumber(String entryNumber) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                    if (phoneEntries.get(i).getPhoneNumber().contains(entryNumber)) {
                        return phoneEntries.get(i);
                    }
                }
            return null;
        }

        public String toString() {
            String listOfContact = "";
            for (int i = 0; i < phoneEntries.size(); i++) {
                listOfContact += phoneEntries.get(i).toString() + "\n";
            }
            return listOfContact;
        }


        private boolean isDuplicateName(String entryName) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    return true;
                }
            }
            return false;
        }

        private boolean isDuplicateNumber(ArrayList <String> entryNumber) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getPhoneNumber().equals(entryNumber)) {
                    return true;
                }
            }
            return false;
        }

        public boolean addPhoneNumber(String entryName, ArrayList<String> newNumber) {
            for (int i = 0; i < phoneEntries.size(); i++) {
                if (phoneEntries.get(i).getName().equals(entryName)) {
                    phoneEntries.get(i).getPhoneNumber().addAll(newNumber);
                    return true;
                }
            }
            return false;
        }
    }


