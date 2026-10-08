package sv0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: sv0.r0, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001c\u001a\u0004\b\u0018\u0010\u001dR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u0015\u0010\u001d¨\u0006\u001e"}, d2 = {"Lsv0/r0;", "", "", "url", "Lsv0/o0;", "fileName", "Lry/a;", "fileEncryptionIV", "Liy/b0;", "accessToken", "<init>", "(Ljava/lang/String;Lsv0/o0;Liy/b0;Liy/b0;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "d", "b", "Lsv0/o0;", "c", "()Lsv0/o0;", "Liy/b0;", "()Liy/b0;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class VehicleCollisionFileToDownload {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String url;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final VehicleCollisionFileName fileName;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 fileEncryptionIV;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final iy.b0 accessToken;

    public /* synthetic */ VehicleCollisionFileToDownload(String str, VehicleCollisionFileName vehicleCollisionFileName, iy.b0 b0Var, iy.b0 b0Var2, fr.k kVar) {
        this(str, vehicleCollisionFileName, b0Var, b0Var2);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final iy.b0 getAccessToken() {
        return this.accessToken;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final iy.b0 getFileEncryptionIV() {
        return this.fileEncryptionIV;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final VehicleCollisionFileName getFileName() {
        return this.fileName;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VehicleCollisionFileToDownload)) {
            return false;
        }
        VehicleCollisionFileToDownload vehicleCollisionFileToDownload = (VehicleCollisionFileToDownload) other;
        return fr.t.c(this.url, vehicleCollisionFileToDownload.url) && fr.t.c(this.fileName, vehicleCollisionFileToDownload.fileName) && ry.a.d(this.fileEncryptionIV, vehicleCollisionFileToDownload.fileEncryptionIV) && fr.t.c(this.accessToken, vehicleCollisionFileToDownload.accessToken);
    }

    public int hashCode() {
        return (((((this.url.hashCode() * 31) + this.fileName.hashCode()) * 31) + ry.a.e(this.fileEncryptionIV)) * 31) + this.accessToken.hashCode();
    }

    public String toString() {
        return "VehicleCollisionFileToDownload(url=" + this.url + ", fileName=" + this.fileName + ", fileEncryptionIV=" + ry.a.f(this.fileEncryptionIV) + ", accessToken=" + this.accessToken + ")";
    }

    private VehicleCollisionFileToDownload(String str, VehicleCollisionFileName vehicleCollisionFileName, iy.b0 b0Var, iy.b0 b0Var2) {
        this.url = str;
        this.fileName = vehicleCollisionFileName;
        this.fileEncryptionIV = b0Var;
        this.accessToken = b0Var2;
    }
}
