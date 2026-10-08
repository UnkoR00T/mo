package st;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public class l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e1 f184075a = ut.l.d(ut.k.H, new String[0]);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final e1 f184076b = ut.l.d(ut.k.A, new String[0]);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final e1 f184077c = new a("NO_EXPECTED_TYPE");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final e1 f184078d = new a("UNIT_EXPECTED_TYPE");

    public static class a extends b0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f184079b;

        public a(String str) {
            this.f184079b = str;
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0030  */
        private static /* synthetic */ void f1(int i15) {
            String str = (i15 == 1 || i15 == 4) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i15 == 1 || i15 == 4) ? 2 : 3];
            if (i15 == 1) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else if (i15 == 2) {
                objArr[0] = "delegate";
            } else if (i15 == 3) {
                objArr[0] = "kotlinTypeRefiner";
            } else if (i15 != 4) {
                objArr[0] = "newAttributes";
            } else {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            }
            if (i15 == 1) {
                objArr[1] = "toString";
            } else if (i15 != 4) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils$SpecialType";
            } else {
                objArr[1] = "refine";
            }
            if (i15 != 1) {
                if (i15 == 2) {
                    objArr[2] = "replaceDelegate";
                } else if (i15 == 3) {
                    objArr[2] = "refine";
                } else if (i15 != 4) {
                    objArr[2] = "replaceAttributes";
                }
            }
            String str2 = String.format(str, objArr);
            if (i15 != 1 && i15 != 4) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        @Override // st.o2
        /* JADX INFO: renamed from: a1 */
        public e1 X0(boolean z15) {
            throw new IllegalStateException(this.f184079b);
        }

        @Override // st.o2
        /* JADX INFO: renamed from: b1 */
        public e1 Z0(t1 t1Var) {
            if (t1Var == null) {
                f1(0);
            }
            throw new IllegalStateException(this.f184079b);
        }

        @Override // st.b0
        protected e1 c1() {
            throw new IllegalStateException(this.f184079b);
        }

        @Override // st.b0
        public b0 e1(e1 e1Var) {
            if (e1Var == null) {
                f1(2);
            }
            throw new IllegalStateException(this.f184079b);
        }

        @Override // st.b0
        /* JADX INFO: renamed from: g1, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public a d1(tt.g gVar) {
            if (gVar == null) {
                f1(3);
            }
            return this;
        }

        @Override // st.e1
        public String toString() {
            String str = this.f184079b;
            if (str == null) {
                f1(1);
            }
            return str;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:82:0x011c  */
    private static /* synthetic */ void a(int i15) {
        String str;
        int i16;
        if (i15 != 4 && i15 != 9 && i15 != 11 && i15 != 15 && i15 != 17 && i15 != 19 && i15 != 26 && i15 != 35 && i15 != 48 && i15 != 53 && i15 != 6 && i15 != 7) {
            switch (i15) {
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 4 && i15 != 9 && i15 != 11 && i15 != 15 && i15 != 17 && i15 != 19 && i15 != 26 && i15 != 35 && i15 != 48 && i15 != 53 && i15 != 6 && i15 != 7) {
            switch (i15) {
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    i16 = 2;
                    break;
                default:
                    i16 = 3;
                    break;
            }
        } else {
            i16 = 2;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                break;
            case 5:
            case 8:
            case 10:
            case 18:
            case 23:
            case 25:
            case 27:
            case 28:
            case 29:
            case 30:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case 40:
            default:
                objArr[0] = "type";
                break;
            case 12:
                objArr[0] = "typeConstructor";
                break;
            case 13:
                objArr[0] = "unsubstitutedMemberScope";
                break;
            case 14:
                objArr[0] = "refinedTypeFactory";
                break;
            case 16:
                objArr[0] = "parameters";
                break;
            case 20:
                objArr[0] = "subType";
                break;
            case 21:
                objArr[0] = "superType";
                break;
            case 22:
                objArr[0] = "substitutor";
                break;
            case 24:
                objArr[0] = "result";
                break;
            case BERTags.DATE /* 31 */:
            case 33:
                objArr[0] = "clazz";
                break;
            case 32:
                objArr[0] = "typeArguments";
                break;
            case 34:
                objArr[0] = "projections";
                break;
            case 36:
                objArr[0] = "a";
                break;
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                objArr[0] = "b";
                break;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[0] = "typeParameters";
                break;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                objArr[0] = "typeParameterConstructors";
                break;
            case EACTags.CURRENCY_CODE /* 42 */:
                objArr[0] = "specialType";
                break;
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                objArr[0] = "isSpecialType";
                break;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
                objArr[0] = "parameterDescriptor";
                break;
            case 47:
            case EACTags.TRANSACTION_DATE /* 51 */:
                objArr[0] = "numberValueTypeConstructor";
                break;
            case 49:
            case 50:
                objArr[0] = "supertypes";
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 55:
                objArr[0] = "expectedType";
                break;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                objArr[0] = "literalTypeConstructor";
                break;
        }
        if (i15 == 4) {
            objArr[1] = "makeNullableAsSpecified";
        } else if (i15 == 9) {
            objArr[1] = "makeNullableIfNeeded";
        } else if (i15 == 11 || i15 == 15) {
            objArr[1] = "makeUnsubstitutedType";
        } else if (i15 == 17) {
            objArr[1] = "getDefaultTypeProjections";
        } else if (i15 == 19) {
            objArr[1] = "getImmediateSupertypes";
        } else if (i15 == 26) {
            objArr[1] = "getAllSupertypes";
        } else if (i15 == 35) {
            objArr[1] = "substituteProjectionsForParameters";
        } else if (i15 == 48) {
            objArr[1] = "getDefaultPrimitiveNumberType";
        } else if (i15 != 53) {
            if (i15 != 6 && i15 != 7) {
                switch (i15) {
                    case 56:
                    case 57:
                    case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                    case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                        objArr[1] = "getPrimitiveNumberType";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeUtils";
                        break;
                }
            } else {
                objArr[1] = "makeNullableIfNeeded";
            }
        } else {
            objArr[1] = "getPrimitiveNumberType";
        }
        switch (i15) {
            case 1:
                objArr[2] = "makeNullable";
                break;
            case 2:
                objArr[2] = "makeNotNullable";
                break;
            case 3:
                objArr[2] = "makeNullableAsSpecified";
                break;
            case 4:
            case 6:
            case 7:
            case 9:
            case 11:
            case 15:
            case 17:
            case 19:
            case 26:
            case 35:
            case 48:
            case 53:
            case 56:
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                break;
            case 5:
            case 8:
                objArr[2] = "makeNullableIfNeeded";
                break;
            case 10:
                objArr[2] = "canHaveSubtypes";
                break;
            case 12:
            case 13:
            case 14:
                objArr[2] = "makeUnsubstitutedType";
                break;
            case 16:
                objArr[2] = "getDefaultTypeProjections";
                break;
            case 18:
                objArr[2] = "getImmediateSupertypes";
                break;
            case 20:
            case 21:
            case 22:
                objArr[2] = "createSubstitutedSupertype";
                break;
            case 23:
            case 24:
                objArr[2] = "collectAllSupertypes";
                break;
            case 25:
                objArr[2] = "getAllSupertypes";
                break;
            case 27:
                objArr[2] = "isNullableType";
                break;
            case 28:
                objArr[2] = "acceptsNullable";
                break;
            case 29:
                objArr[2] = "hasNullableSuperType";
                break;
            case 30:
                objArr[2] = "getClassDescriptor";
                break;
            case BERTags.DATE /* 31 */:
            case 32:
                objArr[2] = "substituteParameters";
                break;
            case 33:
            case 34:
                objArr[2] = "substituteProjectionsForParameters";
                break;
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                objArr[2] = "equalTypes";
                break;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[2] = "dependsOnTypeParameters";
                break;
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                objArr[2] = "dependsOnTypeConstructors";
                break;
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                objArr[2] = "contains";
                break;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
                objArr[2] = "makeStarProjection";
                break;
            case 47:
            case 49:
                objArr[2] = "getDefaultPrimitiveNumberType";
                break;
            case 50:
                objArr[2] = "findByFqName";
                break;
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 55:
                objArr[2] = "getPrimitiveNumberType";
                break;
            case 60:
                objArr[2] = "isTypeParameter";
                break;
            case 61:
                objArr[2] = "isReifiedTypeParameter";
                break;
            case 62:
                objArr[2] = "isNonReifiedTypeParameter";
                break;
            case 63:
                objArr[2] = "getTypeParameterDescriptorOrNull";
                break;
            default:
                objArr[2] = "noExpectedType";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 4 && i15 != 9 && i15 != 11 && i15 != 15 && i15 != 17 && i15 != 19 && i15 != 26 && i15 != 35 && i15 != 48 && i15 != 53 && i15 != 6 && i15 != 7) {
            switch (i15) {
                case 56:
                case 57:
                case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static boolean b(t0 t0Var) {
        if (t0Var == null) {
            a(28);
        }
        if (t0Var.U0()) {
            return true;
        }
        return n0.b(t0Var) && b(n0.a(t0Var).c1());
    }

    public static boolean c(t0 t0Var, er.l<o2, Boolean> lVar) {
        if (lVar == null) {
            a(43);
        }
        return d(t0Var, lVar, null);
    }

    private static boolean d(t0 t0Var, er.l<o2, Boolean> lVar, cu.k<t0> kVar) {
        if (lVar == null) {
            a(44);
        }
        if (t0Var == null) {
            return false;
        }
        o2 o2VarW0 = t0Var.W0();
        if (w(t0Var)) {
            return lVar.b(o2VarW0).booleanValue();
        }
        if (kVar != null && kVar.contains(t0Var)) {
            return false;
        }
        if (lVar.b(o2VarW0).booleanValue()) {
            return true;
        }
        if (kVar == null) {
            kVar = cu.k.f();
        }
        kVar.add(t0Var);
        k0 k0Var = o2VarW0 instanceof k0 ? (k0) o2VarW0 : null;
        if (k0Var != null && (d(k0Var.b1(), lVar, kVar) || d(k0Var.c1(), lVar, kVar))) {
            return true;
        }
        if ((o2VarW0 instanceof z) && d(((z) o2VarW0).f1(), lVar, kVar)) {
            return true;
        }
        x1 x1VarT0 = t0Var.T0();
        if (x1VarT0 instanceof s0) {
            Iterator<t0> it = ((s0) x1VarT0).q().iterator();
            while (it.hasNext()) {
                if (d(it.next(), lVar, kVar)) {
                    return true;
                }
            }
            return false;
        }
        for (d2 d2Var : t0Var.R0()) {
            if (!d2Var.b() && d(d2Var.getType(), lVar, kVar)) {
                return true;
            }
        }
        return false;
    }

    public static t0 e(t0 t0Var, t0 t0Var2, i2 i2Var) {
        if (t0Var == null) {
            a(20);
        }
        if (t0Var2 == null) {
            a(21);
        }
        if (i2Var == null) {
            a(22);
        }
        t0 t0VarQ = i2Var.q(t0Var2, p2.INVARIANT);
        if (t0VarQ != null) {
            return q(t0VarQ, t0Var.U0());
        }
        return null;
    }

    public static vr.e f(t0 t0Var) {
        if (t0Var == null) {
            a(30);
        }
        vr.h hVarC = t0Var.T0().c();
        if (hVarC instanceof vr.e) {
            return (vr.e) hVarC;
        }
        return null;
    }

    public static List<d2> g(List<vr.m1> list) {
        if (list == null) {
            a(16);
        }
        ArrayList arrayList = new ArrayList(list.size());
        Iterator<vr.m1> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new f2(it.next().t()));
        }
        List<d2> listF1 = pq.v.f1(arrayList);
        if (listF1 == null) {
            a(17);
        }
        return listF1;
    }

    public static List<t0> h(t0 t0Var) {
        if (t0Var == null) {
            a(18);
        }
        i2 i2VarG = i2.g(t0Var);
        Collection<t0> collectionQ = t0Var.T0().q();
        ArrayList arrayList = new ArrayList(collectionQ.size());
        Iterator<t0> it = collectionQ.iterator();
        while (it.hasNext()) {
            t0 t0VarE = e(t0Var, it.next(), i2VarG);
            if (t0VarE != null) {
                arrayList.add(t0VarE);
            }
        }
        return arrayList;
    }

    public static vr.m1 i(t0 t0Var) {
        if (t0Var == null) {
            a(63);
        }
        if (t0Var.T0().c() instanceof vr.m1) {
            return (vr.m1) t0Var.T0().c();
        }
        return null;
    }

    public static boolean j(t0 t0Var) {
        if (t0Var == null) {
            a(29);
        }
        if (t0Var.T0().c() instanceof vr.e) {
            return false;
        }
        Iterator<t0> it = h(t0Var).iterator();
        while (it.hasNext()) {
            if (l(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static boolean k(t0 t0Var) {
        return t0Var != null && t0Var.T0() == f184075a.T0();
    }

    public static boolean l(t0 t0Var) {
        if (t0Var == null) {
            a(27);
        }
        if (t0Var.U0()) {
            return true;
        }
        if (n0.b(t0Var) && l(n0.a(t0Var).c1())) {
            return true;
        }
        if (i1.c(t0Var)) {
            return false;
        }
        if (m(t0Var)) {
            return j(t0Var);
        }
        if (t0Var instanceof e) {
            vr.m1 m1VarB = ((e) t0Var).c1().b();
            return m1VarB == null || j(m1VarB.t());
        }
        x1 x1VarT0 = t0Var.T0();
        if (x1VarT0 instanceof s0) {
            Iterator<t0> it = x1VarT0.q().iterator();
            while (it.hasNext()) {
                if (l(it.next())) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean m(t0 t0Var) {
        if (t0Var == null) {
            a(60);
        }
        return i(t0Var) != null || (t0Var.T0() instanceof tt.r);
    }

    public static t0 n(t0 t0Var) {
        if (t0Var == null) {
            a(2);
        }
        return p(t0Var, false);
    }

    public static t0 o(t0 t0Var) {
        if (t0Var == null) {
            a(1);
        }
        return p(t0Var, true);
    }

    public static t0 p(t0 t0Var, boolean z15) {
        if (t0Var == null) {
            a(3);
        }
        o2 o2VarX0 = t0Var.W0().X0(z15);
        if (o2VarX0 == null) {
            a(4);
        }
        return o2VarX0;
    }

    public static t0 q(t0 t0Var, boolean z15) {
        if (t0Var == null) {
            a(8);
        }
        if (z15) {
            return o(t0Var);
        }
        if (t0Var == null) {
            a(9);
        }
        return t0Var;
    }

    public static e1 r(e1 e1Var, boolean z15) {
        if (e1Var == null) {
            a(5);
        }
        if (!z15) {
            if (e1Var == null) {
                a(7);
            }
            return e1Var;
        }
        e1 e1VarX0 = e1Var.X0(true);
        if (e1VarX0 == null) {
            a(6);
        }
        return e1VarX0;
    }

    public static d2 s(vr.m1 m1Var) {
        if (m1Var == null) {
            a(45);
        }
        return new l1(m1Var);
    }

    public static d2 t(vr.m1 m1Var, i0 i0Var) {
        if (m1Var == null) {
            a(46);
        }
        return i0Var.b() == k2.SUPERTYPE ? new f2(m1.b(m1Var)) : new l1(m1Var);
    }

    public static e1 u(x1 x1Var, lt.k kVar, er.l<tt.g, e1> lVar) {
        if (x1Var == null) {
            a(12);
        }
        if (kVar == null) {
            a(13);
        }
        if (lVar == null) {
            a(14);
        }
        e1 e1VarN = w0.n(t1.f184126b.k(), x1Var, g(x1Var.getParameters()), false, kVar, lVar);
        if (e1VarN == null) {
            a(15);
        }
        return e1VarN;
    }

    public static e1 v(vr.h hVar, lt.k kVar, er.l<tt.g, e1> lVar) {
        if (!ut.l.m(hVar)) {
            return u(hVar.o(), kVar, lVar);
        }
        ut.i iVarD = ut.l.d(ut.k.G, hVar.toString());
        if (iVarD == null) {
            a(11);
        }
        return iVarD;
    }

    public static boolean w(t0 t0Var) {
        if (t0Var == null) {
            a(0);
        }
        return t0Var == f184077c || t0Var == f184078d;
    }
}
