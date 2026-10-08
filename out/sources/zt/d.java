package zt;

import java.util.Arrays;
import java.util.Iterator;

/* JADX INFO: loaded from: classes4.dex */
public final class d<T> extends c<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f237207c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Object[] f237208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f237209b;

    public static final class a {
        public /* synthetic */ a(fr.k kVar) {
            this();
        }

        private a() {
        }
    }

    public static final class b extends pq.c<T> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int f237210c = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ d<T> f237211d;

        b(d<T> dVar) {
            this.f237211d = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // pq.c
        protected void a() {
            do {
                int i15 = this.f237210c + 1;
                this.f237210c = i15;
                if (i15 >= ((d) this.f237211d).f237208a.length) {
                    break;
                }
            } while (((d) this.f237211d).f237208a[this.f237210c] == null);
            if (this.f237210c >= ((d) this.f237211d).f237208a.length) {
                c();
            } else {
                d(((d) this.f237211d).f237208a[this.f237210c]);
            }
        }
    }

    private d(Object[] objArr, int i15) {
        super(null);
        this.f237208a = objArr;
        this.f237209b = i15;
    }

    private final void h(int i15) {
        Object[] objArr = this.f237208a;
        if (objArr.length > i15) {
            return;
        }
        int length = objArr.length;
        do {
            length *= 2;
        } while (length <= i15);
        this.f237208a = Arrays.copyOf(this.f237208a, length);
    }

    @Override // zt.c
    public int e() {
        return this.f237209b;
    }

    @Override // zt.c
    public void f(int i15, T t15) {
        h(i15);
        if (this.f237208a[i15] == null) {
            this.f237209b = e() + 1;
        }
        this.f237208a[i15] = t15;
    }

    @Override // zt.c
    public T get(int i15) {
        return (T) pq.n.y0(this.f237208a, i15);
    }

    @Override // zt.c, java.lang.Iterable
    public Iterator<T> iterator() {
        return new b(this);
    }

    public d() {
        this(new Object[20], 0);
    }
}
