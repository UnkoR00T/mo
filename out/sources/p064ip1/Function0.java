package p064ip1;

import androidx.compose.ui.graphics.Color;
import b30.AccordionData;
import b30.AccordionElement;
import b30.Resource;
import b30.k;
import d1.a3;
import d1.e0;
import d1.r3;
import er.l;
import er.p;
import f3.m;
import h30.ButtonData;
import h30.q;
import i30.ButtonIconData;
import m70.TimelineData;
import m70.TimelineItemData;
import mx.Label;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import p70.n;
import pq.v;
import q4.TextStyle;
import w0.o;
import w0.x;

/* JADX INFO: renamed from: ip1.k, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\"\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "k", "(Ler/a;Lm2/r;I)V", "Lc5/h;", "a", "F", "v", "()F", "CARD_MINIMUM_HEIGHT", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f96142a = c5.h.n(80);

    /* JADX INFO: renamed from: ip1.k$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f96143a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(1126032053);
            if (t.k()) {
                t.o(1126032053, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous> (DeveloperAccordionScreen.kt:49)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    /* JADX INFO: renamed from: ip1.k$b */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$b", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements k {
        b() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 c() {
            return i0.f148189a;
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(1987282862);
            if (t.k()) {
                t.o(1987282862, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:220)");
            }
            k30.d.Secondary secondary = new k30.d.Secondary(null, 1, null);
            k30.a.Large large = new k30.a.Large(false, 1, null);
            k30.b.c cVar = k30.b.c.f107768a;
            k30.c.WithText withText = new k30.c.WithText(mx.b.b("Przykład elementu aktywnego", ""), null, 2, null);
            Object objE = rVar.E();
            if (objE == r.INSTANCE.a()) {
                objE = new er.a() { // from class: ip1.l
                    @Override // er.a
                    public final Object a() {
                        return Function0.b.c();
                    }
                };
                rVar.v(objE);
            }
            q.p(new ButtonData(null, null, large, withText, secondary, cVar, (er.a) objE, 3, null), false, null, rVar, 0, 6);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$c */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$c", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class c implements k {
        c() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(980771440);
            if (t.k()) {
                t.o(980771440, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:254)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            d1.r.b(androidx.compose.foundation.layout.d.i(o.g(mVarH, x.a(aVar.b(rVar, i16).getStrokeWidth(), aVar.a(rVar, i16).getSupport().j()), l1.h.f(aVar.b(rVar, i16).getSpacing150())), Function0.v()), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$d */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$d", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class d implements k {
        d() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(1172048243);
            if (t.k()) {
                t.o(1172048243, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:276)");
            }
            j70.h.g(null, null, mx.b.b("Provide content here", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$e */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$e", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements k {
        e() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(2143180770);
            if (t.k()) {
                t.o(2143180770, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:300)");
            }
            m70.f.g(new TimelineData(v.q(new TimelineItemData(mx.b.b("02.08.2023 12:00", ""), mx.b.b("Primary Bold", ""), mx.b.b("Urząd Stanu Cywilnego w Bolesławcu", "")), new TimelineItemData(mx.b.b("01.08.2023 12:00", ""), mx.b.b("Primary Bold", ""), null, 4, null))), rVar, TimelineData.f124016b);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$f */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$f", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class f implements k {
        f() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(-1685419414);
            if (t.k()) {
                t.o(-1685419414, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:87)");
            }
            j70.h.g(null, null, mx.b.b("Provide content here", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$g */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$g", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class g implements k {
        g() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(-2120415874);
            if (t.k()) {
                t.o(-2120415874, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:116)");
            }
            j70.h.g(null, null, mx.b.b("Provide content here", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$h */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$h", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class h implements k {
        h() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(-1290249859);
            if (t.k()) {
                t.o(-1290249859, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:140)");
            }
            m mVarH = androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            d1.r.b(androidx.compose.foundation.layout.d.i(o.g(mVarH, x.a(aVar.b(rVar, i16).getStrokeWidth(), aVar.a(rVar, i16).getSupport().j()), l1.h.f(aVar.b(rVar, i16).getSpacing150())), Function0.v()), rVar, 0);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$i */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$i", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class i implements k {
        i() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(-460083844);
            if (t.k()) {
                t.o(-460083844, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:175)");
            }
            Label labelB = mx.b.b("ContentBox - tutaj może być wstawiony dowolny Composable - w tym przykładzie jest CustomText", "");
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            TextStyle textStyleB = aVar.f(rVar, i16).b();
            j70.h.g(androidx.compose.foundation.layout.d.h(m.INSTANCE, 0.0f, 1, null), null, labelB, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, textStyleB, null, null, false, false, null, rVar, 6, 0, 0, 33030106);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    /* JADX INFO: renamed from: ip1.k$j */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"ip1/k$j", "Lb30/k;", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class j implements k {
        j() {
        }

        @Override // b30.k
        public void a(r rVar, int i15) {
            rVar.X(1796006059);
            if (t.k()) {
                t.o(1796006059, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen.<anonymous>.<anonymous>.<no name provided>.Content (DeveloperAccordionScreen.kt:207)");
            }
            j70.h.g(null, null, mx.b.b("Provide content", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar, 0, 0, 0, 33554427);
            if (t.k()) {
                t.n();
            }
            rVar.R();
        }
    }

    public static final void k(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(-1435011204);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(-1435011204, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.accordion.DeveloperAccordionScreen (DeveloperAccordionScreen.kt:43)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = w0.i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = f3.j.e(rVarH, mVarD);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            n.g(null, null, mx.b.b("DS29 Accordion (1.1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f96143a, null, null, aVar, 25, null), rVarH, ButtonIconData.f88935g << 21, 123);
            f3.c.b bVarK = companion2.k();
            m mVarS = t70.i.S(androidx.compose.foundation.layout.d.f(a3.p(companion, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 2, null), 0.0f, 1, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = f3.j.e(rVarH, mVarS);
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
            n6.i(rVarC2, w0VarA2, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            j70.h.g(null, null, mx.b.b("Akordeon", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            j70.h.g(a3.p(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 1, null), null, mx.b.b("Interaktywny komponent, który pozwala na prezentację treści w formie rozkładanego menu. Składa się z nagłówków sekcji, które mogą być rozwijane lub zwijane, aby wyświetlić lub ukryć zawartość.", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            j70.h.g(null, null, mx.b.b("Single line - zwinięty", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB = mx.b.b("Przykład tekstu", "");
            f fVar = new f();
            Object objE = rVarH.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new l() { // from class: ip1.a
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.l(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE);
            }
            AccordionData accordionData = new AccordionData(v.e(new AccordionElement(null, labelB, null, false, (l) objE, false, fVar, 37, null)));
            int i18 = AccordionData.f16343b;
            b30.j.g(accordionData, rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Single line - przykład (leadingResource)", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).p(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Resource resource = new Resource(new Resource.a.DrawableResource(jz.a.f106779g3, null, 2, null), null, 2, null);
            Label labelB2 = mx.b.b("Przykład tekstu", "");
            g gVar = new g();
            Object objE2 = rVarH.E();
            if (objE2 == companion4.a()) {
                objE2 = new l() { // from class: ip1.b
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.m(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE2);
            }
            b30.j.g(new AccordionData(v.e(new AccordionElement(resource, labelB2, null, false, (l) objE2, false, gVar, 36, null))), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Single line - rozwinięty", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB3 = mx.b.b("Przykład tekstu", "");
            h hVar = new h();
            Object objE3 = rVarH.E();
            if (objE3 == companion4.a()) {
                objE3 = new l() { // from class: ip1.c
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.n(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE3);
            }
            b30.j.g(new AccordionData(v.e(new AccordionElement(null, labelB3, null, true, (l) objE3, false, hVar, 37, null))), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Single line - przykład (CustomText)", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB4 = mx.b.b("Przykład tekstu", "");
            i iVar2 = new i();
            Object objE4 = rVarH.E();
            if (objE4 == companion4.a()) {
                objE4 = new l() { // from class: ip1.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.o(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE4);
            }
            b30.j.g(new AccordionData(v.e(new AccordionElement(null, labelB4, null, true, (l) objE4, false, iVar2, 37, null))), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Multi line - zwinięty", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB5 = mx.b.b("Przykład tekstu ", "");
            j jVar = new j();
            Object objE5 = rVarH.E();
            if (objE5 == companion4.a()) {
                objE5 = new l() { // from class: ip1.e
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE5);
            }
            AccordionElement accordionElement = new AccordionElement(null, labelB5, null, false, (l) objE5, false, jVar, 37, null);
            Label labelB6 = mx.b.b("Przykład elementu aktywnego", "");
            b bVar = new b();
            Object objE6 = rVarH.E();
            if (objE6 == companion4.a()) {
                objE6 = new l() { // from class: ip1.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.q(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE6);
            }
            b30.j.g(new AccordionData(v.q(accordionElement, new AccordionElement(null, labelB6, null, false, (l) objE6, false, bVar, 37, null))), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Multi line - rozwinięty", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB7 = mx.b.b("Przykład tekstu", "");
            c cVar = new c();
            Object objE7 = rVarH.E();
            if (objE7 == companion4.a()) {
                objE7 = new l() { // from class: ip1.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.r(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE7);
            }
            AccordionElement accordionElement2 = new AccordionElement(null, labelB7, null, true, (l) objE7, false, cVar, 37, null);
            Label labelB8 = mx.b.b("Przykład tekstu", "");
            d dVar = new d();
            Object objE8 = rVarH.E();
            if (objE8 == companion4.a()) {
                objE8 = new l() { // from class: ip1.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.s(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE8);
            }
            b30.j.g(new AccordionData(v.q(accordionElement2, new AccordionElement(null, labelB8, null, false, (l) objE8, false, dVar, 37, null))), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
            j70.h.g(null, null, mx.b.b("Multi line - przykład (Timeline)", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB9 = mx.b.b("Przykład tekstu", "");
            e eVar = new e();
            Object objE9 = rVarH.E();
            if (objE9 == companion4.a()) {
                objE9 = new l() { // from class: ip1.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.t(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE9);
            }
            b30.j.g(new AccordionData(v.e(new AccordionElement(null, labelB9, null, true, (l) objE9, false, eVar, 37, null))), rVarH, i18);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar2.b(rVarH, i17).getSpacing200()), rVarH, 0);
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
            d5VarM.a(new p() { // from class: ip1.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.u(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(boolean z15) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u(er.a aVar, int i15, r rVar, int i16) {
        k(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final float v() {
        return f96142a;
    }
}
