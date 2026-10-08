package y40;

import d1.a3;
import d1.d3;
import d1.h0;
import er.p;
import er.q;
import f3.m;
import mx.Label;
import n4.f0;
import n4.g0;
import oq.i0;
import p046f2.vb;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r;
import p076m2.t;
import pq.v;
import t70.s;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007\"\u0014\u0010\n\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0007¨\u0006\u000b"}, d2 = {"Ly40/a;", "data", "Loq/i0;", "j", "(Ly40/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "MENU_MIN_WIDTH", "b", "MENU_MAX_WIDTH", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f223864a = c5.h.n(112);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f223865b = c5.h.n(280);

    public static final void j(final MenuData menuData, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(767046670);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(menuData) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(767046670, i16, -1, "pl.gov.coi.common.ui.ds.menus.Menu (Menu.kt:38)");
            }
            Object objE = rVarH.E();
            if (objE == r.INSTANCE.a()) {
                objE = s.I();
                rVarH.v(objE);
            }
            final cx.a aVar = (cx.a) objE;
            rVar2 = rVarH;
            p046f2.l.e(menuData.getIsMenuVisible(), menuData.b(), androidx.compose.foundation.layout.d.z(w0.i.d(m.INSTANCE, k70.a.f108864a.a(rVarH, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), f223864a, f223865b), 0L, null, null, null, 0L, 0.0f, 0.0f, null, y2.m.d(1215121331, true, new q() { // from class: y40.c
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return l.k(menuData, aVar, (h0) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, 0, 48, 2040);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: y40.d
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return l.s(menuData, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v12 */
    /* JADX WARN: Type inference failed for: r15v0 */
    /* JADX WARN: Type inference failed for: r15v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r15v3 */
    public static final i0 k(MenuData menuData, final cx.a aVar, h0 h0Var, r rVar, int i15) {
        y2.f fVarD;
        final MenuData menuData2 = menuData;
        ?? r15 = 0;
        ?? r16 = 1;
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (t.k()) {
                t.o(1215121331, i15, -1, "pl.gov.coi.common.ui.ds.menus.Menu.<anonymous> (Menu.kt:51)");
            }
            int i16 = 0;
            for (Object obj : menuData2.a()) {
                int i17 = i16 + 1;
                if (i16 < 0) {
                    v.x();
                }
                final b bVar = (b) obj;
                Object objE = rVar.E();
                r.Companion companion = r.INSTANCE;
                if (objE == companion.a()) {
                    objE = b1.k.a();
                    rVar.v(objE);
                }
                b1.l lVar = (b1.l) objE;
                f6<Boolean> f6VarA = b1.f.a(lVar, rVar, 6);
                k70.a aVar2 = k70.a.f108864a;
                int i18 = k70.a.f108865b;
                d3 d3VarG = a3.g(aVar2.b(rVar, i18).getSpacing200(), 0.0f, 2, null);
                m.Companion companion2 = m.INSTANCE;
                Object objE2 = rVar.E();
                if (objE2 == companion.a()) {
                    objE2 = new er.l() { // from class: y40.e
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l.l((n4.i0) obj2);
                        }
                    };
                    rVar.v(objE2);
                }
                m mVarD = n4.v.d(companion2, r15, (er.l) objE2, r16, null);
                boolean zW = rVar.W(bVar);
                Object objE3 = rVar.E();
                if (zW || objE3 == companion.a()) {
                    objE3 = new er.l() { // from class: y40.f
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return l.m(bVar, (n4.i0) obj2);
                        }
                    };
                    rVar.v(objE3);
                }
                y2.f fVar = null;
                m mVarB = s.B(n4.v.d(mVarD, r15, (er.l) objE3, r16, null), f6VarA, aVar2.e(rVar, i18).getRadius50(), rVar, r15);
                final d40.b.C0864b leftIconData = bVar.getLeftIconData();
                if (leftIconData == null) {
                    rVar.X(1718623800);
                    rVar.R();
                } else {
                    rVar.X(1718623801);
                    y2.f fVarD2 = y2.m.d(1690694688, r16, new p() { // from class: y40.g
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return l.n(leftIconData, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVar, 54);
                    rVar.R();
                    fVar = fVarD2;
                }
                final d40.b.C0864b rightIconData = bVar.getRightIconData();
                if (rightIconData == null) {
                    rVar.X(1718967032);
                    rVar.R();
                    fVarD = null;
                } else {
                    rVar.X(1718967033);
                    fVarD = y2.m.d(2053682311, r16, new p() { // from class: y40.h
                        @Override // er.p
                        public final Object B(Object obj2, Object obj3) {
                            return l.o(rightIconData, (r) obj2, ((Integer) obj3).intValue());
                        }
                    }, rVar, 54);
                    rVar.R();
                }
                int i19 = i16;
                y2.f fVarD3 = y2.m.d(761819326, r16, new p() { // from class: y40.i
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return l.p(bVar, (r) obj2, ((Integer) obj3).intValue());
                    }
                }, rVar, 54);
                boolean zG = rVar.G(aVar) | rVar.G(menuData2) | rVar.W(bVar);
                Object objE4 = rVar.E();
                if (zG || objE4 == companion.a()) {
                    objE4 = new er.a() { // from class: y40.j
                        @Override // er.a
                        public final Object a() {
                            return l.q(aVar, menuData2, bVar);
                        }
                    };
                    rVar.v(objE4);
                }
                p046f2.l.f(fVarD3, (er.a) objE4, mVarB, fVar, fVarD, false, null, d3VarG, lVar, rVar, 100663302, 96);
                if (i19 != v.p(menuData.a())) {
                    rVar.X(1719048346);
                    vb.h(null, aVar2.b(rVar, i18).getStrokeWidth(), aVar2.a(rVar, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().g(), rVar, 0, 1);
                } else {
                    rVar.X(1715853300);
                }
                rVar.R();
                i16 = i17;
                r15 = 0;
                r16 = 1;
                menuData2 = menuData;
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
    public static final i0 l(n4.i0 i0Var) {
        g0.a(i0Var, true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(b bVar, n4.i0 i0Var) {
        String testTag = bVar.getTestTag();
        if (testTag == null) {
            testTag = "menuItem_" + bVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String().getTag();
        }
        f0.y0(i0Var, testTag);
        f0.r0(i0Var, n4.l.INSTANCE.a());
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(d40.b.C0864b c0864b, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1690694688, i15, -1, "pl.gov.coi.common.ui.ds.menus.Menu.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:73)");
            }
            d40.h.f(null, c0864b, false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(d40.b.C0864b c0864b, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(2053682311, i15, -1, "pl.gov.coi.common.ui.ds.menus.Menu.<anonymous>.<anonymous>.<anonymous>.<anonymous> (Menu.kt:82)");
            }
            d40.h.f(null, c0864b, false, rVar, 0, 5);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(b bVar, r rVar, int i15) {
        String str;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(761819326, i15, -1, "pl.gov.coi.common.ui.ds.menus.Menu.<anonymous>.<anonymous>.<anonymous> (Menu.kt:75)");
            }
            String testTag = bVar.getTestTag();
            if (testTag != null) {
                str = testTag + "Text";
            } else {
                str = null;
            }
            Label label = bVar.getOrg.bouncycastle.jcajce.util.AnnotatedPrivateKey.LABEL java.lang.String();
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            j70.h.g(null, str, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 0, 0, 0, 33030105);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(cx.a aVar, final MenuData menuData, final b bVar) {
        cx.a.a(aVar, 0L, new er.a() { // from class: y40.k
            @Override // er.a
            public final Object a() {
                return l.r(menuData, bVar);
            }
        }, 1, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(MenuData menuData, b bVar) {
        menuData.b().a();
        bVar.c().a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(MenuData menuData, int i15, r rVar, int i16) {
        j(menuData, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
