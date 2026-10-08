package ph;

import com.google.android.gms.internal.oss_licenses.j4;
import p076m2.a3;

/* JADX INFO: loaded from: classes3.dex */
final class i0 extends vq.k implements er.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Object f157572e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f157573f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final /* synthetic */ j4 f157574g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final /* synthetic */ e0 f157575h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    final /* synthetic */ a3 f157576j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i0(j4 j4Var, e0 e0Var, a3 a3Var, tq.e eVar) {
        super(2, eVar);
        this.f157574g = j4Var;
        this.f157575h = e0Var;
        this.f157576j = a3Var;
    }

    @Override // er.p
    public final /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
        return ((i0) v((ju.p0) obj, (tq.e) obj2)).J(oq.i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        a3 a3Var;
        Object objE = uq.b.e();
        if (this.f157573f == 0) {
            oq.u.b(obj);
            j4 j4Var = this.f157574g;
            if (j4Var != null) {
                a3 a3Var2 = this.f157576j;
                e0 e0Var = this.f157575h;
                this.f157572e = a3Var2;
                this.f157573f = 1;
                obj = e0Var.c9(j4Var, this);
                if (obj == objE) {
                    return objE;
                }
                a3Var = a3Var2;
            }
            return oq.i0.f148189a;
        }
        a3Var = (a3) this.f157572e;
        oq.u.b(obj);
        a3Var.setValue((String) obj);
        return oq.i0.f148189a;
    }

    @Override // vq.a
    public final tq.e v(Object obj, tq.e eVar) {
        return new i0(this.f157574g, this.f157575h, this.f157576j, eVar);
    }
}
