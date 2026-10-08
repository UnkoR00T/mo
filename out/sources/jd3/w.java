package jd3;

import android.annotation.SuppressLint;
import android.graphics.Bitmap;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import ld3.UutCardBottomSheetData;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a-\u0010\u0007\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ljd3/o$a$a;", "documentState", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "Loq/i0;", "onSnackBarHidden", "h", "(Ljd3/o$a$a;Li70/p;Ler/a;Lm2/r;I)V", "n", "(Ljd3/o$a$a;Lm2/r;I)V", "uut_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.l {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f102137a = new a();

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Void b(n50.k kVar) {
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class b implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f102138a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f102139b;

        public b(er.l lVar, List list) {
            this.f102138a = lVar;
            this.f102139b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            return this.f102138a.b(this.f102139b.get(i15));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f102140a;

        public c(List list) {
            this.f102140a = list;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = (rVar.W(eVar) ? 4 : 2) | i16;
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
            if (p076m2.t.k()) {
                p076m2.t.o(802480018, i17, -1, "androidx.compose.foundation.lazy.items.<anonymous> (LazyDsl.kt:178)");
            }
            n50.k kVar = (n50.k) this.f102140a.get(i15);
            rVar.X(69812468);
            n50.h0.v(kVar, null, rVar, 0, 2);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void h(final o.a.DataLoaded dataLoaded, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1800932124);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dataLoaded) ? 4 : 2) | i15;
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
            if (p076m2.t.k()) {
                p076m2.t.o(-1800932124, i16, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutCardDocumentContent (UutCardDocumentContent.kt:42)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(dataLoaded.getScaffoldData(), null, y2.m.d(-569423186, true, new er.p() { // from class: jd3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.i(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-65703337, true, new er.q() { // from class: jd3.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return w.j(dataLoaded, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            p088nul.q0.g(false, dataLoaded.d(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jd3.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.m(dataLoaded, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-569423186, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutCardDocumentContent.<anonymous> (UutCardDocumentContent.kt:53)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(final o.a.DataLoaded dataLoaded, final d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = (rVar.W(d3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-65703337, i16, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutCardDocumentContent.<anonymous> (UutCardDocumentContent.kt:56)");
            }
            g30.t.f(dataLoaded.getBottomSheetData(), 0.0f, false, null, null, y2.m.d(-709330658, true, new er.p() { // from class: jd3.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.k(dataLoaded, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), y2.m.d(-826967427, true, new er.p() { // from class: jd3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.l(d3Var, dataLoaded, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, ModalBottomSheetData.f70192e | 1769472, 30);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(o.a.DataLoaded dataLoaded, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-709330658, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutCardDocumentContent.<anonymous>.<anonymous> (UutCardDocumentContent.kt:59)");
            }
            UutCardBottomSheetData bottomSheetContentData = dataLoaded.getBottomSheetContentData();
            if (bottomSheetContentData == null) {
                rVar.X(-430480884);
            } else {
                rVar.X(-430480883);
                Bitmap bitmap = bottomSheetContentData.getBitmap();
                if (bitmap == null) {
                    rVar.X(-393948089);
                } else {
                    rVar.X(-393948088);
                    a70.b.b(bitmap, bottomSheetContentData.getButtonText(), bottomSheetContentData.c(), rVar, 0);
                }
                rVar.R();
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(d3 d3Var, o.a.DataLoaded dataLoaded, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-826967427, i15, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutCardDocumentContent.<anonymous>.<anonymous> (UutCardDocumentContent.kt:70)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.d(companion, 0.0f, 1, null), d3Var);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            f3.c.b bVarG = companion2.g();
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), bVarG, rVar, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            y30.n.Switch controllersData = dataLoaded.getControllersData();
            if (controllersData == null) {
                rVar.X(592513571);
            } else {
                rVar.X(592513572);
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                f3.m mVarP = a3.p(a3.p(companion, 0.0f, aVar.b(rVar, i16).getSpacing100(), 1, null), aVar.b(rVar, i16).getSpacing200(), 0.0f, 2, null);
                p036e4.w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = f3.j.e(rVar, mVarP);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarB, companion3.d());
                n6.i(rVarC2, e0VarT2, companion3.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
                n6.g(rVarC2, companion3.a());
                n6.i(rVarC2, mVarE2, companion3.e());
                q3 q3Var = q3.f39261a;
                y30.m.g(controllersData, rVar, y30.n.Switch.f223693f);
                rVar.x();
            }
            rVar.R();
            y30.n.Switch controllersData2 = dataLoaded.getControllersData();
            if ((controllersData2 != null ? controllersData2.getSelectedItemType() : null) != y30.n.Switch.EnumC5973b.RIGHT || dataLoaded.i().isEmpty()) {
                rVar.X(593116274);
                BaseDocumentData screenData = dataLoaded.getScreenData();
                if (screenData == null) {
                    rVar.X(593116273);
                    rVar.R();
                } else {
                    rVar.X(593116274);
                    o20.i.m(screenData, rVar, BaseDocumentData.f140741h);
                    rVar.R();
                    oq.i0 i0Var2 = oq.i0.f148189a;
                }
                rVar.R();
            } else {
                rVar.X(1127507256);
                n(dataLoaded, rVar, 0);
                rVar.R();
            }
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(o.a.DataLoaded dataLoaded, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        h(dataLoaded, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(final o.a.DataLoaded dataLoaded, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-629556080);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(dataLoaded) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-629556080, i16, -1, "pl.gov.coi.mobywatel.feature.uut.presentation.card.UutMembersListContent (UutCardDocumentContent.kt:108)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarF);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            d1.i.f fVarR = iVar.r(aVar.b(rVarH, i17).getSpacing100());
            d3 d3VarI = a3.i(0.0f, aVar.b(rVarH, i17).getSpacing100(), 0.0f, 0.0f, 13, null);
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(d1.h0.b(i0Var, a3.p(companion, aVar.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), 1.0f, false, 2, null), 0.0f, 1, null);
            boolean zG = rVarH.G(dataLoaded);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: jd3.u
                    @Override // er.l
                    public final Object b(Object obj) {
                        return w.o(dataLoaded, (f1.q0) obj);
                    }
                };
                rVarH.v(objE);
            }
            f1.d.c(mVarF2, null, d3VarI, false, fVarR, null, null, false, null, (er.l) objE, rVarH, 0, 490);
            f3.m mVarN = a3.n(companion, aVar.b(rVarH, i17).getSpacing200());
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB2);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            h30.q.p(new ButtonData(null, null, new k30.a.Large(false, 1, null), new k30.c.WithText(dataLoaded.getUpdateButtonLabel(), null, 2, null), k30.d.a.f107773a, null, dataLoaded.e(), 35, null), false, null, rVarH, 0, 6);
            rVarH.x();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: jd3.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.p(dataLoaded, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(o.a.DataLoaded dataLoaded, f1.q0 q0Var) {
        List<n50.k> listI = dataLoaded.i();
        q0Var.j(listI.size(), null, new b(a.f102137a, listI), y2.m.b(802480018, true, new c(listI)));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(o.a.DataLoaded dataLoaded, int i15, p076m2.r rVar, int i16) {
        n(dataLoaded, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
