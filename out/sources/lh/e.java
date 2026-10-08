package lh;

import android.content.Context;
import android.os.Bundle;
import android.os.StrictMode;
import android.widget.FrameLayout;
import com.google.android.gms.maps.GoogleMapOptions;

/* JADX INFO: loaded from: classes3.dex */
public class e extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final q f118207a;

    public e(Context context, GoogleMapOptions googleMapOptions) {
        super(context);
        this.f118207a = new q(this, context, googleMapOptions);
        setClickable(true);
    }

    public void a(h hVar) {
        jg.s.e("getMapAsync() must be called on the main thread");
        jg.s.m(hVar, "callback must not be null.");
        this.f118207a.q(hVar);
    }

    public void b(Bundle bundle) {
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitAll().build());
        try {
            q qVar = this.f118207a;
            qVar.c(bundle);
            if (qVar.b() == null) {
                rg.a.j(this);
            }
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public void c() {
        this.f118207a.d();
    }

    public void d() {
        this.f118207a.e();
    }

    public void e() {
        this.f118207a.f();
    }

    public void f() {
        this.f118207a.g();
    }

    public void g() {
        this.f118207a.h();
    }

    public void h() {
        this.f118207a.i();
    }
}
