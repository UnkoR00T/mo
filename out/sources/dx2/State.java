package dx2;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: dx2.b, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ:\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0014\u001a\u00020\u00042\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001f\u001a\u0004\b\u001d\u0010 ¨\u0006!"}, d2 = {"Ldx2/b;", "", "Lzz/h;", "pickedFile", "", "isValid", "scrollToPicker", "Lg30/v;", "bottomSheetValue", "<init>", "(Lzz/h;ZZLg30/v;)V", "a", "(Lzz/h;ZZLg30/v;)Ldx2/b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lzz/h;", "d", "()Lzz/h;", "b", "Z", "f", "()Z", "c", "e", "Lg30/v;", "()Lg30/v;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final zz.h pickedFile;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean scrollToPicker;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final g30.v bottomSheetValue;

    public State() {
        this(null, false, false, null, 15, null);
    }

    public static /* synthetic */ State b(State state, zz.h hVar, boolean z15, boolean z16, g30.v vVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            hVar = state.pickedFile;
        }
        if ((i15 & 2) != 0) {
            z15 = state.isValid;
        }
        if ((i15 & 4) != 0) {
            z16 = state.scrollToPicker;
        }
        if ((i15 & 8) != 0) {
            vVar = state.bottomSheetValue;
        }
        return state.a(hVar, z15, z16, vVar);
    }

    public final State a(zz.h pickedFile, boolean isValid, boolean scrollToPicker, g30.v bottomSheetValue) {
        return new State(pickedFile, isValid, scrollToPicker, bottomSheetValue);
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final zz.h getPickedFile() {
        return this.pickedFile;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final boolean getScrollToPicker() {
        return this.scrollToPicker;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return fr.t.c(this.pickedFile, state.pickedFile) && this.isValid == state.isValid && this.scrollToPicker == state.scrollToPicker && this.bottomSheetValue == state.bottomSheetValue;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final boolean getIsValid() {
        return this.isValid;
    }

    public int hashCode() {
        zz.h hVar = this.pickedFile;
        return ((((((hVar == null ? 0 : hVar.hashCode()) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.scrollToPicker)) * 31) + this.bottomSheetValue.hashCode();
    }

    public String toString() {
        return "State(pickedFile=" + this.pickedFile + ", isValid=" + this.isValid + ", scrollToPicker=" + this.scrollToPicker + ", bottomSheetValue=" + this.bottomSheetValue + ')';
    }

    public State(zz.h hVar, boolean z15, boolean z16, g30.v vVar) {
        this.pickedFile = hVar;
        this.isValid = z15;
        this.scrollToPicker = z16;
        this.bottomSheetValue = vVar;
    }

    public /* synthetic */ State(zz.h hVar, boolean z15, boolean z16, g30.v vVar, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : hVar, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? false : z16, (i15 & 8) != 0 ? g30.v.HIDDEN : vVar);
    }
}
