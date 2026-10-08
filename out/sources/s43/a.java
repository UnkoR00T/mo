package s43;

import android.util.Base64;
import com.google.gson.o;
import dx.i;
import dx.j;
import fu.d;
import java.net.URLEncoder;
import java.util.concurrent.CancellationException;
import oq.p;
import p071kotlin.Metadata;
import pl.gov.coi.common.network.p0;
import px.f;
import xw.c;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u000bB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J%\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\fJ)\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\n2\b\u0010\u000f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J9\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0006\u0010\r\u001a\u00020\n2\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0015¨\u0006\u0016"}, d2 = {"Ls43/a;", "", "Lpl/gov/coi/common/network/p0;", "requestFactory", "<init>", "(Lpl/gov/coi/common/network/p0;)V", "", "signedData", "Ldx/i;", "Ldx/b;", "", "a", "([B)Ldx/i;", "requestId", "preparedData", "origin", "Lcom/google/gson/o;", "b", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/google/gson/o;", "c", "(Ljava/lang/String;[BLjava/lang/String;)Ldx/i;", "Lpl/gov/coi/common/network/p0;", "services_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f177849c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final p0 requestFactory;

    public a(p0 p0Var) {
        this.requestFactory = p0Var;
    }

    private final i<dx.b, String> a(byte[] signedData) {
        Object objB;
        if (signedData == null) {
            return new i.Right("");
        }
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    new ex.a();
                    return new i.Right(new String(Base64.encode(signedData, 11), d.UTF_8));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
            String message = e18.getMessage();
            fVar.d(message != null ? message : "", e18, px.c.a(jVarA));
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

    private final o b(String requestId, String preparedData, String origin) {
        o oVar = new o();
        oVar.s("requestId", requestId);
        oVar.s("appInfo", this.requestFactory.b());
        oVar.q("mode", 0);
        oVar.s("data", preparedData);
        oVar.q("responseType", 0);
        if (origin != null) {
            oVar.s("origin", origin);
        }
        return oVar;
    }

    public static /* synthetic */ i d(a aVar, String str, byte[] bArr, String str2, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            bArr = null;
        }
        if ((i15 & 4) != 0) {
            str2 = null;
        }
        return aVar.c(str, bArr, str2);
    }

    public final i<dx.b, String> c(String requestId, byte[] signedData, String origin) {
        Object objB;
        j<dx.b> jVarA = c.f221622a.a();
        try {
            try {
                try {
                    return new i.Right(URLEncoder.encode(b(requestId, (String) new ex.a().a(a(signedData)), origin).toString(), "UTF-8"));
                } catch (CancellationException e15) {
                    throw e15;
                }
            } catch (ex.c e16) {
                return new i.Left((dx.b) ex.d.a(e16));
            } catch (CancellationException e17) {
                throw e17;
            }
        } catch (Exception e18) {
            f fVar = f.f163100a;
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
