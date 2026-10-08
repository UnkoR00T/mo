package rl0;

import al0.BEFileInfo;
import fr.k;
import fr.t;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lrl0/d;", "", "Lrl0/d$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends gz.b {

    /* JADX INFO: renamed from: rl0.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001aR\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u001e\u0010!¨\u0006\""}, d2 = {"Lrl0/d$a;", "Lgz/b$a;", "Lal0/a;", "accessToken", "Lhl0/a$d;", "data", "Lry/a;", "signedBase64Xml", "", "Lal0/l;", "files", "<init>", "(Liy/b0;Lhl0/a$d;Liy/b0;Ljava/util/List;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lhl0/a$d;", "()Lhl0/a$d;", "c", "d", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 accessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final hl0.a.Theft data;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedBase64Xml;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> files;

        public /* synthetic */ Params(b0 b0Var, hl0.a.Theft theft, b0 b0Var2, List list, k kVar) {
            this(b0Var, theft, b0Var2, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getAccessToken() {
            return this.accessToken;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hl0.a.Theft getData() {
            return this.data;
        }

        public final List<BEFileInfo> c() {
            return this.files;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b0 getSignedBase64Xml() {
            return this.signedBase64Xml;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return al0.a.b(this.accessToken, params.accessToken) && t.c(this.data, params.data) && ry.a.d(this.signedBase64Xml, params.signedBase64Xml) && t.c(this.files, params.files);
        }

        public int hashCode() {
            return (((((al0.a.c(this.accessToken) * 31) + this.data.hashCode()) * 31) + ry.a.e(this.signedBase64Xml)) * 31) + this.files.hashCode();
        }

        public String toString() {
            return "Params(accessToken=" + al0.a.d(this.accessToken) + ", data=" + this.data + ", signedBase64Xml=" + ry.a.f(this.signedBase64Xml) + ", files=" + this.files + ")";
        }

        private Params(b0 b0Var, hl0.a.Theft theft, b0 b0Var2, List<BEFileInfo> list) {
            this.accessToken = b0Var;
            this.data = theft;
            this.signedBase64Xml = b0Var2;
            this.files = list;
        }
    }
}
