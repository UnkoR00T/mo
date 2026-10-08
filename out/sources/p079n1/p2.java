package p079n1;

import c5.b;
import er.l;
import java.util.List;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.a2;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÂ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Ln1/p2;", "Le4/w0;", "<init>", "()V", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Lkotlin/Function1;", "Le4/a2$a;", "Loq/i0;", "b", "Ler/l;", "placementBlock", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class p2 implements w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final p2 f130314a = new p2();

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final l<a2.a, i0> placementBlock = new l() { // from class: n1.o2
        @Override // er.l
        public final Object b(Object obj) {
            return p2.b((a2.a) obj);
        }
    };

    private p2() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b(a2.a aVar) {
        return i0.f148189a;
    }

    @Override // p036e4.w0
    public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
        return y0.j2(y0Var, b.l(j15), b.k(j15), null, placementBlock, 4, null);
    }
}
