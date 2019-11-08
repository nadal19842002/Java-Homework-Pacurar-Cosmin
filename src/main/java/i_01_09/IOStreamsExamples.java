package i_01_09;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class IOStreamsExamples {
    /* 1. Implement a method to get a list of all file/directory names from the given.*/
    public static void getlistofFilesAndDirectories() {

        String directoryPath = "c:\\IOStreams";
        File directory = new File(directoryPath);
        String[] files = directory.list();
        if (files.length == 0) {
            System.out.println("The directory is empty");

        } else {
            for (String file : files) {
                System.out.println(file);
            }
        }
    }

    /*2. Implement a method to get specific files by extensions from a specified folder.*/
    public static void getExtensionFiles() {
        File file = new File("C:/IOStreams/");
        File[] files = file.listFiles(new FilenameFilter() {
                                          @Override
                                          public boolean accept( File dir, String fileName ) {
                                              if (fileName.toLowerCase().endsWith(".docx")) {
                                                  return true;
                                              } else {
                                                  return false;
                                              }
                                          }
                                      }
        );
        for (File f : files) {
            System.out.println(f.getName());
        }
    }
    /*3. Implement a method to check if a file or directory specified by pathname exists or not.*/

    public static boolean verifyExistence() {
        boolean a = true;
        File file = new File("C:/IOStreams/");
        if (file.exists()) {
            return a;
        } else {
            return false;
        }
    }

    /*4. Implement a method to check if a file or directory has read and write permission.*/
    public static boolean checkReadandWritePermission() {
        boolean a = true;
        File file = new File("C:/IOStreams/data.txt");
        if (file.canRead() && file.canWrite()) {
            return a;
        } else {
            return false;
        }
    }

    /*5. Implement a method to check if given pathname is a directory or a file.*/

    public static void checkIfPathNameIsDirectoryOrFile() {
        File file = new File("C:/IOStreams/");
        if (file.isDirectory()) {
            System.out.println("This is a directory.");
        } else {
            if (file.isFile()) {
                System.out.println("This is a file.");
            }
        }
    }

    /*6. Implement a method to compare two files lexicographically.

    In mathematics, the lexicographic or lexicographical order (also known as lexical order, dictionary order,

    alphabetical order or lexicographic(al) product) is a generalization of the way

    the alphabetical order of words is based on the alphabetical order of their component letters.

    This generalization consists primarily in defining a total order over the sequences

            (often called words in computer science) of elements of a finite totally ordered set, often called alphabet.*/
    public static void compareFilesLexicographically() {
        File firstFile = new File("C:/IOStreams/data.txt");
        File secondFile = new File("C:/IOStreams/datas.txt");
        if (firstFile.compareTo(secondFile) == 0) {
            System.out.println("Those files are the same");
        } else if (c > 0) {
            System.out.println("The first file is greater than the second one");
        } else {
            System.out.println("The second file is greater than the first one");
        }
    }

    /* 7. Implement a method to get last modified time of a file.*/
    public static void getLastModifiedTimeOfFile() {
        File file = new File("C:/IOStreams/data.txt");
        SimpleDateFormat date = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
        System.out.println("The file was last modified on:" + date.format(file.lastModified()));
    }

    /*8. Implement method to read input from java console.*/
    public static void readinput() {
        BufferedReader br;
        String line;
        try {
            br = new BufferedReader(new FileReader("data.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read the file.");
        }
    }

    /*9. Implement a method to read a file content line by line.*/

    public static void readLineByLine() {
        BufferedReader br;
        String line;
        try {
            br = new BufferedReader(new FileReader("data.txt"));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read the file.");
        }
    }



    /*10. Implement a method to read a plain text file.*/

    public static void readPlainTextFile() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (IOException e) {
            System.out.println("Can't read file");
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        }
    }


    /*11. Implement a method to read a file line by line and store it into a variable.*/
    public static void readandStoreInVariable() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        String data = "";
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            while (line != null) {
                if (line == null)
                    break;
                data += line;
                line = br.readLine();
            }
            System.out.println(data);
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found.");
        } catch (IOException e) {
            System.out.println("Cannot read the file.");
        }
    }

    /*12. Implement a method to store text file content line by line into an array.*/
    public static void readAndStoreIntoArray() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        List<String> list = new ArrayList<String>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            while (line != null) {
                line = br.readLine();
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                if (line == null)
                    break;
                list.add(line);
            }
            System.out.println(Arrays.toString(list.toArray()));
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e) {
            System.out.println("Cannot read the file.");
        }
    }

    /*15. Implement a method to write and read a plain text file.*/
    public static void writeAndReadPlainTextFile() {
        StringBuilder sb = new StringBuilder();
        String line = "";
        try {
            String fName = "data.txt";
            FileWriter fw = new FileWriter(fName, false);
            fw.write("Schopenhauer");
            fw.close();
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            while (line != null) {
                sb.append(line);
                sb.append(System.lineSeparator());
                line = br.readLine();
                System.out.println(line);
            }
            br.close();
        } catch (IOException E) {
            System.out.println("Exception.");
        }
    }

    public static void write( String s, File file ) throws IOException {
        FileWriter fw = new FileWriter(file);
        fw.write(s);
        fw.close();
    }

    public static void main( String[] args ) {
        try {
            File file = new File("C:\\Users\\toshiba\\Desktop\\java workspace\\test.txt");
            write("Hello Amigo", file);
        } catch (Exception e) {
            System.out.println("Exception.");
        }
    }

    /*14. Implement a method to find the longest word in a text file.*/
    public static String longestWord() throws FileNotFoundException {
        String longestWord = "";
        String word;
        Scanner scanner = new Scanner(new File("C:/IOStreams/data.txt"));
        while (scanner.hasNext()) {
            word = scanner.next();
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println(longestWord);
        return longestWord;
    }
}

/*13. Implement a method to append text to an existing file.*/
public class appendASttringToAFile {

}
