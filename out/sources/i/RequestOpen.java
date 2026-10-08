package i;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: i.u3, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0080\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\t2\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R#\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b \u0010)¨\u0006*"}, d2 = {"Li/u3;", "Li/r2;", "Li/g4;", "virtualCamera", "", "Lh/v;", "sharedCameraIds", "Ll/i;", "graphListener", "", "isPrewarm", "Lkotlin/Function1;", "Loq/i0;", "isForegroundObserver", "<init>", "(Li/g4;Ljava/util/List;Ll/i;ZLer/l;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li/g4;", "b", "()Li/g4;", "Ljava/util/List;", "()Ljava/util/List;", "c", "Ll/i;", "getGraphListener", "()Ll/i;", "d", "Z", "()Z", "e", "Ler/l;", "()Ler/l;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class RequestOpen extends r2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final g4 virtualCamera;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<h.v> sharedCameraIds;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final l.i graphListener;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isPrewarm;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.l<oq.i0, Boolean> isForegroundObserver;

    /* JADX WARN: Multi-variable type inference failed */
    public RequestOpen(g4 g4Var, List<h.v> list, l.i iVar, boolean z15, er.l<? super oq.i0, Boolean> lVar) {
        super(null);
        this.virtualCamera = g4Var;
        this.sharedCameraIds = list;
        this.graphListener = iVar;
        this.isPrewarm = z15;
        this.isForegroundObserver = lVar;
    }

    public final List<h.v> a() {
        return this.sharedCameraIds;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final g4 getVirtualCamera() {
        return this.virtualCamera;
    }

    public final er.l<oq.i0, Boolean> c() {
        return this.isForegroundObserver;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final boolean getIsPrewarm() {
        return this.isPrewarm;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RequestOpen)) {
            return false;
        }
        RequestOpen requestOpen = (RequestOpen) other;
        return fr.t.c(this.virtualCamera, requestOpen.virtualCamera) && fr.t.c(this.sharedCameraIds, requestOpen.sharedCameraIds) && fr.t.c(this.graphListener, requestOpen.graphListener) && this.isPrewarm == requestOpen.isPrewarm && fr.t.c(this.isForegroundObserver, requestOpen.isForegroundObserver);
    }

    public int hashCode() {
        return (((((((this.virtualCamera.hashCode() * 31) + this.sharedCameraIds.hashCode()) * 31) + this.graphListener.hashCode()) * 31) + Boolean.hashCode(this.isPrewarm)) * 31) + this.isForegroundObserver.hashCode();
    }

    public String toString() {
        return "RequestOpen(virtualCamera=" + this.virtualCamera + ", sharedCameraIds=" + this.sharedCameraIds + ", graphListener=" + this.graphListener + ", isPrewarm=" + this.isPrewarm + ", isForegroundObserver=" + this.isForegroundObserver + ')';
    }
}
