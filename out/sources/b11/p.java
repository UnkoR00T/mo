package b11;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lb11/p;", "Ll00/e;", "Lb11/p$a;", "a", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface p extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lb11/p$a;", "", "a", "b", "c", "d", "Lb11/p$a$a;", "Lb11/p$a$b;", "Lb11/p$a$c;", "Lb11/p$a$d;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: b11.p$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lb11/p$a$a;", "Lb11/p$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0379a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0379a f16062a = new C0379a();

            private C0379a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0379a);
            }

            public int hashCode() {
                return -786067192;
            }

            public String toString() {
                return "Empty";
            }
        }

        /* JADX INFO: renamed from: b11.p$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b$\u0010&R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b'\u0010%\u001a\u0004\b(\u0010&R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010%\u001a\u0004\b)\u0010&R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b(\u0010%\u001a\u0004\b'\u0010&R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b*\u0010,R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b-\u0010%\u001a\u0004\b.\u0010&R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010%\u001a\u0004\b/\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b.\u00100\u001a\u0004\b \u00101R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b-\u00101R\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105¨\u00066"}, d2 = {"Lb11/p$a$b;", "Lb11/p$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "messageDate", "messageTitle", "messageText", "messagePrivateText", "", "progress", "timeFormatted", "timeLabel", "Lh30/a;", "confirmButton", "rejectButton", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;FLmx/a;Lmx/a;Lh30/a;Lh30/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "h", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "e", "d", "f", "F", "()F", "g", "i", "j", "Lh30/a;", "()Lh30/a;", "k", "Ler/a;", "getOnBackAction", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ReadyToConfirm implements a {

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            public static final int f16063l = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messagePrivateText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final float progress;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label timeFormatted;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label timeLabel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData confirmButton;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData rejectButton;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public ReadyToConfirm(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, Label label4, float f15, Label label5, Label label6, ButtonData buttonData, ButtonData buttonData2, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.messageDate = label;
                this.messageTitle = label2;
                this.messageText = label3;
                this.messagePrivateText = label4;
                this.progress = f15;
                this.timeFormatted = label5;
                this.timeLabel = label6;
                this.confirmButton = buttonData;
                this.rejectButton = buttonData2;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getConfirmButton() {
                return this.confirmButton;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getMessageDate() {
                return this.messageDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getMessagePrivateText() {
                return this.messagePrivateText;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getMessageText() {
                return this.messageText;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getMessageTitle() {
                return this.messageTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ReadyToConfirm)) {
                    return false;
                }
                ReadyToConfirm readyToConfirm = (ReadyToConfirm) other;
                return fr.t.c(this.scaffoldData, readyToConfirm.scaffoldData) && fr.t.c(this.messageDate, readyToConfirm.messageDate) && fr.t.c(this.messageTitle, readyToConfirm.messageTitle) && fr.t.c(this.messageText, readyToConfirm.messageText) && fr.t.c(this.messagePrivateText, readyToConfirm.messagePrivateText) && Float.compare(this.progress, readyToConfirm.progress) == 0 && fr.t.c(this.timeFormatted, readyToConfirm.timeFormatted) && fr.t.c(this.timeLabel, readyToConfirm.timeLabel) && fr.t.c(this.confirmButton, readyToConfirm.confirmButton) && fr.t.c(this.rejectButton, readyToConfirm.rejectButton) && fr.t.c(this.onBackAction, readyToConfirm.onBackAction);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final float getProgress() {
                return this.progress;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getRejectButton() {
                return this.rejectButton;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.messageDate.hashCode()) * 31) + this.messageTitle.hashCode()) * 31) + this.messageText.hashCode()) * 31;
                Label label = this.messagePrivateText;
                return ((((((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + Float.hashCode(this.progress)) * 31) + this.timeFormatted.hashCode()) * 31) + this.timeLabel.hashCode()) * 31) + this.confirmButton.hashCode()) * 31) + this.rejectButton.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getTimeFormatted() {
                return this.timeFormatted;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final Label getTimeLabel() {
                return this.timeLabel;
            }

            public String toString() {
                return "ReadyToConfirm(scaffoldData=" + this.scaffoldData + ", messageDate=" + this.messageDate + ", messageTitle=" + this.messageTitle + ", messageText=" + this.messageText + ", messagePrivateText=" + this.messagePrivateText + ", progress=" + this.progress + ", timeFormatted=" + this.timeFormatted + ", timeLabel=" + this.timeLabel + ", confirmButton=" + this.confirmButton + ", rejectButton=" + this.rejectButton + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: b11.p$a$c, reason: from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0017\u0010\u001dR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001e\u001a\u0004\b\u001b\u0010\u001f¨\u0006 "}, d2 = {"Lb11/p$a$c;", "Lb11/p$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "Lkotlin/Function0;", "onBackAction", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "c", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "Ler/a;", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Success implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f16075d = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public Success(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
                this.onBackAction = aVar;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.iconPageData;
            }

            public final er.a<oq.i0> b() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return fr.t.c(this.scaffoldData, success.scaffoldData) && fr.t.c(this.iconPageData, success.iconPageData) && fr.t.c(this.onBackAction, success.onBackAction);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "Success(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ", onBackAction=" + this.onBackAction + ')';
            }
        }

        /* JADX INFO: renamed from: b11.p$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001f\u001a\u0004\b\"\u0010 R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001f\u001a\u0004\b#\u0010 R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b!\u0010 R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010\u001f\u001a\u0004\b\u001a\u0010 R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b$\u0010&¨\u0006'"}, d2 = {"Lb11/p$a$d;", "Lb11/p$a;", "Li50/a;", "scaffoldData", "Lmx/a;", "messageDate", "messageTitle", "messageText", "messagePrivateText", "infoText", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "<init>", "(Li50/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "g", "()Li50/a;", "b", "Lmx/a;", "()Lmx/a;", "c", "e", "d", "f", "Ler/a;", "()Ler/a;", "notifications_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UnableToConfirm implements a {

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            public static final int f16079h = BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageDate;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messageText;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label messagePrivateText;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoText;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            public UnableToConfirm(BaseScaffoldData baseScaffoldData, Label label, Label label2, Label label3, Label label4, Label label5, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.messageDate = label;
                this.messageTitle = label2;
                this.messageText = label3;
                this.messagePrivateText = label4;
                this.infoText = label5;
                this.onBackAction = aVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getInfoText() {
                return this.infoText;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getMessageDate() {
                return this.messageDate;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final Label getMessagePrivateText() {
                return this.messagePrivateText;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getMessageText() {
                return this.messageText;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getMessageTitle() {
                return this.messageTitle;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UnableToConfirm)) {
                    return false;
                }
                UnableToConfirm unableToConfirm = (UnableToConfirm) other;
                return fr.t.c(this.scaffoldData, unableToConfirm.scaffoldData) && fr.t.c(this.messageDate, unableToConfirm.messageDate) && fr.t.c(this.messageTitle, unableToConfirm.messageTitle) && fr.t.c(this.messageText, unableToConfirm.messageText) && fr.t.c(this.messagePrivateText, unableToConfirm.messagePrivateText) && fr.t.c(this.infoText, unableToConfirm.infoText) && fr.t.c(this.onBackAction, unableToConfirm.onBackAction);
            }

            public final er.a<oq.i0> f() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                int iHashCode = ((((((this.scaffoldData.hashCode() * 31) + this.messageDate.hashCode()) * 31) + this.messageTitle.hashCode()) * 31) + this.messageText.hashCode()) * 31;
                Label label = this.messagePrivateText;
                return ((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.infoText.hashCode()) * 31) + this.onBackAction.hashCode();
            }

            public String toString() {
                return "UnableToConfirm(scaffoldData=" + this.scaffoldData + ", messageDate=" + this.messageDate + ", messageTitle=" + this.messageTitle + ", messageText=" + this.messageText + ", messagePrivateText=" + this.messagePrivateText + ", infoText=" + this.infoText + ", onBackAction=" + this.onBackAction + ')';
            }
        }
    }
}
