public class StudentDB {
    // student names array
    private String[] studentNames = new String[10];
    private int nextIndex;

    boolean insertName(String name){
        boolean hasInserted = false;
        if (nextIndex < studentNames.length){
            this.studentNames[nextIndex++] = name;
            hasInserted = true;
        }
        return hasInserted;
    }
    int search(String searchItem){
        int index = -1;
        for (int i = 0; i < studentNames.length; i++){
            String value = studentNames[i];
            if (value != null){
                if (value == searchItem){
                    index = i;
                    break;
                }
            }
        }
        return index;
    }

    String getName(int index){
        return studentNames[index];
    }

    boolean delete(int index){
        for (int i = 0; i < studentNames.length - 1; i++){
            studentNames[i] = studentNames[i];
            if (i >= index){
                studentNames[i] = studentNames[i+1];
            }
        }
        return true;
    }
    
    void showNames(){
        for(String name : studentNames){
            System.out.println(name);
        }
    }

}