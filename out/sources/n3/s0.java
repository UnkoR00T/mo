package n3;

import android.graphics.Path;
import android.graphics.PathMeasure;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J/\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0012\u001a\u00020\u00112\b\u0010\u000f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0010\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0016¨\u0006\u0018"}, d2 = {"Ln3/s0;", "Ln3/p2;", "Landroid/graphics/PathMeasure;", "internalPathMeasure", "<init>", "(Landroid/graphics/PathMeasure;)V", "", "startDistance", "stopDistance", "Ln3/m2;", "destination", "", "startWithMoveTo", "b", "(FFLn3/m2;Z)Z", "path", "forceClosed", "Loq/i0;", "c", "(Ln3/m2;Z)V", "a", "Landroid/graphics/PathMeasure;", "()F", "length", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s0 implements p2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final PathMeasure internalPathMeasure;

    public s0(PathMeasure pathMeasure) {
        this.internalPathMeasure = pathMeasure;
    }

    @Override // n3.p2
    public float a() {
        return this.internalPathMeasure.getLength();
    }

    @Override // n3.p2
    public boolean b(float startDistance, float stopDistance, m2 destination, boolean startWithMoveTo) {
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (destination instanceof p0) {
            return pathMeasure.getSegment(startDistance, stopDistance, ((p0) destination).getInternalPath(), startWithMoveTo);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // n3.p2
    public void c(m2 path, boolean forceClosed) {
        Path internalPath;
        PathMeasure pathMeasure = this.internalPathMeasure;
        if (path == null) {
            internalPath = null;
        } else {
            if (!(path instanceof p0)) {
                throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
            }
            internalPath = ((p0) path).getInternalPath();
        }
        pathMeasure.setPath(internalPath, forceClosed);
    }
}
