
/*
 *
 *  Copyright (C) 2019.  PSEU - Palestine Polytechnic University - All Rights Reserved
 *  * SPDX-License-Identifier: Apache-2.0
 *
 */

/*
 * Created by Basel.Altamimi on 8/4/2019.
 */

package Forms;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainForm extends JFrame {
    SwingCalendar cal1 , cal2;

    public MainForm() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close the application on JForm exit
        this.setTitle("Main Form");
        this.setSize(600, 200);
        this.setLayout(new FlowLayout(FlowLayout.RIGHT));
        this.setVisible(true);




        JButton b1 = new JButton("Show Calender 1"); // Button 1 (Create Calender 1)
        b1.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                cal1 = SwingCalendar.getInstance();
                showNewCalendar(cal1);
            }
        });

        JButton b2 = new JButton("Show Calender 2"); // Button 2 (Create Calender 2)
        b2.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent ae) {
                cal2 = SwingCalendar.getInstance();
                showNewCalendar(cal2);
            }
        });


        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panel.add(b1);
        panel.add(b2);

        this.add(panel);
    }


    private void showNewCalendar(SwingCalendar tempCal) {

        Util.Logger.log("Object HC: " + tempCal.hashCode()); // Log Calender hash code

    }
    private void checkHash(SwingCalendar cal1 , SwingCalendar cal2) {
        if(cal1.hashCode() != cal2.hashCode())
            JOptionPane.showMessageDialog(null, "hashCode for calendar 1 DOESN'T equal hashcode for calendar 2" );
    }


}
