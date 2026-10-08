package z1;

import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p071kotlin.Metadata;
import p076m2.c6;
import p079n1.i7;
import p079n1.j4;
import p079n1.j6;
import p079n1.k6;
import p079n1.l4;
import p079n1.m7;
import p079n1.p4;
import p079n1.s3;
import q4.TextLayoutResult;
import q4.a4;
import q4.z3;
import v4.TextFieldValue;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0098\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b(\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u00002\u00020\u0001B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\t\u001a\u00020\b2\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018JI\u0010$\u001a\u00020\u00062\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001e\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u000f2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b$\u0010%J\u0017\u0010(\u001a\u00020\b2\u0006\u0010'\u001a\u00020&H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010,\u001a\u00020\u00192\u0006\u0010+\u001a\u00020*2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b,\u0010-J\u0017\u0010/\u001a\u00020.2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020.H\u0000¢\u0006\u0004\b1\u00102J\u0019\u00104\u001a\u00020\b2\b\b\u0002\u00103\u001a\u00020\u000fH\u0000¢\u0006\u0004\b4\u0010\u0012J\u000f\u00105\u001a\u00020\bH\u0000¢\u0006\u0004\b5\u00106J\u001b\u00108\u001a\u00020\b2\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u001bH\u0000¢\u0006\u0004\b8\u00109J\u0017\u0010;\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\b2\u0006\u0010:\u001a\u00020\u0006H\u0000¢\u0006\u0004\b=\u0010<J\u000f\u0010>\u001a\u00020\bH\u0000¢\u0006\u0004\b>\u00106J\u000f\u0010?\u001a\u00020\u000fH\u0000¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\bH\u0080@¢\u0006\u0004\bA\u0010BJ\u000f\u0010C\u001a\u00020\u000fH\u0000¢\u0006\u0004\bC\u0010@J\u000f\u0010D\u001a\u00020\u000fH\u0000¢\u0006\u0004\bD\u0010@J\u000f\u0010E\u001a\u00020\u000fH\u0000¢\u0006\u0004\bE\u0010@J\u000f\u0010F\u001a\u00020\u000fH\u0000¢\u0006\u0004\bF\u0010@J\u001b\u0010H\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010G\u001a\u00020\u000fH\u0000¢\u0006\u0004\bH\u0010IJ\u001b\u0010J\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010G\u001a\u00020\u000fH\u0000¢\u0006\u0004\bJ\u0010KJ\u0011\u0010L\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\bL\u0010\u0015J\u0017\u0010N\u001a\u00020\b2\u0006\u0010M\u001a\u00020*H\u0000¢\u0006\u0004\bN\u0010OJ\u0011\u0010P\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\bP\u0010\u0015J\u0011\u0010Q\u001a\u0004\u0018\u00010*H\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010S\u001a\u00020\bH\u0000¢\u0006\u0004\bS\u00106J\u000f\u0010T\u001a\u00020\bH\u0000¢\u0006\u0004\bT\u00106J\u0017\u0010U\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\bU\u0010VJ\u0017\u0010X\u001a\u00020W2\u0006\u0010\u001e\u001a\u00020\u000fH\u0000¢\u0006\u0004\bX\u0010YJ\u0017\u0010\\\u001a\u00020\u001b2\u0006\u0010[\u001a\u00020ZH\u0000¢\u0006\u0004\b\\\u0010]J\u000f\u0010^\u001a\u00020\bH\u0000¢\u0006\u0004\b^\u00106J\u000f\u0010_\u001a\u00020\bH\u0000¢\u0006\u0004\b_\u00106J\u000f\u0010`\u001a\u00020\u000fH\u0000¢\u0006\u0004\b`\u0010@R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\ba\u0010b\u001a\u0004\bc\u0010dR\"\u0010l\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bh\u0010i\"\u0004\bj\u0010kR.\u0010t\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\b0m8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bn\u0010o\u001a\u0004\bp\u0010q\"\u0004\br\u0010sR$\u0010|\u001a\u0004\u0018\u00010u8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R\u001b\u0010\u0080\u0001\u001a\b\u0012\u0004\u0012\u00020\u00190}8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010\u007fR*\u0010\u0088\u0001\u001a\u00030\u0081\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R2\u0010\u0090\u0001\u001a\u000b\u0012\u0004\u0012\u00020\b\u0018\u00010\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u008a\u0001\u0010\u008b\u0001\u001a\u0006\b\u008c\u0001\u0010\u008d\u0001\"\u0006\b\u008e\u0001\u0010\u008f\u0001R,\u0010\u0098\u0001\u001a\u0005\u0018\u00010\u0091\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0092\u0001\u0010\u0093\u0001\u001a\u0006\b\u0094\u0001\u0010\u0095\u0001\"\u0006\b\u0096\u0001\u0010\u0097\u0001R,\u0010 \u0001\u001a\u0005\u0018\u00010\u0099\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u009a\u0001\u0010\u009b\u0001\u001a\u0006\b\u009c\u0001\u0010\u009d\u0001\"\u0006\b\u009e\u0001\u0010\u009f\u0001R,\u0010¨\u0001\u001a\u0005\u0018\u00010¡\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b¢\u0001\u0010£\u0001\u001a\u0006\b¤\u0001\u0010¥\u0001\"\u0006\b¦\u0001\u0010§\u0001R,\u0010°\u0001\u001a\u0005\u0018\u00010©\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bª\u0001\u0010«\u0001\u001a\u0006\b¬\u0001\u0010\u00ad\u0001\"\u0006\b®\u0001\u0010¯\u0001R,\u0010¸\u0001\u001a\u0005\u0018\u00010±\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\b²\u0001\u0010³\u0001\u001a\u0006\b´\u0001\u0010µ\u0001\"\u0006\b¶\u0001\u0010·\u0001R,\u0010À\u0001\u001a\u0005\u0018\u00010¹\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bº\u0001\u0010»\u0001\u001a\u0006\b¼\u0001\u0010½\u0001\"\u0006\b¾\u0001\u0010¿\u0001R0\u0010Å\u0001\u001a\u00020\u000f2\u0007\u0010Á\u0001\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÂ\u0001\u0010\u007f\u001a\u0005\bÃ\u0001\u0010@\"\u0005\bÄ\u0001\u0010\u0012R0\u0010É\u0001\u001a\u00020\u000f2\u0007\u0010Á\u0001\u001a\u00020\u000f8F@FX\u0086\u008e\u0002¢\u0006\u0015\n\u0005\bÆ\u0001\u0010\u007f\u001a\u0005\bÇ\u0001\u0010@\"\u0005\bÈ\u0001\u0010\u0012R\u0018\u0010Ë\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÊ\u0001\u0010QR\u001b\u0010Î\u0001\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\bÌ\u0001\u0010Í\u0001R\u0018\u0010Ð\u0001\u001a\u00020\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÏ\u0001\u0010QR8\u0010×\u0001\u001a\u0005\u0018\u00010Ñ\u00012\n\u0010Á\u0001\u001a\u0005\u0018\u00010Ñ\u00018F@BX\u0086\u008e\u0002¢\u0006\u0017\n\u0005\bÒ\u0001\u0010\u007f\u001a\u0006\bÓ\u0001\u0010Ô\u0001\"\u0006\bÕ\u0001\u0010Ö\u0001R5\u0010Ü\u0001\u001a\u0004\u0018\u00010\u001b2\t\u0010Á\u0001\u001a\u0004\u0018\u00010\u001b8F@BX\u0086\u008e\u0002¢\u0006\u0016\n\u0005\bØ\u0001\u0010\u007f\u001a\u0006\bÙ\u0001\u0010Ú\u0001\"\u0005\bÛ\u0001\u00109R\u0019\u0010ß\u0001\u001a\u00030Ý\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bÞ\u0001\u0010PR\u0018\u0010á\u0001\u001a\u00020\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bT\u0010à\u0001R\u001b\u0010ä\u0001\u001a\u0005\u0018\u00010â\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bF\u0010ã\u0001R)\u0010è\u0001\u001a\u0004\u0018\u00010\u00068\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b?\u0010Í\u0001\u001a\u0006\bå\u0001\u0010æ\u0001\"\u0005\bç\u0001\u0010\nR/\u0010ë\u0001\u001a\u00020\u000f2\u0007\u0010Á\u0001\u001a\u00020\u000f8B@BX\u0082\u008e\u0002¢\u0006\u0014\n\u0004\bD\u0010\u007f\u001a\u0005\bé\u0001\u0010@\"\u0005\bê\u0001\u0010\u0012R0\u0010ó\u0001\u001a\u00030ì\u00018\u0000@\u0000X\u0081\u000e¢\u0006\u001e\n\u0005\bC\u0010í\u0001\u0012\u0005\bò\u0001\u00106\u001a\u0006\bî\u0001\u0010ï\u0001\"\u0006\bð\u0001\u0010ñ\u0001R\u001d\u0010ö\u0001\u001a\u00020.8\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bE\u0010ô\u0001\u001a\u0005\bõ\u0001\u00102R\u001f\u0010û\u0001\u001a\u00030÷\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b>\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001R&\u0010þ\u0001\u001a\u00020\u000f8\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\bH\u0010¼\u0001\u001a\u0005\bü\u0001\u0010@\"\u0005\bý\u0001\u0010\u0012R\u0016\u0010\u0080\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÿ\u0001\u0010@R\u0016\u0010\u0082\u0002\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0002\u0010@R(\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00198@@@X\u0080\u000e¢\u0006\u0010\u001a\u0006\b\u0083\u0002\u0010\u0084\u0002\"\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0018\u0010\u0088\u0002\u001a\u0004\u0018\u00010*8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0002\u0010RR\u0015\u0010\u008c\u0002\u001a\u00030\u0089\u00028F¢\u0006\b\u001a\u0006\b\u008a\u0002\u0010\u008b\u0002R\u001d\u0010\u008f\u0002\u001a\u00020\u000f8@X\u0080\u0004¢\u0006\u000e\u0012\u0005\b\u008e\u0002\u00106\u001a\u0005\b\u008d\u0002\u0010@¨\u0006\u0090\u0002"}, d2 = {"Lz1/c2;", "", "Ln1/i7;", "undoManager", "<init>", "(Ln1/i7;)V", "Lq4/z3;", "selection", "Loq/i0;", "u0", "(Lq4/z3;)V", "Loq/r;", "", ip.a.f96137b, "()Loq/r;", "", "show", "Y0", "(Z)V", "Lju/d2;", "W0", "()Lju/d2;", "Lm3/g;", "Q", "()Lm3/g;", "Lv4/t0;", "value", "Lm3/e;", "currentPosition", "isStartOfSelection", "isStartHandle", "Lz1/p0;", "adjustment", "isTouchBasedSelection", "Lv3/b;", "hapticFeedbackType", "Z0", "(Lv4/t0;JZZLz1/p0;ZLv3/b;)J", "Ln1/r2;", "handleState", "H0", "(Ln1/r2;)V", "Lq4/e;", "annotatedString", "G", "(Lq4/e;J)Lv4/t0;", "Ln1/l4;", "q0", "(Z)Ln1/l4;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37087n, "()Ln1/l4;", "showFloatingToolbar", "M", "O", "()V", "position", "K", "(Lm3/e;)V", "range", "P0", "(J)V", "C0", "B", "x", "()Z", "X0", "(Ltq/e;)Ljava/lang/Object;", "z", "y", "A", "w", "cancelSelection", "C", "(Z)Lju/d2;", "E", "(Z)Lq4/e;", "w0", "text", "x0", "(Lq4/e;)V", "I", "J", "()Lq4/e;", "y0", "v", "b0", "(Z)J", "", "a0", "(Z)F", "Lc5/d;", "density", "V", "(Lc5/d;)J", "V0", "r0", "t0", "a", "Ln1/i7;", "getUndoManager", "()Ln1/i7;", "Lv4/i0;", "b", "Lv4/i0;", "h0", "()Lv4/i0;", "L0", "(Lv4/i0;)V", "offsetMapping", "Lkotlin/Function1;", "c", "Ler/l;", "i0", "()Ler/l;", "M0", "(Ler/l;)V", "onValueChange", "Ln1/s3;", "d", "Ln1/s3;", "k0", "()Ln1/s3;", "Q0", "(Ln1/s3;)V", "state", "Lm2/a3;", "e", "Lm2/a3;", "valueState", "Lv4/e1;", "f", "Lv4/e1;", "getVisualTransformation$foundation", "()Lv4/e1;", "U0", "(Lv4/e1;)V", "visualTransformation", "Lkotlin/Function0;", "g", "Ler/a;", "getRequestAutofillAction$foundation", "()Ler/a;", "O0", "(Ler/a;)V", "requestAutofillAction", "Landroidx/compose/ui/platform/b1;", "h", "Landroidx/compose/ui/platform/b1;", com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i.f37086m, "()Landroidx/compose/ui/platform/b1;", "z0", "(Landroidx/compose/ui/platform/b1;)V", "clipboard", "Lju/p0;", "i", "Lju/p0;", "T", "()Lju/p0;", "A0", "(Lju/p0;)V", "coroutineScope", "Lz1/x;", "j", "Lz1/x;", "j0", "()Lz1/x;", "N0", "(Lz1/x;)V", "platformSelectionBehaviors", "Landroidx/compose/ui/platform/v2;", "k", "Landroidx/compose/ui/platform/v2;", "l0", "()Landroidx/compose/ui/platform/v2;", "R0", "(Landroidx/compose/ui/platform/v2;)V", "textToolbar", "Lv3/a;", "l", "Lv3/a;", "c0", "()Lv3/a;", "I0", "(Lv3/a;)V", "hapticFeedBack", "Ll3/d0;", "m", "Ll3/d0;", "Z", "()Ll3/d0;", "G0", "(Ll3/d0;)V", "focusRequester", "<set-?>", "n", "X", "E0", "editable", "o", "Y", "F0", "enabled", "p", "dragBeginPosition", "q", "Lq4/z3;", "dragBeginSelection", "r", "dragTotalDistance", "Ln1/q2;", "s", "W", "()Ln1/q2;", "D0", "(Ln1/q2;)V", "draggingHandle", "t", "U", "()Lm3/e;", "B0", "currentDragPosition", "", "u", "previousRawDragOffset", "Lv4/t0;", "oldValue", "Lz1/e1;", "Lz1/e1;", "previousSelectionLayout", "f0", "()Lq4/z3;", "K0", "latestSelection", "d0", "J0", "hasAvailableTextToPaste", "Lt1/s;", "Lt1/s;", "getToolbarRequester$foundation", "()Lt1/s;", "setToolbarRequester$foundation", "(Lt1/s;)V", "getToolbarRequester$foundation$annotations", "toolbarRequester", "Ln1/l4;", "n0", "touchSelectionObserver", "Lz1/u;", "Lz1/u;", "g0", "()Lz1/u;", "mouseSelectionObserver", "getTextToolbarShownViaProvider$foundation", "S0", "textToolbarShownViaProvider", "s0", "isPassword", "e0", "hasSelection", "p0", "()Lv4/t0;", "T0", "(Lv4/t0;)V", "o0", "transformedText", "Lf3/m;", "R", "()Lf3/m;", "contextMenuAreaModifier", "m0", "getTextToolbarShown$foundation$annotations", "textToolbarShown", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class c2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final l4 touchSelectionObserver;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final u mouseSelectionObserver;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private boolean textToolbarShownViaProvider;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final i7 undoManager;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private v4.i0 offsetMapping;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private er.l<? super TextFieldValue, oq.i0> onValueChange;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private s3 state;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3<TextFieldValue> valueState;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private v4.e1 visualTransformation;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private er.a<oq.i0> requestAutofillAction;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.platform.b1 clipboard;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private ju.p0 coroutineScope;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private x platformSelectionBehaviors;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private androidx.compose.ui.platform.v2 textToolbar;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private v3.a hapticFeedBack;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private l3.d0 focusRequester;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 editable;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 enabled;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private long dragBeginPosition;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private z3 dragBeginSelection;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private long dragTotalDistance;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 draggingHandle;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 currentDragPosition;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private int previousRawDragOffset;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private TextFieldValue oldValue;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private e1 previousSelectionLayout;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private z3 latestSelection;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final p076m2.a3 hasAvailableTextToPaste;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private t1.s toolbarRequester;

    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lm3/e;", "clickLocation", "Loq/i0;", "<anonymous>", "(Lm3/e;)V"}, k = 3, mv = {2, 1, 0})
    static final class a extends vq.k implements er.p<m3.e, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f231998e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        /* synthetic */ long f231999f;

        a(tq.e<? super a> eVar) {
            super(2, eVar);
        }

        @Override // er.p
        public /* bridge */ /* synthetic */ Object B(m3.e eVar, tq.e<? super oq.i0> eVar2) {
            return M(eVar.getPackedValue(), eVar2);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x005f, code lost:
        
            if (r6.b(r7, r8, r10, r12) == r0) goto L20;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r13) throws java.lang.Throwable {
            /*
                r12 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r12.f231998e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r13)
                goto L62
            L12:
                java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r13.<init>(r0)
                throw r13
            L1a:
                long r3 = r12.f231999f
                oq.u.b(r13)
                goto L33
            L20:
                oq.u.b(r13)
                long r4 = r12.f231999f
                z1.c2 r13 = z1.c2.this
                r12.f231999f = r4
                r12.f231998e = r3
                java.lang.Object r13 = r13.X0(r12)
                if (r13 != r0) goto L32
                goto L61
            L32:
                r3 = r4
            L33:
                z1.c2 r13 = z1.c2.this
                oq.r r13 = z1.c2.f(r13)
                if (r13 == 0) goto L62
                z1.c2 r1 = z1.c2.this
                java.lang.Object r5 = r13.a()
                r7 = r5
                java.lang.String r7 = (java.lang.String) r7
                java.lang.Object r13 = r13.b()
                q4.z3 r13 = (q4.z3) r13
                long r8 = r13.getPackedValue()
                z1.x r6 = r1.getPlatformSelectionBehaviors()
                if (r6 == 0) goto L62
                m3.e r10 = m3.e.d(r3)
                r12.f231998e = r2
                r11 = r12
                java.lang.Object r13 = r6.b(r7, r8, r10, r11)
                if (r13 != r0) goto L62
            L61:
                return r0
            L62:
                oq.i0 r13 = oq.i0.f148189a
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.c2.a.J(java.lang.Object):java.lang.Object");
        }

        public final Object M(long j15, tq.e<? super oq.i0> eVar) {
            return ((a) v(m3.e.d(j15), eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            a aVar = c2.this.new a(eVar);
            aVar.f231999f = ((m3.e) obj).getPackedValue();
            return aVar;
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class b extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232001e;

        b(tq.e<? super b> eVar) {
            super(1, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
        
            if (r8.a(r4, r5, r7) == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r8) throws java.lang.Throwable {
            /*
                r7 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r7.f232001e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r8)
                goto L55
            L12:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1a:
                oq.u.b(r8)
                goto L2c
            L1e:
                oq.u.b(r8)
                z1.c2 r8 = z1.c2.this
                r7.f232001e = r3
                java.lang.Object r8 = r8.X0(r7)
                if (r8 != r0) goto L2c
                goto L54
            L2c:
                z1.c2 r8 = z1.c2.this
                oq.r r8 = z1.c2.f(r8)
                if (r8 == 0) goto L55
                z1.c2 r1 = z1.c2.this
                java.lang.Object r4 = r8.a()
                java.lang.String r4 = (java.lang.String) r4
                java.lang.Object r8 = r8.b()
                q4.z3 r8 = (q4.z3) r8
                long r5 = r8.getPackedValue()
                z1.x r8 = r1.getPlatformSelectionBehaviors()
                if (r8 == 0) goto L55
                r7.f232001e = r2
                java.lang.Object r8 = r8.a(r4, r5, r7)
                if (r8 != r0) goto L55
            L54:
                return r0
            L55:
                z1.c2 r8 = z1.c2.this
                r8.S0(r3)
                oq.i0 r8 = oq.i0.f148189a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.c2.b.J(java.lang.Object):java.lang.Object");
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return c2.this.new b(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((b) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Loq/i0;", "<anonymous>", "()V"}, k = 3, mv = {2, 1, 0})
    static final class c extends vq.k implements er.l<tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232003e;

        c(tq.e<? super c> eVar) {
            super(1, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            uq.b.e();
            if (this.f232003e != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            oq.u.b(obj);
            c2.this.S0(false);
            return oq.i0.f148189a;
        }

        public final tq.e<oq.i0> M(tq.e<?> eVar) {
            return c2.this.new c(eVar);
        }

        @Override // er.l
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object b(tq.e<? super oq.i0> eVar) {
            return ((c) M(eVar)).J(oq.i0.f148189a);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class d extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232005e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ boolean f232007g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(boolean z15, tq.e<? super d> eVar) {
            super(2, eVar);
            this.f232007g = z15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232005e;
            if (i15 == 0) {
                oq.u.b(obj);
                q4.e eVarE = c2.this.E(this.f232007g);
                if (eVarE == null) {
                    return oq.i0.f148189a;
                }
                androidx.compose.ui.platform.b1 clipboard = c2.this.getClipboard();
                if (clipboard != null) {
                    androidx.compose.ui.platform.a1 a1VarF = c1.b.f(eVarE);
                    this.f232005e = 1;
                    if (clipboard.b(a1VarF, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((d) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c2.this.new d(this.f232007g, eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"z1/c2$e", "Ln1/l4;", "Lm3/e;", "point", "Loq/i0;", "a", "(J)V", "c", "()V", "startPoint", "Lz1/p0;", "selectionAdjustment", "b", "(JLz1/p0;)V", "delta", "d", "e", "onCancel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements l4 {
        e() {
        }

        @Override // p079n1.l4
        public void a(long point) {
        }

        @Override // p079n1.l4
        public void b(long startPoint, p0 selectionAdjustment) {
            k6 k6VarN;
            long jA = c1.a(c2.this.b0(true));
            s3 state = c2.this.getState();
            if (state == null || (k6VarN = state.n()) == null) {
                return;
            }
            long jK = k6VarN.k(jA);
            c2.this.dragBeginPosition = jK;
            c2.this.B0(m3.e.d(jK));
            c2.this.dragTotalDistance = m3.e.INSTANCE.c();
            c2.this.D0(p079n1.q2.Cursor);
            c2.this.Y0(false);
        }

        @Override // p079n1.l4
        public void c() {
            c2.this.D0(null);
            c2.this.B0(null);
        }

        @Override // p079n1.l4
        public void d(long delta) {
            k6 k6VarN;
            v3.a hapticFeedBack;
            c2 c2Var = c2.this;
            c2Var.dragTotalDistance = m3.e.q(c2Var.dragTotalDistance, delta);
            s3 state = c2.this.getState();
            if (state == null || (k6VarN = state.n()) == null) {
                return;
            }
            c2 c2Var2 = c2.this;
            c2Var2.B0(m3.e.d(m3.e.q(c2Var2.dragBeginPosition, c2Var2.dragTotalDistance)));
            int iB = c2Var2.getOffsetMapping().b(k6.e(k6VarN, c2Var2.U().getPackedValue(), false, 2, null));
            long jB = a4.b(iB, iB);
            if (z3.g(jB, c2Var2.p0().getSelection())) {
                return;
            }
            s3 state2 = c2Var2.getState();
            if ((state2 == null || state2.C()) && (hapticFeedBack = c2Var2.getHapticFeedBack()) != null) {
                hapticFeedBack.a(v3.b.INSTANCE.j());
            }
            c2Var2.i0().b(c2Var2.G(c2Var2.p0().getText(), jB));
            c2Var2.K0(z3.b(jB));
        }

        @Override // p079n1.l4
        public void e() {
            c2.this.D0(null);
            c2.this.B0(null);
        }

        @Override // p079n1.l4
        public void onCancel() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232009e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232009e;
            if (i15 == 0) {
                oq.u.b(obj);
                q4.e eVarJ = c2.this.J();
                if (eVarJ == null) {
                    return oq.i0.f148189a;
                }
                androidx.compose.ui.platform.b1 clipboard = c2.this.getClipboard();
                if (clipboard != null) {
                    androidx.compose.ui.platform.a1 a1VarF = c1.b.f(eVarJ);
                    this.f232009e = 1;
                    if (clipboard.b(a1VarF, this) == objE) {
                        return objE;
                    }
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((f) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c2.this.new f(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u000f\u0010\u0006J\u000f\u0010\u0010\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0011\u0010\b¨\u0006\u0012"}, d2 = {"z1/c2$g", "Ln1/l4;", "Lm3/e;", "point", "Loq/i0;", "a", "(J)V", "c", "()V", "startPoint", "Lz1/p0;", "selectionAdjustment", "b", "(JLz1/p0;)V", "delta", "d", "e", "onCancel", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class g implements l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ boolean f232012b;

        g(boolean z15) {
            this.f232012b = z15;
        }

        @Override // p079n1.l4
        public void a(long point) {
            k6 k6VarN;
            c2.this.D0(this.f232012b ? p079n1.q2.SelectionStart : p079n1.q2.SelectionEnd);
            long jA = c1.a(c2.this.b0(this.f232012b));
            s3 state = c2.this.getState();
            if (state == null || (k6VarN = state.n()) == null) {
                return;
            }
            long jK = k6VarN.k(jA);
            c2.this.dragBeginPosition = jK;
            c2.this.B0(m3.e.d(jK));
            c2.this.dragTotalDistance = m3.e.INSTANCE.c();
            c2.this.previousRawDragOffset = -1;
            s3 state2 = c2.this.getState();
            if (state2 != null) {
                state2.M(true);
            }
            c2.this.Y0(false);
        }

        @Override // p079n1.l4
        public void b(long startPoint, p0 selectionAdjustment) {
        }

        @Override // p079n1.l4
        public void c() {
            c2.this.D0(null);
            c2.this.B0(null);
            c2.this.Y0(true);
        }

        @Override // p079n1.l4
        public void d(long delta) {
            c2 c2Var = c2.this;
            c2Var.dragTotalDistance = m3.e.q(c2Var.dragTotalDistance, delta);
            c2 c2Var2 = c2.this;
            c2Var2.B0(m3.e.d(m3.e.q(c2Var2.dragBeginPosition, c2.this.dragTotalDistance)));
            c2 c2Var3 = c2.this;
            c2Var3.Z0(c2Var3.p0(), c2.this.U().getPackedValue(), false, this.f232012b, p0.INSTANCE.k(), true, v3.b.a(v3.b.INSTANCE.j()));
            c2.this.Y0(false);
        }

        @Override // p079n1.l4
        public void e() {
            c2.this.D0(null);
            c2.this.B0(null);
            c2.this.Y0(true);
        }

        @Override // p079n1.l4
        public void onCancel() {
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232013e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ x f232014f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ String f232015g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f232016h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ z3 f232017j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ c2 f232018k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        final /* synthetic */ v4.i0 f232019l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(x xVar, String str, long j15, z3 z3Var, c2 c2Var, v4.i0 i0Var, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f232014f = xVar;
            this.f232015g = str;
            this.f232016h = j15;
            this.f232017j = z3Var;
            this.f232018k = c2Var;
            this.f232019l = i0Var;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232013e;
            if (i15 == 0) {
                oq.u.b(obj);
                x xVar = this.f232014f;
                String str = this.f232015g;
                long j15 = this.f232016h;
                this.f232013e = 1;
                obj = xVar.c(str, j15, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            z3 z3Var = (z3) obj;
            if (z3Var == null) {
                return oq.i0.f148189a;
            }
            v4.i0 i0Var = this.f232019l;
            long packedValue = z3Var.getPackedValue();
            long jB = a4.b(i0Var.b(z3.n(packedValue)), i0Var.b(z3.i(packedValue)));
            if (!z3.f(jB, this.f232017j) && fr.t.c(this.f232018k.p0().m(), this.f232015g) && this.f232019l == this.f232018k.getOffsetMapping()) {
                er.l<TextFieldValue, oq.i0> lVarI0 = this.f232018k.i0();
                c2 c2Var = this.f232018k;
                lVarI0.b(c2Var.G(c2Var.p0().getText(), jB));
                this.f232018k.K0(z3.b(jB));
            }
            return oq.i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((h) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return new h(this.f232014f, this.f232015g, this.f232016h, this.f232017j, this.f232018k, this.f232019l, eVar);
        }
    }

    @Metadata(d1 = {"\u0000=\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\b\u0010\u0006J'\u0010\r\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J-\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u0014\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR$\u0010%\u001a\u0004\u0018\u00010\u00158\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010 \u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$¨\u0006&"}, d2 = {"z1/c2$i", "Lz1/u;", "Lm3/e;", "downPosition", "", "e", "(J)Z", "dragPosition", "c", "Lz1/p0;", "adjustment", "", "clickCount", "d", "(JLz1/p0;I)Z", "b", "(JLz1/p0;)Z", "Lv4/t0;", "value", "currentPosition", "isStartOfSelection", "Lq4/z3;", "f", "(Lv4/t0;JZLz1/p0;)J", "Loq/i0;", "a", "()V", "Z", "isDoubleOrTripleClickSelectionOnly", "()Z", "setDoubleOrTripleClickSelectionOnly", "(Z)V", "Lq4/z3;", "getInitialSelection", "()Lq4/z3;", "setInitialSelection", "(Lq4/z3;)V", "initialSelection", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class i implements u {

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isDoubleOrTripleClickSelectionOnly = true;

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private z3 initialSelection;

        i() {
        }

        @Override // z1.u
        public void a() {
            if (this.isDoubleOrTripleClickSelectionOnly) {
                c2.this.u0(this.initialSelection);
            }
        }

        @Override // z1.u
        public boolean b(long dragPosition, p0 adjustment) {
            s3 state;
            if (!c2.this.Y() || c2.this.p0().m().length() == 0 || (state = c2.this.getState()) == null || state.n() == null) {
                return false;
            }
            f(c2.this.p0(), dragPosition, false, adjustment);
            return true;
        }

        @Override // z1.u
        public boolean c(long dragPosition) {
            s3 state;
            if (!c2.this.Y() || c2.this.p0().m().length() == 0 || (state = c2.this.getState()) == null || state.n() == null) {
                return false;
            }
            f(c2.this.p0(), dragPosition, false, p0.INSTANCE.l());
            return true;
        }

        @Override // z1.u
        public boolean d(long downPosition, p0 adjustment, int clickCount) {
            s3 state;
            if (!c2.this.Y() || c2.this.p0().m().length() == 0 || (state = c2.this.getState()) == null || state.n() == null) {
                return false;
            }
            l3.d0 focusRequester = c2.this.getFocusRequester();
            if (focusRequester != null) {
                l3.d0.f(focusRequester, 0, 1, null);
            }
            c2.this.dragBeginPosition = downPosition;
            c2.this.previousRawDragOffset = -1;
            c2.N(c2.this, false, 1, null);
            long jF = f(c2.this.p0(), c2.this.dragBeginPosition, true, adjustment);
            if (clickCount >= 2) {
                this.isDoubleOrTripleClickSelectionOnly = true;
                this.initialSelection = z3.b(jF);
            }
            return true;
        }

        @Override // z1.u
        public boolean e(long downPosition) {
            s3 state = c2.this.getState();
            if (state == null || state.n() == null || !c2.this.Y()) {
                return false;
            }
            c2.this.previousRawDragOffset = -1;
            l3.d0 focusRequester = c2.this.getFocusRequester();
            if (focusRequester != null) {
                l3.d0.f(focusRequester, 0, 1, null);
            }
            f(c2.this.p0(), downPosition, false, p0.INSTANCE.l());
            return true;
        }

        public final long f(TextFieldValue value, long currentPosition, boolean isStartOfSelection, p0 adjustment) {
            long jZ0 = c2.this.Z0(value, currentPosition, isStartOfSelection, false, adjustment, false, null);
            if (!z3.f(jZ0, this.initialSelection)) {
                this.isDoubleOrTripleClickSelectionOnly = false;
            }
            c2.this.H0(z3.h(jZ0) ? p079n1.r2.Cursor : p079n1.r2.Selection);
            return jZ0;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class j extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232023e;

        j(tq.e<? super j> eVar) {
            super(2, eVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x003c, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // vq.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object J(java.lang.Object r5) throws java.lang.Throwable {
            /*
                r4 = this;
                java.lang.Object r0 = uq.b.e()
                int r1 = r4.f232023e
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                oq.u.b(r5)
                goto L3f
            L12:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L1a:
                oq.u.b(r5)
                goto L32
            L1e:
                oq.u.b(r5)
                z1.c2 r5 = z1.c2.this
                androidx.compose.ui.platform.b1 r5 = r5.getClipboard()
                if (r5 == 0) goto L4c
                r4.f232023e = r3
                java.lang.Object r5 = r5.a(r4)
                if (r5 != r0) goto L32
                goto L3e
            L32:
                androidx.compose.ui.platform.a1 r5 = (androidx.compose.ui.platform.a1) r5
                if (r5 == 0) goto L4c
                r4.f232023e = r2
                java.lang.Object r5 = c1.b.e(r5, r4)
                if (r5 != r0) goto L3f
            L3e:
                return r0
            L3f:
                q4.e r5 = (q4.e) r5
                if (r5 != 0) goto L44
                goto L4c
            L44:
                z1.c2 r0 = z1.c2.this
                r0.x0(r5)
                oq.i0 r5 = oq.i0.f148189a
                return r5
            L4c:
                oq.i0 r5 = oq.i0.f148189a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: z1.c2.j.J(java.lang.Object):java.lang.Object");
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((j) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c2.this.new j(eVar);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class k extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f232025e;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class a extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f232027e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c2 f232028f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(c2 c2Var, tq.e<? super a> eVar) {
                super(2, eVar);
                this.f232028f = c2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f232027e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                c2.D(this.f232028f, false, 1, null);
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((a) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new a(this.f232028f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class b extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f232029e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c2 f232030f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            b(c2 c2Var, tq.e<? super b> eVar) {
                super(2, eVar);
                this.f232030f = c2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f232029e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f232030f.I();
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((b) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new b(this.f232030f, eVar);
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
        static final class c extends vq.k implements er.p<ju.p0, tq.e<? super oq.i0>, Object> {

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            int f232031e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ c2 f232032f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            c(c2 c2Var, tq.e<? super c> eVar) {
                super(2, eVar);
                this.f232032f = c2Var;
            }

            @Override // vq.a
            public final Object J(Object obj) throws Throwable {
                uq.b.e();
                if (this.f232031e != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
                this.f232032f.w0();
                return oq.i0.f148189a;
            }

            @Override // er.p
            /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
            public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
                return ((c) v(p0Var, eVar)).J(oq.i0.f148189a);
            }

            @Override // vq.a
            public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
                return new c(this.f232032f, eVar);
            }
        }

        k(tq.e<? super k> eVar) {
            super(2, eVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 Z(c2 c2Var) {
            ju.p0 coroutineScope = c2Var.getCoroutineScope();
            if (coroutineScope != null) {
                ju.k.d(coroutineScope, null, ju.r0.UNDISPATCHED, new a(c2Var, null), 1, null);
            }
            c2Var.r0();
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 a0(c2 c2Var) {
            ju.p0 coroutineScope = c2Var.getCoroutineScope();
            if (coroutineScope != null) {
                ju.k.d(coroutineScope, null, ju.r0.UNDISPATCHED, new b(c2Var, null), 1, null);
            }
            c2Var.r0();
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 b0(c2 c2Var) {
            ju.p0 coroutineScope = c2Var.getCoroutineScope();
            if (coroutineScope != null) {
                ju.k.d(coroutineScope, null, ju.r0.UNDISPATCHED, new c(c2Var, null), 1, null);
            }
            c2Var.r0();
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 c0(c2 c2Var) {
            c2Var.y0();
            return oq.i0.f148189a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final oq.i0 d0(c2 c2Var) {
            c2Var.v();
            return oq.i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f232025e;
            if (i15 == 0) {
                oq.u.b(obj);
                c2 c2Var = c2.this;
                this.f232025e = 1;
                if (c2Var.X0(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oq.u.b(obj);
            }
            c3.l.Companion companion = c3.l.INSTANCE;
            final c2 c2Var2 = c2.this;
            c3.l lVarD = companion.d();
            er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
            c3.l lVarE = companion.e(lVarD);
            try {
                er.a<oq.i0> aVar = c2Var2.x() ? new er.a() { // from class: z1.d2
                    @Override // er.a
                    public final Object a() {
                        return c2.k.Z(c2Var2);
                    }
                } : null;
                er.a<oq.i0> aVar2 = c2Var2.y() ? new er.a() { // from class: z1.e2
                    @Override // er.a
                    public final Object a() {
                        return c2.k.a0(c2Var2);
                    }
                } : null;
                er.a<oq.i0> aVar3 = c2Var2.z() ? new er.a() { // from class: z1.f2
                    @Override // er.a
                    public final Object a() {
                        return c2.k.b0(c2Var2);
                    }
                } : null;
                er.a<oq.i0> aVar4 = c2Var2.A() ? new er.a() { // from class: z1.g2
                    @Override // er.a
                    public final Object a() {
                        return c2.k.c0(c2Var2);
                    }
                } : null;
                er.a<oq.i0> aVar5 = c2Var2.w() ? new er.a() { // from class: z1.h2
                    @Override // er.a
                    public final Object a() {
                        return c2.k.d0(c2Var2);
                    }
                } : null;
                androidx.compose.ui.platform.v2 textToolbar = c2Var2.getTextToolbar();
                if (textToolbar != null) {
                    textToolbar.d(c2Var2.Q(), aVar, aVar3, aVar2, aVar4, aVar5);
                }
                oq.i0 i0Var = oq.i0.f148189a;
                return oq.i0.f148189a;
            } finally {
                companion.l(lVarD, lVarE, lVarG);
            }
        }

        @Override // er.p
        /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
        public final Object B(ju.p0 p0Var, tq.e<? super oq.i0> eVar) {
            return ((k) v(p0Var, eVar)).J(oq.i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<oq.i0> v(Object obj, tq.e<?> eVar) {
            return c2.this.new k(eVar);
        }
    }

    @Metadata(d1 = {"\u00001\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\t\u0010\u0004J\u001f\u0010\r\u001a\u00020\u00022\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0010\u0010\bJ\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0004J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0004R\u0016\u0010\u0015\u001a\u00020\u00138\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010\u0014R\u0018\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0017R\u0016\u0010\u001a\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\u0019¨\u0006\u001b"}, d2 = {"z1/c2$l", "Ln1/l4;", "Loq/i0;", "f", "()V", "Lm3/e;", "point", "a", "(J)V", "c", "startPoint", "Lz1/p0;", "selectionAdjustment", "b", "(JLz1/p0;)V", "delta", "d", "e", "onCancel", "", "Z", "isLongPressSelectionOnly", "Lq4/z3;", "Lq4/z3;", "runningSelection", "Lz1/p0;", "selectionAdjustmentMode", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class l implements l4 {

        /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
        private z3 runningSelection;

        /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
        private boolean isLongPressSelectionOnly = true;

        /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
        private p0 selectionAdjustmentMode = p0.INSTANCE.l();

        l() {
        }

        private final void f() {
            c2.this.D0(null);
            c2.this.B0(null);
            this.selectionAdjustmentMode = p0.INSTANCE.l();
            c2.this.Y0(true);
            z3 z3Var = this.runningSelection;
            boolean zH = z3.h(z3Var != null ? z3Var.getPackedValue() : c2.this.p0().getSelection());
            c2.this.H0(zH ? p079n1.r2.Cursor : p079n1.r2.Selection);
            s3 state = c2.this.getState();
            if (state != null) {
                state.W(!zH && c3.y(c2.this, true));
            }
            s3 state2 = c2.this.getState();
            if (state2 != null) {
                state2.V(!zH && c3.y(c2.this, false));
            }
            s3 state3 = c2.this.getState();
            if (state3 != null) {
                state3.T(zH && c3.y(c2.this, true));
            }
            if (this.isLongPressSelectionOnly) {
                c2 c2Var = c2.this;
                c2Var.u0(c2Var.dragBeginSelection);
            }
            c2.this.dragBeginSelection = null;
        }

        @Override // p079n1.l4
        public void a(long point) {
        }

        @Override // p079n1.l4
        public void b(long startPoint, p0 selectionAdjustment) {
            long j15;
            k6 k6VarN;
            k6 k6VarN2;
            if (c2.this.Y() && c2.this.W() == null) {
                c2.this.D0(p079n1.q2.SelectionEnd);
                c2.this.previousRawDragOffset = -1;
                this.isLongPressSelectionOnly = true;
                this.selectionAdjustmentMode = selectionAdjustment;
                c2.this.r0();
                s3 state = c2.this.getState();
                if (state == null || (k6VarN2 = state.n()) == null || !k6VarN2.g(startPoint)) {
                    j15 = startPoint;
                    s3 state2 = c2.this.getState();
                    if (state2 != null && (k6VarN = state2.n()) != null) {
                        c2 c2Var = c2.this;
                        int iB = c2Var.getOffsetMapping().b(k6.e(k6VarN, j15, false, 2, null));
                        TextFieldValue textFieldValueG = c2Var.G(c2Var.p0().getText(), a4.b(iB, iB));
                        c2Var.M(false);
                        v3.a hapticFeedBack = c2Var.getHapticFeedBack();
                        if (hapticFeedBack != null) {
                            hapticFeedBack.a(v3.b.INSTANCE.f());
                        }
                        c2Var.i0().b(textFieldValueG);
                        c2Var.K0(z3.b(textFieldValueG.getSelection()));
                    }
                    this.isLongPressSelectionOnly = false;
                } else {
                    if (c2.this.p0().m().length() == 0) {
                        return;
                    }
                    c2.this.M(false);
                    c2 c2Var2 = c2.this;
                    long jZ0 = c2Var2.Z0(TextFieldValue.i(c2Var2.p0(), null, z3.INSTANCE.a(), null, 5, null), startPoint, true, false, this.selectionAdjustmentMode, true, v3.b.a(v3.b.INSTANCE.f()));
                    j15 = startPoint;
                    c2.this.dragBeginSelection = z3.b(jZ0);
                    this.runningSelection = z3.b(jZ0);
                }
                c2.this.H0(p079n1.r2.None);
                c2.this.dragBeginPosition = j15;
                c2 c2Var3 = c2.this;
                c2Var3.B0(m3.e.d(c2Var3.dragBeginPosition));
                c2.this.dragTotalDistance = m3.e.INSTANCE.c();
            }
        }

        @Override // p079n1.l4
        public void c() {
        }

        @Override // p079n1.l4
        public void d(long delta) {
            k6 k6VarN;
            c2 c2Var;
            long jZ0;
            if (!c2.this.Y() || c2.this.p0().m().length() == 0) {
                return;
            }
            c2 c2Var2 = c2.this;
            c2Var2.dragTotalDistance = m3.e.q(c2Var2.dragTotalDistance, delta);
            s3 state = c2.this.getState();
            if (state != null && (k6VarN = state.n()) != null) {
                c2 c2Var3 = c2.this;
                c2Var3.B0(m3.e.d(m3.e.q(c2Var3.dragBeginPosition, c2Var3.dragTotalDistance)));
                if (c2Var3.dragBeginSelection != null || k6VarN.g(c2Var3.U().getPackedValue())) {
                    c2Var = c2Var3;
                    z3 z3Var = c2Var.dragBeginSelection;
                    int iN = z3Var != null ? z3.n(z3Var.getPackedValue()) : k6VarN.d(c2Var.dragBeginPosition, false);
                    int iD = k6VarN.d(c2Var.U().getPackedValue(), false);
                    if (c2Var.dragBeginSelection == null && iN == iD) {
                        return;
                    } else {
                        jZ0 = c2Var.Z0(c2Var.p0(), c2Var.U().getPackedValue(), false, false, this.selectionAdjustmentMode, true, v3.b.a(v3.b.INSTANCE.j()));
                    }
                } else {
                    c2Var = c2Var3;
                    jZ0 = c2Var.Z0(c2Var3.p0(), c2Var3.U().getPackedValue(), false, false, c2Var3.getOffsetMapping().b(k6.e(k6VarN, c2Var3.dragBeginPosition, false, 2, null)) == c2Var3.getOffsetMapping().b(k6.e(k6VarN, c2Var3.U().getPackedValue(), false, 2, null)) ? p0.INSTANCE.l() : p0.INSTANCE.n(), true, v3.b.a(v3.b.INSTANCE.j()));
                }
                this.runningSelection = z3.b(jZ0);
                if (!z3.f(jZ0, c2Var.dragBeginSelection)) {
                    this.isLongPressSelectionOnly = false;
                }
            }
            c2.this.Y0(false);
        }

        @Override // p079n1.l4
        public void e() {
            f();
        }

        @Override // p079n1.l4
        public void onCancel() {
            f();
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class m extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f232037d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f232038e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f232040g;

        m(tq.e<? super m> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f232038e = obj;
            this.f232040g |= PKIFailureInfo.systemUnavail;
            return c2.this.X0(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c2() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void B0(m3.e eVar) {
        this.currentDragPosition.setValue(eVar);
    }

    public static /* synthetic */ ju.d2 D(c2 c2Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return c2Var.C(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void D0(p079n1.q2 q2Var) {
        this.draggingHandle.setValue(q2Var);
    }

    public static /* synthetic */ q4.e F(c2 c2Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        return c2Var.E(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final TextFieldValue G(q4.e annotatedString, long selection) {
        return new TextFieldValue(annotatedString, selection, (z3) null, 4, (fr.k) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void H0(p079n1.r2 handleState) {
        s3 s3Var = this.state;
        if (s3Var != null) {
            if (s3Var.g() == handleState) {
                s3Var = null;
            }
            if (s3Var != null) {
                s3Var.K(handleState);
            }
        }
    }

    private final void J0(boolean z15) {
        this.hasAvailableTextToPaste.setValue(Boolean.valueOf(z15));
    }

    public static /* synthetic */ void L(c2 c2Var, m3.e eVar, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            eVar = null;
        }
        c2Var.K(eVar);
    }

    public static /* synthetic */ void N(c2 c2Var, boolean z15, int i15, Object obj) {
        if ((i15 & 1) != 0) {
            z15 = true;
        }
        c2Var.M(z15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final m3.g Q() {
        char c15;
        long j15;
        float fIntBitsToFloat;
        p036e4.b0 b0VarM;
        TextLayoutResult value;
        m3.g gVarE;
        p036e4.b0 b0VarM2;
        TextLayoutResult value2;
        m3.g gVarE2;
        p036e4.b0 b0VarM3;
        p036e4.b0 b0VarM4;
        s3 s3Var = this.state;
        if (s3Var != null) {
            if (s3Var.getIsLayoutResultStale()) {
                s3Var = null;
            }
            if (s3Var != null) {
                int iE = this.offsetMapping.e(z3.n(p0().getSelection()));
                int iE2 = this.offsetMapping.e(z3.i(p0().getSelection()));
                s3 s3Var2 = this.state;
                long jC = (s3Var2 == null || (b0VarM4 = s3Var2.m()) == null) ? m3.e.INSTANCE.c() : b0VarM4.A0(b0(true));
                s3 s3Var3 = this.state;
                long jC2 = (s3Var3 == null || (b0VarM3 = s3Var3.m()) == null) ? m3.e.INSTANCE.c() : b0VarM3.A0(b0(false));
                s3 s3Var4 = this.state;
                float fIntBitsToFloat2 = 0.0f;
                if (s3Var4 == null || (b0VarM2 = s3Var4.m()) == null) {
                    c15 = ' ';
                    j15 = BodyPartID.bodyIdMax;
                    fIntBitsToFloat = 0.0f;
                } else {
                    k6 k6VarN = s3Var.n();
                    float top = (k6VarN == null || (value2 = k6VarN.getValue()) == null || (gVarE2 = value2.e(iE)) == null) ? 0.0f : gVarE2.getTop();
                    long jFloatToRawIntBits = Float.floatToRawIntBits(0.0f);
                    int iFloatToRawIntBits = Float.floatToRawIntBits(top);
                    c15 = ' ';
                    j15 = BodyPartID.bodyIdMax;
                    fIntBitsToFloat = Float.intBitsToFloat((int) (b0VarM2.A0(m3.e.e((((long) iFloatToRawIntBits) & BodyPartID.bodyIdMax) | (jFloatToRawIntBits << 32))) & BodyPartID.bodyIdMax));
                }
                s3 s3Var5 = this.state;
                if (s3Var5 != null && (b0VarM = s3Var5.m()) != null) {
                    k6 k6VarN2 = s3Var.n();
                    fIntBitsToFloat2 = Float.intBitsToFloat((int) (b0VarM.A0(m3.e.e((((long) Float.floatToRawIntBits(0.0f)) << c15) | (((long) Float.floatToRawIntBits((k6VarN2 == null || (value = k6VarN2.getValue()) == null || (gVarE = value.e(iE2)) == null) ? 0.0f : gVarE.getTop())) & j15))) & j15));
                }
                int i15 = (int) (jC >> c15);
                int i16 = (int) (jC2 >> c15);
                return new m3.g(Math.min(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.min(fIntBitsToFloat, fIntBitsToFloat2), Math.max(Float.intBitsToFloat(i15), Float.intBitsToFloat(i16)), Math.max(Float.intBitsToFloat((int) (jC & j15)), Float.intBitsToFloat((int) (jC2 & j15))) + (c5.h.n(25) * s3Var.getTextDelegate().getDensity().getDensity()));
            }
        }
        return m3.g.INSTANCE.a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final oq.r<String, z3> S() {
        String text;
        z3 z3Var;
        q4.e eVarO0 = o0();
        if (eVarO0 == null || (text = eVarO0.getText()) == null || (z3Var = this.latestSelection) == null) {
            return null;
        }
        long packedValue = z3Var.getPackedValue();
        return new oq.r<>(text, z3.b(a4.b(this.offsetMapping.e(z3.n(packedValue)), this.offsetMapping.e(z3.i(packedValue)))));
    }

    private final ju.d2 W0() {
        ju.p0 p0Var = this.coroutineScope;
        if (p0Var != null) {
            return ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new k(null), 1, null);
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y0(boolean show) {
        s3 s3Var = this.state;
        if (s3Var != null) {
            s3Var.U(show);
        }
        if (show) {
            V0();
        } else {
            r0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long Z0(TextFieldValue value, long currentPosition, boolean isStartOfSelection, boolean isStartHandle, p0 adjustment, boolean isTouchBasedSelection, v3.b hapticFeedbackType) {
        k6 k6VarN;
        int i15;
        v3.a aVar;
        s3 s3Var = this.state;
        if (s3Var == null || (k6VarN = s3Var.n()) == null) {
            return z3.INSTANCE.a();
        }
        long jB = a4.b(this.offsetMapping.e(z3.n(value.getSelection())), this.offsetMapping.e(z3.i(value.getSelection())));
        boolean z15 = false;
        int iD = k6VarN.d(currentPosition, false);
        int iN = (isStartHandle || isStartOfSelection) ? iD : z3.n(jB);
        int i16 = (!isStartHandle || isStartOfSelection) ? iD : z3.i(jB);
        e1 e1Var = this.previousSelectionLayout;
        if (isStartOfSelection || e1Var == null || (i15 = this.previousRawDragOffset) == -1) {
            i15 = -1;
        }
        e1 e1VarB = g1.b(k6VarN.getValue(), iN, i16, i15, jB, isStartOfSelection, isStartHandle);
        if (!e1VarB.g(e1Var)) {
            return value.getSelection();
        }
        this.previousSelectionLayout = e1VarB;
        this.previousRawDragOffset = iD;
        Selection selectionA = adjustment.a(e1VarB);
        long jB2 = a4.b(this.offsetMapping.b(selectionA.getStart().getOffset()), this.offsetMapping.b(selectionA.getEnd().getOffset()));
        if (z3.g(jB2, value.getSelection())) {
            return value.getSelection();
        }
        boolean z16 = z3.m(jB2) != z3.m(value.getSelection()) && z3.g(a4.b(z3.i(jB2), z3.n(jB2)), value.getSelection());
        boolean z17 = z3.h(jB2) && z3.h(value.getSelection());
        if (isTouchBasedSelection && value.m().length() > 0 && !z16 && !z17 && hapticFeedbackType != null && (aVar = this.hapticFeedBack) != null) {
            aVar.a(hapticFeedbackType.getValue());
        }
        this.onValueChange.b(G(value.getText(), jB2));
        this.latestSelection = z3.b(jB2);
        if (!isTouchBasedSelection) {
            Y0(!z3.h(jB2));
        }
        s3 s3Var2 = this.state;
        if (s3Var2 != null) {
            s3Var2.M(isTouchBasedSelection);
        }
        s3 s3Var3 = this.state;
        if (s3Var3 != null) {
            s3Var3.W(!z3.h(jB2) && c3.y(this, true));
        }
        s3 s3Var4 = this.state;
        if (s3Var4 != null) {
            s3Var4.V(!z3.h(jB2) && c3.y(this, false));
        }
        s3 s3Var5 = this.state;
        if (s3Var5 != null) {
            if (z3.h(jB2) && c3.y(this, true)) {
                z15 = true;
            }
            s3Var5.T(z15);
        }
        return jB2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final m3.g c(c2 c2Var, p036e4.b0 b0Var) {
        p036e4.b0 b0VarM;
        m3.g gVarQ = c2Var.Q();
        s3 s3Var = c2Var.state;
        if (s3Var == null || (b0VarM = s3Var.m()) == null) {
            return null;
        }
        return t1.o.b(gVarQ, b0VarM, b0Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final boolean d0() {
        return ((Boolean) this.hasAvailableTextToPaste.getValue()).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean e0() {
        return !z3.h(p0().getSelection());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean s0() {
        return this.visualTransformation instanceof v4.k0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void u0(z3 selection) {
        x xVar;
        q4.e eVarO0;
        String text;
        ju.p0 p0Var;
        if (selection == null || (xVar = this.platformSelectionBehaviors) == null || (eVarO0 = o0()) == null || (text = eVarO0.getText()) == null) {
            return;
        }
        v4.i0 i0Var = this.offsetMapping;
        long jB = a4.b(i0Var.e(z3.n(selection.getPackedValue())), i0Var.e(z3.i(selection.getPackedValue())));
        if (text.length() <= 0 || z3.h(jB) || (p0Var = this.coroutineScope) == null) {
            return;
        }
        ju.k.d(p0Var, null, null, new h(xVar, text, jB, selection, this, i0Var, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final oq.i0 v0(TextFieldValue textFieldValue) {
        return oq.i0.f148189a;
    }

    public final boolean A() {
        return z3.j(p0().getSelection()) != p0().m().length();
    }

    public final void A0(ju.p0 p0Var) {
        this.coroutineScope = p0Var;
    }

    public final void B() {
        s3 s3Var = this.state;
        if (s3Var != null) {
            s3Var.J(z3.INSTANCE.a());
        }
        s3 s3Var2 = this.state;
        if (s3Var2 != null) {
            s3Var2.S(z3.INSTANCE.a());
        }
    }

    public final ju.d2 C(boolean cancelSelection) {
        ju.p0 p0Var = this.coroutineScope;
        if (p0Var != null) {
            return ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new d(cancelSelection, null), 1, null);
        }
        return null;
    }

    public final void C0(long range) {
        s3 s3Var = this.state;
        if (s3Var != null) {
            s3Var.J(range);
        }
        s3 s3Var2 = this.state;
        if (s3Var2 != null) {
            s3Var2.S(z3.INSTANCE.a());
        }
        if (z3.h(range)) {
            return;
        }
        O();
    }

    public final q4.e E(boolean cancelSelection) {
        if (!e0() || s0()) {
            return null;
        }
        q4.e eVarA = v4.u0.a(p0());
        if (!cancelSelection) {
            return eVarA;
        }
        int iK = z3.k(p0().getSelection());
        this.onValueChange.b(G(p0().getText(), a4.b(iK, iK)));
        H0(p079n1.r2.None);
        return eVarA;
    }

    public final void E0(boolean z15) {
        this.editable.setValue(Boolean.valueOf(z15));
    }

    public final void F0(boolean z15) {
        this.enabled.setValue(Boolean.valueOf(z15));
    }

    public final void G0(l3.d0 d0Var) {
        this.focusRequester = d0Var;
    }

    public final l4 H() {
        return new e();
    }

    public final ju.d2 I() {
        ju.p0 p0Var = this.coroutineScope;
        if (p0Var != null) {
            return ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new f(null), 1, null);
        }
        return null;
    }

    public final void I0(v3.a aVar) {
        this.hapticFeedBack = aVar;
    }

    public final q4.e J() {
        if (!e0() || !X() || s0()) {
            return null;
        }
        q4.e eVarA = v4.u0.a(p0());
        q4.e eVarR = v4.u0.c(p0(), p0().m().length()).r(v4.u0.b(p0(), p0().m().length()));
        int iL = z3.l(p0().getSelection());
        this.onValueChange.b(G(eVarR, a4.b(iL, iL)));
        H0(p079n1.r2.None);
        i7 i7Var = this.undoManager;
        if (i7Var != null) {
            i7Var.a();
        }
        return eVarA;
    }

    public final void K(m3.e position) {
        if (!z3.h(p0().getSelection())) {
            s3 s3Var = this.state;
            k6 k6VarN = s3Var != null ? s3Var.n() : null;
            TextFieldValue textFieldValueI = TextFieldValue.i(p0(), null, a4.a((position == null || k6VarN == null) ? z3.k(p0().getSelection()) : this.offsetMapping.b(k6.e(k6VarN, position.getPackedValue(), false, 2, null))), null, 5, null);
            this.onValueChange.b(textFieldValueI);
            this.latestSelection = z3.b(textFieldValueI.getSelection());
        }
        H0((position == null || p0().m().length() <= 0) ? p079n1.r2.None : p079n1.r2.Cursor);
        Y0(false);
    }

    public final void K0(z3 z3Var) {
        this.latestSelection = z3Var;
    }

    public final void L0(v4.i0 i0Var) {
        this.offsetMapping = i0Var;
    }

    public final void M(boolean showFloatingToolbar) {
        l3.d0 d0Var;
        s3 s3Var = this.state;
        if (s3Var != null && !s3Var.h() && (d0Var = this.focusRequester) != null) {
            l3.d0.f(d0Var, 0, 1, null);
        }
        this.oldValue = p0();
        Y0(showFloatingToolbar);
        H0(p079n1.r2.Selection);
    }

    public final void M0(er.l<? super TextFieldValue, oq.i0> lVar) {
        this.onValueChange = lVar;
    }

    public final void N0(x xVar) {
        this.platformSelectionBehaviors = xVar;
    }

    public final void O() {
        Y0(false);
        H0(p079n1.r2.None);
    }

    public final void O0(er.a<oq.i0> aVar) {
        this.requestAutofillAction = aVar;
    }

    /* JADX INFO: renamed from: P, reason: from getter */
    public final androidx.compose.ui.platform.b1 getClipboard() {
        return this.clipboard;
    }

    public final void P0(long range) {
        s3 s3Var = this.state;
        if (s3Var != null) {
            s3Var.S(range);
        }
        s3 s3Var2 = this.state;
        if (s3Var2 != null) {
            s3Var2.J(z3.INSTANCE.a());
        }
        if (z3.h(range)) {
            return;
        }
        O();
    }

    public final void Q0(s3 s3Var) {
        this.state = s3Var;
    }

    public final f3.m R() {
        return !Y() ? f3.m.INSTANCE : t1.o.a(t1.i.a(f3.m.INSTANCE, new a(null)), this.toolbarRequester, new b(null), new c(null), new er.l() { // from class: z1.b2
            @Override // er.l
            public final Object b(Object obj) {
                return c2.c(this.f231963a, (p036e4.b0) obj);
            }
        });
    }

    public final void R0(androidx.compose.ui.platform.v2 v2Var) {
        this.textToolbar = v2Var;
    }

    public final void S0(boolean z15) {
        this.textToolbarShownViaProvider = z15;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final ju.p0 getCoroutineScope() {
        return this.coroutineScope;
    }

    public final void T0(TextFieldValue textFieldValue) {
        this.valueState.setValue(textFieldValue);
        this.latestSelection = z3.b(textFieldValue.getSelection());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final m3.e U() {
        return (m3.e) this.currentDragPosition.getValue();
    }

    public final void U0(v4.e1 e1Var) {
        this.visualTransformation = e1Var;
    }

    public final long V(c5.d density) {
        int iE = this.offsetMapping.e(z3.n(p0().getSelection()));
        s3 s3Var = this.state;
        TextLayoutResult value = (s3Var != null ? s3Var.n() : null).getValue();
        m3.g gVarE = value.e(lr.m.n(iE, 0, value.getLayoutInput().getText().length()));
        return m3.e.e((((long) Float.floatToRawIntBits(gVarE.getLeft() + (density.l2(p4.a()) / 2))) << 32) | (((long) Float.floatToRawIntBits(gVarE.getBottom())) & BodyPartID.bodyIdMax));
    }

    public final void V0() {
        s3 s3Var;
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        er.l<Object, oq.i0> lVarG = lVarD != null ? lVarD.g() : null;
        c3.l lVarE = companion.e(lVarD);
        try {
            if (Y() && ((s3Var = this.state) == null || s3Var.C())) {
                oq.i0 i0Var = oq.i0.f148189a;
                companion.l(lVarD, lVarE, lVarG);
                if (w0.g0.isNewContextMenuEnabled) {
                    this.toolbarRequester.f();
                    return;
                } else {
                    W0();
                    return;
                }
            }
            companion.l(lVarD, lVarE, lVarG);
        } catch (Throwable th4) {
            companion.l(lVarD, lVarE, lVarG);
            throw th4;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final p079n1.q2 W() {
        return (p079n1.q2) this.draggingHandle.getValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean X() {
        return ((Boolean) this.editable.getValue()).booleanValue();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object X0(tq.e<? super oq.i0> eVar) throws Throwable {
        m mVar;
        c2 c2Var;
        if (eVar instanceof m) {
            mVar = (m) eVar;
            int i15 = mVar.f232040g;
            if ((i15 & PKIFailureInfo.systemUnavail) != 0) {
                mVar.f232040g = i15 - PKIFailureInfo.systemUnavail;
            } else {
                mVar = new m(eVar);
            }
        } else {
            mVar = new m(eVar);
        }
        Object objX = mVar.f232038e;
        Object objE = uq.b.e();
        int i16 = mVar.f232040g;
        if (i16 == 0) {
            oq.u.b(objX);
            androidx.compose.ui.platform.b1 b1Var = this.clipboard;
            if (b1Var != null && c1.b.c(b1Var)) {
                mVar.f232037d = this;
                mVar.f232040g = 1;
                objX = c3.x(this, mVar);
                if (objX == objE) {
                    return objE;
                }
                c2Var = this;
            }
            return oq.i0.f148189a;
        }
        if (i16 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c2Var = (c2) mVar.f232037d;
        oq.u.b(objX);
        c2Var.J0(((Boolean) objX).booleanValue());
        return oq.i0.f148189a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean Y() {
        return ((Boolean) this.enabled.getValue()).booleanValue();
    }

    /* JADX INFO: renamed from: Z, reason: from getter */
    public final l3.d0 getFocusRequester() {
        return this.focusRequester;
    }

    public final float a0(boolean isStartHandle) {
        k6 k6VarN;
        TextLayoutResult value;
        int iN = isStartHandle ? z3.n(p0().getSelection()) : z3.i(p0().getSelection());
        s3 s3Var = this.state;
        if (s3Var == null || (k6VarN = s3Var.n()) == null || (value = k6VarN.getValue()) == null) {
            return 0.0f;
        }
        return j6.b(value, iN);
    }

    public final long b0(boolean isStartHandle) {
        k6 k6VarN;
        TextLayoutResult value;
        s3 s3Var = this.state;
        if (s3Var == null || (k6VarN = s3Var.n()) == null || (value = k6VarN.getValue()) == null) {
            return m3.e.INSTANCE.b();
        }
        q4.e eVarO0 = o0();
        if (eVarO0 == null) {
            return m3.e.INSTANCE.b();
        }
        if (!fr.t.c(eVarO0.getText(), value.getLayoutInput().getText().getText())) {
            return m3.e.INSTANCE.b();
        }
        long selection = p0().getSelection();
        return h3.b(value, this.offsetMapping.e(isStartHandle ? z3.n(selection) : z3.i(selection)), isStartHandle, z3.m(p0().getSelection()));
    }

    /* JADX INFO: renamed from: c0, reason: from getter */
    public final v3.a getHapticFeedBack() {
        return this.hapticFeedBack;
    }

    /* JADX INFO: renamed from: f0, reason: from getter */
    public final z3 getLatestSelection() {
        return this.latestSelection;
    }

    /* JADX INFO: renamed from: g0, reason: from getter */
    public final u getMouseSelectionObserver() {
        return this.mouseSelectionObserver;
    }

    /* JADX INFO: renamed from: h0, reason: from getter */
    public final v4.i0 getOffsetMapping() {
        return this.offsetMapping;
    }

    public final er.l<TextFieldValue, oq.i0> i0() {
        return this.onValueChange;
    }

    /* JADX INFO: renamed from: j0, reason: from getter */
    public final x getPlatformSelectionBehaviors() {
        return this.platformSelectionBehaviors;
    }

    /* JADX INFO: renamed from: k0, reason: from getter */
    public final s3 getState() {
        return this.state;
    }

    /* JADX INFO: renamed from: l0, reason: from getter */
    public final androidx.compose.ui.platform.v2 getTextToolbar() {
        return this.textToolbar;
    }

    public final boolean m0() {
        if (w0.g0.isNewContextMenuEnabled) {
            return this.textToolbarShownViaProvider;
        }
        androidx.compose.ui.platform.v2 v2Var = this.textToolbar;
        return (v2Var != null ? v2Var.getStatus() : null) == androidx.compose.ui.platform.x2.Shown;
    }

    /* JADX INFO: renamed from: n0, reason: from getter */
    public final l4 getTouchSelectionObserver() {
        return this.touchSelectionObserver;
    }

    public final q4.e o0() {
        j4 textDelegate;
        s3 s3Var = this.state;
        if (s3Var == null || (textDelegate = s3Var.getTextDelegate()) == null) {
            return null;
        }
        return textDelegate.getText();
    }

    public final TextFieldValue p0() {
        return this.valueState.getValue();
    }

    public final l4 q0(boolean isStartHandle) {
        return new g(isStartHandle);
    }

    public final void r0() {
        androidx.compose.ui.platform.v2 v2Var;
        if (w0.g0.isNewContextMenuEnabled) {
            this.toolbarRequester.b();
            return;
        }
        androidx.compose.ui.platform.v2 v2Var2 = this.textToolbar;
        if ((v2Var2 != null ? v2Var2.getStatus() : null) != androidx.compose.ui.platform.x2.Shown || (v2Var = this.textToolbar) == null) {
            return;
        }
        v2Var.c();
    }

    public final boolean t0() {
        return !fr.t.c(this.oldValue.m(), p0().m());
    }

    public final void v() {
        er.a<oq.i0> aVar = this.requestAutofillAction;
        if (aVar != null) {
            aVar.a();
        }
    }

    public final boolean w() {
        return X() && z3.h(p0().getSelection());
    }

    public final ju.d2 w0() {
        ju.p0 p0Var = this.coroutineScope;
        if (p0Var != null) {
            return ju.k.d(p0Var, null, ju.r0.UNDISPATCHED, new j(null), 1, null);
        }
        return null;
    }

    public final boolean x() {
        androidx.compose.ui.platform.b1 b1Var;
        return e0() && !s0() && (b1Var = this.clipboard) != null && c1.b.d(b1Var);
    }

    public final void x0(q4.e text) {
        if (X()) {
            q4.e eVarR = v4.u0.c(p0(), p0().m().length()).r(text).r(v4.u0.b(p0(), p0().m().length()));
            int iL = z3.l(p0().getSelection()) + text.length();
            this.onValueChange.b(G(eVarR, a4.b(iL, iL)));
            H0(p079n1.r2.None);
            i7 i7Var = this.undoManager;
            if (i7Var != null) {
                i7Var.a();
            }
        }
    }

    public final boolean y() {
        androidx.compose.ui.platform.b1 b1Var;
        return e0() && X() && !s0() && (b1Var = this.clipboard) != null && c1.b.d(b1Var);
    }

    public final void y0() {
        TextFieldValue textFieldValueG = G(p0().getText(), a4.b(0, p0().m().length()));
        this.onValueChange.b(textFieldValueG);
        this.latestSelection = z3.b(textFieldValueG.getSelection());
        this.oldValue = TextFieldValue.i(this.oldValue, null, textFieldValueG.getSelection(), null, 5, null);
        M(true);
    }

    public final boolean z() {
        androidx.compose.ui.platform.b1 b1Var;
        return X() && d0() && (b1Var = this.clipboard) != null && c1.b.c(b1Var);
    }

    public final void z0(androidx.compose.ui.platform.b1 b1Var) {
        this.clipboard = b1Var;
    }

    public c2(i7 i7Var) {
        this.undoManager = i7Var;
        this.offsetMapping = m7.d();
        this.onValueChange = new er.l() { // from class: z1.a2
            @Override // er.l
            public final Object b(Object obj) {
                return c2.v0((TextFieldValue) obj);
            }
        };
        this.valueState = c6.e(new TextFieldValue((String) null, 0L, (z3) null, 7, (fr.k) null), null, 2, null);
        this.visualTransformation = v4.e1.INSTANCE.c();
        Boolean bool = Boolean.TRUE;
        this.editable = c6.e(bool, null, 2, null);
        this.enabled = c6.e(bool, null, 2, null);
        m3.e.Companion companion = m3.e.INSTANCE;
        this.dragBeginPosition = companion.c();
        this.dragTotalDistance = companion.c();
        this.draggingHandle = c6.e(null, null, 2, null);
        this.currentDragPosition = c6.e(null, null, 2, null);
        this.previousRawDragOffset = -1;
        this.oldValue = new TextFieldValue((String) null, 0L, (z3) null, 7, (fr.k) null);
        this.hasAvailableTextToPaste = c6.e(Boolean.FALSE, null, 2, null);
        this.toolbarRequester = new t1.t();
        this.touchSelectionObserver = new l();
        this.mouseSelectionObserver = new i();
    }

    public /* synthetic */ c2(i7 i7Var, int i15, fr.k kVar) {
        this((i15 & 1) != 0 ? null : i7Var);
    }
}
