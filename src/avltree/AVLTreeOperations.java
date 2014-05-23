package avltree;

import java.io.File;
import java.util.Scanner;

public class AVLTreeOperations {

    // Main method
    public static void main(String[] args) {

		long inTime=System.currentTimeMillis();
        System.out.println("Output: "+operateOnAVLTree("/users/dany/downloads/sskew.txt") );
        long pTime=System.currentTimeMillis();
		System.out.println("Time in Milli Secs "+(pTime-inTime));
    }


    public static Long operateOnAVLTree(String inFile) {
        File infile = new File(inFile);
        Long nTotalOperationResult = 0L;
        String sOperation = "";
        AVLTree<Long, Long> sTree = new AVLTree<Long, Long>();

        try {
            Scanner fileScanner = new Scanner(infile);
            while (fileScanner.hasNext()) {
                if (!(Character.isDigit((sOperation = fileScanner.next()).charAt(0)))) {
                    if (sOperation.compareTo("Insert") == 0)
                        sTree.insert(fileScanner.nextLong(), fileScanner.nextLong());
                    else if (sOperation.compareTo("Find") == 0)
                        sTree.find(fileScanner.nextLong());
                    else if (sOperation.compareTo("FindMin") == 0)
                        nTotalOperationResult = sTree.findMin().value;
                    else if (sOperation.compareTo("FindMax") == 0)
                        nTotalOperationResult += sTree.findMax().value;
                    else if (sOperation.compareTo("Remove") == 0)
                    {
                        sTree.remove(fileScanner.nextLong());

                    }
                    else if (sOperation.compareTo("RemoveValue") == 0)
                    {
                        nTotalOperationResult += sTree.removeValue(fileScanner.nextLong());
                    }
                    else if (sOperation.compareTo("Size") == 0)
                    {
                        nTotalOperationResult += sTree.size();
                    }
                    else if (sOperation.compareTo("IsEmpty") == 0)
                        sTree.isEmpty();
                }
            }
            
            System.out.println("min :"+sTree.findMin());
			System.out.println("Size :"+sTree.size());
			System.out.println("max :"+sTree.findMax());

        } catch (Exception e) {
            System.err.println(e.getMessage());
        }


        return nTotalOperationResult;
    }

}
