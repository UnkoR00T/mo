package uu3;

import h30.ButtonData;
import i50.BaseScaffoldData;
import p071kotlin.Metadata;
import wu3.ContactDetailsFormSection;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Luu3/c;", "Ll00/e;", "Luu3/c$a;", "a", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<Data> {

    /* JADX INFO: renamed from: uu3.c$a, reason: from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0016\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u0018\u0010 \u001a\u0004\b\u001d\u0010!¨\u0006\""}, d2 = {"Luu3/c$a;", "", "Li50/a;", "scaffoldData", "Lwu3/a;", "contactDetailsFormSection", "Lc30/b$c;", "alertData", "Lh30/a;", "nextButton", "<init>", "(Li50/a;Lwu3/a;Lc30/b$c;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lwu3/a;", "()Lwu3/a;", "c", "Lc30/b$c;", "()Lc30/b$c;", "Lh30/a;", "()Lh30/a;", "contactdetailsform_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final int f201528e = v50.c.f203957t | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final ContactDetailsFormSection contactDetailsFormSection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final c30.b.c alertData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        public Data(BaseScaffoldData baseScaffoldData, ContactDetailsFormSection contactDetailsFormSection, c30.b.c cVar, ButtonData buttonData) {
            this.scaffoldData = baseScaffoldData;
            this.contactDetailsFormSection = contactDetailsFormSection;
            this.alertData = cVar;
            this.nextButton = buttonData;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c30.b.c getAlertData() {
            return this.alertData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final ContactDetailsFormSection getContactDetailsFormSection() {
            return this.contactDetailsFormSection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.contactDetailsFormSection, data.contactDetailsFormSection) && fr.t.c(this.alertData, data.alertData) && fr.t.c(this.nextButton, data.nextButton);
        }

        public int hashCode() {
            return (((((this.scaffoldData.hashCode() * 31) + this.contactDetailsFormSection.hashCode()) * 31) + this.alertData.hashCode()) * 31) + this.nextButton.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", contactDetailsFormSection=" + this.contactDetailsFormSection + ", alertData=" + this.alertData + ", nextButton=" + this.nextButton + ')';
        }
    }
}
