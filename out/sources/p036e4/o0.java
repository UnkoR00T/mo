package p036e4;

import androidx.compose.ui.node.k;
import androidx.compose.ui.platform.s2;
import c5.t;
import er.l;
import er.p;
import f3.m;
import fr.w;
import g4.g0;
import g4.p0;
import g4.p1;
import g4.q1;
import g4.r1;
import g4.z0;
import java.util.List;
import java.util.Map;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.e5;
import p076m2.n;
import p076m2.p3;
import p076m2.r;
import p076m2.s3;
import p076m2.v;
import p076m2.y4;
import r0.g1;
import r0.k0;
import r0.t0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001:\u0003ZbDB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J7\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\b\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J'\u0010\u001a\u001a\u0004\u0018\u00010\t2\f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001b\u0010\u001e\u001a\u00020\u000e*\u00020\u00122\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\u000e2\u0006\u0010 \u001a\u00020\u000bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u000e*\u00020\u0002H\u0002¢\u0006\u0004\b%\u0010&J\u001b\u0010'\u001a\u0004\u0018\u00010\u00022\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u000eH\u0002¢\u0006\u0004\b)\u0010$J/\u0010*\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010-\u001a\u00020\u000e*\u00020\u00122\u0006\u0010,\u001a\u00020\u000bH\u0002¢\u0006\u0004\b-\u0010.J\u0013\u0010/\u001a\u00020\u000e*\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u0019\u00101\u001a\u00020\u000e2\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u0002032\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00022\u0006\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b6\u00107J)\u0010;\u001a\u00020\u000e2\u0006\u00108\u001a\u00020\u00182\u0006\u00109\u001a\u00020\u00182\b\b\u0002\u0010:\u001a\u00020\u0018H\u0002¢\u0006\u0004\b;\u0010<J\u001b\u0010>\u001a\u00020\u000e*\u00020\u00122\u0006\u0010=\u001a\u00020\u000bH\u0002¢\u0006\u0004\b>\u0010.J-\u0010@\u001a\b\u0012\u0004\u0012\u00020?0\u00162\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rH\u0002¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u000eH\u0016¢\u0006\u0004\bB\u0010$J\u000f\u0010C\u001a\u00020\u000eH\u0016¢\u0006\u0004\bC\u0010$J\u000f\u0010D\u001a\u00020\u000eH\u0016¢\u0006\u0004\bD\u0010$J+\u0010E\u001a\b\u0012\u0004\u0012\u00020?0\u00162\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bE\u0010AJ\u0015\u0010G\u001a\u00020\u000e2\u0006\u0010F\u001a\u00020\u0018¢\u0006\u0004\bG\u0010HJ\r\u0010I\u001a\u00020\u000e¢\u0006\u0004\bI\u0010$J'\u0010P\u001a\u00020O2\u0018\u0010N\u001a\u0014\u0012\u0004\u0012\u00020K\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020M0J¢\u0006\u0004\bP\u0010QJ%\u0010R\u001a\u0002032\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bR\u0010SJ%\u0010U\u001a\u00020T2\b\u0010\n\u001a\u0004\u0018\u00010\t2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\bU\u0010VJ\r\u0010W\u001a\u00020\u000e¢\u0006\u0004\bW\u0010$R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010XR$\u0010`\u001a\u0004\u0018\u00010Y8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R*\u0010\u0005\u001a\u00020\u00042\u0006\u0010a\u001a\u00020\u00048\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u0016\u0010i\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010IR\u0016\u0010k\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010IR \u0010o\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00120l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\"\u0010q\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010nR\u0018\u0010u\u001a\u00060rR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR\u0018\u0010y\u001a\u00060vR\u00020\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\"\u0010{\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u00020\u00020l8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010nR\u0014\u0010\u007f\u001a\u00020|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R$\u0010\u0081\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\t\u0012\u0004\u0012\u0002030l8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0080\u0001\u0010nR \u0010\u0085\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\t0\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0087\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010IR\u0018\u0010\u0089\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0088\u0001\u0010IR\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018\u0002X\u0082D¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0019\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0001\u0010\u008f\u0001¨\u0006\u0091\u0001"}, d2 = {"Le4/o0;", "Lm2/n;", "Landroidx/compose/ui/node/g;", "root", "Le4/t2;", "slotReusePolicy", "<init>", "(Landroidx/compose/ui/node/g;Le4/t2;)V", "node", "", "slotId", "", "pausable", "Lkotlin/Function0;", "Loq/i0;", "content", "V", "(Landroidx/compose/ui/node/g;Ljava/lang/Object;ZLer/p;)V", "Le4/o0$b;", "nodeState", "U", "(Landroidx/compose/ui/node/g;Le4/o0$b;Z)V", "", "foldedChildren", "", "index", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/util/List;I)Ljava/lang/Object;", "Lg4/z0;", "executor", "A", "(Le4/o0$b;Lg4/z0;)V", "deactivate", "J", "(Z)V", "B", "()V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Landroidx/compose/ui/node/g;)V", "W", "(Ljava/lang/Object;)Landroidx/compose/ui/node/g;", "E", "N", "(Ljava/lang/Object;Ler/p;Z)V", "forceDeactivate", "Q", "(Le4/o0$b;Z)V", "w", "(Le4/o0$b;)V", ip.a.f96138c, "(Ljava/lang/Object;)V", "Le4/r2$b;", "z", "(Ljava/lang/Object;)Le4/r2$b;", "y", "(I)Landroidx/compose/ui/node/g;", "from", "to", "count", "K", "(III)V", "shouldComplete", "t", "Le4/v0;", "v", "(Ljava/lang/Object;Ler/p;)Ljava/util/List;", "o", "i", "a", "T", "startIndex", "C", "(I)V", "I", "Lkotlin/Function2;", "Le4/s2;", "Lc5/b;", "Le4/x0;", "block", "Le4/w0;", "x", "(Ler/p;)Le4/w0;", "M", "(Ljava/lang/Object;Ler/p;)Le4/r2$b;", "Le4/r2$a;", "O", "(Ljava/lang/Object;Ler/p;)Le4/r2$a;", "F", "Landroidx/compose/ui/node/g;", "Lm2/v;", "b", "Lm2/v;", "getCompositionContext", "()Lm2/v;", "R", "(Lm2/v;)V", "compositionContext", "value", "c", "Le4/t2;", "getSlotReusePolicy", "()Le4/t2;", ip.a.f96137b, "(Le4/t2;)V", "d", "currentIndex", "e", "currentApproachIndex", "Lr0/t0;", "f", "Lr0/t0;", "nodeToNodeState", "g", "slotIdToNode", "Le4/o0$c;", "h", "Le4/o0$c;", "scope", "Le4/o0$a;", "j", "Le4/o0$a;", "approachMeasureScope", "k", "precomposeMap", "Le4/t2$a;", "l", "Le4/t2$a;", "reusableSlotIdsSet", "m", "approachPrecomposeSlotHandleMap", "Ln2/c;", "n", "Ln2/c;", "slotIdsOfCompositionsNeededInApproach", "p", "reusableCount", "q", "precomposedCount", "", "r", "Ljava/lang/String;", "NoIntrinsicsMessage", "G", "()Lg4/z0;", "outOfFrameExecutor", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class o0 implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.g root;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private v compositionContext;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private t2 slotReusePolicy;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int currentApproachIndex;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int reusableCount;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int precomposedCount;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final t0<androidx.compose.ui.node.g, b> nodeToNodeState = g1.c();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, androidx.compose.ui.node.g> slotIdToNode = g1.c();

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final c scope = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final a approachMeasureScope = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, androidx.compose.ui.node.g> precomposeMap = g1.c();

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t2.a reusableSlotIdsSet = new t2.a(null, 1, null);

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, r2.b> approachPrecomposeSlotHandleMap = g1.c();

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final n2.c<Object> slotIdsOfCompositionsNeededInApproach = new n2.c<>(new Object[16], 0);

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final String NoIntrinsicsMessage = "Asking for intrinsic measurements of SubcomposeLayout layouts is not supported. This includes components that are built on top of SubcomposeLayout, such as lazy lists, BoxWithConstraints, TabRow, etc. To mitigate this:\n- if intrinsic measurements are used to achieve 'match parent' sizing, consider replacing the parent of the component with a custom layout which controls the order in which children are measured, making intrinsic measurement not needed\n- adding a size modifier to the component, in order to fast return the queried intrinsic measurement.";

    @Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J-\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJH\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014H\u0096\u0001¢\u0006\u0004\b\u0018\u0010\u0019J^\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u000e0\u00112\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b\u0018\u00010\u00142\u0012\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\b0\u0014H\u0096\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0014\u0010 \u001a\u00020\u001f*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b \u0010!J\u0014\u0010#\u001a\u00020\u001f*\u00020\"H\u0097\u0001¢\u0006\u0004\b#\u0010$J\u0014\u0010%\u001a\u00020\u000e*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b%\u0010&J\u0014\u0010'\u001a\u00020\u000e*\u00020\"H\u0097\u0001¢\u0006\u0004\b'\u0010(J\u0014\u0010)\u001a\u00020\u001e*\u00020\u000eH\u0097\u0001¢\u0006\u0004\b)\u0010*J\u0014\u0010+\u001a\u00020\u001e*\u00020\u001fH\u0097\u0001¢\u0006\u0004\b+\u0010!J\u0014\u0010,\u001a\u00020\u001e*\u00020\"H\u0097\u0001¢\u0006\u0004\b,\u0010$J\u0014\u0010-\u001a\u00020\"*\u00020\u001fH\u0097\u0001¢\u0006\u0004\b-\u0010.J\u0014\u0010/\u001a\u00020\"*\u00020\u001eH\u0097\u0001¢\u0006\u0004\b/\u0010.J\u0014\u00102\u001a\u000201*\u000200H\u0097\u0001¢\u0006\u0004\b2\u00103J\u0014\u00104\u001a\u000200*\u000201H\u0097\u0001¢\u0006\u0004\b4\u00103R\u0014\u00108\u001a\u0002058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u0010<\u001a\u0002098VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010?\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b=\u0010>R\u0014\u0010A\u001a\u00020\u001f8\u0016X\u0097\u0005¢\u0006\u0006\u001a\u0004\b@\u0010>¨\u0006B"}, d2 = {"Le4/o0$a;", "Le4/s2;", "Le4/y0;", "<init>", "(Le4/o0;)V", "", "slotId", "Lkotlin/Function0;", "Loq/i0;", "content", "", "Le4/v0;", "g0", "(Ljava/lang/Object;Ler/p;)Ljava/util/List;", "", "width", "height", "", "Le4/a;", "alignmentLines", "Lkotlin/Function1;", "Le4/a2$a;", "placementBlock", "Le4/x0;", "x1", "(IILjava/util/Map;Ler/l;)Le4/x0;", "Le4/k2;", "rulers", "E0", "(IILjava/util/Map;Ler/l;Ler/l;)Le4/x0;", "Lc5/h;", "", "l2", "(F)F", "Lc5/v;", "e1", "(J)F", "X0", "(F)I", "q2", "(J)I", "b2", "(I)F", "d2", "h0", "y0", "(F)J", "Z", "Lc5/k;", "Lm3/k;", "B2", "(J)J", "a0", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "", "J0", "()Z", "isLookingAhead", "getDensity", "()F", "density", "i2", "fontScale", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements s2, y0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final /* synthetic */ c f47343a;

        public a() {
            this.f47343a = o0.this.scope;
        }

        @Override // c5.d
        public long B2(long j15) {
            return this.f47343a.B2(j15);
        }

        @Override // p036e4.y0
        public x0 E0(int width, int height, Map<p036e4.a, Integer> alignmentLines, l<? super k2, i0> rulers, l<? super a2.a, i0> placementBlock) {
            return this.f47343a.E0(width, height, alignmentLines, rulers, placementBlock);
        }

        @Override // p036e4.w
        public boolean J0() {
            return this.f47343a.J0();
        }

        @Override // c5.d
        public int X0(float f15) {
            return this.f47343a.X0(f15);
        }

        @Override // c5.l
        public long Z(float f15) {
            return this.f47343a.Z(f15);
        }

        @Override // c5.d
        public long a0(long j15) {
            return this.f47343a.a0(j15);
        }

        @Override // c5.d
        public float b2(int i15) {
            return this.f47343a.b2(i15);
        }

        @Override // c5.d
        public float d2(float f15) {
            return this.f47343a.d2(f15);
        }

        @Override // c5.d
        public float e1(long j15) {
            return this.f47343a.e1(j15);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // p036e4.s2
        public List<v0> g0(Object slotId, p<? super r, ? super Integer, i0> content) {
            androidx.compose.ui.node.g gVar = (androidx.compose.ui.node.g) o0.this.slotIdToNode.e(slotId);
            return (gVar == null || o0.this.root.W().indexOf(gVar) >= o0.this.currentIndex) ? o0.this.v(slotId, content) : gVar.Q();
        }

        @Override // c5.d
        public float getDensity() {
            return this.f47343a.getDensity();
        }

        @Override // p036e4.w
        public t getLayoutDirection() {
            return this.f47343a.getLayoutDirection();
        }

        @Override // c5.l
        public float h0(long j15) {
            return this.f47343a.h0(j15);
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2 */
        public float getFontScale() {
            return this.f47343a.getFontScale();
        }

        @Override // c5.d
        public float l2(float f15) {
            return this.f47343a.l2(f15);
        }

        @Override // c5.d
        public int q2(long j15) {
            return this.f47343a.q2(j15);
        }

        @Override // p036e4.y0
        public x0 x1(int width, int height, Map<p036e4.a, Integer> alignmentLines, l<? super a2.a, i0> placementBlock) {
            return this.f47343a.x1(width, height, alignmentLines, placementBlock);
        }

        @Override // c5.d
        public long y0(float f15) {
            return this.f47343a.y0(f15);
        }
    }

    @Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\fJ]\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\r0\u00102\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00132\u0012\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u00070\u0013H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\"\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\"\u0010-\u001a\u00020#8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b(\u0010%\u001a\u0004\b+\u0010'\"\u0004\b,\u0010)R\u0014\u00101\u001a\u00020.8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00062"}, d2 = {"Le4/o0$c;", "Le4/s2;", "<init>", "(Le4/o0;)V", "", "slotId", "Lkotlin/Function0;", "Loq/i0;", "content", "", "Le4/v0;", "g0", "(Ljava/lang/Object;Ler/p;)Ljava/util/List;", "", "width", "height", "", "Le4/a;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "rulers", "Le4/a2$a;", "placementBlock", "Le4/x0;", "E0", "(IILjava/util/Map;Ler/l;Ler/l;)Le4/x0;", "Lc5/t;", "a", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "h", "(Lc5/t;)V", "layoutDirection", "", "b", "F", "getDensity", "()F", "c", "(F)V", "density", "i2", "e", "fontScale", "", "J0", "()Z", "isLookingAhead", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class c implements s2 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private t layoutDirection = t.Rtl;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private float density;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private float fontScale;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"e4/o0$c$a", "Le4/x0;", "Loq/i0;", "k", "()V", "", "l", "()I", "width", "getHeight", "height", "", "Le4/a;", "i", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "m", "()Ler/l;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements x0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ int f47358a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ int f47359b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Map<p036e4.a, Integer> f47360c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ l<k2, i0> f47361d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c f47362e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ o0 f47363f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ l<a2.a, i0> f47364g;

            /* JADX WARN: Multi-variable type inference failed */
            a(int i15, int i16, Map<p036e4.a, Integer> map, l<? super k2, i0> lVar, c cVar, o0 o0Var, l<? super a2.a, i0> lVar2) {
                this.f47358a = i15;
                this.f47359b = i16;
                this.f47360c = map;
                this.f47361d = lVar;
                this.f47362e = cVar;
                this.f47363f = o0Var;
                this.f47364g = lVar2;
            }

            @Override // p036e4.x0
            public int getHeight() {
                return this.f47359b;
            }

            @Override // p036e4.x0
            public Map<p036e4.a, Integer> i() {
                return this.f47360c;
            }

            @Override // p036e4.x0
            public void k() {
                k lookaheadDelegate;
                if (!this.f47362e.J0() || (lookaheadDelegate = this.f47363f.root.b0().getLookaheadDelegate()) == null) {
                    this.f47364g.b(this.f47363f.root.b0().getPlacementScope());
                } else {
                    this.f47364g.b(lookaheadDelegate.getPlacementScope());
                }
            }

            @Override // p036e4.x0
            /* JADX INFO: renamed from: l, reason: from getter */
            public int getWidth() {
                return this.f47358a;
            }

            @Override // p036e4.x0
            public l<k2, i0> m() {
                return this.f47361d;
            }
        }

        public c() {
        }

        @Override // p036e4.y0
        public x0 E0(int width, int height, Map<p036e4.a, Integer> alignmentLines, l<? super k2, i0> rulers, l<? super a2.a, i0> placementBlock) {
            if (!((width & (-16777216)) == 0 && ((-16777216) & height) == 0)) {
                d4.a.c("Size(" + width + " x " + height + ") is out of range. Each dimension must be between 0 and 16777215.");
            }
            return new a(width, height, alignmentLines, rulers, this, o0.this, placementBlock);
        }

        @Override // p036e4.w
        public boolean J0() {
            return o0.this.root.i0() == androidx.compose.ui.node.g.e.LookaheadLayingOut || o0.this.root.i0() == androidx.compose.ui.node.g.e.LookaheadMeasuring;
        }

        public void c(float f15) {
            this.density = f15;
        }

        public void e(float f15) {
            this.fontScale = f15;
        }

        @Override // p036e4.s2
        public List<v0> g0(Object slotId, p<? super r, ? super Integer, i0> content) {
            return o0.this.T(slotId, content);
        }

        @Override // c5.d
        public float getDensity() {
            return this.density;
        }

        @Override // p036e4.w
        public t getLayoutDirection() {
            return this.layoutDirection;
        }

        public void h(t tVar) {
            this.layoutDirection = tVar;
        }

        @Override // c5.l
        /* JADX INFO: renamed from: i2, reason: from getter */
        public float getFontScale() {
            return this.fontScale;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"e4/o0$d", "Landroidx/compose/ui/node/g$f;", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d extends androidx.compose.ui.node.g.f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<s2, c5.b, x0> f47366c;

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"e4/o0$d$a", "Le4/x0;", "Loq/i0;", "k", "()V", "", "l", "()I", "width", "getHeight", "height", "", "Le4/a;", "i", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "m", "()Ler/l;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class a implements x0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x0 f47367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f47368b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f47369c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ x0 f47370d;

            public a(x0 x0Var, o0 o0Var, int i15, x0 x0Var2) {
                this.f47368b = o0Var;
                this.f47369c = i15;
                this.f47370d = x0Var2;
                this.f47367a = x0Var;
            }

            @Override // p036e4.x0
            public int getHeight() {
                return this.f47367a.getHeight();
            }

            @Override // p036e4.x0
            public Map<p036e4.a, Integer> i() {
                return this.f47367a.i();
            }

            @Override // p036e4.x0
            public void k() {
                this.f47368b.currentApproachIndex = this.f47369c;
                this.f47370d.k();
                this.f47368b.E();
                o0 o0Var = this.f47368b;
                o0Var.C(o0Var.currentIndex);
            }

            @Override // p036e4.x0
            /* JADX INFO: renamed from: l */
            public int getWidth() {
                return this.f47367a.getWidth();
            }

            @Override // p036e4.x0
            public l<k2, i0> m() {
                return this.f47367a.m();
            }
        }

        @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u0014\u0010\b\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00058\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007R \u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\"\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00108VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"e4/o0$d$b", "Le4/x0;", "Loq/i0;", "k", "()V", "", "l", "()I", "width", "getHeight", "height", "", "Le4/a;", "i", "()Ljava/util/Map;", "alignmentLines", "Lkotlin/Function1;", "Le4/k2;", "m", "()Ler/l;", "rulers", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class b implements x0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private final /* synthetic */ x0 f47371a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o0 f47372b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ int f47373c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ x0 f47374d;

            public b(x0 x0Var, o0 o0Var, int i15, x0 x0Var2) {
                this.f47372b = o0Var;
                this.f47373c = i15;
                this.f47374d = x0Var2;
                this.f47371a = x0Var;
            }

            @Override // p036e4.x0
            public int getHeight() {
                return this.f47371a.getHeight();
            }

            @Override // p036e4.x0
            public Map<p036e4.a, Integer> i() {
                return this.f47371a.i();
            }

            @Override // p036e4.x0
            public void k() {
                this.f47372b.currentIndex = this.f47373c;
                this.f47374d.k();
                if (this.f47372b.root.getLookaheadRoot() == null) {
                    o0 o0Var = this.f47372b;
                    o0Var.C(o0Var.currentIndex);
                }
            }

            @Override // p036e4.x0
            /* JADX INFO: renamed from: l */
            public int getWidth() {
                return this.f47371a.getWidth();
            }

            @Override // p036e4.x0
            public l<k2, i0> m() {
                return this.f47371a.m();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(p<? super s2, ? super c5.b, ? extends x0> pVar, String str) {
            super(str);
            this.f47366c = pVar;
        }

        @Override // p036e4.w0
        public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            o0.this.scope.h(y0Var.getLayoutDirection());
            o0.this.scope.c(y0Var.getDensity());
            o0.this.scope.e(y0Var.getFontScale());
            if (y0Var.J0() || o0.this.root.getLookaheadRoot() == null) {
                o0.this.currentIndex = 0;
                x0 x0VarB = this.f47366c.B(o0.this.scope, c5.b.a(j15));
                return new b(x0VarB, o0.this, o0.this.currentIndex, x0VarB);
            }
            o0.this.currentApproachIndex = 0;
            x0 x0VarB2 = this.f47366c.B(o0.this.approachMeasureScope, c5.b.a(j15));
            return new a(x0VarB2, o0.this, o0.this.currentApproachIndex, x0VarB2);
        }
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"e4/o0$e", "Le4/r2$b;", "Loq/i0;", "j", "()V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements r2.b {
        e() {
        }

        @Override // e4.r2.b
        public void j() {
        }
    }

    @Metadata(d1 = {"\u0000E\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001f\u0010\t\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\t\u0010\nJ-\u0010\u0011\u001a\u00020\u00022\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f0\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0017\u0010\u001b\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001e\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"e4/o0$f", "Le4/r2$b;", "Loq/i0;", "j", "()V", "", "index", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "f", "(IJ)V", "", "key", "Lkotlin/Function1;", "Lg4/q1;", "Lg4/p1;", "block", "e", "(Ljava/lang/Object;Ler/l;)V", "Lc5/r;", "d", "(I)J", "Lr0/k0;", "a", "Lr0/k0;", "getHasPremeasured", "()Lr0/k0;", "hasPremeasured", "c", "()I", "placeablesCount", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class f implements r2.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final k0 hasPremeasured = r0.t.b();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f47377c;

        f(Object obj) {
            this.f47377c = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e4.r2.b
        public int c() {
            List<androidx.compose.ui.node.g> listR;
            androidx.compose.ui.node.g gVar = (androidx.compose.ui.node.g) o0.this.precomposeMap.e(this.f47377c);
            if (gVar == null || (listR = gVar.R()) == null) {
                return 0;
            }
            return listR.size();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e4.r2.b
        public long d(int index) {
            androidx.compose.ui.node.g gVar = (androidx.compose.ui.node.g) o0.this.precomposeMap.e(this.f47377c);
            if (gVar != null && gVar.c()) {
                int size = gVar.R().size();
                if (index < 0 || index >= size) {
                    d4.a.e("Index (" + index + ") is out of bound of [0, " + size + ')');
                }
                if (this.hasPremeasured.a(index)) {
                    return c5.r.c((((long) gVar.R().get(index).I0()) << 32) | (((long) gVar.R().get(index).a0()) & BodyPartID.bodyIdMax));
                }
            }
            return c5.r.INSTANCE.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e4.r2.b
        public void e(Object key, l<? super q1, ? extends p1> block) {
            p0 nodes;
            androidx.compose.ui.node.g gVar = (androidx.compose.ui.node.g) o0.this.precomposeMap.e(this.f47377c);
            m.c head = (gVar == null || (nodes = gVar.getNodes()) == null) ? null : nodes.getHead();
            if (head == null || !head.getIsAttached()) {
                return;
            }
            r1.e(head, key, block);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // e4.r2.b
        public void f(int index, long constraints) {
            androidx.compose.ui.node.g gVar = (androidx.compose.ui.node.g) o0.this.precomposeMap.e(this.f47377c);
            if (gVar == null || !gVar.c()) {
                return;
            }
            int size = gVar.R().size();
            if (index < 0 || index >= size) {
                d4.a.e("Index (" + index + ") is out of bound of [0, " + size + ')');
            }
            if (gVar.p()) {
                d4.a.a("Pre-measure called on node that is not placed");
            }
            androidx.compose.ui.node.g gVar2 = o0.this.root;
            gVar2.ignoreRemeasureRequests = true;
            g0.b(gVar).E(gVar.R().get(index), constraints);
            i0 i0Var = i0.f148189a;
            gVar2.ignoreRemeasureRequests = false;
            this.hasPremeasured.h(index);
        }

        @Override // e4.r2.b
        public void j() {
            o0.this.D(this.f47377c);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class g extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f47378b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(b bVar) {
            super(0);
            this.f47378b = bVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            y4 composition;
            if (this.f47378b.a() || (composition = this.f47378b.getComposition()) == null) {
                return;
            }
            composition.deactivate();
        }
    }

    @Metadata(d1 = {"\u0000'\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0010\u001a\u00020\u00048\u0016X\u0096D¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\r\u0010\u000f¨\u0006\u0011"}, d2 = {"e4/o0$h", "", "Lm2/e5;", "shouldPause", "", "b", "(Lm2/e5;)Z", "Le4/r2$b;", "apply", "()Le4/r2$b;", "Loq/i0;", "cancel", "()V", "a", "Z", "()Z", "isComplete", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements r2.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final boolean isComplete = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ Object f47381c;

        h(Object obj) {
            this.f47381c = obj;
        }

        @Override // e4.r2.a
        /* JADX INFO: renamed from: a, reason: from getter */
        public boolean getIsComplete() {
            return this.isComplete;
        }

        @Override // e4.r2.a
        public r2.b apply() {
            return o0.this.z(this.f47381c);
        }

        @Override // e4.r2.a
        public boolean b(e5 shouldPause) {
            return true;
        }

        @Override // e4.r2.a
        public void cancel() {
        }
    }

    @Metadata(d1 = {"\u0000/\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0016\u0010\u0010\u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0013\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0014"}, d2 = {"e4/o0$i", "", "Loq/i0;", "cancel", "()V", "Lm2/e5;", "shouldPause", "", "b", "(Lm2/e5;)Z", "Le4/r2$b;", "apply", "()Le4/r2$b;", "Le4/o0$b;", "c", "()Le4/o0$b;", "nodeState", "a", "()Z", "isComplete", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements r2.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Object f47383b;

        i(Object obj) {
            this.f47383b = obj;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private final b c() {
            androidx.compose.ui.node.g gVar = (androidx.compose.ui.node.g) o0.this.precomposeMap.e(this.f47383b);
            if (gVar != null) {
                return (b) o0.this.nodeToNodeState.e(gVar);
            }
            return null;
        }

        @Override // e4.r2.a
        /* JADX INFO: renamed from: a */
        public boolean getIsComplete() {
            s3 pausedComposition;
            b bVarC = c();
            if (bVarC == null || (pausedComposition = bVarC.getPausedComposition()) == null) {
                return true;
            }
            return pausedComposition.a();
        }

        @Override // e4.r2.a
        public r2.b apply() {
            b bVarC = c();
            if (bVarC != null) {
                o0.this.t(bVarC, false);
            }
            return o0.this.z(this.f47383b);
        }

        @Override // e4.r2.a
        public boolean b(e5 shouldPause) {
            b bVarC = c();
            s3 pausedComposition = bVarC != null ? bVarC.getPausedComposition() : null;
            if (pausedComposition == null || pausedComposition.a()) {
                return true;
            }
            c3.l.Companion companion = c3.l.INSTANCE;
            Object obj = this.f47383b;
            c3.l lVarD = companion.d();
            l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                boolean zB = pausedComposition.b(shouldPause);
                companion.l(lVarD, lVarE, lVarG);
                return zB;
            } catch (Throwable th4) {
                try {
                    if (bVarC.getOperations() != null) {
                        throw new q2(bVarC.getOperations(), obj, th4);
                    }
                    throw th4;
                } catch (Throwable th5) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th5;
                }
            }
        }

        @Override // e4.r2.a
        public void cancel() {
            b bVarC = c();
            if ((bVarC != null ? bVarC.getPausedComposition() : null) != null) {
                o0.this.D(this.f47383b);
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "(Lm2/r;I)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends w implements p<r, Integer, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b f47384b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ p<r, Integer, i0> f47385c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        j(b bVar, p<? super r, ? super Integer, i0> pVar) {
            super(2);
            this.f47384b = bVar;
            this.f47385c = pVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(r rVar, Integer num) {
            c(rVar, num.intValue());
            return i0.f148189a;
        }

        public final void c(r rVar, int i15) {
            if (!rVar.r((i15 & 3) != 2, i15 & 1)) {
                rVar.O();
                return;
            }
            if (p076m2.t.k()) {
                p076m2.t.o(1524156494, i15, -1, "androidx.compose.ui.layout.LayoutNodeSubcompositionsState.subcompose.<anonymous>.<anonymous>.<anonymous> (SubcomposeLayout.kt:706)");
            }
            boolean zA = this.f47384b.a();
            p<r, Integer, i0> pVar = this.f47385c;
            rVar.M(207, Boolean.valueOf(zA));
            boolean zA2 = rVar.a(zA);
            if (zA) {
                pVar.B(rVar, 0);
            } else {
                rVar.g(zA2);
            }
            rVar.B();
            if (p076m2.t.k()) {
                p076m2.t.n();
            }
        }
    }

    public o0(androidx.compose.ui.node.g gVar, t2 t2Var) {
        this.root = gVar;
        this.slotReusePolicy = t2Var;
    }

    private final void A(b bVar, z0 z0Var) {
        z0Var.D(new g(bVar));
    }

    /* JADX WARN: Code duplicated, block: B:16:0x004e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[LOOP:0: B:5:0x0013->B:17:0x0050, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:21:0x0053 A[EDGE_INSN: B:21:0x0053->B:18:0x0053 BREAK  A[LOOP:0: B:5:0x0013->B:17:0x0050], SYNTHETIC] */
    private final void B() {
        y4 composition;
        androidx.compose.ui.node.g gVar = this.root;
        gVar.ignoreRemeasureRequests = true;
        t0<androidx.compose.ui.node.g, b> t0Var = this.nodeToNodeState;
        Object[] objArr = t0Var.values;
        long[] jArr = t0Var.metadata;
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
                        if ((255 & j15) < 128 && (composition = ((b) objArr[(i15 << 3) + i17]).getComposition()) != null) {
                            composition.j();
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
        this.root.C1();
        i0 i0Var = i0.f148189a;
        gVar.ignoreRemeasureRequests = false;
        this.nodeToNodeState.k();
        this.slotIdToNode.k();
        this.precomposedCount = 0;
        this.reusableCount = 0;
        this.precomposeMap.k();
        I();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D(Object slotId) {
        I();
        androidx.compose.ui.node.g gVarU = this.precomposeMap.u(slotId);
        if (gVarU != null) {
            if (!(this.precomposedCount > 0)) {
                d4.a.c("No pre-composed items to dispose");
            }
            int iIndexOf = this.root.W().indexOf(gVarU);
            if (!(iIndexOf >= this.root.W().size() - this.precomposedCount)) {
                d4.a.c("Item is not in pre-composed item range");
            }
            this.reusableCount++;
            this.precomposedCount--;
            b bVarE = this.nodeToNodeState.e(gVarU);
            if (bVarE != null) {
                w(bVarE);
            }
            int size = (this.root.W().size() - this.precomposedCount) - this.reusableCount;
            K(iIndexOf, size, 1);
            C(size);
        }
        if (this.slotIdsOfCompositionsNeededInApproach.k(slotId)) {
            androidx.compose.ui.node.g.O1(this.root, true, false, false, 6, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void E() {
        t0<Object, r2.b> t0Var = this.approachPrecomposeSlotHandleMap;
        long[] jArr = t0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        int i18 = (i15 << 3) + i17;
                        Object obj = t0Var.keys[i18];
                        r2.b bVar = (r2.b) t0Var.values[i18];
                        int iP = this.slotIdsOfCompositionsNeededInApproach.p(obj);
                        if (iP < 0 || iP >= this.currentApproachIndex) {
                            if (iP >= 0) {
                                this.slotIdsOfCompositionsNeededInApproach.z(iP, p2.f47392b);
                            }
                            if (this.precomposeMap.b(obj)) {
                                bVar.j();
                            }
                            t0Var.v(i18);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    private final z0 G() {
        return g0.b(this.root).getOutOfFrameExecutor();
    }

    private final Object H(List<androidx.compose.ui.node.g> foldedChildren, int index) {
        return this.nodeToNodeState.e(foldedChildren.get(index)).getSlotId();
    }

    private final void J(boolean deactivate) {
        this.precomposedCount = 0;
        this.precomposeMap.k();
        List<androidx.compose.ui.node.g> listW = this.root.W();
        int size = listW.size();
        if (this.reusableCount != size) {
            this.reusableCount = size;
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            for (int i15 = 0; i15 < size; i15++) {
                try {
                    androidx.compose.ui.node.g gVar = listW.get(i15);
                    b bVarE = this.nodeToNodeState.e(gVar);
                    if (bVarE != null && bVarE.a()) {
                        P(gVar);
                        Q(bVarE, deactivate);
                        bVarE.r(p2.f47391a);
                    }
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            i0 i0Var = i0.f148189a;
            companion.l(lVarD, lVarE, lVarG);
            this.slotIdToNode.k();
        }
        I();
    }

    private final void K(int from, int to4, int count) {
        androidx.compose.ui.node.g gVar = this.root;
        gVar.ignoreRemeasureRequests = true;
        this.root.t1(from, to4, count);
        i0 i0Var = i0.f148189a;
        gVar.ignoreRemeasureRequests = false;
    }

    static /* synthetic */ void L(o0 o0Var, int i15, int i16, int i17, int i18, Object obj) {
        if ((i18 & 4) != 0) {
            i17 = 1;
        }
        o0Var.K(i15, i16, i17);
    }

    private final void N(Object slotId, p<? super r, ? super Integer, i0> content, boolean pausable) {
        if (this.root.c()) {
            I();
            if (this.slotIdToNode.c(slotId)) {
                return;
            }
            this.approachPrecomposeSlotHandleMap.u(slotId);
            t0<Object, androidx.compose.ui.node.g> t0Var = this.precomposeMap;
            androidx.compose.ui.node.g gVarE = t0Var.e(slotId);
            if (gVarE == null) {
                gVarE = W(slotId);
                if (gVarE != null) {
                    K(this.root.W().indexOf(gVarE), this.root.W().size(), 1);
                    this.precomposedCount++;
                } else {
                    gVarE = y(this.root.W().size());
                    this.precomposedCount++;
                }
                t0Var.x(slotId, gVarE);
            }
            V(gVarE, slotId, pausable, content);
        }
    }

    private final void P(androidx.compose.ui.node.g gVar) {
        androidx.compose.ui.node.n nVarO0 = gVar.o0();
        androidx.compose.ui.node.g.EnumC0220g enumC0220g = androidx.compose.ui.node.g.EnumC0220g.NotUsed;
        nVarO0.O2(enumC0220g);
        androidx.compose.ui.node.l lVarL0 = gVar.l0();
        if (lVarL0 != null) {
            lVarL0.P2(enumC0220g);
        }
    }

    private final void Q(b bVar, boolean z15) {
        y4 composition;
        if (z15 || !bVar.getComposedWithReusableContentHost()) {
            bVar.k(c6.e(Boolean.FALSE, null, 2, null));
        } else {
            bVar.j(false);
        }
        if (bVar.getPausedComposition() != null) {
            w(bVar);
            return;
        }
        if (z15) {
            y4 composition2 = bVar.getComposition();
            if (composition2 != null) {
                composition2.deactivate();
                return;
            }
            return;
        }
        z0 z0VarG = G();
        if (z0VarG != null) {
            A(bVar, z0VarG);
        } else {
            if (bVar.getComposedWithReusableContentHost() || (composition = bVar.getComposition()) == null) {
                return;
            }
            composition.deactivate();
        }
    }

    private final void U(androidx.compose.ui.node.g node, b nodeState, boolean pausable) {
        if (!(nodeState.getPausedComposition() == null)) {
            d4.a.a("new subcompose call while paused composition is still active");
        }
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
        c3.l lVarE = companion.e(lVarD);
        try {
            androidx.compose.ui.node.g gVar = this.root;
            gVar.ignoreRemeasureRequests = true;
            y4 composition = nodeState.getComposition();
            v vVar = this.compositionContext;
            if (vVar == null) {
                d4.a.d("parent composition reference not set");
                throw new oq.g();
            }
            if (composition == null || composition.c()) {
                composition = pausable ? s2.a(node, vVar) : s2.b(node, vVar);
            }
            nodeState.m(composition);
            p<? super r, ? super Integer, i0> pVarD = nodeState.d();
            if (G() != null) {
                nodeState.l(false);
            } else {
                nodeState.l(true);
                pVarD = y2.m.b(1524156494, true, new j(nodeState, pVarD));
            }
            if (pausable) {
                if (nodeState.getForceReuse()) {
                    nodeState.q(((p3) composition).n(pVarD));
                } else {
                    nodeState.q(((p3) composition).u(pVarD));
                }
            } else if (nodeState.getForceReuse()) {
                composition.v(pVarD);
            } else {
                composition.h(pVarD);
            }
            nodeState.p(false);
            i0 i0Var = i0.f148189a;
            gVar.ignoreRemeasureRequests = false;
            companion.l(lVarD, lVarE, lVarG);
        } catch (Throwable th4) {
            companion.l(lVarD, lVarE, lVarG);
            throw th4;
        }
    }

    private final void V(androidx.compose.ui.node.g node, Object slotId, boolean pausable, p<? super r, ? super Integer, i0> content) {
        t0<androidx.compose.ui.node.g, b> t0Var = this.nodeToNodeState;
        b bVarE = t0Var.e(node);
        if (bVarE == null) {
            b bVar = new b(slotId, k.f47288a.a(), null, 4, null);
            t0Var.x(node, bVar);
            bVarE = bVar;
        }
        b bVar2 = bVarE;
        boolean z15 = bVar2.d() != content;
        if (bVar2.getPausedComposition() != null) {
            if (z15) {
                w(bVar2);
            } else if (pausable) {
                return;
            } else {
                t(bVar2, true);
            }
        }
        y4 composition = bVar2.getComposition();
        boolean zW = composition != null ? composition.w() : true;
        if (z15 || zW || bVar2.getForceRecompose()) {
            bVar2.n(content);
            U(node, bVar2, pausable);
            bVar2.o(false);
        }
    }

    private final androidx.compose.ui.node.g W(Object slotId) {
        int i15;
        if (this.reusableCount == 0) {
            return null;
        }
        List<androidx.compose.ui.node.g> listW = this.root.W();
        int size = listW.size() - this.precomposedCount;
        int i16 = size - this.reusableCount;
        int i17 = size - 1;
        int i18 = i17;
        while (true) {
            if (i18 < i16) {
                i15 = -1;
                break;
            }
            if (fr.t.c(H(listW, i18), slotId)) {
                i15 = i18;
                break;
            }
            i18--;
        }
        if (i15 == -1) {
            while (true) {
                if (i17 < i16) {
                    i18 = i17;
                    break;
                }
                b bVarE = this.nodeToNodeState.e(listW.get(i17));
                if (bVarE.getSlotId() == p2.f47391a || this.slotReusePolicy.b(slotId, bVarE.getSlotId())) {
                    bVarE.r(slotId);
                    i18 = i17;
                    i15 = i18;
                    break;
                }
                i17--;
            }
        }
        if (i15 == -1) {
            return null;
        }
        if (i18 != i16) {
            K(i18, i16, 1);
        }
        this.reusableCount--;
        androidx.compose.ui.node.g gVar = listW.get(i16);
        b bVarE2 = this.nodeToNodeState.e(gVar);
        bVarE2.k(c6.e(Boolean.TRUE, null, 2, null));
        bVarE2.p(true);
        bVarE2.o(true);
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t(b bVar, boolean z15) {
        s3 pausedComposition = bVar.getPausedComposition();
        if (pausedComposition != null) {
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                androidx.compose.ui.node.g gVar = this.root;
                gVar.ignoreRemeasureRequests = true;
                if (z15) {
                    while (!pausedComposition.a()) {
                        try {
                            pausedComposition.b(new e5() { // from class: e4.n0
                                @Override // p076m2.e5
                                public final boolean a() {
                                    return o0.u();
                                }
                            });
                        } catch (Throwable th4) {
                            r0.i0 operations = bVar.getOperations();
                            if (operations == null) {
                                throw th4;
                            }
                            throw new q2(operations, bVar.getSlotId(), th4);
                        }
                    }
                }
                pausedComposition.apply();
                bVar.q(null);
                i0 i0Var = i0.f148189a;
                gVar.ignoreRemeasureRequests = false;
                companion.l(lVarD, lVarE, lVarG);
            } catch (Throwable th5) {
                companion.l(lVarD, lVarE, lVarG);
                throw th5;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean u() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<v0> v(Object slotId, p<? super r, ? super Integer, i0> content) {
        if (!(this.slotIdsOfCompositionsNeededInApproach.getSize() >= this.currentApproachIndex)) {
            d4.a.a("Error: currentApproachIndex cannot be greater than the size of theapproachComposedSlotIds list.");
        }
        androidx.compose.ui.node.g gVarE = this.slotIdToNode.e(slotId);
        int size = this.slotIdsOfCompositionsNeededInApproach.getSize();
        int i15 = this.currentApproachIndex;
        if (size == i15) {
            this.slotIdsOfCompositionsNeededInApproach.d(slotId);
        } else {
            this.slotIdsOfCompositionsNeededInApproach.z(i15, slotId);
        }
        this.currentApproachIndex++;
        boolean zB = this.precomposeMap.b(slotId);
        if (zB || gVarE != null) {
            if (!zB && gVarE != null) {
                K(this.root.W().indexOf(gVarE), this.root.W().size(), 1);
                this.precomposedCount++;
                this.slotIdToNode.u(slotId);
                this.precomposeMap.x(slotId, gVarE);
                this.approachPrecomposeSlotHandleMap.x(slotId, z(slotId));
                if (this.root.c()) {
                    I();
                }
            }
            androidx.compose.ui.node.g gVarE2 = this.precomposeMap.e(slotId);
            b bVarE = gVarE2 != null ? this.nodeToNodeState.e(gVarE2) : null;
            if (bVarE != null && bVarE.getForceRecompose()) {
                V(gVarE2, slotId, false, content);
            }
            if ((bVarE != null ? bVarE.getPausedComposition() : null) != null) {
                t(bVarE, true);
            }
        } else {
            this.approachPrecomposeSlotHandleMap.x(slotId, M(slotId, content));
        }
        androidx.compose.ui.node.g gVarE3 = this.precomposeMap.e(slotId);
        if (gVarE3 != null) {
            List<androidx.compose.ui.node.n> listG1 = gVarE3.o0().G1();
            int size2 = listG1.size();
            for (int i16 = 0; i16 < size2; i16++) {
                listG1.get(i16).p2();
            }
            if (listG1 != null) {
                return listG1;
            }
        }
        return pq.v.n();
    }

    private final void w(b bVar) {
        s3 pausedComposition = bVar.getPausedComposition();
        if (pausedComposition != null) {
            pausedComposition.cancel();
            bVar.q(null);
            y4 composition = bVar.getComposition();
            if (composition != null) {
                composition.j();
            }
            bVar.m(null);
        }
    }

    private final androidx.compose.ui.node.g y(int index) {
        androidx.compose.ui.node.g gVar = new androidx.compose.ui.node.g(true, 0, 2, null);
        androidx.compose.ui.node.g gVar2 = this.root;
        gVar2.ignoreRemeasureRequests = true;
        this.root.Q0(index, gVar);
        i0 i0Var = i0.f148189a;
        gVar2.ignoreRemeasureRequests = false;
        return gVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r2.b z(Object slotId) {
        return !this.root.c() ? new e() : new f(slotId);
    }

    public final void C(int startIndex) {
        boolean z15 = false;
        this.reusableCount = 0;
        List<androidx.compose.ui.node.g> listW = this.root.W();
        int size = (listW.size() - this.precomposedCount) - 1;
        if (startIndex <= size) {
            this.reusableSlotIdsSet.clear();
            if (startIndex <= size) {
                int i15 = startIndex;
                while (true) {
                    this.reusableSlotIdsSet.add(H(listW, i15));
                    if (i15 == size) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
            this.slotReusePolicy.a(this.reusableSlotIdsSet);
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            boolean z16 = false;
            while (size >= startIndex) {
                try {
                    androidx.compose.ui.node.g gVar = listW.get(size);
                    b bVarE = this.nodeToNodeState.e(gVar);
                    Object slotId = bVarE.getSlotId();
                    if (this.reusableSlotIdsSet.contains(slotId)) {
                        this.reusableCount++;
                        if (bVarE.a()) {
                            P(gVar);
                            Q(bVarE, false);
                            if (bVarE.getComposedWithReusableContentHost()) {
                                z16 = true;
                            }
                        }
                    } else {
                        androidx.compose.ui.node.g gVar2 = this.root;
                        gVar2.ignoreRemeasureRequests = true;
                        this.nodeToNodeState.u(gVar);
                        y4 composition = bVarE.getComposition();
                        if (composition != null) {
                            composition.j();
                        }
                        this.root.D1(size, 1);
                        i0 i0Var = i0.f148189a;
                        gVar2.ignoreRemeasureRequests = false;
                    }
                    this.slotIdToNode.u(slotId);
                    size--;
                } catch (Throwable th4) {
                    companion.l(lVarD, lVarE, lVarG);
                    throw th4;
                }
            }
            i0 i0Var2 = i0.f148189a;
            companion.l(lVarD, lVarE, lVarG);
            z15 = z16;
        }
        if (z15) {
            c3.l.INSTANCE.m();
        }
        I();
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0051 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0053 A[LOOP:0: B:7:0x001b->B:17:0x0053, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0056 A[EDGE_INSN: B:28:0x0056->B:18:0x0056 BREAK  A[LOOP:0: B:7:0x001b->B:17:0x0053], SYNTHETIC] */
    public final void F() {
        if (this.reusableCount != this.root.W().size()) {
            t0<androidx.compose.ui.node.g, b> t0Var = this.nodeToNodeState;
            Object[] objArr = t0Var.values;
            long[] jArr = t0Var.metadata;
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
                                ((b) objArr[(i15 << 3) + i17]).o(true);
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
            if (this.root.getLookaheadRoot() != null) {
                if (this.root.k0()) {
                    return;
                }
                androidx.compose.ui.node.g.J1(this.root, false, false, false, 7, null);
            } else {
                if (this.root.p0()) {
                    return;
                }
                androidx.compose.ui.node.g.O1(this.root, false, false, false, 7, null);
            }
        }
    }

    public final void I() {
        int size = this.root.W().size();
        if (!(this.nodeToNodeState.get_size() == size)) {
            d4.a.a("Inconsistency between the count of nodes tracked by the state (" + this.nodeToNodeState.get_size() + ") and the children count on the SubcomposeLayout (" + size + "). Are you trying to use the state of the disposed SubcomposeLayout?");
        }
        if (!((size - this.reusableCount) - this.precomposedCount >= 0)) {
            d4.a.a("Incorrect state. Total children " + size + ". Reusable children " + this.reusableCount + ". Precomposed children " + this.precomposedCount);
        }
        if (this.precomposeMap.get_size() == this.precomposedCount) {
            return;
        }
        d4.a.a("Incorrect state. Precomposed children " + this.precomposedCount + ". Map size " + this.precomposeMap.get_size());
    }

    public final r2.b M(Object slotId, p<? super r, ? super Integer, i0> content) {
        N(slotId, content, false);
        return z(slotId);
    }

    public final r2.a O(Object slotId, p<? super r, ? super Integer, i0> content) {
        if (!this.root.c()) {
            return new h(slotId);
        }
        N(slotId, content, true);
        return new i(slotId);
    }

    public final void R(v vVar) {
        this.compositionContext = vVar;
    }

    public final void S(t2 t2Var) {
        if (this.slotReusePolicy != t2Var) {
            this.slotReusePolicy = t2Var;
            J(false);
            androidx.compose.ui.node.g.O1(this.root, false, false, false, 7, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00ac  */
    public final List<v0> T(Object slotId, p<? super r, ? super Integer, i0> content) {
        o0 o0Var;
        I();
        androidx.compose.ui.node.g.e eVarI0 = this.root.i0();
        androidx.compose.ui.node.g.e eVar = androidx.compose.ui.node.g.e.Measuring;
        if (!(eVarI0 == eVar || eVarI0 == androidx.compose.ui.node.g.e.LayingOut || eVarI0 == androidx.compose.ui.node.g.e.LookaheadMeasuring || eVarI0 == androidx.compose.ui.node.g.e.LookaheadLayingOut)) {
            d4.a.c("subcompose can only be used inside the measure or layout blocks");
        }
        t0<Object, androidx.compose.ui.node.g> t0Var = this.slotIdToNode;
        androidx.compose.ui.node.g gVarE = t0Var.e(slotId);
        if (gVarE == null) {
            gVarE = this.precomposeMap.u(slotId);
            if (gVarE != null) {
                this.nodeToNodeState.e(gVarE);
                if (!(this.precomposedCount > 0)) {
                    d4.a.c("Check failed.");
                }
                this.precomposedCount--;
            } else {
                gVarE = W(slotId);
                if (gVarE == null) {
                    gVarE = y(this.currentIndex);
                }
            }
            t0Var.x(slotId, gVarE);
        }
        androidx.compose.ui.node.g gVar = gVarE;
        if (pq.v.o0(this.root.W(), this.currentIndex) == gVar) {
            o0Var = this;
        } else {
            int iIndexOf = this.root.W().indexOf(gVar);
            if (!(iIndexOf >= this.currentIndex)) {
                d4.a.a("Key \"" + slotId + "\" was already used. If you are using LazyColumn/Row please make sure you provide a unique key for each item.");
            }
            int i15 = this.currentIndex;
            if (i15 != iIndexOf) {
                o0Var = this;
                L(o0Var, iIndexOf, i15, 0, 4, null);
            } else {
                o0Var = this;
            }
        }
        o0Var.currentIndex++;
        V(gVar, slotId, false, content);
        return (eVarI0 == eVar || eVarI0 == androidx.compose.ui.node.g.e.LayingOut) ? gVar.Q() : gVar.P();
    }

    @Override // p076m2.n
    public void a() {
        B();
    }

    @Override // p076m2.n
    public void i() {
        J(true);
    }

    @Override // p076m2.n
    public void o() {
        J(false);
    }

    public final w0 x(p<? super s2, ? super c5.b, ? extends x0> block) {
        return new d(block, this.NoIntrinsicsMessage);
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0002\u0018\u00002\u00020\u0001B+\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR$\u0010\u0002\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR(\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010!\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\"\u0010$\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001d\u0010\u001c\u001a\u0004\b\"\u0010\u001e\"\u0004\b#\u0010 R$\u0010+\u001a\u0004\u0018\u00010%8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010&\u001a\u0004\b'\u0010(\"\u0004\b)\u0010*R(\u00103\u001a\b\u0012\u0004\u0012\u00020\u001b0,8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\"\u00105\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b'\u0010\u001c\u001a\u0004\b\u0010\u0010\u001e\"\u0004\b4\u0010 R\u0019\u00109\u001a\u0004\u0018\u0001068\u0006¢\u0006\f\n\u0004\b\f\u00107\u001a\u0004\b-\u00108R$\u0010<\u001a\u00020\u001b2\u0006\u0010:\u001a\u00020\u001b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\n\u0010\u001e\"\u0004\b;\u0010 ¨\u0006="}, d2 = {"Le4/o0$b;", "", "slotId", "Lkotlin/Function0;", "Loq/i0;", "content", "Lm2/y4;", "composition", "<init>", "(Ljava/lang/Object;Ler/p;Lm2/y4;)V", "a", "Ljava/lang/Object;", "i", "()Ljava/lang/Object;", "r", "(Ljava/lang/Object;)V", "b", "Ler/p;", "d", "()Ler/p;", "n", "(Ler/p;)V", "c", "Lm2/y4;", "()Lm2/y4;", "m", "(Lm2/y4;)V", "", "Z", "e", "()Z", "o", "(Z)V", "forceRecompose", "f", "p", "forceReuse", "Lm2/s3;", "Lm2/s3;", "h", "()Lm2/s3;", "q", "(Lm2/s3;)V", "pausedComposition", "Lm2/a3;", "g", "Lm2/a3;", "getActiveState", "()Lm2/a3;", "k", "(Lm2/a3;)V", "activeState", "l", "composedWithReusableContentHost", "Lr0/i0;", "Lr0/i0;", "()Lr0/i0;", "operations", "value", "j", "active", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object slotId;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private p<? super r, ? super Integer, i0> content;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private y4 composition;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private boolean forceRecompose;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private boolean forceReuse;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private s3 pausedComposition;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private a3<Boolean> activeState;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private boolean composedWithReusableContentHost;

        /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
        private final r0.i0 operations;

        public b(Object obj, p<? super r, ? super Integer, i0> pVar, y4 y4Var) {
            this.slotId = obj;
            this.content = pVar;
            this.composition = y4Var;
            this.activeState = c6.e(Boolean.TRUE, null, 2, null);
            this.operations = null;
        }

        public final boolean a() {
            return this.activeState.getValue().booleanValue();
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final boolean getComposedWithReusableContentHost() {
            return this.composedWithReusableContentHost;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final y4 getComposition() {
            return this.composition;
        }

        public final p<r, Integer, i0> d() {
            return this.content;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final boolean getForceRecompose() {
            return this.forceRecompose;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final boolean getForceReuse() {
            return this.forceReuse;
        }

        /* JADX INFO: renamed from: g, reason: from getter */
        public final r0.i0 getOperations() {
            return this.operations;
        }

        /* JADX INFO: renamed from: h, reason: from getter */
        public final s3 getPausedComposition() {
            return this.pausedComposition;
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Object getSlotId() {
            return this.slotId;
        }

        public final void j(boolean z15) {
            this.activeState.setValue(Boolean.valueOf(z15));
        }

        public final void k(a3<Boolean> a3Var) {
            this.activeState = a3Var;
        }

        public final void l(boolean z15) {
            this.composedWithReusableContentHost = z15;
        }

        public final void m(y4 y4Var) {
            this.composition = y4Var;
        }

        public final void n(p<? super r, ? super Integer, i0> pVar) {
            this.content = pVar;
        }

        public final void o(boolean z15) {
            this.forceRecompose = z15;
        }

        public final void p(boolean z15) {
            this.forceReuse = z15;
        }

        public final void q(s3 s3Var) {
            this.pausedComposition = s3Var;
        }

        public final void r(Object obj) {
            this.slotId = obj;
        }

        public /* synthetic */ b(Object obj, p pVar, y4 y4Var, int i15, fr.k kVar) {
            this(obj, pVar, (i15 & 4) != 0 ? null : y4Var);
        }
    }
}
