import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

import io.sentry.Sentry;

public class MyActivity extends AppCompatActivity {
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    Sentry.captureMessage("testing SDK setup");
  }
}
