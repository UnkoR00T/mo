package sr;

import fr.h0;
import fr.q0;
import pq.v;
import st.l1;
import st.t0;
import st.t1;
import st.w0;
import vr.i0;
import vr.m1;
import vr.n0;
import vr.y;

/* JADX INFO: loaded from: classes4.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final n0 f183592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final oq.k f183593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final a f183594c = new a(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final a f183595d = new a(1);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final a f183596e = new a(1);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final a f183597f = new a(2);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final a f183598g = new a(3);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final a f183599h = new a(1);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final a f183600i = new a(2);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final a f183601j = new a(3);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final /* synthetic */ mr.l<Object>[] f183591l = {q0.j(new h0(o.class, "kClass", "getKClass()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kProperty", "getKProperty()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kProperty0", "getKProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kProperty1", "getKProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kProperty2", "getKProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kMutableProperty0", "getKMutableProperty0()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kMutableProperty1", "getKMutableProperty1()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0)), q0.j(new h0(o.class, "kMutableProperty2", "getKMutableProperty2()Lorg/jetbrains/kotlin/descriptors/ClassDescriptor;", 0))};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final b f183590k = new b(null);

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f183602a;

        public a(int i15) {
            this.f183602a = i15;
        }

        public final vr.e a(o oVar, mr.l<?> lVar) {
            return oVar.c(au.a.a(lVar.getName()), this.f183602a);
        }
    }

    public static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        public final t0 a(i0 i0Var) {
            vr.e eVarB = y.b(i0Var, p.a.f183674w0);
            if (eVarB == null) {
                return null;
            }
            return w0.h(t1.f184126b.k(), eVarB, v.e(new l1((m1) v.P0(eVarB.o().getParameters()))));
        }

        private b() {
        }
    }

    public o(i0 i0Var, n0 n0Var) {
        this.f183592a = n0Var;
        this.f183593b = oq.l.b(oq.o.PUBLICATION, new n(i0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final vr.e c(String str, int i15) {
        zs.f fVarL = zs.f.l(str);
        vr.h hVarE = e().e(fVarL, ds.d.FROM_REFLECTION);
        vr.e eVar = hVarE instanceof vr.e ? (vr.e) hVarE : null;
        return eVar == null ? this.f183592a.d(new zs.b(p.f183627y, fVarL), v.e(Integer.valueOf(i15))) : eVar;
    }

    private final lt.k e() {
        return (lt.k) this.f183593b.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lt.k f(i0 i0Var) {
        return i0Var.V(p.f183627y).r();
    }

    public final vr.e d() {
        return this.f183594c.a(this, f183591l[0]);
    }
}
