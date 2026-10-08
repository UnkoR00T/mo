package fa;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: fa.i, reason: from toString */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lfa/i;", "", "T", "Lha/g;", "Lfa/h;", "scene", "<init>", "(Lfa/h;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lfa/h;", "getScene", "()Lfa/h;", "navigation3-ui"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class SceneInfo<T> extends ha.g {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final h<T> scene;

    public SceneInfo(h<T> hVar) {
        this.scene = hVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || SceneInfo.class != other.getClass()) {
            return false;
        }
        return fr.t.c(this.scene, ((SceneInfo) other).scene);
    }

    public int hashCode() {
        return this.scene.hashCode();
    }

    public String toString() {
        return "SceneInfo(scene=" + this.scene + ')';
    }
}
