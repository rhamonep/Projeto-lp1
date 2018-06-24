/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import javax.swing.JFrame;
import model.SocialNetwork;
import view.Login.Login;
import view.Login.NewUser;
import view.Login.ForgotenPassword;
import view.MainView;
import view.About.AboutEdit;
import view.CreationWindows.NewCommentary;
import view.CreationWindows.NewPost;



/**
 *
 * @author italo
 */
public class App implements Serializable{
    
    private static JFrame mainWindow;
    private static JFrame secondaryWindow;
    private static SocialNetwork network;
    
    public static void main(String[] args) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     
        network = new SocialNetwork();       
        showLoginView();
    }
    public static void showLoginView(){
        mainWindow = new Login();
        mainWindow.setVisible(true);
    }
    
    public static void showNewUserView(){
        secondaryWindow = new NewUser();
        secondaryWindow.setVisible(true);
    }

    public static void showForgotenPasswordView(){
        secondaryWindow = new ForgotenPassword();
        secondaryWindow.setVisible(true);
    }
    
    public static void showMainView(){
        mainWindow = new MainView();
        mainWindow.setVisible(true);
    }
    
    public static void ShowAboutEdit(){
        secondaryWindow = new AboutEdit();
        secondaryWindow.setVisible(true);
    }
    public static void ShowNewCommentary(){
        secondaryWindow = new NewCommentary();
        secondaryWindow.setVisible(true);
    }
    public static void ShowNewPost(){
        secondaryWindow = new NewPost();
        secondaryWindow.setVisible(true);
    }
    
    // getters and setters
    public static SocialNetwork getNetwork() {
        return network;
    }

    public static void setNetwork(SocialNetwork network) {
        App.network = network;
    }

    public static JFrame getMainWindow() {
        return mainWindow;
    }

    public static void setMainWindow(JFrame mainWindow) {
        App.mainWindow = mainWindow;
    }

    public static JFrame getSecondaryWindow() {
        return secondaryWindow;
    }

    public static void setSecondaryWindow(JFrame secondaryWindow) {
        App.secondaryWindow = secondaryWindow;
    }
}
