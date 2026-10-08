package androidx.p016lifecycle;

import android.app.Application;
import fr.k;
import java.lang.reflect.InvocationTargetException;
import p071kotlin.Metadata;
import p7.CreationExtras;
import r7.h;
import r7.j;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0016\u0018\u0000 \u001c2\u00020\u0001:\u0005\u0015\u001f \u0018\u001cB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B#\b\u0017\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0004\u0010\fB\u0011\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0004\u0010\u000fB\u0019\b\u0016\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0004\u0010\u0010J(\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u0015\u0010\u0016J(\u0010\u0018\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J0\u0010\u001c\u001a\u00028\u0000\"\b\b\u0000\u0010\u0012*\u00020\u00112\u0006\u0010\u001b\u001a\u00020\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0087\u0002¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001e¨\u0006!"}, d2 = {"Landroidx/lifecycle/w0;", "", "Lr7/h;", "impl", "<init>", "(Lr7/h;)V", "Landroidx/lifecycle/x0;", "store", "Landroidx/lifecycle/w0$c;", "factory", "Lp7/a;", "defaultCreationExtras", "(Landroidx/lifecycle/x0;Landroidx/lifecycle/w0$c;Lp7/a;)V", "Landroidx/lifecycle/y0;", "owner", "(Landroidx/lifecycle/y0;)V", "(Landroidx/lifecycle/y0;Landroidx/lifecycle/w0$c;)V", "Landroidx/lifecycle/t0;", "T", "Lmr/c;", "modelClass", "c", "(Lmr/c;)Landroidx/lifecycle/t0;", "Ljava/lang/Class;", "a", "(Ljava/lang/Class;)Landroidx/lifecycle/t0;", "", "key", "b", "(Ljava/lang/String;Lmr/c;)Landroidx/lifecycle/t0;", "Lr7/h;", "e", "d", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class w0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final CreationExtras.c<String> f12841c;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final h impl;

    /* JADX INFO: renamed from: androidx.lifecycle.w0$b, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J+\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u000f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0007¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Landroidx/lifecycle/w0$b;", "", "<init>", "()V", "Landroidx/lifecycle/y0;", "owner", "Landroidx/lifecycle/w0$c;", "factory", "Lp7/a;", "extras", "Landroidx/lifecycle/w0;", "b", "(Landroidx/lifecycle/y0;Landroidx/lifecycle/w0$c;Lp7/a;)Landroidx/lifecycle/w0;", "Landroidx/lifecycle/x0;", "store", "a", "(Landroidx/lifecycle/x0;Landroidx/lifecycle/w0$c;Lp7/a;)Landroidx/lifecycle/w0;", "Lp7/a$c;", "", "VIEW_MODEL_KEY", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public static /* synthetic */ w0 c(Companion companion, x0 x0Var, c cVar, CreationExtras creationExtras, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                cVar = r7.d.f172247b;
            }
            if ((i15 & 4) != 0) {
                creationExtras = CreationExtras.b.f153222c;
            }
            return companion.a(x0Var, cVar, creationExtras);
        }

        public static /* synthetic */ w0 d(Companion companion, y0 y0Var, c cVar, CreationExtras creationExtras, int i15, Object obj) {
            if ((i15 & 2) != 0) {
                cVar = j.f172257a.d(y0Var);
            }
            if ((i15 & 4) != 0) {
                creationExtras = j.f172257a.c(y0Var);
            }
            return companion.b(y0Var, cVar, creationExtras);
        }

        public final w0 a(x0 store, c factory, CreationExtras extras) {
            return new w0(store, factory, extras);
        }

        public final w0 b(y0 owner, c factory, CreationExtras extras) {
            return new w0(owner.h(), factory, extras);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000 \n2\u00020\u0001:\u0001\nJ'\u0010\u0006\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J/\u0010\n\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00042\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\n\u0010\u000bJ/\u0010\r\u001a\u00028\u0000\"\b\b\u0000\u0010\u0003*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\r\u0010\u000eø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u000fÀ\u0006\u0001"}, d2 = {"Landroidx/lifecycle/w0$c;", "", "Landroidx/lifecycle/t0;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/t0;", "Lp7/a;", "extras", "a", "(Ljava/lang/Class;Lp7/a;)Landroidx/lifecycle/t0;", "Lmr/c;", "c", "(Lmr/c;Lp7/a;)Landroidx/lifecycle/t0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = Companion.f12848a;

        /* JADX INFO: renamed from: androidx.lifecycle.w0$c$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/lifecycle/w0$c$a;", "", "<init>", "()V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            static final /* synthetic */ Companion f12848a = new Companion();

            private Companion() {
            }
        }

        default <T extends t0> T a(Class<T> modelClass, CreationExtras extras) {
            return (T) b(modelClass);
        }

        default <T extends t0> T b(Class<T> modelClass) {
            return (T) j.f172257a.f();
        }

        default <T extends t0> T c(mr.c<T> modelClass, CreationExtras extras) {
            return (T) a(dr.a.b(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u0000 \b2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J'\u0010\b\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ/\u0010\f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u0005*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Landroidx/lifecycle/w0$d;", "Landroidx/lifecycle/w0$c;", "<init>", "()V", "Landroidx/lifecycle/t0;", "T", "Ljava/lang/Class;", "modelClass", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/t0;", "Lp7/a;", "extras", "a", "(Ljava/lang/Class;Lp7/a;)Landroidx/lifecycle/t0;", "Lmr/c;", "c", "(Lmr/c;Lp7/a;)Landroidx/lifecycle/t0;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class d implements c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static d f12850c;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final CreationExtras.c<String> f12851d = w0.f12841c;

        /* JADX INFO: renamed from: androidx.lifecycle.w0$d$a, reason: from kotlin metadata */
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\b\u001a\u00020\u00048GX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0007\u0010\u0003\u001a\u0004\b\u0005\u0010\u0006R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/lifecycle/w0$d$a;", "", "<init>", "()V", "Landroidx/lifecycle/w0$d;", "a", "()Landroidx/lifecycle/w0$d;", "getInstance$annotations", "instance", "_instance", "Landroidx/lifecycle/w0$d;", "Lp7/a$c;", "", "VIEW_MODEL_KEY", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final d a() {
                if (d.f12850c == null) {
                    d.f12850c = new d();
                }
                return d.f12850c;
            }

            private Companion() {
            }
        }

        @Override // androidx.lifecycle.w0.c
        public <T extends t0> T a(Class<T> modelClass, CreationExtras extras) {
            return (T) b(modelClass);
        }

        @Override // androidx.lifecycle.w0.c
        public <T extends t0> T b(Class<T> modelClass) {
            return (T) r7.e.f172248a.a(modelClass);
        }

        @Override // androidx.lifecycle.w0.c
        public <T extends t0> T c(mr.c<T> modelClass, CreationExtras extras) {
            return (T) a(dr.a.b(modelClass), extras);
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/lifecycle/w0$e;", "", "<init>", "()V", "Landroidx/lifecycle/t0;", "viewModel", "Loq/i0;", "d", "(Landroidx/lifecycle/t0;)V", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class e {
        public void d(t0 viewModel) {
        }
    }

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/w0$f", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f implements CreationExtras.c<String> {
    }

    static {
        CreationExtras.Companion companion = CreationExtras.INSTANCE;
        f12841c = new f();
    }

    public w0(x0 x0Var, c cVar) {
        this(x0Var, cVar, null, 4, null);
    }

    public <T extends t0> T a(Class<T> modelClass) {
        return (T) c(dr.a.e(modelClass));
    }

    public final <T extends t0> T b(String key, mr.c<T> modelClass) {
        return (T) this.impl.d(modelClass, key);
    }

    public final <T extends t0> T c(mr.c<T> modelClass) {
        return (T) h.e(this.impl, modelClass, null, 2, null);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0016\u0018\u0000 \u00192\u00020\u0001:\u0001\u0013B\u001b\b\u0002\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B\t\b\u0016¢\u0006\u0004\b\u0006\u0010\bB\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\tJ/\u0010\u000f\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u000e\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u000f\u0010\u0010J/\u0010\u0013\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0015\u001a\u00028\u0000\"\b\b\u0000\u0010\u000b*\u00020\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00028\u00000\fH\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001a"}, d2 = {"Landroidx/lifecycle/w0$a;", "Landroidx/lifecycle/w0$d;", "Landroid/app/Application;", "application", "", "unused", "<init>", "(Landroid/app/Application;I)V", "()V", "(Landroid/app/Application;)V", "Landroidx/lifecycle/t0;", "T", "Ljava/lang/Class;", "modelClass", "app", "h", "(Ljava/lang/Class;Landroid/app/Application;)Landroidx/lifecycle/t0;", "Lp7/a;", "extras", "a", "(Ljava/lang/Class;Lp7/a;)Landroidx/lifecycle/t0;", "b", "(Ljava/lang/Class;)Landroidx/lifecycle/t0;", "e", "Landroid/app/Application;", "f", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static class a extends d {

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static a f12844g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final CreationExtras.c<Application> f12845h;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final Application application;

        /* JADX INFO: renamed from: androidx.lifecycle.w0$a$a, reason: collision with other inner class name and from kotlin metadata */
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\nR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u000b8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Landroidx/lifecycle/w0$a$a;", "", "<init>", "()V", "Landroid/app/Application;", "application", "Landroidx/lifecycle/w0$a;", "a", "(Landroid/app/Application;)Landroidx/lifecycle/w0$a;", "_instance", "Landroidx/lifecycle/w0$a;", "Lp7/a$c;", "APPLICATION_KEY", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(k kVar) {
                this();
            }

            public final a a(Application application) {
                if (a.f12844g == null) {
                    a.f12844g = new a(application);
                }
                return a.f12844g;
            }

            private Companion() {
            }
        }

        @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"androidx/lifecycle/w0$a$b", "Lp7/a$c;", "lifecycle-viewmodel"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class b implements CreationExtras.c<Application> {
        }

        static {
            CreationExtras.Companion companion = CreationExtras.INSTANCE;
            f12845h = new b();
        }

        private a(Application application, int i15) {
            this.application = application;
        }

        private final <T extends t0> T h(Class<T> modelClass, Application app) {
            if (!androidx.p016lifecycle.a.class.isAssignableFrom(modelClass)) {
                return (T) super.b(modelClass);
            }
            try {
                return modelClass.getConstructor(Application.class).newInstance(app);
            } catch (IllegalAccessException e15) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e15);
            } catch (InstantiationException e16) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e16);
            } catch (NoSuchMethodException e17) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e17);
            } catch (InvocationTargetException e18) {
                throw new RuntimeException("Cannot create an instance of " + modelClass, e18);
            }
        }

        @Override // androidx.lifecycle.w0.d, androidx.lifecycle.w0.c
        public <T extends t0> T a(Class<T> modelClass, CreationExtras extras) {
            if (this.application != null) {
                return (T) b(modelClass);
            }
            Application application = (Application) extras.a(f12845h);
            if (application != null) {
                return (T) h(modelClass, application);
            }
            if (androidx.p016lifecycle.a.class.isAssignableFrom(modelClass)) {
                throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
            }
            return (T) super.b(modelClass);
        }

        @Override // androidx.lifecycle.w0.d, androidx.lifecycle.w0.c
        public <T extends t0> T b(Class<T> modelClass) {
            Application application = this.application;
            if (application != null) {
                return (T) h(modelClass, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public a() {
            this(null, 0);
        }

        public a(Application application) {
            this(application, 0);
        }
    }

    private w0(h hVar) {
        this.impl = hVar;
    }

    public /* synthetic */ w0(x0 x0Var, c cVar, CreationExtras creationExtras, int i15, k kVar) {
        this(x0Var, cVar, (i15 & 4) != 0 ? CreationExtras.b.f153222c : creationExtras);
    }

    public w0(x0 x0Var, c cVar, CreationExtras creationExtras) {
        this(new h(x0Var, cVar, creationExtras));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w0(y0 y0Var) {
        x0 x0VarH = y0Var.h();
        j jVar = j.f172257a;
        this(x0VarH, jVar.d(y0Var), jVar.c(y0Var));
    }

    public w0(y0 y0Var, c cVar) {
        this(y0Var.h(), cVar, j.f172257a.c(y0Var));
    }
}
