package ee1;

import cb4.DialogButtonTextData;
import cb4.DialogData;
import de1.IncomeTaxExceededAddFileModel;
import f00.j0;
import fr.q0;
import java.math.BigDecimal;
import java.math.RoundingMode;
import k10.c0;
import k10.z;
import mu.p0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FilePickerMetadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0003:\u0001>B;\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0001\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0016\u0010\u0019\u001a\u0004\u0018\u00010\u0018*\u00020\u0017H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0013\u0010\u001d\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010+\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R&\u00108\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003038\u0014X\u0094\u0004¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R \u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u0014098\u0016X\u0096\u0004¢\u0006\f\n\u0004\b:\u0010;\u001a\u0004\b<\u0010=¨\u0006?"}, d2 = {"Lee1/r;", "Ll00/g;", "Lee1/g;", "", "Lee1/h;", "Lyy/a;", "stateMachineFactory", "Lfe1/a;", "mapper", "Lbc4/h;", "pickFileUseCase", "Lyw/b;", "accessibilityTalkBackManager", "Lmx/c;", "labelProvider", "Lce1/a;", "contract", "<init>", "(Lyy/a;Lfe1/a;Lbc4/h;Lyw/b;Lmx/c;Lce1/a;)V", "state", "Lee1/h$a;", "r9", "(Lee1/g;)Lee1/h$a;", "Ldx/b;", "Loq/i0;", "q9", "(Ldx/b;Ltq/e;)Ljava/lang/Object;", "Ldx/b$c;", "Lcb4/d;", "v9", "(Ldx/b$c;)Lcb4/d;", "b", "Lfe1/a;", "c", "Lbc4/h;", "d", "Lyw/b;", "e", "Lmx/c;", "f", "Lce1/a;", "g", "Lee1/g;", "initialState", "Lxw/b;", "Lee1/e;", "h", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "j", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "k", "Lmu/p0;", "getState", "()Lmu/p0;", "a", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class r extends l00.g<State, Object> implements h, zx.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fe1.a mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final bc4.h pickFileUseCase;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final yw.b accessibilityTalkBackManager;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ce1.a contract;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final State initialState;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final xw.b<ee1.e> navAction;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State, Object> stateMachine;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final p0<h.Data> state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004À\u0006\u0003"}, d2 = {"Lee1/r$a;", "Lf00/j0;", "Lce1/a;", "Lee1/r;", "company_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface a extends j0<ce1.a, r> {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<h.Data> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f49629a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ r f49630b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f49631a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ r f49632b;

            /* JADX INFO: renamed from: ee1.r$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1177a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f49633d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f49634e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f49635f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f49637h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f49638j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f49639k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f49640l;

                public C1177a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f49633d = obj;
                    this.f49634e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, r rVar) {
                this.f49631a = hVar;
                this.f49632b = rVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1177a c1177a;
                if (eVar instanceof C1177a) {
                    c1177a = (C1177a) eVar;
                    int i15 = c1177a.f49634e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1177a.f49634e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1177a = new C1177a(eVar);
                    }
                } else {
                    c1177a = new C1177a(eVar);
                }
                Object obj2 = c1177a.f49633d;
                Object objE = uq.b.e();
                int i16 = c1177a.f49634e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f49631a;
                    h.Data dataR9 = this.f49632b.r9((State) obj);
                    c1177a.f49635f = vq.j.a(obj);
                    c1177a.f49637h = vq.j.a(c1177a);
                    c1177a.f49638j = vq.j.a(obj);
                    c1177a.f49639k = vq.j.a(hVar);
                    c1177a.f49640l = 0;
                    c1177a.f49634e = 1;
                    if (hVar.F(dataR9, c1177a) == objE) {
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

        public b(mu.g gVar, r rVar) {
            this.f49629a = gVar;
            this.f49630b = rVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super h.Data> hVar, tq.e eVar) {
            Object objA = this.f49629a.a(new a(hVar, this.f49630b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lee1/b;", "<unused var>", "Lee1/g;", "Loq/i0;", "<anonymous>", "(Lee1/b;Lee1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.q<ee1.b, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49641e;

        c(tq.e<? super c> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49641e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ee1.e> bVarY1 = r.this.Y1();
                ee1.e.a aVar = ee1.e.a.f49595a;
                this.f49641e = 1;
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
        public final Object w(ee1.b bVar, State state, tq.e<? super i0> eVar) {
            return r.this.new c(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lee1/c;", "<unused var>", "Lee1/g;", "Loq/i0;", "<anonymous>", "(Lee1/c;Lee1/g;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<ee1.c, State, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49643e;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f49643e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<ee1.e> bVarY1 = r.this.Y1();
                ee1.e.b bVar = ee1.e.b.f49596a;
                this.f49643e = 1;
                if (bVarY1.F(bVar, this) == objE) {
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
        public final Object w(ee1.c cVar, State state, tq.e<? super i0> eVar) {
            return r.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lee1/a;", "<unused var>", "Lk10/c0;", "Lee1/g;", "state", "Lk10/l;", "<anonymous>", "(Lee1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<ee1.a, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49645e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f49646f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f49647g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f49648h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f49649j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        /* synthetic */ Object f49650k;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(bc4.h.Result result, State state) {
            return state.a(result.getFile(), false);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0088, code lost:
        
            if (r2.q9(r4, r12) == r1) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f49650k
                k10.c0 r0 = (k10.c0) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r12.f49649j
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L2a
                if (r2 == r4) goto L26
                if (r2 != r3) goto L1e
                java.lang.Object r1 = r12.f49646f
                dx.b r1 = (dx.b) r1
                java.lang.Object r1 = r12.f49645e
                dx.i r1 = (dx.i) r1
                oq.u.b(r13)
                goto L8b
            L1e:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L26:
                oq.u.b(r13)
                goto L5e
            L2a:
                oq.u.b(r13)
                ee1.r r13 = ee1.r.this
                bc4.h r13 = ee1.r.m9(r13)
                bc4.h$a r5 = new bc4.h$a
                wx.f r6 = wx.f.PDF
                wx.f r7 = wx.f.JPG
                wx.f r8 = wx.f.JPEG
                wx.f r9 = wx.f.PNG
                wx.f r10 = wx.f.HEIF
                wx.f r11 = wx.f.HEIC
                wx.f[] r2 = new wx.f[]{r6, r7, r8, r9, r10, r11}
                java.util.List r6 = pq.v.q(r2)
                float r7 = ee1.i.b()
                r9 = 4
                r10 = 0
                r8 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r12.f49650k = r0
                r12.f49649j = r4
                java.lang.Object r13 = r13.c(r5, r12)
                if (r13 != r1) goto L5e
                goto L8a
            L5e:
                dx.i r13 = (dx.i) r13
                ee1.r r2 = ee1.r.this
                boolean r4 = r13 instanceof dx.i.Left
                if (r4 == 0) goto L90
                r4 = r13
                dx.i$b r4 = (dx.i.Left) r4
                java.lang.Object r4 = r4.b()
                dx.b r4 = (dx.b) r4
                r12.f49650k = r0
                java.lang.Object r13 = vq.j.a(r13)
                r12.f49645e = r13
                java.lang.Object r13 = vq.j.a(r4)
                r12.f49646f = r13
                r13 = 0
                r12.f49647g = r13
                r12.f49648h = r13
                r12.f49649j = r3
                java.lang.Object r13 = ee1.r.n9(r2, r4, r12)
                if (r13 != r1) goto L8b
            L8a:
                return r1
            L8b:
                k10.l r13 = r0.c()
                return r13
            L90:
                boolean r1 = r13 instanceof dx.i.Right
                if (r1 == 0) goto Lbb
                dx.i$c r13 = (dx.i.Right) r13
                java.lang.Object r13 = r13.b()
                bc4.h$b r13 = (bc4.h.Result) r13
                yw.b r1 = ee1.r.j9(r2)
                c70.a r2 = c70.a.f23835a
                yw.a r2 = r2.a()
                mx.a r2 = r2.q0()
                java.lang.String r2 = r2.getText()
                r1.a(r2)
                ee1.s r1 = new ee1.s
                r1.<init>()
                k10.l r13 = r0.b(r1)
                return r13
            Lbb:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: ee1.r.e.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ee1.a aVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            e eVar2 = r.this.new e(eVar);
            eVar2.f49650k = c0Var;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lee1/d;", "<unused var>", "Lk10/c0;", "Lee1/g;", "state", "Lk10/l;", "<anonymous>", "(Lee1/d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<ee1.d, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f49652e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f49653f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return state.a(null, false);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49653f;
            uq.b.e();
            if (this.f49652e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.b(new er.l() { // from class: ee1.t
                @Override // er.l
                public final Object b(Object obj2) {
                    return r.f.O((State) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ee1.d dVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            f fVar = new f(eVar);
            fVar.f49653f = c0Var;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lee1/f;", "<unused var>", "Lk10/c0;", "Lee1/g;", "state", "Lk10/l;", "<anonymous>", "(Lee1/f;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<ee1.f, c0<State>, tq.e<? super k10.l<? extends State>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f49654e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f49655f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f49656g;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final State O(State state) {
            return State.b(state, null, true, 1, null);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            c0 c0Var = (c0) this.f49656g;
            Object objE = uq.b.e();
            int i15 = this.f49655f;
            if (i15 == 0) {
                oq.u.b(obj);
                wx.i.Regular pickedFile = ((State) c0Var.a()).getPickedFile();
                FilePickerMetadata metadata = pickedFile != null ? pickedFile.getMetadata() : null;
                if (metadata == null) {
                    r.this.accessibilityTalkBackManager.a(r.this.labelProvider.c(ha1.a.f82535y).getText());
                    return c0Var.d(new er.l() { // from class: ee1.u
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return r.g.O((State) obj2);
                        }
                    });
                }
                r.this.contract.p4(new IncomeTaxExceededAddFileModel(metadata.getUri(), metadata.getName(), new BigDecimal(String.valueOf(metadata.d())).setScale(1, RoundingMode.HALF_UP).toString() + " MB", IncomeTaxExceededAddFileModel.EnumC0917a.PDF));
                xw.b<ee1.e> bVarY1 = r.this.Y1();
                ee1.e.c cVar = ee1.e.c.f49597a;
                this.f49656g = c0Var;
                this.f49654e = vq.j.a(metadata);
                this.f49655f = 1;
                if (bVarY1.F(cVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return c0Var.c();
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(ee1.f fVar, c0<State> c0Var, tq.e<? super k10.l<State>> eVar) {
            g gVar = r.this.new g(eVar);
            gVar.f49656g = c0Var;
            return gVar.J(i0.f148189a);
        }
    }

    public r(yy.a aVar, fe1.a aVar2, bc4.h hVar, yw.b bVar, mx.c cVar, ce1.a aVar3) {
        this.mapper = aVar2;
        this.pickFileUseCase = hVar;
        this.accessibilityTalkBackManager = bVar;
        this.labelProvider = cVar;
        this.contract = aVar3;
        State state = new State(null, false, 3, null);
        this.initialState = state;
        this.navAction = new xw.b<>();
        this.stateMachine = aVar.a(state, new er.l() { // from class: ee1.q
            @Override // er.l
            public final Object b(Object obj) {
                return r.t9(this.f49619a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), r9(state));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object q9(dx.b bVar, tq.e<? super i0> eVar) {
        DialogData dialogDataV9;
        if (!(bVar instanceof dx.b.Business) || ((dx.b.Business) bVar).getType() == zb4.b.NO_FILE_PICKED) {
            bVar = null;
        }
        if (bVar == null || (dialogDataV9 = v9((dx.b.Business) bVar)) == null) {
            return null;
        }
        Object objF = F(new ee1.e.ShowDialog(dialogDataV9), eVar);
        return objF == uq.b.e() ? objF : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final h.Data r9(State state) {
        return this.mapper.b(new fe1.a.Params(state, b9(ee1.a.f49591a), b9(ee1.d.f49594a), b9(ee1.f.f49599a), b9(ee1.b.f49592a), b9(ee1.c.f49593a)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t9(final r rVar, k10.v vVar) {
        vVar.c(q0.c(State.class), new er.l() { // from class: ee1.o
            @Override // er.l
            public final Object b(Object obj) {
                return r.u9(this.f49618a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 u9(r rVar, z zVar) {
        c cVar = rVar.new c(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(ee1.b.class), oVar, cVar);
        zVar.x(q0.c(ee1.c.class), oVar, rVar.new d(null));
        zVar.v(q0.c(ee1.a.class), oVar, rVar.new e(null));
        zVar.v(q0.c(ee1.d.class), oVar, new f(null));
        zVar.v(q0.c(ee1.f.class), oVar, rVar.new g(null));
        return i0.f148189a;
    }

    private final DialogData v9(dx.b.Business business) {
        return new DialogData(cb4.h.b.f24985a, business.getTitle(), business.getMessage(), new DialogButtonTextData(business.getPrimaryActionLabel(), null, new er.a() { // from class: ee1.p
            @Override // er.a
            public final Object a() {
                return r.w9();
            }
        }, 2, null), null, null, null, 112, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 w9() {
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<ee1.e> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State, Object> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<h.Data> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: p9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(ee1.e eVar, tq.e<? super i0> eVar2) {
        return super.F(eVar, eVar2);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: s9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(i0 i0Var) {
        super.P5(i0Var);
    }
}
