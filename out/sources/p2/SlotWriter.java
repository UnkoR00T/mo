package p2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.h1;
import p076m2.o1;
import p076m2.t;
import p076m2.v4;
import p076m2.w3;
import pq.v;
import r0.i0;
import r0.j0;
import r0.k0;
import r0.q0;

/* JADX INFO: renamed from: p2.o, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0015\n\u0002\bT\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0001\u0018\u0000 \u0087\u00022\u00020\u0001:\u0002¼\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0007\u0010\bJ3\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0014\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010 \u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b\"\u0010\u0018J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u001bJ\u000f\u0010$\u001a\u00020\tH\u0002¢\u0006\u0004\b$\u0010%J'\u0010(\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\t2\u0006\u0010&\u001a\u00020\t2\u0006\u0010'\u001a\u00020\tH\u0002¢\u0006\u0004\b(\u0010)J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b*\u0010\u001dJ\u001f\u0010+\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010\u001bJ\u0017\u0010/\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\b/\u0010\u001dJ\u001f\u00100\u001a\u00020\u000f2\u0006\u0010.\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b0\u0010,J\u001f\u00103\u001a\u00020\f2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\tH\u0002¢\u0006\u0004\b3\u00104J'\u00105\u001a\u00020\u000f2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\tH\u0002¢\u0006\u0004\b5\u0010)J!\u00106\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001H\u0002¢\u0006\u0004\b6\u00107J\u001f\u0010:\u001a\u00020\u000f2\u0006\u00108\u001a\u00020\t2\u0006\u00109\u001a\u00020\tH\u0002¢\u0006\u0004\b:\u0010,JG\u0010A\u001a\u00020\f2\u0006\u0010;\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2&\u0010@\u001a\"\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<j\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u0001`?H\u0002¢\u0006\u0004\bA\u0010BJ'\u0010E\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020\t2\u0006\u0010D\u001a\u00020\t2\u0006\u0010.\u001a\u00020\tH\u0002¢\u0006\u0004\bE\u0010)J\u0017\u0010F\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010I\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bI\u0010GJ\u001b\u0010K\u001a\u00020\t*\u00020J2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\bK\u0010LJ\u0017\u0010M\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\bM\u0010GJ\u001b\u0010O\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bO\u0010LJ\u001b\u0010P\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bP\u0010LJ#\u0010Q\u001a\u00020\u000f*\u00020J2\u0006\u0010N\u001a\u00020\t2\u0006\u0010H\u001a\u00020\tH\u0002¢\u0006\u0004\bQ\u0010RJ\u001b\u0010S\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bS\u0010LJ\u001b\u0010T\u001a\u00020\t*\u00020J2\u0006\u0010N\u001a\u00020\tH\u0002¢\u0006\u0004\bT\u0010LJ/\u0010W\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010;\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bW\u0010XJ'\u0010Z\u001a\u00020\t2\u0006\u0010Y\u001a\u00020\t2\u0006\u0010U\u001a\u00020\t2\u0006\u0010V\u001a\u00020\tH\u0002¢\u0006\u0004\bZ\u0010[J\u001f\u0010\\\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010;\u001a\u00020\tH\u0002¢\u0006\u0004\b\\\u0010\u0015J\u0017\u0010]\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\tH\u0002¢\u0006\u0004\b]\u0010GJ\u0015\u0010^\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b^\u0010\u0018J\u0015\u0010_\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b_\u0010GJ\u0015\u0010`\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b`\u0010GJ\u0017\u0010a\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\ba\u0010bJ\u0015\u0010c\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bc\u0010\u0018J\u0015\u0010d\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bd\u0010\u0018J\u0015\u0010e\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\be\u0010GJ\u0017\u0010f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bf\u0010bJ\u0015\u0010g\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bg\u0010\u0018J\u0015\u0010h\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bh\u0010\u0018J\u001d\u0010i\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0004\bi\u00104J\u0017\u0010j\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bj\u0010bJ\u0017\u0010k\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020=¢\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\bm\u0010GJ\u0015\u0010o\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\f¢\u0006\u0004\bo\u0010pJ\r\u0010q\u001a\u00020\u000f¢\u0006\u0004\bq\u0010\u001bJ\u0019\u0010r\u001a\u0004\u0018\u00010\u00012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\br\u0010\bJ\u001f\u0010s\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020=2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bs\u0010tJ\u0015\u0010v\u001a\u00020\u000f2\u0006\u0010u\u001a\u00020\t¢\u0006\u0004\bv\u0010\u001dJ\u0017\u0010w\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bw\u0010xJ\r\u0010y\u001a\u00020\u000f¢\u0006\u0004\by\u0010\u001bJ\u0017\u0010z\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\bz\u0010xJ\u001f\u0010{\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020=2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b{\u0010tJ\u0017\u0010|\u001a\u00020\u000f2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b|\u0010xJ\u001d\u0010}\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0004\b}\u0010\u0015J)\u0010~\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b~\u0010\u007fJ\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0080\u0001\u001a\u00020\t¢\u0006\u0005\b\u0081\u0001\u0010bJ\u0012\u0010\u0082\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\"\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00012\u0006\u0010Y\u001a\u00020=2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J#\u0010\u0087\u0001\u001a\u0004\u0018\u00010\u00012\u0007\u0010\u0086\u0001\u001a\u00020\t2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u001a\u0010\u0089\u0001\u001a\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u0089\u0001\u0010GJ\u001a\u0010\u008a\u0001\u001a\u00020\t2\u0007\u0010\u0086\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\b\u008a\u0001\u0010GJ\u0017\u0010\u008b\u0001\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\t¢\u0006\u0005\b\u008b\u0001\u0010GJ\u0018\u0010\u008d\u0001\u001a\u00020\u000f2\u0007\u0010\u008c\u0001\u001a\u00020\t¢\u0006\u0005\b\u008d\u0001\u0010\u001dJ\u0018\u0010\u008e\u0001\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020=¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u000f\u0010\u0090\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0090\u0001\u0010\u001bJ\u000f\u0010\u0091\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0091\u0001\u0010\u001bJ\u000f\u0010\u0092\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0092\u0001\u0010\u001bJ\u000f\u0010\u0093\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u0093\u0001\u0010\u001bJ\"\u0010\u0095\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\t\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0095\u0001\u00107J!\u0010\u0096\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001¢\u0006\u0005\b\u0096\u0001\u00107J,\u0010\u0097\u0001\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u000f\u0010\u0099\u0001\u001a\u00020\t¢\u0006\u0005\b\u0099\u0001\u0010%J\u0017\u0010\u009a\u0001\u001a\u00020\u000f2\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0005\b\u009a\u0001\u0010\u001dJ\u0018\u0010\u009b\u0001\u001a\u00020\u000f2\u0006\u0010Y\u001a\u00020=¢\u0006\u0006\b\u009b\u0001\u0010\u008f\u0001J\u000f\u0010\u009c\u0001\u001a\u00020\t¢\u0006\u0005\b\u009c\u0001\u0010%J\u0010\u0010\u009d\u0001\u001a\u00020\f¢\u0006\u0006\b\u009d\u0001\u0010\u009e\u0001J6\u0010¡\u0001\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\t2\u001c\u0010 \u0001\u001a\u0017\u0012\u0004\u0012\u00020\t\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u000f0\u009f\u0001¢\u0006\u0006\b¡\u0001\u0010¢\u0001J\u0018\u0010¤\u0001\u001a\u00020\u000f2\u0007\u0010£\u0001\u001a\u00020\t¢\u0006\u0005\b¤\u0001\u0010\u001dJ!\u0010¦\u0001\u001a\u00020\f2\u0007\u0010¥\u0001\u001a\u00020=2\u0006\u0010Y\u001a\u00020=¢\u0006\u0006\b¦\u0001\u0010§\u0001J1\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00020=0©\u00012\u0006\u0010Y\u001a\u00020=2\u0007\u0010£\u0001\u001a\u00020\t2\u0007\u0010¨\u0001\u001a\u00020\u0000¢\u0006\u0006\bª\u0001\u0010«\u0001J2\u0010\u00ad\u0001\u001a\t\u0012\u0004\u0012\u00020=0©\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\t2\t\b\u0002\u0010¬\u0001\u001a\u00020\f¢\u0006\u0006\b\u00ad\u0001\u0010®\u0001J0\u0010¯\u0001\u001a\t\u0012\u0004\u0012\u00020=0©\u00012\u0007\u0010£\u0001\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\t¢\u0006\u0006\b¯\u0001\u0010°\u0001J\u001a\u0010±\u0001\u001a\u00020=2\b\b\u0002\u0010\u0013\u001a\u00020\t¢\u0006\u0006\b±\u0001\u0010²\u0001J\u0019\u0010³\u0001\u001a\u00020\u000f2\b\b\u0002\u0010\u0016\u001a\u00020\t¢\u0006\u0005\b³\u0001\u0010\u001dJ\u0018\u0010´\u0001\u001a\u00020\t2\u0006\u0010Y\u001a\u00020=¢\u0006\u0006\b´\u0001\u0010µ\u0001J\u0013\u0010·\u0001\u001a\u00030¶\u0001H\u0016¢\u0006\u0006\b·\u0001\u0010¸\u0001J\u001c\u0010¹\u0001\u001a\u0004\u0018\u00010>2\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0006\b¹\u0001\u0010º\u0001J\u001c\u0010»\u0001\u001a\u0004\u0018\u00010=2\u0006\u0010\u0016\u001a\u00020\tH\u0000¢\u0006\u0006\b»\u0001\u0010²\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¼\u0001\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001R\u0019\u0010Â\u0001\u001a\u00020J8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÀ\u0001\u0010Á\u0001R\"\u0010Æ\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010Ã\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R+\u0010Ë\u0001\u001a\u0014\u0012\u0004\u0012\u00020=0Ç\u0001j\t\u0012\u0004\u0012\u00020=`È\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010Ê\u0001R8\u0010@\u001a\"\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u00010<j\u0010\u0012\u0004\u0012\u00020=\u0012\u0004\u0012\u00020>\u0018\u0001`?8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R#\u0010Ò\u0001\u001a\f\u0012\u0005\u0012\u00030Ï\u0001\u0018\u00010Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÐ\u0001\u0010Ñ\u0001R\u0019\u0010Ô\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÓ\u0001\u0010\u0081\u0001R\u0019\u0010Ö\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u0081\u0001R\u0019\u0010Ø\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b×\u0001\u0010\u0081\u0001R\u0019\u0010Ú\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÙ\u0001\u0010\u0081\u0001R\u0019\u0010Ü\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÛ\u0001\u0010\u0081\u0001R\u0019\u0010Þ\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÝ\u0001\u0010\u0081\u0001R\u0019\u0010à\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bß\u0001\u0010\u0081\u0001R\u0019\u0010â\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bá\u0001\u0010\u0081\u0001R\u0019\u0010ä\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bã\u0001\u0010\u0081\u0001R\u0018\u0010è\u0001\u001a\u00030å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bæ\u0001\u0010ç\u0001R\u0018\u0010ê\u0001\u001a\u00030å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bé\u0001\u0010ç\u0001R\u0018\u0010ì\u0001\u001a\u00030å\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bë\u0001\u0010ç\u0001R+\u0010ï\u0001\u001a\u0014\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u00010í\u0001\u0018\u00010Î\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bî\u0001\u0010Ñ\u0001R(\u0010ò\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bð\u0001\u0010\u0081\u0001\u001a\u0005\bñ\u0001\u0010%R(\u0010õ\u0001\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bó\u0001\u0010\u0081\u0001\u001a\u0005\bô\u0001\u0010%R'\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\t8\u0006@BX\u0086\u000e¢\u0006\u000f\n\u0006\bö\u0001\u0010\u0081\u0001\u001a\u0005\b÷\u0001\u0010%R)\u0010ú\u0001\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\f8\u0006@BX\u0086\u000e¢\u0006\u0010\n\u0006\bø\u0001\u0010ù\u0001\u001a\u0006\bù\u0001\u0010\u009e\u0001R\u001b\u0010ý\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R\u0015\u0010V\u001a\u00020\t8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bþ\u0001\u0010%R\u0014\u0010\u0080\u0002\u001a\u00020\f8F¢\u0006\b\u001a\u0006\bÿ\u0001\u0010\u009e\u0001R\u0013\u0010\r\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0081\u0002\u0010\u009e\u0001R\u0014\u0010\u0083\u0002\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0082\u0002\u0010\u009e\u0001R\u0014\u0010\u0085\u0002\u001a\u00020\f8F¢\u0006\b\u001a\u0006\b\u0084\u0002\u0010\u009e\u0001R\u0015\u0010.\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0002\u0010%¨\u0006\u0088\u0002"}, d2 = {"Lp2/o;", "", "Lp2/l;", "table", "<init>", "(Lp2/l;)V", "value", "P0", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "key", "objectKey", "", "isNode", "aux", "Loq/i0;", "o1", "(ILjava/lang/Object;ZLjava/lang/Object;)V", "parent", "index", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(II)I", "group", "M", "(I)Z", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "Q0", "()V", "v1", "(I)V", "Lp2/h;", "set", "w1", "(ILr0/i0;)V", "G", "X0", "W0", "()I", "endGroup", "firstChild", "W", "(III)V", "D0", "F0", "(II)V", "J", "size", "s0", "t0", "start", "len", "T0", "(II)Z", "U0", "A1", "(ILjava/lang/Object;)V", "previousGapStart", "newGapStart", "t1", "gapStart", "Ljava/util/HashMap;", "Lp2/c;", "Lp2/e;", "Lkotlin/collections/HashMap;", "sourceInformationMap", "R0", "(IILjava/util/HashMap;)Z", "originalLocation", "newLocation", "A0", "i0", "(I)I", "dataIndex", "Q", "", "M0", "([II)I", "O", "address", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "g1", "x1", "([III)V", "K0", "E", "gapLen", "capacity", "R", "(IIII)I", "anchor", "N", "(III)I", "O0", "N0", "w0", "J0", "j0", "k0", "(I)Ljava/lang/Object;", "x0", "n0", "l0", "h0", "r0", "p0", "q0", "H0", "I0", "(Lp2/c;)Ljava/lang/Object;", "L0", "normalClose", "K", "(Z)V", "V0", "s1", ip.a.f96138c, "(Lp2/c;Ljava/lang/Object;)V", "count", "q1", "u1", "(Ljava/lang/Object;)V", "B1", "y1", "z1", "a1", "h1", "Z0", "(IILjava/lang/Object;)Ljava/lang/Object;", "slotIndex", "I", "b1", "()Ljava/lang/Object;", "f1", "(Lp2/c;I)Ljava/lang/Object;", "groupIndex", "e1", "(II)Ljava/lang/Object;", "j1", "i1", "m0", "amount", "A", "Y0", "(Lp2/c;)V", "d1", "F", "T", "m1", "dataKey", "n1", "p1", "l1", "(ILjava/lang/Object;Ljava/lang/Object;)V", ip.a.f96137b, "U", "V", "c1", "S0", "()Z", "Lkotlin/Function2;", "block", "X", "(ILer/p;)V", "offset", "C0", "groupAnchor", "o0", "(Lp2/c;Lp2/c;)Z", "writer", "", "G0", "(Lp2/c;ILp2/o;)Ljava/util/List;", "removeSourceGroup", "B0", "(Lp2/l;IZ)Ljava/util/List;", "E0", "(ILp2/l;I)Ljava/util/List;", "B", "(I)Lp2/c;", "y0", "C", "(Lp2/c;)I", "", "toString", "()Ljava/lang/String;", "k1", "(I)Lp2/e;", "r1", "a", "Lp2/l;", "g0", "()Lp2/l;", "b", "[I", "groups", "", "c", "[Ljava/lang/Object;", "slots", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "d", "Ljava/util/ArrayList;", "anchors", "e", "Ljava/util/HashMap;", "Lr0/j0;", "Lr0/k0;", "f", "Lr0/j0;", "calledByMap", "g", "groupGapStart", "h", "groupGapLen", "i", "currentSlot", "j", "currentSlotEnd", "k", "slotsGapStart", "l", "slotsGapLen", "m", "slotsGapOwner", "n", "insertCount", "o", "nodeCount", "Lm2/o1;", "p", "Lm2/o1;", "startStack", "q", "endStack", "r", "nodeCountStack", "Lr0/q0;", "s", "deferredSlotWrites", "t", "c0", "currentGroup", "u", "d0", "currentGroupEnd", "v", "e0", "w", "Z", "closed", "x", "Lr0/i0;", "pendingRecalculateMarks", "Y", "u0", "isGroupEnd", "v0", "b0", "collectingSourceInformation", "a0", "collectingCalledInformation", "f0", "y", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class SlotWriter {

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f151718z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final l table;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int[] groups;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private Object[] slots;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private ArrayList<c> anchors;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private HashMap<c, e> sourceInformationMap;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private j0<k0> calledByMap;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int groupGapStart;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int groupGapLen;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int currentSlot;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int currentSlotEnd;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private int slotsGapStart;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int slotsGapLen;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int slotsGapOwner;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private int insertCount;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int nodeCount;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private j0<q0<Object>> deferredSlotWrites;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int currentGroup;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int currentGroupEnd;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean closed;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private i0 pendingRecalculateMarks;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final o1 startStack = new o1();

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final o1 endStack = new o1();

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final o1 nodeCountStack = new o1();

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int parent = -1;

    /* JADX INFO: renamed from: p2.o$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JG\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, d2 = {"Lp2/o$a;", "", "<init>", "()V", "Lp2/o;", "fromWriter", "", "fromIndex", "toWriter", "", "updateFromCursor", "updateToCursor", "removeSourceGroup", "", "Lp2/c;", "b", "(Lp2/o;ILp2/o;ZZZ)Ljava/util/List;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final List<c> b(SlotWriter fromWriter, int fromIndex, SlotWriter toWriter, boolean updateFromCursor, boolean updateToCursor, boolean removeSourceGroup) {
            boolean zT0;
            List<c> listN;
            int iL0 = fromWriter.l0(fromIndex);
            int i15 = fromIndex + iL0;
            int iO = fromWriter.O(fromIndex);
            int iO2 = fromWriter.O(i15);
            int i16 = iO2 - iO;
            boolean zL = fromWriter.L(fromIndex);
            toWriter.s0(iL0);
            toWriter.t0(i16, toWriter.getCurrentGroup());
            if (fromWriter.groupGapStart < i15) {
                fromWriter.D0(i15);
            }
            if (fromWriter.slotsGapStart < iO2) {
                fromWriter.F0(iO2, i15);
            }
            int[] iArr = toWriter.groups;
            int currentGroup = toWriter.getCurrentGroup();
            int i17 = currentGroup * 5;
            pq.n.l(fromWriter.groups, iArr, i17, fromIndex * 5, i15 * 5);
            Object[] objArr = toWriter.slots;
            int i18 = toWriter.currentSlot;
            System.arraycopy(fromWriter.slots, iO, objArr, i18, i16);
            int parent = toWriter.getParent();
            iArr[i17 + 2] = parent;
            int i19 = currentGroup - fromIndex;
            int i25 = currentGroup + iL0;
            int iP = i18 - toWriter.P(iArr, currentGroup);
            int i26 = toWriter.slotsGapOwner;
            int i27 = toWriter.slotsGapLen;
            int length = objArr.length;
            int i28 = i26;
            int i29 = currentGroup;
            while (true) {
                zT0 = false;
                if (i29 >= i25) {
                    break;
                }
                if (i29 != currentGroup) {
                    int i35 = (i29 * 5) + 2;
                    iArr[i35] = iArr[i35] + i19;
                }
                int[] iArr2 = iArr;
                int i36 = currentGroup;
                iArr2[(i29 * 5) + 4] = toWriter.R(toWriter.P(iArr, i29) + iP, i28 >= i29 ? toWriter.slotsGapStart : 0, i27, length);
                if (i29 == i28) {
                    i28++;
                }
                i29++;
                currentGroup = i36;
                iArr = iArr2;
            }
            int[] iArr3 = iArr;
            toWriter.slotsGapOwner = i28;
            int iU = n.u(fromWriter.anchors, fromIndex, fromWriter.f0());
            int iU2 = n.u(fromWriter.anchors, i15, fromWriter.f0());
            if (iU < iU2) {
                ArrayList arrayList = fromWriter.anchors;
                ArrayList arrayList2 = new ArrayList(iU2 - iU);
                for (int i37 = iU; i37 < iU2; i37++) {
                    c cVar = (c) arrayList.get(i37);
                    cVar.c(cVar.getLocation() + i19);
                    arrayList2.add(cVar);
                }
                toWriter.anchors.addAll(n.u(toWriter.anchors, toWriter.getCurrentGroup(), toWriter.f0()), arrayList2);
                arrayList.subList(iU, iU2).clear();
                listN = arrayList2;
            } else {
                listN = v.n();
            }
            List<c> list = listN;
            if (!list.isEmpty()) {
                HashMap map = fromWriter.sourceInformationMap;
                HashMap map2 = toWriter.sourceInformationMap;
                if (map != null && map2 != null) {
                    int size = list.size();
                    for (int i38 = 0; i38 < size; i38++) {
                        c cVar2 = listN.get(i38);
                        e eVar = (e) map.get(cVar2);
                        if (eVar != null) {
                            map.remove(cVar2);
                            map2.put(cVar2, eVar);
                        }
                    }
                }
            }
            int parent2 = toWriter.getParent();
            e eVarK1 = toWriter.k1(parent);
            if (eVarK1 != null) {
                int iS = parent2 + 1;
                int currentGroup2 = toWriter.getCurrentGroup();
                int i39 = -1;
                while (iS < currentGroup2) {
                    i39 = iS;
                    iS = n.s(toWriter.groups, iS) + iS;
                }
                eVarK1.g(toWriter, i39, currentGroup2);
            }
            int iL1 = fromWriter.L0(fromIndex);
            if (removeSourceGroup) {
                if (updateFromCursor) {
                    boolean z15 = iL1 >= 0;
                    if (z15) {
                        fromWriter.m1();
                        fromWriter.A(iL1 - fromWriter.getCurrentGroup());
                        fromWriter.m1();
                    }
                    fromWriter.A(fromIndex - fromWriter.getCurrentGroup());
                    boolean zS0 = fromWriter.S0();
                    if (z15) {
                        fromWriter.d1();
                        fromWriter.S();
                        fromWriter.d1();
                        fromWriter.S();
                    }
                    zT0 = zS0;
                } else {
                    zT0 = fromWriter.T0(fromIndex, iL0);
                    fromWriter.U0(iO, i16, fromIndex - 1);
                }
            }
            if (zT0) {
                t.b("Unexpectedly removed anchors");
            }
            int i45 = toWriter.nodeCount;
            int i46 = iArr3[i17 + 1];
            toWriter.nodeCount = i45 + ((1073741824 & i46) == 0 ? i46 & 67108863 : 1);
            if (updateToCursor) {
                toWriter.currentGroup = i25;
                toWriter.currentSlot = i18 + i16;
            }
            if (zL) {
                toWriter.v1(parent);
            }
            return listN;
        }

        static /* synthetic */ List c(Companion companion, SlotWriter slotWriter, int i15, SlotWriter slotWriter2, boolean z15, boolean z16, boolean z17, int i16, Object obj) {
            if ((i16 & 32) != 0) {
                z17 = true;
            }
            return companion.b(slotWriter, i15, slotWriter2, z15, z16, z17);
        }

        private Companion() {
        }
    }

    public SlotWriter(l lVar) {
        this.table = lVar;
        this.groups = lVar.getGroups();
        this.slots = lVar.getSlots();
        this.anchors = lVar.E();
        this.sourceInformationMap = lVar.R();
        this.calledByMap = lVar.G();
        this.groupGapStart = lVar.getGroupsSize();
        this.groupGapLen = (this.groups.length / 5) - lVar.getGroupsSize();
        this.slotsGapStart = lVar.getSlotsSize();
        this.slotsGapLen = this.slots.length - lVar.getSlotsSize();
        this.slotsGapOwner = lVar.getGroupsSize();
        this.currentGroupEnd = lVar.getGroupsSize();
    }

    private final void A0(int originalLocation, int newLocation, int size) {
        c cVar;
        int iC;
        int i15 = size + originalLocation;
        int iF0 = f0();
        int iU = n.u(this.anchors, originalLocation, iF0);
        ArrayList arrayList = new ArrayList();
        if (iU >= 0) {
            while (iU < this.anchors.size() && (iC = C((cVar = this.anchors.get(iU)))) >= originalLocation && iC < i15) {
                arrayList.add(cVar);
                this.anchors.remove(iU);
            }
        }
        int i16 = newLocation - originalLocation;
        int size2 = arrayList.size();
        for (int i17 = 0; i17 < size2; i17++) {
            c cVar2 = (c) arrayList.get(i17);
            int iC2 = C(cVar2) + i16;
            if (iC2 >= this.groupGapStart) {
                cVar2.c(-(iF0 - iC2));
            } else {
                cVar2.c(iC2);
            }
            this.anchors.add(n.u(this.anchors, iC2, iF0), cVar2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    private final void A1(int index, Object value) {
        boolean z15;
        int iI0 = i0(index);
        int[] iArr = this.groups;
        if (iI0 < iArr.length) {
            z15 = (iArr[(iI0 * 5) + 1] & 1073741824) != 0;
        }
        if (!z15) {
            t.b("Updating the node of a group at " + index + " that was not created with as a node group");
        }
        this.slots[Q(K0(this.groups, iI0))] = value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(int index) {
        int i15 = this.groupGapLen;
        int i16 = this.groupGapStart;
        if (i16 != index) {
            if (!this.anchors.isEmpty()) {
                t1(i16, index);
            }
            if (i15 > 0) {
                int[] iArr = this.groups;
                int i17 = index * 5;
                int i18 = i15 * 5;
                int i19 = i16 * 5;
                if (index < i16) {
                    pq.n.l(iArr, iArr, i18 + i17, i17, i19);
                } else {
                    pq.n.l(iArr, iArr, i19, i19 + i18, i17 + i18);
                }
            }
            if (index < i16) {
                i16 = index + i15;
            }
            int iY = Y();
            if (!(i16 < iY)) {
                t.b("Check failed");
            }
            while (i16 < iY) {
                int i25 = (i16 * 5) + 2;
                int i26 = this.groups[i25];
                int iO0 = O0(N0(i26), index);
                if (iO0 != i26) {
                    this.groups[i25] = iO0;
                }
                i16++;
                if (i16 == index) {
                    i16 += i15;
                }
            }
        }
        this.groupGapStart = index;
    }

    private final int E(int[] iArr, int i15) {
        return P(iArr, i15) + Integer.bitCount(iArr[(i15 * 5) + 1] >> 29);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F0(int index, int group) {
        int i15 = this.slotsGapLen;
        int i16 = this.slotsGapStart;
        int i17 = this.slotsGapOwner;
        if (i16 != index) {
            Object[] objArr = this.slots;
            if (index < i16) {
                System.arraycopy(objArr, index, objArr, index + i15, i16 - index);
            } else {
                int i18 = i16 + i15;
                System.arraycopy(objArr, i18, objArr, i16, (index + i15) - i18);
            }
        }
        int iMin = Math.min(group + 1, f0());
        if (i17 != iMin) {
            int length = this.slots.length - i15;
            if (iMin < i17) {
                int iI0 = i0(iMin);
                int iI1 = i0(i17);
                int i19 = this.groupGapStart;
                while (iI0 < iI1) {
                    int i25 = (iI0 * 5) + 4;
                    int i26 = this.groups[i25];
                    if (!(i26 >= 0)) {
                        t.b("Unexpected anchor value, expected a positive anchor");
                    }
                    this.groups[i25] = -((length - i26) + 1);
                    iI0++;
                    if (iI0 == i19) {
                        iI0 += this.groupGapLen;
                    }
                }
            } else {
                int iI2 = i0(i17);
                int iI3 = i0(iMin);
                while (iI2 < iI3) {
                    int i27 = (iI2 * 5) + 4;
                    int i28 = this.groups[i27];
                    if (!(i28 < 0)) {
                        t.b("Unexpected anchor value, expected a negative anchor");
                    }
                    this.groups[i27] = i28 + length + 1;
                    iI2++;
                    if (iI2 == this.groupGapStart) {
                        iI2 += this.groupGapLen;
                    }
                }
            }
            this.slotsGapOwner = iMin;
        }
        this.slotsGapStart = index;
    }

    private final boolean G(int group) {
        int iL0 = group + 1;
        int iL1 = group + l0(group);
        while (iL0 < iL1) {
            if ((this.groups[(i0(iL0) * 5) + 1] & 201326592) != 0) {
                return true;
            }
            iL0 += l0(iL0);
        }
        return false;
    }

    private final int H(int parent, int index) {
        int iL0 = l0(parent) + parent;
        int iS = parent + 1;
        int i15 = 0;
        while (iS < iL0 && i15 < index) {
            int iI0 = i0(iS);
            iS += n.s(this.groups, iI0);
            if (iS < iL0 && (this.groups[(iI0 * 5) + 1] & PKIFailureInfo.duplicateCertReq) == 0) {
                i15++;
            }
        }
        return iS;
    }

    private final void J() {
        int i15 = this.slotsGapStart;
        pq.n.z(this.slots, null, i15, this.slotsGapLen + i15);
    }

    private final int K0(int[] iArr, int i15) {
        return P(iArr, i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean L(int group) {
        return group >= 0 && (this.groups[(i0(group) * 5) + 1] & 201326592) != 0;
    }

    private final boolean M(int group) {
        return group >= 0 && (this.groups[(i0(group) * 5) + 1] & 67108864) != 0;
    }

    private final int M0(int[] iArr, int i15) {
        return N0(iArr[(i0(i15) * 5) + 2]);
    }

    private final int N(int anchor, int gapLen, int capacity) {
        return anchor < 0 ? (capacity - gapLen) + anchor + 1 : anchor;
    }

    private final int N0(int index) {
        return index > -2 ? index : (f0() + index) - (-2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int O(int index) {
        return P(this.groups, i0(index));
    }

    private final int O0(int index, int gapStart) {
        return index < gapStart ? index : -((f0() - index) + 2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int P(int[] iArr, int i15) {
        return i15 >= Y() ? this.slots.length - this.slotsGapLen : N(iArr[(i15 * 5) + 4], this.slotsGapLen, this.slots.length);
    }

    private final Object P0(Object value) {
        Object objB1 = b1();
        a1(value);
        return objB1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int Q(int dataIndex) {
        return dataIndex + (this.slotsGapLen * (dataIndex < this.slotsGapStart ? 0 : 1));
    }

    private final void Q0() {
        i0 i0Var = this.pendingRecalculateMarks;
        if (i0Var != null) {
            while (h.d(i0Var)) {
                w1(h.f(i0Var), i0Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int R(int index, int gapStart, int gapLen, int capacity) {
        return index > gapStart ? -(((capacity - gapLen) - index) + 1) : index;
    }

    private final boolean R0(int gapStart, int size, HashMap<c, e> sourceInformationMap) {
        int i15 = size + gapStart;
        int iU = n.u(this.anchors, i15, Y() - this.groupGapLen);
        if (iU >= this.anchors.size()) {
            iU--;
        }
        int i16 = iU + 1;
        int i17 = 0;
        while (iU >= 0) {
            c cVar = this.anchors.get(iU);
            int iC = C(cVar);
            if (iC < gapStart) {
                break;
            }
            if (iC < i15) {
                cVar.c(PKIFailureInfo.systemUnavail);
                if (sourceInformationMap != null) {
                    sourceInformationMap.remove(cVar);
                }
                if (i17 == 0) {
                    i17 = iU + 1;
                }
                i16 = iU;
            }
            iU--;
        }
        boolean z15 = i16 < i17;
        if (z15) {
            this.anchors.subList(i16, i17).clear();
        }
        return z15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean T0(int start, int len) {
        boolean zR0 = false;
        if (len > 0) {
            ArrayList<c> arrayList = this.anchors;
            D0(start);
            zR0 = arrayList.isEmpty() ? false : R0(start, len, this.sourceInformationMap);
            this.groupGapStart = start;
            this.groupGapLen += len;
            int i15 = this.slotsGapOwner;
            if (i15 > start) {
                this.slotsGapOwner = Math.max(start, i15 - len);
            }
            int i16 = this.currentGroupEnd;
            if (i16 >= this.groupGapStart) {
                this.currentGroupEnd = i16 - len;
            }
            int i17 = this.parent;
            if (M(i17)) {
                v1(i17);
            }
        }
        return zR0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(int start, int len, int group) {
        if (len > 0) {
            int i15 = this.slotsGapLen;
            int i16 = start + len;
            F0(i16, group);
            this.slotsGapStart = start;
            this.slotsGapLen = i15 + len;
            pq.n.z(this.slots, null, start, i16);
            int i17 = this.currentSlotEnd;
            if (i17 >= start) {
                this.currentSlotEnd = i17 - len;
            }
        }
    }

    private final void W(int parent, int endGroup, int firstChild) {
        int iO0 = O0(parent, this.groupGapStart);
        while (firstChild < endGroup) {
            this.groups[(i0(firstChild) * 5) + 2] = iO0;
            int iS = n.s(this.groups, i0(firstChild)) + firstChild;
            W(firstChild, iS, firstChild + 1);
            firstChild = iS;
        }
    }

    private final int W0() {
        int iY = (Y() - this.groupGapLen) - this.endStack.g();
        this.currentGroupEnd = iY;
        return iY;
    }

    private final void X0() {
        this.endStack.i((Y() - this.groupGapLen) - this.currentGroupEnd);
    }

    private final int Y() {
        return this.groups.length / 5;
    }

    private final int g1(int[] iArr, int i15) {
        return i15 >= Y() ? this.slots.length - this.slotsGapLen : N(n.x(iArr, i15), this.slotsGapLen, this.slots.length);
    }

    private final int i0(int index) {
        return index + (this.groupGapLen * (index < this.groupGapStart ? 0 : 1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0 */
    /* JADX WARN: Type inference failed for: r12v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r13v0 */
    /* JADX WARN: Type inference failed for: r13v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r13v2 */
    private final void o1(int key, Object objectKey, boolean isNode, Object aux) {
        int iS;
        e eVarK1;
        int i15 = this.parent;
        Object[] objArr = this.insertCount > 0;
        this.nodeCountStack.i(this.nodeCount);
        if (objArr == true) {
            int i16 = this.currentGroup;
            int iP = P(this.groups, i0(i16));
            s0(1);
            this.currentSlot = iP;
            this.currentSlotEnd = iP;
            int iI0 = i0(i16);
            p076m2.r.Companion companion = p076m2.r.INSTANCE;
            ?? r15 = objectKey != companion.a() ? 1 : 0;
            ?? r16 = (isNode || aux == companion.a()) ? 0 : 1;
            int iR = R(iP, this.slotsGapStart, this.slotsGapLen, this.slots.length);
            if (iR >= 0 && this.slotsGapOwner < i16) {
                iR = -(((this.slots.length - this.slotsGapLen) - iR) + 1);
            }
            n.t(this.groups, iI0, key, isNode, r15, r16, this.parent, iR);
            int i17 = (isNode ? 1 : 0) + r15 + r16;
            if (i17 > 0) {
                t0(i17, i16);
                Object[] objArr2 = this.slots;
                int i18 = this.currentSlot;
                if (isNode) {
                    objArr2[i18] = aux;
                    i18++;
                }
                if (r15 != 0) {
                    objArr2[i18] = objectKey;
                    i18++;
                }
                if (r16 != 0) {
                    objArr2[i18] = aux;
                    i18++;
                }
                this.currentSlot = i18;
            }
            this.nodeCount = 0;
            iS = i16 + 1;
            this.parent = i16;
            this.currentGroup = iS;
            if (i15 >= 0 && (eVarK1 = k1(i15)) != null) {
                eVarK1.l(this, i16);
            }
        } else {
            this.startStack.i(i15);
            X0();
            int i19 = this.currentGroup;
            int iI1 = i0(i19);
            if (!fr.t.c(aux, p076m2.r.INSTANCE.a())) {
                if (isNode) {
                    y1(aux);
                } else {
                    u1(aux);
                }
            }
            this.currentSlot = g1(this.groups, iI1);
            this.currentSlotEnd = P(this.groups, i0(this.currentGroup + 1));
            int[] iArr = this.groups;
            this.nodeCount = iArr[(iI1 * 5) + 1] & 67108863;
            this.parent = i19;
            this.currentGroup = i19 + 1;
            iS = i19 + n.s(iArr, iI1);
        }
        this.currentGroupEnd = iS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(int size) {
        if (size > 0) {
            int i15 = this.currentGroup;
            D0(i15);
            int i16 = this.groupGapStart;
            int i17 = this.groupGapLen;
            int[] iArr = this.groups;
            int length = iArr.length / 5;
            int i18 = length - i17;
            if (i17 < size) {
                int iMax = Math.max(Math.max(length * 2, i18 + size), 32);
                int[] iArr2 = new int[iMax * 5];
                int i19 = iMax - i18;
                pq.n.l(iArr, iArr2, 0, 0, i16 * 5);
                pq.n.l(iArr, iArr2, (i16 + i19) * 5, (i17 + i16) * 5, length * 5);
                this.groups = iArr2;
                i17 = i19;
            }
            int i25 = this.currentGroupEnd;
            if (i25 >= i16) {
                this.currentGroupEnd = i25 + size;
            }
            int i26 = i16 + size;
            this.groupGapStart = i26;
            this.groupGapLen = i17 - size;
            int iR = R(i18 > 0 ? O(i15 + size) : 0, this.slotsGapOwner >= i16 ? this.slotsGapStart : 0, this.slotsGapLen, this.slots.length);
            for (int i27 = i16; i27 < i26; i27++) {
                this.groups[(i27 * 5) + 4] = iR;
            }
            int i28 = this.slotsGapOwner;
            if (i28 >= i16) {
                this.slotsGapOwner = i28 + size;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void t0(int size, int group) {
        if (size > 0) {
            F0(this.currentSlot, group);
            int i15 = this.slotsGapStart;
            int i16 = this.slotsGapLen;
            if (i16 < size) {
                Object[] objArr = this.slots;
                int length = objArr.length;
                int i17 = length - i16;
                int iMax = Math.max(Math.max(length * 2, i17 + size), 32);
                Object[] objArr2 = new Object[iMax];
                for (int i18 = 0; i18 < iMax; i18++) {
                    objArr2[i18] = null;
                }
                int i19 = iMax - i17;
                int i25 = i16 + i15;
                System.arraycopy(objArr, 0, objArr2, 0, i15);
                System.arraycopy(objArr, i25, objArr2, i15 + i19, length - i25);
                this.slots = objArr2;
                i16 = i19;
            }
            int i26 = this.currentSlotEnd;
            if (i26 >= i15) {
                this.currentSlotEnd = i26 + size;
            }
            this.slotsGapStart = i15 + size;
            this.slotsGapLen = i16 - size;
        }
    }

    private final void t1(int previousGapStart, int newGapStart) {
        c cVar;
        int iB;
        c cVar2;
        int iB2;
        int i15;
        int iY = Y() - this.groupGapLen;
        if (previousGapStart >= newGapStart) {
            for (int iU = n.u(this.anchors, newGapStart, iY); iU < this.anchors.size() && (iB = (cVar = this.anchors.get(iU)).getLocation()) >= 0; iU++) {
                cVar.c(-(iY - iB));
            }
            return;
        }
        for (int iU2 = n.u(this.anchors, previousGapStart, iY); iU2 < this.anchors.size() && (iB2 = (cVar2 = this.anchors.get(iU2)).getLocation()) < 0 && (i15 = iB2 + iY) < newGapStart; iU2++) {
            cVar2.c(i15);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void v1(int group) {
        if (group >= 0) {
            i0 i0VarC = this.pendingRecalculateMarks;
            if (i0VarC == null) {
                i0VarC = h.c(null, 1, null);
                this.pendingRecalculateMarks = i0VarC;
            }
            h.a(i0VarC, group);
        }
    }

    private final void w1(int group, i0 set) {
        int iI0 = i0(group);
        boolean zG = G(group);
        int[] iArr = this.groups;
        if (((iArr[(iI0 * 5) + 1] & 67108864) != 0) != zG) {
            n.z(iArr, iI0, zG);
            int iL0 = L0(group);
            if (iL0 >= 0) {
                h.a(set, iL0);
            }
        }
    }

    private final void x1(int[] iArr, int i15, int i16) {
        iArr[(i15 * 5) + 4] = R(i16, this.slotsGapStart, this.slotsGapLen, this.slots.length);
    }

    public static /* synthetic */ void z0(SlotWriter slotWriter, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = slotWriter.parent;
        }
        slotWriter.y0(i15);
    }

    public final void A(int amount) {
        boolean z15 = false;
        if (!(amount >= 0)) {
            t.b("Cannot seek backwards");
        }
        if (!(this.insertCount <= 0)) {
            w3.b("Cannot call seek() while inserting");
        }
        if (amount == 0) {
            return;
        }
        int i15 = this.currentGroup + amount;
        if (i15 >= this.parent && i15 <= this.currentGroupEnd) {
            z15 = true;
        }
        if (!z15) {
            t.b("Cannot seek outside the current group (" + this.parent + '-' + this.currentGroupEnd + ')');
        }
        this.currentGroup = i15;
        int iP = P(this.groups, i0(i15));
        this.currentSlot = iP;
        this.currentSlotEnd = iP;
    }

    public final c B(int index) {
        ArrayList<c> arrayList = this.anchors;
        int iW = n.w(arrayList, index, f0());
        if (iW >= 0) {
            return arrayList.get(iW);
        }
        if (index > this.groupGapStart) {
            index = -(f0() - index);
        }
        c cVar = new c(index);
        arrayList.add(-(iW + 1), cVar);
        return cVar;
    }

    public final List<c> B0(l table, int index, boolean removeSourceGroup) {
        boolean z15 = false;
        if (!(this.insertCount > 0 ? true : z15)) {
            t.b("Check failed");
        }
        if (index != 0 || this.currentGroup != 0 || this.table.getGroupsSize() != 0 || n.s(table.getGroups(), index) != table.getGroupsSize()) {
            SlotWriter slotWriterV = table.V();
            try {
                return INSTANCE.b(slotWriterV, index, this, true, true, removeSourceGroup);
            } finally {
                slotWriterV.K(z15);
            }
        }
        int[] iArr = this.groups;
        Object[] objArr = this.slots;
        ArrayList<c> arrayList = this.anchors;
        HashMap<c, e> map = this.sourceInformationMap;
        j0<k0> j0Var = this.calledByMap;
        int[] iArrL = table.getGroups();
        int iM = table.getGroupsSize();
        Object[] objArrP = table.getSlots();
        int iQ = table.getSlotsSize();
        HashMap<c, e> mapR = table.R();
        j0<k0> j0VarG = table.G();
        this.groups = iArrL;
        this.slots = objArrP;
        this.anchors = table.E();
        this.groupGapStart = iM;
        this.groupGapLen = (iArrL.length / 5) - iM;
        this.slotsGapStart = iQ;
        this.slotsGapLen = objArrP.length - iQ;
        this.slotsGapOwner = iM;
        this.sourceInformationMap = mapR;
        this.calledByMap = j0VarG;
        table.X(iArr, 0, objArr, 0, arrayList, map, j0Var);
        return this.anchors;
    }

    public final void B1() {
        this.sourceInformationMap = this.table.R();
        this.calledByMap = this.table.G();
    }

    public final int C(c anchor) {
        int iB = anchor.getLocation();
        return iB < 0 ? f0() + iB : iB;
    }

    public final void C0(int offset) {
        boolean z15 = true;
        if (!(this.insertCount == 0)) {
            t.b("Cannot move a group while inserting");
        }
        if (!(offset >= 0)) {
            t.b("Parameter offset is out of bounds");
        }
        if (offset == 0) {
            return;
        }
        int i15 = this.currentGroup;
        int i16 = this.parent;
        int i17 = this.currentGroupEnd;
        int iS = i15;
        for (int i18 = offset; i18 > 0; i18--) {
            iS += n.s(this.groups, i0(iS));
            if (!(iS <= i17)) {
                t.b("Parameter offset is out of bounds");
            }
        }
        int iS2 = n.s(this.groups, i0(iS));
        int iP = P(this.groups, i0(this.currentGroup));
        int iP2 = P(this.groups, i0(iS));
        int i19 = iS + iS2;
        int iP3 = P(this.groups, i0(i19));
        int i25 = iP3 - iP2;
        t0(i25, Math.max(this.currentGroup - 1, 0));
        s0(iS2);
        int[] iArr = this.groups;
        int iI0 = i0(i19) * 5;
        pq.n.l(iArr, iArr, i0(i15) * 5, iI0, (iS2 * 5) + iI0);
        if (i25 > 0) {
            Object[] objArr = this.slots;
            int iQ = Q(iP2 + i25);
            System.arraycopy(objArr, iQ, objArr, iP, Q(iP3 + i25) - iQ);
        }
        int i26 = iP2 + i25;
        int i27 = i26 - iP;
        int i28 = this.slotsGapStart;
        int i29 = this.slotsGapLen;
        int length = this.slots.length;
        int i35 = this.slotsGapOwner;
        int i36 = i15 + iS2;
        int i37 = i15;
        while (i37 < i36) {
            boolean z16 = z15;
            int iI1 = i0(i37);
            int i38 = i37;
            int i39 = i27;
            x1(iArr, iI1, R(P(iArr, iI1) - i27, i35 < iI1 ? 0 : i28, i29, length));
            i37 = i38 + 1;
            z15 = z16;
            i27 = i39;
        }
        A0(i19, i15, iS2);
        if (T0(i19, iS2)) {
            t.b("Unexpectedly removed anchors");
        }
        W(i16, this.currentGroupEnd, i15);
        if (i25 > 0) {
            U0(i26, i25, i19 - 1);
        }
    }

    public final void D(c anchor, Object value) {
        if (!(this.insertCount == 0)) {
            t.b("Can only append a slot if not current inserting");
        }
        int i15 = this.currentSlot;
        int i16 = this.currentSlotEnd;
        int iC = C(anchor);
        int iP = P(this.groups, i0(iC + 1));
        this.currentSlot = iP;
        this.currentSlotEnd = iP;
        t0(1, iC);
        if (i15 >= iP) {
            i15++;
            i16++;
        }
        this.slots[iP] = value;
        this.currentSlot = i15;
        this.currentSlotEnd = i16;
    }

    public final List<c> E0(int offset, l table, int index) {
        if (!(this.insertCount <= 0 && l0(this.currentGroup + offset) == 1)) {
            t.b("Check failed");
        }
        int i15 = this.currentGroup;
        int i16 = this.currentSlot;
        int i17 = this.currentSlotEnd;
        A(offset);
        m1();
        F();
        SlotWriter slotWriterV = table.V();
        try {
            List<c> listC = Companion.c(INSTANCE, slotWriterV, index, this, false, true, false, 32, null);
            slotWriterV.K(true);
            T();
            S();
            this.currentGroup = i15;
            this.currentSlot = i16;
            this.currentSlotEnd = i17;
            return listC;
        } catch (Throwable th4) {
            slotWriterV.K(false);
            throw th4;
        }
    }

    public final void F() {
        int i15 = this.insertCount;
        this.insertCount = i15 + 1;
        if (i15 == 0) {
            X0();
        }
    }

    public final List<c> G0(c anchor, int offset, SlotWriter writer) {
        if (!(writer.insertCount > 0)) {
            t.b("Check failed");
        }
        if (!(this.insertCount == 0)) {
            t.b("Check failed");
        }
        if (!anchor.a()) {
            t.b("Check failed");
        }
        int iC = C(anchor) + offset;
        int i15 = this.currentGroup;
        if (!(i15 <= iC && iC < this.currentGroupEnd)) {
            t.b("Check failed");
        }
        int iL0 = L0(iC);
        int iL1 = l0(iC);
        int iJ0 = w0(iC) ? 1 : J0(iC);
        List<c> listC = Companion.c(INSTANCE, this, iC, writer, false, false, false, 32, null);
        v1(iL0);
        boolean z15 = iJ0 > 0;
        while (iL0 >= i15) {
            int iI0 = i0(iL0);
            int[] iArr = this.groups;
            n.A(iArr, iI0, n.s(iArr, iI0) - iL1);
            if (z15) {
                int[] iArr2 = this.groups;
                int i16 = iArr2[(iI0 * 5) + 1];
                if ((1073741824 & i16) != 0) {
                    z15 = false;
                } else {
                    n.C(iArr2, iI0, (i16 & 67108863) - iJ0);
                }
            }
            iL0 = L0(iL0);
        }
        if (z15) {
            if (!(this.nodeCount >= iJ0)) {
                t.b("Check failed");
            }
            this.nodeCount -= iJ0;
        }
        return listC;
    }

    public final Object H0(int index) {
        int iI0 = i0(index);
        int[] iArr = this.groups;
        if ((iArr[(iI0 * 5) + 1] & 1073741824) != 0) {
            return this.slots[Q(K0(iArr, iI0))];
        }
        return null;
    }

    public final Object I(int slotIndex) {
        int iQ = Q(slotIndex);
        Object[] objArr = this.slots;
        Object obj = objArr[iQ];
        objArr[iQ] = p076m2.r.INSTANCE.a();
        return obj;
    }

    public final Object I0(c anchor) {
        return H0(anchor.e(this));
    }

    public final int J0(int index) {
        return this.groups[(i0(index) * 5) + 1] & 67108863;
    }

    public final void K(boolean normalClose) {
        this.closed = true;
        if (normalClose && this.startStack.tos == 0) {
            D0(f0());
            F0(this.slots.length - this.slotsGapLen, this.groupGapStart);
            J();
            Q0();
        }
        this.table.x(this, this.groups, this.groupGapStart, this.slots, this.slotsGapStart, this.anchors, this.sourceInformationMap, this.calledByMap);
    }

    public final int L0(int index) {
        return M0(this.groups, index);
    }

    public final int S() {
        q0<Object> q0VarB;
        boolean z15 = this.insertCount > 0;
        int i15 = this.currentGroup;
        int i16 = this.currentGroupEnd;
        int i17 = this.parent;
        int iI0 = i0(i17);
        int i18 = this.nodeCount;
        int i19 = i15 - i17;
        int i25 = (iI0 * 5) + 1;
        boolean z16 = (this.groups[i25] & 1073741824) != 0;
        if (z15) {
            j0<q0<Object>> j0Var = this.deferredSlotWrites;
            if (j0Var != null && (q0VarB = j0Var.b(i17)) != null) {
                Object[] objArr = q0VarB.content;
                int i26 = q0VarB._size;
                for (int i27 = 0; i27 < i26; i27++) {
                    P0(objArr[i27]);
                }
                j0Var.o(i17);
            }
            n.A(this.groups, iI0, i19);
            n.C(this.groups, iI0, i18);
            this.nodeCount = this.nodeCountStack.g() + (z16 ? 1 : i18);
            int iM0 = M0(this.groups, i17);
            this.parent = iM0;
            int iF0 = iM0 < 0 ? f0() : i0(iM0 + 1);
            int iP = iF0 >= 0 ? P(this.groups, iF0) : 0;
            this.currentSlot = iP;
            this.currentSlotEnd = iP;
            return i18;
        }
        if (!(i15 == i16)) {
            t.b("Expected to be at the end of a group");
        }
        int iS = n.s(this.groups, iI0);
        int[] iArr = this.groups;
        int i28 = iArr[i25] & 67108863;
        n.A(iArr, iI0, i19);
        n.C(this.groups, iI0, i18);
        int iG = this.startStack.g();
        W0();
        this.parent = iG;
        int iM1 = M0(this.groups, i17);
        int iG2 = this.nodeCountStack.g();
        this.nodeCount = iG2;
        if (iM1 == iG) {
            this.nodeCount = iG2 + (z16 ? 0 : i18 - i28);
            return i18;
        }
        int i29 = i19 - iS;
        int i35 = z16 ? 0 : i18 - i28;
        if (i29 != 0 || i35 != 0) {
            while (iM1 != 0 && iM1 != iG && (i35 != 0 || i29 != 0)) {
                int iI1 = i0(iM1);
                if (i29 != 0) {
                    n.A(this.groups, iI1, n.s(this.groups, iI1) + i29);
                }
                if (i35 != 0) {
                    int[] iArr2 = this.groups;
                    n.C(iArr2, iI1, (iArr2[(iI1 * 5) + 1] & 67108863) + i35);
                }
                int[] iArr3 = this.groups;
                if ((iArr3[(iI1 * 5) + 1] & 1073741824) != 0) {
                    i35 = 0;
                }
                iM1 = M0(iArr3, iM1);
            }
        }
        this.nodeCount += i35;
        return i18;
    }

    public final boolean S0() {
        c cVarR1;
        if (!(this.insertCount == 0)) {
            t.b("Cannot remove group while inserting");
        }
        int i15 = this.currentGroup;
        int i16 = this.currentSlot;
        int iP = P(this.groups, i0(i15));
        int iC1 = c1();
        e eVarK1 = k1(this.parent);
        if (eVarK1 != null && (cVarR1 = r1(i15)) != null) {
            eVarK1.j(cVarR1);
        }
        i0 i0Var = this.pendingRecalculateMarks;
        if (i0Var != null) {
            while (h.d(i0Var) && h.e(i0Var) >= i15) {
                h.f(i0Var);
            }
        }
        boolean zT0 = T0(i15, this.currentGroup - i15);
        U0(iP, this.currentSlot - iP, i15 - 1);
        this.currentGroup = i15;
        this.currentSlot = i16;
        this.nodeCount -= iC1;
        return zT0;
    }

    public final void T() {
        if (!(this.insertCount > 0)) {
            w3.b("Unbalanced begin/end insert");
        }
        int i15 = this.insertCount - 1;
        this.insertCount = i15;
        if (i15 == 0) {
            if (!(this.nodeCountStack.tos == this.startStack.tos)) {
                t.b("startGroup/endGroup mismatch while inserting");
            }
            W0();
        }
    }

    public final void U(int index) {
        boolean z15 = false;
        if (!(this.insertCount <= 0)) {
            t.b("Cannot call ensureStarted() while inserting");
        }
        int i15 = this.parent;
        if (i15 != index) {
            if (index >= i15 && index < this.currentGroupEnd) {
                z15 = true;
            }
            if (!z15) {
                t.b("Started group at " + index + " must be a subgroup of the group at " + i15);
            }
            int i16 = this.currentGroup;
            int i17 = this.currentSlot;
            int i18 = this.currentSlotEnd;
            this.currentGroup = index;
            m1();
            this.currentGroup = i16;
            this.currentSlot = i17;
            this.currentSlotEnd = i18;
        }
    }

    public final void V(c anchor) {
        U(anchor.e(this));
    }

    public final void V0() {
        if (!(this.insertCount == 0)) {
            t.b("Cannot reset when inserting");
        }
        Q0();
        this.currentGroup = 0;
        this.currentGroupEnd = Y() - this.groupGapLen;
        this.currentSlot = 0;
        this.currentSlotEnd = 0;
        this.nodeCount = 0;
    }

    public final void X(int group, er.p<? super Integer, Object, oq.i0> block) {
        int i15;
        int i16;
        int afterGroupIndex;
        int iL0 = L0(group);
        int iF0 = f0();
        int iL1 = l0(group) + group;
        fr.k kVar = null;
        int i17 = group;
        k0 k0VarB = null;
        i0 i0Var = null;
        while (i17 < iL1) {
            int iO = O(i17);
            int i18 = i17 + 1;
            int iO2 = O(i18);
            while (true) {
                i15 = 0;
                if (iO >= iO2) {
                    break;
                }
                Object obj = this.slots[Q(iO)];
                if (!(obj instanceof v4) || (afterGroupIndex = h1.q((v4) obj).getAfterGroupIndex()) < 0) {
                    block.B(Integer.valueOf(iO), obj);
                } else {
                    int iH = H(i17, afterGroupIndex);
                    if (k0VarB == null) {
                        k0VarB = r0.t.b();
                    }
                    if (i0Var == null) {
                        i0Var = new i0(i15, 1, kVar);
                    }
                    k0VarB.h(iH);
                    i0Var.k(iH);
                    i0Var.k(iO);
                }
                iO++;
            }
            int iL2 = i18 < iF0 ? L0(i18) : -1;
            if (iL2 != i17) {
                while (true) {
                    if (i0Var == null || k0VarB == null || !k0VarB.v(i17)) {
                        i16 = iF0;
                    } else {
                        int i19 = i0Var._size;
                        int i25 = i19 / 2;
                        int i26 = i15;
                        int i27 = i26;
                        while (i27 < i25) {
                            int i28 = i27 * 2;
                            int i29 = iF0;
                            int iE = i0Var.e(i28);
                            if (iE == i17) {
                                int iE2 = i0Var.e(i28 + 1);
                                block.B(Integer.valueOf(iE2), this.slots[Q(iE2)]);
                            } else if (i28 != i26) {
                                int i35 = i26 + 1;
                                i0Var.r(i26, iE);
                                i26 += 2;
                                i0Var.r(i35, i0Var.e(i28 + 1));
                            } else {
                                i26 += 2;
                            }
                            i27++;
                            block = block;
                            iF0 = i29;
                        }
                        i16 = iF0;
                        if (i26 != i19) {
                            i0Var.q(i26, i19);
                        }
                    }
                    if (i17 == group || iL0 == iL2) {
                        break;
                    }
                    i17 = iL0;
                    iF0 = i16;
                    i15 = 0;
                    iL0 = L0(iL0);
                    block = block;
                }
            } else {
                i16 = iF0;
            }
            iL0 = iL2;
            i17 = i18;
            iF0 = i16;
            kVar = null;
        }
    }

    public final void Y0(c anchor) {
        A(anchor.e(this) - this.currentGroup);
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getClosed() {
        return this.closed;
    }

    public final Object Z0(int group, int index, Object value) {
        int iQ = Q(h1(group, index));
        Object[] objArr = this.slots;
        Object obj = objArr[iQ];
        objArr[iQ] = value;
        return obj;
    }

    public final boolean a0() {
        return this.calledByMap != null;
    }

    public final void a1(Object value) {
        if (!(this.currentSlot <= this.currentSlotEnd)) {
            t.b("Writing to an invalid slot");
        }
        this.slots[Q(this.currentSlot - 1)] = value;
    }

    public final boolean b0() {
        return this.sourceInformationMap != null;
    }

    public final Object b1() {
        if (this.insertCount > 0) {
            t0(1, this.parent);
        }
        Object[] objArr = this.slots;
        int i15 = this.currentSlot;
        this.currentSlot = i15 + 1;
        return objArr[Q(i15)];
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final int getCurrentGroup() {
        return this.currentGroup;
    }

    public final int c1() {
        int iI0 = i0(this.currentGroup);
        int iS = this.currentGroup + n.s(this.groups, iI0);
        this.currentGroup = iS;
        this.currentSlot = P(this.groups, i0(iS));
        int i15 = this.groups[(iI0 * 5) + 1];
        if ((1073741824 & i15) != 0) {
            return 1;
        }
        return i15 & 67108863;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final int getCurrentGroupEnd() {
        return this.currentGroupEnd;
    }

    public final void d1() {
        int i15 = this.currentGroupEnd;
        this.currentGroup = i15;
        this.currentSlot = P(this.groups, i0(i15));
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final int getParent() {
        return this.parent;
    }

    public final Object e1(int groupIndex, int index) {
        int iG1 = g1(this.groups, i0(groupIndex));
        int iP = P(this.groups, i0(groupIndex + 1));
        int i15 = index + iG1;
        if (iG1 > i15 || i15 >= iP) {
            return p076m2.r.INSTANCE.a();
        }
        return this.slots[Q(i15)];
    }

    public final int f0() {
        return Y() - this.groupGapLen;
    }

    public final Object f1(c anchor, int index) {
        return e1(C(anchor), index);
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final l getTable() {
        return this.table;
    }

    public final Object h0(int index) {
        int iI0 = i0(index);
        int[] iArr = this.groups;
        return (iArr[(iI0 * 5) + 1] & 268435456) != 0 ? this.slots[E(iArr, iI0)] : p076m2.r.INSTANCE.a();
    }

    public final int h1(int group, int index) {
        int iG1 = g1(this.groups, i0(group));
        int i15 = iG1 + index;
        if (!(i15 >= iG1 && i15 < P(this.groups, i0(group + 1)))) {
            t.b("Write to an invalid slot index " + index + " for group " + group);
        }
        return i15;
    }

    public final int i1(int groupIndex) {
        return P(this.groups, i0(groupIndex + 1));
    }

    public final int j0(int index) {
        return this.groups[i0(index) * 5];
    }

    public final int j1(int groupIndex) {
        return g1(this.groups, i0(groupIndex));
    }

    public final Object k0(int index) {
        int iI0 = i0(index);
        int[] iArr = this.groups;
        if ((iArr[(iI0 * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0) {
            return this.slots[n.v(iArr, iI0)];
        }
        return null;
    }

    public final e k1(int group) {
        c cVarR1;
        HashMap<c, e> map = this.sourceInformationMap;
        if (map == null || (cVarR1 = r1(group)) == null) {
            return null;
        }
        return map.get(cVarR1);
    }

    public final int l0(int index) {
        return n.s(this.groups, i0(index));
    }

    public final void l1(int key, Object objectKey, Object aux) {
        o1(key, objectKey, false, aux);
    }

    public final int m0(int group) {
        q0<Object> q0VarB;
        int iJ1 = this.currentSlot - j1(group);
        j0<q0<Object>> j0Var = this.deferredSlotWrites;
        return iJ1 + ((j0Var == null || (q0VarB = j0Var.b(group)) == null) ? 0 : q0VarB.get_size());
    }

    public final void m1() {
        if (!(this.insertCount == 0)) {
            t.b("Key must be supplied when inserting");
        }
        p076m2.r.Companion companion = p076m2.r.INSTANCE;
        o1(0, companion.a(), false, companion.a());
    }

    public final boolean n0(int index) {
        return (this.groups[(i0(index) * 5) + 1] & PKIFailureInfo.duplicateCertReq) != 0;
    }

    public final void n1(int key, Object dataKey) {
        o1(key, dataKey, false, p076m2.r.INSTANCE.a());
    }

    public final boolean o0(c groupAnchor, c anchor) {
        int iC = C(groupAnchor);
        int iS = n.s(this.groups, iC) + iC;
        int iB = anchor.getLocation();
        return iC <= iB && iB < iS;
    }

    public final boolean p0(int index) {
        return q0(index, this.currentGroup);
    }

    public final void p1(int key, Object objectKey) {
        o1(key, objectKey, true, p076m2.r.INSTANCE.a());
    }

    public final boolean q0(int index, int group) {
        int iB;
        int iY;
        if (group == this.parent) {
            iY = this.currentGroupEnd;
        } else if (group <= this.startStack.f(0) && (iB = this.startStack.b(group)) >= 0) {
            iY = (Y() - this.groupGapLen) - this.endStack.d(iB);
        } else {
            int iL0 = l0(group);
            iY = iL0 + group;
        }
        return index > group && index < iY;
    }

    public final void q1(int count) {
        if (!(count > 0)) {
            t.b("Check failed");
        }
        int i15 = this.parent;
        int iG1 = g1(this.groups, i0(i15));
        int iP = P(this.groups, i0(i15 + 1)) - count;
        if (!(iP >= iG1)) {
            t.b("Check failed");
        }
        U0(iP, count, i15);
        int i16 = this.currentSlot;
        if (i16 >= iG1) {
            this.currentSlot = i16 - count;
        }
    }

    public final boolean r0(int index) {
        int i15 = this.parent;
        if (index <= i15 || index >= this.currentGroupEnd) {
            return i15 == 0 && index == 0;
        }
        return true;
    }

    public final c r1(int group) {
        if (group < 0 || group >= f0()) {
            return null;
        }
        return n.q(this.anchors, group, f0());
    }

    public final Object s1(Object value) {
        if (this.insertCount <= 0 || this.currentSlot == this.slotsGapStart) {
            return P0(value);
        }
        j0<q0<Object>> j0Var = this.deferredSlotWrites;
        fr.k kVar = null;
        int i15 = 1;
        int i16 = 0;
        if (j0Var == null) {
            j0Var = new j0<>(i16, i15, kVar);
        }
        this.deferredSlotWrites = j0Var;
        int i17 = this.parent;
        q0<Object> q0VarB = j0Var.b(i17);
        if (q0VarB == null) {
            q0VarB = new q0<>(i16, i15, kVar);
            j0Var.r(i17, q0VarB);
        }
        q0VarB.n(value);
        return p076m2.r.INSTANCE.a();
    }

    public String toString() {
        return "SlotWriter(current = " + this.currentGroup + " end=" + this.currentGroupEnd + " size = " + f0() + " gap=" + this.groupGapStart + '-' + (this.groupGapStart + this.groupGapLen) + ')';
    }

    public final boolean u0() {
        return this.currentGroup == this.currentGroupEnd;
    }

    public final void u1(Object value) {
        int iI0 = i0(this.currentGroup);
        if (!((this.groups[(iI0 * 5) + 1] & 268435456) != 0)) {
            t.b("Updating the data of a group that was not created with a data slot");
        }
        this.slots[Q(E(this.groups, iI0))] = value;
    }

    public final boolean v0() {
        int i15 = this.currentGroup;
        return i15 < this.currentGroupEnd && (this.groups[(i0(i15) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean w0(int index) {
        return (this.groups[(i0(index) * 5) + 1] & 1073741824) != 0;
    }

    public final boolean x0(int index) {
        return i0(index) * 5 < this.groups.length;
    }

    public final void y0(int group) {
        int iI0 = i0(group);
        int[] iArr = this.groups;
        int i15 = (iI0 * 5) + 1;
        if ((iArr[i15] & 134217728) != 0) {
            return;
        }
        n.B(iArr, iI0, true);
        if ((this.groups[i15] & 67108864) != 0) {
            return;
        }
        v1(L0(group));
    }

    public final void y1(Object value) {
        A1(this.currentGroup, value);
    }

    public final void z1(c anchor, Object value) {
        A1(anchor.e(this), value);
    }
}
