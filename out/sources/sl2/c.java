package sl2;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import v40.InputDateTimeData;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lsl2/c;", "Ll00/e;", "Lsl2/c$a;", "a", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lsl2/c$a;", "", "a", "b", "Lsl2/c$a$a;", "Lsl2/c$a$b;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sl2.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b \u0010*R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\"\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b.\u0010+\u001a\u0004\b(\u0010-R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b,\u0010+\u001a\u0004\b.\u0010-R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b/\u00101R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b2\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b&\u00105\u001a\u0004\b$\u00106¨\u00067"}, d2 = {"Lsl2/c$a$a;", "Lsl2/c$a;", "Lcb4/i;", "dialogVMSAdapter", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lmx/a;", "header", "description", "durationDescription", "Ln30/b;", "list", "Lh30/a;", "nextButtonData", "Lv40/a;", "date", "<init>", "(Lcb4/i;Ler/a;Li50/a;Lmx/a;Lmx/a;Lmx/a;Ln30/b;Lh30/a;Lv40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lcb4/i;", "d", "()Lcb4/i;", "b", "Ler/a;", "i", "()Ler/a;", "c", "Li50/a;", "()Li50/a;", "Lmx/a;", "f", "()Lmx/a;", "e", "g", "Ln30/b;", "()Ln30/b;", "h", "Lh30/a;", "()Lh30/a;", "Lv40/a;", "()Lv40/a;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Content implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVMSAdapter;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onBack;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label header;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label description;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label durationDescription;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData list;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final InputDateTimeData date;

            public Content(cb4.i iVar, er.a<i0> aVar, BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, CardListData cardListData, ButtonData buttonData, InputDateTimeData inputDateTimeData) {
                this.dialogVMSAdapter = iVar;
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.header = label;
                this.description = label2;
                this.durationDescription = label3;
                this.list = cardListData;
                this.nextButtonData = buttonData;
                this.date = inputDateTimeData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final InputDateTimeData getDate() {
                return this.date;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getDescription() {
                return this.description;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVMSAdapter() {
                return this.dialogVMSAdapter;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getDurationDescription() {
                return this.durationDescription;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Content)) {
                    return false;
                }
                Content content = (Content) other;
                return fr.t.c(this.dialogVMSAdapter, content.dialogVMSAdapter) && fr.t.c(this.onBack, content.onBack) && fr.t.c(this.baseScaffoldData, content.baseScaffoldData) && fr.t.c(this.header, content.header) && fr.t.c(this.description, content.description) && fr.t.c(this.durationDescription, content.durationDescription) && fr.t.c(this.list, content.list) && fr.t.c(this.nextButtonData, content.nextButtonData) && fr.t.c(this.date, content.date);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getHeader() {
                return this.header;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final CardListData getList() {
                return this.list;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public int hashCode() {
                cb4.i iVar = this.dialogVMSAdapter;
                int iHashCode = (((((((((((((((iVar == null ? 0 : iVar.hashCode()) * 31) + this.onBack.hashCode()) * 31) + this.baseScaffoldData.hashCode()) * 31) + this.header.hashCode()) * 31) + this.description.hashCode()) * 31) + this.durationDescription.hashCode()) * 31) + this.list.hashCode()) * 31) + this.nextButtonData.hashCode()) * 31;
                InputDateTimeData inputDateTimeData = this.date;
                return iHashCode + (inputDateTimeData != null ? inputDateTimeData.hashCode() : 0);
            }

            public final er.a<i0> i() {
                return this.onBack;
            }

            public String toString() {
                return "Content(dialogVMSAdapter=" + this.dialogVMSAdapter + ", onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", header=" + this.header + ", description=" + this.description + ", durationDescription=" + this.durationDescription + ", list=" + this.list + ", nextButtonData=" + this.nextButtonData + ", date=" + this.date + ')';
            }
        }

        /* JADX INFO: renamed from: sl2.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lsl2/c$a$b;", "Lsl2/c$a;", "Lhb4/c;", "error", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "nationalcourtregister_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c error;

            public Error(hb4.c cVar) {
                this.error = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getError() {
                return this.error;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.error, ((Error) other).error);
            }

            public int hashCode() {
                return this.error.hashCode();
            }

            public String toString() {
                return "Error(error=" + this.error + ')';
            }
        }
    }
}
