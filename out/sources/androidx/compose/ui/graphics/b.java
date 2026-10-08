package androidx.compose.ui.graphics;

import android.graphics.Shader;
import android.os.Build;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/k;", "Landroid/graphics/Shader$TileMode;", "a", "(I)Landroid/graphics/Shader$TileMode;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {
    public static final Shader.TileMode a(int i15) {
        k.Companion companion = k.INSTANCE;
        if (k.f(i15, companion.a())) {
            return Shader.TileMode.CLAMP;
        }
        if (k.f(i15, companion.d())) {
            return Shader.TileMode.REPEAT;
        }
        if (k.f(i15, companion.c())) {
            return Shader.TileMode.MIRROR;
        }
        if (k.f(i15, companion.b()) && Build.VERSION.SDK_INT >= 31) {
            return l.f9946a.a();
        }
        return Shader.TileMode.CLAMP;
    }
}
