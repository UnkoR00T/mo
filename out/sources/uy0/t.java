package uy0;

import fr.q0;
import java.util.List;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wy0.LegendEntryData;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B3\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0001\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R&\u0010(\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030#8\u0014X\u0094\u0004¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R \u0010/\u001a\b\u0012\u0004\u0012\u00020*0)8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010,\u001a\u0004\b-\u0010.R \u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u0013008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Luy0/t;", "Ll00/g;", "Luy0/d;", "Luy0/c;", "Luy0/e;", "", "Lyy/a;", "stateMachineFactory", "Lly0/e;", "getAirQualityRateDictionaryUC", "Lvy0/a;", "legendScreenMapper", "Lib4/c;", "genericDomainErrorMapper", "Lwy0/b;", "legendEntryData", "<init>", "(Lyy/a;Lly0/e;Lvy0/a;Lib4/c;Lwy0/b;)V", "state", "Luy0/e$a;", "r9", "(Luy0/d;)Luy0/e$a;", "Ldx/b;", "error", "Ljb4/b;", "p9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "b", "Lly0/e;", "c", "Lvy0/a;", "d", "Lib4/c;", "e", "Lwy0/b;", "Lk10/t;", "f", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lxw/b;", "Luy0/c$c;", "g", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lmu/p0;", "h", "Lmu/p0;", "getState", "()Lmu/p0;", "airquality_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class t extends l00.g<uy0.d, uy0.c> implements uy0.e, zx.d {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final ly0.e getAirQualityRateDictionaryUC;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final vy0.a legendScreenMapper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ib4.c genericDomainErrorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final LegendEntryData legendEntryData;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final k10.t<uy0.d, uy0.c> stateMachine;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final xw.b<uy0.c.InterfaceC5258c> navAction = new xw.b<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<uy0.e.a> state = a9(new b(e9().getState(), this), uy0.e.a.C5259a.f202169a);

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f202203d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f202204e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f202205f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f202206g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f202207h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f202209k;

        a(tq.e<? super a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f202207h = obj;
            this.f202209k |= PKIFailureInfo.systemUnavail;
            return t.this.p9(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<uy0.e.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f202210a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ t f202211b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f202212a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ t f202213b;

            /* JADX INFO: renamed from: uy0.t$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C5260a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f202214d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f202215e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f202216f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f202218h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f202219j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f202220k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f202221l;

                public C5260a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f202214d = obj;
                    this.f202215e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, t tVar) {
                this.f202212a = hVar;
                this.f202213b = tVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C5260a c5260a;
                if (eVar instanceof C5260a) {
                    c5260a = (C5260a) eVar;
                    int i15 = c5260a.f202215e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c5260a.f202215e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c5260a = new C5260a(eVar);
                    }
                } else {
                    c5260a = new C5260a(eVar);
                }
                Object obj2 = c5260a.f202214d;
                Object objE = uq.b.e();
                int i16 = c5260a.f202215e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f202212a;
                    uy0.e.a aVarR9 = this.f202213b.r9((uy0.d) obj);
                    c5260a.f202216f = vq.j.a(obj);
                    c5260a.f202218h = vq.j.a(c5260a);
                    c5260a.f202219j = vq.j.a(obj);
                    c5260a.f202220k = vq.j.a(hVar);
                    c5260a.f202221l = 0;
                    c5260a.f202215e = 1;
                    if (hVar.F(aVarR9, c5260a) == objE) {
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

        public b(mu.g gVar, t tVar) {
            this.f202210a = gVar;
            this.f202211b = tVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super uy0.e.a> hVar, tq.e eVar) {
            Object objA = this.f202210a.a(new a(hVar, this.f202211b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Luy0/c$a;", "<unused var>", "Luy0/d;", "Loq/i0;", "<anonymous>", "(Luy0/c$a;Luy0/d;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<uy0.c.a, uy0.d, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202222e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f202222e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<uy0.c.InterfaceC5258c> bVarY1 = t.this.Y1();
                uy0.c.InterfaceC5258c.a aVar = uy0.c.InterfaceC5258c.a.f202164a;
                this.f202222e = 1;
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
        public final Object w(uy0.c.a aVar, uy0.d dVar, tq.e<? super i0> eVar) {
            return t.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luy0/d$a;", "it", "Loq/i0;", "<anonymous>", "(Luy0/d$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.p<uy0.d.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f202224e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f202224e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            t.this.d9(new uy0.c.GetRateDictionary(t.this.legendEntryData));
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(uy0.d.a aVar, tq.e<? super i0> eVar) {
            return ((d) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new d(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Luy0/c$b;", "action", "Lk10/c0;", "Luy0/d$a;", "state", "Lk10/l;", "Luy0/d;", "<anonymous>", "(Luy0/c$b;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<uy0.c.GetRateDictionary, c0<uy0.d.a>, tq.e<? super k10.l<? extends uy0.d>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f202226e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f202227f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f202228g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f202229h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f202230j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f202231k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f202232l;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final uy0.d.Initialized O(uy0.c.GetRateDictionary getRateDictionary, List list, uy0.d.a aVar) {
            return new uy0.d.Initialized(list, getRateDictionary.getLegendEntryData());
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0076, code lost:
        
            if (r3.p9(r5, r6) == r2) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f202231k
                uy0.c$b r0 = (uy0.c.GetRateDictionary) r0
                java.lang.Object r1 = r6.f202232l
                k10.c0 r1 = (k10.c0) r1
                java.lang.Object r2 = uq.b.e()
                int r3 = r6.f202230j
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L2e
                if (r3 == r5) goto L2a
                if (r3 != r4) goto L22
                java.lang.Object r0 = r6.f202227f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r6.f202226e
                dx.i r0 = (dx.i) r0
                oq.u.b(r7)
                goto L79
            L22:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L2a:
                oq.u.b(r7)
                goto L46
            L2e:
                oq.u.b(r7)
                uy0.t r7 = uy0.t.this
                ly0.e r7 = uy0.t.l9(r7)
                gz.b$a$a r3 = gz.b.a.C1792a.f78542a
                r6.f202231k = r0
                r6.f202232l = r1
                r6.f202230j = r5
                java.lang.Object r7 = r7.a(r3, r6)
                if (r7 != r2) goto L46
                goto L78
            L46:
                dx.i r7 = (dx.i) r7
                uy0.t r3 = uy0.t.this
                boolean r5 = r7 instanceof dx.i.Left
                if (r5 == 0) goto L7e
                r5 = r7
                dx.i$b r5 = (dx.i.Left) r5
                java.lang.Object r5 = r5.b()
                dx.b r5 = (dx.b) r5
                java.lang.Object r0 = vq.j.a(r0)
                r6.f202231k = r0
                r6.f202232l = r1
                java.lang.Object r7 = vq.j.a(r7)
                r6.f202226e = r7
                java.lang.Object r7 = vq.j.a(r5)
                r6.f202227f = r7
                r7 = 0
                r6.f202228g = r7
                r6.f202229h = r7
                r6.f202230j = r4
                java.lang.Object r7 = uy0.t.n9(r3, r5, r6)
                if (r7 != r2) goto L79
            L78:
                return r2
            L79:
                k10.l r7 = r1.c()
                return r7
            L7e:
                boolean r2 = r7 instanceof dx.i.Right
                if (r2 == 0) goto L94
                dx.i$c r7 = (dx.i.Right) r7
                java.lang.Object r7 = r7.b()
                java.util.List r7 = (java.util.List) r7
                uy0.u r2 = new uy0.u
                r2.<init>()
                k10.l r7 = r1.d(r2)
                return r7
            L94:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: uy0.t.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(uy0.c.GetRateDictionary getRateDictionary, c0<uy0.d.a> c0Var, tq.e<? super k10.l<? extends uy0.d>> eVar) {
            e eVar2 = t.this.new e(eVar);
            eVar2.f202231k = getRateDictionary;
            eVar2.f202232l = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    public t(yy.a aVar, ly0.e eVar, vy0.a aVar2, ib4.c cVar, LegendEntryData legendEntryData) {
        this.getAirQualityRateDictionaryUC = eVar;
        this.legendScreenMapper = aVar2;
        this.genericDomainErrorMapper = cVar;
        this.legendEntryData = legendEntryData;
        this.stateMachine = aVar.a(uy0.d.a.f202166a, new er.l() { // from class: uy0.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.t9(this.f202195a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p9(dx.b bVar, tq.e<? super jb4.b> eVar) throws Throwable {
        a aVar;
        if (eVar instanceof a) {
            aVar = (a) eVar;
            int i15 = aVar.f202209k;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                aVar.f202209k = i15 - PKIFailureInfo.systemUnavail;
            } else {
                aVar = new a(eVar);
            }
        } else {
            aVar = new a(eVar);
        }
        Object obj = aVar.f202207h;
        Object objE = uq.b.e();
        int i16 = aVar.f202209k;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj2 = aVar.f202204e;
            oq.u.b(obj);
            return obj2;
        }
        oq.u.b(obj);
        jb4.b bVarB = this.genericDomainErrorMapper.b(new ib4.c.Params(bVar, false, new er.l() { // from class: uy0.r
            @Override // er.l
            public final Object b(Object obj3) {
                return t.q9((ib4.c.b) obj3);
            }
        }, 2, null));
        jb4.b bVar2 = bVarB;
        xw.b<uy0.c.InterfaceC5258c> bVarY1 = Y1();
        uy0.c.InterfaceC5258c.Error error = new uy0.c.InterfaceC5258c.Error(bVar2);
        aVar.f202203d = vq.j.a(bVar);
        aVar.f202204e = bVarB;
        aVar.f202205f = vq.j.a(bVar2);
        aVar.f202206g = 0;
        aVar.f202209k = 1;
        return bVarY1.F(error, aVar) == objE ? objE : bVarB;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q9(ib4.c.b bVar) {
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final uy0.e.a r9(uy0.d state) {
        return this.legendScreenMapper.b(new vy0.a.Params(state, b9(uy0.c.a.f202162a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final t tVar, k10.v vVar) {
        vVar.c(q0.c(uy0.d.class), new er.l() { // from class: uy0.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.u9(this.f202193a, (z) obj);
            }
        });
        vVar.c(q0.c(uy0.d.a.class), new er.l() { // from class: uy0.q
            @Override // er.l
            public final Object b(Object obj) {
                return t.v9(this.f202194a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(t tVar, z zVar) {
        c cVar = tVar.new c(null);
        zVar.x(q0.c(uy0.c.a.class), k10.o.CANCEL_PREVIOUS, cVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 v9(t tVar, z zVar) {
        zVar.C(tVar.new d(null));
        e eVar = tVar.new e(null);
        zVar.v(q0.c(uy0.c.GetRateDictionary.class), k10.o.CANCEL_PREVIOUS, eVar);
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<uy0.c.InterfaceC5258c> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<uy0.d, uy0.c> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<uy0.e.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(LegendEntryData legendEntryData) {
        super.P5(legendEntryData);
    }
}
