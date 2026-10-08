package dt;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.ServiceLoader;
import java.util.Set;
import oq.i0;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import st.n0;
import st.t0;
import st.w1;
import st.x0;
import st.x1;
import vr.c1;
import vr.e0;
import vr.f0;
import vr.m1;
import vr.t1;
import vr.y0;
import vr.z;
import vr.z0;
import yr.j0;
import yr.k0;

/* JADX INFO: loaded from: classes4.dex */
public class o {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final List<j> f44493e = pq.v.f1(ServiceLoader.load(j.class, j.class.getClassLoader()));

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final o f44494f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final tt.e.a f44495g;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final tt.g f44496a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final tt.f f44497b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final tt.e.a f44498c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final er.p<t0, t0, Boolean> f44499d;

    static class a implements tt.e.a {
        a() {
        }

        private static /* synthetic */ void b(int i15) {
            Object[] objArr = new Object[3];
            if (i15 != 1) {
                objArr[0] = "a";
            } else {
                objArr[0] = "b";
            }
            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
            objArr[2] = "equals";
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
        }

        @Override // tt.e.a
        public boolean a(x1 x1Var, x1 x1Var2) {
            if (x1Var == null) {
                b(0);
            }
            if (x1Var2 == null) {
                b(1);
            }
            return x1Var.equals(x1Var2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [D] */
    static class b<D> implements er.p<D, D, oq.r<vr.a, vr.a>> {
        b() {
        }

        /* JADX WARN: Incorrect types in method signature: (TD;TD;)Loq/r<Lvr/a;Lvr/a;>; */
        @Override // er.p
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public oq.r B(vr.a aVar, vr.a aVar2) {
            return new oq.r(aVar, aVar2);
        }
    }

    static class c implements er.l<vr.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vr.m f44500a;

        c(vr.m mVar) {
            this.f44500a = mVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean b(vr.b bVar) {
            return Boolean.valueOf(bVar.b() == this.f44500a);
        }
    }

    static class d implements er.l<vr.b, vr.a> {
        d() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public vr.b b(vr.b bVar) {
            return bVar;
        }
    }

    static class e implements er.l<vr.b, Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ vr.e f44501a;

        e(vr.e eVar) {
            this.f44501a = eVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean b(vr.b bVar) {
            boolean z15 = false;
            if (!vr.t.g(bVar.h()) && vr.t.h(bVar, this.f44501a, false)) {
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }
    }

    static class f implements er.l<vr.b, vr.a> {
        f() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public vr.a b(vr.b bVar) {
            return bVar;
        }
    }

    static class g implements er.l<vr.b, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n f44502a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ vr.b f44503b;

        g(n nVar, vr.b bVar) {
            this.f44502a = nVar;
            this.f44503b = bVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public i0 b(vr.b bVar) {
            this.f44502a.b(this.f44503b, bVar);
            return i0.f148189a;
        }
    }

    static /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44504a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f44505b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        static final /* synthetic */ int[] f44506c;

        static {
            int[] iArr = new int[f0.values().length];
            f44506c = iArr;
            try {
                iArr[f0.FINAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44506c[f0.SEALED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f44506c[f0.OPEN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f44506c[f0.ABSTRACT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[i.a.values().length];
            f44505b = iArr2;
            try {
                iArr2[i.a.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f44505b[i.a.CONFLICT.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f44505b[i.a.INCOMPATIBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[j.b.values().length];
            f44504a = iArr3;
            try {
                iArr3[j.b.OVERRIDABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f44504a[j.b.INCOMPATIBLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f44504a[j.b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    public static class i {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final i f44507c = new i(a.OVERRIDABLE, "SUCCESS");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final a f44508a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f44509b;

        public enum a {
            OVERRIDABLE,
            INCOMPATIBLE,
            CONFLICT
        }

        public i(a aVar, String str) {
            if (aVar == null) {
                a(3);
            }
            if (str == null) {
                a(4);
            }
            this.f44508a = aVar;
            this.f44509b = str;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0031  */
        private static /* synthetic */ void a(int i15) {
            String str = (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
            Object[] objArr = new Object[(i15 == 1 || i15 == 2 || i15 == 3 || i15 == 4) ? 3 : 2];
            if (i15 == 1 || i15 == 2) {
                objArr[0] = "debugMessage";
            } else if (i15 == 3) {
                objArr[0] = "success";
            } else if (i15 != 4) {
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
            } else {
                objArr[0] = "debugMessage";
            }
            switch (i15) {
                case 1:
                case 2:
                case 3:
                case 4:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$OverrideCompatibilityInfo";
                    break;
                case 5:
                    objArr[1] = "getResult";
                    break;
                case 6:
                    objArr[1] = "getDebugMessage";
                    break;
                default:
                    objArr[1] = "success";
                    break;
            }
            if (i15 == 1) {
                objArr[2] = "incompatible";
            } else if (i15 == 2) {
                objArr[2] = "conflict";
            } else if (i15 == 3 || i15 == 4) {
                objArr[2] = "<init>";
            }
            String str2 = String.format(str, objArr);
            if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 4) {
                throw new IllegalStateException(str2);
            }
            throw new IllegalArgumentException(str2);
        }

        public static i b(String str) {
            if (str == null) {
                a(2);
            }
            return new i(a.CONFLICT, str);
        }

        public static i d(String str) {
            if (str == null) {
                a(1);
            }
            return new i(a.INCOMPATIBLE, str);
        }

        public static i e() {
            i iVar = f44507c;
            if (iVar == null) {
                a(0);
            }
            return iVar;
        }

        public a c() {
            a aVar = this.f44508a;
            if (aVar == null) {
                a(5);
            }
            return aVar;
        }

        public String toString() {
            return this.f44508a + ": " + this.f44509b;
        }
    }

    static {
        a aVar = new a();
        f44495g = aVar;
        f44494f = new o(aVar, tt.g.a.f192119a, tt.f.a.f192118a, null);
    }

    private o(tt.e.a aVar, tt.g gVar, tt.f fVar, er.p<t0, t0, Boolean> pVar) {
        if (aVar == null) {
            a(5);
        }
        if (gVar == null) {
            a(6);
        }
        if (fVar == null) {
            a(7);
        }
        this.f44498c = aVar;
        this.f44496a = gVar;
        this.f44497b = fVar;
        this.f44499d = pVar;
    }

    private static boolean A(y0 y0Var, y0 y0Var2) {
        if (y0Var == null || y0Var2 == null) {
            return true;
        }
        return H(y0Var, y0Var2);
    }

    public static boolean B(vr.a aVar, vr.a aVar2) {
        if (aVar == null) {
            a(65);
        }
        if (aVar2 == null) {
            a(66);
        }
        t0 t0VarF = aVar.f();
        t0 t0VarF2 = aVar2.f();
        if (!H(aVar, aVar2)) {
            return false;
        }
        w1 w1VarL = f44494f.l(aVar.getTypeParameters(), aVar2.getTypeParameters());
        if (aVar instanceof z) {
            return G(aVar, t0VarF, aVar2, t0VarF2, w1VarL);
        }
        if (!(aVar instanceof z0)) {
            throw new IllegalArgumentException("Unexpected callable: " + aVar.getClass());
        }
        z0 z0Var = (z0) aVar;
        z0 z0Var2 = (z0) aVar2;
        if (!A(z0Var.j(), z0Var2.j())) {
            return false;
        }
        if (z0Var.Q() && z0Var2.Q()) {
            return st.h.f184041a.m(w1VarL, t0VarF.W0(), t0VarF2.W0());
        }
        return (z0Var.Q() || !z0Var2.Q()) && G(aVar, t0VarF, aVar2, t0VarF2, w1VarL);
    }

    private static boolean C(vr.a aVar, Collection<vr.a> collection) {
        if (aVar == null) {
            a(69);
        }
        if (collection == null) {
            a(70);
        }
        Iterator<vr.a> it = collection.iterator();
        while (it.hasNext()) {
            if (!B(aVar, it.next())) {
                return false;
            }
        }
        return true;
    }

    private static boolean G(vr.a aVar, t0 t0Var, vr.a aVar2, t0 t0Var2, w1 w1Var) {
        if (aVar == null) {
            a(71);
        }
        if (t0Var == null) {
            a(72);
        }
        if (aVar2 == null) {
            a(73);
        }
        if (t0Var2 == null) {
            a(74);
        }
        if (w1Var == null) {
            a(75);
        }
        return st.h.f184041a.u(w1Var, t0Var.W0(), t0Var2.W0());
    }

    private static boolean H(vr.q qVar, vr.q qVar2) {
        if (qVar == null) {
            a(67);
        }
        if (qVar2 == null) {
            a(68);
        }
        Integer numD = vr.t.d(qVar.h(), qVar2.h());
        return numD == null || numD.intValue() >= 0;
    }

    public static boolean I(e0 e0Var, e0 e0Var2, boolean z15) {
        if (e0Var == null) {
            a(55);
        }
        if (e0Var2 == null) {
            a(56);
        }
        return !vr.t.g(e0Var2.h()) && vr.t.h(e0Var2, e0Var, z15);
    }

    public static <D extends vr.a> boolean J(D d15, D d16, boolean z15, boolean z16) {
        if (d15 == null) {
            a(13);
        }
        if (d16 == null) {
            a(14);
        }
        if (!d15.equals(d16) && dt.g.f44479a.k(d15.Q0(), d16.Q0(), z15, z16)) {
            return true;
        }
        vr.a aVarA = d16.Q0();
        Iterator it = dt.i.d(d15).iterator();
        while (it.hasNext()) {
            if (dt.g.f44479a.k(aVarA, (vr.a) it.next(), z15, z16)) {
                return true;
            }
        }
        return false;
    }

    public static void K(vr.b bVar, er.l<vr.b, i0> lVar) {
        vr.u uVar;
        if (bVar == null) {
            a(105);
        }
        for (vr.b bVar2 : bVar.e()) {
            if (bVar2.h() == vr.t.f208082g) {
                K(bVar2, lVar);
            }
        }
        if (bVar.h() != vr.t.f208082g) {
            return;
        }
        vr.u uVarH = h(bVar);
        if (uVarH == null) {
            if (lVar != null) {
                lVar.b(bVar);
            }
            uVar = vr.t.f208080e;
        } else {
            uVar = uVarH;
        }
        if (bVar instanceof k0) {
            ((k0) bVar).i1(uVar);
            Iterator<y0> it = ((z0) bVar).A().iterator();
            while (it.hasNext()) {
                K(it.next(), uVarH == null ? null : lVar);
            }
            return;
        }
        if (bVar instanceof yr.s) {
            ((yr.s) bVar).p1(uVar);
            return;
        }
        j0 j0Var = (j0) bVar;
        j0Var.U0(uVar);
        if (uVar != j0Var.Z().h()) {
            j0Var.S0(false);
        }
    }

    public static <H> H L(Collection<H> collection, er.l<H, vr.a> lVar) {
        H h15;
        if (collection == null) {
            a(76);
        }
        if (lVar == null) {
            a(77);
        }
        if (collection.size() == 1) {
            H h16 = (H) pq.v.k0(collection);
            if (h16 == null) {
                a(78);
            }
            return h16;
        }
        ArrayList arrayList = new ArrayList(2);
        List listA0 = pq.v.A0(collection, lVar);
        H h17 = (H) pq.v.k0(collection);
        vr.a aVarB = lVar.b(h17);
        for (H h18 : collection) {
            vr.a aVarB2 = lVar.b(h18);
            if (C(aVarB2, listA0)) {
                arrayList.add(h18);
            }
            if (B(aVarB2, aVarB) && !B(aVarB, aVarB2)) {
                h17 = h18;
            }
        }
        if (arrayList.isEmpty()) {
            if (h17 == null) {
                a(79);
            }
            return h17;
        }
        if (arrayList.size() == 1) {
            H h19 = (H) pq.v.k0(arrayList);
            if (h19 == null) {
                a(80);
            }
            return h19;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                h15 = null;
                break;
            }
            h15 = (H) it.next();
        } while (n0.b(lVar.b(h15).f()));
        if (h15 != null) {
            return h15;
        }
        H h25 = (H) pq.v.k0(arrayList);
        if (h25 == null) {
            a(82);
        }
        return h25;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035 A[FALL_THROUGH] */
    private static /* synthetic */ void a(int i15) {
        String str;
        int i16;
        if (i15 != 11 && i15 != 12 && i15 != 16 && i15 != 21 && i15 != 93 && i15 != 96 && i15 != 101 && i15 != 42 && i15 != 43) {
            switch (i15) {
                default:
                    switch (i15) {
                        default:
                            switch (i15) {
                                default:
                                    switch (i15) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            break;
                                        default:
                                            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                                            break;
                                    }
                                case 78:
                                case 79:
                                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                                case EACTags.ANSWER_TO_RESET /* 81 */:
                                case EACTags.HISTORICAL_BYTES /* 82 */:
                                    str = "@NotNull method %s.%s must not return null";
                                    break;
                            }
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            str = "@NotNull method %s.%s must not return null";
                            break;
                    }
                case 24:
                case 25:
                case 26:
                case 27:
                    str = "@NotNull method %s.%s must not return null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 11 && i15 != 12 && i15 != 16 && i15 != 21 && i15 != 93 && i15 != 96 && i15 != 101 && i15 != 42 && i15 != 43) {
            switch (i15) {
                case 24:
                case 25:
                case 26:
                case 27:
                    i16 = 2;
                    break;
                default:
                    switch (i15) {
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            i16 = 2;
                            break;
                        default:
                            switch (i15) {
                                case 78:
                                case 79:
                                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                                case EACTags.ANSWER_TO_RESET /* 81 */:
                                case EACTags.HISTORICAL_BYTES /* 82 */:
                                    i16 = 2;
                                    break;
                                default:
                                    switch (i15) {
                                        case 88:
                                        case 89:
                                        case 90:
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
            case 7:
                objArr[0] = "kotlinTypePreparator";
                break;
            case 2:
                objArr[0] = "customSubtype";
                break;
            case 3:
            case 6:
            default:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 4:
                objArr[0] = "equalityAxioms";
                break;
            case 5:
                objArr[0] = "axioms";
                break;
            case 8:
            case 9:
                objArr[0] = "candidateSet";
                break;
            case 10:
                objArr[0] = "transformFirst";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 78:
            case 79:
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                break;
            case 13:
                objArr[0] = "f";
                break;
            case 14:
                objArr[0] = "g";
                break;
            case 15:
            case 17:
                objArr[0] = "descriptor";
                break;
            case 18:
                objArr[0] = "result";
                break;
            case 19:
            case 22:
            case 28:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
                objArr[0] = "superDescriptor";
                break;
            case 20:
            case 23:
            case 29:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[0] = "subDescriptor";
                break;
            case 40:
                objArr[0] = "firstParameters";
                break;
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                objArr[0] = "secondParameters";
                break;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
                objArr[0] = "typeInSuper";
                break;
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
                objArr[0] = "typeInSub";
                break;
            case 46:
            case 49:
            case EACTags.DEPRECATED /* 75 */:
                objArr[0] = "typeCheckerState";
                break;
            case 47:
                objArr[0] = "superTypeParameter";
                break;
            case 48:
                objArr[0] = "subTypeParameter";
                break;
            case 50:
                objArr[0] = "name";
                break;
            case EACTags.TRANSACTION_DATE /* 51 */:
                objArr[0] = "membersFromSupertypes";
                break;
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
                objArr[0] = "membersFromCurrent";
                break;
            case 53:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 62:
            case 84:
            case 87:
            case 94:
                objArr[0] = "current";
                break;
            case EACTags.CURRENCY_EXPONENT /* 54 */:
            case 60:
            case 64:
            case 85:
            case 104:
                objArr[0] = "strategy";
                break;
            case 55:
                objArr[0] = "overriding";
                break;
            case 56:
                objArr[0] = "fromSuper";
                break;
            case 57:
                objArr[0] = "fromCurrent";
                break;
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
                objArr[0] = "descriptorsFromSuper";
                break;
            case 61:
            case 63:
                objArr[0] = "notOverridden";
                break;
            case 65:
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.MESSAGE_REFERENCE /* 71 */:
                objArr[0] = "a";
                break;
            case 66:
            case EACTags.APPLICATION_IMAGE /* 68 */:
            case 73:
                objArr[0] = "b";
                break;
            case EACTags.DISPLAY_IMAGE /* 69 */:
                objArr[0] = "candidate";
                break;
            case 70:
            case 86:
            case 91:
            case 107:
                objArr[0] = "descriptors";
                break;
            case 72:
                objArr[0] = "aReturnType";
                break;
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
                objArr[0] = "bReturnType";
                break;
            case 76:
            case 83:
                objArr[0] = "overridables";
                break;
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
            case 99:
                objArr[0] = "descriptorByHandle";
                break;
            case 92:
                objArr[0] = "classModality";
                break;
            case 95:
                objArr[0] = "toFilter";
                break;
            case 97:
            case 102:
                objArr[0] = "overrider";
                break;
            case 98:
            case 103:
                objArr[0] = "extractFrom";
                break;
            case 100:
                objArr[0] = "onConflict";
                break;
            case 105:
            case 106:
                objArr[0] = "memberDescriptor";
                break;
        }
        if (i15 == 11 || i15 == 12) {
            objArr[1] = "filterOverrides";
        } else if (i15 == 16) {
            objArr[1] = "getOverriddenDeclarations";
        } else if (i15 == 21) {
            objArr[1] = "isOverridableBy";
        } else if (i15 == 93) {
            objArr[1] = "getMinimalModality";
        } else if (i15 == 96) {
            objArr[1] = "filterVisibleFakeOverrides";
        } else if (i15 == 101) {
            objArr[1] = "extractMembersOverridableInBothWays";
        } else if (i15 != 42 && i15 != 43) {
            switch (i15) {
                case 24:
                case 25:
                case 26:
                case 27:
                    objArr[1] = "isOverridableBy";
                    break;
                default:
                    switch (i15) {
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            objArr[1] = "isOverridableByWithoutExternalConditions";
                            break;
                        default:
                            switch (i15) {
                                case 78:
                                case 79:
                                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                                case EACTags.ANSWER_TO_RESET /* 81 */:
                                case EACTags.HISTORICAL_BYTES /* 82 */:
                                    objArr[1] = "selectMostSpecificMember";
                                    break;
                                default:
                                    switch (i15) {
                                        case 88:
                                        case 89:
                                        case 90:
                                            objArr[1] = "determineModalityForFakeOverride";
                                            break;
                                        default:
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil";
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                    break;
            }
        } else {
            objArr[1] = "createTypeCheckerState";
        }
        switch (i15) {
            case 1:
            case 2:
                objArr[2] = "createWithTypePreparatorAndCustomSubtype";
                break;
            case 3:
            case 4:
                objArr[2] = "create";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "<init>";
                break;
            case 8:
                objArr[2] = "filterOutOverridden";
                break;
            case 9:
            case 10:
                objArr[2] = "filterOverrides";
                break;
            case 11:
            case 12:
            case 16:
            case 21:
            case 24:
            case 25:
            case 26:
            case 27:
            case 30:
            case BERTags.DATE /* 31 */:
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
            case EACTags.CURRENCY_CODE /* 42 */:
            case EACTags.DATE_OF_BIRTH /* 43 */:
            case 78:
            case 79:
            case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
            case EACTags.ANSWER_TO_RESET /* 81 */:
            case EACTags.HISTORICAL_BYTES /* 82 */:
            case 88:
            case 89:
            case 90:
            case 93:
            case 96:
            case 101:
                break;
            case 13:
            case 14:
                objArr[2] = "overrides";
                break;
            case 15:
                objArr[2] = "getOverriddenDeclarations";
                break;
            case 17:
            case 18:
                objArr[2] = "collectOverriddenDeclarations";
                break;
            case 19:
            case 20:
            case 22:
            case 23:
                objArr[2] = "isOverridableBy";
                break;
            case 28:
            case 29:
                objArr[2] = "isOverridableByWithoutExternalConditions";
                break;
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
                objArr[2] = "getBasicOverridabilityProblem";
                break;
            case 40:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
                objArr[2] = "createTypeCheckerState";
                break;
            case EACTags.CARDHOLDER_NATIONALITY /* 44 */:
            case EACTags.LANGUAGE_PREFERENCES /* 45 */:
            case 46:
                objArr[2] = "areTypesEquivalent";
                break;
            case 47:
            case 48:
            case 49:
                objArr[2] = "areTypeParametersEquivalent";
                break;
            case 50:
            case EACTags.TRANSACTION_DATE /* 51 */:
            case EACTags.CARD_SEQUENCE_NUMBER /* 52 */:
            case 53:
            case EACTags.CURRENCY_EXPONENT /* 54 */:
                objArr[2] = "generateOverridesInFunctionGroup";
                break;
            case 55:
            case 56:
                objArr[2] = "isVisibleForOverride";
                break;
            case 57:
            case EACTags.DYNAMIC_INTERNAL_AUTHENTIFICATION /* 58 */:
            case EACTags.DYNAMIC_EXTERNAL_AUTHENTIFICATION /* 59 */:
            case 60:
                objArr[2] = "extractAndBindOverridesForMember";
                break;
            case 61:
                objArr[2] = "allHasSameContainingDeclaration";
                break;
            case 62:
            case 63:
            case 64:
                objArr[2] = "createAndBindFakeOverrides";
                break;
            case 65:
            case 66:
                objArr[2] = "isMoreSpecific";
                break;
            case EACTags.CARDHOLDER_HANDWRITTEN_SIGNATURE /* 67 */:
            case EACTags.APPLICATION_IMAGE /* 68 */:
                objArr[2] = "isVisibilityMoreSpecific";
                break;
            case EACTags.DISPLAY_IMAGE /* 69 */:
            case 70:
                objArr[2] = "isMoreSpecificThenAllOf";
                break;
            case EACTags.MESSAGE_REFERENCE /* 71 */:
            case 72:
            case 73:
            case EACTags.CERTIFICATION_AUTHORITY_PUBLIC_KEY /* 74 */:
            case EACTags.DEPRECATED /* 75 */:
                objArr[2] = "isReturnTypeMoreSpecific";
                break;
            case 76:
            case EACTags.INTEGRATED_CIRCUIT_MANUFACTURER_ID /* 77 */:
                objArr[2] = "selectMostSpecificMember";
                break;
            case 83:
            case 84:
            case 85:
                objArr[2] = "createAndBindFakeOverride";
                break;
            case 86:
            case 87:
                objArr[2] = "determineModalityForFakeOverride";
                break;
            case 91:
            case 92:
                objArr[2] = "getMinimalModality";
                break;
            case 94:
            case 95:
                objArr[2] = "filterVisibleFakeOverrides";
                break;
            case 97:
            case 98:
            case 99:
            case 100:
            case 102:
            case 103:
            case 104:
                objArr[2] = "extractMembersOverridableInBothWays";
                break;
            case 105:
                objArr[2] = "resolveUnknownVisibilityForMember";
                break;
            case 106:
                objArr[2] = "computeVisibilityToInherit";
                break;
            case 107:
                objArr[2] = "findMaxVisibility";
                break;
            default:
                objArr[2] = "createWithTypeRefiner";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 11 && i15 != 12 && i15 != 16 && i15 != 21 && i15 != 93 && i15 != 96 && i15 != 101 && i15 != 42 && i15 != 43) {
            switch (i15) {
                case 24:
                case 25:
                case 26:
                case 27:
                    break;
                default:
                    switch (i15) {
                        case 30:
                        case BERTags.DATE /* 31 */:
                        case 32:
                        case 33:
                        case 34:
                        case 35:
                        case 36:
                        case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                            break;
                        default:
                            switch (i15) {
                                case 78:
                                case 79:
                                case EACTags.UNIFORM_RESOURCE_LOCATOR /* 80 */:
                                case EACTags.ANSWER_TO_RESET /* 81 */:
                                case EACTags.HISTORICAL_BYTES /* 82 */:
                                    break;
                                default:
                                    switch (i15) {
                                        case 88:
                                        case 89:
                                        case 90:
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

    private static boolean b(Collection<vr.b> collection) {
        if (collection == null) {
            a(61);
        }
        if (collection.size() < 2) {
            return true;
        }
        return pq.v.Z(collection, new c(collection.iterator().next().b()));
    }

    private static boolean c(m1 m1Var, m1 m1Var2, w1 w1Var) {
        if (m1Var == null) {
            a(47);
        }
        if (m1Var2 == null) {
            a(48);
        }
        if (w1Var == null) {
            a(49);
        }
        List<t0> upperBounds = m1Var.getUpperBounds();
        ArrayList arrayList = new ArrayList(m1Var2.getUpperBounds());
        if (upperBounds.size() != arrayList.size()) {
            return false;
        }
        for (t0 t0Var : upperBounds) {
            ListIterator listIterator = arrayList.listIterator();
            while (listIterator.hasNext()) {
                if (d(t0Var, (t0) listIterator.next(), w1Var)) {
                    listIterator.remove();
                }
            }
            return false;
        }
        return true;
    }

    private static boolean d(t0 t0Var, t0 t0Var2, w1 w1Var) {
        if (t0Var == null) {
            a(44);
        }
        if (t0Var2 == null) {
            a(45);
        }
        if (w1Var == null) {
            a(46);
        }
        if (x0.a(t0Var) && x0.a(t0Var2)) {
            return true;
        }
        return st.h.f184041a.m(w1Var, t0Var.W0(), t0Var2.W0());
    }

    private static i e(vr.a aVar, vr.a aVar2) {
        if ((aVar.R() == null) != (aVar2.R() == null)) {
            return i.d("Receiver presence mismatch");
        }
        if (aVar.l().size() != aVar2.l().size()) {
            return i.d("Value parameter number mismatch");
        }
        return null;
    }

    private static void f(vr.b bVar, Set<vr.b> set) {
        if (bVar == null) {
            a(17);
        }
        if (set == null) {
            a(18);
        }
        if (bVar.k().b()) {
            set.add(bVar);
            return;
        }
        if (bVar.e().isEmpty()) {
            throw new IllegalStateException("No overridden descriptors found for (fake override) " + bVar);
        }
        Iterator<? extends vr.b> it = bVar.e().iterator();
        while (it.hasNext()) {
            f(it.next(), set);
        }
    }

    private static List<t0> g(vr.a aVar) {
        c1 c1VarR = aVar.R();
        ArrayList arrayList = new ArrayList();
        if (c1VarR != null) {
            arrayList.add(c1VarR.getType());
        }
        Iterator<t1> it = aVar.l().iterator();
        while (it.hasNext()) {
            arrayList.add(it.next().getType());
        }
        return arrayList;
    }

    private static vr.u h(vr.b bVar) {
        if (bVar == null) {
            a(106);
        }
        Collection<? extends vr.b> collectionE = bVar.e();
        vr.u uVarU = u(collectionE);
        if (uVarU == null) {
            return null;
        }
        if (bVar.k() != vr.b.a.FAKE_OVERRIDE) {
            return uVarU.f();
        }
        for (vr.b bVar2 : collectionE) {
            if (bVar2.w() != f0.ABSTRACT && !bVar2.h().equals(uVarU)) {
                return null;
            }
        }
        return uVarU;
    }

    public static o i(tt.g gVar, tt.e.a aVar) {
        if (gVar == null) {
            a(3);
        }
        if (aVar == null) {
            a(4);
        }
        return new o(aVar, gVar, tt.f.a.f192118a, null);
    }

    private static void j(Collection<vr.b> collection, vr.e eVar, n nVar) {
        if (collection == null) {
            a(83);
        }
        if (eVar == null) {
            a(84);
        }
        if (nVar == null) {
            a(85);
        }
        Collection<vr.b> collectionT = t(eVar, collection);
        boolean zIsEmpty = collectionT.isEmpty();
        if (!zIsEmpty) {
            collection = collectionT;
        }
        vr.b bVarG0 = ((vr.b) L(collection, new d())).g0(eVar, n(collection, eVar), zIsEmpty ? vr.t.f208083h : vr.t.f208082g, vr.b.a.FAKE_OVERRIDE, false);
        nVar.d(bVarG0, collection);
        nVar.a(bVarG0);
    }

    private static void k(vr.e eVar, Collection<vr.b> collection, n nVar) {
        if (eVar == null) {
            a(62);
        }
        if (collection == null) {
            a(63);
        }
        if (nVar == null) {
            a(64);
        }
        if (b(collection)) {
            Iterator<vr.b> it = collection.iterator();
            while (it.hasNext()) {
                j(Collections.singleton(it.next()), eVar, nVar);
            }
        } else {
            LinkedList linkedList = new LinkedList(collection);
            while (!linkedList.isEmpty()) {
                j(q(x.a(linkedList), linkedList, nVar), eVar, nVar);
            }
        }
    }

    private w1 l(List<m1> list, List<m1> list2) {
        if (list == null) {
            a(40);
        }
        if (list2 == null) {
            a(41);
        }
        if (list.isEmpty()) {
            w1 w1VarP0 = new p(null, this.f44498c, this.f44496a, this.f44497b, this.f44499d).P0(true, true, false);
            if (w1VarP0 == null) {
                a(42);
            }
            return w1VarP0;
        }
        HashMap map = new HashMap();
        for (int i15 = 0; i15 < list.size(); i15++) {
            map.put(list.get(i15).o(), list2.get(i15).o());
        }
        w1 w1VarP1 = new p(map, this.f44498c, this.f44496a, this.f44497b, this.f44499d).P0(true, true, false);
        if (w1VarP1 == null) {
            a(43);
        }
        return w1VarP1;
    }

    public static o m(tt.g gVar) {
        if (gVar == null) {
            a(0);
        }
        return new o(f44495g, gVar, tt.f.a.f192118a, null);
    }

    private static f0 n(Collection<vr.b> collection, vr.e eVar) {
        if (collection == null) {
            a(86);
        }
        if (eVar == null) {
            a(87);
        }
        boolean z15 = false;
        boolean z16 = false;
        boolean z17 = false;
        for (vr.b bVar : collection) {
            int i15 = h.f44506c[bVar.w().ordinal()];
            if (i15 == 1) {
                f0 f0Var = f0.FINAL;
                if (f0Var == null) {
                    a(88);
                }
                return f0Var;
            }
            if (i15 == 2) {
                throw new IllegalStateException("Member cannot have SEALED modality: " + bVar);
            }
            if (i15 == 3) {
                z16 = true;
            } else if (i15 == 4) {
                z17 = true;
            }
        }
        if (eVar.o0() && eVar.w() != f0.ABSTRACT && eVar.w() != f0.SEALED) {
            z15 = true;
        }
        if (z16 && !z17) {
            f0 f0Var2 = f0.OPEN;
            if (f0Var2 == null) {
                a(89);
            }
            return f0Var2;
        }
        if (!z16 && z17) {
            f0 f0VarW = z15 ? eVar.w() : f0.ABSTRACT;
            if (f0VarW == null) {
                a(90);
            }
            return f0VarW;
        }
        HashSet hashSet = new HashSet();
        Iterator<vr.b> it = collection.iterator();
        while (it.hasNext()) {
            hashSet.addAll(z(it.next()));
        }
        return y(r(hashSet), z15, eVar.w());
    }

    private Collection<vr.b> o(vr.b bVar, Collection<? extends vr.b> collection, vr.e eVar, n nVar) {
        if (bVar == null) {
            a(57);
        }
        if (collection == null) {
            a(58);
        }
        if (eVar == null) {
            a(59);
        }
        if (nVar == null) {
            a(60);
        }
        ArrayList arrayList = new ArrayList(collection.size());
        cu.k kVarF = cu.k.f();
        for (vr.b bVar2 : collection) {
            i.a aVarC = D(bVar2, bVar, eVar).c();
            boolean zI = I(bVar, bVar2, false);
            int i15 = h.f44505b[aVarC.ordinal()];
            if (i15 == 1) {
                if (zI) {
                    kVarF.add(bVar2);
                }
                arrayList.add(bVar2);
            } else if (i15 == 2) {
                if (zI) {
                    nVar.c(bVar2, bVar);
                }
                arrayList.add(bVar2);
            }
        }
        nVar.d(bVar, kVarF);
        return arrayList;
    }

    public static <H> Collection<H> p(H h15, Collection<H> collection, er.l<H, vr.a> lVar, er.l<H, i0> lVar2) {
        if (h15 == null) {
            a(97);
        }
        if (collection == null) {
            a(98);
        }
        if (lVar == null) {
            a(99);
        }
        if (lVar2 == null) {
            a(100);
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(h15);
        vr.a aVarB = lVar.b(h15);
        Iterator<H> it = collection.iterator();
        while (it.hasNext()) {
            H next = it.next();
            vr.a aVarB2 = lVar.b(next);
            if (h15 == next) {
                it.remove();
            } else {
                i.a aVarX = x(aVarB, aVarB2);
                if (aVarX == i.a.OVERRIDABLE) {
                    arrayList.add(next);
                    it.remove();
                } else if (aVarX == i.a.CONFLICT) {
                    lVar2.b(next);
                    it.remove();
                }
            }
        }
        return arrayList;
    }

    private static Collection<vr.b> q(vr.b bVar, Queue<vr.b> queue, n nVar) {
        if (bVar == null) {
            a(102);
        }
        if (queue == null) {
            a(103);
        }
        if (nVar == null) {
            a(104);
        }
        return p(bVar, queue, new f(), new g(nVar, bVar));
    }

    public static <D extends vr.a> Set<D> r(Set<D> set) {
        if (set == null) {
            a(8);
        }
        return s(set, !set.isEmpty() && ht.e.y(ht.e.s(set.iterator().next())), null, new b());
    }

    public static <D> Set<D> s(Set<D> set, boolean z15, er.a<?> aVar, er.p<? super D, ? super D, oq.r<vr.a, vr.a>> pVar) {
        if (set == null) {
            a(9);
        }
        if (pVar == null) {
            a(10);
        }
        if (set.size() <= 1) {
            return set;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Object obj : set) {
            if (aVar != null) {
                aVar.a();
            }
            Iterator it = linkedHashSet.iterator();
            while (true) {
                if (!it.hasNext()) {
                    linkedHashSet.add(obj);
                    break;
                }
                oq.r<vr.a, vr.a> rVarB = pVar.B(obj, (Object) it.next());
                vr.a aVarA = rVarB.a();
                vr.a aVarB = rVarB.b();
                if (!J(aVarA, aVarB, z15, true)) {
                    if (J(aVarB, aVarA, z15, true)) {
                        break;
                    }
                } else {
                    it.remove();
                }
            }
        }
        return linkedHashSet;
    }

    public static Collection<vr.b> t(vr.e eVar, Collection<vr.b> collection) {
        if (eVar == null) {
            a(94);
        }
        if (collection == null) {
            a(95);
        }
        List listH0 = pq.v.h0(collection, new e(eVar));
        if (listH0 == null) {
            a(96);
        }
        return listH0;
    }

    public static vr.u u(Collection<? extends vr.b> collection) {
        vr.u uVar;
        if (collection == null) {
            a(107);
        }
        if (collection.isEmpty()) {
            return vr.t.f208087l;
        }
        Iterator<? extends vr.b> it = collection.iterator();
        loop0: while (true) {
            uVar = null;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                vr.u uVarH = it.next().h();
                if (uVar != null) {
                    Integer numD = vr.t.d(uVarH, uVar);
                    if (numD == null) {
                        break;
                    }
                    if (numD.intValue() > 0) {
                    }
                }
                uVar = uVarH;
            }
        }
        if (uVar == null) {
            return null;
        }
        Iterator<? extends vr.b> it4 = collection.iterator();
        while (it4.hasNext()) {
            Integer numD2 = vr.t.d(uVar, it4.next().h());
            if (numD2 == null || numD2.intValue() < 0) {
                return null;
            }
        }
        return uVar;
    }

    public static i w(vr.a aVar, vr.a aVar2) {
        boolean z15;
        if (aVar == null) {
            a(38);
        }
        if (aVar2 == null) {
            a(39);
        }
        boolean z16 = aVar instanceof z;
        if ((z16 && !(aVar2 instanceof z)) || (((z15 = aVar instanceof z0)) && !(aVar2 instanceof z0))) {
            return i.d("Member kind mismatch");
        }
        if (!z16 && !z15) {
            throw new IllegalArgumentException("This type of CallableDescriptor cannot be checked for overridability: " + aVar);
        }
        if (!aVar.getName().equals(aVar2.getName())) {
            return i.d("Name mismatch");
        }
        i iVarE = e(aVar, aVar2);
        if (iVarE != null) {
            return iVarE;
        }
        return null;
    }

    public static i.a x(vr.a aVar, vr.a aVar2) {
        o oVar = f44494f;
        i.a aVarC = oVar.D(aVar2, aVar, null).c();
        i.a aVarC2 = oVar.D(aVar, aVar2, null).c();
        i.a aVar3 = i.a.OVERRIDABLE;
        if (aVarC == aVar3 && aVarC2 == aVar3) {
            return aVar3;
        }
        i.a aVar4 = i.a.CONFLICT;
        return (aVarC == aVar4 || aVarC2 == aVar4) ? aVar4 : i.a.INCOMPATIBLE;
    }

    private static f0 y(Collection<vr.b> collection, boolean z15, f0 f0Var) {
        if (collection == null) {
            a(91);
        }
        if (f0Var == null) {
            a(92);
        }
        f0 f0Var2 = f0.ABSTRACT;
        for (vr.b bVar : collection) {
            f0 f0VarW = (z15 && bVar.w() == f0.ABSTRACT) ? f0Var : bVar.w();
            if (f0VarW.compareTo(f0Var2) < 0) {
                f0Var2 = f0VarW;
            }
        }
        if (f0Var2 == null) {
            a(93);
        }
        return f0Var2;
    }

    public static Set<vr.b> z(vr.b bVar) {
        if (bVar == null) {
            a(15);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        f(bVar, linkedHashSet);
        return linkedHashSet;
    }

    public i D(vr.a aVar, vr.a aVar2, vr.e eVar) {
        if (aVar == null) {
            a(19);
        }
        if (aVar2 == null) {
            a(20);
        }
        i iVarE = E(aVar, aVar2, eVar, false);
        if (iVarE == null) {
            a(21);
        }
        return iVarE;
    }

    public i E(vr.a aVar, vr.a aVar2, vr.e eVar, boolean z15) {
        if (aVar == null) {
            a(22);
        }
        if (aVar2 == null) {
            a(23);
        }
        i iVarF = F(aVar, aVar2, z15);
        boolean z16 = iVarF.c() == i.a.OVERRIDABLE;
        for (j jVar : f44493e) {
            if (jVar.v() != j.a.CONFLICTS_ONLY && (!z16 || jVar.v() != j.a.SUCCESS_ONLY)) {
                int i15 = h.f44504a[jVar.w(aVar, aVar2, eVar).ordinal()];
                if (i15 == 1) {
                    z16 = true;
                } else if (i15 == 2) {
                    i iVarD = i.d("External condition");
                    if (iVarD == null) {
                        a(24);
                    }
                    return iVarD;
                }
            }
        }
        if (!z16) {
            return iVarF;
        }
        for (j jVar2 : f44493e) {
            if (jVar2.v() == j.a.CONFLICTS_ONLY) {
                int i16 = h.f44504a[jVar2.w(aVar, aVar2, eVar).ordinal()];
                if (i16 == 1) {
                    throw new IllegalStateException("Contract violation in " + jVar2.getClass().getName() + " condition. It's not supposed to end with success");
                }
                if (i16 == 2) {
                    i iVarD2 = i.d("External condition");
                    if (iVarD2 == null) {
                        a(26);
                    }
                    return iVarD2;
                }
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(27);
        }
        return iVarE;
    }

    public i F(vr.a aVar, vr.a aVar2, boolean z15) {
        if (aVar == null) {
            a(28);
        }
        if (aVar2 == null) {
            a(29);
        }
        i iVarW = w(aVar, aVar2);
        if (iVarW != null) {
            return iVarW;
        }
        List<t0> listG = g(aVar);
        List<t0> listG2 = g(aVar2);
        List<m1> typeParameters = aVar.getTypeParameters();
        List<m1> typeParameters2 = aVar2.getTypeParameters();
        int i15 = 0;
        if (typeParameters.size() != typeParameters2.size()) {
            while (i15 < listG.size()) {
                if (!tt.e.f192117a.c(listG.get(i15), listG2.get(i15))) {
                    i iVarD = i.d("Type parameter number mismatch");
                    if (iVarD == null) {
                        a(31);
                    }
                    return iVarD;
                }
                i15++;
            }
            i iVarB = i.b("Type parameter number mismatch");
            if (iVarB == null) {
                a(32);
            }
            return iVarB;
        }
        w1 w1VarL = l(typeParameters, typeParameters2);
        for (int i16 = 0; i16 < typeParameters.size(); i16++) {
            if (!c(typeParameters.get(i16), typeParameters2.get(i16), w1VarL)) {
                i iVarD2 = i.d("Type parameter bounds mismatch");
                if (iVarD2 == null) {
                    a(33);
                }
                return iVarD2;
            }
        }
        while (i15 < listG.size()) {
            if (!d(listG.get(i15), listG2.get(i15), w1VarL)) {
                i iVarD3 = i.d("Value parameter type mismatch");
                if (iVarD3 == null) {
                    a(34);
                }
                return iVarD3;
            }
            i15++;
        }
        if ((aVar instanceof z) && (aVar2 instanceof z) && ((z) aVar).u() != ((z) aVar2).u()) {
            i iVarB2 = i.b("Incompatible suspendability");
            if (iVarB2 == null) {
                a(35);
            }
            return iVarB2;
        }
        if (z15) {
            t0 t0VarF = aVar.f();
            t0 t0VarF2 = aVar2.f();
            if (t0VarF != null && t0VarF2 != null && ((!x0.a(t0VarF2) || !x0.a(t0VarF)) && !st.h.f184041a.u(w1VarL, t0VarF2.W0(), t0VarF.W0()))) {
                i iVarB3 = i.b("Return type mismatch");
                if (iVarB3 == null) {
                    a(36);
                }
                return iVarB3;
            }
        }
        i iVarE = i.e();
        if (iVarE == null) {
            a(37);
        }
        return iVarE;
    }

    public void v(zs.f fVar, Collection<? extends vr.b> collection, Collection<? extends vr.b> collection2, vr.e eVar, n nVar) {
        if (fVar == null) {
            a(50);
        }
        if (collection == null) {
            a(51);
        }
        if (collection2 == null) {
            a(52);
        }
        if (eVar == null) {
            a(53);
        }
        if (nVar == null) {
            a(54);
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(collection);
        Iterator<? extends vr.b> it = collection2.iterator();
        while (it.hasNext()) {
            linkedHashSet.removeAll(o(it.next(), collection, eVar, nVar));
        }
        k(eVar, linkedHashSet, nVar);
    }
}
