package io.sentry.android.replay.viewhierarchy;

import android.annotation.TargetApi;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.view.View;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;
import er.l;
import fr.k;
import fr.t;
import fu.r;
import io.sentry.android.replay.e;
import io.sentry.android.replay.util.n;
import io.sentry.android.replay.util.o;
import io.sentry.q7;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010 \n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u0000 :2\u00020\u0001:\u0004\u001b\u001f!%Bo\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0000\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u0019\u001a\u00020\u00142\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u000b0\u0017¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010\u001c\u001a\u0004\b \u0010\u001eR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010\"\u001a\u0004\b\u001f\u0010$R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010\u001c\u001a\u0004\b\u001b\u0010\u001eR\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b&\u0010\"\u001a\u0004\b'\u0010$R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00008\u0006¢\u0006\f\n\u0004\b\u0015\u0010(\u001a\u0004\b)\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0019\u0010+\u001a\u0004\b!\u0010,R\"\u0010\r\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b-\u0010+\u001a\u0004\b\r\u0010,\"\u0004\b.\u0010\u0016R\u0017\u0010\u000e\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b/\u0010+\u001a\u0004\b\u000e\u0010,R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b0\u00101\u001a\u0004\b%\u00102R*\u00109\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u0001038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b4\u00105\u001a\u0004\b6\u00107\"\u0004\b&\u00108\u0082\u0001\u0003;<=¨\u0006>"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b;", "", "", "x", "y", "", "width", "height", "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "isImportant", "Loq/i0;", "g", "(Z)V", "Lkotlin/Function1;", "callback", "h", "(Ler/l;)V", "a", "F", "getX", "()F", "b", "getY", "c", "I", "e", "()I", "d", "f", "getDistance", "Lio/sentry/android/replay/viewhierarchy/b;", "getParent", "()Lio/sentry/android/replay/viewhierarchy/b;", "Z", "()Z", "i", "setImportantForContentCapture", "j", "k", "Landroid/graphics/Rect;", "()Landroid/graphics/Rect;", "", "l", "Ljava/util/List;", "getChildren", "()Ljava/util/List;", "(Ljava/util/List;)V", "children", "m", "Lio/sentry/android/replay/viewhierarchy/b$b;", "Lio/sentry/android/replay/viewhierarchy/b$c;", "Lio/sentry/android/replay/viewhierarchy/b$d;", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@TargetApi(26)
public abstract class b {

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f94575n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final float x;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final float y;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int width;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final int height;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final float elevation;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int distance;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final b parent;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final boolean shouldMask;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private boolean isImportantForContentCapture;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final boolean isVisible;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final Rect visibleRect;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private List<? extends b> children;

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\t\u001a\u00020\b*\u0006\u0012\u0002\b\u00030\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000e\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u00020\b*\u00020\u00102\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001b\u0010\u0013\u001a\u00020\b*\u00020\u000b2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000fJ/\u0010\u0019\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u000b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001c¨\u0006\u001e"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$a;", "", "<init>", "()V", "Ljava/lang/Class;", "", "", "set", "", "b", "(Ljava/lang/Class;Ljava/util/Set;)Z", "Landroid/view/View;", "Lio/sentry/q7;", "options", "e", "(Landroid/view/View;Lio/sentry/q7;)Z", "Landroid/view/ViewParent;", "d", "(Landroid/view/ViewParent;Lio/sentry/q7;)Z", "c", "view", "Lio/sentry/android/replay/viewhierarchy/b;", "parent", "", "distance", "a", "(Landroid/view/View;Lio/sentry/android/replay/viewhierarchy/b;ILio/sentry/q7;)Lio/sentry/android/replay/viewhierarchy/b;", "SENTRY_MASK_TAG", "Ljava/lang/String;", "SENTRY_UNMASK_TAG", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(k kVar) {
            this();
        }

        private final boolean b(Class<?> cls, Set<String> set) {
            while (cls != null) {
                if (set.contains(cls.getName())) {
                    return true;
                }
                cls = cls.getSuperclass();
            }
            return false;
        }

        private final boolean c(View view, q7 q7Var) {
            String strF = q7Var.getSessionReplay().f();
            if (strF == null) {
                return false;
            }
            return t.c(view.getClass().getName(), strF);
        }

