import java.util.List;

public class FilterCat  {

    public static void filterCat(List<Cat> responseList) {
        responseList.stream().filter(cat -> cat.getUpvotes() != null).forEach(System.out::println);
   }

}
