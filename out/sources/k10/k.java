package k10;

import java.util.ArrayList;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00028\u0001*\b\b\u0001\u0010\u0003*\u00020\u0002*\b\b\u0002\u0010\u0004*\u00020\u00022\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0005\u0010\u0006J\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00010\b2\u0006\u0010\u0007\u001a\u00028\u0000H\u0010¢\u0006\u0004\b\t\u0010\nJe\u0010\u0016\u001a\u00020\u0015\"\b\b\u0003\u0010\u000b*\u00028\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e24\u0010\u0014\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010H\u0001¢\u0006\u0004\b\u0016\u0010\u0017JY\u0010\u0018\u001a\u00020\u0015\"\b\b\u0003\u0010\u000b*\u00028\u00022\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00030\f2\u0006\u0010\u000f\u001a\u00020\u000e2(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010H\u0001¢\u0006\u0004\b\u0018\u0010\u0017J=\u0010\u0004\u001a\u00020\u00152.\u0010\u0014\u001a*\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0019¢\u0006\u0004\b\u0004\u0010\u001aJ1\u0010\u001b\u001a\u00020\u00152\"\u0010\u0014\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0019¢\u0006\u0004\b\u001b\u0010\u001aJa\u0010\u001f\u001a\u00020\u0015\"\u0004\b\u0003\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e24\u0010\u0014\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\b\u001f\u0010 Jm\u0010#\u001a\u00020\u0015\"\u0004\b\u0003\u0010\u001c2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001d0!2\b\b\u0002\u0010\u000f\u001a\u00020\u000e24\u0010\u0014\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\b#\u0010$JU\u0010%\u001a\u00020\u0015\"\u0004\b\u0003\u0010\u001c2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00030\u001d2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\b%\u0010 Ja\u0010&\u001a\u00020\u0015\"\u0004\b\u0003\u0010\u001c2\u0018\u0010\"\u001a\u0014\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00030\u001d0!2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2(\u0010\u0014\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00150\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0010¢\u0006\u0004\b&\u0010$JS\u0010+\u001a\u00020\u0015\"\b\b\u0003\u0010'*\u00020\u00022\u0012\u0010)\u001a\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00020(2&\b\u0002\u0010*\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0019¢\u0006\u0004\b+\u0010,J\u007f\u00100\u001a\u00020\u0015\"\b\b\u0003\u0010'*\u00020\u0002\"\b\b\u0004\u0010-*\u00020\u00022\u001e\u0010.\u001a\u001a\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u00040(0!2\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00040!2&\b\u0002\u0010*\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0019¢\u0006\u0004\b0\u00101J\u009f\u0001\u00102\u001a\u00020\u0015\"\b\b\u0003\u0010\u000b*\u00028\u0002\"\b\b\u0004\u0010'*\u00020\u0002\"\b\b\u0005\u0010-*\u00020\u00022\u000e\u0010\r\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00030\f2$\u0010.\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0000\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050(0\u00192\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00028\u0002\u0012\u0006\u0012\u0004\u0018\u00018\u00050!2$\u0010*\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00130\u0019H\u0001¢\u0006\u0004\b2\u00103RN\u0010;\u001a6\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020504j\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u000205`68\u0000X\u0080\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00010<8 X \u0004¢\u0006\u0006\u001a\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lk10/k;", "InputState", "", ip.a.f96137b, "A", "<init>", "()V", "initialState", "Ll10/h$a;", "J", "(Ljava/lang/Object;)Ll10/h$a;", "SubAction", "Lmr/c;", "actionClass", "Lk10/o;", "executionPolicy", "Lkotlin/Function3;", "Lk10/c0;", "Ltq/e;", "Lk10/l;", "handler", "Loq/i0;", "v", "(Lmr/c;Lk10/o;Ler/q;)V", "x", "Lkotlin/Function2;", "(Ler/p;)V", "C", "T", "Lmu/g;", "flow", "k", "(Lmu/g;Lk10/o;Ler/q;)V", "Lkotlin/Function1;", "flowBuilder", "j", "(Ler/l;Lk10/o;Ler/q;)V", "q", "p", "SubStateMachineState", "Lk10/e0;", "stateMachine", "stateMapper", "E", "(Lk10/e0;Ler/p;)V", "SubStateMachineAction", "stateMachineFactory", "actionMapper", ip.a.f96138c, "(Ler/l;Ler/l;Ler/p;)V", "y", "(Lmr/c;Ler/p;Ler/l;Ler/p;)V", "Ljava/util/ArrayList;", "Ll10/i;", "Lkotlin/collections/ArrayList;", "a", "Ljava/util/ArrayList;", "t", "()Ljava/util/ArrayList;", "sideEffectBuilders", "Ll10/i$a;", "u", "()Ll10/i$a;", "isInState", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class k<InputState extends S, S, A> {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<l10.i<InputState, S, A>> sideEffectBuilders = new ArrayList<>();

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\n"}, d2 = {"", ip.a.f96137b, "T", "InputState", "value", "Lk10/c0;", "state", "Lk10/l;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class a<T> extends vq.k implements er.q<T, c0<InputState>, tq.e<? super l<? extends S>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107311e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107312f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f107313g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<T, InputState, tq.e<? super i0>, Object> f107314h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.q<? super T, ? super InputState, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super a> eVar) {
            super(3, eVar);
            this.f107314h = qVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to k10.k$a<T> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f107312f
                java.lang.Object r1 = r6.f107313g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f107311e
                r4 = 1
                if (r3 == 0) goto L1d
                if (r3 != r4) goto L15
                oq.u.b(r7)
                goto L3b
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                oq.u.b(r7)
                er.q<T, InputState extends S, tq.e<? super oq.i0>, java.lang.Object> r7 = r6.f107314h
                java.lang.Object r3 = r1.a()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f107312f = r5
                java.lang.Object r1 = vq.j.a(r1)
                r6.f107313g = r1
                r6.f107311e = r4
                java.lang.Object r7 = r7.w(r0, r3, r6)
                if (r7 != r2) goto L3b
                return r2
            L3b:
                k10.a0 r7 = k10.a0.f107282a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k10.k.a.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(T t15, c0<InputState> c0Var, tq.e<? super l<? extends S>> eVar) {
            a aVar = new a(this.f107314h, eVar);
            aVar.f107312f = t15;
            aVar.f107313g = c0Var;
            return aVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\b\b\u0002\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00020\u0005H\n"}, d2 = {"", ip.a.f96137b, "T", "InputState", "value", "Lk10/c0;", "state", "Lk10/l;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class b<T> extends vq.k implements er.q<T, c0<InputState>, tq.e<? super l<? extends S>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107315e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107316f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f107317g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<T, InputState, tq.e<? super i0>, Object> f107318h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(er.q<? super T, ? super InputState, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super b> eVar) {
            super(3, eVar);
            this.f107318h = qVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to k10.k$b<T> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f107316f
                java.lang.Object r1 = r6.f107317g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f107315e
                r4 = 1
                if (r3 == 0) goto L1d
                if (r3 != r4) goto L15
                oq.u.b(r7)
                goto L3b
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                oq.u.b(r7)
                er.q<T, InputState extends S, tq.e<? super oq.i0>, java.lang.Object> r7 = r6.f107318h
                java.lang.Object r3 = r1.a()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f107316f = r5
                java.lang.Object r1 = vq.j.a(r1)
                r6.f107317g = r1
                r6.f107315e = r4
                java.lang.Object r7 = r7.w(r0, r3, r6)
                if (r7 != r2) goto L3b
                return r2
            L3b:
                k10.a0 r7 = k10.a0.f107282a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k10.k.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(T t15, c0<InputState> c0Var, tq.e<? super l<? extends S>> eVar) {
            b bVar = new b(this.f107318h, eVar);
            bVar.f107316f = t15;
            bVar.f107317g = c0Var;
            return bVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [SubAction] */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u0002\"\b\b\u0003\u0010\u0003*\u00028\u00002\u0006\u0010\u0004\u001a\u00028\u00012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00030\u0005H\n"}, d2 = {"", ip.a.f96137b, "SubAction", "InputState", "action", "Lk10/c0;", "state", "Lk10/l;", "<anonymous>"}, k = 3, mv = {2, 2, 0})
    static final class c<SubAction> extends vq.k implements er.q<SubAction, c0<InputState>, tq.e<? super l<? extends S>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107319e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107320f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f107321g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.q<SubAction, InputState, tq.e<? super i0>, Object> f107322h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.q<? super SubAction, ? super InputState, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super c> eVar) {
            super(3, eVar);
            this.f107322h = qVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to k10.k$c<SubAction> for r6v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f107320f
                java.lang.Object r1 = r6.f107321g
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f107319e
                r4 = 1
                if (r3 == 0) goto L1d
                if (r3 != r4) goto L15
                oq.u.b(r7)
                goto L3b
            L15:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1d:
                oq.u.b(r7)
                er.q<SubAction, InputState extends S, tq.e<? super oq.i0>, java.lang.Object> r7 = r6.f107322h
                java.lang.Object r3 = r1.a()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f107320f = r5
                java.lang.Object r1 = vq.j.a(r1)
                r6.f107321g = r1
                r6.f107319e = r4
                java.lang.Object r7 = r7.w(r0, r3, r6)
                if (r7 != r2) goto L3b
                return r2
            L3b:
                k10.a0 r7 = k10.a0.f107282a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: k10.k.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(SubAction subaction, c0<InputState> c0Var, tq.e<? super l<? extends S>> eVar) {
            c cVar = new c(this.f107322h, eVar);
            cVar.f107320f = subaction;
            cVar.f107321g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000\"\b\b\u0001\u0010\u0002*\u00028\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", ip.a.f96137b, "InputState", "Lk10/c0;", "state", "Lk10/l;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<c0<InputState>, tq.e<? super l<? extends S>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f107323e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f107324f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.p<InputState, tq.e<? super i0>, Object> f107325g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(er.p<? super InputState, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f107325g = pVar;
        }

        /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
            jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to k10.k$d for r4v1 'this'  java.lang.Object
            	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
            	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
            	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
            	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
            	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.f107324f
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r4.f107323e
                r3 = 1
                if (r2 == 0) goto L1b
                if (r2 != r3) goto L13
                oq.u.b(r5)
                goto L33
            L13:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1b:
                oq.u.b(r5)
                er.p<InputState extends S, tq.e<? super oq.i0>, java.lang.Object> r5 = r4.f107325g
                java.lang.Object r2 = r0.a()
                java.lang.Object r0 = vq.j.a(r0)
                r4.f107324f = r0
                r4.f107323e = r3
                java.lang.Object r5 = r5.B(r2, r4)
                if (r5 != r1) goto L33
                return r1
            L33:
                k10.a0 r5 = k10.a0.f107282a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: k10.k.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(c0<InputState> c0Var, tq.e<? super l<? extends S>> eVar) {
            return ((d) v(c0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f107325g, eVar);
            dVar.f107324f = obj;
            return dVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l10.h B(k kVar, er.p pVar, Object obj) {
        return new l10.f(kVar.J(obj), obj, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e0 F(e0 e0Var, Object obj) {
        return e0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(Object obj) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l10.h H(k kVar, er.l lVar, er.l lVar2, er.p pVar, Object obj) {
        return new l10.g(kVar.J(obj), (e0) lVar.b(obj), lVar2, pVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final boolean I(k kVar, Object obj) {
        return kVar.u().a(obj);
    }

    public static /* synthetic */ void l(k kVar, er.l lVar, o oVar, er.q qVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectWhileInState");
        }
        if ((i15 & 2) != 0) {
            oVar = o.ORDERED;
        }
        kVar.j(lVar, oVar, qVar);
    }

    public static /* synthetic */ void m(k kVar, mu.g gVar, o oVar, er.q qVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectWhileInState");
        }
        if ((i15 & 2) != 0) {
            oVar = o.ORDERED;
        }
        kVar.k(gVar, oVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l10.h n(k kVar, mu.g gVar, o oVar, er.q qVar, Object obj) {
        return new l10.b(kVar.J(obj), gVar, oVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l10.h o(k kVar, er.l lVar, o oVar, er.q qVar, Object obj) {
        return new l10.b(kVar.J(obj), (mu.g) lVar.b(obj), oVar, qVar);
    }

    public static /* synthetic */ void r(k kVar, er.l lVar, o oVar, er.q qVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectWhileInStateEffect");
        }
        if ((i15 & 2) != 0) {
            oVar = o.ORDERED;
        }
        kVar.p(lVar, oVar, qVar);
    }

    public static /* synthetic */ void s(k kVar, mu.g gVar, o oVar, er.q qVar, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectWhileInStateEffect");
        }
        if ((i15 & 2) != 0) {
            oVar = o.ORDERED;
        }
        kVar.q(gVar, oVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l10.h w(k kVar, mr.c cVar, o oVar, er.q qVar, Object obj) {
        return new l10.d(kVar.J(obj), cVar, oVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final l10.h z(k kVar, er.p pVar, mr.c cVar, er.l lVar, er.p pVar2, Object obj) {
        return new l10.e(kVar.J(obj), pVar, cVar, lVar, pVar2);
    }

    public final void A(final er.p<? super c0<InputState>, ? super tq.e<? super l<? extends S>>, ? extends Object> handler) {
        this.sideEffectBuilders.add(new l10.i<>(u(), new er.l() { // from class: k10.g
            @Override // er.l
            public final Object b(Object obj) {
                return k.B(this.f107299a, handler, obj);
            }
        }));
    }

    public final void C(er.p<? super InputState, ? super tq.e<? super i0>, ? extends Object> handler) {
        A(new d(handler, null));
    }

    public final <SubStateMachineState, SubStateMachineAction> void D(final er.l<? super InputState, ? extends e0<SubStateMachineState, SubStateMachineAction>> stateMachineFactory, final er.l<? super A, ? extends SubStateMachineAction> actionMapper, final er.p<? super c0<InputState>, ? super SubStateMachineState, ? extends l<? extends S>> stateMapper) {
        this.sideEffectBuilders.add(new l10.i<>(u(), new er.l() { // from class: k10.d
            @Override // er.l
            public final Object b(Object obj) {
                return k.H(this.f107285a, stateMachineFactory, actionMapper, stateMapper, obj);
            }
        }));
    }

    public final <SubStateMachineState> void E(final e0<SubStateMachineState, A> stateMachine, er.p<? super c0<InputState>, ? super SubStateMachineState, ? extends l<? extends S>> stateMapper) {
        D(new er.l() { // from class: k10.b
            @Override // er.l
            public final Object b(Object obj) {
                return k.F(stateMachine, obj);
            }
        }, new er.l() { // from class: k10.c
            @Override // er.l
            public final Object b(Object obj) {
                return k.G(obj);
            }
        }, stateMapper);
    }

    public l10.h.a<S> J(InputState initialState) {
        return new l10.h.a() { // from class: k10.j
            @Override // l10.h.a
            public final boolean a(Object obj) {
                return k.I(this.f107309a, obj);
            }
        };
    }

    public final <T> void j(final er.l<? super InputState, ? extends mu.g<? extends T>> flowBuilder, final o executionPolicy, final er.q<? super T, ? super c0<InputState>, ? super tq.e<? super l<? extends S>>, ? extends Object> handler) {
        this.sideEffectBuilders.add(new l10.i<>(u(), new er.l() { // from class: k10.e
            @Override // er.l
            public final Object b(Object obj) {
                return k.o(this.f107289a, flowBuilder, executionPolicy, handler, obj);
            }
        }));
    }

    public final <T> void k(final mu.g<? extends T> flow, final o executionPolicy, final er.q<? super T, ? super c0<InputState>, ? super tq.e<? super l<? extends S>>, ? extends Object> handler) {
        this.sideEffectBuilders.add(new l10.i<>(u(), new er.l() { // from class: k10.h
            @Override // er.l
            public final Object b(Object obj) {
                return k.n(this.f107301a, flow, executionPolicy, handler, obj);
            }
        }));
    }

    public final <T> void p(er.l<? super InputState, ? extends mu.g<? extends T>> flowBuilder, o executionPolicy, er.q<? super T, ? super InputState, ? super tq.e<? super i0>, ? extends Object> handler) {
        j(flowBuilder, executionPolicy, new b(handler, null));
    }

    public final <T> void q(mu.g<? extends T> flow, o executionPolicy, er.q<? super T, ? super InputState, ? super tq.e<? super i0>, ? extends Object> handler) {
        k(flow, executionPolicy, new a(handler, null));
    }

    public final ArrayList<l10.i<InputState, S, A>> t() {
        return this.sideEffectBuilders;
    }

    public abstract l10.i.a<S> u();

    public final <SubAction extends A> void v(final mr.c<SubAction> actionClass, final o executionPolicy, final er.q<? super SubAction, ? super c0<InputState>, ? super tq.e<? super l<? extends S>>, ? extends Object> handler) {
        this.sideEffectBuilders.add(new l10.i<>(u(), new er.l() { // from class: k10.i
            @Override // er.l
            public final Object b(Object obj) {
                return k.w(this.f107305a, actionClass, executionPolicy, handler, obj);
            }
        }));
    }

    public final <SubAction extends A> void x(mr.c<SubAction> actionClass, o executionPolicy, er.q<? super SubAction, ? super InputState, ? super tq.e<? super i0>, ? extends Object> handler) {
        v(actionClass, executionPolicy, new c(handler, null));
    }

    public final <SubAction extends A, SubStateMachineState, SubStateMachineAction> void y(final mr.c<? extends SubAction> actionClass, final er.p<? super SubAction, ? super InputState, ? extends e0<SubStateMachineState, SubStateMachineAction>> stateMachineFactory, final er.l<? super A, ? extends SubStateMachineAction> actionMapper, final er.p<? super c0<InputState>, ? super SubStateMachineState, ? extends l<? extends S>> stateMapper) {
        this.sideEffectBuilders.add(new l10.i<>(u(), new er.l() { // from class: k10.f
            @Override // er.l
            public final Object b(Object obj) {
                return k.z(this.f107293a, stateMachineFactory, actionClass, actionMapper, stateMapper, obj);
            }
        }));
    }
}
