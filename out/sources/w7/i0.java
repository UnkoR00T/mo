package w7;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
final class i0 implements p {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<b> f210687b = new ArrayList(50);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Handler f210688a;

    private static final class b implements p.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Message f210689a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private i0 f210690b;

        private b() {
        }

        private void b() {
            this.f210689a = null;
            this.f210690b = null;
            i0.q(this);
        }

        @Override // w7.p.a
        public void a() {
            ((Message) zj.p.q(this.f210689a)).sendToTarget();
            b();
        }

        public boolean c(Handler handler) {
            boolean zSendMessageAtFrontOfQueue = handler.sendMessageAtFrontOfQueue((Message) zj.p.q(this.f210689a));
            b();
            return zSendMessageAtFrontOfQueue;
        }

        public b d(Message message, i0 i0Var) {
            this.f210689a = message;
            this.f210690b = i0Var;
            return this;
        }
    }

    public i0(Handler handler) {
        this.f210688a = handler;
    }

    private static b p() {
        b bVar;
        List<b> list = f210687b;
        synchronized (list) {
            try {
                bVar = list.isEmpty() ? new b() : list.remove(list.size() - 1);
            } catch (Throwable th4) {
                throw th4;
            }
        }
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void q(b bVar) {
        List<b> list = f210687b;
        synchronized (list) {
            try {
                if (list.size() < 50) {
                    list.add(bVar);
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // w7.p
    public boolean a(int i15, int i16) {
        return this.f210688a.sendEmptyMessageDelayed(i15, i16);
    }

    @Override // w7.p
    public p.a b(int i15) {
        return p().d(this.f210688a.obtainMessage(i15), this);
    }

    @Override // w7.p
    public boolean c(int i15) {
        zj.p.d(i15 != 0);
        return this.f210688a.hasMessages(i15);
    }

    @Override // w7.p
    public p.a d(int i15, int i16, int i17, Object obj) {
        return p().d(this.f210688a.obtainMessage(i15, i16, i17, obj), this);
    }

    @Override // w7.p
    public p.a e(int i15, Object obj) {
        return p().d(this.f210688a.obtainMessage(i15, obj), this);
    }

    @Override // w7.p
    public void f(Object obj) {
        this.f210688a.removeCallbacksAndMessages(obj);
    }

    @Override // w7.p
    public Looper g() {
        return this.f210688a.getLooper();
    }

    @Override // w7.p
    public p.a h(int i15, int i16, int i17) {
        return p().d(this.f210688a.obtainMessage(i15, i16, i17), this);
    }

    @Override // w7.p
    public boolean i(p.a aVar) {
        return ((b) aVar).c(this.f210688a);
    }

    @Override // w7.p
    public boolean j(Runnable runnable) {
        return this.f210688a.post(runnable);
    }

    @Override // w7.p
    public boolean k(Runnable runnable, long j15) {
        return this.f210688a.postDelayed(runnable, j15);
    }

    @Override // w7.p
    public boolean l(int i15) {
        return this.f210688a.sendEmptyMessage(i15);
    }

    @Override // w7.p
    public boolean m(int i15, long j15) {
        return this.f210688a.sendEmptyMessageAtTime(i15, j15);
    }

    @Override // w7.p
    public void n(int i15) {
        zj.p.d(i15 != 0);
        this.f210688a.removeMessages(i15);
    }
}
