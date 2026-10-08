package go0;

import eo0.FileHandler;
import eo0.OwTokens;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lgo0/a;", "", "Lgo0/a$a;", "Leo0/y;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a extends gz.b {

    /* JADX INFO: renamed from: go0.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001c¨\u0006\u001d"}, d2 = {"Lgo0/a$a;", "Lgz/b$a;", "Leo0/e0;", "file", "Leo0/g0;", "messageId", "Leo0/i0$a;", "owAccessToken", "<init>", "(Leo0/e0;Ljava/lang/String;Leo0/i0$a;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/e0;", "()Leo0/e0;", "b", "Ljava/lang/String;", "c", "Leo0/i0$a;", "()Leo0/i0$a;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileHandler file;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String messageId;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final OwTokens.Access owAccessToken;

        public /* synthetic */ Params(FileHandler fileHandler, String str, OwTokens.Access access, fr.k kVar) {
            this(fileHandler, str, access);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FileHandler getFile() {
            return this.file;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getMessageId() {
            return this.messageId;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
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
            return fr.t.c(this.file, params.file) && eo0.g0.d(this.messageId, params.messageId) && fr.t.c(this.owAccessToken, params.owAccessToken);
        }

        public int hashCode() {
            return (((this.file.hashCode() * 31) + eo0.g0.e(this.messageId)) * 31) + this.owAccessToken.hashCode();
        }

        public String toString() {
            return "Params(file=" + this.file + ", messageId=" + eo0.g0.f(this.messageId) + ", owAccessToken=" + this.owAccessToken + ")";
        }

        private Params(FileHandler fileHandler, String str, OwTokens.Access access) {
            this.file = fileHandler;
            this.messageId = str;
            this.owAccessToken = access;
        }
    }
}
