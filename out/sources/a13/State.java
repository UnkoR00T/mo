package a13;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: a13.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"La13/b;", "", "Luv0/d;", "plate", "Lsz/d;", "cameraPreviewViewConnector", "<init>", "(Ljava/lang/String;Lsz/d;Lfr/k;)V", "a", "(Ljava/lang/String;Lsz/d;)La13/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "d", "b", "Lsz/d;", "c", "()Lsz/d;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String plate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final sz.d cameraPreviewViewConnector;

    public /* synthetic */ State(String str, sz.d dVar, fr.k kVar) {
        this(str, dVar);
    }

    public static /* synthetic */ State b(State state, String str, sz.d dVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.plate;
        }
        if ((i15 & 2) != 0) {
            dVar = state.cameraPreviewViewConnector;
        }
        return state.a(str, dVar);
    }

    public final State a(String plate, sz.d cameraPreviewViewConnector) {
        return new State(plate, cameraPreviewViewConnector, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final sz.d getCameraPreviewViewConnector() {
        return this.cameraPreviewViewConnector;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final String getPlate() {
        return this.plate;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return uv0.d.e(this.plate, state.plate) && t.c(this.cameraPreviewViewConnector, state.cameraPreviewViewConnector);
    }

    public int hashCode() {
        return (uv0.d.f(this.plate) * 31) + this.cameraPreviewViewConnector.hashCode();
    }

    public String toString() {
        return "State(plate=" + ((Object) uv0.d.h(this.plate)) + ", cameraPreviewViewConnector=" + this.cameraPreviewViewConnector + ')';
    }

    private State(String str, sz.d dVar) {
        this.plate = str;
        this.cameraPreviewViewConnector = dVar;
    }

    public /* synthetic */ State(String str, sz.d dVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? uv0.d.INSTANCE.a() : str, dVar, null);
    }
}
