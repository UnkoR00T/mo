package fo1;

import android.graphics.Bitmap;
import androidx.p016lifecycle.u0;
import cb4.DialogData;
import do1.DeputyCardData;
import do1.Document;
import fr.q0;
import mu.p0;
import n20.State;
import o20.t2;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 a2\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u00052\u00020\u00062\u00020\u0007:\u0001bBi\b\u0007\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010&\u001a\u00020%2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010*\u001a\u00020)*\u00020(H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020!H\u0016¢\u0006\u0004\b,\u0010#J\u0018\u0010/\u001a\u00020!2\u0006\u0010.\u001a\u00020-H\u0096\u0001¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020!H\u0096\u0001¢\u0006\u0004\b1\u0010#R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\f\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR \u0010Q\u001a\b\u0012\u0004\u0012\u00020L0K8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bM\u0010N\u001a\u0004\bO\u0010PR,\u0010W\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0004\u0012\u00020\u00040R8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR \u0010$\u001a\b\u0012\u0004\u0012\u00020%0X8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020^0]8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b?\u0010_¨\u0006c"}, d2 = {"Lfo1/b0;", "Ll00/g;", "Ln20/b;", "Lfo1/i;", "Ln20/a;", "Lfo1/j;", "", "Li70/n;", "Ln20/j;", "stateMachineFactory", "Lgo1/j;", "deputyCardDocumentMapper", "snackBarManagerStateHolder", "Lgo1/f;", "errorMapper", "Lgo1/b;", "deputyCardDialogMapper", "Lac4/a;", "callActionWithLoaderUseCase", "Lb00/c;", "imageConverter", "Lmz3/z;", "updateDocumentAsyncUC", "Lmz3/w;", "shouldDisplayDownloadLoaderUC", "Lo20/t2$a;", "deps", "Lco1/a;", "deputyContainersInteractor", "Lhb4/d;", "errorVMSFactory", "<init>", "(Ln20/j;Lgo1/j;Li70/n;Lgo1/f;Lgo1/b;Lac4/a;Lb00/c;Lmz3/z;Lmz3/w;Lo20/t2$a;Lco1/a;Lhb4/d;)V", "Loq/i0;", "H9", "()V", "state", "Lfo1/j$a;", "P9", "(Ln20/b;)Lfo1/j$a;", "Lgo1/f$a;", "Ljb4/b;", "E9", "(Lgo1/f$a;)Ljb4/b;", "d", "Lp50/a;", "snackBarData", "y", "(Lp50/a;)V", "B0", "b", "Lgo1/j;", "c", "Li70/n;", "Lgo1/f;", "e", "Lgo1/b;", "f", "Lac4/a;", "g", "Lb00/c;", "h", "Lmz3/z;", "j", "Lmz3/w;", "k", "Lo20/t2$a;", "l", "Lco1/a;", "m", "Lhb4/d;", "Lfo1/i$a;", "n", "Lfo1/i$a;", "initialState", "Lxw/b;", "Lfo1/f;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "Lk10/t;", "q", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "r", "Lmu/p0;", "getState", "()Lmu/p0;", "Lmu/g;", "Li70/p;", "()Lmu/g;", "snackBarVisibilityState", "s", "a", "deputycard_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b0 extends l00.g<State<fo1.i>, n20.a> implements fo1.j, zx.b, i70.n {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f65602t = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final rq0.b.d f65603v = rq0.b.d.DEPUTY_CARD;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final go1.j deputyCardDocumentMapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final i70.n snackBarManagerStateHolder;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final go1.f errorMapper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final go1.b deputyCardDialogMapper;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a callActionWithLoaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final mz3.z updateDocumentAsyncUC;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final mz3.w shouldDisplayDownloadLoaderUC;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t2.a deps;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final co1.a deputyContainersInteractor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final hb4.d errorVMSFactory;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final fo1.i.a initialState;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<fo1.f> navAction;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final k10.t<State<fo1.i>, n20.a> stateMachine;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final p0<fo1.j.a> state;

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements mu.g<fo1.j.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f65619a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0 f65620b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f65621a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b0 f65622b;

            /* JADX INFO: renamed from: fo1.b0$b$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1461a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f65623d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f65624e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f65625f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f65627h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f65628j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f65629k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f65630l;

                public C1461a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f65623d = obj;
                    this.f65624e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, b0 b0Var) {
                this.f65621a = hVar;
                this.f65622b = b0Var;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1461a c1461a;
                if (eVar instanceof C1461a) {
                    c1461a = (C1461a) eVar;
                    int i15 = c1461a.f65624e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1461a.f65624e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1461a = new C1461a(eVar);
                    }
                } else {
                    c1461a = new C1461a(eVar);
                }
                Object obj2 = c1461a.f65623d;
                Object objE = uq.b.e();
                int i16 = c1461a.f65624e;
                if (i16 == 0) {
                    oq.u.b(obj2);
                    mu.h hVar = this.f65621a;
                    fo1.j.a aVarP9 = this.f65622b.P9((State) obj);
                    c1461a.f65625f = vq.j.a(obj);
                    c1461a.f65627h = vq.j.a(c1461a);
                    c1461a.f65628j = vq.j.a(obj);
                    c1461a.f65629k = vq.j.a(hVar);
                    c1461a.f65630l = 0;
                    c1461a.f65624e = 1;
                    if (hVar.F(aVarP9, c1461a) == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj2);
                }
                return oq.i0.f148189a;
            }
        }

        public b(mu.g gVar, b0 b0Var) {
            this.f65619a = gVar;
            this.f65620b = b0Var;
        }

        @Override // mu.g
        public Object a(mu.h<? super fo1.j.a> hVar, tq.e eVar) {
            Object objA = this.f65619a.a(new a(hVar, this.f65620b), eVar);
            return objA == uq.b.e() ? objA : oq.i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lfo1/i$a;", "it", "Loq/i0;", "<anonymous>", "(Lfo1/i$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<fo1.i.a, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65631e;

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
                int r1 = r6.f65631e
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
                fo1.b0 r7 = fo1.b0.this
                mz3.w r7 = fo1.b0.y9(r7)
                mz3.w$a r1 = new mz3.w$a
                rq0.b$d r4 = fo1.b0.v9()
                r1.<init>(r4)
                r6.f65631e = r2
                java.lang.Object r7 = r7.c(r1, r6)
                if (r7 != r0) goto L39
                goto L5c
            L39:
                mz3.w$b r7 = (mz3.w.b) r7
                boolean r1 = r7 instanceof mz3.w.b.NotReady
                if (r1 == 0) goto L5d
                fo1.b0 r7 = fo1.b0.this
                xw.b r7 = r7.Y1()
                fo1.f$c r1 = new fo1.f$c
                gv3.b$b r2 = new gv3.b$b
                rq0.b$d r4 = fo1.b0.v9()
                r5 = 0
                r2.<init>(r4, r5, r3, r5)
                r1.<init>(r2)
                r6.f65631e = r3
                java.lang.Object r7 = r7.F(r1, r6)
                if (r7 != r0) goto L6c
            L5c:
                return r0
            L5d:
                mz3.w$b$b r0 = mz3.w.b.C3231b.f129717a
                boolean r7 = fr.t.c(r7, r0)
                if (r7 == 0) goto L6f
                fo1.b0 r7 = fo1.b0.this
                fo1.e r0 = fo1.e.f65691a
                fo1.b0.r9(r7, r0)
            L6c:
                oq.i0 r7 = oq.i0.f148189a
                return r7
            L6f:
                oq.p r7 = new oq.p
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: fo1.b0.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(fo1.i.a aVar, tq.e<? super oq.i0> eVar) {
            return ((c) v(aVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return b0.this.new c(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfo1/d;", "action", "Lfo1/i$c$a;", "state", "Loq/i0;", "<anonymous>", "(Lfo1/d;Lfo1/i$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.q<GoToVerificationProcess, fo1.i.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65633e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65634f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f65635g;

        d(tq.e<? super d> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            GoToVerificationProcess goToVerificationProcess = (GoToVerificationProcess) this.f65634f;
            fo1.i.c.Displaying displaying = (fo1.i.c.Displaying) this.f65635g;
            Object objE = uq.b.e();
            int i15 = this.f65633e;
            if (i15 == 0) {
                oq.u.b(obj);
                if (displaying.getStateData().getData().getStatus().e()) {
                    xw.b<fo1.f> bVarY1 = b0.this.Y1();
                    fo1.f.b bVar = fo1.f.b.f65696a;
                    this.f65634f = vq.j.a(goToVerificationProcess);
                    this.f65635g = vq.j.a(displaying);
                    this.f65633e = 1;
                    if (bVarY1.F(bVar, this) == objE) {
                        return objE;
                    }
                } else {
                    b0.this.d9(new ShowDeputyDialog(new go1.k.Refresh(goToVerificationProcess.a())));
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToVerificationProcess goToVerificationProcess, fo1.i.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            d dVar = b0.this.new d(eVar);
            dVar.f65634f = goToVerificationProcess;
            dVar.f65635g = displaying;
            return dVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfo1/c;", "action", "Lk10/c0;", "Lfo1/i$c$a;", "state", "Lk10/l;", "Lfo1/i;", "<anonymous>", "(Lfo1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.q<GoToUpdateProcess, k10.c0<fo1.i.c.Displaying>, tq.e<? super k10.l<? extends fo1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65637e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65638f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f65639g;

        e(tq.e<? super e> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fo1.i.c.DocumentUpdating O(GoToUpdateProcess goToUpdateProcess, fo1.i.c.Displaying displaying) {
            return new fo1.i.c.DocumentUpdating(displaying.getStateData(), goToUpdateProcess.getUpdateMethodType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final GoToUpdateProcess goToUpdateProcess = (GoToUpdateProcess) this.f65638f;
            k10.c0 c0Var = (k10.c0) this.f65639g;
            uq.b.e();
            if (this.f65637e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fo1.c0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.e.O(goToUpdateProcess, (i.c.Displaying) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToUpdateProcess goToUpdateProcess, k10.c0<fo1.i.c.Displaying> c0Var, tq.e<? super k10.l<? extends fo1.i>> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f65638f = goToUpdateProcess;
            eVar2.f65639g = c0Var;
            return eVar2.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfo1/b;", "<unused var>", "Lfo1/i$c$a;", "state", "Loq/i0;", "<anonymous>", "(Lfo1/b;Lfo1/i$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements er.q<fo1.b, fo1.i.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65641f;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f65643e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f65644f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ fo1.i.c.Displaying f65645g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, fo1.i.c.Displaying displaying, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f65644f = b0Var;
                this.f65645g = displaying;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f65643e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                co1.a aVar = this.f65644f.deputyContainersInteractor;
                Document document = this.f65645g.getStateData().getData().getDocument();
                String documentId = document != null ? document.getDocumentId() : null;
                this.f65643e = 1;
                Object objB = aVar.b(documentId, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f65644f, this.f65645g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        f(tq.e<? super f> eVar) {
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
                java.lang.Object r0 = r11.f65641f
                fo1.i$c$a r0 = (fo1.i.c.Displaying) r0
                java.lang.Object r1 = uq.b.e()
                int r2 = r11.f65640e
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
                fo1.b0 r12 = fo1.b0.this
                ac4.a r5 = fo1.b0.s9(r12)
                fo1.b0$f$a r7 = new fo1.b0$f$a
                fo1.b0 r12 = fo1.b0.this
                r2 = 0
                r7.<init>(r12, r0, r2)
                java.lang.Object r12 = vq.j.a(r0)
                r11.f65641f = r12
                r11.f65640e = r4
                r6 = 0
                r9 = 1
                r10 = 0
                r8 = r11
                java.lang.Object r12 = ac4.a.a(r5, r6, r7, r8, r9, r10)
                if (r12 != r1) goto L48
                goto L5e
            L48:
                fo1.b0 r12 = fo1.b0.this
                xw.b r12 = r12.Y1()
                fo1.f$a r2 = fo1.f.a.f65695a
                java.lang.Object r0 = vq.j.a(r0)
                r8.f65641f = r0
                r8.f65640e = r3
                java.lang.Object r12 = r12.F(r2, r11)
                if (r12 != r1) goto L5f
            L5e:
                return r1
            L5f:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: fo1.b0.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fo1.b bVar, fo1.i.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            f fVar = b0.this.new f(eVar);
            fVar.f65641f = displaying;
            return fVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfo1/a;", "<unused var>", "Lfo1/i$c$a;", "Loq/i0;", "<anonymous>", "(Lfo1/a;Lfo1/i$c$a;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements er.q<a, fo1.i.c.Displaying, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65646e;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f65646e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fo1.f> bVarY1 = b0.this.Y1();
                fo1.f.a aVar = fo1.f.a.f65695a;
                this.f65646e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, fo1.i.c.Displaying displaying, tq.e<? super oq.i0> eVar) {
            return b0.this.new g(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lk10/c0;", "Lfo1/i$c$b;", "state", "Lk10/l;", "Lfo1/i;", "<anonymous>", "(Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements er.p<k10.c0<fo1.i.c.DocumentUpdating>, tq.e<? super k10.l<? extends fo1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65648e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65649f;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lk10/l;", "Lfo1/i$c;", "<anonymous>", "()Lk10/l;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super k10.l<? extends fo1.i.c>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            Object f65651e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            Object f65652f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            Object f65653g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            Object f65654h;

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            int f65655j;

            /* JADX INFO: renamed from: k, reason: collision with root package name */
            int f65656k;

            /* JADX INFO: renamed from: l, reason: collision with root package name */
            int f65657l;

            /* JADX INFO: renamed from: m, reason: collision with root package name */
            final /* synthetic */ b0 f65658m;

            /* JADX INFO: renamed from: n, reason: collision with root package name */
            final /* synthetic */ k10.c0<fo1.i.c.DocumentUpdating> f65659n;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, k10.c0<fo1.i.c.DocumentUpdating> c0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f65658m = b0Var;
                this.f65659n = c0Var;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fo1.i.c.Displaying Y(fo1.i.c.DocumentUpdating documentUpdating) {
                return new fo1.i.c.Displaying(documentUpdating.getStateData());
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fo1.i.c.Error Z(b0 b0Var, dx.b bVar, k10.c0 c0Var, fo1.i.c.DocumentUpdating documentUpdating) {
                return new fo1.i.c.Error(documentUpdating.getStateData(), b0Var.errorVMSFactory.a(b0Var.E9(new go1.f.a.UpdateDocument(bVar, ((fo1.i.c.DocumentUpdating) c0Var.a()).getUpdateMethodType()))));
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final fo1.i.c.Displaying a0(fo1.i.c.DocumentUpdating documentUpdating) {
                return new fo1.i.c.Displaying(documentUpdating.getStateData());
            }

            /* JADX WARN: Code duplicated, block: B:29:0x00e6  */
            /* JADX WARN: Code duplicated, block: B:32:0x010c  */
            /* JADX WARN: Code duplicated, block: B:35:0x0117  */
            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                dx.i iVar;
                final k10.c0<fo1.i.c.DocumentUpdating> c0Var;
                int i15;
                k10.c0<fo1.i.c.DocumentUpdating> c0Var2;
                final dx.b bVar;
                final b0 b0Var;
                int i16;
                DialogData dialogData;
                fo1.f.ShowDialog showDialog;
                k10.c0<fo1.i.c.DocumentUpdating> c0Var3;
                Object objE = uq.b.e();
                int i17 = this.f65657l;
                if (i17 == 0) {
                    oq.u.b(obj);
                    mz3.z zVar = this.f65658m.updateDocumentAsyncUC;
                    rq0.b.d dVar = b0.f65603v;
                    mz3.z.b updateMethodType = this.f65659n.a().getUpdateMethodType();
                    Document document = this.f65659n.a().getStateData().getData().getDocument();
                    mz3.z.Params params = new mz3.z.Params(dVar, updateMethodType, document != null ? document.getDocumentId() : null, false, 8, null);
                    this.f65657l = 1;
                    obj = zVar.c(params, this);
                    if (obj != objE) {
                    }
                    return objE;
                }
                if (i17 != 1) {
                    if (i17 == 2) {
                        int i18 = this.f65656k;
                        i16 = this.f65655j;
                        bVar = (dx.b) this.f65654h;
                        k10.c0<fo1.i.c.DocumentUpdating> c0Var4 = (k10.c0) this.f65653g;
                        b0Var = (b0) this.f65652f;
                        iVar = (dx.i) this.f65651e;
                        oq.u.b(obj);
                        i15 = i18;
                        c0Var = c0Var4;
                        dialogData = (DialogData) obj;
                        if (dialogData != null) {
                            return c0Var.d(new er.l() { // from class: fo1.e0
                                @Override // er.l
                                public final Object b(Object obj2) {
                                    return b0.h.a.Z(b0Var, bVar, c0Var, (i.c.DocumentUpdating) obj2);
                                }
                            });
                        }
                        showDialog = new fo1.f.ShowDialog(dialogData);
                        this.f65651e = vq.j.a(iVar);
                        this.f65652f = c0Var;
                        this.f65653g = vq.j.a(bVar);
                        this.f65654h = vq.j.a(dialogData);
                        this.f65655j = i16;
                        this.f65656k = i15;
                        this.f65657l = 3;
                        if (b0Var.F(showDialog, this) != objE) {
                            c0Var3 = c0Var;
                        }
                        return objE;
                    }
                    if (i17 != 3) {
                        if (i17 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        c0Var2 = (k10.c0) this.f65652f;
                        oq.u.b(obj);
                        c0Var = c0Var2;
                        return c0Var.d(new er.l() { // from class: fo1.f0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return b0.h.a.a0((i.c.DocumentUpdating) obj2);
                            }
                        });
                    }
                    c0Var3 = (k10.c0) this.f65652f;
                    oq.u.b(obj);
                    return c0Var3.d(new er.l() { // from class: fo1.d0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.h.a.Y((i.c.DocumentUpdating) obj2);
                        }
                    });
                }
                oq.u.b(obj);
                iVar = (dx.i) obj;
                b0 b0Var2 = this.f65658m;
                c0Var = this.f65659n;
                i15 = 0;
                if (!(iVar instanceof dx.i.Left)) {
                    if (!(iVar instanceof dx.i.Right)) {
                        throw new oq.p();
                    }
                    mz3.z.c cVar = (mz3.z.c) ((dx.i.Right) iVar).b();
                    if (cVar instanceof mz3.z.c.a) {
                        b0Var2.H9();
                    } else {
                        if (!(cVar instanceof mz3.z.c.UpdateStarted)) {
                            throw new oq.p();
                        }
                        xw.b<fo1.f> bVarY1 = b0Var2.Y1();
                        fo1.f.ShowAsyncDownloadLoader showAsyncDownloadLoader = new fo1.f.ShowAsyncDownloadLoader(new gv3.b.DocumentDownloadSetupData(b0.f65603v, null, 2, null));
                        this.f65651e = vq.j.a(iVar);
                        this.f65652f = c0Var;
                        this.f65653g = vq.j.a(cVar);
                        this.f65655j = 0;
                        this.f65656k = 0;
                        this.f65657l = 4;
                        if (bVarY1.F(showAsyncDownloadLoader, this) != objE) {
                            c0Var2 = c0Var;
                            c0Var = c0Var2;
                        }
                    }
                    return c0Var.d(new er.l() { // from class: fo1.f0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.h.a.a0((i.c.DocumentUpdating) obj2);
                        }
                    });
                }
                bVar = (dx.b) ((dx.i.Left) iVar).b();
                co1.a aVar = b0Var2.deputyContainersInteractor;
                this.f65651e = vq.j.a(iVar);
                this.f65652f = b0Var2;
                this.f65653g = c0Var;
                this.f65654h = bVar;
                this.f65655j = 0;
                this.f65656k = 0;
                this.f65657l = 2;
                Object objA = aVar.a(bVar, this);
                if (objA != objE) {
                    b0Var = b0Var2;
                    obj = objA;
                    i16 = 0;
                    dialogData = (DialogData) obj;
                    if (dialogData != null) {
                        return c0Var.d(new er.l() { // from class: fo1.e0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return b0.h.a.Z(b0Var, bVar, c0Var, (i.c.DocumentUpdating) obj2);
                            }
                        });
                    }
                    showDialog = new fo1.f.ShowDialog(dialogData);
                    this.f65651e = vq.j.a(iVar);
                    this.f65652f = c0Var;
                    this.f65653g = vq.j.a(bVar);
                    this.f65654h = vq.j.a(dialogData);
                    this.f65655j = i16;
                    this.f65656k = i15;
                    this.f65657l = 3;
                    if (b0Var.F(showDialog, this) != objE) {
                        c0Var3 = c0Var;
                        return c0Var3.d(new er.l() { // from class: fo1.d0
                            @Override // er.l
                            public final Object b(Object obj2) {
                                return b0.h.a.Y((i.c.DocumentUpdating) obj2);
                            }
                        });
                    }
                }
                return objE;
            }

            public final tq.e<oq.i0> V(tq.e<?> eVar) {
                return new a(this.f65658m, this.f65659n, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super k10.l<? extends fo1.i.c>> eVar) {
                return ((a) V(eVar)).J(oq.i0.f148189a);
            }
        }

        h(tq.e<? super h> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f65649f;
            Object objE = uq.b.e();
            int i15 = this.f65648e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ac4.a aVar = b0.this.callActionWithLoaderUseCase;
            a aVar2 = new a(b0.this, c0Var, null);
            this.f65649f = vq.j.a(c0Var);
            this.f65648e = 1;
            Object objA = ac4.a.a(aVar, null, aVar2, this, 1, null);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(k10.c0<fo1.i.c.DocumentUpdating> c0Var, tq.e<? super k10.l<? extends fo1.i>> eVar) {
            return ((h) v(c0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            h hVar = b0.this.new h(eVar);
            hVar.f65649f = obj;
            return hVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfo1/g;", "<unused var>", "Lfo1/i;", "Loq/i0;", "<anonymous>", "(Lfo1/g;Lfo1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements er.q<fo1.g, fo1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f65660e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f65661f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f65662g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f65663h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f65664j;

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
                int r1 = r5.f65664j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L26
                if (r1 == r3) goto L22
                if (r1 != r2) goto L1a
                java.lang.Object r0 = r5.f65661f
                cb4.d r0 = (cb4.DialogData) r0
                java.lang.Object r0 = r5.f65660e
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
                fo1.b0 r6 = fo1.b0.this
                co1.a r6 = fo1.b0.u9(r6)
                fo1.b0 r1 = fo1.b0.this
                fo1.b r4 = fo1.b.f65600a
                er.a r1 = fo1.b0.q9(r1, r4)
                r5.f65664j = r3
                java.lang.Object r6 = r6.c(r1, r5)
                if (r6 != r0) goto L40
                goto L6b
            L40:
                dx.i r6 = (dx.i) r6
                fo1.b0 r1 = fo1.b0.this
                boolean r3 = r6 instanceof dx.i.Right
                if (r3 == 0) goto L6c
                r3 = r6
                dx.i$c r3 = (dx.i.Right) r3
                java.lang.Object r3 = r3.b()
                cb4.d r3 = (cb4.DialogData) r3
                fo1.f$d r4 = new fo1.f$d
                r4.<init>(r3)
                r5.f65660e = r6
                java.lang.Object r6 = vq.j.a(r3)
                r5.f65661f = r6
                r6 = 0
                r5.f65662g = r6
                r5.f65663h = r6
                r5.f65664j = r2
                java.lang.Object r6 = r1.F(r4, r5)
                if (r6 != r0) goto L6c
            L6b:
                return r0
            L6c:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: fo1.b0.i.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fo1.g gVar, fo1.i iVar, tq.e<? super oq.i0> eVar) {
            return b0.this.new i(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfo1/h;", "action", "Lfo1/i;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfo1/h;Lfo1/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.q<ShowDeputyDialog, fo1.i, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65666e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65667f;

        j(tq.e<? super j> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            ShowDeputyDialog showDeputyDialog = (ShowDeputyDialog) this.f65667f;
            Object objE = uq.b.e();
            int i15 = this.f65666e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fo1.f> bVarY1 = b0.this.Y1();
                fo1.f.ShowDialog showDialog = new fo1.f.ShowDialog(b0.this.deputyCardDialogMapper.b(new go1.b.Params(showDeputyDialog.getDialog())));
                this.f65667f = vq.j.a(showDeputyDialog);
                this.f65666e = 1;
                if (bVarY1.F(showDialog, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(ShowDeputyDialog showDeputyDialog, fo1.i iVar, tq.e<? super oq.i0> eVar) {
            j jVar = b0.this.new j(eVar);
            jVar.f65667f = showDeputyDialog;
            return jVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfo1/e;", "<unused var>", "Lk10/c0;", "Lfo1/i;", "state", "Lk10/l;", "<anonymous>", "(Lfo1/e;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements er.q<fo1.e, k10.c0<fo1.i>, tq.e<? super k10.l<? extends fo1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f65669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f65670f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f65671g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f65672h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f65673j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f65674k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        /* synthetic */ Object f65675l;

        k(tq.e<? super k> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fo1.i.InitializationError V(b0 b0Var, dx.b bVar, fo1.i iVar) {
            return new fo1.i.InitializationError(b0Var.errorVMSFactory.a(b0Var.E9(new go1.f.a.GetDocument(bVar))));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fo1.i.c.Displaying X(DeputyCardData deputyCardData, Bitmap bitmap, String str, fo1.i iVar) {
            return new fo1.i.c.Displaying(new fo1.i.StateData(deputyCardData, bitmap, str));
        }

        /* JADX WARN: Code duplicated, block: B:28:0x00d9  */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            dx.i iVar;
            final b0 b0Var;
            int i15;
            final DeputyCardData deputyCardData;
            int i16;
            String str;
            Object objB;
            final String str2;
            k10.c0 c0Var = (k10.c0) this.f65675l;
            Object objE = uq.b.e();
            int i17 = this.f65674k;
            if (i17 == 0) {
                oq.u.b(obj);
                co1.a aVar = b0.this.deputyContainersInteractor;
                this.f65675l = c0Var;
                this.f65674k = 1;
                obj = aVar.d(this);
                if (obj != objE) {
                }
                return objE;
            }
            if (i17 == 1) {
                oq.u.b(obj);
            } else {
                if (i17 == 2) {
                    int i18 = this.f65673j;
                    i16 = this.f65672h;
                    DeputyCardData deputyCardData2 = (DeputyCardData) this.f65671g;
                    b0Var = (b0) this.f65670f;
                    iVar = (dx.i) this.f65669e;
                    oq.u.b(obj);
                    i15 = i18;
                    deputyCardData = deputyCardData2;
                    str = (String) ((dx.i) obj).a();
                    b00.c cVar = b0Var.imageConverter;
                    String photo = deputyCardData.getScope().getData().getPhoto();
                    this.f65675l = c0Var;
                    this.f65669e = vq.j.a(iVar);
                    this.f65670f = deputyCardData;
                    this.f65671g = str;
                    this.f65672h = i16;
                    this.f65673j = i15;
                    this.f65674k = 3;
                    objB = cVar.b(photo, this);
                    if (objB != objE) {
                        str2 = str;
                        obj = objB;
                    }
                    return objE;
                }
                if (i17 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                str2 = (String) this.f65671g;
                deputyCardData = (DeputyCardData) this.f65670f;
                oq.u.b(obj);
            }
            final Bitmap bitmap = (Bitmap) ((dx.i) obj).a();
            return c0Var.d(new er.l() { // from class: fo1.h0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.k.X(deputyCardData, bitmap, str2, (i) obj2);
                }
            });
            iVar = (dx.i) obj;
            b0Var = b0.this;
            if (iVar instanceof dx.i.Left) {
                final dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
                return c0Var.d(new er.l() { // from class: fo1.g0
                    @Override // er.l
                    public final Object b(Object obj2) {
                        return b0.k.V(b0Var, bVar, (i) obj2);
                    }
                });
            }
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            DeputyCardData deputyCardData3 = (DeputyCardData) ((dx.i.Right) iVar).b();
            co1.a aVar2 = b0Var.deputyContainersInteractor;
            this.f65675l = c0Var;
            this.f65669e = vq.j.a(iVar);
            this.f65670f = b0Var;
            this.f65671g = deputyCardData3;
            i15 = 0;
            this.f65672h = 0;
            this.f65673j = 0;
            this.f65674k = 2;
            Object objE2 = aVar2.e(this);
            if (objE2 != objE) {
                deputyCardData = deputyCardData3;
                obj = objE2;
                i16 = 0;
                str = (String) ((dx.i) obj).a();
                b00.c cVar2 = b0Var.imageConverter;
                String photo2 = deputyCardData.getScope().getData().getPhoto();
                this.f65675l = c0Var;
                this.f65669e = vq.j.a(iVar);
                this.f65670f = deputyCardData;
                this.f65671g = str;
                this.f65672h = i16;
                this.f65673j = i15;
                this.f65674k = 3;
                objB = cVar2.b(photo2, this);
                if (objB != objE) {
                    str2 = str;
                    obj = objB;
                    final Bitmap bitmap2 = (Bitmap) ((dx.i) obj).a();
                    return c0Var.d(new er.l() { // from class: fo1.h0
                        @Override // er.l
                        public final Object b(Object obj2) {
                            return b0.k.X(deputyCardData, bitmap2, str2, (i) obj2);
                        }
                    });
                }
            }
            return objE;
        }

        @Override // er.q
        /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
        public final Object w(fo1.e eVar, k10.c0<fo1.i> c0Var, tq.e<? super k10.l<? extends fo1.i>> eVar2) {
            k kVar = b0.this.new k(eVar2);
            kVar.f65675l = c0Var;
            return kVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfo1/b;", "<unused var>", "Lfo1/i$b;", "Loq/i0;", "<anonymous>", "(Lfo1/b;Lfo1/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements er.q<fo1.b, fo1.i.InitializationError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65677e;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends oq.i0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f65679e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ b0 f65680f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(b0 b0Var, tq.e<? super a> eVar) {
                super(1, eVar);
                this.f65680f = b0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f65679e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                co1.a aVar = this.f65680f.deputyContainersInteractor;
                this.f65679e = 1;
                Object objB = aVar.b(null, this);
                return objB == objE ? objE : objB;
            }

            public final tq.e<oq.i0> M(tq.e<?> eVar) {
                return new a(this.f65680f, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(tq.e<? super dx.i<? extends dx.b, oq.i0>> eVar) {
                return ((a) M(eVar)).J(oq.i0.f148189a);
            }
        }

        l(tq.e<? super l> eVar) {
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
                int r1 = r10.f65677e
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
                fo1.b0 r11 = fo1.b0.this
                ac4.a r4 = fo1.b0.s9(r11)
                fo1.b0$l$a r6 = new fo1.b0$l$a
                fo1.b0 r11 = fo1.b0.this
                r1 = 0
                r6.<init>(r11, r1)
                r10.f65677e = r3
                r5 = 0
                r8 = 1
                r9 = 0
                r7 = r10
                java.lang.Object r11 = ac4.a.a(r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L3e
                goto L4e
            L3e:
                fo1.b0 r11 = fo1.b0.this
                xw.b r11 = r11.Y1()
                fo1.f$a r1 = fo1.f.a.f65695a
                r7.f65677e = r2
                java.lang.Object r11 = r11.F(r1, r10)
                if (r11 != r0) goto L4f
            L4e:
                return r0
            L4f:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: fo1.b0.l.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fo1.b bVar, fo1.i.InitializationError initializationError, tq.e<? super oq.i0> eVar) {
            return b0.this.new l(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lfo1/a;", "<unused var>", "Lfo1/i$b;", "Loq/i0;", "<anonymous>", "(Lfo1/a;Lfo1/i$b;)V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.q<a, fo1.i.InitializationError, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65681e;

        m(tq.e<? super m> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f65681e;
            if (i15 == 0) {
                oq.u.b(obj);
                xw.b<fo1.f> bVarY1 = b0.this.Y1();
                fo1.f.a aVar = fo1.f.a.f65695a;
                this.f65681e = 1;
                if (bVarY1.F(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, fo1.i.InitializationError initializationError, tq.e<? super oq.i0> eVar) {
            return b0.this.new m(eVar).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfo1/a;", "<unused var>", "Lk10/c0;", "Lfo1/i$c$c;", "state", "Lk10/l;", "Lfo1/i;", "<anonymous>", "(Lfo1/a;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.q<a, k10.c0<fo1.i.c.Error>, tq.e<? super k10.l<? extends fo1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65684f;

        n(tq.e<? super n> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fo1.i.c.Displaying O(fo1.i.c.Error error) {
            return new fo1.i.c.Displaying(error.getStateData());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            k10.c0 c0Var = (k10.c0) this.f65684f;
            uq.b.e();
            if (this.f65683e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fo1.i0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.n.O((i.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(a aVar, k10.c0<fo1.i.c.Error> c0Var, tq.e<? super k10.l<? extends fo1.i>> eVar) {
            n nVar = new n(eVar);
            nVar.f65684f = c0Var;
            return nVar.J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lfo1/c;", "action", "Lk10/c0;", "Lfo1/i$c$c;", "state", "Lk10/l;", "Lfo1/i;", "<anonymous>", "(Lfo1/c;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.q<GoToUpdateProcess, k10.c0<fo1.i.c.Error>, tq.e<? super k10.l<? extends fo1.i>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f65685e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f65686f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f65687g;

        o(tq.e<? super o> eVar) {
            super(3, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final fo1.i.c.DocumentUpdating O(GoToUpdateProcess goToUpdateProcess, fo1.i.c.Error error) {
            return new fo1.i.c.DocumentUpdating(error.getStateData(), goToUpdateProcess.getUpdateMethodType());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final GoToUpdateProcess goToUpdateProcess = (GoToUpdateProcess) this.f65686f;
            k10.c0 c0Var = (k10.c0) this.f65687g;
            uq.b.e();
            if (this.f65685e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return c0Var.d(new er.l() { // from class: fo1.j0
                @Override // er.l
                public final Object b(Object obj2) {
                    return b0.o.O(goToUpdateProcess, (i.c.Error) obj2);
                }
            });
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(GoToUpdateProcess goToUpdateProcess, k10.c0<fo1.i.c.Error> c0Var, tq.e<? super k10.l<? extends fo1.i>> eVar) {
            o oVar = new o(eVar);
            oVar.f65686f = goToUpdateProcess;
            oVar.f65687g = c0Var;
            return oVar.J(oq.i0.f148189a);
        }
    }

    public b0(n20.j jVar, go1.j jVar2, i70.n nVar, go1.f fVar, go1.b bVar, ac4.a aVar, b00.c cVar, mz3.z zVar, mz3.w wVar, t2.a aVar2, co1.a aVar3, hb4.d dVar) {
        this.deputyCardDocumentMapper = jVar2;
        this.snackBarManagerStateHolder = nVar;
        this.errorMapper = fVar;
        this.deputyCardDialogMapper = bVar;
        this.callActionWithLoaderUseCase = aVar;
        this.imageConverter = cVar;
        this.updateDocumentAsyncUC = zVar;
        this.shouldDisplayDownloadLoaderUC = wVar;
        this.deps = aVar2;
        this.deputyContainersInteractor = aVar3;
        this.errorVMSFactory = dVar;
        fo1.i.a aVar4 = fo1.i.a.f65706a;
        this.initialState = aVar4;
        this.navAction = new xw.b<>();
        this.stateMachine = jVar.a(aVar4, new er.l() { // from class: fo1.r
            @Override // er.l
            public final Object b(Object obj) {
                return b0.I9(this.f65732a, (k10.v) obj);
            }
        });
        this.state = a9(new b(e9().getState(), this), fo1.j.a.b.f65717a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final jb4.b E9(final go1.f.a aVar) {
        return this.errorMapper.b(new go1.f.Params(aVar, b9(a.f65597a), b9(fo1.b.f65600a), new er.a() { // from class: fo1.a0
            @Override // er.a
            public final Object a() {
                return b0.F9(aVar, this);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F9(go1.f.a aVar, b0 b0Var) {
        if (aVar instanceof go1.f.a.UpdateDocument) {
            b0Var.d9(new GoToUpdateProcess(((go1.f.a.UpdateDocument) aVar).getUpdateMethodType()));
        } else {
            b0Var.d9(a.f65597a);
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H9() {
        y(new p50.a.DefaultWithIcon(this.deputyCardDocumentMapper.h(), false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I9(final b0 b0Var, k10.v vVar) {
        vVar.c(q0.c(fo1.i.a.class), new er.l() { // from class: fo1.s
            @Override // er.l
            public final Object b(Object obj) {
                return b0.J9(this.f65733a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fo1.i.c.Displaying.class), new er.l() { // from class: fo1.t
            @Override // er.l
            public final Object b(Object obj) {
                return b0.K9(this.f65734a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fo1.i.c.DocumentUpdating.class), new er.l() { // from class: fo1.u
            @Override // er.l
            public final Object b(Object obj) {
                return b0.L9(this.f65735a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fo1.i.class), new er.l() { // from class: fo1.v
            @Override // er.l
            public final Object b(Object obj) {
                return b0.M9(this.f65736a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fo1.i.InitializationError.class), new er.l() { // from class: fo1.w
            @Override // er.l
            public final Object b(Object obj) {
                return b0.N9(this.f65737a, (k10.z) obj);
            }
        });
        vVar.c(q0.c(fo1.i.c.Error.class), new er.l() { // from class: fo1.x
            @Override // er.l
            public final Object b(Object obj) {
                return b0.O9((k10.z) obj);
            }
        });
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J9(b0 b0Var, k10.z zVar) {
        zVar.C(b0Var.new c(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K9(b0 b0Var, k10.z zVar) {
        d dVar = b0Var.new d(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(GoToVerificationProcess.class), oVar, dVar);
        zVar.v(q0.c(GoToUpdateProcess.class), oVar, new e(null));
        zVar.x(q0.c(fo1.b.class), oVar, b0Var.new f(null));
        zVar.x(q0.c(a.class), oVar, b0Var.new g(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L9(b0 b0Var, k10.z zVar) {
        zVar.A(b0Var.new h(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M9(b0 b0Var, k10.z zVar) {
        i iVar = b0Var.new i(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fo1.g.class), oVar, iVar);
        zVar.x(q0.c(ShowDeputyDialog.class), oVar, b0Var.new j(null));
        zVar.v(q0.c(fo1.e.class), oVar, b0Var.new k(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N9(b0 b0Var, k10.z zVar) {
        l lVar = b0Var.new l(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fo1.b.class), oVar, lVar);
        zVar.x(q0.c(a.class), oVar, b0Var.new m(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 O9(k10.z zVar) {
        n nVar = new n(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.v(q0.c(a.class), oVar, nVar);
        zVar.v(q0.c(GoToUpdateProcess.class), oVar, new o(null));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fo1.j.a P9(State<fo1.i> state) {
        return this.deputyCardDocumentMapper.b(new go1.j.Params(state, b9(new GoToVerificationProcess(b9(new GoToUpdateProcess(mz3.z.b.UPDATE)))), new er.l() { // from class: fo1.y
            @Override // er.l
            public final Object b(Object obj) {
                return b0.Q9(this.f65738a, (mz3.z.b) obj);
            }
        }, b9(fo1.g.f65699a), b9(a.f65597a), new er.l() { // from class: fo1.z
            @Override // er.l
            public final Object b(Object obj) {
                return b0.R9(this.f65739a, (n20.a) obj);
            }
        }, new t2(this.deps, u0.a(this))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 Q9(b0 b0Var, mz3.z.b bVar) {
        b0Var.d9(new GoToUpdateProcess(bVar));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R9(b0 b0Var, n20.a aVar) {
        b0Var.d9(aVar);
        return oq.i0.f148189a;
    }

    @Override // i70.n
    public void B0() {
        this.snackBarManagerStateHolder.B0();
    }

    @Override // zx.b
    /* JADX INFO: renamed from: D9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ Object F(fo1.f fVar, tq.e<? super oq.i0> eVar) {
        return super.F(fVar, eVar);
    }

    @Override // zx.b
    /* JADX INFO: renamed from: G9, reason: merged with bridge method [inline-methods] */
    public /* bridge */ void P5(fo1.j.a aVar) {
        super.P5(aVar);
    }

    @Override // zx.b
    public xw.b<fo1.f> Y1() {
        return this.navAction;
    }

    @Override // fo1.j
    public void d() {
        d9(a.f65597a);
    }

    @Override // l00.g
    protected k10.t<State<fo1.i>, n20.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fo1.j.a> getState() {
        return this.state;
    }

    @Override // i70.n
    public mu.g<i70.p> j() {
        return this.snackBarManagerStateHolder.j();
    }

    @Override // i70.n
    public void y(p50.a snackBarData) {
        this.snackBarManagerStateHolder.y(snackBarData);
    }
}
