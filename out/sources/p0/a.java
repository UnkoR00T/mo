package p0;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.ViewConfiguration;
import fr.k;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 (2\u00020\u0001:\u0002\r\u000bB-\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0003\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\"\u0010\u0015\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\"\u0010\u001a\u001a\u00020\u00128\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u0014\u001a\u0004\b\u001a\u0010\u0016\"\u0004\b\u001b\u0010\u0018R\u0016\u0010\u001f\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0016\u0010!\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010\u001eR\u0016\u0010#\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0016\u0010'\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006)"}, d2 = {"Lp0/a;", "", "Landroid/content/Context;", "context", "", "spanSlop", "minSpan", "Lp0/a$b;", "listener", "<init>", "(Landroid/content/Context;IILp0/a$b;)V", "a", "Landroid/content/Context;", "b", "I", "c", "d", "Lp0/a$b;", "", "e", "Z", "isQuickZoomEnabled", "()Z", "setQuickZoomEnabled", "(Z)V", "f", "isStylusZoomEnabled", "setStylusZoomEnabled", "", "g", "F", "anchoredZoomStartX", "h", "anchoredZoomStartY", "i", "anchoredZoomMode", "Landroid/view/GestureDetector;", "j", "Landroid/view/GestureDetector;", "gestureDetector", "k", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int spanSlop;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final int minSpan;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final b listener;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean isQuickZoomEnabled;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean isStylusZoomEnabled;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private float anchoredZoomStartX;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private float anchoredZoomStartY;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private int anchoredZoomMode;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private GestureDetector gestureDetector;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bæ\u0080\u0001\u0018\u00002\u00020\u0001ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Lp0/a$b;", "", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"p0/a$c", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "Landroid/view/MotionEvent;", "e", "", "onDoubleTap", "(Landroid/view/MotionEvent;)Z", "viewfinder-core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends GestureDetector.SimpleOnGestureListener {
        c() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public boolean onDoubleTap(MotionEvent e15) {
            a.this.anchoredZoomStartX = e15.getX();
            a.this.anchoredZoomStartY = e15.getY();
            a.this.anchoredZoomMode = 1;
            return true;
        }
    }

    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, b bVar) {
        this(context, 0, 0, bVar, 6, null);
    }

    @SuppressLint({"ExecutorRegistration"})
    public a(Context context, int i15, int i16, b bVar) {
        this.context = context;
        this.spanSlop = i15;
        this.minSpan = i16;
        this.listener = bVar;
        this.isQuickZoomEnabled = true;
        this.isStylusZoomEnabled = true;
        this.gestureDetector = new GestureDetector(context, new c());
    }

    public /* synthetic */ a(Context context, int i15, int i16, b bVar, int i17, k kVar) {
        this(context, (i17 & 2) != 0 ? ViewConfiguration.get(context).getScaledTouchSlop() * 2 : i15, (i17 & 4) != 0 ? 0 : i16, bVar);
    }
}
