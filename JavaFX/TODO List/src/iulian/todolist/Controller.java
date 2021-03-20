package iulian.todolist;

import iulian.todolist.models.TodoData;
import iulian.todolist.models.TodoItem;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.control.TextArea;

import java.time.LocalDate;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<TodoItem> todoItems;
    @FXML
    private ListView<TodoItem> todoListView;
    @FXML
    private TextArea itemsDetails;
    @FXML
    private Label deadlineLabel;


    public void initialize() {
//        TodoItem item1 = new TodoItem("My birthday", "Save money for my birthday", LocalDate.of(2020, Month.JUNE, 15));
//        TodoItem item2 = new TodoItem("University", "Finish my bachelor", LocalDate.of(2020, Month.JUNE, 29));
//        TodoItem item3 = new TodoItem("Projects", "Work on some projects", LocalDate.of(2020, Month.JULY, 5));
//        TodoItem item4 = new TodoItem("Learning", "Learning something new everyday for a quality life....", LocalDate.of(2090, Month.DECEMBER, 30));
//
//        todoItems = new ArrayList<TodoItem>();
//        todoItems.add(item1);
//        todoItems.add(item2);
//        todoItems.add(item3);
//        todoItems.add(item4);
//
//        TodoData.getInstance().setTodoItems(todoItems);

        todoListView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TodoItem>() {
            @Override
            public void changed(ObservableValue<? extends TodoItem> observableValue, TodoItem todoItem, TodoItem t1) {
                if(t1 != null) {
                    TodoItem item = todoListView.getSelectionModel().getSelectedItem();
                    itemsDetails.setText(item.getDetails());
                    DateTimeFormatter df = DateTimeFormatter.ofPattern("MMMM d, yyyy");
                    deadlineLabel.setText(df.format(item.getDeadLine()));
                }
            }
        });

        todoListView.getItems().setAll(TodoData.getInstance().getTodoItems());
        todoListView.getSelectionModel().setSelectionMode(SelectionMode.SINGLE);
        todoListView.getSelectionModel().selectFirst();

    }

    public void handleClickListView() {
        TodoItem item = todoListView.getSelectionModel().getSelectedItem();
        System.out.println("The selected item is " + item);
        itemsDetails.setText(item.getDetails());
        deadlineLabel.setText(item.getDeadLine().toString());
    }
}
