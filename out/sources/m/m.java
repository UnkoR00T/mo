package m;

import h.c1;
import h.n0;
import h.q1;
import io.sentry.android.core.c2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B!\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0004¢\u0006\u0004\b\u000f\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001aR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006#"}, d2 = {"Lm/m;", "Lh/n0;", "Lm/n;", "frameState", "", "Lh/q1;", "imageStreams", "<init>", "(Lm/n;Ljava/util/Set;)V", "", "h", "()Z", "Loq/i0;", "close", "()V", "finalize", "Lh/n0$a;", "listener", "I3", "(Lh/n0$a;)V", "", "toString", "()Ljava/lang/String;", "a", "Lm/n;", "b", "Ljava/util/Set;", "()Ljava/util/Set;", "Lh/c1;", "c", "outputStreams", "Liu/a;", "d", "Liu/a;", "closed", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class m implements n0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n frameState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Set<q1> imageStreams;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<c1> outputStreams;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final iu.a closed;

    public m(n nVar, Set<q1> set) {
        this.frameState = nVar;
        this.imageStreams = set;
        List<n.d> listF = nVar.f();
        ArrayList arrayList = new ArrayList(v.y(listF, 10));
        Iterator<T> it = listF.iterator();
        while (it.hasNext()) {
            arrayList.add(c1.a(((n.d) it.next()).getOutputId()));
        }
        this.outputStreams = v.k1(arrayList);
        this.closed = iu.b.a(false);
    }

    private final boolean h() {
        if (!this.closed.a(false, true)) {
            return false;
        }
        this.frameState.getFrameInfoOutput().b();
        int size = this.frameState.f().size();
        for (int i15 = 0; i15 < size; i15++) {
            n.d dVar = this.frameState.f().get(i15);
            if (b().contains(q1.a(dVar.getStreamId()))) {
                dVar.b();
            }
        }
        return true;
    }

    @Override // h.n0
    public void I3(n0.a listener) {
        if (!this.closed.b()) {
            this.frameState.c(listener);
            return;
        }
        throw new IllegalStateException(("Cannot add Frame.Listener, " + this + " is closed!").toString());
    }

    public Set<q1> b() {
        return this.imageStreams;
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        h();
    }

    protected final void finalize() {
        if (h() && k.k.f107055a.b()) {
            c2.e("CXCP", "Failed to close " + this + "! This indicates a memory leak and could cause the camera to stall, or images to be lost.");
        }
    }

    public String toString() {
        return this.frameState.toString();
    }

    public /* synthetic */ m(n nVar, Set set, int i15, fr.k kVar) {
        if ((i15 & 2) != 0) {
            List<n.d> listF = nVar.f();
            ArrayList arrayList = new ArrayList(v.y(listF, 10));
            Iterator<T> it = listF.iterator();
            while (it.hasNext()) {
                arrayList.add(q1.a(((n.d) it.next()).getStreamId()));
            }
            set = v.k1(arrayList);
        }
        this(nVar, set);
    }
}
