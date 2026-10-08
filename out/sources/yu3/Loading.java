package yu3;

import p071kotlin.Metadata;
import pu3.ConfirmationDocumentData;

/* JADX INFO: renamed from: yu3.f, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u0001\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0012\u001a\u00020\u00052\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0014\u0010\u001cR\u001c\u0010\"\u001a\u0004\u0018\u00010\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010$\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b#\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019R\u001a\u0010(\u001a\u00020%8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010&\u001a\u0004\b#\u0010'¨\u0006)"}, d2 = {"Lyu3/f;", "", "Lyu3/g$c;", "Lpu3/a;", "confirmationDocumentData", "", "isValid", "Lyu3/q0;", "action", "<init>", "(Lpu3/a;ZLyu3/q0;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Lpu3/a;", "b", "()Lpu3/a;", "Z", "()Z", "c", "Lyu3/q0;", "()Lyu3/q0;", "", "d", "Ljava/lang/Void;", "f", "()Ljava/lang/Void;", "pickedFile", "e", "scrollToPicker", "Lg30/v;", "Lg30/v;", "()Lg30/v;", "bottomSheetValue", "confirmationdocument_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class Loading implements g, g.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final ConfirmationDocumentData confirmationDocumentData;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isValid;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final q0 action;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Void pickedFile;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean scrollToPicker;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final g30.v bottomSheetValue = g30.v.HIDDEN;

    public Loading(ConfirmationDocumentData confirmationDocumentData, boolean z15, q0 q0Var) {
        this.confirmationDocumentData = confirmationDocumentData;
        this.isValid = z15;
        this.action = q0Var;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final q0 getAction() {
        return this.action;
    }

    @Override // yu3.g.c
    /* JADX INFO: renamed from: b, reason: from getter */
    public ConfirmationDocumentData getConfirmationDocumentData() {
        return this.confirmationDocumentData;
    }

    @Override // yu3.g.c
    /* JADX INFO: renamed from: c */
    public /* bridge */ /* synthetic */ zz.h getPickedFile() {
        return (zz.h) getPickedFile();
    }

    @Override // yu3.g.c
    /* JADX INFO: renamed from: d, reason: from getter */
    public boolean getScrollToPicker() {
        return this.scrollToPicker;
    }

    @Override // yu3.g.c
    /* JADX INFO: renamed from: e, reason: from getter */
    public g30.v getBottomSheetValue() {
        return this.bottomSheetValue;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Loading)) {
            return false;
        }
        Loading loading = (Loading) other;
        return fr.t.c(this.confirmationDocumentData, loading.confirmationDocumentData) && this.isValid == loading.isValid && this.action == loading.action;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public Void getPickedFile() {
        return this.pickedFile;
    }

    public int hashCode() {
        return (((this.confirmationDocumentData.hashCode() * 31) + Boolean.hashCode(this.isValid)) * 31) + this.action.hashCode();
    }

    @Override // yu3.g.c
    /* JADX INFO: renamed from: isValid, reason: from getter */
    public boolean getIsValid() {
        return this.isValid;
    }

    public String toString() {
        return "Loading(confirmationDocumentData=" + this.confirmationDocumentData + ", isValid=" + this.isValid + ", action=" + this.action + ')';
    }
}
