package ha;

import ha.g;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0007\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tB\u0019\b\u0016\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00028\u00002\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000fH\u0007¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u0018\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u0018\u0010\u0017J\u0017\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0019\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\u001a\u0010\u0017J\u000f\u0010\u001b\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001b\u0010\rJ\u000f\u0010\u001c\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001c\u0010\rJ\u000f\u0010\u001d\u001a\u00020\u000bH\u0000¢\u0006\u0004\b\u001d\u0010\rJ\u000f\u0010\u001e\u001a\u00020\u000bH\u0015¢\u0006\u0004\b\u001e\u0010\rJ\u0017\u0010\u001f\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u001f\u0010\u0017J\u0017\u0010 \u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b \u0010\u0017J\u0017\u0010!\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b!\u0010\u0017J\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0015¢\u0006\u0004\b\"\u0010\u0017J\u000f\u0010#\u001a\u00020\u000bH\u0000¢\u0006\u0004\b#\u0010\rJ\u000f\u0010$\u001a\u00020\u000bH\u0015¢\u0006\u0004\b$\u0010\rJ\u000f\u0010%\u001a\u00020\u000bH\u0000¢\u0006\u0004\b%\u0010\rJ\u000f\u0010&\u001a\u00020\u000bH\u0015¢\u0006\u0004\b&\u0010\rR$\u0010\u000e\u001a\u00028\u00002\u0006\u0010'\u001a\u00028\u00008\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001d\u0010(\u001a\u0004\b)\u0010*R0\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b,\u0010-R0\u0010\u0011\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f2\f\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\u000f8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b.\u0010-R$\u00103\u001a\u00020/2\u0006\u0010'\u001a\u00020/8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0016\u00100\u001a\u0004\b1\u00102R*\u0010\u0006\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b%\u00104\u001a\u0004\b5\u00106\"\u0004\b7\u00108R*\u0010\u0007\u001a\u00020\u00052\u0006\u0010'\u001a\u00020\u00058F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b#\u00104\u001a\u0004\b9\u00106\"\u0004\b:\u00108R$\u0010A\u001a\u0004\u0018\u00010;8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b!\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lha/e;", "Lha/g;", "T", "", "initialInfo", "", "isBackEnabled", "isForwardEnabled", "<init>", "(Lha/g;ZZ)V", "(Lha/g;Z)V", "Loq/i0;", "x", "()V", "currentInfo", "", "backInfo", "forwardInfo", "B", "(Lha/g;Ljava/util/List;Ljava/util/List;)V", "Lha/b;", "event", "d", "(Lha/b;)V", "s", "c", "r", "b", "q", "a", "p", "h", "w", "g", "v", "f", "u", "e", "t", "value", "Lha/g;", "j", "()Lha/g;", "Ljava/util/List;", "i", "()Ljava/util/List;", "l", "Lha/j;", "Lha/j;", "m", "()Lha/j;", "transitionState", "Z", "n", "()Z", "y", "(Z)V", "o", "A", "Lha/c;", "Lha/c;", "k", "()Lha/c;", "z", "(Lha/c;)V", "dispatcher", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class e<T extends g> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private T currentInfo;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private List<? extends T> backInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private List<? extends T> forwardInfo;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private j transitionState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isBackEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isForwardEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private c dispatcher;

    public e(T t15, boolean z15, boolean z16) {
        this.currentInfo = t15;
        this.backInfo = v.n();
        this.forwardInfo = v.n();
        this.transitionState = j.b.f82266b;
        this.isBackEnabled = z15;
        this.isForwardEnabled = z16;
    }

    public final void A(boolean z15) {
        i sharedProcessor;
        if (this.isForwardEnabled == z15) {
            return;
        }
        this.isForwardEnabled = z15;
        c cVar = this.dispatcher;
        if (cVar == null || (sharedProcessor = cVar.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.g();
    }

    public final void B(T currentInfo, List<? extends T> backInfo, List<? extends T> forwardInfo) {
        i sharedProcessor;
        this.currentInfo = currentInfo;
        this.backInfo = backInfo;
        this.forwardInfo = forwardInfo;
        c cVar = this.dispatcher;
        if (cVar == null || (sharedProcessor = cVar.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.l(this);
    }

    public final void a() {
        this.transitionState = j.b.f82266b;
        p();
    }

    public final void b() {
        this.transitionState = j.b.f82266b;
        q();
    }

    public final void c(NavigationEvent event) {
        this.transitionState = new j.InProgress(event, -1);
        r(event);
    }

    public final void d(NavigationEvent event) {
        this.transitionState = new j.InProgress(event, -1);
        s(event);
    }

    public final void e() {
        this.transitionState = j.b.f82266b;
        t();
    }

    public final void f() {
        this.transitionState = j.b.f82266b;
        u();
    }

    public final void g(NavigationEvent event) {
        this.transitionState = new j.InProgress(event, 1);
        v(event);
    }

    public final void h(NavigationEvent event) {
        this.transitionState = new j.InProgress(event, 1);
        w(event);
    }

    public final List<T> i() {
        return this.backInfo;
    }

    public final T j() {
        return this.currentInfo;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final c getDispatcher() {
        return this.dispatcher;
    }

    public final List<T> l() {
        return this.forwardInfo;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final j getTransitionState() {
        return this.transitionState;
    }

    public final boolean n() {
        c cVar = this.dispatcher;
        if (cVar == null || cVar.l()) {
            return this.isBackEnabled;
        }
        return false;
    }

    public final boolean o() {
        c cVar = this.dispatcher;
        if (cVar == null || cVar.l()) {
            return this.isForwardEnabled;
        }
        return false;
    }

    protected void p() {
    }

    protected void q() {
        throw new UnsupportedOperationException("A handler that receives a 'backCompleted' event must override 'onBackCompleted()' to handle the callback.");
    }

    protected void r(NavigationEvent event) {
    }

    protected void s(NavigationEvent event) {
    }

    protected void t() {
    }

    protected void u() {
        throw new UnsupportedOperationException("A handler that receives a 'forwardCompleted' event must override 'onForwardCompleted()' to handle the callback.");
    }

    protected void v(NavigationEvent event) {
    }

    protected void w(NavigationEvent event) {
    }

    public final void x() {
        c cVar = this.dispatcher;
        if (cVar != null) {
            cVar.m(this);
        }
    }

    public final void y(boolean z15) {
        i sharedProcessor;
        if (this.isBackEnabled == z15) {
            return;
        }
        this.isBackEnabled = z15;
        c cVar = this.dispatcher;
        if (cVar == null || (sharedProcessor = cVar.getSharedProcessor()) == null) {
            return;
        }
        sharedProcessor.g();
    }

    public final void z(c cVar) {
        this.dispatcher = cVar;
    }

    public e(T t15, boolean z15) {
        this(t15, z15, false);
    }
}
