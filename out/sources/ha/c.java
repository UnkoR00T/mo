package ha;

import java.util.LinkedHashSet;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u000fB\u001d\b\u0002\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0016\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ%\u0010\u000f\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0011\u001a\u00020\b2\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000bH\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013H\u0007¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\rH\u0007¢\u0006\u0004\b\u0017\u0010\u0018J)\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\r2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0000¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010\u001e\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u001aH\u0000¢\u0006\u0004\b\u001e\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b\u001f\u0010\u0018J\u001f\u0010 \u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\rH\u0000¢\u0006\u0004\b \u0010\u0018R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010!R\u0016\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010(\u001a\u00020$8B@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u0015\u0010%\u001a\u0004\b&\u0010'R*\u0010-\u001a\u00020$2\u0006\u0010)\u001a\u00020$8F@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010%\u001a\u0004\b*\u0010'\"\u0004\b+\u0010,R\u001a\u00102\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\t\u0010/\u001a\u0004\b0\u00101R \u00107\u001a\b\u0012\u0004\u0012\u00020\u0000038\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u00104\u001a\u0004\b5\u00106R\u001e\u00108\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u000b038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u00104R\u001a\u00109\u001a\b\u0012\u0004\u0012\u00020\u0013038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00104¨\u0006:"}, d2 = {"Lha/c;", "", "parent", "Lha/l;", "onBackCompletedFallback", "<init>", "(Lha/c;Lha/l;)V", "(Lha/l;)V", "Loq/i0;", "e", "()V", "Lha/e;", "handler", "", "priority", "a", "(Lha/e;I)V", "m", "(Lha/e;)V", "Lha/h;", "input", "c", "(Lha/h;)V", "d", "(Lha/h;I)V", "direction", "Lha/b;", "event", "i", "(Lha/h;ILha/b;)V", "h", "g", "f", "Lha/c;", "b", "Lha/l;", "", "Z", "k", "()Z", "isDisposed", "value", "l", "setEnabled", "(Z)V", "isEnabled", "Lha/i;", "Lha/i;", "j", "()Lha/i;", "sharedProcessor", "", "Ljava/util/Set;", "getChildDispatchers$navigationevent", "()Ljava/util/Set;", "childDispatchers", "handlers", "inputs", "navigationevent"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private c parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final l onBackCompletedFallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean isDisposed;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i sharedProcessor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Set<c> childDispatchers;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final Set<e<?>> handlers;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final Set<h> inputs;

    private c(c cVar, l lVar) {
        i iVar;
        this.parent = cVar;
        this.onBackCompletedFallback = lVar;
        this.isEnabled = true;
        this.sharedProcessor = (cVar == null || (iVar = cVar.sharedProcessor) == null) ? new i() : iVar;
        this.childDispatchers = new LinkedHashSet();
        this.handlers = new LinkedHashSet();
        this.inputs = new LinkedHashSet();
        c cVar2 = this.parent;
        if (cVar2 != null) {
            cVar2.childDispatchers.add(this);
        }
    }

    public static /* synthetic */ void b(c cVar, e eVar, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = 1;
        }
        cVar.a(eVar, i15);
    }

    private final void e() {
        if (k()) {
            throw new IllegalStateException("This NavigationEventDispatcher has already been disposed and cannot be used.");
        }
    }

    private final boolean k() {
        c cVar = this.parent;
        if (cVar == null || !cVar.k()) {
            return this.isDisposed;
        }
        return true;
    }

    public final void a(e<?> handler, int priority) {
        e();
        if (this.handlers.add(handler)) {
            this.sharedProcessor.a(this, handler, priority);
        }
    }

    public final void c(h input) {
        e();
        if (this.inputs.add(input)) {
            this.sharedProcessor.b(this, input, -1);
        }
    }

    public final void d(h input, int priority) {
        e();
        if (priority == 1 || priority == 0) {
            if (this.inputs.add(input)) {
                this.sharedProcessor.b(this, input, priority);
            }
        } else {
            throw new IllegalArgumentException(("Unsupported priority value: " + priority).toString());
        }
    }

    public final void f(h input, int direction) {
        e();
        if (l()) {
            this.sharedProcessor.c(input, direction);
        }
    }

    public final void g(h input, int direction) {
        e();
        if (l()) {
            this.sharedProcessor.d(input, direction, this.onBackCompletedFallback);
        }
    }

    public final void h(h input, int direction, NavigationEvent event) {
        e();
        if (l()) {
            this.sharedProcessor.e(input, direction, event);
        }
    }

    public final void i(h input, int direction, NavigationEvent event) {
        e();
        if (l()) {
            this.sharedProcessor.f(input, direction, event);
        }
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final i getSharedProcessor() {
        return this.sharedProcessor;
    }

    public final boolean l() {
        c cVar = this.parent;
        if (cVar == null || cVar.l()) {
            return this.isEnabled;
        }
        return false;
    }

    public final void m(e<?> handler) {
        if (this.handlers.remove(handler)) {
            this.sharedProcessor.h(handler);
        }
    }

    public c(l lVar) {
        this(null, lVar);
    }
}
