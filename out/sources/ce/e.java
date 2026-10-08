package ce;

import android.graphics.Bitmap;

/* JADX INFO: loaded from: classes3.dex */
public class e implements d {
    @Override // ce.d
    public void a(int i15) {
    }

    @Override // ce.d
    public void b() {
    }

    @Override // ce.d
    public void c(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // ce.d
    public Bitmap d(int i15, int i16, Bitmap.Config config) {
        return Bitmap.createBitmap(i15, i16, config);
    }

    @Override // ce.d
    public Bitmap e(int i15, int i16, Bitmap.Config config) {
        return d(i15, i16, config);
    }
}
