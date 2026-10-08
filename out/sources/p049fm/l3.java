package p049fm;

import c5.d;
import d1.a3;
import d1.d3;
import lh.c;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\u001a#\u0010\u0006\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0006\u0010\u0007\"\u0017\u0010\f\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lfm/f2;", "Llh/c;", "map", "Ld1/d3;", "contentPadding", "Loq/i0;", "b", "(Lfm/f2;Llh/c;Ld1/d3;)V", "a", "Ld1/d3;", "c", "()Ld1/d3;", "DefaultMapContentPadding", "maps-compose_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class l3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d3 f65190a = a3.g(0.0f, 0.0f, 3, null);

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(f2 f2Var, c cVar, d3 d3Var) {
        d dVarH = f2Var.getDensity();
        cVar.P(dVarH.X0(d3Var.c(f2Var.getLayoutDirection())), dVarH.X0(d3Var.getTop()), dVarH.X0(d3Var.b(f2Var.getLayoutDirection())), dVarH.X0(d3Var.getBottom()));
    }

    public static final d3 c() {
        return f65190a;
    }
}
