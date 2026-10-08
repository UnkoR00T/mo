package wc;

import CON.j0;
import fu.r;
import java.util.List;
import java.util.Map;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vc.NetworkHeaders;
import vc.NetworkResponse;
import vc.t;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0003\u0010\u0004\u001a\u0013\u0010\u0007\u001a\u00020\u0006*\u00020\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0014\u0010\u000b\u001a\u00020\n*\u00020\tH\u0080@¢\u0006\u0004\b\u000b\u0010\f\u001a\u001c\u0010\u000f\u001a\u00020\r*\u00020\r2\u0006\u0010\u000e\u001a\u00020\rH\u0080\u0002¢\u0006\u0004\b\u000f\u0010\u0010\u001a\u0013\u0010\u0012\u001a\u00020\t*\u00020\u0011H\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u0017\u0010\u0016\u001a\u00020\u0006*\u00060\u0014j\u0002`\u0015H\u0000¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lvc/p$a;", "", "line", "b", "(Lvc/p$a;Ljava/lang/String;)Lvc/p$a;", "Lpc/a$b;", "Loq/i0;", "a", "(Lpc/a$b;)V", "Lvc/t;", "Lvv/e;", "e", "(Lvc/t;Ltq/e;)Ljava/lang/Object;", "Lvc/p;", "other", "d", "(Lvc/p;Lvc/p;)Lvc/p;", "Lvc/s;", "f", "(Lvc/s;)Lvc/t;", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "c", "(Ljava/lang/AutoCloseable;)V", "coil-network-core"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class e {

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f212042d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212043e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f212044f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212045g;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f212044f = obj;
            this.f212045g |= PKIFailureInfo.systemUnavail;
            return e.e(null, this);
        }
    }

    public static final void a(pc.a.b bVar) {
        try {
            bVar.b();
        } catch (Exception unused) {
        }
    }

    public static final NetworkHeaders.a b(NetworkHeaders.a aVar, String str) {
        int iQ0 = r.q0(str, ':', 0, false, 6, null);
        if (iQ0 != -1) {
            aVar.a(r.u1(str.substring(0, iQ0)).toString(), str.substring(iQ0 + 1));
            return aVar;
        }
        throw new IllegalArgumentException(("Unexpected header: " + str).toString());
    }

    public static final void c(AutoCloseable autoCloseable) {
        try {
            j0.a(autoCloseable);
        } catch (RuntimeException e15) {
            throw e15;
        } catch (Exception unused) {
        }
    }

    public static final NetworkHeaders d(NetworkHeaders networkHeaders, NetworkHeaders networkHeaders2) {
        NetworkHeaders.a aVarD = networkHeaders.d();
        for (Map.Entry<String, List<String>> entry : networkHeaders2.b().entrySet()) {
            aVarD.d(entry.getKey(), entry.getValue());
        }
        return aVarD.b();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object e(t tVar, tq.e<? super vv.e> eVar) throws Exception {
        a aVar;
        AutoCloseable autoCloseable;
        Throwable th4;
        AutoCloseable autoCloseable2;
        vv.f fVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f212045g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f212045g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f212044f;
        Object objE = uq.b.e();
        int i16 = aVar.f212045g;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            fVar = (vv.e) aVar.f212043e;
            autoCloseable = (AutoCloseable) aVar.f212042d;
            try {
                u.b(obj);
                autoCloseable2 = autoCloseable;
                cr.a.a(autoCloseable2, null);
                return fVar;
            } catch (Throwable th5) {
                th4 = th5;
                try {
                    throw th4;
                } catch (Throwable th6) {
                    cr.a.a(autoCloseable, th4);
                    throw th6;
                }
            }
        }
        u.b(obj);
        try {
            vv.f eVar2 = new vv.e();
            aVar.f212042d = tVar;
            aVar.f212043e = eVar2;
            aVar.f212045g = 1;
            if (tVar.U(eVar2, aVar) == objE) {
                return objE;
            }
            autoCloseable2 = tVar;
            fVar = eVar2;
            cr.a.a(autoCloseable2, null);
            return fVar;
        } catch (Throwable th7) {
            autoCloseable = tVar;
            th4 = th7;
            throw th4;
        }
    }

    public static final t f(NetworkResponse networkResponse) {
        t body = networkResponse.getBody();
        if (body != null) {
            return body;
        }
        throw new IllegalStateException("body == null");
    }
}
