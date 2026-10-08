package fe;

import java.util.Queue;

/* JADX INFO: loaded from: classes3.dex */
public class n<A, B> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ve.h<b<A>, B> f61669a;

    class a extends ve.h<b<A>, B> {
        a(long j15) {
            super(j15);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // ve.h
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b<A> bVar, B b15) {
            bVar.c();
        }
    }

    static final class b<A> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final Queue<b<?>> f61671d = ve.l.f(0);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f61672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f61673b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private A f61674c;

        private b() {
        }

        static <A> b<A> a(A a15, int i15, int i16) {
            b<A> bVar;
            Queue<b<?>> queue = f61671d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b<>();
            }
            bVar.b(a15, i15, i16);
            return bVar;
        }

        private void b(A a15, int i15, int i16) {
            this.f61674c = a15;
            this.f61673b = i15;
            this.f61672a = i16;
        }

        public void c() {
            Queue<b<?>> queue = f61671d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (obj instanceof b) {
                b bVar = (b) obj;
                if (this.f61673b == bVar.f61673b && this.f61672a == bVar.f61672a && this.f61674c.equals(bVar.f61674c)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (((this.f61672a * 31) + this.f61673b) * 31) + this.f61674c.hashCode();
        }
    }

    public n(long j15) {
        this.f61669a = new a(j15);
    }

    public B a(A a15, int i15, int i16) {
        b<A> bVarA = b.a(a15, i15, i16);
        B bG = this.f61669a.g(bVarA);
        bVarA.c();
        return bG;
    }

    public void b(A a15, int i15, int i16, B b15) {
        this.f61669a.k(b.a(a15, i15, i16), b15);
    }
}
