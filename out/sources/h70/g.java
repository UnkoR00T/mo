package h70;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import c5.h;
import d1.b0;
import d1.c0;
import d1.e0;
import d1.i;
import d1.m3;
import d1.q3;
import er.l;
import er.p;
import er.q;
import f3.j;
import g70.ShortcutMoreTransferData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import mx.Label;
import o50.SmallCardData;
import oq.i0;
import oq.y;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import pq.v;
import y2.m;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a;\u0010\u000b\u001a\u00020\u00022\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tH\u0003¢\u0006\u0004\b\u000b\u0010\f\"\u0014\u0010\u0010\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f\"\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\r0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"Lh70/a;", "shortcutsLayoutData", "Loq/i0;", "f", "(Lh70/a;Lm2/r;I)V", "", "Lo50/a;", "visibleShortcuts", "moreShortcuts", "", "isVertical", "i", "(Ljava/util/List;Ljava/util/List;Lh70/a;ZLm2/r;I)V", "Lc5/h;", "a", "F", "shortcutSize", "Lkotlin/Function0;", "b", "Ler/p;", "minimalSpacingBetweenItems", "ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f81337a = h.n(80);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final p<r, Integer, h> f81338b = new p() { // from class: h70.b
        @Override // er.p
        public final Object B(Object obj, Object obj2) {
            return g.l((r) obj, ((Integer) obj2).intValue());
        }
    };

    public static final void f(final ShortcutsLayoutData shortcutsLayoutData, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1078783558);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(shortcutsLayoutData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1078783558, i16, -1, "pl.gov.coi.common.ui.shortcuts.row.ShortcutsLayout (ShortcutsLayout.kt:29)");
            }
            b0.d(null, f3.c.INSTANCE.e(), false, m.d(1989039132, true, new q() { // from class: h70.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return g.g(shortcutsLayoutData, (c0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, 3120, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h70.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(shortcutsLayoutData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(ShortcutsLayoutData shortcutsLayoutData, c0 c0Var, r rVar, int i15) {
        oq.r rVarA;
        i.e eVarH;
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(c0Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(1989039132, i15, -1, "pl.gov.coi.common.ui.shortcuts.row.ShortcutsLayout.<anonymous> (ShortcutsLayout.kt:31)");
            }
            int iA = (int) (c0Var.a() / h.n(f81337a + f81338b.B(rVar, 6).getValue()));
            if (iA >= shortcutsLayoutData.b().size()) {
                rVarA = y.a(shortcutsLayoutData.b(), v.n());
            } else {
                int i16 = iA - 1;
                rVarA = y.a(shortcutsLayoutData.b().subList(0, i16), shortcutsLayoutData.b().subList(i16, shortcutsLayoutData.b().size()));
            }
            List list = (List) rVarA.a();
            List list2 = (List) rVarA.b();
            boolean z15 = ((Configuration) rVar.N(AndroidCompositionLocals_androidKt.b())).fontScale > 1.5f;
            if (z15) {
                rVar.X(206178461);
                f3.m mVarH = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarA = e0.a(i.f39152a.r(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = j.e(rVar, mVarH);
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
                r rVarC = n6.c(rVar);
                n6.i(rVarC, w0VarA, companion.d());
                n6.i(rVarC, e0VarT, companion.f());
                n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
                n6.g(rVarC, companion.a());
                n6.i(rVarC, mVarE, companion.e());
                d1.i0 i0Var = d1.i0.f39176a;
                i(list, list2, shortcutsLayoutData, true, rVar, 3072);
                rVar.x();
                rVar.R();
            } else {
                if (z15) {
                    rVar.X(206175642);
                    rVar.R();
                    throw new oq.p();
                }
                rVar.X(2096842602);
                boolean z16 = shortcutsLayoutData.b().size() <= 3;
                if (z16) {
                    rVar.X(206191534);
                    eVarH = i.f39152a.s(k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300(), f3.c.INSTANCE.g());
                    rVar.R();
                } else {
                    if (z16) {
                        rVar.X(206188395);
                        rVar.R();
                        throw new oq.p();
                    }
                    rVar.X(206195112);
                    rVar.R();
                    eVarH = i.f39152a.h();
                }
                f3.m mVarH2 = androidx.compose.foundation.layout.d.h(f3.m.INSTANCE, 0.0f, 1, null);
                w0 w0VarB = m3.b(eVarH, f3.c.INSTANCE.l(), rVar, 0);
                int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT2 = rVar.t();
                f3.m mVarE2 = j.e(rVar, mVarH2);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB2 = companion2.b();
                if (rVar.l() == null) {
                    p076m2.m.d();
                }
                rVar.K();
                if (rVar.getInserting()) {
                    rVar.H(aVarB2);
                } else {
                    rVar.u();
                }
                r rVarC2 = n6.c(rVar);
                n6.i(rVarC2, w0VarB, companion2.d());
                n6.i(rVarC2, e0VarT2, companion2.f());
                n6.i(rVarC2, Integer.valueOf(iHashCode2), companion2.c());
                n6.g(rVarC2, companion2.a());
                n6.i(rVarC2, mVarE2, companion2.e());
                q3 q3Var = q3.f39261a;
                i(list, list2, shortcutsLayoutData, false, rVar, 3072);
                rVar.x();
                rVar.R();
            }
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(ShortcutsLayoutData shortcutsLayoutData, int i15, r rVar, int i16) {
        f(shortcutsLayoutData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    private static final void i(final List<SmallCardData> list, final List<SmallCardData> list2, final ShortcutsLayoutData shortcutsLayoutData, final boolean z15, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-354413976);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(list) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(list2) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(shortcutsLayoutData) ? 256 : 128;
        }
        if ((i15 & 3072) == 0) {
            i16 |= rVarH.a(z15) ? 2048 : 1024;
        }
        if (rVarH.r((i16 & 1171) != 1170, i16 & 1)) {
            if (t.k()) {
                t.o(-354413976, i16, -1, "pl.gov.coi.common.ui.shortcuts.row.SmallCardsContent (ShortcutsLayout.kt:67)");
            }
            rVarH.X(-1289408318);
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                o50.e.d((SmallCardData) it.next(), z15, rVarH, SmallCardData.f142457h | ((i16 >> 6) & 112), 0);
            }
            rVarH.R();
            if (list2.isEmpty()) {
                rVarH.X(-1319885350);
            } else {
                rVarH.X(-1316810398);
                Label text = shortcutsLayoutData.getMoreShortcut().getText();
                int i17 = jz.a.f106728a0;
                o50.f.c cVar = o50.f.c.f142478a;
                boolean zG = rVarH.G(shortcutsLayoutData) | rVarH.G(list2);
                Object objE = rVarH.E();
                if (zG || objE == r.INSTANCE.a()) {
                    objE = new er.a() { // from class: h70.e
                        @Override // er.a
                        public final Object a() {
                            return g.j(shortcutsLayoutData, list2);
                        }
                    };
                    rVarH.v(objE);
                }
                o50.e.d(new SmallCardData("ShortcutMore", text, null, i17, cVar, false, (er.a) objE, 36, null), z15, rVarH, SmallCardData.f142457h | ((i16 >> 6) & 112), 0);
            }
            rVarH.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h70.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.k(list, list2, shortcutsLayoutData, z15, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(ShortcutsLayoutData shortcutsLayoutData, List list) {
        l<List<ShortcutMoreTransferData>, i0> lVarA = shortcutsLayoutData.getMoreShortcut().a();
        List<SmallCardData> list2 = list;
        ArrayList arrayList = new ArrayList(v.y(list2, 10));
        for (SmallCardData smallCardData : list2) {
            arrayList.add(new ShortcutMoreTransferData(smallCardData.getTitle(), smallCardData.getIconResId(), smallCardData.d()));
        }
        lVarA.b(arrayList);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 k(List list, List list2, ShortcutsLayoutData shortcutsLayoutData, boolean z15, int i15, r rVar, int i16) {
        i(list, list2, shortcutsLayoutData, z15, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h l(r rVar, int i15) {
        rVar.X(-1442141706);
        if (t.k()) {
            t.o(-1442141706, i15, -1, "pl.gov.coi.common.ui.shortcuts.row.minimalSpacingBetweenItems.<anonymous> (ShortcutsLayout.kt:23)");
        }
        float spacing50 = k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing50();
        if (t.k()) {
            t.n();
        }
        rVar.R();
        return h.j(spacing50);
    }
}
