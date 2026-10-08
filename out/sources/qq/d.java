package qq;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import fr.t;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import lr.m;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0017\n\u0002\u0010$\n\u0002\b\u0003\n\u0002\u0010&\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010#\n\u0002\b\u0003\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0010'\n\u0002\b\u0005\b\u0000\u0018\u0000 T*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00032\u00060\u0004j\u0002`\u0005:\u0006`efgbcBG\b\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000e\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010B\t\b\u0016¢\u0006\u0004\b\u000f\u0010\u0011B\u0011\b\u0016\u0012\u0006\u0010\u0012\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0011J\u0017\u0010\u0017\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\fH\u0002¢\u0006\u0004\b\u001d\u0010\u0013J\u0015\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010!\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0017\u0010$\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u0019H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u00142\u0006\u0010&\u001a\u00020\fH\u0002¢\u0006\u0004\b'\u0010\u0013J\u0017\u0010)\u001a\u00020\u00192\u0006\u0010(\u001a\u00020\fH\u0002¢\u0006\u0004\b)\u0010\u001bJ\u0017\u0010*\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0002¢\u0006\u0004\b*\u0010\"J\u0017\u0010,\u001a\u00020\f2\u0006\u0010+\u001a\u00028\u0001H\u0002¢\u0006\u0004\b,\u0010\"J\u0017\u0010.\u001a\u00020\u00142\u0006\u0010-\u001a\u00020\fH\u0002¢\u0006\u0004\b.\u0010\u0013J\u0017\u00100\u001a\u00020\u00142\u0006\u0010/\u001a\u00020\fH\u0002¢\u0006\u0004\b0\u0010\u0013J\u001f\u00103\u001a\u00020\u00192\u000e\u00102\u001a\n\u0012\u0002\b\u0003\u0012\u0002\b\u000301H\u0002¢\u0006\u0004\b3\u00104J#\u00107\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0002¢\u0006\u0004\b7\u00108J)\u0010\u0001\u001a\u00020\u00192\u0018\u0010:\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010509H\u0003¢\u0006\u0004\b\u0001\u0010;J\u0019\u0010<\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101¢\u0006\u0004\b<\u0010=J\u000f\u0010>\u001a\u00020\u0019H\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\b@\u0010AJ\u0017\u0010B\u001a\u00020\u00192\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bB\u0010AJ\u001a\u0010C\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\bC\u0010DJ!\u0010E\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u00002\u0006\u0010+\u001a\u00028\u0001H\u0016¢\u0006\u0004\bE\u0010FJ%\u0010G\u001a\u00020\u00142\u0014\u0010:\u001a\u0010\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000101H\u0016¢\u0006\u0004\bG\u0010HJ\u0019\u0010I\u001a\u0004\u0018\u00018\u00012\u0006\u0010 \u001a\u00028\u0000H\u0016¢\u0006\u0004\bI\u0010DJ\u000f\u0010J\u001a\u00020\u0014H\u0016¢\u0006\u0004\bJ\u0010\u0011J\u001a\u0010L\u001a\u00020\u00192\b\u00102\u001a\u0004\u0018\u00010KH\u0096\u0002¢\u0006\u0004\bL\u0010AJ\u000f\u0010M\u001a\u00020\fH\u0016¢\u0006\u0004\bM\u0010NJ\u000f\u0010P\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u000f\u0010\u0016\u001a\u00020\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010(\u001a\u00020\f2\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\b(\u0010\"J\u0017\u0010R\u001a\u00020\u00192\u0006\u0010 \u001a\u00028\u0000H\u0000¢\u0006\u0004\bR\u0010AJ#\u0010S\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bS\u00108J\u001b\u0010T\u001a\u00020\u00192\n\u0010<\u001a\u0006\u0012\u0002\b\u000309H\u0000¢\u0006\u0004\bT\u0010;J#\u0010U\u001a\u00020\u00192\u0012\u00106\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u000105H\u0000¢\u0006\u0004\bU\u00108J\u0017\u0010\u0002\u001a\u00020\u00192\u0006\u0010V\u001a\u00028\u0001H\u0000¢\u0006\u0004\b\u0002\u0010AJ\u001b\u0010X\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010WH\u0000¢\u0006\u0004\bX\u0010YJ\u001b\u0010[\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010ZH\u0000¢\u0006\u0004\b[\u0010\\J\u001b\u0010^\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010]H\u0000¢\u0006\u0004\b^\u0010_R\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bb\u0010aR\u0016\u0010\n\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bc\u0010dR\u0016\u0010\u000b\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\be\u0010dR\u0016\u0010\r\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bf\u0010!R\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bg\u0010!R\u0016\u0010i\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010!R\u0016\u0010k\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010!R$\u0010n\u001a\u00020\f2\u0006\u0010+\u001a\u00020\f8\u0016@RX\u0096\u000e¢\u0006\f\n\u0004\bl\u0010!\u001a\u0004\bm\u0010NR\u001e\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010pR\u001e\u0010u\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010x\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u0001\u0018\u00010v8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b<\u0010wR$\u0010{\u001a\u00020\u00192\u0006\u0010+\u001a\u00020\u00198\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b\u0016\u0010y\u001a\u0004\bz\u0010?R\u0014\u0010}\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b|\u0010NR\u001c\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000~8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001R\u001e\u0010\u0085\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0082\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001R*\u0010\u0088\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0086\u00010~8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0080\u0001R\u0016\u0010\u008a\u0001\u001a\u00020\f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010N¨\u0006\u008b\u0001"}, d2 = {"Lqq/d;", "K", "V", "", "Ljava/io/Serializable;", "Lkotlin/io/Serializable;", "", "keysArray", "valuesArray", "", "presenceArray", "hashArray", "", "maxProbeDistance", "length", "<init>", "([Ljava/lang/Object;[Ljava/lang/Object;[I[III)V", "()V", "initialCapacity", "(I)V", "Loq/i0;", "N", "n", "u", "extraCapacity", "", "W", "(I)Z", "minCapacity", "t", "k", "()[Ljava/lang/Object;", "key", "I", "(Ljava/lang/Object;)I", "updateHashArray", "o", "(Z)V", "newHashSize", "O", "i", "M", "w", "value", "y", "index", "R", "removedHash", "T", "", "other", "s", "(Ljava/util/Map;)Z", "", "entry", i.f37094u, "(Ljava/util/Map$Entry;)Z", "", "from", "(Ljava/util/Collection;)Z", "m", "()Ljava/util/Map;", "isEmpty", "()Z", "containsKey", "(Ljava/lang/Object;)Z", "containsValue", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "put", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "putAll", "(Ljava/util/Map;)V", "remove", "clear", "", "equals", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "U", "r", "p", "Q", "element", "Lqq/d$e;", "J", "()Lqq/d$e;", "Lqq/d$f;", "X", "()Lqq/d$f;", "Lqq/d$b;", "v", "()Lqq/d$b;", "a", "[Ljava/lang/Object;", "b", "c", "[I", "d", "e", "f", "g", "hashShift", "h", "modCount", "j", "E", "size", "Lqq/f;", "Lqq/f;", "keysView", "Lqq/g;", "l", "Lqq/g;", "valuesView", "Lqq/e;", "Lqq/e;", "entriesView", "Z", "isReadOnly$kotlin_stdlib", "isReadOnly", "C", "hashSize", "", ip.a.f96138c, "()Ljava/util/Set;", "keys", "", "G", "()Ljava/util/Collection;", "values", "", "B", "entries", "A", "capacity", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
public final class d<K, V> implements Map<K, V>, Serializable, gr.e {

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final d f168029q;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private K[] keysArray;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private V[] valuesArray;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private int[] presenceArray;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private int[] hashArray;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int maxProbeDistance;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int length;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private int hashShift;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int modCount;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int size;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private qq.f<K> keysView;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private g<V> valuesView;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private qq.e<K, V> entriesView;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean isReadOnly;

