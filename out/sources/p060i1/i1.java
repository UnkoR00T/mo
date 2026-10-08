package p060i1;

import b1.l;
import com.tom_roush.pdfbox.pdmodel.documentinterchange.taggedpdf.i;
import er.p;
import ju.p0;
import lr.m;
import oq.i0;
import oq.u;
import org.bouncycastle.asn1.cmc.BodyPartID;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import p036e4.f2;
import p036e4.g2;
import p056h1.k1;
import p056h1.l1;
import p056h1.p1;
import p056h1.r;
import p056h1.r2;
import p056h1.s2;
import p056h1.y;
import p056h1.z2;
import p071kotlin.Metadata;
import p076m2.a3;
import p076m2.c6;
import p076m2.f6;
import p076m2.m5;
import p076m2.x5;
import p076m2.y2;
import p143z0.C6466x2;
import p143z0.a2;
import p143z0.e2;
import p143z0.h2;
import p143z0.v2;
import pq.v;
import vq.k;
import w0.g0;
import w0.z1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0080\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u001b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0004\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0004«\u0001¯\u0001\b'\u0018\u00002\u00020\u0001B)\b\u0000\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tB\u001d\b\u0016\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0003\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\nJ\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u0002*\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00042\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001f\u0010 J\u001f\u0010\"\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\"\u0010#J\"\u0010&\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u0004H\u0086@¢\u0006\u0004\b&\u0010'J\u0019\u0010*\u001a\u00020\u000e*\u00020(2\u0006\u0010)\u001a\u00020\u0002¢\u0006\u0004\b*\u0010+J'\u0010.\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\u0006\u0010,\u001a\u00020\u00042\u0006\u0010-\u001a\u00020\u0018H\u0000¢\u0006\u0004\b.\u0010/J!\u00100\u001a\u00020\u000e2\b\b\u0001\u0010$\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\nJ2\u00103\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u00022\b\b\u0003\u0010%\u001a\u00020\u00042\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u000401H\u0086@¢\u0006\u0004\b3\u00104J<\u0010;\u001a\u00020\u000e2\u0006\u00106\u001a\u0002052\"\u0010:\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020(\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e08\u0012\u0006\u0012\u0004\u0018\u00010907H\u0096@¢\u0006\u0004\b;\u0010<J\u0017\u0010=\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0016¢\u0006\u0004\b=\u0010\rJ)\u0010@\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010>\u001a\u00020\u00182\b\b\u0002\u0010?\u001a\u00020\u0018H\u0000¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0018H\u0000¢\u0006\u0004\bB\u0010CJ!\u0010F\u001a\u00020\u00022\u0006\u0010E\u001a\u00020D2\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\bF\u0010GR$\u0010L\u001a\u00020\u00182\u0006\u0010H\u001a\u00020\u00188\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010CR(\u0010P\u001a\u0004\u0018\u00010\u00112\b\u0010H\u001a\u0004\u0018\u00010\u00118\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b;\u0010M\u001a\u0004\bN\u0010OR+\u0010Y\u001a\u00020Q2\u0006\u0010R\u001a\u00020Q8@@@X\u0080\u008e\u0002¢\u0006\u0012\n\u0004\bS\u0010T\u001a\u0004\bU\u0010V\"\u0004\bW\u0010XR\u0014\u0010]\u001a\u00020Z8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010\\R$\u0010b\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010aR$\u0010d\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\b=\u0010_\u001a\u0004\bc\u0010aR\"\u0010i\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bf\u0010g\u001a\u0004\bg\u0010V\"\u0004\bh\u0010XR\"\u0010m\u001a\u00020e8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bj\u0010g\u001a\u0004\bk\u0010V\"\u0004\bl\u0010XR\u0016\u0010p\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bn\u0010oR\u0016\u0010r\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bq\u0010oR\u0014\u0010u\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010tR$\u0010x\u001a\u00020\u00022\u0006\u0010H\u001a\u00020\u00028\u0000@BX\u0080\u000e¢\u0006\f\n\u0004\bv\u0010_\u001a\u0004\bw\u0010aR\u0016\u0010z\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\by\u0010_R\"\u0010\u007f\u001a\u00020\u00188\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b{\u0010J\u001a\u0004\b|\u0010C\"\u0004\b}\u0010~R\u0017\u0010\u0080\u0001\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b3\u0010_R\u001c\u0010\u0084\u0001\u001a\u0005\u0018\u00010\u0081\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001R\u0017\u0010\u0085\u0001\u001a\u00020\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010JR\u001f\u0010\u0088\u0001\u001a\t\u0012\u0004\u0012\u00020\u00110\u0086\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u0087\u0001\u0010TR)\u0010\u008f\u0001\u001a\u00030\u0089\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0017\n\u0005\b\u000f\u0010\u008a\u0001\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001\"\u0006\b\u008d\u0001\u0010\u008e\u0001R'\u0010\u0094\u0001\u001a\u00020\u00028\u0000@\u0000X\u0080\u000e¢\u0006\u0016\n\u0005\b\u0090\u0001\u0010_\u001a\u0005\b\u0091\u0001\u0010a\"\u0006\b\u0092\u0001\u0010\u0093\u0001R\u001e\u0010\u0098\u0001\u001a\u00030\u0095\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0096\u0001\u001a\u0005\bo\u0010\u0097\u0001R0\u0010\u009c\u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u001f\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010a\"\u0006\b\u009b\u0001\u0010\u0093\u0001R0\u0010\u009f\u0001\u001a\u00020\u00022\u0006\u0010R\u001a\u00020\u00028B@BX\u0082\u008e\u0002¢\u0006\u0016\n\u0005\b\u0015\u0010\u0099\u0001\u001a\u0005\b\u009d\u0001\u0010a\"\u0006\b\u009e\u0001\u0010\u0093\u0001R\u001f\u0010£\u0001\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000f\n\u0006\b \u0001\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010aR\u001d\u0010)\u001a\u00020\u00028FX\u0086\u0084\u0002¢\u0006\u000e\n\u0006\b¤\u0001\u0010¡\u0001\u001a\u0004\bJ\u0010aR \u0010ª\u0001\u001a\u00030¥\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b¦\u0001\u0010§\u0001\u001a\u0006\b¨\u0001\u0010©\u0001R\u0018\u0010®\u0001\u001a\u00030«\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010²\u0001\u001a\u00030¯\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b°\u0001\u0010±\u0001R \u0010¶\u0001\u001a\u00030³\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\b\u008b\u0001\u0010´\u0001\u001a\u0006\b¦\u0001\u0010µ\u0001R\u001f\u0010º\u0001\u001a\u00030·\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b`\u0010¸\u0001\u001a\u0006\b¤\u0001\u0010¹\u0001R\u001f\u0010¾\u0001\u001a\u00030»\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bc\u0010¼\u0001\u001a\u0006\b \u0001\u0010½\u0001R6\u0010Ä\u0001\u001a\u0005\u0018\u00010¿\u00012\t\u0010R\u001a\u0005\u0018\u00010¿\u00018@@BX\u0080\u008e\u0002¢\u0006\u0016\n\u0004\bo\u0010T\u001a\u0006\bÀ\u0001\u0010Á\u0001\"\u0006\bÂ\u0001\u0010Ã\u0001R \u0010Ê\u0001\u001a\u00030Å\u00018\u0000X\u0080\u0004¢\u0006\u0010\n\u0006\bÆ\u0001\u0010Ç\u0001\u001a\u0006\bÈ\u0001\u0010É\u0001R'\u0010Î\u0001\u001a\u00030Ë\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b\u0091\u0001\u0010g\u001a\u0005\bÌ\u0001\u0010V\"\u0005\bÍ\u0001\u0010XR\u001f\u0010Ó\u0001\u001a\u00030Ï\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\b_\u0010Ð\u0001\u001a\u0006\bÑ\u0001\u0010Ò\u0001R\u001e\u0010×\u0001\u001a\u00030Ô\u00018\u0000X\u0080\u0004¢\u0006\u000e\n\u0004\bg\u0010T\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u001f\u0010Ù\u0001\u001a\u00030Ô\u00018\u0000X\u0080\u0004¢\u0006\u000f\n\u0005\bØ\u0001\u0010T\u001a\u0006\bØ\u0001\u0010Ö\u0001R-\u0010Û\u0001\u001a\u00020\u00182\u0006\u0010R\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0013\n\u0004\bk\u0010T\u001a\u0004\b^\u0010C\"\u0005\bÚ\u0001\u0010~R.\u0010Þ\u0001\u001a\u00020\u00182\u0006\u0010R\u001a\u00020\u00188F@BX\u0086\u008e\u0002¢\u0006\u0014\n\u0005\bÜ\u0001\u0010T\u001a\u0004\b[\u0010C\"\u0005\bÝ\u0001\u0010~R\u001d\u0010à\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bß\u0001\u0010TR\u001d\u0010â\u0001\u001a\t\u0012\u0004\u0012\u00020\u00180\u0086\u00018\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\bá\u0001\u0010TR\u0016\u0010ã\u0001\u001a\u00020\u00028&X¦\u0004¢\u0006\u0007\u001a\u0005\bß\u0001\u0010aR\u0013\u0010å\u0001\u001a\u00020\u001b8F¢\u0006\u0007\u001a\u0005\b_\u0010ä\u0001R\u0016\u0010ç\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bæ\u0001\u0010aR\u0016\u0010è\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bá\u0001\u0010aR\u0016\u0010ê\u0001\u001a\u00020\u00028@X\u0080\u0004¢\u0006\u0007\u001a\u0005\bé\u0001\u0010aR\u0017\u0010í\u0001\u001a\u00020\u00048@X\u0080\u0004¢\u0006\b\u001a\u0006\bë\u0001\u0010ì\u0001R\u0012\u0010\u0003\u001a\u00020\u00028F¢\u0006\u0007\u001a\u0005\b¬\u0001\u0010aR\u0013\u0010\u0005\u001a\u00020\u00048G¢\u0006\b\u001a\u0006\b°\u0001\u0010ì\u0001R!\u0010ò\u0001\u001a\u00030î\u00018@X\u0080\u0084\u0002¢\u0006\u0010\u001a\u0006\bÜ\u0001\u0010ï\u0001*\u0006\bð\u0001\u0010ñ\u0001R\u0015\u0010ó\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bS\u0010CR\u0016\u0010ô\u0001\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0007\u001a\u0005\bÆ\u0001\u0010C¨\u0006õ\u0001"}, d2 = {"Li1/i1;", "Lz0/v2;", "", "currentPage", "", "currentPageOffsetFraction", "Lh1/z2;", "prefetchScheduler", "<init>", "(IFLh1/z2;)V", "(IF)V", "delta", "f0", "(F)F", "Loq/i0;", "s", "(Ltq/e;)Ljava/lang/Object;", "Li1/u0;", "result", "y0", "(Li1/u0;)V", "w", "(I)I", "scrollDelta", "", "b0", "(F)Z", "Li1/g0;", "info", "e0", "(FLi1/g0;)V", "v", "(Li1/g0;)V", "forward", "u", "(ZLi1/g0;)I", "page", "pageOffsetFraction", "k0", "(IFLtq/e;)Ljava/lang/Object;", "Lz0/h2;", "targetPage", "z0", "(Lz0/h2;I)V", "offsetFraction", "forceRemeasure", "w0", "(IFZ)V", "h0", "Lu0/l;", "animationSpec", "o", "(IFLu0/l;Ltq/e;)Ljava/lang/Object;", "Lw0/z1;", "scrollPriority", "Lkotlin/Function2;", "Ltq/e;", "", "block", "b", "(Lw0/z1;Ler/p;Ltq/e;)Ljava/lang/Object;", "f", "isLookingAhead", "visibleItemsStayedTheSame", "q", "(Li1/u0;ZZ)V", "c0", "()Z", "Li1/l0;", "itemProvider", "d0", "(Li1/l0;I)I", "value", "a", "Z", "getHasLookaheadOccurred$foundation", "hasLookaheadOccurred", "Li1/u0;", "getApproachLayoutInfo$foundation", "()Li1/u0;", "approachLayoutInfo", "Lm3/e;", "<set-?>", "c", "Lm2/a3;", "a0", "()J", "u0", "(J)V", "upDownDifference", "Li1/x0;", "d", "Li1/x0;", "scrollPosition", "e", "I", ip.a.f96138c, "()I", "firstVisiblePage", "E", "firstVisiblePageOffset", "", "g", "J", "setMaxScrollOffset$foundation", "maxScrollOffset", "h", i.f37094u, "setMinScrollOffset$foundation", "minScrollOffset", "i", "F", "accumulator", "j", "previousPassDelta", "k", "Lz0/v2;", "scrollableState", "l", "getLayoutWithMeasurement$foundation", "layoutWithMeasurement", "m", "layoutWithoutMeasurement", "n", "getPrefetchingEnabled$foundation", "setPrefetchingEnabled$foundation", "(Z)V", "prefetchingEnabled", "indexToPrefetch", "Lh1/l1$b;", "p", "Lh1/l1$b;", "currentPrefetchHandle", "wasPrefetchingForward", "Lm2/a3;", "r", "pagerLayoutInfoState", "Lc5/d;", "Lc5/d;", "C", "()Lc5/d;", "p0", "(Lc5/d;)V", "density", "t", i.f37087n, "setLatestPageSizeWithSpacing$foundation", "(I)V", "latestPageSizeWithSpacing", "Lb1/l;", "Lb1/l;", "()Lb1/l;", "internalInteractionSource", "Lm2/y2;", "V", "r0", "programmaticScrollTargetPage", "Y", "t0", "settledPageState", "x", "Lm2/f6;", "getSettledPage", "settledPage", "y", "Lh1/l1;", "z", "Lh1/l1;", "U", "()Lh1/l1;", "prefetchState", "i1/i1$d", "A", "Li1/i1$d;", "pagerCacheWindow", "i1/i1$a", "B", "Li1/i1$a;", "_scrollIndicatorState", "Li1/t;", "Li1/t;", "()Li1/t;", "cacheWindowLogic", "Lh1/r;", "Lh1/r;", "()Lh1/r;", "beyondBoundsInfo", "Lh1/e;", "Lh1/e;", "()Lh1/e;", "awaitLayoutModifier", "Le4/f2;", "W", "()Le4/f2;", "s0", "(Le4/f2;)V", "remeasurement", "Le4/g2;", "G", "Le4/g2;", "X", "()Le4/g2;", "remeasurementModifier", "Lc5/b;", "getPremeasureConstraints-msEJaDk$foundation", "q0", "premeasureConstraints", "Lh1/k1;", "Lh1/k1;", "R", "()Lh1/k1;", "pinnedPages", "Lh1/s2;", ip.a.f96137b, "()Lm2/a3;", "placementScopeInvalidator", "K", "measurementScopeInvalidator", "o0", "canScrollForward", "M", "n0", "canScrollBackward", "N", "isLastScrollForwardState", "O", "isLastScrollBackwardState", "pageCount", "()Li1/g0;", "layoutInfo", "Q", "pageSpacing", "pageSize", i.f37086m, "pageSizeWithSpacing", "T", "()F", "positionThresholdFraction", "Llr/i;", "()Llr/i;", "getNearestRange$foundation$delegate", "(Li1/i1;)Ljava/lang/Object;", "nearestRange", "isScrollInProgress", "lastScrolledForward", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
public abstract class i1 implements v2 {

    /* JADX INFO: renamed from: A, reason: from kotlin metadata */
    private final d pagerCacheWindow;

    /* JADX INFO: renamed from: B, reason: from kotlin metadata */
    private final a _scrollIndicatorState;

    /* JADX INFO: renamed from: C, reason: from kotlin metadata */
    private final t cacheWindowLogic;

    /* JADX INFO: renamed from: D, reason: from kotlin metadata */
    private final r beyondBoundsInfo;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final p056h1.e awaitLayoutModifier;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final a3 remeasurement;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final g2 remeasurementModifier;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private long premeasureConstraints;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final k1 pinnedPages;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final a3<i0> placementScopeInvalidator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final a3<i0> measurementScopeInvalidator;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final a3 canScrollForward;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final a3 canScrollBackward;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final a3<Boolean> isLastScrollForwardState;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final a3<Boolean> isLastScrollBackwardState;

    /* JADX INFO: renamed from: a, reason: collision with root package name and from kotlin metadata */
    private boolean hasLookaheadOccurred;

    /* JADX INFO: renamed from: b, reason: collision with root package name and from kotlin metadata */
    private u0 approachLayoutInfo;

    /* JADX INFO: renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final a3 upDownDifference;

    /* JADX INFO: renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final x0 scrollPosition;

    /* JADX INFO: renamed from: e, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePage;

    /* JADX INFO: renamed from: f, reason: collision with root package name and from kotlin metadata */
    private int firstVisiblePageOffset;

    /* JADX INFO: renamed from: g, reason: collision with root package name and from kotlin metadata */
    private long maxScrollOffset;

    /* JADX INFO: renamed from: h, reason: collision with root package name and from kotlin metadata */
    private long minScrollOffset;

    /* JADX INFO: renamed from: i, reason: collision with root package name and from kotlin metadata */
    private float accumulator;

    /* JADX INFO: renamed from: j, reason: collision with root package name and from kotlin metadata */
    private float previousPassDelta;

    /* JADX INFO: renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final v2 scrollableState;

    /* JADX INFO: renamed from: l, reason: collision with root package name and from kotlin metadata */
    private int layoutWithMeasurement;

    /* JADX INFO: renamed from: m, reason: collision with root package name and from kotlin metadata */
    private int layoutWithoutMeasurement;

    /* JADX INFO: renamed from: n, reason: collision with root package name and from kotlin metadata */
    private boolean prefetchingEnabled;

    /* JADX INFO: renamed from: o, reason: collision with root package name and from kotlin metadata */
    private int indexToPrefetch;

    /* JADX INFO: renamed from: p, reason: collision with root package name and from kotlin metadata */
    private l1.b currentPrefetchHandle;

    /* JADX INFO: renamed from: q, reason: collision with root package name and from kotlin metadata */
    private boolean wasPrefetchingForward;

    /* JADX INFO: renamed from: r, reason: collision with root package name and from kotlin metadata */
    private a3<u0> pagerLayoutInfoState;

    /* JADX INFO: renamed from: s, reason: collision with root package name and from kotlin metadata */
    private c5.d density;

    /* JADX INFO: renamed from: t, reason: collision with root package name and from kotlin metadata */
    private int latestPageSizeWithSpacing;

    /* JADX INFO: renamed from: u, reason: collision with root package name and from kotlin metadata */
    private final l internalInteractionSource;

    /* JADX INFO: renamed from: v, reason: collision with root package name and from kotlin metadata */
    private final y2 programmaticScrollTargetPage;

    /* JADX INFO: renamed from: w, reason: collision with root package name and from kotlin metadata */
    private final y2 settledPageState;

    /* JADX INFO: renamed from: x, reason: collision with root package name and from kotlin metadata */
    private final f6 settledPage;

    /* JADX INFO: renamed from: y, reason: collision with root package name and from kotlin metadata */
    private final f6 targetPage;

    /* JADX INFO: renamed from: z, reason: collision with root package name and from kotlin metadata */
    private final l1 prefetchState;

    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"i1/i1$a", "", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class a {
        a() {
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class b extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f87903d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f87904e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87905f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f87906g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f87908j;

        b(tq.e<? super b> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87906g = obj;
            this.f87908j |= PKIFailureInfo.systemUnavail;
            return i1.this.o(0, 0.0f, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class c extends k implements p<h2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87909e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private /* synthetic */ Object f87910f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f87912h;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        final /* synthetic */ float f87913j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        final /* synthetic */ u0.l<Float> f87914k;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i15, float f15, u0.l<Float> lVar, tq.e<? super c> eVar) {
            super(2, eVar);
            this.f87912h = i15;
            this.f87913j = f15;
            this.f87914k = lVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final i0 O(i1 i1Var, h2 h2Var, int i15) {
            i1Var.z0(h2Var, i15);
            return i0.f148189a;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87909e;
            if (i15 == 0) {
                u.b(obj);
                p1 p1VarA = z0.a(i1.this, (h2) this.f87910f);
                int i16 = this.f87912h;
                float f15 = this.f87913j;
                u0.l<Float> lVar = this.f87914k;
                final i1 i1Var = i1.this;
                p pVar = new p() { // from class: i1.j1
                    @Override // er.p
                    public final Object B(Object obj2, Object obj3) {
                        return i1.c.O(i1Var, (h2) obj2, ((Integer) obj3).intValue());
                    }
                };
                this.f87909e = 1;
                if (m1.f(p1VarA, i16, f15, lVar, pVar, this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super i0> eVar) {
            return ((c) v(h2Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            c cVar = i1.this.new c(this.f87912h, this.f87913j, this.f87914k, eVar);
            cVar.f87910f = obj;
            return cVar;
        }
    }

    @Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u001b\u0010\u0005\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001b\u0010\u0007\u001a\u00020\u0003*\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"i1/i1$d", "Lh1/y;", "Lc5/d;", "", "viewport", "b", "(Lc5/d;I)I", "a", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class d implements y {
        d() {
        }

        @Override // p056h1.y
        public int a(c5.d dVar, int i15) {
            return 0;
        }

        @Override // p056h1.y
        public int b(c5.d dVar, int i15) {
            return i1.this.getLatestPageSizeWithSpacing();
        }
    }

    @Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"i1/i1$e", "Le4/g2;", "Le4/f2;", "remeasurement", "Loq/i0;", "v", "(Le4/f2;)V", "foundation"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class e implements g2 {
        e() {
        }

        @Override // p036e4.g2
        public void v(f2 remeasurement) {
            i1.this.s0(remeasurement);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lju/p0;", "Loq/i0;", "<anonymous>", "(Lju/p0;)V"}, k = 3, mv = {2, 1, 0})
    static final class f extends k implements p<p0, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87917e;

        f(tq.e<? super f> eVar) {
            super(2, eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87917e;
            if (i15 == 0) {
                u.b(obj);
                i1 i1Var = i1.this;
                this.f87917e = 1;
                if (e2.e(i1Var, null, this, 1, null) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(p0 p0Var, tq.e<? super i0> eVar) {
            return ((f) v(p0Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i1.this.new f(eVar);
        }
    }

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    static final class g extends vq.d {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f87919d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        Object f87920e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        Object f87921f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        /* synthetic */ Object f87922g;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f87924j;

        g(tq.e<? super g> eVar) {
            super(eVar);
        }

        @Override // vq.a
        public final Object J(Object obj) {
            this.f87922g = obj;
            this.f87924j |= PKIFailureInfo.systemUnavail;
            return i1.j0(i1.this, null, null, this);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lz0/h2;", "Loq/i0;", "<anonymous>", "(Lz0/h2;)V"}, k = 3, mv = {2, 1, 0})
    static final class h extends k implements p<h2, tq.e<? super i0>, Object> {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f87925e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f87927g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ int f87928h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(float f15, int i15, tq.e<? super h> eVar) {
            super(2, eVar);
            this.f87927g = f15;
            this.f87928h = i15;
        }

        @Override // vq.a
        public final Object J(Object obj) throws Throwable {
            Object objE = uq.b.e();
            int i15 = this.f87925e;
            if (i15 == 0) {
                u.b(obj);
                i1 i1Var = i1.this;
                this.f87925e = 1;
                if (i1Var.s(this) == objE) {
                    return objE;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                u.b(obj);
            }
            float f15 = this.f87927g;
            double d15 = f15;
            boolean z15 = false;
            if (-0.5d <= d15 && d15 <= 0.5d) {
                z15 = true;
            }
            if (!z15) {
                c1.e.a("pageOffsetFraction " + f15 + " is not within the range -0.5 to 0.5");
            }
            i1.this.w0(i1.this.w(this.f87928h), this.f87927g, true);
            return i0.f148189a;
        }

        @Override // er.p
        /* JADX INFO: renamed from: M, reason: merged with bridge method [inline-methods] */
        public final Object B(h2 h2Var, tq.e<? super i0> eVar) {
            return ((h) v(h2Var, eVar)).J(i0.f148189a);
        }

        @Override // vq.a
        public final tq.e<i0> v(Object obj, tq.e<?> eVar) {
            return i1.this.new h(this.f87927g, this.f87928h, eVar);
        }
    }

    public i1() {
        this(0, 0.0f, null, 7, null);
    }

    private final int V() {
        return this.programmaticScrollTargetPage.d();
    }

    private final int Y() {
        return this.settledPageState.d();
    }

    private final boolean b0(float scrollDelta) {
        if (I().getOrientation() == a2.Vertical) {
            if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (a0() & BodyPartID.bodyIdMax)))) {
                return true;
            }
        } else if (Math.signum(scrollDelta) == Math.signum(-Float.intBitsToFloat((int) (a0() >> 32)))) {
            return true;
        }
        return c0();
    }

    private final void e0(float delta, g0 info) {
        l1.b bVar;
        l1.b bVar2;
        l1.b bVar3;
        if (this.prefetchingEnabled && !info.j().isEmpty()) {
            boolean z15 = delta > 0.0f;
            int iU = u(z15, info);
            if (iU < 0 || iU >= N()) {
                return;
            }
            if (iU != this.indexToPrefetch) {
                if (this.wasPrefetchingForward != z15 && (bVar3 = this.currentPrefetchHandle) != null) {
                    bVar3.cancel();
                }
                this.wasPrefetchingForward = z15;
                this.indexToPrefetch = iU;
                this.currentPrefetchHandle = l1.h(this.prefetchState, iU, this.premeasureConstraints, null, 4, null);
            }
            if (z15) {
                if ((((o) v.x0(info.j())).getOffset() + (info.getPageSize() + info.getPageSpacing())) - info.getViewportEndOffset() >= delta || (bVar2 = this.currentPrefetchHandle) == null) {
                    return;
                }
                bVar2.a();
                return;
            }
            if (info.getViewportStartOffset() - ((o) v.l0(info.j())).getOffset() >= (-delta) || (bVar = this.currentPrefetchHandle) == null) {
                return;
            }
            bVar.a();
        }
    }

    private final float f0(float delta) {
        u0 u0Var;
        long jA = y0.a(this);
        float f15 = this.accumulator + delta;
        long jF = hr.a.f(f15);
        this.accumulator = f15 - jF;
        if (Math.abs(delta) < 1.0E-4f) {
            return delta;
        }
        long j15 = jA + jF;
        long jO = m.o(j15, this.minScrollOffset, this.maxScrollOffset);
        boolean z15 = j15 != jO;
        long j16 = jO - jA;
        float f16 = j16;
        this.previousPassDelta = f16;
        if (Math.abs(j16) != 0) {
            this.isLastScrollForwardState.setValue(Boolean.valueOf(f16 > 0.0f));
            this.isLastScrollBackwardState.setValue(Boolean.valueOf(f16 < 0.0f));
        }
        int i15 = (int) j16;
        int i16 = -i15;
        u0 u0VarQ = this.pagerLayoutInfoState.getValue().q(i16);
        if (u0VarQ != null && (u0Var = this.approachLayoutInfo) != null) {
            u0 u0VarQ2 = u0Var != null ? u0Var.q(i16) : null;
            if (u0VarQ2 != null) {
                this.approachLayoutInfo = u0VarQ2;
            } else {
                u0VarQ = null;
            }
        }
        if (u0VarQ != null) {
            q(u0VarQ, this.hasLookaheadOccurred, true);
            s2.d(this.placementScopeInvalidator);
            this.layoutWithoutMeasurement++;
        } else {
            this.scrollPosition.a(i15);
            f2 f2VarW = W();
            if (f2VarW != null) {
                f2VarW.k();
            }
            this.layoutWithMeasurement++;
        }
        return (z15 ? Long.valueOf(j16) : Float.valueOf(delta)).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i0 g0(i1 i1Var, r2 r2Var) {
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        er.l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
        c3.l lVarE = companion.e(lVarD);
        try {
            r2Var.a(i1Var.firstVisiblePage);
            i0 i0Var = i0.f148189a;
            return i0.f148189a;
        } finally {
            companion.l(lVarD, lVarE, lVarG);
        }
    }

    public static /* synthetic */ void i0(i1 i1Var, int i15, float f15, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: requestScrollToPage");
        }
        if ((i16 & 2) != 0) {
            f15 = 0.0f;
        }
        i1Var.h0(i15, f15);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
    
        if (r8.b(r6, r7, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    static /* synthetic */ java.lang.Object j0(p060i1.i1 r5, w0.z1 r6, er.p<? super p143z0.h2, ? super tq.e<? super oq.i0>, ? extends java.lang.Object> r7, tq.e<? super oq.i0> r8) throws java.lang.Throwable {
        /*
            boolean r0 = r8 instanceof i1.i1.g
            if (r0 == 0) goto L13
            r0 = r8
            i1.i1$g r0 = (i1.i1.g) r0
            int r1 = r0.f87924j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f87924j = r1
            goto L18
        L13:
            i1.i1$g r0 = new i1.i1$g
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f87922g
            java.lang.Object r1 = uq.b.e()
            int r2 = r0.f87924j
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L4a
            if (r2 == r4) goto L38
            if (r2 != r3) goto L30
            java.lang.Object r5 = r0.f87919d
            i1.i1 r5 = (p060i1.i1) r5
            oq.u.b(r8)
            goto L7b
        L30:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L38:
            java.lang.Object r5 = r0.f87921f
            r7 = r5
            er.p r7 = (er.p) r7
            java.lang.Object r5 = r0.f87920e
            r6 = r5
            w0.z1 r6 = (w0.z1) r6
            java.lang.Object r5 = r0.f87919d
            i1.i1 r5 = (p060i1.i1) r5
            oq.u.b(r8)
            goto L5c
        L4a:
            oq.u.b(r8)
            r0.f87919d = r5
            r0.f87920e = r6
            r0.f87921f = r7
            r0.f87924j = r4
            java.lang.Object r8 = r5.s(r0)
            if (r8 != r1) goto L5c
            goto L7a
        L5c:
            boolean r8 = r5.c()
            if (r8 != 0) goto L69
            int r8 = r5.A()
            r5.t0(r8)
        L69:
            z0.v2 r8 = r5.scrollableState
            r0.f87919d = r5
            r2 = 0
            r0.f87920e = r2
            r0.f87921f = r2
            r0.f87924j = r3
            java.lang.Object r6 = r8.b(r6, r7, r0)
            if (r6 != r1) goto L7b
        L7a:
            return r1
        L7b:
            r6 = -1
            r5.r0(r6)
            oq.i0 r5 = oq.i0.f148189a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: p060i1.i1.j0(i1.i1, w0.z1, er.p, tq.e):java.lang.Object");
    }

    public static /* synthetic */ Object l0(i1 i1Var, int i15, float f15, tq.e eVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: scrollToPage");
        }
        if ((i16 & 2) != 0) {
            f15 = 0.0f;
        }
        return i1Var.k0(i15, f15, eVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m0(i1 i1Var, float f15) {
        return i1Var.f0(f15);
    }

    private final void n0(boolean z15) {
        this.canScrollBackward.setValue(Boolean.valueOf(z15));
    }

    private final void o0(boolean z15) {
        this.canScrollForward.setValue(Boolean.valueOf(z15));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object p(i1 i1Var, int i15, float f15, u0.l lVar, tq.e eVar, int i16, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: animateScrollToPage");
        }
        if ((i16 & 2) != 0) {
            f15 = 0.0f;
        }
        if ((i16 & 4) != 0) {
            lVar = u0.m.j(0.0f, 0.0f, null, 7, null);
        }
        return i1Var.o(i15, f15, lVar, eVar);
    }

    public static /* synthetic */ void r(i1 i1Var, u0 u0Var, boolean z15, boolean z16, int i15, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: applyMeasureResult");
        }
        if ((i15 & 4) != 0) {
            z16 = false;
        }
        i1Var.q(u0Var, z15, z16);
    }

    private final void r0(int i15) {
        this.programmaticScrollTargetPage.g(i15);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object s(tq.e<? super i0> eVar) {
        Object objR;
        return (this.pagerLayoutInfoState.getValue() == m1.m() && (objR = this.awaitLayoutModifier.r(eVar)) == uq.b.e()) ? objR : i0.f148189a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void s0(f2 f2Var) {
        this.remeasurement.setValue(f2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int t(i1 i1Var) {
        return i1Var.N();
    }

    private final void t0(int i15) {
        this.settledPageState.g(i15);
    }

    private final int u(boolean forward, g0 info) {
        if (!forward) {
            return (((o) v.l0(info.j())).getIndex() - info.getBeyondViewportPageCount()) - 1;
        }
        int beyondViewportPageCount = info.getBeyondViewportPageCount() + 1;
        if (beyondViewportPageCount < 0) {
            return Integer.MAX_VALUE;
        }
        return ((o) v.x0(info.j())).getIndex() + beyondViewportPageCount;
    }

    private final void v(g0 info) {
        if (this.indexToPrefetch == -1 || info.j().isEmpty()) {
            return;
        }
        if (this.indexToPrefetch != u(this.wasPrefetchingForward, info)) {
            this.indexToPrefetch = -1;
            l1.b bVar = this.currentPrefetchHandle;
            if (bVar != null) {
                bVar.cancel();
            }
            this.currentPrefetchHandle = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int v0(i1 i1Var) {
        return i1Var.c() ? i1Var.Y() : i1Var.A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int w(int i15) {
        if (N() > 0) {
            return m.n(i15, 0, N() - 1);
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int x0(i1 i1Var) {
        int iA;
        if (!i1Var.c()) {
            iA = i1Var.A();
        } else if (i1Var.V() != -1) {
            iA = i1Var.V();
        } else if (Math.abs(i1Var.B()) >= Math.abs(i1Var.T())) {
            iA = i1Var.G() ? i1Var.firstVisiblePage + 1 : i1Var.firstVisiblePage;
        } else {
            iA = i1Var.A();
        }
        return i1Var.w(iA);
    }

    private final void y0(u0 result) {
        c3.l.Companion companion = c3.l.INSTANCE;
        c3.l lVarD = companion.d();
        er.l<Object, i0> lVarG = lVarD != null ? lVarD.g() : null;
        c3.l lVarE = companion.e(lVarD);
        try {
            if (this.prefetchingEnabled) {
                if (result.getBeyondViewportPageCount() >= N()) {
                    return;
                }
                if (Math.abs(this.previousPassDelta) <= 0.5f) {
                    return;
                }
                if (b0(this.previousPassDelta)) {
                    if (g0.isCacheWindowForPagerEnabled) {
                        this.cacheWindowLogic.C(this.previousPassDelta, result);
                    } else {
                        e0(this.previousPassDelta, result);
                    }
                    i0 i0Var = i0.f148189a;
                }
            }
        } finally {
            companion.l(lVarD, lVarE, lVarG);
        }
    }

    public final int A() {
        return this.scrollPosition.b();
    }

    public final float B() {
        return this.scrollPosition.c();
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final c5.d getDensity() {
        return this.density;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final int getFirstVisiblePage() {
        return this.firstVisiblePage;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final int getFirstVisiblePageOffset() {
        return this.firstVisiblePageOffset;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final l getInternalInteractionSource() {
        return this.internalInteractionSource;
    }

    public boolean G() {
        return this.isLastScrollForwardState.getValue().booleanValue();
    }

    /* JADX INFO: renamed from: H, reason: from getter */
    public final int getLatestPageSizeWithSpacing() {
        return this.latestPageSizeWithSpacing;
    }

    public final g0 I() {
        return this.pagerLayoutInfoState.getValue();
    }

    /* JADX INFO: renamed from: J, reason: from getter */
    public final long getMaxScrollOffset() {
        return this.maxScrollOffset;
    }

    public final a3<i0> K() {
        return this.measurementScopeInvalidator;
    }

    /* JADX INFO: renamed from: L, reason: from getter */
    public final long getMinScrollOffset() {
        return this.minScrollOffset;
    }

    public final lr.i M() {
        return this.scrollPosition.getNearestRangeState().getValue();
    }

    public abstract int N();

    public final int O() {
        return this.pagerLayoutInfoState.getValue().getPageSize();
    }

    public final int P() {
        return O() + Q();
    }

    public final int Q() {
        return this.pagerLayoutInfoState.getValue().getPageSpacing();
    }

    /* JADX INFO: renamed from: R, reason: from getter */
    public final k1 getPinnedPages() {
        return this.pinnedPages;
    }

    public final a3<i0> S() {
        return this.placementScopeInvalidator;
    }

    public final float T() {
        return Math.min(this.density.l2(m1.l()), O() / 2.0f) / O();
    }

    /* JADX INFO: renamed from: U, reason: from getter */
    public final l1 getPrefetchState() {
        return this.prefetchState;
    }

    public final f2 W() {
        return (f2) this.remeasurement.getValue();
    }

    /* JADX INFO: renamed from: X, reason: from getter */
    public final g2 getRemeasurementModifier() {
        return this.remeasurementModifier;
    }

    public final int Z() {
        return ((Number) this.targetPage.getValue()).intValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final long a0() {
        return ((m3.e) this.upDownDifference.getValue()).getPackedValue();
    }

    @Override // p143z0.v2
    public Object b(z1 z1Var, p<? super h2, ? super tq.e<? super i0>, ? extends Object> pVar, tq.e<? super i0> eVar) {
        return j0(this, z1Var, pVar, eVar);
    }

    @Override // p143z0.v2
    public boolean c() {
        return this.scrollableState.c();
    }

    public final boolean c0() {
        return ((int) Float.intBitsToFloat((int) (a0() >> 32))) == 0 && ((int) Float.intBitsToFloat((int) (a0() & BodyPartID.bodyIdMax))) == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p143z0.v2
    public final boolean d() {
        return ((Boolean) this.canScrollBackward.getValue()).booleanValue();
    }

    public final int d0(l0 itemProvider, int currentPage) {
        return this.scrollPosition.e(itemProvider, currentPage);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // p143z0.v2
    public final boolean e() {
        return ((Boolean) this.canScrollForward.getValue()).booleanValue();
    }

    @Override // p143z0.v2
    public float f(float delta) {
        return this.scrollableState.f(delta);
    }

    public final void h0(int page, float pageOffsetFraction) {
        if (c()) {
            ju.k.d(this.pagerLayoutInfoState.getValue().getCoroutineScope(), null, null, new f(null), 3, null);
        }
        w0(page, pageOffsetFraction, false);
    }

    public final Object k0(int i15, float f15, tq.e<? super i0> eVar) {
        Object objA = v2.a(this, null, new h(f15, i15, null), eVar, 1, null);
        return objA == uq.b.e() ? objA : i0.f148189a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b9, code lost:
    
        if (p143z0.v2.a(r11, null, r3, r4, 1, null) == r0) goto L40;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object o(int r12, float r13, u0.l<java.lang.Float> r14, tq.e<? super oq.i0> r15) throws java.lang.Throwable {
        /*
            r11 = this;
            boolean r0 = r15 instanceof i1.i1.b
            if (r0 == 0) goto L14
            r0 = r15
            i1.i1$b r0 = (i1.i1.b) r0
            int r1 = r0.f87908j
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f87908j = r1
        L12:
            r4 = r0
            goto L1a
        L14:
            i1.i1$b r0 = new i1.i1$b
            r0.<init>(r15)
            goto L12
        L1a:
            java.lang.Object r15 = r4.f87906g
            java.lang.Object r0 = uq.b.e()
            int r1 = r4.f87908j
            r2 = 2
            r3 = 1
            if (r1 == 0) goto L44
            if (r1 == r3) goto L37
            if (r1 != r2) goto L2f
            oq.u.b(r15)
            goto Lbc
        L2f:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L37:
            float r13 = r4.f87904e
            int r12 = r4.f87903d
            java.lang.Object r14 = r4.f87905f
            u0.l r14 = (u0.l) r14
            oq.u.b(r15)
        L42:
            r9 = r14
            goto L6e
        L44:
            oq.u.b(r15)
            int r15 = r11.A()
            if (r12 != r15) goto L56
            float r15 = r11.B()
            int r15 = (r15 > r13 ? 1 : (r15 == r13 ? 0 : -1))
            if (r15 != 0) goto L56
            goto L5c
        L56:
            int r15 = r11.N()
            if (r15 != 0) goto L5f
        L5c:
            oq.i0 r12 = oq.i0.f148189a
            return r12
        L5f:
            r4.f87905f = r14
            r4.f87903d = r12
            r4.f87904e = r13
            r4.f87908j = r3
            java.lang.Object r15 = r11.s(r4)
            if (r15 != r0) goto L42
            goto Lbb
        L6e:
            double r14 = (double) r13
            r5 = -4620693217682128896(0xbfe0000000000000, double:-0.5)
            int r1 = (r5 > r14 ? 1 : (r5 == r14 ? 0 : -1))
            r5 = 0
            if (r1 > 0) goto L7d
            r6 = 4602678819172646912(0x3fe0000000000000, double:0.5)
            int r14 = (r14 > r6 ? 1 : (r14 == r6 ? 0 : -1))
            if (r14 > 0) goto L7d
            goto L7e
        L7d:
            r3 = r5
        L7e:
            if (r3 != 0) goto L99
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            r14.<init>()
            java.lang.String r15 = "pageOffsetFraction "
            r14.append(r15)
            r14.append(r13)
            java.lang.String r15 = " is not within the range -0.5 to 0.5"
            r14.append(r15)
            java.lang.String r14 = r14.toString()
            c1.e.a(r14)
        L99:
            int r7 = r11.w(r12)
            int r12 = r11.P()
            float r12 = (float) r12
            float r8 = r13 * r12
            i1.i1$c r3 = new i1.i1$c
            r10 = 0
            r6 = r11
            r5 = r3
            r5.<init>(r7, r8, r9, r10)
            r12 = 0
            r4.f87905f = r12
            r4.f87908j = r2
            r2 = 0
            r5 = 1
            r6 = 0
            r1 = r11
            java.lang.Object r12 = p143z0.v2.a(r1, r2, r3, r4, r5, r6)
            if (r12 != r0) goto Lbc
        Lbb:
            return r0
        Lbc:
            oq.i0 r12 = oq.i0.f148189a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: p060i1.i1.o(int, float, u0.l, tq.e):java.lang.Object");
    }

    public final void p0(c5.d dVar) {
        this.density = dVar;
    }

    public final void q(u0 result, boolean isLookingAhead, boolean visibleItemsStayedTheSame) {
        this.prefetchState.j(result.j().size());
        this.latestPageSizeWithSpacing = result.getPageSize() + result.getPageSpacing();
        if (!isLookingAhead && this.hasLookaheadOccurred) {
            this.approachLayoutInfo = result;
            return;
        }
        if (isLookingAhead) {
            this.hasLookaheadOccurred = true;
        }
        if (visibleItemsStayedTheSame) {
            this.scrollPosition.j(result.getCurrentPageOffsetFraction());
        } else {
            this.scrollPosition.k(result);
            if (!g0.isCacheWindowForPagerEnabled) {
                v(result);
            } else if (this.prefetchingEnabled) {
                this.cacheWindowLogic.D(result);
            }
        }
        this.pagerLayoutInfoState.setValue(result);
        o0(result.getCanScrollForward());
        n0(result.r());
        n firstVisiblePage = result.getFirstVisiblePage();
        if (firstVisiblePage != null) {
            this.firstVisiblePage = firstVisiblePage.getIndex();
        }
        this.firstVisiblePageOffset = result.getFirstVisiblePageScrollOffset();
        y0(result);
        this.maxScrollOffset = m1.j(result, N());
        this.minScrollOffset = m.k(m1.k(result, N()), this.maxScrollOffset);
    }

    public final void q0(long j15) {
        this.premeasureConstraints = j15;
    }

    public final void u0(long j15) {
        this.upDownDifference.setValue(m3.e.d(j15));
    }

    public final void w0(int page, float offsetFraction, boolean forceRemeasure) {
        if (this.scrollPosition.b() != page || this.scrollPosition.c() != offsetFraction) {
            this.cacheWindowLogic.x();
        }
        this.scrollPosition.f(page, offsetFraction);
        if (!forceRemeasure) {
            s2.d(this.measurementScopeInvalidator);
            return;
        }
        f2 f2VarW = W();
        if (f2VarW != null) {
            f2VarW.k();
        }
    }

    /* JADX INFO: renamed from: x, reason: from getter */
    public final p056h1.e getAwaitLayoutModifier() {
        return this.awaitLayoutModifier;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final r getBeyondBoundsInfo() {
        return this.beyondBoundsInfo;
    }

    /* JADX INFO: renamed from: z, reason: from getter */
    public final t getCacheWindowLogic() {
        return this.cacheWindowLogic;
    }

    public final void z0(h2 h2Var, int i15) {
        r0(w(i15));
    }

    public i1(int i15, float f15, z2 z2Var) {
        double d15 = f15;
        boolean z15 = false;
        if (-0.5d <= d15 && d15 <= 0.5d) {
            z15 = true;
        }
        if (!z15) {
            c1.e.a("currentPageOffsetFraction " + f15 + " is not within the range -0.5 to 0.5");
        }
        this.upDownDifference = c6.e(m3.e.d(m3.e.INSTANCE.c()), null, 2, null);
        x0 x0Var = new x0(i15, f15, this);
        this.scrollPosition = x0Var;
        this.firstVisiblePage = i15;
        this.maxScrollOffset = Long.MAX_VALUE;
        this.scrollableState = C6466x2.b(new er.l() { // from class: i1.d1
            @Override // er.l
            public final Object b(Object obj) {
                return Float.valueOf(i1.m0(this.f87836a, ((Float) obj).floatValue()));
            }
        });
        this.prefetchingEnabled = true;
        this.indexToPrefetch = -1;
        this.pagerLayoutInfoState = x5.i(m1.m(), x5.k());
        this.density = m1.f87961b;
        this.internalInteractionSource = b1.k.a();
        this.programmaticScrollTargetPage = m5.a(-1);
        this.settledPageState = m5.a(i15);
        this.settledPage = x5.e(x5.r(), new er.a() { // from class: i1.e1
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(i1.v0(this.f87839a));
            }
        });
        this.targetPage = x5.e(x5.r(), new er.a() { // from class: i1.f1
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(i1.x0(this.f87845a));
            }
        });
        l1 l1Var = new l1(z2Var, new er.l() { // from class: i1.g1
            @Override // er.l
            public final Object b(Object obj) {
                return i1.g0(this.f87847a, (r2) obj);
            }
        });
        this.prefetchState = l1Var;
        d dVar = new d();
        this.pagerCacheWindow = dVar;
        this._scrollIndicatorState = new a();
        this.cacheWindowLogic = new t(dVar, l1Var, new er.a() { // from class: i1.h1
            @Override // er.a
            public final Object a() {
                return Integer.valueOf(i1.t(this.f87868a));
            }
        });
        this.beyondBoundsInfo = new r();
        this.awaitLayoutModifier = new p056h1.e();
        this.remeasurement = c6.e(null, null, 2, null);
        this.remeasurementModifier = new e();
        this.premeasureConstraints = c5.c.b(0, 0, 0, 0, 15, null);
        this.pinnedPages = new k1();
        x0Var.getNearestRangeState();
        this.placementScopeInvalidator = s2.c(null, 1, null);
        this.measurementScopeInvalidator = s2.c(null, 1, null);
        Boolean bool = Boolean.FALSE;
        this.canScrollForward = c6.e(bool, null, 2, null);
        this.canScrollBackward = c6.e(bool, null, 2, null);
        this.isLastScrollForwardState = c6.e(bool, null, 2, null);
        this.isLastScrollBackwardState = c6.e(bool, null, 2, null);
    }

    public /* synthetic */ i1(int i15, float f15, z2 z2Var, int i16, fr.k kVar) {
        this((i16 & 1) != 0 ? 0 : i15, (i16 & 2) != 0 ? 0.0f : f15, (i16 & 4) != 0 ? null : z2Var);
    }

    public i1(int i15, float f15) {
        this(i15, f15, null);
    }
}
