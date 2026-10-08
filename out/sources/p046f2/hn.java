package p046f2;

import androidx.compose.ui.graphics.Color;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import fr.t;
import ip.a;
import p071kotlin.Metadata;
import z1.SelectionColors;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\bN\b\u0007\u0018\u00002\u00020\u0001Bß\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002¢\u0006\u0004\b/\u00100J½\u0003\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0004\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00022\b\b\u0002\u0010\b\u001a\u00020\u00022\b\b\u0002\u0010\t\u001a\u00020\u00022\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\b\b\u0002\u0010\u0016\u001a\u00020\u00022\b\b\u0002\u0010\u0017\u001a\u00020\u00022\b\b\u0002\u0010\u0018\u001a\u00020\u00022\b\b\u0002\u0010\u0019\u001a\u00020\u00022\b\b\u0002\u0010\u001a\u001a\u00020\u00022\b\b\u0002\u0010\u001b\u001a\u00020\u00022\b\b\u0002\u0010\u001c\u001a\u00020\u00022\b\b\u0002\u0010\u001d\u001a\u00020\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\b\b\u0002\u0010%\u001a\u00020\u00022\b\b\u0002\u0010&\u001a\u00020\u00022\b\b\u0002\u0010'\u001a\u00020\u00022\b\b\u0002\u0010(\u001a\u00020\u00022\b\b\u0002\u0010)\u001a\u00020\u00022\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\b\b\u0002\u0010,\u001a\u00020\u00022\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u0002¢\u0006\u0004\b1\u00102J#\u00105\u001a\u00020\r*\u0004\u0018\u00010\r2\f\u00104\u001a\b\u0012\u0004\u0012\u00020\r03H\u0000¢\u0006\u0004\b5\u00106J'\u0010;\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b;\u0010<J'\u0010=\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b=\u0010<J'\u0010>\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b>\u0010<J'\u0010?\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b?\u0010<J'\u0010@\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\b@\u0010<J'\u0010A\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\bA\u0010<J'\u0010B\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\bB\u0010<J'\u0010C\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\bC\u0010<J'\u0010D\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\bD\u0010<J'\u0010E\u001a\u00020\u00022\u0006\u00108\u001a\u0002072\u0006\u00109\u001a\u0002072\u0006\u0010:\u001a\u000207H\u0007¢\u0006\u0004\bE\u0010<J\u0017\u0010F\u001a\u00020\u00022\u0006\u00109\u001a\u000207H\u0007¢\u0006\u0004\bF\u0010GJ\u001a\u0010I\u001a\u0002072\b\u0010H\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010L\u001a\u00020KH\u0016¢\u0006\u0004\bL\u0010MR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b?\u0010O\u001a\u0004\bR\u0010QR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010O\u001a\u0004\bS\u0010QR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bT\u0010O\u001a\u0004\bU\u0010QR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bV\u0010O\u001a\u0004\bW\u0010QR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bF\u0010O\u001a\u0004\bX\u0010QR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010QR\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b>\u0010O\u001a\u0004\b[\u0010QR\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bA\u0010O\u001a\u0004\b\\\u0010QR\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b;\u0010O\u001a\u0004\b]\u0010QR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b@\u0010^\u001a\u0004\bY\u0010_R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bD\u0010O\u001a\u0004\b`\u0010QR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bE\u0010O\u001a\u0004\ba\u0010QR\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bC\u0010O\u001a\u0004\bb\u0010QR\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010O\u001a\u0004\bc\u0010QR\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bB\u0010O\u001a\u0004\bd\u0010QR\u0017\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b=\u0010O\u001a\u0004\be\u0010QR\u0017\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010O\u001a\u0004\bg\u0010QR\u0017\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010O\u001a\u0004\bi\u0010QR\u0017\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010O\u001a\u0004\bk\u0010QR\u0017\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010O\u001a\u0004\bm\u0010QR\u0017\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010O\u001a\u0004\bo\u0010QR\u0017\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010O\u001a\u0004\bq\u0010QR\u0017\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010O\u001a\u0004\bs\u0010QR\u0017\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bt\u0010O\u001a\u0004\bu\u0010QR\u0017\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010O\u001a\u0004\bw\u0010QR\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u0010O\u001a\u0004\by\u0010QR\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010O\u001a\u0004\b{\u0010QR\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b|\u0010O\u001a\u0004\b}\u0010QR\u0017\u0010!\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b~\u0010O\u001a\u0004\b\u007f\u0010QR\u0019\u0010\"\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010O\u001a\u0005\b\u0081\u0001\u0010QR\u0019\u0010#\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010O\u001a\u0005\b\u0083\u0001\u0010QR\u0019\u0010$\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010O\u001a\u0005\b\u0085\u0001\u0010QR\u0019\u0010%\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010O\u001a\u0005\b\u0087\u0001\u0010QR\u0019\u0010&\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010O\u001a\u0005\b\u0089\u0001\u0010QR\u0018\u0010'\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\bO\u0010O\u001a\u0005\b\u008a\u0001\u0010QR\u0019\u0010(\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010O\u001a\u0005\b\u008c\u0001\u0010QR\u0019\u0010)\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008d\u0001\u0010O\u001a\u0005\b\u008e\u0001\u0010QR\u0019\u0010*\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010O\u001a\u0005\b\u0090\u0001\u0010QR\u0019\u0010+\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010O\u001a\u0005\b\u0092\u0001\u0010QR\u0019\u0010,\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010O\u001a\u0005\b\u0094\u0001\u0010QR\u0019\u0010-\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0095\u0001\u0010O\u001a\u0005\b\u0096\u0001\u0010QR\u0019\u0010.\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0097\u0001\u0010O\u001a\u0005\b\u0098\u0001\u0010Q¨\u0006\u0099\u0001"}, d2 = {"Lf2/hn;", "", "Landroidx/compose/ui/graphics/Color;", "focusedTextColor", "unfocusedTextColor", "disabledTextColor", "errorTextColor", "focusedContainerColor", "unfocusedContainerColor", "disabledContainerColor", "errorContainerColor", "cursorColor", "errorCursorColor", "Lz1/e3;", "textSelectionColors", "focusedIndicatorColor", "unfocusedIndicatorColor", "disabledIndicatorColor", "errorIndicatorColor", "focusedLeadingIconColor", "unfocusedLeadingIconColor", "disabledLeadingIconColor", "errorLeadingIconColor", "focusedTrailingIconColor", "unfocusedTrailingIconColor", "disabledTrailingIconColor", "errorTrailingIconColor", "focusedLabelColor", "unfocusedLabelColor", "disabledLabelColor", "errorLabelColor", "focusedPlaceholderColor", "unfocusedPlaceholderColor", "disabledPlaceholderColor", "errorPlaceholderColor", "focusedSupportingTextColor", "unfocusedSupportingTextColor", "disabledSupportingTextColor", "errorSupportingTextColor", "focusedPrefixColor", "unfocusedPrefixColor", "disabledPrefixColor", "errorPrefixColor", "focusedSuffixColor", "unfocusedSuffixColor", "disabledSuffixColor", "errorSuffixColor", "<init>", "(JJJJJJJJJJLz1/e3;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLfr/k;)V", "c", "(JJJJJJJJJJLz1/e3;JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ)Lf2/hn;", "Lkotlin/Function0;", "block", "o", "(Lz1/e3;Ler/a;)Lz1/e3;", "", "enabled", "isError", "focused", "j", "(ZZZ)J", "q", "h", "b", "k", "i", "p", "n", "l", "m", "f", "(Z)J", "other", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "J", "getFocusedTextColor-0d7_KjU", "()J", "getUnfocusedTextColor-0d7_KjU", "getDisabledTextColor-0d7_KjU", "d", "getErrorTextColor-0d7_KjU", "e", "getFocusedContainerColor-0d7_KjU", "getUnfocusedContainerColor-0d7_KjU", "g", "getDisabledContainerColor-0d7_KjU", "getErrorContainerColor-0d7_KjU", "getCursorColor-0d7_KjU", "getErrorCursorColor-0d7_KjU", "Lz1/e3;", "()Lz1/e3;", "getFocusedIndicatorColor-0d7_KjU", "getUnfocusedIndicatorColor-0d7_KjU", "getDisabledIndicatorColor-0d7_KjU", "getErrorIndicatorColor-0d7_KjU", "getFocusedLeadingIconColor-0d7_KjU", "getUnfocusedLeadingIconColor-0d7_KjU", "r", "getDisabledLeadingIconColor-0d7_KjU", "s", "getErrorLeadingIconColor-0d7_KjU", "t", "getFocusedTrailingIconColor-0d7_KjU", "u", "getUnfocusedTrailingIconColor-0d7_KjU", "v", "getDisabledTrailingIconColor-0d7_KjU", "w", "getErrorTrailingIconColor-0d7_KjU", "x", "getFocusedLabelColor-0d7_KjU", "y", "getUnfocusedLabelColor-0d7_KjU", "z", "getDisabledLabelColor-0d7_KjU", "A", "getErrorLabelColor-0d7_KjU", "B", "getFocusedPlaceholderColor-0d7_KjU", "C", "getUnfocusedPlaceholderColor-0d7_KjU", a.f96138c, "getDisabledPlaceholderColor-0d7_KjU", "E", "getErrorPlaceholderColor-0d7_KjU", "F", "getFocusedSupportingTextColor-0d7_KjU", "G", "getUnfocusedSupportingTextColor-0d7_KjU", i.f37087n, "getDisabledSupportingTextColor-0d7_KjU", "I", "getErrorSupportingTextColor-0d7_KjU", "getFocusedPrefixColor-0d7_KjU", "K", "getUnfocusedPrefixColor-0d7_KjU", i.f37094u, "getDisabledPrefixColor-0d7_KjU", "M", "getErrorPrefixColor-0d7_KjU", "N", "getFocusedSuffixColor-0d7_KjU", "O", "getUnfocusedSuffixColor-0d7_KjU", i.f37086m, "getDisabledSuffixColor-0d7_KjU", "Q", "getErrorSuffixColor-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class hn {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long errorLabelColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long focusedPlaceholderColor;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final long unfocusedPlaceholderColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long disabledPlaceholderColor;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long errorPlaceholderColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final long focusedSupportingTextColor;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final long unfocusedSupportingTextColor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long disabledSupportingTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final long errorSupportingTextColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long focusedPrefixColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final long unfocusedPrefixColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long disabledPrefixColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long errorPrefixColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final long focusedSuffixColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final long unfocusedSuffixColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final long disabledSuffixColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long errorSuffixColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long focusedTextColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long disabledTextColor;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long errorTextColor;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long focusedContainerColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedContainerColor;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long disabledContainerColor;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long errorContainerColor;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long cursorColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long errorCursorColor;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final SelectionColors textSelectionColors;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long focusedIndicatorColor;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedIndicatorColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long disabledIndicatorColor;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long errorIndicatorColor;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long focusedLeadingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLeadingIconColor;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long disabledLeadingIconColor;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long errorLeadingIconColor;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long focusedTrailingIconColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedTrailingIconColor;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long disabledTrailingIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long errorTrailingIconColor;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long focusedLabelColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long unfocusedLabelColor;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long disabledLabelColor;

    public /* synthetic */ hn(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, SelectionColors selectionColors, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, selectionColors, j35, j36, j37, j38, j39, j45, j46, j47, j48, j49, j55, j56, j57, j58, j59, j65, j66, j67, j68, j69, j75, j76, j77, j78, j79, j85, j86, j87, j88, j89, j95, j96);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SelectionColors e(hn hnVar) {
        return hnVar.textSelectionColors;
    }

    public final long b(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledContainerColor;
        }
        if (isError) {
            return this.errorContainerColor;
        }
        return focused ? this.focusedContainerColor : this.unfocusedContainerColor;
    }

    public final hn c(long focusedTextColor, long unfocusedTextColor, long disabledTextColor, long errorTextColor, long focusedContainerColor, long unfocusedContainerColor, long disabledContainerColor, long errorContainerColor, long cursorColor, long errorCursorColor, SelectionColors textSelectionColors, long focusedIndicatorColor, long unfocusedIndicatorColor, long disabledIndicatorColor, long errorIndicatorColor, long focusedLeadingIconColor, long unfocusedLeadingIconColor, long disabledLeadingIconColor, long errorLeadingIconColor, long focusedTrailingIconColor, long unfocusedTrailingIconColor, long disabledTrailingIconColor, long errorTrailingIconColor, long focusedLabelColor, long unfocusedLabelColor, long disabledLabelColor, long errorLabelColor, long focusedPlaceholderColor, long unfocusedPlaceholderColor, long disabledPlaceholderColor, long errorPlaceholderColor, long focusedSupportingTextColor, long unfocusedSupportingTextColor, long disabledSupportingTextColor, long errorSupportingTextColor, long focusedPrefixColor, long unfocusedPrefixColor, long disabledPrefixColor, long errorPrefixColor, long focusedSuffixColor, long unfocusedSuffixColor, long disabledSuffixColor, long errorSuffixColor) {
        return new hn(focusedTextColor != 16 ? focusedTextColor : this.focusedTextColor, unfocusedTextColor != 16 ? unfocusedTextColor : this.unfocusedTextColor, disabledTextColor != 16 ? disabledTextColor : this.disabledTextColor, errorTextColor != 16 ? errorTextColor : this.errorTextColor, focusedContainerColor != 16 ? focusedContainerColor : this.focusedContainerColor, unfocusedContainerColor != 16 ? unfocusedContainerColor : this.unfocusedContainerColor, disabledContainerColor != 16 ? disabledContainerColor : this.disabledContainerColor, errorContainerColor != 16 ? errorContainerColor : this.errorContainerColor, cursorColor != 16 ? cursorColor : this.cursorColor, errorCursorColor != 16 ? errorCursorColor : this.errorCursorColor, o(textSelectionColors, new er.a() { // from class: f2.gn
            @Override // er.a
            public final Object a() {
                return hn.e(this.f55971a);
            }
        }), focusedIndicatorColor != 16 ? focusedIndicatorColor : this.focusedIndicatorColor, unfocusedIndicatorColor != 16 ? unfocusedIndicatorColor : this.unfocusedIndicatorColor, disabledIndicatorColor != 16 ? disabledIndicatorColor : this.disabledIndicatorColor, errorIndicatorColor != 16 ? errorIndicatorColor : this.errorIndicatorColor, focusedLeadingIconColor != 16 ? focusedLeadingIconColor : this.focusedLeadingIconColor, unfocusedLeadingIconColor != 16 ? unfocusedLeadingIconColor : this.unfocusedLeadingIconColor, disabledLeadingIconColor != 16 ? disabledLeadingIconColor : this.disabledLeadingIconColor, errorLeadingIconColor != 16 ? errorLeadingIconColor : this.errorLeadingIconColor, focusedTrailingIconColor != 16 ? focusedTrailingIconColor : this.focusedTrailingIconColor, unfocusedTrailingIconColor != 16 ? unfocusedTrailingIconColor : this.unfocusedTrailingIconColor, disabledTrailingIconColor != 16 ? disabledTrailingIconColor : this.disabledTrailingIconColor, errorTrailingIconColor != 16 ? errorTrailingIconColor : this.errorTrailingIconColor, focusedLabelColor != 16 ? focusedLabelColor : this.focusedLabelColor, unfocusedLabelColor != 16 ? unfocusedLabelColor : this.unfocusedLabelColor, disabledLabelColor != 16 ? disabledLabelColor : this.disabledLabelColor, errorLabelColor != 16 ? errorLabelColor : this.errorLabelColor, focusedPlaceholderColor != 16 ? focusedPlaceholderColor : this.focusedPlaceholderColor, unfocusedPlaceholderColor != 16 ? unfocusedPlaceholderColor : this.unfocusedPlaceholderColor, disabledPlaceholderColor != 16 ? disabledPlaceholderColor : this.disabledPlaceholderColor, errorPlaceholderColor != 16 ? errorPlaceholderColor : this.errorPlaceholderColor, focusedSupportingTextColor != 16 ? focusedSupportingTextColor : this.focusedSupportingTextColor, unfocusedSupportingTextColor != 16 ? unfocusedSupportingTextColor : this.unfocusedSupportingTextColor, disabledSupportingTextColor != 16 ? disabledSupportingTextColor : this.disabledSupportingTextColor, errorSupportingTextColor != 16 ? errorSupportingTextColor : this.errorSupportingTextColor, focusedPrefixColor != 16 ? focusedPrefixColor : this.focusedPrefixColor, unfocusedPrefixColor != 16 ? unfocusedPrefixColor : this.unfocusedPrefixColor, disabledPrefixColor != 16 ? disabledPrefixColor : this.disabledPrefixColor, errorPrefixColor != 16 ? errorPrefixColor : this.errorPrefixColor, focusedSuffixColor != 16 ? focusedSuffixColor : this.focusedSuffixColor, unfocusedSuffixColor != 16 ? unfocusedSuffixColor : this.unfocusedSuffixColor, disabledSuffixColor != 16 ? disabledSuffixColor : this.disabledSuffixColor, errorSuffixColor != 16 ? errorSuffixColor : this.errorSuffixColor, null);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof hn)) {
            return false;
        }
        hn hnVar = (hn) other;
        return Color.m11equalsimpl0(this.focusedTextColor, hnVar.focusedTextColor) && Color.m11equalsimpl0(this.unfocusedTextColor, hnVar.unfocusedTextColor) && Color.m11equalsimpl0(this.disabledTextColor, hnVar.disabledTextColor) && Color.m11equalsimpl0(this.errorTextColor, hnVar.errorTextColor) && Color.m11equalsimpl0(this.focusedContainerColor, hnVar.focusedContainerColor) && Color.m11equalsimpl0(this.unfocusedContainerColor, hnVar.unfocusedContainerColor) && Color.m11equalsimpl0(this.disabledContainerColor, hnVar.disabledContainerColor) && Color.m11equalsimpl0(this.errorContainerColor, hnVar.errorContainerColor) && Color.m11equalsimpl0(this.cursorColor, hnVar.cursorColor) && Color.m11equalsimpl0(this.errorCursorColor, hnVar.errorCursorColor) && t.c(this.textSelectionColors, hnVar.textSelectionColors) && Color.m11equalsimpl0(this.focusedIndicatorColor, hnVar.focusedIndicatorColor) && Color.m11equalsimpl0(this.unfocusedIndicatorColor, hnVar.unfocusedIndicatorColor) && Color.m11equalsimpl0(this.disabledIndicatorColor, hnVar.disabledIndicatorColor) && Color.m11equalsimpl0(this.errorIndicatorColor, hnVar.errorIndicatorColor) && Color.m11equalsimpl0(this.focusedLeadingIconColor, hnVar.focusedLeadingIconColor) && Color.m11equalsimpl0(this.unfocusedLeadingIconColor, hnVar.unfocusedLeadingIconColor) && Color.m11equalsimpl0(this.disabledLeadingIconColor, hnVar.disabledLeadingIconColor) && Color.m11equalsimpl0(this.errorLeadingIconColor, hnVar.errorLeadingIconColor) && Color.m11equalsimpl0(this.focusedTrailingIconColor, hnVar.focusedTrailingIconColor) && Color.m11equalsimpl0(this.unfocusedTrailingIconColor, hnVar.unfocusedTrailingIconColor) && Color.m11equalsimpl0(this.disabledTrailingIconColor, hnVar.disabledTrailingIconColor) && Color.m11equalsimpl0(this.errorTrailingIconColor, hnVar.errorTrailingIconColor) && Color.m11equalsimpl0(this.focusedLabelColor, hnVar.focusedLabelColor) && Color.m11equalsimpl0(this.unfocusedLabelColor, hnVar.unfocusedLabelColor) && Color.m11equalsimpl0(this.disabledLabelColor, hnVar.disabledLabelColor) && Color.m11equalsimpl0(this.errorLabelColor, hnVar.errorLabelColor) && Color.m11equalsimpl0(this.focusedPlaceholderColor, hnVar.focusedPlaceholderColor) && Color.m11equalsimpl0(this.unfocusedPlaceholderColor, hnVar.unfocusedPlaceholderColor) && Color.m11equalsimpl0(this.disabledPlaceholderColor, hnVar.disabledPlaceholderColor) && Color.m11equalsimpl0(this.errorPlaceholderColor, hnVar.errorPlaceholderColor) && Color.m11equalsimpl0(this.focusedSupportingTextColor, hnVar.focusedSupportingTextColor) && Color.m11equalsimpl0(this.unfocusedSupportingTextColor, hnVar.unfocusedSupportingTextColor) && Color.m11equalsimpl0(this.disabledSupportingTextColor, hnVar.disabledSupportingTextColor) && Color.m11equalsimpl0(this.errorSupportingTextColor, hnVar.errorSupportingTextColor) && Color.m11equalsimpl0(this.focusedPrefixColor, hnVar.focusedPrefixColor) && Color.m11equalsimpl0(this.unfocusedPrefixColor, hnVar.unfocusedPrefixColor) && Color.m11equalsimpl0(this.disabledPrefixColor, hnVar.disabledPrefixColor) && Color.m11equalsimpl0(this.errorPrefixColor, hnVar.errorPrefixColor) && Color.m11equalsimpl0(this.focusedSuffixColor, hnVar.focusedSuffixColor) && Color.m11equalsimpl0(this.unfocusedSuffixColor, hnVar.unfocusedSuffixColor) && Color.m11equalsimpl0(this.disabledSuffixColor, hnVar.disabledSuffixColor) && Color.m11equalsimpl0(this.errorSuffixColor, hnVar.errorSuffixColor);
    }

    public final long f(boolean isError) {
        return isError ? this.errorCursorColor : this.cursorColor;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final SelectionColors getTextSelectionColors() {
        return this.textSelectionColors;
    }

    public final long h(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledIndicatorColor;
        }
        if (isError) {
            return this.errorIndicatorColor;
        }
        return focused ? this.focusedIndicatorColor : this.unfocusedIndicatorColor;
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((((Color.m17hashCodeimpl(this.focusedTextColor) * 31) + Color.m17hashCodeimpl(this.unfocusedTextColor)) * 31) + Color.m17hashCodeimpl(this.disabledTextColor)) * 31) + Color.m17hashCodeimpl(this.errorTextColor)) * 31) + Color.m17hashCodeimpl(this.focusedContainerColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedContainerColor)) * 31) + Color.m17hashCodeimpl(this.disabledContainerColor)) * 31) + Color.m17hashCodeimpl(this.errorContainerColor)) * 31) + Color.m17hashCodeimpl(this.cursorColor)) * 31) + Color.m17hashCodeimpl(this.errorCursorColor)) * 31) + this.textSelectionColors.hashCode()) * 31) + Color.m17hashCodeimpl(this.focusedIndicatorColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedIndicatorColor)) * 31) + Color.m17hashCodeimpl(this.disabledIndicatorColor)) * 31) + Color.m17hashCodeimpl(this.errorIndicatorColor)) * 31) + Color.m17hashCodeimpl(this.focusedLeadingIconColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedLeadingIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledLeadingIconColor)) * 31) + Color.m17hashCodeimpl(this.errorLeadingIconColor)) * 31) + Color.m17hashCodeimpl(this.focusedTrailingIconColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedTrailingIconColor)) * 31) + Color.m17hashCodeimpl(this.disabledTrailingIconColor)) * 31) + Color.m17hashCodeimpl(this.errorTrailingIconColor)) * 31) + Color.m17hashCodeimpl(this.focusedLabelColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedLabelColor)) * 31) + Color.m17hashCodeimpl(this.disabledLabelColor)) * 31) + Color.m17hashCodeimpl(this.errorLabelColor)) * 31) + Color.m17hashCodeimpl(this.focusedPlaceholderColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedPlaceholderColor)) * 31) + Color.m17hashCodeimpl(this.disabledPlaceholderColor)) * 31) + Color.m17hashCodeimpl(this.errorPlaceholderColor)) * 31) + Color.m17hashCodeimpl(this.focusedSupportingTextColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedSupportingTextColor)) * 31) + Color.m17hashCodeimpl(this.disabledSupportingTextColor)) * 31) + Color.m17hashCodeimpl(this.errorSupportingTextColor)) * 31) + Color.m17hashCodeimpl(this.focusedPrefixColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedPrefixColor)) * 31) + Color.m17hashCodeimpl(this.disabledPrefixColor)) * 31) + Color.m17hashCodeimpl(this.errorPrefixColor)) * 31) + Color.m17hashCodeimpl(this.focusedSuffixColor)) * 31) + Color.m17hashCodeimpl(this.unfocusedSuffixColor)) * 31) + Color.m17hashCodeimpl(this.disabledSuffixColor)) * 31) + Color.m17hashCodeimpl(this.errorSuffixColor);
    }

    public final long i(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLabelColor;
        }
        if (isError) {
            return this.errorLabelColor;
        }
        return focused ? this.focusedLabelColor : this.unfocusedLabelColor;
    }

    public final long j(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledLeadingIconColor;
        }
        if (isError) {
            return this.errorLeadingIconColor;
        }
        return focused ? this.focusedLeadingIconColor : this.unfocusedLeadingIconColor;
    }

    public final long k(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPlaceholderColor;
        }
        if (isError) {
            return this.errorPlaceholderColor;
        }
        return focused ? this.focusedPlaceholderColor : this.unfocusedPlaceholderColor;
    }

    public final long l(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledPrefixColor;
        }
        if (isError) {
            return this.errorPrefixColor;
        }
        return focused ? this.focusedPrefixColor : this.unfocusedPrefixColor;
    }

    public final long m(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSuffixColor;
        }
        if (isError) {
            return this.errorSuffixColor;
        }
        return focused ? this.focusedSuffixColor : this.unfocusedSuffixColor;
    }

    public final long n(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledSupportingTextColor;
        }
        if (isError) {
            return this.errorSupportingTextColor;
        }
        return focused ? this.focusedSupportingTextColor : this.unfocusedSupportingTextColor;
    }

    public final SelectionColors o(SelectionColors selectionColors, er.a<SelectionColors> aVar) {
        return selectionColors == null ? aVar.a() : selectionColors;
    }

    public final long p(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTextColor;
        }
        if (isError) {
            return this.errorTextColor;
        }
        return focused ? this.focusedTextColor : this.unfocusedTextColor;
    }

    public final long q(boolean enabled, boolean isError, boolean focused) {
        if (!enabled) {
            return this.disabledTrailingIconColor;
        }
        if (isError) {
            return this.errorTrailingIconColor;
        }
        return focused ? this.focusedTrailingIconColor : this.unfocusedTrailingIconColor;
    }

    private hn(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, SelectionColors selectionColors, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96) {
        this.focusedTextColor = j15;
        this.unfocusedTextColor = j16;
        this.disabledTextColor = j17;
        this.errorTextColor = j18;
        this.focusedContainerColor = j19;
        this.unfocusedContainerColor = j25;
        this.disabledContainerColor = j26;
        this.errorContainerColor = j27;
        this.cursorColor = j28;
        this.errorCursorColor = j29;
        this.textSelectionColors = selectionColors;
        this.focusedIndicatorColor = j35;
        this.unfocusedIndicatorColor = j36;
        this.disabledIndicatorColor = j37;
        this.errorIndicatorColor = j38;
        this.focusedLeadingIconColor = j39;
        this.unfocusedLeadingIconColor = j45;
        this.disabledLeadingIconColor = j46;
        this.errorLeadingIconColor = j47;
        this.focusedTrailingIconColor = j48;
        this.unfocusedTrailingIconColor = j49;
        this.disabledTrailingIconColor = j55;
        this.errorTrailingIconColor = j56;
        this.focusedLabelColor = j57;
        this.unfocusedLabelColor = j58;
        this.disabledLabelColor = j59;
        this.errorLabelColor = j65;
        this.focusedPlaceholderColor = j66;
        this.unfocusedPlaceholderColor = j67;
        this.disabledPlaceholderColor = j68;
        this.errorPlaceholderColor = j69;
        this.focusedSupportingTextColor = j75;
        this.unfocusedSupportingTextColor = j76;
        this.disabledSupportingTextColor = j77;
        this.errorSupportingTextColor = j78;
        this.focusedPrefixColor = j79;
        this.unfocusedPrefixColor = j85;
        this.disabledPrefixColor = j86;
        this.errorPrefixColor = j87;
        this.focusedSuffixColor = j88;
        this.unfocusedSuffixColor = j89;
        this.disabledSuffixColor = j95;
        this.errorSuffixColor = j96;
    }
}
