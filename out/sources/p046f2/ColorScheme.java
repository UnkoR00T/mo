package p046f2;

import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import ip.a;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;

/* JADX INFO: renamed from: f2.e2, reason: from toString */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b4\n\u0002\u0010\u000e\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0087\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002¢\u0006\u0004\b3\u00104Jí\u0003\u00105\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\b\b\u0002\u0010\r\u001a\u00020\u00022\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00022\b\b\u0002\u00101\u001a\u00020\u00022\b\b\u0002\u00102\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u000f\u00108\u001a\u000207H\u0016¢\u0006\u0004\b8\u00109R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b;\u0010<R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010:\u001a\u0004\b>\u0010<R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010:\u001a\u0004\b@\u0010<R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010:\u001a\u0004\bB\u0010<R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010:\u001a\u0004\bD\u0010<R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010:\u001a\u0004\bF\u0010<R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bG\u0010:\u001a\u0004\bH\u0010<R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bI\u0010:\u001a\u0004\bJ\u0010<R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bK\u0010:\u001a\u0004\bL\u0010<R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bM\u0010:\u001a\u0004\bN\u0010<R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bO\u0010:\u001a\u0004\bP\u0010<R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bQ\u0010:\u001a\u0004\bR\u0010<R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bS\u0010:\u001a\u0004\b:\u0010<R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010:\u001a\u0004\b?\u0010<R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bU\u0010:\u001a\u0004\bV\u0010<R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bW\u0010:\u001a\u0004\bX\u0010<R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010:\u001a\u0004\bZ\u0010<R\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b[\u0010:\u001a\u0004\b\\\u0010<R\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010:\u001a\u0004\b^\u0010<R\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010:\u001a\u0004\b_\u0010<R\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010:\u001a\u0004\b`\u0010<R\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010:\u001a\u0004\b]\u0010<R\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\ba\u0010:\u001a\u0004\bY\u0010<R\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010:\u001a\u0004\ba\u0010<R\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010:\u001a\u0004\b[\u0010<R\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010:\u001a\u0004\bb\u0010<R\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bc\u0010:\u001a\u0004\bd\u0010<R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\be\u0010:\u001a\u0004\bf\u0010<R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bH\u0010:\u001a\u0004\bg\u0010<R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bL\u0010:\u001a\u0004\bh\u0010<R\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bi\u0010:\u001a\u0004\bj\u0010<R\u0017\u0010\"\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bk\u0010:\u001a\u0004\bl\u0010<R\u0017\u0010#\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bZ\u0010:\u001a\u0004\bm\u0010<R\u0017\u0010$\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b^\u0010:\u001a\u0004\bn\u0010<R\u0017\u0010%\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bP\u0010:\u001a\u0004\bo\u0010<R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b:\u0010:\u001a\u0004\bp\u0010<R\u0017\u0010'\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bq\u0010:\u001a\u0004\br\u0010<R\u0017\u0010(\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bs\u0010:\u001a\u0004\bt\u0010<R\u0017\u0010)\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010:\u001a\u0004\bc\u0010<R\u0017\u0010*\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010:\u001a\u0004\be\u0010<R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010:\u001a\u0004\bu\u0010<R\u0017\u0010,\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b@\u0010:\u001a\u0004\bv\u0010<R\u0017\u0010-\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010:\u001a\u0004\bi\u0010<R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bt\u0010:\u001a\u0004\bk\u0010<R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bg\u0010:\u001a\u0004\bw\u0010<R\u0017\u00100\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010:\u001a\u0004\bx\u0010<R\u0017\u00101\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bJ\u0010:\u001a\u0004\bq\u0010<R\u0017\u00102\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bu\u0010:\u001a\u0004\bs\u0010<R$\u0010~\u001a\u0004\u0018\u00010y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010z\u001a\u0004\bA\u0010{\"\u0004\b|\u0010}R%\u0010\u0080\u0001\u001a\u0004\u0018\u00010y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bX\u0010z\u001a\u0004\bS\u0010{\"\u0004\b\u007f\u0010}R*\u0010\u0086\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bh\u0010\u0082\u0001\u001a\u0005\bC\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R2\u0010\u008e\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bl\u0010\u0088\u0001\u0012\u0006\b\u008c\u0001\u0010\u008d\u0001\u001a\u0005\bW\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R2\u0010\u0095\u0001\u001a\u0005\u0018\u00010\u008f\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bm\u0010\u0090\u0001\u0012\u0006\b\u0094\u0001\u0010\u008d\u0001\u001a\u0005\bE\u0010\u0091\u0001\"\u0006\b\u0092\u0001\u0010\u0093\u0001R*\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0096\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bn\u0010\u0097\u0001\u001a\u0005\bG\u0010\u0098\u0001\"\u0006\b\u0099\u0001\u0010\u009a\u0001R*\u0010¡\u0001\u001a\u0005\u0018\u00010\u009c\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bo\u0010\u009d\u0001\u001a\u0005\bI\u0010\u009e\u0001\"\u0006\b\u009f\u0001\u0010 \u0001R*\u0010§\u0001\u001a\u0005\u0018\u00010¢\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bp\u0010£\u0001\u001a\u0005\bM\u0010¤\u0001\"\u0006\b¥\u0001\u0010¦\u0001R*\u0010\u00ad\u0001\u001a\u0005\u0018\u00010¨\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bj\u0010©\u0001\u001a\u0005\bO\u0010ª\u0001\"\u0006\b«\u0001\u0010¬\u0001R*\u0010³\u0001\u001a\u0005\u0018\u00010®\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b_\u0010¯\u0001\u001a\u0005\bQ\u0010°\u0001\"\u0006\b±\u0001\u0010²\u0001R*\u0010¹\u0001\u001a\u0005\u0018\u00010´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\\\u0010µ\u0001\u001a\u0005\bK\u0010¶\u0001\"\u0006\b·\u0001\u0010¸\u0001R*\u0010»\u0001\u001a\u0005\u0018\u00010´\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bN\u0010µ\u0001\u001a\u0005\bT\u0010¶\u0001\"\u0006\bº\u0001\u0010¸\u0001R2\u0010Â\u0001\u001a\u0005\u0018\u00010¼\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u001e\n\u0005\bR\u0010½\u0001\u0012\u0006\bÁ\u0001\u0010\u008d\u0001\u001a\u0005\bU\u0010¾\u0001\"\u0006\b¿\u0001\u0010À\u0001¨\u0006Ã\u0001"}, d2 = {"Lf2/e2;", "", "Landroidx/compose/ui/graphics/Color;", "primary", "onPrimary", "primaryContainer", "onPrimaryContainer", "inversePrimary", "secondary", "onSecondary", "secondaryContainer", "onSecondaryContainer", "tertiary", "onTertiary", "tertiaryContainer", "onTertiaryContainer", "background", "onBackground", "surface", "onSurface", "surfaceVariant", "onSurfaceVariant", "surfaceTint", "inverseSurface", "inverseOnSurface", "error", "onError", "errorContainer", "onErrorContainer", "outline", "outlineVariant", "scrim", "surfaceBright", "surfaceDim", "surfaceContainer", "surfaceContainerHigh", "surfaceContainerHighest", "surfaceContainerLow", "surfaceContainerLowest", "primaryFixed", "primaryFixedDim", "onPrimaryFixed", "onPrimaryFixedVariant", "secondaryFixed", "secondaryFixedDim", "onSecondaryFixed", "onSecondaryFixedVariant", "tertiaryFixed", "tertiaryFixedDim", "onTertiaryFixed", "onTertiaryFixedVariant", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLfr/k;)V", "a", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lf2/e2;", "", "toString", "()Ljava/lang/String;", "J", "O", "()J", "b", "y", "c", i.f37086m, "d", "z", "e", "t", "f", "T", "g", "C", "h", "U", "i", a.f96138c, "j", "h0", "k", "I", "l", "i0", "m", "n", "o", "v", "p", "X", "q", "G", "r", "g0", "s", i.f37087n, "f0", "u", "w", "x", "A", "M", "B", "N", a.f96137b, "Y", "E", "e0", "F", "Z", "a0", "b0", "c0", "d0", "K", "Q", i.f37094u, "R", "V", "W", "j0", "k0", "Lf2/m1;", "Lf2/m1;", "()Lf2/m1;", "l0", "(Lf2/m1;)V", "defaultButtonColorsCached", "u0", "defaultTextButtonColorsCached", "Lf2/x1;", "Lf2/x1;", "()Lf2/x1;", "m0", "(Lf2/x1;)V", "defaultCardColorsCached", "Lf2/nr;", "Lf2/nr;", "()Lf2/nr;", "x0", "(Lf2/nr;)V", "getDefaultTopAppBarColorsCached$material3$annotations", "()V", "defaultTopAppBarColorsCached", "Lf2/w4;", "Lf2/w4;", "()Lf2/w4;", "n0", "(Lf2/w4;)V", "getDefaultDatePickerColorsCached$material3$annotations", "defaultDatePickerColorsCached", "Lf2/sc;", "Lf2/sc;", "()Lf2/sc;", "o0", "(Lf2/sc;)V", "defaultIconButtonColorsCached", "Lf2/ae;", "Lf2/ae;", "()Lf2/ae;", "p0", "(Lf2/ae;)V", "defaultMenuItemColorsCached", "Lf2/kh;", "Lf2/kh;", "()Lf2/kh;", "r0", "(Lf2/kh;)V", "defaultRadioButtonColorsCached", "Lf2/mj;", "Lf2/mj;", "()Lf2/mj;", "s0", "(Lf2/mj;)V", "defaultSliderColorsCached", "Lf2/dm;", "Lf2/dm;", "()Lf2/dm;", "t0", "(Lf2/dm;)V", "defaultSwitchColorsCached", "Lf2/hn;", "Lf2/hn;", "()Lf2/hn;", "q0", "(Lf2/hn;)V", "defaultOutlinedTextFieldColorsCached", "v0", "defaultTextFieldColorsCached", "Lf2/vo;", "Lf2/vo;", "()Lf2/vo;", "w0", "(Lf2/vo;)V", "getDefaultTimePickerColorsCached$material3$annotations", "defaultTimePickerColorsCached", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ColorScheme {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata and from toString */
    private final long outline;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata and from toString */
    private final long outlineVariant;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata and from toString */
    private final long scrim;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata and from toString */
    private final long surfaceBright;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata and from toString */
    private final long surfaceDim;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata and from toString */
    private final long surfaceContainer;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata and from toString */
    private final long surfaceContainerHigh;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata and from toString */
    private final long surfaceContainerHighest;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata and from toString */
    private final long surfaceContainerLow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata and from toString */
    private final long surfaceContainerLowest;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata and from toString */
    private final long primaryFixed;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata and from toString */
    private final long primaryFixedDim;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long onPrimaryFixed;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata and from toString */
    private final long onPrimaryFixedVariant;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata and from toString */
    private final long secondaryFixed;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata and from toString */
    private final long secondaryFixedDim;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata and from toString */
    private final long onSecondaryFixed;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata and from toString */
    private final long onSecondaryFixedVariant;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata and from toString */
    private final long tertiaryFixed;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata and from toString */
    private final long tertiaryFixedDim;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata and from toString */
    private final long onTertiaryFixed;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata and from toString */
    private final long onTertiaryFixedVariant;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private m1 defaultButtonColorsCached;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private m1 defaultTextButtonColorsCached;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private x1 defaultCardColorsCached;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private nr defaultTopAppBarColorsCached;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primary;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private w4 defaultDatePickerColorsCached;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onPrimary;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private sc defaultIconButtonColorsCached;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long primaryContainer;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private ae defaultMenuItemColorsCached;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata and from toString and from toString */
    private final long onPrimaryFixed;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private kh defaultRadioButtonColorsCached;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inversePrimary;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private mj defaultSliderColorsCached;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondary;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private dm defaultSwitchColorsCached;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSecondary;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private hn defaultOutlinedTextFieldColorsCached;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final long secondaryContainer;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private hn defaultTextFieldColorsCached;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSecondaryContainer;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private vo defaultTimePickerColorsCached;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tertiary;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onTertiary;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final long tertiaryContainer;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onTertiaryContainer;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata and from toString */
    private final long background;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onBackground;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surface;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurface;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceVariant;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onSurfaceVariant;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata and from toString */
    private final long surfaceTint;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseSurface;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata and from toString */
    private final long inverseOnSurface;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata and from toString */
    private final long error;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onError;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata and from toString */
    private final long errorContainer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata and from toString */
    private final long onErrorContainer;

    public /* synthetic */ ColorScheme(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38, j39, j45, j46, j47, j48, j49, j55, j56, j57, j58, j59, j65, j66, j67, j68, j69, j75, j76, j77, j78, j79, j85, j86, j87, j88, j89, j95, j96, j97, j98, j99, j100, j101, j102);
    }

    public static /* synthetic */ ColorScheme b(ColorScheme colorScheme, long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, int i15, int i16, Object obj) {
        long j103;
        long j104;
        long j105 = (i15 & 1) != 0 ? colorScheme.primary : j15;
        long j106 = (i15 & 2) != 0 ? colorScheme.onPrimary : j16;
        long j107 = (i15 & 4) != 0 ? colorScheme.primaryContainer : j17;
        long j108 = (i15 & 8) != 0 ? colorScheme.onPrimaryFixed : j18;
        long j109 = (i15 & 16) != 0 ? colorScheme.inversePrimary : j19;
        long j110 = (i15 & 32) != 0 ? colorScheme.secondary : j25;
        long j111 = (i15 & 64) != 0 ? colorScheme.onSecondary : j26;
        long j112 = (i15 & 128) != 0 ? colorScheme.secondaryContainer : j27;
        long j113 = (i15 & 256) != 0 ? colorScheme.onSecondaryContainer : j28;
        long j114 = (i15 & 512) != 0 ? colorScheme.tertiary : j29;
        long j115 = (i15 & 1024) != 0 ? colorScheme.onTertiary : j35;
        long j116 = (i15 & 2048) != 0 ? colorScheme.tertiaryContainer : j36;
        long j117 = (i15 & PKIFailureInfo.certConfirmed) != 0 ? colorScheme.onTertiaryContainer : j37;
        long j118 = (i15 & PKIFailureInfo.certRevoked) != 0 ? colorScheme.background : j38;
        long j119 = (i15 & 16384) != 0 ? colorScheme.onBackground : j39;
        long j120 = (i15 & 32768) != 0 ? colorScheme.surface : j45;
        long j121 = (i15 & PKIFailureInfo.notAuthorized) != 0 ? colorScheme.onSurface : j46;
        long j122 = (i15 & PKIFailureInfo.unsupportedVersion) != 0 ? colorScheme.surfaceVariant : j47;
        long j123 = (i15 & PKIFailureInfo.transactionIdInUse) != 0 ? colorScheme.onSurfaceVariant : j48;
        long j124 = (i15 & PKIFailureInfo.signerNotTrusted) != 0 ? colorScheme.surfaceTint : j49;
        long j125 = (i15 & PKIFailureInfo.badCertTemplate) != 0 ? colorScheme.inverseSurface : j55;
        long j126 = (i15 & PKIFailureInfo.badSenderNonce) != 0 ? colorScheme.inverseOnSurface : j56;
        long j127 = (i15 & 4194304) != 0 ? colorScheme.error : j57;
        long j128 = (i15 & 8388608) != 0 ? colorScheme.onError : j58;
        long j129 = (i15 & 16777216) != 0 ? colorScheme.errorContainer : j59;
        long j130 = (i15 & 33554432) != 0 ? colorScheme.onErrorContainer : j65;
        long j131 = (i15 & 67108864) != 0 ? colorScheme.outline : j66;
        long j132 = (i15 & 134217728) != 0 ? colorScheme.outlineVariant : j67;
        long j133 = (i15 & 268435456) != 0 ? colorScheme.scrim : j68;
        long j134 = (i15 & PKIFailureInfo.duplicateCertReq) != 0 ? colorScheme.surfaceBright : j69;
        long j135 = (i15 & 1073741824) != 0 ? colorScheme.surfaceDim : j75;
        long j136 = (i15 & PKIFailureInfo.systemUnavail) != 0 ? colorScheme.surfaceContainer : j76;
        long j137 = (i16 & 1) != 0 ? colorScheme.surfaceContainerHigh : j77;
        long j138 = (i16 & 2) != 0 ? colorScheme.surfaceContainerHighest : j78;
        long j139 = (i16 & 4) != 0 ? colorScheme.surfaceContainerLow : j79;
        long j140 = (i16 & 8) != 0 ? colorScheme.surfaceContainerLowest : j85;
        long j141 = (i16 & 16) != 0 ? colorScheme.primaryFixed : j86;
        long j142 = (i16 & 32) != 0 ? colorScheme.primaryFixedDim : j87;
        long j143 = (i16 & 64) != 0 ? colorScheme.onPrimaryFixed : j88;
        long j144 = (i16 & 128) != 0 ? colorScheme.onPrimaryFixedVariant : j89;
        long j145 = (i16 & 256) != 0 ? colorScheme.secondaryFixed : j95;
        long j146 = (i16 & 512) != 0 ? colorScheme.secondaryFixedDim : j96;
        long j147 = (i16 & 1024) != 0 ? colorScheme.onSecondaryFixed : j97;
        long j148 = (i16 & 2048) != 0 ? colorScheme.onSecondaryFixedVariant : j98;
        long j149 = (i16 & PKIFailureInfo.certConfirmed) != 0 ? colorScheme.tertiaryFixed : j99;
        long j150 = (i16 & PKIFailureInfo.certRevoked) != 0 ? colorScheme.tertiaryFixedDim : j100;
        long j151 = (i16 & 16384) != 0 ? colorScheme.onTertiaryFixed : j101;
        if ((i16 & 32768) != 0) {
            j104 = j151;
            j103 = colorScheme.onTertiaryFixedVariant;
        } else {
            j103 = j102;
            j104 = j151;
        }
        return colorScheme.a(j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j116, j117, j118, j119, j120, j121, j122, j123, j124, j125, j126, j127, j128, j129, j130, j131, j132, j133, j134, j135, j136, j137, j138, j139, j140, j141, j142, j143, j144, j145, j146, j147, j148, j149, j150, j104, j103);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getOnPrimaryFixed() {
        return this.onPrimaryFixed;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getOnPrimaryFixedVariant() {
        return this.onPrimaryFixedVariant;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getOnSecondary() {
        return this.onSecondary;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getOnSecondaryContainer() {
        return this.onSecondaryContainer;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getOnSecondaryFixed() {
        return this.onSecondaryFixed;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getOnSecondaryFixedVariant() {
        return this.onSecondaryFixedVariant;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getOnSurface() {
        return this.onSurface;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getOnSurfaceVariant() {
        return this.onSurfaceVariant;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getOnTertiary() {
        return this.onTertiary;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getOnTertiaryContainer() {
        return this.onTertiaryContainer;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getOnTertiaryFixed() {
        return this.onTertiaryFixed;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final long getOnTertiaryFixedVariant() {
        return this.onTertiaryFixedVariant;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getOutline() {
        return this.outline;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final long getOutlineVariant() {
        return this.outlineVariant;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getPrimary() {
        return this.primary;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final long getPrimaryContainer() {
        return this.primaryContainer;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final long getPrimaryFixed() {
        return this.primaryFixed;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final long getPrimaryFixedDim() {
        return this.primaryFixedDim;
    }

    /* JADX INFO: renamed from: S, reason: from getter */
    public final long getScrim() {
        return this.scrim;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final long getSecondary() {
        return this.secondary;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final long getSecondaryContainer() {
        return this.secondaryContainer;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final long getSecondaryFixed() {
        return this.secondaryFixed;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final long getSecondaryFixedDim() {
        return this.secondaryFixedDim;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final long getSurface() {
        return this.surface;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getSurfaceBright() {
        return this.surfaceBright;
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final long getSurfaceContainer() {
        return this.surfaceContainer;
    }

    public final ColorScheme a(long primary, long onPrimary, long primaryContainer, long onPrimaryContainer, long inversePrimary, long secondary, long onSecondary, long secondaryContainer, long onSecondaryContainer, long tertiary, long onTertiary, long tertiaryContainer, long onTertiaryContainer, long background, long onBackground, long surface, long onSurface, long surfaceVariant, long onSurfaceVariant, long surfaceTint, long inverseSurface, long inverseOnSurface, long error, long onError, long errorContainer, long onErrorContainer, long outline, long outlineVariant, long scrim, long surfaceBright, long surfaceDim, long surfaceContainer, long surfaceContainerHigh, long surfaceContainerHighest, long surfaceContainerLow, long surfaceContainerLowest, long primaryFixed, long primaryFixedDim, long onPrimaryFixed, long onPrimaryFixedVariant, long secondaryFixed, long secondaryFixedDim, long onSecondaryFixed, long onSecondaryFixedVariant, long tertiaryFixed, long tertiaryFixedDim, long onTertiaryFixed, long onTertiaryFixedVariant) {
        return new ColorScheme(primary, onPrimary, primaryContainer, onPrimaryContainer, inversePrimary, secondary, onSecondary, secondaryContainer, onSecondaryContainer, tertiary, onTertiary, tertiaryContainer, onTertiaryContainer, background, onBackground, surface, onSurface, surfaceVariant, onSurfaceVariant, surfaceTint, inverseSurface, inverseOnSurface, error, onError, errorContainer, onErrorContainer, outline, outlineVariant, scrim, surfaceBright, surfaceDim, surfaceContainer, surfaceContainerHigh, surfaceContainerHighest, surfaceContainerLow, surfaceContainerLowest, primaryFixed, primaryFixedDim, onPrimaryFixed, onPrimaryFixedVariant, secondaryFixed, secondaryFixedDim, onSecondaryFixed, onSecondaryFixedVariant, tertiaryFixed, tertiaryFixedDim, onTertiaryFixed, onTertiaryFixedVariant, null);
    }

    /* JADX INFO: renamed from: a0, reason: from getter */
    public final long getSurfaceContainerHigh() {
        return this.surfaceContainerHigh;
    }

    /* JADX INFO: renamed from: b0, reason: from getter */
    public final long getSurfaceContainerHighest() {
        return this.surfaceContainerHighest;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getBackground() {
        return this.background;
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final long getSurfaceContainerLow() {
        return this.surfaceContainerLow;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final m1 getDefaultButtonColorsCached() {
        return this.defaultButtonColorsCached;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final long getSurfaceContainerLowest() {
        return this.surfaceContainerLowest;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final x1 getDefaultCardColorsCached() {
        return this.defaultCardColorsCached;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final long getSurfaceDim() {
        return this.surfaceDim;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final w4 getDefaultDatePickerColorsCached() {
        return this.defaultDatePickerColorsCached;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final long getSurfaceTint() {
        return this.surfaceTint;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final sc getDefaultIconButtonColorsCached() {
        return this.defaultIconButtonColorsCached;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final long getSurfaceVariant() {
        return this.surfaceVariant;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final ae getDefaultMenuItemColorsCached() {
        return this.defaultMenuItemColorsCached;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final long getTertiary() {
        return this.tertiary;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final hn getDefaultOutlinedTextFieldColorsCached() {
        return this.defaultOutlinedTextFieldColorsCached;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final long getTertiaryContainer() {
        return this.tertiaryContainer;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final kh getDefaultRadioButtonColorsCached() {
        return this.defaultRadioButtonColorsCached;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final long getTertiaryFixed() {
        return this.tertiaryFixed;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final mj getDefaultSliderColorsCached() {
        return this.defaultSliderColorsCached;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final long getTertiaryFixedDim() {
        return this.tertiaryFixedDim;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final dm getDefaultSwitchColorsCached() {
        return this.defaultSwitchColorsCached;
    }

    public final void l0(m1 m1Var) {
        this.defaultButtonColorsCached = m1Var;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final m1 getDefaultTextButtonColorsCached() {
        return this.defaultTextButtonColorsCached;
    }

    public final void m0(x1 x1Var) {
        this.defaultCardColorsCached = x1Var;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final hn getDefaultTextFieldColorsCached() {
        return this.defaultTextFieldColorsCached;
    }

    public final void n0(w4 w4Var) {
        this.defaultDatePickerColorsCached = w4Var;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final vo getDefaultTimePickerColorsCached() {
        return this.defaultTimePickerColorsCached;
    }

    public final void o0(sc scVar) {
        this.defaultIconButtonColorsCached = scVar;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final nr getDefaultTopAppBarColorsCached() {
        return this.defaultTopAppBarColorsCached;
    }

    public final void p0(ae aeVar) {
        this.defaultMenuItemColorsCached = aeVar;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getError() {
        return this.error;
    }

    public final void q0(hn hnVar) {
        this.defaultOutlinedTextFieldColorsCached = hnVar;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getErrorContainer() {
        return this.errorContainer;
    }

    public final void r0(kh khVar) {
        this.defaultRadioButtonColorsCached = khVar;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getInverseOnSurface() {
        return this.inverseOnSurface;
    }

    public final void s0(mj mjVar) {
        this.defaultSliderColorsCached = mjVar;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getInversePrimary() {
        return this.inversePrimary;
    }

    public final void t0(dm dmVar) {
        this.defaultSwitchColorsCached = dmVar;
    }

    public String toString() {
        return "ColorScheme(primary=" + ((Object) Color.m18toStringimpl(this.primary)) + "onPrimary=" + ((Object) Color.m18toStringimpl(this.onPrimary)) + "primaryContainer=" + ((Object) Color.m18toStringimpl(this.primaryContainer)) + "onPrimaryContainer=" + ((Object) Color.m18toStringimpl(this.onPrimaryFixed)) + "inversePrimary=" + ((Object) Color.m18toStringimpl(this.inversePrimary)) + "secondary=" + ((Object) Color.m18toStringimpl(this.secondary)) + "onSecondary=" + ((Object) Color.m18toStringimpl(this.onSecondary)) + "secondaryContainer=" + ((Object) Color.m18toStringimpl(this.secondaryContainer)) + "onSecondaryContainer=" + ((Object) Color.m18toStringimpl(this.onSecondaryContainer)) + "tertiary=" + ((Object) Color.m18toStringimpl(this.tertiary)) + "onTertiary=" + ((Object) Color.m18toStringimpl(this.onTertiary)) + "tertiaryContainer=" + ((Object) Color.m18toStringimpl(this.tertiaryContainer)) + "onTertiaryContainer=" + ((Object) Color.m18toStringimpl(this.onTertiaryContainer)) + "background=" + ((Object) Color.m18toStringimpl(this.background)) + "onBackground=" + ((Object) Color.m18toStringimpl(this.onBackground)) + "surface=" + ((Object) Color.m18toStringimpl(this.surface)) + "onSurface=" + ((Object) Color.m18toStringimpl(this.onSurface)) + "surfaceVariant=" + ((Object) Color.m18toStringimpl(this.surfaceVariant)) + "onSurfaceVariant=" + ((Object) Color.m18toStringimpl(this.onSurfaceVariant)) + "surfaceTint=" + ((Object) Color.m18toStringimpl(this.surfaceTint)) + "inverseSurface=" + ((Object) Color.m18toStringimpl(this.inverseSurface)) + "inverseOnSurface=" + ((Object) Color.m18toStringimpl(this.inverseOnSurface)) + "error=" + ((Object) Color.m18toStringimpl(this.error)) + "onError=" + ((Object) Color.m18toStringimpl(this.onError)) + "errorContainer=" + ((Object) Color.m18toStringimpl(this.errorContainer)) + "onErrorContainer=" + ((Object) Color.m18toStringimpl(this.onErrorContainer)) + "outline=" + ((Object) Color.m18toStringimpl(this.outline)) + "outlineVariant=" + ((Object) Color.m18toStringimpl(this.outlineVariant)) + "scrim=" + ((Object) Color.m18toStringimpl(this.scrim)) + "surfaceBright=" + ((Object) Color.m18toStringimpl(this.surfaceBright)) + "surfaceDim=" + ((Object) Color.m18toStringimpl(this.surfaceDim)) + "surfaceContainer=" + ((Object) Color.m18toStringimpl(this.surfaceContainer)) + "surfaceContainerHigh=" + ((Object) Color.m18toStringimpl(this.surfaceContainerHigh)) + "surfaceContainerHighest=" + ((Object) Color.m18toStringimpl(this.surfaceContainerHighest)) + "surfaceContainerLow=" + ((Object) Color.m18toStringimpl(this.surfaceContainerLow)) + "surfaceContainerLowest=" + ((Object) Color.m18toStringimpl(this.surfaceContainerLowest)) + "primaryFixed=" + ((Object) Color.m18toStringimpl(this.primaryFixed)) + "primaryFixedDim=" + ((Object) Color.m18toStringimpl(this.primaryFixedDim)) + "onPrimaryFixed=" + ((Object) Color.m18toStringimpl(this.onPrimaryFixed)) + "onPrimaryFixedVariant=" + ((Object) Color.m18toStringimpl(this.onPrimaryFixedVariant)) + "secondaryFixed=" + ((Object) Color.m18toStringimpl(this.secondaryFixed)) + "secondaryFixedDim=" + ((Object) Color.m18toStringimpl(this.secondaryFixedDim)) + "onSecondaryFixed=" + ((Object) Color.m18toStringimpl(this.onSecondaryFixed)) + "onSecondaryFixedVariant=" + ((Object) Color.m18toStringimpl(this.onSecondaryFixedVariant)) + "tertiaryFixed=" + ((Object) Color.m18toStringimpl(this.tertiaryFixed)) + "tertiaryFixedDim=" + ((Object) Color.m18toStringimpl(this.tertiaryFixedDim)) + "onTertiaryFixed=" + ((Object) Color.m18toStringimpl(this.onTertiaryFixed)) + "onTertiaryFixedVariant=" + ((Object) Color.m18toStringimpl(this.onTertiaryFixedVariant)) + ')';
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getInverseSurface() {
        return this.inverseSurface;
    }

    public final void u0(m1 m1Var) {
        this.defaultTextButtonColorsCached = m1Var;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getOnBackground() {
        return this.onBackground;
    }

    public final void v0(hn hnVar) {
        this.defaultTextFieldColorsCached = hnVar;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getOnError() {
        return this.onError;
    }

    public final void w0(vo voVar) {
        this.defaultTimePickerColorsCached = voVar;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getOnErrorContainer() {
        return this.onErrorContainer;
    }

    public final void x0(nr nrVar) {
        this.defaultTopAppBarColorsCached = nrVar;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getOnPrimary() {
        return this.onPrimary;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getOnPrimaryFixed() {
        return this.onPrimaryFixed;
    }

    private ColorScheme(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102) {
        this.primary = j15;
        this.onPrimary = j16;
        this.primaryContainer = j17;
        this.onPrimaryFixed = j18;
        this.inversePrimary = j19;
        this.secondary = j25;
        this.onSecondary = j26;
        this.secondaryContainer = j27;
        this.onSecondaryContainer = j28;
        this.tertiary = j29;
        this.onTertiary = j35;
        this.tertiaryContainer = j36;
        this.onTertiaryContainer = j37;
        this.background = j38;
        this.onBackground = j39;
        this.surface = j45;
        this.onSurface = j46;
        this.surfaceVariant = j47;
        this.onSurfaceVariant = j48;
        this.surfaceTint = j49;
        this.inverseSurface = j55;
        this.inverseOnSurface = j56;
        this.error = j57;
        this.onError = j58;
        this.errorContainer = j59;
        this.onErrorContainer = j65;
        this.outline = j66;
        this.outlineVariant = j67;
        this.scrim = j68;
        this.surfaceBright = j69;
        this.surfaceDim = j75;
        this.surfaceContainer = j76;
        this.surfaceContainerHigh = j77;
        this.surfaceContainerHighest = j78;
        this.surfaceContainerLow = j79;
        this.surfaceContainerLowest = j85;
        this.primaryFixed = j86;
        this.primaryFixedDim = j87;
        this.onPrimaryFixed = j88;
        this.onPrimaryFixedVariant = j89;
        this.secondaryFixed = j95;
        this.secondaryFixedDim = j96;
        this.onSecondaryFixed = j97;
        this.onSecondaryFixedVariant = j98;
        this.tertiaryFixed = j99;
        this.tertiaryFixedDim = j100;
        this.onTertiaryFixed = j101;
        this.onTertiaryFixedVariant = j102;
    }
}
