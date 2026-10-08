package g2;

import fr.t;
import nb.WindowSizeClass;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: g2.g, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lg2/g;", "", "Lnb/a;", "windowSizeClass", "Lg2/f;", "windowPosture", "<init>", "(Lnb/a;Lg2/f;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "Lnb/a;", "()Lnb/a;", "b", "Lg2/f;", "getWindowPosture", "()Lg2/f;", "adaptive"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class WindowAdaptiveInfo {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final WindowSizeClass windowSizeClass;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Posture windowPosture;

    public WindowAdaptiveInfo(WindowSizeClass windowSizeClass, Posture posture) {
        this.windowSizeClass = windowSizeClass;
        this.windowPosture = posture;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final WindowSizeClass getWindowSizeClass() {
        return this.windowSizeClass;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof WindowAdaptiveInfo)) {
            return false;
        }
        WindowAdaptiveInfo windowAdaptiveInfo = (WindowAdaptiveInfo) other;
        return t.c(this.windowSizeClass, windowAdaptiveInfo.windowSizeClass) && t.c(this.windowPosture, windowAdaptiveInfo.windowPosture);
    }

    public int hashCode() {
        return (this.windowSizeClass.hashCode() * 31) + this.windowPosture.hashCode();
    }

    public String toString() {
        return "WindowAdaptiveInfo(windowSizeClass=" + this.windowSizeClass + ", windowPosture=" + this.windowPosture + ')';
    }
}
