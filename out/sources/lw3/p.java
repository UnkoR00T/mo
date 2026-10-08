package lw3;

import android.content.Context;
import android.widget.ImageView;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import d1.d3;
import d1.r3;
import fx.Rectangle;
import i50.BaseScaffoldData;
import jw3.MaskDefinition;
import mx.Label;
import n3.m1;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p036e4.l1;
import p036e4.q1;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import qw3.State;
import w0.u2;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a+\u0010\u0010\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0019²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002²\u0006\f\u0010\u0015\u001a\u00020\u00148\nX\u008a\u0084\u0002²\u0006\f\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0018\u001a\u00020\f8\n@\nX\u008a\u008e\u0002"}, d2 = {"Llw3/d;", "viewModel", "Loq/i0;", "A", "(Llw3/d;Lm2/r;I)V", "Llw3/d$a;", "data", "l", "(Llw3/d$a;Lm2/r;I)V", "Lp3/c;", "Lm3/k;", "size", "Lm3/e;", "topLeft", "Landroidx/compose/ui/graphics/Color;", "color", "E", "(Lp3/c;JJJ)V", "Lqw3/i;", "state", "", "isFaceValid", "Lmx/a;", "rotationPopupLabel", "boxPosition", "identityphoto_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class p {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.q<m3.e, m3.e, Float, i0> {
        a(Object obj) {
            super(3, obj, qw3.b.class, "transform", "transform-Wko1d7g(JJF)V", 0);
        }

        public final void E(long j15, long j16, float f15) {
            ((qw3.b) this.f66391b).e(j15, j16, f15);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(m3.e eVar, m3.e eVar2, Float f15) {
            E(eVar.getPackedValue(), eVar2.getPackedValue(), f15.floatValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<i0> {
        b(Object obj) {
            super(0, obj, qw3.b.class, "onActionEnd", "onActionEnd()V", 0);
        }

        public final void E() {
            ((qw3.b) this.f66391b).a();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<Integer, i0> {
        c(Object obj) {
            super(1, obj, qw3.b.class, "onRotate", "onRotate(I)V", 0);
        }

        public final void E(int i15) {
            ((qw3.b) this.f66391b).f(i15);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Integer num) {
            E(num.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, qw3.b.class, "onActionEnd", "onActionEnd()V", 0);
        }

        public final void E() {
            ((qw3.b) this.f66391b).a();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    public static final void A(final lw3.d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(887364227);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(dVar) : rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(887364227, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.AdjustmentScreen (AdjustmentScreen.kt:56)");
            }
            final f6 f6VarC = m7.b.c(dVar.getState(), null, null, null, rVarH, 0, 7);
            l(B(f6VarC), rVarH, 0);
            boolean zW = rVarH.W(f6VarC);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: lw3.l
                    @Override // er.a
                    public final Object a() {
                        return p.C(f6VarC);
                    }
                };
                rVarH.v(objE);
            }
            q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lw3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.D(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final lw3.d.Data B(f6<lw3.d.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(f6 f6Var) {
        B(f6Var).d().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(lw3.d dVar, int i15, p076m2.r rVar, int i16) {
        A(dVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void E(p3.c cVar, long j15, long j16, long j17) {
        int iA = m1.INSTANCE.a();
        float fIntBitsToFloat = Float.intBitsToFloat((int) (cVar.a() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (cVar.a() & BodyPartID.bodyIdMax));
        p3.d drawContext = cVar.getDrawContext();
        long jA = drawContext.a();
        drawContext.f().q();
        try {
            drawContext.getTransform().c(0.0f, 0.0f, fIntBitsToFloat, fIntBitsToFloat2, iA);
            p3.f.F1(cVar, new SolidColor(j17, null), j16, j15, 0.0f, null, null, 0, 120, null);
        } finally {
            drawContext.f().j();
            drawContext.g(jA);
        }
    }

    private static final void l(final lw3.d.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1353754162);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1353754162, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.AdjustmentContent (AdjustmentScreen.kt:63)");
            }
            final f6 f6VarC = m7.b.c(data.getAdjustmentVMS().getState(), null, null, null, rVarH, 0, 7);
            final f6 f6VarC2 = m7.b.c(data.getFaceValidationVMS().a(), null, null, null, rVarH, 0, 7);
            final f6 f6VarC3 = m7.b.c(data.getAdjustmentVMS().d(), null, null, null, rVarH, 0, 7);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            long jA = aVar.a(rVarH, i17).getBase().a();
            final float fH = t70.s.H(aVar.b(rVarH, i17).getSpacing200(), rVarH, 0);
            final float fH2 = t70.s.H(aVar.b(rVarH, i17).getSpacing100(), rVarH, 0);
            boolean zD = rVarH.d(jA);
            Object objE = rVarH.E();
            if (zD || objE == p076m2.r.INSTANCE.a()) {
                objE = Color.m0boximpl(Color.m9copywmQWz5c$default(jA, 0.7f, 0.0f, 0.0f, 0.0f, 14, null));
                rVarH.v(objE);
            }
            final long jM20unboximpl = ((Color) objE).m20unboximpl();
            Object objE2 = rVarH.E();
            if (objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = c6.e(m3.e.d(m3.e.INSTANCE.c()), null, 2, null);
                rVarH.v(objE2);
            }
            final a3 a3Var = (a3) objE2;
            rVarH = rVarH;
            i50.s.r(data.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-2038192801, true, new er.q() { // from class: lw3.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.r(data, a3Var, fH, fH2, jM20unboximpl, f6VarC, f6VarC2, f6VarC3, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: lw3.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return p.z(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final State m(f6<State> f6Var) {
        return f6Var.getValue();
    }

    private static final boolean n(f6<Boolean> f6Var) {
        return f6Var.getValue().booleanValue();
    }

    private static final Label o(f6<Label> f6Var) {
        return f6Var.getValue();
    }

    private static final long p(a3<m3.e> a3Var) {
        return a3Var.getValue().getPackedValue();
    }

    private static final void q(a3<m3.e> a3Var, long j15) {
        a3Var.setValue(m3.e.d(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(final lw3.d.Data data, final a3 a3Var, final float f15, final float f16, final long j15, final f6 f6Var, final f6 f6Var2, final f6 f6Var3, final d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2038192801, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.AdjustmentContent.<anonymous> (AdjustmentScreen.kt:78)");
            }
            d1.b0.d(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), null, false, y2.m.d(388034357, true, new er.q() { // from class: lw3.f
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return p.s(d3Var, data, a3Var, f15, f16, j15, f6Var, f6Var2, f6Var3, (d1.c0) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 3078, 6);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(d3 d3Var, final lw3.d.Data data, a3 a3Var, final float f15, final float f16, final long j15, final f6 f6Var, f6 f6Var2, f6 f6Var3, d1.c0 c0Var, p076m2.r rVar, int i15) {
        int i16;
        final a3 a3Var2;
        long jC;
        int i17;
        float fH;
        d1.x xVar;
        f3.m.Companion companion;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(c0Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(388034357, i16, -1, "pl.gov.coi.mobywatel.segment.identityphoto.presentation.adjustment.AdjustmentContent.<anonymous>.<anonymous> (AdjustmentScreen.kt:82)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(d1.a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null), u2.b(0, rVar, 0, 1), rVar, 6, 0), d3Var), rVar, 0);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarA = f3.v.a(companion2, 1.0f);
            Label description = data.getDescription();
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            j70.h.g(mVarA, null, description, null, null, aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i18).d(), null, null, false, false, null, rVar, 6, 0, 0, 33030106);
            p076m2.r rVar2 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar.b(rVar2, i18).getSpacing200()), rVar2, 0);
            f3.m mVarB = d1.k.b(androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 0.7777778f, false, 2, null);
            Object objE = rVar2.E();
            p076m2.r.Companion companion5 = p076m2.r.INSTANCE;
            if (objE == companion5.a()) {
                a3Var2 = a3Var;
                objE = new er.l() { // from class: lw3.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.t(a3Var2, (p036e4.b0) obj);
                    }
                };
                rVar2.v(objE);
            } else {
                a3Var2 = a3Var;
            }
            f3.m mVarA2 = l1.a(mVarB, (er.l) objE);
            boolean zG = rVar2.G(data);
            Object objE2 = rVar2.E();
            if (zG || objE2 == companion5.a()) {
                objE2 = new er.l() { // from class: lw3.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return p.u(data, (c5.r) obj);
                    }
                };
                rVar2.v(objE2);
            }
            f3.m mVarA3 = q1.a(mVarA2, (er.l) objE2);
            w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT2 = rVar2.t();
            f3.m mVarE2 = f3.j.e(rVar2, mVarA3);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarI, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            d1.x xVar2 = d1.x.f39368a;
            final float fH2 = t70.s.H(c0Var.a(), rVar2, 0);
            final float fH3 = t70.s.H(c0Var.b(), rVar2, 0);
            final lw3.d.Data.PictureData pictureData = data.getPictureData();
            if (pictureData == null) {
                rVar2.X(459323435);
                rVar2.R();
                xVar = xVar2;
                companion = companion2;
            } else {
                rVar2.X(459323436);
                boolean zG2 = rVar2.G(pictureData);
                Object objE3 = rVar2.E();
                if (zG2 || objE3 == companion5.a()) {
                    objE3 = new er.l() { // from class: lw3.h
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p.v(pictureData, (Context) obj);
                        }
                    };
                    rVar2.v(objE3);
                }
                er.l lVar = (er.l) objE3;
                f3.m mVarF = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
                qw3.b adjustmentVMS = data.getAdjustmentVMS();
                boolean zG3 = rVar2.G(adjustmentVMS);
                Object objE4 = rVar2.E();
                if (zG3 || objE4 == companion5.a()) {
                    objE4 = new a(adjustmentVMS);
                    rVar2.v(objE4);
                }
                er.q qVar = (er.q) ((mr.g) objE4);
                qw3.b adjustmentVMS2 = data.getAdjustmentVMS();
                boolean zG4 = rVar2.G(adjustmentVMS2);
                Object objE5 = rVar2.E();
                if (zG4 || objE5 == companion5.a()) {
                    objE5 = new b(adjustmentVMS2);
                    rVar2.v(objE5);
                }
                f3.m mVarA4 = ow3.a.a(mVarF, qVar, (er.a) ((mr.g) objE5));
                boolean zB = rVar2.b(fH2) | rVar2.b(fH3) | rVar2.b(f15) | rVar2.b(f16) | rVar2.d(j15);
                Object objE6 = rVar2.E();
                if (zB || objE6 == companion5.a()) {
                    final a3 a3Var3 = a3Var2;
                    objE6 = new er.l() { // from class: lw3.i
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p.w(fH2, fH3, f15, f16, j15, a3Var3, (k3.e) obj);
                        }
                    };
                    rVar2.v(objE6);
                }
                f3.m mVarC = k3.k.c(mVarA4, (er.l) objE6);
                boolean zW = rVar2.W(f6Var);
                Object objE7 = rVar2.E();
                if (zW || objE7 == companion5.a()) {
                    objE7 = new er.l() { // from class: lw3.j
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p.y(f6Var, (androidx.appcompat.widget.r) obj);
                        }
                    };
                    rVar2.v(objE7);
                }
                androidx.compose.ui.viewinterop.e.b(lVar, mVarC, (er.l) objE7, rVar2, 0, 0);
                f3.m mVarF2 = androidx.compose.foundation.layout.d.f(companion2, 0.0f, 1, null);
                MaskDefinition maskDefinition = pictureData.getMaskDefinition();
                if (n(f6Var2)) {
                    rVar2.X(1880297774);
                    jC = ((rw3.a) rVar2.N(rw3.c.c())).b();
                    rVar2.R();
                } else {
                    rVar2.X(1880300604);
                    jC = ((rw3.a) rVar2.N(rw3.c.c())).c();
                    rVar2.R();
                }
                if (n(f6Var2)) {
                    rVar2.X(1880304892);
                    i17 = 0;
                    fH = t70.s.H(aVar.b(rVar2, i18).getSpacing100(), rVar2, 0);
                    rVar2.R();
                } else {
                    i17 = 0;
                    rVar2.X(1880306940);
                    fH = t70.s.H(kw3.d.l(), rVar2, 6);
                    rVar2.R();
                }
                xVar = xVar2;
                companion = companion2;
                kw3.d.d(mVarF2, maskDefinition, jC, fH, 0.0f, 0.0f, 0.0f, 0L, t70.s.H(aVar.b(rVar2, i18).getZero(), rVar2, i17), rVar, 6, 240);
                rVar2 = rVar;
                i0 i0Var2 = i0.f148189a;
                rVar2.R();
            }
            rVar2.x();
            f3.m.Companion companion6 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar2, i18).getSpacing50()), rVar2, 0);
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion6, 0.0f, 1, null);
            w0 w0VarI2 = d1.r.i(companion3.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT3 = rVar2.t();
            f3.m mVarE3 = f3.j.e(rVar2, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB3);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC3 = n6.c(rVar2);
            n6.i(rVarC3, w0VarI2, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            j70.h.g(xVar.d(companion6, companion3.e()), null, data.getRotateInfo(), null, null, aVar.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i18).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
            f3.m mVarR = d1.a3.r(xVar.d(companion6, companion3.c()), 0.0f, aVar.b(rVar, i18).getSpacing250(), 0.0f, aVar.b(rVar, i18).getSpacing250(), 5, null);
            w0 w0VarI3 = d1.r.i(companion3.o(), false);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT4 = rVar.t();
            f3.m mVarE4 = f3.j.e(rVar, mVarR);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB4);
            } else {
                rVar.u();
            }
            p076m2.r rVarC4 = n6.c(rVar);
            n6.i(rVarC4, w0VarI3, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            h30.q.p(data.getRotate90DegreesLeftButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar.b(rVar, i18).getSpacing50()), rVar, 0);
            float sliderDegreesValue = m(f6Var).getSliderDegreesValue();
            Label labelO = o(f6Var3);
            qw3.b adjustmentVMS3 = data.getAdjustmentVMS();
            boolean zG5 = rVar.G(adjustmentVMS3);
            Object objE8 = rVar.E();
            if (zG5 || objE8 == companion5.a()) {
                objE8 = new c(adjustmentVMS3);
                rVar.v(objE8);
            }
            er.l lVar2 = (er.l) ((mr.g) objE8);
            qw3.b adjustmentVMS4 = data.getAdjustmentVMS();
            boolean zG6 = rVar.G(adjustmentVMS4);
            Object objE9 = rVar.E();
            if (zG6 || objE9 == companion5.a()) {
                objE9 = new d(adjustmentVMS4);
                rVar.v(objE9);
            }
            nw3.g.g(i0Var, sliderDegreesValue, labelO, lVar2, (er.a) ((mr.g) objE9), rVar, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(a3 a3Var, p036e4.b0 b0Var) {
        q(a3Var, p036e4.c0.f(b0Var));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(lw3.d.Data data, c5.r rVar) {
        data.getAdjustmentVMS().b((int) (rVar.getPackedValue() >> 32), (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax));
        data.e().b(new Rectangle((int) (rVar.getPackedValue() >> 32), (int) (rVar.getPackedValue() & BodyPartID.bodyIdMax)));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.appcompat.widget.r v(lw3.d.Data.PictureData pictureData, Context context) {
        androidx.appcompat.widget.r rVar = new androidx.appcompat.widget.r(context);
        rVar.setScaleType(ImageView.ScaleType.MATRIX);
        rVar.setImageBitmap(pictureData.getImage());
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final k3.l w(final float f15, final float f16, final float f17, final float f18, final long j15, final a3 a3Var, k3.e eVar) {
        return eVar.e(new er.l() { // from class: lw3.k
            @Override // er.l
            public final Object b(Object obj) {
                return p.x(f15, f16, f17, f18, j15, a3Var, (p3.c) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(float f15, float f16, float f17, float f18, long j15, a3 a3Var, p3.c cVar) {
        cVar.H2();
        E(cVar, m3.k.d((((long) Float.floatToRawIntBits(f16)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(f15) << 32)), m3.e.e((((long) Float.floatToRawIntBits((-Float.intBitsToFloat((int) (p(a3Var) & BodyPartID.bodyIdMax))) - f18)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(-f17) << 32)), j15);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(f6 f6Var, androidx.appcompat.widget.r rVar) {
        rVar.setImageMatrix(m(f6Var).getMatrix());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(lw3.d.Data data, int i15, p076m2.r rVar, int i16) {
        l(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
