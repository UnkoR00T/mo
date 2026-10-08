package p143z0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J!\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lz0/b;", "", "", "newOffset", "lastKnownVelocity", "Loq/i0;", "a", "(FF)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface b {
    static /* synthetic */ void b(b bVar, float f15, float f16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: dragTo");
        }
        if ((i15 & 2) != 0) {
            f16 = 0.0f;
        }
        bVar.a(f15, f16);
    }

    void a(float newOffset, float lastKnownVelocity);
}
