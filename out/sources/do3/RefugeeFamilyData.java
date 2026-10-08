package do3;

import fr.t;
import java.util.Map;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: do3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R#\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0018"}, d2 = {"Ldo3/f;", "", "Ldo3/e;", "mainCardData", "", "", "familyMembersData", "<init>", "(Ldo3/e;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldo3/e;", "b", "()Ldo3/e;", "Ljava/util/Map;", "()Ljava/util/Map;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class RefugeeFamilyData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final RefugeeCardData mainCardData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Map<String, RefugeeCardData> familyMembersData;

    public RefugeeFamilyData(RefugeeCardData refugeeCardData, Map<String, RefugeeCardData> map) {
        this.mainCardData = refugeeCardData;
        this.familyMembersData = map;
    }

    public final Map<String, RefugeeCardData> a() {
        return this.familyMembersData;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final RefugeeCardData getMainCardData() {
        return this.mainCardData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RefugeeFamilyData)) {
            return false;
        }
        RefugeeFamilyData refugeeFamilyData = (RefugeeFamilyData) other;
        return t.c(this.mainCardData, refugeeFamilyData.mainCardData) && t.c(this.familyMembersData, refugeeFamilyData.familyMembersData);
    }

    public int hashCode() {
        return (this.mainCardData.hashCode() * 31) + this.familyMembersData.hashCode();
    }

    public String toString() {
        return "RefugeeFamilyData(mainCardData=" + this.mainCardData + ", familyMembersData=" + this.familyMembersData + ')';
    }
}
