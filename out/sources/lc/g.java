package lc;

import android.content.Context;
import android.graphics.Canvas;
import coil3.compose.ImagePainter;
import com.google.accompanist.drawablepainter.DrawablePainter;
import kc.BitmapImage;
import kc.DrawableImage;
import kc.n;
import kc.v;
import n3.f0;
import n3.h1;
import n3.l0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a'\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\n\u0010\u0003\u001a\u00060\u0001j\u0002`\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b\"\u001c\u0010\u000e\u001a\u00060\nj\u0002`\u000b*\u00020\t8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lkc/n;", "Landroid/content/Context;", "Lcoil3/PlatformContext;", "context", "Ln3/v1;", "filterQuality", "Landroidx/compose/ui/graphics/painter/a;", "a", "(Lkc/n;Landroid/content/Context;I)Landroidx/compose/ui/graphics/painter/a;", "Ln3/h1;", "Landroid/graphics/Canvas;", "Landroidx/compose/ui/graphics/NativeCanvas;", "c", "(Ln3/h1;)Landroid/graphics/Canvas;", "nativeCanvas", "coil-compose-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final androidx.compose.ui.graphics.painter.a a(n nVar, Context context, int i15) {
        if (nVar instanceof BitmapImage) {
            return r3.a.b(l0.c(((BitmapImage) nVar).getBitmap()), 0L, 0L, i15, 6, null);
        }
        return nVar instanceof DrawableImage ? new DrawablePainter(v.a(nVar, context.getResources()).mutate()) : new ImagePainter(nVar);
    }

    public static /* synthetic */ androidx.compose.ui.graphics.painter.a b(n nVar, Context context, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = p3.f.INSTANCE.b();
        }
        return a(nVar, context, i15);
    }

    public static final Canvas c(h1 h1Var) {
        return f0.d(h1Var);
    }
}
