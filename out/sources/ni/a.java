package ni;

import android.content.Context;
import android.graphics.Bitmap;
import android.renderscript.Allocation;
import android.renderscript.Element;
import android.renderscript.RenderScript;
import android.renderscript.ScriptIntrinsicBlur;
import java.security.MessageDigest;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public final class a extends ie.g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final float f136409b = 25.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final float f136410c = 0.125f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Context f136411d;

    public a(Context context, float f15, float f16) {
        this.f136411d = context.getApplicationContext();
        double d15 = 25.0f;
        if (d15 < 0.0d || d15 > 25.0d) {
            throw new IllegalArgumentException("Blur radius must be between 0 and 25!");
        }
    }

    @Override // zd.f
    public final void b(MessageDigest messageDigest) {
        messageDigest.update("blurred".getBytes(fu.d.UTF_8));
        messageDigest.update((byte) (this.f136409b * 10.0f));
        messageDigest.update((byte) (this.f136410c * 10.0f));
    }

    @Override // ie.g
    protected final Bitmap c(ce.d dVar, Bitmap bitmap, int i15, int i16) {
        float width = bitmap.getWidth();
        float f15 = this.f136410c;
        Bitmap bitmapCreateScaledBitmap = Bitmap.createScaledBitmap(bitmap, Math.round(width * f15), Math.round(bitmap.getHeight() * f15), false);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(bitmapCreateScaledBitmap);
        RenderScript renderScriptCreate = RenderScript.create(this.f136411d);
        ScriptIntrinsicBlur scriptIntrinsicBlurCreate = ScriptIntrinsicBlur.create(renderScriptCreate, Element.U8_4(renderScriptCreate));
        Allocation allocationCreateFromBitmap = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateScaledBitmap);
        Allocation allocationCreateFromBitmap2 = Allocation.createFromBitmap(renderScriptCreate, bitmapCreateBitmap);
        try {
            scriptIntrinsicBlurCreate.setRadius(this.f136409b);
            scriptIntrinsicBlurCreate.setInput(allocationCreateFromBitmap);
            scriptIntrinsicBlurCreate.forEach(allocationCreateFromBitmap2);
            allocationCreateFromBitmap2.copyTo(bitmapCreateBitmap);
            return bitmapCreateBitmap;
        } finally {
            bitmapCreateScaledBitmap.recycle();
            allocationCreateFromBitmap.destroy();
            allocationCreateFromBitmap2.destroy();
            scriptIntrinsicBlurCreate.destroy();
            renderScriptCreate.destroy();
        }
    }

    @Override // zd.f
    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (Float.valueOf(this.f136409b).equals(Float.valueOf(aVar.f136409b))) {
            if (Float.valueOf(this.f136410c).equals(Float.valueOf(aVar.f136410c))) {
                return true;
            }
        }
        return false;
    }

    @Override // zd.f
    public final int hashCode() {
        return Objects.hash("com.google.android.libraries.places.widget.internal.placedetails.photoviewer.BlurTransformation", Float.valueOf(this.f136409b), Float.valueOf(this.f136410c));
    }
}
