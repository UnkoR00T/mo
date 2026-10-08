package androidx.compose.ui.node;

import androidx.compose.ui.platform.f3;
import c5.t;
import fr.w;
import oq.i0;
import p036e4.w0;
import p071kotlin.Metadata;
import p076m2.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\b\ba\u0018\u0000 ,2\u00020\u0001:\u0001-R\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001c\u0010\u0013\u001a\u00020\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0019\u001a\u00020\u00148&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001f\u001a\u00020\u001a8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001c\u0010%\u001a\u00020 8&@&X¦\u000e¢\u0006\f\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u001c\u0010+\u001a\u00020&8&@&X¦\u000e¢\u0006\f\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006.À\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/c;", "", "Le4/w0;", "getMeasurePolicy", "()Le4/w0;", "j", "(Le4/w0;)V", "measurePolicy", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "d", "(Lc5/t;)V", "layoutDirection", "Lc5/d;", "getDensity", "()Lc5/d;", "b", "(Lc5/d;)V", "density", "Lf3/m;", "getModifier", "()Lf3/m;", "u", "(Lf3/m;)V", "modifier", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "l", "(Landroidx/compose/ui/platform/f3;)V", "viewConfiguration", "Lm2/e0;", "getCompositionLocalMap", "()Lm2/e0;", "e", "(Lm2/e0;)V", "compositionLocalMap", "", "getCompositeKeyHash", "()I", "g", "(I)V", "compositeKeyHash", "i", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public interface c {

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f10053a;

    /* JADX INFO: renamed from: androidx.compose.ui.node.c$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001d\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0006\u0010\bR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\n\u0010\u0007\u001a\u0004\b\u000b\u0010\bR)\u0010\u0014\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R)\u0010\u0017\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0016\u0010\u0013R)\u0010\u001a\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0019\u0010\u0013R)\u0010\u001c\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R)\u0010 \u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u0011\u001a\u0004\b\u001f\u0010\u0013R)\u0010$\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b\"\u0010\u0011\u001a\u0004\b#\u0010\u0013R)\u0010'\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020%\u0012\u0004\u0012\u00020\u000f0\r8\u0006¢\u0006\f\n\u0004\b&\u0010\u0011\u001a\u0004\b\n\u0010\u0013R#\u0010-\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f0(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, d2 = {"Landroidx/compose/ui/node/c$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/c;", "b", "Ler/a;", "()Ler/a;", "Constructor", "c", "g", "VirtualConstructor", "Lkotlin/Function2;", "Lf3/m;", "Loq/i0;", "d", "Ler/p;", "e", "()Ler/p;", "SetModifier", "Lc5/d;", "getSetDensity", "SetDensity", "Lm2/e0;", "f", "SetResolvedCompositionLocals", "Le4/w0;", "SetMeasurePolicy", "Lc5/t;", "h", "getSetLayoutDirection", "SetLayoutDirection", "Landroidx/compose/ui/platform/f3;", "i", "getSetViewConfiguration", "SetViewConfiguration", "", "j", "SetCompositeKeyHash", "Lkotlin/Function1;", "k", "Ler/l;", "a", "()Ler/l;", "ApplyOnDeactivatedNodeAssertion", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f10053a = new Companion();

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private static final er.a<c> Constructor = androidx.compose.ui.node.g.INSTANCE.a();

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private static final er.a<c> VirtualConstructor = i.f10072b;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, f3.m, i0> SetModifier = f.f10069b;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, c5.d, i0> SetDensity = C0219c.f10066b;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, e0, i0> SetResolvedCompositionLocals = g.f10070b;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, w0, i0> SetMeasurePolicy = e.f10068b;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, t, i0> SetLayoutDirection = d.f10067b;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, f3, i0> SetViewConfiguration = h.f10071b;

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private static final er.p<c, Integer, i0> SetCompositeKeyHash = b.f10065b;

        /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
        private static final er.l<c, i0> ApplyOnDeactivatedNodeAssertion = C0218a.f10064b;

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$a, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/node/c;", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0218a extends w implements er.l<c, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0218a f10064b = new C0218a();

            C0218a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(c cVar) {
                c(cVar);
                return i0.f148189a;
            }

            public final void c(c cVar) {
                androidx.compose.ui.node.g gVar = cVar instanceof androidx.compose.ui.node.g ? (androidx.compose.ui.node.g) cVar : null;
                boolean z15 = false;
                if (gVar != null && gVar.getIsDeactivated()) {
                    z15 = true;
                }
                if (z15) {
                    d4.a.c("Apply is called on deactivated node " + cVar);
                }
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$b */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;I)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends w implements er.p<c, Integer, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final b f10065b = new b();

            b() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, Integer num) {
                c(cVar, num.intValue());
                return i0.f148189a;
            }

            public final void c(c cVar, int i15) {
                cVar.g(i15);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$c, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "Lc5/d;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;Lc5/d;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0219c extends w implements er.p<c, c5.d, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final C0219c f10066b = new C0219c();

            C0219c() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, c5.d dVar) {
                c(cVar, dVar);
                return i0.f148189a;
            }

            public final void c(c cVar, c5.d dVar) {
                cVar.b(dVar);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$d */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "Lc5/t;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;Lc5/t;)V"}, k = 3, mv = {2, 1, 0})
        static final class d extends w implements er.p<c, t, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final d f10067b = new d();

            d() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, t tVar) {
                c(cVar, tVar);
                return i0.f148189a;
            }

            public final void c(c cVar, t tVar) {
                cVar.d(tVar);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$e */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "Le4/w0;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;Le4/w0;)V"}, k = 3, mv = {2, 1, 0})
        static final class e extends w implements er.p<c, w0, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final e f10068b = new e();

            e() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, w0 w0Var) {
                c(cVar, w0Var);
                return i0.f148189a;
            }

            public final void c(c cVar, w0 w0Var) {
                cVar.j(w0Var);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$f */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "Lf3/m;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;Lf3/m;)V"}, k = 3, mv = {2, 1, 0})
        static final class f extends w implements er.p<c, f3.m, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final f f10069b = new f();

            f() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, f3.m mVar) {
                c(cVar, mVar);
                return i0.f148189a;
            }

            public final void c(c cVar, f3.m mVar) {
                cVar.u(mVar);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$g */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "Lm2/e0;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;Lm2/e0;)V"}, k = 3, mv = {2, 1, 0})
        static final class g extends w implements er.p<c, e0, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final g f10070b = new g();

            g() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, e0 e0Var) {
                c(cVar, e0Var);
                return i0.f148189a;
            }

            public final void c(c cVar, e0 e0Var) {
                cVar.e(e0Var);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$h */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Landroidx/compose/ui/node/c;", "Landroidx/compose/ui/platform/f3;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/node/c;Landroidx/compose/ui/platform/f3;)V"}, k = 3, mv = {2, 1, 0})
        static final class h extends w implements er.p<c, f3, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final h f10071b = new h();

            h() {
                super(2);
            }

            @Override // er.p
            public /* bridge */ /* synthetic */ i0 B(c cVar, f3 f3Var) {
                c(cVar, f3Var);
                return i0.f148189a;
            }

            public final void c(c cVar, f3 f3Var) {
                cVar.l(f3Var);
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.node.c$a$i */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/g;", "c", "()Landroidx/compose/ui/node/g;"}, k = 3, mv = {2, 1, 0})
        static final class i extends w implements er.a<androidx.compose.ui.node.g> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final i f10072b = new i();

            i() {
                super(0);
            }

            @Override // er.a
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public final androidx.compose.ui.node.g a() {
                return new androidx.compose.ui.node.g(true, 0, 2, null);
            }
        }

        private Companion() {
        }

        public final er.l<c, i0> a() {
            return ApplyOnDeactivatedNodeAssertion;
        }

        public final er.a<c> b() {
            return Constructor;
        }

        public final er.p<c, Integer, i0> c() {
            return SetCompositeKeyHash;
        }

        public final er.p<c, w0, i0> d() {
            return SetMeasurePolicy;
        }

        public final er.p<c, f3.m, i0> e() {
            return SetModifier;
        }

        public final er.p<c, e0, i0> f() {
            return SetResolvedCompositionLocals;
        }

        public final er.a<c> g() {
            return VirtualConstructor;
        }
    }

    void b(c5.d dVar);

    void d(t tVar);

    void e(e0 e0Var);

    void g(int i15);

    void j(w0 w0Var);

    void l(f3 f3Var);

    void u(f3.m mVar);
}
