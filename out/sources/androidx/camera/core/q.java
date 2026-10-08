package androidx.camera.core;

import android.media.ImageReader;
import android.util.LongSparseArray;
import android.view.Surface;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import o.e1;
import o.w0;
import v.c0;
import v.g2;

/* JADX INFO: loaded from: classes.dex */
public class q implements g2, e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Object f9305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private v.s f9306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f9307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private g2.a f9308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f9309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final g2 f9310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    g2.a f9311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Executor f9312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final LongSparseArray<w0> f9313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final LongSparseArray<o> f9314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f9315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final List<o> f9316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final List<o> f9317m;

    class a extends v.s {
        a() {
        }

        @Override // v.s
        public void b(int i15, c0 c0Var) {
            super.b(i15, c0Var);
            q.this.r(c0Var);
        }
    }

    public q(int i15, int i16, int i17, int i18) {
        this(j(i15, i16, i17, i18));
    }

    public static /* synthetic */ void h(q qVar, g2.a aVar) {
        qVar.getClass();
        aVar.a(qVar);
    }

    public static /* synthetic */ void i(q qVar, g2 g2Var) {
        synchronized (qVar.f9305a) {
            qVar.f9307c++;
        }
        qVar.o(g2Var);
    }

    private static g2 j(int i15, int i16, int i17, int i18) {
        return new d(ImageReader.newInstance(i15, i16, i17, i18));
    }

    private void k(o oVar) {
        synchronized (this.f9305a) {
            try {
                int iIndexOf = this.f9316l.indexOf(oVar);
                if (iIndexOf >= 0) {
                    this.f9316l.remove(iIndexOf);
                    int i15 = this.f9315k;
                    if (iIndexOf <= i15) {
                        this.f9315k = i15 - 1;
                    }
                }
                this.f9317m.remove(oVar);
                if (this.f9307c > 0) {
                    o(this.f9310f);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void m(s sVar) {
        final g2.a aVar;
        Executor executor;
        synchronized (this.f9305a) {
            try {
                if (this.f9316l.size() < a()) {
                    sVar.b(this);
                    this.f9316l.add(sVar);
                    aVar = this.f9311g;
                    executor = this.f9312h;
                } else {
                    e1.a("TAG", "Maximum image number reached.");
                    sVar.close();
                    aVar = null;
                    executor = null;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (aVar != null) {
            if (executor != null) {
                executor.execute(new Runnable() { // from class: o.g1
                    @Override // java.lang.Runnable
                    public final void run() {
                        androidx.camera.core.q.h(this.f139962a, aVar);
                    }
                });
            } else {
                aVar.a(this);
            }
        }
    }

    private void p() {
        synchronized (this.f9305a) {
            try {
                for (int size = this.f9313i.size() - 1; size >= 0; size--) {
                    w0 w0VarValueAt = this.f9313i.valueAt(size);
                    long timestamp = w0VarValueAt.getTimestamp();
                    o oVar = this.f9314j.get(timestamp);
                    if (oVar != null) {
                        this.f9314j.remove(timestamp);
                        this.f9313i.removeAt(size);
                        m(new s(oVar, w0VarValueAt));
                    }
                }
                q();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private void q() {
        synchronized (this.f9305a) {
            try {
                if (this.f9314j.size() != 0 && this.f9313i.size() != 0) {
                    long jKeyAt = this.f9314j.keyAt(0);
                    Long lValueOf = Long.valueOf(jKeyAt);
                    long jKeyAt2 = this.f9313i.keyAt(0);
                    i6.i.a(!Long.valueOf(jKeyAt2).equals(lValueOf));
                    if (jKeyAt2 > jKeyAt) {
                        for (int size = this.f9314j.size() - 1; size >= 0; size--) {
                            if (this.f9314j.keyAt(size) < jKeyAt2) {
                                this.f9314j.valueAt(size).close();
                                this.f9314j.removeAt(size);
                            }
                        }
                    } else {
                        for (int size2 = this.f9313i.size() - 1; size2 >= 0; size2--) {
                            if (this.f9313i.keyAt(size2) < jKeyAt) {
                                this.f9313i.removeAt(size2);
                            }
                        }
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.g2
    public int a() {
        int iA;
        synchronized (this.f9305a) {
            iA = this.f9310f.a();
        }
        return iA;
    }

    @Override // androidx.camera.core.e.a
    public void b(o oVar) {
        synchronized (this.f9305a) {
            k(oVar);
        }
    }

    @Override // v.g2
    public o c() {
        synchronized (this.f9305a) {
            try {
                if (this.f9316l.isEmpty()) {
                    return null;
                }
                if (this.f9315k >= this.f9316l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                ArrayList arrayList = new ArrayList();
                for (int i15 = 0; i15 < this.f9316l.size() - 1; i15++) {
                    if (!this.f9317m.contains(this.f9316l.get(i15))) {
                        arrayList.add(this.f9316l.get(i15));
                    }
                }
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((o) it.next()).close();
                }
                int size = this.f9316l.size();
                List<o> list = this.f9316l;
                this.f9315k = size;
                o oVar = list.get(size - 1);
                this.f9317m.add(oVar);
                return oVar;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.g2
    public void close() {
        synchronized (this.f9305a) {
            try {
                if (this.f9309e) {
                    return;
                }
                Iterator it = new ArrayList(this.f9316l).iterator();
                while (it.hasNext()) {
                    ((o) it.next()).close();
                }
                this.f9316l.clear();
                this.f9310f.close();
                this.f9309e = true;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.g2
    public int d() {
        int iD;
        synchronized (this.f9305a) {
            iD = this.f9310f.d();
        }
        return iD;
    }

    @Override // v.g2
    public void e() {
        synchronized (this.f9305a) {
            this.f9310f.e();
            this.f9311g = null;
            this.f9312h = null;
            this.f9307c = 0;
        }
    }

    @Override // v.g2
    public void f(g2.a aVar, Executor executor) {
        synchronized (this.f9305a) {
            this.f9311g = (g2.a) i6.i.g(aVar);
            this.f9312h = (Executor) i6.i.g(executor);
            this.f9310f.f(this.f9308d, executor);
        }
    }

    @Override // v.g2
    public o g() {
        synchronized (this.f9305a) {
            try {
                if (this.f9316l.isEmpty()) {
                    return null;
                }
                if (this.f9315k >= this.f9316l.size()) {
                    throw new IllegalStateException("Maximum image number reached.");
                }
                List<o> list = this.f9316l;
                int i15 = this.f9315k;
                this.f9315k = i15 + 1;
                o oVar = list.get(i15);
                this.f9317m.add(oVar);
                return oVar;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // v.g2
    public int getHeight() {
        int height;
        synchronized (this.f9305a) {
            height = this.f9310f.getHeight();
        }
        return height;
    }

    @Override // v.g2
    public Surface getSurface() {
        Surface surface;
        synchronized (this.f9305a) {
            surface = this.f9310f.getSurface();
        }
        return surface;
    }

    @Override // v.g2
    public int l() {
        int iL;
        synchronized (this.f9305a) {
            iL = this.f9310f.l();
        }
        return iL;
    }

    public v.s n() {
        return this.f9306b;
    }

    void o(g2 g2Var) {
        o oVarG;
        synchronized (this.f9305a) {
            try {
                if (this.f9309e) {
                    return;
                }
                int size = this.f9314j.size() + this.f9316l.size();
                if (size >= g2Var.a()) {
                    e1.a("MetadataImageReader", "Skip to acquire the next image because the acquired image count has reached the max images count.");
                    return;
                }
                do {
                    try {
                        oVarG = g2Var.g();
                        if (oVarG != null) {
                            this.f9307c--;
                            size++;
                            this.f9314j.put(oVarG.v3().getTimestamp(), oVarG);
                            p();
                        }
                    } catch (IllegalStateException e15) {
                        e1.b("MetadataImageReader", "Failed to acquire next image.", e15);
                        oVarG = null;
                    }
                    if (oVarG == null || this.f9307c <= 0) {
                        break;
                    }
                } while (size < g2Var.a());
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    void r(c0 c0Var) {
        synchronized (this.f9305a) {
            try {
                if (this.f9309e) {
                    return;
                }
                this.f9313i.put(c0Var.getTimestamp(), new b0.c(c0Var));
                p();
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    q(g2 g2Var) {
        this.f9305a = new Object();
        this.f9306b = new a();
        this.f9307c = 0;
        this.f9308d = new g2.a() { // from class: o.f1
            @Override // v.g2.a
            public final void a(v.g2 g2Var2) {
                androidx.camera.core.q.i(this.f139957a, g2Var2);
            }
        };
        this.f9309e = false;
        this.f9313i = new LongSparseArray<>();
        this.f9314j = new LongSparseArray<>();
        this.f9317m = new ArrayList();
        this.f9310f = g2Var;
        this.f9315k = 0;
        this.f9316l = new ArrayList(a());
    }
}
