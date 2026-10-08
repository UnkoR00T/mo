package go3;

import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q34.l1;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u001b\u001dBI\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J$\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u00030\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010!R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)¨\u0006*"}, d2 = {"Lgo3/a0;", "", "Lgo3/a0$a;", "Lgo3/a0$b;", "Lgo3/i;", "getDiiaFamilyMemberUseCase", "Lgo3/q;", "kdrChildrenUseCase", "Lgo3/y;", "railwayFamilyMemberUseCase", "Lco3/i;", "scopeMapper", "Lho3/c;", "getDynamicMultiDocumentMembersUC", "Lho3/b;", "getByIdDynamicDocumentMembersUC", "Lq34/l1;", "isDocumentStoredByIdUC", "Lbo3/a;", "verificationContainersInteractor", "<init>", "(Lgo3/i;Lgo3/q;Lgo3/y;Lco3/i;Lho3/c;Lho3/b;Lq34/l1;Lbo3/a;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lgo3/a0$a;Ltq/e;)Ljava/lang/Object;", "a", "Lgo3/i;", "b", "Lgo3/q;", "c", "Lgo3/y;", "Lco3/i;", "e", "Lho3/c;", "f", "Lho3/b;", "g", "Lq34/l1;", "h", "Lbo3/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a0 implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i getDiiaFamilyMemberUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final q kdrChildrenUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final y railwayFamilyMemberUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final co3.i scopeMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ho3.c getDynamicMultiDocumentMembersUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ho3.b getByIdDynamicDocumentMembersUC;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final l1 isDocumentStoredByIdUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final bo3.a verificationContainersInteractor;

    /* JADX INFO: renamed from: go3.a0$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Lgo3/a0$a;", "Lgz/b$a;", "Lrq0/b;", "documentType", "Lwn3/c;", "entryPoint", "<init>", "(Lrq0/b;Lwn3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lrq0/b;", "g", "()Lrq0/b;", "b", "Lwn3/c;", "()Lwn3/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final rq0.b documentType;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final wn3.c entryPoint;

        public Params(rq0.b bVar, wn3.c cVar) {
            this.documentType = bVar;
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
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.documentType, params.documentType) && fr.t.c(this.entryPoint, params.entryPoint);
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final rq0.b getDocumentType() {
            return this.documentType;
        }

        public int hashCode() {
            int iHashCode = this.documentType.hashCode() * 31;
            wn3.c cVar = this.entryPoint;
            return iHashCode + (cVar == null ? 0 : cVar.hashCode());
        }

        public String toString() {
            return "Params(documentType=" + this.documentType + ", entryPoint=" + this.entryPoint + ')';
        }
    }

    /* JADX INFO: renamed from: go3.a0$b, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lgo3/a0$b;", "", "Lco3/n;", "subDocument", "", "subDocumentList", "<init>", "(Lco3/n;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lco3/n;", "()Lco3/n;", "b", "Ljava/util/List;", "()Ljava/util/List;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Result {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final co3.n subDocument;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<co3.n> subDocumentList;

        /* JADX WARN: Multi-variable type inference failed */
        public Result() {
            this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final co3.n getSubDocument() {
            return this.subDocument;
        }

        public final List<co3.n> b() {
            return this.subDocumentList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Result)) {
                return false;
            }
            Result result = (Result) other;
            return fr.t.c(this.subDocument, result.subDocument) && fr.t.c(this.subDocumentList, result.subDocumentList);
        }

        public int hashCode() {
            co3.n nVar = this.subDocument;
            int iHashCode = (nVar == null ? 0 : nVar.hashCode()) * 31;
            List<co3.n> list = this.subDocumentList;
            return iHashCode + (list != null ? list.hashCode() : 0);
        }

        public String toString() {
            return "Result(subDocument=" + this.subDocument + ", subDocumentList=" + this.subDocumentList + ')';
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Result(co3.n nVar, List<? extends co3.n> list) {
            this.subDocument = nVar;
            this.subDocumentList = list;
        }

        public /* synthetic */ Result(co3.n nVar, List list, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? null : nVar, (i15 & 2) != 0 ? null : list);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f75211d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f75212e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f75214g;

        c(tq.e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f75212e = obj;
            this.f75214g |= PKIFailureInfo.systemUnavail;
            return a0.this.d(null, this);
        }
    }

    public a0(i iVar, q qVar, y yVar, co3.i iVar2, ho3.c cVar, ho3.b bVar, l1 l1Var, bo3.a aVar) {
        this.getDiiaFamilyMemberUseCase = iVar;
        this.kdrChildrenUseCase = qVar;
        this.railwayFamilyMemberUseCase = yVar;
        this.scopeMapper = iVar2;
        this.getDynamicMultiDocumentMembersUC = cVar;
        this.getByIdDynamicDocumentMembersUC = bVar;
        this.isDocumentStoredByIdUC = l1Var;
        this.verificationContainersInteractor = aVar;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x021c  */
    /* JADX WARN: Code duplicated, block: B:114:0x0269  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x023a, code lost:
    
        if (r13 == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x0296, code lost:
    
        if (r13 == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x008e, code lost:
    
        if (r13 == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00da, code lost:
    
        if (r13 == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x0118, code lost:
    
        if (r13 == r1) goto L120;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c8, code lost:
    
        if (r13 == r1) goto L120;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(go3.a0.Params r12, tq.e<? super dx.i<? extends dx.b, go3.a0.Result>> r13) {
        /*
            Method dump skipped, instruction units count: 740
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: go3.a0.d(go3.a0$a, tq.e):java.lang.Object");
    }
}
