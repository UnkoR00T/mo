package g4;

import androidx.compose.ui.node.Owner;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\u000bJ\u001f\u0010\u000e\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\tH\u0014¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0017\u0010\u0015¨\u0006\u0018"}, d2 = {"Lg4/s1;", "Lm2/a;", "Landroidx/compose/ui/node/g;", "root", "<init>", "(Landroidx/compose/ui/node/g;)V", "", "index", "instance", "Loq/i0;", "r", "(ILandroidx/compose/ui/node/g;)V", "q", "count", "b", "(II)V", "from", "to", "c", "(III)V", "n", "()V", "e", "h", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class s1 extends p076m2.a<androidx.compose.ui.node.g> {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f70384e = p076m2.a.f122777d;

    public s1(androidx.compose.ui.node.g gVar) {
        super(gVar);
    }

    @Override // p076m2.c
    public void b(int index, int count) {
        a().D1(index, count);
    }

    @Override // p076m2.c
    public void c(int from, int to4, int count) {
        a().t1(from, to4, count);
    }

    @Override // p076m2.c
    public void e() {
        super.e();
        Owner owner = l().getOwner();
        if (owner != null) {
            owner.K();
        }
    }

    @Override // p076m2.c
    public void h() {
        a().o();
    }

    @Override // p076m2.a
    protected void n() {
        l().C1();
    }

    @Override // p076m2.c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void f(int index, androidx.compose.ui.node.g instance) {
        a().Q0(index, instance);
    }

    @Override // p076m2.c
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public void d(int index, androidx.compose.ui.node.g instance) {
    }
}
