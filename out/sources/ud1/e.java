package ud1;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lud1/e;", "", "a", "Lud1/e$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e {

    /* JADX INFO: renamed from: ud1.e$a, reason: from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lud1/e$a;", "Lud1/e;", "Lud1/d;", "address", "Lud1/c;", "provider", "<init>", "(Lud1/d;Lud1/c;)V", "a", "(Lud1/d;Lud1/c;)Lud1/e$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lud1/d;", "c", "()Lud1/d;", "b", "Lud1/c;", "d", "()Lud1/c;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class FormDisplayed implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Regular address;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final DropDown provider;

        public FormDisplayed(Regular regular, DropDown dropDown) {
            this.address = regular;
            this.provider = dropDown;
        }

        public static /* synthetic */ FormDisplayed b(FormDisplayed formDisplayed, Regular regular, DropDown dropDown, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                regular = formDisplayed.address;
            }
            if ((i15 & 2) != 0) {
                dropDown = formDisplayed.provider;
            }
            return formDisplayed.a(regular, dropDown);
        }

        public final FormDisplayed a(Regular address, DropDown provider) {
            return new FormDisplayed(address, provider);
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Regular getAddress() {
            return this.address;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final DropDown getProvider() {
            return this.provider;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FormDisplayed)) {
                return false;
            }
            FormDisplayed formDisplayed = (FormDisplayed) other;
            return fr.t.c(this.address, formDisplayed.address) && fr.t.c(this.provider, formDisplayed.provider);
        }

        public int hashCode() {
            return (this.address.hashCode() * 31) + this.provider.hashCode();
        }

        public String toString() {
            return "FormDisplayed(address=" + this.address + ", provider=" + this.provider + ')';
        }
    }
}
