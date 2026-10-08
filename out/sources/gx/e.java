package gx;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\r\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0012¨\u0006\u0014"}, d2 = {"Lgx/e;", "Lgx/d;", "<init>", "()V", "Lgx/b;", "event", "", "c", "(Lgx/b;)Z", "Lgx/c;", "handler", "b", "(Lgx/c;)Z", "a", "", "Ljava/lang/Object;", "lock", "", "Ljava/util/List;", "globalEventHandlers", "domain"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<c> globalEventHandlers = new ArrayList();

    @Override // gx.d
    public boolean a(c handler) {
        boolean z15;
        synchronized (this.lock) {
            if (this.globalEventHandlers.contains(handler)) {
                this.globalEventHandlers.remove(handler);
                z15 = true;
            } else {
                z15 = false;
            }
        }
        return z15;
    }

    @Override // gx.d
    public boolean b(c handler) {
        boolean z15;
        synchronized (this.lock) {
            z15 = false;
            if (!this.globalEventHandlers.contains(handler)) {
                this.globalEventHandlers.add(0, handler);
                z15 = true;
            }
        }
        return z15;
    }

    @Override // gx.d
    public boolean c(b event) {
        Object next;
        c cVar;
        synchronized (this.lock) {
            try {
                Iterator<T> it = this.globalEventHandlers.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!((c) next).j5(event));
                cVar = (c) next;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return cVar != null;
    }
}
