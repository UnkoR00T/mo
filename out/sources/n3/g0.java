package n3;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a#\u0010\t\u001a\u00060\u0001j\u0002`\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n*\f\b\u0000\u0010\u000b\"\u00020\u00012\u00020\u0001¨\u0006\f"}, d2 = {"Ln3/n1;", "Landroid/graphics/ColorFilter;", "b", "(Ln3/n1;)Landroid/graphics/ColorFilter;", "Landroidx/compose/ui/graphics/Color;", "color", "Ln3/a1;", "blendMode", "Landroidx/compose/ui/graphics/NativeColorFilter;", "a", "(JI)Landroid/graphics/ColorFilter;", "NativeColorFilter", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g0 {
    public static final ColorFilter a(long j15, int i15) {
        return Build.VERSION.SDK_INT >= 29 ? e1.f130983a.a(j15, i15) : new PorterDuffColorFilter(o1.j(j15), d0.b(i15));
    }

    public static final ColorFilter b(n1 n1Var) {
        return n1Var.getNativeColorFilter();
    }
}
