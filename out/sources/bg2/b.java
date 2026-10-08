package bg2;

import a14.a0;
import fr.t;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lbg2/b;", "", "Lbg2/b$a;", "", "Lvq0/d;", "downloadOrderedDocumentUC", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "Lbg2/d;", "generatePdfNameUC", "Lpx/d;", "remoteLogger", "<init>", "(Lvq0/d;La14/a0;Laz/d;Lbg2/d;Lpx/d;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lbg2/b$a;Ltq/e;)Ljava/lang/Object;", "a", "Lvq0/d;", "getDownloadOrderedDocumentUC", "()Lvq0/d;", "b", "La14/a0;", "getSaveFilesOnDeviceUseCase", "()La14/a0;", "c", "Laz/d;", "getFileConverter", "()Laz/d;", "Lbg2/d;", "getGeneratePdfNameUC", "()Lbg2/d;", "e", "Lpx/d;", "getRemoteLogger", "()Lpx/d;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vq0.d downloadOrderedDocumentUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.d fileConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final d generatePdfNameUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: bg2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lbg2/b$a;", "Lgz/b$a;", "Ltq0/b;", "documentId", "<init>", "(Ltq0/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ltq0/b;", "()Ltq0/b;", "landregistry_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final tq0.b documentId;

        public Params(tq0.b bVar) {
            this.documentId = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final tq0.b getDocumentId() {
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

    /* JADX INFO: renamed from: bg2.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C0493b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f19335d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f19336e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f19337f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f19338g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f19339h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f19340j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f19342l;

        C0493b(tq.e<? super C0493b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f19340j = obj;
            this.f19342l |= PKIFailureInfo.systemUnavail;
            return b.this.d(null, this);
        }
    }

    public b(vq0.d dVar, a0 a0Var, az.d dVar2, d dVar3, px.d dVar4) {
        this.downloadOrderedDocumentUC = dVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.fileConverter = dVar2;
        this.generatePdfNameUC = dVar3;
        this.remoteLogger = dVar4;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x010c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:37:0x010d  */
    /* JADX WARN: Code duplicated, block: B:39:0x0111  */
    /* JADX WARN: Code duplicated, block: B:41:0x0142  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00eb, code lost:
    
        if (r13 == r1) goto L32;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0111, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(bg2.b.Params r12, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 340
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: bg2.b.d(bg2.b$a, tq.e):java.lang.Object");
    }
}
