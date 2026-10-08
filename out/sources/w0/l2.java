package w0;

import android.os.Build;
import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\ba\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011JO\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH&¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0015\u001a\u00020\u00048&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"Lw0/l2;", "", "Landroid/view/View;", "view", "", "useTextDefault", "Lc5/k;", "size", "Lc5/h;", "cornerRadius", "elevation", "clippingEnabled", "Lc5/d;", "density", "", "initialZoom", "Lw0/k2;", "a", "(Landroid/view/View;ZJFFZLc5/d;F)Lw0/k2;", "b", "()Z", "canUpdateZoom", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface l2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f208994a;

    /* JADX INFO: renamed from: w0.l2$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lw0/l2$a;", "", "<init>", "()V", "Lw0/l2;", "a", "()Lw0/l2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f208994a = new Companion();

        private Companion() {
        }

        public final l2 a() {
            if (y1.d(0, 1, null)) {
                return Build.VERSION.SDK_INT == 28 ? m2.f209015b : n2.f209023b;
            }
            throw new UnsupportedOperationException("Magnifier is only supported on API level 28 and higher.");
        }
    }

    k2 a(View view, boolean useTextDefault, long size, float cornerRadius, float elevation, boolean clippingEnabled, c5.d density, float initialZoom);

    boolean b();
}
