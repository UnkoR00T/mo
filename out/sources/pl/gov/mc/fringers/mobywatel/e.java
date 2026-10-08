package pl.gov.mc.fringers.mobywatel;

/* JADX INFO: loaded from: classes2.dex */
public abstract class e extends oz.g implements lq.c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f160693d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final iq.d f160694e = new iq.d(new a());

    class a implements iq.e {
        a() {
        }

        @Override // iq.e
        public Object get() {
            return b.a().a(new jq.a(e.this)).b();
        }
    }

    public final iq.d d() {
        return this.f160694e;
    }

    protected void e() {
        if (this.f160693d) {
            return;
        }
        this.f160693d = true;
        ((n) p()).c((MObywatelApplication) lq.e.a(this));
    }

    @Override // android.app.Application
    public void onCreate() {
        io.sentry.android.core.performance.h.s(this);
        e();
        super.onCreate();
        io.sentry.android.core.performance.h.t(this);
    }

    @Override // lq.b
    public final Object p() {
        return d().p();
    }
}
