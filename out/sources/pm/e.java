package pm;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f160821a = new HashMap();

    protected abstract V a(K k15);

    public V b(K k15) {
        synchronized (this.f160821a) {
            try {
                if (this.f160821a.containsKey(k15)) {
                    return (V) this.f160821a.get(k15);
                }
                V vA = a(k15);
                this.f160821a.put(k15, vA);
                return vA;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }
}
