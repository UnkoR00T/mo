package p3;

import androidx.compose.ui.graphics.Color;
import c5.t;
import n3.a1;
import n3.a3;
import n3.b2;
import n3.b3;
import n3.h1;
import n3.k2;
import n3.l2;
import n3.m2;
import n3.n1;
import n3.n2;
import n3.o0;
import n3.v1;
import oq.p;
import org.bouncycastle.asn1.cmc.BodyPartID;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¸\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001:\u0001]B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0007\u0010\u0006J\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJG\u0010\u0017\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JE\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJg\u0010%\u001a\u00020\u00042\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010&Ji\u0010'\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b'\u0010(J\u001b\u0010)\u001a\u00020\u0019*\u00020\u00192\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b)\u0010*J]\u0010/\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b/\u00100J]\u00101\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010-\u001a\u00020+2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\b\u0010$\u001a\u0004\u0018\u00010#2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b1\u00102JK\u00106\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u00107JK\u00108\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b8\u00109JC\u0010<\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u00103\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b<\u0010=Jc\u0010D\u001a\u00020.2\u0006\u0010;\u001a\u00020:2\u0006\u0010?\u001a\u00020>2\u0006\u0010A\u001a\u00020@2\u0006\u0010B\u001a\u00020>2\u0006\u0010C\u001a\u00020@2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\bD\u0010EJS\u0010H\u001a\u00020.2\u0006\u0010\r\u001a\u00020\f2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bH\u0010IJS\u0010J\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\u0006\u0010G\u001a\u00020F2\u0006\u0010\u000e\u001a\u00020\b2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bJ\u0010KJK\u0010N\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010L\u001a\u00020\u000f2\u0006\u0010M\u001a\u00020+2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bN\u0010OJc\u0010T\u001a\u00020.2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010P\u001a\u00020\u000f2\u0006\u0010Q\u001a\u00020\u000f2\u0006\u0010S\u001a\u00020R2\u0006\u00103\u001a\u00020+2\u0006\u00105\u001a\u0002042\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bT\u0010UJC\u0010X\u001a\u00020.2\u0006\u0010W\u001a\u00020V2\u0006\u0010\u001a\u001a\u00020\u00192\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bX\u0010YJC\u0010Z\u001a\u00020.2\u0006\u0010W\u001a\u00020V2\u0006\u0010\r\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\bZ\u0010[R \u0010b\u001a\u00020\\8\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b]\u0010^\u0012\u0004\ba\u0010\u0003\u001a\u0004\b_\u0010`R\u001a\u0010h\u001a\u00020c8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bd\u0010e\u001a\u0004\bf\u0010gR\u0018\u0010j\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010iR\u0018\u0010l\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010iR\u0014\u0010p\u001a\u00020m8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bn\u0010oR\u0014\u0010s\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bq\u0010rR\u0014\u0010u\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010r¨\u0006v"}, d2 = {"Lp3/a;", "Lp3/f;", "<init>", "()V", "Ln3/k2;", "G", "()Ln3/k2;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lp3/g;", "drawStyle", "I", "(Lp3/g;)Ln3/k2;", "Landroidx/compose/ui/graphics/c;", "brush", "style", "", "alpha", "Ln3/n1;", "colorFilter", "Ln3/a1;", "blendMode", "Ln3/v1;", "filterQuality", "h", "(Landroidx/compose/ui/graphics/c;Lp3/g;FLn3/n1;II)Ln3/k2;", "Landroidx/compose/ui/graphics/Color;", "color", "c", "(JLp3/g;FLn3/n1;II)Ln3/k2;", "strokeWidth", "miter", "Ln3/a3;", "cap", "Ln3/b3;", "join", "Ln3/n2;", "pathEffect", "k", "(JFFIILn3/n2;FLn3/n1;II)Ln3/k2;", "r", "(Landroidx/compose/ui/graphics/c;FFIILn3/n2;FLn3/n1;II)Ln3/k2;", "F", "(JF)J", "Lm3/e;", "start", "end", "Loq/i0;", "o2", "(Landroidx/compose/ui/graphics/c;JJFILn3/n2;FLn3/n1;I)V", "t0", "(JJJFILn3/n2;FLn3/n1;I)V", "topLeft", "Lm3/k;", "size", "m1", "(Landroidx/compose/ui/graphics/c;JJFLp3/g;Ln3/n1;I)V", "l1", "(JJJFLp3/g;Ln3/n1;I)V", "Ln3/b2;", "image", "a1", "(Ln3/b2;JFLp3/g;Ln3/n1;I)V", "Lc5/n;", "srcOffset", "Lc5/r;", "srcSize", "dstOffset", "dstSize", "u0", "(Ln3/b2;JJJJFLp3/g;Ln3/n1;II)V", "Lm3/a;", "cornerRadius", "S1", "(Landroidx/compose/ui/graphics/c;JJJFLp3/g;Ln3/n1;I)V", "D0", "(JJJJLp3/g;FLn3/n1;I)V", "radius", "center", "s1", "(JFJFLp3/g;Ln3/n1;I)V", "startAngle", "sweepAngle", "", "useCenter", "V", "(JFFZJJFLp3/g;Ln3/n1;I)V", "Ln3/m2;", "path", "c0", "(Ln3/m2;JFLp3/g;Ln3/n1;I)V", "g1", "(Ln3/m2;Landroidx/compose/ui/graphics/c;FLp3/g;Ln3/n1;I)V", "Lp3/a$a;", "a", "Lp3/a$a;", "E", "()Lp3/a$a;", "getDrawParams$annotations", "drawParams", "Lp3/d;", "b", "Lp3/d;", "n2", "()Lp3/d;", "drawContext", "Ln3/k2;", "fillPaint", "d", "strokePaint", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "layoutDirection", "getDensity", "()F", "density", "i2", "fontScale", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class a implements f {

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final DrawParams drawParams = new DrawParams(null, null, null, 0, 15, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final d drawContext = new b();

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private k2 fillPaint;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private k2 strokePaint;

    /* JADX INFO: renamed from: p3.a$a, reason: collision with other inner class name and from toString */
    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\b\u0081\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001c\u0010\u001dR\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\u001e\u001a\u0004\b\u001f\u0010\r\"\u0004\b \u0010!R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\"\u001a\u0004\b#\u0010\u000f\"\u0004\b$\u0010%R\"\u0010\u0007\u001a\u00020\u00068\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010&\u001a\u0004\b'\u0010\u0011\"\u0004\b(\u0010)R\"\u0010\t\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010*\u001a\u0004\b+\u0010\u0013\"\u0004\b,\u0010-¨\u0006."}, d2 = {"Lp3/a$a;", "", "Lc5/d;", "density", "Lc5/t;", "layoutDirection", "Ln3/h1;", "canvas", "Lm3/k;", "size", "<init>", "(Lc5/d;Lc5/t;Ln3/h1;JLfr/k;)V", "a", "()Lc5/d;", "b", "()Lc5/t;", "c", "()Ln3/h1;", "d", "()J", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lc5/d;", "f", "j", "(Lc5/d;)V", "Lc5/t;", "g", "k", "(Lc5/t;)V", "Ln3/h1;", "e", "i", "(Ln3/h1;)V", "J", "h", "l", "(J)V", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final /* data */ class DrawParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
        private c5.d density;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
        private t layoutDirection;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
        private h1 canvas;

        /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
        private long size;

        public /* synthetic */ DrawParams(c5.d dVar, t tVar, h1 h1Var, long j15, fr.k kVar) {
            this(dVar, tVar, h1Var, j15);
        }

        /* JADX INFO: renamed from: a, reason: from getter */
        public final c5.d getDensity() {
            return this.density;
        }

        /* JADX INFO: renamed from: b, reason: from getter */
        public final t getLayoutDirection() {
            return this.layoutDirection;
        }

        /* JADX INFO: renamed from: c, reason: from getter */
        public final h1 getCanvas() {
            return this.canvas;
        }

        /* JADX INFO: renamed from: d, reason: from getter */
        public final long getSize() {
            return this.size;
        }

        public final h1 e() {
            return this.canvas;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DrawParams)) {
                return false;
            }
            DrawParams drawParams = (DrawParams) other;
            return fr.t.c(this.density, drawParams.density) && this.layoutDirection == drawParams.layoutDirection && fr.t.c(this.canvas, drawParams.canvas) && m3.k.f(this.size, drawParams.size);
        }

        public final c5.d f() {
            return this.density;
        }

        public final t g() {
            return this.layoutDirection;
        }

        public final long h() {
            return this.size;
        }

        public int hashCode() {
            return (((((this.density.hashCode() * 31) + this.layoutDirection.hashCode()) * 31) + this.canvas.hashCode()) * 31) + m3.k.j(this.size);
        }

        public final void i(h1 h1Var) {
            this.canvas = h1Var;
        }

        public final void j(c5.d dVar) {
            this.density = dVar;
        }

        public final void k(t tVar) {
            this.layoutDirection = tVar;
        }

        public final void l(long j15) {
            this.size = j15;
        }

        public String toString() {
            return "DrawParams(density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", canvas=" + this.canvas + ", size=" + ((Object) m3.k.l(this.size)) + ')';
        }

        private DrawParams(c5.d dVar, t tVar, h1 h1Var, long j15) {
            this.density = dVar;
            this.layoutDirection = tVar;
            this.canvas = h1Var;
            this.size = j15;
        }

        public /* synthetic */ DrawParams(c5.d dVar, t tVar, h1 h1Var, long j15, int i15, fr.k kVar) {
            this((i15 & 1) != 0 ? e.a() : dVar, (i15 & 2) != 0 ? t.Ltr : tVar, (i15 & 4) != 0 ? i.f152591a : h1Var, (i15 & 8) != 0 ? m3.k.INSTANCE.b() : j15, null);
        }
    }

    @Metadata(d1 = {"\u00009\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R$\u0010\u000f\u001a\u0004\u0018\u00010\b8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R$\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00178V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0018\"\u0004\b\u0019\u0010\u001aR$\u0010!\u001a\u00020\u001c2\u0006\u0010\u0011\u001a\u00020\u001c8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R$\u0010&\u001a\u00020\"2\u0006\u0010\u0011\u001a\u00020\"8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b#\u0010$\"\u0004\b\t\u0010%¨\u0006'"}, d2 = {"p3/a$b", "Lp3/d;", "Lp3/h;", "a", "Lp3/h;", "c", "()Lp3/h;", "transform", "Lq3/c;", "b", "Lq3/c;", "h", "()Lq3/c;", "i", "(Lq3/c;)V", "graphicsLayer", "Ln3/h1;", "value", "f", "()Ln3/h1;", "e", "(Ln3/h1;)V", "canvas", "Lm3/k;", "()J", "g", "(J)V", "size", "Lc5/t;", "getLayoutDirection", "()Lc5/t;", "d", "(Lc5/t;)V", "layoutDirection", "Lc5/d;", "getDensity", "()Lc5/d;", "(Lc5/d;)V", "density", "ui-graphics"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class b implements d {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final h transform = p3.b.b(this);

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private q3.c graphicsLayer;

        b() {
        }

        @Override // p3.d
        public long a() {
            return a.this.getDrawParams().h();
        }

        @Override // p3.d
        public void b(c5.d dVar) {
            a.this.getDrawParams().j(dVar);
        }

        @Override // p3.d
        /* JADX INFO: renamed from: c, reason: from getter */
        public h getTransform() {
            return this.transform;
        }

        @Override // p3.d
        public void d(t tVar) {
            a.this.getDrawParams().k(tVar);
        }

        @Override // p3.d
        public void e(h1 h1Var) {
            a.this.getDrawParams().i(h1Var);
        }

        @Override // p3.d
        public h1 f() {
            return a.this.getDrawParams().e();
        }

        @Override // p3.d
        public void g(long j15) {
            a.this.getDrawParams().l(j15);
        }

        @Override // p3.d
        public c5.d getDensity() {
            return a.this.getDrawParams().f();
        }

        @Override // p3.d
        public t getLayoutDirection() {
            return a.this.getDrawParams().g();
        }

        @Override // p3.d
        /* JADX INFO: renamed from: h, reason: from getter */
        public q3.c getGraphicsLayer() {
            return this.graphicsLayer;
        }

        @Override // p3.d
        public void i(q3.c cVar) {
            this.graphicsLayer = cVar;
        }
    }

    private final long F(long j15, float f15) {
        return f15 == 1.0f ? j15 : Color.m9copywmQWz5c$default(j15, Color.m12getAlphaimpl(j15) * f15, 0.0f, 0.0f, 0.0f, 14, null);
    }

    private final k2 G() {
        k2 k2Var = this.fillPaint;
        if (k2Var != null) {
            return k2Var;
        }
        k2 k2VarA = o0.a();
        k2VarA.u(l2.INSTANCE.a());
        this.fillPaint = k2VarA;
        return k2VarA;
    }

    private final k2 H() {
        k2 k2Var = this.strokePaint;
        if (k2Var != null) {
            return k2Var;
        }
        k2 k2VarA = o0.a();
        k2VarA.u(l2.INSTANCE.b());
        this.strokePaint = k2VarA;
        return k2VarA;
    }

    private final k2 I(g drawStyle) {
        if (fr.t.c(drawStyle, j.f152592b)) {
            return G();
        }
        if (!(drawStyle instanceof Stroke)) {
            throw new p();
        }
        k2 k2VarH = H();
        Stroke kVar = (Stroke) drawStyle;
        if (k2VarH.w() != kVar.getWidth()) {
            k2VarH.v(kVar.getWidth());
        }
        if (!a3.e(k2VarH.k(), kVar.getCap())) {
            k2VarH.i(kVar.getCap());
        }
        if (k2VarH.p() != kVar.getMiter()) {
            k2VarH.s(kVar.getMiter());
        }
        if (!b3.e(k2VarH.o(), kVar.getJoin())) {
            k2VarH.l(kVar.getJoin());
        }
        if (!fr.t.c(k2VarH.getPathEffect(), kVar.getPathEffect())) {
            k2VarH.h(kVar.getPathEffect());
        }
        return k2VarH;
    }

    private final k2 c(long color, g style, float alpha, n1 colorFilter, int blendMode, int filterQuality) {
        k2 k2VarI = I(style);
        long jF = F(color, alpha);
        if (!Color.m11equalsimpl0(k2VarI.b(), jF)) {
            k2VarI.m(jF);
        }
        if (k2VarI.getInternalShader() != null) {
            k2VarI.q(null);
        }
        if (!fr.t.c(k2VarI.getInternalColorFilter(), colorFilter)) {
            k2VarI.d(colorFilter);
        }
        if (!a1.E(k2VarI.get_blendMode(), blendMode)) {
            k2VarI.f(blendMode);
        }
        if (!v1.d(k2VarI.t(), filterQuality)) {
            k2VarI.j(filterQuality);
        }
        return k2VarI;
    }

    static /* synthetic */ k2 e(a aVar, long j15, g gVar, float f15, n1 n1Var, int i15, int i16, int i17, Object obj) {
        return aVar.c(j15, gVar, f15, n1Var, i15, (i17 & 32) != 0 ? f.INSTANCE.b() : i16);
    }

    private final k2 h(androidx.compose.ui.graphics.c brush, g style, float alpha, n1 colorFilter, int blendMode, int filterQuality) {
        k2 k2VarI = I(style);
        if (brush != null) {
            brush.a(a(), k2VarI, alpha);
        } else {
            if (k2VarI.getInternalShader() != null) {
                k2VarI.q(null);
            }
            long jB = k2VarI.b();
            Color.Companion companion = Color.INSTANCE;
            if (!Color.m11equalsimpl0(jB, companion.a())) {
                k2VarI.m(companion.a());
            }
            if (k2VarI.a() != alpha) {
                k2VarI.g(alpha);
            }
        }
        if (!fr.t.c(k2VarI.getInternalColorFilter(), colorFilter)) {
            k2VarI.d(colorFilter);
        }
        if (!a1.E(k2VarI.get_blendMode(), blendMode)) {
            k2VarI.f(blendMode);
        }
        if (!v1.d(k2VarI.t(), filterQuality)) {
            k2VarI.j(filterQuality);
        }
        return k2VarI;
    }

    static /* synthetic */ k2 i(a aVar, androidx.compose.ui.graphics.c cVar, g gVar, float f15, n1 n1Var, int i15, int i16, int i17, Object obj) {
        if ((i17 & 32) != 0) {
            i16 = f.INSTANCE.b();
        }
        return aVar.h(cVar, gVar, f15, n1Var, i15, i16);
    }

    private final k2 k(long color, float strokeWidth, float miter, int cap, int join, n2 pathEffect, float alpha, n1 colorFilter, int blendMode, int filterQuality) {
        k2 k2VarH = H();
        long jF = F(color, alpha);
        if (!Color.m11equalsimpl0(k2VarH.b(), jF)) {
            k2VarH.m(jF);
        }
        if (k2VarH.getInternalShader() != null) {
            k2VarH.q(null);
        }
        if (!fr.t.c(k2VarH.getInternalColorFilter(), colorFilter)) {
            k2VarH.d(colorFilter);
        }
        if (!a1.E(k2VarH.get_blendMode(), blendMode)) {
            k2VarH.f(blendMode);
        }
        if (k2VarH.w() != strokeWidth) {
            k2VarH.v(strokeWidth);
        }
        if (k2VarH.p() != miter) {
            k2VarH.s(miter);
        }
        if (!a3.e(k2VarH.k(), cap)) {
            k2VarH.i(cap);
        }
        if (!b3.e(k2VarH.o(), join)) {
            k2VarH.l(join);
        }
        if (!fr.t.c(k2VarH.getPathEffect(), pathEffect)) {
            k2VarH.h(pathEffect);
        }
        if (!v1.d(k2VarH.t(), filterQuality)) {
            k2VarH.j(filterQuality);
        }
        return k2VarH;
    }

    static /* synthetic */ k2 n(a aVar, long j15, float f15, float f16, int i15, int i16, n2 n2Var, float f17, n1 n1Var, int i17, int i18, int i19, Object obj) {
        return aVar.k(j15, f15, f16, i15, i16, n2Var, f17, n1Var, i17, (i19 & 512) != 0 ? f.INSTANCE.b() : i18);
    }

    private final k2 r(androidx.compose.ui.graphics.c brush, float strokeWidth, float miter, int cap, int join, n2 pathEffect, float alpha, n1 colorFilter, int blendMode, int filterQuality) {
        k2 k2VarH = H();
        if (brush != null) {
            brush.a(a(), k2VarH, alpha);
        } else if (k2VarH.a() != alpha) {
            k2VarH.g(alpha);
        }
        if (!fr.t.c(k2VarH.getInternalColorFilter(), colorFilter)) {
            k2VarH.d(colorFilter);
        }
        if (!a1.E(k2VarH.get_blendMode(), blendMode)) {
            k2VarH.f(blendMode);
        }
        if (k2VarH.w() != strokeWidth) {
            k2VarH.v(strokeWidth);
        }
        if (k2VarH.p() != miter) {
            k2VarH.s(miter);
        }
        if (!a3.e(k2VarH.k(), cap)) {
            k2VarH.i(cap);
        }
        if (!b3.e(k2VarH.o(), join)) {
            k2VarH.l(join);
        }
        if (!fr.t.c(k2VarH.getPathEffect(), pathEffect)) {
            k2VarH.h(pathEffect);
        }
        if (!v1.d(k2VarH.t(), filterQuality)) {
            k2VarH.j(filterQuality);
        }
        return k2VarH;
    }

    static /* synthetic */ k2 y(a aVar, androidx.compose.ui.graphics.c cVar, float f15, float f16, int i15, int i16, n2 n2Var, float f17, n1 n1Var, int i17, int i18, int i19, Object obj) {
        return aVar.r(cVar, f15, f16, i15, i16, n2Var, f17, n1Var, i17, (i19 & 512) != 0 ? f.INSTANCE.b() : i18);
    }

    @Override // p3.f
    public void D0(long color, long topLeft, long size, long cornerRadius, g style, float alpha, n1 colorFilter, int blendMode) {
        h1 h1VarE = this.drawParams.e();
        int i15 = (int) (topLeft >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (topLeft & BodyPartID.bodyIdMax);
        h1VarE.r(fIntBitsToFloat, Float.intBitsToFloat(i16), Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & BodyPartID.bodyIdMax)), e(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final DrawParams getDrawParams() {
        return this.drawParams;
    }

    @Override // p3.f
    public void S1(androidx.compose.ui.graphics.c brush, long topLeft, long size, long cornerRadius, float alpha, g style, n1 colorFilter, int blendMode) {
        h1 h1VarE = this.drawParams.e();
        int i15 = (int) (topLeft >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (topLeft & BodyPartID.bodyIdMax);
        h1VarE.r(fIntBitsToFloat, Float.intBitsToFloat(i16), Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)), Float.intBitsToFloat((int) (cornerRadius >> 32)), Float.intBitsToFloat((int) (cornerRadius & BodyPartID.bodyIdMax)), i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    public void V(long color, float startAngle, float sweepAngle, boolean useCenter, long topLeft, long size, float alpha, g style, n1 colorFilter, int blendMode) {
        h1 h1VarE = this.drawParams.e();
        int i15 = (int) (topLeft >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (topLeft & BodyPartID.bodyIdMax);
        h1VarE.x(fIntBitsToFloat, Float.intBitsToFloat(i16), Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)), startAngle, sweepAngle, useCenter, e(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    public void a1(b2 image, long topLeft, float alpha, g style, n1 colorFilter, int blendMode) {
        this.drawParams.e().m(image, topLeft, i(this, null, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    public void c0(m2 path, long color, float alpha, g style, n1 colorFilter, int blendMode) {
        this.drawParams.e().u(path, e(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    public void g1(m2 path, androidx.compose.ui.graphics.c brush, float alpha, g style, n1 colorFilter, int blendMode) {
        this.drawParams.e().u(path, i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // c5.d
    public float getDensity() {
        return this.drawParams.f().getDensity();
    }

    @Override // p3.f
    public t getLayoutDirection() {
        return this.drawParams.g();
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2 */
    public float getFontScale() {
        return this.drawParams.f().getFontScale();
    }

    @Override // p3.f
    public void l1(long color, long topLeft, long size, float alpha, g style, n1 colorFilter, int blendMode) {
        h1 h1VarE = this.drawParams.e();
        int i15 = (int) (topLeft >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (topLeft & BodyPartID.bodyIdMax);
        h1VarE.h(fIntBitsToFloat, Float.intBitsToFloat(i16), Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)), e(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    public void m1(androidx.compose.ui.graphics.c brush, long topLeft, long size, float alpha, g style, n1 colorFilter, int blendMode) {
        h1 h1VarE = this.drawParams.e();
        int i15 = (int) (topLeft >> 32);
        float fIntBitsToFloat = Float.intBitsToFloat(i15);
        int i16 = (int) (topLeft & BodyPartID.bodyIdMax);
        h1VarE.h(fIntBitsToFloat, Float.intBitsToFloat(i16), Float.intBitsToFloat(i15) + Float.intBitsToFloat((int) (size >> 32)), Float.intBitsToFloat(i16) + Float.intBitsToFloat((int) (size & BodyPartID.bodyIdMax)), i(this, brush, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    /* JADX INFO: renamed from: n2, reason: from getter */
    public d getDrawContext() {
        return this.drawContext;
    }

    @Override // p3.f
    public void o2(androidx.compose.ui.graphics.c brush, long start, long end, float strokeWidth, int cap, n2 pathEffect, float alpha, n1 colorFilter, int blendMode) {
        this.drawParams.e().o(start, end, y(this, brush, strokeWidth, 4.0f, cap, b3.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // p3.f
    public void s1(long color, float radius, long center, float alpha, g style, n1 colorFilter, int blendMode) {
        this.drawParams.e().i(center, radius, e(this, color, style, alpha, colorFilter, blendMode, 0, 32, null));
    }

    @Override // p3.f
    public void t0(long color, long start, long end, float strokeWidth, int cap, n2 pathEffect, float alpha, n1 colorFilter, int blendMode) {
        this.drawParams.e().o(start, end, n(this, color, strokeWidth, 4.0f, cap, b3.INSTANCE.b(), pathEffect, alpha, colorFilter, blendMode, 0, 512, null));
    }

    @Override // p3.f
    public void u0(b2 image, long srcOffset, long srcSize, long dstOffset, long dstSize, float alpha, g style, n1 colorFilter, int blendMode, int filterQuality) {
        this.drawParams.e().k(image, srcOffset, srcSize, dstOffset, dstSize, h(null, style, alpha, colorFilter, blendMode, filterQuality));
    }
}
