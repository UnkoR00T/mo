package st;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;

/* JADX INFO: loaded from: classes4.dex */
public class i2 implements wt.r {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i2 f184051b = h(g2.f184039b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g2 f184052a;

    static class a implements er.l<zs.c, Boolean> {
        a() {
        }

        private static /* synthetic */ void c(int i15) {
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "name", "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1", "invoke"));
        }

        @Override // er.l
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public Boolean b(zs.c cVar) {
            if (cVar == null) {
                c(0);
            }
            return Boolean.valueOf(!cVar.equals(sr.p.a.Q));
        }
    }

    static /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f184053a;

        static {
            int[] iArr = new int[d.values().length];
            f184053a = iArr;
            try {
                iArr[d.OUT_IN_IN_POSITION.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f184053a[d.IN_IN_OUT_POSITION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f184053a[d.NO_CONFLICT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private static final class c extends Exception {
        public c(String str) {
            super(str);
        }
    }

    private enum d {
        NO_CONFLICT,
        IN_IN_OUT_POSITION,
        OUT_IN_IN_POSITION
    }

    protected i2(g2 g2Var) {
        if (g2Var == null) {
            a(7);
        }
        this.f184052a = g2Var;
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0021 A[FALL_THROUGH] */
    /* JADX WARN: Code duplicated, block: B:56:0x00b8  */
    private static /* synthetic */ void a(int i15) {
        String str;
        int i16;
        if (i15 != 1 && i15 != 2 && i15 != 8 && i15 != 34 && i15 != 37) {
            switch (i15) {
                default:
                    switch (i15) {
                        default:
                            switch (i15) {
                                default:
                                    switch (i15) {
                                        case 40:
                                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                        case EACTags.CURRENCY_CODE /* 42 */:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 29:
                                case 30:
                                case BERTags.DATE /* 31 */:
                                case 32:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 11:
                case 12:
                case 13:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 1 && i15 != 2 && i15 != 8 && i15 != 34 && i15 != 37) {
            switch (i15) {
                case 11:
                case 12:
                case 13:
                    i16 = 2;
                    break;
                default:
                    switch (i15) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            i16 = 2;
                            break;
                        default:
                            switch (i15) {
                                case 29:
                                case 30:
                                case BERTags.DATE /* 31 */:
                                case 32:
                                    i16 = 2;
                                    break;
                                default:
                                    switch (i15) {
                                        case 40:
                                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                        case EACTags.CURRENCY_CODE /* 42 */:
                                            i16 = 2;
                                            break;
                                        default:
                                            i16 = 3;
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            i16 = 2;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 34:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                break;
            case 3:
                objArr[0] = "first";
                break;
            case 4:
                objArr[0] = "second";
                break;
            case 5:
                objArr[0] = "substitutionContext";
                break;
            case 6:
                objArr[0] = "context";
                break;
            case 7:
            default:
                objArr[0] = "substitution";
                break;
            case 9:
            case 14:
                objArr[0] = "type";
                break;
            case 10:
            case 15:
                objArr[0] = "howThisTypeIsUsed";
                break;
            case 16:
            case 17:
            case 36:
                objArr[0] = "typeProjection";
                break;
            case 18:
            case 28:
                objArr[0] = "originalProjection";
                break;
            case 26:
                objArr[0] = "originalType";
                break;
            case 27:
                objArr[0] = "substituted";
                break;
            case 33:
                objArr[0] = "annotations";
                break;
            case 35:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                objArr[0] = "typeParameterVariance";
                break;
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[0] = "projectionKind";
                break;
        }
        if (i15 == 1) {
            objArr[1] = "replaceWithNonApproximatingSubstitution";
        } else if (i15 == 2) {
            objArr[1] = "replaceWithContravariantApproximatingSubstitution";
        } else if (i15 == 8) {
            objArr[1] = "getSubstitution";
        } else if (i15 == 34) {
            objArr[1] = "filterOutUnsafeVariance";
        } else if (i15 != 37) {
            switch (i15) {
                case 11:
                case 12:
                case 13:
                    objArr[1] = "safeSubstitute";
                    break;
                default:
                    switch (i15) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            objArr[1] = "unsafeSubstitute";
                            break;
                        default:
                            switch (i15) {
                                case 29:
                                case 30:
                                case BERTags.DATE /* 31 */:
                                case 32:
                                    objArr[1] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                                    break;
                                default:
                                    switch (i15) {
                                        case 40:
                                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                        case EACTags.CURRENCY_CODE /* 42 */:
                                            objArr[1] = "combine";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "combine";
        }
        switch (i15) {
            case 1:
            case 2:
            case 8:
            case 11:
            case 12:
            case 13:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 29:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 34:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
                break;
            case 3:
            case 4:
                objArr[2] = "createChainedSubstitutor";
                break;
            case 5:
            case 6:
            default:
                objArr[2] = "create";
                break;
            case 7:
                objArr[2] = "<init>";
                break;
            case 9:
            case 10:
                objArr[2] = "safeSubstitute";
                break;
            case 14:
            case 15:
            case 16:
                objArr[2] = "substitute";
                break;
            case 17:
                objArr[2] = "substituteWithoutApproximation";
                break;
            case 18:
                objArr[2] = "unsafeSubstitute";
                break;
            case 26:
            case 27:
            case 28:
                objArr[2] = "projectedTypeForConflictedTypeWithUnsafeVariance";
                break;
            case 33:
                objArr[2] = "filterOutUnsafeVariance";
                break;
            case 35:
            case 36:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[2] = "combine";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 1 && i15 != 2 && i15 != 8 && i15 != 34 && i15 != 37) {
            switch (i15) {
                case 11:
                case 12:
                case 13:
                    break;
                default:
                    switch (i15) {
                        case 19:
                        case 20:
                        case 21:
                        case 22:
                        case 23:
                        case 24:
                        case 25:
                            break;
                        default:
                            switch (i15) {
                                case 29:
                                case 30:
                                case BERTags.DATE /* 31 */:
                                case 32:
                                    break;
                                default:
                                    switch (i15) {
                                        case 40:
                                        case EACTags.INTERCHANGE_PROFILE /* 41 */:
                                        case EACTags.CURRENCY_CODE /* 42 */:
                                            break;
                                        default:
                                            throw new IllegalArgumentException(str2);
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        }
        throw new IllegalStateException(str2);
    }

    private static void b(int i15, d2 d2Var, g2 g2Var) {
        if (i15 <= 100) {
            return;
        }
        throw new IllegalStateException("Recursion too deep. Most likely infinite loop while substituting " + p(d2Var) + "; substitution: " + p(g2Var));
    }

    public static p2 c(p2 p2Var, d2 d2Var) {
        if (p2Var == null) {
            a(35);
        }
        if (d2Var == null) {
            a(36);
        }
        if (!d2Var.b()) {
            return d(p2Var, d2Var.c());
        }
        p2 p2Var2 = p2.OUT_VARIANCE;
        if (p2Var2 == null) {
            a(37);
        }
        return p2Var2;
    }

    public static p2 d(p2 p2Var, p2 p2Var2) {
        if (p2Var == null) {
            a(38);
        }
        if (p2Var2 == null) {
            a(39);
        }
        p2 p2Var3 = p2.INVARIANT;
        if (p2Var == p2Var3) {
            if (p2Var2 == null) {
                a(40);
            }
            return p2Var2;
        }
        if (p2Var2 == p2Var3) {
            if (p2Var == null) {
                a(41);
            }
            return p2Var;
        }
        if (p2Var == p2Var2) {
            if (p2Var2 == null) {
                a(42);
            }
            return p2Var2;
        }
        throw new AssertionError("Variance conflict: type parameter variance '" + p2Var + "' and projection kind '" + p2Var2 + "' cannot be combined");
    }

    private static d e(p2 p2Var, p2 p2Var2) {
        p2 p2Var3 = p2.IN_VARIANCE;
        if (p2Var == p2Var3 && p2Var2 == p2.OUT_VARIANCE) {
            return d.OUT_IN_IN_POSITION;
        }
        return (p2Var == p2.OUT_VARIANCE && p2Var2 == p2Var3) ? d.IN_IN_OUT_POSITION : d.NO_CONFLICT;
    }

    public static i2 f(Map<x1, d2> map) {
        if (map == null) {
            a(5);
        }
        return h(y1.j(map));
    }

    public static i2 g(t0 t0Var) {
        if (t0Var == null) {
            a(6);
        }
        return h(y1.i(t0Var.T0(), t0Var.R0()));
    }

    public static i2 h(g2 g2Var) {
        if (g2Var == null) {
            a(0);
        }
        return new i2(g2Var);
    }

    public static i2 i(g2 g2Var, g2 g2Var2) {
        if (g2Var == null) {
            a(3);
        }
        if (g2Var2 == null) {
            a(4);
        }
        return h(e0.i(g2Var, g2Var2));
    }

    private static wr.h j(wr.h hVar) {
        if (hVar == null) {
            a(33);
        }
        return !hVar.d2(sr.p.a.Q) ? hVar : new wr.p(hVar, new a());
    }

    private static d2 m(t0 t0Var, d2 d2Var, vr.m1 m1Var, d2 d2Var2) {
        if (t0Var == null) {
            a(26);
        }
        if (d2Var == null) {
            a(27);
        }
        if (d2Var2 == null) {
            a(28);
        }
        if (!t0Var.getAnnotations().d2(sr.p.a.Q)) {
            if (d2Var == null) {
                a(29);
            }
            return d2Var;
        }
        x1 x1VarT0 = d2Var.getType().T0();
        if (!(x1VarT0 instanceof tt.n)) {
            return d2Var;
        }
        d2 d2VarV = ((tt.n) x1VarT0).v();
        p2 p2VarC = d2VarV.c();
        d dVarE = e(d2Var2.c(), p2VarC);
        d dVar = d.OUT_IN_IN_POSITION;
        if (dVarE == dVar) {
            return new f2(d2VarV.getType());
        }
        return (m1Var != null && e(m1Var.q(), p2VarC) == dVar) ? new f2(d2VarV.getType()) : d2Var;
    }

    private static String p(Object obj) {
        try {
            return obj.toString();
        } catch (Throwable th4) {
            if (cu.c.a(th4)) {
                throw th4;
            }
            return "[Exception while computing toString(): " + th4 + "]";
        }
    }

    private d2 s(d2 d2Var, int i15) {
        t0 type = d2Var.getType();
        p2 p2VarC = d2Var.c();
        if (type.T0().c() instanceof vr.m1) {
            return d2Var;
        }
        e1 e1VarB = i1.b(type);
        t0 t0VarQ = e1VarB != null ? n().q(e1VarB, p2.INVARIANT) : null;
        t0 t0VarB = h2.b(type, t(type.T0().getParameters(), type.R0(), i15), this.f184052a.d(type.getAnnotations()));
        if ((t0VarB instanceof e1) && (t0VarQ instanceof e1)) {
            t0VarB = i1.j((e1) t0VarB, (e1) t0VarQ);
        }
        return new f2(p2VarC, t0VarB);
    }

    private List<d2> t(List<vr.m1> list, List<d2> list2, int i15) throws c {
        ArrayList arrayList = new ArrayList(list.size());
        boolean z15 = false;
        for (int i16 = 0; i16 < list.size(); i16++) {
            vr.m1 m1Var = list.get(i16);
            d2 d2Var = list2.get(i16);
            d2 d2VarV = v(d2Var, m1Var, i15 + 1);
            int i17 = b.f184053a[e(m1Var.q(), d2VarV.c()).ordinal()];
            if (i17 == 1 || i17 == 2) {
                d2VarV = l2.s(m1Var);
            } else if (i17 == 3) {
                p2 p2VarQ = m1Var.q();
                p2 p2Var = p2.INVARIANT;
                if (p2VarQ != p2Var && !d2VarV.b()) {
                    d2VarV = new f2(p2Var, d2VarV.getType());
                }
            }
            if (d2VarV != d2Var) {
                z15 = true;
            }
            arrayList.add(d2VarV);
        }
        return !z15 ? list2 : arrayList;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private d2 v(d2 d2Var, vr.m1 m1Var, int i15) throws c {
        if (d2Var == null) {
            a(18);
        }
        b(i15, d2Var, this.f184052a);
        if (!d2Var.b()) {
            t0 type = d2Var.getType();
            if (type instanceof m2) {
                m2 m2Var = (m2) type;
                o2 o2VarK0 = m2Var.K0();
                t0 t0VarM0 = m2Var.m0();
                d2 d2VarV = v(new f2(d2Var.c(), o2VarK0), m1Var, i15 + 1);
                return d2VarV.b() ? d2VarV : new f2(d2VarV.c(), n2.d(d2VarV.getType().W0(), q(t0VarM0, d2Var.c())));
            }
            if (!g0.a(type) && !(type.W0() instanceof d1)) {
                d2 d2VarE = this.f184052a.e(type);
                d2 d2VarM = d2VarE != null ? m(type, d2VarE, m1Var, d2Var) : null;
                p2 p2VarC = d2Var.c();
                if (d2VarM == null && n0.b(type) && !v1.b(type)) {
                    k0 k0VarA = n0.a(type);
                    int i16 = i15 + 1;
                    d2 d2VarV2 = v(new f2(p2VarC, k0VarA.b1()), m1Var, i16);
                    d2 d2VarV3 = v(new f2(p2VarC, k0VarA.c1()), m1Var, i16);
                    p2 p2VarC2 = d2VarV2.c();
                    if (d2VarV2.getType() != k0VarA.b1() || d2VarV3.getType() != k0VarA.c1()) {
                        return new f2(p2VarC2, w0.e(h2.a(d2VarV2.getType()), h2.a(d2VarV3.getType())));
                    }
                } else if (!sr.j.o0(type) && !x0.a(type)) {
                    if (d2VarM != null) {
                        d dVarE = e(p2VarC, d2VarM.c());
                        if (!et.e.f(type)) {
                            int i17 = b.f184053a[dVarE.ordinal()];
                            if (i17 == 1) {
                                throw new c("Out-projection in in-position");
                            }
                            if (i17 == 2) {
                                return new f2(p2.OUT_VARIANCE, type.T0().i().J());
                            }
                        }
                        x xVarA = v1.a(type);
                        if (d2VarM.b()) {
                            return d2VarM;
                        }
                        t0 t0VarM1 = xVarA != null ? xVarA.M0(d2VarM.getType()) : l2.q(d2VarM.getType(), type.U0());
                        if (!type.getAnnotations().isEmpty()) {
                            t0VarM1 = xt.d.C(t0VarM1, new wr.o(t0VarM1.getAnnotations(), j(this.f184052a.d(type.getAnnotations()))));
                        }
                        if (dVarE == d.NO_CONFLICT) {
                            p2VarC = d(p2VarC, d2VarM.c());
                        }
                        return new f2(p2VarC, t0VarM1);
                    }
                    d2Var = s(d2Var, i15);
                    if (d2Var == null) {
                        a(25);
                    }
                }
            }
        }
        return d2Var;
    }

    public g2 k() {
        g2 g2Var = this.f184052a;
        if (g2Var == null) {
            a(8);
        }
        return g2Var;
    }

    public boolean l() {
        return this.f184052a.f();
    }

    public i2 n() {
        g2 g2Var = this.f184052a;
        return ((g2Var instanceof o0) && g2Var.b()) ? new i2(new o0(((o0) this.f184052a).j(), ((o0) this.f184052a).i(), false)) : this;
    }

    public t0 o(t0 t0Var, p2 p2Var) {
        if (t0Var == null) {
            a(9);
        }
        if (p2Var == null) {
            a(10);
        }
        if (l()) {
            if (t0Var == null) {
                a(11);
            }
            return t0Var;
        }
        try {
            t0 type = v(new f2(p2Var, t0Var), null, 0).getType();
            if (type == null) {
                a(12);
            }
            return type;
        } catch (c e15) {
            ut.i iVarD = ut.l.d(ut.k.G, e15.getMessage());
            if (iVarD == null) {
                a(13);
            }
            return iVarD;
        }
    }

    public t0 q(t0 t0Var, p2 p2Var) {
        if (t0Var == null) {
            a(14);
        }
        if (p2Var == null) {
            a(15);
        }
        d2 d2VarR = r(new f2(p2Var, k().g(t0Var, p2Var)));
        if (d2VarR == null) {
            return null;
        }
        return d2VarR.getType();
    }

    public d2 r(d2 d2Var) {
        if (d2Var == null) {
            a(16);
        }
        d2 d2VarU = u(d2Var);
        return (this.f184052a.a() || this.f184052a.b()) ? yt.c.d(d2VarU, this.f184052a.b()) : d2VarU;
    }

    public d2 u(d2 d2Var) {
        if (d2Var == null) {
            a(17);
        }
        if (l()) {
            return d2Var;
        }
        try {
            return v(d2Var, null, 0);
        } catch (c unused) {
            return null;
        }
    }
}
