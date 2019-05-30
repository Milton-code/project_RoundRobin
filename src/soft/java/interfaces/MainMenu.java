
package soft.java.interfaces;

import java.awt.MouseInfo;
import java.awt.Point;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainMenu extends javax.swing.JFrame {

    int x, y;
    
    int contadorProcesos,
        idProceso,
        rafagaCPU = 0,
        quantumEjecucion = 0,
        residuoRafaga = 0,
        tiempoProceso = 0,
        valorBarraProceso,
        cantidadProceso;
    
    String nombreProceso;
    
    // Instancia objeto tabla
    DefaultTableModel modelo = new DefaultTableModel();
    DefaultTableModel modelo2 = new DefaultTableModel();
    
    FinallyProcess closeProcess = new FinallyProcess();
    NameEmpty nameEmpty = new NameEmpty();
    RafagaNull rafagaNull = new RafagaNull();
    RafagaEmpty rafagaEmpty = new RafagaEmpty();
    RafagaMayor rafagaMayor = new RafagaMayor();
    
    
    public MainMenu() {
        initComponents();
        setTitle("Algoritmo planificación - Round Robín"); // titulo a la interfaz 
        this.setLocationRelativeTo(null); //centra la interfaz
        this.setResizable(false); // impide ampliar la interfaz
        mostrarDatosTablaLista();
        mostrarDatosTablaResultado();
        bloquearCampos();
        setIconImage(new ImageIcon(getClass().getResource("/soft/java/files/robin-hood-icon.png")).getImage());
        this.setLocationRelativeTo(null);
        
    }

/*---------------------------METODOS DE TABLA-----------------------------------------*/    
    
    // Metodo para nombrar las columnas de la tabla
    public void mostrarDatosTablaLista(){

        modelo.addColumn("ID");
        modelo.addColumn("Nombre");
        modelo.addColumn("Ráfaga CPU");
        modelo.addColumn("Reciduo Ráfaga");
        modelo.addColumn("Estado");
            tabla_datosLista.setModel(modelo);
    }
    
    public void mostrarDatosTablaResultado(){

        modelo2.addColumn("Nombre");
        modelo2.addColumn("Ráfaga CPU");
        modelo2.addColumn("Tiempo Final");
        modelo2.addColumn("Estado");
            tabla_resultado.setModel(modelo2);
    }
    
    // Metodo para agregar los datos de la tabla
    public void agregarDatosTabla(){
           
        modelo = (DefaultTableModel) tabla_datosLista.getModel();
        
        contadorProcesos++;
        
        Object datos[] = new Object[6];
        datos[0] = contadorProcesos;
        datos[1] = txt_nombre.getText();
        datos[2] = txt_rafaga.getText();
        datos[3] = txt_rafaga.getText(); // Reciduo rafaga
        datos[4] = "Listo";
            modelo.addRow(datos);
            
    }


    
    
/*----------------------------METODOS BLOQUEO, DESBLOQUEO, LIMPIAR-----------------------------*/  
    
    
    // Metodo para habilitar campos (botones y campos de texto)
    public void habilitarCampos(){
        txt_nombre.setEditable(true);
        txt_rafaga.setEditable(true);
        txt_quantum.setEditable(true);
            btn_habilitar.setEnabled(false);
            btn_cancelar.setEnabled(true);
            btn_confirmar.setEnabled(true);
    }
    
    
    // Metodo para bloquear campos (botones y campos de texto)
    public void bloquearCampos(){
        txt_nombre.setEditable(false);
        txt_rafaga.setEditable(false);
        txt_quantum.setEditable(false);
        txt_proceso.setEditable(false);
        txt_avance.setEditable(false);
        txt_procesoEjecutados.setEditable(false);
        txt_tiempoUtilizado.setEditable(false);
            btn_habilitar.setEnabled(true);
            btn_cancelar.setEnabled(false);
            btn_confirmar.setEnabled(false);
            btn_agregar.setEnabled(false);
            btn_limpiar.setEnabled(false);
            btn_comenzar.setEnabled(false);
    }
    
    // Metodo para limpiar campos (campos de texto)
    public void limpiarCampos(){
        txt_nombre.setText("");
        txt_rafaga.setText("");
        txt_quantum.setText("");
    }
  
/*---------------------------------------------------------------------------------*/    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        btn_habilitar = new javax.swing.JButton();
        btn_cancelar = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel5 = new javax.swing.JPanel();
        txt_nombre = new javax.swing.JTextField();
        txt_rafaga = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txt_quantum = new javax.swing.JTextField();
        btn_confirmar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator3 = new javax.swing.JSeparator();
        btn_comenzar = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        btn_limpiar = new javax.swing.JButton();
        btn_agregar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        txt_avance = new javax.swing.JTextField();
        txt_proceso = new javax.swing.JTextField();
        bar_proceso = new javax.swing.JProgressBar();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        txt_procesoEjecutados = new javax.swing.JTextField();
        txt_tiempoUtilizado = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        label_quantum = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabla_datosLista = new javax.swing.JTable();
        jPanel12 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_resultado = new javax.swing.JTable();
        jPanel13 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                formMouseMoved(evt);
            }
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel10.setBackground(new java.awt.Color(35, 46, 67));

        jLabel1.setFont(new java.awt.Font("Ubuntu Mono", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Round Robín");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(197, 201, 211));
        jLabel2.setText("Simulador");

        jPanel3.setBackground(new java.awt.Color(35, 46, 67));

        jPanel4.setBackground(new java.awt.Color(35, 46, 67));
        jPanel4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btn_habilitar.setBackground(new java.awt.Color(84, 176, 167));
        btn_habilitar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_habilitar.setForeground(new java.awt.Color(255, 255, 255));
        btn_habilitar.setText("Habilitar");
        btn_habilitar.setBorder(null);
        btn_habilitar.setBorderPainted(false);
        btn_habilitar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_habilitar.setFocusable(false);
        btn_habilitar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_habilitarActionPerformed(evt);
            }
        });

        btn_cancelar.setBackground(new java.awt.Color(84, 176, 167));
        btn_cancelar.setFont(new java.awt.Font("Dialog", 1, 16)); // NOI18N
        btn_cancelar.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancelar.setText("Cancelar");
        btn_cancelar.setBorder(null);
        btn_cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_cancelarActionPerformed(evt);
            }
        });

        jSeparator4.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator4.setAlignmentX(1.0F);
        jSeparator4.setAlignmentY(1.0F);
        jSeparator4.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator4.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jSeparator5.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator5.setAlignmentX(1.0F);
        jSeparator5.setAlignmentY(1.0F);
        jSeparator5.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator5.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jSeparator6.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator6.setAlignmentX(1.0F);
        jSeparator6.setAlignmentY(1.0F);
        jSeparator6.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator6.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_habilitar, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(37, 37, 37))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(23, Short.MAX_VALUE))))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_habilitar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btn_cancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(35, 46, 67));
        jPanel5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txt_nombre.setBackground(new java.awt.Color(35, 46, 67));
        txt_nombre.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txt_nombre.setForeground(new java.awt.Color(223, 229, 235));
        txt_nombre.setText("ingrese nombre...");
        txt_nombre.setBorder(null);
        txt_nombre.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_nombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_nombreMouseClicked(evt);
            }
        });

        txt_rafaga.setBackground(new java.awt.Color(35, 46, 67));
        txt_rafaga.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        txt_rafaga.setForeground(new java.awt.Color(255, 255, 255));
        txt_rafaga.setText("ingrese rafaga...");
        txt_rafaga.setBorder(null);
        txt_rafaga.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_rafaga.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_rafagaMouseClicked(evt);
            }
        });
        txt_rafaga.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_rafagaKeyTyped(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Ubuntu Mono", 1, 20)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(197, 201, 211));
        jLabel3.setText("Ráfaga CPU :");

        jLabel4.setFont(new java.awt.Font("Ubuntu Mono", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(197, 201, 211));
        jLabel4.setText("Nombre proceso :");

        jPanel6.setBackground(new java.awt.Color(35, 46, 67));
        jPanel6.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        txt_quantum.setBackground(new java.awt.Color(35, 46, 67));
        txt_quantum.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        txt_quantum.setForeground(new java.awt.Color(255, 255, 255));
        txt_quantum.setBorder(null);
        txt_quantum.setCaretColor(new java.awt.Color(255, 255, 255));
        txt_quantum.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_quantumMouseClicked(evt);
            }
        });
        txt_quantum.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_quantumKeyTyped(evt);
            }
        });

        btn_confirmar.setBackground(new java.awt.Color(84, 176, 167));
        btn_confirmar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btn_confirmar.setForeground(new java.awt.Color(255, 255, 255));
        btn_confirmar.setText("Confirmar");
        btn_confirmar.setBorder(null);
        btn_confirmar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_confirmar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_confirmarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Ubuntu Mono", 1, 20)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(197, 201, 211));
        jLabel6.setText("Determine Quantum :");

        jSeparator3.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator3.setAlignmentX(1.0F);
        jSeparator3.setAlignmentY(1.0F);
        jSeparator3.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator3.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(txt_quantum))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(btn_confirmar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btn_comenzar.setBackground(new java.awt.Color(84, 176, 167));
        btn_comenzar.setFont(new java.awt.Font("Ubuntu Mono", 1, 18)); // NOI18N
        btn_comenzar.setForeground(new java.awt.Color(35, 46, 67));
        btn_comenzar.setText("Comenzar");
        btn_comenzar.setBorder(null);
        btn_comenzar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_comenzar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_comenzarActionPerformed(evt);
            }
        });

        jPanel7.setBackground(new java.awt.Color(35, 46, 67));
        jPanel7.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        btn_limpiar.setBackground(new java.awt.Color(84, 176, 167));
        btn_limpiar.setForeground(new java.awt.Color(255, 255, 255));
        btn_limpiar.setText("Limpiar");
        btn_limpiar.setBorder(null);
        btn_limpiar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_limpiarActionPerformed(evt);
            }
        });

        btn_agregar.setBackground(new java.awt.Color(84, 176, 167));
        btn_agregar.setForeground(new java.awt.Color(255, 255, 255));
        btn_agregar.setText("Agregar");
        btn_agregar.setBorder(null);
        btn_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_limpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setAlignmentX(1.0F);
        jSeparator1.setAlignmentY(1.0F);
        jSeparator1.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator1.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator2.setAlignmentX(1.0F);
        jSeparator2.setAlignmentY(1.0F);
        jSeparator2.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        jSeparator2.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_rafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txt_nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 6, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(txt_rafaga, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(20, 20, 20)))
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(btn_comenzar, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jButton1.setBackground(new java.awt.Color(84, 176, 167));
        jButton1.setForeground(new java.awt.Color(84, 176, 167));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/java/files/robin-hood-icon.png"))); // NOI18N
        jButton1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Ubuntu Mono", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(197, 201, 211));
        jLabel12.setText("Planificación de procesos");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, 610));

        jPanel2.setBackground(new java.awt.Color(84, 176, 167));

        jPanel8.setBackground(new java.awt.Color(84, 176, 167));
        jPanel8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel8.setForeground(new java.awt.Color(245, 245, 245));

        txt_avance.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_avance.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_proceso.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        txt_proceso.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        bar_proceso.setForeground(new java.awt.Color(35, 46, 67));
        bar_proceso.setToolTipText("");
        bar_proceso.setPreferredSize(new java.awt.Dimension(146, 20));

        jLabel7.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Proceso Ejecución");

        jLabel8.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Avance");

        jLabel9.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Procesando");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_proceso)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txt_avance)
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(bar_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(113, 113, 113)
                        .addComponent(jLabel9)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bar_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_proceso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_avance, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(15, 15, 15))
        );

        jPanel9.setBackground(new java.awt.Color(84, 176, 167));
        jPanel9.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));

        txt_procesoEjecutados.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        txt_procesoEjecutados.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txt_tiempoUtilizado.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Procesos ejecutados");

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Ubuntu Mono", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Tiempo utilizado");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11))
                .addGap(18, 18, 18)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_procesoEjecutados, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_tiempoUtilizado, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_procesoEjecutados, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(txt_tiempoUtilizado, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE)
                        .addGap(2, 2, 2)))
                .addGap(16, 16, 16))
        );

        label_quantum.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label_quantum.setForeground(new java.awt.Color(255, 255, 255));

        jPanel11.setBackground(new java.awt.Color(223, 229, 235));
        jPanel11.setForeground(new java.awt.Color(223, 229, 235));

        tabla_datosLista.setBackground(new java.awt.Color(245, 245, 245));
        tabla_datosLista.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tabla_datosLista.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_datosLista.setGridColor(new java.awt.Color(242, 242, 242));
        tabla_datosLista.setRowHeight(20);
        tabla_datosLista.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jScrollPane2.setViewportView(tabla_datosLista);

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel12.setBackground(new java.awt.Color(223, 229, 235));
        jPanel12.setForeground(new java.awt.Color(223, 229, 235));

        tabla_resultado.setBackground(new java.awt.Color(245, 245, 245));
        tabla_resultado.setFont(new java.awt.Font("Dialog", 0, 16)); // NOI18N
        tabla_resultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_resultado.setGridColor(new java.awt.Color(245, 245, 245));
        tabla_resultado.setRowHeight(20);
        tabla_resultado.setSelectionBackground(new java.awt.Color(35, 46, 67));
        jScrollPane1.setViewportView(tabla_resultado);

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(label_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jPanel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(label_quantum, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, -6, 570, 630));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 40, 1030, 610));

        jPanel13.setBackground(new java.awt.Color(0, 0, 0));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/soft/java/files/Close Window_20px_1.png"))); // NOI18N
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel5MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(1004, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1030, 40));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // Mouse Pressed
         x = evt.getX();
         y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_formMouseMoved

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        // Mouse Dragged
       Point p = MouseInfo.getPointerInfo().getLocation();
       this.setLocation(p.x-x, p.y-y);
    }//GEN-LAST:event_formMouseDragged

    // Evento, click, - Boton Limpiar
    private void btn_limpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_limpiarActionPerformed
        txt_nombre.setText("");
        txt_rafaga.setText("");
    }//GEN-LAST:event_btn_limpiarActionPerformed

    // Evento, click, - Boton Agregar
    private void btn_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarActionPerformed

        String emptyQuantum = "";

        if (!txt_rafaga.getText().equals(emptyQuantum)){

            if ( Integer.parseInt(txt_rafaga.getText()) <= 100 )  {
                agregarDatosTabla();
                btn_comenzar.setEnabled(true);
            }else{
                rafagaMayor.setVisible(true);
                txt_rafaga.grabFocus();
                txt_rafaga.setText("");
            }
        }else{
            rafagaEmpty.setVisible(true);
            txt_rafaga.grabFocus();
            txt_rafaga.setText("");
        }
    }//GEN-LAST:event_btn_agregarActionPerformed

    // Evento, click, - Boton Comenzar
    private void btn_comenzarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_comenzarActionPerformed

        // Obtiene el quantum del - label
        quantumEjecucion = Integer.parseInt(txt_quantum.getText());

        new Thread(new executeProcess()).start();

        bloquearCampos();
        btn_habilitar.setEnabled(false);
        limpiarCampos();
    }//GEN-LAST:event_btn_comenzarActionPerformed

    // Evento, click, - Boton Confirmar
    private void btn_confirmarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_confirmarActionPerformed

        String emptyQuantum = "";

        if (!txt_quantum.getText().equals(emptyQuantum)) {

            if (Integer.parseInt(txt_quantum.getText()) > 0) {

                byte inputQuantum;
                inputQuantum = Byte.parseByte(txt_quantum.getText());

                label_quantum.setText("Quantum: " + inputQuantum);
                txt_quantum.setEditable(false);
                btn_confirmar.setEnabled(false);
                btn_agregar.setEnabled(true);
                btn_limpiar.setEnabled(true);

            }else{
                rafagaNull.setVisible(true);
            }

        }else{
            nameEmpty.setVisible(true);
        }
    }//GEN-LAST:event_btn_confirmarActionPerformed

    // Evento, teclado, - Campo quantum
    private void txt_quantumKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_quantumKeyTyped
        char inputText = evt.getKeyChar();
        if (inputText<'0' || inputText>'9') evt.consume();
    }//GEN-LAST:event_txt_quantumKeyTyped

    // Evento, teclado, - Campo rafaga
    private void txt_rafagaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rafagaKeyTyped
        char inputText = evt.getKeyChar();
        if (inputText<'0' || inputText>'9') evt.consume();
    }//GEN-LAST:event_txt_rafagaKeyTyped

    // Evento, click, - Boton Cancelar
    private void btn_cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_cancelarActionPerformed
        bloquearCampos();
        limpiarCampos();
    }//GEN-LAST:event_btn_cancelarActionPerformed

    // Evento, click, - Boton Habilitar
    private void btn_habilitarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_habilitarActionPerformed
        habilitarCampos();
        txt_nombre.grabFocus();
            txt_nombre.setText("");
    }//GEN-LAST:event_btn_habilitarActionPerformed

    private void txt_rafagaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_rafagaMouseClicked
        txt_rafaga.setText("");
    }//GEN-LAST:event_txt_rafagaMouseClicked

    private void txt_nombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_nombreMouseClicked
        txt_nombre.setText("");
    }//GEN-LAST:event_txt_nombreMouseClicked

    private void txt_quantumMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_quantumMouseClicked
        
    }//GEN-LAST:event_txt_quantumMouseClicked

    private void jLabel5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel5MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    
