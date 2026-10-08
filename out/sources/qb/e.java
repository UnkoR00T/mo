package qb;

import android.content.Context;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import ob.u;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0011\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0012\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00190\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR&\u0010\u001e\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0004\u0012\u00020\b0\u00188\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001f"}, d2 = {"Lqb/e;", "Lqb/d;", "Landroidx/window/extensions/layout/WindowLayoutComponent;", "component", "Lmb/d;", "adapter", "<init>", "(Landroidx/window/extensions/layout/WindowLayoutComponent;Lmb/d;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Li6/a;", "Lob/u;", "callback", "Loq/i0;", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Li6/a;)V", "a", "(Li6/a;)V", "Ljava/util/concurrent/locks/ReentrantLock;", "g", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "", "Lqb/i;", "h", "Ljava/util/Map;", "contextToListeners", "i", "listenerToContext", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class e extends d {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock globalLock;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Map<Context, i> contextToListeners;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<i6.a<u>, Context> listenerToContext;

    public e(WindowLayoutComponent windowLayoutComponent, mb.d dVar) {
        super(windowLayoutComponent, dVar);
        this.globalLock = new ReentrantLock();
        this.contextToListeners = new LinkedHashMap();
        this.listenerToContext = new LinkedHashMap();
    }

    @Override // qb.d, qb.c, pb.a
    public void a(i6.a<u> callback) {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            Context context = this.listenerToContext.get(callback);
            if (context == null) {
                return;
            }
            i iVar = this.contextToListeners.get(context);
            if (iVar == null) {
                return;
            }
            iVar.d(callback);
            this.listenerToContext.remove(callback);
            if (iVar.c()) {
                this.contextToListeners.remove(context);
                getComponent().removeWindowLayoutInfoListener(iVar);
            }
            i0 i0Var = i0.f148189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override // qb.d, qb.c, pb.a
    public void b(Context context, Executor executor, i6.a<u> callback) {
        ReentrantLock reentrantLock = this.globalLock;
        reentrantLock.lock();
        try {
            i iVar = this.contextToListeners.get(context);
            if (iVar != null) {
                iVar.b(callback);
                this.listenerToContext.put(callback, context);
            } else {
                i iVar2 = new i(context);
                this.contextToListeners.put(context, iVar2);
                this.listenerToContext.put(callback, context);
                iVar2.b(callback);
                getComponent().addWindowLayoutInfoListener(context, iVar2);
            }
            i0 i0Var = i0.f148189a;
        } finally {
            reentrantLock.unlock();
        }
    }
}
