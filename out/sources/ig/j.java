package ig;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public final class j<L> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f92213a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile a f92214b;

    public static final class a<L> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Object f92215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f92216b;

        a(L l15, String str) {
            this.f92215a = l15;
            this.f92216b = str;
        }

        public String a() {
            int iIdentityHashCode = System.identityHashCode(this.f92215a);
            String str = this.f92216b;
            StringBuilder sb5 = new StringBuilder(String.valueOf(str).length() + 1 + String.valueOf(iIdentityHashCode).length());
            sb5.append(str);
            sb5.append("@");
            sb5.append(iIdentityHashCode);
            return sb5.toString();
        }

        final /* synthetic */ Object b() {
            return this.f92215a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f92215a == aVar.f92215a && this.f92216b.equals(aVar.f92216b);
        }

        public int hashCode() {
            return (System.identityHashCode(this.f92215a) * 31) + this.f92216b.hashCode();
        }
    }

    public interface b<L> {
        void a(L l15);

        void b();
    }

    j(Looper looper, L l15, String str) {
        this.f92213a = new pg.a(looper);
        this.f92214b = new a(jg.s.m(l15, "Listener must not be null"), jg.s.f(str));
    }

    public void a() {
        this.f92214b = null;
    }

    public a<L> b() {
        return this.f92214b;
    }

    public void c(final b<? super L> bVar) {
        jg.s.m(bVar, "Notifier must not be null");
        this.f92213a.execute(new Runnable() { // from class: ig.n0
            @Override // java.lang.Runnable
            public final /* synthetic */ void run() {
                this.f92235a.d(bVar);
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    final /* synthetic */ void d(b bVar) {
        a aVar = this.f92214b;
        if (aVar == null) {
            bVar.b();
            return;
        }
        try {
            bVar.a(aVar.b());
        } catch (RuntimeException e15) {
            bVar.b();
            throw e15;
        }
    }

    j(Executor executor, L l15, String str) {
        this.f92213a = (Executor) jg.s.m(executor, "Executor must not be null");
        this.f92214b = new a(jg.s.m(l15, "Listener must not be null"), jg.s.f(str));
    }
}
