package go3;

import do3.RefugeeCardData;
import do3.RefugeeFamilyData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\"$B\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0014\u001a\u0012\u0012\u0004\u0012\u00020\u000b0\u0012j\b\u0012\u0004\u0012\u00020\u000b`\u00132\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0017\u001a\u00020\u000b*\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00160\u0019H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u00030\u001e2\u0006\u0010\u001d\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Lgo3/i;", "", "Lgo3/i$a;", "Lgo3/i$b;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "Lwn3/c;", "entryPoint", "", "Lco3/n$a;", "subDocumentList", "Lco3/n;", "h", "(Lwn3/c;Ljava/util/List;)Lco3/n;", "Ldo3/f;", "data", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "f", "(Ldo3/f;)Ljava/util/ArrayList;", "Ldo3/e;", "i", "(Ldo3/e;)Lco3/n$a;", "", "", "j", "(Ljava/util/Map;)Ljava/util/List;", "params", "Ldx/i;", "Ldx/b;", "g", "(Lgo3/i$a;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "b", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class i implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/i$a;", "Lgz/b$a;", "Lwn3/c;", "entryPoint", "<init>", "(Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: go3.i$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lgo3/i$b;", "", "Lco3/n;", "selectedDocument", "", "documentList", "<init>", "(Lco3/n;Ljava/util/List;)V", "a", "()Lco3/n;", "b", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lco3/n;", "getSelectedDocument", "Ljava/util/List;", "getDocumentList", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: a, reason: from getter */
        public final co3.n getSelectedDocument() {
            return this.selectedDocument;
        }

        public final List<co3.n> b() {
            return this.documentList;
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
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75479d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75480e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75482g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75480e = obj;
            this.f75482g |= PKIFailureInfo.systemUnavail;
            return i.this.g(null, this);
        }
    }

    public i(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    private final ArrayList<co3.n.DiiaDocument> f(RefugeeFamilyData data) {
        ArrayList<co3.n.DiiaDocument> arrayList = new ArrayList<>();
        arrayList.add(i(data.getMainCardData()));
        List<co3.n.DiiaDocument> listJ = j(data.a());
        if (!listJ.isEmpty()) {
            arrayList.addAll(listJ);
        }
        return arrayList;
    }

    private final co3.n h(wn3.c entryPoint, List<co3.n.DiiaDocument> subDocumentList) {
        Object next;
        if (!(entryPoint instanceof wn3.c.b.l)) {
            for (Object obj : subDocumentList) {
                if (((co3.n.DiiaDocument) obj).getIsOwner()) {
                    return (co3.n) obj;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }
        Iterator<T> it = subDocumentList.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!fr.t.c(((co3.n.DiiaDocument) next).getId(), ((wn3.c.b.l) entryPoint).getBundleId()));
        co3.n.DiiaDocument diiaDocument = (co3.n.DiiaDocument) next;
        return diiaDocument == null ? (co3.n.DiiaDocument) pq.v.l0(subDocumentList) : diiaDocument;
    }

    private final co3.n.DiiaDocument i(RefugeeCardData refugeeCardData) {
        return new co3.n.DiiaDocument("-1", refugeeCardData.getFirstName() + " " + refugeeCardData.getSurname(), true);
    }

    private final List<co3.n.DiiaDocument> j(Map<String, RefugeeCardData> map) {
        List<oq.r> listY = pq.v0.y(map);
        ArrayList arrayList = new ArrayList(pq.v.y(listY, 10));
        for (oq.r rVar : listY) {
            String str = (String) rVar.a();
            RefugeeCardData refugeeCardData = (RefugeeCardData) rVar.b();
            arrayList.add(new co3.n.DiiaDocument(str, refugeeCardData.getFirstName() + " " + refugeeCardData.getSurname(), false, 4, null));
        }
        return pq.v.U0(arrayList, sq.a.c(new er.l() { // from class: go3.g
            @Override // er.l
            public final Object b(Object obj) {
                return i.k((co3.n.DiiaDocument) obj);
            }
        }, new er.l() { // from class: go3.h
            @Override // er.l
            public final Object b(Object obj) {
                return i.l((co3.n.DiiaDocument) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable k(co3.n.DiiaDocument diiaDocument) {
        return Boolean.valueOf(!diiaDocument.getIsOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable l(co3.n.DiiaDocument diiaDocument) {
        return diiaDocument.getName();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object g(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) throws Throwable {
        c cVar;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i15 = cVar.f75482g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f75482g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objJ = cVar.f75480e;
        Object objE = uq.b.e();
        int i16 = cVar.f75482g;
        if (i16 == 0) {
            oq.u.b(objJ);
            bo3.a aVar = this.verificationContainersInteractor;
            cVar.f75479d = params;
            cVar.f75482g = 1;
            objJ = aVar.j(cVar);
            if (objJ == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            params = (Params) cVar.f75479d;
            oq.u.b(objJ);
        }
        dx.i iVar = (dx.i) objJ;
        if (iVar instanceof dx.i.Left) {
            return new dx.i.Left((dx.b) ((dx.i.Left) iVar).b());
        }
        if (!(iVar instanceof dx.i.Right)) {
            throw new oq.p();
        }
        ArrayList<co3.n.DiiaDocument> arrayListF = f((RefugeeFamilyData) ((dx.i.Right) iVar).b());
        return new dx.i.Right(new Result(h(params.getEntryPoint(), arrayListF), arrayListF));
    }
}
