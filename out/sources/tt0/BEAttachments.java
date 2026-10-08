package tt0;

import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: tt0.a, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Ltt0/a;", "", "", "Ltt0/a$a;", "attachments", "Lry/a;", "encryptionKey", "<init>", "(Ljava/util/List;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEAttachments {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Attachment> attachments;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0 encryptionKey;

    /* JADX INFO: renamed from: tt0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\t¨\u0006\u0016"}, d2 = {"Ltt0/a$a;", "", "Lry/a;", "fileEncryptionIV", "", "fileName", "<init>", "(Liy/b0;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Ljava/lang/String;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Attachment {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 fileEncryptionIV;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String fileName;

        public /* synthetic */ Attachment(b0 b0Var, String str, fr.k kVar) {
            this(b0Var, str);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getFileEncryptionIV() {
            return this.fileEncryptionIV;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getFileName() {
            return this.fileName;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Attachment)) {
                return false;
            }
            Attachment attachment = (Attachment) other;
            return ry.a.d(this.fileEncryptionIV, attachment.fileEncryptionIV) && fr.t.c(this.fileName, attachment.fileName);
        }

        public int hashCode() {
            return (ry.a.e(this.fileEncryptionIV) * 31) + this.fileName.hashCode();
        }

        public String toString() {
            return "Attachment(fileEncryptionIV=" + ry.a.f(this.fileEncryptionIV) + ", fileName=" + this.fileName + ")";
        }

        private Attachment(b0 b0Var, String str) {
            this.fileEncryptionIV = b0Var;
            this.fileName = str;
        }
    }

    public /* synthetic */ BEAttachments(List list, b0 b0Var, fr.k kVar) {
        this(list, b0Var);
    }

    public final List<Attachment> a() {
        return this.attachments;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final b0 getEncryptionKey() {
        return this.encryptionKey;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEAttachments)) {
            return false;
        }
        BEAttachments bEAttachments = (BEAttachments) other;
        return fr.t.c(this.attachments, bEAttachments.attachments) && ry.a.d(this.encryptionKey, bEAttachments.encryptionKey);
    }

    public int hashCode() {
        return (this.attachments.hashCode() * 31) + ry.a.e(this.encryptionKey);
    }

    public String toString() {
        return "BEAttachments(attachments=" + this.attachments + ", encryptionKey=" + ry.a.f(this.encryptionKey) + ")";
    }

    private BEAttachments(List<Attachment> list, b0 b0Var) {
        this.attachments = list;
        this.encryptionKey = b0Var;
    }
}
