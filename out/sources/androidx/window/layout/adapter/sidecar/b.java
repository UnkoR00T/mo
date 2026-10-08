package androidx.window.layout.adapter.sidecar;

import android.app.Activity;
import android.content.Context;
import fr.k;
import fr.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import mb.l;
import ob.u;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u0000 %2\u00020\u0001:\u0003\u0015%\u0017B\u0013\b\u0007\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0003¢\u0006\u0004\b\f\u0010\rJ-\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u000b2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0087\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u0005R&\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0015\u0010\u001f\u0012\u0004\b\"\u0010#\u001a\u0004\b \u0010!¨\u0006&"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b;", "Lpb/a;", "Landroidx/window/layout/adapter/sidecar/a;", "windowExtension", "<init>", "(Landroidx/window/layout/adapter/sidecar/a;)V", "Landroid/app/Activity;", "activity", "", "h", "(Landroid/app/Activity;)Z", "Loq/i0;", "f", "(Landroid/app/Activity;)V", "Landroid/content/Context;", "context", "Ljava/util/concurrent/Executor;", "executor", "Li6/a;", "Lob/u;", "callback", "b", "(Landroid/content/Context;Ljava/util/concurrent/Executor;Li6/a;)V", "a", "(Li6/a;)V", "Landroidx/window/layout/adapter/sidecar/a;", "getWindowExtension", "()Landroidx/window/layout/adapter/sidecar/a;", "setWindowExtension", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Landroidx/window/layout/adapter/sidecar/b$c;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "g", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "getWindowLayoutChangeCallbacks$annotations", "()V", "windowLayoutChangeCallbacks", "c", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class b implements pb.a {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static volatile b f13747d;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private a windowExtension;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<c> windowLayoutChangeCallbacks = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final ReentrantLock f13748e = new ReentrantLock();

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0011\u001a\u00020\u000e8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$a;", "", "<init>", "()V", "Landroid/content/Context;", "context", "Landroidx/window/layout/adapter/sidecar/b;", "a", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/b;", "Landroidx/window/layout/adapter/sidecar/a;", "b", "(Landroid/content/Context;)Landroidx/window/layout/adapter/sidecar/a;", "Lmb/l;", "sidecarVersion", "", "c", "(Lmb/l;)Z", "DEBUG", "Z", "globalInstance", "Landroidx/window/layout/adapter/sidecar/b;", "Ljava/util/concurrent/locks/ReentrantLock;", "globalLock", "Ljava/util/concurrent/locks/ReentrantLock;", "", "TAG", "Ljava/lang/String;", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final b a(Context context) {
            if (b.f13747d == null) {
                ReentrantLock reentrantLock = b.f13748e;
                reentrantLock.lock();
                try {
                    if (b.f13747d == null) {
                        b.f13747d = new b(b.INSTANCE.b(context));
                    }
                    i0 i0Var = i0.f148189a;
                } finally {
                    reentrantLock.unlock();
                }
            }
            return b.f13747d;
        }

        public final a b(Context context) {
            try {
                if (c(SidecarCompat.INSTANCE.c())) {
                    SidecarCompat sidecarCompat = new SidecarCompat(context);
                    if (sidecarCompat.n()) {
                        return sidecarCompat;
                    }
                    return null;
                }
            } catch (Throwable unused) {
            }
            return null;
        }

        public final boolean c(l sidecarVersion) {
            return sidecarVersion != null && sidecarVersion.compareTo(l.INSTANCE.a()) >= 0;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: androidx.window.layout.adapter.sidecar.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$b;", "Landroidx/window/layout/adapter/sidecar/a$a;", "<init>", "(Landroidx/window/layout/adapter/sidecar/b;)V", "Landroid/app/Activity;", "activity", "Lob/u;", "newLayout", "Loq/i0;", "a", "(Landroid/app/Activity;Lob/u;)V", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public final class C0292b implements a.InterfaceC0291a {
        public C0292b() {
        }

        @Override // androidx.window.layout.adapter.sidecar.a.InterfaceC0291a
        public void a(Activity activity, u newLayout) {
            for (c cVar : b.this.g()) {
                if (t.c(cVar.getActivity(), activity)) {
                    cVar.b(newLayout);
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0000\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0007¢\u0006\u0004\b\r\u0010\u000eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0013R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R$\u0010\u001c\u001a\u0004\u0018\u00010\u00078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0011\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u000e¨\u0006\u001d"}, d2 = {"Landroidx/window/layout/adapter/sidecar/b$c;", "", "Landroid/app/Activity;", "activity", "Ljava/util/concurrent/Executor;", "executor", "Li6/a;", "Lob/u;", "callback", "<init>", "(Landroid/app/Activity;Ljava/util/concurrent/Executor;Li6/a;)V", "newLayoutInfo", "Loq/i0;", "b", "(Lob/u;)V", "a", "Landroid/app/Activity;", "d", "()Landroid/app/Activity;", "Ljava/util/concurrent/Executor;", "c", "Li6/a;", "e", "()Li6/a;", "Lob/u;", "f", "()Lob/u;", "setLastInfo", "lastInfo", "window_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Activity activity;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final Executor executor;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final i6.a<u> callback;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private u lastInfo;

        public c(Activity activity, Executor executor, i6.a<u> aVar) {
            this.activity = activity;
            this.executor = executor;
            this.callback = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(c cVar, u uVar) {
            cVar.callback.accept(uVar);
        }

        public final void b(final u newLayoutInfo) {
            this.lastInfo = newLayoutInfo;
            this.executor.execute(new Runnable() { // from class: rb.g
                @Override // java.lang.Runnable
                public final void run() {
                    androidx.window.layout.adapter.sidecar.b.c.c(this.f172842a, newLayoutInfo);
                }
            });
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final Activity getActivity() {
            return this.activity;
        }

        public final i6.a<u> e() {
            return this.callback;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final u getLastInfo() {
            return this.lastInfo;
        }
    }

    public b(a aVar) {
        this.windowExtension = aVar;
        a aVar2 = this.windowExtension;
        if (aVar2 != null) {
            aVar2.a(new C0292b());
        }
    }

    private final void f(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList == null || !copyOnWriteArrayList.isEmpty()) {
            Iterator<T> it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                if (t.c(((c) it.next()).getActivity(), activity)) {
                    return;
                }
            }
        }
        a aVar = this.windowExtension;
        if (aVar != null) {
            aVar.c(activity);
        }
    }

    private final boolean h(Activity activity) {
        CopyOnWriteArrayList<c> copyOnWriteArrayList = this.windowLayoutChangeCallbacks;
        if (copyOnWriteArrayList != null && copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        Iterator<T> it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            if (t.c(((c) it.next()).getActivity(), activity)) {
                return true;
            }
        }
        return false;
    }

    @Override // pb.a
    public void a(i6.a<u> callback) {
        synchronized (f13748e) {
            try {
                if (this.windowExtension == null) {
                    return;
                }
                ArrayList arrayList = new ArrayList();
                for (c cVar : this.windowLayoutChangeCallbacks) {
                    if (cVar.e() == callback) {
                        arrayList.add(cVar);
                    }
                }
                this.windowLayoutChangeCallbacks.removeAll(arrayList);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    f(((c) it.next()).getActivity());
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // pb.a
    public void b(Context context, Executor executor, i6.a<u> callback) {
        Object next;
        Activity activity = context instanceof Activity ? (Activity) context : null;
        if (activity == null) {
            callback.accept(new u(v.n()));
            return;
        }
        ReentrantLock reentrantLock = f13748e;
        reentrantLock.lock();
        try {
            a aVar = this.windowExtension;
            if (aVar == null) {
                callback.accept(new u(v.n()));
                return;
            }
            boolean zH = h(activity);
            c cVar = new c(activity, executor, callback);
            this.windowLayoutChangeCallbacks.add(cVar);
            if (zH) {
                Iterator<T> it = this.windowLayoutChangeCallbacks.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!t.c(activity, ((c) next).getActivity()));
                c cVar2 = (c) next;
                u lastInfo = cVar2 != null ? cVar2.getLastInfo() : null;
                if (lastInfo != null) {
                    cVar.b(lastInfo);
                }
            } else {
                aVar.b(activity);
            }
            i0 i0Var = i0.f148189a;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final CopyOnWriteArrayList<c> g() {
        return this.windowLayoutChangeCallbacks;
    }
}
