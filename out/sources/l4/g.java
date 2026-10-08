package l4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import oq.i0;
import org.xmlpull.v1.XmlPullParserException;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import u3.AndroidVectorParser;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\b\b\u0001\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a1\u0010\u000b\u001a\u00020\u0003*\u00020\u00002\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a7\u0010\u0011\u001a\u00020\u00102\u000e\b\u0002\u0010\b\u001a\b\u0018\u00010\u0006R\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lt3/d$b;", "", "id", "Lt3/d;", "b", "(Lt3/d$b;ILm2/r;I)Lt3/d;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "resId", "c", "(Lt3/d$b;Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;I)Lt3/d;", "Landroid/content/res/XmlResourceParser;", "parser", "changingConfigurations", "Ll4/b$a;", "a", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;Landroid/content/res/XmlResourceParser;I)Ll4/b$a;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class g {
    public static final b.ImageVectorEntry a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i15) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        AndroidVectorParser androidVectorParser = new AndroidVectorParser(xmlResourceParser, 0, 2, null);
        t3.d.a aVarA = u3.c.a(androidVectorParser, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!u3.c.d(xmlResourceParser)) {
            iG = u3.c.g(androidVectorParser, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new b.ImageVectorEntry(aVarA.f(), androidVectorParser.getConfig() | i15);
    }

    public static final t3.d b(t3.d.Companion companion, int i15, r rVar, int i16) throws XmlPullParserException, IOException {
        if (t.k()) {
            t.o(44534090, i16, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:48)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        Resources resources = (Resources) rVar.N(AndroidCompositionLocals_androidKt.f());
        Resources.Theme theme = context.getTheme();
        boolean zW = ((((i16 & 112) ^ 48) > 32 && rVar.c(i15)) || (i16 & 48) == 32) | rVar.W(resources) | rVar.W(theme) | rVar.W(resources.getConfiguration());
        Object objE = rVar.E();
        if (zW || objE == r.INSTANCE.a()) {
            objE = c(companion, theme, resources, i15);
            rVar.v(objE);
        }
        t3.d dVar = (t3.d) objE;
        if (t.k()) {
            t.n();
        }
        return dVar;
    }

    public static final t3.d c(t3.d.Companion companion, Resources.Theme theme, Resources resources, int i15) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i15, typedValue, true);
        XmlResourceParser xml = resources.getXml(i15);
        u3.c.j(xml);
        i0 i0Var = i0.f148189a;
        return a(theme, resources, xml, typedValue.changingConfigurations).getImageVector();
    }
}
