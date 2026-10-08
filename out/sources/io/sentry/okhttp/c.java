package io.sentry.okhttp;

import er.l;
import fr.k;
import fv.b0;
import fv.d0;
import fv.e0;
import fv.w;
import io.sentry.c1;
import io.sentry.e;
import io.sentry.f;
import io.sentry.h9;
import io.sentry.j0;
import io.sentry.j1;
import io.sentry.n0;
import io.sentry.n8;
import io.sentry.q7;
import io.sentry.r4;
import io.sentry.transport.n;
import io.sentry.u8;
import io.sentry.util.c0;
import io.sentry.util.l0;
import io.sentry.util.p;
import io.sentry.util.x;
import io.sentry.util.y;
import io.sentry.z6;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0016\u0018\u0000 \u00112\u00020\u0001:\u00020,BG\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b¢\u0006\u0004\b\r\u0010\u000eB\t\b\u0016¢\u0006\u0004\b\r\u0010\u000fB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J3\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ=\u0010#\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010 \u001a\u00020\u00062\b\u0010\"\u001a\u0004\u0018\u00010!H\u0002¢\u0006\u0004\b#\u0010$J)\u0010'\u001a\u00020\u001b*\u0004\u0018\u00010\u00192\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u001b0%H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010)\u001a\u00020\u00062\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00062\u0006\u0010+\u001a\u00020\u0015H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020\u00172\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00103R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u00104R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00104¨\u00065"}, d2 = {"Lio/sentry/okhttp/c;", "Lfv/w;", "Lio/sentry/c1;", "scopes", "Lio/sentry/okhttp/c$a;", "beforeSpan", "", "captureFailedRequests", "", "Lio/sentry/n0;", "failedRequestStatusCodes", "", "failedRequestTargets", "<init>", "(Lio/sentry/c1;Lio/sentry/okhttp/c$a;ZLjava/util/List;Ljava/util/List;)V", "()V", "(Lio/sentry/c1;)V", "e", "()Z", "Lfv/b0;", "request", "", "code", "Lfv/d0;", "response", "", "startTimestamp", "Loq/i0;", "f", "(Lfv/b0;Ljava/lang/Integer;Lfv/d0;J)V", "Lio/sentry/j1;", "span", "isFromEventListener", "Lio/sentry/okhttp/a;", "okHttpEvent", "c", "(Lio/sentry/j1;Lfv/b0;Lfv/d0;ZLio/sentry/okhttp/a;)V", "Lkotlin/Function1;", "fn", "d", "(Ljava/lang/Long;Ler/l;)V", "g", "(Lfv/b0;Lfv/d0;)Z", "statusCode", "b", "(I)Z", "Lfv/w$a;", "chain", "a", "(Lfv/w$a;)Lfv/d0;", "Lio/sentry/c1;", "Z", "Ljava/util/List;", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
public class c implements w {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b f95269e = new b(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final boolean captureFailedRequests;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<n0> failedRequestStatusCodes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<String> failedRequestTargets;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lio/sentry/okhttp/c$a;", "", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/sentry/okhttp/c$b;", "", "<init>", "()V", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(k kVar) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.okhttp.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class C2238c extends fr.w implements l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f95274b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2238c(f fVar) {
            super(1);
            this.f95274b = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Long l15) {
            c(l15.longValue());
            return i0.f148189a;
        }

        public final void c(long j15) {
            this.f95274b.A("http.request_content_length", Long.valueOf(j15));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "responseBodySize", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class d extends fr.w implements l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f95275b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f fVar) {
            super(1);
            this.f95275b = fVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Long l15) {
            c(l15.longValue());
            return i0.f148189a;
        }

        public final void c(long j15) {
            this.f95275b.A("http.response_content_length", Long.valueOf(j15));
        }
    }

    static {
        z6.d().b("maven:io.sentry:sentry-okhttp", "8.22.0");
    }

    public c(c1 c1Var, a aVar, boolean z15, List<n0> list, List<String> list2) {
        this.scopes = c1Var;
        this.captureFailedRequests = z15;
        this.failedRequestStatusCodes = list;
        this.failedRequestTargets = list2;
        p.a("OkHttp");
    }

