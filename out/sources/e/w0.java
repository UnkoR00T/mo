package e;

import android.hardware.camera2.CaptureRequest;
import h.Result3A;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\b\u0007\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ=\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J=\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0016\u0010\u000e\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f\u0012\u0004\u0012\u00020\r0\u000b2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J/\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0010\u0010\u0019\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\f0\u00182\u0006\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010\u001d\u001a\u00020\u001c2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0016¢\u0006\u0004\b!\u0010\"J1\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00140\u00132\u0006\u0010$\u001a\u00020#2\u0012\u0010&\u001a\u000e\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\r0\u000bH\u0016¢\u0006\u0004\b'\u0010(J\u0015\u0010*\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0016¢\u0006\u0004\b*\u0010+J\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020)0\u00132\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020)0\u0013H\u0016¢\u0006\u0004\b0\u0010+JC\u00108\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u0001070\u00130\u00182\f\u00102\u001a\b\u0012\u0004\u0012\u0002010\u00182\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u0002032\u0006\u00106\u001a\u000203H\u0016¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u001cH\u0096@¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u0014H\u0016¢\u0006\u0004\b<\u0010=R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010>R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0018\u0010B\u001a\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010AR\u0014\u0010E\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u0010D¨\u0006F"}, d2 = {"Le/w0;", "Le/f2;", "Lnq/a;", "Le/j2;", "implProvider", "Le/u2;", "threads", "<init>", "(Lnq/a;Le/u2;)V", "p", "()Le/j2;", "", "Landroid/hardware/camera2/CaptureRequest$Key;", "", "values", "Le/f2$a;", "type", "Lv/p1$c;", "optionPriority", "Lju/w0;", "Loq/i0;", "g", "(Ljava/util/Map;Le/f2$a;Lv/p1$c;)Lju/w0;", "l", "", "keys", "f", "(Ljava/util/List;Le/f2$a;)Lju/w0;", "", "isPrimary", "", "Lo/j2;", "runningUseCases", "a", "(ZLjava/util/Collection;)Lju/w0;", "Lv/p1;", "config", "", "tags", "m", "(Lv/p1;Ljava/util/Map;)Lju/w0;", "Lh/m1;", "i", "()Lju/w0;", "Lh/a;", "aeMode", "k", "(I)Lju/w0;", "e", "Lv/n1;", "captureSequence", "", "captureMode", "flashType", "flashMode", "Ljava/lang/Void;", "d", "(Ljava/util/List;III)Ljava/util/List;", "c", "(Ltq/e;)Ljava/lang/Object;", "close", "()V", "Lnq/a;", "b", "Le/u2;", "Le/j2;", "impl", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "camera-camera2"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w0 implements f2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final nq.a<j2> implProvider;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final u2 threads;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private volatile j2 impl;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed = new AtomicBoolean(false);

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class a extends vq.k implements er.p<ju.p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46383e;

        public a(tq.e eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46383e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            j2 j2VarP = w0.this.p();
            this.f46383e = 1;
            Object objC = j2VarP.c(this);
            return objC == objE ? objE : objC;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new a(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class b extends vq.k implements er.p<ju.p0, tq.e<? super Result3A>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46385e;

        public b(tq.e eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46385e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<Result3A> w0VarE = w0.this.p().e();
            this.f46385e = 1;
            Object objI = w0VarE.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Result3A> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    public static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46387e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w0 f46388f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(tq.e eVar, w0 w0Var) {
            super(2, eVar);
            this.f46388f = w0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46387e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            j2 j2Var = this.f46388f.impl;
            if (j2Var != null) {
                j2Var.close();
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(eVar, this.f46388f);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "Lju/p0;", "", "Lju/w0;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 1, 0})
    public static final class d extends vq.k implements er.p<ju.p0, tq.e<? super List<? extends ju.w0<? extends Void>>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46389e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f46391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f46392h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f46393j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ int f46394k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(tq.e eVar, List list, int i15, int i16, int i17) {
            super(2, eVar);
            this.f46391g = list;
            this.f46392h = i15;
            this.f46393j = i16;
            this.f46394k = i17;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f46389e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return w0.this.p().d(this.f46391g, this.f46392h, this.f46393j, this.f46394k);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super List<? extends ju.w0<? extends Void>>> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new d(eVar, this.f46391g, this.f46392h, this.f46393j, this.f46394k);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46395e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ List f46397g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f2.a f46398h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(tq.e eVar, List list, f2.a aVar) {
            super(2, eVar);
            this.f46397g = list;
            this.f46398h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46395e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<oq.i0> w0VarF = w0.this.p().f(this.f46397g, this.f46398h);
            this.f46395e = 1;
            Object objI = w0VarF.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new e(eVar, this.f46397g, this.f46398h);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class f extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46399e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f46401g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f2.a f46402h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v.p1.c f46403j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(tq.e eVar, Map map, f2.a aVar, v.p1.c cVar) {
            super(2, eVar);
            this.f46401g = map;
            this.f46402h = aVar;
            this.f46403j = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46399e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<oq.i0> w0VarG = w0.this.p().g(this.f46401g, this.f46402h, this.f46403j);
            this.f46399e = 1;
            Object objI = w0VarG.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new f(eVar, this.f46401g, this.f46402h, this.f46403j);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class g extends vq.k implements er.p<ju.p0, tq.e<? super Result3A>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46404e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f46406g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(tq.e eVar, int i15) {
            super(2, eVar);
            this.f46406g = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46404e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<Result3A> w0VarK = w0.this.p().k(this.f46406g);
            this.f46404e = 1;
            Object objI = w0VarK.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Result3A> eVar) {
            return ((g) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new g(eVar, this.f46406g);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class h extends vq.k implements er.p<ju.p0, tq.e<? super Result3A>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46407e;

        public h(tq.e eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46407e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<Result3A> w0VarI = w0.this.p().i();
            this.f46407e = 1;
            Object objI = w0VarI.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super Result3A> eVar) {
            return ((h) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new h(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class i extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46409e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ Map f46411g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ f2.a f46412h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ v.p1.c f46413j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(tq.e eVar, Map map, f2.a aVar, v.p1.c cVar) {
            super(2, eVar);
            this.f46411g = map;
            this.f46412h = aVar;
            this.f46413j = cVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46409e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<oq.i0> w0VarL = w0.this.p().l(this.f46411g, this.f46412h, this.f46413j);
            this.f46409e = 1;
            Object objI = w0VarL.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((i) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new i(eVar, this.f46411g, this.f46412h, this.f46413j);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class j extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46414e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ v.p1 f46416g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Map f46417h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(tq.e eVar, v.p1 p1Var, Map map) {
            super(2, eVar);
            this.f46416g = p1Var;
            this.f46417h = map;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46414e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<oq.i0> w0VarM = w0.this.p().m(this.f46416g, this.f46417h);
            this.f46414e = 1;
            Object objI = w0VarM.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((j) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new j(eVar, this.f46416g, this.f46417h);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 1, 0})
    public static final class k extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f46418e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f46420g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Collection f46421h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(tq.e eVar, boolean z15, Collection collection) {
            super(2, eVar);
            this.f46420g = z15;
            this.f46421h = collection;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f46418e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                return obj;
            }
            oq.u.b(obj);
            ju.w0<oq.i0> w0VarA = w0.this.p().a(this.f46420g, this.f46421h);
            this.f46418e = 1;
            Object objI = w0VarA.I(this);
            return objI == objE ? objE : objI;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((k) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return w0.this.new k(eVar, this.f46420g, this.f46421h);
        }
    }

    public w0(nq.a<j2> aVar, u2 u2Var) {
        this.implProvider = aVar;
        this.threads = u2Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final j2 p() {
        if (this.isClosed.get()) {
            throw new CancellationException("UseCaseCameraRequestControl is closed");
        }
        j2 j2Var = this.impl;
        if (j2Var != null) {
            return j2Var;
        }
        j2 j2Var2 = this.implProvider.get();
        if (this.isClosed.get()) {
            j2Var2.close();
            throw new CancellationException("UseCaseCameraRequestControl closed during initialization");
        }
        this.impl = j2Var2;
        return j2Var2;
    }

    @Override // e.f2
    public ju.w0<oq.i0> a(boolean isPrimary, Collection<? extends o.j2> runningUseCases) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.a(isPrimary, runningUseCases) : ju.k.b(this.threads.getSequentialScope(), null, null, new k(null, isPrimary, runningUseCases), 3, null);
    }

    @Override // e.f2
    public Object c(tq.e<? super Boolean> eVar) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.c(eVar) : ju.i.g(ju.v1.b(this.threads.getSequentialExecutor()), new a(null), eVar);
    }

    @Override // e.f2
    public void close() {
        if (this.isClosed.getAndSet(true)) {
            return;
        }
        ju.k.d(this.threads.getSequentialScope(), null, null, new c(null, this), 3, null);
    }

    @Override // e.f2
    public List<ju.w0<Void>> d(List<v.n1> captureSequence, int captureMode, int flashType, int flashMode) {
        int size = captureSequence.size();
        j2 j2Var = this.impl;
        if (j2Var != null) {
            return j2Var.d(captureSequence, captureMode, flashType, flashMode);
        }
        ju.w0 w0VarB = ju.k.b(this.threads.getSequentialScope(), null, null, new d(null, captureSequence, captureMode, flashType, flashMode), 3, null);
        ArrayList arrayList = new ArrayList(size);
        for (int i15 = 0; i15 < size; i15++) {
            arrayList.add(ju.k.b(this.threads.getSequentialScope(), null, null, new x0(w0VarB, i15, null), 3, null));
        }
        return arrayList;
    }

    @Override // e.f2
    public ju.w0<Result3A> e() {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.e() : ju.k.b(this.threads.getSequentialScope(), null, null, new b(null), 3, null);
    }

    @Override // e.f2
    public ju.w0<oq.i0> f(List<? extends CaptureRequest.Key<?>> keys, f2.a type) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.f(keys, type) : ju.k.b(this.threads.getSequentialScope(), null, null, new e(null, keys, type), 3, null);
    }

    @Override // e.f2
    public ju.w0<oq.i0> g(Map<CaptureRequest.Key<?>, ? extends Object> values, f2.a type, v.p1.c optionPriority) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.g(values, type, optionPriority) : ju.k.b(this.threads.getSequentialScope(), null, null, new f(null, values, type, optionPriority), 3, null);
    }

    @Override // e.f2
    public ju.w0<Result3A> i() {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.i() : ju.k.b(this.threads.getSequentialScope(), null, null, new h(null), 3, null);
    }

    @Override // e.f2
    public ju.w0<Result3A> k(int aeMode) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.k(aeMode) : ju.k.b(this.threads.getSequentialScope(), null, null, new g(null, aeMode), 3, null);
    }

    @Override // e.f2
    public ju.w0<oq.i0> l(Map<CaptureRequest.Key<?>, ? extends Object> values, f2.a type, v.p1.c optionPriority) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.l(values, type, optionPriority) : ju.k.b(this.threads.getSequentialScope(), null, null, new i(null, values, type, optionPriority), 3, null);
    }

    @Override // e.f2
    public ju.w0<oq.i0> m(v.p1 config, Map<String, ? extends Object> tags) {
        j2 j2Var = this.impl;
        return j2Var != null ? j2Var.m(config, tags) : ju.k.b(this.threads.getSequentialScope(), null, null, new j(null, config, tags), 3, null);
    }
}
