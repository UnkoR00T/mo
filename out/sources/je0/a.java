package je0;

import dx.i;
import dx.j;
import fr.t;
import gz.b;
import ie0.UutCardDocument;
import ie0.UutCardParentDocument;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CancellationException;
import me0.DocumentPhotoData;
import oq.g;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import px.f;
import tq.e;
import vq.d;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0002\u000f\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00030\u000b2\u0006\u0010\n\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0016\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lje0/a;", "", "Lje0/a$a;", "Lje0/a$b;", "Lhe0/a;", "uutCardDataStorageInteractor", "Lmx/c;", "labelProvider", "<init>", "(Lhe0/a;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lje0/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Lhe0/a;", "Ldx/b$c;", "b", "Ldx/b$c;", "getReadDocumentDataBusinessError", "()Ldx/b$c;", "readDocumentDataBusinessError", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f102156c = dx.b.Business.f45029h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final he0.a uutCardDataStorageInteractor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dx.b.Business readDocumentDataBusinessError;

    /* JADX INFO: renamed from: je0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lje0/a$a;", "Lgz/b$a;", "", "documentId", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String documentId;

        public Params(String str) {
            this.documentId = str;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getDocumentId() {
            return this.documentId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.documentId, ((Params) other).documentId);
        }

        public int hashCode() {
            return this.documentId.hashCode();
        }

        public String toString() {
            return "Params(documentId=" + this.documentId + ')';
        }
    }

    /* JADX INFO: renamed from: je0.a$b, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u0014\u0010\u001c¨\u0006\u001d"}, d2 = {"Lje0/a$b;", "", "Lme0/b;", "photoData", "Lie0/d;", "ownerCard", "", "familyMembersCards", "<init>", "(Lme0/b;Lie0/d;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lme0/b;", "c", "()Lme0/b;", "b", "Lie0/d;", "()Lie0/d;", "Ljava/util/List;", "()Ljava/util/List;", "uutcard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class UutCardData {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final DocumentPhotoData photoData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final UutCardDocument ownerCard;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<UutCardDocument> familyMembersCards;

        public UutCardData(DocumentPhotoData documentPhotoData, UutCardDocument uutCardDocument, List<UutCardDocument> list) {
            this.photoData = documentPhotoData;
            this.ownerCard = uutCardDocument;
            this.familyMembersCards = list;
        }

        public final List<UutCardDocument> a() {
            return this.familyMembersCards;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final UutCardDocument getOwnerCard() {
            return this.ownerCard;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final DocumentPhotoData getPhotoData() {
            return this.photoData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UutCardData)) {
                return false;
            }
            UutCardData uutCardData = (UutCardData) other;
            return t.c(this.photoData, uutCardData.photoData) && t.c(this.ownerCard, uutCardData.ownerCard) && t.c(this.familyMembersCards, uutCardData.familyMembersCards);
        }

        public int hashCode() {
            return (((this.photoData.hashCode() * 31) + this.ownerCard.hashCode()) * 31) + this.familyMembersCards.hashCode();
        }

        public String toString() {
            return "UutCardData(photoData=" + this.photoData + ", ownerCard=" + this.ownerCard + ", familyMembersCards=" + this.familyMembersCards + ')';
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c extends d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f102163d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f102164e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f102165f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f102166g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f102167h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f102168j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f102169k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f102170l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f102171m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f102172n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f102173p;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        int f102175r;

        c(e<? super c> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f102173p = obj;
            this.f102175r |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(he0.a aVar, mx.c cVar) {
        this.uutCardDataStorageInteractor = aVar;
        this.readDocumentDataBusinessError = new dx.b.Business(me0.e.READ_DOCUMENT_DATA_ERROR, null, cVar.c(ge0.a.B), cVar.c(ge0.a.A), null, cVar.c(ge0.a.f72027b), null, 82, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0140 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:105:0x0167 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:107:0x0154 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ca A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TRY_LEAVE, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0070, B:37:0x00c0, B:39:0x00ca, B:70:0x0187, B:71:0x0191), top: B:100:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:42:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:45:0x00fe A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:47:0x010e A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:49:0x0112 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x012a A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:58:0x0145 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015a A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0176 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:68:0x0181 A[Catch: Exception -> 0x0045, c -> 0x0048, CancellationException -> 0x004b, TryCatch #6 {Exception -> 0x0045, blocks: (B:13:0x0040, B:43:0x00f8, B:45:0x00fe, B:47:0x010e, B:49:0x0112, B:50:0x0124, B:52:0x012a, B:56:0x0141, B:58:0x0145, B:59:0x0154, B:61:0x015a, B:63:0x0167, B:64:0x016b, B:66:0x0176, B:67:0x0180, B:68:0x0181, B:69:0x0186, B:78:0x019b, B:81:0x01a9), top: B:96:0x0026 }] */
    /* JADX WARN: Code duplicated, block: B:70:0x0187 A[Catch: Exception -> 0x007b, c -> 0x007f, CancellationException -> 0x0083, TRY_ENTER, TryCatch #6 {c -> 0x007f, CancellationException -> 0x0083, Exception -> 0x007b, blocks: (B:24:0x0070, B:37:0x00c0, B:39:0x00ca, B:70:0x0187, B:71:0x0191), top: B:100:0x0070 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:84:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:87:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:88:0x01d1  */
    /* JADX WARN: Code duplicated, block: B:90:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:93:0x01e2  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [dx.j, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v6 */
    public Object d(Params params, e<? super i<? extends dx.b, UutCardData>> eVar) throws Throwable {
        c cVar;
        String message;
        i iVarA;
        Object objB;
        ex.b aVar;
        int i15;
        j<dx.b> jVar;
        Params params2;
        int i16;
        int i17;
        int i18;
        int i19;
        ex.b bVar;
        DocumentPhotoData documentPhotoData;
        Object objC;
        DocumentPhotoData documentPhotoData2;
        i iVar;
        UutCardParentDocument uutCardParentDocument;
        Iterator it;
        Object next;
        UutCardDocument uutCardDocument;
        ArrayList arrayList;
        if (eVar instanceof c) {
            cVar = (c) eVar;
            int i25 = cVar.f102175r;
            if ((i25 & PKIFailureInfo.systemUnavail) != 0) {
                cVar.f102175r = i25 - PKIFailureInfo.systemUnavail;
            } else {
                cVar = new c(eVar);
            }
        } else {
            cVar = new c(eVar);
        }
        Object objA = cVar.f102173p;
        Object objE = uq.b.e();
        int i26 = cVar.f102175r;
        ?? r15 = 2;
        try {
            try {
                if (i26 != 0) {
                    if (i26 == 1) {
                        int i27 = cVar.f102172n;
                        i16 = cVar.f102171m;
                        i17 = cVar.f102170l;
                        int i28 = cVar.f102169k;
                        int i29 = cVar.f102168j;
                        ex.b bVar2 = (ex.b) cVar.f102166g;
                        aVar = (ex.b) cVar.f102165f;
                        jVar = (j) cVar.f102164e;
                        params2 = (Params) cVar.f102163d;
                        try {
                            u.b(objA);
                            i15 = i27;
                            bVar = bVar2;
                            i19 = i29;
                            i18 = i28;
                            documentPhotoData = (DocumentPhotoData) ((i) objA).a();
                            if (documentPhotoData != null) {
                                bVar.b(this.readDocumentDataBusinessError);
                                throw new g();
                            }
                            he0.a aVar2 = this.uutCardDataStorageInteractor;
                            String documentId = params2.getDocumentId();
                            cVar.f102163d = vq.j.a(params2);
                            cVar.f102164e = jVar;
                            cVar.f102165f = vq.j.a(aVar);
                            cVar.f102166g = bVar;
                            cVar.f102167h = documentPhotoData;
                            cVar.f102168j = i19;
                            cVar.f102169k = i18;
                            cVar.f102170l = i17;
                            cVar.f102171m = i16;
                            cVar.f102172n = i15;
                            cVar.f102175r = 2;
                            objC = aVar2.c(documentId, cVar);
                            if (objC != objE) {
                                documentPhotoData2 = documentPhotoData;
                                objA = objC;
                                iVar = (i) objA;
                                if (iVar instanceof i.Left) {
                                    return new i.Left(this.readDocumentDataBusinessError);
                                }
                                if (!(iVar instanceof i.Right)) {
                                    throw new p();
                                }
                                uutCardParentDocument = (UutCardParentDocument) ((i.Right) iVar).b();
                                it = uutCardParentDocument.a().iterator();
                                do {
                                    if (!it.hasNext()) {
                                        next = null;
                                        break;
                                    }
                                    next = it.next();
                                } while (!((UutCardDocument) next).getScopeData().getData().q());
                                uutCardDocument = (UutCardDocument) next;
                                if (uutCardDocument == null) {
                                    bVar.b(this.readDocumentDataBusinessError);
                                    throw new g();
                                }
                                List<UutCardDocument> listA = uutCardParentDocument.a();
                                arrayList = new ArrayList();
                                for (Object obj : listA) {
                                    if (!t.c((UutCardDocument) obj, uutCardDocument)) {
                                        arrayList.add(obj);
                                    }
                                }
                                return new i.Right(new UutCardData(documentPhotoData2, uutCardDocument, arrayList));
                            }
                            return objE;
                        } catch (ex.c e15) {
                            e = e15;
                        } catch (CancellationException e16) {
                            throw e16;
                        } catch (Exception e17) {
                            e = e17;
                            r15 = jVar;
                            f fVar = f.f163100a;
                            message = e.getMessage();
                            if (message == null) {
                                message = "";
                            }
                            fVar.d(message, e, px.c.a(r15));
                            iVarA = r15.a(e);
                            if (iVarA instanceof i.Left) {
                                objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                            } else {
                                if (iVarA instanceof i.Right) {
                                    throw new p();
                                }
                                objB = ((i.Right) iVarA).b();
                            }
                            return new i.Left(objB);
                        }
                    } else {
                        if (i26 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        documentPhotoData2 = (DocumentPhotoData) cVar.f102167h;
                        bVar = (ex.b) cVar.f102166g;
                        try {
                            u.b(objA);
                            iVar = (i) objA;
                            if (iVar instanceof i.Left) {
                                return new i.Left(this.readDocumentDataBusinessError);
                            }
                            if (!(iVar instanceof i.Right)) {
                                throw new p();
                            }
                            uutCardParentDocument = (UutCardParentDocument) ((i.Right) iVar).b();
                            it = uutCardParentDocument.a().iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((UutCardDocument) next).getScopeData().getData().q());
                            uutCardDocument = (UutCardDocument) next;
                            if (uutCardDocument == null) {
                                bVar.b(this.readDocumentDataBusinessError);
                                throw new g();
                            }
                            List<UutCardDocument> listA2 = uutCardParentDocument.a();
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                                if (!t.c((UutCardDocument) obj, uutCardDocument)) {
                                    arrayList.add(obj);
                                }
                            }
                            return new i.Right(new UutCardData(documentPhotoData2, uutCardDocument, arrayList));
                        } catch (ex.c e18) {
                            e = e18;
                        } catch (CancellationException e19) {
                            throw e19;
                        }
                    }
                    return new i.Left((dx.b) ex.d.a(e));
                }
                u.b(objA);
                j<dx.b> jVarA = xw.c.f221622a.a();
                try {
                    aVar = new ex.a();
                    he0.a aVar3 = this.uutCardDataStorageInteractor;
                    cVar.f102163d = params;
                    cVar.f102164e = jVarA;
                    cVar.f102165f = vq.j.a(aVar);
                    cVar.f102166g = aVar;
                    i15 = 0;
                    cVar.f102168j = 0;
                    cVar.f102169k = 0;
                    cVar.f102170l = 0;
                    cVar.f102171m = 0;
                    cVar.f102172n = 0;
                    cVar.f102175r = 1;
                    objA = aVar3.a(cVar);
                    if (objA != objE) {
                        jVar = jVarA;
                        params2 = params;
                        i16 = 0;
                        i17 = 0;
                        i18 = 0;
                        i19 = 0;
                        bVar = aVar;
                        documentPhotoData = (DocumentPhotoData) ((i) objA).a();
                        if (documentPhotoData != null) {
                            bVar.b(this.readDocumentDataBusinessError);
                            throw new g();
                        }
                        he0.a aVar4 = this.uutCardDataStorageInteractor;
                        String documentId2 = params2.getDocumentId();
                        cVar.f102163d = vq.j.a(params2);
                        cVar.f102164e = jVar;
                        cVar.f102165f = vq.j.a(aVar);
                        cVar.f102166g = bVar;
                        cVar.f102167h = documentPhotoData;
                        cVar.f102168j = i19;
                        cVar.f102169k = i18;
                        cVar.f102170l = i17;
                        cVar.f102171m = i16;
                        cVar.f102172n = i15;
                        cVar.f102175r = 2;
                        objC = aVar4.c(documentId2, cVar);
                        if (objC != objE) {
                            documentPhotoData2 = documentPhotoData;
                            objA = objC;
                            iVar = (i) objA;
                            if (iVar instanceof i.Left) {
                                return new i.Left(this.readDocumentDataBusinessError);
                            }
                            if (!(iVar instanceof i.Right)) {
                                throw new p();
                            }
                            uutCardParentDocument = (UutCardParentDocument) ((i.Right) iVar).b();
                            it = uutCardParentDocument.a().iterator();
                            do {
                                if (!it.hasNext()) {
                                    next = null;
                                    break;
                                }
                                next = it.next();
                            } while (!((UutCardDocument) next).getScopeData().getData().q());
                            uutCardDocument = (UutCardDocument) next;
                            if (uutCardDocument == null) {
                                bVar.b(this.readDocumentDataBusinessError);
                                throw new g();
                            }
                            List<UutCardDocument> listA3 = uutCardParentDocument.a();
                            arrayList = new ArrayList();
                            while (r0.hasNext()) {
                                if (!t.c((UutCardDocument) obj, uutCardDocument)) {
                                    arrayList.add(obj);
                                }
                            }
                            return new i.Right(new UutCardData(documentPhotoData2, uutCardDocument, arrayList));
                        }
                    }
                    return objE;
                } catch (ex.c e25) {
                    e = e25;
                } catch (CancellationException e26) {
                    throw e26;
                } catch (Exception e27) {
                    e = e27;
                    r15 = jVarA;
                    f fVar2 = f.f163100a;
                    message = e.getMessage();
                    if (message == null) {
                        message = "";
                    }
                    fVar2.d(message, e, px.c.a(r15));
                    iVarA = r15.a(e);
                    if (iVarA instanceof i.Left) {
                        objB = new dx.b.Generic((Exception) ((i.Left) iVarA).b());
                    } else {
                        if (iVarA instanceof i.Right) {
                            throw new p();
                        }
                        objB = ((i.Right) iVarA).b();
                    }
                    return new i.Left(objB);
                }
            } catch (CancellationException e28) {
                throw e28;
            }
        } catch (Exception e29) {
            e = e29;
        }
    }
}
