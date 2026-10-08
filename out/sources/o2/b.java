package o2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\t\u001a\u0004\b\u000e\u0010\u000b\"\u0004\b\u000f\u0010\rR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\t\u001a\u0004\b\b\u0010\u000b\"\u0004\b\u0010\u0010\r¨\u0006\u0011"}, d2 = {"Lo2/b;", "", "", "slotIndex", "nodeIndex", "nodeCount", "<init>", "(III)V", "a", "I", "c", "()I", "f", "(I)V", "b", "e", "d", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int slotIndex;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int nodeIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    public b(int i15, int i16, int i17) {
        this.slotIndex = i15;
        this.nodeIndex = i16;
        this.nodeCount = i17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getNodeCount() {
        return this.nodeCount;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getNodeIndex() {
        return this.nodeIndex;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final int getSlotIndex() {
        return this.slotIndex;
    }

    public final void d(int i15) {
        this.nodeCount = i15;
    }

    public final void e(int i15) {
        this.nodeIndex = i15;
    }

    public final void f(int i15) {
        this.slotIndex = i15;
    }
}
