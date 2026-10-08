package js;

import java.util.HashMap;
import java.util.Map;
import vr.x1;

/* JADX INFO: loaded from: classes4.dex */
public class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final vr.u f104779a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final vr.u f104780b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final vr.u f104781c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<x1, vr.u> f104782d;

    static class a extends vr.r {
        a(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 == 1) {
                objArr[0] = "from";
            } else if (i15 == 2) {
                objArr[0] = "fromPackage";
            } else if (i15 != 3) {
                objArr[0] = "what";
            } else {
                objArr[0] = "myPackage";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$1";
            if (i15 == 2 || i15 == 3) {
                objArr[2] = "visibleFromPackage";
            } else {
                objArr[2] = "isVisible";
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, vr.q qVar, vr.m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.d(qVar, mVar);
        }
    }

    static class b extends vr.r {
        b(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$2";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, vr.q qVar, vr.m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.e(gVar, qVar, mVar);
        }
    }

    static class c extends vr.r {
        c(x1 x1Var) {
            super(x1Var);
        }

        private static /* synthetic */ void g(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "what";
            } else {
                objArr[0] = "from";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities$3";
            objArr[2] = "isVisible";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // vr.u
        public boolean e(mt.g gVar, vr.q qVar, vr.m mVar, boolean z15) {
            if (qVar == null) {
                g(0);
            }
            if (mVar == null) {
                g(1);
            }
            return y.e(gVar, qVar, mVar);
        }
    }

    static {
        a aVar = new a(zr.a.f236401c);
        f104779a = aVar;
        b bVar = new b(zr.c.f236403c);
        f104780b = bVar;
        c cVar = new c(zr.b.f236402c);
        f104781c = cVar;
        f104782d = new HashMap();
        f(aVar);
        f(bVar);
        f(cVar);
    }

    private static /* synthetic */ void a(int i15) {
        String str = (i15 == 5 || i15 == 6) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 5 || i15 == 6) ? 2 : 3];
        switch (i15) {
            case 1:
                objArr[0] = "from";
                break;
            case 2:
                objArr[0] = "first";
                break;
            case 3:
                objArr[0] = "second";
                break;
            case 4:
                objArr[0] = "visibility";
                break;
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
                break;
            default:
                objArr[0] = "what";
                break;
        }
        if (i15 == 5 || i15 == 6) {
            objArr[1] = "toDescriptorVisibility";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/JavaDescriptorVisibilities";
        }
        if (i15 == 2 || i15 == 3) {
            objArr[2] = "areInSamePackage";
        } else if (i15 == 4) {
            objArr[2] = "toDescriptorVisibility";
        } else if (i15 != 5 && i15 != 6) {
            objArr[2] = "isVisibleForProtectedAndPackage";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 5 && i15 != 6) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean d(vr.m mVar, vr.m mVar2) {
        if (mVar == null) {
            a(2);
        }
        if (mVar2 == null) {
            a(3);
        }
        vr.o0 o0Var = (vr.o0) dt.i.r(mVar, vr.o0.class, false);
        vr.o0 o0Var2 = (vr.o0) dt.i.r(mVar2, vr.o0.class, false);
        return (o0Var2 == null || o0Var == null || !o0Var.g().equals(o0Var2.g())) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean e(mt.g gVar, vr.q qVar, vr.m mVar) {
        if (qVar == null) {
            a(0);
        }
        if (mVar == null) {
            a(1);
        }
        if (d(dt.i.M(qVar), mVar)) {
            return true;
        }
        return vr.t.f208078c.e(gVar, qVar, mVar, false);
    }

    private static void f(vr.u uVar) {
        f104782d.put(uVar.b(), uVar);
    }

    public static vr.u g(x1 x1Var) {
        if (x1Var == null) {
            a(4);
        }
        vr.u uVar = f104782d.get(x1Var);
        if (uVar != null) {
            return uVar;
        }
        vr.u uVarJ = vr.t.j(x1Var);
        if (uVarJ == null) {
            a(5);
        }
        return uVarJ;
    }
}
