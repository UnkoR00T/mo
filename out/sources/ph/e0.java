package ph;

import android.app.Application;
import com.google.android.gms.internal.oss_licenses.j4;
import com.google.android.gms.internal.oss_licenses.u3;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

/* JADX INFO: loaded from: classes3.dex */
public final class e0 extends androidx.p016lifecycle.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final mu.b0 f157557c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final mu.p0 f157558d;

    public e0(Application application) {
        super(application);
        mu.b0 b0VarA = mu.r0.a(y.f157636a);
        this.f157557c = b0VarA;
        this.f157558d = mu.i.b(b0VarA);
    }

    public final mu.p0 a9() {
        return this.f157558d;
    }

    public final void b9() {
        if (this.f157557c.getValue() instanceof w) {
            return;
        }
        ju.k.d(androidx.p016lifecycle.u0.a(this), null, null, new d0(this, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c9(j4 j4Var, tq.e eVar) throws Throwable {
        a0 a0Var;
        if (eVar instanceof a0) {
            a0Var = (a0) eVar;
            int i15 = a0Var.f157541f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                a0Var.f157541f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                a0Var = new a0(this, eVar);
            }
        } else {
            a0Var = new a0(this, eVar);
        }
        Object objG = a0Var.f157539d;
        Object objE = uq.b.e();
        int i16 = a0Var.f157541f;
        if (i16 == 0) {
            oq.u.b(objG);
            Application applicationZ8 = Z8();
            tq.i iVarA = u3.a();
            b0 b0Var = new b0(applicationZ8, j4Var, null);
            a0Var.f157541f = 1;
            objG = ju.i.g(iVarA, b0Var, a0Var);
            if (objG == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objG);
        }
        return objG;
    }
}
