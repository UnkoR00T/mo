package CON;

import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.Window;
import androidx.p016lifecycle.C6451z0;
import androidx.p016lifecycle.y0;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import p071kotlin.Metadata;
import p7.CreationExtras;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ì\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0016\u0018\u0000 Ú\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\u00022\u00020\n2\u00020\u000b2\u00020\u00022\u00020\f2\u00020\r2\u00020\u00022\u00020\u000e2\u00020\u000f:\b\u008a\u0001\u0092\u0001\u0096\u0001Û\u0001B\u0007¢\u0006\u0004\b\u0010\u0010\u0011B\u0013\b\u0017\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0010\u0010\u0014J\u000f\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0016\u0010\u0011J\u0017\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0014¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u00152\u0006\u0010\"\u001a\u00020\u001eH\u0015¢\u0006\u0004\b#\u0010!J\u000f\u0010$\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u0002H\u0017¢\u0006\u0004\b&\u0010%J\u0019\u0010(\u001a\u00020\u00152\b\b\u0001\u0010'\u001a\u00020\u0012H\u0016¢\u0006\u0004\b(\u0010\u0014J\u0019\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)H\u0016¢\u0006\u0004\b(\u0010+J#\u0010(\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b(\u0010.J#\u0010/\u001a\u00020\u00152\b\u0010*\u001a\u0004\u0018\u00010)2\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b/\u0010.J\u000f\u00100\u001a\u00020\u0015H\u0017¢\u0006\u0004\b0\u0010\u0011J\u0015\u00103\u001a\u00020\u00152\u0006\u00102\u001a\u000201¢\u0006\u0004\b3\u00104J)\u00109\u001a\u0002082\u0006\u00105\u001a\u00020\u00122\b\u0010*\u001a\u0004\u0018\u00010)2\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b9\u0010:J\u001f\u0010;\u001a\u0002082\u0006\u00105\u001a\u00020\u00122\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\b;\u0010<J\u001f\u0010?\u001a\u0002082\u0006\u00105\u001a\u00020\u00122\u0006\u0010>\u001a\u00020=H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u0010A\u001a\u00020\u00152\u0006\u00105\u001a\u00020\u00122\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\bA\u0010BJ\u0017\u0010E\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010G\u001a\u00020\u00152\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bG\u0010FJ\u000f\u0010H\u001a\u00020\u0015H\u0016¢\u0006\u0004\bH\u0010\u0011J\u000f\u0010I\u001a\u00020\u0015H\u0017¢\u0006\u0004\bI\u0010\u0011J\u001f\u0010M\u001a\u00020\u00152\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u0012H\u0017¢\u0006\u0004\bM\u0010NJ)\u0010M\u001a\u00020\u00152\u0006\u0010K\u001a\u00020J2\u0006\u0010L\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bM\u0010PJA\u0010V\u001a\u00020\u00152\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00122\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u0012H\u0017¢\u0006\u0004\bV\u0010WJK\u0010V\u001a\u00020\u00152\u0006\u0010K\u001a\u00020Q2\u0006\u0010L\u001a\u00020\u00122\b\u0010R\u001a\u0004\u0018\u00010J2\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u00122\u0006\u0010U\u001a\u00020\u00122\b\u0010O\u001a\u0004\u0018\u00010\u001eH\u0017¢\u0006\u0004\bV\u0010XJ)\u0010[\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00122\u0006\u0010Y\u001a\u00020\u00122\b\u0010Z\u001a\u0004\u0018\u00010JH\u0015¢\u0006\u0004\b[\u0010\\J-\u0010b\u001a\u00020\u00152\u0006\u0010L\u001a\u00020\u00122\f\u0010_\u001a\b\u0012\u0004\u0012\u00020^0]2\u0006\u0010a\u001a\u00020`H\u0017¢\u0006\u0004\bb\u0010cJI\u0010m\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\u0006\u0010i\u001a\u00020h2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bm\u0010nJA\u0010o\u001a\b\u0012\u0004\u0012\u00028\u00000l\"\u0004\b\u0000\u0010d\"\u0004\b\u0001\u0010e2\u0012\u0010g\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010f2\f\u0010k\u001a\b\u0012\u0004\u0012\u00028\u00010j¢\u0006\u0004\bo\u0010pJ\u0017\u0010s\u001a\u00020\u00152\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0004\bs\u0010tJ\u001b\u0010v\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bv\u0010wJ\u001b\u0010x\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020q0u¢\u0006\u0004\bx\u0010wJ\u0017\u0010z\u001a\u00020\u00152\u0006\u0010y\u001a\u00020\u0012H\u0017¢\u0006\u0004\bz\u0010\u0014J\u001b\u0010{\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0004\b{\u0010wJ\u001b\u0010|\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120u¢\u0006\u0004\b|\u0010wJ\u0017\u0010}\u001a\u00020\u00152\u0006\u0010K\u001a\u00020JH\u0015¢\u0006\u0004\b}\u0010~J\u001b\u0010\u007f\u001a\u00020\u00152\f\u00102\u001a\b\u0012\u0004\u0012\u00020J0u¢\u0006\u0004\b\u007f\u0010wJ\u001b\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u000208H\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J#\u0010\u0081\u0001\u001a\u00020\u00152\u0007\u0010\u0080\u0001\u001a\u0002082\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0081\u0001\u0010\u0083\u0001J\u001e\u0010\u0085\u0001\u001a\u00020\u00152\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010u¢\u0006\u0005\b\u0085\u0001\u0010wJ\u001e\u0010\u0086\u0001\u001a\u00020\u00152\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0084\u00010u¢\u0006\u0005\b\u0086\u0001\u0010wJ\u001b\u0010\u0088\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u000208H\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0082\u0001J#\u0010\u0088\u0001\u001a\u00020\u00152\u0007\u0010\u0087\u0001\u001a\u0002082\u0006\u0010r\u001a\u00020qH\u0017¢\u0006\u0006\b\u0088\u0001\u0010\u0083\u0001J\u001e\u0010\u008a\u0001\u001a\u00020\u00152\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010u¢\u0006\u0005\b\u008a\u0001\u0010wJ\u001e\u0010\u008b\u0001\u001a\u00020\u00152\r\u00102\u001a\t\u0012\u0005\u0012\u00030\u0089\u00010u¢\u0006\u0005\b\u008b\u0001\u0010wJ\u0011\u0010\u008c\u0001\u001a\u00020\u0015H\u0015¢\u0006\u0005\b\u008c\u0001\u0010\u0011J\u0011\u0010\u008d\u0001\u001a\u00020\u0015H\u0016¢\u0006\u0005\b\u008d\u0001\u0010\u0011R\u0018\u0010\u0090\u0001\u001a\u00030\u008e\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008f\u0001R\u0018\u0010\u0094\u0001\u001a\u00030\u0091\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001f\u0010\u0099\u0001\u001a\u00030\u0095\u00018\u0002X\u0082\u0004¢\u0006\u000f\n\u0006\b\u0096\u0001\u0010\u0097\u0001\u0012\u0005\b\u0098\u0001\u0010\u0011R\u001c\u0010\u009d\u0001\u001a\u0005\u0018\u00010\u009a\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009b\u0001\u0010\u009c\u0001R\u0017\u0010 \u0001\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009f\u0001R!\u0010¦\u0001\u001a\u00030¡\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001R\u0016\u0010\u0013\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b|\u0010dR\u0018\u0010ª\u0001\u001a\u00030§\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¨\u0001\u0010©\u0001R\u001c\u0010®\u0001\u001a\u00020h8\u0006¢\u0006\u0010\n\u0006\b«\u0001\u0010¬\u0001\u001a\u0006\b\u009b\u0001\u0010\u00ad\u0001R$\u0010±\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020q0u0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u008b\u0001\u0010°\u0001R$\u0010³\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00120u0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b²\u0001\u0010°\u0001R$\u0010µ\u0001\u001a\u000f\u0012\n\u0012\b\u0012\u0004\u0012\u00020J0u0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010°\u0001R%\u0010¶\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0084\u00010u0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0085\u0001\u0010°\u0001R%\u0010¸\u0001\u001a\u0010\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030\u0089\u00010u0¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b·\u0001\u0010°\u0001R\u001f\u0010»\u0001\u001a\n\u0012\u0005\u0012\u00030¹\u00010¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bº\u0001\u0010°\u0001R\u0018\u0010¼\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0086\u0001\u0010\u007fR\u0018\u0010¾\u0001\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b½\u0001\u0010\u007fR!\u0010Ã\u0001\u001a\u00030¿\u00018BX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÀ\u0001\u0010£\u0001\u001a\u0006\bÁ\u0001\u0010Â\u0001R!\u0010Ç\u0001\u001a\u00030Ä\u00018VX\u0096\u0084\u0002¢\u0006\u0010\n\u0006\bÅ\u0001\u0010£\u0001\u001a\u0006\bÀ\u0001\u0010Æ\u0001R\u001f\u0010Ê\u0001\u001a\u00020\u00178FX\u0086\u0084\u0002¢\u0006\u000f\n\u0005\bG\u0010£\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R\u0018\u0010Î\u0001\u001a\u00030Ë\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ð\u0001\u001a\u00030\u009a\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010Ï\u0001R\u0018\u0010Ó\u0001\u001a\u00030Ñ\u00018WX\u0096\u0004¢\u0006\b\u001a\u0006\bÅ\u0001\u0010Ò\u0001R\u0018\u0010Ö\u0001\u001a\u00030Ô\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010Õ\u0001R\u0015\u0010Ù\u0001\u001a\u00030×\u00018F¢\u0006\b\u001a\u0006\b¨\u0001\u0010Ø\u0001¨\u0006Ü\u0001"}, d2 = {"LCON/p;", "Ls5/h;", "", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/y0;", "Landroidx/lifecycle/h;", "Lua/j;", "LCON/s0;", "Lha/d;", "LNUl/i;", "Lu5/b;", "Lu5/c;", "Ls5/p;", "Ls5/q;", "Lj6/o;", "LCON/i0;", "<init>", "()V", "", "contentLayoutId", "(I)V", "Loq/i0;", "c0", "LCON/q0;", "dispatcher", "W", "(LCON/q0;)V", "LCON/p$d;", "a0", "()LCON/p$d;", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "outState", "onSaveInstanceState", "onRetainNonConfigurationInstance", "()Ljava/lang/Object;", "o0", "layoutResID", "setContentView", "Landroid/view/View;", "view", "(Landroid/view/View;)V", "Landroid/view/ViewGroup$LayoutParams;", "params", "(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V", "addContentView", "h0", "LnUl/a0;", "listener", "Y", "(LnUl/a0;)V", "featureId", "Landroid/view/Menu;", "menu", "", "onPreparePanel", "(ILandroid/view/View;Landroid/view/Menu;)Z", "onCreatePanelMenu", "(ILandroid/view/Menu;)Z", "Landroid/view/MenuItem;", "item", "onMenuItemSelected", "(ILandroid/view/MenuItem;)Z", "onPanelClosed", "(ILandroid/view/Menu;)V", "Lj6/r;", "provider", "B", "(Lj6/r;)V", "y", "i0", "onBackPressed", "Landroid/content/Intent;", "intent", "requestCode", "startActivityForResult", "(Landroid/content/Intent;I)V", "options", "(Landroid/content/Intent;ILandroid/os/Bundle;)V", "Landroid/content/IntentSender;", "fillInIntent", "flagsMask", "flagsValues", "extraFlags", "startIntentSenderForResult", "(Landroid/content/IntentSender;ILandroid/content/Intent;III)V", "(Landroid/content/IntentSender;ILandroid/content/Intent;IIILandroid/os/Bundle;)V", "resultCode", "data", "onActivityResult", "(IILandroid/content/Intent;)V", "", "", "permissions", "", "grantResults", "onRequestPermissionsResult", "(I[Ljava/lang/String;[I)V", "I", "O", "LnuL/b0;", "contract", "LNUl/h;", "registry", "LNUl/d;", "callback", "LNUl/e;", "q0", "(LnuL/b0;LNUl/h;LNUl/d;)LNUl/e;", "p0", "(LnuL/b0;LNUl/d;)LNUl/e;", "Landroid/content/res/Configuration;", "newConfig", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "Li6/a;", "i", "(Li6/a;)V", "u", "level", "onTrimMemory", "A", "j", "onNewIntent", "(Landroid/content/Intent;)V", "Z", "isInMultiWindowMode", "onMultiWindowModeChanged", "(Z)V", "(ZLandroid/content/res/Configuration;)V", "Ls5/i;", "q", "t", "isInPictureInPictureMode", "onPictureInPictureModeChanged", "Ls5/t;", "c", "m", "onUserLeaveHint", "reportFullyDrawn", "LnUl/z;", "LnUl/z;", "contextAwareHelper", "Lj6/p;", "d", "Lj6/p;", "menuHostHelper", "Lua/i;", "e", "Lua/i;", "getSavedStateRegistryController$annotations", "savedStateRegistryController", "Landroidx/lifecycle/x0;", "f", "Landroidx/lifecycle/x0;", "_viewModelStore", "g", "LCON/p$d;", "reportFullyDrawnExecutor", "LCON/h0;", "h", "Loq/k;", "f0", "()LCON/h0;", "fullyDrawnReporter", "Ljava/util/concurrent/atomic/AtomicInteger;", "k", "Ljava/util/concurrent/atomic/AtomicInteger;", "nextLocalRequestCode", "l", "LNUl/h;", "()LNUl/h;", "activityResultRegistry", "Ljava/util/concurrent/CopyOnWriteArrayList;", "Ljava/util/concurrent/CopyOnWriteArrayList;", "onConfigurationChangedListeners", "n", "onTrimMemoryListeners", "p", "onNewIntentListeners", "onMultiWindowModeChangedListeners", "r", "onPictureInPictureModeChangedListeners", "Ljava/lang/Runnable;", "s", "onUserLeaveHintListeners", "dispatchingOnMultiWindowModeChanged", "v", "dispatchingOnPictureInPictureModeChanged", "Lha/a;", "w", "g0", "()Lha/a;", "onBackPressedInput", "Landroidx/lifecycle/w0$c;", "x", "()Landroidx/lifecycle/w0$c;", "defaultViewModelProviderFactory", "o", "()LCON/q0;", "onBackPressedDispatcher", "Landroidx/lifecycle/j;", "a", "()Landroidx/lifecycle/j;", "lifecycle", "()Landroidx/lifecycle/x0;", "viewModelStore", "Lp7/a;", "()Lp7/a;", "defaultViewModelCreationExtras", "Lha/c;", "()Lha/c;", "navigationEventDispatcher", "Lua/g;", "()Lua/g;", "savedStateRegistry", "z", "b", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class p extends s5.h implements androidx.p016lifecycle.q, y0, androidx.p016lifecycle.h, ua.j, s0, ha.d, p006NUl.i, u5.b, u5.c, s5.p, s5.q, j6.o, i0 {

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private static final b f176z = new b(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final p083nUl.z contextAwareHelper;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final j6.p menuHostHelper;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final ua.i savedStateRegistryController;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.x0 _viewModelStore;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final d reportFullyDrawnExecutor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final oq.k fullyDrawnReporter;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private int contentLayoutId;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final AtomicInteger nextLocalRequestCode;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final p006NUl.h activityResultRegistry;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<i6.a<Configuration>> onConfigurationChangedListeners;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<i6.a<Integer>> onTrimMemoryListeners;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<i6.a<Intent>> onNewIntentListeners;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<i6.a<s5.i>> onMultiWindowModeChangedListeners;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<i6.a<s5.t>> onPictureInPictureModeChangedListeners;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final CopyOnWriteArrayList<Runnable> onUserLeaveHintListeners;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchingOnMultiWindowModeChanged;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private boolean dispatchingOnPictureInPictureModeChanged;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final oq.k onBackPressedInput;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final oq.k defaultViewModelProviderFactory;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final oq.k onBackPressedDispatcher;

    @Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"CON/p$a", "Landroidx/lifecycle/n;", "Landroidx/lifecycle/q;", "source", "Landroidx/lifecycle/j$a;", "event", "Loq/i0;", "m", "(Landroidx/lifecycle/q;Landroidx/lifecycle/j$a;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class a implements androidx.p016lifecycle.n {
        a() {
        }

        @Override // androidx.p016lifecycle.n
        public void m(androidx.p016lifecycle.q source, androidx.lifecycle.j.a event) {
            p.this.c0();
            p.this.getLifecycleRegistry().d(this);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LCON/p$b;", "", "<init>", "()V", "", "ACTIVITY_RESULT_TAG", "Ljava/lang/String;", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class b {
        public /* synthetic */ b(fr.k kVar) {
            this();
        }

        private b() {
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u0004\u0018\u00010\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0005\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0010\u001a\u0004\u0018\u00010\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\f\u001a\u0004\b\u0004\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0011"}, d2 = {"LCON/p$c;", "", "<init>", "()V", "a", "Ljava/lang/Object;", "getCustom", "()Ljava/lang/Object;", "b", "(Ljava/lang/Object;)V", "custom", "Landroidx/lifecycle/x0;", "Landroidx/lifecycle/x0;", "()Landroidx/lifecycle/x0;", "c", "(Landroidx/lifecycle/x0;)V", "viewModelStore", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private Object custom;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private androidx.p016lifecycle.x0 viewModelStore;

        /* JADX INFO: renamed from: a, reason: from getter */
        public final androidx.p016lifecycle.x0 getViewModelStore() {
            return this.viewModelStore;
        }

        public final void b(Object obj) {
            this.custom = obj;
        }

        public final void c(androidx.p016lifecycle.x0 x0Var) {
            this.viewModelStore = x0Var;
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bb\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"LCON/p$d;", "Ljava/util/concurrent/Executor;", "Landroid/view/View;", "view", "Loq/i0;", "c0", "(Landroid/view/View;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private interface d extends Executor {
        void H();

        void c0(View view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\b\b\u0082\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\u000b\u001a\u00020\bH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000e\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0010\u0010\fJ\u000f\u0010\u0011\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0011\u0010\fR\u0017\u0010\u0017\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R$\u0010\u001d\u001a\u0004\u0018\u00010\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u000fR\"\u0010%\u001a\u00020\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"LCON/p$e;", "LCON/p$d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Ljava/lang/Runnable;", "<init>", "(LCON/p;)V", "Landroid/view/View;", "view", "Loq/i0;", "c0", "(Landroid/view/View;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()V", "runnable", "execute", "(Ljava/lang/Runnable;)V", "onDraw", "run", "", "a", "J", "getEndWatchTimeMillis", "()J", "endWatchTimeMillis", "b", "Ljava/lang/Runnable;", "getCurrentRunnable", "()Ljava/lang/Runnable;", "setCurrentRunnable", "currentRunnable", "", "c", "Z", "getOnDrawScheduled", "()Z", "setOnDrawScheduled", "(Z)V", "onDrawScheduled", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    final class e implements d, ViewTreeObserver.OnDrawListener, Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final long endWatchTimeMillis = SystemClock.uptimeMillis() + ((long) 10000);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private Runnable currentRunnable;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private boolean onDrawScheduled;

        public e() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void c(e eVar) {
            Runnable runnable = eVar.currentRunnable;
            if (runnable != null) {
                runnable.run();
                eVar.currentRunnable = null;
            }
        }

        @Override // CON.p.d
        public void H() {
            p.this.getWindow().getDecorView().removeCallbacks(this);
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }

        @Override // CON.p.d
        public void c0(View view) {
            if (this.onDrawScheduled) {
                return;
            }
            this.onDrawScheduled = true;
            view.getViewTreeObserver().addOnDrawListener(this);
        }

        @Override // java.util.concurrent.Executor
        public void execute(Runnable runnable) {
            this.currentRunnable = runnable;
            View decorView = p.this.getWindow().getDecorView();
            if (!this.onDrawScheduled) {
                decorView.postOnAnimation(new Runnable() { // from class: CON.q
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.e.c(this.f206a);
                    }
                });
            } else if (fr.t.c(Looper.myLooper(), Looper.getMainLooper())) {
                decorView.invalidate();
            } else {
                decorView.postInvalidate();
            }
        }

        @Override // android.view.ViewTreeObserver.OnDrawListener
        public void onDraw() {
            Runnable runnable = this.currentRunnable;
            if (runnable == null) {
                if (SystemClock.uptimeMillis() > this.endWatchTimeMillis) {
                    this.onDrawScheduled = false;
                    p.this.getWindow().getDecorView().post(this);
                    return;
                }
                return;
            }
            runnable.run();
            this.currentRunnable = null;
            if (p.this.f0().c()) {
                this.onDrawScheduled = false;
                p.this.getWindow().getDecorView().post(this);
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            p.this.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(this);
        }
    }

    @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001JI\u0010\f\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u00032\u0006\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00062\u0006\u0010\b\u001a\u00028\u00002\b\u0010\n\u001a\u0004\u0018\u00010\tH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"CON/p$f", "LNUl/h;", "I", "O", "", "requestCode", "LnuL/b0;", "contract", "input", "Ls5/c;", "options", "Loq/i0;", "k", "(ILnuL/b0;Ljava/lang/Object;Ls5/c;)V", "activity"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class f extends p006NUl.h {
        f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void u(f fVar, int i15, nuL.b0.a aVar) {
            fVar.g(i15, aVar.a());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void v(f fVar, int i15, IntentSender.SendIntentException sendIntentException) {
            fVar.f(i15, 0, new Intent().setAction("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.SEND_INTENT_EXCEPTION", sendIntentException));
        }

        @Override // p006NUl.h
        public <I, O> void k(final int requestCode, p087nuL.b0<I, O> contract, I input, s5.c options) {
            Bundle bundleExtra;
            final int i15;
            p pVar = p.this;
            final nuL.b0.a<O> aVarB = contract.b(pVar, input);
            if (aVarB != null) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: CON.r
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.f.u(this.f216a, requestCode, aVarB);
                    }
                });
                return;
            }
            Intent intentA = contract.a(pVar, input);
            if (intentA.getExtras() != null && intentA.getExtras().getClassLoader() == null) {
                intentA.setExtrasClassLoader(pVar.getClassLoader());
            }
            if (intentA.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
                bundleExtra = intentA.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                intentA.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            } else {
                bundleExtra = null;
            }
            Bundle bundle = bundleExtra;
            if (fr.t.c("androidx.activity.result.contract.action.REQUEST_PERMISSIONS", intentA.getAction())) {
                String[] stringArrayExtra = intentA.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                if (stringArrayExtra == null) {
                    stringArrayExtra = new String[0];
                }
                s5.b.u(pVar, stringArrayExtra, requestCode);
                return;
            }
            if (!fr.t.c("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST", intentA.getAction())) {
                s5.b.v(pVar, intentA, requestCode, bundle);
                return;
            }
            p006NUl.j jVar = (p006NUl.j) intentA.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i15 = requestCode;
                try {
                    s5.b.w(pVar, jVar.getIntentSender(), i15, jVar.getFillInIntent(), jVar.getFlagsMask(), jVar.getFlagsValues(), 0, bundle);
                    oq.i0 i0Var = oq.i0.f148189a;
                } catch (IntentSender.SendIntentException e15) {
                    e = e15;
                    final IntentSender.SendIntentException sendIntentException = e;
                    new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: CON.s
                        @Override // java.lang.Runnable
                        public final void run() {
                            p.f.v(this.f220a, i15, sendIntentException);
                        }
                    });
                }
            } catch (IntentSender.SendIntentException e16) {
                e = e16;
                i15 = requestCode;
            }
        }
    }

    public p() {
        this.contextAwareHelper = new p083nUl.z();
        this.menuHostHelper = new j6.p(new Runnable() { // from class: CON.c
            @Override // java.lang.Runnable
            public final void run() {
                p.j0(this.f144a);
            }
        });
        ua.i iVarB = ua.i.INSTANCE.b(this);
        this.savedStateRegistryController = iVarB;
        this.reportFullyDrawnExecutor = a0();
        this.fullyDrawnReporter = oq.l.a(new er.a() { // from class: CON.g
            @Override // er.a
            public final Object a() {
                return p.d0(this.f150a);
            }
        });
        this.nextLocalRequestCode = new AtomicInteger();
        this.activityResultRegistry = new f();
        this.onConfigurationChangedListeners = new CopyOnWriteArrayList<>();
        this.onTrimMemoryListeners = new CopyOnWriteArrayList<>();
        this.onNewIntentListeners = new CopyOnWriteArrayList<>();
        this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList<>();
        this.onUserLeaveHintListeners = new CopyOnWriteArrayList<>();
        this.onBackPressedInput = oq.l.a(new er.a() { // from class: CON.h
            @Override // er.a
            public final Object a() {
                return p.n0(this.f152a);
            }
        });
        if (getLifecycleRegistry() == null) {
            throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
        }
        getLifecycleRegistry().a(new androidx.p016lifecycle.n() { // from class: CON.i
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                p.R(this.f161a, qVar, aVar);
            }
        });
        getLifecycleRegistry().a(new androidx.p016lifecycle.n() { // from class: CON.j
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                p.S(this.f162a, qVar, aVar);
            }
        });
        getLifecycleRegistry().a(new a());
        iVarB.c();
        androidx.p016lifecycle.l0.c(this);
        k().c("android:support:activity-result", new ua.g.b() { // from class: CON.k
            @Override // ua.g.b
            public final Bundle a() {
                return p.T(this.f163a);
            }
        });
        Y(new p083nUl.a0() { // from class: CON.l
            @Override // p083nUl.a0
            public final void a(Context context) {
                p.U(this.f164a, context);
            }
        });
        this.defaultViewModelProviderFactory = oq.l.a(new er.a() { // from class: CON.m
            @Override // er.a
            public final Object a() {
                return p.b0(this.f165a);
            }
        });
        this.onBackPressedDispatcher = oq.l.a(new er.a() { // from class: CON.n
            @Override // er.a
            public final Object a() {
                return p.k0(this.f171a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void R(p pVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        Window window;
        View viewPeekDecorView;
        if (aVar != androidx.lifecycle.j.a.ON_STOP || (window = pVar.getWindow()) == null || (viewPeekDecorView = window.peekDecorView()) == null) {
            return;
        }
        viewPeekDecorView.cancelPendingInputEvents();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(p pVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_DESTROY) {
            pVar.contextAwareHelper.b();
            if (!pVar.isChangingConfigurations()) {
                pVar.h().a();
            }
            pVar.reportFullyDrawnExecutor.H();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Bundle T(p pVar) {
        Bundle bundle = new Bundle();
        pVar.activityResultRegistry.m(bundle);
        return bundle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void U(p pVar, Context context) {
        Bundle bundleA = pVar.k().a("android:support:activity-result");
        if (bundleA != null) {
            pVar.activityResultRegistry.l(bundleA);
        }
    }

    private final void W(final q0 dispatcher) {
        getLifecycleRegistry().a(new androidx.p016lifecycle.n() { // from class: CON.f
            @Override // androidx.p016lifecycle.n
            public final void m(androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
                p.X(dispatcher, this, qVar, aVar);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void X(q0 q0Var, p pVar, androidx.p016lifecycle.q qVar, androidx.lifecycle.j.a aVar) {
        if (aVar == androidx.lifecycle.j.a.ON_CREATE) {
            q0Var.k(pVar.getOnBackInvokedDispatcher());
        }
    }

    private final d a0() {
        return new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.p016lifecycle.p0 b0(p pVar) {
        return new androidx.p016lifecycle.p0(pVar.getApplication(), pVar, pVar.getIntent() != null ? pVar.getIntent().getExtras() : null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c0() {
        if (this._viewModelStore == null) {
            c cVar = (c) getLastNonConfigurationInstance();
            if (cVar != null) {
                this._viewModelStore = cVar.getViewModelStore();
            }
            if (this._viewModelStore == null) {
                this._viewModelStore = new androidx.p016lifecycle.x0();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final h0 d0(final p pVar) {
        return new h0(pVar.reportFullyDrawnExecutor, new er.a() { // from class: CON.e
            @Override // er.a
            public final Object a() {
                return p.e0(this.f147a);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 e0(p pVar) {
        pVar.reportFullyDrawn();
        return oq.i0.f148189a;
    }

    private final ha.a g0() {
        return (ha.a) this.onBackPressedInput.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void j0(p pVar) {
        pVar.i0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q0 k0(final p pVar) {
        final q0 q0Var = new q0(new Runnable() { // from class: CON.o
            @Override // java.lang.Runnable
            public final void run() {
                p.l0(this.f174a);
            }
        });
        if (Build.VERSION.SDK_INT >= 33) {
            if (!fr.t.c(Looper.myLooper(), Looper.getMainLooper())) {
                new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: CON.d
                    @Override // java.lang.Runnable
                    public final void run() {
                        p.m0(this.f145a, q0Var);
                    }
                });
                return q0Var;
            }
            pVar.W(q0Var);
        }
        return q0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l0(p pVar) {
        try {
            super.onBackPressed();
        } catch (IllegalStateException e15) {
            if (!fr.t.c(e15.getMessage(), "Can not perform this action after onSaveInstanceState")) {
                throw e15;
            }
        } catch (NullPointerException e16) {
            if (!fr.t.c(e16.getMessage(), "Attempt to invoke virtual method 'android.os.Handler android.app.FragmentHostCallback.getHandler()' on a null object reference")) {
                throw e16;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m0(p pVar, q0 q0Var) {
        pVar.W(q0Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ha.a n0(p pVar) {
        ha.a aVar = new ha.a();
        pVar.d().c(aVar);
        return aVar;
    }

    @Override // u5.c
    public final void A(i6.a<Integer> listener) {
        this.onTrimMemoryListeners.add(listener);
    }

    @Override // j6.o
    public void B(j6.r provider) {
        this.menuHostHelper.a(provider);
    }

    public final void Y(p083nUl.a0 listener) {
        this.contextAwareHelper.a(listener);
    }

    public final void Z(i6.a<Intent> listener) {
        this.onNewIntentListeners.add(listener);
    }

    @Override // s5.h, androidx.p016lifecycle.q
    /* JADX INFO: renamed from: a */
    public androidx.p016lifecycle.j getLifecycleRegistry() {
        return super.getLifecycleRegistry();
    }

    @Override // android.app.Activity
    public void addContentView(View view, ViewGroup.LayoutParams params) {
        h0();
        this.reportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.addContentView(view, params);
    }

    @Override // s5.q
    public final void c(i6.a<s5.t> listener) {
        this.onPictureInPictureModeChangedListeners.add(listener);
    }

    @Override // ha.d
    public ha.c d() {
        return o().h();
    }

    @Override // p006NUl.i
    /* JADX INFO: renamed from: f, reason: from getter */
    public final p006NUl.h getActivityResultRegistry() {
        return this.activityResultRegistry;
    }

    public h0 f0() {
        return (h0) this.fullyDrawnReporter.getValue();
    }

    @Override // androidx.p016lifecycle.y0
    public androidx.p016lifecycle.x0 h() {
        if (getApplication() == null) {
            throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
        }
        c0();
        return this._viewModelStore;
    }

    public void h0() {
        C6451z0.b(getWindow().getDecorView(), this);
        androidx.p016lifecycle.View.b(getWindow().getDecorView(), this);
        ua.n.b(getWindow().getDecorView(), this);
        x0.b(getWindow().getDecorView(), this);
        w0.a(getWindow().getDecorView(), this);
        ha.r.b(getWindow().getDecorView(), this);
    }

    @Override // u5.b
    public final void i(i6.a<Configuration> listener) {
        this.onConfigurationChangedListeners.add(listener);
    }

    public void i0() {
        invalidateOptionsMenu();
    }

    @Override // u5.c
    public final void j(i6.a<Integer> listener) {
        this.onTrimMemoryListeners.remove(listener);
    }

    @Override // ua.j
    public final ua.g k() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    @Override // s5.q
    public final void m(i6.a<s5.t> listener) {
        this.onPictureInPictureModeChangedListeners.remove(listener);
    }

    @Override // CON.s0
    public final q0 o() {
        return (q0) this.onBackPressedDispatcher.getValue();
    }

    @oq.a
    public Object o0() {
        return null;
    }

    @Override // android.app.Activity
    @oq.a
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (this.activityResultRegistry.f(requestCode, resultCode, data)) {
            return;
        }
        super.onActivityResult(requestCode, resultCode, data);
    }

    @Override // android.app.Activity
    @oq.a
    public void onBackPressed() {
        g0().m();
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Iterator<i6.a<Configuration>> it = this.onConfigurationChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(newConfig);
        }
    }

    @Override // s5.h, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        this.savedStateRegistryController.d(savedInstanceState);
        this.contextAwareHelper.c(this);
        super.onCreate(savedInstanceState);
        androidx.p016lifecycle.h0.INSTANCE.c(this);
        int i15 = this.contentLayoutId;
        if (i15 != 0) {
            setContentView(i15);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onCreatePanelMenu(int featureId, Menu menu) {
        if (featureId != 0) {
            return true;
        }
        super.onCreatePanelMenu(featureId, menu);
        this.menuHostHelper.b(menu, getMenuInflater());
        return true;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onMenuItemSelected(int featureId, MenuItem item) {
        if (super.onMenuItemSelected(featureId, item)) {
            return true;
        }
        if (featureId == 0) {
            return this.menuHostHelper.d(item);
        }
        return false;
    }

    @Override // android.app.Activity
    @oq.a
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
        if (this.dispatchingOnMultiWindowModeChanged) {
            return;
        }
        Iterator<i6.a<s5.i>> it = this.onMultiWindowModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new s5.i(isInMultiWindowMode));
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Iterator<i6.a<Intent>> it = this.onNewIntentListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(intent);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onPanelClosed(int featureId, Menu menu) {
        this.menuHostHelper.c(menu);
        super.onPanelClosed(featureId, menu);
    }

    @Override // android.app.Activity
    @oq.a
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        if (this.dispatchingOnPictureInPictureModeChanged) {
            return;
        }
        Iterator<i6.a<s5.t>> it = this.onPictureInPictureModeChangedListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(new s5.t(isInPictureInPictureMode));
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean onPreparePanel(int featureId, View view, Menu menu) {
        if (featureId != 0) {
            return true;
        }
        super.onPreparePanel(featureId, view, menu);
        this.menuHostHelper.e(menu);
        return true;
    }

    @Override // android.app.Activity
    @oq.a
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        if (this.activityResultRegistry.f(requestCode, -1, new Intent().putExtra("androidx.activity.result.contract.extra.PERMISSIONS", permissions).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", grantResults))) {
            return;
        }
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
    }

    @Override // android.app.Activity
    public final Object onRetainNonConfigurationInstance() {
        c cVar;
        Object objO0 = o0();
        androidx.p016lifecycle.x0 viewModelStore = this._viewModelStore;
        if (viewModelStore == null && (cVar = (c) getLastNonConfigurationInstance()) != null) {
            viewModelStore = cVar.getViewModelStore();
        }
        if (viewModelStore == null && objO0 == null) {
            return null;
        }
        c cVar2 = new c();
        cVar2.b(objO0);
        cVar2.c(viewModelStore);
        return cVar2;
    }

    @Override // s5.h, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        if (getLifecycleRegistry() instanceof androidx.p016lifecycle.s) {
            ((androidx.p016lifecycle.s) getLifecycleRegistry()).n(androidx.lifecycle.j.b.CREATED);
        }
        super.onSaveInstanceState(outState);
        this.savedStateRegistryController.e(outState);
    }

    @Override // android.app.Activity, android.content.ComponentCallbacks2
    public void onTrimMemory(int level) {
        super.onTrimMemory(level);
        Iterator<i6.a<Integer>> it = this.onTrimMemoryListeners.iterator();
        while (it.hasNext()) {
            it.next().accept(Integer.valueOf(level));
        }
    }

    @Override // android.app.Activity
    protected void onUserLeaveHint() {
        super.onUserLeaveHint();
        Iterator<Runnable> it = this.onUserLeaveHintListeners.iterator();
        while (it.hasNext()) {
            it.next().run();
        }
    }

    public final <I, O> p006NUl.e<I> p0(p087nuL.b0<I, O> contract, p006NUl.d<O> callback) {
        return q0(contract, this.activityResultRegistry, callback);
    }

    @Override // s5.p
    public final void q(i6.a<s5.i> listener) {
        this.onMultiWindowModeChangedListeners.add(listener);
    }

    public final <I, O> p006NUl.e<I> q0(p087nuL.b0<I, O> contract, p006NUl.h registry, p006NUl.d<O> callback) {
        return registry.n("activity_rq#" + this.nextLocalRequestCode.getAndIncrement(), this, contract, callback);
    }

    @Override // android.app.Activity
    public void reportFullyDrawn() {
        try {
            if (eb.a.h()) {
                eb.a.c("reportFullyDrawn() for ComponentActivity");
            }
            super.reportFullyDrawn();
            f0().b();
        } finally {
            eb.a.f();
        }
    }

    @Override // android.app.Activity
    public void setContentView(int layoutResID) {
        h0();
        this.reportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(layoutResID);
    }

    @Override // android.app.Activity
    @oq.a
    public void startActivityForResult(Intent intent, int requestCode) {
        super.startActivityForResult(intent, requestCode);
    }

    @Override // android.app.Activity
    @oq.a
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags);
    }

    @Override // s5.p
    public final void t(i6.a<s5.i> listener) {
        this.onMultiWindowModeChangedListeners.remove(listener);
    }

    @Override // u5.b
    public final void u(i6.a<Configuration> listener) {
        this.onConfigurationChangedListeners.remove(listener);
    }

    @Override // androidx.p016lifecycle.h
    public androidx.lifecycle.w0.c w() {
        return (androidx.lifecycle.w0.c) this.defaultViewModelProviderFactory.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.p016lifecycle.h
    public CreationExtras x() {
        p7.d dVar = new p7.d(0 == true ? 1 : 0, 1, 0 == true ? 1 : 0);
        if (getApplication() != null) {
            dVar.c(androidx.lifecycle.w0.a.f12845h, getApplication());
        }
        dVar.c(androidx.p016lifecycle.l0.f12795a, this);
        dVar.c(androidx.p016lifecycle.l0.f12796b, this);
        Intent intent = getIntent();
        Bundle extras = intent != null ? intent.getExtras() : null;
        if (extras != null) {
            dVar.c(androidx.p016lifecycle.l0.f12797c, extras);
        }
        return dVar;
    }

    @Override // j6.o
    public void y(j6.r provider) {
        this.menuHostHelper.f(provider);
    }

    @Override // android.app.Activity
    @oq.a
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        super.startActivityForResult(intent, requestCode, options);
    }

    @Override // android.app.Activity
    @oq.a
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        super.startIntentSenderForResult(intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
    }

    @Override // android.app.Activity
    public void onMultiWindowModeChanged(boolean isInMultiWindowMode, Configuration newConfig) {
        this.dispatchingOnMultiWindowModeChanged = true;
        try {
            super.onMultiWindowModeChanged(isInMultiWindowMode, newConfig);
            this.dispatchingOnMultiWindowModeChanged = false;
            Iterator<i6.a<s5.i>> it = this.onMultiWindowModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new s5.i(isInMultiWindowMode, newConfig));
            }
        } catch (Throwable th4) {
            this.dispatchingOnMultiWindowModeChanged = false;
            throw th4;
        }
    }

    @Override // android.app.Activity
    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode, Configuration newConfig) {
        this.dispatchingOnPictureInPictureModeChanged = true;
        try {
            super.onPictureInPictureModeChanged(isInPictureInPictureMode, newConfig);
            this.dispatchingOnPictureInPictureModeChanged = false;
            Iterator<i6.a<s5.t>> it = this.onPictureInPictureModeChangedListeners.iterator();
            while (it.hasNext()) {
                it.next().accept(new s5.t(isInPictureInPictureMode, newConfig));
            }
        } catch (Throwable th4) {
            this.dispatchingOnPictureInPictureModeChanged = false;
            throw th4;
        }
    }

    @Override // android.app.Activity
    public void setContentView(View view) {
        h0();
        this.reportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(view);
    }

    @Override // android.app.Activity
    public void setContentView(View view, ViewGroup.LayoutParams params) {
        h0();
        this.reportFullyDrawnExecutor.c0(getWindow().getDecorView());
        super.setContentView(view, params);
    }

    public p(int i15) {
        this();
        this.contentLayoutId = i15;
    }
}
