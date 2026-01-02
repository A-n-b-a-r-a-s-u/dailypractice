package dailypractice.LeetCode.year25.december.week2;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MentionedUsers {
    public int[] countMentions(int numberOfUsers, List<List<String>> events) {
        int[] mention = new int[numberOfUsers];
        int[] offline = new int[numberOfUsers];

        events.sort((a,b) -> {
                    int timeA = Integer.parseInt(a.get(1));
                    int timeB = Integer.parseInt(b.get(1));
                    return timeA == timeB ? b.get(0).compareTo(a.get(0)): timeA - timeB ;
                }
                );

        for (List<String> event: events){
            if (event.get(0).equals("MESSAGE")){
                handleOnline(event, mention, offline);
            }
            else {
                handleOffline(event, offline);
            }
        }

        return mention;
    }

    private void handleOnline(List<String> event, int[] mention, int[] offline){
        int timestamp = Integer.parseInt(event.get(1));
        String[] tokens = event.get(2).split(" ");

        for (String token : tokens){
            if (token.equals("ALL")){
                for (int i =0; i< mention.length; i++){
                    mention[i]++;
                }
            } else if (token.equals("HERE")) {
                for (int i =0; i< mention.length; i++){
                    if (offline[i] == 0 || offline[i] + 60 <= timestamp)
                        mention[i]++;
                }
            }
            else {
                int id = Integer.parseInt(token.substring(2));
                mention[id]++;
            }
        }
    }

    private void handleOffline(List<String> event, int[] offline){
        int id = Integer.parseInt(event.get(2));
        offline[id] = Integer.parseInt(event.get(1)) ;
    }

    public static void main(String[] args) {
        List<List<String>> s = Arrays.asList(
                Arrays.asList("MESSAGE","2","HERE"),
                Arrays.asList("OFFLINE","2","1"),
                Arrays.asList("OFFLINE","1","0"),
                Arrays.asList("MESSAGE","61","HERE")
        );

        MentionedUsers m = new MentionedUsers();
        int[] a = m.countMentions(3, s);

        System.out.println(Arrays.toString(a));
    }
}
