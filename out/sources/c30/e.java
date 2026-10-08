package c30;

import d1.a3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import d1.x;
import d40.h;
import er.l;
import f3.j;
import f3.m;
import i30.ButtonIconData;
import i30.g;
import k3.f;
import mx.Label;
import n4.f0;
import n4.i0;
import n4.v;
import oq.p;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i;
import w0.o;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lc30/b;", "data", "Loq/i0;", "c", "(Lf3/m;Lc30/b;Lm2/r;II)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void c(m mVar, final b bVar, r rVar, final int i15, final int i16) {
        final m mVar2;
        int i17;
        long jC;
        m mVarH;
        d40.b c0864b;
        String str;
        m mVar3;
        m.Companion companion;
        String str2;
        k70.a aVar;
        int i18;
        int i19;
        String str3;
        r rVarH = rVar.h(-468127226);
        int i25 = i16 & 1;
        if (i25 != 0) {
            i17 = i15 | 6;
            mVar2 = mVar;
        } else if ((i15 & 6) == 0) {
            mVar2 = mVar;
            i17 = i15 | (rVarH.W(mVar2) ? 4 : 2);
        } else {
            mVar2 = mVar;
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(bVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            m mVar4 = i25 != 0 ? m.INSTANCE : mVar2;
            if (t.k()) {
                t.o(-468127226, i17, -1, "pl.gov.coi.common.ui.ds.alert.Alert (Alert.kt:36)");
            }
            m mVarH2 = androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(mVar4, null, false, 3, null), 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i26 = k70.a.f108865b;
            m mVarA = f.a(mVarH2, aVar2.e(rVarH, i26).getRadius200());
            if (bVar instanceof b.c) {
                rVarH.X(1101311443);
                jC = aVar2.a(rVarH, i26).getSupport().i();
                rVarH.R();
            } else if (bVar instanceof b.e) {
                rVarH.X(1101313750);
                jC = aVar2.a(rVarH, i26).getSupport().b();
                rVarH.R();
            } else if (bVar instanceof b.C0606b) {
                rVarH.X(1101316084);
                jC = aVar2.a(rVarH, i26).getSupport().a();
                rVarH.R();
            } else if (bVar instanceof b.d) {
                rVarH.X(1101318422);
                jC = aVar2.a(rVarH, i26).getSupport().c();
                rVarH.R();
            } else {
                if (!(bVar instanceof b.a)) {
                    rVarH.X(1101309607);
                    rVarH.R();
                    throw new p();
                }
                rVarH.X(1101320974);
                jC = aVar2.a(rVarH, i26).getNeutral().c();
                rVarH.R();
            }
            m mVarD = i.d(mVarA, jC, null, 2, null);
            boolean z15 = bVar instanceof b.a;
            if (z15) {
                rVarH.X(-218703170);
                rVarH.R();
                mVarH = m.INSTANCE;
            } else {
                rVarH.X(-218662312);
                mVarH = o.h(m.INSTANCE, aVar2.b(rVarH, i26).getStrokeWidth(), bVar.e().B(rVarH, 0).m20unboximpl(), aVar2.e(rVarH, i26).getRadius200());
                rVarH.R();
            }
            m mVarU = mVarD.u(mVarH);
            boolean zG = rVarH.G(bVar);
            Object objE = rVarH.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new l() { // from class: c30.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.d(bVar, (i0) obj);
                    }
                };
                rVarH.v(objE);
            }
            m mVarC = v.c(mVarU, true, (l) objE);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarC);
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
            r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            x xVar = x.f39368a;
            m.Companion companion4 = m.INSTANCE;
            m mVarN = a3.n(androidx.compose.foundation.layout.d.h(companion4, 0.0f, 1, null), aVar2.b(rVarH, i26).getSpacing200());
            d1.i iVar = d1.i.f39152a;
            w0 w0VarB = m3.b(iVar.j(), companion2.l(), rVarH, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarN);
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
            r rVarC2 = n6.c(rVarH);
            n6.i(rVarC2, w0VarB, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            q3 q3Var = q3.f39261a;
            if (z15) {
                b.a aVar3 = (b.a) bVar;
                c0864b = new d40.b.a(null, bVar.getIconResId(), aVar3.getIconSize(), bVar.e(), d40.i.C0865i.f39712e, aVar3.i(), d40.a.C0863a.f39673a, null, null, 257, null);
            } else {
                c0864b = new d40.b.C0864b(null, bVar.getIconResId(), d40.i.f.f39709e, bVar.e(), null, null, 33, null);
            }
            h.f(null, c0864b, false, rVarH, 0, 5);
            r3.a(androidx.compose.foundation.layout.d.y(companion4, aVar2.b(rVarH, i26).getSpacing200()), rVarH, 0);
            m mVarC2 = p3.c(q3Var, companion4, 1.0f, false, 2, null);
            w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarC2);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB3);
            } else {
                rVarH.u();
            }
            r rVarC3 = n6.c(rVarH);
            n6.i(rVarC3, w0VarA, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label title = bVar.getTitle();
            if (title == null) {
                rVarH.X(1758373455);
                rVarH.R();
                i19 = 0;
                mVar3 = mVar4;
                i18 = i26;
                aVar = aVar2;
                companion = companion4;
                str2 = null;
            } else {
                rVarH.X(1758373456);
                String testTag = bVar.getTestTag();
                if (testTag != null) {
                    str = testTag + "TitleText";
                } else {
                    str = null;
                }
                mVar3 = mVar4;
                companion = companion4;
                str2 = null;
                j70.h.g(null, str, title, null, null, aVar2.a(rVarH, i26).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, b5.v.INSTANCE.b(), false, 0, 0, null, aVar2.f(rVarH, i26).a(), null, null, false, false, null, rVarH, 0, 24576, 0, 33013721);
                rVarH = rVarH;
                aVar = aVar2;
                i18 = i26;
                i19 = 0;
                r3.a(androidx.compose.foundation.layout.d.i(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), aVar.b(rVarH, i18).getSpacing50()), rVarH, 0);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVarH.R();
            }
            String testTag2 = bVar.getTestTag();
            if (testTag2 != null) {
                str3 = testTag2 + "BodyText";
            } else {
                str3 = str2;
            }
            int i27 = i18;
            r rVar2 = rVarH;
            int i28 = i19;
            j70.h.g(null, str3, bVar.getBodyText(), null, null, aVar.a(rVarH, i18).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).d(), null, null, false, false, null, rVar2, 0, 0, 0, 33030105);
            rVarH = rVar2;
            a alertButtonData = bVar.getAlertButtonData();
            if (alertButtonData == null) {
                rVarH.X(1759096933);
            } else {
                rVarH.X(1759096934);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVarH, i27).getSpacing100()), rVarH, i28);
                if (alertButtonData instanceof a.Link) {
                    rVarH.X(186759191);
                    x40.h.g(((a.Link) alertButtonData).getData(), rVarH, i28);
                    rVarH.R();
                } else {
                    if (!(alertButtonData instanceof a.ButtonText)) {
                        rVarH.X(186757124);
                        rVarH.R();
                        throw new p();
                    }
                    rVarH.X(186761917);
                    j30.f.e(null, ((a.ButtonText) alertButtonData).getData(), false, rVarH, 0, 5);
                    rVarH.R();
                }
                oq.i0 i0Var3 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
            ButtonIconData closeButtonData = bVar.getCloseButtonData();
            if (closeButtonData == null) {
                rVarH.X(759152745);
            } else {
                rVarH.X(759152746);
                r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i27).getSpacing100()), rVarH, i28);
                g.f(closeButtonData, false, false, rVarH, 0, 6);
                oq.i0 i0Var4 = oq.i0.f148189a;
            }
            rVarH.R();
            rVarH.x();
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
            d5VarM.a(new er.p() { // from class: c30.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.e(mVar2, bVar, i15, i16, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 d(b bVar, i0 i0Var) {
        f0.c0(i0Var, bVar.getAlertContentDescription().getText());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(m mVar, b bVar, int i15, int i16, r rVar, int i17) {
        c(mVar, bVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
