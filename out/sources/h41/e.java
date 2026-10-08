package h41;

import h30.ButtonData;
import i50.BaseScaffoldData;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lh41/e;", "Ll00/e;", "Lh41/e$a;", "a", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface e extends l00.e<a> {

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0007\u0004\bR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0003\t\n\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lh41/e$a;", "", "Lkotlin/Function0;", "Loq/i0;", "a", "()Ler/a;", "onBack", "c", "b", "Lh41/e$a$a;", "Lh41/e$a$b;", "Lh41/e$a$c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: h41.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0014\u0010\u0016R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019¨\u0006\u001a"}, d2 = {"Lh41/e$a$a;", "Lh41/e$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Lhb4/c;", "errorVMS", "<init>", "(Ler/a;Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Lhb4/c;", "()Lhb4/c;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(er.a<oq.i0> aVar, hb4.c cVar) {
                this.onBack = aVar;
                this.errorVMS = cVar;
            }

            @Override // h41.e.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Error)) {
                    return false;
                }
                Error error = (Error) other;
                return fr.t.c(this.onBack, error.onBack) && fr.t.c(this.errorVMS, error.errorVMS);
            }

            public int hashCode() {
                return (this.onBack.hashCode() * 31) + this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(onBack=" + this.onBack + ", errorVMS=" + this.errorVMS + ')';
            }
        }

        /* JADX INFO: renamed from: h41.e$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0019\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b%\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b+\u0010-\u001a\u0004\b*\u0010/R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010'\u001a\u0004\b0\u0010)R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b0\u0010'\u001a\u0004\b,\u0010)R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b(\u00101\u001a\u0004\b#\u00102R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105¨\u00066"}, d2 = {"Lh41/e$a$b;", "Lh41/e$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "Li50/a;", "baseScaffoldData", "Lmx/a;", "municipalOfficeTitle", "civilRegistryOfficeTitle", "Ln50/k;", "municipalOfficeCard", "civilRegistryOfficeCard", "municipalOfficeError", "civilRegistryOfficeError", "Lc30/b;", "alertData", "Lh30/a;", "nextButtonData", "<init>", "(Ler/a;Li50/a;Lmx/a;Lmx/a;Ln50/k;Ln50/k;Lmx/a;Lmx/a;Lc30/b;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "b", "Li50/a;", "c", "()Li50/a;", "Lmx/a;", "i", "()Lmx/a;", "d", "f", "e", "Ln50/k;", "g", "()Ln50/k;", "h", "Lc30/b;", "()Lc30/b;", "j", "Lh30/a;", "()Lh30/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label municipalOfficeTitle;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label civilRegistryOfficeTitle;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k municipalOfficeCard;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final n50.k civilRegistryOfficeCard;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label municipalOfficeError;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label civilRegistryOfficeError;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b alertData;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData nextButtonData;

            public Initialized(er.a<oq.i0> aVar, BaseScaffoldData baseScaffoldData, Label label, Label label2, n50.k kVar, n50.k kVar2, Label label3, Label label4, c30.b bVar, ButtonData buttonData) {
                this.onBack = aVar;
                this.baseScaffoldData = baseScaffoldData;
                this.municipalOfficeTitle = label;
                this.civilRegistryOfficeTitle = label2;
                this.municipalOfficeCard = kVar;
                this.civilRegistryOfficeCard = kVar2;
                this.municipalOfficeError = label3;
                this.civilRegistryOfficeError = label4;
                this.alertData = bVar;
                this.nextButtonData = buttonData;
            }

            @Override // h41.e.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final c30.b getAlertData() {
                return this.alertData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final n50.k getCivilRegistryOfficeCard() {
                return this.civilRegistryOfficeCard;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Label getCivilRegistryOfficeError() {
                return this.civilRegistryOfficeError;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.onBack, initialized.onBack) && fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.municipalOfficeTitle, initialized.municipalOfficeTitle) && fr.t.c(this.civilRegistryOfficeTitle, initialized.civilRegistryOfficeTitle) && fr.t.c(this.municipalOfficeCard, initialized.municipalOfficeCard) && fr.t.c(this.civilRegistryOfficeCard, initialized.civilRegistryOfficeCard) && fr.t.c(this.municipalOfficeError, initialized.municipalOfficeError) && fr.t.c(this.civilRegistryOfficeError, initialized.civilRegistryOfficeError) && fr.t.c(this.alertData, initialized.alertData) && fr.t.c(this.nextButtonData, initialized.nextButtonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final Label getCivilRegistryOfficeTitle() {
                return this.civilRegistryOfficeTitle;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final n50.k getMunicipalOfficeCard() {
                return this.municipalOfficeCard;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getMunicipalOfficeError() {
                return this.municipalOfficeError;
            }

            public int hashCode() {
                int iHashCode = ((((((((((this.onBack.hashCode() * 31) + this.baseScaffoldData.hashCode()) * 31) + this.municipalOfficeTitle.hashCode()) * 31) + this.civilRegistryOfficeTitle.hashCode()) * 31) + this.municipalOfficeCard.hashCode()) * 31) + this.civilRegistryOfficeCard.hashCode()) * 31;
                Label label = this.municipalOfficeError;
                int iHashCode2 = (iHashCode + (label == null ? 0 : label.hashCode())) * 31;
                Label label2 = this.civilRegistryOfficeError;
                return ((((iHashCode2 + (label2 != null ? label2.hashCode() : 0)) * 31) + this.alertData.hashCode()) * 31) + this.nextButtonData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final Label getMunicipalOfficeTitle() {
                return this.municipalOfficeTitle;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final ButtonData getNextButtonData() {
                return this.nextButtonData;
            }

            public String toString() {
                return "Initialized(onBack=" + this.onBack + ", baseScaffoldData=" + this.baseScaffoldData + ", municipalOfficeTitle=" + this.municipalOfficeTitle + ", civilRegistryOfficeTitle=" + this.civilRegistryOfficeTitle + ", municipalOfficeCard=" + this.municipalOfficeCard + ", civilRegistryOfficeCard=" + this.civilRegistryOfficeCard + ", municipalOfficeError=" + this.municipalOfficeError + ", civilRegistryOfficeError=" + this.civilRegistryOfficeError + ", alertData=" + this.alertData + ", nextButtonData=" + this.nextButtonData + ')';
            }
        }

        /* JADX INFO: renamed from: h41.e$a$c, reason: from toString */
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lh41/e$a$c;", "Lh41/e$a;", "Lkotlin/Function0;", "Loq/i0;", "onBack", "<init>", "(Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ler/a;", "()Ler/a;", "childbirthregistration_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Loading implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBack;

            public Loading(er.a<oq.i0> aVar) {
                this.onBack = aVar;
            }

            @Override // h41.e.a
            public er.a<oq.i0> a() {
                return this.onBack;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Loading) && fr.t.c(this.onBack, ((Loading) other).onBack);
            }

            public int hashCode() {
                return this.onBack.hashCode();
            }

            public String toString() {
                return "Loading(onBack=" + this.onBack + ')';
            }
        }

        er.a<oq.i0> a();
    }
}
