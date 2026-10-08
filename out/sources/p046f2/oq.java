package p046f2;

import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import fr.k;
import ip.a;
import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0003\bß\u0001\b\u0001\u0018\u00002\u00020\u0001B¿\u0005\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002\u0012\u0006\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\u0006\u0010\u0014\u001a\u00020\u0002\u0012\u0006\u0010\u0015\u001a\u00020\u0002\u0012\u0006\u0010\u0016\u001a\u00020\u0002\u0012\u0006\u0010\u0017\u001a\u00020\u0002\u0012\u0006\u0010\u0018\u001a\u00020\u0002\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0006\u0010\u001a\u001a\u00020\u0002\u0012\u0006\u0010\u001b\u001a\u00020\u0002\u0012\u0006\u0010\u001c\u001a\u00020\u0002\u0012\u0006\u0010\u001d\u001a\u00020\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u0002\u0012\u0006\u0010\u001f\u001a\u00020\u0002\u0012\u0006\u0010 \u001a\u00020\u0002\u0012\u0006\u0010!\u001a\u00020\u0002\u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\u0006\u0010#\u001a\u00020\u0002\u0012\u0006\u0010$\u001a\u00020\u0002\u0012\u0006\u0010%\u001a\u00020\u0002\u0012\u0006\u0010&\u001a\u00020\u0002\u0012\u0006\u0010'\u001a\u00020\u0002\u0012\u0006\u0010(\u001a\u00020\u0002\u0012\u0006\u0010)\u001a\u00020\u0002\u0012\u0006\u0010*\u001a\u00020\u0002\u0012\u0006\u0010+\u001a\u00020\u0002\u0012\u0006\u0010,\u001a\u00020\u0002\u0012\u0006\u0010-\u001a\u00020\u0002\u0012\u0006\u0010.\u001a\u00020\u0002\u0012\u0006\u0010/\u001a\u00020\u0002\u0012\u0006\u00100\u001a\u00020\u0002\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u0002\u0012\u0006\u00103\u001a\u00020\u0002\u0012\u0006\u00104\u001a\u00020\u0002\u0012\u0006\u00105\u001a\u00020\u0002\u0012\u0006\u00106\u001a\u00020\u0002\u0012\u0006\u00107\u001a\u00020\u0002\u0012\u0006\u00108\u001a\u00020\u0002\u0012\u0006\u00109\u001a\u00020\u0002\u0012\u0006\u0010:\u001a\u00020\u0002\u0012\u0006\u0010;\u001a\u00020\u0002\u0012\u0006\u0010<\u001a\u00020\u0002\u0012\u0006\u0010=\u001a\u00020\u0002\u0012\u0006\u0010>\u001a\u00020\u0002\u0012\u0006\u0010?\u001a\u00020\u0002\u0012\u0006\u0010@\u001a\u00020\u0002\u0012\u0006\u0010A\u001a\u00020\u0002\u0012\u0006\u0010B\u001a\u00020\u0002\u0012\u0006\u0010C\u001a\u00020\u0002\u0012\u0006\u0010D\u001a\u00020\u0002\u0012\u0006\u0010E\u001a\u00020\u0002\u0012\u0006\u0010F\u001a\u00020\u0002\u0012\u0006\u0010G\u001a\u00020\u0002\u0012\u0006\u0010H\u001a\u00020\u0002\u0012\u0006\u0010I\u001a\u00020\u0002\u0012\u0006\u0010J\u001a\u00020\u0002\u0012\u0006\u0010K\u001a\u00020\u0002\u0012\u0006\u0010L\u001a\u00020\u0002\u0012\u0006\u0010M\u001a\u00020\u0002\u0012\u0006\u0010N\u001a\u00020\u0002\u0012\u0006\u0010O\u001a\u00020\u0002\u0012\u0006\u0010P\u001a\u00020\u0002\u0012\u0006\u0010Q\u001a\u00020\u0002\u0012\u0006\u0010R\u001a\u00020\u0002\u0012\u0006\u0010S\u001a\u00020\u0002\u0012\u0006\u0010T\u001a\u00020\u0002\u0012\u0006\u0010U\u001a\u00020\u0002\u0012\u0006\u0010V\u001a\u00020\u0002\u0012\u0006\u0010W\u001a\u00020\u0002\u0012\u0006\u0010X\u001a\u00020\u0002\u0012\u0006\u0010Y\u001a\u00020\u0002¢\u0006\u0004\bZ\u0010[R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b`\u0010]\u001a\u0004\ba\u0010_R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bb\u0010]\u001a\u0004\bc\u0010_R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bd\u0010]\u001a\u0004\be\u0010_R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bf\u0010]\u001a\u0004\bg\u0010_R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bh\u0010]\u001a\u0004\bi\u0010_R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bj\u0010]\u001a\u0004\bk\u0010_R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bl\u0010]\u001a\u0004\bm\u0010_R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bn\u0010]\u001a\u0004\bo\u0010_R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bp\u0010]\u001a\u0004\bq\u0010_R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\br\u0010]\u001a\u0004\bs\u0010_R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bt\u0010]\u001a\u0004\bu\u0010_R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bv\u0010]\u001a\u0004\bw\u0010_R\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bx\u0010]\u001a\u0004\by\u0010_R\u0017\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\bz\u0010]\u001a\u0004\b{\u0010_R\u0017\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b|\u0010]\u001a\u0004\b}\u0010_R\u0017\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b~\u0010]\u001a\u0004\b\u007f\u0010_R\u0019\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0080\u0001\u0010]\u001a\u0005\b\u0081\u0001\u0010_R\u0019\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010]\u001a\u0005\b\u0083\u0001\u0010_R\u0019\u0010\u0016\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0084\u0001\u0010]\u001a\u0005\b\u0085\u0001\u0010_R\u0019\u0010\u0017\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0086\u0001\u0010]\u001a\u0005\b\u0087\u0001\u0010_R\u0019\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010]\u001a\u0005\b\u0089\u0001\u0010_R\u0019\u0010\u0019\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008a\u0001\u0010]\u001a\u0005\b\u008b\u0001\u0010_R\u0019\u0010\u001a\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008c\u0001\u0010]\u001a\u0005\b\u008d\u0001\u0010_R\u0018\u0010\u001b\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u008e\u0001\u0010]\u001a\u0004\bb\u0010_R\u0019\u0010\u001c\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u008f\u0001\u0010]\u001a\u0005\b\u0090\u0001\u0010_R\u0019\u0010\u001d\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010]\u001a\u0005\b\u0086\u0001\u0010_R\u0019\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0092\u0001\u0010]\u001a\u0005\b\u0084\u0001\u0010_R\u0019\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0093\u0001\u0010]\u001a\u0005\b\u0082\u0001\u0010_R\u0019\u0010 \u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0094\u0001\u0010]\u001a\u0005\b\u0080\u0001\u0010_R\u0018\u0010!\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0095\u0001\u0010]\u001a\u0004\b~\u0010_R\u0018\u0010\"\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0096\u0001\u0010]\u001a\u0004\b|\u0010_R\u0018\u0010#\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0097\u0001\u0010]\u001a\u0004\bz\u0010_R\u0018\u0010$\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u0098\u0001\u0010]\u001a\u0004\bx\u0010_R\u0019\u0010%\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0099\u0001\u0010]\u001a\u0005\b\u009a\u0001\u0010_R\u0017\u0010&\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b]\u0010]\u001a\u0004\bv\u0010_R\u0018\u0010'\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u009b\u0001\u0010]\u001a\u0004\br\u0010_R\u0019\u0010(\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u009c\u0001\u0010]\u001a\u0005\b\u009d\u0001\u0010_R\u0018\u0010)\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u009e\u0001\u0010]\u001a\u0004\bn\u0010_R\u0018\u0010*\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b\u009f\u0001\u0010]\u001a\u0004\bl\u0010_R\u0018\u0010+\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b \u0001\u0010]\u001a\u0004\bj\u0010_R\u0018\u0010,\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b¡\u0001\u0010]\u001a\u0004\bh\u0010_R\u0018\u0010-\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b¢\u0001\u0010]\u001a\u0004\bf\u0010_R\u0018\u0010.\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b£\u0001\u0010]\u001a\u0004\bd\u0010_R\u0018\u0010/\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b¤\u0001\u0010]\u001a\u0004\b`\u0010_R\u0018\u00100\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b¥\u0001\u0010]\u001a\u0004\bt\u0010_R\u0018\u00101\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b¦\u0001\u0010]\u001a\u0004\bp\u0010_R\u0018\u00102\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\b§\u0001\u0010]\u001a\u0004\b\\\u0010_R\u0019\u00103\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¨\u0001\u0010]\u001a\u0005\b\u008a\u0001\u0010_R\u0019\u00104\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b©\u0001\u0010]\u001a\u0005\bª\u0001\u0010_R\u0019\u00105\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b«\u0001\u0010]\u001a\u0005\b¬\u0001\u0010_R\u0019\u00106\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010]\u001a\u0005\b\u0092\u0001\u0010_R\u0019\u00107\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b®\u0001\u0010]\u001a\u0005\b\u0091\u0001\u0010_R\u0019\u00108\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¯\u0001\u0010]\u001a\u0005\b°\u0001\u0010_R\u0019\u00109\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b±\u0001\u0010]\u001a\u0005\b²\u0001\u0010_R\u0019\u0010:\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010]\u001a\u0005\b´\u0001\u0010_R\u0019\u0010;\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bµ\u0001\u0010]\u001a\u0005\b\u008f\u0001\u0010_R\u0019\u0010<\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010]\u001a\u0005\b\u008e\u0001\u0010_R\u0019\u0010=\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b·\u0001\u0010]\u001a\u0005\b\u008c\u0001\u0010_R\u0019\u0010>\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¸\u0001\u0010]\u001a\u0005\b\u0088\u0001\u0010_R\u0019\u0010?\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010]\u001a\u0005\bº\u0001\u0010_R\u0019\u0010@\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b»\u0001\u0010]\u001a\u0005\b\u0094\u0001\u0010_R\u0019\u0010A\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010]\u001a\u0005\b½\u0001\u0010_R\u0019\u0010B\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b¾\u0001\u0010]\u001a\u0005\b¿\u0001\u0010_R\u0019\u0010C\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÀ\u0001\u0010]\u001a\u0005\b\u0099\u0001\u0010_R\u0019\u0010D\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÁ\u0001\u0010]\u001a\u0005\b\u0098\u0001\u0010_R\u0019\u0010E\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010]\u001a\u0005\bÃ\u0001\u0010_R\u0019\u0010F\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÄ\u0001\u0010]\u001a\u0005\bÅ\u0001\u0010_R\u0019\u0010G\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÆ\u0001\u0010]\u001a\u0005\bÇ\u0001\u0010_R\u0019\u0010H\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÈ\u0001\u0010]\u001a\u0005\b\u0097\u0001\u0010_R\u0019\u0010I\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÉ\u0001\u0010]\u001a\u0005\b\u0096\u0001\u0010_R\u0019\u0010J\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÊ\u0001\u0010]\u001a\u0005\b\u0095\u0001\u0010_R\u0019\u0010K\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bË\u0001\u0010]\u001a\u0005\b\u0093\u0001\u0010_R\u0019\u0010L\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÌ\u0001\u0010]\u001a\u0005\bÍ\u0001\u0010_R\u0019\u0010M\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÎ\u0001\u0010]\u001a\u0005\b\u009b\u0001\u0010_R\u0019\u0010N\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÏ\u0001\u0010]\u001a\u0005\bÐ\u0001\u0010_R\u0019\u0010O\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÑ\u0001\u0010]\u001a\u0005\bÒ\u0001\u0010_R\u0019\u0010P\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÓ\u0001\u0010]\u001a\u0005\b¡\u0001\u0010_R\u0019\u0010Q\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÔ\u0001\u0010]\u001a\u0005\b \u0001\u0010_R\u0019\u0010R\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÕ\u0001\u0010]\u001a\u0005\bÖ\u0001\u0010_R\u0019\u0010S\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b×\u0001\u0010]\u001a\u0005\bØ\u0001\u0010_R\u0019\u0010T\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÙ\u0001\u0010]\u001a\u0005\bÚ\u0001\u0010_R\u0019\u0010U\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÛ\u0001\u0010]\u001a\u0005\b\u009f\u0001\u0010_R\u0019\u0010V\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÜ\u0001\u0010]\u001a\u0005\b\u009e\u0001\u0010_R\u0019\u0010W\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bÝ\u0001\u0010]\u001a\u0005\b\u009c\u0001\u0010_R\u0018\u0010X\u001a\u00020\u00028\u0006¢\u0006\r\n\u0005\bÞ\u0001\u0010]\u001a\u0004\b]\u0010_R\u0019\u0010Y\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\bß\u0001\u0010]\u001a\u0005\bà\u0001\u0010_¨\u0006á\u0001"}, d2 = {"Lf2/oq;", "", "Landroidx/compose/ui/graphics/Color;", "neutral100", "neutral99", "neutral98", "neutral96", "neutral95", "neutral94", "neutral92", "neutral90", "neutral87", "neutral80", "neutral70", "neutral60", "neutral50", "neutral40", "neutral30", "neutral24", "neutral22", "neutral20", "neutral17", "neutral12", "neutral10", "neutral6", "neutral4", "neutral0", "neutralVariant100", "neutralVariant99", "neutralVariant98", "neutralVariant96", "neutralVariant95", "neutralVariant94", "neutralVariant92", "neutralVariant90", "neutralVariant87", "neutralVariant80", "neutralVariant70", "neutralVariant60", "neutralVariant50", "neutralVariant40", "neutralVariant30", "neutralVariant24", "neutralVariant22", "neutralVariant20", "neutralVariant17", "neutralVariant12", "neutralVariant10", "neutralVariant6", "neutralVariant4", "neutralVariant0", "primary100", "primary99", "primary95", "primary90", "primary80", "primary70", "primary60", "primary50", "primary40", "primary30", "primary20", "primary10", "primary0", "secondary100", "secondary99", "secondary95", "secondary90", "secondary80", "secondary70", "secondary60", "secondary50", "secondary40", "secondary30", "secondary20", "secondary10", "secondary0", "tertiary100", "tertiary99", "tertiary95", "tertiary90", "tertiary80", "tertiary70", "tertiary60", "tertiary50", "tertiary40", "tertiary30", "tertiary20", "tertiary10", "tertiary0", "<init>", "(JJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJLfr/k;)V", "a", "J", "getNeutral100-0d7_KjU", "()J", "b", "getNeutral99-0d7_KjU", "c", "getNeutral98-0d7_KjU", "d", "getNeutral96-0d7_KjU", "e", "getNeutral95-0d7_KjU", "f", "getNeutral94-0d7_KjU", "g", "getNeutral92-0d7_KjU", "h", "getNeutral90-0d7_KjU", "i", "getNeutral87-0d7_KjU", "j", "getNeutral80-0d7_KjU", "k", "getNeutral70-0d7_KjU", "l", "getNeutral60-0d7_KjU", "m", "getNeutral50-0d7_KjU", "n", "getNeutral40-0d7_KjU", "o", "getNeutral30-0d7_KjU", "p", "getNeutral24-0d7_KjU", "q", "getNeutral22-0d7_KjU", "r", "getNeutral20-0d7_KjU", "s", "getNeutral17-0d7_KjU", "t", "getNeutral12-0d7_KjU", "u", "getNeutral10-0d7_KjU", "v", "getNeutral6-0d7_KjU", "w", "getNeutral4-0d7_KjU", "x", "getNeutral0-0d7_KjU", "y", "z", "getNeutralVariant99-0d7_KjU", "A", "B", "C", a.f96138c, "E", "F", "G", i.f37087n, "I", "getNeutralVariant70-0d7_KjU", "K", i.f37094u, "getNeutralVariant40-0d7_KjU", "M", "N", "O", i.f37086m, "Q", "R", a.f96137b, "T", "U", "V", "W", "X", "getPrimary99-0d7_KjU", "Y", "getPrimary95-0d7_KjU", "Z", "a0", "b0", "getPrimary70-0d7_KjU", "c0", "getPrimary60-0d7_KjU", "d0", "getPrimary50-0d7_KjU", "e0", "f0", "g0", "h0", "i0", "getPrimary0-0d7_KjU", "j0", "k0", "getSecondary99-0d7_KjU", "l0", "getSecondary95-0d7_KjU", "m0", "n0", "o0", "getSecondary70-0d7_KjU", "p0", "getSecondary60-0d7_KjU", "q0", "getSecondary50-0d7_KjU", "r0", "s0", "t0", "u0", "v0", "getSecondary0-0d7_KjU", "w0", "x0", "getTertiary99-0d7_KjU", "y0", "getTertiary95-0d7_KjU", "z0", "A0", "B0", "getTertiary70-0d7_KjU", "C0", "getTertiary60-0d7_KjU", "D0", "getTertiary50-0d7_KjU", "E0", "F0", "G0", "H0", "I0", "getTertiary0-0d7_KjU", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class oq {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final long neutralVariant98;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private final long tertiary80;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final long neutralVariant96;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private final long tertiary70;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final long neutralVariant95;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private final long tertiary60;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final long neutralVariant94;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private final long tertiary50;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final long neutralVariant92;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private final long tertiary40;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final long neutralVariant90;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private final long tertiary30;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final long neutralVariant87;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private final long tertiary20;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final long neutralVariant80;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private final long tertiary10;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final long neutralVariant70;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private final long tertiary0;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final long neutralVariant60;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final long neutralVariant50;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final long neutralVariant40;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final long neutralVariant30;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final long neutralVariant24;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final long neutralVariant22;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final long neutralVariant20;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final long neutralVariant17;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final long neutralVariant12;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private final long neutralVariant10;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private final long neutralVariant6;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private final long neutralVariant4;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private final long neutralVariant0;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private final long primary100;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private final long primary99;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private final long primary95;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private final long primary90;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final long neutral100;

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private final long primary80;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final long neutral99;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private final long primary70;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final long neutral98;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private final long primary60;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final long neutral96;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private final long primary50;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final long neutral95;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private final long primary40;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final long neutral94;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private final long primary30;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final long neutral92;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private final long primary20;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final long neutral90;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private final long primary10;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final long neutral87;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private final long primary0;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final long neutral80;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private final long secondary100;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final long neutral70;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private final long secondary99;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final long neutral60;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private final long secondary95;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final long neutral50;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private final long secondary90;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final long neutral40;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private final long secondary80;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final long neutral30;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private final long secondary70;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private final long neutral24;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private final long secondary60;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private final long neutral22;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private final long secondary50;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private final long neutral20;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private final long secondary40;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final long neutral17;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private final long secondary30;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final long neutral12;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private final long secondary20;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final long neutral10;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private final long secondary10;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final long neutral6;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private final long secondary0;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final long neutral4;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary100;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final long neutral0;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary99;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant100;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary95;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final long neutralVariant99;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private final long tertiary90;

    public /* synthetic */ oq(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, long j134, long j135, long j136, long j137, long j138, long j139, long j140, long j141, k kVar) {
        this(j15, j16, j17, j18, j19, j25, j26, j27, j28, j29, j35, j36, j37, j38, j39, j45, j46, j47, j48, j49, j55, j56, j57, j58, j59, j65, j66, j67, j68, j69, j75, j76, j77, j78, j79, j85, j86, j87, j88, j89, j95, j96, j97, j98, j99, j100, j101, j102, j103, j104, j105, j106, j107, j108, j109, j110, j111, j112, j113, j114, j115, j116, j117, j118, j119, j120, j121, j122, j123, j124, j125, j126, j127, j128, j129, j130, j131, j132, j133, j134, j135, j136, j137, j138, j139, j140, j141);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final long getPrimary80() {
        return this.primary80;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final long getPrimary90() {
        return this.primary90;
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final long getSecondary10() {
        return this.secondary10;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final long getSecondary100() {
        return this.secondary100;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final long getSecondary20() {
        return this.secondary20;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final long getSecondary30() {
        return this.secondary30;
    }

    /* JADX INFO: renamed from: G, reason: from getter */
    public final long getSecondary40() {
        return this.secondary40;
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final long getSecondary80() {
        return this.secondary80;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final long getSecondary90() {
        return this.secondary90;
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getTertiary10() {
        return this.tertiary10;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final long getTertiary100() {
        return this.tertiary100;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final long getTertiary20() {
        return this.tertiary20;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final long getTertiary30() {
        return this.tertiary30;
    }

    /* JADX INFO: renamed from: N, reason: from getter */
    public final long getTertiary40() {
        return this.tertiary40;
    }

    /* JADX INFO: renamed from: O, reason: from getter */
    public final long getTertiary80() {
        return this.tertiary80;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final long getTertiary90() {
        return this.tertiary90;
    }

    /* JADX INFO: renamed from: a, reason: from getter */
    public final long getNeutralVariant0() {
        return this.neutralVariant0;
    }

    /* JADX INFO: renamed from: b, reason: from getter */
    public final long getNeutralVariant10() {
        return this.neutralVariant10;
    }

    /* JADX INFO: renamed from: c, reason: from getter */
    public final long getNeutralVariant100() {
        return this.neutralVariant100;
    }

    /* JADX INFO: renamed from: d, reason: from getter */
    public final long getNeutralVariant12() {
        return this.neutralVariant12;
    }

    /* JADX INFO: renamed from: e, reason: from getter */
    public final long getNeutralVariant17() {
        return this.neutralVariant17;
    }

    /* JADX INFO: renamed from: f, reason: from getter */
    public final long getNeutralVariant20() {
        return this.neutralVariant20;
    }

    /* JADX INFO: renamed from: g, reason: from getter */
    public final long getNeutralVariant22() {
        return this.neutralVariant22;
    }

    /* JADX INFO: renamed from: h, reason: from getter */
    public final long getNeutralVariant24() {
        return this.neutralVariant24;
    }

    /* JADX INFO: renamed from: i, reason: from getter */
    public final long getNeutralVariant30() {
        return this.neutralVariant30;
    }

    /* JADX INFO: renamed from: j, reason: from getter */
    public final long getNeutralVariant4() {
        return this.neutralVariant4;
    }

    /* JADX INFO: renamed from: k, reason: from getter */
    public final long getNeutralVariant50() {
        return this.neutralVariant50;
    }

    /* JADX INFO: renamed from: l, reason: from getter */
    public final long getNeutralVariant6() {
        return this.neutralVariant6;
    }

    /* JADX INFO: renamed from: m, reason: from getter */
    public final long getNeutralVariant60() {
        return this.neutralVariant60;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final long getNeutralVariant80() {
        return this.neutralVariant80;
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final long getNeutralVariant87() {
        return this.neutralVariant87;
    }

    /* JADX INFO: renamed from: p, reason: from getter */
    public final long getNeutralVariant90() {
        return this.neutralVariant90;
    }

    /* JADX INFO: renamed from: q, reason: from getter */
    public final long getNeutralVariant92() {
        return this.neutralVariant92;
    }

    /* JADX INFO: renamed from: r, reason: from getter */
    public final long getNeutralVariant94() {
        return this.neutralVariant94;
    }

    /* JADX INFO: renamed from: s, reason: from getter */
    public final long getNeutralVariant95() {
        return this.neutralVariant95;
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final long getNeutralVariant96() {
        return this.neutralVariant96;
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final long getNeutralVariant98() {
        return this.neutralVariant98;
    }

    /* JADX INFO: renamed from: v, reason: from getter */
    public final long getPrimary10() {
        return this.primary10;
    }

    /* JADX INFO: renamed from: w, reason: from getter */
    public final long getPrimary100() {
        return this.primary100;
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final long getPrimary20() {
        return this.primary20;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final long getPrimary30() {
        return this.primary30;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final long getPrimary40() {
        return this.primary40;
    }

    private oq(long j15, long j16, long j17, long j18, long j19, long j25, long j26, long j27, long j28, long j29, long j35, long j36, long j37, long j38, long j39, long j45, long j46, long j47, long j48, long j49, long j55, long j56, long j57, long j58, long j59, long j65, long j66, long j67, long j68, long j69, long j75, long j76, long j77, long j78, long j79, long j85, long j86, long j87, long j88, long j89, long j95, long j96, long j97, long j98, long j99, long j100, long j101, long j102, long j103, long j104, long j105, long j106, long j107, long j108, long j109, long j110, long j111, long j112, long j113, long j114, long j115, long j116, long j117, long j118, long j119, long j120, long j121, long j122, long j123, long j124, long j125, long j126, long j127, long j128, long j129, long j130, long j131, long j132, long j133, long j134, long j135, long j136, long j137, long j138, long j139, long j140, long j141) {
        this.neutral100 = j15;
        this.neutral99 = j16;
        this.neutral98 = j17;
        this.neutral96 = j18;
        this.neutral95 = j19;
        this.neutral94 = j25;
        this.neutral92 = j26;
        this.neutral90 = j27;
        this.neutral87 = j28;
        this.neutral80 = j29;
        this.neutral70 = j35;
        this.neutral60 = j36;
        this.neutral50 = j37;
        this.neutral40 = j38;
        this.neutral30 = j39;
        this.neutral24 = j45;
        this.neutral22 = j46;
        this.neutral20 = j47;
        this.neutral17 = j48;
        this.neutral12 = j49;
        this.neutral10 = j55;
        this.neutral6 = j56;
        this.neutral4 = j57;
        this.neutral0 = j58;
        this.neutralVariant100 = j59;
        this.neutralVariant99 = j65;
        this.neutralVariant98 = j66;
        this.neutralVariant96 = j67;
        this.neutralVariant95 = j68;
        this.neutralVariant94 = j69;
        this.neutralVariant92 = j75;
        this.neutralVariant90 = j76;
        this.neutralVariant87 = j77;
        this.neutralVariant80 = j78;
        this.neutralVariant70 = j79;
        this.neutralVariant60 = j85;
        this.neutralVariant50 = j86;
        this.neutralVariant40 = j87;
        this.neutralVariant30 = j88;
        this.neutralVariant24 = j89;
        this.neutralVariant22 = j95;
        this.neutralVariant20 = j96;
        this.neutralVariant17 = j97;
        this.neutralVariant12 = j98;
        this.neutralVariant10 = j99;
        this.neutralVariant6 = j100;
        this.neutralVariant4 = j101;
        this.neutralVariant0 = j102;
        this.primary100 = j103;
        this.primary99 = j104;
        this.primary95 = j105;
        this.primary90 = j106;
        this.primary80 = j107;
        this.primary70 = j108;
        this.primary60 = j109;
        this.primary50 = j110;
        this.primary40 = j111;
        this.primary30 = j112;
        this.primary20 = j113;
        this.primary10 = j114;
        this.primary0 = j115;
        this.secondary100 = j116;
        this.secondary99 = j117;
        this.secondary95 = j118;
        this.secondary90 = j119;
        this.secondary80 = j120;
        this.secondary70 = j121;
        this.secondary60 = j122;
        this.secondary50 = j123;
        this.secondary40 = j124;
        this.secondary30 = j125;
        this.secondary20 = j126;
        this.secondary10 = j127;
        this.secondary0 = j128;
        this.tertiary100 = j129;
        this.tertiary99 = j130;
        this.tertiary95 = j131;
        this.tertiary90 = j132;
        this.tertiary80 = j133;
        this.tertiary70 = j134;
        this.tertiary60 = j135;
        this.tertiary50 = j136;
        this.tertiary40 = j137;
        this.tertiary30 = j138;
        this.tertiary20 = j139;
        this.tertiary10 = j140;
        this.tertiary0 = j141;
    }
}
