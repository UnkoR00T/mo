package ac;

import android.content.Context;
import fr.t;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;
import ub.w;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b'\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0019\b\u0004\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\f\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u000e\u001a\u00020\u000b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\u0004\b\u000e\u0010\rJ\u000f\u0010\u000f\u001a\u00028\u0000H&¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u000bH&¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000bH&¢\u0006\u0004\b\u0013\u0010\u0012R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u001a\u001a\u00020\u00038\u0004X\u0084\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u001bR0\u0010 \u001a\u001e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u001dj\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t`\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001fR\u0018\u0010\"\u001a\u0004\u0018\u00018\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\u001bR$\u0010&\u001a\u00028\u00002\u0006\u0010#\u001a\u00028\u00008F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b!\u0010\u0010\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lac/h;", "T", "", "Landroid/content/Context;", "context", "Lec/b;", "taskExecutor", "<init>", "(Landroid/content/Context;Lec/b;)V", "Lyb/a;", "listener", "Loq/i0;", "c", "(Lyb/a;)V", "g", "f", "()Ljava/lang/Object;", "i", "()V", "j", "a", "Lec/b;", "b", "Landroid/content/Context;", "d", "()Landroid/content/Context;", "appContext", "Ljava/lang/Object;", "lock", "Ljava/util/LinkedHashSet;", "Lkotlin/collections/LinkedHashSet;", "Ljava/util/LinkedHashSet;", "listeners", "e", "currentState", "newState", "h", "(Ljava/lang/Object;)V", "state", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class h<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ec.b taskExecutor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Context appContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final LinkedHashSet<yb.a<T>> listeners = new LinkedHashSet<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private T currentState;

    protected h(Context context, ec.b bVar) {
        this.taskExecutor = bVar;
        this.appContext = context.getApplicationContext();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(List list, h hVar) {
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((yb.a) it.next()).a(hVar.currentState);
        }
    }

    public final void c(yb.a<T> listener) {
        synchronized (this.lock) {
            try {
                if (this.listeners.add(listener)) {
                    if (this.listeners.size() == 1) {
                        this.currentState = f();
                        w.e().a(i.f5332a, getClass().getSimpleName() + ": initial state = " + this.currentState);
                        i();
                    }
                    listener.a(this.currentState);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    protected final Context getAppContext() {
        return this.appContext;
    }

    public final T e() {
        T t15 = this.currentState;
        return t15 == null ? f() : t15;
    }

    public abstract T f();

    public final void g(yb.a<T> listener) {
        synchronized (this.lock) {
            try {
                if (this.listeners.remove(listener) && this.listeners.isEmpty()) {
                    j();
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final void h(T t15) {
        synchronized (this.lock) {
            T t16 = this.currentState;
            if (t16 == null || !t.c(t16, t15)) {
                this.currentState = t15;
                final List listF1 = v.f1(this.listeners);
                this.taskExecutor.a().execute(new Runnable() { // from class: ac.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        h.b(listF1, this);
                    }
                });
                i0 i0Var = i0.f148189a;
            }
        }
    }

    public abstract void i();

    public abstract void j();
}
