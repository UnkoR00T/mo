package p079n1;

import c5.b;
import c5.n;
import er.a;
import er.l;
import java.util.List;
import oq.i0;
import oq.r;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\u000e\u001a\u00020\r*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Ln1/v3;", "Le4/w0;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "<init>", "(Ler/a;)V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "a", "Ler/a;", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v3 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final a<Boolean> shouldMeasureLinks;

    public v3(a<Boolean> aVar) {
        this.shouldMeasureLinks = aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(List list, v3 v3Var, a2.a aVar) {
        List listI = k0.I(list, v3Var.shouldMeasureLinks);
        if (listI != null) {
            int size = listI.size();
            for (int i15 = 0; i15 < size; i15++) {
                r rVar = (r) listI.get(i15);
                a2 a2Var = (a2) rVar.a();
                a aVar2 = (a) rVar.b();
                a2.a.G(aVar, a2Var, aVar2 != null ? ((n) aVar2.a()).getPackedValue() : n.INSTANCE.b(), 0.0f, 2, null);
            }
        }
        return i0.f148189a;
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, final List<? extends v0> list, long j15) {
        return y0.j2(y0Var, b.l(j15), b.k(j15), null, new l() { // from class: n1.u3
            @Override // er.l
            public final Object b(Object obj) {
                return v3.b(list, this, (a2.a) obj);
            }
        }, 4, null);
    }
}
