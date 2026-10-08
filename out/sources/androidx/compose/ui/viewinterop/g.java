package androidx.compose.ui.viewinterop;

import er.p;
import fr.w;
import ju.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B5\u0012,\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\f\u0010\u000bJ;\u0010\r\u001a\u00020\u00042,\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u0006¢\u0006\u0004\b\r\u0010\tRH\u0010\u0007\u001a(\u0012\u001a\u0012\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002j\u0004\u0018\u0001`\u0005\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\tR)\u0010\u0015\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0012\u0004\u0012\u00020\u00040\u0002j\u0002`\u00058\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u000f\u001a\u0004\b\u0014\u0010\u0011¨\u0006\u0016"}, d2 = {"Landroidx/compose/ui/viewinterop/g;", "Lf3/m$c;", "Lkotlin/Function1;", "Lm3/g;", "Loq/i0;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "Landroidx/compose/ui/viewinterop/OnRequesterReady;", "onRequesterReady", "<init>", "(Ler/l;)V", "W2", "()V", "X2", "n3", "r", "Ler/l;", "getOnRequesterReady", "()Ler/l;", "setOnRequesterReady", "s", "getRequester", "requester", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
final class g extends f3.m.c {

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private er.l<? super er.l<? super m3.g, i0>, i0> onRequesterReady;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final er.l<m3.g, i0> requester = new a();

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm3/g;", "rect", "Loq/i0;", "c", "(Lm3/g;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends w implements er.l<m3.g, i0> {

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.g$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0238a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f11003e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ g f11004f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ m3.g f11005g;

            /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.g$a$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lm3/g;", "c", "()Lm3/g;"}, k = 3, mv = {2, 1, 0})
            static final class C0239a extends w implements er.a<m3.g> {

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ m3.g f11006b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0239a(m3.g gVar) {
                    super(0);
                    this.f11006b = gVar;
                }

                @Override // er.a
                /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
                public final m3.g a() {
                    return this.f11006b;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0238a(g gVar, m3.g gVar2, tq.e<? super C0238a> eVar) {
                super(2, eVar);
                this.f11004f = gVar;
                this.f11005g = gVar2;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f11003e;
                if (i15 == 0) {
                    u.b(obj);
                    g gVar = this.f11004f;
                    C0239a c0239a = new C0239a(this.f11005g);
                    this.f11003e = 1;
                    if (k4.b.a(gVar, c0239a, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C0238a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new C0238a(this.f11004f, this.f11005g, eVar);
            }
        }

        a() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(m3.g gVar) {
            c(gVar);
            return i0.f148189a;
        }

        public final void c(m3.g gVar) {
            if (g.this.getIsAttached()) {
                ju.k.d(g.this.M2(), null, null, new C0238a(g.this, gVar, null), 3, null);
            }
        }
    }

    public g(er.l<? super er.l<? super m3.g, i0>, i0> lVar) {
        this.onRequesterReady = lVar;
    }

    @Override // f3.m.c
    public void W2() {
        this.onRequesterReady.b(this.requester);
    }

    @Override // f3.m.c
    public void X2() {
        this.onRequesterReady.b(null);
    }

    public final void n3(er.l<? super er.l<? super m3.g, i0>, i0> onRequesterReady) {
        this.onRequesterReady = onRequesterReady;
        if (getIsAttached()) {
            onRequesterReady.b(this.requester);
        }
    }
}
