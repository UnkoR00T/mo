package ml0;

import al0.BEFileInfo;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lml0/y;", "", "Lml0/y$a;", "Loq/i0;", "a", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface y extends gz.b {

    /* JADX INFO: renamed from: ml0.y$a, reason: from toString */
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0086\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010\u001c\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b#\u0010\u0012R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b%\u0010)\u001a\u0004\b\u001e\u0010*¨\u0006+"}, d2 = {"Lml0/y$a;", "Lgz/b$a;", "Lal0/a;", "accessToken", "Lal0/b0;", "idCardApplicationData", "Lry/a;", "signedBase64Xml", "Lal0/g;", "ownerWithAge", "", "officeEdorAddress", "", "Lal0/l;", "filesInfo", "<init>", "(Liy/b0;Lal0/b0;Liy/b0;Lal0/g;Ljava/lang/String;Ljava/util/List;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "()Liy/b0;", "b", "Lal0/b0;", "c", "()Lal0/b0;", "h", "d", "Lal0/g;", "f", "()Lal0/g;", "e", "Ljava/lang/String;", "Ljava/util/List;", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 accessToken;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.b0 idCardApplicationData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 signedBase64Xml;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.g ownerWithAge;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final String officeEdorAddress;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<BEFileInfo> filesInfo;

        public /* synthetic */ Params(b0 b0Var, al0.b0 b0Var2, b0 b0Var3, al0.g gVar, String str, List list, fr.k kVar) {
            this(b0Var, b0Var2, b0Var3, gVar, str, list);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getAccessToken() {
            return this.accessToken;
        }

        public final List<BEFileInfo> b() {
            return this.filesInfo;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final al0.b0 getIdCardApplicationData() {
            return this.idCardApplicationData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final String getOfficeEdorAddress() {
            return this.officeEdorAddress;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return al0.a.b(this.accessToken, params.accessToken) && fr.t.c(this.idCardApplicationData, params.idCardApplicationData) && ry.a.d(this.signedBase64Xml, params.signedBase64Xml) && fr.t.c(this.ownerWithAge, params.ownerWithAge) && fr.t.c(this.officeEdorAddress, params.officeEdorAddress) && fr.t.c(this.filesInfo, params.filesInfo);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final al0.g getOwnerWithAge() {
            return this.ownerWithAge;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final b0 getSignedBase64Xml() {
            return this.signedBase64Xml;
        }

        public int hashCode() {
            int iC = ((((((al0.a.c(this.accessToken) * 31) + this.idCardApplicationData.hashCode()) * 31) + ry.a.e(this.signedBase64Xml)) * 31) + this.ownerWithAge.hashCode()) * 31;
            String str = this.officeEdorAddress;
            return ((iC + (str == null ? 0 : str.hashCode())) * 31) + this.filesInfo.hashCode();
        }

        public String toString() {
            return "Params(accessToken=" + al0.a.d(this.accessToken) + ", idCardApplicationData=" + this.idCardApplicationData + ", signedBase64Xml=" + ry.a.f(this.signedBase64Xml) + ", ownerWithAge=" + this.ownerWithAge + ", officeEdorAddress=" + this.officeEdorAddress + ", filesInfo=" + this.filesInfo + ")";
        }

        private Params(b0 b0Var, al0.b0 b0Var2, b0 b0Var3, al0.g gVar, String str, List<BEFileInfo> list) {
            this.accessToken = b0Var;
            this.idCardApplicationData = b0Var2;
            this.signedBase64Xml = b0Var3;
            this.ownerWithAge = gVar;
            this.officeEdorAddress = str;
            this.filesInfo = list;
        }
    }
}
