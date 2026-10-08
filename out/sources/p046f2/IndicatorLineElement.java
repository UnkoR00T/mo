package p046f2;

import androidx.compose.material3.c;
import b1.j;
import c5.h;
import fr.k;
import fr.t;
import g4.l0;
import n3.y2;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f2.bd, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BC\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00032\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u0005\u0010$R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b2\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u000e\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b6\u00103\u001a\u0004\b7\u00105¨\u00068"}, d2 = {"Lf2/bd;", "Lg4/l0;", "Landroidx/compose/material3/c;", "", "enabled", "isError", "Lb1/j;", "interactionSource", "Lf2/hn;", "colors", "Ln3/y2;", "textFieldShape", "Lc5/h;", "focusedIndicatorLineThickness", "unfocusedIndicatorLineThickness", "<init>", "(ZZLb1/j;Lf2/hn;Ln3/y2;FFLfr/k;)V", "a", "()Landroidx/compose/material3/c;", "node", "Loq/i0;", "l", "(Landroidx/compose/material3/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "d", "Z", "getEnabled", "()Z", "e", "f", "Lb1/j;", "getInteractionSource", "()Lb1/j;", "g", "Lf2/hn;", "getColors", "()Lf2/hn;", "h", "Ln3/y2;", "getTextFieldShape", "()Ln3/y2;", "i", "F", "getFocusedIndicatorLineThickness-D9Ej5fM", "()F", "j", "getUnfocusedIndicatorLineThickness-D9Ej5fM", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IndicatorLineElement extends l0<c> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean enabled;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean isError;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final j interactionSource;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final hn colors;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final y2 textFieldShape;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final float focusedIndicatorLineThickness;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final float unfocusedIndicatorLineThickness;

    public /* synthetic */ IndicatorLineElement(boolean z15, boolean z16, j jVar, hn hnVar, y2 y2Var, float f15, float f16, k kVar) {
        this(z15, z16, jVar, hnVar, y2Var, f15, f16);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public c create() {
        return new c(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IndicatorLineElement)) {
            return false;
        }
        IndicatorLineElement indicatorLineElement = (IndicatorLineElement) other;
        return this.enabled == indicatorLineElement.enabled && this.isError == indicatorLineElement.isError && t.c(this.interactionSource, indicatorLineElement.interactionSource) && t.c(this.colors, indicatorLineElement.colors) && t.c(this.textFieldShape, indicatorLineElement.textFieldShape) && h.p(this.focusedIndicatorLineThickness, indicatorLineElement.focusedIndicatorLineThickness) && h.p(this.unfocusedIndicatorLineThickness, indicatorLineElement.unfocusedIndicatorLineThickness);
    }

    public int hashCode() {
        int iHashCode = ((((Boolean.hashCode(this.enabled) * 31) + Boolean.hashCode(this.isError)) * 31) + this.interactionSource.hashCode()) * 31;
        hn hnVar = this.colors;
        int iHashCode2 = (iHashCode + (hnVar == null ? 0 : hnVar.hashCode())) * 31;
        y2 y2Var = this.textFieldShape;
        return ((((iHashCode2 + (y2Var != null ? y2Var.hashCode() : 0)) * 31) + h.q(this.focusedIndicatorLineThickness)) * 31) + h.q(this.unfocusedIndicatorLineThickness);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(c node) {
        node.N3(this.enabled, this.isError, this.interactionSource, this.colors, this.textFieldShape, this.focusedIndicatorLineThickness, this.unfocusedIndicatorLineThickness);
    }

    public String toString() {
        return "IndicatorLineElement(enabled=" + this.enabled + ", isError=" + this.isError + ", interactionSource=" + this.interactionSource + ", colors=" + this.colors + ", textFieldShape=" + this.textFieldShape + ", focusedIndicatorLineThickness=" + ((Object) h.r(this.focusedIndicatorLineThickness)) + ", unfocusedIndicatorLineThickness=" + ((Object) h.r(this.unfocusedIndicatorLineThickness)) + ')';
    }

    private IndicatorLineElement(boolean z15, boolean z16, j jVar, hn hnVar, y2 y2Var, float f15, float f16) {
        this.enabled = z15;
        this.isError = z16;
        this.interactionSource = jVar;
        this.colors = hnVar;
        this.textFieldShape = y2Var;
        this.focusedIndicatorLineThickness = f15;
        this.unfocusedIndicatorLineThickness = f16;
    }
}
