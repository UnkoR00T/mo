package ie;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class l extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f91903b = "com.bumptech.glide.load.resource.bitmap.CircleCrop.1".getBytes(zd.f.f234355a);

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f91903b);
    }

    @Override // ie.g
    protected Bitmap c(ce.d dVar, Bitmap bitmap, int i15, int i16) {
        return b0.d(dVar, bitmap, i15, i16);
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        return obj instanceof l;
    }

    @Override // zd.f
    public int hashCode() {
        return 1101716364;
    }
}
