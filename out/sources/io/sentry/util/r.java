package io.sentry.util;

import io.sentry.g1;

/* JADX INFO: loaded from: classes4.dex */
public final class r<T> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a<T> f95821b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile T f95820a = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final io.sentry.util.a f95822c = new io.sentry.util.a();

    public interface a<T> {
        T a();
    }

    public r(a<T> aVar) {
        this.f95821b = aVar;
    }

    public T a() {
        if (this.f95820a == null) {
            g1 g1VarA = this.f95822c.a();
            try {
                if (this.f95820a == null) {
                    this.f95820a = this.f95821b.a();
                }
                if (g1VarA != null) {
                    g1VarA.close();
                }
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
        return this.f95820a;
    }

    public void b() {
        g1 g1VarA = this.f95822c.a();
        try {
            this.f95820a = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
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

    public void c(T t15) {
        g1 g1VarA = this.f95822c.a();
        try {
            this.f95820a = t15;
            if (g1VarA != null) {
                g1VarA.close();
            }
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
}
