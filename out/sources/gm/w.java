package gm;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import bm.b;
import fr.l0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import ju.d2;
import ju.p0;
import lu.z;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.Function0;
import p076m2.a3;
import p076m2.c4;
import p076m2.c6;
import p076m2.d0;
import p076m2.d5;
import p076m2.f6;
import p076m2.g4;
import pq.e1;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0007\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004:\u0003TUVB±\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012 \u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\r\u0012\u001a\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\r\u0012\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u0012\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\r\u0012\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r\u0012\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\r¢\u0006\u0004\b\u001b\u0010\u001cJ%\u0010\u001f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e0\u001d*\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0002¢\u0006\u0004\b\u001f\u0010 J\u001d\u0010#\u001a\u00020\"2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eH\u0002¢\u0006\u0004\b#\u0010$J&\u0010'\u001a\u00020\u00122\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u001e2\u0006\u0010&\u001a\u00020%H\u0082@¢\u0006\u0004\b'\u0010(J\u0017\u0010+\u001a\u00020*2\u0006\u0010&\u001a\u00020)H\u0002¢\u0006\u0004\b+\u0010,J#\u0010.\u001a\u00020\u00122\u0012\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00110\u001dH\u0016¢\u0006\u0004\b.\u0010/J%\u00103\u001a\u00020\u00122\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b3\u00104J\u001d\u00105\u001a\u00020*2\f\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\u0011H\u0014¢\u0006\u0004\b5\u00106J\u001f\u00108\u001a\u00020\u00122\u0006\u00107\u001a\u00028\u00002\u0006\u00102\u001a\u000201H\u0014¢\u0006\u0004\b8\u00109R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R.\u0010\u0013\u001a\u001c\u0012\u0018\u0012\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010?R(\u0010\u0014\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00100\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010?R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010?R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010?R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00180\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010?R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010?R&\u0010K\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001d0F8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u0014\u0010O\u001a\u00020L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR&\u0010S\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u001e\u0012\u0004\u0012\u00020\"0P8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010R¨\u0006W"}, d2 = {"Lgm/w;", "Lbm/b;", "T", "Ldm/h;", "Lgm/a;", "Landroid/content/Context;", "context", "Lju/p0;", "scope", "Llh/c;", "map", "Lbm/c;", "clusterManager", "Lm2/f6;", "Lfm/r;", "viewRendererState", "Lkotlin/Function1;", "Lbm/a;", "Loq/i0;", "clusterContentState", "clusterItemContentState", "Lm3/e;", "clusterContentAnchorState", "clusterItemContentAnchorState", "", "clusterContentZIndexState", "clusterItemContentZIndexState", "<init>", "(Landroid/content/Context;Lju/p0;Llh/c;Lbm/c;Lm2/f6;Lm2/f6;Lm2/f6;Lm2/f6;Lm2/f6;Lm2/f6;Lm2/f6;)V", "", "Lgm/w$c;", "n0", "(Lbm/a;)Ljava/util/Set;", "key", "Lgm/w$b;", "o0", "(Lgm/w$c;)Lgm/w$b;", "Lgm/w$a;", "view", "m0", "(Lgm/w$c;Lgm/w$a;Ltq/e;)Ljava/lang/Object;", "Landroidx/compose/ui/platform/b;", "Lnh/b;", "t0", "(Landroidx/compose/ui/platform/b;)Lnh/b;", "clusters", "i", "(Ljava/util/Set;)V", "cluster", "Lnh/i;", "markerOptions", "Z", "(Lbm/a;Lnh/i;)V", "M", "(Lbm/a;)Lnh/b;", "item", "Y", "(Lbm/b;Lnh/i;)V", "t", "Landroid/content/Context;", "u", "Lju/p0;", "v", "Lm2/f6;", "w", "x", "y", "z", "A", "B", "Lm2/a3;", "C", "Lm2/a3;", "s0", "()Lm2/a3;", "unclusteredItems", "Landroid/graphics/Canvas;", ip.a.f96138c, "Landroid/graphics/Canvas;", "fakeCanvas", "", "E", "Ljava/util/Map;", "keysToViews", "c", "b", "a", "maps-compose-utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class w<T extends bm.b> extends dm.h<T> implements gm.a<T> {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final f6<Float> clusterContentZIndexState;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final f6<Float> clusterItemContentZIndexState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final a3<Set<T>> unclusteredItems;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final Canvas fakeCanvas;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final Map<c<T>, b> keysToViews;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final p0 scope;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final f6<p049fm.r> viewRendererState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final f6<er.q<bm.a<T>, p076m2.r, Integer, i0>> clusterContentState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final f6<er.q<T, p076m2.r, Integer, i0>> clusterItemContentState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final f6<m3.e> clusterContentAnchorState;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final f6<m3.e> clusterItemContentAnchorState;

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0005H\u0017¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R*\u0010\u001e\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lgm/w$a;", "Landroidx/compose/ui/platform/b;", "Landroid/content/Context;", "context", "Lkotlin/Function0;", "Loq/i0;", "content", "<init>", "(Landroid/content/Context;Ler/p;)V", "c", "(Lm2/r;I)V", "Landroid/view/View;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "k", "Ler/p;", "Lgm/k;", "l", "Lgm/k;", "u", "()Lgm/k;", "properties", "m", "Ler/a;", "getOnInvalidate", "()Ler/a;", "v", "(Ler/a;)V", "onInvalidate", "maps-compose-utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static final class a extends androidx.compose.ui.platform.b {

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private final er.p<p076m2.r, Integer, i0> content;

        /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
        private final k properties;

        /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
        private er.a<i0> onInvalidate;

        /* JADX INFO: renamed from: gm.w$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
        static final class C1695a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f73778e;

            C1695a(tq.e<? super C1695a> eVar) {
                super(2, eVar);
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f73778e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                a.this.invalidate();
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((C1695a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return a.this.new C1695a(eVar);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(Context context, er.p<? super p076m2.r, ? super Integer, i0> pVar) {
            super(context, null, 0, 6, null);
            this.content = pVar;
            this.properties = new k();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 s(a aVar, p076m2.r rVar, int i15) {
            if (rVar.r((i15 & 3) != 2, i15 & 1)) {
                if (p076m2.t.k()) {
                    p076m2.t.o(-1686266130, i15, -1, "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer.InvalidatingComposeView.Content.<anonymous> (ClusterRenderer.kt:264)");
                }
                aVar.content.B(rVar, 0);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVar.O();
            }
            return i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 t(a aVar, int i15, p076m2.r rVar, int i16) {
            aVar.c(rVar, g4.a(i15 | 1));
            return i0.f148189a;
        }

        @Override // androidx.compose.ui.platform.b
        public void c(p076m2.r rVar, final int i15) {
            int i16;
            p076m2.r rVarH = rVar.h(77023790);
            if ((i15 & 6) == 0) {
                i16 = (rVarH.G(this) ? 4 : 2) | i15;
            } else {
                i16 = i15;
            }
            if (rVarH.r((i16 & 3) != 2, i16 & 1)) {
                if (p076m2.t.k()) {
                    p076m2.t.o(77023790, i16, -1, "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer.InvalidatingComposeView.Content (ClusterRenderer.kt:257)");
                }
                m3.e eVarA = this.properties.a();
                Float fB = this.properties.b();
                boolean zG = rVarH.G(this);
                Object objE = rVarH.E();
                if (zG || objE == p076m2.r.INSTANCE.a()) {
                    objE = new C1695a(null);
                    rVarH.v(objE);
                }
                Function0.e(eVarA, fB, (er.p) objE, rVarH, 0);
                d0.c(g.o().d(this.properties), y2.m.d(-1686266130, true, new er.p() { // from class: gm.u
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w.a.s(this.f73765a, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                }, rVarH, 54), rVarH, c4.f122821i | 48);
                if (p076m2.t.k()) {
                    p076m2.t.n();
                }
            } else {
                rVarH.O();
            }
            d5 d5VarM = rVarH.m();
            if (d5VarM != null) {
                d5VarM.a(new er.p() { // from class: gm.v
                    @Override // er.p
                    public final Object B(Object obj, Object obj2) {
                        return w.a.t(this.f73766a, i15, (p076m2.r) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        @Override // android.view.ViewGroup, android.view.ViewParent
        public void onDescendantInvalidated(View child, View target) {
            super.onDescendantInvalidated(child, target);
            er.a<i0> aVar = this.onInvalidate;
            if (aVar != null) {
                aVar.a();
            }
        }

        /* JADX INFO: renamed from: u, reason: from getter */
        public final k getProperties() {
            return this.properties;
        }

        public final void v(er.a<i0> aVar) {
            this.onInvalidate = aVar;
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u000b\u0010\r\u001a\u0004\b\t\u0010\u000e¨\u0006\u000f"}, d2 = {"Lgm/w$b;", "", "Landroidx/compose/ui/platform/b;", "view", "Lkotlin/Function0;", "Loq/i0;", "onRemove", "<init>", "(Landroidx/compose/ui/platform/b;Ler/a;)V", "a", "Landroidx/compose/ui/platform/b;", "b", "()Landroidx/compose/ui/platform/b;", "Ler/a;", "()Ler/a;", "maps-compose-utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final androidx.compose.ui.platform.b view;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final er.a<i0> onRemove;

        public b(androidx.compose.ui.platform.b bVar, er.a<i0> aVar) {
            this.view = bVar;
            this.onRemove = aVar;
        }

        public final er.a<i0> a() {
            return this.onRemove;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final androidx.compose.ui.platform.b getView() {
            return this.view;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b2\u0018\u0000*\b\b\u0001\u0010\u0002*\u00020\u00012\u00020\u0003:\u0002\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\b\t¨\u0006\n"}, d2 = {"Lgm/w$c;", "Lbm/b;", "T", "", "<init>", "()V", "a", "b", "Lgm/w$c$a;", "Lgm/w$c$b;", "maps-compose-utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
    static abstract class c<T extends bm.b> {

        /* JADX INFO: renamed from: gm.w$c$a, reason: from toString */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00020\u0003B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0013\u0010\u0015¨\u0006\u0016"}, d2 = {"Lgm/w$c$a;", "Lbm/b;", "T", "Lgm/w$c;", "Lbm/a;", "cluster", "<init>", "(Lbm/a;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm/a;", "()Lbm/a;", "maps-compose-utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Cluster<T extends bm.b> extends c<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final bm.a<T> cluster;

            public Cluster(bm.a<T> aVar) {
                super(null);
                this.cluster = aVar;
            }

            public final bm.a<T> a() {
                return this.cluster;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Cluster) && fr.t.c(this.cluster, ((Cluster) other).cluster);
            }

            public int hashCode() {
                return this.cluster.hashCode();
            }

            public String toString() {
                return "Cluster(cluster=" + this.cluster + ')';
            }
        }

        /* JADX INFO: renamed from: gm.w$c$b, reason: from toString */
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u0000*\b\b\u0002\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00020\u0003B\u000f\u0012\u0006\u0010\u0004\u001a\u00028\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0004\u001a\u00028\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0012\u0010\u0014¨\u0006\u0015"}, d2 = {"Lgm/w$c$b;", "Lbm/b;", "T", "Lgm/w$c;", "item", "<init>", "(Lbm/b;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Lbm/b;", "()Lbm/b;", "maps-compose-utils_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final /* data */ class Item<T extends bm.b> extends c<T> {

            /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
            private final T item;

            public Item(T t15) {
                super(null);
                this.item = t15;
            }

            public final T a() {
                return this.item;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Item) && fr.t.c(this.item, ((Item) other).item);
            }

            public int hashCode() {
                return this.item.hashCode();
            }

            public String toString() {
                return "Item(item=" + this.item + ')';
            }
        }

        public /* synthetic */ c(fr.k kVar) {
            this();
        }

        private c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Llu/w;", "Loq/i0;", "<anonymous>", "(Llu/w;)V"}, k = 3, mv = {2, 3, 0})
    static final class d extends vq.k implements er.p<lu.w<? super i0>, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f73784e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f73785f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f73786g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f73787h;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f73788e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ lu.w<i0> f73789f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l0 f73790g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(lu.w<? super i0> wVar, l0 l0Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f73789f = wVar;
                this.f73790g = l0Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f73788e;
                if (i15 == 0) {
                    oq.u.b(obj);
                    this.f73788e = 1;
                    if (ku.i.e(this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                }
                lu.w<i0> wVar = this.f73789f;
                i0 i0Var = i0.f148189a;
                wVar.d(i0Var);
                this.f73790g.f66404a = false;
                return i0Var;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f73789f, this.f73790g, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"gm/w$d$b", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class b implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f73791a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ a f73792b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ lu.w f73793c;

            public b(View view, a aVar, lu.w wVar) {
                this.f73791a = view;
                this.f73792b = aVar;
                this.f73793c = wVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
                this.f73791a.removeOnAttachStateChangeListener(this);
                a aVar = this.f73792b;
                if (aVar.isAttachedToWindow()) {
                    aVar.addOnAttachStateChangeListener(new c(aVar, this.f73793c));
                } else {
                    z.a.a(this.f73793c, null, 1, null);
                }
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
            }
        }

        @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"gm/w$d$c", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/View;", "view", "Loq/i0;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "core-ktx_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
        public static final class c implements View.OnAttachStateChangeListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ View f73794a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ lu.w f73795b;

            public c(View view, lu.w wVar) {
                this.f73794a = view;
                this.f73795b = wVar;
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewAttachedToWindow(View view) {
            }

            @Override // android.view.View.OnAttachStateChangeListener
            public void onViewDetachedFromWindow(View view) {
                this.f73794a.removeOnAttachStateChangeListener(this);
                z.a.a(this.f73795b, null, 1, null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(a aVar, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f73787h = aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(l0 l0Var, lu.w wVar) {
            if (!l0Var.f66404a) {
                ju.k.d(wVar, null, null, new a(wVar, l0Var, null), 3, null);
                l0Var.f66404a = true;
            }
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            final lu.w wVar = (lu.w) this.f73786g;
            Object objE = uq.b.e();
            int i15 = this.f73785f;
            if (i15 == 0) {
                oq.u.b(obj);
                final l0 l0Var = new l0();
                this.f73787h.v(new er.a() { // from class: gm.x
                    @Override // er.a
                    public final Object a() {
                        return w.d.O(l0Var, wVar);
                    }
                });
                a aVar = this.f73787h;
                if (!aVar.isAttachedToWindow()) {
                    aVar.addOnAttachStateChangeListener(new b(aVar, aVar, wVar));
                } else if (aVar.isAttachedToWindow()) {
                    aVar.addOnAttachStateChangeListener(new c(aVar, wVar));
                } else {
                    z.a.a(wVar, null, 1, null);
                }
                this.f73786g = vq.j.a(wVar);
                this.f73784e = vq.j.a(l0Var);
                this.f73785f = 1;
                if (lu.u.c(wVar, null, this, 1, null) == objE) {
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
        public final Object B(lu.w<? super i0> wVar, tq.e<? super i0> eVar) {
            return ((d) v(wVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            d dVar = new d(this.f73787h, eVar);
            dVar.f73786g = obj;
            return dVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Loq/i0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {2, 3, 0})
    static final class e extends vq.k implements er.p<i0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73796e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ c<T> f73797f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ w<T> f73798g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f73799h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(c<T> cVar, w<T> wVar, a aVar, tq.e<? super e> eVar) {
            super(2, eVar);
            this.f73797f = cVar;
            this.f73798g = wVar;
            this.f73799h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            nh.h hVarO;
            uq.b.e();
            if (this.f73796e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c<T> cVar = this.f73797f;
            if (cVar instanceof c.Cluster) {
                hVarO = this.f73798g.N(((c.Cluster) cVar).a());
            } else {
                if (!(cVar instanceof c.Item)) {
                    throw new oq.p();
                }
                hVarO = this.f73798g.O(((c.Item) cVar).a());
            }
            if (hVarO != null) {
                w<T> wVar = this.f73798g;
                a aVar = this.f73799h;
                hVarO.j(wVar.t0(aVar));
                m3.e eVarA = aVar.getProperties().a();
                if (eVarA != null) {
                    long packedValue = eVarA.getPackedValue();
                    hVarO.g(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)));
                }
                Float fB = aVar.getProperties().b();
                if (fB != null) {
                    hVarO.r(fB.floatValue());
                }
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(i0 i0Var, tq.e<? super i0> eVar) {
            return ((e) v(i0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new e(this.f73797f, this.f73798g, this.f73799h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 3, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f73800e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ w<T> f73801f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ c<T> f73802g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ a f73803h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(w<T> wVar, c<T> cVar, a aVar, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f73801f = wVar;
            this.f73802g = cVar;
            this.f73803h = aVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f73800e;
            if (i15 == 0) {
                oq.u.b(obj);
                w<T> wVar = this.f73801f;
                c<T> cVar = this.f73802g;
                a aVar = this.f73803h;
                this.f73800e = 1;
                if (wVar.m0(cVar, aVar, this) == objE) {
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
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new f(this.f73801f, this.f73802g, this.f73803h, eVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public w(Context context, p0 p0Var, lh.c cVar, bm.c<T> cVar2, f6<? extends p049fm.r> f6Var, f6<? extends er.q<? super bm.a<T>, ? super p076m2.r, ? super Integer, i0>> f6Var2, f6<? extends er.q<? super T, ? super p076m2.r, ? super Integer, i0>> f6Var3, f6<m3.e> f6Var4, f6<m3.e> f6Var5, f6<Float> f6Var6, f6<Float> f6Var7) {
        super(context, cVar, cVar2);
        this.context = context;
        this.scope = p0Var;
        this.viewRendererState = f6Var;
        this.clusterContentState = f6Var2;
        this.clusterItemContentState = f6Var3;
        this.clusterContentAnchorState = f6Var4;
        this.clusterItemContentAnchorState = f6Var5;
        this.clusterContentZIndexState = f6Var6;
        this.clusterItemContentZIndexState = f6Var7;
        this.unclusteredItems = c6.e(e1.e(), null, 2, null);
        this.fakeCanvas = new Canvas();
        this.keysToViews = new LinkedHashMap();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object m0(c<T> cVar, a aVar, tq.e<? super i0> eVar) {
        Object objJ = mu.i.j(mu.i.e(new d(aVar, null)), new e(cVar, this, aVar, null), eVar);
        return objJ == uq.b.e() ? objJ : i0.f148189a;
    }

    private final Set<c<T>> n0(bm.a<T> aVar) {
        if (g0(aVar)) {
            return e1.d(new c.Cluster(aVar));
        }
        Collection<T> collectionA = aVar.a();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = collectionA.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(new c.Item((bm.b) it.next()));
        }
        return linkedHashSet;
    }

    private final b o0(final c<T> key) {
        y2.f fVarB;
        Context context = this.context;
        if (key instanceof c.Cluster) {
            fVarB = y2.m.b(-231222560, true, new er.p() { // from class: gm.r
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.p0(this.f73759a, key, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        } else {
            if (!(key instanceof c.Item)) {
                throw new oq.p();
            }
            fVarB = y2.m.b(-1883693097, true, new er.p() { // from class: gm.s
                @Override // er.p
                public final Object B(Object obj, Object obj2) {
                    return w.q0(this.f73761a, key, (p076m2.r) obj, ((Integer) obj2).intValue());
                }
            });
        }
        a aVar = new a(context, fVarB);
        final fm.r.a aVarA = this.viewRendererState.getValue().a(aVar);
        final d2 d2VarD = ju.k.d(this.scope, null, null, new f(this, key, aVar, null), 3, null);
        b bVar = new b(aVar, new er.a() { // from class: gm.t
            @Override // er.a
            public final Object a() {
                return w.r0(d2VarD, aVarA);
            }
        });
        this.keysToViews.put(key, bVar);
        return bVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p0(w wVar, c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-231222560, i15, -1, "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer.createAndAddView.<anonymous> (ClusterRenderer.kt:107)");
            }
            er.q<bm.a<T>, p076m2.r, Integer, i0> value = wVar.clusterContentState.getValue();
            if (value == null) {
                rVar.X(776287182);
            } else {
                rVar.X(1133420179);
                value.w(((c.Cluster) cVar).a(), rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 q0(w wVar, c cVar, p076m2.r rVar, int i15) {
        if (rVar.r((i15 & 3) != 2, i15 & 1)) {
            if (p076m2.t.k()) {
                p076m2.t.o(-1883693097, i15, -1, "com.google.maps.android.compose.clustering.ComposeUiClusterRenderer.createAndAddView.<anonymous> (ClusterRenderer.kt:111)");
            }
            er.q value = wVar.clusterItemContentState.getValue();
            if (value == null) {
                rVar.X(941670042);
            } else {
                rVar.X(-2047833529);
                value.w(((c.Item) cVar).a(), rVar, 0);
            }
            rVar.R();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        } else {
            rVar.O();
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(d2 d2Var, fm.r.a aVar) {
        d2.a.a(d2Var, null, 1, null);
        aVar.j();
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final nh.b t0(androidx.compose.ui.platform.b view) {
        view.draw(this.fakeCanvas);
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
        if (viewGroup == null) {
            return nh.c.a(Bitmap.createBitmap(20, 20, Bitmap.Config.ARGB_8888));
        }
        view.measure(View.MeasureSpec.makeMeasureSpec(viewGroup.getWidth(), PKIFailureInfo.systemUnavail), View.MeasureSpec.makeMeasureSpec(viewGroup.getHeight(), PKIFailureInfo.systemUnavail));
        view.layout(0, 0, view.getMeasuredWidth(), view.getMeasuredHeight());
        Integer numValueOf = Integer.valueOf(view.getMeasuredWidth());
        if (numValueOf.intValue() <= 0) {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 1;
        Integer numValueOf2 = Integer.valueOf(view.getMeasuredHeight());
        Integer num = numValueOf2.intValue() > 0 ? numValueOf2 : null;
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(iIntValue, num != null ? num.intValue() : 1, Bitmap.Config.ARGB_8888);
        view.draw(new Canvas(bitmapCreateBitmap));
        return nh.c.a(bitmapCreateBitmap);
    }

    @Override // dm.h
    protected nh.b M(bm.a<T> cluster) {
        Object obj;
        b bVarO0;
        if (this.clusterContentState.getValue() == null) {
            return super.M(cluster);
        }
        Iterator<T> it = this.keysToViews.entrySet().iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            c cVar = (c) ((Map.Entry) next).getKey();
            c.Cluster cluster2 = cVar instanceof c.Cluster ? (c.Cluster) cVar : null;
            if (fr.t.c(cluster2 != null ? cluster2.a() : null, cluster)) {
                obj = next;
                break;
            }
        }
        Map.Entry entry = (Map.Entry) obj;
        if (entry == null || (bVarO0 = (b) entry.getValue()) == null) {
            bVarO0 = o0((c) pq.v.k0(n0(cluster)));
        }
        return t0(bVarO0.getView());
    }

    @Override // dm.h
    protected void Y(T item, nh.i markerOptions) {
        Object obj;
        b bVarO0;
        super.Y(item, markerOptions);
        if (this.clusterItemContentState.getValue() != null) {
            Iterator<T> it = this.keysToViews.entrySet().iterator();
            while (true) {
                obj = null;
                if (!it.hasNext()) {
                    break;
                }
                Object next = it.next();
                c cVar = (c) ((Map.Entry) next).getKey();
                c.Item item2 = cVar instanceof c.Item ? (c.Item) cVar : null;
                if (fr.t.c(item2 != null ? item2.a() : null, item)) {
                    obj = next;
                    break;
                }
            }
            Map.Entry entry = (Map.Entry) obj;
            if (entry == null || (bVarO0 = (b) entry.getValue()) == null) {
                bVarO0 = o0(new c.Item(item));
            }
            markerOptions.O(t0(bVarO0.getView()));
            long packedValue = this.clusterItemContentAnchorState.getValue().getPackedValue();
            markerOptions.m(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)));
            markerOptions.C0(this.clusterItemContentZIndexState.getValue().floatValue());
        }
    }

    @Override // dm.h
    protected void Z(bm.a<T> cluster, nh.i markerOptions) {
        super.Z(cluster, markerOptions);
        if (this.clusterContentState.getValue() != null) {
            long packedValue = this.clusterContentAnchorState.getValue().getPackedValue();
            markerOptions.m(Float.intBitsToFloat((int) (packedValue >> 32)), Float.intBitsToFloat((int) (packedValue & BodyPartID.bodyIdMax)));
            markerOptions.C0(this.clusterContentZIndexState.getValue().floatValue());
        }
    }

    @Override // dm.h, dm.a
    public void i(Set<? extends bm.a<T>> clusters) {
        super.i(clusters);
        a3<Set<T>> a3VarC = c();
        Set<? extends bm.a<T>> set = clusters;
        ArrayList arrayList = new ArrayList();
        for (Object obj : set) {
            if (!g0((bm.a) obj)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            pq.v.D(arrayList2, ((bm.a) it.next()).a());
        }
        a3VarC.setValue(pq.v.k1(arrayList2));
        ArrayList<c<T>> arrayList3 = new ArrayList();
        Iterator<T> it4 = set.iterator();
        while (it4.hasNext()) {
            pq.v.D(arrayList3, n0((bm.a) it4.next()));
        }
        Iterator<Map.Entry<c<T>, b>> it5 = this.keysToViews.entrySet().iterator();
        while (it5.hasNext()) {
            Map.Entry<c<T>, b> next = it5.next();
            c<T> key = next.getKey();
            b value = next.getValue();
            if (!arrayList3.contains(key)) {
                it5.remove();
                value.a().a();
            }
        }
        for (c<T> cVar : arrayList3) {
            if (!this.keysToViews.keySet().contains(cVar)) {
                o0(cVar);
            }
        }
    }

    @Override // gm.a
    /* JADX INFO: renamed from: s0, reason: merged with bridge method [inline-methods] */
    public a3<Set<T>> c() {
        return this.unclusteredItems;
    }
}
