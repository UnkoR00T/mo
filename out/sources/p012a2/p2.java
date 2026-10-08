package p012a2;

import c5.k;
import er.l;
import f3.m;
import g4.e;
import g4.f;
import g4.z;
import hr.a;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J#\u0010\f\u001a\u00020\u000b*\u00020\u00062\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"La2/p2;", "Lf3/m$c;", "Lg4/e;", "Lg4/z;", "<init>", "()V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "material"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class p2 extends m.c implements e, z {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f1862r = m.c.f58748q;

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o3(int i15, a2 a2Var, int i16, a2.a aVar) {
        a2.a.E(aVar, a2Var, a.d((i15 - a2Var.getWidth()) / 2.0f), a.d((i16 - a2Var.getHeight()) / 2.0f), 0.0f, 4, null);
        return i0.f148189a;
    }

    @Override // g4.z
    public x0 c(y0 y0Var, v0 v0Var, long j15) {
        boolean z15 = getIsAttached() && ((Boolean) f.a(this, j2.d())).booleanValue();
        long j16 = j2.f1725c;
        final a2 a2VarO0 = v0Var.o0(j15);
        final int iMax = z15 ? Math.max(a2VarO0.getWidth(), y0Var.X0(k.j(j16))) : a2VarO0.getWidth();
        final int iMax2 = z15 ? Math.max(a2VarO0.getHeight(), y0Var.X0(k.i(j16))) : a2VarO0.getHeight();
        return y0.j2(y0Var, iMax, iMax2, null, new l() { // from class: a2.o2
            @Override // er.l
            public final Object b(Object obj) {
                return p2.o3(iMax, a2VarO0, iMax2, (a2.a) obj);
            }
        }, 4, null);
    }
}
