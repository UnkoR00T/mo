package lv;

import fu.r;
import fv.b0;
import fv.c0;
import fv.d0;
import fv.e0;
import fv.m;
import fv.n;
import fv.w;
import fv.x;
import java.util.List;
import p071kotlin.Metadata;
import pq.v;
import vv.p;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001d\u0010\n\u001a\u00020\t2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0011¨\u0006\u0012"}, d2 = {"Llv/a;", "Lfv/w;", "Lfv/n;", "cookieJar", "<init>", "(Lfv/n;)V", "", "Lfv/m;", "cookies", "", "b", "(Ljava/util/List;)Ljava/lang/String;", "Lfv/w$a;", "chain", "Lfv/d0;", "a", "(Lfv/w$a;)Lfv/d0;", "Lfv/n;", "okhttp"}, k = 1, mv = {1, 8, 0}, xi = 48)
public final class a implements w {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final n cookieJar;

    public a(n nVar) {
        this.cookieJar = nVar;
    }

    private final String b(List<m> cookies) {
        StringBuilder sb5 = new StringBuilder();
        int i15 = 0;
        for (Object obj : cookies) {
            int i16 = i15 + 1;
            if (i15 < 0) {
                v.x();
            }
            m mVar = (m) obj;
            if (i15 > 0) {
                sb5.append("; ");
            }
            sb5.append(mVar.getName());
            sb5.append('=');
            sb5.append(mVar.getValue());
            i15 = i16;
        }
        return sb5.toString();
    }

    @Override // fv.w
    public d0 a(w.a chain) {
        e0 body;
        b0 request = chain.getRequest();
        b0.a aVarI = request.i();
        c0 body2 = request.getBody();
        if (body2 != null) {
            x f67282b = body2.getF67282b();
            if (f67282b != null) {
                aVarI.d("Content-Type", f67282b.getMediaType());
            }
            long jA = body2.a();
            if (jA != -1) {
                aVarI.d("Content-Length", String.valueOf(jA));
                aVarI.h("Transfer-Encoding");
            } else {
                aVarI.d("Transfer-Encoding", "chunked");
                aVarI.h("Content-Length");
            }
        }
        boolean z15 = false;
        if (request.d("Host") == null) {
            aVarI.d("Host", gv.d.R(request.getUrl(), false, 1, null));
        }
        if (request.d("Connection") == null) {
            aVarI.d("Connection", "Keep-Alive");
        }
        if (request.d("Accept-Encoding") == null && request.d("Range") == null) {
            aVarI.d("Accept-Encoding", "gzip");
            z15 = true;
        }
        List<m> listB = this.cookieJar.b(request.getUrl());
        if (!listB.isEmpty()) {
            aVarI.d("Cookie", b(listB));
        }
        if (request.d("User-Agent") == null) {
            aVarI.d("User-Agent", "okhttp/4.12.0");
        }
        d0 d0VarA = chain.a(aVarI.b());
        e.f(this.cookieJar, request.getUrl(), d0VarA.getHeaders());
        d0.a aVarR = d0VarA.K().r(request);
        if (z15 && r.G("gzip", d0.E(d0VarA, "Content-Encoding", null, 2, null), true) && e.b(d0VarA) && (body = d0VarA.getBody()) != null) {
            p pVar = new p(body.getSource());
            aVarR.k(d0VarA.getHeaders().g().h("Content-Encoding").h("Content-Length").f());
            aVarR.b(new h(d0.E(d0VarA, "Content-Type", null, 2, null), -1L, vv.v.c(pVar)));
        }
        return aVarR.c();
    }
}
