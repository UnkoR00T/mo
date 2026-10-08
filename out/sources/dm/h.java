package dm;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import bm.b;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import hm.Point;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.bouncycastle.asn1.x509.DisplayText;

/* JADX INFO: loaded from: classes4.dex */
public class h<T extends bm.b> implements dm.a<T> {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int[] f43403r = {10, 20, 50, 100, DisplayText.DISPLAY_TEXT_MAXIMUM_SIZE, 500, 1000};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final TimeInterpolator f43404s = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final lh.c f43405a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final km.b f43406b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final bm.c<T> f43407c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f43408d;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private ShapeDrawable f43412h;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private c<T> f43415k;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Set<? extends bm.a<T>> f43417m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private c<bm.a<T>> f43418n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private float f43419o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private final h<T>.g f43420p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private bm.c.e<T> f43421q;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Executor f43411g = Executors.newSingleThreadExecutor();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Set<e> f43413i = Collections.newSetFromMap(new ConcurrentHashMap());

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private SparseArray<nh.b> f43414j = new SparseArray<>();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f43416l = 4;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f43409e = true;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f43410f = 300;

    private class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final e f43422a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final nh.h f43423b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLng f43424c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final LatLng f43425d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f43426e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private em.b f43427f;

        public void a() {
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            valueAnimatorOfFloat.setInterpolator(h.f43404s);
            valueAnimatorOfFloat.setDuration(h.this.f43410f);
            valueAnimatorOfFloat.addUpdateListener(this);
            valueAnimatorOfFloat.addListener(this);
            valueAnimatorOfFloat.start();
        }

        public void b(em.b bVar) {
            this.f43427f = bVar;
            this.f43426e = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f43426e) {
                h.this.f43415k.d(this.f43423b);
                h.this.f43418n.d(this.f43423b);
                this.f43427f.i(this.f43423b);
            }
            this.f43422a.f43445b = this.f43425d;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            if (this.f43425d == null || this.f43424c == null || this.f43423b == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f43425d;
            double d15 = latLng.f31423a;
            LatLng latLng2 = this.f43424c;
            double d16 = latLng2.f31423a;
            double d17 = animatedFraction;
            double d18 = ((d15 - d16) * d17) + d16;
            double dSignum = latLng.f31424b - latLng2.f31424b;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            this.f43423b.l(new LatLng(d18, (dSignum * d17) + this.f43424c.f31424b));
        }

