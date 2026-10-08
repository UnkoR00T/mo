package oh1;

import b50.RadioButtonItemData;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.ArrayList;
import java.util.List;
import mx.Label;
import n4.f0;
import n4.g0;
import n50.h0;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import p088nul.q0;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¢\u0006\u0004\b\u0007\u0010\b\u001a\u001b\u0010\f\u001a\u00020\u0002*\u00020\t2\u0006\u0010\u000b\u001a\u00020\nH\u0003¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002"}, d2 = {"Loh1/l;", "viewModel", "Loq/i0;", "l", "(Loh1/l;Lm2/r;I)V", "Loh1/l$a;", "screenData", "h", "(Loh1/l$a;Lm2/r;I)V", "Ld1/p3;", "Loh1/j;", "item", "o", "(Ld1/p3;Loh1/j;Lm2/r;I)V", "dashboard_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class h {
    public static final void h(final l.Data data, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1803577588);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1803577588, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentssettings.DocumentsSettingsContent (DocumentsSettingsScreen.kt:49)");
            }
            rVar2 = rVarH;
            i50.s.r(data.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(2075955829, true, new er.q() { // from class: oh1.b
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return h.i(data, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new er.p() { // from class: oh1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.k(data, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 i(final l.Data data, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(2075955829, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentssettings.DocumentsSettingsContent.<anonymous>.<anonymous> (DocumentsSettingsScreen.kt:53)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
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
            Label description = data.getDescription();
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            j70.h.g(null, null, description, null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            h0.v(data.getDocumentsOrderSingleCardData(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
            h0.v(data.getDocumentsDeletionCardData(), null, rVar, 0, 2);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing300()), rVar, 0);
            j70.h.g(null, null, data.getDocumentsLayoutTitle(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            x30.c.c(null, 0.0f, y2.m.d(-1462745076, true, new er.p() { // from class: oh1.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.j(data, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
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
    public static final i0 j(l.Data data, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1462745076, i15, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentssettings.DocumentsSettingsContent.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DocumentsSettingsScreen.kt:77)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVar, 0);
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
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            rVar.X(-1508417586);
            List<DocumentLayoutItem> listC = data.c();
            ArrayList arrayList = new ArrayList(v.y(listC, 10));
            int i16 = 0;
            for (Object obj : listC) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                DocumentLayoutItem documentLayoutItem = (DocumentLayoutItem) obj;
                if (i16 <= 0 || i16 >= v.p(data.c()) - 1) {
                    rVar.X(-2031811675);
                } else {
                    rVar.X(-2028225626);
                    r3.a(androidx.compose.foundation.layout.d.y(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200()), rVar, 0);
                }
                rVar.R();
                o(q3Var, documentLayoutItem, rVar, ((d40.b.f39676g | RadioButtonItemData.f16672d) << 3) | 6);
                arrayList.add(i0.f148189a);
                i16 = i17;
            }
            rVar.R();
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
    public static final i0 k(l.Data data, int i15, p076m2.r rVar, int i16) {
        h(data, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void l(final l lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(806056965);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(lVar) : rVarH.G(lVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(806056965, i16, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentssettings.DocumentsSettingsScreen (DocumentsSettingsScreen.kt:41)");
            }
            f6 f6VarC = m7.b.c(lVar.getState(), null, null, null, rVarH, 0, 7);
            h(m(f6VarC), rVarH, 0);
            q0.g(false, m(f6VarC).g(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oh1.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.n(lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final l.Data m(f6<l.Data> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(l lVar, int i15, p076m2.r rVar, int i16) {
        l(lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void o(final p3 p3Var, final DocumentLayoutItem documentLayoutItem, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1309931395);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(p3Var) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(documentLayoutItem) : rVarH.G(documentLayoutItem) ? 32 : 16;
        }
        int i17 = i16;
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1309931395, i17, -1, "pl.gov.coi.mobywatel.feature.dashboard.presentation.screens.documentssettings.LayoutItem (DocumentsSettingsScreen.kt:92)");
            }
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new er.a() { // from class: oh1.e
                    @Override // er.a
                    public final Object a() {
                        return h.p(documentLayoutItem);
                    }
                };
                rVarH.v(objE);
            }
            er.a aVar = (er.a) objE;
            f3.m.Companion companion2 = f3.m.INSTANCE;
            f3.m mVarC = p3.c(p3Var, androidx.compose.foundation.layout.d.h(companion2, 0.0f, 1, null), 1.0f, false, 2, null);
            boolean z15 = (i17 & 112) == 32 || ((i17 & 64) != 0 && rVarH.G(documentLayoutItem));
            Object objE2 = rVarH.E();
            if (z15 || objE2 == companion.a()) {
                objE2 = new er.l() { // from class: oh1.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return h.q(documentLayoutItem, (n4.i0) obj);
                    }
                };
                rVarH.v(objE2);
            }
            f3.m mVarD = n4.v.d(mVarC, false, (er.l) objE2, 1, null);
            boolean isSelected = documentLayoutItem.getRadioButtonItemData().getIsSelected();
            int iF = n4.l.INSTANCE.f();
            Object objE3 = rVarH.E();
            if (objE3 == companion.a()) {
                objE3 = b1.k.a();
                rVarH.v(objE3);
            }
            f3.m mVarB = k1.d.b(mVarD, isSelected, (b1.l) objE3, t70.s.E(0.0f, rVarH, 0, 1), false, n4.l.j(iF), aVar, 8, null);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.g(), rVarH, 48);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarB);
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
            d40.h.f(null, documentLayoutItem.getIconData(), false, rVarH, d40.b.f39676g << 3, 5);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i18).getSpacing150()), rVarH, 0);
            j70.h.g(null, null, documentLayoutItem.getText(), null, null, aVar2.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).d(), null, null, false, true, null, rVarH, 0, 0, 3072, 24641499);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion2, aVar2.b(rVarH, i18).getSpacing150()), rVarH, 0);
            e50.b.b(documentLayoutItem.getRadioButtonItemData(), rVarH, RadioButtonItemData.f16672d);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: oh1.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h.r(p3Var, documentLayoutItem, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(DocumentLayoutItem documentLayoutItem) {
        documentLayoutItem.b().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(DocumentLayoutItem documentLayoutItem, n4.i0 i0Var) {
        g0.a(i0Var, true);
        f0.y0(i0Var, documentLayoutItem.getText().getTag());
        f0.c0(i0Var, documentLayoutItem.getText().getText());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(p3 p3Var, DocumentLayoutItem documentLayoutItem, int i15, p076m2.r rVar, int i16) {
        o(p3Var, documentLayoutItem, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
