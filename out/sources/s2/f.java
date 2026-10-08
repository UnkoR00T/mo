package s2;

import fr.q0;
import java.util.List;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import p076m2.f4;
import p076m2.h4;
import p076m2.i3;
import p076m2.j2;
import p076m2.r2;
import p076m2.s2;
import p076m2.v4;
import y2.IntRef;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:(&'()*+,-./01\u0019234567\u001789:;<=>?@AB C\"\u001eD$EF\u0013B'\b\u0004\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ7\u0010\u0013\u001a\u00020\u0012*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016*\u00020\t2\u0006\u0010\r\u001a\u00020\fH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J9\u0010\u0019\u001a\u00020\u0012*\u00020\t2\n\u0010\u000b\u001a\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H$¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0019\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u001d\u001a\u0004\b \u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0017\u0010!\u001a\u0004\b\"\u0010#R\u0011\u0010%\u001a\u00020\u001a8F¢\u0006\u0006\u001a\u0004\b$\u0010\u001c\u0082\u0001'GHIJKLMNOPQRSTUVWXYZ[\\]^_`abcdefghijklm¨\u0006n"}, d2 = {"Ls2/f;", "", "", "ints", "objects", "", "isExternallyVisible", "<init>", "(IIZ)V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "b", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "c", "(Ls2/h;Lr2/t;)J", "a", "", "toString", "()Ljava/lang/String;", "I", "d", "()I", "f", "Z", "g", "()Z", "e", "name", "s", "m0", "i", "c0", "d0", "g0", "f0", "e0", "w", "x", "h0", "l", "a0", "k0", "l0", "i0", "y", "q", "j", "n0", "j0", "z", "r", "o", "p", "m", "n", "t", "u", "b0", "k", "v", "h", "Ls2/f$a;", "Ls2/f$b;", "Ls2/f$c;", "Ls2/f$d;", "Ls2/f$e;", "Ls2/f$f;", "Ls2/f$g;", "Ls2/f$h;", "Ls2/f$i;", "Ls2/f$j;", "Ls2/f$k;", "Ls2/f$l;", "Ls2/f$m;", "Ls2/f$n;", "Ls2/f$o;", "Ls2/f$p;", "Ls2/f$q;", "Ls2/f$r;", "Ls2/f$t;", "Ls2/f$u;", "Ls2/f$v;", "Ls2/f$w;", "Ls2/f$x;", "Ls2/f$y;", "Ls2/f$z;", "Ls2/f$a0;", "Ls2/f$b0;", "Ls2/f$c0;", "Ls2/f$d0;", "Ls2/f$e0;", "Ls2/f$f0;", "Ls2/f$g0;", "Ls2/f$h0;", "Ls2/f$i0;", "Ls2/f$j0;", "Ls2/f$k0;", "Ls2/f$l0;", "Ls2/f$m0;", "Ls2/f$n0;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int ints;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int objects;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final boolean isExternallyVisible;

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$a;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a f177550d = new a();

        private a() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            Object objA = hVar.a(s.a(0));
            if (objA instanceof v4) {
                eVar.b((v4) objA);
            }
            tVar.a(objA);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$a0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final a0 f177551d = new a0();

        private a0() {
            super(2, 0, false, 6, null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean i(o2.e eVar, int i15, int i16, Object obj) {
            if (obj instanceof p076m2.n) {
                ((p076m2.n) obj).a();
                return false;
            }
            if (obj instanceof v4) {
                eVar.c((v4) obj);
                return false;
            }
            if (!(obj instanceof f4)) {
                return false;
            }
            ((f4) obj).A();
            return false;
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, final o2.e eVar, q2.g gVar) {
            int i15 = hVar.getInt(1);
            int i16 = hVar.getInt(0);
            tVar.P(tVar.getParent(), i16, i15, new r2.t.a() { // from class: s2.g
                @Override // r2.t.a
                public final boolean a(int i17, int i18, Object obj) {
                    return f.a0.i(eVar, i17, i18, obj);
                }
            });
            tVar.L(i15);
            while (tVar.getCurrent() != i16) {
                tVar.J();
            }
            while (tVar.getCurrent() >= 0) {
                tVar.C(true);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$b;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b f177552d = new b();

        private b() {
            super(0, 2, false, 1, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            IntRef intRef = (IntRef) hVar.a(s.a(1));
            int element = intRef != null ? intRef.getElement() : 0;
            s2.a aVar = (s2.a) hVar.a(s.a(0));
            if (element > 0) {
                cVar = new i3(cVar, element);
            }
            aVar.e(cVar, tVar, eVar, gVar != null ? s2.k.l(gVar, tVar) : null);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$b0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final b0 f177553d = new b0();

        private b0() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.E();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$c;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c f177554d = new c();

        private c() {
            super(0, 0, false, 3, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.B(67108864);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$c0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final c0 f177555d = new c0();

        private c0() {
            super(0, 1, false, 1, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.F(((r2.a) hVar.a(s.a(0))).a());
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$d;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d f177556d = new d();

        private d() {
            super(0, 2, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            int element = ((IntRef) hVar.a(s.a(0))).getElement();
            List list = (List) hVar.a(s.a(1));
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object obj = list.get(i15);
                int i16 = element + i15;
                cVar.f(i16, obj);
                cVar.d(i16, obj);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$d0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final d0 f177557d = new d0();

        private d0() {
            super(2, 0, false, 2, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.F(s2.i.a(hVar, 0, 1));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$e;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e f177558d = new e();

        private e() {
            super(0, 4, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            s2 s2Var = (s2) hVar.a(s.a(2));
            s2 s2Var2 = (s2) hVar.a(s.a(3));
            p076m2.v vVar = (p076m2.v) hVar.a(s.a(1));
            r2 r2VarQ = (r2) hVar.a(s.a(0));
            if (r2VarQ == null && (r2VarQ = vVar.q(s2Var)) == null) {
                p076m2.t.c("Could not resolve state for movable content");
                throw new oq.g();
            }
            r2.t tVarX = r2.a0.f(r2VarQ.getSlotStorage()).X();
            try {
                tVarX.K();
                tVarX.K();
                long jT = tVar.t(tVarX, tVarX.m(), (((long) oq.b0.e(-1)) & BodyPartID.bodyIdMax) | (((long) tVar.e(tVar.getCurrent())) << 32));
                tVarX.b();
                r2.a0.e(tVar.getTable(), r2.f.b(jT), (h4) s2Var2.getComposition());
            } catch (Throwable th4) {
                tVarX.b();
                throw th4;
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$e0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final e0 f177559d = new e0();

        private e0() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            eVar.g((er.a) hVar.a(s.a(0)));
        }
    }

    /* JADX INFO: renamed from: s2.f$f, reason: collision with other inner class name */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$f;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class C4530f extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C4530f f177560d = new C4530f();

        private C4530f() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            r2.w.e(tVar, eVar);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$f0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final f0 f177561d = new f0();

        private f0() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.J();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$g;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g f177562d = new g();

        private g() {
            super(2, 1, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            ((IntRef) hVar.a(s.a(0))).b(s2.k.i(tVar, s2.i.a(hVar, 1, 0), cVar));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$g0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final g0 f177563d = new g0();

        private g0() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.K();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$h;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h f177564d = new h();

        private h() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            ((r2) hVar.a(s.a(0))).a();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$h0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final h0 f177565d = new h0();

        private h0() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            eVar.h((f4) hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$i;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i f177566d = new i();

        private i() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            for (Object obj : (Object[]) hVar.a(s.a(0))) {
                cVar.g(obj);
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$i0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final i0 f177567d = new i0();

        private i0() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.M(hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$j;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j f177568d = new j();

        private j() {
            super(0, 2, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            ((er.l) hVar.a(s.a(0))).b((p076m2.u) hVar.a(s.a(1)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$j0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class j0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final j0 f177569d = new j0();

        private j0() {
            super(0, 2, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            cVar.k((er.p) hVar.a(s.a(1)), hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$k;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k f177570d = new k();

        private k() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            while (tVar.getParent() >= 0) {
                if (tVar.s()) {
                    cVar.j();
                }
                tVar.d();
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$k0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class k0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final k0 f177571d = new k0();

        private k0() {
            super(0, 2, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            ((j2) hVar.a(s.a(1))).b((r2.i) hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$l;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final l f177572d = new l();

        private l() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            eVar.f((f4) hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$l0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final l0 f177573d = new l0();

        private l0() {
            super(1, 1, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            Object objA = hVar.a(s.a(0));
            int i15 = hVar.getInt(0);
            if (objA instanceof v4) {
                eVar.b((v4) objA);
            }
            Object objI = tVar.I(i15, objA);
            if (objI instanceof v4) {
                eVar.c((v4) objI);
            } else if (objI instanceof f4) {
                ((f4) objI).A();
            }
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00060\u0007j\u0002`\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0012\u001a\u00020\u0011*\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls2/f$m;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lr2/t;", "slots", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "c", "(Ls2/h;Lr2/t;)J", "Lm2/c;", "applier", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m f177574d = new m();

        private m() {
            super(3, 1, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            Object objA = ((er.a) hVar.a(s.a(0))).a();
            int i15 = hVar.getInt(0);
            tVar.N(r2.f.b(c(hVar, tVar)), objA);
            cVar.d(i15, objA);
            cVar.g(objA);
        }

        @Override // s2.f
        protected long c(s2.h hVar, r2.t tVar) {
            return s2.i.a(hVar, 1, 2);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$m0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class m0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final m0 f177575d = new m0();

        private m0() {
            super(1, 0, false, 6, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            int i15 = hVar.getInt(0);
            for (int i16 = 0; i16 < i15; i16++) {
                cVar.j();
            }
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$n;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n f177576d = new n();

        private n() {
            super(1, 2, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            Object objA = ((er.a) hVar.a(s.a(0))).a();
            int i15 = hVar.getInt(0);
            tVar.N(((r2.i) hVar.a(s.a(1))).getAddress(), objA);
            cVar.d(i15, objA);
            cVar.g(objA);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$n0;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class n0 extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final n0 f177577d = new n0();

        private n0() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            cVar.h();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$o;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class o extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final o f177578d = new o();

        private o() {
            super(2, 1, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            r2.t.v(tVar, (r2.o) hVar.a(s.a(0)), s2.i.a(hVar, 0, 1), 0L, 4, null);
            tVar.J();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$p;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class p extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final p f177579d = new p();

        private p() {
            super(2, 2, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            q2.g gVarL;
            r2.o oVar = (r2.o) hVar.a(s.a(0));
            s2.e eVar2 = (s2.e) hVar.a(s.a(1));
            r2.t tVarX = oVar.X();
            if (gVar != null) {
                try {
                    gVarL = s2.k.l(gVar, tVar);
                } catch (Throwable th4) {
                    tVarX.b();
                    throw th4;
                }
            } else {
                gVarL = null;
            }
            eVar2.e(cVar, tVarX, eVar, gVarL);
            oq.i0 i0Var = oq.i0.f148189a;
            tVarX.b();
            r2.t.v(tVar, oVar, s2.i.a(hVar, 0, 1), 0L, 4, null);
            tVar.J();
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$q;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class q extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final q f177580d = new q();

        private q() {
            super(1, 0, false, 6, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            tVar.w(hVar.getInt(0));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$r;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class r extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final r f177581d = new r();

        private r() {
            super(3, 0, false, 6, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            cVar.c(hVar.getInt(0), hVar.getInt(1), hVar.getInt(2));
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087@\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006\u0088\u0001\u0004\u0092\u0001\u00020\u0003¨\u0006\u0007"}, d2 = {"Ls2/f$s;", "T", "", "", "offset", "a", "(I)I", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class s<T> {
        public static <T> int a(int i15) {
            return i15;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00060\u0007j\u0002`\b*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ9\u0010\u0012\u001a\u00020\u0011*\u00020\u00042\n\u0010\f\u001a\u0006\u0012\u0002\b\u00030\u000b2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Ls2/f$t;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lr2/t;", "slots", "", "Landroidx/compose/runtime/composer/linkbuffer/GroupHandle;", "c", "(Ls2/h;Lr2/t;)J", "Lm2/c;", "applier", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class t extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final t f177582d = new t();

        private t() {
            super(3, 0, false, 6, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            int i15 = hVar.getInt(0);
            int iB = r2.f.b(s2.i.a(hVar, 1, 2));
            cVar.j();
            cVar.f(i15, tVar.x(iB));
        }

        @Override // s2.f
        protected long c(s2.h hVar, r2.t tVar) {
            return s2.i.a(hVar, 1, 2);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$u;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class u extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final u f177583d = new u();

        private u() {
            super(1, 1, false, 4, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            int i15 = hVar.getInt(0);
            int address = ((r2.i) hVar.a(s.a(0))).getAddress();
            cVar.j();
            cVar.f(i15, tVar.x(address));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$v;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class v extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final v f177584d = new v();

        private v() {
            super(0, 3, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            s2.k.k((p076m2.l0) hVar.a(s.a(0)), (p076m2.v) hVar.a(s.a(1)), (s2) hVar.a(s.a(2)), tVar, cVar);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$w;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class w extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final w f177585d = new w();

        private w() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            eVar.b((v4) hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$x;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class x extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final x f177586d = new x();

        private x() {
            super(0, 1, false, 5, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            eVar.d((f4) hVar.a(s.a(0)));
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$y;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class y extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final y f177587d = new y();

        private y() {
            super(0, 0, false, 7, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            r2.w.g(tVar, eVar);
        }
    }

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000e\u001a\u00020\r*\u00020\u00042\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00052\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0014¢\u0006\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Ls2/f$z;", "Ls2/f;", "<init>", "()V", "Ls2/h;", "Lm2/c;", "applier", "Lr2/t;", "slots", "Lo2/e;", "rememberManager", "Lq2/g;", "errorContext", "Loq/i0;", "a", "(Ls2/h;Lm2/c;Lr2/t;Lo2/e;Lq2/g;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class z extends f {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final z f177588d = new z();

        private z() {
            super(2, 0, false, 6, null);
        }

        @Override // s2.f
        protected void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) {
            cVar.b(hVar.getInt(0), hVar.getInt(1));
        }
    }

    public /* synthetic */ f(int i15, int i16, boolean z15, fr.k kVar) {
        this(i15, i16, z15);
    }

    protected abstract void a(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar);

    public final void b(s2.h hVar, p076m2.c<?> cVar, r2.t tVar, o2.e eVar, q2.g gVar) throws Throwable {
        long jC = c(hVar, tVar);
        try {
            a(hVar, cVar, tVar, eVar, gVar);
        } catch (Throwable th4) {
            throw s2.k.f(th4, gVar, tVar, jC);
        }
    }

    protected long c(s2.h hVar, r2.t tVar) {
        return -1L;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final int getInts() {
        return this.ints;
    }

    public final String e() {
        String strD = q0.c(getClass()).D();
        return strD == null ? "" : strD;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final int getObjects() {
        return this.objects;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final boolean getIsExternallyVisible() {
        return this.isExternallyVisible;
    }

    public String toString() {
        return e();
    }

    private f(int i15, int i16, boolean z15) {
        this.ints = i15;
        this.objects = i16;
        this.isExternallyVisible = z15;
    }

    public /* synthetic */ f(int i15, int i16, boolean z15, int i17, fr.k kVar) {
        this((i17 & 1) != 0 ? 0 : i15, (i17 & 2) != 0 ? 0 : i16, (i17 & 4) != 0 ? true : z15, null);
    }
}
