package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class f1 extends q0 {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static boolean f8865c = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final WeakReference<Context> f8866b;

    public f1(Context context, Resources resources) {
        super(resources);
        this.f8866b = new WeakReference<>(context);
    }

    public static boolean b() {
        return f8865c;
    }

    public static boolean c() {
        b();
        return false;
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getAnimation(int i15) {
        return super.getAnimation(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ boolean getBoolean(int i15) {
        return super.getBoolean(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getColor(int i15) {
        return super.getColor(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ ColorStateList getColorStateList(int i15) {
        return super.getColorStateList(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ Configuration getConfiguration() {
        return super.getConfiguration();
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getDimension(int i15) {
        return super.getDimension(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelOffset(int i15) {
        return super.getDimensionPixelOffset(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getDimensionPixelSize(int i15) {
        return super.getDimensionPixelSize(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ DisplayMetrics getDisplayMetrics() {
        return super.getDisplayMetrics();
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawable(int i15, Resources.Theme theme) {
        return super.getDrawable(i15, theme);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i15, int i16) {
        return super.getDrawableForDensity(i15, i16);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ float getFraction(int i15, int i16, int i17) {
        return super.getFraction(i15, i16, i17);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getIdentifier(String str, String str2, String str3) {
        return super.getIdentifier(str, str2, str3);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ int[] getIntArray(int i15) {
        return super.getIntArray(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ int getInteger(int i15) {
        return super.getInteger(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getLayout(int i15) {
        return super.getLayout(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ Movie getMovie(int i15) {
        return super.getMovie(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i15, int i16) {
        return super.getQuantityString(i15, i16);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getQuantityText(int i15, int i16) {
        return super.getQuantityText(i15, i16);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceEntryName(int i15) {
        return super.getResourceEntryName(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceName(int i15) {
        return super.getResourceName(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourcePackageName(int i15) {
        return super.getResourcePackageName(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getResourceTypeName(int i15) {
        return super.getResourceTypeName(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i15) {
        return super.getString(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String[] getStringArray(int i15) {
        return super.getStringArray(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i15) {
        return super.getText(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence[] getTextArray(int i15) {
        return super.getTextArray(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(int i15, TypedValue typedValue, boolean z15) {
        super.getValue(i15, typedValue, z15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValueForDensity(int i15, int i16, TypedValue typedValue, boolean z15) {
        super.getValueForDensity(i15, i16, typedValue, z15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ XmlResourceParser getXml(int i15) {
        return super.getXml(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return super.obtainAttributes(attributeSet, iArr);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ TypedArray obtainTypedArray(int i15) {
        return super.obtainTypedArray(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i15) {
        return super.openRawResource(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ AssetFileDescriptor openRawResourceFd(int i15) {
        return super.openRawResourceFd(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        super.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        super.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i15) {
        Context context = this.f8866b.get();
        return context != null ? p0.g().s(context, this, i15) : a(i15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ Drawable getDrawableForDensity(int i15, int i16, Resources.Theme theme) {
        return super.getDrawableForDensity(i15, i16, theme);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getQuantityString(int i15, int i16, Object[] objArr) {
        return super.getQuantityString(i15, i16, objArr);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ String getString(int i15, Object[] objArr) {
        return super.getString(i15, objArr);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ CharSequence getText(int i15, CharSequence charSequence) {
        return super.getText(i15, charSequence);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ void getValue(String str, TypedValue typedValue, boolean z15) {
        super.getValue(str, typedValue, z15);
    }

    @Override // androidx.appcompat.widget.q0, android.content.res.Resources
    public /* bridge */ /* synthetic */ InputStream openRawResource(int i15, TypedValue typedValue) {
        return super.openRawResource(i15, typedValue);
    }
}
