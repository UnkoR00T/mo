package iq;

import CON.p;
import android.app.Activity;
import android.app.Application;

/* JADX INFO: loaded from: classes4.dex */
public class a implements lq.b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile Object f96157a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Object f96158b = new Object();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected final Activity f96159c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final lq.b<dq.b> f96160d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private g f96161e;

    /* JADX INFO: renamed from: iq.a$a, reason: collision with other inner class name */
    public interface InterfaceC2247a {
        gq.a a();
    }

    public a(Activity activity) {
        this.f96159c = activity;
        this.f96160d = new b((p) activity);
    }

    public final void a() {
        g gVar = this.f96161e;
        if (gVar != null) {
            gVar.a();
        }
    }

    protected Object b() {
        String str;
        if (this.f96159c.getApplication() instanceof lq.b) {
            return ((InterfaceC2247a) bq.a.a(this.f96160d, InterfaceC2247a.class)).a().a(this.f96159c).build();
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Hilt Activity must be attached to an @HiltAndroidApp Application. ");
        if (Application.class.equals(this.f96159c.getApplication().getClass())) {
            str = "Did you forget to specify your Application's class name in your manifest's <application />'s android:name attribute?";
        } else {
            str = "Found: " + this.f96159c.getApplication().getClass();
        }
        sb5.append(str);
        throw new IllegalStateException(sb5.toString());
    }

    public final void c() {
        g gVarC = ((b) this.f96160d).c();
        this.f96161e = gVarC;
        if (gVarC.b()) {
            this.f96161e.c(((p) this.f96159c).x());
        }
    }

    @Override // lq.b
    public Object p() {
        if (this.f96157a == null) {
            synchronized (this.f96158b) {
                try {
                    if (this.f96157a == null) {
                        this.f96157a = b();
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }
        return this.f96157a;
    }
}
