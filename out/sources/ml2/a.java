package ml2;

import a14.a0;
import fr.k;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0015B/\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ$\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00030\u00112\u0006\u0010\u0010\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lml2/a;", "", "Lml2/a$a;", "", "Luq0/b;", "downloadKRSDocument", "La14/a0;", "saveFilesOnDeviceUseCase", "Laz/d;", "fileConverter", "Lml2/b;", "generatePdfNameUC", "Lmx/c;", "labelProvider", "<init>", "(Luq0/b;La14/a0;Laz/d;Lml2/b;Lmx/c;)V", "params", "Ldx/i;", "Ldx/b;", "d", "(Lml2/a$a;Ltq/e;)Ljava/lang/Object;", "a", "Luq0/b;", "getDownloadKRSDocument", "()Luq0/b;", "b", "La14/a0;", "getSaveFilesOnDeviceUseCase", "()La14/a0;", "c", "Laz/d;", "getFileConverter", "()Laz/d;", "Lml2/b;", "getGeneratePdfNameUC", "()Lml2/b;", "e", "Lmx/c;", "getLabelProvider", "()Lmx/c;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final uq0.b downloadKRSDocument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a0 saveFilesOnDeviceUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final az.d fileConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ml2.b generatePdfNameUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: ml2.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\b¨\u0006\u0013"}, d2 = {"Lml2/a$a;", "Lgz/b$a;", "Lsq0/d;", "id", "<init>", "(Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String id;

        public /* synthetic */ Params(String str, k kVar) {
            this(str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getId() {
            return this.id;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && sq0.d.b(this.id, ((Params) other).id);
        }

        public int hashCode() {
            return sq0.d.c(this.id);
        }

        public String toString() {
            return "Params(id=" + ((Object) sq0.d.d(this.id)) + ')';
        }

        private Params(String str) {
            this.id = str;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f127078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f127079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f127080f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f127081g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f127082h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f127083j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f127085l;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f127083j = obj;
            this.f127085l |= PKIFailureInfo.systemUnavail;
            return a.this.d(null, this);
        }
    }

    public a(uq0.b bVar, a0 a0Var, az.d dVar, ml2.b bVar2, mx.c cVar) {
        this.downloadKRSDocument = bVar;
        this.saveFilesOnDeviceUseCase = a0Var;
        this.fileConverter = dVar;
        this.generatePdfNameUC = bVar2;
        this.labelProvider = cVar;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00c8 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:31:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:33:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:35:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00bf, code lost:
    
        if (r12 == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object d(ml2.a.Params r11, tq.e<? super dx.i<? extends dx.b, java.lang.String>> r12) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ml2.a.d(ml2.a$a, tq.e):java.lang.Object");
    }
}
