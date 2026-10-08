package bl0;

import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: bl0.l, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0012B#\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0013\u001a\u0004\b\u0012\u0010\u0015¨\u0006\u0016"}, d2 = {"Lbl0/l;", "", "", "Lbl0/l$a;", "preferredOffices", "otherOffices", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "b", "()Ljava/util/List;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BEChildBirthRegistrationCivilRegistryOffices {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Office> preferredOffices;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<Office> otherOffices;

    /* JADX INFO: renamed from: bl0.l$a, reason: from toString */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lbl0/l$a;", "", "", "name", "officeCode", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "b", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Office {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final String name;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final String officeCode;

        public Office(String str, String str2) {
            this.name = str;
            this.officeCode = str2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final String getOfficeCode() {
            return this.officeCode;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Office)) {
                return false;
            }
            Office office = (Office) other;
            return fr.t.c(this.name, office.name) && fr.t.c(this.officeCode, office.officeCode);
        }

        public int hashCode() {
            return (this.name.hashCode() * 31) + this.officeCode.hashCode();
        }

        public String toString() {
            return "Office(name=" + this.name + ", officeCode=" + this.officeCode + ")";
        }
    }

    public BEChildBirthRegistrationCivilRegistryOffices(List<Office> list, List<Office> list2) {
        this.preferredOffices = list;
        this.otherOffices = list2;
    }

    public final List<Office> a() {
        return this.otherOffices;
    }

    public final List<Office> b() {
        return this.preferredOffices;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BEChildBirthRegistrationCivilRegistryOffices)) {
            return false;
        }
        BEChildBirthRegistrationCivilRegistryOffices bEChildBirthRegistrationCivilRegistryOffices = (BEChildBirthRegistrationCivilRegistryOffices) other;
        return fr.t.c(this.preferredOffices, bEChildBirthRegistrationCivilRegistryOffices.preferredOffices) && fr.t.c(this.otherOffices, bEChildBirthRegistrationCivilRegistryOffices.otherOffices);
    }

    public int hashCode() {
        return (this.preferredOffices.hashCode() * 31) + this.otherOffices.hashCode();
    }

    public String toString() {
        return "BEChildBirthRegistrationCivilRegistryOffices(preferredOffices=" + this.preferredOffices + ", otherOffices=" + this.otherOffices + ")";
    }
}
