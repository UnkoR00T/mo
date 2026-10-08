package p074lp1;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.d3;
import d1.e0;
import d1.r3;
import e30.BannerData;
import e30.e;
import er.a;
import er.l;
import er.p;
import er.q;
import f3.c;
import f3.j;
import i50.BaseScaffoldData;
import j30.ButtonTextData;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import t70.s;
import x40.LinkData;
import x50.NavigationButtonData;
import x50.i;
import y2.m;

/* JADX INFO: renamed from: lp1.p, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "p", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(Context context) {
        s.M(context, "Banner text button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(Context context, String str) {
        s.M(context, "Banner link button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(a aVar, int i15, r rVar, int i16) {
        p(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void p(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-376014560);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-376014560, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.banner.DeveloperBannerScreen (DeveloperBannerScreen.kt:28)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.b(), aVar), b.b("DS Banner (1.0.0)", ""), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(949697683, true, new q() { // from class: lp1.e
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.q(context, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: lp1.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.E(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(final Context context, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(949697683, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.banner.DeveloperBannerScreen.<anonymous> (DeveloperBannerScreen.kt:41)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarN = s.n(t70.i.S(a3.l(companion, d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
            n6.i(rVarC, w0VarA, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            d1.i0 i0Var = d1.i0.f39176a;
            Label labelB = b.b("Banner", "");
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            h.g(null, null, labelB, null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner UI informujący o nowinkach (tzw. Announcement Banner lub What's New Banner) służy do zwrócenia uwagi użytkownika na nowe funkcje, aktualizacje systemu lub ważne wydarzenia.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with button text", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB2 = b.b("Banner title", "");
            Label labelB3 = b.b("Banner body text", "");
            Label labelB4 = b.b("Banner button text", "");
            boolean zG = rVar.G(context);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: lp1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.r(context);
                    }
                };
                rVar.v(objE);
            }
            e30.a.ButtonText buttonText = new e30.a.ButtonText(new ButtonTextData(null, labelB4, null, null, (a) objE, 13, null));
            int i18 = a30.a.f2271a;
            boolean zG2 = rVar.G(context);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == r.INSTANCE.a()) {
                objE2 = new a() { // from class: lp1.j
                    @Override // er.a
                    public final Object a() {
                        return Function0.s(context);
                    }
                };
                rVar.v(objE2);
            }
            BannerData bannerData = new BannerData("", labelB2, labelB3, (a) objE2, buttonText, null, i18, 32, null);
            int i19 = BannerData.f47051j;
            e.c(null, bannerData, rVar, i19 << 3, 1);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with link button", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB5 = b.b("Banner title", "");
            Label labelB6 = b.b("Banner body text", "");
            Label labelB7 = b.b("Banner link button", "");
            LinkData.EnumC5775a enumC5775a = LinkData.EnumC5775a.WEBSITE;
            boolean zG3 = rVar.G(context);
            Object objE3 = rVar.E();
            if (zG3 || objE3 == r.INSTANCE.a()) {
                objE3 = new l() { // from class: lp1.k
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.w(context, (String) obj);
                    }
                };
                rVar.v(objE3);
            }
            e30.a.Link link = new e30.a.Link(new LinkData(null, labelB7, "https://www.przykladowy_link.pl", enumC5775a, false, (l) objE3, 17, null));
            int i25 = a30.a.f2271a;
            boolean zG4 = rVar.G(context);
            Object objE4 = rVar.E();
            if (zG4 || objE4 == r.INSTANCE.a()) {
                objE4 = new a() { // from class: lp1.l
                    @Override // er.a
                    public final Object a() {
                        return Function0.x(context);
                    }
                };
                rVar.v(objE4);
            }
            e.c(null, new BannerData("", labelB5, labelB6, (a) objE4, link, null, i25, 32, null), rVar, i19 << 3, 1);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with without button", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB8 = b.b("Banner title", "");
            Label labelB9 = b.b("Banner body text", "");
            int i26 = a30.a.f2271a;
            boolean zG5 = rVar.G(context);
            Object objE5 = rVar.E();
            if (zG5 || objE5 == r.INSTANCE.a()) {
                objE5 = new a() { // from class: lp1.m
                    @Override // er.a
                    public final Object a() {
                        return Function0.y(context);
                    }
                };
                rVar.v(objE5);
            }
            e.c(null, new BannerData("", labelB8, labelB9, (a) objE5, null, null, i26, 32, null), rVar, i19 << 3, 1);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with long title, long body text, long button text", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB10 = b.b("Banner long title Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam", "");
            Label labelB11 = b.b("Banner body text quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "");
            Label labelB12 = b.b("Banner button text Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident", "");
            boolean zG6 = rVar.G(context);
            Object objE6 = rVar.E();
            if (zG6 || objE6 == r.INSTANCE.a()) {
                objE6 = new a() { // from class: lp1.n
                    @Override // er.a
                    public final Object a() {
                        return Function0.z(context);
                    }
                };
                rVar.v(objE6);
            }
            e30.a.ButtonText buttonText2 = new e30.a.ButtonText(new ButtonTextData(null, labelB12, null, null, (a) objE6, 13, null));
            int i27 = a30.a.f2271a;
            boolean zG7 = rVar.G(context);
            Object objE7 = rVar.E();
            if (zG7 || objE7 == r.INSTANCE.a()) {
                objE7 = new a() { // from class: lp1.o
                    @Override // er.a
                    public final Object a() {
                        return Function0.A(context);
                    }
                };
                rVar.v(objE7);
            }
            e.c(null, new BannerData("", labelB10, labelB11, (a) objE7, buttonText2, null, i27, 32, null), rVar, i19 << 3, 1);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with button text and background image", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB13 = b.b("Banner title", "");
            Label labelB14 = b.b("Banner body text", "");
            Label labelB15 = b.b("Banner button text", "");
            boolean zG8 = rVar.G(context);
            Object objE8 = rVar.E();
            if (zG8 || objE8 == r.INSTANCE.a()) {
                objE8 = new a() { // from class: lp1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.B(context);
                    }
                };
                rVar.v(objE8);
            }
            e30.a.ButtonText buttonText3 = new e30.a.ButtonText(new ButtonTextData(null, labelB15, null, null, (a) objE8, 13, null));
            int i28 = a30.a.f2272b;
            int i29 = a30.a.f2271a;
            boolean zG9 = rVar.G(context);
            Object objE9 = rVar.E();
            if (zG9 || objE9 == r.INSTANCE.a()) {
                objE9 = new a() { // from class: lp1.c
                    @Override // er.a
                    public final Object a() {
                        return Function0.C(context);
                    }
                };
                rVar.v(objE9);
            }
            e.c(null, new BannerData("", labelB13, labelB14, (a) objE9, buttonText3, Integer.valueOf(i28), i29), rVar, i19 << 3, 1);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with link button and background image", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB16 = b.b("Banner title", "");
            Label labelB17 = b.b("Banner body text", "");
            Label labelB18 = b.b("Banner link button", "");
            boolean zG10 = rVar.G(context);
            Object objE10 = rVar.E();
            if (zG10 || objE10 == r.INSTANCE.a()) {
                objE10 = new l() { // from class: lp1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.D(context, (String) obj);
                    }
                };
                rVar.v(objE10);
            }
            e30.a.Link link2 = new e30.a.Link(new LinkData(null, labelB18, "https://www.przykladowy_link.pl", enumC5775a, false, (l) objE10, 17, null));
            int i35 = a30.a.f2272b;
            int i36 = a30.a.f2271a;
            boolean zG11 = rVar.G(context);
            Object objE11 = rVar.E();
            if (zG11 || objE11 == r.INSTANCE.a()) {
                objE11 = new a() { // from class: lp1.g
                    @Override // er.a
                    public final Object a() {
                        return Function0.t(context);
                    }
                };
                rVar.v(objE11);
            }
            e.c(null, new BannerData("", labelB16, labelB17, (a) objE11, link2, Integer.valueOf(i35), i36), rVar, i19 << 3, 1);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            h.g(null, null, b.b("Banner with long title, long body text, long link button and background image", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).j(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
            Label labelB19 = b.b("Banner long title Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam", "");
            Label labelB20 = b.b("Banner body long text quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.", "");
            Label labelB21 = b.b("Banner link buttonlaboris nisi ut aliquip ex ea commodo consequat.", "");
            boolean zG12 = rVar.G(context);
            Object objE12 = rVar.E();
            if (zG12 || objE12 == r.INSTANCE.a()) {
                objE12 = new l() { // from class: lp1.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.u(context, (String) obj);
                    }
                };
                rVar.v(objE12);
            }
            e30.a.Link link3 = new e30.a.Link(new LinkData(null, labelB21, "https://www.przykladowy_link.pl", enumC5775a, false, (l) objE12, 17, null));
            int i37 = a30.a.f2271a;
            int i38 = a30.a.f2272b;
            boolean zG13 = rVar.G(context);
            Object objE13 = rVar.E();
            if (zG13 || objE13 == r.INSTANCE.a()) {
                objE13 = new a() { // from class: lp1.i
                    @Override // er.a
                    public final Object a() {
                        return Function0.v(context);
                    }
                };
                rVar.v(objE13);
            }
            e.c(null, new BannerData("", labelB19, labelB20, (a) objE13, link3, Integer.valueOf(i38), i37), rVar, i19 << 3, 1);
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
    public static final i0 r(Context context) {
        s.M(context, "Banner text button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Context context, String str) {
        s.M(context, "Banner link button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(Context context, String str) {
        s.M(context, "Banner link button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(Context context) {
        s.M(context, "Banner close button clicked");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Context context) {
        s.M(context, "Banner text button clicked");
        return i0.f148189a;
    }
}
