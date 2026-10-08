package yx0;

import android.graphics.Bitmap;
import androidx.p016lifecycle.u0;
import fr.q0;
import k10.c0;
import mu.p0;
import mx.Label;
import n20.State;
import o20.t2;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import vx0.AdvocateCardData;
import vx0.Document;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 b2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001cBi\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b#\u0010$J\"\u0010*\u001a\u00020)2\u0006\u0010&\u001a\u00020%2\b\u0010(\u001a\u0004\u0018\u00010'H\u0082@¢\u0006\u0004\b*\u0010+J\u0017\u0010.\u001a\u00020)2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b.\u0010/J\u0018\u00102\u001a\u00020)2\u0006\u00101\u001a\u000200H\u0096\u0001¢\u0006\u0004\b2\u00103J\u0010\u00104\u001a\u00020)H\u0096\u0001¢\u0006\u0004\b4\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bJ\u0010KR \u0010R\u001a\b\u0012\u0004\u0012\u00020M0L8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR,\u0010X\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040S8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010!\u001a\b\u0012\u0004\u0012\u00020\"0Y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]R\u001a\u0010a\u001a\b\u0012\u0004\u0012\u00020_0^8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010`¨\u0006d"}, d2 = {"Lyx0/v;", "Ll00/g;", "Ln20/b;", "Lyx0/j;", "Ln20/a;", "Lyx0/k;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lxx0/g;", "advocateCardDocumentMapper", "snackBarManagerStateHolder", "Lac4/a;", "callActionWithLoaderUseCase", "Lxx0/b;", "advocateCardDialogMapper", "Lxx0/k;", "advocateErrorMapper", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lmz3/z;", "updateDocumentAsyncUC", "Lb00/c;", "imageConverter", "Lmx/c;", "labelProvider", "Lo20/t2$a;", "deps", "Lux0/a;", "advocateCardContainersInteractor", "<init>", "(Ln20/j;Lxx0/g;Li70/n;Lac4/a;Lxx0/b;Lxx0/k;Lmz3/w;Lmz3/z;Lb00/c;Lmx/c;Lo20/t2$a;Lux0/a;)V", "state", "Lyx0/k$a;", "E9", "(Ln20/b;)Lyx0/k$a;", "Lmz3/z$b;", "updateMethodType", "", "documentId", "Loq/i0;", "H9", "(Lmz3/z$b;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lmz3/z$c;", "result", "z9", "(Lmz3/z$c;)V", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "()V", "b", "Lxx0/g;", "c", "Li70/n;", "d", "Lac4/a;", "e", "Lxx0/b;", "f", "Lxx0/k;", "g", "Lmz3/w;", "h", "Lmz3/z;", "j", "Lb00/c;", "k", "Lmx/c;", "l", "Lo20/t2$a;", "m", "Lux0/a;", "Lxw/b;", "Lyx0/f;", "n", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "p", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "q", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "r", "a", "advocatecard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class v extends l00.g<State<yx0.j>, n20.a> implements yx0.k, zx.b, i70.n {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f230207s = 8;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final rq0.b.d f230208t = rq0.b.d.ADVOCATE_CARD;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final xx0.g advocateCardDocumentMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final xx0.b advocateCardDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final xx0.k advocateErrorMapper;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final ux0.a advocateCardContainersInteractor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<yx0.j>, n20.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final xw.b<yx0.f> navAction = new xw.b<>();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final p0<yx0.k.a> state = a9(new b(e9().getState(), this), yx0.k.a.C6181a.f230191a);

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<yx0.k.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f230223a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ v f230224b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f230225a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ v f230226b;

            /* JADX INFO: renamed from: yx0.v$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C6182a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f230227d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f230228e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f230229f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f230231h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f230232j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f230233k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f230234l;

                public C6182a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f230227d = obj;
                    this.f230228e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, v vVar) {
                this.f230225a = hVar;
                this.f230226b = vVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C6182a c6182a;
                if (eVar instanceof C6182a) {
                    c6182a = (C6182a) eVar;
                    int i15 = c6182a.f230228e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c6182a.f230228e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c6182a = new C6182a(eVar);
                    }
                } else {
                    c6182a = new C6182a(eVar);
                }
                Object obj2 = c6182a.f230227d;
                Object objE = uq.b.e();
                int i16 = c6182a.f230228e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f230225a;
                    yx0.k.a aVarE9 = this.f230226b.E9((State) obj);
                    c6182a.f230229f = vq.j.a(obj);
                    c6182a.f230231h = vq.j.a(c6182a);
                    c6182a.f230232j = vq.j.a(obj);
                    c6182a.f230233k = vq.j.a(hVar);
                    c6182a.f230234l = 0;
                    c6182a.f230228e = 1;
                    if (hVar.F(aVarE9, c6182a) == objE) {
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

        public b(mu.g gVar, v vVar) {
            this.f230223a = gVar;
            this.f230224b = vVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super yx0.k.a> hVar, tq.e eVar) {
            Object objA = this.f230223a.a(new a(hVar, this.f230224b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lyx0/j$a;", "it", "Loq/i0;", "<anonymous>", "(Lyx0/j$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<yx0.j.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230235e;

        c(tq.e<? super c> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x005a, code lost:
        
            if (r7.F(r1, r6) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r7) throws java.lang.Throwable {
            /*
                r6 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r6.f230235e
                r2 = 1
                r3 = 2
                if (r1 == 0) goto L1e
                if (r1 == r2) goto L1a
                if (r1 != r3) goto L12
                oq.u.b(r7)
                goto L6c
            L12:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L1a:
                oq.u.b(r7)
                goto L39
            L1e:
                oq.u.b(r7)
                yx0.v r7 = yx0.v.this
                mz3.w r7 = yx0.v.u9(r7)
                mz3.w$a r1 = new mz3.w$a
                rq0.b$d r4 = yx0.v.s9()
                r1.<init>(r4)
                r6.f230235e = r2
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L39
                goto L5c
            L39:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r1 = r7 instanceof mz3.w.b.NotReady
                if (r1 == 0) goto L5d
                yx0.v r7 = yx0.v.this
                xw.b r7 = r7.Y1()
                yx0.f$d r1 = new yx0.f$d
                gv3.b$b r2 = new gv3.b$b
                rq0.b$d r4 = yx0.v.s9()
                r5 = 0
                r2.<init>(r4, r5, r3, r5)
                r1.<init>(r2)
                r6.f230235e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto L6c
            L5c:
                return r0
            L5d:
                mz3.w$b$b r0 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r0)
                if (r7 == 0) goto L6f
                yx0.v r7 = yx0.v.this
                yx0.e r0 = yx0.e.f230178a
                yx0.v.n9(r7, r0)
            L6c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L6f:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: yx0.v.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(yx0.j.a aVar, tq.e<? super i0> eVar) {
            return ((c) v(aVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return v.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx0/b;", "<unused var>", "Lyx0/j$a;", "Loq/i0;", "<anonymous>", "(Lyx0/b;Lyx0/j$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<yx0.b, yx0.j.a, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230237e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f230239e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f230240f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f230240f = vVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f230239e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                ux0.a aVar = this.f230240f.advocateCardContainersInteractor;
                this.f230239e = 1;
                Object objB = aVar.b(null, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f230240f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004c, code lost:
        
            if (r11.F(r1, r10) == r0) goto L15;
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
                int r1 = r10.f230237e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L13
                oq.u.b(r11)
                r7 = r10
                goto L4f
            L13:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1b:
                oq.u.b(r11)
                r7 = r10
                goto L3e
            L20:
                oq.u.b(r11)
                yx0.v r11 = yx0.v.this
                ac4.a r4 = yx0.v.r9(r11)
                yx0.v$d$a r6 = new yx0.v$d$a
                yx0.v r11 = yx0.v.this
                r1 = 0
                r6.<init>(r11, r1)
                r10.f230237e = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3e
                goto L4e
            L3e:
                yx0.v r11 = yx0.v.this
                xw.b r11 = r11.Y1()
                yx0.f$a r1 = yx0.f.a.f230179a
                r7.f230237e = r2
                java.lang.Object r11 = r11.F(r1, r10)
                if (r11 != r0) goto L4f
            L4e:
                return r0
            L4f:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: yx0.v.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx0.b bVar, yx0.j.a aVar, tq.e<? super i0> eVar) {
            return v.this.new d(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx0/d;", "action", "Lyx0/j$b;", "state", "Loq/i0;", "<anonymous>", "(Lyx0/d;Lyx0/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<GoToVerificationProcess, yx0.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230243g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToVerificationProcess goToVerificationProcess = (GoToVerificationProcess) this.f230242f;
            yx0.j.Initialized initialized = (yx0.j.Initialized) this.f230243g;
            Object objE = uq.b.e();
            int i15 = this.f230241e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (initialized.getData().getStatus().e()) {
                    xw.b<yx0.f> bVarY1 = v.this.Y1();
                    yx0.f.c cVar = yx0.f.c.f230181a;
                    this.f230242f = vq.j.a(goToVerificationProcess);
                    this.f230243g = vq.j.a(initialized);
                    this.f230241e = 1;
                    if (bVarY1.F(cVar, this) == objE) {
                        return objE;
                    }
                } else {
                    v.this.d9(new ShowAdvocateDialog(new xx0.l.Refresh(goToVerificationProcess.a())));
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
        public final Object w(GoToVerificationProcess goToVerificationProcess, yx0.j.Initialized initialized, tq.e<? super i0> eVar) {
            e eVar2 = v.this.new e(eVar);
            eVar2.f230242f = goToVerificationProcess;
            eVar2.f230243g = initialized;
            return eVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx0/c;", "action", "Lyx0/j$b;", "state", "Loq/i0;", "<anonymous>", "(Lyx0/c;Lyx0/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<GoToUpdateProcess, yx0.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230245e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230246f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f230247g;

        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f230249e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f230250f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ GoToUpdateProcess f230251g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ yx0.j.Initialized f230252h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, GoToUpdateProcess goToUpdateProcess, yx0.j.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f230250f = vVar;
                this.f230251g = goToUpdateProcess;
                this.f230252h = initialized;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f230249e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    v vVar = this.f230250f;
                    mz3.z.b updateMethodType = this.f230251g.getUpdateMethodType();
                    Document document = this.f230252h.getData().getDocument();
                    String documentId = document != null ? document.getDocumentId() : null;
                    this.f230249e = 1;
                    if (vVar.H9(updateMethodType, documentId, this) == objE) {
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

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f230250f, this.f230251g, this.f230252h, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super i0> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToUpdateProcess goToUpdateProcess = (GoToUpdateProcess) this.f230246f;
            yx0.j.Initialized initialized = (yx0.j.Initialized) this.f230247g;
            Object objE = uq.b.e();
            int i15 = this.f230245e;
            if (i15 == 0) {
                oq.u.b(obj);
                ac4.a aVar = v.this.callActionWithLoaderUseCase;
                a aVar2 = new a(v.this, goToUpdateProcess, initialized, null);
                this.f230246f = vq.j.a(goToUpdateProcess);
                this.f230247g = vq.j.a(initialized);
                this.f230245e = 1;
                if (ac4.a.a(aVar, null, aVar2, this, 1, null) == objE) {
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
        public final Object w(GoToUpdateProcess goToUpdateProcess, yx0.j.Initialized initialized, tq.e<? super i0> eVar) {
            f fVar = v.this.new f(eVar);
            fVar.f230246f = goToUpdateProcess;
            fVar.f230247g = initialized;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx0/b;", "<unused var>", "Lyx0/j$b;", "state", "Loq/i0;", "<anonymous>", "(Lyx0/b;Lyx0/j$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<yx0.b, yx0.j.Initialized, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230253e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230254f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f230256e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ v f230257f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ yx0.j.Initialized f230258g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(v vVar, yx0.j.Initialized initialized, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f230257f = vVar;
                this.f230258g = initialized;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f230256e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                ux0.a aVar = this.f230257f.advocateCardContainersInteractor;
                Document document = this.f230258g.getData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f230256e = 1;
                Object objB = aVar.b(documentId, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<i0> M(tq.e<?> eVar) {
                return new a(this.f230257f, this.f230258g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, i0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x005c, code lost:
        
            if (r12.F(r2, r11) == r1) goto L15;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f230254f
                yx0.j$b r0 = (yx0.j.Initialized) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f230253e
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L24
                if (r2 == r4) goto L1f
                if (r2 != r3) goto L17
                oq.u.b(r12)
                r8 = r11
                goto L5f
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                r8 = r11
                goto L48
            L24:
                oq.u.b(r12)
                yx0.v r12 = yx0.v.this
                ac4.a r5 = yx0.v.r9(r12)
                yx0.v$g$a r7 = new yx0.v$g$a
                yx0.v r12 = yx0.v.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f230254f = r12
                r11.f230253e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5e
            L48:
                yx0.v r12 = yx0.v.this
                xw.b r12 = r12.Y1()
                yx0.f$a r2 = yx0.f.a.f230179a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f230254f = r0
                r8.f230253e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5f
            L5e:
                return r1
            L5f:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: yx0.v.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx0.b bVar, yx0.j.Initialized initialized, tq.e<? super i0> eVar) {
            g gVar = v.this.new g(eVar);
            gVar.f230254f = initialized;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx0/a;", "<unused var>", "Lyx0/j;", "Loq/i0;", "<anonymous>", "(Lyx0/a;Lyx0/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.q<a, yx0.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230259e;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f230259e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yx0.f> bVarY1 = v.this.Y1();
                yx0.f.a aVar = yx0.f.a.f230179a;
                this.f230259e = 1;
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
        public final Object w(a aVar, yx0.j jVar, tq.e<? super i0> eVar) {
            return v.this.new h(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyx0/h;", "<unused var>", "Lyx0/j;", "Loq/i0;", "<anonymous>", "(Lyx0/h;Lyx0/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<yx0.h, yx0.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230261e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f230262f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f230263g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f230264h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f230265j;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0069, code lost:
        
            if (r1.F(r4, r5) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r6) throws java.lang.Throwable {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f230265j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f230262f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f230261e
                dx.i r0 = (dx.i) r0
                oq.u.b(r6)
                goto L6c
            L1a:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L22:
                oq.u.b(r6)
                goto L40
            L26:
                oq.u.b(r6)
                yx0.v r6 = yx0.v.this
                ux0.a r6 = yx0.v.o9(r6)
                yx0.v r1 = yx0.v.this
                yx0.b r4 = yx0.b.f230175a
                er.a r1 = yx0.v.m9(r1, r4)
                r5.f230265j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                yx0.v r1 = yx0.v.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                yx0.f$e r4 = new yx0.f$e
                r4.<init>(r3)
                r5.f230261e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f230262f = r6
                r6 = 0
                r5.f230263g = r6
                r5.f230264h = r6
                r5.f230265j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: yx0.v.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(yx0.h hVar, yx0.j jVar, tq.e<? super i0> eVar) {
            return v.this.new i(eVar).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx0/g;", "action", "Lyx0/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx0/g;Lyx0/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ShowAdvocateDialog, yx0.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230267e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230268f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowAdvocateDialog showAdvocateDialog = (ShowAdvocateDialog) this.f230268f;
            Object objE = uq.b.e();
            int i15 = this.f230267e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yx0.f> bVarY1 = v.this.Y1();
                yx0.f.ShowDialog showDialog = new yx0.f.ShowDialog(v.this.advocateCardDialogMapper.b(showAdvocateDialog.getDialog()));
                this.f230268f = vq.j.a(showAdvocateDialog);
                this.f230267e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
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
        public final Object w(ShowAdvocateDialog showAdvocateDialog, yx0.j jVar, tq.e<? super i0> eVar) {
            j jVar2 = v.this.new j(eVar);
            jVar2.f230268f = showAdvocateDialog;
            return jVar2.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lyx0/i;", "action", "Lyx0/j;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lyx0/i;Lyx0/j;)V"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<ShowError, yx0.j, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f230270e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f230271f;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowError showError = (ShowError) this.f230271f;
            Object objE = uq.b.e();
            int i15 = this.f230270e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<yx0.f> bVarY1 = v.this.Y1();
                yx0.f.Error error = new yx0.f.Error(v.this.advocateErrorMapper.b(showError.getError()));
                this.f230271f = vq.j.a(showError);
                this.f230270e = 1;
                if (bVarY1.F(error, this) == objE) {
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
        public final Object w(ShowError showError, yx0.j jVar, tq.e<? super i0> eVar) {
            k kVar = v.this.new k(eVar);
            kVar.f230271f = showError;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lyx0/e;", "<unused var>", "Lk10/c0;", "Lyx0/j;", "state", "Lk10/l;", "<anonymous>", "(Lyx0/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<yx0.e, c0<yx0.j>, tq.e<? super k10.l<? extends yx0.j>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230273e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f230274f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f230275g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f230276h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f230277j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f230278k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f230279l;

        l(tq.e<? super l> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final yx0.j.Initialized O(AdvocateCardData advocateCardData, Bitmap bitmap, String str, yx0.j jVar) {
            return new yx0.j.Initialized(advocateCardData, bitmap, str);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00e9  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            v vVar;
            int i15;
            final AdvocateCardData advocateCardData;
            int i16;
            Bitmap bitmap;
            Object objD;
            final Bitmap bitmap2;
            c0 c0Var = (c0) this.f230279l;
            Object objE = uq.b.e();
            int i17 = this.f230278k;
            if (i17 == 0) {
                oq.u.b(obj);
                ux0.a aVar = v.this.advocateCardContainersInteractor;
                this.f230279l = c0Var;
                this.f230278k = 1;
                obj = aVar.e(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    int i18 = this.f230277j;
                    i16 = this.f230276h;
                    AdvocateCardData advocateCardData2 = (AdvocateCardData) this.f230275g;
                    vVar = (v) this.f230274f;
                    iVar = (dx.i) this.f230273e;
                    oq.u.b(obj);
                    i15 = i18;
                    advocateCardData = advocateCardData2;
                    bitmap = (Bitmap) ((dx.i) obj).a();
                    ux0.a aVar2 = vVar.advocateCardContainersInteractor;
                    this.f230279l = c0Var;
                    this.f230273e = vq.j.a(iVar);
                    this.f230274f = advocateCardData;
                    this.f230275g = bitmap;
                    this.f230276h = i16;
                    this.f230277j = i15;
                    this.f230278k = 3;
                    objD = aVar2.d(this);
                    if (objD != objE) {
                        bitmap2 = bitmap;
                        obj = objD;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bitmap2 = (Bitmap) this.f230275g;
                advocateCardData = (AdvocateCardData) this.f230274f;
                oq.u.b(obj);
            }
            final String str = (String) ((dx.i) obj).a();
            return c0Var.d(new er.l() { // from class: yx0.w
                @Override // er.l
                public final Object b(Object obj2) {
                    return v.l.O(advocateCardData, bitmap2, str, (j) obj2);
                }
            });
            iVar = (dx.i) obj;
            vVar = v.this;
            if (iVar instanceof dx.i.Left) {
                vVar.d9(new ShowError(new xx0.k.a.GetDocument((dx.b) ((dx.i.Left) iVar).b(), vVar.b9(yx0.b.f230175a), vVar.b9(a.f230174a))));
                return c0Var.c();
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            AdvocateCardData advocateCardData3 = (AdvocateCardData) ((dx.i.Right) iVar).b();
            b00.c cVar = vVar.imageConverter;
            String photo = advocateCardData3.getUserData().getPhoto();
            this.f230279l = c0Var;
            this.f230273e = vq.j.a(iVar);
            this.f230274f = vVar;
            this.f230275g = advocateCardData3;
            i15 = 0;
            this.f230276h = 0;
            this.f230277j = 0;
            this.f230278k = 2;
            Object objB = cVar.b(photo, this);
            if (objB != objE) {
                advocateCardData = advocateCardData3;
                obj = objB;
                i16 = 0;
                bitmap = (Bitmap) ((dx.i) obj).a();
                ux0.a aVar3 = vVar.advocateCardContainersInteractor;
                this.f230279l = c0Var;
                this.f230273e = vq.j.a(iVar);
                this.f230274f = advocateCardData;
                this.f230275g = bitmap;
                this.f230276h = i16;
                this.f230277j = i15;
                this.f230278k = 3;
                objD = aVar3.d(this);
                if (objD != objE) {
                    bitmap2 = bitmap;
                    obj = objD;
                    final String str2 = (String) ((dx.i) obj).a();
                    return c0Var.d(new er.l() { // from class: yx0.w
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return v.l.O(advocateCardData, bitmap2, str2, (j) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(yx0.e eVar, c0<yx0.j> c0Var, tq.e<? super k10.l<? extends yx0.j>> eVar2) {
            l lVar = v.this.new l(eVar2);
            lVar.f230279l = c0Var;
            return lVar.J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f230281d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f230282e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f230283f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f230284g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f230285h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f230286j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f230287k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f230288l;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f230290n;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f230288l = obj;
            this.f230290n |= PKIFailureInfo.systemUnavail;
            return v.this.H9(null, null, this);
        }
    }

    public v(n20.j jVar, xx0.g gVar, i70.n nVar, ac4.a aVar, xx0.b bVar, xx0.k kVar, mz3.w wVar, mz3.z zVar, b00.c cVar, mx.c cVar2, t2.a aVar2, ux0.a aVar3) {
        this.advocateCardDocumentMapper = gVar;
        this.snackBarManagerStateHolder = nVar;
        this.callActionWithLoaderUseCase = aVar;
        this.advocateCardDialogMapper = bVar;
        this.advocateErrorMapper = kVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.updateDocumentAsyncUC = zVar;
        this.imageConverter = cVar;
        this.labelProvider = cVar2;
        this.deps = aVar2;
        this.advocateCardContainersInteractor = aVar3;
        this.stateMachine = jVar.a(yx0.j.a.f230187a, new er.l() { // from class: yx0.p
            @Override // er.l
            public final Object b(Object obj) {
                return v.A9(this.f230200a, (k10.v) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A9(final v vVar, k10.v vVar2) {
        vVar2.c(q0.c(yx0.j.a.class), new er.l() { // from class: yx0.s
            @Override // er.l
            public final Object b(Object obj) {
                return v.B9(this.f230203a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(yx0.j.Initialized.class), new er.l() { // from class: yx0.t
            @Override // er.l
            public final Object b(Object obj) {
                return v.C9(this.f230204a, (k10.z) obj);
            }
        });
        vVar2.c(q0.c(yx0.j.class), new er.l() { // from class: yx0.u
            @Override // er.l
            public final Object b(Object obj) {
                return v.D9(this.f230205a, (k10.z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 B9(v vVar, k10.z zVar) {
        zVar.C(vVar.new c(null));
        d dVar = vVar.new d(null);
        zVar.x(q0.c(yx0.b.class), k10.o.CANCEL_PREVIOUS, dVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(v vVar, k10.z zVar) {
        e eVar = vVar.new e(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(GoToVerificationProcess.class), oVar, eVar);
        zVar.x(q0.c(GoToUpdateProcess.class), oVar, vVar.new f(null));
        zVar.x(q0.c(yx0.b.class), oVar, vVar.new g(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(v vVar, k10.z zVar) {
        h hVar = vVar.new h(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(a.class), oVar, hVar);
        zVar.x(q0.c(yx0.h.class), oVar, vVar.new i(null));
        zVar.x(q0.c(ShowAdvocateDialog.class), oVar, vVar.new j(null));
        zVar.x(q0.c(ShowError.class), oVar, vVar.new k(null));
        zVar.v(q0.c(yx0.e.class), oVar, vVar.new l(null));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final yx0.k.a E9(State<yx0.j> state) {
        return this.advocateCardDocumentMapper.b(new xx0.g.Params(state, b9(new GoToVerificationProcess(b9(new GoToUpdateProcess(mz3.z.b.UPDATE)))), new er.l() { // from class: yx0.q
            @Override // er.l
            public final Object b(Object obj) {
                return v.F9(this.f230201a, (mz3.z.b) obj);
            }
        }, b9(yx0.h.f230185a), b9(a.f230174a), new er.l() { // from class: yx0.r
            @Override // er.l
            public final Object b(Object obj) {
                return v.G9(this.f230202a, (n20.a) obj);
            }
        }, new t2(this.deps, u0.a(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 F9(v vVar, mz3.z.b bVar) {
        vVar.d9(new GoToUpdateProcess(bVar));
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 G9(v vVar, n20.a aVar) {
        vVar.d9(aVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:36:0x0112  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x010f, code lost:
    
        if (F(r11, r2) == r3) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x017b, code lost:
    
        if (r9.F(r11, r2) == r3) goto L46;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H9(mz3.z.b r17, java.lang.String r18, tq.e<? super oq.i0> r19) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: yx0.v.H9(mz3.z$b, java.lang.String, tq.e):java.lang.Object");
    }

    private final void z9(mz3.z.c result) {
        Label labelC;
        if (fr.t.c(result, mz3.z.c.a.f129731a)) {
            labelC = this.labelProvider.c(sx0.a.f185196g);
        } else {
            if (!(result instanceof mz3.z.c.UpdateStarted)) {
                throw new oq.p();
            }
            labelC = this.labelProvider.c(sx0.a.f185198i);
        }
        y(new p50.a.DefaultWithIcon(labelC, false, null, null, 14, null));
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    public xw.b<yx0.f> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected k10.t<State<yx0.j>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<yx0.k.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: x9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(yx0.f fVar, tq.e<? super i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: y9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(yx0.k.a aVar) {
        super.P5(aVar);
    }
}
