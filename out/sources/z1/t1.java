package z1;

import java.util.ArrayList;
import java.util.List;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.n6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0001¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lf3/m;", "modifier", "Lkotlin/Function0;", "Loq/i0;", "content", "b", "(Lf3/m;Ler/p;Lm2/r;II)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class t1 {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements p036e4.w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f232201a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 b(List list, e4.a2.a aVar) {
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                e4.a2.a.E(aVar, (p036e4.a2) list.get(i15), 0, 0, 0.0f, 4, null);
            }
            return oq.i0.f148189a;
        }

        @Override // p036e4.w0
        public final p036e4.x0 e(p036e4.y0 y0Var, List<? extends p036e4.v0> list, long j15) {
            final ArrayList arrayList = new ArrayList(list.size());
            int size = list.size();
            int iMax = 0;
            int iMax2 = 0;
            for (int i15 = 0; i15 < size; i15++) {
                p036e4.a2 a2VarO0 = list.get(i15).o0(j15);
                iMax = Math.max(iMax, a2VarO0.getWidth());
                iMax2 = Math.max(iMax2, a2VarO0.getHeight());
                arrayList.add(a2VarO0);
            }
            return p036e4.y0.j2(y0Var, iMax, iMax2, null, new er.l() { // from class: z1.s1
                @Override // er.l
                public final Object b(Object obj) {
                    return t1.a.b(arrayList, (e4.a2.a) obj);
                }
            }, 4, null);
        }
    }

    public static final void b(final f3.m mVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1854833411);
        int i18 = i16 & 1;
        if (i18 != 0) {
            i17 = i15 | 6;
        } else if ((i15 & 6) == 0) {
            i17 = (rVarH.W(mVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(pVar) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                mVar = f3.m.INSTANCE;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(-1854833411, i17, -1, "androidx.compose.foundation.text.selection.SimpleLayout (SimpleLayout.kt:30)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = a.f232201a;
                rVarH.v(objE);
            }
            p036e4.w0 w0Var = (p036e4.w0) objE;
            int i19 = ((i17 >> 3) & 14) | MLKEMEngine.KyberPolyBytes | ((i17 << 3) & 112);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVar);
            androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion.b();
            int i25 = ((i19 << 6) & 896) | 6;
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
            n6.i(rVarC, w0Var, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            pVar.B(rVarH, Integer.valueOf((i25 >> 6) & 14));
            rVarH.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z1.r1
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return t1.c(mVar, pVar, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 c(f3.m mVar, er.p pVar, int i15, int i16, p076m2.r rVar, int i17) {
        b(mVar, pVar, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }
}
