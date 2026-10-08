package androidx.appcompat.widget;

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
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
class q0 extends Resources {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Resources f9011a;

    public q0(Resources resources) {
        super(resources.getAssets(), resources.getDisplayMetrics(), resources.getConfiguration());
        this.f9011a = resources;
    }

    final Drawable a(int i15) {
        return super.getDrawable(i15);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getAnimation(int i15) {
        return this.f9011a.getAnimation(i15);
    }

    @Override // android.content.res.Resources
    public boolean getBoolean(int i15) {
        return this.f9011a.getBoolean(i15);
    }

    @Override // android.content.res.Resources
    public int getColor(int i15) {
        return this.f9011a.getColor(i15);
    }

    @Override // android.content.res.Resources
    public ColorStateList getColorStateList(int i15) {
        return this.f9011a.getColorStateList(i15);
    }

    @Override // android.content.res.Resources
    public Configuration getConfiguration() {
        return this.f9011a.getConfiguration();
    }

    @Override // android.content.res.Resources
    public float getDimension(int i15) {
        return this.f9011a.getDimension(i15);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelOffset(int i15) {
        return this.f9011a.getDimensionPixelOffset(i15);
    }

    @Override // android.content.res.Resources
    public int getDimensionPixelSize(int i15) {
        return this.f9011a.getDimensionPixelSize(i15);
    }

    @Override // android.content.res.Resources
    public DisplayMetrics getDisplayMetrics() {
        return this.f9011a.getDisplayMetrics();
    }

    @Override // android.content.res.Resources
    public Drawable getDrawable(int i15, Resources.Theme theme) {
        return w5.h.e(this.f9011a, i15, theme);
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i15, int i16) {
        return w5.h.f(this.f9011a, i15, i16, null);
    }

    @Override // android.content.res.Resources
    public float getFraction(int i15, int i16, int i17) {
        return this.f9011a.getFraction(i15, i16, i17);
    }

    @Override // android.content.res.Resources
    public int getIdentifier(String str, String str2, String str3) {
        return this.f9011a.getIdentifier(str, str2, str3);
    }

    @Override // android.content.res.Resources
    public int[] getIntArray(int i15) {
        return this.f9011a.getIntArray(i15);
    }

    @Override // android.content.res.Resources
    public int getInteger(int i15) {
        return this.f9011a.getInteger(i15);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getLayout(int i15) {
        return this.f9011a.getLayout(i15);
    }

    @Override // android.content.res.Resources
    public Movie getMovie(int i15) {
        return this.f9011a.getMovie(i15);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i15, int i16, Object... objArr) {
        return this.f9011a.getQuantityString(i15, i16, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getQuantityText(int i15, int i16) {
        return this.f9011a.getQuantityText(i15, i16);
    }

    @Override // android.content.res.Resources
    public String getResourceEntryName(int i15) {
        return this.f9011a.getResourceEntryName(i15);
    }

    @Override // android.content.res.Resources
    public String getResourceName(int i15) {
        return this.f9011a.getResourceName(i15);
    }

    @Override // android.content.res.Resources
    public String getResourcePackageName(int i15) {
        return this.f9011a.getResourcePackageName(i15);
    }

    @Override // android.content.res.Resources
    public String getResourceTypeName(int i15) {
        return this.f9011a.getResourceTypeName(i15);
    }

    @Override // android.content.res.Resources
    public String getString(int i15) {
        return this.f9011a.getString(i15);
    }

    @Override // android.content.res.Resources
    public String[] getStringArray(int i15) {
        return this.f9011a.getStringArray(i15);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i15) {
        return this.f9011a.getText(i15);
    }

    @Override // android.content.res.Resources
    public CharSequence[] getTextArray(int i15) {
        return this.f9011a.getTextArray(i15);
    }

    @Override // android.content.res.Resources
    public void getValue(int i15, TypedValue typedValue, boolean z15) {
        this.f9011a.getValue(i15, typedValue, z15);
    }

    @Override // android.content.res.Resources
    public void getValueForDensity(int i15, int i16, TypedValue typedValue, boolean z15) {
        this.f9011a.getValueForDensity(i15, i16, typedValue, z15);
    }

    @Override // android.content.res.Resources
    public XmlResourceParser getXml(int i15) {
        return this.f9011a.getXml(i15);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainAttributes(AttributeSet attributeSet, int[] iArr) {
        return this.f9011a.obtainAttributes(attributeSet, iArr);
    }

    @Override // android.content.res.Resources
    public TypedArray obtainTypedArray(int i15) {
        return this.f9011a.obtainTypedArray(i15);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i15) {
        return this.f9011a.openRawResource(i15);
    }

    @Override // android.content.res.Resources
    public AssetFileDescriptor openRawResourceFd(int i15) {
        return this.f9011a.openRawResourceFd(i15);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtra(String str, AttributeSet attributeSet, Bundle bundle) throws XmlPullParserException {
        this.f9011a.parseBundleExtra(str, attributeSet, bundle);
    }

    @Override // android.content.res.Resources
    public void parseBundleExtras(XmlResourceParser xmlResourceParser, Bundle bundle) throws XmlPullParserException, IOException {
        this.f9011a.parseBundleExtras(xmlResourceParser, bundle);
    }

    @Override // android.content.res.Resources
    public void updateConfiguration(Configuration configuration, DisplayMetrics displayMetrics) {
        super.updateConfiguration(configuration, displayMetrics);
        Resources resources = this.f9011a;
        if (resources != null) {
            resources.updateConfiguration(configuration, displayMetrics);
        }
    }

    @Override // android.content.res.Resources
    public Drawable getDrawableForDensity(int i15, int i16, Resources.Theme theme) {
        return w5.h.f(this.f9011a, i15, i16, theme);
    }

    @Override // android.content.res.Resources
    public String getQuantityString(int i15, int i16) {
        return this.f9011a.getQuantityString(i15, i16);
    }

    @Override // android.content.res.Resources
    public String getString(int i15, Object... objArr) {
        return this.f9011a.getString(i15, objArr);
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int i15, CharSequence charSequence) {
        return this.f9011a.getText(i15, charSequence);
    }

    @Override // android.content.res.Resources
    public void getValue(String str, TypedValue typedValue, boolean z15) {
        this.f9011a.getValue(str, typedValue, z15);
    }

    @Override // android.content.res.Resources
    public InputStream openRawResource(int i15, TypedValue typedValue) {
        return this.f9011a.openRawResource(i15, typedValue);
    }
}
