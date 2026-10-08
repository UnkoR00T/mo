package t10;

import android.content.Context;
import android.content.SharedPreferences;
import er.p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import ju.p0;
import oq.i0;
import oq.u;
import oq.y;
import p071kotlin.Metadata;
import pq.v;
import pq.v0;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010#\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010 \n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0015\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b\u0015\u0010\u0013J\u001a\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u0016\u0010\u0017J \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0018\u0010\u0019J>\u0010\u001d\u001a(\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\n0\n\u0018\u0001 \u001b*\u0012\u0012\f\u0012\n \u001b*\u0004\u0018\u00010\n0\n\u0018\u00010\u001c0\u001a2\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b\u001d\u0010\u0017J&\u0010\u001e\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\n0\u001cH\u0096@¢\u0006\u0004\b\u001e\u0010\u001fJ \u0010!\u001a\u00020 2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020 H\u0096@¢\u0006\u0004\b!\u0010\"J \u0010#\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020 H\u0096@¢\u0006\u0004\b#\u0010\"J\u0018\u0010$\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b$\u0010\u0017J\u0010\u0010%\u001a\u00020\u0010H\u0096@¢\u0006\u0004\b%\u0010&J\u0018\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0096@¢\u0006\u0004\b'\u0010\u0017J\u0016\u0010)\u001a\b\u0012\u0004\u0012\u00020\u000e0(H\u0096@¢\u0006\u0004\b)\u0010&J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0006\u0012\u0004\u0018\u00010+0*H\u0096@¢\u0006\u0004\b,\u0010&R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010-R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010/R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00100R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00101R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u00103\u001a\u0004\b4\u00105¨\u00067"}, d2 = {"Lt10/j;", "Lcz/b;", "Landroid/content/Context;", "context", "Lt10/k;", "sharedPreferencesFactory", "Lxw/d;", "dispatcherProvider", "Lcz/d;", "type", "", "identifier", "<init>", "(Landroid/content/Context;Lt10/k;Lxw/d;Lcz/d;Ljava/lang/String;)V", "Lcz/b$a;", "key", "", "default", "h", "(Ljava/lang/String;ZLtq/e;)Ljava/lang/Object;", "value", "c", "j", "(Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "e", "(Ljava/lang/String;Ljava/lang/String;Ltq/e;)Ljava/lang/Object;", "", "kotlin.jvm.PlatformType", "", "g", "l", "(Ljava/lang/String;Ljava/util/Set;Ltq/e;)Ljava/lang/Object;", "", "f", "(Ljava/lang/String;JLtq/e;)Ljava/lang/Object;", "m", "k", "a", "(Ltq/e;)Ljava/lang/Object;", "d", "", "i", "", "", "b", "Landroid/content/Context;", "Lt10/k;", "Lxw/d;", "Lcz/d;", "Ljava/lang/String;", "Landroid/content/SharedPreferences;", "Loq/k;", "r", "()Landroid/content/SharedPreferences;", "preferences", "storage_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class j implements cz.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final t10.k sharedPreferencesFactory;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final xw.d dispatcherProvider;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final cz.d type;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final String identifier;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final oq.k preferences = oq.l.a(new er.a() { // from class: t10.i
        @Override // er.a
        public final Object a() {
            return j.s(this.f186900a);
        }
    });

    @Metadata(k = 3, mv = {2, 2, 0}, xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f186907a;

        static {
            int[] iArr = new int[cz.d.values().length];
            try {
                iArr[cz.d.PLAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[cz.d.ENCRYPTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f186907a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class b extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186908e;

        b(tq.e<? super b> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            boolean zDeleteSharedPreferences;
            uq.b.e();
            if (this.f186908e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            try {
                zDeleteSharedPreferences = j.this.r().edit().clear().commit();
            } catch (CancellationException unused) {
                zDeleteSharedPreferences = false;
            } catch (Exception unused2) {
                zDeleteSharedPreferences = j.this.context.deleteSharedPreferences(j.this.identifier);
            }
            return vq.b.a(zDeleteSharedPreferences);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((b) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new b(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class c extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186910e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186912g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(String str, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f186912g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186910e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().contains(this.f186912g));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((c) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new c(this.f186912g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class d extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186913e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186915g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(String str, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f186915g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186913e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().edit().remove(this.f186915g).commit());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((d) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new d(this.f186915g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lcz/b$a;", "<anonymous>", "(Lju/p0;)Ljava/util/List;"}, k = 3, mv = {2, 2, 0})
    static final class e extends vq.k implements p<p0, tq.e<? super List<? extends cz.b.a>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186916e;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186916e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            Set<String> setKeySet = j.this.r().getAll().keySet();
            ArrayList arrayList = new ArrayList(v.y(setKeySet, 10));
            Iterator<T> it = setKeySet.iterator();
            while (it.hasNext()) {
                arrayList.add(cz.b.a.a(cz.b.a.b((String) it.next())));
            }
            return arrayList;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super List<cz.b.a>> eVar) {
            return ((e) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new e(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class f extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186918e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186920g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f186921h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(String str, boolean z15, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f186920g = str;
            this.f186921h = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186918e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().getBoolean(this.f186920g, this.f186921h));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new f(this.f186920g, this.f186921h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)J"}, k = 3, mv = {2, 2, 0})
    static final class g extends vq.k implements p<p0, tq.e<? super Long>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186922e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186924g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f186925h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(String str, long j15, tq.e<? super g> eVar) {
            super(2, eVar);
            this.f186924g = str;
            this.f186925h = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186922e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.f(j.this.r().getLong(this.f186924g, this.f186925h));
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Long> eVar) {
            return ((g) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new g(this.f186924g, this.f186925h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\t\u0018\u00010\u0001¢\u0006\u0002\b\u0002*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lju/p0;", "", "Lkotlin/jvm/internal/EnhancedNullability;", "<anonymous>", "(Lju/p0;)Ljava/lang/String;"}, k = 3, mv = {2, 2, 0})
    static final class h extends vq.k implements p<p0, tq.e<? super String>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186926e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186928g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(String str, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f186928g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186926e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return j.this.r().getString(this.f186928g, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super String> eVar) {
            return ((h) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new h(this.f186928g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0002\u0010\u0005\u001a(\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u0001 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00040\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lju/p0;", "", "", "kotlin.jvm.PlatformType", "", "<anonymous>", "(Lju/p0;)Ljava/util/Set;"}, k = 3, mv = {2, 2, 0})
    static final class i extends vq.k implements p<p0, tq.e<? super Set<String>>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186929e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186931g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(String str, tq.e<? super i> eVar) {
            super(2, eVar);
            this.f186931g = str;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186929e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return j.this.r().getStringSet(this.f186931g, null);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Set<String>> eVar) {
            return ((i) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new i(this.f186931g, eVar);
        }
    }

    /* JADX INFO: renamed from: t10.j$j, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class C4855j extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186932e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186934g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f186935h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4855j(String str, boolean z15, tq.e<? super C4855j> eVar) {
            super(2, eVar);
            this.f186934g = str;
            this.f186935h = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186932e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().edit().putBoolean(this.f186934g, this.f186935h).commit());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((C4855j) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new C4855j(this.f186934g, this.f186935h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class k extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186936e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186938g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f186939h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(String str, long j15, tq.e<? super k> eVar) {
            super(2, eVar);
            this.f186938g = str;
            this.f186939h = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186936e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().edit().putLong(this.f186938g, this.f186939h).commit());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((k) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new k(this.f186938g, this.f186939h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class l extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186940e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186942g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ String f186943h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        l(String str, String str2, tq.e<? super l> eVar) {
            super(2, eVar);
            this.f186942g = str;
            this.f186943h = str2;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186940e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().edit().putString(this.f186942g, this.f186943h).commit());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((l) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new l(this.f186942g, this.f186943h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "", "<anonymous>", "(Lju/p0;)Z"}, k = 3, mv = {2, 2, 0})
    static final class m extends vq.k implements p<p0, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f186944e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f186946g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Set<String> f186947h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(String str, Set<String> set, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f186946g = str;
            this.f186947h = set;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f186944e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(j.this.r().edit().putStringSet(this.f186946g, this.f186947h).commit());
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super Boolean> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return j.this.new m(this.f186946g, this.f186947h, eVar);
        }
    }

    public j(Context context, t10.k kVar, xw.d dVar, cz.d dVar2, String str) {
        this.context = context;
        this.sharedPreferencesFactory = kVar;
        this.dispatcherProvider = dVar;
        this.type = dVar2;
        this.identifier = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences r() {
        return (SharedPreferences) this.preferences.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SharedPreferences s(j jVar) {
        t10.k kVar = jVar.sharedPreferencesFactory;
        int i15 = a.f186907a[jVar.type.ordinal()];
        if (i15 == 1) {
            return kVar.c(jVar.identifier);
        }
        if (i15 == 2) {
            return t10.k.b(kVar, jVar.identifier, null, 2, null);
        }
        throw new oq.p();
    }

    @Override // cz.b
    public Object a(tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new b(null), eVar);
    }

    @Override // cz.b
    public Object b(tq.e<? super Map<cz.b.a, ? extends Object>> eVar) {
        Map<String, ?> all = r().getAll();
        ArrayList arrayList = new ArrayList(all.size());
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            arrayList.add(y.a(cz.b.a.a(cz.b.a.b(entry.getKey())), entry.getValue()));
        }
        return v0.s(arrayList);
    }

    @Override // cz.b
    public Object c(String str, boolean z15, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new C4855j(str, z15, null), eVar);
    }

    @Override // cz.b
    public Object d(String str, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new c(str, null), eVar);
    }

    @Override // cz.b
    public Object e(String str, String str2, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new l(str, str2, null), eVar);
    }

    @Override // cz.b
    public Object f(String str, long j15, tq.e<? super Long> eVar) {
        return this.dispatcherProvider.a(new g(str, j15, null), eVar);
    }

    @Override // cz.b
    public Object g(String str, tq.e<? super Set<String>> eVar) {
        return this.dispatcherProvider.a(new i(str, null), eVar);
    }

    @Override // cz.b
    public Object h(String str, boolean z15, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new f(str, z15, null), eVar);
    }

    @Override // cz.b
    public Object i(tq.e<? super List<cz.b.a>> eVar) {
        return this.dispatcherProvider.a(new e(null), eVar);
    }

    @Override // cz.b
    public Object j(String str, tq.e<? super String> eVar) {
        return this.dispatcherProvider.a(new h(str, null), eVar);
    }

    @Override // cz.b
    public Object k(String str, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new d(str, null), eVar);
    }

    @Override // cz.b
    public Object l(String str, Set<String> set, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new m(str, set, null), eVar);
    }

    @Override // cz.b
    public Object m(String str, long j15, tq.e<? super Boolean> eVar) {
        return this.dispatcherProvider.a(new k(str, j15, null), eVar);
    }
}
