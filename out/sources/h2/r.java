package h2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\u0010\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lh2/r;", "", "", "isLookingAhead", "didLookahead", "Lz0/v0;", "anchors", "", "targetValue", "<init>", "(ZZLz0/v0;Ljava/lang/Object;)V", "", "a", "Ljava/lang/String;", "getMessage", "()Ljava/lang/String;", "message", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class r extends Throwable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String message;

    public r(boolean z15, boolean z16, p143z0.v0<?> v0Var, Object obj) {
        this.message = "AnchoredDraggableState was not initialized correctly. isLookingAhead=" + z15 + ",didLookahead=" + z16 + ",anchors=" + v0Var + ",targetValue=" + obj;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.message;
    }
}
