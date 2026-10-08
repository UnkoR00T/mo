package r00;

import ay.k;
import ay.n;
import dx.i;
import er.l;
import er.p;
import fr.t;
import fv.b0;
import fv.d0;
import fv.z;
import java.io.EOFException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ju.d2;
import ju.h2;
import ju.p0;
import ju.q0;
import ju.z2;
import lu.g;
import lu.j;
import mu.a0;
import mu.h;
import mu.h0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000\u009f\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0012\u0018\u00002\u00020\u0001:\u000263B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0017\u001a\u00020\u0015*\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JH\u0010\"\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u00112\u0018\u0010\u001e\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b0\u001a2\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00110\u00102\u0006\u0010!\u001a\u00020 H\u0082@¢\u0006\u0004\b\"\u0010#J)\u0010)\u001a\u00020\u001c2\b\u0010%\u001a\u0004\u0018\u00010$2\u000e\u0010(\u001a\n\u0018\u00010&j\u0004\u0018\u0001`'H\u0002¢\u0006\u0004\b)\u0010*JB\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\u0006\u0010+\u001a\u00020 2\u0006\u0010!\u001a\u00020 2\u0014\u0010-\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 \u0018\u00010,H\u0096@¢\u0006\u0004\b.\u0010/J!\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0,00H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001d2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u00108R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R \u0010A\u001a\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R&\u0010D\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020 0,008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010H\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010L\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR\u0014\u0010N\u001a\u00020I8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010K¨\u0006O"}, d2 = {"Lr00/c;", "Lay/n;", "Lfv/b0$a;", "requestBuilder", "Lay/a;", "baseUrlProvider", "Lpx/d;", "remoteLogger", "Lay/k;", "networkConnectionManager", "Lfv/z;", "client", "Lxw/d;", "dispatcherProvider", "<init>", "(Lfv/b0$a;Lay/a;Lpx/d;Lay/k;Lfv/z;Lxw/d;)V", "Llu/g;", "Lr00/c$a;", "r00/c$e", "p", "(Llu/g;)Lr00/c$e;", "Lju/d2;", "connectionJob", "o", "(Llu/g;Lju/d2;)Lju/d2;", "connectionOperation", "Lju/n;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "continuation", "operationChannel", "", "connectionId", "s", "(Lr00/c$a;Lju/n;Llu/g;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lfv/d0;", "response", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "q", "(Lfv/d0;Ljava/lang/Exception;)Ldx/b;", "endpoint", "", "additionalHeaders", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ltq/e;)Ljava/lang/Object;", "Lmu/a0;", "r", "()Lmu/a0;", "a", "(Ljava/lang/String;)V", "Lfv/b0$a;", "b", "Lay/a;", "Lpx/d;", "d", "Lay/k;", "e", "Lfv/z;", "", "Lr00/c$b;", "f", "Ljava/util/Map;", "activeConnections", "g", "Lmu/a0;", "connectionEventFlow", "Lju/p0;", "h", "Lju/p0;", "scope", "Lsu/a;", "i", "Lsu/a;", "connectMutex", "j", "updateEventFlowMutex", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0.a requestBuilder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ay.a baseUrlProvider;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final k networkConnectionManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final z client;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final Map<String, b> activeConnections;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a0<Map<String, String>> connectionEventFlow;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final su.a connectMutex;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final su.a updateEventFlowMutex;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lr00/c$a;", "", "c", "b", "a", "Lr00/c$a$a;", "Lr00/c$a$b;", "Lr00/c$a$c;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: r00.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr00/c$a$a;", "Lr00/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4300a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4300a f170034a = new C4300a();

            private C4300a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4300a);
            }

            public int hashCode() {
                return -1482999306;
            }

            public String toString() {
                return "Close";
            }
        }

        /* JADX INFO: renamed from: r00.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0017\u001a\u0004\b\u0013\u0010\u0018¨\u0006\u0019"}, d2 = {"Lr00/c$a$b;", "Lr00/c$a;", "", "throwable", "Lfv/d0;", "response", "<init>", "(Ljava/lang/Throwable;Lfv/d0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Throwable;", "b", "()Ljava/lang/Throwable;", "Lfv/d0;", "()Lfv/d0;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class HandleFailure implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Throwable throwable;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final d0 response;

            public HandleFailure(Throwable th4, d0 d0Var) {
                this.throwable = th4;
                this.response = d0Var;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final d0 getResponse() {
                return this.response;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Throwable getThrowable() {
                return this.throwable;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof HandleFailure)) {
                    return false;
                }
                HandleFailure handleFailure = (HandleFailure) other;
                return t.c(this.throwable, handleFailure.throwable) && t.c(this.response, handleFailure.response);
            }

            public int hashCode() {
                Throwable th4 = this.throwable;
                int iHashCode = (th4 == null ? 0 : th4.hashCode()) * 31;
                d0 d0Var = this.response;
                return iHashCode + (d0Var != null ? d0Var.hashCode() : 0);
            }

            public String toString() {
                return "HandleFailure(throwable=" + this.throwable + ", response=" + this.response + ')';
            }
        }

        /* JADX INFO: renamed from: r00.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lr00/c$a$c;", "Lr00/c$a;", "", "data", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadData implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String data;

            public ReadData(String str) {
                this.data = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof ReadData) && t.c(this.data, ((ReadData) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "ReadData(data=" + this.data + ')';
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001:\u0002\n\u0007B\u0017\b\u0004\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0007\u0010\t\u0082\u0001\u0002\u000b\f¨\u0006\r"}, d2 = {"Lr00/c$b;", "", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Ler/a;)V", "a", "Ler/a;", "()Ler/a;", "b", "Lr00/c$b$a;", "Lr00/c$b$b;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static abstract class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> onClose;

        /* JADX INFO: renamed from: r00.c$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001f¨\u0006 "}, d2 = {"Lr00/c$b$a;", "Lr00/c$b;", "Lkotlin/Function0;", "Loq/i0;", "onClose", "Lju/d2;", "job", "Luv/a;", "eventSource", "<init>", "(Ler/a;Lju/d2;Luv/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "a", "()Ler/a;", "c", "Lju/d2;", "()Lju/d2;", "d", "Luv/a;", "()Luv/a;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Active extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onClose;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final d2 job;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final uv.a eventSource;

            public Active(er.a<i0> aVar, d2 d2Var, uv.a aVar2) {
                super(aVar, null);
                this.onClose = aVar;
                this.job = d2Var;
                this.eventSource = aVar2;
            }

            @Override // r00.c.b
            public er.a<i0> a() {
                return this.onClose;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final uv.a getEventSource() {
                return this.eventSource;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final d2 getJob() {
                return this.job;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Active)) {
                    return false;
                }
                Active active = (Active) other;
                return t.c(this.onClose, active.onClose) && t.c(this.job, active.job) && t.c(this.eventSource, active.eventSource);
            }

            public int hashCode() {
                return (((this.onClose.hashCode() * 31) + this.job.hashCode()) * 31) + this.eventSource.hashCode();
            }

            public String toString() {
                return "Active(onClose=" + this.onClose + ", job=" + this.job + ", eventSource=" + this.eventSource + ')';
            }
        }

        /* JADX INFO: renamed from: r00.c$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lr00/c$b$b;", "Lr00/c$b;", "Lkotlin/Function0;", "Loq/i0;", "onClose", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "b", "Ler/a;", "a", "()Ler/a;", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initial extends b {

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onClose;

            public Initial(er.a<i0> aVar) {
                super(aVar, null);
                this.onClose = aVar;
            }

            @Override // r00.c.b
            public er.a<i0> a() {
                return this.onClose;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Initial) && t.c(this.onClose, ((Initial) other).onClose);
            }

            public int hashCode() {
                return this.onClose.hashCode();
            }

            public String toString() {
                return "Initial(onClose=" + this.onClose + ')';
            }
        }

        public /* synthetic */ b(er.a aVar, fr.k kVar) {
            this(aVar);
        }

        public er.a<i0> a() {
            return this.onClose;
        }

        private b(er.a<i0> aVar) {
            this.onClose = aVar;
        }
    }

    /* JADX INFO: renamed from: r00.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C4303c extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170045g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170046h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170047j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f170048k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f170049l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f170050m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ String f170052p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ ju.n<i<? extends dx.b, i0>> f170053q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ String f170054r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ Map<String, String> f170055s;

        /* JADX INFO: renamed from: r00.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a implements l<Throwable, i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c f170056a;

            a(c cVar) {
                this.f170056a = cVar;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(Throwable th4) {
                c(th4);
                return i0.f148189a;
            }

            public final void c(Throwable th4) {
                px.f.f163100a.b("SSEManager connection job completed. Cause: " + th4, px.c.a(this.f170056a));
            }
        }

        /* JADX INFO: renamed from: r00.c$c$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f170057e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f170058f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f170059g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ g<a> f170060h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            final /* synthetic */ c f170061j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ ju.n<i<? extends dx.b, i0>> f170062k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ String f170063l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            b(g<a> gVar, c cVar, ju.n<? super i<? extends dx.b, i0>> nVar, String str, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f170060h = gVar;
                this.f170061j = cVar;
                this.f170062k = nVar;
                this.f170063l = str;
            }

            /* JADX WARN: Code duplicated, block: B:15:0x0042  */
            /* JADX WARN: Code duplicated, block: B:18:0x004d  */
            /* JADX WARN: Code duplicated, block: B:21:0x006e  */
            /* JADX WARN: Code restructure failed: missing block: B:19:0x006b, code lost:
            
                if (r4.s(r5, r6, r7, r8, r11) == r0) goto L20;
             */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:19:0x006b -> B:7:0x0019). Please report as a decompilation issue!!! */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
                /*
                    r11 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r11.f170059g
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L2b
                    if (r1 == r3) goto L23
                    if (r1 != r2) goto L1b
                    java.lang.Object r1 = r11.f170058f
                    r00.c$a r1 = (r00.c.a) r1
                    java.lang.Object r1 = r11.f170057e
                    lu.i r1 = (lu.i) r1
                    oq.u.b(r12)
                L19:
                    r12 = r1
                    goto L34
                L1b:
                    java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r12.<init>(r0)
                    throw r12
                L23:
                    java.lang.Object r1 = r11.f170057e
                    lu.i r1 = (lu.i) r1
                    oq.u.b(r12)
                    goto L45
                L2b:
                    oq.u.b(r12)
                    lu.g<r00.c$a> r12 = r11.f170060h
                    lu.i r12 = r12.iterator()
                L34:
                    r11.f170057e = r12
                    r1 = 0
                    r11.f170058f = r1
                    r11.f170059g = r3
                    java.lang.Object r1 = r12.a(r11)
                    if (r1 != r0) goto L42
                    goto L6d
                L42:
                    r10 = r1
                    r1 = r12
                    r12 = r10
                L45:
                    java.lang.Boolean r12 = (java.lang.Boolean) r12
                    boolean r12 = r12.booleanValue()
                    if (r12 == 0) goto L6e
                    java.lang.Object r12 = r1.next()
                    r5 = r12
                    r00.c$a r5 = (r00.c.a) r5
                    r00.c r4 = r11.f170061j
                    ju.n<dx.i<? extends dx.b, oq.i0>> r6 = r11.f170062k
                    lu.g<r00.c$a> r7 = r11.f170060h
                    java.lang.String r8 = r11.f170063l
                    r11.f170057e = r1
                    java.lang.Object r12 = vq.j.a(r5)
                    r11.f170058f = r12
                    r11.f170059g = r2
                    r9 = r11
                    java.lang.Object r12 = r00.c.n(r4, r5, r6, r7, r8, r9)
                    if (r12 != r0) goto L19
                L6d:
                    return r0
                L6e:
                    oq.i0 r12 = oq.i0.f148189a
                    return r12
                */
                throw new UnsupportedOperationException("Method not decompiled: r00.c.C4303c.b.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f170060h, this.f170061j, this.f170062k, this.f170063l, eVar);
            }
        }

        /* JADX INFO: renamed from: r00.c$c$c, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class C4304c implements er.a<i0> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ g<a> f170064a;

            C4304c(g<a> gVar) {
                this.f170064a = gVar;
            }

            @Override // er.a
            public /* bridge */ /* synthetic */ i0 a() {
                c();
                return i0.f148189a;
            }

            public final void c() {
                this.f170064a.d(a.C4300a.f170034a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C4303c(String str, ju.n<? super i<? extends dx.b, i0>> nVar, String str2, Map<String, String> map, tq.e<? super C4303c> eVar) {
            super(2, eVar);
            this.f170052p = str;
            this.f170053q = nVar;
            this.f170054r = str2;
            this.f170055s = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c cVar;
            String str;
            Map<String, String> map;
            su.a aVar;
            ju.n<i<? extends dx.b, i0>> nVar;
            String str2;
            Object objE = uq.b.e();
            int i15 = this.f170050m;
            if (i15 == 0) {
                u.b(obj);
                su.a aVar2 = c.this.connectMutex;
                cVar = c.this;
                String str3 = this.f170052p;
                ju.n<i<? extends dx.b, i0>> nVar2 = this.f170053q;
                str = this.f170054r;
                Map<String, String> map2 = this.f170055s;
                this.f170043e = aVar2;
                this.f170044f = cVar;
                this.f170045g = str3;
                this.f170046h = nVar2;
                this.f170047j = str;
                this.f170048k = map2;
                this.f170049l = 0;
                this.f170050m = 1;
                if (aVar2.h(null, this) == objE) {
                    return objE;
                }
                map = map2;
                aVar = aVar2;
                nVar = nVar2;
                str2 = str3;
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                map = (Map) this.f170048k;
                str = (String) this.f170047j;
                ju.n<i<? extends dx.b, i0>> nVar3 = (ju.n) this.f170046h;
                String str4 = (String) this.f170045g;
                cVar = (c) this.f170044f;
                su.a aVar3 = (su.a) this.f170043e;
                u.b(obj);
                str2 = str4;
                aVar = aVar3;
                nVar = nVar3;
            }
            try {
                if (cVar.activeConnections.containsKey(str2)) {
                    px.f.f163100a.b("SSEManager event source with id " + str2 + " already active.", px.c.a(cVar));
                    oq.t.Companion companion = oq.t.INSTANCE;
                    nVar.i(oq.t.b(new i.Right(i0.f148189a)));
                } else {
                    g gVarB = j.b(Integer.MAX_VALUE, null, null, 6, null);
                    C4304c c4304c = new C4304c(gVarB);
                    cVar.activeConnections.put(str2, new b.Initial(c4304c));
                    ju.a0 a0VarB = h2.b(null, 1, null);
                    a0VarB.C0(new a(cVar));
                    cVar.o(gVarB, a0VarB);
                    e eVarP = cVar.p(gVarB);
                    try {
                        b0.a aVarK = cVar.requestBuilder.k(cVar.baseUrlProvider.getBaseUrl() + str);
                        if (map != null) {
                            for (Map.Entry<String, String> entry : map.entrySet()) {
                                aVarK.d(entry.getKey(), entry.getValue());
                            }
                        }
                        cVar.activeConnections.put(str2, new b.Active(c4304c, a0VarB, uv.d.b(cVar.client).a(aVarK.b(), eVarP)));
                        px.f.f163100a.b("SSEManager created connection " + str2, px.c.a(cVar));
                    } catch (Exception e15) {
                        px.b.y5(cVar.remoteLogger, "SSEManager create connection error on " + str + ".\nException: " + e15, null, px.c.a(cVar), 2, null);
                        cVar.activeConnections.remove(str2);
                        if (nVar.h()) {
                            oq.t.Companion companion2 = oq.t.INSTANCE;
                            nVar.i(oq.t.b(new i.Left(new dx.b.Generic(e15))));
                        }
                    }
                    ju.k.d(cVar.scope, a0VarB, null, new b(gVarB, cVar, nVar, str2, null), 2, null);
                }
                i0 i0Var = i0.f148189a;
                aVar.r(null);
                return i0.f148189a;
            } catch (Throwable th4) {
                aVar.r(null);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C4303c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new C4303c(this.f170052p, this.f170053q, this.f170054r, this.f170055s, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f170065e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ g<a> f170067g;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "<anonymous>", "(Z)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements p<Boolean, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f170068e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g<a> f170069f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(g<a> gVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f170069f = gVar;
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ Object B(Boolean bool, tq.e<? super i0> eVar) {
                return M(bool.booleanValue(), eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f170068e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                this.f170069f.d(new a.HandleFailure(new r00.a(), null));
                return i0.f148189a;
            }

            public final Object M(boolean z15, tq.e<? super i0> eVar) {
                return ((a) v(Boolean.valueOf(z15), eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f170069f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class b implements mu.g<Boolean> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.g f170070a;

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class a<T> implements h {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ h f170071a;

                /* JADX INFO: renamed from: r00.c$d$b$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                public static final class C4305a extends vq.d {

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    /* synthetic */ Object f170072d;

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f170073e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    Object f170074f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    Object f170075g;

                    /* JADX INFO: renamed from: j, reason: collision with root package name */
                    Object f170077j;

                    /* JADX INFO: renamed from: k, reason: collision with root package name */
                    Object f170078k;

                    /* JADX INFO: renamed from: l, reason: collision with root package name */
                    int f170079l;

                    public C4305a(tq.e eVar) {
                        super(eVar);
                    }

                    @Override // vq.a
                    public final Object J(Object obj) {
                        this.f170072d = obj;
                        this.f170073e |= PKIFailureInfo.systemUnavail;
                        return a.this.F(null, this);
                    }
                }

                public a(h hVar) {
                    this.f170071a = hVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // mu.h
                public final Object F(Object obj, tq.e eVar) throws Throwable {
                    C4305a c4305a;
                    if (eVar instanceof C4305a) {
                        c4305a = (C4305a) eVar;
                        int i15 = c4305a.f170073e;
                        if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                            c4305a.f170073e = i15 - PKIFailureInfo.systemUnavail;
                        } else {
                            c4305a = new C4305a(eVar);
                        }
                    } else {
                        c4305a = new C4305a(eVar);
                    }
                    Object obj2 = c4305a.f170072d;
                    Object objE = uq.b.e();
                    int i16 = c4305a.f170073e;
                    if (i16 == 0) {
                        u.b(obj2);
                        h hVar = this.f170071a;
                        if (!((Boolean) obj).booleanValue()) {
                            c4305a.f170074f = vq.j.a(obj);
                            c4305a.f170075g = vq.j.a(c4305a);
                            c4305a.f170077j = vq.j.a(obj);
                            c4305a.f170078k = vq.j.a(hVar);
                            c4305a.f170079l = 0;
                            c4305a.f170073e = 1;
                            if (hVar.F(obj, c4305a) == objE) {
                                return objE;
                            }
                        }
                    } else {
                        if (i16 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj2);
                    }
                    return i0.f148189a;
                }
            }

            public b(mu.g gVar) {
                this.f170070a = gVar;
            }

            @Override // mu.g
            public Object a(h<? super Boolean> hVar, tq.e eVar) {
                Object objA = this.f170070a.a(new a(hVar), eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(g<a> gVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f170067g = gVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f170065e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            mu.i.S(new b(c.this.networkConnectionManager.d()), new a(this.f170067g, null));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return c.this.new d(this.f170067g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J3\u0010\t\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0006\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\t\u0010\nJ+\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"r00/c$e", "Luv/b;", "Luv/a;", "eventSource", "", "id", "type", "data", "Loq/i0;", "b", "(Luv/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "t", "Lfv/d0;", "response", "c", "(Luv/a;Ljava/lang/Throwable;Lfv/d0;)V", "a", "(Luv/a;)V", "network_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e extends uv.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ g<a> f170080a;

        e(g<a> gVar) {
            this.f170080a = gVar;
        }

        @Override // uv.b
        public void a(uv.a eventSource) {
            this.f170080a.d(a.C4300a.f170034a);
        }

        @Override // uv.b
        public void b(uv.a eventSource, String id5, String type, String data) {
            this.f170080a.d(new a.ReadData(data));
        }

        @Override // uv.b
        public void c(uv.a eventSource, Throwable t15, d0 response) {
            this.f170080a.d(new a.HandleFailure(t15, response));
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f170081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f170082e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f170083f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f170084g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f170085h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f170086j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f170087k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f170088l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f170089m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Object f170090n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f170091p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f170092q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f170093r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        /* synthetic */ Object f170094s;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        int f170096v;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f170094s = obj;
            this.f170096v |= PKIFailureInfo.systemUnavail;
            return c.this.s(null, null, null, null, this);
        }
    }

    public c(b0.a aVar, ay.a aVar2, px.d dVar, k kVar, z zVar, xw.d dVar2) {
        this.requestBuilder = aVar;
        this.baseUrlProvider = aVar2;
        this.remoteLogger = dVar;
        this.networkConnectionManager = kVar;
        this.client = zVar;
        this.activeConnections = new LinkedHashMap();
        this.connectionEventFlow = h0.b(1, 0, null, 6, null);
        this.scope = q0.a(dVar2.getIo().n0(z2.b(null, 1, null)));
        this.connectMutex = su.g.b(false, 1, null);
        this.updateEventFlowMutex = su.g.b(false, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d2 o(g<a> gVar, d2 d2Var) {
        return ju.k.d(this.scope, d2Var, null, new d(gVar, null), 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e p(g<a> gVar) {
        return new e(gVar);
    }

    private final dx.b q(d0 response, Exception exception) {
        dx.b.g.Http.a next;
        if (exception instanceof SocketTimeoutException) {
            return dx.b.g.f.f45079a;
        }
        if ((exception instanceof InterruptedIOException) || (exception instanceof EOFException)) {
            return dx.b.g.h.f45081a;
        }
        if ((exception instanceof r00.a) || !this.networkConnectionManager.e()) {
            return dx.b.g.e.f45078a;
        }
        if (response == null) {
            if (exception == null) {
                exception = new Exception("SSEManager unknown connection failure");
            }
            return new dx.b.Generic(exception);
        }
        Iterator<dx.b.g.Http.a> it = dx.b.g.Http.a.g().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (next.getCode() != response.getCode());
        dx.b.g.Http.a aVar = next;
        if (aVar == null) {
            aVar = dx.b.g.Http.a.UNKNOWN;
        }
        return new dx.b.g.Http(null, aVar, response.getMessage(), null, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:118:0x0306 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x01ba A[Catch: all -> 0x00ee, TryCatch #2 {all -> 0x00ee, blocks: (B:26:0x00e9, B:51:0x0219, B:45:0x01ac, B:47:0x01ba, B:48:0x01be), top: B:114:0x0032 }] */
    /* JADX WARN: Code duplicated, block: B:50:0x0217  */
    /* JADX WARN: Code duplicated, block: B:75:0x02d4 A[Catch: all -> 0x0308, TryCatch #0 {all -> 0x0308, blocks: (B:73:0x02c6, B:75:0x02d4, B:76:0x02e1, B:78:0x02e7, B:80:0x02f7, B:86:0x0315, B:85:0x030f), top: B:110:0x02c6 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x02e7 A[Catch: all -> 0x0308, TryCatch #0 {all -> 0x0308, blocks: (B:73:0x02c6, B:75:0x02d4, B:76:0x02e1, B:78:0x02e7, B:80:0x02f7, B:86:0x0315, B:85:0x030f), top: B:110:0x02c6 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x02f7 A[Catch: all -> 0x0308, TryCatch #0 {all -> 0x0308, blocks: (B:73:0x02c6, B:75:0x02d4, B:76:0x02e1, B:78:0x02e7, B:80:0x02f7, B:86:0x0315, B:85:0x030f), top: B:110:0x02c6 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x030f A[Catch: all -> 0x0308, TryCatch #0 {all -> 0x0308, blocks: (B:73:0x02c6, B:75:0x02d4, B:76:0x02e1, B:78:0x02e7, B:80:0x02f7, B:86:0x0315, B:85:0x030f), top: B:110:0x02c6 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x034a  */
    /* JADX WARN: Code duplicated, block: B:8:0x001e  */
    /* JADX WARN: Code duplicated, block: B:92:0x035a A[Catch: all -> 0x0068, TryCatch #1 {all -> 0x0068, blocks: (B:17:0x0063, B:90:0x034f, B:92:0x035a, B:93:0x036a), top: B:112:0x0063 }] */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0285, code lost:
    
        if (s(r2, r3, r21, r22, r6) == r7) goto L88;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v17 */
    /* JADX WARN: Type inference failed for: r14v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, r00.c] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, ju.n, tq.e] */
    /* JADX WARN: Type inference failed for: r3v1, types: [su.a] */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v19 */
    /* JADX WARN: Type inference failed for: r3v20 */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v4, types: [su.a] */
    /* JADX WARN: Type inference failed for: r3v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [ju.n, tq.e] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(r00.c.a r19, ju.n<? super dx.i<? extends dx.b, oq.i0>> r20, lu.g<r00.c.a> r21, java.lang.String r22, tq.e<? super oq.i0> r23) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 980
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r00.c.s(r00.c$a, ju.n, lu.g, java.lang.String, tq.e):java.lang.Object");
    }

    @Override // ay.n
    public void a(String connectionId) {
        b bVar = this.activeConnections.get(connectionId);
        if (bVar == null) {
            return;
        }
        bVar.a().a();
    }

    @Override // ay.n
    public Object c(String str, String str2, Map<String, String> map, tq.e<? super i<? extends dx.b, i0>> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        ju.k.d(this.scope, null, null, new C4303c(str2, pVar, str, map, null), 3, null);
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    @Override // ay.n
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public a0<Map<String, String>> b() {
        return this.connectionEventFlow;
    }

    public /* synthetic */ c(b0.a aVar, ay.a aVar2, px.d dVar, k kVar, z zVar, xw.d dVar2, int i15, fr.k kVar2) {
        this((i15 & 1) != 0 ? new b0.a() : aVar, aVar2, dVar, kVar, zVar, dVar2);
    }
}
