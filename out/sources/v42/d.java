package v42;

import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import l60.Hideable;
import mx.Label;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lv42/d;", "Ll00/e;", "Lv42/d$a;", "a", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface d extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lv42/d$a;", "", "a", "b", "Lv42/d$a$a;", "Lv42/d$a$b;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: v42.d$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lv42/d$a$a;", "Lv42/d$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C5310a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C5310a f203867a = new C5310a();

            private C5310a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C5310a);
            }

            public int hashCode() {
                return 1895544210;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: v42.d$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u0002\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010$\u001a\u0004\b \u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\b0\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u001d\u001a\u0004\b&\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001c\u0010(R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b)\u0010+¨\u0006,"}, d2 = {"Lv42/d$a$b;", "Lv42/d$a;", "Ll60/b;", "Lc30/b$e;", "infoAlert", "", "Ln50/g;", "paymentsCardsData", "Lmx/a;", "fullPaymentAmount", "remindersAmount", "Lh30/a;", "forwardButtonData", "Li50/a;", "scaffoldData", "<init>", "(Ll60/b;Ljava/util/List;Lmx/a;Ll60/b;Lh30/a;Li50/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ll60/b;", "c", "()Ll60/b;", "b", "Ljava/util/List;", "d", "()Ljava/util/List;", "Lmx/a;", "()Lmx/a;", "e", "Lh30/a;", "()Lh30/a;", "f", "Li50/a;", "()Li50/a;", "epayments_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final Hideable<c30.b.e> infoAlert;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<DefaultSingleCardData> paymentsCardsData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label fullPaymentAmount;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Hideable<Label> remindersAmount;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData forwardButtonData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            public Initialized(Hideable<c30.b.e> hideable, List<DefaultSingleCardData> list, Label label, Hideable<Label> hideable2, ButtonData buttonData, BaseScaffoldData baseScaffoldData) {
                this.infoAlert = hideable;
                this.paymentsCardsData = list;
                this.fullPaymentAmount = label;
                this.remindersAmount = hideable2;
                this.forwardButtonData = buttonData;
                this.scaffoldData = baseScaffoldData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final ButtonData getForwardButtonData() {
                return this.forwardButtonData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final Label getFullPaymentAmount() {
                return this.fullPaymentAmount;
            }

            public final Hideable<c30.b.e> c() {
                return this.infoAlert;
            }

            public final List<DefaultSingleCardData> d() {
                return this.paymentsCardsData;
            }

            public final Hideable<Label> e() {
                return this.remindersAmount;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.infoAlert, initialized.infoAlert) && fr.t.c(this.paymentsCardsData, initialized.paymentsCardsData) && fr.t.c(this.fullPaymentAmount, initialized.fullPaymentAmount) && fr.t.c(this.remindersAmount, initialized.remindersAmount) && fr.t.c(this.forwardButtonData, initialized.forwardButtonData) && fr.t.c(this.scaffoldData, initialized.scaffoldData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public int hashCode() {
                return (((((((((this.infoAlert.hashCode() * 31) + this.paymentsCardsData.hashCode()) * 31) + this.fullPaymentAmount.hashCode()) * 31) + this.remindersAmount.hashCode()) * 31) + this.forwardButtonData.hashCode()) * 31) + this.scaffoldData.hashCode();
            }

            public String toString() {
                return "Initialized(infoAlert=" + this.infoAlert + ", paymentsCardsData=" + this.paymentsCardsData + ", fullPaymentAmount=" + this.fullPaymentAmount + ", remindersAmount=" + this.remindersAmount + ", forwardButtonData=" + this.forwardButtonData + ", scaffoldData=" + this.scaffoldData + ')';
            }
        }
    }
}
