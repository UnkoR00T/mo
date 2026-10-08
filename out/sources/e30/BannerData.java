package e30;

import androidx.compose.ui.graphics.Color;
import er.p;
import fr.k;
import i30.ButtonIconData;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;

/* JADX INFO: renamed from: e30.b, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b \u0010'R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b\u001c\u0010*R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\u001b\u0010+\u001a\u0004\b\u0019\u0010\u0014R\u001a\u0010/\u001a\u00020,8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001e\u0010-\u001a\u0004\b%\u0010.R\u001a\u00101\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b0\u0010\u001d\u001a\u0004\b(\u0010\u001f¨\u00062"}, d2 = {"Le30/b;", "", "", "testTag", "Lmx/a;", "title", "bodyText", "Lkotlin/Function0;", "Loq/i0;", "onCloseButtonClick", "Le30/a;", "bannerButtonData", "", "backgroundImageId", "assetId", "<init>", "(Ljava/lang/String;Lmx/a;Lmx/a;Ler/a;Le30/a;Ljava/lang/Integer;I)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "g", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "d", "Ler/a;", "getOnCloseButtonClick", "()Ler/a;", "e", "Le30/a;", "()Le30/a;", "f", "Ljava/lang/Integer;", "()Ljava/lang/Integer;", "I", "Li30/a;", "Li30/a;", "()Li30/a;", "closeButtonData", "i", "contentDescription", "ds_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BannerData {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f47051j = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final String testTag;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label bodyText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onCloseButtonClick;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final e30.a bannerButtonData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Integer backgroundImageId;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int assetId;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final ButtonIconData closeButtonData;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Label contentDescription;

    /* JADX INFO: renamed from: e30.b$a */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a implements p<r, Integer, Color> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f47061a = new a();

        a() {
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Color B(r rVar, Integer num) {
            return Color.m0boximpl(c(rVar, num.intValue()));
        }

        public final long c(r rVar, int i15) {
            rVar.X(210215790);
            if (t.k()) {
                t.o(210215790, i15, -1, "pl.gov.coi.common.ui.ds.banner.BannerData.closeButtonData.<anonymous> (BannerData.kt:20)");
            }
            long jB = k70.a.f108864a.a(rVar, k70.a.f108865b).getNeutral().b();
            if (t.k()) {
                t.n();
            }
            rVar.R();
            return jB;
        }
    }

    public BannerData(String str, Label label, Label label2, er.a<i0> aVar, e30.a aVar2, Integer num, int i15) {
        this.testTag = str;
        this.title = label;
        this.bodyText = label2;
        this.onCloseButtonClick = aVar;
        this.bannerButtonData = aVar2;
        this.backgroundImageId = num;
        this.assetId = i15;
        this.closeButtonData = new ButtonIconData(null, jz.a.Y, a.f47061a, null, c70.a.f23835a.a().k0(), aVar, 9, null);
        this.contentDescription = mx.b.b(label.getText() + ", " + label2.getText(), "bannerContentDescription");
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final int getAssetId() {
        return this.assetId;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Integer getBackgroundImageId() {
        return this.backgroundImageId;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final e30.a getBannerButtonData() {
        return this.bannerButtonData;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getBodyText() {
        return this.bodyText;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final ButtonIconData getCloseButtonData() {
        return this.closeButtonData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerData)) {
            return false;
        }
        BannerData bannerData = (BannerData) other;
        return fr.t.c(this.testTag, bannerData.testTag) && fr.t.c(this.title, bannerData.title) && fr.t.c(this.bodyText, bannerData.bodyText) && fr.t.c(this.onCloseButtonClick, bannerData.onCloseButtonClick) && fr.t.c(this.bannerButtonData, bannerData.bannerButtonData) && fr.t.c(this.backgroundImageId, bannerData.backgroundImageId) && this.assetId == bannerData.assetId;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getContentDescription() {
        return this.contentDescription;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final String getTestTag() {
        return this.testTag;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public int hashCode() {
        int iHashCode = ((((((this.testTag.hashCode() * 31) + this.title.hashCode()) * 31) + this.bodyText.hashCode()) * 31) + this.onCloseButtonClick.hashCode()) * 31;
        e30.a aVar = this.bannerButtonData;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Integer num = this.backgroundImageId;
        return ((iHashCode2 + (num != null ? num.hashCode() : 0)) * 31) + Integer.hashCode(this.assetId);
    }

    public String toString() {
        return "BannerData(testTag=" + this.testTag + ", title=" + this.title + ", bodyText=" + this.bodyText + ", onCloseButtonClick=" + this.onCloseButtonClick + ", bannerButtonData=" + this.bannerButtonData + ", backgroundImageId=" + this.backgroundImageId + ", assetId=" + this.assetId + ')';
    }

    public /* synthetic */ BannerData(String str, Label label, Label label2, er.a aVar, e30.a aVar2, Integer num, int i15, int i16, k kVar) {
        this(str, label, label2, aVar, (i16 & 16) != 0 ? null : aVar2, (i16 & 32) != 0 ? null : num, i15);
    }
}
