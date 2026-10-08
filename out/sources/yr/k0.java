package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import org.bouncycastle.asn1.eac.EACTags;
import st.g2;
import st.i2;
import st.p2;
import vr.a1;
import vr.b1;
import vr.c1;
import vr.h1;
import vr.m1;
import vr.t1;
import vr.y0;
import vr.z0;

/* JADX INFO: loaded from: classes4.dex */
public class k0 extends x0 implements z0 {
    private l0 A;
    private b1 B;
    private boolean C;
    private vr.w D;
    private vr.w E;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final vr.f0 f228818j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private vr.u f228819k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private Collection<? extends z0> f228820l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final z0 f228821m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final vr.b.a f228822n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final boolean f228823p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private final boolean f228824q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private final boolean f228825r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final boolean f228826s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final boolean f228827t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f228828v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private List<c1> f228829w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private c1 f228830x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private c1 f228831y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private List<m1> f228832z;

    public class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private vr.m f228833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private vr.f0 f228834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private vr.u f228835c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private vr.b.a f228838f;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private c1 f228841i;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private zs.f f228843k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private st.t0 f228844l;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private z0 f228836d = null;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f228837e = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private g2 f228839g = g2.f184039b;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f228840h = true;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private List<m1> f228842j = null;

        public a() {
            this.f228833a = k0.this.b();
            this.f228834b = k0.this.w();
            this.f228835c = k0.this.h();
            this.f228838f = k0.this.k();
            this.f228841i = k0.this.f228830x;
            this.f228843k = k0.this.getName();
            this.f228844l = k0.this.getType();
        }

