package fx3;

import android.graphics.Bitmap;
import er.q;
import fr.q0;
import java.util.concurrent.CancellationException;
import ju.g2;
import k10.c0;
import k10.t;
import k10.v;
import k10.z;
import mu.p0;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import wx.FileContent;

/* JADX INFO: loaded from: classes10.dex */
@Metadata(d1 = {"\u0000¾\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u0005B[\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0001\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u001c\u0010\u001f\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001cH\u0082@¢\u0006\u0004\b\u001f\u0010 J\u001c\u0010\"\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\u001d\u001a\u00020!H\u0082@¢\u0006\u0004\b\"\u0010#J,\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00020'2\u0006\u0010\u001d\u001a\u00020$2\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00020%H\u0082@¢\u0006\u0004\b(\u0010)J \u0010.\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020-0+*\u00020*H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00101\u001a\u0002002\u0006\u0010&\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u0014\u0010J\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR&\u0010P\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030K8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR \u0010&\u001a\b\u0012\u0004\u0012\u0002000Q8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bR\u0010S\u001a\u0004\bT\u0010UR \u0010\\\u001a\b\u0012\u0004\u0012\u00020W0V8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[¨\u0006]"}, d2 = {"Lfx3/m;", "Ll00/g;", "Lfx3/b;", "Lfx3/a;", "Lfx3/c;", "Ldx3/c;", "Lyy/a;", "stateMachineFactory", "Lfx3/d;", "mapper", "Lb00/c;", "imageConverter", "Lmx/c;", "labelProvider", "Li70/e;", "snackBarManager", "Lac4/a;", "loaderUseCase", "Lbc4/g;", "getImageFromUriUseCase", "Ld14/a;", "getFileContentUseCase", "Lqx/a;", "imagePropertiesProvider", "Ldx3/a;", "data", "<init>", "(Lyy/a;Lfx3/d;Lb00/c;Lmx/c;Li70/e;Lac4/a;Lbc4/g;Ld14/a;Lqx/a;Ldx3/a;)V", "Lfx3/a$a;", "action", "Loq/i0;", "v9", "(Lfx3/m;Lfx3/a$a;Ltq/e;)Ljava/lang/Object;", "Lfx3/a$b;", "w9", "(Lfx3/m;Lfx3/a$b;Ltq/e;)Ljava/lang/Object;", "Lfx3/a$d;", "Lk10/c0;", "state", "Lk10/l;", "A9", "(Lfx3/a$d;Lk10/c0;Ltq/e;)Ljava/lang/Object;", "Lwx/c;", "Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "E9", "(Lwx/c;Ltq/e;)Ljava/lang/Object;", "Lfx3/c$a;", "x9", "(Lfx3/b;)Lfx3/c$a;", "z9", "(Ldx3/a;)V", "b", "Lfx3/d;", "c", "Lb00/c;", "d", "Lmx/c;", "e", "Li70/e;", "f", "Lac4/a;", "g", "Lbc4/g;", "h", "Ld14/a;", "j", "Lqx/a;", "k", "Ldx3/a;", "Lfx3/b$a;", "l", "Lfx3/b$a;", "initialState", "Lk10/t;", "m", "Lk10/t;", "e9", "()Lk10/t;", "stateMachine", "Lmu/p0;", "n", "Lmu/p0;", "getState", "()Lmu/p0;", "Lxw/b;", "Ldx3/c$a;", "p", "Lxw/b;", "Y1", "()Lxw/b;", "navAction", "imagepreview_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class m extends l00.g<fx3.b, fx3.a> implements fx3.c, dx3.c {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final fx3.d mapper;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final b00.c imageConverter;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final mx.c labelProvider;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i70.e snackBarManager;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final ac4.a loaderUseCase;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final bc4.g getImageFromUriUseCase;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final d14.a getFileContentUseCase;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final qx.a imagePropertiesProvider;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final dx3.a data;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final fx3.b.a initialState;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t<fx3.b, fx3.a> stateMachine;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0<fx3.c.a> state;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final xw.b<dx3.c.a> navAction;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f68728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f68729f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f68730g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f68731h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f68732j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ fx3.a.LoadStored f68734l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(fx3.a.LoadStored loadStored, tq.e<? super a> eVar) {
            super(1, eVar);
            this.f68734l = loadStored;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        
            if (r1.F(r4, r12) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f68732j
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L27
                if (r1 == r3) goto L23
                if (r1 != r2) goto L1b
                java.lang.Object r0 = r12.f68729f
                dx.b r0 = (dx.b) r0
                java.lang.Object r0 = r12.f68728e
                dx.i r0 = (dx.i) r0
                oq.u.b(r13)
                goto Lbc
            L1b:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L23:
                oq.u.b(r13)
                goto L48
            L27:
                oq.u.b(r13)
                fx3.m r13 = fx3.m.this
                d14.a r13 = fx3.m.l9(r13)
                d14.a$a r1 = new d14.a$a
                fx3.a$a r4 = r12.f68734l
                dx3.a$b r4 = r4.getData()
                wx.k$a r4 = r4.getImage()
                r1.<init>(r4)
                r12.f68732j = r3
                java.lang.Object r13 = r13.c(r1, r12)
                if (r13 != r0) goto L48
                goto L96
            L48:
                dx.i r13 = (dx.i) r13
                fx3.m r1 = fx3.m.this
                fx3.a$a r3 = r12.f68734l
                boolean r4 = r13 instanceof dx.i.Left
                if (r4 == 0) goto L97
                r3 = r13
                dx.i$b r3 = (dx.i.Left) r3
                java.lang.Object r3 = r3.b()
                dx.b r3 = (dx.b) r3
                i70.e r4 = fx3.m.q9(r1)
                p50.a$b r5 = new p50.a$b
                mx.c r6 = fx3.m.p9(r1)
                int r7 = cx3.a.f38401a
                mx.a r6 = r6.c(r7)
                r10 = 14
                r11 = 0
                r7 = 0
                r8 = 0
                r9 = 0
                r5.<init>(r6, r7, r8, r9, r10, r11)
                r4.y(r5)
                xw.b r1 = r1.Y1()
                dx3.c$a$a r4 = dx3.c.a.C1047a.f45490a
                java.lang.Object r13 = vq.j.a(r13)
                r12.f68728e = r13
                java.lang.Object r13 = vq.j.a(r3)
                r12.f68729f = r13
                r13 = 0
                r12.f68730g = r13
                r12.f68731h = r13
                r12.f68732j = r2
                java.lang.Object r13 = r1.F(r4, r12)
                if (r13 != r0) goto Lbc
            L96:
                return r0
            L97:
                boolean r0 = r13 instanceof dx.i.Right
                if (r0 == 0) goto Lbf
                dx.i$c r13 = (dx.i.Right) r13
                java.lang.Object r13 = r13.b()
                d14.a$b r13 = (d14.a.Result) r13
                fx3.a$c r0 = new fx3.a$c
                dx3.a$a r2 = new dx3.a$a
                dx3.a$b r3 = r3.getData()
                mx.a r3 = r3.getTitleLabel()
                wx.c r13 = r13.getFileContent()
                r2.<init>(r3, r13)
                r0.<init>(r2)
                fx3.m.k9(r1, r0)
            Lbc:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            Lbf:
                oq.p r13 = new oq.p
                r13.<init>()
                throw r13
            */
            throw new UnsupportedOperationException("Method not decompiled: fx3.m.a.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return m.this.new a(this.f68734l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((a) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f68735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f68736f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f68737g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f68738h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f68739j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ fx3.a.LoadUri f68741l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(fx3.a.LoadUri loadUri, tq.e<? super b> eVar) {
            super(1, eVar);
            this.f68741l = loadUri;
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0094, code lost:
        
            if (r1.F(r4, r12) == r0) goto L17;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 201
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: fx3.m.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return m.this.new b(this.f68741l, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((b) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68742e;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f68742e;
            if (i15 == 0) {
                u.b(obj);
                xw.b<dx3.c.a> bVarY1 = m.this.Y1();
                dx3.c.a.C1047a c1047a = dx3.c.a.C1047a.f45490a;
                this.f68742e = 1;
                if (bVarY1.F(c1047a, this) == objE) {
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

        public final tq.e<i0> M(tq.e<?> eVar) {
            return m.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((c) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class d extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f68744d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f68745e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f68746f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f68747g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f68748h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f68749j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f68750k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f68751l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f68752m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        /* synthetic */ Object f68753n;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f68755q;

        d(tq.e<? super d> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f68753n = obj;
            this.f68755q |= PKIFailureInfo.systemUnavail;
            return m.this.A9(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lmu/g;", "Lmu/h;", "collector", "Loq/i0;", "a", "(Lmu/h;Ltq/e;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class e implements mu.g<fx3.c.a> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ mu.g f68756a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ m f68757b;

        @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
        public static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ mu.h f68758a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ m f68759b;

            /* JADX INFO: renamed from: fx3.m$e$a$a, reason: collision with other inner class name */
            @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
            public static final class C1541a extends vq.d {

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                /* synthetic */ Object f68760d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f68761e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                Object f68762f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                Object f68764h;

                /* JADX INFO: renamed from: j, reason: collision with root package name */
                Object f68765j;

                /* JADX INFO: renamed from: k, reason: collision with root package name */
                Object f68766k;

                /* JADX INFO: renamed from: l, reason: collision with root package name */
                int f68767l;

                public C1541a(tq.e eVar) {
                    super(eVar);
                }

                @Override // vq.a
                public final Object J(Object obj) {
                    this.f68760d = obj;
                    this.f68761e |= PKIFailureInfo.systemUnavail;
                    return a.this.F(null, this);
                }
            }

            public a(mu.h hVar, m mVar) {
                this.f68758a = hVar;
                this.f68759b = mVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // mu.h
            public final Object F(Object obj, tq.e eVar) throws Throwable {
                C1541a c1541a;
                if (eVar instanceof C1541a) {
                    c1541a = (C1541a) eVar;
                    int i15 = c1541a.f68761e;
                    if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                        c1541a.f68761e = i15 - PKIFailureInfo.systemUnavail;
                    } else {
                        c1541a = new C1541a(eVar);
                    }
                } else {
                    c1541a = new C1541a(eVar);
                }
                Object obj2 = c1541a.f68760d;
                Object objE = uq.b.e();
                int i16 = c1541a.f68761e;
                if (i16 == 0) {
                    u.b(obj2);
                    mu.h hVar = this.f68758a;
                    fx3.c.a aVarX9 = this.f68759b.x9((fx3.b) obj);
                    c1541a.f68762f = vq.j.a(obj);
                    c1541a.f68764h = vq.j.a(c1541a);
                    c1541a.f68765j = vq.j.a(obj);
                    c1541a.f68766k = vq.j.a(hVar);
                    c1541a.f68767l = 0;
                    c1541a.f68761e = 1;
                    if (hVar.F(aVarX9, c1541a) == objE) {
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

        public e(mu.g gVar, m mVar) {
            this.f68756a = gVar;
            this.f68757b = mVar;
        }

        @Override // mu.g
        public Object a(mu.h<? super fx3.c.a> hVar, tq.e eVar) {
            Object objA = this.f68756a.a(new a(hVar, this.f68757b), eVar);
            return objA == uq.b.e() ? objA : i0.f148189a;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx3/a$c;", "action", "Lfx3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx3/a$c;Lfx3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements q<fx3.a.NewImagePreview, fx3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68768e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68769f;

        f(tq.e<? super f> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx3.a.NewImagePreview newImagePreview = (fx3.a.NewImagePreview) this.f68769f;
            uq.b.e();
            if (this.f68768e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            dx3.a data = newImagePreview.getData();
            if (data instanceof dx3.a.Content) {
                m.this.d9(new fx3.a.ShowContent((dx3.a.Content) newImagePreview.getData()));
            } else if (data instanceof dx3.a.Uri) {
                m.this.d9(new fx3.a.LoadUri((dx3.a.Uri) newImagePreview.getData()));
            } else {
                if (!(data instanceof dx3.a.Stored)) {
                    throw new oq.p();
                }
                m.this.d9(new fx3.a.LoadStored((dx3.a.Stored) newImagePreview.getData()));
            }
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fx3.a.NewImagePreview newImagePreview, fx3.b bVar, tq.e<? super i0> eVar) {
            f fVar = m.this.new f(eVar);
            fVar.f68769f = newImagePreview;
            return fVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx3/a$b;", "action", "Lfx3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx3/a$b;Lfx3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements q<fx3.a.LoadUri, fx3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68771e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68772f;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx3.a.LoadUri loadUri = (fx3.a.LoadUri) this.f68772f;
            Object objE = uq.b.e();
            int i15 = this.f68771e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f68772f = vq.j.a(loadUri);
                this.f68771e = 1;
                if (mVar.w9(mVar, loadUri, this) == objE) {
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
        public final Object w(fx3.a.LoadUri loadUri, fx3.b bVar, tq.e<? super i0> eVar) {
            g gVar = m.this.new g(eVar);
            gVar.f68772f = loadUri;
            return gVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lfx3/a$a;", "action", "Lfx3/b;", "<unused var>", "Loq/i0;", "<anonymous>", "(Lfx3/a$a;Lfx3/b;)V"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements q<fx3.a.LoadStored, fx3.b, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68775f;

        h(tq.e<? super h> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx3.a.LoadStored loadStored = (fx3.a.LoadStored) this.f68775f;
            Object objE = uq.b.e();
            int i15 = this.f68774e;
            if (i15 == 0) {
                u.b(obj);
                m mVar = m.this;
                this.f68775f = vq.j.a(loadStored);
                this.f68774e = 1;
                if (mVar.v9(mVar, loadStored, this) == objE) {
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
        public final Object w(fx3.a.LoadStored loadStored, fx3.b bVar, tq.e<? super i0> eVar) {
            h hVar = m.this.new h(eVar);
            hVar.f68775f = loadStored;
            return hVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u00052\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lfx3/a$d;", "action", "Lk10/c0;", "Lfx3/b;", "state", "Lk10/l;", "<anonymous>", "(Lfx3/a$d;Lk10/c0;)Lk10/l;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements q<fx3.a.ShowContent, c0<fx3.b>, tq.e<? super k10.l<? extends fx3.b>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f68777e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f68778f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f68779g;

        i(tq.e<? super i> eVar) {
            super(3, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            fx3.a.ShowContent showContent = (fx3.a.ShowContent) this.f68778f;
            c0 c0Var = (c0) this.f68779g;
            Object objE = uq.b.e();
            int i15 = this.f68777e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            m mVar = m.this;
            this.f68778f = vq.j.a(showContent);
            this.f68779g = vq.j.a(c0Var);
            this.f68777e = 1;
            Object objA9 = mVar.A9(showContent, c0Var, this);
            return objA9 == objE ? objE : objA9;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(fx3.a.ShowContent showContent, c0<fx3.b> c0Var, tq.e<? super k10.l<? extends fx3.b>> eVar) {
            i iVar = m.this.new i(eVar);
            iVar.f68778f = showContent;
            iVar.f68779g = c0Var;
            return iVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ldx/i;", "Ldx/b;", "Landroid/graphics/Bitmap;", "<anonymous>", "()Ldx/i;"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super dx.i<? extends dx.b, ? extends Bitmap>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f68781e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f68782f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f68783g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f68784h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f68785j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f68786k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f68787l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f68788m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f68789n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f68790p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        int f68791q;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ FileContent f68793s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(FileContent fileContent, tq.e<? super j> eVar) {
            super(1, eVar);
            this.f68793s = fileContent;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v0, types: [int] */
        /* JADX WARN: Type inference failed for: r1v1, types: [dx.j, java.lang.Object] */
        /* JADX WARN: Type inference failed for: r1v3 */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            int i15;
            int i16;
            m mVar;
            int i17;
            dx.j<dx.b> jVarA;
            ex.b bVar;
            ex.b bVar2;
            ex.b aVar;
            int i18;
            int i19;
            ex.b bVar3;
            Object objE = uq.b.e();
            ?? r15 = this.f68791q;
            try {
                try {
                    if (r15 == 0) {
                        u.b(obj);
                        mVar = m.this;
                        FileContent fileContent = this.f68793s;
                        jVarA = xw.c.f221622a.a();
                        aVar = new ex.a();
                        b00.c cVar = mVar.imageConverter;
                        byte[] bytes = fileContent.getBytes();
                        this.f68781e = mVar;
                        this.f68782f = jVarA;
                        this.f68783g = vq.j.a(aVar);
                        this.f68784h = aVar;
                        this.f68785j = aVar;
                        i17 = 0;
                        this.f68786k = 0;
                        this.f68787l = 0;
                        this.f68788m = 0;
                        this.f68789n = 0;
                        this.f68790p = 0;
                        this.f68791q = 1;
                        obj = cVar.h(bytes, this);
                        if (obj != objE) {
                            i15 = 0;
                            i16 = 0;
                            i19 = 0;
                            i18 = 0;
                            bVar2 = aVar;
                            bVar = bVar2;
                        }
                        return objE;
                    }
                    try {
                        if (r15 == 1) {
                            int i25 = this.f68790p;
                            i15 = this.f68789n;
                            i16 = this.f68788m;
                            int i26 = this.f68787l;
                            int i27 = this.f68786k;
                            ex.b bVar4 = (ex.b) this.f68785j;
                            ex.b bVar5 = (ex.b) this.f68784h;
                            ex.b bVar6 = (ex.b) this.f68783g;
                            dx.j<dx.b> jVar = (dx.j) this.f68782f;
                            mVar = (m) this.f68781e;
                            try {
                                u.b(obj);
                                i17 = i25;
                                jVarA = jVar;
                                bVar = bVar6;
                                bVar2 = bVar4;
                                aVar = bVar5;
                                i18 = i27;
                                i19 = i26;
                            } catch (ex.c e15) {
                                e = e15;
                                return new dx.i.Left((dx.b) ex.d.a(e));
                            } catch (CancellationException e16) {
                                throw e16;
                            } catch (Exception e17) {
                                e = e17;
                                r15 = jVar;
                                px.f fVar = px.f.f163100a;
                                String message = e.getMessage();
                                if (message == null) {
                                    message = "";
                                }
                                fVar.d(message, e, px.c.a(r15));
                                dx.i iVarA = r15.a(e);
                                if (iVarA instanceof dx.i.Left) {
                                    objB = new dx.b.Generic((Exception) ((dx.i.Left) iVarA).b());
                                } else {
                                    if (!(iVarA instanceof dx.i.Right)) {
                                        throw new oq.p();
                                    }
                                    objB = ((dx.i.Right) iVarA).b();
                                }
                                return new dx.i.Left(objB);
                            }
                        } else {
                            if (r15 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            bVar3 = (ex.b) this.f68784h;
                            u.b(obj);
                        }
                        return new dx.i.Right((Bitmap) bVar3.a((dx.i) obj));
                    } catch (CancellationException e18) {
                        throw e18;
                    }
                    Bitmap bitmap = (Bitmap) bVar2.a((dx.i) obj);
                    g2.j(getContext());
                    b00.c cVar2 = mVar.imageConverter;
                    b00.f.ReduceDimension reduceDimension = new b00.f.ReduceDimension(mVar.imagePropertiesProvider.getDefaultImageMaxSide());
                    this.f68781e = jVarA;
                    this.f68782f = vq.j.a(bVar);
                    this.f68783g = vq.j.a(aVar);
                    this.f68784h = aVar;
                    this.f68785j = vq.j.a(bitmap);
                    this.f68786k = i18;
                    this.f68787l = i19;
                    this.f68788m = i16;
                    this.f68789n = i15;
                    this.f68790p = i17;
                    this.f68791q = 2;
                    obj = cVar2.f(bitmap, reduceDimension, this);
                    if (obj != objE) {
                        bVar3 = aVar;
                        return new dx.i.Right((Bitmap) bVar3.a((dx.i) obj));
                    }
                    return objE;
                } catch (Exception e19) {
                    e = e19;
                }
            } catch (ex.c e25) {
                e = e25;
            } catch (CancellationException e26) {
                throw e26;
            }
        }

        public final tq.e<i0> M(tq.e<?> eVar) {
            return m.this.new j(this.f68793s, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    public m(yy.a aVar, fx3.d dVar, b00.c cVar, mx.c cVar2, i70.e eVar, ac4.a aVar2, bc4.g gVar, d14.a aVar3, qx.a aVar4, dx3.a aVar5) {
        this.mapper = dVar;
        this.imageConverter = cVar;
        this.labelProvider = cVar2;
        this.snackBarManager = eVar;
        this.loaderUseCase = aVar2;
        this.getImageFromUriUseCase = gVar;
        this.getFileContentUseCase = aVar3;
        this.imagePropertiesProvider = aVar4;
        this.data = aVar5;
        fx3.b.a aVar6 = fx3.b.a.f68697a;
        this.initialState = aVar6;
        this.stateMachine = aVar.a(aVar6, new er.l() { // from class: fx3.l
            @Override // er.l
            public final Object b(Object obj) {
                return m.C9(this.f68714a, (v) obj);
            }
        });
        this.state = a9(new e(e9().getState(), this), x9(aVar6));
        this.navAction = new xw.b<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object A9(fx3.a.ShowContent showContent, c0<fx3.b> c0Var, tq.e<? super k10.l<? extends fx3.b>> eVar) throws Throwable {
        d dVar;
        final fx3.a.ShowContent showContent2;
        c0<fx3.b> c0Var2;
        if (eVar instanceof d) {
            dVar = (d) eVar;
            int i15 = dVar.f68755q;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                dVar.f68755q = i15 - PKIFailureInfo.systemUnavail;
            } else {
                dVar = new d(eVar);
            }
        } else {
            dVar = new d(eVar);
        }
        Object objE9 = dVar.f68753n;
        Object objE = uq.b.e();
        int i16 = dVar.f68755q;
        if (i16 == 0) {
            u.b(objE9);
            FileContent fileContent = showContent.getData().getFileContent();
            showContent2 = showContent;
            dVar.f68744d = showContent2;
            c0Var2 = c0Var;
            dVar.f68745e = c0Var2;
            dVar.f68755q = 1;
            objE9 = E9(fileContent, dVar);
            if (objE9 != objE) {
            }
        }
        if (i16 != 1) {
            if (i16 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            k10.l lVar = (k10.l) dVar.f68748h;
            u.b(objE9);
            return lVar;
        }
        c0<fx3.b> c0Var3 = (c0) dVar.f68745e;
        fx3.a.ShowContent showContent3 = (fx3.a.ShowContent) dVar.f68744d;
        u.b(objE9);
        c0Var2 = c0Var3;
        showContent2 = showContent3;
        dx.i iVar = (dx.i) objE9;
        if (!(iVar instanceof dx.i.Left)) {
            if (!(iVar instanceof dx.i.Right)) {
                throw new oq.p();
            }
            final Bitmap bitmap = (Bitmap) ((dx.i.Right) iVar).b();
            return c0Var2.d(new er.l() { // from class: fx3.k
                @Override // er.l
                public final Object b(Object obj) {
                    return m.B9(showContent2, bitmap, (b) obj);
                }
            });
        }
        dx.b bVar = (dx.b) ((dx.i.Left) iVar).b();
        Object objC = c0Var2.c();
        this.snackBarManager.y(new p50.a.DefaultWithIcon(this.labelProvider.c(cx3.a.f38401a), false, null, null, 14, null));
        xw.b<dx3.c.a> bVarY1 = Y1();
        dx3.c.a aVar = dx3.c.a.C1047a.f45490a;
        dVar.f68744d = vq.j.a(showContent2);
        dVar.f68745e = vq.j.a(c0Var2);
        dVar.f68746f = vq.j.a(iVar);
        dVar.f68747g = vq.j.a(bVar);
        dVar.f68748h = objC;
        dVar.f68749j = vq.j.a(objC);
        dVar.f68750k = 0;
        dVar.f68751l = 0;
        dVar.f68752m = 0;
        dVar.f68755q = 2;
        return bVarY1.F(aVar, dVar) == objE ? objE : objC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final fx3.b.Initialized B9(fx3.a.ShowContent showContent, Bitmap bitmap, fx3.b bVar) {
        return new fx3.b.Initialized(showContent.getData().getTitleLabel(), bitmap);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 C9(final m mVar, v vVar) {
        vVar.c(q0.c(fx3.b.class), new er.l() { // from class: fx3.i
            @Override // er.l
            public final Object b(Object obj) {
                return m.D9(this.f68710a, (z) obj);
            }
        });
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 D9(m mVar, z zVar) {
        f fVar = mVar.new f(null);
        k10.o oVar = k10.o.CANCEL_PREVIOUS;
        zVar.x(q0.c(fx3.a.NewImagePreview.class), oVar, fVar);
        zVar.x(q0.c(fx3.a.LoadUri.class), oVar, mVar.new g(null));
        zVar.x(q0.c(fx3.a.LoadStored.class), oVar, mVar.new h(null));
        zVar.v(q0.c(fx3.a.ShowContent.class), oVar, mVar.new i(null));
        return i0.f148189a;
    }

    private final Object E9(FileContent fileContent, tq.e<? super dx.i<? extends dx.b, Bitmap>> eVar) {
        return ac4.a.a(this.loaderUseCase, null, new j(fileContent, null), eVar, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object v9(m mVar, fx3.a.LoadStored loadStored, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(mVar.loaderUseCase, null, mVar.new a(loadStored, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object w9(m mVar, fx3.a.LoadUri loadUri, tq.e<? super i0> eVar) {
        Object objA = ac4.a.a(mVar.loaderUseCase, null, mVar.new b(loadUri, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final fx3.c.a x9(fx3.b state) {
        return this.mapper.b(new fx3.d.Params(state, new er.a() { // from class: fx3.j
            @Override // er.a
            public final Object a() {
                return m.y9(this.f68711a);
            }
        }));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 y9(m mVar) {
        i00.a.a(mVar, mVar.new c(null));
        return i0.f148189a;
    }

    @Override // zx.b
    public xw.b<dx3.c.a> Y1() {
        return this.navAction;
    }

    @Override // l00.g
    protected t<fx3.b, fx3.a> e9() {
        return this.stateMachine;
    }

    @Override // l00.e
    public p0<fx3.c.a> getState() {
        return this.state;
    }

    @Override // zx.b
    /* JADX INFO: renamed from: z9, reason: merged with bridge method [inline-methods] */
    public void P5(dx3.a data) {
        d9(new fx3.a.NewImagePreview(data));
    }
}
