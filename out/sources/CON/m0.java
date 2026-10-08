package CON;

import ha.NavigationEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\u00020\u0001:\u0001\u0013B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0017¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\u0006H'¢\u0006\u0004\b\u000e\u0010\bJ\u000f\u0010\u000f\u001a\u00020\u0006H\u0017¢\u0006\u0004\b\u000f\u0010\bJ\u001b\u0010\u0013\u001a\u00020\u00062\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011H\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00170\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u001bR*\u0010\"\u001a\u00020\u00022\u0006\u0010\u001d\u001a\u00020\u00028\u0007@GX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u001e\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\u0005R\u001e\u0010%\u001a\f\u0012\b\u0012\u00060\u0010j\u0002`\u00110#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010$¨\u0006&"}, d2 = {"LCON/m0;", "", "", "enabled", "<init>", "(Z)V", "Loq/i0;", "h", "()V", "LCON/b;", "backEvent", "f", "(LCON/b;)V", "e", "d", "c", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "closeable", "a", "(Ljava/lang/AutoCloseable;)V", "Lha/g;", "info", "LCON/m0$a;", "b", "(Lha/g;)LCON/m0$a;", "", "Ljava/util/List;", "eventHandlers", "value", "Z", "g", "()Z", "i", "isEnabled", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "closeables", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class m0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean isEnabled;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<a> eventHandlers = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<AutoCloseable> closeables = new CopyOnWriteArrayList<>();

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\t\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\r\u0010\fJ\u000f\u0010\u000e\u001a\u00020\nH\u0014¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R*\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00138\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LCON/m0$a;", "Lha/e;", "Lha/g;", "LCON/m0;", "onBackPressedCallback", "info", "<init>", "(LCON/m0;Lha/g;)V", "Lha/b;", "event", "Loq/i0;", "s", "(Lha/b;)V", "r", "q", "()V", "p", "h", "LCON/m0;", "", "value", "i", "Z", "C", "()Z", ip.a.f96138c, "(Z)V", "isLifecycleActive", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends ha.e<ha.g> {

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final m0 onBackPressedCallback;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private boolean isLifecycleActive;

        public a(m0 m0Var, ha.g gVar) {
            super(gVar, m0Var.getIsEnabled());
            this.onBackPressedCallback = m0Var;
            this.isLifecycleActive = true;
        }

        /* JADX INFO: renamed from: C, reason: from getter */
        public final boolean getIsLifecycleActive() {
            return this.isLifecycleActive;
        }

        public final void D(boolean z15) {
            this.isLifecycleActive = z15;
            y(z15 && this.onBackPressedCallback.getIsEnabled());
        }

        @Override // ha.e
        protected void p() {
            this.onBackPressedCallback.c();
        }

        @Override // ha.e
        protected void q() {
            this.onBackPressedCallback.d();
        }

        @Override // ha.e
        protected void r(NavigationEvent event) {
            this.onBackPressedCallback.e(new BackEventCompat(event));
        }

        @Override // ha.e
        protected void s(NavigationEvent event) {
            this.onBackPressedCallback.f(new BackEventCompat(event));
        }
    }

    public m0(boolean z15) {
        this.isEnabled = z15;
    }

    public final void a(AutoCloseable closeable) {
        this.closeables.add(closeable);
    }

    public final a b(ha.g info) {
        a aVar = new a(this, info);
        this.eventHandlers.add(aVar);
        return aVar;
    }

    public void c() {
    }

    public abstract void d();

    public void e(BackEventCompat backEvent) {
    }

    public void f(BackEventCompat backEvent) {
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsEnabled() {
        return this.isEnabled;
    }

    public final void h() {
        Iterator<AutoCloseable> it = this.closeables.iterator();
        while (it.hasNext()) {
            j0.a(it.next());
        }
        this.closeables.clear();
        Iterator<a> it4 = this.eventHandlers.iterator();
        while (it4.hasNext()) {
            it4.next().x();
        }
        this.eventHandlers.clear();
    }

    public final void i(boolean z15) {
        this.isEnabled = z15;
        for (a aVar : this.eventHandlers) {
            aVar.y(aVar.getIsLifecycleActive() && z15);
        }
    }
}
