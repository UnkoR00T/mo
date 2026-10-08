package p92;

import fr.q0;
import mu.p0;
import mx.Label;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes8.dex */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003B#\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0001\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00180\u00178\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR&\u0010#\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u001e8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R \u0010)\u001a\b\u0012\u0004\u0012\u00020\r0$8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lp92/e0;", "Ll00/g;", "Lp92/x;", "", "Lp92/y;", "Lr92/b;", "wasteTypeListMapper", "Lyy/a;", "stateMachineFactory", "Lq92/a;", "contract", "<init>", "(Lr92/b;Lyy/a;Lq92/a;)V", "Lp92/y$a;", "k9", "()Lp92/y$a;", "b", "Lr92/b;", "c", "Lq92/a;", "d", "Lp92/x;", "initialState", "Lxw/b;", "Lp92/v;", "e", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "g", "Lmu/p0;", "getState", "()Lmu/p0;", "state", "gios_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class e0 extends l00.g<x, Object> implements y, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final r92.b wasteTypeListMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final q92.a contract;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x initialState;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xw.b<v> navAction;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<x, Object> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final p0<y.Data> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class a implements mu.g<y.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f153633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ e0 f153634b;

        /* JADX INFO: renamed from: p92.e0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class C3796a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f153635a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ e0 f153636b;

            /* JADX INFO: renamed from: p92.e0$a$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C3797a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f153637d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f153638e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f153639f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f153641h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f153642j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f153643k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f153644l;

                public C3797a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f153637d = obj;
                    this.f153638e |= PKIFailureInfo.systemUnavail;
                    return C3796a.this.F(null, this);
                }
            }

            public C3796a(mu.h hVar, e0 e0Var) {
                this.f153635a = hVar;
                this.f153636b = e0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C3797a c3797a;
                if (eVar instanceof C3797a) {
                    c3797a = (C3797a) eVar;
                    int i15 = c3797a.f153638e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c3797a.f153638e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c3797a = new C3797a(eVar);
                    }
                } else {
                    c3797a = new C3797a(eVar);
                }
                Object obj2 = c3797a.f153637d;
                Object objE = uq.b.e();
                int i16 = c3797a.f153638e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f153635a;
                    y.Data dataK9 = this.f153636b.k9();
                    c3797a.f153639f = vq.j.a(obj);
                    c3797a.f153641h = vq.j.a(c3797a);
                    c3797a.f153642j = vq.j.a(obj);
                    c3797a.f153643k = vq.j.a(hVar);
                    c3797a.f153644l = 0;
                    c3797a.f153638e = 1;
                    if (hVar.F(dataK9, c3797a) == objE) {
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

        public a(mu.g gVar, e0 e0Var) {
            this.f153633a = gVar;
            this.f153634b = e0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super y.Data> hVar, tq.e eVar) {
            Object objA = this.f153633a.a(new C3796a(hVar, this.f153634b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lp92/w;", "action", "Lp92/x;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lp92/w;Lp92/x;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.q<WasteTypeClick, x, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f153645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f153646f;

        b(tq.e<? super b> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x004e, code lost:
        
            if (r6.F(r2, r5) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0081, code lost:
        
            if (r6.F(r2, r5) == r1) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
        
            return r1;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f153646f
                p92.w r0 = (p92.WasteTypeClick) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r5.f153645e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L1e
                if (r2 == r4) goto L12
                if (r2 != r3) goto L16
            L12:
                oq.u.b(r6)
                goto L84
            L16:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1e:
                oq.u.b(r6)
                fp0.m r6 = r0.getWasteTypeTag()
                fp0.m$a r2 = fp0.m.a.f65849a
                boolean r2 = fr.t.c(r6, r2)
                if (r2 != 0) goto L60
                fp0.m$b r2 = fp0.m.b.f65850a
                boolean r2 = fr.t.c(r6, r2)
                if (r2 == 0) goto L36
                goto L60
            L36:
                boolean r2 = r6 instanceof fp0.m.Others
                if (r2 == 0) goto L51
                p92.e0 r6 = p92.e0.this
                xw.b r6 = r6.Y1()
                p92.v$b r2 = p92.v.b.f153708a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f153646f = r0
                r5.f153645e = r3
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L84
                goto L83
            L51:
                fp0.m$d r0 = fp0.m.d.f65852a
                boolean r6 = fr.t.c(r6, r0)
                if (r6 == 0) goto L5a
                goto L84
            L5a:
                oq.p r6 = new oq.p
                r6.<init>()
                throw r6
            L60:
                p92.e0 r6 = p92.e0.this
                q92.a r6 = p92.e0.i9(r6)
                fp0.m r2 = r0.getWasteTypeTag()
                r6.s8(r2)
                p92.e0 r6 = p92.e0.this
                xw.b r6 = r6.Y1()
                p92.v$a r2 = p92.v.a.f153707a
                java.lang.Object r0 = vq.j.a(r0)
                r5.f153646f = r0
                r5.f153645e = r4
                java.lang.Object r6 = r6.F(r2, r5)
                if (r6 != r1) goto L84
            L83:
                return r1
            L84:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: p92.e0.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(WasteTypeClick wasteTypeClick, x xVar, tq.e<? super i0> eVar) {
            b bVar = e0.this.new b(eVar);
            bVar.f153646f = wasteTypeClick;
            return bVar.J(i0.f148189a);
        }
    }

    public e0(r92.b bVar, yy.a aVar, q92.a aVar2) {
        this.wasteTypeListMapper = bVar;
        this.contract = aVar2;
        x xVar = x.f153710a;
        this.initialState = xVar;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(xVar, new er.l() { // from class: p92.d0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.m9(this.f153620a, (k10.v) obj);
            }
        });
        this.state = a9(new a(e9().getState(), this), k9());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final y.Data k9() {
        return this.wasteTypeListMapper.b(new r92.b.Params(b9(new WasteTypeClick(fp0.m.a.f65849a)), b9(new WasteTypeClick(fp0.m.b.f65850a)), b9(new WasteTypeClick(new fp0.m.Others(Label.INSTANCE.c())))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 m9(final e0 e0Var, k10.v vVar) {
        vVar.c(q0.c(x.class), new er.l() { // from class: p92.c0
            @Override // er.l
            public final Object b(Object obj) {
                return e0.n9(this.f153618a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n9(e0 e0Var, k10.z zVar) {
        b bVar = e0Var.new b(null);
        zVar.x(q0.c(WasteTypeClick.class), k10.o.CANCEL_PREVIOUS, bVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<v> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<x, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<y.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: l9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(q92.a aVar) {
        super.P5(aVar);
    }
}
