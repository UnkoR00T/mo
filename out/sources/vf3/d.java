package vf3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lvf3/d;", "Ll00/e;", "Lvf3/d$a;", "a", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lvf3/d$a;", "", "a", "b", "Lvf3/d$a$a;", "Lvf3/d$a$b;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: vf3.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lvf3/d$a$a;", "Lvf3/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5402a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5402a f206490a = new C5402a();

            private C5402a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5402a);
            }

            public int hashCode() {
                return 351341269;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: vf3.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001B}\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u000f\u001a\u00020\t\u0012\u0006\u0010\u0010\u001a\u00020\t\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010\"\u001a\u00020!2\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b\"\u0010#R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b(\u0010*R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b/\u0010-R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b/\u00101\u001a\u0004\b4\u00103R\u0017\u0010\f\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b$\u0010-R\u0017\u0010\r\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b4\u00101\u001a\u0004\b5\u00103R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b6\u00101\u001a\u0004\b0\u00103R\u0017\u0010\u000f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b7\u00101\u001a\u0004\b8\u00103R\u0017\u0010\u0010\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b9\u00101\u001a\u0004\b.\u00103R\u0017\u0010\u0011\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00101\u001a\u0004\b6\u00103R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b7\u0010;R\u001d\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148\u0006¢\u0006\f\n\u0004\b8\u0010<\u001a\u0004\b9\u0010=¨\u0006>"}, d2 = {"Lvf3/d$a$b;", "Lvf3/d$a;", "Li50/a;", "baseScaffoldData", "Lc30/b;", "alertData", "Lmx/a;", "contactTitle", "contactDescription", "Lv50/c;", "phoneNumber", "email", "addressTitle", "postCode", "city", "street", "buildingNumber", "flatNumber", "Lh30/a;", "nextButtonData", "Lkotlin/Function0;", "Loq/i0;", "onPointerTouch", "<init>", "(Li50/a;Lc30/b;Lmx/a;Lmx/a;Lv50/c;Lv50/c;Lmx/a;Lv50/c;Lv50/c;Lv50/c;Lv50/c;Lv50/c;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lc30/b;", "()Lc30/b;", "Lmx/a;", "g", "()Lmx/a;", "d", "f", "e", "Lv50/c;", "l", "()Lv50/c;", "h", "m", "i", "j", "n", "k", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: o, reason: collision with root package name */
            public static final int f206491o = (v50.c.f203957t | c30.b.f22944i) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label contactTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label contactDescription;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c phoneNumber;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c email;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label addressTitle;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c postCode;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c city;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c street;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c buildingNumber;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c flatNumber;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onPointerTouch;

            public Initialized(BaseScaffoldData baseScaffoldData, c30.b bVar, Label label, Label label2, v50.c cVar, v50.c cVar2, Label label3, v50.c cVar3, v50.c cVar4, v50.c cVar5, v50.c cVar6, v50.c cVar7, ButtonData buttonData, er.a<oq.i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.alertData = bVar;
                this.contactTitle = label;
                this.contactDescription = label2;
                this.phoneNumber = cVar;
                this.email = cVar2;
                this.addressTitle = label3;
                this.postCode = cVar3;
                this.city = cVar4;
                this.street = cVar5;
                this.buildingNumber = cVar6;
                this.flatNumber = cVar7;
                this.nextButtonData = buttonData;
                this.onPointerTouch = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getAddressTitle() {
                return this.addressTitle;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final v50.c getBuildingNumber() {
                return this.buildingNumber;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final v50.c getCity() {
                return this.city;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.contactTitle, initialized.contactTitle) && fr.t.c(this.contactDescription, initialized.contactDescription) && fr.t.c(this.phoneNumber, initialized.phoneNumber) && fr.t.c(this.email, initialized.email) && fr.t.c(this.addressTitle, initialized.addressTitle) && fr.t.c(this.postCode, initialized.postCode) && fr.t.c(this.city, initialized.city) && fr.t.c(this.street, initialized.street) && fr.t.c(this.buildingNumber, initialized.buildingNumber) && fr.t.c(this.flatNumber, initialized.flatNumber) && fr.t.c(this.nextButtonData, initialized.nextButtonData) && fr.t.c(this.onPointerTouch, initialized.onPointerTouch);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getContactDescription() {
                return this.contactDescription;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getContactTitle() {
                return this.contactTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final v50.c getEmail() {
                return this.email;
            }

            public int hashCode() {
                return (((((((((((((((((((((((((this.baseScaffoldData.hashCode() * 31) + this.alertData.hashCode()) * 31) + this.contactTitle.hashCode()) * 31) + this.contactDescription.hashCode()) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode()) * 31) + this.addressTitle.hashCode()) * 31) + this.postCode.hashCode()) * 31) + this.city.hashCode()) * 31) + this.street.hashCode()) * 31) + this.buildingNumber.hashCode()) * 31) + this.flatNumber.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31) + this.onPointerTouch.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final v50.c getFlatNumber() {
                return this.flatNumber;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public final er.a<oq.i0> k() {
                return this.onPointerTouch;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final v50.c getPhoneNumber() {
                return this.phoneNumber;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final v50.c getPostCode() {
                return this.postCode;
            }

            /* JADX INFO: renamed from: n, reason: from getter */
            public final v50.c getStreet() {
                return this.street;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", alertData=" + this.alertData + ", contactTitle=" + this.contactTitle + ", contactDescription=" + this.contactDescription + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ", addressTitle=" + this.addressTitle + ", postCode=" + this.postCode + ", city=" + this.city + ", street=" + this.street + ", buildingNumber=" + this.buildingNumber + ", flatNumber=" + this.flatNumber + ", nextButtonData=" + this.nextButtonData + ", onPointerTouch=" + this.onPointerTouch + ')';
            }
        }
    }
}
