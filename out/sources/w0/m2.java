package w0;

import android.view.View;
import android.widget.Magnifier;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\bÁ\u0002\u0018\u00002\u00020\u0001:\u0001\u0019B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\u00020\u00068\u0016X\u0096D¢\u0006\f\n\u0004\b\u0013\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017¨\u0006\u001a"}, d2 = {"Lw0/m2;", "Lw0/l2;", "<init>", "()V", "Landroid/view/View;", "view", "", "useTextDefault", "Lc5/k;", "size", "Lc5/h;", "cornerRadius", "elevation", "clippingEnabled", "Lc5/d;", "density", "", "initialZoom", "Lw0/m2$a;", "c", "(Landroid/view/View;ZJFFZLc5/d;F)Lw0/m2$a;", "Z", "b", "()Z", "canUpdateZoom", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m2 implements l2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m2 f209015b = new m2();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final boolean canUpdateZoom = false;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0010\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lw0/m2$a;", "Lw0/k2;", "Landroid/widget/Magnifier;", "magnifier", "<init>", "(Landroid/widget/Magnifier;)V", "Loq/i0;", "c", "()V", "Lm3/e;", "sourceCenter", "magnifierCenter", "", "zoom", "a", "(JJF)V", "dismiss", "Landroid/widget/Magnifier;", "d", "()Landroid/widget/Magnifier;", "Lc5/r;", "b", "()J", "size", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static class a implements k2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Magnifier magnifier;

        public a(Magnifier magnifier) {
            this.magnifier = magnifier;
        }

        @Override // w0.k2
        public void a(long sourceCenter, long magnifierCenter, float zoom) {
            this.magnifier.show(Float.intBitsToFloat((int) (sourceCenter >> 32)), Float.intBitsToFloat((int) (sourceCenter & BodyPartID.bodyIdMax)));
        }

        @Override // w0.k2
        public long b() {
            return c5.r.c((((long) this.magnifier.getHeight()) & BodyPartID.bodyIdMax) | (((long) this.magnifier.getWidth()) << 32));
        }

        @Override // w0.k2
        public void c() {
            this.magnifier.update();
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Magnifier getMagnifier() {
            return this.magnifier;
        }

        @Override // w0.k2
        public void dismiss() {
            this.magnifier.dismiss();
        }
    }

    private m2() {
    }

    @Override // w0.l2
    public boolean b() {
        return canUpdateZoom;
    }

    @Override // w0.l2
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public a a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, c5.d density, float initialZoom) {
        return new a(new Magnifier(view));
    }
}
