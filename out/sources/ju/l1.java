package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u000e¨\u0006\u0010"}, d2 = {"Lju/l1;", "Lju/y1;", "", "isActive", "<init>", "(Z)V", "", "toString", "()Ljava/lang/String;", "a", "Z", "h", "()Z", "Lju/o2;", "()Lju/o2;", "list", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class l1 implements y1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isActive;

    public l1(boolean z15) {
        this.isActive = z15;
    }

    @Override // ju.y1
    /* JADX INFO: renamed from: a */
    public o2 getList() {
        return null;
    }

    @Override // ju.y1
    /* JADX INFO: renamed from: h, reason: from getter */
    public boolean getIsActive() {
        return this.isActive;
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Empty{");
        sb5.append(getIsActive() ? "Active" : "New");
        sb5.append('}');
        return sb5.toString();
    }
}
