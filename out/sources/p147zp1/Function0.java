package p147zp1;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import cb4.DialogButtonTextData;
import cb4.DialogData;
import cb4.g;
import cb4.h;
import d1.a3;
import d1.d3;
import d1.e0;
import er.a;
import er.l;
import er.p;
import er.q;
import f3.c;
import f3.j;
import h30.ButtonData;
import i50.BaseScaffoldData;
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
import x50.NavigationButtonData;
import x50.i;
import y2.m;

/* JADX INFO: renamed from: zp1.s, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "Lkotlin/Function1;", "Lcb4/d;", "showDialog", "s", "(Ler/a;Ler/l;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(Context context) {
        s.M(context, "Zignorowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(l lVar, final Context context) {
        lVar.b(new DialogData(h.b.f24985a, b.b("Dialog", ""), b.b("Dialog with three buttons. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar tempor. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.", ""), new DialogButtonTextData(b.b("Potwierdź", ""), null, new a() { // from class: zp1.d
            @Override // er.a
            public final Object a() {
                return Function0.C(context);
            }
        }, 2, null), new DialogButtonTextData(b.b("Edytuj", ""), null, new a() { // from class: zp1.e
            @Override // er.a
            public final Object a() {
                return Function0.D(context);
            }
        }, 2, null), new DialogButtonTextData(b.b("Anuluj", ""), null, new a() { // from class: zp1.f
            @Override // er.a
            public final Object a() {
                return Function0.E(context);
            }
        }, 2, null), new a() { // from class: zp1.g
            @Override // er.a
            public final Object a() {
                return Function0.F(context);
            }
        }));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(Context context) {
        s.M(context, "Potwierdzono");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(Context context) {
        s.M(context, "Zedytowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Context context) {
        s.M(context, "Anulowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Context context) {
        s.M(context, "Zignorowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(l lVar, final Context context) {
        lVar.b(new DialogData(new h.WithIcon(g.ALERT), b.b("Dialog", ""), b.b("Dialog with destructive button and icon", ""), new DialogButtonTextData(b.b("Potwierdź", ""), cb4.a.C0668a.f24967a, new a() { // from class: zp1.o
            @Override // er.a
            public final Object a() {
                return Function0.H(context);
            }
        }), new DialogButtonTextData(b.b("Anuluj", ""), null, new a() { // from class: zp1.p
            @Override // er.a
            public final Object a() {
                return Function0.I(context);
            }
        }, 2, null), null, new a() { // from class: zp1.q
            @Override // er.a
            public final Object a() {
                return Function0.J(context);
            }
        }, 32, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Context context) {
        s.M(context, "Potwierdzono");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(Context context) {
        s.M(context, "Anulowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J(Context context) {
        s.M(context, "Zignorowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 K(a aVar, l lVar, int i15, r rVar, int i16) {
        s(aVar, lVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void s(final a<i0> aVar, final l<? super DialogData, i0> lVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(-39278953);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(-39278953, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dialog.DeveloperDialogScreen (DeveloperDialogScreen.kt:35)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            rVar2 = rVarH;
            i50.s.r(new BaseScaffoldData(null, new i.Small(new NavigationButtonData(NavigationButtonData.a.Icon.INSTANCE.a(), aVar), b.b("Dialog (1.1)", ""), null, null, null, 28, null), null, null, null, null, 61, null), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, m.d(1855059530, true, new q() { // from class: zp1.h
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return Function0.t(lVar, context, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
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
            d5VarM.a(new p() { // from class: zp1.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.K(aVar, lVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(final l lVar, final Context context, d3 d3Var, r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(1855059530, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.dialog.DeveloperDialogScreen.<anonymous> (DeveloperDialogScreen.kt:50)");
            }
            f3.m mVarN = s.n(t70.i.S(d.f(a3.l(f3.m.INSTANCE, d3Var), 0.0f, 1, null), null, rVar, 0, 1), rVar, 0);
            d1.i iVar = d1.i.f39152a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            w0 w0VarA = e0.a(iVar.r(aVar.b(rVar, i17).getSpacing200()), c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = j.e(rVar, mVarN);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion.b();
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
            j70.h.g(null, null, b.b("Dialog", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).q(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            j70.h.g(null, null, b.b("Dialog pozwala na wyświetlenie komunikatu na warstwie nad główną warstwą interfejsu użytkownika.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).b(), null, null, false, false, null, rVar, 0, 0, 0, 33030139);
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.d.a aVar2 = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(b.b("Show dialog with 1 button", ""), null, 2, null);
            boolean zW = rVar.W(lVar) | rVar.G(context);
            Object objE = rVar.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: zp1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.u(lVar, context);
                    }
                };
                rVar.v(objE);
            }
            h30.q.p(new ButtonData(null, null, large, withText, aVar2, null, (a) objE, 35, null), false, null, rVar, 0, 6);
            k30.a.Large large2 = new k30.a.Large(false, 1, null);
            k30.c.WithText withText2 = new k30.c.WithText(b.b("Show dialog with 2 buttons", ""), null, 2, null);
            boolean zW2 = rVar.W(lVar) | rVar.G(context);
            Object objE2 = rVar.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new a() { // from class: zp1.j
                    @Override // er.a
                    public final Object a() {
                        return Function0.x(lVar, context);
                    }
                };
                rVar.v(objE2);
            }
            h30.q.p(new ButtonData(null, null, large2, withText2, aVar2, null, (a) objE2, 35, null), false, null, rVar, 0, 6);
            k30.a.Large large3 = new k30.a.Large(false, 1, null);
            k30.c.WithText withText3 = new k30.c.WithText(b.b("Show dialog with 3 buttons", ""), null, 2, null);
            boolean zW3 = rVar.W(lVar) | rVar.G(context);
            Object objE3 = rVar.E();
            if (zW3 || objE3 == r.INSTANCE.a()) {
                objE3 = new a() { // from class: zp1.k
                    @Override // er.a
                    public final Object a() {
                        return Function0.B(lVar, context);
                    }
                };
                rVar.v(objE3);
            }
            h30.q.p(new ButtonData(null, null, large3, withText3, aVar2, null, (a) objE3, 35, null), false, null, rVar, 0, 6);
            k30.a.Large large4 = new k30.a.Large(false, 1, null);
            k30.c.WithText withText4 = new k30.c.WithText(b.b("Show dialog with icon and destructive button", ""), null, 2, null);
            boolean zW4 = rVar.W(lVar) | rVar.G(context);
            Object objE4 = rVar.E();
            if (zW4 || objE4 == r.INSTANCE.a()) {
                objE4 = new a() { // from class: zp1.l
                    @Override // er.a
                    public final Object a() {
                        return Function0.G(lVar, context);
                    }
                };
                rVar.v(objE4);
            }
            h30.q.p(new ButtonData(null, null, large4, withText4, aVar2, null, (a) objE4, 35, null), false, null, rVar, 0, 6);
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
    public static final i0 u(l lVar, final Context context) {
        lVar.b(new DialogData(h.b.f24985a, b.b("Dialog", ""), b.b("Dialog with one button", ""), new DialogButtonTextData(b.b("Potwierdź", ""), null, new a() { // from class: zp1.m
            @Override // er.a
            public final Object a() {
                return Function0.v(context);
            }
        }, 2, null), null, null, new a() { // from class: zp1.n
            @Override // er.a
            public final Object a() {
                return Function0.w(context);
            }
        }, 48, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Context context) {
        s.M(context, "Potwierdzono");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(Context context) {
        s.M(context, "Zignorowano");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(l lVar, final Context context) {
        lVar.b(new DialogData(h.b.f24985a, b.b("Dialog", ""), b.b("Dialog with two buttons. Lorem ipsum dolor sit amet, consectetur adipiscing elit. Aenean euismod bibendum laoreet. Proin gravida dolor sit amet lacus accumsan et viverra justo commodo. Proin sodales pulvinar tempor. Cum sociis natoque penatibus et magnis dis parturient montes, nascetur ridiculus mus.", ""), new DialogButtonTextData(b.b("Potwierdź", ""), null, new a() { // from class: zp1.r
            @Override // er.a
            public final Object a() {
                return Function0.y(context);
            }
        }, 2, null), new DialogButtonTextData(b.b("Anuluj", ""), null, new a() { // from class: zp1.b
            @Override // er.a
            public final Object a() {
                return Function0.z(context);
            }
        }, 2, null), null, new a() { // from class: zp1.c
            @Override // er.a
            public final Object a() {
                return Function0.A(context);
            }
        }, 32, null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(Context context) {
        s.M(context, "Potwierdzono");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Context context) {
        s.M(context, "Anulowano");
        return i0.f148189a;
    }
}
