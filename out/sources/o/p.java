package o;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u00020\u0001:\u0001\u0012B!\b\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0007¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0007¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u00038G¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0011¨\u0006\u001a"}, d2 = {"Lo/p;", "", "", "", "cameraIds", "Lv/b2;", "compatibilityId", "<init>", "(Ljava/util/List;Lv/b2;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "toString", "()Ljava/lang/String;", "a", "Ljava/util/List;", "()Ljava/util/List;", "b", "Lv/b2;", "getCompatibilityId", "()Lv/b2;", "internalId", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final List<String> cameraIds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final v.b2 compatibilityId;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\n\u001a\u00020\t2\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\u000e\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ!\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u0012\u001a\u0004\u0018\u00010\u0010H\u0007¢\u0006\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo/p$a;", "", "<init>", "()V", "", "", "cameraIds", "Lv/b2;", "compatibilityId", "Lo/p;", "c", "(Ljava/util/List;Lv/b2;)Lo/p;", "primaryCameraId", "secondaryCameraId", "b", "(Ljava/lang/String;Ljava/lang/String;Lv/b2;)Lo/p;", "Lv/e;", "primaryInfo", "secondaryInfo", "e", "(Lv/e;Lv/e;)Lo/p;", "camera-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f140101a = new a();

        private a() {
        }

        public static final p a(String str) {
            return d(str, null, null, 6, null);
        }

        public static final p b(String primaryCameraId, String secondaryCameraId, v.b2 compatibilityId) {
            List listT = pq.v.t(primaryCameraId);
            if (secondaryCameraId != null) {
                listT.add(secondaryCameraId);
            }
            return c(listT, compatibilityId);
        }

        public static final p c(List<String> cameraIds, v.b2 compatibilityId) {
            return new p(cameraIds, compatibilityId, null);
        }

        public static /* synthetic */ p d(String str, String str2, v.b2 b2Var, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                str2 = null;
            }
            if ((i15 & 4) != 0) {
                b2Var = null;
            }
            return b(str, str2, b2Var);
        }

        public static final p e(v.e primaryInfo, v.e secondaryInfo) {
            return b(primaryInfo.i(), secondaryInfo != null ? secondaryInfo.i() : null, primaryInfo.e().b0());
        }
    }

    public /* synthetic */ p(List list, v.b2 b2Var, fr.k kVar) {
        this(list, b2Var);
    }

    public final List<String> a() {
        return this.cameraIds;
    }

    public final String b() {
        i6.i.j(this.cameraIds.size() == 1, "getInternalId() is only available for single-camera identifiers.");
        return (String) pq.v.l0(this.cameraIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof p)) {
            return false;
        }
        p pVar = (p) other;
        return fr.t.c(this.cameraIds, pVar.cameraIds) && fr.t.c(this.compatibilityId, pVar.compatibilityId);
    }

    public int hashCode() {
        int iHashCode = this.cameraIds.hashCode() * 31;
        v.b2 b2Var = this.compatibilityId;
        return iHashCode + (b2Var != null ? b2Var.hashCode() : 0);
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0037  */
    public String toString() {
        String str;
        StringBuilder sb5 = new StringBuilder();
        sb5.append("CameraIdentifier{cameraIds=");
        sb5.append(pq.v.v0(this.cameraIds, ",", null, null, 0, null, null, 62, null));
        v.b2 b2Var = this.compatibilityId;
        if (b2Var != null) {
            str = ", compatId=" + b2Var;
            if (str == null) {
                str = "";
            }
        } else {
            str = "";
        }
        sb5.append(str);
        sb5.append('}');
        return sb5.toString();
    }

    private p(List<String> list, v.b2 b2Var) {
        this.cameraIds = list;
        this.compatibilityId = b2Var;
        i6.i.b(!list.isEmpty(), "Camera ID set cannot be empty.");
    }
}
