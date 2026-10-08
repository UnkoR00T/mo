package ds3;

import h30.ButtonData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lds3/c;", "Ll00/e;", "Lds3/c$a;", "a", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lds3/c$a;", "", "b", "a", "Lds3/c$a$a;", "Lds3/c$a$b;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ds3.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001d\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b\u001c\u0010$¨\u0006%"}, d2 = {"Lds3/c$a$a;", "Lds3/c$a;", "Lmx/a;", "headline", "description", "Lc30/b;", "alertData", "Lh30/a;", "nextButtonData", "Ln50/k;", "departmentCardData", "<init>", "(Lmx/a;Lmx/a;Lc30/b;Lh30/a;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "Lc30/b;", "()Lc30/b;", "Lh30/a;", "e", "()Lh30/a;", "Ln50/k;", "()Ln50/k;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayedDepartment implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headline;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k departmentCardData;

            public DisplayedDepartment(Label label, Label label2, c30.b bVar, ButtonData buttonData, n50.k kVar) {
                this.headline = label;
                this.description = label2;
                this.alertData = bVar;
                this.nextButtonData = buttonData;
                this.departmentCardData = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final n50.k getDepartmentCardData() {
                return this.departmentCardData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getHeadline() {
                return this.headline;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayedDepartment)) {
                    return false;
                }
                DisplayedDepartment displayedDepartment = (DisplayedDepartment) other;
                return fr.t.c(this.headline, displayedDepartment.headline) && fr.t.c(this.description, displayedDepartment.description) && fr.t.c(this.alertData, displayedDepartment.alertData) && fr.t.c(this.nextButtonData, displayedDepartment.nextButtonData) && fr.t.c(this.departmentCardData, displayedDepartment.departmentCardData);
            }

            public int hashCode() {
                int iHashCode = ((this.headline.hashCode() * 31) + this.description.hashCode()) * 31;
                c30.b bVar = this.alertData;
                return ((((iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31) + this.nextButtonData.hashCode()) * 31) + this.departmentCardData.hashCode();
            }

            public String toString() {
                return "DisplayedDepartment(headline=" + this.headline + ", description=" + this.description + ", alertData=" + this.alertData + ", nextButtonData=" + this.nextButtonData + ", departmentCardData=" + this.departmentCardData + ')';
            }
        }

        /* JADX INFO: renamed from: ds3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0017\u001a\u0004\b\u0016\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001e\u001a\u0004\b\u001a\u0010\u001f¨\u0006 "}, d2 = {"Lds3/c$a$b;", "Lds3/c$a;", "Lmx/a;", "headline", "description", "Lv50/c;", "textInputData", "Lh30/a;", "nextButtonData", "<init>", "(Lmx/a;Lmx/a;Lv50/c;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "c", "Lv50/c;", "d", "()Lv50/c;", "Lh30/a;", "()Lh30/a;", "zusvisit_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class DisplayedInput implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f44382e = v50.c.f203957t;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headline;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final v50.c textInputData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            public DisplayedInput(Label label, Label label2, v50.c cVar, ButtonData buttonData) {
                this.headline = label;
                this.description = label2;
                this.textInputData = cVar;
                this.nextButtonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getHeadline() {
                return this.headline;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final v50.c getTextInputData() {
                return this.textInputData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof DisplayedInput)) {
                    return false;
                }
                DisplayedInput displayedInput = (DisplayedInput) other;
                return fr.t.c(this.headline, displayedInput.headline) && fr.t.c(this.description, displayedInput.description) && fr.t.c(this.textInputData, displayedInput.textInputData) && fr.t.c(this.nextButtonData, displayedInput.nextButtonData);
            }

            public int hashCode() {
                return (((((this.headline.hashCode() * 31) + this.description.hashCode()) * 31) + this.textInputData.hashCode()) * 31) + this.nextButtonData.hashCode();
            }

            public String toString() {
                return "DisplayedInput(headline=" + this.headline + ", description=" + this.description + ", textInputData=" + this.textInputData + ", nextButtonData=" + this.nextButtonData + ')';
            }
        }
    }
}
