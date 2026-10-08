package qb;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutInfo;
import androidx.window.reflection.Consumer2;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import ob.u;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001b\u0010\u000e\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0010\u001a\u00020\t2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0001¢\u0006\u0004\b\u0010\u0010\u000fJ\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0016R\u0018\u0010\u0019\u001a\u0004\u0018\u00010\f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0018R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f0\u00010\u001a8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u001b¨\u0006\u001d"}, d2 = {"Lqb/i;", "Li6/a;", "Landroidx/window/extensions/layout/WindowLayoutInfo;", "Landroidx/window/reflection/Consumer2;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "value", "Loq/i0;", "a", "(Landroidx/window/extensions/layout/WindowLayoutInfo;)V", "Lob/u;", "listener", "b", "(Li6/a;)V", "d", "", "c", "()Z", "Landroid/content/Context;", "Ljava/util/concurrent/locks/ReentrantLock;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Lob/u;", "lastKnownValue", "", "Ljava/util/Set;", "registeredListeners", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class i implements i6.a<WindowLayoutInfo>, Consumer2<WindowLayoutInfo> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private u lastKnownValue;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock globalLock = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Set<i6.a<u>> registeredListeners = new LinkedHashSet();

    public i(Context context) {
        this.context = context;
    }

    @Override // i6.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public void accept(WindowLayoutInfo value) {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            u uVarB = h.f165689a.b(this.context, value);
            this.lastKnownValue = uVarB;
            Iterator<T> it = this.registeredListeners.iterator();
            while (it.hasNext()) {
                ((i6.a) it.next()).accept(uVarB);
            }
            i0 i0Var = i0.f148189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void b(i6.a<u> listener) {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            u uVar = this.lastKnownValue;
            if (uVar != null) {
                listener.accept(uVar);
            }
            this.registeredListeners.add(listener);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean c() {
        return this.registeredListeners.isEmpty();
    }

    public final void d(i6.a<u> listener) {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            this.registeredListeners.remove(listener);
        } finally {
            reentrantLock.unlock();
        }
    }
}
