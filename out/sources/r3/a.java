package r3;

import androidx.compose.ui.graphics.painter.BitmapPainter;
import c5.n;
import c5.r;
import n3.b2;
import n3.v1;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a3\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Ln3/b2;", "image", "Lc5/n;", "srcOffset", "Lc5/r;", "srcSize", "Ln3/v1;", "filterQuality", "Landroidx/compose/ui/graphics/painter/BitmapPainter;", "a", "(Ln3/b2;JJI)Landroidx/compose/ui/graphics/painter/BitmapPainter;", "ui-graphics"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class a {
    public static final BitmapPainter a(b2 b2Var, long j15, long j16, int i15) {
        BitmapPainter bitmapPainter = new BitmapPainter(b2Var, j15, j16, null);
        bitmapPainter.o(i15);
        return bitmapPainter;
    }

    public static /* synthetic */ BitmapPainter b(b2 b2Var, long j15, long j16, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            j15 = n.INSTANCE.b();
        }
        long j17 = j15;
        if ((i16 & 4) != 0) {
            j16 = r.c((((long) b2Var.getHeight()) & BodyPartID.bodyIdMax) | (((long) b2Var.l()) << 32));
        }
        long j18 = j16;
        if ((i16 & 8) != 0) {
            i15 = v1.INSTANCE.a();
        }
        return a(b2Var, j17, j18, i15);
    }
}
