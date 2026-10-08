package com.bumptech.glide;

import android.annotation.SuppressLint;
import android.content.Context;
import android.net.Uri;
import android.widget.ImageView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public class k<TranscodeType> extends re.a<k<TranscodeType>> implements Cloneable {
    protected static final re.g Z = new re.g().j(be.j.f18724c).i0(g.LOW).q0(true);
    private final Context D;
    private final l E;
    private final Class<TranscodeType> F;
    private final b G;
    private final d H;
    private m<?, ? super TranscodeType> I;
    private Object K;
    private List<re.f<TranscodeType>> L;
    private k<TranscodeType> O;
    private k<TranscodeType> P;
    private Float R;
    private boolean T = true;
    private boolean X;
    private boolean Y;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f28788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f28789b;

        static {
            int[] iArr = new int[g.values().length];
            f28789b = iArr;
            try {
                iArr[g.LOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f28789b[g.NORMAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f28789b[g.HIGH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f28789b[g.IMMEDIATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[ImageView.ScaleType.values().length];
            f28788a = iArr2;
            try {
                iArr2[ImageView.ScaleType.CENTER_CROP.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f28788a[ImageView.ScaleType.CENTER_INSIDE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f28788a[ImageView.ScaleType.FIT_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f28788a[ImageView.ScaleType.FIT_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f28788a[ImageView.ScaleType.FIT_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f28788a[ImageView.ScaleType.FIT_XY.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f28788a[ImageView.ScaleType.CENTER.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f28788a[ImageView.ScaleType.MATRIX.ordinal()] = 8;
            } catch (NoSuchFieldError unused12) {
            }
        }
    }

    @SuppressLint({"CheckResult"})
    protected k(b bVar, l lVar, Class<TranscodeType> cls, Context context) {
        this.G = bVar;
        this.E = lVar;
        this.F = cls;
        this.D = context;
        this.I = lVar.s(cls);
        this.H = bVar.i();
        F0(lVar.q());
        b(lVar.r());
    }

    private re.d A0(se.h<TranscodeType> hVar, re.f<TranscodeType> fVar, re.a<?> aVar, Executor executor) {
        return B0(new Object(), hVar, fVar, null, this.I, aVar.A(), aVar.x(), aVar.w(), aVar, executor);
    }

    private re.d B0(Object obj, se.h<TranscodeType> hVar, re.f<TranscodeType> fVar, re.e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i15, int i16, re.a<?> aVar, Executor executor) {
        re.b bVar;
        re.e eVar2;
        if (this.P != null) {
            bVar = new re.b(obj, eVar);
            eVar2 = bVar;
        } else {
            bVar = null;
            eVar2 = eVar;
        }
        re.d dVarC0 = C0(obj, hVar, fVar, eVar2, mVar, gVar, i15, i16, aVar, executor);
        if (bVar == null) {
            return dVarC0;
        }
        int iX = this.P.x();
        int iW = this.P.w();
        if (ve.l.t(i15, i16) && !this.P.Y()) {
            iX = aVar.x();
            iW = aVar.w();
        }
        k<TranscodeType> kVar = this.P;
        re.b bVar2 = bVar;
        bVar2.p(dVarC0, kVar.B0(obj, hVar, fVar, bVar2, kVar.I, kVar.A(), iX, iW, this.P, executor));
        return bVar2;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    private re.d C0(Object obj, se.h<TranscodeType> hVar, re.f<TranscodeType> fVar, re.e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i15, int i16, re.a<?> aVar, Executor executor) {
        k<TranscodeType> kVar = this.O;
        if (kVar == null) {
            if (this.R == null) {
                return S0(obj, hVar, fVar, aVar, eVar, mVar, gVar, i15, i16, executor);
            }
            re.j jVar = new re.j(obj, eVar);
            jVar.o(S0(obj, hVar, fVar, aVar, jVar, mVar, gVar, i15, i16, executor), S0(obj, hVar, fVar, aVar.clone().p0(this.R.floatValue()), jVar, mVar, E0(gVar), i15, i16, executor));
            return jVar;
        }
        if (this.Y) {
            throw new IllegalStateException("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
        }
        m<?, ? super TranscodeType> mVar2 = kVar.T ? mVar : kVar.I;
        g gVarA = kVar.Q() ? this.O.A() : E0(gVar);
        int iX = this.O.x();
        int iW = this.O.w();
        if (ve.l.t(i15, i16) && !this.O.Y()) {
            iX = aVar.x();
            iW = aVar.w();
        }
        re.j jVar2 = new re.j(obj, eVar);
        re.d dVarS0 = S0(obj, hVar, fVar, aVar, jVar2, mVar, gVar, i15, i16, executor);
        this.Y = true;
        k kVar2 = (k<TranscodeType>) this.O;
        re.d dVarB0 = kVar2.B0(obj, hVar, fVar, jVar2, mVar2, gVarA, iX, iW, kVar2, executor);
        this.Y = false;
        jVar2.o(dVarS0, dVarB0);
        return jVar2;
    }

    private g E0(g gVar) {
        int i15 = a.f28789b[gVar.ordinal()];
        if (i15 == 1) {
            return g.NORMAL;
        }
        if (i15 == 2) {
            return g.HIGH;
        }
        if (i15 == 3 || i15 == 4) {
            return g.IMMEDIATE;
        }
        throw new IllegalArgumentException("unknown priority: " + A());
    }

    @SuppressLint({"CheckResult"})
    private void F0(List<re.f<Object>> list) {
        Iterator<re.f<Object>> it = list.iterator();
        while (it.hasNext()) {
            x0((re.f) it.next());
        }
    }

    private <Y extends se.h<TranscodeType>> Y J0(Y y15, re.f<TranscodeType> fVar, re.a<?> aVar, Executor executor) {
        ve.k.d(y15);
        if (!this.X) {
            throw new IllegalArgumentException("You must call #load() before calling #into()");
        }
        re.d dVarA0 = A0(y15, fVar, aVar, executor);
        re.d dVarB = y15.b();
        if (dVarA0.i(dVarB) && !L0(aVar, dVarB)) {
            if (!((re.d) ve.k.d(dVarB)).isRunning()) {
                dVarB.j();
            }
            return y15;
        }
        this.E.o(y15);
        y15.i(dVarA0);
        this.E.z(y15, dVarA0);
        return y15;
    }

    private boolean L0(re.a<?> aVar, re.d dVar) {
        return !aVar.P() && dVar.a();
    }

    private k<TranscodeType> Q0(Object obj) {
        if (N()) {
            return clone().Q0(obj);
        }
        this.K = obj;
        this.X = true;
        return m0();
    }

    private k<TranscodeType> R0(Uri uri, k<TranscodeType> kVar) {
        return (uri == null || !"android.resource".equals(uri.getScheme())) ? kVar : z0(kVar);
    }

    private re.d S0(Object obj, se.h<TranscodeType> hVar, re.f<TranscodeType> fVar, re.a<?> aVar, re.e eVar, m<?, ? super TranscodeType> mVar, g gVar, int i15, int i16, Executor executor) {
        Context context = this.D;
        d dVar = this.H;
        return re.i.z(context, dVar, obj, this.K, this.F, aVar, i15, i16, gVar, hVar, fVar, this.L, eVar, dVar.f(), mVar.c(), executor);
    }

    private k<TranscodeType> z0(k<TranscodeType> kVar) {
        return kVar.r0(this.D.getTheme()).o0(ue.a.c(this.D));
    }

    @Override // re.a
    /* JADX INFO: renamed from: D0, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> clone() {
        k<TranscodeType> kVar = (k) super.clone();
        kVar.I = kVar.I.clone();
        if (kVar.L != null) {
            kVar.L = new ArrayList(kVar.L);
        }
        k<TranscodeType> kVar2 = kVar.O;
        if (kVar2 != null) {
            kVar.O = kVar2.clone();
        }
        k<TranscodeType> kVar3 = kVar.P;
        if (kVar3 != null) {
            kVar.P = kVar3.clone();
        }
        return kVar;
    }

    public <Y extends se.h<TranscodeType>> Y G0(Y y15) {
        return (Y) I0(y15, null, ve.e.b());
    }

    <Y extends se.h<TranscodeType>> Y I0(Y y15, re.f<TranscodeType> fVar, Executor executor) {
        return (Y) J0(y15, fVar, this, executor);
    }

    public se.i<ImageView, TranscodeType> K0(ImageView imageView) {
        re.a aVarC0;
        ve.l.a();
        ve.k.d(imageView);
        if (!X() && U() && imageView.getScaleType() != null) {
            switch (a.f28788a[imageView.getScaleType().ordinal()]) {
                case 1:
                    aVarC0 = clone().c0();
                    break;
                case 2:
                    aVarC0 = clone().d0();
                    break;
                case 3:
                case 4:
                case 5:
                    aVarC0 = clone().e0();
                    break;
                case 6:
                    aVarC0 = clone().d0();
                    break;
                default:
                    aVarC0 = this;
                    break;
            }
        } else {
            aVarC0 = this;
        }
        return (se.i) J0(this.H.a(imageView, this.F), null, aVarC0, ve.e.b());
    }

    public k<TranscodeType> M0(Uri uri) {
        return R0(uri, Q0(uri));
    }

    public k<TranscodeType> N0(Object obj) {
        return Q0(obj);
    }

    public k<TranscodeType> P0(String str) {
        return Q0(str);
    }

    @Override // re.a
    public boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (super.equals(kVar) && Objects.equals(this.F, kVar.F) && this.I.equals(kVar.I) && Objects.equals(this.K, kVar.K) && Objects.equals(this.L, kVar.L) && Objects.equals(this.O, kVar.O) && Objects.equals(this.P, kVar.P) && Objects.equals(this.R, kVar.R) && this.T == kVar.T && this.X == kVar.X) {
                return true;
            }
        }
        return false;
    }

    @Override // re.a
    public int hashCode() {
        return ve.l.p(this.X, ve.l.p(this.T, ve.l.o(this.R, ve.l.o(this.P, ve.l.o(this.O, ve.l.o(this.L, ve.l.o(this.K, ve.l.o(this.I, ve.l.o(this.F, super.hashCode())))))))));
    }

    public k<TranscodeType> x0(re.f<TranscodeType> fVar) {
        if (N()) {
            return clone().x0(fVar);
        }
        if (fVar != null) {
            if (this.L == null) {
                this.L = new ArrayList();
            }
            this.L.add(fVar);
        }
        return m0();
    }

    @Override // re.a
    /* JADX INFO: renamed from: y0, reason: merged with bridge method [inline-methods] */
    public k<TranscodeType> b(re.a<?> aVar) {
        ve.k.d(aVar);
        return (k) super.b(aVar);
    }
}
