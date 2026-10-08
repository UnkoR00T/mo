package ph;

import android.app.Application;
import com.google.android.gms.internal.oss_licenses.k4;

/* JADX INFO: loaded from: classes3.dex */
final class c0 extends vq.k implements er.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Application f157546e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    c0(Application application, tq.e eVar) {
        super(2, eVar);
        this.f157546e = application;
    }

    @Override // er.p
    public final /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
        return ((c0) v((ju.p0) obj, (tq.e) obj2)).J(oq.i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        uq.b.e();
        oq.u.b(obj);
        return k4.a(this.f157546e, oh.c.f145730a);
    }

    @Override // vq.a
    public final tq.e v(Object obj, tq.e eVar) {
        return new c0(this.f157546e, eVar);
    }
}
