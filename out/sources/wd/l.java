package wd;

import android.os.SystemClock;
import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.SocketTimeoutException;
import java.util.List;
import vd.r;
import vd.s;
import vd.t;
import vd.u;
import vd.v;

/* JADX INFO: loaded from: classes3.dex */
final class l {

    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f212220a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final u f212221b;

        private b(String str, u uVar) {
            this.f212220a = str;
            this.f212221b = uVar;
        }
    }

    static void a(vd.n<?> nVar, b bVar) {
        r rVarF = nVar.F();
        int iG = nVar.G();
        try {
            rVarF.b(bVar.f212221b);
            nVar.e(String.format("%s-retry [timeout=%s]", bVar.f212220a, Integer.valueOf(iG)));
        } catch (u e15) {
            nVar.e(String.format("%s-timeout-giveup [timeout=%s]", bVar.f212220a, Integer.valueOf(iG)));
            throw e15;
        }
    }

    static vd.k b(vd.n<?> nVar, long j15, List<vd.g> list) {
        vd.b.a aVarS = nVar.s();
        if (aVarS == null) {
            return new vd.k(304, (byte[]) null, true, j15, list);
        }
        return new vd.k(304, aVarS.f206142a, true, j15, e.a(list, aVarS));
    }

    static byte[] c(InputStream inputStream, int i15, c cVar) throws Throwable {
        byte[] bArrA;
        m mVar = new m(cVar, i15);
        try {
            bArrA = cVar.a(1024);
            while (true) {
                try {
                    int i16 = inputStream.read(bArrA);
                    if (i16 == -1) {
                        break;
                    }
                    mVar.write(bArrA, 0, i16);
                } catch (Throwable th4) {
                    th = th4;
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (IOException unused) {
                            v.e("Error occurred when closing InputStream", new Object[0]);
                        }
                    }
                    cVar.b(bArrA);
                    mVar.close();
                    throw th;
                }
            }
            byte[] byteArray = mVar.toByteArray();
            try {
                inputStream.close();
            } catch (IOException unused2) {
                v.e("Error occurred when closing InputStream", new Object[0]);
            }
            cVar.b(bArrA);
            mVar.close();
            return byteArray;
        } catch (Throwable th5) {
            th = th5;
            bArrA = null;
        }
    }

    static void d(long j15, vd.n<?> nVar, byte[] bArr, int i15) {
        if (v.f206224b || j15 > 3000) {
            v.b("HTTP response for request=<%s> [lifetime=%d], [size=%s], [rc=%d], [retryCount=%s]", nVar, Long.valueOf(j15), bArr != null ? Integer.valueOf(bArr.length) : "null", Integer.valueOf(i15), Integer.valueOf(nVar.F().a()));
        }
    }

    static b e(vd.n<?> nVar, IOException iOException, long j15, f fVar, byte[] bArr) throws s, vd.l {
        if (iOException instanceof SocketTimeoutException) {
            return new b("socket", new t());
        }
        if (iOException instanceof MalformedURLException) {
            throw new RuntimeException("Bad URL " + nVar.I(), iOException);
        }
        if (fVar == null) {
            if (!nVar.c0()) {
                throw new vd.l(iOException);
            }
            return new b("connection", new vd.l());
        }
        int iD = fVar.d();
        v.c("Unexpected response code %d for %s", Integer.valueOf(iD), nVar.I());
        if (bArr == null) {
            return new b("network", new vd.j());
        }
        vd.k kVar = new vd.k(iD, bArr, false, SystemClock.elapsedRealtime() - j15, fVar.c());
        if (iD == 401 || iD == 403) {
            return new b("auth", new vd.a(kVar));
        }
        if (iD >= 400 && iD <= 499) {
            throw new vd.d(kVar);
        }
        if (iD < 500 || iD > 599 || !nVar.d0()) {
            throw new s(kVar);
        }
        return new b("server", new s(kVar));
    }
}
