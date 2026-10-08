package b10;

import dx.i;
import dx.j;
import ex.d;
import fr.k;
import java.security.KeyFactory;
import java.security.interfaces.ECPublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.List;
import java.util.concurrent.CancellationException;
import ky.JweHeader;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import pq.v;
import sn.f;
import sn.n;
import sn.o;
import sn.s;
import sn.y;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J3\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb10/a;", "Ljy/c;", "<init>", "()V", "", "ecPublicKey", "Lky/b;", "jweHeader", "Lky/c;", "jwePayload", "Ldx/i;", "Ldx/b;", "", "a", "([BLky/b;Lky/c;)Ldx/i;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements jy.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final C0375a f15879a = new C0375a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final List<String> f15880b = v.q("A128CBC-HS256", "A192CBC-HS384", "A256CBC-HS512", "A128CBC+HS256", "A256CBC+HS512", "A128GCM", "A192GCM", "A256GCM", "XC20P");

    /* JADX INFO: renamed from: b10.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lb10/a$a;", "", "<init>", "()V", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private static final class C0375a {
        public /* synthetic */ C0375a(k kVar) {
            this();
        }

        private C0375a() {
        }
    }

    @Override // jy.c
    public i<dx.b, String> a(byte[] ecPublicKey, JweHeader jweHeader, ky.c jwePayload) {
        Object objB;
        y yVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar = new ex.a();
                    if (!f15880b.contains(jweHeader.getEnc())) {
                        aVar.b(new dx.b.Generic(null, 1, null));
                        throw new g();
                    }
                    tn.a aVar2 = new tn.a((ECPublicKey) KeyFactory.getInstance("EC").generatePublic(new X509EncodedKeySpec(ecPublicKey)));
                    n.a aVar3 = new n.a(sn.k.c(jweHeader.getAlg()), f.d(jweHeader.getEnc()));
                    String apv = jweHeader.getApv();
                    if (apv != null) {
                        aVar3.b(io.c.f(apv));
                    }
                    String apu = jweHeader.getApu();
                    if (apu != null) {
                        aVar3.a(io.c.f(apu));
                    }
                    String kid = jweHeader.getKid();
                    if (kid != null) {
                        aVar3.f(kid);
                    }
                    String contentType = jweHeader.getContentType();
                    if (contentType != null) {
                        aVar3.d(contentType);
                    }
                    n nVarC = aVar3.c();
                    if (jwePayload instanceof ky.c.C2741c) {
                        yVar = new y(((ky.c.C2741c) jwePayload).a());
                    } else if (jwePayload instanceof ky.c.a) {
                        yVar = new y(((ky.c.a) jwePayload).a());
                    } else if (jwePayload instanceof ky.c.JwsObject) {
                        yVar = new y(s.n(((ky.c.JwsObject) jwePayload).getJwsObject()));
                    } else {
                        if (!(jwePayload instanceof ky.c.b)) {
                            throw new p();
                        }
                        yVar = new y(((ky.c.b) jwePayload).a());
                    }
                    o oVar = new o(nVarC, yVar);
                    oVar.f(aVar2);
                    return new i.Right(oVar.k());
                } catch (Exception e15) {
                    px.f fVar = px.f.f163100a;
                    String message = e15.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar.d(message, e15, px.c.a(jVarA));
                    Object objA = jVarA.a(e15);
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
            } catch (ex.c e16) {
                return new i.Left((dx.b) d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (CancellationException e18) {
            throw e18;
        }
    }
}
