package io.sentry;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.Date;

/* JADX INFO: loaded from: classes4.dex */
final class r3 implements Runnable {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f95585c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q7 f95586a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final c1 f95587b;

    r3(q7 q7Var, c1 c1Var) {
        this.f95586a = q7Var;
        this.f95587b = c1Var;
    }

    private Date a(File file) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file), f95585c));
            try {
                String line = bufferedReader.readLine();
                this.f95586a.getLogger().c(b7.DEBUG, "Crash marker file has %s timestamp.", line);
                Date dateF = m.f(line);
                bufferedReader.close();
                return dateF;
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            this.f95586a.getLogger().b(b7.ERROR, "Error reading the crash marker file.", e15);
            return null;
        } catch (IllegalArgumentException e16) {
            this.f95586a.getLogger().a(b7.ERROR, e16, "Error converting the crash timestamp.", new Object[0]);
            return null;
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        String cacheDirPath = this.f95586a.getCacheDirPath();
        if (cacheDirPath == null) {
            this.f95586a.getLogger().c(b7.INFO, "Cache dir is not set, not finalizing the previous session.", new Object[0]);
            return;
        }
        if (!this.f95586a.isEnableAutoSessionTracking()) {
            this.f95586a.getLogger().c(b7.DEBUG, "Session tracking is disabled, bailing from previous session finalizer.", new Object[0]);
            return;
        }
        io.sentry.cache.g envelopeDiskCache = this.f95586a.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.f) && !((io.sentry.cache.f) envelopeDiskCache).M()) {
            this.f95586a.getLogger().c(b7.WARNING, "Timed out waiting to flush previous session to its own file in session finalizer.", new Object[0]);
            return;
        }
        File fileC = io.sentry.cache.f.C(cacheDirPath);
        h1 serializer = this.f95586a.getSerializer();
        if (fileC.exists()) {
            this.f95586a.getLogger().c(b7.WARNING, "Current session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileC), f95585c));
                try {
                    i8 i8Var = (i8) serializer.c(bufferedReader, i8.class);
                    if (i8Var == null) {
                        this.f95586a.getLogger().c(b7.ERROR, "Stream from path %s resulted in a null envelope.", fileC.getAbsolutePath());
                    } else {
                        File file = new File(this.f95586a.getCacheDirPath(), ".sentry-native/last_crash");
                        Date date = null;
                        if (file.exists()) {
                            this.f95586a.getLogger().c(b7.INFO, "Crash marker file exists, last Session is gonna be Crashed.", new Object[0]);
                            Date dateA = a(file);
                            if (!file.delete()) {
                                this.f95586a.getLogger().c(b7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                            }
                            i8Var.p(i8.b.Crashed, null, true);
                            date = dateA;
                        }
                        if (i8Var.f() == null) {
                            i8Var.d(date);
                        }
                        this.f95587b.Q(p5.a(serializer, i8Var, this.f95586a.getSdkVersion()));
                    }
                    bufferedReader.close();
                } catch (Throwable th4) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                this.f95586a.getLogger().b(b7.ERROR, "Error processing previous session.", th6);
            }
            if (fileC.delete()) {
                return;
            }
            this.f95586a.getLogger().c(b7.WARNING, "Failed to delete the previous session file.", new Object[0]);
        }
    }
}
