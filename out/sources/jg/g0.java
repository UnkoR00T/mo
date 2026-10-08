package jg;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import io.sentry.android.core.c2;

/* JADX INFO: loaded from: classes3.dex */
public abstract class g0 implements DialogInterface.OnClickListener {
    public static g0 b(Activity activity, Intent intent, int i15) {
        return new e0(intent, activity, i15);
    }

    public static g0 c(ig.i iVar, Intent intent, int i15) {
        return new f0(intent, iVar, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i15) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e15) {
                c2.f("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e15);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
