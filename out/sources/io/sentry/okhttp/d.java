package io.sentry.okhttp;

import er.l;
import fr.w;
import fv.b0;
import fv.c0;
import fv.d0;
import fv.e0;
import fv.u;
import io.sentry.c1;
import io.sentry.exception.SentryHttpClientException;
import io.sentry.j0;
import io.sentry.protocol.j;
import io.sentry.protocol.m;
import io.sentry.protocol.n;
import io.sentry.r6;
import io.sentry.util.l0;
import java.util.LinkedHashMap;
import java.util.Map;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\b\u001a\u00020\u0006*\u0004\u0018\u00010\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ-\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0016\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lio/sentry/okhttp/d;", "", "<init>", "()V", "", "Lkotlin/Function1;", "Loq/i0;", "fn", "c", "(Ljava/lang/Long;Ler/l;)V", "Lio/sentry/c1;", "scopes", "Lfv/u;", "requestHeaders", "", "", "b", "(Lio/sentry/c1;Lfv/u;)Ljava/util/Map;", "Lfv/b0;", "request", "Lfv/d0;", "response", "a", "(Lio/sentry/c1;Lfv/b0;Lfv/d0;)V", "sentry-okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final d f95276a = new d();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class a extends w implements l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f95277b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(m mVar) {
            super(1);
            this.f95277b = mVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Long l15) {
            c(l15.longValue());
            return i0.f148189a;
        }

        public final void c(long j15) {
            this.f95277b.m(Long.valueOf(j15));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(J)V"}, k = 3, mv = {1, 9, 0})
    static final class b extends w implements l<Long, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f95278b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(n nVar) {
            super(1);
            this.f95278b = nVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Long l15) {
            c(l15.longValue());
            return i0.f148189a;
        }

        public final void c(long j15) {
            this.f95278b.f(Long.valueOf(j15));
        }
    }

    private d() {
    }

    private final Map<String, String> b(c1 scopes, u requestHeaders) {
        if (!scopes.s().isSendDefaultPii()) {
            return null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        int size = requestHeaders.size();
        for (int i15 = 0; i15 < size; i15++) {
            String strF = requestHeaders.f(i15);
            if (!io.sentry.util.n.a(strF)) {
                linkedHashMap.put(strF, requestHeaders.k(i15));
            }
        }
        return linkedHashMap;
    }

    private final void c(Long l15, l<? super Long, i0> lVar) {
        if (l15 == null || l15.longValue() == -1) {
            return;
        }
        lVar.b(l15);
    }

    public final void a(c1 scopes, b0 request, d0 response) {
        l0.a aVarC = l0.c(request.getUrl().getUrl());
        j jVar = new j();
        jVar.p("SentryOkHttpInterceptor");
        r6 r6Var = new r6(new io.sentry.exception.a(jVar, new SentryHttpClientException("HTTP Client Error with status code: " + response.getCode()), Thread.currentThread(), true));
        j0 j0Var = new j0();
        j0Var.k("okHttp:request", request);
        j0Var.k("okHttp:response", response);
        m mVar = new m();
        aVarC.a(mVar);
        mVar.n(scopes.s().isSendDefaultPii() ? request.getHeaders().e("Cookie") : null);
        mVar.q(request.getMethod());
        d dVar = f95276a;
        mVar.p(dVar.b(scopes, request.getHeaders()));
        c0 body = request.getBody();
        dVar.c(body != null ? Long.valueOf(body.a()) : null, new a(mVar));
        n nVar = new n();
        nVar.g(scopes.s().isSendDefaultPii() ? response.getHeaders().e("Set-Cookie") : null);
        nVar.h(dVar.b(scopes, response.getHeaders()));
        nVar.i(Integer.valueOf(response.getCode()));
        e0 body2 = response.getBody();
        dVar.c(body2 != null ? Long.valueOf(body2.getContentLength()) : null, new b(nVar));
        r6Var.a0(mVar);
        r6Var.C().u(nVar);
        scopes.R(r6Var, j0Var);
    }
}
