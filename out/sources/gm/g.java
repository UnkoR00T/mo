package gm;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import ju.p0;
import ju.z0;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import p049fm.Function1;
import p049fm.t1;
import p049fm.v1;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.b4;
import p076m2.c6;
import p076m2.d0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import p076m2.r0;
import p076m2.s0;
import p076m2.x5;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0002\u001aK\u0010\t\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\r\u001a\u00020\u0007\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000bH\u0001¢\u0006\u0004\b\r\u0010\u000e\u001a\u008b\u0001\u0010\u0018\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000b\"\b\b\u0000\u0010\u0001*\u00020\u00002\u001a\u0010\u0010\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000f\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\b\b\u0002\u0010\u0013\u001a\u00020\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0018\u0010\u0019\u001a!\u0010\u001a\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0004\"\b\b\u0000\u0010\u0001*\u00020\u0000H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u00072\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0003¢\u0006\u0004\b\u001c\u0010\u001d\"\u001d\u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006'²\u0006\u001c\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00000%\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lbm/b;", "T", "", "items", "Lbm/c;", "clusterManager", "Lkotlin/Function1;", "Loq/i0;", "clusterItemDecoration", "g", "(Ljava/util/Collection;Lbm/c;Ler/q;Lm2/r;II)V", "Ldm/a;", "renderer", "f", "(Ljava/util/Collection;Lbm/c;Ler/q;Ldm/a;Lm2/r;II)V", "Lbm/a;", "clusterContent", "clusterItemContent", "Lm3/e;", "clusterContentAnchor", "clusterItemContentAnchor", "", "clusterContentZIndex", "clusterItemContentZIndex", "q", "(Ler/q;Ler/q;JJFFLbm/c;Lm2/r;II)Ldm/a;", "p", "(Lm2/r;I)Lbm/c;", "m", "(Lbm/c;Lm2/r;I)V", "Lm2/b4;", "Lgm/k;", "a", "Lm2/b4;", "o", "()Lm2/b4;", "LocalClusteringMarkerProperties", "", "unclusteredItems", "maps-compose-utils_release"}, k = 2, mv = {2, 3, 0}, xi = 48)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<gm.k> f73718a = d0.j(new er.a() { // from class: gm.b
        @Override // er.a
        public final Object a() {
            return g.l();
        }
    });

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class a extends fr.q implements er.l<nh.h, Boolean> {
        a(Object obj) {
            super(1, obj, em.b.class, "onMarkerClick", "onMarkerClick(Lcom/google/android/gms/maps/model/Marker;)Z", 0);
        }

        @Override // er.l
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Boolean b(nh.h hVar) {
            return Boolean.valueOf(((em.b) this.f66391b).d(hVar));
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class b extends fr.q implements er.l<nh.h, i0> {
        b(Object obj) {
            super(1, obj, em.b.class, "onInfoWindowClick", "onInfoWindowClick(Lcom/google/android/gms/maps/model/Marker;)V", 0);
        }

        public final void E(nh.h hVar) {
            ((em.b) this.f66391b).f(hVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(nh.h hVar) {
            E(hVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class c extends fr.q implements er.l<nh.h, i0> {
        c(Object obj) {
            super(1, obj, em.b.class, "onInfoWindowLongClick", "onInfoWindowLongClick(Lcom/google/android/gms/maps/model/Marker;)V", 0);
        }

        public final void E(nh.h hVar) {
            ((em.b) this.f66391b).g(hVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(nh.h hVar) {
            E(hVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class d extends fr.q implements er.l<nh.h, i0> {
        d(Object obj) {
            super(1, obj, em.b.class, "onMarkerDrag", "onMarkerDrag(Lcom/google/android/gms/maps/model/Marker;)V", 0);
        }

        public final void E(nh.h hVar) {
            ((em.b) this.f66391b).h(hVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(nh.h hVar) {
            E(hVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class e extends fr.q implements er.l<nh.h, i0> {
        e(Object obj) {
            super(1, obj, em.b.class, "onMarkerDragEnd", "onMarkerDragEnd(Lcom/google/android/gms/maps/model/Marker;)V", 0);
        }

        public final void E(nh.h hVar) {
            ((em.b) this.f66391b).c(hVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(nh.h hVar) {
            E(hVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
    static final /* synthetic */ class f extends fr.q implements er.l<nh.h, i0> {
        f(Object obj) {
            super(1, obj, em.b.class, "onMarkerDragStart", "onMarkerDragStart(Lcom/google/android/gms/maps/model/Marker;)V", 0);
        }

        public final void E(nh.h hVar) {
            ((em.b) this.f66391b).a(hVar);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(nh.h hVar) {
            E(hVar);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: gm.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
    static final class C1694g extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73719e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ p049fm.e f73720f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ bm.c<T> f73721g;

        /* JADX INFO: renamed from: gm.g$g$a */
        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ bm.c<T> f73722a;

            a(bm.c<T> cVar) {
                this.f73722a = cVar;
            }

            @Override // mu.h
            public /* bridge */ /* synthetic */ Object F(Object obj, tq.e eVar) {
                return a(((Boolean) obj).booleanValue(), eVar);
            }

            public final Object a(boolean z15, tq.e<? super i0> eVar) {
                if (!z15) {
                    this.f73722a.a();
                }
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1694g(p049fm.e eVar, bm.c<T> cVar, tq.e<? super C1694g> eVar2) {
            super(2, eVar2);
            this.f73720f = eVar;
            this.f73721g = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean O(p049fm.e eVar) {
            return eVar.v();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73719e;
            if (i15 == 0) {
                oq.u.b(obj);
                final p049fm.e eVar = this.f73720f;
                mu.g gVarQ = x5.q(new er.a() { // from class: gm.h
                    @Override // er.a
                    public final Object a() {
                        return Boolean.valueOf(g.C1694g.O(eVar));
                    }
                });
                a aVar = new a(this.f73721g);
                this.f73719e = 1;
                if (gVarQ.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((C1694g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new C1694g(this.f73720f, this.f73721g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
    static final class h extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73723e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ f6<Collection<T>> f73724f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ bm.c<T> f73725g;

        @Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
        static final class a<T> implements mu.h {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ bm.c<T> f73726a;

            a(bm.c<T> cVar) {
                this.f73726a = cVar;
            }

            @Override // mu.h
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object F(List<? extends T> list, tq.e<? super i0> eVar) {
                this.f73726a.e();
                this.f73726a.c(list);
                this.f73726a.g();
                return i0.f148189a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        h(f6<? extends Collection<? extends T>> f6Var, bm.c<T> cVar, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f73724f = f6Var;
            this.f73725g = cVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List O(f6 f6Var) {
            return pq.v.f1((Iterable) f6Var.getValue());
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73723e;
            if (i15 == 0) {
                oq.u.b(obj);
                final f6<Collection<T>> f6Var = this.f73724f;
                mu.g gVarQ = x5.q(new er.a() { // from class: gm.i
                    @Override // er.a
                    public final Object a() {
                        return g.h.O(f6Var);
                    }
                });
                a aVar = new a(this.f73725g);
                this.f73723e = 1;
                if (gVarQ.a(aVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new h(this.f73724f, this.f73725g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"gm/g$i", "Lm2/r0;", "Loq/i0;", "j", "()V", "runtime"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class i implements r0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ bm.c f73727a;

        public i(bm.c cVar) {
            this.f73727a = cVar;
        }

        @Override // p076m2.r0
        public void j() {
            this.f73727a.e();
            this.f73727a.g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
    static final class j extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73728e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f73729f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(er.a<i0> aVar, tq.e<? super j> eVar) {
            super(2, eVar);
            this.f73729f = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void O(er.a aVar) {
            aVar.a();
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f73728e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            Handler handler = new Handler(Looper.getMainLooper());
            final er.a<i0> aVar = this.f73729f;
            handler.post(new Runnable() { // from class: gm.j
                @Override // java.lang.Runnable
                public final void run() {
                    g.j.O(aVar);
                }
            });
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new j(this.f73729f, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Llh/c;", "map", "Loq/i0;", "<anonymous>", "(Lju/p0;Llh/c;)V"}, k = 3, mv = {2, 3, 0})
    static final class k extends vq.k implements er.q<p0, lh.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73730e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f73731f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ a3<bm.c<T>> f73732g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Context f73733h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(a3<bm.c<T>> a3Var, Context context, tq.e<? super k> eVar) {
            super(3, eVar);
            this.f73732g = a3Var;
            this.f73733h = context;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            lh.c cVar = (lh.c) this.f73731f;
            uq.b.e();
            if (this.f73730e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            this.f73732g.setValue((bm.c<T>) new bm.c(this.f73733h, cVar));
            return i0.f148189a;
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p0 p0Var, lh.c cVar, tq.e<? super i0> eVar) {
            k kVar = new k(this.f73732g, this.f73733h, eVar);
            kVar.f73731f = cVar;
            return kVar.J(i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Llh/c;", "map", "Loq/i0;", "<anonymous>", "(Lju/p0;Llh/c;)V"}, k = 3, mv = {2, 3, 0})
    static final class l extends vq.k implements er.q<p0, lh.c, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f73734e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f73735f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f73736g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f73737h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ Context f73738j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ bm.c<T> f73739k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ f6<p049fm.r> f73740l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        final /* synthetic */ f6<er.q<bm.a<T>, p076m2.r, Integer, i0>> f73741m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        final /* synthetic */ f6<er.q<T, p076m2.r, Integer, i0>> f73742n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final /* synthetic */ f6<m3.e> f73743p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final /* synthetic */ f6<m3.e> f73744q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        final /* synthetic */ f6<Float> f73745r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        final /* synthetic */ f6<Float> f73746s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        final /* synthetic */ a3<dm.a<T>> f73747t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(Context context, bm.c<T> cVar, f6<? extends p049fm.r> f6Var, f6<? extends er.q<? super bm.a<T>, ? super p076m2.r, ? super Integer, i0>> f6Var2, f6<? extends er.q<? super T, ? super p076m2.r, ? super Integer, i0>> f6Var3, f6<m3.e> f6Var4, f6<m3.e> f6Var5, f6<Float> f6Var6, f6<Float> f6Var7, a3<dm.a<T>> a3Var, tq.e<? super l> eVar) {
            super(3, eVar);
            this.f73738j = context;
            this.f73739k = cVar;
            this.f73740l = f6Var;
            this.f73741m = f6Var2;
            this.f73742n = f6Var3;
            this.f73743p = f6Var4;
            this.f73744q = f6Var5;
            this.f73745r = f6Var6;
            this.f73746s = f6Var7;
            this.f73747t = a3Var;
        }

        /* JADX WARN: Type inference incomplete: some casts might be missing */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            p0 p0Var = (p0) this.f73736g;
            lh.c cVar = (lh.c) this.f73737h;
            Object objE = uq.b.e();
            int i15 = this.f73735f;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = new w(this.f73738j, p0Var, cVar, this.f73739k, this.f73740l, this.f73741m, this.f73742n, this.f73743p, this.f73744q, this.f73745r, this.f73746s);
                this.f73747t.setValue(wVar);
                this.f73736g = vq.j.a(p0Var);
                this.f73737h = vq.j.a(cVar);
                this.f73734e = vq.j.a(wVar);
                this.f73735f = 1;
                if (z0.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            throw new oq.g();
        }

        @Override // er.q
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object w(p0 p0Var, lh.c cVar, tq.e<? super i0> eVar) {
            l lVar = new l(this.f73738j, this.f73739k, this.f73740l, this.f73741m, this.f73742n, this.f73743p, this.f73744q, this.f73745r, this.f73746s, this.f73747t, eVar);
            lVar.f73736g = p0Var;
            lVar.f73737h = cVar;
            return lVar.J(i0.f148189a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0204  */
    /* JADX WARN: Code duplicated, block: B:102:0x0209  */
    /* JADX WARN: Code duplicated, block: B:105:0x020f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0213  */
    /* JADX WARN: Code duplicated, block: B:108:0x0216  */
    /* JADX WARN: Code duplicated, block: B:109:0x021b  */
    /* JADX WARN: Code duplicated, block: B:111:0x021e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0230  */
    /* JADX WARN: Code duplicated, block: B:116:0x0244  */
    /* JADX WARN: Code duplicated, block: B:120:0x025b A[LOOP:0: B:118:0x0255->B:120:0x025b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:123:0x0275  */
    /* JADX WARN: Code duplicated, block: B:125:0x027c  */
    /* JADX WARN: Code duplicated, block: B:128:0x0288  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x006e  */
    /* JADX WARN: Code duplicated, block: B:45:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:68:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:71:0x0111  */
    /* JADX WARN: Code duplicated, block: B:73:0x0119  */
    /* JADX WARN: Code duplicated, block: B:76:0x0133  */
    /* JADX WARN: Code duplicated, block: B:78:0x013b  */
    /* JADX WARN: Code duplicated, block: B:81:0x0155  */
    /* JADX WARN: Code duplicated, block: B:83:0x015d  */
    /* JADX WARN: Code duplicated, block: B:86:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:88:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:91:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:96:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:98:0x01f5  */
    public static final <T extends bm.b> void f(final Collection<? extends T> collection, final bm.c<T> cVar, er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar, dm.a<T> aVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        er.q qVar2;
        int i18;
        dm.a<T> aVar2;
        int i19;
        boolean z15;
        p076m2.r rVar2;
        final er.q qVar3;
        final dm.a<T> aVar3;
        d5 d5VarM;
        er.q qVarG;
        dm.a<T> aVar4;
        int i25;
        em.b bVarK;
        boolean zG;
        Object objE;
        em.b bVarK2;
        boolean zG2;
        Object objE2;
        em.b bVarK3;
        boolean zG3;
        Object objE3;
        em.b bVarK4;
        boolean zG4;
        Object objE4;
        em.b bVarK5;
        boolean zG5;
        Object objE5;
        em.b bVarK6;
        boolean zG6;
        Object objE6;
        er.q qVar4;
        p049fm.e eVarC;
        boolean zG7;
        Object objE7;
        f6 f6VarP;
        boolean zW;
        Object objE8;
        boolean zG8;
        Object objE9;
        dm.a<T> aVarL;
        gm.a aVar5;
        f6<Set<T>> f6VarC;
        Iterator it;
        Object objE10;
        p076m2.r rVarH = rVar.h(274351384);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(collection) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(cVar) ? 32 : 16;
        }
        int i26 = i16 & 4;
        if (i26 == 0) {
            if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
                qVar2 = qVar;
                i17 |= rVarH.G(qVar2) ? 256 : 128;
            }
            i18 = i16 & 8;
            if (i18 != 0) {
                if ((i15 & 3072) == 0) {
                    aVar2 = aVar;
                    if (rVarH.G(aVar2)) {
                        i19 = 2048;
                    } else {
                        i19 = 1024;
                    }
                    i17 |= i19;
                }
                if ((i17 & 1171) != 1170) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if (rVarH.r(z15, i17 & 1)) {
                    if (i26 != 0) {
                        qVarG = q.f73753a.g();
                    } else {
                        qVarG = qVar2;
                    }
                    if (i18 != 0) {
                        aVar4 = null;
                    } else {
                        aVar4 = aVar2;
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.o(274351384, i17, -1, "com.google.maps.android.compose.clustering.Clustering (Clustering.kt:322)");
                    }
                    i25 = i17 >> 3;
                    m(cVar, rVarH, i25 & 14);
                    bVarK = cVar.k();
                    zG = rVarH.G(bVarK);
                    objE = rVarH.E();
                    if (zG || objE == p076m2.r.INSTANCE.a()) {
                        objE = new a(bVarK);
                        rVarH.v(objE);
                    }
                    er.l lVar = (er.l) ((mr.g) objE);
                    bVarK2 = cVar.k();
                    zG2 = rVarH.G(bVarK2);
                    objE2 = rVarH.E();
                    if (zG2 || objE2 == p076m2.r.INSTANCE.a()) {
                        objE2 = new b(bVarK2);
                        rVarH.v(objE2);
                    }
                    er.l lVar2 = (er.l) ((mr.g) objE2);
                    bVarK3 = cVar.k();
                    zG3 = rVarH.G(bVarK3);
                    objE3 = rVarH.E();
                    if (zG3 || objE3 == p076m2.r.INSTANCE.a()) {
                        objE3 = new c(bVarK3);
                        rVarH.v(objE3);
                    }
                    er.l lVar3 = (er.l) ((mr.g) objE3);
                    bVarK4 = cVar.k();
                    zG4 = rVarH.G(bVarK4);
                    objE4 = rVarH.E();
                    if (zG4 || objE4 == p076m2.r.INSTANCE.a()) {
                        objE4 = new d(bVarK4);
                        rVarH.v(objE4);
                    }
                    er.l lVar4 = (er.l) ((mr.g) objE4);
                    bVarK5 = cVar.k();
                    zG5 = rVarH.G(bVarK5);
                    objE5 = rVarH.E();
                    if (zG5 || objE5 == p076m2.r.INSTANCE.a()) {
                        objE5 = new e(bVarK5);
                        rVarH.v(objE5);
                    }
                    er.l lVar5 = (er.l) ((mr.g) objE5);
                    bVarK6 = cVar.k();
                    zG6 = rVarH.G(bVarK6);
                    objE6 = rVarH.E();
                    if (zG6 || objE6 == p076m2.r.INSTANCE.a()) {
                        objE6 = new f(bVarK6);
                        rVarH.v(objE6);
                    }
                    qVar4 = qVarG;
                    Function1.n(null, null, null, null, lVar, lVar2, null, lVar3, lVar4, lVar5, (er.l) ((mr.g) objE6), rVarH, 0, 0, 79);
                    rVar2 = rVarH;
                    eVarC = p049fm.i.c(rVar2, 0);
                    zG7 = rVar2.G(eVarC) | rVar2.G(cVar);
                    objE7 = rVar2.E();
                    if (zG7 || objE7 == p076m2.r.INSTANCE.a()) {
                        objE7 = new C1694g(eVarC, cVar, null);
                        rVar2.v(objE7);
                    }
                    Function0.d(eVarC, (er.p) objE7, rVar2, p049fm.e.f65033i);
                    f6VarP = x5.p(collection, rVar2, i17 & 14);
                    zW = rVar2.W(f6VarP) | rVar2.G(cVar);
                    objE8 = rVar2.E();
                    if (zW || objE8 == p076m2.r.INSTANCE.a()) {
                        objE8 = new h(f6VarP, cVar, null);
                        rVar2.v(objE8);
                    }
                    Function0.d(f6VarP, (er.p) objE8, rVar2, 0);
                    zG8 = rVar2.G(cVar);
                    objE9 = rVar2.E();
                    if (zG8 || objE9 == p076m2.r.INSTANCE.a()) {
                        objE9 = new er.l() { // from class: gm.d
                            @Override // er.l
                            public final Object b(Object obj) {
                                return g.k(cVar, (s0) obj);
                            }
                        };
                        rVar2.v(objE9);
                    }
                    Function0.a(f6VarP, (er.l) objE9, rVar2, 0);
                    if (aVar4 == null) {
                        aVarL = cVar.l();
                    } else {
                        aVarL = aVar4;
                    }
                    if (aVarL instanceof gm.a) {
                        aVar5 = (gm.a) aVarL;
                    } else {
                        aVar5 = null;
                    }
                    if (aVar5 != null) {
                        f6VarC = aVar5.c();
                    } else {
                        f6VarC = null;
                    }
                    if (f6VarC == null) {
                        rVar2.X(-119020733);
                        objE10 = rVar2.E();
                        if (objE10 == p076m2.r.INSTANCE.a()) {
                            objE10 = c6.e(e1.e(), null, 2, null);
                            rVar2.v(objE10);
                        }
                        f6VarC = (a3) objE10;
                    } else {
                        rVar2.X(1658726189);
                    }
                    rVar2.R();
                    it = i(f6VarC).iterator();
                    while (it.hasNext()) {
                        qVar4.w((bm.b) it.next(), rVar2, Integer.valueOf(i25 & 112));
                    }
                    if (p076m2.t.k()) {
                        p076m2.t.n();
                    }
                    qVar3 = qVar4;
                    aVar3 = aVar4;
                } else {
                    rVar2 = rVarH;
                    rVar2.O();
                    qVar3 = qVar2;
                    aVar3 = aVar2;
                }
                d5VarM = rVar2.m();
                if (d5VarM != null) {
                    d5VarM.a(new er.p() { // from class: gm.e
                        @Override // er.p
                        public final Object B(Object obj, Object obj2) {
                            return g.j(collection, cVar, qVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i17 |= 3072;
            aVar2 = aVar;
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    qVarG = q.f73753a.g();
                } else {
                    qVarG = qVar2;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(274351384, i17, -1, "com.google.maps.android.compose.clustering.Clustering (Clustering.kt:322)");
                }
                i25 = i17 >> 3;
                m(cVar, rVarH, i25 & 14);
                bVarK = cVar.k();
                zG = rVarH.G(bVarK);
                objE = rVarH.E();
                if (zG) {
                    objE = new a(bVarK);
                    rVarH.v(objE);
                } else {
                    objE = new a(bVarK);
                    rVarH.v(objE);
                }
                er.l lVar6 = (er.l) ((mr.g) objE);
                bVarK2 = cVar.k();
                zG2 = rVarH.G(bVarK2);
                objE2 = rVarH.E();
                if (zG2) {
                    objE2 = new b(bVarK2);
                    rVarH.v(objE2);
                } else {
                    objE2 = new b(bVarK2);
                    rVarH.v(objE2);
                }
                er.l lVar7 = (er.l) ((mr.g) objE2);
                bVarK3 = cVar.k();
                zG3 = rVarH.G(bVarK3);
                objE3 = rVarH.E();
                if (zG3) {
                    objE3 = new c(bVarK3);
                    rVarH.v(objE3);
                } else {
                    objE3 = new c(bVarK3);
                    rVarH.v(objE3);
                }
                er.l lVar8 = (er.l) ((mr.g) objE3);
                bVarK4 = cVar.k();
                zG4 = rVarH.G(bVarK4);
                objE4 = rVarH.E();
                if (zG4) {
                    objE4 = new d(bVarK4);
                    rVarH.v(objE4);
                } else {
                    objE4 = new d(bVarK4);
                    rVarH.v(objE4);
                }
                er.l lVar9 = (er.l) ((mr.g) objE4);
                bVarK5 = cVar.k();
                zG5 = rVarH.G(bVarK5);
                objE5 = rVarH.E();
                if (zG5) {
                    objE5 = new e(bVarK5);
                    rVarH.v(objE5);
                } else {
                    objE5 = new e(bVarK5);
                    rVarH.v(objE5);
                }
                er.l lVar10 = (er.l) ((mr.g) objE5);
                bVarK6 = cVar.k();
                zG6 = rVarH.G(bVarK6);
                objE6 = rVarH.E();
                if (zG6) {
                    objE6 = new f(bVarK6);
                    rVarH.v(objE6);
                } else {
                    objE6 = new f(bVarK6);
                    rVarH.v(objE6);
                }
                qVar4 = qVarG;
                Function1.n(null, null, null, null, lVar6, lVar7, null, lVar8, lVar9, lVar10, (er.l) ((mr.g) objE6), rVarH, 0, 0, 79);
                rVar2 = rVarH;
                eVarC = p049fm.i.c(rVar2, 0);
                zG7 = rVar2.G(eVarC) | rVar2.G(cVar);
                objE7 = rVar2.E();
                if (zG7) {
                    objE7 = new C1694g(eVarC, cVar, null);
                    rVar2.v(objE7);
                } else {
                    objE7 = new C1694g(eVarC, cVar, null);
                    rVar2.v(objE7);
                }
                Function0.d(eVarC, (er.p) objE7, rVar2, p049fm.e.f65033i);
                f6VarP = x5.p(collection, rVar2, i17 & 14);
                zW = rVar2.W(f6VarP) | rVar2.G(cVar);
                objE8 = rVar2.E();
                if (zW) {
                    objE8 = new h(f6VarP, cVar, null);
                    rVar2.v(objE8);
                } else {
                    objE8 = new h(f6VarP, cVar, null);
                    rVar2.v(objE8);
                }
                Function0.d(f6VarP, (er.p) objE8, rVar2, 0);
                zG8 = rVar2.G(cVar);
                objE9 = rVar2.E();
                if (zG8) {
                    objE9 = new er.l() { // from class: gm.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(cVar, (s0) obj);
                        }
                    };
                    rVar2.v(objE9);
                } else {
                    objE9 = new er.l() { // from class: gm.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(cVar, (s0) obj);
                        }
                    };
                    rVar2.v(objE9);
                }
                Function0.a(f6VarP, (er.l) objE9, rVar2, 0);
                if (aVar4 == null) {
                    aVarL = cVar.l();
                } else {
                    aVarL = aVar4;
                }
                if (aVarL instanceof gm.a) {
                    aVar5 = (gm.a) aVarL;
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    f6VarC = aVar5.c();
                } else {
                    f6VarC = null;
                }
                if (f6VarC == null) {
                    rVar2.X(-119020733);
                    objE10 = rVar2.E();
                    if (objE10 == p076m2.r.INSTANCE.a()) {
                        objE10 = c6.e(e1.e(), null, 2, null);
                        rVar2.v(objE10);
                    }
                    f6VarC = (a3) objE10;
                } else {
                    rVar2.X(1658726189);
                }
                rVar2.R();
                it = i(f6VarC).iterator();
                while (it.hasNext()) {
                    qVar4.w((bm.b) it.next(), rVar2, Integer.valueOf(i25 & 112));
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                qVar3 = qVar4;
                aVar3 = aVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                qVar3 = qVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: gm.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.j(collection, cVar, qVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= MLKEMEngine.KyberPolyBytes;
        qVar2 = qVar;
        i18 = i16 & 8;
        if (i18 != 0) {
            if ((i15 & 3072) == 0) {
                aVar2 = aVar;
                if (rVarH.G(aVar2)) {
                    i19 = 2048;
                } else {
                    i19 = 1024;
                }
                i17 |= i19;
            }
            if ((i17 & 1171) != 1170) {
                z15 = true;
            } else {
                z15 = false;
            }
            if (rVarH.r(z15, i17 & 1)) {
                if (i26 != 0) {
                    qVarG = q.f73753a.g();
                } else {
                    qVarG = qVar2;
                }
                if (i18 != 0) {
                    aVar4 = null;
                } else {
                    aVar4 = aVar2;
                }
                if (p076m2.t.k()) {
                    p076m2.t.o(274351384, i17, -1, "com.google.maps.android.compose.clustering.Clustering (Clustering.kt:322)");
                }
                i25 = i17 >> 3;
                m(cVar, rVarH, i25 & 14);
                bVarK = cVar.k();
                zG = rVarH.G(bVarK);
                objE = rVarH.E();
                if (zG) {
                    objE = new a(bVarK);
                    rVarH.v(objE);
                } else {
                    objE = new a(bVarK);
                    rVarH.v(objE);
                }
                er.l lVar11 = (er.l) ((mr.g) objE);
                bVarK2 = cVar.k();
                zG2 = rVarH.G(bVarK2);
                objE2 = rVarH.E();
                if (zG2) {
                    objE2 = new b(bVarK2);
                    rVarH.v(objE2);
                } else {
                    objE2 = new b(bVarK2);
                    rVarH.v(objE2);
                }
                er.l lVar12 = (er.l) ((mr.g) objE2);
                bVarK3 = cVar.k();
                zG3 = rVarH.G(bVarK3);
                objE3 = rVarH.E();
                if (zG3) {
                    objE3 = new c(bVarK3);
                    rVarH.v(objE3);
                } else {
                    objE3 = new c(bVarK3);
                    rVarH.v(objE3);
                }
                er.l lVar13 = (er.l) ((mr.g) objE3);
                bVarK4 = cVar.k();
                zG4 = rVarH.G(bVarK4);
                objE4 = rVarH.E();
                if (zG4) {
                    objE4 = new d(bVarK4);
                    rVarH.v(objE4);
                } else {
                    objE4 = new d(bVarK4);
                    rVarH.v(objE4);
                }
                er.l lVar14 = (er.l) ((mr.g) objE4);
                bVarK5 = cVar.k();
                zG5 = rVarH.G(bVarK5);
                objE5 = rVarH.E();
                if (zG5) {
                    objE5 = new e(bVarK5);
                    rVarH.v(objE5);
                } else {
                    objE5 = new e(bVarK5);
                    rVarH.v(objE5);
                }
                er.l lVar15 = (er.l) ((mr.g) objE5);
                bVarK6 = cVar.k();
                zG6 = rVarH.G(bVarK6);
                objE6 = rVarH.E();
                if (zG6) {
                    objE6 = new f(bVarK6);
                    rVarH.v(objE6);
                } else {
                    objE6 = new f(bVarK6);
                    rVarH.v(objE6);
                }
                qVar4 = qVarG;
                Function1.n(null, null, null, null, lVar11, lVar12, null, lVar13, lVar14, lVar15, (er.l) ((mr.g) objE6), rVarH, 0, 0, 79);
                rVar2 = rVarH;
                eVarC = p049fm.i.c(rVar2, 0);
                zG7 = rVar2.G(eVarC) | rVar2.G(cVar);
                objE7 = rVar2.E();
                if (zG7) {
                    objE7 = new C1694g(eVarC, cVar, null);
                    rVar2.v(objE7);
                } else {
                    objE7 = new C1694g(eVarC, cVar, null);
                    rVar2.v(objE7);
                }
                Function0.d(eVarC, (er.p) objE7, rVar2, p049fm.e.f65033i);
                f6VarP = x5.p(collection, rVar2, i17 & 14);
                zW = rVar2.W(f6VarP) | rVar2.G(cVar);
                objE8 = rVar2.E();
                if (zW) {
                    objE8 = new h(f6VarP, cVar, null);
                    rVar2.v(objE8);
                } else {
                    objE8 = new h(f6VarP, cVar, null);
                    rVar2.v(objE8);
                }
                Function0.d(f6VarP, (er.p) objE8, rVar2, 0);
                zG8 = rVar2.G(cVar);
                objE9 = rVar2.E();
                if (zG8) {
                    objE9 = new er.l() { // from class: gm.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(cVar, (s0) obj);
                        }
                    };
                    rVar2.v(objE9);
                } else {
                    objE9 = new er.l() { // from class: gm.d
                        @Override // er.l
                        public final Object b(Object obj) {
                            return g.k(cVar, (s0) obj);
                        }
                    };
                    rVar2.v(objE9);
                }
                Function0.a(f6VarP, (er.l) objE9, rVar2, 0);
                if (aVar4 == null) {
                    aVarL = cVar.l();
                } else {
                    aVarL = aVar4;
                }
                if (aVarL instanceof gm.a) {
                    aVar5 = (gm.a) aVarL;
                } else {
                    aVar5 = null;
                }
                if (aVar5 != null) {
                    f6VarC = aVar5.c();
                } else {
                    f6VarC = null;
                }
                if (f6VarC == null) {
                    rVar2.X(-119020733);
                    objE10 = rVar2.E();
                    if (objE10 == p076m2.r.INSTANCE.a()) {
                        objE10 = c6.e(e1.e(), null, 2, null);
                        rVar2.v(objE10);
                    }
                    f6VarC = (a3) objE10;
                } else {
                    rVar2.X(1658726189);
                }
                rVar2.R();
                it = i(f6VarC).iterator();
                while (it.hasNext()) {
                    qVar4.w((bm.b) it.next(), rVar2, Integer.valueOf(i25 & 112));
                }
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
                qVar3 = qVar4;
                aVar3 = aVar4;
            } else {
                rVar2 = rVarH;
                rVar2.O();
                qVar3 = qVar2;
                aVar3 = aVar2;
            }
            d5VarM = rVar2.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: gm.e
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return g.j(collection, cVar, qVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i17 |= 3072;
        aVar2 = aVar;
        if ((i17 & 1171) != 1170) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (rVarH.r(z15, i17 & 1)) {
            if (i26 != 0) {
                qVarG = q.f73753a.g();
            } else {
                qVarG = qVar2;
            }
            if (i18 != 0) {
                aVar4 = null;
            } else {
                aVar4 = aVar2;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(274351384, i17, -1, "com.google.maps.android.compose.clustering.Clustering (Clustering.kt:322)");
            }
            i25 = i17 >> 3;
            m(cVar, rVarH, i25 & 14);
            bVarK = cVar.k();
            zG = rVarH.G(bVarK);
            objE = rVarH.E();
            if (zG) {
                objE = new a(bVarK);
                rVarH.v(objE);
            } else {
                objE = new a(bVarK);
                rVarH.v(objE);
            }
            er.l lVar16 = (er.l) ((mr.g) objE);
            bVarK2 = cVar.k();
            zG2 = rVarH.G(bVarK2);
            objE2 = rVarH.E();
            if (zG2) {
                objE2 = new b(bVarK2);
                rVarH.v(objE2);
            } else {
                objE2 = new b(bVarK2);
                rVarH.v(objE2);
            }
            er.l lVar17 = (er.l) ((mr.g) objE2);
            bVarK3 = cVar.k();
            zG3 = rVarH.G(bVarK3);
            objE3 = rVarH.E();
            if (zG3) {
                objE3 = new c(bVarK3);
                rVarH.v(objE3);
            } else {
                objE3 = new c(bVarK3);
                rVarH.v(objE3);
            }
            er.l lVar18 = (er.l) ((mr.g) objE3);
            bVarK4 = cVar.k();
            zG4 = rVarH.G(bVarK4);
            objE4 = rVarH.E();
            if (zG4) {
                objE4 = new d(bVarK4);
                rVarH.v(objE4);
            } else {
                objE4 = new d(bVarK4);
                rVarH.v(objE4);
            }
            er.l lVar19 = (er.l) ((mr.g) objE4);
            bVarK5 = cVar.k();
            zG5 = rVarH.G(bVarK5);
            objE5 = rVarH.E();
            if (zG5) {
                objE5 = new e(bVarK5);
                rVarH.v(objE5);
            } else {
                objE5 = new e(bVarK5);
                rVarH.v(objE5);
            }
            er.l lVar110 = (er.l) ((mr.g) objE5);
            bVarK6 = cVar.k();
            zG6 = rVarH.G(bVarK6);
            objE6 = rVarH.E();
            if (zG6) {
                objE6 = new f(bVarK6);
                rVarH.v(objE6);
            } else {
                objE6 = new f(bVarK6);
                rVarH.v(objE6);
            }
            qVar4 = qVarG;
            Function1.n(null, null, null, null, lVar16, lVar17, null, lVar18, lVar19, lVar110, (er.l) ((mr.g) objE6), rVarH, 0, 0, 79);
            rVar2 = rVarH;
            eVarC = p049fm.i.c(rVar2, 0);
            zG7 = rVar2.G(eVarC) | rVar2.G(cVar);
            objE7 = rVar2.E();
            if (zG7) {
                objE7 = new C1694g(eVarC, cVar, null);
                rVar2.v(objE7);
            } else {
                objE7 = new C1694g(eVarC, cVar, null);
                rVar2.v(objE7);
            }
            Function0.d(eVarC, (er.p) objE7, rVar2, p049fm.e.f65033i);
            f6VarP = x5.p(collection, rVar2, i17 & 14);
            zW = rVar2.W(f6VarP) | rVar2.G(cVar);
            objE8 = rVar2.E();
            if (zW) {
                objE8 = new h(f6VarP, cVar, null);
                rVar2.v(objE8);
            } else {
                objE8 = new h(f6VarP, cVar, null);
                rVar2.v(objE8);
            }
            Function0.d(f6VarP, (er.p) objE8, rVar2, 0);
            zG8 = rVar2.G(cVar);
            objE9 = rVar2.E();
            if (zG8) {
                objE9 = new er.l() { // from class: gm.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.k(cVar, (s0) obj);
                    }
                };
                rVar2.v(objE9);
            } else {
                objE9 = new er.l() { // from class: gm.d
                    @Override // er.l
                    public final Object b(Object obj) {
                        return g.k(cVar, (s0) obj);
                    }
                };
                rVar2.v(objE9);
            }
            Function0.a(f6VarP, (er.l) objE9, rVar2, 0);
            if (aVar4 == null) {
                aVarL = cVar.l();
            } else {
                aVarL = aVar4;
            }
            if (aVarL instanceof gm.a) {
                aVar5 = (gm.a) aVarL;
            } else {
                aVar5 = null;
            }
            if (aVar5 != null) {
                f6VarC = aVar5.c();
            } else {
                f6VarC = null;
            }
            if (f6VarC == null) {
                rVar2.X(-119020733);
                objE10 = rVar2.E();
                if (objE10 == p076m2.r.INSTANCE.a()) {
                    objE10 = c6.e(e1.e(), null, 2, null);
                    rVar2.v(objE10);
                }
                f6VarC = (a3) objE10;
            } else {
                rVar2.X(1658726189);
            }
            rVar2.R();
            it = i(f6VarC).iterator();
            while (it.hasNext()) {
                qVar4.w((bm.b) it.next(), rVar2, Integer.valueOf(i25 & 112));
            }
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            qVar3 = qVar4;
            aVar3 = aVar4;
        } else {
            rVar2 = rVarH;
            rVar2.O();
            qVar3 = qVar2;
            aVar3 = aVar2;
        }
        d5VarM = rVar2.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gm.e
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.j(collection, cVar, qVar3, aVar3, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends bm.b> void g(Collection<? extends T> collection, bm.c<T> cVar, er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar, p076m2.r rVar, final int i15, final int i16) {
        int i17;
        bm.c<T> cVar2;
        final Collection<? extends T> collection2;
        final er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar2;
        p076m2.r rVarH = rVar.h(430168905);
        if ((i15 & 6) == 0) {
            i17 = (rVarH.G(collection) ? 4 : 2) | i15;
        } else {
            i17 = i15;
        }
        if ((i15 & 48) == 0) {
            i17 |= rVarH.G(cVar) ? 32 : 16;
        }
        int i18 = i16 & 4;
        if (i18 != 0) {
            i17 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i15 & MLKEMEngine.KyberPolyBytes) == 0) {
            i17 |= rVarH.G(qVar) ? 256 : 128;
        }
        if (rVarH.r((i17 & 147) != 146, i17 & 1)) {
            if (i18 != 0) {
                qVar = q.f73753a.f();
            }
            er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar3 = qVar;
            if (p076m2.t.k()) {
                p076m2.t.o(430168905, i17, -1, "com.google.maps.android.compose.clustering.Clustering (Clustering.kt:305)");
            }
            cVar2 = cVar;
            f(collection, cVar2, qVar3, null, rVarH, (i17 & 14) | 3072 | (i17 & 112) | (i17 & 896), 0);
            collection2 = collection;
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            qVar2 = qVar3;
        } else {
            cVar2 = cVar;
            collection2 = collection;
            rVarH.O();
            qVar2 = qVar;
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            final bm.c<T> cVar3 = cVar2;
            d5VarM.a(new er.p() { // from class: gm.c
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.h(collection2, cVar3, qVar2, i15, i16, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 h(Collection collection, bm.c cVar, er.q qVar, int i15, int i16, p076m2.r rVar, int i17) {
        g(collection, cVar, qVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    private static final <T extends bm.b> Set<T> i(f6<? extends Set<? extends T>> f6Var) {
        return f6Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j(Collection collection, bm.c cVar, er.q qVar, dm.a aVar, int i15, int i16, p076m2.r rVar, int i17) {
        f(collection, cVar, qVar, aVar, rVar, g4.a(i15 | 1), i16);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r0 k(bm.c cVar, s0 s0Var) {
        return new i(cVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final gm.k l() {
        return new gm.k();
    }

    private static final void m(final bm.c<?> cVar, p076m2.r rVar, final int i15) {
        int i16;
        p076m2.r rVarH = rVar.h(-895341247);
        if ((i15 & 6) == 0) {
            i16 = (rVarH.G(cVar) ? 4 : 2) | i15;
        } else {
            i16 = i15;
        }
        if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-895341247, i16, -1, "com.google.maps.android.compose.clustering.ResetMapListeners (Clustering.kt:516)");
            }
            er.a<i0> aVarB = p049fm.Function0.b(rVarH, 0);
            boolean zW = rVarH.W(aVarB);
            Object objE = rVarH.E();
            if (zW || objE == p076m2.r.INSTANCE.a()) {
                objE = new j(aVarB, null);
                rVarH.v(objE);
            }
            Function0.e(cVar, aVarB, (er.p) objE, rVarH, i16 & 14);
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVarH.O();
        }
        d5 d5VarM = rVarH.m();
        if (d5VarM != null) {
            d5VarM.a(new er.p() { // from class: gm.f
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return g.n(cVar, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 n(bm.c cVar, int i15, p076m2.r rVar, int i16) {
        m(cVar, rVar, g4.a(i15 | 1));
        return i0.f148189a;
    }

    public static final b4<gm.k> o() {
        return f73718a;
    }

    public static final <T extends bm.b> bm.c<T> p(p076m2.r rVar, int i15) {
        if (p076m2.t.k()) {
            p076m2.t.o(-2110674323, i15, -1, "com.google.maps.android.compose.clustering.rememberClusterManager (Clustering.kt:440)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(null, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var = (a3) objE;
        boolean zG = rVar.G(context);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            objE2 = new k(a3Var, context, null);
            rVar.v(objE2);
        }
        v1.b(context, (er.q) objE2, rVar, 0);
        bm.c<T> cVar = (bm.c) a3Var.getValue();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        return cVar;
    }

    public static final <T extends bm.b> dm.a<T> q(er.q<? super bm.a<T>, ? super p076m2.r, ? super Integer, i0> qVar, er.q<? super T, ? super p076m2.r, ? super Integer, i0> qVar2, long j15, long j16, float f15, float f16, bm.c<T> cVar, p076m2.r rVar, int i15, int i16) {
        long jE;
        long jE2;
        a3 a3Var;
        Context context;
        rVar.X(28053112);
        if ((i16 & 4) != 0) {
            jE = m3.e.e((((long) Float.floatToRawIntBits(0.5f)) << 32) | (((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax));
        } else {
            jE = j15;
        }
        if ((i16 & 8) != 0) {
            jE2 = m3.e.e((((long) Float.floatToRawIntBits(1.0f)) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(0.5f)) << 32));
        } else {
            jE2 = j16;
        }
        float f17 = (i16 & 16) != 0 ? 0.0f : f15;
        float f18 = (i16 & 32) == 0 ? f16 : 0.0f;
        if (p076m2.t.k()) {
            p076m2.t.o(28053112, i15, -1, "com.google.maps.android.compose.clustering.rememberClusterRenderer (Clustering.kt:405)");
        }
        f6 f6VarP = x5.p(qVar, rVar, i15 & 14);
        f6 f6VarP2 = x5.p(qVar2, rVar, (i15 >> 3) & 14);
        f6 f6VarP3 = x5.p(m3.e.d(jE), rVar, (i15 >> 6) & 14);
        f6 f6VarP4 = x5.p(m3.e.d(jE2), rVar, (i15 >> 9) & 14);
        f6 f6VarP5 = x5.p(Float.valueOf(f17), rVar, (i15 >> 12) & 14);
        f6 f6VarP6 = x5.p(Float.valueOf(f18), rVar, (i15 >> 15) & 14);
        Context context2 = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        f6 f6VarP7 = x5.p(t1.b(rVar, 0), rVar, 0);
        Object objE = rVar.E();
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        if (objE == companion.a()) {
            objE = c6.e(null, null, 2, null);
            rVar.v(objE);
        }
        a3 a3Var2 = (a3) objE;
        if (cVar == null) {
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
            rVar.R();
            return null;
        }
        boolean zG = rVar.G(context2) | rVar.G(cVar) | rVar.W(f6VarP7) | rVar.W(f6VarP) | rVar.W(f6VarP2) | rVar.W(f6VarP3) | rVar.W(f6VarP4) | rVar.W(f6VarP5) | rVar.W(f6VarP6);
        Object objE2 = rVar.E();
        if (zG || objE2 == companion.a()) {
            a3Var = a3Var2;
            context = context2;
            Object lVar = new l(context, cVar, f6VarP7, f6VarP, f6VarP2, f6VarP3, f6VarP4, f6VarP5, f6VarP6, a3Var, null);
            rVar.v(lVar);
            objE2 = lVar;
        } else {
            context = context2;
            a3Var = a3Var2;
        }
        v1.b(context, (er.q) objE2, rVar, 0);
        dm.a<T> aVar = (dm.a) a3Var.getValue();
        if (p076m2.t.k()) {
            p076m2.t.n();
        }
        rVar.R();
        return aVar;
    }
}
