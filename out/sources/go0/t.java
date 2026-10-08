package go0;

import eo0.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgo0/t;", "", "Lgo0/t$a;", "Ljava/io/InputStream;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface t extends gz.b {

    /* JADX INFO: renamed from: go0.t$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u000eR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\u001b\u0010\u000eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001c\u001a\u0004\b\u0017\u0010\u000e¨\u0006\u001e"}, d2 = {"Lgo0/t$a;", "Lgz/b$a;", "Leo0/i0$a;", "owAccessToken", "Leo0/g0;", "messageId", "Leo0/r;", "directoryId", "Leo0/y;", "attachmentId", "<init>", "(Leo0/i0$a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/i0$a;", "d", "()Leo0/i0$a;", "b", "Ljava/lang/String;", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Access owAccessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final String directoryId;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final String attachmentId;

        public /* synthetic */ Params(OwTokens.Access access, String str, String str2, String str3, fr.k kVar) {
            this(access, str, str2, str3);
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
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final OwTokens.Access getOwAccessToken() {
            return this.owAccessToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return fr.t.c(this.owAccessToken, params.owAccessToken) && eo0.g0.d(this.messageId, params.messageId) && eo0.r.d(this.directoryId, params.directoryId) && eo0.y.d(this.attachmentId, params.attachmentId);
        }

        public int hashCode() {
            return (((((this.owAccessToken.hashCode() * 31) + eo0.g0.e(this.messageId)) * 31) + eo0.r.e(this.directoryId)) * 31) + eo0.y.e(this.attachmentId);
        }

        public String toString() {
            return "Params(owAccessToken=" + this.owAccessToken + ", messageId=" + eo0.g0.f(this.messageId) + ", directoryId=" + eo0.r.f(this.directoryId) + ", attachmentId=" + eo0.y.f(this.attachmentId) + ")";
        }

        private Params(OwTokens.Access access, String str, String str2, String str3) {
            this.owAccessToken = access;
            this.messageId = str;
            this.directoryId = str2;
            this.attachmentId = str3;
        }
    }
}
