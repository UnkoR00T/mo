package p012a2;

import androidx.compose.ui.graphics.f;
import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.j;
import d1.x;
import er.p;
import er.q;
import f3.m;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import ju.z0;
import n3.d3;
import n3.t2;
import n3.u1;
import n3.z1;
import n4.f0;
import n4.i;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d4;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import tq.e;
import u0.l;
import u0.x2;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *0\b\u0002\u0010!\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\""}, d2 = {"La2/i4;", "hostState", "Lf3/m;", "modifier", "Lkotlin/Function1;", "La2/v3;", "Loq/i0;", "snackbar", "r", "(La2/i4;Lf3/m;Ler/q;Lm2/r;II)V", "La2/x3;", "", "hasAction", "Landroidx/compose/ui/platform/j;", "accessibilityManager", "", "w", "(La2/x3;ZLandroidx/compose/ui/platform/j;)J", "current", "content", "j", "(La2/v3;Lf3/m;Ler/q;Lm2/r;II)V", "Lu0/l;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Lm2/f6;", "t", "(Lu0/l;ZLer/a;Lm2/r;II)Lm2/f6;", "v", "(Lu0/l;ZLm2/r;I)Lm2/f6;", "FadeInFadeOutTransition", "material"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class h4 {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1596e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ v3 f1597f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f1598g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(v3 v3Var, j jVar, e<? super a> eVar) {
            super(2, eVar);
            this.f1597f = v3Var;
            this.f1598g = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1596e;
            if (i15 == 0) {
                u.b(obj);
                v3 v3Var = this.f1597f;
                if (v3Var != null) {
                    long jW = h4.w(v3Var.getDuration(), this.f1597f.b() != null, this.f1598g);
                    this.f1596e = 1;
                    if (z0.b(jW, this) == objE) {
                        return objE;
                    }
                }
                return i0.f148189a;
            }
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            this.f1597f.dismiss();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f1597f, this.f1598g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1599a;

        static {
            int[] iArr = new int[x3.values().length];
            try {
                iArr[x3.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[x3.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[x3.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f1599a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1600e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f1601f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1602g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Float> f1603h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f1604j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u0.c<Float, u0.p> cVar, boolean z15, l<Float> lVar, er.a<i0> aVar, e<? super c> eVar) {
            super(2, eVar);
            this.f1601f = cVar;
            this.f1602g = z15;
            this.f1603h = lVar;
            this.f1604j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c cVar;
            Object objE = uq.b.e();
            int i15 = this.f1600e;
            if (i15 == 0) {
                u.b(obj);
                u0.c<Float, u0.p> cVar2 = this.f1601f;
                Float fD = vq.b.d(this.f1602g ? 1.0f : 0.0f);
                l<Float> lVar = this.f1603h;
                this.f1600e = 1;
                cVar = this;
                if (u0.c.f(cVar2, fD, lVar, null, null, cVar, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                cVar = this;
            }
            cVar.f1604j.a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new c(this.f1601f, this.f1602g, this.f1603h, this.f1604j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f1605e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f1606f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f1607g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Float> f1608h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u0.c<Float, u0.p> cVar, boolean z15, l<Float> lVar, e<? super d> eVar) {
            super(2, eVar);
            this.f1606f = cVar;
            this.f1607g = z15;
            this.f1608h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f1605e;
            if (i15 == 0) {
                u.b(obj);
                u0.c<Float, u0.p> cVar = this.f1606f;
                Float fD = vq.b.d(this.f1607g ? 1.0f : 0.8f);
                l<Float> lVar = this.f1608h;
                this.f1605e = 1;
                if (u0.c.f(cVar, fD, lVar, null, null, this, 12, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new d(this.f1606f, this.f1607g, this.f1608h, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c7 A[LOOP:0: B:49:0x00c5->B:50:0x00c7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:53:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:56:0x0102 A[LOOP:1: B:55:0x0100->B:56:0x0102, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x0138  */
    /* JADX WARN: Code duplicated, block: B:62:0x0163  */
    /* JADX WARN: Code duplicated, block: B:65:0x016f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0173  */
    /* JADX WARN: Code duplicated, block: B:71:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:74:0x01d1 A[LOOP:2: B:73:0x01cf->B:74:0x01d1, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:77:0x020c  */
    /* JADX WARN: Code duplicated, block: B:79:0x0211  */
    /* JADX WARN: Code duplicated, block: B:82:0x021b  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    private static final void j(final v3 v3Var, m mVar, final q<? super v3, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        m mVar2;
        int i17;
        boolean z15;
        final m mVar3;
        d5 d5VarM;
        m mVar4;
        Object objE;
        final e2 e2Var;
        int i18;
        final String strA;
        int i19;
        int iA;
        er.a<androidx.compose.ui.node.c> aVarB;
        r rVarC;
        p<androidx.compose.ui.node.c, Integer, i0> pVarC;
        List listB;
        int size;
        List listB2;
        ArrayList arrayList;
        int size2;
        int i25;
        final List listI1;
        List listB3;
        List listB4;
        int size3;
        int i26;
        int i27;
        v3 v3Var2 = v3Var;
        r rVarH = rVar.h(1354335728);
        int i28 = (i15 & 6) == 0 ? ((i15 & 8) == 0 ? rVarH.W(v3Var2) : rVarH.G(v3Var2) ? 4 : 2) | i15 : i15;
        int i29 = i16 & 2;
        if (i29 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i28 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(qVar)) {
                    i27 = 256;
                } else {
                    i27 = 128;
                }
                i28 |= i27;
            }
            if ((i28 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i28 & 1)) {
                if (i29 != 0) {
                    mVar4 = m.INSTANCE;
                } else {
                    mVar4 = mVar2;
                }
                if (t.k()) {
                    t.o(1354335728, i28, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
                }
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new e2();
                    rVarH.v(objE);
                }
                e2Var = (e2) objE;
                i18 = 6;
                strA = z4.a(y4.INSTANCE.h(), rVarH, 6);
                if (fr.t.c(v3Var2, e2Var.getCurrent())) {
                    i19 = 6;
                    rVarH.X(83728146);
                } else {
                    rVarH.X(93279711);
                    e2Var.d(v3Var2);
                    listB2 = e2Var.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i25 = 0; i25 < size2; i25++) {
                        arrayList.add((v3) ((FadeInFadeOutAnimationItem) listB2.get(i25)).c());
                    }
                    listI1 = v.i1(arrayList);
                    if (!listI1.contains(v3Var2)) {
                        listI1.add(v3Var2);
                    }
                    e2Var.b().clear();
                    listB3 = e5.b.b(listI1);
                    listB4 = e2Var.b();
                    i26 = 0;
                    for (size3 = listB3.size(); i26 < size3; size3 = size3) {
                        final v3 v3Var3 = (v3) listB3.get(i26);
                        int i35 = i26;
                        final v3 v3Var4 = v3Var2;
                        listB4.add(new FadeInFadeOutAnimationItem(v3Var3, y2.m.d(-1032415134, true, new q() { // from class: a2.z3
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return h4.k(v3Var3, v3Var4, listI1, e2Var, strA, (p) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54)));
                        i26 = i35 + 1;
                        v3Var2 = v3Var;
                        i18 = i18;
                    }
                    i19 = i18;
                }
                rVarH.R();
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                iA = p076m2.m.a(rVarH, 0);
                e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, mVar4);
                androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
                aVarB = companion.b();
                if (rVarH.l() == null) {
                    p076m2.m.d();
                }
                rVarH.K();
                if (rVarH.getInserting()) {
                    rVarH.H(aVarB);
                } else {
                    rVarH.u();
                }
                rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                pVarC = companion.c();
                if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                    rVarC.v(Integer.valueOf(iA));
                    rVarC.j(Integer.valueOf(iA), pVarC);
                }
                n6.i(rVarC, mVarE, companion.e());
                x xVar = x.f39368a;
                e2Var.e(p076m2.m.c(rVarH, 0));
                rVarH.X(-1757732554);
                listB = e2Var.b();
                size = listB.size();
                for (i17 = 0; i17 < size; i17++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) listB.get(i17);
                    final v3 v3Var5 = (v3) fadeInFadeOutAnimationItem.a();
                    q<p<? super r, ? super Integer, i0>, r, Integer, i0> qVarB = fadeInFadeOutAnimationItem.b();
                    rVarH.J(-1515535286, v3Var5);
                    qVarB.w(y2.m.d(2017516783, true, new p() { // from class: a2.a4
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return h4.p(qVar, v3Var5, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, Integer.valueOf(i19));
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
                mVar3 = mVar4;
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new p() { // from class: a2.b4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h4.q(v3Var, mVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i28 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(qVar)) {
                i27 = 256;
            } else {
                i27 = 128;
            }
            i28 |= i27;
        }
        if ((i28 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i28 & 1)) {
            if (i29 != 0) {
                mVar4 = m.INSTANCE;
            } else {
                mVar4 = mVar2;
            }
            if (t.k()) {
                t.o(1354335728, i28, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
            }
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new e2();
                rVarH.v(objE);
            }
            e2Var = (e2) objE;
            i18 = 6;
            strA = z4.a(y4.INSTANCE.h(), rVarH, 6);
            if (fr.t.c(v3Var2, e2Var.getCurrent())) {
                rVarH.X(93279711);
                e2Var.d(v3Var2);
                listB2 = e2Var.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i25 < size2) {
                    arrayList.add((v3) ((FadeInFadeOutAnimationItem) listB2.get(i25)).c());
                }
                listI1 = v.i1(arrayList);
                if (!listI1.contains(v3Var2)) {
                    listI1.add(v3Var2);
                }
                e2Var.b().clear();
                listB3 = e5.b.b(listI1);
                listB4 = e2Var.b();
                i26 = 0;
                while (i26 < size3) {
                    final v3 v3Var6 = (v3) listB3.get(i26);
                    int i36 = i26;
                    final v3 v3Var7 = v3Var2;
                    listB4.add(new FadeInFadeOutAnimationItem(v3Var6, y2.m.d(-1032415134, true, new q() { // from class: a2.z3
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return h4.k(v3Var6, v3Var7, listI1, e2Var, strA, (p) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54)));
                    i26 = i36 + 1;
                    v3Var2 = v3Var;
                    i18 = i18;
                }
                i19 = i18;
            } else {
                i19 = 6;
                rVarH.X(83728146);
            }
            rVarH.R();
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
            iA = p076m2.m.a(rVarH, 0);
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVar4);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI2, companion2.d());
            n6.i(rVarC, e0VarT2, companion2.f());
            pVarC = companion2.c();
            if (rVarC.getInserting()) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            } else {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE2, companion2.e());
            x xVar2 = x.f39368a;
            e2Var.e(p076m2.m.c(rVarH, 0));
            rVarH.X(-1757732554);
            listB = e2Var.b();
            size = listB.size();
            while (i17 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) listB.get(i17);
                final v3 v3Var8 = (v3) fadeInFadeOutAnimationItem2.a();
                q<p<? super r, ? super Integer, i0>, r, Integer, i0> qVarB2 = fadeInFadeOutAnimationItem2.b();
                rVarH.J(-1515535286, v3Var8);
                qVarB2.w(y2.m.d(2017516783, true, new p() { // from class: a2.a4
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return h4.p(qVar, v3Var8, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, Integer.valueOf(i19));
                rVarH.U();
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            mVar3 = mVar4;
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.b4
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h4.q(v3Var, mVar3, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final v3 v3Var, v3 v3Var2, List list, final e2 e2Var, final String str, p pVar, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.G(pVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1032415134, i16, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
            }
            final boolean zC = fr.t.c(v3Var, v3Var2);
            int i17 = zC ? 150 : 75;
            int i18 = (!zC || e5.b.b(list).size() == 1) ? 0 : 75;
            x2 x2VarK = u0.m.k(i17, i18, u0.i0.e());
            boolean zG = rVar.G(v3Var) | rVar.G(e2Var);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: a2.c4
                    @Override // er.a
                    public final Object a() {
                        return h4.l(v3Var, e2Var);
                    }
                };
                rVar.v(objE);
            }
            f6<Float> f6VarT = t(x2VarK, zC, (er.a) objE, rVar, 0, 0);
            f6<Float> f6VarV = v(u0.m.k(i17, i18, u0.i0.d()), zC, rVar, 0);
            m mVarD = z1.d(m.INSTANCE, (131064 & 1) != 0 ? 1.0f : f6VarV.getValue().floatValue(), (131064 & 2) != 0 ? 1.0f : f6VarV.getValue().floatValue(), (131064 & 4) == 0 ? f6VarT.getValue().floatValue() : 1.0f, (131064 & 8) != 0 ? 0.0f : 0.0f, (131064 & 16) != 0 ? 0.0f : 0.0f, (131064 & 32) != 0 ? 0.0f : 0.0f, (131064 & 64) != 0 ? 0.0f : 0.0f, (131064 & 128) != 0 ? 0.0f : 0.0f, (131064 & 256) == 0 ? 0.0f : 0.0f, (131064 & 512) != 0 ? 8.0f : 0.0f, (131064 & 1024) != 0 ? d3.INSTANCE.a() : 0L, (131064 & 2048) != 0 ? t2.a() : null, (131064 & PKIFailureInfo.certConfirmed) != 0 ? false : false, (131064 & PKIFailureInfo.certRevoked) != 0 ? null : null, (131064 & 16384) != 0 ? f.a() : 0L, (32768 & 131064) != 0 ? f.a() : 0L, (131064 & PKIFailureInfo.notAuthorized) != 0 ? u1.INSTANCE.a() : 0);
            boolean zA = rVar.a(zC) | rVar.W(str) | rVar.G(v3Var);
            Object objE2 = rVar.E();
            if (zA || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: a2.d4
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h4.n(zC, str, v3Var, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            m mVarD2 = n4.v.d(mVarD, false, (er.l) objE2, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iA = p076m2.m.a(rVar, 0);
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarD2);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            p<androidx.compose.ui.node.c, Integer, i0> pVarC = companion.c();
            if (rVarC.getInserting() || !fr.t.c(rVarC.E(), Integer.valueOf(iA))) {
                rVarC.v(Integer.valueOf(iA));
                rVarC.j(Integer.valueOf(iA), pVarC);
            }
            n6.i(rVarC, mVarE, companion.e());
            x xVar = x.f39368a;
            pVar.B(rVar, Integer.valueOf(i16 & 14));
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(final v3 v3Var, e2 e2Var) {
        if (!fr.t.c(v3Var, e2Var.getCurrent())) {
            v.J(e2Var.b(), new er.l() { // from class: a2.g4
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(h4.m(v3Var, (FadeInFadeOutAnimationItem) obj));
                }
            });
            d4 scope = e2Var.getScope();
            if (scope != null) {
                scope.invalidate();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(v3 v3Var, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return fr.t.c(fadeInFadeOutAnimationItem.c(), v3Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(boolean z15, String str, final v3 v3Var, n4.i0 i0Var) {
        if (z15) {
            f0.l0(i0Var, i.INSTANCE.b());
        }
        f0.n0(i0Var, str);
        f0.l(i0Var, null, new er.a() { // from class: a2.e4
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(h4.o(v3Var));
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(v3 v3Var) {
        v3Var.dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(q qVar, v3 v3Var, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(2017516783, i15, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
            }
            qVar.w(v3Var, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(v3 v3Var, m mVar, q qVar, int i15, int i16, r rVar, int i17) {
        j(v3Var, mVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void r(final i4 i4Var, m mVar, q<? super v3, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        final m mVar2;
        final q<? super v3, ? super r, ? super Integer, i0> qVar2;
        r rVarH = rVar.h(1351125615);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(i4Var) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.W(mVar) ? 32 : 16;
        }
        int i19 = i16 & 4;
        if (i19 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(qVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                mVar = m.INSTANCE;
            }
            m mVar3 = mVar;
            if (i19 != 0) {
                qVar = i1.f1696a.b();
            }
            if (t.k()) {
                t.o(1351125615, i17, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            v3 v3VarA = i4Var.a();
            j jVar = (j) rVarH.N(g1.c());
            boolean zG = rVarH.G(v3VarA) | rVarH.G(jVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a(v3VarA, jVar, null);
                rVarH.v(objE);
            }
            Function0.d(v3VarA, (p) objE, rVarH, 0);
            q<? super v3, ? super r, ? super Integer, i0> qVar3 = qVar;
            j(i4Var.a(), mVar3, qVar3, rVarH, i17 & 1008, 0);
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar3;
            qVar2 = qVar3;
        } else {
            rVarH.O();
            mVar2 = mVar;
            qVar2 = qVar;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: a2.y3
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h4.s(i4Var, mVar2, qVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(i4 i4Var, m mVar, q qVar, int i15, int i16, r rVar, int i17) {
        r(i4Var, mVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final f6<Float> t(l<Float> lVar, boolean z15, er.a<i0> aVar, r rVar, int i15, int i16) {
        if ((i16 & 4) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: a2.f4
                    @Override // er.a
                    public final Object a() {
                        return h4.u();
                    }
                };
                rVar.v(objE);
            }
            aVar = (er.a) objE;
        }
        er.a<i0> aVar2 = aVar;
        if (t.k()) {
            t.o(1016418159, i15, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object objE2 = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE2 == companion.a()) {
            objE2 = u0.d.b(!z15 ? 1.0f : 0.0f, 0.0f, 2, null);
            rVar.v(objE2);
        }
        u0.c cVar = (u0.c) objE2;
        Boolean boolValueOf = Boolean.valueOf(z15);
        boolean zG = rVar.G(cVar) | ((((i15 & 112) ^ 48) > 32 && rVar.a(z15)) || (i15 & 48) == 32) | rVar.G(lVar) | ((((i15 & 896) ^ MLKEMEngine.KyberPolyBytes) > 256 && rVar.W(aVar2)) || (i15 & MLKEMEngine.KyberPolyBytes) == 256);
        Object objE3 = rVar.E();
        if (zG || objE3 == companion.a()) {
            Object cVar2 = new c(cVar, z15, lVar, aVar2, null);
            rVar.v(cVar2);
            objE3 = cVar2;
        }
        Function0.d(boolValueOf, (p) objE3, rVar, (i15 >> 3) & 14);
        f6<Float> f6VarG = cVar.g();
        if (t.k()) {
            t.n();
        }
        return f6VarG;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    private static final f6<Float> v(l<Float> lVar, boolean z15, r rVar, int i15) {
        if (t.k()) {
            t.o(2003504988, i15, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object objE = rVar.E();
        r.Companion companion = r.INSTANCE;
        if (objE == companion.a()) {
            objE = u0.d.b(!z15 ? 1.0f : 0.8f, 0.0f, 2, null);
            rVar.v(objE);
        }
        u0.c cVar = (u0.c) objE;
        Boolean boolValueOf = Boolean.valueOf(z15);
        boolean zG = rVar.G(cVar) | ((((i15 & 112) ^ 48) > 32 && rVar.a(z15)) || (i15 & 48) == 32) | rVar.G(lVar);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new d(cVar, z15, lVar, null);
            rVar.v(objE2);
        }
        Function0.d(boolValueOf, (p) objE2, rVar, (i15 >> 3) & 14);
        f6<Float> f6VarG = cVar.g();
        if (t.k()) {
            t.n();
        }
        return f6VarG;
    }

    public static final long w(x3 x3Var, boolean z15, j jVar) {
        long j15;
        int i15 = b.f1599a[x3Var.ordinal()];
        if (i15 == 1) {
            j15 = Long.MAX_VALUE;
        } else if (i15 == 2) {
            j15 = 10000;
        } else {
            if (i15 != 3) {
                throw new oq.p();
            }
            j15 = 4000;
        }
        long j16 = j15;
        return jVar == null ? j16 : jVar.a(j16, true, true, z15);
    }
}
