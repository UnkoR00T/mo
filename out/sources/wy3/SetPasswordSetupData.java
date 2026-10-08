package wy3;

import fr.t;
import mx.Label;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: wy3.c, reason: from toString */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b \u0010\u001dR\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001b\u001a\u0004\b!\u0010\u001dR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b!\u0010\u001b\u001a\u0004\b\"\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\"\u0010\u0018\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u0018\u001a\u0004\b\u001e\u0010\u0019¨\u0006#"}, d2 = {"Lwy3/c;", "", "", "activateOrReactivateApp", "Lmx/a;", "topMenuTitle", "headerTitle", "headerMessage", "inputPasswordTitle", "inputRepeatPasswordTitle", "backButtonVisible", "closeButtonVisible", "<init>", "(ZLmx/a;Lmx/a;Lmx/a;Lmx/a;Lmx/a;ZZ)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "a", "Z", "()Z", "b", "Lmx/a;", "h", "()Lmx/a;", "c", "e", "d", "f", "g", "contract"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final /* data */ class SetPasswordSetupData {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean activateOrReactivateApp;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label topMenuTitle;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label headerTitle;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label headerMessage;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label inputPasswordTitle;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final Label inputRepeatPasswordTitle;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean backButtonVisible;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean closeButtonVisible;

    public SetPasswordSetupData(boolean z15, Label label, Label label2, Label label3, Label label4, Label label5, boolean z16, boolean z17) {
        this.activateOrReactivateApp = z15;
        this.topMenuTitle = label;
        this.headerTitle = label2;
        this.headerMessage = label3;
        this.inputPasswordTitle = label4;
        this.inputRepeatPasswordTitle = label5;
        this.backButtonVisible = z16;
        this.closeButtonVisible = z17;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final boolean getActivateOrReactivateApp() {
        return this.activateOrReactivateApp;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final boolean getBackButtonVisible() {
        return this.backButtonVisible;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getCloseButtonVisible() {
        return this.closeButtonVisible;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Label getHeaderMessage() {
        return this.headerMessage;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final Label getHeaderTitle() {
        return this.headerTitle;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SetPasswordSetupData)) {
            return false;
        }
        SetPasswordSetupData setPasswordSetupData = (SetPasswordSetupData) other;
        return this.activateOrReactivateApp == setPasswordSetupData.activateOrReactivateApp && t.c(this.topMenuTitle, setPasswordSetupData.topMenuTitle) && t.c(this.headerTitle, setPasswordSetupData.headerTitle) && t.c(this.headerMessage, setPasswordSetupData.headerMessage) && t.c(this.inputPasswordTitle, setPasswordSetupData.inputPasswordTitle) && t.c(this.inputRepeatPasswordTitle, setPasswordSetupData.inputRepeatPasswordTitle) && this.backButtonVisible == setPasswordSetupData.backButtonVisible && this.closeButtonVisible == setPasswordSetupData.closeButtonVisible;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final Label getInputPasswordTitle() {
        return this.inputPasswordTitle;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final Label getInputRepeatPasswordTitle() {
        return this.inputRepeatPasswordTitle;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final Label getTopMenuTitle() {
        return this.topMenuTitle;
    }

    public int hashCode() {
        int iHashCode = Boolean.hashCode(this.activateOrReactivateApp) * 31;
        Label label = this.topMenuTitle;
        return ((((((((((((iHashCode + (label == null ? 0 : label.hashCode())) * 31) + this.headerTitle.hashCode()) * 31) + this.headerMessage.hashCode()) * 31) + this.inputPasswordTitle.hashCode()) * 31) + this.inputRepeatPasswordTitle.hashCode()) * 31) + Boolean.hashCode(this.backButtonVisible)) * 31) + Boolean.hashCode(this.closeButtonVisible);
    }

    public String toString() {
        return "SetPasswordSetupData(activateOrReactivateApp=" + this.activateOrReactivateApp + ", topMenuTitle=" + this.topMenuTitle + ", headerTitle=" + this.headerTitle + ", headerMessage=" + this.headerMessage + ", inputPasswordTitle=" + this.inputPasswordTitle + ", inputRepeatPasswordTitle=" + this.inputRepeatPasswordTitle + ", backButtonVisible=" + this.backButtonVisible + ", closeButtonVisible=" + this.closeButtonVisible + ")";
    }
}
