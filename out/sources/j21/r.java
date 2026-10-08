package j21;

import d1.a3;
import d1.d3;
import d1.m3;
import d1.p3;
import d1.q3;
import d1.r3;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p046f2.al;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import t50.TextAreaData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a-\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\u001b\u0010\u0010\u001a\u00020\u0002*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a)\u0010\u0017\u001a\u00020\u0002*\u00020\r2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019²\u0006\f\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lj21/h;", "viewModel", "Loq/i0;", "r", "(Lj21/h;Lm2/r;I)V", "Lj21/h$a;", "data", "Li70/p;", "snackBarState", "Lkotlin/Function0;", "hideSnackBar", "j", "(Lj21/h$a;Li70/p;Ler/a;Lm2/r;I)V", "Lf1/q0;", "Lmx/a;", "startConversationDateTime", "v", "(Lf1/q0;Lmx/a;)V", "", "Lp30/a;", "messages", "Ll3/d0;", "focusRequester", "x", "(Lf1/q0;Ljava/util/List;Ll3/d0;)V", "chatbot_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class r {

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f98984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f1.y0 f98985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.Data f98986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ l3.d0 f98987h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f1.y0 y0Var, h.Data data, l3.d0 d0Var, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f98985f = y0Var;
            this.f98986g = data;
            this.f98987h = d0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            a aVar;
            Object objE = uq.b.e();
            int i15 = this.f98984e;
            if (i15 == 0) {
                oq.u.b(obj);
                f1.y0 y0Var = this.f98985f;
                this.f98984e = 1;
                aVar = this;
                if (f1.y0.r(y0Var, 0, 0, aVar, 2, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                aVar = this;
            }
            if (aVar.f98986g.f().size() > 1) {
                l3.d0.f(aVar.f98987h, 0, 1, null);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new a(this.f98985f, this.f98986g, this.f98987h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.a<oq.i0> {
        b(Object obj) {
            super(0, obj, h.class, "hideSnackBar", "hideSnackBar()V", 0);
        }

        public final void E() {
            ((h) this.f66391b).B0();
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            E();
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class c implements er.l<Integer, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f98988a;

        public c(List list) {
            this.f98988a = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ Object b(Integer num) {
            return c(num.intValue());
        }

        public final Object c(int i15) {
            this.f98988a.get(i15);
            return null;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class d implements er.r<f1.e, Integer, p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ List f98989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List f98990b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l3.d0 f98991c;

        public d(List list, List list2, l3.d0 d0Var) {
            this.f98989a = list;
            this.f98990b = list2;
            this.f98991c = d0Var;
        }

        public final void c(f1.e eVar, int i15, p076m2.r rVar, int i16) {
            int i17;
            if ((i16 & 6) == 0) {
                i17 = i16 | (rVar.W(eVar) ? 4 : 2);
            } else {
                i17 = i16;
            }
            if ((i16 & 48) == 0) {
                i17 |= rVar.c(i15) ? 32 : 16;
            }
            if (!rVar.r((i17 & 147) != 146, i17 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(2039820996, i17, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
            }
            p30.a aVarB = (p30.a) this.f98989a.get(i15);
            rVar.X(-851288706);
            r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing300()), rVar, 0);
            if (i15 == 0 && this.f98990b.size() > 1 && (aVarB instanceof p30.a.IncomingMessage)) {
                aVarB = p30.a.IncomingMessage.b((p30.a.IncomingMessage) aVarB, null, null, null, null, null, null, this.f98991c, 63, null);
            }
            p30.s.t(null, aVarB, rVar, 0, 1);
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }

        @Override // er.r
        public /* bridge */ /* synthetic */ oq.i0 g(f1.e eVar, Integer num, p076m2.r rVar, Integer num2) {
            c(eVar, num.intValue(), rVar, num2.intValue());
            return oq.i0.f148189a;
        }
    }

    public static final void j(final h.Data data, final i70.p pVar, final er.a<oq.i0> aVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-556518160);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(data) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(aVar) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-556518160, i16, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.conversation.ChatBotConversationContent (ChatBotConversationScreen.kt:68)");
            }
            final f1.y0 y0VarC = f1.b1.c(0, 0, rVarH, 0, 3);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = new al();
                rVarH.v(objE);
            }
            final al alVar = (al) objE;
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new l3.d0();
                rVarH.v(objE2);
            }
            final l3.d0 d0Var = (l3.d0) objE2;
            boolean zG = rVarH.G(data);
            Object objE3 = rVarH.E();
            if (zG || objE3 == companion.a()) {
                objE3 = new er.a() { // from class: j21.j
                    @Override // er.a
                    public final Object a() {
                        return r.k(data);
                    }
                };
                rVarH.v(objE3);
            }
            p088nul.q0.g(false, (er.a) objE3, rVarH, 0, 1);
            Object firstMessageLabel = data.getFirstMessageLabel();
            boolean zW = rVarH.W(y0VarC) | rVarH.G(data);
            Object objE4 = rVarH.E();
            if (zW || objE4 == companion.a()) {
                objE4 = new a(y0VarC, data, d0Var, null);
                rVarH.v(objE4);
            }
            Function0.d(firstMessageLabel, (er.p) objE4, rVarH, 0);
            i70.m.d(alVar, pVar, aVar, null, null, rVarH, (i16 & 112) | 6 | (i16 & 896), 24);
            i50.s.r(data.getBaseScaffoldData(), null, y2.m.d(686866874, true, new er.p() { // from class: j21.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.l(alVar, pVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), 0, 0L, null, y0VarC, true, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1504216349, true, new er.q() { // from class: j21.l
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return r.m(y0VarC, data, d0Var, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g | 12583296, 196608, 32570);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j21.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.q(data, pVar, aVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 k(h.Data data) {
        data.g().a();
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 l(al alVar, i70.p pVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(686866874, i15, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.conversation.ChatBotConversationContent.<anonymous> (ChatBotConversationScreen.kt:91)");
            }
            i70.d.d(alVar, pVar, false, rVar, 6, 4);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 m(f1.y0 y0Var, final h.Data data, final l3.d0 d0Var, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1504216349, i16, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.conversation.ChatBotConversationContent.<anonymous> (ChatBotConversationScreen.kt:95)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarD = w0.i.d(mVarL, aVar.a(rVar, i17).getBase().a(), null, 2, null);
            Object objE = rVar.E();
            p076m2.r.Companion companion2 = p076m2.r.INSTANCE;
            if (objE == companion2.a()) {
                objE = new er.l() { // from class: j21.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.n((n4.i0) obj);
                    }
                };
                rVar.v(objE);
            }
            f3.m mVarD2 = n4.v.d(mVarD, false, (er.l) objE, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion3 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion3.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarD2);
            androidx.compose.ui.node.c.Companion companion4 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarA, companion4.d());
            n6.i(rVarC, e0VarT, companion4.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion4.c());
            n6.g(rVarC, companion4.a());
            n6.i(rVarC, mVarE, companion4.e());
            f3.m mVarB = d1.h0.b(d1.i0.f39176a, companion, 1.0f, false, 2, null);
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarB);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA2, companion4.d());
            n6.i(rVarC2, e0VarT2, companion4.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion4.c());
            n6.g(rVarC2, companion4.a());
            n6.i(rVarC2, mVarE2, companion4.e());
            f3.m mVarD3 = w0.i.d(a3.p(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), aVar.b(rVar, i17).getSpacing200(), 0.0f, 2, null), aVar.a(rVar, i17).getBase().a(), null, 2, null);
            boolean zG = rVar.G(data);
            Object objE2 = rVar.E();
            if (zG || objE2 == companion2.a()) {
                objE2 = new er.l() { // from class: j21.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return r.o(data, d0Var, (f1.q0) obj);
                    }
                };
                rVar.v(objE2);
            }
            f1.d.c(mVarD3, y0Var, null, true, null, null, null, false, null, (er.l) objE2, rVar, 3072, 500);
            rVar.x();
            f3.m mVarN = a3.n(androidx.compose.foundation.layout.d.h(androidx.compose.foundation.layout.d.C(companion, null, false, 3, null), 0.0f, 1, null), aVar.b(rVar, i17).getSpacing200());
            p036e4.w0 w0VarA3 = d1.e0.a(iVar.k(), companion3.k(), rVar, 0);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarN);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarA3, companion4.d());
            n6.i(rVarC3, e0VarT3, companion4.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion4.c());
            n6.g(rVarC3, companion4.a());
            n6.i(rVarC3, mVarE3, companion4.e());
            p036e4.w0 w0VarB = m3.b(iVar.j(), companion3.i(), rVar, 48);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT4 = rVar.t();
            f3.m mVarE4 = f3.j.e(rVar, companion);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB4);
            } else {
                rVar.u();
            }
            p076m2.r rVarC4 = n6.c(rVar);
            n6.i(rVarC4, w0VarB, companion4.d());
            n6.i(rVarC4, e0VarT4, companion4.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion4.c());
            n6.g(rVarC4, companion4.a());
            n6.i(rVarC4, mVarE4, companion4.e());
            f3.m mVarC = p3.c(q3.f39261a, companion, 1.0f, false, 2, null);
            p036e4.w0 w0VarI = d1.r.i(companion3.o(), false);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT5 = rVar.t();
            f3.m mVarE5 = f3.j.e(rVar, mVarC);
            er.a<androidx.compose.ui.node.c> aVarB5 = companion4.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB5);
            } else {
                rVar.u();
            }
            p076m2.r rVarC5 = n6.c(rVar);
            n6.i(rVarC5, w0VarI, companion4.d());
            n6.i(rVarC5, e0VarT5, companion4.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion4.c());
            n6.g(rVarC5, companion4.a());
            n6.i(rVarC5, mVarE5, companion4.e());
            d1.x xVar = d1.x.f39368a;
            t50.r.m(data.getTextAreaData(), null, rVar, TextAreaData.f187694o, 2);
            rVar.x();
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVar, i17).getSpacing150()), rVar, 0);
            h30.q.p(data.getButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            if (data.getAdditionalInfo() == null) {
                rVar.X(1648293475);
                rVar.R();
            } else {
                rVar.X(1648293476);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing100()), rVar, 0);
                Object objE3 = rVar.E();
                if (objE3 == companion2.a()) {
                    objE3 = new er.l() { // from class: j21.p
                        @Override // er.l
                        public final Object b(Object obj) {
                            return r.p((n4.i0) obj);
                        }
                    };
                    rVar.v(objE3);
                }
                j70.h.g(n4.v.d(companion, false, (er.l) objE3, 1, null), null, data.getAdditionalInfo(), null, null, aVar.a(rVar, i17).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().a(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar, i17).f(), null, null, false, false, null, rVar, 0, 0, 0, 33030106);
                oq.i0 i0Var = oq.i0.f148189a;
                rVar.R();
            }
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 n(n4.i0 i0Var) {
        n4.f0.H0(i0Var, true);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 o(h.Data data, l3.d0 d0Var, f1.q0 q0Var) {
        x(q0Var, data.f(), d0Var);
        v(q0Var, data.getStartConversationDateTime());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 p(n4.i0 i0Var) {
        n4.f0.I0(i0Var, -1.0f);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q(h.Data data, i70.p pVar, er.a aVar, int i15, p076m2.r rVar, int i16) {
        j(data, pVar, aVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void r(final h hVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1884648915);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(hVar) : rVarH.G(hVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        boolean z15 = true;
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1884648915, i16, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.conversation.ChatBotConversationScreen (ChatBotConversationScreen.kt:49)");
            }
            f6 f6VarC = m7.b.c(hVar.getState(), null, null, null, rVarH, 0, 7);
            f6 f6VarB = m7.b.b(hVar.j(), i70.p.a.f89857a, null, null, null, rVarH, i70.p.a.f89858b << 3, 14);
            rVarH = rVarH;
            h.Data dataS = s(f6VarC);
            i70.p pVarT = t(f6VarB);
            if ((i16 & 14) != 4 && ((i16 & 8) == 0 || !rVarH.G(hVar))) {
                z15 = false;
            }
            Object objE = rVarH.E();
            if (z15 || objE == p076m2.r.INSTANCE.a()) {
                objE = new b(hVar);
                rVarH.v(objE);
            }
            j(dataS, pVarT, (er.a) ((mr.g) objE), rVarH, 0);
            cb4.i dialogVMSAdapter = s(f6VarC).getDialogVMSAdapter();
            if (dialogVMSAdapter == null) {
                rVarH.X(-1762915572);
            } else {
                rVarH.X(1328605077);
                dialogVMSAdapter.b(rVarH, 0);
            }
            rVarH.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: j21.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return r.u(hVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final h.Data s(f6<h.Data> f6Var) {
        return f6Var.getValue();
    }

    private static final i70.p t(f6<? extends i70.p> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 u(h hVar, int i15, p076m2.r rVar, int i16) {
        r(hVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void v(f1.q0 q0Var, final Label label) {
        f1.q0.c(q0Var, null, null, y2.m.b(-1369376089, true, new er.q() { // from class: j21.q
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return r.w(label, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(Label label, f1.e eVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1369376089, i15, -1, "pl.gov.coi.mobywatel.feature.chatbot.presentation.screen.conversation.header.<anonymous> (ChatBotConversationScreen.kt:148)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing300()), rVar, 0);
            j70.h.g(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), null, label, null, null, aVar.a(rVar, i16).getCom.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.f.p java.lang.String().b(), 0L, null, null, null, 0L, null, b5.j.h(b5.j.INSTANCE.a()), 0L, 0, false, 0, 0, null, aVar.f(rVar, i16).d(), null, null, false, false, null, rVar, 6, 0, 0, 33026010);
            r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i16).getSpacing400()), rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    private static final void x(f1.q0 q0Var, List<? extends p30.a> list, l3.d0 d0Var) {
        q0Var.j(list.size(), null, new c(list), y2.m.b(2039820996, true, new d(list, list, d0Var)));
    }
}
