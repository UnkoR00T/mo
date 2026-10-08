package zj;

import java.io.Serializable;

/* JADX INFO: loaded from: classes4.dex */
public final class x {

    static class a<T> implements w<T>, Serializable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private transient Object f235442a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final w<T> f235443b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        volatile transient boolean f235444c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        transient T f235445d;

        a(w<T> wVar) {
            this.f235443b = (w) p.q(wVar);
        }

        @Override // zj.w
        public T get() {
            if (!this.f235444c) {
                synchronized (this.f235442a) {
                    try {
                        if (!this.f235444c) {
                            T t15 = this.f235443b.get();
                            this.f235445d = t15;
                            this.f235444c = true;
                            return t15;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            return (T) k.a(this.f235445d);
        }

        public String toString() {
            Object obj;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Suppliers.memoize(");
            if (this.f235444c) {
                obj = "<supplier that returned " + this.f235445d + ">";
            } else {
                obj = this.f235443b;
            }
            sb5.append(obj);
            sb5.append(")");
            return sb5.toString();
        }
    }

    static class b<T> implements w<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final w<Void> f235446d = new w() { // from class: zj.y
            @Override // zj.w
            public final Object get() {
                return x.b.a();
            }
        };

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f235447a = new Object();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private volatile w<T> f235448b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private T f235449c;

        b(w<T> wVar) {
            this.f235448b = (w) p.q(wVar);
        }

        public static /* synthetic */ Void a() {
            throw new IllegalStateException();
        }

        @Override // zj.w
        public T get() {
            w<T> wVar = this.f235448b;
            w<T> wVar2 = (w<T>) f235446d;
            if (wVar != wVar2) {
                synchronized (this.f235447a) {
                    try {
                        if (this.f235448b != wVar2) {
                            T t15 = this.f235448b.get();
                            this.f235449c = t15;
                            this.f235448b = wVar2;
                            return t15;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
            }
            return (T) k.a(this.f235449c);
        }

        public String toString() {
            Object obj = this.f235448b;
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Suppliers.memoize(");
            if (obj == f235446d) {
                obj = "<supplier that returned " + this.f235449c + ">";
            }
            sb5.append(obj);
            sb5.append(")");
            return sb5.toString();
        }
    }

    public static <T> w<T> a(w<T> wVar) {
        if ((wVar instanceof b) || (wVar instanceof a)) {
            return wVar;
        }
        return wVar instanceof Serializable ? new a(wVar) : new b(wVar);
    }
}
