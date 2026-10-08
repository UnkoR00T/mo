package rt;

import oq.i0;

/* JADX INFO: loaded from: classes4.dex */
public interface k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f175980a = a.f175981a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f175981a = new a();

        private a() {
        }

        public final d a(Runnable runnable, er.l<? super InterruptedException, i0> lVar) {
            return (runnable == null || lVar == null) ? new d(null, 1, null) : new c(runnable, lVar);
        }
    }

    void lock();

    void unlock();
}
