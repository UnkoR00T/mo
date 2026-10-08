package p036e4;

import c5.b;
import er.q;
import f3.m;
import g4.z;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: e4.l0, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ#\u0010\r\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\n¨\u0006\u0017"}, d2 = {"Le4/l0;", "Lg4/z;", "Lf3/m$c;", "Lkotlin/Function3;", "Le4/y0;", "Le4/v0;", "Lc5/b;", "Le4/x0;", "measureBlock", "<init>", "(Ler/q;)V", "measurable", CryptoServicesPermission.CONSTRAINTS, "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "", "toString", "()Ljava/lang/String;", "r", "Ler/q;", "getMeasureBlock", "()Ler/q;", "n3", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LayoutModifierImpl extends m.c implements z {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private q<? super y0, ? super v0, ? super b, ? extends x0> measureBlock;

    public LayoutModifierImpl(q<? super y0, ? super v0, ? super b, ? extends x0> qVar) {
        this.measureBlock = qVar;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        return this.measureBlock.w(y0Var, v0Var, b.a(j15));
    }

    public final void n3(q<? super y0, ? super v0, ? super b, ? extends x0> qVar) {
        this.measureBlock = qVar;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
