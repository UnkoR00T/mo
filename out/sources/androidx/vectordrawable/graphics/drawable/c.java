package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w5.h;
import w5.k;

/* JADX INFO: loaded from: classes3.dex */
public class c extends e implements Animatable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private C0287c f13514b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Context f13515c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ArgbEvaluator f13516d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    d f13517e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Animator.AnimatorListener f13518f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    ArrayList<androidx.vectordrawable.graphics.drawable.b> f13519g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final Drawable.Callback f13520h;

    class a implements Drawable.Callback {
        a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j15) {
            c.this.scheduleSelf(runnable, j15);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            c.this.unscheduleSelf(runnable);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f13519g);
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i15)).b(c.this);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            ArrayList arrayList = new ArrayList(c.this.f13519g);
            int size = arrayList.size();
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.vectordrawable.graphics.drawable.b) arrayList.get(i15)).c(c.this);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.c$c, reason: collision with other inner class name */
    private static class C0287c extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13523a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        f f13524b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        AnimatorSet f13525c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        ArrayList<Animator> f13526d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        r0.a<Animator, String> f13527e;

        public C0287c(Context context, C0287c c0287c, Drawable.Callback callback, Resources resources) {
            if (c0287c != null) {
                this.f13523a = c0287c.f13523a;
                f fVar = c0287c.f13524b;
                if (fVar != null) {
                    Drawable.ConstantState constantState = fVar.getConstantState();
                    if (resources != null) {
                        this.f13524b = (f) constantState.newDrawable(resources);
                    } else {
                        this.f13524b = (f) constantState.newDrawable();
                    }
                    f fVar2 = (f) this.f13524b.mutate();
                    this.f13524b = fVar2;
                    fVar2.setCallback(callback);
                    this.f13524b.setBounds(c0287c.f13524b.getBounds());
                    this.f13524b.g(false);
                }
                ArrayList<Animator> arrayList = c0287c.f13526d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f13526d = new ArrayList<>(size);
                    this.f13527e = new r0.a<>(size);
                    for (int i15 = 0; i15 < size; i15++) {
                        Animator animator = c0287c.f13526d.get(i15);
                        Animator animatorClone = animator.clone();
                        String str = c0287c.f13527e.get(animator);
                        animatorClone.setTarget(this.f13524b.c(str));
                        this.f13526d.add(animatorClone);
                        this.f13527e.put(animatorClone, str);
                    }
                    a();
                }
            }
        }

        public void a() {
            if (this.f13525c == null) {
                this.f13525c = new AnimatorSet();
            }
            this.f13525c.playTogether(this.f13526d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13523a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    c() {
        this(null, null, null);
    }

    public static c a(Context context, int i15) {
        c cVar = new c(context);
        Drawable drawableE = h.e(context.getResources(), i15, context.getTheme());
        cVar.f13529a = drawableE;
        drawableE.setCallback(cVar.f13520h);
        cVar.f13517e = new d(cVar.f13529a.getConstantState());
        return cVar;
    }

    private static void c(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        animatedVectorDrawable.registerAnimationCallback(bVar.a());
    }

    private void d() {
        Animator.AnimatorListener animatorListener = this.f13518f;
        if (animatorListener != null) {
            this.f13514b.f13525c.removeListener(animatorListener);
            this.f13518f = null;
        }
    }

    private void e(String str, Animator animator) {
        animator.setTarget(this.f13514b.f13524b.c(str));
        C0287c c0287c = this.f13514b;
        if (c0287c.f13526d == null) {
            c0287c.f13526d = new ArrayList<>();
            this.f13514b.f13527e = new r0.a<>();
        }
        this.f13514b.f13526d.add(animator);
        this.f13514b.f13527e.put(animator, str);
    }

    private static boolean g(AnimatedVectorDrawable animatedVectorDrawable, androidx.vectordrawable.graphics.drawable.b bVar) {
        return animatedVectorDrawable.unregisterAnimationCallback(bVar.a());
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.a(drawable, theme);
        }
    }

    public void b(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            c((AnimatedVectorDrawable) drawable, bVar);
            return;
        }
        if (bVar == null) {
            return;
        }
        if (this.f13519g == null) {
            this.f13519g = new ArrayList<>();
        }
        if (this.f13519g.contains(bVar)) {
            return;
        }
        this.f13519g.add(bVar);
        if (this.f13518f == null) {
            this.f13518f = new b();
        }
        this.f13514b.f13525c.addListener(this.f13518f);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            return y5.a.b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f13514b.f13524b.draw(canvas);
        if (this.f13514b.f13525c.isStarted()) {
            invalidateSelf();
        }
    }

    public boolean f(androidx.vectordrawable.graphics.drawable.b bVar) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            g((AnimatedVectorDrawable) drawable, bVar);
        }
        ArrayList<androidx.vectordrawable.graphics.drawable.b> arrayList = this.f13519g;
        if (arrayList == null || bVar == null) {
            return false;
        }
        boolean zRemove = arrayList.remove(bVar);
        if (this.f13519g.size() == 0) {
            d();
        }
        return zRemove;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f13529a;
        return drawable != null ? y5.a.d(drawable) : this.f13514b.f13524b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f13514b.f13523a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f13529a;
        return drawable != null ? y5.a.e(drawable) : this.f13514b.f13524b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f13529a != null) {
            return new d(this.f13529a.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getIntrinsicHeight() : this.f13514b.f13524b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getIntrinsicWidth() : this.f13514b.f13524b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getOpacity() : this.f13514b.f13524b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f13504e);
                    int resourceId = typedArrayI.getResourceId(0, 0);
                    if (resourceId != 0) {
                        f fVarB = f.b(resources, resourceId, theme);
                        fVarB.g(false);
                        fVarB.setCallback(this.f13520h);
                        f fVar = this.f13514b.f13524b;
                        if (fVar != null) {
                            fVar.setCallback(null);
                        }
                        this.f13514b.f13524b = fVarB;
                    }
                    typedArrayI.recycle();
                } else if ("target".equals(name)) {
                    TypedArray typedArrayObtainAttributes = resources.obtainAttributes(attributeSet, androidx.vectordrawable.graphics.drawable.a.f13505f);
                    String string = typedArrayObtainAttributes.getString(0);
                    int resourceId2 = typedArrayObtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f13515c;
                        if (context == null) {
                            typedArrayObtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                        e(string, androidx.vectordrawable.graphics.drawable.d.a(context, resourceId2));
                    }
                    typedArrayObtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f13514b.a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f13529a;
        return drawable != null ? y5.a.h(drawable) : this.f13514b.f13524b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f13529a;
        return drawable != null ? ((AnimatedVectorDrawable) drawable).isRunning() : this.f13514b.f13525c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.isStateful() : this.f13514b.f13524b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f13514b.f13524b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i15) {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.setLevel(i15) : this.f13514b.f13524b.setLevel(i15);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.setState(iArr) : this.f13514b.f13524b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setAlpha(i15);
        } else {
            this.f13514b.f13524b.setAlpha(i15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.j(drawable, z15);
        } else {
            this.f13514b.f13524b.setAutoMirrored(z15);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i15) {
        super.setChangingConfigurations(i15);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i15, PorterDuff.Mode mode) {
        super.setColorFilter(i15, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z15) {
        super.setFilterBitmap(z15);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f15, float f16) {
        super.setHotspot(f15, f16);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i15, int i16, int i17, int i18) {
        super.setHotspotBounds(i15, i16, i17, i18);
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.n(drawable, i15);
        } else {
            this.f13514b.f13524b.setTint(i15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.o(drawable, colorStateList);
        } else {
            this.f13514b.f13524b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.p(drawable, mode);
        } else {
            this.f13514b.f13524b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z15, boolean z16) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            return drawable.setVisible(z15, z16);
        }
        this.f13514b.f13524b.setVisible(z15, z16);
        return super.setVisible(z15, z16);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else {
            if (this.f13514b.f13525c.isStarted()) {
                return;
            }
            this.f13514b.f13525c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f13514b.f13525c.end();
        }
    }

    private c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13514b.f13524b.setColorFilter(colorFilter);
        }
    }

    private static class d extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f13528a;

        public d(Drawable.ConstantState constantState) {
            this.f13528a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f13528a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13528a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f13528a.newDrawable();
            cVar.f13529a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f13520h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f13528a.newDrawable(resources);
            cVar.f13529a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f13520h);
            return cVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            c cVar = new c();
            Drawable drawableNewDrawable = this.f13528a.newDrawable(resources, theme);
            cVar.f13529a = drawableNewDrawable;
            drawableNewDrawable.setCallback(cVar.f13520h);
            return cVar;
        }
    }

    private c(Context context, C0287c c0287c, Resources resources) {
        this.f13516d = null;
        this.f13518f = null;
        this.f13519g = null;
        a aVar = new a();
        this.f13520h = aVar;
        this.f13515c = context;
        if (c0287c != null) {
            this.f13514b = c0287c;
        } else {
            this.f13514b = new C0287c(context, c0287c, aVar, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}
