package s3;

import android.graphics.BlurMaskFilter;
import androidx.compose.ui.graphics.Color;
import n3.a1;
import n3.k2;
import n3.l2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aC\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Ln3/k2;", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/a1;", "blendMode", "Landroid/graphics/BlurMaskFilter;", "Landroidx/compose/ui/graphics/shadow/BlurFilter;", "blurFilter", "Ln3/l2;", "style", "a", "(Ln3/k2;JILandroid/graphics/BlurMaskFilter;I)Ln3/k2;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    public static final k2 a(k2 k2Var, long j15, int i15, BlurMaskFilter blurMaskFilter, int i16) {
        k2Var.m(j15);
        k2Var.f(i15);
        k2Var.u(i16);
        d.b(k2Var, blurMaskFilter);
        return k2Var;
    }

    public static /* synthetic */ k2 b(k2 k2Var, long j15, int i15, BlurMaskFilter blurMaskFilter, int i16, int i17, Object obj) {
        if ((i17 & 1) != 0) {
            j15 = Color.INSTANCE.a();
        }
        long j16 = j15;
        if ((i17 & 2) != 0) {
            i15 = a1.INSTANCE.B();
        }
        int i18 = i15;
        if ((i17 & 4) != 0) {
            blurMaskFilter = null;
        }
        BlurMaskFilter blurMaskFilter2 = blurMaskFilter;
        if ((i17 & 8) != 0) {
            i16 = l2.INSTANCE.a();
        }
        return a(k2Var, j16, i18, blurMaskFilter2, i16);
    }
}
