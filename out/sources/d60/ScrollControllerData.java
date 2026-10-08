package d60;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d60.g, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0087\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001B+\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00038\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0018\u001a\u0004\b\u0013\u0010\u0019¨\u0006\u001a"}, d2 = {"Ld60/g;", "", "FIELD_INDEX", "Ld60/j;", "scrollInstance", "", "preventsImmediateScroll", "announceValidationErrorsOnScroll", "<init>", "(Ld60/j;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ld60/j;", "c", "()Ld60/j;", "b", "Z", "()Z", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class ScrollControllerData<FIELD_INDEX> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final j<FIELD_INDEX> scrollInstance;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean preventsImmediateScroll;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean announceValidationErrorsOnScroll;

    public ScrollControllerData(j<FIELD_INDEX> jVar, boolean z15, boolean z16) {
        this.scrollInstance = jVar;
        this.preventsImmediateScroll = z15;
        this.announceValidationErrorsOnScroll = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getAnnounceValidationErrorsOnScroll() {
        return this.announceValidationErrorsOnScroll;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getPreventsImmediateScroll() {
        return this.preventsImmediateScroll;
    }

    public final j<FIELD_INDEX> c() {
        return this.scrollInstance;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ScrollControllerData)) {
            return false;
        }
        ScrollControllerData scrollControllerData = (ScrollControllerData) other;
        return t.c(this.scrollInstance, scrollControllerData.scrollInstance) && this.preventsImmediateScroll == scrollControllerData.preventsImmediateScroll && this.announceValidationErrorsOnScroll == scrollControllerData.announceValidationErrorsOnScroll;
    }

    public int hashCode() {
        j<FIELD_INDEX> jVar = this.scrollInstance;
        return ((((jVar == null ? 0 : jVar.hashCode()) * 31) + Boolean.hashCode(this.preventsImmediateScroll)) * 31) + Boolean.hashCode(this.announceValidationErrorsOnScroll);
    }

    public String toString() {
        return "ScrollControllerData(scrollInstance=" + this.scrollInstance + ", preventsImmediateScroll=" + this.preventsImmediateScroll + ", announceValidationErrorsOnScroll=" + this.announceValidationErrorsOnScroll + ')';
    }

    public /* synthetic */ ScrollControllerData(j jVar, boolean z15, boolean z16, int i15, fr.k kVar) {
        this(jVar, (i15 & 2) != 0 ? true : z15, (i15 & 4) != 0 ? false : z16);
    }
}
