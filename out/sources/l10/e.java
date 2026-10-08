package l10;

import er.p;
import er.q;
import fr.t;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import ju.a0;
import ju.d2;
import ju.p0;
import k10.c0;
import k10.e0;
import k10.n;
import lu.w;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u0001*\b\b\u0002\u0010\u0004*\u00028\u0004*\b\b\u0003\u0010\u0005*\u00028\u0005*\b\b\u0004\u0010\u0006*\u00020\u0001*\b\b\u0005\u0010\u0007*\u00020\u00012\u0014\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u00050\b:\u0001\u001eB\u0087\u0001\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00040\t\u0012$\u0010\r\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b\u0012\u000e\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00050\u000e\u0012\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u0010\u0012$\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u00130\u000b¢\u0006\u0004\b\u0015\u0010\u0016J3\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u00130\u001a2\u0016\u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00028\u00040\u0017j\b\u0012\u0004\u0012\u00028\u0004`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR \u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR2\u0010\r\u001a \u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\"\u0010\u000f\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00050\u000e8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0005\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R2\u0010\u0014\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00020\u0012\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00040\u00130\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010!¨\u0006)"}, d2 = {"Ll10/e;", "", "SubStateMachineState", "SubStateMachineAction", "InputState", "ActionThatTriggeredStartingStateMachine", ip.a.f96137b, "A", "Ll10/a;", "Ll10/h$a;", "isInState", "Lkotlin/Function2;", "Lk10/e0;", "subStateMachineFactory", "Lmr/c;", "subActionClass", "Lkotlin/Function1;", "actionMapper", "Lk10/c0;", "Lk10/l;", "stateMapper", "<init>", "(Ll10/h$a;Ler/p;Lmr/c;Ler/l;Ler/p;)V", "Lkotlin/Function0;", "Lpl/gov/coi/common/statemachine/sideeffects/GetState;", "getState", "Lmu/g;", "b", "(Ler/a;)Lmu/g;", "Ll10/h$a;", "a", "()Ll10/h$a;", "c", "Ler/p;", "d", "Lmr/c;", "j", "()Lmr/c;", "e", "Ler/l;", "f", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e<SubStateMachineState, SubStateMachineAction, InputState extends S, ActionThatTriggeredStartingStateMachine extends A, S, A> extends l10.a<InputState, S, A> {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final h.a<S> isInState;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p<ActionThatTriggeredStartingStateMachine, InputState, e0<SubStateMachineState, SubStateMachineAction>> subStateMachineFactory;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mr.c<? extends A> subActionClass;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<A, SubStateMachineAction> actionMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final p<c0<InputState>, SubStateMachineState, k10.l<S>> stateMapper;

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0006\u0010\u0002*\u00020\u0001*\b\b\u0007\u0010\u0003*\u00020\u0001*\b\b\b\u0010\u0004*\u00020\u00012\u00020\u0001:\u0001\u0015B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J<\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00028\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J2\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0018\u00010\u00112\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0017\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016RH\u0010\u001c\u001a6\u0012\u0004\u0012\u00028\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u00110\u0018j\u001a\u0012\u0004\u0012\u00028\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u00070\u0011`\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Ll10/e$a;", "", ip.a.f96137b, "A", "ActionThatTriggeredStartingStateMachine", "<init>", "()V", "actionThatStartedStateMachine", "Lk10/e0;", "stateMachine", "Lk10/n;", "coroutineWaiter", "Lju/d2;", "job", "Loq/i0;", "c", "(Ljava/lang/Object;Lk10/e0;Lju/a0;Lju/d2;Ltq/e;)Ljava/lang/Object;", "Ll10/e$a$a;", "d", "(Lk10/e0;Ltq/e;)Ljava/lang/Object;", "Lsu/a;", "a", "Lsu/a;", "mutex", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "b", "Ljava/util/LinkedHashMap;", "stateMachinesAndJobsMap", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a<S, A, ActionThatTriggeredStartingStateMachine> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final su.a mutex = su.g.b(false, 1, null);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final LinkedHashMap<ActionThatTriggeredStartingStateMachine, StateMachineAndJob<S, A>> stateMachinesAndJobsMap = new LinkedHashMap<>();

        /* JADX INFO: renamed from: l10.e$a$a, reason: collision with other inner class name and from toString */
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u0000*\b\b\t\u0010\u0002*\u00020\u0001*\b\b\n\u0010\u0003*\u00020\u00012\u00020\u0001B+\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n0\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\t\u0012\u0004\u0012\u00028\n0\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0007\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001a\u0010\u001cR\u001a\u0010\t\u001a\u00020\b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u001d\u001a\u0004\b\u0016\u0010\u001e¨\u0006\u001f"}, d2 = {"Ll10/e$a$a;", "", ip.a.f96137b, "A", "Lk10/e0;", "stateMachine", "Lju/d2;", "job", "Lk10/n;", "coroutineWaiter", "<init>", "(Lk10/e0;Lju/d2;Lju/a0;Lfr/k;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lk10/e0;", "c", "()Lk10/e0;", "b", "Lju/d2;", "()Lju/d2;", "Lju/a0;", "()Lju/a0;", "statemachine_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final /* data */ class StateMachineAndJob<S, A> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final e0<S, A> stateMachine;

            /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
            private final d2 job;

            /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
            private final a0 coroutineWaiter;

            public /* synthetic */ StateMachineAndJob(e0 e0Var, d2 d2Var, a0 a0Var, fr.k kVar) {
                this(e0Var, d2Var, a0Var);
            }

            /* JADX INFO: renamed from: a, reason: from getter */
            public final a0 getCoroutineWaiter() {
                return this.coroutineWaiter;
            }

            /* JADX INFO: renamed from: b, reason: from getter */
            public final d2 getJob() {
                return this.job;
            }

            public final e0<S, A> c() {
                return this.stateMachine;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof StateMachineAndJob)) {
                    return false;
                }
                StateMachineAndJob stateMachineAndJob = (StateMachineAndJob) other;
                return t.c(this.stateMachine, stateMachineAndJob.stateMachine) && t.c(this.job, stateMachineAndJob.job) && n.c(this.coroutineWaiter, stateMachineAndJob.coroutineWaiter);
            }

            public int hashCode() {
                return (((this.stateMachine.hashCode() * 31) + this.job.hashCode()) * 31) + n.d(this.coroutineWaiter);
            }

            public String toString() {
                return "StateMachineAndJob(stateMachine=" + this.stateMachine + ", job=" + this.job + ", coroutineWaiter=" + ((Object) n.f(this.coroutineWaiter)) + ')';
            }

            private StateMachineAndJob(e0<S, A> e0Var, d2 d2Var, a0 a0Var) {
                this.stateMachine = e0Var;
                this.job = d2Var;
                this.coroutineWaiter = a0Var;
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class b extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f114101d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f114102e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f114103f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f114104g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f114105h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f114106j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            /* synthetic */ Object f114107k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ a<S, A, ActionThatTriggeredStartingStateMachine> f114108l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            int f114109m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(a<S, A, ActionThatTriggeredStartingStateMachine> aVar, tq.e<? super b> eVar) {
                super(eVar);
                this.f114108l = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f114107k = obj;
                this.f114109m |= PKIFailureInfo.systemUnavail;
                return this.f114108l.c(null, null, null, null, this);
            }
        }

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class c extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f114110d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f114111e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f114112f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            /* synthetic */ Object f114113g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ a<S, A, ActionThatTriggeredStartingStateMachine> f114114h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f114115j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<S, A, ActionThatTriggeredStartingStateMachine> aVar, tq.e<? super c> eVar) {
                super(eVar);
                this.f114114h = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f114113g = obj;
                this.f114115j |= PKIFailureInfo.systemUnavail;
                return this.f114114h.d(null, this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object c(ActionThatTriggeredStartingStateMachine actionthattriggeredstartingstatemachine, e0<S, A> e0Var, a0 a0Var, d2 d2Var, tq.e<? super i0> eVar) throws Throwable {
            b bVar;
            su.a aVar;
            d2 job;
            if (eVar instanceof b) {
                bVar = (b) eVar;
                int i15 = bVar.f114109m;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    bVar.f114109m = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    bVar = new b(this, eVar);
                }
            } else {
                bVar = new b(this, eVar);
            }
            Object obj = bVar.f114107k;
            Object objE = uq.b.e();
            int i16 = bVar.f114109m;
            fr.k kVar = null;
            if (i16 == 0) {
                u.b(obj);
                aVar = this.mutex;
                bVar.f114101d = actionthattriggeredstartingstatemachine;
                bVar.f114102e = e0Var;
                bVar.f114103f = a0Var;
                bVar.f114104g = d2Var;
                bVar.f114105h = aVar;
                bVar.f114106j = 0;
                bVar.f114109m = 1;
                if (aVar.h(null, bVar) == objE) {
                    return objE;
                }
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                su.a aVar2 = (su.a) bVar.f114105h;
                d2Var = (d2) bVar.f114104g;
                a0Var = (a0) bVar.f114103f;
                e0Var = (e0) bVar.f114102e;
                Object obj2 = bVar.f114101d;
                u.b(obj);
                aVar = aVar2;
                actionthattriggeredstartingstatemachine = (ActionThatTriggeredStartingStateMachine) obj2;
            }
            try {
                StateMachineAndJob<S, A> stateMachineAndJob = this.stateMachinesAndJobsMap.get(actionthattriggeredstartingstatemachine);
                if (stateMachineAndJob != null && (job = stateMachineAndJob.getJob()) != null) {
                    d2.a.a(job, null, 1, null);
                }
                this.stateMachinesAndJobsMap.put(actionthattriggeredstartingstatemachine, new StateMachineAndJob<>(e0Var, d2Var, a0Var, kVar));
                i0 i0Var = i0.f148189a;
                return i0.f148189a;
            } finally {
                aVar.r(null);
            }
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        public final Object d(e0<S, A> e0Var, tq.e<? super StateMachineAndJob<S, A>> eVar) throws Throwable {
            c cVar;
            e0<S, A> e0Var2;
            su.a aVar;
            ActionThatTriggeredStartingStateMachine key;
            Map.Entry<ActionThatTriggeredStartingStateMachine, StateMachineAndJob<S, A>> next;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f114115j;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f114115j = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(this, eVar);
                }
            } else {
                cVar = new c(this, eVar);
            }
            Object obj = cVar.f114113g;
            Object objE = uq.b.e();
            int i16 = cVar.f114115j;
            if (i16 == 0) {
                u.b(obj);
                su.a aVar2 = this.mutex;
                cVar.f114110d = e0Var;
                cVar.f114111e = aVar2;
                cVar.f114112f = 0;
                cVar.f114115j = 1;
                if (aVar2.h(null, cVar) == objE) {
                    return objE;
                }
                e0Var2 = e0Var;
                aVar = aVar2;
            } else {
                if (i16 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                aVar = (su.a) cVar.f114111e;
                e0Var2 = (e0) cVar.f114110d;
                u.b(obj);
            }
            try {
                Iterator<Map.Entry<ActionThatTriggeredStartingStateMachine, StateMachineAndJob<S, A>>> it = this.stateMachinesAndJobsMap.entrySet().iterator();
                do {
                    if (!it.hasNext()) {
                        key = null;
                        break;
                    }
                    next = it.next();
                    key = next.getKey();
                } while (next.getValue().c() != e0Var2);
                return key != null ? this.stateMachinesAndJobsMap.remove(key) : null;
            } finally {
                aVar.r(null);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", ip.a.f96137b, "Llu/w;", "Lk10/l;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<w<? super k10.l<? extends S>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f114116e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f114117f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f114118g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> f114119h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ er.a<S> f114120j;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> f114121a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ er.a<S> f114122b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ w<k10.l<? extends S>> f114123c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> f114124d;

            /* JADX INFO: renamed from: l10.e$b$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C2772a extends vq.k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f114125e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                int f114126f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                int f114127g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ a0 f114128h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> f114129j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ A f114130k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ e0<SubStateMachineState, SubStateMachineAction> f114131l;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C2772a(a0 a0Var, e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> eVar, A a15, e0<SubStateMachineState, SubStateMachineAction> e0Var, tq.e<? super C2772a> eVar2) {
                    super(2, eVar2);
                    this.f114128h = a0Var;
                    this.f114129j = eVar;
                    this.f114130k = a15;
                    this.f114131l = e0Var;
                }

                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to l10.e$b$a$a for r5v1 'this'  tq.e
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // vq.a
                public final java.lang.Object J(java.lang.Object r6) {
                    /*
                        r5 = this;
                        java.lang.Object r0 = uq.b.e()
                        int r1 = r5.f114127g
                        r2 = 0
                        r3 = 2
                        r4 = 1
                        if (r1 == 0) goto L23
                        if (r1 == r4) goto L1b
                        if (r1 != r3) goto L13
                        oq.u.b(r6)
                        goto L5a
                    L13:
                        java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r6.<init>(r0)
                        throw r6
                    L1b:
                        java.lang.Object r1 = r5.f114125e
                        ju.a0 r1 = (ju.a0) r1
                        oq.u.b(r6)
                        goto L39
                    L23:
                        oq.u.b(r6)
                        ju.a0 r6 = r5.f114128h
                        java.lang.Object r1 = vq.j.a(r6)
                        r5.f114125e = r1
                        r5.f114126f = r2
                        r5.f114127g = r4
                        java.lang.Object r6 = r6.T0(r5)
                        if (r6 != r0) goto L39
                        goto L59
                    L39:
                        l10.e<SubStateMachineState, SubStateMachineAction, InputState extends S, ActionThatTriggeredStartingStateMachine extends A, S, A> r6 = r5.f114129j
                        er.l r6 = l10.e.g(r6)
                        A r1 = r5.f114130k
                        java.lang.Object r6 = r6.b(r1)
                        if (r6 == 0) goto L5a
                        k10.e0<SubStateMachineState, SubStateMachineAction> r1 = r5.f114131l
                        java.lang.Object r4 = vq.j.a(r6)
                        r5.f114125e = r4
                        r5.f114126f = r2
                        r5.f114127g = r3
                        java.lang.Object r6 = r1.a(r6, r5)
                        if (r6 != r0) goto L5a
                    L59:
                        return r0
                    L5a:
                        oq.i0 r6 = oq.i0.f148189a
                        return r6
                    */
                    throw new UnsupportedOperationException("Method not decompiled: l10.e.b.a.C2772a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                    return ((C2772a) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C2772a(this.f114128h, this.f114129j, this.f114130k, this.f114131l, eVar);
                }
            }

            /* JADX INFO: renamed from: l10.e$b$a$b, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C2773b extends vq.k implements p<p0, tq.e<? super i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f114132e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ e0<SubStateMachineState, SubStateMachineAction> f114133f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ a0 f114134g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                final /* synthetic */ a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> f114135h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                final /* synthetic */ e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> f114136j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                final /* synthetic */ er.a<S> f114137k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                final /* synthetic */ w<k10.l<? extends S>> f114138l;

                /* JADX INFO: renamed from: l10.e$b$a$b$a, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "SubStateMachineState", "Lmu/h;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
                static final class C2774a extends vq.k implements p<mu.h<? super SubStateMachineState>, tq.e<? super i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f114139e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ a0 f114140f;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2774a(a0 a0Var, tq.e<? super C2774a> eVar) {
                        super(2, eVar);
                        this.f114140f = a0Var;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        uq.b.e();
                        if (this.f114139e != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        u.b(obj);
                        n.e(this.f114140f);
                        return i0.f148189a;
                    }

                    @Override // er.p
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object B(mu.h<? super SubStateMachineState> hVar, tq.e<? super i0> eVar) {
                        return ((C2774a) v(hVar, eVar)).J(i0.f148189a);
                    }

                    @Override // vq.a
                    public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                        return new C2774a(this.f114140f, eVar);
                    }
                }

                /* JADX INFO: renamed from: l10.e$b$a$b$b, reason: collision with other inner class name */
                @Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0001*\u00020\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "SubStateMachineState", "Lmu/h;", "", "it", "Loq/i0;", "<anonymous>", "(Lmu/h;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 2, 0})
                static final class C2775b extends vq.k implements q<mu.h<? super SubStateMachineState>, Throwable, tq.e<? super i0>, Object> {

                    /* JADX INFO: renamed from: e, reason: collision with root package name */
                    int f114141e;

                    /* JADX INFO: renamed from: f, reason: collision with root package name */
                    final /* synthetic */ a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> f114142f;

                    /* JADX INFO: renamed from: g, reason: collision with root package name */
                    final /* synthetic */ e0<SubStateMachineState, SubStateMachineAction> f114143g;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C2775b(a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> aVar, e0<SubStateMachineState, SubStateMachineAction> e0Var, tq.e<? super C2775b> eVar) {
                        super(3, eVar);
                        this.f114142f = aVar;
                        this.f114143g = e0Var;
                    }

                    @Override // vq.a
                    public final Object J(Object obj) throws Throwable {
                        Object objE = uq.b.e();
                        int i15 = this.f114141e;
                        if (i15 == 0) {
                            u.b(obj);
                            a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> aVar = this.f114142f;
                            e0<SubStateMachineState, SubStateMachineAction> e0Var = this.f114143g;
                            this.f114141e = 1;
                            if (aVar.d(e0Var, this) == objE) {
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

                    @Override // er.q
                    /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
                    public final Object w(mu.h<? super SubStateMachineState> hVar, Throwable th4, tq.e<? super i0> eVar) {
                        return new C2775b(this.f114142f, this.f114143g, eVar).J(i0.f148189a);
                    }
                }

                /* JADX INFO: renamed from: l10.e$b$a$b$c */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                static final class c<T> implements mu.h {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> f114144a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    final /* synthetic */ er.a<S> f114145b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    final /* synthetic */ w<k10.l<? extends S>> f114146c;

                    /* JADX WARN: Multi-variable type inference failed */
                    c(e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> eVar, er.a<? extends S> aVar, w<? super k10.l<? extends S>> wVar) {
                        this.f114144a = eVar;
                        this.f114145b = aVar;
                        this.f114146c = wVar;
                    }

                    @Override // mu.h
                    public final Object F(SubStateMachineState substatemachinestate, tq.e<? super i0> eVar) {
                        Object objL;
                        e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> eVar2 = this.f114144a;
                        er.a<S> aVar = this.f114145b;
                        w<k10.l<? extends S>> wVar = this.f114146c;
                        S sA = aVar.a();
                        return (eVar2.a().a(sA) && (objL = wVar.l((k10.l) ((e) eVar2).stateMapper.B(new c0(sA), substatemachinestate), eVar)) == uq.b.e()) ? objL : i0.f148189a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C2773b(e0<SubStateMachineState, SubStateMachineAction> e0Var, a0 a0Var, a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> aVar, e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> eVar, er.a<? extends S> aVar2, w<? super k10.l<? extends S>> wVar, tq.e<? super C2773b> eVar2) {
                    super(2, eVar2);
                    this.f114133f = e0Var;
                    this.f114134g = a0Var;
                    this.f114135h = aVar;
                    this.f114136j = eVar;
                    this.f114137k = aVar2;
                    this.f114138l = wVar;
                }

                @Override // vq.a
                public final Object J(Object obj) throws Throwable {
                    Object objE = uq.b.e();
                    int i15 = this.f114132e;
                    if (i15 == 0) {
                        u.b(obj);
                        mu.g gVarR = mu.i.R(mu.i.U(this.f114133f.getState(), new C2774a(this.f114134g, null)), new C2775b(this.f114135h, this.f114133f, null));
                        c cVar = new c(this.f114136j, this.f114137k, this.f114138l);
                        this.f114132e = 1;
                        if (gVarR.a(cVar, this) == objE) {
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
                    return ((C2773b) v(p0Var, eVar)).J(i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                    return new C2773b(this.f114133f, this.f114134g, this.f114135h, this.f114136j, this.f114137k, this.f114138l, eVar);
                }
            }

            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            static final class c extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                Object f114147d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                Object f114148e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f114149f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                Object f114150g;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f114151h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f114152j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f114153k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                Object f114154l;

                /* JADX INFO: renamed from: m, reason: collision with root package name */
                Object f114155m;

                /* JADX INFO: renamed from: n, reason: collision with root package name */
                Object f114156n;

                /* JADX INFO: renamed from: p, reason: collision with root package name */
                Object f114157p;

                /* JADX INFO: renamed from: q, reason: collision with root package name */
                Object f114158q;

                /* JADX INFO: renamed from: r, reason: collision with root package name */
                int f114159r;

                /* JADX INFO: renamed from: s, reason: collision with root package name */
                int f114160s;

                /* JADX INFO: renamed from: t, reason: collision with root package name */
                int f114161t;

                /* JADX INFO: renamed from: v, reason: collision with root package name */
                int f114162v;

                /* JADX INFO: renamed from: w, reason: collision with root package name */
                /* synthetic */ Object f114163w;

                /* JADX INFO: renamed from: x, reason: collision with root package name */
                final /* synthetic */ a<T> f114164x;

                /* JADX INFO: renamed from: y, reason: collision with root package name */
                int f114165y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                c(a<? super T> aVar, tq.e<? super c> eVar) {
                    super(eVar);
                    this.f114164x = aVar;
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f114163w = obj;
                    this.f114165y |= PKIFailureInfo.systemUnavail;
                    return this.f114164x.F(null, this);
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            a(e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> eVar, er.a<? extends S> aVar, w<? super k10.l<? extends S>> wVar, a<SubStateMachineState, SubStateMachineAction, ActionThatTriggeredStartingStateMachine> aVar2) {
                this.f114121a = eVar;
                this.f114122b = aVar;
                this.f114123c = wVar;
                this.f114124d = aVar2;
            }

            /* JADX WARN: Code duplicated, block: B:31:0x0181 A[Catch: all -> 0x01a0, LOOP:0: B:29:0x017b->B:31:0x0181, LOOP_END, TryCatch #0 {all -> 0x01a0, blocks: (B:28:0x016d, B:29:0x017b, B:31:0x0181, B:34:0x01a2), top: B:40:0x016d }] */
            /* JADX WARN: Code duplicated, block: B:8:0x001a  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0118, code lost:
            
                if (r2.c(r23, r4, r11, r6, r7) == r8) goto L26;
             */
            @Override // mu.h
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object F(A r23, tq.e<? super oq.i0> r24) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 431
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: l10.e.b.a.F(java.lang.Object, tq.e):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(e<SubStateMachineState, SubStateMachineAction, InputState, ActionThatTriggeredStartingStateMachine, S, A> eVar, er.a<? extends S> aVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f114119h = eVar;
            this.f114120j = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            w wVar = (w) this.f114118g;
            Object objE = uq.b.e();
            int i15 = this.f114117f;
            if (i15 == 0) {
                u.b(obj);
                a aVar = new a();
                mu.g<A> gVarE = this.f114119h.e();
                a aVar2 = new a(this.f114119h, this.f114120j, wVar, aVar);
                this.f114118g = vq.j.a(wVar);
                this.f114116e = vq.j.a(aVar);
                this.f114117f = 1;
                if (gVarE.a(aVar2, this) == objE) {
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
        public final Object B(w<? super k10.l<? extends S>> wVar, tq.e<? super i0> eVar) {
            return ((b) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            b bVar = new b(this.f114119h, this.f114120j, eVar);
            bVar.f114118g = obj;
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(h.a<S> aVar, p<? super ActionThatTriggeredStartingStateMachine, ? super InputState, ? extends e0<SubStateMachineState, SubStateMachineAction>> pVar, mr.c<? extends A> cVar, er.l<? super A, ? extends SubStateMachineAction> lVar, p<? super c0<InputState>, ? super SubStateMachineState, ? extends k10.l<? extends S>> pVar2) {
        this.isInState = aVar;
        this.subStateMachineFactory = pVar;
        this.subActionClass = cVar;
        this.actionMapper = lVar;
        this.stateMapper = pVar2;
    }

    @Override // l10.h
    public h.a<S> a() {
        return this.isInState;
    }

    @Override // l10.h
    public mu.g<k10.l<S>> b(er.a<? extends S> getState) {
        return mu.i.h(new b(this, getState, null));
    }

    public final mr.c<? extends A> j() {
        return this.subActionClass;
    }
}
