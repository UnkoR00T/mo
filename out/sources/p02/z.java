package p02;

import p071kotlin.Metadata;
import xi0.ContactDetail;
import xi0.ContactDetails;
import xw.PhoneNumber;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001:\u0001\tB\t\b\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0006\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lp02/z;", "Lgz/a;", "Lp02/z$a;", "Lxw/h$b;", "<init>", "()V", "params", "b", "(Lp02/z$a;)Liy/b0;", "a", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class z implements gz.a<Params, PhoneNumber.b> {

    /* JADX INFO: renamed from: p02.z$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lp02/z$a;", "Lgz/b$a;", "Lxi0/e;", "rdkContactDetails", "<init>", "(Lxi0/e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lxi0/e;", "()Lxi0/e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements gz.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactDetails rdkContactDetails;

        public Params(ContactDetails contactDetails) {
            this.rdkContactDetails = contactDetails;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ContactDetails getRdkContactDetails() {
            return this.rdkContactDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && fr.t.c(this.rdkContactDetails, ((Params) other).rdkContactDetails);
        }

        public int hashCode() {
            return this.rdkContactDetails.hashCode();
        }

        public String toString() {
            return "Params(rdkContactDetails=" + this.rdkContactDetails + ')';
        }
    }

    public iy.b0 b(Params params) {
        ContactDetail phoneData = params.getRdkContactDetails().getPhoneData();
        if (phoneData != null) {
            iy.b0 value = phoneData.getValue();
            if (phoneData.getStatus() != xi0.c.IN_REGISTRY) {
                value = null;
            }
            iy.b0 b0VarC = value != null ? PhoneNumber.b.c(value) : null;
            PhoneNumber.b bVarB = b0VarC != null ? PhoneNumber.b.b(b0VarC) : null;
            if (bVarB != null) {
                return bVarB.getValue();
            }
        }
        return null;
    }
}
