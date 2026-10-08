package f1;

import p056h1.q2;
import p071kotlin.Metadata;
import p076m2.f6;
import p076m2.x5;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a1\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lf1/y0;", "state", "Lkotlin/Function1;", "Lf1/q0;", "Loq/i0;", "content", "Lkotlin/Function0;", "Lf1/r;", "c", "(Lf1/y0;Ler/l;Lm2/r;I)Ler/a;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class x {
    public static final er.a<r> c(final y0 y0Var, er.l<? super q0, oq.i0> lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-343736148, i15, -1, "androidx.compose.foundation.lazy.rememberLazyListItemProviderLambda (LazyListItemProvider.kt:41)");
        }
        final f6 f6VarP = x5.p(lVar, rVar, (i15 >> 3) & 14);
        boolean z15 = (((i15 & 14) ^ 6) > 4 && rVar.W(y0Var)) || (i15 & 6) == 4;
        Object objE = rVar.E();
        if (z15 || objE == p076m2.r.INSTANCE.a()) {
            final f fVar = new f();
            final f6 f6VarE = x5.e(x5.o(), new er.a() { // from class: f1.v
                @Override // er.a
                public final Object a() {
                    return x.d(f6VarP);
                }
            });
            objE = new fr.f0(x5.e(x5.o(), new er.a() { // from class: f1.w
                @Override // er.a
                public final Object a() {
                    return x.e(f6VarE, y0Var, fVar);
                }
            })) { // from class: f1.x.a
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
    public static final p d(f6 f6Var) {
        return new p((er.l) f6Var.getValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u e(f6 f6Var, y0 y0Var, f fVar) {
        p pVar = (p) f6Var.getValue();
        return new u(y0Var, pVar, fVar, new q2(y0Var.E(), pVar));
    }
}
