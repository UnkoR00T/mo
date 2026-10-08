package io.sentry;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class p3 extends v implements t0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final Charset f95291i = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final c1 f95292e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final s0 f95293f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final h1 f95294g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final v0 f95295h;

    public p3(c1 c1Var, s0 s0Var, h1 h1Var, v0 v0Var, long j15, int i15) {
        super(c1Var, v0Var, j15, i15);
        this.f95292e = (c1) io.sentry.util.v.c(c1Var, "Scopes are required.");
        this.f95293f = (s0) io.sentry.util.v.c(s0Var, "Envelope reader is required.");
        this.f95294g = (h1) io.sentry.util.v.c(h1Var, "Serializer is required.");
        this.f95295h = (v0) io.sentry.util.v.c(v0Var, "Logger is required.");
    }

    public static /* synthetic */ void f(p3 p3Var, File file, io.sentry.hints.k kVar) {
        p3Var.getClass();
        if (kVar.a()) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            p3Var.f95295h.c(b7.ERROR, "Failed to delete: %s", file.getAbsolutePath());
        } catch (RuntimeException e15) {
            p3Var.f95295h.a(b7.ERROR, e15, "Failed to delete: %s", file.getAbsolutePath());
        }
    }

    private b9 h(z8 z8Var) {
        String strB;
        if (z8Var != null && (strB = z8Var.b()) != null) {
            try {
                Double dValueOf = Double.valueOf(Double.parseDouble(strB));
                if (io.sentry.util.a0.h(dValueOf, false)) {
                    String strA = z8Var.a();
                    if (strA != null) {
                        Double dValueOf2 = Double.valueOf(Double.parseDouble(strA));
                        if (io.sentry.util.a0.h(dValueOf2, false)) {
                            return new b9(Boolean.TRUE, dValueOf, dValueOf2);
                        }
                    }
                    return io.sentry.util.a0.a(new b9(Boolean.TRUE, dValueOf));
                }
                this.f95295h.c(b7.ERROR, "Invalid sample rate parsed from TraceContext: %s", strB);
            } catch (Exception unused) {
                this.f95295h.c(b7.ERROR, "Unable to parse sample rate from TraceContext: %s", strB);
            }
        }
        return new b9(Boolean.TRUE);
    }

    private void i(p6 p6Var, int i15) {
        this.f95295h.c(b7.ERROR, "Item %d of type %s returned null by the parser.", Integer.valueOf(i15), p6Var.J().b());
    }

    private void j(int i15) {
        this.f95295h.c(b7.DEBUG, "Item %d is being captured.", Integer.valueOf(i15));
    }

    private void k(io.sentry.protocol.v vVar) {
        this.f95295h.c(b7.WARNING, "Timed out waiting for event id submission: %s", vVar);
    }

    private void l(p5 p5Var, io.sentry.protocol.v vVar, int i15) {
        this.f95295h.c(b7.ERROR, "Item %d of has a different event id (%s) to the envelope header (%s)", Integer.valueOf(i15), p5Var.b().a(), vVar);
    }

    private void m(p5 p5Var, j0 j0Var) {
        Object objG;
        this.f95295h.c(b7.DEBUG, "Processing Envelope with %d item(s)", Integer.valueOf(io.sentry.util.c.f(p5Var.c())));
        int i15 = 0;
        for (p6 p6Var : p5Var.c()) {
            i15++;
            if (p6Var.J() == null) {
                this.f95295h.c(b7.ERROR, "Item %d has no header", Integer.valueOf(i15));
            } else if (a7.Event.equals(p6Var.J().b())) {
                try {
                    BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p6Var.I()), f95291i));
                    try {
                        r6 r6Var = (r6) this.f95294g.c(bufferedReader, r6.class);
                        if (r6Var == null) {
                            i(p6Var, i15);
                        } else {
                            if (r6Var.L() != null) {
                                io.sentry.util.m.o(j0Var, r6Var.L().e());
                            }
                            if (p5Var.b().a() == null || p5Var.b().a().equals(r6Var.G())) {
                                this.f95292e.R(r6Var, j0Var);
                                j(i15);
                                if (!n(j0Var)) {
                                    k(r6Var.G());
                                    bufferedReader.close();
                                    return;
                                }
                            } else {
                                l(p5Var, r6Var.G(), i15);
                                bufferedReader.close();
                            }
                        }
                        bufferedReader.close();
                        objG = io.sentry.util.m.g(j0Var);
                        if (!(objG instanceof io.sentry.hints.p) && !((io.sentry.hints.p) objG).e()) {
                            this.f95295h.c(b7.WARNING, "Envelope had a failed capture at item %d. No more items will be sent.", Integer.valueOf(i15));
                            return;
                        }
                        io.sentry.util.m.k(j0Var, io.sentry.hints.j.class, new io.sentry.util.m.a() { // from class: io.sentry.o3
                            @Override // io.sentry.util.m.a
                            public final void accept(Object obj) {
                                ((io.sentry.hints.j) obj).reset();
                            }
                        });
                    } catch (Throwable th4) {
                        try {
                            bufferedReader.close();
                        } catch (Throwable th5) {
                            th4.addSuppressed(th5);
                        }
                        throw th4;
                    }
                } catch (Throwable th6) {
                    this.f95295h.b(b7.ERROR, "Item failed to process.", th6);
                }
            } else {
                if (a7.Transaction.equals(p6Var.J().b())) {
                    try {
                        BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(p6Var.I()), f95291i));
                        try {
                            io.sentry.protocol.c0 c0Var = (io.sentry.protocol.c0) this.f95294g.c(bufferedReader2, io.sentry.protocol.c0.class);
                            if (c0Var == null) {
                                i(p6Var, i15);
                            } else if (p5Var.b().a() == null || p5Var.b().a().equals(c0Var.G())) {
                                z8 z8VarC = p5Var.b().c();
                                if (c0Var.C().i() != null) {
                                    c0Var.C().i().s(h(z8VarC));
                                }
                                this.f95292e.I(c0Var, z8VarC, j0Var);
                                j(i15);
                                if (!n(j0Var)) {
                                    k(c0Var.G());
                                    bufferedReader2.close();
                                    return;
                                }
                            } else {
                                l(p5Var, c0Var.G(), i15);
                                bufferedReader2.close();
                            }
                            bufferedReader2.close();
                        } catch (Throwable th7) {
                            try {
                                bufferedReader2.close();
                            } catch (Throwable th8) {
                                th7.addSuppressed(th8);
                            }
                            throw th7;
                        }
                    } catch (Throwable th9) {
                        this.f95295h.b(b7.ERROR, "Item failed to process.", th9);
                    }
                } else {
                    this.f95292e.H(new p5(p5Var.b().a(), p5Var.b().b(), p6Var), j0Var);
                    this.f95295h.c(b7.DEBUG, "%s item %d is being captured.", p6Var.J().b().getItemType(), Integer.valueOf(i15));
                    if (!n(j0Var)) {
                        this.f95295h.c(b7.WARNING, "Timed out waiting for item type submission: %s", p6Var.J().b().getItemType());
                        return;
                    }
                }
                objG = io.sentry.util.m.g(j0Var);
                if (!(objG instanceof io.sentry.hints.p)) {
                }
                io.sentry.util.m.k(j0Var, io.sentry.hints.j.class, new io.sentry.util.m.a() { // from class: io.sentry.o3
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        ((io.sentry.hints.j) obj).reset();
                    }
                });
            }
        }
    }

    private boolean n(j0 j0Var) {
        Object objG = io.sentry.util.m.g(j0Var);
        if (objG instanceof io.sentry.hints.i) {
            return ((io.sentry.hints.i) objG).g();
        }
        io.sentry.util.t.a(io.sentry.hints.i.class, objG, this.f95295h);
        return true;
    }

    @Override // io.sentry.t0
    public void a(String str, j0 j0Var) {
        io.sentry.util.v.c(str, "Path is required.");
        e(new File(str), j0Var);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // io.sentry.v
    public boolean c(String str) {
        return (str == null || str.startsWith("session") || str.startsWith("previous_session") || str.startsWith("startup_crash")) ? false : true;
    }

    @Override // io.sentry.v
    public /* bridge */ /* synthetic */ void d(File file) {
        super.d(file);
    }

    @Override // io.sentry.v
    protected void e(final File file, j0 j0Var) {
        io.sentry.util.v.c(file, "File is required.");
        try {
            if (!c(file.getName())) {
                this.f95295h.c(b7.DEBUG, "File '%s' should be ignored.", file.getAbsolutePath());
                return;
            }
            try {
                BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
                try {
                    p5 p5VarA = this.f95293f.a(bufferedInputStream);
                    if (p5VarA == null) {
                        this.f95295h.c(b7.ERROR, "Stream from path %s resulted in a null envelope.", file.getAbsolutePath());
                    } else {
                        m(p5VarA, j0Var);
                        this.f95295h.c(b7.DEBUG, "File '%s' is done.", file.getAbsolutePath());
                    }
                    bufferedInputStream.close();
                    io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, this.f95295h, new io.sentry.util.m.a() { // from class: io.sentry.n3
                        @Override // io.sentry.util.m.a
                        public final void accept(Object obj) {
                            p3.f(this.f95213a, file, (io.sentry.hints.k) obj);
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
            } catch (IOException e15) {
                this.f95295h.b(b7.ERROR, "Error processing envelope.", e15);
                io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, this.f95295h, new io.sentry.util.m.a() { // from class: io.sentry.n3
                    @Override // io.sentry.util.m.a
                    public final void accept(Object obj) {
                        p3.f(this.f95213a, file, (io.sentry.hints.k) obj);
                    }
                });
            }
        } catch (Throwable th6) {
            io.sentry.util.m.m(j0Var, io.sentry.hints.k.class, this.f95295h, new io.sentry.util.m.a() { // from class: io.sentry.n3
                @Override // io.sentry.util.m.a
                public final void accept(Object obj) {
                    p3.f(this.f95213a, file, (io.sentry.hints.k) obj);
                }
            });
            throw th6;
        }
    }
}
