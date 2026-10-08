package oc0;

import cb4.DialogData;
import fr.q0;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010#\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010)\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030$8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R \u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00100*8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Loc0/q;", "Ll00/g;", "Loc0/e;", "", "Loc0/f;", "Lyy/a;", "stateMachineFactory", "Lpc0/b;", "mapper", "Lqg0/d;", "deactivateAppUC", "Lcb4/j;", "dialogVMSFactory", "<init>", "(Lyy/a;Lpc0/b;Lqg0/d;Lcb4/j;)V", "state", "Loc0/f$a;", "o9", "(Loc0/e;)Loc0/f$a;", "b", "Lpc0/b;", "c", "Lqg0/d;", "d", "Lcb4/j;", "Lxw/b;", "Loc0/c;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Loc0/e$b;", "f", "Loc0/e$b;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "login_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class q extends l00.g<oc0.e, Object> implements f, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final pc0.b mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final qg0.d deactivateAppUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cb4.j dialogVMSFactory;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<oc0.c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oc0.e.b initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final k10.t<oc0.e, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<f.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<f.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f144608a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f144609b;

        /* JADX INFO: renamed from: oc0.q$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3588a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f144610a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ q f144611b;

            /* JADX INFO: renamed from: oc0.q$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3589a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f144612d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f144613e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f144614f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f144616h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f144617j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f144618k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f144619l;

                public C3589a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f144612d = obj;
                    this.f144613e |= PKIFailureInfo.systemUnavail;
                    return C3588a.this.F(null, this);
                }
            }

            public C3588a(mu.h hVar, q qVar) {
                this.f144610a = hVar;
                this.f144611b = qVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3589a c3589a;
                if (eVar instanceof C3589a) {
                    c3589a = (C3589a) eVar;
                    int i15 = c3589a.f144613e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3589a.f144613e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3589a = new C3589a(eVar);
                    }
                } else {
                    c3589a = new C3589a(eVar);
                }
                Object obj2 = c3589a.f144612d;
                Object objE = uq.b.e();
                int i16 = c3589a.f144613e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f144610a;
                    f.a aVarO9 = this.f144611b.o9((oc0.e) obj);
                    c3589a.f144614f = vq.j.a(obj);
                    c3589a.f144616h = vq.j.a(c3589a);
                    c3589a.f144617j = vq.j.a(obj);
                    c3589a.f144618k = vq.j.a(hVar);
                    c3589a.f144619l = 0;
                    c3589a.f144613e = 1;
                    if (hVar.F(aVarO9, c3589a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, q qVar) {
            this.f144608a = gVar;
            this.f144609b = qVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super f.a> hVar, tq.e eVar) {
            Object objA = this.f144608a.a(new C3588a(hVar, this.f144609b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loc0/a;", "<unused var>", "Loc0/e$b;", "Loq/i0;", "<anonymous>", "(Loc0/a;Loc0/e$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<oc0.a, oc0.e.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144620e;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f144620e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<oc0.c> bVarY1 = q.this.Y1();
                oc0.c.a aVar = oc0.c.a.f144579a;
                this.f144620e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oc0.a aVar, oc0.e.b bVar, tq.e<? super i0> eVar) {
            return q.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loc0/d;", "action", "Lk10/c0;", "Loc0/e$b;", "state", "Lk10/l;", "Loc0/e;", "<anonymous>", "(Loc0/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ShowDialog, c0<oc0.e.b>, tq.e<? super k10.l<? extends oc0.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144622e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144623f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f144624g;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oc0.e.Dialog O(q qVar, ShowDialog showDialog, oc0.e.b bVar) {
            return new oc0.e.Dialog(qVar.dialogVMSFactory.a(showDialog.getDialogData()));
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final ShowDialog showDialog = (ShowDialog) this.f144623f;
            c0 c0Var = (c0) this.f144624g;
            uq.b.e();
            if (this.f144622e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: oc0.r
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.c.O(qVar, showDialog, (e.b) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDialog showDialog, c0<oc0.e.b> c0Var, tq.e<? super k10.l<? extends oc0.e>> eVar) {
            c cVar = q.this.new c(eVar);
            cVar.f144623f = showDialog;
            cVar.f144624g = c0Var;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Loc0/a;", "<unused var>", "Lk10/c0;", "Loc0/e$a;", "state", "Lk10/l;", "Loc0/e;", "<anonymous>", "(Loc0/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<oc0.a, c0<oc0.e.Dialog>, tq.e<? super k10.l<? extends oc0.e>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144626e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f144627f;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oc0.e.b O(q qVar, oc0.e.Dialog dialog) {
            return qVar.initialState;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f144627f;
            uq.b.e();
            if (this.f144626e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            final q qVar = q.this;
            return c0Var.d(new er.l() { // from class: oc0.s
                @Override // er.l
                public final Object b(Object obj2) {
                    return q.d.O(qVar, (e.Dialog) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(oc0.a aVar, c0<oc0.e.Dialog> c0Var, tq.e<? super k10.l<? extends oc0.e>> eVar) {
            d dVar = q.this.new d(eVar);
            dVar.f144627f = c0Var;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Loc0/b;", "<unused var>", "Loc0/e$a;", "Loq/i0;", "<anonymous>", "(Loc0/b;Loc0/e$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<oc0.b, oc0.e.Dialog, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f144629e;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0040, code lost:
        
            if (r5.F(r1, r4) == r0) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f144629e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L43
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                oc0.q r5 = oc0.q.this
                qg0.d r5 = oc0.q.k9(r5)
                gz.b$a$a r1 = gz.b.a.C1792a.f78542a
                r4.f144629e = r3
                java.lang.Object r5 = r5.c(r1, r4)
                if (r5 != r0) goto L32
                goto L42
            L32:
                oc0.q r5 = oc0.q.this
                xw.b r5 = r5.Y1()
                oc0.c$b r1 = oc0.c.b.f144580a
                r4.f144629e = r2
                java.lang.Object r5 = r5.F(r1, r4)
                if (r5 != r0) goto L43
            L42:
                return r0
            L43:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: oc0.q.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(oc0.b bVar, oc0.e.Dialog dialog, tq.e<? super i0> eVar) {
            return q.this.new e(eVar).J(i0.f148189a);
        }
    }

    public q(yy.a aVar, pc0.b bVar, qg0.d dVar, cb4.j jVar) {
        this.mapper = bVar;
        this.deactivateAppUC = dVar;
        this.dialogVMSFactory = jVar;
        oc0.e.b bVar2 = oc0.e.b.f144583a;
        this.initialState = bVar2;
        this.stateMachine = aVar.a(bVar2, new er.l() { // from class: oc0.m
            @Override // er.l
            public final Object b(Object obj) {
                return q.r9(this.f144597a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), o9(bVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f.a o9(oc0.e state) {
        return this.mapper.b(new pc0.b.Params(state, b9(oc0.b.f144578a), b9(oc0.a.f144577a), new er.l() { // from class: oc0.p
            @Override // er.l
            public final Object b(Object obj) {
                return q.p9(this.f144600a, (DialogData) obj);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(q qVar, DialogData dialogData) {
        qVar.d9(new ShowDialog(dialogData));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(final q qVar, k10.v vVar) {
        vVar.c(q0.c(oc0.e.b.class), new er.l() { // from class: oc0.n
            @Override // er.l
            public final Object b(Object obj) {
                return q.s9(this.f144598a, (z) obj);
            }
        });
        vVar.c(q0.c(oc0.e.Dialog.class), new er.l() { // from class: oc0.o
            @Override // er.l
            public final Object b(Object obj) {
                return q.t9(this.f144599a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s9(q qVar, z zVar) {
        b bVar = qVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(oc0.a.class), oVar, bVar);
        zVar.v(q0.c(ShowDialog.class), oVar, qVar.new c(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(q qVar, z zVar) {
        d dVar = qVar.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(oc0.a.class), oVar, dVar);
        zVar.x(q0.c(oc0.b.class), oVar, qVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<oc0.c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<oc0.e, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<f.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: q9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
