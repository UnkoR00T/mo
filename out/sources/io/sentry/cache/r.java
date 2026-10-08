package io.sentry.cache;

import io.sentry.a1;
import io.sentry.b7;
import io.sentry.i4;
import io.sentry.n8;
import io.sentry.protocol.v;
import io.sentry.q7;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public final class r extends i4 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Charset f94745c = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private q7 f94746a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final io.sentry.util.r<io.sentry.cache.tape.c<io.sentry.f>> f94747b = new io.sentry.util.r<>(new io.sentry.util.r.a() { // from class: io.sentry.cache.i
        @Override // io.sentry.util.r.a
        public final Object a() {
            return r.m(this.f94728a);
        }
    });

    class a implements io.sentry.cache.tape.c.a<io.sentry.f> {
        a() {
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public io.sentry.f b(byte[] bArr) {
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(bArr), r.f94745c));
                try {
                    io.sentry.f fVar = (io.sentry.f) r.this.f94746a.getSerializer().c(bufferedReader, io.sentry.f.class);
                    bufferedReader.close();
                    return fVar;
                } catch (Throwable th4) {
                    try {
                        bufferedReader.close();
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                    }
                    throw th4;
                }
            } catch (Throwable th6) {
                r.this.f94746a.getLogger().a(b7.ERROR, th6, "Error reading entity from scope cache", new Object[0]);
                return null;
            }
        }

        @Override // io.sentry.cache.tape.c.a
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public void a(io.sentry.f fVar, OutputStream outputStream) throws IOException {
            BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, r.f94745c));
            try {
                r.this.f94746a.getSerializer().a(fVar, bufferedWriter);
                bufferedWriter.close();
            } catch (Throwable th4) {
                try {
                    bufferedWriter.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
    }

    public r(q7 q7Var) {
        this.f94746a = q7Var;
    }

    public static /* synthetic */ void i(r rVar, n8 n8Var, a1 a1Var) {
        if (n8Var != null) {
            rVar.z(n8Var, "trace.json");
        } else {
            rVar.getClass();
            rVar.z(a1Var.N().g(), "trace.json");
        }
    }

    public static /* synthetic */ void k(r rVar) {
        rVar.getClass();
        try {
            rVar.f94747b.a().clear();
        } catch (IOException e15) {
            rVar.f94746a.getLogger().b(b7.ERROR, "Failed to clear breadcrumbs from file queue", e15);
        }
    }

    public static /* synthetic */ void l(r rVar, String str) {
        if (str == null) {
            rVar.t("transaction.json");
        } else {
            rVar.z(str, "transaction.json");
        }
    }

    public static /* synthetic */ io.sentry.cache.tape.c m(r rVar) {
        io.sentry.cache.tape.d dVarA;
        File fileB = d.b(rVar.f94746a, ".scope-cache");
        if (fileB == null) {
            rVar.f94746a.getLogger().c(b7.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
            return io.sentry.cache.tape.c.E();
        }
        File file = new File(fileB, "breadcrumbs.json");
        try {
            try {
                dVarA = new io.sentry.cache.tape.d.a(file).b(rVar.f94746a.getMaxBreadcrumbs()).a();
            } catch (IOException e15) {
                rVar.f94746a.getLogger().b(b7.ERROR, "Failed to create breadcrumbs queue", e15);
                return io.sentry.cache.tape.c.E();
            }
        } catch (IOException unused) {
            file.delete();
            dVarA = new io.sentry.cache.tape.d.a(file).b(rVar.f94746a.getMaxBreadcrumbs()).a();
        }
        return io.sentry.cache.tape.c.C(dVarA, rVar.new a());
    }

    public static /* synthetic */ void n(r rVar, Runnable runnable) {
        rVar.getClass();
        try {
            runnable.run();
        } catch (Throwable th4) {
            rVar.f94746a.getLogger().b(b7.ERROR, "Serialization task failed", th4);
        }
    }

    public static /* synthetic */ void q(r rVar, io.sentry.f fVar) {
        rVar.getClass();
        try {
            rVar.f94747b.a().h(fVar);
        } catch (IOException e15) {
            rVar.f94746a.getLogger().b(b7.ERROR, "Failed to add breadcrumb to file queue", e15);
        }
    }

    private void t(String str) {
        d.a(this.f94746a, ".scope-cache", str);
    }

    private void x(final Runnable runnable) {
        if (this.f94746a.isEnableScopePersistence()) {
            if (Thread.currentThread().getName().contains("SentryExecutor")) {
                try {
                    runnable.run();
                    return;
                } catch (Throwable th4) {
                    this.f94746a.getLogger().b(b7.ERROR, "Serialization task failed", th4);
                    return;
                }
            }
            try {
                this.f94746a.getExecutorService().submit(new Runnable() { // from class: io.sentry.cache.p
                    @Override // java.lang.Runnable
                    public final void run() {
                        r.n(this.f94740a, runnable);
                    }
                });
            } catch (Throwable th5) {
                this.f94746a.getLogger().b(b7.ERROR, "Serialization task could not be scheduled", th5);
            }
        }
    }

    public static <T> void y(q7 q7Var, T t15, String str) {
        d.d(q7Var, t15, ".scope-cache", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public <T> void z(T t15, String str) {
        y(this.f94746a, t15, str);
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void a(final Map<String, String> map) {
        x(new Runnable() { // from class: io.sentry.cache.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f94729a.z(map, "tags.json");
            }
        });
    }

    @Override // io.sentry.b1
    public void c(final io.sentry.f fVar) {
        x(new Runnable() { // from class: io.sentry.cache.k
            @Override // java.lang.Runnable
            public final void run() {
                r.q(this.f94731a, fVar);
            }
        });
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void d(Collection<io.sentry.f> collection) {
        if (collection.isEmpty()) {
            x(new Runnable() { // from class: io.sentry.cache.m
                @Override // java.lang.Runnable
                public final void run() {
                    r.k(this.f94735a);
                }
            });
        }
    }

    @Override // io.sentry.b1
    public void e(final n8 n8Var, final a1 a1Var) {
        x(new Runnable() { // from class: io.sentry.cache.q
            @Override // java.lang.Runnable
            public final void run() {
                r.i(this.f94742a, n8Var, a1Var);
            }
        });
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void f(final io.sentry.protocol.c cVar) {
        x(new Runnable() { // from class: io.sentry.cache.l
            @Override // java.lang.Runnable
            public final void run() {
                this.f94733a.z(cVar, "contexts.json");
            }
        });
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void g(final String str) {
        x(new Runnable() { // from class: io.sentry.cache.o
            @Override // java.lang.Runnable
            public final void run() {
                r.l(this.f94738a, str);
            }
        });
    }

    public <T> T u(q7 q7Var, String str, Class<T> cls) {
        if (!str.equals("breadcrumbs.json")) {
            return (T) d.c(q7Var, ".scope-cache", str, cls, null);
        }
        try {
            return cls.cast(this.f94747b.a().u());
        } catch (IOException unused) {
            q7Var.getLogger().c(b7.ERROR, "Unable to read serialized breadcrumbs from QueueFile", new Object[0]);
            return null;
        }
    }

    public void v() {
        try {
            this.f94747b.a().clear();
        } catch (IOException e15) {
            this.f94746a.getLogger().b(b7.ERROR, "Failed to clear breadcrumbs from file queue", e15);
        }
        t("user.json");
        t("level.json");
        t("request.json");
        t("fingerprint.json");
        t("contexts.json");
        t("extras.json");
        t("tags.json");
        t("trace.json");
        t("transaction.json");
    }

    @Override // io.sentry.i4, io.sentry.b1
    public void w(final v vVar) {
        x(new Runnable() { // from class: io.sentry.cache.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f94736a.z(vVar, "replay.json");
            }
        });
    }
}
