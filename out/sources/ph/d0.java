package ph;

import android.app.Application;
import com.google.android.gms.internal.oss_licenses.u3;
import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes3.dex */
final class d0 extends vq.k implements er.p {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    int f157554e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ e0 f157555f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    d0(e0 e0Var, tq.e eVar) {
        super(2, eVar);
        this.f157555f = e0Var;
    }

    @Override // er.p
    public final /* bridge */ /* synthetic */ Object B(Object obj, Object obj2) {
        return ((d0) v((ju.p0) obj, (tq.e) obj2)).J(oq.i0.f148189a);
    }

    @Override // vq.a
    public final Object J(Object obj) throws Throwable {
        Object objE = uq.b.e();
        try {
            if (this.f157554e != 0) {
                oq.u.b(obj);
            } else {
                oq.u.b(obj);
                Application applicationZ8 = this.f157555f.Z8();
                tq.i iVarA = u3.a();
                c0 c0Var = new c0(applicationZ8, null);
                this.f157554e = 1;
                obj = ju.i.g(iVarA, c0Var, this);
                if (obj == objE) {
                    return objE;
                }
            }
            this.f157555f.f157557c.setValue(new w((ArrayList) obj));
        } catch (IOException e15) {
            e0 e0Var = this.f157555f;
            mu.b0 b0Var = e0Var.f157557c;
            String message = e15.getMessage();
            if (message == null) {
                message = e0Var.Z8().getString(oh.d.f145734d);
            }
            b0Var.setValue(new v(message));
        }
        return oq.i0.f148189a;
    }

    @Override // vq.a
    public final tq.e v(Object obj, tq.e eVar) {
        return new d0(this.f157555f, eVar);
    }
}
