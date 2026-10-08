package p02;

import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0016B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0010\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ$\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00030\u00122\u0006\u0010\u0011\u001a\u00020\u0002H\u0096B¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lp02/d;", "", "Lp02/d$a;", "Lu04/b;", "Lp02/r;", "getAttachmentsUseCase", "La14/a0;", "saveMessageAttachmentsUseCase", "La14/y;", "requestPermissionUseCase", "<init>", "(Lp02/r;La14/a0;La14/y;)V", "", "fileNameWithExtension", "d", "(Ljava/lang/String;)Ljava/lang/String;", "e", "params", "Ldx/i;", "Ldx/b;", "f", "(Lp02/d$a;Ltq/e;)Ljava/lang/Object;", "a", "Lp02/r;", "getGetAttachmentsUseCase", "()Lp02/r;", "b", "La14/a0;", "getSaveMessageAttachmentsUseCase", "()La14/a0;", "c", "La14/y;", "getRequestPermissionUseCase", "()La14/y;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements gz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final r getAttachmentsUseCase;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final a14.a0 saveMessageAttachmentsUseCase;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a14.y requestPermissionUseCase;

    /* JADX INFO: renamed from: p02.d$a, reason: from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0017\u001a\u0004\b\u0019\u0010\rR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u0017\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\r¨\u0006\u001b"}, d2 = {"Lp02/d$a;", "Lgz/b$a;", "Leo0/g0;", "messageId", "Leo0/r;", "directoryId", "Leo0/y;", "attachmentId", "", "fileNameWithExtension", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "c", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String attachmentId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileNameWithExtension;

        public /* synthetic */ Params(String str, String str2, String str3, String str4, fr.k kVar) {
            this(str, str2, str3, str4);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getAttachmentId() {
            return this.attachmentId;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getDirectoryId() {
            return this.directoryId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final String getFileNameWithExtension() {
            return this.fileNameWithExtension;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return eo0.g0.d(this.messageId, params.messageId) && eo0.r.d(this.directoryId, params.directoryId) && eo0.y.d(this.attachmentId, params.attachmentId) && fr.t.c(this.fileNameWithExtension, params.fileNameWithExtension);
        }

        public int hashCode() {
            return (((((eo0.g0.e(this.messageId) * 31) + eo0.r.e(this.directoryId)) * 31) + eo0.y.e(this.attachmentId)) * 31) + this.fileNameWithExtension.hashCode();
        }

        public String toString() {
            return "Params(messageId=" + ((Object) eo0.g0.f(this.messageId)) + ", directoryId=" + ((Object) eo0.r.f(this.directoryId)) + ", attachmentId=" + ((Object) eo0.y.f(this.attachmentId)) + ", fileNameWithExtension=" + this.fileNameWithExtension + ')';
        }

        private Params(String str, String str2, String str3, String str4) {
            this.messageId = str;
            this.directoryId = str2;
            this.attachmentId = str3;
            this.fileNameWithExtension = str4;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f150940d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f150941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f150942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f150943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f150944h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f150945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f150946k;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f150948m;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f150946k = obj;
            this.f150948m |= PKIFailureInfo.systemUnavail;
            return d.this.f(null, this);
        }
    }

    public d(r rVar, a14.a0 a0Var, a14.y yVar) {
        this.getAttachmentsUseCase = rVar;
        this.saveMessageAttachmentsUseCase = a0Var;
        this.requestPermissionUseCase = yVar;
    }

    private final String d(String fileNameWithExtension) {
        return fu.r.k1(fileNameWithExtension, ".", null, 2, null);
    }

    private final String e(String fileNameWithExtension) {
        return fu.r.s1(fileNameWithExtension, ".", null, 2, null);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00bc A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:38:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:50:0x0128  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0104, code lost:
    
        if (r13 == r1) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object f(p02.d.Params r12, tq.e<? super dx.i<? extends dx.b, ? extends u04.b>> r13) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 302
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p02.d.f(p02.d$a, tq.e):java.lang.Object");
    }
}
