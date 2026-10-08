package ve;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class h<T, Y> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map<T, a<Y>> f206286a = new LinkedHashMap(100, 0.75f, true);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final long f206287b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f206288c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f206289d;

    static final class a<Y> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Y f206290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final int f206291b;

        a(Y y15, int i15) {
            this.f206290a = y15;
            this.f206291b = i15;
        }
    }

    public h(long j15) {
        this.f206287b = j15;
        this.f206288c = j15;
    }

    private void f() {
        m(this.f206288c);
    }

    public void b() {
        m(0L);
    }

    public synchronized Y g(T t15) {
        a<Y> aVar;
        aVar = this.f206286a.get(t15);
        return aVar != null ? aVar.f206290a : null;
    }

    public synchronized long h() {
        return this.f206288c;
    }

    protected int i(Y y15) {
        return 1;
    }

    protected void j(T t15, Y y15) {
    }

    public synchronized Y k(T t15, Y y15) {
        int i15 = i(y15);
        long j15 = i15;
        if (j15 >= this.f206288c) {
            j(t15, y15);
            return null;
        }
        if (y15 != null) {
            this.f206289d += j15;
        }
        a<Y> aVarPut = this.f206286a.put(t15, y15 == null ? null : new a<>(y15, i15));
        if (aVarPut != null) {
            this.f206289d -= (long) aVarPut.f206291b;
            if (!aVarPut.f206290a.equals(y15)) {
                j(t15, aVarPut.f206290a);
            }
        }
        f();
        return aVarPut != null ? aVarPut.f206290a : null;
    }

    public synchronized Y l(T t15) {
        a<Y> aVarRemove = this.f206286a.remove(t15);
        if (aVarRemove == null) {
            return null;
        }
        this.f206289d -= (long) aVarRemove.f206291b;
        return aVarRemove.f206290a;
    }

    protected synchronized void m(long j15) {
        while (this.f206289d > j15) {
            Iterator<Map.Entry<T, a<Y>>> it = this.f206286a.entrySet().iterator();
            Map.Entry<T, a<Y>> next = it.next();
            a<Y> value = next.getValue();
            this.f206289d -= (long) value.f206291b;
            T key = next.getKey();
            it.remove();
            j(key, value.f206290a);
        }
    }
}
