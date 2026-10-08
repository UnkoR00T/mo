package go3;

import do3.FamilyCardMemberData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import ju.g1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001c2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0003\u001c\u001d\u001aB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J'\u0010\u000e\u001a\u00020\r2\b\u0010\t\u001a\u0004\u0018\u00010\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000b0\n*\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J$\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00030\u00162\u0006\u0010\u0015\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001e"}, d2 = {"Lgo3/q;", "", "Lgo3/q$b;", "Lgo3/q$c;", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lbo3/a;)V", "Lwn3/c;", "entryPoint", "", "Lco3/n$e;", "documentList", "Lco3/n;", "k", "(Lwn3/c;Ljava/util/List;)Lco3/n;", "", "", "Ldo3/b;", "l", "(Ljava/util/Map;)Ljava/util/List;", "params", "Ldx/i;", "Ldx/b;", "j", "(Lgo3/q$b;Ltq/e;)Ljava/lang/Object;", "a", "Lbo3/a;", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q implements gz.b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f75650c = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.q$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lgo3/q$b;", "Lgz/b$a;", "Lwn3/c;", "entryPoint", "<init>", "(Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    /* JADX INFO: renamed from: go3.q$c, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0016\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u0017\u0010\tR\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u0019\u0010\u000b¨\u0006\u001a"}, d2 = {"Lgo3/q$c;", "", "Lco3/n;", "selectedDocument", "", "documentList", "<init>", "(Lco3/n;Ljava/util/List;)V", "a", "()Lco3/n;", "b", "()Ljava/util/List;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lco3/n;", "getSelectedDocument", "Ljava/util/List;", "getDocumentList", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Ldx/i;", "Ldx/b;", "Lgo3/q$c;", "<anonymous>", "(Lju/p0;)Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super dx.i<? extends dx.b, ? extends Result>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75655e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Params f75657g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(Params params, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f75657g = params;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f75655e;
            if (i15 == 0) {
                oq.u.b(obj);
                bo3.a aVar = q.this.verificationContainersInteractor;
                this.f75655e = 1;
                obj = aVar.r(this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            dx.i iVar = (dx.i) obj;
            q qVar = q.this;
            Params params = this.f75657g;
            if (iVar instanceof dx.i.Left) {
                return iVar;
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            List listL = qVar.l((Map) ((dx.i.Right) iVar).b());
            return new dx.i.Right(new Result(qVar.k(params.getEntryPoint(), listL), listL));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return q.this.new d(this.f75657g, eVar);
        }
    }

    public q(bo3.a aVar) {
        this.verificationContainersInteractor = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final co3.n k(wn3.c entryPoint, List<co3.n.KdrDocument> documentList) {
        Object next;
        if (!(entryPoint instanceof wn3.c.b.f)) {
            for (Object obj : documentList) {
                if (((co3.n.KdrDocument) obj).getIsOwner()) {
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
        } while (!fr.t.c(((co3.n.KdrDocument) next).getId(), ((wn3.c.b.f) entryPoint).getId()));
        co3.n.KdrDocument kdrDocument = (co3.n.KdrDocument) next;
        return kdrDocument == null ? (co3.n.KdrDocument) pq.v.l0(documentList) : kdrDocument;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<co3.n.KdrDocument> l(Map<String, FamilyCardMemberData> map) {
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<String, FamilyCardMemberData>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            FamilyCardMemberData value = it.next().getValue();
            arrayList.add(new co3.n.KdrDocument(value.getNumber(), fr.t.c(value.getHolderType(), "R"), value.getFirstName() + ' ' + value.getLastName(), fr.t.c(value.getCardRelation(), "W")));
        }
        return pq.v.U0(arrayList, sq.a.c(new er.l() { // from class: go3.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.m((co3.n.KdrDocument) obj);
            }
        }, new er.l() { // from class: go3.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.n((co3.n.KdrDocument) obj);
            }
        }, new er.l() { // from class: go3.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.o((co3.n.KdrDocument) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable m(co3.n.KdrDocument kdrDocument) {
        return Boolean.valueOf(!kdrDocument.getIsOwner());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable n(co3.n.KdrDocument kdrDocument) {
        return Boolean.valueOf(!kdrDocument.getIsParent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Comparable o(co3.n.KdrDocument kdrDocument) {
        return kdrDocument.getName();
    }

    public Object j(Params params, tq.e<? super dx.i<? extends dx.b, Result>> eVar) {
        return ju.i.g(g1.b(), new d(params, null), eVar);
    }
}
