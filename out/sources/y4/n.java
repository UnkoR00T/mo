package y4;

import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0007¨\u0006\f"}, d2 = {"Ly4/n;", "Ly4/q;", "<init>", "()V", "Lm2/f6;", "", "c", "()Lm2/f6;", "a", "Lm2/f6;", "loadState", "fontLoaded", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class n implements q {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private f6<Boolean> loadState;

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"y4/n$a", "Landroidx/emoji2/text/e$f;", "Loq/i0;", "b", "()V", "", "throwable", "a", "(Ljava/lang/Throwable;)V", "ui-text"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends androidx.emoji2.text.e.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a3<Boolean> f223827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n f223828b;

        a(a3<Boolean> a3Var, n nVar) {
            this.f223827a = a3Var;
            this.f223828b = nVar;
        }

        @Override // androidx.emoji2.text.e.f
        public void a(Throwable throwable) {
            this.f223828b.loadState = r.f223833a;
        }

        @Override // androidx.emoji2.text.e.f
        public void b() {
            this.f223827a.setValue(Boolean.TRUE);
            this.f223828b.loadState = new s(true);
        }
    }

    public n() {
        this.loadState = androidx.emoji2.text.e.k() ? c() : null;
    }

    private final f6<Boolean> c() {
        androidx.emoji2.text.e eVarC = androidx.emoji2.text.e.c();
        if (eVarC.g() == 1) {
            return new s(true);
        }
        a3 a3VarE = c6.e(Boolean.FALSE, null, 2, null);
        eVarC.v(new a(a3VarE, this));
        return a3VarE;
    }

    @Override // y4.q
    public f6<Boolean> a() {
        f6<Boolean> f6Var = this.loadState;
        if (f6Var != null) {
            return f6Var;
        }
        if (!androidx.emoji2.text.e.k()) {
            return r.f223833a;
        }
        f6<Boolean> f6VarC = c();
        this.loadState = f6VarC;
        return f6VarC;
    }
}
