package bg3;

import er.q;
import fr.q0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R&\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00178\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u001e0\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lbg3/l;", "Ll00/g;", "Lbg3/c;", "", "Lbg3/d;", "Lyy/a;", "stateMachineFactory", "Ldg3/c;", "mapper", "Lcg3/a;", "contract", "<init>", "(Lyy/a;Ldg3/c;Lcg3/a;)V", "Lbg3/d$a;", "m9", "(Lbg3/c;)Lbg3/d$a;", "b", "Ldg3/c;", "c", "Lcg3/a;", "d", "Lbg3/c;", "initialState", "Lk10/t;", "e", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Lbg3/a;", "f", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class l extends l00.g<bg3.c, Object> implements d, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final dg3.c mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final cg3.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final bg3.c initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final t<bg3.c, Object> stateMachine;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xw.b<bg3.a> navAction;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<d.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<d.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f19393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l f19394b;

        /* JADX INFO: renamed from: bg3.l$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C0495a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f19395a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ l f19396b;

            /* JADX INFO: renamed from: bg3.l$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C0496a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f19397d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f19398e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f19399f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f19401h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f19402j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f19403k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f19404l;

                public C0496a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f19397d = obj;
                    this.f19398e |= PKIFailureInfo.systemUnavail;
                    return C0495a.this.F(null, this);
                }
            }

            public C0495a(mu.h hVar, l lVar) {
                this.f19395a = hVar;
                this.f19396b = lVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C0496a c0496a;
                if (eVar instanceof C0496a) {
                    c0496a = (C0496a) eVar;
                    int i15 = c0496a.f19398e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c0496a.f19398e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c0496a = new C0496a(eVar);
                    }
                } else {
                    c0496a = new C0496a(eVar);
                }
                Object obj2 = c0496a.f19397d;
                Object objE = uq.b.e();
                int i16 = c0496a.f19398e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f19395a;
                    d.Data dataM9 = this.f19396b.m9((bg3.c) obj);
                    c0496a.f19399f = vq.j.a(obj);
                    c0496a.f19401h = vq.j.a(c0496a);
                    c0496a.f19402j = vq.j.a(obj);
                    c0496a.f19403k = vq.j.a(hVar);
                    c0496a.f19404l = 0;
                    c0496a.f19398e = 1;
                    if (hVar.F(dataM9, c0496a) == objE) {
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
            this.f19393a = gVar;
            this.f19394b = lVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super d.Data> hVar, tq.e eVar) {
            Object objA = this.f19393a.a(new C0495a(hVar, this.f19394b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbg3/b;", "action", "Lbg3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbg3/b;Lbg3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements q<PickDescriptionAuthor, bg3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19405e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19406f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r7.F(r2, r6) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f19406f
                bg3.b r0 = (bg3.PickDescriptionAuthor) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r6.f19405e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L22
                if (r2 == r4) goto L1e
                if (r2 != r3) goto L16
                oq.u.b(r7)
                goto L51
            L16:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1e:
                oq.u.b(r7)
                goto L3e
            L22:
                oq.u.b(r7)
                bg3.l r7 = bg3.l.this
                cg3.a r7 = bg3.l.j9(r7)
                sv0.o r2 = r0.getDescriptionAuthor()
                java.lang.Object r5 = vq.j.a(r0)
                r6.f19406f = r5
                r6.f19405e = r4
                java.lang.Object r7 = r7.B(r2, r6)
                if (r7 != r1) goto L3e
                goto L50
            L3e:
                bg3.l r7 = bg3.l.this
                bg3.a$c r2 = bg3.a.c.f19371a
                java.lang.Object r0 = vq.j.a(r0)
                r6.f19406f = r0
                r6.f19405e = r3
                java.lang.Object r7 = r7.F(r2, r6)
                if (r7 != r1) goto L51
            L50:
                return r1
            L51:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            */
            throw new UnsupportedOperationException("Method not decompiled: bg3.l.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(PickDescriptionAuthor pickDescriptionAuthor, bg3.c cVar, tq.e<? super i0> eVar) {
            b bVar = l.this.new b(eVar);
            bVar.f19406f = pickDescriptionAuthor;
            return bVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lbg3/a;", "action", "Lbg3/c;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lbg3/a;Lbg3/c;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements q<bg3.a, bg3.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f19408e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f19409f;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bg3.a aVar = (bg3.a) this.f19409f;
            Object objE = uq.b.e();
            int i15 = this.f19408e;
            if (i15 == 0) {
                u.b(obj);
                l lVar = l.this;
                this.f19409f = vq.j.a(aVar);
                this.f19408e = 1;
                if (lVar.F(aVar, this) == objE) {
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
        public final Object w(bg3.a aVar, bg3.c cVar, tq.e<? super i0> eVar) {
            c cVar2 = l.this.new c(eVar);
            cVar2.f19409f = aVar;
            return cVar2.J(i0.f148189a);
        }
    }

    public l(yy.a aVar, dg3.c cVar, cg3.a aVar2) {
        this.mapper = cVar;
        this.contract = aVar2;
        bg3.c cVar2 = bg3.c.f19373a;
        this.initialState = cVar2;
        this.stateMachine = aVar.a(cVar2, new er.l() { // from class: bg3.k
            @Override // er.l
            public final Object b(Object obj) {
                return l.p9(this.f19386a, (v) obj);
            }
        });
        this.navAction = new xw.b<>();
        this.state = a9(new a(e9().getState(), this), m9(cVar2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final d.Data m9(bg3.c cVar) {
        return this.mapper.b(new dg3.c.Params(cVar, new er.l() { // from class: bg3.i
            @Override // er.l
            public final Object b(Object obj) {
                return l.n9(this.f19384a, (sv0.o) obj);
            }
        }, b9(bg3.a.C0494a.f19369a), b9(bg3.a.b.f19370a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(l lVar, sv0.o oVar) {
        lVar.d9(new PickDescriptionAuthor(oVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p9(final l lVar, v vVar) {
        vVar.c(q0.c(bg3.c.class), new er.l() { // from class: bg3.j
            @Override // er.l
            public final Object b(Object obj) {
                return l.q9(this.f19385a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(l lVar, z zVar) {
        b bVar = lVar.new b(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(PickDescriptionAuthor.class), oVar, bVar);
        zVar.x(q0.c(bg3.a.class), oVar, lVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<bg3.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<bg3.c, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<d.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(bg3.a aVar, tq.e<? super i0> eVar) {
        return super.F(aVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: o9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(cg3.a aVar) {
        super.P5(aVar);
    }
}
