package ox2;

import al0.ApplicationReason;
import java.util.List;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lox2/b;", "", "a", "b", "Lox2/b$a;", "Lox2/b$b;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b {

    /* JADX INFO: renamed from: ox2.b$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lox2/b$a;", "Lox2/b;", "Lal0/g;", "ownerWithAge", "<init>", "(Lal0/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lal0/g;", "()Lal0/g;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initial implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.g ownerWithAge;

        public Initial(al0.g gVar) {
            this.ownerWithAge = gVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public al0.g getOwnerWithAge() {
            return this.ownerWithAge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Initial) && fr.t.c(this.ownerWithAge, ((Initial) other).ownerWithAge);
        }

        public int hashCode() {
            return this.ownerWithAge.hashCode();
        }

        public String toString() {
            return "Initial(ownerWithAge=" + this.ownerWithAge + ')';
        }
    }

    /* JADX INFO: renamed from: ox2.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJT\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\u000bHÆ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010&\u001a\u0004\b)\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b%\u0010+¨\u0006,"}, d2 = {"Lox2/b$b;", "Lox2/b;", "Lal0/g;", "ownerWithAge", "", "Lal0/h;", "allReasons", "selectedReason", "", "isValid", "requestToBringIntoView", "Lox2/d;", "elementToAutoFocus", "<init>", "(Lal0/g;Ljava/util/List;Lal0/h;ZZLox2/d;)V", "a", "(Lal0/g;Ljava/util/List;Lal0/h;ZZLox2/d;)Lox2/b$b;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lal0/g;", "e", "()Lal0/g;", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "Lal0/h;", "g", "()Lal0/h;", "d", "Z", "h", "()Z", "f", "Lox2/d;", "()Lox2/d;", "physicalidcardapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Initialized implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final al0.g ownerWithAge;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<ApplicationReason> allReasons;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final ApplicationReason selectedReason;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean isValid;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final boolean requestToBringIntoView;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final d elementToAutoFocus;

        public Initialized(al0.g gVar, List<ApplicationReason> list, ApplicationReason applicationReason, boolean z15, boolean z16, d dVar) {
            this.ownerWithAge = gVar;
            this.allReasons = list;
            this.selectedReason = applicationReason;
            this.isValid = z15;
            this.requestToBringIntoView = z16;
            this.elementToAutoFocus = dVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Initialized b(Initialized initialized, al0.g gVar, List list, ApplicationReason applicationReason, boolean z15, boolean z16, d dVar, int i15, Object obj) {
            if ((i15 & 1) != 0) {
                gVar = initialized.ownerWithAge;
            }
            if ((i15 & 2) != 0) {
                list = initialized.allReasons;
            }
            if ((i15 & 4) != 0) {
                applicationReason = initialized.selectedReason;
            }
            if ((i15 & 8) != 0) {
                z15 = initialized.isValid;
            }
            if ((i15 & 16) != 0) {
                z16 = initialized.requestToBringIntoView;
            }
            if ((i15 & 32) != 0) {
                dVar = initialized.elementToAutoFocus;
            }
            boolean z17 = z16;
            d dVar2 = dVar;
            return initialized.a(gVar, list, applicationReason, z15, z17, dVar2);
        }

        public final Initialized a(al0.g ownerWithAge, List<ApplicationReason> allReasons, ApplicationReason selectedReason, boolean isValid, boolean requestToBringIntoView, d elementToAutoFocus) {
            return new Initialized(ownerWithAge, allReasons, selectedReason, isValid, requestToBringIntoView, elementToAutoFocus);
        }

        public final List<ApplicationReason> c() {
            return this.allReasons;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final d getElementToAutoFocus() {
            return this.elementToAutoFocus;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public al0.g getOwnerWithAge() {
            return this.ownerWithAge;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Initialized)) {
                return false;
            }
            Initialized initialized = (Initialized) other;
            return fr.t.c(this.ownerWithAge, initialized.ownerWithAge) && fr.t.c(this.allReasons, initialized.allReasons) && fr.t.c(this.selectedReason, initialized.selectedReason) && this.isValid == initialized.isValid && this.requestToBringIntoView == initialized.requestToBringIntoView && this.elementToAutoFocus == initialized.elementToAutoFocus;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getRequestToBringIntoView() {
            return this.requestToBringIntoView;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final ApplicationReason getSelectedReason() {
            return this.selectedReason;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final boolean getIsValid() {
            return this.isValid;
        }

        public int hashCode() {
            int iHashCode = ((this.ownerWithAge.hashCode() * 31) + this.allReasons.hashCode()) * 31;
            ApplicationReason applicationReason = this.selectedReason;
            return ((((((iHashCode + (applicationReason == null ? 0 : applicationReason.hashCode())) * 31) + Boolean.hashCode(this.isValid)) * 31) + Boolean.hashCode(this.requestToBringIntoView)) * 31) + this.elementToAutoFocus.hashCode();
        }

        public String toString() {
            return "Initialized(ownerWithAge=" + this.ownerWithAge + ", allReasons=" + this.allReasons + ", selectedReason=" + this.selectedReason + ", isValid=" + this.isValid + ", requestToBringIntoView=" + this.requestToBringIntoView + ", elementToAutoFocus=" + this.elementToAutoFocus + ')';
        }

        public /* synthetic */ Initialized(al0.g gVar, List list, ApplicationReason applicationReason, boolean z15, boolean z16, d dVar, int i15, fr.k kVar) {
            this(gVar, list, applicationReason, (i15 & 8) != 0 ? true : z15, (i15 & 16) != 0 ? false : z16, dVar);
        }
    }
}
