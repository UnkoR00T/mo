package ak;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* JADX INFO: loaded from: classes4.dex */
public abstract class e1<K0, V0> {

    class a extends e<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f6875a;

        a(int i15) {
            this.f6875a = i15;
        }

        @Override // ak.e1.e
        <K, V> Map<K, Collection<V>> c() {
            return p1.c(this.f6875a);
        }
    }

    class b extends e<K0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Comparator f6876a;

        b(Comparator comparator) {
            this.f6876a = comparator;
        }

        @Override // ak.e1.e
        <K extends K0, V> Map<K, Collection<V>> c() {
            return new TreeMap(this.f6876a);
        }
    }

    private static final class c<V> implements zj.w<List<V>>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f6877a;

        c(int i15) {
            this.f6877a = y.b(i15, "expectedValuesPerKey");
        }

        @Override // zj.w
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public List<V> get() {
            return new ArrayList(this.f6877a);
        }
    }

    public static abstract class d<K0, V0> extends e1<K0, V0> {
        d() {
            super(null);
        }

        public abstract <K extends K0, V extends V0> z0<K, V> e();
    }

    public static abstract class e<K0> {

        class a extends d<K0, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f6878a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e f6879b;

            a(e eVar, int i15) {
                this.f6878a = i15;
                this.f6879b = eVar;
            }

            @Override // ak.e1.d
            public <K extends K0, V> z0<K, V> e() {
                return f1.b(this.f6879b.c(), new c(this.f6878a));
            }
        }

        e() {
        }

        public d<K0, Object> a() {
            return b(2);
        }

        public d<K0, Object> b(int i15) {
            y.b(i15, "expectedValuesPerKey");
            return new a(this, i15);
        }

        abstract <K extends K0, V> Map<K, Collection<V>> c();
    }

    /* synthetic */ e1(a aVar) {
        this();
    }

    public static e<Object> a() {
        return b(8);
    }

    public static e<Object> b(int i15) {
        y.b(i15, "expectedKeys");
        return new a(i15);
    }

    public static e<Comparable> c() {
        return d(n1.d());
    }

    public static <K0> e<K0> d(Comparator<K0> comparator) {
        zj.p.q(comparator);
        return new b(comparator);
    }

    private e1() {
    }
}
