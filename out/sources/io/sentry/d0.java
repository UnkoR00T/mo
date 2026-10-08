package io.sentry;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public final class d0 extends v implements t0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c1 f94830e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final h1 f94831f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final v0 f94832g;

    public d0(c1 c1Var, h1 h1Var, v0 v0Var, long j15, int i15) {
        super(c1Var, v0Var, j15, i15);
        this.f94830e = (c1) io.sentry.util.v.c(c1Var, "Scopes are required.");
        this.f94831f = (h1) io.sentry.util.v.c(h1Var, "Serializer is required.");
        this.f94832g = (v0) io.sentry.util.v.c(v0Var, "Logger is required.");
    }

    public static /* synthetic */ void f(d0 d0Var, io.sentry.hints.i iVar) {
        d0Var.getClass();
        if (iVar.g()) {
            return;
        }
        d0Var.f94832g.c(b7.WARNING, "Timed out waiting for envelope submission.", new Object[0]);
    }

    public static /* synthetic */ void g(d0 d0Var, File file, io.sentry.hints.k kVar) {
        d0Var.getClass();
        if (kVar.a()) {
            d0Var.f94832g.c(b7.INFO, "File not deleted since retry was marked. %s.", file.getAbsolutePath());
        } else {
            d0Var.i(file, "after trying to capture it");
            d0Var.f94832g.c(b7.DEBUG, "Deleted file %s.", file.getAbsolutePath());
        }
    }

    public static /* synthetic */ void h(d0 d0Var, Throwable th4, File file, io.sentry.hints.k kVar) {
        d0Var.getClass();
        kVar.d(false);
        d0Var.f94832g.a(b7.INFO, th4, "File '%s' won't retry.", file.getAbsolutePath());
    }

    private void i(File file, String str) {
        try {
            if (file.delete()) {
                return;
            }
            this.f94832g.c(b7.ERROR, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        } catch (Throwable th4) {
            this.f94832g.a(b7.ERROR, th4, "Failed to delete '%s' %s", file.getAbsolutePath(), str);
        }
    }

    @Override // io.sentry.t0
    public void a(String str, j0 j0Var) {
        io.sentry.util.v.c(str, "Path is required.");
        e(new File(str), j0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.v
    public boolean c(String str) {
        return str.endsWith(".envelope");
    }

    @Override // io.sentry.v
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.v
    protected void e(final File file, j0 j0Var) {
        v0 v0Var;
        io.sentry.util.m.a aVar;
        if (!file.isFile()) {
            this.f94832g.c(b7.DEBUG, "'%s' is not a file.", file.getAbsolutePath());
            return;
        }
        if (!c(file.getName())) {
            this.f94832g.c(b7.DEBUG, "File '%s' doesn't match extension expected.", file.getAbsolutePath());
            return;
        }
        try {
            if (!file.getParentFile().canWrite()) {
                this.f94832g.c(b7.WARNING, "File '%s' cannot be deleted so it will not be processed.", file.getAbsolutePath());
                return;
            }
            try {
                try {
                    BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                    try {
                        p5 p5VarD = this.f94831f.d(bufferedInputStream);
                        if (p5VarD == null) {
                            this.f94832g.c(b7.ERROR, "Failed to deserialize cached envelope %s", file.getAbsolutePath());
                        } else {
                            this.f94830e.H(p5VarD, j0Var);
                        }
                        io.sentry.util.m.m(j0Var, io.sentry.hints.i.class, this.f94832g, new io.sentry.util.m.a() { // from class: io.sentry.a0
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                d0.f(this.f93619a, (io.sentry.hints.i) obj);
                            }
                        });
                        bufferedInputStream.close();
                        io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, this.f94832g, new io.sentry.util.m.a() { // from class: io.sentry.b0
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                d0.g(this.f94670a, file, (io.sentry.hints.k) obj);
                            }
                        });
                    } catch (Throwable th4) {
                        try {
                            bufferedInputStream.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (FileNotFoundException e15) {
                    this.f94832g.a(b7.ERROR, e15, "File '%s' cannot be found.", file.getAbsolutePath());
                    v0Var = this.f94832g;
                    aVar = new io.sentry.util.m.a() { // from class: io.sentry.b0
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            d0.g(this.f94670a, file, (io.sentry.hints.k) obj);
                        }
                    };
                    io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, v0Var, aVar);
                }
            } catch (IOException e16) {
                this.f94832g.a(b7.ERROR, e16, "I/O on file '%s' failed.", file.getAbsolutePath());
                v0Var = this.f94832g;
                aVar = new io.sentry.util.m.a() { // from class: io.sentry.b0
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        d0.g(this.f94670a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, v0Var, aVar);
            } catch (Throwable th6) {
                this.f94832g.a(b7.ERROR, th6, "Failed to capture cached envelope %s", file.getAbsolutePath());
                io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, this.f94832g, new io.sentry.util.m.a() { // from class: io.sentry.c0
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        d0.h(this.f94694a, th6, file, (io.sentry.hints.k) obj);
                    }
                });
                v0Var = this.f94832g;
                aVar = new io.sentry.util.m.a() { // from class: io.sentry.b0
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        d0.g(this.f94670a, file, (io.sentry.hints.k) obj);
                    }
                };
                io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, v0Var, aVar);
            }
        } catch (Throwable th7) {
            io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, this.f94832g, new io.sentry.util.m.a() { // from class: io.sentry.b0
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    d0.g(this.f94670a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th7;
        }
    }
}
