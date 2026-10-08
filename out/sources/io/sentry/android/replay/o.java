package io.sentry.android.replay;

import android.os.Handler;
import android.os.Looper;
import android.view.View;
import io.sentry.g1;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import oq.i0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0003R\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\r\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R$\u0010\u001a\u001a\u0012\u0012\u0004\u0012\u00020\u00160\u0015j\b\u0012\u0004\u0012\u00020\u0016`\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lio/sentry/android/replay/o;", "Ljava/io/Closeable;", "<init>", "()V", "Loq/i0;", "close", "Ljava/util/concurrent/atomic/AtomicBoolean;", "a", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isClosed", "Lio/sentry/util/a;", "b", "Lio/sentry/util/a;", "viewListLock", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/sentry/android/replay/d;", "c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "p", "()Ljava/util/concurrent/CopyOnWriteArrayList;", "listeners", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "delegatingViewList", "e", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class o implements Closeable {

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f94472f = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final AtomicBoolean isClosed;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final io.sentry.util.a viewListLock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<d> listeners;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ArrayList<View> delegatingViewList;

    /* JADX INFO: renamed from: io.sentry.android.replay.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lio/sentry/android/replay/o$a;", "", "<init>", "()V", "Lio/sentry/android/replay/o;", "b", "()Lio/sentry/android/replay/o;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: io.sentry.android.replay.o$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u00022\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00010\u0000j\b\u0012\u0004\u0012\u00020\u0001`\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "mViews", "c", "(Ljava/util/ArrayList;)Ljava/util/ArrayList;"}, k = 3, mv = {1, 9, 0})
        static final class C2226a extends fr.w implements er.l<ArrayList<View>, ArrayList<View>> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o f94477b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C2226a(o oVar) {
                super(1);
                this.f94477b = oVar;
            }

            @Override // er.l
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final ArrayList<View> b(ArrayList<View> arrayList) throws Exception {
                g1 g1VarA = this.f94477b.viewListLock.a();
                try {
                    ArrayList<View> arrayList2 = this.f94477b.delegatingViewList;
                    arrayList2.addAll(arrayList);
                    cr.a.a(g1VarA, null);
                    return arrayList2;
                } catch (Throwable th4) {
                    try {
                        throw th4;
                    } catch (Throwable th5) {
                        cr.a.a(g1VarA, th4);
                        throw th5;
                    }
                }
            }
        }

        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(o oVar) {
            if (oVar.isClosed.get()) {
                return;
            }
            x.f94592a.e(new C2226a(oVar));
        }

        public final o b() {
            final o oVar = new o(null);
            new Handler(Looper.getMainLooper()).postAtFrontOfQueue(new Runnable() { // from class: io.sentry.android.replay.n
                @Override // java.lang.Runnable
                public final void run() {
                    o.Companion.c(oVar);
                }
            });
            return oVar;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"io/sentry/android/replay/o$b", "Ljava/util/ArrayList;", "Landroid/view/View;", "Lkotlin/collections/ArrayList;", "", "elements", "", "addAll", "(Ljava/util/Collection;)Z", "element", "e", "(Landroid/view/View;)Z", "", "index", "t", "(I)Landroid/view/View;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends ArrayList<View> {
        b() {
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public boolean addAll(Collection<? extends View> elements) {
            for (d dVar : o.this.p()) {
                Iterator<T> it = elements.iterator();
                while (it.hasNext()) {
                    dVar.b((View) it.next(), true);
                }
            }
            return super.addAll(elements);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean contains(Object obj) {
            if (obj instanceof View) {
                return g((View) obj);
            }
            return false;
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(View element) {
            Iterator<T> it = o.this.p().iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(element, true);
            }
            return super.add(element);
        }

        public /* bridge */ boolean g(View view) {
            return super.contains(view);
        }

        public /* bridge */ int i() {
            return super.size();
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj instanceof View) {
                return j((View) obj);
            }
            return -1;
        }

        public /* bridge */ int j(View view) {
            return super.indexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj instanceof View) {
                return n((View) obj);
            }
            return -1;
        }

        public /* bridge */ int n(View view) {
            return super.lastIndexOf(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractList, java.util.List
        /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
        public final /* bridge */ View remove(int i15) {
            return t(i15);
        }

        public /* bridge */ boolean s(View view) {
            return super.remove(view);
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ int size() {
            return i();
        }

        public View t(int index) {
            View view = (View) super.remove(index);
            Iterator<T> it = o.this.p().iterator();
            while (it.hasNext()) {
                ((d) it.next()).b(view, false);
            }
            return view;
        }

        @Override // java.util.ArrayList, java.util.AbstractCollection, java.util.Collection, java.util.List
        public final /* bridge */ boolean remove(Object obj) {
            if (obj instanceof View) {
                return s((View) obj);
            }
            return false;
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"io/sentry/android/replay/o$c", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Lio/sentry/android/replay/d;", "element", "", "e", "(Lio/sentry/android/replay/d;)Z", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends CopyOnWriteArrayList<d> {
        c() {
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean contains(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return g((d) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public boolean add(d element) throws Exception {
            g1 g1VarA = o.this.viewListLock.a();
            try {
                for (View view : o.this.delegatingViewList) {
                    if (element != null) {
                        element.b(view, true);
                    }
                }
                i0 i0Var = i0.f148189a;
                cr.a.a(g1VarA, null);
                return super.add(element);
            } catch (Throwable th4) {
                try {
                    throw th4;
                } catch (Throwable th5) {
                    cr.a.a(g1VarA, th4);
                    throw th5;
                }
            }
        }

        public /* bridge */ boolean g(d dVar) {
            return super.contains(dVar);
        }

        public /* bridge */ int i() {
            return super.size();
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int indexOf(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return j((d) obj);
            }
            return -1;
        }

        public /* bridge */ int j(d dVar) {
            return super.indexOf(dVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List
        public final /* bridge */ int lastIndexOf(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return n((d) obj);
            }
            return -1;
        }

        public /* bridge */ int n(d dVar) {
            return super.lastIndexOf(dVar);
        }

        public /* bridge */ boolean o(d dVar) {
            return super.remove(dVar);
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ boolean remove(Object obj) {
            if (obj == null ? true : obj instanceof d) {
                return o((d) obj);
            }
            return false;
        }

        @Override // java.util.concurrent.CopyOnWriteArrayList, java.util.List, java.util.Collection
        public final /* bridge */ int size() {
            return i();
        }
    }

    public /* synthetic */ o(fr.k kVar) {
        this();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.isClosed.set(true);
        this.listeners.clear();
    }

    public final CopyOnWriteArrayList<d> p() {
        return this.listeners;
    }

    private o() {
        this.isClosed = new AtomicBoolean(false);
        this.viewListLock = new io.sentry.util.a();
        this.listeners = new c();
        this.delegatingViewList = new b();
    }
}
