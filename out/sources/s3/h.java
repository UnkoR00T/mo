package s3;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bv\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Ls3/h;", "", "Ln3/y2;", "shape", "Ls3/g;", "shadow", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "e", "(Ln3/y2;Ls3/g;)Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "d", "(Ln3/y2;Ls3/g;)Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "Loq/i0;", "a", "()V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface h {
    default void a() {
    }

    default DropShadowPainter d(y2 shape, Shadow shadow) {
        return new DropShadowPainter(shape, shadow);
    }

    default InnerShadowPainter e(y2 shape, Shadow shadow) {
        return new InnerShadowPainter(shape, shadow);
    }
}
