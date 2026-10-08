package m1;

import androidx.compose.ui.graphics.Color;
import b5.LineHeightStyle;
import b5.TextGeometricTransform;
import b5.TextIndent;
import n3.Shadow;
import n3.d3;
import n3.t2;
import n3.y2;
import p071kotlin.Metadata;
import q4.PlatformTextStyle;
import q4.TextStyle;
import r0.i0;
import u4.FontWeight;
import x4.LocaleList;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\bh\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0000¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\tJ'\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0013\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u0000H\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\u001a\u0010\u0004J/\u0010 \u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000f2\u0006\u0010\"\u001a\u00020\u0000H\u0000¢\u0006\u0004\b#\u0010\u0018J\u0017\u0010&\u001a\u00020$2\u0006\u0010%\u001a\u00020$H\u0000¢\u0006\u0004\b&\u0010'J\u0017\u0010*\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020,H\u0016¢\u0006\u0004\b-\u0010.J\u001f\u00101\u001a\u00020\u000f2\u0006\u0010/\u001a\u00020(2\u0006\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00103\u001a\u00020\u000f2\u0006\u00100\u001a\u00020,H\u0016¢\u0006\u0004\b3\u0010.J\u0017\u00105\u001a\u00020\u000f2\u0006\u0010)\u001a\u000204H\u0016¢\u0006\u0004\b5\u00106J%\u0010:\u001a\u00020\u000f2\f\u00109\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b:\u0010;J3\u0010>\u001a\u00020\u000f2\f\u0010<\u001a\b\u0012\u0004\u0012\u000208072\f\u0010=\u001a\b\u0012\u0004\u0012\u000208072\u0006\u0010)\u001a\u00020\rH\u0016¢\u0006\u0004\b>\u0010?J\u0017\u0010@\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020,H\u0016¢\u0006\u0004\b@\u0010.J\u0017\u0010B\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020AH\u0016¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020DH\u0016¢\u0006\u0004\bE\u0010FJ\u0017\u0010H\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020GH\u0016¢\u0006\u0004\bH\u0010.J\u0017\u0010I\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020GH\u0016¢\u0006\u0004\bI\u0010.J\u0017\u0010K\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020JH\u0016¢\u0006\u0004\bK\u0010+J\u0017\u0010M\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020LH\u0016¢\u0006\u0004\bM\u0010NJ\u0017\u0010P\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020OH\u0016¢\u0006\u0004\bP\u0010QJ\u0017\u0010S\u001a\u00020\u000f2\u0006\u0010)\u001a\u00020RH\u0016¢\u0006\u0004\bS\u0010NJK\u0010X\u001a\u00020\u000f\"\u0004\b\u0000\u0010T2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000U2\u0006\u0010)\u001a\u00020\r2\u001e\u0010\f\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000U\u0012\u0004\u0012\u00020W\u0012\u0004\u0012\u00020\u000b0VH\u0016¢\u0006\u0004\bX\u0010YJ'\u0010Z\u001a\u00020\u000f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\u000bH\u0000¢\u0006\u0004\bZ\u0010[J\u000f\u0010\\\u001a\u00020\u000fH\u0000¢\u0006\u0004\b\\\u0010\u0004R\u0016\u0010_\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b]\u0010^R\u0016\u0010a\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b`\u0010^R\u0018\u0010c\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010bR\u0016\u0010e\u001a\u00020\u00058\u0000@\u0000X\u0081\u000e¢\u0006\u0006\n\u0004\bd\u0010^R\u0016\u0010g\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010fR\u0016\u0010i\u001a\u0002088\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010fR\u0016\u0010\u001f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010lR\"\u0010q\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bm\u0010f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010+R\"\u0010t\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010f\u001a\u0004\br\u0010o\"\u0004\bs\u0010+R\"\u0010x\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bu\u0010f\u001a\u0004\bv\u0010o\"\u0004\bw\u0010+R\"\u0010|\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\by\u0010f\u001a\u0004\bz\u0010o\"\u0004\b{\u0010+R\"\u0010\u007f\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0017\u0010f\u001a\u0004\b}\u0010o\"\u0004\b~\u0010+R&\u0010\u0083\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0080\u0001\u0010f\u001a\u0005\b\u0081\u0001\u0010o\"\u0005\b\u0082\u0001\u0010+R&\u0010\u0087\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0084\u0001\u0010f\u001a\u0005\b\u0085\u0001\u0010o\"\u0005\b\u0086\u0001\u0010+R%\u0010\u008a\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u0019\u0010f\u001a\u0005\b\u0088\u0001\u0010o\"\u0005\b\u0089\u0001\u0010+R%\u0010\u008d\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0005\b\u008b\u0001\u0010f\u001a\u0004\bT\u0010o\"\u0005\b\u008c\u0001\u0010+R%\u0010/\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u008e\u0001\u0010f\u001a\u0005\b\u008f\u0001\u0010o\"\u0005\b\u0090\u0001\u0010+R&\u0010\u0094\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010f\u001a\u0005\b\u0092\u0001\u0010o\"\u0005\b\u0093\u0001\u0010+R&\u0010\u0098\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0095\u0001\u0010f\u001a\u0005\b\u0096\u0001\u0010o\"\u0005\b\u0097\u0001\u0010+R&\u0010\u009c\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0099\u0001\u0010f\u001a\u0005\b\u009a\u0001\u0010o\"\u0005\b\u009b\u0001\u0010+R%\u0010\u009f\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\b\u0014\u0010f\u001a\u0005\b\u009d\u0001\u0010o\"\u0005\b\u009e\u0001\u0010+R&\u0010£\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010f\u001a\u0005\b¡\u0001\u0010o\"\u0005\b¢\u0001\u0010+R&\u0010§\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¤\u0001\u0010f\u001a\u0005\b¥\u0001\u0010o\"\u0005\b¦\u0001\u0010+R&\u0010«\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¨\u0001\u0010f\u001a\u0005\b©\u0001\u0010o\"\u0005\bª\u0001\u0010+R&\u0010¯\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¬\u0001\u0010f\u001a\u0005\b\u00ad\u0001\u0010o\"\u0005\b®\u0001\u0010+R&\u0010³\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b°\u0001\u0010f\u001a\u0005\b±\u0001\u0010o\"\u0005\b²\u0001\u0010+R&\u0010·\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b´\u0001\u0010f\u001a\u0005\bµ\u0001\u0010o\"\u0005\b¶\u0001\u0010+R%\u0010º\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bf\u0010f\u001a\u0005\b¸\u0001\u0010o\"\u0005\b¹\u0001\u0010+R'\u0010¿\u0001\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\\\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0005\b¾\u0001\u0010.R,\u0010Ç\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÁ\u0001\u0010Â\u0001\u001a\u0006\bÃ\u0001\u0010Ä\u0001\"\u0006\bÅ\u0001\u0010Æ\u0001R'\u0010Ê\u0001\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b^\u0010»\u0001\u001a\u0006\bÈ\u0001\u0010½\u0001\"\u0005\bÉ\u0001\u0010.R+\u0010Ì\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÈ\u0001\u0010Â\u0001\u001a\u0005\b^\u0010Ä\u0001\"\u0006\bË\u0001\u0010Æ\u0001R(\u0010Ð\u0001\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bÍ\u0001\u0010»\u0001\u001a\u0006\bÎ\u0001\u0010½\u0001\"\u0005\bÏ\u0001\u0010.R,\u0010Ô\u0001\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\bÑ\u0001\u0010Â\u0001\u001a\u0006\bÒ\u0001\u0010Ä\u0001\"\u0006\bÓ\u0001\u0010Æ\u0001R(\u0010Ú\u0001\u001a\u00020\u000b8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bÕ\u0001\u0010k\u001a\u0006\bÖ\u0001\u0010×\u0001\"\u0006\bØ\u0001\u0010Ù\u0001R(\u0010ß\u0001\u001a\u0002048\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b¼\u0001\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010Ý\u0001\"\u0005\bÞ\u0001\u00106R%\u0010á\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bT\u0010f\u001a\u0005\bÁ\u0001\u0010o\"\u0005\bà\u0001\u0010+R&\u0010å\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bâ\u0001\u0010f\u001a\u0005\bã\u0001\u0010o\"\u0005\bä\u0001\u0010+R&\u0010é\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bæ\u0001\u0010f\u001a\u0005\bç\u0001\u0010o\"\u0005\bè\u0001\u0010+R%\u0010ì\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bk\u0010f\u001a\u0005\bê\u0001\u0010o\"\u0005\bë\u0001\u0010+R&\u0010ð\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bí\u0001\u0010f\u001a\u0005\bî\u0001\u0010o\"\u0005\bï\u0001\u0010+R%\u0010ó\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bE\u0010f\u001a\u0005\bñ\u0001\u0010o\"\u0005\bò\u0001\u0010+R&\u0010ö\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0088\u0001\u0010f\u001a\u0005\bô\u0001\u0010o\"\u0005\bõ\u0001\u0010+R&\u0010ú\u0001\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b÷\u0001\u0010f\u001a\u0005\bø\u0001\u0010o\"\u0005\bù\u0001\u0010+R)\u0010ÿ\u0001\u001a\u00030û\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\bü\u0001\u0010»\u0001\u001a\u0006\bý\u0001\u0010½\u0001\"\u0005\bþ\u0001\u0010.R&\u0010\u0083\u0002\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0080\u0002\u0010f\u001a\u0005\b\u0081\u0002\u0010o\"\u0005\b\u0082\u0002\u0010+R%\u0010\u0086\u0002\u001a\u0002088\u0000@\u0000X\u0080\u000e¢\u0006\u0014\n\u0004\bK\u0010f\u001a\u0005\b\u0084\u0002\u0010o\"\u0005\b\u0085\u0002\u0010+R(\u0010\u0088\u0002\u001a\u00020,8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0081\u0001\u0010»\u0001\u001a\u0006\bæ\u0001\u0010½\u0001\"\u0005\b\u0087\u0002\u0010.R+\u0010\u008a\u0002\u001a\u0005\u0018\u00010À\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\bB\u0010Â\u0001\u001a\u0006\bâ\u0001\u0010Ä\u0001\"\u0006\b\u0089\u0002\u0010Æ\u0001R*\u0010\u0090\u0002\u001a\u0004\u0018\u00010D8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008b\u0002\u0010\u008c\u0002\u001a\u0006\b\u008d\u0002\u0010\u008e\u0002\"\u0005\b\u008f\u0002\u0010FR+\u0010\u0097\u0002\u001a\u0005\u0018\u00010\u0091\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b}\u0010\u0092\u0002\u001a\u0006\b\u0093\u0002\u0010\u0094\u0002\"\u0006\b\u0095\u0002\u0010\u0096\u0002R(\u0010\u009a\u0002\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0085\u0001\u0010»\u0001\u001a\u0006\b\u0098\u0002\u0010½\u0001\"\u0005\b\u0099\u0002\u0010.R(\u0010\u009d\u0002\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u008d\u0002\u0010»\u0001\u001a\u0006\b\u009b\u0002\u0010½\u0001\"\u0005\b\u009c\u0002\u0010.R(\u0010 \u0002\u001a\u00020G8\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0006\b\u0098\u0002\u0010»\u0001\u001a\u0006\b\u009e\u0002\u0010½\u0001\"\u0005\b\u009f\u0002\u0010.R&\u0010£\u0002\u001a\u00020J8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¡\u0002\u0010f\u001a\u0005\bÑ\u0001\u0010o\"\u0005\b¢\u0002\u0010+R(\u0010©\u0002\u001a\u00030¤\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b¥\u0002\u0010^\u001a\u0006\b¦\u0002\u0010§\u0002\"\u0005\b¨\u0002\u0010NR'\u0010\u00ad\u0002\u001a\u00020\u00058\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\bª\u0002\u0010^\u001a\u0006\b«\u0002\u0010§\u0002\"\u0005\b¬\u0002\u0010NR+\u0010´\u0002\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b®\u0002\u0010¯\u0002\u001a\u0006\b°\u0002\u0010±\u0002\"\u0006\b²\u0002\u0010³\u0002R*\u0010·\u0002\u001a\u0004\u0018\u00010\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b3\u0010¯\u0002\u001a\u0006\bµ\u0002\u0010±\u0002\"\u0006\b¶\u0002\u0010³\u0002R\u0015\u0010\u001e\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¸\u0002\u0010oR\u0016\u0010º\u0002\u001a\u0002088VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¹\u0002\u0010oR\u0017\u0010½\u0002\u001a\u00020W8VX\u0096\u0004¢\u0006\b\u001a\u0006\b»\u0002\u0010¼\u0002R'\u0010À\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010T*\t\u0012\u0004\u0012\u00028\u00000¾\u00028VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bf\u0010¿\u0002R\u0017\u0010Á\u0002\u001a\u00020L8@X\u0080\u0004¢\u0006\b\u001a\u0006\bª\u0002\u0010§\u0002R\u0018\u0010Ä\u0002\u001a\u00030Â\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÃ\u0002\u0010§\u0002R\u0018\u0010Ç\u0002\u001a\u00030Å\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÆ\u0002\u0010§\u0002R\u0018\u0010Ê\u0002\u001a\u00030È\u00028@X\u0080\u0004¢\u0006\b\u001a\u0006\bÉ\u0002\u0010§\u0002R\u0017\u0010Í\u0002\u001a\u00020O8@X\u0080\u0004¢\u0006\b\u001a\u0006\bË\u0002\u0010Ì\u0002R\u0017\u0010Ï\u0002\u001a\u00020\u000b8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÎ\u0002\u0010×\u0001R\u0017\u0010Ð\u0002\u001a\u00020R8@X\u0080\u0004¢\u0006\b\u001a\u0006\b®\u0002\u0010§\u0002R\u0017\u0010Ó\u0002\u001a\u00020A8@X\u0080\u0004¢\u0006\b\u001a\u0006\bÑ\u0002\u0010Ò\u0002¨\u0006Ô\u0002"}, d2 = {"Lm1/d;", "Lm1/u;", "", "<init>", "()V", "", "index", "Lr0/i0;", "m2", "(I)Lr0/i0;", "key", "", "active", "Lm1/g;", "style", "Loq/i0;", "a2", "(IZLm1/g;)V", "other", "filterFlags", "y", "(Lm1/d;I)I", "target", "n", "(Lm1/d;)V", "r", "k", "Lm1/t;", "node", "Lc5/d;", "density", "animating", "p2", "(Lm1/g;Lm1/t;Lc5/d;Z)V", "source", "e", "Lq4/b4;", "fallback", "y3", "(Lq4/b4;)Lq4/b4;", "Lc5/h;", "value", "i", "(F)V", "Landroidx/compose/ui/graphics/Color;", "h", "(J)V", "width", "color", "i1", "(FJ)V", "H0", "Ln3/y2;", "h1", "(Ln3/y2;)V", "Lu0/l;", "", "spec", "I1", "(Lu0/l;Lm1/g;)V", "toSpec", "fromSpec", "c", "(Lu0/l;Lu0/l;Lm1/g;)V", "P1", "Lb5/k;", "x0", "(Lb5/k;)V", "Lu4/l;", "q0", "(Lu4/l;)V", "Lc5/v;", "l0", "p0", "Lb5/a;", "v0", "Lu4/y;", "T1", "(I)V", "Lu4/d0;", "f1", "(Lu4/d0;)V", "Lu4/z;", "b0", "T", "Lm1/x;", "Lkotlin/Function2;", "Lm1/w;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37088o, "(Lm1/x;Lm1/g;Ler/p;)V", "x3", "(Lm1/t;Lc5/d;Z)V", "G", "a", "I", "compositeHash", "b", "currentIndex", "Lr0/i0;", "indexStack", "d", "flags", "F", "_density", "f", "_fontScale", "g", "Z", "Lm1/t;", "j", "i0", "()F", "M2", "contentPaddingStart", "e0", "L2", "contentPaddingEnd", "l", "m0", "N2", "contentPaddingTop", "m", "d0", "K2", "contentPaddingBottom", "z0", "R2", "externalPaddingStart", "p", "w0", "Q2", "externalPaddingEnd", "q", "A0", "S2", "externalPaddingTop", "r0", "P2", "externalPaddingBottom", "s", "E2", "borderWidth", "t", "X1", "u3", "v", "N0", "W2", "height", "w", "Y1", "v3", "widthFraction", "x", "P0", "X2", "heightFraction", "T0", "Z2", "left", "z", "Q1", "q3", "top", "A", "q1", "h3", "right", "B", "U", "F2", "bottom", "C", "o1", "f3", "minHeight", ip.a.f96138c, "j1", "d3", "maxHeight", "E", "p1", "g3", "minWidth", "k1", "e3", "maxWidth", "J", "R", "()J", "D2", "borderColor", "Landroidx/compose/ui/graphics/c;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "Landroidx/compose/ui/graphics/c;", "Q", "()Landroidx/compose/ui/graphics/c;", "C2", "(Landroidx/compose/ui/graphics/c;)V", "borderBrush", "K", "v2", "backgroundColor", "t2", "backgroundBrush", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "L0", "setForegroundColor-8_81llA$foundation", "foregroundColor", "O", "K0", "V2", "foregroundBrush", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "W", "()Z", "G2", "(Z)V", "clip", "Ln3/y2;", "E1", "()Ln3/y2;", "n3", "shape", "r2", "alpha", "X", "B1", "l3", "scaleX", "Y", "C1", "m3", "scaleY", "V1", "s3", "translationX", "h0", "W1", "t3", "translationY", "r1", "i3", "rotationX", "v1", "j3", "rotationY", "s0", "y1", "k3", "rotationZ", "Ln3/d3;", "t0", "R1", "r3", "transformOrigin", "u0", "getCameraDistance$foundation", "setCameraDistance$foundation", "cameraDistance", "Z1", "w3", "zIndex", "J2", "contentColor", "I2", "contentBrush", "y0", "Lu4/l;", "B0", "()Lu4/l;", "T2", "fontFamily", "Lb5/s;", "Lb5/s;", "O1", "()Lb5/s;", "p3", "(Lb5/s;)V", "textIndent", "C0", "U2", "fontSize", "d1", "c3", "lineHeight", "W0", "a3", "letterSpacing", "D0", "z2", "baselineShift", "Lb5/f;", "E0", "Z0", "()I", "b3", "lineBreak", "F0", "N1", "o3", "textEnums", "G0", "Ljava/lang/Object;", "o0", "()Ljava/lang/Object;", "O2", "(Ljava/lang/Object;)V", "dropShadow", "S0", "Y2", "innerShadow", "getDensity", "i2", "fontScale", "G1", "()Lm1/w;", "state", "Lm2/z;", "(Lm2/z;)Ljava/lang/Object;", "currentValue", "fontStyle", "Lb5/j;", "J1", "textAlign", "Lb5/l;", "M1", "textDirection", "Lb5/e;", "R0", "hyphens", "I0", "()Lu4/d0;", "fontWeight", "h2", "isFontWeightSpecified", "fontSynthesis", "K1", "()Lb5/k;", "textDecoration", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class d implements u {

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private long fontSize;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private long lineHeight;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private long letterSpacing;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private float baselineShift;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private int lineBreak;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private int textEnums;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private long borderColor;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private Object dropShadow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.c borderBrush;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private Object innerShadow;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private long backgroundColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.c backgroundBrush;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private long foregroundColor;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private androidx.compose.ui.graphics.c foregroundBrush;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private boolean clip;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private y2 shape;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private float alpha;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private float scaleX;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private float scaleY;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private float translationX;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private int compositeHash;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private int currentIndex;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private i0 indexStack;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    public int flags;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean animating;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private t node;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private float translationY;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float contentPaddingStart;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private float contentPaddingEnd;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private float contentPaddingTop;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private float contentPaddingBottom;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private float externalPaddingStart;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private float externalPaddingEnd;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private float externalPaddingTop;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private float rotationX;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private float externalPaddingBottom;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private float rotationY;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private float borderWidth;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private float rotationZ;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private long transformOrigin;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private float cameraDistance;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private float zIndex;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private long contentColor;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.graphics.c contentBrush;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private u4.l fontFamily;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private TextIndent textIndent;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private float _density = 1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private float _fontScale = 1.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private float width = Float.NaN;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private float height = Float.NaN;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private float widthFraction = Float.NaN;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private float heightFraction = Float.NaN;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private float left = Float.NaN;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private float top = Float.NaN;

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private float right = Float.NaN;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private float bottom = Float.NaN;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private float minHeight = Float.NaN;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private float maxHeight = Float.NaN;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private float minWidth = Float.NaN;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private float maxWidth = Float.NaN;

    public d() {
        Color.Companion companion = Color.INSTANCE;
        this.borderColor = companion.a();
        this.backgroundColor = companion.g();
        this.foregroundColor = companion.h();
        this.shape = t2.a();
        this.alpha = 1.0f;
        this.scaleX = 1.0f;
        this.scaleY = 1.0f;
        this.transformOrigin = d3.INSTANCE.a();
        this.cameraDistance = 1.0f;
        this.contentColor = companion.h();
        c5.v.Companion companion2 = c5.v.INSTANCE;
        this.fontSize = companion2.a();
        this.lineHeight = companion2.a();
        this.letterSpacing = companion2.a();
        this.baselineShift = b5.a.INSTANCE.b();
        this.lineBreak = b5.f.INSTANCE.b();
    }

    public static /* synthetic */ int E(d dVar, d dVar2, int i15, int i16, Object obj) {
        if ((i16 & 2) != 0) {
            i15 = -1;
        }
        return dVar.y(dVar2, i15);
    }

    private final void a2(int key, boolean active, g style) {
        if (!active) {
            this.currentIndex++;
            return;
        }
        int i15 = this.currentIndex;
        int i16 = key ^ i15;
        this.compositeHash = f.q(this.compositeHash, i16);
        i0 i0VarM2 = m2(i15);
        this.currentIndex = 0;
        style.a(this);
        this.currentIndex = i0VarM2.p(i0VarM2._size - 1) + 1;
        this.compositeHash = f.r(this.compositeHash, i16);
    }

    private final i0 m2(int index) {
        i0 i0Var = this.indexStack;
        if (i0Var == null) {
            i0Var = new i0(0, 1, null);
            this.indexStack = i0Var;
        }
        i0Var.k(index);
        return i0Var;
    }

    /* JADX INFO: renamed from: A0, reason: from getter */
    public final float getExternalPaddingTop() {
        return this.externalPaddingTop;
    }

    /* JADX INFO: renamed from: B0, reason: from getter */
    public final u4.l getFontFamily() {
        return this.fontFamily;
    }

    /* JADX INFO: renamed from: B1, reason: from getter */
    public final float getScaleX() {
        return this.scaleX;
    }

    /* JADX INFO: renamed from: C0, reason: from getter */
    public final long getFontSize() {
        return this.fontSize;
    }

    /* JADX INFO: renamed from: C1, reason: from getter */
    public final float getScaleY() {
        return this.scaleY;
    }

    public final void C2(androidx.compose.ui.graphics.c cVar) {
        this.borderBrush = cVar;
    }

    public final void D2(long j15) {
        this.borderColor = j15;
    }

    /* JADX INFO: renamed from: E1, reason: from getter */
    public final y2 getShape() {
        return this.shape;
    }

    public final void E2(float f15) {
        this.borderWidth = f15;
    }

    @Override // p076m2.a0
    public <T> T F(p076m2.z<T> zVar) {
        return (T) g4.f.a(this.node, zVar);
    }

    public final int F0() {
        return (this.textEnums & 1) == 1 ? u4.y.INSTANCE.a() : u4.y.INSTANCE.b();
    }

    public final void F2(float f15) {
        this.bottom = f15;
    }

    public final void G() {
        this.node = null;
        this.animating = false;
    }

    public final int G0() {
        return u4.z.INSTANCE.e(((this.textEnums & 15360) >> 10) & 7);
    }

    public w G1() {
        return this.node.get_state();
    }

    public final void G2(boolean z15) {
        this.clip = z15;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final float getAlpha() {
        return this.alpha;
    }

    @Override // m1.u
    public void H0(long color) {
        this.flags |= 2;
        this.backgroundColor = color;
        this.backgroundBrush = null;
    }

    @Override // m1.u
    public <T> void H1(x<T> key, g value, er.p<? super x<T>, ? super w, Boolean> active) {
        a2(key.hashCode(), active.B(key, G1()).booleanValue(), value);
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final androidx.compose.ui.graphics.c getBackgroundBrush() {
        return this.backgroundBrush;
    }

    public final FontWeight I0() {
        return new FontWeight((this.textEnums & 134086656) >> 17);
    }

    @Override // m1.u
    public void I1(u0.l<Float> spec, g value) {
        c(spec, spec, value);
    }

    public final void I2(androidx.compose.ui.graphics.c cVar) {
        this.contentBrush = cVar;
    }

    public final int J1() {
        return b5.j.INSTANCE.h((this.textEnums & 28) >> 2);
    }

    public final void J2(long j15) {
        this.contentColor = j15;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getBackgroundColor() {
        return this.backgroundColor;
    }

    /* JADX INFO: renamed from: K0, reason: from getter */
    public final androidx.compose.ui.graphics.c getForegroundBrush() {
        return this.foregroundBrush;
    }

    public final b5.k K1() {
        return b5.k.INSTANCE.e(((this.textEnums & 114688) >> 14) & 3);
    }

    public final void K2(float f15) {
        this.contentPaddingBottom = f15;
    }

    /* JADX INFO: renamed from: L0, reason: from getter */
    public final long getForegroundColor() {
        return this.foregroundColor;
    }

    public final void L2(float f15) {
        this.contentPaddingEnd = f15;
    }

    public final int M1() {
        return b5.l.INSTANCE.g((this.textEnums & 112) >> 4);
    }

    public final void M2(float f15) {
        this.contentPaddingStart = f15;
    }

    /* JADX INFO: renamed from: N0, reason: from getter */
    public final float getHeight() {
        return this.height;
    }

    /* JADX INFO: renamed from: N1, reason: from getter */
    public final int getTextEnums() {
        return this.textEnums;
    }

    public final void N2(float f15) {
        this.contentPaddingTop = f15;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final float getBaselineShift() {
        return this.baselineShift;
    }

    /* JADX INFO: renamed from: O1, reason: from getter */
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    public final void O2(Object obj) {
        this.dropShadow = obj;
    }

    /* JADX INFO: renamed from: P0, reason: from getter */
    public final float getHeightFraction() {
        return this.heightFraction;
    }

    @Override // m1.u
    public void P1(long value) {
        this.flags |= 64;
        this.contentColor = value;
        this.contentBrush = null;
    }

    public final void P2(float f15) {
        this.externalPaddingBottom = f15;
    }

    /* JADX INFO: renamed from: Q, reason: from getter */
    public final androidx.compose.ui.graphics.c getBorderBrush() {
        return this.borderBrush;
    }

    /* JADX INFO: renamed from: Q1, reason: from getter */
    public final float getTop() {
        return this.top;
    }

    public final void Q2(float f15) {
        this.externalPaddingEnd = f15;
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final long getBorderColor() {
        return this.borderColor;
    }

    public final int R0() {
        return b5.e.INSTANCE.d((this.textEnums & 768) >> 8);
    }

    /* JADX INFO: renamed from: R1, reason: from getter */
    public final long getTransformOrigin() {
        return this.transformOrigin;
    }

    public final void R2(float f15) {
        this.externalPaddingStart = f15;
    }

    /* JADX INFO: renamed from: S0, reason: from getter */
    public final Object getInnerShadow() {
        return this.innerShadow;
    }

    public final void S2(float f15) {
        this.externalPaddingTop = f15;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final float getBorderWidth() {
        return this.borderWidth;
    }

    /* JADX INFO: renamed from: T0, reason: from getter */
    public final float getLeft() {
        return this.left;
    }

    @Override // m1.u
    public void T1(int value) {
        this.flags |= 32;
        this.textEnums = ((value | 2) & 3) | (this.textEnums & (-4));
    }

    public final void T2(u4.l lVar) {
        this.fontFamily = lVar;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final float getBottom() {
        return this.bottom;
    }

    public final void U2(long j15) {
        this.fontSize = j15;
    }

    /* JADX INFO: renamed from: V1, reason: from getter */
    public final float getTranslationX() {
        return this.translationX;
    }

    public final void V2(androidx.compose.ui.graphics.c cVar) {
        this.foregroundBrush = cVar;
    }

    /* JADX INFO: renamed from: W, reason: from getter */
    public final boolean getClip() {
        return this.clip;
    }

    /* JADX INFO: renamed from: W0, reason: from getter */
    public final long getLetterSpacing() {
        return this.letterSpacing;
    }

    /* JADX INFO: renamed from: W1, reason: from getter */
    public final float getTranslationY() {
        return this.translationY;
    }

    public final void W2(float f15) {
        this.height = f15;
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final androidx.compose.ui.graphics.c getContentBrush() {
        return this.contentBrush;
    }

    /* JADX INFO: renamed from: X1, reason: from getter */
    public final float getWidth() {
        return this.width;
    }

    public final void X2(float f15) {
        this.heightFraction = f15;
    }

    /* JADX INFO: renamed from: Y, reason: from getter */
    public final long getContentColor() {
        return this.contentColor;
    }

    /* JADX INFO: renamed from: Y1, reason: from getter */
    public final float getWidthFraction() {
        return this.widthFraction;
    }

    public final void Y2(Object obj) {
        this.innerShadow = obj;
    }

    /* JADX INFO: renamed from: Z0, reason: from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* JADX INFO: renamed from: Z1, reason: from getter */
    public final float getZIndex() {
        return this.zIndex;
    }

    public final void Z2(float f15) {
        this.left = f15;
    }

    public final void a3(long j15) {
        this.letterSpacing = j15;
    }

    @Override // m1.u
    public void b0(int value) {
        this.flags |= 32;
        this.textEnums = (((value & 7) | 8) << 10) | this.textEnums;
    }

    public final void b3(int i15) {
        this.lineBreak = i15;
    }

    public void c(u0.l<Float> toSpec, u0.l<Float> fromSpec, g value) {
        this.flags |= 16;
        int i15 = this.currentIndex;
        int i16 = 1318433304 ^ i15;
        this.compositeHash = f.q(this.compositeHash, i16);
        i0 i0VarM2 = m2(i15);
        this.currentIndex = 0;
        if (this.animating) {
            v.a(this, value);
        } else {
            t tVar = this.node;
            h hVarL3 = tVar.getAnimations();
            if (hVarL3 == null) {
                hVarL3 = new h(tVar);
                tVar.f4(hVarL3);
            }
            hVarL3.i(this.compositeHash ^ this.currentIndex, value, toSpec, fromSpec);
        }
        this.currentIndex = i0VarM2.p(i0VarM2._size - 1) + 1;
        this.compositeHash = f.r(this.compositeHash, i16);
    }

    public final void c3(long j15) {
        this.lineHeight = j15;
    }

    /* JADX INFO: renamed from: d0, reason: from getter */
    public final float getContentPaddingBottom() {
        return this.contentPaddingBottom;
    }

    /* JADX INFO: renamed from: d1, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public final void d3(float f15) {
        this.maxHeight = f15;
    }

    public final void e(d source) {
        int i15 = source.flags & 96;
        if (i15 == 0) {
            return;
        }
        this.flags = i15 | this.flags;
        long j15 = source.contentColor;
        long j16 = this.contentColor;
        if (j15 == 16) {
            j15 = j16;
        }
        this.contentColor = j15;
        androidx.compose.ui.graphics.c cVar = source.contentBrush;
        if (cVar == null) {
            cVar = this.contentBrush;
        }
        this.contentBrush = cVar;
        u4.l lVar = source.fontFamily;
        if (lVar == null) {
            lVar = this.fontFamily;
        }
        this.fontFamily = lVar;
        TextIndent textIndent = source.textIndent;
        if (textIndent == null) {
            textIndent = this.textIndent;
        }
        this.textIndent = textIndent;
        long j17 = source.fontSize;
        long j18 = this.fontSize;
        if (c5.v.f(j17) == 0) {
            j17 = j18;
        }
        this.fontSize = j17;
        long j19 = source.lineHeight;
        long j25 = this.lineHeight;
        if (c5.v.f(j19) == 0) {
            j19 = j25;
        }
        this.lineHeight = j19;
        long j26 = source.letterSpacing;
        long j27 = this.letterSpacing;
        if (c5.v.f(j26) == 0) {
            j26 = j27;
        }
        this.letterSpacing = j26;
        float f15 = source.baselineShift;
        float f16 = this.baselineShift;
        if (!b5.a.f(f15, b5.a.INSTANCE.b())) {
            f15 = f16;
        }
        this.baselineShift = f15;
        int i16 = source.lineBreak;
        int i17 = this.lineBreak;
        if (b5.f.f(i16, b5.f.INSTANCE.b())) {
            i16 = i17;
        }
        this.lineBreak = i16;
        int i18 = this.textEnums;
        int i19 = source.textEnums;
        int i25 = i19 & 3;
        int i26 = i18 & (-4);
        if (i25 != 0) {
            i18 = i25;
        }
        int i27 = i18 | i26;
        int i28 = i19 & 28;
        int i29 = i27 & (-29);
        if (i28 != 0) {
            i27 = i28;
        }
        int i35 = i27 | i29;
        int i36 = i19 & 112;
        int i37 = i35 & (-113);
        if (i36 != 0) {
            i35 = i36;
        }
        int i38 = i35 | i37;
        int i39 = i19 & 768;
        int i45 = i38 & (-769);
        if (i39 != 0) {
            i38 = i39;
        }
        int i46 = i38 | i45;
        int i47 = i19 & 15360;
        int i48 = i46 & (-15361);
        if (i47 != 0) {
            i46 = i47;
        }
        int i49 = i46 | i48;
        int i55 = i19 & 134086656;
        int i56 = (-134086657) & i49;
        if (i55 != 0) {
            i49 = i55;
        }
        this.textEnums = i56 | i49;
    }

    /* JADX INFO: renamed from: e0, reason: from getter */
    public final float getContentPaddingEnd() {
        return this.contentPaddingEnd;
    }

    public final void e3(float f15) {
        this.maxWidth = f15;
    }

    @Override // m1.u
    public void f1(FontWeight value) {
        this.flags |= 32;
        this.textEnums = ((value.p() << 17) & 134086656) | (this.textEnums & (-134086657));
    }

    public final void f3(float f15) {
        this.minHeight = f15;
    }

    public final void g3(float f15) {
        this.minWidth = f15;
    }

    @Override // c5.d
    public float getDensity() {
        return this._density;
    }

    public void h(long value) {
        this.flags |= 2;
        this.borderColor = value;
        this.borderBrush = null;
    }

    @Override // m1.u
    public void h1(y2 value) {
        this.flags |= 6;
        this.shape = value;
    }

    public final boolean h2() {
        return ((this.textEnums & 134086656) >> 17) != 0;
    }

    public final void h3(float f15) {
        this.right = f15;
    }

    public void i(float value) {
        float fCeil;
        this.flags |= 3;
        c5.h.Companion companion = c5.h.INSTANCE;
        if (c5.h.p(value, companion.c())) {
            fCeil = 0.0f;
        } else {
            fCeil = c5.h.p(value, companion.a()) ? 1.0f : (float) Math.ceil(value * this._density);
        }
        this.borderWidth = fCeil;
    }

    /* JADX INFO: renamed from: i0, reason: from getter */
    public final float getContentPaddingStart() {
        return this.contentPaddingStart;
    }

    @Override // m1.u
    public void i1(float width, long color) {
        i(width);
        h(color);
    }

    @Override // c5.l
    /* JADX INFO: renamed from: i2, reason: from getter */
    public float getFontScale() {
        return this._fontScale;
    }

    public final void i3(float f15) {
        this.rotationX = f15;
    }

    /* JADX INFO: renamed from: j1, reason: from getter */
    public final float getMaxHeight() {
        return this.maxHeight;
    }

    public final void j3(float f15) {
        this.rotationY = f15;
    }

    public final void k() {
        f.f122385b.r(this);
    }

    /* JADX INFO: renamed from: k1, reason: from getter */
    public final float getMaxWidth() {
        return this.maxWidth;
    }

    public final void k3(float f15) {
        this.rotationZ = f15;
    }

    @Override // m1.u
    public void l0(long value) {
        this.flags |= 32;
        this.fontSize = value;
    }

    public final void l3(float f15) {
        this.scaleX = f15;
    }

    /* JADX INFO: renamed from: m0, reason: from getter */
    public final float getContentPaddingTop() {
        return this.contentPaddingTop;
    }

    public final void m3(float f15) {
        this.scaleY = f15;
    }

    public final void n(d target) {
        target.contentColor = this.contentColor;
        target.contentBrush = this.contentBrush;
        target.fontFamily = this.fontFamily;
        target.textIndent = this.textIndent;
        target.fontSize = this.fontSize;
        target.lineHeight = this.lineHeight;
        target.letterSpacing = this.letterSpacing;
        target.baselineShift = this.baselineShift;
        target.lineBreak = this.lineBreak;
        target.textEnums = this.textEnums;
    }

    public final void n3(y2 y2Var) {
        this.shape = y2Var;
    }

    /* JADX INFO: renamed from: o0, reason: from getter */
    public final Object getDropShadow() {
        return this.dropShadow;
    }

    /* JADX INFO: renamed from: o1, reason: from getter */
    public final float getMinHeight() {
        return this.minHeight;
    }

    public final void o3(int i15) {
        this.textEnums = i15;
    }

    @Override // m1.u
    public void p0(long value) {
        this.flags |= 32;
        this.letterSpacing = value;
    }

    /* JADX INFO: renamed from: p1, reason: from getter */
    public final float getMinWidth() {
        return this.minWidth;
    }

    public final void p2(g style, t node, c5.d density, boolean animating) {
        x3(node, density, animating);
        style.a(this);
        G();
    }

    public final void p3(TextIndent textIndent) {
        this.textIndent = textIndent;
    }

    @Override // m1.u
    public void q0(u4.l value) {
        this.flags |= 32;
        this.fontFamily = value;
    }

    /* JADX INFO: renamed from: q1, reason: from getter */
    public final float getRight() {
        return this.right;
    }

    public final void q3(float f15) {
        this.top = f15;
    }

    public final void r(d target) {
        target.flags = this.flags;
        target.left = this.left;
        target.top = this.top;
        target.right = this.right;
        target.bottom = this.bottom;
        target.minHeight = this.minHeight;
        target.maxHeight = this.maxHeight;
        target.minWidth = this.minWidth;
        target.maxWidth = this.maxWidth;
        target.contentPaddingStart = this.contentPaddingStart;
        target.contentPaddingEnd = this.contentPaddingEnd;
        target.contentPaddingTop = this.contentPaddingTop;
        target.contentPaddingBottom = this.contentPaddingBottom;
        target.externalPaddingStart = this.externalPaddingStart;
        target.externalPaddingEnd = this.externalPaddingEnd;
        target.externalPaddingTop = this.externalPaddingTop;
        target.externalPaddingBottom = this.externalPaddingBottom;
        target.borderWidth = this.borderWidth;
        target.shape = this.shape;
        target.alpha = this.alpha;
        target.scaleX = this.scaleX;
        target.scaleY = this.scaleY;
        target.translationX = this.translationX;
        target.translationY = this.translationY;
        target.rotationX = this.rotationX;
        target.rotationY = this.rotationY;
        target.rotationZ = this.rotationZ;
        target.transformOrigin = this.transformOrigin;
        target.zIndex = this.zIndex;
        target.cameraDistance = this.cameraDistance;
        target.borderColor = this.borderColor;
        target.borderBrush = this.borderBrush;
        target.backgroundColor = this.backgroundColor;
        target.backgroundBrush = this.backgroundBrush;
        target.foregroundBrush = this.foregroundBrush;
        target.dropShadow = this.dropShadow;
        target.innerShadow = this.innerShadow;
        target.clip = this.clip;
        target.width = this.width;
        target.height = this.height;
        target.widthFraction = this.widthFraction;
        target.heightFraction = this.heightFraction;
        n(target);
    }

    /* JADX INFO: renamed from: r0, reason: from getter */
    public final float getExternalPaddingBottom() {
        return this.externalPaddingBottom;
    }

    /* JADX INFO: renamed from: r1, reason: from getter */
    public final float getRotationX() {
        return this.rotationX;
    }

    public final void r2(float f15) {
        this.alpha = f15;
    }

    public final void r3(long j15) {
        this.transformOrigin = j15;
    }

    public final void s3(float f15) {
        this.translationX = f15;
    }

    public final void t2(androidx.compose.ui.graphics.c cVar) {
        this.backgroundBrush = cVar;
    }

    public final void t3(float f15) {
        this.translationY = f15;
    }

    public final void u3(float f15) {
        this.width = f15;
    }

    @Override // m1.u
    public void v0(float value) {
        this.flags |= 32;
        this.baselineShift = value;
    }

    /* JADX INFO: renamed from: v1, reason: from getter */
    public final float getRotationY() {
        return this.rotationY;
    }

    public final void v2(long j15) {
        this.backgroundColor = j15;
    }

    public final void v3(float f15) {
        this.widthFraction = f15;
    }

    /* JADX INFO: renamed from: w0, reason: from getter */
    public final float getExternalPaddingEnd() {
        return this.externalPaddingEnd;
    }

    public final void w3(float f15) {
        this.zIndex = f15;
    }

    @Override // m1.u
    public void x0(b5.k value) {
        this.flags |= 64;
        this.textEnums = ((value.getMask() | 4) << 14) | this.textEnums;
    }

    public final void x3(t node, c5.d density, boolean animating) {
        this.currentIndex = 0;
        this.compositeHash = 0;
        this.node = node;
        this._density = density.getDensity();
        this.animating = animating;
    }

    public final int y(d other, int filterFlags) {
        int i15 = this.flags;
        int i16 = other.flags;
        int i17 = i15 ^ i16;
        int i18 = filterFlags & i15 & i16;
        if ((i18 & 1) != 0 && (this.contentPaddingStart != other.contentPaddingStart || this.contentPaddingEnd != other.contentPaddingEnd || this.contentPaddingTop != other.contentPaddingTop || this.contentPaddingBottom != other.contentPaddingBottom || this.borderWidth != other.borderWidth)) {
            i17 |= 1;
        }
        if ((i18 & 8) != 0 && (this.width != other.width || this.height != other.height || this.widthFraction != other.widthFraction || this.heightFraction != other.heightFraction || this.externalPaddingStart != other.externalPaddingStart || this.externalPaddingEnd != other.externalPaddingEnd || this.externalPaddingTop != other.externalPaddingTop || this.externalPaddingBottom != other.externalPaddingBottom || Float.floatToRawIntBits(this.left) != Float.floatToRawIntBits(other.left) || Float.floatToRawIntBits(this.top) != Float.floatToRawIntBits(other.top) || Float.floatToRawIntBits(this.right) != Float.floatToRawIntBits(other.right) || Float.floatToRawIntBits(this.bottom) != Float.floatToRawIntBits(other.bottom) || Float.floatToRawIntBits(this.minWidth) != Float.floatToRawIntBits(other.minWidth) || Float.floatToRawIntBits(this.maxWidth) != Float.floatToRawIntBits(other.maxWidth) || Float.floatToRawIntBits(this.minHeight) != Float.floatToRawIntBits(other.minHeight) || Float.floatToRawIntBits(this.maxHeight) != Float.floatToRawIntBits(other.maxHeight))) {
            i17 |= 8;
        }
        if ((i18 & 2) != 0 && (this.borderWidth != other.borderWidth || !Color.m11equalsimpl0(this.borderColor, other.borderColor) || !fr.t.c(this.borderBrush, other.borderBrush) || !Color.m11equalsimpl0(this.backgroundColor, other.backgroundColor) || !fr.t.c(this.backgroundBrush, other.backgroundBrush) || !fr.t.c(this.foregroundBrush, other.foregroundBrush) || !fr.t.c(this.innerShadow, other.innerShadow) || !fr.t.c(this.dropShadow, other.dropShadow) || !fr.t.c(this.shape, other.shape))) {
            i17 |= 2;
        }
        if ((i18 & 4) != 0 && (this.alpha != other.alpha || this.scaleX != other.scaleX || this.scaleY != other.scaleY || this.translationX != other.translationX || this.translationY != other.translationY || this.rotationX != other.rotationX || this.rotationY != other.rotationY || this.rotationZ != other.rotationZ || !d3.e(this.transformOrigin, other.transformOrigin) || this.clip != other.clip)) {
            i17 |= 4;
        }
        if (!fr.t.c(this.shape, other.shape)) {
            i17 |= 6;
        }
        if ((i18 & 64) != 0 && (!Color.m11equalsimpl0(this.contentColor, other.contentColor) || !fr.t.c(this.contentBrush, other.contentBrush))) {
            i17 |= 64;
        }
        return ((i18 & 32) == 0 || (fr.t.c(this.fontFamily, other.fontFamily) && fr.t.c(this.textIndent, other.textIndent) && c5.v.e(this.fontSize, other.fontSize) && c5.v.e(this.lineHeight, other.lineHeight) && c5.v.e(this.letterSpacing, other.letterSpacing) && b5.a.f(this.baselineShift, other.baselineShift) && b5.f.f(this.lineBreak, other.lineBreak) && this.textEnums == other.textEnums)) ? i17 : i17 | 96;
    }

    /* JADX INFO: renamed from: y1, reason: from getter */
    public final float getRotationZ() {
        return this.rotationZ;
    }

    public final TextStyle y3(TextStyle fallback) {
        d dVar = f.f122385b;
        long j15 = this.contentColor;
        if (j15 == 16) {
            j15 = fallback.j();
        }
        long j16 = j15;
        long j17 = this.fontSize;
        long jN = fallback.n();
        if (!(c5.v.f(j17) == 0)) {
            jN = j17;
        }
        FontWeight fontWeightI0 = h2() ? I0() : fallback.q();
        u4.y yVarC = !u4.y.f(F0(), dVar.F0()) ? u4.y.c(F0()) : fallback.o();
        u4.z zVarE = !u4.z.h(G0(), dVar.G0()) ? u4.z.e(G0()) : fallback.p();
        u4.l lVarL = this.fontFamily;
        if (lVarL == null) {
            lVarL = fallback.l();
        }
        String strM = fallback.m();
        long j18 = this.letterSpacing;
        long jS = fallback.s();
        if (c5.v.f(j18) == 0) {
            j18 = jS;
        }
        b5.a aVarC = !Float.isNaN(this.baselineShift) ? b5.a.c(this.baselineShift) : fallback.h();
        TextGeometricTransform textGeometricTransformE = fallback.E();
        LocaleList localeListW = fallback.w();
        long jG = fallback.g();
        b5.k kVarK1 = !fr.t.c(K1(), dVar.K1()) ? K1() : fallback.C();
        Shadow shadowZ = fallback.z();
        p3.g gVarK = fallback.k();
        int iJ1 = !b5.j.k(J1(), dVar.J1()) ? J1() : fallback.B();
        int iM1 = !b5.l.j(M1(), dVar.M1()) ? M1() : fallback.D();
        FontWeight fontWeight = fontWeightI0;
        long j19 = this.lineHeight;
        long jU = !((c5.v.f(j19) > 0L ? 1 : (c5.v.f(j19) == 0L ? 0 : -1)) == 0) ? j19 : fallback.u();
        TextIndent textIndentF = this.textIndent;
        if (textIndentF == null) {
            textIndentF = fallback.F();
        }
        PlatformTextStyle platformStyle = fallback.getPlatformStyle();
        LineHeightStyle lineHeightStyleV = fallback.v();
        int i15 = this.lineBreak;
        int iT = fallback.t();
        TextIndent textIndent = textIndentF;
        if (b5.f.f(i15, b5.f.INSTANCE.b())) {
            i15 = iT;
        }
        b5.a aVar = aVarC;
        b5.k kVar = kVarK1;
        u4.y yVar = yVarC;
        TextStyle textStyle = new TextStyle(j16, jN, fontWeight, yVar, zVarE, lVarL, strM, j18, aVar, textGeometricTransformE, localeListW, jG, kVar, shadowZ, gVarK, iJ1, iM1, jU, textIndent, platformStyle, lineHeightStyleV, i15, !b5.e.g(R0(), dVar.R0()) ? R0() : fallback.r(), fallback.G(), null);
        androidx.compose.ui.graphics.c cVar = this.contentBrush;
        return cVar != null ? TextStyle.c(textStyle, cVar, 0.0f, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 33554430, null) : textStyle;
    }

    /* JADX INFO: renamed from: z0, reason: from getter */
    public final float getExternalPaddingStart() {
        return this.externalPaddingStart;
    }

    public final void z2(float f15) {
        this.baselineShift = f15;
    }
}
