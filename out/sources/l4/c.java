package l4;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import n3.b2;
import org.xmlpull.v1.XmlPullParserException;
import p071kotlin.Metadata;
import p076m2.r;
import p076m2.t;
import t3.q;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0001\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0003\u0010\u0004\u001a3\u0010\u000b\u001a\u00020\n2\n\u0010\u0007\u001a\u00060\u0005R\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u0000H\u0003¢\u0006\u0004\b\u000b\u0010\f\u001a'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"", "id", "Landroidx/compose/ui/graphics/painter/a;", "c", "(ILm2/r;I)Landroidx/compose/ui/graphics/painter/a;", "Landroid/content/res/Resources$Theme;", "Landroid/content/res/Resources;", "theme", "res", "changingConfigurations", "Lt3/d;", "b", "(Landroid/content/res/Resources$Theme;Landroid/content/res/Resources;IILm2/r;I)Lt3/d;", "", "path", "Ln3/b2;", "a", "(Ljava/lang/CharSequence;Landroid/content/res/Resources;I)Ln3/b2;", "ui"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final b2 a(CharSequence charSequence, Resources resources, int i15) {
        try {
            return a.b(b2.INSTANCE, resources, i15);
        } catch (Exception e15) {
            throw new e("Error attempting to load resource: " + ((Object) charSequence), e15);
        }
    }

    private static final t3.d b(Resources.Theme theme, Resources resources, int i15, int i16, r rVar, int i17) throws XmlPullParserException, IOException {
        if (t.k()) {
            t.o(21855625, i17, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:87)");
        }
        b bVar = (b) rVar.N(AndroidCompositionLocals_androidKt.d());
        b.Key key = new b.Key(theme, i15);
        b.ImageVectorEntry imageVectorEntryB = bVar.b(key);
        if (imageVectorEntryB == null) {
            XmlResourceParser xml = resources.getXml(i15);
            if (!fr.t.c(u3.c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            imageVectorEntryB = g.a(theme, resources, xml, i16);
            bVar.d(key, imageVectorEntryB);
        }
        t3.d imageVector = imageVectorEntryB.getImageVector();
        if (t.k()) {
            t.n();
        }
        return imageVector;
    }

    public static final androidx.compose.ui.graphics.painter.a c(int i15, r rVar, int i16) {
        androidx.compose.ui.graphics.painter.a aVarG;
        if (t.k()) {
            t.o(473971343, i16, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) rVar.N(AndroidCompositionLocals_androidKt.c());
        Resources resources = (Resources) rVar.N(AndroidCompositionLocals_androidKt.f());
        TypedValue typedValueB = ((d) rVar.N(AndroidCompositionLocals_androidKt.e())).b(resources, i15);
        CharSequence charSequence = typedValueB.string;
        boolean z15 = true;
        if (charSequence == null || !fu.r.h0(charSequence, ".xml", false, 2, null)) {
            rVar.X(-1771643000);
            Object theme = context.getTheme();
            boolean zW = rVar.W(charSequence);
            if ((((i16 & 14) ^ 6) <= 4 || !rVar.c(i15)) && (i16 & 6) != 4) {
                z15 = false;
            }
            boolean zW2 = rVar.W(theme) | zW | z15;
            Object objE = rVar.E();
            if (zW2 || objE == r.INSTANCE.a()) {
                objE = a(charSequence, resources, i15);
                rVar.v(objE);
            }
            BitmapPainter bitmapPainter = new BitmapPainter((b2) objE, 0L, 0L, 6, null);
            rVar.R();
            aVarG = bitmapPainter;
        } else {
            rVar.X(-1771798434);
            aVarG = q.g(b(context.getTheme(), resources, i15, typedValueB.changingConfigurations, rVar, (i16 << 6) & 896), rVar, 0);
            rVar.R();
        }
        if (t.k()) {
            t.n();
        }
        return aVarG;
    }
}
