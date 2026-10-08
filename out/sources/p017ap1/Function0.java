package p017ap1;

import android.content.Context;
import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import d1.a3;
import d1.e0;
import d1.i;
import d1.r3;
import er.a;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import h30.ButtonData;
import h30.q;
import j70.h;
import mx.Label;
import mx.b;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.g;
import t70.s;

/* JADX INFO: renamed from: ap1.r, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "r", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(Context context) {
        s.M(context, "TopMenu on back arrow clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B(Context context) {
        s.M(context, "TopMenu on menu icon clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C(Context context) {
        s.M(context, "TopMenu on back arrow clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D(Context context) {
        s.M(context, "TopMenu on close icon clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E(Context context) {
        s.M(context, "TopMenu on back arrow clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F(Context context) {
        s.M(context, "TopMenu on close icon clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G(Context context) {
        s.M(context, "TopMenu on back arrow clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H(Context context) {
        s.M(context, "TopMenu on close icon clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I(a aVar, int i15, r rVar, int i16) {
        r(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final void r(final a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(76429234);
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVarH.G(aVar) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(76429234, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.heading.DeveloperHeadingScreen (DeveloperHeadingScreen.kt:31)");
            }
            final Context context = (Context) rVarH.N(AndroidCompositionLocals_androidKt.c());
            m.Companion companion = m.INSTANCE;
            i iVar = i.f39152a;
            i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, companion);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            a<androidx.compose.ui.node.c> aVarB = companion3.b();
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            g gVar = g.f153260a;
            Label labelB = b.b("HeadingScreen", "");
            boolean z15 = (i16 & 14) == 4;
            Object objE = rVarH.E();
            if (z15 || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: ap1.j
                    @Override // er.a
                    public final Object a() {
                        return Function0.s(aVar);
                    }
                };
                rVarH.v(objE);
            }
            int i17 = g.f153262c;
            gVar.o(labelB, (a) objE, rVarH, i17 << 6);
            c.b bVarK = companion2.k();
            m mVarF = d.f(companion, 0.0f, 1, null);
            k70.a aVar2 = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            m mVarS = t70.i.S(w0.i.d(mVarF, aVar2.a(rVarH, i18).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().c(), null, 2, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
            a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            h.g(a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), null, b.b("Heading - without icon", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            Label labelB2 = b.b("Lorem ipsum", "");
            boolean zG = rVarH.G(context);
            Object objE2 = rVarH.E();
            if (zG || objE2 == r.INSTANCE.a()) {
                objE2 = new a() { // from class: ap1.p
                    @Override // er.a
                    public final Object a() {
                        return Function0.t(context);
                    }
                };
                rVarH.v(objE2);
            }
            gVar.o(labelB2, (a) objE2, rVarH, i17 << 6);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing500()), rVarH, 0);
            h.g(a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), null, b.b("Heading - with icon", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            Label labelB3 = b.b("Lorem ipsum", "");
            q70.a aVar3 = q70.a.f165179d;
            boolean zG2 = rVarH.G(context);
            Object objE3 = rVarH.E();
            if (zG2 || objE3 == r.INSTANCE.a()) {
                objE3 = new a() { // from class: ap1.q
                    @Override // er.a
                    public final Object a() {
                        return Function0.u(context);
                    }
                };
                rVarH.v(objE3);
            }
            gVar.q(labelB3, aVar3, (a) objE3, rVarH, (i17 << 9) | 48);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing500()), rVarH, 0);
            h.g(a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), null, b.b("Heading - with icon and arrow", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            Label labelB4 = b.b("Lorem ipsum", "");
            boolean zG3 = rVarH.G(context);
            Object objE4 = rVarH.E();
            if (zG3 || objE4 == r.INSTANCE.a()) {
                objE4 = new a() { // from class: ap1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.A(context);
                    }
                };
                rVarH.v(objE4);
            }
            a<i0> aVar4 = (a) objE4;
            boolean zG4 = rVarH.G(context);
            Object objE5 = rVarH.E();
            if (zG4 || objE5 == r.INSTANCE.a()) {
                objE5 = new a() { // from class: ap1.c
                    @Override // er.a
                    public final Object a() {
                        return Function0.B(context);
                    }
                };
                rVarH.v(objE5);
            }
            gVar.k(labelB4, aVar4, aVar3, (a) objE5, rVarH, (i17 << 12) | MLKEMEngine.KyberPolyBytes);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing500()), rVarH, 0);
            h.g(a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), null, b.b("Heading - with close icon and arrow", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            Label labelB5 = b.b("Lorem ipsum", "");
            boolean zG5 = rVarH.G(context);
            Object objE6 = rVarH.E();
            if (zG5 || objE6 == r.INSTANCE.a()) {
                objE6 = new a() { // from class: ap1.d
                    @Override // er.a
                    public final Object a() {
                        return Function0.C(context);
                    }
                };
                rVarH.v(objE6);
            }
            a<i0> aVar5 = (a) objE6;
            q70.a aVar6 = q70.a.f165178c;
            boolean zG6 = rVarH.G(context);
            Object objE7 = rVarH.E();
            if (zG6 || objE7 == r.INSTANCE.a()) {
                objE7 = new a() { // from class: ap1.e
                    @Override // er.a
                    public final Object a() {
                        return Function0.D(context);
                    }
                };
                rVarH.v(objE7);
            }
            gVar.i(labelB5, aVar5, aVar6, (a) objE7, rVarH, (i17 << 12) | MLKEMEngine.KyberPolyBytes);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing500()), rVarH, 0);
            h.g(a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), null, b.b("Heading - with icon and spannable title", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            Label labelB6 = b.b("eAkcja", "");
            boolean zG7 = rVarH.G(context);
            Object objE8 = rVarH.E();
            if (zG7 || objE8 == r.INSTANCE.a()) {
                objE8 = new a() { // from class: ap1.f
                    @Override // er.a
                    public final Object a() {
                        return Function0.E(context);
                    }
                };
                rVarH.v(objE8);
            }
            a<i0> aVar7 = (a) objE8;
            boolean zG8 = rVarH.G(context);
            Object objE9 = rVarH.E();
            if (zG8 || objE9 == r.INSTANCE.a()) {
                objE9 = new a() { // from class: ap1.g
                    @Override // er.a
                    public final Object a() {
                        return Function0.F(context);
                    }
                };
                rVarH.v(objE9);
            }
            Color.Companion companion4 = Color.INSTANCE;
            q70.b bVar = new q70.b(companion4.f(), new lr.i(0, 0), null);
            int i19 = q70.b.f165188c;
            gVar.g(labelB6, aVar7, aVar6, (a) objE9, bVar, rVarH, (i19 << 12) | MLKEMEngine.KyberPolyBytes | (i17 << 15));
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            Label labelB7 = b.b("ExampleColorTitle", "");
            boolean zG9 = rVarH.G(context);
            Object objE10 = rVarH.E();
            if (zG9 || objE10 == r.INSTANCE.a()) {
                objE10 = new a() { // from class: ap1.h
                    @Override // er.a
                    public final Object a() {
                        return Function0.G(context);
                    }
                };
                rVarH.v(objE10);
            }
            a<i0> aVar8 = (a) objE10;
            boolean zG10 = rVarH.G(context);
            Object objE11 = rVarH.E();
            if (zG10 || objE11 == r.INSTANCE.a()) {
                objE11 = new a() { // from class: ap1.k
                    @Override // er.a
                    public final Object a() {
                        return Function0.H(context);
                    }
                };
                rVarH.v(objE11);
            }
            gVar.g(labelB7, aVar8, aVar6, (a) objE11, new q70.b(companion4.b(), new lr.i(7, 11), null), rVarH, (i19 << 12) | MLKEMEngine.KyberPolyBytes | (i17 << 15));
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing500()), rVarH, 0);
            h.g(a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 0.0f, 0.0f, 14, null), null, b.b("Heading - with logo and arrow", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing200()), rVarH, 0);
            int i25 = c20.b.f22727w;
            boolean zG11 = rVarH.G(context);
            Object objE12 = rVarH.E();
            if (zG11 || objE12 == r.INSTANCE.a()) {
                objE12 = new a() { // from class: ap1.l
                    @Override // er.a
                    public final Object a() {
                        return Function0.v(context);
                    }
                };
                rVarH.v(objE12);
            }
            gVar.m((a) objE12, i25, rVarH, i17 << 6);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing300()), rVarH, 0);
            m mVarR = a3.r(companion, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, aVar2.b(rVarH, i18).getSpacing200(), 0.0f, 10, null);
            w0 w0VarA3 = e0.a(iVar.k(), companion2.k(), rVarH, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT3 = rVarH.t();
            m mVarE3 = j.e(rVarH, mVarR);
            a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
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
            n6.i(rVarC3, w0VarA3, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            h.g(null, null, b.b("Heading - with button", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing250()), rVarH, 0);
            h.g(null, null, b.b("Example of usage:", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            h.g(null, null, b.b(com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.d.P0, ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            f60.c.c(b.b("Lorem ipsum", ""), y2.m.d(-2002829558, true, new p() { // from class: ap1.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.w(context, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 0);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            h.g(null, null, b.b("Długi tekst", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i18).a(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            f60.c.c(b.b("Lorem ipsum", ""), y2.m.d(1095368897, true, new p() { // from class: ap1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.y(context, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVarH, 48, 0);
            r3.a(d.i(companion, aVar2.b(rVarH, i18).getSpacing100()), rVarH, 0);
            rVarH.x();
            rVarH.x();
            rVarH.x();
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: ap1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.I(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(a aVar) {
        aVar.a();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(Context context) {
        s.M(context, "TopMenu on back arrow clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(Context context) {
        s.M(context, "TopMenu on menu icon clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v(Context context) {
        s.M(context, "TopMenu on back arrow clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(final Context context, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-2002829558, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.heading.DeveloperHeadingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeveloperHeadingScreen.kt:181)");
            }
            k30.a.b bVar = k30.a.b.f107765a;
            k30.d.a aVar = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(b.b("Wszystkie", ""), null, 2, null);
            boolean zG = rVar.G(context);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: ap1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.x(context);
                    }
                };
                rVar.v(objE);
            }
            q.p(new ButtonData(null, null, bVar, withText, aVar, null, (a) objE, 35, null), false, null, rVar, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 x(Context context) {
        s.M(context, "Heading normal button clicked.");
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y(final Context context, r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(1095368897, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.designer.heading.DeveloperHeadingScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DeveloperHeadingScreen.kt:204)");
            }
            k30.a.b bVar = k30.a.b.f107765a;
            k30.d.a aVar = k30.d.a.f107773a;
            k30.c.WithText withText = new k30.c.WithText(b.b("Lorem ipsum dolor sit", ""), null, 2, null);
            boolean zG = rVar.G(context);
            Object objE = rVar.E();
            if (zG || objE == r.INSTANCE.a()) {
                objE = new a() { // from class: ap1.i
                    @Override // er.a
                    public final Object a() {
                        return Function0.z(context);
                    }
                };
                rVar.v(objE);
            }
            q.p(new ButtonData(null, null, bVar, withText, aVar, null, (a) objE, 35, null), false, null, rVar, 0, 6);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z(Context context) {
        s.M(context, "Heading long text button clicked.");
        return i0.f148189a;
    }
}
