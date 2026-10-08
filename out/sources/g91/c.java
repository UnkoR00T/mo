package g91;

import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lg91/c;", "Ll00/e;", "Lg91/c$a;", "a", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lg91/c$a;", "", "b", "a", "Lg91/c$a$a;", "Lg91/c$a$b;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: g91.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lg91/c$a$a;", "Lg91/c$a;", "Lhb4/c;", "errorVMSAdapter", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMSAdapter;

            public Error(hb4.c cVar) {
                this.errorVMSAdapter = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMSAdapter() {
                return this.errorVMSAdapter;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && t.c(this.errorVMSAdapter, ((Error) other).errorVMSAdapter);
            }

            public int hashCode() {
                return this.errorVMSAdapter.hashCode();
            }

            public String toString() {
                return "Error(errorVMSAdapter=" + this.errorVMSAdapter + ')';
            }
        }

        /* JADX INFO: renamed from: g91.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010$\u001a\u0004\b'\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b)\u0010$\u001a\u0004\b*\u0010&R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b+\u0010$\u001a\u0004\b,\u0010&R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b-\u0010$\u001a\u0004\b.\u0010&R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b*\u0010$\u001a\u0004\b)\u0010&R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b+\u00100R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b#\u00102R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b,\u00103\u001a\u0004\b-\u00104¨\u00065"}, d2 = {"Lg91/c$a$b;", "Lg91/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "headerLabel", "descriptionLabel", "subHeader1", "subDescription1", "subHeader2", "subDescription2", "infoRowHeader", "Lt40/b;", "infoRowListData", "Lh30/a;", "buttonData", "Lkotlin/Function0;", "Loq/i0;", "onBackClick", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lt40/b;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lmx/a;", "d", "()Lmx/a;", "c", "j", "e", "h", "f", "k", "g", "i", "Lt40/b;", "()Lt40/b;", "Lh30/a;", "()Lh30/a;", "Ler/a;", "()Ler/a;", "childpassportapplication_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Presenting implements a {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f71375l = InfoRowListData.f187643b | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label headerLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label descriptionLabel;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subHeader1;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subDescription1;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subHeader2;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subDescription2;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoRowHeader;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final InfoRowListData infoRowListData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData buttonData;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBackClick;

            public Presenting(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, Label label4, Label label5, Label label6, Label label7, InfoRowListData infoRowListData, ButtonData buttonData, er.a<i0> aVar) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerLabel = label;
                this.descriptionLabel = label2;
                this.subHeader1 = label3;
                this.subDescription1 = label4;
                this.subHeader2 = label5;
                this.subDescription2 = label6;
                this.infoRowHeader = label7;
                this.infoRowListData = infoRowListData;
                this.buttonData = buttonData;
                this.onBackClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getButtonData() {
                return this.buttonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDescriptionLabel() {
                return this.descriptionLabel;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getHeaderLabel() {
                return this.headerLabel;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getInfoRowHeader() {
                return this.infoRowHeader;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Presenting)) {
                    return false;
                }
                Presenting presenting = (Presenting) other;
                return t.c(this.baseScaffoldData, presenting.baseScaffoldData) && t.c(this.headerLabel, presenting.headerLabel) && t.c(this.descriptionLabel, presenting.descriptionLabel) && t.c(this.subHeader1, presenting.subHeader1) && t.c(this.subDescription1, presenting.subDescription1) && t.c(this.subHeader2, presenting.subHeader2) && t.c(this.subDescription2, presenting.subDescription2) && t.c(this.infoRowHeader, presenting.infoRowHeader) && t.c(this.infoRowListData, presenting.infoRowListData) && t.c(this.buttonData, presenting.buttonData) && t.c(this.onBackClick, presenting.onBackClick);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final InfoRowListData getInfoRowListData() {
                return this.infoRowListData;
            }

            public final er.a<i0> g() {
                return this.onBackClick;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getSubDescription1() {
                return this.subDescription1;
            }

            public int hashCode() {
                int iHashCode = ((((((this.baseScaffoldData.hashCode() * 31) + this.headerLabel.hashCode()) * 31) + this.descriptionLabel.hashCode()) * 31) + this.subHeader1.hashCode()) * 31;
                Label label = this.subDescription1;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                Label label2 = this.subHeader2;
                int iHashCode3 = (iHashCode2 + (label2 == null ? 0 : label2.hashCode())) * 31;
                Label label3 = this.subDescription2;
                int iHashCode4 = (iHashCode3 + (label3 == null ? 0 : label3.hashCode())) * 31;
                Label label4 = this.infoRowHeader;
                return ((((((iHashCode4 + (label4 != null ? label4.hashCode() : 0)) * 31) + this.infoRowListData.hashCode()) * 31) + this.buttonData.hashCode()) * 31) + this.onBackClick.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getSubDescription2() {
                return this.subDescription2;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getSubHeader1() {
                return this.subHeader1;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final Label getSubHeader2() {
                return this.subHeader2;
            }

            public String toString() {
                return "Presenting(baseScaffoldData=" + this.baseScaffoldData + ", headerLabel=" + this.headerLabel + ", descriptionLabel=" + this.descriptionLabel + ", subHeader1=" + this.subHeader1 + ", subDescription1=" + this.subDescription1 + ", subHeader2=" + this.subHeader2 + ", subDescription2=" + this.subDescription2 + ", infoRowHeader=" + this.infoRowHeader + ", infoRowListData=" + this.infoRowListData + ", buttonData=" + this.buttonData + ", onBackClick=" + this.onBackClick + ')';
            }
        }
    }
}
