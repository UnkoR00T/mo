package w5;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import io.sentry.android.core.c2;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Shader f210236a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ColorStateList f210237b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f210238c;

    private d(Shader shader, ColorStateList colorStateList, int i15) {
        this.f210236a = shader;
        this.f210237b = colorStateList;
        this.f210238c = i15;
    }

    private static d a(Resources resources, int i15, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        XmlResourceParser xml = resources.getXml(i15);
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xml);
        do {
            next = xml.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next != 2) {
            throw new XmlPullParserException("No start tag found");
        }
        String name = xml.getName();
        name.getClass();
        if (name.equals("gradient")) {
            return d(f.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        if (name.equals("selector")) {
            return c(c.b(resources, xml, attributeSetAsAttributeSet, theme));
        }
        throw new XmlPullParserException(xml.getPositionDescription() + ": unsupported complex color tag " + name);
    }

    static d b(int i15) {
        return new d(null, null, i15);
    }

    static d c(ColorStateList colorStateList) {
        return new d(null, colorStateList, colorStateList.getDefaultColor());
    }

    static d d(Shader shader) {
        return new d(shader, null, 0);
    }

    public static d g(Resources resources, int i15, Resources.Theme theme) {
        try {
            return a(resources, i15, theme);
        } catch (Exception e15) {
            c2.f("ComplexColorCompat", "Failed to inflate ComplexColor.", e15);
            return null;
        }
    }

    public int e() {
        return this.f210238c;
    }

    public Shader f() {
        return this.f210236a;
    }

    public boolean h() {
        return this.f210236a != null;
    }

    public boolean i() {
        ColorStateList colorStateList;
        return this.f210236a == null && (colorStateList = this.f210237b) != null && colorStateList.isStateful();
    }

    public boolean j(int[] iArr) {
        if (!i()) {
            return false;
        }
        ColorStateList colorStateList = this.f210237b;
        int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
        if (colorForState == this.f210238c) {
            return false;
        }
        this.f210238c = colorForState;
        return true;
    }

    public void k(int i15) {
        this.f210238c = i15;
    }

    public boolean l() {
        return h() || this.f210238c != 0;
    }
}
