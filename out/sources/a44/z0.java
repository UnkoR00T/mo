package a44;

import java.security.cert.X509Certificate;
import java.util.List;
import java.util.concurrent.CancellationException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u0000 \u00132\u00020\u0001:\u0001\u000fB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\t\u001a\u00020\bH\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"La44/z0;", "Lq34/z0;", "Liy/i0;", "x509CertificateDecoder", "Liy/a;", "base64Coder", "<init>", "(Liy/i0;Liy/a;)V", "Lq34/z0$a;", "params", "Ldx/i;", "Ldx/b;", "Lq34/z0$b;", "d", "(Lq34/z0$a;Ltq/e;)Ljava/lang/Object;", "a", "Liy/i0;", "b", "Liy/a;", "c", "documents_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z0 implements q34.z0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final iy.i0 x509CertificateDecoder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final iy.a base64Coder;

    public z0(iy.i0 i0Var, iy.a aVar) {
        this.x509CertificateDecoder = i0Var;
        this.base64Coder = aVar;
    }

    @Override // gz.b
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Object c(q34.z0.a aVar, tq.e<? super dx.i<? extends dx.b, q34.z0.Result>> eVar) {
        Object objB;
        X509Certificate x509Cert;
        List listV0;
        String str;
        dx.j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    Object obj = null;
                    if (aVar instanceof q34.z0.a.Cert) {
                        x509Cert = ((q34.z0.a.Cert) aVar).getX509Cert();
                    } else {
                        if (!(aVar instanceof q34.z0.a.CertC509CertString)) {
                            throw new oq.p();
                        }
                        x509Cert = (X509Certificate) aVar2.a(this.x509CertificateDecoder.decode((byte[]) aVar2.a(iy.a.c(this.base64Coder, iy.c0.e(((q34.z0.a.CertC509CertString) aVar).getX509Cert()), null, 2, null))));
                    }
                    for (Object obj2 : fu.r.V0(x509Cert.getSubjectDN().getName(), new String[]{","}, false, 0, 6, null)) {
                        if (fu.r.V((String) obj2, "SERIALNUMBER", false, 2, null)) {
                            obj = obj2;
                            break;
                        }
                    }
                    String str2 = (String) obj;
                    if (str2 != null && (listV0 = fu.r.V0(str2, new String[]{"-"}, false, 0, 6, null)) != null && (str = (String) listV0.get(1)) != null) {
                        return new dx.i.Right(new q34.z0.Result(iy.c0.g(str)));
                    }
                    aVar2.b(new dx.b.Generic(new Exception("Data reading error")));
                    throw new oq.g();
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
            fVar.d(message, e18, px.c.a(jVarA));
            Object objA = jVarA.a(e18);
            if (objA instanceof dx.i.Left) {
                objB = new dx.b.Generic((Exception) ((dx.i.Left) objA).b());
            } else {
                if (!(objA instanceof dx.i.Right)) {
                    throw new oq.p();
                }
                objB = ((dx.i.Right) objA).b();
            }
            return new dx.i.Left(objB);
        }
    }
}
