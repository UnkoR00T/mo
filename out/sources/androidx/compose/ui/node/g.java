package androidx.compose.ui.node;

import android.view.View;
import androidx.compose.ui.platform.f3;
import androidx.compose.ui.platform.y1;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import c5.t;
import g4.a1;
import g4.b1;
import g4.c1;
import g4.f1;
import g4.g0;
import g4.n0;
import g4.p0;
import g4.s;
import g4.s0;
import g4.t0;
import g4.w;
import g4.y;
import g4.z;
import java.util.Comparator;
import java.util.List;
import n3.h1;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.ModifierInfo;
import p036e4.a2;
import p036e4.b0;
import p036e4.f2;
import p036e4.i0;
import p036e4.o0;
import p036e4.v;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.e0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000î\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0001\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\r\b\u0001\u0018\u0000 ý\u00022\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0007«\u0001¢\u0001R¯\u0001B\u001b\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0019\u0010\u001e\u001a\u00020\u00142\b\b\u0002\u0010\u001d\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u0011J\u0017\u0010&\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0011J\u000f\u0010)\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010\u0011J\u000f\u0010*\u001a\u00020\u000fH\u0000¢\u0006\u0004\b*\u0010\u0011J\u0017\u0010-\u001a\n\u0018\u00010+j\u0004\u0018\u0001`,H\u0017¢\u0006\u0004\b-\u0010.J\u001f\u00100\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0000H\u0000¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u000fH\u0000¢\u0006\u0004\b2\u0010\u0011J\u001f\u00104\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000fH\u0000¢\u0006\u0004\b6\u0010\u0011J'\u00109\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\u000b2\u0006\u00108\u001a\u00020\u000b2\u0006\u00103\u001a\u00020\u000bH\u0000¢\u0006\u0004\b9\u0010:J\u000f\u0010;\u001a\u00020\tH\u0016¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\u000fH\u0000¢\u0006\u0004\b=\u0010\u0011J\u000f\u0010>\u001a\u00020\u000fH\u0000¢\u0006\u0004\b>\u0010\u0011J\u0017\u0010A\u001a\u00020\u000f2\u0006\u0010@\u001a\u00020?H\u0000¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010\u0011J\u000f\u0010D\u001a\u00020\u0014H\u0016¢\u0006\u0004\bD\u0010EJ\u0015\u0010G\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bG\u0010HJ\u0015\u0010J\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bJ\u0010HJ\u0015\u0010K\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bK\u0010HJ\u0015\u0010L\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bL\u0010HJ\u0015\u0010M\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bM\u0010HJ\u0015\u0010N\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bN\u0010HJ\u0015\u0010O\u001a\u00020\u000b2\u0006\u0010F\u001a\u00020\u000b¢\u0006\u0004\bO\u0010HJ\u0015\u0010P\u001a\u00020\u000b2\u0006\u0010I\u001a\u00020\u000b¢\u0006\u0004\bP\u0010HJ\u0015\u0010T\u001a\u00020S2\u0006\u0010R\u001a\u00020Q¢\u0006\u0004\bT\u0010UJ\u000f\u0010V\u001a\u00020\u000fH\u0000¢\u0006\u0004\bV\u0010\u0011J\u000f\u0010W\u001a\u00020\u000fH\u0000¢\u0006\u0004\bW\u0010\u0011J\u001f\u0010Z\u001a\u00020\u000f2\u0006\u0010X\u001a\u00020\u000b2\u0006\u0010Y\u001a\u00020\u000bH\u0000¢\u0006\u0004\bZ\u00105J\u000f\u0010[\u001a\u00020\u000fH\u0000¢\u0006\u0004\b[\u0010\u0011J\u000f\u0010\\\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\\\u0010\u0011J!\u0010a\u001a\u00020\u000f2\u0006\u0010^\u001a\u00020]2\b\u0010`\u001a\u0004\u0018\u00010_H\u0000¢\u0006\u0004\ba\u0010bJ3\u0010j\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020e2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020\tH\u0000¢\u0006\u0004\bj\u0010kJ3\u0010m\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020c2\u0006\u0010l\u001a\u00020e2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020\tH\u0000¢\u0006\u0004\bm\u0010kJ\u0017\u0010o\u001a\u00020\u000f2\u0006\u0010n\u001a\u00020\u0000H\u0000¢\u0006\u0004\bo\u0010\u0019J-\u0010s\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\t2\b\b\u0002\u0010q\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\tH\u0000¢\u0006\u0004\bs\u0010tJ-\u0010u\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\t2\b\b\u0002\u0010q\u001a\u00020\t2\b\b\u0002\u0010r\u001a\u00020\tH\u0000¢\u0006\u0004\bu\u0010tJ\u000f\u0010v\u001a\u00020\u000fH\u0000¢\u0006\u0004\bv\u0010\u0011J\u000f\u0010w\u001a\u00020\u000fH\u0000¢\u0006\u0004\bw\u0010\u0011J\u0017\u0010z\u001a\u00020\u000f2\u0006\u0010y\u001a\u00020xH\u0000¢\u0006\u0004\bz\u0010{J\u0019\u0010|\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\tH\u0000¢\u0006\u0004\b|\u0010}J\u0019\u0010~\u001a\u00020\u000f2\b\b\u0002\u0010p\u001a\u00020\tH\u0000¢\u0006\u0004\b~\u0010}J\u000f\u0010\u007f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u007f\u0010\u0011J\u001a\u0010\u0082\u0001\u001a\n\u0012\u0005\u0012\u00030\u0081\u00010\u0080\u0001H\u0016¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0011\u0010\u0084\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0084\u0001\u0010\u0011J \u0010\u0087\u0001\u001a\u00020\t2\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0000¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J \u0010\u0089\u0001\u001a\u00020\t2\f\b\u0002\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0085\u0001H\u0000¢\u0006\u0006\b\u0089\u0001\u0010\u0088\u0001J\u0011\u0010\u008a\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008a\u0001\u0010\u0011J\u0011\u0010\u008b\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008b\u0001\u0010\u0011J\u0011\u0010\u008c\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u008c\u0001\u0010\u0011J\u000f\u0010\u008d\u0001\u001a\u00020\u000f¢\u0006\u0005\b\u008d\u0001\u0010\u0011J\u001a\u0010\u008f\u0001\u001a\u00020\u000f2\t\b\u0002\u0010\u008e\u0001\u001a\u00020\t¢\u0006\u0005\b\u008f\u0001\u0010}J\u0011\u0010\u0090\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0090\u0001\u0010\u0011J\u0011\u0010\u0091\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0091\u0001\u0010\u0011J\u0011\u0010\u0092\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0092\u0001\u0010\u0011J\u0011\u0010\u0093\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0093\u0001\u0010\u0011J\u0011\u0010\u0094\u0001\u001a\u00020\u000fH\u0000¢\u0006\u0005\b\u0094\u0001\u0010\u0011J\u0011\u0010\u0095\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0095\u0001\u0010\u0011J\u0011\u0010\u0096\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0096\u0001\u0010\u0011J\u0011\u0010\u0097\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0005\b\u0097\u0001\u0010\u0011R\u0016\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0097\u0001\u0010\u0098\u0001R'\u0010\f\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b\u0099\u0001\u0010\u007f\u001a\u0006\b\u009a\u0001\u0010\u009b\u0001\"\u0006\b\u009c\u0001\u0010\u009d\u0001R'\u0010 \u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b\u009e\u0001\u0010\u0098\u0001\u001a\u0005\b\u0098\u0001\u0010<\"\u0005\b\u009f\u0001\u0010}R)\u0010§\u0001\u001a\u00030¡\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b¢\u0001\u0010a\u001a\u0006\b£\u0001\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R&\u0010ª\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bR\u0010\u0098\u0001\u001a\u0005\b¨\u0001\u0010<\"\u0005\b©\u0001\u0010}R'\u0010®\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b«\u0001\u0010\u0098\u0001\u001a\u0005\b¬\u0001\u0010<\"\u0005\b\u00ad\u0001\u0010}R'\u0010²\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¯\u0001\u0010\u0098\u0001\u001a\u0005\b°\u0001\u0010<\"\u0005\b±\u0001\u0010}R(\u0010µ\u0001\u001a\u00020\u000b8\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0005\b³\u0001\u0010\u007f\u001a\u0006\b´\u0001\u0010\u009b\u0001\"\u0006\b¯\u0001\u0010\u009d\u0001R'\u0010¹\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¶\u0001\u0010\u0098\u0001\u001a\u0005\b·\u0001\u0010<\"\u0005\b¸\u0001\u0010}R5\u0010¿\u0001\u001a\u0004\u0018\u00010\u00002\t\u0010º\u0001\u001a\u0004\u0018\u00010\u00008\u0000@BX\u0080\u000e¢\u0006\u0017\n\u0006\b\u0091\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0005\b¾\u0001\u0010\u0019R\u0018\u0010Á\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÀ\u0001\u0010\u007fR\u001e\u0010Å\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Â\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÃ\u0001\u0010Ä\u0001R\"\u0010È\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010Æ\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009a\u0001\u0010Ç\u0001R\u0019\u0010Ê\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÉ\u0001\u0010\u0098\u0001R\u001b\u0010Ë\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0092\u0001\u0010»\u0001R-\u0010@\u001a\u0004\u0018\u00010?2\t\u0010Ì\u0001\u001a\u0004\u0018\u00010?8\u0000@BX\u0080\u000e¢\u0006\u0010\n\u0006\bÍ\u0001\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010Ð\u0001R3\u0010Ù\u0001\u001a\f\u0018\u00010Ñ\u0001j\u0005\u0018\u0001`Ò\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001\"\u0006\b×\u0001\u0010Ø\u0001R&\u0010\u001d\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0004\b;\u0010\u007f\u001a\u0006\bÚ\u0001\u0010\u009b\u0001\"\u0006\bÛ\u0001\u0010\u009d\u0001R\u0019\u0010Ý\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÜ\u0001\u0010\u0098\u0001R'\u0010á\u0001\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\bÞ\u0001\u0010\u0098\u0001\u001a\u0005\bß\u0001\u0010<\"\u0005\bà\u0001\u0010}R\u001a\u0010ã\u0001\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bX\u0010â\u0001R\u0018\u0010ä\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bY\u0010\u0098\u0001R\u001e\u0010æ\u0001\u001a\t\u0012\u0004\u0012\u00020\u00000Æ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bå\u0001\u0010Ç\u0001R\u0018\u0010ç\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b&\u0010\u0098\u0001R3\u0010í\u0001\u001a\u00030è\u00012\b\u0010Ì\u0001\u001a\u00030è\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\bA\u0010é\u0001\u001a\u0006\bê\u0001\u0010ë\u0001\"\u0006\b¶\u0001\u0010ì\u0001R\u001a\u0010ï\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u001b\u0010î\u0001R4\u0010õ\u0001\u001a\u00030ð\u00012\b\u0010Ì\u0001\u001a\u00030ð\u00018\u0016@VX\u0096\u000e¢\u0006\u0018\n\u0006\b\u0093\u0001\u0010ñ\u0001\u001a\u0006\bò\u0001\u0010ó\u0001\"\u0006\b\u0099\u0001\u0010ô\u0001R3\u0010û\u0001\u001a\u00030ö\u00012\b\u0010Ì\u0001\u001a\u00030ö\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b)\u0010÷\u0001\u001a\u0006\bø\u0001\u0010ù\u0001\"\u0006\b¢\u0001\u0010ú\u0001R3\u0010\u0081\u0002\u001a\u00030ü\u00012\b\u0010Ì\u0001\u001a\u00030ü\u00018\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0005\b\u001e\u0010ý\u0001\u001a\u0006\bþ\u0001\u0010ÿ\u0001\"\u0006\bÀ\u0001\u0010\u0080\u0002R3\u0010\u0088\u0002\u001a\u00030\u0082\u00022\b\u0010Ì\u0001\u001a\u00030\u0082\u00028\u0016@VX\u0096\u000e¢\u0006\u0017\n\u0006\b\u0083\u0002\u0010\u0084\u0002\u001a\u0006\b\u0085\u0002\u0010\u0086\u0002\"\u0005\bR\u0010\u0087\u0002R)\u0010\u008f\u0002\u001a\u00030\u0089\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bC\u0010\u008a\u0002\u001a\u0006\b\u008b\u0002\u0010\u008c\u0002\"\u0006\b\u008d\u0002\u0010\u008e\u0002R\u0019\u0010\u0090\u0002\u001a\u00030\u0089\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u008a\u0002R-\u0010\u0094\u0002\u001a\u00020\t8\u0000@\u0000X\u0081\u000e¢\u0006\u001c\n\u0005\b\u0015\u0010\u0098\u0001\u0012\u0005\b\u0093\u0002\u0010\u0011\u001a\u0005\b\u0091\u0002\u0010<\"\u0005\b\u0092\u0002\u0010}R \u0010\u0099\u0002\u001a\u00030\u0095\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010\u0096\u0002\u001a\u0006\b\u0097\u0002\u0010\u0098\u0002R \u0010\u009b\u0002\u001a\u00030\u009a\u00028\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u009b\u0002\u0010\u009c\u0002\u001a\u0006\b\u009d\u0002\u0010\u009e\u0002R,\u0010¥\u0002\u001a\u0005\u0018\u00010\u009f\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0091\u0002\u0010 \u0002\u001a\u0006\b¡\u0002\u0010¢\u0002\"\u0006\b£\u0002\u0010¤\u0002R\u001b\u0010¨\u0002\u001a\u0004\u0018\u00010x8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R'\u0010¬\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b©\u0002\u0010\u0098\u0001\u001a\u0005\bª\u0002\u0010<\"\u0005\b«\u0002\u0010}R\u0019\u0010®\u0002\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u00ad\u0002R\u001b\u0010°\u0002\u001a\u0004\u0018\u00010$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¯\u0002\u0010\u00ad\u0002R8\u0010¸\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010±\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b²\u0002\u0010³\u0002\u001a\u0006\b´\u0002\u0010µ\u0002\"\u0006\b¶\u0002\u0010·\u0002R8\u0010»\u0002\u001a\u0011\u0012\u0004\u0012\u00020?\u0012\u0004\u0012\u00020\u000f\u0018\u00010±\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010³\u0002\u001a\u0006\b¹\u0002\u0010µ\u0002\"\u0006\bº\u0002\u0010·\u0002R'\u0010¿\u0002\u001a\u00020\t8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0006\b¼\u0002\u0010\u0098\u0001\u001a\u0005\b½\u0002\u0010<\"\u0005\b¾\u0002\u0010}R1\u0010Á\u0002\u001a\u00020\u000b2\u0007\u0010Ì\u0001\u001a\u00020\u000b8\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bê\u0001\u0010\u007f\u001a\u0006\b¯\u0002\u0010\u009b\u0001\"\u0006\bÀ\u0002\u0010\u009d\u0001R)\u0010Ã\u0002\u001a\u00020\t2\u0007\u0010Ì\u0001\u001a\u00020\t8\u0016@RX\u0096\u000e¢\u0006\u000f\n\u0006\bÂ\u0002\u0010\u0098\u0001\u001a\u0005\bÓ\u0001\u0010<R\u001a\u0010Ç\u0002\u001a\u0005\u0018\u00010Ä\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÅ\u0002\u0010Æ\u0002R\u0018\u0010Ë\u0002\u001a\u00030È\u00028BX\u0082\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010Ê\u0002R\u0016\u0010Î\u0002\u001a\u0004\u0018\u00010\t8F¢\u0006\b\u001a\u0006\bÌ\u0002\u0010Í\u0002R\u001e\u0010Ð\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÏ\u0002\u0010\u0083\u0001R\u001f\u0010Ó\u0002\u001a\n\u0012\u0005\u0012\u00030Ñ\u00020\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÒ\u0002\u0010\u0083\u0001R\u001f\u0010Ô\u0002\u001a\n\u0012\u0005\u0012\u00030Ñ\u00020\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b¦\u0002\u0010\u0083\u0001R\u001e\u0010×\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000Æ\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0002\u0010Ö\u0002R\u001e\u0010Ø\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000\u0080\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\b©\u0002\u0010\u0083\u0001R\u0019\u0010Ú\u0002\u001a\u0004\u0018\u00010\u00008@X\u0080\u0004¢\u0006\b\u001a\u0006\bÙ\u0002\u0010½\u0001R\u0016\u0010Û\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010<R\u0018\u0010ß\u0002\u001a\u00030Ü\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÝ\u0002\u0010Þ\u0002R\u001a\u0010ã\u0002\u001a\u0005\u0018\u00010à\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bá\u0002\u0010â\u0002R\u0018\u0010ç\u0002\u001a\u00030ä\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bå\u0002\u0010æ\u0002R\u0018\u0010è\u0002\u001a\u0004\u0018\u00010\u001a8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010\u001cR%\u0010ë\u0002\u001a\t\u0012\u0004\u0012\u00020\u00000Æ\u00018@X\u0081\u0004¢\u0006\u000f\u0012\u0005\bê\u0002\u0010\u0011\u001a\u0006\bé\u0002\u0010Ö\u0002R\u0016\u0010í\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bì\u0002\u0010<R\u0016\u0010î\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b²\u0002\u0010<R\u0016\u0010I\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bï\u0002\u0010\u009b\u0001R\u0016\u0010F\u001a\u00020\u000b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bð\u0002\u0010\u009b\u0001R\u0016\u0010ò\u0002\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bñ\u0002\u0010<R\u0018\u0010ö\u0002\u001a\u00030ó\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bô\u0002\u0010õ\u0002R\u0016\u0010÷\u0002\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÉ\u0001\u0010<R\u0013\u0010ù\u0002\u001a\u00020\t8F¢\u0006\u0007\u001a\u0005\bø\u0002\u0010<R\u0017\u0010û\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bú\u0002\u0010\u009b\u0001R\u0018\u0010ü\u0002\u001a\u00030\u0089\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÂ\u0002\u0010\u008c\u0002R\u0018\u0010þ\u0002\u001a\u00030\u0089\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bý\u0002\u0010\u008c\u0002R\u0017\u0010\u0081\u0003\u001a\u00020x8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÿ\u0002\u0010\u0080\u0003R\u0017\u0010\u0083\u0003\u001a\u00020x8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0082\u0003\u0010\u0080\u0003R\u0019\u0010\u0085\u0003\u001a\u0004\u0018\u00010x8@X\u0080\u0004¢\u0006\b\u001a\u0006\b\u0084\u0003\u0010\u0080\u0003R\u0016\u0010\u0087\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0003\u0010<R(\u0010%\u001a\u00020$2\u0007\u0010Ì\u0001\u001a\u00020$8V@VX\u0096\u000e¢\u0006\u000f\u001a\u0006\b\u0088\u0003\u0010\u0089\u0003\"\u0005\b\u008a\u0003\u0010'R\u0018\u0010\u008d\u0003\u001a\u00030\u008b\u00038VX\u0096\u0004¢\u0006\b\u001a\u0006\bÃ\u0001\u0010\u008c\u0003R\u0016\u0010\u008f\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0003\u0010<R\u0016\u0010\u0090\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b¼\u0002\u0010<R\u0016\u0010\u0092\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0091\u0003\u0010<R\u0016\u0010\u0094\u0003\u001a\u00020\t8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0003\u0010<R\u0019\u0010\u0096\u0003\u001a\u0004\u0018\u00010\u00058VX\u0096\u0004¢\u0006\b\u001a\u0006\b³\u0001\u0010\u0095\u0003R\u001e\u0010\u0097\u0003\u001a\t\u0012\u0004\u0012\u00020\u00050\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÍ\u0001\u0010\u0083\u0001¨\u0006\u0098\u0003"}, d2 = {"Landroidx/compose/ui/node/g;", "Lm2/n;", "Le4/f2;", "Lg4/b1;", "Le4/i0;", "Ln4/r;", "Landroidx/compose/ui/node/c;", "", "Landroidx/compose/ui/node/Owner$b;", "", "isVirtual", "", "semanticsId", "<init>", "(ZI)V", "Loq/i0;", "z1", "()V", "a1", "instance", "", "K", "(Landroidx/compose/ui/node/g;)Ljava/lang/String;", "child", "u1", "(Landroidx/compose/ui/node/g;)V", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "C", "()Landroidx/compose/ui/semantics/SemanticsConfiguration;", "depth", "F", "(I)Ljava/lang/String;", "Lg4/w;", "x0", "()Lg4/w;", "w1", "Lf3/m;", "modifier", "A", "(Lf3/m;)V", "Q1", "E", "l2", "Landroid/view/View;", "Landroidx/compose/ui/viewinterop/InteropView;", "d0", "()Landroid/view/View;", "index", "Q0", "(ILandroidx/compose/ui/node/g;)V", "x1", "count", "D1", "(II)V", "C1", "from", "to", "t1", "(III)V", "t", "()Z", "F1", "Z0", "Landroidx/compose/ui/node/Owner;", "owner", "B", "(Landroidx/compose/ui/node/Owner;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "toString", "()Ljava/lang/String;", "height", "s1", "(I)I", "width", "r1", "o1", "n1", "q1", "p1", "m1", "l1", "", "e", "", "S1", "(Ljava/lang/Throwable;)Ljava/lang/Void;", "T0", "Y0", "x", "y", "y1", "E1", "g1", "Ln3/h1;", "canvas", "Lq3/c;", "graphicsLayer", "J", "(Ln3/h1;Lq3/c;)V", "Lm3/e;", "pointerPosition", "Lg4/t;", "hitTestResult", "La4/p0;", "pointerType", "isInLayer", "M0", "(JLg4/t;IZ)V", "hitSemanticsEntities", "O0", "it", "P1", "forceRequest", "scheduleMeasureAndLayout", "invalidateIntrinsics", "N1", "(ZZZ)V", "I1", "W0", "X0", "Landroidx/compose/ui/node/NodeCoordinator;", "coordinator", "v1", "(Landroidx/compose/ui/node/NodeCoordinator;)V", "L1", "(Z)V", "G1", "I", "", "Le4/b1;", "u0", "()Ljava/util/List;", "U0", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "e1", "(Lc5/b;)Z", "A1", "h1", "k1", "i1", "V0", "isRootOfInvalidation", "R0", "j1", "k", "q", ip.a.f96138c, "R1", "o", "i", "a", "Z", "b", "n", "()I", "h2", "(I)V", "c", "W1", "hasPositionalLayerTransformationsInOffsetFromRoot", "Lc5/n;", "d", "z0", "()J", "e2", "(J)V", "outerToInnerOffset", "A0", "f2", "outerToInnerOffsetDirty", "f", "E0", "g2", "rectInParentDirty", "g", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "T1", "addedToRectList", "h", ip.a.f96137b, "compositeKeyHash", "j", "d1", "k2", "isVirtualLookaheadRoot", "newRoot", "Landroidx/compose/ui/node/g;", "m0", "()Landroidx/compose/ui/node/g;", "a2", "lookaheadRoot", "l", "virtualChildrenCount", "Lg4/n0;", "m", "Lg4/n0;", "_foldedChildren", "Ln2/c;", "Ln2/c;", "_unfoldedChildren", "p", "unfoldedVirtualChildrenListDirty", "_foldedParent", "value", "r", "Landroidx/compose/ui/node/Owner;", "B0", "()Landroidx/compose/ui/node/Owner;", "Landroidx/compose/ui/viewinterop/b;", "Landroidx/compose/ui/viewinterop/InteropViewFactoryHolder;", "s", "Landroidx/compose/ui/viewinterop/b;", "e0", "()Landroidx/compose/ui/viewinterop/b;", "Y1", "(Landroidx/compose/ui/viewinterop/b;)V", "interopViewFactoryHolder", "V", "setDepth$ui", "v", "ignoreRemeasureRequests", "w", "isSemanticsInvalidated$ui", "i2", "isSemanticsInvalidated", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "_semanticsConfiguration", "isCurrentlyCalculatingSemanticsConfiguration", "z", "_zSortedChildren", "zSortedChildrenInvalidated", "Le4/w0;", "Le4/w0;", "q0", "()Le4/w0;", "(Le4/w0;)V", "measurePolicy", "Lg4/w;", "intrinsicsPolicy", "Lc5/d;", "Lc5/d;", "U", "()Lc5/d;", "(Lc5/d;)V", "density", "Lc5/t;", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "(Lc5/t;)V", "layoutDirection", "Landroidx/compose/ui/platform/f3;", "Landroidx/compose/ui/platform/f3;", "H0", "()Landroidx/compose/ui/platform/f3;", "(Landroidx/compose/ui/platform/f3;)V", "viewConfiguration", "Lm2/e0;", "G", "Lm2/e0;", "T", "()Lm2/e0;", "(Lm2/e0;)V", "compositionLocalMap", "Landroidx/compose/ui/node/g$g;", "Landroidx/compose/ui/node/g$g;", "f0", "()Landroidx/compose/ui/node/g$g;", "Z1", "(Landroidx/compose/ui/node/g$g;)V", "intrinsicsUsageByParent", "previousIntrinsicsUsageByParent", "O", "U1", "getCanMultiMeasure$ui$annotations", "canMultiMeasure", "Lg4/p0;", "Lg4/p0;", "w0", "()Lg4/p0;", "nodes", "Landroidx/compose/ui/node/h;", "layoutDelegate", "Landroidx/compose/ui/node/h;", "g0", "()Landroidx/compose/ui/node/h;", "Le4/o0;", "Le4/o0;", "F0", "()Le4/o0;", "j2", "(Le4/o0;)V", "subcompositionsState", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "Landroidx/compose/ui/node/NodeCoordinator;", "_innerLayerCoordinator", "R", "getInnerLayerCoordinatorIsDirty$ui", "X1", "innerLayerCoordinatorIsDirty", "Lf3/m;", "_modifier", "X", "pendingModifier", "Lkotlin/Function1;", "Y", "Ler/l;", "getOnAttach$ui", "()Ler/l;", "c2", "(Ler/l;)V", "onAttach", "getOnDetach$ui", "d2", "onDetach", "h0", "v0", "b2", "needsOnGloballyPositionedDispatch", "V1", "globallyPositionedObservers", "r0", "isDeactivated", "Le3/i;", "G0", "()Le3/i;", "traceContext", "", "J0", "()F", "zIndex", "c1", "()Ljava/lang/Boolean;", "isPlacedInLookahead", "W", "foldedChildren", "Le4/v0;", "Q", "childMeasurables", "childLookaheadMeasurables", "L0", "()Ln2/c;", "_children", "children", "C0", "parent", "isAttached", "Landroidx/compose/ui/node/g$e;", "i0", "()Landroidx/compose/ui/node/g$e;", "layoutState", "Landroidx/compose/ui/node/l;", "l0", "()Landroidx/compose/ui/node/l;", "lookaheadPassDelegate", "Landroidx/compose/ui/node/n;", "o0", "()Landroidx/compose/ui/node/n;", "measurePassDelegate", "semanticsConfiguration", "K0", "getZSortedChildren$annotations", "zSortedChildren", "K1", "isValidOwnerScope", "hasFixedInnerContentConstraints", "I0", "a0", "M", "alignmentLinesRequired", "Lg4/e0;", "n0", "()Lg4/e0;", "mDrawScope", "isPlaced", "b1", "isPlacedByParent", "D0", "placeOrder", "measuredByParent", "s0", "measuredByParentInLookahead", "b0", "()Landroidx/compose/ui/node/NodeCoordinator;", "innerCoordinator", "y0", "outerCoordinator", "c0", "innerLayerCoordinator", "N", "applyingModifierOnAttach", "t0", "()Lf3/m;", "u", "Le4/b0;", "()Le4/b0;", "coordinates", "p0", "measurePending", "layoutPending", "k0", "lookaheadMeasurePending", "j0", "lookaheadLayoutPending", "()Ln4/r;", "parentInfo", "childrenInfo", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g implements p076m2.n, f2, b1, i0, n4.r, androidx.compose.ui.node.c, Owner.b {

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public static final int f10090t0 = 8;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    private static final f f10091u0 = new c();

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    private static final er.a<g> f10092v0 = a.f10121b;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    private static final f3 f10093w0 = new b();

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    private static final Comparator<g> f10094x0 = new Comparator() { // from class: g4.c0
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return androidx.compose.ui.node.g.w((androidx.compose.ui.node.g) obj, (androidx.compose.ui.node.g) obj2);
        }
    };

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private boolean zSortedChildrenInvalidated;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private w0 measurePolicy;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private w intrinsicsPolicy;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private t layoutDirection;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private f3 viewConfiguration;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private e0 compositionLocalMap;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private EnumC0220g intrinsicsUsageByParent;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private EnumC0220g previousIntrinsicsUsageByParent;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private boolean canMultiMeasure;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final p0 nodes;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private o0 subcompositionsState;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private NodeCoordinator _innerLayerCoordinator;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private boolean innerLayerCoordinatorIsDirty;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private f3.m _modifier;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private f3.m pendingModifier;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private er.l<? super Owner, oq.i0> onAttach;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private er.l<? super Owner, oq.i0> onDetach;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final boolean isVirtual;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int semanticsId;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean hasPositionalLayerTransformationsInOffsetFromRoot;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private long outerToInnerOffset;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean outerToInnerOffsetDirty;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean rectInParentDirty;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean addedToRectList;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private int compositeKeyHash;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private boolean needsOnGloballyPositionedDispatch;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private boolean isVirtualLookaheadRoot;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private g lookaheadRoot;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int virtualChildrenCount;
    private final androidx.compose.ui.node.h layoutDelegate;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final n0<g> _foldedChildren;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private n2.c<g> _unfoldedChildren;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private boolean unfoldedVirtualChildrenListDirty;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private g _foldedParent;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private int globallyPositionedObservers;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private Owner owner;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private boolean isDeactivated;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.viewinterop.b interopViewFactoryHolder;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int depth;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean ignoreRemeasureRequests;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean isSemanticsInvalidated;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private SemanticsConfiguration _semanticsConfiguration;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private boolean isCurrentlyCalculatingSemanticsConfiguration;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final n2.c<g> _zSortedChildren;

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/node/g;", "c", "()Landroidx/compose/ui/node/g;"}, k = 3, mv = {2, 1, 0})
    static final class a extends fr.w implements er.a<g> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final a f10121b = new a();

        a() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // er.a
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final g a() {
            return new g(false, 0 == true ? 1 : 0, 3, null);
        }
    }

    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004R\u0014\u0010\u0007\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004R\u0014\u0010\t\u001a\u00020\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\u0004R\u0014\u0010\r\u001a\u00020\n8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0014\u0010\u0010\u001a\u00020\u000e8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0004¨\u0006\u0011"}, d2 = {"androidx/compose/ui/node/g$b", "Landroidx/compose/ui/platform/f3;", "", "c", "()J", "longPressTimeoutMillis", "a", "doubleTapTimeoutMillis", "b", "doubleTapMinTimeMillis", "", "g", "()F", "touchSlop", "Lc5/k;", "e", "minimumTouchTargetSize", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements f3 {
        b() {
        }

        @Override // androidx.compose.ui.platform.f3
        public long a() {
            return 300L;
        }

        @Override // androidx.compose.ui.platform.f3
        public long b() {
            return 40L;
        }

        @Override // androidx.compose.ui.platform.f3
        public long c() {
            return 400L;
        }

        @Override // androidx.compose.ui.platform.f3
        public long e() {
            return c5.k.INSTANCE.b();
        }

        @Override // androidx.compose.ui.platform.f3
        public float g() {
            return 16.0f;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"androidx/compose/ui/node/g$c", "Landroidx/compose/ui/node/g$f;", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "", "j", "(Le4/y0;Ljava/util/List;J)Ljava/lang/Void;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class c extends f {
        c() {
            super("Undefined intrinsics block and it is required");
        }

        @Override // p036e4.w0
        public /* bridge */ /* synthetic */ x0 e(y0 y0Var, List list, long j15) {
            return (x0) j(y0Var, list, j15);
        }

        public Void j(y0 y0Var, List<? extends v0> list, long j15) {
            throw new IllegalStateException("Undefined measure and it is required");
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.g$d, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR*\u0010\f\u001a\u0012\u0012\u0004\u0012\u00020\u00050\nj\b\u0012\u0004\u0012\u00020\u0005`\u000b8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Landroidx/compose/ui/node/g$d;", "", "<init>", "()V", "Lkotlin/Function0;", "Landroidx/compose/ui/node/g;", "Constructor", "Ler/a;", "a", "()Ler/a;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "ZComparator", "Ljava/util/Comparator;", "b", "()Ljava/util/Comparator;", "Landroidx/compose/ui/node/g$f;", "ErrorMeasurePolicy", "Landroidx/compose/ui/node/g$f;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(fr.k kVar) {
            this();
        }

        public final er.a<g> a() {
            return g.f10092v0;
        }

        public final Comparator<g> b() {
            return g.f10094x0;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/node/g$e;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "d", "e", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum e {
        Measuring,
        LookaheadMeasuring,
        LayingOut,
        LookaheadLayingOut,
        Idle;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ wq.a f10128g = wq.b.a(b());
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0001\n\u0002\b\b\b!\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J)\u0010\r\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ)\u0010\u0010\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u000eJ)\u0010\u0011\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0011\u0010\u000eJ)\u0010\u0012\u001a\u00020\f*\u00020\u00062\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Landroidx/compose/ui/node/g$f;", "Le4/w0;", "", "error", "<init>", "(Ljava/lang/String;)V", "Le4/w;", "", "Le4/v;", "measurables", "", "height", "", "g", "(Le4/w;Ljava/util/List;I)Ljava/lang/Void;", "width", "d", "b", "a", "Ljava/lang/String;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static abstract class f implements w0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String error;

        public f(String str) {
            this.error = str;
        }

        public Void a(p036e4.w wVar, List<? extends v> list, int i15) {
            throw new IllegalStateException(this.error.toString());
        }

        public Void b(p036e4.w wVar, List<? extends v> list, int i15) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // p036e4.w0
        public /* bridge */ /* synthetic */ int c(p036e4.w wVar, List list, int i15) {
            return ((Number) g(wVar, list, i15)).intValue();
        }

        public Void d(p036e4.w wVar, List<? extends v> list, int i15) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // p036e4.w0
        public /* bridge */ /* synthetic */ int f(p036e4.w wVar, List list, int i15) {
            return ((Number) a(wVar, list, i15)).intValue();
        }

        public Void g(p036e4.w wVar, List<? extends v> list, int i15) {
            throw new IllegalStateException(this.error.toString());
        }

        @Override // p036e4.w0
        public /* bridge */ /* synthetic */ int h(p036e4.w wVar, List list, int i15) {
            return ((Number) d(wVar, list, i15)).intValue();
        }

        @Override // p036e4.w0
        public /* bridge */ /* synthetic */ int i(p036e4.w wVar, List list, int i15) {
            return ((Number) b(wVar, list, i15)).intValue();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.node.g$g, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Landroidx/compose/ui/node/g$g;", "", "<init>", "(Ljava/lang/String;I)V", "a", "b", "c", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public enum EnumC0220g {
        InMeasureBlock,
        InLayoutBlock,
        NotUsed;


        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final /* synthetic */ wq.a f10134e = wq.b.a(b());
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public static final /* synthetic */ class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f10135a;

        static {
            int[] iArr = new int[e.values().length];
            try {
                iArr[e.Idle.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f10135a = iArr;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class i extends fr.w implements er.a<oq.i0> {
        i() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            g.this.getLayoutDelegate().C();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class j extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ fr.p0<SemanticsConfiguration> f10138c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(fr.p0<SemanticsConfiguration> p0Var) {
            super(0);
            this.f10138c = p0Var;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r4v6 */
        /* JADX WARN: Type inference failed for: r6v7, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
        /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
            java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
            	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
            	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
            */
        public final void c() {
            /*
                r11 = this;
                androidx.compose.ui.node.g r0 = androidx.compose.ui.node.g.this
                g4.p0 r0 = r0.getNodes()
                r1 = 8
                int r1 = g4.s0.a(r1)
                fr.p0<androidx.compose.ui.semantics.SemanticsConfiguration> r2 = r11.f10138c
                int r3 = g4.p0.c(r0)
                r3 = r3 & r1
                if (r3 == 0) goto L9d
                f3.m$c r0 = r0.getTail()
            L19:
                if (r0 == 0) goto L9d
                int r3 = r0.getKindSet()
                r3 = r3 & r1
                if (r3 == 0) goto L97
                r3 = 0
                r4 = r0
                r5 = r3
            L25:
                if (r4 == 0) goto L97
                boolean r6 = r4 instanceof g4.i1
                r7 = 1
                if (r6 == 0) goto L53
                g4.i1 r4 = (g4.i1) r4
                boolean r6 = r4.getIsClearingSemantics()
                if (r6 == 0) goto L3e
                androidx.compose.ui.semantics.SemanticsConfiguration r6 = new androidx.compose.ui.semantics.SemanticsConfiguration
                r6.<init>()
                r2.f66410a = r6
                r6.v(r7)
            L3e:
                boolean r6 = r4.getMergeDescendants()
                if (r6 == 0) goto L4b
                T r6 = r2.f66410a
                androidx.compose.ui.semantics.SemanticsConfiguration r6 = (androidx.compose.ui.semantics.SemanticsConfiguration) r6
                r6.w(r7)
            L4b:
                T r6 = r2.f66410a
                n4.i0 r6 = (n4.i0) r6
                r4.E2(r6)
                goto L92
            L53:
                int r6 = r4.getKindSet()
                r6 = r6 & r1
                if (r6 == 0) goto L92
                boolean r6 = r4 instanceof g4.j
                if (r6 == 0) goto L92
                r6 = r4
                g4.j r6 = (g4.j) r6
                f3.m$c r6 = r6.getDelegate()
                r8 = 0
                r9 = r8
            L67:
                if (r6 == 0) goto L8f
                int r10 = r6.getKindSet()
                r10 = r10 & r1
                if (r10 == 0) goto L8a
                int r9 = r9 + 1
                if (r9 != r7) goto L76
                r4 = r6
                goto L8a
            L76:
                if (r5 != 0) goto L81
                n2.c r5 = new n2.c
                r10 = 16
                f3.m$c[] r10 = new f3.m.c[r10]
                r5.<init>(r10, r8)
            L81:
                if (r4 == 0) goto L87
                r5.d(r4)
                r4 = r3
            L87:
                r5.d(r6)
            L8a:
                f3.m$c r6 = r6.getChild()
                goto L67
            L8f:
                if (r9 != r7) goto L92
                goto L25
            L92:
                f3.m$c r4 = g4.h.b(r5)
                goto L25
            L97:
                f3.m$c r0 = r0.getParent()
                goto L19
            L9d:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.g.j.c():void");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public g() {
        this(false, 0 == true ? 1 : 0, 3, null);
    }

    private final void A(f3.m modifier) {
        boolean zQ = this.nodes.q(s0.a(16));
        boolean zQ2 = this.nodes.q(s0.a(1024));
        this._modifier = modifier;
        this.nodes.F(modifier);
        boolean zQ3 = this.nodes.q(s0.a(16));
        boolean zQ4 = this.nodes.q(s0.a(1024));
        this.layoutDelegate.Z();
        if (this.lookaheadRoot == null && this.nodes.q(s0.a(512))) {
            a2(this);
        }
        if (zQ == zQ3 && zQ2 == zQ4) {
            return;
        }
        g0.b(this).getRectManager().t(this, zQ4, zQ3);
    }

    public static /* synthetic */ boolean B1(g gVar, c5.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = gVar.layoutDelegate.j();
        }
        return gVar.A1(bVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, androidx.compose.ui.semantics.SemanticsConfiguration] */
    private final SemanticsConfiguration C() {
        this.isCurrentlyCalculatingSemanticsConfiguration = true;
        fr.p0 p0Var = new fr.p0();
        p0Var.f66410a = new SemanticsConfiguration();
        c1 snapshotObserver = g0.b(this).getSnapshotObserver();
        j jVar = new j(p0Var);
        snapshotObserver.observer.k(this, snapshotObserver.onCommitAffectingSemantics, jVar);
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        return (SemanticsConfiguration) p0Var.f66410a;
    }

    private final void E() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = EnumC0220g.NotUsed;
        n2.c<g> cVarL0 = L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.intrinsicsUsageByParent == EnumC0220g.InLayoutBlock) {
                gVar.E();
            }
        }
    }

    private final String F(int depth) {
        StringBuilder sb5 = new StringBuilder();
        for (int i15 = 0; i15 < depth; i15++) {
            sb5.append("  ");
        }
        sb5.append("|-");
        sb5.append(toString());
        sb5.append('\n');
        n2.c<g> cVarL0 = L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i16 = 0; i16 < iO; i16++) {
            sb5.append(gVarArr[i16].F(depth + 1));
        }
        String string = sb5.toString();
        return depth == 0 ? string.substring(0, string.length() - 1) : string;
    }

    static /* synthetic */ String G(g gVar, int i15, int i16, Object obj) {
        if ((i16 & 1) != 0) {
            i15 = 0;
        }
        return gVar.F(i15);
    }

    private final e3.i G0() {
        return (e3.i) getCompositionLocalMap().a(e3.m.c());
    }

    public static /* synthetic */ void H1(g gVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        gVar.G1(z15);
    }

    private final float J0() {
        return o0().Y1();
    }

    public static /* synthetic */ void J1(g gVar, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        if ((i15 & 4) != 0) {
            z17 = true;
        }
        gVar.I1(z15, z16, z17);
    }

    private final String K(g instance) {
        StringBuilder sb5 = new StringBuilder();
        sb5.append("Cannot insert ");
        sb5.append(instance);
        sb5.append(" because it already has a parent or an owner. This tree: ");
        sb5.append(G(this, 0, 1, null));
        sb5.append(" Other tree: ");
        g gVar = instance._foldedParent;
        sb5.append(gVar != null ? G(gVar, 0, 1, null) : null);
        return sb5.toString();
    }

    public static /* synthetic */ void M1(g gVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        gVar.L1(z15);
    }

    public static /* synthetic */ void N0(g gVar, long j15, g4.t tVar, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i15 = a4.p0.INSTANCE.e();
        }
        int i17 = i15;
        if ((i16 & 8) != 0) {
            z15 = true;
        }
        gVar.M0(j15, tVar, i17, z15);
    }

    public static /* synthetic */ void O1(g gVar, boolean z15, boolean z16, boolean z17, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        if ((i15 & 2) != 0) {
            z16 = true;
        }
        if ((i15 & 4) != 0) {
            z17 = true;
        }
        gVar.N1(z15, z16, z17);
    }

    public static /* synthetic */ void P0(g gVar, long j15, g4.t tVar, int i15, boolean z15, int i16, Object obj) {
        if ((i16 & 4) != 0) {
            i15 = a4.p0.INSTANCE.d();
        }
        int i17 = i15;
        if ((i16 & 8) != 0) {
            z15 = true;
        }
        gVar.O0(j15, tVar, i17, z15);
    }

    private final void Q1() {
        this.nodes.y();
    }

    public static /* synthetic */ void S0(g gVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        gVar.R0(z15);
    }

    private final void a1() {
        g gVar;
        if (this.virtualChildrenCount > 0) {
            this.unfoldedVirtualChildrenListDirty = true;
        }
        if (!this.isVirtual || (gVar = this._foldedParent) == null) {
            return;
        }
        gVar.a1();
    }

    private final void a2(g gVar) {
        if (fr.t.c(gVar, this.lookaheadRoot)) {
            return;
        }
        this.lookaheadRoot = gVar;
        if (gVar != null) {
            this.layoutDelegate.a();
            NodeCoordinator wrapped = b0().getWrapped();
            for (NodeCoordinator nodeCoordinatorY0 = y0(); !fr.t.c(nodeCoordinatorY0, wrapped) && nodeCoordinatorY0 != null; nodeCoordinatorY0 = nodeCoordinatorY0.getWrapped()) {
                nodeCoordinatorY0.W2();
            }
        } else {
            this.layoutDelegate.I();
        }
        W0();
    }

    public static /* synthetic */ boolean f1(g gVar, c5.b bVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            bVar = gVar.layoutDelegate.k();
        }
        return gVar.e1(bVar);
    }

    private final void u1(g child) {
        if (child.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            androidx.compose.ui.node.h hVar = this.layoutDelegate;
            hVar.L(hVar.getChildrenAccessingCoordinatesDuringPlacement() - 1);
        }
        if (this.owner != null) {
            child.H();
        }
        child._foldedParent = null;
        if (child.globallyPositionedObservers > 0) {
            V1(this.globallyPositionedObservers - 1);
        }
        child.y0().b4(null);
        if (child.isVirtual) {
            this.virtualChildrenCount--;
            n2.c<g> cVarC = child._foldedChildren.c();
            g[] gVarArr = cVarC.content;
            int iO = cVarC.getSize();
            for (int i15 = 0; i15 < iO; i15++) {
                gVarArr[i15].y0().b4(null);
            }
        }
        a1();
        x1();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int w(g gVar, g gVar2) {
        return gVar.J0() == gVar2.J0() ? fr.t.d(gVar.D0(), gVar2.D0()) : Float.compare(gVar.J0(), gVar2.J0());
    }

    private final void w1() {
        W0();
        g gVarC0 = C0();
        if (gVarC0 != null) {
            gVarC0.T0();
        } else {
            Owner owner = this.owner;
            if (owner != null) {
                owner.t();
            }
        }
        U0();
    }

    private final w x0() {
        w wVar = this.intrinsicsPolicy;
        if (wVar != null) {
            return wVar;
        }
        w wVar2 = new w(this, getMeasurePolicy());
        this.intrinsicsPolicy = wVar2;
        return wVar2;
    }

    private final void z1() {
        if (this.unfoldedVirtualChildrenListDirty) {
            this.unfoldedVirtualChildrenListDirty = false;
            n2.c<g> cVar = this._unfoldedChildren;
            if (cVar == null) {
                cVar = new n2.c<>(new g[16], 0);
                this._unfoldedChildren = cVar;
            }
            cVar.j();
            n2.c<g> cVarC = this._foldedChildren.c();
            g[] gVarArr = cVarC.content;
            int iO = cVarC.getSize();
            for (int i15 = 0; i15 < iO; i15++) {
                g gVar = gVarArr[i15];
                if (gVar.isVirtual) {
                    cVar.g(cVar.getSize(), gVar.L0());
                } else {
                    cVar.d(gVar);
                }
            }
            this.layoutDelegate.C();
        }
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final boolean getOuterToInnerOffsetDirty() {
        return this.outerToInnerOffsetDirty;
    }

    public final boolean A1(c5.b constraints) {
        if (constraints == null) {
            return false;
        }
        if (this.intrinsicsUsageByParent == EnumC0220g.NotUsed) {
            D();
        }
        return o0().J2(constraints.getValue());
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003f  */
    public final void B(Owner owner) {
        boolean z15;
        g gVar;
        if (!(this.owner == null)) {
            d4.a.c("Cannot attach " + this + " as it already is attached.  Tree: " + G(this, 0, 1, null));
        }
        g gVar2 = this._foldedParent;
        if (gVar2 == null) {
            z15 = true;
        } else if (fr.t.c(gVar2 != null ? gVar2.owner : null, owner)) {
            z15 = true;
        } else {
            z15 = false;
        }
        if (!z15) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Attaching to a different owner(");
            sb5.append(owner);
            sb5.append(") than the parent's owner(");
            g gVarC0 = C0();
            sb5.append(gVarC0 != null ? gVarC0.owner : null);
            sb5.append("). This tree: ");
            sb5.append(G(this, 0, 1, null));
            sb5.append(" Parent tree: ");
            g gVar3 = this._foldedParent;
            sb5.append(gVar3 != null ? G(gVar3, 0, 1, null) : null);
            d4.a.c(sb5.toString());
        }
        g gVarC1 = C0();
        if (gVarC1 == null) {
            o0().P2(true);
            owner.getRectManager().l(this);
            l lVarL0 = l0();
            if (lVarL0 != null) {
                lVarL0.v2();
            }
        }
        y0().b4(gVarC1 != null ? gVarC1.b0() : null);
        this.owner = owner;
        this.depth = (gVarC1 != null ? gVarC1.depth : -1) + 1;
        f3.m mVar = this.pendingModifier;
        if (mVar != null) {
            A(mVar);
        }
        this.pendingModifier = null;
        owner.B(this);
        if (this.isVirtualLookaheadRoot) {
            a2(this);
        } else {
            g gVar4 = this._foldedParent;
            if (gVar4 == null || (gVar = gVar4.lookaheadRoot) == null) {
                gVar = this.lookaheadRoot;
            }
            a2(gVar);
            if (this.lookaheadRoot == null && this.nodes.q(s0.a(512))) {
                a2(this);
            }
        }
        if (!getIsDeactivated()) {
            this.nodes.t();
        }
        n2.c<g> cVarC = this._foldedChildren.c();
        g[] gVarArr = cVarC.content;
        int iO = cVarC.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            gVarArr[i15].B(owner);
        }
        if (!getIsDeactivated()) {
            this.nodes.z();
        }
        W0();
        if (gVarC1 != null) {
            gVarC1.W0();
        }
        er.l<? super Owner, oq.i0> lVar = this.onAttach;
        if (lVar != null) {
            lVar.b(owner);
        }
        this.layoutDelegate.Z();
        if (!getIsDeactivated() && this.nodes.q(s0.a(8))) {
            Z0();
        }
        owner.w(this);
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final Owner getOwner() {
        return this.owner;
    }

    public final g C0() {
        g gVar = this._foldedParent;
        while (gVar != null && gVar.isVirtual) {
            gVar = gVar._foldedParent;
        }
        return gVar;
    }

    public final void C1() {
        int iO = this._foldedChildren.c().getSize();
        while (true) {
            iO--;
            if (-1 >= iO) {
                this._foldedChildren.b();
                return;
            }
            u1(this._foldedChildren.c().content[iO]);
        }
    }

    public final void D() {
        this.previousIntrinsicsUsageByParent = this.intrinsicsUsageByParent;
        this.intrinsicsUsageByParent = EnumC0220g.NotUsed;
        n2.c<g> cVarL0 = L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            g gVar = gVarArr[i15];
            if (gVar.intrinsicsUsageByParent != EnumC0220g.NotUsed) {
                gVar.D();
            }
        }
    }

    public final int D0() {
        return o0().i0();
    }

    public final void D1(int index, int count) {
        if (!(count >= 0)) {
            d4.a.a("count (" + count + ") must be greater than 0");
        }
        int i15 = (count + index) - 1;
        if (index > i15) {
            return;
        }
        while (true) {
            u1(this._foldedChildren.c().content[i15]);
            this._foldedChildren.d(i15);
            if (i15 == index) {
                return;
            } else {
                i15--;
            }
        }
    }

    /* JADX INFO: renamed from: E0, reason: from getter */
    public final boolean getRectInParentDirty() {
        return this.rectInParentDirty;
    }

    public final void E1() {
        if (this.intrinsicsUsageByParent == EnumC0220g.NotUsed) {
            E();
        }
        o0().K2();
    }

    /* JADX INFO: renamed from: F0, reason: from getter */
    public final o0 getSubcompositionsState() {
        return this.subcompositionsState;
    }

    public final void F1() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        g0.b(this).z(this);
    }

    public final void G1(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        owner.g(this, true, forceRequest);
    }

    public final void H() {
        Owner owner = this.owner;
        if (owner == null) {
            StringBuilder sb5 = new StringBuilder();
            sb5.append("Cannot detach node that is already detached!  Tree: ");
            g gVarC0 = C0();
            sb5.append(gVarC0 != null ? G(gVarC0, 0, 1, null) : null);
            d4.a.d(sb5.toString());
            throw new oq.g();
        }
        g gVarC1 = C0();
        if (gVarC1 != null) {
            gVarC1.T0();
            gVarC1.W0();
            n nVarO0 = o0();
            EnumC0220g enumC0220g = EnumC0220g.NotUsed;
            nVarO0.O2(enumC0220g);
            l lVarL0 = l0();
            if (lVarL0 != null) {
                lVarL0.P2(enumC0220g);
            }
        }
        this.layoutDelegate.K();
        NodeCoordinator wrapped = b0().getWrapped();
        for (NodeCoordinator nodeCoordinatorY0 = y0(); !fr.t.c(nodeCoordinatorY0, wrapped) && nodeCoordinatorY0 != null; nodeCoordinatorY0 = nodeCoordinatorY0.getWrapped()) {
            nodeCoordinatorY0.G3();
        }
        er.l<? super Owner, oq.i0> lVar = this.onDetach;
        if (lVar != null) {
            lVar.b(owner);
        }
        this.nodes.A();
        this.ignoreRemeasureRequests = true;
        n2.c<g> cVarC = this._foldedChildren.c();
        g[] gVarArr = cVarC.content;
        int iO = cVarC.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            gVarArr[i15].H();
        }
        oq.i0 i0Var = oq.i0.f148189a;
        this.ignoreRemeasureRequests = false;
        this.nodes.u();
        owner.J(this);
        owner.getRectManager().n(this);
        this.owner = null;
        a2(null);
        this.depth = 0;
        o0().E2();
        l lVarL1 = l0();
        if (lVarL1 != null) {
            lVarL1.D2();
        }
        if (this.nodes.q(s0.a(8))) {
            SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
            owner.getSemanticsOwner().e(this, semanticsConfiguration);
            owner.L();
        }
    }

    /* JADX INFO: renamed from: H0, reason: from getter */
    public f3 getViewConfiguration() {
        return this.viewConfiguration;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    public final void I() {
        if (i0() != e.Idle || h0() || p0() || getIsDeactivated() || !p()) {
            return;
        }
        p0 p0Var = this.nodes;
        int iA = s0.a(256);
        if ((p0Var.i() & iA) != 0) {
            for (f3.m.c head = p0Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    f3.m.c cVarL = head;
                    n2.c cVar = null;
                    while (cVarL != 0) {
                        if (cVarL instanceof s) {
                            s sVar = (s) cVarL;
                            sVar.h(g4.h.n(sVar, s0.a(256)));
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public int I0() {
        return this.layoutDelegate.A();
    }

    public final void I1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        if (!(this.lookaheadRoot != null)) {
            d4.a.c("Lookahead measure cannot be requested on a node that is not a part of the LookaheadScope");
        }
        Owner owner = this.owner;
        if (owner == null || this.ignoreRemeasureRequests || this.isVirtual) {
            return;
        }
        owner.H(this, true, forceRequest, scheduleMeasureAndLayout);
        if (invalidateIntrinsics) {
            l0().Y1(forceRequest);
        }
    }

    public final void J(h1 canvas, q3.c graphicsLayer) throws Throwable {
        try {
            y0().T2(canvas, graphicsLayer);
            oq.i0 i0Var = oq.i0.f148189a;
        } catch (Throwable th4) {
            S1(th4);
            throw new oq.g();
        }
    }

    public final n2.c<g> K0() {
        if (this.zSortedChildrenInvalidated) {
            this._zSortedChildren.j();
            n2.c<g> cVar = this._zSortedChildren;
            cVar.g(cVar.getSize(), L0());
            this._zSortedChildren.B(f10094x0);
            this.zSortedChildrenInvalidated = false;
        }
        return this._zSortedChildren;
    }

    @Override // g4.b1
    public boolean K1() {
        return c();
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final boolean getAddedToRectList() {
        return this.addedToRectList;
    }

    public final n2.c<g> L0() {
        l2();
        return this.virtualChildrenCount == 0 ? this._foldedChildren.c() : this._unfoldedChildren;
    }

    public final void L1(boolean forceRequest) {
        Owner owner;
        if (this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.i(owner, this, false, forceRequest, 2, null);
    }

    public final boolean M() {
        g4.b bVarO;
        g4.a aVarI;
        androidx.compose.ui.node.h hVar = this.layoutDelegate;
        return hVar.b().i().k() || !((bVarO = hVar.o()) == null || (aVarI = bVarO.i()) == null || !aVarI.k());
    }

    public final void M0(long pointerPosition, g4.t hitTestResult, int pointerType, boolean isInLayer) {
        y0().x3(NodeCoordinator.INSTANCE.a(), NodeCoordinator.Z2(y0(), pointerPosition, false, 2, null), hitTestResult, pointerType, isInLayer);
    }

    public final boolean N() {
        return this.pendingModifier != null;
    }

    public final void N1(boolean forceRequest, boolean scheduleMeasureAndLayout, boolean invalidateIntrinsics) {
        Owner owner;
        if (this.ignoreRemeasureRequests || this.isVirtual || (owner = this.owner) == null) {
            return;
        }
        Owner.P(owner, this, false, forceRequest, scheduleMeasureAndLayout, 2, null);
        if (invalidateIntrinsics) {
            o0().Z1(forceRequest);
        }
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final boolean getCanMultiMeasure() {
        return this.canMultiMeasure;
    }

    public final void O0(long pointerPosition, g4.t hitSemanticsEntities, int pointerType, boolean isInLayer) {
        y0().x3(NodeCoordinator.INSTANCE.b(), NodeCoordinator.Z2(y0(), pointerPosition, false, 2, null), hitSemanticsEntities, a4.p0.INSTANCE.d(), isInLayer);
    }

    public final List<v0> P() {
        return l0().C1();
    }

    public final void P1(g it) {
        if (h.f10135a[it.i0().ordinal()] != 1) {
            throw new IllegalStateException("Unexpected state " + it.i0());
        }
        if (it.k0()) {
            J1(it, true, false, false, 6, null);
            return;
        }
        if (it.j0()) {
            it.G1(true);
        }
        if (it.p0()) {
            O1(it, true, false, false, 6, null);
        } else if (it.h0()) {
            it.L1(true);
        }
    }

    public final List<v0> Q() {
        return o0().G1();
    }

    public final void Q0(int index, g instance) {
        if (!(instance._foldedParent == null || instance.owner == null)) {
            d4.a.c(K(instance));
        }
        instance._foldedParent = this;
        this._foldedChildren.a(index, instance);
        x1();
        if (instance.isVirtual) {
            this.virtualChildrenCount++;
        }
        a1();
        Owner owner = this.owner;
        if (owner != null) {
            instance.B(owner);
        }
        if (instance.layoutDelegate.getChildrenAccessingCoordinatesDuringPlacement() > 0) {
            androidx.compose.ui.node.h hVar = this.layoutDelegate;
            hVar.L(hVar.getChildrenAccessingCoordinatesDuringPlacement() + 1);
        }
        if (instance.globallyPositionedObservers > 0) {
            V1(this.globallyPositionedObservers + 1);
        }
    }

    public final List<g> R() {
        return L0().i();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v8 */
    public final void R0(boolean isRootOfInvalidation) {
        if (isRootOfInvalidation) {
            g gVarC0 = C0();
            if (gVarC0 != null) {
                gVarC0.T0();
            } else {
                Owner owner = this.owner;
                if (owner != null) {
                    owner.t();
                }
            }
        }
        p0 p0Var = this.nodes;
        int iA = s0.a(2);
        if ((p0Var.i() & iA) != 0) {
            for (f3.m.c head = p0Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    f3.m.c cVarL = head;
                    n2.c cVar = null;
                    while (cVarL != 0) {
                        if (cVarL instanceof z) {
                            a1 layer = g4.h.n((z) cVarL, s0.a(2)).getLayer();
                            if (layer != null) {
                                layer.invalidate();
                            }
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    break;
                }
            }
        }
        n2.c<g> cVarL0 = L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i16 = 0; i16 < iO; i16++) {
            gVarArr[i16].R0(false);
        }
    }

    public final void R1() {
        n2.c<g> cVarL0 = L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            g gVar = gVarArr[i15];
            EnumC0220g enumC0220g = gVar.previousIntrinsicsUsageByParent;
            gVar.intrinsicsUsageByParent = enumC0220g;
            if (enumC0220g != EnumC0220g.NotUsed) {
                gVar.R1();
            }
        }
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public int getCompositeKeyHash() {
        return this.compositeKeyHash;
    }

    public final Void S1(Throwable e15) throws Throwable {
        e3.i iVarG0 = G0();
        if (iVarG0 == null) {
            throw e15;
        }
        iVarG0.a(e15, this);
        throw e15;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public e0 getCompositionLocalMap() {
        return this.compositionLocalMap;
    }

    public final void T0() {
        NodeCoordinator nodeCoordinatorC0 = c0();
        if (nodeCoordinatorC0 != null) {
            nodeCoordinatorC0.z3();
            return;
        }
        g gVarC0 = C0();
        if (gVarC0 != null) {
            gVarC0.T0();
            return;
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.t();
        }
    }

    public final void T1(boolean z15) {
        this.addedToRectList = z15;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public c5.d getDensity() {
        return this.density;
    }

    public final void U0() {
        NodeCoordinator nodeCoordinatorY0 = y0();
        NodeCoordinator nodeCoordinatorB0 = b0();
        while (nodeCoordinatorY0 != nodeCoordinatorB0) {
            androidx.compose.ui.node.f fVar = (androidx.compose.ui.node.f) nodeCoordinatorY0;
            a1 layer = fVar.getLayer();
            if (layer != null) {
                layer.invalidate();
            }
            nodeCoordinatorY0 = fVar.getWrapped();
        }
        a1 layer2 = b0().getLayer();
        if (layer2 != null) {
            layer2.invalidate();
        }
    }

    public final void U1(boolean z15) {
        this.canMultiMeasure = z15;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final int getDepth() {
        return this.depth;
    }

    public final void V0() {
        O1(this, false, false, false, 7, null);
        n2.c<g> cVarL0 = L0();
        g[] gVarArr = cVarL0.content;
        int iO = cVarL0.getSize();
        for (int i15 = 0; i15 < iO; i15++) {
            gVarArr[i15].V0();
        }
    }

    public final void V1(int i15) {
        g gVarC0;
        g gVarC1;
        int i16 = this.globallyPositionedObservers;
        if (i16 != i15) {
            if (i15 > 0 && i16 == 0 && (gVarC1 = C0()) != null) {
                gVarC1.V1(gVarC1.globallyPositionedObservers + 1);
            }
            if (i15 == 0 && this.globallyPositionedObservers > 0 && (gVarC0 = C0()) != null) {
                gVarC0.V1(gVarC0.globallyPositionedObservers - 1);
            }
            this.globallyPositionedObservers = i15;
        }
    }

    public final List<g> W() {
        return this._foldedChildren.c().i();
    }

    public final void W0() {
        if (this.isVirtual) {
            g gVarC0 = C0();
            if (gVarC0 != null) {
                gVarC0.W0();
                return;
            }
            return;
        }
        if (this.lookaheadRoot != null) {
            J1(this, false, false, false, 7, null);
        } else {
            O1(this, false, false, false, 7, null);
        }
    }

    public final void W1(boolean z15) {
        this.hasPositionalLayerTransformationsInOffsetFromRoot = z15;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final int getGloballyPositionedObservers() {
        return this.globallyPositionedObservers;
    }

    public final void X0() {
        if (this.globallyPositionedObservers == 0 || h0() || p0() || this.needsOnGloballyPositionedDispatch) {
            return;
        }
        g0.b(this).l(this);
    }

    public final void X1(boolean z15) {
        this.innerLayerCoordinatorIsDirty = z15;
    }

    public final boolean Y() {
        long jG3 = b0().g3();
        return c5.b.j(jG3) && c5.b.i(jG3);
    }

    public final void Y0() {
        this.layoutDelegate.B();
    }

    public final void Y1(androidx.compose.ui.viewinterop.b bVar) {
        this.interopViewFactoryHolder = bVar;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final boolean getHasPositionalLayerTransformationsInOffsetFromRoot() {
        return this.hasPositionalLayerTransformationsInOffsetFromRoot;
    }

    public final void Z0() {
        if (this.isCurrentlyCalculatingSemanticsConfiguration) {
            return;
        }
        if (this.nodes.s() || N()) {
            this.isSemanticsInvalidated = true;
            return;
        }
        SemanticsConfiguration semanticsConfiguration = this._semanticsConfiguration;
        this._semanticsConfiguration = C();
        this.isSemanticsInvalidated = false;
        Owner ownerB = g0.b(this);
        ownerB.getSemanticsOwner().e(this, semanticsConfiguration);
        ownerB.L();
    }

    public final void Z1(EnumC0220g enumC0220g) {
        this.intrinsicsUsageByParent = enumC0220g;
    }

    @Override // p076m2.n
    public void a() {
        androidx.compose.ui.viewinterop.b bVar = this.interopViewFactoryHolder;
        if (bVar != null) {
            bVar.a();
        }
        o0 o0Var = this.subcompositionsState;
        if (o0Var != null) {
            o0Var.a();
        }
        NodeCoordinator wrapped = b0().getWrapped();
        for (NodeCoordinator nodeCoordinatorY0 = y0(); !fr.t.c(nodeCoordinatorY0, wrapped) && nodeCoordinatorY0 != null; nodeCoordinatorY0 = nodeCoordinatorY0.getWrapped()) {
            nodeCoordinatorY0.K3();
        }
    }

    public int a0() {
        return this.layoutDelegate.i();
    }

    @Override // androidx.compose.ui.node.c
    public void b(c5.d dVar) {
        if (fr.t.c(this.density, dVar)) {
            return;
        }
        this.density = dVar;
        w1();
        for (f3.m.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
            head.I();
        }
    }

    public final NodeCoordinator b0() {
        return this.nodes.getInnerCoordinator();
    }

    public final boolean b1() {
        return o0().m2();
    }

    public final void b2(boolean z15) {
        this.needsOnGloballyPositionedDispatch = z15;
    }

    @Override // p036e4.i0
    public boolean c() {
        return this.owner != null;
    }

    public final NodeCoordinator c0() {
        if (this.innerLayerCoordinatorIsDirty) {
            NodeCoordinator nodeCoordinatorB0 = b0();
            NodeCoordinator wrappedBy = y0().getWrappedBy();
            this._innerLayerCoordinator = null;
            while (!fr.t.c(nodeCoordinatorB0, wrappedBy)) {
                if ((nodeCoordinatorB0 != null ? nodeCoordinatorB0.getLayer() : null) != null) {
                    this._innerLayerCoordinator = nodeCoordinatorB0;
                    break;
                }
                nodeCoordinatorB0 = nodeCoordinatorB0 != null ? nodeCoordinatorB0.getWrappedBy() : null;
            }
            this.innerLayerCoordinatorIsDirty = false;
        }
        NodeCoordinator nodeCoordinator = this._innerLayerCoordinator;
        if (nodeCoordinator == null || nodeCoordinator.getLayer() != null) {
            return nodeCoordinator;
        }
        d4.a.d("layer was not set. This error is usually caused by operating off of the UI thread. Did you call invalidate() instead of postInvalidate()?");
        throw new oq.g();
    }

    public final Boolean c1() {
        l lVarL0 = l0();
        if (lVarL0 != null) {
            return Boolean.valueOf(lVarL0.a2());
        }
        return null;
    }

    public final void c2(er.l<? super Owner, oq.i0> lVar) {
        this.onAttach = lVar;
    }

    @Override // androidx.compose.ui.node.c
    public void d(t tVar) {
        if (this.layoutDirection != tVar) {
            this.layoutDirection = tVar;
            w1();
            for (f3.m.c head = this.nodes.getHead(); head != null; head = head.getChild()) {
                head.B0();
            }
        }
    }

    public View d0() {
        androidx.compose.ui.viewinterop.b bVar = this.interopViewFactoryHolder;
        if (bVar != null) {
            return bVar.getInteropView();
        }
        return null;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public final boolean getIsVirtualLookaheadRoot() {
        return this.isVirtualLookaheadRoot;
    }

    public final void d2(er.l<? super Owner, oq.i0> lVar) {
        this.onDetach = lVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v7 */
    /*  JADX ERROR: NullPointerException in pass: PrepareForCodeGen
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.getSVar()" because "result" is null
        	at jadx.core.dex.visitors.PrepareForCodeGen.removeInstructions(PrepareForCodeGen.java:118)
        	at jadx.core.dex.visitors.PrepareForCodeGen.visit(PrepareForCodeGen.java:85)
        */
    @Override // androidx.compose.ui.node.c
    public void e(p076m2.e0 r10) {
        /*
            r9 = this;
            r9.compositionLocalMap = r10
            m2.b4 r0 = androidx.compose.ui.platform.g1.f()
            java.lang.Object r0 = r10.a(r0)
            c5.d r0 = (c5.d) r0
            r9.b(r0)
            m2.b4 r0 = androidx.compose.ui.platform.g1.l()
            java.lang.Object r0 = r10.a(r0)
            c5.t r0 = (c5.t) r0
            r9.d(r0)
            m2.b4 r0 = androidx.compose.ui.platform.g1.u()
            java.lang.Object r10 = r10.a(r0)
            androidx.compose.ui.platform.f3 r10 = (androidx.compose.ui.platform.f3) r10
            r9.l(r10)
            g4.p0 r10 = r9.nodes
            r0 = 32768(0x8000, float:4.5918E-41)
            int r0 = g4.s0.a(r0)
            int r1 = g4.p0.c(r10)
            r1 = r1 & r0
            if (r1 == 0) goto Lb4
            f3.m$c r10 = r10.getHead()
        L3d:
            if (r10 == 0) goto Lb4
            int r1 = r10.getKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto La8
            r1 = 0
            r2 = r10
            r3 = r1
        L49:
            if (r2 == 0) goto La8
            boolean r4 = r2 instanceof g4.e
            r5 = 1
            if (r4 == 0) goto L64
            g4.e r2 = (g4.e) r2
            f3.m$c r2 = r2.getNode()
            boolean r4 = r2.getIsAttached()
            if (r4 == 0) goto L60
            g4.t0.e(r2)
            goto La3
        L60:
            r2.k3(r5)
            goto La3
        L64:
            int r4 = r2.getKindSet()
            r4 = r4 & r0
            if (r4 == 0) goto La3
            boolean r4 = r2 instanceof g4.j
            if (r4 == 0) goto La3
            r4 = r2
            g4.j r4 = (g4.j) r4
            f3.m$c r4 = r4.getDelegate()
            r6 = 0
            r7 = r6
        L78:
            if (r4 == 0) goto La0
            int r8 = r4.getKindSet()
            r8 = r8 & r0
            if (r8 == 0) goto L9b
            int r7 = r7 + 1
            if (r7 != r5) goto L87
            r2 = r4
            goto L9b
        L87:
            if (r3 != 0) goto L92
            n2.c r3 = new n2.c
            r8 = 16
            f3.m$c[] r8 = new f3.m.c[r8]
            r3.<init>(r8, r6)
        L92:
            if (r2 == 0) goto L98
            r3.d(r2)
            r2 = r1
        L98:
            r3.d(r4)
        L9b:
            f3.m$c r4 = r4.getChild()
            goto L78
        La0:
            if (r7 != r5) goto La3
            goto L49
        La3:
            f3.m$c r2 = g4.h.b(r3)
            goto L49
        La8:
            int r1 = r10.getAggregateChildKindSet()
            r1 = r1 & r0
            if (r1 == 0) goto Lb4
            f3.m$c r10 = r10.getChild()
            goto L3d
        Lb4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.node.g.e(m2.e0):void");
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final androidx.compose.ui.viewinterop.b getInteropViewFactoryHolder() {
        return this.interopViewFactoryHolder;
    }

    public final boolean e1(c5.b constraints) {
        if (constraints == null || this.lookaheadRoot == null) {
            return false;
        }
        return l0().I2(constraints.getValue());
    }

    public final void e2(long j15) {
        this.outerToInnerOffset = j15;
    }

    @Override // n4.r
    public SemanticsConfiguration f() {
        if (c() && !getIsDeactivated() && this.nodes.q(s0.a(8))) {
            return this._semanticsConfiguration;
        }
        return null;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final EnumC0220g getIntrinsicsUsageByParent() {
        return this.intrinsicsUsageByParent;
    }

    public final void f2(boolean z15) {
        this.outerToInnerOffsetDirty = z15;
    }

    @Override // androidx.compose.ui.node.c
    public void g(int i15) {
        this.compositeKeyHash = i15;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final androidx.compose.ui.node.h getLayoutDelegate() {
        return this.layoutDelegate;
    }

    public final void g1() {
        if (this.intrinsicsUsageByParent == EnumC0220g.NotUsed) {
            E();
        }
        l0().J2();
    }

    public final void g2(boolean z15) {
        this.rectInParentDirty = z15;
    }

    @Override // p036e4.i0
    public t getLayoutDirection() {
        return this.layoutDirection;
    }

    @Override // n4.r
    public n4.r h() {
        return C0();
    }

    public final boolean h0() {
        return this.layoutDelegate.m();
    }

    public final void h1() {
        this.layoutDelegate.D();
    }

    public void h2(int i15) {
        this.semanticsId = i15;
    }

    @Override // p076m2.n
    public void i() {
        androidx.compose.ui.viewinterop.b bVar = this.interopViewFactoryHolder;
        if (bVar != null) {
            bVar.i();
        }
        o0 o0Var = this.subcompositionsState;
        if (o0Var != null) {
            o0Var.i();
        }
        this.isDeactivated = true;
        Q1();
        if (c()) {
            this._semanticsConfiguration = null;
            this.isSemanticsInvalidated = false;
        }
        Owner owner = this.owner;
        if (owner != null) {
            owner.O(this);
        }
    }

    public final e i0() {
        return this.layoutDelegate.getLayoutState();
    }

    public final void i1() {
        this.layoutDelegate.E();
    }

    public final void i2(boolean z15) {
        this.isSemanticsInvalidated = z15;
    }

    @Override // androidx.compose.ui.node.c
    public void j(w0 w0Var) {
        if (fr.t.c(this.measurePolicy, w0Var)) {
            return;
        }
        this.measurePolicy = w0Var;
        w wVar = this.intrinsicsPolicy;
        if (wVar != null) {
            wVar.k(getMeasurePolicy());
        }
        W0();
    }

    public final boolean j0() {
        return this.layoutDelegate.getLookaheadLayoutPending();
    }

    public final void j1() {
        this.layoutDelegate.F();
    }

    public final void j2(o0 o0Var) {
        this.subcompositionsState = o0Var;
    }

    @Override // p036e4.f2
    public void k() {
        g gVar;
        if (this.lookaheadRoot != null) {
            gVar = this;
            J1(gVar, false, false, false, 5, null);
        } else {
            O1(this, false, false, false, 5, null);
            gVar = this;
        }
        c5.b bVarJ = gVar.layoutDelegate.j();
        if (bVarJ != null) {
            Owner owner = gVar.owner;
            if (owner != null) {
                owner.E(this, bVarJ.getValue());
                return;
            }
            return;
        }
        Owner owner2 = gVar.owner;
        if (owner2 != null) {
            Owner.f(owner2, false, 1, null);
        }
    }

    public final boolean k0() {
        return this.layoutDelegate.getLookaheadMeasurePending();
    }

    public final void k1() {
        this.layoutDelegate.G();
    }

    public final void k2(boolean z15) {
        this.isVirtualLookaheadRoot = z15;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v6 */
    @Override // androidx.compose.ui.node.c
    public void l(f3 f3Var) {
        if (fr.t.c(this.viewConfiguration, f3Var)) {
            return;
        }
        this.viewConfiguration = f3Var;
        p0 p0Var = this.nodes;
        int iA = s0.a(16);
        if ((p0Var.i() & iA) != 0) {
            for (f3.m.c head = p0Var.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) != 0) {
                    f3.m.c cVarL = head;
                    n2.c cVar = null;
                    while (cVarL != 0) {
                        if (cVarL instanceof f1) {
                            ((f1) cVarL).C2();
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
                if ((head.getAggregateChildKindSet() & iA) == 0) {
                    return;
                }
            }
        }
    }

    public final l l0() {
        return this.layoutDelegate.getLookaheadPassDelegate();
    }

    public final int l1(int width) {
        return x0().b(width);
    }

    public final void l2() {
        if (this.virtualChildrenCount > 0) {
            z1();
        }
    }

    @Override // p036e4.i0
    public b0 m() {
        return b0();
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final g getLookaheadRoot() {
        return this.lookaheadRoot;
    }

    public final int m1(int height) {
        return x0().c(height);
    }

    @Override // p036e4.i0
    /* JADX INFO: renamed from: n, reason: from getter */
    public int getSemanticsId() {
        return this.semanticsId;
    }

    public final g4.e0 n0() {
        return g0.b(this).getSharedDrawScope();
    }

    public final int n1(int width) {
        return x0().d(width);
    }

    @Override // p076m2.n
    public void o() {
        o4.d rectManager;
        o4.d rectManager2;
        if (!c()) {
            d4.a.a("onReuse is only expected on attached node");
        }
        androidx.compose.ui.viewinterop.b bVar = this.interopViewFactoryHolder;
        if (bVar != null) {
            bVar.o();
        }
        o0 o0Var = this.subcompositionsState;
        if (o0Var != null) {
            o0Var.o();
        }
        this.isCurrentlyCalculatingSemanticsConfiguration = false;
        if (getIsDeactivated()) {
            this.isDeactivated = false;
        } else {
            Q1();
        }
        int semanticsId = getSemanticsId();
        Owner owner = this.owner;
        if (owner != null && (rectManager2 = owner.getRectManager()) != null) {
            rectManager2.n(this);
        }
        h2(n4.v.b());
        Owner owner2 = this.owner;
        if (owner2 != null) {
            owner2.o(this, semanticsId);
        }
        this.nodes.t();
        this.nodes.z();
        if (this.nodes.q(s0.a(8))) {
            Z0();
        }
        P1(this);
        Owner owner3 = this.owner;
        if (owner3 != null) {
            owner3.n(this, semanticsId);
        }
        Owner owner4 = this.owner;
        if (owner4 == null || (rectManager = owner4.getRectManager()) == null) {
            return;
        }
        rectManager.l(this);
    }

    public final n o0() {
        return this.layoutDelegate.getMeasurePassDelegate();
    }

    public final int o1(int height) {
        return x0().e(height);
    }

    @Override // p036e4.i0
    public boolean p() {
        return o0().h2();
    }

    public final boolean p0() {
        return this.layoutDelegate.w();
    }

    public final int p1(int width) {
        return x0().f(width);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v6 */
    @Override // androidx.compose.ui.node.Owner.b
    public void q() {
        NodeCoordinator nodeCoordinatorB0 = b0();
        int iA = s0.a(4194304);
        boolean zI = t0.i(iA);
        f3.m.c cVarN3 = nodeCoordinatorB0.n3();
        if (!zI && (cVarN3 = cVarN3.getParent()) == null) {
            return;
        }
        for (f3.m.c cVarU3 = nodeCoordinatorB0.u3(zI); cVarU3 != null && (cVarU3.getAggregateChildKindSet() & iA) != 0; cVarU3 = cVarU3.getChild()) {
            if ((cVarU3.getKindSet() & iA) != 0) {
                f3.m.c cVarL = cVarU3;
                n2.c cVar = null;
                while (cVarL != 0) {
                    if (cVarL instanceof y) {
                        ((y) cVarL).E(b0());
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

    /* JADX INFO: renamed from: q0, reason: from getter */
    public w0 getMeasurePolicy() {
        return this.measurePolicy;
    }

    public final int q1(int height) {
        return x0().g(height);
    }

    @Override // n4.r
    public List<n4.r> r() {
        return R();
    }

    public final EnumC0220g r0() {
        return o0().V1();
    }

    public final int r1(int width) {
        return x0().h(width);
    }

    @Override // p036e4.i0
    /* JADX INFO: renamed from: s, reason: from getter */
    public boolean getIsDeactivated() {
        return this.isDeactivated;
    }

    public final EnumC0220g s0() {
        EnumC0220g enumC0220gR1;
        l lVarL0 = l0();
        return (lVarL0 == null || (enumC0220gR1 = lVarL0.R1()) == null) ? EnumC0220g.NotUsed : enumC0220gR1;
    }

    public final int s1(int height) {
        return x0().i(height);
    }

    @Override // n4.r
    public boolean t() {
        return y0().C3();
    }

    /* JADX INFO: renamed from: t0, reason: from getter */
    public f3.m get_modifier() {
        return this._modifier;
    }

    public final void t1(int from, int to4, int count) {
        if (from == to4) {
            return;
        }
        for (int i15 = 0; i15 < count; i15++) {
            this._foldedChildren.a(from > to4 ? to4 + i15 : (to4 + count) - 2, this._foldedChildren.d(from > to4 ? from + i15 : from));
        }
        x1();
        a1();
        W0();
    }

    public String toString() {
        return y1.a(this, null) + " children: " + R().size() + " measurePolicy: " + getMeasurePolicy() + " deactivated: " + getIsDeactivated();
    }

    @Override // androidx.compose.ui.node.c
    public void u(f3.m mVar) {
        if (!(!this.isVirtual || get_modifier() == f3.m.INSTANCE)) {
            d4.a.a("Modifiers are not supported on virtual LayoutNodes");
        }
        if (getIsDeactivated()) {
            d4.a.a("modifier is updated when deactivated");
        }
        if (!c()) {
            this.pendingModifier = mVar;
            return;
        }
        A(mVar);
        if (this.isSemanticsInvalidated) {
            Z0();
        }
    }

    public List<ModifierInfo> u0() {
        return this.nodes.n();
    }

    /* JADX INFO: renamed from: v0, reason: from getter */
    public final boolean getNeedsOnGloballyPositionedDispatch() {
        return this.needsOnGloballyPositionedDispatch;
    }

    public final void v1(NodeCoordinator coordinator) {
        Owner owner = this.owner;
        o4.d rectManager = owner != null ? owner.getRectManager() : null;
        boolean z15 = i0() != e.Idle || p0() || h0();
        if (this.addedToRectList && rectManager != null) {
            if (coordinator == y0()) {
                this.rectInParentDirty = true;
                if (!z15) {
                    rectManager.l(this);
                }
            } else {
                this.outerToInnerOffsetDirty = true;
                n2.c<g> cVarL0 = L0();
                g[] gVarArr = cVarL0.content;
                int iO = cVarL0.getSize();
                for (int i15 = 0; i15 < iO; i15++) {
                    g gVar = gVarArr[i15];
                    gVar.rectInParentDirty = true;
                    if (!z15) {
                        rectManager.l(gVar);
                    }
                }
                rectManager.j(this);
            }
        }
        this.layoutDelegate.getMeasurePassDelegate().L2();
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final p0 getNodes() {
        return this.nodes;
    }

    public final void x1() {
        if (!this.isVirtual) {
            this.zSortedChildrenInvalidated = true;
            return;
        }
        g gVarC0 = C0();
        if (gVarC0 != null) {
            gVarC0.x1();
        }
    }

    public final NodeCoordinator y0() {
        return this.nodes.getOuterCoordinator();
    }

    public final void y1(int x15, int y15) {
        a2.a placementScope;
        NodeCoordinator nodeCoordinatorB0;
        if (this.intrinsicsUsageByParent == EnumC0220g.NotUsed) {
            E();
        }
        g gVarC0 = C0();
        if (gVarC0 == null || (nodeCoordinatorB0 = gVarC0.b0()) == null || (placementScope = nodeCoordinatorB0.getPlacementScope()) == null) {
            placementScope = g0.b(this).getPlacementScope();
        }
        a2.a.I(placementScope, o0(), x15, y15, 0.0f, 4, null);
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final long getOuterToInnerOffset() {
        return this.outerToInnerOffset;
    }

    public g(boolean z15, int i15) {
        this.isVirtual = z15;
        this.semanticsId = i15;
        this.outerToInnerOffset = c5.n.INSTANCE.a();
        this.outerToInnerOffsetDirty = true;
        this.rectInParentDirty = true;
        this._foldedChildren = new n0<>(new n2.c(new g[16], 0), new i());
        this._zSortedChildren = new n2.c<>(new g[16], 0);
        this.zSortedChildrenInvalidated = true;
        this.measurePolicy = f10091u0;
        this.density = g0.f70337a;
        this.layoutDirection = t.Ltr;
        this.viewConfiguration = f10093w0;
        this.compositionLocalMap = e0.INSTANCE.a();
        EnumC0220g enumC0220g = EnumC0220g.NotUsed;
        this.intrinsicsUsageByParent = enumC0220g;
        this.previousIntrinsicsUsageByParent = enumC0220g;
        this.nodes = new p0(this);
        this.layoutDelegate = new androidx.compose.ui.node.h(this);
        this.innerLayerCoordinatorIsDirty = true;
        this._modifier = f3.m.INSTANCE;
    }

    public /* synthetic */ g(boolean z15, int i15, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? false : z15, (i16 & 2) != 0 ? n4.v.b() : i15);
    }
}
