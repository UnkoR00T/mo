package al0;

import p071kotlin.Metadata;

/* JADX INFO: renamed from: al0.w, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\nR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0015\u0010\nR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0013\u001a\u0004\b\u0012\u0010\n¨\u0006\u0016"}, d2 = {"Lal0/w;", "", "Lal0/w$a;", "id", "", "name", "description", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lfr/k;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "c", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class DMSTerytDetail {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String id;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final String description;

    /* JADX INFO: renamed from: al0.w$a */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0005J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\t\u0088\u0001\u0003\u0092\u0001\u00020\u0002¨\u0006\n"}, d2 = {"Lal0/w$a;", "", "", "value", "a", "(Ljava/lang/String;)Ljava/lang/String;", "d", "", "c", "(Ljava/lang/String;)I", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a {
        public static String a(String str) {
            return str;
        }

        public static final boolean b(String str, String str2) {
            return fr.t.c(str, str2);
        }

        public static int c(String str) {
            return str.hashCode();
        }

        public static String d(String str) {
            return "Id(value=" + str + ")";
        }
    }

    public /* synthetic */ DMSTerytDetail(String str, String str2, String str3, fr.k kVar) {
        this(str, str2, str3);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final String getName() {
        return this.name;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DMSTerytDetail)) {
            return false;
        }
        DMSTerytDetail dMSTerytDetail = (DMSTerytDetail) other;
        return a.b(this.id, dMSTerytDetail.id) && fr.t.c(this.name, dMSTerytDetail.name) && fr.t.c(this.description, dMSTerytDetail.description);
    }

    public int hashCode() {
        int iC = ((a.c(this.id) * 31) + this.name.hashCode()) * 31;
        String str = this.description;
        return iC + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "DMSTerytDetail(id=" + a.d(this.id) + ", name=" + this.name + ", description=" + this.description + ")";
    }

    private DMSTerytDetail(String str, String str2, String str3) {
        this.id = str;
        this.name = str2;
        this.description = str3;
    }
}
