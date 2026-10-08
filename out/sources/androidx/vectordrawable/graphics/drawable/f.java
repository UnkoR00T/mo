package androidx.vectordrawable.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import org.bouncycastle.pqc.crypto.rainbow.GF2Field;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import w5.k;
import x5.j;

/* JADX INFO: loaded from: classes3.dex */
public class f extends androidx.vectordrawable.graphics.drawable.e {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    static final PorterDuff.Mode f13530l = PorterDuff.Mode.SRC_IN;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private h f13531b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PorterDuffColorFilter f13532c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private ColorFilter f13533d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f13534e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f13535f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Drawable.ConstantState f13536g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final float[] f13537h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final Matrix f13538j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final Rect f13539k;

    private static class b extends AbstractC0288f {
        b() {
        }

        private void f(TypedArray typedArray, XmlPullParser xmlPullParser) {
            String string = typedArray.getString(0);
            if (string != null) {
                this.f13566b = string;
            }
            String string2 = typedArray.getString(1);
            if (string2 != null) {
                this.f13565a = j.d(string2);
            }
            this.f13567c = k.g(typedArray, xmlPullParser, "fillType", 2, 0);
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.AbstractC0288f
        public boolean c() {
            return true;
        }

        public void e(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            if (k.h(xmlPullParser, "pathData")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f13503d);
                f(typedArrayI, xmlPullParser);
                typedArrayI.recycle();
            }
        }

        b(b bVar) {
            super(bVar);
        }
    }

    private static abstract class e {
        private e() {
        }

        public boolean a() {
            return false;
        }

        public boolean b(int[] iArr) {
            return false;
        }
    }

    private static class h extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13586a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        g f13587b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ColorStateList f13588c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        PorterDuff.Mode f13589d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f13590e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Bitmap f13591f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        ColorStateList f13592g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        PorterDuff.Mode f13593h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f13594i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        boolean f13595j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        boolean f13596k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        Paint f13597l;

        public h(h hVar) {
            this.f13588c = null;
            this.f13589d = f.f13530l;
            if (hVar != null) {
                this.f13586a = hVar.f13586a;
                g gVar = new g(hVar.f13587b);
                this.f13587b = gVar;
                if (hVar.f13587b.f13574e != null) {
                    gVar.f13574e = new Paint(hVar.f13587b.f13574e);
                }
                if (hVar.f13587b.f13573d != null) {
                    this.f13587b.f13573d = new Paint(hVar.f13587b.f13573d);
                }
                this.f13588c = hVar.f13588c;
                this.f13589d = hVar.f13589d;
                this.f13590e = hVar.f13590e;
            }
        }

        public boolean a(int i15, int i16) {
            return i15 == this.f13591f.getWidth() && i16 == this.f13591f.getHeight();
        }

        public boolean b() {
            return !this.f13596k && this.f13592g == this.f13588c && this.f13593h == this.f13589d && this.f13595j == this.f13590e && this.f13594i == this.f13587b.getRootAlpha();
        }

        public void c(int i15, int i16) {
            if (this.f13591f == null || !a(i15, i16)) {
                this.f13591f = Bitmap.createBitmap(i15, i16, Bitmap.Config.ARGB_8888);
                this.f13596k = true;
            }
        }

        public void d(Canvas canvas, ColorFilter colorFilter, Rect rect) {
            canvas.drawBitmap(this.f13591f, (Rect) null, rect, e(colorFilter));
        }

        public Paint e(ColorFilter colorFilter) {
            if (!f() && colorFilter == null) {
                return null;
            }
            if (this.f13597l == null) {
                Paint paint = new Paint();
                this.f13597l = paint;
                paint.setFilterBitmap(true);
            }
            this.f13597l.setAlpha(this.f13587b.getRootAlpha());
            this.f13597l.setColorFilter(colorFilter);
            return this.f13597l;
        }

        public boolean f() {
            return this.f13587b.getRootAlpha() < 255;
        }

        public boolean g() {
            return this.f13587b.f();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13586a;
        }

        public boolean h(int[] iArr) {
            boolean zG = this.f13587b.g(iArr);
            this.f13596k |= zG;
            return zG;
        }

        public void i() {
            this.f13592g = this.f13588c;
            this.f13593h = this.f13589d;
            this.f13594i = this.f13587b.getRootAlpha();
            this.f13595j = this.f13590e;
            this.f13596k = false;
        }

        public void j(int i15, int i16) {
            this.f13591f.eraseColor(0);
            this.f13587b.b(new Canvas(this.f13591f), i15, i16, null);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new f(this);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new f(this);
        }

