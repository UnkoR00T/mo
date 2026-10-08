package em;

import android.os.Handler;
import android.os.Looper;
import em.a.b;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import lh.c;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
public abstract class a<O, C extends b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected final c f51915a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map<String, C> f51916b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Map<O, C> f51917c = new HashMap();

    /* JADX INFO: renamed from: em.a$a, reason: collision with other inner class name */
    class RunnableC1228a implements Runnable {
        RunnableC1228a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.k();
        }
    }

    public class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Set<O> f51919a = new LinkedHashSet();

        public b() {
        }

        protected void a(O o15) {
            this.f51919a.add(o15);
            a.this.f51917c.put(o15, this);
        }

        public void b() {
            for (O o15 : this.f51919a) {
                a.this.j(o15);
                a.this.f51917c.remove(o15);
            }
            this.f51919a.clear();
        }

        protected boolean c(O o15) {
            if (!this.f51919a.remove(o15)) {
                return false;
            }
            a.this.f51917c.remove(o15);
            a.this.j(o15);
            return true;
        }
    }

    public a(c cVar) {
        this.f51915a = cVar;
        new Handler(Looper.getMainLooper()).post(new RunnableC1228a());
    }

    public boolean i(O o15) {
        C c15 = this.f51917c.get(o15);
        return c15 != null && c15.c(o15);
    }

    protected abstract void j(O o15);

    abstract void k();
}
