package gg;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.util.TypedValue;
import android.widget.ProgressBar;
import com.google.android.gms.common.api.GoogleApiActivity;
import ig.l0;
import ig.m0;
import io.sentry.android.core.c2;
import jg.d0;
import jg.g0;

/* JADX INFO: loaded from: classes3.dex */
public class d extends e {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private String f72732c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final Object f72730e = new Object();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final d f72731f = new d();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f72729d = e.f72733a;

    public static d n() {
        return f72731f;
    }

    @Override // gg.e
    public Intent b(Context context, int i15, String str) {
        return super.b(context, i15, str);
    }

    @Override // gg.e
    public PendingIntent c(Context context, int i15, int i16) {
        return super.c(context, i15, i16);
    }

    @Override // gg.e
    public final String e(int i15) {
        return super.e(i15);
    }

    @Override // gg.e
    public int g(Context context) {
        return super.g(context);
    }

    @Override // gg.e
    public int h(Context context, int i15) {
        return super.h(context, i15);
    }

    @Override // gg.e
    public final boolean j(int i15) {
        return super.j(i15);
    }

    public Dialog l(Activity activity, int i15, int i16, DialogInterface.OnCancelListener onCancelListener) {
        return q(activity, i15, g0.b(activity, b(activity, i15, "d"), i16), onCancelListener, null);
    }

    public PendingIntent m(Context context, a aVar) {
        return aVar.u() ? aVar.r() : c(context, aVar.m(), 0);
    }

    public boolean o(Activity activity, int i15, int i16, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogL = l(activity, i15, i16, onCancelListener);
        if (dialogL == null) {
            return false;
        }
        w(activity, dialogL, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    public void p(Context context, int i15) {
        s(context, i15, null, d(context, i15, 0, "n"));
    }

    final Dialog q(Context context, int i15, g0 g0Var, DialogInterface.OnCancelListener onCancelListener, DialogInterface.OnClickListener onClickListener) {
        AlertDialog.Builder builder;
        AlertDialog.Builder builder2 = null;
        if (i15 == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder2 == null) {
            builder2 = builder;
            builder2 = new AlertDialog.Builder(context);
        }
        builder2 = builder;
        builder2.setMessage(d0.c(context, i15));
        if (onCancelListener != null) {
            builder2.setOnCancelListener(onCancelListener);
        }
        String strE = d0.e(context, i15);
        DialogInterface.OnClickListener onClickListener2 = g0Var;
        if (strE != null) {
            if (g0Var == null) {
                onClickListener2 = onClickListener;
            }
            builder2.setPositiveButton(strE, onClickListener2);
        }
        String strA = d0.a(context, i15);
        if (strA != null) {
            builder2.setTitle(strA);
        }
        c2.h("GoogleApiAvailability", String.format("Creating dialog for Google Play services availability issue. ConnectionResult=%s", Integer.valueOf(i15)), new IllegalArgumentException());
        return builder2.create();
    }

    public final boolean r(Activity activity, ig.i iVar, int i15, int i16, DialogInterface.OnCancelListener onCancelListener) {
        Dialog dialogQ = q(activity, i15, g0.c(iVar, b(activity, i15, "d"), 2), onCancelListener, null);
        if (dialogQ == null) {
            return false;
        }
        w(activity, dialogQ, "GooglePlayServicesErrorDialog", onCancelListener);
        return true;
    }

    final void s(Context context, int i15, String str, PendingIntent pendingIntent) {
        int i16;
        String str2;
        c2.h("GoogleApiAvailability", String.format("GMS core API Availability. ConnectionResult=%s, tag=%s", Integer.valueOf(i15), null), new IllegalArgumentException());
        if (i15 == 18) {
            x(context);
            return;
        }
        if (pendingIntent == null) {
            if (i15 == 6) {
                c2.g("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
                return;
            }
            return;
        }
        String strB = d0.b(context, i15);
        String strD = d0.d(context, i15);
        Resources resources = context.getResources();
        NotificationManager notificationManager = (NotificationManager) jg.s.l(context.getSystemService("notification"));
        s5.l.e eVarV = new s5.l.e(context).p(true).e(true).j(strB).v(new s5.l.c().h(strD));
        boolean zB = com.google.android.gms.common.util.g.b(context);
        int i17 = R.drawable.stat_sys_warning;
        if (zB) {
            int i18 = context.getApplicationInfo().icon;
            if (i18 != 0) {
                i17 = i18;
            }
            eVarV.t(i17).r(2);
            if (com.google.android.gms.common.util.g.c(context)) {
                eVarV.a(dg.a.f41423a, resources.getString(dg.b.f41438o), pendingIntent);
            } else {
                eVarV.h(pendingIntent);
            }
        } else {
            eVarV.t(R.drawable.stat_sys_warning).w(resources.getString(dg.b.f41431h)).z(System.currentTimeMillis()).h(pendingIntent).i(strD);
        }
        if (com.google.android.gms.common.util.j.d()) {
            jg.s.o(com.google.android.gms.common.util.j.d());
            synchronized (f72730e) {
                str2 = this.f72732c;
            }
            if (str2 == null) {
                str2 = "com.google.android.gms.availability";
                NotificationChannel notificationChannel = notificationManager.getNotificationChannel("com.google.android.gms.availability");
                String string = context.getResources().getString(dg.b.f41430g);
                if (notificationChannel == null) {
                    notificationManager.createNotificationChannel(new NotificationChannel("com.google.android.gms.availability", string, 4));
                } else if (!string.contentEquals(notificationChannel.getName())) {
                    notificationChannel.setName(string);
                    notificationManager.createNotificationChannel(notificationChannel);
                }
            }
            eVarV.f(str2);
        }
        Notification notificationB = eVarV.b();
        if (i15 == 1 || i15 == 2 || i15 == 3) {
            i.f72739b.set(false);
            i16 = 10436;
        } else {
            i16 = 39789;
        }
        notificationManager.notify(i16, notificationB);
    }

    public final boolean t(Context context, a aVar, int i15) {
        PendingIntent pendingIntentM;
        if (qg.b.a(context) || (pendingIntentM = m(context, aVar)) == null) {
            return false;
        }
        s(context, aVar.m(), null, vg.e.a(context, 0, GoogleApiActivity.a(context, pendingIntentM, i15, true), vg.e.f206697a | 134217728));
        return true;
    }

    public final Dialog u(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, null, R.attr.progressBarStyleLarge);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(d0.c(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog alertDialogCreate = builder.create();
        w(activity, alertDialogCreate, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return alertDialogCreate;
    }

    public final m0 v(Context context, l0 l0Var) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme("package");
        m0 m0Var = new m0(l0Var);
        u5.a.m(context, m0Var, intentFilter, 2);
        m0Var.a(context);
        if (i(context, "com.google.android.gms")) {
            return m0Var;
        }
        l0Var.a();
        m0Var.b();
        return null;
    }

    final void w(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        try {
            if (activity instanceof androidx.fragment.app.p) {
                m.h2(dialog, onCancelListener).g2(((androidx.fragment.app.p) activity).w0(), str);
                return;
            }
        } catch (NoClassDefFoundError unused) {
        }
        b.a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    final void x(Context context) {
        new o(this, context).sendEmptyMessageDelayed(1, 120000L);
    }
}
