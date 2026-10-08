package v60;

import androidx.compose.ui.graphics.Color;
import b1.k;
import b1.l;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import er.p;
import f3.j;
import f3.m;
import mx.Label;
import n4.f0;
import n4.g0;
import n4.i0;
import n4.v;
import n50.k0;
import n50.v0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p012a2.h2;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import w0.r1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lv60/a;", "data", "Loq/i0;", "h", "(Lf3/m;Lv60/a;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class i {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f204102a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(620129209);
            if (t.k()) {
                t.o(620129209, i15, -1, "pl.gov.coi.common.ui.payment.statuscard.PaymentStatusCard.<anonymous>.<anonymous>.<anonymous>.<anonymous> (PaymentStatusCard.kt:154)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void h(m mVar, final PaymentStatusCardData paymentStatusCardData, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        r rVarH = rVar.h(-472832761);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = (rVarH.W(mVar2) ? 4 : 2) | i15;
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.W(paymentStatusCardData) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar3 = i18 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-472832761, i17, -1, "pl.gov.coi.common.ui.payment.statuscard.PaymentStatusCard (PaymentStatusCard.kt:45)");
            }
            Object objE = rVarH.E();
            r.Companion companion = r.INSTANCE;
            if (objE == companion.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = k.a();
                rVarH.v(objE2);
            }
            l lVar = (l) objE2;
            m mVarW = s.w(androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(mVar3, 0.0f, 1, null), null, false, 3, null), b1.f.a(lVar, rVarH, 6), k70.a.f108864a.b(rVarH, k70.a.f108865b).getSpacing200(), 0.0f, 4, null);
            r1 r1VarE = s.E(0.0f, rVarH, 0, 1);
            int i19 = i17 & 112;
            boolean zG = rVarH.G(aVar) | (i19 == 32);
            Object objE3 = rVarH.E();
            if (zG || objE3 == companion.a()) {
                objE3 = new er.a() { // from class: v60.b
                    @Override // er.a
                    public final Object a() {
                        return i.i(aVar, paymentStatusCardData);
                    }
                };
                rVarH.v(objE3);
            }
            m mVarL = androidx.compose.foundation.b.l(mVarW, lVar, r1VarE, false, null, null, (er.a) objE3, 28, null);
            Object objE4 = rVarH.E();
            if (objE4 == companion.a()) {
                objE4 = new er.l() { // from class: v60.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.k((i0) obj);
                    }
                };
                rVarH.v(objE4);
            }
            m mVarD = v.d(mVarL, false, (er.l) objE4, 1, null);
            boolean z15 = i19 == 32;
            Object objE5 = rVarH.E();
            if (z15 || objE5 == companion.a()) {
                objE5 = new er.l() { // from class: v60.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.l(paymentStatusCardData, (i0) obj);
                    }
                };
                rVarH.v(objE5);
            }
            m mVarD2 = v.d(mVarD, false, (er.l) objE5, 1, null);
            boolean z16 = i19 == 32;
            Object objE6 = rVarH.E();
            if (z16 || objE6 == companion.a()) {
                objE6 = new er.l() { // from class: v60.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return i.m(paymentStatusCardData, (i0) obj);
                    }
                };
                rVarH.v(objE6);
            }
            m mVarD3 = v.d(mVarD2, false, (er.l) objE6, 1, null);
            w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD3);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            x xVar = x.f39368a;
            x30.c.c(null, 0.0f, y2.m.d(1045389038, true, new p() { // from class: v60.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.n(paymentStatusCardData, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, MLKEMEngine.KyberPolyBytes, 3);
            rVarH.x();
            if (t.k()) {
                t.n();
            }
            mVar2 = mVar3;
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: v60.g
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return i.o(mVar2, paymentStatusCardData, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 i(cx.a aVar, final PaymentStatusCardData paymentStatusCardData) {
        cx.a.a(aVar, 0L, new er.a() { // from class: v60.h
            @Override // er.a
            public final Object a() {
                return i.j(paymentStatusCardData);
            }
        }, 1, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 j(PaymentStatusCardData paymentStatusCardData) {
        er.a<oq.i0> aVarE = paymentStatusCardData.e();
        if (aVarE == null) {
            return null;
        }
        aVarE.a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(i0 i0Var) {
        g0.a(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0038  */
    public static final oq.i0 l(PaymentStatusCardData paymentStatusCardData, i0 i0Var) {
        String string;
        String testTag = paymentStatusCardData.getTestTag();
        if (testTag == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("card_");
            sb5.append(paymentStatusCardData.getTitle().getTag());
            Integer indexTag = paymentStatusCardData.getIndexTag();
            if (indexTag != null) {
                int iIntValue = indexTag.intValue();
                StringBuilder sb6 = new StringBuilder();
                sb6.append('_');
                sb6.append(iIntValue);
                string = sb6.toString();
                if (string == null) {
                    string = "";
                }
            } else {
                string = "";
            }
            sb5.append(string);
            testTag = sb5.toString();
        }
        f0.y0(i0Var, testTag);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(PaymentStatusCardData paymentStatusCardData, i0 i0Var) {
        Label text;
        String text2 = paymentStatusCardData.getTitle().getText();
        Label subtitleValue = paymentStatusCardData.getSubtitleValue();
        String text3 = subtitleValue != null ? subtitleValue.getText() : null;
        k0 statusBadgeData = paymentStatusCardData.getStatusBadgeData();
        String text4 = (statusBadgeData == null || (text = statusBadgeData.getText()) == null) ? null : text.getText();
        Label extraLabel = paymentStatusCardData.getExtraLabel();
        f0.c0(i0Var, pq.v.v0(pq.v.s(text2, text3, text4, extraLabel != null ? extraLabel.getText() : null), " ", null, null, 0, null, null, 62, null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(PaymentStatusCardData paymentStatusCardData, r rVar, int i15) {
        String str;
        m.Companion companion;
        q3 q3Var;
        String str2;
        String str3;
        k70.a aVar;
        m.Companion companion2;
        int i16;
        String str4;
        k70.a aVar2;
        int i17;
        String str5;
        r rVar2 = rVar;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1045389038, i15, -1, "pl.gov.coi.common.ui.payment.statuscard.PaymentStatusCard.<anonymous>.<anonymous> (PaymentStatusCard.kt:75)");
            }
            m.Companion companion3 = m.INSTANCE;
            m mVarC = androidx.compose.foundation.layout.d.C(androidx.compose.foundation.layout.d.h(companion3, 0.0f, 1, null), null, false, 3, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.e eVarJ = iVar.j();
            f3.c.Companion companion4 = f3.c.INSTANCE;
            w0 w0VarB = m3.b(eVarJ, companion4.l(), rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT = rVar2.t();
            m mVarE = j.e(rVar2, mVarC);
            androidx.compose.ui.node.c.Companion companion5 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion5.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB);
            } else {
                rVar2.u();
            }
            r rVarC = n6.c(rVar2);
            n6.i(rVarC, w0VarB, companion5.d());
            n6.i(rVarC, e0VarT, companion5.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion5.c());
            n6.g(rVarC, companion5.a());
            n6.i(rVarC, mVarE, companion5.e());
            q3 q3Var2 = q3.f39261a;
            m mVarC2 = androidx.compose.foundation.layout.d.C(p3.c(q3Var2, companion3, 1.0f, false, 2, null), null, false, 3, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion4.k(), rVar2, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar2, 0));
            e0 e0VarT2 = rVar2.t();
            m mVarE2 = j.e(rVar2, mVarC2);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion5.b();
            if (rVar2.l() == null) {
                p076m2.m.d();
            }
            rVar2.K();
            if (rVar2.getInserting()) {
                rVar2.H(aVarB2);
            } else {
                rVar2.u();
            }
            r rVarC2 = n6.c(rVar2);
            n6.i(rVarC2, w0VarA, companion5.d());
            n6.i(rVarC2, e0VarT2, companion5.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion5.c());
            n6.g(rVarC2, companion5.a());
            n6.i(rVarC2, mVarE2, companion5.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k0 statusBadgeData = paymentStatusCardData.getStatusBadgeData();
            if (statusBadgeData == null) {
                rVar2.X(372200752);
                rVar2.R();
                companion = companion3;
                q3Var = q3Var2;
            } else {
                rVar2.X(372200753);
                w0 w0VarB2 = m3.b(iVar.j(), companion4.i(), rVar2, 48);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar2, 0));
                e0 e0VarT3 = rVar2.t();
                m mVarE3 = j.e(rVar2, companion3);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion5.b();
                if (rVar2.l() == null) {
                    p076m2.m.d();
                }
                rVar2.K();
                if (rVar2.getInserting()) {
                    rVar2.H(aVarB3);
                } else {
                    rVar2.u();
                }
                r rVarC3 = n6.c(rVar2);
                n6.i(rVarC3, w0VarB2, companion5.d());
                n6.i(rVarC3, e0VarT3, companion5.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion5.c());
                n6.g(rVarC3, companion5.a());
                n6.i(rVarC3, mVarE3, companion5.e());
                v0.k(statusBadgeData, rVar2, 0);
                Label extraLabel = paymentStatusCardData.getExtraLabel();
                if (extraLabel == null) {
                    rVar2.X(-564133797);
                    rVar2.R();
                    companion = companion3;
                    q3Var = q3Var2;
                } else {
                    rVar2.X(-564133796);
                    k70.a aVar3 = k70.a.f108864a;
                    int i18 = k70.a.f108865b;
                    r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar3.b(rVar2, i18).getSpacing100()), rVar2, 0);
                    h2.c(l4.c.c(jz.a.R1, rVar2, 0), null, androidx.compose.foundation.layout.d.t(companion3, aVar3.b(rVar2, i18).getSpacing50()), aVar3.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), rVar2, androidx.compose.ui.graphics.painter.a.f9956g | 48, 0);
                    r3.a(androidx.compose.foundation.layout.d.y(companion3, aVar3.b(rVar2, i18).getSpacing100()), rVar2, 0);
                    String testTag = paymentStatusCardData.getTestTag();
                    if (testTag != null) {
                        str = testTag + "ExtraText";
                    } else {
                        str = null;
                    }
                    companion = companion3;
                    q3Var = q3Var2;
                    j70.h.g(null, str, extraLabel, null, null, aVar3.a(rVar2, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar3.f(rVar2, i18).d(), paymentStatusCardData.getIndexTag(), null, false, false, null, rVar, 0, 0, 0, 31981529);
                    rVar2 = rVar;
                    oq.i0 i0Var2 = oq.i0.f148189a;
                    rVar2.R();
                }
                rVar2.x();
                oq.i0 i0Var3 = oq.i0.f148189a;
                rVar2.R();
            }
            k70.a aVar4 = k70.a.f108864a;
            int i19 = k70.a.f108865b;
            m.Companion companion6 = companion;
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar4.b(rVar2, i19).getSpacing200()), rVar2, 0);
            String testTag2 = paymentStatusCardData.getTestTag();
            if (testTag2 != null) {
                str2 = testTag2 + "TitleText";
            } else {
                str2 = null;
            }
            j70.h.g(null, str2, Label.f(paymentStatusCardData.getTitle(), "Main", null, 2, null), null, null, aVar4.a(rVar2, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 2, paymentStatusCardData.getMinLines(), null, aVar4.f(rVar2, i19).a(), paymentStatusCardData.getIndexTag(), null, false, false, null, rVar, 0, 1597440, 0, 31768537);
            r rVar3 = rVar;
            r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar4.b(rVar3, i19).getSpacing100()), rVar3, 0);
            w0 w0VarB3 = m3.b(iVar.j(), companion4.i(), rVar3, 48);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar3, 0));
            e0 e0VarT4 = rVar3.t();
            m mVarE4 = j.e(rVar3, companion6);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion5.b();
            if (rVar3.l() == null) {
                p076m2.m.d();
            }
            rVar3.K();
            if (rVar3.getInserting()) {
                rVar3.H(aVarB4);
            } else {
                rVar3.u();
            }
            r rVarC4 = n6.c(rVar3);
            n6.i(rVarC4, w0VarB3, companion5.d());
            n6.i(rVarC4, e0VarT4, companion5.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion5.c());
            n6.g(rVarC4, companion5.a());
            n6.i(rVarC4, mVarE4, companion5.e());
            Label subtitleDescription = paymentStatusCardData.getSubtitleDescription();
            if (subtitleDescription == null) {
                rVar3.X(461543447);
                rVar3.R();
                aVar = aVar4;
                i16 = i19;
                companion2 = companion6;
            } else {
                rVar3.X(461543448);
                String testTag3 = paymentStatusCardData.getTestTag();
                if (testTag3 != null) {
                    str3 = testTag3 + "SubtitleDescriptionText";
                } else {
                    str3 = null;
                }
                aVar = aVar4;
                companion2 = companion6;
                i16 = i19;
                j70.h.g(null, str3, subtitleDescription, null, null, aVar4.a(rVar3, i19).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar4.f(rVar3, i19).d(), paymentStatusCardData.getIndexTag(), null, false, false, null, rVar, 0, 0, 0, 31981529);
                rVar3 = rVar;
                oq.i0 i0Var4 = oq.i0.f148189a;
                rVar3.R();
            }
            Label subtitleValue = paymentStatusCardData.getSubtitleValue();
            if (subtitleValue == null) {
                rVar3.X(461954352);
                rVar3.R();
                aVar2 = aVar;
                i17 = i16;
            } else {
                rVar3.X(461954353);
                String testTag4 = paymentStatusCardData.getTestTag();
                if (testTag4 != null) {
                    str4 = testTag4 + "SubtitleText";
                } else {
                    str4 = null;
                }
                k70.a aVar5 = aVar;
                int i25 = i16;
                aVar2 = aVar5;
                i17 = i25;
                j70.h.g(null, str4, subtitleValue, null, null, aVar5.a(rVar3, i25).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar5.f(rVar3, i25).a(), paymentStatusCardData.getIndexTag(), null, false, false, null, rVar, 0, 0, 0, 31981529);
                rVar3 = rVar;
                oq.i0 i0Var5 = oq.i0.f148189a;
                rVar3.R();
            }
            rVar3.x();
            rVar3.x();
            m.Companion companion7 = companion2;
            r3.a(androidx.compose.foundation.layout.d.y(companion7, aVar2.b(rVar3, i17).getSpacing150()), rVar3, 0);
            m mVarB = q3Var.b(companion7, companion4.i());
            String testTag5 = paymentStatusCardData.getTestTag();
            if (testTag5 != null) {
                str5 = testTag5 + "Icon";
            } else {
                str5 = null;
            }
            d40.h.f(mVarB, new d40.b.C0864b(str5, jz.a.V, d40.i.f.f39709e, a.f204102a, paymentStatusCardData.getIconArrowContentDescription(), null, 32, null), false, rVar3, 0, 4);
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(m mVar, PaymentStatusCardData paymentStatusCardData, int i15, int i16, r rVar, int i17) {
        h(mVar, paymentStatusCardData, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
