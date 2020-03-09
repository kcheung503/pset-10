import javax.swing.DefaultListModel;

public class Utils {
//		Returns the classpath for json file
    public static String getClasspathDir() {
        String classpath = System.getProperty("java.class.path", ".");
        boolean windows = false;
        if (classpath.matches(".*\\\\.*")) {
            windows = true;
        }
        if (windows) {
            String[] splitClasspathDir = classpath.split(";");
            String classpathDirectory = "";
            for (String s : splitClasspathDir) {
                if (s.matches(".*lib\\\\.*")) {
                    classpathDirectory = s;
                }
            }
            return classpathDirectory;
        }else {
            String[] splitClasspathDir = classpath.split(":");
            String classpathDirectory = "";
            for (String s : splitClasspathDir) {
                if (s.matches(".*lib/.*")) {
                    classpathDirectory = s;
                }
            }
            return classpathDirectory;
        }
    }    

//    Sorts DLM in ascending order
    public static DefaultListModel<String> sortWordsAsc(DefaultListModel<String> listOfWords) {
    	String temp;
    	int n = listOfWords.getSize();
    	for (int i = 0; i < n; i++) {
    		for (int j = i + 1; j < n; j++) {
               if ((listOfWords.get(i).compareTo(listOfWords.get(j)) > 0)) {
            	   temp = listOfWords.get(i);
                   listOfWords.set(i, listOfWords.get(j));
                   listOfWords.set(j, temp);
               }
           }
    	}
    	return listOfWords;
    }

//		Reverse the order of a DLM
    public static DefaultListModel<String> reverseOrder(DefaultListModel<String> words) {
    	DefaultListModel<String> b = new DefaultListModel<String>(); 
    	int n = words.getSize();
    	int j = n; 
    	for (int i = 0; i < n; i++) { 
    		b.addElement(words.get(j-1)); 
    		j = j - 1; 
    	} 
    	return b;
    } 

}
