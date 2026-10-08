package j2;

import n3.p1;
import p071kotlin.Metadata;
import u0.i0;
import u0.x2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a=\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0000¢\u0006\u0004\b\f\u0010\r\u001a\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b\u0014\u0010\u0013\"\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00110\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0019"}, d2 = {"Lb1/j;", "interactionSource", "", "bounded", "Lc5/h;", "radius", "Ln3/p1;", "color", "Lkotlin/Function0;", "Landroidx/compose/material3/internal/ripple/b;", "rippleNodeConfig", "Lg4/g;", "c", "(Lb1/j;ZFLn3/p1;Ler/a;)Lg4/g;", "Lb1/i;", "interaction", "Lu0/l;", "", "d", "(Lb1/i;)Lu0/l;", "e", "Lu0/x2;", "a", "Lu0/x2;", "DefaultTweenSpec", "material3"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final x2<Float> f98633a = new x2<>(15, 0, i0.e(), 2, null);

    public static final g4.g c(b1.j jVar, boolean z15, float f15, p1 p1Var, er.a<androidx.compose.material3.internal.ripple.b> aVar) {
        return new p(jVar, z15, f15, p1Var, aVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.l<Float> d(b1.i iVar) {
        if (iVar instanceof b1.g) {
            return f98633a;
        }
        if (!(iVar instanceof b1.d) && !(iVar instanceof b1.b)) {
            return f98633a;
        }
        return new x2(45, 0, i0.e(), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final u0.l<Float> e(b1.i iVar) {
        if (!(iVar instanceof b1.g) && !(iVar instanceof b1.d) && (iVar instanceof b1.b)) {
            return new x2(150, 0, i0.e(), 2, null);
        }
        return f98633a;
    }
}
