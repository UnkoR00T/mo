package yc;

import er.p;
import fr.t;
import fv.b0;
import fv.d0;
import java.io.Closeable;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vc.NetworkRequest;
import vc.NetworkResponse;
import vc.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0081@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005JB\u0010\u000e\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00062\u0006\u0010\b\u001a\u00020\u00072\"\u0010\r\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\n\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\tH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\u001c"}, d2 = {"Lyc/a;", "Lvc/j;", "Lfv/e$a;", "callFactory", "c", "(Lfv/e$a;)Lfv/e$a;", "T", "Lvc/q;", "request", "Lkotlin/Function2;", "Lvc/s;", "Ltq/e;", "", "block", "e", "(Lfv/e$a;Lvc/q;Ler/p;Ltq/e;)Ljava/lang/Object;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lfv/e$a;", "coil-network-okhttp"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements j {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final fv.e.a callFactory;

    /* JADX INFO: renamed from: yc.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C6066a<T> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f226288d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f226289e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f226290f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f226291g;

        C6066a(tq.e<? super C6066a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f226290f = obj;
            this.f226291g |= PKIFailureInfo.systemUnavail;
            return a.e(null, null, null, this);
        }
    }

    private /* synthetic */ a(fv.e.a aVar) {
        this.callFactory = aVar;
    }

    public static final /* synthetic */ a b(fv.e.a aVar) {
        return new a(aVar);
    }

    public static fv.e.a c(fv.e.a aVar) {
        return aVar;
    }

    public static boolean d(fv.e.a aVar, Object obj) {
        return (obj instanceof a) && t.c(aVar, ((a) obj).getCallFactory());
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008c  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static <T> Object e(fv.e.a aVar, NetworkRequest networkRequest, p<? super NetworkResponse, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
        C6066a c6066a;
        p<? super NetworkResponse, ? super tq.e<? super T>, ? extends Object> pVar2;
        Closeable closeable;
        Throwable th4;
        Closeable closeable2;
        if (eVar instanceof C6066a) {
            c6066a = (C6066a) eVar;
            int i15 = c6066a.f226291g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c6066a.f226291g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c6066a = new C6066a(eVar);
            }
        } else {
            c6066a = new C6066a(eVar);
        }
        Object objH = c6066a.f226290f;
        Object objE = uq.b.e();
        int i16 = c6066a.f226291g;
        if (i16 == 0) {
            u.b(objH);
            c6066a.f226288d = pVar;
            c6066a.f226289e = aVar;
            c6066a.f226291g = 1;
            objH = b.h(networkRequest, c6066a);
            if (objH != objE) {
            }
            return objE;
        }
        if (i16 != 1) {
            if (i16 != 2) {
                if (i16 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                closeable2 = (Closeable) c6066a.f226288d;
                try {
                    u.b(objH);
                    ar.b.a(closeable2, null);
                    return objH;
                } catch (Throwable th5) {
                    th4 = th5;
                    try {
                        throw th4;
                    } catch (Throwable th6) {
                        ar.b.a(closeable2, th4);
                        throw th6;
                    }
                }
            }
            pVar2 = (p) c6066a.f226288d;
            u.b(objH);
            closeable = (Closeable) objH;
            try {
                NetworkResponse networkResponseG = b.g((d0) closeable);
                c6066a.f226288d = closeable;
                c6066a.f226291g = 3;
                objH = pVar2.B(networkResponseG, c6066a);
                if (objH != objE) {
                    closeable2 = closeable;
                    ar.b.a(closeable2, null);
                    return objH;
                }
                return objE;
            } catch (Throwable th7) {
                th4 = th7;
                closeable2 = closeable;
                throw th4;
            }
        }
        aVar = (fv.e.a) c6066a.f226289e;
        pVar = (p) c6066a.f226288d;
        u.b(objH);
        fv.e eVarB = aVar.b((b0) objH);
        c6066a.f226288d = pVar;
        c6066a.f226289e = null;
        c6066a.f226291g = 2;
        objH = c.a(eVarB, c6066a);
        if (objH != objE) {
            pVar2 = pVar;
            closeable = (Closeable) objH;
            NetworkResponse networkResponseG2 = b.g((d0) closeable);
            c6066a.f226288d = closeable;
            c6066a.f226291g = 3;
            objH = pVar2.B(networkResponseG2, c6066a);
            if (objH != objE) {
                closeable2 = closeable;
                ar.b.a(closeable2, null);
                return objH;
            }
        }
        return objE;
    }

    public static int f(fv.e.a aVar) {
        return aVar.hashCode();
    }

    public static String g(fv.e.a aVar) {
        return "CallFactoryNetworkClient(callFactory=" + aVar + ")";
    }

    @Override // vc.j
    public <T> Object a(NetworkRequest networkRequest, p<? super NetworkResponse, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) {
        return e(this.callFactory, networkRequest, pVar, eVar);
    }

    public boolean equals(Object other) {
        return d(this.callFactory, other);
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final /* synthetic */ fv.e.a getCallFactory() {
        return this.callFactory;
    }

    public int hashCode() {
        return f(this.callFactory);
    }

    public String toString() {
        return g(this.callFactory);
    }
}
