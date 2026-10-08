package al;

import android.content.Context;
import android.os.Process;
import er.p;
import fr.j0;
import fr.q0;
import fr.t;
import io.sentry.android.core.c2;
import java.util.List;
import java.util.Map;
import ju.j;
import ju.p0;
import mr.l;
import mu.g;
import oq.i0;
import oq.u;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;
import tq.e;
import u6.i;
import vq.k;
import y6.h;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J)\u0010\f\u001a\u00028\u0000\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000b\u001a\u00028\u0000¢\u0006\u0004\b\f\u0010\rJ)\u0010\u0010\u001a\u00020\u000f\"\u0004\b\u0000\u0010\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\t2\u0006\u0010\u000e\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u001d\u0010\u0013\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t\u0012\u0004\u0012\u00020\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0019\u001a\u00020\u000f2\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00170\u0015¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020$0#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R%\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(*\u00020\u00028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lal/c;", "", "Landroid/content/Context;", "context", "", "name", "<init>", "(Landroid/content/Context;Ljava/lang/String;)V", "T", "Ly6/h$a;", "key", "defaultValue", "j", "(Ly6/h$a;Ljava/lang/Object;)Ljava/lang/Object;", "value", "Ly6/h;", "k", "(Ly6/h$a;Ljava/lang/Object;)Ly6/h;", "", "h", "()Ljava/util/Map;", "Lkotlin/Function1;", "Ly6/d;", "Loq/i0;", "transform", "g", "(Ler/l;)Ly6/h;", "a", "Landroid/content/Context;", "getContext", "()Landroid/content/Context;", "b", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Ljava/lang/ThreadLocal;", "", "c", "Ljava/lang/ThreadLocal;", "editLock", "Lu6/i;", "d", "Lir/d;", "i", "(Landroid/content/Context;)Lu6/i;", "dataStore", "e", "Lu6/i;", "com.google.firebase-firebase-common"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    static final /* synthetic */ l<Object>[] f7258f = {q0.k(new j0(c.class, "dataStore", "getDataStore(Landroid/content/Context;)Landroidx/datastore/core/DataStore;", 0))};

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String name;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final ThreadLocal<Boolean> editLock = new ThreadLocal<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final ir.d dataStore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final i<h> dataStore;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ly6/h;", "<anonymous>", "(Lju/p0;)Ly6/h;"}, k = 3, mv = {2, 0, 0})
    static final class a extends k implements p<p0, e<? super h>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7264e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ er.l<y6.d, i0> f7266g;

        /* JADX INFO: renamed from: al.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/d;", "it", "Loq/i0;", "<anonymous>", "(Ly6/d;)V"}, k = 3, mv = {2, 0, 0})
        static final class C0162a extends k implements p<y6.d, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7267e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f7268f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ er.l<y6.d, i0> f7269g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0162a(er.l<? super y6.d, i0> lVar, e<? super C0162a> eVar) {
                super(2, eVar);
                this.f7269g = lVar;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f7267e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                this.f7269g.b((y6.d) this.f7268f);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(y6.d dVar, e<? super i0> eVar) {
                return ((C0162a) v(dVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                C0162a c0162a = new C0162a(this.f7269g, eVar);
                c0162a.f7268f = obj;
                return c0162a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(er.l<? super y6.d, i0> lVar, e<? super a> eVar) {
            super(2, eVar);
            this.f7266g = lVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7264e;
            try {
                if (i15 == 0) {
                    u.b(obj);
                    if (t.c(c.this.editLock.get(), vq.b.a(true))) {
                        throw new IllegalStateException("Don't call JavaDataStorage.edit() from within an existing edit() callback.\nThis causes deadlocks, and is generally indicative of a code smell.\nInstead, either pass around the initial `MutablePreferences` instance, or don't do everything in a single callback. ");
                    }
                    c.this.editLock.set(vq.b.a(true));
                    i iVar = c.this.dataStore;
                    C0162a c0162a = new C0162a(this.f7266g, null);
                    this.f7264e = 1;
                    obj = y6.l.a(iVar, c0162a, this);
                    if (obj == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                h hVar = (h) obj;
                c.this.editLock.set(vq.b.a(false));
                return hVar;
            } catch (Throwable th4) {
                c.this.editLock.set(vq.b.a(false));
                throw th4;
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super h> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return c.this.new a(this.f7266g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0012\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0012\u0004\u0012\u00020\u00030\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "", "Ly6/h$a;", "", "<anonymous>", "(Lju/p0;)Ljava/util/Map;"}, k = 3, mv = {2, 0, 0})
    static final class b extends k implements p<p0, e<? super Map<h.a<?>, ? extends Object>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7270e;

        b(e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Map<h.a<?>, Object> mapA;
            Object objE = uq.b.e();
            int i15 = this.f7270e;
            if (i15 == 0) {
                u.b(obj);
                g data = c.this.dataStore.getData();
                this.f7270e = 1;
                obj = mu.i.B(data, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            h hVar = (h) obj;
            return (hVar == null || (mapA = hVar.a()) == null) ? v0.i() : mapA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super Map<h.a<?>, ? extends Object>> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return c.this.new b(eVar);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: al.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"T", "Lju/p0;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
    static final class C0163c<T> extends k implements p<p0, e<? super T>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7272e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.a<T> f7274g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f7275h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0163c(h.a<T> aVar, T t15, e<? super C0163c> eVar) {
            super(2, eVar);
            this.f7274g = aVar;
            this.f7275h = t15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objB;
            Object objE = uq.b.e();
            int i15 = this.f7272e;
            if (i15 == 0) {
                u.b(obj);
                g<T> data = c.this.dataStore.getData();
                this.f7272e = 1;
                obj = mu.i.B(data, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            h hVar = (h) obj;
            return (hVar == null || (objB = hVar.b(this.f7274g)) == null) ? this.f7275h : objB;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super T> eVar) {
            return ((C0163c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return c.this.new C0163c(this.f7274g, this.f7275h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Ly6/h;", "<anonymous>", "(Lju/p0;)Ly6/h;"}, k = 3, mv = {2, 0, 0})
    static final class d extends k implements p<p0, e<? super h>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f7276e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ h.a<T> f7278g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ T f7279h;

        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ly6/d;", "it", "Loq/i0;", "<anonymous>", "(Ly6/d;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends k implements p<y6.d, e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f7280e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            /* synthetic */ Object f7281f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ h.a<T> f7282g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ T f7283h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(h.a<T> aVar, T t15, e<? super a> eVar) {
                super(2, eVar);
                this.f7282g = aVar;
                this.f7283h = t15;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f7280e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                ((y6.d) this.f7281f).k(this.f7282g, this.f7283h);
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(y6.d dVar, e<? super i0> eVar) {
                return ((a) v(dVar, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final e<i0> v(Object obj, e<?> eVar) {
                a aVar = new a(this.f7282g, this.f7283h, eVar);
                aVar.f7281f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(h.a<T> aVar, T t15, e<? super d> eVar) {
            super(2, eVar);
            this.f7278g = aVar;
            this.f7279h = t15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f7276e;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
                return obj;
            }
            u.b(obj);
            i iVar = c.this.dataStore;
            a aVar = new a(this.f7278g, this.f7279h, null);
            this.f7276e = 1;
            Object objA = y6.l.a(iVar, aVar, this);
            return objA == objE ? objE : objA;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, e<? super h> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final e<i0> v(Object obj, e<?> eVar) {
            return c.this.new d(this.f7278g, this.f7279h, eVar);
        }
    }

    public c(Context context, String str) {
        this.context = context;
        this.name = str;
        this.dataStore = x6.b.c(str, new v6.b(new er.l() { // from class: al.a
            @Override // er.l
            public final Object b(Object obj) {
                return c.e(this.f7256a, (u6.d) obj);
            }
        }), new er.l() { // from class: al.b
            @Override // er.l
            public final Object b(Object obj) {
                return c.f(this.f7257a, (Context) obj);
            }
        }, null, 8, null);
        this.dataStore = i(context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h e(c cVar, u6.d dVar) {
        c2.h(q0.c(c.class).D(), "CorruptionException in " + cVar.name + " DataStore running in process " + Process.myPid(), dVar);
        return y6.i.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List f(c cVar, Context context) {
        return v.e(x6.k.b(context, cVar.name, null, 4, null));
    }

    private final i<h> i(Context context) {
        return (i) this.dataStore.a(context, f7258f[0]);
    }

    public final h g(er.l<? super y6.d, i0> transform) {
        return (h) j.b(null, new a(transform, null), 1, null);
    }

    public final Map<h.a<?>, Object> h() {
        return (Map) j.b(null, new b(null), 1, null);
    }

    public final <T> T j(h.a<T> key, T defaultValue) {
        return (T) j.b(null, new C0163c(key, defaultValue, null), 1, null);
    }

    public final <T> h k(h.a<T> key, T value) {
        return (h) j.b(null, new d(key, value, null), 1, null);
    }
}
