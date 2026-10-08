package s7;

import android.content.Context;
import android.os.Handler;
import android.os.SystemClock;
import e6.k;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes3.dex */
public abstract class a<D> extends b<D> {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Executor f178554i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    volatile a<D>.RunnableC4579a f178555j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    volatile a<D>.RunnableC4579a f178556k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    long f178557l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    long f178558m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    Handler f178559n;

    /* JADX INFO: renamed from: s7.a$a, reason: collision with other inner class name */
    final class RunnableC4579a extends c<Void, Void, D> implements Runnable {

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private final CountDownLatch f178560l = new CountDownLatch(1);

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        boolean f178561m;

        RunnableC4579a() {
        }

        @Override // s7.c
        protected void h(D d15) {
            try {
                a.this.y(this, d15);
            } finally {
                this.f178560l.countDown();
            }
        }

        @Override // s7.c
        protected void i(D d15) {
            try {
                a.this.z(this, d15);
            } finally {
                this.f178560l.countDown();
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // s7.c
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public D b(Void... voidArr) {
            try {
                return (D) a.this.D();
            } catch (k e15) {
                if (f()) {
                    return null;
                }
                throw e15;
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f178561m = false;
            a.this.A();
        }
    }

    public a(Context context) {
        this(context, c.f178573h);
    }

    void A() {
        if (this.f178556k != null || this.f178555j == null) {
            return;
        }
        if (this.f178555j.f178561m) {
            this.f178555j.f178561m = false;
            this.f178559n.removeCallbacks(this.f178555j);
        }
        if (this.f178557l <= 0 || SystemClock.uptimeMillis() >= this.f178558m + this.f178557l) {
            this.f178555j.c(this.f178554i, null);
        } else {
            this.f178555j.f178561m = true;
            this.f178559n.postAtTime(this.f178555j, this.f178558m + this.f178557l);
        }
    }

    public abstract D B();

    public void C(D d15) {
    }

    protected D D() {
        return B();
    }

    @Override // s7.b
    @Deprecated
    public void g(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        super.g(str, fileDescriptor, printWriter, strArr);
        if (this.f178555j != null) {
            printWriter.print(str);
            printWriter.print("mTask=");
            printWriter.print(this.f178555j);
            printWriter.print(" waiting=");
            printWriter.println(this.f178555j.f178561m);
        }
        if (this.f178556k != null) {
            printWriter.print(str);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.f178556k);
            printWriter.print(" waiting=");
            printWriter.println(this.f178556k.f178561m);
        }
        if (this.f178557l != 0) {
            printWriter.print(str);
            printWriter.print("mUpdateThrottle=");
            i6.k.c(this.f178557l, printWriter);
            printWriter.print(" mLastLoadCompleteTime=");
            i6.k.b(this.f178558m, SystemClock.uptimeMillis(), printWriter);
            printWriter.println();
        }
    }

    @Override // s7.b
    protected boolean l() {
        if (this.f178555j == null) {
            return false;
        }
        if (!this.f178566d) {
            this.f178569g = true;
        }
        if (this.f178556k != null) {
            if (this.f178555j.f178561m) {
                this.f178555j.f178561m = false;
                this.f178559n.removeCallbacks(this.f178555j);
            }
            this.f178555j = null;
            return false;
        }
        if (this.f178555j.f178561m) {
            this.f178555j.f178561m = false;
            this.f178559n.removeCallbacks(this.f178555j);
            this.f178555j = null;
            return false;
        }
        boolean zA = this.f178555j.a(false);
        if (zA) {
            this.f178556k = this.f178555j;
            x();
        }
        this.f178555j = null;
        return zA;
    }

    @Override // s7.b
    protected void n() {
        super.n();
        b();
        this.f178555j = new RunnableC4579a();
        A();
    }

    public void x() {
    }

    void y(a<D>.RunnableC4579a runnableC4579a, D d15) {
        C(d15);
        if (this.f178556k == runnableC4579a) {
            t();
            this.f178558m = SystemClock.uptimeMillis();
            this.f178556k = null;
            e();
            A();
        }
    }

    void z(a<D>.RunnableC4579a runnableC4579a, D d15) {
        if (this.f178555j != runnableC4579a) {
            y(runnableC4579a, d15);
            return;
        }
        if (j()) {
            C(d15);
            return;
        }
        c();
        this.f178558m = SystemClock.uptimeMillis();
        this.f178555j = null;
        f(d15);
    }

    private a(Context context, Executor executor) {
        super(context);
        this.f178558m = -10000L;
        this.f178554i = executor;
    }
}
