package do3;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: do3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0018\u0014\u0012B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0016\u001a\u0004\b\u0012\u0010\u0017¨\u0006\u0019"}, d2 = {"Ldo3/c;", "", "Ldo3/c$c;", "restrictionType", "Ldo3/c$b;", "restriction", "<init>", "(Ldo3/c$c;Ldo3/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ldo3/c$c;", "b", "()Ldo3/c$c;", "Ldo3/c$b;", "()Ldo3/c$b;", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class NipipCardData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final EnumC0978c restrictionType;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b restriction;

    /* JADX INFO: renamed from: do3.c$a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Ldo3/c$a;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum a {
        NURSE,
        MIDWIFE;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ wq.a f43607d = wq.b.a(b());
    }

    /* JADX INFO: renamed from: do3.c$b */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Ldo3/c$b;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum b {
        FULL,
        PARTIAL,
        UNKNOWN;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f43612e = wq.b.a(b());
    }

    /* JADX INFO: renamed from: do3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Ldo3/c$c;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public enum EnumC0978c {
        RANGE,
        INDIVIDUAL,
        UNDER_SUPERVISION,
        FIXED_TERM,
        UNKNOWN;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f43619g = wq.b.a(b());
    }

    public NipipCardData(EnumC0978c enumC0978c, b bVar) {
        this.restrictionType = enumC0978c;
        this.restriction = bVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final b getRestriction() {
        return this.restriction;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final EnumC0978c getRestrictionType() {
        return this.restrictionType;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NipipCardData)) {
            return false;
        }
        NipipCardData nipipCardData = (NipipCardData) other;
        return this.restrictionType == nipipCardData.restrictionType && this.restriction == nipipCardData.restriction;
    }

    public int hashCode() {
        EnumC0978c enumC0978c = this.restrictionType;
        return ((enumC0978c == null ? 0 : enumC0978c.hashCode()) * 31) + this.restriction.hashCode();
    }

    public String toString() {
        return "NipipCardData(restrictionType=" + this.restrictionType + ", restriction=" + this.restriction + ')';
    }
}