        private a(e eVar, LatLng latLng, LatLng latLng2) {
            this.f43422a = eVar;
            this.f43423b = eVar.f43444a;
            this.f43424c = latLng;
            this.f43425d = latLng2;
        }
    }

    private class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final bm.a<T> f43429a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Set<e> f43430b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final LatLng f43431c;

        public b(bm.a<T> aVar, Set<e> set, LatLng latLng) {
            this.f43429a = aVar;
            this.f43430b = set;
            this.f43431c = latLng;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void b(h<T>.d dVar) {
            e eVar;
            e eVar2;
            if (h.this.g0(this.f43429a)) {
                nh.h hVarB = h.this.f43418n.b(this.f43429a);
                if (hVarB == null) {
                    nh.i iVar = new nh.i();
                    LatLng position = this.f43431c;
                    if (position == null) {
                        position = this.f43429a.getPosition();
                    }
                    nh.i iVarC0 = iVar.c0(position);
                    h.this.Z(this.f43429a, iVarC0);
                    hVarB = h.this.f43407c.i().i(iVarC0);
                    h.this.f43418n.c(this.f43429a, hVarB);
                    eVar = new e(hVarB);
                    LatLng latLng = this.f43431c;
                    if (latLng != null) {
                        dVar.b(eVar, latLng, this.f43429a.getPosition());
                    }
                } else {
                    eVar = new e(hVarB);
                    h.this.d0(this.f43429a, hVarB);
                }
                h.this.c0(this.f43429a, hVarB);
                this.f43430b.add(eVar);
                return;
            }
            for (T t15 : this.f43429a.a()) {
                nh.h hVarB2 = h.this.f43415k.b(t15);
                if (hVarB2 == null) {
                    nh.i iVar2 = new nh.i();
                    LatLng latLng2 = this.f43431c;
                    if (latLng2 != null) {
                        iVar2.c0(latLng2);
                    } else {
                        iVar2.c0(t15.getPosition());
                        if (t15.a() != null) {
                            iVar2.C0(t15.a().floatValue());
                        }
                    }
                    h.this.Y(t15, iVar2);
                    hVarB2 = h.this.f43407c.j().i(iVar2);
                    eVar2 = new e(hVarB2);
                    h.this.f43415k.c(t15, hVarB2);
                    LatLng latLng3 = this.f43431c;
                    if (latLng3 != null) {
                        dVar.b(eVar2, latLng3, t15.getPosition());
                    }
                } else {
                    eVar2 = new e(hVarB2);
                    h.this.b0(t15, hVarB2);
                }
                h.this.a0(t15, hVarB2);
                this.f43430b.add(eVar2);
            }
        }
    }

    private static class c<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<T, nh.h> f43433a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Map<nh.h, T> f43434b;

        public T a(nh.h hVar) {
            return this.f43434b.get(hVar);
        }

        public nh.h b(T t15) {
            return this.f43433a.get(t15);
        }

        public void c(T t15, nh.h hVar) {
            this.f43433a.put(t15, hVar);
            this.f43434b.put(hVar, t15);
        }

        public void d(nh.h hVar) {
            T t15 = this.f43434b.get(hVar);
            this.f43434b.remove(hVar);
            this.f43433a.remove(t15);
        }

        private c() {
            this.f43433a = new HashMap();
            this.f43434b = new HashMap();
        }
    }

    @SuppressLint({"HandlerLeak"})
    private class d extends Handler implements MessageQueue.IdleHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Lock f43435a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Condition f43436b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private Queue<h<T>.b> f43437c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private Queue<h<T>.b> f43438d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private Queue<nh.h> f43439e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private Queue<nh.h> f43440f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private Queue<h<T>.a> f43441g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f43442h;

        private void e() {
            if (!this.f43440f.isEmpty()) {
                g(this.f43440f.poll());
                return;
            }
            if (!this.f43441g.isEmpty()) {
                this.f43441g.poll().a();
                return;
            }
            if (!this.f43438d.isEmpty()) {
                this.f43438d.poll().b(this);
            } else if (!this.f43437c.isEmpty()) {
                this.f43437c.poll().b(this);
            } else {
                if (this.f43439e.isEmpty()) {
                    return;
                }
                g(this.f43439e.poll());
            }
        }

        private void g(nh.h hVar) {
            h.this.f43415k.d(hVar);
            h.this.f43418n.d(hVar);
            h.this.f43407c.k().i(hVar);
        }

        public void a(boolean z15, h<T>.b bVar) {
            this.f43435a.lock();
            sendEmptyMessage(0);
            if (z15) {
                this.f43438d.add(bVar);
            } else {
                this.f43437c.add(bVar);
            }
            this.f43435a.unlock();
        }

        public void b(e eVar, LatLng latLng, LatLng latLng2) {
            this.f43435a.lock();
            this.f43441g.add(new a(eVar, latLng, latLng2));
            this.f43435a.unlock();
        }

        public void c(e eVar, LatLng latLng, LatLng latLng2) {
            this.f43435a.lock();
            h<T>.a aVar = new a(eVar, latLng, latLng2);
            aVar.b(h.this.f43407c.k());
            this.f43441g.add(aVar);
            this.f43435a.unlock();
        }

        public boolean d() {
            try {
                this.f43435a.lock();
                return (this.f43437c.isEmpty() && this.f43438d.isEmpty() && this.f43440f.isEmpty() && this.f43439e.isEmpty() && this.f43441g.isEmpty()) ? false : true;
            } finally {
                this.f43435a.unlock();
            }
        }

        public void f(boolean z15, nh.h hVar) {
            this.f43435a.lock();
            sendEmptyMessage(0);
            if (z15) {
                this.f43440f.add(hVar);
            } else {
                this.f43439e.add(hVar);
            }
            this.f43435a.unlock();
        }

        public void h() {
            while (d()) {
                sendEmptyMessage(0);
                this.f43435a.lock();
                try {
                    try {
                        if (d()) {
                            this.f43436b.await();
                        }
                        this.f43435a.unlock();
                    } catch (InterruptedException e15) {
                        throw new RuntimeException(e15);
                    }
                } catch (Throwable th4) {
                    this.f43435a.unlock();
                    throw th4;
                }
            }
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            if (!this.f43442h) {
                Looper.myQueue().addIdleHandler(this);
                this.f43442h = true;
            }
            removeMessages(0);
            this.f43435a.lock();
            for (int i15 = 0; i15 < 10; i15++) {
                try {
                    e();
                } catch (Throwable th4) {
                    this.f43435a.unlock();
                    throw th4;
                }
            }
            if (d()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f43442h = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f43436b.signalAll();
            }
            this.f43435a.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        private d() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f43435a = reentrantLock;
            this.f43436b = reentrantLock.newCondition();
            this.f43437c = new LinkedList();
            this.f43438d = new LinkedList();
            this.f43439e = new LinkedList();
            this.f43440f = new LinkedList();
            this.f43441g = new LinkedList();
        }
    }

    private static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final nh.h f43444a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private LatLng f43445b;

        public boolean equals(Object obj) {
            if (obj instanceof e) {
                return this.f43444a.equals(((e) obj).f43444a);
            }
            return false;
        }

        public int hashCode() {
            return this.f43444a.hashCode();
        }

        private e(nh.h hVar) {
            this.f43444a = hVar;
            this.f43445b = hVar.a();
        }
    }

    private class f implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Set<? extends bm.a<T>> f43446a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private Runnable f43447b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private lh.j f43448c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private im.b f43449d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f43450e;

        public void a(Runnable runnable) {
            this.f43447b = runnable;
        }

        public void b(float f15) {
            this.f43450e = f15;
            this.f43449d = new im.b(Math.pow(2.0d, Math.min(f15, h.this.f43419o)) * 256.0d);
        }

        public void c(lh.j jVar) {
            this.f43448c = jVar;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public void run() {
            LatLngBounds latLngBoundsA;
            ArrayList arrayList;
            h hVar = h.this;
            if (!hVar.f0(hVar.P(hVar.f43417m), h.this.P(this.f43446a))) {
                this.f43447b.run();
                return;
            }
            ArrayList arrayList2 = null;
            d dVar = new d();
            float f15 = this.f43450e;
            boolean z15 = f15 > h.this.f43419o;
            float f16 = f15 - h.this.f43419o;
            Set<e> set = h.this.f43413i;
            try {
                latLngBoundsA = this.f43448c.a().f136315e;
            } catch (Exception e15) {
                e15.printStackTrace();
                latLngBoundsA = LatLngBounds.h().b(new LatLng(0.0d, 0.0d)).a();
            }
            if (h.this.f43417m == null || !h.this.f43409e) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (bm.a<T> aVar : h.this.f43417m) {
                    if (h.this.g0(aVar) && latLngBoundsA.m(aVar.getPosition())) {
                        arrayList.add(this.f43449d.b(aVar.getPosition()));
                    }
                }
            }
            Set setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (bm.a<T> aVar2 : this.f43446a) {
                boolean zM = latLngBoundsA.m(aVar2.getPosition());
                if (z15 && zM && h.this.f43409e) {
                    Point pointH = h.this.H(arrayList, this.f43449d.b(aVar2.getPosition()));
                    if (pointH != null) {
                        dVar.a(true, new b(aVar2, setNewSetFromMap, this.f43449d.a(pointH)));
                    } else {
                        dVar.a(true, new b(aVar2, setNewSetFromMap, null));
                    }
                } else {
                    dVar.a(zM, new b(aVar2, setNewSetFromMap, null));
                }
            }
            dVar.h();
            set.removeAll(setNewSetFromMap);
            if (h.this.f43409e) {
                arrayList2 = new ArrayList();
                for (bm.a<T> aVar3 : this.f43446a) {
                    if (h.this.g0(aVar3) && latLngBoundsA.m(aVar3.getPosition())) {
                        arrayList2.add(this.f43449d.b(aVar3.getPosition()));
                    }
                }
            }
            for (e eVar : set) {
                boolean zM2 = latLngBoundsA.m(eVar.f43445b);
                if (z15 || f16 <= -3.0f || !zM2 || !h.this.f43409e) {
                    dVar.f(zM2, eVar.f43444a);
                } else {
                    Point pointH2 = h.this.H(arrayList2, this.f43449d.b(eVar.f43445b));
                    if (pointH2 != null) {
                        dVar.c(eVar, eVar.f43445b, this.f43449d.a(pointH2));
                    } else {
                        dVar.f(true, eVar.f43444a);
                    }
                }
            }
            dVar.h();
            h.this.f43413i = setNewSetFromMap;
            h.this.f43417m = this.f43446a;
            h.this.f43419o = f15;
            this.f43447b.run();
        }

        private f(Set<? extends bm.a<T>> set) {
            this.f43446a = set;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"HandlerLeak"})
    class g extends Handler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f43452a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private h<T>.f f43453b;

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void b() {
            sendEmptyMessage(1);
        }

        public void c(Set<? extends bm.a<T>> set) {
            synchronized (this) {
                this.f43453b = new f(set);
            }
            sendEmptyMessage(0);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            h<T>.f fVar;
            if (message.what == 1) {
                this.f43452a = false;
                if (this.f43453b != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.f43452a || this.f43453b == null) {
                return;
            }
            lh.j jVarG = h.this.f43405a.g();
            synchronized (this) {
                fVar = this.f43453b;
                this.f43453b = null;
                this.f43452a = true;
            }
            fVar.a(new Runnable() { // from class: dm.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f43455a.b();
                }
            });
            fVar.c(jVarG);
            fVar.b(h.this.f43405a.f().f31420b);
            h.this.f43411g.execute(fVar);
        }

        private g() {
            this.f43452a = false;
            this.f43453b = null;
        }
    }

    public h(Context context, lh.c cVar, bm.c<T> cVar2) {
        this.f43415k = new c<>();
        this.f43418n = new c<>();
        this.f43420p = new g();
        this.f43405a = cVar;
        this.f43408d = context.getResources().getDisplayMetrics().density;
        km.b bVar = new km.b(context);
        this.f43406b = bVar;
        bVar.g(X(context));
        bVar.i(am.e.f7766c);
        bVar.e(W());
        this.f43407c = cVar2;
    }

    private static double G(Point point, Point point2) {
        double d15 = point.x;
        double d16 = point2.x;
        double d17 = (d15 - d16) * (d15 - d16);
        double d18 = point.y;
        double d19 = point2.y;
        return d17 + ((d18 - d19) * (d18 - d19));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Point H(List<Point> list, Point point) {
        Point point2 = null;
        if (list != null && !list.isEmpty()) {
            int iG = this.f43407c.h().g();
            double d15 = iG * iG;
            for (Point point3 : list) {
                double dG = G(point3, point);
                if (dG < d15) {
                    point2 = point3;
                    d15 = dG;
                }
            }
        }
        return point2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Set<? extends bm.a<T>> P(Set<? extends bm.a<T>> set) {
        return set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean Q(nh.h hVar) {
        bm.c.e<T> eVar = this.f43421q;
        return eVar != null && eVar.a(this.f43415k.a(hVar));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void R(nh.h hVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void S(nh.h hVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean T(nh.h hVar) {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void U(nh.h hVar) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void V(nh.h hVar) {
    }

    private LayerDrawable W() {
        this.f43412h = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.f43412h});
        int i15 = (int) (this.f43408d * 3.0f);
        layerDrawable.setLayerInset(1, i15, i15, i15, i15);
        return layerDrawable;
    }

    private km.c X(Context context) {
        km.c cVar = new km.c(context);
        cVar.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        cVar.setId(am.c.f7762a);
        int i15 = (int) (this.f43408d * 12.0f);
        cVar.setPadding(i15, i15, i15, i15);
        return cVar;
    }

    protected int I(bm.a<T> aVar) {
        int size = aVar.getSize();
        int i15 = 0;
        if (size <= f43403r[0]) {
            return size;
        }
        while (true) {
            int[] iArr = f43403r;
            if (i15 >= iArr.length - 1) {
                return iArr[iArr.length - 1];
            }
            int i16 = i15 + 1;
            if (size < iArr[i16]) {
                return iArr[i15];
            }
            i15 = i16;
        }
    }

    protected String J(int i15) {
        if (i15 < f43403r[0]) {
            return String.valueOf(i15);
        }
        return i15 + "+";
    }

    public int K(int i15) {
        return am.e.f7766c;
    }

    public int L(int i15) {
        float fMin = 300.0f - Math.min(i15, 300.0f);
        return Color.HSVToColor(new float[]{((fMin * fMin) / 90000.0f) * 220.0f, 1.0f, 0.6f});
    }

    protected nh.b M(bm.a<T> aVar) {
        int I = I(aVar);
        nh.b bVar = this.f43414j.get(I);
        if (bVar != null) {
            return bVar;
        }
        this.f43412h.getPaint().setColor(L(I));
        this.f43406b.i(K(I));
        nh.b bVarA = nh.c.a(this.f43406b.d(J(I)));
        this.f43414j.put(I, bVarA);
        return bVarA;
    }

    public nh.h N(bm.a<T> aVar) {
        return this.f43418n.b(aVar);
    }

    public nh.h O(T t15) {
        return this.f43415k.b(t15);
    }

    protected void Y(T t15, nh.i iVar) {
        if (t15.getContentDescription() != null && t15.b() != null) {
            iVar.t0(t15.getContentDescription());
            iVar.n0(t15.b());
        } else if (t15.getContentDescription() != null) {
            iVar.t0(t15.getContentDescription());
        } else if (t15.b() != null) {
            iVar.t0(t15.b());
        }
        if (t15.a() != null) {
            iVar.C0(t15.a().floatValue());
        }
    }

    protected void Z(bm.a<T> aVar, nh.i iVar) {
        Float fA;
        iVar.O(M(aVar));
        ArrayList arrayList = new ArrayList(aVar.a());
        if (arrayList.isEmpty() || (fA = ((bm.b) arrayList.get(0)).a()) == null) {
            return;
        }
        iVar.C0(fA.floatValue());
    }

    @Override // dm.a
    public void a(bm.c.g<T> gVar) {
    }

    protected void a0(T t15, nh.h hVar) {
    }

    @Override // dm.a
    public void b(bm.c.d<T> dVar) {
    }

    protected void b0(T t15, nh.h hVar) {
        boolean z15 = true;
        boolean z16 = false;
        if (t15.getContentDescription() == null || t15.b() == null) {
            if (t15.b() != null && !t15.b().equals(hVar.c())) {
                hVar.p(t15.b());
            } else if (t15.getContentDescription() != null && !t15.getContentDescription().equals(hVar.c())) {
                hVar.p(t15.getContentDescription());
            }
            z16 = true;
        } else {
            if (!t15.getContentDescription().equals(hVar.c())) {
                hVar.p(t15.getContentDescription());
                z16 = true;
            }
            if (!t15.b().equals(hVar.b())) {
                hVar.n(t15.b());
                z16 = true;
            }
        }
        if (hVar.a().equals(t15.getPosition())) {
            z15 = z16;
        } else {
            hVar.l(t15.getPosition());
            if (t15.a() != null) {
                hVar.r(t15.a().floatValue());
            }
        }
        if (z15 && hVar.d()) {
            hVar.s();
        }
    }

    protected void c0(bm.a<T> aVar, nh.h hVar) {
    }

    @Override // dm.a
    public void d(bm.c.InterfaceC0519c<T> interfaceC0519c) {
    }

    protected void d0(bm.a<T> aVar, nh.h hVar) {
        hVar.j(M(aVar));
    }

    @Override // dm.a
    public void e() {
        this.f43407c.j().l(new lh.c.p() { // from class: dm.b
            @Override // lh.c.p
            public final boolean d(nh.h hVar) {
                return this.f43397a.Q(hVar);
            }
        });
        this.f43407c.j().j(new lh.c.j() { // from class: dm.c
            @Override // lh.c.j
            public final void f(nh.h hVar) {
                this.f43398a.R(hVar);
            }
        });
        this.f43407c.j().k(new lh.c.l() { // from class: dm.d
            @Override // lh.c.l
            public final void g(nh.h hVar) {
                this.f43399a.S(hVar);
            }
        });
        this.f43407c.i().l(new lh.c.p() { // from class: dm.e
            @Override // lh.c.p
            public final boolean d(nh.h hVar) {
                return this.f43400a.T(hVar);
            }
        });
        this.f43407c.i().j(new lh.c.j() { // from class: dm.f
            @Override // lh.c.j
            public final void f(nh.h hVar) {
                this.f43401a.U(hVar);
            }
        });
        this.f43407c.i().k(new lh.c.l() { // from class: dm.g
            @Override // lh.c.l
            public final void g(nh.h hVar) {
                this.f43402a.V(hVar);
            }
        });
    }

    public void e0(int i15) {
        this.f43416l = i15;
    }

    @Override // dm.a
    public void f(bm.c.f<T> fVar) {
    }

    protected boolean f0(Set<? extends bm.a<T>> set, Set<? extends bm.a<T>> set2) {
        return !set2.equals(set);
    }

    @Override // dm.a
    public void g() {
        this.f43407c.j().l(null);
        this.f43407c.j().j(null);
        this.f43407c.j().k(null);
        this.f43407c.i().l(null);
        this.f43407c.i().j(null);
        this.f43407c.i().k(null);
    }

    protected boolean g0(bm.a<T> aVar) {
        return aVar.getSize() >= this.f43416l;
    }

    @Override // dm.a
    public void h(bm.c.e<T> eVar) {
        this.f43421q = eVar;
    }

    @Override // dm.a
    public void i(Set<? extends bm.a<T>> set) {
        this.f43420p.c(set);
    }

    @Override // dm.a
    public void j(bm.c.b<T> bVar) {
    }
}
