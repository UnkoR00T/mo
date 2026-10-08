package yc;

import fv.b0;
import fv.c0;
import fv.d0;
import fv.e0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vc.NetworkHeaders;
import vc.NetworkRequest;
import vc.NetworkResponse;
import vc.k;
import vc.r;
import vv.g;
import vv.h;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0014\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0082@¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0014\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0013\u0010\n\u001a\u00020\t*\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0013\u0010\u0010\u001a\u00020\f*\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lvc/q;", "Lfv/b0;", "h", "(Lvc/q;Ltq/e;)Ljava/lang/Object;", "Lvc/r;", "Lvv/h;", "d", "(Lvc/r;Ltq/e;)Ljava/lang/Object;", "Lfv/d0;", "Lvc/s;", "g", "(Lfv/d0;)Lvc/s;", "Lvc/p;", "Lfv/u;", "e", "(Lvc/p;)Lfv/u;", "f", "(Lfv/u;)Lvc/p;", "coil-network-okhttp"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class b {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226292d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f226293e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f226294f;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226293e = obj;
            this.f226294f |= PKIFailureInfo.systemUnavail;
            return b.d(null, this);
        }
    }

    /* JADX INFO: renamed from: yc.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C6067b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226295d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226296e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f226297f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f226298g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f226299h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f226300j;

        C6067b(tq.e<? super C6067b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226299h = obj;
            this.f226300j |= PKIFailureInfo.systemUnavail;
            return b.h(null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(r rVar, tq.e<? super h> eVar) throws Throwable {
        a aVar;
        vv.e eVar2;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f226294f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f226294f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f226293e;
        Object objE = uq.b.e();
        int i16 = aVar.f226294f;
        if (i16 == 0) {
            u.b(obj);
            vv.e eVar3 = new vv.e();
            aVar.f226292d = eVar3;
            aVar.f226294f = 1;
            if (rVar.U(eVar3, aVar) == objE) {
                return objE;
            }
            eVar2 = eVar3;
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            eVar2 = (vv.e) aVar.f226292d;
            u.b(obj);
        }
        return eVar2.d0();
    }

    private static final fv.u e(NetworkHeaders networkHeaders) {
        fv.u.a aVar = new fv.u.a();
        for (Map.Entry<String, List<String>> entry : networkHeaders.b().entrySet()) {
            String key = entry.getKey();
            Iterator<String> it = entry.getValue().iterator();
            while (it.hasNext()) {
                aVar.e(key, it.next());
            }
        }
        return aVar.f();
    }

    private static final NetworkHeaders f(fv.u uVar) {
        NetworkHeaders.a aVar = new NetworkHeaders.a();
        for (oq.r<? extends String, ? extends String> rVar : uVar) {
            aVar.a(rVar.a(), rVar.b());
        }
        return aVar.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final NetworkResponse g(d0 d0Var) {
        g source;
        int code = d0Var.getCode();
        long sentRequestAtMillis = d0Var.getSentRequestAtMillis();
        long receivedResponseAtMillis = d0Var.getReceivedResponseAtMillis();
        NetworkHeaders networkHeadersF = f(d0Var.getHeaders());
        e0 body = d0Var.getBody();
        return new NetworkResponse(code, sentRequestAtMillis, receivedResponseAtMillis, networkHeadersF, (body == null || (source = body.getSource()) == null) ? null : k.a(source), d0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object h(NetworkRequest networkRequest, tq.e<? super b0> eVar) throws Throwable {
        C6067b c6067b;
        b0.a aVar;
        String str;
        b0.a aVar2;
        b0.a aVar3;
        NetworkRequest networkRequest2;
        String str2;
        if (eVar instanceof C6067b) {
            c6067b = (C6067b) eVar;
            int i15 = c6067b.f226300j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6067b.f226300j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6067b = new C6067b(eVar);
            }
        } else {
            c6067b = new C6067b(eVar);
        }
        Object obj = c6067b.f226299h;
        Object objE = uq.b.e();
        int i16 = c6067b.f226300j;
        c0 c0VarJ = null;
        if (i16 == 0) {
            u.b(obj);
            aVar = new b0.a();
            aVar.k(networkRequest.getUrl());
            String method = networkRequest.getMethod();
            r body = networkRequest.getBody();
            if (body != null) {
                c6067b.f226295d = networkRequest;
                c6067b.f226296e = aVar;
                c6067b.f226297f = aVar;
                c6067b.f226298g = method;
                c6067b.f226300j = 1;
                Object objD = d(body, c6067b);
                if (objD == objE) {
                    return objE;
                }
                aVar3 = aVar;
                obj = objD;
                networkRequest2 = networkRequest;
                str2 = method;
                aVar2 = aVar3;
            } else {
                str = method;
                aVar2 = aVar;
            }
            String str3 = str;
            networkRequest2 = networkRequest;
            str2 = str3;
            aVar3 = aVar;
            aVar3.f(str2, c0VarJ);
            aVar2.e(e(networkRequest2.getHeaders()));
            return aVar2.b();
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        str2 = (String) c6067b.f226298g;
        aVar3 = (b0.a) c6067b.f226297f;
        aVar2 = (b0.a) c6067b.f226296e;
        networkRequest2 = (NetworkRequest) c6067b.f226295d;
        u.b(obj);
        h hVar = (h) obj;
        if (hVar != null) {
            c0VarJ = c0.Companion.j(c0.INSTANCE, hVar, null, 1, null);
        } else {
            NetworkRequest networkRequest3 = networkRequest2;
            str = str2;
            networkRequest = networkRequest3;
            aVar = aVar3;
            String str4 = str;
            networkRequest2 = networkRequest;
            str2 = str4;
            aVar3 = aVar;
        }
        aVar3.f(str2, c0VarJ);
        aVar2.e(e(networkRequest2.getHeaders()));
        return aVar2.b();
    }
}
