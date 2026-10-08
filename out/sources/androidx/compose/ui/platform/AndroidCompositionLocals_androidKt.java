package androidx.compose.ui.platform;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import p071kotlin.Metadata;
import p076m2.b4;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000J\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001d\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\t\u0010\n\"\u001d\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\b\u001a\u0004\b\r\u0010\n\"\u001d\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00058\u0006¢\u0006\f\n\u0004\b\r\u0010\b\u001a\u0004\b\u0010\u0010\n\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\b\u001a\u0004\b\u0013\u0010\n\" \u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00150\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0016\u0010\b\u001a\u0004\b\u0016\u0010\n\"\u001d\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00058\u0006¢\u0006\f\n\u0004\b\u0010\u0010\b\u001a\u0004\b\u0019\u0010\n\" \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00058FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001c\u0010\n¨\u0006 "}, d2 = {"", "name", "", "h", "(Ljava/lang/String;)Ljava/lang/Void;", "Lm2/b4;", "Landroid/content/res/Configuration;", "a", "Lm2/b4;", "b", "()Lm2/b4;", "LocalConfiguration", "Landroid/content/Context;", "c", "LocalContext", "Landroid/content/res/Resources;", "f", "LocalResources", "Ll4/b;", "d", "LocalImageVectorCache", "Ll4/d;", "e", "LocalResourceIdCache", "Landroid/view/View;", "g", "LocalView", "Landroidx/lifecycle/q;", "getLocalLifecycleOwner", "getLocalLifecycleOwner$annotations", "()V", "LocalLifecycleOwner", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AndroidCompositionLocals_androidKt {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final b4<Configuration> f10372a = p076m2.d0.h(null, a.f10378b, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final b4<Context> f10373b = p076m2.d0.j(b.f10379b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final b4<Resources> f10374c = p076m2.d0.i(e.f10382b);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final b4<l4.b> f10375d = p076m2.d0.j(c.f10380b);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final b4<l4.d> f10376e = p076m2.d0.j(d.f10381b);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final b4<View> f10377f = p076m2.d0.j(f.f10383b);

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/res/Configuration;", "c", "()Landroid/content/res/Configuration;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<Configuration> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10378b = new a();

        a() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Configuration a() {
            AndroidCompositionLocals_androidKt.h("LocalConfiguration");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/content/Context;", "c", "()Landroid/content/Context;"}, k = 3, mv = {2, 1, 0})
    static final class b extends fr.w implements er.a<Context> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final b f10379b = new b();

        b() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Context a() {
            AndroidCompositionLocals_androidKt.h("LocalContext");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll4/b;", "c", "()Ll4/b;"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.a<l4.b> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10380b = new c();

        c() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l4.b a() {
            AndroidCompositionLocals_androidKt.h("LocalImageVectorCache");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll4/d;", "c", "()Ll4/d;"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.a<l4.d> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f10381b = new d();

        d() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final l4.d a() {
            AndroidCompositionLocals_androidKt.h("LocalResourceIdCache");
            throw new oq.g();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lm2/a0;", "Landroid/content/res/Resources;", "c", "(Lm2/a0;)Landroid/content/res/Resources;"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.l<p076m2.a0, Resources> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final e f10382b = new e();

        e() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Resources b(p076m2.a0 a0Var) {
            a0Var.F(AndroidCompositionLocals_androidKt.b());
            return ((Context) a0Var.F(AndroidCompositionLocals_androidKt.c())).getResources();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/View;", "c", "()Landroid/view/View;"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.a<View> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final f f10383b = new f();

        f() {
            super(0);
        }

        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final View a() {
            AndroidCompositionLocals_androidKt.h("LocalView");
            throw new oq.g();
        }
    }

    public static final b4<Configuration> b() {
        return f10372a;
    }

    public static final b4<Context> c() {
        return f10373b;
    }

    public static final b4<l4.b> d() {
        return f10375d;
    }

    public static final b4<l4.d> e() {
        return f10376e;
    }

    public static final b4<Resources> f() {
        return f10374c;
    }

    public static final b4<View> g() {
        return f10377f;
    }

    public static final b4<androidx.p016lifecycle.q> getLocalLifecycleOwner() {
        return m7.n.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void h(String str) {
        throw new IllegalStateException(("CompositionLocal " + str + " not present").toString());
    }
}
