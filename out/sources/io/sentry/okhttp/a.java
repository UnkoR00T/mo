package io.sentry.okhttp;

import er.l;
import fv.b0;
import fv.d0;
import io.sentry.c1;
import io.sentry.f;
import io.sentry.j0;
import io.sentry.j1;
import io.sentry.n5;
import io.sentry.n8;
import io.sentry.transport.n;
import io.sentry.util.l0;
import io.sentry.util.x;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0017\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\u000eJ\u0017\u0010\u001a\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u001a\u0010\u0012J\u0015\u0010\u001c\u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f¢\u0006\u0004\b\u001c\u0010\u0012J-\u0010 \u001a\u00020\b2\u0006\u0010\u001b\u001a\u00020\u000f2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d¢\u0006\u0004\b \u0010!J%\u0010\"\u001a\u00020\b2\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b\u0018\u00010\u001d¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020(0'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010.\u001a\u00020,8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010-R\u001c\u00102\u001a\u0004\u0018\u00010\u001e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b)\u00101R\u0018\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u00103R\u0018\u00104\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0018\u00103R\u001a\u00109\u001a\u0002058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u00106\u001a\u0004\b7\u00108R\u0016\u0010;\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010:R\u0016\u0010<\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010:¨\u0006="}, d2 = {"Lio/sentry/okhttp/a;", "", "Lio/sentry/c1;", "scopes", "Lfv/b0;", "request", "<init>", "(Lio/sentry/c1;Lfv/b0;)V", "Loq/i0;", "j", "(Lfv/b0;)V", "Lfv/d0;", "response", "l", "(Lfv/d0;)V", "", "protocolName", "i", "(Ljava/lang/String;)V", "", "byteCount", "k", "(J)V", "m", "g", "errorMessage", "h", "event", "f", "Lkotlin/Function1;", "Lio/sentry/j1;", "beforeFinish", "d", "(Ljava/lang/String;Ler/l;)V", "a", "(Ler/l;)V", "Lio/sentry/c1;", "b", "Lfv/b0;", "", "Lio/sentry/n5;", "c", "Ljava/util/Map;", "eventDates", "Lio/sentry/f;", "Lio/sentry/f;", "breadcrumb", "e", "Lio/sentry/j1;", "()Lio/sentry/j1;", "callSpan", "Lfv/d0;", "clientErrorResponse", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isEventFinished$sentry_okhttp", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "isEventFinished", "Ljava/lang/String;", "url", "method", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c1 scopes;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final b0 request;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final f breadcrumb;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final j1 callSpan;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private d0 response;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private d0 clientErrorResponse;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private String url;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private String method;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final Map<String, n5> eventDates = new ConcurrentHashMap();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isEventFinished = new AtomicBoolean(false);

    public a(c1 c1Var, b0 b0Var) {
        this.scopes = c1Var;
        this.request = b0Var;
        this.url = l0.c(b0Var.getUrl().getUrl()).f();
        this.method = b0Var.getMethod();
        j1 j1VarU = x.a() ? c1Var.u() : c1Var.a();
        j1 j1VarJ = j1VarU != null ? j1VarU.j("http.client") : null;
        this.callSpan = j1VarJ;
        n8 n8VarW = j1VarJ != null ? j1VarJ.w() : null;
        if (n8VarW != null) {
            n8VarW.r("auto.http.okhttp");
        }
        f fVar = new f();
        fVar.F("http");
        fVar.z("http");
        fVar.A("http.start_timestamp", Long.valueOf(n.b().a()));
        this.breadcrumb = fVar;
        j(b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void b(a aVar, l lVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            lVar = null;
        }
        aVar.a(lVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e(a aVar, String str, l lVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            lVar = null;
        }
        aVar.d(str, lVar);
    }

    public final void a(l<? super j1, i0> beforeFinish) {
        if (this.isEventFinished.getAndSet(true)) {
            return;
        }
        this.eventDates.clear();
        j0 j0Var = new j0();
        j0Var.k("okHttp:request", this.request);
        d0 d0Var = this.response;
        if (d0Var != null) {
            j0Var.k("okHttp:response", d0Var);
        }
        this.breadcrumb.A("http.end_timestamp", Long.valueOf(n.b().a()));
        this.scopes.q(this.breadcrumb, j0Var);
        j1 j1Var = this.callSpan;
        if (j1Var != null && beforeFinish != null) {
            beforeFinish.b(j1Var);
        }
        d0 d0Var2 = this.clientErrorResponse;
        if (d0Var2 != null) {
            d.f95276a.a(this.scopes, d0Var2.getRequest(), d0Var2);
        }
        j1 j1Var2 = this.callSpan;
        if (j1Var2 != null) {
            j1Var2.g();
        }
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final j1 getCallSpan() {
        return this.callSpan;
    }

    public final void d(String event, l<? super j1, i0> beforeFinish) {
        j1 j1Var;
        n5 n5VarRemove = this.eventDates.remove(event);
        if (n5VarRemove == null || (j1Var = this.callSpan) == null) {
            return;
        }
        if (beforeFinish != null) {
            beforeFinish.b(j1Var);
        }
        this.callSpan.m(event, Long.valueOf(TimeUnit.NANOSECONDS.toMillis(this.scopes.s().getDateProvider().a().e(n5VarRemove))));
    }

    public final void f(String event) {
        if (this.callSpan == null) {
            return;
        }
        this.eventDates.put(event, this.scopes.s().getDateProvider().a());
    }

    public final void g(d0 response) {
        this.clientErrorResponse = response;
    }

    public final void h(String errorMessage) {
        if (errorMessage != null) {
            this.breadcrumb.A("error_message", errorMessage);
            j1 j1Var = this.callSpan;
            if (j1Var != null) {
                j1Var.m("error_message", errorMessage);
            }
        }
    }

    public final void i(String protocolName) {
        if (protocolName != null) {
            this.breadcrumb.A("protocol", protocolName);
            j1 j1Var = this.callSpan;
            if (j1Var != null) {
                j1Var.m("protocol", protocolName);
            }
        }
    }

    public final void j(b0 request) {
        l0.a aVarC = l0.c(request.getUrl().getUrl());
        this.url = aVarC.f();
        String host = request.getUrl().getHost();
        String strD = request.getUrl().d();
        this.method = request.getMethod();
        j1 j1Var = this.callSpan;
        if (j1Var != null) {
            j1Var.h(this.method + ' ' + this.url);
        }
        aVarC.b(this.callSpan);
        this.breadcrumb.A("host", host);
        this.breadcrumb.A("path", strD);
        if (aVarC.e() != null) {
            this.breadcrumb.A("url", aVarC.e());
        }
        f fVar = this.breadcrumb;
        String str = this.method;
        Locale locale = Locale.ROOT;
        fVar.A("method", str.toUpperCase(locale));
        if (aVarC.d() != null) {
            this.breadcrumb.A("http.query", aVarC.d());
        }
        if (aVarC.c() != null) {
            this.breadcrumb.A("http.fragment", aVarC.c());
        }
        j1 j1Var2 = this.callSpan;
        if (j1Var2 != null) {
            j1Var2.m("url", this.url);
        }
        j1 j1Var3 = this.callSpan;
        if (j1Var3 != null) {
            j1Var3.m("host", host);
        }
        j1 j1Var4 = this.callSpan;
        if (j1Var4 != null) {
            j1Var4.m("path", strD);
        }
        j1 j1Var5 = this.callSpan;
        if (j1Var5 != null) {
            j1Var5.m("http.request.method", this.method.toUpperCase(locale));
        }
    }

    public final void k(long byteCount) {
        if (byteCount > -1) {
            this.breadcrumb.A("request_content_length", Long.valueOf(byteCount));
            j1 j1Var = this.callSpan;
            if (j1Var != null) {
                j1Var.m("http.request_content_length", Long.valueOf(byteCount));
            }
        }
    }

    public final void l(d0 response) {
        this.response = response;
        this.breadcrumb.A("protocol", response.getProtocol().name());
        this.breadcrumb.A("status_code", Integer.valueOf(response.getCode()));
        j1 j1Var = this.callSpan;
        if (j1Var != null) {
            j1Var.m("protocol", response.getProtocol().name());
        }
        j1 j1Var2 = this.callSpan;
        if (j1Var2 != null) {
            j1Var2.m("http.response.status_code", Integer.valueOf(response.getCode()));
        }
    }

    public final void m(long byteCount) {
        if (byteCount > -1) {
            this.breadcrumb.A("response_content_length", Long.valueOf(byteCount));
            j1 j1Var = this.callSpan;
            if (j1Var != null) {
                j1Var.m("http.response_content_length", Long.valueOf(byteCount));
            }
        }
    }
}