    /* JADX INFO: renamed from: qq.d$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\n\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\t\u0010\u0007R&\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000b0\n8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0013\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0013\u0010\u0011R\u0014\u0010\u0014\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0011¨\u0006\u0015"}, d2 = {"Lqq/d$a;", "", "<init>", "()V", "", "capacity", "c", "(I)I", "hashSize", "d", "Lqq/d;", "", "Empty", "Lqq/d;", "e", "()Lqq/d;", "MAGIC", "I", "INITIAL_CAPACITY", "INITIAL_MAX_PROBE_DISTANCE", "TOMBSTONE", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int c(int capacity) {
            return Integer.highestOneBit(m.e(capacity, 1) * 3);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int d(int hashSize) {
            return Integer.numberOfLeadingZeros(hashSize) + 1;
        }

        public final d e() {
            return d.f168029q;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00050\u0004B\u001b\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0006¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\nH\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0000¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0014\u001a\u00020\u00132\n\u0010\u0012\u001a\u00060\u0010j\u0002`\u0011¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lqq/d$b;", "K", "V", "Lqq/d$d;", "", "", "Lqq/d;", "map", "<init>", "(Lqq/d;)V", "Lqq/d$c;", "i", "()Lqq/d$c;", "", "l", "()I", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "sb", "Loq/i0;", "k", "(Ljava/lang/StringBuilder;)V", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b<K, V> extends C4244d<K, V> implements Iterator<Map.Entry<K, V>>, gr.a {
        public b(d<K, V> dVar) {
            super(dVar);
        }

        @Override // java.util.Iterator
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public c<K, V> next() {
            a();
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            g(index + 1);
            h(index);
            c<K, V> cVar = new c<>(e(), getLastIndex());
            f();
            return cVar;
        }

        public final void k(StringBuilder sb5) {
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            g(index + 1);
            h(index);
            Object obj = ((d) e()).keysArray[getLastIndex()];
            if (obj == e()) {
                sb5.append("(this Map)");
            } else {
                sb5.append(obj);
            }
            sb5.append('=');
            Object obj2 = ((d) e()).valuesArray[getLastIndex()];
            if (obj2 == e()) {
                sb5.append("(this Map)");
            } else {
                sb5.append(obj2);
            }
            f();
        }

        public final int l() {
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            g(index + 1);
            h(index);
            Object obj = ((d) e()).keysArray[getLastIndex()];
            int iHashCode = obj != null ? obj.hashCode() : 0;
            Object obj2 = ((d) e()).valuesArray[getLastIndex()];
            int iHashCode2 = iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
            f();
            return iHashCode2;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010'\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\r\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0003B#\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00028\u00032\u0006\u0010\r\u001a\u00028\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0096\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019R \u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001cR\u0014\u0010!\u001a\u00028\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00028\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010 ¨\u0006$"}, d2 = {"Lqq/d$c;", "K", "V", "", "Lqq/d;", "map", "", "index", "<init>", "(Lqq/d;I)V", "Loq/i0;", "a", "()V", "newValue", "setValue", "(Ljava/lang/Object;)Ljava/lang/Object;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lqq/d;", "b", "I", "c", "expectedModCount", "getKey", "()Ljava/lang/Object;", "key", "getValue", "value", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class c<K, V> implements Map.Entry<K, V>, gr.e.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d<K, V> map;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int expectedModCount;

        public c(d<K, V> dVar, int i15) {
            this.map = dVar;
            this.index = i15;
            this.expectedModCount = ((d) dVar).modCount;
        }

        private final void a() {
            if (((d) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
            }
        }

        @Override // java.util.Map.Entry
        public boolean equals(Object other) {
            if (!(other instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) other;
            return t.c(entry.getKey(), getKey()) && t.c(entry.getValue(), getValue());
        }

        @Override // java.util.Map.Entry
        public K getKey() {
            a();
            return (K) ((d) this.map).keysArray[this.index];
        }

        @Override // java.util.Map.Entry
        public V getValue() {
            a();
            return (V) ((d) this.map).valuesArray[this.index];
        }

        @Override // java.util.Map.Entry
        public int hashCode() {
            K key = getKey();
            int iHashCode = key != null ? key.hashCode() : 0;
            V value = getValue();
            return iHashCode ^ (value != null ? value.hashCode() : 0);
        }

        @Override // java.util.Map.Entry
        public V setValue(V newValue) {
            a();
            this.map.n();
            Object[] objArrK = this.map.k();
            int i15 = this.index;
            V v15 = (V) objArrK[i15];
            objArrK[i15] = newValue;
            return v15;
        }

        public String toString() {
            StringBuilder sb5 = new StringBuilder();
            sb5.append(getKey());
            sb5.append('=');
            sb5.append(getValue());
            return sb5.toString();
        }
    }

    /* JADX INFO: renamed from: qq.d$d, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0010\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u00020\u0003B\u001b\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\u000f\u0010\u000f\u001a\u00020\bH\u0000¢\u0006\u0004\b\u000f\u0010\nR&\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u001a\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\"\u0010\u001d\u001a\u00020\u00138\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0015\u001a\u0004\b\u001b\u0010\u0017\"\u0004\b\u001c\u0010\u0019R\u0016\u0010\u001e\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010\u0015¨\u0006\u001f"}, d2 = {"Lqq/d$d;", "K", "V", "", "Lqq/d;", "map", "<init>", "(Lqq/d;)V", "Loq/i0;", "f", "()V", "", "hasNext", "()Z", "remove", "a", "Lqq/d;", "e", "()Lqq/d;", "", "b", "I", "c", "()I", "g", "(I)V", "index", "d", "h", "lastIndex", "expectedModCount", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static class C4244d<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final d<K, V> map;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private int index;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private int lastIndex = -1;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private int expectedModCount;

        public C4244d(d<K, V> dVar) {
            this.map = dVar;
            this.expectedModCount = ((d) dVar).modCount;
            f();
        }

        public final void a() {
            if (((d) this.map).modCount != this.expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getIndex() {
            return this.index;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final int getLastIndex() {
            return this.lastIndex;
        }

        public final d<K, V> e() {
            return this.map;
        }

        public final void f() {
            while (this.index < ((d) this.map).length) {
                int[] iArr = ((d) this.map).presenceArray;
                int i15 = this.index;
                if (iArr[i15] >= 0) {
                    return;
                } else {
                    this.index = i15 + 1;
                }
            }
        }

        public final void g(int i15) {
            this.index = i15;
        }

        public final void h(int i15) {
            this.lastIndex = i15;
        }

        public final boolean hasNext() {
            return this.index < ((d) this.map).length;
        }

        public final void remove() {
            a();
            if (this.lastIndex == -1) {
                throw new IllegalStateException("Call next() before removing element from the iterator.");
            }
            this.map.n();
            this.map.R(this.lastIndex);
            this.lastIndex = -1;
            this.expectedModCount = ((d) this.map).modCount;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00020\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0002H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqq/d$e;", "K", "V", "Lqq/d$d;", "", "Lqq/d;", "map", "<init>", "(Lqq/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class e<K, V> extends C4244d<K, V> implements Iterator<K>, gr.a {
        public e(d<K, V> dVar) {
            super(dVar);
        }

        @Override // java.util.Iterator
        public K next() {
            a();
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            g(index + 1);
            h(index);
            K k15 = (K) ((d) e()).keysArray[getLastIndex()];
            f();
            return k15;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u0000*\u0004\b\u0002\u0010\u0001*\u0004\b\u0003\u0010\u00022\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u00032\b\u0012\u0004\u0012\u00028\u00030\u0004B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00028\u0003H\u0096\u0002¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lqq/d$f;", "K", "V", "Lqq/d$d;", "", "Lqq/d;", "map", "<init>", "(Lqq/d;)V", "next", "()Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class f<K, V> extends C4244d<K, V> implements Iterator<V>, gr.a {
        public f(d<K, V> dVar) {
            super(dVar);
        }

        @Override // java.util.Iterator
        public V next() {
            a();
            if (getIndex() >= ((d) e()).length) {
                throw new NoSuchElementException();
            }
            int index = getIndex();
            g(index + 1);
            h(index);
            V v15 = (V) ((d) e()).valuesArray[getLastIndex()];
            f();
            return v15;
        }
    }

    static {
        d dVar = new d(0);
        dVar.isReadOnly = true;
        f168029q = dVar;
    }

    private d(K[] kArr, V[] vArr, int[] iArr, int[] iArr2, int i15, int i16) {
        this.keysArray = kArr;
        this.valuesArray = vArr;
        this.presenceArray = iArr;
        this.hashArray = iArr2;
        this.maxProbeDistance = i15;
        this.length = i16;
        this.hashShift = INSTANCE.d(C());
    }

    private final int C() {
        return this.hashArray.length;
    }

    private final int I(K key) {
        return ((key != null ? key.hashCode() : 0) * (-1640531527)) >>> this.hashShift;
    }

    private final boolean K(Collection<? extends Map.Entry<? extends K, ? extends V>> from) {
        boolean z15 = false;
        if (from.isEmpty()) {
            return false;
        }
        u(from.size());
        Iterator<? extends Map.Entry<? extends K, ? extends V>> it = from.iterator();
        while (it.hasNext()) {
            if (L(it.next())) {
                z15 = true;
            }
        }
        return z15;
    }

    private final boolean L(Map.Entry<? extends K, ? extends V> entry) {
        int i15 = i(entry.getKey());
        V[] vArrK = k();
        if (i15 >= 0) {
            vArrK[i15] = entry.getValue();
            return true;
        }
        int i16 = (-i15) - 1;
        if (t.c(entry.getValue(), vArrK[i16])) {
            return false;
        }
        vArrK[i16] = entry.getValue();
        return true;
    }

    private final boolean M(int i15) {
        int I = I(this.keysArray[i15]);
        int i16 = this.maxProbeDistance;
        while (true) {
            int[] iArr = this.hashArray;
            if (iArr[I] == 0) {
                iArr[I] = i15 + 1;
                this.presenceArray[i15] = I;
                return true;
            }
            i16--;
            if (i16 < 0) {
                return false;
            }
            I = I == 0 ? C() - 1 : I - 1;
        }
    }

    private final void N() {
        this.modCount++;
    }

    private final void O(int newHashSize) {
        N();
        int i15 = 0;
        if (this.length > size()) {
            o(false);
        }
        this.hashArray = new int[newHashSize];
        this.hashShift = INSTANCE.d(newHashSize);
        while (i15 < this.length) {
            int i16 = i15 + 1;
            if (!M(i15)) {
                throw new IllegalStateException("This cannot happen with fixed magic multiplier and grow-only hash array. Have object hashCodes changed?");
            }
            i15 = i16;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R(int index) {
        qq.c.f(this.keysArray, index);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            qq.c.f(vArr, index);
        }
        T(this.presenceArray[index]);
        this.presenceArray[index] = -1;
        this.size = size() - 1;
        N();
    }

    private final void T(int removedHash) {
        int i15;
        int i16;
        while (true) {
            int i17 = removedHash;
            int i18 = 0;
            do {
                removedHash = removedHash == 0 ? C() - 1 : removedHash - 1;
                int[] iArr = this.hashArray;
                i15 = iArr[removedHash];
                i18++;
                if (i18 > this.maxProbeDistance) {
                    iArr[i17] = 0;
                    return;
                } else {
                    if (i15 == 0) {
                        iArr[i17] = 0;
                        return;
                    }
                    i16 = i15 - 1;
                }
            } while (((I(this.keysArray[i16]) - removedHash) & (C() - 1)) < i18);
            this.hashArray[i17] = i15;
            this.presenceArray[i16] = i17;
        }
    }

    private final boolean W(int extraCapacity) {
        int iA = A();
        int i15 = this.length;
        int i16 = iA - i15;
        int size = i15 - size();
        return i16 < extraCapacity && i16 + size >= extraCapacity && size >= A() / 4;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V[] k() {
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            return vArr;
        }
        V[] vArr2 = (V[]) qq.c.d(A());
        this.valuesArray = vArr2;
        return vArr2;
    }

    private final void o(boolean updateHashArray) {
        int i15;
        V[] vArr = this.valuesArray;
        int i16 = 0;
        int i17 = 0;
        while (true) {
            i15 = this.length;
            if (i16 >= i15) {
                break;
            }
            int[] iArr = this.presenceArray;
            int i18 = iArr[i16];
            if (i18 >= 0) {
                K[] kArr = this.keysArray;
                kArr[i17] = kArr[i16];
                if (vArr != null) {
                    vArr[i17] = vArr[i16];
                }
                if (updateHashArray) {
                    iArr[i17] = i18;
                    this.hashArray[i18] = i17 + 1;
                }
                i17++;
            }
            i16++;
        }
        qq.c.g(this.keysArray, i17, i15);
        if (vArr != null) {
            qq.c.g(vArr, i17, this.length);
        }
        this.length = i17;
    }

    private final boolean s(Map<?, ?> other) {
        return size() == other.size() && p(other.entrySet());
    }

    private final void t(int minCapacity) {
        if (minCapacity < 0) {
            throw new OutOfMemoryError();
        }
        if (minCapacity > A()) {
            int iE = pq.d.INSTANCE.e(A(), minCapacity);
            this.keysArray = (K[]) qq.c.e(this.keysArray, iE);
            V[] vArr = this.valuesArray;
            this.valuesArray = vArr != null ? (V[]) qq.c.e(vArr, iE) : null;
            this.presenceArray = Arrays.copyOf(this.presenceArray, iE);
            int iC = INSTANCE.c(iE);
            if (iC > C()) {
                O(iC);
            }
        }
    }

    private final void u(int n15) {
        if (W(n15)) {
            o(true);
        } else {
            t(this.length + n15);
        }
    }

    private final int w(K key) {
        int I = I(key);
        int i15 = this.maxProbeDistance;
        while (true) {
            int i16 = this.hashArray[I];
            if (i16 == 0) {
                return -1;
            }
            int i17 = i16 - 1;
            if (t.c(this.keysArray[i17], key)) {
                return i17;
            }
            i15--;
            if (i15 < 0) {
                return -1;
            }
            I = I == 0 ? C() - 1 : I - 1;
        }
    }

    private final int y(V value) {
        int i15 = this.length;
        while (true) {
            i15--;
            if (i15 < 0) {
                return -1;
            }
            if (this.presenceArray[i15] >= 0 && t.c(this.valuesArray[i15], value)) {
                return i15;
            }
        }
    }

    public final int A() {
        return this.keysArray.length;
    }

    public Set<Map.Entry<K, V>> B() {
        qq.e<K, V> eVar = this.entriesView;
        if (eVar != null) {
            return eVar;
        }
        qq.e<K, V> eVar2 = new qq.e<>(this);
        this.entriesView = eVar2;
        return eVar2;
    }

    public Set<K> D() {
        qq.f<K> fVar = this.keysView;
        if (fVar != null) {
            return fVar;
        }
        qq.f<K> fVar2 = new qq.f<>(this);
        this.keysView = fVar2;
        return fVar2;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public int getSize() {
        return this.size;
    }

    public Collection<V> G() {
        g<V> gVar = this.valuesView;
        if (gVar != null) {
            return gVar;
        }
        g<V> gVar2 = new g<>(this);
        this.valuesView = gVar2;
        return gVar2;
    }

    public final e<K, V> J() {
        return new e<>(this);
    }

    public final boolean Q(Map.Entry<? extends K, ? extends V> entry) {
        n();
        int iW = w(entry.getKey());
        if (iW < 0 || !t.c(this.valuesArray[iW], entry.getValue())) {
            return false;
        }
        R(iW);
        return true;
    }

    public final boolean U(K key) {
        n();
        int iW = w(key);
        if (iW < 0) {
            return false;
        }
        R(iW);
        return true;
    }

    public final boolean V(V element) {
        n();
        int iY = y(element);
        if (iY < 0) {
            return false;
        }
        R(iY);
        return true;
    }

    public final f<K, V> X() {
        return new f<>(this);
    }

    @Override // java.util.Map
    public void clear() {
        n();
        int i15 = this.length - 1;
        if (i15 >= 0) {
            int i16 = 0;
            while (true) {
                int[] iArr = this.presenceArray;
                int i17 = iArr[i16];
                if (i17 >= 0) {
                    this.hashArray[i17] = 0;
                    iArr[i16] = -1;
                }
                if (i16 == i15) {
                    break;
                } else {
                    i16++;
                }
            }
        }
        qq.c.g(this.keysArray, 0, this.length);
        V[] vArr = this.valuesArray;
        if (vArr != null) {
            qq.c.g(vArr, 0, this.length);
        }
        this.size = 0;
        this.length = 0;
        N();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsKey(Object key) {
        return w(key) >= 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public boolean containsValue(Object value) {
        return y(value) >= 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<Map.Entry<K, V>> entrySet() {
        return B();
    }

    @Override // java.util.Map
    public boolean equals(Object other) {
        if (other != this) {
            return (other instanceof Map) && s((Map) other);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V get(Object key) {
        int iW = w(key);
        if (iW < 0) {
            return null;
        }
        return this.valuesArray[iW];
    }

    @Override // java.util.Map
    public int hashCode() {
        b<K, V> bVarV = v();
        int iL = 0;
        while (bVarV.hasNext()) {
            iL += bVarV.l();
        }
        return iL;
    }

    public final int i(K key) {
        n();
        while (true) {
            int I = I(key);
            int iJ = m.j(this.maxProbeDistance * 2, C() / 2);
            int i15 = 0;
            while (true) {
                int i16 = this.hashArray[I];
                if (i16 == 0) {
                    if (this.length >= A()) {
                        u(1);
                        break;
                    }
                    int i17 = this.length;
                    int i18 = i17 + 1;
                    this.length = i18;
                    this.keysArray[i17] = key;
                    this.presenceArray[i17] = I;
                    this.hashArray[I] = i18;
                    this.size = size() + 1;
                    N();
                    if (i15 > this.maxProbeDistance) {
                        this.maxProbeDistance = i15;
                    }
                    return i17;
                }
                if (t.c(this.keysArray[i16 - 1], key)) {
                    return -i16;
                }
                i15++;
                if (i15 > iJ) {
                    O(C() * 2);
                    break;
                }
                I = I == 0 ? C() - 1 : I - 1;
            }
        }
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public final /* bridge */ Set<K> keySet() {
        return D();
    }

