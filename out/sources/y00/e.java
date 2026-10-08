package y00;

import java.security.cert.X509Certificate;
import java.util.concurrent.CancellationException;
import org.bouncycastle.asn1.x500.X500Name;
import org.bouncycastle.cert.jcajce.JcaX509CertificateConverter;
import org.bouncycastle.cert.jcajce.JcaX509v3CertificateBuilder;
import org.bouncycastle.operator.jcajce.JcaContentSignerBuilder;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0096@¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ly00/e;", "Liy/j0;", "Ly00/c0;", "securityExceptionParser", "<init>", "(Ly00/c0;)V", "Liy/f;", "spec", "Ldx/i;", "Ldx/b;", "Ljava/security/cert/X509Certificate;", "a", "(Liy/f;Ltq/e;)Ljava/lang/Object;", "Ly00/c0;", "getSecurityExceptionParser", "()Ly00/c0;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e implements iy.j0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c0 securityExceptionParser;

    public e(c0 c0Var) {
        this.securityExceptionParser = c0Var;
    }

    @Override // iy.j0
    public Object a(iy.f fVar, tq.e<? super dx.i<? extends dx.b, ? extends X509Certificate>> eVar) {
        Object objB;
        c0 c0Var = this.securityExceptionParser;
        try {
            try {
                try {
                    new ex.a();
                    return new dx.i.Right(new JcaX509CertificateConverter().getCertificate(new JcaX509v3CertificateBuilder(new X500Name(fVar.getPrincipalName()), fVar.getSerialNumber(), fVar.getNotAfter(), fVar.getNotAfter(), new X500Name(fVar.getDirName()), fVar.getKeyPair().getPublic()).build(new JcaContentSignerBuilder(fVar.getSignatureAlgorithm()).build(fVar.getKeyPair().getPrivate()))));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new dx.i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            px.f fVar2 = px.f.f163100a;
            String message = e18.getMessage();
            if (message == null) {
                message = "";
            }
            fVar2.d(message, e18, px.c.a(c0Var));
            dx.i<Exception, dx.b> iVarA = c0Var.a(e18);
            if (iVarA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
            } else {
                if (!(iVarA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) iVarA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
