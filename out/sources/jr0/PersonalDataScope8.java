package jr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jr0.m, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0012\u0010\u0018¨\u0006\u0019"}, d2 = {"Ljr0/m;", "", "Ljr0/e;", "header", "Ljr0/n;", "data", "<init>", "(Ljr0/e;Ljr0/n;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljr0/e;", "getHeader", "()Ljr0/e;", "b", "Ljr0/n;", "()Ljr0/n;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope8 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HeaderContainer header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalDataScope8DataContainer data;

    public PersonalDataScope8(HeaderContainer headerContainer, PersonalDataScope8DataContainer personalDataScope8DataContainer) {
        this.header = headerContainer;
        this.data = personalDataScope8DataContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PersonalDataScope8DataContainer getData() {
        return this.data;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope8)) {
            return false;
        }
        PersonalDataScope8 personalDataScope8 = (PersonalDataScope8) other;
        return t.c(this.header, personalDataScope8.header) && t.c(this.data, personalDataScope8.data);
    }

    public int hashCode() {
        return (this.header.hashCode() * 31) + this.data.hashCode();
    }

    public String toString() {
        return "PersonalDataScope8(header=" + this.header + ", data=" + this.data + ")";
    }
}
