package yr;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import st.e1;
import st.x1;
import vr.g1;
import vr.h1;
import vr.m1;
import vr.r1;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public class q extends j {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final x1 f228859j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final lt.k f228860k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final rt.i<Set<zs.f>> f228861l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final wr.h f228862m;

    private class a extends lt.l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final rt.g<zs.f, Collection<? extends g1>> f228863b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final rt.g<zs.f, Collection<? extends z0>> f228864c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final rt.i<Collection<vr.m>> f228865d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ q f228866e;

        /* JADX INFO: renamed from: yr.q$a$a, reason: collision with other inner class name */
        class C6148a implements er.l<zs.f, Collection<? extends g1>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f228867a;

            C6148a(q qVar) {
                this.f228867a = qVar;
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Collection<? extends g1> b(zs.f fVar) {
                return a.this.m(fVar);
            }
        }

        class b implements er.l<zs.f, Collection<? extends z0>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f228869a;

            b(q qVar) {
                this.f228869a = qVar;
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Collection<? extends z0> b(zs.f fVar) {
                return a.this.n(fVar);
            }
        }

        class c implements er.a<Collection<vr.m>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ q f228871a;

            c(q qVar) {
                this.f228871a = qVar;
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public Collection<vr.m> a() {
                return a.this.l();
            }
        }

        class d extends dt.m {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Set f228873a;

            d(Set set) {
                this.f228873a = set;
            }

            private static /* synthetic */ void f(int i15) {
                Object[] objArr = new Object[3];
                if (i15 == 1) {
                    objArr[0] = "fromSuper";
                } else if (i15 != 2) {
                    objArr[0] = "fakeOverride";
                } else {
                    objArr[0] = "fromCurrent";
                }
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope$4";
                if (i15 == 1 || i15 == 2) {
                    objArr[2] = "conflict";
                } else {
                    objArr[2] = "addFakeOverride";
                }
                throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
            }

            @Override // dt.n
            public void a(vr.b bVar) {
                if (bVar == null) {
                    f(0);
                }
                dt.o.K(bVar, null);
                this.f228873a.add(bVar);
            }

            @Override // dt.m
            protected void e(vr.b bVar, vr.b bVar2) {
                if (bVar == null) {
                    f(1);
                }
                if (bVar2 == null) {
                    f(2);
                }
            }
        }

        public a(q qVar, rt.n nVar) {
            if (nVar == null) {
                h(0);
            }
            this.f228866e = qVar;
            this.f228863b = nVar.i(new C6148a(qVar));
            this.f228864c = nVar.i(new b(qVar));
            this.f228865d = nVar.d(new c(qVar));
        }

        /* JADX WARN: Code duplicated, block: B:9:0x0014  */
        private static /* synthetic */ void h(int i15) {
            String str;
            int i16;
            if (i15 != 3 && i15 != 7 && i15 != 9 && i15 != 12) {
                switch (i15) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        str = "@NotNull method %s.%s must not return null";
                        break;
                    default:
                        str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                        break;
                }
            } else {
                str = "@NotNull method %s.%s must not return null";
            }
            if (i15 != 3 && i15 != 7 && i15 != 9 && i15 != 12) {
                switch (i15) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
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
                case 1:
                case 4:
                case 5:
                case 8:
                case 10:
                    objArr[0] = "name";
                    break;
                case 2:
                case 6:
                    objArr[0] = "location";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                    break;
                case 11:
                    objArr[0] = "fromSupertypes";
                    break;
                case 13:
                    objArr[0] = "kindFilter";
                    break;
                case 14:
                    objArr[0] = "nameFilter";
                    break;
                case 20:
                    objArr[0] = "p";
                    break;
                default:
                    objArr[0] = "storageManager";
                    break;
            }
            if (i15 == 3) {
                objArr[1] = "getContributedVariables";
            } else if (i15 == 7) {
                objArr[1] = "getContributedFunctions";
            } else if (i15 == 9) {
                objArr[1] = "getSupertypeScope";
            } else if (i15 != 12) {
                switch (i15) {
                    case 15:
                        objArr[1] = "getContributedDescriptors";
                        break;
                    case 16:
                        objArr[1] = "computeAllDeclarations";
                        break;
                    case 17:
                        objArr[1] = "getFunctionNames";
                        break;
                    case 18:
                        objArr[1] = "getClassifierNames";
                        break;
                    case 19:
                        objArr[1] = "getVariableNames";
                        break;
                    default:
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor$EnumEntryScope";
                        break;
                }
            } else {
                objArr[1] = "resolveFakeOverrides";
            }
            switch (i15) {
                case 1:
                case 2:
                    objArr[2] = "getContributedVariables";
                    break;
                case 3:
                case 7:
                case 9:
                case 12:
                case 15:
                case 16:
                case 17:
                case 18:
                case 19:
                    break;
                case 4:
                    objArr[2] = "computeProperties";
                    break;
                case 5:
                case 6:
                    objArr[2] = "getContributedFunctions";
                    break;
                case 8:
                    objArr[2] = "computeFunctions";
                    break;
                case 10:
                case 11:
                    objArr[2] = "resolveFakeOverrides";
                    break;
                case 13:
                case 14:
                    objArr[2] = "getContributedDescriptors";
                    break;
                case 20:
                    objArr[2] = "printScopeStructure";
                    break;
                default:
                    objArr[2] = "<init>";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i15 != 3 && i15 != 7 && i15 != 9 && i15 != 12) {
                switch (i15) {
                    case 15:
                    case 16:
                    case 17:
                    case 18:
                    case 19:
                        break;
                    default:
                        throw new IllegalArgumentException(str2);
                }
            }
            throw new IllegalStateException(str2);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<vr.m> l() {
            HashSet hashSet = new HashSet();
            for (zs.f fVar : (Set) this.f228866e.f228861l.a()) {
                ds.d dVar = ds.d.FOR_NON_TRACKED_SCOPE;
                hashSet.addAll(a(fVar, dVar));
                hashSet.addAll(c(fVar, dVar));
            }
            return hashSet;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends g1> m(zs.f fVar) {
            if (fVar == null) {
                h(8);
            }
            return p(fVar, o().a(fVar, ds.d.FOR_NON_TRACKED_SCOPE));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public Collection<? extends z0> n(zs.f fVar) {
            if (fVar == null) {
                h(4);
            }
            return p(fVar, o().c(fVar, ds.d.FOR_NON_TRACKED_SCOPE));
        }

        private lt.k o() {
            lt.k kVarR = this.f228866e.o().q().iterator().next().r();
            if (kVarR == null) {
                h(9);
            }
            return kVarR;
        }

        private <D extends vr.b> Collection<? extends D> p(zs.f fVar, Collection<? extends D> collection) {
            if (fVar == null) {
                h(10);
            }
            if (collection == null) {
                h(11);
            }
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            dt.o.f44494f.v(fVar, collection, Collections.EMPTY_SET, this.f228866e, new d(linkedHashSet));
            return linkedHashSet;
        }

        @Override // lt.l, lt.k
        public Collection<? extends g1> a(zs.f fVar, ds.b bVar) {
            if (fVar == null) {
                h(5);
            }
            if (bVar == null) {
                h(6);
            }
            Collection<? extends g1> collectionB = this.f228863b.b(fVar);
            if (collectionB == null) {
                h(7);
            }
            return collectionB;
        }

        @Override // lt.l, lt.k
        public Set<zs.f> b() {
            Set<zs.f> set = (Set) this.f228866e.f228861l.a();
            if (set == null) {
                h(17);
            }
            return set;
        }

        @Override // lt.l, lt.k
        public Collection<? extends z0> c(zs.f fVar, ds.b bVar) {
            if (fVar == null) {
                h(1);
            }
            if (bVar == null) {
                h(2);
            }
            Collection<? extends z0> collectionB = this.f228864c.b(fVar);
            if (collectionB == null) {
                h(3);
            }
            return collectionB;
        }

        @Override // lt.l, lt.k
        public Set<zs.f> d() {
            Set<zs.f> set = (Set) this.f228866e.f228861l.a();
            if (set == null) {
                h(19);
            }
            return set;
        }

        @Override // lt.l, lt.n
        public Collection<vr.m> f(lt.d dVar, er.l<? super zs.f, Boolean> lVar) {
            if (dVar == null) {
                h(13);
            }
            if (lVar == null) {
                h(14);
            }
            Collection<vr.m> collectionA = this.f228865d.a();
            if (collectionA == null) {
                h(15);
            }
            return collectionA;
        }

        @Override // lt.l, lt.k
        public Set<zs.f> g() {
            Set<zs.f> set = Collections.EMPTY_SET;
            if (set == null) {
                h(18);
            }
            return set;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    private q(rt.n nVar, vr.e eVar, st.t0 t0Var, zs.f fVar, rt.i<Set<zs.f>> iVar, wr.h hVar, h1 h1Var) {
        super(nVar, eVar, fVar, h1Var, false);
        if (nVar == null) {
            K0(6);
        }
        if (eVar == null) {
            K0(7);
        }
        if (t0Var == null) {
            K0(8);
        }
        if (fVar == null) {
            K0(9);
        }
        if (iVar == null) {
            K0(10);
        }
        if (hVar == null) {
            K0(11);
        }
        if (h1Var == null) {
            K0(12);
        }
        this.f228862m = hVar;
        this.f228859j = new st.v(this, Collections.EMPTY_LIST, Collections.singleton(t0Var), nVar);
        this.f228860k = new a(this, nVar);
        this.f228861l = iVar;
    }

    private static /* synthetic */ void K0(int i15) {
        String str;
        int i16;
        switch (i15) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i15) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                i16 = 2;
                break;
            default:
                i16 = 3;
                break;
        }
        Object[] objArr = new Object[i16];
        switch (i15) {
            case 1:
                objArr[0] = "enumClass";
                break;
            case 2:
            case 9:
                objArr[0] = "name";
                break;
            case 3:
            case 10:
                objArr[0] = "enumMemberNames";
                break;
            case 4:
            case 11:
                objArr[0] = "annotations";
                break;
            case 5:
            case 12:
                objArr[0] = "source";
                break;
            case 6:
            default:
                objArr[0] = "storageManager";
                break;
            case 7:
                objArr[0] = "containingClass";
                break;
            case 8:
                objArr[0] = "supertype";
                break;
            case 13:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i15) {
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getConstructors";
                break;
            case 17:
                objArr[1] = "getTypeConstructor";
                break;
            case 18:
                objArr[1] = "getKind";
                break;
            case 19:
                objArr[1] = "getModality";
                break;
            case 20:
                objArr[1] = "getVisibility";
                break;
            case 21:
                objArr[1] = "getAnnotations";
                break;
            case 22:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case 23:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/EnumEntrySyntheticClassDescriptor";
                break;
        }
        switch (i15) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "<init>";
                break;
            case 13:
                objArr[2] = "getUnsubstitutedMemberScope";
                break;
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                break;
            default:
                objArr[2] = "create";
                break;
        }
        String str2 = String.format(str, objArr);
        switch (i15) {
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
                throw new IllegalStateException(str2);
            default:
                throw new IllegalArgumentException(str2);
        }
    }

    public static q R0(rt.n nVar, vr.e eVar, zs.f fVar, rt.i<Set<zs.f>> iVar, wr.h hVar, h1 h1Var) {
        if (nVar == null) {
            K0(0);
        }
        if (eVar == null) {
            K0(1);
        }
        if (fVar == null) {
            K0(2);
        }
        if (iVar == null) {
            K0(3);
        }
        if (hVar == null) {
            K0(4);
        }
        if (h1Var == null) {
            K0(5);
        }
        return new q(nVar, eVar, eVar.t(), fVar, iVar, hVar, h1Var);
    }

    @Override // vr.i
    public boolean E() {
        return false;
    }

    @Override // vr.e
    public vr.d H() {
        return null;
    }

    @Override // yr.z
    public lt.k I0(tt.g gVar) {
        if (gVar == null) {
            K0(13);
        }
        lt.k kVar = this.f228860k;
        if (kVar == null) {
            K0(14);
        }
        return kVar;
    }

    @Override // vr.e
    public boolean O0() {
        return false;
    }

    @Override // vr.e
    public r1<e1> Y() {
        return null;
    }

    @Override // vr.e0
    public boolean b0() {
        return false;
    }

    @Override // vr.e
    public boolean e0() {
        return false;
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        wr.h hVar = this.f228862m;
        if (hVar == null) {
            K0(21);
        }
        return hVar;
    }

    @Override // vr.e, vr.e0, vr.q
    public vr.u h() {
        vr.u uVar = vr.t.f208080e;
        if (uVar == null) {
            K0(20);
        }
        return uVar;
    }

    @Override // vr.e
    public boolean j0() {
        return false;
    }

    @Override // vr.e
    public vr.f k() {
        vr.f fVar = vr.f.ENUM_ENTRY;
        if (fVar == null) {
            K0(18);
        }
        return fVar;
    }

    @Override // vr.e
    public boolean n() {
        return false;
    }

    @Override // vr.h
    public x1 o() {
        x1 x1Var = this.f228859j;
        if (x1Var == null) {
            K0(17);
        }
        return x1Var;
    }

    @Override // vr.e0
    public boolean o0() {
        return false;
    }

    @Override // vr.e
    public Collection<vr.d> p() {
        List list = Collections.EMPTY_LIST;
        if (list == null) {
            K0(16);
        }
        return list;
    }

    @Override // vr.e
    public lt.k q0() {
        lt.k.b bVar = lt.k.b.f120132b;
        if (bVar == null) {
            K0(15);
        }
        return bVar;
    }

    @Override // vr.e
    public vr.e r0() {
        return null;
    }

    public String toString() {
        return "enum entry " + getName();
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        List<m1> list = Collections.EMPTY_LIST;
        if (list == null) {
            K0(22);
        }
        return list;
    }

    @Override // vr.e, vr.e0
    public vr.f0 w() {
        vr.f0 f0Var = vr.f0.FINAL;
        if (f0Var == null) {
            K0(19);
        }
        return f0Var;
    }

    @Override // vr.e
    public boolean x() {
        return false;
    }
}
