package p076m2;

import c3.h;
import c3.l;
import c3.v0;
import c3.y0;
import c3.z0;
import e3.p;
import er.q;
import fr.k;
import ip.a;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReference;
import ju.a0;
import ju.d2;
import ju.g2;
import ju.n;
import ju.p0;
import ju.r1;
import mu.b0;
import mu.r0;
import oq.i0;
import oq.r;
import oq.t;
import oq.u;
import oq.y;
import p071kotlin.Metadata;
import r0.a1;
import r0.b1;
import r0.f1;
import r0.g1;
import r0.h1;
import r0.i1;
import r0.q0;
import r0.t0;
import r0.u0;
import tq.i;
import y2.c0;
import y2.v;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Ø\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010!\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 ß\u00012\u00020\u0001:\u0004}fRLB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J-\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00150\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001e\u0010\u000bJ\u0017\u0010 \u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\"\u0010!J\u0017\u0010#\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b#\u0010!J\u0017\u0010$\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b$\u0010!J\u0017\u0010%\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010!J\u0010\u0010&\u001a\u00020\u0007H\u0082@¢\u0006\u0004\b&\u0010'J:\u0010.\u001a\u00020\u00072(\u0010-\u001a$\b\u0001\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020*\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070+\u0012\u0006\u0012\u0004\u0018\u00010,0(H\u0082@¢\u0006\u0004\b.\u0010/J\u0017\u00100\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b0\u0010!J)\u00103\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u001f\u001a\u00020\u00152\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000101H\u0002¢\u0006\u0004\b3\u00104J3\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\u001a2\f\u00106\u001a\b\u0012\u0004\u0012\u0002050\u001a2\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000101H\u0002¢\u0006\u0004\b7\u00108J\u000f\u00109\u001a\u00020\u0007H\u0002¢\u0006\u0004\b9\u0010\u000bJ#\u0010;\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070:2\u0006\u0010\u001f\u001a\u00020\u0015H\u0002¢\u0006\u0004\b;\u0010<J3\u0010=\u001a\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00070:2\u0006\u0010\u001f\u001a\u00020\u00152\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020,\u0018\u000101H\u0002¢\u0006\u0004\b=\u0010>J\u0017\u0010A\u001a\u00020\u00072\u0006\u0010@\u001a\u00020?H\u0002¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bC\u0010'J\r\u0010D\u001a\u00020\u0007¢\u0006\u0004\bD\u0010\u000bJ\u0010\u0010E\u001a\u00020\u0007H\u0086@¢\u0006\u0004\bE\u0010'J\u001d\u0010I\u001a\u00020H2\f\u0010G\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0016¢\u0006\u0004\bI\u0010JJ%\u0010L\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00152\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0011¢\u0006\u0004\bL\u0010MJ3\u0010R\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010O\u001a\u00020N2\f\u0010K\u001a\b\u0012\u0004\u0012\u00020\u00070FH\u0011¢\u0006\u0004\bR\u0010SJ3\u0010U\u001a\b\u0012\u0004\u0012\u00020Q0P2\u0006\u0010\u001f\u001a\u00020\u00152\u0006\u0010O\u001a\u00020N2\f\u0010T\u001a\b\u0012\u0004\u0012\u00020Q0PH\u0010¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020\u00072\u0006\u0010W\u001a\u00020QH\u0010¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010\u000bJ\r\u0010[\u001a\u00020\u0007¢\u0006\u0004\b[\u0010\u000bJ\u001d\u0010_\u001a\u00020\u00072\f\u0010^\u001a\b\u0012\u0004\u0012\u00020]0\\H\u0010¢\u0006\u0004\b_\u0010`J\u0017\u0010a\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\ba\u0010!J\u0017\u0010b\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\bb\u0010!J\u0017\u0010d\u001a\u00020\u00072\u0006\u0010c\u001a\u000205H\u0010¢\u0006\u0004\bd\u0010eJ\u0017\u0010f\u001a\u00020\u00072\u0006\u0010c\u001a\u000205H\u0010¢\u0006\u0004\bf\u0010eJ+\u0010k\u001a\u00020\u00072\u0006\u0010c\u001a\u0002052\u0006\u0010h\u001a\u00020g2\n\u0010j\u001a\u0006\u0012\u0002\b\u00030iH\u0010¢\u0006\u0004\bk\u0010lJ\u0017\u0010m\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u0015H\u0010¢\u0006\u0004\bm\u0010!J\u0019\u0010n\u001a\u0004\u0018\u00010g2\u0006\u0010c\u001a\u000205H\u0010¢\u0006\u0004\bn\u0010oR$\u0010u\u001a\u00020p2\u0006\u0010q\u001a\u00020p8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bL\u0010r\u001a\u0004\bs\u0010tR\u0014\u0010x\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010wR\u0014\u0010{\u001a\u00020y8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010zR\u0018\u0010\u007f\u001a\u00060,j\u0002`|8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0014\u0010\u0080\u0001R\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u001e\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R!\u0010\u008a\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u0087\u0001R\u001f\u0010\u008d\u0001\u001a\b\u0012\u0004\u0012\u00020,018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001e\u0010\u0091\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u0090\u0001R\u001e\u0010\u0093\u0001\u001a\t\u0012\u0004\u0012\u00020\u00150\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0087\u0001R\u001e\u0010\u0095\u0001\u001a\t\u0012\u0004\u0012\u0002050\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0094\u0001\u0010\u0087\u0001R-\u0010\u009a\u0001\u001a\u0018\u0012\r\u0012\u000b\u0012\u0006\u0012\u0004\u0018\u00010,0\u0097\u0001\u0012\u0004\u0012\u0002050\u0096\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0017\u0010\u009d\u0001\u001a\u00030\u009b\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bd\u0010\u009c\u0001R#\u0010\u009f\u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020g0\u009e\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bb\u0010\u0099\u0001R#\u0010 \u0001\u001a\u000f\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u0002050\u0096\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bk\u0010\u0099\u0001R!\u0010¡\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0085\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bn\u0010\u0087\u0001R \u0010¢\u0001\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u0001018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bU\u0010\u008c\u0001R \u0010¤\u0001\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010£\u0001R\u001a\u0010¨\u0001\u001a\u00030¥\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0001\u0010§\u0001R\u0018\u0010ª\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010©\u0001R\"\u0010®\u0001\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010¬\u00010«\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bm\u0010\u00ad\u0001R\u0018\u0010¯\u0001\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bI\u0010©\u0001R\u001f\u0010²\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b±\u0001\u0010\u00ad\u0001R&\u0010¶\u0001\u001a\u0011\u0012\f\u0012\n\u0012\u0004\u0012\u00020Q\u0018\u0001010³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0017\u0010¹\u0001\u001a\u00030·\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\ba\u0010¸\u0001R\u001e\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b\u0092\u0001\u0010¼\u0001R*\u0010Â\u0001\u001a\f\u0012\u0005\u0012\u00030¾\u0001\u0018\u00010½\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u000f\n\u0006\b¿\u0001\u0010À\u0001\u0012\u0005\bÁ\u0001\u0010\u000bR\u001c\u0010Æ\u0001\u001a\u00070Ã\u0001R\u00020\u00008\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÄ\u0001\u0010Å\u0001R\u0016\u0010È\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010\u000eR\u0016\u0010Ê\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010\u000eR\u0016\u0010Ì\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bË\u0001\u0010\u000eR\u0016\u0010Î\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÍ\u0001\u0010\u000eR\u0016\u0010Ð\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÏ\u0001\u0010\u000eR\u0016\u0010Ò\u0001\u001a\u00020\f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÑ\u0001\u0010\u000eR\u001c\u0010Ö\u0001\u001a\n\u0012\u0005\u0012\u00030°\u00010Ó\u00018F¢\u0006\b\u001a\u0006\bÔ\u0001\u0010Õ\u0001R\u001b\u0010Ø\u0001\u001a\u00070pj\u0003`×\u00018PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0089\u0001\u0010tR\u0015\u0010Ù\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u000eR\u0016\u0010Ú\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010\u000eR\u0016\u0010Û\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010\u000eR\u0016\u0010Ü\u0001\u001a\u00020\f8PX\u0090\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010\u000eR\u0019\u0010\u001f\u001a\u0005\u0018\u00010Ý\u00018PX\u0090\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010Þ\u0001¨\u0006à\u0001"}, d2 = {"Lm2/p4;", "Lm2/v;", "Ltq/i;", "effectCoroutineContext", "<init>", "(Ltq/i;)V", "Lju/n;", "Loq/i0;", "p0", "()Lju/n;", "F0", "()V", "", "R0", "()Z", "Lju/d2;", "callingJob", "U0", "(Lju/d2;)V", "", "e", "Lm2/l0;", "failedInitialComposition", "recoverable", "M0", "(Ljava/lang/Throwable;Lm2/l0;Z)V", "", "C0", "()Ljava/util/List;", "D0", "n0", "composition", "V0", "(Lm2/l0;)V", "i0", "T0", "Y0", "S0", "k0", "(Ltq/e;)Ljava/lang/Object;", "Lkotlin/Function3;", "Lju/p0;", "Lm2/l2;", "Ltq/e;", "", "block", "Q0", "(Ler/q;Ltq/e;)Ljava/lang/Object;", "H0", "Lr0/u0;", "modifiedValues", "K0", "(Lm2/l0;Lr0/u0;)Lm2/l0;", "Lm2/s2;", "references", "J0", "(Ljava/util/List;Lr0/u0;)Ljava/util/List;", "q0", "Lkotlin/Function1;", "O0", "(Lm2/l0;)Ler/l;", "Z0", "(Lm2/l0;Lr0/u0;)Ler/l;", "Lc3/d;", "snapshot", "j0", "(Lc3/d;)V", "X0", "m0", "B0", "Lkotlin/Function0;", "action", "Lm2/g;", "w", "(Ler/a;)Lm2/g;", "content", "a", "(Lm2/l0;Ler/p;)V", "Lm2/e5;", "shouldPause", "Lr0/h1;", "Lm2/f4;", "b", "(Lm2/l0;Lm2/e5;Ler/p;)Lr0/h1;", "invalidScopes", "r", "(Lm2/l0;Lm2/e5;Lr0/h1;)Lr0/h1;", "scope", "u", "(Lm2/f4;)V", "G0", "W0", "", "Le3/h;", "table", "s", "(Ljava/util/Set;)V", "z", "o", "reference", "n", "(Lm2/s2;)V", "c", "Lm2/r2;", "data", "Lm2/c;", "applier", "p", "(Lm2/s2;Lm2/r2;Lm2/c;)V", "v", "q", "(Lm2/s2;)Lm2/r2;", "", "value", "J", "t0", "()J", "changeCount", "Lm2/e;", "Lm2/e;", "broadcastFrameClock", "Lm2/h3;", "Lm2/h3;", "nextFrameEndCallbackQueue", "Landroidx/compose/runtime/platform/SynchronizedObject;", "d", "Ljava/lang/Object;", "stateLock", "Lju/d2;", "runnerJob", "f", "Ljava/lang/Throwable;", "closeCause", "", "g", "Ljava/util/List;", "_knownCompositions", "h", "_knownCompositionsCache", "i", "Lr0/u0;", "snapshotInvalidations", "Ln2/c;", "j", "Ln2/c;", "compositionInvalidations", "k", "compositionsAwaitingApply", "l", "movableContentAwaitingInsert", "Ln2/b;", "Lm2/o2;", "m", "Lr0/t0;", "movableContentRemoved", "Lm2/c3;", "Lm2/c3;", "movableContentNestedStatesAvailable", "Lr0/t0;", "movableContentStatesAvailable", "movableContentNestedExtractionsPending", "failedCompositions", "compositionsRemoved", "Lju/n;", "workContinuation", "", "t", "I", "concurrentCompositionsOutstanding", "Z", "isClosed", "Lmu/b0;", "Lm2/p4$b;", "Lmu/b0;", "errorState", "frameClockPaused", "Lm2/p4$d;", "x", "_state", "Ly2/v;", "y", "Ly2/v;", "pausedScopes", "Lju/a0;", "Lju/a0;", "effectJob", "A", "Ltq/i;", "()Ltq/i;", "Lr0/q0;", "Le3/p;", "B", "Lr0/q0;", "getRegistrationObservers$annotations", "registrationObservers", "Lm2/p4$c;", "C", "Lm2/p4$c;", "recomposerInfo", "w0", "hasBroadcastFrameClockAwaitersLocked", "y0", "hasNextFrameEndAwaitersLocked", "v0", "hasBroadcastFrameClockAwaiters", "A0", "shouldKeepRecomposing", "z0", "hasSchedulingWork", "x0", "hasFrameWorkLocked", "Lmu/p0;", "u0", "()Lmu/p0;", "currentState", "Landroidx/compose/runtime/CompositeKeyHashCode;", "compositeKeyHashCode", "collectingCallByInformation", "collectingParameterInformation", "collectingSourceInformation", "stackTraceEnabled", "Lm2/u;", "()Lm2/u;", a.f96138c, "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class p4 extends v {

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int E = 8;
    private static final b0<t2.g<c>> F = r0.a(t2.a.c());
    private static final AtomicReference<Boolean> G = new AtomicReference<>(Boolean.FALSE);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final i effectCoroutineContext;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private q0<p> registrationObservers;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final c recomposerInfo;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private long changeCount;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final p076m2.e broadcastFrameClock;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final h3 nextFrameEndCallbackQueue;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object stateLock;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private d2 runnerJob;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Throwable closeCause;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<l0> _knownCompositions;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private List<? extends l0> _knownCompositionsCache;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private u0<Object> snapshotInvalidations;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final n2.c<l0> compositionInvalidations;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final List<l0> compositionsAwaitingApply;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final List<s2> movableContentAwaitingInsert;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> movableContentRemoved;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final c3 movableContentNestedStatesAvailable;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final t0<s2, r2> movableContentStatesAvailable;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> movableContentNestedExtractionsPending;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private List<l0> failedCompositions;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private u0<l0> compositionsRemoved;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private n<? super i0> workContinuation;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int concurrentCompositionsOutstanding;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private boolean isClosed;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private b0<b> errorState;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean frameClockPaused;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final b0<d> _state;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final v<u0<f4>> pausedScopes;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final a0 effectJob;

    /* JADX INFO: renamed from: m2.p4$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001b\u0010\b\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001b\u0010\n\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004R\u00020\u0005H\u0002¢\u0006\u0004\b\n\u0010\tR$\u0010\r\u001a\u0012\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0004R\u00020\u00050\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR$\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00020\u00100\u000fj\b\u0012\u0004\u0012\u00020\u0010`\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lm2/p4$a;", "", "<init>", "()V", "Lm2/p4$c;", "Lm2/p4;", "info", "Loq/i0;", "c", "(Lm2/p4$c;)V", "d", "Lmu/b0;", "Lt2/g;", "_runningRecomposers", "Lmu/b0;", "Ljava/util/concurrent/atomic/AtomicReference;", "", "Landroidx/compose/runtime/internal/AtomicReference;", "_hotReloadEnabled", "Ljava/util/concurrent/atomic/AtomicReference;", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void c(c info) {
            t2.g gVar;
            t2.g gVarAdd;
            do {
                gVar = (t2.g) p4.F.getValue();
                gVarAdd = gVar.add(info);
                if (gVar == gVarAdd) {
                    return;
                }
            } while (!p4.F.s(gVar, gVarAdd));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(c info) {
            t2.g gVar;
            t2.g gVarRemove;
            do {
                gVar = (t2.g) p4.F.getValue();
                gVarRemove = gVar.remove(info);
                if (gVar == gVarRemove) {
                    return;
                }
            } while (!p4.F.s(gVar, gVarRemove));
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0002\u0018\u00002\u00020\u00012\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\b\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u0005\u0010\r¨\u0006\u000e"}, d2 = {"Lm2/p4$b;", "", "", "cause", "", "isRecoverable", "<init>", "(Ljava/lang/Throwable;Z)V", "a", "Ljava/lang/Throwable;", "()Ljava/lang/Throwable;", "b", "Z", "()Z", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final Throwable cause;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final boolean isRecoverable;

        public b(Throwable th4, boolean z15) {
            this.cause = th4;
            this.isRecoverable = z15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public Throwable getCause() {
            return this.cause;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lm2/p4$c;", "", "<init>", "(Lm2/p4;)V", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class c {
        public c() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lm2/p4$d;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "f", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum d {
        ShutDown,
        ShuttingDown,
        Inactive,
        InactivePendingWork,
        Idle,
        PendingWork;


        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static final /* synthetic */ wq.a f123078h = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm2/p4$d;", "it", "", "<anonymous>", "(Lm2/p4$d;)Z"}, k = 3, mv = {2, 1, 0})
    static final class e extends vq.k implements er.p<d, tq.e<? super Boolean>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f123079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f123080f;

        e(tq.e<? super e> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f123079e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            u.b(obj);
            return vq.b.a(((d) this.f123080f) == d.ShutDown);
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(d dVar, tq.e<? super Boolean> eVar) {
            return ((e) v(dVar, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            e eVar2 = new e(eVar);
            eVar2.f123080f = obj;
            return eVar2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123081e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f123082f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f123083g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ q<p0, l2, tq.e<? super i0>, Object> f123085j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ l2 f123086k;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f123087e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            private /* synthetic */ Object f123088f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ q<p0, l2, tq.e<? super i0>, Object> f123089g;

            /* JADX INFO: renamed from: h, reason: collision with root package name */
            final /* synthetic */ l2 f123090h;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(q<? super p0, ? super l2, ? super tq.e<? super i0>, ? extends Object> qVar, l2 l2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f123089g = qVar;
                this.f123090h = l2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                Object objE = uq.b.e();
                int i15 = this.f123087e;
                if (i15 == 0) {
                    u.b(obj);
                    p0 p0Var = (p0) this.f123088f;
                    q<p0, l2, tq.e<? super i0>, Object> qVar = this.f123089g;
                    l2 l2Var = this.f123090h;
                    this.f123087e = 1;
                    if (qVar.w(p0Var, l2Var, this) == objE) {
                        return objE;
                    }
                } else {
                    if (i15 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    u.b(obj);
                }
                return i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
                return ((a) v(p0Var, eVar)).J(i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
                a aVar = new a(this.f123089g, this.f123090h, eVar);
                aVar.f123088f = obj;
                return aVar;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        f(q<? super p0, ? super l2, ? super tq.e<? super i0>, ? extends Object> qVar, l2 l2Var, tq.e<? super f> eVar) {
            super(2, eVar);
            this.f123085j = qVar;
            this.f123086k = l2Var;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:27:0x007a A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:28:0x007c A[Catch: all -> 0x006f, LOOP:0: B:11:0x0033->B:28:0x007c, LOOP_END, TryCatch #0 {all -> 0x006f, blocks: (B:4:0x0007, B:6:0x0019, B:8:0x0022, B:11:0x0033, B:13:0x0043, B:15:0x004f, B:17:0x0058, B:19:0x0061, B:24:0x0071, B:25:0x0074, B:28:0x007c, B:38:0x00a5, B:29:0x007f, B:30:0x0085, B:32:0x008b, B:34:0x0093, B:37:0x00a1), top: B:48:0x0007 }] */
        /* JADX WARN: Code duplicated, block: B:51:0x00a5 A[EDGE_INSN: B:51:0x00a5->B:38:0x00a5 BREAK  A[LOOP:0: B:11:0x0033->B:28:0x007c], SYNTHETIC] */
        public static final i0 O(p4 p4Var, Set set, l lVar) {
            n nVarP0;
            synchronized (p4Var.stateLock) {
                try {
                    if (((d) p4Var._state.getValue()).compareTo(d.Idle) >= 0) {
                        u0 u0Var = p4Var.snapshotInvalidations;
                        if (set instanceof n2.e) {
                            h1 h1VarE = ((n2.e) set).e();
                            Object[] objArr = h1VarE.elements;
                            long[] jArr = h1VarE.metadata;
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
                                                Object obj = objArr[(i15 << 3) + i17];
                                                if (!(obj instanceof v0) || ((v0) obj).y(h.a(1))) {
                                                    u0Var.i(obj);
                                                }
                                            }
                                            j15 >>= 8;
                                        }
                                        if (i16 != 8) {
                                            break;
                                        }
                                        if (i15 != length) {
                                            break;
                                        }
                                        i15++;
                                    }
                                }
                            }
                        } else {
                            for (Object obj2 : set) {
                                if (!(obj2 instanceof v0) || ((v0) obj2).y(h.a(1))) {
                                    u0Var.i(obj2);
                                }
                            }
                        }
                        nVarP0 = p4Var.p0();
                    } else {
                        nVarP0 = null;
                    }
                } catch (Throwable th4) {
                    throw th4;
                }
            }
            if (nVarP0 != null) {
                t.Companion companion = t.INSTANCE;
                nVarP0.i(t.b(i0.f148189a));
            }
            return i0.f148189a;
        }

        /* JADX WARN: Code duplicated, block: B:26:0x009a A[Catch: all -> 0x009e, TryCatch #3 {all -> 0x009e, blocks: (B:24:0x0094, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:32:0x00ab), top: B:60:0x0094 }] */
        /* JADX WARN: Code duplicated, block: B:31:0x00a6 A[Catch: all -> 0x009e, TryCatch #3 {all -> 0x009e, blocks: (B:24:0x0094, B:26:0x009a, B:29:0x00a0, B:31:0x00a6, B:32:0x00ab), top: B:60:0x0094 }] */
        /* JADX WARN: Code duplicated, block: B:42:0x00d0 A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x00ca, B:42:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e1), top: B:54:0x00ca }] */
        /* JADX WARN: Code duplicated, block: B:47:0x00dc A[Catch: all -> 0x00d4, TryCatch #0 {all -> 0x00d4, blocks: (B:40:0x00ca, B:42:0x00d0, B:45:0x00d6, B:47:0x00dc, B:48:0x00e1), top: B:54:0x00ca }] */
        /* JADX WARN: Code duplicated, block: B:54:0x00ca A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:60:0x0094 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            d2 d2VarK;
            c3.g gVar;
            Throwable th4;
            Object obj2;
            p4 p4Var;
            Object obj3;
            p4 p4Var2;
            Object objE = uq.b.e();
            int i15 = this.f123082f;
            if (i15 != 0) {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                gVar = (c3.g) this.f123081e;
                d2VarK = (d2) this.f123083g;
                try {
                    u.b(obj);
                    gVar.j();
                    obj3 = p4.this.stateLock;
                    p4Var2 = p4.this;
                    synchronized (obj3) {
                        try {
                            if (p4Var2.runnerJob == d2VarK) {
                                p4Var2.runnerJob = null;
                            }
                            if (p4Var2.p0() != null) {
                                t.b("called outside of runRecomposeAndApplyChanges");
                            }
                            i0 i0Var = i0.f148189a;
                        } catch (Throwable th5) {
                            throw th5;
                        }
                    }
                    p4.INSTANCE.d(p4.this.recomposerInfo);
                    return i0.f148189a;
                } catch (Throwable th6) {
                    th4 = th6;
                    gVar.j();
                    obj2 = p4.this.stateLock;
                    p4Var = p4.this;
                    synchronized (obj2) {
                        try {
                            if (p4Var.runnerJob == d2VarK) {
                                p4Var.runnerJob = null;
                            }
                            if (p4Var.p0() != null) {
                                t.b("called outside of runRecomposeAndApplyChanges");
                            }
                            i0 i0Var2 = i0.f148189a;
                        } catch (Throwable th7) {
                            throw th7;
                        }
                    }
                    p4.INSTANCE.d(p4.this.recomposerInfo);
                    throw th4;
                }
            }
            u.b(obj);
            d2VarK = g2.k(((p0) this.f123083g).getCoroutineContext());
            p4.this.U0(d2VarK);
            l.Companion companion = l.INSTANCE;
            final p4 p4Var3 = p4.this;
            c3.g gVarH = companion.h(new er.p() { // from class: m2.q4
                @Override // er.p
                public final Object B(Object obj4, Object obj5) {
                    return p4.f.O(p4Var3, (Set) obj4, (l) obj5);
                }
            });
            p4.INSTANCE.c(p4.this.recomposerInfo);
            try {
                List listC0 = p4.this.C0();
                int size = listC0.size();
                for (int i16 = 0; i16 < size; i16++) {
                    ((l0) listC0.get(i16)).B();
                }
                a aVar = new a(this.f123085j, this.f123086k, null);
                this.f123083g = d2VarK;
                this.f123081e = gVarH;
                this.f123082f = 1;
                if (ju.q0.e(aVar, this) == objE) {
                    return objE;
                }
                gVar = gVarH;
                gVar.j();
                obj3 = p4.this.stateLock;
                p4Var2 = p4.this;
                synchronized (obj3) {
                    if (p4Var2.runnerJob == d2VarK) {
                        p4Var2.runnerJob = null;
                    }
                    if (p4Var2.p0() != null) {
                        t.b("called outside of runRecomposeAndApplyChanges");
                    }
                    i0 i0Var3 = i0.f148189a;
                    p4.INSTANCE.d(p4.this.recomposerInfo);
                    return i0.f148189a;
                }
            } catch (Throwable th8) {
                gVar = gVarH;
                th4 = th8;
                gVar.j();
                obj2 = p4.this.stateLock;
                p4Var = p4.this;
                synchronized (obj2) {
                    if (p4Var.runnerJob == d2VarK) {
                        p4Var.runnerJob = null;
                    }
                    if (p4Var.p0() != null) {
                        t.b("called outside of runRecomposeAndApplyChanges");
                    }
                    i0 i0Var4 = i0.f148189a;
                    p4.INSTANCE.d(p4.this.recomposerInfo);
                    throw th4;
                }
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            f fVar = p4.this.new f(this.f123085j, this.f123086k, eVar);
            fVar.f123083g = obj;
            return fVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lju/p0;", "Lm2/l2;", "parentFrameClock", "Loq/i0;", "<anonymous>", "(Lju/p0;Lm2/l2;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends vq.k implements q<p0, l2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f123091e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f123092f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        Object f123093g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        Object f123094h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        Object f123095j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        Object f123096k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Object f123097l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        Object f123098m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        int f123099n;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        /* synthetic */ Object f123100p;

        g(tq.e<? super g> eVar) {
            super(3, eVar);
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0078 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:22:0x007a A[Catch: all -> 0x002e, LOOP:1: B:12:0x0044->B:22:0x007a, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000f, B:6:0x001f, B:9:0x0031, B:12:0x0044, B:14:0x0055, B:16:0x005f, B:18:0x0065, B:19:0x0072, B:24:0x0085, B:27:0x0092, B:29:0x009d, B:31:0x00a7, B:33:0x00ad, B:34:0x00b7, B:37:0x00bf, B:38:0x00c2, B:41:0x00d2, B:43:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00fa, B:51:0x0102, B:52:0x0105, B:22:0x007a), top: B:57:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:36:0x00bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:37:0x00bf A[Catch: all -> 0x002e, LOOP:3: B:27:0x0092->B:37:0x00bf, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000f, B:6:0x001f, B:9:0x0031, B:12:0x0044, B:14:0x0055, B:16:0x005f, B:18:0x0065, B:19:0x0072, B:24:0x0085, B:27:0x0092, B:29:0x009d, B:31:0x00a7, B:33:0x00ad, B:34:0x00b7, B:37:0x00bf, B:38:0x00c2, B:41:0x00d2, B:43:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00fa, B:51:0x0102, B:52:0x0105, B:22:0x007a), top: B:57:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:50:0x0100 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:51:0x0102 A[Catch: all -> 0x002e, LOOP:5: B:41:0x00d2->B:51:0x0102, LOOP_END, TryCatch #0 {all -> 0x002e, blocks: (B:4:0x000f, B:6:0x001f, B:9:0x0031, B:12:0x0044, B:14:0x0055, B:16:0x005f, B:18:0x0065, B:19:0x0072, B:24:0x0085, B:27:0x0092, B:29:0x009d, B:31:0x00a7, B:33:0x00ad, B:34:0x00b7, B:37:0x00bf, B:38:0x00c2, B:41:0x00d2, B:43:0x00dd, B:45:0x00e7, B:47:0x00ed, B:48:0x00fa, B:51:0x0102, B:52:0x0105, B:22:0x007a), top: B:57:0x000f }] */
        /* JADX WARN: Code duplicated, block: B:61:0x0085 A[EDGE_INSN: B:61:0x0085->B:24:0x0085 BREAK  A[LOOP:1: B:12:0x0044->B:22:0x007a], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:66:0x00c2 A[EDGE_INSN: B:66:0x00c2->B:38:0x00c2 BREAK  A[LOOP:3: B:27:0x0092->B:37:0x00bf], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:71:0x0105 A[EDGE_INSN: B:71:0x0105->B:52:0x0105 BREAK  A[LOOP:5: B:41:0x00d2->B:51:0x0102], SYNTHETIC] */
        private static final void O(p4 p4Var, List<l0> list, List<s2> list2, List<l0> list3, u0<l0> u0Var, u0<l0> u0Var2, u0<Object> u0Var3, u0<l0> u0Var4) {
            char c15;
            long j15;
            long j16;
            synchronized (p4Var.stateLock) {
                try {
                    list.clear();
                    list2.clear();
                    int size = list3.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        l0 l0Var = list3.get(i15);
                        l0Var.z();
                        p4Var.S0(l0Var);
                    }
                    list3.clear();
                    Object[] objArr = u0Var.elements;
                    long[] jArr = u0Var.metadata;
                    int length = jArr.length - 2;
                    if (length >= 0) {
                        int i16 = 0;
                        j15 = 255;
                        while (true) {
                            long j17 = jArr[i16];
                            c15 = 7;
                            j16 = -9187201950435737472L;
                            if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                if (i16 != length) {
                                    break;
                                    break;
                                }
                                i16++;
                            } else {
                                int i17 = 8 - ((~(i16 - length)) >>> 31);
                                for (int i18 = 0; i18 < i17; i18++) {
                                    if ((j17 & 255) < 128) {
                                        l0 l0Var2 = (l0) objArr[(i16 << 3) + i18];
                                        l0Var2.z();
                                        p4Var.S0(l0Var2);
                                    }
                                    j17 >>= 8;
                                }
                                if (i17 != 8) {
                                    break;
                                } else if (i16 != length) {
                                    break;
                                } else {
                                    i16++;
                                }
                            }
                        }
                    } else {
                        c15 = 7;
                        j15 = 255;
                        j16 = -9187201950435737472L;
                    }
                    u0Var.n();
                    Object[] objArr2 = u0Var2.elements;
                    long[] jArr2 = u0Var2.metadata;
                    int length2 = jArr2.length - 2;
                    if (length2 >= 0) {
                        int i19 = 0;
                        while (true) {
                            long j18 = jArr2[i19];
                            if ((((~j18) << c15) & j18 & j16) == j16) {
                                if (i19 != length2) {
                                    break;
                                    break;
                                }
                                i19++;
                            } else {
                                int i25 = 8 - ((~(i19 - length2)) >>> 31);
                                for (int i26 = 0; i26 < i25; i26++) {
                                    if ((j18 & j15) < 128) {
                                        ((l0) objArr2[(i19 << 3) + i26]).A();
                                    }
                                    j18 >>= 8;
                                }
                                if (i25 != 8) {
                                    break;
                                } else if (i19 != length2) {
                                    break;
                                } else {
                                    i19++;
                                }
                            }
                        }
                    }
                    u0Var2.n();
                    u0Var3.n();
                    Object[] objArr3 = u0Var4.elements;
                    long[] jArr3 = u0Var4.metadata;
                    int length3 = jArr3.length - 2;
                    if (length3 >= 0) {
                        int i27 = 0;
                        while (true) {
                            long j19 = jArr3[i27];
                            if ((((~j19) << c15) & j19 & j16) == j16) {
                                if (i27 != length3) {
                                    break;
                                    break;
                                }
                                i27++;
                            } else {
                                int i28 = 8 - ((~(i27 - length3)) >>> 31);
                                for (int i29 = 0; i29 < i28; i29++) {
                                    if ((j19 & j15) < 128) {
                                        l0 l0Var3 = (l0) objArr3[(i27 << 3) + i29];
                                        l0Var3.z();
                                        p4Var.S0(l0Var3);
                                    }
                                    j19 >>= 8;
                                }
                                if (i28 != 8) {
                                    break;
                                } else if (i27 != length3) {
                                    break;
                                } else {
                                    i27++;
                                }
                            }
                        }
                    }
                    u0Var4.n();
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        private static final void V(List<s2> list, p4 p4Var) {
            list.clear();
            synchronized (p4Var.stateLock) {
                try {
                    List list2 = p4Var.movableContentAwaitingInsert;
                    int size = list2.size();
                    for (int i15 = 0; i15 < size; i15++) {
                        list.add((s2) list2.get(i15));
                    }
                    p4Var.movableContentAwaitingInsert.clear();
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    throw th4;
                }
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Code duplicated, block: B:112:0x01ff A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:113:0x0201 A[LOOP:4: B:100:0x01ce->B:113:0x0201, LOOP_END] */
        /* JADX WARN: Code duplicated, block: B:253:0x0204 A[EDGE_INSN: B:253:0x0204->B:114:0x0204 BREAK  A[LOOP:4: B:100:0x01ce->B:113:0x0201], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:259:0x0188 A[EDGE_INSN: B:259:0x0188->B:82:0x0188 BREAK  A[LOOP:6: B:67:0x014e->B:80:0x0183], SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:79:0x0181 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:80:0x0183 A[LOOP:6: B:67:0x014e->B:80:0x0183, LOOP_END] */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v18 */
        /* JADX WARN: Type inference failed for: r3v19, types: [int] */
        /* JADX WARN: Type inference failed for: r3v20 */
        /* JADX WARN: Type inference failed for: r3v21, types: [int] */
        /* JADX WARN: Type inference failed for: r3v25 */
        /* JADX WARN: Type inference failed for: r3v26 */
        /* JADX WARN: Type inference failed for: r4v15, types: [int] */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r4v25 */
        /* JADX WARN: Type inference failed for: r5v8, types: [T[], java.lang.Object[]] */
        public static final i0 X(p4 p4Var, u0 u0Var, u0 u0Var2, List list, List list2, u0 u0Var3, List list3, u0 u0Var4, Set set, long j15) {
            boolean z15;
            char c15;
            long j16;
            p4 p4Var2 = p4Var;
            if (p4Var2.v0()) {
                y2.b0 b0Var = y2.b0.f223360a;
                Object objA = b0Var.a("Recomposer:animation");
                try {
                    p4Var2.broadcastFrameClock.e(j15);
                    l.INSTANCE.m();
                    i0 i0Var = i0.f148189a;
                    b0Var.b(objA);
                } catch (Throwable th4) {
                    y2.b0.f223360a.b(objA);
                    throw th4;
                }
            }
            Object objA2 = y2.b0.f223360a.a("Recomposer:recompose");
            try {
                p4Var2.R0();
                synchronized (p4Var2.stateLock) {
                    try {
                        n2.c cVar = p4Var2.compositionInvalidations;
                        Object[] objArr = cVar.content;
                        int size = cVar.getSize();
                        z15 = false;
                        for (int i15 = 0; i15 < size; i15++) {
                            list.add((l0) objArr[i15]);
                        }
                        p4Var2.compositionInvalidations.j();
                        i0 i0Var2 = i0.f148189a;
                    } catch (Throwable th5) {
                        throw th5;
                    }
                }
                u0Var.n();
                u0Var2.n();
                while (true) {
                    if (list.isEmpty() && list2.isEmpty()) {
                        break;
                    }
                    try {
                        int size2 = list.size();
                        for (int i16 = 0; i16 < size2; i16++) {
                            l0 l0Var = (l0) list.get(i16);
                            l0 l0VarK0 = p4Var2.K0(l0Var, u0Var);
                            if (l0VarK0 != null) {
                                list3.add(l0VarK0);
                                i0 i0Var3 = i0.f148189a;
                            }
                            u0Var2.i(l0Var);
                        }
                        list.clear();
                        if (u0Var.f() || p4Var2.compositionInvalidations.getSize() != 0) {
                            synchronized (p4Var2.stateLock) {
                                try {
                                    List listD0 = p4Var2.D0();
                                    int size3 = listD0.size();
                                    for (int i17 = 0; i17 < size3; i17++) {
                                        l0 l0Var2 = (l0) listD0.get(i17);
                                        if (!u0Var2.a(l0Var2) && l0Var2.l(set)) {
                                            list.add(l0Var2);
                                        }
                                    }
                                    n2.c cVar2 = p4Var2.compositionInvalidations;
                                    int size4 = cVar2.getSize();
                                    int i18 = 0;
                                    for (int i19 = 0; i19 < size4; i19++) {
                                        l0 l0Var3 = (l0) cVar2.content[i19];
                                        if (!u0Var2.a(l0Var3) && !list.contains(l0Var3)) {
                                            list.add(l0Var3);
                                            i18++;
                                        } else if (i18 > 0) {
                                            Object[] objArr2 = cVar2.content;
                                            objArr2[i19 - i18] = objArr2[i19];
                                        }
                                    }
                                    int i25 = size4 - i18;
                                    pq.n.z(cVar2.content, null, i25, size4);
                                    cVar2.A(i25);
                                    i0 i0Var4 = i0.f148189a;
                                } catch (Throwable th6) {
                                    throw th6;
                                }
                            }
                        }
                        if (list.isEmpty()) {
                            try {
                                V(list2, p4Var2);
                                while (!list2.isEmpty()) {
                                    u0Var3.w(p4Var2.J0(list2, u0Var));
                                    V(list2, p4Var2);
                                }
                            } catch (Throwable th7) {
                                p4.N0(p4Var2, th7, null, true, 2, null);
                                O(p4Var, list, list2, list3, u0Var3, u0Var4, u0Var, u0Var2);
                                i0 i0Var5 = i0.f148189a;
                                y2.b0.f223360a.b(objA2);
                                return i0Var5;
                            }
                        } else {
                            p4Var2 = p4Var;
                        }
                        z15 = false;
                    } catch (Throwable th8) {
                        try {
                            p4.N0(p4Var, th8, null, true, 2, null);
                            O(p4Var, list, list2, list3, u0Var3, u0Var4, u0Var, u0Var2);
                            i0 i0Var6 = i0.f148189a;
                            list.clear();
                            y2.b0.f223360a.b(objA2);
                            return i0Var6;
                        } catch (Throwable th9) {
                            list.clear();
                            throw th9;
                        }
                    }
                    y2.b0.f223360a.b(objA2);
                    throw th;
                }
                l lVarC = l.INSTANCE.c();
                l y0Var = lVarC instanceof c3.d ? new y0((c3.d) lVarC, null, null, true, false) : new z0(lVarC, null, true, z15);
                try {
                    l lVarL = y0Var.l();
                    try {
                        if (!list3.isEmpty()) {
                            p4Var2.changeCount = p4Var2.getChangeCount() + 1;
                            try {
                                int size5 = list3.size();
                                for (?? r15 = z15; r15 < size5; r15++) {
                                    u0Var4.i((l0) list3.get(r15));
                                }
                                int size6 = list3.size();
                                for (?? r16 = z15; r16 < size6; r16++) {
                                    ((l0) list3.get(r16)).r();
                                }
                                list3.clear();
                            } catch (Throwable th10) {
                                try {
                                    p4.N0(p4Var2, th10, null, false, 6, null);
                                    O(p4Var, list, list2, list3, u0Var3, u0Var4, u0Var, u0Var2);
                                    i0 i0Var7 = i0.f148189a;
                                    list3.clear();
                                    y0Var.s(lVarL);
                                    y0Var.d();
                                    y2.b0.f223360a.b(objA2);
                                    return i0Var7;
                                } catch (Throwable th11) {
                                    list3.clear();
                                    throw th11;
                                }
                            }
                        }
                        if (u0Var3.f()) {
                            try {
                                u0Var4.y(u0Var3);
                                Object[] objArr3 = u0Var3.elements;
                                long[] jArr = u0Var3.metadata;
                                c15 = 7;
                                int length = jArr.length - 2;
                                if (length >= 0) {
                                    ?? r17 = z15;
                                    while (true) {
                                        long j17 = jArr[r17];
                                        j16 = 128;
                                        if ((((~j17) << 7) & j17 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (r17 != length) {
                                                break;
                                                break;
                                            }
                                            r17++;
                                        } else {
                                            int i26 = 8 - ((~(r17 - length)) >>> 31);
                                            for (int i27 = 0; i27 < i26; i27++) {
                                                if ((j17 & 255) < 128) {
                                                    ((l0) objArr3[(r17 << 3) + i27]).b();
                                                }
                                                j17 >>= 8;
                                            }
                                            if (i26 != 8) {
                                                break;
                                            }
                                            if (r17 != length) {
                                                break;
                                            }
                                            r17++;
                                        }
                                    }
                                } else {
                                    j16 = 128;
                                }
                                u0Var3.n();
                            } catch (Throwable th12) {
                                try {
                                    p4.N0(p4Var, th12, null, false, 6, null);
                                    O(p4Var, list, list2, list3, u0Var3, u0Var4, u0Var, u0Var2);
                                    i0 i0Var8 = i0.f148189a;
                                    u0Var3.n();
                                    y0Var.s(lVarL);
                                    y0Var.d();
                                    y2.b0.f223360a.b(objA2);
                                    return i0Var8;
                                } catch (Throwable th13) {
                                    u0Var3.n();
                                    throw th13;
                                }
                            }
                        } else {
                            c15 = 7;
                            j16 = 128;
                        }
                        if (u0Var4.f()) {
                            try {
                                Object[] objArr4 = u0Var4.elements;
                                long[] jArr2 = u0Var4.metadata;
                                int length2 = jArr2.length - 2;
                                if (length2 >= 0) {
                                    int i28 = 0;
                                    while (true) {
                                        long j18 = jArr2[i28];
                                        if ((((~j18) << c15) & j18 & (-9187201950435737472L)) == -9187201950435737472L) {
                                            if (i28 != length2) {
                                                break;
                                                break;
                                            }
                                            i28++;
                                        } else {
                                            int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                            for (int i35 = 0; i35 < i29; i35++) {
                                                if ((j18 & 255) < j16) {
                                                    ((l0) objArr4[(i28 << 3) + i35]).A();
                                                }
                                                j18 >>= 8;
                                            }
                                            if (i29 != 8) {
                                                break;
                                            }
                                            if (i28 != length2) {
                                                break;
                                            }
                                            i28++;
                                        }
                                    }
                                }
                                u0Var4.n();
                            } catch (Throwable th14) {
                                try {
                                    p4.N0(p4Var, th14, null, false, 6, null);
                                    O(p4Var, list, list2, list3, u0Var3, u0Var4, u0Var, u0Var2);
                                    i0 i0Var9 = i0.f148189a;
                                    u0Var4.n();
                                    y0Var.s(lVarL);
                                    y0Var.d();
                                    y2.b0.f223360a.b(objA2);
                                    return i0Var9;
                                } catch (Throwable th15) {
                                    u0Var4.n();
                                    throw th15;
                                }
                            }
                        }
                        i0 i0Var10 = i0.f148189a;
                        y0Var.s(lVarL);
                        y0Var.d();
                        synchronized (p4Var.stateLock) {
                            if (!(p4Var.p0() == null)) {
                                t.b("unexpected to get continuation here");
                            }
                        }
                        l.INSTANCE.f();
                        u0Var2.n();
                        u0Var.n();
                        p4Var.compositionsRemoved = null;
                        y2.b0.f223360a.b(objA2);
                        return i0.f148189a;
                    } catch (Throwable th16) {
                        y0Var.s(lVarL);
                        throw th16;
                    }
                } catch (Throwable th17) {
                    y0Var.d();
                    throw th17;
                }
            } catch (Throwable th18) {
                y2.b0.f223360a.b(objA2);
                throw th18;
            }
        }

        /* JADX WARN: Code duplicated, block: B:14:0x00b4  */
        /* JADX WARN: Code duplicated, block: B:17:0x00d1  */
        /* JADX WARN: Code duplicated, block: B:20:0x00df  */
        /* JADX WARN: Code duplicated, block: B:23:0x0101  */
        /* JADX WARN: Code duplicated, block: B:25:0x0118  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0101 -> B:24:0x0109). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0118 -> B:12:0x00ac). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // vq.a
        public final java.lang.Object J(java.lang.Object r17) {
            /*
                Method dump skipped, instruction units count: 292
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: m2.p4.g.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.q
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object w(p0 p0Var, l2 l2Var, tq.e<? super i0> eVar) {
            g gVar = p4.this.new g(eVar);
            gVar.f123100p = l2Var;
            return gVar.J(i0.f148189a);
        }
    }

    public p4(i iVar) {
        p076m2.e eVar = new p076m2.e(new er.a() { // from class: m2.j4
            @Override // er.a
            public final Object a() {
                return p4.l0(this.f122981a);
            }
        });
        this.broadcastFrameClock = eVar;
        this.nextFrameEndCallbackQueue = new h3(new er.a() { // from class: m2.k4
            @Override // er.a
            public final Object a() {
                return p4.E0(this.f122987a);
            }
        });
        this.stateLock = new Object();
        this._knownCompositions = new ArrayList();
        this.snapshotInvalidations = new u0<>(0, 1, null);
        this.compositionInvalidations = new n2.c<>(new l0[16], 0);
        this.compositionsAwaitingApply = new ArrayList();
        this.movableContentAwaitingInsert = new ArrayList();
        this.movableContentRemoved = n2.b.e(null, 1, null);
        this.movableContentNestedStatesAvailable = new c3();
        this.movableContentStatesAvailable = g1.c();
        this.movableContentNestedExtractionsPending = n2.b.e(null, 1, null);
        this.errorState = r0.a(null);
        this._state = r0.a(d.Inactive);
        this.pausedScopes = new v<>();
        a0 a0VarA = g2.a((d2) iVar.m(d2.INSTANCE));
        a0VarA.C0(new er.l() { // from class: m2.l4
            @Override // er.l
            public final Object b(Object obj) {
                return p4.r0(this.f122997a, (Throwable) obj);
            }
        });
        this.effectJob = a0VarA;
        this.effectCoroutineContext = iVar.n0(eVar).n0(a0VarA);
        this.recomposerInfo = new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean A0() {
        boolean z15;
        synchronized (this.stateLock) {
            z15 = this.isClosed;
        }
        if (!z15) {
            return true;
        }
        Iterator<d2> it = this.effectJob.getChildren().iterator();
        while (it.hasNext()) {
            if (it.next().h()) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l0> C0() {
        List<l0> listD0;
        synchronized (this.stateLock) {
            listD0 = D0();
        }
        return listD0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l0> D0() {
        List list = this._knownCompositionsCache;
        if (list != null) {
            return list;
        }
        List<l0> list2 = this._knownCompositions;
        List<l0> listN = list2.isEmpty() ? pq.v.n() : new ArrayList(list2);
        this._knownCompositionsCache = listN;
        return listN;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 E0(p4 p4Var) {
        p4Var.F0();
        return i0.f148189a;
    }

    private final void F0() {
        n<i0> nVarP0;
        synchronized (this.stateLock) {
            nVarP0 = p0();
            if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                throw r1.a("Recomposer shutdown; frame clock awaiter will never resume", this.closeCause);
            }
        }
        if (nVarP0 != null) {
            t.Companion companion = t.INSTANCE;
            nVarP0.i(t.b(i0.f148189a));
        }
    }

    private final void H0(l0 composition) {
        synchronized (this.stateLock) {
            List<s2> list = this.movableContentAwaitingInsert;
            int size = list.size();
            for (int i15 = 0; i15 < size; i15++) {
                if (fr.t.c(list.get(i15).getComposition(), composition)) {
                    i0 i0Var = i0.f148189a;
                    ArrayList arrayList = new ArrayList();
                    I0(arrayList, this, composition);
                    while (!arrayList.isEmpty()) {
                        J0(arrayList, null);
                        I0(arrayList, this, composition);
                    }
                    return;
                }
            }
        }
    }

    private static final void I0(List<s2> list, p4 p4Var, l0 l0Var) {
        list.clear();
        synchronized (p4Var.stateLock) {
            try {
                Iterator<s2> it = p4Var.movableContentAwaitingInsert.iterator();
                while (it.hasNext()) {
                    s2 next = it.next();
                    if (fr.t.c(next.getComposition(), l0Var)) {
                        list.add(next);
                        it.remove();
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final List<l0> J0(List<s2> references, u0<Object> modifiedValues) {
        ArrayList arrayList;
        d3 d3VarE;
        HashMap map = new HashMap(references.size());
        int size = references.size();
        for (int i15 = 0; i15 < size; i15++) {
            s2 s2Var = references.get(i15);
            l0 composition = s2Var.getComposition();
            Object arrayList2 = map.get(composition);
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                map.put(composition, arrayList2);
            }
            ((ArrayList) arrayList2).add(s2Var);
        }
        for (Map.Entry entry : map.entrySet()) {
            l0 l0Var = (l0) entry.getKey();
            List list = (List) entry.getValue();
            if (l0Var.s()) {
                t.b("Check failed");
            }
            c3.d dVarN = l.INSTANCE.n(O0(l0Var), Z0(l0Var, modifiedValues));
            try {
                l lVarL = dVarN.l();
                try {
                    synchronized (this.stateLock) {
                        try {
                            arrayList = new ArrayList(list.size());
                            int size2 = list.size();
                            for (int i16 = 0; i16 < size2; i16++) {
                                s2 s2Var2 = (s2) list.get(i16);
                                Object objM = n2.b.m(this.movableContentRemoved, s2Var2.c());
                                s2 s2Var3 = (s2) objM;
                                if (s2Var3 != null) {
                                    this.movableContentNestedStatesAvailable.f(s2Var3);
                                }
                                arrayList.add(y.a(s2Var2, objM));
                            }
                            int size3 = arrayList.size();
                            for (int i17 = 0; i17 < size3; i17++) {
                                r<s2, s2> rVar = arrayList.get(i17);
                                if (rVar.d() == null && this.movableContentNestedStatesAvailable.d(rVar.c().c())) {
                                    ArrayList arrayList3 = new ArrayList(arrayList.size());
                                    int size4 = arrayList.size();
                                    for (int i18 = 0; i18 < size4; i18++) {
                                        r<s2, s2> rVarA = arrayList.get(i18);
                                        if (rVarA.d() == null && (d3VarE = this.movableContentNestedStatesAvailable.e(rVarA.c().c())) != null) {
                                            s2 content = d3VarE.getContent();
                                            n2.b.a(this.movableContentNestedExtractionsPending, d3VarE.getContainer(), content);
                                            rVarA = y.a(rVarA.c(), content);
                                        }
                                        arrayList3.add(rVarA);
                                    }
                                    arrayList = arrayList3;
                                    break;
                                }
                            }
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                    int size5 = arrayList.size();
                    for (int i19 = 0; i19 < size5; i19++) {
                        if (arrayList.get(i19).d() != null) {
                            int size6 = arrayList.size();
                            for (int i25 = 0; i25 < size6; i25++) {
                                if (arrayList.get(i25).d() == null) {
                                    ArrayList arrayList4 = new ArrayList(arrayList.size());
                                    int size7 = arrayList.size();
                                    for (int i26 = 0; i26 < size7; i26++) {
                                        r<s2, s2> rVar2 = arrayList.get(i26);
                                        s2 s2VarC = rVar2.d() == null ? rVar2.c() : null;
                                        if (s2VarC != null) {
                                            arrayList4.add(s2VarC);
                                        }
                                    }
                                    synchronized (this.stateLock) {
                                        pq.v.D(this.movableContentAwaitingInsert, arrayList4);
                                        i0 i0Var = i0.f148189a;
                                    }
                                    ArrayList arrayList5 = new ArrayList(arrayList.size());
                                    int size8 = arrayList.size();
                                    for (int i27 = 0; i27 < size8; i27++) {
                                        r<s2, s2> rVar3 = arrayList.get(i27);
                                        if (rVar3.d() != null) {
                                            arrayList5.add(rVar3);
                                        }
                                    }
                                    arrayList = arrayList5;
                                    break;
                                }
                            }
                            break;
                        }
                    }
                    l0Var.e(arrayList);
                    i0 i0Var2 = i0.f148189a;
                    dVarN.s(lVarL);
                    j0(dVarN);
                } catch (Throwable th5) {
                    dVarN.s(lVarL);
                    throw th5;
                }
            } catch (Throwable th6) {
                j0(dVarN);
                throw th6;
            }
        }
        return pq.v.f1(map.keySet());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final l0 K0(final l0 composition, final u0<Object> modifiedValues) {
        u0<l0> u0Var;
        if (composition.s() || composition.c() || ((u0Var = this.compositionsRemoved) != null && u0Var.a(composition))) {
            return null;
        }
        c3.d dVarN = l.INSTANCE.n(O0(composition), Z0(composition, modifiedValues));
        try {
            l lVarL = dVarN.l();
            if (modifiedValues != null) {
                try {
                    if (modifiedValues.f()) {
                        composition.q(new er.a() { // from class: m2.o4
                            @Override // er.a
                            public final Object a() {
                                return p4.L0(modifiedValues, composition);
                            }
                        });
                    }
                } catch (Throwable th4) {
                    dVarN.s(lVarL);
                    throw th4;
                }
            }
            boolean zK = composition.k();
            dVarN.s(lVarL);
            j0(dVarN);
            if (zK) {
                return composition;
            }
            return null;
        } catch (Throwable th5) {
            j0(dVarN);
            throw th5;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:14:0x003e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0040 A[LOOP:0: B:5:0x000b->B:15:0x0040, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0043 A[EDGE_INSN: B:19:0x0043->B:16:0x0043 BREAK  A[LOOP:0: B:5:0x000b->B:15:0x0040], SYNTHETIC] */
    public static final i0 L0(u0 u0Var, l0 l0Var) {
        Object[] objArr = u0Var.elements;
        long[] jArr = u0Var.metadata;
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
                            l0Var.t(objArr[(i15 << 3) + i17]);
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    }
                    if (i15 != length) {
                        break;
                    }
                    i15++;
                }
            }
        }
        return i0.f148189a;
    }

    private final void M0(Throwable e15, l0 failedInitialComposition, boolean recoverable) throws Throwable {
        if (!G.get().booleanValue() || (e15 instanceof p)) {
            synchronized (this.stateLock) {
                c0.a("Error was captured in composition.", e15);
                b value = this.errorState.getValue();
                if (value != null) {
                    throw value.getCause();
                }
                this.errorState.setValue(new b(e15, false));
                i0 i0Var = i0.f148189a;
            }
            throw e15;
        }
        synchronized (this.stateLock) {
            try {
                c0.a("Error was captured in composition while live edit was enabled.", e15);
                this.compositionsAwaitingApply.clear();
                this.compositionInvalidations.j();
                this.snapshotInvalidations = new u0<>(0, 1, null);
                this.movableContentAwaitingInsert.clear();
                n2.b.c(this.movableContentRemoved);
                this.movableContentStatesAvailable.k();
                this.errorState.setValue(new b(e15, recoverable));
                if (failedInitialComposition != null) {
                    S0(failedInitialComposition);
                }
                if (p0() != null) {
                    t.b("expected to go to inactive state due to composition error");
                }
                i0 i0Var2 = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    static /* synthetic */ void N0(p4 p4Var, Throwable th4, l0 l0Var, boolean z15, int i15, Object obj) throws Throwable {
        if ((i15 & 2) != 0) {
            l0Var = null;
        }
        if ((i15 & 4) != 0) {
            z15 = false;
        }
        p4Var.M0(th4, l0Var, z15);
    }

    private final er.l<Object, i0> O0(final l0 composition) {
        return new er.l() { // from class: m2.i4
            @Override // er.l
            public final Object b(Object obj) {
                return p4.P0(composition, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 P0(l0 l0Var, Object obj) {
        l0Var.a(obj);
        return i0.f148189a;
    }

    private final Object Q0(q<? super p0, ? super l2, ? super tq.e<? super i0>, ? extends Object> qVar, tq.e<? super i0> eVar) {
        Object objG = ju.i.g(this.broadcastFrameClock, new f(qVar, n2.a(eVar.getContext()), null), eVar);
        return objG == uq.b.e() ? objG : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean R0() {
        boolean zX0;
        pq.v.n();
        synchronized (this.stateLock) {
            if (this.snapshotInvalidations.e()) {
                return x0();
            }
            List<l0> listD0 = D0();
            Set<? extends Object> setA = n2.f.a(this.snapshotInvalidations);
            this.snapshotInvalidations = new u0<>(0, 1, null);
            try {
                int size = listD0.size();
                for (int i15 = 0; i15 < size; i15++) {
                    listD0.get(i15).o(setA);
                    if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                        break;
                    }
                }
                synchronized (this.stateLock) {
                    if (p0() != null) {
                        throw new IllegalStateException("called outside of runRecomposeAndApplyChanges");
                    }
                    zX0 = x0();
                }
                return zX0;
            } catch (Throwable th4) {
                synchronized (this.stateLock) {
                    this.snapshotInvalidations.j(setA);
                    throw th4;
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S0(l0 composition) {
        List arrayList = this.failedCompositions;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.failedCompositions = arrayList;
        }
        if (!arrayList.contains(composition)) {
            arrayList.add(composition);
        }
        V0(composition);
    }

    private final void T0(l0 composition) {
        q0<p> q0Var = this.registrationObservers;
        if (q0Var != null) {
            Object[] objArr = q0Var.content;
            int i15 = q0Var._size;
            for (int i16 = 0; i16 < i15; i16++) {
                p pVar = (p) objArr[i16];
                if (composition instanceof e3.v) {
                    pVar.b((e3.v) composition);
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U0(d2 callingJob) {
        synchronized (this.stateLock) {
            try {
                Throwable th4 = this.closeCause;
                if (th4 != null) {
                    throw th4;
                }
                if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
                    throw new IllegalStateException("Recomposer shut down");
                }
                if (this.runnerJob != null) {
                    throw new IllegalStateException("Recomposer already running");
                }
                this.runnerJob = callingJob;
                if (p0() != null) {
                    t.b("called outside of runRecomposeAndApplyChanges");
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
    }

    private final void V0(l0 composition) {
        if (this._knownCompositions.remove(composition)) {
            this._knownCompositionsCache = null;
            Y0(composition);
        }
    }

    private final void Y0(l0 composition) {
        q0<p> q0Var = this.registrationObservers;
        if (q0Var != null) {
            Object[] objArr = q0Var.content;
            int i15 = q0Var._size;
            for (int i16 = 0; i16 < i15; i16++) {
                p pVar = (p) objArr[i16];
                if (composition instanceof e3.v) {
                    pVar.a((e3.v) composition);
                }
            }
        }
    }

    private final er.l<Object, i0> Z0(final l0 composition, final u0<Object> modifiedValues) {
        return new er.l() { // from class: m2.m4
            @Override // er.l
            public final Object b(Object obj) {
                return p4.a1(composition, modifiedValues, obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 a1(l0 l0Var, u0 u0Var, Object obj) {
        l0Var.t(obj);
        if (u0Var != null) {
            u0Var.i(obj);
        }
        return i0.f148189a;
    }

    private final void i0(l0 composition) {
        this._knownCompositions.add(composition);
        this._knownCompositionsCache = null;
    }

    private final void j0(c3.d snapshot) {
        try {
            if (snapshot.C() instanceof c3.n.a) {
                throw new IllegalStateException("Unsupported concurrent change during composition. A state object was modified by composition as well as being modified outside composition.");
            }
            snapshot.d();
        } catch (Throwable th4) {
            snapshot.d();
            throw th4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object k0(tq.e<? super i0> eVar) {
        ju.p pVar;
        if (z0()) {
            return i0.f148189a;
        }
        ju.p pVar2 = new ju.p(uq.b.c(eVar), 1);
        pVar2.D();
        synchronized (this.stateLock) {
            if (z0()) {
                pVar = pVar2;
            } else {
                this.workContinuation = pVar2;
                pVar = null;
            }
        }
        if (pVar != null) {
            t.Companion companion = t.INSTANCE;
            pVar.i(t.b(i0.f148189a));
        }
        Object objX = pVar2.x();
        if (objX == uq.b.e()) {
            vq.g.c(eVar);
        }
        return objX == uq.b.e() ? objX : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 l0(p4 p4Var) {
        p4Var.F0();
        return i0.f148189a;
    }

    private final void n0() {
        List<l0> listD0 = D0();
        int size = listD0.size();
        for (int i15 = 0; i15 < size; i15++) {
            Y0(listD0.get(i15));
        }
        this._knownCompositions.clear();
        this._knownCompositionsCache = pq.v.n();
    }

    private static final void o0(p4 p4Var, s2 s2Var, s2 s2Var2) {
        List<s2> listF = s2Var2.f();
        if (listF != null) {
            int size = listF.size();
            for (int i15 = 0; i15 < size; i15++) {
                s2 s2Var3 = listF.get(i15);
                p4Var.movableContentNestedStatesAvailable.b(s2Var3.c(), new d3(s2Var3, s2Var));
                o0(p4Var, s2Var, s2Var3);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final n<i0> p0() {
        d dVar;
        if (this._state.getValue().compareTo(d.ShuttingDown) <= 0) {
            n0();
            this.snapshotInvalidations = new u0<>(0, 1, null);
            this.compositionInvalidations.j();
            this.compositionsAwaitingApply.clear();
            this.movableContentAwaitingInsert.clear();
            this.failedCompositions = null;
            n<? super i0> nVar = this.workContinuation;
            if (nVar != null) {
                n.a.a(nVar, null, 1, null);
            }
            this.workContinuation = null;
            this.errorState.setValue(null);
            return null;
        }
        if (this.errorState.getValue() != null) {
            dVar = d.Inactive;
        } else if (this.runnerJob == null) {
            this.snapshotInvalidations = new u0<>(0, 1, null);
            this.compositionInvalidations.j();
            dVar = (w0() || y0()) ? d.InactivePendingWork : d.Inactive;
        } else {
            dVar = (this.compositionInvalidations.getSize() == 0 && !this.snapshotInvalidations.f() && this.compositionsAwaitingApply.isEmpty() && this.movableContentAwaitingInsert.isEmpty() && this.concurrentCompositionsOutstanding <= 0 && !w0() && !y0() && !n2.b.k(this.movableContentRemoved)) ? d.Idle : d.PendingWork;
        }
        this._state.setValue(dVar);
        if (dVar != d.PendingWork) {
            return null;
        }
        n nVar2 = this.workContinuation;
        this.workContinuation = null;
        return nVar2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0() {
        int i15;
        a1 a1VarF;
        synchronized (this.stateLock) {
            try {
                if (n2.b.k(this.movableContentRemoved)) {
                    a1 a1VarQ = n2.b.q(this.movableContentRemoved);
                    n2.b.c(this.movableContentRemoved);
                    this.movableContentNestedStatesAvailable.c();
                    n2.b.c(this.movableContentNestedExtractionsPending);
                    q0 q0Var = new q0(a1VarQ.get_size());
                    Object[] objArr = a1VarQ.content;
                    int i16 = a1VarQ._size;
                    for (int i17 = 0; i17 < i16; i17++) {
                        s2 s2Var = (s2) objArr[i17];
                        q0Var.n(y.a(s2Var, this.movableContentStatesAvailable.e(s2Var)));
                    }
                    this.movableContentStatesAvailable.k();
                    a1VarF = q0Var;
                } else {
                    a1VarF = b1.f();
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
        Object[] objArr2 = a1VarF.content;
        int i18 = a1VarF._size;
        for (i15 = 0; i15 < i18; i15++) {
            r rVar = (r) objArr2[i15];
            s2 s2Var2 = (s2) rVar.a();
            r2 r2Var = (r2) rVar.b();
            if (r2Var != null) {
                s2Var2.getComposition().p(r2Var);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 r0(final p4 p4Var, final Throwable th4) {
        n<? super i0> nVar;
        n<? super i0> nVar2;
        CancellationException cancellationExceptionA = r1.a("Recomposer effect job completed", th4);
        synchronized (p4Var.stateLock) {
            try {
                d2 d2Var = p4Var.runnerJob;
                nVar = null;
                if (d2Var != null) {
                    p4Var._state.setValue(d.ShuttingDown);
                    if (p4Var.isClosed) {
                        nVar2 = p4Var.workContinuation;
                        if (nVar2 != null) {
                        }
                        p4Var.workContinuation = null;
                        d2Var.C0(new er.l() { // from class: m2.n4
                            @Override // er.l
                            public final Object b(Object obj) {
                                return p4.s0(this.f123022a, th4, (Throwable) obj);
                            }
                        });
                        nVar = nVar2;
                    } else {
                        d2Var.u(cancellationExceptionA);
                    }
                    nVar2 = null;
                    p4Var.workContinuation = null;
                    d2Var.C0(new er.l() { // from class: m2.n4
                        @Override // er.l
                        public final Object b(Object obj) {
                            return p4.s0(this.f123022a, th4, (Throwable) obj);
                        }
                    });
                    nVar = nVar2;
                } else {
                    p4Var.closeCause = cancellationExceptionA;
                    p4Var._state.setValue(d.ShutDown);
                    i0 i0Var = i0.f148189a;
                }
            } catch (Throwable th5) {
                throw th5;
            }
        }
        if (nVar != null) {
            t.Companion companion = t.INSTANCE;
            nVar.i(t.b(i0.f148189a));
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 s0(p4 p4Var, Throwable th4, Throwable th5) {
        synchronized (p4Var.stateLock) {
            if (th4 == null) {
                th4 = null;
            } else if (th5 != null) {
                try {
                    if (th5 instanceof CancellationException) {
                        th5 = null;
                    }
                    if (th5 != null) {
                        oq.c.a(th4, th5);
                    }
                } catch (Throwable th6) {
                    throw th6;
                }
            }
            p4Var.closeCause = th4;
            p4Var._state.setValue(d.ShutDown);
        }
        return i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v0() {
        boolean zW0;
        synchronized (this.stateLock) {
            zW0 = w0();
        }
        return zW0;
    }

    private final boolean w0() {
        return !this.frameClockPaused && this.broadcastFrameClock.d();
    }

    private final boolean x0() {
        return this.compositionInvalidations.getSize() != 0 || w0() || y0() || n2.b.k(this.movableContentRemoved);
    }

    private final boolean y0() {
        return !this.frameClockPaused && this.nextFrameEndCallbackQueue.c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean z0() {
        boolean z15;
        synchronized (this.stateLock) {
            z15 = this.snapshotInvalidations.f() || this.compositionInvalidations.getSize() != 0 || w0() || y0();
        }
        return z15;
    }

    public final Object B0(tq.e<? super i0> eVar) {
        Object objY = mu.i.y(u0(), new e(null), eVar);
        return objY == uq.b.e() ? objY : i0.f148189a;
    }

    public final void G0() {
        synchronized (this.stateLock) {
            this.frameClockPaused = true;
            i0 i0Var = i0.f148189a;
        }
    }

    public final void W0() {
        n<i0> nVarP0;
        synchronized (this.stateLock) {
            if (this.frameClockPaused) {
                this.frameClockPaused = false;
                nVarP0 = p0();
            } else {
                nVarP0 = null;
            }
        }
        if (nVarP0 != null) {
            t.Companion companion = t.INSTANCE;
            nVarP0.i(t.b(i0.f148189a));
        }
    }

    public final Object X0(tq.e<? super i0> eVar) {
        Object objQ0 = Q0(new g(null), eVar);
        return objQ0 == uq.b.e() ? objQ0 : i0.f148189a;
    }

    @Override // p076m2.v
    public void a(l0 composition, er.p<? super r, ? super Integer, i0> content) throws Throwable {
        Throwable th4;
        boolean z15;
        Throwable th5;
        boolean zS = composition.s();
        synchronized (this.stateLock) {
            try {
                d value = this._state.getValue();
                d dVar = d.ShuttingDown;
                if (value.compareTo(dVar) > 0) {
                    try {
                        boolean zContains = D0().contains(composition);
                        z15 = !zContains;
                        if (!zContains) {
                            T0(composition);
                        }
                    } catch (Throwable th6) {
                        th4 = th6;
                        throw th4;
                    }
                } else {
                    z15 = true;
                }
                try {
                    l.Companion companion = l.INSTANCE;
                    c3.d dVarN = companion.n(O0(composition), Z0(composition, null));
                    try {
                        l lVarL = dVarN.l();
                        try {
                            composition.d(content);
                            i0 i0Var = i0.f148189a;
                            dVarN.s(lVarL);
                            j0(dVarN);
                            synchronized (this.stateLock) {
                                try {
                                    if (this._state.getValue().compareTo(dVar) > 0) {
                                        try {
                                            if (!D0().contains(composition)) {
                                                i0(composition);
                                            }
                                        } catch (Throwable th7) {
                                            th5 = th7;
                                            throw th5;
                                        }
                                    } else {
                                        Y0(composition);
                                    }
                                    if (!zS) {
                                        companion.f();
                                    }
                                    try {
                                        H0(composition);
                                        try {
                                            composition.r();
                                            composition.b();
                                            if (zS) {
                                                return;
                                            }
                                            companion.f();
                                        } catch (Throwable th8) {
                                            N0(this, th8, null, false, 6, null);
                                        }
                                    } catch (Throwable th9) {
                                        M0(th9, composition, true);
                                    }
                                } catch (Throwable th10) {
                                    th5 = th10;
                                }
                            }
                        } catch (Throwable th11) {
                            try {
                                dVarN.s(lVarL);
                                throw th11;
                            } catch (Throwable th12) {
                                th = th12;
                                Throwable th13 = th;
                                try {
                                    j0(dVarN);
                                    throw th13;
                                } catch (Throwable th14) {
                                    th = th14;
                                    Throwable th15 = th;
                                    if (z15) {
                                        synchronized (this.stateLock) {
                                            Y0(composition);
                                            i0 i0Var2 = i0.f148189a;
                                        }
                                    }
                                    M0(th15, composition, true);
                                }
                            }
                        }
                    } catch (Throwable th16) {
                        th = th16;
                    }
                } catch (Throwable th17) {
                    th = th17;
                    this = this;
                }
            } catch (Throwable th18) {
                th4 = th18;
            }
        }
    }

    @Override // p076m2.v
    public h1<f4> b(l0 composition, e5 shouldPause, er.p<? super r, ? super Integer, i0> content) {
        try {
            e5 e5VarY = composition.y(shouldPause);
            try {
                a(composition, content);
                h1<f4> h1VarA = (u0) this.pausedScopes.a();
                if (h1VarA == null) {
                    h1VarA = i1.a();
                }
                composition.y(e5VarY);
                this.pausedScopes.b(null);
                return h1VarA;
            } catch (Throwable th4) {
                composition.y(e5VarY);
                throw th4;
            }
        } catch (Throwable th5) {
            this.pausedScopes.b(null);
            throw th5;
        }
    }

    @Override // p076m2.v
    public void c(s2 reference) {
        n<i0> nVarP0;
        synchronized (this.stateLock) {
            try {
                n2.b.a(this.movableContentRemoved, reference.c(), reference);
                if (reference.f() != null) {
                    o0(this, reference, reference);
                }
                nVarP0 = p0();
            } catch (Throwable th4) {
                throw th4;
            }
        }
        if (nVarP0 != null) {
            t.Companion companion = t.INSTANCE;
            nVarP0.i(t.b(i0.f148189a));
        }
    }

    @Override // p076m2.v
    public boolean e() {
        return G.get().booleanValue();
    }

    @Override // p076m2.v
    /* JADX INFO: renamed from: f */
    public boolean getCollectingParameterInformation() {
        return false;
    }

    @Override // p076m2.v
    /* JADX INFO: renamed from: g */
    public boolean getCollectingSourceInformation() {
        return e3.f.d(t.e(), e3.f.INSTANCE.b());
    }

    @Override // p076m2.v
    /* JADX INFO: renamed from: h */
    public long getCompositeKeyHashCode() {
        return 1000;
    }

    @Override // p076m2.v
    public u i() {
        return null;
    }

    @Override // p076m2.v
    /* JADX INFO: renamed from: k, reason: from getter */
    public i getEffectCoroutineContext() {
        return this.effectCoroutineContext;
    }

    @Override // p076m2.v
    public boolean m() {
        return !e3.f.d(t.e(), e3.f.INSTANCE.a());
    }

    public final void m0() {
        synchronized (this.stateLock) {
            try {
                if (this._state.getValue().compareTo(d.Idle) >= 0) {
                    this._state.setValue(d.ShuttingDown);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
        d2.a.a(this.effectJob, null, 1, null);
    }

    @Override // p076m2.v
    public void n(s2 reference) {
        n<i0> nVarP0;
        synchronized (this.stateLock) {
            this.movableContentAwaitingInsert.add(reference);
            nVarP0 = p0();
        }
        if (nVarP0 != null) {
            t.Companion companion = t.INSTANCE;
            nVarP0.i(t.b(i0.f148189a));
        }
    }

    @Override // p076m2.v
    public void o(l0 composition) {
        n<i0> nVarP0;
        synchronized (this.stateLock) {
            if (this.compositionInvalidations.k(composition)) {
                nVarP0 = null;
            } else {
                this.compositionInvalidations.d(composition);
                nVarP0 = p0();
            }
        }
        if (nVarP0 != null) {
            t.Companion companion = t.INSTANCE;
            nVarP0.i(t.b(i0.f148189a));
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x006f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0071 A[Catch: all -> 0x0067, LOOP:0: B:9:0x0031->B:21:0x0071, LOOP_END, TryCatch #0 {all -> 0x0067, blocks: (B:4:0x0007, B:6:0x001a, B:9:0x0031, B:11:0x0041, B:13:0x004d, B:15:0x0056, B:18:0x0069, B:21:0x0071, B:22:0x0074), top: B:27:0x0007 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[EDGE_INSN: B:30:0x0074->B:22:0x0074 BREAK  A[LOOP:0: B:9:0x0031->B:21:0x0071], SYNTHETIC] */
    @Override // p076m2.v
    public void p(s2 reference, r2 data, p076m2.c<?> applier) {
        synchronized (this.stateLock) {
            try {
                this.movableContentStatesAvailable.x(reference, data);
                a1<s2> a1VarH = n2.b.h(this.movableContentNestedExtractionsPending, reference);
                if (a1VarH.h()) {
                    f1<s2, r2> f1VarL = data.getSlotStorage().l(applier, a1VarH);
                    Object[] objArr = f1VarL.keys;
                    Object[] objArr2 = f1VarL.values;
                    long[] jArr = f1VarL.metadata;
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
                                        int i18 = (i15 << 3) + i17;
                                        Object obj = objArr[i18];
                                        this.movableContentStatesAvailable.x((s2) obj, (r2) objArr2[i18]);
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
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p076m2.v
    public r2 q(s2 reference) {
        r2 r2VarU;
        synchronized (this.stateLock) {
            r2VarU = this.movableContentStatesAvailable.u(reference);
        }
        return r2VarU;
    }

    @Override // p076m2.v
    public h1<f4> r(l0 composition, e5 shouldPause, h1<f4> invalidScopes) {
        try {
            R0();
            composition.o(n2.f.a(invalidScopes));
            e5 e5VarY = composition.y(shouldPause);
            try {
                l0 l0VarK0 = K0(composition, null);
                if (l0VarK0 != null) {
                    H0(composition);
                    l0VarK0.r();
                    l0VarK0.b();
                }
                h1<f4> h1VarA = (u0) this.pausedScopes.a();
                if (h1VarA == null) {
                    h1VarA = i1.a();
                }
                composition.y(e5VarY);
                this.pausedScopes.b(null);
                return h1VarA;
            } catch (Throwable th4) {
                composition.y(e5VarY);
                throw th4;
            }
        } catch (Throwable th5) {
            this.pausedScopes.b(null);
            throw th5;
        }
    }

    @Override // p076m2.v
    public void s(Set<e3.h> table) {
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public final long getChangeCount() {
        return this.changeCount;
    }

    @Override // p076m2.v
    public void u(f4 scope) {
        u0<f4> u0VarA = this.pausedScopes.a();
        if (u0VarA == null) {
            u0VarA = i1.b();
            this.pausedScopes.b(u0VarA);
        }
        u0VarA.i(scope);
    }

    public final mu.p0<d> u0() {
        return this._state;
    }

    @Override // p076m2.v
    public void v(l0 composition) {
        synchronized (this.stateLock) {
            try {
                u0<l0> u0VarB = this.compositionsRemoved;
                if (u0VarB == null) {
                    u0VarB = i1.b();
                    this.compositionsRemoved = u0VarB;
                }
                u0VarB.i(composition);
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p076m2.v
    public p076m2.g w(er.a<i0> action) {
        return this.nextFrameEndCallbackQueue.g(action);
    }

    @Override // p076m2.v
    public void z(l0 composition) {
        synchronized (this.stateLock) {
            V0(composition);
            this.compositionInvalidations.t(composition);
            this.compositionsAwaitingApply.remove(composition);
            i0 i0Var = i0.f148189a;
        }
    }
}
