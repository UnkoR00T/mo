package o02;

import eo0.Recipient;
import eo0.y0;
import fr.k;
import fr.t;
import iy.b0;
import java.util.List;
import p071kotlin.Metadata;
import st3.AddressData;
import xw.PhoneNumber;
import xw.g;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\bf\u0018\u00002\u00020\u0001:\u0006\u0006\u0007\b\t\n\u000bR\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lo02/b;", "Lh00/b;", "", "getData", "()Ljava/lang/Object;", "data", "f", "a", "b", "c", "d", "e", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface b extends h00.b {

    /* JADX INFO: renamed from: o02.b$a, reason: from toString */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lo02/b$a;", "Lo02/b;", "", "Leo0/k0;", "recipients", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/util/List;", "()Ljava/util/List;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class AddRecipients implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<Recipient> recipients;

        public AddRecipients(List<Recipient> list) {
            this.recipients = list;
        }

        public final List<Recipient> a() {
            return this.recipients;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof AddRecipients) && t.c(this.recipients, ((AddRecipients) other).recipients);
        }

        @Override // o02.b, h00.b
        public /* bridge */ Object getData() {
            return super.getData();
        }

        public int hashCode() {
            return this.recipients.hashCode();
        }

        public String toString() {
            return "AddRecipients(recipients=" + this.recipients + ')';
        }
    }

    /* JADX INFO: renamed from: o02.b$b, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Lo02/b$b;", "Lo02/b;", "Leo0/k0;", "recipientToVerify", "Leo0/y0;", "serviceType", "<init>", "(Leo0/k0;Leo0/y0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Leo0/k0;", "()Leo0/k0;", "b", "Leo0/y0;", "()Leo0/y0;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ChooseMessageType implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Recipient recipientToVerify;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final y0 serviceType;

        public ChooseMessageType(Recipient k0Var, y0 y0Var) {
            this.recipientToVerify = k0Var;
            this.serviceType = y0Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Recipient getRecipientToVerify() {
            return this.recipientToVerify;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final y0 getServiceType() {
            return this.serviceType;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ChooseMessageType)) {
                return false;
            }
            ChooseMessageType chooseMessageType = (ChooseMessageType) other;
            return t.c(this.recipientToVerify, chooseMessageType.recipientToVerify) && this.serviceType == chooseMessageType.serviceType;
        }

        @Override // o02.b, h00.b
        public /* bridge */ Object getData() {
            return super.getData();
        }

        public int hashCode() {
            Recipient k0Var = this.recipientToVerify;
            return ((k0Var == null ? 0 : k0Var.hashCode()) * 31) + this.serviceType.hashCode();
        }

        public String toString() {
            return "ChooseMessageType(recipientToVerify=" + this.recipientToVerify + ", serviceType=" + this.serviceType + ')';
        }
    }

    /* JADX INFO: renamed from: o02.b$c, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019¨\u0006\u001e"}, d2 = {"Lo02/b$c;", "Lo02/b;", "Liy/b0;", "nameAndSurname", "Lxw/g;", "pesel", "Lxw/h;", "phoneNumber", "email", "<init>", "(Liy/b0;Liy/b0;Lxw/h;Liy/b0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Liy/b0;", "b", "()Liy/b0;", "c", "Lxw/h;", "d", "()Lxw/h;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactDetails implements b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f140222e;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 nameAndSurname;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 pesel;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final PhoneNumber phoneNumber;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b0 email;

        static {
            int i15 = b0.f97726c;
            f140222e = i15 | PhoneNumber.f221634d | i15 | i15;
        }

        public /* synthetic */ ContactDetails(b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3, k kVar) {
            this(b0Var, b0Var2, phoneNumber, b0Var3);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final b0 getEmail() {
            return this.email;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b0 getNameAndSurname() {
            return this.nameAndSurname;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b0 getPesel() {
            return this.pesel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final PhoneNumber getPhoneNumber() {
            return this.phoneNumber;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ContactDetails)) {
                return false;
            }
            ContactDetails contactDetails = (ContactDetails) other;
            return t.c(this.nameAndSurname, contactDetails.nameAndSurname) && g.f(this.pesel, contactDetails.pesel) && t.c(this.phoneNumber, contactDetails.phoneNumber) && t.c(this.email, contactDetails.email);
        }

        @Override // o02.b, h00.b
        public /* bridge */ Object getData() {
            return super.getData();
        }

        public int hashCode() {
            return (((((this.nameAndSurname.hashCode() * 31) + g.h(this.pesel)) * 31) + this.phoneNumber.hashCode()) * 31) + this.email.hashCode();
        }

        public String toString() {
            return "ContactDetails(nameAndSurname=" + this.nameAndSurname + ", pesel=" + ((Object) g.i(this.pesel)) + ", phoneNumber=" + this.phoneNumber + ", email=" + this.email + ')';
        }

        private ContactDetails(b0 b0Var, b0 b0Var2, PhoneNumber phoneNumber, b0 b0Var3) {
            this.nameAndSurname = b0Var;
            this.pesel = b0Var2;
            this.phoneNumber = phoneNumber;
            this.email = b0Var3;
        }
    }

    /* JADX INFO: renamed from: o02.b$d, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo02/b$d;", "Lo02/b;", "Li22/b;", "method", "<init>", "(Li22/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li22/b;", "()Li22/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class ContactMethod implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final i22.b method;

        public ContactMethod(i22.b bVar) {
            this.method = bVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final i22.b getMethod() {
            return this.method;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof ContactMethod) && this.method == ((ContactMethod) other).method;
        }

        @Override // o02.b, h00.b
        public /* bridge */ Object getData() {
            return super.getData();
        }

        public int hashCode() {
            return this.method.hashCode();
        }

        public String toString() {
            return "ContactMethod(method=" + this.method + ')';
        }
    }

    /* JADX INFO: renamed from: o02.b$e, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo02/b$e;", "Lo02/b;", "Lst3/b;", "addressData", "<init>", "(Lst3/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lst3/b;", "()Lst3/b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class CorrespondenceAddress implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final AddressData addressData;

        public CorrespondenceAddress(AddressData addressData) {
            this.addressData = addressData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final AddressData getAddressData() {
            return this.addressData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof CorrespondenceAddress) && t.c(this.addressData, ((CorrespondenceAddress) other).addressData);
        }

        @Override // o02.b, h00.b
        public /* bridge */ Object getData() {
            return super.getData();
        }

        public int hashCode() {
            return this.addressData.hashCode();
        }

        public String toString() {
            return "CorrespondenceAddress(addressData=" + this.addressData + ')';
        }
    }

    /* JADX INFO: renamed from: o02.b$f, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lo02/b$f;", "Lo02/b;", "Lz02/a;", "entryPoint", "<init>", "(Lz02/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lz02/a;", "()Lz02/a;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Start implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final z02.a entryPoint;

        public Start(z02.a aVar) {
            this.entryPoint = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final z02.a getEntryPoint() {
            return this.entryPoint;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Start) && t.c(this.entryPoint, ((Start) other).entryPoint);
        }

        @Override // o02.b, h00.b
        public /* bridge */ Object getData() {
            return super.getData();
        }

        public int hashCode() {
            return this.entryPoint.hashCode();
        }

        public String toString() {
            return "Start(entryPoint=" + this.entryPoint + ')';
        }
    }

    @Override // h00.b
    default Object getData() {
        return this;
    }
}
