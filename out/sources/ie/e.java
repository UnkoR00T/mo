package ie;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements zd.j<ImageDecoder.Source, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ce.d f91896a = new ce.e();

    @Override // zd.j
    public /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, zd.h hVar) {
        return d(d.a(source), hVar);
    }

    @Override // zd.j
    public /* bridge */ /* synthetic */ be.v<Bitmap> b(ImageDecoder.Source source, int i15, int i16, zd.h hVar) {
        return c(d.a(source), i15, i16, hVar);
    }

    public be.v<Bitmap> c(ImageDecoder.Source source, int i15, int i16, zd.h hVar) throws IOException {
        Bitmap bitmapDecodeBitmap = ImageDecoder.decodeBitmap(source, new he.a(i15, i16, hVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            bitmapDecodeBitmap.getWidth();
            bitmapDecodeBitmap.getHeight();
        }
        return new f(bitmapDecodeBitmap, this.f91896a);
    }

    public boolean d(ImageDecoder.Source source, zd.h hVar) {
        return true;
    }
}
