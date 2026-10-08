package k12;

import b5.TextGeometricTransform;
import d1.e0;
import d1.i0;
import d1.m3;
import d1.q3;
import d1.r3;
import er.p;
import j30.ButtonTextData;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import n3.Shadow;
import oq.r;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.t;
import pq.v;
import q12.MessageSectionStatusData;
import q4.SpanStyle;
import q4.TextStyle;
import q4.j0;
import u4.y;
import u4.z;
import x4.LocaleList;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a=\u0010\t\u001a\u00020\b2\u0018\u0010\u0003\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00010\u00002\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"", "Loq/r;", "Lmx/a;", "labelList", "Lq12/c;", "statusData", "Lj30/a;", "detailsButtonData", "Loq/i0;", "c", "(Ljava/util/List;Lq12/c;Lj30/a;Lm2/r;I)V", "e", "(Lq12/c;Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class c {
    public static final void c(final List<r<Label, Label>> list, final MessageSectionStatusData messageSectionStatusData, ButtonTextData buttonTextData, p076m2.r rVar, final int i15) {
        int i16;
        final ButtonTextData buttonTextData2 = buttonTextData;
        p076m2.r rVarH = rVar.h(-120414);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= (i15 & 64) == 0 ? rVarH.W(messageSectionStatusData) : rVarH.G(messageSectionStatusData) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= (i15 & 512) == 0 ? rVarH.W(buttonTextData2) : rVarH.G(buttonTextData2) ? 256 : 128;
        }
        int i17 = 0;
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (t.k()) {
                t.o(-120414, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.MailHeaderSection (MailHeaderSection.kt:25)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            i0 i0Var = i0.f39176a;
            rVarH.X(1853367145);
            Iterator it = list.iterator();
            int i18 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i19 = i18 + 1;
                if (i18 < 0) {
                    v.x();
                }
                r rVar2 = (r) next;
                f3.m.Companion companion3 = f3.m.INSTANCE;
                w0 w0VarB = m3.b(d1.i.f39152a.j(), f3.c.INSTANCE.l(), rVarH, i17);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, i17));
                p076m2.e0 e0VarT2 = rVarH.t();
                f3.m mVarE2 = f3.j.e(rVarH, companion3);
                androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
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
                n6.i(rVarC2, w0VarB, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                q3 q3Var = q3.f39261a;
                rVarH.X(-1602109577);
                q4.e.b bVar = new q4.e.b(0, 1, null);
                k70.a aVar = k70.a.f108864a;
                int i25 = k70.a.f108865b;
                TextStyle textStyleB = aVar.f(rVarH, i25).b();
                int iO = bVar.o(new SpanStyle(aVar.a(rVarH, i25).getNeutral().b(), textStyleB.n(), textStyleB.q(), (y) null, (z) null, textStyleB.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
                try {
                    bVar.f(((Label) rVar2.c()).getText());
                    bVar.f(" ");
                    bVar.l(iO);
                    TextStyle textStyleA = aVar.f(rVarH, i25).a();
                    int iO2 = bVar.o(new SpanStyle(aVar.a(rVarH, i25).getNeutral().i(), textStyleA.n(), textStyleA.q(), (y) null, (z) null, textStyleA.l(), (String) null, 0L, (b5.a) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (b5.k) null, (Shadow) null, (j0) null, (p3.g) null, 65496, (fr.k) null));
                    try {
                        bVar.f(((Label) rVar2.d()).getText());
                        bVar.l(iO2);
                        oq.i0 i0Var2 = oq.i0.f148189a;
                        q4.e eVarP = bVar.p();
                        rVarH.R();
                        Iterator it4 = it;
                        p076m2.r rVar3 = rVarH;
                        j70.h.g(null, null, null, null, eVarP, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar3, 0, 0, 0, 33554415);
                        rVar3.x();
                        if (i18 != v.p(list)) {
                            rVar3.X(1801792249);
                            r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar.b(rVar3, i25).getSpacing100()), rVar3, 0);
                        } else {
                            rVar3.X(1799996109);
                        }
                        rVar3.R();
                        it = it4;
                        i18 = i19;
                        rVarH = rVar3;
                        i17 = 0;
                    } catch (Throwable th4) {
                        bVar.l(iO2);
                        throw th4;
                    }
                } catch (Throwable th5) {
                    bVar.l(iO);
                    throw th5;
                }
            }
            int i26 = i17;
            p076m2.r rVar4 = rVarH;
            rVar4.R();
            if (messageSectionStatusData == null) {
                rVar4.X(1620517788);
            } else {
                rVar4.X(1620517789);
                e(messageSectionStatusData, rVar4, r50.a.WithIcon.f171875m);
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVar4.R();
            if (buttonTextData == null) {
                rVar4.X(1620588995);
                rVar4.R();
                buttonTextData2 = buttonTextData;
                rVarH = rVar4;
            } else {
                rVar4.X(1620588996);
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar4, k70.a.f108865b).getSpacing100()), rVar4, i26);
                buttonTextData2 = buttonTextData;
                rVarH = rVar4;
                j30.f.e(null, buttonTextData2, false, rVarH, ButtonTextData.f99099f << 3, 5);
                oq.i0 i0Var4 = oq.i0.f148189a;
                rVarH.R();
            }
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k12.a
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.d(list, messageSectionStatusData, buttonTextData2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(List list, MessageSectionStatusData messageSectionStatusData, ButtonTextData buttonTextData, int i15, p076m2.r rVar, int i16) {
        c(list, messageSectionStatusData, buttonTextData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void e(final MessageSectionStatusData messageSectionStatusData, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-1117318553);
        if ((i15 & 6) == 0) {
            i16 = i15 | ((i15 & 8) == 0 ? rVarH.W(messageSectionStatusData) : rVarH.G(messageSectionStatusData) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1117318553, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.StatusSection (MailHeaderSection.kt:62)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i17).getSpacing100()), rVarH, 0);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, companion);
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
            i0 i0Var = i0.f39176a;
            w0 w0VarB = m3.b(iVar.j(), companion2.i(), rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            f3.m mVarE2 = f3.j.e(rVarH, companion);
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
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            rVar2 = rVarH;
            j70.h.g(null, null, messageSectionStatusData.getKeyLabel(), null, null, aVar.a(rVarH, i17).getNeutral().b(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i17).b(), null, null, false, false, null, rVar2, 0, 0, 0, 33030107);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar2, i17).getSpacing50()), rVar2, 0);
            r50.e.f(messageSectionStatusData.getStatusBadge(), false, null, false, rVar2, r50.a.WithIcon.f171875m, 14);
            rVar2.x();
            rVar2.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k12.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return c.f(messageSectionStatusData, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 f(MessageSectionStatusData messageSectionStatusData, int i15, p076m2.r rVar, int i16) {
        e(messageSectionStatusData, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
