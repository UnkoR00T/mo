package qj1;

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
import d1.r3;
import i50.BaseScaffoldData;
import ju.d2;
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
import rj1.SelectableLocationCustomContent;
import tj1.SelectableLocationData;
import tj1.TrainingPointClusterItem;

/* JADX INFO: loaded from: classes7.dex */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007H\u0003¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0003¢\u0006\u0004\b\f\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u000bH\u0003¢\u0006\u0004\b\u000e\u0010\u000f\u001a\u0017\u0010\u0011\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0010H\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u0017\u0010\u0015\u001a\u00020\u00042\u0006\u0010\u0014\u001a\u00020\u0013H\u0003¢\u0006\u0004\b\u0015\u0010\u0016\u001a7\u0010\u001c\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00172\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u00182\u0012\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u001aH\u0003¢\u0006\u0004\b\u001c\u0010\u001d\u001aG\u0010*\u001a\u00020)2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010!\u001a\u00020 2\u0006\u0010#\u001a\u00020\"2\u0006\u0010%\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u00132\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00040'H\u0002¢\u0006\u0004\b*\u0010+¨\u0006.²\u0006\f\u0010-\u001a\u00020,8\nX\u008a\u0084\u0002"}, d2 = {"Lqj1/j;", "viewModel", "", "testMode", "Loq/i0;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Lqj1/j;ZLm2/r;II)V", "Lqj1/j$a$a;", "data", "F", "(Lqj1/j$a$a;Lm2/r;I)V", "Lqj1/j$a$b;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "(Lqj1/j$a$b;ZLm2/r;I)V", "w", "(Lqj1/j$a$b;Lm2/r;I)V", "Ld40/b$b;", "s", "(Ld40/b$b;Lm2/r;I)V", "", "itemsCount", "u", "(ILm2/r;I)V", "T", "Lmu/g;", "flow", "Lkotlin/Function1;", "onEvent", ip.a.f96138c, "(Lmu/g;Ler/l;Lm2/r;I)V", "Lju/p0;", "coroutineScope", "Lfm/e;", "cameraPositionState", "Lcom/google/android/gms/maps/model/LatLng;", "latLng", "", "zoom", "cameraAnimationDurationMs", "Lkotlin/Function0;", "animationFinished", "Lju/d2;", "U", "(Lju/p0;Lfm/e;Lcom/google/android/gms/maps/model/LatLng;FILer/a;)Lju/d2;", "Lqj1/j$a;", "state", "defencetraining_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
public final class d0 {

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class a implements er.a<p049fm.e> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ er.l f166771a;

