package p117tq1;

import er.p;
import er.q;
import f3.m;
import j70.h;
import mx.b;
import n50.e;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.d5;
import p076m2.g4;
import p076m2.r;
import p076m2.t;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0017¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Ltq1/h3;", "Ln50/e;", "<init>", "()V", "Loq/i0;", "a", "(Lm2/r;I)V", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class h3 implements e {
    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d(h3 h3Var, int i15, r rVar, int i16) {
        h3Var.a(rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    @Override // n50.e
    public void a(r rVar, final int i15) {
        r rVar2;
        r rVarH = rVar.h(-29878570);
        int i16 = i15 & 1;
        if (rVarH.r(i16 != 0, i16)) {
            if (t.k()) {
                t.o(-29878570, i15, -1, "pl.gov.coi.mobywatel.feature.developer.view.screens.ds.singlecard.DeveloperCustomSingleCard.Content (DeveloperSingleCardScreen.kt:2145)");
            }
            rVar2 = rVarH;
            h.g(null, null, b.b("My custom single card content", ""), null, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, null, false, false, null, rVar2, 0, 0, 0, 33554427);
            if (t.k()) {
                t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new p() { // from class: tq1.g3
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return h3.d(this.f191601a, i15, (r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // n50.e
    public /* bridge */ q<e.CustomContainerModifierData, r, Integer, m> b() {
        return super.b();
    }
}
