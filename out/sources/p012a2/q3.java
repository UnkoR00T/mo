package p012a2;

import androidx.compose.material.c;
import androidx.compose.ui.graphics.Color;
import e2.RippleAlpha;
import n3.o1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"La2/q3;", "", "<init>", "()V", "Landroidx/compose/ui/graphics/Color;", "contentColor", "", "lightTheme", "b", "(JZ)J", "Le2/b;", "a", "(JZ)Le2/b;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class q3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final q3 f1891a = new q3();

    private q3() {
    }

    public final RippleAlpha a(long contentColor, boolean lightTheme) {
        if (lightTheme) {
            return ((double) o1.i(contentColor)) > 0.5d ? c.f9756d : c.f9757e;
        }
        return c.f9758f;
    }

    public final long b(long contentColor, boolean lightTheme) {
        return (lightTheme || ((double) o1.i(contentColor)) >= 0.5d) ? contentColor : Color.INSTANCE.i();
    }
}
