package v2;

import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0004B+\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00028\u0000\u0012\u0006\u0010\b\u001a\u00028\u0001¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00028\u00012\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\f\u0010\rR \u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\"\u0010\b\u001a\u00028\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lv2/c;", "K", "V", "Lv2/b;", "", "Lv2/i;", "parentIterator", "key", "value", "<init>", "(Lv2/i;Ljava/lang/Object;Ljava/lang/Object;)V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "c", "Lv2/i;", "d", "Ljava/lang/Object;", "getValue", "()Ljava/lang/Object;", "a", "(Ljava/lang/Object;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class c<K, V> extends b<K, V> implements Map.Entry<K, V>, gr.e.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i<K, V> parentIterator;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private V value;

    public c(i<K, V> iVar, K k15, V v15) {
        super(k15, v15);
        this.parentIterator = iVar;
        this.value = v15;
    }

    public void a(V v15) {
        this.value = v15;
    }

    @Override // v2.b, java.util.Map.Entry
    public V getValue() {
        return this.value;
    }

    @Override // v2.b, java.util.Map.Entry
    public V setValue(V newValue) {
        V value = getValue();
        a(newValue);
        this.parentIterator.c(getKey(), newValue);
        return value;
    }
}
