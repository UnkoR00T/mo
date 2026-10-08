package u;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapRegionDecoder;
import android.graphics.Rect;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: loaded from: classes.dex */
final class f0 implements g0.a0<g0.b0<byte[]>, g0.b0<Bitmap>> {
    f0() {
    }

    private Bitmap b(byte[] bArr, Rect rect) throws o.v0 {
        try {
            return BitmapRegionDecoder.newInstance(bArr, 0, bArr.length, false).decodeRegion(rect, new BitmapFactory.Options());
        } catch (IOException e15) {
            throw new o.v0(1, "Failed to decode JPEG.", e15);
        }
    }

    @Override // g0.a0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g0.b0<Bitmap> apply(g0.b0<byte[]> b0Var) throws o.v0 {
        Rect rectB = b0Var.b();
        Bitmap bitmapB = b(b0Var.c(), rectB);
        y.f fVarD = b0Var.d();
        Objects.requireNonNull(fVarD);
        return g0.b0.j(bitmapB, fVarD, new Rect(0, 0, bitmapB.getWidth(), bitmapB.getHeight()), b0Var.f(), y.x.u(b0Var.g(), rectB), b0Var.a());
    }
}
