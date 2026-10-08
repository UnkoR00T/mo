package fn1;

import al0.w0;
import er.l;
import er.q;
import f00.j0;
import fr.q0;
import k10.o;
import k10.t;
import k10.v;
import k10.z;
import ml0.m;
import mu.p0;
import oq.i0;
import oq.p;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vq.k;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0004:\u0001;B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0001\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R&\u00105\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003008\u0014X\u0094\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:¨\u0006<"}, d2 = {"Lfn1/f;", "Ll00/g;", "Lfn1/b;", "Lfn1/a;", "", "Lml0/m;", "getIdSuspensionChildDataUC", "Lac4/a;", "callActionWithLoaderUseCase", "Lib4/c;", "genericDomainErrorMapper", "Lhm1/a;", "createCertReceiveMethodDataUC", "Lgn1/a;", "contract", "Lyy/a;", "stateMachineFactory", "<init>", "(Lml0/m;Lac4/a;Lib4/c;Lhm1/a;Lgn1/a;Lyy/a;)V", "state", "Lfn1/c;", "q9", "(Lfn1/b;)Lfn1/c;", "Lal0/w0;", "selectedChild", "Loq/i0;", "r9", "(Lal0/w0;)V", "b", "Lml0/m;", "c", "Lac4/a;", "d", "Lib4/c;", "e", "Lhm1/a;", "f", "Lgn1/a;", "g", "Lfn1/b;", "initialState", "Lxw/b;", "Lfn1/a$a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class f extends l00.g<fn1.b, fn1.a> implements l00.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final m getIdSuspensionChildDataUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final hm1.a createCertReceiveMethodDataUC;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final gn1.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final fn1.b initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fn1.a.InterfaceC1456a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final t<fn1.b, fn1.a> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<fn1.c> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lfn1/f$a;", "", "Lgn1/a;", "Lfn1/f;", "dependentidsuspension_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0 {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fn1.c> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f65488a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f f65489b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f65490a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ f f65491b;

            /* JADX INFO: renamed from: fn1.f$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1458a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f65492d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f65493e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f65494f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f65496h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f65497j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f65498k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f65499l;

                public C1458a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f65492d = obj;
                    this.f65493e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, f fVar) {
                this.f65490a = hVar;
                this.f65491b = fVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1458a c1458a;
                if (eVar instanceof C1458a) {
                    c1458a = (C1458a) eVar;
                    int i15 = c1458a.f65493e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1458a.f65493e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1458a = new C1458a(eVar);
                    }
                } else {
                    c1458a = new C1458a(eVar);
                }
                Object obj2 = c1458a.f65492d;
                Object objE = uq.b.e();
                int i16 = c1458a.f65493e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f65490a;
                    fn1.c cVarQ9 = this.f65491b.q9((fn1.b) obj);
                    c1458a.f65494f = vq.j.a(obj);
                    c1458a.f65496h = vq.j.a(c1458a);
                    c1458a.f65497j = vq.j.a(obj);
                    c1458a.f65498k = vq.j.a(hVar);
                    c1458a.f65499l = 0;
                    c1458a.f65493e = 1;
                    if (hVar.F(cVarQ9, c1458a) == objE) {
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

        public b(mu.g gVar, f fVar) {
            this.f65488a = gVar;
            this.f65489b = fVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fn1.c> hVar, tq.e eVar) {
            Object objA = this.f65488a.a(new a(hVar, this.f65489b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn1/a$b;", "action", "Lfn1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfn1/a$b;Lfn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends k implements q<fn1.a.OnChildSelected, fn1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f65500e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f65501f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f65502g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f65503h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        /* synthetic */ Object f65504j;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends k implements l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f65506e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f65507f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f65508g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            int f65509h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f65510j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            final /* synthetic */ f f65511k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            final /* synthetic */ fn1.a.OnChildSelected f65512l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(f fVar, fn1.a.OnChildSelected onChildSelected, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f65511k = fVar;
                this.f65512l = onChildSelected;
            }

            /* JADX WARN: Code restructure failed: missing block: B:19:0x00f1, code lost:
            
                if (r1.F(r4, r10) == r0) goto L20;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 253
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: fn1.f.c.a.J(java.lang.Object):java.lang.Object");
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f65511k, this.f65512l, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0064, code lost:
        
            if (ac4.a.a(r4, null, r6, r10, 1, null) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00a1, code lost:
        
            if (r3.F(r5, r10) == r1) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x00a3, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = r10.f65504j
                fn1.a$b r0 = (fn1.a.OnChildSelected) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r10.f65503h
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L29
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
            L12:
                oq.u.b(r11)
                r7 = r10
                goto La4
            L18:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L20:
                java.lang.Object r0 = r10.f65501f
                oq.i0 r0 = (oq.i0) r0
                java.lang.Object r0 = r10.f65500e
                oq.i0 r0 = (oq.i0) r0
                goto L12
            L29:
                oq.u.b(r11)
                al0.w0 r11 = r0.getSelectedChild()
                al0.w0$a r2 = al0.w0.a.f7557a
                boolean r5 = fr.t.c(r11, r2)
                if (r5 != 0) goto L40
                al0.w0$b r5 = al0.w0.b.f7558a
                boolean r5 = fr.t.c(r11, r5)
                if (r5 == 0) goto L42
            L40:
                r7 = r10
                goto L6e
            L42:
                boolean r11 = r11 instanceof al0.w0.Specific
                if (r11 == 0) goto L67
                fn1.f r11 = fn1.f.this
                ac4.a r4 = fn1.f.j9(r11)
                fn1.f$c$a r6 = new fn1.f$c$a
                fn1.f r11 = fn1.f.this
                r2 = 0
                r6.<init>(r11, r0, r2)
                java.lang.Object r11 = vq.j.a(r0)
                r10.f65504j = r11
                r10.f65503h = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r1) goto La4
                goto La3
            L67:
                r7 = r10
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            L6e:
                fn1.f r11 = fn1.f.this
                gn1.a r11 = fn1.f.k9(r11)
                hn1.b$a r3 = hn1.b.a.f85853a
                r11.j(r3)
                oq.i0 r11 = oq.i0.f148189a
                fn1.f r3 = fn1.f.this
                fn1.a$a$c r5 = new fn1.a$a$c
                al0.w0 r6 = r0.getSelectedChild()
                boolean r2 = fr.t.c(r6, r2)
                r5.<init>(r2)
                java.lang.Object r0 = vq.j.a(r0)
                r7.f65504j = r0
                r7.f65500e = r11
                java.lang.Object r11 = vq.j.a(r11)
                r7.f65501f = r11
                r11 = 0
                r7.f65502g = r11
                r7.f65503h = r4
                java.lang.Object r11 = r3.F(r5, r10)
                if (r11 != r1) goto La4
            La3:
                return r1
            La4:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: fn1.f.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fn1.a.OnChildSelected onChildSelected, fn1.b bVar, tq.e<? super i0> eVar) {
            c cVar = f.this.new c(eVar);
            cVar.f65504j = onChildSelected;
            return cVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn1/a$c;", "action", "Lfn1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfn1/a$c;Lfn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends k implements q<fn1.a.OnError, fn1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f65513e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f65514f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f65515g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(f fVar, fn1.a.OnError onError, ib4.c.b bVar) {
            if (!(bVar instanceof ib4.c.b.a.Close) && !fr.t.c(bVar, ib4.c.b.AbstractC2161b.a.f90859a) && !(bVar instanceof ib4.c.b.a.Primary) && !(bVar instanceof ib4.c.b.a.Secondary)) {
                if (!fr.t.c(bVar, ib4.c.b.AbstractC2161b.C2162b.f90860a)) {
                    throw new p();
                }
                fVar.d9(new fn1.a.OnRetry(onError.getSelectedChild()));
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final fn1.a.OnError onError = (fn1.a.OnError) this.f65515g;
            Object objE = uq.b.e();
            int i15 = this.f65514f;
            if (i15 == 0) {
                u.b(obj);
                ib4.c cVar = f.this.genericDomainErrorMapper;
                dx.b domainError = onError.getDomainError();
                final f fVar = f.this;
                jb4.b bVarB = cVar.b(new ib4.c.Params(domainError, false, new l() { // from class: fn1.g
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return f.d.O(fVar, onError, (ib4.c.b) obj2);
                    }
                }, 2, null));
                f fVar2 = f.this;
                fn1.a.InterfaceC1456a.Error error = new fn1.a.InterfaceC1456a.Error(bVarB);
                this.f65515g = vq.j.a(onError);
                this.f65513e = vq.j.a(bVarB);
                this.f65514f = 1;
                if (fVar2.F(error, this) == objE) {
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
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(fn1.a.OnError onError, fn1.b bVar, tq.e<? super i0> eVar) {
            d dVar = f.this.new d(eVar);
            dVar.f65515g = onError;
            return dVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfn1/a$d;", "action", "Lfn1/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfn1/a$d;Lfn1/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends k implements q<fn1.a.OnRetry, fn1.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65517e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65518f;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fn1.a.OnRetry onRetry = (fn1.a.OnRetry) this.f65518f;
            uq.b.e();
            if (this.f65517e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            f.this.d9(new fn1.a.OnChildSelected(onRetry.getSelectedChild()));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fn1.a.OnRetry onRetry, fn1.b bVar, tq.e<? super i0> eVar) {
            e eVar2 = f.this.new e(eVar);
            eVar2.f65518f = onRetry;
            return eVar2.J(i0.f148189a);
        }
    }

    public f(m mVar, ac4.a aVar, ib4.c cVar, hm1.a aVar2, gn1.a aVar3, yy.a aVar4) {
        this.getIdSuspensionChildDataUC = mVar;
        this.callActionWithLoaderUseCase = aVar;
        this.genericDomainErrorMapper = cVar;
        this.createCertReceiveMethodDataUC = aVar2;
        this.contract = aVar3;
        fn1.b bVar = fn1.b.f65475a;
        this.initialState = bVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar4.a(bVar, new l() { // from class: fn1.e
            @Override // er.l
            public final Object b(Object obj) {
                return f.t9(this.f65478a, (v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), q9(bVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fn1.c q9(fn1.b state) {
        return fn1.c.f65476a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final f fVar, v vVar) {
        vVar.c(q0.c(fn1.b.class), new l() { // from class: fn1.d
            @Override // er.l
            public final Object b(Object obj) {
                return f.u9(this.f65477a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(f fVar, z zVar) {
        c cVar = fVar.new c(null);
        o oVar = o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fn1.a.OnChildSelected.class), oVar, cVar);
        zVar.x(q0.c(fn1.a.OnError.class), oVar, fVar.new d(null));
        zVar.x(q0.c(fn1.a.OnRetry.class), oVar, fVar.new e(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<fn1.a.InterfaceC1456a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<fn1.b, fn1.a> e9() {
        return this.stateMachine;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fn1.a.InterfaceC1456a interfaceC1456a, tq.e<? super i0> eVar) {
        return super.F(interfaceC1456a, eVar);
    }

    public void r9(w0 selectedChild) {
        d9(new fn1.a.OnChildSelected(selectedChild));
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(gn1.a aVar) {
        super.P5(aVar);
    }
}
