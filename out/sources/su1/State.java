package su1;

import fr.t;
import java.util.List;
import ou1.DrivingLicenceData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: su1.e, reason: from toString */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Lsu1/e;", "", "", "pickedDocument", "", "Lou1/f;", "documents", "<init>", "(Ljava/lang/Integer;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/Integer;", "getPickedDocument", "()Ljava/lang/Integer;", "b", "Ljava/util/List;", "()Ljava/util/List;", "drivinglicence_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class State {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer pickedDocument;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<DrivingLicenceData> documents;

    public State(Integer num, List<DrivingLicenceData> list) {
        this.pickedDocument = num;
        this.documents = list;
    }

    public final List<DrivingLicenceData> a() {
        return this.documents;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof State)) {
            return false;
        }
        State state = (State) other;
        return t.c(this.pickedDocument, state.pickedDocument) && t.c(this.documents, state.documents);
    }

    public int hashCode() {
        Integer num = this.pickedDocument;
        return ((num == null ? 0 : num.hashCode()) * 31) + this.documents.hashCode();
    }

    public String toString() {
        return "State(pickedDocument=" + this.pickedDocument + ", documents=" + this.documents + ')';
    }

    public /* synthetic */ State(Integer num, List list, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : num, list);
    }
}
