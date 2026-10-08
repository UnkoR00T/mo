package b0;

import o.l2;

/* JADX INFO: loaded from: classes.dex */
public abstract class h implements l2 {
    public static l2 d(float f15, float f16, float f17, float f18) {
        return new a(f15, f16, f17, f18);
    }

    @Override // o.l2
    /* JADX INFO: renamed from: a */
    public abstract float getMaxZoomRatio();

    @Override // o.l2
    /* JADX INFO: renamed from: b */
    public abstract float getMinZoomRatio();

    @Override // o.l2
    /* JADX INFO: renamed from: c */
    public abstract float getZoomRatio();

    public abstract float e();
}
