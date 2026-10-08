package sz;

import androidx.p016lifecycle.DefaultLifecycleObserver;
import ju.g1;
import ju.p0;
import ju.q0;
import ju.z2;
import mu.b0;
import mu.r0;
import o.l2;
import o.s;
import oq.i0;
import oq.t;
import oq.u;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J'\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00028\u00000\u001a0\u000e\"\u0004\b\u0000\u0010\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010!\u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b!\u0010\"J\u0018\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020#H\u0096@¢\u0006\u0004\b&\u0010'J\u0018\u0010*\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(H\u0082@¢\u0006\u0004\b*\u0010+J\u0018\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020,H\u0082@¢\u0006\u0004\b.\u0010/J \u00102\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b2\u00103J \u00105\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u000204H\u0082@¢\u0006\u0004\b5\u00106J \u00108\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\u0006\u00101\u001a\u000207H\u0082@¢\u0006\u0004\b8\u00109J\u001c\u0010;\u001a\u00020\u0014*\u00020\u00002\u0006\u0010)\u001a\u00020:H\u0082@¢\u0006\u0004\b;\u0010<J \u0010>\u001a\u00020\u00142\u0006\u0010)\u001a\u00020=2\u0006\u00101\u001a\u000204H\u0082@¢\u0006\u0004\b>\u0010?J \u0010@\u001a\u00020\u00142\u0006\u0010)\u001a\u00020=2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\b@\u0010AJ \u0010B\u001a\u00020\u00142\u0006\u0010)\u001a\u00020=2\u0006\u00101\u001a\u000207H\u0082@¢\u0006\u0004\bB\u0010CJ\u0018\u0010D\u001a\u00020\u00142\u0006\u00101\u001a\u000204H\u0082@¢\u0006\u0004\bD\u0010EJ\u0018\u0010F\u001a\u00020\u00142\u0006\u00101\u001a\u000207H\u0082@¢\u0006\u0004\bF\u0010GJ\u0018\u0010H\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\bH\u0010IJ\u0018\u0010J\u001a\u00020\u00142\u0006\u00101\u001a\u000207H\u0082@¢\u0006\u0004\bJ\u0010GJ\u0018\u0010K\u001a\u00020\u00142\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\bK\u0010IJ \u0010M\u001a\u00020\u00142\u0006\u0010)\u001a\u00020L2\u0006\u00101\u001a\u000204H\u0082@¢\u0006\u0004\bM\u0010NJ \u0010O\u001a\u00020\u00142\u0006\u0010)\u001a\u00020L2\u0006\u00101\u001a\u000200H\u0082@¢\u0006\u0004\bO\u0010PJ<\u0010X\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020W0\u001a2\u0006\u0010\u001e\u001a\u00020\u00122\u0006\u0010R\u001a\u00020Q2\u0006\u0010T\u001a\u00020S2\u0006\u0010V\u001a\u00020UH\u0082@¢\u0006\u0004\bX\u0010YJ\u001b\u0010[\u001a\u00020\u0014*\u00020Z2\u0006\u0010V\u001a\u00020UH\u0002¢\u0006\u0004\b[\u0010\\J\u0014\u0010]\u001a\u00020\u0014*\u00020(H\u0082@¢\u0006\u0004\b]\u0010+J-\u0010a\u001a\u00020\u00142\u001c\u0010)\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140_\u0012\u0006\u0012\u0004\u0018\u00010`0^H\u0002¢\u0006\u0004\ba\u0010bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010eR\u0014\u0010h\u001a\u00020f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010gR\u0014\u0010l\u001a\u00020i8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0016\u00101\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u001a\u0010r\u001a\b\u0012\u0004\u0012\u00020\u000f0o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010q¨\u0006s"}, d2 = {"Lsz/b;", "Lrx/a;", "Lsz/d;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lvz/b;", "cameraUseCaseFactory", "Lpx/d;", "remoteLogger", "Luz/b;", "cameraProviderFuture", "<init>", "(Lvz/b;Lpx/d;Luz/b;)V", "Lsx/b;", "mode", "Lmu/g;", "Lsx/c;", "d", "(Lsx/b;)Lmu/g;", "Landroidx/lifecycle/q;", "owner", "Loq/i0;", "onStart", "(Landroidx/lifecycle/q;)V", "onStop", "onDestroy", "T", "Ldx/i;", "Ldx/b;", "c", "()Lmu/g;", "lifecycleOwner", "Landroidx/camera/view/m;", "previewView", "a", "(Landroidx/lifecycle/q;Landroidx/camera/view/m;)V", "", "absolutePath", "Lsx/f;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "Lsz/a;", "action", "K", "(Lsz/a;Ltq/e;)Ljava/lang/Object;", "Lsz/c;", "newState", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lsz/c;Ltq/e;)Ljava/lang/Object;", "Lsz/c$a;", "state", "v", "(Lsz/a;Lsz/c$a;Ltq/e;)Ljava/lang/Object;", "Lsz/c$b;", "w", "(Lsz/a;Lsz/c$b;Ltq/e;)Ljava/lang/Object;", "Lsz/c$c;", "y", "(Lsz/a;Lsz/c$c;Ltq/e;)Ljava/lang/Object;", "Lsz/a$a;", "s", "(Lsz/b;Lsz/a$a;Ltq/e;)Ljava/lang/Object;", "Lsz/a$c$b;", "B", "(Lsz/a$c$b;Lsz/c$b;Ltq/e;)Ljava/lang/Object;", "A", "(Lsz/a$c$b;Lsz/c$a;Ltq/e;)Ljava/lang/Object;", "C", "(Lsz/a$c$b;Lsz/c$c;Ltq/e;)Ljava/lang/Object;", "G", "(Lsz/c$b;Ltq/e;)Ljava/lang/Object;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Lsz/c$c;Ltq/e;)Ljava/lang/Object;", "J", "(Lsz/c$a;Ltq/e;)Ljava/lang/Object;", "I", "F", "Lsz/a$c$a;", "E", "(Lsz/a$c$a;Lsz/c$b;Ltq/e;)Ljava/lang/Object;", ip.a.f96138c, "(Lsz/a$c$a;Lsz/c$a;Ltq/e;)Ljava/lang/Object;", "Lo/s;", "cameraSelector", "Lvz/a;", "modeUseCase", "", "zoom", "Luz/a;", "t", "(Landroidx/lifecycle/q;Lo/s;Lvz/a;FLtq/e;)Ljava/lang/Object;", "Lo/i;", "M", "(Lo/i;F)V", "u", "Lkotlin/Function1;", "Ltq/e;", "", "z", "(Ler/l;)V", "Lvz/b;", "Lpx/d;", "Luz/b;", "Lju/p0;", "Lju/p0;", "scope", "Lsu/a;", "e", "Lsu/a;", "mutex", "f", "Lsz/c;", "Lmu/b0;", "g", "Lmu/b0;", "cameraStateFlow", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class b implements rx.a, sz.d, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final vz.b cameraUseCaseFactory;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final px.d remoteLogger;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final uz.b cameraProviderFuture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final su.a mutex;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private sz.c state;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b0<sx.c> cameraStateFlow;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186019e;

        /* JADX INFO: renamed from: sz.b$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lsx/c;", "it", "Loq/i0;", "<anonymous>", "(Lsx/c;)V"}, k = 3, mv = {2, 2, 0})
        static final class C4808a extends vq.k implements er.p<sx.c, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f186021e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f186022f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ b f186023g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C4808a(b bVar, tq.e<? super C4808a> eVar) {
                super(2, eVar);
                this.f186023g = bVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                sx.c cVar = (sx.c) this.f186022f;
                uq.b.e();
                if (this.f186021e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                px.f.f163100a.b("cameraStateFlow: " + cVar, px.c.a(this.f186023g));
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(sx.c cVar, tq.e<? super i0> eVar) {
                return ((C4808a) v(cVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C4808a c4808a = new C4808a(this.f186023g, eVar);
                c4808a.f186022f = obj;
                return c4808a;
            }
        }

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186019e;
            if (i15 == 0) {
                u.b(obj);
                mu.g gVarS = mu.i.S(b.this.cameraStateFlow, new C4808a(b.this, null));
                this.f186019e = 1;
                if (mu.i.i(gVarS, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new a(eVar);
        }
    }

    /* JADX INFO: renamed from: sz.b$b, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class C4809b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186024d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186025e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f186026f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f186027g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f186028h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f186029j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f186030k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        int f186031l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        /* synthetic */ Object f186032m;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        int f186034p;

        C4809b(tq.e<? super C4809b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186032m = obj;
            this.f186034p |= PKIFailureInfo.systemUnavail;
            return b.this.s(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class c implements Runnable {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ ju.n<dx.i<? extends dx.b, uz.a>> f186036b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f186037c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s f186038d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ vz.a f186039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f186040f;

        /* JADX WARN: Multi-variable type inference failed */
        c(ju.n<? super dx.i<? extends dx.b, uz.a>> nVar, androidx.p016lifecycle.q qVar, s sVar, vz.a aVar, float f15) {
            this.f186036b = nVar;
            this.f186037c = qVar;
            this.f186038d = sVar;
            this.f186039e = aVar;
            this.f186040f = f15;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                uz.a aVarB = b.this.cameraProviderFuture.b();
                androidx.p016lifecycle.q qVar = this.f186037c;
                s sVar = this.f186038d;
                vz.a aVar = this.f186039e;
                ju.n<dx.i<? extends dx.b, uz.a>> nVar = this.f186036b;
                b bVar = b.this;
                float f15 = this.f186040f;
                aVarB.b();
                bVar.M(aVarB.a(qVar, sVar, aVar), f15);
                t.Companion companion = t.INSTANCE;
                nVar.i(t.b(new dx.i.Right(aVarB)));
            } catch (Exception e15) {
                ju.n<dx.i<? extends dx.b, uz.a>> nVar2 = this.f186036b;
                t.Companion companion2 = t.INSTANCE;
                nVar2.i(t.b(new dx.i.Left(new dx.b.Generic(e15))));
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186041e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f186043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ androidx.camera.view.m f186044h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.p016lifecycle.q qVar, androidx.camera.view.m mVar, tq.e<? super d> eVar) {
            super(1, eVar);
            this.f186043g = qVar;
            this.f186044h = mVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186041e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                sz.a.c.AttachPreview attachPreview = new sz.a.c.AttachPreview(this.f186043g, this.f186044h);
                this.f186041e = 1;
                if (bVar.u(attachPreview, this) == objE) {
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
            return b.this.new d(this.f186043g, this.f186044h, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((d) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186045e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f186046f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f186047g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f186048h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f186049j;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ er.l<tq.e<? super i0>, Object> f186051l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(er.l<? super tq.e<? super i0>, ? extends Object> lVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f186051l = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            su.a aVar;
            er.l<tq.e<? super i0>, Object> lVar;
            int i15;
            su.a aVar2;
            Throwable th4;
            Object objE = uq.b.e();
            int i16 = this.f186049j;
            try {
                if (i16 == 0) {
                    u.b(obj);
                    aVar = b.this.mutex;
                    er.l<tq.e<? super i0>, Object> lVar2 = this.f186051l;
                    this.f186045e = aVar;
                    this.f186046f = lVar2;
                    this.f186047g = 0;
                    this.f186049j = 1;
                    if (aVar.h(null, this) != objE) {
                        lVar = lVar2;
                        i15 = 0;
                    }
                    return objE;
                }
                if (i16 != 1) {
                    if (i16 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar2 = (su.a) this.f186045e;
                    try {
                        u.b(obj);
                        i0 i0Var = i0.f148189a;
                        aVar2.r(null);
                        return i0.f148189a;
                    } catch (Throwable th5) {
                        th4 = th5;
                        aVar2.r(null);
                        throw th4;
                    }
                }
                i15 = this.f186047g;
                lVar = (er.l) this.f186046f;
                su.a aVar3 = (su.a) this.f186045e;
                u.b(obj);
                aVar = aVar3;
                this.f186045e = aVar;
                this.f186046f = null;
                this.f186047g = i15;
                this.f186048h = 0;
                this.f186049j = 2;
                if (lVar.b(this) != objE) {
                    aVar2 = aVar;
                    i0 i0Var2 = i0.f148189a;
                    aVar2.r(null);
                    return i0.f148189a;
                }
                return objE;
            } catch (Throwable th6) {
                aVar2 = aVar;
                th4 = th6;
                aVar2.r(null);
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new e(this.f186051l, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186052d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186053e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f186054f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f186056h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186054f = obj;
            this.f186056h |= PKIFailureInfo.systemUnavail;
            return b.this.A(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186057d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186058e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f186059f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f186060g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f186062j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186060g = obj;
            this.f186062j |= PKIFailureInfo.systemUnavail;
            return b.this.B(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class h extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f186065f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f186067h;

        h(tq.e<? super h> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186065f = obj;
            this.f186067h |= PKIFailureInfo.systemUnavail;
            return b.this.D(null, null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class i extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186068d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f186069e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f186070f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f186071g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f186072h;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f186074k;

        i(tq.e<? super i> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186072h = obj;
            this.f186074k |= PKIFailureInfo.systemUnavail;
            return b.this.E(null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class j extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186075e;

        j(tq.e<? super j> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186075e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                sz.a.b bVar2 = sz.a.b.f186006a;
                this.f186075e = 1;
                if (bVar.u(bVar2, this) == objE) {
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
            return b.this.new j(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((j) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class k extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186077d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f186078e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f186080g;

        k(tq.e<? super k> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186078e = obj;
            this.f186080g |= PKIFailureInfo.systemUnavail;
            return b.this.G(null, this);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class l extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186081d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f186082e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f186084g;

        l(tq.e<? super l> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186082e = obj;
            this.f186084g |= PKIFailureInfo.systemUnavail;
            return b.this.H(null, this);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186085e;

        m(tq.e<? super m> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186085e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                sz.a.d dVar = sz.a.d.f186010a;
                this.f186085e = 1;
                if (bVar.u(dVar, this) == objE) {
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
            return b.this.new m(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((m) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class n extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186087e;

        n(tq.e<? super n> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186087e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                sz.a.e eVar = sz.a.e.f186011a;
                this.f186087e = 1;
                if (bVar.u(eVar, this) == objE) {
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
            return b.this.new n(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((n) M(eVar)).J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
    static final class o extends vq.k implements er.l<tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186089e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ sx.b f186091g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        o(sx.b bVar, tq.e<? super o> eVar) {
            super(1, eVar);
            this.f186091g = bVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f186089e;
            if (i15 == 0) {
                u.b(obj);
                b bVar = b.this;
                sz.a.c.AttachMode attachMode = new sz.a.c.AttachMode(this.f186091g);
                this.f186089e = 1;
                if (bVar.u(attachMode, this) == objE) {
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
            return b.this.new o(this.f186091g, eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super i0> eVar) {
            return ((o) M(eVar)).J(i0.f148189a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmu/h;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class p<T> extends vq.k implements er.p<mu.h<? super dx.i<? extends dx.b, ? extends T>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186092e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f186093f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ sz.c.Initialized f186094g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        p(sz.c.Initialized initialized, tq.e<? super p> eVar) {
            super(2, eVar);
            this.f186094g = initialized;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mu.h hVar = (mu.h) this.f186093f;
            Object objE = uq.b.e();
            int i15 = this.f186092e;
            if (i15 == 0) {
                u.b(obj);
                dx.i.Left left = new dx.i.Left(new dx.b.Generic(new IllegalArgumentException("Wrong use case: " + this.f186094g.getCameraUseCase() + " and wrong mode:" + this.f186094g.getCameraUseCase().getCameraMode() + ". Use CameraMode.Analyzer")));
                this.f186093f = vq.j.a(hVar);
                this.f186092e = 1;
                if (hVar.F(left, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super dx.i<? extends dx.b, ? extends T>> hVar, tq.e<? super i0> eVar) {
            return ((p) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            p pVar = new p(this.f186094g, eVar);
            pVar.f186093f = obj;
            return pVar;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u00000\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lmu/h;", "Ldx/i;", "Ldx/b;", "Loq/i0;", "<anonymous>", "(Lmu/h;)V"}, k = 3, mv = {2, 2, 0})
    static final class q<T> extends vq.k implements er.p<mu.h<? super dx.i<? extends dx.b, ? extends T>>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186095e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f186096f;

        q(tq.e<? super q> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            mu.h hVar = (mu.h) this.f186096f;
            Object objE = uq.b.e();
            int i15 = this.f186095e;
            if (i15 == 0) {
                u.b(obj);
                dx.i.Left left = new dx.i.Left(new dx.b.Generic(new IllegalStateException("Wrong state: " + b.this.state)));
                this.f186096f = vq.j.a(hVar);
                this.f186095e = 1;
                if (hVar.F(left, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(mu.h<? super dx.i<? extends dx.b, ? extends T>> hVar, tq.e<? super i0> eVar) {
            return ((q) v(hVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            q qVar = b.this.new q(eVar);
            qVar.f186096f = obj;
            return qVar;
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    static final class r extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f186098d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f186099e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f186101g;

        r(tq.e<? super r> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f186099e = obj;
            this.f186101g |= PKIFailureInfo.systemUnavail;
            return b.this.b(null, this);
        }
    }

    public b(vz.b bVar, px.d dVar, uz.b bVar2) {
        this.cameraUseCaseFactory = bVar;
        this.remoteLogger = dVar;
        this.cameraProviderFuture = bVar2;
        p0 p0VarA = q0.a(g1.c().n0(z2.b(null, 1, null)));
        this.scope = p0VarA;
        this.mutex = su.g.b(false, 1, null);
        this.state = new sz.c.Initializing(null, null, null, 7, null);
        ju.k.d(p0VarA, null, null, new a(null), 3, null);
        this.cameraStateFlow = r0.a(sx.c.b.f185168a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00d7, code lost:
    
        if (u(r5, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object A(sz.a.c.AttachPreview r12, sz.c.Initialized r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 221
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.A(sz.a$c$b, sz.c$a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00c7, code lost:
    
        if (u(r2, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object B(sz.a.c.AttachPreview r12, sz.c.Initializing r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 208
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.B(sz.a$c$b, sz.c$b, tq.e):java.lang.Object");
    }

    private final Object C(sz.a.c.AttachPreview attachPreview, sz.c.Stopped stopped, tq.e<? super i0> eVar) throws Throwable {
        px.f.f163100a.b("Attaching camera,\nstate: " + stopped + ",\naction: " + attachPreview, px.c.a(this));
        stopped.getCameraUseCase().a();
        stopped.getProcessCameraProvider().b();
        stopped.getLifecycleOwner().getLifecycleRegistry().d(this);
        attachPreview.getLifecycleOwner().getLifecycleRegistry().a(this);
        Object objU = u(new sz.a.Bind(stopped.getCameraUseCase().getCameraMode(), attachPreview.getLifecycleOwner(), attachPreview.getPreviewView()), eVar);
        return objU == uq.b.e() ? objU : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ed, code lost:
    
        if (u(r10, r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object D(sz.a.c.AttachMode r8, sz.c.Initialized r9, tq.e<? super oq.i0> r10) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 243
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.D(sz.a$c$a, sz.c$a, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00f8, code lost:
    
        if (u(r14, r0) == r1) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object E(sz.a.c.AttachMode r12, sz.c.Initializing r13, tq.e<? super oq.i0> r14) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 257
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.E(sz.a$c$a, sz.c$b, tq.e):java.lang.Object");
    }

    private final Object F(sz.c.Initialized initialized, tq.e<? super i0> eVar) {
        px.f.f163100a.b("Detaching camera,\nstate: " + initialized, px.c.a(this));
        initialized.getCameraUseCase().a();
        initialized.getProcessCameraProvider().b();
        initialized.getLifecycleOwner().getLifecycleRegistry().d(this);
        Object objL = L(new sz.c.Initializing(null, null, null), eVar);
        return objL == uq.b.e() ? objL : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x008c, code lost:
    
        if (L(r8, r0) == r1) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object G(sz.c.Initializing r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            r6 = this;
            boolean r0 = r8 instanceof sz.b.k
            if (r0 == 0) goto L13
            r0 = r8
            sz.b$k r0 = (sz.b.k) r0
            int r1 = r0.f186080g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186080g = r1
            goto L18
        L13:
            sz.b$k r0 = new sz.b$k
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f186078e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f186080g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r7 = r0.f186077d
            sz.c$b r7 = (sz.c.Initializing) r7
            oq.u.b(r8)
            goto L8f
        L30:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L38:
            java.lang.Object r7 = r0.f186077d
            sz.c$b r7 = (sz.c.Initializing) r7
            oq.u.b(r8)
            goto L7b
        L40:
            oq.u.b(r8)
            px.f r8 = px.f.f163100a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Detaching camera,\nstate: "
            r2.append(r5)
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            java.util.List r5 = px.c.a(r6)
            r8.b(r2, r5)
            androidx.lifecycle.q r8 = r7.getLifecycleOwner()
            if (r8 == 0) goto L6c
            androidx.lifecycle.j r8 = r8.getLifecycleRegistry()
            if (r8 == 0) goto L6c
            r8.d(r6)
        L6c:
            mu.b0<sx.c> r8 = r6.cameraStateFlow
            sx.c$b r2 = sx.c.b.f185168a
            r0.f186077d = r7
            r0.f186080g = r4
            java.lang.Object r8 = r8.F(r2, r0)
            if (r8 != r1) goto L7b
            goto L8e
        L7b:
            r8 = 0
            sz.c$b r8 = r7.a(r8, r8, r8)
            java.lang.Object r7 = vq.j.a(r7)
            r0.f186077d = r7
            r0.f186080g = r3
            java.lang.Object r7 = r6.L(r8, r0)
            if (r7 != r1) goto L8f
        L8e:
            return r1
        L8f:
            oq.i0 r7 = oq.i0.f148189a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.G(sz.c$b, tq.e):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0090, code lost:
    
        if (L(r4, r0) == r1) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object H(sz.c.Stopped r11, tq.e<? super oq.i0> r12) throws java.lang.Throwable {
        /*
            r10 = this;
            boolean r0 = r12 instanceof sz.b.l
            if (r0 == 0) goto L13
            r0 = r12
            sz.b$l r0 = (sz.b.l) r0
            int r1 = r0.f186084g
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f186084g = r1
            goto L18
        L13:
            sz.b$l r0 = new sz.b$l
            r0.<init>(r12)
        L18:
            java.lang.Object r12 = r0.f186082e
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f186084g
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L40
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r11 = r0.f186081d
            sz.c$c r11 = (sz.c.Stopped) r11
            oq.u.b(r12)
            goto L93
        L30:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L38:
            java.lang.Object r11 = r0.f186081d
            sz.c$c r11 = (sz.c.Stopped) r11
            oq.u.b(r12)
            goto L77
        L40:
            oq.u.b(r12)
            px.f r12 = px.f.f163100a
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Detaching camera,\nstate: "
            r2.append(r5)
            r2.append(r11)
            java.lang.String r2 = r2.toString()
            java.util.List r5 = px.c.a(r10)
            r12.b(r2, r5)
            androidx.lifecycle.q r12 = r11.getLifecycleOwner()
            androidx.lifecycle.j r12 = r12.getLifecycleRegistry()
            r12.d(r10)
            mu.b0<sx.c> r12 = r10.cameraStateFlow
            sx.c$b r2 = sx.c.b.f185168a
            r0.f186081d = r11
            r0.f186084g = r4
            java.lang.Object r12 = r12.F(r2, r0)
            if (r12 != r1) goto L77
            goto L92
        L77:
            sz.c$b r4 = new sz.c$b
            sx.b r5 = r11.getMode()
            r8 = 6
            r9 = 0
            r6 = 0
            r7 = 0
            r4.<init>(r5, r6, r7, r8, r9)
            java.lang.Object r11 = vq.j.a(r11)
            r0.f186081d = r11
            r0.f186084g = r3
            java.lang.Object r11 = r10.L(r4, r0)
            if (r11 != r1) goto L93
        L92:
            return r1
        L93:
            oq.i0 r11 = oq.i0.f148189a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.H(sz.c$c, tq.e):java.lang.Object");
    }

    private final Object I(sz.c.Stopped stopped, tq.e<? super i0> eVar) {
        px.f.f163100a.b("Start camera,\nstate: " + stopped, px.c.a(this));
        Object objU = u(new sz.a.Bind(stopped.getCameraUseCase().getCameraMode(), stopped.getLifecycleOwner(), stopped.getPreviewView()), eVar);
        return objU == uq.b.e() ? objU : i0.f148189a;
    }

    private final Object J(sz.c.Initialized initialized, tq.e<? super i0> eVar) {
        px.f.f163100a.b("Stopping camera,\nstate: " + initialized, px.c.a(this));
        initialized.getCameraUseCase().a();
        initialized.getProcessCameraProvider().b();
        Object objL = L(new sz.c.Stopped(initialized.getLifecycleOwner(), initialized.getCameraUseCase(), initialized.getPreviewView(), initialized.getProcessCameraProvider(), initialized.getMode()), eVar);
        return objL == uq.b.e() ? objL : i0.f148189a;
    }

    private final Object K(sz.a aVar, tq.e<? super i0> eVar) throws Throwable {
        sz.c cVar = this.state;
        px.f.f163100a.b("sendAction\n CameraManagerAction: " + aVar + ",\nstate: " + cVar + "\n end", px.c.a(this));
        if (cVar instanceof sz.c.Initialized) {
            Object objV = v(aVar, (sz.c.Initialized) cVar, eVar);
            return objV == uq.b.e() ? objV : i0.f148189a;
        }
        if (cVar instanceof sz.c.Initializing) {
            Object objW = w(aVar, (sz.c.Initializing) cVar, eVar);
            return objW == uq.b.e() ? objW : i0.f148189a;
        }
        if (!(cVar instanceof sz.c.Stopped)) {
            throw new oq.p();
        }
        Object objY = y(aVar, (sz.c.Stopped) cVar, eVar);
        return objY == uq.b.e() ? objY : i0.f148189a;
    }

    private final Object L(sz.c cVar, tq.e<? super i0> eVar) {
        sz.c cVar2 = this.state;
        this.state = cVar;
        px.f.f163100a.b("[STATE CHANGED]: " + cVar, px.c.a(this));
        if (fr.t.c(cVar2.getClass(), cVar.getClass())) {
            return i0.f148189a;
        }
        if (cVar instanceof sz.c.Initialized) {
            Object objF = this.cameraStateFlow.F(sx.c.a.f185167a, eVar);
            return objF == uq.b.e() ? objF : i0.f148189a;
        }
        if (cVar instanceof sz.c.Initializing) {
            Object objF2 = this.cameraStateFlow.F(sx.c.b.f185168a, eVar);
            return objF2 == uq.b.e() ? objF2 : i0.f148189a;
        }
        if (!(cVar instanceof sz.c.Stopped)) {
            throw new oq.p();
        }
        Object objF3 = this.cameraStateFlow.F(sx.c.e.f185171a, eVar);
        return objF3 == uq.b.e() ? objF3 : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M(o.i iVar, float f15) {
        l2 l2VarF = iVar.c().D().f();
        if (l2VarF != null) {
            iVar.a().f(lr.m.m(f15, l2VarF.getMinZoomRatio(), l2VarF.getMaxZoomRatio()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:43:0x018c  */
    /* JADX WARN: Code duplicated, block: B:45:0x0190  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x012e, code lost:
    
        if (r6.u(r7, r9) == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0189, code lost:
    
        if (r7.F(r8, r9) == r2) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x01dd, code lost:
    
        if (r6.L(r13, r9) == r2) goto L47;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object s(sz.b r23, sz.a.Bind r24, tq.e<? super oq.i0> r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 489
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: sz.b.s(sz.b, sz.a$a, tq.e):java.lang.Object");
    }

    private final Object t(androidx.p016lifecycle.q qVar, s sVar, vz.a aVar, float f15, tq.e<? super dx.i<? extends dx.b, uz.a>> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        px.f.f163100a.b("Binding Camera", px.c.a(this));
        this.cameraProviderFuture.a(new c(pVar, qVar, sVar, aVar, f15));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object u(sz.a aVar, tq.e<? super i0> eVar) throws Throwable {
        Object objK = K(aVar, eVar);
        return objK == uq.b.e() ? objK : i0.f148189a;
    }

    private final Object v(sz.a aVar, sz.c.Initialized initialized, tq.e<? super i0> eVar) throws Throwable {
        if (!(aVar instanceof sz.a.Bind)) {
            if (fr.t.c(aVar, sz.a.b.f186006a)) {
                Object objF = F(initialized, eVar);
                return objF == uq.b.e() ? objF : i0.f148189a;
            }
            if (aVar instanceof sz.a.c.AttachMode) {
                Object objD = D((sz.a.c.AttachMode) aVar, initialized, eVar);
                return objD == uq.b.e() ? objD : i0.f148189a;
            }
            if (aVar instanceof sz.a.c.AttachPreview) {
                Object objA = A((sz.a.c.AttachPreview) aVar, initialized, eVar);
                return objA == uq.b.e() ? objA : i0.f148189a;
            }
            if (!fr.t.c(aVar, sz.a.d.f186010a)) {
                if (!fr.t.c(aVar, sz.a.e.f186011a)) {
                    throw new oq.p();
                }
                Object objJ = J(initialized, eVar);
                return objJ == uq.b.e() ? objJ : i0.f148189a;
            }
        }
        return i0.f148189a;
    }

    private final Object w(sz.a aVar, sz.c.Initializing initializing, tq.e<? super i0> eVar) throws Throwable {
        if (aVar instanceof sz.a.Bind) {
            Object objS = s(this, (sz.a.Bind) aVar, eVar);
            return objS == uq.b.e() ? objS : i0.f148189a;
        }
        if (fr.t.c(aVar, sz.a.b.f186006a)) {
            Object objG = G(initializing, eVar);
            return objG == uq.b.e() ? objG : i0.f148189a;
        }
        if (aVar instanceof sz.a.c.AttachMode) {
            Object objE = E((sz.a.c.AttachMode) aVar, initializing, eVar);
            return objE == uq.b.e() ? objE : i0.f148189a;
        }
        if (aVar instanceof sz.a.c.AttachPreview) {
            Object objB = B((sz.a.c.AttachPreview) aVar, initializing, eVar);
            return objB == uq.b.e() ? objB : i0.f148189a;
        }
        if (fr.t.c(aVar, sz.a.d.f186010a) || fr.t.c(aVar, sz.a.e.f186011a)) {
            return i0.f148189a;
        }
        throw new oq.p();
    }

    private final Object y(sz.a aVar, sz.c.Stopped stopped, tq.e<? super i0> eVar) throws Throwable {
        if (aVar instanceof sz.a.Bind) {
            Object objS = s(this, (sz.a.Bind) aVar, eVar);
            return objS == uq.b.e() ? objS : i0.f148189a;
        }
        if (fr.t.c(aVar, sz.a.b.f186006a)) {
            Object objH = H(stopped, eVar);
            return objH == uq.b.e() ? objH : i0.f148189a;
        }
        if (!(aVar instanceof sz.a.c.AttachMode)) {
            if (aVar instanceof sz.a.c.AttachPreview) {
                Object objC = C((sz.a.c.AttachPreview) aVar, stopped, eVar);
                return objC == uq.b.e() ? objC : i0.f148189a;
            }
            if (fr.t.c(aVar, sz.a.d.f186010a)) {
                Object objI = I(stopped, eVar);
                return objI == uq.b.e() ? objI : i0.f148189a;
            }
            if (!fr.t.c(aVar, sz.a.e.f186011a)) {
                throw new oq.p();
            }
        }
        return i0.f148189a;
    }

    private final void z(er.l<? super tq.e<? super i0>, ? extends Object> action) {
        ju.k.d(this.scope, null, null, new e(action, null), 3, null);
    }

    @Override // sz.d
    public void a(androidx.p016lifecycle.q lifecycleOwner, androidx.camera.view.m previewView) {
        z(new d(lifecycleOwner, previewView, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // rx.a
    public Object b(String str, tq.e<? super sx.f> eVar) throws Throwable {
        r rVar;
        vz.a cameraUseCase;
        if (eVar instanceof r) {
            rVar = (r) eVar;
            int i15 = rVar.f186101g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                rVar.f186101g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                rVar = new r(eVar);
            }
        } else {
            rVar = new r(eVar);
        }
        Object objB = rVar.f186099e;
        Object objE = uq.b.e();
        int i16 = rVar.f186101g;
        if (i16 == 0) {
            u.b(objB);
            sz.c cVar = this.state;
            sz.c.Initialized initialized = cVar instanceof sz.c.Initialized ? (sz.c.Initialized) cVar : null;
            if (initialized != null && (cameraUseCase = initialized.getCameraUseCase()) != null) {
                rVar.f186098d = vq.j.a(str);
                rVar.f186101g = 1;
                objB = cameraUseCase.b(str, rVar);
                if (objB == objE) {
                    return objE;
                }
            }
            return sx.f.a.f185180a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        u.b(objB);
        sx.f fVar = (sx.f) objB;
        if (fVar != null) {
            return fVar;
        }
        return sx.f.a.f185180a;
    }

    @Override // rx.a
    public <T> mu.g<dx.i<dx.b, T>> c() {
        sz.c cVar = this.state;
        sz.c.Initialized initialized = cVar instanceof sz.c.Initialized ? (sz.c.Initialized) cVar : null;
        if (initialized == null) {
            return mu.i.I(new q(null));
        }
        vz.a cameraUseCase = initialized.getCameraUseCase();
        vz.d dVar = cameraUseCase instanceof vz.d ? (vz.d) cameraUseCase : null;
        return dVar == null ? mu.i.I(new p(initialized, null)) : dVar.k();
    }

    @Override // rx.a
    public mu.g<sx.c> d(sx.b mode) {
        z(new o(mode, null));
        return this.cameraStateFlow;
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(androidx.p016lifecycle.q qVar) {
        super.onCreate(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onDestroy(androidx.p016lifecycle.q owner) {
        z(new j(null));
        super.onDestroy(owner);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(androidx.p016lifecycle.q qVar) {
        super.onPause(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onResume(androidx.p016lifecycle.q qVar) {
        super.onResume(qVar);
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onStart(androidx.p016lifecycle.q owner) {
        super.onStart(owner);
        z(new m(null));
    }

    @Override // androidx.p016lifecycle.DefaultLifecycleObserver
    public void onStop(androidx.p016lifecycle.q owner) {
        z(new n(null));
        super.onStop(owner);
    }
}
