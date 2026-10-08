package ls;

import java.util.List;
import java.util.Map;
import oq.r;
import st.t0;
import vr.c1;
import vr.f0;
import vr.g1;
import vr.h1;
import vr.m;
import vr.m1;
import vr.t1;
import vr.u;
import vr.z;
import yr.o0;
import zt.s;

/* JADX INFO: loaded from: classes4.dex */
public class e extends o0 implements ls.a {
    public static final vr.a.InterfaceC5463a<t1> K = new a();
    public static final vr.a.InterfaceC5463a<Boolean> L = new b();
    private c H;
    private final boolean I;

    static class a implements vr.a.InterfaceC5463a<t1> {
        a() {
        }
    }

    static class b implements vr.a.InterfaceC5463a<Boolean> {
        b() {
        }
    }

    private enum c {
        NON_STABLE_DECLARED(false, false),
        STABLE_DECLARED(true, false),
        NON_STABLE_SYNTHESIZED(false, true),
        STABLE_SYNTHESIZED(true, true);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f120029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f120030b;

        c(boolean z15, boolean z16) {
            this.f120029a = z15;
            this.f120030b = z16;
        }

        private static /* synthetic */ void b(int i15) {
            throw new IllegalStateException(String.format("@NotNull method %s.%s must not return null", "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor$ParameterNamesStatus", "get"));
        }

        public static c e(boolean z15, boolean z16) {
            c cVar;
            if (z15) {
                cVar = z16 ? STABLE_SYNTHESIZED : STABLE_DECLARED;
            } else {
                cVar = z16 ? NON_STABLE_SYNTHESIZED : NON_STABLE_DECLARED;
            }
            if (cVar == null) {
                b(0);
            }
            return cVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected e(m mVar, g1 g1Var, wr.h hVar, zs.f fVar, vr.b.a aVar, h1 h1Var, boolean z15) {
        super(mVar, g1Var, hVar, fVar, aVar, h1Var);
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (fVar == null) {
            m0(2);
        }
        if (aVar == null) {
            m0(3);
        }
        if (h1Var == null) {
            m0(4);
        }
        this.H = null;
        this.I = z15;
    }

    private static /* synthetic */ void m0(int i15) {
        String str = (i15 == 13 || i15 == 18 || i15 == 21) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 13 || i15 == 18 || i15 == 21) ? 2 : 3];
        switch (i15) {
            case 1:
            case 6:
            case 16:
                objArr[0] = "annotations";
                break;
            case 2:
            case 7:
                objArr[0] = "name";
                break;
            case 3:
            case 15:
                objArr[0] = "kind";
                break;
            case 4:
            case 8:
            case 17:
                objArr[0] = "source";
                break;
            case 5:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 9:
                objArr[0] = "contextReceiverParameters";
                break;
            case 10:
                objArr[0] = "typeParameters";
                break;
            case 11:
                objArr[0] = "unsubstitutedValueParameters";
                break;
            case 12:
                objArr[0] = "visibility";
                break;
            case 13:
            case 18:
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
                break;
            case 14:
                objArr[0] = "newOwner";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i15 == 13) {
            objArr[1] = "initialize";
        } else if (i15 == 18) {
            objArr[1] = "createSubstitutedCopy";
        } else if (i15 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaMethodDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i15) {
            case 5:
            case 6:
            case 7:
            case 8:
                objArr[2] = "createJavaMethod";
                break;
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "initialize";
                break;
            case 13:
            case 18:
            case 21:
                break;
            case 14:
            case 15:
            case 16:
            case 17:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 13 && i15 != 18 && i15 != 21) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static e v1(m mVar, wr.h hVar, zs.f fVar, h1 h1Var, boolean z15) {
        if (mVar == null) {
            m0(5);
        }
        if (hVar == null) {
            m0(6);
        }
        if (fVar == null) {
            m0(7);
        }
        if (h1Var == null) {
            m0(8);
        }
        return new e(mVar, null, hVar, fVar, vr.b.a.DECLARATION, h1Var, z15);
    }

    @Override // yr.s
    public boolean W0() {
        return this.H.f120029a;
    }

    @Override // yr.s, vr.a
    public boolean l0() {
        return this.H.f120030b;
    }

    @Override // yr.o0
    public o0 u1(c1 c1Var, c1 c1Var2, List<c1> list, List<? extends m1> list2, List<t1> list3, t0 t0Var, f0 f0Var, u uVar, Map<? extends vr.a.InterfaceC5463a<?>, ?> map) {
        if (list == null) {
            m0(9);
        }
        if (list2 == null) {
            m0(10);
        }
        if (list3 == null) {
            m0(11);
        }
        if (uVar == null) {
            m0(12);
        }
        o0 o0VarU1 = super.u1(c1Var, c1Var2, list, list2, list3, t0Var, f0Var, uVar, map);
        l1(s.f237241a.a(o0VarU1).a());
        if (o0VarU1 == null) {
            m0(13);
        }
        return o0VarU1;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // yr.o0, yr.s
    /* JADX INFO: renamed from: w1, reason: merged with bridge method [inline-methods] */
    public e u1(m mVar, z zVar, vr.b.a aVar, zs.f fVar, wr.h hVar, h1 h1Var) {
        if (mVar == null) {
            m0(14);
        }
        if (aVar == null) {
            m0(15);
        }
        if (hVar == null) {
            m0(16);
        }
        if (h1Var == null) {
            m0(17);
        }
        g1 g1Var = (g1) zVar;
        if (fVar == null) {
            fVar = getName();
        }
        e eVar = new e(mVar, g1Var, hVar, fVar, aVar, h1Var, this.I);
        eVar.y1(W0(), l0());
        return eVar;
    }

    @Override // ls.a
    /* JADX INFO: renamed from: x1, reason: merged with bridge method [inline-methods] */
    public e D(t0 t0Var, List<t0> list, t0 t0Var2, r<vr.a.InterfaceC5463a<?>, ?> rVar) {
        if (list == null) {
            m0(19);
        }
        if (t0Var2 == null) {
            m0(20);
        }
        e eVar = (e) z().c(h.a(list, l(), this)).b(t0Var2).n(t0Var == null ? null : dt.h.i(this, t0Var, wr.h.f214542p0.b())).a().i().build();
        if (rVar != null) {
            eVar.a1(rVar.c(), rVar.d());
        }
        if (eVar == null) {
            m0(21);
        }
        return eVar;
    }

    public void y1(boolean z15, boolean z16) {
        this.H = c.e(z15, z16);
    }
}
