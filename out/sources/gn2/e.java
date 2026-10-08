package gn2;

import cb4.DialogData;
import er.q;
import fr.q0;
import java.util.List;
import k10.c0;
import k10.o;
import k10.t;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes9.dex */
@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010 \u001a\u00020\u000e2\u0006\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u000eH\u0016¢\u0006\u0004\b*\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010-R&\u00104\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030/8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b2\u00103R \u0010:\u001a\b\u0012\u0004\u0012\u00020\u0002058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b6\u00107\u001a\u0004\b8\u00109R \u0010A\u001a\b\u0012\u0004\u0012\u00020<0;8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@¨\u0006B"}, d2 = {"Lgn2/e;", "Ll00/g;", "Lgn2/b;", "Lgn2/a;", "", "Lyy/a;", "stateMachineFactory", "Lpn2/d;", "networkSecurityIssuesCloseFormDialogMapper", "<init>", "(Lyy/a;Lpn2/d;)V", "Lcb4/d;", "m9", "()Lcb4/d;", "Loq/i0;", "o9", "()V", "", "", "s6", "()Ljava/util/List;", "", "websiteIndex", "w6", "(I)V", "Lmn2/a$a;", "data", "z6", "(Lmn2/a$a;)V", "g3", "()Lmn2/a$a;", "website", "M4", "(Ljava/lang/String;)V", "Lkm2/a$a;", "k1", "(Lkm2/a$a;)V", "p3", "()Lkm2/a$a;", "Lon2/a$a;", "c", "()Lon2/a$a;", "t", "b", "Lpn2/d;", "Lgn2/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lgn2/a$d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends l00.g<State, gn2.a> implements l00.e, kn2.a, in2.a, mn2.a, km2.a, on2.a, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pn2.d networkSecurityIssuesCloseFormDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, gn2.a> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<gn2.a.d> navAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgn2/a$c;", "<unused var>", "Lgn2/b;", "Loq/i0;", "<anonymous>", "(Lgn2/a$c;Lgn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements q<gn2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75022e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f75022e;
            if (i15 == 0) {
                u.b(obj);
                e.this.d9(gn2.a.b.f75002a);
                e eVar = e.this;
                gn2.a.d.C1698a c1698a = gn2.a.d.C1698a.f75004a;
                this.f75022e = 1;
                if (eVar.F(c1698a, this) == objE) {
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
        public final Object w(gn2.a.c cVar, State state, tq.e<? super i0> eVar) {
            return e.this.new a(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lgn2/a$h;", "<unused var>", "Lgn2/b;", "Loq/i0;", "<anonymous>", "(Lgn2/a$h;Lgn2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<gn2.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75024e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f75024e;
            if (i15 == 0) {
                u.b(obj);
                e eVar = e.this;
                gn2.a.d.ShowCloseDialog showCloseDialog = new gn2.a.d.ShowCloseDialog(e.this.m9());
                this.f75024e = 1;
                if (eVar.F(showCloseDialog, this) == objE) {
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
        public final Object w(gn2.a.h hVar, State state, tq.e<? super i0> eVar) {
            return e.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgn2/a$b;", "<unused var>", "Lk10/c0;", "Lgn2/b;", "state", "Lk10/l;", "<anonymous>", "(Lgn2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<gn2.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75026e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75027f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(e eVar, State state) {
            return eVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f75027f;
            uq.b.e();
            if (this.f75026e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final e eVar = e.this;
            return c0Var.b(new er.l() { // from class: gn2.f
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.c.O(eVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gn2.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = e.this.new c(eVar);
            cVar.f75027f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgn2/a$a;", "action", "Lk10/c0;", "Lgn2/b;", "state", "Lk10/l;", "<anonymous>", "(Lgn2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<gn2.a.AddMaliciousWebsite, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75029e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75030f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75031g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, gn2.a.AddMaliciousWebsite addMaliciousWebsite, State state) {
            List listI1 = v.i1(((State) c0Var.a()).e());
            listI1.add(addMaliciousWebsite.getMaliciousWebsite());
            return State.b(state, listI1, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gn2.a.AddMaliciousWebsite addMaliciousWebsite = (gn2.a.AddMaliciousWebsite) this.f75030f;
            final c0 c0Var = (c0) this.f75031g;
            uq.b.e();
            if (this.f75029e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: gn2.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.d.O(c0Var, addMaliciousWebsite, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gn2.a.AddMaliciousWebsite addMaliciousWebsite, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f75030f = addMaliciousWebsite;
            dVar.f75031g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: gn2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgn2/a$e;", "action", "Lk10/c0;", "Lgn2/b;", "state", "Lk10/l;", "<anonymous>", "(Lgn2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C1699e extends vq.k implements q<gn2.a.RemoveMaliciousWebsite, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75032e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75033f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75034g;

        C1699e(tq.e<? super C1699e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, gn2.a.RemoveMaliciousWebsite removeMaliciousWebsite, State state) {
            List listI1 = v.i1(((State) c0Var.a()).e());
            listI1.remove(removeMaliciousWebsite.getWebsiteIndex());
            return State.b(state, listI1, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gn2.a.RemoveMaliciousWebsite removeMaliciousWebsite = (gn2.a.RemoveMaliciousWebsite) this.f75033f;
            final c0 c0Var = (c0) this.f75034g;
            uq.b.e();
            if (this.f75032e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: gn2.h
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.C1699e.O(c0Var, removeMaliciousWebsite, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gn2.a.RemoveMaliciousWebsite removeMaliciousWebsite, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C1699e c1699e = new C1699e(eVar);
            c1699e.f75033f = removeMaliciousWebsite;
            c1699e.f75034g = c0Var;
            return c1699e.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgn2/a$g;", "action", "Lk10/c0;", "Lgn2/b;", "state", "Lk10/l;", "<anonymous>", "(Lgn2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<gn2.a.SaveIssueDescription, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75035e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75036f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75037g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(gn2.a.SaveIssueDescription saveIssueDescription, State state) {
            return State.b(state, null, saveIssueDescription.getIssueDescriptionData(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gn2.a.SaveIssueDescription saveIssueDescription = (gn2.a.SaveIssueDescription) this.f75036f;
            c0 c0Var = (c0) this.f75037g;
            uq.b.e();
            if (this.f75035e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: gn2.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.f.O(saveIssueDescription, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gn2.a.SaveIssueDescription saveIssueDescription, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f75036f = saveIssueDescription;
            fVar.f75037g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lgn2/a$f;", "action", "Lk10/c0;", "Lgn2/b;", "state", "Lk10/l;", "<anonymous>", "(Lgn2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<gn2.a.SaveContactData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f75038e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f75039f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f75040g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(gn2.a.SaveContactData saveContactData, State state) {
            return State.b(state, null, null, saveContactData.getContactData(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final gn2.a.SaveContactData saveContactData = (gn2.a.SaveContactData) this.f75039f;
            c0 c0Var = (c0) this.f75040g;
            uq.b.e();
            if (this.f75038e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: gn2.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.g.O(saveContactData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(gn2.a.SaveContactData saveContactData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f75039f = saveContactData;
            gVar.f75040g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public e(yy.a aVar, pn2.d dVar) {
        this.networkSecurityIssuesCloseFormDialogMapper = dVar;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        State state = new State(v.n(), new mn2.a.IssueDescriptionData("", c2039b), new km2.a.ContactData(km2.b.MALICIOUS_WEBSITE, false, "", c2039b, false, c2039b));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: gn2.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.p9(this.f75015a, (k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData m9() {
        return this.networkSecurityIssuesCloseFormDialogMapper.b(new pn2.d.Params(b9(gn2.a.c.f75003a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final e eVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: gn2.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.q9(this.f75016a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(e eVar, z zVar) {
        a aVar = eVar.new a(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(gn2.a.c.class), oVar, aVar);
        zVar.x(q0.c(gn2.a.h.class), oVar, eVar.new b(null));
        zVar.v(q0.c(gn2.a.b.class), oVar, eVar.new c(null));
        zVar.v(q0.c(gn2.a.AddMaliciousWebsite.class), oVar, new d(null));
        zVar.v(q0.c(gn2.a.RemoveMaliciousWebsite.class), oVar, new C1699e(null));
        zVar.v(q0.c(gn2.a.SaveIssueDescription.class), oVar, new f(null));
        zVar.v(q0.c(gn2.a.SaveContactData.class), oVar, new g(null));
        return i0.f148189a;
    }

    @Override // in2.a
    public void M4(String website) {
        d9(new gn2.a.AddMaliciousWebsite(website));
    }

    @Override // zx.b
    public xw.b<gn2.a.d> Y1() {
        return this.navAction;
    }

    @Override // on2.a
    public on2.a.SummaryData c() {
        return new on2.a.SummaryData(getState().getValue().e(), getState().getValue().getIssueDescriptionData().getIssueDescription(), getState().getValue().getContactData());
    }

    @Override // l00.g
    protected t<State, gn2.a> e9() {
        return this.stateMachine;
    }

    @Override // mn2.a
    public mn2.a.IssueDescriptionData g3() {
        return getState().getValue().getIssueDescriptionData();
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // km2.a
    public void k1(km2.a.ContactData data) {
        d9(new gn2.a.SaveContactData(data));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(gn2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    public void o9() {
        d9(gn2.a.h.f75011a);
    }

    @Override // km2.a
    public km2.a.ContactData p3() {
        return getState().getValue().getContactData();
    }

    @Override // kn2.a
    public List<String> s6() {
        return getState().getValue().e();
    }

    @Override // on2.a
    public void t() {
        d9(gn2.a.b.f75002a);
    }

    @Override // kn2.a
    public void w6(int websiteIndex) {
        d9(new gn2.a.RemoveMaliciousWebsite(websiteIndex));
    }

    @Override // mn2.a
    public void z6(mn2.a.IssueDescriptionData data) {
        d9(new gn2.a.SaveIssueDescription(data));
    }
}
