package p30;

import androidx.compose.ui.graphics.Color;
import d1.a3;
import d1.m3;
import d1.o2;
import d1.q3;
import d1.r3;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.e0;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import u0.q0;
import u0.s0;
import u0.x0;
import u0.z0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0001\u0010\u0002¨\u0006\u0007²\u0006\f\u0010\u0004\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0005\u001a\u00020\u00038\nX\u008a\u0084\u0002²\u0006\f\u0010\u0006\u001a\u00020\u00038\nX\u008a\u0084\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V", "", "firstDotAnimationOffset", "secondDotAnimationOffset", "thirdDotAnimationOffset", "ds_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class w {
    public static final void c(p076m2.r rVar, final int i15) {
        p076m2.r rVarH = rVar.h(-1105802641);
        if (rVarH.r(i15 != 0, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1105802641, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.DotsTyping (DotsTyping.kt:27)");
            }
            s0 s0VarG = x0.g(null, rVarH, 0, 1);
            f6<Float> f6VarE = e(s0VarG, 10.0f, 0, rVarH, 6);
            f6<Float> f6VarE2 = e(s0VarG, 10.0f, 300, rVarH, 6);
            f6<Float> f6VarE3 = e(s0VarG, 10.0f, 600, rVarH, 6);
            f3.c.InterfaceC1317c interfaceC1317cI = f3.c.INSTANCE.i();
            d1.i.f fVarE = d1.i.f39152a.e();
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarR = a3.r(companion, 0.0f, c5.h.n(10.0f), 0.0f, 0.0f, 13, null);
            w0 w0VarB = m3.b(fVarE, interfaceC1317cI, rVarH, 54);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarR);
            androidx.compose.ui.node.c.Companion companion2 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion2.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarB, companion2.d());
            n6.i(rVarC, e0VarT, companion2.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion2.c());
            n6.g(rVarC, companion2.a());
            n6.i(rVarC, mVarE, companion2.e());
            q3 q3Var = q3.f39261a;
            float fG = g(f6VarE);
            k70.a aVar = k70.a.f108864a;
            int i16 = k70.a.f108865b;
            d(fG, Color.m9copywmQWz5c$default(aVar.a(rVarH, i16).getNeutral().b(), 0.25f, 0.0f, 0.0f, 0.0f, 14, null), rVarH, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i16).getSpacing50()), rVarH, 0);
            d(h(f6VarE2), Color.m9copywmQWz5c$default(aVar.a(rVarH, i16).getNeutral().b(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), rVarH, 0);
            r3.a(androidx.compose.foundation.layout.d.y(companion, aVar.b(rVarH, i16).getSpacing50()), rVarH, 0);
            d(i(f6VarE3), aVar.a(rVarH, i16).getNeutral().b(), rVarH, 0);
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: p30.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.j(i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void d(float f15, long j15, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-231569801, i15, -1, "pl.gov.coi.common.ui.ds.chatbubble.DotsTyping.Dot (DotsTyping.kt:34)");
        }
        r3.a(w0.i.c(o2.f(androidx.compose.foundation.layout.d.t(f3.m.INSTANCE, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing100()), 0.0f, c5.h.n(-c5.h.n(f15)), 1, null), j15, l1.h.i()), rVar, 0);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
    }

    private static final f6<Float> e(s0 s0Var, final float f15, final int i15, p076m2.r rVar, int i16) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1464929000, i16, -1, "pl.gov.coi.common.ui.ds.chatbubble.DotsTyping.animateOffsetWithDelay (DotsTyping.kt:47)");
        }
        boolean z15 = (((i16 & 14) ^ 6) > 4 && rVar.c(i15)) || (i16 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            objE = new er.l() { // from class: p30.v
                @Override // er.l
                public final Object b(Object obj) {
                    return w.f(i15, f15, (z0.b) obj);
                }
            };
            rVar.v(objE);
        }
        f6<Float> f6VarC = x0.c(s0Var, 0.0f, 0.0f, u0.m.e(u0.m.f((er.l) objE), null, 0L, 6, null), null, rVar, s0.f193856f | 432 | (q0.f193832d << 9), 8);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return f6VarC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 f(int i15, float f15, z0.b bVar) {
        bVar.d(1200);
        Float fValueOf = Float.valueOf(0.0f);
        bVar.g(bVar.f(fValueOf, i15), u0.i0.e());
        bVar.g(bVar.f(Float.valueOf(f15), i15 + 300), u0.i0.e());
        bVar.f(fValueOf, i15 + 600);
        return i0.f148189a;
    }

    private static final float g(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    private static final float h(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    private static final float i(f6<Float> f6Var) {
        return f6Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(int i15, p076m2.r rVar, int i16) {
        c(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }
}
