package ie;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import io.sentry.android.core.c2;
import java.util.concurrent.locks.Lock;

/* JADX INFO: loaded from: classes3.dex */
final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ce.d f91935a = new a();

    class a extends ce.e {
        a() {
        }

        @Override // ce.e, ce.d
        public void c(Bitmap bitmap) {
        }
    }

    static be.v<Bitmap> a(ce.d dVar, Drawable drawable, int i15, int i16) {
        Bitmap bitmapB;
        Drawable current = drawable.getCurrent();
        boolean z15 = false;
        if (current instanceof BitmapDrawable) {
            bitmapB = ((BitmapDrawable) current).getBitmap();
        } else if (current instanceof Animatable) {
            bitmapB = null;
        } else {
            bitmapB = b(dVar, current, i15, i16);
            z15 = true;
        }
        if (!z15) {
            dVar = f91935a;
        }
        return f.e(bitmapB, dVar);
    }

    private static Bitmap b(ce.d dVar, Drawable drawable, int i15, int i16) {
        if (i15 == Integer.MIN_VALUE && drawable.getIntrinsicWidth() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                c2.g("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic width");
            }
            return null;
        }
        if (i16 == Integer.MIN_VALUE && drawable.getIntrinsicHeight() <= 0) {
            if (Log.isLoggable("DrawableToBitmap", 5)) {
                c2.g("DrawableToBitmap", "Unable to draw " + drawable + " to Bitmap with Target.SIZE_ORIGINAL because the Drawable has no intrinsic height");
            }
            return null;
        }
        if (drawable.getIntrinsicWidth() > 0) {
            i15 = drawable.getIntrinsicWidth();
        }
        if (drawable.getIntrinsicHeight() > 0) {
            i16 = drawable.getIntrinsicHeight();
        }
        Lock lockI = b0.i();
        lockI.lock();
        Bitmap bitmapD = dVar.d(i15, i16, Bitmap.Config.ARGB_8888);
        try {
            Canvas canvas = new Canvas(bitmapD);
            drawable.setBounds(0, 0, i15, i16);
            drawable.draw(canvas);
            canvas.setBitmap(null);
            return bitmapD;
        } finally {
            lockI.unlock();
        }
    }
}
