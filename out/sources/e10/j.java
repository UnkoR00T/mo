package e10;

import java.util.concurrent.CancellationException;
import javax.crypto.spec.SecretKeySpec;
import oq.p;
import p071kotlin.Metadata;
import y00.c0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\r¨\u0006\u000f"}, d2 = {"Le10/j;", "Lpy/a;", "Ly00/c0;", "parser", "<init>", "(Ly00/c0;)V", "", "data", "Ldx/i;", "Ldx/b;", "Ljavax/crypto/spec/SecretKeySpec;", "a", "([B)Ldx/i;", "Ly00/c0;", "b", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements py.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 parser;

    public j(c0 c0Var) {
        this.parser = c0Var;
    }

    @Override // py.a
    public dx.i<dx.b, SecretKeySpec> a(byte[] data) {
        Object objB;
        c0 c0Var = this.parser;
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(new SecretKeySpec(data, "AES"));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
            if (iVarA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
            } else {
                if (!(iVarA instanceof dx.i.Right)) {
                    throw new p();
                }
                objB = ((dx.i.Right) iVarA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
