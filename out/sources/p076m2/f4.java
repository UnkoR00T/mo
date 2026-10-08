package p076m2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.p;
import fr.k;
import fr.t;
import ip.a;
import java.util.List;
import oq.i0;
import p071kotlin.Metadata;
import p2.SlotWriter;
import p2.c;
import p2.l;
import r0.h1;
import r0.p0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b.\b\u0001\u0018\u0000 92\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001eB\u0011\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J1\u0010\f\u001a\u00020\u000b*\u0006\u0012\u0002\b\u00030\b2\u0018\u0010\n\u001a\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\u00030\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0019\u0010\u0007J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\u0018J)\u0010\u001e\u001a\u00020\u00102\u0018\u0010\u001d\u001a\u0014\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00100\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020\u00102\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u0010¢\u0006\u0004\b#\u0010\u0018J\u0015\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0003¢\u0006\u0004\b%\u0010&J#\u0010'\u001a\u00020\u00102\n\u0010$\u001a\u0006\u0012\u0002\b\u00030\b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020\u000b2\b\u0010)\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b*\u0010&J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0018J#\u0010.\u001a\u0010\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u0010\u0018\u00010,2\u0006\u0010 \u001a\u00020\u001c¢\u0006\u0004\b.\u0010/R$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001e\u00100\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0007R\u0016\u00106\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R$\u0010=\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u00108\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R*\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010>R\u0016\u0010?\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u00105R\u001e\u0010B\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010@8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010AR*\u0010E\u001a\u0016\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u0010DR$\u0010J\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR$\u0010M\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8@@BX\u0080\u000e¢\u0006\f\u001a\u0004\bK\u0010G\"\u0004\bL\u0010IR\u0011\u0010O\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bN\u0010GR\u0011\u0010Q\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bP\u0010GR$\u0010T\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bR\u0010G\"\u0004\bS\u0010IR$\u0010W\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bU\u0010G\"\u0004\bV\u0010IR$\u0010Z\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bX\u0010G\"\u0004\bY\u0010IR$\u0010]\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b[\u0010G\"\u0004\b\\\u0010IR$\u0010`\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b^\u0010G\"\u0004\b_\u0010IR$\u0010c\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\ba\u0010G\"\u0004\bb\u0010IR$\u0010f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bd\u0010G\"\u0004\be\u0010IR$\u0010h\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bg\u0010G\"\u0004\b5\u0010IR$\u0010k\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bi\u0010G\"\u0004\bj\u0010IR\u0011\u0010m\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\bl\u0010G¨\u0006n"}, d2 = {"Lm2/f4;", "Lm2/d5;", "Lm2/d4;", "", "Lm2/h4;", "owner", "<init>", "(Lm2/h4;)V", "Lm2/o0;", "Lr0/t0;", "dependencies", "", "d", "(Lm2/o0;Lr0/t0;)Z", "Lm2/r;", "composer", "Loq/i0;", "e", "(Lm2/r;)V", "value", "Lm2/s1;", "v", "(Ljava/lang/Object;)Lm2/s1;", "A", "()V", "c", "invalidate", "Lkotlin/Function2;", "", "block", "a", "(Ler/p;)V", "token", i.f37086m, "(I)V", "C", "instance", "z", "(Ljava/lang/Object;)Z", "y", "(Lm2/o0;Ljava/lang/Object;)V", "instances", "x", "B", "Lkotlin/Function1;", "Lm2/u;", "f", "(I)Ler/l;", "Lm2/h4;", "getOwner$runtime", "()Lm2/h4;", "setOwner$runtime", "b", "I", "flags", "Lm2/b;", "Lm2/b;", "h", "()Lm2/b;", a.f96138c, "(Lm2/b;)V", "anchor", "Ler/p;", "currentToken", "Lr0/p0;", "Lr0/p0;", "trackedInstances", "g", "Lr0/t0;", "trackedDependencies", "o", "()Z", "J", "(Z)V", "rereading", "s", "N", "skipped", "u", "valid", "i", "canRecompose", "t", "O", "used", "r", "M", "reusing", "p", "K", "resetReusing", "m", i.f37087n, "paused", "q", i.f37094u, "resuming", "j", "E", "defaultsInScope", "k", "F", "defaultsInvalid", "n", "requiresRecompose", "l", "G", "forcedRecompose", "w", "isConditional", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class f4 implements d5, d4 {

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f122921i = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private h4 owner;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int flags;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b anchor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private p<? super r, ? super Integer, i0> block;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentToken;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private p0<Object> trackedInstances;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private t0<o0<?>, Object> trackedDependencies;

    /* JADX INFO: renamed from: m2.f4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u000e2\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0000¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lm2/f4$a;", "", "<init>", "()V", "Lp2/o;", "slots", "", "Lp2/c;", "anchors", "Lm2/h4;", "newOwner", "Loq/i0;", "a", "(Lp2/o;Ljava/util/List;Lm2/h4;)V", "Lp2/l;", "", "b", "(Lp2/l;Ljava/util/List;)Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        public final void a(SlotWriter slots, List<c> anchors, h4 newOwner) {
            List<c> list = anchors;
            if (list.isEmpty()) {
                return;
            }
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                Object objF1 = slots.f1(anchors.get(i15), 0);
                f4 f4Var = objF1 instanceof f4 ? (f4) objF1 : null;
                if (f4Var != null) {
                    f4Var.c(newOwner);
                }
            }
        }

        public final boolean b(l slots, List<c> anchors) {
            List<c> list = anchors;
            if (!list.isEmpty()) {
                int size = list.size();
                for (int i15 = 0; i15 < size; i15++) {
                    c cVar = anchors.get(i15);
                    if (slots.W(cVar) && (slots.Y(slots.v(cVar), 0) instanceof f4)) {
                        return true;
                    }
                }
            }
            return false;
        }

        private Companion() {
        }
    }

    public f4(h4 h4Var) {
        this.owner = h4Var;
    }

    private final void J(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 32 : i15 & (-33);
    }

    private final void N(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 16 : i15 & (-17);
    }

    private final boolean d(o0<?> o0Var, t0<o0<?>, Object> t0Var) {
        w5<?> w5VarC = o0Var.c();
        if (w5VarC == null) {
            w5VarC = x5.r();
        }
        return !w5VarC.b(o0Var.x().a(), t0Var.e(o0Var));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:34:0x0085 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x0087 A[LOOP:0: B:11:0x0020->B:35:0x0087, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:39:0x008a A[EDGE_INSN: B:39:0x008a->B:36:0x008a BREAK  A[LOOP:0: B:11:0x0020->B:35:0x0087], SYNTHETIC] */
    public static final i0 g(f4 f4Var, int i15, p0 p0Var, u uVar) {
        int i16;
        if (f4Var.currentToken == i15 && t.c(p0Var, f4Var.trackedInstances) && (uVar instanceof x)) {
            long[] jArr = p0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i17 = 0;
                while (true) {
                    long j15 = jArr[i17];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i17 != length) {
                            break;
                            break;
                        }
                        i17++;
                    } else {
                        int i18 = 8;
                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                        int i25 = 0;
                        while (i25 < i19) {
                            if ((255 & j15) < 128) {
                                int i26 = (i17 << 3) + i25;
                                Object obj = p0Var.keys[i26];
                                boolean z15 = p0Var.values[i26] != i15;
                                if (z15) {
                                    x xVar = (x) uVar;
                                    xVar.b0(obj, f4Var);
                                    i16 = i18;
                                    if (obj instanceof o0) {
                                        xVar.a0((o0) obj);
                                        t0<o0<?>, Object> t0Var = f4Var.trackedDependencies;
                                        if (t0Var != null) {
                                            t0Var.u((o0<?>) obj);
                                        }
                                    }
                                } else {
                                    i16 = i18;
                                }
                                if (z15) {
                                    p0Var.s(i26);
                                }
                            } else {
                                i16 = i18;
                            }
                            j15 >>= i16;
                            i25++;
                            i18 = i16;
                        }
                        if (i19 != i18) {
                            break;
                        }
                        if (i17 != length) {
                            break;
                        }
                        i17++;
                    }
                }
            }
        }
        return i0.f148189a;
    }

    private final boolean o() {
        return (this.flags & 32) != 0;
    }

    public final void A() {
        h4 h4Var = this.owner;
        if (h4Var != null) {
            h4Var.g(this);
        }
        this.owner = null;
        this.trackedInstances = null;
        this.trackedDependencies = null;
        this.block = null;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0053 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0055 A[LOOP:0: B:10:0x001b->B:23:0x0055, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:32:0x0058 A[EDGE_INSN: B:32:0x0058->B:24:0x0058 BREAK  A[LOOP:0: B:10:0x001b->B:23:0x0055], SYNTHETIC] */
    public final void B() {
        p0<Object> p0Var;
        h4 h4Var = this.owner;
        if (h4Var == null || (p0Var = this.trackedInstances) == null) {
            return;
        }
        J(true);
        try {
            Object[] objArr = p0Var.keys;
            int[] iArr = p0Var.values;
            long[] jArr = p0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr[i18];
                                int i19 = iArr[i18];
                                h4Var.a(obj);
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
        } finally {
            J(false);
        }
    }

    public final void C() {
        if (r()) {
            return;
        }
        N(true);
    }

    public final void D(b bVar) {
        this.anchor = bVar;
    }

    public final void E(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 2 : i15 & (-3);
    }

    public final void F(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 4 : i15 & (-5);
    }

    public final void G(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 64 : i15 & (-65);
    }

    public final void H(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 256 : i15 & (-257);
    }

    public final void I(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 8 : i15 & (-9);
    }

    public final void K(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 1024 : i15 & (-1025);
    }

    public final void L(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 512 : i15 & (-513);
    }

    public final void M(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 128 : i15 & (-129);
    }

    public final void O(boolean z15) {
        int i15 = this.flags;
        this.flags = z15 ? i15 | 1 : i15 & (-2);
    }

    public final void P(int token) {
        this.currentToken = token;
        N(false);
    }

    @Override // p076m2.d5
    public void a(p<? super r, ? super Integer, i0> block) {
        this.block = block;
    }

    public final void c(h4 owner) {
        this.owner = owner;
    }

    public final void e(r composer) {
        p<? super r, ? super Integer, i0> pVar = this.block;
        if (pVar == null) {
            throw new IllegalStateException("Invalid restart scope");
        }
        pVar.B(composer, 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0056 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:22:0x0058 A[LOOP:0: B:9:0x001c->B:22:0x0058, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x005b A[SYNTHETIC] */
    public final er.l<u, i0> f(final int token) {
        final p0<Object> p0Var = this.trackedInstances;
        if (p0Var != null && !s()) {
            Object[] objArr = p0Var.keys;
            int[] iArr = p0Var.values;
            long[] jArr = p0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                int i18 = (i15 << 3) + i17;
                                Object obj = objArr[i18];
                                if (iArr[i18] != token) {
                                    return new er.l() { // from class: m2.e4
                                        @Override // er.l
                                        public final Object b(Object obj2) {
                                            return f4.g(this.f122882a, token, p0Var, (u) obj2);
                                        }
                                    };
                                }
                            }
                            j15 >>= 8;
                        }
                        if (i16 == 8) {
                            if (i15 != length) {
                                i15++;
                            }
                        }
                    } else if (i15 != length) {
                        i15++;
                    }
                }
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final b getAnchor() {
        return this.anchor;
    }

    public final boolean i() {
        return this.block != null;
    }

    @Override // p076m2.d4
    public void invalidate() {
        h4 h4Var = this.owner;
        if (h4Var != null) {
            h4Var.i(this, null);
        }
    }

    public final boolean j() {
        return (this.flags & 2) != 0;
    }

    public final boolean k() {
        return (this.flags & 4) != 0;
    }

    public final boolean l() {
        return (this.flags & 64) != 0;
    }

    public final boolean m() {
        return (this.flags & 256) != 0;
    }

    public final boolean n() {
        return (this.flags & 8) != 0;
    }

    public final boolean p() {
        return (this.flags & 1024) != 0;
    }

    public final boolean q() {
        return (this.flags & 512) != 0;
    }

    public final boolean r() {
        return (this.flags & 128) != 0;
    }

    public final boolean s() {
        return (this.flags & 16) != 0;
    }

    public final boolean t() {
        return (this.flags & 1) != 0;
    }

    public final boolean u() {
        if (this.owner != null) {
            b bVar = this.anchor;
            if (bVar != null ? bVar.a() : false) {
                return true;
            }
        }
        return false;
    }

    public final s1 v(Object value) {
        s1 s1VarI;
        h4 h4Var = this.owner;
        return (h4Var == null || (s1VarI = h4Var.i(this, value)) == null) ? s1.IGNORED : s1VarI;
    }

    public final boolean w() {
        return this.trackedDependencies != null;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x006c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x006e A[LOOP:0: B:19:0x002f->B:33:0x006e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x0071 A[EDGE_INSN: B:36:0x0071->B:34:0x0071 BREAK  A[LOOP:0: B:19:0x002f->B:33:0x006e], SYNTHETIC] */
    public final boolean x(Object instances) {
        t0<o0<?>, Object> t0Var;
        if (instances == null || (t0Var = this.trackedDependencies) == null) {
            return true;
        }
        if (instances instanceof o0) {
            return d((o0) instances, t0Var);
        }
        if (!(instances instanceof h1)) {
            return true;
        }
        h1 h1Var = (h1) instances;
        if (h1Var.f()) {
            Object[] objArr = h1Var.elements;
            long[] jArr = h1Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                Object obj = objArr[(i15 << 3) + i17];
                                if (!(obj instanceof o0) || d((o0) obj, t0Var)) {
                                    return true;
                                }
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        }
                        if (i15 != length) {
                            break;
                        }
                        i15++;
                    }
                }
            }
        }
        return false;
    }

    public final void y(o0<?> instance, Object value) {
        t0<o0<?>, Object> t0Var = this.trackedDependencies;
        if (t0Var == null) {
            t0Var = new t0<>(0, 1, null);
            this.trackedDependencies = t0Var;
        }
        t0Var.x(instance, value);
    }

    public final boolean z(Object instance) {
        int i15 = 0;
        if (o()) {
            return false;
        }
        p0<Object> p0Var = this.trackedInstances;
        int i16 = 1;
        if (p0Var == null) {
            p0Var = new p0<>(i15, i16, null);
            this.trackedInstances = p0Var;
        }
        return p0Var.q(instance, this.currentToken, -1) == this.currentToken;
    }
}
