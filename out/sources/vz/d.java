package vz;

import androidx.camera.core.g;
import dx.i;
import er.l;
import er.p;
import java.io.File;
import java.util.List;
import java.util.concurrent.Executors;
import ju.g1;
import ju.n;
import ju.p0;
import ju.q0;
import ju.z2;
import mu.a0;
import mu.h0;
import o.j2;
import o.m1;
import o.t0;
import o.v0;
import oq.i0;
import oq.t;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import sx.f;
import tq.e;
import vq.k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00012\u00020\u0002B5\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ%\u0010\u0012\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00010\u00100\u000f\"\u0004\b\u0001\u0010\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u0017H\u0096@¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001c\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001c\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010 R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010&R \u0010-\u001a\b\u0012\u0004\u0012\u00020)0(8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b#\u0010,R&\u00101\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00028\u00000\u00100.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100¨\u00062"}, d2 = {"Lvz/d;", "T", "Lvz/a;", "Lsx/b$a;", "cameraMode", "Landroidx/camera/core/g;", "imageAnalysis", "Lo/t0;", "imageCapture", "Lo/m1;", "preview", "Ltz/b;", "analyzer", "<init>", "(Lsx/b$a;Landroidx/camera/core/g;Lo/t0;Lo/m1;Ltz/b;)V", "Lmu/g;", "Ldx/i;", "Ldx/b;", "k", "()Lmu/g;", "Loq/i0;", "e", "()V", "", "absolutePath", "Lsx/f;", "b", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "a", "Lsx/b$a;", "j", "()Lsx/b$a;", "Landroidx/camera/core/g;", "c", "Lo/t0;", "d", "Ltz/b;", "Lju/p0;", "Lju/p0;", "scope", "", "Lo/j2;", "f", "Ljava/util/List;", "()Ljava/util/List;", "useCases", "Lmu/a0;", "g", "Lmu/a0;", "imageAnalysisFlow", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class d<T> implements vz.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final sx.b.Analyzer cameraMode;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final g imageAnalysis;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final t0 imageCapture;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final tz.b<T> analyzer;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<j2> useCases;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p0 scope = q0.a(g1.b().n0(z2.b(null, 1, null)));

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final a0<i<dx.b, T>> imageAnalysisFlow = h0.b(0, 0, null, 7, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class a extends k implements p<p0, e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f208722e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ d<T> f208723f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ i<dx.b, T> f208724g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(d<? extends T> dVar, i<? extends dx.b, ? extends T> iVar, e<? super a> eVar) {
            super(2, eVar);
            this.f208723f = dVar;
            this.f208724g = iVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f208722e;
            if (i15 == 0) {
                u.b(obj);
                a0 a0Var = ((d) this.f208723f).imageAnalysisFlow;
                i<dx.b, T> iVar = this.f208724g;
                this.f208722e = 1;
                if (a0Var.F(iVar, this) == objE) {
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
        public final Object B(p0 p0Var, e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return new a(this.f208723f, this.f208724g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"vz/d$b", "Lo/t0$g;", "Lo/t0$i;", "outputFileResults", "Loq/i0;", "d", "(Lo/t0$i;)V", "Lo/v0;", "exception", "e", "(Lo/v0;)V", "media_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class b implements t0.g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n<f> f208725a;

        /* JADX WARN: Multi-variable type inference failed */
        b(n<? super f> nVar) {
            this.f208725a = nVar;
        }

        @Override // o.t0.g
        public void d(t0.i outputFileResults) {
            n<f> nVar = this.f208725a;
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(f.c.f185189a));
        }

        @Override // o.t0.g
        public void e(v0 exception) {
            f.Failure.a aVar;
            n<f> nVar = this.f208725a;
            int iA = exception.a();
            if (iA == 1) {
                aVar = f.Failure.a.SAVING;
            } else if (iA == 2) {
                aVar = f.Failure.a.FRAMEWORK;
            } else if (iA != 3) {
                aVar = iA != 4 ? f.Failure.a.UNKNOWN : f.Failure.a.NOT_BOUND;
            } else {
                aVar = f.Failure.a.CLOSED;
            }
            nVar.i(t.b(new f.Failure(aVar)));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d(sx.b.Analyzer analyzer, g gVar, t0 t0Var, m1 m1Var, tz.b<? extends T> bVar) {
        this.cameraMode = analyzer;
        this.imageAnalysis = gVar;
        this.imageCapture = t0Var;
        this.analyzer = bVar;
        this.useCases = v.q(m1Var, gVar, t0Var);
        bVar.b(new l() { // from class: vz.c
            @Override // er.l
            public final Object b(Object obj) {
                return d.g(this.f208714a, (i) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g(d dVar, i iVar) {
        ju.k.d(dVar.scope, null, null, new a(dVar, iVar, null), 3, null);
        return i0.f148189a;
    }

    @Override // vz.a
    public void a() {
        this.imageAnalysis.m0();
    }

    @Override // vz.a
    public Object b(String str, e<? super f> eVar) {
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        this.imageCapture.T0(new t0.h.a(new File(str)).a(), Executors.newSingleThreadExecutor(), new b(pVar));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    @Override // vz.a
    public List<j2> d() {
        return this.useCases;
    }

    @Override // vz.a
    public void e() {
        this.imageAnalysis.w0(Executors.newSingleThreadExecutor(), this.analyzer);
    }

    @Override // vz.a
    /* JADX INFO: renamed from: j, reason: from getter and merged with bridge method [inline-methods] */
    public sx.b.Analyzer c() {
        return this.cameraMode;
    }

    public final <T> mu.g<i<dx.b, T>> k() {
        return this.imageAnalysisFlow;
    }
}
