package bt;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class l extends m {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final q f21446e;

    static class b<K> implements Map.Entry<K, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map.Entry<K, l> f21447a;

        @Override // java.util.Map.Entry
        public K getKey() {
            return this.f21447a.getKey();
        }

        @Override // java.util.Map.Entry
        public Object getValue() {
            l value = this.f21447a.getValue();
            if (value == null) {
                return null;
            }
            return value.e();
        }

        @Override // java.util.Map.Entry
        public Object setValue(Object obj) {
            if (obj instanceof q) {
                return this.f21447a.getValue().d((q) obj);
            }
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }

        private b(Map.Entry<K, l> entry) {
            this.f21447a = entry;
        }
    }

    static class c<K> implements Iterator<Map.Entry<K, Object>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Iterator<Map.Entry<K, Object>> f21448a;

        public c(Iterator<Map.Entry<K, Object>> it) {
            this.f21448a = it;
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, Object> next() {
            Map.Entry<K, Object> next = this.f21448a.next();
            return next.getValue() instanceof l ? new b(next) : next;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21448a.hasNext();
        }

        @Override // java.util.Iterator
        public void remove() {
            this.f21448a.remove();
        }
    }

    public q e() {
        return c(this.f21446e);
    }

    public boolean equals(Object obj) {
        return e().equals(obj);
    }

    public int hashCode() {
        return e().hashCode();
    }

    public String toString() {
        return e().toString();
    }
}
