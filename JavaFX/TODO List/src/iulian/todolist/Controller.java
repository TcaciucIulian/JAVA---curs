package iulian.todolist;

import iulian.todolist.models.TodoItem;
import javafx.fxml.FXML;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemsDetails;


    public void initialize() {
        TodoItem item1 = new TodoItem("My birthday", "Save money for my birthday", LocalDate.of(2020, Month.JUNE, 15));
        TodoItem item2 = new TodoItem("University", "Finish my bachelor", LocalDate.of(2020, Month.JUNE, 29));
        TodoItem item3 = new TodoItem("Projects", "Work on some projects", LocalDate.of(2020, Month.JULY, 5));
        TodoItem item4 = new TodoItem("Learning", "Learning something new everyday for a quality life....", LocalDate.of(2090, Month.DECEMBER, 30));

        todoItems = new ArrayList<TodoItem>();
        todoItems.add(item1);
        todoItems.add(item2);
        todoItems.add(item3);
        todoItems.add(item4);

        todoListView.getItems().setAll(todoItems);
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);

    }

    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        System.out.println("The selected item is " + item);
        StringBuilder sb = new StringBuilder((item.getDetails()));
        sb.append("\n\n\n");
        sb.append("Due :");
        sb.append(item.getDeadLine());
        itemsDetails.setText(sb.toString());

    }
}
