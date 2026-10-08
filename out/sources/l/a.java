package l;

import android.hardware.camera2.params.MeteringRectangle;
import android.os.Build;
import android.os.Trace;
import android.view.Surface;
import h.Result3A;
import h.e1;
import h.p1;
import h.q1;
import i.n0;
import io.sentry.android.core.c2;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import ju.p0;
import ju.q0;
import ju.w0;
import k.d0;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b#\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u008b\u0001\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001d\u001a\u00020\u001c\u0012\b\b\u0001\u0010\u001f\u001a\u00020\u001e\u0012\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b\"\u0010#J\u0017\u0010'\u001a\u00020&2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(JE\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000,\"\u0004\b\u0000\u0010)2(\u0010.\u001a$\b\u0001\u0012\u0004\u0012\u00020\u001e\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000,0+\u0012\u0006\u0012\u0004\u0018\u00010-0*H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00102\u001a\u000201H\u0016¢\u0006\u0004\b2\u00103J\u0010\u00105\u001a\u000204H\u0096@¢\u0006\u0004\b5\u00106J!\u0010;\u001a\u0002012\u0006\u00108\u001a\u0002072\b\u0010:\u001a\u0004\u0018\u000109H\u0016¢\u0006\u0004\b;\u0010<Jc\u0010I\u001a\b\u0012\u0004\u0012\u00020H0,2\b\u0010>\u001a\u0004\u0018\u00010=2\b\u0010@\u001a\u0004\u0018\u00010?2\b\u0010B\u001a\u0004\u0018\u00010A2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u000e\u0010F\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010C2\u000e\u0010G\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u000201H\u0016¢\u0006\u0004\bK\u00103J\u000f\u0010M\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010^R\u001a\u0010\u0017\u001a\u00020\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b_\u0010`\u001a\u0004\ba\u0010bR\u001a\u0010\u0019\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\bc\u0010d\u001a\u0004\be\u0010fR\u001a\u0010\u001b\u001a\u00020\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bg\u0010h\u001a\u0004\bi\u0010jR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010kR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bl\u0010mR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020p8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010rR*\u0010x\u001a\u00020t2\u0006\u0010u\u001a\u00020t8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u0014\u0010\u007f\u001a\u00020|8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b}\u0010~¨\u0006\u0080\u0001"}, d2 = {"Ll/a;", "Lh/s;", "Lh/s$b;", "graphConfig", "Lh/x;", "metadata", "Ll/k;", "graphProcessor", "Ll/i;", "graphListener", "Ll/x;", "streamGraph", "Ll/y;", "surfaceGraph", "Lh/n;", "cameraController", "Lm/l;", "frameDistributor", "Lm/i;", "frameCaptureQueue", "Li/n0;", "audioRestrictionController", "Lh/u;", "id", "Lm/e;", "parameters", "Lm/f;", "listeners", "Lm/p;", "sessionLock", "Lju/p0;", "graphScope", "Ll/f;", "controller3A", "<init>", "(Lh/s$b;Lh/x;Ll/k;Ll/i;Ll/x;Ll/y;Lh/n;Lm/l;Lm/i;Li/n0;Lh/u;Lm/e;Lm/f;Lm/p;Lju/p0;Ll/f;)V", "Lk/d0;", "token", "Ll/b;", "u", "(Lk/d0;)Ll/b;", "T", "Lkotlin/Function2;", "Ltq/e;", "Lju/w0;", "", "block", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ler/p;)Lju/w0;", "Loq/i0;", "start", "()V", "Lh/s$g;", "m3", "(Ltq/e;)Ljava/lang/Object;", "Lh/q1;", "stream", "Landroid/view/Surface;", "surface", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37088o, "(ILandroid/view/Surface;)V", "Lh/a;", "aeMode", "Lh/b;", "afMode", "Lh/d;", "awbMode", "", "Landroid/hardware/camera2/params/MeteringRectangle;", "aeRegions", "afRegions", "awbRegions", "Lh/m1;", "m", "(Lh/a;Lh/b;Lh/d;Ljava/util/List;Ljava/util/List;Ljava/util/List;)Lju/w0;", "close", "", "toString", "()Ljava/lang/String;", "a", "Ll/k;", "b", "Ll/i;", "c", "Ll/x;", "d", "Ll/y;", "e", "Lh/n;", "f", "Lm/l;", "g", "Lm/i;", "h", "Li/n0;", "j", "Lh/u;", "y", "()Lh/u;", "k", "Lm/e;", "E", "()Lm/e;", "l", "Lm/f;", "C", "()Lm/f;", "Lm/p;", "n", "Lju/p0;", "p", "Ll/f;", "Liu/a;", "q", "Liu/a;", "closed", "", "value", "r", "Z", "isForeground", "()Z", "X", "(Z)V", "Lh/p1;", "G", "()Lh/p1;", "streams", "camera-camera2-pipe"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements h.s {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final k graphProcessor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final i graphListener;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final StreamGraph streamGraph;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final y surfaceGraph;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final h.n cameraController;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final m.l frameDistributor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final m.i frameCaptureQueue;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final n0 audioRestrictionController;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final h.u id;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final m.e parameters;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final m.f listeners;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final m.p sessionLock;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p0 graphScope;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final f controller3A;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final iu.a closed = iu.b.a(false);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private boolean isForeground;

    /* JADX INFO: renamed from: l.a$a, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class C2760a extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f113724d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f113726f;

        C2760a(tq.e<? super C2760a> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f113724d = obj;
            this.f113726f |= PKIFailureInfo.systemUnavail;
            return a.this.m3(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "Lju/w0;", "Lh/m1;", "<anonymous>", "(Lju/p0;)Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.p<p0, tq.e<? super w0<? extends Result3A>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113727e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.a f113729g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ h.b f113730h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ h.d f113731j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ List<MeteringRectangle> f113732k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ List<MeteringRectangle> f113733l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ List<MeteringRectangle> f113734m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(h.a aVar, h.b bVar, h.d dVar, List<MeteringRectangle> list, List<MeteringRectangle> list2, List<MeteringRectangle> list3, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f113729g = aVar;
            this.f113730h = bVar;
            this.f113731j = dVar;
            this.f113732k = list;
            this.f113733l = list2;
            this.f113734m = list3;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f113727e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return f.s(a.this.controller3A, this.f113729g, this.f113730h, this.f113731j, null, this.f113732k, this.f113733l, this.f113734m, 8, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super w0<Result3A>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return a.this.new b(this.f113729g, this.f113730h, this.f113731j, this.f113732k, this.f113733l, this.f113734m, eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lk/d0;", "it", "Lju/w0;", "<anonymous>", "(Lk/d0;)Lju/w0;"}, k = 3, mv = {2, 1, 0})
    static final class c<T> extends vq.k implements er.p<d0, tq.e<? super w0<? extends T>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f113735e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.p<p0, tq.e<? super w0<? extends T>>, Object> f113736f;

        /* JADX INFO: renamed from: l.a$c$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "Lju/p0;", "Lju/w0;", "<anonymous>", "(Lju/p0;)Lju/w0;"}, k = 3, mv = {2, 1, 0})
        static final class C2761a extends vq.k implements er.p<p0, tq.e<? super w0<? extends T>>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f113737e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f113738f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.p<p0, tq.e<? super w0<? extends T>>, Object> f113739g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C2761a(er.p<? super p0, ? super tq.e<? super w0<? extends T>>, ? extends Object> pVar, tq.e<? super C2761a> eVar) {
                super(2, eVar);
                this.f113739g = pVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f113737e;
                if (i15 != 0) {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                p0 p0Var = (p0) this.f113738f;
                er.p<p0, tq.e<? super w0<? extends T>>, Object> pVar = this.f113739g;
                this.f113737e = 1;
                Object objB = pVar.B(p0Var, this);
                return objB == objE ? objE : objB;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super w0<? extends T>> eVar) {
                return ((C2761a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                C2761a c2761a = new C2761a(this.f113739g, eVar);
                c2761a.f113738f = obj;
                return c2761a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(er.p<? super p0, ? super tq.e<? super w0<? extends T>>, ? extends Object> pVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f113736f = pVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f113735e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            C2761a c2761a = new C2761a(this.f113736f, null);
            this.f113735e = 1;
            Object objE2 = q0.e(c2761a, this);
            return objE2 == objE ? objE : objE2;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(d0 d0Var, tq.e<? super w0<? extends T>> eVar) {
            return ((c) v(d0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f113736f, eVar);
        }
    }

    public a(h.s.b bVar, h.x xVar, k kVar, i iVar, StreamGraph streamGraph, y yVar, h.n nVar, m.l lVar, m.i iVar2, n0 n0Var, h.u uVar, m.e eVar, m.f fVar, m.p pVar, p0 p0Var, f fVar2) {
        this.graphProcessor = kVar;
        this.graphListener = iVar;
        this.streamGraph = streamGraph;
        this.surfaceGraph = yVar;
        this.cameraController = nVar;
        this.frameDistributor = lVar;
        this.frameCaptureQueue = iVar2;
        this.audioRestrictionController = n0Var;
        this.id = uVar;
        this.parameters = eVar;
        this.listeners = fVar;
        this.sessionLock = pVar;
        this.graphScope = p0Var;
        this.controller3A = fVar2;
        if (k.k.f107055a.c()) {
            k.h.f107050a.d(xVar, bVar, this);
        }
        if (h.s.e.f(bVar.getSessionMode(), h.s.e.INSTANCE.c())) {
            if (streamGraph.m().isEmpty()) {
                throw new IllegalArgumentException("Cannot create a HIGH_SPEED CameraGraph without outputs.");
            }
            if (streamGraph.m().size() > 2) {
                throw new IllegalArgumentException(("Cannot create a HIGH_SPEED CameraGraph with more than two outputs. Configured outputs are " + streamGraph.m()).toString());
            }
            List<e1> listM = streamGraph.m();
            if (!(listM instanceof Collection) || !listM.isEmpty()) {
                Iterator<T> it = listM.iterator();
                while (it.hasNext()) {
                    if (!((e1) it.next()).e()) {
                        throw new IllegalArgumentException(("HIGH_SPEED CameraGraph must only contain Preview and/or Video streams. Configured outputs are " + this.streamGraph.m()).toString());
                    }
                }
            }
        }
        if (bVar.k() != null) {
            if (bVar.k().isEmpty()) {
                throw new IllegalArgumentException("At least one InputConfiguration is required for reprocessing");
            }
            if (Build.VERSION.SDK_INT < 31 && bVar.k().size() > 1) {
                throw new IllegalArgumentException("Multi resolution reprocessing not supported under Android S");
            }
        }
        if (!this.streamGraph.N().isEmpty()) {
            this.surfaceGraph.p();
        }
        this.isForeground = true;
    }

    private final <T> w0<T> H(er.p<? super p0, ? super tq.e<? super w0<? extends T>>, ? extends Object> block) {
        return this.sessionLock.h(this.graphScope, new c(block, null));
    }

    private final l.b u(d0 token) {
        return new l.b(token, this.graphProcessor, this.controller3A, this.frameCaptureQueue, getParameters(), getListeners());
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public m.f getListeners() {
        return this.listeners;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public m.e getParameters() {
        return this.parameters;
    }

    @Override // h.t
    public p1 G() {
        return this.streamGraph;
    }

    @Override // h.t
    public void H1(int stream, Surface surface) throws Exception {
        k.h hVar = k.h.f107050a;
        Trace.beginSection(((Object) q1.f(stream)) + "#setSurface");
        if (surface != null && !surface.isValid() && k.k.f107055a.d()) {
            c2.g("CXCP", this + "#setSurface: " + surface + " is invalid");
        }
        this.surfaceGraph.r(stream, surface);
        Trace.endSection();
    }

    @Override // h.t
    public void X(boolean z15) {
        this.isForeground = z15;
        this.cameraController.X(z15);
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        if (this.closed.a(false, true)) {
            k.h hVar = k.h.f107050a;
            Trace.beginSection(this + "#close");
            if (k.k.f107055a.c()) {
                toString();
            }
            this.graphProcessor.close();
            this.cameraController.close();
            this.frameDistributor.close();
            this.frameCaptureQueue.close();
            this.surfaceGraph.close();
            this.streamGraph.close();
            this.audioRestrictionController.a(this);
            q0.d(this.graphScope, null, 1, null);
            Trace.endSection();
        }
    }

    @Override // h.o
    public w0<Result3A> m(h.a aeMode, h.b afMode, h.d awbMode, List<MeteringRectangle> aeRegions, List<MeteringRectangle> afRegions, List<MeteringRectangle> awbRegions) {
        return H(new b(aeMode, afMode, awbMode, aeRegions, afRegions, awbRegions, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // h.t
    public Object m3(tq.e<? super h.s.g> eVar) throws Throwable {
        C2760a c2760a;
        if (eVar instanceof C2760a) {
            c2760a = (C2760a) eVar;
            int i15 = c2760a.f113726f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                c2760a.f113726f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                c2760a = new C2760a(eVar);
            }
        } else {
            c2760a = new C2760a(eVar);
        }
        Object objD = c2760a.f113724d;
        Object objE = uq.b.e();
        int i16 = c2760a.f113726f;
        if (i16 == 0) {
            oq.u.b(objD);
            m.p pVar = this.sessionLock;
            c2760a.f113726f = 1;
            objD = pVar.d(c2760a);
            if (objD == objE) {
                return objE;
            }
        } else {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objD);
        }
        return u((d0) objD);
    }

    @Override // h.t
    public void start() {
        if (this.closed.b()) {
            throw new IllegalStateException(("Cannot start " + this + " after calling close()").toString());
        }
        k.h hVar = k.h.f107050a;
        Trace.beginSection(this + "#start");
        if (k.k.f107055a.c()) {
            toString();
        }
        this.graphListener.b();
        this.cameraController.start();
        Trace.endSection();
    }

    public String toString() {
        return getId().getName();
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public h.u getId() {
        return this.id;
    }
}
