package xy0;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import d1.a3;
import d1.d3;
import d1.m3;
import d1.q3;
import i50.BaseScaffoldData;
import ju.d2;
import ju.g1;
import ju.n2;
import mx.Label;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p049fm.MapProperties;
import p049fm.MapUiSettings;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.n6;
import zy0.PointPinItem;

/* JADX INFO: loaded from: classes6.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a-\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\f\u0010\r\u001a-\u0010\u000f\u001a\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\b\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000e2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0007¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0014\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0017\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a7\u0010\u001e\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0012\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001cH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001aG\u0010-\u001a\u00020,2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\u0006\u0010'\u001a\u00020&2\b\b\u0002\u0010)\u001a\u00020(2\f\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00040*H\u0002¢\u0006\u0004\b-\u0010.¨\u0006/²\u0006\f\u0010\b\u001a\u00020\u00078\nX\u008a\u0084\u0002"}, d2 = {"Lxy0/e;", "viewModel", "", "testMode", "Loq/i0;", "u", "(Lxy0/e;ZLm2/r;II)V", "Lxy0/e$a;", "data", "Lmu/g;", "Lxy0/e$b;", "sideEffects", "x", "(Lxy0/e$a;Lmu/g;ZLm2/r;I)V", "Lxy0/e$a$b;", "z", "(Lmu/g;Lxy0/e$a$b;ZLm2/r;I)V", "E", "(Lxy0/e$a$b;Lmu/g;Lm2/r;I)V", "Ld40/b$b;", "q", "(Ld40/b$b;Lm2/r;I)V", "Lzy0/d;", "pointsCluster", "s", "(Lzy0/d;Lm2/r;I)V", "T", "flow", "Lkotlin/Function1;", "onEvent", "M", "(Lmu/g;Ler/l;Lm2/r;I)V", "Lju/p0;", "coroutineScope", "Lfm/e;", "cameraPositionState", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "zoom", "", "cameraAnimationDurationMs", "Lkotlin/Function0;", "animationFinished", "Lju/d2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lju/p0;Lfm/e;Lcom/google/android/gms/maps/model/LatLng;FILer/a;)Lju/d2;", "airquality_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class v {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.a<p049fm.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f222361a;

        public a(er.l lVar) {
            this.f222361a = lVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            p049fm.e eVarC = p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
            this.f222361a.b(eVarC);
            return eVarC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222362e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ bm.c<PointPinItem> f222363f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ dm.h<PointPinItem> f222364g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f222365h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f222366j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ xy0.e.a.Initialized f222367k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(bm.c<PointPinItem> cVar, dm.h<PointPinItem> hVar, float f15, float f16, xy0.e.a.Initialized initialized, tq.e<? super b> eVar) {
            super(2, eVar);
            this.f222363f = cVar;
            this.f222364g = hVar;
            this.f222365h = f15;
            this.f222366j = f16;
            this.f222367k = initialized;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(xy0.e.a.Initialized initialized, PointPinItem pointPinItem) {
            initialized.h().b(pointPinItem);
            return true;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            bm.c<PointPinItem> cVar;
            uq.b.e();
            if (this.f222362e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            bm.c<PointPinItem> cVar2 = this.f222363f;
            if (!fr.t.c(cVar2 != null ? cVar2.l() : null, this.f222364g) && (cVar = this.f222363f) != null) {
                cVar.p(this.f222364g);
            }
            dm.h<PointPinItem> hVar = this.f222364g;
            if (hVar != null) {
                hVar.e0(2);
            }
            bm.c<PointPinItem> cVar3 = this.f222363f;
            if (cVar3 != null) {
                float f15 = this.f222365h;
                float f16 = this.f222366j;
                final xy0.e.a.Initialized initialized = this.f222367k;
                cVar3.m(new cm.e((int) f15, (int) f16));
                cVar3.o(new bm.c.e() { // from class: xy0.w
                    @Override // bm.c.e
                    public final boolean a(bm.b bVar) {
                        return v.b.O(initialized, (PointPinItem) bVar);
                    }
                });
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new b(this.f222363f, this.f222364g, this.f222365h, this.f222366j, this.f222367k, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222368e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f222369f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ mu.g<T> f222370g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<T, oq.i0> f222371h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f222372e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ mu.g<T> f222373f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l<T, oq.i0> f222374g;

            /* JADX INFO: renamed from: xy0.v$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C5943a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f222375e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ mu.g<T> f222376f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ er.l<T, oq.i0> f222377g;

                /* JADX INFO: renamed from: xy0.v$c$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                static final /* synthetic */ class C5944a implements mu.h, fr.n {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ er.l<T, oq.i0> f222378a;

                    /* JADX WARN: Multi-variable type inference failed */
                    C5944a(er.l<? super T, oq.i0> lVar) {
                        this.f222378a = lVar;
                    }

                    @Override // mu.h
                    public final Object F(T t15, tq.e<? super oq.i0> eVar) {
                        Object objO = C5943a.O(this.f222378a, t15, eVar);
                        return objO == uq.b.e() ? objO : oq.i0.f148189a;
                    }

                    @Override // fr.n
                    public final oq.e<?> b() {
                        return new fr.q(2, this.f222378a, fr.t.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
                    }

                    public final boolean equals(Object obj) {
                        if ((obj instanceof mu.h) && (obj instanceof fr.n)) {
                            return fr.t.c(b(), ((fr.n) obj).b());
                        }
                        return false;
                    }

                    public final int hashCode() {
                        return b().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                C5943a(mu.g<? extends T> gVar, er.l<? super T, oq.i0> lVar, tq.e<? super C5943a> eVar) {
                    super(2, eVar);
                    this.f222376f = gVar;
                    this.f222377g = lVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object O(er.l lVar, Object obj, tq.e eVar) {
                    lVar.b(obj);
                    return oq.i0.f148189a;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to xy0.v$c$a$a for r4v1 'this'  tq.e
                    	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                    	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                    	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                    	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                    	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                    */
                @Override // vq.a
                public final java.lang.Object J(java.lang.Object r5) {
                    /*
                        r4 = this;
                        java.lang.Object r0 = uq.b.e()
                        int r1 = r4.f222375e
                        r2 = 1
                        if (r1 == 0) goto L17
                        if (r1 != r2) goto Lf
                        oq.u.b(r5)
                        goto L2c
                    Lf:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r0)
                        throw r5
                    L17:
                        oq.u.b(r5)
                        mu.g<T> r5 = r4.f222376f
                        er.l<T, oq.i0> r1 = r4.f222377g
                        xy0.v$c$a$a$a r3 = new xy0.v$c$a$a$a
                        r3.<init>(r1)
                        r4.f222375e = r2
                        java.lang.Object r5 = r5.a(r3, r4)
                        if (r5 != r0) goto L2c
                        return r0
                    L2c:
                        oq.i0 r5 = oq.i0.f148189a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: xy0.v.c.a.C5943a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C5943a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C5943a(this.f222376f, this.f222377g, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(mu.g<? extends T> gVar, er.l<? super T, oq.i0> lVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f222373f = gVar;
                this.f222374g = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f222372e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    n2 n2VarJ2 = g1.c().j2();
                    C5943a c5943a = new C5943a(this.f222373f, this.f222374g, null);
                    this.f222372e = 1;
                    if (ju.i.g(n2VarJ2, c5943a, this) == objE) {
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

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f222373f, this.f222374g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.p016lifecycle.q qVar, mu.g<? extends T> gVar, er.l<? super T, oq.i0> lVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f222369f = qVar;
            this.f222370g = gVar;
            this.f222371h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222368e;
            if (i15 == 0) {
                oq.u.b(obj);
                androidx.p016lifecycle.q qVar = this.f222369f;
                androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.STARTED;
                a aVar = new a(this.f222370g, this.f222371h, null);
                this.f222368e = 1;
                if (androidx.p016lifecycle.g0.b(qVar, bVar, aVar, this) == objE) {
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

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new c(this.f222369f, this.f222370g, this.f222371h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f222379a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f222380b;

        static {
            int[] iArr = new int[androidx.lifecycle.j.a.values().length];
            try {
                iArr[androidx.lifecycle.j.a.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[androidx.lifecycle.j.a.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f222379a = iArr;
            int[] iArr2 = new int[xy0.e.b.MoveCamera.EnumC5941a.values().length];
            try {
                iArr2[xy0.e.b.MoveCamera.EnumC5941a.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[xy0.e.b.MoveCamera.EnumC5941a.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            f222380b = iArr2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f222381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p049fm.e f222382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LatLng f222383g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f222384h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f222385j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f222386k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p049fm.e eVar, LatLng latLng, float f15, int i15, er.a<oq.i0> aVar, tq.e<? super e> eVar2) {
            super(2, eVar2);
            this.f222382f = eVar;
            this.f222383g = latLng;
            this.f222384h = f15;
            this.f222385j = i15;
            this.f222386k = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f222381e;
            if (i15 == 0) {
                oq.u.b(obj);
                p049fm.e eVar = this.f222382f;
                lh.a aVarA = lh.b.a(CameraPosition.h(this.f222383g, this.f222384h));
                int i16 = this.f222385j;
                this.f222381e = 1;
                if (eVar.n(aVarA, i16, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f222386k.a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f222382f, this.f222383g, this.f222384h, this.f222385j, this.f222386k, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(xy0.e.a.Initialized initialized, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        int i15 = d.f222379a[aVar.ordinal()];
        if (i15 == 1) {
            initialized.i().a();
        } else if (i15 == 2) {
            initialized.g().a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(boolean z15, final xy0.e.a.Initialized initialized, mu.g gVar, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1449044758, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapScreenInitialized.<anonymous> (MapScreen.kt:114)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarL = a3.l(androidx.compose.foundation.layout.d.f(companion, 0.0f, 1, null), d3Var);
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarL);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB);
            } else {
                rVar.u();
            }
            p076m2.r rVarC = n6.c(rVar);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.x xVar = d1.x.f39368a;
            if (z15) {
                rVar.X(759302066);
            } else {
                rVar.X(763896390);
                E(initialized, gVar, rVar, 0);
            }
            rVar.R();
            f3.m mVarD = xVar.d(a3.p(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 0.0f, 2, null), companion2.c());
            d1.i iVar = d1.i.f39152a;
            p036e4.w0 w0VarA = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarD);
            er.a<androidx.compose.ui.node.c> aVarB2 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB2);
            } else {
                rVar.u();
            }
            p076m2.r rVarC2 = n6.c(rVar);
            n6.i(rVarC2, w0VarA, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            p036e4.w0 w0VarB = m3.b(iVar.f(), companion2.l(), rVar, 6);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB3 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB3);
            } else {
                rVar.u();
            }
            p076m2.r rVarC3 = n6.c(rVar);
            n6.i(rVarC3, w0VarB, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(initialized.getNavigationButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            p114t0.k.e(i0Var, initialized.getShouldSearchButtonVisible(), null, null, null, null, y2.m.d(169806782, true, new er.q() { // from class: xy0.q
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.C(initialized, (p114t0.l) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), rVar, 1572870, 30);
            rVar.x();
            rVar.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(xy0.e.a.Initialized initialized, p114t0.l lVar, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(169806782, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapScreenInitialized.<anonymous>.<anonymous>.<anonymous>.<anonymous> (MapScreen.kt:143)");
        }
        f3.m mVarP = a3.p(f3.m.INSTANCE, 0.0f, k70.a.f108864a.b(rVar, k70.a.f108865b).getSpacing200(), 1, null);
        p036e4.w0 w0VarI = d1.r.i(f3.c.INSTANCE.o(), false);
        int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
        p076m2.e0 e0VarT = rVar.t();
        f3.m mVarE = f3.j.e(rVar, mVarP);
        androidx.compose.ui.node.c.Companion companion = androidx.compose.ui.node.c.INSTANCE;
        er.a<androidx.compose.ui.node.c> aVarB = companion.b();
        if (rVar.l() == null) {
            p076m2.m.d();
        }
        rVar.K();
        if (rVar.getInserting()) {
            rVar.H(aVarB);
        } else {
            rVar.u();
        }
        p076m2.r rVarC = n6.c(rVar);
        n6.i(rVarC, w0VarI, companion.d());
        n6.i(rVarC, e0VarT, companion.f());
        n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
        n6.g(rVarC, companion.a());
        n6.i(rVarC, mVarE, companion.e());
        d1.x xVar = d1.x.f39368a;
        h30.q.p(initialized.getSearchButtonData(), false, null, rVar, 0, 6);
        rVar.x();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 D(mu.g gVar, xy0.e.a.Initialized initialized, boolean z15, int i15, p076m2.r rVar, int i16) {
        z(gVar, initialized, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void E(final xy0.e.a.Initialized initialized, final mu.g<? extends xy0.e.b> gVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(477722211);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(initialized) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(gVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(477722211, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.NewGoogleMapContent (MapScreen.kt:166)");
            }
            Configuration configuration = (Configuration) rVarH.N(AndroidCompositionLocals_androidKt.b());
            final float fN = c5.h.n(configuration.screenHeightDp);
            final float fN2 = c5.h.n(configuration.screenWidthDp);
            Object objE = rVarH.E();
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            if (objE == companion.a()) {
                objE = Function0.i(tq.j.f191408a, rVarH);
                rVarH.v(objE);
            }
            final ju.p0 p0Var = (ju.p0) objE;
            final p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new a(new er.l() { // from class: xy0.r
                @Override // er.l
                public final Object b(Object obj) {
                    return v.F((p049fm.e) obj);
                }
            }), rVarH, 0);
            MapProperties mapProperties = new MapProperties(false, false, initialized.getIsMyLocationEnabled(), false, null, null, null, 0.0f, 0.0f, 507, null);
            MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 755, null);
            er.a<oq.i0> aVarF = initialized.f();
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.p() { // from class: xy0.s
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.G((Context) obj, (GoogleMapOptions) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            rVar2 = rVarH;
            p049fm.b0.h(null, false, eVar, null, null, mapProperties, null, mapUiSettings, null, null, null, aVarF, null, null, null, null, null, (er.p) objE2, y2.m.d(1129764874, true, new er.p() { // from class: xy0.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.H(fN2, fN, initialized, gVar, p0Var, eVar, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (p049fm.e.f65033i << 6) | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 128859);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.u
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.L(initialized, gVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 F(p049fm.e eVar) {
        t04.b bVar = t04.b.f186822a;
        eVar.E(CameraPosition.h(new LatLng(bVar.a().getLatitude(), bVar.a().getLongitude()), 5.5f));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lh.e G(Context context, GoogleMapOptions googleMapOptions) {
        lh.e eVar = new lh.e(context, googleMapOptions);
        eVar.setFocusable(false);
        eVar.setFocusableInTouchMode(false);
        eVar.setDescendantFocusability(393216);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 H(float f15, float f16, final xy0.e.a.Initialized initialized, mu.g gVar, final ju.p0 p0Var, final p049fm.e eVar, p076m2.r rVar, int i15) {
        Object bVar;
        p076m2.r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1129764874, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.NewGoogleMapContent.<anonymous> (MapScreen.kt:202)");
            }
            bm.c cVarP = gm.g.p(rVar, 0);
            dm.a aVarQ = gm.g.q(xy0.b.f222106a.b(), y2.m.d(-36324276, true, new er.q() { // from class: xy0.g
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.I(initialized, (PointPinItem) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVar, 54), 0L, 0L, 0.0f, 0.0f, cVarP, rVar, 54, 60);
            dm.h hVar = aVarQ instanceof dm.h ? (dm.h) aVarQ : null;
            Boolean boolValueOf = Boolean.valueOf((cVarP == null || hVar == null) ? false : true);
            boolean zG = rVar.G(cVarP) | rVar.G(hVar) | rVar.b(f15) | rVar.b(f16) | rVar.G(initialized);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                bVar = new b(cVarP, hVar, f15, f16, initialized, null);
                rVar.v(bVar);
            } else {
                bVar = objE;
            }
            Function0.d(boolValueOf, (er.p) bVar, rVar, r6);
            if (cVarP == null || hVar == null) {
                rVar2 = rVar;
                rVar2.X(1454912056);
            } else {
                rVar.X(1462664939);
                rVar2 = rVar;
                gm.g.g(initialized.b(), cVarP, null, rVar2, 0, 4);
            }
            rVar2.R();
            boolean zG2 = rVar2.G(p0Var) | rVar2.G(eVar);
            Object objE2 = rVar2.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                objE2 = new er.l() { // from class: xy0.h
                    @Override // er.l
                    public final Object b(Object obj) {
                        return v.J(p0Var, eVar, (e.b) obj);
                    }
                };
                rVar2.v(objE2);
            }
            M(gVar, (er.l) objE2, rVar2, 0);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(xy0.e.a.Initialized initialized, PointPinItem pointPinItem, p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-36324276, i15, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.NewGoogleMapContent.<anonymous>.<anonymous> (MapScreen.kt:210)");
        }
        q(initialized.c().b(pointPinItem), rVar, d40.b.C0864b.f39687h);
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(ju.p0 p0Var, p049fm.e eVar, final xy0.e.b bVar) {
        float f15;
        if (!(bVar instanceof xy0.e.b.MoveCamera)) {
            throw new oq.p();
        }
        xy0.e.b.MoveCamera moveCamera = (xy0.e.b.MoveCamera) bVar;
        LatLng coordinates = moveCamera.getCoordinates();
        int i15 = d.f222380b[moveCamera.getType().ordinal()];
        if (i15 == 1) {
            f15 = eVar.t().f31420b;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            f15 = 10.0f;
        }
        Q(p0Var, eVar, coordinates, f15, 0, new er.a() { // from class: xy0.j
            @Override // er.a
            public final Object a() {
                return v.K(bVar);
            }
        }, 16, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(xy0.e.b bVar) {
        er.a<oq.i0> aVarB = ((xy0.e.b.MoveCamera) bVar).b();
        if (aVarB != null) {
            aVarB.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 L(xy0.e.a.Initialized initialized, mu.g gVar, int i15, p076m2.r rVar, int i16) {
        E(initialized, gVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final <T> void M(final mu.g<? extends T> gVar, final er.l<? super T, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(247106951);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(lVar) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(247106951, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.ObserveAsEvents (MapScreen.kt:303)");
            }
            androidx.p016lifecycle.q qVar = (androidx.p016lifecycle.q) rVarH.N(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner());
            androidx.p016lifecycle.j lifecycleRegistry = qVar.getLifecycleRegistry();
            boolean zG = rVarH.G(qVar) | rVarH.G(gVar) | ((i16 & 112) == 32);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new c(qVar, gVar, lVar, null);
                rVarH.v(objE);
            }
            Function0.e(gVar, lifecycleRegistry, (er.p) objE, rVarH, i16 & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.i
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.N(gVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 N(mu.g gVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        M(gVar, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final d2 P(ju.p0 p0Var, p049fm.e eVar, LatLng latLng, float f15, int i15, er.a<oq.i0> aVar) {
        return ju.k.d(p0Var, null, null, new e(eVar, latLng, f15, i15, aVar, null), 3, null);
    }

    static /* synthetic */ d2 Q(ju.p0 p0Var, p049fm.e eVar, LatLng latLng, float f15, int i15, er.a aVar, int i16, Object obj) {
        if ((i16 & 16) != 0) {
            i15 = 500;
        }
        return P(p0Var, eVar, latLng, f15, i15, aVar);
    }

    private static final void q(d40.b.C0864b c0864b, p076m2.r rVar, final int i15) {
        int i16;
        final d40.b.C0864b c0864b2;
        p076m2.r rVarH = rVar.h(-154805791);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(c0864b) : rVarH.G(c0864b) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-154805791, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapItem (MapScreen.kt:263)");
            }
            c0864b2 = c0864b;
            d40.h.f(null, c0864b2, true, rVarH, (d40.b.C0864b.f39687h << 3) | MLKEMEngine.KyberPolyBytes | ((i16 << 3) & 112), 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            c0864b2 = c0864b;
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.k
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.r(c0864b2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 r(d40.b.C0864b c0864b, int i15, p076m2.r rVar, int i16) {
        q(c0864b, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(final zy0.d dVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(514762501);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(dVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(514762501, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapItemCluster (MapScreen.kt:275)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            float f15 = 6;
            int i17 = i16 & 14;
            f3.m mVarC = w0.i.c(androidx.compose.foundation.layout.d.t(a3.n(w0.o.h(companion, c5.h.n(f15), Color.m9copywmQWz5c$default(dVar.a(rVarH, i17), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), l1.h.i()), c5.h.n(f15)), c5.h.n(50)), dVar.a(rVarH, i17), l1.h.i());
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode = Long.hashCode(p076m2.m.b(rVarH, 0));
            p076m2.e0 e0VarT = rVarH.t();
            f3.m mVarE = f3.j.e(rVarH, mVarC);
            androidx.compose.ui.node.c.Companion companion3 = androidx.compose.ui.node.c.INSTANCE;
            er.a<androidx.compose.ui.node.c> aVarB = companion3.b();
            if (rVarH.l() == null) {
                p076m2.m.d();
            }
            rVarH.K();
            if (rVarH.getInserting()) {
                rVarH.H(aVarB);
            } else {
                rVarH.u();
            }
            p076m2.r rVarC = n6.c(rVarH);
            n6.i(rVarC, w0VarI, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            f3.m mVarD = d1.x.f39368a.d(companion, companion2.e());
            Label labelB = mx.b.b(String.valueOf(dVar.b().size()), "clusterSize");
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            rVar2 = rVarH;
            j70.h.g(mVarD, null, labelB, null, null, aVar.a(rVarH, i18).getNeutral().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).q(), null, null, false, true, null, rVar2, 0, 0, 3078, 23592922);
            rVar2.x();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.t(dVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(zy0.d dVar, int i15, p076m2.r rVar, int i16) {
        s(dVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void u(final xy0.e eVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(1528980207);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(eVar) : rVarH.G(eVar) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        int i18 = i16 & 2;
        if (i18 != 0) {
            i17 |= 48;
        } else if ((i15 & 48) == 0) {
            i17 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i17 & 19) != 18, i17 & 1)) {
            if (i18 != 0) {
                z15 = false;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1528980207, i17, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapScreen (MapScreen.kt:69)");
            }
            x(v(m7.b.c(eVar.getState(), null, null, null, rVarH, 0, 7)), eVar.T8(), z15, rVarH, (i17 << 3) & 896);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.w(eVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final xy0.e.a v(f6<? extends xy0.e.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 w(xy0.e eVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        u(eVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    public static final void x(final xy0.e.a aVar, final mu.g<? extends xy0.e.b> gVar, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(411644384);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(aVar) : rVarH.G(aVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(gVar) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(411644384, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapScreenContent (MapScreen.kt:84)");
            }
            if (fr.t.c(aVar, xy0.e.a.C5940a.f222156a)) {
                rVarH.X(453267313);
                c60.b.b(rVarH, 0);
                rVarH.R();
            } else {
                if (!(aVar instanceof xy0.e.a.Initialized)) {
                    rVarH.X(453265977);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(453269290);
                z(gVar, (xy0.e.a.Initialized) aVar, z15, rVarH, (i16 & 896) | ((i16 >> 3) & 14) | ((i16 << 3) & 112));
                rVarH.R();
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.m
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.y(aVar, gVar, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 y(xy0.e.a aVar, mu.g gVar, boolean z15, int i15, p076m2.r rVar, int i16) {
        x(aVar, gVar, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void z(final mu.g<? extends xy0.e.b> gVar, final xy0.e.a.Initialized initialized, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-1327044483);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(gVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.G(initialized) ? 32 : 16;
        }
        if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i16 |= rVarH.a(z15) ? 256 : 128;
        }
        if (rVarH.r((i16 & 147) != 146, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1327044483, i16, -1, "pl.gov.coi.mobywatel.feature.airquality.presentation.screens.map.MapScreenInitialized (MapScreen.kt:100)");
            }
            boolean zG = rVarH.G(initialized);
            Object objE = rVarH.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.p() { // from class: xy0.n
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return v.A(initialized, (androidx.p016lifecycle.q) obj, (androidx.lifecycle.j.a) obj2);
                    }
                };
                rVarH.v(objE);
            }
            t70.s.j((er.p) objE, rVarH, 0);
            i50.s.r(initialized.getBaseScaffoldData(), null, null, 0, k70.a.f108864a.a(rVarH, k70.a.f108865b).getNeutral().c(), null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(-1449044758, true, new er.q() { // from class: xy0.o
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return v.B(z15, initialized, gVar, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVarH, BaseScaffoldData.f89350g, 196608, 32750);
            rVarH = rVarH;
            p088nul.q0.g(false, initialized.e(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: xy0.p
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return v.D(gVar, initialized, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
