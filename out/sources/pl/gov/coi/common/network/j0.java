package pl.gov.coi.common.network;

import java.io.InterruptedIOException;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLKeyException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLProtocolException;
import org.json.JSONException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J+\u0010\r\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\f0\u000b2\n\u0010\n\u001a\u00060\bj\u0002`\tH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lpl/gov/coi/common/network/j0;", "Lpl/gov/coi/common/network/i0;", "Lay/b;", "baseUrlProvidersProxy", "Lay/k;", "networkConnectionManager", "<init>", "(Lay/b;Lay/k;)V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Ldx/i;", "Ldx/b$g;", "a", "(Ljava/lang/Exception;)Ldx/i;", "Lay/b;", "b", "Lay/k;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j0 implements i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ay.b baseUrlProvidersProxy;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.k networkConnectionManager;

    public j0(ay.b bVar, ay.k kVar) {
        this.baseUrlProvidersProxy = bVar;
        this.networkConnectionManager = kVar;
    }

    @Override // dx.j
    public dx.i<Exception, dx.b.g> a(Exception e15) {
        if (e15 instanceof o00.c) {
            o00.c cVar = (o00.c) e15;
            if (!(cVar.getInternalException() instanceof SSLPeerUnverifiedException)) {
                return a(cVar.getInternalException());
            }
            List<ay.a> listA = this.baseUrlProvidersProxy.a();
            if (!(listA instanceof Collection) || !listA.isEmpty()) {
                Iterator<T> it = listA.iterator();
                while (it.hasNext()) {
                    if (fu.r.d0(cVar.getAddress(), ((ay.a) it.next()).getBaseUrl(), false, 2, null)) {
                        return new dx.i.Right(new dx.b.g.SslCertificate(true));
                    }
                }
            }
            return new dx.i.Right(new dx.b.g.SslCertificate(false));
        }
        if (e15 instanceof SocketException) {
            return new dx.i.Right(dx.b.g.C1031b.f45046a);
        }
        if (e15 instanceof SocketTimeoutException) {
            return new dx.i.Right(dx.b.g.f.f45079a);
        }
        if (e15 instanceof InterruptedIOException) {
            return new dx.i.Right(dx.b.g.h.f45081a);
        }
        if (e15 instanceof o00.b) {
            return new dx.i.Right(dx.b.g.e.f45078a);
        }
        if (e15 instanceof UnknownHostException) {
            boolean zE = this.networkConnectionManager.e();
            if (zE) {
                return new dx.i.Left(e15);
            }
            if (zE) {
                throw new oq.p();
            }
            return new dx.i.Right(dx.b.g.e.f45078a);
        }
        if ((e15 instanceof SSLHandshakeException) || (e15 instanceof SSLKeyException) || (e15 instanceof SSLProtocolException) || (e15 instanceof SSLException)) {
            return new dx.i.Right(new dx.b.g.SslCertificate(false));
        }
        return ((e15 instanceof com.google.gson.u) || (e15 instanceof JSONException) || (e15 instanceof com.google.gson.m)) ? new dx.i.Right(new dx.b.Parsing(e15)) : new dx.i.Left(e15);
    }
}
