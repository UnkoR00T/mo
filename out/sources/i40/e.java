package i40;

import androidx.compose.ui.window.l;
import d1.a3;
import d1.e0;
import d1.m3;
import d1.q3;
import d1.r3;
import d40.h;
import er.p;
import f3.j;
import h30.ButtonData;
import h30.q;
import mx.Label;
import n4.f0;
import n4.v;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import w0.i;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li40/a;", "data", "Loq/i0;", "d", "(Li40/a;Lm2/r;I)V", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class e {
    public static final void d(final a aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1854878546);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.W(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1854878546, i16, -1, "pl.gov.coi.common.ui.ds.dialog.DialogComponent (DialogComponent.kt:38)");
            }
            androidx.compose.ui.window.a.a(aVar.d(), new l(false, false, false, 3, null), m.d(712627497, true, new p() { // from class: i40.b
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.e(aVar, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 432, 0);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: i40.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return e.g(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(final a aVar, r rVar, int i15) {
        String str;
        String str2;
        int i16;
        f3.m.Companion companion;
        i0 i0Var;
        f3.m.Companion companion2;
        int i17;
        String str3;
        String str4;
        r rVar2 = rVar;
        if (rVar2.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(712627497, i15, -1, "pl.gov.coi.common.ui.ds.dialog.DialogComponent.<anonymous> (DialogComponent.kt:43)");
            }
            f3.m.Companion companion3 = f3.m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarO = a3.o(i.c(a3.n(companion3, aVar2.b(rVar2, i18).getSpacing300()), aVar2.a(rVar2, i18).getSurface().a(), aVar2.e(rVar2, i18).getRadius200()), aVar2.b(rVar2, i18).getSpacing250(), aVar2.b(rVar2, i18).getSpacing300());
            boolean zW = rVar2.W(aVar);
            Object objE = rVar2.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new er.l() { // from class: i40.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return e.f(aVar, (n4.i0) obj);
                    }
                };
                rVar2.v(objE);
            }
            f3.m mVarD = v.d(mVarO, false, (er.l) objE, 1, null);
            f3.c.b horizontalAlignment = aVar.getHorizontalAlignment();
            d1.i iVar = d1.i.f39152a;
            w0 w0VarA = e0.a(iVar.k(), horizontalAlignment, rVar2, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar2, 0));
            p076m2.e0 e0VarT = rVar2.t();
            f3.m mVarE = j.e(rVar2, mVarD);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
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
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            d1.i0 i0Var2 = d1.i0.f39176a;
            if (aVar instanceof a.WithIcon) {
                rVar2.X(-1339498480);
                a.WithIcon withIcon = (a.WithIcon) aVar;
                String testTag = withIcon.getTestTag();
                if (testTag != null) {
                    str4 = testTag + "Icon";
                } else {
                    str4 = null;
                }
                h.f(null, new d40.b.C0864b(str4, withIcon.getIcon().getIconResId(), d40.i.f.f39709e, withIcon.getIcon().a(), Label.INSTANCE.c(), null, 32, null), false, rVar, 0, 5);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar2, i18).getSpacing200()), rVar2, 0);
            } else {
                rVar2.X(-1341598141);
            }
            rVar2.R();
            String testTag2 = aVar.getTestTag();
            if (testTag2 != null) {
                str = testTag2 + "Title";
            } else {
                str = null;
            }
            j70.h.g(null, str, aVar.getTitle(), null, null, aVar2.a(rVar2, i18).getNeutral().i(), 0L, null, null, null, 0L, null, b5.j.h(aVar.getTextAlign()), 0L, 0, false, 0, 0, null, aVar2.f(rVar2, i18).q(), null, null, false, false, null, rVar, 0, 0, 0, 33026009);
            r rVar3 = rVar;
            p<r, Integer, q4.e> pVarA = aVar.a();
            if (pVarA == null) {
                rVar3.X(-1338819488);
                rVar3.R();
                companion = companion3;
                i16 = i18;
                i0Var = null;
            } else {
                rVar3.X(-1338819487);
                r3.a(androidx.compose.foundation.layout.d.i(companion3, aVar2.b(rVar3, i18).getSpacing200()), rVar3, 0);
                String testTag3 = aVar.getTestTag();
                if (testTag3 != null) {
                    str2 = testTag3 + "AnnotatedBody";
                } else {
                    str2 = null;
                }
                i16 = i18;
                companion = companion3;
                j70.h.g(null, str2, null, null, pVarA.B(rVar3, 0), aVar2.a(rVar3, i18).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(aVar.getTextAlign()), 0L, 0, false, 0, 0, null, aVar2.f(rVar3, i18).d(), null, null, false, false, null, rVar, 0, 0, 0, 33025997);
                rVar3 = rVar;
                i0 i0Var3 = i0.f148189a;
                rVar3.R();
                i0Var = i0.f148189a;
            }
            if (i0Var == null) {
                rVar3.X(-1338391470);
                if (aVar.getBody() == null) {
                    rVar3.X(-1338391471);
                    rVar3.R();
                    companion2 = companion;
                    i17 = i16;
                } else {
                    rVar3.X(-1338391470);
                    int i19 = i16;
                    f3.m.Companion companion5 = companion;
                    r3.a(androidx.compose.foundation.layout.d.i(companion5, aVar2.b(rVar3, i19).getSpacing200()), rVar3, 0);
                    String testTag4 = aVar.getTestTag();
                    if (testTag4 != null) {
                        str3 = testTag4 + "Body";
                    } else {
                        str3 = null;
                    }
                    i17 = i19;
                    companion2 = companion5;
                    j70.h.g(null, str3, aVar.getBody(), null, null, aVar2.a(rVar3, i19).getNeutral().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.f()), 0L, 0, false, 0, 0, null, aVar2.f(rVar3, i19).d(), null, null, false, false, null, rVar, 0, 0, 0, 33026009);
                    rVar3 = rVar;
                    i0 i0Var4 = i0.f148189a;
                    rVar3.R();
                }
                rVar3.R();
            } else {
                companion2 = companion;
                i17 = i16;
                rVar3.X(-1705755947);
                rVar3.R();
            }
            ButtonData secondaryButtonData = aVar.getSecondaryButtonData();
            ButtonData tertiaryButtonData = aVar.getTertiaryButtonData();
            if (secondaryButtonData == null || tertiaryButtonData == null) {
                f3.m.Companion companion6 = companion2;
                int i25 = i17;
                rVar3.X(-1337413172);
                r3.a(androidx.compose.foundation.layout.d.i(companion6, aVar2.b(rVar3, i25).getSpacing400()), rVar3, 0);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(companion6, 0.0f, 1, null);
                w0 w0VarB = m3.b(iVar.f(), f3.c.INSTANCE.l(), rVar3, 6);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar3, 0));
                p076m2.e0 e0VarT2 = rVar3.t();
                f3.m mVarE2 = j.e(rVar3, mVarH);
                er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
                if (rVar3.l() == null) {
                    p076m2.m.d();
                }
                rVar3.K();
                if (rVar3.getInserting()) {
                    rVar3.H(aVarB2);
                } else {
                    rVar3.u();
                }
                r rVarC2 = n6.c(rVar3);
                n6.i(rVarC2, w0VarB, companion4.d());
                n6.i(rVarC2, e0VarT2, companion4.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
                n6.g(rVarC2, companion4.a());
                n6.i(rVarC2, mVarE2, companion4.e());
                q3 q3Var = q3.f39261a;
                ButtonData secondaryButtonData2 = aVar.getSecondaryButtonData();
                if (secondaryButtonData2 == null) {
                    rVar3.X(-1291259337);
                } else {
                    rVar3.X(-1291259336);
                    q.p(secondaryButtonData2, false, null, rVar, 0, 6);
                    rVar3 = rVar;
                    r3.a(androidx.compose.foundation.layout.d.y(companion6, aVar2.b(rVar3, i25).getSpacing50()), rVar3, 0);
                    i0 i0Var5 = i0.f148189a;
                }
                rVar3.R();
                q.p(aVar.getPrimaryButtonData(), false, null, rVar3, 0, 6);
                rVar.x();
                rVar.R();
            } else {
                rVar3.X(-1337843111);
                int i26 = i17;
                f3.m.Companion companion7 = companion2;
                r3.a(androidx.compose.foundation.layout.d.i(companion7, aVar2.b(rVar3, i26).getSpacing300()), rVar3, 0);
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(companion7, 0.0f, 1, null);
                w0 w0VarA2 = e0.a(iVar.r(aVar2.b(rVar3, i26).getSpacing150()), f3.c.INSTANCE.j(), rVar3, 48);
                int iHashCode3 = Long.hashCode(p076m2.m.b(rVar3, 0));
                p076m2.e0 e0VarT3 = rVar3.t();
                f3.m mVarE3 = j.e(rVar3, mVarH2);
                er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
                if (rVar3.l() == null) {
                    p076m2.m.d();
                }
                rVar3.K();
                if (rVar3.getInserting()) {
                    rVar3.H(aVarB3);
                } else {
                    rVar3.u();
                }
                r rVarC3 = n6.c(rVar3);
                n6.i(rVarC3, w0VarA2, companion4.d());
                n6.i(rVarC3, e0VarT3, companion4.f());
                n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
                n6.g(rVarC3, companion4.a());
                n6.i(rVarC3, mVarE3, companion4.e());
                q.p(aVar.getPrimaryButtonData(), false, null, rVar3, 0, 6);
                q.p(secondaryButtonData, false, null, rVar, 0, 6);
                q.p(tertiaryButtonData, false, null, rVar, 0, 6);
                rVar.x();
                rVar.R();
            }
            rVar.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(a aVar, n4.i0 i0Var) {
        String testTag = aVar.getTestTag();
        if (testTag == null) {
            testTag = aVar.getTitle().getTag();
        }
        f0.y0(i0Var, testTag);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(a aVar, int i15, r rVar, int i16) {
        d(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
