package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import com.google.android.gms.common.annotation.KeepName;
import gg.d;
import ig.e;
import io.sentry.android.core.c2;
import jg.s;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f29003a = 0;

    public static Intent a(Context context, PendingIntent pendingIntent, int i15, boolean z15) {
        Intent intent = new Intent(context, (Class<?>) GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i15);
        intent.putExtra("notify_manager", z15);
        return intent;
    }

    private final void b() {
        GoogleApiActivity googleApiActivity;
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            c2.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            c2.e("GoogleApiActivity", "Activity started without resolution");
            finish();
            return;
        }
        if (pendingIntent == null) {
            d.n().o(this, ((Integer) s.l(num)).intValue(), 2, this);
            this.f29003a = 1;
            return;
        }
        try {
            googleApiActivity = this;
            try {
                googleApiActivity.startIntentSenderForResult(pendingIntent.getIntentSender(), 1, null, 0, 0, 0);
                googleApiActivity.f29003a = 1;
            } catch (ActivityNotFoundException e15) {
                e = e15;
                if (extras.getBoolean("notify_manager", true)) {
                    e.m(this).z(new gg.a(22, null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String string = pendingIntent.toString();
                    StringBuilder sb5 = new StringBuilder(string.length() + 36);
                    sb5.append("Activity not found while launching ");
                    sb5.append(string);
                    sb5.append(".");
                    String string2 = sb5.toString();
                    if (Build.FINGERPRINT.contains("generic")) {
                        string2 = string2.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    c2.f("GoogleApiActivity", string2, e);
                }
                googleApiActivity.f29003a = 1;
                finish();
            } catch (IntentSender.SendIntentException e16) {
                e = e16;
                c2.f("GoogleApiActivity", "Failed to launch pendingIntent", e);
                finish();
            }
        } catch (ActivityNotFoundException e17) {
            e = e17;
            googleApiActivity = this;
        } catch (IntentSender.SendIntentException e18) {
            e = e18;
        }
    }

    @Override // android.app.Activity
    protected final void onActivityResult(int i15, int i16, Intent intent) {
        super.onActivityResult(i15, i16, intent);
        if (i15 == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f29003a = 0;
            setResult(i16, intent);
            if (booleanExtra) {
                e eVarM = e.m(this);
                if (i16 == -1) {
                    eVarM.s();
                } else if (i16 == 0) {
                    eVarM.z(new gg.a(13, null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i15 == 2) {
            this.f29003a = 0;
            setResult(i16, intent);
        }
        finish();
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        this.f29003a = 0;
        setResult(0);
        finish();
    }

    @Override // android.app.Activity
    protected final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f29003a = bundle.getInt("resolution");
        }
        if (this.f29003a != 1) {
            b();
        }
    }

    @Override // android.app.Activity
    protected final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f29003a);
        super.onSaveInstanceState(bundle);
    }
}
