package ba;

import android.os.Bundle;
import androidx.p016lifecycle.x0;
import fr.l0;
import fr.n0;
import fr.q0;
import fr.w0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import mu.h0;
import mu.p0;
import mu.r0;
import oq.i0;
import p071kotlin.Metadata;
import p136y9.Function1;
import p136y9.b1;
import p136y9.e0;
import p136y9.i1;
import p136y9.j0;
import p136y9.j1;
import p136y9.n1;
import p136y9.s1;
import p136y9.t1;
import p136y9.y0;
import pq.v0;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008c\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u0011\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010%\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 {2\u00020\u0001:\u0002¢\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J;\u0010\u0017\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JA\u0010\u001c\u001a\u00020\u000e2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ%\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\u000e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001eH\u0002¢\u0006\u0004\b!\u0010\"J?\u0010&\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u000e\u0010#\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\u0006\u0010$\u001a\u00020\u001a2\u000e\b\u0002\u0010%\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0002¢\u0006\u0004\b&\u0010'J\u001f\u0010*\u001a\u00020\u00052\u0006\u0010(\u001a\u00020\u001a2\u0006\u0010)\u001a\u00020\u001aH\u0000¢\u0006\u0004\b*\u0010+J\u0019\u0010,\u001a\u0004\u0018\u00010\u001a2\u0006\u0010(\u001a\u00020\u001aH\u0000¢\u0006\u0004\b,\u0010-JW\u00102\u001a\u00020\u00052\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0.2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00192\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000500H\u0000¢\u0006\u0004\b2\u00103JE\u00106\u001a\u00020\u00052\u000e\u0010/\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0.2\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u000e2\u0014\b\u0002\u00101\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000500H\u0000¢\u0006\u0004\b6\u00107J#\u0010:\u001a\u00020\u00052\n\u00109\u001a\u000608R\u00020\u00022\u0006\u0010$\u001a\u00020\u001aH\u0000¢\u0006\u0004\b:\u0010;J'\u0010>\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\t2\u000e\u0010=\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0000¢\u0006\u0004\b>\u0010?J9\u0010A\u001a\u00020\u00052\n\u00109\u001a\u000608R\u00020\u00022\u0006\u00104\u001a\u00020\u001a2\u0006\u00105\u001a\u00020\u000e2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bA\u0010BJ1\u0010D\u001a\u00020\u00052\n\u00109\u001a\u000608R\u00020\u00022\u0006\u0010C\u001a\u00020\u001a2\f\u0010@\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bD\u0010EJ\u0017\u0010F\u001a\u00020\u00052\u0006\u0010C\u001a\u00020\u001aH\u0000¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bJ\u0010KJ\u0017\u0010L\u001a\u00020\u00052\u0006\u0010I\u001a\u00020HH\u0000¢\u0006\u0004\bL\u0010KJ\u000f\u0010M\u001a\u00020\u000eH\u0000¢\u0006\u0004\bM\u0010NJ\u001f\u0010Q\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u000eH\u0000¢\u0006\u0004\bQ\u0010RJ'\u0010S\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\bS\u0010TJ'\u0010W\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\bW\u0010XJ)\u0010Y\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\bY\u0010TJ3\u0010[\u001a\u00020\u000e\"\b\b\u0000\u0010Z*\u00020\u00012\u0006\u0010V\u001a\u00028\u00002\u0006\u0010P\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\b[\u0010\\J'\u0010]\u001a\u00020\u000e2\u0006\u0010V\u001a\u00020U2\u0006\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\b]\u0010XJ9\u0010`\u001a\u00020\u000e2\u0010\u0010^\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030.0\u00192\u0006\u0010_\u001a\u00020\t2\u0006\u0010P\u001a\u00020\u000e2\u0006\u00105\u001a\u00020\u000eH\u0000¢\u0006\u0004\b`\u0010aJ%\u0010c\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u001a2\f\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0000¢\u0006\u0004\bc\u0010dJ1\u0010f\u001a\u00020\u00052\u0006\u00104\u001a\u00020\u001a2\b\b\u0002\u00105\u001a\u00020\u000e2\u000e\b\u0002\u0010e\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0000¢\u0006\u0004\bf\u0010gJ\u0017\u0010h\u001a\u00020\u000e2\u0006\u0010O\u001a\u00020\u0011H\u0000¢\u0006\u0004\bh\u0010iJ\u000f\u0010j\u001a\u00020\u000eH\u0000¢\u0006\u0004\bj\u0010NJ\u000f\u0010k\u001a\u00020\u0005H\u0000¢\u0006\u0004\bk\u0010lJ\u0015\u0010m\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019H\u0000¢\u0006\u0004\bm\u0010nJ'\u0010r\u001a\u00020\u00052\u0006\u0010p\u001a\u00020o2\u000e\u0010q\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0000¢\u0006\u0004\br\u0010sJ\u001f\u0010t\u001a\u00020\u00052\u000e\u0010q\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0000¢\u0006\u0004\bt\u0010uJ\u0019\u0010x\u001a\u0004\u0018\u00010U2\u0006\u0010w\u001a\u00020vH\u0000¢\u0006\u0004\bx\u0010yJ%\u0010{\u001a\u0004\u0018\u00010\t2\u0006\u0010O\u001a\u00020\u00112\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b{\u0010|J5\u0010~\u001a\u0004\u0018\u00010\t2\u0006\u0010<\u001a\u00020\t2\u0006\u0010O\u001a\u00020\u00112\u0006\u0010}\u001a\u00020\u000e2\n\b\u0002\u0010z\u001a\u0004\u0018\u00010\tH\u0000¢\u0006\u0004\b~\u0010\u007fJ\u001c\u0010\u0080\u0001\u001a\u0004\u0018\u00010\t2\u0006\u0010V\u001a\u00020UH\u0000¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0012\u0010\u0082\u0001\u001a\u00020oH\u0000¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J$\u0010\u0084\u0001\u001a\u00020U\"\b\b\u0000\u0010Z*\u00020\u00012\u0006\u0010V\u001a\u00028\u0000H\u0000¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\u00052\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J&\u0010\u008a\u0001\u001a\u00020\u00052\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001J0\u0010\u008c\u0001\u001a\u00020\u00052\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J>\u0010\u008e\u0001\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J0\u0010\u0090\u0001\u001a\u00020\u00052\u0006\u0010V\u001a\u00020U2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0000¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u001a\u0010\u0092\u0001\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0000¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J\"\u0010\u0095\u0001\u001a\u00020\u00052\u000f\u0010\u0094\u0001\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\fH\u0000¢\u0006\u0005\b\u0095\u0001\u0010uJ\u001c\u0010\u0098\u0001\u001a\u00020\u00052\b\u0010\u0097\u0001\u001a\u00030\u0096\u0001H\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001J\u001c\u0010\u009c\u0001\u001a\u00020\u00052\b\u0010\u009b\u0001\u001a\u00030\u009a\u0001H\u0000¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001J\u001a\u0010\u009e\u0001\u001a\u00020\u001a2\u0006\u0010O\u001a\u00020\u0011H\u0000¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J\u001a\u0010 \u0001\u001a\u00020\u001a2\u0006\u0010V\u001a\u00020UH\u0000¢\u0006\u0006\b \u0001\u0010¡\u0001R\u001b\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R.\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001\"\u0006\bª\u0001\u0010«\u0001R*\u0010°\u0001\u001a\u0004\u0018\u00010o8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¬\u0001\u0010\u00ad\u0001\u001a\u0005\bZ\u0010\u0083\u0001\"\u0006\b®\u0001\u0010¯\u0001R0\u0010µ\u0001\u001a\n\u0018\u00010\u000bj\u0004\u0018\u0001`\f8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b±\u0001\u0010²\u0001\u001a\u0006\b³\u0001\u0010\u0093\u0001\"\u0005\b´\u0001\u0010uR6\u0010½\u0001\u001a\u000f\u0012\b\u0012\u00060\u000bj\u0002`\f\u0018\u00010¶\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b·\u0001\u0010¸\u0001\u001a\u0006\b¹\u0001\u0010º\u0001\"\u0006\b»\u0001\u0010¼\u0001R%\u0010Â\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0\u001e8\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¾\u0001\u0010¿\u0001\u001a\u0006\bÀ\u0001\u0010Á\u0001R,\u0010È\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190Ã\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÄ\u0001\u0010Å\u0001\u001a\u0006\bÆ\u0001\u0010Ç\u0001R,\u0010Î\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190É\u00018AX\u0080\u0004¢\u0006\u0010\n\u0006\bÊ\u0001\u0010Ë\u0001\u001a\u0006\bÌ\u0001\u0010Í\u0001R,\u0010Ñ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190Ã\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÏ\u0001\u0010Å\u0001\u001a\u0006\bÐ\u0001\u0010Ç\u0001R,\u0010Ô\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001a0\u00190É\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÒ\u0001\u0010Ë\u0001\u001a\u0006\bÓ\u0001\u0010Í\u0001R,\u0010Ú\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001a0Õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R-\u0010Þ\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0005\u0012\u00030Û\u00010Õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÜ\u0001\u0010×\u0001\u001a\u0006\bÝ\u0001\u0010Ù\u0001R-\u0010à\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0011\u0012\u0006\u0012\u0004\u0018\u00010U0Õ\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b&\u0010×\u0001\u001a\u0006\bß\u0001\u0010Ù\u0001R2\u0010ã\u0001\u001a\u0015\u0012\u0004\u0012\u00020U\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001f0\u001e0Õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bá\u0001\u0010×\u0001\u001a\u0006\bâ\u0001\u0010Ù\u0001R/\u0010è\u0001\u001a\u0005\u0018\u00010\u0096\u00012\n\u0010ä\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0000@BX\u0080\u000e¢\u0006\u000f\n\u0005\bJ\u0010å\u0001\u001a\u0006\bæ\u0001\u0010ç\u0001R,\u0010ð\u0001\u001a\u0005\u0018\u00010é\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bê\u0001\u0010ë\u0001\u001a\u0006\bì\u0001\u0010í\u0001\"\u0006\bî\u0001\u0010ï\u0001R$\u0010ô\u0001\u001a\t\u0012\u0004\u0012\u00020H0ñ\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bh\u0010ò\u0001\u001a\u0005\bó\u0001\u0010nR)\u0010û\u0001\u001a\u00030õ\u00018@@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b>\u0010ö\u0001\u001a\u0006\b÷\u0001\u0010ø\u0001\"\u0006\bù\u0001\u0010ú\u0001R\u001f\u0010\u0080\u0002\u001a\u00030ü\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bj\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001R*\u0010\u0088\u0002\u001a\u00030\u0081\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0002\u0010\u0083\u0002\u001a\u0006\b\u0084\u0002\u0010\u0085\u0002\"\u0006\b\u0086\u0002\u0010\u0087\u0002R8\u0010\u008b\u0002\u001a\u001b\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\t0.\u0012\b\u0012\u000608R\u00020\u00020Õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0089\u0002\u0010×\u0001\u001a\u0006\b\u008a\u0002\u0010Ù\u0001R7\u0010\u0092\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0005\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002\"\u0006\b\u0090\u0002\u0010\u0091\u0002R7\u0010\u0096\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0005\u0018\u0001008\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0093\u0002\u0010\u008d\u0002\u001a\u0006\b\u0094\u0002\u0010\u008f\u0002\"\u0006\b\u0095\u0002\u0010\u0091\u0002R,\u0010\u0099\u0002\u001a\u000f\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u000e0Õ\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u0097\u0002\u0010×\u0001\u001a\u0006\b\u0098\u0002\u0010Ù\u0001R\u0018\u0010\u009a\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b`\u0010À\u0001R\u001d\u0010\u009b\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0ñ\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010ò\u0001R&\u0010¡\u0002\u001a\t\u0012\u0004\u0012\u00020\u001a0\u009c\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009d\u0002\u0010\u009e\u0002\u001a\u0006\b\u009f\u0002\u0010 \u0002R\u0015\u0010¥\u0002\u001a\u00030¢\u00028F¢\u0006\b\u001a\u0006\b£\u0002\u0010¤\u0002R(\u0010p\u001a\u00020o2\u0006\u0010p\u001a\u00020o8A@AX\u0080\u000e¢\u0006\u0010\u001a\u0006\b¦\u0002\u0010\u0083\u0001\"\u0006\b§\u0002\u0010¯\u0001R,\u0010¨\u0002\u001a\u00030\u0081\u00022\b\u0010¨\u0002\u001a\u00030\u0081\u00028@@AX\u0080\u000e¢\u0006\u0010\u001a\u0006\b©\u0002\u0010\u0085\u0002\"\u0006\bª\u0002\u0010\u0087\u0002R\u0019\u0010\u00ad\u0002\u001a\u0004\u0018\u00010\t8@X\u0080\u0004¢\u0006\b\u001a\u0006\b«\u0002\u0010¬\u0002R\u0019\u0010°\u0002\u001a\u0004\u0018\u00010\u001a8@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010¯\u0002¨\u0006±\u0002"}, d2 = {"Lba/u;", "", "Ly9/e0;", "navController", "Lkotlin/Function0;", "Loq/i0;", "updateOnBackPressedCallbackEnabledCallback", "<init>", "(Ly9/e0;Ler/a;)V", "Ly9/y0;", "node", "Landroid/os/Bundle;", "Landroidx/savedstate/SavedState;", "args", "", "W", "(Ly9/y0;Landroid/os/Bundle;)Z", "", "id", "Ly9/i1;", "navOptions", "Ly9/s1$a;", "navigatorExtras", "C0", "(ILandroid/os/Bundle;Ly9/i1;Ly9/s1$a;)Z", "", "Ly9/w;", "entries", "z", "(Ljava/util/List;Landroid/os/Bundle;Ly9/i1;Ly9/s1$a;)Z", "Lpq/m;", "Ly9/x;", "backStackState", "V", "(Lpq/m;)Ljava/util/List;", "finalArgs", "backStackEntry", "restoredEntries", "m", "(Ly9/y0;Landroid/os/Bundle;Ly9/w;Ljava/util/List;)V", "child", "parent", "Z", "(Ly9/w;Ly9/w;)V", "J0", "(Ly9/w;)Ly9/w;", "Ly9/s1;", "navigator", "Lkotlin/Function1;", "handler", "h0", "(Ly9/s1;Ljava/util/List;Ly9/i1;Ly9/s1$a;Ler/l;)V", "popUpTo", "saveState", "q0", "(Ly9/s1;Ly9/w;ZLer/l;)V", "Ly9/e0$b;", "state", "z0", "(Ly9/e0$b;Ly9/w;)V", "destination", "arguments", "r", "(Ly9/y0;Landroid/os/Bundle;)Ly9/w;", "superCallback", "k0", "(Ly9/e0$b;Ly9/w;ZLer/a;)V", "entry", "a0", "(Ly9/e0$b;Ly9/w;Ler/a;)V", "y0", "(Ly9/w;)V", "Ly9/e0$c;", "listener", "o", "(Ly9/e0$c;)V", "A0", "l0", "()Z", "destinationId", "inclusive", "m0", "(IZ)Z", "n0", "(IZZ)Z", "", "route", "o0", "(Ljava/lang/String;ZZ)Z", "r0", "T", "s0", "(Ljava/lang/Object;ZZ)Z", "t0", "popOperations", "foundDestination", "y", "(Ljava/util/List;Ly9/y0;ZZ)Z", "onComplete", "p0", "(Ly9/w;Ler/a;)V", "savedState", "v0", "(Ly9/w;ZLpq/m;)V", "q", "(I)Z", "s", "K0", "()V", "x0", "()Ljava/util/List;", "Ly9/b1;", "graph", "startDestinationArgs", "G0", "(Ly9/b1;Landroid/os/Bundle;)V", "i0", "(Landroid/os/Bundle;)V", "", "deepLink", "G", "([I)Ljava/lang/String;", "matchingDest", "B", "(ILy9/y0;)Ly9/y0;", "searchChildren", "E", "(Ly9/y0;IZLy9/y0;)Ly9/y0;", "C", "(Ljava/lang/String;)Ly9/y0;", "R", "()Ly9/b1;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ljava/lang/Object;)Ljava/lang/String;", "Ly9/w0;", "request", "d0", "(Ly9/w0;)V", "e0", "(Ly9/w0;Ly9/i1;)V", "f0", "(Ly9/w0;Ly9/i1;Ly9/s1$a;)V", "g0", "(Ly9/y0;Landroid/os/Bundle;Ly9/i1;Ly9/s1$a;)V", "c0", "(Ljava/lang/String;Ly9/i1;Ly9/s1$a;)V", "E0", "()Landroid/os/Bundle;", "navState", "B0", "Landroidx/lifecycle/q;", "owner", "H0", "(Landroidx/lifecycle/q;)V", "Landroidx/lifecycle/x0;", "viewModelStore", "I0", "(Landroidx/lifecycle/x0;)V", "J", "(I)Ly9/w;", "K", "(Ljava/lang/String;)Ly9/w;", "a", "Ly9/e0;", "getNavController", "()Ly9/e0;", "b", "Ler/a;", "getUpdateOnBackPressedCallbackEnabledCallback", "()Ler/a;", "setUpdateOnBackPressedCallbackEnabledCallback", "(Ler/a;)V", "c", "Ly9/b1;", "set_graph$navigation_runtime_release", "(Ly9/b1;)V", "_graph", "d", "Landroid/os/Bundle;", "getNavigatorStateToRestore$navigation_runtime_release", "setNavigatorStateToRestore$navigation_runtime_release", "navigatorStateToRestore", "", "e", "[Landroid/os/Bundle;", "getBackStackToRestore$navigation_runtime_release", "()[Landroid/os/Bundle;", "setBackStackToRestore$navigation_runtime_release", "([Landroid/os/Bundle;)V", "backStackToRestore", "f", "Lpq/m;", "I", "()Lpq/m;", "backQueue", "Lmu/b0;", "g", "Lmu/b0;", "get_currentBackStack$navigation_runtime_release", "()Lmu/b0;", "_currentBackStack", "Lmu/p0;", "h", "Lmu/p0;", "getCurrentBackStack$navigation_runtime_release", "()Lmu/p0;", "currentBackStack", "i", "get_visibleEntries$navigation_runtime_release", "_visibleEntries", "j", ip.a.f96137b, "visibleEntries", "", "k", "Ljava/util/Map;", "getChildToParentEntries$navigation_runtime_release", "()Ljava/util/Map;", "childToParentEntries", "Lba/a;", "l", "getParentToChildCount$navigation_runtime_release", "parentToChildCount", "getBackStackMap$navigation_runtime_release", "backStackMap", "n", "getBackStackStates$navigation_runtime_release", "backStackStates", "value", "Landroidx/lifecycle/q;", "getLifecycleOwner$navigation_runtime_release", "()Landroidx/lifecycle/q;", "lifecycleOwner", "Ly9/j0;", "p", "Ly9/j0;", "getViewModel$navigation_runtime_release", "()Ly9/j0;", "setViewModel$navigation_runtime_release", "(Ly9/j0;)V", "viewModel", "", "Ljava/util/List;", "getOnDestinationChangedListeners$navigation_runtime_release", "onDestinationChangedListeners", "Landroidx/lifecycle/j$b;", "Landroidx/lifecycle/j$b;", "O", "()Landroidx/lifecycle/j$b;", "setHostLifecycleState$navigation_runtime_release", "(Landroidx/lifecycle/j$b;)V", "hostLifecycleState", "Landroidx/lifecycle/p;", "Landroidx/lifecycle/p;", "getLifecycleObserver$navigation_runtime_release", "()Landroidx/lifecycle/p;", "lifecycleObserver", "Ly9/t1;", "t", "Ly9/t1;", "U", "()Ly9/t1;", "set_navigatorProvider$navigation_runtime_release", "(Ly9/t1;)V", "_navigatorProvider", "u", "getNavigatorState$navigation_runtime_release", "navigatorState", "v", "Ler/l;", "getAddToBackStackHandler$navigation_runtime_release", "()Ler/l;", "setAddToBackStackHandler$navigation_runtime_release", "(Ler/l;)V", "addToBackStackHandler", "w", "getPopFromBackStackHandler$navigation_runtime_release", "setPopFromBackStackHandler$navigation_runtime_release", "popFromBackStackHandler", "x", "getEntrySavedState$navigation_runtime_release", "entrySavedState", "dispatchReentrantCount", "backStackEntriesToDispatch", "Lmu/a0;", "A", "Lmu/a0;", "get_currentBackStackEntryFlow$navigation_runtime_release", "()Lmu/a0;", "_currentBackStackEntryFlow", "Lba/h;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()Lba/h;", "navContext", "N", "F0", "navigatorProvider", "Q", "setNavigatorProvider$navigation_runtime_release", "M", "()Ly9/y0;", "currentDestination", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ly9/w;", "currentBackStackEntry", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class u {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final mu.a0<p136y9.w> _currentBackStackEntryFlow;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final e0 navController;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> updateOnBackPressedCallbackEnabledCallback;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private b1 _graph;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private Bundle navigatorStateToRestore;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private Bundle[] backStackToRestore;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final pq.m<p136y9.w> backQueue = new pq.m<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<List<p136y9.w>> _currentBackStack;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final p0<List<p136y9.w>> currentBackStack;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final mu.b0<List<p136y9.w>> _visibleEntries;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final p0<List<p136y9.w>> visibleEntries;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Map<p136y9.w, p136y9.w> childToParentEntries;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final Map<p136y9.w, a> parentToChildCount;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Map<Integer, String> backStackMap;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final Map<String, pq.m<p136y9.x>> backStackStates;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.q lifecycleOwner;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private j0 viewModel;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final List<e0.c> onDestinationChangedListeners;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private androidx.lifecycle.j.b hostLifecycleState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final androidx.p016lifecycle.p lifecycleObserver;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private t1 _navigatorProvider;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final Map<s1<? extends y0>, e0.b> navigatorState;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p136y9.w, i0> addToBackStackHandler;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p136y9.w, i0> popFromBackStackHandler;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final Map<p136y9.w, Boolean> entrySavedState;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private int dispatchReentrantCount;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final List<p136y9.w> backStackEntriesToDispatch;

    public u(e0 e0Var, er.a<i0> aVar) {
        this.navController = e0Var;
        this.updateOnBackPressedCallbackEnabledCallback = aVar;
        mu.b0<List<p136y9.w>> b0VarA = r0.a(pq.v.n());
        this._currentBackStack = b0VarA;
        this.currentBackStack = mu.i.b(b0VarA);
        mu.b0<List<p136y9.w>> b0VarA2 = r0.a(pq.v.n());
        this._visibleEntries = b0VarA2;
        this.visibleEntries = mu.i.b(b0VarA2);
        this.childToParentEntries = new LinkedHashMap();
        this.parentToChildCount = new LinkedHashMap();
        this.backStackMap = new LinkedHashMap();
        this.backStackStates = new LinkedHashMap();
        this.onDestinationChangedListeners = new ArrayList();
        this.hostLifecycleState = androidx.lifecycle.j.b.INITIALIZED;
        this.lifecycleObserver = new androidx.p016lifecycle.n() { // from class: ba.l
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar2) {
                u.Y(this.f17763a, qVar, aVar2);
            }
        };
        this._navigatorProvider = new t1();
        this.navigatorState = new LinkedHashMap();
        this.entrySavedState = new LinkedHashMap();
        this.backStackEntriesToDispatch = new ArrayList();
        this._currentBackStackEntryFlow = h0.b(1, 0, lu.a.DROP_OLDEST, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 A(l0 l0Var, List list, n0 n0Var, u uVar, Bundle bundle, p136y9.w wVar) {
        List<p136y9.w> listN;
        l0Var.f66404a = true;
        int iIndexOf = list.indexOf(wVar);
        if (iIndexOf != -1) {
            int i15 = iIndexOf + 1;
            listN = list.subList(n0Var.f66407a, i15);
            n0Var.f66407a = i15;
        } else {
            listN = pq.v.n();
        }
        uVar.m(wVar.getDestination(), bundle, wVar, listN);
        return i0.f148189a;
    }

    private final boolean C0(int id5, Bundle args, i1 navOptions, s1.a navigatorExtras) {
        if (!this.backStackMap.containsKey(Integer.valueOf(id5))) {
            return false;
        }
        final String str = this.backStackMap.get(Integer.valueOf(id5));
        pq.v.I(this.backStackMap.values(), new er.l() { // from class: ba.s
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(u.D0(str, (String) obj));
            }
        });
        return z(V((pq.m) w0.d(this.backStackStates).remove(str)), args, navOptions, navigatorExtras);
    }

    public static /* synthetic */ y0 D(u uVar, int i15, y0 y0Var, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            y0Var = null;
        }
        return uVar.B(i15, y0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean D0(String str, String str2) {
        return fr.t.c(str2, str);
    }

    public static /* synthetic */ y0 F(u uVar, y0 y0Var, int i15, boolean z15, y0 y0Var2, int i16, Object obj) {
        if ((i16 & 8) != 0) {
            y0Var2 = null;
        }
        return uVar.E(y0Var, i15, z15, y0Var2);
    }

    private final List<p136y9.w> V(pq.m<p136y9.x> backStackState) {
        y0 y0VarN;
        ArrayList arrayList = new ArrayList();
        p136y9.w wVarS = this.backQueue.s();
        if (wVarS == null || (y0VarN = wVarS.getDestination()) == null) {
            y0VarN = N();
        }
        if (backStackState != null) {
            y0 y0Var = y0VarN;
            for (p136y9.x xVar : backStackState) {
                y0 y0VarF = F(this, y0Var, xVar.b(), true, null, 8, null);
                if (y0VarF == null) {
                    throw new IllegalStateException(("Restore State failed: destination " + y0.INSTANCE.d(P(), xVar.b()) + " cannot be found from the current destination " + y0Var).toString());
                }
                arrayList.add(xVar.d(P(), y0VarF, O(), this.viewModel));
                y0Var = y0VarF;
            }
        }
        return arrayList;
    }

    private final boolean W(y0 node, Bundle args) {
        int iNextIndex;
        y0 destination;
        p136y9.w wVarL = L();
        pq.m<p136y9.w> mVar = this.backQueue;
        ListIterator<p136y9.w> listIterator = mVar.listIterator(mVar.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (listIterator.previous().getDestination() == node) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        if (iNextIndex == -1) {
            return false;
        }
        if (node instanceof b1) {
            List listP = eu.k.P(eu.k.H(b1.INSTANCE.b((b1) node), new er.l() { // from class: ba.t
                @Override // er.l
                public final Object b(Object obj) {
                    return Integer.valueOf(u.X((y0) obj));
                }
            }));
            if (this.backQueue.size() - iNextIndex != listP.size()) {
                return false;
            }
            pq.m<p136y9.w> mVar2 = this.backQueue;
            List<p136y9.w> listSubList = mVar2.subList(iNextIndex, mVar2.size());
            ArrayList arrayList = new ArrayList(pq.v.y(listSubList, 10));
            Iterator<T> it = listSubList.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(((p136y9.w) it.next()).getDestination().o()));
            }
            if (!fr.t.c(arrayList, listP)) {
                return false;
            }
        } else if (wVarL == null || (destination = wVarL.getDestination()) == null || node.o() != destination.o()) {
            return false;
        }
        pq.m<p136y9.w> mVar3 = new pq.m();
        while (pq.v.p(this.backQueue) >= iNextIndex) {
            p136y9.w wVar = (p136y9.w) pq.v.M(this.backQueue);
            J0(wVar);
            mVar3.addFirst(new p136y9.w(wVar, wVar.getDestination().g(args)));
        }
        for (p136y9.w wVar2 : mVar3) {
            b1 parent = wVar2.getDestination().getParent();
            if (parent != null) {
                Z(wVar2, J(parent.o()));
            }
            this.backQueue.add(wVar2);
        }
        for (p136y9.w wVar3 : mVar3) {
            this._navigatorProvider.e(wVar3.getDestination().getNavigatorName()).j(wVar3);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int X(y0 y0Var) {
        return y0Var.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y(u uVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        uVar.hostLifecycleState = aVar.e();
        if (uVar._graph != null) {
            Iterator it = pq.v.i1(uVar.backQueue).iterator();
            while (it.hasNext()) {
                ((p136y9.w) it.next()).n(aVar);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 b0(l0 l0Var, u uVar, y0 y0Var, Bundle bundle, p136y9.w wVar) {
        l0Var.f66404a = true;
        n(uVar, y0Var, bundle, wVar, null, 8, null);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 j0(er.a aVar) {
        aVar.a();
        return i0.f148189a;
    }

    private final void m(y0 node, Bundle finalArgs, p136y9.w backStackEntry, List<p136y9.w> restoredEntries) {
        Bundle bundle;
        pq.m<p136y9.w> mVar;
        y0 destination;
        List<p136y9.w> list;
        b1 b1Var;
        p136y9.w wVarPrevious;
        p136y9.w wVarPrevious2;
        List<p136y9.w> list2 = restoredEntries;
        y0 destination2 = backStackEntry.getDestination();
        if (!(destination2 instanceof p136y9.k)) {
            while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof p136y9.k) && u0(this, this.backQueue.last().getDestination().o(), true, false, 4, null)) {
            }
        }
        pq.m mVar2 = new pq.m();
        p136y9.w wVar = null;
        if (node instanceof b1) {
            y0 y0Var = destination2;
            while (true) {
                b1 parent = y0Var.getParent();
                if (parent != null) {
                    ListIterator<p136y9.w> listIterator = list2.listIterator(list2.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            wVarPrevious2 = null;
                            break;
                        }
                        wVarPrevious2 = listIterator.previous();
                    } while (!fr.t.c(wVarPrevious2.getDestination(), parent));
                    p136y9.w wVarB = wVarPrevious2;
                    if (wVarB == null) {
                        bundle = finalArgs;
                        destination = destination2;
                        wVarB = p136y9.w.Companion.b(p136y9.w.INSTANCE, P(), parent, bundle, O(), this.viewModel, null, null, 96, null);
                    } else {
                        bundle = finalArgs;
                        destination = destination2;
                    }
                    mVar2.addFirst(wVarB);
                    if (this.backQueue.isEmpty() || this.backQueue.last().getDestination() != parent) {
                        list = restoredEntries;
                        mVar = mVar2;
                    } else {
                        list = restoredEntries;
                        mVar = mVar2;
                        w0(this, this.backQueue.last(), false, null, 6, null);
                    }
                } else {
                    bundle = finalArgs;
                    mVar = mVar2;
                    destination = destination2;
                    list = list2;
                }
                if (parent == null || parent == node) {
                    break;
                }
                list2 = list;
                y0Var = parent;
                mVar2 = mVar;
                destination2 = destination;
            }
        } else {
            bundle = finalArgs;
            mVar = mVar2;
            destination = destination2;
            list = list2;
            backStackEntry = backStackEntry;
        }
        y0 destination3 = mVar.isEmpty() ? destination : ((p136y9.w) mVar.first()).getDestination();
        while (destination3 != null && B(destination3.o(), destination3) != destination3) {
            b1 parent2 = destination3.getParent();
            if (parent2 != null) {
                Bundle bundle2 = (bundle == null || !ua.c.v(ua.c.a(bundle))) ? bundle : null;
                ListIterator<p136y9.w> listIterator2 = list.listIterator(list.size());
                do {
                    if (!listIterator2.hasPrevious()) {
                        wVarPrevious = null;
                        break;
                    }
                    wVarPrevious = listIterator2.previous();
                } while (!fr.t.c(wVarPrevious.getDestination(), parent2));
                p136y9.w wVarB2 = wVarPrevious;
                if (wVarB2 == null) {
                    b1Var = parent2;
                    wVarB2 = p136y9.w.Companion.b(p136y9.w.INSTANCE, P(), b1Var, parent2.g(bundle2), O(), this.viewModel, null, null, 96, null);
                } else {
                    b1Var = parent2;
                }
                mVar.addFirst(wVarB2);
            } else {
                b1Var = parent2;
            }
            destination3 = b1Var;
        }
        if (!mVar.isEmpty()) {
            destination = ((p136y9.w) mVar.first()).getDestination();
        }
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof b1) && ((b1) this.backQueue.last().getDestination()).S().i(destination.o()) == null) {
            w0(this, this.backQueue.last(), false, null, 6, null);
        }
        p136y9.w wVarN = this.backQueue.n();
        if (wVarN == null) {
            wVarN = (p136y9.w) mVar.n();
        }
        if (!fr.t.c(wVarN != null ? wVarN.getDestination() : null, this._graph)) {
            ListIterator<p136y9.w> listIterator3 = list.listIterator(list.size());
            while (listIterator3.hasPrevious()) {
                p136y9.w wVarPrevious3 = listIterator3.previous();
                if (fr.t.c(wVarPrevious3.getDestination(), this._graph)) {
                    wVar = wVarPrevious3;
                    break;
                }
            }
            p136y9.w wVarB3 = wVar;
            if (wVarB3 == null) {
                p136y9.w.Companion companion = p136y9.w.INSTANCE;
                h hVarP = P();
                b1 b1Var2 = this._graph;
                wVarB3 = p136y9.w.Companion.b(companion, hVarP, b1Var2, b1Var2.g(bundle), O(), this.viewModel, null, null, 96, null);
            }
            mVar.addFirst(wVarB3);
        }
        for (p136y9.w wVar2 : mVar) {
            e0.b bVar = this.navigatorState.get(this._navigatorProvider.e(wVar2.getDestination().getNavigatorName()));
            if (bVar == null) {
                throw new IllegalStateException(("NavigatorBackStack for " + node.getNavigatorName() + " should already be created").toString());
            }
            bVar.p(wVar2);
        }
        this.backQueue.addAll(mVar);
        this.backQueue.add(backStackEntry);
        for (p136y9.w wVar3 : pq.v.M0(mVar, backStackEntry)) {
            b1 parent3 = wVar3.getDestination().getParent();
            if (parent3 != null) {
                Z(wVar3, J(parent3.o()));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ void n(u uVar, y0 y0Var, Bundle bundle, p136y9.w wVar, List list, int i15, Object obj) {
        if ((i15 & 8) != 0) {
            list = pq.v.n();
        }
        uVar.m(y0Var, bundle, wVar, list);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 p(j1 j1Var) {
        j1Var.g(true);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 t(l0 l0Var, l0 l0Var2, u uVar, boolean z15, pq.m mVar, p136y9.w wVar) {
        l0Var.f66404a = true;
        l0Var2.f66404a = true;
        uVar.v0(wVar, z15, mVar);
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 u(y0 y0Var) {
        b1 parent = y0Var.getParent();
        if (parent == null || parent.U() != y0Var.o()) {
            return null;
        }
        return y0Var.getParent();
    }

    public static /* synthetic */ boolean u0(u uVar, int i15, boolean z15, boolean z16, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            z16 = false;
        }
        return uVar.r0(i15, z15, z16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean v(u uVar, y0 y0Var) {
        return !uVar.backStackMap.containsKey(Integer.valueOf(y0Var.o()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final y0 w(y0 y0Var) {
        b1 parent = y0Var.getParent();
        if (parent == null || parent.U() != y0Var.o()) {
            return null;
        }
        return y0Var.getParent();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void w0(u uVar, p136y9.w wVar, boolean z15, pq.m mVar, int i15, Object obj) {
        if ((i15 & 2) != 0) {
            z15 = false;
        }
        if ((i15 & 4) != 0) {
            mVar = new pq.m();
        }
        uVar.v0(wVar, z15, mVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean x(u uVar, y0 y0Var) {
        return !uVar.backStackMap.containsKey(Integer.valueOf(y0Var.o()));
    }

    private final boolean z(final List<p136y9.w> entries, final Bundle args, i1 navOptions, s1.a navigatorExtras) {
        p136y9.w wVar;
        y0 destination;
        ArrayList<List<p136y9.w>> arrayList = new ArrayList();
        ArrayList<p136y9.w> arrayList2 = new ArrayList();
        for (Object obj : entries) {
            if (!(((p136y9.w) obj).getDestination() instanceof b1)) {
                arrayList2.add(obj);
            }
        }
        for (p136y9.w wVar2 : arrayList2) {
            List list = (List) pq.v.z0(arrayList);
            if (fr.t.c((list == null || (wVar = (p136y9.w) pq.v.x0(list)) == null || (destination = wVar.getDestination()) == null) ? null : destination.getNavigatorName(), wVar2.getDestination().getNavigatorName())) {
                list.add(wVar2);
            } else {
                arrayList.add(pq.v.t(wVar2));
            }
        }
        final l0 l0Var = new l0();
        for (List<p136y9.w> list2 : arrayList) {
            s1<? extends y0> s1VarE = this._navigatorProvider.e(((p136y9.w) pq.v.l0(list2)).getDestination().getNavigatorName());
            final n0 n0Var = new n0();
            h0(s1VarE, list2, navOptions, navigatorExtras, new er.l() { // from class: ba.j
                @Override // er.l
                public final Object b(Object obj2) {
                    return u.A(l0Var, entries, n0Var, this, args, (p136y9.w) obj2);
                }
            });
        }
        return l0Var.f66404a;
    }

    public final void A0(e0.c listener) {
        this.onDestinationChangedListeners.remove(listener);
    }

    public final y0 B(int destinationId, y0 matchingDest) {
        y0 destination;
        b1 b1Var = this._graph;
        if (b1Var == null) {
            return null;
        }
        if (b1Var.o() == destinationId) {
            if (matchingDest == null) {
                return this._graph;
            }
            if (fr.t.c(this._graph, matchingDest) && matchingDest.getParent() == null) {
                return this._graph;
            }
        }
        p136y9.w wVarS = this.backQueue.s();
        if (wVarS == null || (destination = wVarS.getDestination()) == null) {
            destination = this._graph;
        }
        return E(destination, destinationId, false, matchingDest);
    }

    public final void B0(Bundle navState) {
        if (navState == null) {
            return;
        }
        Bundle bundleA = ua.c.a(navState);
        this.navigatorStateToRestore = ua.c.b(bundleA, "android-support-nav:controller:navigatorState") ? ua.c.o(bundleA, "android-support-nav:controller:navigatorState") : null;
        int i15 = 0;
        this.backStackToRestore = ua.c.b(bundleA, "android-support-nav:controller:backStack") ? (Bundle[]) ua.c.p(bundleA, "android-support-nav:controller:backStack").toArray(new Bundle[0]) : null;
        this.backStackStates.clear();
        if (ua.c.b(bundleA, "android-support-nav:controller:backStackDestIds") && ua.c.b(bundleA, "android-support-nav:controller:backStackIds")) {
            int[] iArrK = ua.c.k(bundleA, "android-support-nav:controller:backStackDestIds");
            List<String> listT = ua.c.t(bundleA, "android-support-nav:controller:backStackIds");
            int length = iArrK.length;
            int i16 = 0;
            while (i15 < length) {
                int i17 = i16 + 1;
                this.backStackMap.put(Integer.valueOf(iArrK[i15]), !fr.t.c(listT.get(i16), "") ? listT.get(i16) : null);
                i15++;
                i16 = i17;
            }
        }
        if (ua.c.b(bundleA, "android-support-nav:controller:backStackStates")) {
            for (String str : ua.c.t(bundleA, "android-support-nav:controller:backStackStates")) {
                if (ua.c.b(bundleA, "android-support-nav:controller:backStackStates:" + str)) {
                    List<Bundle> listP = ua.c.p(bundleA, "android-support-nav:controller:backStackStates:" + str);
                    Map<String, pq.m<p136y9.x>> map = this.backStackStates;
                    pq.m<p136y9.x> mVar = new pq.m<>(listP.size());
                    Iterator<Bundle> it = listP.iterator();
                    while (it.hasNext()) {
                        mVar.add(new p136y9.x(it.next()));
                    }
                    map.put(str, mVar);
                }
            }
        }
    }

    public final y0 C(String route) {
        b1 b1Var = this._graph;
        if (b1Var == null) {
            return null;
        }
        return (fr.t.c(b1Var.u(), route) || this._graph.x(route) != null) ? this._graph : R().P(route);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v4, types: [y9.b1, y9.y0] */
    /* JADX WARN: Type inference failed for: r0v5, types: [y9.b1] */
    public final y0 E(y0 destination, int destinationId, boolean searchChildren, y0 matchingDest) {
        ?? parent;
        b1 b1Var;
        if (destination.o() == destinationId && (matchingDest == null || (fr.t.c(destination, matchingDest) && fr.t.c(destination.getParent(), matchingDest.getParent())))) {
            return destination;
        }
        if (destination instanceof b1) {
            b1Var = (b1) destination;
        } else {
            parent = 0;
        }
        if (parent == 0) {
            parent = b1Var;
            parent = destination.getParent();
        }
        parent = b1Var;
        return parent.R(destinationId, parent, searchChildren, matchingDest);
    }

    public final Bundle E0() {
        oq.r[] rVarArr;
        Bundle bundleA;
        oq.r[] rVarArr2;
        oq.r[] rVarArr3;
        oq.r[] rVarArr4;
        oq.r[] rVarArr5;
        ArrayList arrayList = new ArrayList();
        Map mapI = v0.i();
        if (mapI.isEmpty()) {
            rVarArr = new oq.r[0];
        } else {
            ArrayList arrayList2 = new ArrayList(mapI.size());
            for (Map.Entry entry : mapI.entrySet()) {
                arrayList2.add(oq.y.a((String) entry.getKey(), entry.getValue()));
            }
            rVarArr = (oq.r[]) arrayList2.toArray(new oq.r[0]);
        }
        Bundle bundleA2 = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
        ua.k.a(bundleA2);
        for (Map.Entry<String, s1<? extends y0>> entry2 : this._navigatorProvider.f().entrySet()) {
            String key = entry2.getKey();
            Bundle bundleM = entry2.getValue().m();
            if (bundleM != null) {
                arrayList.add(key);
                ua.k.n(ua.k.a(bundleA2), key, bundleM);
            }
        }
        if (arrayList.isEmpty()) {
            bundleA = null;
        } else {
            Map mapI2 = v0.i();
            if (mapI2.isEmpty()) {
                rVarArr5 = new oq.r[0];
            } else {
                ArrayList arrayList3 = new ArrayList(mapI2.size());
                for (Map.Entry entry3 : mapI2.entrySet()) {
                    arrayList3.add(oq.y.a((String) entry3.getKey(), entry3.getValue()));
                }
                rVarArr5 = (oq.r[]) arrayList3.toArray(new oq.r[0]);
            }
            bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr5, rVarArr5.length));
            Bundle bundleA3 = ua.k.a(bundleA);
            ua.k.r(ua.k.a(bundleA2), "android-support-nav:controller:navigatorState:names", arrayList);
            ua.k.n(bundleA3, "android-support-nav:controller:navigatorState", bundleA2);
        }
        if (!this.backQueue.isEmpty()) {
            if (bundleA == null) {
                Map mapI3 = v0.i();
                if (mapI3.isEmpty()) {
                    rVarArr4 = new oq.r[0];
                } else {
                    ArrayList arrayList4 = new ArrayList(mapI3.size());
                    for (Map.Entry entry4 : mapI3.entrySet()) {
                        arrayList4.add(oq.y.a((String) entry4.getKey(), entry4.getValue()));
                    }
                    rVarArr4 = (oq.r[]) arrayList4.toArray(new oq.r[0]);
                }
                bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr4, rVarArr4.length));
                ua.k.a(bundleA);
            }
            ArrayList arrayList5 = new ArrayList();
            Iterator<p136y9.w> it = this.backQueue.iterator();
            while (it.hasNext()) {
                arrayList5.add(new p136y9.x(it.next()).f());
            }
            ua.k.o(ua.k.a(bundleA), "android-support-nav:controller:backStack", arrayList5);
        }
        if (!this.backStackMap.isEmpty()) {
            if (bundleA == null) {
                Map mapI4 = v0.i();
                if (mapI4.isEmpty()) {
                    rVarArr3 = new oq.r[0];
                } else {
                    ArrayList arrayList6 = new ArrayList(mapI4.size());
                    for (Map.Entry entry5 : mapI4.entrySet()) {
                        arrayList6.add(oq.y.a((String) entry5.getKey(), entry5.getValue()));
                    }
                    rVarArr3 = (oq.r[]) arrayList6.toArray(new oq.r[0]);
                }
                bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr3, rVarArr3.length));
                ua.k.a(bundleA);
            }
            int[] iArr = new int[this.backStackMap.size()];
            ArrayList arrayList7 = new ArrayList();
            int i15 = 0;
            for (Map.Entry<Integer, String> entry6 : this.backStackMap.entrySet()) {
                int iIntValue = entry6.getKey().intValue();
                String value = entry6.getValue();
                int i16 = i15 + 1;
                iArr[i15] = iIntValue;
                if (value == null) {
                    value = "";
                }
                arrayList7.add(value);
                i15 = i16;
            }
            Bundle bundleA4 = ua.k.a(bundleA);
            ua.k.h(bundleA4, "android-support-nav:controller:backStackDestIds", iArr);
            ua.k.r(bundleA4, "android-support-nav:controller:backStackIds", arrayList7);
        }
        if (!this.backStackStates.isEmpty()) {
            if (bundleA == null) {
                Map mapI5 = v0.i();
                if (mapI5.isEmpty()) {
                    rVarArr2 = new oq.r[0];
                } else {
                    ArrayList arrayList8 = new ArrayList(mapI5.size());
                    for (Map.Entry entry7 : mapI5.entrySet()) {
                        arrayList8.add(oq.y.a((String) entry7.getKey(), entry7.getValue()));
                    }
                    rVarArr2 = (oq.r[]) arrayList8.toArray(new oq.r[0]);
                }
                bundleA = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr2, rVarArr2.length));
                ua.k.a(bundleA);
            }
            ArrayList arrayList9 = new ArrayList();
            for (Map.Entry<String, pq.m<p136y9.x>> entry8 : this.backStackStates.entrySet()) {
                String key2 = entry8.getKey();
                pq.m<p136y9.x> value2 = entry8.getValue();
                arrayList9.add(key2);
                ArrayList arrayList10 = new ArrayList();
                Iterator<p136y9.x> it4 = value2.iterator();
                while (it4.hasNext()) {
                    arrayList10.add(it4.next().f());
                }
                ua.k.o(ua.k.a(bundleA), "android-support-nav:controller:backStackStates:" + key2, arrayList10);
            }
            ua.k.r(ua.k.a(bundleA), "android-support-nav:controller:backStackStates", arrayList9);
        }
        return bundleA;
    }

    public final void F0(b1 b1Var) {
        G0(b1Var, null);
    }

    public final String G(int[] deepLink) {
        b1 b1Var;
        b1 b1Var2 = this._graph;
        int length = deepLink.length;
        int i15 = 0;
        while (true) {
            y0 y0VarM = null;
            if (i15 >= length) {
                return null;
            }
            int i16 = deepLink[i15];
            if (i15 != 0) {
                y0VarM = b1Var2.M(i16);
            } else if (this._graph.o() == i16) {
                y0VarM = this._graph;
            }
            if (y0VarM == null) {
                return y0.INSTANCE.d(P(), i16);
            }
            if (i15 != deepLink.length - 1 && (y0VarM instanceof b1)) {
                while (true) {
                    b1Var = (b1) y0VarM;
                    if (!(b1Var.M(b1Var.U()) instanceof b1)) {
                        break;
                    }
                    y0VarM = b1Var.M(b1Var.U());
                }
                b1Var2 = b1Var;
            }
            i15++;
        }
    }

    public final void G0(b1 graph, Bundle startDestinationArgs) {
        u uVar;
        if (!this.backQueue.isEmpty() && O() == androidx.lifecycle.j.b.DESTROYED) {
            throw new IllegalStateException("You cannot set a new graph on a NavController with entries on the back stack after the NavController has been destroyed. Please ensure that your NavHost has the same lifetime as your NavController.");
        }
        if (!fr.t.c(this._graph, graph)) {
            b1 b1Var = this._graph;
            if (b1Var != null) {
                Iterator it = new ArrayList(this.backStackMap.keySet()).iterator();
                while (it.hasNext()) {
                    q(((Integer) it.next()).intValue());
                }
                uVar = this;
                u0(uVar, b1Var.o(), true, false, 4, null);
            } else {
                uVar = this;
            }
            uVar._graph = graph;
            i0(startDestinationArgs);
            return;
        }
        int iS = graph.S().s();
        for (int i15 = 0; i15 < iS; i15++) {
            y0 y0VarT = graph.S().t(i15);
            this._graph.S().q(this._graph.S().m(i15), y0VarT);
        }
        for (p136y9.w wVar : this.backQueue) {
            List<y0> listS = pq.v.S(eu.k.P(y0.INSTANCE.e(wVar.getDestination())));
            y0 y0VarM = this._graph;
            for (y0 y0Var : listS) {
                if (!fr.t.c(y0Var, this._graph) || !fr.t.c(y0VarM, graph)) {
                    if (y0VarM instanceof b1) {
                        y0VarM = ((b1) y0VarM).M(y0Var.o());
                    }
                }
            }
            wVar.r(y0VarM);
        }
    }

    public final <T> String H(T route) {
        y0 y0VarF = F(this, N(), ca.d.c(uu.p.b(q0.c(route.getClass()))), true, null, 8, null);
        if (y0VarF == null) {
            throw new IllegalArgumentException(("Destination with route " + q0.c(route.getClass()).D() + " cannot be found in navigation graph " + this._graph).toString());
        }
        Map<String, p136y9.t> mapK = y0VarF.k();
        LinkedHashMap linkedHashMap = new LinkedHashMap(v0.e(mapK.size()));
        Iterator<T> it = mapK.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            linkedHashMap.put(entry.getKey(), ((p136y9.t) entry.getValue()).a());
        }
        return ca.d.d(route, linkedHashMap);
    }

    public final void H0(androidx.p016lifecycle.q owner) {
        androidx.p016lifecycle.j lifecycleRegistry;
        if (fr.t.c(owner, this.lifecycleOwner)) {
            return;
        }
        androidx.p016lifecycle.q qVar = this.lifecycleOwner;
        if (qVar != null && (lifecycleRegistry = qVar.getLifecycleRegistry()) != null) {
            lifecycleRegistry.d(this.lifecycleObserver);
        }
        this.lifecycleOwner = owner;
        owner.getLifecycleRegistry().a(this.lifecycleObserver);
    }

    public final pq.m<p136y9.w> I() {
        return this.backQueue;
    }

    public final void I0(x0 viewModelStore) {
        j0 j0Var = this.viewModel;
        j0.Companion aVar = j0.INSTANCE;
        if (fr.t.c(j0Var, aVar.a(viewModelStore))) {
            return;
        }
        if (!this.backQueue.isEmpty()) {
            throw new IllegalStateException("ViewModelStore should be set before setGraph call");
        }
        this.viewModel = aVar.a(viewModelStore);
    }

    public final p136y9.w J(int destinationId) {
        p136y9.w wVarPrevious;
        pq.m<p136y9.w> mVar = this.backQueue;
        ListIterator<p136y9.w> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                wVarPrevious = null;
                break;
            }
            wVarPrevious = listIterator.previous();
        } while (wVarPrevious.getDestination().o() != destinationId);
        p136y9.w wVar = wVarPrevious;
        if (wVar != null) {
            return wVar;
        }
        throw new IllegalArgumentException(("No destination with ID " + destinationId + " is on the NavController's back stack. The current destination is " + M()).toString());
    }

    public final p136y9.w J0(p136y9.w child) {
        p136y9.w wVarRemove = this.childToParentEntries.remove(child);
        if (wVarRemove == null) {
            return null;
        }
        a aVar = this.parentToChildCount.get(wVarRemove);
        Integer numValueOf = aVar != null ? Integer.valueOf(aVar.a()) : null;
        if (numValueOf != null && numValueOf.intValue() == 0) {
            e0.b bVar = this.navigatorState.get(this._navigatorProvider.e(wVarRemove.getDestination().getNavigatorName()));
            if (bVar != null) {
                bVar.f(wVarRemove);
            }
            this.parentToChildCount.remove(wVarRemove);
        }
        return wVarRemove;
    }

    public final p136y9.w K(String route) {
        p136y9.w wVarPrevious;
        p136y9.w wVar;
        pq.m<p136y9.w> mVar = this.backQueue;
        ListIterator<p136y9.w> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                wVarPrevious = null;
                break;
            }
            wVarPrevious = listIterator.previous();
            wVar = wVarPrevious;
        } while (!wVar.getDestination().v(route, wVar.c()));
        p136y9.w wVar2 = wVarPrevious;
        if (wVar2 != null) {
            return wVar2;
        }
        throw new IllegalArgumentException(("No destination with route " + route + " is on the NavController's back stack. The current destination is " + M()).toString());
    }

    public final void K0() {
        a aVar;
        p0<Set<p136y9.w>> p0VarD;
        Set<p136y9.w> value;
        List<p136y9.w> listI1 = pq.v.i1(this.backQueue);
        if (listI1.isEmpty()) {
            return;
        }
        List listT = pq.v.t(((p136y9.w) pq.v.x0(listI1)).getDestination());
        ArrayList arrayList = new ArrayList();
        if (pq.v.x0(listT) instanceof p136y9.k) {
            Iterator it = pq.v.N0(listI1).iterator();
            while (it.hasNext()) {
                y0 destination = ((p136y9.w) it.next()).getDestination();
                arrayList.add(destination);
                if (!(destination instanceof p136y9.k) && !(destination instanceof b1)) {
                    break;
                }
            }
        }
        HashMap map = new HashMap();
        for (p136y9.w wVar : pq.v.N0(listI1)) {
            androidx.lifecycle.j.b bVarJ = wVar.j();
            y0 destination2 = wVar.getDestination();
            y0 y0Var = (y0) pq.v.n0(listT);
            if (y0Var != null && y0Var.o() == destination2.o()) {
                androidx.lifecycle.j.b bVar = androidx.lifecycle.j.b.RESUMED;
                if (bVarJ != bVar) {
                    e0.b bVar2 = this.navigatorState.get(get_navigatorProvider().e(wVar.getDestination().getNavigatorName()));
                    if (fr.t.c((bVar2 == null || (p0VarD = bVar2.d()) == null || (value = p0VarD.getValue()) == null) ? null : Boolean.valueOf(value.contains(wVar)), Boolean.TRUE) || ((aVar = this.parentToChildCount.get(wVar)) != null && aVar.b() == 0)) {
                        map.put(wVar, androidx.lifecycle.j.b.STARTED);
                    } else {
                        map.put(wVar, bVar);
                    }
                }
                y0 y0Var2 = (y0) pq.v.n0(arrayList);
                if (y0Var2 != null && y0Var2.o() == destination2.o()) {
                    pq.v.K(arrayList);
                }
                pq.v.K(listT);
                b1 parent = destination2.getParent();
                if (parent != null) {
                    listT.add(parent);
                }
            } else if (arrayList.isEmpty() || destination2.o() != ((y0) pq.v.l0(arrayList)).o()) {
                wVar.t(androidx.lifecycle.j.b.CREATED);
            } else {
                y0 y0Var3 = (y0) pq.v.K(arrayList);
                if (bVarJ == androidx.lifecycle.j.b.RESUMED) {
                    wVar.t(androidx.lifecycle.j.b.STARTED);
                } else {
                    androidx.lifecycle.j.b bVar3 = androidx.lifecycle.j.b.STARTED;
                    if (bVarJ != bVar3) {
                        map.put(wVar, bVar3);
                    }
                }
                b1 parent2 = y0Var3.getParent();
                if (parent2 != null && !arrayList.contains(parent2)) {
                    arrayList.add(parent2);
                }
            }
        }
        for (p136y9.w wVar2 : listI1) {
            androidx.lifecycle.j.b bVar4 = (androidx.lifecycle.j.b) map.get(wVar2);
            if (bVar4 != null) {
                wVar2.t(bVar4);
            } else {
                wVar2.u();
            }
        }
    }

    public final p136y9.w L() {
        return this.backQueue.s();
    }

    public final y0 M() {
        p136y9.w wVarL = L();
        if (wVarL != null) {
            return wVarL.getDestination();
        }
        return null;
    }

    public final b1 N() {
        b1 b1Var = this._graph;
        if (b1Var != null) {
            return b1Var;
        }
        throw new IllegalStateException("You must call setGraph() before calling getGraph()");
    }

    public final androidx.lifecycle.j.b O() {
        return this.lifecycleOwner == null ? androidx.lifecycle.j.b.CREATED : this.hostLifecycleState;
    }

    public final h P() {
        return this.navController.getNavContext();
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final t1 get_navigatorProvider() {
        return this._navigatorProvider;
    }

    public final b1 R() {
        y0 destination;
        p136y9.w wVarS = this.backQueue.s();
        if (wVarS == null || (destination = wVarS.getDestination()) == null) {
            destination = this._graph;
        }
        b1 b1Var = destination instanceof b1 ? (b1) destination : null;
        return b1Var == null ? destination.getParent() : b1Var;
    }

    public final p0<List<p136y9.w>> S() {
        return this.visibleEntries;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final b1 get_graph() {
        return this._graph;
    }

    public final t1 U() {
        return this._navigatorProvider;
    }

    public final void Z(p136y9.w child, p136y9.w parent) {
        this.childToParentEntries.put(child, parent);
        if (this.parentToChildCount.get(parent) == null) {
            this.parentToChildCount.put(parent, new a(0));
        }
        this.parentToChildCount.get(parent).c();
    }

    public final void a0(e0.b state, p136y9.w entry, er.a<i0> superCallback) {
        j0 j0Var;
        boolean zC = fr.t.c(this.entrySavedState.get(entry), Boolean.TRUE);
        superCallback.a();
        this.entrySavedState.remove(entry);
        if (this.backQueue.contains(entry)) {
            if (state.getIsNavigating()) {
                return;
            }
            K0();
            this._currentBackStack.f(pq.v.i1(this.backQueue));
            this._visibleEntries.f(x0());
            return;
        }
        J0(entry);
        if (entry.getLifecycleRegistry().getState().e(androidx.lifecycle.j.b.CREATED)) {
            entry.t(androidx.lifecycle.j.b.DESTROYED);
        }
        pq.m<p136y9.w> mVar = this.backQueue;
        if (mVar == null || !mVar.isEmpty()) {
            Iterator<p136y9.w> it = mVar.iterator();
            while (it.hasNext()) {
                if (fr.t.c(it.next().getId(), entry.getId())) {
                }
            }
            if (!zC && (j0Var = this.viewModel) != null) {
                j0Var.Z8(entry.getId());
            }
        } else if (!zC) {
            j0Var.Z8(entry.getId());
        }
        K0();
        this._visibleEntries.f(x0());
    }

    public final void c0(String route, i1 navOptions, s1.a navigatorExtras) {
        oq.r[] rVarArr;
        if (this._graph == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + route + ". Navigation graph has not been set for NavController " + this + '.').toString());
        }
        b1 b1VarR = R();
        y0.b bVarX = b1VarR.X(route, true, true, b1VarR);
        if (bVarX == null) {
            throw new IllegalArgumentException("Navigation destination that matches route " + route + " cannot be found in the navigation graph " + this._graph);
        }
        y0 destination = bVarX.getDestination();
        Bundle bundleG = destination.g(bVarX.getMatchingArgs());
        if (bundleG == null) {
            Map mapI = v0.i();
            if (mapI.isEmpty()) {
                rVarArr = new oq.r[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(oq.y.a((String) entry.getKey(), entry.getValue()));
                }
                rVarArr = (oq.r[]) arrayList.toArray(new oq.r[0]);
            }
            bundleG = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
            ua.k.a(bundleG);
        }
        y0 destination2 = bVarX.getDestination();
        this.navController.V(y9.w0.a.INSTANCE.a(n1.a(y0.INSTANCE.c(destination.u()))).a(), bundleG);
        g0(destination2, bundleG, navOptions, navigatorExtras);
    }

    public final void d0(p136y9.w0 request) {
        e0(request, null);
    }

    public final void e0(p136y9.w0 request, i1 navOptions) {
        f0(request, navOptions, null);
    }

    public final void f0(p136y9.w0 request, i1 navOptions, s1.a navigatorExtras) {
        oq.r[] rVarArr;
        if (this._graph == null) {
            throw new IllegalArgumentException(("Cannot navigate to " + request + ". Navigation graph has not been set for NavController " + this.navController + '.').toString());
        }
        b1 b1VarR = R();
        y0.b bVarW = b1VarR.W(request, true, true, b1VarR);
        if (bVarW == null) {
            throw new IllegalArgumentException("Navigation destination that matches request " + request + " cannot be found in the navigation graph " + this._graph);
        }
        Bundle bundleG = bVarW.getDestination().g(bVarW.getMatchingArgs());
        if (bundleG == null) {
            Map mapI = v0.i();
            if (mapI.isEmpty()) {
                rVarArr = new oq.r[0];
            } else {
                ArrayList arrayList = new ArrayList(mapI.size());
                for (Map.Entry entry : mapI.entrySet()) {
                    arrayList.add(oq.y.a((String) entry.getKey(), entry.getValue()));
                }
                rVarArr = (oq.r[]) arrayList.toArray(new oq.r[0]);
            }
            bundleG = e6.c.a((oq.r[]) Arrays.copyOf(rVarArr, rVarArr.length));
            ua.k.a(bundleG);
        }
        y0 destination = bVarW.getDestination();
        this.navController.V(request, bundleG);
        g0(destination, bundleG, navOptions, navigatorExtras);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x008f  */
    public final void g0(final y0 node, Bundle args, i1 navOptions, s1.a navigatorExtras) {
        boolean z15;
        boolean z16;
        boolean zR0;
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((e0.b) it.next()).m(true);
        }
        final l0 l0Var = new l0();
        if (navOptions == null) {
            z15 = false;
        } else {
            if (navOptions.getPopUpToRoute() != null) {
                zR0 = t0(navOptions.getPopUpToRoute(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.g() != null) {
                zR0 = r0(ca.d.c(uu.p.b(navOptions.g())), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToRouteObject() != null) {
                zR0 = s0(navOptions.getPopUpToRouteObject(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else if (navOptions.getPopUpToId() != -1) {
                zR0 = r0(navOptions.getPopUpToId(), navOptions.getPopUpToInclusive(), navOptions.getPopUpToSaveState());
            } else {
                z15 = false;
            }
            z15 = zR0;
        }
        final Bundle bundleG = node.g(args);
        if (navOptions != null && navOptions.getRestoreState() && this.backStackMap.containsKey(Integer.valueOf(node.o()))) {
            l0Var.f66404a = C0(node.o(), bundleG, navOptions, navigatorExtras);
            z16 = false;
        } else {
            z16 = navOptions != null && navOptions.getSingleTop() && W(node, args);
            if (!z16) {
                h0(this._navigatorProvider.e(node.getNavigatorName()), pq.v.e(p136y9.w.Companion.b(p136y9.w.INSTANCE, P(), node, bundleG, O(), this.viewModel, null, null, 96, null)), navOptions, navigatorExtras, new er.l() { // from class: ba.i
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.b0(l0Var, this, node, bundleG, (p136y9.w) obj);
                    }
                });
            }
        }
        this.updateOnBackPressedCallbackEnabledCallback.a();
        Iterator<T> it4 = this.navigatorState.values().iterator();
        while (it4.hasNext()) {
            ((e0.b) it4.next()).m(false);
        }
        if (z15 || l0Var.f66404a || z16) {
            s();
        } else {
            K0();
        }
    }

    public final void h0(s1<? extends y0> navigator, List<p136y9.w> entries, i1 navOptions, s1.a navigatorExtras, er.l<? super p136y9.w, i0> handler) {
        this.addToBackStackHandler = handler;
        navigator.g(entries, navOptions, navigatorExtras);
        this.addToBackStackHandler = null;
    }

    public final void i0(Bundle startDestinationArgs) {
        Bundle bundle = this.navigatorStateToRestore;
        if (bundle != null) {
            Bundle bundleA = ua.c.a(bundle);
            if (ua.c.b(bundleA, "android-support-nav:controller:navigatorState:names")) {
                for (String str : ua.c.t(bundleA, "android-support-nav:controller:navigatorState:names")) {
                    s1 s1VarE = this._navigatorProvider.e(str);
                    if (ua.c.b(bundleA, str)) {
                        s1VarE.l(ua.c.o(bundleA, str));
                    }
                }
            }
        }
        Bundle[] bundleArr = this.backStackToRestore;
        if (bundleArr != null) {
            for (Bundle bundle2 : bundleArr) {
                p136y9.x xVar = new p136y9.x(bundle2);
                y0 y0VarD = D(this, xVar.b(), null, 2, null);
                if (y0VarD == null) {
                    throw new IllegalStateException("Restoring the Navigation back stack failed: destination " + y0.INSTANCE.d(P(), xVar.b()) + " cannot be found from the current destination " + M());
                }
                p136y9.w wVarD = xVar.d(P(), y0VarD, O(), this.viewModel);
                s1<? extends y0> s1VarE2 = this._navigatorProvider.e(y0VarD.getNavigatorName());
                Map<s1<? extends y0>, e0.b> map = this.navigatorState;
                e0.b bVarK = map.get(s1VarE2);
                if (bVarK == null) {
                    bVarK = this.navController.k(s1VarE2);
                    map.put(s1VarE2, bVarK);
                }
                this.backQueue.add(wVarD);
                bVarK.p(wVarD);
                b1 parent = wVarD.getDestination().getParent();
                if (parent != null) {
                    Z(wVarD, J(parent.o()));
                }
            }
            this.updateOnBackPressedCallbackEnabledCallback.a();
            this.backStackToRestore = null;
        }
        Collection<s1<? extends y0>> collectionValues = this._navigatorProvider.f().values();
        ArrayList<s1<? extends y0>> arrayList = new ArrayList();
        for (Object obj : collectionValues) {
            if (!((s1) obj).getIsAttached()) {
                arrayList.add(obj);
            }
        }
        for (s1<? extends y0> s1Var : arrayList) {
            Map<s1<? extends y0>, e0.b> map2 = this.navigatorState;
            e0.b bVarK2 = map2.get(s1Var);
            if (bVarK2 == null) {
                bVarK2 = this.navController.k(s1Var);
                map2.put(s1Var, bVarK2);
            }
            s1Var.i(bVarK2);
        }
        if (this._graph == null || !this.backQueue.isEmpty()) {
            s();
        } else {
            if (this.navController.j()) {
                return;
            }
            g0(this._graph, startDestinationArgs, null, null);
        }
    }

    public final void k0(e0.b state, p136y9.w popUpTo, boolean saveState, final er.a<i0> superCallback) {
        s1 s1VarE = this._navigatorProvider.e(popUpTo.getDestination().getNavigatorName());
        this.entrySavedState.put(popUpTo, Boolean.valueOf(saveState));
        if (!fr.t.c(s1VarE, state.q())) {
            this.navigatorState.get(s1VarE).h(popUpTo, saveState);
            return;
        }
        er.l<? super p136y9.w, i0> lVar = this.popFromBackStackHandler;
        if (lVar == null) {
            p0(popUpTo, new er.a() { // from class: ba.k
                @Override // er.a
                public final Object a() {
                    return u.j0(superCallback);
                }
            });
        } else {
            lVar.b(popUpTo);
            superCallback.a();
        }
    }

    public final boolean l0() {
        if (this.backQueue.isEmpty()) {
            return false;
        }
        return m0(M().o(), true);
    }

    public final boolean m0(int destinationId, boolean inclusive) {
        return n0(destinationId, inclusive, false);
    }

    public final boolean n0(int destinationId, boolean inclusive, boolean saveState) {
        return r0(destinationId, inclusive, saveState) && s();
    }

    public final void o(e0.c listener) {
        this.onDestinationChangedListeners.add(listener);
        if (this.backQueue.isEmpty()) {
            return;
        }
        p136y9.w wVarLast = this.backQueue.last();
        listener.a(this.navController, wVarLast.getDestination(), wVarLast.c());
    }

    public final boolean o0(String route, boolean inclusive, boolean saveState) {
        return t0(route, inclusive, saveState) && s();
    }

    public final void p0(p136y9.w popUpTo, er.a<i0> onComplete) {
        int iIndexOf = this.backQueue.indexOf(popUpTo);
        if (iIndexOf < 0) {
            b.INSTANCE.a("NavController", "Ignoring pop of " + popUpTo + " as it was not found on the current back stack");
            return;
        }
        int i15 = iIndexOf + 1;
        if (i15 != this.backQueue.size()) {
            r0(this.backQueue.get(i15).getDestination().o(), true, false);
        }
        w0(this, popUpTo, false, null, 6, null);
        onComplete.a();
        this.updateOnBackPressedCallbackEnabledCallback.a();
        s();
    }

    public final boolean q(int destinationId) {
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            ((e0.b) it.next()).m(true);
        }
        boolean zC0 = C0(destinationId, null, Function1.a(new er.l() { // from class: ba.r
            @Override // er.l
            public final Object b(Object obj) {
                return u.p((j1) obj);
            }
        }), null);
        Iterator<T> it4 = this.navigatorState.values().iterator();
        while (it4.hasNext()) {
            ((e0.b) it4.next()).m(false);
        }
        return zC0 && r0(destinationId, true, false);
    }

    public final void q0(s1<? extends y0> navigator, p136y9.w popUpTo, boolean saveState, er.l<? super p136y9.w, i0> handler) {
        this.popFromBackStackHandler = handler;
        navigator.n(popUpTo, saveState);
        this.popFromBackStackHandler = null;
    }

    public final p136y9.w r(y0 destination, Bundle arguments) {
        return p136y9.w.Companion.b(p136y9.w.INSTANCE, P(), destination, arguments, O(), this.viewModel, null, null, 96, null);
    }

    public final boolean r0(int destinationId, boolean inclusive, boolean saveState) {
        y0 destination;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = pq.v.N0(this.backQueue).iterator();
        do {
            if (!it.hasNext()) {
                destination = null;
                break;
            }
            destination = ((p136y9.w) it.next()).getDestination();
            s1 s1VarE = this._navigatorProvider.e(destination.getNavigatorName());
            if (inclusive || destination.o() != destinationId) {
                arrayList.add(s1VarE);
            }
        } while (destination.o() != destinationId);
        if (destination != null) {
            return y(arrayList, destination, inclusive, saveState);
        }
        String strD = y0.INSTANCE.d(P(), destinationId);
        b.INSTANCE.a("NavController", "Ignoring popBackStack to destination " + strD + " as it was not found on the current back stack");
        return false;
    }

    public final boolean s() {
        while (!this.backQueue.isEmpty() && (this.backQueue.last().getDestination() instanceof b1)) {
            w0(this, this.backQueue.last(), false, null, 6, null);
        }
        p136y9.w wVarS = this.backQueue.s();
        if (wVarS != null) {
            this.backStackEntriesToDispatch.add(wVarS);
        }
        this.dispatchReentrantCount++;
        K0();
        int i15 = this.dispatchReentrantCount - 1;
        this.dispatchReentrantCount = i15;
        if (i15 == 0) {
            List<p136y9.w> listI1 = pq.v.i1(this.backStackEntriesToDispatch);
            this.backStackEntriesToDispatch.clear();
            for (p136y9.w wVar : listI1) {
                Iterator it = pq.v.f1(this.onDestinationChangedListeners).iterator();
                while (it.hasNext()) {
                    ((e0.c) it.next()).a(this.navController, wVar.getDestination(), wVar.c());
                }
                this._currentBackStackEntryFlow.f(wVar);
            }
            this._currentBackStack.f(pq.v.i1(this.backQueue));
            this._visibleEntries.f(x0());
        }
        return wVarS != null;
    }

    public final <T> boolean s0(T route, boolean inclusive, boolean saveState) {
        return t0(H(route), inclusive, saveState);
    }

    public final boolean t0(String route, boolean inclusive, boolean saveState) {
        p136y9.w wVarPrevious;
        boolean zV;
        if (this.backQueue.isEmpty()) {
            return false;
        }
        ArrayList arrayList = new ArrayList();
        pq.m<p136y9.w> mVar = this.backQueue;
        ListIterator<p136y9.w> listIterator = mVar.listIterator(mVar.size());
        do {
            if (!listIterator.hasPrevious()) {
                wVarPrevious = null;
                break;
            }
            wVarPrevious = listIterator.previous();
            p136y9.w wVar = wVarPrevious;
            zV = wVar.getDestination().v(route, wVar.c());
            if (inclusive || !zV) {
                arrayList.add(this._navigatorProvider.e(wVar.getDestination().getNavigatorName()));
            }
        } while (!zV);
        p136y9.w wVar2 = wVarPrevious;
        y0 destination = wVar2 != null ? wVar2.getDestination() : null;
        if (destination != null) {
            return y(arrayList, destination, inclusive, saveState);
        }
        b.INSTANCE.a("NavController", "Ignoring popBackStack to route " + route + " as it was not found on the current back stack");
        return false;
    }

    public final void v0(p136y9.w popUpTo, boolean saveState, pq.m<p136y9.x> savedState) {
        j0 j0Var;
        p0<Set<p136y9.w>> p0VarD;
        Set<p136y9.w> value;
        p136y9.w wVarLast = this.backQueue.last();
        if (!fr.t.c(wVarLast, popUpTo)) {
            throw new IllegalStateException(("Attempted to pop " + popUpTo.getDestination() + ", which is not the top of the back stack (" + wVarLast.getDestination() + ')').toString());
        }
        pq.v.M(this.backQueue);
        e0.b bVar = this.navigatorState.get(get_navigatorProvider().e(wVarLast.getDestination().getNavigatorName()));
        boolean z15 = true;
        if ((bVar == null || (p0VarD = bVar.d()) == null || (value = p0VarD.getValue()) == null || !value.contains(wVarLast)) && !this.parentToChildCount.containsKey(wVarLast)) {
            z15 = false;
        }
        androidx.lifecycle.j.b state = wVarLast.getLifecycleRegistry().getState();
        androidx.lifecycle.j.b bVar2 = androidx.lifecycle.j.b.CREATED;
        if (state.e(bVar2)) {
            if (saveState) {
                wVarLast.t(bVar2);
                savedState.addFirst(new p136y9.x(wVarLast));
            }
            if (z15) {
                wVarLast.t(bVar2);
            } else {
                wVarLast.t(androidx.lifecycle.j.b.DESTROYED);
                J0(wVarLast);
            }
        }
        if (saveState || z15 || (j0Var = this.viewModel) == null) {
            return;
        }
        j0Var.Z8(wVarLast.getId());
    }

    public final List<p136y9.w> x0() {
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = this.navigatorState.values().iterator();
        while (it.hasNext()) {
            Set<p136y9.w> value = ((e0.b) it.next()).d().getValue();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : value) {
                p136y9.w wVar = (p136y9.w) obj;
                if (!arrayList.contains(wVar) && !wVar.j().e(androidx.lifecycle.j.b.STARTED)) {
                    arrayList2.add(obj);
                }
            }
            pq.v.D(arrayList, arrayList2);
        }
        pq.m<p136y9.w> mVar = this.backQueue;
        ArrayList arrayList3 = new ArrayList();
        for (p136y9.w wVar2 : mVar) {
            p136y9.w wVar3 = wVar2;
            if (!arrayList.contains(wVar3) && wVar3.j().e(androidx.lifecycle.j.b.STARTED)) {
                arrayList3.add(wVar2);
            }
        }
        pq.v.D(arrayList, arrayList3);
        ArrayList arrayList4 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (!(((p136y9.w) obj2).getDestination() instanceof b1)) {
                arrayList4.add(obj2);
            }
        }
        return arrayList4;
    }

    public final boolean y(List<? extends s1<?>> popOperations, y0 foundDestination, boolean inclusive, boolean saveState) {
        final u uVar;
        final boolean z15;
        final l0 l0Var = new l0();
        final pq.m<p136y9.x> mVar = new pq.m<>();
        Iterator<? extends s1<?>> it = popOperations.iterator();
        while (true) {
            if (!it.hasNext()) {
                uVar = this;
                z15 = saveState;
                break;
            }
            s1<? extends y0> s1Var = (s1) it.next();
            final l0 l0Var2 = new l0();
            uVar = this;
            z15 = saveState;
            q0(s1Var, this.backQueue.last(), z15, new er.l() { // from class: ba.m
                @Override // er.l
                public final Object b(Object obj) {
                    return u.t(l0Var2, l0Var, uVar, z15, mVar, (p136y9.w) obj);
                }
            });
            if (!l0Var2.f66404a) {
                break;
            }
            saveState = z15;
        }
        if (z15) {
            if (!inclusive) {
                for (y0 y0Var : eu.k.N(eu.k.o(foundDestination, new er.l() { // from class: ba.n
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.u((y0) obj);
                    }
                }), new er.l() { // from class: ba.o
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(u.v(this.f17769a, (y0) obj));
                    }
                })) {
                    Map<Integer, String> map = uVar.backStackMap;
                    Integer numValueOf = Integer.valueOf(y0Var.o());
                    p136y9.x xVarN = mVar.n();
                    map.put(numValueOf, xVarN != null ? xVarN.c() : null);
                }
            }
            if (!mVar.isEmpty()) {
                p136y9.x xVarFirst = mVar.first();
                Iterator it4 = eu.k.N(eu.k.o(D(this, xVarFirst.b(), null, 2, null), new er.l() { // from class: ba.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return u.w((y0) obj);
                    }
                }), new er.l() { // from class: ba.q
                    @Override // er.l
                    public final Object b(Object obj) {
                        return Boolean.valueOf(u.x(this.f17770a, (y0) obj));
                    }
                }).iterator();
                while (it4.hasNext()) {
                    uVar.backStackMap.put(Integer.valueOf(((y0) it4.next()).o()), xVarFirst.c());
                }
                if (uVar.backStackMap.values().contains(xVarFirst.c())) {
                    uVar.backStackStates.put(xVarFirst.c(), mVar);
                }
            }
        }
        uVar.updateOnBackPressedCallbackEnabledCallback.a();
        return l0Var.f66404a;
    }

    public final void y0(p136y9.w entry) {
        if (!this.backQueue.contains(entry)) {
            throw new IllegalStateException("Cannot transition entry that is not in the back stack");
        }
        entry.t(androidx.lifecycle.j.b.STARTED);
    }

    public final void z0(e0.b state, p136y9.w backStackEntry) {
        s1 s1VarE = this._navigatorProvider.e(backStackEntry.getDestination().getNavigatorName());
        if (!fr.t.c(s1VarE, state.q())) {
            e0.b bVar = this.navigatorState.get(s1VarE);
            if (bVar != null) {
                bVar.k(backStackEntry);
                return;
            }
            throw new IllegalStateException(("NavigatorBackStack for " + backStackEntry.getDestination().getNavigatorName() + " should already be created").toString());
        }
        er.l<? super p136y9.w, i0> lVar = this.addToBackStackHandler;
        if (lVar != null) {
            lVar.b(backStackEntry);
            state.p(backStackEntry);
            return;
        }
        b.INSTANCE.a("NavController", "Ignoring add of destination " + backStackEntry.getDestination() + " outside of the call to navigate(). ");
    }
}
