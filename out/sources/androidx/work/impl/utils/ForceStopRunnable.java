package androidx.work.impl.utils;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.a;
import cc.d0;
import cc.i0;
import cc.j0;
import dc.h;
import dc.s;
import dc.t;
import e6.m;
import java.util.List;
import java.util.concurrent.TimeUnit;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ub.o0;
import ub.w;
import vb.e1;
import vb.h0;
import xb.f;

/* JADX INFO: loaded from: classes3.dex */
public class ForceStopRunnable implements Runnable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final String f13869e = w.i("ForceStopRunnable");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final long f13870f = TimeUnit.DAYS.toMillis(3650);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f13871a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e1 f13872b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final s f13873c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f13874d = 0;

    public static class BroadcastReceiver extends android.content.BroadcastReceiver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final String f13875a = w.i("ForceStopRunnable$Rcvr");

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            if (intent == null || !"ACTION_FORCE_STOP_RESCHEDULE".equals(intent.getAction())) {
                return;
            }
            w.e().j(f13875a, "Rescheduling alarm that keeps track of force-stops.");
            ForceStopRunnable.g(context);
        }
    }

    public ForceStopRunnable(Context context, e1 e1Var) {
        this.f13871a = context.getApplicationContext();
        this.f13872b = e1Var;
        this.f13873c = e1Var.q();
    }

    static Intent c(Context context) {
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        return intent;
    }

    private static PendingIntent d(Context context, int i15) {
        return PendingIntent.getBroadcast(context, -1, c(context), i15);
    }

    static void g(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        PendingIntent pendingIntentD = d(context, Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728);
        long jCurrentTimeMillis = System.currentTimeMillis() + f13870f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, pendingIntentD);
        }
    }

    public boolean a() {
        boolean zI = f.i(this.f13871a, this.f13872b.u());
        WorkDatabase workDatabaseU = this.f13872b.u();
        j0 j0VarE0 = workDatabaseU.e0();
        d0 d0VarD0 = workDatabaseU.d0();
        workDatabaseU.i();
        try {
            List<i0> listU = j0VarE0.u();
            boolean z15 = (listU == null || listU.isEmpty()) ? false : true;
            if (z15) {
                for (i0 i0Var : listU) {
                    j0VarE0.w(o0.c.ENQUEUED, i0Var.id);
                    j0VarE0.d(i0Var.id, -512);
                    j0VarE0.o(i0Var.id, -1L);
                }
            }
            d0VarD0.b();
            workDatabaseU.X();
            workDatabaseU.q();
            return z15 || zI;
        } catch (Throwable th4) {
            workDatabaseU.q();
            throw th4;
        }
    }

    public void b() {
        boolean zA = a();
        if (h()) {
            w.e().a(f13869e, "Rescheduling Workers.");
            this.f13872b.x();
            this.f13872b.q().e(false);
        } else if (e()) {
            w.e().a(f13869e, "Application was force-stopped, rescheduling.");
            this.f13872b.x();
            this.f13873c.d(this.f13872b.n().getClock().a());
        } else if (zA) {
            w.e().a(f13869e, "Found unfinished work, scheduling it.");
            a.f(this.f13872b.n(), this.f13872b.u(), this.f13872b.s());
        }
    }

    public boolean e() {
        try {
            int i15 = Build.VERSION.SDK_INT;
            PendingIntent pendingIntentD = d(this.f13871a, i15 >= 31 ? 570425344 : PKIFailureInfo.duplicateCertReq);
            if (i15 >= 30) {
                if (pendingIntentD != null) {
                    pendingIntentD.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) this.f13871a.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    long jA = this.f13873c.a();
                    for (int i16 = 0; i16 < historicalProcessExitReasons.size(); i16++) {
                        ApplicationExitInfo applicationExitInfoA = h.a(historicalProcessExitReasons.get(i16));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jA) {
                            return true;
                        }
                    }
                }
            } else if (pendingIntentD == null) {
                g(this.f13871a);
                return true;
            }
            return false;
        } catch (IllegalArgumentException e15) {
            e = e15;
            w.e().l(f13869e, "Ignoring exception", e);
            return true;
        } catch (SecurityException e16) {
            e = e16;
            w.e().l(f13869e, "Ignoring exception", e);
            return true;
        }
    }

    public boolean f() {
        androidx.work.a aVarN = this.f13872b.n();
        if (TextUtils.isEmpty(aVarN.getDefaultProcessName())) {
            w.e().a(f13869e, "The default process name was not specified.");
            return true;
        }
        boolean zB = t.b(this.f13871a, aVarN);
        w.e().a(f13869e, "Is default app process = " + zB);
        return zB;
    }

    public boolean h() {
        return this.f13872b.q().b();
    }

    public void i(long j15) {
        try {
            Thread.sleep(j15);
        } catch (InterruptedException unused) {
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        int i15;
        try {
            if (f()) {
                while (true) {
                    try {
                        h0.c(this.f13871a);
                        w.e().a(f13869e, "Performing cleanup operations.");
                        try {
                            b();
                            break;
                        } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e15) {
                            i15 = this.f13874d + 1;
                            this.f13874d = i15;
                            if (i15 >= 3) {
                                String str = m.a(this.f13871a) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                                w wVarE = w.e();
                                String str2 = f13869e;
                                wVarE.d(str2, str, e15);
                                IllegalStateException illegalStateException = new IllegalStateException(str, e15);
                                i6.a<Throwable> aVarE = this.f13872b.n().e();
                                if (aVarE == null) {
                                    throw illegalStateException;
                                }
                                w.e().b(str2, "Routing exception to the specified exception handler", illegalStateException);
                                aVarE.accept(illegalStateException);
                                break;
                            }
                            w.e().b(f13869e, "Retrying after " + (((long) i15) * 300), e15);
                            i(((long) this.f13874d) * 300);
                        }
                        w.e().b(f13869e, "Retrying after " + (((long) i15) * 300), e15);
                        i(((long) this.f13874d) * 300);
                    } catch (SQLiteException e16) {
                        w.e().c(f13869e, "Unexpected SQLite exception during migrations");
                        IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e16);
                        i6.a<Throwable> aVarE2 = this.f13872b.n().e();
                        if (aVarE2 == null) {
                            throw illegalStateException2;
                        }
                        aVarE2.accept(illegalStateException2);
                    }
                }
            }
            this.f13872b.w();
        } catch (Throwable th4) {
            this.f13872b.w();
            throw th4;
        }
    }
}
