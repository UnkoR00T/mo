package o02;

import fr.t;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lo02/a;", "", "a", "b", "Lo02/a$a;", "Lo02/a$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface a {

    /* JADX INFO: renamed from: o02.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001b\u0010 R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010!\u001a\u0004\b\u001e\u0010\"¨\u0006#"}, d2 = {"Lo02/a$a;", "Lo02/a;", "Lo02/b$f;", "start", "Lo02/b$a;", "addRecipients", "Lo02/c;", "messageForm", "Lo02/b$b;", "messageType", "<init>", "(Lo02/b$f;Lo02/b$a;Lo02/c;Lo02/b$b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo02/b$f;", "d", "()Lo02/b$f;", "b", "Lo02/b$a;", "()Lo02/b$a;", "c", "Lo02/c;", "()Lo02/c;", "Lo02/b$b;", "()Lo02/b$b;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Edor implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.Start start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.AddRecipients addRecipients;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c messageForm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.ChooseMessageType messageType;

        public Edor(b.Start start, b.AddRecipients addRecipients, c cVar, b.ChooseMessageType chooseMessageType) {
            this.start = start;
            this.addRecipients = addRecipients;
            this.messageForm = cVar;
            this.messageType = chooseMessageType;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public b.AddRecipients getAddRecipients() {
            return this.addRecipients;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public c getMessageForm() {
            return this.messageForm;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public b.ChooseMessageType getMessageType() {
            return this.messageType;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public b.Start getStart() {
            return this.start;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Edor)) {
                return false;
            }
            Edor edor = (Edor) other;
            return t.c(this.start, edor.start) && t.c(this.addRecipients, edor.addRecipients) && t.c(this.messageForm, edor.messageForm) && t.c(this.messageType, edor.messageType);
        }

        public int hashCode() {
            return (((((this.start.hashCode() * 31) + this.addRecipients.hashCode()) * 31) + this.messageForm.hashCode()) * 31) + this.messageType.hashCode();
        }

        public String toString() {
            return "Edor(start=" + this.start + ", addRecipients=" + this.addRecipients + ", messageForm=" + this.messageForm + ", messageType=" + this.messageType + ')';
        }
    }

    /* JADX INFO: renamed from: o02.a$b, reason: from toString */
    @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001d\u0010#R\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010\t\u001a\u00020\b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b&\u0010,\u001a\u0004\b!\u0010-R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b*\u0010.\u001a\u0004\b$\u0010/R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u001f\u00100\u001a\u0004\b(\u00101¨\u00062"}, d2 = {"Lo02/a$b;", "Lo02/a;", "Lo02/b$f;", "start", "Lo02/b$a;", "addRecipients", "Lo02/d;", "messageForm", "Lo02/b$b;", "messageType", "Lo02/b$c;", "contactDetails", "Lo02/b$d;", "contactMethod", "Lo02/b$e;", "correspondenceAddress", "<init>", "(Lo02/b$f;Lo02/b$a;Lo02/d;Lo02/b$b;Lo02/b$c;Lo02/b$d;Lo02/b$e;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lo02/b$f;", "g", "()Lo02/b$f;", "b", "Lo02/b$a;", "()Lo02/b$a;", "c", "Lo02/d;", "e", "()Lo02/d;", "d", "Lo02/b$b;", "f", "()Lo02/b$b;", "Lo02/b$c;", "()Lo02/b$c;", "Lo02/b$d;", "()Lo02/b$d;", "Lo02/b$e;", "()Lo02/b$e;", "electronicdelivery_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Epuap implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.Start start;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.AddRecipients addRecipients;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final o02.Epuap messageForm;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.ChooseMessageType messageType;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.ContactDetails contactDetails;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.ContactMethod contactMethod;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final b.CorrespondenceAddress correspondenceAddress;

        public Epuap(b.Start start, b.AddRecipients addRecipients, o02.Epuap epuap, b.ChooseMessageType chooseMessageType, b.ContactDetails contactDetails, b.ContactMethod contactMethod, b.CorrespondenceAddress correspondenceAddress) {
            this.start = start;
            this.addRecipients = addRecipients;
            this.messageForm = epuap;
            this.messageType = chooseMessageType;
            this.contactDetails = contactDetails;
            this.contactMethod = contactMethod;
            this.correspondenceAddress = correspondenceAddress;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public b.AddRecipients getAddRecipients() {
            return this.addRecipients;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final b.ContactDetails getContactDetails() {
            return this.contactDetails;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final b.ContactMethod getContactMethod() {
            return this.contactMethod;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final b.CorrespondenceAddress getCorrespondenceAddress() {
            return this.correspondenceAddress;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public o02.Epuap getMessageForm() {
            return this.messageForm;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Epuap)) {
                return false;
            }
            Epuap epuap = (Epuap) other;
            return t.c(this.start, epuap.start) && t.c(this.addRecipients, epuap.addRecipients) && t.c(this.messageForm, epuap.messageForm) && t.c(this.messageType, epuap.messageType) && t.c(this.contactDetails, epuap.contactDetails) && t.c(this.contactMethod, epuap.contactMethod) && t.c(this.correspondenceAddress, epuap.correspondenceAddress);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public b.ChooseMessageType getMessageType() {
            return this.messageType;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public b.Start getStart() {
            return this.start;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.start.hashCode() * 31) + this.addRecipients.hashCode()) * 31) + this.messageForm.hashCode()) * 31) + this.messageType.hashCode()) * 31) + this.contactDetails.hashCode()) * 31) + this.contactMethod.hashCode()) * 31;
            b.CorrespondenceAddress correspondenceAddress = this.correspondenceAddress;
            return iHashCode + (correspondenceAddress == null ? 0 : correspondenceAddress.hashCode());
        }

        public String toString() {
            return "Epuap(start=" + this.start + ", addRecipients=" + this.addRecipients + ", messageForm=" + this.messageForm + ", messageType=" + this.messageType + ", contactDetails=" + this.contactDetails + ", contactMethod=" + this.contactMethod + ", correspondenceAddress=" + this.correspondenceAddress + ')';
        }
    }
}
