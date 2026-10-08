package x1;

import p071kotlin.Metadata;
import p079n1.s3;
import z1.c2;

/* JADX INFO: renamed from: x1.f1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lx1/f1;", "Lg4/l0;", "Lx1/g1;", "Lx1/k1;", "serviceAdapter", "Ln1/s3;", "legacyTextFieldState", "Lz1/c2;", "textFieldSelectionManager", "<init>", "(Lx1/k1;Ln1/s3;Lz1/c2;)V", "a", "()Lx1/g1;", "node", "Loq/i0;", "l", "(Lx1/g1;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "d", "Lx1/k1;", "getServiceAdapter", "()Lx1/k1;", "e", "Ln1/s3;", "getLegacyTextFieldState", "()Ln1/s3;", "f", "Lz1/c2;", "getTextFieldSelectionManager", "()Lz1/c2;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final /* data */ class LegacyAdaptingPlatformTextInputModifier extends g4.l0<g1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final k1 serviceAdapter;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final s3 legacyTextFieldState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final c2 textFieldSelectionManager;

    public LegacyAdaptingPlatformTextInputModifier(k1 k1Var, s3 s3Var, c2 c2Var) {
        this.serviceAdapter = k1Var;
        this.legacyTextFieldState = s3Var;
        this.textFieldSelectionManager = c2Var;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public g1 create() {
        return new g1(this.serviceAdapter, this.legacyTextFieldState, this.textFieldSelectionManager);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LegacyAdaptingPlatformTextInputModifier)) {
            return false;
        }
        LegacyAdaptingPlatformTextInputModifier legacyAdaptingPlatformTextInputModifier = (LegacyAdaptingPlatformTextInputModifier) other;
        return fr.t.c(this.serviceAdapter, legacyAdaptingPlatformTextInputModifier.serviceAdapter) && fr.t.c(this.legacyTextFieldState, legacyAdaptingPlatformTextInputModifier.legacyTextFieldState) && fr.t.c(this.textFieldSelectionManager, legacyAdaptingPlatformTextInputModifier.textFieldSelectionManager);
    }

    public int hashCode() {
        return (((this.serviceAdapter.hashCode() * 31) + this.legacyTextFieldState.hashCode()) * 31) + this.textFieldSelectionManager.hashCode();
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(g1 node) {
        node.p3(this.serviceAdapter);
        node.o3(this.legacyTextFieldState);
        node.q3(this.textFieldSelectionManager);
    }

    public String toString() {
        return "LegacyAdaptingPlatformTextInputModifier(serviceAdapter=" + this.serviceAdapter + ", legacyTextFieldState=" + this.legacyTextFieldState + ", textFieldSelectionManager=" + this.textFieldSelectionManager + ')';
    }
}
