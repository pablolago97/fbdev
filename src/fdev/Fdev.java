

package fdev;

import facebook4j.Facebook;
import facebook4j.FacebookFactory;


public class Fdev  {

    
    public static void main(String[] args) {
        
        //Instancia
        Facebook facebook = new FacebookFactory().getInstance();
        
        facebook.getOAuthAppAccessToken();
        
        facebook.setOAuthAppId(appId, appSecret);
        facebook.setOAuthPermissions(commaSeparetedPermissions);
        facebook.setOAuthAccessToken(new AccessToken(accessToken, null));
        
    }
    
}
