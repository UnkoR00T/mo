package androidx.compose.ui.viewinterop;

import a4.m0;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.node.NodeCoordinator;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.platform.f2;
import androidx.compose.ui.platform.s3;
import androidx.p016lifecycle.C6451z0;
import c5.z;
import g4.b1;
import g4.c1;
import j6.a1;
import j6.f1;
import j6.l0;
import j6.w;
import j6.x;
import j6.y;
import java.util.List;
import ju.p0;
import n3.f0;
import n3.h1;
import n3.s2;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.crypto.CryptoServicesPermission;
import org.conscrypt.BuildConfig;
import p036e4.a2;
import p036e4.b0;
import p036e4.c0;
import p036e4.l1;
import p036e4.v;
import p036e4.v0;
import p036e4.w0;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0011\u0018\u0000 ç\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001SB9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010!\u001a\u00020\u001a2\u0006\u0010\u001f\u001a\u00020\n2\u0006\u0010 \u001a\u00020\nH\u0014¢\u0006\u0004\b!\u0010\"J\r\u0010#\u001a\u00020\u001a¢\u0006\u0004\b#\u0010\u001cJ7\u0010*\u001a\u00020\u001a2\u0006\u0010%\u001a\u00020$2\u0006\u0010&\u001a\u00020\n2\u0006\u0010'\u001a\u00020\n2\u0006\u0010(\u001a\u00020\n2\u0006\u0010)\u001a\u00020\nH\u0014¢\u0006\u0004\b*\u0010+J\u0011\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b-\u0010.J\u0017\u00100\u001a\u00020\u001a2\u0006\u0010/\u001a\u00020$H\u0016¢\u0006\u0004\b0\u00101J\u000f\u00102\u001a\u00020\u001aH\u0014¢\u0006\u0004\b2\u0010\u001cJ\u000f\u00103\u001a\u00020\u001aH\u0014¢\u0006\u0004\b3\u0010\u001cJ%\u00109\u001a\u0004\u0018\u0001082\b\u00105\u001a\u0004\u0018\u0001042\b\u00107\u001a\u0004\u0018\u000106H\u0017¢\u0006\u0004\b9\u0010:J\u001f\u0010=\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000eH\u0016¢\u0006\u0004\b=\u0010>J)\u0010A\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\b\u0010?\u001a\u0004\u0018\u0001062\u0006\u0010@\u001a\u00020$H\u0016¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u001a¢\u0006\u0004\bC\u0010\u001cJ\u0017\u0010E\u001a\u00020\u001a2\u0006\u0010D\u001a\u00020\nH\u0014¢\u0006\u0004\bE\u0010FJ\u0019\u0010I\u001a\u00020$2\b\u0010H\u001a\u0004\u0018\u00010GH\u0016¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020$H\u0016¢\u0006\u0004\bK\u0010LJ/\u0010O\u001a\u00020$2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bO\u0010PJ\u000f\u0010Q\u001a\u00020\nH\u0016¢\u0006\u0004\bQ\u0010RJ/\u0010S\u001a\u00020\u001a2\u0006\u0010;\u001a\u00020\u000e2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010M\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bS\u0010TJ\u001f\u0010U\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bU\u0010VJG\u0010\\\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\n2\u0006\u0010[\u001a\u000204H\u0016¢\u0006\u0004\b\\\u0010]J?\u0010^\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010W\u001a\u00020\n2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020\n2\u0006\u0010Z\u001a\u00020\n2\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\b^\u0010_J7\u0010b\u001a\u00020\u001a2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010`\u001a\u00020\n2\u0006\u0010a\u001a\u00020\n2\u0006\u0010[\u001a\u0002042\u0006\u0010N\u001a\u00020\nH\u0016¢\u0006\u0004\bb\u0010cJ/\u0010g\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020d2\u0006\u0010[\u001a\u00020$H\u0016¢\u0006\u0004\bg\u0010hJ'\u0010i\u001a\u00020$2\u0006\u0010<\u001a\u00020\u000e2\u0006\u0010e\u001a\u00020d2\u0006\u0010f\u001a\u00020dH\u0016¢\u0006\u0004\bi\u0010jJ\u000f\u0010k\u001a\u00020$H\u0016¢\u0006\u0004\bk\u0010LJ\u001f\u0010)\u001a\u00020m2\u0006\u0010l\u001a\u00020\u000e2\u0006\u0010n\u001a\u00020mH\u0016¢\u0006\u0004\b)\u0010oJ'\u0010s\u001a\u00020\n2\u0006\u0010p\u001a\u00020\n2\u0006\u0010q\u001a\u00020\n2\u0006\u0010r\u001a\u00020\nH\u0002¢\u0006\u0004\bs\u0010tJ\u0017\u0010u\u001a\u00020m2\u0006\u0010n\u001a\u00020mH\u0002¢\u0006\u0004\bu\u0010vJ\u0017\u0010y\u001a\u00020w2\u0006\u0010x\u001a\u00020wH\u0002¢\u0006\u0004\by\u0010zJ6\u0010\u0080\u0001\u001a\u00020{*\u00020{2\u0006\u0010|\u001a\u00020\n2\u0006\u0010}\u001a\u00020\n2\u0006\u0010~\u001a\u00020\n2\u0006\u0010\u007f\u001a\u00020\nH\u0002¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0015\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u0082\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b)\u0010\u0083\u0001R\u0019\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\u000e\n\u0005\bS\u0010\u0084\u0001\u001a\u0005\b\u0085\u0001\u0010\u0016R\u0016\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R@\u0010\u0090\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00012\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R\u0019\u0010\u0093\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0001\u0010\u0092\u0001R@\u0010\u0097\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00012\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0094\u0001\u0010\u008b\u0001\u001a\u0006\b\u0095\u0001\u0010\u008d\u0001\"\u0006\b\u0096\u0001\u0010\u008f\u0001R@\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00012\u000e\u0010\u0089\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00018\u0006@DX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0098\u0001\u0010\u008b\u0001\u001a\u0006\b\u0099\u0001\u0010\u008d\u0001\"\u0006\b\u009a\u0001\u0010\u008f\u0001R3\u0010¢\u0001\u001a\u00030\u009c\u00012\b\u0010\u0089\u0001\u001a\u00030\u009c\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bU\u0010\u009d\u0001\u001a\u0006\b\u009e\u0001\u0010\u009f\u0001\"\u0006\b \u0001\u0010¡\u0001R8\u0010©\u0001\u001a\u0012\u0012\u0005\u0012\u00030\u009c\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bb\u0010¤\u0001\u001a\u0006\b¥\u0001\u0010¦\u0001\"\u0006\b§\u0001\u0010¨\u0001R3\u0010°\u0001\u001a\u00030ª\u00012\b\u0010\u0089\u0001\u001a\u00030ª\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b&\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R8\u0010³\u0001\u001a\u0012\u0012\u0005\u0012\u00030ª\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\\\u0010¤\u0001\u001a\u0006\b±\u0001\u0010¦\u0001\"\u0006\b²\u0001\u0010¨\u0001R7\u0010º\u0001\u001a\u0005\u0018\u00010´\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010´\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\b^\u0010µ\u0001\u001a\u0006\b¶\u0001\u0010·\u0001\"\u0006\b¸\u0001\u0010¹\u0001R7\u0010Á\u0001\u001a\u0005\u0018\u00010»\u00012\n\u0010\u0089\u0001\u001a\u0005\u0018\u00010»\u00018\u0006@FX\u0086\u000e¢\u0006\u0017\n\u0005\bO\u0010¼\u0001\u001a\u0006\b½\u0001\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001R\u0017\u0010Ä\u0001\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÂ\u0001\u0010Ã\u0001R\u0019\u0010Ç\u0001\u001a\u00030Å\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b(\u0010Æ\u0001R\u001a\u0010n\u001a\u0004\u0018\u00010m8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010É\u0001R1\u0010Ì\u0001\u001a\u001b\u0012\u0007\u0012\u0005\u0018\u00010Ê\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u0001j\u0005\u0018\u0001`Ë\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b'\u0010¤\u0001R\u001d\u0010Í\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bl\u0010\u008b\u0001R\u001e\u0010Ï\u0001\u001a\t\u0012\u0004\u0012\u00020\u001a0\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÎ\u0001\u0010\u008b\u0001R8\u0010Ó\u0001\u001a\u0011\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020\u001a\u0018\u00010£\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÐ\u0001\u0010¤\u0001\u001a\u0006\bÑ\u0001\u0010¦\u0001\"\u0006\bÒ\u0001\u0010¨\u0001R\u0016\u00105\u001a\u0002048\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÔ\u0001\u0010Ã\u0001R\u0019\u0010Ö\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÕ\u0001\u0010\u0082\u0001R\u0019\u0010×\u0001\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0082\u0001R\u0017\u0010Ú\u0001\u001a\u00030Ø\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010Ù\u0001R\u0018\u0010Û\u0001\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bu\u0010\u0092\u0001R\u001c\u0010à\u0001\u001a\u00030Ü\u00018\u0006¢\u0006\u000f\n\u0005\bC\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010ß\u0001R\u0016\u0010â\u0001\u001a\u00020$8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010LR\u0018\u0010æ\u0001\u001a\u00030ã\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bä\u0001\u0010å\u0001¨\u0006è\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/b;", "Landroid/view/ViewGroup;", "Lj6/w;", "Lm2/n;", "Lg4/b1;", "Lj6/y;", "Landroid/content/Context;", "context", "Lm2/v;", "parentContext", "", "compositeKeyHash", "Lz3/b;", "dispatcher", "Landroid/view/View;", "view", "Landroidx/compose/ui/node/Owner;", "owner", "<init>", "(Landroid/content/Context;Lm2/v;ILz3/b;Landroid/view/View;Landroidx/compose/ui/node/Owner;)V", "Landroidx/compose/ui/viewinterop/InteropView;", "getInteropView", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "Loq/i0;", "o", "()V", "i", "a", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "G", "", "changed", "l", "t", "r", "b", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "disallowIntercept", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "location", "Landroid/graphics/Rect;", "dirty", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "child", "target", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "rectangle", "immediate", "requestChildRectangleOnScreen", "(Landroid/view/View;Landroid/graphics/Rect;Z)Z", ip.a.f96138c, "visibility", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "region", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "shouldDelayChildPressedState", "()Z", "axes", "type", "p", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "c", "(Landroid/view/View;Landroid/view/View;II)V", "j", "(Landroid/view/View;I)V", "dxConsumed", "dyConsumed", "dxUnconsumed", "dyUnconsumed", "consumed", "m", "(Landroid/view/View;IIIII[I)V", "n", "(Landroid/view/View;IIIII)V", "dx", "dy", "k", "(Landroid/view/View;II[II)V", "", "velocityX", "velocityY", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "v", "Lj6/f1;", "insets", "(Landroid/view/View;Lj6/f1;)Lj6/f1;", "min", "max", "preferred", "F", "(III)I", "C", "(Lj6/f1;)Lj6/f1;", "Lj6/a1$a;", "bounds", "B", "(Lj6/a1$a;)Lj6/a1$a;", "Lx5/h;", "left", "top", "right", "bottom", "A", "(Lx5/h;IIII)Lx5/h;", "I", "Lz3/b;", "Landroid/view/View;", "getView", "d", "Landroidx/compose/ui/node/Owner;", "Lkotlin/Function0;", "value", "e", "Ler/a;", "getUpdate", "()Ler/a;", "setUpdate", "(Ler/a;)V", "update", "f", "Z", "hasUpdateBlock", "g", "getReset", "setReset", "reset", "h", "getRelease", "setRelease", BuildConfig.BUILD_TYPE, "Lf3/m;", "Lf3/m;", "getModifier", "()Lf3/m;", "setModifier", "(Lf3/m;)V", "modifier", "Lkotlin/Function1;", "Ler/l;", "getOnModifierChanged$ui", "()Ler/l;", "setOnModifierChanged$ui", "(Ler/l;)V", "onModifierChanged", "Lc5/d;", "Lc5/d;", "getDensity", "()Lc5/d;", "setDensity", "(Lc5/d;)V", "density", "getOnDensityChanged$ui", "setOnDensityChanged$ui", "onDensityChanged", "Landroidx/lifecycle/q;", "Landroidx/lifecycle/q;", "getLifecycleOwner", "()Landroidx/lifecycle/q;", "setLifecycleOwner", "(Landroidx/lifecycle/q;)V", "lifecycleOwner", "Lua/j;", "Lua/j;", "getSavedStateRegistryOwner", "()Lua/j;", "setSavedStateRegistryOwner", "(Lua/j;)V", "savedStateRegistryOwner", "q", "[I", "position", "Lc5/r;", "J", "size", "s", "Lj6/f1;", "Lm3/g;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "bringIntoViewRequester", "runUpdate", "w", "runInvalidate", "x", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "onRequestDisallowInterceptTouchEvent", "y", "z", "lastWidthMeasureSpec", "lastHeightMeasureSpec", "Lj6/x;", "Lj6/x;", "nestedScrollingParentHelper", "isDrawing", "Landroidx/compose/ui/node/g;", "Landroidx/compose/ui/node/g;", "getLayoutNode", "()Landroidx/compose/ui/node/g;", "layoutNode", "K1", "isValidOwnerScope", "Lg4/c1;", "getSnapshotObserver", "()Lg4/c1;", "snapshotObserver", "E", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class b extends ViewGroup implements w, p076m2.n, b1, y {
    public static final int F = 8;
    private static final er.l<b, i0> G = C0235b.f10935b;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int lastHeightMeasureSpec;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final x nestedScrollingParentHelper;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean isDrawing;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final androidx.compose.ui.node.g layoutNode;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final int compositeKeyHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z3.b dispatcher;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final View view;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Owner owner;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> update;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean hasUpdateBlock;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> reset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private er.a<i0> release;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private f3.m modifier;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private er.l<? super f3.m, i0> onModifierChanged;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private er.l<? super c5.d, i0> onDensityChanged;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private androidx.p016lifecycle.q lifecycleOwner;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private ua.j savedStateRegistryOwner;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final int[] position;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private f1 insets;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private er.l<? super m3.g, i0> bringIntoViewRequester;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> runUpdate;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final er.a<i0> runInvalidate;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private er.l<? super Boolean, i0> onRequestDisallowInterceptTouchEvent;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final int[] location;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int lastWidthMeasureSpec;

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"androidx/compose/ui/viewinterop/b$a", "Lj6/a1$b;", "Lj6/a1;", "animation", "Lj6/a1$a;", "bounds", "f", "(Lj6/a1;Lj6/a1$a;)Lj6/a1$a;", "Lj6/f1;", "insets", "", "runningAnimations", "e", "(Lj6/f1;Ljava/util/List;)Lj6/f1;", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a extends a1.b {
        a() {
            super(1);
        }

        @Override // j6.a1.b
        public f1 e(f1 insets, List<a1> runningAnimations) {
            return b.this.C(insets);
        }

        @Override // j6.a1.b
        public a1.a f(a1 animation, a1.a bounds) {
            return b.this.B(bounds);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/b;", "it", "Loq/i0;", "e", "(Landroidx/compose/ui/viewinterop/b;)V"}, k = 3, mv = {2, 1, 0})
    static final class C0235b extends fr.w implements er.l<b, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C0235b f10935b = new C0235b();

        C0235b() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void f(er.a aVar) {
            aVar.a();
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b bVar) {
            e(bVar);
            return i0.f148189a;
        }

        public final void e(b bVar) {
            Handler handler = bVar.getHandler();
            final er.a aVar = bVar.runUpdate;
            handler.post(new Runnable() { // from class: androidx.compose.ui.viewinterop.c
                @Override // java.lang.Runnable
                public final void run() {
                    b.C0235b.f(aVar);
                }
            });
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf3/m;", "it", "Loq/i0;", "c", "(Lf3/m;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends fr.w implements er.l<f3.m, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.g f10936b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f3.m f10937c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(androidx.compose.ui.node.g gVar, f3.m mVar) {
            super(1);
            this.f10936b = gVar;
            this.f10937c = mVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(f3.m mVar) {
            c(mVar);
            return i0.f148189a;
        }

        public final void c(f3.m mVar) {
            this.f10936b.u(mVar.u(this.f10937c));
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lc5/d;", "it", "Loq/i0;", "c", "(Lc5/d;)V"}, k = 3, mv = {2, 1, 0})
    static final class e extends fr.w implements er.l<c5.d, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.g f10938b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.ui.node.g gVar) {
            super(1);
            this.f10938b = gVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(c5.d dVar) {
            c(dVar);
            return i0.f148189a;
        }

        public final void c(c5.d dVar) {
            this.f10938b.b(dVar);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Loq/i0;", "c", "(Landroidx/compose/ui/node/Owner;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends fr.w implements er.l<Owner, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.g f10940c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.ui.node.g gVar) {
            super(1);
            this.f10940c = gVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Owner owner) {
            c(owner);
            return i0.f148189a;
        }

        public final void c(Owner owner) {
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                androidComposeView.t0(b.this, this.f10940c);
            }
            ViewParent parent = b.this.getView().getParent();
            b bVar = b.this;
            if (parent != bVar) {
                bVar.addView(bVar.getView());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/Owner;", "owner", "Loq/i0;", "c", "(Landroidx/compose/ui/node/Owner;)V"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.l<Owner, i0> {
        g() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(Owner owner) {
            c(owner);
            return i0.f148189a;
        }

        public final void c(Owner owner) {
            if (f3.h.isViewFocusFixEnabled && b.this.hasFocus()) {
                owner.getFocusOwner().B(true);
            }
            AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
            if (androidComposeView != null) {
                androidComposeView.h1(b.this);
            }
            b.this.removeAllViewsInLayout();
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0007\u0010\u0005J)\u0010\u000f\u001a\u00020\u000e*\u00020\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J)\u0010\u0013\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J)\u0010\u0015\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0014J)\u0010\u0016\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0014J)\u0010\u0017\u001a\u00020\u0002*\u00020\u00112\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00120\t2\u0006\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0014¨\u0006\u0018"}, d2 = {"androidx/compose/ui/viewinterop/b$h", "Le4/w0;", "", "height", "b", "(I)I", "width", "a", "Le4/y0;", "", "Le4/v0;", "measurables", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "e", "(Le4/y0;Ljava/util/List;J)Le4/x0;", "Le4/w;", "Le4/v;", "c", "(Le4/w;Ljava/util/List;I)I", "i", "h", "f", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements w0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.g f10943b;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static final a f10944b = new a();

            a() {
                super(1);
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
            }
        }

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.b$h$b, reason: collision with other inner class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Le4/a2$a;", "Loq/i0;", "c", "(Le4/a2$a;)V"}, k = 3, mv = {2, 1, 0})
        static final class C0236b extends fr.w implements er.l<a2.a, i0> {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f10945b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ androidx.compose.ui.node.g f10946c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            C0236b(b bVar, androidx.compose.ui.node.g gVar) {
                super(1);
                this.f10945b = bVar;
                this.f10946c = gVar;
            }

            @Override // er.l
            public /* bridge */ /* synthetic */ i0 b(a2.a aVar) {
                c(aVar);
                return i0.f148189a;
            }

            public final void c(a2.a aVar) {
                androidx.compose.ui.viewinterop.d.f(this.f10945b, this.f10946c);
            }
        }

        h(androidx.compose.ui.node.g gVar) {
            this.f10943b = gVar;
        }

        private final int a(int width) {
            b bVar = b.this;
            bVar.measure(bVar.F(0, width, bVar.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return b.this.getMeasuredHeight();
        }

        private final int b(int height) {
            b bVar = b.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            b bVar2 = b.this;
            bVar.measure(iMakeMeasureSpec, bVar2.F(0, height, bVar2.getLayoutParams().height));
            return b.this.getMeasuredWidth();
        }

        @Override // p036e4.w0
        public int c(p036e4.w wVar, List<? extends v> list, int i15) {
            return b(i15);
        }

        @Override // p036e4.w0
        public x0 e(y0 y0Var, List<? extends v0> list, long j15) {
            if (b.this.getChildCount() == 0) {
                return y0.j2(y0Var, c5.b.n(j15), c5.b.m(j15), null, a.f10944b, 4, null);
            }
            if (c5.b.n(j15) != 0) {
                b.this.getChildAt(0).setMinimumWidth(c5.b.n(j15));
            }
            if (c5.b.m(j15) != 0) {
                b.this.getChildAt(0).setMinimumHeight(c5.b.m(j15));
            }
            b bVar = b.this;
            bVar.measure(bVar.F(c5.b.n(j15), c5.b.l(j15), b.this.getLayoutParams().width), b.this.F(c5.b.m(j15), c5.b.k(j15), b.this.getLayoutParams().height));
            return y0.j2(y0Var, b.this.getMeasuredWidth(), b.this.getMeasuredHeight(), null, new C0236b(b.this, this.f10943b), 4, null);
        }

        @Override // p036e4.w0
        public int f(p036e4.w wVar, List<? extends v> list, int i15) {
            return a(i15);
        }

        @Override // p036e4.w0
        public int h(p036e4.w wVar, List<? extends v> list, int i15) {
            return a(i15);
        }

        @Override // p036e4.w0
        public int i(p036e4.w wVar, List<? extends v> list, int i15) {
            return b(i15);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ln4/i0;", "Loq/i0;", "c", "(Ln4/i0;)V"}, k = 3, mv = {2, 1, 0})
    static final class i extends fr.w implements er.l<n4.i0, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final i f10947b = new i();

        i() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(n4.i0 i0Var) {
            c(i0Var);
            return i0.f148189a;
        }

        public final void c(n4.i0 i0Var) {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends fr.w implements er.l<p3.f, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.g f10949c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b f10950d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(androidx.compose.ui.node.g gVar, b bVar) {
            super(1);
            this.f10949c = gVar;
            this.f10950d = bVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p3.f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(p3.f fVar) {
            b bVar = b.this;
            androidx.compose.ui.node.g gVar = this.f10949c;
            b bVar2 = this.f10950d;
            h1 h1VarF = fVar.getDrawContext().f();
            if (bVar.getView().getVisibility() != 8) {
                bVar.isDrawing = true;
                Owner owner = gVar.getOwner();
                AndroidComposeView androidComposeView = owner instanceof AndroidComposeView ? (AndroidComposeView) owner : null;
                if (androidComposeView != null) {
                    androidComposeView.D0(bVar2, f0.d(h1VarF));
                }
                bVar.isDrawing = false;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Le4/b0;", "it", "Loq/i0;", "c", "(Le4/b0;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends fr.w implements er.l<b0, i0> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.node.g f10952c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(androidx.compose.ui.node.g gVar) {
            super(1);
            this.f10952c = gVar;
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(b0 b0Var) {
            c(b0Var);
            return i0.f148189a;
        }

        public final void c(b0 b0Var) {
            WindowInsets windowInsetsX;
            androidx.compose.ui.viewinterop.d.f(b.this, this.f10952c);
            b.this.owner.r(b.this);
            int i15 = b.this.position[0];
            int i16 = b.this.position[1];
            b.this.getView().getLocationOnScreen(b.this.position);
            long j15 = b.this.size;
            b.this.size = b0Var.b();
            f1 f1Var = b.this.insets;
            if (f1Var != null) {
                if ((i15 == b.this.position[0] && i16 == b.this.position[1] && c5.r.e(j15, b.this.size)) || (windowInsetsX = b.this.C(f1Var).x()) == null) {
                    return;
                }
                b.this.getView().dispatchApplyWindowInsets(windowInsetsX);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lm3/g;", "Loq/i0;", "Landroidx/compose/ui/viewinterop/BringIntoViewRequester;", "it", "c", "(Ler/l;)V"}, k = 3, mv = {2, 1, 0})
    static final class l extends fr.w implements er.l<er.l<? super m3.g, ? extends i0>, i0> {
        l() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(er.l<? super m3.g, ? extends i0> lVar) {
            c(lVar);
            return i0.f148189a;
        }

        public final void c(er.l<? super m3.g, i0> lVar) {
            b.this.bringIntoViewRequester = lVar;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class m extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10954e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f10955f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b f10956g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f10957h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        m(boolean z15, b bVar, long j15, tq.e<? super m> eVar) {
            super(2, eVar);
            this.f10955f = z15;
            this.f10956g = bVar;
            this.f10957h = j15;
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r11 == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005b, code lost:
        
            if (r11 == r0) goto L18;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r11) throws java.lang.Throwable {
            /*
                r10 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r10.f10954e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1f
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r11)
                goto L5e
            L12:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1a:
                oq.u.b(r11)
                r6 = r10
                goto L3f
            L1f:
                oq.u.b(r11)
                boolean r11 = r10.f10955f
                if (r11 != 0) goto L45
                androidx.compose.ui.viewinterop.b r11 = r10.f10956g
                z3.b r4 = androidx.compose.ui.viewinterop.b.e(r11)
                c5.y$a r11 = c5.y.INSTANCE
                long r5 = r11.a()
                long r7 = r10.f10957h
                r10.f10954e = r3
                r9 = r10
                java.lang.Object r11 = r4.a(r5, r7, r9)
                r6 = r9
                if (r11 != r0) goto L3f
                goto L5d
            L3f:
                c5.y r11 = (c5.y) r11
                r11.getPackedValue()
                goto L63
            L45:
                r6 = r10
                androidx.compose.ui.viewinterop.b r11 = r6.f10956g
                z3.b r1 = androidx.compose.ui.viewinterop.b.e(r11)
                r11 = r2
                long r2 = r6.f10957h
                c5.y$a r4 = c5.y.INSTANCE
                long r4 = r4.a()
                r6.f10954e = r11
                java.lang.Object r11 = r1.a(r2, r4, r6)
                if (r11 != r0) goto L5e
            L5d:
                return r0
            L5e:
                c5.y r11 = (c5.y) r11
                r11.getPackedValue()
            L63:
                oq.i0 r11 = oq.i0.f148189a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.b.m.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((m) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return new m(this.f10955f, this.f10956g, this.f10957h, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class n extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f10958e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f10960g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        n(long j15, tq.e<? super n> eVar) {
            super(2, eVar);
            this.f10960g = j15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f10958e;
            if (i15 == 0) {
                u.b(obj);
                z3.b bVar = b.this.dispatcher;
                long j15 = this.f10960g;
                this.f10958e = 1;
                if (bVar.c(j15, this) == objE) {
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
            return ((n) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return b.this.new n(this.f10960g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class o extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final o f10961b = new o();

        o() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class p extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final p f10962b = new p();

        p() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class q extends fr.w implements er.a<i0> {
        q() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            b.this.getLayoutNode().T0();
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class r extends fr.w implements er.a<i0> {
        r() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
            if (b.this.hasUpdateBlock && b.this.isAttachedToWindow()) {
                ViewParent parent = b.this.getView().getParent();
                b bVar = b.this;
                if (parent == bVar) {
                    c1 snapshotObserver = bVar.getSnapshotObserver();
                    snapshotObserver.observer.k(b.this, b.G, b.this.getUpdate());
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class s extends fr.w implements er.a<i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final s f10965b = new s();

        s() {
            super(0);
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ i0 a() {
            c();
            return i0.f148189a;
        }

        public final void c() {
        }
    }

    public b(Context context, p076m2.v vVar, int i15, z3.b bVar, View view, Owner owner) {
        super(context);
        this.compositeKeyHash = i15;
        this.dispatcher = bVar;
        this.view = view;
        this.owner = owner;
        if (vVar != null) {
            s3.k(this, vVar);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        l0.w0(this, new a());
        l0.q0(this, this);
        this.update = s.f10965b;
        this.reset = p.f10962b;
        this.release = o.f10961b;
        f3.m.Companion companion = f3.m.INSTANCE;
        this.modifier = companion;
        this.density = c5.f.b(1.0f, 0.0f, 2, null);
        this.position = new int[2];
        this.size = c5.r.INSTANCE.a();
        this.runUpdate = new r();
        this.runInvalidate = new q();
        this.location = new int[2];
        this.lastWidthMeasureSpec = PKIFailureInfo.systemUnavail;
        this.lastHeightMeasureSpec = PKIFailureInfo.systemUnavail;
        this.nestedScrollingParentHelper = new x(this);
        androidx.compose.ui.node.g gVar = new androidx.compose.ui.node.g(false, 0, 3, null);
        gVar.Y1(this);
        f3.m mVarU = l1.a(k3.k.b(m0.a(n4.v.c(z3.d.a(companion, androidx.compose.ui.viewinterop.d.f10967a, bVar), true, i.f10947b), this), new j(gVar, this)), new k(gVar)).u(new androidx.compose.ui.viewinterop.f(new l()));
        gVar.g(i15);
        gVar.u(this.modifier.u(mVarU));
        this.onModifierChanged = new d(gVar, mVarU);
        gVar.b(this.density);
        this.onDensityChanged = new e(gVar);
        gVar.c2(new f(gVar));
        gVar.d2(new g());
        gVar.j(new h(gVar));
        this.layoutNode = gVar;
    }

    private final x5.h A(x5.h hVar, int i15, int i16, int i17, int i18) {
        int i19 = hVar.f216813a - i15;
        if (i19 < 0) {
            i19 = 0;
        }
        int i25 = hVar.f216814b - i16;
        if (i25 < 0) {
            i25 = 0;
        }
        int i26 = hVar.f216815c - i17;
        if (i26 < 0) {
            i26 = 0;
        }
        int i27 = hVar.f216816d - i18;
        return x5.h.c(i19, i25, i26, i27 >= 0 ? i27 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a1.a B(a1.a bounds) {
        NodeCoordinator nodeCoordinatorB0 = this.layoutNode.b0();
        if (nodeCoordinatorB0.c()) {
            long jD = c5.o.d(c0.g(nodeCoordinatorB0));
            int i15 = c5.n.i(jD);
            if (i15 < 0) {
                i15 = 0;
            }
            int iJ = c5.n.j(jD);
            int i16 = iJ < 0 ? 0 : iJ;
            long jB = c0.e(nodeCoordinatorB0).b();
            int i17 = (int) (jB >> 32);
            int i18 = (int) (jB & BodyPartID.bodyIdMax);
            long jB2 = nodeCoordinatorB0.b();
            long jD2 = c5.o.d(nodeCoordinatorB0.A0(m3.e.e((BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits((int) (jB2 & BodyPartID.bodyIdMax)))) | (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32))));
            int i19 = i17 - c5.n.i(jD2);
            if (i19 < 0) {
                i19 = 0;
            }
            int iJ2 = i18 - c5.n.j(jD2);
            int i25 = iJ2 >= 0 ? iJ2 : 0;
            if (i15 != 0 || i16 != 0 || i19 != 0 || i25 != 0) {
                int i26 = i15;
                int i27 = i19;
                return new a1.a(A(bounds.a(), i26, i16, i27, i25), A(bounds.b(), i26, i16, i27, i25));
            }
        }
        return bounds;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final f1 C(f1 insets) {
        if (insets.m()) {
            NodeCoordinator nodeCoordinatorB0 = this.layoutNode.b0();
            if (nodeCoordinatorB0.c()) {
                long jD = c5.o.d(c0.g(nodeCoordinatorB0));
                int i15 = c5.n.i(jD);
                if (i15 < 0) {
                    i15 = 0;
                }
                int iJ = c5.n.j(jD);
                if (iJ < 0) {
                    iJ = 0;
                }
                long jB = c0.e(nodeCoordinatorB0).b();
                int i16 = (int) (jB >> 32);
                int i17 = (int) (jB & BodyPartID.bodyIdMax);
                long jB2 = nodeCoordinatorB0.b();
                long jD2 = c5.o.d(nodeCoordinatorB0.A0(m3.e.e((((long) Float.floatToRawIntBits((int) (jB2 & BodyPartID.bodyIdMax))) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits((int) (jB2 >> 32))) << 32))));
                int i18 = i16 - c5.n.i(jD2);
                if (i18 < 0) {
                    i18 = 0;
                }
                int iJ2 = i17 - c5.n.j(jD2);
                int i19 = iJ2 < 0 ? 0 : iJ2;
                if (i15 != 0 || iJ != 0 || i18 != 0 || i19 != 0) {
                    return insets.n(i15, iJ, i18, i19);
                }
            }
        }
        return insets;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(er.a aVar) {
        aVar.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int F(int min, int max, int preferred) {
        if (preferred >= 0 || min == max) {
            return View.MeasureSpec.makeMeasureSpec(lr.m.n(preferred, min, max), 1073741824);
        }
        if (preferred != -2 || max == Integer.MAX_VALUE) {
            return (preferred != -1 || max == Integer.MAX_VALUE) ? View.MeasureSpec.makeMeasureSpec(0, 0) : View.MeasureSpec.makeMeasureSpec(max, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(max, PKIFailureInfo.systemUnavail);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c1 getSnapshotObserver() {
        if (!isAttachedToWindow()) {
            d4.a.c("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.owner.getSnapshotObserver();
    }

    public final void D() {
        if (!this.isDrawing) {
            this.layoutNode.T0();
            return;
        }
        View view = this.view;
        final er.a<i0> aVar = this.runInvalidate;
        view.postOnAnimation(new Runnable() { // from class: androidx.compose.ui.viewinterop.a
            @Override // java.lang.Runnable
            public final void run() {
                b.E(aVar);
            }
        });
    }

    public final void G() {
        int i15;
        int i16 = this.lastWidthMeasureSpec;
        if (i16 == Integer.MIN_VALUE || (i15 = this.lastHeightMeasureSpec) == Integer.MIN_VALUE) {
            return;
        }
        measure(i16, i15);
    }

    @Override // g4.b1
    public boolean K1() {
        return isAttachedToWindow();
    }

    @Override // p076m2.n
    public void a() {
        this.release.a();
    }

    @Override // j6.y
    public f1 b(View v15, f1 insets) {
        this.insets = new f1(insets);
        return C(insets);
    }

    @Override // j6.v
    public void c(View child, View target, int axes, int type) {
        this.nestedScrollingParentHelper.c(child, target, axes, type);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region region) {
        if (region == null) {
            return true;
        }
        getLocationInWindow(this.location);
        int[] iArr = this.location;
        int i15 = iArr[0];
        region.op(i15, iArr[1], i15 + getWidth(), this.location[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: getInteropView, reason: from getter */
    public final View getView() {
        return this.view;
    }

    public final androidx.compose.ui.node.g getLayoutNode() {
        return this.layoutNode;
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.view.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    public final androidx.p016lifecycle.q getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final f3.m getModifier() {
        return this.modifier;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.nestedScrollingParentHelper.a();
    }

    public final er.l<c5.d, i0> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final er.l<f3.m, i0> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final er.l<Boolean, i0> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final er.a<i0> getRelease() {
        return this.release;
    }

    public final er.a<i0> getReset() {
        return this.reset;
    }

    public final ua.j getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final er.a<i0> getUpdate() {
        return this.update;
    }

    public final View getView() {
        return this.view;
    }

    @Override // p076m2.n
    public void i() {
        this.reset.a();
        removeAllViewsInLayout();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    @oq.a
    public ViewParent invalidateChildInParent(int[] location, Rect dirty) {
        super.invalidateChildInParent(location, dirty);
        D();
        return null;
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.view.isNestedScrollingEnabled();
    }

    @Override // j6.v
    public void j(View target, int type) {
        this.nestedScrollingParentHelper.d(target, type);
    }

    @Override // j6.v
    public void k(View target, int dx4, int dy4, int[] consumed, int type) {
        if (isNestedScrollingEnabled()) {
            z3.b bVar = this.dispatcher;
            float fG = androidx.compose.ui.viewinterop.d.g(dx4);
            long jD = bVar.d(m3.e.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(dy4))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fG) << 32)), androidx.compose.ui.viewinterop.d.i(type));
            consumed[0] = f2.a(Float.intBitsToFloat((int) (jD >> 32)));
            consumed[1] = f2.a(Float.intBitsToFloat((int) (jD & BodyPartID.bodyIdMax)));
        }
    }

    @Override // j6.w
    public void m(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type, int[] consumed) {
        if (isNestedScrollingEnabled()) {
            z3.b bVar = this.dispatcher;
            float fG = androidx.compose.ui.viewinterop.d.g(dxConsumed);
            long jE = m3.e.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(dyConsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = androidx.compose.ui.viewinterop.d.g(dxUnconsumed);
            long jB = bVar.b(jE, m3.e.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(dyUnconsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fG2) << 32)), androidx.compose.ui.viewinterop.d.i(type));
            consumed[0] = f2.a(Float.intBitsToFloat((int) (jB >> 32)));
            consumed[1] = f2.a(Float.intBitsToFloat((int) (jB & BodyPartID.bodyIdMax)));
        }
    }

    @Override // j6.v
    public void n(View target, int dxConsumed, int dyConsumed, int dxUnconsumed, int dyUnconsumed, int type) {
        if (isNestedScrollingEnabled()) {
            z3.b bVar = this.dispatcher;
            float fG = androidx.compose.ui.viewinterop.d.g(dxConsumed);
            long jE = m3.e.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(dyConsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fG) << 32));
            float fG2 = androidx.compose.ui.viewinterop.d.g(dxUnconsumed);
            bVar.b(jE, m3.e.e((((long) Float.floatToRawIntBits(androidx.compose.ui.viewinterop.d.g(dyUnconsumed))) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(fG2) << 32)), androidx.compose.ui.viewinterop.d.i(type));
        }
    }

    @Override // p076m2.n
    public void o() {
        if (this.view.getParent() != this) {
            addView(this.view);
        } else {
            this.reset.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.runUpdate.a();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View child, View target) {
        super.onDescendantInvalidated(child, target);
        D();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getSnapshotObserver().i(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int l15, int t15, int r15, int b15) {
        this.view.layout(0, 0, r15 - l15, b15 - t15);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        if (this.view.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(widthMeasureSpec), View.MeasureSpec.getSize(heightMeasureSpec));
            return;
        }
        if (this.view.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.view.measure(widthMeasureSpec, heightMeasureSpec);
        setMeasuredDimension(this.view.getMeasuredWidth(), this.view.getMeasuredHeight());
        this.lastWidthMeasureSpec = widthMeasureSpec;
        this.lastHeightMeasureSpec = heightMeasureSpec;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View target, float velocityX, float velocityY, boolean consumed) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        ju.k.d(this.dispatcher.e(), null, null, new m(consumed, this, z.a(androidx.compose.ui.viewinterop.d.h(velocityX), androidx.compose.ui.viewinterop.d.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View target, float velocityX, float velocityY) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        ju.k.d(this.dispatcher.e(), null, null, new n(z.a(androidx.compose.ui.viewinterop.d.h(velocityX), androidx.compose.ui.viewinterop.d.h(velocityY)), null), 3, null);
        return false;
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int visibility) {
        super.onWindowVisibilityChanged(visibility);
    }

    @Override // j6.v
    public boolean p(View child, View target, int axes, int type) {
        return ((axes & 2) == 0 && (axes & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View child, Rect rectangle, boolean immediate) {
        er.l<? super m3.g, i0> lVar = this.bringIntoViewRequester;
        if (lVar == null) {
            return true;
        }
        lVar.b(rectangle != null ? s2.e(rectangle) : null);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean disallowIntercept) {
        er.l<? super Boolean, i0> lVar = this.onRequestDisallowInterceptTouchEvent;
        if (lVar != null) {
            lVar.b(Boolean.valueOf(disallowIntercept));
        }
        super.requestDisallowInterceptTouchEvent(disallowIntercept);
    }

    public final void setDensity(c5.d dVar) {
        if (dVar != this.density) {
            this.density = dVar;
            er.l<? super c5.d, i0> lVar = this.onDensityChanged;
            if (lVar != null) {
                lVar.b(dVar);
            }
        }
    }

    public final void setLifecycleOwner(androidx.p016lifecycle.q qVar) {
        if (qVar != this.lifecycleOwner) {
            this.lifecycleOwner = qVar;
            C6451z0.b(this, qVar);
        }
    }

    public final void setModifier(f3.m mVar) {
        if (mVar != this.modifier) {
            this.modifier = mVar;
            er.l<? super f3.m, i0> lVar = this.onModifierChanged;
            if (lVar != null) {
                lVar.b(mVar);
            }
        }
    }

    public final void setOnDensityChanged$ui(er.l<? super c5.d, i0> lVar) {
        this.onDensityChanged = lVar;
    }

    public final void setOnModifierChanged$ui(er.l<? super f3.m, i0> lVar) {
        this.onModifierChanged = lVar;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(er.l<? super Boolean, i0> lVar) {
        this.onRequestDisallowInterceptTouchEvent = lVar;
    }

    protected final void setRelease(er.a<i0> aVar) {
        this.release = aVar;
    }

    protected final void setReset(er.a<i0> aVar) {
        this.reset = aVar;
    }

    public final void setSavedStateRegistryOwner(ua.j jVar) {
        if (jVar != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = jVar;
            ua.n.b(this, jVar);
        }
    }

    protected final void setUpdate(er.a<i0> aVar) {
        this.update = aVar;
        this.hasUpdateBlock = true;
        this.runUpdate.a();
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }
}
