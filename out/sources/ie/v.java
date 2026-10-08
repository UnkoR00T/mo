package ie;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.InputStream;

/* JADX INFO: loaded from: classes3.dex */
public final class v implements zd.j<InputStream, Bitmap> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final e f91956a = new e();

    @Override // zd.j
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public be.v<Bitmap> b(InputStream inputStream, int i15, int i16, zd.h hVar) {
        return this.f91956a.c(ImageDecoder.createSource(ve.a.b(inputStream)), i15, i16, hVar);
    }

    @Override // zd.j
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public boolean a(InputStream inputStream, zd.h hVar) {
        return true;
    }
}
