package ak;

import java.util.Comparator;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final d0 f6869a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final d0 f6870b = new b(-1);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final d0 f6871c = new b(1);

    class a extends d0 {
        a() {
            super(null);
        }

        @Override // ak.d0
        public d0 d(int i15, int i16) {
            return l(Integer.compare(i15, i16));
        }

        @Override // ak.d0
        public d0 e(long j15, long j16) {
            return l(Long.compare(j15, j16));
        }

        @Override // ak.d0
        public d0 f(Comparable<?> comparable, Comparable<?> comparable2) {
            return l(comparable.compareTo(comparable2));
        }

        @Override // ak.d0
        public <T> d0 g(T t15, T t16, Comparator<T> comparator) {
            return l(comparator.compare(t15, t16));
        }

        @Override // ak.d0
        public d0 h(boolean z15, boolean z16) {
            return l(Boolean.compare(z15, z16));
        }

        @Override // ak.d0
        public d0 i(boolean z15, boolean z16) {
            return l(Boolean.compare(z16, z15));
        }

        @Override // ak.d0
        public int j() {
            return 0;
        }

        d0 l(int i15) {
            if (i15 < 0) {
                return d0.f6870b;
            }
            return i15 > 0 ? d0.f6871c : d0.f6869a;
        }
    }

    private static final class b extends d0 {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f6872d;

        b(int i15) {
            super(null);
            this.f6872d = i15;
        }

        @Override // ak.d0
        public d0 d(int i15, int i16) {
            return this;
        }

        @Override // ak.d0
        public d0 e(long j15, long j16) {
            return this;
        }

        @Override // ak.d0
        public d0 f(Comparable<?> comparable, Comparable<?> comparable2) {
            return this;
        }

        @Override // ak.d0
        public <T> d0 g(T t15, T t16, Comparator<T> comparator) {
            return this;
        }

        @Override // ak.d0
        public d0 h(boolean z15, boolean z16) {
            return this;
        }

        @Override // ak.d0
        public d0 i(boolean z15, boolean z16) {
            return this;
        }

        @Override // ak.d0
        public int j() {
            return this.f6872d;
        }
    }

    /* synthetic */ d0(a aVar) {
        this();
    }

    public static d0 k() {
        return f6869a;
    }

    public abstract d0 d(int i15, int i16);

    public abstract d0 e(long j15, long j16);

    public abstract d0 f(Comparable<?> comparable, Comparable<?> comparable2);

    public abstract <T> d0 g(T t15, T t16, Comparator<T> comparator);

    public abstract d0 h(boolean z15, boolean z16);

    public abstract d0 i(boolean z15, boolean z16);

    public abstract int j();

    private d0() {
    }
}
