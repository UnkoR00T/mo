package ra3;

import android.graphics.Bitmap;
import d1.a3;
import d1.d3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n30.CardListData;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import w0.f3;
import w0.i1;
import w0.u2;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0003¢\u0006\u0004\b\u0007\u0010\b\u001ay\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00172\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001a\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u001b\u0010\u001c\u001a\u0017\u0010\u001e\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u0017\u0010 \u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0015H\u0003¢\u0006\u0004\b \u0010!\u001a\u0017\u0010\"\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\"\u0010#¨\u0006&²\u0006\f\u0010%\u001a\u00020$8\nX\u008a\u0084\u0002"}, d2 = {"Lra3/l;", "viewModel", "Loq/i0;", "p", "(Lra3/l;Lm2/r;I)V", "Lra3/l$a$b;", "data", "l", "(Lra3/l$a$b;Lm2/r;I)V", "Lf3/m;", "modifier", "Landroid/graphics/Bitmap;", "flagBitmap", "Lmx/a;", "countryName", "subscriptionTitle", "Ls50/a$c;", "subscriptionSwitchData", "updateInfo", "Ln30/b;", "countryWarningCardListData", "Lra3/l$a$b$a;", "mapImageData", "", "countryRegionsWarningCardListDataList", "infoSectionTitle", "infoSectionCardListData", "j", "(Lf3/m;Landroid/graphics/Bitmap;Lmx/a;Lmx/a;Ls50/a$c;Lmx/a;Ln30/b;Lra3/l$a$b$a;Ljava/util/List;Lmx/a;Ln30/b;Lm2/r;III)V", "bitmap", "s", "(Landroid/graphics/Bitmap;Lm2/r;I)V", "v", "(Lra3/l$a$b$a;Lm2/r;I)V", "x", "(Ln30/b;Lm2/r;I)V", "Lra3/l$a;", "state", "travelabroad_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {
    private static final void j(f3.m mVar, final Bitmap bitmap, final Label label, final Label label2, final s50.a.c cVar, final Label label3, final CardListData cardListData, final l.a.Initialized.MapImageData mapImageData, final List<CardListData> list, final Label label4, final CardListData cardListData2, p076m2.r rVar, final int i15, final int i16, final int i17) {
        f3.m mVar2;
        int i18;
        int i19;
        f3.m mVar3;
        int i25;
        int i26;
        int i27;
        f3.m.Companion companion;
        p076m2.r rVarH = rVar.h(1869040635);
        int i28 = i17 & 1;
        if (i28 != 0) {
            i18 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i18 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i18 = i15;
        }
        if ((i15 & 48) == 0) {
            i18 |= rVarH.G(bitmap) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i18 |= rVarH.W(label) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i18 |= rVarH.W(label2) ? 2048 : 1024;
        }
        if ((i15 & 24576) == 0) {
            i18 |= rVarH.W(cVar) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i15) == 0) {
            i18 |= rVarH.W(label3) ? PKIFailureInfo.unsupportedVersion : PKIFailureInfo.notAuthorized;
        }
        if ((1572864 & i15) == 0) {
            i18 |= rVarH.W(cardListData) ? PKIFailureInfo.badCertTemplate : PKIFailureInfo.signerNotTrusted;
        }
        if ((12582912 & i15) == 0) {
            i18 |= rVarH.G(mapImageData) ? 8388608 : 4194304;
        }
        if ((100663296 & i15) == 0) {
            i18 |= rVarH.G(list) ? 67108864 : 33554432;
        }
        if ((805306368 & i15) == 0) {
            i18 |= rVarH.W(label4) ? PKIFailureInfo.duplicateCertReq : 268435456;
        }
        if ((i16 & 6) == 0) {
            i19 = i16 | (rVarH.W(cardListData2) ? 4 : 2);
        } else {
            i19 = i16;
        }
        if (rVarH.r(((i18 & 306783379) == 306783378 && (i19 & 3) == 2) ? false : true, i18 & 1)) {
            f3.m mVar4 = i28 != 0 ? f3.m.INSTANCE : mVar2;
            if (p076m2.t.k()) {
                p076m2.t.o(1869040635, i18, i19, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.Content (CountryDetailsScreen.kt:104)");
            }
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar4);
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
            int i29 = i19;
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            if (bitmap == null) {
                rVarH.X(-495938175);
                rVarH.R();
                i25 = 0;
            } else {
                rVarH.X(-495938174);
                i25 = 0;
                s(bitmap, rVarH, 0);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing50()), rVarH, 0);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVarH.R();
            }
            k70.a aVar = k70.a.f108864a;
            int i35 = k70.a.f108865b;
            int i36 = i18;
            mVar3 = mVar4;
            j70.h.g(null, null, label, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i35).k(), null, null, false, false, null, rVarH, i18 & 896, 0, 0, 33030139);
            f3.m.Companion companion3 = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVarH, i35).getSpacing200()), rVarH, i25);
            j70.h.g(null, null, label2, null, null, aVar.a(rVarH, i35).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i35).a(), null, null, false, false, null, rVarH, (i36 >> 3) & 896, 0, 0, 33030107);
            p076m2.r rVar2 = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i35).getSpacing50()), rVar2, 0);
            s50.d.b(cVar, rVar2, (i36 >> 12) & 14);
            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar2, i35).getSpacing200()), rVar2, 0);
            if (label3 == null) {
                rVar2.X(-495234940);
                rVar2.R();
                i26 = i35;
                companion = companion3;
                i27 = 0;
            } else {
                rVar2.X(-495234939);
                i26 = i35;
                i27 = 0;
                companion = companion3;
                j70.h.g(null, null, label3, null, null, aVar.a(rVar2, i35).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i35).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i26).getSpacing300()), rVar2, 0);
                oq.i0 i0Var3 = oq.i0.f148189a;
                rVar2.R();
            }
            if (cardListData == null) {
                rVar2 = rVar2;
                rVar2.X(-494940657);
            } else {
                rVar2 = rVar2;
                rVar2.X(-494940656);
                x(cardListData, rVar2, i27);
                oq.i0 i0Var4 = oq.i0.f148189a;
            }
            rVar2.R();
            if (mapImageData == null) {
                rVar2.X(-494823105);
            } else {
                rVar2.X(-494823104);
                v(mapImageData, rVar2, i27);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i26).getSpacing300()), rVar2, i27);
                oq.i0 i0Var5 = oq.i0.f148189a;
            }
            rVar2.R();
            if (list == null) {
                rVar2.X(-494632424);
            } else {
                rVar2.X(-494632423);
                rVar2.X(1785162248);
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    x((CardListData) it.next(), rVar2, i27);
                }
                rVar2.R();
                oq.i0 i0Var6 = oq.i0.f148189a;
            }
            rVar2.R();
            k70.a aVar2 = k70.a.f108864a;
            int i37 = k70.a.f108865b;
            p076m2.r rVar3 = rVar2;
            j70.h.g(null, null, label4, null, null, aVar2.a(rVar2, i37).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().h(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i37).p(), null, null, false, false, null, rVar3, (i36 >> 21) & 896, 0, 0, 33030107);
            rVarH = rVar3;
            f3.m.Companion companion4 = f3.m.INSTANCE;
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i37).getSpacing200()), rVarH, i27);
            m30.i.d(cardListData2, null, null, rVarH, i29 & 14, 6);
            r3.a(androidx.compose.foundation.layout.d.i(companion4, aVar2.b(rVarH, i37).getSpacing200()), rVarH, i27);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
            mVar3 = mVar2;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final f3.m mVar5 = mVar3;
            d5VarM.a(new er.p() { // from class: ra3.q
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.k(mVar5, bitmap, label, label2, cVar, label3, cardListData, mapImageData, list, label4, cardListData2, i15, i16, i17, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(f3.m mVar, Bitmap bitmap, Label label, Label label2, s50.a.c cVar, Label label3, CardListData cardListData, l.a.Initialized.MapImageData mapImageData, List list, Label label4, CardListData cardListData2, int i15, int i16, int i17, p076m2.r rVar, int i18) {
        j(mVar, bitmap, label, label2, cVar, label3, cardListData, mapImageData, list, label4, cardListData2, rVar, g4.a(i15 | 1), g4.a(i16), i17);
        return oq.i0.f148189a;
    }

    private static final void l(final l.a.Initialized initialized, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(797760535);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(797760535, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.CountryDetailsContent (CountryDetailsScreen.kt:58)");
            }
            final f3 f3VarB = u2.b(0, rVarH, 0, 1);
            cb4.i dialogVmsAdapter = initialized.getDialogVmsAdapter();
            if (dialogVmsAdapter == null) {
                rVarH.X(2030197474);
            } else {
                rVarH.X(2143700223);
                dialogVmsAdapter.b(rVarH, 0);
            }
            rVarH.R();
            rVarH.X(2143701442);
            i50.s.r(initialized.getScaffoldData(), null, null, 0, 0L, null, f3VarB, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1349350000, true, new er.q() { // from class: ra3.n
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.m(f3VarB, initialized, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32702);
            rVarH = rVarH;
            rVarH.R();
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.a() { // from class: ra3.o
                    @Override // er.a
                    public final Object a() {
                        return v.n(initialized);
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
            d5VarM.a(new er.p() { // from class: ra3.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.o(initialized, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(f3 f3Var, l.a.Initialized initialized, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1349350000, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.CountryDetailsContent.<anonymous>.<anonymous> (CountryDetailsScreen.kt:66)");
            }
            j(t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), f3Var, rVar, 0, 0), rVar, 0), initialized.getFlagBitmap(), initialized.getCountryName(), initialized.getSubscriptionTitle(), initialized.getSubscriptionSwitchData(), initialized.getUpdateInfo(), initialized.getCountryWarningCardListData(), initialized.getMapImage(), initialized.b(), initialized.getInfoSectionTitle(), initialized.getInfoSectionCardListData(), rVar, 0, 0, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(l.a.Initialized initialized) {
        initialized.i().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(l.a.Initialized initialized, int i15, p076m2.r rVar, int i16) {
        l(initialized, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void p(final l lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(1331625440);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1331625440, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.CountryDetailsScreen (CountryDetailsScreen.kt:43)");
            }
            l.a aVarQ = q(m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7));
            if (fr.t.c(aVarQ, l.a.c.f172634a)) {
                rVarH.X(-208199823);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else if (aVarQ instanceof l.a.Initialized) {
                rVarH.X(-208197566);
                l((l.a.Initialized) aVarQ, rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof l.a.Error)) {
                    rVarH.X(-208201864);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(-208194552);
                ((l.a.Error) aVarQ).getErrorVMS().b(rVarH, 0);
                rVarH.R();
            }
            oz.l.b(lVar.getLifecycleConnector(), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra3.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.r(lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.a q(f6<? extends l.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(l lVar, int i15, p076m2.r rVar, int i16) {
        p(lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void s(final Bitmap bitmap, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1429697468);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(bitmap) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1429697468, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.ImageFlag (CountryDetailsScreen.kt:165)");
            }
            p036e4.l lVarD = p036e4.l.INSTANCE.d();
            f3.m.Companion companion = f3.m.INSTANCE;
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: ra3.r
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.t((n4.i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            i1.g(n3.l0.c(bitmap), null, androidx.compose.foundation.layout.d.t(n4.v.d(companion, false, (er.l) objE, 1, null), d40.i.j.f39713e.getDimension()), null, lVarD, 0.0f, null, 0, rVarH, 24624, 232);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra3.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.u(bitmap, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(n4.i0 i0Var) {
        t70.i.A(i0Var);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(Bitmap bitmap, int i15, p076m2.r rVar, int i16) {
        s(bitmap, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(final l.a.Initialized.MapImageData mapImageData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1453274658);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(mapImageData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1453274658, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.MapImage (CountryDetailsScreen.kt:181)");
            }
            i1.g(n3.l0.c(mapImageData.getBitmap()), mapImageData.getContentDescription().getText(), androidx.compose.foundation.b.n(k3.f.a(androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null), k70.a.f108864a.e(rVarH, k70.a.f108865b).getRadius200()), false, null, null, null, mapImageData.c(), 15, null), null, p036e4.l.INSTANCE.d(), 0.0f, null, 0, rVarH, 24576, 232);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra3.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.w(mapImageData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(l.a.Initialized.MapImageData mapImageData, int i15, p076m2.r rVar, int i16) {
        v(mapImageData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void x(CardListData cardListData, p076m2.r rVar, final int i15) {
        int i16;
        final CardListData cardListData2;
        p076m2.r rVarH = rVar.h(-2065361255);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(cardListData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-2065361255, i16, -1, "pl.gov.coi.mobywatel.feature.travelabroad.presentation.country.details.WarningSection (CountryDetailsScreen.kt:196)");
            }
            cardListData2 = cardListData;
            m30.i.d(cardListData2, null, null, rVarH, i16 & 14, 6);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing300()), rVarH, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            cardListData2 = cardListData;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: ra3.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.y(cardListData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(CardListData cardListData, int i15, p076m2.r rVar, int i16) {
        x(cardListData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
