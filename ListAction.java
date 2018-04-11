package tarea1;
import java.awt.*;
import java.awt.event.*;
class ListAction extends Frame
{
List list;
Label label;
    public ListAction()
    {
    
    // Set frame properties
    setTitle("List with ItemListener Demo");
    setSize(400,400);
    setLayout(new FlowLayout());
    setLocationRelativeTo(null);
    setVisible(true);
    
    // Create List
    list=new List();
    
    // Create label
    label=new Label();
    
    // Add items
    list.add("Apple");
    list.add("Mango");
    list.add("Guava");
    list.add("Orange");
    list.add("Pineapple");
    list.add("Grapes");
    
    // Add List
    add(list);
    
    // Add label
    add(label);
    
    // Add item listener
    list.addItemListener(new ItemListener(){
        public void itemStateChanged(ItemEvent ie)
        {
        label.setText("You selected "+list.getSelectedItem());
        }
    });
    
    }
    public static void main(String args[])
    {
    new ListAction();
    }
}
