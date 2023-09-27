/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaccinationapp;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Jordan
 */
public class VaccinationGUI extends javax.swing.JFrame {
//array list to temperaly store patient details before it is assigned a priority value.

    private ArrayList<Patient> myTempQueue;
    private PQInterface PQueue;

    public VaccinationGUI() {
        myTempQueue = new ArrayList();// Array List.
        PQueue = new MyPriorityQueue();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        symptomsGrp = new javax.swing.ButtonGroup();
        titleLbl = new javax.swing.JLabel();
        nameLbl = new javax.swing.JLabel();
        nameTF = new javax.swing.JTextField();
        ageLbl = new javax.swing.JLabel();
        ageTF = new javax.swing.JTextField();
        symptomLbl = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        addBTN = new javax.swing.JButton();
        sizeBtn = new javax.swing.JButton();
        nextBTN = new javax.swing.JButton();
        exitBTN = new javax.swing.JButton();
        priorityBtn = new javax.swing.JButton();
        yesCheckBox = new javax.swing.JCheckBox();
        noCheckbox = new javax.swing.JCheckBox();
        printLbl = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLbl.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLbl.setText("Vaccine Registration");

        nameLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        nameLbl.setText("Name:");

        ageLbl.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        ageLbl.setText("Age (Number)");

        ageTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageTFActionPerformed(evt);
            }
        });

        symptomLbl.setFont(new java.awt.Font("Segoe UI", 2, 14)); // NOI18N
        symptomLbl.setText("Symptoms");

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        addBTN.setText("Add ");
        addBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTNActionPerformed(evt);
            }
        });

        sizeBtn.setText("No. Patients Registered");
        sizeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sizeBtnActionPerformed(evt);
            }
        });

        nextBTN.setText("Get Next Group");
        nextBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextBTNActionPerformed(evt);
            }
        });

        exitBTN.setText("Exit");
        exitBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitBTNActionPerformed(evt);
            }
        });

        priorityBtn.setText("Assign Priorities");
        priorityBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                priorityBtnActionPerformed(evt);
            }
        });

        symptomsGrp.add(yesCheckBox);
        yesCheckBox.setText("Yes");
        yesCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesCheckBoxActionPerformed(evt);
            }
        });

        symptomsGrp.add(noCheckbox);
        noCheckbox.setSelected(true);
        noCheckbox.setText("No");

        printLbl.setText("Waiting Patients");
        printLbl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printLblActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(symptomLbl)
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(yesCheckBox)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(noCheckbox)
                                .addGap(85, 85, 85)
                                .addComponent(priorityBtn))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(152, 152, 152)
                        .addComponent(titleLbl))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(nameLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(ageLbl)
                                    .addGap(18, 18, 18)
                                    .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(addBTN))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(exitBTN)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(printLbl)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(nextBTN)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sizeBtn))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 443, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(addBTN))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(titleLbl)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nameTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nameLbl))
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ageTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ageLbl))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(priorityBtn))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(yesCheckBox)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(noCheckbox))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(28, 28, 28)
                                        .addComponent(symptomLbl)))
                                .addGap(0, 22, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(printLbl)
                        .addComponent(nextBTN))
                    .addComponent(sizeBtn, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addComponent(exitBTN)
                .addGap(2, 2, 2))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTNActionPerformed
        //checks if either TextField is empty and if eithe one is it retuens an error
        if (nameTF.getText().isEmpty() || ageTF.getText().isEmpty()) {
            jTextArea1.append("Please check that all details have been enetered \n");
        } else {
            //declares a new instance of the patient class
            Patient newPatient = new Patient();
            
            //sets the parameters that will later be used to search
            String regexName = "[a-zA-z]*";
            //assigns the name string from the name text field to a string variable
            String stringName = nameTF.getText();
            //pattern compiled   
            //Defines a pattern (to be used in a search)
            Pattern pattern = Pattern.compile(regexName);
            //this method id used to remove spaces from the inputted string
            String s = stringName.trim();
            //Used to search for the pattern
            Matcher matcher = pattern.matcher(s);
            //checks if the name input contains only letters 
            if(matcher.matches() == true){
                newPatient.setsName(nameTF.getText());
            }else{
                jTextArea1.append("Please enter a valid Name\n");
                return;
            }
            //sets the parameters that will later be used to search
            String regexAge = "[a-zA-z]*";
            //assigns the un parsed string from the age text field to a string variable
            String stringAge = ageTF.getText();
            //Defines a pattern (to be used in a search)
            Pattern patternNumber = Pattern.compile(regexAge);
            //this method id used to remove spaces from the inputted string
            String a = stringAge.trim();
            //Used to search for the pattern
            Matcher matchers = patternNumber.matcher(a);
            //checks to see if the age inputed doesnt contains any letters
            if(matchers.matches() != true){
                //sets the age afetr the it is parsed to an integer
                newPatient.setsAge(Integer.parseInt(ageTF.getText()));
            }else{
                jTextArea1.append("Please enter a valid Age\n");
                return;
            }
            //sets if the user has symptoms or not depending on what box is selceted in the GUI
            if (yesCheckBox.isSelected()) {
                newPatient.setsSymptom(true);
            } else {
                newPatient.setsSymptom(false);
            }
            //add the above details to the temporary queue before their priority is set
            myTempQueue.add(newPatient);
            //print message to infrom the user that a new person has been added
            jTextArea1.append("Patient: " + nameTF.getText() + " is now registered to be vaccinated.\n");
            //clears the name and age fields on the GUI
            nameTF.setText("");
            ageTF.setText("");
        }
    }//GEN-LAST:event_addBTNActionPerformed

    private void nextBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextBTNActionPerformed
        if (!PQueue.isEmpty()) {
            //creats a new instance of the PQelement and calls the dequeue method
            Object pqElement = PQueue.dequeue();
            jTextArea1.append("The next group in the queue to be seen are:\n");
            //the dequeue method returns a list of objects that needs to be converted to a string so that 
            //it can be displayed on the GUI
            jTextArea1.append(pqElement.toString());
            //if the Priority Queue is empty
        } else {
            jTextArea1.append("There are no patients registered\n");
            jTextArea1.append("Check that you have assigned priority to patients\n");
        }
    }//GEN-LAST:event_nextBTNActionPerformed

    private void sizeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sizeBtnActionPerformed
        // TODO add your handling code here:
        if (!PQueue.isEmpty()) {
            //calls the .size() method from the PQinteface class
            jTextArea1.append("The number of people registered: " + PQueue.size() + "\n\n");
        } else {
            jTextArea1.append("There are no patients registered\n");
            jTextArea1.append("Check that you have assigned priority to patients\n");
        }
    }//GEN-LAST:event_sizeBtnActionPerformed

    private void exitBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitBTNActionPerformed
        // TODO add your handling code here:
        System.exit(0); // close application
    }//GEN-LAST:event_exitBTNActionPerformed

    private void priorityBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priorityBtnActionPerformed
        // TODO add your handling code here:
        int priority, age;
        boolean symptom;
        priority = 0;
        Patient patient;
        //assigns the priority of a person depending on their age 
        if (!myTempQueue.isEmpty()) {
            for (int i = 0; i < myTempQueue.size(); i++) {
                //gets the first element of the ArrayList
                patient = myTempQueue.get(i);
                symptom = patient.issSymptom();
                age = patient.getsAge();
                //set priority based on age.
                //sets the priority to 10 if the inputed age is between 90 and 150
                if (age >= 90 && age <= 150) {
                    priority = 10;
                    //sets the priority to 9 if the inputed age is between 80 and 89
                } else if (80 <= age && age <= 89) {
                    priority = 9;
                    //sets the priority to 8 if the inputed age is between 70 and 79
                } else if (70 <= age && age <= 79) {
                    priority = 8;
                    //sets the priority to 7 if the inputed age is between 65 and 69
                } else if (65 <= age && age <= 69) {
                    priority = 7;
                    //sets the priority of a person if their age is between 18 and 65 and they have symptoms
                } else if (18 <= age && age <= 65 && symptom == true) {
                    priority = 6;
                    //sets the priority to 5 if the inputed age is between 55 and 64
                } else if (55 <= age && age <= 64) {
                    priority = 5;
                    //sets the priority to 4 if the inputed age is between 45 and 54
                } else if (45 <= age && age <= 54) {
                    priority = 4;
                    //sets the priority to 3 if the inputed age is between 30 and 44
                } else if (30 <= age && age <= 44) {
                    priority = 3;
                    //sets the priority to 2 if the inputed age is between 18 and 29
                } else if (age <= 18 && age <= 29) {
                    priority = 2;
                    //sets the priority to 1 if the inputed age is below 18
                } else if (age < 18) {
                    priority = 1;
                }
                // adds patient data with a priority to the priority queue
                PQueue.enqueue(priority, patient);
            }
            jTextArea1.append("Priority has been assigned. \n");
            // empties the array so that previous patient data is not mixed with the new patient data
            myTempQueue.clear();
        } else {
            jTextArea1.append("No patients have been added registered \n");
        }
    }//GEN-LAST:event_priorityBtnActionPerformed

    private void yesCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yesCheckBoxActionPerformed

    private void ageTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageTFActionPerformed

    private void printLblActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printLblActionPerformed
        // TODO add your handling code here:
        if (!PQueue.isEmpty()) {
            jTextArea1.append("The following patients havent recieved a vaccine:\n");
            //the printQueue() method is called. This will display all the patients waiting to be vaccinated in the list
            jTextArea1.append(PQueue.printPQueue() + "\n");
        } else {
            jTextArea1.append("There are no patients in the waiting list. \n");
            jTextArea1.append("Check that you have assigned priority to patients\n");
        }
        //printPQueue();
    }//GEN-LAST:event_printLblActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VaccinationGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VaccinationGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBTN;
    private javax.swing.JLabel ageLbl;
    private javax.swing.JTextField ageTF;
    private javax.swing.JButton exitBTN;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel nameLbl;
    private javax.swing.JTextField nameTF;
    private javax.swing.JButton nextBTN;
    private javax.swing.JCheckBox noCheckbox;
    private javax.swing.JButton printLbl;
    private javax.swing.JButton priorityBtn;
    private javax.swing.JButton sizeBtn;
    private javax.swing.JLabel symptomLbl;
    private javax.swing.ButtonGroup symptomsGrp;
    private javax.swing.JLabel titleLbl;
    private javax.swing.JCheckBox yesCheckBox;
    // End of variables declaration//GEN-END:variables
}
