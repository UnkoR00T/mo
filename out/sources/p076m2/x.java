package p076m2;

import c3.h;
import c3.v0;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import e3.v;
import er.p;
import fr.k;
import fr.t;
import ip.a;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import n2.e;
import n2.g;
import oq.i0;
import oq.r;
import oq.y;
import p071kotlin.Metadata;
import p2.l;
import p2.n;
import pq.e1;
import r0.h1;
import r0.t0;
import r0.u0;
import r0.y0;
import r2.a0;
import r2.o;
import y2.b0;
import y2.u;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u008a\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006B\u001b\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u0019\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u001d\u0010 \u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0002¢\u0006\u0004\b \u0010\u001aJ\u000f\u0010!\u001a\u00020\u0017H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u001bH\u0002¢\u0006\u0004\b#\u0010$J\u000f\u0010%\u001a\u00020\u0017H\u0002¢\u0006\u0004\b%\u0010\"J\u000f\u0010&\u001a\u00020\u0017H\u0002¢\u0006\u0004\b&\u0010\"J\u000f\u0010'\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010\"J\u001f\u0010*\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u00042\u0006\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b*\u0010+J%\u0010.\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,2\u0006\u0010)\u001a\u00020\u001bH\u0002¢\u0006\u0004\b.\u0010/J\u000f\u00100\u001a\u00020\u0017H\u0002¢\u0006\u0004\b0\u0010\"J\u0017\u00101\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\u00172\u0006\u00103\u001a\u00020\u0013H\u0002¢\u0006\u0004\b4\u00105J!\u00109\u001a\u00020\u001b2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b9\u0010:J)\u0010>\u001a\u00020=2\u0006\u00107\u001a\u0002062\u0006\u0010<\u001a\u00020;2\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0002¢\u0006\u0004\b>\u0010?J\u001b\u0010A\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040@H\u0002¢\u0006\u0004\bA\u0010BJ\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ\u001d\u0010F\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bF\u0010\u001aJ\u001d\u0010G\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bG\u0010\u001aJ\u001d\u0010H\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bH\u0010IJ\u001d\u0010J\u001a\u00020\u001d2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bJ\u0010IJ\u001f\u0010N\u001a\u00020\u00172\u000e\u0010M\u001a\n\u0012\u0004\u0012\u00020L\u0018\u00010KH\u0000¢\u0006\u0004\bN\u0010OJ\u001d\u0010P\u001a\u00020\u00172\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0017¢\u0006\u0004\bP\u0010\u001aJ\u000f\u0010Q\u001a\u00020\u0017H\u0000¢\u0006\u0004\bQ\u0010\"J\u000f\u0010R\u001a\u00020\u0017H\u0016¢\u0006\u0004\bR\u0010\"J\u001d\u0010S\u001a\u00020\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0016¢\u0006\u0004\bS\u0010TJ\u001d\u0010U\u001a\u00020\u001b2\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00040,H\u0016¢\u0006\u0004\bU\u0010VJ\u001d\u0010X\u001a\u00020\u00172\f\u0010W\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016H\u0016¢\u0006\u0004\bX\u0010YJ)\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040[0Z2\u0006\u0010<\u001a\u00020;H\u0000¢\u0006\u0004\b\\\u0010]J\u0017\u0010^\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b^\u00102J\u0017\u0010_\u001a\u00020\u00172\u0006\u0010(\u001a\u00020\u0004H\u0016¢\u0006\u0004\b_\u00102J\u000f\u0010`\u001a\u00020\u001bH\u0016¢\u0006\u0004\b`\u0010$J+\u0010c\u001a\u00020\u00172\u001a\u0010b\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020a\u0012\u0006\u0012\u0004\u0018\u00010a0[0ZH\u0016¢\u0006\u0004\bc\u0010dJ\u0017\u0010g\u001a\u00020\u00172\u0006\u0010f\u001a\u00020eH\u0016¢\u0006\u0004\bg\u0010hJ\u000f\u0010i\u001a\u00020\u0017H\u0016¢\u0006\u0004\bi\u0010\"J\u000f\u0010j\u001a\u00020\u0017H\u0016¢\u0006\u0004\bj\u0010\"J\u000f\u0010k\u001a\u00020\u0017H\u0016¢\u0006\u0004\bk\u0010\"J\u000f\u0010l\u001a\u00020\u0017H\u0016¢\u0006\u0004\bl\u0010\"J\u000f\u0010m\u001a\u00020\u0017H\u0016¢\u0006\u0004\bm\u0010\"J5\u0010q\u001a\u00028\u0000\"\u0004\b\u0000\u0010\\2\b\u0010n\u001a\u0004\u0018\u00010\u00012\u0006\u0010p\u001a\u00020o2\f\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\u0016H\u0016¢\u0006\u0004\bq\u0010rJ\u001b\u0010u\u001a\u0004\u0018\u00010s2\b\u0010t\u001a\u0004\u0018\u00010sH\u0016¢\u0006\u0004\bu\u0010vJ!\u0010w\u001a\u00020=2\u0006\u00107\u001a\u0002062\b\u00108\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\bw\u0010xJ\u0017\u0010y\u001a\u00020\u00172\u0006\u00107\u001a\u000206H\u0016¢\u0006\u0004\by\u0010zJ\u001f\u0010{\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u00042\u0006\u00107\u001a\u000206H\u0000¢\u0006\u0004\b{\u0010|J\u001b\u0010~\u001a\u00020\u00172\n\u0010f\u001a\u0006\u0012\u0002\b\u00030}H\u0000¢\u0006\u0004\b~\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0017H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\"R\u001a\u0010\b\u001a\u00020\u00078\u0007¢\u0006\u000f\n\u0005\b^\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0019\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bj\u0010\u0084\u0001R-\u0010\u0089\u0001\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0085\u0001j\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u0004`\u0086\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0087\u0001\u0010\u0088\u0001R\u001b\u0010\u008c\u0001\u001a\u00070\u0004j\u0003`\u008a\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bP\u0010\u008b\u0001R%\u0010\u0091\u0001\u001a\n\u0012\u0005\u0012\u00030\u008e\u00010\u008d\u00018\u0002X\u0082\u0004¢\u0006\u000e\n\u0005\bc\u0010\u008f\u0001\u0012\u0005\b\u0090\u0001\u0010\"R$\u0010\u0095\u0001\u001a\u00020\r8\u0000X\u0080\u0004¢\u0006\u0015\n\u0005\bq\u0010\u0092\u0001\u0012\u0005\b\u0094\u0001\u0010\"\u001a\u0005\b\u0093\u0001\u0010\u000fR\"\u0010\u0097\u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\by\u0010\u0096\u0001R\u001d\u0010\u009a\u0001\u001a\t\u0012\u0004\u0012\u0002060\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bF\u0010\u0099\u0001R\u001d\u0010\u009b\u0001\u001a\t\u0012\u0004\u0012\u0002060\u0098\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bR\u0010\u0099\u0001R&\u0010\u009c\u0001\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\b\u0012\u0006\u0012\u0002\b\u00030}0@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b`\u0010\u0096\u0001R\u0015\u00103\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bU\u0010\u009d\u0001R\u0017\u0010\u009f\u0001\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u009e\u0001\u0010\u009d\u0001R\"\u0010 \u0001\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002060@8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bJ\u0010\u0096\u0001R$\u0010¡\u0001\u001a\u000e\u0012\u0004\u0012\u000206\u0012\u0004\u0012\u00020\u00040@8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bg\u0010\u0096\u0001R-\u0010¦\u0001\u001a\u00020\u001b8\u0000@\u0000X\u0080\u000e¢\u0006\u001c\n\u0004\bX\u0010N\u0012\u0005\b¥\u0001\u0010\"\u001a\u0005\b¢\u0001\u0010$\"\u0006\b£\u0001\u0010¤\u0001R\u0019\u0010t\u001a\u0004\u0018\u00010s8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\bi\u0010§\u0001R\u001c\u0010«\u0001\u001a\u0005\u0018\u00010¨\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b©\u0001\u0010ª\u0001R\u001a\u0010\u00ad\u0001\u001a\u0004\u0018\u00010\u00008\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b_\u0010¬\u0001R\u0017\u0010®\u0001\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bG\u0010\u001eR \u0010´\u0001\u001a\u00030¯\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b°\u0001\u0010±\u0001\u001a\u0006\b²\u0001\u0010³\u0001R\u0018\u0010¸\u0001\u001a\u00030µ\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010·\u0001R\u001d\u0010»\u0001\u001a\u00020\u00108\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\bu\u0010¹\u0001\u001a\u0005\bº\u0001\u0010\u0012R\u0019\u0010¼\u0001\u001a\u00020\u001b8\u0006¢\u0006\r\n\u0004\bl\u0010N\u001a\u0005\b¼\u0001\u0010$R\u0016\u0010f\u001a\u00020o8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bk\u0010\u001eR-\u0010Á\u0001\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\bm\u0010½\u0001\u001a\u0006\b¾\u0001\u0010¿\u0001\"\u0005\bÀ\u0001\u0010\u001aR\u0016\u0010Ã\u0001\u001a\u00020\u001b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÂ\u0001\u0010$R\u0016\u0010Ä\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010$R\u0016\u0010Å\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010$R\u0016\u0010Æ\u0001\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b°\u0001\u0010$¨\u0006Ç\u0001"}, d2 = {"Lm2/x;", "Lm2/l0;", "Lm2/y4;", "Lm2/h4;", "", "Lm2/p3;", "Le3/v;", "Lm2/v;", "parent", "Lm2/c;", "applier", "<init>", "(Lm2/v;Lm2/c;)V", "Lm2/i5;", "M", "()Lm2/i5;", "Lm2/q1;", i.f37094u, "()Lm2/q1;", "Lm2/i;", "K", "()Lm2/i;", "Lkotlin/Function0;", "Loq/i0;", "content", i.f37087n, "(Ler/p;)V", "", "reusable", "Lm2/s3;", "I", "(ZLer/p;)Lm2/s3;", "J", "Q", "()V", "G", "()Z", "N", "O", i.f37086m, "value", "forgetConditionalScopes", "C", "(Ljava/lang/Object;Z)V", "", "values", a.f96138c, "(Ljava/util/Set;Z)V", "F", "X", "(Ljava/lang/Object;)V", "changes", "E", "(Lm2/i;)V", "Lm2/f4;", "scope", "instance", "d0", "(Lm2/f4;Ljava/lang/Object;)Z", "Lm2/b;", "anchor", "Lm2/s1;", "W", "(Lm2/f4;Lm2/b;Ljava/lang/Object;)Lm2/s1;", "Ln2/g;", "c0", "()Lr0/t0;", "Le3/o;", "Y", "()Le3/o;", "h", "v", "u", "(Ler/p;)Lm2/s3;", "n", "Lr0/h1;", "Lm2/v4;", "ignoreSet", "Z", "(Lr0/h1;)V", "d", "e0", "j", "o", "(Ljava/util/Set;)V", "l", "(Ljava/util/Set;)Z", "block", "q", "(Ler/a;)V", "", "Loq/r;", "R", "(Lm2/b;)Ljava/util/List;", "a", "t", "k", "Lm2/s2;", "references", "e", "(Ljava/util/List;)V", "Lm2/r2;", "state", "p", "(Lm2/r2;)V", "r", "b", "A", "z", "B", "to", "", "groupIndex", "f", "(Lm2/l0;ILer/a;)Ljava/lang/Object;", "Lm2/e5;", "shouldPause", "y", "(Lm2/e5;)Lm2/e5;", "i", "(Lm2/f4;Ljava/lang/Object;)Lm2/s1;", "g", "(Lm2/f4;)V", "b0", "(Ljava/lang/Object;Lm2/f4;)V", "Lm2/o0;", "a0", "(Lm2/o0;)V", "deactivate", "Lm2/v;", "getParent", "()Lm2/v;", "Lm2/c;", "Ljava/util/concurrent/atomic/AtomicReference;", "Landroidx/compose/runtime/internal/AtomicReference;", "c", "Ljava/util/concurrent/atomic/AtomicReference;", "pendingModifications", "Landroidx/compose/runtime/platform/SynchronizedObject;", "Ljava/lang/Object;", "lock", "", "Lm2/u4;", "Ljava/util/Set;", "getAbandonSet$annotations", "abandonSet", "Lm2/i5;", "V", "getSlotStorage$runtime$annotations", "slotStorage", "Lr0/t0;", "observations", "Lr0/u0;", "Lr0/u0;", "invalidatedScopes", "conditionallyInvalidatedScopes", "derivedStates", "Lm2/i;", "m", "lateChanges", "observationsProcessed", "invalidations", "getPendingInvalidScopes$runtime", "setPendingInvalidScopes$runtime", "(Z)V", "getPendingInvalidScopes$runtime$annotations", "pendingInvalidScopes", "Lm2/e5;", "Lm2/t3;", "s", "Lm2/t3;", "pendingPausedComposition", "Lm2/x;", "invalidationDelegate", "invalidationDelegateGroup", "Lm2/g0;", "w", "Lm2/g0;", "U", "()Lm2/g0;", "observerHolder", "Ly2/u;", "x", "Ly2/u;", "rememberManager", "Lm2/q1;", "T", "composer", "isRoot", "Ler/p;", "getComposable", "()Ler/p;", "setComposable", "composable", a.f96137b, "areChildrenComposing", "isComposing", "isDisposed", "hasInvalidations", "runtime"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class x implements l0, y4, h4, p3, v {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private int state;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private p<? super r, ? super Integer, i0> composable;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final v parent;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final c<?> applier;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final AtomicReference<Object> pendingModifications = new AtomicReference<>(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final Object lock = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final Set<u4> abandonSet;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final i5 slotStorage;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> observations;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final u0<f4> invalidatedScopes;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final u0<f4> conditionallyInvalidatedScopes;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> derivedStates;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final i changes;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final i lateChanges;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final t0<Object, Object> observationsProcessed;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private t0<Object, Object> invalidations;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean pendingInvalidScopes;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private e5 shouldPause;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private t3 pendingPausedComposition;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private x invalidationDelegate;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private int invalidationDelegateGroup;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final g0 observerHolder;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final u rememberManager;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final q1 composer;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final boolean isRoot;

    public x(v vVar, c<?> cVar) {
        this.parent = vVar;
        this.applier = cVar;
        k kVar = null;
        int i15 = 0;
        int i16 = 1;
        this.abandonSet = new u0(i15, i16, kVar).m();
        i5 i5VarM = M();
        if (vVar.e()) {
            i5VarM.f();
        }
        if (vVar.getCollectingSourceInformation()) {
            i5VarM.g();
        }
        this.slotStorage = i5VarM;
        this.observations = g.e(null, 1, null);
        this.invalidatedScopes = new u0<>(i15, i16, kVar);
        this.conditionallyInvalidatedScopes = new u0<>(i15, i16, kVar);
        this.derivedStates = g.e(null, 1, null);
        this.changes = K();
        this.lateChanges = K();
        this.observationsProcessed = g.e(null, 1, null);
        this.invalidations = g.e(null, 1, null);
        this.observerHolder = new g0(null, false, vVar, 3, null);
        this.rememberManager = new u();
        q1 q1VarL = L();
        vVar.t(q1VarL);
        this.composer = q1VarL;
        this.isRoot = vVar instanceof p4;
        this.composable = l.f122991a.d();
    }

    private final void C(Object value, boolean forgetConditionalScopes) {
        Object objE = this.observations.e(value);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof u0)) {
            f4 f4Var = (f4) objE;
            if (g.m(this.observationsProcessed, value, f4Var) || f4Var.v(value) == s1.IGNORED) {
                return;
            }
            if (!f4Var.w() || forgetConditionalScopes) {
                this.invalidatedScopes.i(f4Var);
                return;
            } else {
                this.conditionallyInvalidatedScopes.i(f4Var);
                return;
            }
        }
        u0 u0Var = (u0) objE;
        Object[] objArr = u0Var.elements;
        long[] jArr = u0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        f4 f4Var2 = (f4) objArr[(i15 << 3) + i17];
                        if (!g.m(this.observationsProcessed, value, f4Var2) && f4Var2.v(value) != s1.IGNORED) {
                            if (!f4Var2.w() || forgetConditionalScopes) {
                                this.invalidatedScopes.i(f4Var2);
                            } else {
                                this.conditionallyInvalidatedScopes.i(f4Var2);
                            }
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:197:0x00c8 A[EDGE_INSN: B:197:0x00c8->B:37:0x00c8 BREAK  A[LOOP:2: B:23:0x0077->B:34:0x00b3], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:220:0x0187 A[EDGE_INSN: B:220:0x0187->B:74:0x0187 BREAK  A[LOOP:13: B:61:0x014b->B:72:0x017f], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:34:0x00b3 A[LOOP:2: B:23:0x0077->B:34:0x00b3, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x017d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:72:0x017f A[LOOP:13: B:61:0x014b->B:72:0x017f, LOOP_END] */
    private final void D(Set<? extends Object> values, boolean forgetConditionalScopes) {
        char c15;
        long j15;
        long j16;
        long j17;
        long[] jArr;
        int i15;
        long[] jArr2;
        int i16;
        int i17;
        long j18;
        boolean zA;
        long[] jArr3;
        long[] jArr4;
        long[] jArr5;
        long j19;
        boolean zE;
        int i18;
        long j25;
        char c16;
        long j26;
        int i19;
        int i25;
        Object obj = null;
        char c17 = 7;
        long j27 = -9187201950435737472L;
        int i26 = 8;
        if (values instanceof e) {
            h1 h1VarE = ((e) values).e();
            Object[] objArr = h1VarE.elements;
            long[] jArr6 = h1VarE.metadata;
            int length = jArr6.length - 2;
            if (length >= 0) {
                int i27 = 0;
                j16 = 128;
                while (true) {
                    long j28 = jArr6[i27];
                    j17 = 255;
                    if ((((~j28) << c17) & j28 & j27) != j27) {
                        int i28 = 8 - ((~(i27 - length)) >>> 31);
                        int i29 = 0;
                        while (i29 < i28) {
                            if ((j28 & 255) < 128) {
                                c16 = c17;
                                Object obj2 = objArr[(i27 << 3) + i29];
                                j26 = j27;
                                if (obj2 instanceof f4) {
                                    ((f4) obj2).v(obj);
                                    j25 = j28;
                                    i19 = length;
                                } else {
                                    C(obj2, forgetConditionalScopes);
                                    Object objE = this.derivedStates.e(obj2);
                                    if (objE == null) {
                                        j25 = j28;
                                        i19 = length;
                                    } else if (objE instanceof u0) {
                                        u0 u0Var = (u0) objE;
                                        Object[] objArr2 = u0Var.elements;
                                        long[] jArr7 = u0Var.metadata;
                                        int length2 = jArr7.length - 2;
                                        if (length2 >= 0) {
                                            j25 = j28;
                                            int i35 = 0;
                                            while (true) {
                                                long j29 = jArr7[i35];
                                                int i36 = i26;
                                                i19 = length;
                                                if ((((~j29) << c16) & j29 & j26) != j26) {
                                                    int i37 = 8 - ((~(i35 - length2)) >>> 31);
                                                    int i38 = 0;
                                                    while (i38 < i37) {
                                                        if ((j29 & 255) < 128) {
                                                            C((o0) objArr2[(i35 << 3) + i38], forgetConditionalScopes);
                                                        }
                                                        j29 >>= i36;
                                                        i38++;
                                                        i36 = i36;
                                                    }
                                                    if (i37 != i36) {
                                                        break;
                                                    }
                                                    if (i35 != length2) {
                                                        break;
                                                    }
                                                    i35++;
                                                    length = i19;
                                                    i26 = 8;
                                                } else if (i35 != length2) {
                                                    break;
                                                    break;
                                                } else {
                                                    i35++;
                                                    length = i19;
                                                    i26 = 8;
                                                }
                                            }
                                        } else {
                                            j25 = j28;
                                            i19 = length;
                                        }
                                    } else {
                                        j25 = j28;
                                        i19 = length;
                                        C((o0) objE, forgetConditionalScopes);
                                    }
                                    i0 i0Var = i0.f148189a;
                                }
                                i25 = 8;
                            } else {
                                j25 = j28;
                                c16 = c17;
                                j26 = j27;
                                i19 = length;
                                i25 = i26;
                            }
                            i29++;
                            length = i19;
                            i26 = i25;
                            c17 = c16;
                            j27 = j26;
                            j28 = j25 >> i25;
                            obj = null;
                        }
                        c15 = c17;
                        j15 = j27;
                        int i39 = length;
                        if (i28 != i26) {
                            break;
                        } else {
                            length = i39;
                        }
                    } else {
                        c15 = c17;
                        j15 = j27;
                    }
                    if (i27 == length) {
                        break;
                    }
                    i27++;
                    c17 = c15;
                    j27 = j15;
                    obj = null;
                    i26 = 8;
                }
            } else {
                c15 = 7;
                j15 = -9187201950435737472L;
                j16 = 128;
                j17 = 255;
            }
        } else {
            c15 = 7;
            j15 = -9187201950435737472L;
            j16 = 128;
            j17 = 255;
            for (Object obj3 : values) {
                if (obj3 instanceof f4) {
                    ((f4) obj3).v(null);
                } else {
                    C(obj3, forgetConditionalScopes);
                    Object objE2 = this.derivedStates.e(obj3);
                    if (objE2 != null) {
                        if (objE2 instanceof u0) {
                            u0 u0Var2 = (u0) objE2;
                            Object[] objArr3 = u0Var2.elements;
                            long[] jArr8 = u0Var2.metadata;
                            int length3 = jArr8.length - 2;
                            if (length3 >= 0) {
                                int i45 = 0;
                                while (true) {
                                    long j35 = jArr8[i45];
                                    if ((((~j35) << 7) & j35 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i45 != length3) {
                                            break;
                                            break;
                                        }
                                        i45++;
                                    } else {
                                        int i46 = 8 - ((~(i45 - length3)) >>> 31);
                                        for (int i47 = 0; i47 < i46; i47++) {
                                            if ((j35 & 255) < 128) {
                                                C((o0) objArr3[(i45 << 3) + i47], forgetConditionalScopes);
                                            }
                                            j35 >>= 8;
                                        }
                                        if (i46 != 8) {
                                            break;
                                        } else if (i45 != length3) {
                                            break;
                                        } else {
                                            i45++;
                                        }
                                    }
                                }
                            }
                        } else {
                            C((o0) objE2, forgetConditionalScopes);
                        }
                    }
                    i0 i0Var2 = i0.f148189a;
                }
            }
        }
        u0<f4> u0Var3 = this.conditionallyInvalidatedScopes;
        u0<f4> u0Var4 = this.invalidatedScopes;
        if (forgetConditionalScopes && u0Var3.f()) {
            t0<Object, Object> t0Var = this.observations;
            long[] jArr9 = t0Var.metadata;
            int length4 = jArr9.length - 2;
            if (length4 >= 0) {
                int i48 = 0;
                while (true) {
                    long j36 = jArr9[i48];
                    if ((((~j36) << c15) & j36 & j15) != j15) {
                        int i49 = 8 - ((~(i48 - length4)) >>> 31);
                        int i55 = 0;
                        while (i55 < i49) {
                            if ((j36 & j17) < j16) {
                                int i56 = (i48 << 3) + i55;
                                Object obj4 = t0Var.keys[i56];
                                Object obj5 = t0Var.values[i56];
                                if (obj5 instanceof u0) {
                                    u0 u0Var5 = (u0) obj5;
                                    Object[] objArr4 = u0Var5.elements;
                                    long[] jArr10 = u0Var5.metadata;
                                    int length5 = jArr10.length - 2;
                                    if (length5 >= 0) {
                                        jArr5 = jArr9;
                                        int i57 = length5;
                                        int i58 = 0;
                                        while (true) {
                                            long j37 = jArr10[i58];
                                            j19 = j36;
                                            if ((((~j37) << c15) & j37 & j15) != j15) {
                                                int i59 = 8 - ((~(i58 - i57)) >>> 31);
                                                long j38 = j37;
                                                for (int i65 = 0; i65 < i59; i65 = i18 + 1) {
                                                    if ((j38 & j17) < j16) {
                                                        int i66 = (i58 << 3) + i65;
                                                        i18 = i65;
                                                        f4 f4Var = (f4) objArr4[i66];
                                                        if (u0Var3.a(f4Var) || u0Var4.a(f4Var)) {
                                                            u0Var5.B(i66);
                                                        }
                                                    } else {
                                                        i18 = i65;
                                                    }
                                                    j38 >>= 8;
                                                }
                                                if (i59 != 8) {
                                                    break;
                                                }
                                            }
                                            if (i58 == i57) {
                                                break;
                                            }
                                            i58++;
                                            i57 = i57;
                                            j36 = j19;
                                        }
                                    } else {
                                        jArr5 = jArr9;
                                        j19 = j36;
                                    }
                                    zE = u0Var5.e();
                                } else {
                                    jArr5 = jArr9;
                                    j19 = j36;
                                    f4 f4Var2 = (f4) obj5;
                                    zE = u0Var3.a(f4Var2) || u0Var4.a(f4Var2);
                                }
                                if (zE) {
                                    t0Var.v(i56);
                                }
                            } else {
                                jArr5 = jArr9;
                                j19 = j36;
                            }
                            j36 = j19 >> 8;
                            i55++;
                            jArr9 = jArr5;
                        }
                        jArr4 = jArr9;
                        if (i49 != 8) {
                            break;
                        }
                    } else {
                        jArr4 = jArr9;
                    }
                    if (i48 == length4) {
                        break;
                    }
                    i48++;
                    jArr9 = jArr4;
                }
            }
            u0Var3.n();
            F();
            return;
        }
        if (u0Var4.f()) {
            t0<Object, Object> t0Var2 = this.observations;
            long[] jArr11 = t0Var2.metadata;
            int length6 = jArr11.length - 2;
            if (length6 >= 0) {
                int i67 = 0;
                while (true) {
                    long j39 = jArr11[i67];
                    if ((((~j39) << c15) & j39 & j15) != j15) {
                        int i68 = 8 - ((~(i67 - length6)) >>> 31);
                        int i69 = 0;
                        while (i69 < i68) {
                            if ((j39 & j17) < j16) {
                                int i75 = (i67 << 3) + i69;
                                Object obj6 = t0Var2.keys[i75];
                                Object obj7 = t0Var2.values[i75];
                                if (obj7 instanceof u0) {
                                    u0 u0Var6 = (u0) obj7;
                                    Object[] objArr5 = u0Var6.elements;
                                    long[] jArr12 = u0Var6.metadata;
                                    int length7 = jArr12.length - 2;
                                    if (length7 >= 0) {
                                        j18 = j39;
                                        int i76 = 0;
                                        while (true) {
                                            long j45 = jArr12[i76];
                                            i16 = length6;
                                            i17 = i67;
                                            if ((((~j45) << c15) & j45 & j15) != j15) {
                                                int i77 = 8 - ((~(i76 - length7)) >>> 31);
                                                int i78 = 0;
                                                while (i78 < i77) {
                                                    if ((j45 & j17) < j16) {
                                                        int i79 = (i76 << 3) + i78;
                                                        jArr3 = jArr11;
                                                        if (u0Var4.a((f4) objArr5[i79])) {
                                                            u0Var6.B(i79);
                                                        }
                                                    } else {
                                                        jArr3 = jArr11;
                                                    }
                                                    j45 >>= 8;
                                                    i78++;
                                                    jArr11 = jArr3;
                                                }
                                                jArr2 = jArr11;
                                                if (i77 != 8) {
                                                    break;
                                                }
                                            } else {
                                                jArr2 = jArr11;
                                            }
                                            if (i76 == length7) {
                                                break;
                                            }
                                            i76++;
                                            length6 = i16;
                                            i67 = i17;
                                            jArr11 = jArr2;
                                        }
                                    } else {
                                        jArr2 = jArr11;
                                        i16 = length6;
                                        i17 = i67;
                                        j18 = j39;
                                    }
                                    zA = u0Var6.e();
                                } else {
                                    jArr2 = jArr11;
                                    i16 = length6;
                                    i17 = i67;
                                    j18 = j39;
                                    zA = u0Var4.a((f4) obj7);
                                }
                                if (zA) {
                                    t0Var2.v(i75);
                                }
                            } else {
                                jArr2 = jArr11;
                                i16 = length6;
                                i17 = i67;
                                j18 = j39;
                            }
                            j39 = j18 >> 8;
                            i69++;
                            length6 = i16;
                            i67 = i17;
                            jArr11 = jArr2;
                        }
                        jArr = jArr11;
                        int i85 = length6;
                        int i86 = i67;
                        if (i68 != 8) {
                            break;
                        }
                        length6 = i85;
                        i15 = i86;
                    } else {
                        jArr = jArr11;
                        i15 = i67;
                    }
                    if (i15 == length6) {
                        break;
                    }
                    i67 = i15 + 1;
                    jArr11 = jArr;
                }
            }
            F();
            u0Var4.n();
        }
    }

    private final void E(i changes) {
        c<?> cVarD;
        u uVarE;
        long[] jArr;
        long[] jArr2;
        long j15;
        char c15;
        long j16;
        int i15;
        boolean zE;
        long[] jArr3;
        this.rememberManager.r(this.abandonSet, this.composer.g0());
        try {
            if (changes.c()) {
                try {
                    if (this.lateChanges.c() && this.pendingPausedComposition == null) {
                        this.rememberManager.j();
                    }
                } finally {
                    this.rememberManager.i();
                }
            } else {
                t3 t3Var = this.pendingPausedComposition;
                if (t3Var == null || (cVarD = t3Var.d()) == null) {
                    cVarD = this.applier;
                }
                t3 t3Var2 = this.pendingPausedComposition;
                String str = t.c(cVarD, t3Var2 != null ? t3Var2.d() : null) ? "Compose:recordChanges" : "Compose:applyChanges";
                b0 b0Var = b0.f223360a;
                Object objA = b0Var.a(str);
                try {
                    t3 t3Var3 = this.pendingPausedComposition;
                    if (t3Var3 == null || (uVarE = t3Var3.getRememberManager()) == null) {
                        uVarE = this.rememberManager;
                    }
                    cVarD.i();
                    changes.b(this.slotStorage, cVarD, uVarE, this.composer.g0());
                    cVarD.e();
                    i0 i0Var = i0.f148189a;
                    b0Var.b(objA);
                    this.rememberManager.m();
                    this.rememberManager.n();
                    if (this.pendingInvalidScopes) {
                        Object objA2 = b0Var.a("Compose:unobserve");
                        int i16 = 0;
                        try {
                            this.pendingInvalidScopes = false;
                            t0<Object, Object> t0Var = this.observations;
                            long[] jArr4 = t0Var.metadata;
                            int length = jArr4.length - 2;
                            if (length >= 0) {
                                int i17 = 0;
                                while (true) {
                                    long j17 = jArr4[i17];
                                    char c16 = 7;
                                    long j18 = -9187201950435737472L;
                                    if ((((~j17) << 7) & j17 & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i18 = 8;
                                        int i19 = 8 - ((~(i17 - length)) >>> 31);
                                        int i25 = i16;
                                        while (i25 < i19) {
                                            if ((j17 & 255) < 128) {
                                                int i26 = (i17 << 3) + i25;
                                                c15 = c16;
                                                Object obj = t0Var.keys[i26];
                                                Object obj2 = t0Var.values[i26];
                                                j16 = j18;
                                                if (obj2 instanceof u0) {
                                                    u0 u0Var = (u0) obj2;
                                                    Object[] objArr = u0Var.elements;
                                                    long[] jArr5 = u0Var.metadata;
                                                    int length2 = jArr5.length - 2;
                                                    if (length2 >= 0) {
                                                        j15 = j17;
                                                        int i27 = i18;
                                                        int i28 = 0;
                                                        while (true) {
                                                            long j19 = jArr5[i28];
                                                            Object[] objArr2 = objArr;
                                                            long[] jArr6 = jArr5;
                                                            if ((((~j19) << c15) & j19 & j16) != j16) {
                                                                int i29 = 8 - ((~(i28 - length2)) >>> 31);
                                                                int i35 = 0;
                                                                while (i35 < i29) {
                                                                    if ((j19 & 255) < 128) {
                                                                        jArr3 = jArr4;
                                                                        int i36 = (i28 << 3) + i35;
                                                                        if (!((f4) objArr2[i36]).u()) {
                                                                            u0Var.B(i36);
                                                                        }
                                                                    } else {
                                                                        jArr3 = jArr4;
                                                                    }
                                                                    j19 >>= i27;
                                                                    i35++;
                                                                    jArr4 = jArr3;
                                                                }
                                                                jArr2 = jArr4;
                                                                if (i29 != i27) {
                                                                    break;
                                                                }
                                                            } else {
                                                                jArr2 = jArr4;
                                                            }
                                                            if (i28 == length2) {
                                                                break;
                                                            }
                                                            i28++;
                                                            objArr = objArr2;
                                                            jArr5 = jArr6;
                                                            jArr4 = jArr2;
                                                            i27 = 8;
                                                        }
                                                    } else {
                                                        jArr2 = jArr4;
                                                        j15 = j17;
                                                    }
                                                    zE = u0Var.e();
                                                } else {
                                                    jArr2 = jArr4;
                                                    j15 = j17;
                                                    zE = !((f4) obj2).u();
                                                }
                                                if (zE) {
                                                    t0Var.v(i26);
                                                }
                                                i15 = 8;
                                            } else {
                                                jArr2 = jArr4;
                                                j15 = j17;
                                                c15 = c16;
                                                j16 = j18;
                                                i15 = i18;
                                            }
                                            j17 = j15 >> i15;
                                            i25++;
                                            i18 = i15;
                                            c16 = c15;
                                            j18 = j16;
                                            jArr4 = jArr2;
                                        }
                                        jArr = jArr4;
                                        if (i19 != i18) {
                                            break;
                                        }
                                    } else {
                                        jArr = jArr4;
                                    }
                                    if (i17 == length) {
                                        break;
                                    }
                                    i17++;
                                    jArr4 = jArr;
                                    i16 = 0;
                                }
                            }
                            F();
                            i0 i0Var2 = i0.f148189a;
                            b0.f223360a.b(objA2);
                        } catch (Throwable th4) {
                            b0.f223360a.b(objA2);
                            throw th4;
                        }
                    }
                    try {
                        if (this.lateChanges.c() && this.pendingPausedComposition == null) {
                            this.rememberManager.j();
                        }
                    } finally {
                        this.rememberManager.i();
                    }
                } catch (Throwable th5) {
                    b0.f223360a.b(objA);
                    throw th5;
                }
            }
        } catch (Throwable th6) {
            try {
                if (this.lateChanges.c() && this.pendingPausedComposition == null) {
                    this.rememberManager.j();
                }
                throw th6;
            } finally {
                this.rememberManager.i();
            }
        }
    }

    private final void F() {
        char c15;
        long j15;
        long j16;
        long j17;
        long[] jArr;
        long[] jArr2;
        long j18;
        int i15;
        char c16;
        long j19;
        long j25;
        int i16;
        boolean zE;
        long[] jArr3;
        int i17;
        int i18;
        t0<Object, Object> t0Var = this.derivedStates;
        long[] jArr4 = t0Var.metadata;
        int length = jArr4.length - 2;
        char c17 = 7;
        long j26 = -9187201950435737472L;
        int i19 = 8;
        if (length >= 0) {
            int i25 = 0;
            long j27 = 128;
            while (true) {
                long j28 = jArr4[i25];
                j16 = 255;
                if ((((~j28) << c17) & j28 & j26) != j26) {
                    int i26 = 8 - ((~(i25 - length)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j28 & 255) < j27) {
                            c16 = c17;
                            int i28 = (i25 << 3) + i27;
                            j19 = j26;
                            Object obj = t0Var.keys[i28];
                            Object obj2 = t0Var.values[i28];
                            if (obj2 instanceof u0) {
                                u0 u0Var = (u0) obj2;
                                Object[] objArr = u0Var.elements;
                                long[] jArr5 = u0Var.metadata;
                                int length2 = jArr5.length - 2;
                                if (length2 >= 0) {
                                    j25 = j27;
                                    int i29 = 0;
                                    int i35 = i19;
                                    while (true) {
                                        int i36 = length2;
                                        long j29 = jArr5[i29];
                                        j18 = j28;
                                        if ((((~j29) << c16) & j29 & j19) != j19) {
                                            int i37 = 8 - ((~(i29 - i36)) >>> 31);
                                            int i38 = 0;
                                            while (i38 < i37) {
                                                if ((j29 & 255) < j25) {
                                                    jArr3 = jArr4;
                                                    int i39 = (i29 << 3) + i38;
                                                    i17 = i38;
                                                    i18 = i27;
                                                    if (!g.f(this.observations, (o0) objArr[i39])) {
                                                        u0Var.B(i39);
                                                    }
                                                } else {
                                                    jArr3 = jArr4;
                                                    i17 = i38;
                                                    i18 = i27;
                                                }
                                                j29 >>= i35;
                                                i38 = i17 + 1;
                                                i27 = i18;
                                                jArr4 = jArr3;
                                            }
                                            jArr2 = jArr4;
                                            i15 = i27;
                                            if (i37 != i35) {
                                                break;
                                            }
                                        } else {
                                            jArr2 = jArr4;
                                            i15 = i27;
                                        }
                                        length2 = i36;
                                        if (i29 == length2) {
                                            break;
                                        }
                                        i29++;
                                        j28 = j18;
                                        i27 = i15;
                                        jArr4 = jArr2;
                                        i35 = 8;
                                    }
                                } else {
                                    jArr2 = jArr4;
                                    j18 = j28;
                                    i15 = i27;
                                    j25 = j27;
                                }
                                zE = u0Var.e();
                            } else {
                                jArr2 = jArr4;
                                j18 = j28;
                                i15 = i27;
                                j25 = j27;
                                zE = !g.f(this.observations, (o0) obj2);
                            }
                            if (zE) {
                                t0Var.v(i28);
                            }
                            i16 = 8;
                        } else {
                            jArr2 = jArr4;
                            j18 = j28;
                            i15 = i27;
                            c16 = c17;
                            j19 = j26;
                            j25 = j27;
                            i16 = i19;
                        }
                        j28 = j18 >> i16;
                        i27 = i15 + 1;
                        i19 = i16;
                        c17 = c16;
                        j26 = j19;
                        j27 = j25;
                        jArr4 = jArr2;
                    }
                    jArr = jArr4;
                    c15 = c17;
                    j15 = j26;
                    j17 = j27;
                    if (i26 != i19) {
                        break;
                    }
                } else {
                    jArr = jArr4;
                    c15 = c17;
                    j15 = j26;
                    j17 = j27;
                }
                if (i25 == length) {
                    break;
                }
                i25++;
                c17 = c15;
                j26 = j15;
                j27 = j17;
                jArr4 = jArr;
                i19 = 8;
            }
        } else {
            c15 = 7;
            j15 = -9187201950435737472L;
            j16 = 255;
            j17 = 128;
        }
        if (!this.conditionallyInvalidatedScopes.f()) {
            return;
        }
        u0<f4> u0Var2 = this.conditionallyInvalidatedScopes;
        Object[] objArr2 = u0Var2.elements;
        long[] jArr6 = u0Var2.metadata;
        int length3 = jArr6.length - 2;
        if (length3 < 0) {
            return;
        }
        int i45 = 0;
        while (true) {
            long j35 = jArr6[i45];
            if ((((~j35) << c15) & j35 & j15) != j15) {
                int i46 = 8 - ((~(i45 - length3)) >>> 31);
                for (int i47 = 0; i47 < i46; i47++) {
                    if ((j35 & j16) < j17) {
                        int i48 = (i45 << 3) + i47;
                        if (!((f4) objArr2[i48]).w()) {
                            u0Var2.B(i48);
                        }
                    }
                    j35 >>= 8;
                }
                if (i46 != 8) {
                    return;
                }
            }
            if (i45 == length3) {
                return;
            } else {
                i45++;
            }
        }
    }

    private final boolean G() {
        boolean z15;
        synchronized (this.lock) {
            z15 = true;
            if (this.state != 1) {
                z15 = false;
            }
            if (z15) {
                this.state = 0;
            }
        }
        return z15;
    }

    private final void H(p<? super r, ? super Integer, i0> content) {
        this.composable = content;
        this.parent.a(this, content);
    }

    private final s3 I(boolean reusable, p<? super r, ? super Integer, i0> content) {
        if (!(this.pendingPausedComposition == null)) {
            w3.b("A pausable composition is in progress");
        }
        t3 t3Var = new t3(this, this.parent, this.composer, this.abandonSet, content, reusable, this.applier, this.lock);
        this.pendingPausedComposition = t3Var;
        return t3Var;
    }

    private final void J(p<? super r, ? super Integer, i0> content) {
        this.composer.n0();
        H(content);
        this.composer.c0();
    }

    private final i K() {
        return q.isLinkBufferComposerEnabled ? new s2.a() : new q2.a();
    }

    private final q1 L() {
        if (!q.isLinkBufferComposerEnabled) {
            return new e1(this.applier, this.parent, n.o(this.slotStorage), this.abandonSet, this.changes, this.lateChanges, this.observerHolder, this);
        }
        return new f2(this.applier, this.parent, this.abandonSet, a0.f(this.slotStorage), this.changes, this.lateChanges, this.observerHolder, this);
    }

    private final i5 M() {
        if (!q.isLinkBufferComposerEnabled) {
            return new l();
        }
        return new o(0, null, false, false, 15, null);
    }

    private final void N() {
        Object andSet = this.pendingModifications.getAndSet(y.f123255a);
        if (andSet != null) {
            if (t.c(andSet, y.f123255a)) {
                t.c("pending composition has not been applied");
                throw new oq.g();
            }
            if (andSet instanceof Set) {
                D((Set) andSet, true);
                return;
            }
            if (!(andSet instanceof Object[])) {
                t.c("corrupt pendingModifications drain: " + this.pendingModifications);
                throw new oq.g();
            }
            for (Set<? extends Object> set : (Set[]) andSet) {
                D(set, true);
            }
        }
    }

    private final void O() {
        Object andSet = this.pendingModifications.getAndSet(null);
        if (t.c(andSet, y.f123255a)) {
            return;
        }
        if (andSet instanceof Set) {
            D((Set) andSet, false);
            return;
        }
        if (andSet instanceof Object[]) {
            for (Set<? extends Object> set : (Set[]) andSet) {
                D(set, false);
            }
            return;
        }
        if (andSet != null) {
            t.c("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new oq.g();
        }
        if (this.pendingPausedComposition == null) {
            t.b("calling recordModificationsOf and applyChanges concurrently is not supported");
        }
    }

    private final void P() {
        Object andSet = this.pendingModifications.getAndSet(e1.e());
        if (t.c(andSet, y.f123255a) || andSet == null) {
            return;
        }
        if (andSet instanceof Set) {
            D((Set) andSet, false);
            return;
        }
        if (!(andSet instanceof Object[])) {
            t.c("corrupt pendingModifications drain: " + this.pendingModifications);
            throw new oq.g();
        }
        for (Set<? extends Object> set : (Set[]) andSet) {
            D(set, false);
        }
    }

    private final void Q() {
        String str;
        int i15 = this.state;
        if (!(i15 == 0)) {
            if (i15 == 1) {
                str = "The composition should be activated before setting content.";
            } else if (i15 != 2) {
                str = i15 != 3 ? "" : "The composition is disposed";
            } else {
                str = "A previous pausable composition for this composition was cancelled. This composition must be disposed.";
            }
            w3.b(str);
        }
        if (this.pendingPausedComposition == null) {
            return;
        }
        w3.b("A pausable composition is in progress");
    }

    private final boolean S() {
        return this.composer.d0();
    }

    /* JADX WARN: Code duplicated, block: B:44:0x009c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x009e A[Catch: all -> 0x001e, LOOP:0: B:31:0x005d->B:45:0x009e, LOOP_END, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00a6 A[Catch: all -> 0x001e, EDGE_INSN: B:49:0x00a6->B:50:0x00ab BREAK  A[LOOP:0: B:31:0x005d->B:45:0x009e], TRY_LEAVE, TryCatch #0 {all -> 0x001e, blocks: (B:4:0x000b, B:6:0x0010, B:14:0x0023, B:16:0x0029, B:20:0x002f, B:21:0x0038, B:23:0x003c, B:24:0x0045, B:26:0x004d, B:28:0x0051, B:31:0x005d, B:33:0x006d, B:35:0x0079, B:37:0x0083, B:41:0x0092, B:45:0x009e, B:46:0x00a1, B:49:0x00a6), top: B:62:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:65:0x00a6 A[SYNTHETIC] */
    private final s1 W(f4 scope, b anchor, Object instance) {
        synchronized (this.lock) {
            try {
                x xVar = this.invalidationDelegate;
                x xVar2 = null;
                if (xVar != null) {
                    if (!this.slotStorage.n(this.invalidationDelegateGroup, anchor)) {
                        xVar = null;
                    }
                    xVar2 = xVar;
                }
                if (xVar2 == null) {
                    if (d0(scope, instance)) {
                        return s1.IMMINENT;
                    }
                    if (instance != null && (instance instanceof o0)) {
                        Object objE = this.invalidations.e(scope);
                        if (objE != null) {
                            if (!(objE instanceof u0)) {
                                if (objE != c5.f122830a) {
                                    g.a(this.invalidations, scope, instance);
                                    break;
                                }
                            } else {
                                u0 u0Var = (u0) objE;
                                Object[] objArr = u0Var.elements;
                                long[] jArr = u0Var.metadata;
                                int length = jArr.length - 2;
                                if (length < 0) {
                                    g.a(this.invalidations, scope, instance);
                                    break;
                                }
                                int i15 = 0;
                                loop0: while (true) {
                                    long j15 = jArr[i15];
                                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) == -9187201950435737472L) {
                                        if (i15 == length) {
                                            g.a(this.invalidations, scope, instance);
                                            break;
                                        }
                                        i15++;
                                    } else {
                                        int i16 = 8;
                                        int i17 = 8 - ((~(i15 - length)) >>> 31);
                                        int i18 = 0;
                                        while (i18 < i17) {
                                            if ((j15 & 255) < 128 && objArr[(i15 << 3) + i18] == c5.f122830a) {
                                                break loop0;
                                            }
                                            j15 >>= i16;
                                            i18++;
                                            i16 = i16;
                                        }
                                        if (i17 == i16) {
                                            if (i15 == length) {
                                                i15++;
                                            }
                                        }
                                        g.a(this.invalidations, scope, instance);
                                        break;
                                    }
                                }
                            }
                        } else {
                            g.a(this.invalidations, scope, instance);
                            break;
                        }
                    } else {
                        g.o(this.invalidations, scope, c5.f122830a);
                    }
                }
                if (xVar2 != null) {
                    return xVar2.W(scope, anchor, instance);
                }
                this.parent.o(this);
                return s() ? s1.DEFERRED : s1.SCHEDULED;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    private final void X(Object value) {
        Object objE = this.observations.e(value);
        if (objE == null) {
            return;
        }
        if (!(objE instanceof u0)) {
            f4 f4Var = (f4) objE;
            if (f4Var.v(value) == s1.IMMINENT) {
                g.a(this.observationsProcessed, value, f4Var);
                return;
            }
            return;
        }
        u0 u0Var = (u0) objE;
        Object[] objArr = u0Var.elements;
        long[] jArr = u0Var.metadata;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i15 = 0;
        while (true) {
            long j15 = jArr[i15];
            if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i16 = 8 - ((~(i15 - length)) >>> 31);
                for (int i17 = 0; i17 < i16; i17++) {
                    if ((255 & j15) < 128) {
                        f4 f4Var2 = (f4) objArr[(i15 << 3) + i17];
                        if (f4Var2.v(value) == s1.IMMINENT) {
                            g.a(this.observationsProcessed, value, f4Var2);
                        }
                    }
                    j15 >>= 8;
                }
                if (i16 != 8) {
                    return;
                }
            }
            if (i15 == length) {
                return;
            } else {
                i15++;
            }
        }
    }

    private final e3.o Y() {
        this.observerHolder.a();
        return null;
    }

    private final t0<Object, Object> c0() {
        t0<Object, Object> t0Var = this.invalidations;
        this.invalidations = g.e(null, 1, null);
        return t0Var;
    }

    private final boolean d0(f4 scope, Object instance) {
        return s() && this.composer.o0(scope, instance);
    }

    @Override // p076m2.l0
    public void A() {
        synchronized (this.lock) {
            try {
                this.composer.Y();
                if (!this.abandonSet.isEmpty()) {
                    u uVar = this.rememberManager;
                    try {
                        uVar.r(this.abandonSet, this.composer.g0());
                        uVar.j();
                        uVar.i();
                    } catch (Throwable th4) {
                        uVar.i();
                        throw th4;
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th5) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        u uVar2 = this.rememberManager;
                        try {
                            uVar2.r(this.abandonSet, this.composer.g0());
                            uVar2.j();
                        } finally {
                            uVar2.i();
                        }
                    }
                    throw th5;
                } catch (Throwable th6) {
                    z();
                    throw th6;
                }
            }
        }
    }

    @Override // p076m2.l0
    public void B() {
        this.slotStorage.q();
    }

    public final List<r<f4, Object>> R(b anchor) {
        long[] jArr;
        long[] jArr2;
        int i15;
        int i16;
        long j15;
        char c15;
        long j16;
        int i17;
        boolean zE;
        Object[] objArr;
        int i18;
        long j17;
        Object[] objArr2;
        if (g.i(this.invalidations) <= 0) {
            return pq.v.n();
        }
        ArrayList arrayList = new ArrayList();
        i5 i5Var = this.slotStorage;
        t0<Object, Object> t0Var = this.invalidations;
        long[] jArr3 = t0Var.metadata;
        int length = jArr3.length - 2;
        if (length >= 0) {
            int i19 = 0;
            while (true) {
                long j18 = jArr3[i19];
                char c16 = 7;
                long j19 = -9187201950435737472L;
                if ((((~j18) << 7) & j18 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i25 = 8;
                    int i26 = 8 - ((~(i19 - length)) >>> 31);
                    int i27 = 0;
                    while (i27 < i26) {
                        if ((j18 & 255) < 128) {
                            c15 = c16;
                            int i28 = (i19 << 3) + i27;
                            j16 = j19;
                            Object obj = t0Var.keys[i28];
                            Object obj2 = t0Var.values[i28];
                            int i29 = i25;
                            if (obj2 instanceof u0) {
                                u0 u0Var = (u0) obj2;
                                Object[] objArr3 = u0Var.elements;
                                long[] jArr4 = u0Var.metadata;
                                jArr2 = jArr3;
                                int length2 = jArr4.length - 2;
                                if (length2 >= 0) {
                                    j15 = j18;
                                    int i35 = 0;
                                    while (true) {
                                        long j25 = jArr4[i35];
                                        i15 = length;
                                        i16 = i27;
                                        if ((((~j25) << c15) & j25 & j16) != j16) {
                                            int i36 = 8 - ((~(i35 - length2)) >>> 31);
                                            int i37 = 0;
                                            while (i37 < i36) {
                                                if ((j25 & 255) < 128) {
                                                    i18 = i37;
                                                    int i38 = (i35 << 3) + i18;
                                                    j17 = j25;
                                                    Object obj3 = objArr3[i38];
                                                    f4 f4Var = (f4) obj;
                                                    objArr2 = objArr3;
                                                    b bVarH = f4Var.getAnchor();
                                                    if (bVarH != null && i5Var.o(anchor, bVarH)) {
                                                        arrayList.add(y.a(f4Var, obj3));
                                                        u0Var.B(i38);
                                                    }
                                                } else {
                                                    i18 = i37;
                                                    j17 = j25;
                                                    objArr2 = objArr3;
                                                }
                                                j25 = j17 >> i29;
                                                i37 = i18 + 1;
                                                objArr3 = objArr2;
                                            }
                                            objArr = objArr3;
                                            if (i36 != i29) {
                                                break;
                                            }
                                        } else {
                                            objArr = objArr3;
                                        }
                                        if (i35 == length2) {
                                            break;
                                        }
                                        i35++;
                                        length = i15;
                                        i27 = i16;
                                        objArr3 = objArr;
                                        i29 = 8;
                                    }
                                } else {
                                    i15 = length;
                                    i16 = i27;
                                    j15 = j18;
                                }
                                zE = u0Var.e();
                            } else {
                                jArr2 = jArr3;
                                i15 = length;
                                i16 = i27;
                                j15 = j18;
                                f4 f4Var2 = (f4) obj;
                                b bVarH2 = f4Var2.getAnchor();
                                if (bVarH2 == null || !i5Var.o(anchor, bVarH2)) {
                                    zE = false;
                                } else {
                                    arrayList.add(y.a(f4Var2, obj2));
                                    zE = true;
                                }
                            }
                            if (zE) {
                                t0Var.v(i28);
                            }
                            i17 = 8;
                        } else {
                            jArr2 = jArr3;
                            i15 = length;
                            i16 = i27;
                            j15 = j18;
                            c15 = c16;
                            j16 = j19;
                            i17 = i25;
                        }
                        j18 = j15 >> i17;
                        i25 = i17;
                        c16 = c15;
                        j19 = j16;
                        jArr3 = jArr2;
                        length = i15;
                        i27 = i16 + 1;
                    }
                    jArr = jArr3;
                    int i39 = length;
                    if (i26 != i25) {
                        break;
                    }
                    length = i39;
                } else {
                    jArr = jArr3;
                }
                if (i19 == length) {
                    break;
                }
                i19++;
                jArr3 = jArr;
            }
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: T, reason: from getter */
    public final q1 getComposer() {
        return this.composer;
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final g0 getObserverHolder() {
        return this.observerHolder;
    }

    /* JADX INFO: renamed from: V, reason: from getter */
    public final i5 getSlotStorage() {
        return this.slotStorage;
    }

    public final void Z(h1<v4> ignoreSet) {
        this.pendingPausedComposition = null;
        if (ignoreSet != null) {
            this.rememberManager.q(ignoreSet);
            this.state = 2;
        }
    }

    @Override // p076m2.l0, p076m2.h4
    public void a(Object value) {
        f4 f4VarE0;
        int i15;
        int i16;
        if (S() || (f4VarE0 = this.composer.e0()) == null) {
            return;
        }
        int i17 = 1;
        f4VarE0.O(true);
        boolean z15 = f4VarE0.z(value);
        Y();
        if (z15) {
            return;
        }
        if (value instanceof v0) {
            ((v0) value).z(h.a(1));
        }
        g.a(this.observations, value, f4VarE0);
        if (value instanceof o0) {
            o0<?> o0Var = (o0) value;
            o0.a<?> aVarX = o0Var.x();
            g.n(this.derivedStates, value);
            y0<c3.u0> y0VarB = aVarX.b();
            Object[] objArr = y0VarB.keys;
            long[] jArr = y0VarB.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i18 = 0;
                while (true) {
                    long j15 = jArr[i18];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i19 = 8;
                        int i25 = 8 - ((~(i18 - length)) >>> 31);
                        int i26 = 0;
                        while (i26 < i25) {
                            if ((j15 & 255) < 128) {
                                i16 = i17;
                                c3.u0 u0Var = (c3.u0) objArr[(i18 << 3) + i26];
                                if (u0Var instanceof v0) {
                                    ((v0) u0Var).z(h.a(i16));
                                }
                                g.a(this.derivedStates, u0Var, value);
                            } else {
                                i16 = i17;
                                i19 = i19;
                            }
                            j15 >>= i19;
                            i26++;
                            i17 = i16;
                            i19 = i19;
                        }
                        i15 = i17;
                        if (i25 != i19) {
                            break;
                        }
                    } else {
                        i15 = i17;
                    }
                    if (i18 == length) {
                        break;
                    }
                    i18++;
                    i17 = i15;
                }
            }
            f4VarE0.y(o0Var, aVarX.a());
        }
    }

    public final void a0(o0<?> state) {
        if (g.f(this.observations, state)) {
            return;
        }
        g.n(this.derivedStates, state);
    }

    @Override // p076m2.l0
    public void b() {
        synchronized (this.lock) {
            try {
                if (this.lateChanges.d()) {
                    E(this.lateChanges);
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        u uVar = this.rememberManager;
                        try {
                            uVar.r(this.abandonSet, this.composer.g0());
                            uVar.j();
                        } finally {
                            uVar.i();
                        }
                    }
                    throw th4;
                } catch (Throwable th5) {
                    z();
                    throw th5;
                }
            }
        }
    }

    public final void b0(Object instance, f4 scope) {
        g.m(this.observations, instance, scope);
    }

    @Override // p076m2.u
    public boolean c() {
        return this.state == 3;
    }

    @Override // p076m2.l0
    public void d(p<? super r, ? super Integer, i0> content) {
        try {
            synchronized (this.lock) {
                N();
                t0<Object, Object> t0VarC0 = c0();
                try {
                    this.composer.Z(t0VarC0, content, this.shouldPause);
                    i0 i0Var = i0.f148189a;
                } catch (Throwable th4) {
                    this.invalidations = t0VarC0;
                    throw th4;
                }
            }
        } catch (Throwable th5) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    u uVar = this.rememberManager;
                    try {
                        uVar.r(this.abandonSet, this.composer.g0());
                        uVar.j();
                    } finally {
                        uVar.i();
                    }
                }
                throw th5;
            } catch (Throwable th6) {
                z();
                throw th6;
            }
        }
    }

    @Override // p076m2.y4
    public void deactivate() {
        synchronized (this.lock) {
            try {
                if (!(this.pendingPausedComposition == null)) {
                    w3.b("Deactivate is not supported while pausable composition is in progress");
                }
                boolean zIsEmpty = this.slotStorage.isEmpty();
                if (!zIsEmpty || !this.abandonSet.isEmpty()) {
                    b0 b0Var = b0.f223360a;
                    Object objA = b0Var.a("Compose:deactivate");
                    try {
                        u uVar = this.rememberManager;
                        try {
                            uVar.r(this.abandonSet, this.composer.g0());
                            if (!zIsEmpty) {
                                this.applier.i();
                                this.slotStorage.h(this.rememberManager);
                                this.applier.e();
                                uVar.m();
                            }
                            uVar.j();
                            uVar.i();
                            i0 i0Var = i0.f148189a;
                            b0Var.b(objA);
                        } catch (Throwable th4) {
                            uVar.i();
                            throw th4;
                        }
                    } catch (Throwable th5) {
                        b0.f223360a.b(objA);
                        throw th5;
                    }
                }
                g.c(this.observations);
                g.c(this.derivedStates);
                g.c(this.invalidations);
                this.changes.a();
                this.lateChanges.a();
                this.composer.a0();
                this.state = 1;
                i0 i0Var2 = i0.f148189a;
            } catch (Throwable th6) {
                throw th6;
            }
        }
    }

    @Override // p076m2.l0
    public void e(List<r<s2, s2>> references) {
        int size = references.size();
        boolean z15 = false;
        int i15 = 0;
        while (true) {
            if (i15 >= size) {
                z15 = true;
                break;
            } else if (!t.c(references.get(i15).c().getComposition(), this)) {
                break;
            } else {
                i15++;
            }
        }
        if (!z15) {
            t.b("Check failed");
        }
        try {
            this.composer.k(references);
            i0 i0Var = i0.f148189a;
        } catch (Throwable th4) {
            try {
                if (!this.abandonSet.isEmpty()) {
                    u uVar = this.rememberManager;
                    try {
                        uVar.r(this.abandonSet, this.composer.g0());
                        uVar.j();
                    } finally {
                        uVar.i();
                    }
                }
                throw th4;
            } catch (Throwable th5) {
                z();
                throw th5;
            }
        }
    }

    public final void e0() {
        synchronized (this.lock) {
            P();
            t0<Object, Object> t0VarC0 = c0();
            try {
                this.composer.p0(t0VarC0);
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                this.invalidations = t0VarC0;
                throw th4;
            }
        }
    }

    @Override // p076m2.l0
    public <R> R f(l0 to4, int groupIndex, er.a<? extends R> block) {
        if (to4 == null || t.c(to4, this) || groupIndex < 0) {
            return block.a();
        }
        this.invalidationDelegate = (x) to4;
        this.invalidationDelegateGroup = groupIndex;
        try {
            return block.a();
        } finally {
            this.invalidationDelegate = null;
            this.invalidationDelegateGroup = 0;
        }
    }

    @Override // p076m2.h4
    public void g(f4 scope) {
        this.pendingInvalidScopes = true;
        Y();
    }

    @Override // p076m2.u
    public void h(p<? super r, ? super Integer, i0> content) {
        boolean zG = G();
        Q();
        if (zG) {
            J(content);
        } else {
            H(content);
        }
    }

    @Override // p076m2.h4
    public s1 i(f4 scope, Object instance) {
        x xVar;
        if (scope.j()) {
            scope.F(true);
        }
        b bVarH = scope.getAnchor();
        if (bVarH == null || !bVarH.a()) {
            return s1.IGNORED;
        }
        if (!this.slotStorage.s(scope)) {
            synchronized (this.lock) {
                xVar = this.invalidationDelegate;
            }
            return (xVar == null || !xVar.d0(scope, instance)) ? s1.IGNORED : s1.IMMINENT;
        }
        if (!scope.i()) {
            return s1.IGNORED;
        }
        s1 s1VarW = W(scope, bVarH, instance);
        if (s1VarW != s1.IGNORED) {
            Y();
        }
        return s1VarW;
    }

    @Override // p076m2.u
    public void j() {
        synchronized (this.lock) {
            try {
                if (this.composer.getIsComposing()) {
                    w3.b("Composition is disposed while composing. If dispose is triggered by a call in @Composable function, consider wrapping it with SideEffect block.");
                }
                if (this.state != 3) {
                    this.state = 3;
                    this.composable = l.f122991a.c();
                    i iVarF0 = this.composer.getDeferredChanges();
                    if (iVarF0 != null) {
                        E(iVarF0);
                    }
                    boolean zIsEmpty = this.slotStorage.isEmpty();
                    if (!zIsEmpty || !this.abandonSet.isEmpty()) {
                        u uVar = this.rememberManager;
                        try {
                            uVar.r(this.abandonSet, this.composer.g0());
                            if (!zIsEmpty) {
                                this.applier.i();
                                this.slotStorage.e(this.rememberManager);
                                this.applier.clear();
                                this.applier.e();
                                uVar.m();
                            }
                            uVar.j();
                            uVar.i();
                        } catch (Throwable th4) {
                            uVar.i();
                            throw th4;
                        }
                    }
                    this.composer.b0();
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th5) {
                throw th5;
            }
        }
        this.parent.z(this);
    }

    @Override // p076m2.l0
    public boolean k() {
        synchronized (this.lock) {
            t3 t3Var = this.pendingPausedComposition;
            if (t3Var != null && !t3Var.f()) {
                t3Var.h();
                t3Var.d().l();
                return false;
            }
            N();
            try {
                t0<Object, Object> t0VarC0 = c0();
                try {
                    boolean zL0 = this.composer.l0(t0VarC0, this.shouldPause);
                    if (!zL0) {
                        O();
                    }
                    return zL0;
                } catch (Throwable th4) {
                    this.invalidations = t0VarC0;
                    throw th4;
                }
            } catch (Throwable th5) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        u uVar = this.rememberManager;
                        try {
                            uVar.r(this.abandonSet, this.composer.g0());
                            uVar.j();
                        } finally {
                            uVar.i();
                        }
                    }
                    throw th5;
                } catch (Throwable th6) {
                    z();
                    throw th6;
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059 A[LOOP:0: B:7:0x0016->B:21:0x0059, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:34:0x007d A[SYNTHETIC] */
    @Override // p076m2.l0
    public boolean l(Set<? extends Object> values) {
        if (values instanceof e) {
            h1 h1VarE = ((e) values).e();
            Object[] objArr = h1VarE.elements;
            long[] jArr = h1VarE.metadata;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i15 = 0;
                loop0: while (true) {
                    long j15 = jArr[i15];
                    if ((((~j15) << 7) & j15 & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i16 = 8 - ((~(i15 - length)) >>> 31);
                        for (int i17 = 0; i17 < i16; i17++) {
                            if ((255 & j15) < 128) {
                                Object obj = objArr[(i15 << 3) + i17];
                                if (g.f(this.observations, obj) || g.f(this.derivedStates, obj)) {
                                    break loop0;
                                }
                            }
                            j15 >>= 8;
                        }
                        if (i16 == 8) {
                            if (i15 != length) {
                                i15++;
                            }
                        }
                    } else if (i15 != length) {
                        i15++;
                    }
                }
                return true;
            }
        } else {
            for (Object obj2 : values) {
                if (g.f(this.observations, obj2) || g.f(this.derivedStates, obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // p076m2.p3
    public s3 n(p<? super r, ? super Integer, i0> content) {
        G();
        Q();
        return I(true, content);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p076m2.l0
    public void o(Set<? extends Object> values) {
        Object obj;
        Object objM;
        do {
            obj = this.pendingModifications.get();
            if (obj == null || t.c(obj, y.f123255a)) {
                objM = values;
            } else if (obj instanceof Set) {
                objM = new Set[]{obj, values};
            } else {
                if (!(obj instanceof Object[])) {
                    throw new IllegalStateException(("corrupt pendingModifications: " + this.pendingModifications).toString());
                }
                objM = pq.n.M((Set[]) obj, values);
            }
        } while (!androidx.camera.view.i.a(this.pendingModifications, obj, objM));
        if (obj == null) {
            synchronized (this.lock) {
                O();
                i0 i0Var = i0.f148189a;
            }
        }
    }

    @Override // p076m2.l0
    public void p(r2 state) {
        u uVar = this.rememberManager;
        try {
            uVar.r(this.abandonSet, this.composer.g0());
            state.getSlotStorage().k(this.rememberManager, state);
            uVar.m();
        } finally {
            uVar.i();
        }
    }

    @Override // p076m2.l0
    public void q(er.a<i0> block) {
        this.composer.k0(block);
    }

    @Override // p076m2.l0
    public void r() {
        synchronized (this.lock) {
            try {
                E(this.changes);
                O();
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                try {
                    if (!this.abandonSet.isEmpty()) {
                        u uVar = this.rememberManager;
                        try {
                            uVar.r(this.abandonSet, this.composer.g0());
                            uVar.j();
                        } finally {
                            uVar.i();
                        }
                    }
                    throw th4;
                } catch (Throwable th5) {
                    z();
                    throw th5;
                }
            }
        }
    }

    @Override // p076m2.l0
    public boolean s() {
        return this.composer.getIsComposing();
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0057 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:23:0x0059 A[Catch: all -> 0x004f, LOOP:0: B:11:0x001f->B:23:0x0059, LOOP_END, TryCatch #0 {all -> 0x004f, blocks: (B:4:0x0003, B:6:0x000e, B:8:0x0012, B:11:0x001f, B:13:0x002f, B:15:0x003b, B:17:0x0044, B:20:0x0051, B:23:0x0059, B:24:0x005c, B:25:0x0061), top: B:30:0x0003 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x0061 A[EDGE_INSN: B:33:0x0061->B:25:0x0061 BREAK  A[LOOP:0: B:11:0x001f->B:23:0x0059], SYNTHETIC] */
    @Override // p076m2.l0
    public void t(Object value) {
        synchronized (this.lock) {
            try {
                X(value);
                Object objE = this.derivedStates.e(value);
                if (objE != null) {
                    if (objE instanceof u0) {
                        u0 u0Var = (u0) objE;
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
                                            X((o0) objArr[(i15 << 3) + i17]);
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
                    } else {
                        X((o0) objE);
                    }
                }
                i0 i0Var = i0.f148189a;
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // p076m2.p3
    public s3 u(p<? super r, ? super Integer, i0> content) {
        return I(G(), content);
    }

    @Override // p076m2.y4
    public void v(p<? super r, ? super Integer, i0> content) {
        G();
        Q();
        J(content);
    }

    @Override // p076m2.u
    public boolean w() {
        boolean z15;
        synchronized (this.lock) {
            z15 = g.i(this.invalidations) > 0;
        }
        return z15;
    }

    @Override // p076m2.l0
    public e5 y(e5 shouldPause) {
        e5 e5Var = this.shouldPause;
        this.shouldPause = shouldPause;
        return e5Var;
    }

    @Override // p076m2.l0
    public void z() {
        this.pendingModifications.set(null);
        this.changes.a();
        this.lateChanges.a();
        if (this.abandonSet.isEmpty()) {
            return;
        }
        u uVar = this.rememberManager;
        try {
            uVar.r(this.abandonSet, this.composer.g0());
            uVar.j();
        } finally {
            uVar.i();
        }
    }
}
