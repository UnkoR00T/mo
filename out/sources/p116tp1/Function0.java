package p116tp1;

import androidx.compose.foundation.layout.d;
import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.e0;
import d1.r3;
import er.l;
import er.p;
import f3.c;
import f3.j;
import f3.m;
import i30.ButtonIconData;
import j70.h;
import java.util.List;
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
import p30.ClickableContent;
import p30.FooterData;
import p30.SourcesData;
import p30.s;
import p30.x;
import p70.n;
import pq.v;
import w0.i;

/* JADX INFO: renamed from: tp1.l, reason: from Kotlin metadata */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u001d\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlin/Function0;", "Loq/i0;", "close", "l", "(Ler/a;Lm2/r;I)V", "developer_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class Function0 {

    /* JADX INFO: renamed from: tp1.l$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f191387a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(2117253967);
            if (t.k()) {
                t.o(2117253967, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.chatbubble.DeveloperChatBubbleScreen.<anonymous>.<anonymous> (DeveloperChatBubbleScreen.kt:36)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public static final void l(final er.a<i0> aVar, r rVar, final int i15) {
        int i16;
        r rVarH = rVar.h(1876630824);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (t.k()) {
                t.o(1876630824, i16, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.chatbubble.DeveloperChatBubbleScreen (DeveloperChatBubbleScreen.kt:28)");
            }
            m.Companion companion = m.INSTANCE;
            k70.a aVar2 = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            m mVarD = i.d(companion, aVar2.a(rVarH, i17).getBase().a(), null, 2, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            c.Companion companion2 = c.INSTANCE;
            w0 w0VarA = e0.a(nVarK, companion2.k(), rVarH, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            m mVarE = j.e(rVarH, mVarD);
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
            n.g(null, null, b.b("DS44 ChatBubble (1.0)", ""), null, null, 0L, null, new ButtonIconData(null, jz.a.U, a.f191387a, null, c70.a.f23835a.a().R(), aVar, 9, null), rVarH, ButtonIconData.f88935g << 21, 123);
            c.b bVarK = companion2.k();
            m mVarS = t70.i.S(a3.r(d.f(companion, 0.0f, 1, null), aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, 10, null), null, rVarH, 0, 1);
            w0 w0VarA2 = e0.a(iVar.k(), bVarK, rVarH, 48);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT2 = rVarH.t();
            m mVarE2 = j.e(rVarH, mVarS);
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
            h.g(null, null, b.b("ChatBubble", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).q(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            h.g(a3.r(companion, 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 0.0f, aVar2.b(rVarH, i17).getSpacing200(), 5, null), null, b.b("ChatBubble - messages from bot or user", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).b(), null, null, false, false, null, rVarH, 0, 0, 0, 33030138);
            h.g(null, null, b.b("ChatBubble - from bot, loading", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            s.t(null, new p30.a.Loading(b.b("Wirtualny asystent", "")), rVarH, p30.a.Loading.f152612b << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing500()), rVarH, 0);
            h.g(null, null, b.b("ChatBubble - from bot, simple", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            p30.a.IncomingMessage incomingMessage = new p30.a.IncomingMessage(b.b("Wirtualny asystent", ""), new p30.a.IncomingMessage.InterfaceC3749a.Static(b.b("Treść odpowiedzi bota - jakaś dłuższa, żeby było widać jak wygląda wielolinijkowo. Dalsza część odpowiedzi, jeszcze trochę znaków.", "")), null, null, null, null, null, 124, null);
            int i18 = p30.a.IncomingMessage.f152602h;
            s.t(null, incomingMessage, rVarH, i18 << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing500()), rVarH, 0);
            h.g(null, null, b.b("ChatBubble - from user", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            s.t(null, new p30.a.OutgoingMessage(b.b("Treść pytania użytkownika", "")), rVarH, p30.a.OutgoingMessage.f152614b << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing500()), rVarH, 0);
            h.g(null, null, b.b("ChatBubble - from bot with options", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar2.f(rVarH, i17).j(), null, null, false, false, null, rVarH, 0, 0, 0, 33030139);
            rVarH = rVarH;
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing100()), rVarH, 0);
            Label labelB = b.b("Wirtualny asystent", "");
            p30.a.IncomingMessage.InterfaceC3749a.Static r15 = new p30.a.IncomingMessage.InterfaceC3749a.Static(b.b("To jest jakiś tekst, a tutaj jest link. To wszystko jest z naszego źródła (1). Dalszy tekst.", ""));
            Label labelB2 = b.b("Odpowiedź 2 z 10", "");
            Label labelB3 = b.b("Źródło", "");
            Label labelB4 = b.b("+ X więcej", "");
            Label labelB5 = b.b("Pokaż mniej", "");
            Object objE = rVarH.E();
            r.Companion companion4 = r.INSTANCE;
            if (objE == companion4.a()) {
                objE = new er.a() { // from class: tp1.a
                    @Override // er.a
                    public final Object a() {
                        return Function0.m();
                    }
                };
                rVarH.v(objE);
            }
            ClickableContent clickableContent = new ClickableContent("1. Gov.pl", (er.a) objE);
            Object objE2 = rVarH.E();
            if (objE2 == companion4.a()) {
                objE2 = new er.a() { // from class: tp1.d
                    @Override // er.a
                    public final Object a() {
                        return Function0.n();
                    }
                };
                rVarH.v(objE2);
            }
            ClickableContent clickableContent2 = new ClickableContent("2. Gov.pl", (er.a) objE2);
            Object objE3 = rVarH.E();
            if (objE3 == companion4.a()) {
                objE3 = new er.a() { // from class: tp1.e
                    @Override // er.a
                    public final Object a() {
                        return Function0.o();
                    }
                };
                rVarH.v(objE3);
            }
            SourcesData sourcesData = new SourcesData(labelB3, labelB4, labelB5, v.q(clickableContent, clickableContent2, new ClickableContent("3. Gov.pl", (er.a) objE3)));
            Object objE4 = rVarH.E();
            if (objE4 == companion4.a()) {
                objE4 = new l() { // from class: tp1.f
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.p(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE4);
            }
            x.b.PositiveRate positiveRate = new x.b.PositiveRate(true, (l) objE4);
            Object objE5 = rVarH.E();
            if (objE5 == companion4.a()) {
                objE5 = new l() { // from class: tp1.g
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Function0.q(((Boolean) obj).booleanValue());
                    }
                };
                rVarH.v(objE5);
            }
            x.b.NegativeRate negativeRate = new x.b.NegativeRate(false, (l) objE5);
            Object objE6 = rVarH.E();
            if (objE6 == companion4.a()) {
                objE6 = new er.a() { // from class: tp1.h
                    @Override // er.a
                    public final Object a() {
                        return Function0.r();
                    }
                };
                rVarH.v(objE6);
            }
            FooterData footerData = new FooterData(sourcesData, v.q(positiveRate, negativeRate, new x.Share((er.a) objE6)));
            Object objE7 = rVarH.E();
            if (objE7 == companion4.a()) {
                objE7 = new er.a() { // from class: tp1.i
                    @Override // er.a
                    public final Object a() {
                        return Function0.s();
                    }
                };
                rVarH.v(objE7);
            }
            ClickableContent clickableContent3 = new ClickableContent("Zgłoś naruszenie", (er.a) objE7);
            Object objE8 = rVarH.E();
            if (objE8 == companion4.a()) {
                objE8 = new er.a() { // from class: tp1.j
                    @Override // er.a
                    public final Object a() {
                        return Function0.t();
                    }
                };
                rVarH.v(objE8);
            }
            List listQ = v.q(clickableContent3, new ClickableContent("Akcja", (er.a) objE8));
            Object objE9 = rVarH.E();
            if (objE9 == companion4.a()) {
                objE9 = new er.a() { // from class: tp1.k
                    @Override // er.a
                    public final Object a() {
                        return Function0.u();
                    }
                };
                rVarH.v(objE9);
            }
            ClickableContent clickableContent4 = new ClickableContent("Jak założyć profil zaufany?", (er.a) objE9);
            Object objE10 = rVarH.E();
            if (objE10 == companion4.a()) {
                objE10 = new er.a() { // from class: tp1.b
                    @Override // er.a
                    public final Object a() {
                        return Function0.v();
                    }
                };
                rVarH.v(objE10);
            }
            s.t(null, new p30.a.IncomingMessage(labelB, r15, labelB2, footerData, listQ, v.q(clickableContent4, new ClickableContent("Jak złożyć wniosek o dodatek elektryczny?", (er.a) objE10)), null, 64, null), rVarH, i18 << 3, 1);
            r3.a(d.i(companion, aVar2.b(rVarH, i17).getSpacing500()), rVarH, 0);
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
            d5VarM.a(new p() { // from class: tp1.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return Function0.w(aVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o() {
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
    public static final i0 r() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w(er.a aVar, int i15, r rVar, int i16) {
        l(aVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
