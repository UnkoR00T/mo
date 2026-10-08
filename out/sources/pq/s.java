package pq;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000ð\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0002\b\u0002\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0002\b\u0015\n\u0002\u0010\u0018\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0004\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001c\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u001c\u0010\f\u001a\u00020\u0003*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000bH\u0086\u0002¢\u0006\u0004\b\f\u0010\r\u001a\u001c\u0010\u0010\u001a\u00020\u0003*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000fH\u0086\u0002¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u001c\u0010\u0014\u001a\u00020\u0003*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013H\u0086\u0002¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u001c\u0010\u0018\u001a\u00020\u0003*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017H\u0086\u0002¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u001f\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0011\u0010\u001c\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001d\u001a!\u0010\u001e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001e\u0010\u001b\u001a\u0013\u0010!\u001a\u0004\u0018\u00010 *\u00020\u001f¢\u0006\u0004\b!\u0010\"\u001a)\u0010$\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b$\u0010%\u001a\u001b\u0010&\u001a\u0004\u0018\u00010\u000f*\u00020\u000e2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b&\u0010'\u001a\u001b\u0010*\u001a\u0004\u0018\u00010)*\u00020(2\u0006\u0010#\u001a\u00020\u000f¢\u0006\u0004\b*\u0010+\u001a'\u0010,\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b,\u0010-\u001a\u0019\u0010.\u001a\u00020\u000f*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007¢\u0006\u0004\b.\u0010/\u001a\u0019\u00100\u001a\u00020\u000f*\u00020\n2\u0006\u0010\u0002\u001a\u00020\u000b¢\u0006\u0004\b0\u00101\u001a\u0019\u00102\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b2\u00103\u001a\u0019\u00104\u001a\u00020\u000f*\u00020\u00122\u0006\u0010\u0002\u001a\u00020\u0013¢\u0006\u0004\b4\u00105\u001a\u0019\u00106\u001a\u00020\u000f*\u00020\u00162\u0006\u0010\u0002\u001a\u00020\u0017¢\u0006\u0004\b6\u00107\u001a\u001f\u00108\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b8\u0010\u001b\u001a'\u00109\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b9\u0010-\u001a\u0019\u0010:\u001a\u00020\u000f*\u00020\u000e2\u0006\u0010\u0002\u001a\u00020\u000f¢\u0006\u0004\b:\u00103\u001a!\u0010;\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b;\u0010\u001b\u001a\u0013\u0010<\u001a\u0004\u0018\u00010\u000f*\u00020\u000e¢\u0006\u0004\b<\u0010=\u001a\u0013\u0010>\u001a\u0004\u0018\u00010 *\u00020\u001f¢\u0006\u0004\b>\u0010\"\u001a\u0013\u0010@\u001a\u0004\u0018\u00010\u0003*\u00020?¢\u0006\u0004\b@\u0010A\u001a\u0013\u0010B\u001a\u0004\u0018\u00010\u0017*\u00020\u0016¢\u0006\u0004\bB\u0010C\u001a\u001f\u0010D\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bD\u0010\u001b\u001a\u0011\u0010E\u001a\u00020\u0017*\u00020\u0016¢\u0006\u0004\bE\u0010F\u001a!\u0010G\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bG\u0010\u001b\u001a-\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000I\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010H\u001a\u00020\u000f¢\u0006\u0004\bJ\u0010K\u001a\u001f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00062\u0006\u0010H\u001a\u00020\u000f¢\u0006\u0004\bL\u0010M\u001a+\u0010O\u001a\b\u0012\u0004\u0012\u00028\u00000I\"\b\b\u0000\u0010\u0000*\u00020N*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\bO\u0010P\u001aA\u0010T\u001a\u00028\u0000\"\u0010\b\u0000\u0010R*\n\u0012\u0006\b\u0000\u0012\u00028\u00010Q\"\b\b\u0001\u0010\u0000*\u00020N*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010S\u001a\u00028\u0000H\u0007¢\u0006\u0004\bT\u0010U\u001a\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00062\u0006\u0010H\u001a\u00020\u000f¢\u0006\u0004\bV\u0010M\u001a-\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000I\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010H\u001a\u00020\u000f¢\u0006\u0004\bW\u0010K\u001a\u001f\u0010X\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u00062\u0006\u0010H\u001a\u00020\u000f¢\u0006\u0004\bX\u0010M\u001aC\u0010\\\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010[\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Yj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`Z¢\u0006\u0004\b\\\u0010]\u001aA\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00000I\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u0010[\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000Yj\n\u0012\u0006\b\u0000\u0012\u00028\u0000`Z¢\u0006\u0004\b^\u0010_\u001a;\u0010`\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010R*\n\u0012\u0006\b\u0000\u0012\u00028\u00000Q*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010S\u001a\u00028\u0001H\u0007¢\u0006\u0004\b`\u0010U\u001a-\u0010a\u001a\u00028\u0000\"\u0010\b\u0000\u0010R*\n\u0012\u0006\b\u0000\u0012\u00020\u000f0Q*\u00020\u000e2\u0006\u0010S\u001a\u00028\u0000H\u0007¢\u0006\u0004\ba\u0010b\u001a%\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000I\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bc\u0010P\u001a\u0017\u0010d\u001a\b\u0012\u0004\u0012\u00020\u00070I*\u00020\u0006¢\u0006\u0004\bd\u0010e\u001a\u0017\u0010f\u001a\b\u0012\u0004\u0012\u00020\u000b0I*\u00020\n¢\u0006\u0004\bf\u0010g\u001a\u0017\u0010h\u001a\b\u0012\u0004\u0012\u00020\u000f0I*\u00020\u000e¢\u0006\u0004\bh\u0010i\u001a\u0017\u0010j\u001a\b\u0012\u0004\u0012\u00020\u00130I*\u00020\u0012¢\u0006\u0004\bj\u0010k\u001a\u0017\u0010l\u001a\b\u0012\u0004\u0012\u00020 0I*\u00020\u001f¢\u0006\u0004\bl\u0010m\u001a\u0017\u0010n\u001a\b\u0012\u0004\u0012\u00020)0I*\u00020(¢\u0006\u0004\bn\u0010o\u001a\u0017\u0010p\u001a\b\u0012\u0004\u0012\u00020\u00030I*\u00020?¢\u0006\u0004\bp\u0010q\u001a\u0017\u0010r\u001a\b\u0012\u0004\u0012\u00020\u00170I*\u00020\u0016¢\u0006\u0004\br\u0010s\u001a%\u0010u\u001a\b\u0012\u0004\u0012\u00028\u00000t\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bu\u0010P\u001a\u0017\u0010v\u001a\b\u0012\u0004\u0012\u00020\u00070t*\u00020\u0006¢\u0006\u0004\bv\u0010e\u001a\u0017\u0010w\u001a\b\u0012\u0004\u0012\u00020\u000b0t*\u00020\n¢\u0006\u0004\bw\u0010g\u001a\u0017\u0010x\u001a\b\u0012\u0004\u0012\u00020\u000f0t*\u00020\u000e¢\u0006\u0004\bx\u0010i\u001a\u0017\u0010y\u001a\b\u0012\u0004\u0012\u00020\u00130t*\u00020\u0012¢\u0006\u0004\by\u0010k\u001a\u0017\u0010z\u001a\b\u0012\u0004\u0012\u00020 0t*\u00020\u001f¢\u0006\u0004\bz\u0010m\u001a\u0017\u0010{\u001a\b\u0012\u0004\u0012\u00020)0t*\u00020(¢\u0006\u0004\b{\u0010o\u001a\u0017\u0010|\u001a\b\u0012\u0004\u0012\u00020\u00030t*\u00020?¢\u0006\u0004\b|\u0010q\u001a\u0017\u0010}\u001a\b\u0012\u0004\u0012\u00020\u00170t*\u00020\u0016¢\u0006\u0004\b}\u0010s\u001a&\u0010\u007f\u001a\b\u0012\u0004\u0012\u00028\u00000~\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0005\b\u007f\u0010\u0080\u0001\u001a\u001a\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0~*\u00020\u000e¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a0\u0010\u0085\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00028\u00000\u0084\u00010\u0083\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001a\u0019\u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u000f0I*\u00020\u000e¢\u0006\u0005\b\u0087\u0001\u0010i\u001a\u001b\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u000f0\u0088\u0001*\u00020\u000e¢\u0006\u0006\b\u0089\u0001\u0010\u0082\u0001\u001a\u0017\u0010\u008a\u0001\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007¢\u0006\u0005\b\u008a\u0001\u0010=\u001a\u0017\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u000f*\u00020\u000eH\u0007¢\u0006\u0005\b\u008b\u0001\u0010=\u001aP\u0010\u008f\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008e\u00010I\"\u0004\b\u0000\u0010\u0000\"\u0005\b\u0001\u0010\u008c\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000f\u0010\u008d\u0001\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001\u001aO\u0010\u0091\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u008e\u00010I\"\u0004\b\u0000\u0010\u0000\"\u0005\b\u0001\u0010\u008c\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010\u008d\u0001\u001a\t\u0012\u0004\u0012\u00028\u00010\u0083\u0001H\u0086\u0004¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001\u001a\u0094\u0001\u0010\u009f\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000f\b\u0001\u0010\u0095\u0001*\b0\u0093\u0001j\u0003`\u0094\u0001*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0007\u0010\u0096\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001H\u0007¢\u0006\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0086\u0001\u0010¡\u0001\u001a\u00028\u0000\"\u000f\b\u0000\u0010\u0095\u0001*\b0\u0093\u0001j\u0003`\u0094\u0001*\u00020\u00062\u0007\u0010\u0096\u0001\u001a\u00028\u00002\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001H\u0007¢\u0006\u0006\b¡\u0001\u0010¢\u0001\u001ay\u0010¤\u0001\u001a\u00030£\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001¢\u0006\u0006\b¤\u0001\u0010¥\u0001\u001ak\u0010¦\u0001\u001a\u00030£\u0001*\u00020\u00062\n\b\u0002\u0010\u0098\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u0099\u0001\u001a\u00030\u0097\u00012\n\b\u0002\u0010\u009a\u0001\u001a\u00030\u0097\u00012\t\b\u0002\u0010\u009b\u0001\u001a\u00020\u000f2\n\b\u0002\u0010\u009c\u0001\u001a\u00030\u0097\u00012\u0019\b\u0002\u0010\u009e\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\u0005\u0012\u00030\u0097\u0001\u0018\u00010\u009d\u0001¢\u0006\u0006\b¦\u0001\u0010§\u0001\u001a)\u0010¨\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0083\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\b¨\u0001\u0010\u0086\u0001\u001a)\u0010ª\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000©\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0006\bª\u0001\u0010«\u0001\u001a\u0013\u0010¬\u0001\u001a\u00020\u000f*\u00020\u000e¢\u0006\u0005\b¬\u0001\u0010\u001d\"'\u0010°\u0001\u001a\u00030\u00ad\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001\"\u0019\u0010°\u0001\u001a\u00030\u00ad\u0001*\u00020\u000e8F¢\u0006\b\u001a\u0006\b±\u0001\u0010²\u0001\"&\u0010µ\u0001\u001a\u00020\u000f\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b³\u0001\u0010´\u0001\"\u0017\u0010µ\u0001\u001a\u00020\u000f*\u00020\u000e8F¢\u0006\u0007\u001a\u0005\b¶\u0001\u0010\u001d\"\u0018\u0010µ\u0001\u001a\u00020\u000f*\u00020\u00128F¢\u0006\b\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0018\u0010µ\u0001\u001a\u00020\u000f*\u00020\u001f8F¢\u0006\b\u001a\u0006\b¹\u0001\u0010º\u0001¨\u0006»\u0001"}, d2 = {"T", "", "element", "", "f0", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "b0", "([BB)Z", "", "", "g0", "([SS)Z", "", "", "d0", "([II)Z", "", "", "e0", "([JJ)Z", "", "", "c0", "([CC)Z", "n0", "([Ljava/lang/Object;)Ljava/lang/Object;", "m0", "([I)I", "p0", "", "", "o0", "([F)Ljava/lang/Float;", "index", "y0", "([Ljava/lang/Object;I)Ljava/lang/Object;", "x0", "([II)Ljava/lang/Integer;", "", "", "w0", "([DI)Ljava/lang/Double;", "D0", "([Ljava/lang/Object;Ljava/lang/Object;)I", "z0", "([BB)I", "E0", "([SS)I", "B0", "([II)I", "C0", "([JJ)I", "A0", "([CC)I", "M0", "O0", "N0", "T0", "S0", "([I)Ljava/lang/Integer;", "R0", "", "P0", "([Z)Ljava/lang/Boolean;", "Q0", "([C)Ljava/lang/Character;", "X0", "W0", "([C)C", "Y0", "n", "", "j0", "([Ljava/lang/Object;I)Ljava/util/List;", "i0", "([BI)Ljava/util/List;", "", "k0", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "l0", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "c1", "e1", "d1", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "Z0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "a1", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "g1", "f1", "([ILjava/util/Collection;)Ljava/util/Collection;", "n1", "h1", "([B)Ljava/util/List;", "o1", "([S)Ljava/util/List;", "l1", "([I)Ljava/util/List;", "m1", "([J)Ljava/util/List;", "k1", "([F)Ljava/util/List;", "j1", "([D)Ljava/util/List;", "p1", "([Z)Ljava/util/List;", "i1", "([C)Ljava/util/List;", "", "w1", "q1", "x1", "u1", "v1", "t1", "s1", "y1", "r1", "", "B1", "([Ljava/lang/Object;)Ljava/util/Set;", "A1", "([I)Ljava/util/Set;", "", "Lpq/p0;", "C1", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "h0", "", "z1", "U0", "V0", "R", "other", "Loq/r;", "F1", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "E1", "([Ljava/lang/Object;Ljava/lang/Iterable;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "Lkotlin/Function1;", "transform", "G0", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/Appendable;", "F0", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/Appendable;", "", "J0", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "I0", "([BLjava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "Z", "Leu/h;", "a0", "([Ljava/lang/Object;)Leu/h;", "b1", "Llr/i;", "r0", "([Ljava/lang/Object;)Llr/i;", "indices", "q0", "([I)Llr/i;", "v0", "([Ljava/lang/Object;)I", "lastIndex", "t0", "u0", "([J)I", "s0", "([F)I", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/ArraysKt")
public class s extends q {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pq/s$a", "", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements Iterable<T>, gr.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f161735a;

        public a(Object[] objArr) {
            this.f161735a = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return fr.c.a(this.f161735a);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pq/s$b", "Leu/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class b<T> implements eu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Object[] f161736a;

        public b(Object[] objArr) {
            this.f161736a = objArr;
        }

        @Override // eu.h
        public Iterator<T> iterator() {
            return fr.c.a(this.f161736a);
        }
    }

    public static final int A0(char[] cArr, char c15) {
        int length = cArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (c15 == cArr[i15]) {
                return i15;
            }
        }
        return -1;
    }

    public static Set<Integer> A1(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? (Set) f1(iArr, new LinkedHashSet(x0.e(iArr.length))) : f1.d(Integer.valueOf(iArr[0]));
        }
        return g1.e();
    }

    public static final int B0(int[] iArr, int i15) {
        int length = iArr.length;
        for (int i16 = 0; i16 < length; i16++) {
            if (i15 == iArr[i16]) {
                return i16;
            }
        }
        return -1;
    }

    public static <T> Set<T> B1(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? (Set) g1(tArr, new LinkedHashSet(x0.e(tArr.length))) : f1.d(tArr[0]);
        }
        return g1.e();
    }

    public static final int C0(long[] jArr, long j15) {
        int length = jArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (j15 == jArr[i15]) {
                return i15;
            }
        }
        return -1;
    }

    public static <T> Iterable<IndexedValue<T>> C1(final T[] tArr) {
        return new q0(new er.a() { // from class: pq.r
            @Override // er.a
            public final Object a() {
                return s.D1(tArr);
            }
        });
    }

    public static <T> int D0(T[] tArr, T t15) {
        int i15 = 0;
        if (t15 == null) {
            int length = tArr.length;
            while (i15 < length) {
                if (tArr[i15] == null) {
                    return i15;
                }
                i15++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i15 < length2) {
            if (fr.t.c(t15, tArr[i15])) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator D1(Object[] objArr) {
        return fr.c.a(objArr);
    }

    public static final int E0(short[] sArr, short s15) {
        int length = sArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (s15 == sArr[i15]) {
                return i15;
            }
        }
        return -1;
    }

    public static <T, R> List<oq.r<T, R>> E1(T[] tArr, Iterable<? extends R> iterable) {
        int length = tArr.length;
        ArrayList arrayList = new ArrayList(Math.min(y.y(iterable, 10), length));
        int i15 = 0;
        for (R r15 : iterable) {
            if (i15 >= length) {
                break;
            }
            arrayList.add(oq.y.a(tArr[i15], r15));
            i15++;
        }
        return arrayList;
    }

    public static final <A extends Appendable> A F0(byte[] bArr, A a15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super Byte, ? extends CharSequence> lVar) throws IOException {
        a15.append(charSequence2);
        int i16 = 0;
        for (byte b15 : bArr) {
            i16++;
            if (i16 > 1) {
                a15.append(charSequence);
            }
            if (i15 >= 0 && i16 > i15) {
                break;
            }
            if (lVar != null) {
                a15.append(lVar.b(Byte.valueOf(b15)));
            } else {
                a15.append(String.valueOf((int) b15));
            }
        }
        if (i15 >= 0 && i16 > i15) {
            a15.append(charSequence4);
        }
        a15.append(charSequence3);
        return a15;
    }

    public static <T, R> List<oq.r<T, R>> F1(T[] tArr, R[] rArr) {
        int iMin = Math.min(tArr.length, rArr.length);
        ArrayList arrayList = new ArrayList(iMin);
        for (int i15 = 0; i15 < iMin; i15++) {
            arrayList.add(oq.y.a(tArr[i15], rArr[i15]));
        }
        return arrayList;
    }

    public static final <T, A extends Appendable> A G0(T[] tArr, A a15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super T, ? extends CharSequence> lVar) throws IOException {
        a15.append(charSequence2);
        int i16 = 0;
        for (T t15 : tArr) {
            i16++;
            if (i16 > 1) {
                a15.append(charSequence);
            }
            if (i15 >= 0 && i16 > i15) {
                break;
            }
            fu.r.a(a15, t15, lVar);
        }
        if (i15 >= 0 && i16 > i15) {
            a15.append(charSequence4);
        }
        a15.append(charSequence3);
        return a15;
    }

    public static final String I0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super Byte, ? extends CharSequence> lVar) {
        return ((StringBuilder) F0(bArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i15, charSequence4, lVar)).toString();
    }

    public static final <T> String J0(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) G0(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i15, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String K0(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l lVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i16 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i16 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i16 & 8) != 0) {
            i15 = -1;
        }
        if ((i16 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i16 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        er.l lVar2 = lVar;
        return I0(bArr, charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public static /* synthetic */ String L0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l lVar, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i16 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i16 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i16 & 8) != 0) {
            i15 = -1;
        }
        if ((i16 & 16) != 0) {
            charSequence4 = "...";
        }
        if ((i16 & 32) != 0) {
            lVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        er.l lVar2 = lVar;
        return J0(objArr, charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public static <T> T M0(T[] tArr) {
        if (tArr.length != 0) {
            return tArr[v0(tArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static final int N0(int[] iArr, int i15) {
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i16 = length - 1;
                if (i15 == iArr[length]) {
                    return length;
                }
                if (i16 >= 0) {
                    length = i16;
                }
            }
        }
        return -1;
    }

    public static <T> int O0(T[] tArr, T t15) {
        if (t15 == null) {
            int length = tArr.length - 1;
            if (length >= 0) {
                while (true) {
                    int i15 = length - 1;
                    if (tArr[length] == null) {
                        return length;
                    }
                    if (i15 >= 0) {
                        length = i15;
                    }
                }
            }
        } else {
            int length2 = tArr.length - 1;
            if (length2 >= 0) {
                while (true) {
                    int i16 = length2 - 1;
                    if (fr.t.c(t15, tArr[length2])) {
                        return length2;
                    }
                    if (i16 < 0) {
                        break;
                    }
                    length2 = i16;
                }
            }
        }
        return -1;
    }

    public static Boolean P0(boolean[] zArr) {
        if (zArr.length == 0) {
            return null;
        }
        return Boolean.valueOf(zArr[zArr.length - 1]);
    }

    public static Character Q0(char[] cArr) {
        if (cArr.length == 0) {
            return null;
        }
        return Character.valueOf(cArr[cArr.length - 1]);
    }

    public static Float R0(float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[fArr.length - 1]);
    }

    public static Integer S0(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        return Integer.valueOf(iArr[iArr.length - 1]);
    }

    public static <T> T T0(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[tArr.length - 1];
    }

    public static Integer U0(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i15 = iArr[0];
        int iT0 = t0(iArr);
        int i16 = 1;
        if (1 <= iT0) {
            while (true) {
                int i17 = iArr[i16];
                if (i15 < i17) {
                    i15 = i17;
                }
                if (i16 == iT0) {
                    break;
                }
                i16++;
            }
        }
        return Integer.valueOf(i15);
    }

    public static Integer V0(int[] iArr) {
        if (iArr.length == 0) {
            return null;
        }
        int i15 = iArr[0];
        int iT0 = t0(iArr);
        int i16 = 1;
        if (1 <= iT0) {
            while (true) {
                int i17 = iArr[i16];
                if (i15 > i17) {
                    i15 = i17;
                }
                if (i16 == iT0) {
                    break;
                }
                i16++;
            }
        }
        return Integer.valueOf(i15);
    }

    public static char W0(char[] cArr) {
        int length = cArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return cArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T X0(T[] tArr) {
        int length = tArr.length;
        if (length == 0) {
            throw new NoSuchElementException("Array is empty.");
        }
        if (length == 1) {
            return tArr[0];
        }
        throw new IllegalArgumentException("Array has more than one element.");
    }

    public static <T> T Y0(T[] tArr) {
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    public static <T> Iterable<T> Z(T[] tArr) {
        return tArr.length == 0 ? x.n() : new a(tArr);
    }

    public static final <T> T[] Z0(T[] tArr, Comparator<? super T> comparator) {
        if (tArr.length == 0) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        q.S(tArr2, comparator);
        return tArr2;
    }

    public static <T> eu.h<T> a0(T[] tArr) {
        return tArr.length == 0 ? eu.k.i() : new b(tArr);
    }

    public static <T> List<T> a1(T[] tArr, Comparator<? super T> comparator) {
        return q.f(Z0(tArr, comparator));
    }

    public static boolean b0(byte[] bArr, byte b15) {
        return z0(bArr, b15) >= 0;
    }

    public static int b1(int[] iArr) {
        int i15 = 0;
        for (int i16 : iArr) {
            i15 += i16;
        }
        return i15;
    }

    public static boolean c0(char[] cArr, char c15) {
        return A0(cArr, c15) >= 0;
    }

    public static List<Byte> c1(byte[] bArr, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
        }
        if (i15 == 0) {
            return x.n();
        }
        if (i15 >= bArr.length) {
            return h1(bArr);
        }
        if (i15 == 1) {
            return w.e(Byte.valueOf(bArr[0]));
        }
        ArrayList arrayList = new ArrayList(i15);
        int i16 = 0;
        for (byte b15 : bArr) {
            arrayList.add(Byte.valueOf(b15));
            i16++;
            if (i16 == i15) {
                break;
            }
        }
        return arrayList;
    }

    public static boolean d0(int[] iArr, int i15) {
        return B0(iArr, i15) >= 0;
    }

    public static List<Byte> d1(byte[] bArr, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
        }
        if (i15 == 0) {
            return x.n();
        }
        int length = bArr.length;
        if (i15 >= length) {
            return h1(bArr);
        }
        if (i15 == 1) {
            return w.e(Byte.valueOf(bArr[length - 1]));
        }
        ArrayList arrayList = new ArrayList(i15);
        for (int i16 = length - i15; i16 < length; i16++) {
            arrayList.add(Byte.valueOf(bArr[i16]));
        }
        return arrayList;
    }

    public static boolean e0(long[] jArr, long j15) {
        return C0(jArr, j15) >= 0;
    }

    public static final <T> List<T> e1(T[] tArr, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
        }
        if (i15 == 0) {
            return x.n();
        }
        int length = tArr.length;
        if (i15 >= length) {
            return n1(tArr);
        }
        return i15 == 1 ? w.e(tArr[length - 1]) : q.f(q.v(tArr, length - i15, length));
    }

    public static <T> boolean f0(T[] tArr, T t15) {
        return D0(tArr, t15) >= 0;
    }

    public static final <C extends Collection<? super Integer>> C f1(int[] iArr, C c15) {
        for (int i15 : iArr) {
            c15.add(Integer.valueOf(i15));
        }
        return c15;
    }

    public static boolean g0(short[] sArr, short s15) {
        return E0(sArr, s15) >= 0;
    }

    public static final <T, C extends Collection<? super T>> C g1(T[] tArr, C c15) {
        for (T t15 : tArr) {
            c15.add(t15);
        }
        return c15;
    }

    public static List<Integer> h0(int[] iArr) {
        return g0.f1(z1(iArr));
    }

    public static List<Byte> h1(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            return length != 1 ? q1(bArr) : w.e(Byte.valueOf(bArr[0]));
        }
        return x.n();
    }

    public static List<Byte> i0(byte[] bArr, int i15) {
        if (i15 >= 0) {
            return d1(bArr, lr.m.e(bArr.length - i15, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
    }

    public static List<Character> i1(char[] cArr) {
        int length = cArr.length;
        if (length != 0) {
            return length != 1 ? r1(cArr) : w.e(Character.valueOf(cArr[0]));
        }
        return x.n();
    }

    public static <T> List<T> j0(T[] tArr, int i15) {
        if (i15 >= 0) {
            return e1(tArr, lr.m.e(tArr.length - i15, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
    }

    public static List<Double> j1(double[] dArr) {
        int length = dArr.length;
        if (length != 0) {
            return length != 1 ? s1(dArr) : w.e(Double.valueOf(dArr[0]));
        }
        return x.n();
    }

    public static <T> List<T> k0(T[] tArr) {
        return (List) l0(tArr, new ArrayList());
    }

    public static List<Float> k1(float[] fArr) {
        int length = fArr.length;
        if (length != 0) {
            return length != 1 ? t1(fArr) : w.e(Float.valueOf(fArr[0]));
        }
        return x.n();
    }

    public static final <C extends Collection<? super T>, T> C l0(T[] tArr, C c15) {
        for (T t15 : tArr) {
            if (t15 != null) {
                c15.add(t15);
            }
        }
        return c15;
    }

    public static List<Integer> l1(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            return length != 1 ? u1(iArr) : w.e(Integer.valueOf(iArr[0]));
        }
        return x.n();
    }

    public static int m0(int[] iArr) {
        if (iArr.length != 0) {
            return iArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static List<Long> m1(long[] jArr) {
        int length = jArr.length;
        if (length != 0) {
            return length != 1 ? v1(jArr) : w.e(Long.valueOf(jArr[0]));
        }
        return x.n();
    }

    public static <T> T n0(T[] tArr) {
        if (tArr.length != 0) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    public static <T> List<T> n1(T[] tArr) {
        int length = tArr.length;
        if (length != 0) {
            return length != 1 ? q.f(Arrays.copyOf(tArr, tArr.length)) : w.e(tArr[0]);
        }
        return x.n();
    }

    public static Float o0(float[] fArr) {
        if (fArr.length == 0) {
            return null;
        }
        return Float.valueOf(fArr[0]);
    }

    public static List<Short> o1(short[] sArr) {
        int length = sArr.length;
        if (length != 0) {
            return length != 1 ? x1(sArr) : w.e(Short.valueOf(sArr[0]));
        }
        return x.n();
    }

    public static <T> T p0(T[] tArr) {
        if (tArr.length == 0) {
            return null;
        }
        return tArr[0];
    }

    public static List<Boolean> p1(boolean[] zArr) {
        int length = zArr.length;
        if (length != 0) {
            return length != 1 ? y1(zArr) : w.e(Boolean.valueOf(zArr[0]));
        }
        return x.n();
    }

    public static lr.i q0(int[] iArr) {
        return new lr.i(0, t0(iArr));
    }

    public static final List<Byte> q1(byte[] bArr) {
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b15 : bArr) {
            arrayList.add(Byte.valueOf(b15));
        }
        return arrayList;
    }

    public static <T> lr.i r0(T[] tArr) {
        return new lr.i(0, v0(tArr));
    }

    public static final List<Character> r1(char[] cArr) {
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c15 : cArr) {
            arrayList.add(Character.valueOf(c15));
        }
        return arrayList;
    }

    public static int s0(float[] fArr) {
        return fArr.length - 1;
    }

    public static final List<Double> s1(double[] dArr) {
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d15 : dArr) {
            arrayList.add(Double.valueOf(d15));
        }
        return arrayList;
    }

    public static int t0(int[] iArr) {
        return iArr.length - 1;
    }

    public static final List<Float> t1(float[] fArr) {
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f15 : fArr) {
            arrayList.add(Float.valueOf(f15));
        }
        return arrayList;
    }

    public static int u0(long[] jArr) {
        return jArr.length - 1;
    }

    public static final List<Integer> u1(int[] iArr) {
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i15 : iArr) {
            arrayList.add(Integer.valueOf(i15));
        }
        return arrayList;
    }

    public static <T> int v0(T[] tArr) {
        return tArr.length - 1;
    }

    public static final List<Long> v1(long[] jArr) {
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j15 : jArr) {
            arrayList.add(Long.valueOf(j15));
        }
        return arrayList;
    }

    public static Double w0(double[] dArr, int i15) {
        if (i15 < 0 || i15 >= dArr.length) {
            return null;
        }
        return Double.valueOf(dArr[i15]);
    }

    public static <T> List<T> w1(T[] tArr) {
        return new ArrayList(x.i(tArr, false, 1, null));
    }

    public static Integer x0(int[] iArr, int i15) {
        if (i15 < 0 || i15 >= iArr.length) {
            return null;
        }
        return Integer.valueOf(iArr[i15]);
    }

    public static final List<Short> x1(short[] sArr) {
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s15 : sArr) {
            arrayList.add(Short.valueOf(s15));
        }
        return arrayList;
    }

    public static <T> T y0(T[] tArr, int i15) {
        if (i15 < 0 || i15 >= tArr.length) {
            return null;
        }
        return tArr[i15];
    }

    public static final List<Boolean> y1(boolean[] zArr) {
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z15 : zArr) {
            arrayList.add(Boolean.valueOf(z15));
        }
        return arrayList;
    }

    public static final int z0(byte[] bArr, byte b15) {
        int length = bArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            if (b15 == bArr[i15]) {
                return i15;
            }
        }
        return -1;
    }

    public static final Set<Integer> z1(int[] iArr) {
        return (Set) f1(iArr, new LinkedHashSet(x0.e(iArr.length)));
    }
}
