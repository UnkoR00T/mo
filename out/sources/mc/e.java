package mc;

import coil3.compose.AsyncImagePainter;
import n3.n1;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0018\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lmc/e;", "Lmc/b;", "Lcoil3/compose/AsyncImagePainter;", "painter", "Lf3/c;", "alignment", "Le4/l;", "contentScale", "", "alpha", "Ln3/n1;", "colorFilter", "", "clipToBounds", "", "contentDescription", "Llc/e;", "constraintSizeResolver", "<init>", "(Lcoil3/compose/AsyncImagePainter;Lf3/c;Le4/l;FLn3/n1;ZLjava/lang/String;Llc/e;)V", "Loq/i0;", "W2", "()V", "X2", "Y2", "z", "Lcoil3/compose/AsyncImagePainter;", "z3", "()Lcoil3/compose/AsyncImagePainter;", "coil-compose-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class e extends b {

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final AsyncImagePainter painter;

    public e(AsyncImagePainter asyncImagePainter, f3.c cVar, p036e4.l lVar, float f15, n1 n1Var, boolean z15, String str, lc.e eVar) {
        super(cVar, lVar, f15, n1Var, z15, str, eVar);
        this.painter = asyncImagePainter;
    }

    @Override // f3.m.c
    public void W2() {
        r3().K(M2());
        r3().c();
    }

    @Override // f3.m.c
    public void X2() {
        r3().e();
    }

    @Override // f3.m.c
    public void Y2() {
        r3().M(null);
    }

    @Override // mc.b
    /* JADX INFO: renamed from: z3, reason: from getter and merged with bridge method [inline-methods] */
    public AsyncImagePainter r3() {
        return this.painter;
    }
}
