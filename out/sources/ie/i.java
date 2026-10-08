package ie;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.nio.ByteBuffer;

/* JADX INFO: loaded from: classes3.dex */
public final class i implements zd.j<ByteBuffer, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f91900a = new e();

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public be.v<Bitmap> b(ByteBuffer byteBuffer, int i15, int i16, zd.h hVar) {
        return this.f91900a.c(ImageDecoder.createSource(byteBuffer), i15, i16, hVar);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(ByteBuffer byteBuffer, zd.h hVar) {
        return true;
    }
}
