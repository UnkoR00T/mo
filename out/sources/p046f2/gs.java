package p046f2;

import androidx.compose.ui.platform.v1;
import androidx.compose.ui.platform.w1;
import er.l;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.k0;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\b\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0004\b\t\u0010\nJ#\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00032\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lf2/gs;", "Le4/k0;", "Landroidx/compose/ui/platform/w1;", "", "visible", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/v1;", "Loq/i0;", "inspectorInfo", "<init>", "(ZLer/l;)V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "e", "Z", "getVisible", "()Z", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class gs extends w1 implements k0 {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final boolean visible;

    public gs(boolean z15, l<? super v1, i0> lVar) {
        super(lVar);
        this.visible = z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m(a2.a aVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o(a2 a2Var, a2.a aVar) {
        a2.a.E(aVar, a2Var, 0, 0, 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // p036e4.k0
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        final a2 a2VarO0 = v0Var.o0(j15);
        return !this.visible ? y0.j2(y0Var, 0, 0, null, new l() { // from class: f2.es
            @Override // er.l
            public final Object b(Object obj) {
                return gs.m((a2.a) obj);
            }
        }, 4, null) : y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new l() { // from class: f2.fs
            @Override // er.l
            public final Object b(Object obj) {
                return gs.o(a2VarO0, (a2.a) obj);
            }
        }, 4, null);
    }

    public boolean equals(Object other) {
        gs gsVar = other instanceof gs ? (gs) other : null;
        return gsVar != null && this.visible == gsVar.visible;
    }

    public int hashCode() {
        return Boolean.hashCode(this.visible);
    }
}
