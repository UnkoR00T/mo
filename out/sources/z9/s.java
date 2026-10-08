package z9;

import androidx.p016lifecycle.y0;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p071kotlin.Metadata;
import p076m2.c4;
import p076m2.d5;
import p076m2.g4;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a)\u0010\u0006\u001a\u00020\u0004*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0007¢\u0006\u0004\b\u0006\u0010\u0007\u001a!\u0010\b\u001a\u00020\u0004*\u00020\u00012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u0003¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Ly9/w;", "Lb3/i;", "saveableStateHolder", "Lkotlin/Function0;", "Loq/i0;", "content", "d", "(Ly9/w;Lb3/i;Ler/p;Lm2/r;I)V", "f", "(Lb3/i;Ler/p;Lm2/r;I)V", "navigation-compose_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class s {

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements er.p<p076m2.r, Integer, oq.i0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b3.i f233625a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.p<p076m2.r, Integer, oq.i0> f233626b;

        /* JADX WARN: Multi-variable type inference failed */
        a(b3.i iVar, er.p<? super p076m2.r, ? super Integer, oq.i0> pVar) {
            this.f233625a = iVar;
            this.f233626b = pVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ oq.i0 B(p076m2.r rVar, Integer num) {
            c(rVar, num.intValue());
            return oq.i0.f148189a;
        }

        public final void c(p076m2.r rVar, int i15) {
            if ((i15 & 3) == 2 && rVar.i()) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1808964477, i15, -1, "androidx.navigation.compose.LocalOwnersProvider.<anonymous> (NavBackStackEntryProvider.kt:55)");
            }
            s.f(this.f233625a, this.f233626b, rVar, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public static final void d(final p136y9.w wVar, final b3.i iVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(233973821);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(wVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(iVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.G(pVar) ? 256 : 128;
        }
        if ((i16 & 147) == 146 && rVarH.i()) {
            rVarH.O();
        } else {
            if (p076m2.t.k()) {
                p076m2.t.o(233973821, i16, -1, "androidx.navigation.compose.LocalOwnersProvider (NavBackStackEntryProvider.kt:49)");
            }
            p076m2.d0.d(new c4[]{q7.b.f165175a.d(wVar), m7.n.c().d(wVar), va.b.c().d(wVar)}, y2.m.d(1808964477, true, new a(iVar, pVar), rVarH, 54), rVarH, c4.f122821i | 48);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z9.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.e(wVar, iVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e(p136y9.w wVar, b3.i iVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        d(wVar, iVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(final b3.i iVar, final er.p<? super p076m2.r, ? super Integer, oq.i0> pVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(832919318);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(iVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(pVar) ? 32 : 16;
        }
        if ((i16 & 19) == 18 && rVarH.i()) {
            rVarH.O();
        } else {
            if (p076m2.t.k()) {
                p076m2.t.o(832919318, i16, -1, "androidx.navigation.compose.SaveableStateProvider (NavBackStackEntryProvider.kt:60)");
            }
            Object objE = rVarH.E();
            if (objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: z9.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return s.g((CreationExtras) obj);
                    }
                };
                rVarH.v(objE);
            }
            er.l lVar = (er.l) objE;
            y0 y0VarC = q7.b.f165175a.c(rVarH, 6);
            if (y0VarC == null) {
                throw new IllegalStateException("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
            }
            mr.c cVarC = fr.q0.c(z9.a.class);
            p7.c cVar = new p7.c();
            cVar.a(fr.q0.c(z9.a.class), lVar);
            z9.a aVar = (z9.a) q7.d.c(cVarC, y0VarC, null, cVar.b(), y0VarC instanceof androidx.p016lifecycle.h ? ((androidx.p016lifecycle.h) y0VarC).x() : CreationExtras.b.f153222c, rVarH, 0, 0);
            aVar.b9(new aa.c<>(iVar));
            iVar.d(aVar.getId(), pVar, rVarH, ((i16 << 6) & 896) | (i16 & 112));
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: z9.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return s.h(iVar, pVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final z9.a g(CreationExtras creationExtras) {
        return new z9.a(androidx.p016lifecycle.l0.a(creationExtras));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 h(b3.i iVar, er.p pVar, int i15, p076m2.r rVar, int i16) {
        f(iVar, pVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }
}
