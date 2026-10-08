package l10;

import er.p;
import k10.c0;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0005BM\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006\u0012\u0006\u0010\b\u001a\u00028\u0000\u0012.\u0010\r\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0014\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u00132\u0016\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0010j\b\u0012\u0004\u0012\u00028\u0001`\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R \u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00010\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018R\u0014\u0010\b\u001a\u00028\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0019R<\u0010\r\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\n\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\f0\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Ll10/f;", "InputState", "", ip.a.f96137b, "A", "Ll10/h;", "Ll10/h$a;", "isInState", "initialState", "Lkotlin/Function2;", "Lk10/c0;", "Ltq/e;", "Lk10/l;", "handler", "<init>", "(Ll10/h$a;Ljava/lang/Object;Ler/p;)V", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "Lmu/g;", "b", "(Ler/a;)Lmu/g;", "a", "Ll10/h$a;", "()Ll10/h$a;", "Ljava/lang/Object;", "c", "Ler/p;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f<InputState extends S, S, A> extends h<InputState, S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h.a<S> isInState;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final InputState initialState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p<c0<InputState>, tq.e<? super k10.l<? extends S>>, Object> handler;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", ip.a.f96137b, "Lmu/h;", "Lk10/l;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements p<mu.h<? super k10.l<? extends S>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f114169e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f114170f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f114171g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f<InputState, S, A> f114172h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(f<InputState, S, A> fVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f114172h = fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x005b, code lost:
        
            if (r2.F(r7, r6) == r1) goto L16;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f114171g
                mu.h r0 = (mu.h) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f114170f
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L26
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L5e
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                java.lang.Object r2 = r6.f114169e
                mu.h r2 = (mu.h) r2
                oq.u.b(r7)
                goto L4c
            L26:
                oq.u.b(r7)
                l10.f<InputState extends S, S, A> r7 = r6.f114172h
                er.p r7 = l10.f.e(r7)
                k10.c0 r2 = new k10.c0
                l10.f<InputState extends S, S, A> r5 = r6.f114172h
                java.lang.Object r5 = l10.f.f(r5)
                r2.<init>(r5)
                java.lang.Object r5 = vq.j.a(r0)
                r6.f114171g = r5
                r6.f114169e = r0
                r6.f114170f = r4
                java.lang.Object r7 = r7.B(r2, r6)
                if (r7 != r1) goto L4b
                goto L5d
            L4b:
                r2 = r0
            L4c:
                java.lang.Object r0 = vq.j.a(r0)
                r6.f114171g = r0
                r0 = 0
                r6.f114169e = r0
                r6.f114170f = r3
                java.lang.Object r7 = r2.F(r7, r6)
                if (r7 != r1) goto L5e
            L5d:
                return r1
            L5e:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: l10.f.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super k10.l<? extends S>> hVar, tq.e<? super i0> eVar) {
            return ((a) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            a aVar = new a(this.f114172h, eVar);
            aVar.f114171g = obj;
            return aVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public f(h.a<S> aVar, InputState inputstate, p<? super c0<InputState>, ? super tq.e<? super k10.l<? extends S>>, ? extends Object> pVar) {
        this.isInState = aVar;
        this.initialState = inputstate;
        this.handler = pVar;
    }

    @Override // l10.h
    public h.a<S> a() {
        return this.isInState;
    }

    @Override // l10.h
    public mu.g<k10.l<S>> b(er.a<? extends S> getState) {
        return mu.i.I(new a(this, null));
    }
}
