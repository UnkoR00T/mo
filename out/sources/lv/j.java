package lv;

import fr.t;
import fu.o;
import fv.b0;
import fv.c0;
import fv.d0;
import fv.e0;
import fv.f0;
import fv.v;
import fv.w;
import fv.z;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import java.util.List;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u001b2\u00020\u0001:\u0001#B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\u0007\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0007\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0017\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\u001b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010#\u001a\u00020\u00132\u0006\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b#\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010%¨\u0006&"}, d2 = {"Llv/j;", "Lfv/w;", "Lfv/z;", "client", "<init>", "(Lfv/z;)V", "Ljava/io/IOException;", "e", "Lkv/e;", "call", "Lfv/b0;", "userRequest", "", "requestSendStarted", "(Ljava/io/IOException;Lkv/e;Lfv/b0;Z)Z", "f", "(Ljava/io/IOException;Lfv/b0;)Z", "d", "(Ljava/io/IOException;Z)Z", "Lfv/d0;", "userResponse", "Lkv/c;", "exchange", "c", "(Lfv/d0;Lkv/c;)Lfv/b0;", "", "method", "b", "(Lfv/d0;Ljava/lang/String;)Lfv/b0;", "", "defaultDelay", "g", "(Lfv/d0;I)I", "Lfv/w$a;", "chain", "a", "(Lfv/w$a;)Lfv/d0;", "Lfv/z;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class j implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final z client;

    public j(z zVar) {
        this.client = zVar;
    }

    private final b0 b(d0 userResponse, String method) {
        String strE;
        v vVarQ;
        if (!this.client.getFollowRedirects() || (strE = d0.E(userResponse, "Location", null, 2, null)) == null || (vVarQ = userResponse.getRequest().getUrl().q(strE)) == null) {
            return null;
        }
        if (!t.c(vVarQ.getScheme(), userResponse.getRequest().getUrl().getScheme()) && !this.client.getFollowSslRedirects()) {
            return null;
        }
        b0.a aVarI = userResponse.getRequest().i();
        if (f.a(method)) {
            int code = userResponse.getCode();
            f fVar = f.f120554a;
            boolean z15 = fVar.c(method) || code == 308 || code == 307;
            if (!fVar.b(method) || code == 308 || code == 307) {
                aVarI.f(method, z15 ? userResponse.getRequest().getBody() : null);
            } else {
                aVarI.f("GET", null);
            }
            if (!z15) {
                aVarI.h("Transfer-Encoding");
                aVarI.h("Content-Length");
                aVarI.h("Content-Type");
            }
        }
        if (!gv.d.j(userResponse.getRequest().getUrl(), vVarQ)) {
            aVarI.h("Authorization");
        }
        return aVarI.j(vVarQ).b();
    }

    private final b0 c(d0 userResponse, kv.c exchange) throws ProtocolException {
        kv.f connection;
        f0 route = (exchange == null || (connection = exchange.getConnection()) == null) ? null : connection.getRoute();
        int code = userResponse.getCode();
        String method = userResponse.getRequest().getMethod();
        if (code != 307 && code != 308) {
            if (code == 401) {
                return this.client.getAuthenticator().a(route, userResponse);
            }
            if (code == 421) {
                c0 body = userResponse.getRequest().getBody();
                if ((body != null && body.g()) || exchange == null || !exchange.l()) {
                    return null;
                }
                exchange.getConnection().y();
                return userResponse.getRequest();
            }
            if (code == 503) {
                d0 priorResponse = userResponse.getPriorResponse();
                if ((priorResponse == null || priorResponse.getCode() != 503) && g(userResponse, Integer.MAX_VALUE) == 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            if (code == 407) {
                if (route.getProxy().type() == Proxy.Type.HTTP) {
                    return this.client.getProxyAuthenticator().a(route, userResponse);
                }
                throw new ProtocolException("Received HTTP_PROXY_AUTH (407) code while not using proxy");
            }
            if (code == 408) {
                if (!this.client.getRetryOnConnectionFailure()) {
                    return null;
                }
                c0 body2 = userResponse.getRequest().getBody();
                if (body2 != null && body2.g()) {
                    return null;
                }
                d0 priorResponse2 = userResponse.getPriorResponse();
                if ((priorResponse2 == null || priorResponse2.getCode() != 408) && g(userResponse, 0) <= 0) {
                    return userResponse.getRequest();
                }
                return null;
            }
            switch (code) {
                case 300:
                case 301:
                case 302:
                case 303:
                    break;
                default:
                    return null;
            }
        }
        return b(userResponse, method);
    }

    private final boolean d(IOException e15, boolean requestSendStarted) {
        if (e15 instanceof ProtocolException) {
            return false;
        }
        if (e15 instanceof InterruptedIOException) {
            return (e15 instanceof SocketTimeoutException) && !requestSendStarted;
        }
        return (((e15 instanceof SSLHandshakeException) && (e15.getCause() instanceof CertificateException)) || (e15 instanceof SSLPeerUnverifiedException)) ? false : true;
    }

    private final boolean e(IOException e15, kv.e call, b0 userRequest, boolean requestSendStarted) {
        if (this.client.getRetryOnConnectionFailure()) {
            return !(requestSendStarted && f(e15, userRequest)) && d(e15, requestSendStarted) && call.F();
        }
        return false;
    }

    private final boolean f(IOException e15, b0 userRequest) {
        c0 body = userRequest.getBody();
        return (body != null && body.g()) || (e15 instanceof FileNotFoundException);
    }

    private final int g(d0 userResponse, int defaultDelay) {
        String strE = d0.E(userResponse, "Retry-After", null, 2, null);
        if (strE == null) {
            return defaultDelay;
        }
        if (new o("\\d+").f(strE)) {
            return Integer.valueOf(strE).intValue();
        }
        return Integer.MAX_VALUE;
    }

    @Override // fv.w
    public d0 a(w.a chain) {
        d0 d0VarA;
        g gVar = (g) chain;
        b0 b0VarI = gVar.i();
        kv.e call = gVar.getCall();
        List listN = pq.v.n();
        int i15 = 0;
        d0 d0Var = null;
        while (true) {
            boolean z15 = true;
            while (true) {
                call.m(b0VarI, z15);
                try {
                    if (call.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    try {
                        d0VarA = gVar.a(b0VarI);
                    } catch (IOException e15) {
                        if (!e(e15, call, b0VarI, !(e15 instanceof nv.a))) {
                            throw gv.d.Y(e15, listN);
                        }
                        listN = pq.v.M0(listN, e15);
                        call.n(true);
                        z15 = false;
                    } catch (kv.i e16) {
                        if (!e(e16.getLastConnectException(), call, b0VarI, false)) {
                            throw gv.d.Y(e16.getFirstConnectException(), listN);
                        }
                        listN = pq.v.M0(listN, e16.getFirstConnectException());
                        call.n(true);
                        z15 = false;
                    }
                    call.n(true);
                    z15 = false;
                } catch (Throwable th4) {
                    call.n(true);
                    throw th4;
                }
            }
            if (d0Var != null) {
                d0VarA = d0VarA.K().o(d0Var.K().b(null).c()).c();
            }
            d0Var = d0VarA;
            kv.c interceptorScopedExchange = call.getInterceptorScopedExchange();
            b0 b0VarC = c(d0Var, interceptorScopedExchange);
            if (b0VarC == null) {
                if (interceptorScopedExchange != null && interceptorScopedExchange.getIsDuplex()) {
                    call.H();
                }
                call.n(false);
                return d0Var;
            }
            c0 body = b0VarC.getBody();
            if (body != null && body.g()) {
                call.n(false);
                return d0Var;
            }
            e0 body2 = d0Var.getBody();
            if (body2 != null) {
                gv.d.m(body2);
            }
            i15++;
            if (i15 > 20) {
                throw new ProtocolException("Too many follow-up requests: " + i15);
            }
            call.n(true);
            b0VarI = b0VarC;
        }
    }
}
