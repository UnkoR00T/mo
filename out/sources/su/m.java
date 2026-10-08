package su;

import java.util.concurrent.atomic.AtomicReferenceArray;
import ou.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u00052\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0010\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00178\u0006¨\u0006\u0019"}, d2 = {"Lsu/m;", "Lou/b0;", "", "id", "prev", "", "pointers", "<init>", "(JLsu/m;I)V", "index", "", "cause", "Ltq/i;", "context", "Loq/i0;", "s", "(ILjava/lang/Throwable;Ltq/i;)V", "", "toString", "()Ljava/lang/String;", "r", "()I", "numberOfSlots", "", "acquirers", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class m extends b0<m> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final /* synthetic */ AtomicReferenceArray f184363e;

    public m(long j15, m mVar, int i15) {
        super(j15, mVar, i15);
        this.f184363e = new AtomicReferenceArray(l.f184362f);
    }

    @Override // ou.b0
    public int r() {
        return l.f184362f;
    }

    @Override // ou.b0
    public void s(int index, Throwable cause, tq.i context) {
        getF184363e().set(index, l.f184361e);
        t();
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.id + ", hashCode=" + hashCode() + ']';
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final /* synthetic */ AtomicReferenceArray getF184363e() {
        return this.f184363e;
    }
}
