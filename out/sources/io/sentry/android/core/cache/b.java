package io.sentry.android.core.cache;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.android.core.AnrV2Integration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.performance.i;
import io.sentry.b7;
import io.sentry.cache.f;
import io.sentry.j0;
import io.sentry.p5;
import io.sentry.q7;
import io.sentry.transport.p;
import io.sentry.util.h;
import io.sentry.util.m;
import io.sentry.util.v;
import java.io.File;
import java.io.FileOutputStream;

/* JADX INFO: loaded from: classes4.dex */
public final class b extends f {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final p f93782k;

    public b(SentryAndroidOptions sentryAndroidOptions) {
        this(sentryAndroidOptions, io.sentry.android.core.internal.util.f.b());
    }

    public static /* synthetic */ void S(b bVar, SentryAndroidOptions sentryAndroidOptions, AnrV2Integration.b bVar2) {
        bVar.getClass();
        Long lE = bVar2.e();
        sentryAndroidOptions.getLogger().c(b7.DEBUG, "Writing last reported ANR marker with timestamp %d", lE);
        bVar.W(lE);
    }

    public static boolean T(q7 q7Var) {
        String outboxPath = q7Var.getOutboxPath();
        if (outboxPath == null) {
            q7Var.getLogger().c(b7.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
            return false;
        }
        File file = new File(outboxPath, "startup_crash");
        try {
            boolean zExists = file.exists();
            if (!zExists || file.delete()) {
                return zExists;
            }
            q7Var.getLogger().c(b7.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
            return zExists;
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Error reading/deleting the startup crash marker file on the disk", th4);
            return false;
        }
    }

    public static Long U(q7 q7Var) {
        File file = new File((String) v.c(q7Var.getCacheDirPath(), "Cache dir path should be set for getting ANRs reported"), "last_anr_report");
        try {
            if (!file.exists() || !file.canRead()) {
                q7Var.getLogger().c(b7.DEBUG, "Last ANR marker does not exist. %s.", file.getAbsolutePath());
                return null;
            }
            String strC = h.c(file);
            if (strC.equals("null")) {
                return null;
            }
            return Long.valueOf(Long.parseLong(strC.trim()));
        } catch (Throwable th4) {
            q7Var.getLogger().b(b7.ERROR, "Error reading last ANR marker", th4);
        }
    }

    private boolean V(p5 p5Var, j0 j0Var) {
        boolean zE3 = super.e3(p5Var, j0Var);
        final SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.f94718a;
        i iVarQ = io.sentry.android.core.performance.h.p().q();
        if (m.h(j0Var, UncaughtExceptionHandlerIntegration.a.class) && iVarQ.t()) {
            long jA = this.f93782k.a() - iVarQ.q();
            if (jA <= sentryAndroidOptions.getStartupCrashDurationThresholdMillis()) {
                sentryAndroidOptions.getLogger().c(b7.DEBUG, "Startup Crash detected %d milliseconds after SDK init. Writing a startup crash marker file to disk.", Long.valueOf(jA));
                X();
            }
        }
        m.k(j0Var, AnrV2Integration.b.class, new m.a() { // from class: io.sentry.android.core.cache.a
            @Override // io.sentry.util.m.a
            public final void accept(Object obj) {
                b.S(this.f93780a, sentryAndroidOptions, (AnrV2Integration.b) obj);
            }
        });
        return zE3;
    }

    private void W(Long l15) {
        String cacheDirPath = this.f94718a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f94718a.getLogger().c(b7.DEBUG, "Cache dir path is null, the ANR marker will not be written", new Object[0]);
            return;
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(cacheDirPath, "last_anr_report"));
            try {
                fileOutputStream.write(String.valueOf(l15).getBytes(f94717e));
                fileOutputStream.flush();
                fileOutputStream.close();
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            this.f94718a.getLogger().b(b7.ERROR, "Error writing the ANR marker to the disk", th6);
        }
    }

    private void X() {
        String outboxPath = this.f94718a.getOutboxPath();
        if (outboxPath == null) {
            this.f94718a.getLogger().c(b7.DEBUG, "Outbox path is null, the startup crash marker file will not be written", new Object[0]);
            return;
        }
        try {
            new File(outboxPath, "startup_crash").createNewFile();
        } catch (Throwable th4) {
            this.f94718a.getLogger().b(b7.ERROR, "Error writing the startup crash marker file to the disk", th4);
        }
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public void Q2(p5 p5Var, j0 j0Var) {
        V(p5Var, j0Var);
    }

    @Override // io.sentry.cache.f, io.sentry.cache.g
    public boolean e3(p5 p5Var, j0 j0Var) {
        return V(p5Var, j0Var);
    }

    b(SentryAndroidOptions sentryAndroidOptions, p pVar) {
        super(sentryAndroidOptions, (String) v.c(sentryAndroidOptions.getCacheDirPath(), "cacheDirPath must not be null"), sentryAndroidOptions.getMaxCacheItems());
        this.f93782k = pVar;
    }
}
