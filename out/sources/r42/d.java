package r42;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import l60.Hideable;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lr42/d;", "Ll00/e;", "Lr42/d$a;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lr42/d$a;", "", "a", "b", "Lr42/d$a$a;", "Lr42/d$a$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: r42.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lr42/d$a$a;", "Lr42/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4365a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4365a f171696a = new C4365a();

            private C4365a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4365a);
            }

            public int hashCode() {
                return 861440132;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: r42.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0002\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b \u0010&R\u0017\u0010\n\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b'\u0010!\u001a\u0004\b(\u0010#R\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001e\u001a\u0004\b$\u0010\u001fR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b(\u0010,\u001a\u0004\b'\u0010-¨\u0006."}, d2 = {"Lr42/d$a$b;", "Lr42/d$a;", "Ll60/b;", "Lc30/b$e;", "infoAlertData", "Lmx/a;", "title", "", "Ln50/g;", "installmentsCardData", "totalAmountLabel", "remindersAmount", "Lh30/a;", "toPaymentButtonData", "Li50/a;", "scaffoldData", "<init>", "(Ll60/b;Lmx/a;Ljava/util/List;Lmx/a;Ll60/b;Lh30/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll60/b;", "()Ll60/b;", "b", "Lmx/a;", "e", "()Lmx/a;", "c", "Ljava/util/List;", "()Ljava/util/List;", "d", "g", "f", "Lh30/a;", "()Lh30/a;", "Li50/a;", "()Li50/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Hideable<c30.b.e> infoAlertData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DefaultSingleCardData> installmentsCardData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label totalAmountLabel;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Hideable<Label> remindersAmount;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData toPaymentButtonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(Hideable<c30.b.e> hideable, Label label, List<DefaultSingleCardData> list, Label label2, Hideable<Label> hideable2, ButtonData buttonData, BaseScaffoldData baseScaffoldData) {
                this.infoAlertData = hideable;
                this.title = label;
                this.installmentsCardData = list;
                this.totalAmountLabel = label2;
                this.remindersAmount = hideable2;
                this.toPaymentButtonData = buttonData;
                this.scaffoldData = baseScaffoldData;
            }

            public final Hideable<c30.b.e> a() {
                return this.infoAlertData;
            }

            public final List<DefaultSingleCardData> b() {
                return this.installmentsCardData;
            }

            public final Hideable<Label> c() {
                return this.remindersAmount;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.infoAlertData, initialized.infoAlertData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.installmentsCardData, initialized.installmentsCardData) && fr.t.c(this.totalAmountLabel, initialized.totalAmountLabel) && fr.t.c(this.remindersAmount, initialized.remindersAmount) && fr.t.c(this.toPaymentButtonData, initialized.toPaymentButtonData) && fr.t.c(this.scaffoldData, initialized.scaffoldData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final ButtonData getToPaymentButtonData() {
                return this.toPaymentButtonData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getTotalAmountLabel() {
                return this.totalAmountLabel;
            }

            public int hashCode() {
                return (((((((((((this.infoAlertData.hashCode() * 31) + this.title.hashCode()) * 31) + this.installmentsCardData.hashCode()) * 31) + this.totalAmountLabel.hashCode()) * 31) + this.remindersAmount.hashCode()) * 31) + this.toPaymentButtonData.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(infoAlertData=" + this.infoAlertData + ", title=" + this.title + ", installmentsCardData=" + this.installmentsCardData + ", totalAmountLabel=" + this.totalAmountLabel + ", remindersAmount=" + this.remindersAmount + ", toPaymentButtonData=" + this.toPaymentButtonData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }
}
