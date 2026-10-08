package io.sentry;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: loaded from: classes4.dex */
public final class m8 implements j1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private n5 f95195a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private n5 f95196b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final n8 f95197c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final f8 f95198d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Throwable f95199e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final c1 f95200f;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final t8 f95203i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private p8 f95204j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f95201g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final AtomicBoolean f95202h = new AtomicBoolean(false);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Map<String, Object> f95205k = new ConcurrentHashMap();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Map<String, io.sentry.protocol.i> f95206l = new ConcurrentHashMap();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final io.sentry.protocol.c f95207m = new io.sentry.protocol.c();

    m8(f8 f8Var, c1 c1Var, n8 n8Var, t8 t8Var, p8 p8Var) {
        this.f95197c = n8Var;
        n8Var.r(t8Var.a());
        this.f95198d = (f8) io.sentry.util.v.c(f8Var, "transaction is required");
        this.f95200f = (c1) io.sentry.util.v.c(c1Var, "Scopes are required");
        this.f95203i = t8Var;
        this.f95204j = p8Var;
        n5 n5VarC = t8Var.c();
        if (n5VarC != null) {
            this.f95195a = n5VarC;
        } else {
            this.f95195a = c1Var.s().getDateProvider().a();
        }
    }

    private List<m8> C() {
        ArrayList arrayList = new ArrayList();
        for (m8 m8Var : this.f95198d.V()) {
            if (m8Var.H() != null && m8Var.H().equals(K())) {
                arrayList.add(m8Var);
            }
        }
        return arrayList;
    }

    private void Q(n5 n5Var) {
        this.f95195a = n5Var;
    }

    @Override // io.sentry.j1
    public n5 A() {
        return this.f95195a;
    }

    public Map<String, Object> B() {
        return this.f95205k;
    }

    public Map<String, io.sentry.protocol.i> D() {
        return this.f95206l;
    }

    public String E() {
        return this.f95197c.e();
    }

    t8 F() {
        return this.f95203i;
    }

    @Override // io.sentry.j1
    public boolean G() {
        return false;
    }

    public s8 H() {
        return this.f95197c.g();
    }

    public b9 I() {
        return this.f95197c.j();
    }

    p8 J() {
        return this.f95204j;
    }

    public s8 K() {
        return this.f95197c.k();
    }

    public Map<String, String> L() {
        return this.f95197c.m();
    }

    public io.sentry.protocol.v M() {
        return this.f95197c.n();
    }

    public Boolean N() {
        return this.f95197c.h();
    }

    void O(p8 p8Var) {
        this.f95204j = p8Var;
    }

    public boolean P(n5 n5Var) {
        if (this.f95196b == null) {
            return false;
        }
        this.f95196b = n5Var;
        return true;
    }

    @Override // io.sentry.j1
    public void a(u8 u8Var) {
        this.f95197c.t(u8Var);
    }

    @Override // io.sentry.j1
    public u8 b() {
        return this.f95197c.l();
    }

    @Override // io.sentry.j1
    public y7 c() {
        return new y7(this.f95197c.n(), this.f95197c.k(), this.f95197c.i());
    }

    @Override // io.sentry.j1
    public boolean d() {
        return this.f95201g;
    }

    @Override // io.sentry.j1
    public Boolean f() {
        return this.f95197c.i();
    }

    @Override // io.sentry.j1
    public void g() {
        o(this.f95197c.l());
    }

    @Override // io.sentry.j1
    public String getDescription() {
        return this.f95197c.c();
    }

    @Override // io.sentry.j1
    public void h(String str) {
        this.f95197c.p(str);
    }

    @Override // io.sentry.j1
    public j1 j(String str) {
        return z(str, null);
    }

    @Override // io.sentry.j1
    public void k(String str, Number number) {
        if (d()) {
            this.f95200f.s().getLogger().c(b7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f95206l.put(str, new io.sentry.protocol.i(number, null));
        if (this.f95198d.T() != this) {
            this.f95198d.d0(str, number);
        }
    }

    @Override // io.sentry.j1
    public void m(String str, Object obj) {
        if (str == null) {
            return;
        }
        if (obj == null) {
            this.f95205k.remove(str);
        } else {
            this.f95205k.put(str, obj);
        }
    }

    @Override // io.sentry.j1
    public void n(Throwable th4) {
        this.f95199e = th4;
    }

    @Override // io.sentry.j1
    public void o(u8 u8Var) {
        y(u8Var, this.f95200f.s().getDateProvider().a());
    }

    @Override // io.sentry.j1
    public e p(List<String> list) {
        return this.f95198d.p(list);
    }

    @Override // io.sentry.j1
    public j1 q(String str, String str2, n5 n5Var, q1 q1Var) {
        return u(str, str2, n5Var, q1Var, new t8());
    }

    @Override // io.sentry.j1
    public void r(String str, Number number, h2 h2Var) {
        if (d()) {
            this.f95200f.s().getLogger().c(b7.DEBUG, "The span is already finished. Measurement %s cannot be set", str);
            return;
        }
        this.f95206l.put(str, new io.sentry.protocol.i(number, h2Var.apiName()));
        if (this.f95198d.T() != this) {
            this.f95198d.e0(str, number, h2Var);
        }
    }

    @Override // io.sentry.j1
    public j1 u(String str, String str2, n5 n5Var, q1 q1Var, t8 t8Var) {
        return this.f95201g ? e3.B() : this.f95198d.g0(this.f95197c.k(), str, str2, n5Var, q1Var, t8Var);
    }

    @Override // io.sentry.j1
    public n8 w() {
        return this.f95197c;
    }

    @Override // io.sentry.j1
    public n5 x() {
        return this.f95196b;
    }

    @Override // io.sentry.j1
    public void y(u8 u8Var, n5 n5Var) {
        n5 n5Var2;
        if (this.f95201g || !this.f95202h.compareAndSet(false, true)) {
            return;
        }
        this.f95197c.t(u8Var);
        if (n5Var == null) {
            n5Var = this.f95200f.s().getDateProvider().a();
        }
        this.f95196b = n5Var;
        if (this.f95203i.f() || this.f95203i.e()) {
            n5 n5VarA = null;
            n5 n5VarX = null;
            for (m8 m8Var : this.f95198d.T().K().equals(K()) ? this.f95198d.Q() : C()) {
                if (n5VarA == null || m8Var.A().j(n5VarA)) {
                    n5VarA = m8Var.A();
                }
                if (n5VarX == null || (m8Var.x() != null && m8Var.x().g(n5VarX))) {
                    n5VarX = m8Var.x();
                }
            }
            if (this.f95203i.f() && n5VarA != null && this.f95195a.j(n5VarA)) {
                Q(n5VarA);
            }
            if (this.f95203i.e() && n5VarX != null && ((n5Var2 = this.f95196b) == null || n5Var2.g(n5VarX))) {
                P(n5VarX);
            }
        }
        Throwable th4 = this.f95199e;
        if (th4 != null) {
            this.f95200f.r(th4, this, this.f95198d.getName());
        }
        p8 p8Var = this.f95204j;
        if (p8Var != null) {
            p8Var.a(this);
        }
        this.f95201g = true;
    }

    @Override // io.sentry.j1
    public j1 z(String str, String str2) {
        return this.f95201g ? e3.B() : this.f95198d.f0(this.f95197c.k(), str, str2);
    }

    public m8(c9 c9Var, f8 f8Var, c1 c1Var, t8 t8Var) {
        n8 n8Var = (n8) io.sentry.util.v.c(c9Var, "context is required");
        this.f95197c = n8Var;
        n8Var.r(t8Var.a());
        this.f95198d = (f8) io.sentry.util.v.c(f8Var, "sentryTracer is required");
        this.f95200f = (c1) io.sentry.util.v.c(c1Var, "scopes are required");
        this.f95204j = null;
        n5 n5VarC = t8Var.c();
        if (n5VarC != null) {
            this.f95195a = n5VarC;
        } else {
            this.f95195a = c1Var.s().getDateProvider().a();
        }
        this.f95203i = t8Var;
    }
}
