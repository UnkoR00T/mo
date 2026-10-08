package p056h1;

import er.l;
import er.p;
import oq.i0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p036e4.y1;
import p036e4.z1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.c4;
import p076m2.d0;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.r0;
import p076m2.s0;
import p076m2.t;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "key", "", "index", "Lh1/k1;", "pinnedItemList", "Lkotlin/Function0;", "Loq/i0;", "content", "c", "(Ljava/lang/Object;ILh1/k1;Ler/p;Lm2/r;I)V", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class j1 {

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"h1/j1$a", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g1 f79447a;

        public a(g1 g1Var) {
            this.f79447a = g1Var;
        }

        @Override // p076m2.r0
        public void j() {
            this.f79447a.e();
        }
    }

    public static final void c(final Object obj, final int i15, final k1 k1Var, final p<? super r, ? super Integer, i0> pVar, r rVar, final int i16) {
        int i17;
        r rVarH = rVar.h(872548579);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.G(obj) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if ((i16 & 48) == 0) {
            i17 |= rVarH.c(i15) ? 32 : 16;
        }
        if ((i16 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(k1Var) ? 256 : 128;
        }
        if ((i16 & 3072) == 0) {
            i17 |= rVarH.G(pVar) ? 2048 : 1024;
        }
        if (rVarH.r((i17 & 1171) != 1170, i17 & 1)) {
            if (t.k()) {
                t.o(872548579, i17, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:50)");
            }
            boolean zW = rVarH.W(obj) | rVarH.W(k1Var);
            Object objE = rVarH.E();
            if (zW || objE == r.INSTANCE.a()) {
                objE = new g1(obj, k1Var);
                rVarH.v(objE);
            }
            final g1 g1Var = (g1) objE;
            g1Var.f(i15);
            g1Var.g((y1) rVarH.N(z1.a()));
            boolean zW2 = rVarH.W(g1Var);
            Object objE2 = rVarH.E();
            if (zW2 || objE2 == r.INSTANCE.a()) {
                objE2 = new l() { // from class: h1.h1
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return j1.d(g1Var, (s0) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            Function0.a(g1Var, (l) objE2, rVarH, 0);
            d0.c(z1.a().d(g1Var), pVar, rVarH, ((i17 >> 6) & 112) | c4.f122821i);
            if (t.k()) {
                t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: h1.i1
                @Override // er.p
                public final Object B(Object obj2, Object obj3) {
                    return j1.e(obj, i15, k1Var, pVar, i16, (r) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 d(g1 g1Var, s0 s0Var) {
        return new a(g1Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 e(Object obj, int i15, k1 k1Var, p pVar, int i16, r rVar, int i17) {
        c(obj, i15, k1Var, pVar, rVar, g4.a(i16 | 1));
        return i0.f148189a;
    }
}
