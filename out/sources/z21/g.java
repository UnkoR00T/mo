package z21;

import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import n50.DefaultSingleCardData;
import oq.i0;
import p071kotlin.Metadata;
import q40.IconPageData;
import t40.InfoRowListData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lz21/g;", "Ll00/e;", "Lz21/g$a;", "a", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface g extends l00.e<Data> {

    /* JADX INFO: renamed from: z21.g$a, reason: from toString */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017¨\u0006\u0018"}, d2 = {"Lz21/g$a;", "", "Li50/a;", "scaffoldData", "Lz21/g$a$a;", "screenVariant", "<init>", "(Li50/a;Lz21/g$a$a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "()Li50/a;", "b", "Lz21/g$a$a;", "()Lz21/g$a$a;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class Data {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private final BaseScaffoldData scaffoldData;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private final InterfaceC6236a screenVariant;

        /* JADX INFO: renamed from: z21.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006À\u0006\u0003"}, d2 = {"Lz21/g$a$a;", "", "b", "a", "Lz21/g$a$a$a;", "Lz21/g$a$a$b;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public interface InterfaceC6236a {

            /* JADX INFO: renamed from: z21.g$a$a$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0013B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lz21/g$a$a$a;", "Lz21/g$a$a;", "Lq40/g;", "Lz21/g$a$a$a$a;", "Loq/i0;", "iconPageData", "<init>", "(Lq40/g;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lq40/g;", "()Lq40/g;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Failure implements InterfaceC6236a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final IconPageData<ContentData, i0> iconPageData;

                /* JADX INFO: renamed from: z21.g$a$a$a$a, reason: collision with other inner class name and from toString */
                @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0015\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0019\u001a\u00020\u00182\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b\u001b\u0010(R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010)\u001a\u0004\b&\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b!\u0010+\u001a\u0004\b#\u0010,¨\u0006-"}, d2 = {"Lz21/g$a$a$a$a;", "", "Ln30/b;", "mainSection", "Lmx/a;", "sectionTitle", "Lt40/b;", "bullets", "", "Lc30/b$c;", "alertSection", "Ln50/g;", "downloadButton", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Ln30/b;Lmx/a;Lt40/b;Ljava/util/List;Ln50/g;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ln30/b;", "e", "()Ln30/b;", "b", "Lmx/a;", "f", "()Lmx/a;", "c", "Lt40/b;", "()Lt40/b;", "d", "Ljava/util/List;", "()Ljava/util/List;", "Ln50/g;", "()Ln50/g;", "Lcb4/i;", "()Lcb4/i;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
                public static final /* data */ class ContentData {

                    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                    private final CardListData mainSection;

                    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                    private final Label sectionTitle;

                    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                    private final InfoRowListData bullets;

                    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                    private final List<c30.b.c> alertSection;

                    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                    private final DefaultSingleCardData downloadButton;

                    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                    private final cb4.i dialogVMSAdapter;

                    public ContentData(CardListData cardListData, Label label, InfoRowListData infoRowListData, List<c30.b.c> list, DefaultSingleCardData defaultSingleCardData, cb4.i iVar) {
                        this.mainSection = cardListData;
                        this.sectionTitle = label;
                        this.bullets = infoRowListData;
                        this.alertSection = list;
                        this.downloadButton = defaultSingleCardData;
                        this.dialogVMSAdapter = iVar;
                    }

                    public final List<c30.b.c> a() {
                        return this.alertSection;
                    }

                    /* JADX INFO: renamed from: b, reason: from getter */
                    public final InfoRowListData getBullets() {
                        return this.bullets;
                    }

                    /* JADX INFO: renamed from: c, reason: from getter */
                    public final cb4.i getDialogVMSAdapter() {
                        return this.dialogVMSAdapter;
                    }

                    /* JADX INFO: renamed from: d, reason: from getter */
                    public final DefaultSingleCardData getDownloadButton() {
                        return this.downloadButton;
                    }

                    /* JADX INFO: renamed from: e, reason: from getter */
                    public final CardListData getMainSection() {
                        return this.mainSection;
                    }

                    public boolean equals(Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof ContentData)) {
                            return false;
                        }
                        ContentData contentData = (ContentData) other;
                        return fr.t.c(this.mainSection, contentData.mainSection) && fr.t.c(this.sectionTitle, contentData.sectionTitle) && fr.t.c(this.bullets, contentData.bullets) && fr.t.c(this.alertSection, contentData.alertSection) && fr.t.c(this.downloadButton, contentData.downloadButton) && fr.t.c(this.dialogVMSAdapter, contentData.dialogVMSAdapter);
                    }

                    /* JADX INFO: renamed from: f, reason: from getter */
                    public final Label getSectionTitle() {
                        return this.sectionTitle;
                    }

                    public int hashCode() {
                        int iHashCode = ((((((this.mainSection.hashCode() * 31) + this.sectionTitle.hashCode()) * 31) + this.bullets.hashCode()) * 31) + this.alertSection.hashCode()) * 31;
                        DefaultSingleCardData defaultSingleCardData = this.downloadButton;
                        int iHashCode2 = (iHashCode + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31;
                        cb4.i iVar = this.dialogVMSAdapter;
                        return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
                    }

                    public String toString() {
                        return "ContentData(mainSection=" + this.mainSection + ", sectionTitle=" + this.sectionTitle + ", bullets=" + this.bullets + ", alertSection=" + this.alertSection + ", downloadButton=" + this.downloadButton + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
                    }
                }

                public Failure(IconPageData<ContentData, i0> iconPageData) {
                    this.iconPageData = iconPageData;
                }

                public final IconPageData<ContentData, i0> a() {
                    return this.iconPageData;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Failure) && fr.t.c(this.iconPageData, ((Failure) other).iconPageData);
                }

                public int hashCode() {
                    return this.iconPageData.hashCode();
                }

                public String toString() {
                    return "Failure(iconPageData=" + this.iconPageData + ')';
                }
            }

            /* JADX INFO: renamed from: z21.g$a$a$b, reason: from toString */
            @Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0018HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001e\u001a\u00020\u001d2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bHÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b \u0010\"R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b'\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R\u0017\u0010\n\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b%\u0010(\u001a\u0004\b/\u0010*R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\b0\u000b8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b0\u00102R\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u000b8\u0006¢\u0006\f\n\u0004\b-\u00101\u001a\u0004\b#\u00102R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b/\u00103\u001a\u0004\b+\u00104R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b)\u00105\u001a\u0004\b'\u00106¨\u00067"}, d2 = {"Lz21/g$a$a$b;", "Lz21/g$a$a;", "Lc30/b;", "alert", "Ld40/b;", "icon", "Lmx/a;", "title", "Ln30/b;", "mainSection", "sectionTitle", "", "insuranceSection", "Lc30/b$c;", "alertSection", "Ln50/g;", "downloadButton", "Lcb4/i;", "dialogVMSAdapter", "<init>", "(Lc30/b;Ld40/b;Lmx/a;Ln30/b;Lmx/a;Ljava/util/List;Ljava/util/List;Ln50/g;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lc30/b;", "()Lc30/b;", "b", "Ld40/b;", "e", "()Ld40/b;", "c", "Lmx/a;", "i", "()Lmx/a;", "d", "Ln30/b;", "g", "()Ln30/b;", "h", "f", "Ljava/util/List;", "()Ljava/util/List;", "Ln50/g;", "()Ln50/g;", "Lcb4/i;", "()Lcb4/i;", "checkvehicleinsurance_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class Success implements InterfaceC6236a {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final c30.b alert;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final d40.b icon;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label title;

                /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
                private final CardListData mainSection;

                /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label sectionTitle;

                /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<CardListData> insuranceSection;

                /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
                private final List<c30.b.c> alertSection;

                /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
                private final DefaultSingleCardData downloadButton;

                /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
                private final cb4.i dialogVMSAdapter;

                public Success(c30.b bVar, d40.b bVar2, Label label, CardListData cardListData, Label label2, List<CardListData> list, List<c30.b.c> list2, DefaultSingleCardData defaultSingleCardData, cb4.i iVar) {
                    this.alert = bVar;
                    this.icon = bVar2;
                    this.title = label;
                    this.mainSection = cardListData;
                    this.sectionTitle = label2;
                    this.insuranceSection = list;
                    this.alertSection = list2;
                    this.downloadButton = defaultSingleCardData;
                    this.dialogVMSAdapter = iVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final c30.b getAlert() {
                    return this.alert;
                }

                public final List<c30.b.c> b() {
                    return this.alertSection;
                }

                /* JADX INFO: renamed from: c, reason: from getter */
                public final cb4.i getDialogVMSAdapter() {
                    return this.dialogVMSAdapter;
                }

                /* JADX INFO: renamed from: d, reason: from getter */
                public final DefaultSingleCardData getDownloadButton() {
                    return this.downloadButton;
                }

                /* JADX INFO: renamed from: e, reason: from getter */
                public final d40.b getIcon() {
                    return this.icon;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Success)) {
                        return false;
                    }
                    Success success = (Success) other;
                    return fr.t.c(this.alert, success.alert) && fr.t.c(this.icon, success.icon) && fr.t.c(this.title, success.title) && fr.t.c(this.mainSection, success.mainSection) && fr.t.c(this.sectionTitle, success.sectionTitle) && fr.t.c(this.insuranceSection, success.insuranceSection) && fr.t.c(this.alertSection, success.alertSection) && fr.t.c(this.downloadButton, success.downloadButton) && fr.t.c(this.dialogVMSAdapter, success.dialogVMSAdapter);
                }

                public final List<CardListData> f() {
                    return this.insuranceSection;
                }

                /* JADX INFO: renamed from: g, reason: from getter */
                public final CardListData getMainSection() {
                    return this.mainSection;
                }

                /* JADX INFO: renamed from: h, reason: from getter */
                public final Label getSectionTitle() {
                    return this.sectionTitle;
                }

                public int hashCode() {
                    c30.b bVar = this.alert;
                    int iHashCode = (((((((((((((bVar == null ? 0 : bVar.hashCode()) * 31) + this.icon.hashCode()) * 31) + this.title.hashCode()) * 31) + this.mainSection.hashCode()) * 31) + this.sectionTitle.hashCode()) * 31) + this.insuranceSection.hashCode()) * 31) + this.alertSection.hashCode()) * 31;
                    DefaultSingleCardData defaultSingleCardData = this.downloadButton;
                    int iHashCode2 = (iHashCode + (defaultSingleCardData == null ? 0 : defaultSingleCardData.hashCode())) * 31;
                    cb4.i iVar = this.dialogVMSAdapter;
                    return iHashCode2 + (iVar != null ? iVar.hashCode() : 0);
                }

                /* JADX INFO: renamed from: i, reason: from getter */
                public final Label getTitle() {
                    return this.title;
                }

                public String toString() {
                    return "Success(alert=" + this.alert + ", icon=" + this.icon + ", title=" + this.title + ", mainSection=" + this.mainSection + ", sectionTitle=" + this.sectionTitle + ", insuranceSection=" + this.insuranceSection + ", alertSection=" + this.alertSection + ", downloadButton=" + this.downloadButton + ", dialogVMSAdapter=" + this.dialogVMSAdapter + ')';
                }
            }
        }

        public Data(BaseScaffoldData baseScaffoldData, InterfaceC6236a interfaceC6236a) {
            this.scaffoldData = baseScaffoldData;
            this.screenVariant = interfaceC6236a;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final BaseScaffoldData getScaffoldData() {
            return this.scaffoldData;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final InterfaceC6236a getScreenVariant() {
            return this.screenVariant;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return fr.t.c(this.scaffoldData, data.scaffoldData) && fr.t.c(this.screenVariant, data.screenVariant);
        }

        public int hashCode() {
            return (this.scaffoldData.hashCode() * 31) + this.screenVariant.hashCode();
        }

        public String toString() {
            return "Data(scaffoldData=" + this.scaffoldData + ", screenVariant=" + this.screenVariant + ')';
        }
    }
}