        public a(er.l lVar) {
            this.f166771a = lVar;
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final p049fm.e a() {
            p049fm.e eVarC = p049fm.e.Companion.c(p049fm.e.INSTANCE, null, 1, null);
            this.f166771a.b(eVarC);
            return eVarC;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166772e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ dm.h<TrainingPointClusterItem> f166773f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ bm.c<TrainingPointClusterItem> f166774g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f166775h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f166776j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ j.a.LocationMap f166777k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ p049fm.e f166778l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(dm.h<TrainingPointClusterItem> hVar, bm.c<TrainingPointClusterItem> cVar, float f15, float f16, j.a.LocationMap locationMap, p049fm.e eVar, tq.e<? super b> eVar2) {
            super(2, eVar2);
            this.f166773f = hVar;
            this.f166774g = cVar;
            this.f166775h = f15;
            this.f166776j = f16;
            this.f166777k = locationMap;
            this.f166778l = eVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(j.a.LocationMap locationMap, p049fm.e eVar, TrainingPointClusterItem trainingPointClusterItem) {
            locationMap.h().B(trainingPointClusterItem, Float.valueOf(eVar.t().f31420b));
            return true;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f166772e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            dm.h<TrainingPointClusterItem> hVar = this.f166773f;
            if (hVar != null) {
                bm.c<TrainingPointClusterItem> cVar = this.f166774g;
                float f15 = this.f166775h;
                float f16 = this.f166776j;
                final j.a.LocationMap locationMap = this.f166777k;
                final p049fm.e eVar = this.f166778l;
                hVar.e0(2);
                if (cVar != null) {
                    cVar.p(hVar);
                    cVar.m(new cm.e((int) f15, (int) f16));
                    cVar.o(new bm.c.e() { // from class: qj1.e0
                        @Override // bm.c.e
                        public final boolean a(bm.b bVar) {
                            return d0.b.O(locationMap, eVar, (TrainingPointClusterItem) bVar);
                        }
                    });
                }
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
            return new b(this.f166773f, this.f166774g, this.f166775h, this.f166776j, this.f166777k, this.f166778l, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166779e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ androidx.p016lifecycle.q f166780f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ mu.g<T> f166781g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ er.l<T, oq.i0> f166782h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f166783e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ mu.g<T> f166784f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l<T, oq.i0> f166785g;

            /* JADX INFO: renamed from: qj1.d0$c$a$a, reason: collision with other inner class name */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
            static final class C4193a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                int f166786e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                final /* synthetic */ mu.g<T> f166787f;

                /* JADX INFO: renamed from: g, reason: collision with root package name */
                final /* synthetic */ er.l<T, oq.i0> f166788g;

                /* JADX INFO: renamed from: qj1.d0$c$a$a$a, reason: collision with other inner class name */
                @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
                static final /* synthetic */ class C4194a implements mu.h, fr.n {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    final /* synthetic */ er.l<T, oq.i0> f166789a;

                    /* JADX WARN: Multi-variable type inference failed */
                    C4194a(er.l<? super T, oq.i0> lVar) {
                        this.f166789a = lVar;
                    }

                    @Override // mu.h
                    public final Object F(T t15, tq.e<? super oq.i0> eVar) {
                        Object objO = C4193a.O(this.f166789a, t15, eVar);
                        return objO == uq.b.e() ? objO : oq.i0.f148189a;
                    }

                    @Override // fr.n
                    public final oq.e<?> b() {
                        return new fr.q(2, this.f166789a, fr.t.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
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
                C4193a(mu.g<? extends T> gVar, er.l<? super T, oq.i0> lVar, tq.e<? super C4193a> eVar) {
                    super(2, eVar);
                    this.f166787f = gVar;
                    this.f166788g = lVar;
                }

                /* JADX INFO: Access modifiers changed from: private */
                public static final /* synthetic */ Object O(er.l lVar, Object obj, tq.e eVar) {
                    lVar.b(obj);
                    return oq.i0.f148189a;
                }

                /* JADX WARN: Type inference incomplete: some casts might be missing */
                /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                    jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type tq.e to qj1.d0$c$a$a for r4v1 'this'  tq.e
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
                        int r1 = r4.f166786e
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
                        mu.g<T> r5 = r4.f166787f
                        er.l<T, oq.i0> r1 = r4.f166788g
                        qj1.d0$c$a$a$a r3 = new qj1.d0$c$a$a$a
                        r3.<init>(r1)
                        r4.f166786e = r2
                        java.lang.Object r5 = r5.a(r3, r4)
                        if (r5 != r0) goto L2c
                        return r0
                    L2c:
                        oq.i0 r5 = oq.i0.f148189a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: qj1.d0.c.a.C4193a.J(java.lang.Object):java.lang.Object");
                }

                @Override // er.p
                /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
                public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                    return ((C4193a) v(p0Var, eVar)).J(oq.i0.f148189a);
                }

                @Override // vq.a
                public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                    return new C4193a(this.f166787f, this.f166788g, eVar);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(mu.g<? extends T> gVar, er.l<? super T, oq.i0> lVar, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f166784f = gVar;
                this.f166785g = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f166783e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    n2 n2VarJ2 = ju.g1.c().j2();
                    C4193a c4193a = new C4193a(this.f166784f, this.f166785g, null);
                    this.f166783e = 1;
                    if (ju.i.g(n2VarJ2, c4193a, this) == objE) {
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
                return new a(this.f166784f, this.f166785g, eVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(androidx.p016lifecycle.q qVar, mu.g<? extends T> gVar, er.l<? super T, oq.i0> lVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f166780f = qVar;
            this.f166781g = gVar;
            this.f166782h = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166779e;
            if (i15 == 0) {
                oq.u.b(obj);
                androidx.p016lifecycle.q qVar = this.f166780f;
                androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.STARTED;
                a aVar = new a(this.f166781g, this.f166782h, null);
                this.f166779e = 1;
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
            return new c(this.f166780f, this.f166781g, this.f166782h, eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f166790a;

        static {
            int[] iArr = new int[qj1.e.values().length];
            try {
                iArr[qj1.e.POINT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[qj1.e.USER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f166790a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f166791e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p049fm.e f166792f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ LatLng f166793g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ float f166794h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ int f166795j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ er.a<oq.i0> f166796k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(p049fm.e eVar, LatLng latLng, float f15, int i15, er.a<oq.i0> aVar, tq.e<? super e> eVar2) {
            super(2, eVar2);
            this.f166792f = eVar;
            this.f166793g = latLng;
            this.f166794h = f15;
            this.f166795j = i15;
            this.f166796k = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f166791e;
            if (i15 == 0) {
                oq.u.b(obj);
                p049fm.e eVar = this.f166792f;
                lh.a aVarA = lh.b.a(CameraPosition.h(this.f166793g, this.f166794h));
                int i16 = this.f166795j;
                this.f166791e = 1;
                if (eVar.n(aVarA, i16, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            this.f166796k.a();
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((e) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f166792f, this.f166793g, this.f166794h, this.f166795j, this.f166796k, eVar);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 A(ju.p0 p0Var, p049fm.e eVar, final j.b bVar) {
        float f15;
        if (!(bVar instanceof j.b.MoveCamera)) {
            throw new oq.p();
        }
        j.b.MoveCamera moveCamera = (j.b.MoveCamera) bVar;
        LatLng coordinates = moveCamera.getCoordinates();
        int i15 = d.f166790a[moveCamera.getType().ordinal()];
        if (i15 == 1) {
            f15 = eVar.t().f31420b;
        } else {
            if (i15 != 2) {
                throw new oq.p();
            }
            f15 = 8.0f;
        }
        V(p0Var, eVar, coordinates, f15, 0, new er.a() { // from class: qj1.q
            @Override // er.a
            public final Object a() {
                return d0.B(bVar);
            }
        }, 16, null);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 B(j.b bVar) {
        er.a<oq.i0> aVarB = ((j.b.MoveCamera) bVar).b();
        if (aVarB != null) {
            aVarB.a();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 C(j.a.LocationMap locationMap, int i15, p076m2.r rVar, int i16) {
        w(locationMap, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final <T> void D(final mu.g<? extends T> gVar, final er.l<? super T, oq.i0> lVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-31189878);
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
                p076m2.t.o(-31189878, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.ObserveAsEvents (TrainingLocationScreen.kt:391)");
            }
            androidx.p016lifecycle.q qVar = (androidx.p016lifecycle.q) rVarH.N(m7.n.c());
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
            d5VarM.a(new er.p() { // from class: qj1.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.E(gVar, lVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 E(mu.g gVar, er.l lVar, int i15, p076m2.r rVar, int i16) {
        D(gVar, lVar, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void F(final j.a.LocationList locationList, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(918930164);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(locationList) : rVarH.G(locationList) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(918930164, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationList (TrainingLocationScreen.kt:101)");
            }
            final f1.y0 y0VarC = f1.b1.c(0, 0, rVarH, 0, 3);
            rVar2 = rVarH;
            i50.s.r(locationList.getBaseScaffoldData(), null, null, 0, 0L, null, y0VarC, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(1374157415, true, new er.q() { // from class: qj1.w
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.G(y0VarC, locationList, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32702);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qj1.x
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.K(locationList, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 G(f1.y0 y0Var, final j.a.LocationList locationList, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1374157415, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationList.<anonymous> (TrainingLocationScreen.kt:108)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            d1.i.n nVarK = d1.i.f39152a.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(companion, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100());
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarQ);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            y30.m.g(locationList.getControllersData(), rVar, y30.n.Switch.f223693f);
            rVar.x();
            d3 d3VarH = a3.h(aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing200());
            boolean zG = rVar.G(locationList);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: qj1.z
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.H(locationList, (f1.q0) obj);
                    }
                };
                rVar.v(objE);
            }
            f1.d.c(null, y0Var, d3VarH, false, null, null, null, false, null, (er.l) objE, rVar, 0, 505);
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
    public static final oq.i0 H(final j.a.LocationList locationList, f1.q0 q0Var) {
        f1.q0.c(q0Var, null, null, y2.m.b(1154659644, true, new er.q() { // from class: qj1.a0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.I(locationList, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        m30.m.h(q0Var, locationList.getNearestCards());
        f1.q0.c(q0Var, null, null, y2.m.b(-965451611, true, new er.q() { // from class: qj1.b0
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return d0.J(locationList, (f1.e) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
            }
        }), 3, null);
        m30.m.h(q0Var, locationList.getRemainingCards());
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 I(j.a.LocationList locationList, f1.e eVar, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1154659644, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrainingLocationScreen.kt:133)");
            }
            if (locationList.getShowTitlesForTwoLists()) {
                rVar2.X(72433287);
                Label nearestTitle = locationList.getNearestTitle();
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                j70.h.g(null, null, nearestTitle, null, null, aVar.a(rVar2, i16).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i16).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(f3.m.INSTANCE, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            } else {
                rVar2.X(66733286);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 J(j.a.LocationList locationList, f1.e eVar, p076m2.r rVar, int i15) {
        p076m2.r rVar2 = rVar;
        if (rVar2.r((i15 & 17) != 16, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-965451611, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationList.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrainingLocationScreen.kt:148)");
            }
            if (locationList.getShowTitlesForTwoLists()) {
                rVar2.X(1627093100);
                f3.m.Companion companion = f3.m.INSTANCE;
                k70.a aVar = k70.a.f108864a;
                int i16 = k70.a.f108865b;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i16).getSpacing300()), rVar2, 0);
                j70.h.g(null, null, locationList.getRemainingTitle(), null, null, aVar.a(rVar2, i16).getNeutral().i(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVar2, i16).p(), null, null, false, false, null, rVar, 0, 0, 0, 33030107);
                rVar2 = rVar;
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar2, i16).getSpacing200()), rVar2, 0);
            } else {
                rVar2.X(1620967965);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2.O();
        }
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 K(j.a.LocationList locationList, int i15, p076m2.r rVar, int i16) {
        F(locationList, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    private static final void L(final j.a.LocationMap locationMap, final boolean z15, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(1135895162);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(locationMap) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if ((i15 & 48) == 0) {
            i16 |= rVarH.a(z15) ? 32 : 16;
        }
        if (rVarH.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1135895162, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationMap (TrainingLocationScreen.kt:172)");
            }
            rVar2 = rVarH;
            i50.s.r(locationMap.getBaseScaffoldData(), null, null, 0, 0L, null, null, false, null, null, null, null, false, 0.0f, 0.0f, y2.m.d(931002285, true, new er.q() { // from class: qj1.u
                @Override // er.q
                public final Object w(Object obj, Object obj2, Object obj3) {
                    return d0.M(locationMap, z15, (d3) obj, (p076m2.r) obj2, ((Integer) obj3).intValue());
                }
            }, rVarH, 54), rVar2, BaseScaffoldData.f89350g, 196608, 32766);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qj1.v
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.O(locationMap, z15, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 M(j.a.LocationMap locationMap, boolean z15, d3 d3Var, p076m2.r rVar, int i15) {
        int i16;
        j.a.LocationMap locationMap2;
        if ((i15 & 6) == 0) {
            i16 = i15 | (rVar.W(d3Var) ? 4 : 2);
        } else {
            i16 = i15;
        }
        if (rVar.r((i16 & 19) != 18, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(931002285, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationMap.<anonymous> (TrainingLocationScreen.kt:176)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            f3.m mVarF = androidx.compose.foundation.layout.d.f(a3.l(companion, d3Var), 0.0f, 1, null);
            d1.i iVar = d1.i.f39152a;
            d1.i.n nVarK = iVar.k();
            f3.c.Companion companion2 = f3.c.INSTANCE;
            p036e4.w0 w0VarA = d1.e0.a(nVarK, companion2.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarF);
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
            n6.i(rVarC, w0VarA, companion3.d());
            n6.i(rVarC, e0VarT, companion3.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion3.c());
            n6.g(rVarC, companion3.a());
            n6.i(rVarC, mVarE, companion3.e());
            d1.i0 i0Var = d1.i0.f39176a;
            k70.a aVar = k70.a.f108864a;
            int i17 = k70.a.f108865b;
            f3.m mVarQ = a3.q(companion, aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100(), aVar.b(rVar, i17).getSpacing200(), aVar.b(rVar, i17).getSpacing100());
            p036e4.w0 w0VarI = d1.r.i(companion2.o(), false);
            int iHashCode2 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT2 = rVar.t();
            f3.m mVarE2 = f3.j.e(rVar, mVarQ);
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
            n6.i(rVarC2, w0VarI, companion3.d());
            n6.i(rVarC2, e0VarT2, companion3.f());
            n6.i(rVarC2, Integer.valueOf(iHashCode2), companion3.c());
            n6.g(rVarC2, companion3.a());
            n6.i(rVarC2, mVarE2, companion3.e());
            d1.x xVar = d1.x.f39368a;
            y30.m.g(locationMap.getControllersData(), rVar, y30.n.Switch.f223693f);
            rVar.x();
            f3.m mVarF2 = androidx.compose.foundation.layout.d.f(w0.i.d(companion, aVar.a(rVar, i17).getNeutral().c(), null, 2, null), 0.0f, 1, null);
            p036e4.w0 w0VarI2 = d1.r.i(companion2.o(), false);
            int iHashCode3 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT3 = rVar.t();
            f3.m mVarE3 = f3.j.e(rVar, mVarF2);
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
            n6.i(rVarC3, w0VarI2, companion3.d());
            n6.i(rVarC3, e0VarT3, companion3.f());
            n6.i(rVarC3, Integer.valueOf(iHashCode3), companion3.c());
            n6.g(rVarC3, companion3.a());
            n6.i(rVarC3, mVarE3, companion3.e());
            if (z15) {
                locationMap2 = locationMap;
                rVar.X(647298536);
            } else {
                rVar.X(654682457);
                locationMap2 = locationMap;
                w(locationMap2, rVar, 0);
            }
            rVar.R();
            f3.m mVarD = xVar.d(a3.n(androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null), aVar.b(rVar, i17).getSpacing200()), companion2.c());
            p036e4.w0 w0VarA2 = d1.e0.a(iVar.k(), companion2.k(), rVar, 0);
            int iHashCode4 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT4 = rVar.t();
            f3.m mVarE4 = f3.j.e(rVar, mVarD);
            er.a<androidx.compose.ui.node.c> aVarB4 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB4);
            } else {
                rVar.u();
            }
            p076m2.r rVarC4 = n6.c(rVar);
            n6.i(rVarC4, w0VarA2, companion3.d());
            n6.i(rVarC4, e0VarT4, companion3.f());
            n6.i(rVarC4, Integer.valueOf(iHashCode4), companion3.c());
            n6.g(rVarC4, companion3.a());
            n6.i(rVarC4, mVarE4, companion3.e());
            f3.m mVarH = androidx.compose.foundation.layout.d.h(companion, 0.0f, 1, null);
            p036e4.w0 w0VarB = m3.b(iVar.f(), companion2.l(), rVar, 6);
            int iHashCode5 = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT5 = rVar.t();
            f3.m mVarE5 = f3.j.e(rVar, mVarH);
            er.a<androidx.compose.ui.node.c> aVarB5 = companion3.b();
            if (rVar.l() == null) {
                p076m2.m.d();
            }
            rVar.K();
            if (rVar.getInserting()) {
                rVar.H(aVarB5);
            } else {
                rVar.u();
            }
            p076m2.r rVarC5 = n6.c(rVar);
            n6.i(rVarC5, w0VarB, companion3.d());
            n6.i(rVarC5, e0VarT5, companion3.f());
            n6.i(rVarC5, Integer.valueOf(iHashCode5), companion3.c());
            n6.g(rVarC5, companion3.a());
            n6.i(rVarC5, mVarE5, companion3.e());
            q3 q3Var = q3.f39261a;
            h30.q.p(locationMap2.getNavigationButtonData(), false, null, rVar, 0, 6);
            rVar.x();
            final SelectableLocationData selectableLocationDetailsData = locationMap2.getSelectableLocationDetailsData();
            if (selectableLocationDetailsData == null) {
                rVar.X(845181085);
                rVar.R();
            } else {
                rVar.X(845181086);
                r3.a(androidx.compose.foundation.layout.d.i(companion, aVar.b(rVar, i17).getSpacing200()), rVar, 0);
                x30.c.c(null, 0.0f, y2.m.d(1524594335, true, new er.p() { // from class: qj1.y
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.N(selectableLocationDetailsData, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVar, 54), rVar, MLKEMEngine.KyberPolyBytes, 3);
                oq.i0 i0Var2 = oq.i0.f148189a;
                rVar.R();
            }
            rVar.x();
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
    public static final oq.i0 N(SelectableLocationData selectableLocationData, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(1524594335, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationMap.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (TrainingLocationScreen.kt:221)");
            }
            f3.m mVarS = t70.i.S(f3.m.INSTANCE, null, rVar, 6, 1);
            p036e4.w0 w0VarA = d1.e0.a(d1.i.f39152a.k(), f3.c.INSTANCE.k(), rVar, 0);
            int iHashCode = Long.hashCode(p076m2.m.b(rVar, 0));
            p076m2.e0 e0VarT = rVar.t();
            f3.m mVarE = f3.j.e(rVar, mVarS);
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
            n6.i(rVarC, w0VarA, companion.d());
            n6.i(rVarC, e0VarT, companion.f());
            n6.i(rVarC, Integer.valueOf(iHashCode), companion.c());
            n6.g(rVarC, companion.a());
            n6.i(rVarC, mVarE, companion.e());
            d1.i0 i0Var = d1.i0.f39176a;
            new SelectableLocationCustomContent(selectableLocationData).a(rVar, 0);
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
    public static final oq.i0 O(j.a.LocationMap locationMap, boolean z15, int i15, p076m2.r rVar, int i16) {
        L(locationMap, z15, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    public static final void P(final j jVar, final boolean z15, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        p076m2.r rVarH = rVar.h(-1166035117);
        if ((i15 & 6) == 0) {
            i17 = ((i15 & 8) == 0 ? rVarH.W(jVar) : rVarH.G(jVar) ? 4 : 2) | i15;
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
                p076m2.t.o(-1166035117, i17, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.TrainingLocationScreen (TrainingLocationScreen.kt:81)");
            }
            f6 f6VarC = m7.b.c(jVar.getState(), null, null, null, rVarH, 0, 7);
            oz.l.b(jVar.a(), rVarH, 0);
            j.a aVarQ = Q(f6VarC);
            if (aVarQ instanceof j.a.LocationMap) {
                rVarH.X(426726363);
                L((j.a.LocationMap) aVarQ, z15, rVarH, i17 & 112);
                rVarH.R();
            } else {
                if (!(aVarQ instanceof j.a.LocationList)) {
                    rVarH.X(426723977);
                    rVarH.R();
                    throw new oq.p();
                }
                rVarH.X(426730452);
                F((j.a.LocationList) aVarQ, rVarH, 0);
                rVarH.R();
            }
            p088nul.q0.g(false, Q(f6VarC).a(), rVarH, 0, 1);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qj1.l
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.R(jVar, z15, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final j.a Q(f6<? extends j.a> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 R(j jVar, boolean z15, int i15, int i16, p076m2.r rVar, int i17) {
        P(jVar, z15, rVar, g4.a(i15 | 1), i16);
        return oq.i0.f148189a;
    }

    private static final d2 U(ju.p0 p0Var, p049fm.e eVar, LatLng latLng, float f15, int i15, er.a<oq.i0> aVar) {
        return ju.k.d(p0Var, null, null, new e(eVar, latLng, f15, i15, aVar, null), 3, null);
    }

    static /* synthetic */ d2 V(ju.p0 p0Var, p049fm.e eVar, LatLng latLng, float f15, int i15, er.a aVar, int i16, Object obj) {
        if ((i16 & 16) != 0) {
            i15 = 500;
        }
        return U(p0Var, eVar, latLng, f15, i15, aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void s(d40.b.C0864b c0864b, p076m2.r rVar, final int i15) {
        int i16;
        final d40.b.C0864b c0864b2;
        p076m2.r rVarH = rVar.h(-205392144);
        if ((i15 & 6) == 0) {
            i16 = ((i15 & 8) == 0 ? rVarH.W(c0864b) : rVarH.G(c0864b) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-205392144, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.MapItem (TrainingLocationScreen.kt:354)");
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
            d5VarM.a(new er.p() { // from class: qj1.t
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.t(c0864b2, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 t(d40.b.C0864b c0864b, int i15, p076m2.r rVar, int i16) {
        s(c0864b, rVar, g4.a(i15 | 1));
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void u(final int i15, p076m2.r rVar, final int i16) {
        int i17;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(-885960524);
        if ((i16 & 6) == 0) {
            i17 = (rVarH.c(i15) ? 4 : 2) | i16;
        } else {
            i17 = i16;
        }
        if (rVarH.r((i17 & 3) != 2, i17 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-885960524, i17, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.MapItemCluster (TrainingLocationScreen.kt:366)");
            }
            f3.m.Companion companion = f3.m.INSTANCE;
            float f15 = 6;
            float fN = c5.h.n(f15);
            k70.a aVar = k70.a.f108864a;
            int i18 = k70.a.f108865b;
            f3.m mVarC = w0.i.c(androidx.compose.foundation.layout.d.t(a3.n(w0.o.h(companion, fN, Color.m9copywmQWz5c$default(aVar.a(rVarH, i18).getBase().getPrimary(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), l1.h.i()), c5.h.n(f15)), c5.h.n(50)), aVar.a(rVarH, i18).getBase().getPrimary(), l1.h.i());
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
            rVar2 = rVarH;
            j70.h.g(d1.x.f39368a.d(companion, companion2.e()), null, mx.b.b(String.valueOf(i15), "clusterSize"), null, null, aVar.a(rVarH, i18).getNeutral().c(), 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, aVar.f(rVarH, i18).q(), null, null, false, true, null, rVar2, 0, 0, 3072, 24641498);
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
            d5VarM.a(new er.p() { // from class: qj1.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.v(i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v(int i15, int i16, p076m2.r rVar, int i17) {
        u(i15, rVar, g4.a(i16 | 1));
        return oq.i0.f148189a;
    }

    private static final void w(final j.a.LocationMap locationMap, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVar2;
        p076m2.r rVarH = rVar.h(917008653);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(locationMap) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(917008653, i16, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.NewGoogleMapContent (TrainingLocationScreen.kt:241)");
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
            final p049fm.e eVar = (p049fm.e) b3.f.i(new Object[0], p049fm.e.INSTANCE.a(), new a(new er.l() { // from class: qj1.c0
                @Override // er.l
                public final Object b(Object obj) {
                    return d0.x(locationMap, (p049fm.e) obj);
                }
            }), rVarH, 0);
            MapProperties mapProperties = new MapProperties(false, false, locationMap.getIsMyLocationEnabled(), false, null, null, null, 0.0f, 0.0f, 507, null);
            MapUiSettings mapUiSettings = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 755, null);
            Object objE2 = rVarH.E();
            if (objE2 == companion.a()) {
                objE2 = new er.p() { // from class: qj1.m
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return d0.y((Context) obj, (GoogleMapOptions) obj2);
                    }
                };
                rVarH.v(objE2);
            }
            rVar2 = rVarH;
            p049fm.b0.h(null, false, eVar, null, null, mapProperties, null, mapUiSettings, null, null, null, null, null, null, null, null, null, (er.p) objE2, y2.m.d(-1638749964, true, new er.p() { // from class: qj1.n
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.z(locationMap, p0Var, eVar, fN2, fN, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            }, rVarH, 54), rVar2, (p049fm.e.f65033i << 6) | (MapProperties.f65356j << 15) | (MapUiSettings.f65123k << 21), 113246208, 130907);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar2 = rVarH;
            rVar2.O();
        }
        d5 d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: qj1.o
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return d0.C(locationMap, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 x(j.a.LocationMap locationMap, p049fm.e eVar) {
        CameraPosition cameraPositionH;
        boolean z15 = locationMap.getInitialMapPosition() == null;
        if (z15) {
            t04.b bVar = t04.b.f186822a;
            cameraPositionH = CameraPosition.h(new LatLng(bVar.a().getLatitude(), bVar.a().getLongitude()), 5.5f);
        } else {
            if (z15) {
                throw new oq.p();
            }
            cameraPositionH = CameraPosition.h(new LatLng(locationMap.getInitialMapPosition().getCoordinates().getLatitude(), locationMap.getInitialMapPosition().getCoordinates().getLongitude()), locationMap.getInitialMapPosition().getZoom());
        }
        eVar.E(cameraPositionH);
        return oq.i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final lh.e y(Context context, GoogleMapOptions googleMapOptions) {
        lh.e eVar = new lh.e(context, googleMapOptions);
        eVar.setFocusable(false);
        eVar.setFocusableInTouchMode(false);
        eVar.setDescendantFocusability(393216);
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 z(j.a.LocationMap locationMap, final ju.p0 p0Var, final p049fm.e eVar, float f15, float f16, p076m2.r rVar, int i15) {
        p076m2.r rVar2;
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1638749964, i15, -1, "pl.gov.coi.mobywatel.feature.defencetraining.presentation.newregistration.traininglocation.NewGoogleMapContent.<anonymous> (TrainingLocationScreen.kt:286)");
            }
            mu.g<j.b> gVarF = locationMap.f();
            boolean zG = rVar.G(p0Var) | rVar.G(eVar);
            Object objE = rVar.E();
            if (zG || objE == p076m2.r.INSTANCE.a()) {
                objE = new er.l() { // from class: qj1.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return d0.A(p0Var, eVar, (j.b) obj);
                    }
                };
                rVar.v(objE);
            }
            D(gVarF, (er.l) objE, rVar, 0);
            bm.c cVarP = gm.g.p(rVar, 0);
            qj1.c cVar = qj1.c.f166739a;
            dm.a aVarQ = gm.g.q(cVar.c(), cVar.d(), 0L, 0L, 0.0f, 0.0f, cVarP, rVar, 54, 60);
            dm.h hVar = aVarQ instanceof dm.h ? (dm.h) aVarQ : null;
            boolean zG2 = rVar.G(hVar) | rVar.G(cVarP) | rVar.b(f15) | rVar.b(f16) | rVar.G(locationMap) | rVar.G(eVar);
            Object objE2 = rVar.E();
            if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                b bVar = new b(hVar, cVarP, f15, f16, locationMap, eVar, null);
                rVar.v(bVar);
                objE2 = bVar;
            }
            Function0.e(cVarP, hVar, (er.p) objE2, rVar, 0);
            if (cVarP == null || hVar == null) {
                rVar2 = rVar;
                rVar2.X(883166030);
            } else {
                rVar.X(894905854);
                rVar2 = rVar;
                gm.g.g(locationMap.c(), cVarP, null, rVar2, 0, 4);
            }
            rVar2.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return oq.i0.f148189a;
    }
}
