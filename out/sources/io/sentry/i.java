package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes4.dex */
public final class i implements a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a1 f95019a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a1 f95020b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a1 f95021c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f95022a;

        static {
            int[] iArr = new int[j4.values().length];
            f95022a = iArr;
            try {
                iArr[j4.CURRENT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f95022a[j4.ISOLATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f95022a[j4.GLOBAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f95022a[j4.COMBINED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public i(a1 a1Var, a1 a1Var2, a1 a1Var3) {
        this.f95019a = a1Var;
        this.f95020b = a1Var2;
        this.f95021c = a1Var3;
    }

    private a1 c() {
        return d(null);
    }

    @Override // io.sentry.a1
    public i8 A(f4.b bVar) {
        return c().A(bVar);
    }

    @Override // io.sentry.a1
    public Map<String, String> B() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f95019a.B());
        concurrentHashMap.putAll(this.f95020b.B());
        concurrentHashMap.putAll(this.f95021c.B());
        return concurrentHashMap;
    }

    @Override // io.sentry.a1
    public List<io.sentry.internal.eventprocessor.a> C() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f95019a.C());
        copyOnWriteArrayList.addAll(this.f95020b.C());
        copyOnWriteArrayList.addAll(this.f95021c.C());
        Collections.sort(copyOnWriteArrayList);
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.c D() {
        return new h(this.f95019a.D(), this.f95020b.D(), this.f95021c.D(), s().getDefaultScopeType());
    }

    @Override // io.sentry.a1
    public String E() {
        String strE = this.f95021c.E();
        if (strE != null) {
            return strE;
        }
        String strE2 = this.f95020b.E();
        return strE2 != null ? strE2 : this.f95019a.E();
    }

    @Override // io.sentry.a1
    public void F(l1 l1Var) {
        c().F(l1Var);
    }

    @Override // io.sentry.a1
    public List<String> G() {
        List<String> listG = this.f95021c.G();
        if (!listG.isEmpty()) {
            return listG;
        }
        List<String> listG2 = this.f95020b.G();
        return !listG2.isEmpty() ? listG2 : this.f95019a.G();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.g0 H() {
        io.sentry.protocol.g0 g0VarH = this.f95021c.H();
        if (g0VarH != null) {
            return g0VarH;
        }
        io.sentry.protocol.g0 g0VarH2 = this.f95020b.H();
        return g0VarH2 != null ? g0VarH2 : this.f95019a.H();
    }

    @Override // io.sentry.a1
    public String I() {
        String strI = this.f95021c.I();
        if (strI != null) {
            return strI;
        }
        String strI2 = this.f95020b.I();
        return strI2 != null ? strI2 : this.f95019a.I();
    }

    @Override // io.sentry.a1
    public void J() {
        c().J();
    }

    @Override // io.sentry.a1
    public void K(e1 e1Var) {
        c().K(e1Var);
    }

    @Override // io.sentry.a1
    public b7 L() {
        b7 b7VarL = this.f95021c.L();
        if (b7VarL != null) {
            return b7VarL;
        }
        b7 b7VarL2 = this.f95020b.L();
        return b7VarL2 != null ? b7VarL2 : this.f95019a.L();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.v M() {
        io.sentry.protocol.v vVarM = this.f95021c.M();
        io.sentry.protocol.v vVar = io.sentry.protocol.v.f95495b;
        if (!vVar.equals(vVarM)) {
            return vVarM;
        }
        io.sentry.protocol.v vVarM2 = this.f95020b.M();
        return !vVar.equals(vVarM2) ? vVarM2 : this.f95019a.M();
    }

    @Override // io.sentry.a1
    public y3 N() {
        return c().N();
    }

    @Override // io.sentry.a1
    public void O(String str) {
        c().O(str);
    }

    @Override // io.sentry.a1
    public e1 P() {
        e1 e1VarP = this.f95021c.P();
        if (!(e1VarP instanceof y2)) {
            return e1VarP;
        }
        e1 e1VarP2 = this.f95020b.P();
        return !(e1VarP2 instanceof y2) ? e1VarP2 : this.f95019a.P();
    }

    @Override // io.sentry.a1
    public void Q(r6 r6Var) {
        this.f95019a.Q(r6Var);
    }

    @Override // io.sentry.a1
    public y3 R(f4.a aVar) {
        return c().R(aVar);
    }

    @Override // io.sentry.a1
    public void S(f4.c cVar) {
        c().S(cVar);
    }

    @Override // io.sentry.a1
    public void T(io.sentry.protocol.v vVar) {
        this.f95019a.T(vVar);
        this.f95020b.T(vVar);
        this.f95021c.T(vVar);
    }

    @Override // io.sentry.a1
    public List<e0> U() {
        return io.sentry.util.f.a(C());
    }

    @Override // io.sentry.a1
    public void V(y3 y3Var) {
        c().V(y3Var);
    }

    @Override // io.sentry.a1
    public j1 a() {
        j1 j1VarA = this.f95021c.a();
        if (j1VarA != null) {
            return j1VarA;
        }
        j1 j1VarA2 = this.f95020b.a();
        return j1VarA2 != null ? j1VarA2 : this.f95019a.a();
    }

    @Override // io.sentry.a1
    public io.sentry.protocol.m b() {
        io.sentry.protocol.m mVarB = this.f95021c.b();
        if (mVarB != null) {
            return mVarB;
        }
        io.sentry.protocol.m mVarB2 = this.f95020b.b();
        return mVarB2 != null ? mVarB2 : this.f95019a.b();
    }

    @Override // io.sentry.a1
    public void clear() {
        c().clear();
    }

    a1 d(j4 j4Var) {
        if (j4Var != null) {
            int i15 = a.f95022a[j4Var.ordinal()];
            if (i15 == 1) {
                return this.f95021c;
            }
            if (i15 == 2) {
                return this.f95020b;
            }
            if (i15 == 3) {
                return this.f95019a;
            }
            if (i15 == 4) {
                return this;
            }
        }
        int i16 = a.f95022a[s().getDefaultScopeType().ordinal()];
        if (i16 == 1) {
            return this.f95021c;
        }
        if (i16 != 2) {
            return i16 != 3 ? this.f95021c : this.f95019a;
        }
        return this.f95020b;
    }

    @Override // io.sentry.a1
    public Map<String, Object> getExtras() {
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.putAll(this.f95019a.getExtras());
        concurrentHashMap.putAll(this.f95020b.getExtras());
        concurrentHashMap.putAll(this.f95021c.getExtras());
        return concurrentHashMap;
    }

    @Override // io.sentry.a1
    public i8 getSession() {
        i8 session = this.f95021c.getSession();
        if (session != null) {
            return session;
        }
        i8 session2 = this.f95020b.getSession();
        return session2 != null ? session2 : this.f95019a.getSession();
    }

    @Override // io.sentry.a1
    public List<b> h() {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.addAll(this.f95019a.h());
        copyOnWriteArrayList.addAll(this.f95020b.h());
        copyOnWriteArrayList.addAll(this.f95021c.h());
        return copyOnWriteArrayList;
    }

    @Override // io.sentry.a1
    public void p(String str, String str2) {
        c().p(str, str2);
    }

    @Override // io.sentry.a1
    public void q(f fVar, j0 j0Var) {
        c().q(fVar, j0Var);
    }

    @Override // io.sentry.a1
    public void r(Throwable th4, j1 j1Var, String str) {
        this.f95019a.r(th4, j1Var, str);
    }

    @Override // io.sentry.a1
    public q7 s() {
        return this.f95019a.s();
    }

    @Override // io.sentry.a1
    public l1 u() {
        l1 l1VarU = this.f95021c.u();
        if (l1VarU != null) {
            return l1VarU;
        }
        l1 l1VarU2 = this.f95020b.u();
        return l1VarU2 != null ? l1VarU2 : this.f95019a.u();
    }

    @Override // io.sentry.a1
    public i8 v() {
        return c().v();
    }

    @Override // io.sentry.a1
    public void w(io.sentry.protocol.v vVar) {
        c().w(vVar);
    }

    @Override // io.sentry.a1
    public f4.d x() {
        return c().x();
    }

    @Override // io.sentry.a1
    public void y(q7 q7Var) {
        this.f95019a.y(q7Var);
    }

    @Override // io.sentry.a1
    public Queue<f> z() {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f95019a.z());
        arrayList.addAll(this.f95020b.z());
        arrayList.addAll(this.f95021c.z());
        Collections.sort(arrayList);
        Queue<f> queueF = f4.f(this.f95021c.s().getMaxBreadcrumbs());
        queueF.addAll(arrayList);
        return queueF;
    }

    @Override // io.sentry.a1
    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public a1 m42clone() {
        return new i(this.f95019a, this.f95020b.m42clone(), this.f95021c.m42clone());
    }
}
