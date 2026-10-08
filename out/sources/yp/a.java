package yp;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final C6137a<T> f228355a = new C6137a<>();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f228356b;

    /* JADX INFO: renamed from: yp.a$a, reason: collision with other inner class name */
    static class C6137a<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Map<Byte, C6137a<T>> f228357a = new HashMap();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f228358b = null;

        C6137a() {
        }

        public T b() {
            return this.f228358b;
        }

        public void c(T t15) {
            if (this.f228358b != null) {
                throw new IllegalStateException("Value already set for this trie node");
            }
            this.f228358b = t15;
        }
    }

    a() {
    }

    public void a(T t15, byte[]... bArr) {
        C6137a<T> c6137a = this.f228355a;
        int i15 = 0;
        for (byte[] bArr2 : bArr) {
            for (byte b15 : bArr2) {
                C6137a<T> c6137a2 = (C6137a) ((C6137a) c6137a).f228357a.get(Byte.valueOf(b15));
                if (c6137a2 == null) {
                    c6137a2 = new C6137a<>();
                    ((C6137a) c6137a).f228357a.put(Byte.valueOf(b15), c6137a2);
                }
                c6137a = c6137a2;
                i15++;
            }
        }
        c6137a.c(t15);
        this.f228356b = Math.max(this.f228356b, i15);
    }

    public T b(byte[] bArr) {
        C6137a<T> c6137a = this.f228355a;
        T tB = c6137a.b();
        for (byte b15 : bArr) {
            c6137a = (C6137a) ((C6137a) c6137a).f228357a.get(Byte.valueOf(b15));
            if (c6137a == null) {
                break;
            }
            if (c6137a.b() != null) {
                tB = c6137a.b();
            }
        }
        return tB;
    }

    public void c(T t15) {
        this.f228355a.c(t15);
    }
}
