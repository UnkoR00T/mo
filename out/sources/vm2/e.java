package vm2;

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
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004B\u0019\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001d\u0010\u001bJ\u000f\u0010\u001e\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020 H\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020 H\u0016¢\u0006\u0004\b$\u0010%J\u000f\u0010'\u001a\u00020&H\u0016¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0016¢\u0006\u0004\b)\u0010\u0010R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010-\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010,R&\u00103\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R \u00109\u001a\b\u0012\u0004\u0012\u00020\u0002048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108R \u0010@\u001a\b\u0012\u0004\u0012\u00020;0:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?¨\u0006A"}, d2 = {"Lvm2/e;", "Ll00/g;", "Lvm2/b;", "Lvm2/a;", "", "Lyy/a;", "stateMachineFactory", "Lpn2/b;", "networkSecurityIssuesCloseFormDialogMapper", "<init>", "(Lyy/a;Lpn2/b;)V", "Lcb4/d;", "m9", "()Lcb4/d;", "Loq/i0;", "o9", "()V", "", "", "b1", "()Ljava/util/List;", "", "websiteIndex", "j1", "(I)V", "website", "C3", "(Ljava/lang/String;)V", "description", "y7", "Y3", "()Ljava/lang/String;", "Lkm2/a$a;", "data", "k1", "(Lkm2/a$a;)V", "p3", "()Lkm2/a$a;", "Ldn2/a$a;", "c", "()Ldn2/a$a;", "t", "b", "Lpn2/b;", "Lvm2/b;", "initialState", "Lk10/t;", "d", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "e", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "Lxw/b;", "Lvm2/a$d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "networksecurityissues_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e extends l00.g<State, vm2.a> implements l00.e, zm2.a, xm2.a, bn2.a, km2.a, dn2.a, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pn2.b networkSecurityIssuesCloseFormDialogMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final t<State, vm2.a> stateMachine;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0<State> state;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<vm2.a.d> navAction;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvm2/a$c;", "<unused var>", "Lvm2/b;", "Loq/i0;", "<anonymous>", "(Lvm2/a$c;Lvm2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements q<vm2.a.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207468e;

        a(tq.e<? super a> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207468e;
            if (i15 == 0) {
                u.b(obj);
                e.this.d9(vm2.a.b.f207449a);
                e eVar = e.this;
                vm2.a.d.C5442a c5442a = vm2.a.d.C5442a.f207451a;
                this.f207468e = 1;
                if (eVar.F(c5442a, this) == objE) {
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
        public final Object w(vm2.a.c cVar, State state, tq.e<? super i0> eVar) {
            return e.this.new a(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvm2/a$h;", "<unused var>", "Lvm2/b;", "Loq/i0;", "<anonymous>", "(Lvm2/a$h;Lvm2/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<vm2.a.h, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207470e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f207470e;
            if (i15 == 0) {
                u.b(obj);
                e eVar = e.this;
                vm2.a.d.ShowCloseDialog showCloseDialog = new vm2.a.d.ShowCloseDialog(e.this.m9());
                this.f207470e = 1;
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
        public final Object w(vm2.a.h hVar, State state, tq.e<? super i0> eVar) {
            return e.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvm2/a$b;", "<unused var>", "Lk10/c0;", "Lvm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lvm2/a$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<vm2.a.b, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207473f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(e eVar, State state) {
            return eVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f207473f;
            uq.b.e();
            if (this.f207472e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            final e eVar = e.this;
            return c0Var.b(new er.l() { // from class: vm2.f
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.c.O(eVar, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vm2.a.b bVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            c cVar = e.this.new c(eVar);
            cVar.f207473f = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvm2/a$a;", "action", "Lk10/c0;", "Lvm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lvm2/a$a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements q<vm2.a.AddIllegalContent, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207475e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207476f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207477g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, vm2.a.AddIllegalContent addIllegalContent, State state) {
            List listI1 = v.i1(((State) c0Var.a()).d());
            listI1.add(addIllegalContent.getIllegalContent());
            return State.b(state, listI1, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vm2.a.AddIllegalContent addIllegalContent = (vm2.a.AddIllegalContent) this.f207476f;
            final c0 c0Var = (c0) this.f207477g;
            uq.b.e();
            if (this.f207475e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: vm2.g
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.d.O(c0Var, addIllegalContent, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vm2.a.AddIllegalContent addIllegalContent, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            d dVar = new d(eVar);
            dVar.f207476f = addIllegalContent;
            dVar.f207477g = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    /* JADX INFO: renamed from: vm2.e$e, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvm2/a$e;", "action", "Lk10/c0;", "Lvm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lvm2/a$e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class C5443e extends vq.k implements q<vm2.a.RemoveIllegalContent, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207478e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207479f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207480g;

        C5443e(tq.e<? super C5443e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(c0 c0Var, vm2.a.RemoveIllegalContent removeIllegalContent, State state) {
            List listI1 = v.i1(((State) c0Var.a()).d());
            listI1.remove(removeIllegalContent.getIllegalContentIndex());
            return State.b(state, listI1, null, null, 6, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vm2.a.RemoveIllegalContent removeIllegalContent = (vm2.a.RemoveIllegalContent) this.f207479f;
            final c0 c0Var = (c0) this.f207480g;
            uq.b.e();
            if (this.f207478e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: vm2.h
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.C5443e.O(c0Var, removeIllegalContent, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vm2.a.RemoveIllegalContent removeIllegalContent, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            C5443e c5443e = new C5443e(eVar);
            c5443e.f207479f = removeIllegalContent;
            c5443e.f207480g = c0Var;
            return c5443e.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvm2/a$g;", "action", "Lk10/c0;", "Lvm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lvm2/a$g;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<vm2.a.SaveIssueDescription, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207481e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207482f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207483g;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(vm2.a.SaveIssueDescription saveIssueDescription, State state) {
            return State.b(state, null, saveIssueDescription.getIssueDescription(), null, 5, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vm2.a.SaveIssueDescription saveIssueDescription = (vm2.a.SaveIssueDescription) this.f207482f;
            c0 c0Var = (c0) this.f207483g;
            uq.b.e();
            if (this.f207481e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: vm2.i
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.f.O(saveIssueDescription, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vm2.a.SaveIssueDescription saveIssueDescription, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f207482f = saveIssueDescription;
            fVar.f207483g = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lvm2/a$f;", "action", "Lk10/c0;", "Lvm2/b;", "state", "Lk10/l;", "<anonymous>", "(Lvm2/a$f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<vm2.a.SaveContactData, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f207484e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f207485f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f207486g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(vm2.a.SaveContactData saveContactData, State state) {
            return State.b(state, null, null, saveContactData.getContactData(), 3, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final vm2.a.SaveContactData saveContactData = (vm2.a.SaveContactData) this.f207485f;
            c0 c0Var = (c0) this.f207486g;
            uq.b.e();
            if (this.f207484e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return c0Var.b(new er.l() { // from class: vm2.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return e.g.O(saveContactData, (State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(vm2.a.SaveContactData saveContactData, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = new g(eVar);
            gVar.f207485f = saveContactData;
            gVar.f207486g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public e(yy.a aVar, pn2.b bVar) {
        this.networkSecurityIssuesCloseFormDialogMapper = bVar;
        List listN = v.n();
        km2.b bVar2 = km2.b.ILLEGAL_CONTENT;
        hz.b.C2039b c2039b = hz.b.C2039b.f86846c;
        State state = new State(listN, "", new km2.a.ContactData(bVar2, false, "", c2039b, false, c2039b));
        this.initialState = state;
        this.stateMachine = aVar.a(state, new er.l() { // from class: vm2.c
            @Override // er.l
            public final Object b(Object obj) {
                return e.p9(this.f207461a, (k10.v) obj);
            }
        });
        this.state = a9(e9().getState(), state);
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DialogData m9() {
        return this.networkSecurityIssuesCloseFormDialogMapper.b(new pn2.b.Params(b9(vm2.a.c.f207450a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final e eVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: vm2.d
            @Override // er.l
            public final Object b(Object obj) {
                return e.q9(this.f207462a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(e eVar, z zVar) {
        a aVar = eVar.new a(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(vm2.a.c.class), oVar, aVar);
        zVar.x(q0.c(vm2.a.h.class), oVar, eVar.new b(null));
        zVar.v(q0.c(vm2.a.b.class), oVar, eVar.new c(null));
        zVar.v(q0.c(vm2.a.AddIllegalContent.class), oVar, new d(null));
        zVar.v(q0.c(vm2.a.RemoveIllegalContent.class), oVar, new C5443e(null));
        zVar.v(q0.c(vm2.a.SaveIssueDescription.class), oVar, new f(null));
        zVar.v(q0.c(vm2.a.SaveContactData.class), oVar, new g(null));
        return i0.f148189a;
    }

    @Override // xm2.a
    public void C3(String website) {
        d9(new vm2.a.AddIllegalContent(website));
    }

    @Override // zx.b
    public xw.b<vm2.a.d> Y1() {
        return this.navAction;
    }

    @Override // bn2.a
    public String Y3() {
        return getState().getValue().getIssueDescription();
    }

    @Override // zm2.a
    public List<String> b1() {
        return getState().getValue().d();
    }

    @Override // dn2.a
    public dn2.a.SummaryData c() {
        return new dn2.a.SummaryData(getState().getValue().d(), getState().getValue().getIssueDescription(), getState().getValue().getContactData());
    }

    @Override // l00.g
    protected t<State, vm2.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<State> getState() {
        return this.state;
    }

    @Override // zm2.a
    public void j1(int websiteIndex) {
        d9(new vm2.a.RemoveIllegalContent(websiteIndex));
    }

    @Override // km2.a
    public void k1(km2.a.ContactData data) {
        d9(new vm2.a.SaveContactData(data));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(vm2.a.d dVar, tq.e<? super i0> eVar) {
        return super.F(dVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }

    public void o9() {
        d9(vm2.a.h.f207457a);
    }

    @Override // km2.a
    public km2.a.ContactData p3() {
        return getState().getValue().getContactData();
    }

    @Override // dn2.a
    public void t() {
        d9(vm2.a.b.f207449a);
    }

    @Override // bn2.a
    public void y7(String description) {
        d9(new vm2.a.SaveIssueDescription(description));
    }
}
