package sa1;

import b30.AccordionData;
import h70.ShortcutsLayoutData;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;
import q40.IconPageBottomContentData;
import q40.IconPageData;
import x40.LinkData;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0004¨\u0006\u0005À\u0006\u0003"}, d2 = {"Lsa1/c;", "Ll00/e;", "Lsa1/c$a;", "Li70/n;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface c extends l00.e<a>, i70.n {

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0007\u0002\u0003\u0004\u0005\u0006\u0007\b\u0082\u0001\u0007\t\n\u000b\f\r\u000e\u000f¨\u0006\u0010À\u0006\u0003"}, d2 = {"Lsa1/c$a;", "", "a", "c", "b", "g", "f", "d", "e", "Lsa1/c$a$a;", "Lsa1/c$a$b;", "Lsa1/c$a$c;", "Lsa1/c$a$d;", "Lsa1/c$a$e;", "Lsa1/c$a$f;", "Lsa1/c$a$g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: sa1.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lsa1/c$a$a;", "Lsa1/c$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class C4622a implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C4622a f179619a = new C4622a();

            private C4622a() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof C4622a);
            }

            public int hashCode() {
                return 1296921621;
            }

            public String toString() {
                return "Initial";
            }
        }

        /* JADX INFO: renamed from: sa1.c$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001aB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b \u0010\"\u001a\u0004\b#\u0010$R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010%\u001a\u0004\b\u001a\u0010&R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b#\u0010'\u001a\u0004\b\u001e\u0010(¨\u0006)"}, d2 = {"Lsa1/c$a$b;", "Lsa1/c$a;", "Li50/a;", "scaffoldData", "Lo40/a;", "headerData", "Lh70/a;", "shortcutsLayoutData", "", "Lc30/b;", "alertsData", "Lsa1/c$a$b$a;", "contentData", "<init>", "(Li50/a;Lo40/a;Lh70/a;Ljava/util/List;Lsa1/c$a$b$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "d", "()Li50/a;", "b", "Lo40/a;", "c", "()Lo40/a;", "Lh70/a;", "e", "()Lh70/a;", "Ljava/util/List;", "()Ljava/util/List;", "Lsa1/c$a$b$a;", "()Lsa1/c$a$b$a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final o40.a headerData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final ShortcutsLayoutData shortcutsLayoutData;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<c30.b> alertsData;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final ContentData contentData;

            /* JADX INFO: renamed from: sa1.c$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b\u001c\u0010\u001fR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b \u0010#R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001a\u0010$\u001a\u0004\b!\u0010%¨\u0006&"}, d2 = {"Lsa1/c$a$b$a;", "", "Ln30/b;", "mainSection", "Lb30/a;", "contactAccordionData", "addressAccordionData", "additionalAccordionData", "Lmx/a;", "dataSourceInfo", "Lx40/a;", "linkData", "<init>", "(Ln30/b;Lb30/a;Lb30/a;Lb30/a;Lmx/a;Lx40/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "f", "()Ln30/b;", "b", "Lb30/a;", "c", "()Lb30/a;", "d", "e", "Lmx/a;", "()Lmx/a;", "Lx40/a;", "()Lx40/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class ContentData {

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                public static final int f179625g;

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final CardListData mainSection;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final AccordionData contactAccordionData;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final AccordionData addressAccordionData;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final AccordionData additionalAccordionData;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label dataSourceInfo;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final LinkData linkData;

                static {
                    int i15 = LinkData.f216731g;
                    int i16 = AccordionData.f16343b;
                    f179625g = i15 | i16 | i16 | i16;
                }

                public ContentData(CardListData cardListData, AccordionData accordionData, AccordionData accordionData2, AccordionData accordionData3, Label label, LinkData linkData) {
                    this.mainSection = cardListData;
                    this.contactAccordionData = accordionData;
                    this.addressAccordionData = accordionData2;
                    this.additionalAccordionData = accordionData3;
                    this.dataSourceInfo = label;
                    this.linkData = linkData;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final AccordionData getAdditionalAccordionData() {
                    return this.additionalAccordionData;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final AccordionData getAddressAccordionData() {
                    return this.addressAccordionData;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final AccordionData getContactAccordionData() {
                    return this.contactAccordionData;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final Label getDataSourceInfo() {
                    return this.dataSourceInfo;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final LinkData getLinkData() {
                    return this.linkData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof ContentData)) {
                        return false;
                    }
                    ContentData contentData = (ContentData) other;
                    return fr.t.c(this.mainSection, contentData.mainSection) && fr.t.c(this.contactAccordionData, contentData.contactAccordionData) && fr.t.c(this.addressAccordionData, contentData.addressAccordionData) && fr.t.c(this.additionalAccordionData, contentData.additionalAccordionData) && fr.t.c(this.dataSourceInfo, contentData.dataSourceInfo) && fr.t.c(this.linkData, contentData.linkData);
                }

                /* JADX INFO: renamed from: f, reason: from getter */
                public final CardListData getMainSection() {
                    return this.mainSection;
                }

                public int hashCode() {
                    return (((((((((this.mainSection.hashCode() * 31) + this.contactAccordionData.hashCode()) * 31) + this.addressAccordionData.hashCode()) * 31) + this.additionalAccordionData.hashCode()) * 31) + this.dataSourceInfo.hashCode()) * 31) + this.linkData.hashCode();
                }

                public String toString() {
                    return "ContentData(mainSection=" + this.mainSection + ", contactAccordionData=" + this.contactAccordionData + ", addressAccordionData=" + this.addressAccordionData + ", additionalAccordionData=" + this.additionalAccordionData + ", dataSourceInfo=" + this.dataSourceInfo + ", linkData=" + this.linkData + ')';
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public Initialized(BaseScaffoldData baseScaffoldData, o40.a aVar, ShortcutsLayoutData shortcutsLayoutData, List<? extends c30.b> list, ContentData contentData) {
                this.scaffoldData = baseScaffoldData;
                this.headerData = aVar;
                this.shortcutsLayoutData = shortcutsLayoutData;
                this.alertsData = list;
                this.contentData = contentData;
            }

            public final List<c30.b> a() {
                return this.alertsData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final ContentData getContentData() {
                return this.contentData;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final o40.a getHeaderData() {
                return this.headerData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final ShortcutsLayoutData getShortcutsLayoutData() {
                return this.shortcutsLayoutData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.headerData, initialized.headerData) && fr.t.c(this.shortcutsLayoutData, initialized.shortcutsLayoutData) && fr.t.c(this.alertsData, initialized.alertsData) && fr.t.c(this.contentData, initialized.contentData);
            }

            public int hashCode() {
                int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.headerData.hashCode()) * 31;
                ShortcutsLayoutData shortcutsLayoutData = this.shortcutsLayoutData;
                return ((((iHashCode + (shortcutsLayoutData == null ? 0 : shortcutsLayoutData.hashCode())) * 31) + this.alertsData.hashCode()) * 31) + this.contentData.hashCode();
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", headerData=" + this.headerData + ", shortcutsLayoutData=" + this.shortcutsLayoutData + ", alertsData=" + this.alertsData + ", contentData=" + this.contentData + ')';
            }
        }

        /* JADX INFO: renamed from: sa1.c$a$c, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u0017\u0010\u001cR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Lsa1/c$a$c;", "Lsa1/c$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Lx40/a;", "Loq/i0;", "iconPageData", "Lkotlin/Function0;", "onClose", "<init>", "(Li50/a;Lq40/g;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "c", "Ler/a;", "getOnClose", "()Ler/a;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class NoData implements a {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public static final int f179632d = (LinkData.f216731g | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<LinkData, oq.i0> iconPageData;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onClose;

            public NoData(BaseScaffoldData baseScaffoldData, IconPageData<LinkData, oq.i0> iconPageData, er.a<oq.i0> aVar) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
                this.onClose = aVar;
            }

            public final IconPageData<LinkData, oq.i0> a() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof NoData)) {
                    return false;
                }
                NoData noData = (NoData) other;
                return fr.t.c(this.scaffoldData, noData.scaffoldData) && fr.t.c(this.iconPageData, noData.iconPageData) && fr.t.c(this.onClose, noData.onClose);
            }

            public int hashCode() {
                return (((this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode()) * 31) + this.onClose.hashCode();
            }

            public String toString() {
                return "NoData(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ", onClose=" + this.onClose + ')';
            }
        }

        /* JADX INFO: renamed from: sa1.c$a$d, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsa1/c$a$d;", "Lsa1/c$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenCompanyPendingStatus implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f179636c = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            public OpenCompanyPendingStatus(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenCompanyPendingStatus)) {
                    return false;
                }
                OpenCompanyPendingStatus openCompanyPendingStatus = (OpenCompanyPendingStatus) other;
                return fr.t.c(this.scaffoldData, openCompanyPendingStatus.scaffoldData) && fr.t.c(this.iconPageData, openCompanyPendingStatus.iconPageData);
            }

            public int hashCode() {
                return (this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "OpenCompanyPendingStatus(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: sa1.c$a$e, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsa1/c$a$e;", "Lsa1/c$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class OpenCompanyRejectedStatus implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f179639c = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            public OpenCompanyRejectedStatus(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof OpenCompanyRejectedStatus)) {
                    return false;
                }
                OpenCompanyRejectedStatus openCompanyRejectedStatus = (OpenCompanyRejectedStatus) other;
                return fr.t.c(this.scaffoldData, openCompanyRejectedStatus.scaffoldData) && fr.t.c(this.iconPageData, openCompanyRejectedStatus.iconPageData);
            }

            public int hashCode() {
                return (this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "OpenCompanyRejectedStatus(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: sa1.c$a$f, reason: from toString */
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R#\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0019\u001a\u0004\b\u0015\u0010\u001a¨\u0006\u001b"}, d2 = {"Lsa1/c$a$f;", "Lsa1/c$a;", "Li50/a;", "scaffoldData", "Lq40/g;", "Loq/i0;", "Lq40/f;", "iconPageData", "<init>", "(Li50/a;Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "b", "()Li50/a;", "Lq40/g;", "()Lq40/g;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class UpdateRequired implements a {

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static final int f179642c = (IconPageBottomContentData.f164663d | IconPageData.f164667h) | BaseScaffoldData.f89350g;

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final IconPageData<oq.i0, IconPageBottomContentData> iconPageData;

            public UpdateRequired(BaseScaffoldData baseScaffoldData, IconPageData<oq.i0, IconPageBottomContentData> iconPageData) {
                this.scaffoldData = baseScaffoldData;
                this.iconPageData = iconPageData;
            }

            public final IconPageData<oq.i0, IconPageBottomContentData> a() {
                return this.iconPageData;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UpdateRequired)) {
                    return false;
                }
                UpdateRequired updateRequired = (UpdateRequired) other;
                return fr.t.c(this.scaffoldData, updateRequired.scaffoldData) && fr.t.c(this.iconPageData, updateRequired.iconPageData);
            }

            public int hashCode() {
                return (this.scaffoldData.hashCode() * 31) + this.iconPageData.hashCode();
            }

            public String toString() {
                return "UpdateRequired(scaffoldData=" + this.scaffoldData + ", iconPageData=" + this.iconPageData + ')';
            }
        }

        /* JADX INFO: renamed from: sa1.c$a$g, reason: from toString */
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0010\u0010\u0007¨\u0006\u0012"}, d2 = {"Lsa1/c$a$g;", "Lsa1/c$a;", "", "status", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class WorkInProgressNewApplication implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final String status;

            public WorkInProgressNewApplication(String str) {
                this.status = str;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final String getStatus() {
                return this.status;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof WorkInProgressNewApplication) && fr.t.c(this.status, ((WorkInProgressNewApplication) other).status);
            }

            public int hashCode() {
                return this.status.hashCode();
            }

            public String toString() {
                return "WorkInProgressNewApplication(status=" + this.status + ')';
            }
        }
    }
}
