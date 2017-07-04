/**
 * Created by Yusuf Raja Tamba on 6/11/2017.
 */
//tugasbesarkuu
import javax.swing.*;
import java.io.File;

public class tubes1 extends javax.swing.JFrame {

    JFileChooser fileChooser=null;
    File selectedFile=null;
        private javax.swing.JPanel ContainerPanel;    private javax.swing.JButton FileSelectButton;
    private javax.swing.JButton tubes1Button;
    private javax.swing.JButton tubes1ButtonUnlock;
    private javax.swing.JLabel lockFileLabel;
    private javax.swing.JLabel HintLabel;
    private javax.swing.JSeparator HorizondalSeparator;
    private javax.swing.JLabel SelectFileLabel;
    private javax.swing.JLabel SelectFileLabelUnlock;
    private javax.swing.JTextField SelectFileText;
    private javax.swing.JTextField SelectFileTextUnlock;
    private javax.swing.JLabel UnlockFileLabel;
    private javax.swing.JLabel UnlockHintLabel;
    private javax.swing.JLabel yrtLabel;
public tubes1() {
        initComponents();
        initFileChooser();

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(tubes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(tubes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(tubes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(tubes1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new tubes1().setVisible(true);
            }
        });
    }

@SuppressWarnings("unchecked")
    private void initComponents() {

        ContainerPanel = new javax.swing.JPanel();
        SelectFileLabel = new javax.swing.JLabel();
        SelectFileText = new javax.swing.JTextField();
        FileSelectButton = new javax.swing.JButton();
        tubes1Button = new javax.swing.JButton();
        HorizondalSeparator = new javax.swing.JSeparator();
        lockFileLabel = new javax.swing.JLabel();
        UnlockFileLabel = new javax.swing.JLabel();
        SelectFileLabelUnlock = new javax.swing.JLabel();
        SelectFileTextUnlock = new javax.swing.JTextField();
        tubes1ButtonUnlock = new javax.swing.JButton();
        HintLabel = new javax.swing.JLabel();
        UnlockHintLabel = new javax.swing.JLabel();
        yrtLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(" LOCK FOLDER Beta");

        ContainerPanel.setBackground(new java.awt.Color(160, 176, 176));
        ContainerPanel.setToolTipText("UCUP ");

        SelectFileLabel.setText("SelectFile");

        FileSelectButton.setText("Browse");
        FileSelectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FileSelectButtonActionPerformed(evt);
            }
        });

        tubes1Button.setText("lock");
        tubes1Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubes1ButtonActionPerformed(evt);
            }
        });

        lockFileLabel.setText("lock File");

        UnlockFileLabel.setText("Unlock File");

        SelectFileLabelUnlock.setText("SelectFile");

        tubes1ButtonUnlock.setText("Unlock");
        tubes1ButtonUnlock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tubes1ButtonUnlockActionPerformed(evt);
            }
        });

        HintLabel.setForeground(new java.awt.Color(102, 102, 102));
        HintLabel.setText("Please do remember the file path");

        UnlockHintLabel.setForeground(new java.awt.Color(102, 102, 102));
        UnlockHintLabel.setText("Please give path and name of the file to unlock");

        yrtLabel.setText("-yrt-");

        javax.swing.GroupLayout ContainerPanelLayout = new javax.swing.GroupLayout(ContainerPanel);
        ContainerPanel.setLayout(ContainerPanelLayout);
        ContainerPanelLayout.setHorizontalGroup(
                ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(27, 27, 27)
                                                                .addComponent(SelectFileLabel)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(SelectFileText, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(FileSelectButton))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(153, 153, 153)
                                                                .addComponent(tubes1Button))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(HorizondalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(152, 152, 152)
                                                                .addComponent(UnlockFileLabel))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(92, 92, 92)
                                                                .addComponent(HintLabel))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(58, 58, 58)
                                                                .addComponent(UnlockHintLabel))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(35, 35, 35)
                                                                .addComponent(SelectFileLabelUnlock)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(SelectFileTextUnlock, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(33, 33, 33)
                                                                .addComponent(tubes1ButtonUnlock))
                                                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                                                .addGap(154, 154, 154)
                                                                .addComponent(lockFileLabel)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ContainerPanelLayout.createSequentialGroup()
                                                .addGap(0, 0, Short.MAX_VALUE)
                                                .addComponent(yrtLabel)))
                                .addContainerGap())
        );
        ContainerPanelLayout.setVerticalGroup(
                ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(ContainerPanelLayout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(lockFileLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SelectFileLabel)
                                        .addComponent(SelectFileText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(FileSelectButton))
                                .addGap(18, 18, 18)
                                .addComponent(tubes1Button)
                                .addGap(2, 2, 2)
                                .addComponent(HintLabel)
                                .addGap(18, 18, 18)
                                .addComponent(HorizondalSeparator, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UnlockFileLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(ContainerPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(SelectFileLabelUnlock)
                                        .addComponent(SelectFileTextUnlock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tubes1ButtonUnlock))
                                .addGap(18, 18, 18)
                                .addComponent(UnlockHintLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                                .addComponent(yrtLabel))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ContainerPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(ContainerPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }

    private void FileSelectButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int returnVal = fileChooser.showOpenDialog(this);
        if(returnVal == JFileChooser.APPROVE_OPTION) {
            setSelectedFile(fileChooser.getSelectedFile());
            setSelectFileText(getSelectedFile().getAbsolutePath());
        }

    }

    private void tubes1ButtonActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            Process runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c" });

            String lockString="attrib +s "+getSelectedFile().getAbsolutePath();
            runtimeProcess.waitFor();
            if(runtimeProcess.exitValue()==0) {
                JOptionPane.showMessageDialog(this, "File locked Successfully ");
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Can not lock the file ");
        }
    }

    private void tubes1ButtonUnlockActionPerformed(java.awt.event.ActionEvent evt) {
        try {
            File fileToUnlock=new File(getSelectFileTextUnlock());
            if(fileToUnlock.isHidden()){
                String lockString="attrib -H +S "+fileToUnlock.getAbsolutePath();
                Process runtimeProcess = Runtime.getRuntime().exec(new String[] { "cmd.exe", "/c", lockString });
                runtimeProcess.waitFor();
                if(runtimeProcess.exitValue()==0) {
                    JOptionPane.showMessageDialog(this, "File unlocked Successfully ");
                }
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, "Can not unlock the file ");
        }
    }

    void initFileChooser(){
        fileChooser=new JFileChooser();
    }

    public String getSelectFileText() {
        return SelectFileText.getText();
    }

    public void setSelectFileText(String SelectFileText) {
        this.SelectFileText.setText(SelectFileText);
    }

    public File getSelectedFile() {
        return selectedFile;
    }

    public void setSelectedFile(File selectedFile) {
        this.selectedFile = selectedFile;
    }

    public String getSelectFileTextUnlock() {
        return SelectFileTextUnlock.getText();
    }

    public void setSelectFileTextUnlock(String SelectFileTextUnlock) {
        this.SelectFileTextUnlock.setText(SelectFileTextUnlock);
    }

}

