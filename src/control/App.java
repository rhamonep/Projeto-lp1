/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.io.Serializable;
import model.SocialNetwork;
import view.Login.Login;
import view.Login.NewUser;
import view.Login.ChangePassword;
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
    private static SocialNetwork network;
    private static Login loginView;
    private static NewUser newUserView;
    private static ChangePassword changePasswordView;
    private static ForgotenPassword forgotenPassword;
    private static MainView main;
    private static AboutEdit about;
    private static NewCommentary commentary;
    private static NewPost post;
    
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
        loginView = new Login();
        loginView.setVisible(true);
    }
    
    public static void showNewUserView(){
        newUserView = new NewUser();
        newUserView.setVisible(true);
    }
    
    public static void showChangePasswordView(){
        changePasswordView = new ChangePassword();
        changePasswordView.setVisible(true);
    }
    public static void showForgotenPasswordView(){
        forgotenPassword = new ForgotenPassword();
        forgotenPassword.setVisible(true);
    }
    
    public static void showMainView(){
        main = new MainView();
        main.setVisible(true);
    }
    
    public static void ShowAboutEdit(){
        about = new AboutEdit();
        about.setVisible(true);
    }
    public static void ShowNewCommentary(){
        commentary = new NewCommentary();
        commentary.setVisible(true);
    }
    public static void ShowNewPost(){
        post = new NewPost();
        post.setVisible(true);
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public static SocialNetwork getNetwork() {
        return network;
    }

    public static void setNetwork(SocialNetwork network) {
        App.network = network;
    }

    public static Login getLoginView() {
        return loginView;
    }

    public static void setLoginView(Login loginView) {
       App.loginView = loginView;
    }

    public static NewUser getNewUserView() {
        return newUserView;
    }

    public static void setNewUserView(NewUser newUserView) {
        App.newUserView = newUserView;
    }

    public static ChangePassword getChangePasswordView() {
        return changePasswordView;
    }

    public static void setChangePasswordView(ChangePassword changePasswordView) {
        App.changePasswordView = changePasswordView;
    }

    public static ForgotenPassword getForgotenPassword() {
        return forgotenPassword;
    }

    public static void setForgotenPassword(ForgotenPassword forgotenPassword) {
        App.forgotenPassword = forgotenPassword;
    }

    public static MainView getMain() {
        return main;
    }

    public static void setMain(MainView main) {
        App.main = main;
    }

    public static AboutEdit getAbout() {
        return about;
    }

    public static void setAbout(AboutEdit about) {
        App.about = about;
    }
}
