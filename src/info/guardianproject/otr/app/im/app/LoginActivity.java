package info.guardianproject.otr.app.im.app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class LoginActivity extends Activity {
    
    private ImApp mApp = null;

    
    @Override
    protected void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        Intent i = getIntent();
        
        mApp = (ImApp)getApplication();
        
        String action = i.getAction();
        
    }

}
