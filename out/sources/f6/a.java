package f6;

import android.graphics.Typeface;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g.c f59356a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Executor f59357b;

    /* JADX INFO: renamed from: f6.a$a, reason: collision with other inner class name */
    class RunnableC1332a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f59358a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Typeface f59359b;

        RunnableC1332a(g.c cVar, Typeface typeface) {
            this.f59358a = cVar;
            this.f59359b = typeface;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59358a.b(this.f59359b);
        }
    }

    class b implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g.c f59361a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f59362b;

        b(g.c cVar, int i15) {
            this.f59361a = cVar;
            this.f59362b = i15;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f59361a.a(this.f59362b);
        }
    }

    a(g.c cVar, Executor executor) {
        this.f59356a = cVar;
        this.f59357b = executor;
    }

    private void a(int i15) {
        this.f59357b.execute(new b(this.f59356a, i15));
    }

    private void c(Typeface typeface) {
        this.f59357b.execute(new RunnableC1332a(this.f59356a, typeface));
    }

    void b(f.e eVar) {
        if (eVar.a()) {
            c(eVar.f59392a);
        } else {
            a(eVar.f59393b);
        }
    }
}
