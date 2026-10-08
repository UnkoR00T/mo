package pq;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import p071kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000à\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010\u0005\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\t\u0010\n\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u000b\u0010\u0007\u001a\u001f\u0010\f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\f\u0010\n\u001a'\u0010\u000f\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010\u001a%\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0011\u0010\u0012\u001a%\u0010\u0013\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0015\u0010\u0007\u001a\u001d\u0010\u0016\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0016\u0010\n\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0017\u0010\u0007\u001a\u001f\u0010\u0018\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0018\u0010\n\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0019\u0010\u0007\u001a\u001d\u0010\u001a\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001a\u0010\n\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001b\u0010\u0007\u001a\u001f\u0010\u001c\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001c\u0010\n\u001a+\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b\u001e\u0010\u001f\u001a+\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b \u0010!\u001a=\u0010$\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b$\u0010%\u001a)\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020&*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b'\u0010(\u001a?\u0010,\u001a\u00028\u0000\"\u0010\b\u0000\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00010)\"\b\b\u0001\u0010\u0000*\u00020&*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010+\u001a\u00028\u0000H\u0007¢\u0006\u0004\b,\u0010-\u001a+\u00100\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010/\u001a\u00020.¢\u0006\u0004\b0\u00101\u001a+\u00102\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b2\u0010\u001f\u001a+\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001d\u001a\u00020\r¢\u0006\u0004\b3\u0010!\u001a#\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b4\u0010(\u001a-\u00106\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000005*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b6\u0010(\u001a?\u0010:\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000007j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`8¢\u0006\u0004\b:\u0010;\u001a\u0017\u0010>\u001a\u00020=*\b\u0012\u0004\u0012\u00020\u00030<¢\u0006\u0004\b>\u0010?\u001a\u0017\u0010B\u001a\u00020A*\b\u0012\u0004\u0012\u00020@0<¢\u0006\u0004\bB\u0010C\u001a\u0017\u0010F\u001a\u00020E*\b\u0012\u0004\u0012\u00020D0<¢\u0006\u0004\bF\u0010G\u001a\u0017\u0010I\u001a\u00020H*\b\u0012\u0004\u0012\u00020\r0<¢\u0006\u0004\bI\u0010J\u001a\u0017\u0010M\u001a\u00020L*\b\u0012\u0004\u0012\u00020K0<¢\u0006\u0004\bM\u0010N\u001a9\u0010O\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010**\n\u0012\u0006\b\u0000\u0012\u00028\u00000)*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010+\u001a\u00028\u0001H\u0007¢\u0006\u0004\bO\u0010-\u001a-\u0010R\u001a\u0012\u0012\u0004\u0012\u00028\u00000Pj\b\u0012\u0004\u0012\u00028\u0000`Q\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bR\u0010S\u001a#\u0010T\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bT\u0010(\u001a#\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bV\u0010(\u001a#\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000U\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000<¢\u0006\u0004\bW\u0010X\u001a#\u0010Z\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bZ\u0010[\u001aC\u0010^\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\\*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010]\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\"H\u0086\bø\u0001\u0000¢\u0006\u0004\b^\u0010%\u001a)\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000_0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b`\u0010a\u001a#\u0010b\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bb\u0010(\u001a4\u0010d\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\bd\u0010e\u001a#\u0010g\u001a\b\u0012\u0004\u0012\u00028\u00000f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bg\u0010[\u001a4\u0010h\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004¢\u0006\u0004\bh\u0010e\u001a7\u0010i\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010#\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\"H\u0086\bø\u0001\u0000¢\u0006\u0004\bi\u0010j\u001a\u001d\u0010k\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\bk\u0010l\u001a\u001b\u0010m\u001a\u0004\u0018\u00010D*\b\u0012\u0004\u0012\u00020D0\u0001H\u0007¢\u0006\u0004\bm\u0010n\u001a+\u0010o\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000005*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bo\u0010p\u001a=\u0010q\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000007j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`8H\u0007¢\u0006\u0004\bq\u0010r\u001a\u001b\u0010s\u001a\u0004\u0018\u00010D*\b\u0012\u0004\u0012\u00020D0\u0001H\u0007¢\u0006\u0004\bs\u0010n\u001a+\u0010t\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000005*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bt\u0010p\u001a=\u0010u\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00109\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000007j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`8H\u0007¢\u0006\u0004\bu\u0010r\u001a3\u0010w\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010v\u001a\u00020\rH\u0007¢\u0006\u0004\bw\u0010\u001f\u001a.\u0010x\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bx\u0010y\u001a4\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0004\b{\u0010|\u001a.\u0010}\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b}\u0010y\u001a.\u0010~\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000<2\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b~\u0010\u007f\u001a6\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0005\b\u0080\u0001\u0010|\u001a7\u0010\u0081\u0001\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000<2\f\u0010z\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001\u001aL\u0010\u0085\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\b0\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010v\u001a\u00020\r2\t\b\u0002\u0010\u0083\u0001\u001a\u00020\r2\t\b\u0002\u0010\u0084\u0001\u001a\u00020\u0003H\u0007¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001\u001aI\u0010\u0088\u0001\u001a\u0015\u0012\u0011\u0012\u000f\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0087\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\\*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010c\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0005\b\u0088\u0001\u0010|\u001a\u0090\u0001\u0010\u0093\u0001\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u000f\b\u0001\u0010\u008b\u0001*\b0\u0089\u0001j\u0003`\u008a\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0007\u0010\u008c\u0001\u001a\u00028\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008d\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008d\u00012\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010\u0091\u0001\u001a\u00020\r2\n\b\u0002\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0017\b\u0002\u0010]\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u008d\u0001\u0018\u00010\"H\u0007¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001\u001au\u0010\u0096\u0001\u001a\u00030\u0095\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\n\b\u0002\u0010\u008e\u0001\u001a\u00030\u008d\u00012\n\b\u0002\u0010\u008f\u0001\u001a\u00030\u008d\u00012\n\b\u0002\u0010\u0090\u0001\u001a\u00030\u008d\u00012\t\b\u0002\u0010\u0091\u0001\u001a\u00020\r2\n\b\u0002\u0010\u0092\u0001\u001a\u00030\u008d\u00012\u0017\b\u0002\u0010]\u001a\u0011\u0012\u0004\u0012\u00028\u0000\u0012\u0005\u0012\u00030\u008d\u0001\u0018\u00010\"¢\u0006\u0006\b\u0096\u0001\u0010\u0097\u0001\u001a'\u0010\u0099\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0098\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u009a\u0001\u001a\u001b\u0010\u009b\u0001\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\r0\u0001H\u0007¢\u0006\u0005\b\u009b\u0001\u0010l\u001a\u001c\u0010\u009c\u0001\u001a\u00020D*\b\u0012\u0004\u0012\u00020D0\u0001H\u0007¢\u0006\u0006\b\u009c\u0001\u0010\u009d\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u009e\u0001"}, d2 = {"T", "", "element", "", "c0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "k0", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "l0", "(Ljava/util/List;)Ljava/lang/Object;", "m0", "n0", "", "index", "o0", "(Ljava/util/List;I)Ljava/lang/Object;", "p0", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "q0", "(Ljava/util/List;Ljava/lang/Object;)I", "w0", "x0", "y0", "z0", "O0", "P0", "Q0", "R0", "n", "f0", "(Ljava/lang/Iterable;I)Ljava/util/List;", "g0", "(Ljava/util/List;I)Ljava/util/List;", "Lkotlin/Function1;", "predicate", "h0", "(Ljava/lang/Iterable;Ler/l;)Ljava/util/List;", "", "i0", "(Ljava/lang/Iterable;)Ljava/util/List;", "", "C", "destination", "j0", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Llr/i;", "indices", "S0", "(Ljava/util/List;Llr/i;)Ljava/util/List;", "X0", "Y0", "N0", "", "T0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "U0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;", "", "", "Z0", "(Ljava/util/Collection;)[Z", "", "", "a1", "(Ljava/util/Collection;)[B", "", "", "c1", "(Ljava/util/Collection;)[F", "", "e1", "(Ljava/util/Collection;)[I", "", "", "g1", "(Ljava/util/Collection;)[J", "b1", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "d1", "(Ljava/lang/Iterable;)Ljava/util/HashSet;", "f1", "", "h1", "i1", "(Ljava/util/Collection;)Ljava/util/List;", "", "k1", "(Ljava/lang/Iterable;)Ljava/util/Set;", "R", "transform", "A0", "Lpq/p0;", "n1", "(Ljava/lang/Iterable;)Ljava/lang/Iterable;", "e0", "other", "r0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/Set;", "", "j1", "l1", "Z", "(Ljava/lang/Iterable;Ler/l;)Z", "d0", "(Ljava/lang/Iterable;)I", "C0", "(Ljava/lang/Iterable;)Ljava/lang/Float;", "B0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "D0", "(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/lang/Object;", "F0", "E0", "G0", "size", "b0", "I0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "elements", "H0", "(Ljava/lang/Iterable;Ljava/lang/Iterable;)Ljava/util/List;", "K0", "M0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "J0", "L0", "(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;", "step", "partialWindows", "m1", "(Ljava/lang/Iterable;IIZ)Ljava/util/List;", "Loq/r;", "p1", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "s0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/Appendable;", "", "u0", "(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Ler/l;)Ljava/lang/String;", "Leu/h;", "a0", "(Ljava/lang/Iterable;)Leu/h;", "W0", "V0", "(Ljava/lang/Iterable;)F", "kotlin-stdlib"}, k = 5, mv = {2, 3, 0}, xi = 49, xs = "kotlin/collections/CollectionsKt")
public class g0 extends e0 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"pq/g0$a", "Leu/h;", "", "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 3, 0}, xi = 48)
    public static final class a<T> implements eu.h<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Iterable f161702a;

        public a(Iterable iterable) {
            this.f161702a = iterable;
        }

        @Override // eu.h
        public Iterator<T> iterator() {
            return this.f161702a.iterator();
        }
    }

    public static <T, R> List<R> A0(Iterable<? extends T> iterable, er.l<? super T, ? extends R> lVar) {
        ArrayList arrayList = new ArrayList(y.y(iterable, 10));
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(lVar.b(it.next()));
        }
        return arrayList;
    }

    public static <T extends Comparable<? super T>> T B0(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Float C0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.max(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T> T D0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) < 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T extends Comparable<? super T>> T E0(Iterable<? extends T> iterable) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static Float F0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        float fFloatValue = it.next().floatValue();
        while (it.hasNext()) {
            fFloatValue = Math.min(fFloatValue, it.next().floatValue());
        }
        return Float.valueOf(fFloatValue);
    }

    public static <T> T G0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (comparator.compare(next, next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    public static <T> List<T> H0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection collectionF = c0.F(iterable2);
        if (collectionF.isEmpty()) {
            return f1(iterable);
        }
        ArrayList arrayList = new ArrayList();
        for (T t15 : iterable) {
            if (!collectionF.contains(t15)) {
                arrayList.add(t15);
            }
        }
        return arrayList;
    }

    public static <T> List<T> I0(Iterable<? extends T> iterable, T t15) {
        ArrayList arrayList = new ArrayList(y.y(iterable, 10));
        boolean z15 = false;
        for (T t16 : iterable) {
            boolean z16 = true;
            if (!z15 && fr.t.c(t16, t15)) {
                z15 = true;
                z16 = false;
            }
            if (z16) {
                arrayList.add(t16);
            }
        }
        return arrayList;
    }

    public static <T> List<T> J0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        if (iterable instanceof Collection) {
            return L0((Collection) iterable, iterable2);
        }
        ArrayList arrayList = new ArrayList();
        c0.D(arrayList, iterable);
        c0.D(arrayList, iterable2);
        return arrayList;
    }

    public static <T> List<T> K0(Iterable<? extends T> iterable, T t15) {
        if (iterable instanceof Collection) {
            return M0((Collection) iterable, t15);
        }
        ArrayList arrayList = new ArrayList();
        c0.D(arrayList, iterable);
        arrayList.add(t15);
        return arrayList;
    }

    public static <T> List<T> L0(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            ArrayList arrayList = new ArrayList(collection);
            c0.D(arrayList, iterable);
            return arrayList;
        }
        Collection collection2 = (Collection) iterable;
        ArrayList arrayList2 = new ArrayList(collection.size() + collection2.size());
        arrayList2.addAll(collection);
        arrayList2.addAll(collection2);
        return arrayList2;
    }

    public static <T> List<T> M0(Collection<? extends T> collection, T t15) {
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t15);
        return arrayList;
    }

    public static <T> List<T> N0(Iterable<? extends T> iterable) {
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return f1(iterable);
        }
        List<T> listH1 = h1(iterable);
        e0.X(listH1);
        return listH1;
    }

    public static <T> T O0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) P0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        if (it.hasNext()) {
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        return next;
    }

    public static <T> T P0(List<? extends T> list) {
        int size = list.size();
        if (size == 0) {
            throw new NoSuchElementException("List is empty.");
        }
        if (size == 1) {
            return list.get(0);
        }
        throw new IllegalArgumentException("List has more than one element.");
    }

    public static <T> T Q0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() == 1) {
                return (T) list.get(0);
            }
            return null;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    public static <T> T R0(List<? extends T> list) {
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    public static <T> List<T> S0(List<? extends T> list, lr.i iVar) {
        return iVar.isEmpty() ? x.n() : f1(list.subList(iVar.t().intValue(), iVar.s().intValue() + 1));
    }

    public static <T extends Comparable<? super T>> List<T> T0(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            List<T> listH1 = h1(iterable);
            b0.B(listH1);
            return listH1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return f1(iterable);
        }
        Object[] array = collection.toArray(new Comparable[0]);
        q.R((Comparable[]) array);
        return q.f(array);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <T> List<T> U0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        if (!(iterable instanceof Collection)) {
            List<T> listH1 = h1(iterable);
            b0.C(listH1, comparator);
            return listH1;
        }
        Collection collection = (Collection) iterable;
        if (collection.size() <= 1) {
            return f1(iterable);
        }
        Object[] array = collection.toArray(new Object[0]);
        q.S(array, comparator);
        return q.f(array);
    }

    public static float V0(Iterable<Float> iterable) {
        Iterator<Float> it = iterable.iterator();
        float fFloatValue = 0.0f;
        while (it.hasNext()) {
            fFloatValue += it.next().floatValue();
        }
        return fFloatValue;
    }

    public static int W0(Iterable<Integer> iterable) {
        Iterator<Integer> it = iterable.iterator();
        int iIntValue = 0;
        while (it.hasNext()) {
            iIntValue += it.next().intValue();
        }
        return iIntValue;
    }

    public static <T> List<T> X0(Iterable<? extends T> iterable, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
        }
        if (i15 == 0) {
            return x.n();
        }
        if (iterable instanceof Collection) {
            if (i15 >= ((Collection) iterable).size()) {
                return f1(iterable);
            }
            if (i15 == 1) {
                return w.e(k0(iterable));
            }
        }
        ArrayList arrayList = new ArrayList(i15);
        Iterator<? extends T> it = iterable.iterator();
        int i16 = 0;
        while (it.hasNext()) {
            arrayList.add(it.next());
            i16++;
            if (i16 == i15) {
                break;
            }
        }
        return x.u(arrayList);
    }

    public static <T> List<T> Y0(List<? extends T> list, int i15) {
        if (i15 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
        }
        if (i15 == 0) {
            return x.n();
        }
        int size = list.size();
        if (i15 >= size) {
            return f1(list);
        }
        if (i15 == 1) {
            return w.e(x0(list));
        }
        ArrayList arrayList = new ArrayList(i15);
        if (list instanceof RandomAccess) {
            for (int i16 = size - i15; i16 < size; i16++) {
                arrayList.add(list.get(i16));
            }
        } else {
            ListIterator<? extends T> listIterator = list.listIterator(size - i15);
            while (listIterator.hasNext()) {
                arrayList.add(listIterator.next());
            }
        }
        return arrayList;
    }

    public static <T> boolean Z(Iterable<? extends T> iterable, er.l<? super T, Boolean> lVar) {
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!lVar.b(it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    public static boolean[] Z0(Collection<Boolean> collection) {
        boolean[] zArr = new boolean[collection.size()];
        Iterator<Boolean> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            zArr[i15] = it.next().booleanValue();
            i15++;
        }
        return zArr;
    }

    public static <T> eu.h<T> a0(Iterable<? extends T> iterable) {
        return new a(iterable);
    }

    public static byte[] a1(Collection<Byte> collection) {
        byte[] bArr = new byte[collection.size()];
        Iterator<Byte> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            bArr[i15] = it.next().byteValue();
            i15++;
        }
        return bArr;
    }

    public static <T> List<List<T>> b0(Iterable<? extends T> iterable, int i15) {
        return m1(iterable, i15, i15, true);
    }

    public static final <T, C extends Collection<? super T>> C b1(Iterable<? extends T> iterable, C c15) {
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            c15.add(it.next());
        }
        return c15;
    }

    public static <T> boolean c0(Iterable<? extends T> iterable, T t15) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t15);
        }
        return p0(iterable, t15) >= 0;
    }

    public static float[] c1(Collection<Float> collection) {
        float[] fArr = new float[collection.size()];
        Iterator<Float> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            fArr[i15] = it.next().floatValue();
            i15++;
        }
        return fArr;
    }

    public static <T> int d0(Iterable<? extends T> iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        Iterator<? extends T> it = iterable.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            it.next();
            i15++;
            if (i15 < 0) {
                x.w();
            }
        }
        return i15;
    }

    public static <T> HashSet<T> d1(Iterable<? extends T> iterable) {
        return (HashSet) b1(iterable, new HashSet(x0.e(y.y(iterable, 12))));
    }

    public static <T> List<T> e0(Iterable<? extends T> iterable) {
        return f1(j1(iterable));
    }

    public static int[] e1(Collection<Integer> collection) {
        int[] iArr = new int[collection.size()];
        Iterator<Integer> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            iArr[i15] = it.next().intValue();
            i15++;
        }
        return iArr;
    }

    public static <T> List<T> f0(Iterable<? extends T> iterable, int i15) {
        ArrayList arrayList;
        if (i15 < 0) {
            throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
        }
        if (i15 == 0) {
            return f1(iterable);
        }
        if (iterable instanceof Collection) {
            int size = ((Collection) iterable).size() - i15;
            if (size <= 0) {
                return x.n();
            }
            if (size == 1) {
                return w.e(w0(iterable));
            }
            arrayList = new ArrayList(size);
            if (iterable instanceof List) {
                if (iterable instanceof RandomAccess) {
                    List list = (List) iterable;
                    int size2 = list.size();
                    while (i15 < size2) {
                        arrayList.add(list.get(i15));
                        i15++;
                    }
                } else {
                    ListIterator listIterator = ((List) iterable).listIterator(i15);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        } else {
            arrayList = new ArrayList();
        }
        int i16 = 0;
        for (T t15 : iterable) {
            if (i16 >= i15) {
                arrayList.add(t15);
            } else {
                i16++;
            }
        }
        return x.u(arrayList);
    }

    public static <T> List<T> f1(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            return x.u(h1(iterable));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return x.n();
        }
        if (size != 1) {
            return i1(collection);
        }
        return w.e(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> List<T> g0(List<? extends T> list, int i15) {
        if (i15 >= 0) {
            return X0(list, lr.m.e(list.size() - i15, 0));
        }
        throw new IllegalArgumentException(("Requested element count " + i15 + " is less than zero.").toString());
    }

    public static long[] g1(Collection<Long> collection) {
        long[] jArr = new long[collection.size()];
        Iterator<Long> it = collection.iterator();
        int i15 = 0;
        while (it.hasNext()) {
            jArr[i15] = it.next().longValue();
            i15++;
        }
        return jArr;
    }

    public static <T> List<T> h0(Iterable<? extends T> iterable, er.l<? super T, Boolean> lVar) {
        ArrayList arrayList = new ArrayList();
        for (T t15 : iterable) {
            if (lVar.b(t15).booleanValue()) {
                arrayList.add(t15);
            }
        }
        return arrayList;
    }

    public static final <T> List<T> h1(Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? i1((Collection) iterable) : (List) b1(iterable, new ArrayList());
    }

    public static <T> List<T> i0(Iterable<? extends T> iterable) {
        return (List) j0(iterable, new ArrayList());
    }

    public static <T> List<T> i1(Collection<? extends T> collection) {
        return new ArrayList(collection);
    }

    public static final <C extends Collection<? super T>, T> C j0(Iterable<? extends T> iterable, C c15) {
        for (T t15 : iterable) {
            if (t15 != null) {
                c15.add(t15);
            }
        }
        return c15;
    }

    public static <T> Set<T> j1(Iterable<? extends T> iterable) {
        return iterable instanceof Collection ? new LinkedHashSet((Collection) iterable) : (Set) b1(iterable, new LinkedHashSet());
    }

    public static <T> T k0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) l0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    public static <T> Set<T> k1(Iterable<? extends T> iterable) {
        if (!(iterable instanceof Collection)) {
            return g1.h((Set) b1(iterable, new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return g1.e();
        }
        if (size != 1) {
            return (Set) b1(iterable, new LinkedHashSet(x0.e(collection.size())));
        }
        return f1.d(iterable instanceof List ? ((List) iterable).get(0) : collection.iterator().next());
    }

    public static <T> T l0(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(0);
    }

    public static <T> Set<T> l1(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Set<T> setJ1 = j1(iterable);
        c0.D(setJ1, iterable2);
        return setJ1;
    }

    public static <T> T m0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        return null;
    }

    public static final <T> List<List<T>> m1(Iterable<? extends T> iterable, int i15, int i16, boolean z15) {
        i1.a(i15, i16);
        if (!(iterable instanceof RandomAccess) || !(iterable instanceof List)) {
            ArrayList arrayList = new ArrayList();
            Iterator itB = i1.b(iterable.iterator(), i15, i16, z15, false);
            while (itB.hasNext()) {
                arrayList.add((List) itB.next());
            }
            return arrayList;
        }
        List list = (List) iterable;
        int size = list.size();
        ArrayList arrayList2 = new ArrayList((size / i16) + (size % i16 == 0 ? 0 : 1));
        int i17 = 0;
        while (i17 >= 0 && i17 < size) {
            int iJ = lr.m.j(i15, size - i17);
            if (iJ < i15 && !z15) {
                return arrayList2;
            }
            ArrayList arrayList3 = new ArrayList(iJ);
            for (int i18 = 0; i18 < iJ; i18++) {
                arrayList3.add(list.get(i18 + i17));
            }
            arrayList2.add(arrayList3);
            i17 += i16;
        }
        return arrayList2;
    }

    public static <T> T n0(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    public static <T> Iterable<IndexedValue<T>> n1(final Iterable<? extends T> iterable) {
        return new q0(new er.a() { // from class: pq.f0
            @Override // er.a
            public final Object a() {
                return g0.o1(iterable);
            }
        });
    }

    public static <T> T o0(List<? extends T> list, int i15) {
        if (i15 < 0 || i15 >= list.size()) {
            return null;
        }
        return list.get(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Iterator o1(Iterable iterable) {
        return iterable.iterator();
    }

    public static <T> int p0(Iterable<? extends T> iterable, T t15) {
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t15);
        }
        int i15 = 0;
        for (T t16 : iterable) {
            if (i15 < 0) {
                x.x();
            }
            if (fr.t.c(t15, t16)) {
                return i15;
            }
            i15++;
        }
        return -1;
    }

    public static <T, R> List<oq.r<T, R>> p1(Iterable<? extends T> iterable, Iterable<? extends R> iterable2) {
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it4 = iterable2.iterator();
        ArrayList arrayList = new ArrayList(Math.min(y.y(iterable, 10), y.y(iterable2, 10)));
        while (it.hasNext() && it4.hasNext()) {
            arrayList.add(oq.y.a(it.next(), it4.next()));
        }
        return arrayList;
    }

    public static <T> int q0(List<? extends T> list, T t15) {
        return list.indexOf(t15);
    }

    public static <T> Set<T> r0(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        Collection collectionF = c0.F(iterable2);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (T t15 : iterable) {
            if (collectionF.contains(t15)) {
                linkedHashSet.add(t15);
            }
        }
        return linkedHashSet;
    }

    public static final <T, A extends Appendable> A s0(Iterable<? extends T> iterable, A a15, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super T, ? extends CharSequence> lVar) throws IOException {
        a15.append(charSequence2);
        int i16 = 0;
        for (T t15 : iterable) {
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

    public static final <T> String u0(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l<? super T, ? extends CharSequence> lVar) {
        return ((StringBuilder) s0(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i15, charSequence4, lVar)).toString();
    }

    public static /* synthetic */ String v0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i15, CharSequence charSequence4, er.l lVar, int i16, Object obj) {
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
        return u0(iterable, charSequence, charSequence2, charSequence3, i15, charSequence5, lVar2);
    }

    public static <T> T w0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            return (T) x0((List) iterable);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException("Collection is empty.");
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T x0(List<? extends T> list) {
        if (list.isEmpty()) {
            throw new NoSuchElementException("List is empty.");
        }
        return list.get(x.p(list));
    }

    public static <T> T y0(Iterable<? extends T> iterable) {
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    public static <T> T z0(List<? extends T> list) {
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }
}
