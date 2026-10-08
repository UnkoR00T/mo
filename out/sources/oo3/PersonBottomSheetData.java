package oo3;

import g30.ModalBottomSheetData;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: oo3.b, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Loo3/b;", "", "Loo3/c;", "typeData", "Lg30/n;", "bottomSheetData", "<init>", "(Loo3/c;Lg30/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Loo3/c;", "b", "()Loo3/c;", "Lg30/n;", "()Lg30/n;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonBottomSheetData {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f147887c = ModalBottomSheetData.f70192e;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c typeData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final ModalBottomSheetData bottomSheetData;

    public PersonBottomSheetData(c cVar, ModalBottomSheetData modalBottomSheetData) {
        this.typeData = cVar;
        this.bottomSheetData = modalBottomSheetData;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final ModalBottomSheetData getBottomSheetData() {
        return this.bottomSheetData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final c getTypeData() {
        return this.typeData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonBottomSheetData)) {
            return false;
        }
        PersonBottomSheetData personBottomSheetData = (PersonBottomSheetData) other;
        return fr.t.c(this.typeData, personBottomSheetData.typeData) && fr.t.c(this.bottomSheetData, personBottomSheetData.bottomSheetData);
    }

    public int hashCode() {
        c cVar = this.typeData;
        return ((cVar == null ? 0 : cVar.hashCode()) * 31) + this.bottomSheetData.hashCode();
    }

    public String toString() {
        return "PersonBottomSheetData(typeData=" + this.typeData + ", bottomSheetData=" + this.bottomSheetData + ')';
    }
}
