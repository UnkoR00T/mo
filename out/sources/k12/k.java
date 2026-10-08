package k12;

import d1.a3;
import d1.d3;
import d1.e0;
import d1.h0;
import er.p;
import er.q;
import h30.ButtonData;
import i50.BaseScaffoldData;
import i50.s;
import java.util.Iterator;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;
import p076m2.r;
import p076m2.t;
import q12.MessageInitializedViewState;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lq12/a;", "data", "Lkotlin/Function1;", "Ld1/h0;", "Loq/i0;", "content", "d", "(Lq12/a;Ler/q;Lm2/r;I)V", "electronicdelivery_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class k {
    public static final void d(final MessageInitializedViewState messageInitializedViewState, final q<? super h0, ? super r, ? super Integer, i0> qVar, r rVar, final int i15) {
        int i16;
        r rVar2;
        r rVarH = rVar.h(363923866);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(messageInitializedViewState) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(qVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (t.k()) {
                t.o(363923866, i16, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.InitializedMessageDetails (MessageDetailsScreen.kt:19)");
            }
            rVar2 = rVarH;
            s.r(messageInitializedViewState.getBaseScaffoldData(), y2.m.d(-1616625, true, new p() { // from class: k12.h
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.e(messageInitializedViewState, (r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1443835641, true, new q() { // from class: k12.i
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return k.f(qVar, (d3) obj, (r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g | 48, 196608, 32764);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: k12.j
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return k.g(messageInitializedViewState, qVar, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(MessageInitializedViewState messageInitializedViewState, r rVar, int i15) {
        r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (t.k()) {
                t.o(-1616625, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.InitializedMessageDetails.<anonymous> (MessageDetailsScreen.kt:23)");
            }
            if (messageInitializedViewState.b().isEmpty()) {
                rVar2 = rVar;
                rVar2.X(-917209261);
            } else {
                rVar.X(-916170327);
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                f3.m mVarN = a3.n(companion, aVar.b(rVar, i16).getSpacing200());
                w0 w0VarA = e0.a(d1.i.f39152a.r(aVar.b(rVar, i16).getSpacing150()), f3.c.INSTANCE.k(), rVar, 0);
                int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
                p076m2.e0 e0VarT = rVar.t();
                f3.m mVarE = f3.j.e(rVar, mVarN);
                androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
                er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
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
                rVar.X(-2052398583);
                Iterator<T> it = messageInitializedViewState.b().iterator();
                while (it.hasNext()) {
                    h30.q.p((ButtonData) it.next(), false, null, rVar, 0, 6);
                }
                rVar2 = rVar;
                rVar2.R();
                rVar2.x();
            }
            rVar2.R();
            if (t.k()) {
                t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(q qVar, d3 d3Var, r rVar, int i15) {
        if ((i15 & 6) == 0) {
            i15 |= rVar.W(d3Var) ? 4 : 2;
        }
        if (rVar.r((i15 & 19) != 18, i15 & 1)) {
            if (t.k()) {
                t.o(-1443835641, i15, -1, "pl.gov.coi.mobywatel.feature.electronicdelivery.presentation.screens.messagedetails.common.custom.InitializedMessageDetails.<anonymous> (MessageDetailsScreen.kt:36)");
            }
            f3.m mVarN = t70.s.n(t70.i.S(a3.l(f3.m.INSTANCE, d3Var), null, rVar, 0, 1), rVar, 0);
            w0 w0VarA = e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarN);
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
            qVar.w(d1.i0.f39176a, rVar, 6);
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
    public static final i0 g(MessageInitializedViewState messageInitializedViewState, q qVar, int i15, r rVar, int i16) {
        d(messageInitializedViewState, qVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
