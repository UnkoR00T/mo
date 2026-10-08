package n63;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ln63/i;", "Ll00/e;", "Ln63/i$a;", "a", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface i extends l00.e<Data> {

    /* JADX INFO: renamed from: n63.i$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b\u001c\u0010#R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b!\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b \u0010$\u001a\u0004\b\u0018\u0010%¨\u0006&"}, d2 = {"Ln63/i$a;", "", "Li50/a;", "scaffoldData", "Lmx/a;", "description", "subtitle", "Ln50/k;", "contact", "Lh30/a;", "nextButton", "changeContactButton", "<init>", "(Li50/a;Lmx/a;Lmx/a;Ln50/k;Lh30/a;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "e", "()Li50/a;", "b", "Lmx/a;", "c", "()Lmx/a;", "f", "d", "Ln50/k;", "()Ln50/k;", "Lh30/a;", "()Lh30/a;", "settings_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label description;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label subtitle;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final n50.k contact;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData nextButton;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData changeContactButton;

        public Data(BaseScaffoldData baseScaffoldData, Label label, Label label2, n50.k kVar, ButtonData buttonData, ButtonData buttonData2) {
            this.scaffoldData = baseScaffoldData;
            this.description = label;
            this.subtitle = label2;
            this.contact = kVar;
            this.nextButton = buttonData;
            this.changeContactButton = buttonData2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getChangeContactButton() {
            return this.changeContactButton;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final n50.k getContact() {
            return this.contact;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getDescription() {
            return this.description;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getNextButton() {
            return this.nextButton;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
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
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.description, data.description) && fr.t.c(this.subtitle, data.subtitle) && fr.t.c(this.contact, data.contact) && fr.t.c(this.nextButton, data.nextButton) && fr.t.c(this.changeContactButton, data.changeContactButton);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final Label getSubtitle() {
            return this.subtitle;
        }

        public int hashCode() {
            int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.description.hashCode()) * 31;
            Label label = this.subtitle;
            return ((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.contact.hashCode()) * 31) + this.nextButton.hashCode()) * 31) + this.changeContactButton.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", description=" + this.description + ", subtitle=" + this.subtitle + ", contact=" + this.contact + ", nextButton=" + this.nextButton + ", changeContactButton=" + this.changeContactButton + ')';
        }
    }
}
