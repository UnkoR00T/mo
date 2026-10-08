package androidx.compose.ui.node;

import androidx.compose.ui.semantics.SemanticsConfiguration;
import c5.s;
import c5.t;
import fr.w;
import g4.a1;
import g4.b1;
import g4.c1;
import g4.d1;
import g4.g0;
import g4.k0;
import g4.r0;
import g4.s0;
import g4.t0;
import g4.t1;
import g4.u;
import g4.y;
import java.util.Map;
import m3.MutableRect;
import n3.a2;
import n3.g2;
import n3.h1;
import n3.h2;
import n3.k2;
import n3.t2;
import n3.v2;
import n3.y2;
import n4.x;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.b0;
import p036e4.c0;
import p036e4.q0;
import p036e4.v0;
import p036e4.x0;
import p071kotlin.Metadata;
import r0.p0;
import r0.z0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¢\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\b!\u0018\u0000 Á\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0004Í\u0002¾\u0002B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001b\u0010\u0010\u001a\u00020\t2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J?\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ!\u0010!\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b!\u0010\"J\u0019\u0010$\u001a\u00020\u00182\b\b\u0002\u0010#\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J=\u0010/\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u00100JM\u00103\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u00020\u00142\u0006\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u00104JE\u00105\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b5\u00106JE\u00107\u001a\u00020\u0018*\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t2\u0006\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b7\u00106J%\u00108\u001a\u00020\t*\u0004\u0018\u00010\u000b2\u0006\u0010)\u001a\u00020(2\u0006\u0010-\u001a\u00020,H\u0002¢\u0006\u0004\b8\u00109J\u0013\u0010:\u001a\u00020\u0000*\u00020\u0003H\u0002¢\u0006\u0004\b:\u0010;J\u001f\u0010?\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00002\u0006\u0010>\u001a\u00020=H\u0002¢\u0006\u0004\bA\u0010@J'\u0010D\u001a\u00020(2\u0006\u0010<\u001a\u00020\u00002\u0006\u0010B\u001a\u00020(2\u0006\u0010C\u001a\u00020\tH\u0002¢\u0006\u0004\bD\u0010EJ'\u0010I\u001a\u00020\u00182\u0006\u0010<\u001a\u00020\u00002\u0006\u0010G\u001a\u00020F2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010JJ\u001f\u0010L\u001a\u00020\u00182\u0006\u0010K\u001a\u00020F2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010N\u001a\u00020(2\u0006\u0010)\u001a\u00020(H\u0002¢\u0006\u0004\bN\u0010OJ\u001b\u0010P\u001a\u0004\u0018\u00010\u000b2\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\u000e¢\u0006\u0004\bP\u0010QJ\r\u0010R\u001a\u00020\t¢\u0006\u0004\bR\u0010SJ\u000f\u0010T\u001a\u00020\u0018H\u0010¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u0018H&¢\u0006\u0004\bV\u0010UJ\u001f\u0010Z\u001a\u00020\u00182\u0006\u0010X\u001a\u00020W2\u0006\u0010Y\u001a\u00020WH\u0014¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u0018H\u0000¢\u0006\u0004\b\\\u0010UJ\r\u0010]\u001a\u00020\u0018¢\u0006\u0004\b]\u0010UJ\r\u0010^\u001a\u00020\u0018¢\u0006\u0004\b^\u0010UJ5\u0010_\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0016H\u0014¢\u0006\u0004\b_\u0010`J'\u0010b\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010a\u001a\u00020\u001aH\u0014¢\u0006\u0004\bb\u0010cJ\r\u0010d\u001a\u00020\u0018¢\u0006\u0004\bd\u0010UJ=\u0010e\u001a\u00020\u00182\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\u0010a\u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\be\u0010\u001dJ\u001f\u0010f\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001a¢\u0006\u0004\bf\u0010\"J!\u0010g\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u001aH\u0016¢\u0006\u0004\bg\u0010\"J\r\u0010h\u001a\u00020\u0018¢\u0006\u0004\bh\u0010UJ-\u0010j\u001a\u00020\u00182\u0014\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\b\b\u0002\u0010i\u001a\u00020\t¢\u0006\u0004\bj\u0010kJ5\u0010l\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\t¢\u0006\u0004\bl\u0010mJ7\u0010n\u001a\u00020\u00182\u0006\u0010'\u001a\u00020&2\u0006\u0010)\u001a\u00020(2\u0006\u0010+\u001a\u00020*2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020\tH\u0016¢\u0006\u0004\bn\u0010mJ\r\u0010p\u001a\u00020o¢\u0006\u0004\bp\u0010qJ\u0017\u0010s\u001a\u00020(2\u0006\u0010r\u001a\u00020(H\u0016¢\u0006\u0004\bs\u0010OJ\u0017\u0010u\u001a\u00020(2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0004\bu\u0010OJ\u0017\u0010w\u001a\u00020(2\u0006\u0010v\u001a\u00020(H\u0016¢\u0006\u0004\bw\u0010OJ\u0017\u0010x\u001a\u00020(2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0004\bx\u0010OJ\u001f\u0010{\u001a\u00020(2\u0006\u0010y\u001a\u00020\u00032\u0006\u0010z\u001a\u00020(H\u0016¢\u0006\u0004\b{\u0010|J'\u0010}\u001a\u00020(2\u0006\u0010y\u001a\u00020\u00032\u0006\u0010z\u001a\u00020(2\u0006\u0010C\u001a\u00020\tH\u0016¢\u0006\u0004\b}\u0010~J \u0010\u007f\u001a\u00020\u00182\u0006\u0010y\u001a\u00020\u00032\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\u00182\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\"\u0010\u0083\u0001\u001a\u00020o2\u0006\u0010y\u001a\u00020\u00032\u0006\u0010H\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0019\u0010\u0085\u0001\u001a\u00020(2\u0006\u0010t\u001a\u00020(H\u0016¢\u0006\u0005\b\u0085\u0001\u0010OJ$\u0010\u0086\u0001\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001J$\u0010\u0088\u0001\u001a\u00020(2\u0006\u0010\u0013\u001a\u00020(2\b\b\u0002\u0010C\u001a\u00020\tH\u0016¢\u0006\u0006\b\u0088\u0001\u0010\u0087\u0001J$\u0010\u008b\u0001\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010\u008a\u0001\u001a\u00030\u0089\u0001H\u0004¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u000f\u0010\u008d\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u008d\u0001\u0010UJ\u000f\u0010\u008e\u0001\u001a\u00020\u0018¢\u0006\u0005\b\u008e\u0001\u0010UJ-\u0010\u0090\u0001\u001a\u00020\u00182\u0006\u0010K\u001a\u00020F2\u0006\u0010H\u001a\u00020\t2\t\b\u0002\u0010\u008f\u0001\u001a\u00020\tH\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001a\u0010\u0092\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\u001a\u0010\u0094\u0001\u001a\u00020\t2\u0006\u0010)\u001a\u00020(H\u0004¢\u0006\u0006\b\u0094\u0001\u0010\u0093\u0001J\u0011\u0010\u0095\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0095\u0001\u0010UJ\u0011\u0010\u0096\u0001\u001a\u00020\u0018H\u0016¢\u0006\u0005\b\u0096\u0001\u0010UJ\u001b\u0010\u0098\u0001\u001a\u00020\u00002\u0007\u0010\u0097\u0001\u001a\u00020\u0000H\u0000¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u000f\u0010\u009a\u0001\u001a\u00020\t¢\u0006\u0005\b\u009a\u0001\u0010SJ\u001c\u0010\u009d\u0001\u001a\u00030\u009b\u00012\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0004¢\u0006\u0005\b\u009d\u0001\u0010OJ%\u0010\u009f\u0001\u001a\u00020(2\u0007\u0010\u009e\u0001\u001a\u00020F2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0004¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J$\u0010¡\u0001\u001a\u00020\u00142\u0006\u0010)\u001a\u00020(2\b\u0010\u009c\u0001\u001a\u00030\u009b\u0001H\u0004¢\u0006\u0006\b¡\u0001\u0010¢\u0001R\u001e\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\b£\u0001\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001R'\u0010«\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b§\u0001\u0010¨\u0001\u001a\u0005\b©\u0001\u0010S\"\u0005\bª\u0001\u0010%R'\u0010¯\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¬\u0001\u0010¨\u0001\u001a\u0005\b\u00ad\u0001\u0010S\"\u0005\b®\u0001\u0010%R+\u0010¶\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001\"\u0006\b´\u0001\u0010µ\u0001R+\u0010º\u0001\u001a\u0004\u0018\u00010\u00008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010±\u0001\u001a\u0006\b¸\u0001\u0010³\u0001\"\u0006\b¹\u0001\u0010µ\u0001R\u0019\u0010¼\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b»\u0001\u0010¨\u0001R\u0019\u0010¾\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b½\u0001\u0010¨\u0001RE\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00162\u0015\u0010¿\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00168\u0004@BX\u0084\u000e¢\u0006\u0010\n\u0006\bÀ\u0001\u0010Á\u0001\u001a\u0006\bÂ\u0001\u0010Ã\u0001R\u001a\u0010Ç\u0001\u001a\u00030Ä\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÅ\u0001\u0010Æ\u0001R\u001a\u0010Ë\u0001\u001a\u00030È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R\u0019\u0010Î\u0001\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u001c\u0010Ò\u0001\u001a\u0005\u0018\u00010Ï\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R#\u0010Ö\u0001\u001a\f\u0012\u0005\u0012\u00030Ô\u0001\u0018\u00010Ó\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÍ\u0001\u0010Õ\u0001R1\u0010\u0013\u001a\u00020\u00122\u0007\u0010¿\u0001\u001a\u00020\u00128\u0016@TX\u0096\u000e¢\u0006\u0018\n\u0006\b×\u0001\u0010Ø\u0001\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0006\bÛ\u0001\u0010Ü\u0001R1\u0010\u0015\u001a\u00020\u00142\u0007\u0010¿\u0001\u001a\u00020\u00148\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\bÝ\u0001\u0010Í\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001\"\u0006\bà\u0001\u0010á\u0001R\u001b\u0010ä\u0001\u001a\u0004\u0018\u00010F8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bâ\u0001\u0010ã\u0001R\u001b\u0010ç\u0001\u001a\u0005\u0018\u00010å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bw\u0010æ\u0001R*\u0010ï\u0001\u001a\u00030è\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bé\u0001\u0010ê\u0001\u001a\u0006\bë\u0001\u0010ì\u0001\"\u0006\bí\u0001\u0010î\u0001R'\u0010ó\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bð\u0001\u0010¨\u0001\u001a\u0005\bñ\u0001\u0010S\"\u0005\bò\u0001\u0010%R'\u0010÷\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bô\u0001\u0010¨\u0001\u001a\u0005\bõ\u0001\u0010S\"\u0005\bö\u0001\u0010%R\u001b\u0010ú\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bø\u0001\u0010ù\u0001R\u001b\u0010ý\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R0\u0010\u0081\u0002\u001a\u0019\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u0018\u0018\u00010þ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÿ\u0001\u0010\u0080\u0002R\u001e\u0010\u0084\u0002\u001a\t\u0012\u0004\u0012\u00020\u00180\u0082\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0083\u0002R)\u0010\u0086\u0002\u001a\u00020\t2\u0007\u0010¿\u0001\u001a\u00020\t8\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0006\b¨\u0001\u0010¨\u0001\u001a\u0005\b\u0085\u0002\u0010SR/\u0010a\u001a\u0005\u0018\u00010\u0087\u00022\n\u0010¿\u0001\u001a\u0005\u0018\u00010\u0087\u00028\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\b\u0088\u0002\u0010\u0089\u0002\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008c\u0002\u0010ù\u0001R\u0018\u0010\u0090\u0002\u001a\u00030\u008d\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R,\u0010\u0093\u0002\u001a\u0017\u0012\u0004\u0012\u00020\u001e\u0012\u0006\u0012\u0004\u0018\u00010\u001a\u0012\u0004\u0012\u00020\u00180þ\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0091\u0002\u0010\u0092\u0002R\u0017\u0010\u0096\u0002\u001a\u00020\u000b8&X¦\u0004¢\u0006\b\u001a\u0006\b\u0094\u0002\u0010\u0095\u0002R\u0018\u0010\u0099\u0002\u001a\u00030È\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R\u0017\u0010\u009b\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009a\u0002\u0010ß\u0001R\u0017\u0010\u009d\u0002\u001a\u00020\u00148VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0002\u0010ß\u0001R\u0019\u0010 \u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009e\u0002\u0010\u009f\u0002R\u0017\u0010£\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\b¡\u0002\u0010¢\u0002R\u0016\u0010¤\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÐ\u0001\u0010SR\u0015\u0010§\u0002\u001a\u00030¥\u00028F¢\u0006\b\u001a\u0006\b¦\u0002\u0010Ú\u0001R\u0018\u0010«\u0002\u001a\u00030¨\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010ª\u0002R\u0019\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¬\u0002\u0010\u009f\u0002R\u0016\u0010¯\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b®\u0002\u0010SR\u0016\u0010±\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0002\u0010SR,\u0010¶\u0002\u001a\u00030Ï\u00012\b\u0010¿\u0001\u001a\u00030Ï\u00018P@PX\u0090\u000e¢\u0006\u0010\u001a\u0006\b²\u0002\u0010³\u0002\"\u0006\b´\u0002\u0010µ\u0002R0\u0010¼\u0002\u001a\u0005\u0018\u00010·\u00022\n\u0010¿\u0001\u001a\u0005\u0018\u00010·\u00028&@dX¦\u000e¢\u0006\u0010\u001a\u0006\b¸\u0002\u0010¹\u0002\"\u0006\bº\u0002\u0010»\u0002R\u001a\u0010À\u0002\u001a\u0005\u0018\u00010½\u00028VX\u0096\u0004¢\u0006\b\u001a\u0006\b¾\u0002\u0010¿\u0002R\u0016\u0010Â\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\bÁ\u0002\u0010¢\u0002R\u0016\u0010Ã\u0002\u001a\u0004\u0018\u00010\u00038F¢\u0006\b\u001a\u0006\b×\u0001\u0010¢\u0002R\u0017\u0010Æ\u0002\u001a\u00020F8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÄ\u0002\u0010Å\u0002R\u0018\u0010É\u0002\u001a\u00030Ç\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÈ\u0002\u0010Ú\u0001R\u0016\u0010Ë\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÊ\u0002\u0010SR\u0015\u0010\u009c\u0001\u001a\u00030\u009b\u00018F¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Ú\u0001¨\u0006Î\u0002"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "Landroidx/compose/ui/node/j;", "Le4/v0;", "Le4/b0;", "Lg4/b1;", "Landroidx/compose/ui/node/g;", "layoutNode", "<init>", "(Landroidx/compose/ui/node/g;)V", "", "includeTail", "Lf3/m$c;", "u3", "(Z)Lf3/m$c;", "Lg4/s0;", "type", "s3", "(I)Z", "Lc5/n;", "position", "", "zIndex", "Lkotlin/Function1;", "Ln3/a2;", "Loq/i0;", "layerBlock", "Lq3/c;", "explicitLayer", "O3", "(JFLer/l;Lq3/c;)V", "Ln3/h1;", "canvas", "graphicsLayer", "V2", "(Ln3/h1;Lq3/c;)V", "invokeOnLayoutChange", "m4", "(Z)V", "Landroidx/compose/ui/node/NodeCoordinator$f;", "hitTestSource", "Lm3/e;", "pointerPosition", "Lg4/t;", "hitTestResult", "La4/p0;", "pointerType", "isInLayer", "v3", "(Lf3/m$c;Landroidx/compose/ui/node/NodeCoordinator$f;JLg4/t;IZ)V", "distanceFromEdge", "isHitInMinimumTouchTargetBetter", "M3", "(Lf3/m$c;Landroidx/compose/ui/node/NodeCoordinator$f;JLg4/t;IZFZ)V", "w3", "(Lf3/m$c;Landroidx/compose/ui/node/NodeCoordinator$f;JLg4/t;IZF)V", "d4", "A3", "(Lf3/m$c;JI)Z", "e4", "(Le4/b0;)Landroidx/compose/ui/node/NodeCoordinator;", "ancestor", "Ln3/g2;", "matrix", "j4", "(Landroidx/compose/ui/node/NodeCoordinator;[F)V", "i4", "offset", "includeMotionFrameOfReference", "P2", "(Landroidx/compose/ui/node/NodeCoordinator;JZ)J", "Lm3/c;", "rect", "clipBounds", "O2", "(Landroidx/compose/ui/node/NodeCoordinator;Lm3/c;Z)V", "bounds", "a3", "(Lm3/c;Z)V", "D3", "(J)J", "t3", "(I)Lf3/m$c;", "C3", "()Z", "h2", "()V", "W2", "", "width", "height", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37090q, "(II)V", "E3", "I3", "L3", "W0", "(JFLer/l;)V", "layer", "Z0", "(JFLq3/c;)V", "S3", "P3", "T2", "N3", "J3", "forceUpdateLayerParameters", "k4", "(Ler/l;Z)V", "x3", "(Landroidx/compose/ui/node/NodeCoordinator$f;JLg4/t;IZ)V", "y3", "Lm3/g;", "h4", "()Lm3/g;", "relativeToScreen", "h", "relativeToLocal", "k", "relativeToWindow", "K", "W", "sourceCoordinates", "relativeToSource", "r", "(Le4/b0;J)J", "Q", "(Le4/b0;JZ)J", "w0", "(Le4/b0;[F)V", "d0", "([F)V", "Y", "(Le4/b0;Z)Lm3/g;", "A0", "f4", "(JZ)J", "Y2", "Ln3/k2;", "paint", "U2", "(Ln3/h1;Ln3/k2;)V", "G3", "K3", "clipToMinimumTouchTargetSize", "Q3", "(Lm3/c;ZZ)V", "o4", "(J)Z", "B3", "z3", "F3", "other", "X2", "(Landroidx/compose/ui/node/NodeCoordinator;)Landroidx/compose/ui/node/NodeCoordinator;", "c4", "Lm3/k;", "minimumTouchTargetSize", "R2", "childRect", "Q2", "(Lm3/c;J)J", "S2", "(JJ)F", "s", "Landroidx/compose/ui/node/g;", "A2", "()Landroidx/compose/ui/node/g;", "t", "Z", "getForcePlaceWithLookaheadOffset$ui", "U3", "forcePlaceWithLookaheadOffset", "v", "d3", "T3", "forceMeasureWithLookaheadConstraints", "w", "Landroidx/compose/ui/node/NodeCoordinator;", "p3", "()Landroidx/compose/ui/node/NodeCoordinator;", "a4", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "wrapped", "x", "q3", "b4", "wrappedBy", "y", "released", "z", "isClipping", "value", "A", "Ler/l;", "getLayerBlock", "()Ler/l;", "Lc5/d;", "B", "Lc5/d;", "layerDensity", "Lc5/t;", "C", "Lc5/t;", "layerLayoutDirection", ip.a.f96138c, "F", "lastLayerAlpha", "Le4/x0;", "E", "Le4/x0;", "_measureResult", "Lr0/p0;", "Le4/a;", "Lr0/p0;", "oldAlignmentLines", "G", "J", "O1", "()J", "Y3", "(J)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "r3", "()F", "setZIndex", "(F)V", "I", "Lm3/c;", "_rectCache", "Landroidx/compose/ui/node/e;", "Landroidx/compose/ui/node/e;", "layerPositionalProperties", "Ln3/y2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Ln3/y2;", "h3", "()Ln3/y2;", "W3", "(Ln3/y2;)V", "lastShape", "O", "e3", "V3", "lastClip", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "o3", "Z3", "wasLayerBlockInvoked", "R", "Lq3/c;", "drawBlockParentLayer", "T", "Ln3/h1;", "drawBlockCanvas", "Lkotlin/Function2;", "X", "Ler/p;", "_drawBlock", "Lkotlin/Function0;", "Ler/a;", "invalidateParentLayer", "f3", "lastLayerDrawingWasSkipped", "Lg4/a1;", "h0", "Lg4/a1;", "i3", "()Lg4/a1;", "q0", "Lg4/c1;", "m3", "()Lg4/c1;", "snapshotObserver", "c3", "()Ler/p;", "drawBlock", "n3", "()Lf3/m$c;", "tail", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "getDensity", "density", "i2", "fontScale", "M1", "()Landroidx/compose/ui/node/j;", "parent", "m", "()Le4/b0;", "coordinates", "introducesMotionFrameOfReference", "Lc5/r;", "b", "size", "Lg4/b;", "b3", "()Lg4/b;", "alignmentLinesOwner", "E1", "child", "G1", "hasMeasureResult", "c", "isAttached", "J1", "()Le4/x0;", "X3", "(Le4/x0;)V", "measureResult", "Landroidx/compose/ui/node/k;", "j3", "()Landroidx/compose/ui/node/k;", "setLookaheadDelegate", "(Landroidx/compose/ui/node/k;)V", "lookaheadDelegate", "", "e", "()Ljava/lang/Object;", "parentData", "r0", "parentLayoutCoordinates", "parentCoordinates", "l3", "()Lm3/c;", "rectCache", "Lc5/b;", "g3", "lastMeasurementConstraints", "K1", "isValidOwnerScope", "k3", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class NodeCoordinator extends androidx.compose.ui.node.j implements v0, b0, b1 {

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final er.l<NodeCoordinator, i0> f9993s0 = d.f10010b;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    private static final er.l<NodeCoordinator, i0> f9994t0 = c.f10009b;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final v2 f9995u0 = new v2();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final e f9996v0 = new e();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final float[] f9997w0 = g2.c(null, 1, null);

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final f f9998x0 = new a();

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    private static final f f9999y0 = new b();

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private er.l<? super a2, i0> layerBlock;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private x0 _measureResult;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private p0<p036e4.a> oldAlignmentLines;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private MutableRect _rectCache;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private e layerPositionalProperties;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private boolean lastClip;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean wasLayerBlockInvoked;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private q3.c drawBlockParentLayer;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private h1 drawBlockCanvas;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private er.p<? super h1, ? super q3.c, i0> _drawBlock;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private boolean lastLayerDrawingWasSkipped;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private a1 layer;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private q3.c explicitLayer;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final androidx.compose.ui.node.g layoutNode;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean forcePlaceWithLookaheadOffset;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean forceMeasureWithLookaheadConstraints;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator wrapped;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private NodeCoordinator wrappedBy;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean released;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private boolean isClipping;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private c5.d layerDensity = getLayoutNode().getDensity();

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private t layerLayoutDirection = getLayoutNode().getLayoutDirection();

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float lastLayerAlpha = 0.8f;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long position = c5.n.INSTANCE.b();

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private y2 lastShape = t2.a();

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final er.a<i0> invalidateParentLayer = new i();

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001f\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$a", "Landroidx/compose/ui/node/NodeCoordinator$f;", "Lg4/s0;", "Lg4/f1;", "a", "()I", "Lf3/m$c;", "node", "", "b", "(Lf3/m$c;)Z", "Landroidx/compose/ui/node/g;", "parentLayoutNode", "e", "(Landroidx/compose/ui/node/g;)Z", "layoutNode", "Lm3/e;", "pointerPosition", "Lg4/t;", "hitTestResult", "La4/p0;", "pointerType", "isInLayer", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;JLg4/t;IZ)V", "child", "d", "(Lg4/t;Landroidx/compose/ui/node/g;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a implements f {
        a() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public int a() {
            return s0.a(16);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r10v7 */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean b(f3.m.c r10) {
            /*
                r9 = this;
                r0 = 16
                int r1 = g4.s0.a(r0)
                r2 = 0
                r3 = r2
            L8:
                r4 = 0
                if (r10 == 0) goto L5a
                boolean r5 = r10 instanceof g4.f1
                r6 = 1
                if (r5 == 0) goto L19
                g4.f1 r10 = (g4.f1) r10
                boolean r10 = r10.z0()
                if (r10 == 0) goto L55
                return r6
            L19:
                int r5 = r10.getKindSet()
                r5 = r5 & r1
                if (r5 == 0) goto L55
                boolean r5 = r10 instanceof g4.j
                if (r5 == 0) goto L55
                r5 = r10
                g4.j r5 = (g4.j) r5
                f3.m$c r5 = r5.getDelegate()
                r7 = r4
            L2c:
                if (r5 == 0) goto L52
                int r8 = r5.getKindSet()
                r8 = r8 & r1
                if (r8 == 0) goto L4d
                int r7 = r7 + 1
                if (r7 != r6) goto L3b
                r10 = r5
                goto L4d
            L3b:
                if (r3 != 0) goto L44
                n2.c r3 = new n2.c
                f3.m$c[] r8 = new f3.m.c[r0]
                r3.<init>(r8, r4)
            L44:
                if (r10 == 0) goto L4a
                r3.d(r10)
                r10 = r2
            L4a:
                r3.d(r5)
            L4d:
                f3.m$c r5 = r5.getChild()
                goto L2c
            L52:
                if (r7 != r6) goto L55
                goto L8
            L55:
                f3.m$c r10 = g4.h.b(r3)
                goto L8
            L5a:
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.a.b(f3.m$c):boolean");
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public void c(androidx.compose.ui.node.g layoutNode, long pointerPosition, g4.t hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.M0(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean d(g4.t hitTestResult, androidx.compose.ui.node.g child) {
            if (!child.y0().c4()) {
                return false;
            }
            hitTestResult.e();
            return true;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean e(androidx.compose.ui.node.g parentLayoutNode) {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000G\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0015\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u001f\u0010\u001c\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u001b\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"androidx/compose/ui/node/NodeCoordinator$b", "Landroidx/compose/ui/node/NodeCoordinator$f;", "Lg4/s0;", "Lg4/i1;", "a", "()I", "Lf3/m$c;", "node", "", "b", "(Lf3/m$c;)Z", "Landroidx/compose/ui/node/g;", "parentLayoutNode", "e", "(Landroidx/compose/ui/node/g;)Z", "layoutNode", "Lm3/e;", "pointerPosition", "Lg4/t;", "hitTestResult", "La4/p0;", "pointerType", "isInLayer", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;JLg4/t;IZ)V", "f", "child", "d", "(Lg4/t;Landroidx/compose/ui/node/g;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f {
        b() {
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public int a() {
            return s0.a(8);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean b(f3.m.c node) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public void c(androidx.compose.ui.node.g layoutNode, long pointerPosition, g4.t hitTestResult, int pointerType, boolean isInLayer) {
            layoutNode.O0(pointerPosition, hitTestResult, pointerType, isInLayer);
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean d(g4.t hitTestResult, androidx.compose.ui.node.g child) {
            return false;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean e(androidx.compose.ui.node.g parentLayoutNode) {
            SemanticsConfiguration semanticsConfigurationF = parentLayoutNode.f();
            boolean z15 = false;
            if (semanticsConfigurationF != null && semanticsConfigurationF.getIsClearingSemantics()) {
                z15 = true;
            }
            return !z15;
        }

        @Override // androidx.compose.ui.node.NodeCoordinator.f
        public boolean f(f3.m.c node) {
            if (f3.h.isSkipNonImportantSemanticsNodesHitTestEnabled) {
                return n4.b0.h(x.a(g4.h.s(node), false));
            }
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Loq/i0;", "c", "(Landroidx/compose/ui/node/NodeCoordinator;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends w implements er.l<NodeCoordinator, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c f10009b = new c();

        c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(NodeCoordinator nodeCoordinator) {
            c(nodeCoordinator);
            return i0.f148189a;
        }

        public final void c(NodeCoordinator nodeCoordinator) {
            a1 layer = nodeCoordinator.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "Loq/i0;", "c", "(Landroidx/compose/ui/node/NodeCoordinator;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends w implements er.l<NodeCoordinator, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final d f10010b = new d();

        d() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(NodeCoordinator nodeCoordinator) throws Throwable {
            c(nodeCoordinator);
            return i0.f148189a;
        }

        public final void c(NodeCoordinator nodeCoordinator) throws Throwable {
            androidx.compose.ui.node.g layoutNode = nodeCoordinator.getLayoutNode();
            try {
                if (nodeCoordinator.K1()) {
                    NodeCoordinator.n4(nodeCoordinator, false, 1, null);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                layoutNode.S1(th4);
                throw new oq.g();
            }
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.NodeCoordinator$e, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\bR\u0014\u0010\f\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR \u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R \u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$e;", "", "<init>", "()V", "Landroidx/compose/ui/node/NodeCoordinator$f;", "PointerInputSource", "Landroidx/compose/ui/node/NodeCoordinator$f;", "a", "()Landroidx/compose/ui/node/NodeCoordinator$f;", "SemanticsSource", "b", "", "ExpectAttachedLayoutCoordinates", "Ljava/lang/String;", "UnmeasuredError", "Lkotlin/Function1;", "Landroidx/compose/ui/node/NodeCoordinator;", "Loq/i0;", "onCommitAffectingLayerParams", "Ler/l;", "onCommitAffectingLayer", "Ln3/v2;", "graphicsLayerScope", "Ln3/v2;", "Landroidx/compose/ui/node/e;", "tmpLayerPositionalProperties", "Landroidx/compose/ui/node/e;", "Ln3/g2;", "tmpMatrix", "[F", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final f a() {
            return NodeCoordinator.f9998x0;
        }

        public final f b() {
            return NodeCoordinator.f9999y0;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b`\u0018\u00002\u00020\u0001J\u0013\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H&¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\nH&¢\u0006\u0004\b\f\u0010\rJ7\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0007H&¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0019\u0010\tJ\u001f\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u001a\u001a\u00020\nH&¢\u0006\u0004\b\u001b\u0010\u001cø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001dÀ\u0006\u0001"}, d2 = {"Landroidx/compose/ui/node/NodeCoordinator$f;", "", "Lg4/s0;", "a", "()I", "Lf3/m$c;", "node", "", "b", "(Lf3/m$c;)Z", "Landroidx/compose/ui/node/g;", "parentLayoutNode", "e", "(Landroidx/compose/ui/node/g;)Z", "layoutNode", "Lm3/e;", "pointerPosition", "Lg4/t;", "hitTestResult", "La4/p0;", "pointerType", "isInLayer", "Loq/i0;", "c", "(Landroidx/compose/ui/node/g;JLg4/t;IZ)V", "f", "child", "d", "(Lg4/t;Landroidx/compose/ui/node/g;)Z", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface f {
        int a();

        boolean b(f3.m.c node);

        void c(androidx.compose.ui.node.g layoutNode, long pointerPosition, g4.t hitTestResult, int pointerType, boolean isInLayer);

        boolean d(g4.t hitTestResult, androidx.compose.ui.node.g child);

        boolean e(androidx.compose.ui.node.g parentLayoutNode);

        default boolean f(f3.m.c node) {
            return true;
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Ln3/h1;", "canvas", "Lq3/c;", "parentLayer", "Loq/i0;", "c", "(Ln3/h1;Lq3/c;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends w implements er.p<h1, q3.c, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ er.a<i0> f10012c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(er.a<i0> aVar) {
            super(2);
            this.f10012c = aVar;
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ i0 B(h1 h1Var, q3.c cVar) {
            c(h1Var, cVar);
            return i0.f148189a;
        }

        public final void c(h1 h1Var, q3.c cVar) {
            if (!NodeCoordinator.this.getLayoutNode().p()) {
                NodeCoordinator.this.lastLayerDrawingWasSkipped = true;
                return;
            }
            NodeCoordinator.this.drawBlockCanvas = h1Var;
            NodeCoordinator.this.drawBlockParentLayer = cVar;
            c1 c1VarM3 = NodeCoordinator.this.m3();
            c1VarM3.observer.k(NodeCoordinator.this, NodeCoordinator.f9994t0, this.f10012c);
            NodeCoordinator.this.lastLayerDrawingWasSkipped = false;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class h extends w implements er.a<i0> {
        h() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            NodeCoordinator nodeCoordinator = NodeCoordinator.this;
            nodeCoordinator.V2(nodeCoordinator.drawBlockCanvas, NodeCoordinator.this.drawBlockParentLayer);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class i extends w implements er.a<i0> {
        i() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            NodeCoordinator wrappedBy = NodeCoordinator.this.getWrappedBy();
            if (wrappedBy != null) {
                wrappedBy.z3();
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class j extends w implements er.a<i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m.c f10016c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f10017d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10018e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4.t f10019f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10020g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f10021h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f10022j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ boolean f10023k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(f3.m.c cVar, f fVar, long j15, g4.t tVar, int i15, boolean z15, float f15, boolean z16) {
            super(0);
            this.f10016c = cVar;
            this.f10017d = fVar;
            this.f10018e = j15;
            this.f10019f = tVar;
            this.f10020g = i15;
            this.f10021h = z15;
            this.f10022j = f15;
            this.f10023k = z16;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            NodeCoordinator.this.M3(r0.d(this.f10016c, this.f10017d.a(), s0.a(2)), this.f10017d, this.f10018e, this.f10019f, this.f10020g, this.f10021h, this.f10022j, this.f10023k);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class k extends w implements er.a<i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m.c f10025c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ f f10026d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f10027e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ g4.t f10028f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f10029g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ boolean f10030h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f10031j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(f3.m.c cVar, f fVar, long j15, g4.t tVar, int i15, boolean z15, float f15) {
            super(0);
            this.f10025c = cVar;
            this.f10026d = fVar;
            this.f10027e = j15;
            this.f10028f = tVar;
            this.f10029g = i15;
            this.f10030h = z15;
            this.f10031j = f15;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            NodeCoordinator.this.M3(r0.d(this.f10025c, this.f10026d.a(), s0.a(2)), this.f10026d, this.f10027e, this.f10028f, this.f10029g, this.f10030h, this.f10031j, false);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class l extends w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ er.l<a2, i0> f10032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ NodeCoordinator f10033c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        l(er.l<? super a2, i0> lVar, NodeCoordinator nodeCoordinator) {
            super(0);
            this.f10032b = lVar;
            this.f10033c = nodeCoordinator;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            this.f10032b.b(NodeCoordinator.f9995u0);
            boolean zC = fr.t.c(this.f10033c.getLastShape(), NodeCoordinator.f9995u0.getShape());
            boolean z15 = this.f10033c.getLastClip() != NodeCoordinator.f9995u0.getClip();
            if (!zC || z15) {
                this.f10033c.W3(NodeCoordinator.f9995u0.getShape());
                this.f10033c.V3(NodeCoordinator.f9995u0.getClip());
                if (this.f10033c.getWasLayerBlockInvoked() && (z15 || (this.f10033c.getLastClip() && !zC))) {
                    this.f10033c.getLayoutNode().Z0();
                }
            }
            this.f10033c.Z3(true);
            NodeCoordinator.f9995u0.U();
        }
    }

    public NodeCoordinator(androidx.compose.ui.node.g gVar) {
        this.layoutNode = gVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v14 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    private final boolean A3(f3.m.c r9, long r10, int r12) {
        /*
            Method dump skipped, instruction units count: 203
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.A3(f3.m$c, long, int):boolean");
    }

    private final long D3(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fMax = Math.max(0.0f, fIntBitsToFloat < 0.0f ? -fIntBitsToFloat : fIntBitsToFloat - P0());
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & BodyPartID.bodyIdMax));
        return m3.e.e((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 < 0.0f ? -fIntBitsToFloat2 : fIntBitsToFloat2 - L0()))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(fMax)) << 32));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void M3(f3.m.c cVar, f fVar, long j15, g4.t tVar, int i15, boolean z15, float f15, boolean z16) {
        if (cVar == null) {
            y3(fVar, j15, tVar, i15, z15);
            return;
        }
        if (!fVar.f(cVar)) {
            M3(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15, f15, z16);
            return;
        }
        if (A3(cVar, j15, i15)) {
            tVar.t(cVar, z15, new j(cVar, fVar, j15, tVar, i15, z15, f15, z16));
        } else if (z16) {
            w3(cVar, fVar, j15, tVar, i15, z15, f15);
        } else {
            d4(cVar, fVar, j15, tVar, i15, z15, f15);
        }
    }

    private final void O2(NodeCoordinator ancestor, MutableRect rect, boolean clipBounds) {
        if (ancestor == this) {
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.O2(ancestor, rect, clipBounds);
        }
        a3(rect, clipBounds);
    }

    private final void O3(long position, float zIndex, er.l<? super a2, i0> layerBlock, q3.c explicitLayer) {
        if (explicitLayer != null) {
            if (!(layerBlock == null)) {
                d4.a.a("both ways to create layers shouldn't be used together");
            }
            if (this.explicitLayer != explicitLayer) {
                this.explicitLayer = null;
                l4(this, null, false, 2, null);
                this.explicitLayer = explicitLayer;
            }
            if (this.layer == null) {
                a1 a1VarG = g0.b(getLayoutNode()).G(c3(), this.invalidateParentLayer, explicitLayer);
                a1VarG.e(getMeasuredSize());
                a1VarG.j(position);
                this.layer = a1VarG;
                getLayoutNode().X1(true);
                this.invalidateParentLayer.a();
            }
        } else {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
                l4(this, null, false, 2, null);
            }
            l4(this, layerBlock, false, 2, null);
        }
        if (!c5.n.h(getPosition(), position)) {
            g0.b(getLayoutNode()).I(f3.k.INSTANCE.a());
            Y3(position);
            a1 a1Var = this.layer;
            if (a1Var != null) {
                a1Var.j(position);
            } else {
                NodeCoordinator nodeCoordinator = this.wrappedBy;
                if (nodeCoordinator != null) {
                    nodeCoordinator.z3();
                }
            }
            getLayoutNode().v1(this);
            R1(this);
            Owner owner = getLayoutNode().getOwner();
            if (owner != null) {
                owner.q(getLayoutNode());
            }
        }
        this.zIndex = zIndex;
        if (this == getLayoutNode().y0()) {
            g0.b(getLayoutNode()).getRectManager().l(getLayoutNode());
        }
        if (getIsPlacingForAlignment()) {
            return;
        }
        y1(J1());
    }

    private final long P2(NodeCoordinator ancestor, long offset, boolean includeMotionFrameOfReference) {
        if (ancestor == this) {
            return offset;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        return (nodeCoordinator == null || fr.t.c(ancestor, nodeCoordinator)) ? Y2(offset, includeMotionFrameOfReference) : Y2(nodeCoordinator.P2(ancestor, offset, includeMotionFrameOfReference), includeMotionFrameOfReference);
    }

    public static /* synthetic */ void R3(NodeCoordinator nodeCoordinator, MutableRect mutableRect, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: rectInParent");
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        nodeCoordinator.Q3(mutableRect, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V2(h1 canvas, q3.c graphicsLayer) {
        f3.m.c cVarT3 = t3(s0.a(4));
        if (cVarT3 == null) {
            N3(canvas, graphicsLayer);
        } else {
            getLayoutNode().n0().h(canvas, s.e(b()), this, cVarT3, graphicsLayer);
        }
    }

    public static /* synthetic */ long Z2(NodeCoordinator nodeCoordinator, long j15, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: fromParentPosition-8S9VItk");
        }
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return nodeCoordinator.Y2(j15, z15);
    }

    private final void a3(MutableRect bounds, boolean clipBounds) {
        float fI = c5.n.i(getPosition());
        bounds.i(bounds.getLeft() - fI);
        bounds.j(bounds.getRight() - fI);
        float fJ = c5.n.j(getPosition());
        bounds.k(bounds.getTop() - fJ);
        bounds.h(bounds.getBottom() - fJ);
        a1 a1Var = this.layer;
        if (a1Var != null) {
            a1Var.c(bounds, true);
            if (this.isClipping && clipBounds) {
                bounds.e(0.0f, 0.0f, (int) (b() >> 32), (int) (b() & BodyPartID.bodyIdMax));
                bounds.f();
            }
        }
    }

    private final er.p<h1, q3.c, i0> c3() {
        er.p pVar = this._drawBlock;
        if (pVar != null) {
            return pVar;
        }
        g gVar = new g(new h());
        this._drawBlock = gVar;
        return gVar;
    }

    private final void d4(f3.m.c cVar, f fVar, long j15, g4.t tVar, int i15, boolean z15, float f15) {
        if (cVar == null) {
            y3(fVar, j15, tVar, i15, z15);
            return;
        }
        if (!fVar.f(cVar)) {
            d4(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15, f15);
        } else if (fVar.b(cVar)) {
            tVar.A(cVar, f15, z15, new k(cVar, fVar, j15, tVar, i15, z15, f15));
        } else {
            M3(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15, f15, false);
        }
    }

    private final NodeCoordinator e4(b0 b0Var) {
        NodeCoordinator nodeCoordinatorA;
        q0 q0Var = b0Var instanceof q0 ? (q0) b0Var : null;
        return (q0Var == null || (nodeCoordinatorA = q0Var.a()) == null) ? (NodeCoordinator) b0Var : nodeCoordinatorA;
    }

    public static /* synthetic */ long g4(NodeCoordinator nodeCoordinator, long j15, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toParentPosition-8S9VItk");
        }
        if ((i15 & 2) != 0) {
            z15 = true;
        }
        return nodeCoordinator.f4(j15, z15);
    }

    private final void i4(NodeCoordinator ancestor, float[] matrix) {
        if (fr.t.c(ancestor, this)) {
            return;
        }
        this.wrappedBy.i4(ancestor, matrix);
        if (!c5.n.h(getPosition(), c5.n.INSTANCE.b())) {
            float[] fArr = f9997w0;
            g2.i(fArr);
            g2.s(fArr, -c5.n.i(getPosition()), -c5.n.j(getPosition()), 0.0f, 4, null);
            g2.p(matrix, fArr);
        }
        a1 a1Var = this.layer;
        if (a1Var != null) {
            a1Var.i(matrix);
        }
    }

    private final void j4(NodeCoordinator ancestor, float[] matrix) {
        for (NodeCoordinator nodeCoordinator = this; !fr.t.c(nodeCoordinator, ancestor); nodeCoordinator = nodeCoordinator.wrappedBy) {
            a1 a1Var = nodeCoordinator.layer;
            if (a1Var != null) {
                a1Var.b(matrix);
            }
            long position = nodeCoordinator.getPosition();
            if (!c5.n.h(position, c5.n.INSTANCE.b())) {
                float[] fArr = f9997w0;
                g2.i(fArr);
                g2.s(fArr, c5.n.i(position), c5.n.j(position), 0.0f, 4, null);
                g2.p(matrix, fArr);
            }
        }
    }

    public static /* synthetic */ void l4(NodeCoordinator nodeCoordinator, er.l lVar, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerBlock");
        }
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        nodeCoordinator.k4(lVar, z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c1 m3() {
        return g0.b(getLayoutNode()).getSnapshotObserver();
    }

    private final void m4(boolean invokeOnLayoutChange) {
        Owner owner;
        if (this.explicitLayer != null) {
            return;
        }
        a1 a1Var = this.layer;
        if (a1Var == null) {
            if (this.layerBlock == null) {
                return;
            }
            d4.a.c("null layer with a non-null layerBlock");
            return;
        }
        er.l<? super a2, i0> lVar = this.layerBlock;
        if (lVar == null) {
            d4.a.d("updateLayerParameters requires a non-null layerBlock");
            throw new oq.g();
        }
        v2 v2Var = f9995u0;
        v2Var.O();
        v2Var.Q(getLayoutNode().getDensity());
        v2Var.R(getLayoutNode().getLayoutDirection());
        v2Var.T(s.e(b()));
        m3().observer.k(this, f9993s0, new l(lVar, this));
        e eVar = this.layerPositionalProperties;
        if (eVar == null) {
            eVar = new e();
            this.layerPositionalProperties = eVar;
        }
        e eVar2 = f9996v0;
        eVar2.a(eVar);
        eVar.b(v2Var);
        a1Var.f(v2Var);
        boolean z15 = this.isClipping;
        this.isClipping = v2Var.getClip();
        this.lastLayerAlpha = v2Var.getAlpha();
        boolean zC = eVar2.c(eVar);
        if (invokeOnLayoutChange && ((!zC || z15 != this.isClipping) && (owner = getLayoutNode().getOwner()) != null)) {
            owner.q(getLayoutNode());
        }
        if (zC) {
            return;
        }
        androidx.compose.ui.node.g layoutNode = getLayoutNode();
        layoutNode.v1(this);
        if (layoutNode.getGloballyPositionedObservers() > 0) {
            g0.b(layoutNode).l(layoutNode);
        }
    }

    static /* synthetic */ void n4(NodeCoordinator nodeCoordinator, boolean z15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: updateLayerParameters");
        }
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        nodeCoordinator.m4(z15);
    }

    private final boolean s3(int type) {
        f3.m.c cVarU3 = u3(t0.i(type));
        return cVarU3 != null && g4.h.h(cVarU3, type);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f3.m.c u3(boolean includeTail) {
        f3.m.c cVarN3;
        if (getLayoutNode().y0() == this) {
            return getLayoutNode().getNodes().getHead();
        }
        if (!includeTail) {
            NodeCoordinator nodeCoordinator = this.wrappedBy;
            if (nodeCoordinator != null) {
                return nodeCoordinator.n3();
            }
            return null;
        }
        NodeCoordinator nodeCoordinator2 = this.wrappedBy;
        if (nodeCoordinator2 == null || (cVarN3 = nodeCoordinator2.n3()) == null) {
            return null;
        }
        return cVarN3.getChild();
    }

    private final void v3(f3.m.c cVar, f fVar, long j15, g4.t tVar, int i15, boolean z15) {
        if (cVar == null) {
            y3(fVar, j15, tVar, i15, z15);
            return;
        }
        if (!fVar.f(cVar)) {
            v3(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15);
            return;
        }
        int i16 = tVar.hitDepth;
        tVar.z(tVar.hitDepth + 1, tVar.size());
        tVar.hitDepth++;
        tVar.values.n(cVar);
        tVar.distanceFromEdgeAndFlags.d(u.a(-1.0f, z15, false));
        v3(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15);
        tVar.hitDepth = i16;
    }

    private final void w3(f3.m.c cVar, f fVar, long j15, g4.t tVar, int i15, boolean z15, float f15) {
        if (cVar == null) {
            y3(fVar, j15, tVar, i15, z15);
            return;
        }
        if (!fVar.f(cVar)) {
            w3(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15, f15);
            return;
        }
        int i16 = tVar.hitDepth;
        tVar.z(tVar.hitDepth + 1, tVar.size());
        tVar.hitDepth++;
        tVar.values.n(cVar);
        tVar.distanceFromEdgeAndFlags.d(u.a(f15, z15, false));
        M3(r0.d(cVar, fVar.a(), s0.a(2)), fVar, j15, tVar, i15, z15, f15, true);
        tVar.hitDepth = i16;
    }

    @Override // p036e4.b0
    public long A0(long relativeToLocal) {
        if (!c()) {
            d4.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        E3();
        long jG4 = relativeToLocal;
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != null; nodeCoordinator = nodeCoordinator.wrappedBy) {
            androidx.compose.ui.node.g layoutNode = nodeCoordinator.getLayoutNode();
            if (nodeCoordinator == layoutNode.y0() && !layoutNode.getHasPositionalLayerTransformationsInOffsetFromRoot()) {
                long jD = g0.b(layoutNode).getRectManager().d(layoutNode);
                if (!c5.n.h(jD, c5.n.INSTANCE.a())) {
                    return c5.o.c(jG4, jD);
                }
            }
            jG4 = g4(nodeCoordinator, jG4, false, 2, null);
        }
        return jG4;
    }

    @Override // androidx.compose.ui.node.j, g4.j0
    /* JADX INFO: renamed from: A2, reason: from getter */
    public androidx.compose.ui.node.g getLayoutNode() {
        return this.layoutNode;
    }

    protected final boolean B3(long pointerPosition) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (pointerPosition >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (pointerPosition & BodyPartID.bodyIdMax));
        return fIntBitsToFloat >= 0.0f && fIntBitsToFloat2 >= 0.0f && fIntBitsToFloat < ((float) P0()) && fIntBitsToFloat2 < ((float) L0());
    }

    public final boolean C3() {
        if (this.layer != null && this.lastLayerAlpha <= 0.0f) {
            return true;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            return nodeCoordinator.C3();
        }
        return false;
    }

    @Override // p036e4.b0
    public boolean E() {
        return getIsPlacedUnderMotionFrameOfReference();
    }

    @Override // androidx.compose.ui.node.j
    public androidx.compose.ui.node.j E1() {
        return this.wrapped;
    }

    public final void E3() {
        getLayoutNode().getLayoutDelegate().H();
    }

    public void F3() {
        a1 a1Var = this.layer;
        if (a1Var != null) {
            a1Var.invalidate();
        }
    }

    @Override // p036e4.b0
    public final b0 G() {
        if (!c()) {
            d4.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        E3();
        return this.wrappedBy;
    }

    @Override // androidx.compose.ui.node.j
    public boolean G1() {
        return this._measureResult != null;
    }

    public final void G3() {
        S3();
        if (getLayoutNode().p()) {
            L3();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v8 */
    protected void H3(int width, int height) {
        NodeCoordinator nodeCoordinator;
        a1 a1Var = this.layer;
        if (a1Var != null) {
            a1Var.e(c5.r.c((((long) width) << 32) | (((long) height) & BodyPartID.bodyIdMax)));
        } else if (getLayoutNode().p() && (nodeCoordinator = this.wrappedBy) != null) {
            nodeCoordinator.z3();
        }
        d1(c5.r.c((((long) height) & BodyPartID.bodyIdMax) | (((long) width) << 32)));
        if (this.layerBlock != null) {
            m4(false);
        }
        int iA = s0.a(4);
        boolean zI = t0.i(iA);
        f3.m.c cVarN3 = n3();
        if (zI || (cVarN3 = cVarN3.getParent()) != null) {
            for (f3.m.c cVarU3 = u3(zI); cVarU3 != null && (cVarU3.getAggregateChildKindSet() & iA) != 0; cVarU3 = cVarU3.getChild()) {
                if ((cVarU3.getKindSet() & iA) != 0) {
                    f3.m.c cVarL = cVarU3;
                    n2.c cVar = null;
                    while (cVarL != 0) {
                        if (cVarL instanceof g4.q) {
                            ((g4.q) cVarL).a2();
                        } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                            f3.m.c cVarO3 = ((g4.j) cVarL).getDelegate();
                            int i15 = 0;
                            cVarL = cVarL;
                            while (cVarO3 != null) {
                                if ((cVarO3.getKindSet() & iA) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        cVarL = cVarO3;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (cVarL != 0) {
                                            cVar.d(cVarL);
                                            cVarL = 0;
                                        }
                                        cVar.d(cVarO3);
                                    }
                                }
                                cVarO3 = cVarO3.getChild();
                                cVarL = cVarL;
                            }
                            if (i15 == 1) {
                            }
                        }
                        cVarL = g4.h.l(cVar);
                    }
                }
                if (cVarU3 == cVarN3) {
                    break;
                }
            }
        }
        Owner owner = getLayoutNode().getOwner();
        if (owner != null) {
            owner.q(getLayoutNode());
        }
        getLayoutNode().v1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v10 */
    public final void I3() {
        f3.m.c parent;
        if (s3(s0.a(128))) {
            c3.l.Companion companion = c3.l.INSTANCE;
            c3.l lVarD = companion.d();
            er.l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                int iA = s0.a(128);
                boolean zI = t0.i(iA);
                if (!zI) {
                    parent = n3().getParent();
                    if (parent == null) {
                    }
                    i0 i0Var = i0.f148189a;
                }
                parent = n3();
                for (f3.m.c cVarU3 = u3(zI); cVarU3 != null && (cVarU3.getAggregateChildKindSet() & iA) != 0; cVarU3 = cVarU3.getChild()) {
                    if ((cVarU3.getKindSet() & iA) != 0) {
                        n2.c cVar = null;
                        f3.m.c cVarL = cVarU3;
                        while (cVarL != 0) {
                            if (cVarL instanceof k0) {
                                ((k0) cVarL).e(getMeasuredSize());
                            } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                                f3.m.c cVarO3 = ((g4.j) cVarL).getDelegate();
                                int i15 = 0;
                                cVarL = cVarL;
                                while (cVarO3 != null) {
                                    if ((cVarO3.getKindSet() & iA) != 0) {
                                        i15++;
                                        if (i15 == 1) {
                                            cVarL = cVarO3;
                                        } else {
                                            if (cVar == null) {
                                                cVar = new n2.c(new f3.m.c[16], 0);
                                            }
                                            if (cVarL != 0) {
                                                cVar.d(cVarL);
                                                cVarL = 0;
                                            }
                                            cVar.d(cVarO3);
                                        }
                                    }
                                    cVarO3 = cVarO3.getChild();
                                    cVarL = cVarL;
                                }
                                if (i15 == 1) {
                                }
                            }
                            cVarL = g4.h.l(cVar);
                        }
                    }
                    if (cVarU3 == parent) {
                        break;
                    }
                }
                i0 i0Var2 = i0.f148189a;
            } finally {
                companion.l(lVarD, lVarE, lVarG);
            }
        }
    }

    @Override // androidx.compose.ui.node.j
    public x0 J1() {
        x0 x0Var = this._measureResult;
        if (x0Var != null) {
            return x0Var;
        }
        throw new IllegalStateException("Asking for measurement result of unmeasured layout modifier");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void J3() {
        int iA = s0.a(4194304);
        boolean zI = t0.i(iA);
        f3.m.c cVarN3 = n3();
        if (!zI && (cVarN3 = cVarN3.getParent()) == null) {
            return;
        }
        for (f3.m.c cVarU3 = u3(zI); cVarU3 != null && (cVarU3.getAggregateChildKindSet() & iA) != 0; cVarU3 = cVarU3.getChild()) {
            if ((cVarU3.getKindSet() & iA) != 0) {
                f3.m.c cVarL = cVarU3;
                n2.c cVar = null;
                while (cVarL != 0) {
                    if (cVarL instanceof y) {
                        ((y) cVarL).E(this);
                    } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                        f3.m.c cVarO3 = ((g4.j) cVarL).getDelegate();
                        int i15 = 0;
                        cVarL = cVarL;
                        while (cVarO3 != null) {
                            if ((cVarO3.getKindSet() & iA) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    cVarL = cVarO3;
                                } else {
                                    if (cVar == null) {
                                        cVar = new n2.c(new f3.m.c[16], 0);
                                    }
                                    if (cVarL != 0) {
                                        cVar.d(cVarL);
                                        cVarL = 0;
                                    }
                                    cVar.d(cVarO3);
                                }
                            }
                            cVarO3 = cVarO3.getChild();
                            cVarL = cVarL;
                        }
                        if (i15 == 1) {
                        }
                    }
                    cVarL = g4.h.l(cVar);
                }
            }
            if (cVarU3 == cVarN3) {
                return;
            }
        }
    }

    @Override // p036e4.b0
    public long K(long relativeToWindow) {
        if (!c()) {
            d4.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        b0 b0VarE = c0.e(this);
        return r(b0VarE, m3.e.p(g0.b(getLayoutNode()).F(relativeToWindow), c0.g(b0VarE)));
    }

    @Override // g4.b1
    public boolean K1() {
        return (this.layer == null || this.released || !getLayoutNode().c()) ? false : true;
    }

    public final void K3() {
        this.released = true;
        this.invalidateParentLayer.a();
        S3();
        if (c5.n.h(getPosition(), c5.n.INSTANCE.b())) {
            return;
        }
        getLayoutNode().v1(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void L3() {
        if (s3(s0.a(PKIFailureInfo.badCertTemplate))) {
            int iA = s0.a(PKIFailureInfo.badCertTemplate);
            boolean zI = t0.i(iA);
            f3.m.c cVarN3 = n3();
            if (!zI && (cVarN3 = cVarN3.getParent()) == null) {
                return;
            }
            for (f3.m.c cVarU3 = u3(zI); cVarU3 != null && (cVarU3.getAggregateChildKindSet() & iA) != 0; cVarU3 = cVarU3.getChild()) {
                if ((cVarU3.getKindSet() & iA) != 0) {
                    f3.m.c cVarL = cVarU3;
                    n2.c cVar = null;
                    while (cVarL != 0) {
                        if (cVarL instanceof t1) {
                            ((t1) cVarL).I2();
                        } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                            f3.m.c cVarO3 = ((g4.j) cVarL).getDelegate();
                            int i15 = 0;
                            cVarL = cVarL;
                            while (cVarO3 != null) {
                                if ((cVarO3.getKindSet() & iA) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        cVarL = cVarO3;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (cVarL != 0) {
                                            cVar.d(cVarL);
                                            cVarL = 0;
                                        }
                                        cVar.d(cVarO3);
                                    }
                                }
                                cVarO3 = cVarO3.getChild();
                                cVarL = cVarL;
                            }
                            if (i15 == 1) {
                            }
                        }
                        cVarL = g4.h.l(cVar);
                    }
                }
                if (cVarU3 == cVarN3) {
                    return;
                }
            }
        }
    }

    @Override // androidx.compose.ui.node.j
    public androidx.compose.ui.node.j M1() {
        return this.wrappedBy;
    }

    public void N3(h1 canvas, q3.c graphicsLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.T2(canvas, graphicsLayer);
        }
    }

    @Override // androidx.compose.ui.node.j
    /* JADX INFO: renamed from: O1, reason: from getter */
    public long getPosition() {
        return this.position;
    }

    public final void P3(long position, float zIndex, er.l<? super a2, i0> layerBlock, q3.c layer) {
        O3(c5.n.m(position, getApparentToRealOffset()), zIndex, layerBlock, layer);
    }

    @Override // p036e4.b0
    public long Q(b0 sourceCoordinates, long relativeToSource, boolean includeMotionFrameOfReference) {
        if (sourceCoordinates instanceof q0) {
            q0 q0Var = (q0) sourceCoordinates;
            q0Var.a().E3();
            return m3.e.e(q0Var.Q(this, m3.e.e(relativeToSource ^ (-9223372034707292160L)), includeMotionFrameOfReference) ^ (-9223372034707292160L));
        }
        NodeCoordinator nodeCoordinatorE4 = e4(sourceCoordinates);
        nodeCoordinatorE4.E3();
        NodeCoordinator nodeCoordinatorX2 = X2(nodeCoordinatorE4);
        while (nodeCoordinatorE4 != nodeCoordinatorX2) {
            relativeToSource = nodeCoordinatorE4.f4(relativeToSource, includeMotionFrameOfReference);
            nodeCoordinatorE4 = nodeCoordinatorE4.wrappedBy;
        }
        return P2(nodeCoordinatorX2, relativeToSource, includeMotionFrameOfReference);
    }

    protected final long Q2(MutableRect childRect, long minimumTouchTargetSize) {
        float left = childRect.getLeft();
        float top = childRect.getTop();
        if (childRect.getRight() < 0.0f || left > ((int) (b() >> 32)) || childRect.getBottom() < 0.0f || top > ((int) (b() & BodyPartID.bodyIdMax))) {
            return m3.e.INSTANCE.c();
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & BodyPartID.bodyIdMax));
        float right = (fIntBitsToFloat - (childRect.getRight() - childRect.getLeft())) / 2.0f;
        float fD = right > 0.0f ? left - right : lr.m.d(left, (-fIntBitsToFloat) / 2.0f);
        float bottom = (fIntBitsToFloat2 - (childRect.getBottom() - childRect.getTop())) / 2.0f;
        return m3.e.e((((long) Float.floatToRawIntBits(fD)) << 32) | (((long) Float.floatToRawIntBits(bottom > 0.0f ? top - bottom : lr.m.d(top, (-fIntBitsToFloat2) / 2.0f))) & BodyPartID.bodyIdMax));
    }

    public final void Q3(MutableRect bounds, boolean clipBounds, boolean clipToMinimumTouchTargetSize) {
        a1 a1Var = this.layer;
        if (a1Var != null) {
            if (this.isClipping) {
                if (clipToMinimumTouchTargetSize) {
                    long jK3 = k3();
                    long jQ2 = Q2(bounds, jK3);
                    float fIntBitsToFloat = Float.intBitsToFloat((int) (jQ2 >> 32));
                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jQ2 & BodyPartID.bodyIdMax));
                    long jB = b();
                    int i15 = (int) (jB >> 32);
                    int i16 = (int) (jB & BodyPartID.bodyIdMax);
                    float f15 = i15;
                    int i17 = (int) (jK3 >> 32);
                    float fMin = Math.min(Float.intBitsToFloat(i17) + f15, Math.max(f15, Float.intBitsToFloat(i17) + fIntBitsToFloat));
                    float f16 = i16;
                    int i18 = (int) (jK3 & BodyPartID.bodyIdMax);
                    bounds.e(fIntBitsToFloat, fIntBitsToFloat2, fMin, Math.min(Float.intBitsToFloat(i18) + f16, Math.max(f16, Float.intBitsToFloat(i18) + fIntBitsToFloat2)));
                } else if (clipBounds) {
                    bounds.e(0.0f, 0.0f, (int) (b() >> 32), (int) (BodyPartID.bodyIdMax & b()));
                }
                if (bounds.f()) {
                    return;
                }
            }
            a1Var.c(bounds, false);
        }
        float fI = c5.n.i(getPosition());
        bounds.i(bounds.getLeft() + fI);
        bounds.j(bounds.getRight() + fI);
        float fJ = c5.n.j(getPosition());
        bounds.k(bounds.getTop() + fJ);
        bounds.h(bounds.getBottom() + fJ);
    }

    protected final long R2(long minimumTouchTargetSize) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) - P0();
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (minimumTouchTargetSize & BodyPartID.bodyIdMax)) - L0();
        float fMax = Math.max(0.0f, fIntBitsToFloat / 2.0f);
        return m3.k.d((((long) Float.floatToRawIntBits(Math.max(0.0f, fIntBitsToFloat2 / 2.0f))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fMax) << 32));
    }

    protected final float S2(long pointerPosition, long minimumTouchTargetSize) {
        if (P0() >= Float.intBitsToFloat((int) (minimumTouchTargetSize >> 32)) && L0() >= Float.intBitsToFloat((int) (minimumTouchTargetSize & BodyPartID.bodyIdMax))) {
            return Float.POSITIVE_INFINITY;
        }
        long jR2 = R2(minimumTouchTargetSize);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (jR2 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (jR2 & BodyPartID.bodyIdMax));
        long jD3 = D3(pointerPosition);
        if ((fIntBitsToFloat > 0.0f || fIntBitsToFloat2 > 0.0f) && Float.intBitsToFloat((int) (jD3 >> 32)) <= fIntBitsToFloat && Float.intBitsToFloat((int) (jD3 & BodyPartID.bodyIdMax)) <= fIntBitsToFloat2) {
            return m3.e.l(jD3);
        }
        return Float.POSITIVE_INFINITY;
    }

    public final void S3() {
        if (this.layer != null) {
            if (this.explicitLayer != null) {
                this.explicitLayer = null;
            }
            l4(this, null, false, 2, null);
            androidx.compose.ui.node.g.M1(getLayoutNode(), false, 1, null);
        }
    }

    public final void T2(h1 canvas, q3.c graphicsLayer) {
        a1 a1Var = this.layer;
        if (a1Var != null) {
            a1Var.l(canvas, graphicsLayer);
            return;
        }
        float fI = c5.n.i(getPosition());
        float fJ = c5.n.j(getPosition());
        canvas.d(fI, fJ);
        V2(canvas, graphicsLayer);
        canvas.d(-fI, -fJ);
    }

    public final void T3(boolean z15) {
        this.forceMeasureWithLookaheadConstraints = z15;
    }

    protected final void U2(h1 canvas, k2 paint) {
        canvas.h(0.5f, 0.5f, ((int) (getMeasuredSize() >> 32)) - 0.5f, ((int) (getMeasuredSize() & BodyPartID.bodyIdMax)) - 0.5f, paint);
    }

    public final void U3(boolean z15) {
        this.forcePlaceWithLookaheadOffset = z15;
    }

    public final void V3(boolean z15) {
        this.lastClip = z15;
    }

    @Override // p036e4.b0
    public long W(long relativeToLocal) {
        return g0.b(getLayoutNode()).j(A0(relativeToLocal));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void W0(long position, float zIndex, er.l<? super a2, i0> layerBlock) {
        if (this.forcePlaceWithLookaheadOffset) {
            O3(getLookaheadDelegate().getPosition(), zIndex, layerBlock, null);
        } else {
            O3(position, zIndex, layerBlock, null);
        }
    }

    public abstract void W2();

    public final void W3(y2 y2Var) {
        this.lastShape = y2Var;
    }

    public final NodeCoordinator X2(NodeCoordinator other) {
        androidx.compose.ui.node.g layoutNode = other.getLayoutNode();
        androidx.compose.ui.node.g layoutNode2 = getLayoutNode();
        if (layoutNode == layoutNode2) {
            f3.m.c cVarN3 = other.n3();
            f3.m.c cVarN4 = n3();
            int iA = s0.a(2);
            if (!cVarN4.getNode().getIsAttached()) {
                d4.a.c("visitLocalAncestors called on an unattached node");
            }
            for (f3.m.c parent = cVarN4.getNode().getParent(); parent != null; parent = parent.getParent()) {
                if ((parent.getKindSet() & iA) != 0 && parent == cVarN3) {
                    return other;
                }
            }
            return this;
        }
        while (layoutNode.getDepth() > layoutNode2.getDepth()) {
            layoutNode = layoutNode.C0();
        }
        while (layoutNode2.getDepth() > layoutNode.getDepth()) {
            layoutNode2 = layoutNode2.C0();
        }
        while (layoutNode != layoutNode2) {
            layoutNode = layoutNode.C0();
            layoutNode2 = layoutNode2.C0();
            if (layoutNode == null || layoutNode2 == null) {
                throw new IllegalArgumentException("layouts are not part of the same hierarchy");
            }
        }
        if (layoutNode2 != getLayoutNode()) {
            if (layoutNode != other.getLayoutNode()) {
                return layoutNode.b0();
            }
            return other;
        }
        return this;
    }

    public void X3(x0 x0Var) {
        x0 x0Var2 = this._measureResult;
        if (x0Var != x0Var2) {
            this._measureResult = x0Var;
            if (x0Var2 == null || x0Var.getF47486a() != x0Var2.getF47486a() || x0Var.getF47487b() != x0Var2.getF47487b()) {
                H3(x0Var.getF47486a(), x0Var.getF47487b());
            }
            p0<p036e4.a> p0Var = this.oldAlignmentLines;
            if (((p0Var == null || !p0Var.h()) && x0Var.i().isEmpty()) || r0.c(this.oldAlignmentLines, x0Var.i())) {
                return;
            }
            b3().getAlignmentLines().m();
            p0<p036e4.a> p0VarB = this.oldAlignmentLines;
            if (p0VarB == null) {
                p0VarB = z0.b();
                this.oldAlignmentLines = p0VarB;
            }
            p0VarB.j();
            for (Map.Entry<p036e4.a, Integer> entry : x0Var.i().entrySet()) {
                p0VarB.u(entry.getKey(), entry.getValue().intValue());
            }
        }
    }

    @Override // p036e4.b0
    public m3.g Y(b0 sourceCoordinates, boolean clipBounds) {
        if (!c()) {
            d4.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        if (!sourceCoordinates.c()) {
            d4.a.c("LayoutCoordinates " + sourceCoordinates + " is not attached!");
        }
        NodeCoordinator nodeCoordinatorE4 = e4(sourceCoordinates);
        nodeCoordinatorE4.E3();
        NodeCoordinator nodeCoordinatorX2 = X2(nodeCoordinatorE4);
        MutableRect mutableRectL3 = l3();
        mutableRectL3.i(0.0f);
        mutableRectL3.k(0.0f);
        mutableRectL3.j((int) (sourceCoordinates.b() >> 32));
        mutableRectL3.h((int) (sourceCoordinates.b() & BodyPartID.bodyIdMax));
        NodeCoordinator nodeCoordinator = nodeCoordinatorE4;
        while (nodeCoordinator != nodeCoordinatorX2) {
            boolean z15 = clipBounds;
            R3(nodeCoordinator, mutableRectL3, z15, false, 4, null);
            if (mutableRectL3.f()) {
                return m3.g.INSTANCE.a();
            }
            nodeCoordinator = nodeCoordinator.wrappedBy;
            clipBounds = z15;
        }
        O2(nodeCoordinatorX2, mutableRectL3, clipBounds);
        return m3.d.a(mutableRectL3);
    }

    public long Y2(long position, boolean includeMotionFrameOfReference) {
        if (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) {
            position = c5.o.b(position, getPosition());
        }
        a1 a1Var = this.layer;
        return a1Var != null ? a1Var.d(position, true) : position;
    }

    protected void Y3(long j15) {
        this.position = j15;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p036e4.a2
    public void Z0(long position, float zIndex, q3.c layer) {
        if (this.forcePlaceWithLookaheadOffset) {
            O3(getLookaheadDelegate().getPosition(), zIndex, null, layer);
        } else {
            O3(position, zIndex, null, layer);
        }
    }

    public final void Z3(boolean z15) {
        this.wasLayerBlockInvoked = z15;
    }

    public final void a4(NodeCoordinator nodeCoordinator) {
        this.wrapped = nodeCoordinator;
    }

    @Override // p036e4.b0
    public final long b() {
        return getMeasuredSize();
    }

    public g4.b b3() {
        return getLayoutNode().getLayoutDelegate().b();
    }

    public final void b4(NodeCoordinator nodeCoordinator) {
        this.wrappedBy = nodeCoordinator;
    }

    @Override // p036e4.b0
    public boolean c() {
        return n3().getIsAttached();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    public final boolean c4() {
        /*
            r11 = this;
            r0 = 16
            int r1 = g4.s0.a(r0)
            boolean r1 = g4.t0.i(r1)
            f3.m$c r1 = r11.u3(r1)
            r2 = 0
            if (r1 != 0) goto L12
            return r2
        L12:
            boolean r3 = r1.getIsAttached()
            if (r3 == 0) goto L98
            int r3 = g4.s0.a(r0)
            f3.m$c r4 = r1.getNode()
            boolean r4 = r4.getIsAttached()
            if (r4 != 0) goto L2b
            java.lang.String r4 = "visitLocalDescendants called on an unattached node"
            d4.a.c(r4)
        L2b:
            f3.m$c r1 = r1.getNode()
            int r4 = r1.getAggregateChildKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L98
        L36:
            if (r1 == 0) goto L98
            int r4 = r1.getKindSet()
            r4 = r4 & r3
            if (r4 == 0) goto L93
            r4 = 0
            r5 = r1
            r6 = r4
        L42:
            if (r5 == 0) goto L93
            boolean r7 = r5 instanceof g4.f1
            r8 = 1
            if (r7 == 0) goto L52
            g4.f1 r5 = (g4.f1) r5
            boolean r5 = r5.z2()
            if (r5 == 0) goto L8e
            return r8
        L52:
            int r7 = r5.getKindSet()
            r7 = r7 & r3
            if (r7 == 0) goto L8e
            boolean r7 = r5 instanceof g4.j
            if (r7 == 0) goto L8e
            r7 = r5
            g4.j r7 = (g4.j) r7
            f3.m$c r7 = r7.getDelegate()
            r9 = r2
        L65:
            if (r7 == 0) goto L8b
            int r10 = r7.getKindSet()
            r10 = r10 & r3
            if (r10 == 0) goto L86
            int r9 = r9 + 1
            if (r9 != r8) goto L74
            r5 = r7
            goto L86
        L74:
            if (r6 != 0) goto L7d
            n2.c r6 = new n2.c
            f3.m$c[] r10 = new f3.m.c[r0]
            r6.<init>(r10, r2)
        L7d:
            if (r5 == 0) goto L83
            r6.d(r5)
            r5 = r4
        L83:
            r6.d(r7)
        L86:
            f3.m$c r7 = r7.getChild()
            goto L65
        L8b:
            if (r9 != r8) goto L8e
            goto L42
        L8e:
            f3.m$c r5 = g4.h.b(r6)
            goto L42
        L93:
            f3.m$c r1 = r1.getChild()
            goto L36
        L98:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.NodeCoordinator.c4():boolean");
    }

    @Override // p036e4.b0
    public void d0(float[] matrix) {
        Owner ownerB = g0.b(getLayoutNode());
        NodeCoordinator nodeCoordinatorE4 = e4(c0.e(this));
        j4(nodeCoordinatorE4, matrix);
        if (ownerB instanceof a4.i) {
            ((a4.i) ownerB).y(matrix);
            return;
        }
        long jI = c0.i(nodeCoordinatorE4);
        if ((9223372034707292159L & jI) != 9205357640488583168L) {
            g2.r(matrix, Float.intBitsToFloat((int) (jI >> 32)), Float.intBitsToFloat((int) (jI & BodyPartID.bodyIdMax)), 0.0f);
        }
    }

    /* JADX INFO: renamed from: d3, reason: from getter */
    public final boolean getForceMeasureWithLookaheadConstraints() {
        return this.forceMeasureWithLookaheadConstraints;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [T, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v8 */
    @Override // p036e4.z0, p036e4.v
    /* JADX INFO: renamed from: e */
    public Object getParentData() {
        if (!getLayoutNode().getNodes().q(s0.a(64))) {
            return null;
        }
        n3();
        fr.p0 p0Var = new fr.p0();
        for (f3.m.c tail = getLayoutNode().getNodes().getTail(); tail != null; tail = tail.getParent()) {
            if ((s0.a(64) & tail.getKindSet()) != 0) {
                int iA = s0.a(64);
                n2.c cVar = null;
                f3.m.c cVarL = tail;
                while (cVarL != 0) {
                    if (cVarL instanceof d1) {
                        p0Var.f66410a = ((d1) cVarL).n(getLayoutNode().getDensity(), p0Var.f66410a);
                    } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                        f3.m.c cVarO3 = ((g4.j) cVarL).getDelegate();
                        int i15 = 0;
                        cVarL = cVarL;
                        while (cVarO3 != null) {
                            if ((cVarO3.getKindSet() & iA) != 0) {
                                i15++;
                                if (i15 == 1) {
                                    cVarL = cVarO3;
                                } else {
                                    if (cVar == null) {
                                        cVar = new n2.c(new f3.m.c[16], 0);
                                    }
                                    if (cVarL != 0) {
                                        cVar.d(cVarL);
                                        cVarL = 0;
                                    }
                                    cVar.d(cVarO3);
                                }
                            }
                            cVarO3 = cVarO3.getChild();
                            cVarL = cVarL;
                        }
                        if (i15 == 1) {
                        }
                    }
                    cVarL = g4.h.l(cVar);
                }
            }
        }
        return p0Var.f66410a;
    }

    /* JADX INFO: renamed from: e3, reason: from getter */
    public final boolean getLastClip() {
        return this.lastClip;
    }

    /* JADX INFO: renamed from: f3, reason: from getter */
    public final boolean getLastLayerDrawingWasSkipped() {
        return this.lastLayerDrawingWasSkipped;
    }

    public long f4(long position, boolean includeMotionFrameOfReference) {
        a1 a1Var = this.layer;
        if (a1Var != null) {
            position = a1Var.d(position, false);
        }
        return (includeMotionFrameOfReference || !getIsPlacedUnderMotionFrameOfReference()) ? c5.o.c(position, getPosition()) : position;
    }

    public final long g3() {
        return getMeasurementConstraints();
    }

    @Override // c5.d
    public float getDensity() {
        return getLayoutNode().getDensity().getDensity();
    }

    @Override // p036e4.w
    public t getLayoutDirection() {
        return getLayoutNode().getLayoutDirection();
    }

    @Override // p036e4.b0
    public long h(long relativeToScreen) {
        if (!c()) {
            d4.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return r(c0.e(this), g0.b(getLayoutNode()).h(relativeToScreen));
    }

    @Override // androidx.compose.ui.node.j
    public void h2() {
        q3.c cVar = this.explicitLayer;
        if (cVar != null) {
            Z0(getPosition(), this.zIndex, cVar);
        } else {
            W0(getPosition(), this.zIndex, this.layerBlock);
        }
    }

    /* JADX INFO: renamed from: h3, reason: from getter */
    public final y2 getLastShape() {
        return this.lastShape;
    }

    public final m3.g h4() {
        if (!c()) {
            return m3.g.INSTANCE.a();
        }
        b0 b0VarE = c0.e(this);
        MutableRect mutableRectL3 = l3();
        long jR2 = R2(k3());
        int i15 = (int) (jR2 >> 32);
        mutableRectL3.i(-Float.intBitsToFloat(i15));
        int i16 = (int) (jR2 & BodyPartID.bodyIdMax);
        mutableRectL3.k(-Float.intBitsToFloat(i16));
        mutableRectL3.j(P0() + Float.intBitsToFloat(i15));
        mutableRectL3.h(L0() + Float.intBitsToFloat(i16));
        for (NodeCoordinator nodeCoordinator = this; nodeCoordinator != b0VarE; nodeCoordinator = nodeCoordinator.wrappedBy) {
            nodeCoordinator.Q3(mutableRectL3, false, true);
            if (mutableRectL3.f()) {
                return m3.g.INSTANCE.a();
            }
        }
        return m3.d.a(mutableRectL3);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return getLayoutNode().getDensity().getFontScale();
    }

    /* JADX INFO: renamed from: i3, reason: from getter */
    public final a1 getLayer() {
        return this.layer;
    }

    /* JADX INFO: renamed from: j3 */
    public abstract androidx.compose.ui.node.k getLookaheadDelegate();

    @Override // p036e4.b0
    public long k(long relativeToLocal) {
        if (!c()) {
            d4.a.c("LayoutCoordinate operations are only valid when isAttached is true");
        }
        return g0.b(getLayoutNode()).k(A0(relativeToLocal));
    }

    public final long k3() {
        return this.layerDensity.B2(getLayoutNode().getViewConfiguration().e());
    }

    public final void k4(er.l<? super a2, i0> layerBlock, boolean forceUpdateLayerParameters) {
        Owner owner;
        if (!(layerBlock == null || this.explicitLayer == null)) {
            d4.a.a("layerBlock can't be provided when explicitLayer is provided");
        }
        androidx.compose.ui.node.g layoutNode = getLayoutNode();
        boolean z15 = (!forceUpdateLayerParameters && this.layerBlock == layerBlock && fr.t.c(this.layerDensity, layoutNode.getDensity()) && this.layerLayoutDirection == layoutNode.getLayoutDirection()) ? false : true;
        this.layerDensity = layoutNode.getDensity();
        this.layerLayoutDirection = layoutNode.getLayoutDirection();
        if (layoutNode.c() && layerBlock != null) {
            this.layerBlock = layerBlock;
            if (this.layer != null) {
                if (z15) {
                    n4(this, false, 1, null);
                    return;
                }
                return;
            }
            a1 a1VarC = Owner.C(g0.b(layoutNode), c3(), this.invalidateParentLayer, null, 4, null);
            a1VarC.e(getMeasuredSize());
            a1VarC.j(getPosition());
            this.layer = a1VarC;
            n4(this, false, 1, null);
            layoutNode.X1(true);
            this.invalidateParentLayer.a();
            return;
        }
        this.layerBlock = null;
        a1 a1Var = this.layer;
        if (a1Var != null) {
            if (!h2.a(a1Var.mo27getUnderlyingMatrixsQKQjiQ())) {
                layoutNode.v1(this);
            }
            a1Var.destroy();
            this.layer = null;
            layoutNode.X1(true);
            this.invalidateParentLayer.a();
            if (c() && layoutNode.p() && (owner = layoutNode.getOwner()) != null) {
                owner.q(layoutNode);
            }
        }
        this.lastLayerDrawingWasSkipped = false;
    }

    protected final MutableRect l3() {
        MutableRect mutableRect = this._rectCache;
        if (mutableRect != null) {
            return mutableRect;
        }
        MutableRect mutableRect2 = new MutableRect(0.0f, 0.0f, 0.0f, 0.0f);
        this._rectCache = mutableRect2;
        return mutableRect2;
    }

    @Override // androidx.compose.ui.node.j
    public b0 m() {
        return this;
    }

    public abstract f3.m.c n3();

    /* JADX INFO: renamed from: o3, reason: from getter */
    public final boolean getWasLayerBlockInvoked() {
        return this.wasLayerBlockInvoked;
    }

    protected final boolean o4(long pointerPosition) {
        if ((((9187343241974906880L ^ (pointerPosition & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        a1 a1Var = this.layer;
        return a1Var == null || !this.isClipping || a1Var.g(pointerPosition);
    }

    /* JADX INFO: renamed from: p3, reason: from getter */
    public final NodeCoordinator getWrapped() {
        return this.wrapped;
    }

    /* JADX INFO: renamed from: q3, reason: from getter */
    public final NodeCoordinator getWrappedBy() {
        return this.wrappedBy;
    }

    @Override // p036e4.b0
    public long r(b0 sourceCoordinates, long relativeToSource) {
        return Q(sourceCoordinates, relativeToSource, true);
    }

    @Override // p036e4.b0
    public final b0 r0() {
        if (!c()) {
            StringBuilder sb5 = new StringBuilder("LayoutCoordinate operations are only valid when isAttached is true");
            for (androidx.compose.ui.node.g layoutNode = getLayoutNode(); layoutNode != null; layoutNode = layoutNode.C0()) {
                sb5.append('\n');
                sb5.append("|");
                sb5.append(layoutNode);
                sb5.append(" isAttached=");
                sb5.append(layoutNode.c());
                sb5.append(" modifier=");
                sb5.append(layoutNode.get_modifier());
                sb5.append(" tail=");
                sb5.append(n3());
            }
            d4.a.c(sb5.toString());
        }
        E3();
        return getLayoutNode().y0().wrappedBy;
    }

    /* JADX INFO: renamed from: r3, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final f3.m.c t3(int type) {
        boolean zI = t0.i(type);
        f3.m.c cVarN3 = n3();
        if (!zI && (cVarN3 = cVarN3.getParent()) == null) {
            return null;
        }
        for (f3.m.c cVarU3 = u3(zI); cVarU3 != null && (cVarU3.getAggregateChildKindSet() & type) != 0; cVarU3 = cVarU3.getChild()) {
            if ((cVarU3.getKindSet() & type) != 0) {
                return cVarU3;
            }
            if (cVarU3 == cVarN3) {
                return null;
            }
        }
        return null;
    }

    @Override // p036e4.b0
    public void w0(b0 sourceCoordinates, float[] matrix) {
        NodeCoordinator nodeCoordinatorE4 = e4(sourceCoordinates);
        nodeCoordinatorE4.E3();
        NodeCoordinator nodeCoordinatorX2 = X2(nodeCoordinatorE4);
        g2.i(matrix);
        nodeCoordinatorE4.j4(nodeCoordinatorX2, matrix);
        i4(nodeCoordinatorX2, matrix);
    }

    public final void x3(f hitTestSource, long pointerPosition, g4.t hitTestResult, int pointerType, boolean isInLayer) {
        boolean z15;
        f3.m.c cVarT3 = t3(hitTestSource.a());
        boolean z16 = false;
        if (!o4(pointerPosition)) {
            if (a4.p0.i(pointerType, a4.p0.INSTANCE.d())) {
                float fS2 = S2(pointerPosition, k3());
                if ((Float.floatToRawIntBits(fS2) & Integer.MAX_VALUE) >= 2139095040 || !hitTestResult.v(fS2, false)) {
                    return;
                }
                w3(cVarT3, hitTestSource, pointerPosition, hitTestResult, pointerType, false, fS2);
                return;
            }
            return;
        }
        if (cVarT3 == null) {
            y3(hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        if (B3(pointerPosition)) {
            v3(cVarT3, hitTestSource, pointerPosition, hitTestResult, pointerType, isInLayer);
            return;
        }
        float fS3 = !a4.p0.i(pointerType, a4.p0.INSTANCE.d()) ? Float.POSITIVE_INFINITY : S2(pointerPosition, k3());
        if ((Float.floatToRawIntBits(fS3) & Integer.MAX_VALUE) < 2139095040) {
            z15 = isInLayer;
            if (hitTestResult.v(fS3, z15)) {
                z16 = true;
            }
        } else {
            z15 = isInLayer;
        }
        M3(cVarT3, hitTestSource, pointerPosition, hitTestResult, pointerType, z15, fS3, z16);
    }

    public void y3(f hitTestSource, long pointerPosition, g4.t hitTestResult, int pointerType, boolean isInLayer) {
        NodeCoordinator nodeCoordinator = this.wrapped;
        if (nodeCoordinator != null) {
            nodeCoordinator.x3(hitTestSource, Z2(nodeCoordinator, pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
        }
    }

    public void z3() {
        a1 a1Var = this.layer;
        if (a1Var != null) {
            a1Var.invalidate();
            return;
        }
        NodeCoordinator nodeCoordinator = this.wrappedBy;
        if (nodeCoordinator != null) {
            nodeCoordinator.z3();
        }
    }
}
