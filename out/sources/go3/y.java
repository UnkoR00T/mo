package go3;

import do3.RailwayCardMemberData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lgo3/y;", "", "Lgo3/y$b;", "Lgo3/y$c;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "Lwn3/c;", "entryPoint", "", "Lco3/n$f;", "documentList", "Lco3/n;", "i", "(Lwn3/c;Ljava/util/List;)Lco3/n;", "", "", "Ldo3/d;", "j", "(Ljava/util/Map;)Ljava/util/List;", "params", "Ldx/i;", "Ldx/b;", "h", "(Lgo3/y$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class y implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75747c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.y$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/y$b;", "Lgz/b$a;", "Lwn3/c;", "entryPoint", "<init>", "(Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        public Params(wn3.c cVar) {
            this.entryPoint = cVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final wn3.c getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.entryPoint, ((Params) other).entryPoint);
        }

        public int hashCode() {
            wn3.c cVar = this.entryPoint;
            if (cVar == null) {
                return 0;
            }
            return cVar.hashCode();
        }

        public String toString() {
            return "Params(entryPoint=" + this.entryPoint + ')';
        }
    }

    /* JADX INFO: renamed from: go3.y$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgo3/y$c;", "", "Lco3/n;", "selectedDocument", "", "documentList", "<init>", "(Lco3/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/n;", "b", "()Lco3/n;", "Ljava/util/List;", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n selectedDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.n> documentList;

        /* JADX WARN: Multi-variable type inference failed */
        public Result(co3.n nVar, List<? extends co3.n> list) {
            this.selectedDocument = nVar;
            this.documentList = list;
        }

        public final List<co3.n> a() {
            return this.documentList;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final co3.n getSelectedDocument() {
            return this.selectedDocument;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.selectedDocument, result.selectedDocument) && fr.t.c(this.documentList, result.documentList);
        }

        public int hashCode() {
            return (this.selectedDocument.hashCode() * 31) + this.documentList.hashCode();
        }

        public String toString() {
            return "Result(selectedDocument=" + this.selectedDocument + ", documentList=" + this.documentList + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75752d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75753e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75755g;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75753e = obj;
            this.f75755g |= PKIFailureInfo.systemUnavail;
            return y.this.h(null, this);
        }
    }

    public y(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    private final co3.n i(wn3.c entryPoint, List<co3.n.RailwayDocument> documentList) {
        Object next;
        if (!(entryPoint instanceof wn3.c.b.k)) {
            for (Object obj : documentList) {
                if (((co3.n.RailwayDocument) obj).getIsOwner()) {
                    return (co3.n) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Iterator<T> it = documentList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((co3.n.RailwayDocument) next).getId(), ((wn3.c.b.k) entryPoint).getId()));
        co3.n.RailwayDocument railwayDocument = (co3.n.RailwayDocument) next;
        return railwayDocument == null ? (co3.n.RailwayDocument) pq.v.l0(documentList) : railwayDocument;
    }

    private final List<co3.n.RailwayDocument> j(Map<String, RailwayCardMemberData> map) {
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry<String, RailwayCardMemberData> entry : map.entrySet()) {
            arrayList.add(new co3.n.RailwayDocument(entry.getKey(), entry.getValue().getOuCategory(), fr.t.c(entry.getValue().getHolderType(), "F"), entry.getValue().getFirstName() + ' ' + entry.getValue().getLastName(), fr.t.c(entry.getValue().getCardRelation(), "W")));
        }
        return pq.v.U0(arrayList, sq.a.c(new er.l() { // from class: go3.u
            @Override // er.l
            public final Object b(Object obj) {
                return y.k((co3.n.RailwayDocument) obj);
            }
        }, new er.l() { // from class: go3.v
            @Override // er.l
            public final Object b(Object obj) {
                return y.l((co3.n.RailwayDocument) obj);
            }
        }, new er.l() { // from class: go3.w
            @Override // er.l
            public final Object b(Object obj) {
                return y.m((co3.n.RailwayDocument) obj);
            }
        }, new er.l() { // from class: go3.x
            @Override // er.l
            public final Object b(Object obj) {
                return y.n((co3.n.RailwayDocument) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable k(co3.n.RailwayDocument railwayDocument) {
        return Boolean.valueOf(!railwayDocument.getIsOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable l(co3.n.RailwayDocument railwayDocument) {
        return Boolean.valueOf((railwayDocument.getCategory() == RailwayCardMemberData.a.ANNUITY_I_PACKAGE || railwayDocument.getCategory() == RailwayCardMemberData.a.PENSIONER_I_PACKAGE) ? false : true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable m(co3.n.RailwayDocument railwayDocument) {
        return Boolean.valueOf(railwayDocument.getCategory() != RailwayCardMemberData.a.SPOUSE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable n(co3.n.RailwayDocument railwayDocument) {
        return railwayDocument.getName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        d dVar;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f75755g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f75755g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objL = dVar.f75753e;
        Object objE = uq.b.e();
        int i16 = dVar.f75755g;
        if (i16 == 0) {
            oq.u.b(objL);
            bo3.a aVar = this.verificationContainersInteractor;
            dVar.f75752d = params;
            dVar.f75755g = 1;
            objL = aVar.l(dVar);
            if (objL == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) dVar.f75752d;
            oq.u.b(objL);
        }
        dx.i iVar = (dx.i) objL;
        if (iVar instanceof dx.i.Left) {
            return iVar;
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        List<co3.n.RailwayDocument> listJ = j((Map) ((dx.i.Right) iVar).b());
        return new dx.i.Right(new Result(i(params.getEntryPoint(), listJ), listJ));
    }
}
