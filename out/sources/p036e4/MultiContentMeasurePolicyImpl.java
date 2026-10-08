package p036e4;

import androidx.compose.ui.node.o;
import fr.t;
import java.util.List;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e4.d1, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0081\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J)\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00100\u00072\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014J\u0010\u0010\u001a\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006'"}, d2 = {"Le4/d1;", "Le4/w0;", "Le4/c1;", "measurePolicy", "<init>", "(Le4/c1;)V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "c", "(Le4/w;Ljava/util/List;I)I", "width", "h", "i", "f", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Le4/c1;", "getMeasurePolicy", "()Le4/c1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class MultiContentMeasurePolicyImpl implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final c1 measurePolicy;

    public MultiContentMeasurePolicyImpl(c1 c1Var) {
        this.measurePolicy = c1Var;
    }

    @Override // p036e4.w0
    public int c(w wVar, List<? extends v> list, int i15) {
        return this.measurePolicy.c(wVar, o.a(wVar), i15);
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        return this.measurePolicy.e(y0Var, o.a(y0Var), j15);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MultiContentMeasurePolicyImpl) && t.c(this.measurePolicy, ((MultiContentMeasurePolicyImpl) other).measurePolicy);
    }

    @Override // p036e4.w0
    public int f(w wVar, List<? extends v> list, int i15) {
        return this.measurePolicy.f(wVar, o.a(wVar), i15);
    }

    @Override // p036e4.w0
    public int h(w wVar, List<? extends v> list, int i15) {
        return this.measurePolicy.h(wVar, o.a(wVar), i15);
    }

    public int hashCode() {
        return this.measurePolicy.hashCode();
    }

    @Override // p036e4.w0
    public int i(w wVar, List<? extends v> list, int i15) {
        return this.measurePolicy.i(wVar, o.a(wVar), i15);
    }

    public String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.measurePolicy + ')';
    }
}
