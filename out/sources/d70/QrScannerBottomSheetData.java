package d70;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: d70.e, reason: from toString */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0018\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0016\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b!\u0010'R\u0017\u0010\u000b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b(\u0010\u001d\u001a\u0004\b\u0018\u0010\u001fR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010\u0019\u001a\u0004\b\u001c\u0010\u001b¨\u0006*"}, d2 = {"Ld70/e;", "", "", "showCodeBottomSheetDialog", "Lmx/a;", "bottomDialogLabel", "code", "Lhz/b;", "codeValidationState", "Lv50/c;", "textInputData", "bottomDialogButton", "bottomDialogButtonAlwaysEnabled", "<init>", "(ZLmx/a;Lmx/a;Lhz/b;Lv50/c;Lmx/a;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "getShowCodeBottomSheetDialog", "()Z", "b", "Lmx/a;", "c", "()Lmx/a;", "getCode", "d", "Lhz/b;", "getCodeValidationState", "()Lhz/b;", "e", "Lv50/c;", "()Lv50/c;", "f", "g", "ui_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class QrScannerBottomSheetData {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f40126h = v50.c.f203957t | hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showCodeBottomSheetDialog;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label bottomDialogLabel;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label code;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b codeValidationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final v50.c textInputData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label bottomDialogButton;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean bottomDialogButtonAlwaysEnabled;

    public QrScannerBottomSheetData(boolean z15, Label label, Label label2, hz.b bVar, v50.c cVar, Label label3, boolean z16) {
        this.showCodeBottomSheetDialog = z15;
        this.bottomDialogLabel = label;
        this.code = label2;
        this.codeValidationState = bVar;
        this.textInputData = cVar;
        this.bottomDialogButton = label3;
        this.bottomDialogButtonAlwaysEnabled = z16;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getBottomDialogButton() {
        return this.bottomDialogButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBottomDialogButtonAlwaysEnabled() {
        return this.bottomDialogButtonAlwaysEnabled;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final Label getBottomDialogLabel() {
        return this.bottomDialogLabel;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final v50.c getTextInputData() {
        return this.textInputData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QrScannerBottomSheetData)) {
            return false;
        }
        QrScannerBottomSheetData qrScannerBottomSheetData = (QrScannerBottomSheetData) other;
        return this.showCodeBottomSheetDialog == qrScannerBottomSheetData.showCodeBottomSheetDialog && t.c(this.bottomDialogLabel, qrScannerBottomSheetData.bottomDialogLabel) && t.c(this.code, qrScannerBottomSheetData.code) && t.c(this.codeValidationState, qrScannerBottomSheetData.codeValidationState) && t.c(this.textInputData, qrScannerBottomSheetData.textInputData) && t.c(this.bottomDialogButton, qrScannerBottomSheetData.bottomDialogButton) && this.bottomDialogButtonAlwaysEnabled == qrScannerBottomSheetData.bottomDialogButtonAlwaysEnabled;
    }

    public int hashCode() {
        return (((((((((((Boolean.hashCode(this.showCodeBottomSheetDialog) * 31) + this.bottomDialogLabel.hashCode()) * 31) + this.code.hashCode()) * 31) + this.codeValidationState.hashCode()) * 31) + this.textInputData.hashCode()) * 31) + this.bottomDialogButton.hashCode()) * 31) + Boolean.hashCode(this.bottomDialogButtonAlwaysEnabled);
    }

    public String toString() {
        return "QrScannerBottomSheetData(showCodeBottomSheetDialog=" + this.showCodeBottomSheetDialog + ", bottomDialogLabel=" + this.bottomDialogLabel + ", code=" + this.code + ", codeValidationState=" + this.codeValidationState + ", textInputData=" + this.textInputData + ", bottomDialogButton=" + this.bottomDialogButton + ", bottomDialogButtonAlwaysEnabled=" + this.bottomDialogButtonAlwaysEnabled + ')';
    }
}
