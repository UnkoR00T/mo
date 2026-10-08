package f03;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import n50.h0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u0012\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f0\u000b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0003¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lf03/k;", "viewModel", "Loq/i0;", "i", "(Lf03/k;Lm2/r;I)V", "Lf03/k$a$c;", "data", "k", "(Lf03/k$a$c;Lm2/r;I)V", "Li50/a;", "scaffoldData", "Lq40/g;", "Lq40/f;", "iconPageData", "Ly30/n$b;", "controllersData", "Lc30/b;", "addressOutdatedAlert", "f", "(Li50/a;Lq40/g;Ly30/n$b;Lc30/b;Lm2/r;I)V", "registeredaddress_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    private static final void f(final BaseScaffoldData baseScaffoldData, final IconPageData<i0, IconPageBottomContentData> iconPageData, final y30.n.Switch r25, final c30.b bVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1172147483);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(baseScaffoldData) : rVarH.G(baseScaffoldData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(iconPageData) : rVarH.G(iconPageData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(r25) : rVarH.G(r25) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= (i15 & PKIFailureInfo.certConfirmed) == 0 ? rVarH.W(bVar) : rVarH.G(bVar) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1172147483, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.details.RegisteredAddressEmptyScreen (RegisteredAddressScreen.kt:106)");
            }
            rVar2 = rVarH;
            i50.s.r(baseScaffoldData, null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-801363054, true, new er.q() { // from class: f03.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.g(iconPageData, bVar, r25, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | (i16 & 14), 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f03.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.h(baseScaffoldData, iconPageData, r25, bVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(IconPageData iconPageData, c30.b bVar, y30.n.Switch r19, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-801363054, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.details.RegisteredAddressEmptyScreen.<anonymous> (RegisteredAddressScreen.kt:110)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarP = a3.p(companion, aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA2 = e0.a(iVar.k(), companion2.k(), rVar, 0);
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
            if (bVar == null) {
                rVar.X(-61368719);
            } else {
                rVar.X(-61368718);
                c30.e.c(null, bVar, rVar, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            }
            rVar.R();
            if (r19 == null) {
                rVar.X(-61199800);
            } else {
                rVar.X(-61199799);
                y30.m.g(r19, rVar, y30.n.Switch.f223693f);
            }
            rVar.R();
            rVar.x();
            q40.i.b(iconPageData, null, b.f54581a.b(), rVar, IconPageData.f164667h | IconPageBottomContentData.f164663d | MLKEMEngine.KyberPolyBytes, 2);
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
    public static final i0 h(BaseScaffoldData baseScaffoldData, IconPageData iconPageData, y30.n.Switch r15, c30.b bVar, int i15, p076m2.r rVar, int i16) {
        f(baseScaffoldData, iconPageData, r15, bVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void i(final k kVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1117609423);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(kVar) : rVarH.G(kVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1117609423, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.details.RegisteredAddressScreen (RegisteredAddressScreen.kt:32)");
            }
            k.a aVar = (k.a) m7.b.c(kVar.getState(), null, null, null, rVarH, 0, 7).getValue();
            if (fr.t.c(aVar, k.a.b.f54617a)) {
                rVarH.X(-280824222);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVar instanceof k.a.Empty) {
                rVarH.X(-280821851);
                k.a.Empty empty = (k.a.Empty) aVar;
                f(empty.getScaffoldData(), empty.a(), null, null, rVarH, BaseScaffoldData.f89350g | 3456 | ((IconPageData.f164667h | IconPageBottomContentData.f164663d) << 3));
                rVarH.R();
            } else {
                if (!(aVar instanceof k.a.Initialized)) {
                    rVarH.X(-280826582);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-280814372);
                k((k.a.Initialized) aVar, rVarH, 0);
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
            d5VarM.a(new er.p() { // from class: f03.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(kVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(k kVar, int i15, p076m2.r rVar, int i16) {
        i(kVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void k(final k.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(494827130);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(494827130, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.details.RegisteredAddressScreenContent (RegisteredAddressScreen.kt:50)");
            }
            if (initialized.getCardListData() == null) {
                rVarH.X(-1212493293);
                f(initialized.getScaffoldData(), initialized.f(), initialized.getControllersData(), initialized.getAddressOutdatedAlert(), rVarH, (c30.b.f22944i << 9) | BaseScaffoldData.f89350g | ((IconPageData.f164667h | IconPageBottomContentData.f164663d) << 3) | (y30.n.Switch.f223693f << 6));
                rVarH.R();
                rVar2 = rVarH;
            } else {
                rVarH.X(-1212484610);
                rVar2 = rVarH;
                i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1322685580, true, new er.q() { // from class: f03.c
                    @Override // er.q
                    public final Object w(Object obj, Object obj2, Object obj3) {
                        return h.l(initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
                rVar2.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: f03.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.m(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(k.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        i0 i0Var;
        f3.m.Companion companion;
        k70.a aVar;
        int i17;
        f3.m mVar;
        p076m2.r rVar2 = rVar;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar2.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar2.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1322685580, i16, -1, "pl.gov.coi.mobywatel.feature.registeredaddress.presentation.screen.details.RegisteredAddressScreenContent.<anonymous> (RegisteredAddressScreen.kt:62)");
            }
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.l(companion2, d3Var), 0.0f, 1, null), null, rVar2, 0, 1);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarP = a3.p(mVarS, aVar2.b(rVar2, i18).getSpacing200(), 0.0f, 2, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = f3.j.e(rVar2, mVarP);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            p076m2.r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing100()), rVar2, 0);
            if (initialized.getAddressOutdatedAlert() == null) {
                rVar2.X(444812340);
            } else {
                rVar2.X(444812341);
                c30.e.c(null, initialized.getAddressOutdatedAlert(), rVar2, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            }
            rVar2.R();
            if (initialized.getControllersData() == null) {
                rVar2.X(444991179);
                rVar2.R();
                i0Var = null;
            } else {
                rVar2.X(444991180);
                y30.m.g(initialized.getControllersData(), rVar2, y30.n.Switch.f223693f);
                rVar2.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVar2.X(445092364);
                aVar = aVar2;
                companion = companion2;
                i17 = i18;
                j70.h.g(null, null, initialized.getTitle(), null, null, aVar2.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).i(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                rVar2.R();
            } else {
                companion = companion2;
                aVar = aVar2;
                i17 = i18;
                rVar2.X(-124193296);
                rVar2.R();
            }
            k70.a aVar3 = aVar;
            int i19 = i17;
            f3.m.Companion companion4 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i19).getSpacing200()), rVar2, 0);
            m30.i.d(initialized.getCardListData(), null, null, rVar2, 0, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i19).getSpacing200()), rVar2, 0);
            n50.k addressHistory = initialized.getAddressHistory();
            if (addressHistory == null) {
                rVar2.X(445487582);
                rVar2.R();
                mVar = null;
            } else {
                rVar2.X(445487583);
                mVar = null;
                h0.v(addressHistory, null, rVar2, 0, 2);
                r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar3.b(rVar2, i19).getSpacing200()), rVar2, 0);
                rVar2.R();
            }
            rVar2.X(-124170482);
            Iterator<T> it = initialized.c().iterator();
            while (it.hasNext()) {
                c30.e.c(mVar, (c30.b) it.next(), rVar2, c30.b.f22944i << 3, 1);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
            }
            rVar2.R();
            rVar2.x();
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar2, k70.a.f108865b).getSpacing200()), rVar2, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(k.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        k(initialized, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
