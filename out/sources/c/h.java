package c;

import androidx.camera.camera2.compat.quirk.TorchIsClosedAfterImageCapturingQuirk;
import e.u2;
import e.x1;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.w0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import v.n1;
import v.p1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0007\u0018\u0000 92\u00020\u0001:\u0001%B/\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ%\u0010\u0013\u001a\u00020\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016JT\u0010 \u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u001e0\r2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b \u0010!J(\u0010#\u001a\u00020\"2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001aH\u0096@¢\u0006\u0004\b#\u0010$R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010(R\u001b\u0010,\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010\u0016R#\u00101\u001a\n -*\u0004\u0018\u00010\u00050\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010*\u001a\u0004\b/\u00100R*\u00108\u001a\u00020\u001a2\u0006\u00102\u001a\u00020\u001a8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b3\u00104\u001a\u0004\b5\u00106\"\u0004\b)\u00107¨\u0006:"}, d2 = {"Lc/h;", "Le/c0;", "Le/b0;", "cameraProperties", "Lnq/a;", "Le/h0;", "capturePipelineImplProvider", "Le/u2;", "threads", "Le/x1;", "torchControl", "<init>", "(Le/b0;Lnq/a;Le/u2;Le/x1;)V", "", "Lv/n1;", "captureConfigs", "Lh/k1;", "requestTemplate", "", "j", "(Ljava/util/List;I)Z", "m", "()Z", "configs", "Lv/p1;", "sessionConfigOptions", "", "captureMode", "flashType", "flashMode", "Lju/w0;", "Ljava/lang/Void;", "c", "(Ljava/util/List;ILv/p1;IIILtq/e;)Ljava/lang/Object;", "Lu/m;", "b", "(IIILtq/e;)Ljava/lang/Object;", "a", "Lnq/a;", "Le/u2;", "Le/x1;", "d", "Loq/k;", "k", "isLegacyDevice", "kotlin.jvm.PlatformType", "e", "i", "()Le/h0;", "capturePipelineImpl", "value", "f", "I", "getTemplate", "()I", "(I)V", "template", "g", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class h implements e.c0 {

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final boolean f22230h;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<e.h0> capturePipelineImplProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final x1 torchControl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final oq.k isLegacyDevice;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final oq.k capturePipelineImpl = oq.l.a(new er.a() { // from class: c.g
        @Override // er.a
        public final Object a() {
            return h.h(this.f22227a);
        }
    });

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int template = 1;

    /* JADX INFO: renamed from: c.h$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lc/h$a;", "", "<init>", "()V", "", "isEnabled", "Z", "a", "()Z", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final boolean a() {
            return h.f22230h;
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f22237d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f22238e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22240g;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f22238e = obj;
            this.f22240g |= PKIFailureInfo.systemUnavail;
            return h.this.c(null, 0, null, 0, 0, 0, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22241e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ List<w0<Void>> f22242f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h f22243g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends w0<Void>> list, h hVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f22242f = list;
            this.f22243g = hVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0079, code lost:
        
            if (r12.T0(r11) == r0) goto L23;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r12) throws java.lang.Throwable {
            /*
                r11 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r11.f22241e
                java.lang.String r2 = "CXCP"
                r3 = 3
                r4 = 2
                r5 = 1
                if (r1 == 0) goto L27
                if (r1 == r5) goto L23
                if (r1 == r4) goto L1f
                if (r1 != r3) goto L17
                oq.u.b(r12)
                goto L7c
            L17:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L1f:
                oq.u.b(r12)
                goto L5f
            L23:
                oq.u.b(r12)
                goto L37
            L27:
                oq.u.b(r12)
                java.util.List<ju.w0<java.lang.Void>> r12 = r11.f22242f
                java.util.Collection r12 = (java.util.Collection) r12
                r11.f22241e = r5
                java.lang.Object r12 = ju.f.c(r12, r11)
                if (r12 != r0) goto L37
                goto L7b
            L37:
                e.c r12 = e.c.f45719a
                boolean r12 = o.e1.f(r2)
                if (r12 == 0) goto L42
                e.c.a()
            L42:
                c.h r12 = r11.f22243g
                e.x1 r5 = c.h.f(r12)
                e.x1$a$a r12 = e.x1.a.INSTANCE
                int r6 = r12.a()
                r9 = 6
                r10 = 0
                r7 = 0
                r8 = 0
                ju.w0 r12 = e.x1.n(r5, r6, r7, r8, r9, r10)
                r11.f22241e = r4
                java.lang.Object r12 = r12.T0(r11)
                if (r12 != r0) goto L5f
                goto L7b
            L5f:
                c.h r12 = r11.f22243g
                e.x1 r4 = c.h.f(r12)
                e.x1$a$a r12 = e.x1.a.INSTANCE
                int r5 = r12.c()
                r8 = 6
                r9 = 0
                r6 = 0
                r7 = 0
                ju.w0 r12 = e.x1.n(r4, r5, r6, r7, r8, r9)
                r11.f22241e = r3
                java.lang.Object r12 = r12.T0(r11)
                if (r12 != r0) goto L7c
            L7b:
                return r0
            L7c:
                e.c r12 = e.c.f45719a
                boolean r12 = o.e1.f(r2)
                if (r12 == 0) goto L87
                e.c.a()
            L87:
                oq.i0 r12 = oq.i0.f148189a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: c.h.c.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f22242f, this.f22243g, eVar);
        }
    }

    static {
        f22230h = b.g.f15546a.c(TorchIsClosedAfterImageCapturingQuirk.class) != null;
    }

    public h(final e.b0 b0Var, nq.a<e.h0> aVar, u2 u2Var, x1 x1Var) {
        this.capturePipelineImplProvider = aVar;
        this.threads = u2Var;
        this.torchControl = x1Var;
        this.isLegacyDevice = oq.l.a(new er.a() { // from class: c.f
            @Override // er.a
            public final Object a() {
                return Boolean.valueOf(h.l(b0Var));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e.h0 h(h hVar) {
        return hVar.capturePipelineImplProvider.get();
    }

    private final e.h0 i() {
        return (e.h0) this.capturePipelineImpl.getValue();
    }

    private final boolean j(List<n1> captureConfigs, int requestTemplate) {
        List<n1> list = captureConfigs;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            if (PRN.r.INSTANCE.a((n1) it.next(), requestTemplate, k()) == 2) {
                return m();
            }
        }
        return false;
    }

    private final boolean k() {
        return ((Boolean) this.isLegacyDevice.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean l(e.b0 b0Var) {
        return h.x.INSTANCE.l(b0Var.getMetadata());
    }

    private final boolean m() {
        Integer numF = this.torchControl.g().f();
        return numF != null && numF.intValue() == 1;
    }

    @Override // e.c0
    public Object b(int i15, int i16, int i17, tq.e<? super u.m> eVar) {
        return i().b(i15, i16, i17, eVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    @Override // e.c0
    public Object c(List<n1> list, int i15, p1 p1Var, int i16, int i17, int i18, tq.e<? super List<? extends w0<Void>>> eVar) throws Throwable {
        b bVar;
        boolean z15;
        if (eVar instanceof b) {
            bVar = (b) eVar;
            int i19 = bVar.f22240g;
            if ((i19 & PKIFailureInfo.systemUnavail) != 0) {
                bVar.f22240g = i19 - PKIFailureInfo.systemUnavail;
            } else {
                bVar = new b(eVar);
            }
        } else {
            bVar = new b(eVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f22238e;
        Object objE = uq.b.e();
        int i25 = bVar2.f22240g;
        if (i25 == 0) {
            oq.u.b(obj);
            boolean zJ = j(list, i15);
            e.h0 h0VarI = i();
            bVar2.f22237d = zJ;
            bVar2.f22240g = 1;
            Object objC = h0VarI.c(list, i15, p1Var, i16, i17, i18, bVar2);
            if (objC == objE) {
                return objE;
            }
            z15 = zJ;
            obj = objC;
        } else {
            if (i25 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = bVar2.f22237d;
            oq.u.b(obj);
        }
        List list2 = (List) obj;
        if (z15) {
            ju.k.d(this.threads.getSequentialScope(), null, null, new c(list2, this, null), 3, null);
        }
        return list2;
    }

    @Override // e.c0
    public void d(int i15) {
        i().d(i15);
        this.template = i15;
    }
}
