package j6;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Runnable f99728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final CopyOnWriteArrayList<r> f99729b = new CopyOnWriteArrayList<>();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map<r, a> f99730c = new HashMap();

    private static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final androidx.p016lifecycle.j f99731a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private androidx.p016lifecycle.n f99732b;

        void a() {
            this.f99731a.d(this.f99732b);
            this.f99732b = null;
        }
    }

    public p(Runnable runnable) {
        this.f99728a = runnable;
    }

    public void a(r rVar) {
        this.f99729b.add(rVar);
        this.f99728a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator<r> it = this.f99729b.iterator();
        while (it.hasNext()) {
            it.next().d(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator<r> it = this.f99729b.iterator();
        while (it.hasNext()) {
            it.next().a(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator<r> it = this.f99729b.iterator();
        while (it.hasNext()) {
            if (it.next().c(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator<r> it = this.f99729b.iterator();
        while (it.hasNext()) {
            it.next().b(menu);
        }
    }

    public void f(r rVar) {
        this.f99729b.remove(rVar);
        a aVarRemove = this.f99730c.remove(rVar);
        if (aVarRemove != null) {
            aVarRemove.a();
        }
        this.f99728a.run();
    }
}
