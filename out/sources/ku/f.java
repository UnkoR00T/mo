package ku;

import android.os.Handler;
import android.os.Looper;
import er.l;
import fr.k;
import fr.t;
import java.util.concurrent.CancellationException;
import ju.g1;
import ju.g2;
import ju.i1;
import ju.n;
import ju.q2;
import ju.y0;
import lr.m;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B#\b\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nB\u001d\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\u000bJ#\u0010\u0012\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u0016\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\f2\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000fH\u0016¢\u0006\u0004\b\u0016\u0010\u0013J%\u0010\u001b\u001a\u00020\u00112\u0006\u0010\u0018\u001a\u00020\u00172\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u0018\u001a\u00020\u00172\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0005H\u0016¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\u00072\b\u0010#\u001a\u0004\u0018\u00010\"H\u0096\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lku/f;", "Lku/g;", "Lju/y0;", "Landroid/os/Handler;", "handler", "", "name", "", "invokeImmediately", "<init>", "(Landroid/os/Handler;Ljava/lang/String;Z)V", "(Landroid/os/Handler;Ljava/lang/String;)V", "Ltq/i;", "context", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Loq/i0;", "A2", "(Ltq/i;Ljava/lang/Runnable;)V", "P1", "(Ltq/i;)Z", "F1", "", "timeMillis", "Lju/n;", "continuation", "E", "(JLju/n;)V", "Lju/i1;", "O0", "(JLjava/lang/Runnable;Ltq/i;)Lju/i1;", "toString", "()Ljava/lang/String;", "", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "c", "Landroid/os/Handler;", "d", "Ljava/lang/String;", "e", "Z", "f", "Lku/f;", "I2", "()Lku/f;", "immediate", "kotlinx-coroutines-android"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f extends g implements y0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Handler handler;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean invokeImmediately;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f immediate;

    private f(Handler handler, String str, boolean z15) {
        super(null);
        this.handler = handler;
        this.name = str;
        this.invokeImmediately = z15;
        this.immediate = z15 ? this : new f(handler, str, true);
    }

    private final void A2(tq.i context, Runnable block) {
        g2.d(context, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        g1.b().F1(context, block);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void N2(f fVar, Runnable runnable) {
        fVar.handler.removeCallbacks(runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void P2(n nVar, f fVar) {
        nVar.R(fVar, i0.f148189a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 Q2(f fVar, Runnable runnable, Throwable th4) {
        fVar.handler.removeCallbacks(runnable);
        return i0.f148189a;
    }

    @Override // ju.y0
    public void E(long timeMillis, final n<? super i0> continuation) {
        final Runnable runnable = new Runnable() { // from class: ku.c
            @Override // java.lang.Runnable
            public final void run() {
                f.P2(continuation, this);
            }
        };
        if (this.handler.postDelayed(runnable, m.k(timeMillis, 4611686018427387903L))) {
            continuation.E(new l() { // from class: ku.d
                @Override // er.l
                public final Object b(Object obj) {
                    return f.Q2(this.f112694a, runnable, (Throwable) obj);
                }
            });
        } else {
            A2(continuation.getContext(), runnable);
        }
    }

    @Override // ju.l0
    public void F1(tq.i context, Runnable block) {
        if (this.handler.post(block)) {
            return;
        }
        A2(context, block);
    }

    @Override // ku.g
    /* JADX INFO: renamed from: I2, reason: from getter and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public f j2() {
        return this.immediate;
    }

    @Override // ku.g, ju.y0
    public i1 O0(long timeMillis, final Runnable block, tq.i context) {
        if (this.handler.postDelayed(block, m.k(timeMillis, 4611686018427387903L))) {
            return new i1() { // from class: ku.e
                @Override // ju.i1
                public final void j() {
                    f.N2(this.f112696a, block);
                }
            };
        }
        A2(context, block);
        return q2.f105774a;
    }

    @Override // ju.l0
    public boolean P1(tq.i context) {
        return (this.invokeImmediately && t.c(Looper.myLooper(), this.handler.getLooper())) ? false : true;
    }

    public boolean equals(Object other) {
        if (!(other instanceof f)) {
            return false;
        }
        f fVar = (f) other;
        return fVar.handler == this.handler && fVar.invokeImmediately == this.invokeImmediately;
    }

    public int hashCode() {
        return System.identityHashCode(this.handler) ^ (this.invokeImmediately ? 1231 : 1237);
    }

    @Override // ju.n2, ju.l0
    /* JADX INFO: renamed from: toString */
    public String getName() {
        String strI2 = i2();
        if (strI2 != null) {
            return strI2;
        }
        String string = this.name;
        if (string == null) {
            string = this.handler.toString();
        }
        if (!this.invokeImmediately) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ f(Handler handler, String str, int i15, k kVar) {
        this(handler, (i15 & 2) != 0 ? null : str);
    }

    public f(Handler handler, String str) {
        this(handler, str, false);
    }
}
