package Interfaz;

import java.io.IOException;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import Mundo.Contenedora.Mensaje;
import Mundo.dao.AnimeDAO;
import Mundo.dao.EstudioDAO;
import Mundo.dao.GeneroDAO;
import Mundo.db.Conexion;
import Mundo.dto.AnimeIDTO;
import Mundo.dto.EstudioIDTO;
import Mundo.dto.GeneroIDTO;
import Mundo.servidor.User;
import Mundo.Contenedora.Nodo;

public class InterfazPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
	private Conexion con;
    public InterfazPrincipal() throws UnknownHostException, ClassNotFoundException, IOException, SQLException {
    	con= new Conexion("jdbc:postgresql://127.0.0.1:5432/listaanimedb", "anime", "anime");
        initComponents();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     * @throws IOException 
     * @throws ClassNotFoundException 
     * @throws UnknownHostException 
     * @throws SQLException 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() throws UnknownHostException, ClassNotFoundException, IOException, SQLException {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton11 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Crear Anime");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					try {
						jButton1ActionPerformed(evt);
					} catch (SQLException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				} catch (Exception e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton2.setText("Crear Genero");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton2ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton3.setText("Crear Estudio");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Eliminar Anime");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton4ActionPerformed(evt);
				} catch (UnknownHostException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (ClassNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton5.setText("Eliminar Genero");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton5ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton6.setText("Eliminar Estudio");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton6ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        jButton7.setText("Ver animes");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton7ActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
        });

        jButton8.setText("Ver generos");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton8ActionPerformed(evt);
				} catch (SQLException e) {
					e.printStackTrace();
				}
            }
        });

        jButton9.setText("Ver estudios");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton9ActionPerformed(evt);
				} catch (SQLException e) {
					// 
					e.printStackTrace();
				}
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jButton11.setText("Editar Anime");
        jButton11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                try {
					jButton11ActionPerformed(evt);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton4)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton5))
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGap(18, 18, 18)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jButton6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 87, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton8)
                    .addComponent(jButton9))
                .addGap(18, 18, 18)
                .addComponent(jButton11)
                .addContainerGap(30, Short.MAX_VALUE))
        );
        verAnimes();
        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // crear anime
    	EstudioDAO dao	= new EstudioDAO();
    	ArrayList<EstudioIDTO> array =  dao.consultAll(con, null);
    	GeneroDAO gdao	= new GeneroDAO();
    	ArrayList<GeneroIDTO> generos =  gdao.consultAll(con, null);
    	formAnime f = new formAnime(this,true, array, generos,con);
    	f.setVisible(true);
    	
    }                                        

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // crear genero
    	String nombre  = JOptionPane.showInputDialog(null, "nombre del genero a Crear");
    	GeneroDAO dao = new GeneroDAO();
    	Mensaje message = new Mensaje();
    	message.setGenero(nombre);
    	dao.insert(con, message);
    	verGeneros();
    }                                        

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        //crear estudio
    	String nombre  = JOptionPane.showInputDialog(null, "nombre del estudio a Crear");
    	EstudioDAO dao = new EstudioDAO();
    	Mensaje message = new Mensaje();
    	message.setEstudio(nombre);
    	dao.insert(con, message);
    }                                        

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws UnknownHostException, ClassNotFoundException, IOException, SQLException {                                         
        // eliminar anime
    	String nombre  = JOptionPane.showInputDialog(null, "ID del anime a eliminar");
    	AnimeDAO dao	= new AnimeDAO();
    	Mensaje message = new Mensaje();
    	message.setIdAnime(Integer.parseInt(nombre));
    	dao.delete(con, message);
    	verAnimes();
    }                                        

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // ver anime
    	try {
			verAnimes();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }                                        

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // eliminar genero
    	String nombre  = JOptionPane.showInputDialog(null, "ID del genero a eliminar");
    	GeneroDAO dao	= new GeneroDAO();
    	Mensaje message = new Mensaje();
    	message.setIdGenero(Integer.parseInt(nombre));
    	dao.delete(con, message);
    	verGeneros();
    }                                        

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        //eliminar estudio
    	String nombre  = JOptionPane.showInputDialog(null, "ID del estudio a eliminar");
    	EstudioDAO dao	= new EstudioDAO();
    	Mensaje message = new Mensaje();
    	message.setIdEstudio(Integer.parseInt(nombre));
    	dao.delete(con, message);
    	verEstudios();
    }                                        

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // ver generos
    	verGeneros();
    }                                        

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                         
        // ver estudios
    	verEstudios();
    }                                        

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws SQLException {                                          
        // editar anime
    	String id = JOptionPane.showInputDialog(null,"inserte el id del anime a modificar");
    	Mensaje message = new Mensaje();
    	message.setIdAnime(Integer.parseInt(id));
    	AnimeDAO adao = new AnimeDAO();
    	AnimeIDTO adto = adao.consult(con, message);
    	
    	EstudioDAO dao	= new EstudioDAO();
    	ArrayList<EstudioIDTO> array =  dao.consultAll(con, null);
    	GeneroDAO gdao	= new GeneroDAO();
    	ArrayList<GeneroIDTO> generos =  gdao.consultAll(con, null);
    	formAnime f = new formAnime(this,true, array, generos,con);
    	f.setInfo(adto);
    	f.setVisible(true);
    }
    private void verAnimes() throws UnknownHostException, ClassNotFoundException, IOException, SQLException {
    	AnimeDAO dao = new AnimeDAO();
    	EstudioDAO edao	= new EstudioDAO();
    	GeneroDAO gdao= new GeneroDAO();
    	String value ="";
    	ArrayList<AnimeIDTO> array =  dao.consultAll(con, null);
    	for (AnimeIDTO	an : array) {
    		System.out.println(an.getIdAnime());
    		Mensaje msj = new Mensaje();
    		msj.setIdEstudio(an.getEstudio());
			EstudioIDTO est =edao.consult(con, msj);
			ArrayList<Integer> garray =  gdao.consultPivot(con, an.getIdAnime());
			String totalGen= "";
			for (int idGenero : garray) {
				msj.setIdGenero(idGenero);
				GeneroIDTO gdto = gdao.consult(con, msj);
				totalGen += gdto.getNombreGenero()+", ";
				System.out.println(totalGen);
				System.out.println("-------------------------------");
			}
    		value += an.toString()+ est.getNombreEstudio()+ " generos="+totalGen+"\n";
		}
    	jTextArea1.setText(value);
    }
    private void verGeneros() throws SQLException {
    	GeneroDAO dao	= new GeneroDAO();
    	ArrayList<GeneroIDTO> array =  dao.consultAll(con, null);
    	String texto ="";
    	for (GeneroIDTO estudioDAO : array) {
			texto += estudioDAO.toString()+"\n";
		}
    	jTextArea1.setText(texto);
    }
    private void verEstudios() throws SQLException {
    	EstudioDAO dao	= new EstudioDAO();
    	ArrayList<EstudioIDTO> array =  dao.consultAll(con, null);
    	String texto ="";
    	for (EstudioIDTO estudio : array) {
			texto += estudio.toString()+"\n";
		}
    	jTextArea1.setText(texto);
    }
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
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new InterfazPrincipal().setVisible(true);
				} catch (ClassNotFoundException | IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
