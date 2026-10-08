package y63;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.io.IOException;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p036e4.w0;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\u0011\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Ly63/j;", "viewModel", "Loq/i0;", "h", "(Ly63/j;Lm2/r;I)V", "Ly63/j$a;", "data", "Li70/p;", "snackBarState", "l", "(Ly63/j$a;Li70/p;Lm2/r;I)V", "Ly63/j$a$b;", "n", "(Ly63/j$a$b;Li70/p;Lm2/r;I)V", "Ly63/j$a$c;", "r", "(Ly63/j$a$c;Lm2/r;I)V", "snackbarState", "settings_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f224827a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(61330034);
            if (p076m2.t.k()) {
                p076m2.t.o(61330034, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenNoAccessContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MainContactDetailsScreen.kt:124)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    public static final void h(final j jVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1412974833);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1412974833, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreen (MainContactDetailsScreen.kt:41)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(jVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            l(i(f6VarC), j(f6VarB), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y63.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.k(jVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a i(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p j(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(j jVar, int i15, p076m2.r rVar, int i16) {
        h(jVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void l(final j.a aVar, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(690493842);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(690493842, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenContent (MainContactDetailsScreen.kt:57)");
            }
            if (fr.t.c(aVar, j.a.C6024a.f224788a)) {
                rVarH.X(1903844110);
                rVarH.R();
            } else if (aVar instanceof j.a.NoAccess) {
                rVarH.X(2139626150);
                r((j.a.NoAccess) aVar, rVarH, i16 & 14);
                rVarH.R();
            } else {
                if (!(aVar instanceof j.a.Initialized)) {
                    rVarH.X(2139622689);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(2139629691);
                n((j.a.Initialized) aVar, pVar, rVarH, i16 & 126);
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y63.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.m(aVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(j.a aVar, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        l(aVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void n(final j.a.Initialized initialized, final i70.p pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(2117005274);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2117005274, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenInitializedContent (MainContactDetailsScreen.kt:73)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            i70.m.d(alVar, pVar, initialized.c(), null, null, rVarH, (i16 & 112) | 6, 24);
            i50.s.r(initialized.getScaffoldData(), null, y2.m.d(81197904, true, new er.p() { // from class: y63.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.o(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1886006471, true, new er.q() { // from class: y63.p
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.p(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | MLKEMEngine.KyberPolyBytes, 196608, 32762);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y63.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.q(initialized, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(81197904, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenInitializedContent.<anonymous> (MainContactDetailsScreen.kt:83)");
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
    public static final oq.i0 p(j.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1886006471, i15, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenInitializedContent.<anonymous> (MainContactDetailsScreen.kt:85)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), null, rVar, 0, 1), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            w0 w0VarA = d1.e0.a(iVar.r(aVar.b(rVar, i16).getSpacing100()), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            o40.j.i(initialized.getHeaderData(), rVar, 0);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing100()), rVar, 0);
            rVar.X(1632690060);
            List<n50.k> listA = initialized.a();
            int size = listA.size();
            for (int i17 = 0; i17 < size; i17++) {
                n50.h0.v(listA.get(i17), null, rVar, 0, 2);
            }
            rVar.R();
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
    public static final oq.i0 q(j.a.Initialized initialized, i70.p pVar, int i15, p076m2.r rVar, int i16) {
        n(initialized, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    public static final void r(final j.a.NoAccess noAccess, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1951230350);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noAccess) : rVarH.G(noAccess) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1951230350, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenNoAccessContent (MainContactDetailsScreen.kt:104)");
            }
            rVar2 = rVarH;
            i50.s.r(noAccess.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(528075743, true, new er.q() { // from class: y63.m
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.s(noAccess, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: y63.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.t(noAccess, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 s(j.a.NoAccess noAccess, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(528075743, i16, -1, "pl.gov.coi.mobywatel.feature.settings.presentation.contactdetails.main.MainContactDetailsScreenNoAccessContent.<anonymous> (MainContactDetailsScreen.kt:106)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarN = a3.n(mVarL, aVar.b(rVar, i17).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            f3.c.b bVarG = companion2.g();
            d1.i.f fVarE = iVar.e();
            f3.m mVarP = a3.p(d1.h0.b(i0Var, androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), 1.0f, false, 2, null), aVar.b(rVar, i17).getSpacing300(), 0.0f, 2, null);
            w0 w0VarA2 = d1.e0.a(fVarE, bVarG, rVar, 54);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d40.h.f(null, new d40.b.C0864b(null, jz.a.f106881v, d40.i.n.f39717e, a.f224827a, null, null, 33, null), false, rVar, d40.b.C0864b.f39687h << 3, 5);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            Label title = noAccess.getTitle();
            long jI = aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i();
            TextStyle textStyleI = aVar.f(rVar, i17).i();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(null, null, title, null, null, jI, 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVar, 0, 0, 0, 33026011);
            Label description = noAccess.getDescription();
            if (description == null) {
                rVar.X(-1584254974);
                rVar.R();
            } else {
                rVar.X(-1584254973);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
                j70.h.g(null, null, description, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33026011);
                rVar.R();
            }
            rVar.x();
            h30.q.p(noAccess.getButtonData(), false, null, rVar, 0, 6);
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
    public static final oq.i0 t(j.a.NoAccess noAccess, int i15, p076m2.r rVar, int i16) {
        r(noAccess, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
