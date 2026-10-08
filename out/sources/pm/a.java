package pm;

import java.lang.ref.ReferenceQueue;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ReferenceQueue f160809a = new ReferenceQueue();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f160810b = Collections.synchronizedSet(new HashSet());

    /* JADX INFO: renamed from: pm.a$a, reason: collision with other inner class name */
    public interface InterfaceC3959a {
        void a();
    }

    private a() {
    }

    public static a a() {
        a aVar = new a();
        aVar.b(aVar, new Runnable() { // from class: pm.p
            @Override // java.lang.Runnable
            public final void run() {
            }
        });
        final ReferenceQueue referenceQueue = aVar.f160809a;
        final Set set = aVar.f160810b;
        Thread thread = new Thread(new Runnable() { // from class: pm.q
            @Override // java.lang.Runnable
            public final void run() {
                ReferenceQueue referenceQueue2 = referenceQueue;
                while (!set.isEmpty()) {
                    try {
                        ((s) referenceQueue2.remove()).a();
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }, "MlKitCleaner");
        thread.setDaemon(true);
        thread.start();
        return aVar;
    }

    public InterfaceC3959a b(Object obj, Runnable runnable) {
        s sVar = new s(obj, this.f160809a, this.f160810b, runnable, null);
        this.f160810b.add(sVar);
        return sVar;
    }
}