    private final boolean b(int statusCode) {
        Iterator<n0> it = this.failedRequestStatusCodes.iterator();
        while (it.hasNext()) {
            if (it.next().a(statusCode)) {
                return true;
            }
        }
        return false;
    }

    private final void c(j1 span, b0 request, d0 response, boolean isFromEventListener, io.sentry.okhttp.a okHttpEvent) {
        if (span == null) {
            if (okHttpEvent != null) {
                io.sentry.okhttp.a.b(okHttpEvent, null, 1, null);
            }
        } else {
            if (!isFromEventListener) {
                span.g();
            }
            if (okHttpEvent != null) {
                io.sentry.okhttp.a.b(okHttpEvent, null, 1, null);
            }
        }
    }

    private final void d(Long l15, l<? super Long, i0> lVar) {
        if (l15 == null || l15.longValue() == -1) {
            return;
        }
        lVar.b(l15);
    }

    private final boolean e() {
        return c0.b(this.scopes.s().getIgnoredSpanOrigins(), "auto.http.okhttp");
    }

    private final void f(b0 request, Integer code, d0 response, long startTimestamp) {
        f fVarW = f.w(request.getUrl().getUrl(), request.getMethod(), code);
        fv.c0 body = request.getBody();
        d(body != null ? Long.valueOf(body.a()) : null, new C2238c(fVarW));
        j0 j0Var = new j0();
        j0Var.k("okHttp:request", request);
        if (response != null) {
            e0 body2 = response.getBody();
            d(body2 != null ? Long.valueOf(body2.getContentLength()) : null, new d(fVarW));
            j0Var.k("okHttp:response", response);
        }
        fVarW.A("http.start_timestamp", Long.valueOf(startTimestamp));
        fVarW.A("http.end_timestamp", Long.valueOf(n.b().a()));
        this.scopes.q(fVarW, j0Var);
    }

    private final boolean g(b0 request, d0 response) {
        return this.captureFailedRequests && b(response.getCode()) && y.a(this.failedRequestTargets, request.getUrl().getUrl());
    }

