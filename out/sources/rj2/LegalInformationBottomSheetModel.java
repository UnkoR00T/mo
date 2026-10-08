package rj2;

import er.l;
import fr.t;
import mx.Label;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: rj2.a, reason: from toString */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u0019\u001a\u0004\b\u0018\u0010\u001bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010\u0010R\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006¢\u0006\f\n\u0004\b\u001a\u0010!\u001a\u0004\b\u001d\u0010\"R#\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\t0\u000b8\u0006¢\u0006\f\n\u0004\b \u0010#\u001a\u0004\b\u001e\u0010$¨\u0006%"}, d2 = {"Lrj2/a;", "", "Lmx/a;", "title", "downloadButtonText", "closeButtonText", "", "webViewUrl", "Lkotlin/Function0;", "Loq/i0;", "onDownloadPdfClick", "Lkotlin/Function1;", "openUrl", "<init>", "(Lmx/a;Lmx/a;Lmx/a;Ljava/lang/String;Ler/a;Ler/l;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "e", "()Lmx/a;", "b", "c", "d", "Ljava/lang/String;", "f", "Ler/a;", "()Ler/a;", "Ler/l;", "()Ler/l;", "legalinformation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class LegalInformationBottomSheetModel {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label title;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label downloadButtonText;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label closeButtonText;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final String webViewUrl;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final er.a<i0> onDownloadPdfClick;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<String, i0> openUrl;

    /* JADX WARN: Multi-variable type inference failed */
    public LegalInformationBottomSheetModel(Label label, Label label2, Label label3, String str, er.a<i0> aVar, l<? super String, i0> lVar) {
        this.title = label;
        this.downloadButtonText = label2;
        this.closeButtonText = label3;
        this.webViewUrl = str;
        this.onDownloadPdfClick = aVar;
        this.openUrl = lVar;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getCloseButtonText() {
        return this.closeButtonText;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getDownloadButtonText() {
        return this.downloadButtonText;
    }

    public final er.a<i0> c() {
        return this.onDownloadPdfClick;
    }

    public final l<String, i0> d() {
        return this.openUrl;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getTitle() {
        return this.title;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegalInformationBottomSheetModel)) {
            return false;
        }
        LegalInformationBottomSheetModel legalInformationBottomSheetModel = (LegalInformationBottomSheetModel) other;
        return t.c(this.title, legalInformationBottomSheetModel.title) && t.c(this.downloadButtonText, legalInformationBottomSheetModel.downloadButtonText) && t.c(this.closeButtonText, legalInformationBottomSheetModel.closeButtonText) && t.c(this.webViewUrl, legalInformationBottomSheetModel.webViewUrl) && t.c(this.onDownloadPdfClick, legalInformationBottomSheetModel.onDownloadPdfClick) && t.c(this.openUrl, legalInformationBottomSheetModel.openUrl);
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final String getWebViewUrl() {
        return this.webViewUrl;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        Label label = this.downloadButtonText;
        return ((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.closeButtonText.hashCode()) * 31) + this.webViewUrl.hashCode()) * 31) + this.onDownloadPdfClick.hashCode()) * 31) + this.openUrl.hashCode();
    }

    public String toString() {
        return "LegalInformationBottomSheetModel(title=" + this.title + ", downloadButtonText=" + this.downloadButtonText + ", closeButtonText=" + this.closeButtonText + ", webViewUrl=" + this.webViewUrl + ", onDownloadPdfClick=" + this.onDownloadPdfClick + ", openUrl=" + this.openUrl + ')';
    }
}
