package ne;

import android.graphics.Bitmap;
import be.v;
import java.io.ByteArrayOutputStream;
import zd.h;

/* JADX INFO: loaded from: classes3.dex */
public class a implements e<Bitmap, byte[]> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Bitmap.CompressFormat f134844a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f134845b;

    public a() {
        this(Bitmap.CompressFormat.JPEG, 100);
    }

    @Override // ne.e
    public v<byte[]> a(v<Bitmap> vVar, h hVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        vVar.get().compress(this.f134844a, this.f134845b, byteArrayOutputStream);
        vVar.c();
        return new je.b(byteArrayOutputStream.toByteArray());
    }

    public a(Bitmap.CompressFormat compressFormat, int i15) {
        this.f134844a = compressFormat;
        this.f134845b = i15;
    }
}
