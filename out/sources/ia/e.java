package ia;

import ha.NavigationEvent;
import ha.g;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0002\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003B%\u0012\u0006\u0010\u0004\u001a\u00028\u0000\u0012\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0013\u0010\u000eJ\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0015\u0010\u0011J\u000f\u0010\u0016\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0016\u0010\u0011R \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R(\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR(\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001d\"\u0004\b#\u0010\u001fR(\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001d\"\u0004\b'\u0010\u001fR(\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00070\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b)\u0010\u001b\u001a\u0004\b*\u0010\u001d\"\u0004\b+\u0010\u001f¨\u0006-"}, d2 = {"Lia/e;", "Lha/g;", "T", "Lha/e;", "initialInfo", "Lkotlin/Function1;", "Lha/j;", "Loq/i0;", "onTransitionStateChanged", "<init>", "(Lha/g;Ler/l;)V", "Lha/b;", "event", "w", "(Lha/b;)V", "v", "t", "()V", "u", "s", "r", "p", "q", "h", "Ler/l;", "Lkotlin/Function0;", "i", "Ler/a;", "getCurrentOnForwardCancelled", "()Ler/a;", "M", "(Ler/a;)V", "currentOnForwardCancelled", "j", "getCurrentOnForwardCompleted", "N", "currentOnForwardCompleted", "k", "getCurrentOnBackCancelled", "K", "currentOnBackCancelled", "l", "getCurrentOnBackCompleted", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "currentOnBackCompleted", "navigationevent-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
final class e<T extends ha.g> extends ha.e<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final er.l<ha.j, i0> onTransitionStateChanged;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> currentOnForwardCancelled;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> currentOnForwardCompleted;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> currentOnBackCancelled;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> currentOnBackCompleted;

    /* JADX WARN: Multi-variable type inference failed */
    public e(T t15, er.l<? super ha.j, i0> lVar) {
        super(t15, false, false);
        this.onTransitionStateChanged = lVar;
        this.currentOnForwardCancelled = new er.a() { // from class: ia.a
            @Override // er.a
            public final Object a() {
                return e.I();
            }
        };
        this.currentOnForwardCompleted = new er.a() { // from class: ia.b
            @Override // er.a
            public final Object a() {
                return e.J();
            }
        };
        this.currentOnBackCancelled = new er.a() { // from class: ia.c
            @Override // er.a
            public final Object a() {
                return e.G();
            }
        };
        this.currentOnBackCompleted = new er.a() { // from class: ia.d
            @Override // er.a
            public final Object a() {
                return e.H();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 H() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 I() {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 J() {
        return i0.f148189a;
    }

    public final void K(er.a<i0> aVar) {
        this.currentOnBackCancelled = aVar;
    }

    public final void L(er.a<i0> aVar) {
        this.currentOnBackCompleted = aVar;
    }

    public final void M(er.a<i0> aVar) {
        this.currentOnForwardCancelled = aVar;
    }

    public final void N(er.a<i0> aVar) {
        this.currentOnForwardCompleted = aVar;
    }

    @Override // ha.e
    protected void p() {
        this.onTransitionStateChanged.b(getTransitionState());
        this.currentOnBackCancelled.a();
    }

    @Override // ha.e
    protected void q() {
        this.onTransitionStateChanged.b(getTransitionState());
        this.currentOnBackCompleted.a();
    }

    @Override // ha.e
    protected void r(NavigationEvent event) {
        this.onTransitionStateChanged.b(getTransitionState());
    }

    @Override // ha.e
    protected void s(NavigationEvent event) {
        this.onTransitionStateChanged.b(getTransitionState());
    }

    @Override // ha.e
    protected void t() {
        this.onTransitionStateChanged.b(getTransitionState());
        this.currentOnForwardCancelled.a();
    }

    @Override // ha.e
    protected void u() {
        this.onTransitionStateChanged.b(getTransitionState());
        this.currentOnForwardCompleted.a();
    }

    @Override // ha.e
    protected void v(NavigationEvent event) {
        this.onTransitionStateChanged.b(getTransitionState());
    }

    @Override // ha.e
    protected void w(NavigationEvent event) {
        this.onTransitionStateChanged.b(getTransitionState());
    }
}
