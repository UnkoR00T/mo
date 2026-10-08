package wd3;

import ae3.j;
import aw0.f;
import dx.i;
import er.l;
import er.p;
import fr.t;
import ju.d2;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import mu.a0;
import mu.g;
import mu.h0;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import sv0.ProcessId;
import sv0.c0;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\r\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\fJ)\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u000e2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0017R(\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f0\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0018\u0010\u001e\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\"\u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0018\u0010%\u001a\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010$¨\u0006&"}, d2 = {"Lwd3/d;", "Lwd3/c;", "Law0/f;", "getSubscribeStatementDataUC", "Lae3/j;", "longPollUC", "<init>", "(Law0/f;Lae3/j;)V", "Lsv0/y;", "processId", "Loq/i0;", "g", "(Lsv0/y;)V", "a", "Lmu/g;", "Ldx/i;", "Ldx/b;", "Lsv0/c0;", "b", "(Lsv0/y;)Lmu/g;", "f", "()V", "Law0/f;", "Lae3/j;", "Lmu/a0;", "c", "Lmu/a0;", "flow", "d", "Lsv0/y;", "lastProcessId", "Lju/p0;", "e", "Lju/p0;", "scope", "Lju/d2;", "Lju/d2;", "job", "vehiclecollision_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final f getSubscribeStatementDataUC;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final j longPollUC;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ProcessId lastProcessId;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private d2 job;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private a0<i<dx.b, c0>> flow = h0.b(1, 0, null, 6, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0 scope = q0.a(g1.b().n0(z2.b(null, 1, null)));

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ldx/i;", "Ldx/b;", "Lsv0/c0;", "it", "Loq/i0;", "<anonymous>", "(Ldx/i;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<i<? extends dx.b, ? extends c0>, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f212525e;

        a(e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f212525e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            d.this.f();
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i<? extends dx.b, ? extends c0> iVar, e<? super i0> eVar) {
            return ((a) v(iVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return d.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f212527e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f212528f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f212529g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f212530h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f212531j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ ProcessId f212533l;

        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Lsv0/c0;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
        static final class a extends k implements l<e<? super i<? extends dx.b, ? extends c0>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f212534e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ d f212535f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ ProcessId f212536g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(d dVar, ProcessId processId, e<? super a> eVar) {
                super(1, eVar);
                this.f212535f = dVar;
                this.f212536g = processId;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f212534e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                    return obj;
                }
                u.b(obj);
                f fVar = this.f212535f.getSubscribeStatementDataUC;
                f.Params params = new f.Params(this.f212536g);
                this.f212534e = 1;
                Object objC = fVar.c(params, this);
                return objC == objE ? objE : objC;
            }

            public final e<i0> M(e<?> eVar) {
                return new a(this.f212535f, this.f212536g, eVar);
            }

            @Override // er.l
            /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
            public final Object b(e<? super i<? extends dx.b, ? extends c0>> eVar) {
                return ((a) M(eVar)).J(i0.f148189a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(ProcessId processId, e<? super b> eVar) {
            super(2, eVar);
            this.f212533l = processId;
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0089  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
        
            if (r10.F(r4, r9) == r0) goto L24;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r10) throws java.lang.Throwable {
            /*
                r9 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r9.f212531j
                r2 = 3
                r3 = 2
                r4 = 1
                r5 = 0
                if (r1 == 0) goto L37
                if (r1 == r4) goto L33
                if (r1 == r3) goto L27
                if (r1 != r2) goto L1f
                java.lang.Object r0 = r9.f212528f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r9.f212527e
                dx.i r0 = (dx.i) r0
                oq.u.b(r10)
                goto Lb0
            L1f:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L27:
                java.lang.Object r1 = r9.f212528f
                sv0.c0 r1 = (sv0.c0) r1
                java.lang.Object r1 = r9.f212527e
                dx.i r1 = (dx.i) r1
                oq.u.b(r10)
                goto L83
            L33:
                oq.u.b(r10)
                goto L53
            L37:
                oq.u.b(r10)
                wd3.d r10 = wd3.d.this
                ae3.j r10 = wd3.d.e(r10)
                wd3.d$b$a r1 = new wd3.d$b$a
                wd3.d r6 = wd3.d.this
                sv0.y r7 = r9.f212533l
                r8 = 0
                r1.<init>(r6, r7, r8)
                r9.f212531j = r4
                java.lang.Object r10 = r10.a(r1, r9)
                if (r10 != r0) goto L53
                goto Laf
            L53:
                r1 = r10
                dx.i r1 = (dx.i) r1
                wd3.d r10 = wd3.d.this
                boolean r4 = r1 instanceof dx.i.Right
                if (r4 == 0) goto L83
                r4 = r1
                dx.i$c r4 = (dx.i.Right) r4
                java.lang.Object r4 = r4.b()
                sv0.c0 r4 = (sv0.c0) r4
                mu.a0 r10 = wd3.d.c(r10)
                dx.i$c r6 = new dx.i$c
                r6.<init>(r4)
                r9.f212527e = r1
                java.lang.Object r4 = vq.j.a(r4)
                r9.f212528f = r4
                r9.f212529g = r5
                r9.f212530h = r5
                r9.f212531j = r3
                java.lang.Object r10 = r10.F(r6, r9)
                if (r10 != r0) goto L83
                goto Laf
            L83:
                wd3.d r10 = wd3.d.this
                boolean r3 = r1 instanceof dx.i.Left
                if (r3 == 0) goto Lb0
                r3 = r1
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                mu.a0 r10 = wd3.d.c(r10)
                dx.i$b r4 = new dx.i$b
                r4.<init>(r3)
                r9.f212527e = r1
                java.lang.Object r1 = vq.j.a(r3)
                r9.f212528f = r1
                r9.f212529g = r5
                r9.f212530h = r5
                r9.f212531j = r2
                java.lang.Object r10 = r10.F(r4, r9)
                if (r10 != r0) goto Lb0
            Laf:
                return r0
            Lb0:
                oq.i0 r10 = oq.i0.f148189a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: wd3.d.b.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return d.this.new b(this.f212533l, eVar);
        }
    }

    public d(f fVar, j jVar) {
        this.getSubscribeStatementDataUC = fVar;
        this.longPollUC = jVar;
    }

    private final void g(ProcessId processId) {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.job = ju.k.d(this.scope, null, null, new b(processId, null), 3, null);
    }

    @Override // wd3.c
    public void a(ProcessId processId) {
        if (t.c(this.lastProcessId, processId)) {
            return;
        }
        g(processId);
        this.flow = h0.b(1, 0, null, 6, null);
        this.lastProcessId = processId;
    }

    @Override // wd3.c
    public g<i<dx.b, c0>> b(ProcessId processId) {
        a(processId);
        return mu.i.S(this.flow, new a(null));
    }

    public void f() {
        d2 d2Var = this.job;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        this.lastProcessId = null;
    }
}
