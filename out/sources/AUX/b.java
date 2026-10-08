package AUX;

import er.p;
import ju.z0;
import oq.i0;
import oq.u;
import p019auX.c1;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes.dex */
public final class b extends k implements p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f2e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final /* synthetic */ long f3f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final /* synthetic */ c1 f4g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(long j15, c1 c1Var, e eVar) {
        super(2, eVar);
        this.f3f = j15;
        this.f4g = c1Var;
    }

    @Override // er.p
    public final Object B(Object obj, Object obj2) {
        return new b(this.f3f, this.f4g, (e) obj2).J(i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        Object objE = uq.b.e();
        int i15 = this.f2e;
        if (i15 == 0) {
            u.b(obj);
            long j15 = this.f3f;
            this.f2e = 1;
            if (z0.b(j15, this) == objE) {
                return objE;
            }
        } else {
            if (i15 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
        }
        this.f4g.a();
        return i0.f148189a;
    }

    @Override // vq.a
    public final e v(Object obj, e eVar) {
        return new b(this.f3f, this.f4g, eVar);
    }
}
