package dp3;

import android.graphics.Bitmap;
import fr.t;
import h30.ButtonData;
import i50.BaseScaffoldData;
import l60.AccordionSection;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Ldp3/c;", "Ll00/e;", "Ldp3/c$a;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Ldp3/c$a;", "", "a", "b", "Ldp3/c$a$a;", "Ldp3/c$a$b;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: dp3.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Ldp3/c$a$a;", "Ldp3/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C0984a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0984a f43706a = new C0984a();

            private C0984a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C0984a);
            }

            public int hashCode() {
                return -885649679;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: dp3.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\"\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b'\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010.\u001a\u0004\b \u0010/R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b)\u00100\u001a\u0004\b+\u00101R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b6\u00108R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b4\u00107\u001a\u0004\b2\u00108¨\u00069"}, d2 = {"Ldp3/c$a$b;", "Ldp3/c$a;", "Li50/a;", "baseScaffoldData", "Landroid/graphics/Bitmap;", "image", "Ln50/k;", "statusData", "Ln30/b;", "cardListData", "Ll60/a;", "accordionSection", "Lh30/a;", "closeButtonData", "", "timerProgress", "Lmx/a;", "timerLabel", "timeLeftLabel", "<init>", "(Li50/a;Landroid/graphics/Bitmap;Ln50/k;Ln30/b;Ll60/a;Lh30/a;FLmx/a;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "c", "Ln50/k;", "f", "()Ln50/k;", "d", "Ln30/b;", "()Ln30/b;", "Ll60/a;", "()Ll60/a;", "Lh30/a;", "()Lh30/a;", "g", "F", "i", "()F", "h", "Lmx/a;", "()Lmx/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap image;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k statusData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData cardListData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionSection accordionSection;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData closeButtonData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final float timerProgress;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label timerLabel;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label timeLeftLabel;

            public Initialized(BaseScaffoldData baseScaffoldData, Bitmap bitmap, n50.k kVar, CardListData cardListData, AccordionSection accordionSection, ButtonData buttonData, float f15, Label label, Label label2) {
                this.baseScaffoldData = baseScaffoldData;
                this.image = bitmap;
                this.statusData = kVar;
                this.cardListData = cardListData;
                this.accordionSection = accordionSection;
                this.closeButtonData = buttonData;
                this.timerProgress = f15;
                this.timerLabel = label;
                this.timeLeftLabel = label2;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AccordionSection getAccordionSection() {
                return this.accordionSection;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getCardListData() {
                return this.cardListData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final ButtonData getCloseButtonData() {
                return this.closeButtonData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Bitmap getImage() {
                return this.image;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return t.c(this.baseScaffoldData, initialized.baseScaffoldData) && t.c(this.image, initialized.image) && t.c(this.statusData, initialized.statusData) && t.c(this.cardListData, initialized.cardListData) && t.c(this.accordionSection, initialized.accordionSection) && t.c(this.closeButtonData, initialized.closeButtonData) && Float.compare(this.timerProgress, initialized.timerProgress) == 0 && t.c(this.timerLabel, initialized.timerLabel) && t.c(this.timeLeftLabel, initialized.timeLeftLabel);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final n50.k getStatusData() {
                return this.statusData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getTimeLeftLabel() {
                return this.timeLeftLabel;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getTimerLabel() {
                return this.timerLabel;
            }

            public int hashCode() {
                int iHashCode = this.baseScaffoldData.hashCode() * 31;
                Bitmap bitmap = this.image;
                int iHashCode2 = (((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.statusData.hashCode()) * 31) + this.cardListData.hashCode()) * 31;
                AccordionSection accordionSection = this.accordionSection;
                return ((((((((iHashCode2 + (accordionSection != null ? accordionSection.hashCode() : 0)) * 31) + this.closeButtonData.hashCode()) * 31) + Float.hashCode(this.timerProgress)) * 31) + this.timerLabel.hashCode()) * 31) + this.timeLeftLabel.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final float getTimerProgress() {
                return this.timerProgress;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", image=" + this.image + ", statusData=" + this.statusData + ", cardListData=" + this.cardListData + ", accordionSection=" + this.accordionSection + ", closeButtonData=" + this.closeButtonData + ", timerProgress=" + this.timerProgress + ", timerLabel=" + this.timerLabel + ", timeLeftLabel=" + this.timeLeftLabel + ')';
            }
        }
    }
}
