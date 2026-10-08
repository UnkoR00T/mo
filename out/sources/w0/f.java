package w0;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\b\"\u0014\u0010\f\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b\"\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u000e¨\u0006\u0010"}, d2 = {"Lm2/a0;", "Lw0/h2;", "b", "(Lm2/a0;)Lw0/h2;", "Lz3/g;", "source", "", "c", "(I)F", "Landroidx/compose/ui/graphics/Color;", "a", "J", "DefaultGlowColor", "Ld1/d3;", "Ld1/d3;", "DefaultGlowPaddingValues", "foundation"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f208892a = n3.o1.d(4284900966L);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d1.d3 f208893b = d1.a3.g(0.0f, 0.0f, 3, null);

    public static final h2 b(p076m2.a0 a0Var) {
        Context context = (Context) a0Var.F(AndroidCompositionLocals_androidKt.c());
        c5.d dVar = (c5.d) a0Var.F(androidx.compose.ui.platform.g1.f());
        OverscrollConfiguration overscrollConfiguration = (OverscrollConfiguration) a0Var.F(f2.c());
        if (overscrollConfiguration == null) {
            return null;
        }
        return new e(context, dVar, overscrollConfiguration.getGlowColor(), overscrollConfiguration.getDrawPadding(), null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float c(int i15) {
        return z3.g.d(i15, z3.g.INSTANCE.a()) ? 4.0f : 1.0f;
    }
}
