package pa;

import er.l;
import fr.k;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import oq.g;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J5\u0010\u000f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0015\u001a\u00060\u0011j\u0002`\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0017¨\u0006\u001a"}, d2 = {"Lpa/b;", "", "", "filename", "", "useFileLock", "<init>", "(Ljava/lang/String;Z)V", "T", "Lkotlin/Function0;", "onLocked", "Lkotlin/Function1;", "", "", "onLockError", "b", "(Ler/a;Ler/l;)Ljava/lang/Object;", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "a", "Ljava/util/concurrent/locks/ReentrantLock;", "threadLock", "Lpa/c;", "Lpa/c;", "fileLock", "c", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final Map<String, ReentrantLock> f153786d = new LinkedHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ReentrantLock threadLock;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c fileLock;

    /* JADX INFO: renamed from: pa.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00060\u0001j\u0002`\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u001b\u0010\t\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\f\u0010\rR$\u0010\u000f\u001a\u0012\u0012\u0004\u0012\u00020\u0005\u0012\b\u0012\u00060\u0007j\u0002`\b0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lpa/b$a;", "", "Landroidx/room/concurrent/SynchronizedObject;", "<init>", "()V", "", "key", "Ljava/util/concurrent/locks/ReentrantLock;", "Landroidx/room/concurrent/ReentrantLock;", "d", "(Ljava/lang/String;)Ljava/util/concurrent/locks/ReentrantLock;", "Lpa/c;", "c", "(Ljava/lang/String;)Lpa/c;", "", "threadLocksMap", "Ljava/util/Map;", "room-runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final c c(String key) {
            return new c(key);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ReentrantLock d(String key) {
            ReentrantLock reentrantLock;
            synchronized (this) {
                try {
                    Map map = b.f153786d;
                    Object reentrantLock2 = map.get(key);
                    if (reentrantLock2 == null) {
                        reentrantLock2 = new ReentrantLock();
                        map.put(key, reentrantLock2);
                    }
                    reentrantLock = (ReentrantLock) reentrantLock2;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            return reentrantLock;
        }

        private Companion() {
        }
    }

    public b(String str, boolean z15) {
        Companion companion = INSTANCE;
        this.threadLock = companion.d(str);
        this.fileLock = z15 ? companion.c(str) : null;
    }

    public final <T> T b(er.a<? extends T> onLocked, l onLockError) {
        this.threadLock.lock();
        boolean z15 = false;
        try {
            c cVar = this.fileLock;
            if (cVar != null) {
                cVar.a();
            }
            z15 = true;
            try {
                T tA = onLocked.a();
                c cVar2 = this.fileLock;
                if (cVar2 != null) {
                    cVar2.b();
                }
                this.threadLock.unlock();
                return tA;
            } catch (Throwable th4) {
                c cVar3 = this.fileLock;
                if (cVar3 != null) {
                    cVar3.b();
                }
                throw th4;
            }
        } catch (Throwable th5) {
            try {
                if (z15) {
                    throw th5;
                }
                onLockError.b(th5);
                throw new g();
            } catch (Throwable th6) {
                this.threadLock.unlock();
                throw th6;
            }
        }
    }
}
