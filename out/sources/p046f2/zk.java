package p046f2;

import androidx.compose.ui.platform.g1;
import androidx.compose.ui.platform.j;
import d1.x;
import er.p;
import er.q;
import f3.m;
import h2.a2;
import h2.b2;
import java.util.ArrayList;
import java.util.List;
import ju.p0;
import ju.z0;
import l2.k0;
import n3.z1;
import n4.f0;
import n4.i;
import oq.i0;
import oq.u;
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
import u0.j0;
import u0.l;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a7\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007¢\u0006\u0004\b\b\u0010\t\u001a%\u0010\u0010\u001a\u00020\u000f*\u00020\n2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a7\u0010\u0014\u001a\u00020\u00062\b\u0010\u0012\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a;\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000b2\u000e\b\u0002\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00060\u001aH\u0003¢\u0006\u0004\b\u001d\u0010\u001e\u001a+\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00170\u001c2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00162\u0006\u0010\u0019\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001f\u0010 *0\b\u0002\u0010!\"\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u001a\u0012\u0004\u0012\u00020\u00060\u0004¨\u0006\""}, d2 = {"Lf2/al;", "hostState", "Lf3/m;", "modifier", "Lkotlin/Function1;", "Lf2/nk;", "Loq/i0;", "snackbar", "r", "(Lf2/al;Lf3/m;Ler/q;Lm2/r;II)V", "Lf2/pk;", "", "hasAction", "Landroidx/compose/ui/platform/j;", "accessibilityManager", "", "w", "(Lf2/pk;ZLandroidx/compose/ui/platform/j;)J", "current", "content", "j", "(Lf2/nk;Lf3/m;Ler/q;Lm2/r;II)V", "Lu0/l;", "", "animation", "visible", "Lkotlin/Function0;", "onAnimationFinish", "Lm2/f6;", "t", "(Lu0/l;ZLer/a;Lm2/r;II)Lm2/f6;", "v", "(Lu0/l;ZLm2/r;I)Lm2/f6;", "FadeInFadeOutTransition", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class zk {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58528e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ nk f58529f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ j f58530g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(nk nkVar, j jVar, e<? super a> eVar) {
            super(2, eVar);
            this.f58529f = nkVar;
            this.f58530g = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f58528e;
            if (i15 == 0) {
                u.b(obj);
                nk nkVar = this.f58529f;
                if (nkVar != null) {
                    long jW = zk.w(nkVar.getVisuals().getDuration(), this.f58529f.getVisuals().getActionLabel() != null, this.f58530g);
                    this.f58528e = 1;
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
            this.f58529f.dismiss();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f58529f, this.f58530g, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f58531a;

        static {
            int[] iArr = new int[pk.values().length];
            try {
                iArr[pk.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[pk.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[pk.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f58531a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58532e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f58533f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f58534g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Float> f58535h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f58536j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u0.c<Float, u0.p> cVar, boolean z15, l<Float> lVar, er.a<i0> aVar, e<? super c> eVar) {
            super(2, eVar);
            this.f58533f = cVar;
            this.f58534g = z15;
            this.f58535h = lVar;
            this.f58536j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c cVar;
            Object objE = uq.b.e();
            int i15 = this.f58532e;
            if (i15 == 0) {
                u.b(obj);
                u0.c<Float, u0.p> cVar2 = this.f58533f;
                Float fD = vq.b.d(this.f58534g ? 1.0f : 0.0f);
                l<Float> lVar = this.f58535h;
                this.f58532e = 1;
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
            cVar.f58536j.a();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new c(this.f58533f, this.f58534g, this.f58535h, this.f58536j, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f58537e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ u0.c<Float, u0.p> f58538f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f58539g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l<Float> f58540h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u0.c<Float, u0.p> cVar, boolean z15, l<Float> lVar, e<? super d> eVar) {
            super(2, eVar);
            this.f58538f = cVar;
            this.f58539g = z15;
            this.f58540h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f58537e;
            if (i15 == 0) {
                u.b(obj);
                u0.c<Float, u0.p> cVar = this.f58538f;
                Float fD = vq.b.d(this.f58539g ? 1.0f : 0.8f);
                l<Float> lVar = this.f58540h;
                this.f58537e = 1;
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
            return new d(this.f58538f, this.f58539g, this.f58540h, eVar);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x003e  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x005f  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0087  */
    /* JADX WARN: Code duplicated, block: B:45:0x009d  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bd A[LOOP:0: B:46:0x00bb->B:47:0x00bd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:53:0x00f7 A[LOOP:1: B:52:0x00f5->B:53:0x00f7, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:55:0x011f  */
    /* JADX WARN: Code duplicated, block: B:58:0x014f  */
    /* JADX WARN: Code duplicated, block: B:61:0x015b  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:65:0x01ab A[LOOP:2: B:64:0x01a9->B:65:0x01ab, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:68:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:69:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:72:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:77:? A[RETURN, SYNTHETIC] */
    private static final void j(final nk nkVar, m mVar, final q<? super nk, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        m mVar2;
        boolean z15;
        m mVar3;
        d5 d5VarM;
        final String strB;
        Object objE;
        final ec ecVar;
        er.a<androidx.compose.ui.node.c> aVarB;
        List listB;
        int size;
        int i17;
        List listB2;
        ArrayList arrayList;
        int size2;
        int i18;
        List listI1;
        List listB3;
        List listB4;
        int size3;
        int i19;
        int i25;
        r rVarH = rVar.h(-977568115);
        int i26 = (i15 & 6) == 0 ? (rVarH.W(nkVar) ? 4 : 2) | i15 : i15;
        int i27 = i16 & 2;
        if (i27 == 0) {
            if ((i15 & 48) == 0) {
                mVar2 = mVar;
                i26 |= rVarH.W(mVar2) ? 32 : 16;
            }
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                if (rVarH.G(qVar)) {
                    i25 = 256;
                } else {
                    i25 = 128;
                }
                i26 |= i25;
            }
            if ((i26 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i26 & 1)) {
                if (i27 != 0) {
                    mVar3 = m.INSTANCE;
                } else {
                    mVar3 = mVar2;
                }
                if (t.k()) {
                    t.o(-977568115, i26, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
                }
                a2.Companion companion = a2.INSTANCE;
                strB = b2.b(a2.a(ih.K), rVarH, 0);
                objE = rVarH.E();
                if (objE == r.INSTANCE.a()) {
                    objE = new ec();
                    rVarH.v(objE);
                }
                ecVar = (ec) objE;
                if (fr.t.c(nkVar, ecVar.getCurrent())) {
                    rVarH.X(1443889109);
                    rVarH.R();
                } else {
                    rVarH.X(1441886385);
                    ecVar.d(nkVar);
                    listB2 = ecVar.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i18 = 0; i18 < size2; i18++) {
                        arrayList.add((nk) ((FadeInFadeOutAnimationItem) listB2.get(i18)).c());
                    }
                    listI1 = v.i1(arrayList);
                    if (!listI1.contains(nkVar)) {
                        listI1.add(nkVar);
                    }
                    ecVar.b().clear();
                    listB3 = e5.b.b(listI1);
                    listB4 = ecVar.b();
                    size3 = listB3.size();
                    i19 = 0;
                    while (i19 < size3) {
                        final nk nkVar2 = (nk) listB3.get(i19);
                        listB4.add(new FadeInFadeOutAnimationItem(nkVar2, y2.m.d(-1952400805, true, new q() { // from class: f2.rk
                            @Override // er.q
                            public final Object w(Object obj, Object obj2, Object obj3) {
                                return zk.k(nkVar2, nkVar, ecVar, strB, (p) obj, (r) obj2, ((Integer) obj3).intValue());
                            }
                        }, rVarH, 54)));
                        i19++;
                        strB = strB;
                    }
                    rVarH.R();
                }
                w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
                int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
                e0 e0VarT = rVarH.t();
                m mVarE = f3.j.e(rVarH, mVar3);
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
                r rVarC = n6.c(rVarH);
                n6.i(rVarC, w0VarI, companion2.d());
                n6.i(rVarC, e0VarT, companion2.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
                n6.g(rVarC, companion2.a());
                n6.i(rVarC, mVarE, companion2.e());
                x xVar = x.f39368a;
                ecVar.e(p076m2.m.c(rVarH, 0));
                rVarH.X(-1888182177);
                listB = ecVar.b();
                size = listB.size();
                for (i17 = 0; i17 < size; i17++) {
                    FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem = (FadeInFadeOutAnimationItem) listB.get(i17);
                    final nk nkVar3 = (nk) fadeInFadeOutAnimationItem.a();
                    q<p<? super r, ? super Integer, i0>, r, Integer, i0> qVarB = fadeInFadeOutAnimationItem.b();
                    rVarH.J(1325010085, nkVar3);
                    qVarB.w(y2.m.d(-1893791890, true, new p() { // from class: f2.sk
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return zk.p(qVar, nkVar3, (r) obj, ((Integer) obj2).intValue());
                        }
                    }, rVarH, 54), rVarH, 6);
                    rVarH.U();
                }
                rVarH.R();
                rVarH.x();
                if (t.k()) {
                    t.n();
                }
            } else {
                rVarH.O();
                mVar3 = mVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                final m mVar4 = mVar3;
                d5VarM.a(new p() { // from class: f2.tk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return zk.q(nkVar, mVar4, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i26 |= 48;
        mVar2 = mVar;
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            if (rVarH.G(qVar)) {
                i25 = 256;
            } else {
                i25 = 128;
            }
            i26 |= i25;
        }
        if ((i26 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i26 & 1)) {
            if (i27 != 0) {
                mVar3 = m.INSTANCE;
            } else {
                mVar3 = mVar2;
            }
            if (t.k()) {
                t.o(-977568115, i26, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
            }
            a2.Companion companion3 = a2.INSTANCE;
            strB = b2.b(a2.a(ih.K), rVarH, 0);
            objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = new ec();
                rVarH.v(objE);
            }
            ecVar = (ec) objE;
            if (fr.t.c(nkVar, ecVar.getCurrent())) {
                rVarH.X(1441886385);
                ecVar.d(nkVar);
                listB2 = ecVar.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i18 < size2) {
                    arrayList.add((nk) ((FadeInFadeOutAnimationItem) listB2.get(i18)).c());
                }
                listI1 = v.i1(arrayList);
                if (!listI1.contains(nkVar)) {
                    listI1.add(nkVar);
                }
                ecVar.b().clear();
                listB3 = e5.b.b(listI1);
                listB4 = ecVar.b();
                size3 = listB3.size();
                i19 = 0;
                while (i19 < size3) {
                    final nk nkVar4 = (nk) listB3.get(i19);
                    listB4.add(new FadeInFadeOutAnimationItem(nkVar4, y2.m.d(-1952400805, true, new q() { // from class: f2.rk
                        @Override // er.q
                        public final Object w(Object obj, Object obj2, Object obj3) {
                            return zk.k(nkVar4, nkVar, ecVar, strB, (p) obj, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVarH, 54)));
                    i19++;
                    strB = strB;
                }
                rVarH.R();
            } else {
                rVarH.X(1443889109);
                rVarH.R();
            }
            w0 w0VarI2 = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVar3);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            aVarB = companion4.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            x xVar2 = x.f39368a;
            ecVar.e(p076m2.m.c(rVarH, 0));
            rVarH.X(-1888182177);
            listB = ecVar.b();
            size = listB.size();
            while (i17 < size) {
                FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem2 = (FadeInFadeOutAnimationItem) listB.get(i17);
                final nk nkVar5 = (nk) fadeInFadeOutAnimationItem2.a();
                q<p<? super r, ? super Integer, i0>, r, Integer, i0> qVarB2 = fadeInFadeOutAnimationItem2.b();
                rVarH.J(1325010085, nkVar5);
                qVarB2.w(y2.m.d(-1893791890, true, new p() { // from class: f2.sk
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return zk.p(qVar, nkVar5, (r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, 6);
                rVarH.U();
            }
            rVarH.R();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            final m mVar5 = mVar3;
            d5VarM.a(new p() { // from class: f2.tk
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return zk.q(nkVar, mVar5, qVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(final nk nkVar, nk nkVar2, final ec ecVar, final String str, p pVar, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.G(pVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-1952400805, i16, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            final boolean zC = fr.t.c(nkVar, nkVar2);
            j0 j0VarB = of.b(k0.FastEffects, rVar, 6);
            boolean zW = rVar.W(nkVar) | rVar.G(ecVar);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.uk
                    @Override // er.a
                    public final Object a() {
                        return zk.l(nkVar, ecVar);
                    }
                };
                rVar.v(objE);
            }
            f6<Float> f6VarT = t(j0VarB, zC, (er.a) objE, rVar, 0, 0);
            f6<Float> f6VarV = v(of.b(k0.FastSpatial, rVar, 6), zC, rVar, 0);
            m mVarG = z1.g(m.INSTANCE, f6VarV.getValue().floatValue(), f6VarV.getValue().floatValue(), f6VarT.getValue().floatValue(), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0L, null, false, null, 0L, 0L, 0, 0, null, 524280, null);
            boolean zA = rVar.a(zC) | rVar.W(nkVar) | rVar.W(str);
            Object objE2 = rVar.E();
            if (zA || objE2 == r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: f2.vk
                    @Override // er.l
                    public final Object b(Object obj) {
                        return zk.n(zC, str, nkVar, (n4.i0) obj);
                    }
                };
                rVar.v(objE2);
            }
            m mVarD = n4.v.d(mVarG, false, (er.l) objE2, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            e0 e0VarT = rVar.t();
            m mVarE = f3.j.e(rVar, mVarD);
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
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
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
    public static final i0 l(final nk nkVar, ec ecVar) {
        if (!fr.t.c(nkVar, ecVar.getCurrent())) {
            v.J(ecVar.b(), new er.l() { // from class: f2.yk
                @Override // er.l
                public final Object b(Object obj) {
                    return Boolean.valueOf(zk.m(nkVar, (FadeInFadeOutAnimationItem) obj));
                }
            });
            d4 scope = ecVar.getScope();
            if (scope != null) {
                scope.invalidate();
            }
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean m(nk nkVar, FadeInFadeOutAnimationItem fadeInFadeOutAnimationItem) {
        return fr.t.c(fadeInFadeOutAnimationItem.c(), nkVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(boolean z15, String str, final nk nkVar, n4.i0 i0Var) {
        if (z15) {
            f0.l0(i0Var, i.INSTANCE.b());
        }
        f0.l(i0Var, null, new er.a() { // from class: f2.wk
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(zk.o(nkVar));
            }
        }, 1, null);
        f0.n0(i0Var, str);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(nk nkVar) {
        nkVar.dismiss();
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(q qVar, nk nkVar, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1893791890, i15, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:382)");
            }
            qVar.w(nkVar, rVar, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(nk nkVar, m mVar, q qVar, int i15, int i16, r rVar, int i17) {
        j(nkVar, mVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    public static final void r(final al alVar, m mVar, q<? super nk, ? super r, ? super Integer, i0> qVar, r rVar, final int i15, final int i16) {
        int i17;
        final m mVar2;
        final q<? super nk, ? super r, ? super Integer, i0> qVar2;
        r rVarH = rVar.h(-1077081618);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.W(alVar) ? 4 : 2) | i15;
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
                qVar = v3.f58047a.b();
            }
            if (t.k()) {
                t.o(-1077081618, i17, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:220)");
            }
            nk nkVarB = alVar.b();
            j jVar = (j) rVarH.N(g1.c());
            boolean zW = rVarH.W(nkVarB) | rVarH.G(jVar);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new a(nkVarB, jVar, null);
                rVarH.v(objE);
            }
            Function0.d(nkVarB, (p) objE, rVarH, 0);
            q<? super nk, ? super r, ? super Integer, i0> qVar3 = qVar;
            j(alVar.b(), mVar3, qVar3, rVarH, i17 & 1008, 0);
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
            d5VarM.a(new p() { // from class: f2.qk
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return zk.s(alVar, mVar2, qVar2, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(al alVar, m mVar, q qVar, int i15, int i16, r rVar, int i17) {
        r(alVar, mVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final f6<Float> t(l<Float> lVar, boolean z15, er.a<i0> aVar, r rVar, int i15, int i16) {
        if ((i16 & 4) != 0) {
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: f2.xk
                    @Override // er.a
                    public final Object a() {
                        return zk.u();
                    }
                };
                rVar.v(objE);
            }
            aVar = (er.a) objE;
        }
        er.a<i0> aVar2 = aVar;
        if (t.k()) {
            t.o(1431889134, i15, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:405)");
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
            t.o(1966809761, i15, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:415)");
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

    public static final long w(pk pkVar, boolean z15, j jVar) {
        long j15;
        int i15 = b.f58531a[pkVar.ordinal()];
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
