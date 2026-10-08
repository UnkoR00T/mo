package tk1;

import al0.BEContactDetailsData;
import fr.t;
import gz.b;
import mx.c;
import p071kotlin.Metadata;
import ru3.ContactDetailsData;
import ru3.ContactDetailsFormData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u000bB\u0011\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Ltk1/a;", "Lgz/a;", "Ltk1/a$a;", "Lru3/c;", "Lmx/c;", "labelProvider", "<init>", "(Lmx/c;)V", "params", "b", "(Ltk1/a$a;)Lru3/c;", "a", "Lmx/c;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class a implements gz.a<Params, ContactDetailsFormData> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final c labelProvider;

    /* JADX INFO: renamed from: tk1.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Ltk1/a$a;", "Lgz/b$a;", "Lal0/j;", "initialDetails", "<init>", "(Lal0/j;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/j;", "()Lal0/j;", "dependentidinvalidation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Params implements b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BEContactDetailsData initialDetails;

        public Params(BEContactDetailsData bEContactDetailsData) {
            this.initialDetails = bEContactDetailsData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BEContactDetailsData getInitialDetails() {
            return this.initialDetails;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Params) && t.c(this.initialDetails, ((Params) other).initialDetails);
        }

        public int hashCode() {
            BEContactDetailsData bEContactDetailsData = this.initialDetails;
            if (bEContactDetailsData == null) {
                return 0;
            }
            return bEContactDetailsData.hashCode();
        }

        public String toString() {
            return "Params(initialDetails=" + this.initialDetails + ')';
        }
    }

    public a(c cVar) {
        this.labelProvider = cVar;
    }

    public ContactDetailsFormData b(Params params) {
        BEContactDetailsData initialDetails = params.getInitialDetails();
        return new ContactDetailsFormData(initialDetails != null ? new ContactDetailsData(initialDetails.getPhoneNumber(), initialDetails.getEmailAddress()) : null, this.labelProvider.c(gk1.a.f73460u0));
    }
}
