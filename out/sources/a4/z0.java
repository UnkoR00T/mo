package a4;

import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.platform.f3;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import ju.d2;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001]B=\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u0014\b\u0002\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0017\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0018\u0010\u0016J\u000f\u0010\u0019\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0019\u0010\u0016J?\u0010\u001a\u001a\u00020\u00122\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0012\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\nH\u0000¢\u0006\u0004\b\u001a\u0010\rJ'\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u001f\u0010\u0016J:\u0010%\u001a\u00028\u0000\"\u0004\b\u0000\u0010 2\"\u0010$\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\"\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000#\u0012\u0006\u0012\u0004\u0018\u00010\u00050!H\u0096@¢\u0006\u0004\b%\u0010&R\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010(R\"\u0010\t\u001a\u000e\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u0005\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b*\u0010+R4\u0010.\u001a \b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120#\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0016\u00101\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u00100R\u0018\u00105\u001a\u0004\u0018\u0001028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u00104R\u0016\u00108\u001a\u00020\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010=\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030:R\u00020\u0000098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010@\u001a\u00060\u0005j\u0002`>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010(R\"\u0010B\u001a\u0010\u0012\f\u0012\n\u0012\u0002\b\u00030:R\u00020\u0000098\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010<R\u0018\u0010D\u001a\u0004\u0018\u00010\u000e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bC\u00107R\u0016\u0010G\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR$\u0010\u000b\u001a\u00020\n2\u0006\u0010H\u001a\u00020\n8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bI\u0010J\"\u0004\bK\u0010LR\u0014\u0010P\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010R\u001a\u00020M8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bQ\u0010OR\u0014\u0010V\u001a\u00020S8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010Y\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bW\u0010XR\u0014\u0010\\\u001a\u00020Z8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b[\u0010X¨\u0006^"}, d2 = {"La4/z0;", "Lf3/m$c;", "La4/y0;", "La4/k0;", "Lc5/d;", "", "key1", "key2", "", "keys", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "pointerInputEventHandler", "<init>", "(Ljava/lang/Object;Ljava/lang/Object;[Ljava/lang/Object;Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "La4/o;", "pointerEvent", "La4/q;", "pass", "Loq/i0;", "s3", "(La4/o;La4/q;)V", "X2", "()V", "I", "C2", "r1", "u3", "Lc5/r;", "bounds", "Y", "(La4/o;La4/q;J)V", "Z1", "R", "Lkotlin/Function2;", "La4/c;", "Ltq/e;", "block", "D1", "(Ler/p;Ltq/e;)Ljava/lang/Object;", "r", "Ljava/lang/Object;", "s", "t", "[Ljava/lang/Object;", "v", "Ler/p;", "_deprecatedPointerInputHandler", "w", "Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "_pointerInputEventHandler", "Lju/d2;", "x", "Lju/d2;", "pointerInputJob", "y", "La4/o;", "currentEvent", "Ln2/c;", "La4/z0$a;", "z", "Ln2/c;", "pointerHandlers", "Landroidx/compose/ui/platform/SynchronizedObject;", "A", "pointerHandlersLock", "B", "dispatchingPointerHandlers", "C", "lastPointerEvent", ip.a.f96138c, "J", "boundsSize", "value", "t3", "()Landroidx/compose/ui/input/pointer/PointerInputEventHandler;", "setPointerInputEventHandler", "(Landroidx/compose/ui/input/pointer/PointerInputEventHandler;)V", "", "getDensity", "()F", "density", "i2", "fontScale", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "viewConfiguration", "b", "()J", "size", "Lm3/k;", "O0", "extendedTouchPadding", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class z0 extends f3.m.c implements y0, k0, c5.d {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final Object pointerHandlersLock;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final n2.c<a<?>> dispatchingPointerHandlers;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private o lastPointerEvent;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private long boundsSize;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Object key1;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private Object key2;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private Object[] keys;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.p<? super k0, ? super tq.e<? super oq.i0>, ? extends Object> _deprecatedPointerInputHandler;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private PointerInputEventHandler _pointerInputEventHandler;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private d2 pointerInputJob;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private o currentEvent = w0.f2762a;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n2.c<a<?>> pointerHandlers;

    @Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0082\u0004\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u00022\u00020\u00032\b\u0012\u0004\u0012\u00028\u00000\u0004B\u0015\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0015\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00028\u00000\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0096@¢\u0006\u0004\b\u0017\u0010\u0018JD\u0010\u001f\u001a\u0004\u0018\u00018\u0001\"\u0004\b\u0001\u0010\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0096@¢\u0006\u0004\b\u001f\u0010 JB\u0010!\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00192\u0006\u0010\u001b\u001a\u00020\u001a2\"\u0010\u001e\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u001cH\u0096@¢\u0006\u0004\b!\u0010 J\u0014\u0010$\u001a\u00020#*\u00020\"H\u0097\u0001¢\u0006\u0004\b$\u0010%J\u0014\u0010'\u001a\u00020#*\u00020&H\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010*\u001a\u00020)*\u00020\"H\u0097\u0001¢\u0006\u0004\b*\u0010+J\u0014\u0010,\u001a\u00020)*\u00020&H\u0097\u0001¢\u0006\u0004\b,\u0010-J\u0014\u0010.\u001a\u00020\"*\u00020)H\u0097\u0001¢\u0006\u0004\b.\u0010/J\u0014\u00100\u001a\u00020\"*\u00020#H\u0097\u0001¢\u0006\u0004\b0\u0010%J\u0014\u00101\u001a\u00020\"*\u00020&H\u0097\u0001¢\u0006\u0004\b1\u0010(J\u0014\u00102\u001a\u00020&*\u00020#H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u00020&*\u00020\"H\u0097\u0001¢\u0006\u0004\b4\u00103J\u0014\u00107\u001a\u000206*\u000205H\u0097\u0001¢\u0006\u0004\b7\u00108J\u0014\u00109\u001a\u000205*\u000206H\u0097\u0001¢\u0006\u0004\b9\u00108R\u001a\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001e\u0010?\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>R\u0016\u0010B\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010AR\u001a\u0010G\u001a\u00020C8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\b=\u0010FR\u0014\u0010J\u001a\u00020\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010M\u001a\u00020K8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010LR\u0014\u0010Q\u001a\u00020N8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bO\u0010PR\u0014\u0010S\u001a\u0002068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010LR\u0014\u0010V\u001a\u00020#8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010X\u001a\u00020#8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\bW\u0010U¨\u0006Y"}, d2 = {"La4/z0$a;", "R", "La4/c;", "Lc5/d;", "Ltq/e;", "completion", "<init>", "(La4/z0;Ltq/e;)V", "La4/o;", "event", "La4/q;", "pass", "Loq/i0;", "F", "(La4/o;La4/q;)V", "", "cause", "y", "(Ljava/lang/Throwable;)V", "Loq/t;", "result", "i", "(Ljava/lang/Object;)V", "k2", "(La4/q;Ltq/e;)Ljava/lang/Object;", "T", "", "timeMillis", "Lkotlin/Function2;", "", "block", "z1", "(JLer/p;Ltq/e;)Ljava/lang/Object;", "s2", "Lc5/h;", "", "l2", "(F)F", "Lc5/v;", "e1", "(J)F", "", "X0", "(F)I", "q2", "(J)I", "b2", "(I)F", "d2", "h0", "y0", "(F)J", "Z", "Lc5/k;", "Lm3/k;", "B2", "(J)J", "a0", "b", "Ltq/e;", "Lju/n;", "c", "Lju/n;", "pointerAwaiter", "d", "La4/q;", "awaitPass", "Ltq/i;", "e", "Ltq/i;", "()Ltq/i;", "context", "A1", "()La4/o;", "currentEvent", "Lc5/r;", "()J", "size", "Landroidx/compose/ui/platform/f3;", "getViewConfiguration", "()Landroidx/compose/ui/platform/f3;", "viewConfiguration", "O0", "extendedTouchPadding", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a<R> implements a4.c, c5.d, tq.e<R> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ z0 f2776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final tq.e<R> completion;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private ju.n<? super o> pointerAwaiter;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private q awaitPass = q.Main;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final tq.i context = tq.j.f191408a;

        /* JADX INFO: renamed from: a4.z0$a$a, reason: collision with other inner class name */
        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class C0039a<T> extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            Object f2782d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            /* synthetic */ Object f2783e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ a<R> f2784f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            int f2785g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0039a(a<R> aVar, tq.e<? super C0039a> eVar) {
                super(eVar);
                this.f2784f = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f2783e = obj;
                this.f2785g |= PKIFailureInfo.systemUnavail;
                return this.f2784f.s2(0L, null, this);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f2786e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ long f2787f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ a<R> f2788g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(long j15, a<R> aVar, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f2787f = j15;
                this.f2788g = aVar;
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
            
                if (ju.z0.b(8, r8) == r0) goto L15;
             */
            @Override // vq.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object J(java.lang.Object r9) throws java.lang.Throwable {
                /*
                    r8 = this;
                    java.lang.Object r0 = uq.b.e()
                    int r1 = r8.f2786e
                    r2 = 8
                    r4 = 2
                    r5 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r5) goto L1c
                    if (r1 != r4) goto L14
                    oq.u.b(r9)
                    goto L38
                L14:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r0)
                    throw r9
                L1c:
                    oq.u.b(r9)
                    goto L2f
                L20:
                    oq.u.b(r9)
                    long r6 = r8.f2787f
                    long r6 = r6 - r2
                    r8.f2786e = r5
                    java.lang.Object r9 = ju.z0.b(r6, r8)
                    if (r9 != r0) goto L2f
                    goto L37
                L2f:
                    r8.f2786e = r4
                    java.lang.Object r9 = ju.z0.b(r2, r8)
                    if (r9 != r0) goto L38
                L37:
                    return r0
                L38:
                    a4.z0$a<R> r9 = r8.f2788g
                    ju.n r9 = a4.z0.a.e(r9)
                    if (r9 == 0) goto L54
                    oq.t$a r0 = oq.t.INSTANCE
                    a4.r r0 = new a4.r
                    long r1 = r8.f2787f
                    r0.<init>(r1)
                    java.lang.Object r0 = oq.u.a(r0)
                    java.lang.Object r0 = oq.t.b(r0)
                    r9.i(r0)
                L54:
                    oq.i0 r9 = oq.i0.f148189a
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: a4.z0.a.b.J(java.lang.Object):java.lang.Object");
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f2787f, this.f2788g, eVar);
            }
        }

        @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
        static final class c<T> extends vq.d {

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f2789d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ a<R> f2790e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            int f2791f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(a<R> aVar, tq.e<? super c> eVar) {
                super(eVar);
                this.f2790e = aVar;
            }

            @Override // vq.a
            public final Object J(Object obj) {
                this.f2789d = obj;
                this.f2791f |= PKIFailureInfo.systemUnavail;
                return this.f2790e.z1(0L, null, this);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public a(tq.e<? super R> eVar) {
            this.f2776a = z0.this;
            this.completion = eVar;
        }

        @Override // a4.c
        public o A1() {
            return z0.this.currentEvent;
        }

        @Override // c5.d
        public long B2(long j15) {
            return this.f2776a.B2(j15);
        }

        public final void F(o event, q pass) {
            ju.n<? super o> nVar;
            if (pass != this.awaitPass || (nVar = this.pointerAwaiter) == null) {
                return;
            }
            this.pointerAwaiter = null;
            nVar.i(oq.t.b(event));
        }

        @Override // a4.c
        public long O0() {
            return z0.this.O0();
        }

        @Override // c5.d
        public int X0(float f15) {
            return this.f2776a.X0(f15);
        }

        @Override // c5.l
        public long Z(float f15) {
            return this.f2776a.Z(f15);
        }

        @Override // c5.d
        public long a0(long j15) {
            return this.f2776a.a0(j15);
        }

        @Override // a4.c
        public long b() {
            return z0.this.boundsSize;
        }

        @Override // c5.d
        public float b2(int i15) {
            return this.f2776a.b2(i15);
        }

        @Override // tq.e
        /* JADX INFO: renamed from: c, reason: from getter */
        public tq.i getContext() {
            return this.context;
        }

        @Override // c5.d
        public float d2(float f15) {
            return this.f2776a.d2(f15);
        }

        @Override // c5.d
        public float e1(long j15) {
            return this.f2776a.e1(j15);
        }

        @Override // c5.d
        public float getDensity() {
            return this.f2776a.getDensity();
        }

        @Override // a4.c
        public f3 getViewConfiguration() {
            return z0.this.getViewConfiguration();
        }

        @Override // c5.l
        public float h0(long j15) {
            return this.f2776a.h0(j15);
        }

        @Override // tq.e
        public void i(Object result) {
            Object obj = z0.this.pointerHandlersLock;
            z0 z0Var = z0.this;
            synchronized (obj) {
                z0Var.pointerHandlers.t(this);
                oq.i0 i0Var = oq.i0.f148189a;
            }
            this.completion.i(result);
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2 */
        public float getFontScale() {
            return this.f2776a.getFontScale();
        }

        @Override // a4.c
        public Object k2(q qVar, tq.e<? super o> eVar) {
            ju.p pVar = new ju.p(uq.b.c(eVar), 1);
            pVar.D();
            this.awaitPass = qVar;
            this.pointerAwaiter = pVar;
            Object objX = pVar.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX;
        }

        @Override // c5.d
        public float l2(float f15) {
            return this.f2776a.l2(f15);
        }

        @Override // c5.d
        public int q2(long j15) {
            return this.f2776a.q2(j15);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r11v0, types: [long] */
        /* JADX WARN: Type inference failed for: r11v1, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r11v3, types: [ju.d2] */
        /* JADX WARN: Type inference failed for: r11v7 */
        /* JADX WARN: Type inference failed for: r11v8 */
        @Override // a4.c
        public <T> Object s2(long j15, er.p<? super a4.c, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
            C0039a c0039a;
            ju.n<? super o> nVar;
            if (eVar instanceof C0039a) {
                c0039a = (C0039a) eVar;
                int i15 = c0039a.f2785g;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    c0039a.f2785g = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    c0039a = new C0039a(this, eVar);
                }
            } else {
                c0039a = new C0039a(this, eVar);
            }
            Object objB = c0039a.f2783e;
            Object objE = uq.b.e();
            int i16 = c0039a.f2785g;
            try {
                if (i16 == 0) {
                    oq.u.b(objB);
                    if (j15 <= 0 && (nVar = this.pointerAwaiter) != null) {
                        oq.t.Companion companion = oq.t.INSTANCE;
                        nVar.i(oq.t.b(oq.u.a(new r(j15))));
                    }
                    d2 d2VarD = ju.k.d(z0.this.M2(), null, null, new b(j15, this, null), 3, null);
                    c0039a.f2782d = d2VarD;
                    c0039a.f2785g = 1;
                    objB = pVar.B(this, c0039a);
                    j15 = d2VarD;
                    if (objB == objE) {
                        return objE;
                    }
                } else {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    d2 d2Var = (d2) c0039a.f2782d;
                    oq.u.b(objB);
                    j15 = d2Var;
                }
                j15.u(a4.d.f2621a);
                return objB;
            } catch (Throwable th4) {
                j15.u(a4.d.f2621a);
                throw th4;
            }
        }

        public final void y(Throwable cause) {
            ju.n<? super o> nVar = this.pointerAwaiter;
            if (nVar != null) {
                nVar.Q(cause);
            }
            this.pointerAwaiter = null;
        }

        @Override // c5.d
        public long y0(float f15) {
            return this.f2776a.y0(f15);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // a4.c
        public <T> Object z1(long j15, er.p<? super a4.c, ? super tq.e<? super T>, ? extends Object> pVar, tq.e<? super T> eVar) throws Throwable {
            c cVar;
            if (eVar instanceof c) {
                cVar = (c) eVar;
                int i15 = cVar.f2791f;
                if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                    cVar.f2791f = i15 - PKIFailureInfo.systemUnavail;
                } else {
                    cVar = new c(this, eVar);
                }
            } else {
                cVar = new c(this, eVar);
            }
            Object obj = cVar.f2789d;
            Object objE = uq.b.e();
            int i16 = cVar.f2791f;
            try {
                if (i16 != 0) {
                    if (i16 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    oq.u.b(obj);
                    return obj;
                }
                oq.u.b(obj);
                cVar.f2791f = 1;
                Object objS2 = s2(j15, pVar, cVar);
                return objS2 == objE ? objE : objS2;
            } catch (r unused) {
                return null;
            }
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2792a;

        static {
            int[] iArr = new int[q.values().length];
            try {
                iArr[q.Initial.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q.Final.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[q.Main.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f2792a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loq/i0;", "c", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends fr.w implements er.l<Throwable, oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ a<R> f2793b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(a<R> aVar) {
            super(1);
            this.f2793b = aVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(Throwable th4) {
            c(th4);
            return oq.i0.f148189a;
        }

        public final void c(Throwable th4) {
            this.f2793b.y(th4);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f2794e;

        d(tq.e<? super d> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0034, code lost:
        
            if (r5.B(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0045, code lost:
        
            if (r5.invoke(r1, r4) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0047, code lost:
        
            return r0;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f2794e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1b
                if (r1 == r3) goto L17
                if (r1 != r2) goto Lf
                goto L17
            Lf:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L17:
                oq.u.b(r5)
                goto L48
            L1b:
                oq.u.b(r5)
                a4.z0 r5 = a4.z0.this
                er.p r5 = a4.z0.r3(r5)
                if (r5 == 0) goto L37
                a4.z0 r5 = a4.z0.this
                er.p r5 = a4.z0.r3(r5)
                a4.z0 r1 = a4.z0.this
                r4.f2794e = r3
                java.lang.Object r5 = r5.B(r1, r4)
                if (r5 != r0) goto L48
                goto L47
            L37:
                a4.z0 r5 = a4.z0.this
                androidx.compose.ui.input.pointer.PointerInputEventHandler r5 = r5.get_pointerInputEventHandler()
                a4.z0 r1 = a4.z0.this
                r4.f2794e = r2
                java.lang.Object r5 = r5.invoke(r1, r4)
                if (r5 != r0) goto L48
            L47:
                return r0
            L48:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: a4.z0.d.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return z0.this.new d(eVar);
        }
    }

    public z0(Object obj, Object obj2, Object[] objArr, PointerInputEventHandler pointerInputEventHandler) {
        this.key1 = obj;
        this.key2 = obj2;
        this.keys = objArr;
        this._pointerInputEventHandler = pointerInputEventHandler;
        n2.c<a<?>> cVar = new n2.c<>(new a[16], 0);
        this.pointerHandlers = cVar;
        this.pointerHandlersLock = cVar;
        this.dispatchingPointerHandlers = new n2.c<>(new a[16], 0);
        this.boundsSize = c5.r.INSTANCE.a();
    }

    private final void s3(o pointerEvent, q pass) {
        synchronized (this.pointerHandlersLock) {
            n2.c<a<?>> cVar = this.dispatchingPointerHandlers;
            cVar.g(cVar.getSize(), this.pointerHandlers);
        }
        try {
            int i15 = b.f2792a[pass.ordinal()];
            if (i15 == 1 || i15 == 2) {
                n2.c<a<?>> cVar2 = this.dispatchingPointerHandlers;
                a<?>[] aVarArr = cVar2.content;
                int size = cVar2.getSize();
                for (int i16 = 0; i16 < size; i16++) {
                    aVarArr[i16].F(pointerEvent, pass);
                }
            } else {
                if (i15 != 3) {
                    throw new oq.p();
                }
                n2.c<a<?>> cVar3 = this.dispatchingPointerHandlers;
                int size2 = cVar3.getSize() - 1;
                a<?>[] aVarArr2 = cVar3.content;
                if (size2 < aVarArr2.length) {
                    while (size2 >= 0) {
                        aVarArr2[size2].F(pointerEvent, pass);
                        size2--;
                    }
                }
            }
            this.dispatchingPointerHandlers.j();
        } catch (Throwable th4) {
            this.dispatchingPointerHandlers.j();
            throw th4;
        }
    }

    @Override // g4.f1
    public void C2() {
        r1();
    }

    @Override // a4.k0
    public <R> Object D1(er.p<? super a4.c, ? super tq.e<? super R>, ? extends Object> pVar, tq.e<? super R> eVar) {
        ju.p pVar2 = new ju.p(uq.b.c(eVar), 1);
        pVar2.D();
        a aVar = new a(pVar2);
        synchronized (this.pointerHandlersLock) {
            this.pointerHandlers.d(aVar);
            tq.e<oq.i0> eVarA = tq.g.a(pVar, aVar, aVar);
            oq.t.Companion companion = oq.t.INSTANCE;
            eVarA.i(oq.t.b(oq.i0.f148189a));
        }
        pVar2.E(new c(aVar));
        Object objX = pVar2.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    @Override // g4.g, g4.f1
    public void I() {
        r1();
    }

    public long O0() {
        long jB2 = B2(getViewConfiguration().e());
        long boundsSize = getBoundsSize();
        return m3.k.d((((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB2 >> 32)) - ((int) (boundsSize >> 32))) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jB2 & BodyPartID.bodyIdMax)) - ((int) (boundsSize & BodyPartID.bodyIdMax))) / 2.0f)) & BodyPartID.bodyIdMax));
    }

    @Override // f3.m.c
    public void X2() {
        r1();
        super.X2();
    }

    @Override // g4.f1
    public void Y(o pointerEvent, q pass, long bounds) {
        this.boundsSize = bounds;
        if (pass == q.Initial) {
            this.currentEvent = pointerEvent;
        }
        if (this.pointerInputJob == null) {
            this.pointerInputJob = ju.k.d(M2(), null, ju.r0.UNDISPATCHED, new d(null), 1, null);
        }
        s3(pointerEvent, pass);
        List<PointerInputChange> listC = pointerEvent.c();
        int size = listC.size();
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                z15 = true;
                break;
            } else if (!p.d(listC.get(i15))) {
                break;
            } else {
                i15++;
            }
        }
        if (z15) {
            pointerEvent = null;
        }
        this.lastPointerEvent = pointerEvent;
    }

    @Override // g4.f1
    public void Z1() {
        o oVar = this.lastPointerEvent;
        if (oVar == null) {
            return;
        }
        List<PointerInputChange> listC = oVar.c();
        int size = listC.size();
        for (int i15 = 0; i15 < size; i15++) {
            if (listC.get(i15).getPressed()) {
                List<PointerInputChange> listC2 = oVar.c();
                ArrayList arrayList = new ArrayList(listC2.size());
                int size2 = listC2.size();
                for (int i16 = 0; i16 < size2; i16++) {
                    PointerInputChange pointerInputChange = listC2.get(i16);
                    arrayList.add(new PointerInputChange(pointerInputChange.getId(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), false, pointerInputChange.getPressure(), pointerInputChange.getUptimeMillis(), pointerInputChange.getPosition(), pointerInputChange.getPressed(), pointerInputChange.getPressed(), pointerInputChange.getType(), 0L, 0.0f, 0L, 7168, (fr.k) null));
                }
                o oVar2 = new o(arrayList);
                this.currentEvent = oVar2;
                s3(oVar2, q.Initial);
                s3(oVar2, q.Main);
                s3(oVar2, q.Final);
                this.lastPointerEvent = null;
                return;
            }
        }
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public long getBoundsSize() {
        return this.boundsSize;
    }

    @Override // c5.d
    public float getDensity() {
        return g4.h.s(this).getDensity().getDensity();
    }

    @Override // a4.k0
    public f3 getViewConfiguration() {
        return g4.h.s(this).getViewConfiguration();
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return g4.h.s(this).getDensity().getFontScale();
    }

    @Override // a4.y0
    public void r1() {
        d2 d2Var = this.pointerInputJob;
        if (d2Var != null) {
            d2Var.u(new j0());
            this.pointerInputJob = null;
        }
    }

    /* JADX INFO: renamed from: t3, reason: from getter */
    public PointerInputEventHandler get_pointerInputEventHandler() {
        return this._pointerInputEventHandler;
    }

    public final void u3(Object key1, Object key2, Object[] keys, PointerInputEventHandler pointerInputEventHandler) {
        boolean z15 = !fr.t.c(this.key1, key1);
        this.key1 = key1;
        if (!fr.t.c(this.key2, key2)) {
            z15 = true;
        }
        this.key2 = key2;
        Object[] objArr = this.keys;
        if (objArr != null && keys == null) {
            z15 = true;
        }
        if (objArr == null && keys != null) {
            z15 = true;
        }
        if (objArr != null && keys != null && !Arrays.equals(keys, objArr)) {
            z15 = true;
        }
        this.keys = keys;
        if (get_pointerInputEventHandler().getClass() == pointerInputEventHandler.getClass() ? z15 : true) {
            r1();
        }
        this._pointerInputEventHandler = pointerInputEventHandler;
    }
}
