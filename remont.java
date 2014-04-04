package javaapplication1;
public classremontextendsjavax.swing.JFrame
{
public remont()
{
initComponents();
}
private void initComponents()
{
jPanel1 = new javax.swing.JPanel();
jTextField1 = new javax.swing.JTextField();
jTextField2 = new javax.swing.JTextField();
jLabel1 = new javax.swing.JLabel();
jButton1 = new javax.swing.JButton();
jButton2 = new javax.swing.JButton();
jButton3 = new javax.swing.JButton();
jButton4 = new javax.swing.JButton();
jButton5 = new javax.swing.JButton();
jButton6 = new javax.swing.JButton();
jButton7 = new javax.swing.JButton();
jButton8 = new javax.swing.JButton();/
jButton9 = new javax.swing.JButton();
jButton10 = new javax.swing.JButton();
jButton11 = new javax.swing.JButton();
jButton12 = new javax.swing.JButton();
setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Ремонт"));
jLabel1.setText("Стоимость:");
jButton1.setText("1");
jButton1.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton1ActionPerformed(evt);
}
});
jButton2.setText("2");
jButton2.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt){
jButton2ActionPerformed(evt);/*передача в функцию 
}
});
 
jButton3.setText("3");
jButton3.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton3ActionPerformed(evt);
}
});
jButton4.setText("4");
jButton4.addActionListener(newjava.awt.event.ActionListener()
{ 
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton4ActionPerformed(evt);
}
}); 
jButton5.setText("5");
jButton5.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton5ActionPerformed(evt);
}
});
jButton6.setText("6");
jButton6.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton6ActionPerformed(evt);
}
}); 
jButton7.setText("7");
jButton7.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton7ActionPerformed(evt);
}
}); 
jButton8.setText("8");
jButton8.addActionListener(newjava.awt.event.ActionListener()
{   
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton8ActionPerformed(evt);
}
});
 
jButton9.setText("9");
jButton9.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
 jButton9ActionPerformed(evt);
}
}); 
jButton10.setText("0");
jButton10.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton10ActionPerformed(evt);
}
});
 
jButton11.setText(".");
jButton11.addActionListener(newjava.awt.event.ActionListener()
{
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton11ActionPerformed(evt);
}
});
jButton12.setText("OK");
jButton12.addActionListener(newjava.awt.event.ActionListener()
{ 
public void actionPerformed(java.awt.event.ActionEventevt)
{
jButton12ActionPerformed(evt);
}
});
javax.swing.GroupLayoutjPanel1Layout = newjavax.swing.GroupLayout(jPanel1);
jPanel1.setLayout(jPanel1Layout);
jPanel1Layout.setHorizontalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
.addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
.addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE)
.addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 47,Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
.addComponent(jButton10, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
.addComponent(jButton8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE,Short.MAX_VALUE))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
.addComponent(jButton12, javax.swing.GroupLayout.Alignment.TRAILING)))
.addGroup(jPanel1Layout.createSequentialGroup()
.addComponent(jLabel1)
.addGap(18, 18, 18)
.addComponent(jTextField2))))
jPanel1Layout.setVerticalGroup(
jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addGroup(jPanel1Layout.createSequentialGroup()
.addGap(7, 7, 7)
.addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)/
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jLabel1)
.addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
.addGap(36, 36, 36)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton2)
.addComponent(jButton1)
.addComponent(jButton3))
addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton4)
.addComponent(jButton5)
.addComponent(jButton6))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton7)
.addComponent(jButton8)
.addComponent(jButton9))
.addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
.addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
.addComponent(jButton10)
.addComponent(jButton11)
.addComponent(jButton12))
.addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
 );
javax.swing.GroupLayoutlayout = newjavax.swing.GroupLayout(getContentPane());
getContentPane().setLayout(layout);
layout.setHorizontalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
layout.setVerticalGroup(
layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
.addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
 
pack();
}
 
private void jButton1ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 1);
}
 
private void jButton2ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 2);
}
 
private void jButton3ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 3);
}
 
private void jButton4ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 4);
}
 
private void jButton5ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 5);
}
 
private void jButton6ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 6);
}
 
private void jButton7ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 7);
}
 
private void jButton8ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 8);
 }
 
private void jButton9ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 9);
}
 
private void jButton11ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + ".");
}
 
private void jButton10ActionPerformed(java.awt.event.ActionEventevt){
jTextField2.setText(jTextField2.getText() + 0);
}
 
private void jButton12ActionPerformed(java.awt.event.ActionEventevt){
jTextField1.setText(jTextField2.getText());
JavaApplication1.setLast_result(Float.parseFloat(jTextField2.getText()));
}
 
public static void main(Stringargs[]){
try{
for(javax.swing.UIManager.LookAndFeelInfoinfo :javax.swing.UIManager.getInstalledLookAndFeels()){
javax.swing.UIManager.setLookAndFeel(info.getClassName());
break;
}
}
}catch(ClassNotFoundExceptionex){ 
java.util.logging.Logger.getLogger(remont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}catch(InstantiationExceptionex){        
java.util.logging.Logger.getLogger(remont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}catch(IllegalAccessException ex){      
java.util.logging.Logger.getLogger(remont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}catch(javax.swing.UnsupportedLookAndFeelException ex){
java.util.logging.Logger.getLogger(remont.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
}
 
java.awt.EventQueue.invokeLater(newRunnable(){
public void run(){
new remont().setVisible(true);
}
});
}

private javax.swing.JButtonjButton1;
private javax.swing.JButton jButton10; 
private javax.swing.JButton jButton11; 
private javax.swing.JButton jButton12;  
private javax.swing.JButton jButton2;
private javax.swing.JButton jButton3;
private javax.swing.JButton jButton4;
private javax.swing.JButton jButton5;
private javax.swing.JButton jButton6;
private javax.swing.JButton jButton7;
private javax.swing.JButton jButton8;
private javax.swing.JButton jButton9;
private javax.swing.JLabel jLabel1;
private javax.swing.JPanel jPanel1;
private javax.swing.JTextField jTextField1;
private javax.swing.JTextField jTextField2;
}
