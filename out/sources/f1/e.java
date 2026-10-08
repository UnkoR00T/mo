package f1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0005\bg\u0018\u00002\u00020\u0001J\u001d\u0010\u0005\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\u0007\u001a\u00020\u0002*\u00020\u00022\b\b\u0003\u0010\u0004\u001a\u00020\u0003H&¢\u0006\u0004\b\u0007\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lf1/e;", "", "Lf3/m;", "", "fraction", "d", "(Lf3/m;F)Lf3/m;", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e {
    static /* synthetic */ f3.m b(e eVar, f3.m mVar, float f15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxSize");
        }
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        return eVar.d(mVar, f15);
    }

    static /* synthetic */ f3.m c(e eVar, f3.m mVar, float f15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fillParentMaxWidth");
        }
        if ((i15 & 1) != 0) {
            f15 = 1.0f;
        }
        return eVar.a(mVar, f15);
    }

    f3.m a(f3.m mVar, float f15);

    f3.m d(f3.m mVar, float f15);
}
