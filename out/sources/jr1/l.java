package jr1;

import er.q;
import fr.q0;
import java.util.List;
import k10.t;
import k10.z;
import mu.p0;
import o04.UploadedFile;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import pq.v;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0012\u001a\u00020\u0011*\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR,\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001f8\u0014X\u0095\u0004¢\u0006\u0012\n\u0004\b \u0010!\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R \u0010-\u001a\b\u0012\u0004\u0012\u00020(0'8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R&\u00104\u001a\b\u0012\u0004\u0012\u00020\u00110.8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b/\u00100\u0012\u0004\b3\u0010%\u001a\u0004\b1\u00102¨\u00065"}, d2 = {"Ljr1/l;", "Ll00/g;", "Ljr1/d;", "", "Ljr1/e;", "Lyy/a;", "stateMachineFactory", "Lkr1/a;", "fileUploaderMapper", "Lbc4/h;", "pickFilesUC", "Lno1/b;", "developerUploadFilesUC", "Lac4/a;", "withLoaderUseCase", "<init>", "(Lyy/a;Lkr1/a;Lbc4/h;Lno1/b;Lac4/a;)V", "Ljr1/e$a;", "m9", "(Ljr1/d;)Ljr1/e$a;", "b", "Lkr1/a;", "c", "Lbc4/h;", "d", "Lno1/b;", "e", "Lac4/a;", "f", "Ljr1/d;", "initialState", "Lk10/t;", "g", "Lk10/t;", "e9", "()Lk10/t;", "getStateMachine$annotations", "()V", "stateMachine", "Lxw/b;", "Ljr1/a;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "j", "Lmu/p0;", "getState", "()Lmu/p0;", "getState$annotations", "state", "developer_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<d, Object> implements e, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final kr1.a fileUploaderMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFilesUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final no1.b developerUploadFilesUC;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ac4.a withLoaderUseCase;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final d initialState;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<d, Object> stateMachine;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<jr1.a> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<e.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<e.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f104576a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f104577b;

        /* JADX INFO: renamed from: jr1.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C2482a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f104578a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f104579b;

            /* JADX INFO: renamed from: jr1.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C2483a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f104580d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f104581e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f104582f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f104584h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f104585j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f104586k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f104587l;

                public C2483a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f104580d = obj;
                    this.f104581e |= PKIFailureInfo.systemUnavail;
                    return C2482a.this.F(null, this);
                }
            }

            public C2482a(mu.h hVar, l lVar) {
                this.f104578a = hVar;
                this.f104579b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C2483a c2483a;
                if (eVar instanceof C2483a) {
                    c2483a = (C2483a) eVar;
                    int i15 = c2483a.f104581e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c2483a.f104581e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c2483a = new C2483a(eVar);
                    }
                } else {
                    c2483a = new C2483a(eVar);
                }
                Object obj2 = c2483a.f104580d;
                Object objE = uq.b.e();
                int i16 = c2483a.f104581e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f104578a;
                    e.Data dataM9 = this.f104579b.m9((d) obj);
                    c2483a.f104582f = vq.j.a(obj);
                    c2483a.f104584h = vq.j.a(c2483a);
                    c2483a.f104585j = vq.j.a(obj);
                    c2483a.f104586k = vq.j.a(hVar);
                    c2483a.f104587l = 0;
                    c2483a.f104581e = 1;
                    if (hVar.F(dataM9, c2483a) == objE) {
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

        public a(mu.g gVar, l lVar) {
            this.f104576a = gVar;
            this.f104577b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super e.Data> hVar, tq.e eVar) {
            Object objA = this.f104576a.a(new C2482a(hVar, this.f104577b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljr1/c;", "<unused var>", "Ljr1/d;", "Loq/i0;", "<anonymous>", "(Ljr1/c;Ljr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<jr1.c, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f104588e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f104589f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f104590g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f104591h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f104592j;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ldx/i;", "Ldx/b;", "", "Lo04/f;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends List<? extends UploadedFile>>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f104594e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l f104595f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ bc4.h.Result f104596g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(l lVar, bc4.h.Result result, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f104595f = lVar;
                this.f104596g = result;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f104594e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                no1.b bVar = this.f104595f.developerUploadFilesUC;
                no1.b.Params params = new no1.b.Params(v.e(this.f104596g.getFile()));
                this.f104594e = 1;
                Object objD = bVar.d(params, this);
                return objD == objE ? objE : objD;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f104595f, this.f104596g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, ? extends List<UploadedFile>>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0082, code lost:
        
            if (r11 == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r10.f104592j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r10.f104589f
                bc4.h$b r0 = (bc4.h.Result) r0
                java.lang.Object r0 = r10.f104588e
                dx.i r0 = (dx.i) r0
                oq.u.b(r11)
                goto L85
            L1a:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L22:
                oq.u.b(r11)
                goto L49
            L26:
                oq.u.b(r11)
                jr1.l r11 = jr1.l.this
                bc4.h r11 = jr1.l.j9(r11)
                bc4.h$a r4 = new bc4.h$a
                bc4.h$a$a r1 = bc4.h.Params.INSTANCE
                java.util.List r5 = r1.a()
                r8 = 4
                r9 = 0
                r6 = 2139095039(0x7f7fffff, float:3.4028235E38)
                r7 = 0
                r4.<init>(r5, r6, r7, r8, r9)
                r10.f104592j = r3
                java.lang.Object r11 = r11.c(r4, r10)
                if (r11 != r0) goto L49
                goto L84
            L49:
                dx.i r11 = (dx.i) r11
                jr1.l r1 = jr1.l.this
                boolean r3 = r11 instanceof dx.i.Left
                if (r3 != 0) goto L93
                boolean r3 = r11 instanceof dx.i.Right
                if (r3 == 0) goto L8d
                r3 = r11
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                bc4.h$b r3 = (bc4.h.Result) r3
                ac4.a r4 = jr1.l.k9(r1)
                jr1.l$b$a r6 = new jr1.l$b$a
                r5 = 0
                r6.<init>(r1, r3, r5)
                java.lang.Object r11 = vq.j.a(r11)
                r10.f104588e = r11
                java.lang.Object r11 = vq.j.a(r3)
                r10.f104589f = r11
                r11 = 0
                r10.f104590g = r11
                r10.f104591h = r11
                r10.f104592j = r2
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L85
            L84:
                return r0
            L85:
                dx.i r11 = (dx.i) r11
                dx.i$c r0 = new dx.i$c
                r0.<init>(r11)
                goto L93
            L8d:
                oq.p r11 = new oq.p
                r11.<init>()
                throw r11
            L93:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: jr1.l.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(jr1.c cVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new b(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljr1/b;", "<unused var>", "Ljr1/d;", "Loq/i0;", "<anonymous>", "(Ljr1/b;Ljr1/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<jr1.b, d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f104597e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f104597e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<jr1.a> bVarY1 = l.this.Y1();
                jr1.a.C2481a c2481a = jr1.a.C2481a.f104554a;
                this.f104597e = 1;
                if (bVarY1.F(c2481a, this) == objE) {
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
        public final Object w(jr1.b bVar, d dVar, tq.e<? super i0> eVar) {
            return l.this.new c(eVar).J(i0.f148189a);
        }
    }

    public l(yy.a aVar, kr1.a aVar2, bc4.h hVar, no1.b bVar, ac4.a aVar3) {
        this.fileUploaderMapper = aVar2;
        this.pickFilesUC = hVar;
        this.developerUploadFilesUC = bVar;
        this.withLoaderUseCase = aVar3;
        d dVar = d.f104557a;
        this.initialState = dVar;
        this.stateMachine = aVar.a(dVar, new er.l() { // from class: jr1.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.o9(this.f104566a, (k10.v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(dVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final e.Data m9(d dVar) {
        return this.fileUploaderMapper.b(new kr1.a.Params(dVar, b9(jr1.b.f104555a), b9(jr1.c.f104556a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 o9(final l lVar, k10.v vVar) {
        vVar.c(q0.c(d.class), new er.l() { // from class: jr1.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f104567a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(jr1.c.class), oVar, bVar);
        zVar.x(q0.c(jr1.b.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<jr1.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<d, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<e.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: n9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
