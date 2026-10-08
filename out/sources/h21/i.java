package h21;

import fr.t;
import h64.r;
import iq0.DashboardServiceEntry;
import iq0.TemporaryInterruption;
import java.util.Iterator;
import java.util.List;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0018\u001aB!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u0012*\u00020\f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lh21/i;", "Lgz/b;", "Lh21/i$a;", "Lh21/i$b;", "Lh64/r;", "loadServicesUseCase", "Lf21/a;", "serviceTypeToNavigationMapper", "Lh64/j;", "getServiceTemporaryInterruptionUseCase", "<init>", "(Lh64/r;Lf21/a;Lh64/j;)V", "Lrq0/c;", "Liq0/g0;", "d", "(Lrq0/c;Ltq/e;)Ljava/lang/Object;", "Liq0/p;", "entry", "Lgx/b;", "e", "(Lrq0/c;Liq0/p;)Lgx/b;", "params", "f", "(Lh21/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lh64/r;", "b", "Lf21/a;", "c", "Lh64/j;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b<Params, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r loadServicesUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final f21.a serviceTypeToNavigationMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h64.j getServiceTemporaryInterruptionUseCase;

    /* JADX INFO: renamed from: h21.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh21/i$a;", "Lgz/b$a;", "Lrq0/c;", "serviceType", "<init>", "(Lrq0/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/c;", "()Lrq0/c;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.c serviceType;

        public Params(rq0.c cVar) {
            this.serviceType = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final rq0.c getServiceType() {
            return this.serviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && this.serviceType == ((Params) other).serviceType;
        }

        public int hashCode() {
            return this.serviceType.hashCode();
        }

        public String toString() {
            return "Params(serviceType=" + this.serviceType + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lh21/i$b;", "", "a", "c", "b", "Lh21/i$b$a;", "Lh21/i$b$b;", "Lh21/i$b$c;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: h21.i$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh21/i$b$a;", "Lh21/i$b;", "Lgx/b;", "event", "<init>", "(Lgx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgx/b;", "()Lgx/b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Available implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final gx.b event;

            public Available(gx.b bVar) {
                this.event = bVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final gx.b getEvent() {
                return this.event;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Available) && t.c(this.event, ((Available) other).event);
            }

            public int hashCode() {
                gx.b bVar = this.event;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            public String toString() {
                return "Available(event=" + this.event + ')';
            }
        }

        /* JADX INFO: renamed from: h21.i$b$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh21/i$b$b;", "Lh21/i$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C1827b implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C1827b f80089a = new C1827b();

            private C1827b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C1827b);
            }

            public int hashCode() {
                return 2118478217;
            }

            public String toString() {
                return "NotAvailable";
            }
        }

        /* JADX INFO: renamed from: h21.i$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh21/i$b$c;", "Lh21/i$b;", "Liq0/g0;", "data", "<init>", "(Liq0/g0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liq0/g0;", "()Liq0/g0;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class TemporaryInterrupted implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final TemporaryInterruption data;

            public TemporaryInterrupted(TemporaryInterruption temporaryInterruption) {
                this.data = temporaryInterruption;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final TemporaryInterruption getData() {
                return this.data;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof TemporaryInterrupted) && t.c(this.data, ((TemporaryInterrupted) other).data);
            }

            public int hashCode() {
                return this.data.hashCode();
            }

            public String toString() {
                return "TemporaryInterrupted(data=" + this.data + ')';
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f80091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f80092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f80093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80094g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f80096j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f80094g = obj;
            this.f80096j |= PKIFailureInfo.systemUnavail;
            return i.this.f(null, this);
        }
    }

    public i(r rVar, f21.a aVar, h64.j jVar) {
        this.loadServicesUseCase = rVar;
        this.serviceTypeToNavigationMapper = aVar;
        this.getServiceTemporaryInterruptionUseCase = jVar;
    }

    private final Object d(rq0.c cVar, tq.e<? super TemporaryInterruption> eVar) {
        return this.getServiceTemporaryInterruptionUseCase.c(new h64.j.Params(cVar), eVar);
    }

    private final gx.b e(rq0.c cVar, DashboardServiceEntry dashboardServiceEntry) {
        return this.serviceTypeToNavigationMapper.b(new f21.a.Params(cVar, dashboardServiceEntry.getSupplementOrigin()));
    }

    /* JADX WARN: Code duplicated, block: B:36:0x009a  */
    /* JADX WARN: Code duplicated, block: B:38:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object f(Params params, tq.e<? super b> eVar) throws Throwable {
        c cVar;
        Object next;
        Params params2;
        DashboardServiceEntry dashboardServiceEntry;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f80096j;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f80096j = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objC = cVar.f80094g;
        Object objE = uq.b.e();
        int i16 = cVar.f80096j;
        if (i16 == 0) {
            u.b(objC);
            r rVar = this.loadServicesUseCase;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            cVar.f80091d = params;
            cVar.f80096j = 1;
            objC = rVar.c(c1792a, cVar);
            if (objC != objE) {
            }
            return objE;
        }
        if (i16 == 1) {
            params = (Params) cVar.f80091d;
            u.b(objC);
        } else {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            dashboardServiceEntry = (DashboardServiceEntry) cVar.f80092e;
            params2 = (Params) cVar.f80091d;
            u.b(objC);
        }
        TemporaryInterruption temporaryInterruption = (TemporaryInterruption) objC;
        return temporaryInterruption == null ? new b.Available(e(params2.getServiceType(), dashboardServiceEntry)) : new b.TemporaryInterrupted(temporaryInterruption);
        List list = (List) objC;
        if (list != null) {
            Iterator it = list.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (((DashboardServiceEntry) next).getType() != params.getServiceType());
            DashboardServiceEntry dashboardServiceEntry2 = (DashboardServiceEntry) next;
            if (dashboardServiceEntry2 != null) {
                rq0.c serviceType = params.getServiceType();
                cVar.f80091d = params;
                cVar.f80092e = dashboardServiceEntry2;
                cVar.f80093f = 0;
                cVar.f80096j = 2;
                Object objD = d(serviceType, cVar);
                if (objD != objE) {
                    params2 = params;
                    dashboardServiceEntry = dashboardServiceEntry2;
                    objC = objD;
                    TemporaryInterruption temporaryInterruption2 = (TemporaryInterruption) objC;
                    if (temporaryInterruption2 == null) {
                    }
                }
                return objE;
            }
        }
        return b.C1827b.f80089a;
    }
}
