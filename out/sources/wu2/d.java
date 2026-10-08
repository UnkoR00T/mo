package wu2;

import h30.ButtonData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import w30.CheckBoxSingleData;
import xu2.SummaryElementData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwu2/d;", "Ll00/e;", "Lwu2/d$a;", "a", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<Data> {

    /* JADX INFO: renamed from: wu2.d$a, reason: from toString */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b\u001b\u0010)R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b#\u0010*\u001a\u0004\b\u001f\u0010+R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b'\u0010\u001e¨\u0006,"}, d2 = {"Lwu2/d$a;", "", "Lmx/a;", "screenLabel", "", "Lxu2/a;", "verifyingCompanyData", "verifierData", "Lh30/a;", "sendButtonData", "Lw30/a;", "checkBoxData", "Lhz/b;", "checkBoxValidationState", "statementHeader", "<init>", "(Lmx/a;Ljava/util/List;Ljava/util/List;Lh30/a;Lw30/a;Lhz/b;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "c", "()Lmx/a;", "b", "Ljava/util/List;", "g", "()Ljava/util/List;", "f", "d", "Lh30/a;", "()Lh30/a;", "e", "Lw30/a;", "()Lw30/a;", "Lhz/b;", "()Lhz/b;", "peselrestrictionverification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label screenLabel;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SummaryElementData> verifyingCompanyData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<SummaryElementData> verifierData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData sendButtonData;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final CheckBoxSingleData checkBoxData;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final hz.b checkBoxValidationState;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label statementHeader;

        public Data(Label label, List<SummaryElementData> list, List<SummaryElementData> list2, ButtonData buttonData, CheckBoxSingleData checkBoxSingleData, hz.b bVar, Label label2) {
            this.screenLabel = label;
            this.verifyingCompanyData = list;
            this.verifierData = list2;
            this.sendButtonData = buttonData;
            this.checkBoxData = checkBoxSingleData;
            this.checkBoxValidationState = bVar;
            this.statementHeader = label2;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final CheckBoxSingleData getCheckBoxData() {
            return this.checkBoxData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final hz.b getCheckBoxValidationState() {
            return this.checkBoxValidationState;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final Label getScreenLabel() {
            return this.screenLabel;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final ButtonData getSendButtonData() {
            return this.sendButtonData;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Label getStatementHeader() {
            return this.statementHeader;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.screenLabel, data.screenLabel) && fr.t.c(this.verifyingCompanyData, data.verifyingCompanyData) && fr.t.c(this.verifierData, data.verifierData) && fr.t.c(this.sendButtonData, data.sendButtonData) && fr.t.c(this.checkBoxData, data.checkBoxData) && fr.t.c(this.checkBoxValidationState, data.checkBoxValidationState) && fr.t.c(this.statementHeader, data.statementHeader);
        }

        public final List<SummaryElementData> f() {
            return this.verifierData;
        }

        public final List<SummaryElementData> g() {
            return this.verifyingCompanyData;
        }

        public int hashCode() {
            int iHashCode = this.screenLabel.hashCode() * 31;
            List<SummaryElementData> list = this.verifyingCompanyData;
            return ((((((((((iHashCode + (list == null ? 0 : list.hashCode())) * 31) + this.verifierData.hashCode()) * 31) + this.sendButtonData.hashCode()) * 31) + this.checkBoxData.hashCode()) * 31) + this.checkBoxValidationState.hashCode()) * 31) + this.statementHeader.hashCode();
        }

        public String toString() {
            return "Data(screenLabel=" + this.screenLabel + ", verifyingCompanyData=" + this.verifyingCompanyData + ", verifierData=" + this.verifierData + ", sendButtonData=" + this.sendButtonData + ", checkBoxData=" + this.checkBoxData + ", checkBoxValidationState=" + this.checkBoxValidationState + ", statementHeader=" + this.statementHeader + ')';
        }
    }
}
