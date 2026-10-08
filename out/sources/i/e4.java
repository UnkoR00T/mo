package i;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00078&X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0003"}, d2 = {"Li/e4;", "", "Lh/q;", "lastCameraError", "Loq/i0;", "b", "(Lh/q;)V", "Lmu/g;", "Li/s2;", "getState", "()Lmu/g;", "state", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface e4 {
    static /* synthetic */ void a(e4 e4Var, h.q qVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: disconnect-TPqeGZw");
        }
        if ((i15 & 1) != 0) {
            qVar = null;
        }
        e4Var.b(qVar);
    }

    void b(h.q lastCameraError);

    mu.g<s2> getState();
}
