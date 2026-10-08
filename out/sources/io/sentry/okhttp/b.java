package io.sentry.okhttp;

import fr.t;
import fr.w;
import fv.a0;
import fv.b0;
import fv.d0;
import fv.r;
import io.sentry.c1;
import io.sentry.j1;
import io.sentry.r4;
import io.sentry.u8;
import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0016\u0018\u0000 Q2\u00020\u0001:\u0001SB)\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0007\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u00132\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ-\u0010\"\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020 0\u0017H\u0016¢\u0006\u0004\b\"\u0010#J'\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u0018H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b)\u0010\u0012J!\u0010,\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*H\u0016¢\u0006\u0004\b,\u0010-J1\u00100\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.H\u0016¢\u0006\u0004\b0\u00101J9\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\u00182\b\u0010/\u001a\u0004\u0018\u00010.2\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\b4\u00105J\u001f\u00108\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b8\u00109J\u001f\u0010:\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b:\u00109J\u0017\u0010;\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b;\u0010\u0012J\u001f\u0010>\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010=\u001a\u00020<H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b@\u0010\u0012J\u001f\u0010C\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bC\u0010DJ\u001f\u0010E\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bG\u0010\u0012J\u001f\u0010J\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bL\u0010\u0012J\u001f\u0010M\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010B\u001a\u00020AH\u0016¢\u0006\u0004\bM\u0010DJ\u001f\u0010N\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bN\u0010FJ\u0017\u0010O\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bO\u0010\u0012J\u001f\u0010P\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u00103\u001a\u000202H\u0016¢\u0006\u0004\bP\u0010FJ\u0017\u0010Q\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\bQ\u0010\u0012J\u001f\u0010R\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bR\u0010KJ\u001f\u0010S\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bS\u0010KJ\u001f\u0010U\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010T\u001a\u00020HH\u0016¢\u0006\u0004\bU\u0010KR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010VR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bP\u0010WR\u0018\u0010Y\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010X¨\u0006Z"}, d2 = {"Lio/sentry/okhttp/b;", "Lfv/r;", "Lio/sentry/c1;", "scopes", "Lkotlin/Function1;", "Lfv/e;", "originalEventListenerCreator", "<init>", "(Lio/sentry/c1;Ler/l;)V", "Lfv/r$c;", "originalEventListenerFactory", "(Lfv/r$c;)V", "", ip.a.f96138c, "()Z", "call", "Loq/i0;", "e", "(Lfv/e;)V", "Lfv/v;", "url", "o", "(Lfv/e;Lfv/v;)V", "", "Ljava/net/Proxy;", "proxies", "n", "(Lfv/e;Lfv/v;Ljava/util/List;)V", "", "domainName", "m", "(Lfv/e;Ljava/lang/String;)V", "Ljava/net/InetAddress;", "inetAddressList", "l", "(Lfv/e;Ljava/lang/String;Ljava/util/List;)V", "Ljava/net/InetSocketAddress;", "inetSocketAddress", "proxy", "i", "(Lfv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V", "B", "Lfv/t;", "handshake", "A", "(Lfv/e;Lfv/t;)V", "Lfv/a0;", "protocol", "g", "(Lfv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lfv/a0;)V", "Ljava/io/IOException;", "ioe", "h", "(Lfv/e;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lfv/a0;Ljava/io/IOException;)V", "Lfv/j;", "connection", "j", "(Lfv/e;Lfv/j;)V", "k", "t", "Lfv/b0;", "request", "s", "(Lfv/e;Lfv/b0;)V", "q", "", "byteCount", "p", "(Lfv/e;J)V", "r", "(Lfv/e;Ljava/io/IOException;)V", "y", "Lfv/d0;", "response", "x", "(Lfv/e;Lfv/d0;)V", "v", "u", "w", "c", "d", "f", "z", "b", "cachedResponse", "a", "Lio/sentry/c1;", "Ler/l;", "Lfv/r;", "originalEventListener", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class b extends r {

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final Map<fv.e, io.sentry.okhttp.a> f95250g = new ConcurrentHashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final er.l<fv.e, r> originalEventListenerCreator;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private r originalEventListener;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfv/e;", "it", "Lfv/r;", "c", "(Lfv/e;)Lfv/r;"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements er.l<fv.e, r> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r.c f95254b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(r.c cVar) {
            super(1);
            this.f95254b = cVar;
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final r b(fv.e eVar) {
            return this.f95254b.a(eVar);
        }
    }

    /* JADX INFO: renamed from: io.sentry.okhttp.b$b, reason: collision with other inner class name and from kotlin metadata */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\nR\u0014\u0010\f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u000f\u0010\rR\u0014\u0010\u0010\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0010\u0010\rR\u0014\u0010\u0011\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0011\u0010\rR\u0014\u0010\u0012\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0012\u0010\rR\u0014\u0010\u0013\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0013\u0010\rR\u0014\u0010\u0014\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0014\u0010\rR\u0014\u0010\u0015\u001a\u00020\u000b8\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0015\u0010\r¨\u0006\u0016"}, d2 = {"Lio/sentry/okhttp/b$b;", "", "<init>", "()V", "", "Lfv/e;", "Lio/sentry/okhttp/a;", "eventMap", "Ljava/util/Map;", "a", "()Ljava/util/Map;", "", "CONNECTION_EVENT", "Ljava/lang/String;", "CONNECT_EVENT", "DNS_EVENT", "PROXY_SELECT_EVENT", "REQUEST_BODY_EVENT", "REQUEST_HEADERS_EVENT", "RESPONSE_BODY_EVENT", "RESPONSE_HEADERS_EVENT", "SECURE_CONNECT_EVENT", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final Map<fv.e, io.sentry.okhttp.a> a() {
            return b.f95250g;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class c extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IOException f95255b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(IOException iOException) {
            super(1);
            this.f95255b = iOException;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            j1Var.a(u8.INTERNAL_ERROR);
            j1Var.n(this.f95255b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IOException f95256b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(IOException iOException) {
            super(1);
            this.f95256b = iOException;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            j1Var.n(this.f95256b);
            j1Var.a(u8.INTERNAL_ERROR);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class e extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ String f95257b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<InetAddress> f95258c;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/net/InetAddress;", "address", "", "c", "(Ljava/net/InetAddress;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
        static final class a extends w implements er.l<InetAddress, CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f95259b = new a();

            a() {
                super(1);
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final CharSequence b(InetAddress inetAddress) {
                return inetAddress.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(String str, List<? extends InetAddress> list) {
            super(1);
            this.f95257b = str;
            this.f95258c = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            j1Var.m("domain_name", this.f95257b);
            if (this.f95258c.isEmpty()) {
                return;
            }
            j1Var.m("dns_addresses", v.v0(this.f95258c, null, null, null, 0, null, a.f95259b, 31, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class f extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ List<Proxy> f95260b;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ljava/net/Proxy;", "proxy", "", "c", "(Ljava/net/Proxy;)Ljava/lang/CharSequence;"}, k = 3, mv = {1, 9, 0})
        static final class a extends w implements er.l<Proxy, CharSequence> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f95261b = new a();

            a() {
                super(1);
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final CharSequence b(Proxy proxy) {
                return proxy.toString();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(List<? extends Proxy> list) {
            super(1);
            this.f95260b = list;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            if (this.f95260b.isEmpty()) {
                return;
            }
            j1Var.m("proxies", v.v0(this.f95260b, null, null, null, 0, null, a.f95261b, 31, null));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class g extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f95262b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(long j15) {
            super(1);
            this.f95262b = j15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            long j15 = this.f95262b;
            if (j15 > 0) {
                j1Var.m("http.request_content_length", Long.valueOf(j15));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class h extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IOException f95263b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(IOException iOException) {
            super(1);
            this.f95263b = iOException;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            if (j1Var.d()) {
                return;
            }
            j1Var.a(u8.INTERNAL_ERROR);
            j1Var.n(this.f95263b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class i extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IOException f95264b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(IOException iOException) {
            super(1);
            this.f95264b = iOException;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            j1Var.a(u8.INTERNAL_ERROR);
            j1Var.n(this.f95264b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class j extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ long f95265b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(long j15) {
            super(1);
            this.f95265b = j15;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            long j15 = this.f95265b;
            if (j15 > 0) {
                j1Var.m("http.response_content_length", Long.valueOf(j15));
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class k extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IOException f95266b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(IOException iOException) {
            super(1);
            this.f95266b = iOException;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            if (j1Var.d()) {
                return;
            }
            j1Var.a(u8.INTERNAL_ERROR);
            j1Var.n(this.f95266b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class l extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ IOException f95267b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(IOException iOException) {
            super(1);
            this.f95267b = iOException;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            j1Var.a(u8.INTERNAL_ERROR);
            j1Var.n(this.f95267b);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lio/sentry/j1;", "it", "Loq/i0;", "c", "(Lio/sentry/j1;)V"}, k = 3, mv = {1, 9, 0})
    static final class m extends w implements er.l<j1, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f95268b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(d0 d0Var) {
            super(1);
            this.f95268b = d0Var;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(j1 j1Var) {
            c(j1Var);
            return i0.f148189a;
        }

        public final void c(j1 j1Var) {
            j1Var.m("http.response.status_code", Integer.valueOf(this.f95268b.getCode()));
            if (j1Var.b() == null) {
                j1Var.a(u8.fromHttpStatusCode(this.f95268b.getCode()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(c1 c1Var, er.l<? super fv.e, ? extends r> lVar) {
        this.scopes = c1Var;
        this.originalEventListenerCreator = lVar;
    }

    private final boolean D() {
        r rVar = this.originalEventListener;
        if (rVar instanceof b) {
            return false;
        }
        return !t.c("io.sentry.android.okhttp.SentryOkHttpEventListener", rVar != null ? rVar.getClass().getName() : null);
    }

    @Override // fv.r
    public void A(fv.e call, fv.t handshake) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.A(call, handshake);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            io.sentry.okhttp.a.e(aVar, "http.connect.secure_connect_ms", null, 2, null);
        }
    }

    @Override // fv.r
    public void B(fv.e call) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.B(call);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connect.secure_connect_ms");
        }
    }

    @Override // fv.r
    public void a(fv.e call, d0 cachedResponse) {
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.a(call, cachedResponse);
        }
    }

    @Override // fv.r
    public void b(fv.e call, d0 response) {
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.b(call, response);
        }
    }

    @Override // fv.r
    public void c(fv.e call) {
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.c(call);
        }
        io.sentry.okhttp.a aVarRemove = f95250g.remove(call);
        if (aVarRemove == null) {
            return;
        }
        io.sentry.okhttp.a.b(aVarRemove, null, 1, null);
    }

    @Override // fv.r
    public void d(fv.e call, IOException ioe) {
        io.sentry.okhttp.a aVarRemove;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.d(call, ioe);
        }
        if (D() && (aVarRemove = f95250g.remove(call)) != null) {
            aVarRemove.h(ioe.getMessage());
            aVarRemove.a(new c(ioe));
        }
    }

    @Override // fv.r
    public void e(fv.e call) {
        er.l<fv.e, r> lVar = this.originalEventListenerCreator;
        r rVarB = lVar != null ? lVar.b(call) : null;
        this.originalEventListener = rVarB;
        if (rVarB != null) {
            rVarB.e(call);
        }
        if (D()) {
            f95250g.put(call, new io.sentry.okhttp.a(this.scopes, call.getOriginalRequest()));
        }
    }

    @Override // fv.r
    public void f(fv.e call) {
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.f(call);
        }
    }

    @Override // fv.r
    public void g(fv.e call, InetSocketAddress inetSocketAddress, Proxy proxy, a0 protocol) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.g(call, inetSocketAddress, proxy, protocol);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.i(protocol != null ? protocol.name() : null);
            io.sentry.okhttp.a.e(aVar, "http.connect_ms", null, 2, null);
        }
    }

    @Override // fv.r
    public void h(fv.e call, InetSocketAddress inetSocketAddress, Proxy proxy, a0 protocol, IOException ioe) {
        a0 a0Var;
        IOException iOException;
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            a0Var = protocol;
            iOException = ioe;
            rVar.h(call, inetSocketAddress, proxy, a0Var, iOException);
        } else {
            a0Var = protocol;
            iOException = ioe;
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.i(a0Var != null ? a0Var.name() : null);
            aVar.h(iOException.getMessage());
            aVar.d("http.connect_ms", new d(iOException));
        }
    }

    @Override // fv.r
    public void i(fv.e call, InetSocketAddress inetSocketAddress, Proxy proxy) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.i(call, inetSocketAddress, proxy);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connect_ms");
        }
    }

    @Override // fv.r
    public void j(fv.e call, fv.j connection) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.j(call, connection);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connection_ms");
        }
    }

    @Override // fv.r
    public void k(fv.e call, fv.j connection) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.k(call, connection);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            io.sentry.okhttp.a.e(aVar, "http.connection_ms", null, 2, null);
        }
    }

    @Override // fv.r
    public void l(fv.e call, String domainName, List<? extends InetAddress> inetAddressList) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.l(call, domainName, inetAddressList);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.d("http.client.resolve_dns_ms", new e(domainName, inetAddressList));
        }
    }

    @Override // fv.r
    public void m(fv.e call, String domainName) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.m(call, domainName);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.client.resolve_dns_ms");
        }
    }

    @Override // fv.r
    public void n(fv.e call, fv.v url, List<? extends Proxy> proxies) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.n(call, url, proxies);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.d("http.client.proxy_select_ms", new f(proxies));
        }
    }

    @Override // fv.r
    public void o(fv.e call, fv.v url) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.o(call, url);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.client.proxy_select_ms");
        }
    }

    @Override // fv.r
    public void p(fv.e call, long byteCount) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.p(call, byteCount);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.d("http.connection.request_body_ms", new g(byteCount));
            aVar.k(byteCount);
        }
    }

    @Override // fv.r
    public void q(fv.e call) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.q(call);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connection.request_body_ms");
        }
    }

    @Override // fv.r
    public void r(fv.e call, IOException ioe) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.r(call, ioe);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.h(ioe.getMessage());
            aVar.d("http.connection.request_headers_ms", new h(ioe));
            aVar.d("http.connection.request_body_ms", new i(ioe));
        }
    }

    @Override // fv.r
    public void s(fv.e call, b0 request) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.s(call, request);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            io.sentry.okhttp.a.e(aVar, "http.connection.request_headers_ms", null, 2, null);
        }
    }

    @Override // fv.r
    public void t(fv.e call) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.t(call);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connection.request_headers_ms");
        }
    }

    @Override // fv.r
    public void u(fv.e call, long byteCount) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.u(call, byteCount);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.m(byteCount);
            aVar.d("http.connection.response_body_ms", new j(byteCount));
        }
    }

    @Override // fv.r
    public void v(fv.e call) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.v(call);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connection.response_body_ms");
        }
    }

    @Override // fv.r
    public void w(fv.e call, IOException ioe) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.w(call, ioe);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.h(ioe.getMessage());
            aVar.d("http.connection.response_headers_ms", new k(ioe));
            aVar.d("http.connection.response_body_ms", new l(ioe));
        }
    }

    @Override // fv.r
    public void x(fv.e call, d0 response) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.x(call, response);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.l(response);
            aVar.d("http.connection.response_headers_ms", new m(response));
        }
    }

    @Override // fv.r
    public void y(fv.e call) {
        io.sentry.okhttp.a aVar;
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.y(call);
        }
        if (D() && (aVar = f95250g.get(call)) != null) {
            aVar.f("http.connection.response_headers_ms");
        }
    }

    @Override // fv.r
    public void z(fv.e call, d0 response) {
        r rVar = this.originalEventListener;
        if (rVar != null) {
            rVar.z(call, response);
        }
    }

    public b(r.c cVar) {
        this(r4.b(), new a(cVar));
    }
}
