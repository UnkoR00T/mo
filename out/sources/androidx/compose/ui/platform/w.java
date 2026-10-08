package androidx.compose.ui.platform;

import android.R;
import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.res.Resources;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.os.SystemClock;
import android.os.Trace;
import android.text.SpannableString;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.node.Owner;
import androidx.compose.ui.semantics.SemanticsConfiguration;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import n4.AccessibilityAction;
import n4.CustomAccessibilityAction;
import n4.ProgressBarRangeInfo;
import n4.ScrollAxisRange;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import q4.TextLayoutResult;
import q4.z3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0014\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0012\b\u0001\u0018\u0000 \u0088\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\nç\u0002Ú\u0001Ö\u0001è\u0002Ð\u0001B\u000f\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ5\u0010\u0015\u001a\u00020\u000f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0019\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\rH\u0002¢\u0006\u0004\b!\u0010\"J/\u0010(\u001a\u00020 2\u0006\u0010$\u001a\u00020#2\u0006\u0010%\u001a\u00020#2\u0006\u0010&\u001a\u00020#2\u0006\u0010'\u001a\u00020#H\u0002¢\u0006\u0004\b(\u0010)J'\u0010-\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u001f\u0010/\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b/\u00100J\u001b\u00101\u001a\u00020\t*\u00020\u001a2\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0004\b1\u00102J\u0015\u00105\u001a\u0004\u0018\u000104*\u000203H\u0002¢\u0006\u0004\b5\u00106J\u001f\u00107\u001a\u00020\t2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001aH\u0002¢\u0006\u0004\b7\u00100J\u0017\u00108\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b8\u00109J\u0017\u0010:\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\b:\u00109J=\u0010@\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u00112\n\b\u0002\u0010<\u001a\u0004\u0018\u00010\u00112\u0010\b\u0002\u0010?\u001a\n\u0012\u0004\u0012\u00020>\u0018\u00010=H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010D\u001a\u00020\u000f2\u0006\u0010C\u001a\u00020BH\u0002¢\u0006\u0004\bD\u0010EJ\u001f\u0010F\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010;\u001a\u00020\u0011H\u0003¢\u0006\u0004\bF\u0010GJ?\u0010M\u001a\u00020B2\u0006\u0010\u0019\u001a\u00020\u00112\b\u0010H\u001a\u0004\u0018\u00010\u00112\b\u0010I\u001a\u0004\u0018\u00010\u00112\b\u0010J\u001a\u0004\u0018\u00010\u00112\b\u0010L\u001a\u0004\u0018\u00010KH\u0002¢\u0006\u0004\bM\u0010NJ\u0017\u0010O\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0004\bO\u00109J)\u0010S\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010P\u001a\u00020\u00112\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\bS\u0010TJ\u0013\u0010U\u001a\u00020\u000f*\u00020+H\u0003¢\u0006\u0004\bU\u0010VJ\u0013\u0010W\u001a\u00020\u000f*\u00020+H\u0002¢\u0006\u0004\bW\u0010VJ#\u0010Z\u001a\u00020\u0013*\u00020+2\u0006\u0010X\u001a\u00020+2\u0006\u0010Y\u001a\u00020\u0013H\u0002¢\u0006\u0004\bZ\u0010[J#\u0010]\u001a\u00020\u0013*\u00020+2\u0006\u0010X\u001a\u00020+2\u0006\u0010\\\u001a\u00020\u0013H\u0002¢\u0006\u0004\b]\u0010[J1\u0010_\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u001a2\u0006\u0010^\u001a\u00020>2\b\u0010R\u001a\u0004\u0018\u00010QH\u0002¢\u0006\u0004\b_\u0010`J'\u0010e\u001a\u00020d2\u0006\u0010\u001f\u001a\u00020+2\u0006\u0010a\u001a\u00020 2\u0006\u0010c\u001a\u00020bH\u0002¢\u0006\u0004\be\u0010fJ\u001b\u0010g\u001a\u00020d*\u00020 2\u0006\u0010a\u001a\u00020 H\u0002¢\u0006\u0004\bg\u0010hJ#\u0010l\u001a\u0004\u0018\u00010k2\b\u0010i\u001a\u0004\u0018\u00010+2\u0006\u0010j\u001a\u00020dH\u0002¢\u0006\u0004\bl\u0010mJ#\u0010s\u001a\u00020r*\u00020b2\u0006\u0010o\u001a\u00020n2\u0006\u0010q\u001a\u00020pH\u0002¢\u0006\u0004\bs\u0010tJ%\u0010w\u001a\u0004\u0018\u00010 *\u00020r2\u0006\u0010u\u001a\u00020#2\u0006\u0010v\u001a\u00020#H\u0002¢\u0006\u0004\bw\u0010xJ\u0015\u0010z\u001a\u0004\u0018\u00010y*\u00020rH\u0002¢\u0006\u0004\bz\u0010{J%\u0010}\u001a\u0004\u0018\u00010|*\u00020r2\u0006\u0010u\u001a\u00020#2\u0006\u0010v\u001a\u00020#H\u0002¢\u0006\u0004\b}\u0010~J(\u0010\u007f\u001a\u00020 *\u00020d2\b\b\u0002\u0010u\u001a\u00020#2\b\b\u0002\u0010v\u001a\u00020#H\u0002¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u001a\u0010\u0081\u0001\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J3\u0010\u0084\u0001\u001a\u0004\u0018\u00018\u0000\"\t\b\u0000\u0010\u0083\u0001*\u00020K2\b\u0010L\u001a\u0004\u0018\u00018\u00002\b\b\u0001\u0010o\u001a\u00020\u0011H\u0002¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u001c\u0010\u0088\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u0088\u0001\u0010\u0089\u0001J\u001c\u0010\u008a\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0002¢\u0006\u0006\b\u008a\u0001\u0010\u0089\u0001J&\u0010\u008d\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\b\u0010\u008c\u0001\u001a\u00030\u008b\u0001H\u0002¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0011\u0010\u008f\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u008f\u0001\u0010\u000bJ\u0011\u0010\u0090\u0001\u001a\u00020\tH\u0002¢\u0006\u0005\b\u0090\u0001\u0010\u000bJ!\u0010\u0092\u0001\u001a\u00020\t2\r\u0010\u0091\u0001\u001a\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0006\b\u0092\u0001\u0010\u0093\u0001J+\u0010\u0097\u0001\u001a\u00020\u000f2\u0007\u0010\u0094\u0001\u001a\u00020\u00112\u000e\u0010\u0096\u0001\u001a\t\u0012\u0005\u0012\u00030\u0095\u00010=H\u0002¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u001c\u0010\u009a\u0001\u001a\u00020\t2\b\u0010\u0099\u0001\u001a\u00030\u0095\u0001H\u0002¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001J.\u0010\u009e\u0001\u001a\u00020\t2\u0007\u0010\u009c\u0001\u001a\u00020\u00112\u0006\u0010<\u001a\u00020\u00112\t\u0010\u009d\u0001\u001a\u0004\u0018\u00010>H\u0002¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001J%\u0010£\u0001\u001a\u00020\t2\u0007\u0010 \u0001\u001a\u00020+2\b\u0010¢\u0001\u001a\u00030¡\u0001H\u0002¢\u0006\u0006\b£\u0001\u0010¤\u0001J\u001b\u0010¥\u0001\u001a\u00020\u00112\u0007\u0010\u0094\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¥\u0001\u0010¦\u0001J5\u0010ª\u0001\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020+2\u0007\u0010§\u0001\u001a\u00020\u00112\u0007\u0010¨\u0001\u001a\u00020\u000f2\u0007\u0010©\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\bª\u0001\u0010«\u0001J\u001b\u0010¬\u0001\u001a\u00020\t2\u0007\u0010\u009c\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¬\u0001\u0010\u0082\u0001J5\u0010°\u0001\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020+2\u0007\u0010\u00ad\u0001\u001a\u00020\u00112\u0007\u0010®\u0001\u001a\u00020\u00112\u0007\u0010¯\u0001\u001a\u00020\u000fH\u0002¢\u0006\u0006\b°\u0001\u0010±\u0001J\u001a\u0010²\u0001\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0006\b²\u0001\u0010³\u0001J\u001a\u0010\u0083\u0001\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0006\b\u0083\u0001\u0010³\u0001J\u0019\u0010´\u0001\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020+H\u0002¢\u0006\u0005\b´\u0001\u0010VJ(\u0010¶\u0001\u001a\u0005\u0018\u00010µ\u00012\b\u0010\u001f\u001a\u0004\u0018\u00010+2\u0007\u0010§\u0001\u001a\u00020\u0011H\u0002¢\u0006\u0006\b¶\u0001\u0010·\u0001J\u001e\u0010¸\u0001\u001a\u0004\u0018\u00010>2\b\u0010\u001f\u001a\u0004\u0018\u00010+H\u0002¢\u0006\u0006\b¸\u0001\u0010¹\u0001J\u0019\u0010»\u0001\u001a\u0004\u0018\u000103*\u00030º\u0001H\u0002¢\u0006\u0006\b»\u0001\u0010¼\u0001J\u001b\u0010¾\u0001\u001a\u00020\t2\u0007\u0010\u0006\u001a\u00030½\u0001H\u0016¢\u0006\u0006\b¾\u0001\u0010¿\u0001J\u001b\u0010À\u0001\u001a\u00020\t2\u0007\u0010\u0006\u001a\u00030½\u0001H\u0016¢\u0006\u0006\bÀ\u0001\u0010¿\u0001J\u001b\u0010Â\u0001\u001a\u00020\t2\u0007\u0010Á\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\bÂ\u0001\u0010Ã\u0001J\u001b\u0010Ä\u0001\u001a\u00020\t2\u0007\u0010Á\u0001\u001a\u00020\u000fH\u0016¢\u0006\u0006\bÄ\u0001\u0010Ã\u0001J*\u0010Å\u0001\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0000¢\u0006\u0006\bÅ\u0001\u0010Æ\u0001J\u001b\u0010È\u0001\u001a\u00020\u000f2\u0007\u0010C\u001a\u00030Ç\u0001H\u0000¢\u0006\u0006\bÈ\u0001\u0010É\u0001J$\u0010Ì\u0001\u001a\u00020\u00112\u0007\u0010Ê\u0001\u001a\u00020#2\u0007\u0010Ë\u0001\u001a\u00020#H\u0001¢\u0006\u0006\bÌ\u0001\u0010Í\u0001J\u001d\u0010Ð\u0001\u001a\u00030Ï\u00012\b\u0010Î\u0001\u001a\u00030½\u0001H\u0016¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001J\u0011\u0010Ò\u0001\u001a\u00020\tH\u0000¢\u0006\u0005\bÒ\u0001\u0010\u000bJ\u0013\u0010Ó\u0001\u001a\u00020\tH\u0080@¢\u0006\u0006\bÓ\u0001\u0010Ô\u0001J\u001c\u0010Õ\u0001\u001a\u00020\t2\b\u0010\u0087\u0001\u001a\u00030\u0086\u0001H\u0000¢\u0006\u0006\bÕ\u0001\u0010\u0089\u0001R\u001b\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\u0010\n\u0006\bÖ\u0001\u0010×\u0001\u001a\u0006\bØ\u0001\u0010Ù\u0001R0\u0010ß\u0001\u001a\u00020\u00118\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bÚ\u0001\u0010Ó\u0001\u0012\u0005\bÞ\u0001\u0010\u000b\u001a\u0006\bÛ\u0001\u0010Ü\u0001\"\u0006\bÝ\u0001\u0010\u0082\u0001R=\u0010è\u0001\u001a\u000f\u0012\u0004\u0012\u00020B\u0012\u0004\u0012\u00020\u000f0à\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001f\n\u0006\bá\u0001\u0010â\u0001\u0012\u0005\bç\u0001\u0010\u000b\u001a\u0006\bã\u0001\u0010ä\u0001\"\u0006\bå\u0001\u0010æ\u0001R\u0018\u0010ì\u0001\u001a\u00030é\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R1\u0010ò\u0001\u001a\u00020\u000f2\u0007\u0010í\u0001\u001a\u00020\u000f8\u0000@@X\u0080\u000e¢\u0006\u0017\n\u0006\bî\u0001\u0010ï\u0001\u001a\u0005\bð\u0001\u0010\u0018\"\u0006\bñ\u0001\u0010Ã\u0001R*\u0010ù\u0001\u001a\u00030ó\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bô\u0001\u0010Å\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R\"\u0010ý\u0001\u001a\u000b\u0012\u0005\u0012\u00030ú\u0001\u0018\u00010=8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bû\u0001\u0010ü\u0001R+\u0010\u0084\u0002\u001a\u0004\u0018\u00010\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0018\u0010\u0088\u0002\u001a\u00030\u0085\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0002\u0010\u0087\u0002R\u001e\u0010\u008c\u0002\u001a\u00070\u0089\u0002R\u00020\u00008\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0002\u0010\u008b\u0002R\u0019\u0010\u008e\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0002\u0010Ó\u0001R\u0019\u0010\u0090\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0002\u0010Ó\u0001R\u001b\u0010\u0093\u0002\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0091\u0002\u0010\u0092\u0002R\u001b\u0010\u0095\u0002\u001a\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0094\u0002\u0010\u0092\u0002R\u0019\u0010\u0097\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0096\u0002\u0010ï\u0001R\u001f\u0010\u009c\u0002\u001a\n\u0012\u0005\u0012\u00030\u0099\u00020\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009a\u0002\u0010\u009b\u0002R\u001f\u0010\u009e\u0002\u001a\n\u0012\u0005\u0012\u00030\u0099\u00020\u0098\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009d\u0002\u0010\u009b\u0002R'\u0010¡\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0\u009f\u00020\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÊ\u0001\u0010 \u0002R'\u0010£\u0002\u001a\u0010\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020K0¢\u00020\u009f\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bË\u0001\u0010 \u0002R\u0019\u0010¥\u0002\u001a\u00020\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¤\u0002\u0010Ó\u0001R\u001b\u0010¨\u0002\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b¦\u0002\u0010§\u0002R\u001f\u0010¬\u0002\u001a\n\u0012\u0005\u0012\u00030\u0086\u00010©\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bª\u0002\u0010«\u0002R\u001e\u0010°\u0002\u001a\t\u0012\u0004\u0012\u00020\t0\u00ad\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\b®\u0002\u0010¯\u0002R\u0019\u0010²\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0002\u0010ï\u0001R\u001c\u0010¶\u0002\u001a\u0005\u0018\u00010³\u00028\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b´\u0002\u0010µ\u0002R%\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\f8B@\u0002X\u0082\u000e¢\u0006\u000f\n\u0005\b_\u0010·\u0002\u001a\u0006\b¸\u0002\u0010¹\u0002R\u0019\u0010»\u0002\u001a\u00030\u008b\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bZ\u0010º\u0002R)\u0010Â\u0002\u001a\u00030¼\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b!\u0010½\u0002\u001a\u0006\b¾\u0002\u0010¿\u0002\"\u0006\bÀ\u0002\u0010Á\u0002R*\u0010Å\u0002\u001a\u00030¼\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÓ\u0001\u0010½\u0002\u001a\u0006\bÃ\u0002\u0010¿\u0002\"\u0006\bÄ\u0002\u0010Á\u0002R\u001e\u0010È\u0002\u001a\u00020>8\u0000X\u0080D¢\u0006\u000f\n\u0005\b\u0015\u0010Æ\u0002\u001a\u0006\bï\u0001\u0010Ç\u0002R\u001f\u0010Ê\u0002\u001a\u00020>8\u0000X\u0080D¢\u0006\u0010\n\u0006\b\u008f\u0001\u0010Æ\u0002\u001a\u0006\bÉ\u0002\u0010Ç\u0002R\u0017\u0010Í\u0002\u001a\u00030Ë\u00028\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001b\u0010Ì\u0002R \u0010Î\u0002\u001a\n\u0012\u0005\u0012\u00030¡\u00010\u0098\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bs\u0010\u009b\u0002R\u001a\u0010Ð\u0002\u001a\u00030¡\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÈ\u0001\u0010Ï\u0002R\u0019\u0010Ñ\u0002\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010ï\u0001R\u0018\u0010Ó\u0002\u001a\u00030¼\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÒ\u0002\u0010½\u0002R\u0018\u0010Ö\u0002\u001a\u00030Ô\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bÉ\u0002\u0010Õ\u0002R\u001f\u0010Ø\u0002\u001a\n\u0012\u0005\u0012\u00030\u0095\u00010×\u00028\u0002X\u0082\u0004¢\u0006\b\n\u0006\bï\u0001\u0010ü\u0001R%\u0010Ù\u0002\u001a\u0010\u0012\u0005\u0012\u00030\u0095\u0001\u0012\u0004\u0012\u00020\t0à\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\bØ\u0001\u0010â\u0001R\u001e\u0010Û\u0002\u001a\t\u0012\u0005\u0012\u00030ú\u00010=8BX\u0082\u0004¢\u0006\b\u001a\u0006\bÒ\u0002\u0010Ú\u0002R\u0016\u0010Ý\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÜ\u0002\u0010\u0018R!\u0010á\u0002\u001a\u0005\u0018\u00010\u0085\u00028BX\u0082\u0004¢\u0006\u000f\u0012\u0005\bà\u0002\u0010\u000b\u001a\u0006\bÞ\u0002\u0010ß\u0002R\u001b\u0010ä\u0002\u001a\u00020 *\u00020\u001a8BX\u0082\u0004¢\u0006\b\u001a\u0006\bâ\u0002\u0010ã\u0002R\u0016\u0010æ\u0002\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bå\u0002\u0010\u0018¨\u0006é\u0002"}, d2 = {"Landroidx/compose/ui/platform/w;", "Lj6/a;", "Landroid/view/View$OnAttachStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$AccessibilityStateChangeListener;", "Landroid/view/accessibility/AccessibilityManager$TouchExplorationStateChangeListener;", "Landroidx/compose/ui/platform/AndroidComposeView;", "view", "<init>", "(Landroidx/compose/ui/platform/AndroidComposeView;)V", "Loq/i0;", "A0", "()V", "Lr0/q;", "Ln4/y;", "currentSemanticsNodes", "", "vertical", "", "direction", "Lm3/e;", "position", "K", "(Lr0/q;ZIJ)Z", "m0", "()Z", "virtualViewId", "Lk6/p;", "O", "(I)Lk6/p;", ip.a.f96137b, "()Lk6/p;", "node", "Landroid/graphics/Rect;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "(Ln4/y;)Landroid/graphics/Rect;", "", "left", "top", "right", "bottom", "Y0", "(FFFF)Landroid/graphics/Rect;", "info", "Ln4/w;", "semanticsNode", "v0", "(ILk6/p;Ln4/w;)V", "R0", "(Ln4/w;Lk6/p;)V", "S0", "(Lk6/p;Ln4/w;)V", "Lq4/e;", "Landroid/text/SpannableString;", "d1", "(Lq4/e;)Landroid/text/SpannableString;", "U0", "j0", "(I)Z", "z0", "eventType", "contentChangeType", "", "", "contentDescription", "J0", "(IILjava/lang/Integer;Ljava/util/List;)Z", "Landroid/view/accessibility/AccessibilityEvent;", "event", "I0", "(Landroid/view/accessibility/AccessibilityEvent;)Z", "N", "(II)Landroid/view/accessibility/AccessibilityEvent;", "fromIndex", "toIndex", "itemCount", "", "text", "Q", "(ILjava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/CharSequence;)Landroid/view/accessibility/AccessibilityEvent;", "M", "action", "Landroid/os/Bundle;", "arguments", "t0", "(IILandroid/os/Bundle;)Z", "o0", "(Ln4/w;)Z", "E0", "scrollableAncestor", "offset", "G", "(Ln4/w;Ln4/w;J)J", "offsetAdjustment", "C0", "extraDataKey", "F", "(ILk6/p;Ljava/lang/String;Landroid/os/Bundle;)V", "nodeBoundsInScreen", "Ln3/y2;", "shape", "Lm3/g;", "f0", "(Ln4/w;Landroid/graphics/Rect;Ln3/y2;)Lm3/g;", "Z0", "(Landroid/graphics/Rect;Landroid/graphics/Rect;)Lm3/g;", "textNode", "bounds", "Landroid/graphics/RectF;", "c1", "(Ln4/w;Lm3/g;)Landroid/graphics/RectF;", "Lm3/k;", "size", "Lc5/t;", "layoutDirection", "Ln3/i2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ln3/y2;JLc5/t;)Ln3/i2;", "leftOffset", "topOffset", "W0", "(Ln3/i2;FF)Landroid/graphics/Rect;", "", "a1", "(Ln3/i2;)[F", "Landroid/graphics/Region;", "b1", "(Ln3/i2;FF)Landroid/graphics/Region;", "V0", "(Lm3/g;FF)Landroid/graphics/Rect;", "g1", "(I)V", "T", "f1", "(Ljava/lang/CharSequence;I)Ljava/lang/CharSequence;", "Landroidx/compose/ui/node/g;", "layoutNode", "q0", "(Landroidx/compose/ui/node/g;)V", "P0", "Lr0/k0;", "subtreeChangedSemanticsNodesIds", "O0", "(Landroidx/compose/ui/node/g;Lr0/k0;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "h1", "newSemanticsNodes", "N0", "(Lr0/q;)V", "id", "Landroidx/compose/ui/platform/n2;", "oldScrollObservationScopes", "y0", "(ILjava/util/List;)Z", "scrollObservationScope", "B0", "(Landroidx/compose/ui/platform/n2;)V", "semanticsNodeId", "title", "L0", "(IILjava/lang/String;)V", "newNode", "Landroidx/compose/ui/platform/o2;", "oldNode", "H0", "(Ln4/w;Landroidx/compose/ui/platform/o2;)V", "G0", "(I)I", "granularity", "forward", "extendSelection", "e1", "(Ln4/w;IZZ)Z", "M0", "start", "end", "traversalMode", "Q0", "(Ln4/w;IIZ)Z", "U", "(Ln4/w;)I", "k0", "Landroidx/compose/ui/platform/h;", "e0", "(Ln4/w;I)Landroidx/compose/ui/platform/h;", "d0", "(Ln4/w;)Ljava/lang/String;", "Landroidx/compose/ui/semantics/SemanticsConfiguration;", "g0", "(Landroidx/compose/ui/semantics/SemanticsConfiguration;)Lq4/e;", "Landroid/view/View;", "onViewAttachedToWindow", "(Landroid/view/View;)V", "onViewDetachedFromWindow", "enabled", "onAccessibilityStateChanged", "(Z)V", "onTouchExplorationStateChanged", "J", "(ZIJ)Z", "Landroid/view/MotionEvent;", "R", "(Landroid/view/MotionEvent;)Z", "x", "y", "i0", "(FF)I", "host", "Lk6/q;", "b", "(Landroid/view/View;)Lk6/q;", "s0", "I", "(Ltq/e;)Ljava/lang/Object;", "r0", "d", "Landroidx/compose/ui/platform/AndroidComposeView;", "h0", "()Landroidx/compose/ui/platform/AndroidComposeView;", "e", "getHoveredVirtualViewId$ui", "()I", "setHoveredVirtualViewId$ui", "getHoveredVirtualViewId$ui$annotations", "hoveredVirtualViewId", "Lkotlin/Function1;", "f", "Ler/l;", "getOnSendAccessibilityEvent$ui", "()Ler/l;", "setOnSendAccessibilityEvent$ui", "(Ler/l;)V", "getOnSendAccessibilityEvent$ui$annotations", "onSendAccessibilityEvent", "Landroid/view/accessibility/AccessibilityManager;", "g", "Landroid/view/accessibility/AccessibilityManager;", "accessibilityManager", "value", "h", "Z", "getAccessibilityForceEnabledForTesting$ui", "setAccessibilityForceEnabledForTesting$ui", "accessibilityForceEnabledForTesting", "", "j", "getSendRecurringAccessibilityEventsIntervalMillis$ui", "()J", "T0", "(J)V", "SendRecurringAccessibilityEventsIntervalMillis", "Landroid/accessibilityservice/AccessibilityServiceInfo;", "k", "Ljava/util/List;", "_enabledServices", "l", "Ljava/lang/Boolean;", "getRequestFromAccessibilityToolForTesting$ui", "()Ljava/lang/Boolean;", "setRequestFromAccessibilityToolForTesting$ui", "(Ljava/lang/Boolean;)V", "requestFromAccessibilityToolForTesting", "Landroid/os/Handler;", "m", "Landroid/os/Handler;", "legacyMainHandler", "Landroidx/compose/ui/platform/w$d;", "n", "Landroidx/compose/ui/platform/w$d;", "nodeProvider", "p", "accessibilityFocusedVirtualViewId", "q", "focusedVirtualViewId", "r", "Lk6/p;", "currentlyAccessibilityFocusedANI", "s", "currentlyFocusedANI", "t", "sendingFocusAffectingEvent", "Lr0/j0;", "Ln4/n;", "v", "Lr0/j0;", "pendingHorizontalScrollEvents", "w", "pendingVerticalScrollEvents", "Lr0/m1;", "Lr0/m1;", "actionIdToLabel", "Lr0/p0;", "labelToActionId", "z", "accessibilityCursorPosition", "A", "Ljava/lang/Integer;", "previousTraversedNode", "Lr0/b;", "B", "Lr0/b;", "subtreeChangedLayoutNodes", "Llu/g;", "C", "Llu/g;", "boundsUpdateChannel", ip.a.f96138c, "currentSemanticsNodesInvalidated", "Landroidx/compose/ui/platform/w$e;", "E", "Landroidx/compose/ui/platform/w$e;", "pendingTextTraversedEvent", "Lr0/q;", "W", "()Lr0/q;", "Lr0/k0;", "paneDisplayed", "Lr0/h0;", "Lr0/h0;", "c0", "()Lr0/h0;", "setIdToBeforeMap$ui", "(Lr0/h0;)V", "idToBeforeMap", "b0", "setIdToAfterMap$ui", "idToAfterMap", "Ljava/lang/String;", "()Ljava/lang/String;", "ExtraDataTestTraversalBeforeVal", "Y", "ExtraDataTestTraversalAfterVal", "Ly4/v;", "Ly4/v;", "urlSpanCache", "previousSemanticsNodes", "Landroidx/compose/ui/platform/o2;", "previousSemanticsRoot", "checkingForSemanticsChanges", "X", "drawingOrder", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "semanticsChangeChecker", "", "scrollObservationScopes", "scheduleScrollEventIfNeededLambda", "()Ljava/util/List;", "enabledServices", "n0", "isTouchExplorationEnabled", "a0", "()Landroid/os/Handler;", "getHandler$annotations", "handler", "V", "(Lk6/p;)Landroid/graphics/Rect;", "boundsInScreen", "l0", "isEnabled", "c", "a", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class w extends j6.a implements View.OnAttachStateChangeListener, AccessibilityManager.AccessibilityStateChangeListener, AccessibilityManager.TouchExplorationStateChangeListener {

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public static final int f10813r0 = 8;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    private static final r0.o f10814s0 = r0.p.d(f3.p.f58764a, f3.p.f58765b, f3.p.f58776m, f3.p.f58787x, f3.p.A, f3.p.B, f3.p.C, f3.p.D, f3.p.E, f3.p.F, f3.p.f58766c, f3.p.f58767d, f3.p.f58768e, f3.p.f58769f, f3.p.f58770g, f3.p.f58771h, f3.p.f58772i, f3.p.f58773j, f3.p.f58774k, f3.p.f58775l, f3.p.f58777n, f3.p.f58778o, f3.p.f58779p, f3.p.f58780q, f3.p.f58781r, f3.p.f58782s, f3.p.f58783t, f3.p.f58784u, f3.p.f58785v, f3.p.f58786w, f3.p.f58788y, f3.p.f58789z);

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private Integer previousTraversedNode;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private e pendingTextTraversedEvent;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private o2 previousSemanticsRoot;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private boolean checkingForSemanticsChanges;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final Runnable semanticsChangeChecker;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final List<n2> scrollObservationScopes;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AndroidComposeView view;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final AccessibilityManager accessibilityManager;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private boolean accessibilityForceEnabledForTesting;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final er.l<n2, oq.i0> scheduleScrollEventIfNeededLambda;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private List<? extends AccessibilityServiceInfo> _enabledServices;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private Boolean requestFromAccessibilityToolForTesting;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private k6.p currentlyAccessibilityFocusedANI;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private k6.p currentlyFocusedANI;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private boolean sendingFocusAffectingEvent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int hoveredVirtualViewId = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private er.l<? super AccessibilityEvent, Boolean> onSendAccessibilityEvent = new i();

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private long SendRecurringAccessibilityEventsIntervalMillis = 100;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final Handler legacyMainHandler = new Handler(Looper.getMainLooper());

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private d nodeProvider = new d();

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private int accessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int focusedVirtualViewId = PKIFailureInfo.systemUnavail;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final r0.j0<ScrollAxisRange> pendingHorizontalScrollEvents = new r0.j0<>(0, 1, null);

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final r0.j0<ScrollAxisRange> pendingVerticalScrollEvents = new r0.j0<>(0, 1, null);

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private r0.m1<r0.m1<CharSequence>> actionIdToLabel = new r0.m1<>(0, 1, null);

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private r0.m1<r0.p0<CharSequence>> labelToActionId = new r0.m1<>(0, 1, null);

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private int accessibilityCursorPosition = -1;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final r0.b<androidx.compose.ui.node.g> subtreeChangedLayoutNodes = new r0.b<>(0, 1, null);

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final lu.g<oq.i0> boundsUpdateChannel = lu.j.b(1, null, null, 6, null);

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private boolean currentSemanticsNodesInvalidated = true;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private r0.q<n4.y> currentSemanticsNodes = r0.r.b();

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private r0.k0 paneDisplayed = new r0.k0(0, 1, null);

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private r0.h0 idToBeforeMap = new r0.h0(0, 1, null);

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private r0.h0 idToAfterMap = new r0.h0(0, 1, null);

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String ExtraDataTestTraversalBeforeVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALBEFORE_VAL";

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final String ExtraDataTestTraversalAfterVal = "android.view.accessibility.extra.EXTRA_DATA_TEST_TRAVERSALAFTER_VAL";

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final y4.v urlSpanCache = new y4.v();

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private r0.j0<o2> previousSemanticsNodes = r0.r.c();

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final r0.h0 drawingOrder = r0.m.a();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/w$a;", "", "<init>", "()V", "Lk6/p;", "info", "Ln4/w;", "semanticsNode", "Loq/i0;", "a", "(Lk6/p;Ln4/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f10836a = new a();

        private a() {
        }

        public static final void a(k6.p info, n4.w semanticsNode) {
            AccessibilityAction accessibilityAction;
            if (!x.n(semanticsNode) || (accessibilityAction = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.y())) == null) {
                return;
            }
            info.b(new k6.p.a(R.id.accessibilityActionSetProgress, accessibilityAction.getLabel()));
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroidx/compose/ui/platform/w$b;", "", "<init>", "()V", "Lk6/p;", "info", "Ln4/w;", "semanticsNode", "Loq/i0;", "a", "(Lk6/p;Ln4/w;)V", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f10837a = new b();

        private b() {
        }

        public static final void a(k6.p info, n4.w semanticsNode) {
            n4.l lVar = (n4.l) n4.q.a(semanticsNode.getUnmergedConfig(), n4.c0.f131174a.F());
            if (x.n(semanticsNode)) {
                if (lVar == null ? false : n4.l.m(lVar.getValue(), n4.l.INSTANCE.b())) {
                    return;
                }
                SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
                n4.p pVar = n4.p.f131279a;
                AccessibilityAction accessibilityAction = (AccessibilityAction) n4.q.a(unmergedConfig, pVar.s());
                if (accessibilityAction != null) {
                    info.b(new k6.p.a(R.id.accessibilityActionPageUp, accessibilityAction.getLabel()));
                }
                AccessibilityAction accessibilityAction2 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.p());
                if (accessibilityAction2 != null) {
                    info.b(new k6.p.a(R.id.accessibilityActionPageDown, accessibilityAction2.getLabel()));
                }
                AccessibilityAction accessibilityAction3 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.q());
                if (accessibilityAction3 != null) {
                    info.b(new k6.p.a(R.id.accessibilityActionPageLeft, accessibilityAction3.getLabel()));
                }
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.r());
                if (accessibilityAction4 != null) {
                    info.b(new k6.p.a(R.id.accessibilityActionPageRight, accessibilityAction4.getLabel()));
                }
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0082\u0004\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ)\u0010\r\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ1\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0015\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\b¨\u0006\u0017"}, d2 = {"Landroidx/compose/ui/platform/w$d;", "Lk6/q;", "<init>", "(Landroidx/compose/ui/platform/w;)V", "", "virtualViewId", "Lk6/p;", "b", "(I)Lk6/p;", "action", "Landroid/os/Bundle;", "arguments", "", "f", "(IILandroid/os/Bundle;)Z", "info", "", "extraDataKey", "Loq/i0;", "a", "(ILk6/p;Ljava/lang/String;Landroid/os/Bundle;)V", "focus", "d", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private final class d extends k6.q {
        public d() {
        }

        @Override // k6.q
        public void a(int virtualViewId, k6.p info, String extraDataKey, Bundle arguments) {
            w.this.F(virtualViewId, info, extraDataKey, arguments);
        }

        @Override // k6.q
        public k6.p b(int virtualViewId) {
            k6.p pVarO = w.this.O(virtualViewId);
            w wVar = w.this;
            if (wVar.sendingFocusAffectingEvent) {
                if (virtualViewId == wVar.accessibilityFocusedVirtualViewId) {
                    wVar.currentlyAccessibilityFocusedANI = pVarO;
                }
                if (virtualViewId == wVar.focusedVirtualViewId) {
                    wVar.currentlyFocusedANI = pVarO;
                }
            }
            return pVarO;
        }

        @Override // k6.q
        public k6.p d(int focus) {
            if (focus == 1) {
                if (w.this.focusedVirtualViewId == Integer.MIN_VALUE) {
                    return null;
                }
                return b(w.this.focusedVirtualViewId);
            }
            if (focus == 2) {
                return b(w.this.accessibilityFocusedVirtualViewId);
            }
            throw new IllegalArgumentException("Unknown focus type: " + focus);
        }

        @Override // k6.q
        public boolean f(int virtualViewId, int action, Bundle arguments) {
            return w.this.t0(virtualViewId, action, arguments);
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0010\b\u0002\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0004\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\r\u0010\u0013R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0012\u001a\u0004\b\u0014\u0010\u0013R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u000f\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013R\u0017\u0010\b\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0015\u0010\u0013R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0016\u0010\u0018¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/platform/w$e;", "", "Ln4/w;", "node", "", "action", "granularity", "fromIndex", "toIndex", "", "traverseTime", "<init>", "(Ln4/w;IIIIJ)V", "a", "Ln4/w;", "d", "()Ln4/w;", "b", "I", "()I", "c", "e", "f", "J", "()J", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final n4.w node;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int action;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final int granularity;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
        private final int fromIndex;

        /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
        private final int toIndex;

        /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
        private final long traverseTime;

        public e(n4.w wVar, int i15, int i16, int i17, int i18, long j15) {
            this.node = wVar;
            this.action = i15;
            this.granularity = i16;
            this.fromIndex = i17;
            this.toIndex = i18;
            this.traverseTime = j15;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final int getAction() {
            return this.action;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final int getFromIndex() {
            return this.fromIndex;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final int getGranularity() {
            return this.granularity;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final n4.w getNode() {
            return this.node;
        }

        /* JADX INFO: renamed from: e, reason: from getter */
        public final int getToIndex() {
            return this.toIndex;
        }

        /* JADX INFO: renamed from: f, reason: from getter */
        public final long getTraverseTime() {
            return this.traverseTime;
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class f extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f10845d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f10846e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ Object f10847f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        int f10849h;

        f(tq.e<? super f> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f10847f = obj;
            this.f10849h |= PKIFailureInfo.systemUnavail;
            return w.this.I(this);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ln4/w;", "it", "", "c", "(Ln4/w;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class g extends fr.w implements er.l<n4.w, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final g f10850b = new g();

        g() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(n4.w wVar) {
            return Boolean.valueOf(n4.z.a(wVar));
        }
    }

    @Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J,\u0010\u0007\u001a\u00020\u0006\"\u0004\b\u0000\u0010\u00022\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u00032\u0006\u0010\u0005\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\u0007\u0010\bR\"\u0010\u000f\u001a\u00020\t8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010\u000b\u001a\u0004\b\n\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0010"}, d2 = {"androidx/compose/ui/platform/w$h", "Ln4/i0;", "T", "Ln4/h0;", "key", "value", "Loq/i0;", "e", "(Ln4/h0;Ljava/lang/Object;)V", "", "a", "Z", "()Z", "setHasMatchedShape", "(Z)V", "hasMatchedShape", "ui"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class h implements n4.i0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean hasMatchedShape;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n3.y2 f10852b;

        h(n3.y2 y2Var) {
            this.f10852b = y2Var;
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final boolean getHasMatchedShape() {
            return this.hasMatchedShape;
        }

        @Override // n4.i0
        public <T> void e(n4.h0<T> key, T value) {
            if (value == this.f10852b) {
                this.hasMatchedShape = true;
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/accessibility/AccessibilityEvent;", "it", "", "c", "(Landroid/view/accessibility/AccessibilityEvent;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class i extends fr.w implements er.l<AccessibilityEvent, Boolean> {
        i() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(AccessibilityEvent accessibilityEvent) {
            return Boolean.valueOf(w.this.getView().getParent().requestSendAccessibilityEvent(w.this.getView(), accessibilityEvent));
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "c", "()V"}, k = 3, mv = {2, 1, 0})
    static final class j extends fr.w implements er.a<oq.i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n2 f10854b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ w f10855c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(n2 n2Var, w wVar) {
            super(0);
            this.f10854b = n2Var;
            this.f10855c = wVar;
        }

        @Override // er.a
        public /* bridge */ /* synthetic */ oq.i0 a() {
            c();
            return oq.i0.f148189a;
        }

        public final void c() {
            n4.w semanticsNode;
            androidx.compose.ui.node.g layoutNode;
            ScrollAxisRange horizontalScrollAxisRange = this.f10854b.getHorizontalScrollAxisRange();
            ScrollAxisRange verticalScrollAxisRange = this.f10854b.getVerticalScrollAxisRange();
            Float oldXValue = this.f10854b.getOldXValue();
            Float oldYValue = this.f10854b.getOldYValue();
            float fFloatValue = (horizontalScrollAxisRange == null || oldXValue == null) ? 0.0f : horizontalScrollAxisRange.c().a().floatValue() - oldXValue.floatValue();
            float fFloatValue2 = (verticalScrollAxisRange == null || oldYValue == null) ? 0.0f : verticalScrollAxisRange.c().a().floatValue() - oldYValue.floatValue();
            if (fFloatValue != 0.0f || fFloatValue2 != 0.0f) {
                int iG0 = this.f10855c.G0(this.f10854b.getSemanticsNodeId());
                n4.y yVar = (n4.y) this.f10855c.W().b(this.f10855c.accessibilityFocusedVirtualViewId);
                if (yVar != null) {
                    w wVar = this.f10855c;
                    try {
                        k6.p pVar = wVar.currentlyAccessibilityFocusedANI;
                        if (pVar != null) {
                            pVar.l0(wVar.H(yVar));
                            oq.i0 i0Var = oq.i0.f148189a;
                        }
                    } catch (IllegalStateException unused) {
                        oq.i0 i0Var2 = oq.i0.f148189a;
                    }
                }
                n4.y yVar2 = (n4.y) this.f10855c.W().b(this.f10855c.focusedVirtualViewId);
                if (yVar2 != null) {
                    w wVar2 = this.f10855c;
                    try {
                        k6.p pVar2 = wVar2.currentlyFocusedANI;
                        if (pVar2 != null) {
                            pVar2.l0(wVar2.H(yVar2));
                            oq.i0 i0Var3 = oq.i0.f148189a;
                        }
                    } catch (IllegalStateException unused2) {
                        oq.i0 i0Var4 = oq.i0.f148189a;
                    }
                }
                this.f10855c.getView().invalidate();
                n4.y yVar3 = (n4.y) this.f10855c.W().b(iG0);
                if (yVar3 != null && (semanticsNode = yVar3.getSemanticsNode()) != null && (layoutNode = semanticsNode.getLayoutNode()) != null) {
                    w wVar3 = this.f10855c;
                    if (horizontalScrollAxisRange != null) {
                        wVar3.pendingHorizontalScrollEvents.r(iG0, horizontalScrollAxisRange);
                    }
                    if (verticalScrollAxisRange != null) {
                        wVar3.pendingVerticalScrollEvents.r(iG0, verticalScrollAxisRange);
                    }
                    wVar3.q0(layoutNode);
                }
            }
            if (horizontalScrollAxisRange != null) {
                this.f10854b.g(horizontalScrollAxisRange.c().a());
            }
            if (verticalScrollAxisRange != null) {
                this.f10854b.h(verticalScrollAxisRange.c().a());
            }
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/n2;", "it", "Loq/i0;", "c", "(Landroidx/compose/ui/platform/n2;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends fr.w implements er.l<n2, oq.i0> {
        k() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ oq.i0 b(n2 n2Var) {
            c(n2Var);
            return oq.i0.f148189a;
        }

        public final void c(n2 n2Var) {
            w.this.B0(n2Var);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/g;", "it", "", "c", "(Landroidx/compose/ui/node/g;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class l extends fr.w implements er.l<androidx.compose.ui.node.g, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final l f10857b = new l();

        l() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(androidx.compose.ui.node.g gVar) {
            SemanticsConfiguration semanticsConfigurationF = gVar.f();
            boolean z15 = false;
            if (semanticsConfigurationF != null && semanticsConfigurationF.getIsMergingSemanticsOfDescendants()) {
                z15 = true;
            }
            return Boolean.valueOf(z15);
        }
    }

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/node/g;", "it", "", "c", "(Landroidx/compose/ui/node/g;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 1, 0})
    static final class m extends fr.w implements er.l<androidx.compose.ui.node.g, Boolean> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final m f10858b = new m();

        m() {
            super(1);
        }

        @Override // er.l
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Boolean b(androidx.compose.ui.node.g gVar) {
            return Boolean.valueOf(gVar.getNodes().q(g4.s0.a(8)));
        }
    }

    public w(AndroidComposeView androidComposeView) {
        this.view = androidComposeView;
        this.accessibilityManager = (AccessibilityManager) androidComposeView.getContext().getSystemService("accessibility");
        this.previousSemanticsRoot = new o2(androidComposeView.getSemanticsOwner().d(), r0.r.b());
        androidComposeView.addOnAttachStateChangeListener(this);
        this.semanticsChangeChecker = new Runnable() { // from class: androidx.compose.ui.platform.v
            @Override // java.lang.Runnable
            public final void run() {
                w.F0(this.f10803a);
            }
        };
        this.scrollObservationScopes = new ArrayList();
        this.scheduleScrollEventIfNeededLambda = new k();
    }

    private final void A0() {
        this._enabledServices = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(n2 scrollObservationScope) {
        if (scrollObservationScope.K1()) {
            g4.c1 snapshotObserver = this.view.getSnapshotObserver();
            snapshotObserver.observer.k(scrollObservationScope, this.scheduleScrollEventIfNeededLambda, new j(scrollObservationScope, this));
        }
    }

    private final long C0(n4.w wVar, n4.w wVar2, long j15) {
        m3.g gVarA = p036e4.c0.a(wVar2.r().m());
        p036e4.b0 b0VarR0 = wVar2.r().m().r0();
        m3.g gVarU = gVarA.u(b0VarR0 != null ? p036e4.c0.g(b0VarR0) : m3.e.INSTANCE.c());
        m3.g gVarC = m3.h.c(m3.e.q(wVar.u(), j15), c5.s.e(wVar.w()));
        return m3.e.e((((long) Float.floatToRawIntBits(D0(gVarC.getLeft() - gVarU.getLeft(), gVarC.getRight() - gVarU.getRight()))) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(D0(gVarC.getTop() - gVarU.getTop(), gVarC.getBottom() - gVarU.getBottom())))));
    }

    private static final float D0(float f15, float f16) {
        if (Math.signum(f15) == Math.signum(f16)) {
            return Math.abs(f15) < Math.abs(f16) ? f15 : f16;
        }
        return 0.0f;
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001a -> B:8:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    private final boolean E0(n4.w r15) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.w.E0(n4.w):boolean");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(int virtualViewId, k6.p info, String extraDataKey, Bundle arguments) {
        n4.w semanticsNode;
        float[] fArrA1;
        n4.y yVarB = W().b(virtualViewId);
        if (yVarB == null || (semanticsNode = yVarB.getSemanticsNode()) == null) {
            return;
        }
        String strD0 = d0(semanticsNode);
        if (fr.t.c(extraDataKey, this.ExtraDataTestTraversalBeforeVal)) {
            int iE = this.idToBeforeMap.e(virtualViewId, -1);
            if (iE != -1) {
                info.x().putInt(extraDataKey, iE);
                return;
            }
            return;
        }
        if (fr.t.c(extraDataKey, this.ExtraDataTestTraversalAfterVal)) {
            int iE2 = this.idToAfterMap.e(virtualViewId, -1);
            if (iE2 != -1) {
                info.x().putInt(extraDataKey, iE2);
                return;
            }
            return;
        }
        int i15 = 0;
        if (semanticsNode.getUnmergedConfig().g(n4.p.f131279a.i()) && arguments != null && fr.t.c(extraDataKey, "android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY")) {
            int i16 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_START_INDEX", -1);
            int i17 = arguments.getInt("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_ARG_LENGTH", -1);
            if (i17 > 0 && i16 >= 0) {
                if (i16 < (strD0 != null ? strD0.length() : Integer.MAX_VALUE)) {
                    TextLayoutResult textLayoutResultC = p2.c(semanticsNode.getUnmergedConfig());
                    if (textLayoutResultC == null) {
                        return;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (int i18 = 0; i18 < i17; i18++) {
                        int i19 = i16 + i18;
                        if (i19 >= textLayoutResultC.getLayoutInput().getText().length()) {
                            arrayList.add(null);
                        } else {
                            arrayList.add(c1(semanticsNode, textLayoutResultC.d(i19)));
                        }
                    }
                    info.x().putParcelableArray(extraDataKey, (Parcelable[]) arrayList.toArray(new RectF[0]));
                    return;
                }
            }
            io.sentry.android.core.c2.e("AccessibilityDelegate", "Invalid arguments for accessibility character locations");
            return;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        if (unmergedConfig.g(c0Var.K()) && arguments != null && fr.t.c(extraDataKey, "androidx.compose.ui.semantics.testTag")) {
            String str = (String) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.K());
            if (str != null) {
                info.x().putCharSequence(extraDataKey, str);
                return;
            }
            return;
        }
        if (fr.t.c(extraDataKey, "androidx.compose.ui.semantics.id")) {
            info.x().putInt(extraDataKey, semanticsNode.getId());
            return;
        }
        if (fr.t.c(extraDataKey, "androidx.compose.ui.semantics.shapeType")) {
            n3.y2 y2Var = (n3.y2) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.I());
            if (y2Var != null) {
                m3.g gVarF0 = f0(semanticsNode, V(info), y2Var);
                n3.i2 i2VarP = P(y2Var, gVarF0.l(), semanticsNode.r().getLayoutDirection());
                if (i2VarP instanceof n3.i2.b) {
                    info.x().putInt("androidx.compose.ui.semantics.shapeType", 0);
                    info.x().putParcelable("androidx.compose.ui.semantics.shapeRect", W0(i2VarP, gVarF0.getLeft(), gVarF0.getTop()));
                    return;
                } else if (i2VarP instanceof n3.i2.c) {
                    info.x().putInt("androidx.compose.ui.semantics.shapeType", 1);
                    info.x().putParcelable("androidx.compose.ui.semantics.shapeRect", W0(i2VarP, gVarF0.getLeft(), gVarF0.getTop()));
                    info.x().putFloatArray("androidx.compose.ui.semantics.shapeCorners", a1(i2VarP));
                    return;
                } else {
                    if (!(i2VarP instanceof n3.i2.a)) {
                        throw new oq.p();
                    }
                    info.x().putInt("androidx.compose.ui.semantics.shapeType", 2);
                    info.x().putParcelable("androidx.compose.ui.semantics.shapeRegion", b1(i2VarP, gVarF0.getLeft(), gVarF0.getTop()));
                    return;
                }
            }
            return;
        }
        if (fr.t.c(extraDataKey, "androidx.compose.ui.semantics.shapeRect")) {
            n3.y2 y2Var2 = (n3.y2) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.I());
            if (y2Var2 != null) {
                m3.g gVarF1 = f0(semanticsNode, V(info), y2Var2);
                Rect rectW0 = W0(P(y2Var2, gVarF1.l(), semanticsNode.r().getLayoutDirection()), gVarF1.getLeft(), gVarF1.getTop());
                if (rectW0 != null) {
                    info.x().putParcelable("androidx.compose.ui.semantics.shapeRect", rectW0);
                    return;
                }
                return;
            }
            return;
        }
        if (fr.t.c(extraDataKey, "androidx.compose.ui.semantics.shapeCorners")) {
            n3.y2 y2Var3 = (n3.y2) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.I());
            if (y2Var3 == null || (fArrA1 = a1(P(y2Var3, f0(semanticsNode, V(info), y2Var3).l(), semanticsNode.r().getLayoutDirection()))) == null) {
                return;
            }
            info.x().putFloatArray("androidx.compose.ui.semantics.shapeCorners", fArrA1);
            return;
        }
        if (fr.t.c(extraDataKey, "androidx.compose.ui.semantics.shapeRegion")) {
            n3.y2 y2Var4 = (n3.y2) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.I());
            if (y2Var4 != null) {
                m3.g gVarF2 = f0(semanticsNode, V(info), y2Var4);
                Region regionB1 = b1(P(y2Var4, gVarF2.l(), semanticsNode.r().getLayoutDirection()), gVarF2.getLeft(), gVarF2.getTop());
                if (regionB1 != null) {
                    info.x().putParcelable("androidx.compose.ui.semantics.shapeRegion", regionB1);
                    return;
                }
                return;
            }
            return;
        }
        r0.h1<n4.h0<?>> h1VarL = semanticsNode.getUnmergedConfig().l();
        if (h1VarL == null) {
            return;
        }
        Object[] objArr = h1VarL.elements;
        long[] jArr = h1VarL.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i25 = 0;
        while (true) {
            long j15 = jArr[i25];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i26 = 8 - ((~(i25 - length)) >>> 31);
                for (int i27 = i15; i27 < i26; i27++) {
                    if ((255 & j15) < 128) {
                        n4.h0 h0Var = (n4.h0) objArr[(i25 << 3) + i27];
                        String accessibilityExtraKey = h0Var.getAccessibilityExtraKey();
                        if (fr.t.c(accessibilityExtraKey, extraDataKey)) {
                            Object objA = n4.q.a(semanticsNode.getUnmergedConfig(), h0Var);
                            if (objA instanceof Serializable) {
                                info.x().putSerializable(accessibilityExtraKey, (Serializable) objA);
                            } else {
                                if (!(objA instanceof Parcelable)) {
                                    throw new IllegalStateException("Accessibility extra values must be either Serializable or Parcelable.");
                                }
                                info.x().putParcelable(accessibilityExtraKey, (Parcelable) objA);
                            }
                        } else {
                            continue;
                        }
                    }
                    j15 >>= 8;
                }
                if (i26 != 8) {
                    return;
                }
            }
            if (i25 == length) {
                return;
            }
            i25++;
            i15 = 0;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F0(w wVar) {
        Trace.beginSection("measureAndLayout");
        try {
            Owner.f(wVar.view, false, 1, null);
            oq.i0 i0Var = oq.i0.f148189a;
            Trace.endSection();
            Trace.beginSection("checkForSemanticsChanges");
            try {
                wVar.L();
                Trace.endSection();
                wVar.checkingForSemanticsChanges = false;
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    private final long G(n4.w wVar, n4.w wVar2, long j15) {
        if (m3.e.j(j15, m3.e.INSTANCE.c())) {
            return j15;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        SemanticsConfiguration unmergedConfig = wVar2.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) n4.q.a(unmergedConfig, c0Var.m());
        if (scrollAxisRange != null && scrollAxisRange.getReverseScrolling()) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        if (x.t(wVar)) {
            fIntBitsToFloat = -fIntBitsToFloat;
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) n4.q.a(wVar2.getUnmergedConfig(), c0Var.S());
        if (scrollAxisRange2 != null && scrollAxisRange2.getReverseScrolling()) {
            fIntBitsToFloat2 = -fIntBitsToFloat2;
        }
        return m3.e.e((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & BodyPartID.bodyIdMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int G0(int id5) {
        if (id5 == this.view.getSemanticsOwner().d().getId()) {
            return -1;
        }
        return id5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Rect H(n4.y node) {
        c5.p adjustedBounds = node.getAdjustedBounds();
        return Y0(adjustedBounds.getLeft(), adjustedBounds.getTop(), adjustedBounds.getRight(), adjustedBounds.getBottom());
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0095 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:28:0x0097 A[LOOP:1: B:15:0x0057->B:28:0x0097, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:44:0x009a A[EDGE_INSN: B:44:0x009a->B:29:0x009a BREAK  A[LOOP:1: B:15:0x0057->B:28:0x0097], SYNTHETIC] */
    private final void H0(n4.w newNode, o2 oldNode) {
        r0.k0 k0VarB = r0.t.b();
        List<n4.w> listV = newNode.v();
        int size = listV.size();
        for (int i15 = 0; i15 < size; i15++) {
            n4.w wVar = listV.get(i15);
            if (W().a(wVar.getId())) {
                if (!oldNode.getChildren().a(wVar.getId())) {
                    q0(newNode.getLayoutNode());
                    return;
                }
                k0VarB.h(wVar.getId());
            }
        }
        r0.k0 children = oldNode.getChildren();
        int[] iArr = children.elements;
        long[] jArr = children.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i16 = 0;
            while (true) {
                long j15 = jArr[i16];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i16 != length) {
                        break;
                        break;
                    }
                    i16++;
                } else {
                    int i17 = 8 - ((~(i16 - length)) >>> 31);
                    for (int i18 = 0; i18 < i17; i18++) {
                        if ((255 & j15) < 128 && !k0VarB.a(iArr[(i16 << 3) + i18])) {
                            q0(newNode.getLayoutNode());
                            return;
                        }
                        j15 >>= 8;
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
        }
        List<n4.w> listV2 = newNode.v();
        int size2 = listV2.size();
        for (int i19 = 0; i19 < size2; i19++) {
            n4.w wVar2 = listV2.get(i19);
            o2 o2VarB = this.previousSemanticsNodes.b(wVar2.getId());
            if (o2VarB != null && W().a(wVar2.getId())) {
                H0(wVar2, o2VarB);
            }
        }
    }

    private final boolean I0(AccessibilityEvent event) {
        if (!l0()) {
            return false;
        }
        if (event.getEventType() == 2048 || event.getEventType() == 32768) {
            this.sendingFocusAffectingEvent = true;
        }
        try {
            return this.onSendAccessibilityEvent.b(event).booleanValue();
        } finally {
            this.sendingFocusAffectingEvent = false;
        }
    }

    private final boolean J0(int virtualViewId, int eventType, Integer contentChangeType, List<String> contentDescription) {
        if (virtualViewId == Integer.MIN_VALUE || !l0()) {
            return false;
        }
        AccessibilityEvent accessibilityEventN = N(virtualViewId, eventType);
        if (contentChangeType != null) {
            accessibilityEventN.setContentChangeTypes(contentChangeType.intValue());
        }
        if (contentDescription != null) {
            accessibilityEventN.setContentDescription(e5.b.e(contentDescription, ",", null, null, 0, null, null, 62, null));
        }
        return I0(accessibilityEventN);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e5  */
    private final boolean K(r0.q<n4.y> currentSemanticsNodes, boolean vertical, int direction, long position) {
        n4.h0<ScrollAxisRange> h0VarM;
        ScrollAxisRange scrollAxisRange;
        if (m3.e.j(position, m3.e.INSTANCE.b()) || (((9223372034707292159L & position) + 36028792732385279L) & (-9223372034707292160L)) != 0) {
            return false;
        }
        if (vertical) {
            h0VarM = n4.c0.f131174a.S();
        } else {
            if (vertical) {
                throw new oq.p();
            }
            h0VarM = n4.c0.f131174a.m();
        }
        Object[] objArr = currentSemanticsNodes.values;
        long[] jArr = currentSemanticsNodes.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return false;
        }
        int i15 = 0;
        boolean z15 = false;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((j15 & 255) < 128) {
                        n4.y yVar = (n4.y) objArr[(i15 << 3) + i17];
                        if (c5.q.c(yVar.getAdjustedBounds()).b(position) && (scrollAxisRange = (ScrollAxisRange) n4.q.a(yVar.getSemanticsNode().getUnmergedConfig(), h0VarM)) != null) {
                            int i18 = scrollAxisRange.getReverseScrolling() ? -direction : direction;
                            if (direction == 0 && scrollAxisRange.getReverseScrolling()) {
                                i18 = -1;
                            }
                            if (i18 < 0) {
                                if (scrollAxisRange.c().a().floatValue() > 0.0f) {
                                    z15 = true;
                                }
                            } else if (scrollAxisRange.c().a().floatValue() < scrollAxisRange.a().a().floatValue()) {
                                z15 = true;
                            }
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return z15;
                }
            }
            if (i15 == length) {
                return z15;
            }
            i15++;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static /* synthetic */ boolean K0(w wVar, int i15, int i16, Integer num, List list, int i17, Object obj) {
        if ((i17 & 4) != 0) {
            num = null;
        }
        if ((i17 & 8) != 0) {
            list = null;
        }
        return wVar.J0(i15, i16, num, list);
    }

    private final void L() {
        Trace.beginSection("sendAccessibilitySemanticsStructureChangeEvents");
        try {
            if (l0()) {
                H0(this.view.getSemanticsOwner().d(), this.previousSemanticsRoot);
            }
            oq.i0 i0Var = oq.i0.f148189a;
            Trace.endSection();
            Trace.beginSection("sendSemanticsPropertyChangeEvents");
            try {
                N0(W());
                Trace.endSection();
                Trace.beginSection("updateSemanticsNodesCopyAndPanes");
                try {
                    h1();
                } finally {
                    Trace.endSection();
                }
            } catch (Throwable th4) {
                Trace.endSection();
                throw th4;
            }
        } catch (Throwable th5) {
            Trace.endSection();
            throw th5;
        }
    }

    private final void L0(int semanticsNodeId, int contentChangeType, String title) {
        AccessibilityEvent accessibilityEventN = N(G0(semanticsNodeId), 32);
        accessibilityEventN.setContentChangeTypes(contentChangeType);
        if (title != null) {
            accessibilityEventN.getText().add(title);
        }
        I0(accessibilityEventN);
    }

    private final boolean M(int virtualViewId) {
        if (!j0(virtualViewId)) {
            return false;
        }
        this.accessibilityFocusedVirtualViewId = PKIFailureInfo.systemUnavail;
        this.currentlyAccessibilityFocusedANI = null;
        this.view.invalidate();
        K0(this, virtualViewId, PKIFailureInfo.notAuthorized, null, null, 12, null);
        return true;
    }

    private final void M0(int semanticsNodeId) {
        e eVar = this.pendingTextTraversedEvent;
        if (eVar != null) {
            if (semanticsNodeId != eVar.getNode().getId()) {
                return;
            }
            if (SystemClock.uptimeMillis() - eVar.getTraverseTime() <= 1000) {
                AccessibilityEvent accessibilityEventN = N(G0(eVar.getNode().getId()), PKIFailureInfo.unsupportedVersion);
                accessibilityEventN.setFromIndex(eVar.getFromIndex());
                accessibilityEventN.setToIndex(eVar.getToIndex());
                accessibilityEventN.setAction(eVar.getAction());
                accessibilityEventN.setMovementGranularity(eVar.getGranularity());
                accessibilityEventN.getText().add(d0(eVar.getNode()));
                I0(accessibilityEventN);
            }
        }
        this.pendingTextTraversedEvent = null;
    }

    private final AccessibilityEvent N(int virtualViewId, int eventType) {
        n4.y yVarB;
        AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain(eventType);
        accessibilityEventObtain.setEnabled(true);
        accessibilityEventObtain.setClassName("android.view.View");
        accessibilityEventObtain.setPackageName(this.view.getContext().getPackageName());
        accessibilityEventObtain.setSource(this.view, virtualViewId);
        if (l0() && (yVarB = W().b(virtualViewId)) != null) {
            SemanticsConfiguration unmergedConfig = yVarB.getSemanticsNode().getUnmergedConfig();
            n4.c0 c0Var = n4.c0.f131174a;
            accessibilityEventObtain.setPassword(unmergedConfig.g(c0Var.D()));
            k6.b.b(accessibilityEventObtain, fr.t.c(n4.q.a(yVarB.getSemanticsNode().getUnmergedConfig(), c0Var.w()), Boolean.TRUE));
        }
        return accessibilityEventObtain;
    }

    /*  JADX ERROR: NullPointerException in pass: ProcessVariables
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.SSAVar.getUseList()" because "ssaVar" is null
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables$1.processBlock(ProcessVariables.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:93)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.removeUnusedResults(ProcessVariables.java:73)
        	at jadx.core.dex.visitors.regions.variables.ProcessVariables.visit(ProcessVariables.java:48)
        */
    private final void N0(r0.q<n4.y> r53) {
        /*
            Method dump skipped, instruction units count: 1747
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.w.N0(r0.q):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public final k6.p O(int virtualViewId) {
        n4.y yVarB;
        if (this.view.getComposeViewContext().getLifecycleOwner().getLifecycleRegistry().getState() != androidx.lifecycle.j.b.DESTROYED && (yVarB = W().b(virtualViewId)) != null) {
            n4.w semanticsNode = yVarB.getSemanticsNode();
            boolean zC = fr.t.c(n4.q.a(semanticsNode.p(), n4.c0.f131174a.w()), Boolean.TRUE);
            if (zC && !m0()) {
                return null;
            }
            k6.p pVarA0 = k6.p.a0();
            pVarA0.g0(zC);
            if (virtualViewId == -1) {
                ViewParent parentForAccessibility = this.view.getParentForAccessibility();
                pVarA0.K0(parentForAccessibility instanceof View ? (View) parentForAccessibility : null);
            } else {
                n4.w wVarT = semanticsNode.t();
                Integer numValueOf = wVarT != null ? Integer.valueOf(wVarT.getId()) : null;
                if (numValueOf == null) {
                    d4.a.d("semanticsNode " + virtualViewId + " has null parent");
                    throw new oq.g();
                }
                int iIntValue = numValueOf.intValue();
                pVarA0.L0(this.view, iIntValue != this.view.getSemanticsOwner().d().getId() ? iIntValue : -1);
            }
            pVarA0.T0(this.view, virtualViewId);
            pVarA0.l0(H(yVarB));
            v0(virtualViewId, pVarA0, semanticsNode);
            return pVarA0;
        }
        return S();
    }

    private final void O0(androidx.compose.ui.node.g layoutNode, r0.k0 subtreeChangedSemanticsNodesIds) {
        SemanticsConfiguration semanticsConfigurationF;
        androidx.compose.ui.node.g gVarP;
        if (layoutNode.c() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            if (!layoutNode.getNodes().q(g4.s0.a(8))) {
                layoutNode = x.p(layoutNode, m.f10858b);
            }
            if (layoutNode == null || (semanticsConfigurationF = layoutNode.f()) == null) {
                return;
            }
            if (!semanticsConfigurationF.getIsMergingSemanticsOfDescendants() && (gVarP = x.p(layoutNode, l.f10857b)) != null) {
                layoutNode = gVarP;
            }
            int semanticsId = layoutNode.getSemanticsId();
            if (subtreeChangedSemanticsNodesIds.h(semanticsId)) {
                K0(this, G0(semanticsId), 2048, 1, null, 8, null);
            }
        }
    }

    private final n3.i2 P(n3.y2 y2Var, long j15, c5.t tVar) {
        return y2Var.a(j15, tVar, this.view.getDensity());
    }

    private final void P0(androidx.compose.ui.node.g layoutNode) {
        if (layoutNode.c() && !this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().containsKey(layoutNode)) {
            int semanticsId = layoutNode.getSemanticsId();
            ScrollAxisRange scrollAxisRangeB = this.pendingHorizontalScrollEvents.b(semanticsId);
            ScrollAxisRange scrollAxisRangeB2 = this.pendingVerticalScrollEvents.b(semanticsId);
            if (scrollAxisRangeB == null && scrollAxisRangeB2 == null) {
                return;
            }
            AccessibilityEvent accessibilityEventN = N(semanticsId, PKIFailureInfo.certConfirmed);
            if (scrollAxisRangeB != null) {
                accessibilityEventN.setScrollX((int) scrollAxisRangeB.c().a().floatValue());
                accessibilityEventN.setMaxScrollX((int) scrollAxisRangeB.a().a().floatValue());
            }
            if (scrollAxisRangeB2 != null) {
                accessibilityEventN.setScrollY((int) scrollAxisRangeB2.c().a().floatValue());
                accessibilityEventN.setMaxScrollY((int) scrollAxisRangeB2.a().a().floatValue());
            }
            I0(accessibilityEventN);
        }
    }

    private final AccessibilityEvent Q(int virtualViewId, Integer fromIndex, Integer toIndex, Integer itemCount, CharSequence text) {
        AccessibilityEvent accessibilityEventN = N(virtualViewId, PKIFailureInfo.certRevoked);
        if (fromIndex != null) {
            accessibilityEventN.setFromIndex(fromIndex.intValue());
        }
        if (toIndex != null) {
            accessibilityEventN.setToIndex(toIndex.intValue());
        }
        if (itemCount != null) {
            accessibilityEventN.setItemCount(itemCount.intValue());
        }
        if (text != null) {
            accessibilityEventN.getText().add(text);
        }
        return accessibilityEventN;
    }

    private final boolean Q0(n4.w node, int start, int end, boolean traversalMode) {
        String strD0;
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        n4.p pVar = n4.p.f131279a;
        if (unmergedConfig.g(pVar.z()) && x.n(node)) {
            er.q qVar = (er.q) ((AccessibilityAction) node.getUnmergedConfig().k(pVar.z())).a();
            if (qVar != null) {
                return ((Boolean) qVar.w(Integer.valueOf(start), Integer.valueOf(end), Boolean.valueOf(traversalMode))).booleanValue();
            }
            return false;
        }
        if ((start == end && end == this.accessibilityCursorPosition) || (strD0 = d0(node)) == null) {
            return false;
        }
        if (start < 0 || start != end || end > strD0.length()) {
            start = -1;
        }
        this.accessibilityCursorPosition = start;
        boolean z15 = strD0.length() > 0;
        I0(Q(G0(node.getId()), z15 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z15 ? Integer.valueOf(this.accessibilityCursorPosition) : null, z15 ? Integer.valueOf(strD0.length()) : null, strD0));
        M0(node.getId());
        return true;
    }

    private final void R0(n4.w node, k6.p info) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        if (unmergedConfig.g(c0Var.h())) {
            info.t0(true);
            info.x0((CharSequence) n4.q.a(node.getUnmergedConfig(), c0Var.h()));
        }
    }

    private final k6.p S() {
        if (this.accessibilityManager.isEnabled()) {
            return null;
        }
        return k6.p.a0();
    }

    private final void S0(k6.p pVar, n4.w wVar) {
        if (wVar.x().r()) {
            pVar.d1(false);
        }
    }

    private final int T(n4.w node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        return (unmergedConfig.g(c0Var.d()) || !node.getUnmergedConfig().g(c0Var.O())) ? this.accessibilityCursorPosition : z3.i(((z3) node.getUnmergedConfig().k(c0Var.O())).getPackedValue());
    }

    private final int U(n4.w node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        return (unmergedConfig.g(c0Var.d()) || !node.getUnmergedConfig().g(c0Var.O())) ? this.accessibilityCursorPosition : z3.n(((z3) node.getUnmergedConfig().k(c0Var.O())).getPackedValue());
    }

    private final void U0(n4.w node, k6.p info) {
        q4.e eVarS = x.s(node);
        info.V0(eVarS != null ? d1(eVarS) : null);
    }

    private final Rect V(k6.p pVar) {
        Rect rect = new Rect();
        pVar.l(rect);
        return rect;
    }

    private final Rect V0(m3.g gVar, float f15, float f16) {
        return new Rect((int) (gVar.getLeft() + f15), (int) (gVar.getTop() + f16), (int) (gVar.getRight() + f15), (int) (gVar.getBottom() + f16));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final r0.q<n4.y> W() {
        if (this.currentSemanticsNodesInvalidated) {
            this.currentSemanticsNodesInvalidated = false;
            this.currentSemanticsNodes = n4.b0.a(this.view.getSemanticsOwner(), -1, g.f10850b);
            if (l0()) {
                x.w(this.currentSemanticsNodes, this.idToBeforeMap, this.idToAfterMap, this.view.getContext().getResources());
            }
        }
        return this.currentSemanticsNodes;
    }

    private final Rect W0(n3.i2 i2Var, float f15, float f16) {
        if ((i2Var instanceof n3.i2.b) || (i2Var instanceof n3.i2.c)) {
            return V0(i2Var.getRect(), f15, f16);
        }
        return null;
    }

    private final List<AccessibilityServiceInfo> X() {
        List list = this._enabledServices;
        if (list != null) {
            return list;
        }
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList = this.accessibilityManager.getEnabledAccessibilityServiceList(-1);
        this._enabledServices = enabledAccessibilityServiceList;
        return enabledAccessibilityServiceList;
    }

    static /* synthetic */ Rect X0(w wVar, m3.g gVar, float f15, float f16, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            f15 = 0.0f;
        }
        if ((i15 & 2) != 0) {
            f16 = 0.0f;
        }
        return wVar.V0(gVar, f15, f16);
    }

    private final Rect Y0(float left, float top, float right, float bottom) {
        long jK = this.view.k(m3.e.e((((long) Float.floatToRawIntBits(top)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(left) << 32)));
        long jK2 = this.view.k(m3.e.e((((long) Float.floatToRawIntBits(bottom)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(right) << 32)));
        int i15 = (int) (jK >> 32);
        int i16 = (int) (jK2 >> 32);
        int iFloor = (int) Math.floor(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)));
        int i17 = (int) (jK & BodyPartID.bodyIdMax);
        float fIntBitsToFloat = Float.intBitsToFloat(i17);
        int i18 = (int) (jK2 & BodyPartID.bodyIdMax);
        return new Rect(iFloor, (int) Math.floor(Math.min(fIntBitsToFloat, Float.intBitsToFloat(i18))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16))), (int) Math.ceil(Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18))));
    }

    private final m3.g Z0(Rect rect, Rect rect2) {
        float f15 = rect.left - rect2.left;
        float f16 = rect.top - rect2.top;
        return new m3.g(f15, f16, rect.width() + f15, rect.height() + f16);
    }

    private final Handler a0() {
        return f3.d.isViewBasedSemanticsHandlerEnabled ? this.view.getHandler() : this.legacyMainHandler;
    }

    private final float[] a1(n3.i2 i2Var) {
        if (!(i2Var instanceof n3.i2.c)) {
            return null;
        }
        n3.i2.c cVar = (n3.i2.c) i2Var;
        return new float[]{Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getTopLeftCornerRadius() & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (cVar.getRoundRect().getTopRightCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getTopRightCornerRadius() & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomRightCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomRightCornerRadius() & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomLeftCornerRadius() >> 32)), Float.intBitsToFloat((int) (cVar.getRoundRect().getBottomLeftCornerRadius() & BodyPartID.bodyIdMax))};
    }

    private final Region b1(n3.i2 i2Var, float f15, float f16) {
        if (!(i2Var instanceof n3.i2.a)) {
            return null;
        }
        n3.i2.a aVar = (n3.i2.a) i2Var;
        Region region = new Region(X0(this, aVar.getRect().t(f15, f16), 0.0f, 0.0f, 3, null));
        Region region2 = new Region();
        n3.m2 path = aVar.getPath();
        if (!(path instanceof n3.p0)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path internalPath = ((n3.p0) path).getInternalPath();
        internalPath.offset(f15, f16);
        region2.setPath(internalPath, region);
        return region2;
    }

    private final RectF c1(n4.w textNode, m3.g bounds) {
        if (textNode == null) {
            return null;
        }
        m3.g gVarU = bounds.u(textNode.u());
        m3.g gVarK = textNode.k();
        m3.g gVarQ = gVarU.s(gVarK) ? gVarU.q(gVarK) : null;
        if (gVarQ == null) {
            return null;
        }
        AndroidComposeView androidComposeView = this.view;
        float left = gVarQ.getLeft();
        long jK = androidComposeView.k(m3.e.e((((long) Float.floatToRawIntBits(gVarQ.getTop())) & BodyPartID.bodyIdMax) | (((long) Float.floatToRawIntBits(left)) << 32)));
        long jK2 = this.view.k(m3.e.e((((long) Float.floatToRawIntBits(gVarQ.getRight())) << 32) | (((long) Float.floatToRawIntBits(gVarQ.getBottom())) & BodyPartID.bodyIdMax)));
        int i15 = (int) (jK >> 32);
        int i16 = (int) (jK2 >> 32);
        float fMin = Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16));
        int i17 = (int) (jK & BodyPartID.bodyIdMax);
        float fIntBitsToFloat = Float.intBitsToFloat(i17);
        int i18 = (int) (jK2 & BodyPartID.bodyIdMax);
        return new RectF(fMin, Math.min(fIntBitsToFloat, Float.intBitsToFloat(i18)), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat(i17), Float.intBitsToFloat(i18)));
    }

    private final String d0(n4.w node) {
        q4.e eVar;
        if (node == null) {
            return null;
        }
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        if (unmergedConfig.g(c0Var.d())) {
            return e5.b.e((List) node.getUnmergedConfig().k(c0Var.d()), ",", null, null, 0, null, null, 62, null);
        }
        if (node.getUnmergedConfig().g(c0Var.g())) {
            q4.e eVarG0 = g0(node.getUnmergedConfig());
            if (eVarG0 != null) {
                return eVarG0.getText();
            }
            return null;
        }
        List list = (List) n4.q.a(node.getUnmergedConfig(), c0Var.L());
        if (list == null || (eVar = (q4.e) pq.v.n0(list)) == null) {
            return null;
        }
        return eVar.getText();
    }

    private final SpannableString d1(q4.e eVar) {
        return (SpannableString) f1(y4.a.b(eVar, this.view.getDensity(), this.view.getFontFamilyResolver(), this.urlSpanCache), 100000);
    }

    private final androidx.compose.ui.platform.h e0(n4.w node, int granularity) {
        String strD0;
        TextLayoutResult textLayoutResultC;
        if (node == null || (strD0 = d0(node)) == null || strD0.length() == 0) {
            return null;
        }
        if (granularity == 1) {
            androidx.compose.ui.platform.d dVarA = androidx.compose.ui.platform.d.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            dVarA.e(strD0);
            return dVarA;
        }
        if (granularity == 2) {
            androidx.compose.ui.platform.i iVarA = androidx.compose.ui.platform.i.INSTANCE.a(this.view.getContext().getResources().getConfiguration().locale);
            iVarA.e(strD0);
            return iVarA;
        }
        if (granularity != 4) {
            if (granularity == 8) {
                androidx.compose.ui.platform.g gVarA = androidx.compose.ui.platform.g.INSTANCE.a();
                gVarA.e(strD0);
                return gVarA;
            }
            if (granularity != 16) {
                return null;
            }
        }
        if (!node.getUnmergedConfig().g(n4.p.f131279a.i()) || (textLayoutResultC = p2.c(node.getUnmergedConfig())) == null) {
            return null;
        }
        if (granularity == 4) {
            androidx.compose.ui.platform.e eVarA = androidx.compose.ui.platform.e.INSTANCE.a();
            eVarA.j(strD0, textLayoutResultC);
            return eVarA;
        }
        androidx.compose.ui.platform.f fVarA = androidx.compose.ui.platform.f.INSTANCE.a();
        fVarA.j(strD0, textLayoutResultC, node);
        return fVarA;
    }

    private final boolean e1(n4.w node, int granularity, boolean forward, boolean extendSelection) {
        int iU;
        int i15;
        int id5 = node.getId();
        Integer num = this.previousTraversedNode;
        if (num == null || id5 != num.intValue()) {
            this.accessibilityCursorPosition = -1;
            this.previousTraversedNode = Integer.valueOf(node.getId());
        }
        String strD0 = d0(node);
        boolean z15 = false;
        if (strD0 != null && strD0.length() != 0) {
            androidx.compose.ui.platform.h hVarE0 = e0(node, granularity);
            if (hVarE0 == null) {
                return false;
            }
            int iT = T(node);
            if (iT == -1) {
                iT = forward ? 0 : strD0.length();
            }
            int[] iArrA = forward ? hVarE0.a(iT) : hVarE0.b(iT);
            if (iArrA == null) {
                return false;
            }
            int i16 = iArrA[0];
            z15 = true;
            int i17 = iArrA[1];
            if (extendSelection && k0(node)) {
                iU = U(node);
                if (iU == -1) {
                    iU = forward ? i16 : i17;
                }
                i15 = forward ? i17 : i16;
            } else {
                iU = forward ? i17 : i16;
                i15 = iU;
            }
            this.pendingTextTraversedEvent = new e(node, forward ? 256 : 512, granularity, i16, i17, SystemClock.uptimeMillis());
            Q0(node, iU, i15, true);
        }
        return z15;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x008a A[LOOP:0: B:5:0x0021->B:37:0x008a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f A[EDGE_INSN: B:50:0x008f->B:38:0x008f BREAK  A[LOOP:0: B:5:0x0021->B:37:0x008a], SYNTHETIC] */
    private final m3.g f0(n4.w node, Rect nodeBoundsInScreen, n3.y2 shape) {
        f3.m.c node2;
        h hVar = new h(shape);
        androidx.compose.ui.node.g layoutNode = node.getLayoutNode();
        g4.p0 nodes = layoutNode.getNodes();
        int iA = g4.s0.a(8);
        Object obj = null;
        if ((nodes.i() & iA) != 0) {
            loop0: for (f3.m.c head = nodes.getHead(); head != null; head = head.getChild()) {
                if ((head.getKindSet() & iA) == 0) {
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                        break;
                    }
                } else {
                    f3.m.c cVarL = head;
                    n2.c cVar = null;
                    while (cVarL != null) {
                        if (cVarL instanceof g4.i1) {
                            ((g4.i1) cVarL).E2(hVar);
                            if (hVar.getHasMatchedShape()) {
                                obj = cVarL;
                                break loop0;
                            }
                        } else if ((cVarL.getKindSet() & iA) != 0 && (cVarL instanceof g4.j)) {
                            int i15 = 0;
                            for (f3.m.c delegate = ((g4.j) cVarL).getDelegate(); delegate != null; delegate = delegate.getChild()) {
                                if ((delegate.getKindSet() & iA) != 0) {
                                    i15++;
                                    if (i15 == 1) {
                                        cVarL = delegate;
                                    } else {
                                        if (cVar == null) {
                                            cVar = new n2.c(new f3.m.c[16], 0);
                                        }
                                        if (cVarL != null) {
                                            cVar.d(cVarL);
                                            cVarL = null;
                                        }
                                        cVar.d(delegate);
                                    }
                                }
                            }
                            if (i15 == 1) {
                            }
                        }
                        cVarL = g4.h.l(cVar);
                    }
                    if ((head.getAggregateChildKindSet() & iA) != 0) {
                        break;
                    }
                }
            }
        }
        g4.i1 i1Var = (g4.i1) obj;
        if (i1Var == null || (node2 = i1Var.getNode()) == null || !node2.getIsAttached()) {
            return p036e4.c0.c(layoutNode.y0(), false);
        }
        p036e4.b0 b0VarQ = g4.h.q(i1Var);
        m3.g gVarY = p036e4.c0.e(b0VarQ).Y(b0VarQ, false);
        return Z0(Y0(gVarY.getLeft(), gVarY.getTop(), gVarY.getRight(), gVarY.getBottom()), nodeBoundsInScreen);
    }

    private final <T extends CharSequence> T f1(T text, int size) {
        if (size <= 0) {
            throw new IllegalArgumentException("size should be greater than 0");
        }
        if (text == null || text.length() == 0 || text.length() <= size) {
            return text;
        }
        int i15 = size - 1;
        if (Character.isHighSurrogate(text.charAt(i15)) && Character.isLowSurrogate(text.charAt(size))) {
            size = i15;
        }
        return (T) text.subSequence(0, size);
    }

    private final q4.e g0(SemanticsConfiguration semanticsConfiguration) {
        return (q4.e) n4.q.a(semanticsConfiguration, n4.c0.f131174a.g());
    }

    private final void g1(int virtualViewId) {
        int i15 = this.hoveredVirtualViewId;
        if (i15 == virtualViewId) {
            return;
        }
        this.hoveredVirtualViewId = virtualViewId;
        K0(this, virtualViewId, 128, null, null, 12, null);
        K0(this, i15, 256, null, null, 12, null);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x014e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0150 A[LOOP:2: B:39:0x00da->B:54:0x0150, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0159 A[EDGE_INSN: B:64:0x0159->B:55:0x0159 BREAK  A[LOOP:2: B:39:0x00da->B:54:0x0150], SYNTHETIC] */
    private final void h1() {
        long j15;
        long j16;
        long j17;
        long j18;
        SemanticsConfiguration unmergedConfig;
        r0.k0 k0Var = new r0.k0(0, 1, null);
        r0.k0 k0Var2 = this.paneDisplayed;
        int[] iArr = k0Var2.elements;
        long[] jArr = k0Var2.metadata;
        int length = jArr.length - 2;
        long j19 = 128;
        long j25 = 255;
        char c15 = 7;
        long j26 = -9187201950435737472L;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j27 = jArr[i15];
                int[] iArr2 = iArr;
                if ((((~j27) << 7) & j27 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    int i17 = 0;
                    while (i17 < i16) {
                        if ((j27 & j25) < j19) {
                            j17 = j19;
                            int i18 = iArr2[(i15 << 3) + i17];
                            n4.y yVarB = W().b(i18);
                            n4.w semanticsNode = yVarB != null ? yVarB.getSemanticsNode() : null;
                            if (semanticsNode != null) {
                                j18 = j25;
                                if (!semanticsNode.getUnmergedConfig().g(n4.c0.f131174a.C())) {
                                }
                            } else {
                                j18 = j25;
                            }
                            k0Var.h(i18);
                            o2 o2VarB = this.previousSemanticsNodes.b(i18);
                            L0(i18, 32, (o2VarB == null || (unmergedConfig = o2VarB.getUnmergedConfig()) == null) ? null : (String) n4.q.a(unmergedConfig, n4.c0.f131174a.C()));
                        } else {
                            j17 = j19;
                            j18 = j25;
                        }
                        j27 >>= 8;
                        i17++;
                        j19 = j17;
                        j25 = j18;
                    }
                    j15 = j19;
                    j16 = j25;
                    if (i16 != 8) {
                        break;
                    }
                } else {
                    j15 = j19;
                    j16 = j25;
                }
                if (i15 == length) {
                    break;
                }
                i15++;
                iArr = iArr2;
                j19 = j15;
                j25 = j16;
            }
        } else {
            j15 = 128;
            j16 = 255;
        }
        this.paneDisplayed.w(k0Var);
        this.previousSemanticsNodes.g();
        r0.q<n4.y> qVarW = W();
        int[] iArr3 = qVarW.keys;
        Object[] objArr = qVarW.values;
        long[] jArr2 = qVarW.metadata;
        int length2 = jArr2.length - 2;
        if (length2 >= 0) {
            int i19 = 0;
            while (true) {
                long j28 = jArr2[i19];
                if ((((~j28) << c15) & j28 & j26) != j26) {
                    int i25 = 8 - ((~(i19 - length2)) >>> 31);
                    for (int i26 = 0; i26 < i25; i26++) {
                        if ((j28 & j16) < j15) {
                            int i27 = (i19 << 3) + i26;
                            int i28 = iArr3[i27];
                            n4.y yVar = (n4.y) objArr[i27];
                            SemanticsConfiguration unmergedConfig2 = yVar.getSemanticsNode().getUnmergedConfig();
                            n4.c0 c0Var = n4.c0.f131174a;
                            if (unmergedConfig2.g(c0Var.C()) && this.paneDisplayed.h(i28)) {
                                L0(i28, 16, (String) yVar.getSemanticsNode().getUnmergedConfig().k(c0Var.C()));
                            }
                            this.previousSemanticsNodes.r(i28, new o2(yVar.getSemanticsNode(), W()));
                        }
                        j28 >>= 8;
                    }
                    if (i25 != 8) {
                        break;
                    }
                    if (i19 != length2) {
                        break;
                    }
                    i19++;
                    c15 = 7;
                    j26 = -9187201950435737472L;
                } else if (i19 != length2) {
                    break;
                    break;
                } else {
                    i19++;
                    c15 = 7;
                    j26 = -9187201950435737472L;
                }
            }
        }
        this.previousSemanticsRoot = new o2(this.view.getSemanticsOwner().d(), W());
    }

    private final boolean j0(int virtualViewId) {
        return this.accessibilityFocusedVirtualViewId == virtualViewId;
    }

    private final boolean k0(n4.w node) {
        SemanticsConfiguration unmergedConfig = node.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        return !unmergedConfig.g(c0Var.d()) && node.getUnmergedConfig().g(c0Var.g());
    }

    private final boolean m0() {
        Boolean bool = this.requestFromAccessibilityToolForTesting;
        if (fr.t.c(bool, Boolean.TRUE)) {
            return true;
        }
        if (fr.t.c(bool, Boolean.FALSE)) {
            return false;
        }
        return k6.c.a(this.accessibilityManager);
    }

    private final boolean n0() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && this.accessibilityManager.isTouchExplorationEnabled();
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:7:0x001a -> B:8:0x001b). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Not found exit edge by exit block: B:8:0x001b
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.checkLoopExits(LoopRegionMaker.java:272)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.makeLoopRegion(LoopRegionMaker.java:237)
        	at jadx.core.dex.visitors.regions.maker.LoopRegionMaker.process(LoopRegionMaker.java:80)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.traverse(RegionMaker.java:92)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeRegion(RegionMaker.java:69)
        	at jadx.core.dex.visitors.regions.maker.RegionMaker.makeMthRegion(RegionMaker.java:49)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:25)
        */
    @oq.a
    private final boolean o0(n4.w r9) {
        /*
            Method dump skipped, instruction units count: 315
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.w.o0(n4.w):boolean");
    }

    private static final float p0(float f15, float f16) {
        if (Math.signum(f15) == Math.signum(f16)) {
            return Math.abs(f15) < Math.abs(f16) ? f15 : f16;
        }
        return 0.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void q0(androidx.compose.ui.node.g layoutNode) {
        if (this.subtreeChangedLayoutNodes.add(layoutNode)) {
            this.boundsUpdateChannel.d(oq.i0.f148189a);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean t0(int virtualViewId, int action, Bundle arguments) {
        n4.w semanticsNode;
        er.a aVar;
        er.a aVar2;
        er.a aVar3;
        er.a aVar4;
        float f15;
        int steps;
        er.a aVar5;
        er.a aVar6;
        er.a aVar7;
        er.a aVar8;
        er.a aVar9;
        er.a aVar10;
        er.a aVar11;
        er.l lVar;
        AccessibilityAction accessibilityAction;
        er.l lVar2;
        er.a aVar12;
        er.a aVar13;
        er.a aVar14;
        er.a aVar15;
        er.a aVar16;
        CharSequence charSequenceI;
        List list;
        Float fValueOf = Float.valueOf(0.0f);
        n4.y yVarB = W().b(virtualViewId);
        if (yVarB == null || (semanticsNode = yVarB.getSemanticsNode()) == null) {
            return false;
        }
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        Object objA = n4.q.a(unmergedConfig, c0Var.w());
        Boolean bool = Boolean.TRUE;
        if (fr.t.c(objA, bool) && !m0()) {
            return false;
        }
        if (action == 64) {
            return z0(virtualViewId);
        }
        if (action == 128) {
            return M(virtualViewId);
        }
        if (action == 256 || action == 512) {
            if (arguments == null) {
                return false;
            }
            return e1(semanticsNode, arguments.getInt("ACTION_ARGUMENT_MOVEMENT_GRANULARITY_INT"), action == 256, arguments.getBoolean("ACTION_ARGUMENT_EXTEND_SELECTION_BOOLEAN"));
        }
        if (action == 16384) {
            AccessibilityAction accessibilityAction2 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.c());
            if (accessibilityAction2 == null || (aVar = (er.a) accessibilityAction2.a()) == null) {
                return false;
            }
            return ((Boolean) aVar.a()).booleanValue();
        }
        if (action == 131072) {
            boolean zQ0 = Q0(semanticsNode, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_START_INT", -1) : -1, arguments != null ? arguments.getInt("ACTION_ARGUMENT_SELECTION_END_INT", -1) : -1, false);
            if (zQ0) {
                K0(this, G0(semanticsNode.getId()), 0, null, null, 12, null);
            }
            return zQ0;
        }
        if (!x.n(semanticsNode)) {
            return false;
        }
        if (action == 1) {
            if (this.view.isInTouchMode()) {
                this.view.requestFocusFromTouch();
            }
            AccessibilityAction accessibilityAction3 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.u());
            if (accessibilityAction3 == null || (aVar2 = (er.a) accessibilityAction3.a()) == null) {
                return false;
            }
            return ((Boolean) aVar2.a()).booleanValue();
        }
        if (action == 2) {
            if (!fr.t.c(n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.j()), bool)) {
                return false;
            }
            this.view.getFocusOwner().v(false, true, true, l3.g.INSTANCE.c());
            return true;
        }
        Boolean bool2 = null;
        switch (action) {
            case 16:
                AccessibilityAction accessibilityAction4 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.l());
                if (accessibilityAction4 != null && (aVar3 = (er.a) accessibilityAction4.a()) != null) {
                    bool2 = (Boolean) aVar3.a();
                }
                K0(this, virtualViewId, 1, null, null, 12, null);
                if (bool2 != null) {
                    return bool2.booleanValue();
                }
                return false;
            case 32:
                AccessibilityAction accessibilityAction5 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.o());
                if (accessibilityAction5 == null || (aVar4 = (er.a) accessibilityAction5.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar4.a()).booleanValue();
            case PKIFailureInfo.certConfirmed /* 4096 */:
            case PKIFailureInfo.certRevoked /* 8192 */:
                break;
            case 32768:
                AccessibilityAction accessibilityAction6 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.t());
                if (accessibilityAction6 == null || (aVar7 = (er.a) accessibilityAction6.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar7.a()).booleanValue();
            case PKIFailureInfo.notAuthorized /* 65536 */:
                AccessibilityAction accessibilityAction7 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.e());
                if (accessibilityAction7 == null || (aVar8 = (er.a) accessibilityAction7.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar8.a()).booleanValue();
            case PKIFailureInfo.transactionIdInUse /* 262144 */:
                AccessibilityAction accessibilityAction8 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.g());
                if (accessibilityAction8 == null || (aVar9 = (er.a) accessibilityAction8.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar9.a()).booleanValue();
            case PKIFailureInfo.signerNotTrusted /* 524288 */:
                AccessibilityAction accessibilityAction9 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.b());
                if (accessibilityAction9 == null || (aVar10 = (er.a) accessibilityAction9.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar10.a()).booleanValue();
            case PKIFailureInfo.badCertTemplate /* 1048576 */:
                AccessibilityAction accessibilityAction10 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.f());
                if (accessibilityAction10 == null || (aVar11 = (er.a) accessibilityAction10.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar11.a()).booleanValue();
            case PKIFailureInfo.badSenderNonce /* 2097152 */:
                String string = arguments != null ? arguments.getString("ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE") : null;
                AccessibilityAction accessibilityAction11 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.A());
                if (accessibilityAction11 == null || (lVar = (er.l) accessibilityAction11.a()) == null) {
                    return false;
                }
                if (string == null) {
                    string = "";
                }
                return ((Boolean) lVar.b(new q4.e(string, null, 2, null))).booleanValue();
            case R.id.accessibilityActionShowOnScreen:
                return f3.d.isAccessibilityShowOnScreenNestedScrollingEnabled ? E0(semanticsNode) : o0(semanticsNode);
            case R.id.accessibilityActionSetProgress:
                if (arguments == null || !arguments.containsKey("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE") || (accessibilityAction = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.y())) == null || (lVar2 = (er.l) accessibilityAction.a()) == null) {
                    return false;
                }
                return ((Boolean) lVar2.b(Float.valueOf(arguments.getFloat("android.view.accessibility.action.ARGUMENT_PROGRESS_VALUE")))).booleanValue();
            case R.id.accessibilityActionImeEnter:
                AccessibilityAction accessibilityAction12 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.n());
                if (accessibilityAction12 == null || (aVar12 = (er.a) accessibilityAction12.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar12.a()).booleanValue();
            default:
                switch (action) {
                    case R.id.accessibilityActionScrollUp:
                    case R.id.accessibilityActionScrollLeft:
                    case R.id.accessibilityActionScrollDown:
                    case R.id.accessibilityActionScrollRight:
                        break;
                    default:
                        switch (action) {
                            case R.id.accessibilityActionPageUp:
                                AccessibilityAction accessibilityAction13 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.s());
                                if (accessibilityAction13 == null || (aVar13 = (er.a) accessibilityAction13.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) aVar13.a()).booleanValue();
                            case R.id.accessibilityActionPageDown:
                                AccessibilityAction accessibilityAction14 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.p());
                                if (accessibilityAction14 == null || (aVar14 = (er.a) accessibilityAction14.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) aVar14.a()).booleanValue();
                            case R.id.accessibilityActionPageLeft:
                                AccessibilityAction accessibilityAction15 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.q());
                                if (accessibilityAction15 == null || (aVar15 = (er.a) accessibilityAction15.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) aVar15.a()).booleanValue();
                            case R.id.accessibilityActionPageRight:
                                AccessibilityAction accessibilityAction16 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.r());
                                if (accessibilityAction16 == null || (aVar16 = (er.a) accessibilityAction16.a()) == null) {
                                    return false;
                                }
                                return ((Boolean) aVar16.a()).booleanValue();
                            default:
                                r0.m1<CharSequence> m1VarI = this.actionIdToLabel.i(virtualViewId);
                                if (m1VarI == null || (charSequenceI = m1VarI.i(action)) == null || (list = (List) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.d())) == null) {
                                    return false;
                                }
                                int size = list.size();
                                for (int i15 = 0; i15 < size; i15++) {
                                    CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list.get(i15);
                                    if (fr.t.c(customAccessibilityAction.getLabel(), charSequenceI)) {
                                        return customAccessibilityAction.a().a().booleanValue();
                                    }
                                }
                                return false;
                        }
                }
                break;
        }
        boolean z15 = action == 4096;
        boolean z16 = action == 8192;
        boolean z17 = action == 16908345;
        boolean z18 = action == 16908347;
        boolean z19 = action == 16908344;
        boolean z25 = action == 16908346;
        boolean z26 = z17 || z18 || z15 || z16;
        boolean z27 = z19 || z25 || z15 || z16;
        if (z15 || z16) {
            ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.E());
            AccessibilityAction accessibilityAction17 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), n4.p.f131279a.y());
            if (progressBarRangeInfo != null && accessibilityAction17 != null) {
                float fD = lr.m.d(progressBarRangeInfo.c().h().floatValue(), progressBarRangeInfo.c().e().floatValue());
                float fI = lr.m.i(progressBarRangeInfo.c().e().floatValue(), progressBarRangeInfo.c().h().floatValue());
                if (progressBarRangeInfo.getSteps() > 0) {
                    f15 = fD - fI;
                    steps = progressBarRangeInfo.getSteps() + 1;
                } else {
                    f15 = fD - fI;
                    steps = 20;
                }
                float f16 = f15 / steps;
                if (z16) {
                    f16 = -f16;
                }
                er.l lVar3 = (er.l) accessibilityAction17.a();
                if (lVar3 != null) {
                    return ((Boolean) lVar3.b(Float.valueOf(progressBarRangeInfo.getCurrent() + f16))).booleanValue();
                }
                return false;
            }
        }
        long jL = p036e4.c0.a(semanticsNode.r().m()).l();
        Float fB = p2.b(semanticsNode.getUnmergedConfig());
        SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
        n4.p pVar = n4.p.f131279a;
        AccessibilityAction accessibilityAction18 = (AccessibilityAction) n4.q.a(unmergedConfig2, pVar.v());
        if (accessibilityAction18 == null) {
            return false;
        }
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.m());
        if (scrollAxisRange == null || !z26) {
            fB = fB;
        } else {
            float fFloatValue = fB != null ? fB.floatValue() : Float.intBitsToFloat((int) (jL >> 32));
            if (z17 || z16) {
                fFloatValue = -fFloatValue;
            }
            if (scrollAxisRange.getReverseScrolling()) {
                fFloatValue = -fFloatValue;
            }
            if (x.t(semanticsNode) && (z17 || z18)) {
                fFloatValue = -fFloatValue;
            }
            if (u0(scrollAxisRange, fFloatValue)) {
                if (!semanticsNode.getUnmergedConfig().g(pVar.q()) && !semanticsNode.getUnmergedConfig().g(pVar.r())) {
                    er.p pVar2 = (er.p) accessibilityAction18.a();
                    if (pVar2 != null) {
                        return ((Boolean) pVar2.B(Float.valueOf(fFloatValue), fValueOf)).booleanValue();
                    }
                    return false;
                }
                AccessibilityAction accessibilityAction19 = fFloatValue > 0.0f ? (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.r()) : (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.q());
                if (accessibilityAction19 == null || (aVar6 = (er.a) accessibilityAction19.a()) == null) {
                    return false;
                }
                return ((Boolean) aVar6.a()).booleanValue();
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.S());
        if (scrollAxisRange2 != null && z27) {
            float fFloatValue2 = fB != null ? fB.floatValue() : Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & jL));
            if (z19 || z16) {
                fFloatValue2 = -fFloatValue2;
            }
            if (scrollAxisRange2.getReverseScrolling()) {
                fFloatValue2 = -fFloatValue2;
            }
            if (u0(scrollAxisRange2, fFloatValue2)) {
                if (!semanticsNode.getUnmergedConfig().g(pVar.s()) && !semanticsNode.getUnmergedConfig().g(pVar.p())) {
                    er.p pVar3 = (er.p) accessibilityAction18.a();
                    if (pVar3 != null) {
                        return ((Boolean) pVar3.B(fValueOf, Float.valueOf(fFloatValue2))).booleanValue();
                    }
                    return false;
                }
                AccessibilityAction accessibilityAction20 = fFloatValue2 > 0.0f ? (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.p()) : (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.s());
                if (accessibilityAction20 != null && (aVar5 = (er.a) accessibilityAction20.a()) != null) {
                    return ((Boolean) aVar5.a()).booleanValue();
                }
            }
        }
        return false;
    }

    private static final boolean u0(ScrollAxisRange scrollAxisRange, float f15) {
        if (f15 >= 0.0f || scrollAxisRange.c().a().floatValue() <= 0.0f) {
            return f15 > 0.0f && scrollAxisRange.c().a().floatValue() < scrollAxisRange.a().a().floatValue();
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:145:0x03b7  */
    /* JADX WARN: Code duplicated, block: B:248:0x0613 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:249:0x0615 A[LOOP:2: B:234:0x05c9->B:249:0x0615, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:374:0x061a A[EDGE_INSN: B:374:0x061a->B:250:0x061a BREAK  A[LOOP:2: B:234:0x05c9->B:249:0x0615], SYNTHETIC] */
    private final void v0(int virtualViewId, k6.p info, n4.w semanticsNode) {
        View viewD;
        String accessibilityExtraKey;
        boolean z15;
        boolean zBooleanValue;
        n4.w semanticsNode2;
        SemanticsConfiguration semanticsConfigurationP;
        Resources resources = this.view.getContext().getResources();
        info.o0("android.view.View");
        SemanticsConfiguration unmergedConfig = semanticsNode.getUnmergedConfig();
        n4.c0 c0Var = n4.c0.f131174a;
        if (unmergedConfig.g(c0Var.g())) {
            info.o0("android.widget.EditText");
        }
        if (semanticsNode.getUnmergedConfig().g(c0Var.L())) {
            info.o0("android.widget.TextView");
        }
        n4.l lVar = (n4.l) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var.F());
        if (lVar != null) {
            lVar.getValue();
            if (semanticsNode.A() || semanticsNode.v().isEmpty()) {
                n4.l.Companion companion = n4.l.INSTANCE;
                if (n4.l.m(lVar.getValue(), companion.h())) {
                    info.O0(resources.getString(f3.q.f58807r));
                } else if (n4.l.m(lVar.getValue(), companion.g())) {
                    info.O0(resources.getString(f3.q.f58806q));
                } else {
                    String strE = p2.e(lVar.getValue());
                    if (!n4.l.m(lVar.getValue(), companion.e()) || semanticsNode.D() || semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants()) {
                        info.o0(strE);
                    }
                }
            }
            oq.i0 i0Var = oq.i0.f148189a;
        }
        info.I0(this.view.getContext().getPackageName());
        info.C0(n4.b0.h(semanticsNode));
        boolean zM0 = m0();
        List<n4.w> listV = semanticsNode.v();
        int size = listV.size();
        int i15 = 0;
        for (int i16 = 0; i16 < size; i16++) {
            n4.w wVar = listV.get(i16);
            if (W().a(wVar.getId())) {
                androidx.compose.ui.viewinterop.b bVar = this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(wVar.getLayoutNode());
                if (wVar.getId() != -1) {
                    if (bVar != null) {
                        info.c(bVar);
                    } else {
                        n4.y yVarB = W().b(wVar.getId());
                        boolean zC = (yVarB == null || (semanticsNode2 = yVarB.getSemanticsNode()) == null || (semanticsConfigurationP = semanticsNode2.p()) == null) ? false : fr.t.c(n4.q.a(semanticsConfigurationP, n4.c0.f131174a.w()), Boolean.TRUE);
                        if (zM0 || !zC) {
                            info.d(this.view, wVar.getId());
                        }
                    }
                    this.drawingOrder.q(wVar.getId(), i15);
                    i15++;
                }
            }
        }
        boolean z16 = true;
        if (virtualViewId == this.accessibilityFocusedVirtualViewId) {
            info.h0(true);
            info.b(k6.p.a.f108668l);
        } else {
            info.h0(false);
            info.b(k6.p.a.f108667k);
        }
        U0(semanticsNode, info);
        R0(semanticsNode, info);
        info.U0(x.r(semanticsNode, resources));
        info.m0(x.q(semanticsNode));
        SemanticsConfiguration unmergedConfig2 = semanticsNode.getUnmergedConfig();
        n4.c0 c0Var2 = n4.c0.f131174a;
        p4.a aVar = (p4.a) n4.q.a(unmergedConfig2, c0Var2.Q());
        if (aVar != null) {
            if (aVar == p4.a.On) {
                info.n0(true);
            } else if (aVar == p4.a.Off) {
                info.n0(false);
            }
            oq.i0 i0Var2 = oq.i0.f148189a;
        }
        Boolean bool = (Boolean) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var2.H());
        if (bool != null) {
            boolean zBooleanValue2 = bool.booleanValue();
            if (lVar == null ? false : n4.l.m(lVar.getValue(), n4.l.INSTANCE.h())) {
                info.R0(zBooleanValue2);
            } else {
                info.n0(zBooleanValue2);
            }
            oq.i0 i0Var3 = oq.i0.f148189a;
        }
        if (!semanticsNode.getUnmergedConfig().getIsMergingSemanticsOfDescendants() || semanticsNode.v().isEmpty()) {
            List list = (List) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var2.d());
            info.s0(list != null ? (String) pq.v.n0(list) : null);
        }
        String str = (String) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var2.K());
        if (str != null) {
            n4.w wVarT = semanticsNode;
            while (true) {
                if (wVarT == null) {
                    zBooleanValue = false;
                    break;
                }
                SemanticsConfiguration unmergedConfig3 = wVarT.getUnmergedConfig();
                n4.d0 d0Var = n4.d0.f131217a;
                if (unmergedConfig3.g(d0Var.b())) {
                    zBooleanValue = ((Boolean) wVarT.getUnmergedConfig().k(d0Var.b())).booleanValue();
                    break;
                }
                wVarT = wVarT.t();
            }
            if (zBooleanValue) {
                info.c1(str);
            }
        }
        SemanticsConfiguration unmergedConfig4 = semanticsNode.getUnmergedConfig();
        n4.c0 c0Var3 = n4.c0.f131174a;
        if (((oq.i0) n4.q.a(unmergedConfig4, c0Var3.k())) != null) {
            info.A0(true);
            oq.i0 i0Var4 = oq.i0.f148189a;
        }
        if (((oq.i0) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var3.N())) != null) {
            info.W0(true);
            oq.i0 i0Var5 = oq.i0.f148189a;
        }
        if (virtualViewId != -1) {
            int iE = this.drawingOrder.e(semanticsNode.getId(), -1);
            if (iE != -1) {
                info.u0(iE);
                oq.i0 i0Var6 = oq.i0.f148189a;
            } else {
                io.sentry.android.core.c2.g("AccessibilityDelegate", "Drawing order is not available, was AccessibilityNodeInfo requested for a child node before its parent?");
            }
        }
        info.M0(semanticsNode.getUnmergedConfig().g(c0Var3.D()));
        Object objA = n4.q.a(semanticsNode.getUnmergedConfig(), c0Var3.u());
        Boolean bool2 = Boolean.TRUE;
        info.v0(fr.t.c(objA, bool2));
        Integer num = (Integer) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var3.B());
        info.G0(num != null ? num.intValue() : -1);
        info.w0(x.n(semanticsNode));
        info.y0(semanticsNode.getUnmergedConfig().g(c0Var3.j()));
        if (info.P()) {
            info.z0(((Boolean) semanticsNode.getUnmergedConfig().k(c0Var3.j())).booleanValue());
            if (info.Q()) {
                info.a(2);
                this.focusedVirtualViewId = virtualViewId;
            } else {
                info.a(1);
            }
        }
        info.d1(!n4.b0.g(semanticsNode));
        if (f3.h.isAccessibilityShouldIncludeOffscreenChildrenEnabled) {
            S0(info, semanticsNode.A() ? semanticsNode.t() : semanticsNode);
        }
        n4.i iVar = (n4.i) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var3.A());
        if (iVar != null) {
            int value = iVar.getValue();
            n4.i.Companion companion2 = n4.i.INSTANCE;
            info.E0((!n4.i.f(value, companion2.b()) && n4.i.f(value, companion2.a())) ? 2 : 1);
            oq.i0 i0Var7 = oq.i0.f148189a;
        }
        info.p0(false);
        SemanticsConfiguration unmergedConfig5 = semanticsNode.getUnmergedConfig();
        n4.p pVar = n4.p.f131279a;
        AccessibilityAction accessibilityAction = (AccessibilityAction) n4.q.a(unmergedConfig5, pVar.l());
        if (accessibilityAction != null) {
            boolean zC2 = fr.t.c(n4.q.a(semanticsNode.getUnmergedConfig(), c0Var3.H()), bool2);
            n4.l.Companion companion3 = n4.l.INSTANCE;
            if (lVar == null ? false : n4.l.m(lVar.getValue(), companion3.h())) {
                z15 = true;
            } else if (lVar == null ? false : n4.l.m(lVar.getValue(), companion3.f())) {
                z15 = true;
            } else {
                z15 = false;
            }
            info.p0(!z15 || (z15 && !zC2));
            if (x.n(semanticsNode) && info.L()) {
                info.b(new k6.p.a(16, accessibilityAction.getLabel()));
            }
            oq.i0 i0Var8 = oq.i0.f148189a;
        }
        info.F0(false);
        AccessibilityAction accessibilityAction2 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.o());
        if (accessibilityAction2 != null) {
            info.F0(true);
            if (x.n(semanticsNode)) {
                info.b(new k6.p.a(32, accessibilityAction2.getLabel()));
            }
            oq.i0 i0Var9 = oq.i0.f148189a;
        }
        AccessibilityAction accessibilityAction3 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.c());
        if (accessibilityAction3 != null) {
            info.b(new k6.p.a(16384, accessibilityAction3.getLabel()));
            oq.i0 i0Var10 = oq.i0.f148189a;
        }
        if (x.n(semanticsNode)) {
            AccessibilityAction accessibilityAction4 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.A());
            if (accessibilityAction4 != null) {
                info.b(new k6.p.a(PKIFailureInfo.badSenderNonce, accessibilityAction4.getLabel()));
                oq.i0 i0Var11 = oq.i0.f148189a;
            }
            AccessibilityAction accessibilityAction5 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.n());
            if (accessibilityAction5 != null) {
                info.b(new k6.p.a(R.id.accessibilityActionImeEnter, accessibilityAction5.getLabel()));
                oq.i0 i0Var12 = oq.i0.f148189a;
            }
            AccessibilityAction accessibilityAction6 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.e());
            if (accessibilityAction6 != null) {
                info.b(new k6.p.a(PKIFailureInfo.notAuthorized, accessibilityAction6.getLabel()));
                oq.i0 i0Var13 = oq.i0.f148189a;
            }
            AccessibilityAction accessibilityAction7 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.t());
            if (accessibilityAction7 != null) {
                if (info.Q() && this.view.getClipboardManager().d()) {
                    info.b(new k6.p.a(32768, accessibilityAction7.getLabel()));
                }
                oq.i0 i0Var14 = oq.i0.f148189a;
            }
        }
        String strD0 = d0(semanticsNode);
        if (!(strD0 == null || strD0.length() == 0)) {
            info.X0(U(semanticsNode), T(semanticsNode));
            AccessibilityAction accessibilityAction8 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar.z());
            info.b(new k6.p.a(PKIFailureInfo.unsupportedVersion, accessibilityAction8 != null ? accessibilityAction8.getLabel() : null));
            info.a(256);
            info.a(512);
            info.H0(11);
            List list2 = (List) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var3.d());
            if ((list2 == null || list2.isEmpty()) && semanticsNode.getUnmergedConfig().g(pVar.i()) && !x.o(semanticsNode)) {
                info.H0(info.z() | 20);
            }
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add("androidx.compose.ui.semantics.id");
        CharSequence charSequenceD = info.D();
        if (!(charSequenceD == null || charSequenceD.length() == 0) && semanticsNode.getUnmergedConfig().g(pVar.i())) {
            arrayList.add("android.view.accessibility.extra.DATA_TEXT_CHARACTER_LOCATION_KEY");
        }
        if (semanticsNode.getUnmergedConfig().g(c0Var3.K())) {
            arrayList.add("androidx.compose.ui.semantics.testTag");
        }
        if (semanticsNode.getUnmergedConfig().g(c0Var3.I())) {
            arrayList.add("androidx.compose.ui.semantics.shapeType");
            arrayList.add("androidx.compose.ui.semantics.shapeRect");
            arrayList.add("androidx.compose.ui.semantics.shapeCorners");
            arrayList.add("androidx.compose.ui.semantics.shapeRegion");
        }
        r0.h1<n4.h0<?>> h1VarL = semanticsNode.getUnmergedConfig().l();
        if (h1VarL != null) {
            Object[] objArr = h1VarL.elements;
            long[] jArr = h1VarL.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i17 = 0;
                while (true) {
                    long j15 = jArr[i17];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i18 = 8 - ((~(i17 - length)) >>> 31);
                        int i19 = 0;
                        while (i19 < i18) {
                            if (((j15 & 255) < 128 ? z16 : false) && (accessibilityExtraKey = ((n4.h0) objArr[(i17 << 3) + i19]).getAccessibilityExtraKey()) != null) {
                                arrayList.add(accessibilityExtraKey);
                                oq.i0 i0Var15 = oq.i0.f148189a;
                            }
                            j15 >>= 8;
                            i19++;
                            z16 = true;
                        }
                        if (i18 != 8) {
                            break;
                        }
                        if (i17 != length) {
                            break;
                        }
                        i17++;
                        z16 = true;
                    } else if (i17 != length) {
                        break;
                        break;
                    } else {
                        i17++;
                        z16 = true;
                    }
                }
            }
            oq.i0 i0Var16 = oq.i0.f148189a;
        }
        info.i0(arrayList);
        SemanticsConfiguration unmergedConfig6 = semanticsNode.getUnmergedConfig();
        n4.c0 c0Var4 = n4.c0.f131174a;
        ProgressBarRangeInfo progressBarRangeInfo = (ProgressBarRangeInfo) n4.q.a(unmergedConfig6, c0Var4.E());
        if (progressBarRangeInfo != null) {
            SemanticsConfiguration unmergedConfig7 = semanticsNode.getUnmergedConfig();
            n4.p pVar2 = n4.p.f131279a;
            if (unmergedConfig7.g(pVar2.y())) {
                info.o0("android.widget.SeekBar");
            } else {
                info.o0("android.widget.ProgressBar");
            }
            if (progressBarRangeInfo != ProgressBarRangeInfo.INSTANCE.a()) {
                info.N0(k6.p.h.a(1, progressBarRangeInfo.c().e().floatValue(), progressBarRangeInfo.c().h().floatValue(), progressBarRangeInfo.getCurrent()));
            }
            if (semanticsNode.getUnmergedConfig().g(pVar2.y()) && x.n(semanticsNode)) {
                if (progressBarRangeInfo.getCurrent() < lr.m.d(progressBarRangeInfo.c().h().floatValue(), progressBarRangeInfo.c().e().floatValue())) {
                    info.b(k6.p.a.f108673q);
                }
                if (progressBarRangeInfo.getCurrent() > lr.m.i(progressBarRangeInfo.c().e().floatValue(), progressBarRangeInfo.c().h().floatValue())) {
                    info.b(k6.p.a.f108674r);
                }
            }
        }
        int i25 = Build.VERSION.SDK_INT;
        a.a(info, semanticsNode);
        h4.a.d(semanticsNode, info);
        h4.a.e(semanticsNode, info);
        ScrollAxisRange scrollAxisRange = (ScrollAxisRange) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var4.m());
        SemanticsConfiguration unmergedConfig8 = semanticsNode.getUnmergedConfig();
        n4.p pVar3 = n4.p.f131279a;
        AccessibilityAction accessibilityAction9 = (AccessibilityAction) n4.q.a(unmergedConfig8, pVar3.v());
        if (scrollAxisRange != null && accessibilityAction9 != null) {
            if (!h4.a.b(semanticsNode)) {
                info.o0("android.widget.HorizontalScrollView");
            }
            if (scrollAxisRange.a().a().floatValue() > 0.0f) {
                info.Q0(true);
            }
            if (x.n(semanticsNode)) {
                if (x0(scrollAxisRange)) {
                    info.b(k6.p.a.f108673q);
                    info.b(!x.t(semanticsNode) ? k6.p.a.F : k6.p.a.D);
                }
                if (w0(scrollAxisRange)) {
                    info.b(k6.p.a.f108674r);
                    info.b(!x.t(semanticsNode) ? k6.p.a.D : k6.p.a.F);
                }
            }
        }
        ScrollAxisRange scrollAxisRange2 = (ScrollAxisRange) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var4.S());
        if (scrollAxisRange2 != null && accessibilityAction9 != null) {
            if (!h4.a.b(semanticsNode)) {
                info.o0("android.widget.ScrollView");
            }
            if (scrollAxisRange2.a().a().floatValue() > 0.0f) {
                info.Q0(true);
            }
            if (x.n(semanticsNode)) {
                if (x0(scrollAxisRange2)) {
                    info.b(k6.p.a.f108673q);
                    info.b(k6.p.a.E);
                }
                if (w0(scrollAxisRange2)) {
                    info.b(k6.p.a.f108674r);
                    info.b(k6.p.a.C);
                }
            }
        }
        if (i25 >= 29) {
            b.a(info, semanticsNode);
        }
        info.J0((CharSequence) n4.q.a(semanticsNode.getUnmergedConfig(), c0Var4.C()));
        if (x.n(semanticsNode)) {
            AccessibilityAction accessibilityAction10 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar3.g());
            if (accessibilityAction10 != null) {
                info.b(new k6.p.a(PKIFailureInfo.transactionIdInUse, accessibilityAction10.getLabel()));
                oq.i0 i0Var17 = oq.i0.f148189a;
            }
            AccessibilityAction accessibilityAction11 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar3.b());
            if (accessibilityAction11 != null) {
                info.b(new k6.p.a(PKIFailureInfo.signerNotTrusted, accessibilityAction11.getLabel()));
                oq.i0 i0Var18 = oq.i0.f148189a;
            }
            AccessibilityAction accessibilityAction12 = (AccessibilityAction) n4.q.a(semanticsNode.getUnmergedConfig(), pVar3.f());
            if (accessibilityAction12 != null) {
                info.b(new k6.p.a(PKIFailureInfo.badCertTemplate, accessibilityAction12.getLabel()));
                oq.i0 i0Var19 = oq.i0.f148189a;
            }
            if (semanticsNode.getUnmergedConfig().g(pVar3.d())) {
                List list3 = (List) semanticsNode.getUnmergedConfig().k(pVar3.d());
                int size2 = list3.size();
                r0.o oVar = f10814s0;
                if (size2 >= oVar._size) {
                    throw new IllegalStateException("Can't have more than " + oVar._size + " custom actions for one widget");
                }
                r0.m1<CharSequence> m1Var = new r0.m1<>(0, 1, null);
                r0.p0<CharSequence> p0VarB = r0.z0.b();
                if (this.labelToActionId.g(virtualViewId)) {
                    r0.p0<CharSequence> p0VarI = this.labelToActionId.i(virtualViewId);
                    r0.i0 i0Var20 = new r0.i0(0, 1, null);
                    int[] iArr = oVar.content;
                    int i26 = oVar._size;
                    for (int i27 = 0; i27 < i26; i27++) {
                        i0Var20.k(iArr[i27]);
                    }
                    ArrayList arrayList2 = new ArrayList();
                    int size3 = list3.size();
                    for (int i28 = 0; i28 < size3; i28++) {
                        CustomAccessibilityAction customAccessibilityAction = (CustomAccessibilityAction) list3.get(i28);
                        if (p0VarI.a(customAccessibilityAction.getLabel())) {
                            int iC = p0VarI.c(customAccessibilityAction.getLabel());
                            m1Var.n(iC, customAccessibilityAction.getLabel());
                            p0VarB.u(customAccessibilityAction.getLabel(), iC);
                            i0Var20.o(iC);
                            info.b(new k6.p.a(iC, customAccessibilityAction.getLabel()));
                            oq.i0 i0Var21 = oq.i0.f148189a;
                        } else {
                            arrayList2.add(customAccessibilityAction);
                        }
                    }
                    int size4 = arrayList2.size();
                    for (int i29 = 0; i29 < size4; i29++) {
                        CustomAccessibilityAction customAccessibilityAction2 = (CustomAccessibilityAction) arrayList2.get(i29);
                        int iE2 = i0Var20.e(i29);
                        m1Var.n(iE2, customAccessibilityAction2.getLabel());
                        p0VarB.u(customAccessibilityAction2.getLabel(), iE2);
                        info.b(new k6.p.a(iE2, customAccessibilityAction2.getLabel()));
                    }
                } else {
                    int size5 = list3.size();
                    for (int i35 = 0; i35 < size5; i35++) {
                        CustomAccessibilityAction customAccessibilityAction3 = (CustomAccessibilityAction) list3.get(i35);
                        int iE3 = f10814s0.e(i35);
                        m1Var.n(iE3, customAccessibilityAction3.getLabel());
                        p0VarB.u(customAccessibilityAction3.getLabel(), iE3);
                        info.b(new k6.p.a(iE3, customAccessibilityAction3.getLabel()));
                    }
                }
                this.actionIdToLabel.n(virtualViewId, m1Var);
                this.labelToActionId.n(virtualViewId, p0VarB);
            }
        }
        info.P0(x.u(semanticsNode, resources));
        int iE4 = this.idToBeforeMap.e(virtualViewId, -1);
        if (iE4 != -1) {
            View viewD2 = p2.d(this.view.getAndroidViewsHandler$ui(), iE4);
            if (viewD2 != null) {
                info.a1(viewD2);
            } else {
                info.b1(this.view, iE4);
            }
            F(virtualViewId, info, this.ExtraDataTestTraversalBeforeVal, null);
        }
        int iE5 = this.idToAfterMap.e(virtualViewId, -1);
        if (iE5 != -1 && (viewD = p2.d(this.view.getAndroidViewsHandler$ui(), iE5)) != null) {
            info.Y0(viewD);
            F(virtualViewId, info, this.ExtraDataTestTraversalAfterVal, null);
        }
        String str2 = (String) n4.q.a(semanticsNode.getUnmergedConfig(), n4.d0.f131217a.a());
        if (str2 != null) {
            info.o0(str2);
            oq.i0 i0Var22 = oq.i0.f148189a;
        }
    }

    private static final boolean w0(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.c().a().floatValue() <= 0.0f || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.c().a().floatValue() < scrollAxisRange.a().a().floatValue() && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private static final boolean x0(ScrollAxisRange scrollAxisRange) {
        if (scrollAxisRange.c().a().floatValue() >= scrollAxisRange.a().a().floatValue() || scrollAxisRange.getReverseScrolling()) {
            return scrollAxisRange.c().a().floatValue() > 0.0f && scrollAxisRange.getReverseScrolling();
        }
        return true;
    }

    private final boolean y0(int id5, List<n2> oldScrollObservationScopes) {
        boolean z15;
        n2 n2VarA = p2.a(oldScrollObservationScopes, id5);
        if (n2VarA != null) {
            z15 = false;
        } else {
            n2 n2Var = new n2(id5, this.scrollObservationScopes, null, null, null, null);
            z15 = true;
            n2VarA = n2Var;
        }
        this.scrollObservationScopes.add(n2VarA);
        return z15;
    }

    private final boolean z0(int virtualViewId) {
        if (!n0() || j0(virtualViewId)) {
            return false;
        }
        int i15 = this.accessibilityFocusedVirtualViewId;
        if (i15 != Integer.MIN_VALUE) {
            K0(this, i15, PKIFailureInfo.notAuthorized, null, null, 12, null);
        }
        this.accessibilityFocusedVirtualViewId = virtualViewId;
        this.view.invalidate();
        K0(this, virtualViewId, 32768, null, null, 12, null);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0068  */
    /* JADX WARN: Code duplicated, block: B:27:0x0069  */
    /* JADX WARN: Code duplicated, block: B:30:0x0074 A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:38:0x00a4, B:39:0x00ab, B:20:0x0049, B:23:0x0050), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x007d A[Catch: all -> 0x0036, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:38:0x00a4, B:39:0x00ab, B:20:0x0049, B:23:0x0050), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0086 A[Catch: all -> 0x0036, LOOP:0: B:33:0x0084->B:34:0x0086, LOOP_END, TryCatch #0 {all -> 0x0036, blocks: (B:13:0x0031, B:24:0x005c, B:28:0x006c, B:30:0x0074, B:32:0x007d, B:34:0x0086, B:35:0x0097, B:38:0x00a4, B:39:0x00ab, B:20:0x0049, B:23:0x0050), top: B:46:0x0023 }] */
    /* JADX WARN: Code duplicated, block: B:37:0x00a2 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:42:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00c6, code lost:
    
        if (ju.z0.b(r7, r0) == r1) goto L41;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00c6 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object I(tq.e<? super oq.i0> r11) {
        /*
            Method dump skipped, instruction units count: 215
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.w.I(tq.e):java.lang.Object");
    }

    public final boolean J(boolean vertical, int direction, long position) {
        if (fr.t.c(Looper.getMainLooper().getThread(), Thread.currentThread())) {
            return K(W(), vertical, direction, position);
        }
        return false;
    }

    public final boolean R(MotionEvent event) {
        if (!n0()) {
            return false;
        }
        int action = event.getAction();
        if (action == 7 || action == 9) {
            int iI0 = i0(event.getX(), event.getY());
            boolean zDispatchGenericMotionEvent = this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
            g1(iI0);
            if (iI0 == Integer.MIN_VALUE) {
                return zDispatchGenericMotionEvent;
            }
            return true;
        }
        if (action != 10) {
            return false;
        }
        if (this.hoveredVirtualViewId == Integer.MIN_VALUE) {
            return this.view.getAndroidViewsHandler$ui().dispatchGenericMotionEvent(event);
        }
        g1(PKIFailureInfo.systemUnavail);
        return true;
    }

    public final void T0(long j15) {
        this.SendRecurringAccessibilityEventsIntervalMillis = j15;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final String getExtraDataTestTraversalAfterVal() {
        return this.ExtraDataTestTraversalAfterVal;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final String getExtraDataTestTraversalBeforeVal() {
        return this.ExtraDataTestTraversalBeforeVal;
    }

    @Override // j6.a
    public k6.q b(View host) {
        return this.nodeProvider;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final r0.h0 getIdToAfterMap() {
        return this.idToAfterMap;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final r0.h0 getIdToBeforeMap() {
        return this.idToBeforeMap;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final AndroidComposeView getView() {
        return this.view;
    }

    public final int i0(float x15, float y15) {
        int iG0;
        Owner.f(this.view, false, 1, null);
        g4.t tVar = new g4.t();
        androidx.compose.ui.node.g.P0(this.view.getRoot(), m3.e.e((((long) Float.floatToRawIntBits(y15)) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(x15) << 32)), tVar, 0, false, 12, null);
        int iP = pq.v.p(tVar);
        while (true) {
            iG0 = PKIFailureInfo.systemUnavail;
            if (-1 >= iP) {
                break;
            }
            androidx.compose.ui.node.g gVarS = g4.h.s(tVar.get(iP));
            if (this.view.getAndroidViewsHandler$ui().getLayoutNodeToHolder().get(gVarS) != null) {
                return PKIFailureInfo.systemUnavail;
            }
            if (gVarS.getNodes().q(g4.s0.a(8))) {
                iG0 = G0(gVarS.getSemanticsId());
                n4.w wVarA = n4.x.a(gVarS, false);
                if (n4.b0.h(wVarA) && !n4.z.a(wVarA)) {
                    break;
                }
            }
            iP--;
        }
        return iG0;
    }

    public final boolean l0() {
        if (this.accessibilityForceEnabledForTesting) {
            return true;
        }
        return this.accessibilityManager.isEnabled() && !X().isEmpty();
    }

    @Override // android.view.accessibility.AccessibilityManager.AccessibilityStateChangeListener
    public void onAccessibilityStateChanged(boolean enabled) {
        A0();
    }

    @Override // android.view.accessibility.AccessibilityManager.TouchExplorationStateChangeListener
    public void onTouchExplorationStateChanged(boolean enabled) {
        A0();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        if (this.accessibilityManager.isEnabled()) {
            A0();
        }
        this.accessibilityManager.addAccessibilityStateChangeListener(this);
        this.accessibilityManager.addTouchExplorationStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        a0().removeCallbacks(this.semanticsChangeChecker);
        this.accessibilityManager.removeAccessibilityStateChangeListener(this);
        this.accessibilityManager.removeTouchExplorationStateChangeListener(this);
    }

    public final void r0(androidx.compose.ui.node.g layoutNode) {
        this.currentSemanticsNodesInvalidated = true;
        if (l0()) {
            q0(layoutNode);
        }
    }

    public final void s0() {
        this.currentSemanticsNodesInvalidated = true;
        Handler handlerA0 = a0();
        if (!l0() || this.checkingForSemanticsChanges || handlerA0 == null) {
            return;
        }
        this.checkingForSemanticsChanges = true;
        handlerA0.post(this.semanticsChangeChecker);
    }
}
