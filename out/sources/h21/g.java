package h21;

import fr.t;
import java.util.List;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.q1;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u0016\u0018B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0014\u0010\u000e\u001a\u00020\r*\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u0010*\u00020\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u000fJ\u0018\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0013\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\u0004\u0018\u00010\"*\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lh21/g;", "Lgz/b;", "Lh21/g$a;", "Lh21/g$b;", "Lj34/b;", "documentToNavigationMapper", "Lq34/q1;", "loadCachedAddedDocumentsUC", "Lh21/a;", "canAddDocumentUC", "<init>", "(Lj34/b;Lq34/q1;Lh21/a;)V", "Lrq0/b;", "", "j", "(Lrq0/b;Ltq/e;)Ljava/lang/Object;", "Ldx/i;", "Ldx/b;", "f", "params", "i", "(Lh21/g$a;Ltq/e;)Ljava/lang/Object;", "a", "Lj34/b;", "b", "Lq34/q1;", "c", "Lh21/a;", "Lzw0/a$a;", "d", "Loq/k;", "h", "()Lzw0/a$a;", "toDocumentListEvent", "Lgx/b;", "g", "(Lrq0/b;)Lgx/b;", "navigationEvent", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class g implements gz.b<Params, b> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final j34.b documentToNavigationMapper;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q1 loadCachedAddedDocumentsUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a canAddDocumentUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k toDocumentListEvent = oq.l.a(new er.a() { // from class: h21.f
        @Override // er.a
        public final Object a() {
            return g.k();
        }
    });

    /* JADX INFO: renamed from: h21.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh21/g$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "<init>", "(Lrq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        public Params(rq0.b bVar) {
            this.documentType = bVar;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.documentType, ((Params) other).documentType);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            return this.documentType.hashCode();
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ')';
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lh21/g$b;", "", "a", "b", "d", "c", "Lh21/g$b$a;", "Lh21/g$b$b;", "Lh21/g$b$c;", "Lh21/g$b$d;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface b {

        /* JADX INFO: renamed from: h21.g$b$a, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh21/g$b$a;", "Lh21/g$b;", "Lgx/b;", "event", "<init>", "(Lgx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgx/b;", "()Lgx/b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class AlreadyAdded implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final gx.b event;

            public AlreadyAdded(gx.b bVar) {
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
                return (other instanceof AlreadyAdded) && t.c(this.event, ((AlreadyAdded) other).event);
            }

            public int hashCode() {
                gx.b bVar = this.event;
                if (bVar == null) {
                    return 0;
                }
                return bVar.hashCode();
            }

            public String toString() {
                return "AlreadyAdded(event=" + this.event + ')';
            }
        }

        /* JADX INFO: renamed from: h21.g$b$b, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lh21/g$b$b;", "Lh21/g$b;", "Lgx/b;", "event", "<init>", "(Lgx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lgx/b;", "()Lgx/b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class CanBeAdded implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final gx.b event;

            public CanBeAdded(gx.b bVar) {
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
                return (other instanceof CanBeAdded) && t.c(this.event, ((CanBeAdded) other).event);
            }

            public int hashCode() {
                return this.event.hashCode();
            }

            public String toString() {
                return "CanBeAdded(event=" + this.event + ')';
            }
        }

        /* JADX INFO: renamed from: h21.g$b$c, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh21/g$b$c;", "Lh21/g$b;", "Ldx/b;", "error", "<init>", "(Ldx/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldx/b;", "getError", "()Ldx/b;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final dx.b error;

            public Error(dx.b bVar) {
                this.error = bVar;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lh21/g$b$d;", "Lh21/g$b;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class d implements b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final d f80065a = new d();

            private d() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof d);
            }

            public int hashCode() {
                return -1935756583;
            }

            public String toString() {
                return "NotAvailable";
            }
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f80066d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f80067e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f80068f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f80069g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f80071j;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f80069g = obj;
            this.f80071j |= PKIFailureInfo.systemUnavail;
            return g.this.i(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f80072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f80073e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f80075g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f80073e = obj;
            this.f80075g |= PKIFailureInfo.systemUnavail;
            return g.this.j(null, this);
        }
    }

    public g(j34.b bVar, q1 q1Var, a aVar) {
        this.documentToNavigationMapper = bVar;
        this.loadCachedAddedDocumentsUC = q1Var;
        this.canAddDocumentUC = aVar;
    }

    private final Object f(rq0.b bVar, tq.e<? super dx.i<? extends dx.b, Boolean>> eVar) {
        return this.canAddDocumentUC.d(new a.Params(bVar), eVar);
    }

    private final gx.b g(rq0.b bVar) {
        return this.documentToNavigationMapper.b(bVar);
    }

    private final zw0.a.ToAddDocument h() {
        return (zw0.a.ToAddDocument) this.toDocumentListEvent.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(rq0.b bVar, tq.e<? super Boolean> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f80075g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f80075g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objC = dVar.f80073e;
        Object objE = uq.b.e();
        int i16 = dVar.f80075g;
        if (i16 == 0) {
            u.b(objC);
            q1 q1Var = this.loadCachedAddedDocumentsUC;
            gz.b.a.C1792a c1792a = gz.b.a.C1792a.f78542a;
            dVar.f80072d = bVar;
            dVar.f80075g = 1;
            objC = q1Var.c(c1792a, dVar);
            if (objC == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar = (rq0.b) dVar.f80072d;
            u.b(objC);
        }
        return vq.b.a(((List) objC).contains(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final zw0.a.ToAddDocument k() {
        return new zw0.a.ToAddDocument(true, zw0.a.ToAddDocument.EnumC6430a.ASYNC_MAIN_DOCUMENTS_LIST, false, true, null, 20, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x008f, code lost:
    
        if (r9 == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object i(h21.g.Params r8, tq.e<? super h21.g.b> r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: h21.g.i(h21.g$a, tq.e):java.lang.Object");
    }
}
