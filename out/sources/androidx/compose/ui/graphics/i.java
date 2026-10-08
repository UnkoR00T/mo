package androidx.compose.ui.graphics;

import android.graphics.Shader;
import java.util.List;
import n3.b2;
import n3.x0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aK\u0010\f\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00032\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u0012\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\b2\b\b\u0002\u0010\u0011\u001a\u00020\b¢\u0006\u0004\b\u0012\u0010\u0013\u001a1\u0010\u0018\u001a\u00060\nj\u0002`\u000b2\n\u0010\u0014\u001a\u00060\nj\u0002`\u000b2\n\u0010\u0015\u001a\u00060\nj\u0002`\u000b2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lm3/e;", "from", "to", "", "Landroidx/compose/ui/graphics/Color;", "colors", "", "colorStops", "Landroidx/compose/ui/graphics/k;", "tileMode", "Landroid/graphics/Shader;", "Landroidx/compose/ui/graphics/Shader;", "d", "(JJLjava/util/List;Ljava/util/List;I)Landroid/graphics/Shader;", "Ln3/b2;", "image", "tileModeX", "tileModeY", "b", "(Ln3/b2;II)Landroid/graphics/Shader;", "dst", "src", "Ln3/a1;", "blendMode", "a", "(Landroid/graphics/Shader;Landroid/graphics/Shader;I)Landroid/graphics/Shader;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {
    public static final Shader a(Shader shader, Shader shader2, int i15) {
        return x0.a(shader, shader2, i15);
    }

    public static final Shader b(b2 b2Var, int i15, int i16) {
        return x0.b(b2Var, i15, i16);
    }

    public static /* synthetic */ Shader c(b2 b2Var, int i15, int i16, int i17, Object obj) {
        if ((i17 & 2) != 0) {
            i15 = k.INSTANCE.a();
        }
        if ((i17 & 4) != 0) {
            i16 = k.INSTANCE.a();
        }
        return b(b2Var, i15, i16);
    }

    public static final Shader d(long j15, long j16, List<Color> list, List<Float> list2, int i15) {
        return x0.c(j15, j16, list, list2, i15);
    }
}
