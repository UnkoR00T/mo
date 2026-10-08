package h;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: h.w0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Lh/w0;", "", "Ln/o;", "image", "Lh/p0;", "frameInfo", "<init>", "(Ln/o;Lh/p0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln/o;", "b", "()Ln/o;", "Lh/p0;", "()Lh/p0;", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class InputRequest {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final n.o image;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final p0 frameInfo;

    public InputRequest(n.o oVar, p0 p0Var) {
        this.image = oVar;
        this.frameInfo = p0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final p0 getFrameInfo() {
        return this.frameInfo;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final n.o getImage() {
        return this.image;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InputRequest)) {
            return false;
        }
        InputRequest inputRequest = (InputRequest) other;
        return fr.t.c(this.image, inputRequest.image) && fr.t.c(this.frameInfo, inputRequest.frameInfo);
    }

    public int hashCode() {
        return (this.image.hashCode() * 31) + this.frameInfo.hashCode();
    }

    public String toString() {
        return "InputRequest(image=" + this.image + ", frameInfo=" + this.frameInfo + ')';
    }
}
