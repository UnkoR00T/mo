package ju;

import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ð\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u0003\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\n¼\u0001½\u0001¾\u0001¿\u0001À\u0001B\u000f\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\f\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001b\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u00142\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010#J\u001d\u0010$\u001a\u00020\u0014*\u00020\u001d2\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b$\u0010!J\u0019\u0010&\u001a\u00020%2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020+H\u0002¢\u0006\u0004\b,\u0010-J\u000f\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b.\u0010/J\u0010\u00100\u001a\u00020\u0014H\u0082@¢\u0006\u0004\b0\u00101J%\u00105\u001a\u00020\u00142\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\b\u00104\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b5\u00106J\u001b\u00107\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b7\u00108J\u0019\u00109\u001a\u00020\u000f2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b9\u0010:J\u001b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b;\u00108J\u0019\u0010<\u001a\u0004\u0018\u00010\u001d2\u0006\u0010\t\u001a\u00020\u0017H\u0002¢\u0006\u0004\b<\u0010=J\u001f\u0010>\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b>\u0010?J%\u0010@\u001a\u0004\u0018\u00010\n2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b@\u0010AJ#\u0010B\u001a\u0004\u0018\u00010\n2\u0006\u0010\t\u001a\u00020\u00172\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bB\u0010CJ*\u0010F\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b2\u0006\u0010E\u001a\u00020D2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082\u0010¢\u0006\u0004\bF\u0010GJ)\u0010I\u001a\u00020\u00142\u0006\u0010\t\u001a\u00020\b2\u0006\u0010H\u001a\u00020D2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bI\u0010JJ\u0015\u0010L\u001a\u0004\u0018\u00010D*\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0019\u0010O\u001a\u00020N2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\bQ\u00101J%\u0010R\u001a\u00020\u00142\n\u00103\u001a\u0006\u0012\u0002\b\u0003022\b\u00104\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bR\u00106J%\u0010T\u001a\u0004\u0018\u00010\n2\b\u00104\u001a\u0004\u0018\u00010\n2\b\u0010S\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\bT\u0010AJ\u0019\u0010V\u001a\u00020\u00142\b\u0010U\u001a\u0004\u0018\u00010\u0001H\u0004¢\u0006\u0004\bV\u0010WJ\r\u0010X\u001a\u00020\u0004¢\u0006\u0004\bX\u0010/J\u000f\u0010Y\u001a\u00020\u0014H\u0014¢\u0006\u0004\bY\u0010ZJ\u0011\u0010]\u001a\u00060[j\u0002`\\¢\u0006\u0004\b]\u0010^J#\u0010`\u001a\u00060[j\u0002`\\*\u00020\u000f2\n\b\u0002\u0010_\u001a\u0004\u0018\u00010NH\u0004¢\u0006\u0004\b`\u0010aJ'\u0010f\u001a\u00020e2\u0018\u0010d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140bj\u0002`c¢\u0006\u0004\bf\u0010gJ7\u0010j\u001a\u00020e2\u0006\u0010h\u001a\u00020\u00042\u0006\u0010i\u001a\u00020\u00042\u0018\u0010d\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00140bj\u0002`c¢\u0006\u0004\bj\u0010kJ\u001f\u0010m\u001a\u00020e2\u0006\u0010i\u001a\u00020\u00042\u0006\u0010l\u001a\u00020+H\u0000¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0014H\u0086@¢\u0006\u0004\bo\u00101J\u0017\u0010p\u001a\u00020\u00142\u0006\u0010l\u001a\u00020+H\u0000¢\u0006\u0004\bp\u0010-J\u001f\u0010q\u001a\u00020\u00142\u000e\u0010\u001f\u001a\n\u0018\u00010[j\u0004\u0018\u0001`\\H\u0016¢\u0006\u0004\bq\u0010rJ\u000f\u0010s\u001a\u00020NH\u0014¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bu\u0010vJ\u0015\u0010x\u001a\u00020\u00142\u0006\u0010w\u001a\u00020\u0003¢\u0006\u0004\bx\u0010yJ\u0017\u0010z\u001a\u00020\u00042\u0006\u0010\u001f\u001a\u00020\u000fH\u0016¢\u0006\u0004\bz\u0010#J\u0017\u0010{\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b{\u0010#J\u0019\u0010|\u001a\u00020\u00042\b\u0010\u001f\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b|\u0010}J\u0013\u0010~\u001a\u00060[j\u0002`\\H\u0016¢\u0006\u0004\b~\u0010^J\u0019\u0010\u007f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0004\b\u007f\u0010}J\u001d\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0005\b\u0080\u0001\u00108J\u0019\u0010\u0082\u0001\u001a\u00030\u0081\u00012\u0006\u0010E\u001a\u00020\u0002¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u001a\u0010\u0085\u0001\u001a\u00020\u00142\u0007\u0010\u0084\u0001\u001a\u00020\u000fH\u0010¢\u0006\u0005\b\u0085\u0001\u0010vJ\u001b\u0010\u0086\u0001\u001a\u00020\u00142\b\u0010\u001f\u001a\u0004\u0018\u00010\u000fH\u0014¢\u0006\u0005\b\u0086\u0001\u0010vJ\u001a\u0010\u0087\u0001\u001a\u00020\u00042\u0007\u0010\u0084\u0001\u001a\u00020\u000fH\u0014¢\u0006\u0005\b\u0087\u0001\u0010#J\u001c\u0010\u0088\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\u00142\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0014¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u00020NH\u0016¢\u0006\u0005\b\u008b\u0001\u0010tJ\u0011\u0010\u008c\u0001\u001a\u00020NH\u0007¢\u0006\u0005\b\u008c\u0001\u0010tJ\u0011\u0010\u008d\u0001\u001a\u00020NH\u0010¢\u0006\u0005\b\u008d\u0001\u0010tJ\u0014\u0010\u008e\u0001\u001a\u0004\u0018\u00010\nH\u0000¢\u0006\u0006\b\u008e\u0001\u0010\u008f\u0001J\u0014\u0010\u0090\u0001\u001a\u0004\u0018\u00010\nH\u0084@¢\u0006\u0005\b\u0090\u0001\u00101R\u001e\u0010\u0092\u0001\u001a\u0004\u0018\u00010\u000f*\u0004\u0018\u00010\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0001\u0010:R\u0019\u0010\u0096\u0001\u001a\u0007\u0012\u0002\b\u00030\u0093\u00018F¢\u0006\b\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001R0\u0010\u009c\u0001\u001a\u0005\u0018\u00010\u0081\u00012\n\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0081\u00018@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0098\u0001\u0010\u0099\u0001\"\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0018\u0010U\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009d\u0001\u0010\u009e\u0001R\u0018\u0010\t\u001a\u0004\u0018\u00010\n8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010\u008f\u0001R\u0016\u0010¡\u0001\u001a\u00020\u00048VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b \u0001\u0010/R\u0013\u0010£\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010/R\u0013\u0010¤\u0001\u001a\u00020\u00048F¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010/R\u001c\u0010©\u0001\u001a\u00030¥\u00018F¢\u0006\u000f\u0012\u0005\b¨\u0001\u0010Z\u001a\u0006\b¦\u0001\u0010§\u0001R\u0016\u0010«\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\bª\u0001\u0010/R\u001b\u0010¯\u0001\u001a\t\u0012\u0004\u0012\u00020\u00010¬\u00018F¢\u0006\b\u001a\u0006\b\u00ad\u0001\u0010®\u0001R\u0016\u0010±\u0001\u001a\u00020\u00048TX\u0094\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010/R\u0016\u0010³\u0001\u001a\u00020\u00048PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b²\u0001\u0010/R#\u0010¸\u0001\u001a\u0007\u0012\u0002\b\u00030´\u00018DX\u0084\u0004¢\u0006\u000f\u0012\u0005\b·\u0001\u0010Z\u001a\u0006\bµ\u0001\u0010¶\u0001R\u0015\u0010º\u0001\u001a\u000b\u0012\u0006\u0012\u0004\u0018\u00010\n0¹\u00018\u0002X\u0082\u0004R\u0016\u0010»\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0081\u00010¹\u00018\u0002X\u0082\u0004¨\u0006Á\u0001"}, d2 = {"Lju/j2;", "Lju/d2;", "Lju/w;", "Lju/s2;", "", "active", "<init>", "(Z)V", "Lju/j2$c;", "state", "", "proposedUpdate", "h0", "(Lju/j2$c;Ljava/lang/Object;)Ljava/lang/Object;", "", "", "exceptions", "k0", "(Lju/j2$c;Ljava/util/List;)Ljava/lang/Throwable;", "rootCause", "Loq/i0;", "x", "(Ljava/lang/Throwable;Ljava/util/List;)V", "Lju/y1;", "update", "e1", "(Lju/y1;Ljava/lang/Object;)Z", "e0", "(Lju/y1;Ljava/lang/Object;)V", "Lju/o2;", "list", "cause", "K0", "(Lju/o2;Ljava/lang/Throwable;)V", "X", "(Ljava/lang/Throwable;)Z", "L0", "", "X0", "(Ljava/lang/Object;)I", "Lju/l1;", "R0", "(Lju/l1;)V", "Lju/i2;", "S0", "(Lju/i2;)V", "B0", "()Z", "D0", "(Ltq/e;)Ljava/lang/Object;", "Lru/k;", "select", "ignoredParam", "U0", "(Lru/k;Ljava/lang/Object;)V", ip.a.f96137b, "(Ljava/lang/Object;)Ljava/lang/Object;", "g0", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "E0", "p0", "(Lju/y1;)Lju/o2;", "f1", "(Lju/y1;Ljava/lang/Throwable;)Z", "g1", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "h1", "(Lju/y1;Ljava/lang/Object;)Ljava/lang/Object;", "Lju/v;", "child", "j1", "(Lju/j2$c;Lju/v;Ljava/lang/Object;)Z", "lastChild", "f0", "(Lju/j2$c;Lju/v;Ljava/lang/Object;)V", "Lou/p;", "J0", "(Lou/p;)Lju/v;", "", "Z0", "(Ljava/lang/Object;)Ljava/lang/String;", "B", "N0", "result", "M0", "parent", "y0", "(Lju/d2;)V", "start", "Q0", "()V", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "N", "()Ljava/util/concurrent/CancellationException;", "message", "a1", "(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/util/concurrent/CancellationException;", "Lkotlin/Function1;", "Lkotlinx/coroutines/CompletionHandler;", "handler", "Lju/i1;", "C0", "(Ler/l;)Lju/i1;", "onCancelling", "invokeImmediately", "J", "(ZZLer/l;)Lju/i1;", "node", "z0", "(ZLju/i2;)Lju/i1;", "T0", "V0", "u", "(Ljava/util/concurrent/CancellationException;)V", "Y", "()Ljava/lang/String;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ljava/lang/Throwable;)V", "parentJob", "H0", "(Lju/s2;)V", "c0", ip.a.f96138c, "F", "(Ljava/lang/Object;)Z", "u0", "F0", "G0", "Lju/u;", "d1", "(Lju/w;)Lju/u;", "exception", "x0", "O0", "w0", "P0", "(Ljava/lang/Object;)V", "z", "toString", "c1", "I0", "i0", "()Ljava/lang/Object;", "A", "j0", "exceptionOrNull", "Ltq/i$c;", "getKey", "()Ltq/i$c;", "key", "value", "r0", "()Lju/u;", "W0", "(Lju/u;)V", "parentHandle", "q0", "()Lju/d2;", "s0", "h", "isActive", "r", "isCompleted", "isCancelled", "Lru/e;", "o1", "()Lru/e;", "getOnJoin$annotations", "onJoin", "o0", "onCancelComplete", "Leu/h;", "getChildren", "()Leu/h;", "children", "A0", "isScopedCoroutine", "l0", "handlesException", "Lru/g;", "m0", "()Lru/g;", "getOnAwaitInternal$annotations", "onAwaitInternal", "Liu/e;", "_state", "_parentHandle", "e", "c", "b", "a", "d", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
@oq.a
public class j2 implements d2, w, s2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105709a = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105710b = AtomicReferenceFieldUpdater.newUpdater(j2.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0014¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lju/j2$a;", "T", "Lju/p;", "Ltq/e;", "delegate", "Lju/j2;", "job", "<init>", "(Ltq/e;Lju/j2;)V", "Lju/d2;", "parent", "", "v", "(Lju/d2;)Ljava/lang/Throwable;", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "()Ljava/lang/String;", "j", "Lju/j2;", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a<T> extends p<T> {

        /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
        private final j2 job;

        public a(tq.e<? super T> eVar, j2 j2Var) {
            super(eVar, 1);
            this.job = j2Var;
        }

        @Override // ju.p
        protected String L() {
            return "AwaitContinuation";
        }

        @Override // ju.p
        public Throwable v(d2 parent) {
            Throwable thE;
            Object objS0 = this.job.s0();
            if (!(objS0 instanceof c) || (thE = ((c) objS0).e()) == null) {
                return objS0 instanceof c0 ? ((c0) objS0).cause : parent.N();
            }
            return thE;
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0016\u0010\t\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001c\u001a\u00020\u00198VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lju/j2$b;", "Lju/i2;", "Lju/j2;", "parent", "Lju/j2$c;", "state", "Lju/v;", "child", "", "proposedUpdate", "<init>", "(Lju/j2;Lju/j2$c;Lju/v;Ljava/lang/Object;)V", "", "cause", "Loq/i0;", "x", "(Ljava/lang/Throwable;)V", "e", "Lju/j2;", "f", "Lju/j2$c;", "g", "Lju/v;", "h", "Ljava/lang/Object;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b extends i2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final j2 parent;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final c state;

        /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
        private final v child;

        /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
        private final Object proposedUpdate;

        public b(j2 j2Var, c cVar, v vVar, Object obj) {
            this.parent = j2Var;
            this.state = cVar;
            this.child = vVar;
            this.proposedUpdate = obj;
        }

        @Override // ju.i2
        public boolean w() {
            return false;
        }

        @Override // ju.i2
        public void x(Throwable cause) {
            this.parent.f0(this.state, this.child, this.proposedUpdate);
        }
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003B!\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\b0\fj\b\u0012\u0004\u0012\u00020\b`\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\b¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001b\u0010\u001dR(\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\u001e\u001a\u0004\u0018\u00010\u00018B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R$\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u001e\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b(\u0010)\"\u0004\b*\u0010\u0017R\u0011\u0010,\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b+\u0010%R\u0011\u0010.\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b-\u0010%R\u0014\u00100\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b/\u0010%R\u000b\u00102\u001a\u0002018\u0002X\u0082\u0004R\u0013\u00104\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b038\u0002X\u0082\u0004R\u0013\u00105\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0001038\u0002X\u0082\u0004¨\u00066"}, d2 = {"Lju/j2$c;", "", "Lkotlinx/coroutines/internal/SynchronizedObject;", "Lju/y1;", "Lju/o2;", "list", "", "isCompleting", "", "rootCause", "<init>", "(Lju/o2;ZLjava/lang/Throwable;)V", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "c", "()Ljava/util/ArrayList;", "proposedException", "", "m", "(Ljava/lang/Throwable;)Ljava/util/List;", "exception", "Loq/i0;", "b", "(Ljava/lang/Throwable;)V", "", "toString", "()Ljava/lang/String;", "a", "Lju/o2;", "()Lju/o2;", "value", "d", "()Ljava/lang/Object;", "o", "(Ljava/lang/Object;)V", "exceptionsHolder", "k", "()Z", "n", "(Z)V", "e", "()Ljava/lang/Throwable;", "p", "l", "isSealed", "j", "isCancelling", "h", "isActive", "Liu/a;", "_isCompleting", "Liu/e;", "_rootCause", "_exceptionsHolder", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class c implements y1 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f105716b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f105717c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f105718d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final o2 list;

        public c(o2 o2Var, boolean z15, Throwable th4) {
            this.list = o2Var;
            this._isCompleting$volatile = z15 ? 1 : 0;
            this._rootCause$volatile = th4;
        }

        private final ArrayList<Throwable> c() {
            return new ArrayList<>(4);
        }

        private final Object d() {
            return f105718d.get(this);
        }

        private final void o(Object obj) {
            f105718d.set(this, obj);
        }

        @Override // ju.y1
        /* JADX INFO: renamed from: a, reason: from getter */
        public o2 getList() {
            return this.list;
        }

        public final void b(Throwable exception) {
            Throwable thE = e();
            if (thE == null) {
                p(exception);
                return;
            }
            if (exception == thE) {
                return;
            }
            Object objD = d();
            if (objD == null) {
                o(exception);
                return;
            }
            if (objD instanceof Throwable) {
                if (exception == objD) {
                    return;
                }
                ArrayList<Throwable> arrayListC = c();
                arrayListC.add(objD);
                arrayListC.add(exception);
                o(arrayListC);
                return;
            }
            if (objD instanceof ArrayList) {
                ((ArrayList) objD).add(exception);
                return;
            }
            throw new IllegalStateException(("State is " + objD).toString());
        }

        public final Throwable e() {
            return (Throwable) f105717c.get(this);
        }

        @Override // ju.y1
        /* JADX INFO: renamed from: h */
        public boolean getIsActive() {
            return e() == null;
        }

        public final boolean j() {
            return e() != null;
        }

        public final boolean k() {
            return f105716b.get(this) == 1;
        }

        public final boolean l() {
            return d() == k2.f105738e;
        }

        public final List<Throwable> m(Throwable proposedException) {
            ArrayList<Throwable> arrayListC;
            Object objD = d();
            if (objD == null) {
                arrayListC = c();
            } else if (objD instanceof Throwable) {
                ArrayList<Throwable> arrayListC2 = c();
                arrayListC2.add(objD);
                arrayListC = arrayListC2;
            } else {
                if (!(objD instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + objD).toString());
                }
                arrayListC = (ArrayList) objD;
            }
            Throwable thE = e();
            if (thE != null) {
                arrayListC.add(0, thE);
            }
            if (proposedException != null && !fr.t.c(proposedException, thE)) {
                arrayListC.add(proposedException);
            }
            o(k2.f105738e);
            return arrayListC;
        }

        public final void n(boolean z15) {
            f105716b.set(this, z15 ? 1 : 0);
        }

        public final void p(Throwable th4) {
            f105717c.set(this, th4);
        }

        public String toString() {
            return "Finishing[cancelling=" + j() + ", completing=" + k() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + getList() + ']';
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lju/j2$d;", "Lju/i2;", "Lru/k;", "select", "<init>", "(Lju/j2;Lru/k;)V", "", "cause", "Loq/i0;", "x", "(Ljava/lang/Throwable;)V", "e", "Lru/k;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class d extends i2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ru.k<?> select;

        public d(ru.k<?> kVar) {
            this.select = kVar;
        }

        @Override // ju.i2
        public boolean w() {
            return false;
        }

        @Override // ju.i2
        public void x(Throwable cause) {
            Object objS0 = j2.this.s0();
            if (!(objS0 instanceof c0)) {
                objS0 = k2.h(objS0);
            }
            this.select.h(j2.this, objS0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0013\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0016¢\u0006\u0004\b\t\u0010\nR\u0018\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"Lju/j2$e;", "Lju/i2;", "Lru/k;", "select", "<init>", "(Lju/j2;Lru/k;)V", "", "cause", "Loq/i0;", "x", "(Ljava/lang/Throwable;)V", "e", "Lru/k;", "", "w", "()Z", "onCancelling", "kotlinx-coroutines-core"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class e extends i2 {

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final ru.k<?> select;

        public e(ru.k<?> kVar) {
            this.select = kVar;
        }

        @Override // ju.i2
        public boolean w() {
            return false;
        }

        @Override // ju.i2
        public void x(Throwable cause) {
            this.select.h(j2.this, oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Leu/j;", "Lju/d2;", "Loq/i0;", "<anonymous>", "(Leu/j;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.i implements er.p<eu.j<? super d2>, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f105724c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f105725d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f105726e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f105727f;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x0064  */
        /* JADX WARN: Code duplicated, block: B:24:0x0068  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0066 -> B:27:0x007c). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0079 -> B:27:0x007c). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r5.f105726e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L2a
                if (r1 == r3) goto L26
                if (r1 != r2) goto L1e
                java.lang.Object r1 = r5.f105725d
                ou.p r1 = (ou.p) r1
                java.lang.Object r3 = r5.f105724c
                ou.o r3 = (ou.o) r3
                java.lang.Object r4 = r5.f105727f
                eu.j r4 = (eu.j) r4
                oq.u.b(r6)
                goto L7c
            L1e:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L26:
                oq.u.b(r6)
                goto L81
            L2a:
                oq.u.b(r6)
                java.lang.Object r6 = r5.f105727f
                eu.j r6 = (eu.j) r6
                ju.j2 r1 = ju.j2.this
                java.lang.Object r1 = r1.s0()
                boolean r4 = r1 instanceof ju.v
                if (r4 == 0) goto L48
                ju.v r1 = (ju.v) r1
                ju.w r1 = r1.childJob
                r5.f105726e = r3
                java.lang.Object r6 = r6.a(r1, r5)
                if (r6 != r0) goto L81
                goto L7b
            L48:
                boolean r3 = r1 instanceof ju.y1
                if (r3 == 0) goto L81
                ju.y1 r1 = (ju.y1) r1
                ju.o2 r1 = r1.getList()
                if (r1 == 0) goto L81
                java.lang.Object r3 = r1.l()
                ou.p r3 = (ou.p) r3
                r4 = r3
                r3 = r1
                r1 = r4
                r4 = r6
            L5e:
                boolean r6 = fr.t.c(r1, r3)
                if (r6 != 0) goto L81
                boolean r6 = r1 instanceof ju.v
                if (r6 == 0) goto L7c
                r6 = r1
                ju.v r6 = (ju.v) r6
                ju.w r6 = r6.childJob
                r5.f105727f = r4
                r5.f105724c = r3
                r5.f105725d = r1
                r5.f105726e = r2
                java.lang.Object r6 = r4.a(r6, r5)
                if (r6 != r0) goto L7c
            L7b:
                return r0
            L7c:
                ou.p r1 = r1.m()
                goto L5e
            L81:
                oq.i0 r6 = oq.i0.f148189a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ju.j2.f.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: L, reason: merged with bridge method [inline-methods] */
        public final Object B(eu.j<? super d2> jVar, tq.e<? super oq.i0> eVar) {
            return ((f) v(jVar, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            f fVar = j2.this.new f(eVar);
            fVar.f105727f = obj;
            return fVar;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class g extends fr.q implements er.q<j2, ru.k<?>, Object, oq.i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final g f105729j = new g();

        g() {
            super(3, j2.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void E(j2 j2Var, ru.k<?> kVar, Object obj) {
            j2Var.N0(kVar, obj);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ oq.i0 w(j2 j2Var, ru.k<?> kVar, Object obj) {
            E(j2Var, kVar, obj);
            return oq.i0.f148189a;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class h extends fr.q implements er.q<j2, Object, Object, Object> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final h f105730j = new h();

        h() {
            super(3, j2.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // er.q
        /* JADX INFO: renamed from: E, reason: merged with bridge method [inline-methods] */
        public final Object w(j2 j2Var, Object obj, Object obj2) {
            return j2Var.M0(obj, obj2);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    /* synthetic */ class i extends fr.q implements er.q<j2, ru.k<?>, Object, oq.i0> {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final i f105731j = new i();

        i() {
            super(3, j2.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void E(j2 j2Var, ru.k<?> kVar, Object obj) {
            j2Var.U0(kVar, obj);
        }

        @Override // er.q
        public /* bridge */ /* synthetic */ oq.i0 w(j2 j2Var, ru.k<?> kVar, Object obj) {
            E(j2Var, kVar, obj);
            return oq.i0.f148189a;
        }
    }

    public j2(boolean z15) {
        this._state$volatile = z15 ? k2.f105740g : k2.f105739f;
    }

    private final Object B(tq.e<Object> eVar) {
        a aVar = new a(uq.b.c(eVar), this);
        aVar.D();
        r.a(aVar, h2.m(this, false, new t2(aVar), 1, null));
        Object objX = aVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX;
    }

    private final boolean B0() {
        Object objS0;
        do {
            objS0 = s0();
            if (!(objS0 instanceof y1)) {
                return false;
            }
        } while (X0(objS0) < 0);
        return true;
    }

    private final Object D0(tq.e<? super oq.i0> eVar) {
        p pVar = new p(uq.b.c(eVar), 1);
        pVar.D();
        r.a(pVar, h2.m(this, false, new u2(pVar), 1, null));
        Object objX = pVar.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : oq.i0.f148189a;
    }

    private final Object E0(Object cause) throws Throwable {
        Throwable thG0 = null;
        while (true) {
            Object objS0 = s0();
            if (objS0 instanceof c) {
                synchronized (objS0) {
                    if (((c) objS0).l()) {
                        return k2.f105737d;
                    }
                    boolean zJ = ((c) objS0).j();
                    if (cause != null || !zJ) {
                        if (thG0 == null) {
                            thG0 = g0(cause);
                        }
                        ((c) objS0).b(thG0);
                    }
                    Throwable thE = zJ ? null : ((c) objS0).e();
                    if (thE != null) {
                        K0(((c) objS0).getList(), thE);
                    }
                    return k2.f105734a;
                }
            }
            if (!(objS0 instanceof y1)) {
                return k2.f105737d;
            }
            if (thG0 == null) {
                thG0 = g0(cause);
            }
            y1 y1Var = (y1) objS0;
            if (!y1Var.getIsActive()) {
                Object objG1 = g1(objS0, new c0(thG0, false, 2, null));
                if (objG1 == k2.f105734a) {
                    throw new IllegalStateException(("Cannot happen in " + objS0).toString());
                }
                if (objG1 != k2.f105736c) {
                    return objG1;
                }
            } else if (f1(y1Var, thG0)) {
                return k2.f105734a;
            }
        }
    }

    private final v J0(ou.p pVar) {
        while (pVar.r()) {
            pVar = pVar.n();
        }
        while (true) {
            pVar = pVar.m();
            if (!pVar.r()) {
                if (pVar instanceof v) {
                    return (v) pVar;
                }
                if (pVar instanceof o2) {
                    return null;
                }
            }
        }
    }

    private final void K0(o2 list, Throwable cause) throws Throwable {
        O0(cause);
        list.f(4);
        d0 d0Var = null;
        for (ou.p pVarM = (ou.p) list.l(); !fr.t.c(pVarM, list); pVarM = pVarM.m()) {
            if ((pVarM instanceof i2) && ((i2) pVarM).w()) {
                try {
                    ((i2) pVarM).x(cause);
                } catch (Throwable th4) {
                    if (d0Var != null) {
                        oq.c.a(d0Var, th4);
                    } else {
                        d0Var = new d0("Exception in completion handler " + pVarM + " for " + this, th4);
                        oq.i0 i0Var = oq.i0.f148189a;
                    }
                }
            }
        }
        if (d0Var != null) {
            x0(d0Var);
        }
        X(cause);
    }

    private final void L0(o2 o2Var, Throwable th4) throws Throwable {
        o2Var.f(1);
        d0 d0Var = null;
        for (ou.p pVarM = (ou.p) o2Var.l(); !fr.t.c(pVarM, o2Var); pVarM = pVarM.m()) {
            if (pVarM instanceof i2) {
                try {
                    ((i2) pVarM).x(th4);
                } catch (Throwable th5) {
                    if (d0Var != null) {
                        oq.c.a(d0Var, th5);
                    } else {
                        d0Var = new d0("Exception in completion handler " + pVarM + " for " + this, th5);
                        oq.i0 i0Var = oq.i0.f148189a;
                    }
                }
            }
        }
        if (d0Var != null) {
            x0(d0Var);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object M0(Object ignoredParam, Object result) throws Throwable {
        if (result instanceof c0) {
            throw ((c0) result).cause;
        }
        return result;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N0(ru.k<?> select, Object ignoredParam) {
        Object objS0;
        do {
            objS0 = s0();
            if (!(objS0 instanceof y1)) {
                if (!(objS0 instanceof c0)) {
                    objS0 = k2.h(objS0);
                }
                select.f(objS0);
                return;
            }
        } while (X0(objS0) < 0);
        select.b(h2.m(this, false, new d(select), 1, null));
    }

    private final void R0(l1 state) {
        o2 o2Var = new o2();
        Object x1Var = o2Var;
        if (!state.getIsActive()) {
            x1Var = new x1(o2Var);
        }
        androidx.concurrent.futures.b.a(f105709a, this, state, x1Var);
    }

    private final Object S(Object cause) {
        Object objG1;
        do {
            Object objS0 = s0();
            if (!(objS0 instanceof y1) || ((objS0 instanceof c) && ((c) objS0).k())) {
                return k2.f105734a;
            }
            objG1 = g1(objS0, new c0(g0(cause), false, 2, null));
        } while (objG1 == k2.f105736c);
        return objG1;
    }

    private final void S0(i2 state) {
        state.e(new o2());
        androidx.concurrent.futures.b.a(f105709a, this, state, state.m());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(ru.k<?> select, Object ignoredParam) {
        if (B0()) {
            select.b(h2.m(this, false, new e(select), 1, null));
        } else {
            select.f(oq.i0.f148189a);
        }
    }

    private final boolean X(Throwable cause) {
        if (A0()) {
            return true;
        }
        boolean z15 = cause instanceof CancellationException;
        u uVarR0 = r0();
        if (uVarR0 == null || uVarR0 == q2.f105774a) {
            return z15;
        }
        return uVarR0.b(cause) || z15;
    }

    private final int X0(Object state) {
        if (state instanceof l1) {
            if (((l1) state).getIsActive()) {
                return 0;
            }
            if (!androidx.concurrent.futures.b.a(f105709a, this, state, k2.f105740g)) {
                return -1;
            }
            Q0();
            return 1;
        }
        if (!(state instanceof x1)) {
            return 0;
        }
        if (!androidx.concurrent.futures.b.a(f105709a, this, state, ((x1) state).getList())) {
            return -1;
        }
        Q0();
        return 1;
    }

    private final String Z0(Object state) {
        if (!(state instanceof c)) {
            if (state instanceof y1) {
                return ((y1) state).getIsActive() ? "Active" : "New";
            }
            return state instanceof c0 ? "Cancelled" : "Completed";
        }
        c cVar = (c) state;
        if (cVar.j()) {
            return "Cancelling";
        }
        return cVar.k() ? "Completing" : "Active";
    }

    public static /* synthetic */ CancellationException b1(j2 j2Var, Throwable th4, String str, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i15 & 1) != 0) {
            str = null;
        }
        return j2Var.a1(th4, str);
    }

    private final void e0(y1 state, Object update) throws Throwable {
        u uVarR0 = r0();
        if (uVarR0 != null) {
            uVarR0.j();
            W0(q2.f105774a);
        }
        c0 c0Var = update instanceof c0 ? (c0) update : null;
        Throwable th4 = c0Var != null ? c0Var.cause : null;
        if (!(state instanceof i2)) {
            o2 list = state.getList();
            if (list != null) {
                L0(list, th4);
                return;
            }
            return;
        }
        try {
            ((i2) state).x(th4);
        } catch (Throwable th5) {
            x0(new d0("Exception in completion handler " + state + " for " + this, th5));
        }
    }

    private final boolean e1(y1 state, Object update) throws Throwable {
        if (!androidx.concurrent.futures.b.a(f105709a, this, state, k2.g(update))) {
            return false;
        }
        O0(null);
        P0(update);
        e0(state, update);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void f0(c state, v lastChild, Object proposedUpdate) {
        v vVarJ0 = J0(lastChild);
        if (vVarJ0 == null || !j1(state, vVarJ0, proposedUpdate)) {
            state.getList().f(2);
            v vVarJ1 = J0(lastChild);
            if (vVarJ1 == null || !j1(state, vVarJ1, proposedUpdate)) {
                z(h0(state, proposedUpdate));
            }
        }
    }

    private final boolean f1(y1 state, Throwable rootCause) throws Throwable {
        o2 o2VarP0 = p0(state);
        if (o2VarP0 == null) {
            return false;
        }
        if (!androidx.concurrent.futures.b.a(f105709a, this, state, new c(o2VarP0, false, rootCause))) {
            return false;
        }
        K0(o2VarP0, rootCause);
        return true;
    }

    private final Throwable g0(Object cause) {
        if (!(cause == null ? true : cause instanceof Throwable)) {
            return ((s2) cause).u0();
        }
        Throwable th4 = (Throwable) cause;
        return th4 == null ? new e2(Y(), null, this) : th4;
    }

    private final Object g1(Object state, Object proposedUpdate) {
        if (!(state instanceof y1)) {
            return k2.f105734a;
        }
        if ((!(state instanceof l1) && !(state instanceof i2)) || (state instanceof v) || (proposedUpdate instanceof c0)) {
            return h1((y1) state, proposedUpdate);
        }
        return e1((y1) state, proposedUpdate) ? proposedUpdate : k2.f105736c;
    }

    private final Object h0(c state, Object proposedUpdate) throws Throwable {
        boolean zJ;
        Throwable thK0;
        c0 c0Var = proposedUpdate instanceof c0 ? (c0) proposedUpdate : null;
        Throwable th4 = c0Var != null ? c0Var.cause : null;
        synchronized (state) {
            zJ = state.j();
            List<Throwable> listM = state.m(th4);
            thK0 = k0(state, listM);
            if (thK0 != null) {
                x(thK0, listM);
            }
        }
        if (thK0 != null && thK0 != th4) {
            proposedUpdate = new c0(thK0, false, 2, null);
        }
        if (thK0 != null && (X(thK0) || w0(thK0))) {
            ((c0) proposedUpdate).c();
        }
        if (!zJ) {
            O0(thK0);
        }
        P0(proposedUpdate);
        androidx.concurrent.futures.b.a(f105709a, this, state, k2.g(proposedUpdate));
        e0(state, proposedUpdate);
        return proposedUpdate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    private final Object h1(y1 state, Object proposedUpdate) throws Throwable {
        o2 o2VarP0 = p0(state);
        if (o2VarP0 == null) {
            return k2.f105736c;
        }
        c cVar = state instanceof c ? (c) state : null;
        if (cVar == null) {
            cVar = new c(o2VarP0, false, null);
        }
        fr.p0 p0Var = new fr.p0();
        synchronized (cVar) {
            if (cVar.k()) {
                return k2.f105734a;
            }
            cVar.n(true);
            if (cVar != state && !androidx.concurrent.futures.b.a(f105709a, this, state, cVar)) {
                return k2.f105736c;
            }
            boolean zJ = cVar.j();
            c0 c0Var = proposedUpdate instanceof c0 ? (c0) proposedUpdate : null;
            if (c0Var != null) {
                cVar.b(c0Var.cause);
            }
            ?? E = zJ ? 0 : cVar.e();
            p0Var.f66410a = E;
            oq.i0 i0Var = oq.i0.f148189a;
            if (E != 0) {
                K0(o2VarP0, E);
            }
            v vVarJ0 = J0(o2VarP0);
            if (vVarJ0 != null && j1(cVar, vVarJ0, proposedUpdate)) {
                return k2.f105735b;
            }
            o2VarP0.f(2);
            v vVarJ1 = J0(o2VarP0);
            return (vVarJ1 == null || !j1(cVar, vVarJ1, proposedUpdate)) ? h0(cVar, proposedUpdate) : k2.f105735b;
        }
    }

    private final Throwable j0(Object obj) {
        c0 c0Var = obj instanceof c0 ? (c0) obj : null;
        if (c0Var != null) {
            return c0Var.cause;
        }
        return null;
    }

    private final boolean j1(c state, v child, Object proposedUpdate) {
        while (g2.l(child.childJob, false, new b(this, state, child, proposedUpdate)) == q2.f105774a) {
            child = J0(child);
            if (child == null) {
                return false;
            }
        }
        return true;
    }

    private final Throwable k0(c state, List<? extends Throwable> exceptions) {
        Object next;
        Object obj = null;
        if (exceptions.isEmpty()) {
            if (state.j()) {
                return new e2(Y(), null, this);
            }
            return null;
        }
        List<? extends Throwable> list = exceptions;
        Iterator<T> it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (((Throwable) next) instanceof CancellationException);
        Throwable th4 = (Throwable) next;
        if (th4 != null) {
            return th4;
        }
        Throwable th5 = exceptions.get(0);
        if (th5 instanceof e3) {
            for (Object obj2 : list) {
                Throwable th6 = (Throwable) obj2;
                if (th6 != th5 && (th6 instanceof e3)) {
                    obj = obj2;
                    break;
                }
            }
            Throwable th7 = (Throwable) obj;
            if (th7 != null) {
                return th7;
            }
        }
        return th5;
    }

    private final o2 p0(y1 state) {
        o2 list = state.getList();
        if (list != null) {
            return list;
        }
        if (state instanceof l1) {
            return new o2();
        }
        if (state instanceof i2) {
            S0((i2) state);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + state).toString());
    }

    private final void x(Throwable rootCause, List<? extends Throwable> exceptions) {
        if (exceptions.size() <= 1) {
            return;
        }
        Set setNewSetFromMap = Collections.newSetFromMap(new IdentityHashMap(exceptions.size()));
        for (Throwable th4 : exceptions) {
            if (th4 != rootCause && th4 != rootCause && !(th4 instanceof CancellationException) && setNewSetFromMap.add(th4)) {
                oq.c.a(rootCause, th4);
            }
        }
    }

    protected final Object A(tq.e<Object> eVar) throws Throwable {
        Object objS0;
        do {
            objS0 = s0();
            if (!(objS0 instanceof y1)) {
                if (objS0 instanceof c0) {
                    throw ((c0) objS0).cause;
                }
                return k2.h(objS0);
            }
        } while (X0(objS0) < 0);
        return B(eVar);
    }

    protected boolean A0() {
        return false;
    }

    @Override // ju.d2
    public final i1 C0(er.l<? super Throwable, oq.i0> handler) {
        return z0(true, new c2(handler));
    }

    public final boolean D(Throwable cause) {
        return F(cause);
    }

    @Override // tq.i
    public tq.i D1(tq.i.c<?> cVar) {
        return d2.a.d(this, cVar);
    }

    public final boolean F(Object cause) throws Throwable {
        Object objE0 = k2.f105734a;
        if (o0() && (objE0 = S(cause)) == k2.f105735b) {
            return true;
        }
        if (objE0 == k2.f105734a) {
            objE0 = E0(cause);
        }
        if (objE0 == k2.f105734a || objE0 == k2.f105735b) {
            return true;
        }
        if (objE0 == k2.f105737d) {
            return false;
        }
        z(objE0);
        return true;
    }

    public final boolean F0(Object proposedUpdate) {
        Object objG1;
        do {
            objG1 = g1(s0(), proposedUpdate);
            if (objG1 == k2.f105734a) {
                return false;
            }
            if (objG1 == k2.f105735b) {
                return true;
            }
        } while (objG1 == k2.f105736c);
        z(objG1);
        return true;
    }

    public final Object G0(Object proposedUpdate) {
        Object objG1;
        do {
            objG1 = g1(s0(), proposedUpdate);
            if (objG1 == k2.f105734a) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + proposedUpdate, j0(proposedUpdate));
            }
        } while (objG1 == k2.f105736c);
        return objG1;
    }

    @Override // ju.w
    public final void H0(s2 parentJob) throws Throwable {
        F(parentJob);
    }

    public String I0() {
        return t0.a(this);
    }

    @Override // ju.d2
    public final i1 J(boolean onCancelling, boolean invokeImmediately, er.l<? super Throwable, oq.i0> handler) {
        return z0(invokeImmediately, onCancelling ? new b2(handler) : new c2(handler));
    }

    @Override // ju.d2
    public final CancellationException N() {
        Object objS0 = s0();
        if (!(objS0 instanceof c)) {
            if (objS0 instanceof y1) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (objS0 instanceof c0) {
                return b1(this, ((c0) objS0).cause, null, 1, null);
            }
            return new e2(t0.a(this) + " has completed normally", null, this);
        }
        Throwable thE = ((c) objS0).e();
        if (thE != null) {
            CancellationException cancellationExceptionA1 = a1(thE, t0.a(this) + " is cancelling");
            if (cancellationExceptionA1 != null) {
                return cancellationExceptionA1;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    protected void O0(Throwable cause) {
    }

    public void P(Throwable cause) throws Throwable {
        F(cause);
    }

    protected void P0(Object state) {
    }

    protected void Q0() {
    }

    @Override // ju.d2
    public final Object T0(tq.e<? super oq.i0> eVar) {
        if (B0()) {
            Object objD0 = D0(eVar);
            return objD0 == uq.b.e() ? objD0 : oq.i0.f148189a;
        }
        g2.j(eVar.getContext());
        return oq.i0.f148189a;
    }

    public final void V0(i2 node) {
        Object objS0;
        do {
            objS0 = s0();
            if (!(objS0 instanceof i2)) {
                if (!(objS0 instanceof y1) || ((y1) objS0).getList() == null) {
                    return;
                }
                node.s();
                return;
            }
            if (objS0 != node) {
                return;
            }
        } while (!androidx.concurrent.futures.b.a(f105709a, this, objS0, k2.f105740g));
    }

    public final void W0(u uVar) {
        f105710b.set(this, uVar);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public String Y() {
        return "Job was cancelled";
    }

    protected final CancellationException a1(Throwable th4, String str) {
        CancellationException e2Var = th4 instanceof CancellationException ? (CancellationException) th4 : null;
        if (e2Var == null) {
            if (str == null) {
                str = Y();
            }
            e2Var = new e2(str, th4, this);
        }
        return e2Var;
    }

    public boolean c0(Throwable cause) {
        if (cause instanceof CancellationException) {
            return true;
        }
        return F(cause) && getHandlesException();
    }

    public final String c1() {
        return I0() + '{' + Z0(s0()) + '}';
    }

    @Override // ju.d2
    public final u d1(w child) {
        v vVar = new v(child);
        vVar.y(this);
        while (true) {
            Object objS0 = s0();
            if (objS0 instanceof l1) {
                l1 l1Var = (l1) objS0;
                if (!l1Var.getIsActive()) {
                    R0(l1Var);
                } else if (androidx.concurrent.futures.b.a(f105709a, this, objS0, vVar)) {
                    return vVar;
                }
            } else {
                Throwable thE = null;
                if (!(objS0 instanceof y1)) {
                    Object objS1 = s0();
                    c0 c0Var = objS1 instanceof c0 ? (c0) objS1 : null;
                    vVar.x(c0Var != null ? c0Var.cause : null);
                    return q2.f105774a;
                }
                o2 list = ((y1) objS0).getList();
                if (list != null) {
                    if (!list.c(vVar, 7)) {
                        boolean zC = list.c(vVar, 3);
                        Object objS2 = s0();
                        if (objS2 instanceof c) {
                            thE = ((c) objS2).e();
                        } else {
                            c0 c0Var2 = objS2 instanceof c0 ? (c0) objS2 : null;
                            if (c0Var2 != null) {
                                thE = c0Var2.cause;
                            }
                        }
                        vVar.x(thE);
                        if (!zC) {
                            return q2.f105774a;
                        }
                    }
                    return vVar;
                }
                S0((i2) objS0);
            }
        }
    }

    @Override // ju.d2
    public final eu.h<d2> getChildren() {
        return eu.k.b(new f(null));
    }

    @Override // tq.i.b
    public final tq.i.c<?> getKey() {
        return d2.INSTANCE;
    }

    @Override // ju.d2
    public boolean h() {
        Object objS0 = s0();
        return (objS0 instanceof y1) && ((y1) objS0).getIsActive();
    }

    public final Object i0() throws Throwable {
        Object objS0 = s0();
        if (objS0 instanceof y1) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (objS0 instanceof c0) {
            throw ((c0) objS0).cause;
        }
        return k2.h(objS0);
    }

    @Override // ju.d2
    public final boolean isCancelled() {
        Object objS0 = s0();
        if (objS0 instanceof c0) {
            return true;
        }
        return (objS0 instanceof c) && ((c) objS0).j();
    }

    /* JADX INFO: renamed from: l0 */
    public boolean getHandlesException() {
        return true;
    }

    @Override // tq.i.b, tq.i
    public <E extends tq.i.b> E m(tq.i.c<E> cVar) {
        return (E) d2.a.c(this, cVar);
    }

    protected final ru.g<?> m0() {
        return new ru.h(this, (er.q) fr.w0.g(g.f105729j, 3), (er.q) fr.w0.g(h.f105730j, 3), null, 8, null);
    }

    @Override // tq.i
    public tq.i n0(tq.i iVar) {
        return d2.a.e(this, iVar);
    }

    public boolean o0() {
        return false;
    }

    @Override // ju.d2
    public final ru.e o1() {
        return new ru.f(this, (er.q) fr.w0.g(i.f105731j, 3), null, 4, null);
    }

    public d2 q0() {
        u uVarR0 = r0();
        if (uVarR0 != null) {
            return uVarR0.getParent();
        }
        return null;
    }

    @Override // ju.d2
    public final boolean r() {
        return !(s0() instanceof y1);
    }

    public final u r0() {
        return (u) f105710b.get(this);
    }

    public final Object s0() {
        return f105709a.get(this);
    }

    @Override // tq.i
    public <R> R s1(R r15, er.p<? super R, ? super tq.i.b, ? extends R> pVar) {
        return (R) d2.a.b(this, r15, pVar);
    }

    @Override // ju.d2
    public final boolean start() {
        int iX0;
        do {
            iX0 = X0(s0());
            if (iX0 == 0) {
                return false;
            }
        } while (iX0 != 1);
        return true;
    }

    public String toString() {
        return c1() + '@' + t0.b(this);
    }

    @Override // ju.d2
    public void u(CancellationException cause) throws Throwable {
        if (cause == null) {
            cause = new e2(Y(), null, this);
        }
        P(cause);
    }

    @Override // ju.s2
    public CancellationException u0() {
        Throwable thE;
        Object objS0 = s0();
        if (objS0 instanceof c) {
            thE = ((c) objS0).e();
        } else if (objS0 instanceof c0) {
            thE = ((c0) objS0).cause;
        } else {
            if (objS0 instanceof y1) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + objS0).toString());
            }
            thE = null;
        }
        CancellationException cancellationException = thE instanceof CancellationException ? (CancellationException) thE : null;
        if (cancellationException != null) {
            return cancellationException;
        }
        return new e2("Parent job is " + Z0(objS0), thE, this);
    }

    protected boolean w0(Throwable exception) {
        return false;
    }

    public void x0(Throwable exception) throws Throwable {
        throw exception;
    }

    protected final void y0(d2 parent) {
        if (parent == null) {
            W0(q2.f105774a);
            return;
        }
        parent.start();
        u uVarD1 = parent.d1(this);
        W0(uVarD1);
        if (r()) {
            uVarD1.j();
            W0(q2.f105774a);
        }
    }

    protected void z(Object state) {
    }

    public final i1 z0(boolean invokeImmediately, i2 node) {
        boolean z15;
        boolean zC;
        node.y(this);
        while (true) {
            Object objS0 = s0();
            z15 = true;
            if (!(objS0 instanceof l1)) {
                if (!(objS0 instanceof y1)) {
                    z15 = false;
                    break;
                }
                y1 y1Var = (y1) objS0;
                o2 list = y1Var.getList();
                if (list == null) {
                    S0((i2) objS0);
                } else {
                    if (node.w()) {
                        c cVar = y1Var instanceof c ? (c) y1Var : null;
                        Throwable thE = cVar != null ? cVar.e() : null;
                        if (thE != null) {
                            if (invokeImmediately) {
                                node.x(thE);
                            }
                            return q2.f105774a;
                        }
                        zC = list.c(node, 5);
                    } else {
                        zC = list.c(node, 1);
                    }
                    if (zC) {
                        break;
                    }
                }
            } else {
                l1 l1Var = (l1) objS0;
                if (!l1Var.getIsActive()) {
                    R0(l1Var);
                } else if (androidx.concurrent.futures.b.a(f105709a, this, objS0, node)) {
                    break;
                }
            }
        }
        if (z15) {
            return node;
        }
        if (invokeImmediately) {
            Object objS1 = s0();
            c0 c0Var = objS1 instanceof c0 ? (c0) objS1 : null;
            node.x(c0Var != null ? c0Var.cause : null);
        }
        return q2.f105774a;
    }
}
