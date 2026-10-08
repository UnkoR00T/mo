package w0;

import android.view.View;
import android.widget.Magnifier;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lw0/n2;", "Lw0/l2;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lc5/k;", "size", "Lc5/h;", "cornerRadius", "elevation", "clippingEnabled", "Lc5/d;", "density", "", "initialZoom", "Lw0/n2$a;", "c", "(Landroid/view/View;ZJFFZLc5/d;F)Lw0/n2$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class n2 implements l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final n2 f209023b = new n2();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = true;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lw0/n2$a;", "Lw0/m2$a;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Lm3/e;", "sourceCenter", "magnifierCenter", "", "zoom", "Loq/i0;", "a", "(JJF)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends m2.a {
        public a(Magnifier magnifier) {
            super(magnifier);
        }

        @Override // w0.m2.a, w0.k2
        public void a(long sourceCenter, long magnifierCenter, float zoom) {
            if (!Float.isNaN(zoom)) {
                getMagnifier().setZoom(zoom);
            }
            if ((9223372034707292159L & magnifierCenter) != 9205357640488583168L) {
                getMagnifier().show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (magnifierCenter >> 32)), Float.intBitsToFloat((int) (magnifierCenter & BodyPartID.bodyIdMax)));
            } else {
                getMagnifier().show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & BodyPartID.bodyIdMax)));
            }
        }
    }

    private n2() {
    }

    @Override // w0.l2
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // w0.l2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, c5.d density, float initialZoom) {
        if (useTextDefault) {
            return new a(new Magnifier(view));
        }
        long jB2 = density.B2(size);
        float fL2 = density.l2(cornerRadius);
        float fL3 = density.l2(elevation);
        Magnifier.Builder builder = new Magnifier.Builder(view);
        if (jB2 != 9205357640488583168L) {
            builder.setSize(hr.a.d(Float.intBitsToFloat((int) (jB2 >> 32))), hr.a.d(Float.intBitsToFloat((int) (jB2 & BodyPartID.bodyIdMax))));
        }
        if (!Float.isNaN(fL2)) {
            builder.setCornerRadius(fL2);
        }
        if (!Float.isNaN(fL3)) {
            builder.setElevation(fL3);
        }
        if (!Float.isNaN(initialZoom)) {
            builder.setInitialZoom(initialZoom);
        }
        builder.setClippingEnabled(clippingEnabled);
        return new a(builder.build());
    }
}
