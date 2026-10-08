package d1;

import android.view.View;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\u000bJ!\u0010\r\u001a\u00020\t2\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\r\u0010\bR\"\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR$\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Ld1/v3;", "Ld1/v1;", "Lg4/z;", "Lkotlin/Function1;", "Ld1/e4;", "Ld1/c4;", "insetsGetter", "<init>", "(Ler/l;)V", "Loq/i0;", "W2", "()V", "X2", "A3", "v", "Ler/l;", "w", "Ld1/e4;", "getWindowInsetsHolder", "()Ld1/e4;", "setWindowInsetsHolder", "(Ld1/e4;)V", "windowInsetsHolder", "foundation-layout"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class v3 extends v1 implements g4.z {

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.l<? super e4, ? extends c4> insetsGetter;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private e4 windowInsetsHolder;

    public v3(er.l<? super e4, ? extends c4> lVar) {
        super(f4.a());
        this.insetsGetter = lVar;
    }

    public final void A3(er.l<? super e4, ? extends c4> insetsGetter) {
        if (this.insetsGetter != insetsGetter) {
            this.insetsGetter = insetsGetter;
            e4 e4Var = this.windowInsetsHolder;
            if (e4Var != null) {
                z3(insetsGetter.b(e4Var));
            }
        }
    }

    @Override // d1.r1, f3.m.c
    public void W2() {
        View viewA = g4.i.a(this);
        e4 e4VarF = e4.INSTANCE.f(viewA);
        e4VarF.p(viewA);
        z3(this.insetsGetter.b(e4VarF));
        this.windowInsetsHolder = e4VarF;
        super.W2();
    }

    @Override // d1.r1, f3.m.c
    public void X2() {
        View viewA = g4.i.a(this);
        e4 e4Var = this.windowInsetsHolder;
        if (e4Var != null) {
            e4Var.b(viewA);
        }
        super.X2();
    }
}
