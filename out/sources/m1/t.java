package m1;

import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import fr.n0;
import g4.b0;
import g4.q1;
import g4.r1;
import g4.v0;
import g4.w0;
import java.util.Arrays;
import ju.d2;
import ju.p0;
import n3.a2;
import n3.i2;
import n3.j2;
import n3.y2;
import oq.i0;
import org.bouncycastle.crypto.CryptoServicesPermission;
import p036e4.x0;
import p036e4.y0;
import p071kotlin.Metadata;
import p076m2.a0;
import q4.TextStyle;
import r0.q0;
import s3.Shadow;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\bB\u0019\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0013\u0010\u0014\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0013\u0010\u0016\u001a\u00020\u0013*\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0013\u0010\u0019\u001a\u00020\u0018*\u00020\u0017H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010!\u001a\u00020 *\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J+\u0010'\u001a\u00020\u0018*\u00020\u001b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b'\u0010(J+\u0010)\u001a\u00020\u0018*\u00020\u001b2\u0006\u0010$\u001a\u00020#2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020%H\u0002¢\u0006\u0004\b)\u0010(J\u000f\u0010*\u001a\u00020\u0018H\u0002¢\u0006\u0004\b*\u0010+J\u000f\u0010,\u001a\u00020\u0018H\u0002¢\u0006\u0004\b,\u0010+J!\u0010/\u001a\u00020\u000f2\u0006\u0010-\u001a\u00020#2\b\b\u0002\u0010.\u001a\u00020\u000fH\u0000¢\u0006\u0004\b/\u00100J#\u00107\u001a\u000206*\u0002012\u0006\u00103\u001a\u0002022\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\u00020\u0018*\u00020\u001bH\u0016¢\u0006\u0004\b9\u0010:J\u001d\u0010<\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b<\u0010=J\u0019\u0010?\u001a\u00020\u0018*\u00020\u001b2\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\b?\u0010@J\u001d\u0010A\u001a\u00020\u00182\u0006\u0010;\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\bA\u0010=J\u0019\u0010B\u001a\u00020\u0018*\u00020\u001b2\u0006\u0010>\u001a\u00020\u000f¢\u0006\u0004\bB\u0010@Jo\u0010P\u001a\u00020\u0018*\u00020\u001b2\u0006\u0010\u001f\u001a\u00020\u001e2\u0006\u0010C\u001a\u00020\u00132\u0006\u0010D\u001a\u00020\u00132\u0006\u0010E\u001a\u00020\u00132\u0006\u0010G\u001a\u00020F2\b\u0010I\u001a\u0004\u0018\u00010H2\u0006\u0010J\u001a\u00020F2\b\u0010K\u001a\u0004\u0018\u00010H2\u0006\u0010L\u001a\u00020F2\b\u0010M\u001a\u0004\u0018\u00010H2\u0006\u0010O\u001a\u00020N¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u00182\b\b\u0002\u0010R\u001a\u00020\u0013¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0018H\u0016¢\u0006\u0004\bU\u0010+J\r\u0010V\u001a\u00020\u0018¢\u0006\u0004\bV\u0010+J\u001f\u0010[\u001a\u00020Y2\u0006\u0010X\u001a\u00020W2\u0006\u0010Z\u001a\u00020YH\u0016¢\u0006\u0004\b[\u0010\\J\u0019\u0010]\u001a\u0004\u0018\u00010\u000f2\u0006\u0010-\u001a\u00020#H\u0000¢\u0006\u0004\b]\u0010^J\u0011\u0010_\u001a\u0004\u0018\u00010\u000fH\u0000¢\u0006\u0004\b_\u0010\u0011J\u0017\u0010`\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u000fH\u0000¢\u0006\u0004\b`\u0010aJ\u000f\u0010b\u001a\u00020\u0018H\u0016¢\u0006\u0004\bb\u0010+R$\u0010j\u001a\u0004\u0018\u00010c8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010iR*\u0010\f\u001a\u00020\u000b2\u0006\u0010k\u001a\u00020\u000b8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0016\u0010t\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\br\u0010sR\u0018\u0010u\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u0010sR$\u0010}\u001a\u0004\u0018\u00010v8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bw\u0010x\u001a\u0004\by\u0010z\"\u0004\b{\u0010|R\u001a\u0010\u0081\u0001\u001a\u0004\u0018\u00010~8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\"\u0010\u0085\u0001\u001a\u000b\u0012\u0004\u0012\u00020~\u0018\u00010\u0082\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u0019\u0010\u008c\u0001\u001a\u00020\t8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008d\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008e\u0001\u0010\u008f\u0001R8\u0010\u0098\u0001\u001a\u0011\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R\u0019\u0010\u009b\u0001\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0099\u0001\u0010\u009a\u0001R\u001c\u0010\u009f\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u009d\u0001\u0010\u009e\u0001R\u001b\u0010¢\u0001\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b \u0001\u0010¡\u0001R\u001b\u0010¥\u0001\u001a\u0004\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b£\u0001\u0010¤\u0001R$\u0010©\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b§\u0001\u0010¨\u0001R%\u0010\u00ad\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010ª\u0001\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R$\u0010¯\u0001\u001a\r\u0012\u0006\u0012\u0004\u0018\u00010%\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¨\u0001R%\u0010³\u0001\u001a\u000e\u0012\u0007\u0012\u0005\u0018\u00010°\u0001\u0018\u00010¦\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R,\u0010»\u0001\u001a\u0005\u0018\u00010´\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bµ\u0001\u0010¶\u0001\u001a\u0006\b·\u0001\u0010¸\u0001\"\u0006\b¹\u0001\u0010º\u0001R2\u0010Ã\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0000\u0018\u00010¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b½\u0001\u0010¾\u0001\u001a\u0006\b¿\u0001\u0010À\u0001\"\u0006\bÁ\u0001\u0010Â\u0001R\u001a\u0010Å\u0001\u001a\u0004\u0018\u00010\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÄ\u0001\u0010sR\u0019\u0010Ç\u0001\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÆ\u0001\u0010Æ\u0001R\u0016\u0010É\u0001\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÈ\u0001\u0010\u0011R\u0017\u0010Ì\u0001\u001a\u00020\u00138VX\u0096\u0004¢\u0006\b\u001a\u0006\bÊ\u0001\u0010Ë\u0001R'\u0010Ï\u0001\u001a\u00020c2\u0006\u0010k\u001a\u00020c8@@@X\u0080\u000e¢\u0006\u000e\u001a\u0005\bÍ\u0001\u0010g\"\u0005\bÎ\u0001\u0010iR)\u0010Ô\u0001\u001a\u00020\t2\u0006\u0010k\u001a\u00020\t8@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\bÐ\u0001\u0010Ñ\u0001\"\u0006\bÒ\u0001\u0010Ó\u0001R$\u0010Ö\u0001\u001a\u000f\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u0091\u00018@X\u0080\u0004¢\u0006\b\u001a\u0006\bÕ\u0001\u0010\u0095\u0001R\u0017\u0010Ø\u0001\u001a\u00020\b8VX\u0096\u0004¢\u0006\b\u001a\u0006\bµ\u0001\u0010×\u0001R)\u0010Û\u0001\u001a\u00028\u0000\"\u0005\b\u0000\u0010µ\u0001*\t\u0012\u0004\u0012\u00028\u00000Ù\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0001\u0010Ú\u0001¨\u0006Ü\u0001"}, d2 = {"Lm1/t;", "Lg4/j;", "Lg4/z;", "Lg4/q;", "Lg4/q1;", "Lg4/e;", "Lg4/v0;", "Lm2/a0;", "", "Lm1/w;", "styleState", "Lm1/g;", "style", "<init>", "(Lm1/w;Lm1/g;)V", "Lm1/d;", "C3", "()Lm1/d;", "D3", "", "k4", "(Lm1/d;)Z", "j4", "Ln3/a2;", "Loq/i0;", "m4", "(Ln3/a2;)V", "Lp3/c;", "Lm3/k;", "size", "Ln3/y2;", "shape", "Ln3/i2;", "Q3", "(Lp3/c;JLn3/y2;)Ln3/i2;", "", "index", "Ls3/g;", "shadow", "J3", "(Lp3/c;ILn3/y2;Ls3/g;)V", "E3", "T3", "()V", "S3", "flags", "base", "X3", "(ILm1/d;)Lm1/d;", "Le4/y0;", "Le4/v0;", "measurable", "Lc5/b;", CryptoServicesPermission.CONSTRAINTS, "Le4/x0;", "c", "(Le4/y0;Le4/v0;J)Le4/x0;", "y", "(Lp3/c;)V", "shadowOrArray", "W3", "(Ljava/lang/Object;Ln3/y2;)V", "resolved", "K3", "(Lp3/c;Lm1/d;)V", "V3", "F3", "hasBackground", "hasBorder", "hasForeground", "Landroidx/compose/ui/graphics/Color;", "bgColor", "Landroidx/compose/ui/graphics/c;", "bgBrush", "borderColor", "borderBrush", "foregroundColor", "foregroundBrush", "", "borderWidth", "G3", "(Lp3/c;Ln3/y2;ZZZJLandroidx/compose/ui/graphics/c;JLandroidx/compose/ui/graphics/c;JLandroidx/compose/ui/graphics/c;F)V", "initial", "b4", "(Z)V", "T0", "l4", "Ly1/o;", "phase", "Lq4/b4;", "fallback", "B3", "(ILq4/b4;)Lq4/b4;", "Z3", "(I)Lm1/d;", "N3", "e4", "(Lm1/d;)V", "X2", "Lm1/l;", "v", "Lm1/l;", "getInnerNodeField$foundation", "()Lm1/l;", "setInnerNodeField$foundation", "(Lm1/l;)V", "innerNodeField", "value", "w", "Lm1/g;", "getStyle$foundation", "()Lm1/g;", "i4", "(Lm1/g;)V", "x", "Lm1/d;", "_resolved", "_bufferOrNull", "Lm1/h;", "z", "Lm1/h;", "L3", "()Lm1/h;", "f4", "(Lm1/h;)V", "animations", "Lq3/c;", "A", "Lq3/c;", "borderLayer", "Lkotlin/Function0;", "B", "Ler/a;", "borderLayerProvider", "Lx0/f;", "C", "Lx0/f;", "borderLogic", ip.a.f96138c, "Lm1/w;", "_state", "Lb1/j;", "E", "Lb1/j;", "currentInteractionSource", "Lkotlin/Function1;", "F", "Ler/l;", "getLayerBlock$foundation", "()Ler/l;", "setLayerBlock$foundation", "(Ler/l;)V", "layerBlock", "G", "J", "lastSize", "Lc5/t;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Lc5/t;", "lastLayoutDirection", "I", "Ln3/y2;", "lastShape", "K", "Ln3/i2;", "lastOutline", "", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "[Ls3/g;", "lastInnerShadow", "Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "O", "[Landroidx/compose/ui/graphics/shadow/InnerShadowPainter;", "cachedInnerShadowPainters", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "lastDropShadow", "Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "R", "[Landroidx/compose/ui/graphics/shadow/DropShadowPainter;", "cachedDropShadowPainters", "Lju/d2;", "T", "Lju/d2;", "getSourceJob", "()Lju/d2;", "setSourceJob", "(Lju/d2;)V", "sourceJob", "Lr0/q0;", "X", "Lr0/q0;", "getAncestorNodes$foundation", "()Lr0/q0;", "setAncestorNodes$foundation", "(Lr0/q0;)V", "ancestorNodes", "Y", "cachedInheritedStyle", "Z", "inheritedStyleDirty", "M3", "bufferNonNull", "R2", "()Z", "shouldAutoInvalidate", "O3", "g4", "innerNode", "R3", "()Lm1/w;", "h4", "(Lm1/w;)V", "state", "P3", "layerBlockNonNull", "()Ljava/lang/Object;", "traverseKey", "Lm2/z;", "(Lm2/z;)Ljava/lang/Object;", "currentValue", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class t extends g4.j implements g4.z, g4.q, q1, g4.e, v0, a0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private q3.c borderLayer;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private er.a<q3.c> borderLayerProvider;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private w _state;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private b1.j currentInteractionSource;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private er.l<? super a2, i0> layerBlock;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long lastSize;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private c5.t lastLayoutDirection;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private y2 lastShape;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private i2 lastOutline;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private Shadow[] lastInnerShadow;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private InnerShadowPainter[] cachedInnerShadowPainters;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private Shadow[] lastDropShadow;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private DropShadowPainter[] cachedDropShadowPainters;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private d2 sourceJob;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private q0<t> ancestorNodes;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private d cachedInheritedStyle;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private boolean inheritedStyleDirty;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private l innerNodeField;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private g style;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private d _bufferOrNull;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private h animations;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private d _resolved = new d();

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final x0.f borderLogic = new x0.f();

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f122443e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ b1.j f122445g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(b1.j jVar, tq.e<? super a> eVar) {
            super(2, eVar);
            this.f122445g = jVar;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f122443e;
            if (i15 == 0) {
                oq.u.b(obj);
                w wVar = t.this._state;
                b1.j jVar = this.f122445g;
                this.f122443e = 1;
                if (wVar.c(jVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((a) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return t.this.new a(this.f122445g, eVar);
        }
    }

    public t(w wVar, g gVar) {
        this.style = gVar;
        this._state = wVar == null ? new c(null) : wVar;
        this.lastSize = m3.k.INSTANCE.a();
    }

    private final d C3() {
        return Y3(this, 4, null, 2, null);
    }

    private final d D3() {
        return Y3(this, 8, null, 2, null);
    }

    private final void E3(p3.c cVar, int i15, y2 y2Var, Shadow shadow) {
        Shadow[] shadowArr = this.lastDropShadow;
        Shadow shadow2 = shadowArr != null ? (Shadow) pq.n.y0(shadowArr, i15) : null;
        DropShadowPainter[] dropShadowPainterArr = this.cachedDropShadowPainters;
        DropShadowPainter dropShadowPainterD = dropShadowPainterArr != null ? (DropShadowPainter) pq.n.y0(dropShadowPainterArr, i15) : null;
        if (!fr.t.c(shadow2, shadow) || dropShadowPainterD == null) {
            dropShadowPainterD = g4.h.p(this).b().d(y2Var, shadow);
        }
        DropShadowPainter dropShadowPainter = dropShadowPainterD;
        Shadow[] shadowArr2 = this.lastDropShadow;
        if (shadowArr2 != null) {
            shadowArr2[i15] = shadow;
        }
        DropShadowPainter[] dropShadowPainterArr2 = this.cachedDropShadowPainters;
        if (dropShadowPainterArr2 != null) {
            dropShadowPainterArr2[i15] = dropShadowPainter;
        }
        androidx.compose.ui.graphics.painter.a.k(dropShadowPainter, cVar, cVar.a(), 0.0f, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float H3(float f15) {
        return f15;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q3.c I3(t tVar) {
        q3.c cVar = tVar.borderLayer;
        if (cVar != null) {
            return cVar;
        }
        q3.c cVarC = g4.h.p(tVar).c();
        tVar.borderLayer = cVarC;
        return cVarC;
    }

    private final void J3(p3.c cVar, int i15, y2 y2Var, Shadow shadow) {
        Shadow[] shadowArr = this.lastInnerShadow;
        Shadow shadow2 = shadowArr != null ? (Shadow) pq.n.y0(shadowArr, i15) : null;
        InnerShadowPainter[] innerShadowPainterArr = this.cachedInnerShadowPainters;
        InnerShadowPainter innerShadowPainterE = innerShadowPainterArr != null ? (InnerShadowPainter) pq.n.y0(innerShadowPainterArr, i15) : null;
        if (!fr.t.c(shadow2, shadow) || innerShadowPainterE == null) {
            innerShadowPainterE = g4.h.p(this).b().e(y2Var, shadow);
        }
        InnerShadowPainter innerShadowPainter = innerShadowPainterE;
        Shadow[] shadowArr2 = this.lastInnerShadow;
        if (shadowArr2 != null) {
            shadowArr2[i15] = shadow;
        }
        InnerShadowPainter[] innerShadowPainterArr2 = this.cachedInnerShadowPainters;
        if (innerShadowPainterArr2 != null) {
            innerShadowPainterArr2[i15] = innerShadowPainter;
        }
        androidx.compose.ui.graphics.painter.a.k(innerShadowPainter, cVar, cVar.a(), 0.0f, null, 6, null);
    }

    private final d M3() {
        if (this._bufferOrNull == null) {
            this._bufferOrNull = new d();
        }
        return this._bufferOrNull;
    }

    private final i2 Q3(p3.c cVar, long j15, y2 y2Var) {
        i2 i2VarA = (m3.k.f(this.lastSize, j15) && this.lastLayoutDirection == cVar.getLayoutDirection() && fr.t.c(this.lastShape, y2Var)) ? this.lastOutline : y2Var.a(j15, cVar.getLayoutDirection(), cVar);
        this.lastOutline = i2VarA;
        this.lastSize = j15;
        this.lastLayoutDirection = cVar.getLayoutDirection();
        return i2VarA;
    }

    private final void S3() {
        this.inheritedStyleDirty = true;
        g4.h.i(this);
    }

    private final void T3() {
        this.inheritedStyleDirty = true;
        g4.h.j(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 U3(t tVar, long j15, p036e4.a2 a2Var, float f15, float f16, float f17, float f18, e4.a2.a aVar) {
        d dVarD3 = tVar.D3();
        int iL = tVar.k4(dVarD3) ? (c5.b.l(j15) - a2Var.getWidth()) - Math.round(f15) : Math.round(f16);
        int iK = tVar.j4(dVarD3) ? (c5.b.k(j15) - a2Var.getHeight()) - Math.round(f17) : Math.round(f18);
        if ((dVarD3.flags & 4) != 0) {
            e4.a2.a.d0(aVar, a2Var, iL, iK, 0.0f, tVar.P3(), 4, null);
        } else {
            e4.a2.a.E(aVar, a2Var, iL, iK, 0.0f, 4, null);
        }
        return i0.f148189a;
    }

    public static /* synthetic */ d Y3(t tVar, int i15, d dVar, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            dVar = tVar._resolved;
        }
        return tVar.X3(i15, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, r0.q0, r0.q0<m1.t>] */
    public static final boolean a4(fr.p0 p0Var, t tVar, q1 q1Var) {
        h hVar;
        if (!(q1Var instanceof t)) {
            return true;
        }
        t tVar2 = (t) q1Var;
        if ((tVar2._resolved.flags & 96) != 0 || ((hVar = tVar2.animations) != null && hVar.f())) {
            q0 q0Var = (q0) p0Var.f66410a;
            q0 q0Var2 = q0Var;
            if (q0Var == null) {
                ?? q0Var3 = new q0(0, 1, null);
                p0Var.f66410a = q0Var3;
                tVar.ancestorNodes = q0Var3;
                q0Var2 = q0Var3;
            }
            q0Var2.n(q1Var);
        }
        return true;
    }

    public static /* synthetic */ void c4(t tVar, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = false;
        }
        tVar.b4(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 d4(d dVar, t tVar, c5.d dVar2, d dVar3, n0 n0Var, boolean z15) {
        dVar.p2(tVar.style, tVar, dVar2, false);
        tVar._resolved = dVar;
        tVar._bufferOrNull = dVar3;
        h hVar = tVar.animations;
        n0Var.f66407a = hVar != null ? hVar.g(tVar, dVar2, !z15) : 0;
        return i0.f148189a;
    }

    private final boolean j4(d dVar) {
        return !Float.isNaN(dVar.getBottom()) && Float.isNaN(dVar.getTop());
    }

    private final boolean k4(d dVar) {
        return !Float.isNaN(dVar.getRight()) && Float.isNaN(dVar.getLeft());
    }

    private final void m4(a2 a2Var) {
        d dVarC3 = C3();
        a2Var.g(dVarC3.getAlpha());
        a2Var.s(dVarC3.getScaleX());
        a2Var.D(dVarC3.getScaleY());
        a2Var.N(dVarC3.getTranslationX());
        a2Var.j(dVarC3.getTranslationY());
        a2Var.x(dVarC3.getRotationX());
        a2Var.z(dVarC3.getRotationY());
        a2Var.C(dVarC3.getRotationZ());
        a2Var.Y0(dVarC3.getTransformOrigin());
        a2Var.u(dVarC3.getClip());
        a2Var.k0(dVarC3.getShape());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 z3(t tVar, a2 a2Var) {
        tVar.m4(a2Var);
        return i0.f148189a;
    }

    public TextStyle B3(int phase, TextStyle fallback) {
        TextStyle textStyleY3;
        d dVarZ3 = Z3(m.c(phase));
        return (dVarZ3 == null || (textStyleY3 = dVarZ3.y3(fallback)) == null) ? fallback : textStyleY3;
    }

    @Override // p076m2.a0
    public <T> T F(p076m2.z<T> zVar) {
        return (T) g4.f.a(this, zVar);
    }

    public final void F3(p3.c cVar, d dVar) {
        Object dropShadow = dVar.getDropShadow();
        if (dropShadow == null) {
            return;
        }
        y2 shape = dVar.getShape();
        V3(dropShadow, shape);
        if (!(dropShadow instanceof Object[])) {
            if (dropShadow instanceof Shadow) {
                E3(cVar, 0, shape, (Shadow) dropShadow);
                return;
            }
            return;
        }
        Object[] objArr = (Object[]) dropShadow;
        int length = objArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            Object obj = objArr[i15];
            if (obj instanceof Shadow) {
                E3(cVar, i15, shape, (Shadow) obj);
            }
        }
    }

    public final void G3(p3.c cVar, y2 y2Var, boolean z15, boolean z16, boolean z17, long j15, androidx.compose.ui.graphics.c cVar2, long j16, androidx.compose.ui.graphics.c cVar3, long j17, androidx.compose.ui.graphics.c cVar4, final float f15) {
        i2 i2VarQ3 = Q3(cVar, cVar.a(), y2Var);
        if (z15) {
            if (cVar2 != null) {
                j2.c(cVar, i2VarQ3, cVar2, 0.0f, null, null, 0, 60, null);
            } else {
                j2.e(cVar, i2VarQ3, j15, 0.0f, null, null, 0, 60, null);
            }
        }
        cVar.H2();
        if (z17) {
            if (cVar4 != null) {
                j2.c(cVar, i2VarQ3, cVar4, 0.0f, null, null, 0, 60, null);
            } else {
                j2.e(cVar, i2VarQ3, j17, 0.0f, null, null, 0, 60, null);
            }
        }
        if (z16) {
            androidx.compose.ui.graphics.c solidColor = cVar3 == null ? new SolidColor(j16, null) : cVar3;
            x0.f fVar = this.borderLogic;
            er.a aVar = new er.a() { // from class: m1.n
                @Override // er.a
                public final Object a() {
                    return Float.valueOf(t.H3(f15));
                }
            };
            er.a<q3.c> aVar2 = this.borderLayerProvider;
            if (aVar2 == null) {
                aVar2 = new er.a() { // from class: m1.o
                    @Override // er.a
                    public final Object a() {
                        return t.I3(this.f122421a);
                    }
                };
                this.borderLayerProvider = aVar2;
                i0 i0Var = i0.f148189a;
            }
            fVar.n(cVar, aVar, solidColor, aVar2, i2VarQ3, (32 & 32) != 0 ? m3.e.INSTANCE.c() : 0L);
        }
    }

    public final void K3(p3.c cVar, d dVar) {
        Object innerShadow = dVar.getInnerShadow();
        if (innerShadow == null) {
            return;
        }
        y2 shape = dVar.getShape();
        W3(innerShadow, shape);
        if (!(innerShadow instanceof Object[])) {
            if (innerShadow instanceof Shadow) {
                J3(cVar, 0, shape, (Shadow) innerShadow);
                return;
            }
            return;
        }
        Object[] objArr = (Object[]) innerShadow;
        int length = objArr.length;
        for (int i15 = 0; i15 < length; i15++) {
            Object obj = objArr[i15];
            if (obj instanceof Shadow) {
                J3(cVar, i15, shape, (Shadow) obj);
            }
        }
    }

    /* JADX INFO: renamed from: L3, reason: from getter */
    public final h getAnimations() {
        return this.animations;
    }

    public final d N3() {
        if (this.inheritedStyleDirty) {
            return null;
        }
        return this.cachedInheritedStyle;
    }

    public final l O3() {
        l lVar = this.innerNodeField;
        if (lVar != null) {
            return lVar;
        }
        throw new IllegalStateException("StyleOuterNode with no corresponding StyleInnerNode");
    }

    public final er.l<a2, i0> P3() {
        er.l lVar = this.layerBlock;
        if (lVar != null) {
            return lVar;
        }
        er.l<a2, i0> lVar2 = new er.l() { // from class: m1.s
            @Override // er.l
            public final Object b(Object obj) {
                return t.z3(this.f122437a, (a2) obj);
            }
        };
        this.layerBlock = lVar2;
        return lVar2;
    }

    @Override // f3.m.c
    /* JADX INFO: renamed from: R2 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    /* JADX INFO: renamed from: R3, reason: from getter */
    public final w get_state() {
        return this._state;
    }

    @Override // g4.q1
    /* JADX INFO: renamed from: T */
    public Object getTraverseKey() {
        return "StyleOuterNode";
    }

    @Override // g4.v0
    public void T0() {
        c4(this, false, 1, null);
    }

    public final void V3(Object shadowOrArray, y2 shape) {
        DropShadowPainter[] dropShadowPainterArr;
        Shadow[] shadowArr = this.lastDropShadow;
        DropShadowPainter[] dropShadowPainterArr2 = this.cachedDropShadowPainters;
        int length = shadowOrArray instanceof Object[] ? ((Object[]) shadowOrArray).length : 1;
        int i15 = 0;
        if (shadowArr != null && fr.t.c(this.lastShape, shape)) {
            if (shadowArr.length != length) {
                this.lastDropShadow = (Shadow[]) Arrays.copyOf(shadowArr, length);
                if (dropShadowPainterArr2 == null || (dropShadowPainterArr = (DropShadowPainter[]) Arrays.copyOf(dropShadowPainterArr2, length)) == null) {
                    dropShadowPainterArr = new DropShadowPainter[length];
                    while (i15 < length) {
                        dropShadowPainterArr[i15] = null;
                        i15++;
                    }
                }
                this.cachedDropShadowPainters = dropShadowPainterArr;
                return;
            }
            return;
        }
        Shadow[] shadowArr2 = new Shadow[length];
        for (int i16 = 0; i16 < length; i16++) {
            shadowArr2[i16] = null;
        }
        this.lastDropShadow = shadowArr2;
        DropShadowPainter[] dropShadowPainterArr3 = new DropShadowPainter[length];
        while (i15 < length) {
            dropShadowPainterArr3[i15] = null;
            i15++;
        }
        this.cachedDropShadowPainters = dropShadowPainterArr3;
    }

    public final void W3(Object shadowOrArray, y2 shape) {
        InnerShadowPainter[] innerShadowPainterArr;
        Shadow[] shadowArr = this.lastInnerShadow;
        InnerShadowPainter[] innerShadowPainterArr2 = this.cachedInnerShadowPainters;
        int length = shadowOrArray instanceof Object[] ? ((Object[]) shadowOrArray).length : 1;
        int i15 = 0;
        if (shadowArr != null && fr.t.c(this.lastShape, shape)) {
            if (shadowArr.length != length) {
                this.lastInnerShadow = (Shadow[]) Arrays.copyOf(shadowArr, length);
                if (innerShadowPainterArr2 == null || (innerShadowPainterArr = (InnerShadowPainter[]) Arrays.copyOf(innerShadowPainterArr2, length)) == null) {
                    innerShadowPainterArr = new InnerShadowPainter[length];
                    while (i15 < length) {
                        innerShadowPainterArr[i15] = null;
                        i15++;
                    }
                }
                this.cachedInnerShadowPainters = innerShadowPainterArr;
                return;
            }
            return;
        }
        Shadow[] shadowArr2 = new Shadow[length];
        for (int i16 = 0; i16 < length; i16++) {
            shadowArr2[i16] = null;
        }
        this.lastInnerShadow = shadowArr2;
        InnerShadowPainter[] innerShadowPainterArr3 = new InnerShadowPainter[length];
        while (i15 < length) {
            innerShadowPainterArr3[i15] = null;
            i15++;
        }
        this.cachedInnerShadowPainters = innerShadowPainterArr3;
    }

    @Override // f3.m.c
    public void X2() {
        super.X2();
        q3.c cVar = this.borderLayer;
        if (cVar != null) {
            g4.h.p(this).a(cVar);
            this.borderLayer = null;
        }
        this.borderLayerProvider = null;
    }

    public final d X3(int flags, d base) {
        h hVar = this.animations;
        return (hVar == null || !hVar.f()) ? base : hVar.j(g4.h.o(this), base, this, flags);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x007d  */
    /* JADX WARN: Code duplicated, block: B:77:0x00fd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [T, r0.q0<m1.t>] */
    /* JADX WARN: Type inference failed for: r2v7, types: [T, r0.q0, r0.q0<m1.t>] */
    public final d Z3(int flags) {
        t tVar;
        t tVar2;
        h hVar;
        final fr.p0 p0Var = new fr.p0();
        p0Var.f66410a = this.ancestorNodes;
        if ((this._resolved.flags & 96) != 0 || ((hVar = this.animations) != null && hVar.f())) {
            q0 q0Var = (q0) p0Var.f66410a;
            q0 q0Var2 = q0Var;
            if (q0Var == null) {
                ?? q0Var3 = new q0(0, 1, null);
                p0Var.f66410a = q0Var3;
                this.ancestorNodes = q0Var3;
                q0Var2 = q0Var3;
            }
            q0Var2.n(this);
        }
        r1.c(this, "StyleOuterNode", new er.l() { // from class: m1.r
            @Override // er.l
            public final Object b(Object obj) {
                return Boolean.valueOf(t.a4(p0Var, this, (q1) obj));
            }
        });
        d dVarN3 = N3();
        int i15 = dVarN3 != null ? -1 : -2;
        h hVar2 = this.animations;
        boolean zF = hVar2 != null ? hVar2.f() : false;
        int i16 = this._resolved.flags & 96;
        q0 q0Var4 = (q0) p0Var.f66410a;
        if (q0Var4 != null) {
            Object[] objArr = q0Var4.content;
            int i17 = q0Var4._size;
            for (int i18 = 0; i18 < i17; i18++) {
                t tVar3 = (t) objArr[i18];
                d dVarN4 = tVar3.N3();
                if (zF) {
                    zF = true;
                } else {
                    h hVar3 = tVar3.animations;
                    if (hVar3 != null ? hVar3.f() : false) {
                        zF = true;
                    } else {
                        zF = false;
                    }
                }
                i16 |= tVar3._resolved.flags & 96;
                if (dVarN4 == null) {
                    dVarN3 = null;
                    i15 = -2;
                } else if (dVarN3 == null) {
                    i15 = i18;
                    dVarN3 = dVarN4;
                }
            }
        }
        if (i16 == 0) {
            return null;
        }
        if (dVarN3 != null && i15 < 0 && !zF) {
            return dVarN3;
        }
        T t15 = p0Var.f66410a;
        if (t15 != 0 && i15 < -1) {
            i15 = ((q0) t15).get_size() - 1;
        }
        while (-2 < i15) {
            if (i15 < 0) {
                tVar2 = this;
            } else {
                q0 q0Var5 = (q0) p0Var.f66410a;
                if (q0Var5 != null) {
                    tVar2 = (t) q0Var5.d(i15);
                }
                i15--;
            }
            d dVar = tVar2.cachedInheritedStyle;
            if (dVar == null) {
                dVar = new d();
            }
            if (dVarN3 != null) {
                dVarN3.n(dVar);
            }
            dVar.e(tVar2._resolved);
            tVar2.e4(dVar);
            dVarN3 = dVar;
            i15--;
        }
        if (!zF) {
            return dVarN3;
        }
        d dVar2 = new d();
        if (dVarN3 != null) {
            dVarN3.n(dVar2);
        }
        q0 q0Var6 = (q0) p0Var.f66410a;
        int i19 = q0Var6 != null ? q0Var6.get_size() : 0;
        c5.d dVarO = g4.h.o(this);
        for (int i25 = i19 - 1; -2 < i25; i25--) {
            if (i25 < 0) {
                tVar = this;
            } else {
                q0 q0Var7 = (q0) p0Var.f66410a;
                if (q0Var7 != null) {
                    tVar = (t) q0Var7.d(i25);
                }
            }
            h hVar4 = tVar.animations;
            if (hVar4 != null) {
                hVar4.b(dVar2, dVarO, tVar, flags);
            }
        }
        return dVar2;
    }

    public final void b4(final boolean initial) {
        if (getIsAttached()) {
            final d dVar = initial ? null : this._resolved;
            final d dVarM3 = initial ? this._resolved : M3();
            final c5.d dVarO = g4.h.o(this);
            dVarM3.k();
            h hVar = this.animations;
            if (hVar != null) {
                hVar.h();
            }
            final n0 n0Var = new n0();
            w0.a(this, new er.a() { // from class: m1.q
                @Override // er.a
                public final Object a() {
                    return t.d4(dVarM3, this, dVarO, dVar, n0Var, initial);
                }
            });
            int iE = n0Var.f66407a | (dVar != null ? d.E(dVar, dVarM3, 0, 2, null) : dVarM3.flags);
            if (!fr.t.c(this._state.getInteractionSource(), this.currentInteractionSource)) {
                l4();
            }
            if (initial) {
                return;
            }
            if ((iE & 1) != 0) {
                b0.b(O3());
            }
            if ((iE & 8) != 0) {
                b0.b(this);
            }
            if ((iE & 2) != 0) {
                b0.a(O3());
            }
            if ((iE & 4) != 0) {
                b0.e(this, P3());
            }
            if ((iE & 32) != 0) {
                T3();
            }
            if ((iE & 64) != 0) {
                S3();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:72:0x0113  */
    /* JADX WARN: Code duplicated, block: B:74:0x011d  */
    @Override // g4.z
    public x0 c(y0 y0Var, p036e4.v0 v0Var, final long j15) {
        d dVarD3 = D3();
        float externalPaddingStart = dVarD3.getExternalPaddingStart();
        float left = dVarD3.getLeft();
        if (!Float.isNaN(left)) {
            externalPaddingStart += left;
        }
        final float f15 = externalPaddingStart;
        float externalPaddingEnd = dVarD3.getExternalPaddingEnd();
        float right = dVarD3.getRight();
        if (!Float.isNaN(right)) {
            externalPaddingEnd += right;
        }
        final float f16 = externalPaddingEnd;
        float externalPaddingTop = dVarD3.getExternalPaddingTop();
        float top = dVarD3.getTop();
        if (!Float.isNaN(top)) {
            externalPaddingTop += top;
        }
        final float f17 = externalPaddingTop;
        float externalPaddingBottom = dVarD3.getExternalPaddingBottom();
        float bottom = dVarD3.getBottom();
        if (!Float.isNaN(bottom)) {
            externalPaddingBottom += bottom;
        }
        final float f18 = externalPaddingBottom;
        int iRound = Math.round(f15 + f16);
        int iRound2 = Math.round(f17 + f18);
        int iN = c5.b.n(j15) - iRound;
        if (iN < 0) {
            iN = 0;
        }
        int iL = c5.b.l(j15);
        if (iL != Integer.MAX_VALUE && (iL = iL + iRound) < 0) {
            iL = 0;
        }
        int iM = c5.b.m(j15) - iRound2;
        if (iM < 0) {
            iM = 0;
        }
        int iK = c5.b.k(j15);
        int iRound3 = (iK == Integer.MAX_VALUE || (iK = iK + iRound2) >= 0) ? iK : 0;
        float minWidth = dVarD3.getMinWidth();
        if (!Float.isNaN(minWidth)) {
            iN = Math.round(minWidth);
        }
        float maxWidth = dVarD3.getMaxWidth();
        if (!Float.isNaN(maxWidth)) {
            iL = Math.round(maxWidth);
        }
        float minHeight = dVarD3.getMinHeight();
        if (!Float.isNaN(minHeight)) {
            iM = Math.round(minHeight);
        }
        float maxHeight = dVarD3.getMaxHeight();
        if (!Float.isNaN(maxHeight)) {
            iRound3 = Math.round(maxHeight);
        }
        if (Float.isNaN(dVarD3.getWidth())) {
            if (!Float.isNaN(dVarD3.getWidthFraction()) && c5.b.h(j15)) {
                int iRound4 = Math.round(iL * dVarD3.getWidthFraction());
                if (iRound4 >= iN) {
                    iN = iRound4;
                }
                if (iN > iL) {
                    iN = iL;
                }
            } else if (!Float.isNaN(dVarD3.getLeft()) && !Float.isNaN(dVarD3.getRight())) {
                iN = iL;
            }
            if (!Float.isNaN(dVarD3.getHeight())) {
                if (Float.isNaN(dVarD3.getHeightFraction()) && c5.b.g(j15)) {
                    int iRound5 = Math.round(iRound3 * dVarD3.getHeightFraction());
                    if (iRound5 >= iM) {
                        iM = iRound5;
                    }
                    if (iM > iRound3) {
                        iM = iRound3;
                    }
                } else if (!Float.isNaN(dVarD3.getTop()) && !Float.isNaN(dVarD3.getBottom())) {
                    iM = iRound3;
                }
                final p036e4.a2 a2VarO0 = v0Var.o0(c5.c.a(iN, iL, iM, iRound3));
                return y0.j2(y0Var, a2VarO0.getWidth() + iRound, a2VarO0.getHeight() + iRound2, null, new er.l() { // from class: m1.p
                    @Override // er.l
                    public final Object b(Object obj) {
                        return t.U3(this.f122422a, j15, a2VarO0, f16, f15, f18, f17, (e4.a2.a) obj);
                    }
                }, 4, null);
            }
            iM = Math.round(dVarD3.getHeight());
            iRound3 = iM;
            final p036e4.a2 a2VarO1 = v0Var.o0(c5.c.a(iN, iL, iM, iRound3));
            return y0.j2(y0Var, a2VarO1.getWidth() + iRound, a2VarO1.getHeight() + iRound2, null, new er.l() { // from class: m1.p
                @Override // er.l
                public final Object b(Object obj) {
                    return t.U3(this.f122422a, j15, a2VarO1, f16, f15, f18, f17, (e4.a2.a) obj);
                }
            }, 4, null);
        }
        iN = Math.round(dVarD3.getWidth());
        iL = iN;
        if (!Float.isNaN(dVarD3.getHeight())) {
            if (Float.isNaN(dVarD3.getHeightFraction())) {
            }
            if (!Float.isNaN(dVarD3.getTop())) {
                iM = iRound3;
            }
            final p036e4.a2 a2VarO2 = v0Var.o0(c5.c.a(iN, iL, iM, iRound3));
            return y0.j2(y0Var, a2VarO2.getWidth() + iRound, a2VarO2.getHeight() + iRound2, null, new er.l() { // from class: m1.p
                @Override // er.l
                public final Object b(Object obj) {
                    return t.U3(this.f122422a, j15, a2VarO2, f16, f15, f18, f17, (e4.a2.a) obj);
                }
            }, 4, null);
        }
        iM = Math.round(dVarD3.getHeight());
        iRound3 = iM;
        final p036e4.a2 a2VarO3 = v0Var.o0(c5.c.a(iN, iL, iM, iRound3));
        return y0.j2(y0Var, a2VarO3.getWidth() + iRound, a2VarO3.getHeight() + iRound2, null, new er.l() { // from class: m1.p
            @Override // er.l
            public final Object b(Object obj) {
                return t.U3(this.f122422a, j15, a2VarO3, f16, f15, f18, f17, (e4.a2.a) obj);
            }
        }, 4, null);
    }

    public final void e4(d style) {
        this.inheritedStyleDirty = false;
        this.cachedInheritedStyle = style;
    }

    public final void f4(h hVar) {
        this.animations = hVar;
    }

    public final void g4(l lVar) {
        this.innerNodeField = lVar;
    }

    public final void h4(w wVar) {
        if (fr.t.c(this._state, wVar)) {
            return;
        }
        this._state = wVar;
        c4(this, false, 1, null);
        b0.a(O3());
    }

    public final void i4(g gVar) {
        this.style = gVar;
        c4(this, false, 1, null);
    }

    public final void l4() {
        d2 d2Var = this.sourceJob;
        if (d2Var != null) {
            d2.a.a(d2Var, null, 1, null);
        }
        b1.j interactionSource = this._state.getInteractionSource();
        this.currentInteractionSource = interactionSource;
        if (interactionSource != null) {
            this.sourceJob = ju.k.d(M2(), null, null, new a(interactionSource, null), 3, null);
        }
    }

    @Override // g4.q
    public void y(p3.c cVar) {
        d dVarY3 = Y3(this, 2, null, 2, null);
        long backgroundColor = dVarY3.getBackgroundColor();
        androidx.compose.ui.graphics.c backgroundBrush = dVarY3.getBackgroundBrush();
        long foregroundColor = dVarY3.getForegroundColor();
        androidx.compose.ui.graphics.c foregroundBrush = dVarY3.getForegroundBrush();
        long borderColor = dVarY3.getBorderColor();
        androidx.compose.ui.graphics.c borderBrush = dVarY3.getBorderBrush();
        float borderWidth = dVarY3.getBorderWidth();
        float f15 = borderWidth / 2.0f;
        y2 shape = dVarY3.getShape();
        boolean z15 = f15 > 0.0f;
        boolean z16 = (backgroundColor == 16 && backgroundBrush == null) ? false : true;
        boolean z17 = (foregroundColor == 16 && foregroundBrush == null) ? false : true;
        F3(cVar, dVarY3);
        G3(cVar, shape, z16, z15, z17, backgroundColor, backgroundBrush, borderColor, borderBrush, foregroundColor, foregroundBrush, borderWidth);
        K3(cVar, dVarY3);
        this.lastShape = shape;
    }
}
