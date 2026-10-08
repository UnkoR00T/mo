package rt1;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lrt1/g;", "Ll00/e;", "Lrt1/g$a;", "a", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lrt1/g$a;", "", "a", "b", "Lrt1/g$a$a;", "Lrt1/g$a$b;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: rt1.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lrt1/g$a$a;", "Lrt1/g$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4490a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4490a f176009a = new C4490a();

            private C4490a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4490a);
            }

            public int hashCode() {
                return -640865351;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: rt1.g$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BC\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b#\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b!\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010 \u001a\u0004\b\u001f\u0010\"R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u001d\u0010*\u001a\u0004\b\u001b\u0010+¨\u0006,"}, d2 = {"Lrt1/g$a$b;", "Lrt1/g$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "header", "description", "Lh30/a;", "buttonData", "Ln30/b;", "passportData", "bankRestrictionHeader", "Ln50/k;", "bankRestrictionData", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lh30/a;Ln30/b;Lmx/a;Ln50/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "d", "Lh30/a;", "()Lh30/a;", "Ln30/b;", "f", "()Ln30/b;", "Ln50/k;", "()Ln50/k;", "documentrestriction_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData passportData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label bankRestrictionHeader;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k bankRestrictionData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, Label label2, ButtonData buttonData, CardListData cardListData, Label label3, n50.k kVar) {
                this.scaffoldData = baseScaffoldData;
                this.header = label;
                this.description = label2;
                this.buttonData = buttonData;
                this.passportData = cardListData;
                this.bankRestrictionHeader = label3;
                this.bankRestrictionData = kVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final n50.k getBankRestrictionData() {
                return this.bankRestrictionData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getBankRestrictionHeader() {
                return this.bankRestrictionHeader;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.header, initialized.header) && fr.t.c(this.description, initialized.description) && fr.t.c(this.buttonData, initialized.buttonData) && fr.t.c(this.passportData, initialized.passportData) && fr.t.c(this.bankRestrictionHeader, initialized.bankRestrictionHeader) && fr.t.c(this.bankRestrictionData, initialized.bankRestrictionData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getPassportData() {
                return this.passportData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.scaffoldData.hashCode() * 31) + this.header.hashCode()) * 31) + this.description.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.passportData.hashCode()) * 31;
                Label label = this.bankRestrictionHeader;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                n50.k kVar = this.bankRestrictionData;
                return iHashCode2 + (kVar != null ? kVar.hashCode() : 0);
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", header=" + this.header + ", description=" + this.description + ", buttonData=" + this.buttonData + ", passportData=" + this.passportData + ", bankRestrictionHeader=" + this.bankRestrictionHeader + ", bankRestrictionData=" + this.bankRestrictionData + ')';
            }
        }
    }
}
