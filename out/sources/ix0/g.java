package ix0;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lix0/g;", "", "a", "Lix0/g$a;", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g {

    /* JADX INFO: renamed from: ix0.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lix0/g$a;", "Lix0/g;", "", "eIdConfirmationAvailable", "<init>", "(Z)V", "a", "(Z)Lix0/g$a;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "b", "()Z", "adddocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean eIdConfirmationAvailable;

        public Initialized() {
            this(false, 1, null);
        }

        public final Initialized a(boolean eIdConfirmationAvailable) {
            return new Initialized(eIdConfirmationAvailable);
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getEIdConfirmationAvailable() {
            return this.eIdConfirmationAvailable;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initialized) && this.eIdConfirmationAvailable == ((Initialized) other).eIdConfirmationAvailable;
        }

        public int hashCode() {
            return Boolean.hashCode(this.eIdConfirmationAvailable);
        }

        public String toString() {
            return "Initialized(eIdConfirmationAvailable=" + this.eIdConfirmationAvailable + ')';
        }

        public Initialized(boolean z15) {
            this.eIdConfirmationAvailable = z15;
        }

        public /* synthetic */ Initialized(boolean z15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? false : z15);
        }
    }
}
