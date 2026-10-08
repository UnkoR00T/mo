package l10;

import er.p;
import er.q;
import k10.c0;
import k10.o;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u0000*\u0004\b\u0000\u0010\u0001*\b\b\u0001\u0010\u0002*\u00028\u0002*\b\b\u0002\u0010\u0004*\u00020\u0003*\b\b\u0003\u0010\u0005*\u00020\u00032\u0014\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006Ba\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u00124\u0010\u0011\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0017\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\t2\u0016\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00028\u00020\u0014j\b\u0012\u0004\u0012\u00028\u0002`\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R \u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u0019\u0010\u001bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001cR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eRB\u0010\u0011\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u000e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u00100\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u00030\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, d2 = {"Ll10/b;", "T", "InputState", "", ip.a.f96137b, "A", "Ll10/h;", "Ll10/h$a;", "isInState", "Lmu/g;", "flow", "Lk10/o;", "executionPolicy", "Lkotlin/Function3;", "Lk10/c0;", "Ltq/e;", "Lk10/l;", "handler", "<init>", "(Ll10/h$a;Lmu/g;Lk10/o;Ler/q;)V", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "b", "(Ler/a;)Lmu/g;", "a", "Ll10/h$a;", "()Ll10/h$a;", "Lmu/g;", "c", "Lk10/o;", "d", "Ler/q;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b<T, InputState extends S, S, A> extends h<InputState, S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.a<S> isInState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final mu.g<T> flow;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final o executionPolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final q<T, c0<InputState>, tq.e<? super k10.l<? extends S>>, Object> handler;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00050\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, d2 = {"", ip.a.f96137b, "T", "item", "Lmu/g;", "Lk10/l;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<T, tq.e<? super mu.g<? extends k10.l<? extends S>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f114014e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f114015f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b<T, InputState, S, A> f114016g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.a<S> f114017h;

        /* JADX INFO: renamed from: l10.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {ip.a.f96137b, "Lmu/h;", "Lk10/l;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
        public static final class C2767a extends vq.k implements p<mu.h<? super k10.l<? extends S>>, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f114018e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f114019f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f114020g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f114021h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            Object f114022j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            Object f114023k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            Object f114024l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f114025m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            int f114026n;

            /* JADX INFO: renamed from: p, reason: collision with root package name */
            int f114027p;

            /* JADX INFO: renamed from: q, reason: collision with root package name */
            private /* synthetic */ Object f114028q;

            /* JADX INFO: renamed from: r, reason: collision with root package name */
            final /* synthetic */ h f114029r;

            /* JADX INFO: renamed from: s, reason: collision with root package name */
            final /* synthetic */ er.a f114030s;

            /* JADX INFO: renamed from: t, reason: collision with root package name */
            final /* synthetic */ b f114031t;

            /* JADX INFO: renamed from: v, reason: collision with root package name */
            final /* synthetic */ Object f114032v;

            /* JADX INFO: renamed from: w, reason: collision with root package name */
            Object f114033w;

            /* JADX INFO: renamed from: x, reason: collision with root package name */
            int f114034x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2767a(h hVar, er.a aVar, tq.e eVar, b bVar, Object obj) {
                super(2, eVar);
                this.f114029r = hVar;
                this.f114030s = aVar;
                this.f114031t = bVar;
                this.f114032v = obj;
            }

            /* JADX WARN: Code restructure failed: missing block: B:17:0x00f5, code lost:
            
                if (r0.F(r13, r12) == r1) goto L18;
             */
            /* JADX WARN: Multi-variable type inference failed */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 251
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.b.a.C2767a.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(mu.h<? super k10.l<? extends S>> hVar, tq.e<? super i0> eVar) {
                return ((C2767a) v(hVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C2767a c2767a = new C2767a(this.f114029r, this.f114030s, eVar, this.f114031t, this.f114032v);
                c2767a.f114028q = obj;
                return c2767a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(b<T, InputState, S, A> bVar, er.a<? extends S> aVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f114016g = bVar;
            this.f114017h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object obj2 = this.f114015f;
            uq.b.e();
            if (this.f114014e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            b<T, InputState, S, A> bVar = this.f114016g;
            return mu.i.I(new C2767a(bVar, this.f114017h, null, bVar, obj2));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(T t15, tq.e<? super mu.g<? extends k10.l<? extends S>>> eVar) {
            return ((a) v(t15, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f114016g, this.f114017h, eVar);
            aVar.f114015f = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public b(h.a<S> aVar, mu.g<? extends T> gVar, o oVar, q<? super T, ? super c0<InputState>, ? super tq.e<? super k10.l<? extends S>>, ? extends Object> qVar) {
        this.isInState = aVar;
        this.flow = gVar;
        this.executionPolicy = oVar;
        this.handler = qVar;
    }

    @Override // l10.h
    public h.a<S> a() {
        return this.isInState;
    }

    @Override // l10.h
    public mu.g<k10.l<S>> b(er.a<? extends S> getState) {
        return k10.p.a(this.flow, this.executionPolicy, new a(this, getState, null));
    }
}
