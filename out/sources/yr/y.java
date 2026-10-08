package yr;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.bouncycastle.asn1.BERTags;
import st.e1;
import st.g2;
import st.i2;
import st.l2;
import st.p2;
import st.x1;
import vr.c1;
import vr.h1;
import vr.m1;
import vr.r1;

/* JADX INFO: loaded from: classes4.dex */
public class y extends z {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final z f228951b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final i2 f228952c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private i2 f228953d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private List<m1> f228954e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private List<m1> f228955f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private x1 f228956g;

    class a implements er.l<m1, Boolean> {
        a() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public Boolean b(m1 m1Var) {
            return Boolean.valueOf(!m1Var.T());
        }
    }

    class b implements er.l<e1, e1> {
        b() {
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public e1 b(e1 e1Var) {
            return y.this.S0(e1Var);
        }
    }

    public y(z zVar, i2 i2Var) {
        this.f228951b = zVar;
        this.f228952c = i2Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0051  */
    /* JADX WARN: Code duplicated, block: B:35:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005b  */
    private static /* synthetic */ void K0(int i15) {
        String str = (i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6 || i15 == 8 || i15 == 10 || i15 == 13 || i15 == 23) ? "Argument for @NotNull parameter '%s' of %s.%s must not be null" : "@NotNull method %s.%s must not return null";
        Object[] objArr = new Object[(i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6 || i15 == 8 || i15 == 10 || i15 == 13 || i15 == 23) ? 3 : 2];
        if (i15 == 2) {
            objArr[0] = "typeArguments";
        } else if (i15 == 3) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i15 == 5) {
            objArr[0] = "typeSubstitution";
        } else if (i15 == 6) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i15 == 8) {
            objArr[0] = "typeArguments";
        } else if (i15 == 10) {
            objArr[0] = "typeSubstitution";
        } else if (i15 == 13) {
            objArr[0] = "kotlinTypeRefiner";
        } else if (i15 != 23) {
            objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
        } else {
            objArr[0] = "substitutor";
        }
        switch (i15) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 8:
            case 10:
            case 13:
            case 23:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/LazySubstitutingClassDescriptor";
                break;
            case 4:
            case 7:
            case 9:
            case 11:
                objArr[1] = "getMemberScope";
                break;
            case 12:
            case 14:
                objArr[1] = "getUnsubstitutedMemberScope";
                break;
            case 15:
                objArr[1] = "getStaticScope";
                break;
            case 16:
                objArr[1] = "getDefaultType";
                break;
            case 17:
                objArr[1] = "getContextReceivers";
                break;
            case 18:
                objArr[1] = "getConstructors";
                break;
            case 19:
                objArr[1] = "getAnnotations";
                break;
            case 20:
                objArr[1] = "getName";
                break;
            case 21:
                objArr[1] = "getOriginal";
                break;
            case 22:
                objArr[1] = "getContainingDeclaration";
                break;
            case 24:
                objArr[1] = "substitute";
                break;
            case 25:
                objArr[1] = "getKind";
                break;
            case 26:
                objArr[1] = "getModality";
                break;
            case 27:
                objArr[1] = "getVisibility";
                break;
            case 28:
                objArr[1] = "getUnsubstitutedInnerClassesScope";
                break;
            case 29:
                objArr[1] = "getSource";
                break;
            case 30:
                objArr[1] = "getDeclaredTypeParameters";
                break;
            case BERTags.DATE /* 31 */:
                objArr[1] = "getSealedSubclasses";
                break;
            default:
                objArr[1] = "getTypeConstructor";
                break;
        }
        if (i15 == 2 || i15 == 3 || i15 == 5 || i15 == 6 || i15 == 8 || i15 == 10) {
            objArr[2] = "getMemberScope";
        } else if (i15 == 13) {
            objArr[2] = "getUnsubstitutedMemberScope";
        } else if (i15 == 23) {
            objArr[2] = "substitute";
        }
        String str2 = String.format(str, objArr);
        if (i15 != 2 && i15 != 3 && i15 != 5 && i15 != 6 && i15 != 8 && i15 != 10 && i15 != 13 && i15 != 23) {
            throw new IllegalStateException(str2);
        }
        throw new IllegalArgumentException(str2);
    }

    private i2 Q0() {
        if (this.f228953d == null) {
            if (this.f228952c.l()) {
                this.f228953d = this.f228952c;
            } else {
                List<m1> parameters = this.f228951b.o().getParameters();
                this.f228954e = new ArrayList(parameters.size());
                this.f228953d = st.d0.b(parameters, this.f228952c.k(), this, this.f228954e);
                this.f228955f = pq.v.h0(this.f228954e, new a());
            }
        }
        return this.f228953d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public e1 S0(e1 e1Var) {
        return (e1Var == null || this.f228952c.l()) ? e1Var : (e1) Q0().q(e1Var, p2.INVARIANT);
    }

    @Override // vr.i
    public boolean E() {
        return this.f228951b.E();
    }

    @Override // vr.e
    public vr.d H() {
        return this.f228951b.H();
    }

    @Override // yr.z
    public lt.k I0(tt.g gVar) {
        if (gVar == null) {
            K0(13);
        }
        lt.k kVarI0 = this.f228951b.I0(gVar);
        if (!this.f228952c.l()) {
            return new lt.t(kVarI0, Q0());
        }
        if (kVarI0 == null) {
            K0(14);
        }
        return kVarI0;
    }

    @Override // vr.e
    public lt.k O(g2 g2Var) {
        if (g2Var == null) {
            K0(10);
        }
        lt.k kVarM0 = m0(g2Var, ht.e.r(dt.i.g(this)));
        if (kVarM0 == null) {
            K0(11);
        }
        return kVarM0;
    }

    @Override // vr.e
    public boolean O0() {
        return this.f228951b.O0();
    }

    @Override // vr.e
    public c1 P0() {
        throw new UnsupportedOperationException();
    }

    @Override // vr.j1
    /* JADX INFO: renamed from: R0, reason: merged with bridge method [inline-methods] */
    public vr.e c(i2 i2Var) {
        if (i2Var == null) {
            K0(23);
        }
        return i2Var.l() ? this : new y(this, i2.i(i2Var.k(), Q0().k()));
    }

    @Override // vr.e
    public lt.k X() {
        lt.k kVarX = this.f228951b.X();
        if (kVarX == null) {
            K0(28);
        }
        return kVarX;
    }

    @Override // vr.e
    public r1<e1> Y() {
        r1<e1> r1VarY = this.f228951b.Y();
        if (r1VarY == null) {
            return null;
        }
        return r1VarY.b(new b());
    }

    @Override // vr.e
    public lt.k a0() {
        lt.k kVarI0 = I0(ht.e.r(dt.i.g(this.f228951b)));
        if (kVarI0 == null) {
            K0(12);
        }
        return kVarI0;
    }

    @Override // vr.e, vr.n, vr.m
    public vr.m b() {
        vr.m mVarB = this.f228951b.b();
        if (mVarB == null) {
            K0(22);
        }
        return mVarB;
    }

    @Override // vr.e0
    public boolean b0() {
        return this.f228951b.b0();
    }

    @Override // vr.e
    public List<c1> c0() {
        List<c1> list = Collections.EMPTY_LIST;
        if (list == null) {
            K0(17);
        }
        return list;
    }

    @Override // vr.e0
    public boolean d0() {
        return this.f228951b.d0();
    }

    @Override // vr.e
    public boolean e0() {
        return this.f228951b.e0();
    }

    @Override // wr.a
    public wr.h getAnnotations() {
        wr.h annotations = this.f228951b.getAnnotations();
        if (annotations == null) {
            K0(19);
        }
        return annotations;
    }

    @Override // vr.k0
    public zs.f getName() {
        zs.f name = this.f228951b.getName();
        if (name == null) {
            K0(20);
        }
        return name;
    }

    @Override // vr.e, vr.e0, vr.q
    public vr.u h() {
        vr.u uVarH = this.f228951b.h();
        if (uVarH == null) {
            K0(27);
        }
        return uVarH;
    }

    @Override // vr.e
    public boolean j0() {
        return this.f228951b.j0();
    }

    @Override // vr.e
    public vr.f k() {
        vr.f fVarK = this.f228951b.k();
        if (fVarK == null) {
            K0(25);
        }
        return fVarK;
    }

    @Override // vr.p
    public h1 m() {
        h1 h1Var = h1.f208052a;
        if (h1Var == null) {
            K0(29);
        }
        return h1Var;
    }

    @Override // yr.z
    public lt.k m0(g2 g2Var, tt.g gVar) {
        if (g2Var == null) {
            K0(5);
        }
        if (gVar == null) {
            K0(6);
        }
        lt.k kVarM0 = this.f228951b.m0(g2Var, gVar);
        if (!this.f228952c.l()) {
            return new lt.t(kVarM0, Q0());
        }
        if (kVarM0 == null) {
            K0(7);
        }
        return kVarM0;
    }

    @Override // vr.e
    public boolean n() {
        return this.f228951b.n();
    }

    @Override // vr.h
    public x1 o() {
        x1 x1VarO = this.f228951b.o();
        if (this.f228952c.l()) {
            if (x1VarO == null) {
                K0(0);
            }
            return x1VarO;
        }
        if (this.f228956g == null) {
            i2 i2VarQ0 = Q0();
            Collection<st.t0> collectionQ = x1VarO.q();
            ArrayList arrayList = new ArrayList(collectionQ.size());
            Iterator<st.t0> it = collectionQ.iterator();
            while (it.hasNext()) {
                arrayList.add(i2VarQ0.q(it.next(), p2.INVARIANT));
            }
            this.f228956g = new st.v(this, this.f228954e, arrayList, rt.f.f175955e);
        }
        x1 x1Var = this.f228956g;
        if (x1Var == null) {
            K0(1);
        }
        return x1Var;
    }

    @Override // vr.e0
    public boolean o0() {
        return this.f228951b.o0();
    }

    @Override // vr.e
    public Collection<vr.d> p() {
        Collection<vr.d> collectionP = this.f228951b.p();
        ArrayList arrayList = new ArrayList(collectionP.size());
        for (vr.d dVar : collectionP) {
            arrayList.add(((vr.d) dVar.z().h(dVar.Q0()).m(dVar.w()).j(dVar.h()).r(dVar.k()).l(false).build()).c(Q0()));
        }
        return arrayList;
    }

    @Override // vr.e
    public lt.k q0() {
        lt.k kVarQ0 = this.f228951b.q0();
        if (kVarQ0 == null) {
            K0(15);
        }
        return kVarQ0;
    }

    @Override // vr.e
    public vr.e r0() {
        return this.f228951b.r0();
    }

    @Override // vr.e, vr.h
    public e1 t() {
        e1 e1VarM = st.w0.m(st.y.f184168a.a(getAnnotations(), null, null), o(), l2.g(o().getParameters()), false, a0());
        if (e1VarM == null) {
            K0(16);
        }
        return e1VarM;
    }

    @Override // vr.e, vr.i
    public List<m1> v() {
        Q0();
        List<m1> list = this.f228955f;
        if (list == null) {
            K0(30);
        }
        return list;
    }

    @Override // vr.e, vr.e0
    public vr.f0 w() {
        vr.f0 f0VarW = this.f228951b.w();
        if (f0VarW == null) {
            K0(26);
        }
        return f0VarW;
    }

    @Override // vr.e
    public boolean x() {
        return this.f228951b.x();
    }

    @Override // vr.m
    public <R, D> R z0(vr.o<R, D> oVar, D d15) {
        return oVar.d(this, d15);
    }

    @Override // yr.z, vr.m
    /* JADX INFO: renamed from: a */
    public vr.e Q0() {
        vr.e eVarA = this.f228951b.Q0();
        if (eVarA == null) {
            K0(21);
        }
        return eVarA;
    }
}
