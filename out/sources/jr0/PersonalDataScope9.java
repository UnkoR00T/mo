package jr0;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: jr0.o, reason: from toString */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0014\u0010\u001d¨\u0006\u001e"}, d2 = {"Ljr0/o;", "", "Ljr0/e;", "header", "Ljr0/f;", "dh", "Ljr0/p;", "data", "<init>", "(Ljr0/e;Ljr0/f;Ljr0/p;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljr0/e;", "getHeader", "()Ljr0/e;", "b", "Ljr0/f;", "()Ljr0/f;", "c", "Ljr0/p;", "()Ljr0/p;", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class PersonalDataScope9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final HeaderContainer header;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final MnemonicHeaderContainer dh;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final PersonalDataScope9DataContainer data;

    public PersonalDataScope9(HeaderContainer headerContainer, MnemonicHeaderContainer mnemonicHeaderContainer, PersonalDataScope9DataContainer personalDataScope9DataContainer) {
        this.header = headerContainer;
        this.dh = mnemonicHeaderContainer;
        this.data = personalDataScope9DataContainer;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final PersonalDataScope9DataContainer getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final MnemonicHeaderContainer getDh() {
        return this.dh;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PersonalDataScope9)) {
            return false;
        }
        PersonalDataScope9 personalDataScope9 = (PersonalDataScope9) other;
        return t.c(this.header, personalDataScope9.header) && t.c(this.dh, personalDataScope9.dh) && t.c(this.data, personalDataScope9.data);
    }

    public int hashCode() {
        return (((this.header.hashCode() * 31) + this.dh.hashCode()) * 31) + this.data.hashCode();
    }

    public String toString() {
        return "PersonalDataScope9(header=" + this.header + ", dh=" + this.dh + ", data=" + this.data + ")";
    }
}