    /* JADX WARN: Code duplicated, block: B:77:0x016c  */
    /* JADX WARN: Code duplicated, block: B:80:0x0178  */
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
    @Override // fv.w
    public d0 a(w.a chain) throws Throwable {
        j1 j1VarZ;
        io.sentry.okhttp.a aVar;
        d0 d0VarA;
        b0 b0Var;
        b0 b0VarC = chain.getRequest();
        l0.a aVarC = l0.c(b0VarC.getUrl().getUrl());
        String strF = aVarC.f();
        String method = b0VarC.getMethod();
        io.sentry.okhttp.b.Companion companion = io.sentry.okhttp.b.INSTANCE;
        d0 d0Var = null;
        numValueOf = null;
        Integer numValueOf = null;
        if (companion.a().containsKey(chain.call())) {
            io.sentry.okhttp.a aVar2 = companion.a().get(chain.call());
            j1VarZ = aVar2 != null ? aVar2.getCallSpan() : null;
            aVar = aVar2;
        } else {
            j1 j1VarU = x.a() ? this.scopes.u() : this.scopes.a();
            if (j1VarU != null) {
                j1VarZ = j1VarU.z("http.client", method + ' ' + strF);
            } else {
                j1VarZ = null;
            }
            aVar = null;
        }
        long jA = n.b().a();
        n8 n8VarW = j1VarZ != null ? j1VarZ.w() : null;
        if (n8VarW != null) {
            n8VarW.r("auto.http.okhttp");
        }
        aVarC.b(j1VarZ);
        boolean z15 = aVar != null;
        try {
            try {
                b0.a aVarI = b0VarC.i();
                if (!e()) {
                    try {
                        io.sentry.util.i0.c cVarL = io.sentry.util.i0.l(this.scopes, b0VarC.getUrl().getUrl(), b0VarC.f("baggage"), j1VarZ);
                        if (cVarL != null) {
                            aVarI.a(cVarL.b().a(), cVarL.b().b());
                            e eVarA = cVarL.a();
                            if (eVarA != null) {
                                aVarI.h("baggage");
                                aVarI.a(eVarA.b(), eVarA.c());
                            }
                            h9 h9VarC = cVarL.c();
                            if (h9VarC != null) {
                                aVarI.a(h9VarC.a(), h9VarC.b());
                            }
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        d0VarA = null;
                        z15 = z15;
                        if (aVar != null) {
                            aVar.j(b0VarC);
                        }
                        b0Var = b0VarC;
                        c(j1VarZ, b0Var, d0VarA, z15, aVar);
                        if (!z15) {
                            f(b0Var, numValueOf, d0VarA, jA);
                        }
                        throw th;
                    }
                }
                b0VarC = aVarI.b();
                d0VarA = chain.a(b0VarC);
                try {
                    try {
                        int code = d0VarA.getCode();
                        numValueOf = Integer.valueOf(code);
                        if (j1VarZ != null) {
                            j1VarZ.m("http.response.status_code", numValueOf);
                        }
                        if (j1VarZ != null) {
                            try {
                                j1VarZ.a(u8.fromHttpStatusCode(code));
                            } catch (Throwable th5) {
                                th = th5;
                                j1VarZ = j1VarZ;
                                z15 = z15;
                                if (aVar != null) {
                                    aVar.j(b0VarC);
                                }
                                b0Var = b0VarC;
                                c(j1VarZ, b0Var, d0VarA, z15, aVar);
                                if (!z15) {
                                    f(b0Var, numValueOf, d0VarA, jA);
                                }
                                throw th;
                            }
                        }
                        if (g(b0VarC, d0VarA)) {
                            if (!z15 || aVar == null) {
                                io.sentry.okhttp.d.f95276a.a(this.scopes, b0VarC, d0VarA);
                            } else {
                                aVar.g(d0VarA);
                            }
                        }
                        if (aVar != null) {
                            aVar.j(b0VarC);
                        }
                        boolean z16 = z15;
                        c(j1VarZ, b0VarC, d0VarA, z16, aVar);
                        if (!z16) {
                            f(b0VarC, numValueOf, d0VarA, jA);
                        }
                        return d0VarA;
                    } catch (Throwable th6) {
                        th = th6;
                        z15 = z15;
                        if (aVar != null) {
                            aVar.j(b0VarC);
                        }
                        b0Var = b0VarC;
                        c(j1VarZ, b0Var, d0VarA, z15, aVar);
                        if (!z15) {
                            f(b0Var, numValueOf, d0VarA, jA);
                        }
                        throw th;
                    }
                } catch (IOException e15) {
                    e = e15;
                    d0Var = d0VarA;
                    if (j1VarZ != 0) {
                        try {
                            j1VarZ.n(e);
                            j1VarZ.a(u8.INTERNAL_ERROR);
                        } catch (Throwable th7) {
                            th = th7;
                            d0VarA = d0Var;
                            numValueOf = null;
                            if (aVar != null) {
                                aVar.j(b0VarC);
                            }
                            b0Var = b0VarC;
                            c(j1VarZ, b0Var, d0VarA, z15, aVar);
                            if (!z15) {
                                f(b0Var, numValueOf, d0VarA, jA);
                            }
                            throw th;
                        }
                    }
                    throw e;
                }
            } catch (Throwable th8) {
                th = th8;
                j1VarZ = j1VarZ;
                z15 = z15;
                d0VarA = null;
            }
        } catch (IOException e16) {
            e = e16;
        }
    }

    public /* synthetic */ c(c1 c1Var, a aVar, boolean z15, List list, List list2, int i15, k kVar) {
        this((i15 & 1) != 0 ? r4.b() : c1Var, (i15 & 2) != 0 ? null : aVar, (i15 & 4) != 0 ? true : z15, (i15 & 8) != 0 ? v.e(new n0(500, 599)) : list, (i15 & 16) != 0 ? v.e(q7.DEFAULT_PROPAGATION_TARGETS) : list2);
    }

    public c() {
        this(r4.b());
    }

    public c(c1 c1Var) {
        this(c1Var, null, false, null, null, 28, null);
    }
}
