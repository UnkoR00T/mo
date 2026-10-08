package h83;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;
import v50.c;

/* JADX INFO: renamed from: h83.a, reason: from toString */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b\u001f\u0010%R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b&\u0010\u0018\u001a\u0004\b\u0017\u0010\u001a¨\u0006'"}, d2 = {"Lh83/a;", "", "Lmx/a;", "bottomDialogLabel", "", "showCodeBottomSheetDialog", "code", "Lhz/b;", "codeValidationState", "Lv50/c;", "textInputData", "bottomDialogButton", "<init>", "(Lmx/a;ZLmx/a;Lhz/b;Lv50/c;Lmx/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lmx/a;", "b", "()Lmx/a;", "Z", "c", "()Z", "getCode", "d", "Lhz/b;", "getCodeValidationState", "()Lhz/b;", "e", "Lv50/c;", "()Lv50/c;", "f", "studentschoolcardactivation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class BottomSheetContentData {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f81896g = c.f203957t | hz.b.f86845b;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label bottomDialogLabel;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean showCodeBottomSheetDialog;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label code;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final hz.b codeValidationState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final c textInputData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label bottomDialogButton;

    public BottomSheetContentData(Label label, boolean z15, Label label2, hz.b bVar, c cVar, Label label3) {
        this.bottomDialogLabel = label;
        this.showCodeBottomSheetDialog = z15;
        this.code = label2;
        this.codeValidationState = bVar;
        this.textInputData = cVar;
        this.bottomDialogButton = label3;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final Label getBottomDialogButton() {
        return this.bottomDialogButton;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final Label getBottomDialogLabel() {
        return this.bottomDialogLabel;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShowCodeBottomSheetDialog() {
        return this.showCodeBottomSheetDialog;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final c getTextInputData() {
        return this.textInputData;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BottomSheetContentData)) {
            return false;
        }
        BottomSheetContentData bottomSheetContentData = (BottomSheetContentData) other;
        return t.c(this.bottomDialogLabel, bottomSheetContentData.bottomDialogLabel) && this.showCodeBottomSheetDialog == bottomSheetContentData.showCodeBottomSheetDialog && t.c(this.code, bottomSheetContentData.code) && t.c(this.codeValidationState, bottomSheetContentData.codeValidationState) && t.c(this.textInputData, bottomSheetContentData.textInputData) && t.c(this.bottomDialogButton, bottomSheetContentData.bottomDialogButton);
    }

    public int hashCode() {
        return (((((((((this.bottomDialogLabel.hashCode() * 31) + Boolean.hashCode(this.showCodeBottomSheetDialog)) * 31) + this.code.hashCode()) * 31) + this.codeValidationState.hashCode()) * 31) + this.textInputData.hashCode()) * 31) + this.bottomDialogButton.hashCode();
    }

    public String toString() {
        return "BottomSheetContentData(bottomDialogLabel=" + this.bottomDialogLabel + ", showCodeBottomSheetDialog=" + this.showCodeBottomSheetDialog + ", code=" + this.code + ", codeValidationState=" + this.codeValidationState + ", textInputData=" + this.textInputData + ", bottomDialogButton=" + this.bottomDialogButton + ')';
    }
}
