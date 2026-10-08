package l;

import h.g1;
import h.i1;
import h.p0;
import h.q0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0013\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001b\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001e\u0010\u0004J\u000f\u0010\u001f\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001f\u0010\u0004J\u000f\u0010 \u001a\u00020\tH\u0016¢\u0006\u0004\b \u0010\u0004R\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\"¨\u0006$"}, d2 = {"Ll/q;", "Lh/g1$a;", "Ll/j$b;", "<init>", "()V", "Lh/j1;", "requestNumber", "Lh/q0;", "metadata", "Loq/i0;", "j", "(JLh/q0;)V", "Lh/i1;", "requestMetadata", "M", "(Lh/i1;)V", "Lh/r0;", "frameNumber", "captureResult", "b", "(Lh/i1;JLh/q0;)V", "Lh/p0;", "totalCaptureResult", "a0", "(Lh/i1;JLh/p0;)V", "Ll/s;", "listener", "g", "(Ll/s;)V", "i", "a", "c", "d", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class q implements g1.a, GraphLoop.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<s> listeners = new CopyOnWriteArrayList<>();

    private final void j(long requestNumber, q0 metadata) {
        for (s sVar : this.listeners) {
            if (sVar.e(requestNumber, metadata)) {
                this.listeners.remove(sVar);
            }
        }
    }

    @Override // h.g1.a
    public void M(i1 requestMetadata) {
        Iterator<s> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().f(requestMetadata.getRequestNumber());
        }
    }

    @Override // l.GraphLoop.b
    public void a() {
        Iterator<s> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // h.g1.a
    public void a0(i1 requestMetadata, long frameNumber, p0 totalCaptureResult) {
        j(requestMetadata.getRequestNumber(), totalCaptureResult.e());
    }

    @Override // h.g1.a
    public void b(i1 requestMetadata, long frameNumber, q0 captureResult) {
        j(requestMetadata.getRequestNumber(), captureResult);
    }

    @Override // l.GraphLoop.b
    public void c() {
        Iterator<s> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    @Override // l.GraphLoop.b
    public void d() {
        Iterator<s> it = this.listeners.iterator();
        while (it.hasNext()) {
            it.next().a();
        }
    }

    public final void g(s listener) {
        this.listeners.add(listener);
    }

    public final void i(s listener) {
        this.listeners.remove(listener);
    }
}
