package l10;

import er.p;
import ju.d2;
import ju.p0;
import lu.z;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u00032\u00020\u0004:\u0001\u0019BU\u0012\u0018\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00010\tj\b\u0012\u0004\u0012\u00028\u0001`\n\u0012\u0012\u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J \u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u00022\u0006\u0010\u0011\u001a\u00028\u0001H\u0086@¢\u0006\u0004\b\u0017\u0010\u0018R&\u0010\u0006\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR$\u0010\u000b\u001a\u0012\u0012\u0004\u0012\u00028\u00010\tj\b\u0012\u0004\u0012\u00028\u0001`\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001dR \u0010\u000e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\r0\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001eR.\u0010!\u001a\u001a\u0018\u00010\u001fR\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010 ¨\u0006\""}, d2 = {"Ll10/c;", "InputState", ip.a.f96137b, "A", "", "Ll10/i;", "builder", "Lju/p0;", "scope", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "Llu/z;", "Lk10/l;", "stateChanges", "<init>", "(Ll10/i;Lju/p0;Ler/a;Llu/z;)V", "state", "Loq/i0;", "e", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "c", "action", "d", "(Ljava/lang/Object;Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "a", "Ll10/i;", "b", "Lju/p0;", "Ler/a;", "Llu/z;", "Ll10/c$a;", "Ll10/c$a;", "currentlyActiveSideEffect", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class c<InputState extends S, S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i<InputState, S, A> builder;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.a<S> getState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final z<k10.l<? extends S>> stateChanges;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private c<InputState, S, A>.a currentlyActiveSideEffect;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0082\u0004\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR)\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r¨\u0006\u000e"}, d2 = {"Ll10/c$a;", "", "Lju/d2;", "job", "Ll10/h;", "sideEffect", "<init>", "(Ll10/c;Lju/d2;Ll10/h;)V", "a", "Lju/d2;", "()Lju/d2;", "b", "Ll10/h;", "()Ll10/h;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    private final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d2 job;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final h<InputState, S, A> sideEffect;

        public a(d2 d2Var, h<InputState, S, A> hVar) {
            this.job = d2Var;
            this.sideEffect = hVar;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final d2 getJob() {
            return this.job;
        }

        public final h<InputState, S, A> b() {
            return this.sideEffect;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f114043d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f114044e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f114045f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c<InputState, S, A> f114046g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f114047h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(c<InputState, S, A> cVar, tq.e<? super b> eVar) {
            super(eVar);
            this.f114046g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f114045f = obj;
            this.f114047h |= PKIFailureInfo.systemUnavail;
            return this.f114046g.c(null, this);
        }
    }

    /* JADX INFO: renamed from: l10.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class C2768c extends vq.k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f114048e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ h<InputState, S, A> f114049f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c<InputState, S, A> f114050g;

        /* JADX INFO: renamed from: l10.c$c$a */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ c<InputState, S, A> f114051a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ h<InputState, S, A> f114052b;

            a(c<InputState, S, A> cVar, h<InputState, S, A> hVar) {
                this.f114051a = cVar;
                this.f114052b = hVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(k10.l<? extends S> lVar, tq.e<? super i0> eVar) {
                Object objL = ((c) this.f114051a).stateChanges.l(k.c(lVar, this.f114052b), eVar);
                return objL == uq.b.e() ? objL : i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C2768c(h<InputState, S, A> hVar, c<InputState, S, A> cVar, tq.e<? super C2768c> eVar) {
            super(2, eVar);
            this.f114049f = hVar;
            this.f114050g = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f114048e;
            if (i15 == 0) {
                u.b(obj);
                mu.g<k10.l<S>> gVarB = this.f114049f.b(((c) this.f114050g).getState);
                a aVar = new a(this.f114050g, this.f114049f);
                this.f114048e = 1;
                if (gVarB.a(aVar, this) == objE) {
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
            return ((C2768c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new C2768c(this.f114049f, this.f114050g, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(i<InputState, S, A> iVar, p0 p0Var, er.a<? extends S> aVar, z<? super k10.l<? extends S>> zVar) {
        this.builder = iVar;
        this.scope = p0Var;
        this.getState = aVar;
        this.stateChanges = zVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(S s15, tq.e<? super i0> eVar) throws Throwable {
        b bVar;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i15 = bVar.f114047h;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f114047h = i15 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(this, eVar);
            }
        } else {
            bVar = new b(this, eVar);
        }
        Object obj = bVar.f114045f;
        Object objE = uq.b.e();
        int i16 = bVar.f114047h;
        if (i16 == 0) {
            u.b(obj);
            c<InputState, S, A>.a aVar = this.currentlyActiveSideEffect;
            if (aVar != null && !aVar.b().a().a(s15)) {
                aVar.getJob().u(new l());
                d2 job = aVar.getJob();
                bVar.f114043d = vq.j.a(s15);
                bVar.f114044e = vq.j.a(aVar);
                bVar.f114047h = 1;
                if (job.T0(bVar) == objE) {
                    return objE;
                }
            }
            return i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(obj);
        this.currentlyActiveSideEffect = null;
        return i0.f148189a;
    }

    public final Object d(A a15, S s15, tq.e<? super i0> eVar) {
        c<InputState, S, A>.a aVar = this.currentlyActiveSideEffect;
        if (aVar == null || !aVar.b().a().a(s15)) {
            return i0.f148189a;
        }
        Object objC = aVar.b().c(a15, eVar);
        return objC == uq.b.e() ? objC : i0.f148189a;
    }

    public final Object e(S s15, tq.e<? super i0> eVar) {
        if (this.builder.b().a(s15) && this.currentlyActiveSideEffect == null) {
            h<InputState, S, A> hVarA = this.builder.a(s15);
            this.currentlyActiveSideEffect = new a(ju.k.d(this.scope, null, null, new C2768c(hVarA, this, null), 3, null), hVarA);
        }
        return i0.f148189a;
    }
}
