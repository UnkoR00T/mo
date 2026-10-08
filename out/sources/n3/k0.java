package n3;

import android.graphics.Bitmap;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0012\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\u0014\u001a\u00020\u00138VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000f¨\u0006\u0015"}, d2 = {"Ln3/k0;", "Ln3/b2;", "Landroid/graphics/Bitmap;", "bitmap", "<init>", "(Landroid/graphics/Bitmap;)V", "Loq/i0;", "a", "()V", "b", "Landroid/graphics/Bitmap;", "c", "()Landroid/graphics/Bitmap;", "", "l", "()I", "width", "getHeight", "height", "Ln3/c2;", "config", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class k0 implements b2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Bitmap bitmap;

    public k0(Bitmap bitmap) {
        this.bitmap = bitmap;
    }

    @Override // n3.b2
    public void a() {
        this.bitmap.prepareToDraw();
    }

    @Override // n3.b2
    public int b() {
        return l0.e(this.bitmap.getConfig());
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Bitmap getBitmap() {
        return this.bitmap;
    }

    @Override // n3.b2
    public int getHeight() {
        return this.bitmap.getHeight();
    }

    @Override // n3.b2
    public int l() {
        return this.bitmap.getWidth();
    }
}
