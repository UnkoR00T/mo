package l2;

import p071kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00005\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0007\n\u0002\bA\n\u0002\u0018\u0002\n\u0003\bõ\u0001\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0012\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0010\u0010\f\u001a\u0004\b\u0011\u0010\u000eR\u0017\u0010\u0015\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0013\u0010\f\u001a\u0004\b\u0014\u0010\u000eR\u0017\u0010\u0018\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u0016\u0010\f\u001a\u0004\b\u0017\u0010\u000eR\u0017\u0010\u001e\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010!\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u001f\u0010\f\u001a\u0004\b \u0010\u000eR\u0017\u0010$\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\"\u0010\f\u001a\u0004\b#\u0010\u000eR\u0017\u0010'\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b%\u0010\u001b\u001a\u0004\b&\u0010\u001dR\u0017\u0010*\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b(\u0010\f\u001a\u0004\b)\u0010\u000eR\u0017\u0010-\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b+\u0010\u0006\u001a\u0004\b,\u0010\bR\u0017\u00100\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b.\u0010\u0006\u001a\u0004\b/\u0010\bR\u0017\u00103\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b1\u0010\u0006\u001a\u0004\b2\u0010\bR\u0017\u00106\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b4\u0010\u001b\u001a\u0004\b5\u0010\u001dR\u001a\u00109\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\b8\u0010\f\u001a\u0004\b\u0005\u0010\u000eR\u0017\u0010;\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b:\u0010\u001b\u001a\u0004\b\u000b\u0010\u001dR\u001a\u0010=\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\b<\u0010\f\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010@\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b>\u0010\u001b\u001a\u0004\b?\u0010\u001dR\u001a\u0010C\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010\f\u001a\u0004\bB\u0010\u000eR\u001a\u0010F\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\bD\u0010\f\u001a\u0004\bE\u0010\u000eR\u0017\u0010I\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bG\u0010\u001b\u001a\u0004\bH\u0010\u001dR\u001a\u0010L\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\bJ\u0010\f\u001a\u0004\bK\u0010\u000eR\u0017\u0010N\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bM\u0010\u001b\u001a\u0004\b\u0013\u0010\u001dR\u001a\u0010P\u001a\u0002078\u0006X\u0086D¢\u0006\f\n\u0004\bO\u0010\f\u001a\u0004\b\u0016\u0010\u000eR\u0017\u0010S\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bQ\u0010\f\u001a\u0004\bR\u0010\u000eR\u0017\u0010V\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bT\u0010\u0006\u001a\u0004\bU\u0010\bR\u0017\u0010Y\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bW\u0010\u001b\u001a\u0004\bX\u0010\u001dR\u0017\u0010\\\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bZ\u0010\u001b\u001a\u0004\b[\u0010\u001dR\u0017\u0010_\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b]\u0010\u001b\u001a\u0004\b^\u0010\u001dR\u0017\u0010b\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b`\u0010\u001b\u001a\u0004\ba\u0010\u001dR\u0017\u0010d\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\b\f\u0010\u001b\u001a\u0004\bc\u0010\u001dR\u0017\u0010g\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\be\u0010\u001b\u001a\u0004\bf\u0010\u001dR\u0017\u0010j\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bh\u0010\u0006\u001a\u0004\bi\u0010\bR\u0017\u0010m\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bk\u0010\u001b\u001a\u0004\bl\u0010\u001dR\u0017\u0010p\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bn\u0010\u001b\u001a\u0004\bo\u0010\u001dR\u0017\u0010s\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bq\u0010\u001b\u001a\u0004\br\u0010\u001dR\u0017\u0010v\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\bt\u0010\u0006\u001a\u0004\bu\u0010\bR\u0017\u0010x\u001a\u00020\u00198\u0006¢\u0006\f\n\u0004\bw\u0010\u001b\u001a\u0004\b\u001a\u0010\u001dR\u0017\u0010~\u001a\u00020y8\u0006¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R\u0019\u0010\u0081\u0001\u001a\u00020\n8\u0006¢\u0006\r\n\u0004\b\u007f\u0010\f\u001a\u0005\b\u0080\u0001\u0010\u000eR\u001a\u0010\u0084\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0082\u0001\u0010\f\u001a\u0005\b\u0083\u0001\u0010\u000eR\u001a\u0010\u0087\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0085\u0001\u0010\u001b\u001a\u0005\b\u0086\u0001\u0010\u001dR\u001a\u0010\u008a\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0088\u0001\u0010\u001b\u001a\u0005\b\u0089\u0001\u0010\u001dR\u001a\u0010\u008d\u0001\u001a\u00020y8\u0006¢\u0006\u000e\n\u0005\b\u008b\u0001\u0010{\u001a\u0005\b\u008c\u0001\u0010}R\u001a\u0010\u0090\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u008e\u0001\u0010\u0006\u001a\u0005\b\u008f\u0001\u0010\bR\u001a\u0010\u0093\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0091\u0001\u0010\f\u001a\u0005\b\u0092\u0001\u0010\u000eR\u0019\u0010\u0095\u0001\u001a\u00020\u00198\u0006¢\u0006\r\n\u0005\b\u0094\u0001\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u001a\u0010\u0098\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u0096\u0001\u0010\f\u001a\u0005\b\u0097\u0001\u0010\u000eR\u0019\u0010\u009a\u0001\u001a\u00020\n8\u0006¢\u0006\r\n\u0005\b\u0099\u0001\u0010\f\u001a\u0004\b\"\u0010\u000eR\u001a\u0010\u009d\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u009b\u0001\u0010\u0006\u001a\u0005\b\u009c\u0001\u0010\bR\u001a\u0010 \u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u009e\u0001\u0010\f\u001a\u0005\b\u009f\u0001\u0010\u000eR\u001a\u0010£\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¡\u0001\u0010\u0006\u001a\u0005\b¢\u0001\u0010\bR\u001a\u0010¦\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b¤\u0001\u0010\f\u001a\u0005\b¥\u0001\u0010\u000eR\u001a\u0010©\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b§\u0001\u0010\f\u001a\u0005\b¨\u0001\u0010\u000eR\u001a\u0010¬\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bª\u0001\u0010\u0006\u001a\u0005\b«\u0001\u0010\bR\u001a\u0010¯\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b\u00ad\u0001\u0010\f\u001a\u0005\b®\u0001\u0010\u000eR\u001a\u0010²\u0001\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b°\u0001\u0010\f\u001a\u0005\b±\u0001\u0010\u000eR\u001a\u0010µ\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b³\u0001\u0010\u001b\u001a\u0005\b´\u0001\u0010\u001dR\u001a\u0010¸\u0001\u001a\u00020y8\u0006¢\u0006\u000e\n\u0005\b¶\u0001\u0010{\u001a\u0005\b·\u0001\u0010}R\u001a\u0010»\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¹\u0001\u0010\u0006\u001a\u0005\bº\u0001\u0010\bR\u001a\u0010¾\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b¼\u0001\u0010\u001b\u001a\u0005\b½\u0001\u0010\u001dR\u001a\u0010Á\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b¿\u0001\u0010\u001b\u001a\u0005\bÀ\u0001\u0010\u001dR\u001a\u0010Ä\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÂ\u0001\u0010\u001b\u001a\u0005\bÃ\u0001\u0010\u001dR\u001a\u0010Ç\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÅ\u0001\u0010\u001b\u001a\u0005\bÆ\u0001\u0010\u001dR\u001a\u0010Ê\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÈ\u0001\u0010\u001b\u001a\u0005\bÉ\u0001\u0010\u001dR\u001a\u0010Í\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bË\u0001\u0010\u0006\u001a\u0005\bÌ\u0001\u0010\bR\u001a\u0010Ð\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÎ\u0001\u0010\u0006\u001a\u0005\bÏ\u0001\u0010\bR\u001a\u0010Ó\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÑ\u0001\u0010\u001b\u001a\u0005\bÒ\u0001\u0010\u001dR\u001a\u0010Ö\u0001\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\bÔ\u0001\u0010\u0006\u001a\u0005\bÕ\u0001\u0010\bR\u001d\u0010Ù\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\b×\u0001\u0010\f\u001a\u0005\bØ\u0001\u0010\u000eR\u001a\u0010Ü\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÚ\u0001\u0010\u001b\u001a\u0005\bÛ\u0001\u0010\u001dR\u001d\u0010ß\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bÝ\u0001\u0010\f\u001a\u0005\bÞ\u0001\u0010\u000eR\u001a\u0010â\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bà\u0001\u0010\u001b\u001a\u0005\bá\u0001\u0010\u001dR\u001d\u0010å\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bã\u0001\u0010\f\u001a\u0005\bä\u0001\u0010\u000eR\u001a\u0010è\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bæ\u0001\u0010\u001b\u001a\u0005\bç\u0001\u0010\u001dR\u001d\u0010ë\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bé\u0001\u0010\f\u001a\u0005\bê\u0001\u0010\u000eR\u001d\u0010î\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bì\u0001\u0010\f\u001a\u0005\bí\u0001\u0010\u000eR\u001a\u0010ñ\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bï\u0001\u0010\u001b\u001a\u0005\bð\u0001\u0010\u001dR\u001d\u0010ô\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bò\u0001\u0010\f\u001a\u0005\bó\u0001\u0010\u000eR\u001a\u0010÷\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bõ\u0001\u0010\u001b\u001a\u0005\bö\u0001\u0010\u001dR\u001d\u0010ú\u0001\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bø\u0001\u0010\f\u001a\u0005\bù\u0001\u0010\u000eR\u001a\u0010ý\u0001\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bû\u0001\u0010\u001b\u001a\u0005\bü\u0001\u0010\u001dR\u001d\u0010\u0080\u0002\u001a\u0002078\u0006X\u0086D¢\u0006\u000e\n\u0005\bþ\u0001\u0010\f\u001a\u0005\bÿ\u0001\u0010\u000eR\u001a\u0010\u0083\u0002\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0081\u0002\u0010\u0006\u001a\u0005\b\u0082\u0002\u0010\bR\u001a\u0010\u0086\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0084\u0002\u0010\u001b\u001a\u0005\b\u0085\u0002\u0010\u001dR\u001a\u0010\u0089\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0087\u0002\u0010\u001b\u001a\u0005\b\u0088\u0002\u0010\u001dR\u001a\u0010\u008c\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u008a\u0002\u0010\u001b\u001a\u0005\b\u008b\u0002\u0010\u001dR\u001a\u0010\u008f\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u008d\u0002\u0010\u001b\u001a\u0005\b\u008e\u0002\u0010\u001dR\u001a\u0010\u0092\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0090\u0002\u0010\u001b\u001a\u0005\b\u0091\u0002\u0010\u001dR\u001a\u0010\u0095\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0093\u0002\u0010\u001b\u001a\u0005\b\u0094\u0002\u0010\u001dR\u001a\u0010\u0098\u0002\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0096\u0002\u0010\u0006\u001a\u0005\b\u0097\u0002\u0010\bR\u001a\u0010\u009b\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u0099\u0002\u0010\u001b\u001a\u0005\b\u009a\u0002\u0010\u001dR\u001a\u0010\u009e\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u009c\u0002\u0010\u001b\u001a\u0005\b\u009d\u0002\u0010\u001dR\u001a\u0010¡\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b\u009f\u0002\u0010\u001b\u001a\u0005\b \u0002\u0010\u001dR\u001a\u0010¤\u0002\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b¢\u0002\u0010\u0006\u001a\u0005\b£\u0002\u0010\bR\u001a\u0010§\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b¥\u0002\u0010\u001b\u001a\u0005\b¦\u0002\u0010\u001dR\u001a\u0010ª\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b¨\u0002\u0010\u001b\u001a\u0005\b©\u0002\u0010\u001dR\u001a\u0010\u00ad\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b«\u0002\u0010\u001b\u001a\u0005\b¬\u0002\u0010\u001dR\u001a\u0010°\u0002\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b®\u0002\u0010\u0006\u001a\u0005\b¯\u0002\u0010\bR\u001a\u0010³\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b±\u0002\u0010\u001b\u001a\u0005\b²\u0002\u0010\u001dR\u001a\u0010¶\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b´\u0002\u0010\u001b\u001a\u0005\bµ\u0002\u0010\u001dR\u001a\u0010¹\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b·\u0002\u0010\u001b\u001a\u0005\b¸\u0002\u0010\u001dR\u001a\u0010¼\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bº\u0002\u0010\u001b\u001a\u0005\b»\u0002\u0010\u001dR\u001a\u0010¿\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\b½\u0002\u0010\u001b\u001a\u0005\b¾\u0002\u0010\u001dR\u001a\u0010Â\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÀ\u0002\u0010\u001b\u001a\u0005\bÁ\u0002\u0010\u001dR\u001a\u0010Å\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bÃ\u0002\u0010\f\u001a\u0005\bÄ\u0002\u0010\u000eR\u001a\u0010È\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bÆ\u0002\u0010\f\u001a\u0005\bÇ\u0002\u0010\u000eR\u001a\u0010Ë\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bÉ\u0002\u0010\u001b\u001a\u0005\bÊ\u0002\u0010\u001dR\u001a\u0010Î\u0002\u001a\u00020y8\u0006¢\u0006\u000e\n\u0005\bÌ\u0002\u0010{\u001a\u0005\bÍ\u0002\u0010}R\u001a\u0010Ñ\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bÏ\u0002\u0010\f\u001a\u0005\bÐ\u0002\u0010\u000eR\u001a\u0010Ô\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bÒ\u0002\u0010\f\u001a\u0005\bÓ\u0002\u0010\u000eR\u0019\u0010Ö\u0002\u001a\u00020\u00198\u0006¢\u0006\r\n\u0005\bÕ\u0002\u0010\u001b\u001a\u0004\b%\u0010\u001dR\u001a\u0010Ù\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\b×\u0002\u0010\f\u001a\u0005\bØ\u0002\u0010\u000eR\u0019\u0010Û\u0002\u001a\u00020\n8\u0006¢\u0006\r\n\u0005\bÚ\u0002\u0010\f\u001a\u0004\b(\u0010\u000eR\u001a\u0010Þ\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bÜ\u0002\u0010\f\u001a\u0005\bÝ\u0002\u0010\u000eR\u001a\u0010á\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bß\u0002\u0010\u001b\u001a\u0005\bà\u0002\u0010\u001dR\u001a\u0010ä\u0002\u001a\u00020y8\u0006¢\u0006\u000e\n\u0005\bâ\u0002\u0010{\u001a\u0005\bã\u0002\u0010}R\u001a\u0010ç\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bå\u0002\u0010\f\u001a\u0005\bæ\u0002\u0010\u000eR\u001a\u0010ê\u0002\u001a\u00020\u00198\u0006¢\u0006\u000e\n\u0005\bè\u0002\u0010\u001b\u001a\u0005\bé\u0002\u0010\u001dR\u001a\u0010í\u0002\u001a\u00020\n8\u0006¢\u0006\u000e\n\u0005\bë\u0002\u0010\f\u001a\u0005\bì\u0002\u0010\u000e¨\u0006î\u0002"}, d2 = {"Ll2/g0;", "", "<init>", "()V", "Ll2/w0;", "b", "Ll2/w0;", "getContainerShape", "()Ll2/w0;", "ContainerShape", "Lc5/h;", "c", "F", "getDividerBottomSpace-D9Ej5fM", "()F", "DividerBottomSpace", "d", "getDividerLeadingSpace-D9Ej5fM", "DividerLeadingSpace", "e", "getDividerTopSpace-D9Ej5fM", "DividerTopSpace", "f", "getDividerTrailingSpace-D9Ej5fM", "DividerTrailingSpace", "Ll2/p;", "g", "Ll2/p;", "getFocusIndicatorColor", "()Ll2/p;", "FocusIndicatorColor", "h", "getItemBetweenSpace-D9Ej5fM", "ItemBetweenSpace", "i", "getItemBottomSpace-D9Ej5fM", "ItemBottomSpace", "j", "getItemContainerColor", "ItemContainerColor", "k", "getItemContainerElevation-D9Ej5fM", "ItemContainerElevation", "l", "getItemContainerExpressiveShape", "ItemContainerExpressiveShape", "m", "getItemContainerShape", "ItemContainerShape", "n", "getItemDisabledContainerExpressiveShape", "ItemDisabledContainerExpressiveShape", "o", "a", "ItemDisabledLabelTextColor", "", "p", "ItemDisabledLabelTextOpacity", "q", "ItemDisabledLeadingIconColor", "r", "ItemDisabledLeadingIconOpacity", "s", "getItemDisabledOverlineColor", "ItemDisabledOverlineColor", "t", "getItemDisabledOverlineOpacity", "ItemDisabledOverlineOpacity", "u", "getItemDisabledStateLayerOpacity", "ItemDisabledStateLayerOpacity", "v", "getItemDisabledSupportingTextColor", "ItemDisabledSupportingTextColor", "w", "getItemDisabledSupportingTextOpacity", "ItemDisabledSupportingTextOpacity", "x", "ItemDisabledTrailingIconColor", "y", "ItemDisabledTrailingIconOpacity", "z", "getItemDraggedContainerElevation-D9Ej5fM", "ItemDraggedContainerElevation", "A", "getItemDraggedContainerExpressiveShape", "ItemDraggedContainerExpressiveShape", "B", "getItemDraggedLabelTextColor", "ItemDraggedLabelTextColor", "C", "getItemDraggedLeadingIconIconColor", "ItemDraggedLeadingIconIconColor", ip.a.f96138c, "getItemDraggedTrailingIconIconColor", "ItemDraggedTrailingIconIconColor", "E", "getItemFocusLabelTextColor", "ItemFocusLabelTextColor", "getItemFocusLeadingIconIconColor", "ItemFocusLeadingIconIconColor", "G", "getItemFocusTrailingIconIconColor", "ItemFocusTrailingIconIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "getItemFocusedContainerExpressiveShape", "ItemFocusedContainerExpressiveShape", "I", "getItemHoverLabelTextColor", "ItemHoverLabelTextColor", "J", "getItemHoverLeadingIconIconColor", "ItemHoverLeadingIconIconColor", "K", "getItemHoverTrailingIconIconColor", "ItemHoverTrailingIconIconColor", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37094u, "getItemHoveredContainerExpressiveShape", "ItemHoveredContainerExpressiveShape", "M", "ItemLabelTextColor", "Ll2/k1;", "N", "Ll2/k1;", "getItemLabelTextFont", "()Ll2/k1;", "ItemLabelTextFont", "O", "getItemLargeLeadingVideoHeight-D9Ej5fM", "ItemLargeLeadingVideoHeight", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "getItemLargeLeadingVideoWidth-D9Ej5fM", "ItemLargeLeadingVideoWidth", "Q", "getItemLeadingAvatarColor", "ItemLeadingAvatarColor", "R", "getItemLeadingAvatarLabelColor", "ItemLeadingAvatarLabelColor", ip.a.f96137b, "getItemLeadingAvatarLabelFont", "ItemLeadingAvatarLabelFont", "T", "getItemLeadingAvatarShape", "ItemLeadingAvatarShape", "U", "getItemLeadingAvatarSize-D9Ej5fM", "ItemLeadingAvatarSize", "V", "ItemLeadingIconColor", "W", "getItemLeadingIconExpressiveSize-D9Ej5fM", "ItemLeadingIconExpressiveSize", "X", "ItemLeadingIconSize", "Y", "getItemLeadingImageExpressiveShape", "ItemLeadingImageExpressiveShape", "Z", "getItemLeadingImageHeight-D9Ej5fM", "ItemLeadingImageHeight", "a0", "getItemLeadingImageShape", "ItemLeadingImageShape", "b0", "getItemLeadingImageWidth-D9Ej5fM", "ItemLeadingImageWidth", "c0", "getItemLeadingSpace-D9Ej5fM", "ItemLeadingSpace", "d0", "getItemLeadingVideoShape", "ItemLeadingVideoShape", "e0", "getItemLeadingVideoWidth-D9Ej5fM", "ItemLeadingVideoWidth", "f0", "getItemOneLineContainerHeight-D9Ej5fM", "ItemOneLineContainerHeight", "g0", "getItemOverlineColor", "ItemOverlineColor", "h0", "getItemOverlineFont", "ItemOverlineFont", "i0", "getItemPressedContainerExpressiveShape", "ItemPressedContainerExpressiveShape", "j0", "getItemPressedLabelTextColor", "ItemPressedLabelTextColor", "k0", "getItemPressedLeadingIconIconColor", "ItemPressedLeadingIconIconColor", "l0", "getItemPressedTrailingIconIconColor", "ItemPressedTrailingIconIconColor", "m0", "getItemSegmentedContainerColor", "ItemSegmentedContainerColor", "n0", "getItemSelectedContainerColor", "ItemSelectedContainerColor", "o0", "getItemSelectedContainerExpressiveShape", "ItemSelectedContainerExpressiveShape", "p0", "getItemSelectedContainerShape", "ItemSelectedContainerShape", "q0", "getItemSelectedDisabledContainerColor", "ItemSelectedDisabledContainerColor", "r0", "getItemSelectedDisabledContainerExpressiveShape", "ItemSelectedDisabledContainerExpressiveShape", "s0", "getItemSelectedDisabledContainerOpacity", "ItemSelectedDisabledContainerOpacity", "t0", "getItemSelectedDisabledLabelTextColor", "ItemSelectedDisabledLabelTextColor", "u0", "getItemSelectedDisabledLabelTextOpacity", "ItemSelectedDisabledLabelTextOpacity", "v0", "getItemSelectedDisabledLeadingIconColor", "ItemSelectedDisabledLeadingIconColor", "w0", "getItemSelectedDisabledLeadingIconOpacity", "ItemSelectedDisabledLeadingIconOpacity", "x0", "getItemSelectedDisabledOverlineColor", "ItemSelectedDisabledOverlineColor", "y0", "getItemSelectedDisabledOverlineOpacity", "ItemSelectedDisabledOverlineOpacity", "z0", "getItemSelectedDisabledStateLayerOpacity", "ItemSelectedDisabledStateLayerOpacity", "A0", "getItemSelectedDisabledSupportingTextColor", "ItemSelectedDisabledSupportingTextColor", "B0", "getItemSelectedDisabledSupportingTextOpacity", "ItemSelectedDisabledSupportingTextOpacity", "C0", "getItemSelectedDisabledTrailingIconColor", "ItemSelectedDisabledTrailingIconColor", "D0", "getItemSelectedDisabledTrailingIconOpacity", "ItemSelectedDisabledTrailingIconOpacity", "E0", "getItemSelectedDisabledTrailingSupportingTextColor", "ItemSelectedDisabledTrailingSupportingTextColor", "F0", "getItemSelectedDisabledTrailingSupportingTextOpacity", "ItemSelectedDisabledTrailingSupportingTextOpacity", "G0", "getItemSelectedDraggedContainerExpressiveShape", "ItemSelectedDraggedContainerExpressiveShape", "H0", "getItemSelectedDraggedLabelTextColor", "ItemSelectedDraggedLabelTextColor", "I0", "getItemSelectedDraggedLeadingIconColor", "ItemSelectedDraggedLeadingIconColor", "J0", "getItemSelectedDraggedTrailingIconColor", "ItemSelectedDraggedTrailingIconColor", "K0", "getItemSelectedFocusLabelTextColor", "ItemSelectedFocusLabelTextColor", "L0", "getItemSelectedFocusLeadingIconColor", "ItemSelectedFocusLeadingIconColor", "M0", "getItemSelectedFocusTrailingIconColor", "ItemSelectedFocusTrailingIconColor", "N0", "getItemSelectedFocusedContainerExpressiveShape", "ItemSelectedFocusedContainerExpressiveShape", "O0", "getItemSelectedHoverLabelTextColor", "ItemSelectedHoverLabelTextColor", "P0", "getItemSelectedHoverLeadingIconColor", "ItemSelectedHoverLeadingIconColor", "Q0", "getItemSelectedHoverTrailingIconColor", "ItemSelectedHoverTrailingIconColor", "R0", "getItemSelectedHoveredContainerExpressiveShape", "ItemSelectedHoveredContainerExpressiveShape", "S0", "getItemSelectedLabelTextColor", "ItemSelectedLabelTextColor", "T0", "getItemSelectedLeadingIconColor", "ItemSelectedLeadingIconColor", "U0", "getItemSelectedOverlineColor", "ItemSelectedOverlineColor", "V0", "getItemSelectedPressedContainerExpressiveShape", "ItemSelectedPressedContainerExpressiveShape", "W0", "getItemSelectedPressedLabelTextColor", "ItemSelectedPressedLabelTextColor", "X0", "getItemSelectedPressedLeadingIconColor", "ItemSelectedPressedLeadingIconColor", "Y0", "getItemSelectedPressedTrailingIconColor", "ItemSelectedPressedTrailingIconColor", "Z0", "getItemSelectedSupportingTextColor", "ItemSelectedSupportingTextColor", "a1", "getItemSelectedTrailingIconColor", "ItemSelectedTrailingIconColor", "b1", "getItemSelectedTrailingSupportingTextColor", "ItemSelectedTrailingSupportingTextColor", "c1", "getItemSmallLeadingVideoHeight-D9Ej5fM", "ItemSmallLeadingVideoHeight", "d1", "getItemSmallLeadingVideoWidth-D9Ej5fM", "ItemSmallLeadingVideoWidth", "e1", "getItemSupportingTextColor", "ItemSupportingTextColor", "f1", "getItemSupportingTextFont", "ItemSupportingTextFont", "g1", "getItemThreeLineContainerHeight-D9Ej5fM", "ItemThreeLineContainerHeight", "h1", "getItemTopSpace-D9Ej5fM", "ItemTopSpace", "i1", "ItemTrailingIconColor", "j1", "getItemTrailingIconExpressiveSize-D9Ej5fM", "ItemTrailingIconExpressiveSize", "k1", "ItemTrailingIconSize", "l1", "getItemTrailingSpace-D9Ej5fM", "ItemTrailingSpace", "m1", "getItemTrailingSupportingTextColor", "ItemTrailingSupportingTextColor", "n1", "getItemTrailingSupportingTextFont", "ItemTrailingSupportingTextFont", "o1", "getItemTwoLineContainerHeight-D9Ej5fM", "ItemTwoLineContainerHeight", "p1", "getItemUnselectedTrailingIconColor", "ItemUnselectedTrailingIconColor", "q1", "getSegmentedGap-D9Ej5fM", "SegmentedGap", "material3"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class g0 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private static final w0 ItemDraggedContainerExpressiveShape;

    /* JADX INFO: renamed from: A0, reason: from kotlin metadata */
    private static final p ItemSelectedDisabledSupportingTextColor;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private static final p ItemDraggedLabelTextColor;

    /* JADX INFO: renamed from: B0, reason: from kotlin metadata */
    private static final float ItemSelectedDisabledSupportingTextOpacity;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private static final p ItemDraggedLeadingIconIconColor;

    /* JADX INFO: renamed from: C0, reason: from kotlin metadata */
    private static final p ItemSelectedDisabledTrailingIconColor;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private static final p ItemDraggedTrailingIconIconColor;

    /* JADX INFO: renamed from: D0, reason: from kotlin metadata */
    private static final float ItemSelectedDisabledTrailingIconOpacity;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private static final p ItemFocusLabelTextColor;

    /* JADX INFO: renamed from: E0, reason: from kotlin metadata */
    private static final p ItemSelectedDisabledTrailingSupportingTextColor;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private static final p ItemFocusLeadingIconIconColor;

    /* JADX INFO: renamed from: F0, reason: from kotlin metadata */
    private static final float ItemSelectedDisabledTrailingSupportingTextOpacity;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private static final p ItemFocusTrailingIconIconColor;

    /* JADX INFO: renamed from: G0, reason: from kotlin metadata */
    private static final w0 ItemSelectedDraggedContainerExpressiveShape;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private static final w0 ItemFocusedContainerExpressiveShape;

    /* JADX INFO: renamed from: H0, reason: from kotlin metadata */
    private static final p ItemSelectedDraggedLabelTextColor;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private static final p ItemHoverLabelTextColor;

    /* JADX INFO: renamed from: I0, reason: from kotlin metadata */
    private static final p ItemSelectedDraggedLeadingIconColor;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private static final p ItemHoverLeadingIconIconColor;

    /* JADX INFO: renamed from: J0, reason: from kotlin metadata */
    private static final p ItemSelectedDraggedTrailingIconColor;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private static final p ItemHoverTrailingIconIconColor;

    /* JADX INFO: renamed from: K0, reason: from kotlin metadata */
    private static final p ItemSelectedFocusLabelTextColor;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private static final w0 ItemHoveredContainerExpressiveShape;

    /* JADX INFO: renamed from: L0, reason: from kotlin metadata */
    private static final p ItemSelectedFocusLeadingIconColor;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private static final p ItemLabelTextColor;

    /* JADX INFO: renamed from: M0, reason: from kotlin metadata */
    private static final p ItemSelectedFocusTrailingIconColor;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private static final k1 ItemLabelTextFont;

    /* JADX INFO: renamed from: N0, reason: from kotlin metadata */
    private static final w0 ItemSelectedFocusedContainerExpressiveShape;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private static final float ItemLargeLeadingVideoHeight;

    /* JADX INFO: renamed from: O0, reason: from kotlin metadata */
    private static final p ItemSelectedHoverLabelTextColor;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private static final float ItemLargeLeadingVideoWidth;

    /* JADX INFO: renamed from: P0, reason: from kotlin metadata */
    private static final p ItemSelectedHoverLeadingIconColor;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private static final p ItemLeadingAvatarColor;

    /* JADX INFO: renamed from: Q0, reason: from kotlin metadata */
    private static final p ItemSelectedHoverTrailingIconColor;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private static final p ItemLeadingAvatarLabelColor;

    /* JADX INFO: renamed from: R0, reason: from kotlin metadata */
    private static final w0 ItemSelectedHoveredContainerExpressiveShape;

    /* JADX INFO: renamed from: S, reason: from kotlin metadata */
    private static final k1 ItemLeadingAvatarLabelFont;

    /* JADX INFO: renamed from: S0, reason: from kotlin metadata */
    private static final p ItemSelectedLabelTextColor;

    /* JADX INFO: renamed from: T, reason: from kotlin metadata */
    private static final w0 ItemLeadingAvatarShape;

    /* JADX INFO: renamed from: T0, reason: from kotlin metadata */
    private static final p ItemSelectedLeadingIconColor;

    /* JADX INFO: renamed from: U, reason: from kotlin metadata */
    private static final float ItemLeadingAvatarSize;

    /* JADX INFO: renamed from: U0, reason: from kotlin metadata */
    private static final p ItemSelectedOverlineColor;

    /* JADX INFO: renamed from: V, reason: from kotlin metadata */
    private static final p ItemLeadingIconColor;

    /* JADX INFO: renamed from: V0, reason: from kotlin metadata */
    private static final w0 ItemSelectedPressedContainerExpressiveShape;

    /* JADX INFO: renamed from: W, reason: from kotlin metadata */
    private static final float ItemLeadingIconExpressiveSize;

    /* JADX INFO: renamed from: W0, reason: from kotlin metadata */
    private static final p ItemSelectedPressedLabelTextColor;

    /* JADX INFO: renamed from: X, reason: from kotlin metadata */
    private static final float ItemLeadingIconSize;

    /* JADX INFO: renamed from: X0, reason: from kotlin metadata */
    private static final p ItemSelectedPressedLeadingIconColor;

    /* JADX INFO: renamed from: Y, reason: from kotlin metadata */
    private static final w0 ItemLeadingImageExpressiveShape;

    /* JADX INFO: renamed from: Y0, reason: from kotlin metadata */
    private static final p ItemSelectedPressedTrailingIconColor;

    /* JADX INFO: renamed from: Z, reason: from kotlin metadata */
    private static final float ItemLeadingImageHeight;

    /* JADX INFO: renamed from: Z0, reason: from kotlin metadata */
    private static final p ItemSelectedSupportingTextColor;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final g0 f114547a = new g0();

    /* JADX INFO: renamed from: a0, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemLeadingImageShape;

    /* JADX INFO: renamed from: a1, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedTrailingIconColor;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final w0 ContainerShape;

    /* JADX INFO: renamed from: b0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemLeadingImageWidth;

    /* JADX INFO: renamed from: b1, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedTrailingSupportingTextColor;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final float DividerBottomSpace;

    /* JADX INFO: renamed from: c0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemLeadingSpace;

    /* JADX INFO: renamed from: c1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSmallLeadingVideoHeight;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private static final float DividerLeadingSpace;

    /* JADX INFO: renamed from: d0, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemLeadingVideoShape;

    /* JADX INFO: renamed from: d1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSmallLeadingVideoWidth;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private static final float DividerTopSpace;

    /* JADX INFO: renamed from: e0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemLeadingVideoWidth;

    /* JADX INFO: renamed from: e1, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSupportingTextColor;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private static final float DividerTrailingSpace;

    /* JADX INFO: renamed from: f0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemOneLineContainerHeight;

    /* JADX INFO: renamed from: f1, reason: collision with root package name and from kotlin metadata */
    private static final k1 ItemSupportingTextFont;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private static final p FocusIndicatorColor;

    /* JADX INFO: renamed from: g0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemOverlineColor;

    /* JADX INFO: renamed from: g1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemThreeLineContainerHeight;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private static final float ItemBetweenSpace;

    /* JADX INFO: renamed from: h0, reason: collision with root package name and from kotlin metadata */
    private static final k1 ItemOverlineFont;

    /* JADX INFO: renamed from: h1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemTopSpace;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private static final float ItemBottomSpace;

    /* JADX INFO: renamed from: i0, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemPressedContainerExpressiveShape;

    /* JADX INFO: renamed from: i1, reason: collision with root package name and from kotlin metadata */
    private static final p ItemTrailingIconColor;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private static final p ItemContainerColor;

    /* JADX INFO: renamed from: j0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemPressedLabelTextColor;

    /* JADX INFO: renamed from: j1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemTrailingIconExpressiveSize;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private static final float ItemContainerElevation;

    /* JADX INFO: renamed from: k0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemPressedLeadingIconIconColor;

    /* JADX INFO: renamed from: k1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemTrailingIconSize;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemContainerExpressiveShape;

    /* JADX INFO: renamed from: l0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemPressedTrailingIconIconColor;

    /* JADX INFO: renamed from: l1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemTrailingSpace;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemContainerShape;

    /* JADX INFO: renamed from: m0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSegmentedContainerColor;

    /* JADX INFO: renamed from: m1, reason: collision with root package name and from kotlin metadata */
    private static final p ItemTrailingSupportingTextColor;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemDisabledContainerExpressiveShape;

    /* JADX INFO: renamed from: n0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedContainerColor;

    /* JADX INFO: renamed from: n1, reason: collision with root package name and from kotlin metadata */
    private static final k1 ItemTrailingSupportingTextFont;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private static final p ItemDisabledLabelTextColor;

    /* JADX INFO: renamed from: o0, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemSelectedContainerExpressiveShape;

    /* JADX INFO: renamed from: o1, reason: collision with root package name and from kotlin metadata */
    private static final float ItemTwoLineContainerHeight;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDisabledLabelTextOpacity;

    /* JADX INFO: renamed from: p0, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemSelectedContainerShape;

    /* JADX INFO: renamed from: p1, reason: collision with root package name and from kotlin metadata */
    private static final p ItemUnselectedTrailingIconColor;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private static final p ItemDisabledLeadingIconColor;

    /* JADX INFO: renamed from: q0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedDisabledContainerColor;

    /* JADX INFO: renamed from: q1, reason: collision with root package name and from kotlin metadata */
    private static final float SegmentedGap;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDisabledLeadingIconOpacity;

    /* JADX INFO: renamed from: r0, reason: collision with root package name and from kotlin metadata */
    private static final w0 ItemSelectedDisabledContainerExpressiveShape;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private static final p ItemDisabledOverlineColor;

    /* JADX INFO: renamed from: s0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSelectedDisabledContainerOpacity;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDisabledOverlineOpacity;

    /* JADX INFO: renamed from: t0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedDisabledLabelTextColor;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDisabledStateLayerOpacity;

    /* JADX INFO: renamed from: u0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSelectedDisabledLabelTextOpacity;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private static final p ItemDisabledSupportingTextColor;

    /* JADX INFO: renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedDisabledLeadingIconColor;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDisabledSupportingTextOpacity;

    /* JADX INFO: renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSelectedDisabledLeadingIconOpacity;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private static final p ItemDisabledTrailingIconColor;

    /* JADX INFO: renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private static final p ItemSelectedDisabledOverlineColor;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDisabledTrailingIconOpacity;

    /* JADX INFO: renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSelectedDisabledOverlineOpacity;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private static final float ItemDraggedContainerElevation;

    /* JADX INFO: renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private static final float ItemSelectedDisabledStateLayerOpacity;

    static {
        w0 w0Var = w0.CornerLarge;
        ContainerShape = w0Var;
        float f15 = (float) 0.0d;
        DividerBottomSpace = c5.h.n(f15);
        float f16 = (float) 16.0d;
        DividerLeadingSpace = c5.h.n(f16);
        DividerTopSpace = c5.h.n(f15);
        DividerTrailingSpace = c5.h.n(f16);
        FocusIndicatorColor = p.Secondary;
        ItemBetweenSpace = c5.h.n((float) 12.0d);
        float f17 = (float) 10.0d;
        ItemBottomSpace = c5.h.n(f17);
        p pVar = p.Surface;
        ItemContainerColor = pVar;
        t tVar = t.f115244a;
        ItemContainerElevation = tVar.a();
        w0 w0Var2 = w0.CornerExtraSmall;
        ItemContainerExpressiveShape = w0Var2;
        w0 w0Var3 = w0.CornerNone;
        ItemContainerShape = w0Var3;
        ItemDisabledContainerExpressiveShape = w0Var2;
        p pVar2 = p.OnSurface;
        ItemDisabledLabelTextColor = pVar2;
        ItemDisabledLabelTextOpacity = 0.38f;
        ItemDisabledLeadingIconColor = pVar2;
        ItemDisabledLeadingIconOpacity = 0.38f;
        ItemDisabledOverlineColor = pVar2;
        ItemDisabledOverlineOpacity = 0.38f;
        ItemDisabledStateLayerOpacity = 0.1f;
        ItemDisabledSupportingTextColor = pVar2;
        ItemDisabledSupportingTextOpacity = 0.38f;
        ItemDisabledTrailingIconColor = pVar2;
        ItemDisabledTrailingIconOpacity = 0.38f;
        ItemDraggedContainerElevation = tVar.e();
        ItemDraggedContainerExpressiveShape = w0Var;
        ItemDraggedLabelTextColor = pVar2;
        p pVar3 = p.OnSurfaceVariant;
        ItemDraggedLeadingIconIconColor = pVar3;
        ItemDraggedTrailingIconIconColor = pVar3;
        ItemFocusLabelTextColor = pVar2;
        ItemFocusLeadingIconIconColor = pVar3;
        ItemFocusTrailingIconIconColor = pVar3;
        ItemFocusedContainerExpressiveShape = w0Var;
        ItemHoverLabelTextColor = pVar2;
        ItemHoverLeadingIconIconColor = pVar3;
        ItemHoverTrailingIconIconColor = pVar3;
        ItemHoveredContainerExpressiveShape = w0.CornerMedium;
        ItemLabelTextColor = pVar2;
        ItemLabelTextFont = k1.BodyLarge;
        ItemLargeLeadingVideoHeight = c5.h.n((float) 64.0d);
        ItemLargeLeadingVideoWidth = c5.h.n((float) 114.0d);
        ItemLeadingAvatarColor = p.PrimaryContainer;
        ItemLeadingAvatarLabelColor = p.OnPrimaryContainer;
        ItemLeadingAvatarLabelFont = k1.TitleMedium;
        ItemLeadingAvatarShape = w0.CornerFull;
        ItemLeadingAvatarSize = c5.h.n((float) 40.0d);
        ItemLeadingIconColor = pVar3;
        float f18 = (float) 20.0d;
        ItemLeadingIconExpressiveSize = c5.h.n(f18);
        float f19 = (float) 24.0d;
        ItemLeadingIconSize = c5.h.n(f19);
        w0 w0Var4 = w0.CornerSmall;
        ItemLeadingImageExpressiveShape = w0Var4;
        float f25 = (float) 56.0d;
        ItemLeadingImageHeight = c5.h.n(f25);
        ItemLeadingImageShape = w0Var3;
        ItemLeadingImageWidth = c5.h.n(f25);
        ItemLeadingSpace = c5.h.n(f16);
        ItemLeadingVideoShape = w0Var4;
        float f26 = (float) 100.0d;
        ItemLeadingVideoWidth = c5.h.n(f26);
        ItemOneLineContainerHeight = c5.h.n(f25);
        ItemOverlineColor = pVar3;
        k1 k1Var = k1.LabelSmall;
        ItemOverlineFont = k1Var;
        ItemPressedContainerExpressiveShape = w0Var;
        ItemPressedLabelTextColor = pVar2;
        ItemPressedLeadingIconIconColor = pVar3;
        ItemPressedTrailingIconIconColor = pVar3;
        ItemSegmentedContainerColor = pVar;
        ItemSelectedContainerColor = p.SecondaryContainer;
        ItemSelectedContainerExpressiveShape = w0Var;
        ItemSelectedContainerShape = w0Var;
        ItemSelectedDisabledContainerColor = pVar2;
        ItemSelectedDisabledContainerExpressiveShape = w0Var;
        ItemSelectedDisabledContainerOpacity = 0.38f;
        ItemSelectedDisabledLabelTextColor = pVar2;
        ItemSelectedDisabledLabelTextOpacity = 0.38f;
        ItemSelectedDisabledLeadingIconColor = pVar2;
        ItemSelectedDisabledLeadingIconOpacity = 0.38f;
        ItemSelectedDisabledOverlineColor = pVar2;
        ItemSelectedDisabledOverlineOpacity = 0.38f;
        ItemSelectedDisabledStateLayerOpacity = 0.1f;
        ItemSelectedDisabledSupportingTextColor = pVar2;
        ItemSelectedDisabledSupportingTextOpacity = 0.38f;
        ItemSelectedDisabledTrailingIconColor = pVar2;
        ItemSelectedDisabledTrailingIconOpacity = 0.38f;
        ItemSelectedDisabledTrailingSupportingTextColor = pVar2;
        ItemSelectedDisabledTrailingSupportingTextOpacity = 0.38f;
        ItemSelectedDraggedContainerExpressiveShape = w0Var;
        p pVar4 = p.OnSecondaryContainer;
        ItemSelectedDraggedLabelTextColor = pVar4;
        ItemSelectedDraggedLeadingIconColor = pVar2;
        ItemSelectedDraggedTrailingIconColor = pVar2;
        ItemSelectedFocusLabelTextColor = pVar4;
        ItemSelectedFocusLeadingIconColor = pVar2;
        ItemSelectedFocusTrailingIconColor = pVar2;
        ItemSelectedFocusedContainerExpressiveShape = w0Var;
        ItemSelectedHoverLabelTextColor = pVar4;
        ItemSelectedHoverLeadingIconColor = pVar2;
        ItemSelectedHoverTrailingIconColor = pVar2;
        ItemSelectedHoveredContainerExpressiveShape = w0Var;
        ItemSelectedLabelTextColor = pVar4;
        ItemSelectedLeadingIconColor = pVar4;
        ItemSelectedOverlineColor = pVar4;
        ItemSelectedPressedContainerExpressiveShape = w0Var;
        ItemSelectedPressedLabelTextColor = pVar4;
        ItemSelectedPressedLeadingIconColor = pVar2;
        ItemSelectedPressedTrailingIconColor = pVar2;
        ItemSelectedSupportingTextColor = pVar4;
        ItemSelectedTrailingIconColor = pVar4;
        ItemSelectedTrailingSupportingTextColor = pVar4;
        ItemSmallLeadingVideoHeight = c5.h.n(f25);
        ItemSmallLeadingVideoWidth = c5.h.n(f26);
        ItemSupportingTextColor = pVar3;
        ItemSupportingTextFont = k1.BodyMedium;
        ItemThreeLineContainerHeight = c5.h.n((float) 88.0d);
        ItemTopSpace = c5.h.n(f17);
        ItemTrailingIconColor = pVar3;
        ItemTrailingIconExpressiveSize = c5.h.n(f18);
        ItemTrailingIconSize = c5.h.n(f19);
        ItemTrailingSpace = c5.h.n(f16);
        ItemTrailingSupportingTextColor = pVar3;
        ItemTrailingSupportingTextFont = k1Var;
        ItemTwoLineContainerHeight = c5.h.n((float) 72.0d);
        ItemUnselectedTrailingIconColor = pVar2;
        SegmentedGap = c5.h.n((float) 2.0d);
    }

    private g0() {
    }

    public final p a() {
        return ItemDisabledLabelTextColor;
    }

    public final float b() {
        return ItemDisabledLabelTextOpacity;
    }

    public final p c() {
        return ItemDisabledLeadingIconColor;
    }

    public final float d() {
        return ItemDisabledLeadingIconOpacity;
    }

    public final p e() {
        return ItemDisabledTrailingIconColor;
    }

    public final float f() {
        return ItemDisabledTrailingIconOpacity;
    }

    public final p g() {
        return ItemLabelTextColor;
    }

    public final p h() {
        return ItemLeadingIconColor;
    }

    public final float i() {
        return ItemLeadingIconSize;
    }

    public final p j() {
        return ItemTrailingIconColor;
    }

    public final float k() {
        return ItemTrailingIconSize;
    }
}
