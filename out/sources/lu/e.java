package lu;

import fr.w0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import ju.k3;
import oq.i0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import ou.b0;
import ou.c0;
import ou.d0;
import ou.s0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b6\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0010\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0003:\u008c\u0001B3\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\"\b\u0002\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u0007¢\u0006\u0004\b\t\u0010\nJ\u0018\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0082@¢\u0006\u0004\b\f\u0010\rJ6\u0010\u0013\u001a\u00020\u00062\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0016\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J%\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u00002\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0018H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJG\u0010 \u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!JG\u0010\"\u001a\u00020\u00032\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010$\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020\u0011H\u0003¢\u0006\u0004\b$\u0010%J\u0017\u0010'\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020\u0011H\u0002¢\u0006\u0004\b'\u0010%J\u001b\u0010(\u001a\u00020\u001e*\u00020\u001c2\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0004\b(\u0010)J.\u0010+\u001a\u00028\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b+\u0010,J)\u0010-\u001a\u00020\u0006*\u00020\u00152\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b-\u0010\u0017J\u001d\u0010.\u001a\u00020\u00062\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018H\u0002¢\u0006\u0004\b.\u0010/J4\u00101\u001a\b\u0012\u0004\u0012\u00028\u0000002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u0011H\u0082@¢\u0006\u0004\b1\u0010,J#\u00102\u001a\u00020\u00062\u0012\u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000\u0018H\u0002¢\u0006\u0004\b2\u0010/J9\u00103\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b3\u00104J9\u00105\u001a\u0004\u0018\u00010\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010*\u001a\u00020\u00112\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\b5\u00104J)\u00106\u001a\u00020\u001e*\u00020\u001c2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u0003H\u0002¢\u0006\u0004\b6\u00107J\u000f\u00108\u001a\u00020\u0006H\u0002¢\u0006\u0004\b8\u00109J-\u0010;\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b;\u0010<J-\u0010=\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010:\u001a\u00020\u0011H\u0002¢\u0006\u0004\b=\u0010<J\u0019\u0010?\u001a\u00020\u00062\b\b\u0002\u0010>\u001a\u00020\u0011H\u0002¢\u0006\u0004\b?\u0010@J%\u0010D\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030A2\b\u0010C\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bD\u0010EJ\u001b\u0010F\u001a\u00020\u00062\n\u0010B\u001a\u0006\u0012\u0002\b\u00030AH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bI\u0010JJ%\u0010K\u001a\u0004\u0018\u00010\u001c2\b\u0010C\u001a\u0004\u0018\u00010\u001c2\b\u0010H\u001a\u0004\u0018\u00010\u001cH\u0002¢\u0006\u0004\bK\u0010JJ\u000f\u0010L\u001a\u00020\u0006H\u0002¢\u0006\u0004\bL\u00109J\u000f\u0010M\u001a\u00020\u0006H\u0002¢\u0006\u0004\bM\u00109J\u000f\u0010N\u001a\u00020\u0006H\u0002¢\u0006\u0004\bN\u00109J\u000f\u0010O\u001a\u00020\u0006H\u0002¢\u0006\u0004\bO\u00109J\u000f\u0010P\u001a\u00020\u0006H\u0002¢\u0006\u0004\bP\u00109J\u001d\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bR\u0010SJ\u0017\u0010T\u001a\u00020\u00062\u0006\u0010Q\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010@J\u0015\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00112\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bX\u0010YJ\u001d\u0010Z\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bZ\u0010[J%\u0010]\u001a\u00020\u00062\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\\\u001a\u00020\u0011H\u0002¢\u0006\u0004\b]\u0010^J\u0013\u0010_\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\b_\u0010`J\u0013\u0010a\u001a\u00020\u0006*\u00020\u0015H\u0002¢\u0006\u0004\ba\u0010`J\u001b\u0010c\u001a\u00020\u0006*\u00020\u00152\u0006\u0010b\u001a\u00020\u001eH\u0002¢\u0006\u0004\bc\u0010dJ\u001f\u0010g\u001a\u00020\u001e2\u0006\u0010e\u001a\u00020\u00112\u0006\u0010f\u001a\u00020\u001eH\u0002¢\u0006\u0004\bg\u0010hJ-\u0010j\u001a\u00020\u001e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010i\u001a\u00020\u0011H\u0002¢\u0006\u0004\bj\u0010<J-\u0010m\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bm\u0010nJ-\u0010o\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bo\u0010nJ5\u0010q\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u000e2\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\u0006\u0010p\u001a\u00020\u0011H\u0002¢\u0006\u0004\bq\u0010rJ%\u0010s\u001a\u00020\u00062\u0006\u0010k\u001a\u00020\u00112\f\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000\u000eH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010v\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bv\u0010@J\u0017\u0010w\u001a\u00020\u00062\u0006\u0010u\u001a\u00020\u0011H\u0002¢\u0006\u0004\bw\u0010@JG\u0010{\u001a \u0012\u0004\u0012\u00020y\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u000000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0004\b{\u0010|J.\u0010\u007f\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00028\u0000002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001JO\u0010\u0082\u0001\u001a\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u00072\u0006\u0010\u000b\u001a\u00028\u0000H\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001JC\u0010\u0084\u0001\u001a\u001a\u0012\u0004\u0012\u00020y\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060x*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00060\u0005j\b\u0012\u0004\u0012\u00028\u0000`\u0007H\u0002¢\u0006\u0005\b\u0084\u0001\u0010|J*\u0010\u0085\u0001\u001a\u00020\u00062\u0006\u0010}\u001a\u00020y2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010~\u001a\u00020zH\u0002¢\u0006\u0006\b\u0085\u0001\u0010\u0080\u0001J\u001a\u0010\u0086\u0001\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00028\u0000H\u0096@¢\u0006\u0005\b\u0086\u0001\u0010\rJ \u0010\u0087\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0016¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\b\u0012\u0004\u0012\u00020\u0006002\u0006\u0010\u000b\u001a\u00028\u0000H\u0004¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008a\u0001\u00109J\u0011\u0010\u008b\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u008b\u0001\u00109J\u0013\u0010\u008c\u0001\u001a\u00028\u0000H\u0096@¢\u0006\u0006\b\u008c\u0001\u0010\u008d\u0001J\u0017\u0010:\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0096@¢\u0006\u0005\b:\u0010\u008d\u0001J\u0018\u0010\u008e\u0001\u001a\b\u0012\u0004\u0012\u00028\u000000H\u0016¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u001a\u0010\u0091\u0001\u001a\u00020\u00062\u0007\u0010\u0090\u0001\u001a\u00020\u0011H\u0004¢\u0006\u0005\b\u0091\u0001\u0010@J\u0019\u0010\u0092\u0001\u001a\u00020\u00062\u0006\u0010i\u001a\u00020\u0011H\u0000¢\u0006\u0005\b\u0092\u0001\u0010@J\u001a\u0010\u0094\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000\u0093\u0001H\u0096\u0002¢\u0006\u0006\b\u0094\u0001\u0010\u0095\u0001J\u0011\u0010\u0096\u0001\u001a\u00020\u0006H\u0014¢\u0006\u0005\b\u0096\u0001\u00109J\u001c\u0010\u0097\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0016¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\"\u0010\u009b\u0001\u001a\u00020\u00062\u0010\u0010}\u001a\f\u0018\u00010\u0099\u0001j\u0005\u0018\u0001`\u009a\u0001¢\u0006\u0006\b\u009b\u0001\u0010\u009c\u0001J\u001c\u0010\u009d\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010yH\u0010¢\u0006\u0006\b\u009d\u0001\u0010\u0098\u0001J%\u0010\u009f\u0001\u001a\u00020\u001e2\b\u0010}\u001a\u0004\u0018\u00010y2\u0007\u0010\u009e\u0001\u001a\u00020\u001eH\u0014¢\u0006\u0006\b\u009f\u0001\u0010 \u0001J)\u0010¢\u0001\u001a\u00020\u00062\u0015\u0010¡\u0001\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010y\u0012\u0004\u0012\u00020\u00060\u0005H\u0016¢\u0006\u0006\b¢\u0001\u0010£\u0001J\u0012\u0010¤\u0001\u001a\u00020\u001eH\u0000¢\u0006\u0006\b¤\u0001\u0010¥\u0001J\u0013\u0010§\u0001\u001a\u00030¦\u0001H\u0016¢\u0006\u0006\b§\u0001\u0010¨\u0001R\u0016\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008c\u0001\u0010©\u0001R/\u0010\b\u001a\u001c\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005j\n\u0012\u0004\u0012\u00028\u0000\u0018\u0001`\u00078\u0000X\u0081\u0004¢\u0006\u0007\n\u0005\b:\u0010ª\u0001Rc\u0010¯\u0001\u001aG\u0012\b\u0012\u0006\u0012\u0002\b\u00030A\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020y\u0012\u0006\u0012\u0004\u0018\u00010\u001c\u0012\u0004\u0012\u00020z\u0012\u0004\u0012\u00020\u00060\u0081\u0001\u0018\u00010\u0081\u0001j\u0005\u0018\u0001`«\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b¬\u0001\u0010\u00ad\u0001\u0012\u0005\b®\u0001\u00109R\u0017\u0010²\u0001\u001a\u00020\u00118BX\u0082\u0004¢\u0006\b\u001a\u0006\b°\u0001\u0010±\u0001R\u0017\u0010´\u0001\u001a\u00020\u001e8BX\u0082\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010¥\u0001R\u0017\u0010·\u0001\u001a\u00020y8BX\u0082\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010¶\u0001R\u001a\u0010¹\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¸\u0001\u0010%R\u001a\u0010»\u0001\u001a\u00020\u001e*\u00020\u00118BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bº\u0001\u0010%R\u0016\u0010\\\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010±\u0001R\u0017\u0010¾\u0001\u001a\u00020\u00118@X\u0080\u0004¢\u0006\b\u001a\u0006\b½\u0001\u0010±\u0001R%\u0010Ã\u0001\u001a\t\u0012\u0004\u0012\u00028\u00000¿\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÂ\u0001\u00109\u001a\u0006\bÀ\u0001\u0010Á\u0001R+\u0010Æ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u0000000¿\u00018VX\u0096\u0004¢\u0006\u000f\u0012\u0005\bÅ\u0001\u00109\u001a\u0006\bÄ\u0001\u0010Á\u0001R\u0019\u0010È\u0001\u001a\u0004\u0018\u00010y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÇ\u0001\u0010¶\u0001R\u0017\u0010Ê\u0001\u001a\u00020y8DX\u0084\u0004¢\u0006\b\u001a\u0006\bÉ\u0001\u0010¶\u0001R\u0017\u0010Ì\u0001\u001a\u00020\u001e8TX\u0094\u0004¢\u0006\b\u001a\u0006\bË\u0001\u0010¥\u0001R\u001e\u0010Ï\u0001\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÎ\u0001\u00109\u001a\u0006\bÍ\u0001\u0010¥\u0001R\u001d\u0010f\u001a\u00020\u001e8VX\u0097\u0004¢\u0006\u000f\u0012\u0005\bÑ\u0001\u00109\u001a\u0006\bÐ\u0001\u0010¥\u0001R\r\u0010Ó\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004R\r\u0010Ô\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004R\r\u0010Õ\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004R\r\u0010Ö\u0001\u001a\u00030Ò\u00018\u0002X\u0082\u0004R\u0019\u0010Ø\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0×\u00018\u0002X\u0082\u0004R\u0019\u0010Ù\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0×\u00018\u0002X\u0082\u0004R\u0019\u0010Ú\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000e0×\u00018\u0002X\u0082\u0004R\u0015\u0010Û\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0×\u00018\u0002X\u0082\u0004R\u0015\u0010Ü\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u001c0×\u00018\u0002X\u0082\u0004¨\u0006Ý\u0001"}, d2 = {"Llu/e;", "E", "Llu/g;", "", "capacity", "Lkotlin/Function1;", "Loq/i0;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "onUndeliveredElement", "<init>", "(ILer/l;)V", "element", "Q0", "(Ljava/lang/Object;Ltq/e;)Ljava/lang/Object;", "Llu/m;", "segment", "index", "", "s", "k1", "(Llu/m;ILjava/lang/Object;JLtq/e;)Ljava/lang/Object;", "Lju/k3;", "X0", "(Lju/k3;Llu/m;I)V", "Lju/n;", "cont", "R0", "(Ljava/lang/Object;Lju/n;)V", "", "waiter", "", "closed", "t1", "(Llu/m;ILjava/lang/Object;JLjava/lang/Object;Z)I", "u1", "curSendersAndCloseStatus", "l1", "(J)Z", "curSenders", "R", "m1", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "r", "d1", "(Llu/m;IJLtq/e;)Ljava/lang/Object;", "W0", "O0", "(Lju/n;)V", "Llu/k;", "c1", "N0", "r1", "(Llu/m;IJLjava/lang/Object;)Ljava/lang/Object;", "s1", "n1", "(Ljava/lang/Object;Llu/m;I)Z", "b0", "()V", "b", "p1", "(Llu/m;IJ)Z", "q1", "nAttempts", "v0", "(J)V", "Lru/k;", "select", "ignoredParam", "e1", "(Lru/k;Ljava/lang/Object;)V", "P0", "(Lru/k;)V", "selectResult", "Y0", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "Z0", "x0", "I0", "H0", "G0", "Y", "sendersCur", "X", "(J)Llu/m;", "W", "U", "()Llu/m;", "lastSegment", "F0", "(Llu/m;)J", "f1", "(Llu/m;)V", "sendersCounter", "T", "(Llu/m;J)V", "g1", "(Lju/k3;)V", "h1", "receiver", "i1", "(Lju/k3;Z)V", "sendersAndCloseStatusCur", "isClosedForReceive", "z0", "(JZ)Z", "globalIndex", "y0", "id", "startFrom", "e0", "(JLlu/m;)Llu/m;", "d0", "currentBufferEndCounter", "c0", "(JLlu/m;J)Llu/m;", "J0", "(JLlu/m;)V", "value", "w1", "v1", "Lkotlin/reflect/KFunction3;", "", "Ltq/i;", "Q", "(Ler/l;)Lmr/g;", "cause", "context", "K0", "(Ljava/lang/Throwable;Ljava/lang/Object;Ltq/i;)V", "Lkotlin/Function3;", "N", "(Ler/l;Ljava/lang/Object;)Ler/q;", "O", "L0", "l", "d", "(Ljava/lang/Object;)Ljava/lang/Object;", "o1", "T0", "S0", "a", "(Ltq/e;)Ljava/lang/Object;", "k", "()Ljava/lang/Object;", "globalCellIndex", "Z", "x1", "Llu/i;", "iterator", "()Llu/i;", "M0", "n", "(Ljava/lang/Throwable;)Z", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "u", "(Ljava/util/concurrent/CancellationException;)V", ip.a.f96137b, "cancel", "V", "(Ljava/lang/Throwable;Z)Z", "handler", "g", "(Ler/l;)V", "u0", "()Z", "", "toString", "()Ljava/lang/String;", "I", "Ler/l;", "Lkotlinx/coroutines/selects/OnCancellationConstructor;", "c", "Ler/q;", "getOnUndeliveredElementReceiveCancellationConstructor$annotations", "onUndeliveredElementReceiveCancellationConstructor", "g0", "()J", "bufferEndCounter", "E0", "isRendezvousOrUnlimited", "l0", "()Ljava/lang/Throwable;", "receiveException", "C0", "isClosedForSend0", "B0", "isClosedForReceive0", "s0", "o0", "receiversCounter", "Lru/g;", "f", "()Lru/g;", "getOnReceive$annotations", "onReceive", "j", "getOnReceiveCatching$annotations", "onReceiveCatching", "i0", "closeCause", "p0", "sendException", "D0", "isConflatedDropOldest", "o", "isClosedForSend$annotations", "isClosedForSend", "A0", "isClosedForReceive$annotations", "Liu/d;", "sendersAndCloseStatus", "receivers", "bufferEnd", "completedExpandBuffersAndPauseFlag", "Liu/e;", "sendSegment", "receiveSegment", "bufferEndSegment", "_closeCause", "closeHandler", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class e<E> implements lu.g<E> {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f120411d = AtomicLongFieldUpdater.newUpdater(e.class, "sendersAndCloseStatus$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f120412e = AtomicLongFieldUpdater.newUpdater(e.class, "receivers$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f120413f = AtomicLongFieldUpdater.newUpdater(e.class, "bufferEnd$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f120414g = AtomicLongFieldUpdater.newUpdater(e.class, "completedExpandBuffersAndPauseFlag$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f120415h = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "sendSegment$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f120416j = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "receiveSegment$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f120417k = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "bufferEndSegment$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f120418l = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "_closeCause$volatile");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f120419m = AtomicReferenceFieldUpdater.newUpdater(e.class, Object.class, "closeHandler$volatile");
    private volatile /* synthetic */ Object _closeCause$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int capacity;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    public final er.l<E, i0> onUndeliveredElement;
    private volatile /* synthetic */ long bufferEnd$volatile;
    private volatile /* synthetic */ Object bufferEndSegment$volatile;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final er.q<ru.k<?>, Object, Object, er.q<Throwable, Object, tq.i, i0>> onUndeliveredElementReceiveCancellationConstructor;
    private volatile /* synthetic */ Object closeHandler$volatile;
    private volatile /* synthetic */ long completedExpandBuffersAndPauseFlag$volatile;
    private volatile /* synthetic */ Object receiveSegment$volatile;
    private volatile /* synthetic */ long receivers$volatile;
    private volatile /* synthetic */ Object sendSegment$volatile;
    private volatile /* synthetic */ long sendersAndCloseStatus$volatile;

    @Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\u000e\u001a\u00020\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0005H\u0096B¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u0016\u001a\u00020\u00102\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\u00152\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00028\u0000¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u0010¢\u0006\u0004\b\u001d\u0010\u0012R\u0018\u0010 \u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u001fR\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006%"}, d2 = {"Llu/e$a;", "Llu/i;", "Lju/k3;", "<init>", "(Llu/e;)V", "", "f", "()Z", "Llu/m;", "segment", "", "index", "", "r", "e", "(Llu/m;IJLtq/e;)Ljava/lang/Object;", "Loq/i0;", "h", "()V", "a", "(Ltq/e;)Ljava/lang/Object;", "Lou/b0;", "g", "(Lou/b0;I)V", "next", "()Ljava/lang/Object;", "element", "i", "(Ljava/lang/Object;)Z", "j", "", "Ljava/lang/Object;", "receiveResult", "Lju/p;", "b", "Lju/p;", "continuation", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class a implements lu.i<E>, k3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object receiveResult = lu.f.f120455p;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private ju.p<? super Boolean> continuation;

        public a() {
        }

        private final Object e(m<E> mVar, int i15, long j15, tq.e<? super Boolean> eVar) throws Throwable {
            Boolean boolA;
            er.l<E, i0> lVar;
            m mVarD0;
            e<E> eVar2 = e.this;
            ju.p pVarB = ju.r.b(uq.b.c(eVar));
            try {
                this.continuation = pVarB;
                try {
                    Object objR1 = eVar2.r1(mVar, i15, j15, this);
                    if (objR1 == lu.f.f120452m) {
                        eVar2.W0(this, mVar, i15);
                    } else {
                        er.q qVarN = null;
                        if (objR1 == lu.f.f120454o) {
                            if (j15 < eVar2.s0()) {
                                mVar.b();
                            }
                            m mVar2 = (m) e.m0().get(eVar2);
                            while (true) {
                                if (eVar2.A0()) {
                                    h();
                                } else {
                                    long andIncrement = e.n0().getAndIncrement(eVar2);
                                    int i16 = lu.f.f120441b;
                                    long j16 = andIncrement / ((long) i16);
                                    int i17 = (int) (andIncrement % ((long) i16));
                                    if (mVar2.id != j16) {
                                        mVarD0 = eVar2.d0(j16, mVar2);
                                        if (mVarD0 == null) {
                                        }
                                    } else {
                                        mVarD0 = mVar2;
                                    }
                                    objR1 = eVar2.r1(mVarD0, i17, andIncrement, this);
                                    if (objR1 == lu.f.f120452m) {
                                        eVar2.W0(this, mVarD0, i17);
                                    } else if (objR1 == lu.f.f120454o) {
                                        if (andIncrement < eVar2.s0()) {
                                            mVarD0.b();
                                        }
                                        mVar2 = mVarD0;
                                    } else {
                                        if (objR1 == lu.f.f120453n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVarD0.b();
                                        this.receiveResult = objR1;
                                        this.continuation = null;
                                        boolA = vq.b.a(true);
                                        lVar = eVar2.onUndeliveredElement;
                                        if (lVar != null) {
                                            qVarN = eVar2.N(lVar, objR1);
                                        }
                                        pVarB.T(boolA, qVarN);
                                    }
                                }
                            }
                        } else {
                            mVar.b();
                            this.receiveResult = objR1;
                            this.continuation = null;
                            boolA = vq.b.a(true);
                            lVar = eVar2.onUndeliveredElement;
                            if (lVar != null) {
                                qVarN = eVar2.N(lVar, objR1);
                            }
                            pVarB.T(boolA, qVarN);
                        }
                    }
                    Object objX = pVarB.x();
                    if (objX == uq.b.e()) {
                        vq.g.c(eVar);
                    }
                    return objX;
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    pVarB.N();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        }

        private final boolean f() throws Throwable {
            this.receiveResult = lu.f.z();
            Throwable thI0 = e.this.i0();
            if (thI0 == null) {
                return false;
            }
            throw d0.a(thI0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void h() {
            ju.p<? super Boolean> pVar = this.continuation;
            this.continuation = null;
            this.receiveResult = lu.f.z();
            Throwable thI0 = e.this.i0();
            if (thI0 == null) {
                oq.t.Companion companion = oq.t.INSTANCE;
                pVar.i(oq.t.b(Boolean.FALSE));
            } else {
                oq.t.Companion companion2 = oq.t.INSTANCE;
                pVar.i(oq.t.b(oq.u.a(thI0)));
            }
        }

        @Override // lu.i
        public Object a(tq.e<? super Boolean> eVar) throws Throwable {
            m<E> mVarD0;
            boolean zF = true;
            if (this.receiveResult == lu.f.f120455p || this.receiveResult == lu.f.z()) {
                e<E> eVar2 = e.this;
                m<E> mVar = (m) e.m0().get(eVar2);
                while (!eVar2.A0()) {
                    long andIncrement = e.n0().getAndIncrement(eVar2);
                    int i15 = lu.f.f120441b;
                    long j15 = andIncrement / ((long) i15);
                    int i16 = (int) (andIncrement % ((long) i15));
                    if (mVar.id != j15) {
                        mVarD0 = eVar2.d0(j15, mVar);
                        if (mVarD0 == null) {
                            continue;
                        }
                    } else {
                        mVarD0 = mVar;
                    }
                    Object objR1 = eVar2.r1(mVarD0, i16, andIncrement, null);
                    if (objR1 == lu.f.f120452m) {
                        throw new IllegalStateException("unreachable");
                    }
                    if (objR1 == lu.f.f120454o) {
                        if (andIncrement < eVar2.s0()) {
                            mVarD0.b();
                        }
                        mVar = mVarD0;
                    } else {
                        if (objR1 == lu.f.f120453n) {
                            return e(mVarD0, i16, andIncrement, eVar);
                        }
                        mVarD0.b();
                        this.receiveResult = objR1;
                    }
                }
                zF = f();
            }
            return vq.b.a(zF);
        }

        @Override // ju.k3
        public void g(b0<?> segment, int index) {
            ju.p<? super Boolean> pVar = this.continuation;
            if (pVar != null) {
                pVar.g(segment, index);
            }
        }

        public final boolean i(E element) {
            ju.p<? super Boolean> pVar = this.continuation;
            this.continuation = null;
            this.receiveResult = element;
            Boolean bool = Boolean.TRUE;
            e<E> eVar = e.this;
            er.l<E, i0> lVar = eVar.onUndeliveredElement;
            return lu.f.B(pVar, bool, lVar != null ? eVar.N(lVar, element) : null);
        }

        public final void j() {
            ju.p<? super Boolean> pVar = this.continuation;
            this.continuation = null;
            this.receiveResult = lu.f.z();
            Throwable thI0 = e.this.i0();
            if (thI0 == null) {
                oq.t.Companion companion = oq.t.INSTANCE;
                pVar.i(oq.t.b(Boolean.FALSE));
            } else {
                oq.t.Companion companion2 = oq.t.INSTANCE;
                pVar.i(oq.t.b(oq.u.a(thI0)));
            }
        }

        @Override // lu.i
        public E next() throws Throwable {
            E e15 = (E) this.receiveResult;
            if (e15 == lu.f.f120455p) {
                throw new IllegalStateException("`hasNext()` has not been invoked");
            }
            this.receiveResult = lu.f.f120455p;
            if (e15 != lu.f.z()) {
                return e15;
            }
            throw d0.a(e.this.l0());
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Llu/e$b;", "Lju/k3;", "Lju/n;", "", "cont", "Lju/n;", "a", "()Lju/n;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b implements k3 {
        public final ju.n<Boolean> a() {
            throw null;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class c extends fr.q implements er.q<Throwable, E, tq.i, i0> {
        c(Object obj) {
            super(3, obj, e.class, "onCancellationImplDoNotCall", "onCancellationImplDoNotCall(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void E(Throwable th4, E e15, tq.i iVar) {
            ((e) this.f66391b).L0(th4, e15, iVar);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(Throwable th4, Object obj, tq.i iVar) {
            E(th4, obj, iVar);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class d extends fr.q implements er.q<Throwable, k<? extends E>, tq.i, i0> {
        d(Object obj) {
            super(3, obj, e.class, "onCancellationChannelResultImplDoNotCall", "onCancellationChannelResultImplDoNotCall-5_sEAP8(Ljava/lang/Throwable;Ljava/lang/Object;Lkotlin/coroutines/CoroutineContext;)V", 0);
        }

        public final void E(Throwable th4, Object obj, tq.i iVar) {
            ((e) this.f66391b).K0(th4, obj, iVar);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(Throwable th4, Object obj, tq.i iVar) {
            E(th4, ((k) obj).getHolder(), iVar);
            return i0.f148189a;
        }
    }

    /* JADX INFO: renamed from: lu.e$e, reason: collision with other inner class name */
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class C2939e extends fr.q implements er.q<e<?>, ru.k<?>, Object, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final C2939e f120426j = new C2939e();

        C2939e() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void E(e<?> eVar, ru.k<?> kVar, Object obj) {
            eVar.e1(kVar, obj);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(e<?> eVar, ru.k<?> kVar, Object obj) {
            E(eVar, kVar, obj);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class f extends fr.q implements er.q<e<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final f f120427j = new f();

        f() {
            super(3, e.class, "processResultSelectReceive", "processResultSelectReceive(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // er.q
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object w(e<?> eVar, Object obj, Object obj2) {
            return eVar.Y0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends fr.q implements er.q<e<?>, ru.k<?>, Object, i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g f120428j = new g();

        g() {
            super(3, e.class, "registerSelectForReceive", "registerSelectForReceive(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void E(e<?> eVar, ru.k<?> kVar, Object obj) {
            eVar.e1(kVar, obj);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ i0 w(e<?> eVar, ru.k<?> kVar, Object obj) {
            E(eVar, kVar, obj);
            return i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends fr.q implements er.q<e<?>, Object, Object, Object> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h f120429j = new h();

        h() {
            super(3, e.class, "processResultSelectReceiveCatching", "processResultSelectReceiveCatching(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // er.q
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object w(e<?> eVar, Object obj, Object obj2) {
            return eVar.Z0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class i<E> extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f120430d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ e<E> f120431e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f120432f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(e<E> eVar, tq.e<? super i> eVar2) {
            super(eVar2);
            this.f120431e = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            this.f120430d = obj;
            this.f120432f |= PKIFailureInfo.systemUnavail;
            Object objB1 = e.b1(this.f120431e, this);
            return objB1 == uq.b.e() ? objB1 : k.b(objB1);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class j extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f120433d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f120434e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f120435f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        long f120436g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        /* synthetic */ Object f120437h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ e<E> f120438j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f120439k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(e<E> eVar, tq.e<? super j> eVar2) {
            super(eVar2);
            this.f120438j = eVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            this.f120437h = obj;
            this.f120439k |= PKIFailureInfo.systemUnavail;
            Object objC1 = this.f120438j.c1(null, 0, 0L, this);
            return objC1 == uq.b.e() ? objC1 : k.b(objC1);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public e(int i15, er.l<? super E, i0> lVar) {
        this.capacity = i15;
        this.onUndeliveredElement = lVar;
        if (i15 < 0) {
            throw new IllegalArgumentException(("Invalid channel capacity: " + i15 + ", should be >=0").toString());
        }
        this.bufferEnd$volatile = lu.f.A(i15);
        this.completedExpandBuffersAndPauseFlag$volatile = g0();
        m mVar = new m(0L, null, this, 3);
        this.sendSegment$volatile = mVar;
        this.receiveSegment$volatile = mVar;
        this.bufferEndSegment$volatile = E0() ? lu.f.f120440a : mVar;
        this.onUndeliveredElementReceiveCancellationConstructor = lVar != 0 ? new er.q() { // from class: lu.b
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e.U0(this.f120405a, (ru.k) obj, obj2, obj3);
            }
        } : null;
        this._closeCause$volatile = lu.f.f120458s;
    }

    private final boolean B0(long j15) {
        return z0(j15, true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean C0(long j15) {
        return z0(j15, false);
    }

    private final boolean E0() {
        long jG0 = g0();
        return jG0 == 0 || jG0 == Long.MAX_VALUE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final long F0(m<E> lastSegment) {
        do {
            int i15 = lu.f.f120441b;
            while (true) {
                i15--;
                if (-1 < i15) {
                    long j15 = (lastSegment.id * ((long) lu.f.f120441b)) + ((long) i15);
                    if (j15 >= o0()) {
                        while (true) {
                            Object objB = lastSegment.B(i15);
                            if (objB != null && objB != lu.f.f120444e) {
                                if (objB != lu.f.f120443d) {
                                    break;
                                }
                                return j15;
                            }
                            if (lastSegment.v(i15, objB, lu.f.z())) {
                                lastSegment.t();
                                break;
                            }
                        }
                    } else {
                        return -1L;
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        } while (lastSegment != null);
        return -1L;
    }

    private final void G0() {
        long j15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f120411d;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            if (((int) (j15 >> 60)) != 0) {
                return;
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j15, lu.f.w(1152921504606846975L & j15, 1)));
    }

    private final void H0() {
        long j15;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f120411d;
        do {
            j15 = atomicLongFieldUpdater.get(this);
        } while (!atomicLongFieldUpdater.compareAndSet(this, j15, lu.f.w(1152921504606846975L & j15, 3)));
    }

    private final void I0() {
        long j15;
        long jW;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f120411d;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            int i15 = (int) (j15 >> 60);
            if (i15 == 0) {
                jW = lu.f.w(1152921504606846975L & j15, 2);
            } else if (i15 != 1) {
                return;
            } else {
                jW = lu.f.w(1152921504606846975L & j15, 3);
            }
        } while (!atomicLongFieldUpdater.compareAndSet(this, j15, jW));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void J0(long id5, m<E> startFrom) {
        m<E> mVar;
        m<E> mVar2;
        while (startFrom.id < id5 && (mVar2 = (m) startFrom.f()) != null) {
            startFrom = mVar2;
        }
        while (true) {
            if (!startFrom.k() || (mVar = (m) startFrom.f()) == null) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f120417k;
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= startFrom.id) {
                        return;
                    }
                    if (!startFrom.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, startFrom)) {
                        if (b0Var.p()) {
                            b0Var.n();
                            return;
                        }
                        return;
                    } else if (startFrom.p()) {
                        startFrom.n();
                    }
                }
            } else {
                startFrom = mVar;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void K0(Throwable cause, Object element, tq.i context) {
        ou.x.a(this.onUndeliveredElement, k.f(element), context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void L0(Throwable cause, E element, tq.i context) {
        ou.x.a(this.onUndeliveredElement, element, context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final er.q<Throwable, Object, tq.i, i0> N(final er.l<? super E, i0> lVar, final E e15) {
        return new er.q() { // from class: lu.c
            @Override // er.q
            public final Object w(Object obj, Object obj2, Object obj3) {
                return e.P(lVar, e15, (Throwable) obj, obj2, (tq.i) obj3);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(ju.n<? super k<? extends E>> cont) {
        oq.t.Companion companion = oq.t.INSTANCE;
        cont.i(oq.t.b(k.b(k.INSTANCE.a(i0()))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr.g<i0> O(er.l<? super E, i0> lVar) {
        return new c(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O0(ju.n<? super E> cont) {
        oq.t.Companion companion = oq.t.INSTANCE;
        cont.i(oq.t.b(oq.u.a(l0())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P(er.l lVar, Object obj, Throwable th4, Object obj2, tq.i iVar) {
        ou.x.a(lVar, obj, iVar);
        return i0.f148189a;
    }

    private final void P0(ru.k<?> select) {
        select.f(lu.f.z());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final mr.g<i0> Q(er.l<? super E, i0> lVar) {
        return new d(this);
    }

    private final Object Q0(E e15, tq.e<? super i0> eVar) {
        s0 s0VarC;
        ju.p pVar = new ju.p(uq.b.c(eVar), 1);
        pVar.D();
        er.l<E, i0> lVar = this.onUndeliveredElement;
        if (lVar == null || (s0VarC = ou.x.c(lVar, e15, null, 2, null)) == null) {
            Throwable thP0 = p0();
            oq.t.Companion companion = oq.t.INSTANCE;
            pVar.i(oq.t.b(oq.u.a(thP0)));
        } else {
            oq.c.a(s0VarC, p0());
            oq.t.Companion companion2 = oq.t.INSTANCE;
            pVar.i(oq.t.b(oq.u.a(s0VarC)));
        }
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : i0.f148189a;
    }

    private final boolean R(long curSenders) {
        return curSenders < g0() || curSenders < o0() + ((long) this.capacity);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void R0(E element, ju.n<? super i0> cont) {
        er.l<E, i0> lVar = this.onUndeliveredElement;
        if (lVar != null) {
            ou.x.a(lVar, element, cont.getContext());
        }
        Throwable thP0 = p0();
        oq.t.Companion companion = oq.t.INSTANCE;
        cont.i(oq.t.b(oq.u.a(thP0)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void T(m<E> lastSegment, long sendersCounter) {
        Object objB = ou.k.b(null, 1, null);
        loop0: while (lastSegment != null) {
            for (int i15 = lu.f.f120441b - 1; -1 < i15; i15--) {
                if ((lastSegment.id * ((long) lu.f.f120441b)) + ((long) i15) < sendersCounter) {
                    break loop0;
                }
                while (true) {
                    Object objB2 = lastSegment.B(i15);
                    if (objB2 != null && objB2 != lu.f.f120444e) {
                        if (!(objB2 instanceof WaiterEB)) {
                            if (!(objB2 instanceof k3)) {
                                break;
                            }
                            if (lastSegment.v(i15, objB2, lu.f.z())) {
                                objB = ou.k.c(objB, objB2);
                                lastSegment.C(i15, true);
                                break;
                            }
                        } else {
                            if (lastSegment.v(i15, objB2, lu.f.z())) {
                                objB = ou.k.c(objB, ((WaiterEB) objB2).waiter);
                                lastSegment.C(i15, true);
                                break;
                            }
                        }
                    } else {
                        if (lastSegment.v(i15, objB2, lu.f.z())) {
                            lastSegment.t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        }
        if (objB != null) {
            if (!(objB instanceof ArrayList)) {
                g1((k3) objB);
                return;
            }
            ArrayList arrayList = (ArrayList) objB;
            for (int size = arrayList.size() - 1; -1 < size; size--) {
                g1((k3) arrayList.get(size));
            }
        }
    }

    private final m<E> U() {
        Object obj = f120417k.get(this);
        m mVar = (m) f120415h.get(this);
        if (mVar.id > ((m) obj).id) {
            obj = mVar;
        }
        m mVar2 = (m) f120416j.get(this);
        if (mVar2.id > ((m) obj).id) {
            obj = mVar2;
        }
        return (m) ou.b.b((ou.c) obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final er.q U0(final e eVar, final ru.k kVar, Object obj, final Object obj2) {
        return new er.q() { // from class: lu.d
            @Override // er.q
            public final Object w(Object obj3, Object obj4, Object obj5) {
                return e.V0(obj2, eVar, kVar, (Throwable) obj3, obj4, (tq.i) obj5);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 V0(Object obj, e eVar, ru.k kVar, Throwable th4, Object obj2, tq.i iVar) {
        if (obj != lu.f.z()) {
            ou.x.a(eVar.onUndeliveredElement, obj, kVar.getContext());
        }
        return i0.f148189a;
    }

    private final void W(long sendersCur) {
        f1(X(sendersCur));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W0(k3 k3Var, m<E> mVar, int i15) {
        T0();
        k3Var.g(mVar, i15);
    }

    private final m<E> X(long sendersCur) {
        m<E> mVarU = U();
        if (D0()) {
            long jF0 = F0(mVarU);
            if (jF0 != -1) {
                Z(jF0);
            }
        }
        T(mVarU, sendersCur);
        return mVarU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void X0(k3 k3Var, m<E> mVar, int i15) {
        k3Var.g(mVar, i15 + lu.f.f120441b);
    }

    private final void Y() {
        o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Y0(Object ignoredParam, Object selectResult) throws Throwable {
        if (selectResult != lu.f.z()) {
            return selectResult;
        }
        throw l0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object Z0(Object ignoredParam, Object selectResult) {
        return k.b(selectResult == lu.f.z() ? k.INSTANCE.a(i0()) : k.INSTANCE.c(selectResult));
    }

    static /* synthetic */ <E> Object a1(e<E> eVar, tq.e<? super E> eVar2) throws Throwable {
        m<E> mVar;
        m<E> mVar2 = (m) m0().get(eVar);
        while (!eVar.A0()) {
            long andIncrement = n0().getAndIncrement(eVar);
            int i15 = lu.f.f120441b;
            long j15 = andIncrement / ((long) i15);
            int i16 = (int) (andIncrement % ((long) i15));
            if (mVar2.id != j15) {
                m<E> mVarD0 = eVar.d0(j15, mVar2);
                if (mVarD0 == null) {
                    continue;
                } else {
                    mVar = mVarD0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar3 = eVar;
            Object objR1 = eVar3.r1(mVar, i16, andIncrement, null);
            if (objR1 == lu.f.f120452m) {
                throw new IllegalStateException("unexpected");
            }
            if (objR1 != lu.f.f120454o) {
                if (objR1 == lu.f.f120453n) {
                    return eVar3.d1(mVar, i16, andIncrement, eVar2);
                }
                mVar.b();
                return objR1;
            }
            if (andIncrement < eVar3.s0()) {
                mVar.b();
            }
            eVar = eVar3;
            mVar2 = mVar;
        }
        throw d0.a(eVar.l0());
    }

    private final void b0() {
        if (E0()) {
            return;
        }
        m<E> mVar = (m) f120417k.get(this);
        while (true) {
            long andIncrement = f120413f.getAndIncrement(this);
            int i15 = lu.f.f120441b;
            long j15 = andIncrement / ((long) i15);
            if (s0() <= andIncrement) {
                if (mVar.id < j15 && mVar.f() != 0) {
                    J0(j15, mVar);
                }
                w0(this, 0L, 1, null);
                return;
            }
            if (mVar.id != j15) {
                m<E> mVarC0 = c0(j15, mVar, andIncrement);
                if (mVarC0 == null) {
                    continue;
                } else {
                    mVar = mVarC0;
                }
            }
            if (p1(mVar, (int) (andIncrement % ((long) i15)), andIncrement)) {
                w0(this, 0L, 1, null);
                return;
            }
            w0(this, 0L, 1, null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ <E> Object b1(e<E> eVar, tq.e<? super k<? extends E>> eVar2) throws Throwable {
        i iVar;
        m<E> mVar;
        if (eVar2 instanceof i) {
            iVar = (i) eVar2;
            int i15 = iVar.f120432f;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                iVar.f120432f = i15 - PKIFailureInfo.systemUnavail;
            } else {
                iVar = new i(eVar, eVar2);
            }
        } else {
            iVar = new i(eVar, eVar2);
        }
        i iVar2 = iVar;
        Object obj = iVar2.f120430d;
        Object objE = uq.b.e();
        int i16 = iVar2.f120432f;
        if (i16 != 0) {
            if (i16 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            return ((k) obj).getHolder();
        }
        oq.u.b(obj);
        m<E> mVar2 = (m) m0().get(eVar);
        while (!eVar.A0()) {
            long andIncrement = n0().getAndIncrement(eVar);
            int i17 = lu.f.f120441b;
            long j15 = andIncrement / ((long) i17);
            int i18 = (int) (andIncrement % ((long) i17));
            if (mVar2.id != j15) {
                m<E> mVarD0 = eVar.d0(j15, mVar2);
                if (mVarD0 == null) {
                    continue;
                } else {
                    mVar = mVarD0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar3 = eVar;
            Object objR1 = eVar3.r1(mVar, i18, andIncrement, null);
            if (objR1 == lu.f.f120452m) {
                throw new IllegalStateException("unexpected");
            }
            if (objR1 != lu.f.f120454o) {
                if (objR1 != lu.f.f120453n) {
                    mVar.b();
                    return k.INSTANCE.c(objR1);
                }
                iVar2.f120432f = 1;
                Object objC1 = eVar3.c1(mVar, i18, andIncrement, iVar2);
                return objC1 == objE ? objE : objC1;
            }
            if (andIncrement < eVar3.s0()) {
                mVar.b();
            }
            eVar = eVar3;
            mVar2 = mVar;
        }
        return k.INSTANCE.a(eVar.i0());
    }

    private final m<E> c0(long id5, m<E> startFrom, long currentBufferEndCounter) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f120417k;
        er.p pVar = (er.p) lu.f.y();
        loop0: while (true) {
            objC = ou.b.c(startFrom, id5, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(objC)) {
            Y();
            J0(id5, startFrom);
            w0(this, 0L, 1, null);
            return null;
        }
        m<E> mVar = (m) c0.b(objC);
        if (mVar.id <= id5) {
            return mVar;
        }
        long j15 = mVar.id;
        int i15 = lu.f.f120441b;
        if (f120413f.compareAndSet(this, currentBufferEndCounter + 1, j15 * ((long) i15))) {
            v0((mVar.id * ((long) i15)) - currentBufferEndCounter);
        } else {
            w0(this, 0L, 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object c1(m<E> mVar, int i15, long j15, tq.e<? super k<? extends E>> eVar) throws Throwable {
        j jVar;
        k kVarB;
        m mVar2;
        if (eVar instanceof j) {
            jVar = (j) eVar;
            int i16 = jVar.f120439k;
            if ((i16 & PKIFailureInfo.systemUnavail) != 0) {
                jVar.f120439k = i16 - PKIFailureInfo.systemUnavail;
            } else {
                jVar = new j(this, eVar);
            }
        } else {
            jVar = new j(this, eVar);
        }
        Object objX = jVar.f120437h;
        Object objE = uq.b.e();
        int i17 = jVar.f120439k;
        if (i17 == 0) {
            oq.u.b(objX);
            jVar.f120433d = this;
            jVar.f120434e = mVar;
            jVar.f120435f = i15;
            jVar.f120436g = j15;
            jVar.f120439k = 1;
            ju.p pVarB = ju.r.b(uq.b.c(jVar));
            try {
                x xVar = new x(pVarB);
                try {
                    Object objR1 = r1(mVar, i15, j15, xVar);
                    if (objR1 == lu.f.f120452m) {
                        W0(xVar, mVar, i15);
                    } else {
                        mr.g gVarQ = null;
                        if (objR1 == lu.f.f120454o) {
                            if (j15 < s0()) {
                                mVar.b();
                            }
                            m mVar3 = (m) m0().get(this);
                            while (true) {
                                if (A0()) {
                                    N0(pVarB);
                                } else {
                                    long andIncrement = n0().getAndIncrement(this);
                                    int i18 = lu.f.f120441b;
                                    long j16 = andIncrement / ((long) i18);
                                    int i19 = (int) (andIncrement % ((long) i18));
                                    if (mVar3.id != j16) {
                                        m mVarD0 = d0(j16, mVar3);
                                        if (mVarD0 != null) {
                                            mVar2 = mVarD0;
                                        }
                                    } else {
                                        mVar2 = mVar3;
                                    }
                                    Object objR2 = r1(mVar2, i19, andIncrement, xVar);
                                    m mVar4 = mVar2;
                                    if (objR2 == lu.f.f120452m) {
                                        W0(xVar, mVar4, i19);
                                    } else if (objR2 == lu.f.f120454o) {
                                        if (andIncrement < s0()) {
                                            mVar4.b();
                                        }
                                        mVar3 = mVar4;
                                    } else {
                                        if (objR2 == lu.f.f120453n) {
                                            throw new IllegalStateException("unexpected");
                                        }
                                        mVar4.b();
                                        kVarB = k.b(k.INSTANCE.c(objR2));
                                        er.l<E, i0> lVar = this.onUndeliveredElement;
                                        if (lVar != null) {
                                            gVarQ = Q(lVar);
                                        }
                                    }
                                }
                            }
                        } else {
                            mVar.b();
                            kVarB = k.b(k.INSTANCE.c(objR1));
                            er.l<E, i0> lVar2 = this.onUndeliveredElement;
                            if (lVar2 != null) {
                                gVarQ = Q(lVar2);
                            }
                        }
                        pVarB.T(kVarB, (er.q) gVarQ);
                    }
                    objX = pVarB.x();
                    if (objX == uq.b.e()) {
                        vq.g.c(jVar);
                    }
                    if (objX == objE) {
                        return objE;
                    }
                } catch (Throwable th4) {
                    th = th4;
                    Throwable th5 = th;
                    pVarB.N();
                    throw th5;
                }
            } catch (Throwable th6) {
                th = th6;
            }
        } else {
            if (i17 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(objX);
        }
        return ((k) objX).getHolder();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> d0(long id5, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f120416j;
        er.p pVar = (er.p) lu.f.y();
        loop0: while (true) {
            objC = ou.b.c(startFrom, id5, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(objC)) {
            Y();
            if (startFrom.id * ((long) lu.f.f120441b) < s0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) c0.b(objC);
        if (!E0() && id5 <= g0() / ((long) lu.f.f120441b)) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f120417k;
            while (true) {
                b0 b0Var2 = (b0) atomicReferenceFieldUpdater2.get(this);
                if (b0Var2.id >= mVar.id || !mVar.u()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater2, this, b0Var2, mVar)) {
                    if (!b0Var2.p()) {
                        break;
                    }
                    b0Var2.n();
                    break;
                }
                if (mVar.p()) {
                    mVar.n();
                }
            }
        }
        long j15 = mVar.id;
        if (j15 <= id5) {
            return mVar;
        }
        int i15 = lu.f.f120441b;
        v1(j15 * ((long) i15));
        if (mVar.id * ((long) i15) < s0()) {
            mVar.b();
        }
        return null;
    }

    private final Object d1(m<E> mVar, int i15, long j15, tq.e<? super E> eVar) {
        m mVar2;
        ju.p pVarB = ju.r.b(uq.b.c(eVar));
        try {
            Object objR1 = r1(mVar, i15, j15, pVarB);
            if (objR1 != lu.f.f120452m) {
                mr.g gVarO = null;
                gVarO = null;
                if (objR1 == lu.f.f120454o) {
                    if (j15 < s0()) {
                        mVar.b();
                    }
                    m mVar3 = (m) m0().get(this);
                    while (true) {
                        if (A0()) {
                            O0(pVarB);
                            break;
                        }
                        long andIncrement = n0().getAndIncrement(this);
                        int i16 = lu.f.f120441b;
                        long j16 = andIncrement / ((long) i16);
                        int i17 = (int) (andIncrement % ((long) i16));
                        if (mVar3.id != j16) {
                            m mVarD0 = d0(j16, mVar3);
                            if (mVarD0 != null) {
                                mVar2 = mVarD0;
                            }
                        } else {
                            mVar2 = mVar3;
                        }
                        objR1 = r1(mVar2, i17, andIncrement, pVarB);
                        m mVar4 = mVar2;
                        if (objR1 == lu.f.f120452m) {
                            ju.p pVar = pVarB != null ? pVarB : null;
                            if (pVar == null) {
                                break;
                            }
                            W0(pVar, mVar4, i17);
                            break;
                        }
                        if (objR1 == lu.f.f120454o) {
                            if (andIncrement < s0()) {
                                mVar4.b();
                            }
                            mVar3 = mVar4;
                        } else {
                            if (objR1 == lu.f.f120453n) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar4.b();
                            er.l<E, i0> lVar = this.onUndeliveredElement;
                            if (lVar != null) {
                                gVarO = O(lVar);
                            }
                        }
                    }
                } else {
                    mVar.b();
                    er.l<E, i0> lVar2 = this.onUndeliveredElement;
                    if (lVar2 != null) {
                        gVarO = O(lVar2);
                    }
                }
                pVarB.T(objR1, (er.q) gVarO);
                break;
            }
            W0(pVarB, mVar, i15);
            Object objX = pVarB.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            return objX;
        } catch (Throwable th4) {
            pVarB.N();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m<E> e0(long id5, m<E> startFrom) {
        Object objC;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f120415h;
        er.p pVar = (er.p) lu.f.y();
        loop0: while (true) {
            objC = ou.b.c(startFrom, id5, pVar);
            if (!c0.c(objC)) {
                b0 b0VarB = c0.b(objC);
                while (true) {
                    b0 b0Var = (b0) atomicReferenceFieldUpdater.get(this);
                    if (b0Var.id >= b0VarB.id) {
                        break loop0;
                    }
                    if (!b0VarB.u()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, b0Var, b0VarB)) {
                        if (!b0Var.p()) {
                            break loop0;
                        }
                        b0Var.n();
                        break loop0;
                    }
                    if (b0VarB.p()) {
                        b0VarB.n();
                    }
                }
            } else {
                break;
            }
        }
        if (c0.c(objC)) {
            Y();
            if (startFrom.id * ((long) lu.f.f120441b) < o0()) {
                startFrom.b();
            }
            return null;
        }
        m<E> mVar = (m) c0.b(objC);
        long j15 = mVar.id;
        if (j15 <= id5) {
            return mVar;
        }
        int i15 = lu.f.f120441b;
        w1(j15 * ((long) i15));
        if (mVar.id * ((long) i15) < o0()) {
            mVar.b();
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void e1(ru.k<?> select, Object ignoredParam) {
        m mVar;
        m mVar2 = (m) m0().get(this);
        while (!A0()) {
            long andIncrement = n0().getAndIncrement(this);
            int i15 = lu.f.f120441b;
            long j15 = andIncrement / ((long) i15);
            int i16 = (int) (andIncrement % ((long) i15));
            if (mVar2.id != j15) {
                m mVarD0 = d0(j15, mVar2);
                if (mVarD0 == null) {
                    continue;
                } else {
                    mVar = mVarD0;
                }
            } else {
                mVar = mVar2;
            }
            ru.k<?> kVar = select;
            Object objR1 = r1(mVar, i16, andIncrement, kVar);
            mVar2 = mVar;
            if (objR1 == lu.f.f120452m) {
                k3 k3Var = kVar instanceof k3 ? (k3) kVar : null;
                if (k3Var != null) {
                    W0(k3Var, mVar2, i16);
                    return;
                }
                return;
            }
            if (objR1 != lu.f.f120454o) {
                if (objR1 == lu.f.f120453n) {
                    throw new IllegalStateException("unexpected");
                }
                mVar2.b();
                kVar.f(objR1);
                return;
            }
            if (andIncrement < s0()) {
                mVar2.b();
            }
            select = kVar;
        }
        P0(select);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void f1(m<E> lastSegment) {
        er.l<E, i0> lVar = this.onUndeliveredElement;
        s0 s0VarB = null;
        Object objB = ou.k.b(null, 1, null);
        loop0: do {
            for (int i15 = lu.f.f120441b - 1; -1 < i15; i15--) {
                long j15 = (lastSegment.id * ((long) lu.f.f120441b)) + ((long) i15);
                while (true) {
                    Object objB2 = lastSegment.B(i15);
                    if (objB2 == lu.f.f120448i) {
                        break loop0;
                    }
                    if (objB2 != lu.f.f120443d) {
                        if (objB2 != lu.f.f120444e && objB2 != null) {
                            if (!(objB2 instanceof k3) && !(objB2 instanceof WaiterEB)) {
                                if (objB2 != lu.f.f120446g && objB2 != lu.f.f120445f) {
                                    if (objB2 != lu.f.f120446g) {
                                        break;
                                    }
                                } else {
                                    break loop0;
                                }
                            } else {
                                if (j15 < o0()) {
                                    break loop0;
                                }
                                k3 k3Var = objB2 instanceof WaiterEB ? ((WaiterEB) objB2).waiter : (k3) objB2;
                                if (lastSegment.v(i15, objB2, lu.f.z())) {
                                    if (lVar != null) {
                                        s0VarB = ou.x.b(lVar, lastSegment.A(i15), s0VarB);
                                    }
                                    objB = ou.k.c(objB, k3Var);
                                    lastSegment.w(i15);
                                    lastSegment.t();
                                    break;
                                }
                            }
                        } else {
                            if (lastSegment.v(i15, objB2, lu.f.z())) {
                                lastSegment.t();
                                break;
                            }
                        }
                    } else {
                        if (j15 < o0()) {
                            break loop0;
                        }
                        if (lastSegment.v(i15, objB2, lu.f.z())) {
                            if (lVar != null) {
                                s0VarB = ou.x.b(lVar, lastSegment.A(i15), s0VarB);
                            }
                            lastSegment.w(i15);
                            lastSegment.t();
                            break;
                        }
                    }
                }
            }
            lastSegment = (m) lastSegment.h();
        } while (lastSegment != null);
        if (objB != null) {
            if (objB instanceof ArrayList) {
                ArrayList arrayList = (ArrayList) objB;
                for (int size = arrayList.size() - 1; -1 < size; size--) {
                    h1((k3) arrayList.get(size));
                }
            } else {
                h1((k3) objB);
            }
        }
        if (s0VarB != null) {
            throw s0VarB;
        }
    }

    private final long g0() {
        return f120413f.get(this);
    }

    private final void g1(k3 k3Var) {
        i1(k3Var, true);
    }

    private final void h1(k3 k3Var) {
        i1(k3Var, false);
    }

    private final void i1(k3 k3Var, boolean z15) {
        if (k3Var instanceof b) {
            ju.n<Boolean> nVarA = ((b) k3Var).a();
            oq.t.Companion companion = oq.t.INSTANCE;
            nVarA.i(oq.t.b(Boolean.FALSE));
            return;
        }
        if (k3Var instanceof ju.n) {
            tq.e eVar = (tq.e) k3Var;
            oq.t.Companion companion2 = oq.t.INSTANCE;
            eVar.i(oq.t.b(oq.u.a(z15 ? l0() : p0())));
        } else if (k3Var instanceof x) {
            ju.p<k<? extends E>> pVar = ((x) k3Var).cont;
            oq.t.Companion companion3 = oq.t.INSTANCE;
            pVar.i(oq.t.b(k.b(k.INSTANCE.a(i0()))));
        } else if (k3Var instanceof a) {
            ((a) k3Var).j();
        } else {
            if (k3Var instanceof ru.k) {
                ((ru.k) k3Var).h(this, lu.f.z());
                return;
            }
            throw new IllegalStateException(("Unexpected waiter: " + k3Var).toString());
        }
    }

    static /* synthetic */ <E> Object j1(e<E> eVar, E e15, tq.e<? super i0> eVar2) {
        m<E> mVar;
        m<E> mVar2 = (m) q0().get(eVar);
        while (true) {
            long andIncrement = r0().getAndIncrement(eVar);
            long j15 = andIncrement & 1152921504606846975L;
            boolean zC0 = eVar.C0(andIncrement);
            int i15 = lu.f.f120441b;
            long j16 = j15 / ((long) i15);
            int i16 = (int) (j15 % ((long) i15));
            if (mVar2.id != j16) {
                m<E> mVarE0 = eVar.e0(j16, mVar2);
                if (mVarE0 != null) {
                    mVar = mVarE0;
                } else if (zC0) {
                    Object objQ0 = eVar.Q0(e15, eVar2);
                    if (objQ0 != uq.b.e()) {
                        break;
                    }
                    return objQ0;
                }
            } else {
                mVar = mVar2;
            }
            e<E> eVar3 = eVar;
            E e16 = e15;
            int iT1 = eVar3.t1(mVar, i16, e16, j15, null, zC0);
            if (iT1 == 0) {
                mVar.b();
                break;
            }
            if (iT1 != 1) {
                if (iT1 == 2) {
                    if (!zC0) {
                        break;
                    }
                    mVar.t();
                    Object objQ1 = eVar3.Q0(e16, eVar2);
                    if (objQ1 != uq.b.e()) {
                        break;
                    }
                    return objQ1;
                }
                if (iT1 == 3) {
                    Object objK1 = eVar3.k1(mVar, i16, e16, j15, eVar2);
                    if (objK1 != uq.b.e()) {
                        break;
                    }
                    return objK1;
                }
                if (iT1 == 4) {
                    if (j15 < eVar3.o0()) {
                        mVar.b();
                    }
                    Object objQ2 = eVar3.Q0(e16, eVar2);
                    if (objQ2 != uq.b.e()) {
                        break;
                    }
                    return objQ2;
                }
                if (iT1 == 5) {
                    mVar.b();
                }
                eVar = eVar3;
                mVar2 = mVar;
                e15 = e16;
            } else {
                break;
            }
        }
        return i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:62:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00fd A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:66:0x00fe  */
    private final Object k1(m<E> mVar, int i15, E e15, long j15, tq.e<? super i0> eVar) {
        i0 i0Var;
        Object objX;
        m mVarE0;
        ju.p pVarB = ju.r.b(uq.b.c(eVar));
        try {
            int iT1 = t1(mVar, i15, e15, j15, pVarB, false);
            if (iT1 == 0) {
                mVar.b();
                oq.t.Companion companion = oq.t.INSTANCE;
                i0Var = i0.f148189a;
            } else {
                if (iT1 != 1) {
                    if (iT1 != 2) {
                        if (iT1 != 4) {
                            String str = "unexpected";
                            if (iT1 != 5) {
                                throw new IllegalStateException("unexpected");
                            }
                            mVar.b();
                            m mVar2 = (m) q0().get(this);
                            while (true) {
                                long andIncrement = r0().getAndIncrement(this);
                                long j16 = 1152921504606846975L & andIncrement;
                                boolean zC0 = C0(andIncrement);
                                int i16 = lu.f.f120441b;
                                long j17 = j16 / ((long) i16);
                                int i17 = (int) (j16 % ((long) i16));
                                str = str;
                                if (mVar2.id != j17) {
                                    mVarE0 = e0(j17, mVar2);
                                    if (mVarE0 == null) {
                                        if (zC0) {
                                        }
                                    }
                                } else {
                                    mVarE0 = mVar2;
                                }
                                int iT2 = t1(mVarE0, i17, e15, j16, pVarB, zC0);
                                if (iT2 == 0) {
                                    mVarE0.b();
                                    oq.t.Companion companion2 = oq.t.INSTANCE;
                                    i0Var = i0.f148189a;
                                } else if (iT2 == 1) {
                                    oq.t.Companion companion3 = oq.t.INSTANCE;
                                    i0Var = i0.f148189a;
                                } else if (iT2 == 2) {
                                    if (!zC0) {
                                        ju.p pVar = pVarB != null ? pVarB : null;
                                        if (pVar == null) {
                                            break;
                                        }
                                        X0(pVar, mVarE0, i17);
                                        break;
                                    }
                                    mVarE0.t();
                                } else {
                                    if (iT2 == 3) {
                                        throw new IllegalStateException(str);
                                    }
                                    if (iT2 != 4) {
                                        if (iT2 == 5) {
                                            mVarE0.b();
                                        }
                                        mVar2 = mVarE0;
                                    } else if (j16 < o0()) {
                                        mVarE0.b();
                                    }
                                }
                            }
                        } else if (j15 < o0()) {
                            mVar.b();
                        }
                        R0(e15, pVarB);
                        break;
                    } else {
                        X0(pVarB, mVar, i15);
                    }
                    objX = pVarB.x();
                    if (objX == uq.b.e()) {
                        vq.g.c(eVar);
                    }
                    if (objX == uq.b.e()) {
                        return objX;
                    }
                    return i0.f148189a;
                }
                oq.t.Companion companion4 = oq.t.INSTANCE;
                i0Var = i0.f148189a;
            }
            pVarB.i(oq.t.b(i0Var));
            objX = pVarB.x();
            if (objX == uq.b.e()) {
                vq.g.c(eVar);
            }
            if (objX == uq.b.e()) {
                return objX;
            }
            return i0.f148189a;
        } catch (Throwable th4) {
            pVarB.N();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Throwable l0() {
        Throwable thI0 = i0();
        return thI0 == null ? new q("Channel was closed") : thI0;
    }

    private final boolean l1(long curSendersAndCloseStatus) {
        if (C0(curSendersAndCloseStatus)) {
            return false;
        }
        return !R(curSendersAndCloseStatus & 1152921504606846975L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater m0() {
        return f120416j;
    }

    private final boolean m1(Object obj, E e15) {
        if (obj instanceof ru.k) {
            return ((ru.k) obj).h(this, e15);
        }
        if (obj instanceof x) {
            ju.p<k<? extends E>> pVar = ((x) obj).cont;
            k kVarB = k.b(k.INSTANCE.c(e15));
            er.l<E, i0> lVar = this.onUndeliveredElement;
            return lu.f.B(pVar, kVarB, (er.q) (lVar != null ? Q(lVar) : null));
        }
        if (obj instanceof a) {
            return ((a) obj).i(e15);
        }
        if (obj instanceof ju.n) {
            ju.n nVar = (ju.n) obj;
            er.l<E, i0> lVar2 = this.onUndeliveredElement;
            return lu.f.B(nVar, e15, (er.q) (lVar2 != null ? O(lVar2) : null));
        }
        throw new IllegalStateException(("Unexpected receiver type: " + obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater n0() {
        return f120412e;
    }

    private final boolean n1(Object obj, m<E> mVar, int i15) {
        if (obj instanceof ju.n) {
            return lu.f.C((ju.n) obj, i0.f148189a, null, 2, null);
        }
        if (obj instanceof ru.k) {
            ru.m mVarY = ((ru.j) obj).y(this, i0.f148189a);
            if (mVarY == ru.m.REREGISTER) {
                mVar.w(i15);
            }
            return mVarY == ru.m.SUCCESSFUL;
        }
        if (obj instanceof b) {
            return lu.f.C(((b) obj).a(), Boolean.TRUE, null, 2, null);
        }
        throw new IllegalStateException(("Unexpected waiter: " + obj).toString());
    }

    private final boolean p1(m<E> segment, int index, long b15) {
        Object objB = segment.B(index);
        if (!(objB instanceof k3) || b15 < f120412e.get(this) || !segment.v(index, objB, lu.f.f120446g)) {
            return q1(segment, index, b15);
        }
        if (n1(objB, segment, index)) {
            segment.F(index, lu.f.f120443d);
            return true;
        }
        segment.F(index, lu.f.f120449j);
        segment.C(index, false);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicReferenceFieldUpdater q0() {
        return f120415h;
    }

    private final boolean q1(m<E> segment, int index, long b15) {
        while (true) {
            Object objB = segment.B(index);
            if (objB instanceof k3) {
                if (b15 < f120412e.get(this)) {
                    if (segment.v(index, objB, new WaiterEB((k3) objB))) {
                        return true;
                    }
                } else if (segment.v(index, objB, lu.f.f120446g)) {
                    if (n1(objB, segment, index)) {
                        segment.F(index, lu.f.f120443d);
                        return true;
                    }
                    segment.F(index, lu.f.f120449j);
                    segment.C(index, false);
                    return false;
                }
            } else {
                if (objB == lu.f.f120449j) {
                    return false;
                }
                if (objB == null) {
                    if (segment.v(index, objB, lu.f.f120444e)) {
                        return true;
                    }
                } else {
                    if (objB == lu.f.f120443d || objB == lu.f.f120447h || objB == lu.f.f120448i || objB == lu.f.f120450k || objB == lu.f.z()) {
                        return true;
                    }
                    if (objB != lu.f.f120445f) {
                        throw new IllegalStateException(("Unexpected cell state: " + objB).toString());
                    }
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater r0() {
        return f120411d;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object r1(m<E> segment, int index, long r15, Object waiter) {
        Object objB = segment.B(index);
        if (objB == null) {
            if (r15 >= (f120411d.get(this) & 1152921504606846975L)) {
                if (waiter == null) {
                    return lu.f.f120453n;
                }
                if (segment.v(index, objB, waiter)) {
                    b0();
                    return lu.f.f120452m;
                }
            }
        } else if (objB == lu.f.f120443d && segment.v(index, objB, lu.f.f120448i)) {
            b0();
            return segment.D(index);
        }
        return s1(segment, index, r15, waiter);
    }

    private final Object s1(m<E> segment, int index, long r15, Object waiter) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null || objB == lu.f.f120444e) {
                if (r15 < (f120411d.get(this) & 1152921504606846975L)) {
                    if (segment.v(index, objB, lu.f.f120447h)) {
                        b0();
                        return lu.f.f120454o;
                    }
                } else {
                    if (waiter == null) {
                        return lu.f.f120453n;
                    }
                    if (segment.v(index, objB, waiter)) {
                        b0();
                        return lu.f.f120452m;
                    }
                }
            } else {
                if (objB != lu.f.f120443d) {
                    if (objB != lu.f.f120449j && objB != lu.f.f120447h) {
                        if (objB == lu.f.z()) {
                            b0();
                            return lu.f.f120454o;
                        }
                        if (objB != lu.f.f120446g && segment.v(index, objB, lu.f.f120445f)) {
                            boolean z15 = objB instanceof WaiterEB;
                            if (z15) {
                                objB = ((WaiterEB) objB).waiter;
                            }
                            if (n1(objB, segment, index)) {
                                segment.F(index, lu.f.f120448i);
                                b0();
                                return segment.D(index);
                            }
                            segment.F(index, lu.f.f120449j);
                            segment.C(index, false);
                            if (z15) {
                                b0();
                            }
                            return lu.f.f120454o;
                        }
                    }
                    return lu.f.f120454o;
                }
                if (segment.v(index, objB, lu.f.f120448i)) {
                    b0();
                    return segment.D(index);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int t1(m<E> segment, int index, E element, long s15, Object waiter, boolean closed) {
        segment.G(index, element);
        if (closed) {
            return u1(segment, index, element, s15, waiter, closed);
        }
        Object objB = segment.B(index);
        if (objB == null) {
            if (R(s15)) {
                if (segment.v(index, null, lu.f.f120443d)) {
                    return 1;
                }
            } else {
                if (waiter == null) {
                    return 3;
                }
                if (segment.v(index, null, waiter)) {
                    return 2;
                }
            }
        } else if (objB instanceof k3) {
            segment.w(index);
            if (m1(objB, element)) {
                segment.F(index, lu.f.f120448i);
                S0();
                return 0;
            }
            if (segment.x(index, lu.f.f120450k) == lu.f.f120450k) {
                return 5;
            }
            segment.C(index, true);
            return 5;
        }
        return u1(segment, index, element, s15, waiter, closed);
    }

    private final int u1(m<E> segment, int index, E element, long s15, Object waiter, boolean closed) {
        while (true) {
            Object objB = segment.B(index);
            if (objB == null) {
                if (!R(s15) || closed) {
                    if (closed) {
                        if (segment.v(index, null, lu.f.f120449j)) {
                            segment.C(index, false);
                            return 4;
                        }
                    } else {
                        if (waiter == null) {
                            return 3;
                        }
                        if (segment.v(index, null, waiter)) {
                            return 2;
                        }
                    }
                } else if (segment.v(index, null, lu.f.f120443d)) {
                    return 1;
                }
            } else {
                if (objB != lu.f.f120444e) {
                    if (objB == lu.f.f120450k) {
                        segment.w(index);
                        return 5;
                    }
                    if (objB == lu.f.f120447h) {
                        segment.w(index);
                        return 5;
                    }
                    if (objB == lu.f.z()) {
                        segment.w(index);
                        Y();
                        return 4;
                    }
                    segment.w(index);
                    if (objB instanceof WaiterEB) {
                        objB = ((WaiterEB) objB).waiter;
                    }
                    if (m1(objB, element)) {
                        segment.F(index, lu.f.f120448i);
                        S0();
                        return 0;
                    }
                    if (segment.x(index, lu.f.f120450k) != lu.f.f120450k) {
                        segment.C(index, true);
                    }
                    return 5;
                }
                if (segment.v(index, objB, lu.f.f120443d)) {
                    return 1;
                }
            }
        }
    }

    private final void v0(long nAttempts) {
        if ((f120414g.addAndGet(this, nAttempts) & 4611686018427387904L) != 0) {
            while ((f120414g.get(this) & 4611686018427387904L) != 0) {
            }
        }
    }

    private final void v1(long value) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f120412e;
        while (true) {
            long j15 = atomicLongFieldUpdater.get(this);
            if (j15 >= value) {
                return;
            }
            long j16 = value;
            if (f120412e.compareAndSet(this, j15, j16)) {
                return;
            } else {
                value = j16;
            }
        }
    }

    static /* synthetic */ void w0(e eVar, long j15, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: incCompletedExpandBufferAttempts");
        }
        if ((i15 & 1) != 0) {
            j15 = 1;
        }
        eVar.v0(j15);
    }

    private final void w1(long value) {
        long j15;
        long j16;
        AtomicLongFieldUpdater atomicLongFieldUpdater = f120411d;
        do {
            j15 = atomicLongFieldUpdater.get(this);
            j16 = 1152921504606846975L & j15;
            if (j16 >= value) {
                return;
            }
        } while (!f120411d.compareAndSet(this, j15, lu.f.w(j16, (int) (j15 >> 60))));
    }

    private final void x0() {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f120419m;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
        } while (!androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, obj, obj == null ? lu.f.f120456q : lu.f.f120457r));
        if (obj == null) {
            return;
        }
        ((er.l) obj).b(i0());
    }

    private final boolean y0(m<E> segment, int index, long globalIndex) {
        Object objB;
        do {
            objB = segment.B(index);
            if (objB != null && objB != lu.f.f120444e) {
                if (objB == lu.f.f120443d) {
                    return true;
                }
                if (objB == lu.f.f120449j || objB == lu.f.z() || objB == lu.f.f120448i || objB == lu.f.f120447h) {
                    return false;
                }
                if (objB == lu.f.f120446g) {
                    return true;
                }
                return objB != lu.f.f120445f && globalIndex == o0();
            }
        } while (!segment.v(index, objB, lu.f.f120447h));
        b0();
        return false;
    }

    private final boolean z0(long sendersAndCloseStatusCur, boolean isClosedForReceive) {
        int i15 = (int) (sendersAndCloseStatusCur >> 60);
        if (i15 == 0 || i15 == 1) {
            return false;
        }
        if (i15 == 2) {
            X(sendersAndCloseStatusCur & 1152921504606846975L);
            return (isClosedForReceive && u0()) ? false : true;
        }
        if (i15 == 3) {
            W(sendersAndCloseStatusCur & 1152921504606846975L);
            return true;
        }
        throw new IllegalStateException(("unexpected close status: " + i15).toString());
    }

    public boolean A0() {
        return B0(f120411d.get(this));
    }

    protected boolean D0() {
        return false;
    }

    protected void M0() {
    }

    public boolean S(Throwable cause) {
        if (cause == null) {
            cause = new CancellationException("Channel was cancelled");
        }
        return V(cause, true);
    }

    protected void S0() {
    }

    protected void T0() {
    }

    protected boolean V(Throwable cause, boolean cancel) {
        if (cancel) {
            G0();
        }
        boolean zA = androidx.concurrent.futures.b.a(f120418l, this, lu.f.f120458s, cause);
        if (cancel) {
            H0();
        } else {
            I0();
        }
        Y();
        M0();
        if (zA) {
            x0();
        }
        return zA;
    }

    protected final void Z(long globalCellIndex) {
        m<E> mVarD0;
        s0 s0VarC;
        m<E> mVar = (m) f120416j.get(this);
        while (true) {
            long j15 = f120412e.get(this);
            if (globalCellIndex < Math.max(((long) this.capacity) + j15, g0())) {
                return;
            }
            if (f120412e.compareAndSet(this, j15, 1 + j15)) {
                int i15 = lu.f.f120441b;
                long j16 = j15 / ((long) i15);
                int i16 = (int) (j15 % ((long) i15));
                if (mVar.id != j16) {
                    mVarD0 = d0(j16, mVar);
                    if (mVarD0 == null) {
                        continue;
                    }
                } else {
                    mVarD0 = mVar;
                }
                Object objR1 = r1(mVarD0, i16, j15, null);
                if (objR1 != lu.f.f120454o) {
                    mVarD0.b();
                    er.l<E, i0> lVar = this.onUndeliveredElement;
                    if (lVar != null && (s0VarC = ou.x.c(lVar, objR1, null, 2, null)) != null) {
                        throw s0VarC;
                    }
                } else if (j15 < s0()) {
                    mVarD0.b();
                }
                mVar = mVarD0;
            }
        }
    }

    @Override // lu.y
    public Object a(tq.e<? super E> eVar) {
        return a1(this, eVar);
    }

    @Override // lu.y
    public Object b(tq.e<? super k<? extends E>> eVar) {
        return b1(this, eVar);
    }

    @Override // lu.z
    public Object d(E element) {
        m mVar;
        if (l1(f120411d.get(this))) {
            return k.INSTANCE.b();
        }
        Object obj = lu.f.f120449j;
        m mVar2 = (m) q0().get(this);
        while (true) {
            long andIncrement = r0().getAndIncrement(this);
            long j15 = andIncrement & 1152921504606846975L;
            boolean zC0 = C0(andIncrement);
            int i15 = lu.f.f120441b;
            long j16 = j15 / ((long) i15);
            int i16 = (int) (j15 % ((long) i15));
            if (mVar2.id != j16) {
                m mVarE0 = e0(j16, mVar2);
                if (mVarE0 != null) {
                    mVar = mVarE0;
                } else if (zC0) {
                    return k.INSTANCE.a(p0());
                }
            } else {
                mVar = mVar2;
            }
            int iT1 = t1(mVar, i16, element, j15, obj, zC0);
            mVar2 = mVar;
            if (iT1 == 0) {
                mVar2.b();
                return k.INSTANCE.c(i0.f148189a);
            }
            if (iT1 == 1) {
                return k.INSTANCE.c(i0.f148189a);
            }
            if (iT1 == 2) {
                if (zC0) {
                    mVar2.t();
                    return k.INSTANCE.a(p0());
                }
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    X0(k3Var, mVar2, i16);
                }
                mVar2.t();
                return k.INSTANCE.b();
            }
            if (iT1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iT1 == 4) {
                if (j15 < o0()) {
                    mVar2.b();
                }
                return k.INSTANCE.a(p0());
            }
            if (iT1 == 5) {
                mVar2.b();
            }
            element = element;
        }
    }

    @Override // lu.y
    public ru.g<E> f() {
        return new ru.h(this, (er.q) w0.g(C2939e.f120426j, 3), (er.q) w0.g(f.f120427j, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    @Override // lu.z
    public void g(er.l<? super Throwable, i0> handler) {
        if (androidx.concurrent.futures.b.a(f120419m, this, null, handler)) {
            return;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f120419m;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj != lu.f.f120456q) {
                if (obj == lu.f.f120457r) {
                    throw new IllegalStateException("Another handler was already registered and successfully invoked");
                }
                throw new IllegalStateException(("Another handler is already registered: " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f120419m, this, lu.f.f120456q, lu.f.f120457r));
        handler.b(i0());
    }

    protected final Throwable i0() {
        return (Throwable) f120418l.get(this);
    }

    @Override // lu.y
    public lu.i<E> iterator() {
        return new a();
    }

    @Override // lu.y
    public ru.g<k<E>> j() {
        return new ru.h(this, (er.q) w0.g(g.f120428j, 3), (er.q) w0.g(h.f120429j, 3), this.onUndeliveredElementReceiveCancellationConstructor);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // lu.y
    public Object k() {
        m mVarD0;
        long j15 = f120412e.get(this);
        long j16 = f120411d.get(this);
        if (B0(j16)) {
            return k.INSTANCE.a(i0());
        }
        if (j15 >= (j16 & 1152921504606846975L)) {
            return k.INSTANCE.b();
        }
        Object obj = lu.f.f120450k;
        m mVar = (m) m0().get(this);
        while (!A0()) {
            long andIncrement = n0().getAndIncrement(this);
            int i15 = lu.f.f120441b;
            long j17 = andIncrement / ((long) i15);
            int i16 = (int) (andIncrement % ((long) i15));
            if (mVar.id != j17) {
                mVarD0 = d0(j17, mVar);
                if (mVarD0 == null) {
                    continue;
                }
            } else {
                mVarD0 = mVar;
            }
            Object objR1 = r1(mVarD0, i16, andIncrement, obj);
            if (objR1 == lu.f.f120452m) {
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    W0(k3Var, mVarD0, i16);
                }
                x1(andIncrement);
                mVarD0.t();
                return k.INSTANCE.b();
            }
            if (objR1 != lu.f.f120454o) {
                if (objR1 == lu.f.f120453n) {
                    throw new IllegalStateException("unexpected");
                }
                mVarD0.b();
                return k.INSTANCE.c(objR1);
            }
            if (andIncrement < s0()) {
                mVarD0.b();
            }
            mVar = mVarD0;
        }
        return k.INSTANCE.a(i0());
    }

    @Override // lu.z
    public Object l(E e15, tq.e<? super i0> eVar) {
        return j1(this, e15, eVar);
    }

    @Override // lu.z
    public boolean n(Throwable cause) {
        return V(cause, false);
    }

    @Override // lu.z
    public boolean o() {
        return C0(f120411d.get(this));
    }

    public final long o0() {
        return f120412e.get(this);
    }

    protected final Object o1(E element) {
        m mVarE0;
        Object obj = lu.f.f120443d;
        m mVar = (m) q0().get(this);
        while (true) {
            long andIncrement = r0().getAndIncrement(this);
            long j15 = andIncrement & 1152921504606846975L;
            boolean zC0 = C0(andIncrement);
            int i15 = lu.f.f120441b;
            long j16 = j15 / ((long) i15);
            int i16 = (int) (j15 % ((long) i15));
            if (mVar.id != j16) {
                mVarE0 = e0(j16, mVar);
                if (mVarE0 == null) {
                    if (zC0) {
                        return k.INSTANCE.a(p0());
                    }
                }
            } else {
                mVarE0 = mVar;
            }
            E e15 = element;
            int iT1 = t1(mVarE0, i16, e15, j15, obj, zC0);
            mVar = mVarE0;
            if (iT1 == 0) {
                mVar.b();
                return k.INSTANCE.c(i0.f148189a);
            }
            if (iT1 == 1) {
                return k.INSTANCE.c(i0.f148189a);
            }
            if (iT1 == 2) {
                if (zC0) {
                    mVar.t();
                    return k.INSTANCE.a(p0());
                }
                k3 k3Var = obj instanceof k3 ? (k3) obj : null;
                if (k3Var != null) {
                    X0(k3Var, mVar, i16);
                }
                Z((mVar.id * ((long) i15)) + ((long) i16));
                return k.INSTANCE.c(i0.f148189a);
            }
            if (iT1 == 3) {
                throw new IllegalStateException("unexpected");
            }
            if (iT1 == 4) {
                if (j15 < o0()) {
                    mVar.b();
                }
                return k.INSTANCE.a(p0());
            }
            if (iT1 == 5) {
                mVar.b();
            }
            element = e15;
        }
    }

    protected final Throwable p0() {
        Throwable thI0 = i0();
        return thI0 == null ? new r("Channel was closed") : thI0;
    }

    public final long s0() {
        return f120411d.get(this) & 1152921504606846975L;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public String toString() {
        String string;
        StringBuilder sb5 = new StringBuilder();
        int i15 = (int) (f120411d.get(this) >> 60);
        if (i15 == 2) {
            sb5.append("closed,");
        } else if (i15 == 3) {
            sb5.append("cancelled,");
        }
        sb5.append("capacity=" + this.capacity + ',');
        sb5.append("data=[");
        int i16 = 0;
        boolean z15 = true;
        List listQ = pq.v.q(f120416j.get(this), f120415h.get(this), f120417k.get(this));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (((m) obj) != lu.f.f120440a) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        Object next = it.next();
        if (it.hasNext()) {
            long j15 = ((m) next).id;
            do {
                Object next2 = it.next();
                long j16 = ((m) next2).id;
                if (j15 > j16) {
                    next = next2;
                    j15 = j16;
                }
            } while (it.hasNext());
        }
        m mVar = (m) next;
        long jO0 = o0();
        long jS0 = s0();
        loop2: while (true) {
            int i17 = lu.f.f120441b;
            int i18 = i16;
            while (i18 < i17) {
                long j17 = (mVar.id * ((long) lu.f.f120441b)) + ((long) i18);
                if (j17 >= jS0 && j17 >= jO0) {
                    break loop2;
                }
                Object objB = mVar.B(i18);
                Object objA = mVar.A(i18);
                boolean z16 = z15;
                if (objB instanceof ju.n) {
                    string = (j17 >= jO0 || j17 < jS0) ? (j17 >= jS0 || j17 < jO0) ? "cont" : "send" : "receive";
                } else if (objB instanceof ru.k) {
                    string = (j17 >= jO0 || j17 < jS0) ? (j17 >= jS0 || j17 < jO0) ? "select" : "onSend" : "onReceive";
                } else if (objB instanceof x) {
                    string = "receiveCatching";
                } else if (objB instanceof b) {
                    string = "sendBroadcast";
                } else if (objB instanceof WaiterEB) {
                    string = "EB(" + objB + ')';
                } else if (fr.t.c(objB, lu.f.f120445f) || fr.t.c(objB, lu.f.f120446g)) {
                    string = "resuming_sender";
                } else {
                    if (objB != null && !fr.t.c(objB, lu.f.f120444e) && !fr.t.c(objB, lu.f.f120448i) && !fr.t.c(objB, lu.f.f120447h) && !fr.t.c(objB, lu.f.f120450k) && !fr.t.c(objB, lu.f.f120449j) && !fr.t.c(objB, lu.f.z())) {
                        string = objB.toString();
                    }
                    i18++;
                    z15 = z16;
                }
                if (objA != null) {
                    sb5.append('(' + string + ',' + objA + "),");
                } else {
                    sb5.append(string + ',');
                }
                i18++;
                z15 = z16;
            }
            boolean z17 = z15;
            mVar = (m) mVar.f();
            if (mVar == null) {
                break;
            }
            z15 = z17;
            i16 = 0;
        }
        if (fu.r.F1(sb5) == ',') {
            sb5.deleteCharAt(sb5.length() - 1);
        }
        sb5.append("]");
        return sb5.toString();
    }

    @Override // lu.y
    public final void u(CancellationException cause) {
        S(cause);
    }

    public final boolean u0() {
        while (true) {
            m<E> mVarD0 = (m) f120416j.get(this);
            long jO0 = o0();
            if (s0() <= jO0) {
                return false;
            }
            int i15 = lu.f.f120441b;
            long j15 = jO0 / ((long) i15);
            if (mVarD0.id == j15 || (mVarD0 = d0(j15, mVarD0)) != null) {
                mVarD0.b();
                if (y0(mVarD0, (int) (jO0 % ((long) i15)), jO0)) {
                    return true;
                }
                f120412e.compareAndSet(this, jO0, 1 + jO0);
            } else if (((m) f120416j.get(this)).id < j15) {
                return false;
            }
        }
    }

    public final void x1(long globalIndex) {
        e<E> eVar = this;
        if (eVar.E0()) {
            return;
        }
        while (eVar.g0() <= globalIndex) {
            eVar = this;
        }
        int i15 = lu.f.f120442c;
        for (int i16 = 0; i16 < i15; i16++) {
            long jG0 = eVar.g0();
            if (jG0 == (4611686018427387903L & f120414g.get(eVar)) && jG0 == eVar.g0()) {
                return;
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f120414g;
        while (true) {
            long j15 = atomicLongFieldUpdater.get(eVar);
            if (atomicLongFieldUpdater.compareAndSet(eVar, j15, lu.f.v(j15 & 4611686018427387903L, true))) {
                break;
            } else {
                eVar = this;
            }
        }
        while (true) {
            long jG1 = eVar.g0();
            long j16 = f120414g.get(eVar);
            long j17 = j16 & 4611686018427387903L;
            boolean z15 = (4611686018427387904L & j16) != 0;
            if (jG1 == j17 && jG1 == eVar.g0()) {
                break;
            }
            if (z15) {
                eVar = this;
            } else {
                eVar = this;
                f120414g.compareAndSet(eVar, j16, lu.f.v(j17, true));
            }
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater2 = f120414g;
        while (true) {
            long j18 = atomicLongFieldUpdater2.get(eVar);
            boolean zCompareAndSet = atomicLongFieldUpdater2.compareAndSet(eVar, j18, lu.f.v(j18 & 4611686018427387903L, false));
            AtomicLongFieldUpdater atomicLongFieldUpdater3 = atomicLongFieldUpdater2;
            if (zCompareAndSet) {
                return;
            }
            atomicLongFieldUpdater2 = atomicLongFieldUpdater3;
            eVar = this;
        }
    }
}
