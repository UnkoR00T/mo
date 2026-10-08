package kv;

import fr.t;
import fv.f0;
import fv.r;
import fv.v;
import fv.z;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import nv.n;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ?\u0010\u0015\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J7\u0010\u0017\u001a\u00020\u00142\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0011\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001d\u0010!\u001a\u00020 2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b!\u0010\"J\u0015\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b&\u0010'J\r\u0010$\u001a\u00020\u0011¢\u0006\u0004\b$\u0010(J\u0015\u0010+\u001a\u00020\u00112\u0006\u0010*\u001a\u00020)¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b/\u00100R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u00101R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00102R\u0018\u00105\u001a\u0004\u0018\u0001038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u00104R\u0018\u00108\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00107R\u0016\u0010:\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u00109R\u0016\u0010;\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u00109R\u0016\u0010=\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u00109R\u0018\u0010@\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lkv/d;", "", "Lkv/g;", "connectionPool", "Lfv/a;", "address", "Lkv/e;", "call", "Lfv/r;", "eventListener", "<init>", "(Lkv/g;Lfv/a;Lkv/e;Lfv/r;)V", "", "connectTimeout", "readTimeout", "writeTimeout", "pingIntervalMillis", "", "connectionRetryEnabled", "doExtensiveHealthChecks", "Lkv/f;", "c", "(IIIIZZ)Lkv/f;", "b", "(IIIIZ)Lkv/f;", "Lfv/f0;", "f", "()Lfv/f0;", "Lfv/z;", "client", "Llv/g;", "chain", "Llv/d;", "a", "(Lfv/z;Llv/g;)Llv/d;", "Ljava/io/IOException;", "e", "Loq/i0;", "h", "(Ljava/io/IOException;)V", "()Z", "Lfv/v;", "url", "g", "(Lfv/v;)Z", "Lkv/g;", "Lfv/a;", "d", "()Lfv/a;", "Lkv/e;", "Lfv/r;", "Lkv/j$b;", "Lkv/j$b;", "routeSelection", "Lkv/j;", "Lkv/j;", "routeSelector", "I", "refusedStreamCount", "connectionShutdownCount", "i", "otherFailureCount", "j", "Lfv/f0;", "nextRouteToTry", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final g connectionPool;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fv.a address;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final e call;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final r eventListener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private j.b routeSelection;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private j routeSelector;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int refusedStreamCount;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int connectionShutdownCount;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int otherFailureCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private f0 nextRouteToTry;

    public d(g gVar, fv.a aVar, e eVar, r rVar) {
        this.connectionPool = gVar;
        this.address = aVar;
        this.call = eVar;
        this.eventListener = rVar;
    }

    /* JADX WARN: Code duplicated, block: B:56:0x011d  */
    /* JADX WARN: Code duplicated, block: B:58:0x0134  */
    /* JADX WARN: Code duplicated, block: B:74:0x0135 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    private final f b(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled) throws IOException {
        List<f0> listA;
        f fVar;
        Socket socketD;
        if (this.call.getCanceled()) {
            throw new IOException("Canceled");
        }
        f connection = this.call.getConnection();
        if (connection != null) {
            synchronized (connection) {
                try {
                    socketD = (connection.getNoNewExchanges() || !g(connection.getRoute().getAddress().getUrl())) ? this.call.D() : null;
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (this.call.getConnection() != null) {
                if (socketD == null) {
                    return connection;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketD != null) {
                gv.d.n(socketD);
            }
            this.eventListener.k(this.call, connection);
        }
        this.refusedStreamCount = 0;
        this.connectionShutdownCount = 0;
        this.otherFailureCount = 0;
        if (this.connectionPool.a(this.address, this.call, null, false)) {
            f connection2 = this.call.getConnection();
            this.eventListener.j(this.call, connection2);
            return connection2;
        }
        f0 f0VarC = this.nextRouteToTry;
        try {
            if (f0VarC == null) {
                j.b bVar = this.routeSelection;
                if (bVar == null || !bVar.b()) {
                    j jVar = this.routeSelector;
                    if (jVar == null) {
                        jVar = new j(this.address, this.call.getClient().getRouteDatabase(), this.call, this.eventListener);
                        this.routeSelector = jVar;
                    }
                    j.b bVarC = jVar.c();
                    this.routeSelection = bVarC;
                    listA = bVarC.a();
                    if (this.call.getCanceled()) {
                        throw new IOException("Canceled");
                    }
                    if (this.connectionPool.a(this.address, this.call, listA, false)) {
                        f connection3 = this.call.getConnection();
                        this.eventListener.j(this.call, connection3);
                        return connection3;
                    }
                    f0VarC = bVarC.c();
                } else {
                    f0VarC = this.routeSelection.c();
                }
                fVar = new f(this.connectionPool, f0VarC);
                this.call.G(fVar);
                fVar.g(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
                this.call.G(null);
                this.call.getClient().getRouteDatabase().a(fVar.getRoute());
                if (this.connectionPool.a(this.address, this.call, listA, true)) {
                    f connection4 = this.call.getConnection();
                    this.nextRouteToTry = f0VarC;
                    gv.d.n(fVar.getSocket());
                    this.eventListener.j(this.call, connection4);
                    return connection4;
                }
                synchronized (fVar) {
                    this.connectionPool.e(fVar);
                    this.call.e(fVar);
                    i0 i0Var2 = i0.f148189a;
                }
                this.eventListener.j(this.call, fVar);
                return fVar;
            }
            this.nextRouteToTry = null;
            fVar.g(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled, this.call, this.eventListener);
            this.call.G(null);
            this.call.getClient().getRouteDatabase().a(fVar.getRoute());
            if (this.connectionPool.a(this.address, this.call, listA, true)) {
                f connection5 = this.call.getConnection();
                this.nextRouteToTry = f0VarC;
                gv.d.n(fVar.getSocket());
                this.eventListener.j(this.call, connection5);
                return connection5;
            }
            synchronized (fVar) {
                this.connectionPool.e(fVar);
                this.call.e(fVar);
                i0 i0Var3 = i0.f148189a;
                this.eventListener.j(this.call, fVar);
                return fVar;
            }
        } catch (Throwable th5) {
            this.call.G(null);
            throw th5;
        }
        listA = null;
        fVar = new f(this.connectionPool, f0VarC);
        this.call.G(fVar);
    }

    private final f c(int connectTimeout, int readTimeout, int writeTimeout, int pingIntervalMillis, boolean connectionRetryEnabled, boolean doExtensiveHealthChecks) throws IOException {
        while (true) {
            f fVarB = b(connectTimeout, readTimeout, writeTimeout, pingIntervalMillis, connectionRetryEnabled);
            boolean z15 = connectionRetryEnabled;
            int i15 = pingIntervalMillis;
            int i16 = writeTimeout;
            int i17 = readTimeout;
            int i18 = connectTimeout;
            if (fVarB.v(doExtensiveHealthChecks)) {
                return fVarB;
            }
            fVarB.z();
            if (this.nextRouteToTry == null) {
                j.b bVar = this.routeSelection;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.routeSelector;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            connectTimeout = i18;
            readTimeout = i17;
            writeTimeout = i16;
            pingIntervalMillis = i15;
            connectionRetryEnabled = z15;
        }
    }

    private final f0 f() {
        f connection;
        if (this.refusedStreamCount > 1 || this.connectionShutdownCount > 1 || this.otherFailureCount > 0 || (connection = this.call.getConnection()) == null) {
            return null;
        }
        synchronized (connection) {
            if (connection.getRouteFailureCount() != 0) {
                return null;
            }
            if (gv.d.j(connection.getRoute().getAddress().getUrl(), this.address.getUrl())) {
                return connection.getRoute();
            }
            return null;
        }
    }

    public final lv.d a(z client, lv.g chain) {
        try {
            try {
                return c(chain.getConnectTimeoutMillis(), chain.getReadTimeoutMillis(), chain.getWriteTimeoutMillis(), client.getPingIntervalMillis(), client.getRetryOnConnectionFailure(), !t.c(chain.i().getMethod(), "GET")).x(client, chain);
            } catch (IOException e15) {
                e = e15;
                IOException iOException = e;
                h(iOException);
                throw new i(iOException);
            } catch (i e16) {
                e = e16;
                i iVar = e;
                h(iVar.getLastConnectException());
                throw iVar;
            }
        } catch (IOException e17) {
            e = e17;
        } catch (i e18) {
            e = e18;
        }
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final fv.a getAddress() {
        return this.address;
    }

    public final boolean e() {
        j jVar;
        if (this.refusedStreamCount == 0 && this.connectionShutdownCount == 0 && this.otherFailureCount == 0) {
            return false;
        }
        if (this.nextRouteToTry != null) {
            return true;
        }
        f0 f0VarF = f();
        if (f0VarF != null) {
            this.nextRouteToTry = f0VarF;
            return true;
        }
        j.b bVar = this.routeSelection;
        if ((bVar == null || !bVar.b()) && (jVar = this.routeSelector) != null) {
            return jVar.a();
        }
        return true;
    }

    public final boolean g(v url) {
        v url2 = this.address.getUrl();
        return url.getPort() == url2.getPort() && t.c(url.getHost(), url2.getHost());
    }

    public final void h(IOException e15) {
        this.nextRouteToTry = null;
        if ((e15 instanceof n) && ((n) e15).errorCode == nv.b.REFUSED_STREAM) {
            this.refusedStreamCount++;
        } else if (e15 instanceof nv.a) {
            this.connectionShutdownCount++;
        } else {
            this.otherFailureCount++;
        }
    }
}
