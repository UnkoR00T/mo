package io.sentry.cache;

import io.sentry.a7;
import io.sentry.b7;
import io.sentry.h1;
import io.sentry.i8;
import io.sentry.p5;
import io.sentry.p6;
import io.sentry.q7;
import io.sentry.util.v;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public abstract class c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected static final Charset f94717e = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected q7 f94718a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final io.sentry.util.r<h1> f94719b = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.cache.a
        @Override // io.sentry.util.r.a
        public final Object a() {
            return this.f94716a.f94718a.getSerializer();
        }
    });

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final File f94720c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f94721d;

    c(q7 q7Var, String str, int i15) {
        v.c(str, "Directory is required.");
        this.f94718a = (q7) v.c(q7Var, "SentryOptions is required.");
        this.f94720c = new File(str);
        this.f94721d = i15;
    }

    private p5 g(p5 p5Var, p6 p6Var) {
        ArrayList arrayList = new ArrayList();
        Iterator<p6> it = p5Var.c().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next());
        }
        arrayList.add(p6Var);
        return new p5(p5Var.b(), arrayList);
    }

    private i8 h(p5 p5Var) {
        for (p6 p6Var : p5Var.c()) {
            if (j(p6Var)) {
                return q(p6Var);
            }
        }
        return null;
    }

    private boolean j(p6 p6Var) {
        if (p6Var == null) {
            return false;
        }
        return p6Var.J().b().equals(a7.Session);
    }

    private boolean k(p5 p5Var) {
        return p5Var.c().iterator().hasNext();
    }

    private boolean l(i8 i8Var) {
        return i8Var.l().equals(i8.b.Ok) && i8Var.j() != null;
    }

    private void n(File file, File[] fileArr) {
        Boolean boolG;
        p6 p6VarG;
        i8 i8VarQ;
        p5 p5VarO = o(file);
        if (p5VarO == null || !k(p5VarO)) {
            return;
        }
        this.f94718a.getClientReportRecorder().b(io.sentry.clientreport.f.CACHE_OVERFLOW, p5VarO);
        i8 i8VarH = h(p5VarO);
        if (i8VarH == null || !l(i8VarH) || (boolG = i8VarH.g()) == null || !boolG.booleanValue()) {
            return;
        }
        for (File file2 : fileArr) {
            p5 p5VarO2 = o(file2);
            if (p5VarO2 != null && k(p5VarO2)) {
                Iterator<p6> it = p5VarO2.c().iterator();
                while (true) {
                    p6VarG = null;
                    if (!it.hasNext()) {
                        break;
                    }
                    p6 next = it.next();
                    if (j(next) && (i8VarQ = q(next)) != null && l(i8VarQ)) {
                        Boolean boolG2 = i8VarQ.g();
                        if (boolG2 != null && boolG2.booleanValue()) {
                            this.f94718a.getLogger().c(b7.ERROR, "Session %s has 2 times the init flag.", i8VarH.j());
                            return;
                        }
                        if (i8VarH.j() != null && i8VarH.j().equals(i8VarQ.j())) {
                            i8VarQ.n();
                            try {
                                p6VarG = p6.G(this.f94719b.a(), i8VarQ);
                                it.remove();
                                break;
                            } catch (IOException e15) {
                                this.f94718a.getLogger().a(b7.ERROR, e15, "Failed to create new envelope item for the session %s", i8VarH.j());
                                break;
                            }
                        }
                    }
                }
                if (p6VarG != null) {
                    p5 p5VarG = g(p5VarO2, p6VarG);
                    long jLastModified = file2.lastModified();
                    if (!file2.delete()) {
                        this.f94718a.getLogger().c(b7.WARNING, "File can't be deleted: %s", file2.getAbsolutePath());
                    }
                    t(p5VarG, file2, jLastModified);
                    return;
                }
            }
        }
    }

    private p5 o(File file) {
        try {
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            try {
                p5 p5VarD = this.f94719b.a().d(bufferedInputStream);
                bufferedInputStream.close();
                return p5VarD;
            } catch (Throwable th4) {
                try {
                    bufferedInputStream.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (IOException e15) {
            this.f94718a.getLogger().b(b7.ERROR, "Failed to deserialize the envelope.", e15);
            return null;
        }
    }

    private i8 q(p6 p6Var) {
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p6Var.I()), f94717e));
            try {
                i8 i8Var = (i8) this.f94719b.a().c(bufferedReader, i8.class);
                bufferedReader.close();
                return i8Var;
            } catch (Throwable th4) {
                try {
                    bufferedReader.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        } catch (Throwable th6) {
            this.f94718a.getLogger().b(b7.ERROR, "Failed to deserialize the session.", th6);
            return null;
        }
    }

    private void t(p5 p5Var, File file, long j15) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                this.f94719b.a().b(p5Var, fileOutputStream);
                file.setLastModified(j15);
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
            this.f94718a.getLogger().b(b7.ERROR, "Failed to serialize the new envelope to the disk.", th6);
        }
    }

    private void u(File[] fileArr) {
        if (fileArr.length > 1) {
            Arrays.sort(fileArr, new Comparator() { // from class: io.sentry.cache.b
                @Override // java.util.Comparator
                public final int compare(Object obj, Object obj2) {
                    return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
                }
            });
        }
    }

    protected boolean i() {
        if (this.f94720c.isDirectory() && this.f94720c.canWrite() && this.f94720c.canRead()) {
            return true;
        }
        this.f94718a.getLogger().c(b7.ERROR, "The directory for caching files is inaccessible.: %s", this.f94720c.getAbsolutePath());
        return false;
    }

    protected void s(File[] fileArr) {
        int length = fileArr.length;
        if (length >= this.f94721d) {
            this.f94718a.getLogger().c(b7.WARNING, "Cache folder if full (respecting maxSize). Rotating files", new Object[0]);
            int i15 = (length - this.f94721d) + 1;
            u(fileArr);
            File[] fileArr2 = (File[]) Arrays.copyOfRange(fileArr, i15, length);
            for (int i16 = 0; i16 < i15; i16++) {
                File file = fileArr[i16];
                n(file, fileArr2);
                if (!file.delete()) {
                    this.f94718a.getLogger().c(b7.WARNING, "File can't be deleted: %s", file.getAbsolutePath());
                }
            }
        }
    }
}
