package f1;

import p071kotlin.Metadata;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B;\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0096\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\"\u0010\u001f\u001a\u0004\b#\u0010!R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006("}, d2 = {"Lf1/d1;", "Lg4/l0;", "Lf1/f1;", "", "fraction", "Lm2/f6;", "", "widthState", "heightState", "", "inspectorName", "<init>", "(FLm2/f6;Lm2/f6;Ljava/lang/String;)V", "a", "()Lf1/f1;", "node", "Loq/i0;", "l", "(Lf1/f1;)V", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "d", "F", "getFraction", "()F", "e", "Lm2/f6;", "getWidthState", "()Lm2/f6;", "f", "getHeightState", "g", "Ljava/lang/String;", "getInspectorName", "()Ljava/lang/String;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class d1 extends g4.l0<f1> {

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final float fraction;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final f6<Integer> widthState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final f6<Integer> heightState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final String inspectorName;

    public d1(float f15, f6<Integer> f6Var, f6<Integer> f6Var2, String str) {
        this.fraction = f15;
        this.widthState = f6Var;
        this.heightState = f6Var2;
        this.inspectorName = str;
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public f1 create() {
        return new f1(this.fraction, this.widthState, this.heightState);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof d1)) {
            return false;
        }
        d1 d1Var = (d1) other;
        return this.fraction == d1Var.fraction && fr.t.c(this.widthState, d1Var.widthState) && fr.t.c(this.heightState, d1Var.heightState);
    }

    public int hashCode() {
        f6<Integer> f6Var = this.widthState;
        int iHashCode = (f6Var != null ? f6Var.hashCode() : 0) * 31;
        f6<Integer> f6Var2 = this.heightState;
        return ((iHashCode + (f6Var2 != null ? f6Var2.hashCode() : 0)) * 31) + Float.hashCode(this.fraction);
    }

    @Override // g4.l0
    /* JADX INFO: renamed from: l, reason: merged with bridge method [inline-methods] */
    public void update(f1 node) {
        node.p3(this.fraction);
        node.r3(this.widthState);
        node.q3(this.heightState);
    }

    public /* synthetic */ d1(float f15, f6 f6Var, f6 f6Var2, String str, int i15, fr.k kVar) {
        this(f15, (i15 & 2) != 0 ? null : f6Var, (i15 & 4) != 0 ? null : f6Var2, str);
    }
}
