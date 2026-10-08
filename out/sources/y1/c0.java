package y1;

import fr.p0;
import g4.q1;
import g4.r1;
import p071kotlin.Metadata;
import q4.TextStyle;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0005\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lg4/g;", "Ly1/o;", "phase", "Lq4/b4;", "fallback", "b", "(Lg4/g;ILq4/b4;)Lq4/b4;", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final TextStyle b(g4.g gVar, final int i15, final TextStyle textStyle) {
        final p0 p0Var = new p0();
        p0Var.f66410a = textStyle;
        r1.c(gVar, "StyleOuterNode", new er.l() { // from class: y1.b0
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(c0.c(p0Var, i15, textStyle, (q1) obj));
            }
        });
        return (TextStyle) p0Var.f66410a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, q4.b4] */
    public static final boolean c(p0 p0Var, int i15, TextStyle textStyle, q1 q1Var) {
        if (!(q1Var instanceof m1.t)) {
            return true;
        }
        p0Var.f66410a = ((m1.t) q1Var).B3(i15, textStyle);
        return false;
    }
}
