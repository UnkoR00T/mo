package d1;

import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\"\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J#\u0010\n\u001a\u00020\b*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH&¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\r\u001a\u00020\f*\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0013\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J#\u0010\u0017\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0014J#\u0010\u0018\u001a\u00020\u0011*\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u00102\u0006\u0010\u0015\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0018\u0010\u0014R\u0014\u0010\u001c\u001a\u00020\u00198&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ld1/e2;", "Lg4/z;", "Lf3/m$c;", "<init>", "()V", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "o3", "(Le4/y0;Le4/v0;J)J", "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "Le4/w;", "Le4/v;", "", "height", "K", "(Le4/w;Le4/v;I)I", "width", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "k", "O", "", "p3", "()Z", "enforceIncoming", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
abstract class e2 extends f3.m.c implements g4.z {
    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 q3(p036e4.a2 a2Var, e4.a2.a aVar) {
        e4.a2.a.O(aVar, a2Var, c5.n.INSTANCE.b(), 0.0f, 2, null);
        return oq.i0.f148189a;
    }

    @Override // g4.z
    public int H(p036e4.w wVar, p036e4.v vVar, int i15) {
        return vVar.U(i15);
    }

    @Override // g4.z
    public int K(p036e4.w wVar, p036e4.v vVar, int i15) {
        return vVar.e0(i15);
    }

    @Override // g4.z
    public int O(p036e4.w wVar, p036e4.v vVar, int i15) {
        return vVar.n(i15);
    }

    @Override // g4.z
    public final p036e4.x0 c(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15) {
        long jO3 = o3(y0Var, v0Var, j15);
        if (getEnforceIncoming()) {
            jO3 = c5.c.e(j15, jO3);
        }
        final p036e4.a2 a2VarO0 = v0Var.o0(jO3);
        return p036e4.y0.j2(y0Var, a2VarO0.getWidth(), a2VarO0.getHeight(), null, new er.l() { // from class: d1.d2
            @Override // er.l
            public final Object b(Object obj) {
                return e2.q3(a2VarO0, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    @Override // g4.z
    public int k(p036e4.w wVar, p036e4.v vVar, int i15) {
        return vVar.m0(i15);
    }

    public abstract long o3(p036e4.y0 y0Var, p036e4.v0 v0Var, long j15);

    /* JADX INFO: renamed from: p3 */
    public abstract boolean getEnforceIncoming();
}
