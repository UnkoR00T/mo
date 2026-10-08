package xu1;

import android.annotation.SuppressLint;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import d1.r3;
import g30.ModalBottomSheetData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import o20.BaseDocumentData;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import q4.TextStyle;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import t40.InfoRowListData;
import zu1.DrivingLicenceBottomSheetData;
import zu1.EmptyDrivingLicenceData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a1\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\r2\b\b\u0002\u0010\b\u001a\u00020\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\rH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0017\u0010\u0014\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0012H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0017\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u0017\u0010\u001a\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0019H\u0003¢\u0006\u0004\b\u001a\u0010\u001b¨\u0006\u001c²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lxu1/x;", "viewModel", "Loq/i0;", "r", "(Lxu1/x;Lm2/r;I)V", "Lxu1/x$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "onSnackBarHidden", "v", "(Lxu1/x$a;Li70/p;Ler/a;Lm2/r;I)V", "Lxu1/x$a$b;", "x", "(Lxu1/x$a$b;Li70/p;Ler/a;Lm2/r;II)V", "p", "(Lxu1/x$a$b;Lm2/r;I)V", "Lzu1/a$a;", "content", "n", "(Lzu1/a$a;Lm2/r;I)V", "Lzu1/c;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lzu1/c;Lm2/r;I)V", "Lxu1/x$a$c;", "E", "(Lxu1/x$a$c;Lm2/r;I)V", "drivinglicence_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, x.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((x) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.p<p076m2.r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f221372a = new b();

        b() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(p076m2.r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(p076m2.r rVar, int i15) {
            rVar.X(850272837);
            if (p076m2.t.k()) {
                p076m2.t.o(850272837, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.EmptyDrivingLicenceContent.<anonymous>.<anonymous>.<anonymous> (DrivingLicenceMainScreen.kt:215)");
            }
            long primary = k70.a.f108864a.a(rVar, k70.a.f108865b).getBase().getPrimary();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return primary;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1612210469, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreenInitialized.<anonymous> (DrivingLicenceMainScreen.kt:108)");
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
    public static final oq.i0 B(x.a.Initialized initialized, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1814829465, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreenInitialized.<anonymous> (DrivingLicenceMainScreen.kt:102)");
            }
            DrivingLicenceBottomSheetData.InterfaceC6414a content = initialized.getBottomSheetData().getContent();
            if (content == null) {
                rVar.X(536310316);
            } else {
                rVar.X(536310317);
                n(content, rVar, 0);
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
    public static final oq.i0 C(x.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1305547349, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreenInitialized.<anonymous> (DrivingLicenceMainScreen.kt:114)");
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
            if (initialized.getControllerPairVisible()) {
                rVar.X(-1332172766);
                k70.a aVar = k70.a.f108864a;
                int i17 = k70.a.f108865b;
                f3.m mVarP = a3.p(a3.p(companion, 0.0f, aVar.b(rVar, i17).getSpacing100(), 1, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
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
                y30.m.g(initialized.getControllersData(), rVar, y30.n.Switch.f223693f);
                rVar.x();
            } else {
                rVar.X(-1336962793);
            }
            rVar.R();
            if (initialized.getControllersData().getSelectedItemType() == y30.n.Switch.EnumC5973b.LEFT && initialized.getShowEmptyDrivingLicenceState()) {
                rVar.X(-1331760218);
                H(initialized.getEmptyDrivingLicence(), rVar, 0);
                rVar.R();
            } else {
                rVar.X(-1331674906);
                p(initialized, rVar, 0);
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
    public static final oq.i0 D(x.a.Initialized initialized, i70.p pVar, er.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        x(initialized, pVar, aVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final void E(final x.a.NoData noData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1582612627);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(noData) : rVarH.G(noData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1582612627, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceNoDataScreen (DrivingLicenceMainScreen.kt:244)");
            }
            rVar2 = rVarH;
            i50.s.r(noData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1460612352, true, new er.q() { // from class: xu1.j0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l0.F(noData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: xu1.k0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.G(noData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(x.a.NoData noData, d3 d3Var, p076m2.r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1460612352, i15, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceNoDataScreen.<anonymous> (DrivingLicenceMainScreen.kt:246)");
            }
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(f3.m.INSTANCE, 0.0f, 1, null), d3Var);
            p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
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
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.x xVar = d1.x.f39368a;
            q40.i.b(noData.a(), null, xu1.b.f221335a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final oq.i0 G(x.a.NoData noData, int i15, p076m2.r rVar, int i16) {
        E(noData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void H(final EmptyDrivingLicenceData emptyDrivingLicenceData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1779269640);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.W(emptyDrivingLicenceData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1779269640, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.EmptyDrivingLicenceContent (DrivingLicenceMainScreen.kt:193)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarR = a3.r(mVarF, aVar.b(rVarH, i17).getSpacing300(), 0.0f, aVar.b(rVarH, i17).getSpacing300(), aVar.b(rVarH, i17).getSpacing300(), 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
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
            f3.m mVarS = t70.i.S(d1.h0.b(i0Var, companion, 1.0f, false, 2, null), null, rVarH, 0, 1);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.e(), companion2.k(), rVarH, 6);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, mVarS);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d40.h.f(i0Var.c(companion, companion2.g()), new d40.b.C0864b(null, jz.a.f106888w, d40.i.n.f39717e, b.f221372a, null, null, 33, null), false, rVarH, d40.b.C0864b.f39687h << 3, 4);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            Label title = emptyDrivingLicenceData.getTitle();
            TextStyle textStyleI = aVar.f(rVarH, i17).i();
            b5.j.Companion companion4 = b5.j.INSTANCE;
            j70.h.g(null, null, title, null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, textStyleI, null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
            j70.h.g(null, null, emptyDrivingLicenceData.getSubtitle(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(companion4.a()), 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33026011);
            rVarH = rVarH;
            rVarH.x();
            ButtonData updateButtonData = emptyDrivingLicenceData.getUpdateButtonData();
            if (updateButtonData == null) {
                rVarH.X(-955044726);
            } else {
                rVarH.X(-955044725);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing300()), rVarH, 0);
                h30.q.p(updateButtonData, false, null, rVarH, 0, 6);
            }
            rVarH.R();
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xu1.z
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.I(emptyDrivingLicenceData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(EmptyDrivingLicenceData emptyDrivingLicenceData, int i15, p076m2.r rVar, int i16) {
        H(emptyDrivingLicenceData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void n(DrivingLicenceBottomSheetData.InterfaceC6414a interfaceC6414a, p076m2.r rVar, final int i15) {
        int i16;
        final DrivingLicenceBottomSheetData.InterfaceC6414a interfaceC6414a2;
        p076m2.r rVarH = rVar.h(-135435373);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(interfaceC6414a) : rVarH.G(interfaceC6414a) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-135435373, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.BottomSheetContent (DrivingLicenceMainScreen.kt:150)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(t70.i.S(w0.i.d(mVarH, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), null, rVarH, 0, 1), 0.0f, aVar.b(rVarH, i17).getSpacing200(), 1, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarP);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (interfaceC6414a instanceof DrivingLicenceBottomSheetData.InterfaceC6414a.DifferencesBetweenDigitalAndPhysical) {
                rVarH.X(-610271840);
                DrivingLicenceBottomSheetData.InterfaceC6414a.DifferencesBetweenDigitalAndPhysical differencesBetweenDigitalAndPhysical = (DrivingLicenceBottomSheetData.InterfaceC6414a.DifferencesBetweenDigitalAndPhysical) interfaceC6414a;
                j70.h.g(null, null, differencesBetweenDigitalAndPhysical.getTopText(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                s40.g.c(differencesBetweenDigitalAndPhysical.getInfoRowList(), 0.0f, rVarH, InfoRowListData.f187643b, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing200()), rVarH, 0);
                j70.h.g(null, null, differencesBetweenDigitalAndPhysical.getBottomText(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                rVarH = rVarH;
                rVarH.R();
                interfaceC6414a2 = interfaceC6414a;
            } else {
                interfaceC6414a2 = interfaceC6414a;
                if (interfaceC6414a2 instanceof DrivingLicenceBottomSheetData.InterfaceC6414a.StatusChangeInfo) {
                    rVarH.X(-1682233529);
                    j70.h.g(null, null, ((DrivingLicenceBottomSheetData.InterfaceC6414a.StatusChangeInfo) interfaceC6414a2).getDescription(), null, null, aVar.a(rVarH, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030107);
                    rVarH = rVarH;
                    rVarH.R();
                } else {
                    if (!(interfaceC6414a2 instanceof DrivingLicenceBottomSheetData.InterfaceC6414a.TemporaryDrivingLicenceValidity)) {
                        rVarH.X(-1682256993);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-1682225255);
                    s40.g.c(((DrivingLicenceBottomSheetData.InterfaceC6414a.TemporaryDrivingLicenceValidity) interfaceC6414a2).getInfoRowList(), 0.0f, rVarH, InfoRowListData.f187643b, 2);
                    rVarH.R();
                }
            }
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            interfaceC6414a2 = interfaceC6414a;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xu1.a0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.o(interfaceC6414a2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(DrivingLicenceBottomSheetData.InterfaceC6414a interfaceC6414a, int i15, p076m2.r rVar, int i16) {
        n(interfaceC6414a, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void p(final x.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1631544173);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1631544173, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicence (DrivingLicenceMainScreen.kt:145)");
            }
            o20.i.m(initialized.getBaseDocumentData(), rVarH, BaseDocumentData.f140741h);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xu1.b0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.q(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(x.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        p(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final x xVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(400043944);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(xVar) : rVarH.G(xVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(400043944, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreen (DrivingLicenceMainScreen.kt:50)");
            }
            f6 f6VarC = m7.b.c(xVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(xVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            x.a aVarS = s(f6VarC);
            i70.p pVarT = t(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(xVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new a(xVar);
                rVarH.v(objE);
            }
            v(aVarS, pVarT, (er.a) ((mr.g) objE), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xu1.y
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.u(xVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final x.a s(f6<? extends x.a> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p t(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(x xVar, int i15, p076m2.r rVar, int i16) {
        r(xVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a5  */
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    private static final void v(final x.a aVar, i70.p pVar, er.a<oq.i0> aVar2, p076m2.r rVar, final int i15) {
        int i16;
        final i70.p pVar2;
        final er.a<oq.i0> aVar3;
        p076m2.r rVarH = rVar.h(-956977455);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar2) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-956977455, i16, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreenContent (DrivingLicenceMainScreen.kt:68)");
            }
            if (fr.t.c(aVar, x.a.C5920a.f221423a)) {
                rVarH.X(677758319);
                rVarH.R();
            } else {
                if (aVar instanceof x.a.NoData) {
                    rVarH.X(-532324379);
                    E((x.a.NoData) aVar, rVarH, i16 & 14);
                    rVarH.R();
                } else {
                    if (!(aVar instanceof x.a.Initialized)) {
                        rVarH.X(-532327741);
                        rVarH.R();
                        throw new oq.p();
                    }
                    rVarH.X(-532320770);
                    pVar2 = pVar;
                    aVar3 = aVar2;
                    x((x.a.Initialized) aVar, pVar2, aVar3, rVarH, i16 & 1022, 0);
                    rVarH.R();
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            }
            pVar2 = pVar;
            aVar3 = aVar2;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            pVar2 = pVar;
            aVar3 = aVar2;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xu1.c0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.w(aVar, pVar2, aVar3, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(x.a aVar, i70.p pVar, er.a aVar2, int i15, p076m2.r rVar, int i16) {
        v(aVar, pVar, aVar2, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:80:0x015c  */
    /* JADX WARN: Code duplicated, block: B:82:0x0162  */
    /* JADX WARN: Code duplicated, block: B:85:0x016d  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnusedMaterialScaffoldPaddingParameter"})
    private static final void x(final x.a.Initialized initialized, i70.p pVar, er.a<oq.i0> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        i70.p pVar2;
        er.a<oq.i0> aVar2;
        boolean z15;
        final i70.p pVar3;
        final er.a<oq.i0> aVar3;
        d5 d5VarM;
        Object objE;
        Object objE2;
        p076m2.r.Companion companion;
        boolean z16;
        Object objE3;
        p076m2.r rVarH = rVar.h(-269538306);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(initialized) : rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            if ((i16 & 2) == 0) {
                pVar2 = pVar;
                int i18 = rVarH.G(pVar2) ? 32 : 16;
                i17 |= i18;
            } else {
                pVar2 = pVar;
            }
            i17 |= i18;
        } else {
            pVar2 = pVar;
        }
        int i19 = i16 & 4;
        if (i19 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                aVar2 = aVar;
                i17 |= rVarH.G(aVar2) ? 256 : 128;
            }
            if ((i17 & 147) != 146) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                rVarH.I();
                if ((i15 & 1) != 0 || rVarH.Q()) {
                    if ((i16 & 2) != 0) {
                        pVar2 = i70.p.a.f89857a;
                        i17 &= -113;
                    }
                    if (i19 != 0) {
                        objE = rVarH.E();
                        if (objE == p076m2.r.INSTANCE.a()) {
                            objE = new er.a() { // from class: xu1.d0
                                @Override // er.a
                                public final Object a() {
                                    return l0.y();
                                }
                            };
                            rVarH.v(objE);
                        }
                        aVar2 = (er.a) objE;
                    }
                } else {
                    rVarH.O();
                    if ((i16 & 2) != 0) {
                        i17 &= -113;
                    }
                }
                final i70.p pVar4 = pVar2;
                rVarH.y();
                if (p076m2.t.k()) {
                    p076m2.t.o(-269538306, i17, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreenInitialized (DrivingLicenceMainScreen.kt:89)");
                }
                objE2 = rVarH.E();
                companion = p076m2.r.INSTANCE;
                if (objE2 == companion.a()) {
                    objE2 = new al();
                    rVarH.v(objE2);
                }
                final al alVar = (al) objE2;
                if ((i17 & 14) != 4 || ((i17 & 8) != 0 && rVarH.G(initialized))) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                objE3 = rVarH.E();
                if (z16 || objE3 == companion.a()) {
                    objE3 = new er.a() { // from class: xu1.e0
                        @Override // er.a
                        public final Object a() {
                            return l0.z(initialized);
                        }
                    };
                    rVarH.v(objE3);
                }
                p088nul.q0.g(false, (er.a) objE3, rVarH, 0, 1);
                i70.m.d(alVar, pVar4, aVar2, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
                er.a<oq.i0> aVar4 = aVar2;
                g30.m.j(initialized.getBottomSheetData().getModalData(), initialized.getScaffoldData(), 0.0f, null, y2.m.d(-1612210469, true, new er.p() { // from class: xu1.f0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l0.A(alVar, pVar4, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), null, y2.m.d(1814829465, true, new er.p() { // from class: xu1.g0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l0.B(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), y2.m.d(1305547349, true, new er.q() { // from class: xu1.h0
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return l0.C(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVarH, 14180352 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 44);
                rVarH = rVarH;
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                aVar3 = aVar4;
                pVar3 = pVar4;
            } else {
                rVarH.O();
                pVar3 = pVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: xu1.i0
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return l0.D(initialized, pVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        aVar2 = aVar;
        if ((i17 & 147) != 146) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            rVarH.I();
            if ((i15 & 1) != 0) {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: xu1.d0
                            @Override // er.a
                            public final Object a() {
                                return l0.y();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar2 = (er.a) objE;
                }
            } else {
                if ((i16 & 2) != 0) {
                    pVar2 = i70.p.a.f89857a;
                    i17 &= -113;
                }
                if (i19 != 0) {
                    objE = rVarH.E();
                    if (objE == p076m2.r.INSTANCE.a()) {
                        objE = new er.a() { // from class: xu1.d0
                            @Override // er.a
                            public final Object a() {
                                return l0.y();
                            }
                        };
                        rVarH.v(objE);
                    }
                    aVar2 = (er.a) objE;
                }
            }
            final i70.p pVar5 = pVar2;
            rVarH.y();
            if (p076m2.t.k()) {
                p076m2.t.o(-269538306, i17, -1, "pl.gov.coi.mobywatel.feature.drivinglicence.presentation.main.DrivingLicenceMainScreenInitialized (DrivingLicenceMainScreen.kt:89)");
            }
            objE2 = rVarH.E();
            companion = p076m2.r.INSTANCE;
            if (objE2 == companion.a()) {
                objE2 = new al();
                rVarH.v(objE2);
            }
            final al alVar2 = (al) objE2;
            if ((i17 & 14) != 4) {
                z16 = true;
            } else {
                z16 = true;
            }
            objE3 = rVarH.E();
            if (z16) {
                objE3 = new er.a() { // from class: xu1.e0
                    @Override // er.a
                    public final Object a() {
                        return l0.z(initialized);
                    }
                };
                rVarH.v(objE3);
            } else {
                objE3 = new er.a() { // from class: xu1.e0
                    @Override // er.a
                    public final Object a() {
                        return l0.z(initialized);
                    }
                };
                rVarH.v(objE3);
            }
            p088nul.q0.g(false, (er.a) objE3, rVarH, 0, 1);
            i70.m.d(alVar2, pVar5, aVar2, null, null, rVarH, (i17 & 112) | 6 | (i17 & 896), 24);
            er.a<oq.i0> aVar5 = aVar2;
            g30.m.j(initialized.getBottomSheetData().getModalData(), initialized.getScaffoldData(), 0.0f, null, y2.m.d(-1612210469, true, new er.p() { // from class: xu1.f0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.A(alVar2, pVar5, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, y2.m.d(1814829465, true, new er.p() { // from class: xu1.g0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.B(initialized, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(1305547349, true, new er.q() { // from class: xu1.h0
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l0.C(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 14180352 | ModalBottomSheetData.f70192e | (BaseScaffoldData.f89350g << 3), 44);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            aVar3 = aVar5;
            pVar3 = pVar5;
        } else {
            rVarH.O();
            pVar3 = pVar2;
            aVar3 = aVar2;
        }
        d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xu1.i0
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l0.D(initialized, pVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y() {
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(x.a.Initialized initialized) {
        initialized.f().a();
        return oq.i0.f148189a;
    }
}