        public h() {
            this.f13588c = null;
            this.f13589d = f.f13530l;
            this.f13587b = new g();
        }
    }

    f() {
        this.f13535f = true;
        this.f13537h = new float[9];
        this.f13538j = new Matrix();
        this.f13539k = new Rect();
        this.f13531b = new h();
    }

    static int a(int i15, float f15) {
        return (i15 & 16777215) | (((int) (Color.alpha(i15) * f15)) << 24);
    }

    public static f b(Resources resources, int i15, Resources.Theme theme) {
        f fVar = new f();
        fVar.f13529a = w5.h.e(resources, i15, theme);
        fVar.f13536g = new i(fVar.f13529a.getConstantState());
        return fVar;
    }

    private void d(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        h hVar = this.f13531b;
        g gVar = hVar.f13587b;
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(gVar.f13577h);
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        boolean z15 = true;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                d dVar = (d) arrayDeque.peek();
                if ("path".equals(name)) {
                    c cVar = new c();
                    cVar.g(resources, attributeSet, theme, xmlPullParser);
                    dVar.f13553b.add(cVar);
                    if (cVar.getPathName() != null) {
                        gVar.f13585p.put(cVar.getPathName(), cVar);
                    }
                    hVar.f13586a = cVar.f13568d | hVar.f13586a;
                    z15 = false;
                } else if ("clip-path".equals(name)) {
                    b bVar = new b();
                    bVar.e(resources, attributeSet, theme, xmlPullParser);
                    dVar.f13553b.add(bVar);
                    if (bVar.getPathName() != null) {
                        gVar.f13585p.put(bVar.getPathName(), bVar);
                    }
                    hVar.f13586a = bVar.f13568d | hVar.f13586a;
                } else if ("group".equals(name)) {
                    d dVar2 = new d();
                    dVar2.c(resources, attributeSet, theme, xmlPullParser);
                    dVar.f13553b.add(dVar2);
                    arrayDeque.push(dVar2);
                    if (dVar2.getGroupName() != null) {
                        gVar.f13585p.put(dVar2.getGroupName(), dVar2);
                    }
                    hVar.f13586a = dVar2.f13562k | hVar.f13586a;
                }
            } else if (eventType == 3 && "group".equals(xmlPullParser.getName())) {
                arrayDeque.pop();
            }
            eventType = xmlPullParser.next();
        }
        if (z15) {
            throw new XmlPullParserException("no path defined");
        }
    }

    private boolean e() {
        return isAutoMirrored() && y5.a.f(this) == 1;
    }

    private static PorterDuff.Mode f(int i15, PorterDuff.Mode mode) {
        if (i15 == 3) {
            return PorterDuff.Mode.SRC_OVER;
        }
        if (i15 == 5) {
            return PorterDuff.Mode.SRC_IN;
        }
        if (i15 == 9) {
            return PorterDuff.Mode.SRC_ATOP;
        }
        switch (i15) {
            case 14:
                return PorterDuff.Mode.MULTIPLY;
            case 15:
                return PorterDuff.Mode.SCREEN;
            case 16:
                return PorterDuff.Mode.ADD;
            default:
                return mode;
        }
    }

    private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException {
        h hVar = this.f13531b;
        g gVar = hVar.f13587b;
        hVar.f13589d = f(k.g(typedArray, xmlPullParser, "tintMode", 6, -1), PorterDuff.Mode.SRC_IN);
        ColorStateList colorStateListC = k.c(typedArray, xmlPullParser, theme, "tint", 1);
        if (colorStateListC != null) {
            hVar.f13588c = colorStateListC;
        }
        hVar.f13590e = k.a(typedArray, xmlPullParser, "autoMirrored", 5, hVar.f13590e);
        gVar.f13580k = k.f(typedArray, xmlPullParser, "viewportWidth", 7, gVar.f13580k);
        float f15 = k.f(typedArray, xmlPullParser, "viewportHeight", 8, gVar.f13581l);
        gVar.f13581l = f15;
        if (gVar.f13580k <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportWidth > 0");
        }
        if (f15 <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires viewportHeight > 0");
        }
        gVar.f13578i = typedArray.getDimension(3, gVar.f13578i);
        float dimension = typedArray.getDimension(2, gVar.f13579j);
        gVar.f13579j = dimension;
        if (gVar.f13578i <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires width > 0");
        }
        if (dimension <= 0.0f) {
            throw new XmlPullParserException(typedArray.getPositionDescription() + "<vector> tag requires height > 0");
        }
        gVar.setAlpha(k.f(typedArray, xmlPullParser, "alpha", 4, gVar.getAlpha()));
        String string = typedArray.getString(0);
        if (string != null) {
            gVar.f13583n = string;
            gVar.f13585p.put(string, gVar);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
    }

    Object c(String str) {
        return this.f13531b.f13587b.f13585p.get(str);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f13529a;
        if (drawable == null) {
            return false;
        }
        y5.a.b(drawable);
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
        copyBounds(this.f13539k);
        if (this.f13539k.width() <= 0 || this.f13539k.height() <= 0) {
            return;
        }
        ColorFilter colorFilter = this.f13533d;
        if (colorFilter == null) {
            colorFilter = this.f13532c;
        }
        canvas.getMatrix(this.f13538j);
        this.f13538j.getValues(this.f13537h);
        float fAbs = Math.abs(this.f13537h[0]);
        float fAbs2 = Math.abs(this.f13537h[4]);
        float fAbs3 = Math.abs(this.f13537h[1]);
        float fAbs4 = Math.abs(this.f13537h[3]);
        if (fAbs3 != 0.0f || fAbs4 != 0.0f) {
            fAbs = 1.0f;
            fAbs2 = 1.0f;
        }
        int iWidth = (int) (this.f13539k.width() * fAbs);
        int iHeight = (int) (this.f13539k.height() * fAbs2);
        int iMin = Math.min(2048, iWidth);
        int iMin2 = Math.min(2048, iHeight);
        if (iMin <= 0 || iMin2 <= 0) {
            return;
        }
        int iSave = canvas.save();
        Rect rect = this.f13539k;
        canvas.translate(rect.left, rect.top);
        if (e()) {
            canvas.translate(this.f13539k.width(), 0.0f);
            canvas.scale(-1.0f, 1.0f);
        }
        this.f13539k.offsetTo(0, 0);
        this.f13531b.c(iMin, iMin2);
        if (!this.f13535f) {
            this.f13531b.j(iMin, iMin2);
        } else if (!this.f13531b.b()) {
            this.f13531b.j(iMin, iMin2);
            this.f13531b.i();
        }
        this.f13531b.d(canvas, colorFilter, this.f13539k);
        canvas.restoreToCount(iSave);
    }

    void g(boolean z15) {
        this.f13535f = z15;
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f13529a;
        return drawable != null ? y5.a.d(drawable) : this.f13531b.f13587b.getRootAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getChangingConfigurations() : super.getChangingConfigurations() | this.f13531b.getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f13529a;
        return drawable != null ? y5.a.e(drawable) : this.f13533d;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f13529a != null) {
            return new i(this.f13529a.getConstantState());
        }
        this.f13531b.f13586a = getChangingConfigurations();
        return this.f13531b;
    }

    @Override // androidx.vectordrawable.graphics.drawable.e, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getIntrinsicHeight() : (int) this.f13531b.f13587b.f13579j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.getIntrinsicWidth() : (int) this.f13531b.f13587b.f13578i;
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
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return -3;
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

    PorterDuffColorFilter i(PorterDuffColorFilter porterDuffColorFilter, ColorStateList colorStateList, PorterDuff.Mode mode) {
        if (colorStateList == null || mode == null) {
            return null;
        }
        return new PorterDuffColorFilter(colorStateList.getColorForState(getState(), 0), mode);
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.inflate(resources, xmlPullParser, attributeSet);
        } else {
            inflate(resources, xmlPullParser, attributeSet, null);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void invalidateSelf() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.invalidateSelf();
        } else {
            super.invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f13529a;
        return drawable != null ? y5.a.h(drawable) : this.f13531b.f13590e;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            return drawable.isStateful();
        }
        if (super.isStateful()) {
            return true;
        }
        h hVar = this.f13531b;
        if (hVar == null) {
            return false;
        }
        if (hVar.g()) {
            return true;
        }
        ColorStateList colorStateList = this.f13531b.f13588c;
        return colorStateList != null && colorStateList.isStateful();
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
            return this;
        }
        if (!this.f13534e && super.mutate() == this) {
            this.f13531b = new h(this.f13531b);
            this.f13534e = true;
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean z15;
        PorterDuff.Mode mode;
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        h hVar = this.f13531b;
        ColorStateList colorStateList = hVar.f13588c;
        if (colorStateList == null || (mode = hVar.f13589d) == null) {
            z15 = false;
        } else {
            this.f13532c = i(this.f13532c, colorStateList, mode);
            invalidateSelf();
            z15 = true;
        }
        if (!hVar.g() || !hVar.h(iArr)) {
            return z15;
        }
        invalidateSelf();
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void scheduleSelf(Runnable runnable, long j15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.scheduleSelf(runnable, j15);
        } else {
            super.scheduleSelf(runnable, j15);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setAlpha(i15);
        } else if (this.f13531b.f13587b.getRootAlpha() != i15) {
            this.f13531b.f13587b.setRootAlpha(i15);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z15) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.j(drawable, z15);
        } else {
            this.f13531b.f13590e = z15;
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
            setTintList(ColorStateList.valueOf(i15));
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.o(drawable, colorStateList);
            return;
        }
        h hVar = this.f13531b;
        if (hVar.f13588c != colorStateList) {
            hVar.f13588c = colorStateList;
            this.f13532c = i(this.f13532c, colorStateList, hVar.f13589d);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.p(drawable, mode);
            return;
        }
        h hVar = this.f13531b;
        if (hVar.f13589d != mode) {
            hVar.f13589d = mode;
            this.f13532c = i(this.f13532c, hVar.f13588c, mode);
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z15, boolean z16) {
        Drawable drawable = this.f13529a;
        return drawable != null ? drawable.setVisible(z15, z16) : super.setVisible(z15, z16);
    }

    @Override // android.graphics.drawable.Drawable
    public void unscheduleSelf(Runnable runnable) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.unscheduleSelf(runnable);
        } else {
            super.unscheduleSelf(runnable);
        }
    }

    private static class i extends Drawable.ConstantState {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Drawable.ConstantState f13598a;

        public i(Drawable.ConstantState constantState) {
            this.f13598a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f13598a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f13598a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            f fVar = new f();
            fVar.f13529a = (VectorDrawable) this.f13598a.newDrawable();
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            f fVar = new f();
            fVar.f13529a = (VectorDrawable) this.f13598a.newDrawable(resources);
            return fVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            f fVar = new f();
            fVar.f13529a = (VectorDrawable) this.f13598a.newDrawable(resources, theme);
            return fVar;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f13533d = colorFilter;
            invalidateSelf();
        }
    }

    /* JADX INFO: renamed from: androidx.vectordrawable.graphics.drawable.f$f, reason: collision with other inner class name */
    private static abstract class AbstractC0288f extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected j.b[] f13565a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f13566b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13567c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13568d;

        public AbstractC0288f() {
            super();
            this.f13565a = null;
            this.f13567c = 0;
        }

        public boolean c() {
            return false;
        }

        public void d(Path path) {
            path.reset();
            j.b[] bVarArr = this.f13565a;
            if (bVarArr != null) {
                j.b.h(bVarArr, path);
            }
        }

        public j.b[] getPathData() {
            return this.f13565a;
        }

        public String getPathName() {
            return this.f13566b;
        }

        public void setPathData(j.b[] bVarArr) {
            if (j.b(this.f13565a, bVarArr)) {
                j.k(this.f13565a, bVarArr);
            } else {
                this.f13565a = j.f(bVarArr);
            }
        }

        public AbstractC0288f(AbstractC0288f abstractC0288f) {
            super();
            this.f13565a = null;
            this.f13567c = 0;
            this.f13566b = abstractC0288f.f13566b;
            this.f13568d = abstractC0288f.f13568d;
            this.f13565a = j.f(abstractC0288f.f13565a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        Drawable drawable = this.f13529a;
        if (drawable != null) {
            y5.a.g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        h hVar = this.f13531b;
        hVar.f13587b = new g();
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f13500a);
        h(typedArrayI, xmlPullParser, theme);
        typedArrayI.recycle();
        hVar.f13586a = getChangingConfigurations();
        hVar.f13596k = true;
        d(resources, xmlPullParser, attributeSet, theme);
        this.f13532c = i(this.f13532c, hVar.f13588c, hVar.f13589d);
    }

    f(h hVar) {
        this.f13535f = true;
        this.f13537h = new float[9];
        this.f13538j = new Matrix();
        this.f13539k = new Rect();
        this.f13531b = hVar;
        this.f13532c = i(this.f13532c, hVar.f13588c, hVar.f13589d);
    }

    private static class c extends AbstractC0288f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private int[] f13540e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        w5.d f13541f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        float f13542g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        w5.d f13543h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f13544i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f13545j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f13546k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f13547l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        float f13548m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        Paint.Cap f13549n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Paint.Join f13550o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        float f13551p;

        c() {
            this.f13542g = 0.0f;
            this.f13544i = 1.0f;
            this.f13545j = 1.0f;
            this.f13546k = 0.0f;
            this.f13547l = 1.0f;
            this.f13548m = 0.0f;
            this.f13549n = Paint.Cap.BUTT;
            this.f13550o = Paint.Join.MITER;
            this.f13551p = 4.0f;
        }

        private Paint.Cap e(int i15, Paint.Cap cap) {
            if (i15 == 0) {
                return Paint.Cap.BUTT;
            }
            if (i15 != 1) {
                return i15 != 2 ? cap : Paint.Cap.SQUARE;
            }
            return Paint.Cap.ROUND;
        }

        private Paint.Join f(int i15, Paint.Join join) {
            if (i15 == 0) {
                return Paint.Join.MITER;
            }
            if (i15 != 1) {
                return i15 != 2 ? join : Paint.Join.BEVEL;
            }
            return Paint.Join.ROUND;
        }

        private void h(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme) {
            this.f13540e = null;
            if (k.h(xmlPullParser, "pathData")) {
                String string = typedArray.getString(0);
                if (string != null) {
                    this.f13566b = string;
                }
                String string2 = typedArray.getString(2);
                if (string2 != null) {
                    this.f13565a = j.d(string2);
                }
                this.f13543h = k.e(typedArray, xmlPullParser, theme, "fillColor", 1, 0);
                this.f13545j = k.f(typedArray, xmlPullParser, "fillAlpha", 12, this.f13545j);
                this.f13549n = e(k.g(typedArray, xmlPullParser, "strokeLineCap", 8, -1), this.f13549n);
                this.f13550o = f(k.g(typedArray, xmlPullParser, "strokeLineJoin", 9, -1), this.f13550o);
                this.f13551p = k.f(typedArray, xmlPullParser, "strokeMiterLimit", 10, this.f13551p);
                this.f13541f = k.e(typedArray, xmlPullParser, theme, "strokeColor", 3, 0);
                this.f13544i = k.f(typedArray, xmlPullParser, "strokeAlpha", 11, this.f13544i);
                this.f13542g = k.f(typedArray, xmlPullParser, "strokeWidth", 4, this.f13542g);
                this.f13547l = k.f(typedArray, xmlPullParser, "trimPathEnd", 6, this.f13547l);
                this.f13548m = k.f(typedArray, xmlPullParser, "trimPathOffset", 7, this.f13548m);
                this.f13546k = k.f(typedArray, xmlPullParser, "trimPathStart", 5, this.f13546k);
                this.f13567c = k.g(typedArray, xmlPullParser, "fillType", 13, this.f13567c);
            }
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            return this.f13543h.i() || this.f13541f.i();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            return this.f13541f.j(iArr) | this.f13543h.j(iArr);
        }

        public void g(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f13502c);
            h(typedArrayI, xmlPullParser, theme);
            typedArrayI.recycle();
        }

        float getFillAlpha() {
            return this.f13545j;
        }

        int getFillColor() {
            return this.f13543h.e();
        }

        float getStrokeAlpha() {
            return this.f13544i;
        }

        int getStrokeColor() {
            return this.f13541f.e();
        }

        float getStrokeWidth() {
            return this.f13542g;
        }

        float getTrimPathEnd() {
            return this.f13547l;
        }

        float getTrimPathOffset() {
            return this.f13548m;
        }

        float getTrimPathStart() {
            return this.f13546k;
        }

        void setFillAlpha(float f15) {
            this.f13545j = f15;
        }

        void setFillColor(int i15) {
            this.f13543h.k(i15);
        }

        void setStrokeAlpha(float f15) {
            this.f13544i = f15;
        }

        void setStrokeColor(int i15) {
            this.f13541f.k(i15);
        }

        void setStrokeWidth(float f15) {
            this.f13542g = f15;
        }

        void setTrimPathEnd(float f15) {
            this.f13547l = f15;
        }

        void setTrimPathOffset(float f15) {
            this.f13548m = f15;
        }

        void setTrimPathStart(float f15) {
            this.f13546k = f15;
        }

        c(c cVar) {
            super(cVar);
            this.f13542g = 0.0f;
            this.f13544i = 1.0f;
            this.f13545j = 1.0f;
            this.f13546k = 0.0f;
            this.f13547l = 1.0f;
            this.f13548m = 0.0f;
            this.f13549n = Paint.Cap.BUTT;
            this.f13550o = Paint.Join.MITER;
            this.f13551p = 4.0f;
            this.f13540e = cVar.f13540e;
            this.f13541f = cVar.f13541f;
            this.f13542g = cVar.f13542g;
            this.f13544i = cVar.f13544i;
            this.f13543h = cVar.f13543h;
            this.f13567c = cVar.f13567c;
            this.f13545j = cVar.f13545j;
            this.f13546k = cVar.f13546k;
            this.f13547l = cVar.f13547l;
            this.f13548m = cVar.f13548m;
            this.f13549n = cVar.f13549n;
            this.f13550o = cVar.f13550o;
            this.f13551p = cVar.f13551p;
        }
    }

    private static class g {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        private static final Matrix f13569q = new Matrix();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Path f13570a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Path f13571b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Matrix f13572c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f13573d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Paint f13574e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private PathMeasure f13575f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f13576g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final d f13577h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        float f13578i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        float f13579j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        float f13580k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        float f13581l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        int f13582m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        String f13583n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        Boolean f13584o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        final r0.a<String, Object> f13585p;

        public g() {
            this.f13572c = new Matrix();
            this.f13578i = 0.0f;
            this.f13579j = 0.0f;
            this.f13580k = 0.0f;
            this.f13581l = 0.0f;
            this.f13582m = GF2Field.MASK;
            this.f13583n = null;
            this.f13584o = null;
            this.f13585p = new r0.a<>();
            this.f13577h = new d();
            this.f13570a = new Path();
            this.f13571b = new Path();
        }

        private static float a(float f15, float f16, float f17, float f18) {
            return (f15 * f18) - (f16 * f17);
        }

        private void c(d dVar, Matrix matrix, Canvas canvas, int i15, int i16, ColorFilter colorFilter) {
            d dVar2 = dVar;
            dVar2.f13552a.set(matrix);
            dVar2.f13552a.preConcat(dVar2.f13561j);
            canvas.save();
            int i17 = 0;
            while (i17 < dVar2.f13553b.size()) {
                e eVar = dVar2.f13553b.get(i17);
                if (eVar instanceof d) {
                    c((d) eVar, dVar2.f13552a, canvas, i15, i16, colorFilter);
                } else if (eVar instanceof AbstractC0288f) {
                    d(dVar2, (AbstractC0288f) eVar, canvas, i15, i16, colorFilter);
                }
                i17++;
                dVar2 = dVar;
            }
            canvas.restore();
        }

        private void d(d dVar, AbstractC0288f abstractC0288f, Canvas canvas, int i15, int i16, ColorFilter colorFilter) {
            float f15 = i15 / this.f13580k;
            float f16 = i16 / this.f13581l;
            float fMin = Math.min(f15, f16);
            Matrix matrix = dVar.f13552a;
            this.f13572c.set(matrix);
            this.f13572c.postScale(f15, f16);
            float fE = e(matrix);
            if (fE == 0.0f) {
                return;
            }
            abstractC0288f.d(this.f13570a);
            Path path = this.f13570a;
            this.f13571b.reset();
            if (abstractC0288f.c()) {
                this.f13571b.setFillType(abstractC0288f.f13567c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                this.f13571b.addPath(path, this.f13572c);
                canvas.clipPath(this.f13571b);
                return;
            }
            c cVar = (c) abstractC0288f;
            float f17 = cVar.f13546k;
            if (f17 != 0.0f || cVar.f13547l != 1.0f) {
                float f18 = cVar.f13548m;
                float f19 = (f17 + f18) % 1.0f;
                float f25 = (cVar.f13547l + f18) % 1.0f;
                if (this.f13575f == null) {
                    this.f13575f = new PathMeasure();
                }
                this.f13575f.setPath(this.f13570a, false);
                float length = this.f13575f.getLength();
                float f26 = f19 * length;
                float f27 = f25 * length;
                path.reset();
                if (f26 > f27) {
                    this.f13575f.getSegment(f26, length, path, true);
                    this.f13575f.getSegment(0.0f, f27, path, true);
                } else {
                    this.f13575f.getSegment(f26, f27, path, true);
                }
                path.rLineTo(0.0f, 0.0f);
            }
            this.f13571b.addPath(path, this.f13572c);
            if (cVar.f13543h.l()) {
                w5.d dVar2 = cVar.f13543h;
                if (this.f13574e == null) {
                    Paint paint = new Paint(1);
                    this.f13574e = paint;
                    paint.setStyle(Paint.Style.FILL);
                }
                Paint paint2 = this.f13574e;
                if (dVar2.h()) {
                    Shader shaderF = dVar2.f();
                    shaderF.setLocalMatrix(this.f13572c);
                    paint2.setShader(shaderF);
                    paint2.setAlpha(Math.round(cVar.f13545j * 255.0f));
                } else {
                    paint2.setShader(null);
                    paint2.setAlpha(GF2Field.MASK);
                    paint2.setColor(f.a(dVar2.e(), cVar.f13545j));
                }
                paint2.setColorFilter(colorFilter);
                this.f13571b.setFillType(cVar.f13567c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                canvas.drawPath(this.f13571b, paint2);
            }
            if (cVar.f13541f.l()) {
                w5.d dVar3 = cVar.f13541f;
                if (this.f13573d == null) {
                    Paint paint3 = new Paint(1);
                    this.f13573d = paint3;
                    paint3.setStyle(Paint.Style.STROKE);
                }
                Paint paint4 = this.f13573d;
                Paint.Join join = cVar.f13550o;
                if (join != null) {
                    paint4.setStrokeJoin(join);
                }
                Paint.Cap cap = cVar.f13549n;
                if (cap != null) {
                    paint4.setStrokeCap(cap);
                }
                paint4.setStrokeMiter(cVar.f13551p);
                if (dVar3.h()) {
                    Shader shaderF2 = dVar3.f();
                    shaderF2.setLocalMatrix(this.f13572c);
                    paint4.setShader(shaderF2);
                    paint4.setAlpha(Math.round(cVar.f13544i * 255.0f));
                } else {
                    paint4.setShader(null);
                    paint4.setAlpha(GF2Field.MASK);
                    paint4.setColor(f.a(dVar3.e(), cVar.f13544i));
                }
                paint4.setColorFilter(colorFilter);
                paint4.setStrokeWidth(cVar.f13542g * fMin * fE);
                canvas.drawPath(this.f13571b, paint4);
            }
        }

        private float e(Matrix matrix) {
            float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
            matrix.mapVectors(fArr);
            float fHypot = (float) Math.hypot(fArr[0], fArr[1]);
            float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
            float fA = a(fArr[0], fArr[1], fArr[2], fArr[3]);
            float fMax = Math.max(fHypot, fHypot2);
            if (fMax > 0.0f) {
                return Math.abs(fA) / fMax;
            }
            return 0.0f;
        }

        public void b(Canvas canvas, int i15, int i16, ColorFilter colorFilter) {
            c(this.f13577h, f13569q, canvas, i15, i16, colorFilter);
        }

        public boolean f() {
            if (this.f13584o == null) {
                this.f13584o = Boolean.valueOf(this.f13577h.a());
            }
            return this.f13584o.booleanValue();
        }

        public boolean g(int[] iArr) {
            return this.f13577h.b(iArr);
        }

        public float getAlpha() {
            return getRootAlpha() / 255.0f;
        }

        public int getRootAlpha() {
            return this.f13582m;
        }

        public void setAlpha(float f15) {
            setRootAlpha((int) (f15 * 255.0f));
        }

        public void setRootAlpha(int i15) {
            this.f13582m = i15;
        }

        public g(g gVar) {
            this.f13572c = new Matrix();
            this.f13578i = 0.0f;
            this.f13579j = 0.0f;
            this.f13580k = 0.0f;
            this.f13581l = 0.0f;
            this.f13582m = GF2Field.MASK;
            this.f13583n = null;
            this.f13584o = null;
            r0.a<String, Object> aVar = new r0.a<>();
            this.f13585p = aVar;
            this.f13577h = new d(gVar.f13577h, aVar);
            this.f13570a = new Path(gVar.f13570a);
            this.f13571b = new Path(gVar.f13571b);
            this.f13578i = gVar.f13578i;
            this.f13579j = gVar.f13579j;
            this.f13580k = gVar.f13580k;
            this.f13581l = gVar.f13581l;
            this.f13576g = gVar.f13576g;
            this.f13582m = gVar.f13582m;
            this.f13583n = gVar.f13583n;
            String str = gVar.f13583n;
            if (str != null) {
                aVar.put(str, this);
            }
            this.f13584o = gVar.f13584o;
        }
    }

    private static class d extends e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final Matrix f13552a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final ArrayList<e> f13553b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f13554c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f13555d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private float f13556e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private float f13557f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private float f13558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private float f13559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private float f13560i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final Matrix f13561j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        int f13562k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int[] f13563l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private String f13564m;

        public d(d dVar, r0.a<String, Object> aVar) {
            AbstractC0288f bVar;
            super();
            this.f13552a = new Matrix();
            this.f13553b = new ArrayList<>();
            this.f13554c = 0.0f;
            this.f13555d = 0.0f;
            this.f13556e = 0.0f;
            this.f13557f = 1.0f;
            this.f13558g = 1.0f;
            this.f13559h = 0.0f;
            this.f13560i = 0.0f;
            Matrix matrix = new Matrix();
            this.f13561j = matrix;
            this.f13564m = null;
            this.f13554c = dVar.f13554c;
            this.f13555d = dVar.f13555d;
            this.f13556e = dVar.f13556e;
            this.f13557f = dVar.f13557f;
            this.f13558g = dVar.f13558g;
            this.f13559h = dVar.f13559h;
            this.f13560i = dVar.f13560i;
            this.f13563l = dVar.f13563l;
            String str = dVar.f13564m;
            this.f13564m = str;
            this.f13562k = dVar.f13562k;
            if (str != null) {
                aVar.put(str, this);
            }
            matrix.set(dVar.f13561j);
            ArrayList<e> arrayList = dVar.f13553b;
            for (int i15 = 0; i15 < arrayList.size(); i15++) {
                e eVar = arrayList.get(i15);
                if (eVar instanceof d) {
                    this.f13553b.add(new d((d) eVar, aVar));
                } else {
                    if (eVar instanceof c) {
                        bVar = new c((c) eVar);
                    } else {
                        if (!(eVar instanceof b)) {
                            throw new IllegalStateException("Unknown object in the tree!");
                        }
                        bVar = new b((b) eVar);
                    }
                    this.f13553b.add(bVar);
                    String str2 = bVar.f13566b;
                    if (str2 != null) {
                        aVar.put(str2, bVar);
                    }
                }
            }
        }

        private void d() {
            this.f13561j.reset();
            this.f13561j.postTranslate(-this.f13555d, -this.f13556e);
            this.f13561j.postScale(this.f13557f, this.f13558g);
            this.f13561j.postRotate(this.f13554c, 0.0f, 0.0f);
            this.f13561j.postTranslate(this.f13559h + this.f13555d, this.f13560i + this.f13556e);
        }

        private void e(TypedArray typedArray, XmlPullParser xmlPullParser) {
            this.f13563l = null;
            this.f13554c = k.f(typedArray, xmlPullParser, "rotation", 5, this.f13554c);
            this.f13555d = typedArray.getFloat(1, this.f13555d);
            this.f13556e = typedArray.getFloat(2, this.f13556e);
            this.f13557f = k.f(typedArray, xmlPullParser, "scaleX", 3, this.f13557f);
            this.f13558g = k.f(typedArray, xmlPullParser, "scaleY", 4, this.f13558g);
            this.f13559h = k.f(typedArray, xmlPullParser, "translateX", 6, this.f13559h);
            this.f13560i = k.f(typedArray, xmlPullParser, "translateY", 7, this.f13560i);
            String string = typedArray.getString(0);
            if (string != null) {
                this.f13564m = string;
            }
            d();
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean a() {
            for (int i15 = 0; i15 < this.f13553b.size(); i15++) {
                if (this.f13553b.get(i15).a()) {
                    return true;
                }
            }
            return false;
        }

        @Override // androidx.vectordrawable.graphics.drawable.f.e
        public boolean b(int[] iArr) {
            boolean zB = false;
            for (int i15 = 0; i15 < this.f13553b.size(); i15++) {
                zB |= this.f13553b.get(i15).b(iArr);
            }
            return zB;
        }

        public void c(Resources resources, AttributeSet attributeSet, Resources.Theme theme, XmlPullParser xmlPullParser) {
            TypedArray typedArrayI = k.i(resources, theme, attributeSet, androidx.vectordrawable.graphics.drawable.a.f13501b);
            e(typedArrayI, xmlPullParser);
            typedArrayI.recycle();
        }

        public String getGroupName() {
            return this.f13564m;
        }

        public Matrix getLocalMatrix() {
            return this.f13561j;
        }

        public float getPivotX() {
            return this.f13555d;
        }

        public float getPivotY() {
            return this.f13556e;
        }

        public float getRotation() {
            return this.f13554c;
        }

        public float getScaleX() {
            return this.f13557f;
        }

        public float getScaleY() {
            return this.f13558g;
        }

        public float getTranslateX() {
            return this.f13559h;
        }

        public float getTranslateY() {
            return this.f13560i;
        }

        public void setPivotX(float f15) {
            if (f15 != this.f13555d) {
                this.f13555d = f15;
                d();
            }
        }

        public void setPivotY(float f15) {
            if (f15 != this.f13556e) {
                this.f13556e = f15;
                d();
            }
        }

        public void setRotation(float f15) {
            if (f15 != this.f13554c) {
                this.f13554c = f15;
                d();
            }
        }

        public void setScaleX(float f15) {
            if (f15 != this.f13557f) {
                this.f13557f = f15;
                d();
            }
        }

        public void setScaleY(float f15) {
            if (f15 != this.f13558g) {
                this.f13558g = f15;
                d();
            }
        }

        public void setTranslateX(float f15) {
            if (f15 != this.f13559h) {
                this.f13559h = f15;
                d();
            }
        }

        public void setTranslateY(float f15) {
            if (f15 != this.f13560i) {
                this.f13560i = f15;
                d();
            }
        }

        public d() {
            super();
            this.f13552a = new Matrix();
            this.f13553b = new ArrayList<>();
            this.f13554c = 0.0f;
            this.f13555d = 0.0f;
            this.f13556e = 0.0f;
            this.f13557f = 1.0f;
            this.f13558g = 1.0f;
            this.f13559h = 0.0f;
            this.f13560i = 0.0f;
            this.f13561j = new Matrix();
            this.f13564m = null;
        }
    }
}
