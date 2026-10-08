package x20;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.opengl.GLES20;
import android.opengl.GLUtils;

/* JADX INFO: loaded from: classes5.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected Context f216514a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f216515b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int[] f216516c = new int[1];

    public c(Context context, int i15) {
        this.f216514a = context;
        this.f216515b = i15;
    }

    public void a() {
        GLES20.glGenTextures(1, this.f216516c, 0);
        if (this.f216516c[0] == 0) {
            throw new IllegalStateException("Could not create a texture");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        options.inScaled = false;
        Bitmap bitmapDecodeResource = BitmapFactory.decodeResource(this.f216514a.getResources(), this.f216515b, options);
        GLES20.glBindTexture(3553, this.f216516c[0]);
        GLES20.glTexParameteri(3553, 10241, 9987);
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10242, 10497);
        GLES20.glTexParameteri(3553, 10243, 10497);
        GLUtils.texImage2D(3553, 0, 6408, bitmapDecodeResource, 0);
        GLES20.glGenerateMipmap(3553);
        bitmapDecodeResource.recycle();
    }
}
