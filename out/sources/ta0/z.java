package ta0;

import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import java.io.IOException;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import org.xmlpull.v1.XmlPullParserException;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import pa0.DashboardThemeDrawable;
import s20.DocumentRefreshCardData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a\u0017\u0010\n\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\tH\u0003¢\u0006\u0004\b\n\u0010\u000b\u001a\u0017\u0010\r\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\fH\u0003¢\u0006\u0004\b\r\u0010\u000e\u001a\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u000fH\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a5\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00020\u0017H\u0007¢\u0006\u0004\b\u0019\u0010\u001a\"\u0014\u0010\u001e\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006!²\u0006\f\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002²\u0006\f\u0010 \u001a\u00020\u001f8\nX\u008a\u0084\u0002"}, d2 = {"Lta0/c;", "viewModel", "Loq/i0;", "u", "(Lta0/c;Lm2/r;I)V", "Lta0/c$a$a;", "data", "I", "(Lta0/c$a$a;Lm2/r;I)V", "Lta0/c$a$b;", "y", "(Lta0/c$a$b;Lm2/r;I)V", "Lta0/c$a$d;", ip.a.f96138c, "(Lta0/c$a$d;Lm2/r;I)V", "Lta0/c$a$c;", "M", "(Lta0/c$a$c;Lm2/r;I)V", "Lta0/c$a$e;", "Li70/p;", "snackBarState", "Lf2/al;", "snackBarHostState", "Lkotlin/Function0;", "hideSnackBar", "Q", "(Lta0/c$a$e;Li70/p;Lf2/al;Ler/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "BIG_CARD_OVERLAP_PADDING", "Lta0/c$a;", "state", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f189354a = c5.h.n(64);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.a<oq.i0> {
        a(Object obj) {
            super(0, obj, c.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((c) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(c.a.EmptyStateData emptyStateData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(458250777, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreenContent.<anonymous> (DesktopScreen.kt:115)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            j70.h.g(null, null, emptyStateData.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).k(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, emptyStateData.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j30.f.e(null, emptyStateData.getInfoPageButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
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
    public static final oq.i0 B(c.a.EmptyStateData emptyStateData) {
        emptyStateData.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(c.a.EmptyStateData emptyStateData, int i15, p076m2.r rVar, int i16) {
        y(emptyStateData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void D(final c.a.RevokedStateData revokedStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1432918853);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(revokedStateData) : rVarH.G(revokedStateData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1432918853, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreenRevokedContent (DesktopScreen.kt:146)");
            }
            int i17 = i16;
            i50.s.r(revokedStateData.getScaffoldData(), y2.m.d(-1151003984, true, new er.p() { // from class: ta0.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.E(revokedStateData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(465058744, true, new er.q() { // from class: ta0.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.F(revokedStateData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(revokedStateData));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ta0.v
                    @Override // er.a
                    public final Object a() {
                        return z.G(revokedStateData);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ta0.w
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.H(revokedStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(c.a.RevokedStateData revokedStateData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1151003984, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreenRevokedContent.<anonymous> (DesktopScreen.kt:150)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i16).getSpacing200());
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(revokedStateData.getAddDocument(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing150()), rVar, 0);
            h30.q.p(revokedStateData.getDeactivateApp(), false, null, rVar, 0, 6);
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
    public static final oq.i0 F(c.a.RevokedStateData revokedStateData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(465058744, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreenRevokedContent.<anonymous> (DesktopScreen.kt:157)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(t70.i.S(companion, null, rVar, 6, 1), 0.0f, 1, null), d3Var), rVar, 0);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarN, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD);
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
            j70.h.g(null, null, revokedStateData.getTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).k(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j70.h.g(null, null, revokedStateData.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            j30.f.e(null, revokedStateData.getInfoPageButtonData(), false, rVar, ButtonTextData.f99099f << 3, 5);
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
    public static final oq.i0 G(c.a.RevokedStateData revokedStateData) {
        revokedStateData.e().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(c.a.RevokedStateData revokedStateData, int i15, p076m2.r rVar, int i16) {
        D(revokedStateData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void I(final c.a.DocumentsData documentsData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-809127278);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(documentsData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-809127278, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DocumentsScreenContent (DesktopScreen.kt:71)");
            }
            i50.s.r(documentsData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(516584965, true, new er.q() { // from class: ta0.x
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.J(documentsData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean zG = rVarH.G(documentsData);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ta0.y
                    @Override // er.a
                    public final Object a() {
                        return z.K(documentsData);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ta0.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.L(documentsData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(c.a.DocumentsData documentsData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16 = (i15 & 6) == 0 ? i15 | (rVar.W(d3Var) ? 4 : 2) : i15;
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(516584965, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DocumentsScreenContent.<anonymous> (DesktopScreen.kt:75)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarQ = t70.i.q(a3.l(companion, d3Var), rVar, 0);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarQ);
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
            Label title = documentsData.getTitle();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, title, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).g(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, companion);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            rVar.X(-797690132);
            int i18 = 0;
            for (Object obj : documentsData.a()) {
                int i19 = i18 + 1;
                if (i18 < 0) {
                    pq.v.x();
                }
                DocumentRefreshCardData documentRefreshCardData = (DocumentRefreshCardData) obj;
                f3.m.Companion companion4 = f3.m.INSTANCE;
                p036e4.w0 w0VarA2 = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT3 = rVar.t();
                f3.m mVarE3 = f3.j.e(rVar, companion4);
                androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB3);
                } else {
                    rVar.u();
                }
                p076m2.r rVarC3 = n6.c(rVar);
                n6.i(rVarC3, w0VarA2, companion5.d());
                n6.i(rVarC3, e0VarT3, companion5.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                n6.g(rVarC3, companion5.a());
                n6.i(rVarC3, mVarE3, companion5.e());
                d1.i0 i0Var2 = d1.i0.f39176a;
                r3.a(androidx.compose.foundation.layout.d.i(companion4, c5.h.n(f189354a * i18)), rVar, 0);
                r20.f.d(null, documentRefreshCardData, rVar, DocumentRefreshCardData.f177612i << 3, 1);
                rVar.x();
                i18 = i19;
            }
            rVar.R();
            rVar.x();
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
    public static final oq.i0 K(c.a.DocumentsData documentsData) {
        documentsData.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(c.a.DocumentsData documentsData, int i15, p076m2.r rVar, int i16) {
        I(documentsData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void M(final c.a.LoadingStateData loadingStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(970549181);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(loadingStateData) : rVarH.G(loadingStateData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(970549181, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.LoadingScreenContent (DesktopScreen.kt:188)");
            }
            int i17 = i16;
            i50.s.r(loadingStateData.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-882044246, true, new er.q() { // from class: ta0.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.N(loadingStateData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32766);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(loadingStateData));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ta0.r
                    @Override // er.a
                    public final Object a() {
                        return z.O(loadingStateData);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ta0.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.P(loadingStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(c.a.LoadingStateData loadingStateData, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-882044246, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.LoadingScreenContent.<anonymous> (DesktopScreen.kt:192)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var), rVar, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.e(), f3.c.INSTANCE.g(), rVar, 54);
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
            x70.f.g(x70.a.C5796a.f217280c, rVar, x70.a.C5796a.f217281d);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            j70.h.g(null, null, loadingStateData.getDescription(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, Float.valueOf(-2.0f), false, false, null, rVar, 0, 0, 0, 30932955);
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
    public static final oq.i0 O(c.a.LoadingStateData loadingStateData) {
        loadingStateData.b().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 P(c.a.LoadingStateData loadingStateData, int i15, p076m2.r rVar, int i16) {
        M(loadingStateData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void Q(final c.a.UserAgreements userAgreements, i70.p pVar, al alVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        final i70.p pVar2 = pVar;
        final al alVar2 = alVar;
        p076m2.r rVarH = rVar.h(-305485398);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(userAgreements) : rVarH.G(userAgreements) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.W(alVar2) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.G(aVar) ? 2048 : 1024;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-305485398, i17, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.UserAgreementsScreenContent (DesktopScreen.kt:221)");
            }
            i70.m.d(alVar2, pVar2, aVar, null, null, rVarH, ((i17 >> 6) & 14) | (i17 & 112) | ((i17 >> 3) & 896), 24);
            alVar2 = alVar2;
            pVar2 = pVar2;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(userAgreements));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ta0.l
                    @Override // er.a
                    public final Object a() {
                        return z.R(userAgreements);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            i50.s.r(userAgreements.getBaseScaffoldData(), y2.m.d(-491382251, true, new er.p() { // from class: ta0.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.S(userAgreements, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), y2.m.d(-925345932, true, new er.p() { // from class: ta0.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.T(alVar2, pVar2, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1072536349, true, new er.q() { // from class: ta0.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.U(userAgreements, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 432, 196608, 32760);
            rVarH = rVarH;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ta0.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.V(userAgreements, pVar2, alVar2, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(c.a.UserAgreements userAgreements) {
        userAgreements.d().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 S(c.a.UserAgreements userAgreements, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-491382251, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.UserAgreementsScreenContent.<anonymous> (DesktopScreen.kt:236)");
            }
            f3.m mVarN = a3.n(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200());
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            h30.q.p(userAgreements.getNextButton(), false, null, rVar, 0, 6);
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
    public static final oq.i0 T(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-925345932, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.UserAgreementsScreenContent.<anonymous> (DesktopScreen.kt:233)");
            }
            i70.d.d(alVar, pVar, false, rVar, 0, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 U(c.a.UserAgreements userAgreements, d3 d3Var, p076m2.r rVar, int i15) throws XmlPullParserException, IOException {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1072536349, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.UserAgreementsScreenContent.<anonymous> (DesktopScreen.kt:241)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(a3.l(t70.i.S(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), null, rVar, 6, 1), d3Var), rVar, 0);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            o40.j.i(o40.a.Icon.d(userAgreements.getHeaderData(), ((DashboardThemeDrawable) rVar.N(pa0.e.f())).getApprovedDocument(), null, null, null, null, null, 62, null), rVar, o40.a.Icon.f142232h);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            s50.a.b regulationsSwitch = userAgreements.getRegulationsSwitch();
            int i18 = s50.a.b.f177992n;
            s50.d.b(regulationsSwitch, rVar, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing250()), rVar, 0);
            s50.d.b(userAgreements.getPrivacyPolicySwitch(), rVar, i18);
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
    public static final oq.i0 V(c.a.UserAgreements userAgreements, i70.p pVar, al alVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        Q(userAgreements, pVar, alVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final c cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(300593483);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(cVar) : rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(300593483, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreen (DesktopScreen.kt:47)");
            }
            f6 f6VarB = m7.b.b(cVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            al alVar = (al) objE;
            c.a aVarW = w(m7.b.c(cVar.getState(), null, null, null, rVarH, 0, 7));
            if (aVarW instanceof c.a.LoadingStateData) {
                rVarH.X(1107540948);
                M((c.a.LoadingStateData) aVarW, rVarH, 0);
                rVarH.R();
            } else if (aVarW instanceof c.a.EmptyStateData) {
                rVarH.X(1107543828);
                y((c.a.EmptyStateData) aVarW, rVarH, 0);
                rVarH.R();
            } else if (aVarW instanceof c.a.DocumentsData) {
                rVarH.X(1107546678);
                I((c.a.DocumentsData) aVarW, rVarH, 0);
                rVarH.R();
            } else if (aVarW instanceof c.a.RevokedStateData) {
                rVarH.X(1107549691);
                D((c.a.RevokedStateData) aVarW, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarW instanceof c.a.UserAgreements)) {
                    rVarH.X(1107538866);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(1107552936);
                c.a.UserAgreements userAgreements = (c.a.UserAgreements) aVarW;
                i70.p pVarV = v(f6VarB);
                if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(cVar))) {
                    z15 = false;
                }
                Object objE2 = rVarH.E();
                if (z15 || objE2 == companion.a()) {
                    objE2 = new a(cVar);
                    rVarH.v(objE2);
                }
                Q(userAgreements, pVarV, alVar, (er.a) ((mr.g) objE2), rVarH, MLKEMEngine.KyberPolyBytes);
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
            d5VarM.a(new er.p() { // from class: ta0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.x(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final i70.p v(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    private static final c.a w(f6<? extends c.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(c cVar, int i15, p076m2.r rVar, int i16) {
        u(cVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void y(final c.a.EmptyStateData emptyStateData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1662724116);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(emptyStateData) : rVarH.G(emptyStateData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1662724116, i16, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreenContent (DesktopScreen.kt:104)");
            }
            int i17 = i16;
            i50.s.r(emptyStateData.getScaffoldData(), y2.m.d(-492876767, true, new er.p() { // from class: ta0.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.z(emptyStateData, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(458250777, true, new er.q() { // from class: ta0.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return z.A(emptyStateData, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 48, 196608, 32764);
            rVarH = rVarH;
            boolean z15 = (i17 & 14) == 4 || ((i17 & 8) != 0 && rVarH.G(emptyStateData));
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ta0.j
                    @Override // er.a
                    public final Object a() {
                        return z.B(emptyStateData);
                    }
                };
                rVarH.v(objE);
            }
            p088nul.q0.g(false, (er.a) objE, rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ta0.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return z.C(emptyStateData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(c.a.EmptyStateData emptyStateData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-492876767, i15, -1, "pl.gov.coi.mjunior.feature.dashboard.presentation.screen.desktop.DesktopScreenContent.<anonymous> (DesktopScreen.kt:108)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            f3.m mVarN = a3.n(companion, aVar.b(rVar, i16).getSpacing200());
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            h30.q.p(emptyStateData.getAddDocument(), false, null, rVar, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing150()), rVar, 0);
            h30.q.p(emptyStateData.getDeactivateApp(), false, null, rVar, 0, 6);
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
