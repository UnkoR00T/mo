package k3;

import n3.t2;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aC\u0010\n\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\t\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lf3/m;", "Lc5/h;", "elevation", "Ln3/y2;", "shape", "", "clip", "Landroidx/compose/ui/graphics/Color;", "ambientColor", "spotColor", "a", "(Lf3/m;FLn3/y2;ZJJ)Lf3/m;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class u {
    public static final f3.m a(f3.m mVar, float f15, y2 y2Var, boolean z15, long j15, long j16) {
        return (c5.h.l(f15, c5.h.n((float) 0)) > 0 || z15) ? mVar.u(new ShadowGraphicsLayerElement(f15, y2Var, z15, j15, j16, null)) : mVar;
    }

    public static /* synthetic */ f3.m b(f3.m mVar, float f15, y2 y2Var, boolean z15, long j15, long j16, int i15, Object obj) {
        boolean z16;
        y2 y2VarA = (i15 & 2) != 0 ? t2.a() : y2Var;
        if ((i15 & 4) != 0) {
            z16 = false;
            if (c5.h.l(f15, c5.h.n(0)) > 0) {
                z16 = true;
            }
        } else {
            z16 = z15;
        }
        return a(mVar, f15, y2VarA, z16, (i15 & 8) != 0 ? androidx.compose.ui.graphics.f.a() : j15, (i15 & 16) != 0 ? androidx.compose.ui.graphics.f.a() : j16);
    }
}
