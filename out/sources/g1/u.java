package g1;

import p056h1.q2;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lg1/e1;", "state", "Lkotlin/Function1;", "Lg1/t0;", "Loq/i0;", "content", "Lkotlin/Function0;", "Lg1/o;", "c", "(Lg1/e1;Ler/l;Lm2/r;I)Ler/a;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final er.a<o> c(final e1 e1Var, er.l<? super t0, oq.i0> lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-1898306282, i15, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridItemProviderLambda (LazyGridItemProvider.kt:40)");
        }
        final f6 f6VarP = x5.p(lVar, rVar, (i15 >> 3) & 14);
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(e1Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            final f6 f6VarE = x5.e(x5.o(), new er.a() { // from class: g1.s
                @Override // er.a
                public final Object a() {
                    return u.d(f6VarP);
                }
            });
            objE = new fr.f0(x5.e(x5.o(), new er.a() { // from class: g1.t
                @Override // er.a
                public final Object a() {
                    return u.e(f6VarE, e1Var);
                }
            })) { // from class: g1.u.a
                @Override // mr.m
                public Object get() {
                    return ((f6) this.f66391b).getValue();
                }
            };
            rVar.v(objE);
        }
        mr.m mVar = (mr.m) objE;
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return mVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l d(f6 f6Var) {
        return new l((er.l) f6Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r e(f6 f6Var, e1 e1Var) {
        l lVar = (l) f6Var.getValue();
        return new r(e1Var, lVar, new q2(e1Var.C(), lVar));
    }
}
