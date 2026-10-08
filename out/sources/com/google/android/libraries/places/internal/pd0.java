package com.google.android.libraries.places.internal;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
class pd0 implements gb0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile boolean f33308b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ib0 f33309c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private gb0 f33310d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l90 f33311e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private od0 f33313g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f33314h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private long f33315i;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List f33312f = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private List f33316j = new ArrayList();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final String f33307a = (String) zj.p.r("connecting_and_lb", "bufferContext");

    public pd0(String str) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:9:0x0019  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
    
        r0 = r1.iterator();
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x002c, code lost:
    
        if (r0.hasNext() == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x002e, code lost:
    
        ((java.lang.Runnable) r0.next()).run();
     */
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l() {
        /*
            r3 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5:
            monitor-enter(r3)
            java.util.List r1 = r3.f33312f     // Catch: java.lang.Throwable -> L1d
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1d
            if (r1 == 0) goto L1f
            r0 = 0
            r3.f33312f = r0     // Catch: java.lang.Throwable -> L1d
            r0 = 1
            r3.f33308b = r0     // Catch: java.lang.Throwable -> L1d
            com.google.android.libraries.places.internal.od0 r0 = r3.f33313g     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            if (r0 == 0) goto L1c
            r0.e()
        L1c:
            return
        L1d:
            r0 = move-exception
            goto L3d
        L1f:
            java.util.List r1 = r3.f33312f     // Catch: java.lang.Throwable -> L1d
            r3.f33312f = r0     // Catch: java.lang.Throwable -> L1d
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            java.util.Iterator r0 = r1.iterator()
        L28:
            boolean r2 = r0.hasNext()
            if (r2 == 0) goto L38
            java.lang.Object r2 = r0.next()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            r2.run()
            goto L28
        L38:
            r1.clear()
            r0 = r1
            goto L5
        L3d:
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L1d
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.places.internal.pd0.l():void");
    }

    private final void g(Runnable runnable) {
        zj.p.x(this.f33309c != null, "May only be called after start");
        synchronized (this) {
            try {
                if (this.f33308b) {
                    runnable.run();
                } else {
                    this.f33312f.add(runnable);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void i(ib0 ib0Var) {
        Iterator it = this.f33316j.iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        this.f33316j = null;
        this.f33310d.u(ib0Var);
    }

    private final void j(gb0 gb0Var) {
        gb0 gb0Var2 = this.f33310d;
        zj.p.B(gb0Var2 == null, "realStream already set to %s", gb0Var2);
        this.f33310d = gb0Var;
        this.f33315i = System.nanoTime();
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void I() {
        zj.p.x(this.f33309c != null, "May only be called after start");
        if (this.f33308b) {
            this.f33310d.I();
        } else {
            g(new hd0(this));
        }
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void a(int i15) {
        zj.p.x(this.f33309c != null, "May only be called after start");
        if (this.f33308b) {
            this.f33310d.a(i15);
        } else {
            g(new yc0(this, i15));
        }
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void b(x40 x40Var) {
        zj.p.x(this.f33309c == null, "May only be called before start");
        zj.p.r(x40Var, "compressor");
        this.f33316j.add(new ad0(this, x40Var));
    }

    protected void c(l90 l90Var) {
        throw null;
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void d(InputStream inputStream) {
        zj.p.x(this.f33309c != null, "May only be called after start");
        zj.p.r(inputStream, "message");
        if (this.f33308b) {
            this.f33310d.d(inputStream);
        } else {
            g(new gd0(this, inputStream));
        }
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final void e() {
        zj.p.x(this.f33309c == null, "May only be called before start");
        this.f33316j.add(new zc0(this));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void h() {
        zj.p.x(this.f33309c != null, "May only be called after start");
        g(new jd0(this));
    }

    final Runnable k(gb0 gb0Var) {
        synchronized (this) {
            try {
                if (this.f33310d == null) {
                    j((gb0) zj.p.r(gb0Var, "stream"));
                    ib0 ib0Var = this.f33309c;
                    if (ib0Var == null) {
                        this.f33312f = null;
                        this.f33308b = true;
                    }
                    if (ib0Var != null) {
                        i(ib0Var);
                        return new fd0(this);
                    }
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return null;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void m(int i15) {
        zj.p.x(this.f33309c == null, "May only be called before start");
        this.f33316j.add(new cd0(this, i15));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void n(n50 n50Var) {
        zj.p.x(this.f33309c == null, "May only be called before start");
        zj.p.r(n50Var, "decompressorRegistry");
        this.f33316j.add(new bd0(this, n50Var));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void p(int i15) {
        zj.p.x(this.f33309c == null, "May only be called before start");
        this.f33316j.add(new dd0(this, i15));
    }

    @Override // com.google.android.libraries.places.internal.jm0
    public final boolean q() {
        if (this.f33308b) {
            return this.f33310d.q();
        }
        return false;
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public void r(ff0 ff0Var) {
        synchronized (this) {
            try {
                if (this.f33309c == null) {
                    return;
                }
                if (this.f33310d != null) {
                    String str = this.f33307a;
                    StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 6);
                    sb5.append(str);
                    sb5.append("_delay");
                    String string = sb5.toString();
                    long j15 = this.f33315i - this.f33314h;
                    StringBuilder sb6 = new StringBuilder(String.valueOf(j15).length() + 2);
                    sb6.append(j15);
                    sb6.append("ns");
                    ff0Var.b(string, sb6.toString());
                    this.f33310d.r(ff0Var);
                } else {
                    String str2 = this.f33307a;
                    StringBuilder sb7 = new StringBuilder(String.valueOf(str2).length() + 6);
                    sb7.append(str2);
                    sb7.append("_delay");
                    String string2 = sb7.toString();
                    long jNanoTime = System.nanoTime() - this.f33314h;
                    StringBuilder sb8 = new StringBuilder(String.valueOf(jNanoTime).length() + 2);
                    sb8.append(jNanoTime);
                    sb8.append("ns");
                    ff0Var.b(string2, sb8.toString());
                    ff0Var.a("was_still_waiting");
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void s(j50 j50Var) {
        zj.p.x(this.f33309c == null, "May only be called before start");
        this.f33316j.add(new ed0(this, j50Var));
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public void t(l90 l90Var) {
        boolean z15 = false;
        zj.p.x(this.f33309c != null, "May only be called after start");
        zj.p.r(l90Var, "reason");
        synchronized (this) {
            try {
                if (this.f33310d == null) {
                    j(ri0.f33512a);
                    this.f33311e = l90Var;
                } else {
                    z15 = true;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (z15) {
            g(new id0(this, l90Var));
            return;
        }
        l();
        c(l90Var);
        this.f33309c.b(l90Var, hb0.PROCESSED, new a80());
    }

    @Override // com.google.android.libraries.places.internal.gb0
    public final void u(ib0 ib0Var) {
        l90 l90Var;
        boolean z15;
        zj.p.r(ib0Var, "listener");
        zj.p.x(this.f33309c == null, "already started");
        synchronized (this) {
            try {
                l90Var = this.f33311e;
                z15 = this.f33308b;
                if (!z15) {
                    od0 od0Var = new od0(ib0Var);
                    this.f33313g = od0Var;
                    ib0Var = od0Var;
                }
                this.f33309c = ib0Var;
                this.f33314h = System.nanoTime();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (l90Var != null) {
            ib0Var.b(l90Var, hb0.PROCESSED, new a80());
        } else if (z15) {
            i(ib0Var);
        }
    }

    final /* synthetic */ gb0 v() {
        return this.f33310d;
    }
}
