package x03;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: x03.c, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ.\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010\u0015\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lx03/c;", "", "Luv0/d;", "plate", "", "wasPlateVerified", "Lm03/a;", "plateCorrectness", "<init>", "(Ljava/lang/String;ZLm03/a;Lfr/k;)V", "a", "(Ljava/lang/String;ZLm03/a;)Lx03/c;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "c", "b", "Z", "e", "()Z", "Lm03/a;", "d", "()Lm03/a;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String plate;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean wasPlateVerified;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final m03.a plateCorrectness;

    public /* synthetic */ State(String str, boolean z15, m03.a aVar, fr.k kVar) {
        this(str, z15, aVar);
    }

    public static /* synthetic */ State b(State state, String str, boolean z15, m03.a aVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            str = state.plate;
        }
        if ((i15 & 2) != 0) {
            z15 = state.wasPlateVerified;
        }
        if ((i15 & 4) != 0) {
            aVar = state.plateCorrectness;
        }
        return state.a(str, z15, aVar);
    }

    public final State a(String plate, boolean wasPlateVerified, m03.a plateCorrectness) {
        return new State(plate, wasPlateVerified, plateCorrectness, null);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getPlate() {
        return this.plate;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m03.a getPlateCorrectness() {
        return this.plateCorrectness;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getWasPlateVerified() {
        return this.wasPlateVerified;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return uv0.d.e(this.plate, state.plate) && this.wasPlateVerified == state.wasPlateVerified && this.plateCorrectness == state.plateCorrectness;
    }

    public int hashCode() {
        return (((uv0.d.f(this.plate) * 31) + Boolean.hashCode(this.wasPlateVerified)) * 31) + this.plateCorrectness.hashCode();
    }

    public String toString() {
        return "State(plate=" + ((Object) uv0.d.h(this.plate)) + ", wasPlateVerified=" + this.wasPlateVerified + ", plateCorrectness=" + this.plateCorrectness + ')';
    }

    private State(String str, boolean z15, m03.a aVar) {
        this.plate = str;
        this.wasPlateVerified = z15;
        this.plateCorrectness = aVar;
    }

    public /* synthetic */ State(String str, boolean z15, m03.a aVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? uv0.d.INSTANCE.a() : str, (i15 & 2) != 0 ? false : z15, (i15 & 4) != 0 ? m03.a.CORRECT : aVar, null);
    }
}
