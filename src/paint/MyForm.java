package paint;

import java.awt.AlphaComposite;
import java.awt.BasicStroke;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;
import java.awt.event.ComponentEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.awt.image.RenderedImage;
import java.io.File;
import java.io.IOException;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JColorChooser;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;

public class MyForm extends javax.swing.JFrame{

boolean rule=true;
boolean erase=false;
boolean line=false;
boolean rec=false;
boolean cir=false;

Graphics2D g2;

Color currentColor = Color.BLACK;

//Имя файла, которое сохраняем
String fileName;
    
BufferedImage image;


    public MyForm() {
        initComponents();
        lastik.setOpaque(true);
        colorButton.setBackground(currentColor);
        this.setTitle("Java Paint");
        this.setVisible(true);
        jPanel1.setVisible(true);
        image = new BufferedImage(this.getWidth(), this.getHeight(), BufferedImage.TYPE_INT_RGB);
        g2 = image.createGraphics();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lastik = new javax.swing.JButton();
        pen = new javax.swing.JButton();
        BLine = new javax.swing.JButton();
        BCir = new javax.swing.JButton();
        BRec = new javax.swing.JButton();
        colorButton = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        jMenuItem2 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setFocusable(false);
        jPanel1.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jPanel1MouseDragged(evt);
            }
        });
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                MyForm.this.mousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jPanel1MouseReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 337, Short.MAX_VALUE)
        );

        lastik.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/lastik.png"))); // NOI18N
        lastik.setAutoscrolls(true);
        lastik.setDisabledIcon(null);
        lastik.setFocusable(false);
        lastik.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lastik.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        lastik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastikActionPerformed(evt);
            }
        });

        pen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/pencil.png"))); // NOI18N
        pen.setDisabledIcon(null);
        pen.setFocusable(false);
        pen.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        pen.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        pen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                penActionPerformed(evt);
            }
        });

        BLine.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/line.png"))); // NOI18N
        BLine.setDisabledIcon(null);
        BLine.setFocusable(false);
        BLine.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BLine.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BLineActionPerformed(evt);
            }
        });

        BCir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/cir.png"))); // NOI18N
        BCir.setDisabledIcon(null);
        BCir.setFocusable(false);
        BCir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BCir.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BCir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BCirActionPerformed(evt);
            }
        });

        BRec.setIcon(new javax.swing.ImageIcon(getClass().getResource("/paint/rec.png"))); // NOI18N
        BRec.setDisabledIcon(null);
        BRec.setFocusable(false);
        BRec.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BRec.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BRec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BRecActionPerformed(evt);
            }
        });

        colorButton.setFocusable(false);
        colorButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colorButton.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        colorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorButtonActionPerformed(evt);
            }
        });

        jMenu1.setText("Файл");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Сохранить как...");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);
        jMenu1.add(jSeparator1);

        jMenuItem2.setText("Выход");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(pen, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastik, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BLine, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BCir, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BRec, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {BCir, BLine, BRec, colorButton, lastik, pen});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lastik, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BCir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BRec, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BLine, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pen, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(colorButton, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {BCir, BLine, BRec, colorButton, lastik, pen});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        System.exit(0);        
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void penActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_penActionPerformed
        rule=true;   
        erase=false;
        line=false;
        rec=false;
        cir=false;
    }//GEN-LAST:event_penActionPerformed

    private void lastikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastikActionPerformed
       //При erase=!erase по двойному клику можно отключить
        erase=true;  
        rule=false;
        line=false;
        rec=false;
        cir=false;
    }//GEN-LAST:event_lastikActionPerformed

    private void BLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BLineActionPerformed
        line=true;  
        rule=false;
        erase=false;
        rec=false;
        cir=false;   
    }//GEN-LAST:event_BLineActionPerformed

    private void BCirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BCirActionPerformed
            cir=true;  
            rule=false;
            erase=false;
            rec=false;
            line=false;
    }//GEN-LAST:event_BCirActionPerformed

    private void BRecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BRecActionPerformed
            rec=true;
            rule=false;
            erase=false;
            cir=false;
            line=false;  
    }//GEN-LAST:event_BRecActionPerformed

    private void colorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorButtonActionPerformed
        //Вызваю класс с ColorPicker
        currentColor = JColorChooser.showDialog(jPanel1, "Выберите цвет", currentColor);
        //Инициализирую цвет из Color Picker
        colorButton.setBackground(currentColor);
    }//GEN-LAST:event_colorButtonActionPerformed

    private void mousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mousePressed
        if(!(rule || erase)){
            drawStart = new Point(evt.getX(), evt.getY());
            drawEnd = drawStart;
            repaint();
        }
    }//GEN-LAST:event_mousePressed

    private void jPanel1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseReleased
        if(!(rule || erase)){
            Shape aShape = null;
            if (line){
                aShape = drawLine(drawStart.x, drawStart.y + 110, evt.getX(), evt.getY() + 110);
            } else if (cir){
                aShape = drawEllipse(drawStart.x, drawStart.y + 110, evt.getX(), evt.getY() + 110);
            } else if (rec) {
                aShape = drawRectangle(drawStart.x, drawStart.y + 110, evt.getX(), evt.getY() + 110);
            }
            shapes.add(aShape);
            shapeFill.add(currentColor);
            shapeStroke.add(currentColor);
            drawStart = null;
            drawEnd = null;
            repaint();
        }         
    }//GEN-LAST:event_jPanel1MouseReleased

    private void jPanel1MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseDragged
        if(rule){
            int x = evt.getX();
            int y = evt.getY() + 110;
            Shape aShape = null;
            aShape = drawBrush(x,y,5,5);
            shapes.add(aShape);
            shapeFill.add(currentColor);
            shapeStroke.add(currentColor);
        }else if (erase){
           int x = evt.getX();
            int y = evt.getY() + 110;
            Shape aShape = null;
            aShape = drawBrush(x,y,5,5);
            shapes.add(aShape);
            shapeFill.add(Color.WHITE);
            shapeStroke.add(Color.WHITE);
        }
        drawEnd = new Point(evt.getX(), evt.getY());
        repaint();
    }//GEN-LAST:event_jPanel1MouseDragged
 
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        try {
            //saveAsImage();
               BufferedImage bImg = new BufferedImage(jPanel1.getWidth(), jPanel1.getHeight(), BufferedImage.TYPE_INT_RGB);
               Graphics2D cg = bImg.createGraphics();
               jPanel1.paintAll(cg);
            //Окно для выбора положения файла
            JFileChooser jf = new JFileChooser();
            // Создаем фильтры для файлов
            TextFileFilter pngFilter = new TextFileFilter(".png");
            TextFileFilter jpgFilter = new TextFileFilter(".jpg");
            // Добавляем фильтры
            jf.addChoosableFileFilter(pngFilter);
            jf.addChoosableFileFilter(jpgFilter);

            int result = jf.showSaveDialog(null);

            if(result == JFileChooser.APPROVE_OPTION) {
                fileName = jf.getSelectedFile().getAbsolutePath();
            }
            // Смотрим какой фильтр выбран
            //g2.dispose();
            //RenderedImage rendImage = image;
            if(jf.getFileFilter() == pngFilter) {
                ImageIO.write(bImg, "png", new  File(fileName+".png"));
            }
            else {
                ImageIO.write(bImg, "jpeg", new  File(fileName+".jpg"));
            }
            } catch(IOException ex) {
                 JOptionPane.showMessageDialog(this, "Ошибка ввода-вывода");
            }
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Фильтр картинок
    class TextFileFilter extends FileFilter {
        private String ext;

        public TextFileFilter(String ext) {
            this.ext = ext;
        }

        public boolean accept(File file) {
            if (file.isDirectory()) return true;
            return (file.getName().endsWith(ext));
        }

        public String getDescription() {
            return "*" + ext;
        }
    }

    ArrayList<Shape> shapes = new ArrayList<Shape>();
        ArrayList<Color> shapeFill = new ArrayList<Color>();
        ArrayList<Color> shapeStroke = new ArrayList<Color>();

        Point drawStart, drawEnd;

        public void paint(Graphics g) {
            g2 = (Graphics2D)g;
            g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
            g2.setStroke(new BasicStroke(4));
            Iterator<Color> strokeCounter = shapeStroke.iterator();
            //Очищаю серые линии
            g2.clearRect(0, 110, jPanel1.getWidth() + 500, jPanel1.getHeight() + 500);
            //Отрисовываю все заново
            for (Shape s : shapes) {
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 1));
                g2.setPaint(strokeCounter.next());
                g2.draw(s);
            }
            if (drawStart != null && drawEnd != null) {
                g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_OVER, 0.40f));
                g2.setPaint(Color.LIGHT_GRAY);
                Shape aShape = null;
                if (line){
                    aShape = drawLine(drawStart.x, drawStart.y + 110, drawEnd.x, drawEnd.y + 110);
                } else if (cir){
                    aShape = drawEllipse(drawStart.x, drawStart.y + 110, drawEnd.x, drawEnd.y + 110);
                } else if (rec) {
                    aShape = drawRectangle(drawStart.x, drawStart.y + 110, drawEnd.x, drawEnd.y + 110);
                }
                g2.draw(aShape);
            }        
        }

        private Rectangle2D.Float drawRectangle(int x1, int y1, int x2, int y2) {
            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);
            int width = Math.abs(x1 - x2);
            int height = Math.abs(y1 - y2);
            return new Rectangle2D.Float(x, y, width, height);
        }
        
        private Ellipse2D.Float drawEllipse(int x1, int y1, int x2, int y2) {
            int x = Math.min(x1, x2);
            int y = Math.min(y1, y2);
            int width = Math.abs(x1 - x2);
            int height = Math.abs(y1 - y2);
            return new Ellipse2D.Float(x, y, width, height);
        }

        private Line2D.Float drawLine(int x1, int y1, int x2, int y2) {
            return new Line2D.Float(x1, y1, x2, y2);
        }

        private Ellipse2D.Float drawBrush(int x1, int y1, int brushStrokeWidth, int brushStrokeHeight) {
            return new Ellipse2D.Float(x1, y1, brushStrokeWidth, brushStrokeHeight);
        }

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
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MyForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MyForm();
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BCir;
    private javax.swing.JButton BLine;
    private javax.swing.JButton BRec;
    private javax.swing.JButton colorButton;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JButton lastik;
    private javax.swing.JButton pen;
    // End of variables declaration//GEN-END:variables
}
