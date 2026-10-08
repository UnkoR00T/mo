package p049fm;

import er.p;
import lh.c;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(k = 3, mv = {2, 3, 0}, xi = 176)
public final class q2 implements p<f2, Integer, i0> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ c f65251a;

    public q2(c cVar) {
        this.f65251a = cVar;
    }

    @Override // er.p
    public /* bridge */ /* synthetic */ i0 B(f2 f2Var, Integer num) {
        c(f2Var, num);
        return i0.f148189a;
    }

    public final void c(f2 f2Var, Integer num) {
        if (num != null) {
            this.f65251a.p(num.intValue());
        }
    }
}
