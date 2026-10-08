package k8;

import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;
import y7.x;
import zj.p;

/* JADX INFO: loaded from: classes3.dex */
public interface d {

    public interface a {

        /* JADX INFO: renamed from: k8.d$a$a, reason: collision with other inner class name */
        public static final class C2597a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final CopyOnWriteArrayList<C2598a> f109053a = new CopyOnWriteArrayList<>();

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: k8.d$a$a$a, reason: collision with other inner class name */
            static final class C2598a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                private final Handler f109054a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                private final a f109055b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                private boolean f109056c;

                public C2598a(Handler handler, a aVar) {
                    this.f109054a = handler;
                    this.f109055b = aVar;
                }

                public void d() {
                    this.f109056c = true;
                }
            }

            public void b(Handler handler, a aVar) {
                p.q(handler);
                p.q(aVar);
                d(aVar);
                this.f109053a.add(new C2598a(handler, aVar));
            }

            public void c(int i15, long j15, long j16) {
                final int i16;
                final long j17;
                final long j18;
                for (final C2598a c2598a : this.f109053a) {
                    if (c2598a.f109056c) {
                        i16 = i15;
                        j17 = j15;
                        j18 = j16;
                    } else {
                        i16 = i15;
                        j17 = j15;
                        j18 = j16;
                        c2598a.f109054a.post(new Runnable() { // from class: k8.c
                            @Override // java.lang.Runnable
                            public final void run() {
                                c2598a.f109055b.O(i16, j17, j18);
                            }
                        });
                    }
                    i15 = i16;
                    j15 = j17;
                    j16 = j18;
                }
            }

            public void d(a aVar) {
                for (C2598a c2598a : this.f109053a) {
                    if (c2598a.f109055b == aVar) {
                        c2598a.d();
                        this.f109053a.remove(c2598a);
                    }
                }
            }
        }

        void O(int i15, long j15, long j16);
    }

    void a(a aVar);

    x d();

    void e(Handler handler, a aVar);
}
