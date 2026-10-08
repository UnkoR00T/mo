package q51;

import bl0.BEChildBirthRegistrationInitial;
import bl0.s;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.t;
import fz.b;
import p071kotlin.Metadata;
import st3.AddressData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001:\u0001\u0012J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\r\u001a\u0004\u0018\u00010\bH&¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013À\u0006\u0003"}, d2 = {"Lq51/a;", "", "", "l", "()Z", "Lbl0/s;", "r0", "()Lbl0/s;", "Lq51/a$a;", "data", "Loq/i0;", i.f37090q, "(Lq51/a$a;)V", "K1", "()Lq51/a$a;", "Lbl0/n;", "i", "()Lbl0/n;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: q51.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lq51/a$a;", "", "Lst3/b;", "addressData", "Lfz/b$c;", "temporaryAddressEndDate", "<init>", "(Lst3/b;Lfz/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "()Lst3/b;", "b", "Lfz/b$c;", "()Lfz/b$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressData addressData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.LocalDate temporaryAddressEndDate;

        public Data(AddressData addressData, b.LocalDate localDate) {
            this.addressData = addressData;
            this.temporaryAddressEndDate = localDate;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AddressData getAddressData() {
            return this.addressData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b.LocalDate getTemporaryAddressEndDate() {
            return this.temporaryAddressEndDate;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.addressData, data.addressData) && t.c(this.temporaryAddressEndDate, data.temporaryAddressEndDate);
        }

        public int hashCode() {
            int iHashCode = this.addressData.hashCode() * 31;
            b.LocalDate localDate = this.temporaryAddressEndDate;
            return iHashCode + (localDate == null ? 0 : localDate.hashCode());
        }

        public String toString() {
            return "Data(addressData=" + this.addressData + ", temporaryAddressEndDate=" + this.temporaryAddressEndDate + ')';
        }
    }

    void H3(Data data);

    Data K1();

    BEChildBirthRegistrationInitial i();

    boolean l();

    s r0();
}