        private final boolean d(ViewParent viewParent, q7 q7Var) {
            String strN = q7Var.getSessionReplay().n();
            if (strN == null) {
                return false;
            }
            return t.c(viewParent.getClass().getName(), strN);
        }

        private final boolean e(View view, q7 q7Var) {
            String lowerCase;
            String lowerCase2;
            Object tag = view.getTag();
            String str = tag instanceof String ? (String) tag : null;
            if ((str != null && (lowerCase2 = str.toLowerCase(Locale.ROOT)) != null && r.d0(lowerCase2, "sentry-unmask", false, 2, null)) || t.c(view.getTag(e.f94429a), "unmask")) {
                return false;
            }
            Object tag2 = view.getTag();
            String str2 = tag2 instanceof String ? (String) tag2 : null;
            if ((str2 != null && (lowerCase = str2.toLowerCase(Locale.ROOT)) != null && r.d0(lowerCase, "sentry-mask", false, 2, null)) || t.c(view.getTag(e.f94429a), "mask")) {
                return true;
            }
            if ((c(view, q7Var) || view.getParent() == null || !d(view.getParent(), q7Var)) && !b(view.getClass(), q7Var.getSessionReplay().m())) {
                return b(view.getClass(), q7Var.getSessionReplay().e());
            }
            return false;
        }

