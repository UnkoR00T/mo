package p008Nul;

import CON.BackEventCompat;
import CON.m0;
import ha.NavigationEvent;
import ha.e;
import ha.g;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0006\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u000f\u0010\f\u001a\u00020\bH&¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000e\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000e\u0010\rR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u000f\u0010\u001bR$\u0010\"\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8W@WX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\u001f\"\u0004\b \u0010!¨\u0006#"}, d2 = {"LNul/w;", "", "Lha/g;", "info", "<init>", "(Lha/g;)V", "LCON/b;", "event", "Loq/i0;", "g", "(LCON/b;)V", "f", "e", "()V", "d", "a", "Lha/g;", "getInfo", "()Lha/g;", "LCON/m0;", "b", "LCON/m0;", "()LCON/m0;", "onBackPressedCallback", "Lha/e;", "c", "Lha/e;", "()Lha/e;", "navigationEventHandler", "", "value", "()Z", "h", "(Z)V", "isBackEnabled", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g info;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m0 onBackPressedCallback = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e<g> navigationEventHandler;

    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\b\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0014¢\u0006\u0004\b\b\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\u000b\u0010\n¨\u0006\f"}, d2 = {"Nul/w$a", "Lha/e;", "Lha/g;", "Lha/b;", "event", "Loq/i0;", "s", "(Lha/b;)V", "r", "q", "()V", "p", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a extends e<g> {
        a(g gVar) {
            super(gVar, false);
        }

        @Override // ha.e
        protected void p() {
            w.this.d();
        }

        @Override // ha.e
        protected void q() {
            w.this.e();
        }

        @Override // ha.e
        protected void r(NavigationEvent event) {
            w.this.f(new BackEventCompat(event));
        }

        @Override // ha.e
        protected void s(NavigationEvent event) {
            w.this.g(new BackEventCompat(event));
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Nul/w$b", "LCON/m0;", "LCON/b;", "backEvent", "Loq/i0;", "f", "(LCON/b;)V", "e", "d", "()V", "c", "activity-compose"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b extends m0 {
        b() {
            super(false);
        }

        @Override // CON.m0
        public void c() {
            w.this.d();
        }

        @Override // CON.m0
        public void d() {
            w.this.e();
        }

        @Override // CON.m0
        public void e(BackEventCompat backEvent) {
            w.this.f(backEvent);
        }

        @Override // CON.m0
        public void f(BackEventCompat backEvent) {
            w.this.g(backEvent);
        }
    }

    public w(g gVar) {
        this.info = gVar;
        this.navigationEventHandler = new a(gVar);
    }

    public final e<g> a() {
        return this.navigationEventHandler;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final m0 getOnBackPressedCallback() {
        return this.onBackPressedCallback;
    }

    public boolean c() {
        return this.onBackPressedCallback.getIsEnabled() && this.navigationEventHandler.n();
    }

    public void d() {
    }

    public abstract void e();

    public void f(BackEventCompat event) {
    }

    public void g(BackEventCompat event) {
    }

    public void h(boolean z15) {
        this.onBackPressedCallback.i(z15);
        this.navigationEventHandler.y(z15);
    }
}
