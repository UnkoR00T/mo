package iq;

import android.app.Application;
import android.app.Service;

/* JADX INFO: loaded from: classes4.dex */
public final class h implements lq.b<Object> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Service f96179a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Object f96180b;

    public interface a {
        gq.d a();
    }

    public h(Service service) {
        this.f96179a = service;
    }

    private Object a() {
        Application application = this.f96179a.getApplication();
        lq.d.c(application instanceof lq.b, "Hilt service must be attached to an @HiltAndroidApp Application. Found: %s", application.getClass());
        return ((a) bq.a.a(application, a.class)).a().a(this.f96179a).build();
    }

    @Override // lq.b
    public Object p() {
        if (this.f96180b == null) {
            this.f96180b = a();
        }
        return this.f96180b;
    }
}
