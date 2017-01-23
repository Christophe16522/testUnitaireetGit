package Interface;

import Fonction.Fonction;
import Heure.FonctionDate;
import java.awt.BorderLayout;
import javax.swing.*;
import javax.swing.table.*;
import Mapping.InfosEmp;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.text.ParseException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import listener.AddRow;
import listener.ConfirmerPointageMultipleEntre;
import listener.FileChooser;
import listener.GenererHeureEntrer;

public class PointageMultipleEntre extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;
    public InfosEmp empl;
    public JTable table;
    public JTextField sem = new JTextField(30);
    public JTextField exptxt = new JTextField(10);
    public JButton gen = new JButton("Generer");
    public JButton boutonsem = new JButton("OK");
    public JButton exp = new JButton("Exp");
    public JButton imp = new JButton("Imp");
    public JButton bouton = new JButton("Confirmer");
    public JButton refresh = new JButton("Actualiser");
    public JButton ajout = new JButton("Ajouter");
    public JButton supr = new JButton("Supprimer");
    public JComboBox type = new JComboBox();
    public Object[][] data;
    Fonction f = new Fonction();
    public Object[] columnNames = {"Matricule", "Nom Complet", "Lundi","Retard (min)", "Mardi","Retard (min)", "Mercredi","Retard (min)", "Jeudi","Retard (min)", "Vendredi","Retard (min)", "Samedi","Retard (min)", "Dimanche", "Retard (min)", "Total Retard","Pointer"};
    public InfosEmp[] emp = f.selectInfosEmp();
    public DefaultTableModel model;
    public String retard;

    public void setRetard(String retard) {
        this.retard = retard;
    }

    public PointageMultipleEntre() {

        // Count c = new Count();
        data = new Object[emp.length][18];

        int i = 0;
        for (InfosEmp e : emp) {
            data[i][0] = e.getIdemployer();
            data[i][1] = e.getNomemployer().trim();
            data[i][2] = e.getHeuredebut();
            data[i][3] = "";
            data[i][4] = e.getHeuredebut();
            data[i][5] = "";
            data[i][6] = e.getHeuredebut();
            data[i][7] = "";
            data[i][8] = e.getHeuredebut();
            data[i][9] = "";
            data[i][10] = e.getHeuredebut();
            data[i][11] = "";
            data[i][12] = e.getHeuredebut();
            data[i][13] = "";
            data[i][14] = e.getHeuredebut();
            data[i][15] = "";
            data[i][16] = "";
            data[i][17] = false;
            

            i++;

        }

        model = new DefaultTableModel(data, columnNames);
        table = new JTable(model) {

            private static final long serialVersionUID = 1L;

            /*@Override
            public Class getColumnClass(int column) {
            return getValueAt(0, column).getClass();
            }*/
            @Override
            public Object getValueAt(int row, int column) {
                return data[row][column];
            }

            @Override
            public void setValueAt(Object aValue, int row, int column) {
                data[row][column] = aValue;
                if(column==3||column==5){
                    try {
                        setValueAt(FonctionDate.retToHentre(1, Integer.parseInt(getValueAt(row, column).toString()) ,f.getEntrer(String.valueOf(getValueAt(row, 0).toString()))), row, column-1);
                    } catch (ParseException ex) {
                        Logger.getLogger(PointageMultipleEntre.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                //System.out.println(aValue);   
            }

            @Override
            public boolean isCellEditable(int row, int column) {
                if (column == 0) {
                    return false;
                }
                return true;
            }

            @Override
            public Class getColumnClass(int column) {
                switch (column) {
                    case 0:
                        return Integer.class;
                    case 1:
                        return String.class;
                    case 2:
                        return String.class;
                    case 3:
                        return String.class;
                    case 4:
                        return String.class;
                    case 5:
                        return String.class;
                    case 6:
                        return String.class;
                    case 7:
                        return String.class;
                    case 8:
                        return String.class;
                    case 9:
                        return String.class;
                    case 10:
                        return String.class;
                    case 11:
                        return String.class;
                    case 12:
                        return String.class;
                    case 13:
                        return String.class;
                    case 14:
                        return String.class;
                    case 15:
                        return String.class;
                    case 16:
                        return String.class;
                    
                    default:
                        return Boolean.class;
                }
            }
        };

        table.setPreferredScrollableViewportSize(table.getPreferredSize());
        JScrollPane scrollPane = new JScrollPane(table);
        JPanel semaine = new JPanel();
        JPanel bas = new JPanel();
        //type.setPreferredSize(new Dimension(100, 20));
        type.addItem("Entrée");
        type.addItem("Sortie");
        semaine.add(sem);
        semaine.add(boutonsem);
        bas.add(exptxt);
        bas.add(exp);
        bas.add(imp);
        bas.add(type);
        bas.add(gen);
        bas.add(bouton);

        getContentPane().add(scrollPane, BorderLayout.CENTER);
        getContentPane().add(semaine, BorderLayout.NORTH);
        getContentPane().add(bas, BorderLayout.SOUTH);
        bouton.addActionListener(new ConfirmerPointageMultipleEntre(this));
        ajout.addActionListener(new AddRow(this));
        ActionListener refreshActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("bouton cliqué");

                //getContentPane().add(scrollPane, BorderLayout.CENTER);
            }
        };
//        ActionListener importActionListener;
//        importActionListener = new ActionListener() {
//            public void actionPerformed(ActionEvent e) {
//                JFileChooser fileChooser = new JFileChooser();
//                //fileChooser.setCurrentDirectory(new File(System.getProperty("user.home")));
//                int result = fileChooser.showOpenDialog(this);
//                if (result == JFileChooser.APPROVE_OPTION) {
//                    File selectedFile = fileChooser.getSelectedFile();
//                    System.out.println("Selected file: " + selectedFile.getAbsolutePath());
//                }
//            }
//        };
        ActionListener exportActionListener;
        exportActionListener = new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                JOptionPane jop = new JOptionPane();
                int option = jop.showConfirmDialog(null, "Voulez vous Enregistre le Model ? \nSi le fichier existe deja il sera mis a jour\nSi non il sera creer" + exptxt.getText(), "Enregistrez Model", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
                if (option == JOptionPane.OK_OPTION) {
                    table.repaint();
                    exporter(table, new File(exptxt.getText() + ".xls"));
                }
            }

            private void exporter(JTable table, File file) {
                try {

                    TableModel model = table.getModel();
                    FileWriter out = new FileWriter(file);
                    for (int i = 0; i < model.getColumnCount(); i++) {
                        out.write(model.getColumnName(i) + "\t");

                    }
                    out.write("\n");

                    for (int i = 0; i < model.getRowCount(); i++) {
                        for (int j = 0; j < 18; j++) {
                            out.write(table.getValueAt(i, j) + "\t");

                        }
                        out.write("\n");
                    }

                    out.close();
                    JOptionPane jop2 = new JOptionPane();
                    jop2.showMessageDialog(null, "Exporter avec Succes", "Terminer", JOptionPane.INFORMATION_MESSAGE);
                } catch (Exception err) {
                    err.printStackTrace();
                }
            }
        };
        refresh.addActionListener(refreshActionListener);
        exp.addActionListener(exportActionListener);
        imp.addActionListener(new FileChooser(this));
        gen.addActionListener(new GenererHeureEntrer(this));

        //refresh.addActionListener(new RefreshEntrer(this.table));
        boutonsem.addActionListener(this);
        this.setSize(1350, 300);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()) {
            case "OK":
                try {
                    Date[] dates = FonctionDate.getSemJour(java.sql.Date.valueOf(sem.getText()));
                    for (int i = 2; i < 9; i++) {
                        columnNames[i] = dates[i - 2].toString();
                    }
                } catch (Exception ee) {
                    JOptionPane jop2 = new JOptionPane();
                    jop2.showMessageDialog(null, "Mauvaise Format de la Date \nFormat = YYYY-mm-dd ", "Infos", JOptionPane.ERROR_MESSAGE);
                }

                model.setColumnIdentifiers(columnNames);
                model.fireTableStructureChanged();

        }
    }

}
