package io.sentry.cache;

import io.sentry.UncaughtExceptionHandlerIntegration;
import io.sentry.a7;
import io.sentry.b7;
import io.sentry.g1;
import io.sentry.g8;
import io.sentry.i8;
import io.sentry.j0;
import io.sentry.m5;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.transport.s;
import io.sentry.util.v;
import io.sentry.v0;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes4.dex */
public class f extends c implements g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final CountDownLatch f94723f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Map<p5, String> f94724g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final io.sentry.util.a f94725h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    protected final io.sentry.util.a f94726j;

    public f(q7 q7Var, String str, int i15) {
        super(q7Var, str, i15);
        this.f94724g = new WeakHashMap();
        this.f94725h = new io.sentry.util.a();
        this.f94726j = new io.sentry.util.a();
        this.f94723f = new CountDownLatch(1);
    }

    public static File A(String str) {
        return new File(str, "session.json");
    }

    private File B(p5 p5Var) {
        String str;
        g1 g1VarA = this.f94725h.a();
        try {
            if (this.f94724g.containsKey(p5Var)) {
                str = this.f94724g.get(p5Var);
            } else {
                String str2 = g8.a() + ".envelope";
                this.f94724g.put(p5Var, str2);
                str = str2;
            }
            File file = new File(this.f94720c.getAbsolutePath(), str);
            if (g1VarA != null) {
                g1VarA.close();
            }
            return file;
        } catch (Throwable th4) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
            }
            throw th4;
        }
    }

    public static File C(String str) {
        return new File(str, "previous_session.json");
    }

    private boolean F(p5 p5Var, j0 j0Var) {
        v.c(p5Var, "Envelope is required.");
        s(w());
        File fileA = A(this.f94720c.getAbsolutePath());
        File fileC = C(this.f94720c.getAbsolutePath());
        if (io.sentry.util.m.h(j0Var, io.sentry.hints.l.class) && !fileA.delete()) {
            this.f94718a.getLogger().c(b7.WARNING, "Current envelope doesn't exist.", new Object[0]);
        }
        if (io.sentry.util.m.h(j0Var, io.sentry.hints.a.class)) {
            G(j0Var);
        }
        if (io.sentry.util.m.h(j0Var, io.sentry.hints.n.class)) {
            E(fileA, fileC);
            L(fileA, p5Var);
            boolean zExists = new File(this.f94718a.getCacheDirPath(), ".sentry-native/last_crash").exists();
            if (!zExists) {
                File file = new File(this.f94718a.getCacheDirPath(), "last_crash");
                if (file.exists()) {
                    this.f94718a.getLogger().c(b7.INFO, "Crash marker file exists, crashedLastRun will return true.", new Object[0]);
                    if (!file.delete()) {
                        this.f94718a.getLogger().c(b7.ERROR, "Failed to delete the crash marker file. %s.", file.getAbsolutePath());
                    }
                    zExists = true;
                }
            }
            m5.a().b(zExists);
            z();
        }
        File fileB = B(p5Var);
        if (fileB.exists()) {
            this.f94718a.getLogger().c(b7.WARNING, "Not adding Envelope to offline storage because it already exists: %s", fileB.getAbsolutePath());
            return true;
        }
        this.f94718a.getLogger().c(b7.DEBUG, "Adding Envelope to offline storage: %s", fileB.getAbsolutePath());
        boolean zQ = Q(fileB, p5Var);
        if (io.sentry.util.m.h(j0Var, UncaughtExceptionHandlerIntegration.a.class)) {
            P();
        }
        return zQ;
    }

    private void G(j0 j0Var) {
        Date dateE;
        Object objG = io.sentry.util.m.g(j0Var);
        if (objG instanceof io.sentry.hints.a) {
            File fileC = C(this.f94720c.getAbsolutePath());
            if (!fileC.exists()) {
                this.f94718a.getLogger().c(b7.DEBUG, "No previous session file to end.", new Object[0]);
                return;
            }
            v0 logger = this.f94718a.getLogger();
            b7 b7Var = b7.WARNING;
            logger.c(b7Var, "Previous session is not ended, we'd need to end it.", new Object[0]);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(fileC), c.f94717e));
                try {
                    i8 i8Var = (i8) this.f94719b.a().c(bufferedReader, i8.class);
                    if (i8Var != null) {
                        io.sentry.hints.a aVar = (io.sentry.hints.a) objG;
                        Long lE = aVar.e();
                        if (lE != null) {
                            dateE = io.sentry.m.e(lE.longValue());
                            Date dateK = i8Var.k();
                            if (dateK == null || dateE.before(dateK)) {
                                this.f94718a.getLogger().c(b7Var, "Abnormal exit happened before previous session start, not ending the session.", new Object[0]);
                            }
                        } else {
                            dateE = null;
                        }
                        i8Var.q(i8.b.Abnormal, null, true, aVar.h());
                        i8Var.d(dateE);
                        R(fileC, i8Var);
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
                this.f94718a.getLogger().b(b7.ERROR, "Error processing previous session.", th6);
            }
        }
    }

    private void L(File file, p5 p5Var) {
        Iterable<p6> iterableC = p5Var.c();
        if (!iterableC.iterator().hasNext()) {
            this.f94718a.getLogger().c(b7.INFO, "Current envelope %s is empty", file.getAbsolutePath());
            return;
        }
        p6 next = iterableC.iterator().next();
        if (!a7.Session.equals(next.J().b())) {
            this.f94718a.getLogger().c(b7.INFO, "Current envelope has a different envelope type %s", next.J().b());
            return;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(next.I()), c.f94717e));
            try {
                i8 i8Var = (i8) this.f94719b.a().c(bufferedReader, i8.class);
                if (i8Var == null) {
                    this.f94718a.getLogger().c(b7.ERROR, "Item of type %s returned null by the parser.", next.J().b());
                } else {
                    R(file, i8Var);
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
            this.f94718a.getLogger().b(b7.ERROR, "Item failed to process.", th6);
        }
    }

    private void P() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(this.f94718a.getCacheDirPath(), "last_crash"));
            try {
                fileOutputStream.write(io.sentry.m.h(io.sentry.m.d()).getBytes(c.f94717e));
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
            this.f94718a.getLogger().b(b7.ERROR, "Error writing the crash marker file to the disk", th6);
        }
    }

    private boolean Q(File file, p5 p5Var) {
        if (file.exists()) {
            this.f94718a.getLogger().c(b7.DEBUG, "Overwriting envelope to offline storage: %s", file.getAbsolutePath());
            if (!file.delete()) {
                this.f94718a.getLogger().c(b7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
            }
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f94719b.a().b(p5Var, fileOutputStream);
                fileOutputStream.close();
                return true;
            } catch (Throwable th4) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            this.f94718a.getLogger().a(b7.ERROR, th6, "Error writing Envelope %s to offline storage", file.getAbsolutePath());
            return false;
        }
    }

    private void R(File file, i8 i8Var) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(fileOutputStream, c.f94717e));
                try {
                    this.f94718a.getLogger().c(b7.DEBUG, "Overwriting session to offline storage: %s", i8Var.j());
                    this.f94719b.a().a(i8Var, bufferedWriter);
                    bufferedWriter.close();
                    fileOutputStream.close();
                } catch (Throwable th4) {
                    try {
                        bufferedWriter.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        } catch (Throwable th8) {
            this.f94718a.getLogger().a(b7.ERROR, th8, "Error writing Session to offline storage: %s", i8Var.j());
        }
    }

    private File[] w() {
        File[] fileArrListFiles;
        return (!i() || (fileArrListFiles = this.f94720c.listFiles(new FilenameFilter() { // from class: io.sentry.cache.e
            @Override // java.io.FilenameFilter
            public final boolean accept(File file, String str) {
                return str.endsWith(".envelope");
            }
        })) == null) ? new File[0] : fileArrListFiles;
    }

    public static g x(q7 q7Var) {
        String cacheDirPath = q7Var.getCacheDirPath();
        int maxCacheItems = q7Var.getMaxCacheItems();
        if (cacheDirPath != null) {
            return new f(q7Var, cacheDirPath, maxCacheItems);
        }
        q7Var.getLogger().c(b7.WARNING, "cacheDirPath is null, returning NoOpEnvelopeCache", new Object[0]);
        return s.e();
    }

    public void E(File file, File file2) {
        g1 g1VarA = this.f94726j.a();
        try {
            if (file2.exists()) {
                this.f94718a.getLogger().c(b7.DEBUG, "Previous session file already exists, deleting it.", new Object[0]);
                if (!file2.delete()) {
                    this.f94718a.getLogger().c(b7.WARNING, "Unable to delete previous session file: %s", file2);
                }
            }
            if (file.exists()) {
                this.f94718a.getLogger().c(b7.INFO, "Moving current session to previous session.", new Object[0]);
                try {
                    if (!file.renameTo(file2)) {
                        this.f94718a.getLogger().c(b7.WARNING, "Unable to move current session to previous session.", new Object[0]);
                    }
                } catch (Throwable th4) {
                    this.f94718a.getLogger().b(b7.ERROR, "Error moving current session to previous session.", th4);
                }
            }
            if (g1VarA != null) {
                g1VarA.close();
            }
        } catch (Throwable th5) {
            if (g1VarA != null) {
                try {
                    g1VarA.close();
                } catch (Throwable th6) {
                    th5.addSuppressed(th6);
                }
            }
            throw th5;
        }
    }

    public boolean M() {
        try {
            return this.f94723f.await(this.f94718a.getSessionFlushTimeoutMillis(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            this.f94718a.getLogger().c(b7.DEBUG, "Timed out waiting for previous session to flush.", new Object[0]);
            return false;
        }
    }

    public void Q2(p5 p5Var, j0 j0Var) {
        F(p5Var, j0Var);
    }

    public boolean e3(p5 p5Var, j0 j0Var) {
        return F(p5Var, j0Var);
    }

    @Override // java.lang.Iterable
    public Iterator<p5> iterator() {
        File[] fileArrW = w();
        ArrayList arrayList = new ArrayList(fileArrW.length);
        for (File file : fileArrW) {
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    arrayList.add(this.f94719b.a().d(bufferedInputStream));
                    bufferedInputStream.close();
                } catch (Throwable th4) {
                    try {
                        bufferedInputStream.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (FileNotFoundException unused) {
                this.f94718a.getLogger().c(b7.DEBUG, "Envelope file '%s' disappeared while converting all cached files to envelopes.", file.getAbsolutePath());
            } catch (IOException e15) {
                this.f94718a.getLogger().b(b7.ERROR, String.format("Error while reading cached envelope from file %s", file.getAbsolutePath()), e15);
            }
        }
        return arrayList.iterator();
    }

    @Override // io.sentry.cache.g
    public void t0(p5 p5Var) {
        v.c(p5Var, "Envelope is required.");
        File fileB = B(p5Var);
        if (!fileB.exists()) {
            this.f94718a.getLogger().c(b7.DEBUG, "Envelope was not cached: %s", fileB.getAbsolutePath());
            return;
        }
        this.f94718a.getLogger().c(b7.DEBUG, "Discarding envelope from cache: %s", fileB.getAbsolutePath());
        if (fileB.delete()) {
            return;
        }
        this.f94718a.getLogger().c(b7.ERROR, "Failed to delete envelope: %s", fileB.getAbsolutePath());
    }

    public void z() {
        this.f94723f.countDown();
    }
}
