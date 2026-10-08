package p009PRn;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public class f1<K, V> extends g1<K, V> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final HashMap<K, g1.c<K, V>> f846e = new HashMap<>();

    public boolean contains(K k15) {
        return this.f846e.containsKey(k15);
    }

    @Override // p009PRn.g1
    protected g1.c<K, V> f(K k15) {
        return this.f846e.get(k15);
    }

    @Override // p009PRn.g1
    public V j(K k15, V v15) {
        g1.c<K, V> cVarF = f(k15);
        if (cVarF != null) {
            return cVarF.f852b;
        }
        this.f846e.put(k15, i(k15, v15));
        return null;
    }

    @Override // p009PRn.g1
    public V k(K k15) {
        V v15 = (V) super.k(k15);
        this.f846e.remove(k15);
        return v15;
    }

    public Map.Entry<K, V> l(K k15) {
        if (contains(k15)) {
            return this.f846e.get(k15).f854d;
        }
        return null;
    }
}
