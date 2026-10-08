package o04;

import fr.k;
import fr.t;
import iy.b0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0003\u0006R\u0014\u0010\u0005\u001a\u00020\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\u0082\u0001\u0002\u0007\b¨\u0006\tÀ\u0006\u0003"}, d2 = {"Lo04/b;", "", "Lry/a;", "a", "()Liy/b0;", "fileEncryptionKey", "b", "Lo04/b$a;", "Lo04/b$b;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: o04.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0015\u0010\u0014¨\u0006\u0016"}, d2 = {"Lo04/b$a;", "Lo04/b;", "Lry/a;", "fileEncryptionKey", "domainCertificate", "<init>", "(Liy/b0;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Download implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 fileEncryptionKey;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 domainCertificate;

        public /* synthetic */ Download(b0 b0Var, b0 b0Var2, k kVar) {
            this(b0Var, b0Var2);
        }

        @Override // o04.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public b0 getFileEncryptionKey() {
            return this.fileEncryptionKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public b0 getDomainCertificate() {
            return this.domainCertificate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Download)) {
                return false;
            }
            Download download = (Download) other;
            return ry.a.d(this.fileEncryptionKey, download.fileEncryptionKey) && ry.a.d(this.domainCertificate, download.domainCertificate);
        }

        public int hashCode() {
            return (ry.a.e(this.fileEncryptionKey) * 31) + ry.a.e(this.domainCertificate);
        }

        public String toString() {
            return "Download(fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", domainCertificate=" + ry.a.f(this.domainCertificate) + ")";
        }

        private Download(b0 b0Var, b0 b0Var2) {
            this.fileEncryptionKey = b0Var;
            this.domainCertificate = b0Var2;
        }
    }

    /* JADX INFO: renamed from: o04.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010\n\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\u001a\u0010\u001d¨\u0006\""}, d2 = {"Lo04/b$b;", "Lo04/b;", "", "url", "Liy/b0;", "jwtToken", "Lfz/b$f;", "expiredDate", "Lry/a;", "fileEncryptionKey", "domainCertificate", "<init>", "(Ljava/lang/String;Liy/b0;Lfz/b$f;Liy/b0;Liy/b0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Liy/b0;", "c", "()Liy/b0;", "Lfz/b$f;", "getExpiredDate", "()Lfz/b$f;", "e", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Uploader implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String url;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 jwtToken;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final fz.b.OffsetDateTime expiredDate;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 fileEncryptionKey;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 domainCertificate;

        public /* synthetic */ Uploader(String str, b0 b0Var, fz.b.OffsetDateTime offsetDateTime, b0 b0Var2, b0 b0Var3, k kVar) {
            this(str, b0Var, offsetDateTime, b0Var2, b0Var3);
        }

        @Override // o04.b
        /* JADX INFO: renamed from: a, reason: from getter */
        public b0 getFileEncryptionKey() {
            return this.fileEncryptionKey;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public b0 getDomainCertificate() {
            return this.domainCertificate;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getJwtToken() {
            return this.jwtToken;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getUrl() {
            return this.url;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Uploader)) {
                return false;
            }
            Uploader uploader = (Uploader) other;
            return t.c(this.url, uploader.url) && t.c(this.jwtToken, uploader.jwtToken) && t.c(this.expiredDate, uploader.expiredDate) && ry.a.d(this.fileEncryptionKey, uploader.fileEncryptionKey) && ry.a.d(this.domainCertificate, uploader.domainCertificate);
        }

        public int hashCode() {
            return (((((((this.url.hashCode() * 31) + this.jwtToken.hashCode()) * 31) + this.expiredDate.hashCode()) * 31) + ry.a.e(this.fileEncryptionKey)) * 31) + ry.a.e(this.domainCertificate);
        }

        public String toString() {
            return "Uploader(url=" + this.url + ", jwtToken=" + this.jwtToken + ", expiredDate=" + this.expiredDate + ", fileEncryptionKey=" + ry.a.f(this.fileEncryptionKey) + ", domainCertificate=" + ry.a.f(this.domainCertificate) + ")";
        }

        private Uploader(String str, b0 b0Var, fz.b.OffsetDateTime offsetDateTime, b0 b0Var2, b0 b0Var3) {
            this.url = str;
            this.jwtToken = b0Var;
            this.expiredDate = offsetDateTime;
            this.fileEncryptionKey = b0Var2;
            this.domainCertificate = b0Var3;
        }
    }

    /* JADX INFO: renamed from: a */
    b0 getFileEncryptionKey();
}
