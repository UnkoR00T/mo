package ie;

import android.graphics.Bitmap;
import java.security.MessageDigest;

/* JADX INFO: loaded from: classes3.dex */
public class j extends g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final byte[] f91901b = "com.bumptech.glide.load.resource.bitmap.CenterCrop".getBytes(zd.f.f234355a);

    @Override // zd.f
    public void b(MessageDigest messageDigest) {
        messageDigest.update(f91901b);
    }

    @Override // ie.g
    protected Bitmap c(ce.d dVar, Bitmap bitmap, int i15, int i16) {
        return b0.b(dVar, bitmap, i15, i16);
    }

    @Override // zd.f
    public boolean equals(Object obj) {
        return obj instanceof j;
    }

    @Override // zd.f
    public int hashCode() {
        return -599754482;
    }
}
