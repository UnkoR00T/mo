package ku;

import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import ju.g1;
import ju.n;
import ju.p;
import oq.t;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u001a\u001f\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001b\u0010\t\u001a\u00020\u0000*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0001¢\u0006\u0004\b\t\u0010\n\u001a\u0010\u0010\f\u001a\u00020\u000bH\u0086@¢\u0006\u0004\b\f\u0010\r\u001a\u0010\u0010\u000e\u001a\u00020\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\r\u001a\u001d\u0010\u0012\u001a\u00020\u00112\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a%\u0010\u0016\u001a\u00020\u00112\u0006\u0010\u0015\u001a\u00020\u00142\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017\"\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u0012\u0004\b\u001a\u0010\u001b\"\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroid/os/Handler;", "", "name", "Lku/g;", "g", "(Landroid/os/Handler;Ljava/lang/String;)Lku/g;", "Landroid/os/Looper;", "", "async", "d", "(Landroid/os/Looper;Z)Landroid/os/Handler;", "", "e", "(Ltq/e;)Ljava/lang/Object;", "f", "Lju/n;", "cont", "Loq/i0;", "j", "(Lju/n;)V", "Landroid/view/Choreographer;", "choreographer", "h", "(Landroid/view/Choreographer;Lju/n;)V", "a", "Lku/g;", "getMain$annotations", "()V", "Main", "Landroid/view/Choreographer;", "kotlinx-coroutines-android"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g f112703a;
    private static volatile Choreographer choreographer;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<Long> f112704a;

        /* JADX WARN: Multi-variable type inference failed */
        a(n<? super Long> nVar) {
            this.f112704a = nVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            i.j(this.f112704a);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Object objB;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        try {
            t.Companion companion = t.INSTANCE;
            objB = t.b(new f(d(Looper.getMainLooper(), true), objArr2 == true ? 1 : 0, 2, objArr == true ? 1 : 0));
        } catch (Throwable th4) {
            t.Companion companion2 = t.INSTANCE;
            objB = t.b(u.a(th4));
        }
        f112703a = (g) (t.f(objB) ? null : objB);
    }

    public static final Handler d(Looper looper, boolean z15) {
        if (!z15) {
            return new Handler(looper);
        }
        if (Build.VERSION.SDK_INT >= 28) {
            return (Handler) Handler.class.getDeclaredMethod("createAsync", Looper.class).invoke(null, looper);
        }
        try {
            return (Handler) Handler.class.getDeclaredConstructor(Looper.class, Handler.Callback.class, Boolean.TYPE).newInstance(looper, null, Boolean.TRUE);
        } catch (NoSuchMethodException unused) {
            return new Handler(looper);
        }
    }

    public static final Object e(tq.e<? super Long> eVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            return f(eVar);
        }
        p pVar = new p(uq.b.c(eVar), 1);
        pVar.D();
        h(choreographer2, pVar);
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    private static final Object f(tq.e<? super Long> eVar) {
        p pVar = new p(uq.b.c(eVar), 1);
        pVar.D();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            j(pVar);
        } else {
            g1.c().F1(pVar.getContext(), new a(pVar));
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    public static final g g(Handler handler, String str) {
        return new f(handler, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h(Choreographer choreographer2, final n<? super Long> nVar) {
        choreographer2.postFrameCallback(new Choreographer.FrameCallback() { // from class: ku.h
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j15) {
                i.i(nVar, j15);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(n nVar, long j15) {
        nVar.R(g1.c(), Long.valueOf(j15));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j(n<? super Long> nVar) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 == null) {
            choreographer2 = Choreographer.getInstance();
            choreographer = choreographer2;
        }
        h(choreographer2, nVar);
    }
}
