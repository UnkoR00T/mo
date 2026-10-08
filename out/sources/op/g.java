package op;

import android.graphics.ColorSpace;
import android.os.Build;

/* JADX INFO: loaded from: classes4.dex */
public final class g extends b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorSpace f148065b;

    public g(ColorSpace colorSpace) {
        this.f148065b = colorSpace;
    }

    @Override // op.b, hp.c
    public bp.b D1() {
        throw new UnsupportedOperationException("JPX color spaces don't have COS objects");
    }

    @Override // op.b
    public String d() {
        return "JPX";
    }

    @Override // op.b
    public int e() {
        if (Build.VERSION.SDK_INT > 26) {
            return this.f148065b.getComponentCount();
        }
        return 0;
    }
}
