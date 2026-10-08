package j21;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import p071kotlin.Metadata;
import t50.TextAreaData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lj21/h;", "Ll00/e;", "Lj21/h$a;", "Li70/n;", "a", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface h extends l00.e<Data>, i70.n {

    /* JADX INFO: renamed from: j21.h$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b,\u00102\u001a\u0004\b&\u00103R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b0\u0010#\u001a\u0004\b\u001f\u0010%R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b$\u00104\u001a\u0004\b*\u00105R\u0019\u00108\u001a\u0004\u0018\u00010\u00018\u0006¢\u0006\f\n\u0004\b(\u00106\u001a\u0004\b.\u00107¨\u00069"}, d2 = {"Lj21/h$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "startConversationDateTime", "Lt50/d;", "textAreaData", "", "Lp30/a;", "messages", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "Lh30/a;", "buttonData", "additionalInfo", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Li50/a;Lmx/a;Lt50/d;Ljava/util/List;Ler/a;Lh30/a;Lmx/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "h", "()Lmx/a;", "c", "Lt50/d;", "i", "()Lt50/d;", "d", "Ljava/util/List;", "f", "()Ljava/util/List;", "e", "Ler/a;", "g", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "Lcb4/i;", "()Lcb4/i;", "Ljava/lang/Object;", "()Ljava/lang/Object;", "firstMessageLabel", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label startConversationDateTime;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextAreaData textAreaData;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<p30.a> messages;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<oq.i0> onCloseButtonClick;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData buttonData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label additionalInfo;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final Object firstMessageLabel;

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, Label label, TextAreaData textAreaData, List<? extends p30.a> list, er.a<oq.i0> aVar, ButtonData buttonData, Label label2, cb4.i iVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.startConversationDateTime = label;
            this.textAreaData = textAreaData;
            this.messages = list;
            this.onCloseButtonClick = aVar;
            this.buttonData = buttonData;
            this.additionalInfo = label2;
            this.dialogVMSAdapter = iVar;
            p30.a aVar2 = (p30.a) pq.v.n0(list);
            Object content = null;
            if (aVar2 != null) {
                if (aVar2 instanceof p30.a.IncomingMessage) {
                    content = ((p30.a.IncomingMessage) aVar2).getContent();
                } else if (aVar2 instanceof p30.a.OutgoingMessage) {
                    content = ((p30.a.OutgoingMessage) aVar2).getContent();
                } else if (!(aVar2 instanceof p30.a.Loading)) {
                    throw new oq.p();
                }
            }
            this.firstMessageLabel = content;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final Label getAdditionalInfo() {
            return this.additionalInfo;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final ButtonData getButtonData() {
            return this.buttonData;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final Object getFirstMessageLabel() {
            return this.firstMessageLabel;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.startConversationDateTime, data.startConversationDateTime) && fr.t.c(this.textAreaData, data.textAreaData) && fr.t.c(this.messages, data.messages) && fr.t.c(this.onCloseButtonClick, data.onCloseButtonClick) && fr.t.c(this.buttonData, data.buttonData) && fr.t.c(this.additionalInfo, data.additionalInfo) && fr.t.c(this.dialogVMSAdapter, data.dialogVMSAdapter);
        }

        public final List<p30.a> f() {
            return this.messages;
        }

        public final er.a<oq.i0> g() {
            return this.onCloseButtonClick;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final Label getStartConversationDateTime() {
            return this.startConversationDateTime;
        }

        public int hashCode() {
            int iHashCode = ((((((((((this.baseScaffoldData.hashCode() * 31) + this.startConversationDateTime.hashCode()) * 31) + this.textAreaData.hashCode()) * 31) + this.messages.hashCode()) * 31) + this.onCloseButtonClick.hashCode()) * 31) + this.buttonData.hashCode()) * 31;
            Label label = this.additionalInfo;
            int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final TextAreaData getTextAreaData() {
            return this.textAreaData;
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", startConversationDateTime=" + this.startConversationDateTime + ", textAreaData=" + this.textAreaData + ", messages=" + this.messages + ", onCloseButtonClick=" + this.onCloseButtonClick + ", buttonData=" + this.buttonData + ", additionalInfo=" + this.additionalInfo + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }
    }
}
