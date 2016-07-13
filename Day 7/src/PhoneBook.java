/**
 * Created by ThangNguyen on 7/11/2016.
 */
public class PhoneBook {
    private static int numberOfEntries;
    private PhoneEntry[] phoneEntries = new PhoneEntry[1000];

    public PhoneEntry[] getPhoneEntries() {
        return phoneEntries;
    }

    public PhoneBook() {
    }

    public int getNumberOfEntries() {
        return numberOfEntries;
    }

    public boolean addEntry(PhoneEntry entry) {
        if (!isDuplicateName(entry.getName()) && !isDuplicateNumber(entry.getPhoneNumber()) && numberOfEntries < phoneEntries.length) {
            phoneEntries[numberOfEntries] = entry;
            numberOfEntries++;
            return true;
        }
        return false;
    }

    public boolean modifyEntryName(String oldName, String newName) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getName().equals(oldName)) {
                phoneEntries[i].setName(newName);
                return true;
            }
        }
        return false;
    }

    public boolean modifyEntryNumber(String entryName, String newNumber) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getName().equals(entryName)) {
                phoneEntries[i].setPhoneNumber(newNumber);
                return true;
            }
        }
        return false;
    }

    public boolean deleteEntry(String entryName) {
        int index = 0;
        if (isDuplicateName(entryName)) {
            for (int i = 0; i < numberOfEntries; i++) {
                if (phoneEntries[i].getName().equals(entryName)) {
                    index = i;
                }
            }
            for (int i = index + 1; i < numberOfEntries; i++) {
                phoneEntries[i - 1] = phoneEntries[i];
            }
            numberOfEntries--;
            return true;
        }
        return false;
    }

    public PhoneEntry findEntryByName(String entryName) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getName().equals(entryName)) {
                return phoneEntries[i];
            }
        }
        return null;
    }

    public PhoneEntry findEntryByNumber(String entryNumber) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
                return phoneEntries[i];
            }
        }
        return null;
    }

    public String toString() {
        return phoneEntries.toString();
    }


    private boolean isDuplicateName(String entryName) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getName().equals(entryName)) {
                return true;
            }
        }
        return false;
    }

    private boolean isDuplicateNumber(String entryNumber) {
        for (int i = 0; i < numberOfEntries; i++) {
            if (phoneEntries[i].getPhoneNumber().equals(entryNumber)) {
                return true;
            }
        }
        return false;
    }


}
