package b10;

import dx.i;
import dx.j;
import java.util.Map;
import java.util.concurrent.CancellationException;
import ky.JweHeader;
import oq.g;
import oq.p;
import p071kotlin.Metadata;
import sn.f;
import sn.k;
import sn.m;
import sn.n;
import sn.o;
import sn.s;
import sn.y;
import xn.d;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J?\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lb10/c;", "Ljy/b;", "<init>", "()V", "", "", "", "jwk", "Lky/b;", "jweHeader", "Lky/c;", "jwePayload", "Ldx/i;", "Ldx/b;", "a", "(Ljava/util/Map;Lky/b;Lky/c;)Ldx/i;", "security_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements jy.b {
    @Override // jy.b
    public i<dx.b, String> a(Map<String, ? extends Object> jwk, JweHeader jweHeader, ky.c jwePayload) {
        Object objB;
        String kid;
        m aVar;
        y yVar;
        j<dx.b> jVarA = xw.c.f221622a.a();
        try {
            try {
                try {
                    ex.a aVar2 = new ex.a();
                    d dVarU = d.u(jwk);
                    n.a aVar3 = new n.a(k.c(dVarU.a().a()), f.d(jweHeader.getEnc()));
                    String apv = jweHeader.getApv();
                    if (apv != null) {
                        aVar3.b(io.c.f(apv));
                    }
                    String apu = jweHeader.getApu();
                    if (apu != null) {
                        aVar3.a(io.c.f(apu));
                    }
                    String strD = dVarU.d();
                    if ((strD == null || aVar3.f(strD) == null) && (kid = jweHeader.getKid()) != null) {
                        aVar3.f(kid);
                    }
                    String contentType = jweHeader.getContentType();
                    if (contentType != null) {
                        aVar3.d(contentType);
                    }
                    n nVarC = aVar3.c();
                    if (dVarU instanceof xn.m) {
                        aVar = new tn.b(((xn.m) dVarU).I());
                    } else {
                        if (!(dVarU instanceof xn.b)) {
                            aVar2.b(new dx.b.Generic(new IllegalArgumentException("Unsupported key type: " + dVarU.h())));
                            throw new g();
                        }
                        aVar = new tn.a(((xn.b) dVarU).L());
                    }
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
                    oVar.f(aVar);
                    return new i.Right(oVar.k());
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
