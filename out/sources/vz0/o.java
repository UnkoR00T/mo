package vz0;

import fr.q0;
import iq0.ApplicationFormServiceGroup;
import iq0.ApplicationFormServices;
import k10.c0;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR&\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001b8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R \u0010.\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lvz0/o;", "Ll00/g;", "Lvz0/h;", "Lvz0/g;", "Lvz0/i;", "", "Lyy/a;", "stateMachineFactory", "Lwz0/b;", "applicationCategoriesScreenMapper", "Ljq0/a;", "getApplicationFormServicesUseCase", "Lib4/c;", "genericDomainErrorMapper", "<init>", "(Lyy/a;Lwz0/b;Ljq0/a;Lib4/c;)V", "Ldx/b;", "error", "Loq/i0;", "q9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lwz0/b;", "c", "Ljq0/a;", "d", "Lib4/c;", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lvz0/g$d;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "Lvz0/i$a;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "applicationforms_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class o extends l00.g<h, g> implements i, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final wz0.b applicationCategoriesScreenMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final jq0.a getApplicationFormServicesUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final k10.t<h, g> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<g.d> navAction = new xw.b<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<i.a> state = a9(new a(e9().getState(), this), i.a.b.f208746a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<i.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f208761a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ o f208762b;

        /* JADX INFO: renamed from: vz0.o$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C5490a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f208763a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f208764b;

            /* JADX INFO: renamed from: vz0.o$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5491a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f208765d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f208766e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f208767f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f208769h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f208770j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f208771k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f208772l;

                public C5491a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f208765d = obj;
                    this.f208766e |= PKIFailureInfo.systemUnavail;
                    return C5490a.this.F(null, this);
                }
            }

            public C5490a(mu.h hVar, o oVar) {
                this.f208763a = hVar;
                this.f208764b = oVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5491a c5491a;
                if (eVar instanceof C5491a) {
                    c5491a = (C5491a) eVar;
                    int i15 = c5491a.f208766e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5491a.f208766e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5491a = new C5491a(eVar);
                    }
                } else {
                    c5491a = new C5491a(eVar);
                }
                Object obj2 = c5491a.f208765d;
                Object objE = uq.b.e();
                int i16 = c5491a.f208766e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f208763a;
                    i.a aVarB = this.f208764b.applicationCategoriesScreenMapper.b(new wz0.b.Params((h) obj, this.f208764b.b9(g.a.f208734a), this.f208764b.new b()));
                    c5491a.f208767f = vq.j.a(obj);
                    c5491a.f208769h = vq.j.a(c5491a);
                    c5491a.f208770j = vq.j.a(obj);
                    c5491a.f208771k = vq.j.a(hVar);
                    c5491a.f208772l = 0;
                    c5491a.f208766e = 1;
                    if (hVar.F(aVarB, c5491a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj2);
                }
                return i0.f148189a;
            }
        }

        public a(mu.g gVar, o oVar) {
            this.f208761a = gVar;
            this.f208762b = oVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super i.a> hVar, tq.e eVar) {
            Object objA = this.f208761a.a(new C5490a(hVar, this.f208762b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class b implements er.l<ApplicationFormServiceGroup, i0> {
        b() {
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(ApplicationFormServiceGroup applicationFormServiceGroup) {
            c(applicationFormServiceGroup);
            return i0.f148189a;
        }

        public final void c(ApplicationFormServiceGroup applicationFormServiceGroup) {
            o.this.d9(new g.GoToApplicationList(applicationFormServiceGroup));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvz0/g$a;", "<unused var>", "Lvz0/h;", "Loq/i0;", "<anonymous>", "(Lvz0/g$a;Lvz0/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<g.a, h, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208774e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208774e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g.d> bVarY1 = o.this.Y1();
                g.d.a aVar = g.d.a.f208737a;
                this.f208774e = 1;
                if (bVarY1.F(aVar, this) == objE) {
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
        public final Object w(g.a aVar, h hVar, tq.e<? super i0> eVar) {
            return o.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvz0/h$b;", "it", "Loq/i0;", "<anonymous>", "(Lvz0/h$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<h.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208776e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f208776e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            o.this.d9(g.b.f208735a);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h.b bVar, tq.e<? super i0> eVar) {
            return ((d) v(bVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return o.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lvz0/g$b;", "<unused var>", "Lk10/c0;", "Lvz0/h$b;", "state", "Lk10/l;", "Lvz0/h;", "<anonymous>", "(Lvz0/g$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<g.b, c0<h.b>, tq.e<? super k10.l<? extends h>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f208778e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f208779f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f208780g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f208781h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f208782j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f208783k;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.c V(h.b bVar) {
            return h.c.f208742a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final h.DataLoaded X(ApplicationFormServices applicationFormServices, h.b bVar) {
            return new h.DataLoaded(applicationFormServices.a());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
        
            if (r2.q9(r4, r5) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f208783k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f208782j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r1 = r5.f208779f
                dx.b r1 = (dx.b) r1
                java.lang.Object r1 = r5.f208778e
                dx.i r1 = (dx.i) r1
                oq.u.b(r6)
                goto L6d
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                oq.u.b(r6)
                goto L40
            L2a:
                oq.u.b(r6)
                vz0.o r6 = vz0.o.this
                jq0.a r6 = vz0.o.o9(r6)
                gz.b$a$a r2 = gz.b.a.C1792a.f78542a
                r5.f208783k = r0
                r5.f208782j = r4
                java.lang.Object r6 = r6.c(r2, r5)
                if (r6 != r1) goto L40
                goto L6c
            L40:
                dx.i r6 = (dx.i) r6
                vz0.o r2 = vz0.o.this
                boolean r4 = r6 instanceof dx.i.Left
                if (r4 == 0) goto L72
                r4 = r6
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                r5.f208783k = r0
                java.lang.Object r6 = vq.j.a(r6)
                r5.f208778e = r6
                java.lang.Object r6 = vq.j.a(r4)
                r5.f208779f = r6
                r6 = 0
                r5.f208780g = r6
                r5.f208781h = r6
                r5.f208782j = r3
                java.lang.Object r6 = vz0.o.p9(r2, r4, r5)
                if (r6 != r1) goto L6d
            L6c:
                return r1
            L6d:
                k10.l r6 = r0.c()
                return r6
            L72:
                boolean r1 = r6 instanceof dx.i.Right
                if (r1 == 0) goto L9c
                dx.i$c r6 = (dx.i.Right) r6
                java.lang.Object r6 = r6.b()
                iq0.k r6 = (iq0.ApplicationFormServices) r6
                java.util.List r1 = r6.a()
                boolean r1 = r1.isEmpty()
                if (r1 == 0) goto L92
                vz0.p r6 = new vz0.p
                r6.<init>()
                k10.l r6 = r0.d(r6)
                return r6
            L92:
                vz0.q r1 = new vz0.q
                r1.<init>()
                k10.l r6 = r0.d(r1)
                return r6
            L9c:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: vz0.o.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(g.b bVar, c0<h.b> c0Var, tq.e<? super k10.l<? extends h>> eVar) {
            e eVar2 = o.this.new e(eVar);
            eVar2.f208783k = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvz0/g$c;", "action", "Lvz0/h$a;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lvz0/g$c;Lvz0/h$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<g.GoToApplicationList, h.DataLoaded, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208785e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f208786f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            g.GoToApplicationList goToApplicationList = (g.GoToApplicationList) this.f208786f;
            Object objE = uq.b.e();
            int i15 = this.f208785e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<g.d> bVarY1 = o.this.Y1();
                g.d.GoToApplicationList goToApplicationList2 = new g.d.GoToApplicationList(goToApplicationList.getGroup());
                this.f208786f = vq.j.a(goToApplicationList);
                this.f208785e = 1;
                if (bVarY1.F(goToApplicationList2, this) == objE) {
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
        public final Object w(g.GoToApplicationList goToApplicationList, h.DataLoaded dataLoaded, tq.e<? super i0> eVar) {
            f fVar = o.this.new f(eVar);
            fVar.f208786f = goToApplicationList;
            return fVar.J(i0.f148189a);
        }
    }

    public o(yy.a aVar, wz0.b bVar, jq0.a aVar2, ib4.c cVar) {
        this.applicationCategoriesScreenMapper = bVar;
        this.getApplicationFormServicesUseCase = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.stateMachine = aVar.a(h.b.f208741a, new er.l() { // from class: vz0.j
            @Override // er.l
            public final Object b(Object obj) {
                return o.t9(this.f208750a, (v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q9(dx.b bVar, tq.e<? super i0> eVar) {
        Object objF = Y1().F(new g.d.ShowError(this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: vz0.n
            @Override // er.l
            public final Object b(Object obj) {
                return o.r9(this.f208754a, (ib4.c.b) obj);
            }
        }, 2, null))), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r9(o oVar, ib4.c.b bVar) {
        if ((bVar instanceof ib4.c.b.a.Close) || (bVar instanceof ib4.c.b.a.Primary) || (bVar instanceof ib4.c.b.a.Secondary) || fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a)) {
            oVar.d9(g.a.f208734a);
        } else {
            if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                throw new oq.p();
            }
            oVar.d9(g.b.f208735a);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final o oVar, v vVar) {
        vVar.c(q0.c(h.class), new er.l() { // from class: vz0.k
            @Override // er.l
            public final Object b(Object obj) {
                return o.u9(this.f208751a, (z) obj);
            }
        });
        vVar.c(q0.c(h.b.class), new er.l() { // from class: vz0.l
            @Override // er.l
            public final Object b(Object obj) {
                return o.v9(this.f208752a, (z) obj);
            }
        });
        vVar.c(q0.c(h.DataLoaded.class), new er.l() { // from class: vz0.m
            @Override // er.l
            public final Object b(Object obj) {
                return o.w9(this.f208753a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(o oVar, z zVar) {
        c cVar = oVar.new c(null);
        zVar.x(q0.c(g.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(o oVar, z zVar) {
        zVar.C(oVar.new d(null));
        e eVar = oVar.new e(null);
        zVar.v(q0.c(g.b.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9(o oVar, z zVar) {
        f fVar = oVar.new f(null);
        zVar.x(q0.c(g.GoToApplicationList.class), k10.o.CANCEL_PREVIOUS, fVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<g.d> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<h, g> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<i.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i.a aVar) {
        super.P5(aVar);
    }
}
