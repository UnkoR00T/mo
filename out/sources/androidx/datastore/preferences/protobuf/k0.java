package androidx.datastore.preferences.protobuf;

/* JADX INFO: loaded from: classes3.dex */
public class k0<K, V> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final a<K, V> f12034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final K f12035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final V f12036c;

    static class a<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final s1.b f12037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final K f12038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final s1.b f12039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final V f12040d;

        public a(s1.b bVar, K k15, s1.b bVar2, V v15) {
            this.f12037a = bVar;
            this.f12038b = k15;
            this.f12039c = bVar2;
            this.f12040d = v15;
        }
    }

    private k0(s1.b bVar, K k15, s1.b bVar2, V v15) {
        this.f12034a = new a<>(bVar, k15, bVar2, v15);
        this.f12035b = k15;
        this.f12036c = v15;
    }

    static <K, V> int b(a<K, V> aVar, K k15, V v15) {
        return t.d(aVar.f12037a, 1, k15) + t.d(aVar.f12039c, 2, v15);
    }

    public static <K, V> k0<K, V> d(s1.b bVar, K k15, s1.b bVar2, V v15) {
        return new k0<>(bVar, k15, bVar2, v15);
    }

    static <K, V> void e(j jVar, a<K, V> aVar, K k15, V v15) {
        t.A(jVar, aVar.f12037a, 1, k15);
        t.A(jVar, aVar.f12039c, 2, v15);
    }

    public int a(int i15, K k15, V v15) {
        return j.U(i15) + j.C(b(this.f12034a, k15, v15));
    }

    a<K, V> c() {
        return this.f12034a;
    }
}
