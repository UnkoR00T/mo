package v00;

import er.p;
import fy.Page;
import fy.b;
import fy.c;
import ju.g1;
import ju.p0;
import mu.b0;
import mu.g;
import mu.i;
import mu.r0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\r\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0004J\r\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\u0004J\u0019\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\b¢\u0006\u0004\b\n\u0010\u000bJ*\u0010\u0011\u001a\u0014\u0012\u0004\u0012\u00020\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00100\u000e2\u0006\u0010\r\u001a\u00020\fH¦@¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\t0\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0014R\u0014\u0010\u0019\u001a\u00020\u00168&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Lv00/a;", "T", "", "<init>", "()V", "Loq/i0;", "b", "reset", "Lmu/g;", "Lfy/c;", "a", "()Lmu/g;", "Lfy/b;", "pageIndex", "Ldx/i;", "Ldx/b;", "Lfy/a;", "e", "(Lfy/b;Ltq/e;)Ljava/lang/Object;", "Lmu/b0;", "Lmu/b0;", "state", "Lju/p0;", "f", "()Lju/p0;", "scope", "paging_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class a<T> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b0<c<T>> state = r0.a(new c.Initial(new Page(null, null, 3, null)));

    /* JADX INFO: renamed from: v00.a$a, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C5271a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f202941e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f202942f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f202943g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f202944h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f202945j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ a<T> f202946k;

        /* JADX INFO: renamed from: v00.a$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class C5272a extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f202947e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<T> f202948f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ dx.b f202949g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C5272a(a<T> aVar, dx.b bVar, e<? super C5272a> eVar) {
                super(2, eVar);
                this.f202948f = aVar;
                this.f202949g = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f202947e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                ((a) this.f202948f).state.setValue(new c.Error(((c) ((a) this.f202948f).state.getValue()).getPage(), this.f202949g));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((C5272a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new C5272a(this.f202948f, this.f202949g, eVar);
            }
        }

        /* JADX INFO: renamed from: v00.a$a$b */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class b extends k implements p<p0, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f202950e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<T> f202951f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ Page<T> f202952g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a<T> aVar, Page<T> page, e<? super b> eVar) {
                super(2, eVar);
                this.f202951f = aVar;
                this.f202952g = page;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f202950e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                ((a) this.f202951f).state.setValue(new c.Content(new Page(v.L0(((c) ((a) this.f202951f).state.getValue()).getPage().a(), this.f202952g.a()), this.f202952g.getNextPage())));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, e<? super i0> eVar) {
                return ((b) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                return new b(this.f202951f, this.f202952g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5271a(a<T> aVar, e<? super C5271a> eVar) {
            super(2, eVar);
            this.f202946k = aVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x0081, code lost:
        
            if (ju.i.g(r4, r7, r8) == r0) goto L25;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00b0, code lost:
        
            if (ju.i.g(r4, r7, r8) == r0) goto L25;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
            /*
                r8 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r8.f202945j
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L2b
                if (r1 == r3) goto L1e
                if (r1 != r2) goto L16
                java.lang.Object r0 = r8.f202942f
                fy.a r0 = (fy.Page) r0
                goto L22
            L16:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1e:
                java.lang.Object r0 = r8.f202942f
                dx.b r0 = (dx.b) r0
            L22:
                java.lang.Object r0 = r8.f202941e
                dx.i r0 = (dx.i) r0
                oq.u.b(r9)
                goto Lb3
            L2b:
                oq.u.b(r9)
                goto L4f
            L2f:
                oq.u.b(r9)
                v00.a<T> r9 = r8.f202946k
                mu.b0 r1 = v00.a.d(r9)
                java.lang.Object r1 = r1.getValue()
                fy.c r1 = (fy.c) r1
                fy.a r1 = r1.getPage()
                fy.b r1 = r1.getNextPage()
                r8.f202945j = r4
                java.lang.Object r9 = r9.e(r1, r8)
                if (r9 != r0) goto L4f
                goto Lb2
            L4f:
                dx.i r9 = (dx.i) r9
                v00.a<T> r1 = r8.f202946k
                boolean r4 = r9 instanceof dx.i.Left
                r5 = 0
                r6 = 0
                if (r4 == 0) goto L84
                r2 = r9
                dx.i$b r2 = (dx.i.Left) r2
                java.lang.Object r2 = r2.b()
                dx.b r2 = (dx.b) r2
                ju.n2 r4 = ju.g1.c()
                v00.a$a$a r7 = new v00.a$a$a
                r7.<init>(r1, r2, r5)
                java.lang.Object r9 = vq.j.a(r9)
                r8.f202941e = r9
                java.lang.Object r9 = vq.j.a(r2)
                r8.f202942f = r9
                r8.f202943g = r6
                r8.f202944h = r6
                r8.f202945j = r3
                java.lang.Object r9 = ju.i.g(r4, r7, r8)
                if (r9 != r0) goto Lb3
                goto Lb2
            L84:
                boolean r3 = r9 instanceof dx.i.Right
                if (r3 == 0) goto Lb6
                r3 = r9
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                fy.a r3 = (fy.Page) r3
                ju.n2 r4 = ju.g1.c()
                v00.a$a$b r7 = new v00.a$a$b
                r7.<init>(r1, r3, r5)
                java.lang.Object r9 = vq.j.a(r9)
                r8.f202941e = r9
                java.lang.Object r9 = vq.j.a(r3)
                r8.f202942f = r9
                r8.f202943g = r6
                r8.f202944h = r6
                r8.f202945j = r2
                java.lang.Object r9 = ju.i.g(r4, r7, r8)
                if (r9 != r0) goto Lb3
            Lb2:
                return r0
            Lb3:
                oq.i0 r9 = oq.i0.f148189a
                return r9
            Lb6:
                oq.p r9 = new oq.p
                r9.<init>()
                throw r9
            */
            throw new UnsupportedOperationException("Method not decompiled: v00.a.C5271a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((C5271a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new C5271a(this.f202946k, eVar);
        }
    }

    public final g<c<T>> a() {
        return i.b(this.state);
    }

    public final void b() {
        if ((this.state.getValue().getPage().getNextPage() instanceof b.c) || (this.state.getValue() instanceof c.Loading)) {
            return;
        }
        this.state.setValue(new c.Loading(this.state.getValue().getPage()));
        ju.k.d(getScope(), g1.b(), null, new C5271a(this, null), 2, null);
    }

    public abstract Object e(b bVar, e<? super dx.i<? extends dx.b, Page<T>>> eVar);

    /* JADX INFO: renamed from: f */
    public abstract p0 getScope();

    public final void reset() {
        this.state.setValue(new c.Initial(new Page(null, null, 3, null)));
    }
}
