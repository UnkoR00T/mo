package ju;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lju/h;", "Lju/n1;", "Ljava/lang/Thread;", "thread", "<init>", "(Ljava/lang/Thread;)V", "j", "Ljava/lang/Thread;", "d3", "()Ljava/lang/Thread;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h extends n1 {

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final Thread thread;

    public h(Thread thread) {
        this.thread = thread;
    }

    @Override // ju.o1
    /* JADX INFO: renamed from: d3, reason: from getter */
    protected Thread getThread() {
        return this.thread;
    }
}
