package yo0;

import fr.t;
import iy.b0;
import p071kotlin.Metadata;
import wx.FileContent;
import wx.g;
import xo0.BEFragmentedURL;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lyo0/b;", "", "Lyo0/b$a;", "Lwx/g;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends gz.b {

    /* JADX INFO: renamed from: yo0.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"¨\u0006#"}, d2 = {"Lyo0/b$a;", "Lgz/b$a;", "Lwx/g;", "fileMetadata", "Lwx/c;", "fileContent", "Lxo0/a;", "fragmentedURL", "Liy/b0;", "jwtToken", "<init>", "(Lwx/g;Lwx/c;Lxo0/a;Liy/b0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lwx/g;", "b", "()Lwx/g;", "Lwx/c;", "()Lwx/c;", "c", "Lxo0/a;", "()Lxo0/a;", "d", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final g fileMetadata;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final FileContent fileContent;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEFragmentedURL fragmentedURL;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 jwtToken;

        public Params(g gVar, FileContent fileContent, BEFragmentedURL bEFragmentedURL, b0 b0Var) {
            this.fileMetadata = gVar;
            this.fileContent = fileContent;
            this.fragmentedURL = bEFragmentedURL;
            this.jwtToken = b0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final FileContent getFileContent() {
            return this.fileContent;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final g getFileMetadata() {
            return this.fileMetadata;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final BEFragmentedURL getFragmentedURL() {
            return this.fragmentedURL;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getJwtToken() {
            return this.jwtToken;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return t.c(this.fileMetadata, params.fileMetadata) && t.c(this.fileContent, params.fileContent) && t.c(this.fragmentedURL, params.fragmentedURL) && t.c(this.jwtToken, params.jwtToken);
        }

        public int hashCode() {
            return (((((this.fileMetadata.hashCode() * 31) + this.fileContent.hashCode()) * 31) + this.fragmentedURL.hashCode()) * 31) + this.jwtToken.hashCode();
        }

        public String toString() {
            return "Params(fileMetadata=" + this.fileMetadata + ", fileContent=" + this.fileContent + ", fragmentedURL=" + this.fragmentedURL + ", jwtToken=" + this.jwtToken + ")";
        }
    }
}
