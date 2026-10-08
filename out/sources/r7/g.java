package r7;

import CON.j0;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\t\b\u0016¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0007¢\u0006\u0004\b\n\u0010\u0003J!\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000b2\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u000f\u0010\tJ%\u0010\u0011\u001a\u0004\u0018\u00018\u0000\"\f\b\u0000\u0010\u0010*\u00060\u0004j\u0002`\u00052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u000b\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001e\u0010\u001e\u001a\f\u0012\b\u0012\u00060\u0004j\u0002`\u00050\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0016\u0010!\u001a\u00020\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010 ¨\u0006\""}, d2 = {"Lr7/g;", "", "<init>", "()V", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "Loq/i0;", "g", "(Ljava/lang/AutoCloseable;)V", "f", "", "key", "e", "(Ljava/lang/String;Ljava/lang/AutoCloseable;)V", "d", "T", "h", "(Ljava/lang/String;)Ljava/lang/AutoCloseable;", "Lr7/f;", "a", "Lr7/f;", "lock", "", "b", "Ljava/util/Map;", "keyToCloseables", "", "c", "Ljava/util/Set;", "closeables", "", "Z", "isCleared", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f lock = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Map<String, AutoCloseable> keyToCloseables = new LinkedHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Set<AutoCloseable> closeables = new LinkedHashSet();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private volatile boolean isCleared;

    /* JADX INFO: Access modifiers changed from: private */
    public final void g(AutoCloseable closeable) {
        if (closeable != null) {
            try {
                j0.a(closeable);
            } catch (Exception e15) {
                throw new RuntimeException(e15);
            }
        }
    }

    public final void d(AutoCloseable closeable) {
        if (this.isCleared) {
            g(closeable);
            return;
        }
        synchronized (this.lock) {
            this.closeables.add(closeable);
            i0 i0Var = i0.f148189a;
        }
    }

    public final void e(String key, AutoCloseable closeable) {
        AutoCloseable autoCloseable;
        if (this.isCleared) {
            g(closeable);
            return;
        }
        synchronized (this.lock) {
            autoCloseable = (AutoCloseable) this.keyToCloseables.put(key, closeable);
        }
        g(autoCloseable);
    }

    public final void f() {
        if (this.isCleared) {
            return;
        }
        this.isCleared = true;
        synchronized (this.lock) {
            try {
                Iterator it = this.keyToCloseables.values().iterator();
                while (it.hasNext()) {
                    g((AutoCloseable) it.next());
                }
                Iterator it4 = this.closeables.iterator();
                while (it4.hasNext()) {
                    g((AutoCloseable) it4.next());
                }
                this.closeables.clear();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    public final <T extends AutoCloseable> T h(String key) {
        T t15;
        synchronized (this.lock) {
            t15 = (T) this.keyToCloseables.get(key);
        }
        return t15;
    }
}
