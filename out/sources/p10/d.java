package p10;

import dx.i;
import dx.j;
import iy.a0;
import java.util.concurrent.CancellationException;
import oq.g;
import oq.p;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\u000e¨\u0006\u000f"}, d2 = {"Lp10/d;", "Lp10/b;", "Lwy/a;", "masterKeyProvider", "<init>", "(Lwy/a;)V", "Ldx/i;", "Ldx/b;", "Liy/a0;", "getKey", "()Ldx/i;", "", "a", "()Z", "Lwy/a;", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final wy.a masterKeyProvider;

    public d(wy.a aVar) {
        this.masterKeyProvider = aVar;
    }

    @Override // p10.b
    public boolean a() {
        return this.masterKeyProvider.a();
    }

    @Override // p10.b
    public i<dx.b, a0> getKey() {
        Object objB;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    boolean zA = a();
                    if (zA) {
                        return new i.Right(new a0((byte[]) this.masterKeyProvider.c().getData().clone()));
                    }
                    if (zA) {
                        throw new p();
                    }
                    aVar.b(dx.b.j.d.f45088a);
                    throw new g();
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof i.Left) {
                objB = new dx.b.Generic((Exception) ((i.Left) objA).b());
            } else {
                if (!(objA instanceof i.Right)) {
                    throw new p();
                }
                objB = ((i.Right) objA).b();
            }
            return new i.Left(objB);
        }
    }
}
