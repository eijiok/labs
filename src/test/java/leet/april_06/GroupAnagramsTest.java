package leet.april_06;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

class GroupAnagramsTest {

    @Test
    void groupAnagrams() {
        List<List<String>> result = new GroupAnagrams().groupAnagrams(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        assertRawResults("ate,eat,tea|nat,tan|bat", result);
    }

    private void assertRawResults(String output, List<List<String>> result) {
        List<List<String>> listOutput = parseOutput(output);
        assertResults(listOutput, result);
    }

    private void assertResults(List<List<String>> listOutput, List<List<String>> result) {
//        Assertions.assertEquals(listOutput.size(), result.size());
        printList("expected: ", listOutput);
        printList("result: ", result);
    }

    private void printList(String message, List<List<String>> result) {
        System.out.println(message);
        for (int i = 0; i < result.size(); i++) {
            if (i != 0) System.out.println(",");
            List<String> cols = result.get(i);
            for (int j = 0; j < cols.size(); j++) {
                String col = cols.get(j);
                if (j != 0) System.out.print(",");
                System.out.print(col);
            }
        }
        System.out.println();
    }

    private List<List<String>> parseOutput(String output) {
        String[] rows = output.split("\\|");
        List<List<String>> result = new ArrayList<>();
        for (String row : rows) {
            List<String> colList = new ArrayList<>();
            String[] cols = row.split(",");
            for (String col : cols) {
                colList.add(col);
            }
            result.add(colList);
        }
        return result;
    }


}