        private static /* synthetic */ void a(int i15) {
            String str = (i15 == 1 || i15 == 2 || i15 == 3 || i15 == 5 || i15 == 7 || i15 == 9 || i15 == 11 || i15 == 19 || i15 == 13 || i15 == 14 || i15 == 16 || i15 == 17) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
            Object[] objArr = new Object[(i15 == 1 || i15 == 2 || i15 == 3 || i15 == 5 || i15 == 7 || i15 == 9 || i15 == 11 || i15 == 19 || i15 == 13 || i15 == 14 || i15 == 16 || i15 == 17) ? 2 : 3];
            switch (i15) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                    break;
                case 4:
                    objArr[0] = "type";
                    break;
                case 6:
                    objArr[0] = "modality";
                    break;
                case 8:
                    objArr[0] = "visibility";
                    break;
                case 10:
                    objArr[0] = "kind";
                    break;
                case 12:
                    objArr[0] = "typeParameters";
                    break;
                case 15:
                    objArr[0] = "substitution";
                    break;
                case 18:
                    objArr[0] = "name";
                    break;
                default:
                    objArr[0] = "owner";
                    break;
            }
            if (i15 == 1) {
                objArr[1] = "setOwner";
            } else if (i15 == 2) {
                objArr[1] = "setOriginal";
            } else if (i15 == 3) {
                objArr[1] = "setPreserveSourceElement";
            } else if (i15 == 5) {
                objArr[1] = "setReturnType";
            } else if (i15 == 7) {
                objArr[1] = "setModality";
            } else if (i15 == 9) {
                objArr[1] = "setVisibility";
            } else if (i15 == 11) {
                objArr[1] = "setKind";
            } else if (i15 == 19) {
                objArr[1] = "setName";
            } else if (i15 == 13) {
                objArr[1] = "setTypeParameters";
            } else if (i15 == 14) {
                objArr[1] = "setDispatchReceiverParameter";
            } else if (i15 == 16) {
                objArr[1] = "setSubstitution";
            } else if (i15 != 17) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
            } else {
                objArr[1] = "setCopyOverrides";
            }
            switch (i15) {
                case 1:
                case 2:
                case 3:
                case 5:
                case 7:
                case 9:
                case 11:
                case 13:
                case 14:
                case 16:
                case 17:
                case 19:
                    break;
                case 4:
                    objArr[2] = "setReturnType";
                    break;
                case 6:
                    objArr[2] = "setModality";
                    break;
                case 8:
                    objArr[2] = "setVisibility";
                    break;
                case 10:
                    objArr[2] = "setKind";
                    break;
                case 12:
                    objArr[2] = "setTypeParameters";
                    break;
                case 15:
                    objArr[2] = "setSubstitution";
                    break;
                case 18:
                    objArr[2] = "setName";
                    break;
                default:
                    objArr[2] = "setOwner";
                    break;
            }
            String str2 = String.format(str, objArr);
            if (i15 != 1 && i15 != 2 && i15 != 3 && i15 != 5 && i15 != 7 && i15 != 9 && i15 != 11 && i15 != 19 && i15 != 13 && i15 != 14 && i15 != 16 && i15 != 17) {
                throw new IllegalArgumentException(str2);
            }
            throw new IllegalStateException(str2);
        }

        public z0 n() {
            return k0.this.W0(this);
        }

        a1 o() {
            z0 z0Var = this.f228836d;
            if (z0Var == null) {
                return null;
            }
            return z0Var.d();
        }

        b1 p() {
            z0 z0Var = this.f228836d;
            if (z0Var == null) {
                return null;
            }
            return z0Var.j();
        }

        public a q(boolean z15) {
            this.f228840h = z15;
            return this;
        }

        public a r(vr.b.a aVar) {
            if (aVar == null) {
                a(10);
            }
            this.f228838f = aVar;
            return this;
        }

        public a s(vr.f0 f0Var) {
            if (f0Var == null) {
                a(6);
            }
            this.f228834b = f0Var;
            return this;
        }

        public a t(vr.b bVar) {
            this.f228836d = (z0) bVar;
            return this;
        }

        public a u(vr.m mVar) {
            if (mVar == null) {
                a(0);
            }
            this.f228833a = mVar;
            return this;
        }

        public a v(g2 g2Var) {
            if (g2Var == null) {
                a(15);
            }
            this.f228839g = g2Var;
            return this;
        }

        public a w(vr.u uVar) {
            if (uVar == null) {
                a(8);
            }
            this.f228835c = uVar;
            return this;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    protected k0(vr.m mVar, z0 z0Var, wr.h hVar, vr.f0 f0Var, vr.u uVar, boolean z15, zs.f fVar, vr.b.a aVar, h1 h1Var, boolean z16, boolean z17, boolean z18, boolean z19, boolean z25, boolean z26) {
        super(mVar, hVar, fVar, null, z15, h1Var);
        if (mVar == null) {
            m0(0);
        }
        if (hVar == null) {
            m0(1);
        }
        if (f0Var == null) {
            m0(2);
        }
        if (uVar == null) {
            m0(3);
        }
        if (fVar == null) {
            m0(4);
        }
        if (aVar == null) {
            m0(5);
        }
        if (h1Var == null) {
            m0(6);
        }
        this.f228820l = null;
        this.f228829w = Collections.EMPTY_LIST;
        this.f228818j = f0Var;
        this.f228819k = uVar;
        this.f228821m = z0Var == null ? this : z0Var;
        this.f228822n = aVar;
        this.f228823p = z16;
        this.f228824q = z17;
        this.f228825r = z18;
        this.f228826s = z19;
        this.f228827t = z25;
        this.f228828v = z26;
    }

    public static k0 U0(vr.m mVar, wr.h hVar, vr.f0 f0Var, vr.u uVar, boolean z15, zs.f fVar, vr.b.a aVar, h1 h1Var, boolean z16, boolean z17, boolean z18, boolean z19, boolean z25, boolean z26) {
        if (mVar == null) {
            m0(7);
        }
        if (hVar == null) {
            m0(8);
        }
        if (f0Var == null) {
            m0(9);
        }
        if (uVar == null) {
            m0(10);
        }
        if (fVar == null) {
            m0(11);
        }
        if (aVar == null) {
            m0(12);
        }
        if (h1Var == null) {
            m0(13);
        }
        return new k0(mVar, null, hVar, f0Var, uVar, z15, fVar, aVar, h1Var, z16, z17, z18, z19, z25, z26);
    }

    private h1 Y0(boolean z15, z0 z0Var) {
        h1 h1VarM;
        if (z15) {
            if (z0Var == null) {
                z0Var = Q0();
            }
            h1VarM = z0Var.m();
        } else {
            h1VarM = h1.f208052a;
        }
        if (h1VarM == null) {
            m0(28);
        }
        return h1VarM;
    }

    private static vr.z Z0(i2 i2Var, y0 y0Var) {
        if (i2Var == null) {
            m0(30);
        }
        if (y0Var == null) {
            m0(31);
        }
        if (y0Var.w0() != null) {
            return y0Var.w0().c(i2Var);
        }
        return null;
    }

    private static vr.u e1(vr.u uVar, vr.b.a aVar) {
        return (aVar == vr.b.a.FAKE_OVERRIDE && vr.t.g(uVar.f())) ? vr.t.f208083h : uVar;
    }

    private static c1 j1(i2 i2Var, z0 z0Var, c1 c1Var) {
        st.t0 t0VarQ = i2Var.q(c1Var.getType(), p2.IN_VARIANCE);
        if (t0VarQ == null) {
            return null;
        }
        return new n0(z0Var, new mt.c(z0Var, t0VarQ, ((mt.f) c1Var.getValue()).a(), c1Var.getValue()), c1Var.getAnnotations());
    }

    private static c1 k1(i2 i2Var, z0 z0Var, c1 c1Var) {
        st.t0 t0VarQ = i2Var.q(c1Var.getType(), p2.IN_VARIANCE);
        if (t0VarQ == null) {
            return null;
        }
        return new n0(z0Var, new mt.d(z0Var, t0VarQ, c1Var.getValue()), c1Var.getAnnotations());
    }

    /* JADX WARN: Code duplicated, block: B:10:0x001a  */
    private static /* synthetic */ void m0(int i15) {
        String str;
        int i16;
        if (i15 != 28 && i15 != 38 && i15 != 39 && i15 != 41 && i15 != 42) {
            switch (i15) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    str = "@NotNull method %s.%s must not return null";
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i15 != 28 && i15 != 38 && i15 != 39 && i15 != 41 && i15 != 42) {
            switch (i15) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
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
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
            case 20:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 35:
                objArr[0] = "kind";
                break;
            case 6:
            case 13:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                objArr[0] = "source";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 14:
                objArr[0] = "inType";
                break;
            case 15:
            case 17:
                objArr[0] = "outType";
                break;
            case 16:
            case 18:
                objArr[0] = "typeParameters";
                break;
            case 19:
                objArr[0] = "contextReceiverParameters";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                break;
            case 27:
                objArr[0] = "originalSubstitutor";
                break;
            case 29:
                objArr[0] = "copyConfiguration";
                break;
            case 30:
                objArr[0] = "substitutor";
                break;
            case BERTags.DATE /* 31 */:
                objArr[0] = "accessorDescriptor";
                break;
            case 32:
                objArr[0] = "newOwner";
                break;
            case 33:
                objArr[0] = "newModality";
                break;
            case 34:
                objArr[0] = "newVisibility";
                break;
            case 36:
                objArr[0] = "newName";
                break;
            case 40:
                objArr[0] = "overriddenDescriptors";
                break;
        }
        if (i15 == 28) {
            objArr[1] = "getSourceToUseForCopy";
        } else if (i15 == 38) {
            objArr[1] = "getOriginal";
        } else if (i15 == 39) {
            objArr[1] = "getKind";
        } else if (i15 == 41) {
            objArr[1] = "getOverriddenDescriptors";
        } else if (i15 != 42) {
            switch (i15) {
                case 21:
                    objArr[1] = "getTypeParameters";
                    break;
                case 22:
                    objArr[1] = "getContextReceiverParameters";
                    break;
                case 23:
                    objArr[1] = "getReturnType";
                    break;
                case 24:
                    objArr[1] = "getModality";
                    break;
                case 25:
                    objArr[1] = "getVisibility";
                    break;
                case 26:
                    objArr[1] = "getAccessors";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl";
                    break;
            }
        } else {
            objArr[1] = "copy";
        }
        switch (i15) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[2] = "create";
                break;
            case 14:
                objArr[2] = "setInType";
                break;
            case 15:
            case 16:
            case 17:
            case 18:
            case 19:
                objArr[2] = "setType";
                break;
            case 20:
                objArr[2] = "setVisibility";
                break;
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            case 26:
            case 28:
            case EACTags.CARD_EFFECTIVE_DATE /* 38 */:
            case EACTags.INTERCHANGE_CONTROL /* 39 */:
            case EACTags.INTERCHANGE_PROFILE /* 41 */:
            case EACTags.CURRENCY_CODE /* 42 */:
                break;
            case 27:
                objArr[2] = "substitute";
                break;
            case 29:
                objArr[2] = "doSubstitute";
                break;
            case 30:
            case BERTags.DATE /* 31 */:
                objArr[2] = "getSubstitutedInitialSignatureDescriptor";
                break;
            case 32:
            case 33:
            case 34:
            case 35:
            case 36:
            case EACTags.APPLICATION_EFFECTIVE_DATE /* 37 */:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 40:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i15 != 28 && i15 != 38 && i15 != 39 && i15 != 41 && i15 != 42) {
            switch (i15) {
                case 21:
                case 22:
                case 23:
                case 24:
                case 25:
                case 26:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    @Override // vr.z0
    public List<y0> A() {
        ArrayList arrayList = new ArrayList(2);
        l0 l0Var = this.A;
        if (l0Var != null) {
            arrayList.add(l0Var);
        }
        b1 b1Var = this.B;
        if (b1Var != null) {
            arrayList.add(b1Var);
        }
        return arrayList;
    }

    @Override // vr.z0
    public vr.w A0() {
        return this.D;
    }

    @Override // vr.a
    public List<c1> B0() {
        List<c1> list = this.f228829w;
        if (list == null) {
            m0(22);
        }
        return list;
    }

    @Override // vr.u1
    public boolean C0() {
        return this.f228823p;
    }

    @Override // vr.v1
    public boolean F() {
        return this.f228828v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // vr.b
    public void H0(Collection<? extends vr.b> collection) {
        if (collection == 0) {
            m0(40);
        }
        this.f228820l = collection;
    }

    @Override // yr.w0, vr.a
    public c1 N() {
        return this.f228830x;
    }

    @Override // yr.w0, vr.a
    public c1 R() {
        return this.f228831y;
    }

    @Override // vr.z0
    public vr.w S() {
        return this.E;
    }

    @Override // vr.b
    /* JADX INFO: renamed from: T0, reason: merged with bridge method [inline-methods] */
    public z0 g0(vr.m mVar, vr.f0 f0Var, vr.u uVar, vr.b.a aVar, boolean z15) {
        z0 z0VarN = d1().u(mVar).t(null).s(f0Var).w(uVar).r(aVar).q(z15).n();
        if (z0VarN == null) {
            m0(42);
        }
        return z0VarN;
    }

    protected k0 V0(vr.m mVar, vr.f0 f0Var, vr.u uVar, z0 z0Var, vr.b.a aVar, zs.f fVar, h1 h1Var) {
        if (mVar == null) {
            m0(32);
        }
        if (f0Var == null) {
            m0(33);
        }
        if (uVar == null) {
            m0(34);
        }
        if (aVar == null) {
            m0(35);
        }
        if (fVar == null) {
            m0(36);
        }
        if (h1Var == null) {
            m0(37);
        }
        return new k0(mVar, z0Var, getAnnotations(), f0Var, uVar, Q(), fVar, aVar, h1Var, C0(), f0(), o0(), b0(), d0(), F());
    }

    public <V> V W(vr.a.InterfaceC5463a<V> interfaceC5463a) {
        return null;
    }

    protected z0 W0(a aVar) {
        c1 c1Var;
        er.a<rt.j<ft.g<?>>> aVar2;
        if (aVar == null) {
            m0(29);
        }
        k0 k0VarV0 = V0(aVar.f228833a, aVar.f228834b, aVar.f228835c, aVar.f228836d, aVar.f228838f, aVar.f228843k, Y0(aVar.f228837e, aVar.f228836d));
        List<m1> typeParameters = aVar.f228842j == null ? getTypeParameters() : aVar.f228842j;
        ArrayList arrayList = new ArrayList(typeParameters.size());
        i2 i2VarB = st.d0.b(typeParameters, aVar.f228839g, k0VarV0, arrayList);
        st.t0 t0Var = aVar.f228844l;
        st.t0 t0VarQ = i2VarB.q(t0Var, p2.OUT_VARIANCE);
        if (t0VarQ == null) {
            return null;
        }
        st.t0 t0VarQ2 = i2VarB.q(t0Var, p2.IN_VARIANCE);
        if (t0VarQ2 != null) {
            k0VarV0.f1(t0VarQ2);
        }
        c1 c1Var2 = aVar.f228841i;
        if (c1Var2 != null) {
            c1 c1VarC = c1Var2.c(i2VarB);
            if (c1VarC == null) {
                return null;
            }
            c1Var = c1VarC;
        } else {
            c1Var = null;
        }
        c1 c1Var3 = this.f228831y;
        c1 c1VarK1 = c1Var3 != null ? k1(i2VarB, k0VarV0, c1Var3) : null;
        ArrayList arrayList2 = new ArrayList();
        Iterator<c1> it = this.f228829w.iterator();
        while (it.hasNext()) {
            c1 c1VarJ1 = j1(i2VarB, k0VarV0, it.next());
            if (c1VarJ1 != null) {
                arrayList2.add(c1VarJ1);
            }
        }
        k0VarV0.h1(t0VarQ, arrayList, c1Var, c1VarK1, arrayList2);
        l0 l0Var = this.A == null ? null : new l0(k0VarV0, this.A.getAnnotations(), aVar.f228834b, e1(this.A.h(), aVar.f228838f), this.A.J(), this.A.d0(), this.A.n(), aVar.f228838f, aVar.o(), h1.f208052a);
        if (l0Var != null) {
            st.t0 t0VarF = this.A.f();
            l0Var.T0(Z0(i2VarB, this.A));
            l0Var.W0(t0VarF != null ? i2VarB.q(t0VarF, p2.OUT_VARIANCE) : null);
        }
        m0 m0Var = this.B == null ? null : new m0(k0VarV0, this.B.getAnnotations(), aVar.f228834b, e1(this.B.h(), aVar.f228838f), this.B.J(), this.B.d0(), this.B.n(), aVar.f228838f, aVar.p(), h1.f208052a);
        if (m0Var != null) {
            List<t1> listV0 = s.V0(m0Var, this.B.l(), i2VarB, false, false, null);
            if (listV0 == null) {
                k0VarV0.g1(true);
                listV0 = Collections.singletonList(m0.V0(m0Var, ht.e.m(aVar.f228833a).I(), this.B.l().get(0).getAnnotations()));
            }
            if (listV0.size() != 1) {
                throw new IllegalStateException();
            }
            m0Var.T0(Z0(i2VarB, this.B));
            m0Var.X0(listV0.get(0));
        }
        vr.w wVar = this.D;
        r rVar = wVar == null ? null : new r(wVar.getAnnotations(), k0VarV0);
        vr.w wVar2 = this.E;
        k0VarV0.b1(l0Var, m0Var, rVar, wVar2 == null ? null : new r(wVar2.getAnnotations(), k0VarV0));
        if (aVar.f228840h) {
            cu.k kVarF = cu.k.f();
            Iterator<? extends z0> it4 = e().iterator();
            while (it4.hasNext()) {
                kVarF.add(it4.next().c(i2VarB));
            }
            k0VarV0.H0(kVarF);
        }
        if (f0() && (aVar2 = this.f228950h) != null) {
            k0VarV0.Q0(this.f228949g, aVar2);
        }
        return k0VarV0;
    }

    @Override // vr.z0
    /* JADX INFO: renamed from: X0, reason: merged with bridge method [inline-methods] */
    public l0 d() {
        return this.A;
    }

    public void a1(l0 l0Var, b1 b1Var) {
        b1(l0Var, b1Var, null, null);
    }

    @Override // vr.e0
    public boolean b0() {
        return this.f228826s;
    }

    public void b1(l0 l0Var, b1 b1Var, vr.w wVar, vr.w wVar2) {
        this.A = l0Var;
        this.B = b1Var;
        this.D = wVar;
        this.E = wVar2;
    }

    public boolean c1() {
        return this.C;
    }

    public boolean d0() {
        return this.f228827t;
    }

    public a d1() {
        return new a();
    }

    @Override // vr.a
    public Collection<? extends z0> e() {
        Collection<? extends z0> collection = this.f228820l;
        if (collection == null) {
            collection = Collections.EMPTY_LIST;
        }
        if (collection == null) {
            m0(41);
        }
        return collection;
    }

    @Override // yr.w0, vr.a
    public st.t0 f() {
        st.t0 type = getType();
        if (type == null) {
            m0(23);
        }
        return type;
    }

    public boolean f0() {
        return this.f228824q;
    }

    public void f1(st.t0 t0Var) {
        if (t0Var == null) {
            m0(14);
        }
    }

    public void g1(boolean z15) {
        this.C = z15;
    }

    @Override // yr.w0, vr.a
    public List<m1> getTypeParameters() {
        List<m1> list = this.f228832z;
        if (list != null) {
            return list;
        }
        throw new IllegalStateException("typeParameters == null for " + this);
    }

    @Override // vr.q
    public vr.u h() {
        vr.u uVar = this.f228819k;
        if (uVar == null) {
            m0(25);
        }
        return uVar;
    }

    public void h1(st.t0 t0Var, List<? extends m1> list, c1 c1Var, c1 c1Var2, List<c1> list2) {
        if (t0Var == null) {
            m0(17);
        }
        if (list == null) {
            m0(18);
        }
        if (list2 == null) {
            m0(19);
        }
        M0(t0Var);
        this.f228832z = new ArrayList(list);
        this.f228831y = c1Var2;
        this.f228830x = c1Var;
        this.f228829w = list2;
    }

    public void i1(vr.u uVar) {
        if (uVar == null) {
            m0(20);
        }
        this.f228819k = uVar;
    }

    @Override // vr.z0
    public b1 j() {
        return this.B;
    }

    @Override // vr.b
    public vr.b.a k() {
        vr.b.a aVar = this.f228822n;
        if (aVar == null) {
            m0(39);
        }
        return aVar;
    }

    @Override // vr.e0
    public boolean o0() {
        return this.f228825r;
    }

    @Override // vr.e0
    public vr.f0 w() {
        vr.f0 f0Var = this.f228818j;
        if (f0Var == null) {
            m0(24);
        }
        return f0Var;
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.l(this, d15);
    }

    @Override // vr.j1
    public z0 c(i2 i2Var) {
        if (i2Var == null) {
            m0(27);
        }
        return i2Var.l() ? this : d1().v(i2Var.k()).t(Q0()).n();
    }

    @Override // yr.n, yr.m, vr.m
    /* JADX INFO: renamed from: a */
    public z0 Q0() {
        z0 z0Var = this.f228821m;
        z0 z0VarQ0 = z0Var == this ? this : z0Var.Q0();
        if (z0VarQ0 == null) {
            m0(38);
        }
        return z0VarQ0;
    }
}
