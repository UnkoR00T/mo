package ra3;

import android.graphics.Bitmap;
import i50.BaseScaffoldData;
import java.util.List;
import mx.Label;
import n30.CardListData;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0004R\u0014\u0010\u0006\u001a\u00020\u00038&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005¨\u0006\u0007À\u0006\u0003"}, d2 = {"Lra3/l;", "Ll00/e;", "Lra3/l$a;", "Loz/j;", "a", "()Loz/j;", "lifecycleConnector", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface l extends l00.e<a> {

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lra3/l$a;", "", "c", "b", "a", "Lra3/l$a$a;", "Lra3/l$a$b;", "Lra3/l$a$c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a {

        /* JADX INFO: renamed from: ra3.l$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0014"}, d2 = {"Lra3/l$a$a;", "Lra3/l$a;", "Lhb4/c;", "errorVMS", "<init>", "(Lhb4/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lhb4/c;", "()Lhb4/c;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
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

        /* JADX INFO: renamed from: ra3.l$a$b, reason: from toString */
        @Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\"\b\u0087\b\u0018\u00002\u00020\u0001:\u0001&B\u0087\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u0013\u0012\u0006\u0010\u0015\u001a\u00020\t\u0012\u0006\u0010\u0016\u001a\u00020\u000f\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u001bHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001f\u001a\u00020\u001eHÖ\u0001¢\u0006\u0004\b\u001f\u0010 J\u001a\u0010$\u001a\u00020#2\b\u0010\"\u001a\u0004\u0018\u00010!HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b&\u00104R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b0\u00103\u001a\u0004\b5\u00104R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b:\u00103\u001a\u0004\b;\u00104R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b.\u0010>R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b,\u0010?\u001a\u0004\b<\u0010@R\u001f\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b(\u0010A\u001a\u0004\b*\u0010BR\u0017\u0010\u0015\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b8\u00103\u001a\u0004\b:\u00104R\u0017\u0010\u0016\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b5\u0010=\u001a\u0004\b6\u0010>R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b;\u0010C\u001a\u0004\b2\u0010D¨\u0006E"}, d2 = {"Lra3/l$a$b;", "Lra3/l$a;", "Li50/a;", "scaffoldData", "Lkotlin/Function0;", "Loq/i0;", "onBackAction", "Landroid/graphics/Bitmap;", "flagBitmap", "Lmx/a;", "countryName", "subscriptionTitle", "Ls50/a$c;", "subscriptionSwitchData", "updateInfo", "Ln30/b;", "countryWarningCardListData", "Lra3/l$a$b$a;", "mapImage", "", "countryRegionsWarningCardListDataList", "infoSectionTitle", "infoSectionCardListData", "Lcb4/i;", "dialogVmsAdapter", "<init>", "(Li50/a;Ler/a;Landroid/graphics/Bitmap;Lmx/a;Lmx/a;Ls50/a$c;Lmx/a;Ln30/b;Lra3/l$a$b$a;Ljava/util/List;Lmx/a;Ln30/b;Lcb4/i;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Li50/a;", "j", "()Li50/a;", "b", "Ler/a;", "i", "()Ler/a;", "c", "Landroid/graphics/Bitmap;", "e", "()Landroid/graphics/Bitmap;", "d", "Lmx/a;", "()Lmx/a;", "l", "f", "Ls50/a$c;", "k", "()Ls50/a$c;", "g", "m", "h", "Ln30/b;", "()Ln30/b;", "Lra3/l$a$b$a;", "()Lra3/l$a$b$a;", "Ljava/util/List;", "()Ljava/util/List;", "Lcb4/i;", "()Lcb4/i;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class Initialized implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final BaseScaffoldData scaffoldData;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final er.a<oq.i0> onBackAction;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final Bitmap flagBitmap;

            /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label countryName;

            /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label subscriptionTitle;

            /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
            private final s50.a.c subscriptionSwitchData;

            /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label updateInfo;

            /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData countryWarningCardListData;

            /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
            private final MapImageData mapImage;

            /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
            private final List<CardListData> countryRegionsWarningCardListDataList;

            /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
            private final Label infoSectionTitle;

            /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
            private final CardListData infoSectionCardListData;

            /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
            private final cb4.i dialogVmsAdapter;

            /* JADX INFO: renamed from: ra3.l$a$b$a, reason: collision with other inner class name and from toString */
            @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0018\u0010\u001aR\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001d¨\u0006\u001e"}, d2 = {"Lra3/l$a$b$a;", "", "Landroid/graphics/Bitmap;", "bitmap", "Lmx/a;", "contentDescription", "Lkotlin/Function0;", "Loq/i0;", "onClick", "<init>", "(Landroid/graphics/Bitmap;Lmx/a;Ler/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "b", "Lmx/a;", "()Lmx/a;", "c", "Ler/a;", "()Ler/a;", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
            public static final /* data */ class MapImageData {

                /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
                private final Bitmap bitmap;

                /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
                private final Label contentDescription;

                /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
                private final er.a<oq.i0> onClick;

                public MapImageData(Bitmap bitmap, Label label, er.a<oq.i0> aVar) {
                    this.bitmap = bitmap;
                    this.contentDescription = label;
                    this.onClick = aVar;
                }

                /* JADX INFO: renamed from: a, reason: from getter */
                public final Bitmap getBitmap() {
                    return this.bitmap;
                }

                /* JADX INFO: renamed from: b, reason: from getter */
                public final Label getContentDescription() {
                    return this.contentDescription;
                }

                public final er.a<oq.i0> c() {
                    return this.onClick;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof MapImageData)) {
                        return false;
                    }
                    MapImageData mapImageData = (MapImageData) other;
                    return fr.t.c(this.bitmap, mapImageData.bitmap) && fr.t.c(this.contentDescription, mapImageData.contentDescription) && fr.t.c(this.onClick, mapImageData.onClick);
                }

                public int hashCode() {
                    return (((this.bitmap.hashCode() * 31) + this.contentDescription.hashCode()) * 31) + this.onClick.hashCode();
                }

                public String toString() {
                    return "MapImageData(bitmap=" + this.bitmap + ", contentDescription=" + this.contentDescription + ", onClick=" + this.onClick + ')';
                }
            }

            public Initialized(BaseScaffoldData baseScaffoldData, er.a<oq.i0> aVar, Bitmap bitmap, Label label, Label label2, s50.a.c cVar, Label label3, CardListData cardListData, MapImageData mapImageData, List<CardListData> list, Label label4, CardListData cardListData2, cb4.i iVar) {
                this.scaffoldData = baseScaffoldData;
                this.onBackAction = aVar;
                this.flagBitmap = bitmap;
                this.countryName = label;
                this.subscriptionTitle = label2;
                this.subscriptionSwitchData = cVar;
                this.updateInfo = label3;
                this.countryWarningCardListData = cardListData;
                this.mapImage = mapImageData;
                this.countryRegionsWarningCardListDataList = list;
                this.infoSectionTitle = label4;
                this.infoSectionCardListData = cardListData2;
                this.dialogVmsAdapter = iVar;
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final Label getCountryName() {
                return this.countryName;
            }

            public final List<CardListData> b() {
                return this.countryRegionsWarningCardListDataList;
            }

            /* JADX INFO: renamed from: c, reason: from getter */
            public final CardListData getCountryWarningCardListData() {
                return this.countryWarningCardListData;
            }

            /* JADX INFO: renamed from: d, reason: from getter */
            public final cb4.i getDialogVmsAdapter() {
                return this.dialogVmsAdapter;
            }

            /* JADX INFO: renamed from: e, reason: from getter */
            public final Bitmap getFlagBitmap() {
                return this.flagBitmap;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Initialized)) {
                    return false;
                }
                Initialized initialized = (Initialized) other;
                return fr.t.c(this.scaffoldData, initialized.scaffoldData) && fr.t.c(this.onBackAction, initialized.onBackAction) && fr.t.c(this.flagBitmap, initialized.flagBitmap) && fr.t.c(this.countryName, initialized.countryName) && fr.t.c(this.subscriptionTitle, initialized.subscriptionTitle) && fr.t.c(this.subscriptionSwitchData, initialized.subscriptionSwitchData) && fr.t.c(this.updateInfo, initialized.updateInfo) && fr.t.c(this.countryWarningCardListData, initialized.countryWarningCardListData) && fr.t.c(this.mapImage, initialized.mapImage) && fr.t.c(this.countryRegionsWarningCardListDataList, initialized.countryRegionsWarningCardListDataList) && fr.t.c(this.infoSectionTitle, initialized.infoSectionTitle) && fr.t.c(this.infoSectionCardListData, initialized.infoSectionCardListData) && fr.t.c(this.dialogVmsAdapter, initialized.dialogVmsAdapter);
            }

            /* JADX INFO: renamed from: f, reason: from getter */
            public final CardListData getInfoSectionCardListData() {
                return this.infoSectionCardListData;
            }

            /* JADX INFO: renamed from: g, reason: from getter */
            public final Label getInfoSectionTitle() {
                return this.infoSectionTitle;
            }

            /* JADX INFO: renamed from: h, reason: from getter */
            public final MapImageData getMapImage() {
                return this.mapImage;
            }

            public int hashCode() {
                int iHashCode = ((this.scaffoldData.hashCode() * 31) + this.onBackAction.hashCode()) * 31;
                Bitmap bitmap = this.flagBitmap;
                int iHashCode2 = (((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.countryName.hashCode()) * 31) + this.subscriptionTitle.hashCode()) * 31) + this.subscriptionSwitchData.hashCode()) * 31;
                Label label = this.updateInfo;
                int iHashCode3 = (iHashCode2 + (label == null ? 0 : label.hashCode())) * 31;
                CardListData cardListData = this.countryWarningCardListData;
                int iHashCode4 = (iHashCode3 + (cardListData == null ? 0 : cardListData.hashCode())) * 31;
                MapImageData mapImageData = this.mapImage;
                int iHashCode5 = (iHashCode4 + (mapImageData == null ? 0 : mapImageData.hashCode())) * 31;
                List<CardListData> list = this.countryRegionsWarningCardListDataList;
                int iHashCode6 = (((((iHashCode5 + (list == null ? 0 : list.hashCode())) * 31) + this.infoSectionTitle.hashCode()) * 31) + this.infoSectionCardListData.hashCode()) * 31;
                cb4.i iVar = this.dialogVmsAdapter;
                return iHashCode6 + (iVar != null ? iVar.hashCode() : 0);
            }

            public final er.a<oq.i0> i() {
                return this.onBackAction;
            }

            /* JADX INFO: renamed from: j, reason: from getter */
            public final BaseScaffoldData getScaffoldData() {
                return this.scaffoldData;
            }

            /* JADX INFO: renamed from: k, reason: from getter */
            public final s50.a.c getSubscriptionSwitchData() {
                return this.subscriptionSwitchData;
            }

            /* JADX INFO: renamed from: l, reason: from getter */
            public final Label getSubscriptionTitle() {
                return this.subscriptionTitle;
            }

            /* JADX INFO: renamed from: m, reason: from getter */
            public final Label getUpdateInfo() {
                return this.updateInfo;
            }

            public String toString() {
                return "Initialized(scaffoldData=" + this.scaffoldData + ", onBackAction=" + this.onBackAction + ", flagBitmap=" + this.flagBitmap + ", countryName=" + this.countryName + ", subscriptionTitle=" + this.subscriptionTitle + ", subscriptionSwitchData=" + this.subscriptionSwitchData + ", updateInfo=" + this.updateInfo + ", countryWarningCardListData=" + this.countryWarningCardListData + ", mapImage=" + this.mapImage + ", countryRegionsWarningCardListDataList=" + this.countryRegionsWarningCardListDataList + ", infoSectionTitle=" + this.infoSectionTitle + ", infoSectionCardListData=" + this.infoSectionCardListData + ", dialogVmsAdapter=" + this.dialogVmsAdapter + ')';
            }
        }

        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0005\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\r\u001a\u00020\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nHÖ\u0003¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lra3/l$a$c;", "Lra3/l$a;", "<init>", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "travelabroad_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class c implements a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final c f172634a = new c();

            private c() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof c);
            }

            public int hashCode() {
                return -1218075026;
            }

            public String toString() {
                return "Loading";
            }
        }
    }

    oz.j a();
}
