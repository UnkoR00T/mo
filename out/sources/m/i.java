package m;

import CON.j0;
import h.d1;
import h.g1;
import h.n0;
import java.util.Iterator;
import java.util.List;
import ju.x;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\rB\t\b\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\b\u001a\b\u0018\u00010\u0007R\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\u0004R\u0014\u0010\u000f\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001e\u0010\u0013\u001a\f\u0012\b\u0012\u00060\u0007R\u00020\u00000\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0017\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0018"}, d2 = {"Lm/i;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "<init>", "()V", "Lh/g1;", "request", "Lm/i$a;", "m", "(Lh/g1;)Lm/i$a;", "Loq/i0;", "close", "", "a", "Ljava/lang/Object;", "lock", "Lpq/m;", "b", "Lpq/m;", "queue", "", "c", "Z", "closed", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class i implements AutoCloseable {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pq.m<a> queue = new pq.m<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0080\u0004\u0018\u00002\u00020\u0001J\u0015\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0012\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0015\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R \u0010\u001a\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00170\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001e¨\u0006 "}, d2 = {"Lm/i$a;", "", "Lh/n0;", "frame", "Loq/i0;", "b", "(Lh/n0;)V", "Lh/d1;", "failureStatus", "h", "(I)V", "close", "()V", "Lh/g1;", "a", "Lh/g1;", "m", "()Lh/g1;", "request", "Liu/a;", "Liu/a;", "closed", "Lju/x;", "Lm/t;", "c", "Lju/x;", "result", "", "Lh/n0$a;", "d", "Ljava/util/List;", "frameListeners", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public final class a implements AutoCloseable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final g1 request;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final iu.a closed;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final x<t<n0>> result;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private List<n0.a> frameListeners;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ i f121838e;

        public final void b(n0 frame) throws Exception {
            List<n0.a> list;
            t.Companion companion = t.INSTANCE;
            if (!this.result.d0(t.b(t.c(frame)))) {
                j0.a(frame);
                return;
            }
            synchronized (this) {
                list = this.frameListeners;
                this.frameListeners = null;
                i0 i0Var = i0.f148189a;
            }
            if (list != null) {
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    frame.I3(list.get(i15));
                }
            }
        }

        @Override // java.lang.AutoCloseable
        public void close() throws Exception {
            if (this.closed.a(false, true)) {
                h(d1.INSTANCE.e());
                t.Companion companion = t.INSTANCE;
                x<t<n0>> xVar = this.result;
                Object obj = null;
                if (xVar.r() && !xVar.isCancelled()) {
                    Object result = xVar.C().getResult();
                    if (t.e(result)) {
                        obj = result;
                    }
                }
                n0 n0Var = (n0) obj;
                if (n0Var != null) {
                    j0.a(n0Var);
                }
                Object obj2 = this.f121838e.lock;
                i iVar = this.f121838e;
                synchronized (obj2) {
                    iVar.queue.remove(this);
                }
            }
        }

        public final void h(int failureStatus) {
            List<n0.a> list;
            t.Companion companion = t.INSTANCE;
            if (this.result.d0(t.b(t.c(d1.f(failureStatus))))) {
                synchronized (this) {
                    list = this.frameListeners;
                    this.frameListeners = null;
                    i0 i0Var = i0.f148189a;
                }
                if (list != null) {
                    int size = list.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        list.get(i15).e();
                    }
                }
            }
        }

        /* JADX INFO: renamed from: m, reason: from getter */
        public g1 getRequest() {
            return this.request;
        }
    }

    @Override // java.lang.AutoCloseable
    public void close() {
        synchronized (this.lock) {
            if (this.closed) {
                return;
            }
            this.closed = true;
            i0 i0Var = i0.f148189a;
            Iterator<a> it = this.queue.iterator();
            while (it.hasNext()) {
                it.next().h(d1.INSTANCE.b());
            }
            this.queue.clear();
        }
    }

    public final a m(g1 request) {
        a next;
        synchronized (this.lock) {
            try {
                a aVar = null;
                if (this.closed) {
                    return null;
                }
                Iterator<a> it = this.queue.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!fr.t.c(next.getRequest(), request));
                a aVar2 = next;
                if (aVar2 != null) {
                    this.queue.remove(aVar2);
                    aVar = aVar2;
                }
                return aVar;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
