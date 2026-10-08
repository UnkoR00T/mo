package we0;

import b30.AccordionData;
import h30.ButtonData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lwe0/c;", "Ll00/e;", "Lwe0/c$a;", "a", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\nÀ\u0006\u0003"}, d2 = {"Lwe0/c$a;", "", "b", "c", "d", "a", "Lwe0/c$a$a;", "Lwe0/c$a$b;", "Lwe0/c$a$c;", "Lwe0/c$a$d;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: we0.c$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lwe0/c$a$a;", "Lwe0/c$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Error implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final hb4.c errorVMS;

            public Error(hb4.c cVar) {
                this.errorVMS = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final hb4.c getErrorVMS() {
                return this.errorVMS;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Error) && fr.t.c(this.errorVMS, ((Error) other).errorVMS);
            }

            public int hashCode() {
                return this.errorVMS.hashCode();
            }

            public String toString() {
                return "Error(errorVMS=" + this.errorVMS + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lwe0/c$a$b;", "Lwe0/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class b implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f212582a = new b();

            private b() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof b);
            }

            public int hashCode() {
                return -166589832;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: we0.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aHÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b&\u0010)R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b*\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b+\u0010'\u001a\u0004\b+\u0010)R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u001f\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b$\u00100\u001a\u0004\b\u001f\u00101R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b.\u00102\u001a\u0004\b,\u00103¨\u00064"}, d2 = {"Lwe0/c$a$c;", "Lwe0/c$a;", "Li50/a;", "baseScaffoldData", "Lmx/a;", "title", "Ln50/g;", "documentType", "dataRecipient", "dataSectionTitle", "photo", "Ln30/b;", "userData", "", "Lb30/a;", "accordionSections", "Lh30/a;", "shareButtonData", "<init>", "(Li50/a;Lmx/a;Ln50/g;Ln50/g;Lmx/a;Ln50/g;Ln30/b;Ljava/util/List;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lmx/a;", "h", "()Lmx/a;", "c", "Ln50/g;", "e", "()Ln50/g;", "d", "f", "g", "Ln30/b;", "i", "()Ln30/b;", "Ljava/util/List;", "()Ljava/util/List;", "Lh30/a;", "()Lh30/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label title;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData documentType;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData dataRecipient;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label dataSectionTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData photo;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData userData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<AccordionData> accordionSections;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData shareButtonData;

            public Initialized(BaseScaffoldData baseScaffoldData, Label label, DefaultSingleCardData defaultSingleCardData, DefaultSingleCardData defaultSingleCardData2, Label label2, DefaultSingleCardData defaultSingleCardData3, CardListData cardListData, List<AccordionData> list, ButtonData buttonData) {
                this.baseScaffoldData = baseScaffoldData;
                this.title = label;
                this.documentType = defaultSingleCardData;
                this.dataRecipient = defaultSingleCardData2;
                this.dataSectionTitle = label2;
                this.photo = defaultSingleCardData3;
                this.userData = cardListData;
                this.accordionSections = list;
                this.shareButtonData = buttonData;
            }

            public final List<AccordionData> a() {
                return this.accordionSections;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final DefaultSingleCardData getDataRecipient() {
                return this.dataRecipient;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final Label getDataSectionTitle() {
                return this.dataSectionTitle;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final DefaultSingleCardData getDocumentType() {
                return this.documentType;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.baseScaffoldData, initialized.baseScaffoldData) && fr.t.c(this.title, initialized.title) && fr.t.c(this.documentType, initialized.documentType) && fr.t.c(this.dataRecipient, initialized.dataRecipient) && fr.t.c(this.dataSectionTitle, initialized.dataSectionTitle) && fr.t.c(this.photo, initialized.photo) && fr.t.c(this.userData, initialized.userData) && fr.t.c(this.accordionSections, initialized.accordionSections) && fr.t.c(this.shareButtonData, initialized.shareButtonData);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final DefaultSingleCardData getPhoto() {
                return this.photo;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final ButtonData getShareButtonData() {
                return this.shareButtonData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final Label getTitle() {
                return this.title;
            }

            public int hashCode() {
                int iHashCode = ((((((((this.baseScaffoldData.hashCode() * 31) + this.title.hashCode()) * 31) + this.documentType.hashCode()) * 31) + this.dataRecipient.hashCode()) * 31) + this.dataSectionTitle.hashCode()) * 31;
                DefaultSingleCardData defaultSingleCardData = this.photo;
                int iHashCode2 = (((iHashCode + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31) + this.userData.hashCode()) * 31;
                List<AccordionData> list = this.accordionSections;
                return ((iHashCode2 + (list != null ? list.hashCode() : 0)) * 31) + this.shareButtonData.hashCode();
            }

            /* JADX INFO: renamed from: i, reason: from getter */
            public final CardListData getUserData() {
                return this.userData;
            }

            public String toString() {
                return "Initialized(baseScaffoldData=" + this.baseScaffoldData + ", title=" + this.title + ", documentType=" + this.documentType + ", dataRecipient=" + this.dataRecipient + ", dataSectionTitle=" + this.dataSectionTitle + ", photo=" + this.photo + ", userData=" + this.userData + ", accordionSections=" + this.accordionSections + ", shareButtonData=" + this.shareButtonData + ')';
            }
        }

        /* JADX INFO: renamed from: we0.c$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001e\u0010 R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010!\u001a\u0004\b\u001a\u0010\"¨\u0006#"}, d2 = {"Lwe0/c$a$d;", "Lwe0/c$a;", "Li50/a;", "baseScaffoldData", "Lo40/a$a;", "headerData", "Ln50/g;", "dataRecipient", "Lh30/a;", "closeButtonData", "<init>", "(Li50/a;Lo40/a$a;Ln50/g;Lh30/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lo40/a$a;", "d", "()Lo40/a$a;", "c", "Ln50/g;", "()Ln50/g;", "Lh30/a;", "()Lh30/a;", "verification_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class SuccessScreen implements a {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public static final int f212592e = o40.a.Icon.f142232h | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData baseScaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a.Icon headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final DefaultSingleCardData dataRecipient;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final ButtonData closeButtonData;

            public SuccessScreen(BaseScaffoldData baseScaffoldData, o40.a.Icon icon, DefaultSingleCardData defaultSingleCardData, ButtonData buttonData) {
                this.baseScaffoldData = baseScaffoldData;
                this.headerData = icon;
                this.dataRecipient = defaultSingleCardData;
                this.closeButtonData = buttonData;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final BaseScaffoldData getBaseScaffoldData() {
                return this.baseScaffoldData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ButtonData getCloseButtonData() {
                return this.closeButtonData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final DefaultSingleCardData getDataRecipient() {
                return this.dataRecipient;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final o40.a.Icon getHeaderData() {
                return this.headerData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof SuccessScreen)) {
                    return false;
                }
                SuccessScreen successScreen = (SuccessScreen) other;
                return fr.t.c(this.baseScaffoldData, successScreen.baseScaffoldData) && fr.t.c(this.headerData, successScreen.headerData) && fr.t.c(this.dataRecipient, successScreen.dataRecipient) && fr.t.c(this.closeButtonData, successScreen.closeButtonData);
            }

            public int hashCode() {
                return (((((this.baseScaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31) + this.dataRecipient.hashCode()) * 31) + this.closeButtonData.hashCode();
            }

            public String toString() {
                return "SuccessScreen(baseScaffoldData=" + this.baseScaffoldData + ", headerData=" + this.headerData + ", dataRecipient=" + this.dataRecipient + ", closeButtonData=" + this.closeButtonData + ')';
            }
        }
    }
}
