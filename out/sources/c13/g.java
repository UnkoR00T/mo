package c13;

import b30.AccordionData;
import fr.t;
import i50.BaseScaffoldData;
import n30.CardListData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lc13/g;", "Ll00/e;", "Lc13/g$a;", "a", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: c13.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001c\u0010\u001e¨\u0006\u001f"}, d2 = {"Lc13/g$a;", "", "Li50/a;", "baseScaffoldData", "Lq40/g;", "Lc13/g$a$a;", "Loq/i0;", "iconPageData", "Lkotlin/Function0;", "onBackAction", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lq40/g;", "()Lq40/g;", "c", "Ler/a;", "()Ler/a;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final int f22591d = (AccordionData.f16343b | IconPageData.f164667h) | BaseScaffoldData.f89350g;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData baseScaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final IconPageData<ContentData, i0> iconPageData;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private final er.a<i0> onBackAction;

        /* JADX INFO: renamed from: c13.g$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\u0006\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0017\u001a\u00020\u00042\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001d\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u0019\u0010\"R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010\u001e\u001a\u0004\b$\u0010\u001fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010!\u001a\u0004\b&\u0010\"R\u0017\u0010\n\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001e\u001a\u0004\b#\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b$\u0010'\u001a\u0004\b%\u0010(¨\u0006)"}, d2 = {"Lc13/g$a$a;", "", "Ln30/b;", "mainDataDetails", "", "basicDataVisible", "Lb30/a;", "basicAccordionData", "technicalDataVisible", "technicalAccordionData", "documentsVisible", "documentAccordionData", "Lc30/b$c;", "infoAboutAlert", "<init>", "(Ln30/b;ZLb30/a;ZLb30/a;ZLb30/a;Lc30/b$c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "f", "()Ln30/b;", "b", "Z", "()Z", "c", "Lb30/a;", "()Lb30/a;", "d", "h", "e", "g", "Lc30/b$c;", "()Lc30/b$c;", "safebus_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class ContentData {

            /* JADX INFO: renamed from: i, reason: collision with root package name */
            public static final int f22595i = AccordionData.f16343b;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData mainDataDetails;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean basicDataVisible;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData basicAccordionData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean technicalDataVisible;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData technicalAccordionData;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final boolean documentsVisible;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final AccordionData documentAccordionData;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final c30.b.c infoAboutAlert;

            public ContentData(CardListData cardListData, boolean z15, AccordionData accordionData, boolean z16, AccordionData accordionData2, boolean z17, AccordionData accordionData3, c30.b.c cVar) {
                this.mainDataDetails = cardListData;
                this.basicDataVisible = z15;
                this.basicAccordionData = accordionData;
                this.technicalDataVisible = z16;
                this.technicalAccordionData = accordionData2;
                this.documentsVisible = z17;
                this.documentAccordionData = accordionData3;
                this.infoAboutAlert = cVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final AccordionData getBasicAccordionData() {
                return this.basicAccordionData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final boolean getBasicDataVisible() {
                return this.basicDataVisible;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final AccordionData getDocumentAccordionData() {
                return this.documentAccordionData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final boolean getDocumentsVisible() {
                return this.documentsVisible;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final c30.b.c getInfoAboutAlert() {
                return this.infoAboutAlert;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ContentData)) {
                    return false;
                }
                ContentData contentData = (ContentData) other;
                return t.c(this.mainDataDetails, contentData.mainDataDetails) && this.basicDataVisible == contentData.basicDataVisible && t.c(this.basicAccordionData, contentData.basicAccordionData) && this.technicalDataVisible == contentData.technicalDataVisible && t.c(this.technicalAccordionData, contentData.technicalAccordionData) && this.documentsVisible == contentData.documentsVisible && t.c(this.documentAccordionData, contentData.documentAccordionData) && t.c(this.infoAboutAlert, contentData.infoAboutAlert);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getMainDataDetails() {
                return this.mainDataDetails;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final AccordionData getTechnicalAccordionData() {
                return this.technicalAccordionData;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final boolean getTechnicalDataVisible() {
                return this.technicalDataVisible;
            }

            public int hashCode() {
                return (((((((((((((this.mainDataDetails.hashCode() * 31) + Boolean.hashCode(this.basicDataVisible)) * 31) + this.basicAccordionData.hashCode()) * 31) + Boolean.hashCode(this.technicalDataVisible)) * 31) + this.technicalAccordionData.hashCode()) * 31) + Boolean.hashCode(this.documentsVisible)) * 31) + this.documentAccordionData.hashCode()) * 31) + this.infoAboutAlert.hashCode();
            }

            public String toString() {
                return "ContentData(mainDataDetails=" + this.mainDataDetails + ", basicDataVisible=" + this.basicDataVisible + ", basicAccordionData=" + this.basicAccordionData + ", technicalDataVisible=" + this.technicalDataVisible + ", technicalAccordionData=" + this.technicalAccordionData + ", documentsVisible=" + this.documentsVisible + ", documentAccordionData=" + this.documentAccordionData + ", infoAboutAlert=" + this.infoAboutAlert + ')';
            }
        }

        public Data(BaseScaffoldData baseScaffoldData, IconPageData<ContentData, i0> iconPageData, er.a<i0> aVar) {
            this.baseScaffoldData = baseScaffoldData;
            this.iconPageData = iconPageData;
            this.onBackAction = aVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getBaseScaffoldData() {
            return this.baseScaffoldData;
        }

        public final IconPageData<ContentData, i0> b() {
            return this.iconPageData;
        }

        public final er.a<i0> c() {
            return this.onBackAction;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return t.c(this.baseScaffoldData, data.baseScaffoldData) && t.c(this.iconPageData, data.iconPageData) && t.c(this.onBackAction, data.onBackAction);
        }

        public int hashCode() {
            return (((this.baseScaffoldData.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.onBackAction.hashCode();
        }

        public String toString() {
            return "Data(baseScaffoldData=" + this.baseScaffoldData + ", iconPageData=" + this.iconPageData + ", onBackAction=" + this.onBackAction + ')';
        }
    }
}
