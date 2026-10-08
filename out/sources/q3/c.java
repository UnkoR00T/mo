package q3;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.graphics.RectF;
import android.os.Build;
import androidx.compose.ui.graphics.Color;
import fr.w;
import java.util.Locale;
import n3.a1;
import n3.f0;
import n3.h1;
import n3.i2;
import n3.k2;
import n3.m1;
import n3.m2;
import n3.n1;
import n3.o0;
import n3.p0;
import n3.u2;
import oq.i0;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;
import r0.i1;
import r0.u0;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000Î\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u0099\u00012\u00020\u0001:\u0001AB\u0011\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\n*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0019\u0010\u000eJ\u000f\u0010\u001a\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001a\u0010\u000eJ\u000f\u0010\u001b\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001b\u0010\u000eJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001f\u0010\u000eJ\u0019\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\nH\u0002¢\u0006\u0004\b'\u0010\u000eJ\u000f\u0010(\u001a\u00020\nH\u0002¢\u0006\u0004\b(\u0010\u000eJ9\u0010/\u001a\u00020\n2\u0006\u0010*\u001a\u00020)2\u0006\u0010,\u001a\u00020+2\u0006\u0010\t\u001a\u00020\b2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0-¢\u0006\u0004\b/\u00100J!\u00104\u001a\u00020\n2\u0006\u00102\u001a\u0002012\b\u00103\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\nH\u0000¢\u0006\u0004\b6\u0010\u000eJ\u000f\u00107\u001a\u00020\nH\u0000¢\u0006\u0004\b7\u0010\u000eJ\u0015\u00108\u001a\u00020\n2\u0006\u0010!\u001a\u00020 ¢\u0006\u0004\b8\u00109J+\u0010>\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020:2\b\b\u0002\u0010\t\u001a\u00020;2\b\b\u0002\u0010=\u001a\u00020<¢\u0006\u0004\b>\u0010?J!\u0010@\u001a\u00020\n2\b\b\u0002\u0010\u0007\u001a\u00020:2\b\b\u0002\u0010\t\u001a\u00020;¢\u0006\u0004\b@\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010DR\u0016\u0010*\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010FR\u0016\u0010,\u001a\u00020+8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010HR\"\u0010J\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010IR \u0010K\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\n0-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010IR\u0018\u0010M\u001a\u0004\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010LR\u0016\u0010O\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u0010>R\u0016\u0010P\u001a\u00020:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u0010(R\u0016\u0010Q\u001a\u00020;8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0010\u0010(R\u0016\u0010S\u001a\u00020<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010/R\u0018\u0010W\u001a\u0004\u0018\u00010T8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0018\u0010Z\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u0010YR\u0018\u0010\\\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b[\u0010YR\u0016\u0010^\u001a\u00020N8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010>R\u0018\u0010b\u001a\u0004\u0018\u00010_8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010aR\u0018\u0010f\u001a\u0004\u0018\u00010c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bd\u0010eR\u0016\u0010i\u001a\u00020g8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u00106R\u0014\u0010m\u001a\u00020j8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bk\u0010lR$\u0010r\u001a\u00020N2\u0006\u0010n\u001a\u00020N8\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\bo\u0010>\u001a\u0004\bp\u0010qR*\u0010\u0007\u001a\u00020\u00062\u0006\u0010n\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bs\u0010(\u001a\u0004\bt\u0010u\"\u0004\bv\u0010wR*\u0010\t\u001a\u00020\b2\u0006\u0010n\u001a\u00020\b8\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\bx\u0010(\u001a\u0004\by\u0010u\"\u0004\bz\u0010wR*\u0010}\u001a\u00020:2\u0006\u0010n\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010(\u001a\u0004\bd\u0010u\"\u0004\b|\u0010wR2\u0010\u0081\u0001\u001a\u00020N2\u0006\u0010n\u001a\u00020N8\u0006@FX\u0086\u000e¢\u0006\u0019\n\u0004\by\u0010>\u0012\u0005\b\u0080\u0001\u0010\u000e\u001a\u0004\bX\u0010q\"\u0004\b~\u0010\u007fR\u001a\u0010\u0083\u0001\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bt\u0010\u0082\u0001R*\u0010\u0088\u0001\u001a\u00030\u0084\u00012\u0007\u0010n\u001a\u00030\u0084\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b]\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R(\u0010\u008c\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bR\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R*\u0010\u008f\u0001\u001a\u00030\u008d\u00012\u0007\u0010n\u001a\u00030\u008d\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bU\u0010\u0085\u0001\"\u0006\b\u008e\u0001\u0010\u0087\u0001R.\u0010\u0094\u0001\u001a\u0005\u0018\u00010\u0090\u00012\t\u0010n\u001a\u0005\u0018\u00010\u0090\u00018F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b[\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R(\u0010\u0096\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bs\u0010\u0089\u0001\"\u0006\b\u0095\u0001\u0010\u008b\u0001R(\u0010\u0098\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bx\u0010\u0089\u0001\"\u0006\b\u0097\u0001\u0010\u008b\u0001R)\u0010\u009b\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0099\u0001\u0010\u0089\u0001\"\u0006\b\u009a\u0001\u0010\u008b\u0001R)\u0010\u009e\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u009c\u0001\u0010\u0089\u0001\"\u0006\b\u009d\u0001\u0010\u008b\u0001R(\u0010 \u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\b{\u0010\u0089\u0001\"\u0006\b\u009f\u0001\u0010\u008b\u0001R(\u0010¢\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bh\u0010\u0089\u0001\"\u0006\b¡\u0001\u0010\u008b\u0001R(\u0010¤\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bk\u0010\u0089\u0001\"\u0006\b£\u0001\u0010\u008b\u0001R(\u0010¦\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u000f\u001a\u0005\bo\u0010\u0089\u0001\"\u0006\b¥\u0001\u0010\u008b\u0001R)\u0010©\u0001\u001a\u00020<2\u0006\u0010n\u001a\u00020<8F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b§\u0001\u0010\u0089\u0001\"\u0006\b¨\u0001\u0010\u008b\u0001R/\u0010¯\u0001\u001a\u0005\u0018\u00010ª\u00012\t\u0010n\u001a\u0005\u0018\u00010ª\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b«\u0001\u0010¬\u0001\"\u0006\b\u00ad\u0001\u0010®\u0001R\u0013\u0010±\u0001\u001a\u00020T8F¢\u0006\u0007\u001a\u0005\b`\u0010°\u0001R)\u0010µ\u0001\u001a\u00030²\u00012\u0007\u0010n\u001a\u00030²\u00018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b³\u0001\u0010u\"\u0005\b´\u0001\u0010wR)\u0010¸\u0001\u001a\u00030²\u00012\u0007\u0010n\u001a\u00030²\u00018F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¶\u0001\u0010u\"\u0005\b·\u0001\u0010w¨\u0006¹\u0001"}, d2 = {"Lq3/c;", "", "Lq3/d;", "impl", "<init>", "(Lq3/d;)V", "Lc5/n;", "topLeft", "Lc5/r;", "size", "Loq/i0;", "T", "(JJ)V", "G", "()V", "Lp3/f;", "i", "(Lp3/f;)V", "graphicsLayer", "d", "(Lq3/c;)V", "Landroid/graphics/Canvas;", "androidCanvas", "i0", "(Landroid/graphics/Canvas;)V", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, ip.a.f96138c, "E", "Landroid/graphics/RectF;", "C", "()Landroid/graphics/RectF;", "e", "Ln3/m2;", "path", "Landroid/graphics/Outline;", "j0", "(Ln3/m2;)Landroid/graphics/Outline;", "B", "()Landroid/graphics/Outline;", "f", "J", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Lkotlin/Function1;", "block", "F", "(Lc5/d;Lc5/t;JLer/l;)V", "Ln3/h1;", "canvas", "parentLayer", "h", "(Ln3/h1;Lq3/c;)V", "I", "g", "R", "(Ln3/m2;)V", "Lm3/e;", "Lm3/k;", "", "cornerRadius", "Z", "(JJF)V", "U", "a", "Lq3/d;", "getImpl$ui_graphics", "()Lq3/d;", "b", "Lc5/d;", "c", "Lc5/t;", "Ler/l;", "drawBlock", "clipDrawBlock", "Landroid/graphics/Outline;", "androidOutline", "", "outlineDirty", "roundRectOutlineTopLeft", "roundRectOutlineSize", "j", "roundRectCornerRadius", "Ln3/i2;", "k", "Ln3/i2;", "internalOutline", "l", "Ln3/m2;", "outlinePath", "m", "roundRectClipPath", "n", "usePathForClip", "Lp3/a;", "o", "Lp3/a;", "softwareDrawScope", "Ln3/k2;", "p", "Ln3/k2;", "softwareLayerPaint", "", "q", "parentLayerUsages", "Lq3/a;", "r", "Lq3/a;", "childDependenciesTracker", "value", "s", "A", "()Z", "isReleased", "t", "x", "()J", "f0", "(J)V", "u", "w", "d0", "v", ip.a.f96137b, "pivotOffset", "O", "(Z)V", "getClip$annotations", "clip", "Landroid/graphics/RectF;", "pathBounds", "Lq3/b;", "()I", "Q", "(I)V", "compositingStrategy", "()F", "K", "(F)V", "alpha", "Ln3/a1;", "M", "blendMode", "Ln3/n1;", "()Ln3/n1;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "(Ln3/n1;)V", "colorFilter", "a0", "scaleX", "b0", "scaleY", "y", "g0", "translationX", "z", "h0", "translationY", "c0", "shadowElevation", "W", "rotationX", "X", "rotationY", "Y", "rotationZ", "getCameraDistance", "N", "cameraDistance", "Ln3/u2;", "getRenderEffect", "()Ln3/u2;", "V", "(Ln3/u2;)V", "renderEffect", "()Ln3/i2;", "outline", "Landroidx/compose/ui/graphics/Color;", "getAmbientShadowColor-0d7_KjU", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "ambientShadowColor", "getSpotShadowColor-0d7_KjU", "e0", "spotShadowColor", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c {
    private static final boolean A;
    private static final i B;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f163975z = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final d impl;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private Outline androidOutline;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineTopLeft;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private long roundRectOutlineSize;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float roundRectCornerRadius;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private i2 internalOutline;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private m2 outlinePath;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private m2 roundRectClipPath;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean usePathForClip;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private p3.a softwareDrawScope;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private k2 softwareLayerPaint;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private int parentLayerUsages;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final a childDependenciesTracker;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private boolean isReleased;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private long topLeft;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private long size;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private long pivotOffset;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private RectF pathBounds;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private c5.d density = p3.e.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private c5.t layoutDirection = c5.t.Ltr;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private er.l<? super p3.f, i0> drawBlock = C4075c.f164001b;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final er.l<p3.f, i0> clipDrawBlock = new b();

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean outlineDirty = true;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class b extends w implements er.l<p3.f, i0> {
        b() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p3.f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(p3.f fVar) {
            m2 m2Var = c.this.outlinePath;
            if (!c.this.usePathForClip || !c.this.getClip() || m2Var == null) {
                c.this.i(fVar);
                return;
            }
            c cVar = c.this;
            int iB = m1.INSTANCE.b();
            p3.d drawContext = fVar.getDrawContext();
            long jA = drawContext.a();
            drawContext.f().q();
            try {
                drawContext.getTransform().e(m2Var, iB);
                cVar.i(fVar);
            } finally {
                drawContext.f().j();
                drawContext.g(jA);
            }
        }
    }

    /* JADX INFO: renamed from: q3.c$c, reason: collision with other inner class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lp3/f;", "Loq/i0;", "c", "(Lp3/f;)V"}, k = 3, mv = {2, 1, 0})
    static final class C4075c extends w implements er.l<p3.f, i0> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final C4075c f164001b = new C4075c();

        C4075c() {
            super(1);
        }

        @Override // er.l
        public /* bridge */ /* synthetic */ i0 b(p3.f fVar) {
            c(fVar);
            return i0.f148189a;
        }

        public final void c(p3.f fVar) {
        }
    }

    static {
        i iVar;
        boolean zC = fr.t.c(Build.FINGERPRINT.toLowerCase(Locale.ROOT), "robolectric");
        A = zC;
        if (zC) {
            iVar = j.f164081a;
        } else if (Build.VERSION.SDK_INT >= 28) {
            iVar = l.f164083a;
        } else {
            iVar = r.f164089a.a() ? k.f164082a : j.f164081a;
        }
        B = iVar;
    }

    public c(d dVar) {
        this.impl = dVar;
        m3.e.Companion companion = m3.e.INSTANCE;
        this.roundRectOutlineTopLeft = companion.c();
        this.roundRectOutlineSize = m3.k.INSTANCE.a();
        this.childDependenciesTracker = new a();
        dVar.u(false);
        this.topLeft = c5.n.INSTANCE.b();
        this.size = c5.r.INSTANCE.a();
        this.pivotOffset = companion.b();
    }

    private final Outline B() {
        Outline outline = this.androidOutline;
        if (outline != null) {
            return outline;
        }
        Outline outline2 = new Outline();
        this.androidOutline = outline2;
        return outline2;
    }

    private final RectF C() {
        RectF rectF = this.pathBounds;
        if (rectF != null) {
            return rectF;
        }
        RectF rectF2 = new RectF();
        this.pathBounds = rectF2;
        return rectF2;
    }

    private final void D() {
        this.parentLayerUsages++;
    }

    private final void E() {
        this.parentLayerUsages--;
        f();
    }

    private final void G() {
        this.impl.k(this.density, this.layoutDirection, this, this.clipDrawBlock);
    }

    private final void H() {
        if (this.impl.n()) {
            return;
        }
        try {
            G();
        } catch (Throwable unused) {
        }
    }

    private final void J() {
        this.internalOutline = null;
        this.outlinePath = null;
        this.roundRectOutlineSize = m3.k.INSTANCE.a();
        this.roundRectOutlineTopLeft = m3.e.INSTANCE.c();
        this.roundRectCornerRadius = 0.0f;
        this.outlineDirty = true;
        this.usePathForClip = false;
    }

    private final void T(long topLeft, long size) {
        this.impl.m(c5.n.i(topLeft), c5.n.j(topLeft), size);
    }

    private final void d(c graphicsLayer) {
        if (this.childDependenciesTracker.i(graphicsLayer)) {
            graphicsLayer.D();
        }
    }

    private final void d0(long j15) {
        if (c5.r.e(this.size, j15)) {
            return;
        }
        this.size = j15;
        T(this.topLeft, j15);
        if (this.roundRectOutlineSize == 9205357640488583168L) {
            this.outlineDirty = true;
            e();
        }
    }

    private final void e() {
        if (this.outlineDirty) {
            Outline outline = null;
            if (this.clip || v() > 0.0f) {
                m2 m2Var = this.outlinePath;
                if (m2Var != null) {
                    RectF rectFC = C();
                    if (!(m2Var instanceof p0)) {
                        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                    }
                    ((p0) m2Var).getInternalPath().computeBounds(rectFC, false);
                    Outline outlineJ0 = j0(m2Var);
                    if (outlineJ0 != null) {
                        outlineJ0.setAlpha(j());
                        outline = outlineJ0;
                    }
                    this.impl.I(outline, c5.r.c((BodyPartID.bodyIdMax & ((long) Math.round(rectFC.height()))) | (((long) Math.round(rectFC.width())) << 32)));
                    if (this.usePathForClip && this.clip) {
                        this.impl.u(false);
                        this.impl.h();
                    } else {
                        this.impl.u(this.clip);
                    }
                } else {
                    this.impl.u(this.clip);
                    m3.k.INSTANCE.b();
                    Outline outlineB = B();
                    long jE = c5.s.e(this.size);
                    long j15 = this.roundRectOutlineTopLeft;
                    long j16 = this.roundRectOutlineSize;
                    long j17 = j16 == 9205357640488583168L ? jE : j16;
                    int i15 = (int) (j15 >> 32);
                    int iRound = Math.round(Float.intBitsToFloat(i15));
                    int i16 = (int) (j15 & BodyPartID.bodyIdMax);
                    outlineB.setRoundRect(iRound, Math.round(Float.intBitsToFloat(i16)), Math.round(Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (j17 >> 32))), Math.round(Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (j17 & BodyPartID.bodyIdMax))), this.roundRectCornerRadius);
                    outlineB.setAlpha(j());
                    this.impl.I(outlineB, c5.s.c(j17));
                }
            } else {
                this.impl.u(false);
                this.impl.I(null, c5.r.INSTANCE.a());
            }
        }
        this.outlineDirty = false;
    }

    private final void f() {
        if (this.isReleased && this.parentLayerUsages == 0) {
            g();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x0089 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x008b A[LOOP:0: B:20:0x0054->B:30:0x008b, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x008e A[EDGE_INSN: B:34:0x008e->B:31:0x008e BREAK  A[LOOP:0: B:20:0x0054->B:30:0x008b], SYNTHETIC] */
    public final void i(p3.f fVar) {
        a aVar = this.childDependenciesTracker;
        aVar.oldDependency = aVar.dependency;
        u0 u0Var = aVar.dependenciesSet;
        if (u0Var != null && u0Var.f()) {
            u0 u0VarB = aVar.oldDependenciesSet;
            if (u0VarB == null) {
                u0VarB = i1.b();
                aVar.oldDependenciesSet = u0VarB;
            }
            u0VarB.k(u0Var);
            u0Var.n();
        }
        aVar.trackingInProgress = true;
        this.drawBlock.b(fVar);
        aVar.trackingInProgress = false;
        c cVar = aVar.oldDependency;
        if (cVar != null) {
            cVar.E();
        }
        u0 u0Var2 = aVar.oldDependenciesSet;
        if (u0Var2 == null || !u0Var2.f()) {
            return;
        }
        Object[] objArr = u0Var2.elements;
        long[] jArr = u0Var2.metadata;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i15 = 0;
            while (true) {
                long j15 = jArr[i15];
                if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i15 != length) {
                        break;
                        break;
                    }
                    i15++;
                } else {
                    int i16 = 8 - ((~(i15 - length)) >>> 31);
                    for (int i17 = 0; i17 < i16; i17++) {
                        if ((255 & j15) < 128) {
                            ((c) objArr[(i15 << 3) + i17]).E();
                        }
                        j15 >>= 8;
                    }
                    if (i16 != 8) {
                        break;
                    } else if (i15 != length) {
                        break;
                    } else {
                        i15++;
                    }
                }
            }
        }
        u0Var2.n();
    }

    private final void i0(Canvas androidCanvas) {
        Canvas canvas;
        float fI = c5.n.i(this.topLeft);
        float fJ = c5.n.j(this.topLeft);
        float fI2 = c5.n.i(this.topLeft) + ((int) (this.size >> 32));
        float fJ2 = c5.n.j(this.topLeft) + ((int) (this.size & BodyPartID.bodyIdMax));
        float fJ3 = j();
        n1 n1VarM = m();
        int iK = k();
        if (fJ3 < 1.0f || !a1.E(iK, a1.INSTANCE.B()) || n1VarM != null || q3.b.e(n(), q3.b.INSTANCE.c())) {
            k2 k2VarA = this.softwareLayerPaint;
            if (k2VarA == null) {
                k2VarA = o0.a();
                this.softwareLayerPaint = k2VarA;
            }
            k2VarA.g(fJ3);
            k2VarA.f(iK);
            k2VarA.d(n1VarM);
            canvas = androidCanvas;
            canvas.saveLayer(fI, fJ, fI2, fJ2, o0.f(k2VarA));
        } else {
            androidCanvas.save();
            canvas = androidCanvas;
        }
        canvas.translate(fI, fJ);
        canvas.concat(this.impl.F());
    }

    private final Outline j0(m2 path) {
        Outline outline;
        int i15 = Build.VERSION.SDK_INT;
        if (i15 > 28 || path.a()) {
            Outline outlineB = B();
            if (i15 >= 30) {
                n.f164085a.a(outlineB, path);
            } else {
                if (!(path instanceof p0)) {
                    throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
                }
                outlineB.setConvexPath(((p0) path).getInternalPath());
            }
            this.usePathForClip = !outlineB.canClip();
            outline = outlineB;
        } else {
            Outline outline2 = this.androidOutline;
            if (outline2 != null) {
                outline2.setEmpty();
            }
            this.usePathForClip = true;
            this.impl.H(true);
            outline = null;
        }
        this.outlinePath = path;
        return outline;
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final boolean getIsReleased() {
        return this.isReleased;
    }

    public final void F(c5.d density, c5.t layoutDirection, long size, er.l<? super p3.f, i0> block) {
        d0(size);
        this.density = density;
        this.layoutDirection = layoutDirection;
        this.drawBlock = block;
        this.impl.H(true);
        G();
    }

    public final void I() {
        if (this.isReleased) {
            return;
        }
        this.isReleased = true;
        f();
    }

    public final void K(float f15) {
        if (this.impl.getAlpha() == f15) {
            return;
        }
        this.impl.g(f15);
    }

    public final void L(long j15) {
        if (Color.m11equalsimpl0(j15, this.impl.getAmbientShadowColor())) {
            return;
        }
        this.impl.q(j15);
    }

    public final void M(int i15) {
        if (a1.E(this.impl.getBlendMode(), i15)) {
            return;
        }
        this.impl.f(i15);
    }

    public final void N(float f15) {
        if (this.impl.getCameraDistance() == f15) {
            return;
        }
        this.impl.w(f15);
    }

    public final void O(boolean z15) {
        if (this.clip != z15) {
            this.clip = z15;
            this.outlineDirty = true;
            e();
        }
    }

    public final void P(n1 n1Var) {
        if (fr.t.c(this.impl.getColorFilter(), n1Var)) {
            return;
        }
        this.impl.d(n1Var);
    }

    public final void Q(int i15) {
        if (q3.b.e(this.impl.getCompositingStrategy(), i15)) {
            return;
        }
        this.impl.O(i15);
    }

    public final void R(m2 path) {
        J();
        this.outlinePath = path;
        e();
    }

    public final void S(long j15) {
        if (m3.e.j(this.pivotOffset, j15)) {
            return;
        }
        this.pivotOffset = j15;
        this.impl.K(j15);
    }

    public final void U(long topLeft, long size) {
        Z(topLeft, size, 0.0f);
    }

    public final void V(u2 u2Var) {
        this.impl.b();
        if (fr.t.c(null, u2Var)) {
            return;
        }
        this.impl.o(u2Var);
    }

    public final void W(float f15) {
        if (this.impl.getRotationX() == f15) {
            return;
        }
        this.impl.x(f15);
    }

    public final void X(float f15) {
        if (this.impl.getRotationY() == f15) {
            return;
        }
        this.impl.z(f15);
    }

    public final void Y(float f15) {
        if (this.impl.getRotationZ() == f15) {
            return;
        }
        this.impl.C(f15);
    }

    public final void Z(long topLeft, long size, float cornerRadius) {
        if (m3.e.j(this.roundRectOutlineTopLeft, topLeft) && m3.k.f(this.roundRectOutlineSize, size) && this.roundRectCornerRadius == cornerRadius && this.outlinePath == null) {
            return;
        }
        J();
        this.roundRectOutlineTopLeft = topLeft;
        this.roundRectOutlineSize = size;
        this.roundRectCornerRadius = cornerRadius;
        e();
    }

    public final void a0(float f15) {
        if (this.impl.getScaleX() == f15) {
            return;
        }
        this.impl.s(f15);
    }

    public final void b0(float f15) {
        if (this.impl.getScaleY() == f15) {
            return;
        }
        this.impl.D(f15);
    }

    public final void c0(float f15) {
        if (this.impl.getShadowElevation() == f15) {
            return;
        }
        this.impl.B(f15);
        this.outlineDirty = true;
        e();
    }

    public final void e0(long j15) {
        if (Color.m11equalsimpl0(j15, this.impl.getSpotShadowColor())) {
            return;
        }
        this.impl.v(j15);
    }

    public final void f0(long j15) {
        if (c5.n.h(this.topLeft, j15)) {
            return;
        }
        this.topLeft = j15;
        T(j15, this.size);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[LOOP:0: B:10:0x0020->B:20:0x0057, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x005a A[EDGE_INSN: B:25:0x005a->B:21:0x005a BREAK  A[LOOP:0: B:10:0x0020->B:20:0x0057], SYNTHETIC] */
    public final void g() {
        a aVar = this.childDependenciesTracker;
        c cVar = aVar.dependency;
        if (cVar != null) {
            cVar.E();
            aVar.dependency = null;
        }
        u0 u0Var = aVar.dependenciesSet;
        if (u0Var != null) {
            Object[] objArr = u0Var.elements;
            long[] jArr = u0Var.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i15 != length) {
                            break;
                            break;
                        }
                        i15++;
                    } else {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                ((c) objArr[(i15 << 3) + i17]).E();
                            }
                            j15 >>= 8;
                        }
                        if (i16 != 8) {
                            break;
                        } else if (i15 != length) {
                            break;
                        } else {
                            i15++;
                        }
                    }
                }
            }
            u0Var.n();
        }
        this.impl.h();
    }

    public final void g0(float f15) {
        if (this.impl.getTranslationX() == f15) {
            return;
        }
        this.impl.N(f15);
    }

    public final void h(h1 canvas, c parentLayer) {
        if (this.isReleased) {
            return;
        }
        e();
        H();
        boolean z15 = v() > 0.0f;
        if (z15) {
            canvas.l();
        }
        Canvas canvasD = f0.d(canvas);
        boolean zIsHardwareAccelerated = canvasD.isHardwareAccelerated();
        if (!zIsHardwareAccelerated) {
            i0(canvasD);
        }
        boolean z16 = !zIsHardwareAccelerated && this.clip;
        if (z16) {
            canvas.q();
            i2 i2VarO = o();
            if (i2VarO instanceof i2.b) {
                h1.w(canvas, ((i2.b) i2VarO).getRect(), 0, 2, null);
            } else if (i2VarO instanceof i2.c) {
                m2 m2VarA = this.roundRectClipPath;
                if (m2VarA != null) {
                    m2VarA.l();
                } else {
                    m2VarA = n3.u0.a();
                    this.roundRectClipPath = m2VarA;
                }
                m2.o(m2VarA, ((i2.c) i2VarO).getRoundRect(), null, 2, null);
                h1.g(canvas, m2VarA, 0, 2, null);
            } else {
                if (!(i2VarO instanceof i2.a)) {
                    throw new oq.p();
                }
                h1.g(canvas, ((i2.a) i2VarO).getPath(), 0, 2, null);
            }
        }
        if (parentLayer != null) {
            parentLayer.d(this);
        }
        if (f0.d(canvas).isHardwareAccelerated() || this.impl.getSupportsSoftwareRendering()) {
            this.impl.E(canvas);
        } else {
            p3.a aVar = this.softwareDrawScope;
            if (aVar == null) {
                aVar = new p3.a();
                this.softwareDrawScope = aVar;
            }
            p3.f fVar = aVar;
            c5.d dVar = this.density;
            c5.t tVar = this.layoutDirection;
            long jE = c5.s.e(this.size);
            c5.d density = fVar.getDrawContext().getDensity();
            c5.t layoutDirection = fVar.getDrawContext().getLayoutDirection();
            h1 h1VarF = fVar.getDrawContext().f();
            long jA = fVar.getDrawContext().a();
            c graphicsLayer = fVar.getDrawContext().getGraphicsLayer();
            p3.d drawContext = fVar.getDrawContext();
            drawContext.b(dVar);
            drawContext.d(tVar);
            drawContext.e(canvas);
            drawContext.g(jE);
            drawContext.i(this);
            canvas.q();
            try {
                i(fVar);
                canvas.j();
                p3.d drawContext2 = fVar.getDrawContext();
                drawContext2.b(density);
                drawContext2.d(layoutDirection);
                drawContext2.e(h1VarF);
                drawContext2.g(jA);
                drawContext2.i(graphicsLayer);
            } catch (Throwable th4) {
                canvas.j();
                p3.d drawContext3 = fVar.getDrawContext();
                drawContext3.b(density);
                drawContext3.d(layoutDirection);
                drawContext3.e(h1VarF);
                drawContext3.g(jA);
                drawContext3.i(graphicsLayer);
                throw th4;
            }
        }
        if (z16) {
            canvas.j();
        }
        if (z15) {
            canvas.s();
        }
        if (zIsHardwareAccelerated) {
            return;
        }
        canvasD.restore();
    }

    public final void h0(float f15) {
        if (this.impl.getTranslationY() == f15) {
            return;
        }
        this.impl.j(f15);
    }

    public final float j() {
        return this.impl.getAlpha();
    }

    public final int k() {
        return this.impl.getBlendMode();
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    public final n1 m() {
        return this.impl.getColorFilter();
    }

    public final int n() {
        return this.impl.getCompositingStrategy();
    }

    public final i2 o() {
        i2 bVar;
        i2 i2Var = this.internalOutline;
        m2 m2Var = this.outlinePath;
        if (i2Var != null) {
            return i2Var;
        }
        if (m2Var != null) {
            i2.a aVar = new i2.a(m2Var);
            this.internalOutline = aVar;
            return aVar;
        }
        long jE = c5.s.e(this.size);
        long j15 = this.roundRectOutlineTopLeft;
        long j16 = this.roundRectOutlineSize;
        if (j16 != 9205357640488583168L) {
            jE = j16;
        }
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j15 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j15 & BodyPartID.bodyIdMax));
        float fIntBitsToFloat3 = Float.intBitsToFloat((int) (jE >> 32)) + fIntBitsToFloat;
        float fIntBitsToFloat4 = fIntBitsToFloat2 + Float.intBitsToFloat((int) (jE & BodyPartID.bodyIdMax));
        float f15 = this.roundRectCornerRadius;
        if (f15 > 0.0f) {
            bVar = new i2.c(m3.j.d(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4, m3.a.b((((long) Float.floatToRawIntBits(f15)) << 32) | (BodyPartID.bodyIdMax & ((long) Float.floatToRawIntBits(f15))))));
        } else {
            bVar = new i2.b(new m3.g(fIntBitsToFloat, fIntBitsToFloat2, fIntBitsToFloat3, fIntBitsToFloat4));
        }
        this.internalOutline = bVar;
        return bVar;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getPivotOffset() {
        return this.pivotOffset;
    }

    public final float q() {
        return this.impl.getRotationX();
    }

    public final float r() {
        return this.impl.getRotationY();
    }

    public final float s() {
        return this.impl.getRotationZ();
    }

    public final float t() {
        return this.impl.getScaleX();
    }

    public final float u() {
        return this.impl.getScaleY();
    }

    public final float v() {
        return this.impl.getShadowElevation();
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getSize() {
        return this.size;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getTopLeft() {
        return this.topLeft;
    }

    public final float y() {
        return this.impl.getTranslationX();
    }

    public final float z() {
        return this.impl.getTranslationY();
    }
}