/*---------------------------------------------------------------------------------*/
    
    
    // Clase que ejecuta los procesos implementados
   private class executeProcess implements Runnable{

        @Override
        public void run() {
           
            byte state = 1,
                 indexRun = 0;
            
            while (state != 0) {
                
                while ( indexRun < contadorProcesos ) {
                    
                    obtenerDatosTablaLista(indexRun);
                                        
                   if ( residuoRafaga != 0 && residuoRafaga > quantumEjecucion ) {
                       
                       for (int index = 1; index <= quantumEjecucion; index++) {
                          
                            tabla_datosLista.setValueAt("Procesando", indexRun, 4);
                            residuoRafaga--;
                            avanceProcesos(rafagaCPU, residuoRafaga); // calcular el % de ejecución
                            mostrarProcesoBar(); // Muestra el avance del proceso en ejecución en la barra
                            tabla_datosLista.setValueAt(String.valueOf(residuoRafaga), indexRun, 3);
                                tiempoProceso++;
                                delayTime();
                       }// end for
                       
                       tabla_datosLista.setValueAt("En espera con "+valorBarraProceso+"%", indexRun, 4);
                       
                       if ( residuoRafaga == 0 ) {
                           tabla_datosLista.setValueAt("Terminado", indexRun, 4);
                           mostrarProcesoBar();
                           insertProcessEnd(indexRun); // agrega los procesos terminados, tabla resultado
                           deleteProcessEnd(indexRun); // elimina los proceso terminados, tabla lista
                           bar_proceso.setValue(0);
                       }
                     
                   } else if ( residuoRafaga > 0 && quantumEjecucion != 0 ) {
                    
                       while (residuoRafaga > 0) {
                           
                           tabla_datosLista.setValueAt("Procesando", indexRun, 4);
                           residuoRafaga--;
                           avanceProcesos(rafagaCPU, residuoRafaga); // calcular el % de ejecución
                           mostrarProcesoBar(); // Muestra el avance del proceso en ejecución en la barra
                           tabla_datosLista.setValueAt(String.valueOf(residuoRafaga), indexRun, 3);
                                tiempoProceso++;
                                delayTime();
                           
                       }// end while
                       
                       tabla_datosLista.setValueAt("En espera", indexRun, 4);
                       
                       if ( residuoRafaga == 0 && quantumEjecucion != 0 ) {
                           tabla_datosLista.setValueAt("Terminado", indexRun, 4);
                           mostrarProcesoBar();
                           insertProcessEnd(indexRun); // agrega los procesos terminados, tabla resultado
                           deleteProcessEnd(indexRun); // elimina los proceso terminados, tabla lista
                           bar_proceso.setValue(0);
                       }
  
                   }// end else if
                   
                txt_proceso.setText(String.valueOf(""));
                txt_avance.setText(String.valueOf(""));
                  
                    indexRun++;
                }// end 2do. while

                indexRun = 0;    
                
                txt_proceso.setText(String.valueOf(""));
                txt_avance.setText(String.valueOf(""));
                
                if (cantidadProceso == contadorProcesos){
                    closeProcess.setVisible(true);
                    state = 0;
                }
                
                
            }// end 1mer. while.
            
        }
        
        
        /*--------------------------------METODO TABLA LISTA-----------------------*/
        
        
        // Metodo, obtiene los datos de la tabla
        public void obtenerDatosTablaLista(int index){
          
            idProceso = (int) tabla_datosLista.getValueAt(index, 0);
            nombreProceso = (String) tabla_datosLista.getValueAt(index, 1);
            rafagaCPU = Integer.parseInt( (String) tabla_datosLista.getValueAt(index, 2) );
            residuoRafaga = Integer.parseInt( (String) tabla_datosLista.getValueAt(index, 3) );
            // Asigna el nombre del proceso en ejecucion
            if (idProceso > 0) {
                txt_proceso.setText(String.valueOf(nombreProceso));
            }
                     
        }
       
        // Metodo, avance en porcentaje del proceso en ejecución 
        public void avanceProcesos(int rafaga, int residuo){
            int valor = 100 / rafaga,
                porcentaje = 100 - (valor * residuo);
            valorBarraProceso = porcentaje;
            
            txt_avance.setText(String.valueOf(valorBarraProceso+"%"));
        }
        
        // Metodo, avance en la barra de progreso
        public void mostrarProcesoBar(){
            bar_proceso.setValue(valorBarraProceso);
            bar_proceso.repaint();
        } 
        
        
        // Metodo, retarda la ejecucion de los procesos, visualmente.
        public void delayTime(){
            try {
                Thread.sleep(1500);
            } catch (InterruptedException ex) {
                Logger.getLogger(MainMenu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        /*-------------------------METODOS TABLA INFORME---------------------------------*/
        
        // Metodo, agrega los procesos ejecutados a la tabla informe
        public void insertProcessEnd(int processEnd){
            
            modelo2 = (DefaultTableModel) tabla_resultado.getModel();
            
            Object datos[] = new Object[4];
            datos[0] = nombreProceso;
            datos[1] = rafagaCPU;
            datos[2] = tiempoProceso + "seg.";
            datos[3] = "Finalizado";
                modelo2.addRow(datos);
           
            cantidadProceso++;
            txt_procesoEjecutados.setText(String.valueOf(cantidadProceso + " Finalizados"));
            txt_tiempoUtilizado.setText(String.valueOf(tiempoProceso + " segundos"));
        }
        
        // Metodom eleimina los procesos ejecutados de la tabla lista
        public void deleteProcessEnd(int processEnd){
            
            tabla_datosLista.setValueAt(0, processEnd, 0);
            tabla_datosLista.setValueAt(nombreProceso, processEnd, 1);
            tabla_datosLista.setValueAt("0", processEnd, 2);
            tabla_datosLista.setValueAt("0", processEnd, 3);
            // tabla_datosLista.setValueAt("*****", processEnd, 4);
            
        }
   }

    
    
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_proceso;
    private javax.swing.JButton btn_agregar;
    private javax.swing.JButton btn_cancelar;
    private javax.swing.JButton btn_comenzar;
    private javax.swing.JButton btn_confirmar;
    private javax.swing.JButton btn_habilitar;
    private javax.swing.JButton btn_limpiar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel label_quantum;
    private javax.swing.JTable tabla_datosLista;
    private javax.swing.JTable tabla_resultado;
    private javax.swing.JTextField txt_avance;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_proceso;
    private javax.swing.JTextField txt_procesoEjecutados;
    private javax.swing.JTextField txt_quantum;
    private javax.swing.JTextField txt_rafaga;
    private javax.swing.JTextField txt_tiempoUtilizado;
    // End of variables declaration//GEN-END:variables
}
