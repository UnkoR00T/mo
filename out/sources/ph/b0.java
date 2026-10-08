package ph;

import android.app.Application;
import com.google.android.gms.internal.oss_licenses.j4;
import com.google.android.gms.internal.oss_licenses.k4;

/* JADX INFO: loaded from: classes3.dex */
final class b0 extends vq.k implements er.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Application f157542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ j4 f157543f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    b0(Application application, j4 j4Var, tq.e eVar) {
        super(2, eVar);
        this.f157542e = application;
        this.f157543f = j4Var;
    }

    @Override // er.p
    public final /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
        return ((b0) v((ju.p0) obj, (tq.e) obj2)).J(oq.i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        uq.b.e();
        oq.u.b(obj);
        return k4.b(this.f157542e, this.f157543f, oh.c.f145730a);
    }

    @Override // vq.a
    public final tq.e v(Object obj, tq.e eVar) {
        return new b0(this.f157542e, this.f157543f, eVar);
    }
}
