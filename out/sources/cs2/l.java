package cs2;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import f1.b1;
import f1.q0;
import f1.y0;
import i50.BaseScaffoldData;
import j60.BulletItemStyle;
import java.util.List;
import mx.Label;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import x40.LinkData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f¨\u0006\u000e²\u0006\f\u0010\r\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lcs2/e;", "viewModel", "Loq/i0;", "m", "(Lcs2/e;Lm2/r;I)V", "Lcs2/e$a;", "screenData", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "g", "(Lcs2/e$a;Li70/p;Ler/a;Lm2/r;I)V", "data", "penaltypoints_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f37548a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(e.Data.Content.MiddleSection middleSection) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f37549a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f37550b;

        public b(er.l lVar, List list) {
            this.f37549a = lVar;
            this.f37550b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f37549a.b(this.f37550b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f37551a;

        public c(List list) {
            this.f37551a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            k70.a aVar;
            int i18;
            f3.m.Companion companion;
            int i19;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (t.k()) {
                t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            e.Data.Content.MiddleSection middleSection = (e.Data.Content.MiddleSection) this.f37551a.get(i15);
            rVar.X(-1270595136);
            Label title = middleSection.getTitle();
            k70.a aVar2 = k70.a.f108864a;
            int i25 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar2.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i25).h(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            f3.m.Companion companion2 = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar, i25).getSpacing100()), rVar, 0);
            j70.h.g(null, null, middleSection.getDescription(), null, null, aVar2.a(rVar, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar, i25).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            List<Label> listA = middleSection.a();
            if (listA == null || listA.isEmpty()) {
                aVar = aVar2;
                i18 = i25;
                companion = companion2;
                i19 = 0;
                rVar.X(-1274004362);
            } else {
                rVar.X(-1270121147);
                aVar = aVar2;
                i18 = i25;
                companion = companion2;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing100()), rVar, 0);
                j60.c.b(middleSection.a(), new BulletItemStyle(aVar.f(rVar, i18).b(), aVar.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), null), null, rVar, BulletItemStyle.f99759c << 3, 4);
            }
            rVar.R();
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i18).getSpacing300()), rVar, i19);
            rVar.R();
            if (t.k()) {
                t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.a<i0> {
        d(Object obj) {
            super(0, obj, e.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((e) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            E();
            return i0.f148189a;
        }
    }

    private static final void g(final e.Data data, final i70.p pVar, final er.a<i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(765078826);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(765078826, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.info.PenaltyPointsContent (PenaltyPointsInfoScreen.kt:53)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            final y0 y0VarC = b1.c(0, 0, rVarH, 0, 3);
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(data.getContent().getScaffoldData(), null, y2.m.d(-1975262048, true, new er.p() { // from class: cs2.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.h(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1992221719, true, new er.q() { // from class: cs2.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.i(y0VarC, data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32698);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cs2.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.l(data, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1975262048, i15, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.info.PenaltyPointsContent.<anonymous> (PenaltyPointsInfoScreen.kt:67)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(y0 y0Var, final e.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1992221719, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.info.PenaltyPointsContent.<anonymous> (PenaltyPointsInfoScreen.kt:73)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarO = a3.o(mVarH, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getZero());
            d3 d3VarI = a3.i(0.0f, aVar.b(rVar, i17).getSpacing100(), 0.0f, aVar.b(rVar, i17).getSpacing200(), 5, null);
            boolean zG = rVar.G(data);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: cs2.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return l.j(data, (q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(mVarO, y0Var, d3VarI, false, null, null, null, false, null, (er.l) objE, rVar, 0, 504);
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
    public static final i0 j(final e.Data data, q0 q0Var) {
        List<e.Data.Content.MiddleSection> listB = data.getContent().b();
        q0Var.j(listB.size(), null, new b(a.f37548a, listB), y2.m.b(802480018, true, new c(listB)));
        q0.c(q0Var, null, null, y2.m.b(-517241886, true, new er.q() { // from class: cs2.j
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return l.k(data, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(e.Data data, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(-517241886, i15, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.info.PenaltyPointsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PenaltyPointsInfoScreen.kt:117)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, companion);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label description = data.getContent().getBottomSection().getDescription();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, null, description, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing200()), rVar, 0);
            x40.h.g(data.getContent().getBottomSection().getLinkData(), rVar, LinkData.f216731g);
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
    public static final i0 l(e.Data data, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        g(data, pVar, aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void m(final e eVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1902552731);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1902552731, i16, -1, "pl.gov.coi.mobywatel.feature.penaltypoints.presentation.penaltypoints.info.PenaltyPointsInfoScreen (PenaltyPointsInfoScreen.kt:36)");
            }
            f6 f6VarC = m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(eVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            e.Data dataN = n(f6VarC);
            i70.p pVarO = o(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(eVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new d(eVar);
                rVarH.v(objE);
            }
            g(dataN, pVarO, (er.a) ((mr.g) objE), rVarH, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: cs2.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.p(eVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final e.Data n(f6<e.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p o(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(e eVar, int i15, p076m2.r rVar, int i16) {
        m(eVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
