package io.sentry.android.core;

import androidx.p016lifecycle.DefaultLifecycleObserver;
import androidx.p016lifecycle.ProcessLifecycleOwner;
import io.sentry.b7;
import io.sentry.p2;
import io.sentry.q7;
import java.io.Closeable;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class s0 implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static s0 f94133e = new s0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile b f94135b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final io.sentry.util.a f94134a = new io.sentry.util.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private p1 f94136c = new p1();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private volatile Boolean f94137d = null;

    public interface a {
        void b();

        void h();
    }

    public final class b implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final List<a> f94138a = new a();

        class a extends CopyOnWriteArrayList<a> {
            a() {
            }

            @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
            /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
            public boolean add(a aVar) {
                boolean zAdd = super.add(aVar);
                if (Boolean.FALSE.equals(s0.this.f94137d)) {
                    aVar.b();
                    return zAdd;
                }
                if (Boolean.TRUE.equals(s0.this.f94137d)) {
                    aVar.h();
                }
                return zAdd;
            }
        }

        public b() {
        }

        @Override // androidx.p016lifecycle.DefaultLifecycleObserver
        public void onStart(androidx.p016lifecycle.q qVar) {
            s0.this.J(false);
            Iterator<a> it = this.f94138a.iterator();
            while (it.hasNext()) {
                it.next().b();
            }
        }

        @Override // androidx.p016lifecycle.DefaultLifecycleObserver
        public void onStop(androidx.p016lifecycle.q qVar) {
            s0.this.J(true);
            Iterator<a> it = this.f94138a.iterator();
            while (it.hasNext()) {
                it.next().h();
            }
        }
    }

    private s0() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I(b bVar) {
        if (bVar != null) {
            ProcessLifecycleOwner.n().getLifecycle().d(bVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void r(io.sentry.v0 v0Var) {
        b bVar = this.f94135b;
        if (bVar != null) {
            try {
                ProcessLifecycleOwner.n().getLifecycle().a(bVar);
            } catch (Throwable th4) {
                this.f94135b = null;
                v0Var.b(b7.ERROR, "AppState failed to get Lifecycle and could not install lifecycle observer.", th4);
            }
        }
    }

    private void u(final io.sentry.v0 v0Var) {
        if (this.f94135b != null) {
            return;
        }
        try {
            ProcessLifecycleOwner.Companion companion = ProcessLifecycleOwner.INSTANCE;
            this.f94135b = new b();
            if (io.sentry.android.core.internal.util.h.e().a()) {
                r(v0Var);
            } else {
                this.f94136c.b(new Runnable() { // from class: io.sentry.android.core.q0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94125a.r(v0Var);
                    }
                });
            }
        } catch (ClassNotFoundException unused) {
            v0Var.c(b7.WARNING, "androidx.lifecycle is not available, some features might not be properly working,e.g. Session Tracking, Network and System Events breadcrumbs, etc.", new Object[0]);
        } catch (Throwable th4) {
            v0Var.b(b7.ERROR, "AppState could not register lifecycle observer", th4);
        }
    }

    public static s0 y() {
        return f94133e;
    }

    public Boolean C() {
        return this.f94137d;
    }

    public void E(q7 q7Var) {
        if (this.f94135b != null) {
            return;
        }
        io.sentry.g1 g1VarA = this.f94134a.a();
        try {
            u(q7Var != null ? q7Var.getLogger() : p2.e());
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

    public void H(a aVar) {
        io.sentry.g1 g1VarA = this.f94134a.a();
        try {
            if (this.f94135b != null) {
                this.f94135b.f94138a.remove(aVar);
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

    void J(boolean z15) {
        this.f94137d = Boolean.valueOf(z15);
    }

    public void K() {
        if (this.f94135b == null) {
            return;
        }
        io.sentry.g1 g1VarA = this.f94134a.a();
        try {
            final b bVar = this.f94135b;
            this.f94135b.f94138a.clear();
            this.f94135b = null;
            if (g1VarA != null) {
                g1VarA.close();
            }
            if (io.sentry.android.core.internal.util.h.e().a()) {
                I(bVar);
            } else {
                this.f94136c.b(new Runnable() { // from class: io.sentry.android.core.r0
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f94130a.I(bVar);
                    }
                });
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        K();
    }

    public void p(a aVar) {
        io.sentry.g1 g1VarA = this.f94134a.a();
        try {
            u(p2.e());
            if (this.f94135b != null) {
                this.f94135b.f94138a.add(aVar);
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
}
