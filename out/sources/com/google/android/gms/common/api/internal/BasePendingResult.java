package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import hg.h;
import hg.j;
import hg.l;
import hg.m;
import io.sentry.android.core.c2;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;
import jg.s;
import vg.f;

/* JADX INFO: loaded from: classes3.dex */
@KeepName
public abstract class BasePendingResult<R extends l> extends h<R> {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    static final ThreadLocal f29018o = new c();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f29019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected final a f29020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final WeakReference f29021c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CountDownLatch f29022d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final ArrayList f29023e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private m f29024f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final AtomicReference f29025g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private l f29026h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Status f29027i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f29028j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f29029k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f29030l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private jg.m f29031m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f29032n;

    @KeepName
    private d resultGuardian;

    public static class a<R extends l> extends f {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(m mVar, l lVar) {
            ThreadLocal threadLocal = BasePendingResult.f29018o;
            sendMessage(obtainMessage(1, new Pair((m) s.l(mVar), lVar)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i15 = message.what;
            if (i15 != 1) {
                if (i15 == 2) {
                    ((BasePendingResult) message.obj).c(Status.f29010j);
                    return;
                }
                StringBuilder sb5 = new StringBuilder(String.valueOf(i15).length() + 34);
                sb5.append("Don't know how to handle message: ");
                sb5.append(i15);
                c2.k("BasePendingResult", sb5.toString(), new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            m mVar = (m) pair.first;
            l lVar = (l) pair.second;
            try {
                mVar.a(lVar);
            } catch (RuntimeException e15) {
                BasePendingResult.i(lVar);
                throw e15;
            }
        }
    }

    @Deprecated
    BasePendingResult() {
        this.f29019a = new Object();
        this.f29022d = new CountDownLatch(1);
        this.f29023e = new ArrayList();
        this.f29025g = new AtomicReference();
        this.f29032n = false;
        this.f29020b = new a(Looper.getMainLooper());
        this.f29021c = new WeakReference(null);
    }

    private final l f() {
        l lVar;
        synchronized (this.f29019a) {
            s.p(!this.f29028j, "Result has already been consumed.");
            s.p(d(), "Result is not ready.");
            lVar = this.f29026h;
            this.f29026h = null;
            this.f29024f = null;
            this.f29028j = true;
        }
        if (((b) this.f29025g.getAndSet(null)) == null) {
            return (l) s.l(lVar);
        }
        throw null;
    }

    private final void g(l lVar) {
        this.f29026h = lVar;
        this.f29027i = lVar.b();
        this.f29031m = null;
        this.f29022d.countDown();
        if (this.f29029k) {
            this.f29024f = null;
        } else {
            m mVar = this.f29024f;
            if (mVar != null) {
                a aVar = this.f29020b;
                aVar.removeMessages(2);
                aVar.a(mVar, f());
            } else if (this.f29026h instanceof j) {
                this.resultGuardian = new d(this, null);
            }
        }
        ArrayList arrayList = this.f29023e;
        int size = arrayList.size();
        for (int i15 = 0; i15 < size; i15++) {
            ((h.a) arrayList.get(i15)).a(this.f29027i);
        }
        arrayList.clear();
    }

    public static void i(l lVar) {
        if (lVar instanceof j) {
            try {
                ((j) lVar).b();
            } catch (RuntimeException e15) {
                c2.h("BasePendingResult", "Unable to release ".concat(String.valueOf(lVar)), e15);
            }
        }
    }

    @Override // hg.h
    public final void a(h.a aVar) {
        s.b(aVar != null, "Callback cannot be null.");
        synchronized (this.f29019a) {
            try {
                if (d()) {
                    aVar.a(this.f29027i);
                } else {
                    this.f29023e.add(aVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    protected abstract R b(Status status);

    @Deprecated
    public final void c(Status status) {
        synchronized (this.f29019a) {
            try {
                if (!d()) {
                    e(b(status));
                    this.f29030l = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final boolean d() {
        return this.f29022d.getCount() == 0;
    }

    public final void e(R r15) {
        synchronized (this.f29019a) {
            try {
                if (this.f29030l || this.f29029k) {
                    i(r15);
                    return;
                }
                d();
                s.p(!d(), "Results have already been set");
                s.p(!this.f29028j, "Result has already been consumed");
                g(r15);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void h() {
        boolean z15 = true;
        if (!this.f29032n && !((Boolean) f29018o.get()).booleanValue()) {
            z15 = false;
        }
        this.f29032n = z15;
    }

    final /* synthetic */ l j() {
        return this.f29026h;
    }

    protected BasePendingResult(hg.f fVar) {
        this.f29019a = new Object();
        this.f29022d = new CountDownLatch(1);
        this.f29023e = new ArrayList();
        this.f29025g = new AtomicReference();
        this.f29032n = false;
        this.f29020b = new a(fVar != null ? fVar.a() : Looper.getMainLooper());
        this.f29021c = new WeakReference(fVar);
    }
}
