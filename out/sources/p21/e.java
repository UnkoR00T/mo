package p21;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import t50.TextAreaData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lp21/e;", "Ll00/e;", "Lp21/e$a;", "a", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<Data> {

    /* JADX INFO: renamed from: p21.e$a, reason: from toString */
    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b&\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\"Bu\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0015\u001a\u00020\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010 \u001a\u00020\t2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b \u0010!R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b1\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u00118\u0006¢\u0006\f\n\u0004\b'\u00108\u001a\u0004\b-\u00109R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b6\u0010:\u001a\u0004\b4\u0010;R\u0017\u0010\u0015\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b<\u0010:\u001a\u0004\b\"\u0010;R\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b)\u0010?¨\u0006@"}, d2 = {"Lp21/e$a;", "", "Li50/a;", "baseScaffoldData", "Lmx/a;", "subtitle", "", "clickedRatingScale", "Lkotlin/Function1;", "", "Loq/i0;", "onCharsLimitReached", "", "Lp21/e$a$a;", "ratingScaleList", "Lt50/d;", "textAreaData", "Lkotlin/Function0;", "onBackAction", "Lh30/a;", "sendButtonData", "backButtonData", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Li50/a;Lmx/a;Ljava/lang/Integer;Ler/l;Ljava/util/List;Lt50/d;Ler/a;Lh30/a;Lh30/a;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "g", "()Lmx/a;", "c", "Ljava/lang/Integer;", "getClickedRatingScale", "()Ljava/lang/Integer;", "d", "Ler/l;", "getOnCharsLimitReached", "()Ler/l;", "e", "Ljava/util/List;", "()Ljava/util/List;", "f", "Lt50/d;", "h", "()Lt50/d;", "Ler/a;", "()Ler/a;", "Lh30/a;", "()Lh30/a;", "i", "j", "Lcb4/i;", "()Lcb4/i;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final Label subtitle;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final Integer clickedRatingScale;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.l<Boolean, i0> onCharsLimitReached;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
        private final List<RatingScaleItem> ratingScaleList;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
        private final TextAreaData textAreaData;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData sendButtonData;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
        private final ButtonData backButtonData;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
        private final cb4.i dialogVMSAdapter;

        /* JADX INFO: renamed from: p21.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0016\u001a\u0004\b\u0015\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0019\u0010\u0010R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u001c\u001a\u0004\b\u001a\u0010\u001d¨\u0006\u001e"}, d2 = {"Lp21/e$a$a;", "", "Lmx/a;", "title", "contentDescriptionLabel", "", "iconResId", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Lmx/a;Lmx/a;ILer/a;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "d", "()Lmx/a;", "b", "c", "I", "Ler/a;", "()Ler/a;", "chatbot_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class RatingScaleItem {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label contentDescriptionLabel;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final int iconResId;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<i0> onClick;

            public RatingScaleItem(Label label, Label label2, int i15, er.a<i0> aVar) {
                this.title = label;
                this.contentDescriptionLabel = label2;
                this.iconResId = i15;
                this.onClick = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getContentDescriptionLabel() {
                return this.contentDescriptionLabel;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final int getIconResId() {
                return this.iconResId;
            }

            public final er.a<i0> c() {
                return this.onClick;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RatingScaleItem)) {
                    return false;
                }
                RatingScaleItem ratingScaleItem = (RatingScaleItem) other;
                return fr.t.c(this.title, ratingScaleItem.title) && fr.t.c(this.contentDescriptionLabel, ratingScaleItem.contentDescriptionLabel) && this.iconResId == ratingScaleItem.iconResId && fr.t.c(this.onClick, ratingScaleItem.onClick);
            }

            public int hashCode() {
                return (((((this.title.hashCode() * 31) + this.contentDescriptionLabel.hashCode()) * 31) + Integer.hashCode(this.iconResId)) * 31) + this.onClick.hashCode();
            }

            public String toString() {
                return "RatingScaleItem(title=" + this.title + ", contentDescriptionLabel=" + this.contentDescriptionLabel + ", iconResId=" + this.iconResId + ", onClick=" + this.onClick + ')';
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Data(BaseScaffoldData baseScaffoldData, Label label, Integer num, er.l<? super Boolean, i0> lVar, List<RatingScaleItem> list, TextAreaData textAreaData, er.a<i0> aVar, ButtonData buttonData, ButtonData buttonData2, cb4.i iVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.subtitle = label;
            this.clickedRatingScale = num;
            this.onCharsLimitReached = lVar;
            this.ratingScaleList = list;
            this.textAreaData = textAreaData;
            this.onBackAction = aVar;
            this.sendButtonData = buttonData;
            this.backButtonData = buttonData2;
            this.dialogVMSAdapter = iVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final ButtonData getBackButtonData() {
            return this.backButtonData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final cb4.i getDialogVMSAdapter() {
            return this.dialogVMSAdapter;
        }

        public final er.a<i0> d() {
            return this.onBackAction;
        }

        public final List<RatingScaleItem> e() {
            return this.ratingScaleList;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.baseScaffoldData, data.baseScaffoldData) && fr.t.c(this.subtitle, data.subtitle) && fr.t.c(this.clickedRatingScale, data.clickedRatingScale) && fr.t.c(this.onCharsLimitReached, data.onCharsLimitReached) && fr.t.c(this.ratingScaleList, data.ratingScaleList) && fr.t.c(this.textAreaData, data.textAreaData) && fr.t.c(this.onBackAction, data.onBackAction) && fr.t.c(this.sendButtonData, data.sendButtonData) && fr.t.c(this.backButtonData, data.backButtonData) && fr.t.c(this.dialogVMSAdapter, data.dialogVMSAdapter);
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final ButtonData getSendButtonData() {
            return this.sendButtonData;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final Label getSubtitle() {
            return this.subtitle;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final TextAreaData getTextAreaData() {
            return this.textAreaData;
        }

        public int hashCode() {
            int iHashCode = ((this.baseScaffoldData.hashCode() * 31) + this.subtitle.hashCode()) * 31;
            Integer num = this.clickedRatingScale;
            int iHashCode2 = (((((((((((((iHashCode + (num == null ? 0 : num.hashCode())) * 31) + this.onCharsLimitReached.hashCode()) * 31) + this.ratingScaleList.hashCode()) * 31) + this.textAreaData.hashCode()) * 31) + this.onBackAction.hashCode()) * 31) + this.sendButtonData.hashCode()) * 31) + this.backButtonData.hashCode()) * 31;
            cb4.i iVar = this.dialogVMSAdapter;
            return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", subtitle=" + this.subtitle + ", clickedRatingScale=" + this.clickedRatingScale + ", onCharsLimitReached=" + this.onCharsLimitReached + ", ratingScaleList=" + this.ratingScaleList + ", textAreaData=" + this.textAreaData + ", onBackAction=" + this.onBackAction + ", sendButtonData=" + this.sendButtonData + ", backButtonData=" + this.backButtonData + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
        }

        public /* synthetic */ Data(BaseScaffoldData baseScaffoldData, Label label, Integer num, er.l lVar, List list, TextAreaData textAreaData, er.a aVar, ButtonData buttonData, ButtonData buttonData2, cb4.i iVar, int i15, fr.k kVar) {
            this(baseScaffoldData, label, (i15 & 4) != 0 ? null : num, lVar, list, textAreaData, aVar, buttonData, buttonData2, iVar);
        }
    }
}