    public final Map<K, V> m() {
        n();
        this.isReadOnly = true;
        return size() > 0 ? this : f168029q;
    }

    public final void n() {
        if (this.isReadOnly) {
            throw new UnsupportedOperationException();
        }
    }

    public final boolean p(Collection<?> m15) {
        for (Object obj : m15) {
            if (obj != null) {
                try {
                    if (!r((Map.Entry) obj)) {
                    }
                } catch (ClassCastException unused) {
                }
            }
            return false;
        }
        return true;
    }

    @Override // java.util.Map
    public V put(K key, V value) {
        n();
        int i15 = i(key);
        V[] vArrK = k();
        if (i15 >= 0) {
            vArrK[i15] = value;
            return null;
        }
        int i16 = (-i15) - 1;
        V v15 = vArrK[i16];
        vArrK[i16] = value;
        return v15;
    }

    @Override // java.util.Map
    public void putAll(Map<? extends K, ? extends V> from) {
        n();
        K(from.entrySet());
    }

    public final boolean r(Map.Entry<? extends K, ? extends V> entry) {
        int iW = w(entry.getKey());
        if (iW < 0) {
            return false;
        }
        return t.c(this.valuesArray[iW], entry.getValue());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Map
    public V remove(Object key) {
        n();
        int iW = w(key);
        if (iW < 0) {
            return null;
        }
        V v15 = this.valuesArray[iW];
        R(iW);
        return v15;
    }

    @Override // java.util.Map
    public final /* bridge */ int size() {
        return getSize();
    }

    public String toString() {
        StringBuilder sb5 = new StringBuilder((size() * 3) + 2);
        sb5.append("{");
        b<K, V> bVarV = v();
        int i15 = 0;
        while (bVarV.hasNext()) {
            if (i15 > 0) {
                sb5.append(", ");
            }
            bVarV.k(sb5);
            i15++;
        }
        sb5.append("}");
        return sb5.toString();
    }

    public final b<K, V> v() {
        return new b<>(this);
    }

    @Override // java.util.Map
    public final /* bridge */ Collection<V> values() {
        return G();
    }

    public d() {
        this(8);
    }

    public d(int i15) {
        this(qq.c.d(i15), null, new int[i15], new int[INSTANCE.c(i15)], 2, 0);
    }
}
