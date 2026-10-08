package dt;

import java.util.Collections;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import st.e1;
import st.f2;
import st.p2;
import st.t0;
import st.t1;
import st.w0;
import vr.c1;
import vr.f0;
import vr.g1;
import vr.h1;
import vr.i0;
import vr.m1;
import vr.z;
import vr.z0;
import yr.k0;
import yr.l0;
import yr.m0;
import yr.n0;
import yr.o0;
import yr.u0;

/* JADX INFO: loaded from: classes4.dex */
public class h {

    private static class a extends yr.i {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(vr.e eVar, h1 h1Var, boolean z15) {
            super(eVar, null, wr.h.f214542p0.b(), true, vr.b.a.DECLARATION, h1Var);
            if (eVar == null) {
                m0(0);
            }
            if (h1Var == null) {
                m0(1);
            }
            w1(Collections.EMPTY_LIST, i.k(eVar, z15));
        }

        private static /* synthetic */ void m0(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "containingClass";
            } else {
                objArr[0] = "source";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory$DefaultClassConstructorDescriptor";
            objArr[2] = "<init>";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }
    }

    private static /* synthetic */ void a(int i15) {
        String str = (i15 == 12 || i15 == 23 || i15 == 25) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i15 == 12 || i15 == 23 || i15 == 25) ? 2 : 3];
        switch (i15) {
            case 1:
            case 4:
            case 8:
            case 14:
            case 16:
            case 18:
            case BERTags.DATE /* 31 */:
            case 33:
            case 35:
                objArr[0] = "annotations";
                break;
            case 2:
            case 5:
            case 9:
                objArr[0] = "parameterAnnotations";
                break;
            case 3:
            case 7:
            case 13:
            case 15:
            case 17:
            default:
                objArr[0] = "propertyDescriptor";
                break;
            case 6:
            case 11:
            case 19:
                objArr[0] = "sourceElement";
                break;
            case 10:
                objArr[0] = "visibility";
                break;
            case 12:
            case 23:
            case 25:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
                break;
            case 20:
                objArr[0] = "containingClass";
                break;
            case 21:
                objArr[0] = "source";
                break;
            case 22:
            case 24:
            case 26:
                objArr[0] = "enumClass";
                break;
            case 27:
            case 28:
            case 29:
                objArr[0] = "descriptor";
                break;
            case 30:
            case 32:
            case 34:
                objArr[0] = "owner";
                break;
        }
        if (i15 == 12) {
            objArr[1] = "createSetter";
        } else if (i15 == 23) {
            objArr[1] = "createEnumValuesMethod";
        } else if (i15 != 25) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/DescriptorFactory";
        } else {
            objArr[1] = "createEnumValueOfMethod";
        }
        switch (i15) {
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "createSetter";
                break;
            case 12:
            case 23:
            case 25:
                break;
            case 13:
            case 14:
                objArr[2] = "createDefaultGetter";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "createGetter";
                break;
            case 20:
            case 21:
                objArr[2] = "createPrimaryConstructorForObject";
                break;
            case 22:
                objArr[2] = "createEnumValuesMethod";
                break;
            case 24:
                objArr[2] = "createEnumValueOfMethod";
                break;
            case 26:
                objArr[2] = "createEnumEntriesProperty";
                break;
            case 27:
                objArr[2] = "isEnumValuesMethod";
                break;
            case 28:
                objArr[2] = "isEnumValueOfMethod";
                break;
            case 29:
                objArr[2] = "isEnumSpecialMethod";
                break;
            case 30:
            case BERTags.DATE /* 31 */:
                objArr[2] = "createExtensionReceiverParameterForCallable";
                break;
            case 32:
            case 33:
                objArr[2] = "createContextReceiverParameterForCallable";
                break;
            case 34:
            case 35:
                objArr[2] = "createContextReceiverParameterForClass";
                break;
            default:
                objArr[2] = "createDefaultSetter";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 12 && i15 != 23 && i15 != 25) {
            throw new IllegalArgumentException(str2);
        }
        throw new IllegalStateException(str2);
    }

    public static c1 b(vr.a aVar, t0 t0Var, zs.f fVar, wr.h hVar, int i15) {
        if (aVar == null) {
            a(32);
        }
        if (hVar == null) {
            a(33);
        }
        if (t0Var == null) {
            return null;
        }
        return new n0(aVar, new mt.c(aVar, t0Var, fVar, null), hVar, zs.g.a(i15));
    }

    public static c1 c(vr.e eVar, t0 t0Var, zs.f fVar, wr.h hVar, int i15) {
        if (eVar == null) {
            a(34);
        }
        if (hVar == null) {
            a(35);
        }
        if (t0Var == null) {
            return null;
        }
        return new n0(eVar, new mt.b(eVar, t0Var, fVar, null), hVar, zs.g.a(i15));
    }

    public static l0 d(z0 z0Var, wr.h hVar) {
        if (z0Var == null) {
            a(13);
        }
        if (hVar == null) {
            a(14);
        }
        return j(z0Var, hVar, true, false, false);
    }

    public static m0 e(z0 z0Var, wr.h hVar, wr.h hVar2) {
        if (z0Var == null) {
            a(0);
        }
        if (hVar == null) {
            a(1);
        }
        if (hVar2 == null) {
            a(2);
        }
        return n(z0Var, hVar, hVar2, true, false, false, z0Var.m());
    }

    public static z0 f(vr.e eVar) {
        if (eVar == null) {
            a(26);
        }
        i0 i0VarG = i.g(eVar);
        vr.e eVarA = w.a(i0VarG).a(i0VarG);
        if (eVarA == null) {
            return null;
        }
        wr.h.a aVar = wr.h.f214542p0;
        wr.h hVarB = aVar.b();
        f0 f0Var = f0.FINAL;
        vr.u uVar = vr.t.f208080e;
        zs.f fVar = sr.p.f183607e;
        vr.b.a aVar2 = vr.b.a.SYNTHESIZED;
        k0 k0VarU0 = k0.U0(eVar, hVarB, f0Var, uVar, false, fVar, aVar2, eVar.m(), false, false, false, false, false, false);
        l0 l0Var = new l0(k0VarU0, aVar.b(), f0Var, uVar, false, false, false, aVar2, null, eVar.m());
        k0VarU0.a1(l0Var, null);
        e1 e1VarI = w0.i(t1.f184126b.k(), eVarA.o(), Collections.singletonList(new f2(eVar.t())), false);
        List<? extends m1> list = Collections.EMPTY_LIST;
        k0VarU0.h1(e1VarI, list, null, null, list);
        l0Var.W0(k0VarU0.f());
        return k0VarU0;
    }

    public static g1 g(vr.e eVar) {
        if (eVar == null) {
            a(24);
        }
        wr.h.a aVar = wr.h.f214542p0;
        o0 o0VarR1 = o0.r1(eVar, aVar.b(), sr.p.f183608f, vr.b.a.SYNTHESIZED, eVar.m());
        u0 u0Var = new u0(o0VarR1, null, 0, aVar.b(), zs.f.l("value"), ht.e.m(eVar).X(), false, false, false, null, eVar.m());
        List<c1> list = Collections.EMPTY_LIST;
        o0 o0VarT1 = o0VarR1.X0(null, null, list, list, Collections.singletonList(u0Var), eVar.t(), f0.FINAL, vr.t.f208080e);
        if (o0VarT1 == null) {
            a(25);
        }
        return o0VarT1;
    }

    public static g1 h(vr.e eVar) {
        if (eVar == null) {
            a(22);
        }
        o0 o0VarR1 = o0.r1(eVar, wr.h.f214542p0.b(), sr.p.f183606d, vr.b.a.SYNTHESIZED, eVar.m());
        List<c1> list = Collections.EMPTY_LIST;
        o0 o0VarT1 = o0VarR1.X0(null, null, list, list, list, ht.e.m(eVar).m(p2.INVARIANT, eVar.t()), f0.FINAL, vr.t.f208080e);
        if (o0VarT1 == null) {
            a(23);
        }
        return o0VarT1;
    }

    public static c1 i(vr.a aVar, t0 t0Var, wr.h hVar) {
        if (aVar == null) {
            a(30);
        }
        if (hVar == null) {
            a(31);
        }
        if (t0Var == null) {
            return null;
        }
        return new n0(aVar, new mt.d(aVar, t0Var, null), hVar);
    }

    public static l0 j(z0 z0Var, wr.h hVar, boolean z15, boolean z16, boolean z17) {
        if (z0Var == null) {
            a(15);
        }
        if (hVar == null) {
            a(16);
        }
        return k(z0Var, hVar, z15, z16, z17, z0Var.m());
    }

    public static l0 k(z0 z0Var, wr.h hVar, boolean z15, boolean z16, boolean z17, h1 h1Var) {
        if (z0Var == null) {
            a(17);
        }
        if (hVar == null) {
            a(18);
        }
        if (h1Var == null) {
            a(19);
        }
        return new l0(z0Var, hVar, z0Var.w(), z0Var.h(), z15, z16, z17, vr.b.a.DECLARATION, null, h1Var);
    }

    public static yr.i l(vr.e eVar, h1 h1Var) {
        if (eVar == null) {
            a(20);
        }
        if (h1Var == null) {
            a(21);
        }
        return new a(eVar, h1Var, false);
    }

    public static m0 m(z0 z0Var, wr.h hVar, wr.h hVar2, boolean z15, boolean z16, boolean z17, vr.u uVar, h1 h1Var) {
        if (z0Var == null) {
            a(7);
        }
        if (hVar == null) {
            a(8);
        }
        if (hVar2 == null) {
            a(9);
        }
        if (uVar == null) {
            a(10);
        }
        if (h1Var == null) {
            a(11);
        }
        m0 m0Var = new m0(z0Var, hVar, z0Var.w(), uVar, z15, z16, z17, vr.b.a.DECLARATION, null, h1Var);
        m0Var.X0(m0.V0(m0Var, z0Var.getType(), hVar2));
        return m0Var;
    }

    public static m0 n(z0 z0Var, wr.h hVar, wr.h hVar2, boolean z15, boolean z16, boolean z17, h1 h1Var) {
        if (z0Var == null) {
            a(3);
        }
        if (hVar == null) {
            a(4);
        }
        if (hVar2 == null) {
            a(5);
        }
        if (h1Var == null) {
            a(6);
        }
        return m(z0Var, hVar, hVar2, z15, z16, z17, z0Var.h(), h1Var);
    }

    private static boolean o(z zVar) {
        if (zVar == null) {
            a(29);
        }
        return zVar.k() == vr.b.a.SYNTHESIZED && i.A(zVar.b());
    }

    public static boolean p(z zVar) {
        if (zVar == null) {
            a(28);
        }
        return zVar.getName().equals(sr.p.f183608f) && o(zVar);
    }

    public static boolean q(z zVar) {
        if (zVar == null) {
            a(27);
        }
        return zVar.getName().equals(sr.p.f183606d) && o(zVar);
    }
}