        public final b a(View view, b parent, int distance, q7 options) {
            Drawable drawable;
            oq.r<Boolean, Rect> rVarG = o.g(view);
            boolean zBooleanValue = rVarG.a().booleanValue();
            Rect rectB = rVarG.b();
            boolean z15 = zBooleanValue && e(view, options);
            if (!(view instanceof TextView)) {
                if (!(view instanceof ImageView)) {
                    return new C2228b(view.getX(), view.getY(), view.getWidth(), view.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + view.getElevation(), distance, parent, z15, false, zBooleanValue, rectB);
                }
                if (parent != null) {
                    parent.g(true);
                }
                ImageView imageView = (ImageView) view;
                return new c(imageView.getX(), imageView.getY(), imageView.getWidth(), imageView.getHeight(), (parent != null ? parent.getElevation() : 0.0f) + imageView.getElevation(), distance, parent, z15 && (drawable = imageView.getDrawable()) != null && o.f(drawable), true, zBooleanValue, rectB);
            }
            if (parent != null) {
                parent.g(true);
            }
            TextView textView = (TextView) view;
            Layout layout = textView.getLayout();
            io.sentry.android.replay.util.a aVar = layout != null ? new io.sentry.android.replay.util.a(layout) : null;
            int iJ = o.j(textView.getCurrentTextColor());
            int totalPaddingLeft = textView.getTotalPaddingLeft();
            int iC = o.c(textView);
            float x15 = textView.getX();
            float y15 = textView.getY();
            int width = textView.getWidth();
            float elevation = 0.0f;
            int height = textView.getHeight();
            if (parent != null) {
                elevation = parent.getElevation();
            }
            return new d(aVar, Integer.valueOf(iJ), totalPaddingLeft, iC, x15, y15, width, height, elevation + textView.getElevation(), distance, parent, z15, true, zBooleanValue, rectB);
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: io.sentry.android.replay.viewhierarchy.b$b, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$b;", "Lio/sentry/android/replay/viewhierarchy/b;", "", "x", "y", "", "width", "height", "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class C2228b extends b {
        public C2228b(float f15, float f16, int i15, int i16, float f17, int i17, b bVar, boolean z15, boolean z16, boolean z17, Rect rect) {
            super(f15, f16, i15, i16, f17, i17, bVar, z15, z16, z17, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001Bm\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$c;", "Lio/sentry/android/replay/viewhierarchy/b;", "", "x", "y", "", "width", "height", "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(FFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends b {
        public c(float f15, float f16, int i15, int i16, float f17, int i17, b bVar, boolean z15, boolean z16, boolean z17, Rect rect) {
            super(f15, f16, i15, i16, f17, i17, bVar, z15, z16, z17, rect, null);
        }
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0007\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\u0004\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\u0006\u0010\r\u001a\u00020\b\u0012\u0006\u0010\u000e\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0001\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u0007\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#¨\u0006&"}, d2 = {"Lio/sentry/android/replay/viewhierarchy/b$d;", "Lio/sentry/android/replay/viewhierarchy/b;", "Lio/sentry/android/replay/util/n;", "layout", "", "dominantColor", "paddingLeft", "paddingTop", "", "x", "y", "width", "height", "elevation", "distance", "parent", "", "shouldMask", "isImportantForContentCapture", "isVisible", "Landroid/graphics/Rect;", "visibleRect", "<init>", "(Lio/sentry/android/replay/util/n;Ljava/lang/Integer;IIFFIIFILio/sentry/android/replay/viewhierarchy/b;ZZZLandroid/graphics/Rect;)V", "o", "Lio/sentry/android/replay/util/n;", "j", "()Lio/sentry/android/replay/util/n;", "p", "Ljava/lang/Integer;", "i", "()Ljava/lang/Integer;", "q", "I", "k", "()I", "r", "l", "sentry-android-replay_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends b {

        /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
        private final n layout;

        /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
        private final Integer dominantColor;

        /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
        private final int paddingLeft;

        /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
        private final int paddingTop;

        public /* synthetic */ d(n nVar, Integer num, int i15, int i16, float f15, float f16, int i17, int i18, float f17, int i19, b bVar, boolean z15, boolean z16, boolean z17, Rect rect, int i25, k kVar) {
            this((i25 & 1) != 0 ? null : nVar, (i25 & 2) != 0 ? null : num, (i25 & 4) != 0 ? 0 : i15, (i25 & 8) != 0 ? 0 : i16, f15, f16, i17, i18, f17, i19, (i25 & 1024) != 0 ? null : bVar, (i25 & 2048) != 0 ? false : z15, (i25 & PKIFailureInfo.certConfirmed) != 0 ? false : z16, (i25 & PKIFailureInfo.certRevoked) != 0 ? false : z17, (i25 & 16384) != 0 ? null : rect);
        }

        /* JADX INFO: renamed from: i, reason: from getter */
        public final Integer getDominantColor() {
            return this.dominantColor;
        }

        /* JADX INFO: renamed from: j, reason: from getter */
        public final n getLayout() {
            return this.layout;
        }

        /* JADX INFO: renamed from: k, reason: from getter */
        public final int getPaddingLeft() {
            return this.paddingLeft;
        }

        /* JADX INFO: renamed from: l, reason: from getter */
        public final int getPaddingTop() {
            return this.paddingTop;
        }

        public d(n nVar, Integer num, int i15, int i16, float f15, float f16, int i17, int i18, float f17, int i19, b bVar, boolean z15, boolean z16, boolean z17, Rect rect) {
            super(f15, f16, i17, i18, f17, i19, bVar, z15, z16, z17, rect, null);
            this.layout = nVar;
            this.dominantColor = num;
            this.paddingLeft = i15;
            this.paddingTop = i16;
        }
    }

    public /* synthetic */ b(float f15, float f16, int i15, int i16, float f17, int i17, b bVar, boolean z15, boolean z16, boolean z17, Rect rect, k kVar) {
        this(f15, f16, i15, i16, f17, i17, bVar, z15, z16, z17, rect);
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final float getElevation() {
        return this.elevation;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final boolean getShouldMask() {
        return this.shouldMask;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final Rect getVisibleRect() {
        return this.visibleRect;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    public final void f(List<? extends b> list) {
        this.children = list;
    }

    public final void g(boolean isImportant) {
        for (b bVar = this.parent; bVar != null; bVar = bVar.parent) {
            bVar.isImportantForContentCapture = isImportant;
        }
    }

    public final void h(l<? super b, Boolean> callback) {
        List<? extends b> list;
        if (!callback.b(this).booleanValue() || (list = this.children) == null) {
            return;
        }
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            ((b) it.next()).h(callback);
        }
    }

    private b(float f15, float f16, int i15, int i16, float f17, int i17, b bVar, boolean z15, boolean z16, boolean z17, Rect rect) {
        this.x = f15;
        this.y = f16;
        this.width = i15;
        this.height = i16;
        this.elevation = f17;
        this.distance = i17;
        this.parent = bVar;
        this.shouldMask = z15;
        this.isImportantForContentCapture = z16;
        this.isVisible = z17;
        this.visibleRect = rect;
    }
}
