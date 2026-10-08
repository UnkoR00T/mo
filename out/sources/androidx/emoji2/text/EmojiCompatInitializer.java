package androidx.emoji2.text;

import android.content.Context;
import androidx.p016lifecycle.DefaultLifecycleObserver;
import androidx.p016lifecycle.ProcessLifecycleInitializer;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: classes3.dex */
public class EmojiCompatInitializer implements db.a<Boolean> {

    class a implements DefaultLifecycleObserver {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.j f12233a;

        a(androidx.p016lifecycle.j jVar) {
            this.f12233a = jVar;
        }

        @Override // androidx.p016lifecycle.DefaultLifecycleObserver
        public void onResume(androidx.p016lifecycle.q qVar) {
            EmojiCompatInitializer.this.e();
            this.f12233a.d(this);
        }
    }

    static class b extends e.c {
        protected b(Context context) {
            super(new c(context));
            b(1);
        }
    }

    static class c implements e.h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Context f12235a;

        class a extends e.i {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e.i f12236a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ ThreadPoolExecutor f12237b;

            a(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
                this.f12236a = iVar;
                this.f12237b = threadPoolExecutor;
            }

            @Override // androidx.emoji2.text.e.i
            public void a(Throwable th4) {
                try {
                    this.f12236a.a(th4);
                } finally {
                    this.f12237b.shutdown();
                }
            }

            @Override // androidx.emoji2.text.e.i
            public void b(m mVar) {
                try {
                    this.f12236a.b(mVar);
                } finally {
                    this.f12237b.shutdown();
                }
            }
        }

        c(Context context) {
            this.f12235a = context.getApplicationContext();
        }

        @Override // androidx.emoji2.text.e.h
        public void a(final e.i iVar) {
            final ThreadPoolExecutor threadPoolExecutorB = androidx.emoji2.text.b.b("EmojiCompatInitializer");
            threadPoolExecutorB.execute(new Runnable() { // from class: androidx.emoji2.text.f
                @Override // java.lang.Runnable
                public final void run() {
                    this.f12277a.c(iVar, threadPoolExecutorB);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public void c(e.i iVar, ThreadPoolExecutor threadPoolExecutor) {
            try {
                j jVarA = androidx.emoji2.text.c.a(this.f12235a);
                if (jVarA == null) {
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                }
                jVarA.c(threadPoolExecutor);
                jVarA.a().a(new a(iVar, threadPoolExecutor));
            } catch (Throwable th4) {
                iVar.a(th4);
                threadPoolExecutor.shutdown();
            }
        }
    }

    static class d implements Runnable {
        d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                e6.l.a("EmojiCompat.EmojiCompatInitializer.run");
                if (e.k()) {
                    e.c().n();
                }
            } finally {
                e6.l.b();
            }
        }
    }

    @Override // db.a
    public List<Class<? extends db.a<?>>> a() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // db.a
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public Boolean b(Context context) {
        e.j(new b(context));
        d(context);
        return Boolean.TRUE;
    }

    void d(Context context) {
        androidx.p016lifecycle.j lifecycleRegistry = ((androidx.p016lifecycle.q) androidx.startup.a.e(context).f(ProcessLifecycleInitializer.class)).getLifecycleRegistry();
        lifecycleRegistry.a(new a(lifecycleRegistry));
    }

    void e() {
        androidx.emoji2.text.b.c().postDelayed(new d(), 500L);
    }
}
