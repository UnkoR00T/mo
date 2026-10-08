package f1;

import p071kotlin.Metadata;
import p076m2.m5;
import p076m2.y2;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\r\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001b\u0010\u000f\u001a\u00020\n*\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000f\u0010\u000eR\u0016\u0010\u0012\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011R\u0016\u0010\u0014\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011¨\u0006\u0015"}, d2 = {"Lf1/f;", "Lf1/e;", "<init>", "()V", "", "width", "height", "Loq/i0;", "e", "(II)V", "Lf3/m;", "", "fraction", "d", "(Lf3/m;F)Lf3/m;", "a", "Lm2/y2;", "Lm2/y2;", "maxWidthState", "b", "maxHeightState", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private y2 maxWidthState = m5.a(Integer.MAX_VALUE);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private y2 maxHeightState = m5.a(Integer.MAX_VALUE);

    @Override // f1.e
    public f3.m a(f3.m mVar, float f15) {
        return mVar.u(new d1(f15, this.maxWidthState, null, "fillParentMaxWidth", 4, null));
    }

    @Override // f1.e
    public f3.m d(f3.m mVar, float f15) {
        return mVar.u(new d1(f15, this.maxWidthState, this.maxHeightState, "fillParentMaxSize"));
    }

    public final void e(int width, int height) {
        this.maxWidthState.g(width);
        this.maxHeightState.g(height);
    }
}
